import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class626 implements Runnable {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    private int field8880 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Z")
    private boolean field8879 = false;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    private int field8889 = 0;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Z")
    private boolean field8892 = false;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field8891;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Lcea;")
    private class111 field8897;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Ljava/io/InputStream;")
    private InputStream field8900;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field8881;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    private int field8894;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field8887 = 0;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "[I")
    public static int[] field8905 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Ltl;")
    public static class141 field8885 = new class141(0, 0);

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "Lhia;")
    public static class49 field8906;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lot;")
    private class746 field8896;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Ljf;")
    public static class781 field8901;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "[B")
    private byte[] field8888;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[BII)V")
    public final void method3579(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field8895++;
        if (this.field8892) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field8900.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
        if (arg2 != 0) {
            method3580(null);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lda;)V")
    public static final void method3580(class443 arg0) {
        class203.field3004 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public final void method3581(int arg0) {
        field8884++;
        if (this.field8892) {
            return;
        }
        synchronized (this) {
            this.field8892 = true;
            this.notifyAll();
            int var3 = -70 / ((arg0 + 63) / 43);
        }
        if (this.field8896 != null) {
            while (this.field8896.field10365 == 0) {
                class579.method3405(1L, 10);
            }
            if (this.field8896.field10365 == 1) {
                try {
                    ((Thread) this.field8896.field10371).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field8896 = null;
    }

    @OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method3581(-109);
        field8882++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)I")
    public final int method3582(byte arg0) throws IOException {
        field8903++;
        if (arg0 != -108) {
            field8893 = -35;
        }
        return this.field8892 ? 0 : this.field8900.read();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZII[B)V")
    public final void method3583(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field8886++;
        if (this.field8892) {
            return;
        }
        if (this.field8879) {
            this.field8879 = false;
            throw new IOException();
        }
        if (this.field8888 == null) {
            this.field8888 = new byte[this.field8894];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field8888[this.field8880] = arg3[arg2 + var6];
                this.field8880 = (this.field8880 + 1) % this.field8894;
                if (((this.field8889 - (100 - this.field8894)) % this.field8894) == this.field8880) {
                    throw new IOException();
                }
            }
            if (this.field8896 == null) {
                this.field8896 = this.field8897.method918(-6, 3, this);
            }
            if (!arg0) {
                this.field8900 = null;
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public final void method3584(byte arg0) throws IOException {
        if (arg0 != -32) {
            return;
        }
        field8898++;
        if (!this.field8892 && this.field8879) {
            this.field8879 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLfm;)V")
    public static final void method3585(boolean arg0, class281 arg1) {
        if (!arg0) {
            field8893 = -126;
        }
        if (arg1 instanceof class506) {
            class506 var2 = (class506) arg1;
            if (var2.field6964 != null) {
                class699.method3919(var2, 3707, class719.field10041.field10361 != var2.field10361);
            }
        } else if (arg1 instanceof class21) {
            class21 var3 = (class21) arg1;
            class98.method802((byte) 63, var3, class719.field10041.field10361 != var3.field10361);
        }
        field8890++;
    }

    @OriginalMember(owner = "client!ed", name = "run", descriptor = "()V")
    public final void run() {
        field8902++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field8889 == this.field8880) {
                        if (this.field8892) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field8880 < this.field8889) {
                        var2 = this.field8894 - this.field8889;
                    } else {
                        var2 = this.field8880 - this.field8889;
                    }
                    var3 = this.field8889;
                }
                if (var2 > 0) {
                    try {
                        this.field8881.write(this.field8888, var3, var2);
                    } catch (IOException var9) {
                        this.field8879 = true;
                    }
                    this.field8889 = (this.field8889 + var2) % this.field8894;
                    try {
                        if (this.field8889 == this.field8880) {
                            this.field8881.flush();
                        }
                    } catch (IOException var8) {
                        this.field8879 = true;
                    }
                }
            }
            try {
                if (this.field8900 != null) {
                    this.field8900.close();
                }
                if (this.field8881 != null) {
                    this.field8881.close();
                }
                if (this.field8891 != null) {
                    this.field8891.close();
                }
            } catch (IOException var7) {
            }
            this.field8888 = null;
        } catch (Exception var12) {
            class349.method2122(var12, null, 1);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)I")
    public final int method3586(boolean arg0) throws IOException {
        if (!arg0) {
            this.field8889 = 123;
        }
        field8904++;
        return this.field8892 ? 0 : this.field8900.available();
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public final void method3587(int arg0) {
        field8883++;
        if (this.field8892) {
            return;
        }
        if (arg0 != -1263) {
            this.field8889 = -45;
        }
        this.field8900 = new class262();
        this.field8881 = new class424();
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
    public static void method3588(boolean arg0) {
        field8906 = null;
        if (arg0) {
            method3585(false, null);
        }
        field8901 = null;
        field8905 = null;
        field8885 = null;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/net/Socket;Lcea;I)V")
    public class626(Socket arg0, class111 arg1, int arg2) throws IOException {
        this.field8891 = arg0;
        this.field8897 = arg1;
        this.field8891.setSoTimeout(30000);
        this.field8891.setTcpNoDelay(true);
        this.field8900 = this.field8891.getInputStream();
        this.field8881 = this.field8891.getOutputStream();
        this.field8894 = arg2;
    }
}
