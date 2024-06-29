import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class339 extends class94 {

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    private int field5240 = -1;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "Z")
    public boolean field5249 = false;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    private int field5237 = 0;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    private int field5247 = -32768;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    private int field5244 = 0;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public int field5255;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public int field5254;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public int field5256;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    private int field5243;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public int field5250;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public int field5262;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "Lgh;")
    private class222 field5253;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "F")
    public static float field5239;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Lcj;")
    private class243 field5238;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "[Lng;")
    public static class245[] field5246;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[B)[B", line = 10)
    public static final byte[] method2343(int arg0, byte[] arg1) {
        if (arg0 <= 24) {
            return (byte[]) null;
        }
        field5248++;
        class303 var2 = new class303(arg1);
        int var3 = var2.method2043((byte) -112);
        int var4 = var2.method1996(-69);
        if (var4 < 0 || !(class45.field636 == 0 || class45.field636 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2009(-102, 0, var4, var5);
            return var5;
        } else {
            int var6 = var2.method1996(-67);
            if (var6 < 0 || !(class45.field636 == 0 || class45.field636 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class296.method1944(var7, var6, arg1, var4, 9);
            } else {
                class64.field964.method1783((byte) -60, var2, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIIIJILcj;)V", line = 67)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class243 arg10) {
        field5251++;
        class295 var13 = this.method2349(1940450887);
        if (var13 != null) {
            var13.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5238);
            this.field5247 = var13.method112();
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V", line = 87)
    public static void method2344(int arg0) {
        if (arg0 != 256) {
            method2351(-25, -23, -13);
        }
        field5246 = null;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(IIIIIII)V", line = 672)
    public class339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5255 = arg4;
        this.field5254 = arg5 + arg6;
        this.field5256 = arg1;
        this.field5243 = arg0;
        this.field5250 = arg2;
        this.field5262 = arg3;
        int var8 = class63.method428(false, this.field5243).field2355;
        if (var8 == -1) {
            this.field5249 = true;
        } else {
            this.field5249 = false;
            this.field5253 = class118.method809((byte) 43, var8);
        }
        if (this.field5254 == arg6) {
            class229.method1571(this.field5250, false, (byte) -110, this.field5262, this.field5253, this.field5237);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIZZ)V", line = 106)
    public static final void method2345(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class19.field260++;
        class343.method2391(0);
        field5241++;
        if (arg4) {
            class163.method1117(false, false, 0, (byte) -80);
        } else {
            class142.method993(0, (byte) -91);
            class163.method1117(false, true, 0, (byte) -93);
            if (class99.field1540 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class163.method1117(false, false, var7, (byte) -98);
                    class163.method1117(true, false, var7, (byte) -110);
                    class142.method993(var7, (byte) -98);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class142.method993(var6, (byte) 117);
                    class163.method1117(false, false, var6, (byte) -122);
                    class163.method1117(true, false, var6, (byte) -42);
                }
            }
        }
        if (!arg4) {
            class105.method712(0);
        }
        class185.method1271(-1);
        if (class333.field5166) {
            class323.method2182(arg0, -645014238, arg3, arg1, arg2, true);
            arg1 = class218.field3476;
            arg2 = class179.field2743;
            arg3 = class44.field630;
            arg0 = class123.field1921;
        }
        if (class219.field3489 == 1) {
            int var8 = (int) class123.field1922 + class265.field4098 & 0x7FF;
            int var9 = (int) class309.field4866;
            if (var9 < (class43.field613 / 256)) {
                var9 = class43.field613 / 256;
            }
            if (class86.field1304[4] && class236.field3793[4] + 128 > var9) {
                var9 = class236.field3793[4] + 128;
            }
            class235.method1600(class330.field5100, class332.field5139, arg2, var8, (var9 * 3) + 600, var9, (byte) 117, class39.method286(class77.field1154, (byte) 82, class79.field1173.field537, class79.field1173.field519) - 50);
        } else if (class219.field3489 == 5) {
            class60.method407(0, arg2);
        }
        int var10 = class298.field4598;
        int var11 = class169.field2579;
        int var12 = class225.field3592;
        int var13 = class305.field4781;
        int var14 = class199.field2989;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class86.field1304[var15]) {
                int var16 = (int) ((double) (-class336.field5222[var15]) + Math.random() * (double) (class336.field5222[var15] * 2 + 1) + Math.sin((double) class96.field1478[var15] / 100.0D * (double) class99.field1536[var15]) * (double) class236.field3793[var15]);
                if (var15 == 3) {
                    class305.field4781 = class305.field4781 + var16 & 0x7FF;
                }
                if (var15 == 4) {
                    class199.field2989 += var16;
                    if (class199.field2989 < 128) {
                        class199.field2989 = 128;
                    }
                    if (class199.field2989 > 383) {
                        class199.field2989 = 383;
                    }
                }
                if (var15 == 1) {
                    class169.field2579 += var16;
                }
                if (var15 == 0) {
                    class298.field4598 += var16;
                }
                if (var15 == 2) {
                    class225.field3592 += var16;
                }
            }
        }
        class310.method2127((byte) -122);
        if (class333.field5166) {
            class238.method1633(arg0, arg3, arg0 + arg1, arg2 + arg3);
            float var17 = (float) class305.field4781 * 0.17578125F;
            float var18 = (float) class199.field2989 * 0.17578125F;
            if (class219.field3489 == 3) {
                var17 = class69.field1029 * 360.0F / 6.2831855F;
                var18 = class4.field49 * 360.0F / 6.2831855F;
            }
            boolean var19 = false;
            int var20;
            if (class304.field4758 == 10) {
                var20 = class222.method1480(class81.field1208, class298.field4598 >> 10, (byte) -101, class225.field3592 >> 10, class88.field1322);
            } else {
                var20 = class222.method1480(class81.field1208, class79.field1173.field476[0] >> 3, (byte) -110, class79.field1173.field505[0] >> 3, class88.field1322);
            }
            if (class299.field4633 >= 0) {
                class333.method2291();
                class67 var21 = class227.method1548(class152.field2409, class285.field4371, -8952, class299.field4633, class298.field4593);
                var21.method484(class115.field1791, arg0, arg3, arg1, arg2, class199.field2989, class305.field4781, var20);
            } else {
                class333.method2280(var20);
            }
            class333.method2283(arg0, arg3, arg1, arg2, arg1 / 2 + arg0, arg2 / 2 + arg3, var18, var17, class188.field2855, class188.field2855);
            class167.method1137(100, false);
            class333.method2309();
            class333.method2316(true);
            class333.method2312(true);
        } else {
            class57.method395(arg0, arg3, arg0 + arg1, arg2 + arg3);
            class12.method95();
            if (class299.field4633 >= 0) {
                class67 var22 = class227.method1548(class152.field2409, class285.field4371, -8952, class299.field4633, class298.field4593);
                var22.method483(class115.field1791, arg0, arg3, arg1, arg2, class199.field2989, class305.field4781, 0);
            } else {
                class57.method375(arg0, arg3, arg1, arg2, 0);
            }
        }
        if (class260.field4036 || class302.field4661 < arg0 || class302.field4661 >= arg0 + arg1 || arg3 > class308.field4847 || arg3 + arg2 <= class308.field4847) {
            class77.field1152 = 0;
            class36.field451 = false;
        } else {
            int var23 = class54.field763;
            class36.field451 = true;
            class77.field1152 = 0;
            int var24 = class6.field65;
            int var25 = class234.field3757;
            int var26 = class27.field345;
            class50.field710 = (class302.field4661 - arg0) * (var23 - var26) / arg1 + var26;
            class132.field2088 = (class308.field4847 - arg3) * (var24 - var25) / arg2 + var25;
        }
        class233.method1592(arg5);
        byte var27 = class112.method750(true) == 2 ? (byte) class19.field260 : 1;
        if (class333.field5166) {
            class147.method1033(class343.field5341, !class318.field4986);
            class63.method415(class169.field2579, class298.field4598, class225.field3592, 119, class199.field2989, class305.field4781);
            class333.field5180 = class343.field5341;
            class88.method605(class298.field4598, class169.field2579, class225.field3592, class199.field2989, class305.field4781, class97.field1512, class247.field3883, class22.field275, class38.field559, class194.field2918, class288.field4409, class77.field1154 + 1, var27, class79.field1173.field537 >> 7, class79.field1173.field519 >> 7);
            class270.field4159 = true;
            class147.method1027();
            class63.method415(0, 0, 0, 28, 0, 0);
            class233.method1592(arg5);
            class226.method1540(arg2, class188.field2855, arg1, class188.field2855, arg3, arg0, 5);
            class47.method324(arg2, arg0, class188.field2855, class188.field2855, false, arg3, arg1);
            class109.method738();
        } else {
            class88.method605(class298.field4598, class169.field2579, class225.field3592, class199.field2989, class305.field4781, class97.field1512, class247.field3883, class22.field275, class38.field559, class194.field2918, class288.field4409, class77.field1154 + 1, var27, class79.field1173.field537 >> 7, class79.field1173.field519 >> 7);
            class233.method1592(arg5);
            class109.method738();
            class226.method1540(arg2, 256, arg1, 256, arg3, arg0, 5);
            class47.method324(arg2, arg0, 256, 256, false, arg3, arg1);
        }
        ((class97) class12.field126).method664(class81.field1208, (byte) -59);
        class104.method704(arg2, -1445, arg3, arg1, arg0);
        class199.field2989 = var14;
        class298.field4598 = var10;
        class305.field4781 = var13;
        class169.field2579 = var11;
        class225.field3592 = var12;
        if (class52.field734 && class124.field1938.method1670(119) == 0) {
            class52.field734 = false;
        }
        if (class52.field734) {
            if (class333.field5166) {
                class238.method1636(arg0, arg3, arg1, arg2, 0);
            } else {
                class57.method375(arg0, arg3, arg1, arg2, 0);
            }
            class204.method1369(false, true, class200.field3016);
        }
        if (!arg4 && !class52.field734 && !class260.field4036 && arg0 <= class302.field4661 && (arg0 + arg1) > class302.field4661 && arg3 <= class308.field4847 && class308.field4847 < arg2 + arg3) {
            class249.method1693(arg1, class302.field4661, arg0, -20178, class308.field4847, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Loe;", line = 369)
    public static final class98 method2346(int arg0, int arg1) {
        field5245++;
        class98 var2 = (class98) class138.field2140.method355((long) arg0, 6487);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class236.field3795.method2103(0, arg0, 0);
        if (var3 == null) {
            return null;
        }
        class98 var4 = new class98();
        class303 var5 = new class303(var3);
        var5.field4679 = var5.field4716.length - 2;
        if (arg1 > -17) {
            return (class98) null;
        }
        int var6 = var5.method1994(false);
        int var7 = var5.field4716.length - var6 - 12 - 2;
        var5.field4679 = var7;
        int var8 = var5.method1996(-89);
        var4.field1525 = var5.method1994(false);
        var4.field1530 = var5.method1994(false);
        var4.field1522 = var5.method1994(false);
        var4.field1519 = var5.method1994(false);
        int var9 = var5.method2043((byte) -113);
        if (var9 > 0) {
            var4.field1524 = new class227[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1994(false);
                class227 var12 = new class227(class47.method330((byte) 42, var11));
                var4.field1524[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1996(-121);
                    int var14 = var5.method1996(65);
                    var12.method1550(new class27(var14), (long) var13, (byte) 67);
                }
            }
        }
        var5.field4679 = 0;
        int var15 = 0;
        var4.field1526 = var5.method2050((byte) -106);
        var4.field1523 = new int[var8];
        var4.field1520 = new String[var8];
        var4.field1528 = new int[var8];
        while (var7 > var5.field4679) {
            int var16 = var5.method1994(false);
            if (var16 == 3) {
                var4.field1520[var15] = var5.method2027(0).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field1523[var15] = var5.method2043((byte) -118);
            } else {
                var4.field1523[var15] = var5.method1996(-45);
            }
            var4.field1528[var15++] = var16;
        }
        class138.field2140.method350((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 459)
    public static final int method2347(String arg0, byte arg1) {
        if (arg1 != -50) {
            method2350(115, -25, 85, 13, 57, -119, -28, 81, -67, -76);
        }
        field5258++;
        if (class23.field293 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class23.field293.field1862; var2++) {
            if (class262.method1742(arg0, class88.method599(class23.field293.field1857[var2], "<br>", -2895, " "), (byte) -99)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)V", line = 487)
    public final void method2348(int arg0, int arg1) {
        field5260++;
        if (this.field5249) {
            return;
        }
        this.field5244 += arg0;
        if (arg1 != 11889) {
            this.field5250 = -16;
        }
        while (this.field5253.field3522[this.field5237] < this.field5244) {
            this.field5244 -= this.field5253.field3522[this.field5237];
            this.field5237++;
            if (this.field5253.field3529.length <= this.field5237) {
                this.field5249 = true;
                break;
            }
        }
        if (!this.field5249) {
            class229.method1571(this.field5250, false, (byte) -110, this.field5262, this.field5253, this.field5237);
        }
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)Lg;", line = 517)
    private final class295 method2349(int arg0) {
        field5242++;
        if (arg0 != 1940450887) {
            return (class295) null;
        }
        class148 var2 = class63.method428(false, this.field5243);
        class295 var3;
        if (this.field5249) {
            var3 = var2.method1047(-98, 0, -1, -1);
        } else {
            var3 = var2.method1047(arg0 ^ 0x8C5711C5, this.field5244, this.field5240, this.field5237);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIIIII)V", line = 539)
    public static final void method2350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 < 111) {
            field5239 = -1.0522764F;
        }
        field5257++;
        if (arg0 == arg6 && arg2 == arg8 && arg7 == arg9 && arg1 == arg3) {
            class148.method1048(arg9, -8241, arg4, arg1, arg8, arg0);
            return;
        }
        int var10 = arg8;
        int var11 = arg8 * 3;
        int var12 = arg0 * 3;
        int var13 = arg0;
        int var14 = arg6 * 3;
        int var15 = arg2 * 3;
        int var16 = arg3 * 3;
        int var17 = arg7 * 3;
        int var18 = arg9 + var14 - arg0 - var17;
        int var19 = arg1 + var15 - arg8 - var16;
        int var20 = var12 + var17 - var14 - var14;
        int var21 = var14 - var12;
        int var22 = var15 - var11;
        int var23 = var11 + var16 - var15 - var15;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var20 * var25;
            int var27 = var24 * var25 >> 12;
            int var28 = var19 * var27;
            int var29 = var18 * var27;
            int var30 = var21 * var24;
            int var31 = var22 * var24;
            int var32 = var23 * var25;
            int var33 = arg0 + (var26 + var29 + var30 >> 12);
            int var34 = (var28 + var32 + var31 >> 12) + arg8;
            class148.method1048(var33, -8241, arg4, var34, var10, var13);
            var10 = var34;
            var13 = var33;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()I", line = 615)
    public final int method112() {
        field5261++;
        return this.field5247;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)V", line = 623)
    public static final void method2351(int arg0, int arg1, int arg2) {
        field5259++;
        class75 var3 = class204.method1371(5, arg0 - 13399, arg1);
        var3.method524((byte) 57);
        var3.field1122 = arg2;
        if (arg0 != 13406) {
            method2347((String) null, (byte) -93);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)V", line = 658)
    public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5252++;
    }
}
