import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class249 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lok;")
    private static class146 field4171 = class235.method1724(-12908, "Take");

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lok;")
    public static class146 field4173 = field4171;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lok;")
    public static class146 field4179 = class235.method1724(-12908, ")4a=");

    @OriginalMember(owner = "client!u", name = "h", descriptor = "[I")
    public static int[] field4178 = new int[128];

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lwi;")
    public static class256 field4175;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIILr;)V", line = 10)
    public static final void method1821(int arg0, int arg1, int arg2, int arg3, class264 arg4) {
        field4172++;
        if (arg1 != 3) {
            method1823(true, -56);
        }
        class3.method9(-86);
        if (class271.field4640) {
            class131.method973(arg2, arg0, arg4.field4393 + arg2, arg4.field4381 + arg0);
        } else {
            class181.method1420(arg2, arg0, arg4.field4393 + arg2, arg4.field4381 + arg0);
        }
        if (class166.field2802 != 2 && class166.field2802 != 5 && class9.field187 != null) {
            int var5 = class102.field1639.field5409 / 32 + 48;
            int var6 = 464 - (class102.field1639.field5380 / 32);
            int var7 = class87.field1378 + class158.field2668 & 0x7FF;
            if (class271.field4640) {
                ((class8) class9.field187).method52(arg2, arg0, arg4.field4393, arg4.field4381, var5, var6, var7, class238.field3976 + 256, (class8) arg4.method1910(true, false));
            } else {
                ((class307) class9.field187).method1709(arg2, arg0, arg4.field4393, arg4.field4381, var5, var6, var7, class238.field3976 + 256, arg4.field4451, arg4.field4429);
            }
            if (class277.field4758 != null) {
                for (int var8 = 0; var8 < class277.field4758.field4796; var8++) {
                    if (class277.field4758.method2034(arg1 ^ 0x60, var8)) {
                        int var9 = (class277.field4758.field4792[var8] - class15.field300) * 4 + 2 - (class102.field1639.field5409 / 32);
                        int var10 = class109.field1750[var7];
                        int var11 = (class277.field4758.field4793[var8] - class201.field3357) * 4 + 2 - class102.field1639.field5380 / 32;
                        int var12 = var10 * 256 / (class238.field3976 + 256);
                        int var13 = class109.field1757[var7];
                        int var14 = var13 * 256 / (class238.field3976 + 256);
                        int var15 = var11 * var14 - (var9 * var12) >> 16;
                        int var16 = var9 * var14 + var11 * var12 >> 16;
                        class30 var17 = class274.field4725;
                        if (class277.field4758.method2030(var8, (byte) -104) == 1) {
                            var17 = class187.field3109;
                        }
                        if (class277.field4758.method2030(var8, (byte) -104) == 2) {
                            var17 = class39.field695;
                        }
                        int var18 = var17.method213(class277.field4758.field4805[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (var19 >= -arg4.field4393 && var19 <= arg4.field4393 && (-arg4.field4381) <= var15 && arg4.field4381 >= var15) {
                            int var20 = 16777215;
                            if (class277.field4758.field4798[var8] != -1) {
                                var20 = class277.field4758.field4798[var8];
                            }
                            if (class271.field4640) {
                                class131.method968((class8) arg4.method1910(true, false));
                            } else {
                                class181.method1434(arg4.field4451, arg4.field4429);
                            }
                            var17.method195(class277.field4758.field4805[var8], arg2 + var19 + (arg4.field4393 / 2), arg4.field4381 / 2 + -var15 + arg0, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class271.field4640) {
                                class131.method977();
                            } else {
                                class181.method1438();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class146.field2469; var21++) {
                int var22 = class214.field3533[var21] * 4 + 2 - (class102.field1639.field5409 / 32);
                int var23 = class17.field344[var21] * 4 + 2 - (class102.field1639.field5380 / 32);
                class5 var24 = class112.method756((byte) 89, class91.field1440[var21]);
                if (var24.field105 != null) {
                    var24 = var24.method36((byte) -106);
                    if (var24 == null || var24.field100 == -1) {
                        continue;
                    }
                }
                class190.method1468(arg0, var23, arg4, arg2, var22, 0, class268.field4613[var24.field100]);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class160 var27 = class268.field4614[class203.field3387][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 - ((class102.field1639.field5409 / 32) - 2);
                        int var29 = var26 * 4 + 2 - (class102.field1639.field5380 / 32);
                        class190.method1468(arg0, var29, arg4, arg2, var28, 0, class39.field691[0]);
                    }
                }
            }
            for (int var30 = 0; var30 < class151.field2574; var30++) {
                class282 var31 = class173.field2906[class210.field3476[var30]];
                if (var31 != null && var31.method1719((byte) -119)) {
                    class301 var32 = var31.field4838;
                    if (var32 != null && var32.field5092 != null) {
                        var32 = var32.method2135(-1);
                    }
                    if (var32 != null && var32.field5134 && var32.field5142) {
                        int var33 = var31.field5409 / 32 - (class102.field1639.field5409 / 32);
                        int var34 = var31.field5380 / 32 - (class102.field1639.field5380 / 32);
                        if (var32.field5129 == -1) {
                            class190.method1468(arg0, var34, arg4, arg2, var33, arg1 - 3, class39.field691[1]);
                        } else {
                            class190.method1468(arg0, var34, arg4, arg2, var33, 0, class268.field4613[var32.field5129]);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class158.field2670; var35++) {
                class234 var36 = class75.field1215[class112.field1791[var35]];
                if (var36 != null && var36.method1719((byte) -88)) {
                    int var37 = var36.field5409 / 32 - (class102.field1639.field5409 / 32);
                    boolean var38 = false;
                    int var39 = var36.field5380 / 32 - (class102.field1639.field5380 / 32);
                    long var40 = var36.field3891.method1123(-13726);
                    for (int var42 = 0; var42 < class226.field3772; var42++) {
                        if (class144.field2417[var42] == var40 && class137.field2282[var42] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class146.field2481; var44++) {
                        if (class258.field4283[var44].field2883 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class102.field1639.field3883 != 0 && var36.field3883 != 0 && class102.field1639.field3883 == var36.field3883) {
                        var45 = true;
                    }
                    if (var38) {
                        class190.method1468(arg0, var39, arg4, arg2, var37, 0, class39.field691[3]);
                    } else if (var43) {
                        class190.method1468(arg0, var39, arg4, arg2, var37, 0, class39.field691[5]);
                    } else if (var45) {
                        class190.method1468(arg0, var39, arg4, arg2, var37, 0, class39.field691[4]);
                    } else {
                        class190.method1468(arg0, var39, arg4, arg2, var37, 0, class39.field691[2]);
                    }
                }
            }
            class197[] var46 = class216.field3569;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class197 var48 = var46[var47];
                if (var48 != null && var48.field3285 != 0 && (class203.field3385 % 20) < 10) {
                    if (var48.field3285 == 1 && var48.field3289 >= 0 && var48.field3289 < class173.field2906.length) {
                        class282 var49 = class173.field2906[var48.field3289];
                        if (var49 != null) {
                            int var50 = var49.field5409 / 32 - (class102.field1639.field5409 / 32);
                            int var51 = var49.field5380 / 32 - (class102.field1639.field5380 / 32);
                            class79.method570(var50, var51, arg0, false, arg2, var48.field3288, arg4);
                        }
                    }
                    if (var48.field3285 == 2) {
                        int var52 = (var48.field3279 - class201.field3357) * 4 + 2 - (class102.field1639.field5380 / 32);
                        int var53 = (var48.field3277 - class15.field300) * 4 + 2 - class102.field1639.field5409 / 32;
                        class79.method570(var53, var52, arg0, false, arg2, var48.field3288, arg4);
                    }
                    if (var48.field3285 == 10 && var48.field3289 >= 0 && class75.field1215.length > var48.field3289) {
                        class234 var54 = class75.field1215[var48.field3289];
                        if (var54 != null) {
                            int var55 = var54.field5409 / 32 - (class102.field1639.field5409 / 32);
                            int var56 = var54.field5380 / 32 - (class102.field1639.field5380 / 32);
                            class79.method570(var55, var56, arg0, false, arg2, var48.field3288, arg4);
                        }
                    }
                }
            }
            if (class230.field3854 != 0) {
                int var57 = class230.field3854 * 4 - (class102.field1639.field5409 / 32 - 2);
                int var58 = class171.field2893 * 4 + 2 - (class102.field1639.field5380 / 32);
                class190.method1468(arg0, var58, arg4, arg2, var57, 0, class179.field3012);
            }
            if (class271.field4640) {
                class131.method978(arg4.field4393 / 2 + arg2 - 1, arg4.field4381 / 2 + -1 + arg0, 3, 3, 16777215);
            } else {
                class181.method1416(arg4.field4393 / 2 + arg2 - 1, arg4.field4381 / 2 + -1 + arg0, 3, 3, 16777215);
            }
        } else if (class271.field4640) {
            class70 var59 = arg4.method1910(true, false);
            if (var59 != null) {
                var59.method47(arg2, arg0);
            }
        } else {
            class181.method1436(arg2, arg0, 0, arg4.field4451, arg4.field4429);
        }
        class269.field4623[arg3] = true;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 360)
    public static void method1822(int arg0) {
        field4173 = null;
        field4175 = null;
        if (arg0 != 32) {
            method1823(true, -97);
        }
        field4171 = null;
        field4179 = null;
        field4178 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)Lee;", line = 397)
    public static final class274 method1823(boolean arg0, int arg1) {
        class274 var2 = (class274) class39.field688.method799((byte) 52, (long) arg1);
        field4174++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class150.field2555.method92(1, 0, arg1);
        class274 var4 = new class274();
        if (!arg0) {
            method1822(108);
        }
        if (var3 != null) {
            var4.method2003(new class47(var3), arg1, 1);
        }
        class39.field688.method797(var4, 0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method461(byte arg0, Component arg1);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method460(Component arg0, int arg1);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
    public abstract int method459(byte arg0);
}
