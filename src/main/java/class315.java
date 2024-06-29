import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class315 extends RuntimeException {

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4957;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "Ljava/lang/String;")
    public String field4969;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "J")
    public static long field4956 = 0L;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "[I")
    public static int[] field4960 = new int[8];

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "[I")
    public static int[] field4958 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field4968 = 0;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Z")
    public static boolean field4964 = false;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Z")
    public static boolean field4962 = false;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "[I")
    public static int[] field4965 = new int[4];

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Z")
    public static boolean field4959 = false;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public static int field4971 = -1;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "[I")
    public static int[] field4966 = new int[50];

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Lwf;")
    public static class306 field4963;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2150(byte arg0) {
        class177.field2719 = null;
        class343.field5343 = null;
        class259.field4021 = null;
        if (arg0 >= 11) {
            class271.field4164 = null;
            class128.field2001 = null;
            field4961++;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[Lwb;IIII[BZ)[I", line = 28)
    public static final int[] method2151(int arg0, class294[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, boolean arg7) {
        field4967++;
        byte var8;
        if (arg7) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg7) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg5 + var10) > 0 && arg5 + var10 < 103 && arg2 + var11 > 0 && arg2 + var11 < 103) {
                            arg1[var9].field4544[arg5 + var10][arg2 + var11] = class311.method2135(arg1[var9].field4544[arg5 + var10][arg2 + var11], -2097153);
                        }
                    }
                }
            }
        }
        if (arg3 != 104) {
            method2150((byte) 74);
        }
        int var12 = arg4 + arg5;
        int var13 = arg0 + arg2;
        class303 var14 = new class303(arg6);
        for (int var15 = 0; var15 < var8; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class51.method347(arg5 + var16, arg2 + var17, var14, 1, 0, arg7, var15, false, var12 + var16, var13 + var17);
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var14.field4716.length > var14.field4679) {
            int var20 = var14.method2043((byte) -126);
            if (var20 == 128) {
                class22.field276[0] = var14.method1994(false);
                class22.field276[1] = var14.method2042(arg3 - 97);
                var19 = true;
                class22.field276[2] = var14.method2042(arg3 - 97);
                class22.field276[3] = var14.method2042(7);
                class22.field276[4] = var14.method1994(false);
            } else {
                if (var20 != 129) {
                    var14.field4679--;
                    break;
                }
                var18 = true;
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var14.method2001(-3);
                    if (var22 == 0) {
                        int var23 = arg5;
                        int var24 = arg5 + 64;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        if (arg5 < 0) {
                            var23 = 0;
                        } else if (arg5 >= 104) {
                            var23 = 104;
                        }
                        int var25 = arg2 + 64;
                        int var26 = arg2;
                        if (arg2 < 0) {
                            var26 = 0;
                        } else if (arg2 >= 104) {
                            var26 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        while (var23 < var24) {
                            while (var26 < var25) {
                                class265.field4096[var21][var23][var26] = 0;
                                var26++;
                            }
                            var23++;
                        }
                    } else if (var22 == 1) {
                        for (int var31 = 0; var31 < 64; var31 += 4) {
                            for (int var32 = 0; var32 < 64; var32 += 4) {
                                byte var33 = var14.method2001(arg3 - 107);
                                for (int var34 = arg5 + var31; var34 < (var31 + arg5 + 4); var34++) {
                                    for (int var35 = arg2 + var32; var35 < arg2 + var32 + 4; var35++) {
                                        if (var34 >= 0 && var34 < 104 && var35 >= 0 && var35 < 104) {
                                            class265.field4096[var21][var34][var35] = var33;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var27 = arg5 + 64;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 >= 104) {
                            var27 = 104;
                        }
                        int var28 = arg5;
                        if (arg5 < 0) {
                            var28 = 0;
                        } else if (arg5 >= 104) {
                            var28 = 104;
                        }
                        int var29 = arg2 + 64;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        int var30 = arg2;
                        if (arg2 < 0) {
                            var30 = 0;
                        } else if (arg2 >= 104) {
                            var30 = 104;
                        }
                        while (var27 > var28) {
                            while (var29 > var30) {
                                class265.field4096[var21][var28][var30] = class265.field4096[var21 - 1][var28][var30];
                                var30++;
                            }
                            var28++;
                        }
                    }
                }
            }
        }
        if (class333.field5166 && !arg7) {
            class117 var36 = null;
            while (true) {
                while (var14.field4716.length > var14.field4679) {
                    int var37 = var14.method2043((byte) -122);
                    if (var37 == 0) {
                        var36 = new class117(var14);
                    } else if (var37 == 1) {
                        int var38 = var14.method2043((byte) -109);
                        if (var38 > 0) {
                            for (int var39 = 0; var39 < var38; var39++) {
                                class310 var40 = new class310(var14);
                                if (var40.field4894 == 31) {
                                    class221 var41 = class228.method1561(-69, var14.method1994(false));
                                    var40.method2130(var41.field3514, var41.field3504, var41.field3511, var41.field3505, 11);
                                }
                                var40.field4925 += arg5 << 7;
                                var40.field4913 += arg2 << 7;
                                int var42 = var40.field4925 >> 7;
                                int var43 = var40.field4913 >> 7;
                                if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                                    var40.field4908 = (class305.field4784[1][var42][var43] & 0x2) != 0;
                                    var40.field4906 = client.field2034[var40.field4915][var42][var43] - var40.field4906;
                                    class147.method1038(var40);
                                }
                            }
                        }
                    } else if (var37 == 2) {
                        if (var36 == null) {
                            var36 = new class117();
                        }
                        var36.method807(false, var14);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var36 == null) {
                    var36 = new class117();
                }
                for (int var44 = 0; var44 < 8; var44++) {
                    for (int var45 = 0; var45 < 8; var45++) {
                        int var46 = (arg5 >> 3) + var44;
                        int var47 = (arg2 >> 3) + var45;
                        if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                            class14.field144[var46][var47] = var36;
                        }
                    }
                }
                break;
            }
        }
        if (!var18) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg5 >> 2) + var49;
                        int var52 = (arg2 >> 2) + var50;
                        if (var51 >= 0 && var51 < 26 && var52 >= 0 && var52 < 26) {
                            class265.field4096[var48][var51][var52] = 0;
                        }
                    }
                }
            }
        }
        return var19 ? class22.field276 : null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZIZIIIZLpk;I)Lng;", line = 453)
    public static final class245 method2152(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, class172 arg7, int arg8) {
        field4970++;
        class291 var9 = class160.method1106(arg4, -97);
        if (arg5 > 1 && var9.field4443 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field4470[var11] <= arg5 && var9.field4470[var11] != 0) {
                    var10 = var9.field4443[var11];
                }
            }
            if (var10 != -1) {
                var9 = class160.method1106(var10, arg3 ^ 0xFFFFFFA9);
            }
        }
        class141 var12 = var9.method1896(arg7, 0);
        if (var12 == null) {
            return null;
        }
        class178 var13 = null;
        if (var9.field4432 != -1) {
            var13 = (class178) method2152(false, 0, true, 2, var9.field4466, 10, true, arg7, 1);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field4483 != -1) {
            var13 = (class178) method2152(false, arg1, false, 2, var9.field4493, arg5, true, arg7, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class57.field797;
        int var15 = class57.field798;
        int var16 = class57.field793;
        int[] var17 = new int[4];
        class57.method379(var17);
        class178 var18 = new class178(36, 32);
        class57.method377(var18.field2734, 36, 32);
        class12.method95();
        class12.method98(16, 16);
        class12.field116 = false;
        int var19 = var9.field4484;
        if (arg2) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg8 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class12.field127[var9.field4459] * var19 >> 16;
        int var21 = class12.field121[var9.field4459] * var19 >> 16;
        var12.method965(0, var9.field4452, var9.field4478, var9.field4459, var9.field4496, var21 + var9.field4473 - (var12.method112() / arg3), var9.field4473 + var20, -1L);
        if (arg8 >= 1) {
            var18.method1208(1);
            if (arg8 >= 2) {
                var18.method1208(16777215);
            }
            class57.method377(var18.field2734, 36, 32);
        }
        if (arg1 != 0) {
            var18.method1210(arg1);
        }
        if (var9.field4432 != -1) {
            var13.method921(0, 0);
        } else if (var9.field4483 != -1) {
            class57.method377(var13.field2734, 36, 32);
            var18.method921(0, 0);
            var18 = var13;
        }
        if (arg0 && (var9.field4440 == 1 || arg5 != 1) && arg5 != -1) {
            class80.field1186.method1237(class285.method1862(arg5, (byte) -43), 0, 9, 16776960, 1);
        }
        class57.method377(var14, var15, var16);
        class57.method381(var17);
        class12.method95();
        class12.field116 = true;
        return class333.field5166 && !arg6 ? new class186(var18) : var18;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 591)
    public static void method2153(int arg0) {
        field4966 = null;
        field4960 = null;
        field4965 = null;
        if (arg0 != -32394) {
            field4964 = true;
        }
        field4963 = null;
        field4958 = null;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 613)
    public class315(Throwable arg0, String arg1) {
        this.field4957 = arg0;
        this.field4969 = arg1;
    }
}
