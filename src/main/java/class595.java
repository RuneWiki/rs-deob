import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class595 {

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "[Z")
    public static boolean[] field8265 = new boolean[100];

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "J")
    public static long field8266 = -1L;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lqo;")
    public static class201 field8263 = new class201(0, 0);

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field8271 = 0;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZII)V", line = 14)
    public static final void method3294(boolean arg0, int arg1, int arg2) {
        field8264++;
        int var3 = class111.field1373.method453(-1, class586.field8149.method3261(class416.field5920, (byte) 82));
        int var5;
        if (class44.field664) {
            for (class359 var7 = (class359) class681.field9283.method2565((byte) -52); var7 != null; var7 = (class359) class681.field9283.method2568(-31355)) {
                int var10;
                if (var7.field5121 == 1) {
                    var10 = class197.method1236((class718) var7.field5117.field6099.field8705, (byte) 69);
                } else {
                    var10 = class265.method1595(9952, var7);
                }
                if (var10 > var3) {
                    var3 = var10;
                }
            }
            var5 = class1.field1 * 16 + 21;
            var3 += 8;
            class382.field5329 = (class95.field1206 ? 26 : 22) + class1.field1 * 16;
        } else {
            for (class718 var4 = (class718) class565.field7906.method3111(64); var4 != null; var4 = (class718) class565.field7906.method3116(-95)) {
                int var6 = class197.method1236(var4, (byte) 97);
                if (var6 > var3) {
                    var3 = var6;
                }
            }
            class382.field5329 = class573.field8011 * 16 + (class95.field1206 ? 26 : 22);
            var5 = class573.field8011 * 16 + 21;
            var3 += 8;
        }
        if (arg0) {
            field8263 = null;
        }
        int var8 = arg2 - (var3 / 2);
        if (class599.field8320 < (var3 + var8)) {
            var8 = class599.field8320 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (class84.field1083 < (var5 + arg1)) {
            var9 = class84.field1083 - var5;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        class333.field4301 = var8;
        class649.field8919 = var9;
        class322.field4113 = true;
        class521.field7340 = var3;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZI)Z", line = 99)
    public static final boolean method3295(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method3296((byte) 94);
        }
        field8269++;
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 125)
    public static void method3296(byte arg0) {
        field8265 = null;
        if (arg0 > 20) {
            field8263 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZIIIIIII)V", line = 187)
    public static final void method3297(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8270++;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        if (arg0) {
            method3297(true, 85, 101, 14, -63, -48, -53, 126);
        }
        int var9 = class658.field9040 + ((class598.field8311 - class658.field9040) * var8 / 100);
        class468.field6738 = class468.field6736 * var9 >> 8;
        int var10 = arg2 * var9 >> 8;
        int var11 = 16384 - arg6 & 0x3FFF;
        int var12 = 16384 - arg7 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class138.field1644[var11] * -var10 >> 14;
            var15 = class138.field1645[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class138.field1644[var12] * var15 >> 14;
            var15 = class138.field1645[var12] * var15 >> 14;
        }
        class156.field1974 = 0;
        class411.field5801 = arg6;
        class524.field7412 = arg1 - var14;
        class407.field5744 = arg5 - var15;
        class505.field7134 = arg3 - var13;
        class688.field9781 = arg7;
    }
}
