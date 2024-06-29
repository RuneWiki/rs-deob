import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class155 {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "[I")
    public static int[] field3093 = new int[2000];

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lud;")
    public static class192 field3090;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "[Lrf;")
    public static class167[] field3092;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[Z")
    public static boolean[] field3089;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILei;Lei;)V")
    public static final void method1009(int arg0, class50 arg1, class50 arg2) {
        field3091++;
        if (class59.field1230) {
            class105.method720(4, arg2, arg1);
            return;
        }
        if (class159.field3169 == 0 || class159.field3169 == 5) {
            byte var3 = 20;
            arg2.method1003(class6.field302, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class163.method1053(230, var4, 304, 34, 9179409);
            class163.method1053(231, var4 + 1, 302, 32, 0);
            class163.method1049(232, var4 + 2, class101.field2076 * 3, 30, 9179409);
            class163.method1049(class101.field2076 * 3 + 232, var4 + 2, 300 - class101.field2076 * 3, 30, 0);
            arg2.method1003(class3.field173, 382, 276 - var3, 16777215, -1);
        }
        if (arg0 != 73) {
            return;
        }
        if (class159.field3169 == 20) {
            class90.field1762.method1145(382 - class90.field1762.field3354 / 2, -(class90.field1762.field3351 / 2) + 271);
            short var5 = 211;
            arg2.method1003(class3.field184, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg2.method1003(class3.field171, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg2.method1003(class3.field175, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg2.method987(class77.method529(-3, new class92[] { class137.field2746, class154.method988(class3.field181) }), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg2.method987(class77.method529(-3, new class92[] { class3.field178, class3.field169.method627(false) }), 274, var28, 16777215, 0);
            int var30 = var28 + 15;
        }
        if (class159.field3169 == 10) {
            class90.field1762.method1145(202, 171);
            if (class110.field2240 == 0) {
                short var15 = 251;
                arg2.method1003(class192.field3738, 382, var15, 16776960, 0);
                int var36 = var15 + 30;
                short var16 = 302;
                short var17 = 291;
                class27.field610.method1145(var16 - 73, var17 + -20);
                arg2.method982(class34.field767, var16 - 73, var17 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var18 = 462;
                class27.field610.method1145(var18 - 73, var17 + -20);
                arg2.method982(class200.field3904, var18 - 73, var17 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class110.field2240 == 2) {
                short var9 = 211;
                arg2.method1003(class3.field184, 382, var9, 16776960, 0);
                int var33 = var9 + 15;
                short var10 = 321;
                short var11 = 302;
                arg2.method1003(class3.field171, 382, var33, 16776960, 0);
                int var34 = var33 + 15;
                arg2.method1003(class3.field175, 382, var34, 16776960, 0);
                int var35 = var34 + 15;
                boolean var12;
                if (class29.field646 == 0 && class158.field3150 % 40 < 20 && class207.field3976) {
                    var12 = true;
                } else {
                    var12 = false;
                }
                var33 = var35 + 10;
                arg2.method987(class77.method529(-3, new class92[] { class137.field2746, class154.method988(class3.field181), var12 ? class144.field2877 : class3.field172 }), 272, var33, 16777215, 0);
                boolean var13;
                if (class29.field646 == 1 && class158.field3150 % 40 < 20 && class207.field3976) {
                    var13 = true;
                } else {
                    var13 = false;
                }
                var33 += 15;
                arg2.method987(class77.method529(arg0 ^ 0xFFFFFFB4, new class92[] { class3.field178, class3.field169.method627(false), var13 ? class144.field2877 : class3.field172 }), 274, var33, 16777215, 0);
                var33 += 15;
                class27.field610.method1145(var11 - 73, var10 + -20);
                arg2.method1003(class4.field264, var11, var10 + 5, 16777215, 0);
                short var14 = 462;
                class27.field610.method1145(var14 - 73, var10 + -20);
                arg2.method1003(class102.field2098, var14, var10 + 5, 16777215, 0);
            } else if (class110.field2240 == 3) {
                arg2.method1003(class136.field2734, 382, 211, 16776960, 0);
                short var6 = 236;
                short var7 = 382;
                arg2.method1003(class55.field1134, 382, var6, 16777215, 0);
                int var27 = var6 + 15;
                short var8 = 321;
                arg2.method1003(class31.field711, 382, var27, 16777215, 0);
                int var29 = var27 + 15;
                arg2.method1003(class148.field2933, 382, var29, 16777215, 0);
                int var31 = var29 + 15;
                arg2.method1003(class131.field2621, 382, var31, 16777215, 0);
                class27.field610.method1145(var7 - 73, var8 + -20);
                int var32 = var31 + 15;
                arg2.method1003(class102.field2098, var7, var8 + 5, 16777215, 0);
            }
        }
        if (class45.field1006 != 1) {
            if (class115.field2344 > 0) {
                class208.method1352(-21983, class115.field2344);
                class115.field2344 = 0;
            }
            class94.method660(-16711936);
        }
        class69.field1433[class175.field3376 ? 1 : 0].method1145(725, 463);
        if (class159.field3169 <= 5 || class158.field3137 == 2 || class72.field1532 != 0) {
            return;
        }
        if (class172.field3345 == null) {
            class172.field3345 = class70.method457((byte) 74, 0, class156.field3109, class58.field1220);
        }
        if (class172.field3345 == null) {
            return;
        }
        byte var19 = 5;
        short var20 = 463;
        class172.field3345.method1145(var19, var20);
        byte var21 = 100;
        byte var22 = 35;
        arg2.method1003(class77.method529(-3, new class92[] { class66.field1344, class150.field2982, class142.method938(class77.field1606, false) }), var21 / 2 + var19, var20 - -(var22 / 2) + -2, 16777215, 0);
        if (class70.field1446 != null) {
            arg1.method1003(class75.field1572, var21 / 2 + var19, var22 / 2 + var20 + 12, 16777215, 0);
            return;
        }
        arg1.method1003(class189.field3583, var21 / 2 + var19, var22 / 2 + var20 + 12, 16777215, 0);
        return;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method1010(int arg0) {
        field3093 = null;
        if (arg0 != 9179409) {
            field3090 = null;
        }
        field3092 = null;
        field3090 = null;
        field3089 = null;
    }
}
