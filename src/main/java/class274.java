import java.awt.Canvas;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class274 {

    @OriginalMember(owner = "client!et", name = "g", descriptor = "J")
    private long field3893 = -1L;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    private int field3897 = 0;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "J")
    private long field3903 = -1L;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "Lwj;")
    private class11 field3896;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "J")
    private long field3891;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "J")
    private long field3910;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "[B")
    private byte[] field3895;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "J")
    private long field3890;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "[B")
    private byte[] field3909;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "Lsd;")
    public static class74 field3887 = new class74(1, 2);

    @OriginalMember(owner = "client!et", name = "t", descriptor = "[J")
    public static long[] field3906 = new long[256];

    @OriginalMember(owner = "client!et", name = "s", descriptor = "I")
    public static int field3905 = -1;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "Z")
    public static boolean field3911;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    private int field3899;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "J")
    private long field3902;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "Loj;")
    public static class280 field3912;

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
            field3906[var0] = var1;
        }
        field3911 = false;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V", line = 16)
    private final void method1642(byte arg0) throws IOException {
        field3900++;
        if (this.field3893 != -1L) {
            if (this.field3902 != this.field3893) {
                this.field3896.method85(0, this.field3893);
                this.field3902 = this.field3893;
            }
            this.field3896.method87(this.field3909, this.field3897, 0, 104);
            this.field3902 += (long) this.field3897;
            if (this.field3891 < this.field3902) {
                this.field3891 = this.field3902;
            }
            long var2 = -1L;
            if (this.field3903 <= this.field3893 && ((long) this.field3899 + this.field3903) > this.field3893) {
                var2 = this.field3893;
            } else if (this.field3903 >= this.field3893 && ((long) this.field3897 + this.field3893) > this.field3903) {
                var2 = this.field3903;
            }
            long var4 = -1L;
            if (((long) this.field3897 + this.field3893) > this.field3903 && (long) this.field3899 + this.field3903 >= (long) this.field3897 + this.field3893) {
                var4 = (long) this.field3897 + this.field3893;
            } else if (this.field3893 < (long) this.field3899 + this.field3903 && ((long) this.field3897 + this.field3893) >= ((long) this.field3899 + this.field3903)) {
                var4 = this.field3903 + ((long) this.field3899);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class268.method1625(this.field3909, (int) (var2 - this.field3893), this.field3895, (int) (var2 - this.field3903), var6);
            }
            this.field3897 = 0;
            this.field3893 = -1L;
        }
        if (arg0 <= 63) {
            this.field3910 = 83L;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)J", line = 98)
    public final long method1643(int arg0) {
        field3894++;
        return arg0 == -99216864 ? this.field3910 : -72L;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V", line = 112)
    public static void method1644(int arg0) {
        field3887 = null;
        if (arg0 != 12027) {
            field3912 = null;
        }
        field3906 = null;
        field3912 = null;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lwj;II)V", line = 597)
    public class274(class11 arg0, int arg1, int arg2) throws IOException {
        this.field3896 = arg0;
        this.field3910 = this.field3891 = arg0.method89((byte) -45);
        this.field3895 = new byte[arg1];
        this.field3890 = 0L;
        this.field3909 = new byte[arg2];
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)Ljava/io/File;", line = 141)
    private final File method1645(int arg0) {
        if (arg0 != 8) {
            this.field3899 = 24;
        }
        field3892++;
        return this.field3896.method84(arg0 ^ 0xFFFFFFF7);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IJ)V", line = 159)
    public final void method1646(int arg0, long arg1) throws IOException {
        field3904++;
        if ((long) arg0 > arg1) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1645(8));
        }
        this.field3890 = arg1;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([BIII)V", line = 179)
    public final void method1647(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3898++;
        try {
            if (this.field3910 < (long) arg3 + this.field3890) {
                this.field3910 = this.field3890 + ((long) arg3);
            }
            if (this.field3893 != -1L && (this.field3893 > this.field3890 || this.field3890 > ((long) this.field3897 + this.field3893))) {
                this.method1642((byte) 96);
            }
            if (this.field3893 != -1L && this.field3893 + ((long) this.field3909.length) < (long) arg3 + this.field3890) {
                int var5 = (int) (this.field3893 - (this.field3890 - (long) this.field3909.length));
                class268.method1625(arg0, arg2, this.field3909, (int) (this.field3890 - this.field3893), var5);
                arg2 += var5;
                arg3 -= var5;
                this.field3890 += (long) var5;
                this.field3897 = this.field3909.length;
                this.method1642((byte) 112);
            }
            if (arg1 != -855377040) {
                field3905 = -117;
            }
            if (arg3 > this.field3909.length) {
                if (this.field3902 != this.field3890) {
                    this.field3896.method85(0, this.field3890);
                    this.field3902 = this.field3890;
                }
                this.field3896.method87(arg0, arg3, arg2, 80);
                this.field3902 += (long) arg3;
                if (this.field3902 > this.field3891) {
                    this.field3891 = this.field3902;
                }
                long var6 = -1L;
                if (this.field3903 <= this.field3890 && this.field3890 < (long) this.field3899 + this.field3903) {
                    var6 = this.field3890;
                } else if (this.field3903 >= this.field3890 && (long) arg3 + this.field3890 > this.field3903) {
                    var6 = this.field3903;
                }
                long var8 = -1L;
                if (this.field3903 < (long) arg3 + this.field3890 && (long) this.field3899 + this.field3903 >= (long) arg3 + this.field3890) {
                    var8 = this.field3890 + ((long) arg3);
                } else if (this.field3890 < ((long) this.field3899 + this.field3903) && (long) arg3 + this.field3890 >= (long) this.field3899 + this.field3903) {
                    var8 = this.field3903 + ((long) this.field3899);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class268.method1625(arg0, (int) ((long) arg2 + var6 - this.field3890), this.field3895, (int) (var6 - this.field3903), var10);
                }
                this.field3890 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field3893 == -1L) {
                    this.field3893 = this.field3890;
                }
                class268.method1625(arg0, arg2, this.field3909, (int) (this.field3890 - this.field3893), arg3);
                this.field3890 += (long) arg3;
                if (((long) this.field3897) < (this.field3890 - this.field3893)) {
                    this.field3897 = (int) (this.field3890 - this.field3893);
                }
            }
        } catch (IOException var12) {
            this.field3902 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BI[BI)V", line = 301)
    public final void method1648(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3889++;
        try {
            int var5 = -65 / ((9 - arg0) / 45);
            if (arg2.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field3893 != -1L && this.field3893 <= this.field3890 && (long) arg3 + this.field3890 <= (long) this.field3897 + this.field3893) {
                class268.method1625(this.field3909, (int) (this.field3890 - this.field3893), arg2, arg1, arg3);
                this.field3890 += (long) arg3;
                return;
            }
            long var6 = this.field3890;
            int var8 = arg1;
            int var9 = arg3;
            if (this.field3903 <= this.field3890 && this.field3890 < ((long) this.field3899 + this.field3903)) {
                int var10 = (int) (this.field3903 + (long) this.field3899 - this.field3890);
                if (arg3 < var10) {
                    var10 = arg3;
                }
                class268.method1625(this.field3895, (int) (this.field3890 - this.field3903), arg2, arg1, var10);
                arg1 += var10;
                arg3 -= var10;
                this.field3890 += (long) var10;
            }
            if (arg3 > this.field3895.length) {
                this.field3896.method85(0, this.field3890);
                this.field3902 = this.field3890;
                while (arg3 > 0) {
                    int var11 = this.field3896.method88(arg1, arg2, (byte) 23, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    arg3 -= var11;
                    this.field3890 += (long) var11;
                    this.field3902 += (long) var11;
                    arg1 += var11;
                }
            } else if (arg3 > 0) {
                this.method1650((byte) 88);
                int var12 = arg3;
                if (arg3 > this.field3899) {
                    var12 = this.field3899;
                }
                class268.method1625(this.field3895, 0, arg2, arg1, var12);
                arg3 -= var12;
                this.field3890 += (long) var12;
                arg1 += var12;
            }
            if (this.field3893 != -1L) {
                if (this.field3890 < this.field3893 && arg3 > 0) {
                    int var13 = (int) (this.field3893 - this.field3890) + arg1;
                    if (var13 > arg1 + arg3) {
                        var13 = arg1 + arg3;
                    }
                    while (arg1 < var13) {
                        arg2[arg1++] = 0;
                        arg3--;
                        this.field3890++;
                    }
                }
                long var14 = -1L;
                long var16 = -1L;
                if (var6 <= this.field3893 && ((long) var9 + var6) > this.field3893) {
                    var14 = this.field3893;
                } else if (var6 >= this.field3893 && (this.field3893 + ((long) this.field3897)) > var6) {
                    var14 = var6;
                }
                if (var6 < (long) this.field3897 + this.field3893 && (long) this.field3897 + this.field3893 <= (long) var9 + var6) {
                    var16 = (long) this.field3897 + this.field3893;
                } else if ((long) var9 + var6 > this.field3893 && ((long) this.field3897 + this.field3893) >= ((long) var9 + var6)) {
                    var16 = (long) var9 + var6;
                }
                if (var14 > -1L && var14 < var16) {
                    int var18 = (int) (var16 - var14);
                    class268.method1625(this.field3909, (int) (var14 - this.field3893), arg2, (int) (var14 - var6) + var8, var18);
                    if (this.field3890 < var16) {
                        arg3 = (int) ((long) arg3 - (var16 - this.field3890));
                        this.field3890 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field3902 = -1L;
            throw var20;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z[B)V", line = 493)
    public final void method1649(boolean arg0, byte[] arg1) throws IOException {
        if (!arg0) {
            this.method1643(95);
        }
        this.method1648((byte) -87, 0, arg1, arg1.length);
        field3901++;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V", line = 504)
    private final void method1650(byte arg0) throws IOException {
        field3907++;
        this.field3899 = 0;
        if (arg0 < 38) {
            return;
        }
        if (this.field3902 != this.field3890) {
            this.field3896.method85(0, this.field3890);
            this.field3902 = this.field3890;
        }
        this.field3903 = this.field3890;
        while (this.field3899 < this.field3895.length) {
            int var2 = this.field3895.length - this.field3899;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3896.method88(this.field3899, this.field3895, (byte) 126, var2);
            if (var3 == -1) {
                break;
            }
            this.field3902 += (long) var3;
            this.field3899 += var3;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljq;", line = 574)
    public static final class200 method1651(Canvas arg0, boolean arg1) {
        field3888++;
        try {
            if (arg1) {
                field3906 = null;
            }
            Class var2 = Class.forName("fk");
            class200 var3 = (class200) var2.getDeclaredConstructor().newInstance();
            var3.method146(0, arg0);
            return var3;
        } catch (Throwable var5) {
            class397 var4 = new class397();
            var4.method146(0, arg0);
            return var4;
        }
    }
}
