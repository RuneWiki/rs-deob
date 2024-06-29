import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class233 {

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    private int field3860 = 0;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "J")
    private long field3865 = -1L;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "J")
    private long field3873 = -1L;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Laf;")
    private class18 field3871;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "J")
    private long field3862;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "J")
    private long field3872;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "J")
    private long field3868;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "[B")
    private byte[] field3877;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "[B")
    private byte[] field3870;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "[J")
    public static long[] field3876 = new long[256];

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3881;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    private int field3861;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "J")
    private long field3864;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "Lfb;")
    public static class251 field3880;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Ljava/io/File;", line = 4)
    private final File method1792(int arg0) {
        field3869++;
        if (arg0 != 0) {
            this.field3872 = -102L;
        }
        return this.field3871.method99((byte) -105);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([BB)V", line = 15)
    public final void method1793(byte[] arg0, byte arg1) throws IOException {
        if (arg1 <= 114) {
            method1795(false);
        }
        field3857++;
        this.method1798(-12264, arg0, arg0.length, 0);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(JB)V", line = 28)
    public final void method1794(long arg0, byte arg1) throws IOException {
        field3875++;
        if (arg1 < 67) {
            return;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1792(0));
        }
        this.field3868 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 46)
    public static void method1795(boolean arg0) {
        field3880 = null;
        field3881 = null;
        field3876 = null;
        if (arg0) {
            field3876 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI[BI)V", line = 59)
    public final void method1796(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3879++;
        try {
            if (arg0 < -60) {
                if (this.field3872 < ((long) arg3 + this.field3868)) {
                    this.field3872 = this.field3868 + ((long) arg3);
                }
                if (this.field3873 != -1L && (this.field3868 < this.field3873 || ((long) this.field3860 + this.field3873) < this.field3868)) {
                    this.method1800(122);
                }
                if (this.field3873 != -1L && this.field3873 + ((long) this.field3877.length) < (long) arg3 + this.field3868) {
                    int var5 = (int) (this.field3873 + (long) this.field3877.length - this.field3868);
                    class242.method1841(arg2, arg1, this.field3877, (int) (this.field3868 - this.field3873), var5);
                    arg3 -= var5;
                    arg1 += var5;
                    this.field3868 += (long) var5;
                    this.field3860 = this.field3877.length;
                    this.method1800(98);
                }
                if (this.field3877.length < arg3) {
                    if (this.field3868 != this.field3864) {
                        this.field3871.method102(0, this.field3868);
                        this.field3864 = this.field3868;
                    }
                    this.field3871.method104((byte) 41, arg3, arg2, arg1);
                    long var6 = -1L;
                    this.field3864 += (long) arg3;
                    long var8 = -1L;
                    if (this.field3868 >= this.field3865 && (long) this.field3861 + this.field3865 > this.field3868) {
                        var6 = this.field3868;
                    } else if (this.field3868 <= this.field3865 && this.field3865 < (long) arg3 + this.field3868) {
                        var6 = this.field3865;
                    }
                    if (((long) arg3 + this.field3868) > this.field3865 && (long) arg3 + this.field3868 <= (long) this.field3861 + this.field3865) {
                        var8 = (long) arg3 + this.field3868;
                    } else if ((long) this.field3861 + this.field3865 > this.field3868 && ((long) this.field3861 + this.field3865) <= (this.field3868 + ((long) arg3))) {
                        var8 = (long) this.field3861 + this.field3865;
                    }
                    if (this.field3862 < this.field3864) {
                        this.field3862 = this.field3864;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class242.method1841(arg2, (int) (var6 + (long) arg1 - this.field3868), this.field3870, (int) (var6 - this.field3865), var10);
                    }
                    this.field3868 += (long) arg3;
                } else if (arg3 > 0) {
                    if (this.field3873 == -1L) {
                        this.field3873 = this.field3868;
                    }
                    class242.method1841(arg2, arg1, this.field3877, (int) (this.field3868 - this.field3873), arg3);
                    this.field3868 += (long) arg3;
                    if (((long) this.field3860) < (this.field3868 - this.field3873)) {
                        this.field3860 = (int) (this.field3868 - this.field3873);
                    }
                }
            }
        } catch (IOException var12) {
            this.field3864 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)J", line = 194)
    public final long method1797(int arg0) {
        if (arg0 != 256) {
            method1795(true);
        }
        field3867++;
        return this.field3872;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[BII)V", line = 208)
    public final void method1798(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3858++;
        try {
            if (arg1.length < arg3 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg1.length);
            }
            if (arg0 != -12264) {
                this.method1792(21);
            }
            if (this.field3873 != -1L && this.field3868 >= this.field3873 && ((long) arg2 + this.field3868) <= ((long) this.field3860 + this.field3873)) {
                class242.method1841(this.field3877, (int) (this.field3868 - this.field3873), arg1, arg3, arg2);
                this.field3868 += (long) arg2;
                return;
            }
            long var5 = this.field3868;
            int var7 = arg3;
            int var8 = arg2;
            if (this.field3868 >= this.field3865 && this.field3868 < (long) this.field3861 + this.field3865) {
                int var9 = (int) (this.field3865 + (long) this.field3861 - this.field3868);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class242.method1841(this.field3870, (int) (this.field3868 - this.field3865), arg1, arg3, var9);
                arg2 -= var9;
                this.field3868 += (long) var9;
                arg3 += var9;
            }
            if (this.field3870.length < arg2) {
                this.field3871.method102(0, this.field3868);
                this.field3864 = this.field3868;
                while (arg2 > 0) {
                    int var10 = this.field3871.method103(-1, arg1, arg3, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3864 += (long) var10;
                    arg3 += var10;
                    this.field3868 += (long) var10;
                    arg2 -= var10;
                }
            } else if (arg2 > 0) {
                int var11 = arg2;
                this.method1799(arg0 ^ 0x2FE7);
                if (this.field3861 < arg2) {
                    var11 = this.field3861;
                }
                class242.method1841(this.field3870, 0, arg1, arg3, var11);
                this.field3868 += (long) var11;
                arg2 -= var11;
                arg3 += var11;
            }
            if (this.field3873 != -1L) {
                if (this.field3868 < this.field3873 && arg2 > 0) {
                    int var12 = (int) (this.field3873 - this.field3868) + arg3;
                    if (var12 > (arg2 + arg3)) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg3) {
                        arg2--;
                        arg1[arg3++] = 0;
                        this.field3868++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 < ((long) this.field3860 + this.field3873) && ((long) var8 + var5) >= ((long) this.field3860 + this.field3873)) {
                    var15 = (long) this.field3860 + this.field3873;
                } else if (this.field3873 < (long) var8 + var5 && (long) var8 + var5 <= this.field3873 - -((long) this.field3860)) {
                    var15 = var5 + ((long) var8);
                }
                if (var5 <= this.field3873 && this.field3873 < (long) var8 + var5) {
                    var13 = this.field3873;
                } else if (var5 >= this.field3873 && (this.field3873 + ((long) this.field3860)) > var5) {
                    var13 = var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class242.method1841(this.field3877, (int) (var13 - this.field3873), arg1, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field3868) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field3868));
                        this.field3868 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3864 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V", line = 396)
    private final void method1799(int arg0) throws IOException {
        this.field3861 = 0;
        if (arg0 != -1) {
            method1795(true);
        }
        if (this.field3868 != this.field3864) {
            this.field3871.method102(0, this.field3868);
            this.field3864 = this.field3868;
        }
        field3866++;
        this.field3865 = this.field3868;
        while (this.field3870.length > this.field3861) {
            int var2 = this.field3870.length - this.field3861;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3871.method103(-1, this.field3870, this.field3861, var2);
            if (var3 == -1) {
                break;
            }
            this.field3864 += (long) var3;
            this.field3861 += var3;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V", line = 438)
    private final void method1800(int arg0) throws IOException {
        if (this.field3873 != -1L) {
            if (this.field3873 != this.field3864) {
                this.field3871.method102(0, this.field3873);
                this.field3864 = this.field3873;
            }
            this.field3871.method104((byte) 41, this.field3860, this.field3877, 0);
            this.field3864 += (long) this.field3860;
            long var2 = -1L;
            if (this.field3864 > this.field3862) {
                this.field3862 = this.field3864;
            }
            long var4 = -1L;
            if (this.field3865 < (long) this.field3860 + this.field3873 && ((long) this.field3861 + this.field3865) >= ((long) this.field3860 + this.field3873)) {
                var2 = (long) this.field3860 + this.field3873;
            } else if (this.field3873 < (long) this.field3861 + this.field3865 && this.field3865 + ((long) this.field3861) <= (long) this.field3860 + this.field3873) {
                var2 = this.field3865 + ((long) this.field3861);
            }
            if (this.field3873 >= this.field3865 && (long) this.field3861 + this.field3865 > this.field3873) {
                var4 = this.field3873;
            } else if (this.field3865 >= this.field3873 && this.field3865 < (long) this.field3860 + this.field3873) {
                var4 = this.field3865;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class242.method1841(this.field3877, (int) (var4 - this.field3873), this.field3870, (int) (var4 - this.field3865), var6);
            }
            this.field3873 = -1L;
            this.field3860 = 0;
        }
        int var7 = 97 % ((arg0 + 2) / 63);
        field3863++;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Laf;II)V", line = 615)
    public class233(class18 arg0, int arg1, int arg2) throws IOException {
        this.field3871 = arg0;
        this.field3872 = this.field3862 = arg0.method100(false);
        this.field3868 = 0L;
        this.field3877 = new byte[arg2];
        this.field3870 = new byte[arg1];
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILth;Lth;)I", line = 546)
    public static final int method1801(int arg0, class57 arg1, class57 arg2) {
        field3874++;
        if (arg0 < 37) {
            method1801(-67, (class57) null, (class57) null);
        }
        int var3 = 0;
        if (arg1.method452(class234.field3887, (byte) -127)) {
            var3++;
        }
        if (arg1.method452(class109.field1799, (byte) -125)) {
            var3++;
        }
        if (arg1.method452(class57.field977, (byte) -118)) {
            var3++;
        }
        if (arg2.method452(class234.field3887, (byte) -122)) {
            var3++;
        }
        if (arg2.method452(class109.field1799, (byte) 3)) {
            var3++;
        }
        if (arg2.method452(class57.field977, (byte) -124)) {
            var3++;
        }
        return var3;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3876[var0] = var1;
        }
        field3881 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBIII)V", line = 636)
    public static final void method1802(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class321 var5 = class46.method370(8, (byte) -106, arg0);
        field3878++;
        var5.method2265(false);
        if (arg1 != 13) {
            method1802(52, (byte) 22, -116, 46, -96);
        }
        var5.field5109 = arg3;
        var5.field5101 = arg4;
        var5.field5112 = arg2;
    }
}
