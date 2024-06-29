import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class239 extends class279 {

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "[Lcl;")
    public static class144[] field3992 = new class144[50];

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "Ltl;")
    public static class59 field3988 = class85.method639(" )2> <col=00ffff>", 9588);

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "Ltl;")
    private static class59 field3980 = class85.method639("wave:", 9588);

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "Ltl;")
    public static class59 field3996 = field3980;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "Ltl;")
    public static class59 field3987 = field3980;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "[I")
    public static int[] field3979;

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "[[Lma;")
    public static class263[][] field3986;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "[[[I")
    public static int[][][] field3993;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BII)V", line = 19)
    private final void method1670(byte arg0, int arg1, int arg2) {
        if (arg0 > -4) {
            method1672((byte) -50);
        }
        field3983++;
        int var4 = class31.field430[arg1];
        int var5 = class71.field1104[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var6 && -2.356194490192345D >= (double) var6) {
            class266.field4587 = arg1;
            class228.field3676 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && -2.356194490192345D <= (double) var6) {
            class266.field4587 = arg2;
            class228.field3676 = arg1;
        } else if (-0.7853981633974483D >= (double) var6 && (double) var6 >= -1.5707963267948966D) {
            class228.field3676 = arg1;
            class266.field4587 = class56.field835 - arg2;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class266.field4587 = arg1;
            class228.field3676 = class284.field4887 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class266.field4587 = class56.field835 - arg1;
            class228.field3676 = class284.field4887 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class228.field3676 = class284.field4887 - arg1;
            class266.field4587 = class56.field835 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class266.field4587 = arg2;
            class228.field3676 = class284.field4887 - arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class228.field3676 = arg2;
            class266.field4587 = class56.field835 - arg1;
        }
        class266.field4587 &= class310.field5270;
        class228.field3676 &= class132.field2197;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(ZI)V", line = 94)
    public static final void method1671(boolean arg0, int arg1) {
        field3995++;
        class186 var2 = class67.method561(32, arg1, 7);
        if (!arg0) {
            var2.method1381(true);
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)V", line = 107)
    public static final void method1672(byte arg0) {
        if (arg0 >= -81) {
            return;
        }
        class269.field4674.method805(-6838);
        field3989++;
        for (int var1 = 0; var1 < 32; var1++) {
            class254.field4216[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class288.field4949[var2] = 0L;
        }
        class29.field384 = 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIBI)V", line = 136)
    public static final void method1673(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3982++;
        for (class308 var5 = (class308) class27.field357.method536(2); var5 != null; var5 = (class308) class27.field357.method533(24)) {
            class1.method5(var5, arg0, arg4, arg1, arg2, 109);
        }
        for (class308 var6 = (class308) class130.field2157.method536(2); var6 != null; var6 = (class308) class130.field2157.method533(24)) {
            byte var7 = 1;
            if (var6.field5241.field1767 == var6.field5241.field1720) {
                var7 = 0;
            } else if (var6.field5241.field1788 == var6.field5241.field1767) {
                var7 = 2;
            }
            if (var6.field5230 != var7) {
                int var8 = class282.method1982(15971, var6.field5241);
                if (var6.field5227 != var8) {
                    if (var6.field5205 != null) {
                        class222.field3596.method369(var6.field5205);
                        var6.field5205 = null;
                    }
                    var6.field5227 = var8;
                }
                var6.field5230 = var7;
            }
            var6.field5235 = var6.field5241.field1774;
            var6.field5217 = var6.field5241.field1774 + (var6.field5241.method776(true) * 64);
            var6.field5210 = var6.field5241.field1769;
            var6.field5239 = var6.field5241.field1769 + var6.field5241.method776(true) * 64;
            class1.method5(var6, arg0, arg4, arg1, arg2, 116);
        }
        if (arg3 < 33) {
            method1673(-128, -86, 109, (byte) 82, 24);
        }
        for (class308 var9 = (class308) class206.field3365.method692(64); var9 != null; var9 = (class308) class206.field3365.method693((byte) 106)) {
            byte var10 = 1;
            if (var9.field5231.field1767 == var9.field5231.field1720) {
                var10 = 0;
            } else if (var9.field5231.field1788 == var9.field5231.field1767) {
                var10 = 2;
            }
            if (var9.field5230 != var10) {
                int var11 = class60.method506(24642, var9.field5231);
                if (var9.field5227 != var11) {
                    if (var9.field5205 != null) {
                        class222.field3596.method369(var9.field5205);
                        var9.field5205 = null;
                    }
                    var9.field5227 = var11;
                }
                var9.field5230 = var10;
            }
            var9.field5235 = var9.field5231.field1774;
            var9.field5217 = var9.field5231.field1774 + (var9.field5231.method776(true) * 64);
            var9.field5210 = var9.field5231.field1769;
            var9.field5239 = var9.field5231.field1769 + (var9.field5231.method776(true) * 64);
            class1.method5(var9, arg0, arg4, arg1, arg2, 126);
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 238)
    public class239() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)[[I", line = 245)
    public final int[][] method87(int arg0, int arg1) {
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (arg0 != -7523) {
            field3986 = (class263[][]) ((class263[][]) null);
        }
        if (this.field4786.field3297) {
            int[] var4 = var3[2];
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class56.field835; var7++) {
                this.method1670((byte) -118, var7, arg1);
                int[][] var8 = this.method1956(0, class228.field3676, (byte) -112);
                var5[var7] = var8[0][class266.field4587];
                var6[var7] = var8[1][class266.field4587];
                var4[var7] = var8[2][class266.field4587];
            }
        }
        field3984++;
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILs;)V", line = 292)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg0 >= -125) {
            method1676(false, -97, -9, 115, -125, 58);
        }
        field3991++;
        if (arg1 == 0) {
            this.field4789 = arg2.method1221(85) == 1;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BIIII)V", line = 306)
    private static final void method1674(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3990++;
        if (class64.field992 == 1) {
            class236.field3915[class236.field3918 / 100].method337(class127.field2088 - 8, class223.field3619 - 8);
        }
        if (arg0 != 119) {
            field3987 = (class59) null;
        }
        if (class64.field992 == 2) {
            class236.field3915[(class236.field3918 / 100) + 4].method337(class127.field2088 - 8, class223.field3619 + -8);
        }
        class226.method1557(-115);
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(B)V", line = 329)
    public static void method1675(byte arg0) {
        field3993 = (int[][][]) null;
        field3992 = null;
        field3988 = null;
        field3986 = (class263[][]) null;
        field3996 = null;
        if (arg0 >= 65) {
            field3979 = null;
            field3987 = null;
            field3980 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZIIIII)V", line = 349)
    public static final void method1676(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class178.field2914++;
        if (!arg0) {
            class97.method729(-11564, true);
            class62.method515(-1270966393, true);
            class97.method729(-11564, false);
        }
        field3994++;
        class62.method515(arg2 ^ 0xB43E9787, false);
        if (!arg0) {
            class45.method316(false);
        }
        class311.method2150((byte) 111);
        if (class55.field815) {
            class23.method146(true, arg5, arg1, arg4, false, arg3);
            arg4 = class31.field431;
            arg5 = class232.field3812;
            arg3 = class308.field5209;
            arg1 = class293.field4995;
        }
        if (class266.field4585 == 1) {
            int var6 = class124.field2057;
            if (class171.field2823 / 256 > var6) {
                var6 = class171.field2823 / 256;
            }
            if (class41.field610[4] && class4.field45[4] + 128 > var6) {
                var6 = class4.field45[4] + 128;
            }
            int var7 = class213.field3489 + class209.field3405 & 0x7FF;
            class306.method2122(arg2 ^ 0x7B, class265.field4583, var6 * 3 + 600, class238.field3975, class73.method589(class247.field4119, true, class286.field4920.field1774, class286.field4920.field1769) - 50, arg5, var7, var6);
        }
        int var8 = class185.field3109;
        int var9 = class226.field3640;
        int var10 = class58.field853;
        int var11 = class100.field1627;
        int var12 = class216.field3528;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class41.field610[var13]) {
                int var14 = (int) ((double) (-class211.field3434[var13]) + Math.random() * (double) (class211.field3434[var13] * 2 + 1) + Math.sin((double) class150.field2471[var13] / 100.0D * (double) class201.field3321[var13]) * (double) class4.field45[var13]);
                if (var13 == 4) {
                    class100.field1627 += var14;
                    if (class100.field1627 < 128) {
                        class100.field1627 = 128;
                    }
                    if (class100.field1627 > 383) {
                        class100.field1627 = 383;
                    }
                }
                if (var13 == 2) {
                    class216.field3528 += var14;
                }
                if (var13 == 1) {
                    class185.field3109 += var14;
                }
                if (var13 == 3) {
                    class58.field853 = class58.field853 + var14 & 0x7FF;
                }
                if (var13 == 0) {
                    class226.field3640 += var14;
                }
            }
        }
        class43.method291(arg2 ^ arg2);
        if (class55.field815) {
            class240.method1689(arg4, arg1, arg3 + arg4, arg1 - -arg5);
            float var15 = (float) class58.field853 * 0.17578125F;
            float var16 = (float) class100.field1627 * 0.17578125F;
            if (class266.field4585 == 3) {
                var15 = class100.field1629 * 360.0F / 6.2831855F;
                var16 = class1.field1 * 360.0F / 6.2831855F;
            }
            class55.method387(arg4, arg1, arg3, arg5, arg4 + (arg3 / 2), arg5 / 2 + arg1, var16, var15, class237.field3945, class237.field3945);
        } else {
            class272.method1901(arg4, arg1, arg3 + arg4, arg1 - -arg5);
            class298.method2079();
        }
        if (class85.field1336 || arg4 > class90.field1402 || class90.field1402 >= arg3 + arg4 || class84.field1315 < arg1 || class84.field1315 >= (arg1 + arg5)) {
            class263.field4512 = false;
            class26.field336 = 0;
        } else {
            class263.field4512 = true;
            class26.field336 = 0;
            int var17 = class268.field4662;
            int var18 = class233.field3837;
            class58.field852 = (class90.field1402 - arg4) * (var18 - var17) / arg3 + var17;
            int var19 = class72.field1130;
            int var20 = class286.field4916;
            class68.field1051 = (class84.field1315 - arg1) * (var20 - var19) / arg5 + var19;
        }
        class269.method1881((byte) -1);
        byte var21 = class228.method1568(true) == 2 ? (byte) class178.field2914 : 1;
        if (class55.field815) {
            class55.method418();
            boolean var22 = false;
            class55.method420(true);
            class55.method417(true);
            int var23;
            if (class238.field3978 == 10) {
                var23 = class171.method1261(class128.field2092, class64.field985, 1228, class216.field3528 >> 10, class226.field3640 >> 10);
            } else {
                var23 = class171.method1261(class128.field2092, class64.field985, 1228, class286.field4920.field1773[0] >> 3, class286.field4920.field1729[0] >> 3);
            }
            class135.method978(class30.field420, !class94.field1452);
            class55.method404(var23);
            class80.method614(class185.field3109, class226.field3640, 0, class58.field853, class216.field3528, class100.field1627);
            class55.field821 = class30.field420;
            class114.method828(class226.field3640, class185.field3109, class216.field3528, class100.field1627, class58.field853, class213.field3500, class60.field938, class180.field2959, class311.field5276, class103.field1705, class232.field3824, class247.field4119 + 1, var21, class286.field4920.field1774 >> 7, class286.field4920.field1769 >> 7);
            class46.field749 = true;
            class135.method985();
            class80.method614(0, 0, 0, 0, 0, 0);
            class269.method1881((byte) -1);
            class221.method1530();
            class189.method1398(false, arg4, arg1, arg3, class237.field3945, class237.field3945, arg5);
            class8.method66(arg1, arg3, class237.field3945, class237.field3945, 2, arg5, arg4);
        } else {
            class272.method1892(arg4, arg1, arg3, arg5, 0);
            class114.method828(class226.field3640, class185.field3109, class216.field3528, class100.field1627, class58.field853, class213.field3500, class60.field938, class180.field2959, class311.field5276, class103.field1705, class232.field3824, class247.field4119 + 1, var21, class286.field4920.field1774 >> 7, class286.field4920.field1769 >> 7);
            class269.method1881((byte) -1);
            class221.method1530();
            class189.method1398(false, arg4, arg1, arg3, 256, 256, arg5);
            class8.method66(arg1, arg3, 256, 256, 2, arg5, arg4);
        }
        ((class280) class298.field5107).method1963(class64.field985, false);
        method1674((byte) 119, arg3, arg4, arg5, arg1);
        class58.field853 = var10;
        class185.field3109 = var8;
        class226.field3640 = var9;
        class216.field3528 = var12;
        class100.field1627 = var11;
        if (class211.field3450 && class289.field4961.method744((byte) -122) == 0) {
            class211.field3450 = false;
        }
        if (class211.field3450) {
            if (class55.field815) {
                class240.method1688(arg4, arg1, arg3, arg5, 0);
            } else {
                class272.method1892(arg4, arg1, arg3, arg5, 0);
            }
            class128.method939(84, false, class69.field1059);
        }
        if (!arg0 && !class211.field3450 && !class85.field1336 && class90.field1402 >= arg4 && class90.field1402 < (arg3 + arg4) && arg1 <= class84.field1315 && arg1 + arg5 > class84.field1315) {
            class8.method59(1, arg4, class90.field1402, arg3, arg1, class84.field1315, arg5);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)[I", line = 554)
    public final int[] method44(boolean arg0, int arg1) {
        field3985++;
        if (arg0) {
            field3987 = (class59) null;
        }
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            for (int var4 = 0; var4 < class56.field835; var4++) {
                this.method1670((byte) -41, var4, arg1);
                int[] var5 = this.method1960(-122, class228.field3676, 0);
                var3[var4] = var5[class266.field4587];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(II)I", line = 586)
    public static int method1677(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
