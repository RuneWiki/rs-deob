import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class45 implements Runnable {

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    private int field952 = 0;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Z")
    private boolean field948 = false;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Z")
    private boolean field949 = false;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    private int field955 = 0;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field945;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "Lbb;")
    private class9 field964;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Ljava/io/InputStream;")
    private InputStream field960;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field943;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static volatile int field942 = 0;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lo;")
    public static class84 field950 = class15.method124("May", 255);

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field965 = -1;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field962 = -1;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lle;")
    public static class71 field947 = new class71();

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "Lo;")
    public static class84 field969 = class15.method124(" @gre@", 255);

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public static int field970 = 0;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "Lo;")
    public static class84 field972 = class15.method124("Create a free account", 255);

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "Lo;")
    public static class84 field971 = class15.method124("@red@", 255);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Lqd;")
    private class98 field953;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "[B")
    private byte[] field956;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB[B)V", line = 3)
    public final void method390(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if (arg2 < 57) {
            field969 = null;
        }
        field968++;
        if (this.field948) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field960.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I", line = 30)
    public final int method391(int arg0) throws IOException {
        field967++;
        if (this.field948) {
            return 0;
        } else if (arg0 == 0) {
            return this.field960.read();
        } else {
            return -73;
        }
    }

    @OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V", line = 44)
    protected final void finalize() {
        this.method395(-9098);
        field958++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V", line = 54)
    public static final void method392(byte arg0, String arg1, Throwable arg2) {
        if (arg0 < 21) {
            method398(true);
        }
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class75.method562(arg2, (byte) -51);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class98 var8 = class48.field1012.method85((byte) -52, new URL(class48.field1012.field187.getCodeBase(), "clienterror.ws?c=" + class50.field1080 + "&u=" + class122.field2735 + "&v1=" + class9.field183 + "&v2=" + class9.field175 + "&e=" + var7));
            while (var8.field2091 == 0) {
                class113.method873(true, 1L);
            }
            if (var8.field2091 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2093;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
        field951++;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)I", line = 105)
    public final int method393(int arg0) throws IOException {
        field966++;
        if (arg0 != 0) {
            field965 = 42;
        }
        return this.field948 ? 0 : this.field960.available();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lo;I)Z", line = 130)
    public static final boolean method394(class84 arg0, int arg1) {
        if (arg1 != -20281) {
            method394(null, -69);
        }
        field961++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class27.field537; var2++) {
            if (arg0.method669(class60.field1256[var2], true)) {
                return true;
            }
        }
        return arg0.method669(class107.field2271.field1312, true);
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ljava/net/Socket;Lbb;)V", line = 385)
    public class45(Socket arg0, class9 arg1) throws IOException {
        this.field945 = arg0;
        this.field964 = arg1;
        this.field945.setSoTimeout(30000);
        this.field945.setTcpNoDelay(true);
        this.field960 = this.field945.getInputStream();
        this.field943 = this.field945.getOutputStream();
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V", line = 187)
    public final void method395(int arg0) {
        field957++;
        if (this.field948) {
            return;
        }
        synchronized (this) {
            this.field948 = true;
            this.notifyAll();
        }
        if (arg0 != -9098) {
            return;
        }
        if (this.field953 != null) {
            while (this.field953.field2091 == 0) {
                class113.method873(true, 1L);
            }
            if (this.field953.field2091 == 1) {
                try {
                    ((Thread) this.field953.field2093).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field953 = null;
    }

    @OriginalMember(owner = "client!hc", name = "run", descriptor = "()V", line = 230)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field955 == this.field952) {
                            if (this.field948) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field955 < this.field952) {
                            var2 = 5000 - this.field952;
                        } else {
                            var2 = this.field955 - this.field952;
                        }
                        var3 = this.field952;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field943.write(this.field956, var3, var2);
                    } catch (IOException var9) {
                        this.field949 = true;
                    }
                    this.field952 = (this.field952 + var2) % 5000;
                    try {
                        if (this.field955 == this.field952) {
                            this.field943.flush();
                        }
                    } catch (IOException var8) {
                        this.field949 = true;
                    }
                    continue;
                }
                try {
                    if (this.field960 != null) {
                        this.field960.close();
                    }
                    if (this.field943 != null) {
                        this.field943.close();
                    }
                    if (this.field945 != null) {
                        this.field945.close();
                    }
                } catch (IOException var7) {
                }
                this.field956 = null;
                break;
            }
        } catch (Exception var12) {
            method392((byte) 96, null, var12);
        }
        field963++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([BIIZ)V", line = 303)
    public final void method396(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field941++;
        if (!arg3 || this.field948) {
            return;
        }
        if (this.field949) {
            this.field949 = false;
            throw new IOException();
        }
        if (this.field956 == null) {
            this.field956 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field956[this.field955] = arg0[arg2 + var6];
                this.field955 = (this.field955 + 1) % 5000;
                if ((this.field952 + 4900) % 5000 == this.field955) {
                    throw new IOException();
                }
            }
            if (this.field953 == null) {
                this.field953 = this.field964.method83(3, this, (byte) 31);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLud;II)Lvb;", line = 364)
    public static final class121 method397(byte arg0, class118 arg1, int arg2, int arg3) {
        field940++;
        if (class111.method863(arg3, -29446, arg1, arg2)) {
            if (arg0 >= -126) {
                field947 = null;
            }
            return class103.method773((byte) -57);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 402)
    public static void method398(boolean arg0) {
        field950 = null;
        if (arg0) {
            field972 = null;
            field971 = null;
            field969 = null;
            field947 = null;
        }
    }
}
