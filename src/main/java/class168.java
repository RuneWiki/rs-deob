import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class168 {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "J")
    private long field2832 = -1L;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    private int field2843 = 0;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "J")
    private long field2850 = -1L;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lka;")
    private class171 field2830;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "J")
    private long field2848;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "J")
    private long field2845;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "[B")
    private byte[] field2846;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "J")
    private long field2835;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[B")
    private byte[] field2828;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static volatile int field2829 = 0;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Leg;")
    public static class33 field2838 = null;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public static int field2853 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    private int field2852;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "J")
    private long field2833;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lng;")
    public static class121 field2827;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[B)V")
    public final void method1129(int arg0, byte[] arg1) throws IOException {
        this.method1139(arg1.length, arg1, -55, 0);
        int var3 = 49 % ((arg0 - 25) / 51);
        field2847++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1130(int arg0) {
        field2827 = null;
        if (arg0 != 0) {
            method1130(-74);
        }
        field2838 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Ljava/io/File;")
    private final File method1131(boolean arg0) {
        field2842++;
        return arg0 ? this.field2830.method1154(true) : null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(JB)V")
    public final void method1132(long arg0, byte arg1) throws IOException {
        field2851++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1131(true));
        }
        if (arg1 <= 62) {
            this.field2830 = null;
        }
        this.field2835 = arg0;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[BII)I")
    public static final int method1133(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        field2840++;
        int var5 = arg2;
        if (arg0 != -369079672) {
            return 102;
        }
        while (var5 < arg3) {
            var4 = var4 >>> 8 ^ class176.field3017[(arg1[var5] ^ var4) & 0xFF];
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    private final void method1134(int arg0) throws IOException {
        if (arg0 >= -118) {
            this.field2843 = -75;
        }
        field2837++;
        this.field2852 = 0;
        if (this.field2835 != this.field2833) {
            this.field2830.method1151(this.field2835, (byte) 122);
            this.field2833 = this.field2835;
        }
        this.field2850 = this.field2835;
        while (this.field2852 < this.field2846.length) {
            int var2 = this.field2846.length - this.field2852;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2830.method1152(var2, this.field2846, (byte) -6, this.field2852);
            if (var3 == -1) {
                break;
            }
            this.field2852 += var3;
            this.field2833 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)V")
    public static final void method1135(boolean arg0, int arg1) {
        field2834++;
        class230.field4129 = arg0;
        class107.field1772 = !class188.method1298(10);
        int var2 = -124 % ((9 - arg1) / 57);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
    private final void method1136(boolean arg0) throws IOException {
        field2836++;
        if (!arg0) {
            field2853 = -127;
        }
        if (this.field2832 == -1L) {
            return;
        }
        if (this.field2833 != this.field2832) {
            this.field2830.method1151(this.field2832, (byte) 122);
            this.field2833 = this.field2832;
        }
        this.field2830.method1150(this.field2828, 14389, 0, this.field2843);
        long var2 = -1L;
        if (this.field2850 <= this.field2832 && this.field2832 < (long) this.field2852 + this.field2850) {
            var2 = this.field2832;
        } else if (this.field2850 >= this.field2832 && ((long) this.field2843 + this.field2832) > this.field2850) {
            var2 = this.field2850;
        }
        long var4 = -1L;
        if (((long) this.field2843 + this.field2832) > this.field2850 && (this.field2832 + ((long) this.field2843)) <= ((long) this.field2852 + this.field2850)) {
            var4 = this.field2832 + ((long) this.field2843);
        } else if (this.field2832 < this.field2850 + ((long) this.field2852) && ((long) this.field2852 + this.field2850) <= ((long) this.field2843 + this.field2832)) {
            var4 = this.field2850 + ((long) this.field2852);
        }
        this.field2833 += (long) this.field2843;
        if (this.field2833 > this.field2848) {
            this.field2848 = this.field2833;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class58.method390(this.field2828, (int) (var2 - this.field2832), this.field2846, (int) (var2 - this.field2850), var6);
        }
        this.field2832 = -1L;
        this.field2843 = 0;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public final void method1137(int arg0) throws IOException {
        field2849++;
        this.method1136(true);
        this.field2830.method1149(arg0 ^ 0xFFFFDB30);
        if (arg0 != 0) {
            field2827 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)J")
    public final long method1138(int arg0) {
        if (arg0 < 85) {
            this.method1138(93);
        }
        field2839++;
        return this.field2845;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I[BII)V")
    public final void method1139(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2831++;
        try {
            if (arg0 + arg3 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg1.length);
            }
            if (this.field2832 != -1L && this.field2832 <= this.field2835 && (long) arg0 + this.field2835 <= (long) this.field2843 + this.field2832) {
                class58.method390(this.field2828, (int) (this.field2835 - this.field2832), arg1, arg3, arg0);
                this.field2835 += (long) arg0;
                return;
            }
            int var5 = 39 / ((11 - arg2) / 51);
            long var6 = this.field2835;
            int var8 = arg0;
            int var9 = arg3;
            if (this.field2835 >= this.field2850 && (this.field2850 + ((long) this.field2852)) > this.field2835) {
                int var10 = (int) ((long) this.field2852 + this.field2850 - this.field2835);
                if (arg0 < var10) {
                    var10 = arg0;
                }
                class58.method390(this.field2846, (int) (this.field2835 - this.field2850), arg1, arg3, var10);
                arg0 -= var10;
                this.field2835 += (long) var10;
                arg3 += var10;
            }
            if (this.field2846.length < arg0) {
                this.field2830.method1151(this.field2835, (byte) 122);
                this.field2833 = this.field2835;
                while (arg0 > 0) {
                    int var12 = this.field2830.method1152(arg0, arg1, (byte) -6, arg3);
                    if (var12 == -1) {
                        break;
                    }
                    this.field2835 += (long) var12;
                    this.field2833 += (long) var12;
                    arg0 -= var12;
                    arg3 += var12;
                }
            } else if (arg0 > 0) {
                this.method1134(-122);
                int var11 = arg0;
                if (this.field2852 < arg0) {
                    var11 = this.field2852;
                }
                arg0 -= var11;
                class58.method390(this.field2846, 0, arg1, arg3, var11);
                arg3 += var11;
                this.field2835 += (long) var11;
            }
            if (this.field2832 != -1L) {
                if (this.field2832 > this.field2835 && arg0 > 0) {
                    int var13 = (int) (this.field2832 - this.field2835) + arg3;
                    if (var13 > (arg0 + arg3)) {
                        var13 = arg0 + arg3;
                    }
                    while (var13 > arg3) {
                        arg0--;
                        arg1[arg3++] = 0;
                        this.field2835++;
                    }
                }
                long var14 = -1L;
                if (this.field2832 >= var6 && this.field2832 < ((long) var8 + var6)) {
                    var14 = this.field2832;
                } else if (this.field2832 <= var6 && ((long) this.field2843 + this.field2832) > var6) {
                    var14 = var6;
                }
                long var16 = -1L;
                if (var6 < (long) this.field2843 + this.field2832 && ((long) this.field2843 + this.field2832) <= ((long) var8 + var6)) {
                    var16 = this.field2832 + ((long) this.field2843);
                } else if (this.field2832 < (var6 + ((long) var8)) && ((long) var8 + var6) <= ((long) this.field2843 + this.field2832)) {
                    var16 = var6 + ((long) var8);
                }
                if (var14 > -1L && var14 < var16) {
                    int var18 = (int) (var16 - var14);
                    class58.method390(this.field2828, (int) (var14 - this.field2832), arg1, (int) (var14 - var6) + var9, var18);
                    if (var16 > this.field2835) {
                        arg0 = (int) ((long) arg0 - (var16 - this.field2835));
                        this.field2835 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field2833 = -1L;
            throw var20;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI[BI)V")
    public final void method1140(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2841++;
        try {
            if (arg0 > -35) {
                this.field2830 = null;
            }
            if (this.field2835 + ((long) arg3) > this.field2845) {
                this.field2845 = (long) arg3 + this.field2835;
            }
            if (this.field2832 != -1L && (this.field2832 > this.field2835 || (long) this.field2843 + this.field2832 < this.field2835)) {
                this.method1136(true);
            }
            if (this.field2832 != -1L && (long) arg3 + this.field2835 > (long) this.field2828.length + this.field2832) {
                int var5 = (int) (this.field2832 + (long) this.field2828.length - this.field2835);
                arg3 -= var5;
                class58.method390(arg2, arg1, this.field2828, (int) (this.field2835 - this.field2832), var5);
                this.field2835 += (long) var5;
                arg1 += var5;
                this.field2843 = this.field2828.length;
                this.method1136(true);
            }
            if (arg3 > this.field2828.length) {
                if (this.field2835 != this.field2833) {
                    this.field2830.method1151(this.field2835, (byte) 122);
                    this.field2833 = this.field2835;
                }
                this.field2830.method1150(arg2, 14389, arg1, arg3);
                long var6 = -1L;
                this.field2833 += (long) arg3;
                if (this.field2848 < this.field2833) {
                    this.field2848 = this.field2833;
                }
                if (this.field2835 >= this.field2850 && (long) this.field2852 + this.field2850 > this.field2835) {
                    var6 = this.field2835;
                } else if (this.field2835 <= this.field2850 && (long) arg3 + this.field2835 > this.field2850) {
                    var6 = this.field2850;
                }
                long var8 = -1L;
                if (((long) arg3 + this.field2835) > this.field2850 && ((long) this.field2852 + this.field2850) >= ((long) arg3 + this.field2835)) {
                    var8 = (long) arg3 + this.field2835;
                } else if (this.field2835 < ((long) this.field2852 + this.field2850) && (long) this.field2852 + this.field2850 <= (long) arg3 + this.field2835) {
                    var8 = this.field2850 + ((long) this.field2852);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class58.method390(arg2, (int) ((long) arg1 + var6 - this.field2835), this.field2846, (int) (var6 - this.field2850), var10);
                }
                this.field2835 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field2832 == -1L) {
                    this.field2832 = this.field2835;
                }
                class58.method390(arg2, arg1, this.field2828, (int) (this.field2835 - this.field2832), arg3);
                this.field2835 += (long) arg3;
                if (((long) this.field2843) < (this.field2835 - this.field2832)) {
                    this.field2843 = (int) (this.field2835 - this.field2832);
                }
            }
        } catch (IOException var12) {
            this.field2833 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lka;II)V")
    public class168(class171 arg0, int arg1, int arg2) throws IOException {
        this.field2830 = arg0;
        this.field2845 = this.field2848 = arg0.method1153(0);
        this.field2846 = new byte[arg1];
        this.field2835 = 0L;
        this.field2828 = new byte[arg2];
    }
}
