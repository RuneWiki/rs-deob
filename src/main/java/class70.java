import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class70 {

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "Z")
    public static boolean field955 = false;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field959 = 0;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)I", line = 3)
    public static final int method416(int arg0, int arg1) {
        field960++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xD1) >> 6;
        if (arg1 == var2) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 58)
    public static final void method417(int arg0) {
        field956++;
        int var1 = 0;
        if (arg0 != 2) {
            return;
        }
        while (class779.field10635 > var1) {
            class75.field1067[var1] = null;
            var1++;
        }
        class779.field10635 = 0;
        for (int var2 = 0; var2 < class78.field1121; var2++) {
            for (int var42 = 0; var42 < class330.field4039; var42++) {
                for (int var43 = 0; var43 < class559.field7102; var43++) {
                    class766 var44 = class28.field252[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field10427 > 0) {
                            var44.field10427 = (short) (var44.field10427 * -1);
                        }
                        if (var44.field10429 > 0) {
                            var44.field10429 = (short) (var44.field10429 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class78.field1121; var3++) {
            for (int var4 = 0; var4 < class330.field4039; var4++) {
                for (int var5 = 0; var5 < class559.field7102; var5++) {
                    class766 var6 = class28.field252[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class28.field252[0][var5][var4] != null && class28.field252[0][var5][var4].field10422 != null;
                        if (var6.field10427 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class766 var12 = class28.field252[var3][var5][var4 - 1];
                            int var13 = class383.field4790[var3].method2060(var4, -126, var5);
                            while (var8 > 0 && var12 != null && var12.field10427 < 0 && var6.field10427 == var12.field10427 && var6.field10428 == var12.field10428 && class383.field4790[var3].method2060(var8 - 1, arg0 + -97, var5) == var13 && (var8 - 1 <= 0 || class383.field4790[var3].method2060(var8 - 2, -103, var5) == var13)) {
                                var8--;
                                var12 = class28.field252[var3][var5][var8 - 1];
                            }
                            for (class766 var14 = class28.field252[var3][var5][var4 + 1]; var9 < class559.field7102 && var14 != null && var14.field10427 < 0 && var6.field10427 == var14.field10427 && var6.field10428 == var14.field10428 && var13 == class383.field4790[var3].method2060(var9 + 1, -108, var5) && (var9 + 1 >= class559.field7102 || class383.field4790[var3].method2060(var9 + 2, -100, var5) == var13); var14 = class28.field252[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class383.field4790[var7 ? var3 + 1 : var3].method2060(var8, arg0 - 98, var5);
                            int var17 = var6.field10427 * var15 + var16;
                            int var18 = class383.field4790[var7 ? var3 + 1 : var3].method2060(var9 + 1, -116, var5);
                            int var19 = var18 + (var6.field10427 * var15);
                            int var20 = var5 << class88.field1221;
                            int var21 = var8 << class88.field1221;
                            int var22 = (var9 << class88.field1221) + class722.field9480;
                            class75.field1067[class779.field10635++] = new class318(1, var3, var6.field10428 + var20, var20 - -var6.field10428, var6.field10428 + var20, var6.field10428 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class28.field252[var23][var5][var24].field10427 = (short) (class28.field252[var23][var5][var24].field10427 * -1);
                                }
                            }
                        }
                        if (var6.field10429 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class766 var29 = class28.field252[var3][var5 - 1][var4];
                            int var30 = class383.field4790[var3].method2060(var4, -91, var5);
                            while (var25 > 0 && var29 != null && var29.field10429 < 0 && var6.field10429 == var29.field10429 && var6.field10424 == var29.field10424 && class383.field4790[var3].method2060(var4, -120, var25 - 1) == var30 && (var25 - 1 <= 0 || class383.field4790[var3].method2060(var4, -93, var25 - 2) == var30)) {
                                var25--;
                                var29 = class28.field252[var3][var25 - 1][var4];
                            }
                            for (class766 var31 = class28.field252[var3][var5 + 1][var4]; class330.field4039 > var26 && var31 != null && var31.field10429 < 0 && var6.field10429 == var31.field10429 && var6.field10424 == var31.field10424 && var30 == class383.field4790[var3].method2060(var4, -112, var26 + 1) && (class330.field4039 <= var26 + 1 || var30 == class383.field4790[var3].method2060(var4, -112, var26 + 2)); var31 = class28.field252[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class383.field4790[var7 ? var3 + 1 : var3].method2060(var4, -128, var25);
                            int var34 = var6.field10429 * var32 + var33;
                            int var35 = class383.field4790[var7 ? var3 + 1 : var3].method2060(var4, -106, var26 + 1);
                            int var36 = var6.field10429 * var32 + var35;
                            int var37 = var25 << class88.field1221;
                            int var38 = (var26 << class88.field1221) + class722.field9480;
                            int var39 = var4 << class88.field1221;
                            class75.field1067[class779.field10635++] = new class318(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var39 + var6.field10424, var6.field10424 + var39, var6.field10424 + var39, var39 - -var6.field10424);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class28.field252[var40][var41][var4].field10429 = (short) (class28.field252[var40][var41][var4].field10429 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class53.field676 = true;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBIII)V", line = 283)
    public static final void method418(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class80.field1131 = arg3;
        class405.field5375 = arg4;
        class498.field6390 = arg2;
        field954++;
        if (arg1 >= -78) {
            field957 = -96;
        }
        class30.field274 = arg0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([IIILsu;)Lqn;", line = 298)
    public static final class313 method419(int[] arg0, int arg1, int arg2, class615 arg3) {
        field952++;
        int[] var4 = null;
        if (arg1 >= -37) {
            return null;
        }
        int[] var5 = null;
        int[] var6 = null;
        float[][] var7 = null;
        if (arg3.field7758 != null) {
            int var8 = arg3.field7756;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; var15++) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            var6 = new int[var8];
            for (int var16 = 0; var16 < arg2; var16++) {
                int var23 = arg0[var16];
                if (arg3.field7758[var23] != -1) {
                    int var24 = arg3.field7758[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg3.field7784[var23];
                        } else if (var25 == 1) {
                            var26 = arg3.field7787[var23];
                        } else {
                            var26 = arg3.field7771[var23];
                        }
                        int var27 = arg3.field7798[var26];
                        int var28 = arg3.field7768[var26];
                        int var29 = arg3.field7786[var26];
                        if (var27 < var9[var24]) {
                            var9[var24] = var27;
                        }
                        if (var10[var24] < var27) {
                            var10[var24] = var27;
                        }
                        if (var11[var24] > var28) {
                            var11[var24] = var28;
                        }
                        if (var28 > var12[var24]) {
                            var12[var24] = var28;
                        }
                        if (var29 < var13[var24]) {
                            var13[var24] = var29;
                        }
                        if (var14[var24] < var29) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            var5 = new int[var8];
            var4 = new int[var8];
            var7 = new float[var8][];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg3.field7808[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var19;
                    float var20;
                    float var21;
                    if (var18 == 1) {
                        int var22 = arg3.field7778[var17];
                        var19 = 64.0F / (float) arg3.field7763[var17];
                        if (var22 == 0) {
                            var21 = 1.0F;
                            var20 = 1.0F;
                        } else if (var22 <= 0) {
                            var20 = (float) (-var22) / 1024.0F;
                            var21 = 1.0F;
                        } else {
                            var20 = 1.0F;
                            var21 = (float) var22 / 1024.0F;
                        }
                    } else if (var18 == 2) {
                        var19 = 64.0F / (float) arg3.field7763[var17];
                        var21 = 64.0F / (float) arg3.field7782[var17];
                        var20 = 64.0F / (float) arg3.field7778[var17];
                    } else {
                        var19 = (float) arg3.field7763[var17] / 1024.0F;
                        var20 = (float) arg3.field7778[var17] / 1024.0F;
                        var21 = (float) arg3.field7782[var17] / 1024.0F;
                    }
                    var7[var17] = class196.method1353(arg3.field7790[var17], class249.method1625(255, arg3.field7794[var17]), var19, var20, arg3.field7792[var17], arg3.field7755[var17], var21, 12959);
                }
            }
        }
        return new class313(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZIILwm;ILeka;B)V", line = 487)
    public static final void method420(boolean arg0, int arg1, int arg2, class30 arg3, int arg4, class654 arg5, byte arg6) {
        field951++;
        class636.method3433(arg2, arg3, arg4, 0, arg0, arg1);
        if (arg6 <= -26) {
            class168.field2234 = arg5;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIBIIII)I", line = 505)
    public static final int method421(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -39 % ((21 - arg2) / 40);
        field953++;
        int var8 = arg1 & 0x3;
        if ((arg6 & 0x1) == 1) {
            int var9 = arg4;
            arg4 = arg0;
            arg0 = var9;
        }
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 1 + 7 - arg5 - arg4;
        } else {
            return 7 - (arg0 - 1) - arg3;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V", line = 534)
    public static final void method422(int arg0, int arg1) {
        field958++;
        if (~arg1 != arg0 && class202.field2800[arg1]) {
            class192.field2689.method131(true, arg1);
            class647.field8259[arg1] = null;
            class598.field7612[arg1] = null;
            class202.field2800[arg1] = false;
        }
    }
}
