import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class144 {

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[[B")
    public static byte[][] field2352 = new byte[1000][];

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lu;")
    public static class40 field2350;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "[Lo;")
    public static class138[] field2351;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lza;B)V", line = 3)
    public static final void method1051(class491 arg0, byte arg1) {
        field2349++;
        int var2 = class508.field7390;
        int var3 = class265.field4428;
        int var4 = class134.field2262;
        int var5 = class128.field2195 - 3;
        byte var6 = 20;
        if (class61.field925 == null || class178.field2825 == null) {
            if (class536.field7881.method2929(class448.field6683, -118) && class536.field7881.method2929(class137.field2312, -113)) {
                class61.field925 = arg0.method837(class523.method3093(class536.field7881, class448.field6683, 0), true);
                class523 var7 = class523.method3093(class536.field7881, class137.field2312, 0);
                class178.field2825 = arg0.method837(var7, true);
                var7.method3097();
                class497.field7295 = arg0.method837(var7, true);
            } else {
                arg0.method914(var2, var3, var4, var6, 255 - class402.field6115 << 24 | class4.field40, 1);
            }
        }
        if (class61.field925 != null && class178.field2825 != null) {
            int var8 = (var4 - class178.field2825.method204() * 2) / class61.field925.method204();
            for (int var9 = 0; var9 < var8; var9++) {
                class61.field925.method1039(class178.field2825.method204() + (var2 + (var9 * class61.field925.method204())), var3);
            }
            class178.field2825.method1039(var2, var3);
            class497.field7295.method1039(var2 + var4 - class497.field7295.method204(), var3);
        }
        class127.field2188.method1903(-1, var2 + 3, var3 - -14, 0, class94.field1589 | 0xFF000000, class467.field6930.method1954(class300.field4813, -30366));
        arg0.method914(var2, var3 + var6, var4, var5 - var6, -class402.field6115 + 255 << 24 | class4.field40, 1);
        int var10 = class333.field5233.method1660(2766);
        int var11 = class333.field5233.method1655(-116);
        if (arg1 > -70) {
            return;
        }
        int var12 = 0;
        for (class162 var13 = (class162) class108.field1934.method2538(-3); var13 != null; var13 = (class162) class108.field1934.method2535((byte) -65)) {
            int var31 = var3 + var6 + ((class480.field7080 + -1 + -var12) * 16) + 13;
            if (var10 > var2 && var10 < var2 + var4 && var31 - 13 < var11 && (var31 + 4) > var11 && var13.field2569) {
                arg0.method914(var2, var31 - 12, var4, 16, 255 - class533.field7841 << 24 | class203.field3211, 1);
            }
            var12++;
        }
        if ((class534.field7849 == null || class299.field4800 == null || class2.field12 == null) && class536.field7881.method2929(class533.field7843, -64) && class536.field7881.method2929(class137.field2307, -91) && class536.field7881.method2929(class101.field1680, -90)) {
            class523 var14 = class523.method3093(class536.field7881, class137.field2307, 0);
            class299.field4800 = arg0.method837(var14, true);
            var14.method3097();
            class317.field4981 = arg0.method837(var14, true);
            class534.field7849 = arg0.method837(class523.method3093(class536.field7881, class533.field7843, 0), true);
            class523 var15 = class523.method3093(class536.field7881, class101.field1680, 0);
            class2.field12 = arg0.method837(var15, true);
            var15.method3097();
            class15.field167 = arg0.method837(var15, true);
        }
        if (class534.field7849 != null && class299.field4800 != null && class2.field12 != null) {
            int var16 = (var4 - (class2.field12.method204() * 2)) / class534.field7849.method204();
            for (int var17 = 0; var17 < var16; var17++) {
                class534.field7849.method1039(var2 + class2.field12.method204() + (class534.field7849.method204() * var17), -class534.field7849.method210() + var5 + var3);
            }
            int var18 = ((var5 - var6) - class2.field12.method210()) / class299.field4800.method210();
            for (int var19 = 0; var19 < var18; var19++) {
                class299.field4800.method1039(var2, var3 + var6 + (var19 * class299.field4800.method210()));
                class317.field4981.method1039((var2 + var4) - class317.field4981.method204(), var19 * class299.field4800.method210() + var3 - -var6);
            }
            class2.field12.method1039(var2, var3 + var5 - class2.field12.method210());
            class15.field167.method1039(var2 + var4 - class2.field12.method204(), var3 + (var5 - class2.field12.method210()));
        }
        int var20 = 0;
        for (class162 var21 = (class162) class108.field1934.method2538(-3); var21 != null; var21 = (class162) class108.field1934.method2535((byte) -106)) {
            int var22 = (class480.field7080 - var20 - 1) * 16 + var3 + var6 + 13;
            int var23 = class94.field1589 | 0xFF000000;
            if (var2 < var10 && var2 + var4 > var10 && var22 - 13 < var11 && var11 < (var22 + 4) && var21.field2569) {
                var23 = class53.field860 | 0xFF000000;
            }
            int[] var24 = null;
            if (class420.method2579(var21.field2576, (byte) 114)) {
                var24 = class20.field218.method2221((int) var21.field2578, -1).field1732;
            } else if (var21.field2585 != -1) {
                var24 = class20.field218.method2221(var21.field2585, -1).field1732;
            } else if (class63.method416(var21.field2576, true)) {
                class505 var27 = (class505) class147.field2396.method2516((long) ((int) var21.field2578), -1);
                if (var27 != null) {
                    class265 var28 = var27.field7355;
                    class510 var29 = var28.field4430;
                    if (var29.field7448 != null) {
                        var29 = var29.method3000(1, class327.field5160);
                    }
                    if (var29 != null) {
                        var24 = var29.field7476;
                    }
                }
            } else if (class479.method2823(var21.field2576, -30256)) {
                Object var25 = null;
                class39 var26;
                if (var21.field2576 == 1011) {
                    var26 = class61.field928.method791((int) var21.field2578, true);
                } else {
                    var26 = class61.field928.method791((int) (var21.field2578 >>> 32 & 0x7FFFFFFFL), true);
                }
                if (var26.field575 != null) {
                    var26 = var26.method296(-1008, class327.field5160);
                }
                if (var26 != null) {
                    var24 = var26.field632;
                }
            }
            String var30 = class209.method1367(var21, (byte) 77);
            if (var24 != null) {
                var30 = var30 + class367.method2331(-84, var24);
            }
            class127.field2188.method1904(var23, class315.field4961, var2 + 3, class491.field7177, 0, var30, var22, (byte) 66);
            var20++;
            if (var21.field2577) {
                class387.field5966.method1039(var2 + class84.field1467.method2085((byte) -120, var30) + 5, var22 + -12);
            }
        }
        class419.method2577(class128.field2195, class508.field7390, 119, class265.field4428, class134.field2262);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 204)
    public static void method1052(int arg0) {
        field2350 = null;
        field2352 = null;
        field2351 = null;
        if (arg0 != -14529) {
            field2352 = null;
        }
    }
}
