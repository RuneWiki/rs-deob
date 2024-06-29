import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public abstract class class372 {

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Liu;")
    public static class390 field5575 = new class390(22, -1);

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "[I")
    public static int[] field5577 = new int[1];

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V", line = 6)
    public static void method2262(int arg0) {
        field5577 = null;
        if (arg0 >= 25) {
            field5575 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Leq;B)V", line = 17)
    public static final void method2263(class134 arg0, byte arg1) {
        field5578++;
        int var2 = class214.field3022;
        int var3 = class64.field940;
        int var4 = class125.field1614;
        int var5 = class414.field6141 - 3;
        byte var6 = 20;
        if (class126.field1622 == null || class146.field1893 == null) {
            if (class445.field6482.method1442(class91.field1247, (byte) -114) && class445.field6482.method1442(class310.field4519, (byte) -107)) {
                class126.field1622 = arg0.method804(class328.method1978(class445.field6482, class91.field1247, 0), true);
                class328 var7 = class328.method1978(class445.field6482, class310.field4519, 0);
                class146.field1893 = arg0.method804(var7, true);
                var7.method1971();
                class410.field6010 = arg0.method804(var7, true);
            } else {
                arg0.method770(var2, var3, var4, var6, class378.field5655 | 255 - class191.field2713 << 24, 1);
            }
        }
        if (class126.field1622 != null && class146.field1893 != null) {
            int var8 = (var4 - (class146.field1893.method93() * 2)) / class126.field1622.method93();
            for (int var9 = 0; var9 < var8; var9++) {
                class126.field1622.method1845(class146.field1893.method93() + var2 + (class126.field1622.method93() * var9), var3);
            }
            class146.field1893.method1845(var2, var3);
            class410.field6010.method1845(var2 + var4 - class410.field6010.method93(), var3);
        }
        class458.field6676.method2116(class465.field6734 | 0xFF000000, -1, var2 + 3, var3 - -14, class226.field3194.method1220(2969, class81.field1122), (byte) -85);
        arg0.method770(var2, var3 + var6, var4, var5 - var6, -class191.field2713 + 255 << 24 | class378.field5655, 1);
        int var10 = class137.field1797.method2038(arg1 ^ 0x74);
        if (arg1 != 125) {
            return;
        }
        int var11 = class137.field1797.method2044((byte) -112);
        int var12 = 0;
        for (class262 var13 = (class262) class230.field3220.method2096(-21400); var13 != null; var13 = (class262) class230.field3220.method2084((byte) 19)) {
            int var30 = var3 + ((class383.field5696 - var12 - 1) * 16) + var6 + 13;
            if (var10 > var2 && (var2 + var4) > var10 && var11 > (var30 - 13) && var11 < (var30 + 4) && var13.field3731) {
                arg0.method770(var2, var30 - 12, var4, 16, class107.field1430 | 255 - class208.field2929 << 24, 1);
            }
            var12++;
        }
        if ((class503.field7683 == null || class212.field3004 == null || class370.field5560 == null) && class445.field6482.method1442(class437.field6389, (byte) -124) && class445.field6482.method1442(class435.field6373, (byte) -114) && class445.field6482.method1442(class413.field6114, (byte) -106)) {
            class328 var14 = class328.method1978(class445.field6482, class435.field6373, 0);
            class212.field3004 = arg0.method804(var14, true);
            var14.method1971();
            class319.field4687 = arg0.method804(var14, true);
            class503.field7683 = arg0.method804(class328.method1978(class445.field6482, class437.field6389, 0), true);
            class328 var15 = class328.method1978(class445.field6482, class413.field6114, 0);
            class370.field5560 = arg0.method804(var15, true);
            var15.method1971();
            class8.field135 = arg0.method804(var15, true);
        }
        if (class503.field7683 != null && class212.field3004 != null && class370.field5560 != null) {
            int var16 = (var4 - (class370.field5560.method93() * 2)) / class503.field7683.method93();
            for (int var17 = 0; var17 < var16; var17++) {
                class503.field7683.method1845(class370.field5560.method93() + var2 + (class503.field7683.method93() * var17), -class503.field7683.method85() + var5 + var3);
            }
            int var18 = (var5 - class370.field5560.method85() - var6) / class212.field3004.method85();
            for (int var19 = 0; var19 < var18; var19++) {
                class212.field3004.method1845(var2, class212.field3004.method85() * var19 + (var3 + var6));
                class319.field4687.method1845(var2 + var4 - class319.field4687.method93(), var19 * class212.field3004.method85() + var3 + var6);
            }
            class370.field5560.method1845(var2, var3 - (class370.field5560.method85() - var5));
            class8.field135.method1845(var2 + var4 - class370.field5560.method93(), -class370.field5560.method85() + (var3 - -var5));
        }
        int var20 = 0;
        for (class262 var21 = (class262) class230.field3220.method2096(-21400); var21 != null; var21 = (class262) class230.field3220.method2084((byte) 19)) {
            int var22 = var6 + ((class383.field5696 - (var20 + 1)) * 16) + var3 + 13;
            int var23 = class465.field6734 | 0xFF000000;
            if (var10 > var2 && (var2 + var4) > var10 && var11 > (var22 - 13) && (var22 + 4) > var11 && var21.field3731) {
                var23 = class207.field2868 | 0xFF000000;
            }
            int[] var24 = null;
            if (class166.method1048(arg1 ^ 0x30C7, var21.field3737)) {
                var24 = class405.field5947.method1162((int) var21.field3733, 0).field5430;
            } else if (var21.field3736 != -1) {
                var24 = class405.field5947.method1162(var21.field3736, 0).field5430;
            } else if (class117.method669((byte) 58, var21.field3737)) {
                class139 var27 = class504.field7697[(int) var21.field3733];
                if (var27 != null) {
                    class272 var28 = var27.field1825;
                    if (var28.field3797 != null) {
                        var28 = var28.method1656(class453.field6591, 95);
                    }
                    if (var28 != null) {
                        var24 = var28.field3823;
                    }
                }
            } else if (class478.method2792(var21.field3737, (byte) -87)) {
                Object var25 = null;
                class486 var26;
                if (var21.field3737 == 1002) {
                    var26 = class114.field1471.method2132((byte) 119, (int) var21.field3733);
                } else {
                    var26 = class114.field1471.method2132((byte) 123, (int) (var21.field3733 >>> 32 & 0x7FFFFFFFL));
                }
                if (var26.field7043 != null) {
                    var26 = var26.method2834(class453.field6591, false);
                }
                if (var26 != null) {
                    var24 = var26.field7077;
                }
            }
            String var29 = class162.method1027(var21, 0);
            if (var24 != null) {
                var29 = var29 + class103.method616(var24, 0);
            }
            class458.field6676.method2117(var23, arg1 - 126, 0, var29, var2 + 3, var22, class93.field1255, class9.field143);
            var20++;
            if (var21.field3740) {
                class7.field117.method1845(class482.field6989.method3055(7748, var29) + (var2 + 5), var22 + -12);
            }
        }
        class171.method1078(-1, class64.field940, class214.field3022, class125.field1614, class414.field6141);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIB)Z", line = 219)
    public static final boolean method2264(int arg0, int arg1, byte arg2) {
        if (arg2 <= 23) {
            method2263(null, (byte) -118);
        }
        field5576++;
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BIZIIIIF)[I", line = 231)
    public static final int[] method2265(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, float arg7) {
        field5573++;
        int[] var8 = new int[arg4];
        class306 var9 = new class306();
        var9.field4446 = arg3;
        var9.field4448 = arg5;
        var9.field4457 = (int) (arg7 * 4096.0F);
        var9.field4451 = arg6;
        var9.field4445 = arg2;
        var9.field4456 = arg1;
        var9.method24(255);
        class283.method1718(arg4, 93, 1);
        if (arg0 != 80) {
            field5575 = null;
        }
        var9.method1839(0, var8, (byte) 11);
        return var8;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIII)I", line = 255)
    public static final int method2266(int arg0, int arg1, int arg2, int arg3) {
        field5574++;
        if (arg1 != -20228) {
            method2266(-106, 93, 72, 75);
        }
        if (arg0 <= arg3) {
            return arg3 > arg2 ? arg2 : arg3;
        } else {
            return arg0;
        }
    }
}
