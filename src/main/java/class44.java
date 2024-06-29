import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class44 implements Runnable {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Z")
    private boolean field1003 = false;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Z")
    private boolean field1007 = false;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    private int field1024 = 0;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    private int field1031 = 0;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field1009;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "Ls;")
    private class105 field1028;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Ljava/io/InputStream;")
    private InputStream field1016;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1027;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field1005 = 0;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "Lva;")
    private static class121 field1022 = class107.method797("Loading friend list", -10983);

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Lva;")
    private static class121 field1017 = class107.method797("New User", -10983);

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Lva;")
    public static class121 field1023 = class107.method797("huffman", -10983);

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Lva;")
    public static class121 field1026 = field1017;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lva;")
    public static class121 field1015 = field1022;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "Lva;")
    private static class121 field1032 = class107.method797("Loaded title screen", -10983);

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lva;")
    private static class121 field1008 = class107.method797("green:", -10983);

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lva;")
    public static class121 field1006 = field1032;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Lva;")
    public static class121 field1025 = field1008;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "Lfa;")
    private class32 field1029;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "[B")
    private byte[] field1021;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "[I")
    public static int[] field1013;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "[Lm;")
    public static class72[] field1012;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)I", line = 16)
    public final int method291(boolean arg0) throws IOException {
        field1002++;
        if (this.field1003) {
            return 0;
        } else {
            if (arg0) {
                this.finalize();
            }
            return this.field1016.available();
        }
    }

    @OriginalMember(owner = "client!hb", name = "finalize", descriptor = "()V", line = 30)
    protected final void finalize() {
        field1011++;
        this.method293(-2);
    }

    @OriginalMember(owner = "client!hb", name = "run", descriptor = "()V", line = 44)
    public final void run() {
        field1014++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1031 == this.field1024) {
                        if (this.field1003) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1024;
                    if (this.field1031 >= this.field1024) {
                        var3 = this.field1031 - this.field1024;
                    } else {
                        var3 = 5000 - this.field1024;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1027.write(this.field1021, var2, var3);
                    } catch (IOException var9) {
                        this.field1007 = true;
                    }
                    this.field1024 = (this.field1024 + var3) % 5000;
                    try {
                        if (this.field1031 == this.field1024) {
                            this.field1027.flush();
                        }
                    } catch (IOException var8) {
                        this.field1007 = true;
                    }
                }
            }
            try {
                if (this.field1016 != null) {
                    this.field1016.close();
                }
                if (this.field1027 != null) {
                    this.field1027.close();
                }
                if (this.field1009 != null) {
                    this.field1009.close();
                }
            } catch (IOException var7) {
            }
            this.field1021 = null;
        } catch (Exception var12) {
            class119.method920(true, null, var12);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI[BI)V", line = 116)
    public final void method292(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1030++;
        if (this.field1003) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field1016.read(arg2, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg3 += var5;
        }
        if (arg0 != 32) {
            this.method293(-89);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 153)
    public final void method293(int arg0) {
        field1019++;
        if (this.field1003) {
            return;
        }
        if (arg0 != -2) {
            this.method293(90);
        }
        synchronized (this) {
            this.field1003 = true;
            this.notifyAll();
        }
        if (this.field1029 != null) {
            while (this.field1029.field795 == 0) {
                class113.method833(1L, true);
            }
            if (this.field1029.field795 == 1) {
                try {
                    ((Thread) this.field1029.field800).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1029 = null;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Ljava/net/Socket;Ls;)V", line = 343)
    public class44(Socket arg0, class105 arg1) throws IOException {
        this.field1009 = arg0;
        this.field1028 = arg1;
        this.field1009.setSoTimeout(30000);
        this.field1009.setTcpNoDelay(true);
        this.field1016 = this.field1009.getInputStream();
        this.field1027 = this.field1009.getOutputStream();
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 206)
    public static void method294(int arg0) {
        field1026 = null;
        field1012 = null;
        field1032 = null;
        field1008 = null;
        field1006 = null;
        field1025 = null;
        field1022 = null;
        field1017 = null;
        field1023 = null;
        field1015 = null;
        field1013 = null;
        if (arg0 != 0) {
            field1032 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)I", line = 245)
    public final int method295(int arg0) throws IOException {
        if (arg0 != 5000) {
            field1026 = null;
        }
        field1020++;
        return this.field1003 ? 0 : this.field1016.read();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([BIIZ)V", line = 277)
    public final void method296(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field1010++;
        if (this.field1003) {
            return;
        }
        if (this.field1007) {
            this.field1007 = false;
            throw new IOException();
        }
        if (this.field1021 == null) {
            this.field1021 = new byte[5000];
        }
        synchronized (this) {
            if (arg3) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    this.field1021[this.field1031] = arg0[arg2 + var6];
                    this.field1031 = (this.field1031 + 1) % 5000;
                    if ((this.field1024 + 4900) % 5000 == this.field1031) {
                        throw new IOException();
                    }
                }
                if (this.field1029 == null) {
                    this.field1029 = this.field1028.method780(this, 0, 3);
                }
                this.notifyAll();
            }
        }
    }
}
