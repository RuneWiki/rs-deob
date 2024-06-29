import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class302 implements Runnable {

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
    private int field3954 = 0;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    private int field3948 = 0;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field3944;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    private int field3947;

    @OriginalMember(owner = "client!nba", name = "q", descriptor = "[B")
    private byte[] field3960;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field3946;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "Lhg;")
    public static class693 field3950 = new class693(22, 8);

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "Lria;")
    public static class288 field3957 = null;

    @OriginalMember(owner = "client!nba", name = "p", descriptor = "[F")
    public static float[] field3959 = new float[4];

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "[I")
    public static int[] field3961 = new int[3];

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "Ljava/io/IOException;")
    private IOException field3952;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
    public final void method1798(byte arg0) {
        field3949++;
        synchronized (this) {
            if (this.field3952 == null) {
                this.field3952 = new IOException("");
            }
            this.notifyAll();
        }
        if (arg0 != -18) {
            this.field3960 = null;
        }
        try {
            this.field3946.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!nba", name = "run", descriptor = "()V")
    public final void run() {
        field3945++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3952 != null) {
                        return;
                    }
                    if (this.field3954 == 0) {
                        var2 = this.field3947 - (this.field3948 + 1);
                    } else if (this.field3948 <= this.field3954) {
                        var2 = this.field3954 - this.field3948 - 1;
                    } else {
                        var2 = this.field3947 - this.field3948;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            int var3;
            try {
                var3 = this.field3944.read(this.field3960, this.field3948, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3952 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3948 = (this.field3948 + var3) % this.field3947;
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(B)V")
    public final void method1799(byte arg0) {
        if (arg0 <= 56) {
            this.method1798((byte) -20);
        }
        this.field3944 = new class122();
        field3958++;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "([BIII)I")
    public final int method1800(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3956++;
        if (arg1 < arg3 || arg2 < 0 || arg0.length < arg2 + arg1) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field3948 >= this.field3954) {
                var6 = this.field3948 - this.field3954;
            } else {
                var6 = this.field3948 + this.field3947 - this.field3954;
            }
            if (arg1 > var6) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field3952 != null) {
                throw new IOException(this.field3952.toString());
            }
            if (this.field3947 >= this.field3954 + arg1) {
                class135.method999(this.field3960, this.field3954, arg0, arg2, arg1);
            } else {
                int var7 = this.field3947 - this.field3954;
                class135.method999(this.field3960, this.field3954, arg0, arg2, var7);
                class135.method999(this.field3960, 0, arg0, arg2 + var7, arg1 - var7);
            }
            this.field3954 = (this.field3954 + arg1) % this.field3947;
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Z")
    public final boolean method1801(int arg0, int arg1) throws IOException {
        field3951++;
        if (arg0 <= 0 || arg0 >= this.field3947) {
            throw new IOException();
        }
        synchronized (this) {
            int var4 = 84 % ((arg1 - 37) / 55);
            int var5;
            if (this.field3954 <= this.field3948) {
                var5 = this.field3948 - this.field3954;
            } else {
                var5 = this.field3947 + this.field3948 - this.field3954;
            }
            if (arg0 <= var5) {
                return true;
            } else if (this.field3952 == null) {
                return false;
            } else {
                throw new IOException(this.field3952.toString());
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1802(byte[] arg0, int arg1) {
        if (arg1 != -19451) {
            method1802(null, -30);
        }
        field3953++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class135.method999(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
    public static void method1803(int arg0) {
        if (arg0 == -1) {
            field3950 = null;
            field3957 = null;
            field3959 = null;
            field3961 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(BIIII)V")
    public static final void method1804(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -63) {
            field3961 = null;
        }
        if (class667.field9373 <= arg4 && class225.field2994 >= arg4) {
            int var5 = class720.method4025(class546.field7619, arg2, class760.field10606, 0);
            int var6 = class720.method4025(class546.field7619, arg3, class760.field10606, 0);
            class108.method872(arg4, true, arg1, var6, var5);
        }
        field3955++;
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class302(InputStream arg0, int arg1) {
        this.field3944 = arg0;
        this.field3947 = arg1 + 1;
        this.field3960 = new byte[this.field3947];
        this.field3946 = new Thread(this);
        this.field3946.setDaemon(true);
        this.field3946.start();
    }
}
