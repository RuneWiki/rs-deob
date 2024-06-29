import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class608 implements Runnable {

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Z")
    private boolean field8597 = false;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Z")
    private boolean field8595 = false;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    private int field8579 = 0;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    private int field8590 = 0;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lpe;")
    private class556 field8588;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Ljava/net/Socket;")
    private Socket field8593;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field8582;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field8591;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "[I")
    public static int[] field8592 = new int[6];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field8584;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lsba;")
    private class199 field8589;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lwda;")
    public static class582 field8585;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "[B")
    private byte[] field8601;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V", line = 10)
    public static final void method3388(int arg0, int arg1) {
        field8596++;
        class274.field3473 = arg1;
        class653 var2 = class416.field5522;
        synchronized (class416.field5522) {
            class416.field5522.method3687((byte) -10);
            int var3 = 30 / ((-arg0 - 37) / 56);
        }
        class653 var4 = class84.field896;
        synchronized (class84.field896) {
            class84.field896.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 27)
    public final void method3389(int arg0) throws IOException {
        field8599++;
        if (this.field8597) {
            return;
        }
        if (arg0 != 3) {
            this.field8590 = 101;
        }
        if (this.field8595) {
            this.field8595 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[BII)V", line = 51)
    public final void method3390(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field8587++;
        if (this.field8597) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field8582.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
        if (arg2 != 0) {
            method3388(24, -96);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 75)
    public final void method3391(int arg0) {
        field8584++;
        if (this.field8597) {
            return;
        }
        int var2 = 111 / ((arg0 + 59) / 38);
        synchronized (this) {
            this.field8597 = true;
            this.notifyAll();
        }
        if (this.field8589 != null) {
            while (this.field8589.field2437 == 0) {
                class370.method2025(-1, 1L);
            }
            if (this.field8589.field2437 == 1) {
                try {
                    ((Thread) this.field8589.field2434).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field8589 = null;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V", line = 112)
    public static void method3392(int arg0) {
        if (arg0 == -23503) {
            field8585 = null;
            field8592 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "finalize", descriptor = "()V", line = 124)
    protected final void finalize() {
        this.method3391(-126);
        field8598++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 134)
    public static final boolean method3393(String arg0, byte arg1) {
        if (arg1 != 18) {
            method3388(116, 9);
        }
        field8581++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class210.field2549; var2++) {
            if (arg0.equalsIgnoreCase(class314.field4077[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class377.field4914.field6324);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)I", line = 166)
    public final int method3394(byte arg0) throws IOException {
        field8583++;
        if (this.field8597) {
            return 0;
        } else {
            int var2 = -128 % ((arg0 - 9) / 41);
            return this.field8582.read();
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)I", line = 180)
    public final int method3395(byte arg0) throws IOException {
        field8600++;
        if (arg0 != 85) {
            this.field8590 = 20;
        }
        return this.field8597 ? 0 : this.field8582.available();
    }

    @OriginalMember(owner = "client!ua", name = "run", descriptor = "()V", line = 194)
    public final void run() {
        field8580++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field8590 == this.field8579) {
                        if (this.field8597) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field8579;
                    if (this.field8590 >= this.field8579) {
                        var3 = this.field8590 - this.field8579;
                    } else {
                        var3 = 5000 - this.field8579;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field8591.write(this.field8601, var2, var3);
                    } catch (IOException var9) {
                        this.field8595 = true;
                    }
                    this.field8579 = (this.field8579 + var3) % 5000;
                    try {
                        if (this.field8590 == this.field8579) {
                            this.field8591.flush();
                        }
                    } catch (IOException var8) {
                        this.field8595 = true;
                    }
                }
            }
            try {
                if (this.field8582 != null) {
                    this.field8582.close();
                }
                if (this.field8591 != null) {
                    this.field8591.close();
                }
                if (this.field8593 != null) {
                    this.field8593.close();
                }
            } catch (IOException var7) {
            }
            this.field8601 = null;
        } catch (Exception var12) {
            class150.method824(15, var12, null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V", line = 265)
    public final void method3396(byte arg0) {
        field8578++;
        int var2 = 121 / ((89 - arg0) / 35);
        if (!this.field8597) {
            this.field8582 = new class220();
            this.field8591 = new class17();
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/net/Socket;Lpe;)V", line = 351)
    public class608(Socket arg0, class556 arg1) throws IOException {
        this.field8588 = arg1;
        this.field8593 = arg0;
        this.field8593.setSoTimeout(30000);
        this.field8593.setTcpNoDelay(true);
        this.field8582 = this.field8593.getInputStream();
        this.field8591 = this.field8593.getOutputStream();
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([BIII)V", line = 287)
    public final void method3397(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field8586++;
        if (this.field8597) {
            return;
        }
        if (this.field8595) {
            this.field8595 = false;
            throw new IOException();
        }
        if (this.field8601 == null) {
            this.field8601 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field8601[this.field8590] = arg0[arg1 + var6];
                this.field8590 = (this.field8590 + 1) % 5000;
                if ((this.field8579 + 4900) % 5000 == this.field8590) {
                    throw new IOException();
                }
            }
            if (this.field8589 == null) {
                this.field8589 = this.field8588.method3138(this, arg2 + 96, 3);
            }
            if (arg2 != 6) {
                this.method3396((byte) 103);
            }
            this.notifyAll();
        }
    }
}
