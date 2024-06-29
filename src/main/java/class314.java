import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class314 {

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[I")
    public static int[] field4803 = new int[1];

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Z")
    public static boolean field4804 = true;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[Lnl;")
    public static class472[] field4808 = new class472[14];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public int field4798;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public int field4807;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Z")
    public boolean field4799;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method2039(int arg0) {
        field4806++;
        for (int var1 = arg0; var1 < 5; var1++) {
            class185.field2614[var1] = false;
        }
        class432.field6409 = 5;
        class261.field3636 = class405.field6116;
        class241.field3397 = class154.field2246;
        class362.field5619 = 0;
        field4800 = 0;
        class207.field2930 = class301.field4447;
        class138.field2004 = class353.field5478;
        class470.field6868 = class30.field461;
        class11.field184 = -1;
        class479.field7007 = -1;
        class257.field3570 = class34.field539;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method2040(byte arg0) {
        field4808 = null;
        if (arg0 == -77) {
            field4803 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILjb;BLqa;)V")
    public static final void method2041(int arg0, int arg1, class499 arg2, byte arg3, class496 arg4) {
        field4802++;
        class15 var5 = arg2.method2975((byte) -128, arg4);
        if (var5 == null) {
            return;
        }
        arg4.method1046(arg1, arg0, arg2.field7348 + arg1, arg0 - -arg2.field7386);
        if (arg3 != -94) {
            method2039(109);
        }
        if (class93.field1352 == 2 || class93.field1352 == 5 || class261.field3634 == null) {
            arg4.method1080(-16777216, var5, arg1, arg0);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class432.field6409 == 4) {
            var7 = (int) (-class482.field7022) & 0x3FFF;
            var6 = class274.field3815;
            var9 = class209.field2963;
            var8 = 4096;
        } else {
            var6 = class339.field5365.field2217;
            var7 = (int) (-class482.field7022) + class384.field5871 & 0x3FFF;
            var8 = 4096 - class235.field3345 * 16;
            var9 = class339.field5365.field2215;
        }
        int var10 = var6 / 32 + 48 - ((class96.field1403 - 104) * 2);
        int var11 = class485.field7122 * 4 + 48 - ((class485.field7122 + -104) * 2) - var9 / 32;
        class261.field3634.method1334((float) arg2.field7348 / 2.0F + (float) arg1, (float) arg2.field7386 / 2.0F + (float) arg0, (float) var10, (float) var11, var8, var7 << 2, var5, arg1, arg0);
        for (class74 var12 = (class74) class7.field110.method1970(arg3 ^ 0xFFFFFFE2); var12 != null; var12 = (class74) class7.field110.method1960(24)) {
            int var54 = var12.field998;
            int var55 = ((class465.field6792.field5353[var54] & 0xFFFFA15) >> 14) - class82.field1105;
            int var56 = (class465.field6792.field5353[var54] & 0x3FFF) - class437.field6477;
            int var57 = var55 * 4 + 2 - (var6 / 32);
            int var58 = var56 * 4 + 2 - var9 / 32;
            class299.method1927(-22299, class465.field6792.field5358[var54], var58, arg0, arg4, arg1, var57, arg2, var5);
        }
        for (int var13 = 0; var13 < class44.field656; var13++) {
            int var51 = class93.field1349[var13] * 4 + 2 - (var6 / 32);
            int var52 = class16.field254[var13] * 4 + 2 - (var9 / 32);
            class130 var53 = class56.field755.method2031(-94, class138.field2014[var13]);
            if (var53.field1823 != null) {
                var53 = var53.method832((byte) -123, class36.field583);
                if (var53 == null || var53.field1903 == -1) {
                    continue;
                }
            }
            class299.method1927(-22299, var53.field1903, var52, arg0, arg4, arg1, var51, arg2, var5);
        }
        for (class481 var14 = (class481) class392.field5964.method948(arg3 + 157); var14 != null; var14 = (class481) class392.field5964.method938(-77)) {
            int var48 = (int) (var14.field6799 >> 28 & 0x3L);
            if (class99.field1423 == var48) {
                int var49 = (int) (var14.field6799 & 0x3FFFL) * 4 + 2 - (var6 / 32);
                int var50 = ((int) (var14.field6799 >> 14 & 0x3FFFL) * 4 + 2) - (var9 / 32);
                class432.method2585(82, var5, arg2, class432.field6406[0], var50, var49, arg1, arg0);
            }
        }
        for (int var15 = 0; var15 < class25.field411; var15++) {
            class194 var44 = class151.field2174[class259.field3609[var15]];
            if (var44 != null && var44.method1371(arg3 ^ 0xFFFFFFA2) && class339.field5365.field2210 == var44.field2210) {
                class329 var45 = var44.field2768;
                if (var45 != null && var45.field5068 != null) {
                    var45 = var45.method2125(class36.field583, false);
                }
                if (var45 != null && var45.field5049 && var45.field5088) {
                    int var46 = var44.field2217 / 32 - (var6 / 32);
                    int var47 = var44.field2215 / 32 - (var9 / 32);
                    if (var45.field5093 == -1) {
                        class432.method2585(89, var5, arg2, class432.field6406[1], var47, var46, arg1, arg0);
                    } else {
                        class299.method1927(-22299, var45.field5093, var47, arg0, arg4, arg1, var46, arg2, var5);
                    }
                }
            }
        }
        int var16 = class442.field6574;
        int[] var17 = class320.field4896;
        for (int var18 = 0; var18 < var16; var18++) {
            class322 var36 = class439.field6539[var17[var18]];
            if (var36 != null && var36.method2096(0) && class339.field5365 != var36 && class339.field5365.field2210 == var36.field2210) {
                int var37 = var36.field2217 / 32 - (var6 / 32);
                int var38 = var36.field2215 / 32 - (var9 / 32);
                boolean var39 = false;
                for (int var40 = 0; var40 < class189.field2653; var40++) {
                    if (var36.field4947.equals(class397.field6033[var40]) && class323.field4985[var40] != 0) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                for (int var42 = 0; var42 < class81.field1089; var42++) {
                    if (var36.field4947.equals(class56.field758[var42].field961)) {
                        var41 = true;
                        break;
                    }
                }
                boolean var43 = false;
                if (class339.field5365.field4953 != 0 && var36.field4953 != 0 && class339.field5365.field4953 == var36.field4953) {
                    var43 = true;
                }
                if (var36.field4978) {
                    class432.method2585(-85, var5, arg2, class432.field6406[6], var38, var37, arg1, arg0);
                } else if (var39) {
                    class432.method2585(arg3 ^ 0x6D, var5, arg2, class432.field6406[3], var38, var37, arg1, arg0);
                } else if (var41) {
                    class432.method2585(101, var5, arg2, class432.field6406[5], var38, var37, arg1, arg0);
                } else if (var43) {
                    class432.method2585(-57, var5, arg2, class432.field6406[4], var38, var37, arg1, arg0);
                } else {
                    class432.method2585(-81, var5, arg2, class432.field6406[2], var38, var37, arg1, arg0);
                }
            }
        }
        class187[] var19 = class463.field6771;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class187 var23 = var19[var20];
            if (var23 != null && var23.field2631 != 0 && class405.field6116 % 20 < 10) {
                if (var23.field2631 == 1 && var23.field2626 >= 0 && class151.field2174.length > var23.field2626) {
                    class194 var24 = class151.field2174[var23.field2626];
                    if (var24 != null) {
                        int var25 = var24.field2217 / 32 - (var6 / 32);
                        int var26 = var24.field2215 / 32 - (var9 / 32);
                        class519.method3087(arg2, 97, 360000L, arg1, var5, var23.field2629, arg0, var25, var26);
                    }
                }
                if (var23.field2631 == 2) {
                    int var27 = var23.field2624 / 32 - var6 / 32;
                    int var28 = var23.field2628 / 32 - (var9 / 32);
                    long var29 = (long) (var23.field2621 << 5);
                    long var31 = var29 * var29;
                    class519.method3087(arg2, 116, var31, arg1, var5, var23.field2629, arg0, var27, var28);
                }
                if (var23.field2631 == 10 && var23.field2626 >= 0 && var23.field2626 < class439.field6539.length) {
                    class322 var33 = class439.field6539[var23.field2626];
                    if (var33 != null) {
                        int var34 = var33.field2217 / 32 - (var6 / 32);
                        int var35 = var33.field2215 / 32 - (var9 / 32);
                        class519.method3087(arg2, 116, 360000L, arg1, var5, var23.field2629, arg0, var34, var35);
                    }
                }
            }
        }
        if (class432.field6409 == 4) {
            return;
        }
        if (class112.field1573 != 0) {
            int var21 = class112.field1573 * 4 + 2 - (var6 / 32) - (-(class339.field5365.method2091(-15245) * 2) - -2);
            int var22 = class479.field7009 * 4 + (class339.field5365.method2091(-15245) + -1) * 2 + 2 - (var9 / 32);
            class432.method2585(arg3 ^ 0xFFFFFFF2, var5, arg2, class216.field3001[class390.field5913 ? 1 : 0], var22, var21, arg1, arg0);
        }
        arg4.method2952(3, 3, arg2.field7348 / 2 + arg1 - 1, -1, (byte) -53, arg2.field7386 / 2 + arg0 - 1);
    }
}
