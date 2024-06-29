import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class178 {

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3049 = 0;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3045 = -2;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lbe;")
    public static class235 field3046 = new class235(512);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lda;")
    public static class143 field3047;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[B)V", line = 16)
    public static final void method1345(int arg0, byte[] arg1) {
        field3048++;
        class94 var2 = new class94(arg1);
        var2.field1653 = arg1.length - 2;
        class129.field2334 = var2.method761((byte) 108);
        class40.field646 = new int[class129.field2334];
        class317.field5350 = new byte[class129.field2334][];
        class101.field1848 = new byte[class129.field2334][];
        class120.field2194 = new boolean[class129.field2334];
        class127.field2312 = new int[class129.field2334];
        class190.field3253 = new int[class129.field2334];
        class260.field4333 = new int[class129.field2334];
        var2.field1653 = arg1.length - class129.field2334 * 8 - 7;
        class238.field3962 = var2.method761((byte) 108);
        class277.field4637 = var2.method761((byte) 108);
        int var3 = (var2.method756(915905888) & 0xFF) + 1;
        for (int var4 = 0; var4 < class129.field2334; var4++) {
            class127.field2312[var4] = var2.method761((byte) 108);
        }
        int var5 = 126 % ((arg0 - 50) / 60);
        for (int var6 = 0; var6 < class129.field2334; var6++) {
            class40.field646[var6] = var2.method761((byte) 108);
        }
        for (int var7 = 0; var7 < class129.field2334; var7++) {
            class190.field3253[var7] = var2.method761((byte) 108);
        }
        for (int var8 = 0; var8 < class129.field2334; var8++) {
            class260.field4333[var8] = var2.method761((byte) 108);
        }
        var2.field1653 = arg1.length - (class129.field2334 * 8) - ((var3 + -1) * 3) - 7;
        class306.field5152 = new int[var3];
        for (int var9 = 1; var9 < var3; var9++) {
            class306.field5152[var9] = var2.method732(-1);
            if (class306.field5152[var9] == 0) {
                class306.field5152[var9] = 1;
            }
        }
        var2.field1653 = 0;
        for (int var10 = 0; var10 < class129.field2334; var10++) {
            int var11 = class190.field3253[var10];
            int var12 = class260.field4333[var10];
            boolean var13 = false;
            int var14 = var11 * var12;
            byte[] var15 = new byte[var14];
            byte[] var16 = new byte[var14];
            class317.field5350[var10] = var15;
            class101.field1848[var10] = var16;
            int var17 = var2.method756(915905888);
            if ((var17 & 0x1) == 0) {
                for (int var23 = 0; var23 < var14; var23++) {
                    var15[var23] = var2.method719((byte) -42);
                }
                if ((var17 & 0x2) != 0) {
                    for (int var24 = 0; var24 < var14; var24++) {
                        byte var25 = var16[var24] = var2.method719((byte) -42);
                        var13 |= var25 != -1;
                    }
                }
            } else {
                int var18 = 0;
                label89: while (true) {
                    if (var11 <= var18) {
                        if ((var17 & 0x2) == 0) {
                            break;
                        }
                        int var20 = 0;
                        while (true) {
                            if (var11 <= var20) {
                                break label89;
                            }
                            for (int var21 = 0; var21 < var12; var21++) {
                                byte var22 = var16[var20 + (var11 * var21)] = var2.method719((byte) -42);
                                var13 |= var22 != -1;
                            }
                            var20++;
                        }
                    }
                    for (int var19 = 0; var19 < var12; var19++) {
                        var15[var18 + (var11 * var19)] = var2.method719((byte) -42);
                    }
                    var18++;
                }
            }
            class120.field2194[var10] = var13;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 181)
    public static final void method1346(byte arg0) {
        int var1 = class207.field3507.method1896(class9.field106);
        for (int var2 = 0; var2 < class293.field4931; var2++) {
            int var3 = class207.field3507.method1896(class180.method1370((byte) 115, var2));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        var1 += 8;
        field3051++;
        int var4 = class293.field4931 * 15 + 21;
        int var5 = class233.field3876 - (var1 / 2);
        int var6 = class43.field718;
        int var7 = -43 / ((arg0 + 77) / 40);
        if ((var6 + var4) > class252.field4205) {
            var6 = class252.field4205 - var4;
        }
        if (class251.field4201 < var5 + var1) {
            var5 = class251.field4201 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class29.field491 == 1) {
            if (class233.field3876 == class185.field3197 && class43.field718 == class297.field4980) {
                class311.field5221 = class293.field4931 * 15 + 22;
                class6.field58 = var1;
                class148.field2675 = var5;
                class32.field539 = true;
                class29.field491 = 0;
                class240.field3984 = var6;
            }
        } else if (class233.field3876 == class153.field2721 && class43.field718 == class183.field3158) {
            class6.field58 = var1;
            class240.field3984 = var6;
            class311.field5221 = class293.field4931 * 15 + 22;
            class29.field491 = 0;
            class32.field539 = true;
            class148.field2675 = var5;
        } else {
            class185.field3197 = class153.field2721;
            class297.field4980 = class183.field3158;
            class29.field491 = 1;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V", line = 275)
    public static final void method1347(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3053++;
        class187.field3229.field1653 = 0;
        class187.field3229.method753(137, true);
        class187.field3229.method753(arg2, true);
        class187.field3229.method753(arg0, true);
        class187.field3229.method751(arg1, arg3 ^ 0x3E3A7335);
        class187.field3229.method751(arg4, -1044017976);
        class87.field1556 = 1;
        class92.field1624 = arg3;
        class139.field2488 = 0;
        class219.field3657 = 0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 306)
    public static void method1348(int arg0) {
        field3046 = null;
        if (arg0 != -1) {
            field3047 = (class143) null;
        }
        field3047 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZZLkg;)V", line = 318)
    public static final void method1349(boolean arg0, boolean arg1, class172 arg2) {
        int var3 = arg2.field2985;
        field3050++;
        int var4 = (int) arg2.field2701;
        arg2.method1183(false);
        if (arg1) {
            class61.method417(2, var3);
        }
        class266.method1823(var3, 2949);
        class78 var5 = class61.method419((byte) 28, var4);
        if (var5 != null) {
            class55.method386(0, var5);
        }
        int var6 = class293.field4931;
        if (!arg0) {
            return;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class279.method1917((byte) -68, class105.field1911[var7])) {
                class274.method1857(var7, (byte) 93);
            }
        }
        if (class293.field4931 == 1) {
            class32.field539 = false;
            class222.method1608(class240.field3984, class311.field5221, 98, class6.field58, class148.field2675);
        } else {
            class222.method1608(class240.field3984, class311.field5221, 101, class6.field58, class148.field2675);
            int var8 = class207.field3507.method1896(class9.field106);
            for (int var9 = 0; var9 < class293.field4931; var9++) {
                int var10 = class207.field3507.method1896(class180.method1370((byte) 109, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class6.field58 = var8 + 8;
            class311.field5221 = class293.field4931 * 15 + 22;
        }
        if (class265.field4412 != -1) {
            class30.method248(1, 84, class265.field4412);
        }
    }
}
