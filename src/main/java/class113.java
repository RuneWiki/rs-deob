import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class113 extends class206 {

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "Lmh;")
    public class62 field1867;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "Lmh;")
    public static class62 field1875 = class201.method1405(true, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "Lmh;")
    public static class62 field1868 = class201.method1405(true, "gelb:");

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "Z")
    public static boolean field1877 = true;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "[I")
    public static int[] field1879 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "Lmh;")
    private static class62 field1886 = class201.method1405(true, " ");

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "Lmh;")
    public static class62 field1876 = class201.method1405(true, "<col=ff9040>");

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "Z")
    public static boolean field1870 = false;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "Lmh;")
    public static class62 field1872 = field1886;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "Lhi;")
    public static class26 field1874;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "Lfg;")
    public static class74 field1871;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "[I")
    public static int[] field1878;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "[Lfd;")
    public static class61[] field1881;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 6)
    public static void method880(int arg0) {
        field1875 = null;
        field1871 = null;
        field1879 = null;
        field1881 = null;
        field1876 = null;
        field1872 = null;
        field1874 = null;
        field1886 = null;
        field1868 = null;
        if (arg0 > -70) {
            method885((class295) null, -98, 42, -41, -27, -34, -37, true);
        }
        field1878 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ls;IIZBI)V", line = 32)
    public static final void method881(class96 arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        field1873++;
        if (class39.field603 >= 50 || arg0.field1561 == null || arg5 >= arg0.field1561.length || arg0.field1561[arg5] == null || arg4 >= -33) {
            return;
        }
        int var6 = arg0.field1561[arg5][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0x77) >> 4;
        int var9 = var6 & 0xF;
        if (arg0.field1561[arg5].length > 1) {
            int var10 = (int) (Math.random() * (double) arg0.field1561[arg5].length);
            if (var10 > 0) {
                var7 = arg0.field1561[arg5][var10];
            }
        }
        if (var9 == 0) {
            if (arg3) {
                class281.method1919(var8, 0, -26080, var7);
            }
        } else if (class114.field1902 != 0) {
            int var11 = (arg1 - 64) / 128;
            int var12 = (arg2 - 64) / 128;
            class164.field2653[class39.field603] = var7;
            class261.field4382[class39.field603] = var8;
            class37.field524[class39.field603] = 0;
            class162.field2624[class39.field603] = null;
            class151.field2383[class39.field603] = (var11 << 16) + (var12 << 8) + var9;
            class39.field603++;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 93)
    public class113() {
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lsg;ZIII)V", line = 103)
    public static final void method882(class191 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class209.method1460(118);
        class311.method2118(arg4, arg2, arg0.field3190 + arg4, arg0.field3126 + arg2);
        if (class29.field372 == 2 || class29.field372 == 5 || class177.field2828 == null) {
            class135 var57 = arg0.method1340(false, (byte) -111);
            if (var57 != null) {
                var57.method305(arg4, arg2);
            }
        } else {
            int var5 = class267.field4516 + class187.field2984 & 0x7FF;
            int var6 = 464 - (class268.field4551.field3814 / 32);
            int var7 = class268.field4551.field3821 / 32 + 48;
            ((class257) class177.field2828).method1785(arg4, arg2, arg0.field3190, arg0.field3126, var7, var6, var5, class149.field2350 + 256, (class257) arg0.method1340(false, (byte) -114));
            if (class270.field4590 != null) {
                for (int var8 = 0; var8 < class270.field4590.field3942; var8++) {
                    if (class270.field4590.method1602(var8, -5)) {
                        int var9 = (class270.field4590.field3931[var8] - class120.field2006) * 4 + 2 - (class268.field4551.field3821 / 32);
                        int var10 = class23.field245[var5];
                        int var11 = var10 * 256 / (class149.field2350 + 256);
                        int var12 = (class270.field4590.field3929[var8] - class290.field4936) * 4 + 2 - (class268.field4551.field3814 / 32);
                        int var13 = class23.field254[var5];
                        int var14 = var13 * 256 / (class149.field2350 + 256);
                        int var15 = var9 * var14 + var11 * var12 >> 16;
                        int var16 = var12 * var14 - (var9 * var11) >> 16;
                        class299 var17 = class125.field2097;
                        if (class270.field4590.method1598(var8, (byte) -86) == 1) {
                            var17 = class20.field195;
                        }
                        if (class270.field4590.method1598(var8, (byte) -86) == 2) {
                            var17 = class296.field5047;
                        }
                        int var18 = var17.method2027(class270.field4590.field3934[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (var19 >= (-arg0.field3190) && arg0.field3190 >= var19 && -arg0.field3126 <= var16 && arg0.field3126 >= var16) {
                            int var20 = 16777215;
                            if (class270.field4590.field3940[var8] != -1) {
                                var20 = class270.field4590.field3940[var8];
                            }
                            class311.method2108((class257) arg0.method1340(false, (byte) -128));
                            var17.method2024(class270.field4590.field3934[var8], arg0.field3190 / 2 + arg4 + var19, arg0.field3126 / 2 + -var16 + arg2, var18, 50, var20, 0, 256, 1, 0, 0);
                            class311.method2116();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class246.field4183; var21++) {
                int var22 = class163.field2645[var21] * 4 + 2 - (class268.field4551.field3821 / 32);
                int var23 = class4.field36[var21] * 4 + (2 - class268.field4551.field3814 / 32);
                class216 var24 = class252.method1755(class290.field4927[var21], (byte) -86);
                if (var24.field3709 != null) {
                    var24 = var24.method1526(33);
                    if (var24 == null || var24.field3704 == -1) {
                        continue;
                    }
                }
                class234.method1653(class119.field1990[var24.field3704], arg2, arg4, var23, arg0, var22, (byte) 64);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class52 var27 = class7.field72[class7.field85][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class268.field4551.field3821 / 32);
                        int var29 = var26 * 4 + 2 - (class268.field4551.field3814 / 32);
                        class234.method1653(class293.field4982[0], arg2, arg4, var29, arg0, var28, (byte) 64);
                    }
                }
            }
            for (int var30 = 0; var30 < class133.field2163; var30++) {
                class204 var31 = class301.field5186[class288.field4914[var30]];
                if (var31 != null && var31.method1100(26422)) {
                    class275 var32 = var31.field3435;
                    if (var32 != null && var32.field4720 != null) {
                        var32 = var32.method1878(false);
                    }
                    if (var32 != null && var32.field4704 && var32.field4708) {
                        int var33 = var31.field3821 / 32 - (class268.field4551.field3821 / 32);
                        int var34 = var31.field3814 / 32 - class268.field4551.field3814 / 32;
                        class234.method1653(class293.field4982[1], arg2, arg4, var34, arg0, var33, (byte) 64);
                    }
                }
            }
            for (int var35 = 0; var35 < class118.field1975; var35++) {
                class153 var36 = class5.field50[class98.field1617[var35]];
                if (var36 != null && var36.method1100(26422)) {
                    int var37 = var36.field3821 / 32 - (class268.field4551.field3821 / 32);
                    boolean var38 = false;
                    int var39 = var36.field3814 / 32 - (class268.field4551.field3814 / 32);
                    long var40 = var36.field2430.method451(64);
                    for (int var42 = 0; var42 < class190.field3042; var42++) {
                        if (class64.field963[var42] == var40 && class26.field311[var42] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    if (class268.field4551.field2446 != 0 && var36.field2446 != 0 && class268.field4551.field2446 == var36.field2446) {
                        var43 = true;
                    }
                    if (var38) {
                        class234.method1653(class293.field4982[3], arg2, arg4, var39, arg0, var37, (byte) 64);
                    } else if (var43) {
                        class234.method1653(class293.field4982[4], arg2, arg4, var39, arg0, var37, (byte) 64);
                    } else {
                        class234.method1653(class293.field4982[2], arg2, arg4, var39, arg0, var37, (byte) 64);
                    }
                }
            }
            class133[] var44 = class189.field3012;
            for (int var45 = 0; var45 < var44.length; var45++) {
                class133 var46 = var44[var45];
                if (var46 != null && var46.field2171 != 0 && (class199.field3367 % 20) < 10) {
                    if (var46.field2171 == 1 && var46.field2173 >= 0 && class301.field5186.length > var46.field2173) {
                        class204 var47 = class301.field5186[var46.field2173];
                        if (var47 != null) {
                            int var48 = var47.field3821 / 32 - (class268.field4551.field3821 / 32);
                            int var49 = var47.field3814 / 32 - class268.field4551.field3814 / 32;
                            class77.method601((byte) 66, arg2, var48, arg4, arg0, var49, var46.field2158);
                        }
                    }
                    if (var46.field2171 == 2) {
                        int var50 = (var46.field2156 - class120.field2006) * 4 + 2 - (class268.field4551.field3821 / 32);
                        int var51 = (var46.field2161 - class290.field4936) * 4 + 2 - class268.field4551.field3814 / 32;
                        class77.method601((byte) 66, arg2, var50, arg4, arg0, var51, var46.field2158);
                    }
                    if (var46.field2171 == 10 && var46.field2173 >= 0 && var46.field2173 < class5.field50.length) {
                        class153 var52 = class5.field50[var46.field2173];
                        if (var52 != null) {
                            int var53 = var52.field3821 / 32 - class268.field4551.field3821 / 32;
                            int var54 = var52.field3814 / 32 - class268.field4551.field3814 / 32;
                            class77.method601((byte) 66, arg2, var53, arg4, arg0, var54, var46.field2158);
                        }
                    }
                }
            }
            if (class152.field2398 != 0) {
                int var55 = class236.field4062 * 4 + 2 - (class268.field4551.field3814 / 32);
                int var56 = class152.field2398 * 4 + 2 - (class268.field4551.field3821 / 32);
                class234.method1653(class245.field4169, arg2, arg4, var55, arg0, var56, (byte) 64);
            }
            class311.method2117(arg4 + (arg0.field3190 / 2) - 1, arg0.field3126 / 2 + -1 + arg2, 3, 3, 16777215);
        }
        field1885++;
        class220.field3784[arg3] = true;
        if (arg1) {
            field1872 = (class62) null;
        }
        class159.field2560[arg3] = true;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lmh;)V", line = 406)
    public class113(class62 arg0) {
        this.field1867 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)I", line = 432)
    public static final int method883(int arg0, int arg1) {
        field1884++;
        int var2 = 26 % ((arg1 + 27) / 54);
        return arg0 == 16711935 ? -1 : class275.method1886(arg0, -22322);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Z", line = 445)
    public static final boolean method884(int arg0) {
        field1880++;
        if (class19.field186 != arg0) {
            try {
                return !(Boolean) class30.field412.method406((byte) 61, class193.field3246.field4878);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lsj;IIIIIIZ)V", line = 466)
    public static final void method885(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field5041.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field5041[var9] - class144.field2300;
            int var11 = arg0.field5038[var9] - class293.field4981;
            int var12 = arg0.field5034[var9] - class270.field4579;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field5039 != null) {
                class295.field5026[var9] = var13;
                class295.field5040[var9] = var16;
                class295.field5031[var9] = var17;
            }
            class295.field5030[var9] = (var13 << 9) / var17 + class23.field242;
            class295.field5044[var9] = (var16 << 9) / var17 + class23.field253;
        }
        class23.field244 = 0;
        int var19 = arg0.field5027.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field5027[var20];
            int var22 = arg0.field5025[var20];
            int var23 = arg0.field5028[var20];
            int var24 = class295.field5030[var21];
            int var25 = class295.field5030[var22];
            int var26 = class295.field5030[var23];
            int var27 = class295.field5044[var21];
            int var28 = class295.field5044[var22];
            int var29 = class295.field5044[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0 && class264.field4446 && class52.method336(class52.field757 + class23.field242, class23.field253 + class153.field2419, var27, var28, var29, var24, var25, var26)) {
                class41.field622 = arg5;
                class212.field3568 = arg6;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([Lmh;B)[Lmh;", line = 560)
    public static final class62[] method886(class62[] arg0, byte arg1) {
        field1887++;
        if (arg1 != -95) {
            method882((class191) null, false, 4, 84, 27);
        }
        class62[] var2 = new class62[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class254.method1772(new class62[] { class42.method284(var3, -118), class109.field1763 }, 0);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class254.method1772(new class62[] { var2[var3], arg0[var3] }, 0);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILmi;)V", line = 585)
    public static final void method887(int arg0, class92 arg1) {
        field1869++;
        if (arg0 != 1) {
            field1883 = 28;
        }
        while (true) {
            while (arg1.field1495.length > arg1.field1476) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method702(-1) == 1) {
                    var3 = true;
                    var4 = arg1.method702(-1);
                    var2 = arg1.method702(-1);
                }
                int var5 = arg1.method702(arg0 ^ 0xFFFFFFFE);
                int var6 = arg1.method702(-1);
                int var7 = var5 * 64 - class22.field239;
                int var8 = class164.field2666 + class248.field4219 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && var7 + 63 < class184.field2955 && class248.field4219 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var11 >= (var4 * 8) && var11 < (var4 * 8 + 8) && var2 * 8 <= var12 && var12 < var2 * 8 + 8) {
                                int var13 = arg1.method702(-1);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method702(-1);
                                        if (class271.field4609[var10][var9] == null) {
                                            class271.field4609[var10][var9] = new byte[4096];
                                        }
                                        class271.field4609[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method721(38);
                                        if (class238.field4075[var10][var9] == null) {
                                            class238.field4075[var10][var9] = new short[4096];
                                        }
                                        class238.field4075[var10][var9][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg1.method702(-1) & 0xFF) << 16) - (-((arg1.method702(-1) & 0xFF) << 8) - (arg1.method702(-1) & 0xFF));
                                        if (class32.field445[var10][var9] == null) {
                                            class32.field445[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class216 var17 = class252.method1755(var16, (byte) -95);
                                        if (var17.field3709 != null) {
                                            var17 = var17.method1526(-110);
                                            if (var17 == null || var17.field3704 == -1) {
                                                continue;
                                            }
                                        }
                                        class32.field445[var10][var9][(63 - var12 << 6) + var11] = var17.field3689 + 1;
                                        class119 var18 = new class119();
                                        var18.field1998 = var17.field3704;
                                        var18.field1985 = var8;
                                        var18.field1986 = var7;
                                        class192.field3223.method330(var18, 94);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                        int var20 = arg1.method702(-1);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field1476++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field1476 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field1476 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
