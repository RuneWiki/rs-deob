import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class29 {

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Laj;")
    public static class151 field493;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static void method184(byte arg0) {
        if (arg0 <= 0) {
            method187((class207) null, -22, 76, -22, -32, -4, 67);
        }
        field493 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)Ljc;")
    public static final class278 method185(int arg0, int arg1, int arg2, int arg3) {
        class278 var4 = new class278();
        field489++;
        var4.field4622 = arg1;
        var4.field4623 = arg0;
        class306.field4952.method986((long) arg2, true, var4);
        class244.method1746((byte) 109, arg1);
        class207 var5 = class222.method1574(arg3 + 122, arg2);
        if (var5 != null) {
            class206.method1441(arg3, var5);
        }
        if (class6.field133 != null) {
            class206.method1441(arg3, class6.field133);
            class6.field133 = null;
        }
        int var6 = class287.field4747;
        for (int var7 = arg3; var7 < var6; var7++) {
            if (class290.method2012(class195.field3154[var7], (byte) 105)) {
                class215.method1529(var7, 1);
            }
        }
        if (class287.field4747 == 1) {
            class259.field4360 = false;
            class244.method1748(class263.field4398, (byte) -93, class275.field4604, class58.field1020, class213.field3596);
        } else {
            class244.method1748(class263.field4398, (byte) -93, class275.field4604, class58.field1020, class213.field3596);
            int var8 = class183.field2930.method1229(class90.field1497);
            for (int var9 = 0; var9 < class287.field4747; var9++) {
                int var10 = class183.field2930.method1229(class123.method933(var9, true));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class275.field4604 = var8 + 8;
            class263.field4398 = (class67.field1133 ? 26 : 22) + class287.field4747 * 15;
        }
        if (var5 != null) {
            class26.method168(var5, arg3, false);
        }
        class279.method1955(arg1, 2000000);
        if (class243.field4082 != -1) {
            class179.method1305((byte) 69, class243.field4082, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILhg;Lmd;II)V")
    public static final void method186(int arg0, int arg1, int arg2, class207 arg3, class273 arg4, int arg5, int arg6) {
        field492++;
        if (arg4 == null) {
            return;
        }
        int var7;
        if (class169.field2739 == 4) {
            var7 = (int) class265.field4432 & 0x7FF;
        } else {
            var7 = (int) class265.field4432 + class314.field5060 & 0x7FF;
        }
        int var8 = Math.max(arg3.field3484 / 2, arg3.field3481 / 2) + 10;
        int var9 = arg2 * arg2 + (arg5 * arg5);
        if ((var8 * var8) < var9) {
            return;
        }
        int var10 = class128.field2133[var7];
        int var11 = class128.field2130[var7];
        if (class169.field2739 != 4) {
            var10 = var10 * 256 / (class286.field4738 + 256);
            var11 = var11 * 256 / (class286.field4738 + 256);
        }
        int var12 = arg2 * var11 + arg5 * var10 >> 16;
        int var13 = arg5 * var11 - (arg2 * var10) >> 16;
        ((class92) arg4).method658(arg3.field3484 / 2 + arg0 + var12 - (arg4.field4565 / 2), arg3.field3481 / 2 + -var13 + -(arg4.field4567 / 2) + arg6, arg3.field3363, arg3.field3359);
        if (arg1 >= -38) {
            field490 = 5;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lhg;IIIIII)V")
    public static final void method187(class207 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field491++;
        if (arg5 != -12378) {
            method185(-80, 73, -88, -124);
        }
        class195 var7 = class22.method146((byte) -89, arg4);
        if (var7 == null || !var7.field3115 || !var7.method1395(29435)) {
            return;
        }
        if (var7.field3140 != null) {
            int[] var8 = new int[var7.field3140.length];
            for (int var9 = 0; var9 < var8.length / 2; var9++) {
                int var11;
                if (class169.field2739 == 4) {
                    var11 = (int) class265.field4432 & 0x7FF;
                } else {
                    var11 = (int) class265.field4432 + class314.field5060 & 0x7FF;
                }
                int var12 = class128.field2133[var11];
                int var13 = class128.field2130[var11];
                if (class169.field2739 != 4) {
                    var12 = var12 * 256 / (class286.field4738 + 256);
                    var13 = var13 * 256 / (class286.field4738 + 256);
                }
                var8[var9 * 2] = arg0.field3484 / 2 + ((arg2 + (var7.field3140[var9 * 2 + 1] * 4)) * var12 + ((var7.field3140[var9 * 2] * 4 + arg6) * var13) >> 16) + arg1;
                var8[var9 * 2 + 1] = arg0.field3481 / 2 + arg3 - ((var7.field3140[var9 * 2 + 1] * 4 + arg2) * var13 - ((var7.field3140[var9 * 2] * 4 + arg6) * var12) >> 16);
            }
            class235.method1685(var8, var7.field3133, var7.field3133 >>> 24, arg0.field3363, arg0.field3359);
            for (int var10 = 0; var10 < var8.length / 2 - 1; var10++) {
                class211.method1489(var8[var10 * 2], var8[var10 * 2 + 1], var8[(var10 + 1) * 2], var8[(var10 + 1) * 2 + 1], var7.field3121, var7.field3121 >>> 24, arg0.field3363, arg0.field3359);
            }
            class211.method1489(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field3121, var7.field3121 >>> 24, arg0.field3363, arg0.field3359);
        }
        class250 var14 = null;
        if (var7.field3150 != -1) {
            var14 = var7.method1388(false, false, false);
            if (var14 != null) {
                class28.method183(arg2, arg1, var14, arg0, arg6, 119, arg3);
            }
        }
        if (var7.field3125 == null) {
            return;
        }
        class165 var15 = class25.field450;
        if (var7.field3124 == 1) {
            var15 = class169.field2732;
        }
        int var16 = 0;
        if (var7.field3124 == 2) {
            var15 = class183.field2930;
        }
        if (var14 != null) {
            var16 = var14.field4235;
        }
        class233.method1673(arg3, -96, arg1, arg0, var16, arg6, arg2, var15, var7.field3125, var7.field3149);
        return;
    }
}
