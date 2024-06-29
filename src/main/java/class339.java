import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class339 {

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field4890 = 0;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Z")
    public static boolean field4891 = true;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[Lur;")
    public static class92[] field4885;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[Z")
    public static boolean[] field4887;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILii;ILwl;Lls;Lii;ZZIII)Lcq;")
    public static final class67 method2219(int arg0, int arg1, class405 arg2, int arg3, class273 arg4, class296 arg5, class405 arg6, boolean arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field4889++;
        class67 var12 = class244.method1464(arg9, (byte) -76, arg11, arg2, arg0, arg5, arg3, arg1);
        if (var12 != null) {
            return var12;
        }
        class83 var13 = class9.method74(arg9, (byte) 108);
        if (arg11 > 1 && var13.field1159 != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (var13.field1117[var15] <= arg11 && var13.field1117[var15] != 0) {
                    var14 = var13.field1159[var15];
                }
            }
            if (var14 != -1) {
                var13 = class9.method74(var14, (byte) 83);
            }
        }
        class245 var16 = class235.method1410(-7137, var13.field1195, class62.field814, 0);
        if (var16 == null) {
            return null;
        }
        if (var13.field1139 != null) {
            for (int var17 = 0; var17 < var13.field1139.length; var17++) {
                if (var13.field1130 == null || var13.field1130.length <= var17) {
                    var16.method1480(arg10 ^ 0x17, var13.field1120[var17], var13.field1139[var17]);
                } else {
                    var16.method1480(127, class143.field1950[var13.field1130[var17] & 0xFF], var13.field1139[var17]);
                }
            }
        }
        if (var13.field1141 != null) {
            for (int var18 = 0; var18 < var13.field1141.length; var18++) {
                var16.method1476(var13.field1141[var18], var13.field1119[var18], 0);
            }
        }
        if (arg5 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                if (arg5.field4258[var19] < class442.field6478[var19].length) {
                    var16.method1480(-119, class442.field6478[var19][arg5.field4258[var19]], class308.field4539[var19]);
                }
                if (arg5.field4258[var19] < class98.field1371[var19].length) {
                    var16.method1480(arg10 ^ 0x3C, class98.field1371[var19][arg5.field4258[var19]], class394.field5729[var19]);
                }
            }
        }
        int var20 = 1024;
        boolean var21 = false;
        if (var13.field1164 != 128 || var13.field1196 != 128 || var13.field1184 != 128) {
            var20 |= 0x7;
            var21 = true;
        }
        class375 var22 = arg6.method1715(var16, var20, 0, var13.field1157 + 64, 768 - -var13.field1123);
        if (!var22.method1585()) {
            return null;
        }
        if (var21) {
            var22.method1562(var13.field1164, var13.field1196, var13.field1184);
        }
        class67 var23 = null;
        if (var13.field1144 != -1) {
            var23 = method2219(0, 0, arg2, 1, arg4, arg5, arg6, true, true, var13.field1161, -1, 10);
            if (var23 == null) {
                return null;
            }
        } else if (var13.field1188 != -1) {
            var23 = method2219(arg0, 0, arg2, arg3, arg4, arg5, arg6, true, false, var13.field1163, arg10, arg11);
            if (var23 == null) {
                return null;
            }
        }
        int var24 = var13.field1170;
        arg6.method1723(16, 16, 512, 512);
        if (arg8) {
            var24 = (int) ((double) var24 * 1.5D);
        } else if (arg3 == 2) {
            var24 = (int) ((double) var24 * 1.04D);
        }
        class177 var25 = arg6.method1645();
        var25.method976();
        arg6.method1648(var25);
        arg6.method1756(1.0F);
        arg6.method1752(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        class177 var26 = arg6.method1735();
        var26.method982(-var13.field1131 << 3);
        var26.method980(var13.field1125 << 3);
        var26.method981(var13.field1146, (class117.field1644[var13.field1155 << 3] * var24 >> 15) + var13.field1198 - (var22.method1597() / 2), (class117.field1636[var13.field1155 << 3] * var24 >> 15) + var13.field1198);
        var26.method988(var13.field1155 << 3);
        int var27 = arg6.method1771();
        int var28 = arg6.method1647();
        arg6.method1764(50, Integer.MAX_VALUE);
        arg6.method1697();
        arg6.method1652();
        arg6.method1632(0, 0, 36, 32, 0, 0);
        var22.method1601(var26, (class330) null, 1);
        arg6.method1764(var27, var28);
        int[] var29 = arg6.method1729(0, 0, 36, 32);
        if (arg3 >= 1) {
            var29 = class148.method939(-16777215, var29, 121);
            if (arg3 >= 2) {
                var29 = class148.method939(-1, var29, 127);
            }
        }
        if (arg0 != 0) {
            class308.method2096(arg0, 0, var29);
        }
        arg6.method1624(var29, 0, 36, 36, 32).method454(0, 0);
        if (var13.field1144 != arg10) {
            var23.method454(0, 0);
        } else if (var13.field1188 != -1) {
            var23.method454(0, 0);
        }
        if (arg1 == 1 || arg1 == 2 && (var13.field1148 == 1 || arg11 != 1) && arg11 != -1) {
            arg4.method1878(9, -16777215, -256, class83.method586(arg11, true), (byte) -79, 0);
        }
        int[] var30 = arg6.method1729(0, 0, 36, 32);
        for (int var31 = 0; var31 < var30.length; var31++) {
            if ((var30[var31] & 0xFFFFFF) == 0) {
                var30[var31] = 0;
            } else {
                var30[var31] = class351.method2313(var30[var31], -16777216);
            }
        }
        class67 var32;
        if (arg7) {
            var32 = arg6.method1624(var30, 0, 36, 36, 32);
        } else {
            var32 = arg2.method1624(var30, 0, 36, 36, 32);
        }
        if (!arg7) {
            class283 var33 = new class283();
            var33.field4120 = arg5 != null;
            var33.field4118 = arg11;
            var33.field4121 = arg2.field6028;
            var33.field4116 = arg9;
            var33.field4126 = arg1;
            var33.field4122 = arg0;
            var33.field4112 = arg3;
            class212.field2835.method1086(var32, var33, 82);
        }
        return var32;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2220(String arg0, int arg1) {
        field4886++;
        if (class195.field2617 == null) {
            return;
        }
        class185.field2507.method5(arg1 - 6444, 176);
        if (arg1 == -1) {
            class195.field2607++;
            class185.field2507.method1346(class125.method795(arg1 + 65, arg0), arg1 ^ 0xFFFF8000);
            class185.field2507.method1380(65280, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method2221(byte arg0) {
        field4887 = null;
        field4885 = null;
        int var1 = 17 / ((10 - arg0) / 51);
    }
}
