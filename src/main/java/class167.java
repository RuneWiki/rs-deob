import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class167 extends class77 {

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "[Ldb;")
    public class36[] field3189;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Ldc;")
    public static class37 field3188 = class185.method1233((byte) 86, "<)4col> x");

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "Ldc;")
    private static class37 field3193 = class185.method1233((byte) 86, "Unexpected server response)3");

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "Ldc;")
    public static class37 field3195 = class185.method1233((byte) 86, "");

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "Ldc;")
    public static class37 field3186 = field3193;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "Ldc;")
    public static class37 field3194 = class185.method1233((byte) 86, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Z")
    public static boolean field3190 = false;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "[I")
    public static int[] field3196;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILwa;IIIZ)V")
    public static final void method1118(int arg0, class238 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class197.field3690 = arg1;
        class51.field1025 = arg4;
        class127.field2360 = arg3;
        class41.field852 = arg5;
        class105.field1820 = arg2;
        class17.field261 = 10000;
        class209.field3919 = arg0;
        field3185++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZIJI)Z")
    public static final boolean method1119(boolean arg0, int arg1, long arg2, int arg3) {
        int var5 = (int) arg2 >> 14 & 0x1F;
        field3184++;
        int var6 = (int) arg2 >> 20 & 0x3;
        if (!arg0) {
            field3195 = null;
        }
        int var7 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class30 var8 = class73.method519(var7, -21035);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field560;
                var10 = var8.field562;
            } else {
                var9 = var8.field562;
                var10 = var8.field560;
            }
            int var11 = var8.field598;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class14.method91(0, arg3, 2, arg1, true, !arg0, 0, var11, class238.field4382.field3494[0], var10, class238.field4382.field3525[0], var9);
        } else {
            class14.method91(var5 + 1, arg3, 2, arg1, true, !arg0, var6, 0, class238.field4382.field3494[0], 0, class238.field4382.field3525[0], 0);
        }
        class161.field3035 = class205.field3805;
        class115.field2060 = 0;
        class49.field981 = 2;
        class128.field2412 = class200.field3745;
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
    public static final void method1120(int arg0, int arg1, int arg2, int arg3) {
        class194.field3620 = new class18[arg0][arg1][arg2];
        class78.field1370 = new int[arg0][arg1 + 1][arg2 + 1];
        class107.method700(false);
        class238.field4372 = arg1;
        client.field682 = arg2;
        class212.field3970 = new int[arg0][arg1 + 1][arg2 + 1];
        class6.method45();
        class84.field1484 = arg3;
        class214.field4005 = new boolean[class84.field1484 + class84.field1484 + 1][class84.field1484 + class84.field1484 + 1];
        class153.field2908 = new boolean[class84.field1484 + class84.field1484 + 2][class84.field1484 + class84.field1484 + 2];
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
    public static void method1121(byte arg0) {
        field3196 = null;
        field3186 = null;
        field3188 = null;
        field3194 = null;
        field3195 = null;
        if (arg0 <= -9) {
            field3193 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
    public static final int method1122(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)Z")
    public final boolean method1123(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field3189 = null;
        }
        field3187++;
        return this.field3189[arg0].field722;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lwa;I)V")
    public static final void method1124(class238 arg0, int arg1) {
        class168.field3205 = arg0;
        field3191++;
        if (arg1 <= 71) {
            method1120(8, 84, -21, 119);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lwa;Lwa;IZ)V")
    public class167(class238 arg0, class238 arg1, int arg2, boolean arg3) {
        class203 var5 = new class203();
        int var6 = arg0.method1559(26143, arg2);
        this.field3189 = new class36[var6];
        int[] var7 = arg0.method1541(arg2, false);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1547(var7[var8], 0, arg2);
            class67 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class67 var12 = (class67) var5.method1338(115); var12 != null; var12 = (class67) var5.method1332((byte) -89)) {
                if (var12.field1203 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1556(var11, 15059, 0);
                } else {
                    var13 = arg1.method1556(0, 15059, var11);
                }
                var10 = new class67(var11, var13);
                var5.method1340(26, var10);
            }
            this.field3189[var7[var8]] = new class36(var9, var10);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[[[BIB)V")
    public static final void method1125(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5) {
        class164.field3111++;
        class26.field447 = 0;
        for (int var6 = class206.field3850; var6 < class95.field1674; var6++) {
            class18[][] var31 = class180.field3354[var6];
            for (int var32 = class242.field4446; var32 < class41.field838; var32++) {
                for (int var33 = class18.field267; var33 < class180.field3360; var33++) {
                    class18 var34 = var31[var32][var33];
                    if (var34 != null) {
                        if (var34.field293 <= class92.field1583 && class214.field4005[var32 + class84.field1484 - class240.field4408][var33 + class84.field1484 - class199.field3702] && (arg3 == null || var6 < arg4 || arg3[var6][var32][var33] != arg5)) {
                            var34.field282 = true;
                            var34.field297 = true;
                            if (var34.field290 > 0) {
                                var34.field294 = true;
                            } else {
                                var34.field294 = false;
                            }
                            class26.field447++;
                        } else {
                            var34.field282 = false;
                            var34.field297 = false;
                            var34.field276 = 0;
                        }
                    }
                }
            }
        }
        for (int var7 = class206.field3850; var7 < class95.field1674; var7++) {
            class18[][] var20 = class180.field3354[var7];
            for (int var21 = -class84.field1484; var21 <= 0; var21++) {
                int var22 = class240.field4408 + var21;
                int var23 = class240.field4408 - var21;
                if (var22 >= class242.field4446 || var23 < class41.field838) {
                    for (int var24 = -class84.field1484; var24 <= 0; var24++) {
                        int var25 = class199.field3702 + var24;
                        int var26 = class199.field3702 - var24;
                        if (var22 >= class242.field4446) {
                            if (var25 >= class18.field267) {
                                class18 var27 = var20[var22][var25];
                                if (var27 != null && var27.field282) {
                                    class20.method133(var27, true);
                                }
                            }
                            if (var26 < class180.field3360) {
                                class18 var28 = var20[var22][var26];
                                if (var28 != null && var28.field282) {
                                    class20.method133(var28, true);
                                }
                            }
                        }
                        if (var23 < class41.field838) {
                            if (var25 >= class18.field267) {
                                class18 var29 = var20[var23][var25];
                                if (var29 != null && var29.field282) {
                                    class20.method133(var29, true);
                                }
                            }
                            if (var26 < class180.field3360) {
                                class18 var30 = var20[var23][var26];
                                if (var30 != null && var30.field282) {
                                    class20.method133(var30, true);
                                }
                            }
                        }
                        if (class26.field447 == 0) {
                            class97.field1696 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var8 = class206.field3850; var8 < class95.field1674; var8++) {
            class18[][] var9 = class180.field3354[var8];
            for (int var10 = -class84.field1484; var10 <= 0; var10++) {
                int var11 = class240.field4408 + var10;
                int var12 = class240.field4408 - var10;
                if (var11 >= class242.field4446 || var12 < class41.field838) {
                    for (int var13 = -class84.field1484; var13 <= 0; var13++) {
                        int var14 = class199.field3702 + var13;
                        int var15 = class199.field3702 - var13;
                        if (var11 >= class242.field4446) {
                            if (var14 >= class18.field267) {
                                class18 var16 = var9[var11][var14];
                                if (var16 != null && var16.field282) {
                                    class20.method133(var16, false);
                                }
                            }
                            if (var15 < class180.field3360) {
                                class18 var17 = var9[var11][var15];
                                if (var17 != null && var17.field282) {
                                    class20.method133(var17, false);
                                }
                            }
                        }
                        if (var12 < class41.field838) {
                            if (var14 >= class18.field267) {
                                class18 var18 = var9[var12][var14];
                                if (var18 != null && var18.field282) {
                                    class20.method133(var18, false);
                                }
                            }
                            if (var15 < class180.field3360) {
                                class18 var19 = var9[var12][var15];
                                if (var19 != null && var19.field282) {
                                    class20.method133(var19, false);
                                }
                            }
                        }
                        if (class26.field447 == 0) {
                            class97.field1696 = false;
                            return;
                        }
                    }
                }
            }
        }
        class97.field1696 = false;
    }
}
