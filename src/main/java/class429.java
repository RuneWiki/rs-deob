import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class429 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[I")
    public static int[] field6114 = new int[3];

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lja;")
    public static class209 field6115;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field6118;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILtq;ILje;I)V", line = 13)
    public static final void method2519(int arg0, class63 arg1, int arg2, class178 arg3, int arg4) {
        field6113++;
        if (arg0 <= 71) {
            return;
        }
        class401 var5 = arg3.method1235(arg1, (byte) 122);
        if (var5 == null) {
            return;
        }
        arg1.method500(arg4, arg2, arg3.field2595 + arg4, arg3.field2589 + arg2);
        if (class488.field6847 == 2 || class488.field6847 == 5 || class44.field628 == null) {
            arg1.method499(-16777216, var5, arg4, arg2);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class469.field6596 == 4) {
            var6 = class128.field1787;
            var7 = class492.field6932;
            var8 = 4096;
            var9 = (int) (-class384.field5682) & 0x3FFF;
        } else {
            var8 = 4096 - (class358.field5437 * 16);
            var9 = (int) (-class384.field5682) + class347.field5291 & 0x3FFF;
            var7 = class472.field6622.field4538;
            var6 = class472.field6622.field4543;
        }
        int var10 = -(class379.field5642 * 2) - (-var6 / 32 - 208 - 48);
        int var11 = class456.field6477 * 4 + 48 - var7 / 32 - (class456.field6477 + -104) * 2;
        class44.field628.method1963((float) arg3.field2595 / 2.0F + (float) arg4, (float) arg3.field2589 / 2.0F + (float) arg2, (float) var10, (float) var11, var8, var9 << 2, var5, arg4, arg2);
        for (class145 var12 = (class145) class392.field5785.method2456(32101); var12 != null; var12 = (class145) class392.field5785.method2461(301)) {
            int var52 = var12.field2054;
            int var53 = ((class203.field3087.field6827[var52] & 0xFFFF017) >> 14) - class68.field922;
            int var54 = (class203.field3087.field6827[var52] & 0x3FFF) - class468.field6588;
            int var55 = var53 * 4 + 2 - (var6 / 32);
            int var56 = var54 * 4 - ((var7 / 32) - 2);
            class53.method386(arg2, arg3, arg1, arg4, -113, var55, var5, var56, class203.field3087.field6830[var52]);
        }
        for (int var13 = 0; var13 < class332.field4967; var13++) {
            int var49 = class402.field5874[var13] * 4 + 2 - var6 / 32;
            int var50 = class165.field2299[var13] * 4 + 2 - (var7 / 32);
            class271 var51 = class206.field3124.method338((byte) 113, class358.field5441[var13]);
            if (var51.field4015 != null) {
                var51 = var51.method1759(class315.field4736, true);
                if (var51 == null || var51.field4038 == -1) {
                    continue;
                }
            }
            class53.method386(arg2, arg3, arg1, arg4, -93, var49, var5, var50, var51.field4038);
        }
        for (class31 var14 = (class31) class491.field6897.method2296((byte) 39); var14 != null; var14 = (class31) class491.field6897.method2297(true)) {
            int var46 = (int) (var14.field436 >> 28 & 0x3L);
            if (class24.field320 == var46) {
                int var47 = (int) (var14.field436 & 0x3FFFL) * 4 + 2 - var6 / 32;
                int var48 = (int) (var14.field436 >> 14 & 0x3FFFL) * 4 + 2 - var7 / 32;
                class109.method801(arg3, var47, class81.field1137[0], var5, arg2, arg4, var48, 1);
            }
        }
        for (int var15 = 0; var15 < class256.field3797; var15++) {
            class349 var42 = class18.field241[class236.field3441[var15]];
            if (var42 != null && var42.method2147(0) && class472.field6622.field4545 == var42.field4545) {
                class273 var43 = var42.field5309;
                if (var43 != null && var43.field4107 != null) {
                    var43 = var43.method1781(class315.field4736, true);
                }
                if (var43 != null && var43.field4137 && var43.field4118) {
                    int var44 = var42.field4543 / 32 - (var6 / 32);
                    int var45 = var42.field4538 / 32 - (var7 / 32);
                    if (var43.field4148 == -1) {
                        class109.method801(arg3, var44, class81.field1137[1], var5, arg2, arg4, var45, 1);
                    } else {
                        class53.method386(arg2, arg3, arg1, arg4, -81, var44, var5, var45, var43.field4148);
                    }
                }
            }
        }
        int var16 = class299.field4466;
        int[] var17 = class161.field2218;
        for (int var18 = 0; var18 < var16; var18++) {
            class257 var34 = class40.field565[var17[var18]];
            if (var34 != null && var34.method1698(0) && class472.field6622 != var34 && class472.field6622.field4545 == var34.field4545) {
                int var35 = var34.field4543 / 32 - (var6 / 32);
                int var36 = var34.field4538 / 32 - (var7 / 32);
                boolean var37 = false;
                for (int var38 = 0; var38 < class157.field2190; var38++) {
                    if (var34.field3839.equals(class42.field570[var38]) && class484.field6787[var38] != 0) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                for (int var40 = 0; var40 < class210.field3152; var40++) {
                    if (var34.field3839.equals(class353.field5369[var40].field5072)) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                if (class472.field6622.field3822 != 0 && var34.field3822 != 0 && class472.field6622.field3822 == var34.field3822) {
                    var41 = true;
                }
                if (var37) {
                    class109.method801(arg3, var35, class81.field1137[3], var5, arg2, arg4, var36, 1);
                } else if (var39) {
                    class109.method801(arg3, var35, class81.field1137[5], var5, arg2, arg4, var36, 1);
                } else if (var41) {
                    class109.method801(arg3, var35, class81.field1137[4], var5, arg2, arg4, var36, 1);
                } else {
                    class109.method801(arg3, var35, class81.field1137[2], var5, arg2, arg4, var36, 1);
                }
            }
        }
        class208[] var19 = class365.field5522;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class208 var23 = var19[var20];
            if (var23 != null && var23.field3129 != 0 && (class452.field6418 % 20) < 10) {
                if (var23.field3129 == 1 && var23.field3134 >= 0 && var23.field3134 < class18.field241.length) {
                    class349 var24 = class18.field241[var23.field3134];
                    if (var24 != null) {
                        int var25 = var24.field4543 / 32 - (var6 / 32);
                        int var26 = var24.field4538 / 32 - (var7 / 32);
                        class333.method2040(360000, var25, arg3, false, arg4, arg2, var5, var23.field3135, var26);
                    }
                }
                if (var23.field3129 == 2) {
                    int var27 = (var23.field3141 - class68.field922) * 4 + 2 - (var6 / 32);
                    int var28 = (var23.field3136 - class468.field6588) * 4 + 2 - (var7 / 32);
                    int var29 = var23.field3131 * 4;
                    int var30 = var29 * var29;
                    class333.method2040(var30, var27, arg3, false, arg4, arg2, var5, var23.field3135, var28);
                }
                if (var23.field3129 == 10 && var23.field3134 >= 0 && var23.field3134 < class40.field565.length) {
                    class257 var31 = class40.field565[var23.field3134];
                    if (var31 != null) {
                        int var32 = var31.field4543 / 32 - (var6 / 32);
                        int var33 = var31.field4538 / 32 - var7 / 32;
                        class333.method2040(360000, var32, arg3, false, arg4, arg2, var5, var23.field3135, var33);
                    }
                }
            }
        }
        if (class469.field6596 == 4) {
            return;
        }
        if (class37.field492 != 0) {
            int var21 = (class37.field492 * 4 - var6 / 32 - (-(class472.field6622.method1705((byte) 65) * 2) + 2)) + 2;
            int var22 = class106.field1483 * 4 + class472.field6622.method1705((byte) 65) * 2 + 2 - (var7 / 32) - 2;
            class109.method801(arg3, var21, class182.field2701[class105.field1482 ? 1 : 0], var5, arg2, arg4, var22, 1);
        }
        arg1.method530(3, -1, arg2 + (arg3.field2589 / 2) - 1, (byte) 108, arg4 + (arg3.field2595 / 2) - 1, 3);
        return;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 313)
    public static void method2520(int arg0) {
        if (arg0 <= 47) {
            field6116 = 89;
        }
        field6118 = null;
        field6115 = null;
        field6114 = null;
    }
}
