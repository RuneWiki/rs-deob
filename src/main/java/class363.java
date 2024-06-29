import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class363 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Z")
    public static boolean field5221 = false;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field5226 = 0;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field5227 = 0;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Ltr;")
    public static class176 field5224;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILnp;ILdt;)V")
    public static final void method2243(int arg0, int arg1, class313 arg2, int arg3, class145 arg4) {
        field5223++;
        if (arg3 != 4096) {
            return;
        }
        class171 var5 = arg4.method911(arg2, (byte) -122);
        if (var5 == null) {
            return;
        }
        arg2.method617(arg1, arg0, arg4.field2010 + arg1, arg4.field2021 + arg0);
        if (class54.field729 == 2 || class54.field729 == 5 || class26.field346 == null) {
            arg2.method665(-16777216, var5, arg1, arg0);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class136.field1807 == 4) {
            var6 = class317.field4596;
            var7 = (int) (-class157.field2346) & 0x3FFF;
            var8 = class453.field6393;
            var9 = 4096;
        } else {
            var7 = (int) (-class157.field2346) + class84.field1032 & 0x3FFF;
            var9 = 4096 - (class216.field3251 * 16);
            var8 = class492.field6935.field4331;
            var6 = class492.field6935.field4317;
        }
        int var10 = var8 / 32 + 48 - ((class58.field758 - 104) * 2);
        int var11 = class287.field4181 * 4 + (48 + 208 - (var6 / 32) - class287.field4181 * 2);
        class26.field346.method1081((float) arg4.field2010 / 2.0F + (float) arg1, (float) arg4.field2021 / 2.0F + (float) arg0, (float) var10, (float) var11, var9, var7 << 2, var5, arg1, arg0);
        for (class324 var12 = (class324) class44.field636.method2843(1123227612); var12 != null; var12 = (class324) class44.field636.method2842(1673506446)) {
            int var52 = var12.field4676;
            int var53 = ((class269.field3929.field513[var52] & 0xFFFD7A7) >> 14) - class240.field3602;
            int var54 = (class269.field3929.field513[var52] & 0x3FFF) - class360.field5180;
            int var55 = var53 * 4 - ((var8 / 32) - 2);
            int var56 = var54 * 4 + 2 - (var6 / 32);
            class306.method1894(var55, arg1, arg0, var56, class269.field3929.field515[var52], arg4, arg2, (byte) -46, var5);
        }
        for (int var13 = 0; var13 < class318.field4616; var13++) {
            int var49 = class273.field3977[var13] * 4 + 2 - (var8 / 32);
            int var50 = class325.field4680[var13] * 4 + 2 - (var6 / 32);
            class453 var51 = class156.field2325.method808(class140.field1857[var13], 0);
            if (var51.field6306 != null) {
                var51 = var51.method2655(73, class140.field1859);
                if (var51 == null || var51.field6384 == -1) {
                    continue;
                }
            }
            class306.method1894(var49, arg1, arg0, var50, var51.field6384, arg4, arg2, (byte) -46, var5);
        }
        for (class442 var14 = (class442) class269.field3928.method2769((byte) -73); var14 != null; var14 = (class442) class269.field3928.method2768((byte) -88)) {
            int var46 = (int) (var14.field3568 >> 28 & 0x3L);
            if (class61.field801 == var46) {
                int var47 = (int) (var14.field3568 & 0x3FFFL) * 4 + 2 - (var8 / 32);
                int var48 = (int) (var14.field3568 >> 14 & 0x3FFFL) * 4 + 2 - var6 / 32;
                class55.method343(var48, class311.field4397[0], arg1, (byte) 99, var5, var47, arg0, arg4);
            }
        }
        for (int var15 = 0; var15 < class225.field3418; var15++) {
            class216 var42 = class139.field1851[class281.field4139[var15]];
            if (var42 != null && var42.method1390((byte) 75) && class492.field6935.field4319 == var42.field4319) {
                class466 var43 = var42.field3232;
                if (var43 != null && var43.field6526 != null) {
                    var43 = var43.method2742(-87, class140.field1859);
                }
                if (var43 != null && var43.field6576 && var43.field6552) {
                    int var44 = var42.field4331 / 32 - (var8 / 32);
                    int var45 = var42.field4317 / 32 - (var6 / 32);
                    if (var43.field6567 == -1) {
                        class55.method343(var45, class311.field4397[1], arg1, (byte) 87, var5, var44, arg0, arg4);
                    } else {
                        class306.method1894(var44, arg1, arg0, var45, var43.field6567, arg4, arg2, (byte) -46, var5);
                    }
                }
            }
        }
        int var16 = class37.field491;
        int[] var17 = class348.field5033;
        for (int var18 = 0; var18 < var16; var18++) {
            class452 var34 = class124.field1559[var17[var18]];
            if (var34 != null && var34.method2645((byte) 75) && class492.field6935 != var34 && class492.field6935.field4319 == var34.field4319) {
                int var35 = var34.field4331 / 32 - (var8 / 32);
                int var36 = var34.field4317 / 32 - (var6 / 32);
                boolean var37 = false;
                for (int var38 = 0; var38 < class237.field3564; var38++) {
                    if (var34.field6277.equals(class24.field310[var38]) && class243.field3624[var38] != 0) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                for (int var40 = 0; var40 < class58.field755; var40++) {
                    if (var34.field6277.equals(class88.field1073[var40].field4141)) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                if (class492.field6935.field6281 != 0 && var34.field6281 != 0 && class492.field6935.field6281 == var34.field6281) {
                    var41 = true;
                }
                if (var37) {
                    class55.method343(var36, class311.field4397[3], arg1, (byte) 112, var5, var35, arg0, arg4);
                } else if (var39) {
                    class55.method343(var36, class311.field4397[5], arg1, (byte) 78, var5, var35, arg0, arg4);
                } else if (var41) {
                    class55.method343(var36, class311.field4397[4], arg1, (byte) 113, var5, var35, arg0, arg4);
                } else {
                    class55.method343(var36, class311.field4397[2], arg1, (byte) 74, var5, var35, arg0, arg4);
                }
            }
        }
        class141[] var19 = class273.field3974;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class141 var23 = var19[var20];
            if (var23 != null && var23.field1877 != 0 && (class353.field5090 % 20) < 10) {
                if (var23.field1877 == 1 && var23.field1872 >= 0 && class139.field1851.length > var23.field1872) {
                    class216 var24 = class139.field1851[var23.field1872];
                    if (var24 != null) {
                        int var25 = var24.field4331 / 32 - var8 / 32;
                        int var26 = var24.field4317 / 32 - (var6 / 32);
                        class81.method458(var26, var5, arg4, 124, 360000, var25, arg0, arg1, var23.field1876);
                    }
                }
                if (var23.field1877 == 2) {
                    int var27 = (var23.field1871 - class240.field3602) * 4 + 2 - (var8 / 32);
                    int var28 = (var23.field1866 - class360.field5180) * 4 + 2 - var6 / 32;
                    int var29 = var23.field1873 * 4;
                    int var30 = var29 * var29;
                    class81.method458(var28, var5, arg4, 124, var30, var27, arg0, arg1, var23.field1876);
                }
                if (var23.field1877 == 10 && var23.field1872 >= 0 && class124.field1559.length > var23.field1872) {
                    class452 var31 = class124.field1559[var23.field1872];
                    if (var31 != null) {
                        int var32 = var31.field4331 / 32 - (var8 / 32);
                        int var33 = var31.field4317 / 32 - (var6 / 32);
                        class81.method458(var33, var5, arg4, 124, 360000, var32, arg0, arg1, var23.field1876);
                    }
                }
            }
        }
        if (class136.field1807 == 4) {
            return;
        }
        if (class118.field1493 != 0) {
            int var21 = class118.field1493 * 4 - ((var8 / 32) - (class492.field6935.method918(false) * 2 + -2) - 2);
            int var22 = class359.field5161 * 4 + ((class492.field6935.method918(false) + -1) * 2) - ((var6 / 32) - 2);
            class55.method343(var22, class231.field3496[class326.field4710 ? 1 : 0], arg1, (byte) 108, var5, var21, arg0, arg4);
        }
        arg2.method1941(3, arg4.field2021 / 2 + arg0 - 1, 1, 3, arg4.field2010 / 2 + arg1 - 1, -1);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lnm;)V")
    public static final void method2244(class304 arg0) {
        for (int var1 = arg0.field4330; var1 <= arg0.field4328; var1++) {
            for (int var2 = arg0.field4324; var2 <= arg0.field4334; var2++) {
                class88 var3 = class330.field4786[arg0.field4319][var1][var2];
                if (var3 != null) {
                    class93 var4 = var3.field1068;
                    class93 var5 = null;
                    while (var4 != null) {
                        if (var4.field1177 == arg0) {
                            if (var5 == null) {
                                var3.field1068 = var4.field1178;
                            } else {
                                var5.field1178 = var4.field1178;
                            }
                            var4.method530((byte) 29);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field1178;
                    }
                    var3.field1075 = 0;
                    for (class93 var6 = var3.field1068; var6 != null; var6 = var6.field1178) {
                        var3.field1075 = (byte) (var3.field1075 | var6.field1174);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method2245(int arg0) {
        field5224 = null;
        if (arg0 != 3) {
            field5221 = true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)V")
    public static final void method2246(int arg0, boolean arg1) {
        field5228++;
        class489 var2 = class116.method731(-625541408, 10, arg0);
        if (!arg1) {
            var2.method2861(-229012000);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILer;)Ler;")
    public abstract class61 method742(int arg0, class61 arg1);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BZ)V")
    public static final void method2247(byte arg0, boolean arg1) {
        if (arg1 && class395.field5606 != null) {
            class200.field2918 = class395.field5606.field2578;
        } else {
            class200.field2918 = -1;
        }
        field5222++;
        class307.field4372 = null;
        class482.field6790 = 0;
        class395.field5606 = null;
        class65.field839 = null;
        class395.method2357();
        class395.field5609.method2838((byte) 2);
        class40.field519 = null;
        class462.field6466 = null;
        class338.field4931 = null;
        class394.field5597 = null;
        class395.field5610 = null;
        if (arg0 != 68) {
            return;
        }
        class208.field3171 = null;
        class460.field6458 = null;
        class230.field3474 = -1;
        class476.field6689 = null;
        class377.field5427 = -1;
        field5224 = null;
        class307.field4374 = null;
        class395.field5604.method489(0);
        class395.field5608.method202(true, 64, 64);
        class395.field5604.method487(27843, 128, 64);
        class395.field5605.method807(64, -75);
        class467.field6582.method1104(64, -203);
    }
}
