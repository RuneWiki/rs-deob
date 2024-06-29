import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class216 {

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Z")
    public boolean field3639 = true;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public int field3652;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public int field3641;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public int field3646;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field3638;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field3644 = 0;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Z")
    public static boolean field3649 = false;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lci;")
    public static class60 field3645 = new class60();

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static final void method1437(int arg0) {
        if (arg0 != 1) {
            field3637 = 45;
        }
        field3648++;
        class248.field4058.method200((byte) 100);
        int var1 = class248.field4058.method198(8, (byte) 0);
        if (var1 < class187.field3037) {
            for (int var2 = var1; var2 < class187.field3037; var2++) {
                class248.field4070[class61.field1071++] = class292.field4668[var2];
            }
        }
        if (var1 > class187.field3037) {
            throw new RuntimeException("gnpov1");
        }
        class187.field3037 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class292.field4668[var3];
            class141 var5 = class42.field625[var4];
            int var6 = class248.field4058.method198(1, (byte) 0);
            if (var6 == 0) {
                class292.field4668[class187.field3037++] = var4;
                var5.field1406 = class266.field4301;
            } else {
                int var7 = class248.field4058.method198(2, (byte) 0);
                if (var7 == 0) {
                    class292.field4668[class187.field3037++] = var4;
                    var5.field1406 = class266.field4301;
                    class60.field1051[class292.field4664++] = var4;
                } else if (var7 == 1) {
                    class292.field4668[class187.field3037++] = var4;
                    var5.field1406 = class266.field4301;
                    int var8 = class248.field4058.method198(3, (byte) 0);
                    var5.method534(1, -23, var8);
                    int var9 = class248.field4058.method198(1, (byte) 0);
                    if (var9 == 1) {
                        class60.field1051[class292.field4664++] = var4;
                    }
                } else if (var7 == 2) {
                    class292.field4668[class187.field3037++] = var4;
                    var5.field1406 = class266.field4301;
                    if (class248.field4058.method198(1, (byte) 0) == 1) {
                        int var10 = class248.field4058.method198(3, (byte) 0);
                        var5.method534(2, 112, var10);
                        int var11 = class248.field4058.method198(3, (byte) 0);
                        var5.method534(2, -96, var11);
                    } else {
                        int var12 = class248.field4058.method198(3, (byte) 0);
                        var5.method534(0, 125, var12);
                    }
                    int var13 = class248.field4058.method198(1, (byte) 0);
                    if (var13 == 1) {
                        class60.field1051[class292.field4664++] = var4;
                    }
                } else if (var7 == 3) {
                    class248.field4070[class61.field1071++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[B)V")
    public static final void method1438(int arg0, byte[] arg1) {
        field3647++;
        class101 var2 = new class101(arg1);
        var2.field1762 = arg1.length - 2;
        class110.field1990 = var2.method677(false);
        class199.field3226 = new byte[class110.field1990][];
        class112.field2028 = new int[class110.field1990];
        class181.field2969 = new boolean[class110.field1990];
        class110.field1983 = new int[class110.field1990];
        class105.field1881 = new byte[class110.field1990][];
        class213.field3588 = new int[class110.field1990];
        class12.field168 = new int[class110.field1990];
        var2.field1762 = arg1.length - class110.field1990 * 8 - 7;
        class79.field1365 = var2.method677(false);
        class9.field116 = var2.method677(false);
        int var3 = (var2.method669((byte) 36) & 0xFF) + 1;
        for (int var4 = 0; var4 < class110.field1990; var4++) {
            class112.field2028[var4] = var2.method677(false);
        }
        for (int var5 = 0; var5 < class110.field1990; var5++) {
            class213.field3588[var5] = var2.method677(false);
        }
        for (int var6 = 0; var6 < class110.field1990; var6++) {
            class110.field1983[var6] = var2.method677(false);
        }
        for (int var7 = 0; var7 < class110.field1990; var7++) {
            class12.field168[var7] = var2.method677(false);
        }
        var2.field1762 = arg1.length - (class110.field1990 * 8 - (-(var3 * 3) + 3)) - 7;
        class54.field941 = new int[var3];
        int var8 = 1;
        int var9 = 50 % ((arg0 + 56) / 54);
        while (var3 > var8) {
            class54.field941[var8] = var2.method658(22292);
            if (class54.field941[var8] == 0) {
                class54.field941[var8] = 1;
            }
            var8++;
        }
        var2.field1762 = 0;
        for (int var10 = 0; var10 < class110.field1990; var10++) {
            int var11 = class110.field1983[var10];
            int var12 = class12.field168[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class199.field3226[var10] = var14;
            byte[] var15 = new byte[var13];
            class105.field1881[var10] = var15;
            boolean var16 = false;
            int var17 = var2.method669((byte) 36);
            if ((var17 & 0x1) == 0) {
                for (int var23 = 0; var23 < var13; var23++) {
                    var14[var23] = var2.method646(-120);
                }
                if ((var17 & 0x2) != 0) {
                    for (int var24 = 0; var24 < var13; var24++) {
                        byte var25 = var15[var24] = var2.method646(-93);
                        var16 |= var25 != -1;
                    }
                }
            } else {
                int var18 = 0;
                label88: while (true) {
                    if (var18 >= var11) {
                        if ((var17 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var11) {
                                break label88;
                            }
                            for (int var20 = 0; var20 < var12; var20++) {
                                byte var21 = var15[var11 * var20 + var19] = var2.method646(-114);
                                var16 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var22 = 0; var22 < var12; var22++) {
                        var14[var11 * var22 + var18] = var2.method646(95);
                    }
                    var18++;
                }
            }
            class181.field2969[var10] = var16;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ldl;II)I")
    public static final int method1439(class46 arg0, int arg1, int arg2) {
        field3650++;
        if (arg0.field727 == null || arg1 >= arg0.field727.length) {
            return -2;
        }
        try {
            int[] var3 = arg0.field727[arg1];
            if (arg2 != -1) {
                field3645 = null;
            }
            byte var4 = 0;
            int var5 = 0;
            int var6 = 0;
            while (true) {
                byte var7 = 0;
                int var8 = 0;
                int var9 = var3[var6++];
                if (var9 == 0) {
                    return var5;
                }
                if (var9 == 15) {
                    var7 = 1;
                }
                if (var9 == 1) {
                    var8 = class104.field1831[var3[var6++]];
                }
                if (var9 == 2) {
                    var8 = class95.field1645[var3[var6++]];
                }
                if (var9 == 3) {
                    var8 = class129.field2263[var3[var6++]];
                }
                if (var9 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class46 var12 = class108.method760(arg2 - 29532, var11);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class203.method1346(-1, var13).field3242 || class158.field2637)) {
                        for (int var14 = 0; var14 < var12.field774.length; var14++) {
                            if (var13 + 1 == var12.field774[var14]) {
                                var8 += var12.field711[var14];
                            }
                        }
                    }
                }
                if (var9 == 16) {
                    var7 = 2;
                }
                if (var9 == 5) {
                    var8 = class125.field2191[var3[var6++]];
                }
                if (var9 == 17) {
                    var7 = 3;
                }
                if (var9 == 6) {
                    var8 = class246.field4046[class95.field1645[var3[var6++]] - 1];
                }
                if (var9 == 7) {
                    var8 = class125.field2191[var3[var6++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var8 = class273.field4378.field4598;
                }
                if (var9 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class135.field2336[var15]) {
                            var8 += class95.field1645[var15];
                        }
                    }
                }
                if (var9 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class46 var18 = class108.method760(arg2 - 29532, var17);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class203.method1346(-1, var19).field3242 || class158.field2637)) {
                        for (int var20 = 0; var20 < var18.field774.length; var20++) {
                            if ((var19 + 1) == var18.field774[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var8 = class129.field2262;
                }
                if (var9 == 12) {
                    var8 = class210.field3548;
                }
                if (var9 == 13) {
                    int var21 = class125.field2191[var3[var6++]];
                    int var22 = var3[var6++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var23 = var3[var6++];
                    var8 = class142.method994(var23, arg2 ^ 0xFFFFFF85);
                }
                if (var9 == 18) {
                    var8 = (class273.field4378.field1397 >> 7) + class126.field2206;
                }
                if (var9 == 19) {
                    var8 = (class273.field4378.field1458 >> 7) + class255.field4162;
                }
                if (var9 == 20) {
                    var8 = var3[var6++];
                }
                if (var7 == 0) {
                    if (var4 == 0) {
                        var5 += var8;
                    }
                    if (var4 == 1) {
                        var5 -= var8;
                    }
                    if (var4 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var4 == 3) {
                        var5 *= var8;
                    }
                    var4 = 0;
                } else {
                    var4 = var7;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static void method1440(int arg0) {
        field3645 = null;
        if (arg0 >= -48) {
            field3644 = 67;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3651 = arg5;
        this.field3652 = arg4;
        this.field3641 = arg3;
        this.field3639 = arg6;
        this.field3646 = arg2;
        this.field3638 = arg1;
        this.field3640 = arg0;
    }
}
