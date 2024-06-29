import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class79 {

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field1285 = 0;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "J")
    public static long field1286 = 0L;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "Lks;")
    public static class421 field1287;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field1284;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)Z")
    public static final boolean method459(int arg0, int arg1, int arg2) {
        if (arg1 > -91) {
            method462(null, 77, 75, -85, null);
        }
        field1288++;
        if (!class683.field9638) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class220.field2917[var3] == null || class220.field2917[var3][var4] == null) {
            return false;
        }
        class5 var5 = class220.field2917[var3][var4];
        if (arg2 == -1 && var5.field172 == 0) {
            for (class426 var6 = (class426) class152.field2150.method1904(false); var6 != null; var6 = (class426) class152.field2150.method1901(103)) {
                if (var6.field6223 == 46 || var6.field6223 == 1008 || var6.field6223 == 2 || var6.field6223 == 15 || var6.field6223 == 23) {
                    for (class5 var7 = class705.method3944(var6.field6226, (byte) 121); var7 != null; var7 = class622.method3587(var7, -1087028336)) {
                        if (var5.field65 == var7.field65) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class426 var8 = (class426) class152.field2150.method1904(false); var8 != null; var8 = (class426) class152.field2150.method1901(95)) {
                if (var8.field6230 == arg2 && var5.field65 == var8.field6226 && (var8.field6223 == 46 || var8.field6223 == 1008 || var8.field6223 == 2 || var8.field6223 == 15 || var8.field6223 == 23)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static void method460(int arg0) {
        field1284 = null;
        if (arg0 == 16985) {
            field1287 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BIII)I")
    public static final int method461(byte arg0, int arg1, int arg2, int arg3) {
        field1290++;
        if (arg0 < 40) {
            return -90;
        } else if (arg2 >= arg3) {
            return arg2 > arg1 ? arg1 : arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lps;IIILr;)V")
    public static final void method462(class5 arg0, int arg1, int arg2, int arg3, class98 arg4) {
        int var5 = 71 / ((arg3 + 23) / 35);
        field1289++;
        class591 var6 = arg0.method18(arg4, (byte) 68);
        if (var6 == null) {
            return;
        }
        arg4.method652(arg2, arg1, arg0.field202 + arg2, arg1 - -arg0.field76);
        if (class65.field1038 == 2 || class65.field1038 == 5 || class11.field269 == null) {
            arg4.method715(-16777216, var6, arg2, arg1);
            return;
        }
        int var7;
        int var8;
        int var9;
        int var10;
        if (class684.field9659 == 4) {
            var9 = class475.field6814;
            var8 = 4096;
            var10 = class35.field550;
            var7 = (int) (-class311.field4589) & 0x3FFF;
        } else {
            var7 = (int) (-class311.field4589) + class53.field817 & 0x3FFF;
            var8 = 4096 - (class697.field9826 * 16);
            var9 = class321.field4681.field7895;
            var10 = class321.field4681.field7896;
        }
        int var11 = (var9 / 128) + 48 - ((class72.field1144 + -104) * 2);
        int var12 = 208 - (class668.field9444 * 2 + (var10 / 128) - (class668.field9444 * 4) - 48);
        class11.field269.method1529((float) arg0.field202 / 2.0F + (float) arg2, (float) arg0.field76 / 2.0F + (float) arg1, (float) var11, (float) var12, var8, var7 << 2, var6, arg2, arg1);
        for (class258 var13 = (class258) class586.field8500.method1904(false); var13 != null; var13 = (class258) class586.field8500.method1901(119)) {
            int var59 = var13.field3352;
            int var60 = (class103.field1546.field1080[var59] >> 14 & 0x3FFF) - class397.field6005;
            int var61 = (class103.field1546.field1080[var59] & 0x3FFF) - class403.field6049;
            int var62 = var60 * 4 + 2 - (var9 / 128);
            int var63 = var61 * 4 - ((var10 / 128) - 2);
            class634.method3635(var6, arg4, var63, arg2, arg1, class103.field1546.field1079[var59], 2, arg0, var62);
        }
        for (int var14 = 0; var14 < class147.field2095; var14++) {
            int var56 = class326.field4720[var14] * 4 + 2 - var9 / 128;
            int var57 = class8.field230[var14] * 4 + 2 - (var10 / 128);
            class289 var58 = class60.field965.method2596(0, class157.field2237[var14]);
            if (var58.field4213 != null) {
                var58 = var58.method1788(class308.field4545, -30);
                if (var58 == null || var58.field4266 == -1) {
                    continue;
                }
            }
            class634.method3635(var6, arg4, var57, arg2, arg1, var58.field4266, 2, arg0, var56);
        }
        for (class668 var15 = (class668) class86.field1336.method1993(-68); var15 != null; var15 = (class668) class86.field1336.method1997(9831)) {
            int var51 = (int) (var15.field5740 >> 28 & 0x3L);
            if (class180.field2494 == var51) {
                int var52 = (int) (var15.field5740 & 0x3FFFL) - class397.field6005;
                int var53 = (int) (var15.field5740 >> 14 & 0x3FFFL) - class403.field6049;
                int var54 = var52 * 4 + 2 - (var9 / 128);
                int var55 = var53 * 4 - ((var10 / 128) - 2);
                class492.method2815(class47.field740[0], var54, var55, arg1, arg0, var6, (byte) 111, arg2);
            }
        }
        for (int var16 = 0; var16 < class155.field2213; var16++) {
            class177 var46 = (class177) class271.field3550.method2002((byte) -117, (long) class523.field7379[var16]);
            if (var46 != null) {
                class53 var47 = var46.field2476;
                if (var47.method322(-5658) && class321.field4681.field7905 == var47.field7905) {
                    class76 var48 = var47.field805;
                    if (var48 != null && var48.field1212 != null) {
                        var48 = var48.method443(class308.field4545, (byte) 104);
                    }
                    if (var48 != null && var48.field1180 && var48.field1169) {
                        int var49 = var47.field7895 / 128 - (var9 / 128);
                        int var50 = var47.field7896 / 128 - (var10 / 128);
                        if (var48.field1220 == -1) {
                            class492.method2815(class47.field740[1], var49, var50, arg1, arg0, var6, (byte) 51, arg2);
                        } else {
                            class634.method3635(var6, arg4, var50, arg2, arg1, var48.field1220, 2, arg0, var49);
                        }
                    }
                }
            }
        }
        int var17 = class416.field6150;
        int[] var18 = class35.field554;
        for (int var19 = 0; var19 < var17; var19++) {
            class71 var38 = class35.field551[var18[var19]];
            if (var38 != null && var38.method416(-5658) && !var38.field1130 && class321.field4681 != var38 && class321.field4681.field7905 == var38.field7905) {
                int var39 = var38.field7895 / 128 - (var9 / 128);
                int var40 = var38.field7896 / 128 - var10 / 128;
                boolean var41 = false;
                for (int var42 = 0; var42 < class356.field5266; var42++) {
                    if (var38.field1094.equals(class205.field2796[var42]) && class484.field6902[var42] != 0) {
                        var41 = true;
                        break;
                    }
                }
                boolean var43 = false;
                for (int var44 = 0; var44 < class587.field8520; var44++) {
                    if (var38.field1094.equals(class451.field6509[var44].field275)) {
                        var43 = true;
                        break;
                    }
                }
                boolean var45 = false;
                if (class321.field4681.field1101 != 0 && var38.field1101 != 0 && class321.field4681.field1101 == var38.field1101) {
                    var45 = true;
                }
                if (var38.field1140) {
                    class492.method2815(class47.field740[6], var39, var40, arg1, arg0, var6, (byte) -72, arg2);
                } else if (var41) {
                    class492.method2815(class47.field740[3], var39, var40, arg1, arg0, var6, (byte) 98, arg2);
                } else if (var43) {
                    class492.method2815(class47.field740[5], var39, var40, arg1, arg0, var6, (byte) 100, arg2);
                } else if (var45) {
                    class492.method2815(class47.field740[4], var39, var40, arg1, arg0, var6, (byte) 81, arg2);
                } else {
                    class492.method2815(class47.field740[2], var39, var40, arg1, arg0, var6, (byte) 70, arg2);
                }
            }
        }
        class14[] var20 = class700.field9879;
        for (int var21 = 0; var21 < var20.length; var21++) {
            class14 var24 = var20[var21];
            if (var24 != null && var24.field317 != 0 && (class45.field685 % 20) < 10) {
                if (var24.field317 == 1) {
                    class177 var25 = (class177) class271.field3550.method2002((byte) -126, (long) var24.field309);
                    if (var25 != null) {
                        class53 var26 = var25.field2476;
                        int var27 = var26.field7895 / 128 - (var9 / 128);
                        int var28 = var26.field7896 / 128 - (var10 / 128);
                        class323.method2005(arg1, var24.field312, var27, 10, var28, arg2, var6, arg0, 360000L);
                    }
                }
                if (var24.field317 == 2) {
                    int var29 = var24.field321 / 128 - (var9 / 128);
                    int var30 = var24.field313 / 128 - (var10 / 128);
                    long var31 = (long) (var24.field311 << 7);
                    long var33 = var31 * var31;
                    class323.method2005(arg1, var24.field312, var29, 10, var30, arg2, var6, arg0, var33);
                }
                if (var24.field317 == 10 && var24.field309 >= 0 && var24.field309 < class35.field551.length) {
                    class71 var35 = class35.field551[var24.field309];
                    if (var35 != null) {
                        int var36 = var35.field7895 / 128 - (var9 / 128);
                        int var37 = var35.field7896 / 128 - var10 / 128;
                        class323.method2005(arg1, var24.field312, var36, 10, var37, arg2, var6, arg0, 360000L);
                    }
                }
            }
        }
        if (class684.field9659 == 4) {
            return;
        }
        if (class373.field5521 != 0) {
            int var22 = (class373.field5521 * 4 - -((class321.field4681.method422((byte) 99) + -1) * 2)) + 2 - (var9 / 128);
            int var23 = class338.field4907 * 4 + (class321.field4681.method422((byte) -50) + -1) * 2 + 2 - (var10 / 128);
            class492.method2815(class62.field980[class338.field4905 ? 1 : 0], var22, var23, arg1, arg0, var6, (byte) -92, arg2);
        }
        if (!class321.field4681.field1130) {
            arg4.method710(arg1 + (arg0.field76 / 2) - 1, 22339, -1, 3, arg0.field202 / 2 + arg2 - 1, 3);
            return;
        }
    }
}
