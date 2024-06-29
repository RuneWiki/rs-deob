import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class5 extends class276 {

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field48 = new String[200];

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V")
    public static final void method17(byte arg0) {
        field47++;
        if (arg0 != -4) {
            field48 = null;
        }
        int var1 = (int) ((double) class217.field3775 * 34.46D);
        int var2 = var1 << 0;
        if (class305.field4873.method896()) {
            var2 += 128;
        }
        class305.field4873.method862(50, var2);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method18(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field51++;
        if ((class192.field2982[0][arg2][arg4] & 0x2) != 0) {
            return true;
        } else if ((class192.field2982[arg0][arg2][arg4] & 0x10) != 0) {
            return false;
        } else if (class507.method2983(0, arg4, arg0, arg2) == arg3) {
            return true;
        } else {
            int var5 = -125 % ((arg1 - 11) / 62);
            return false;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILia;I)V")
    public static final void method19(int arg0, class23 arg1, int arg2) {
        field53++;
        int var3 = -117 % ((arg0 - 21) / 55);
        if (class188.field2937 == null) {
            return;
        }
        try {
            class188.field2937.method1170(0L, (byte) -126);
            class188.field2937.method1165(-1, arg1.field302, 24, arg2);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
    public static void method20(int arg0) {
        field48 = null;
        if (arg0 != 14957) {
            field48 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)V")
    public static final void method21(byte arg0) {
        class17.field189.method2543(7655);
        field46++;
        if (arg0 != -2) {
            return;
        }
        for (class162 var1 = (class162) class108.field1934.method2538(-3); var1 != null; var1 = (class162) class108.field1934.method2535((byte) -108)) {
            if (var1.field2576 < 1000) {
                var1.method1821((byte) -75);
                class17.field189.method2541(0, var1);
            }
        }
        class17.field189.method2548(class108.field1934, 12480);
        int var2 = -1;
        class272 var3 = (class272) class216.field3765.method2538(-3);
        if (var3 != null) {
            var2 = var3.method385((byte) -14);
        }
        if (!class387.field5967) {
            if (var2 == 0 && (class199.field3176 == 1 && class480.field7080 > 2 || class1.method4(1009))) {
                var2 = 2;
            }
            if (var2 == 2 && class480.field7080 > 0 && var3 != null) {
                if (class164.field2598 == null && class217.field3778 == 0) {
                    class176.method1185(var3.method384((byte) -120), (byte) -125, var3.method386((byte) -119));
                } else {
                    class171.field2737 = 2;
                }
            }
            if (var2 == 0 && class480.field7080 > 0) {
                class3.method10(arg0 ^ 0xFFFFD858);
            }
            if (class164.field2598 == null && class217.field3778 == 0) {
                class171.field2737 = 0;
                class21.field234 = null;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class333.field5233.method1660(arg0 ^ 0xFFFFF530);
            int var5 = class333.field5233.method1655(-104);
            if ((class508.field7390 - 10) > var4 || (class134.field2262 + class508.field7390 + 10) < var4 || class265.field4428 - 10 > var5 || (class265.field4428 - (-class128.field2195 - 10)) < var5) {
                class212.method1396((byte) 62);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class508.field7390;
        int var7 = class265.field4428;
        int var8 = class134.field2262;
        int var9 = var3.method384((byte) -120);
        int var10 = var3.method386((byte) -48);
        int var11 = -1;
        for (int var12 = 0; var12 < class480.field7080; var12++) {
            if (class331.field5216) {
                int var16 = (class480.field7080 - var12 - 1) * 16 + var7 + 33;
                if (var9 > var6 && (var6 + var8) > var9 && var16 - 13 < var10 && var16 + 4 > var10) {
                    var11 = var12;
                }
            } else {
                int var17 = (class480.field7080 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && var9 < (var6 + var8) && var10 > var17 - 13 && (var17 + 3) > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class182 var14 = new class182(class108.field1934);
            for (class162 var15 = (class162) var14.method1235(0); var15 != null; var15 = (class162) var14.method1233((byte) -1)) {
                if (var11 == var13) {
                    class48.method347(-2, var10, var15, var9);
                }
                var13++;
            }
        }
        class212.method1396((byte) 119);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method22(String[] arg0, byte arg1) {
        if (arg1 != -119) {
            field48 = null;
        }
        field52++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)V")
    public static final void method23(int arg0) {
        class265.method1775(-2, class52.field840);
        field45++;
        class66.field979++;
        if (arg0 != 2) {
            field48 = null;
        }
        class261.field4357.method163(class287.method1865((byte) 125), (byte) 49);
        class261.field4357.method182(class358.field5581, arg0 - 123);
        class261.field4357.method182(class49.field825, -121);
        class261.field4357.method163(class510.field7403.field5093, (byte) 49);
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)V")
    public static final void method24(int arg0, int arg1) {
        field50++;
        int var2 = 80 / ((arg0 - 16) / 41);
        class266 var3 = class308.method1961(true, arg1, 8);
        var3.method1778(17991);
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(II)V")
    public class5(int arg0, int arg1) {
        this.field49 = arg1;
        this.field54 = arg0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLza;Lqs;)V")
    public static final void method25(byte arg0, class491 arg1, class496 arg2) {
        field44++;
        class523[] var3 = class523.method3090(arg2, class200.field3187, 0);
        class46.field741 = new class138[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class46.field741[var4] = arg1.method837(var3[var4], true);
        }
        class523[] var5 = class523.method3090(arg2, class83.field1457, 0);
        class175.field2776 = new class138[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class175.field2776[var6] = arg1.method837(var5[var6], true);
        }
        class523[] var7 = class523.method3090(arg2, class187.field2929, 0);
        if (arg0 >= -111) {
            field48 = null;
        }
        class510.field7480 = new class138[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class510.field7480[var8] = arg1.method837(var7[var8], true);
        }
        class523[] var9 = class523.method3090(arg2, class13.field155, 0);
        class327.field5154 = new class138[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class327.field5154[var10] = arg1.method837(var9[var10], true);
        }
        class523[] var11 = class523.method3090(arg2, class437.field6532, 0);
        class123.field2157 = new class138[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class123.field2157[var12] = arg1.method837(var11[var12], true);
        }
        class523[] var13 = class523.method3090(arg2, class279.field4584, 0);
        class439.field6564 = new class138[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class439.field6564[var14] = arg1.method837(var13[var14], true);
        }
        class523[] var15 = class523.method3090(arg2, class502.field7334, 0);
        class502.field7337 = new class138[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class502.field7337[var16] = arg1.method837(var15[var16], true);
        }
        class523[] var17 = class523.method3090(arg2, class422.field6376, 0);
        class202.field3201 = new class138[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class202.field3201[var18] = arg1.method837(var17[var18], true);
        }
        class523[] var19 = class523.method3090(arg2, class204.field3235, 0);
        class175.field2779 = new class138[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class175.field2779[var20] = arg1.method837(var19[var20], true);
        }
        class523[] var21 = class523.method3090(arg2, class129.field2218, 0);
        class144.field2351 = new class138[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class144.field2351[var22] = arg1.method837(var21[var22], true);
        }
        class523[] var23 = class523.method3090(arg2, class57.field896, 0);
        class115.field2054 = new class138[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class115.field2054[var24] = arg1.method837(var23[var24], true);
        }
        class523[] var25 = class523.method3090(arg2, class350.field5476, 0);
        class359.field5589 = new class138[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class359.field5589[var26] = arg1.method837(var25[var26], true);
        }
        class31.field489 = arg1.method837(class523.method3093(arg2, class441.field6577, 0), true);
        class387.field5966 = arg1.method837(class523.method3093(arg2, class429.field6439, 0), true);
        class523[] var27 = class523.method3090(arg2, class142.field2345, 0);
        class496.field7257 = new class138[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class496.field7257[var28] = arg1.method837(var27[var28], true);
        }
    }
}
