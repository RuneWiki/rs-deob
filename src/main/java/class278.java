import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class278 implements Runnable {

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    private int field3760 = 0;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    private int field3755 = 0;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    private int field3758;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field3753;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "[B")
    private byte[] field3764;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field3757;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "Ljj;")
    public static class398 field3754 = new class398(3, -1);

    @OriginalMember(owner = "client!np", name = "m", descriptor = "Lcb;")
    public static class318 field3763 = new class318(70, 1);

    @OriginalMember(owner = "client!np", name = "o", descriptor = "[I")
    public static int[] field3765 = new int[4096];

    @OriginalMember(owner = "client!np", name = "p", descriptor = "Lfca;")
    public static class188 field3766 = null;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "Lil;")
    public static class598 field3769;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "Ljava/io/IOException;")
    private IOException field3767;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "[[B")
    public static byte[][] field3768;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public final void method1684(int arg0) {
        synchronized (this) {
            if (this.field3767 == null) {
                this.field3767 = new IOException("");
            }
            this.notifyAll();
        }
        field3762++;
        try {
            if (arg0 != -14641) {
                method1687(-14, 90, 29);
            }
            this.field3757.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
    public static void method1685(byte arg0) {
        field3768 = null;
        field3769 = null;
        field3766 = null;
        field3754 = null;
        field3765 = null;
        if (arg0 <= 81) {
            method1685((byte) 39);
        }
        field3763 = null;
    }

    @OriginalMember(owner = "client!np", name = "run", descriptor = "()V")
    public final void run() {
        field3761++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3767 != null) {
                        return;
                    }
                    if (this.field3760 == 0) {
                        var2 = this.field3758 - this.field3755 - 1;
                    } else if (this.field3755 > this.field3760) {
                        var2 = this.field3758 - this.field3755;
                    } else {
                        var2 = this.field3760 - this.field3755 - 1;
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
                var3 = this.field3753.read(this.field3764, this.field3755, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3767 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3755 = (this.field3755 + var3) % this.field3758;
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
    public final void method1686(int arg0) {
        if (arg0 >= 89) {
            field3751++;
            this.field3753 = new class627();
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Z")
    public static final boolean method1687(int arg0, int arg1, int arg2) {
        field3756++;
        if (arg2 != 0) {
            method1687(0, 72, 84);
        }
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III[B)I")
    public final int method1688(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3752++;
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg3.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field3760 <= this.field3755) {
                var6 = this.field3755 - this.field3760;
            } else {
                var6 = this.field3758 + this.field3755 - this.field3760;
            }
            if (arg2 > var6) {
                arg2 = var6;
            }
            if (arg2 == 0 && this.field3767 != null) {
                throw new IOException(this.field3767.toString());
            }
            if (this.field3760 + arg2 <= this.field3758) {
                class657.method3639(this.field3764, this.field3760, arg3, arg1, arg2);
            } else {
                int var7 = this.field3758 - this.field3760;
                class657.method3639(this.field3764, this.field3760, arg3, arg1, var7);
                class657.method3639(this.field3764, 0, arg3, arg1 + var7, -var7 + arg2);
            }
            this.field3760 = (this.field3760 + arg2) % this.field3758;
            if (arg0 > -110) {
                method1687(116, 84, 80);
            }
            this.notifyAll();
            return arg2;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI)Z")
    public final boolean method1689(boolean arg0, int arg1) throws IOException {
        field3759++;
        if (!arg0) {
            method1687(92, -103, -30);
        }
        if (arg1 <= 0 || arg1 >= this.field3758) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field3755 < this.field3760) {
                var4 = this.field3758 + this.field3755 - this.field3760;
            } else {
                var4 = this.field3755 - this.field3760;
            }
            if (arg1 <= var4) {
                return true;
            } else if (this.field3767 == null) {
                return false;
            } else {
                throw new IOException(this.field3767.toString());
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class278(InputStream arg0, int arg1) {
        this.field3758 = arg1 + 1;
        this.field3753 = arg0;
        this.field3764 = new byte[this.field3758];
        this.field3757 = new Thread(this);
        this.field3757.setDaemon(true);
        this.field3757.start();
    }
}
