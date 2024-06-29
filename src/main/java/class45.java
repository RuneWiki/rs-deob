import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class45 extends class38 {

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    private int field969 = -32768;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    private int field970;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    private int field979;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "Lpj;")
    private class174 field981;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    private int field988;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    private int field967;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "[[B")
    public static byte[][] field982 = new byte[50][];

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field968 = 0;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "Z")
    public static boolean field987 = false;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "[Lch;")
    public static class31[] field971;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)I")
    public static final int method371(int arg0, byte arg1) {
        field984++;
        if (class233.field4193 == 1) {
            return 7;
        } else if (arg1 < 106) {
            return -45;
        } else if (arg0 == 77) {
            return 1;
        } else if (arg0 == 38) {
            return 2;
        } else if (arg0 == 16) {
            return 3;
        } else if (arg0 == 161) {
            return 4;
        } else if (arg0 == 191) {
            return 5;
        } else if (arg0 == 69) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIIIII)V")
    public static final void method372(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class119.method843(class159.field2910, -114, arg4, class224.field4040);
        int var7 = class119.method843(class159.field2910, -126, arg1, class224.field4040);
        field972++;
        if (arg0 != -103) {
            method371(-36, (byte) 79);
        }
        int var8 = class119.method843(class240.field4355, -111, arg2, class146.field2678);
        int var9 = class119.method843(class240.field4355, -124, arg5, class146.field2678);
        for (int var10 = var6; var10 <= var7; var10++) {
            class114.method762(var8, 75, var9, arg3, class167.field3030[var10]);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public static void method373(byte arg0) {
        if (arg0 == -26) {
            field982 = null;
            field971 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)Ldd;")
    private final class38 method374(int arg0) {
        boolean var2 = class156.field2839 != class146.field2684;
        class211 var3 = class48.method379(65, this.field970);
        if (var3.field3792 != null) {
            var3 = var3.method1378((byte) 111);
        }
        field973++;
        if (var3 == null) {
            return null;
        }
        int var4 = -48 % ((-arg0 - 6) / 63);
        int var5;
        int var6;
        if (this.field989 == 1 || this.field989 == 3) {
            var6 = var3.field3804;
            var5 = var3.field3814;
        } else {
            var5 = var3.field3804;
            var6 = var3.field3814;
        }
        int var7 = (var6 >> 1) + this.field979;
        int var8 = (var6 + 1 >> 1) + this.field979;
        int var9 = (var5 >> 1) + this.field985;
        int var10 = this.field985 + (var5 + 1 >> 1);
        this.method337(var9 * 128, -107, var7 * 128);
        int[][] var11 = class156.field2839[this.field986];
        int var12 = var11[var7][var9] + var11[var7][var10] + var11[var8][var9] + var11[var8][var10] >> 2;
        int[][] var13 = null;
        if (var2) {
            var13 = class146.field2684[0];
        } else if (this.field986 < 3) {
            var13 = class156.field2839[this.field986 + 1];
        }
        int var14 = (this.field979 << 7) + (var6 << 6);
        int var15 = (this.field985 << 7) + (var5 << 6);
        class1 var16;
        if (this.field981 == null) {
            var16 = var3.method1383(var12, var11, var13, var14, this.field977, (byte) -123, var15, false, this.field989);
        } else {
            var16 = var3.method1385(var13, this.field967, this.field981, this.field989, var12, this.field977, var14, (byte) -116, var15, var11);
        }
        return var16 == null ? null : var16.field17;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
    public final int method134() {
        field980++;
        return this.field969;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(III)V")
    public final void method337(int arg0, int arg1, int arg2) {
        field978++;
        if (this.field981 != null) {
            int var4 = class44.field966 - this.field988;
            if (var4 > 100 && this.field981.field3137 > 0) {
                int var5 = this.field981.field3144.length - this.field981.field3137;
                while (var5 > this.field967 && var4 > this.field981.field3148[this.field967]) {
                    var4 -= this.field981.field3148[this.field967];
                    this.field967++;
                }
                if (this.field967 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field981.field3144.length; var7++) {
                        var6 += this.field981.field3148[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field981.field3148[this.field967]) {
                            break label62;
                        }
                        class99.method673(arg2, this.field967, 32521, false, this.field981, arg0);
                        var4 -= this.field981.field3148[this.field967];
                        this.field967++;
                    } while (this.field981.field3144.length > this.field967);
                    this.field967 -= this.field981.field3137;
                } while (this.field967 >= 0 && this.field967 < this.field981.field3144.length);
                this.field981 = null;
            }
            this.field988 = class44.field966 - var4;
        }
        if (arg1 > -71) {
            method376(-109);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZIZIIIIZ)Lch;")
    public static final class31 method375(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class154 var8 = class214.method1408((byte) 102, arg5);
        if (arg1 > 1 && var8.field2792 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field2788[var10] && var8.field2788[var10] != 0) {
                    var9 = var8.field2792[var10];
                }
            }
            if (var9 != -1) {
                var8 = class214.method1408((byte) 102, var9);
            }
        }
        field983++;
        class107 var11 = var8.method1087(-31268);
        if (var11 == null) {
            return null;
        }
        class144 var12 = null;
        if (var8.field2822 != -1) {
            var12 = (class144) method375(false, 10, true, 0, 24271, var8.field2818, 1, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field2767 != -1) {
            var12 = (class144) method375(false, arg1, false, arg3, arg4, var8.field2791, arg6, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class83.field1561;
        int[] var14 = new int[4];
        int var15 = class83.field1567;
        int var16 = class83.field1565;
        class83.method568(var14);
        class144 var17 = new class144(36, 32);
        class83.method571(var17.field2602, 36, 32);
        class89.method614();
        class89.method625(16, 16);
        class89.field1653 = false;
        if (arg4 != 24271) {
            method377(-26);
        }
        int var18 = var8.field2803;
        if (arg2) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg6 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class89.field1646[var8.field2810] * var18 >> 16;
        int var20 = class89.field1650[var8.field2810] * var18 >> 16;
        var11.method261(0, var8.field2776, var8.field2784, var8.field2810, var8.field2768, var20 + var8.field2779 - var11.method134() / 2, var8.field2779 + var19);
        if (arg6 >= 1) {
            var17.method979(1);
            if (arg6 >= 2) {
                var17.method979(16777215);
            }
            class83.method571(var17.field2602, 36, 32);
        }
        if (arg3 != 0) {
            var17.method980(arg3);
        }
        if (var8.field2822 != -1) {
            var12.method273(0, 0);
        } else if (var8.field2767 != -1) {
            class83.method571(var12.field2602, 36, 32);
            var17.method273(0, 0);
            var17 = var12;
        }
        if (arg0 && (var8.field2806 == 1 || arg1 != 1) && arg1 != -1) {
            class3.field37.method938(class161.method1149(arg1, (byte) 41), 0, 9, 16776960, 1);
        }
        class83.method571(var13, var16, var15);
        class83.method581(var14);
        class89.method614();
        class89.field1653 = true;
        return var17;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
    public static final void method376(int arg0) {
        class100.field1827 = null;
        class204.field3690 = null;
        class106.field1927 = null;
        class11.field376 = null;
        field976++;
        class122.field2287 = null;
        class105.field1921 = null;
        if (arg0 != 5851) {
            field987 = true;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class38 var11 = this.method374(-118);
        field974++;
        if (var11 != null) {
            var11.method158(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field969 = var11.method134();
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
    public static final void method377(int arg0) {
        int var1 = -119 / ((42 - arg0) / 59);
        field990++;
        class130.field2386.method503(10);
        class175.field3162.method503(10);
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIZLdd;)V")
    public class45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class38 arg8) {
        this.field970 = arg0;
        this.field985 = arg5;
        this.field977 = arg1;
        this.field989 = arg2;
        this.field986 = arg3;
        this.field979 = arg4;
        if (arg6 != -1) {
            this.field981 = class81.method555(arg6, (byte) -126);
            this.field988 = class44.field966 - 1;
            this.field967 = 0;
            if (this.field981.field3128 == 0 && arg8 != null && arg8 instanceof class45) {
                class45 var10 = (class45) arg8;
                if (this.field981 == var10.field981) {
                    this.field967 = var10.field967;
                    this.field988 = var10.field988;
                    return;
                }
            }
            if (arg7 && this.field981.field3137 != -1) {
                this.field967 = (int) (Math.random() * (double) this.field981.field3144.length);
                this.field988 -= (int) (Math.random() * (double) this.field981.field3148[this.field967]);
                return;
            }
        }
    }
}
