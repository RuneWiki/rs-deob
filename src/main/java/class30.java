import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class30 {

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Z")
    public static boolean field401 = false;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field405 = 0;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
    public static int[] field400 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field406 = 0;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V", line = 7)
    public static final void method190(int arg0, int arg1) {
        class84.field1245 = 1000 / arg0;
        if (arg1 != 0) {
            field406 = -27;
        }
        field403++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIILmd;Lmd;IIIIJ)V", line = 19)
    public static final void method192(int arg0, int arg1, int arg2, int arg3, class233 arg4, class233 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class226 var12 = new class226();
        var12.field3440 = arg10;
        var12.field3447 = arg1 * 128 + 64;
        var12.field3446 = arg2 * 128 + 64;
        var12.field3441 = arg3;
        var12.field3450 = arg4;
        var12.field3435 = arg5;
        var12.field3432 = arg6;
        var12.field3443 = arg7;
        var12.field3434 = arg8;
        var12.field3438 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class158.field2367[var13][arg1][arg2] == null) {
                class158.field2367[var13][arg1][arg2] = new class221(var13, arg1, arg2);
            }
        }
        class158.field2367[arg0][arg1][arg2].field3368 = var12;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V", line = 49)
    public static final void method193(int arg0, int arg1) {
        class221 var2 = class158.field2367[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class221 var4 = class158.field2367[var3][arg0][arg1] = class158.field2367[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3372--;
                for (int var5 = 0; var5 < var4.field3374; var5++) {
                    class311 var6 = var4.field3354[var5];
                    if ((var6.field4720 >> 29 & 0x3L) == 2L && var6.field4724 == arg0 && var6.field4735 == arg1) {
                        var6.field4730--;
                    }
                }
            }
        }
        if (class158.field2367[0][arg0][arg1] == null) {
            class158.field2367[0][arg0][arg1] = new class221(0, arg0, arg1);
        }
        class158.field2367[0][arg0][arg1].field3356 = var2;
        class158.field2367[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIZIII)V", line = 93)
    public static final void method196(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field404++;
        if (class66.field859 == arg4 && class302.field4613 == arg1 && class54.field675 == arg6 || class80.method540(arg5 + 36)) {
            return;
        }
        class54.field675 = arg6;
        class302.field4613 = arg1;
        class66.field859 = arg4;
        if (class80.method540(arg5 + 64)) {
            class54.field675 = 0;
        }
        if (arg3) {
            class163.method1155(28, 10);
        } else {
            class163.method1155(25, 10);
        }
        class274.method1930(class35.field434, true, arg5 ^ 0x1);
        int var7 = class217.field3309;
        class217.field3309 = arg4 * 8 - 48;
        int var8 = class189.field2807;
        class189.field2807 = arg1 * 8 - 48;
        class140.field2115 = class242.method1637(class66.field859 * 8, class302.field4613 * 8, (byte) 99);
        int var9 = class189.field2807 - var8;
        int var10 = class189.field2807;
        int var11 = class217.field3309 - var7;
        int var12 = class217.field3309;
        class179.field2649 = null;
        if (arg3) {
            class172.field2577 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class69 var17 = class187.field2788[var16];
                if (var17 != null) {
                    var17.field1566 -= var11 * 128;
                    var17.field1505 -= var9 * 128;
                    if (var17.field1566 >= 0 && var17.field1566 <= 13184 && var17.field1505 >= 0 && var17.field1505 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field1541[var18] -= var11;
                            var17.field1516[var18] -= var9;
                        }
                        class56.field711[class172.field2577++] = var16;
                    } else {
                        class187.field2788[var16].method458(arg5 + 16, (class58) null);
                        class187.field2788[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class69 var14 = class187.field2788[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field1541[var15] -= var11;
                        var14.field1516[var15] -= var9;
                    }
                    var14.field1505 -= var9 * 128;
                    var14.field1566 -= var11 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class195 var20 = class241.field3592[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field1541[var21] -= var11;
                    var20.field1516[var21] -= var9;
                }
                var20.field1505 -= var9 * 128;
                var20.field1566 -= var11 * 128;
            }
        }
        class180.field2697 = arg6;
        class114.field1750.method1348(arg0, arg2, (byte) 109, false);
        int var22 = arg5;
        byte var23 = 0;
        byte var24 = 104;
        byte var25 = 104;
        byte var26 = 1;
        byte var27 = 1;
        if (var9 < 0) {
            var27 = -1;
            var24 = -1;
            var22 = 103;
        }
        if (var11 < 0) {
            var23 = 103;
            var26 = -1;
            var25 = -1;
        }
        for (int var28 = var23; var28 != var25; var28 += var26) {
            for (int var29 = var22; var29 != var24; var29 += var27) {
                int var30 = var11 + var28;
                int var31 = var9 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class149.field2246[var32][var28][var29] = class149.field2246[var32][var30][var31];
                    } else {
                        class149.field2246[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class218 var33 = (class218) class164.field2468.method1109(arg5 ^ 0xFFFFFF8F); var33 != null; var33 = (class218) class164.field2468.method1115((byte) 121)) {
            var33.field3330 -= var9;
            var33.field3331 -= var11;
            if (var33.field3331 < 0 || var33.field3330 < 0 || var33.field3331 >= 104 || var33.field3330 >= 104) {
                var33.method714(arg5 ^ 0x5D);
            }
        }
        class168.field2522 = 0;
        if (arg3) {
            class302.field4612 -= var11 * 128;
            class327.field4918 -= var9;
            class203.field3052 -= var9 * 128;
            class230.field3481 -= var11;
            class168.field2519 -= var11;
            class214.field3253 -= var9;
        } else {
            class56.field710 = 1;
        }
        if (class253.field3844 != 0) {
            class253.field3844 -= var11;
            class283.field4288 -= var9;
        }
        if (class117.field1817 && arg3 && (Math.abs(var11) > 104 || Math.abs(var9) > 104)) {
            class49.method336(false);
        }
        class198.field2972 = -1;
        class205.field3082.method1113((byte) 91);
        class69.field905.method1113((byte) 51);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 340)
    public static void method197(int arg0) {
        if (arg0 != 27717) {
            field400 = (int[]) null;
        }
        field400 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ltb;ZB)V", line = 353)
    public static final void method198(class167 arg0, boolean arg1, byte arg2) {
        int var3 = (int) arg0.field1603;
        field398++;
        int var4 = 109 / ((8 - arg2) / 36);
        int var5 = arg0.field2505;
        arg0.method714(110);
        if (arg1) {
            class41.method278(var5, -72);
        }
        class249.method1684(var5, 11236);
        class329 var6 = class80.method541((byte) 96, var3);
        if (var6 != null) {
            class247.method1666(var6, -126);
        }
        int var7 = class190.field2829;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class96.method680(class201.field2998[var8], 1003)) {
                class110.method769(var8, 37);
            }
        }
        if (class190.field2829 == 1) {
            class5.field27 = false;
            class252.method1704(class23.field347, false, class242.field3633, class176.field2609, class163.field2466);
        } else {
            class252.method1704(class23.field347, false, class242.field3633, class176.field2609, class163.field2466);
            int var9 = class217.field3299.method632(class154.field2312);
            for (int var10 = 0; var10 < class190.field2829; var10++) {
                int var11 = class217.field3299.method632(class163.method1152(-89, var10));
                if (var11 > var9) {
                    var9 = var11;
                }
            }
            class176.field2609 = (field401 ? 26 : 22) + class190.field2829 * 15;
            class163.field2466 = var9 + 8;
        }
        if (class123.field1926 != -1) {
            class136.method991(class123.field1926, 1, 27011);
        }
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(II)V", line = 428)
    public static final void method200(int arg0, int arg1) {
        int var2 = 120 % ((arg1 + 25) / 43);
        class11.field113.method2174(-12634, arg0);
        field399++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Ljb;")
    public abstract class206 method191(boolean arg0);

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)I")
    public abstract int method194(int arg0, int arg1);

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(II)[B")
    public abstract byte[] method195(int arg0, int arg1);

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(II)V")
    public abstract void method199(int arg0, int arg1);
}
