import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class510 implements Runnable {

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    private int field6803 = 0;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    private int field6799 = 0;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6808;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    private int field6810;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[B")
    private byte[] field6801;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field6805;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "S")
    public static short field6809 = 1;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
    private static int[] field6800 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Ljava/io/IOException;")
    private IOException field6813;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "[[[J")
    public static long[][][] field6812;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 5)
    public final void method2829(int arg0) {
        this.field6808 = new class378();
        if (arg0 == 1) {
            field6807++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 17)
    public static void method2830(int arg0) {
        if (arg0 != 8) {
            method2832(null, -102);
        }
        field6812 = null;
        field6800 = null;
    }

    @OriginalMember(owner = "client!nd", name = "run", descriptor = "()V", line = 33)
    public final void run() {
        field6804++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field6813 != null) {
                        return;
                    }
                    if (this.field6799 >= this.field6803) {
                        var2 = this.field6799 - this.field6803;
                    } else {
                        var2 = this.field6810 + this.field6799 - this.field6803;
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
            try {
                if (this.field6803 + var2 <= this.field6810) {
                    this.field6808.write(this.field6801, this.field6803, var2);
                } else {
                    int var3 = this.field6810 - this.field6803;
                    this.field6808.write(this.field6801, this.field6803, var3);
                    this.field6808.write(this.field6801, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field6813 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field6803 = (this.field6803 + var2) % this.field6810;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 205)
    public class510(OutputStream arg0, int arg1) {
        this.field6808 = arg0;
        this.field6810 = arg1 + 1;
        this.field6801 = new byte[this.field6810];
        this.field6805 = new Thread(this);
        this.field6805.setDaemon(true);
        this.field6805.start();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 103)
    public final void method2831(byte arg0) {
        synchronized (this) {
            if (this.field6813 == null) {
                this.field6813 = new IOException("");
            }
            this.notifyAll();
        }
        field6797++;
        try {
            this.field6805.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 >= -46) {
            field6812 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Leh;I)Lqfa;", line = 130)
    public static final class88 method2832(class335 arg0, int arg1) {
        int var2 = 60 / ((1 - arg1) / 58);
        field6802++;
        return new class88(arg0.method2022(-29089), arg0.method2022(-29089), arg0.method2022(-29089), arg0.method2022(-29089), arg0.method2042((byte) 53), arg0.method2034(255));
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)I", line = 145)
    public static final int method2833(int arg0, int arg1, int arg2) {
        field6811++;
        if (arg0 < 116) {
            method2833(87, -9, 5);
        }
        return arg2 == 1 || arg2 == 3 ? class513.field6857[arg1 & 0x3] : field6800[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[BZI)V", line = 160)
    public final void method2834(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        if (!arg2) {
            this.field6805 = null;
        }
        field6798++;
        if (arg0 < 0 || arg3 < 0 || (arg3 + arg0) > arg1.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field6813 != null) {
                throw new IOException(this.field6813.toString());
            }
            int var6;
            if (this.field6799 < this.field6803) {
                var6 = this.field6803 - this.field6799 - 1;
            } else {
                var6 = this.field6810 - (this.field6799 - (this.field6803 - 1));
            }
            if (var6 < arg0) {
                throw new IOException("");
            }
            if ((this.field6799 + arg0) > this.field6810) {
                int var7 = this.field6810 - this.field6799;
                class83.method686(arg1, arg3, this.field6801, this.field6799, var7);
                class83.method686(arg1, arg3 + var7, this.field6801, 0, arg0 - var7);
            } else {
                class83.method686(arg1, arg3, this.field6801, this.field6799, arg0);
            }
            this.field6799 = (this.field6799 + arg0) % this.field6810;
            this.notifyAll();
        }
    }
}
