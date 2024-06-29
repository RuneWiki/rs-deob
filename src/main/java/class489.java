import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class489 implements Runnable {

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
    private int field7049 = 0;

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
    private int field7050 = 0;

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
    private int field7043;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field7040;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "[B")
    private byte[] field7051;

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field7054;

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "[[I")
    public static int[][] field7046 = new int[128][128];

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "Ljava/io/IOException;")
    private IOException field7041;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V", line = 9)
    public static void method2976(int arg0) {
        field7046 = null;
        if (arg0 != 128) {
            method2982(99, 75);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V", line = 23)
    public final void method2977(byte arg0) {
        field7052++;
        synchronized (this) {
            if (this.field7041 == null) {
                this.field7041 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field7054.join();
            if (arg0 != -26) {
                this.run();
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!pda", name = "run", descriptor = "()V", line = 47)
    public final void run() {
        field7042++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field7041 != null) {
                        return;
                    }
                    if (this.field7049 == 0) {
                        var2 = this.field7043 - this.field7050 - 1;
                    } else if (this.field7050 > this.field7049) {
                        var2 = this.field7043 - this.field7050;
                    } else {
                        var2 = this.field7049 - this.field7050 - 1;
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
                var3 = this.field7040.read(this.field7051, this.field7050, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field7041 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field7050 = (this.field7050 + var3) % this.field7043;
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(B)V", line = 105)
    public final void method2978(byte arg0) {
        this.field7040 = new class370();
        field7048++;
        if (arg0 != 66) {
            this.method2978((byte) 32);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(II[BZ)I", line = 117)
    public final int method2979(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field7053++;
        if (arg0 < 0 || arg1 < 0 || arg2.length < arg0 + arg1) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field7050 < this.field7049) {
                var6 = this.field7043 + this.field7050 - this.field7049;
            } else {
                var6 = this.field7050 - this.field7049;
            }
            if (arg0 > var6) {
                arg0 = var6;
            }
            if (arg0 == 0 && this.field7041 != null) {
                throw new IOException(this.field7041.toString());
            } else if (arg3) {
                if ((this.field7049 + arg0) <= this.field7043) {
                    class85.method683(this.field7051, this.field7049, arg2, arg1, arg0);
                } else {
                    int var8 = this.field7043 - this.field7049;
                    class85.method683(this.field7051, this.field7049, arg2, arg1, var8);
                    class85.method683(this.field7051, 0, arg2, arg1 + var8, arg0 - var8);
                }
                this.field7049 = (this.field7049 + arg0) % this.field7043;
                this.notifyAll();
                return arg0;
            } else {
                return 41;
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZI)Z", line = 160)
    public final boolean method2980(boolean arg0, int arg1) throws IOException {
        field7045++;
        if (arg1 <= 0 || this.field7043 <= arg1) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field7050 >= this.field7049) {
                var4 = this.field7050 - this.field7049;
            } else {
                var4 = this.field7043 + this.field7050 - this.field7049;
            }
            if (var4 >= arg1) {
                if (arg0) {
                    this.method2978((byte) -43);
                }
                return true;
            } else if (this.field7041 == null) {
                return false;
            } else {
                throw new IOException(this.field7041.toString());
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 258)
    public class489(InputStream arg0, int arg1) {
        this.field7043 = arg1 + 1;
        this.field7040 = arg0;
        this.field7051 = new byte[this.field7043];
        this.field7054 = new Thread(this);
        this.field7054.setDaemon(true);
        this.field7054.start();
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([ILkw;II[IB)Ltq;", line = 201)
    public static final class512 method2981(int[] arg0, class346 arg1, int arg2, int arg3, int[] arg4, byte arg5) {
        field7044++;
        byte[] var6 = new byte[arg2 * arg3];
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg3 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg5 != -105) {
            field7046 = null;
        }
        return new class512(arg1, arg3, arg2, var6);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)S", line = 233)
    public static final short method2982(int arg0, int arg1) {
        field7047++;
        int var2 = (arg0 & 0xFCBE) >> 10;
        int var3 = arg0 >> 3 & 0x70;
        int var4 = arg0 & arg1;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }
}
