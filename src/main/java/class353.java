import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class353 {

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5582 = "wishes to trade with you.";

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lng;")
    public static class178[] field5579 = new class178[50];

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field5583 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[III[J)V", line = 6)
    public static final void method2456(int arg0, int[] arg1, int arg2, int arg3, long[] arg4) {
        int var5 = -31 / ((29 - arg0) / 53);
        field5580++;
        if (arg3 >= arg2) {
            return;
        }
        int var6 = (arg2 + arg3) / 2;
        int var7 = arg3;
        long var8 = arg4[var6];
        arg4[var6] = arg4[arg2];
        arg4[arg2] = var8;
        int var10 = arg1[var6];
        arg1[var6] = arg1[arg2];
        arg1[arg2] = var10;
        for (int var11 = arg3; var11 < arg2; var11++) {
            if (arg4[var11] < (long) (var11 & 0x1) + var8) {
                long var12 = arg4[var11];
                arg4[var11] = arg4[var7];
                arg4[var7] = var12;
                int var14 = arg1[var11];
                arg1[var11] = arg1[var7];
                arg1[var7++] = var14;
            }
        }
        arg4[arg2] = arg4[var7];
        arg4[var7] = var8;
        arg1[arg2] = arg1[var7];
        arg1[var7] = var10;
        method2456(83, arg1, var7 - 1, arg3, arg4);
        method2456(-125, arg1, arg2, var7 + 1, arg4);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 79)
    public static void method2457(int arg0) {
        field5582 = null;
        if (arg0 >= -94) {
            method2458((class257) null, false);
        }
        field5579 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lk;Z)V", line = 92)
    public static final void method2458(class257 arg0, boolean arg1) {
        class141.field2589.method2303((byte) -124, arg0);
        while (true) {
            class257 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class257[][] var7;
            class257 var120;
            do {
                class257 var119;
                do {
                    class257 var118;
                    do {
                        class257 var117;
                        do {
                            do {
                                do {
                                    float var8;
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class257) class141.field2589.method2301((byte) 125);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field4161);
                                            var3 = var2.field4166;
                                            var4 = var2.field4142;
                                            var5 = var2.field4153;
                                            var6 = var2.field4160;
                                            var7 = class279.field4430[var5];
                                            var8 = 0.0F;
                                            if (class43.field680) {
                                                if (class249.field4042 == class137.field2487) {
                                                    int var9 = class352.field5574[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class272.field4344 != var10) {
                                                        class272.field4344 = var10;
                                                        class104.method897(-128, var10);
                                                        class9.method69(class344.method2409(3));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class188.field3157 != var11) {
                                                        class188.field3157 = var11;
                                                        class324.method2248(var11, (byte) 74);
                                                    }
                                                    int var12 = class255.field4110[0][var3 + 1][var4] + class255.field4110[0][var3][var4] + class255.field4110[0][var3][var4 + 1] + class255.field4110[0][var3 + 1][var4 + 1] >> 2;
                                                    class83.method749(-var12, 3, 109);
                                                    var8 = 201.5F;
                                                    class43.method359(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class43.method359(var8);
                                                }
                                            }
                                            if (!var2.field4143) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class257 var13 = class279.field4430[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field4161) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class51.field788 && var3 > class215.field3617) {
                                                    class257 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field4161 && (var14.field4143 || (var2.field4151 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class51.field788 && var3 < class202.field3444 - 1) {
                                                    class257 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field4161 && (var15.field4143 || (var2.field4151 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class238.field3905 && var4 > class332.field5292) {
                                                    class257 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field4161 && (var16.field4143 || (var2.field4151 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class238.field3905 && var4 < class304.field4813 - 1) {
                                                    class257 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field4161 && (var17.field4143 || (var2.field4151 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field4143 = false;
                                            if (var2.field4145 != null) {
                                                class257 var18 = var2.field4145;
                                                if (class43.field680) {
                                                    class43.method359(201.5F - (float) (var18.field4160 + 1) * 50.0F);
                                                }
                                                if (var18.field4156 == null) {
                                                    if (var18.field4141 != null) {
                                                        if (class31.method291(0, var3, var4)) {
                                                            class86.method766(var18.field4141, class134.field2313, class191.field3192, class30.field434, class205.field3482, var3, var4, true);
                                                        } else {
                                                            class86.method766(var18.field4141, class134.field2313, class191.field3192, class30.field434, class205.field3482, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class31.method291(0, var3, var4)) {
                                                    class108.method947(var18.field4156, 0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var3, var4, true);
                                                } else {
                                                    class108.method947(var18.field4156, 0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var3, var4, false);
                                                }
                                                class297 var19 = var18.field4146;
                                                if (var19 != null) {
                                                    if (class43.field680) {
                                                        if ((var19.field4734 & var2.field4163) == 0) {
                                                            class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                                                        } else {
                                                            class245.method1709(var19.field4734, class233.field3870, class205.field3502, class75.field1226, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field4741.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var19.field4735 - class233.field3870, var19.field4742 - class205.field3502, var19.field4743 - class75.field1226, var19.field4732, var5, (class65) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field4150; var20++) {
                                                    class241 var21 = var18.field4147[var20];
                                                    if (var21 != null) {
                                                        if (class43.field680) {
                                                            class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                                                        }
                                                        var21.field3940.method74(var21.field3937, class134.field2313, class191.field3192, class30.field434, class205.field3482, var21.field3931 - class233.field3870, var21.field3934 - class205.field3502, var21.field3925 - class75.field1226, var21.field3936, var5, (class65) null);
                                                    }
                                                }
                                                if (class43.field680) {
                                                    class43.method359(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field4156 == null) {
                                                if (var2.field4141 != null) {
                                                    if (class31.method291(var6, var3, var4)) {
                                                        class86.method766(var2.field4141, class134.field2313, class191.field3192, class30.field434, class205.field3482, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class86.method766(var2.field4141, class134.field2313, class191.field3192, class30.field434, class205.field3482, var3, var4, false);
                                                    }
                                                }
                                            } else if (class31.method291(var6, var3, var4)) {
                                                class108.method947(var2.field4156, var6, class134.field2313, class191.field3192, class30.field434, class205.field3482, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field4156.field1488 != 12345678 || class50.field785 && var5 <= class116.field2010) {
                                                    class108.method947(var2.field4156, var6, class134.field2313, class191.field3192, class30.field434, class205.field3482, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class330 var23 = var2.field4140;
                                                if (var23 != null && (var23.field5260 & 0x80000000L) != 0L) {
                                                    if (class43.field680 && var23.field5258) {
                                                        class43.method359(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class43.field680) {
                                                        class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                                                    }
                                                    var23.field5257.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var23.field5259 - class233.field3870, var23.field5254 - class205.field3502, var23.field5262 - class75.field1226, var23.field5260, var5, (class65) null);
                                                    if (class43.field680 && var23.field5258) {
                                                        class43.method359(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class297 var26 = var2.field4146;
                                            class44 var27 = var2.field4152;
                                            if (var26 != null || var27 != null) {
                                                if (class51.field788 == var3) {
                                                    var24++;
                                                } else if (class51.field788 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class238.field3905 == var4) {
                                                    var24 += 3;
                                                } else if (class238.field3905 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class116.field2023[var24];
                                                var2.field4163 = class129.field2231[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field4734 & class64.field999[var24]) == 0) {
                                                    var2.field4157 = 0;
                                                } else if (var26.field4734 == 16) {
                                                    var2.field4157 = 3;
                                                    var2.field4148 = class198.field3395[var24];
                                                    var2.field4144 = 3 - var2.field4148;
                                                } else if (var26.field4734 == 32) {
                                                    var2.field4157 = 6;
                                                    var2.field4148 = class215.field3605[var24];
                                                    var2.field4144 = 6 - var2.field4148;
                                                } else if (var26.field4734 == 64) {
                                                    var2.field4157 = 12;
                                                    var2.field4148 = class139.field2561[var24];
                                                    var2.field4144 = 12 - var2.field4148;
                                                } else {
                                                    var2.field4157 = 9;
                                                    var2.field4148 = class341.field5434[var24];
                                                    var2.field4144 = 9 - var2.field4148;
                                                }
                                                if ((var26.field4734 & var25) != 0 && !class348.method2437(var6, var3, var4, var26.field4734)) {
                                                    if (class43.field680) {
                                                        class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                                                    }
                                                    var26.field4741.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var26.field4735 - class233.field3870, var26.field4742 - class205.field3502, var26.field4743 - class75.field1226, var26.field4732, var5, (class65) null);
                                                }
                                                if ((var26.field4739 & var25) != 0 && !class348.method2437(var6, var3, var4, var26.field4739)) {
                                                    if (class43.field680) {
                                                        class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                                                    }
                                                    var26.field4744.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var26.field4735 - class233.field3870, var26.field4742 - class205.field3502, var26.field4743 - class75.field1226, var26.field4732, var5, (class65) null);
                                                }
                                            }
                                            if (var27 != null && !class331.method2294(var6, var3, var4, var27.field700.method95())) {
                                                if (class43.field680) {
                                                    class43.method359(var8 - 0.5F);
                                                }
                                                if ((var27.field689 & var25) != 0) {
                                                    if (class43.field680) {
                                                        class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                                                    }
                                                    var27.field700.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var27.field692 + var27.field687 - class233.field3870, var27.field695 - class205.field3502, var27.field702 + var27.field699 - class75.field1226, var27.field701, var5, (class65) null);
                                                } else if (var27.field689 == 256) {
                                                    int var28 = var27.field692 - class233.field3870;
                                                    int var29 = var27.field695 - class205.field3502;
                                                    int var30 = var27.field702 - class75.field1226;
                                                    int var31 = var27.field697;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class43.field680) {
                                                            class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                                                        }
                                                        var27.field700.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var27.field687 + var28, var29, var27.field699 + var30, var27.field701, var5, (class65) null);
                                                    } else if (var27.field694 != null) {
                                                        if (class43.field680) {
                                                            class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                                                        }
                                                        var27.field694.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var28, var29, var30, var27.field701, var5, (class65) null);
                                                    }
                                                }
                                                if (class43.field680) {
                                                    class43.method359(var8);
                                                }
                                            }
                                            if (var22) {
                                                class330 var34 = var2.field4140;
                                                if (var34 != null && (var34.field5260 & 0x80000000L) == 0L) {
                                                    if (class43.field680 && var34.field5258) {
                                                        class43.method359(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class43.field680) {
                                                        class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                                                    }
                                                    var34.field5257.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var34.field5259 - class233.field3870, var34.field5254 - class205.field3502, var34.field5262 - class75.field1226, var34.field5260, var5, (class65) null);
                                                    if (class43.field680 && var34.field5258) {
                                                        class43.method359(var8);
                                                    }
                                                }
                                                class112 var35 = var2.field4167;
                                                if (var35 != null && var35.field1877 == 0) {
                                                    if (class43.field680) {
                                                        class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                                                    }
                                                    if (var35.field1871 != null) {
                                                        var35.field1871.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var35.field1872 - class233.field3870, var35.field1875 - class205.field3502, var35.field1876 - class75.field1226, var35.field1879, var5, (class65) null);
                                                    }
                                                    if (var35.field1873 != null) {
                                                        var35.field1873.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var35.field1872 - class233.field3870, var35.field1875 - class205.field3502, var35.field1876 - class75.field1226, var35.field1879, var5, (class65) null);
                                                    }
                                                    if (var35.field1880 != null) {
                                                        var35.field1880.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var35.field1872 - class233.field3870, var35.field1875 - class205.field3502, var35.field1876 - class75.field1226, var35.field1879, var5, (class65) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field4151;
                                            if (var36 != 0) {
                                                if (var3 < class51.field788 && (var36 & 0x4) != 0) {
                                                    class257 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field4161) {
                                                        class141.field2589.method2303((byte) -124, var37);
                                                    }
                                                }
                                                if (var4 < class238.field3905 && (var36 & 0x2) != 0) {
                                                    class257 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field4161) {
                                                        class141.field2589.method2303((byte) -124, var38);
                                                    }
                                                }
                                                if (var3 > class51.field788 && (var36 & 0x1) != 0) {
                                                    class257 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field4161) {
                                                        class141.field2589.method2303((byte) -124, var39);
                                                    }
                                                }
                                                if (var4 > class238.field3905 && (var36 & 0x8) != 0) {
                                                    class257 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field4161) {
                                                        class141.field2589.method2303((byte) -124, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field4157 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field4150; var42++) {
                                                if (class322.field5115 != var2.field4147[var42].field3927 && (var2.field4165[var42] & var2.field4157) == var2.field4148) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class297 var43 = var2.field4146;
                                                if (!class348.method2437(var6, var3, var4, var43.field4734)) {
                                                    if (class43.field680) {
                                                        label1037: {
                                                            if ((var43.field4732 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field4735 - class233.field3870;
                                                                int var45 = var43.field4743 - class75.field1226;
                                                                int var46 = (int) (var43.field4732 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class185.field3144 - 1) {
                                                                        class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3 - 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class123.field2134 - 1 && var4 < class185.field3144 - 1) {
                                                                        class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3 + 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class123.field2134 - 1 && var4 > 0) {
                                                                        class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3 + 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3 - 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                }
                                                            }
                                                            class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field4741.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var43.field4735 - class233.field3870, var43.field4742 - class205.field3502, var43.field4743 - class75.field1226, var43.field4732, var5, (class65) null);
                                                }
                                                var2.field4157 = 0;
                                            }
                                        }
                                        if (!var2.field4154) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field4150;
                                            var2.field4154 = false;
                                            int var48 = 0;
                                            label844: for (int var49 = 0; var49 < var47; var49++) {
                                                class241 var50 = var2.field4147[var49];
                                                if (class322.field5115 != var50.field3927) {
                                                    for (int var51 = var50.field3932; var51 <= var50.field3930; var51++) {
                                                        for (int var52 = var50.field3929; var52 <= var50.field3928; var52++) {
                                                            class257 var53 = var7[var51][var52];
                                                            if (var53.field4143) {
                                                                var2.field4154 = true;
                                                                continue label844;
                                                            }
                                                            if (var53.field4157 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field3932) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field3930) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field3929) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field3928) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field4157) == var2.field4144) {
                                                                    var2.field4154 = true;
                                                                    continue label844;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class221.field3695[var48++] = var50;
                                                    int var55 = class51.field788 - var50.field3932;
                                                    int var56 = var50.field3930 - class51.field788;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class238.field3905 - var50.field3929;
                                                    int var58 = var50.field3928 - class238.field3905;
                                                    if (var58 > var57) {
                                                        var50.field3942 = var55 + var58;
                                                    } else {
                                                        var50.field3942 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class241 var62 = class221.field3695[var61];
                                                    if (class322.field5115 != var62.field3927) {
                                                        if (var62.field3942 > var59) {
                                                            var59 = var62.field3942;
                                                            var60 = var61;
                                                        } else if (var62.field3942 == var59) {
                                                            int var63 = var62.field3931 - class233.field3870;
                                                            int var64 = var62.field3925 - class75.field1226;
                                                            int var65 = class221.field3695[var60].field3931 - class233.field3870;
                                                            int var66 = class221.field3695[var60].field3925 - class75.field1226;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class241 var67 = class221.field3695[var60];
                                                var67.field3927 = class322.field5115;
                                                if (!class297.method2024(var6, var67.field3932, var67.field3930, var67.field3929, var67.field3928, var67.field3940.method95())) {
                                                    if (class43.field680) {
                                                        if ((var67.field3936 & 0xFC000L) == 147456L) {
                                                            class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                                                            int var68 = var67.field3931 - class233.field3870;
                                                            int var69 = var67.field3925 - class75.field1226;
                                                            int var70 = (int) (var67.field3936 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class245.method1712(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class245.method1712(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class245.method1712(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class245.method1712(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class245.method1719(class233.field3870, class205.field3502, class75.field1226, var5, var67.field3932, var67.field3929, var67.field3930, var67.field3928);
                                                        }
                                                    }
                                                    var67.field3940.method74(var67.field3937, class134.field2313, class191.field3192, class30.field434, class205.field3482, var67.field3931 - class233.field3870, var67.field3934 - class205.field3502, var67.field3925 - class75.field1226, var67.field3936, var5, (class65) null);
                                                }
                                                for (int var71 = var67.field3932; var71 <= var67.field3930; var71++) {
                                                    for (int var72 = var67.field3929; var72 <= var67.field3928; var72++) {
                                                        class257 var73 = var7[var71][var72];
                                                        if (var73.field4157 != 0) {
                                                            class141.field2589.method2303((byte) -124, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field4161) {
                                                            class141.field2589.method2303((byte) -124, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field4154) {
                                                break;
                                            }
                                        } catch (Exception var135) {
                                            var2.field4154 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field4155 != null) {
                                        if (class43.field680) {
                                            GL var75 = class43.field651;
                                            class43.method359(var8);
                                            class65.method611(class233.field3870, class205.field3502, class75.field1226);
                                            int var76 = var2.field4166 * 128 + 64 - class233.field3870;
                                            int var77 = class137.field2487[var5][var2.field4166][var2.field4142] - class205.field3502;
                                            int var78 = var2.field4142 * 128 + 64 - class75.field1226;
                                            int var79;
                                            if (var5 < 3) {
                                                var79 = class137.field2487[var5][var2.field4166][var2.field4142] - class137.field2487[var5 + 1][var2.field4166][var2.field4142];
                                            } else {
                                                var79 = 1024;
                                            }
                                            int var80 = class205.field3482 * var78 - class30.field434 * var76 >> 16;
                                            int var81 = class191.field3192 * var80 + class134.field2313 * var77 >> 16;
                                            int var82 = (class191.field3192 * 91 + class134.field2313 * 0 >> 16) + var81;
                                            int var83 = (class191.field3192 * -91 - class134.field2313 * var79 >> 16) + var81;
                                            if (var83 < var82 - 1597) {
                                                var83 = var82 - 1597;
                                            }
                                            int var84 = var82 + 2 - var83;
                                            class315 var85 = null;
                                            class197 var86 = null;
                                            int var87 = -1;
                                            class315 var88 = (class315) var2.field4155.method604(-28);
                                            while (true) {
                                                label1054: {
                                                    if (var88 != null) {
                                                        if (var88.field4982 == null || var88.field4982.field3381.field1024) {
                                                            var88.method1849((byte) -64);
                                                            break label1054;
                                                        }
                                                        if ((byte) ((int) (var88.field4982.field3381.field1026 & 0xFFL)) != var2.field4162) {
                                                            var2.field4155 = null;
                                                            break;
                                                        }
                                                        if (var85 == null) {
                                                            var85 = var88;
                                                            var86 = var88.field4982;
                                                            var87 = var86.field3353.field3315;
                                                            break label1054;
                                                        }
                                                    }
                                                    if (var85 != null && (var88 == null || var88.field4982 != var86 || var88.field4982.field3353.field3315 != var87)) {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            class65.field1058[var89] = 0;
                                                        }
                                                        for (int var90 = 0; var90 < 32; var90++) {
                                                            class65.field1050[var90] = 0;
                                                        }
                                                        class65.field1048 = 0;
                                                        for (class315 var91 = var85; var91 != var88; var91 = (class315) var91.field3817) {
                                                            if (var91.field4982 != null) {
                                                                int var92 = (var91.field4985 >> 12) - class233.field3870;
                                                                int var93 = (var91.field4987 >> 12) - class205.field3502;
                                                                int var94 = (var91.field4995 >> 12) - class75.field1226;
                                                                int var95 = class205.field3482 * var94 - class30.field434 * var92 >> 16;
                                                                int var96 = (class191.field3192 * var95 + class134.field2313 * var93 >> 16) - var83;
                                                                if (class65.field1058[var96] < 32) {
                                                                    class65.field1056[var96][class65.field1058[var96]++] = var91.field4989;
                                                                } else {
                                                                    if (class65.field1058[var96] == 32) {
                                                                        if (class65.field1048 == 32) {
                                                                            if (class65.field1029) {
                                                                                System.out.println("Overflowed world-based radix sort");
                                                                            }
                                                                            break;
                                                                        }
                                                                        class65.field1058[var96] += class65.field1048++ + 1;
                                                                    }
                                                                    int var97 = class65.field1050[class65.field1058[var96] - 32 - 1];
                                                                    if (var97 < 768) {
                                                                        short[] var10000 = class65.field1052[class65.field1058[var96] - 32 - 1];
                                                                        int var10002 = class65.field1058[var96] - 32 - 1;
                                                                        int var10004 = class65.field1050[class65.field1058[var96] - 32 - 1];
                                                                        class65.field1050[var10002] = class65.field1050[class65.field1058[var96] - 32 - 1] + 1;
                                                                        var10000[var10004] = var91.field4989;
                                                                    }
                                                                }
                                                            }
                                                            if (var2.field4155.field998 == var91.field3817) {
                                                                break;
                                                            }
                                                        }
                                                        boolean var98 = false;
                                                        if (class65.field1027 && var86.field3353.field3273 != -1) {
                                                            class62.field953.method1210(var86.field3353.field3273, 4880);
                                                            var98 = true;
                                                        } else {
                                                            class43.method390(-1);
                                                        }
                                                        float var99 = (float) var87 * class65.field1059;
                                                        if (var99 > 64.0F) {
                                                            var99 = 64.0F;
                                                        }
                                                        var75.glPointSize(var99);
                                                        var86.field3381.method614(var75, var84, var98, var86.field3353.field3298);
                                                        if (var88 != null) {
                                                            var85 = var88;
                                                            var86 = var88.field4982;
                                                            var87 = var88.field4982.field3353.field3315;
                                                        }
                                                    }
                                                    if (var88 == null) {
                                                        break;
                                                    }
                                                }
                                                var88 = (class315) var2.field4155.method606(8364);
                                            }
                                            class65.method618();
                                        } else {
                                            int var100 = class65.field1019 + class62.field951;
                                            int var101 = class65.field1020 + class62.field960;
                                            class227 var102 = var2.field4155.field998;
                                            for (class227 var103 = var102.field3817; var103 != var102; var103 = var103.field3817) {
                                                class315 var104 = (class315) var103;
                                                if (var104.field4982 != null && !var104.field4982.field3381.field1024) {
                                                    if ((byte) ((int) (var104.field4982.field3381.field1026 & 0xFFL)) != var2.field4162) {
                                                        var2.field4155 = null;
                                                        break;
                                                    }
                                                    int var105 = (var104.field4985 >> 12) - class233.field3870;
                                                    int var106 = (var104.field4987 >> 12) - class205.field3502;
                                                    int var107 = (var104.field4995 >> 12) - class75.field1226;
                                                    int var108 = class30.field434 * var107 + class205.field3482 * var105 >> 16;
                                                    int var109 = class205.field3482 * var107 - class30.field434 * var105 >> 16;
                                                    int var111 = class191.field3192 * var106 - class134.field2313 * var109 >> 16;
                                                    int var112 = class191.field3192 * var109 + class134.field2313 * var106 >> 16;
                                                    if (var112 >= 50) {
                                                        int var114 = (var108 << 9) / var112 + var100;
                                                        int var115 = (var111 << 9) / var112 + var101;
                                                        int var116 = var112 * 400;
                                                        if (var116 == 0) {
                                                            var116 = 1;
                                                        }
                                                        class47.method418(var114, var115, (var104.field4982.field3353.field3315 << 16) / var116, var104.field4990, var104.field4990 >> 24 & 0xFF);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field4161);
                            } while (var2.field4157 != 0);
                            if (var3 > class51.field788 || var3 <= class215.field3617) {
                                break;
                            }
                            var117 = var7[var3 - 1][var4];
                        } while (var117 != null && var117.field4161);
                        if (var3 < class51.field788 || var3 >= class202.field3444 - 1) {
                            break;
                        }
                        var118 = var7[var3 + 1][var4];
                    } while (var118 != null && var118.field4161);
                    if (var4 > class238.field3905 || var4 <= class332.field5292) {
                        break;
                    }
                    var119 = var7[var3][var4 - 1];
                } while (var119 != null && var119.field4161);
                if (var4 < class238.field3905 || var4 >= class304.field4813 - 1) {
                    break;
                }
                var120 = var7[var3][var4 + 1];
            } while (var120 != null && var120.field4161);
            var2.field4161 = false;
            class348.field5539--;
            class112 var121 = var2.field4167;
            if (var121 != null && var121.field1877 != 0) {
                if (class43.field680) {
                    class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                }
                if (var121.field1871 != null) {
                    var121.field1871.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var121.field1872 - class233.field3870, var121.field1875 - class205.field3502 - var121.field1877, var121.field1876 - class75.field1226, var121.field1879, var5, (class65) null);
                }
                if (var121.field1873 != null) {
                    var121.field1873.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var121.field1872 - class233.field3870, var121.field1875 - class205.field3502 - var121.field1877, var121.field1876 - class75.field1226, var121.field1879, var5, (class65) null);
                }
                if (var121.field1880 != null) {
                    var121.field1880.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var121.field1872 - class233.field3870, var121.field1875 - class205.field3502 - var121.field1877, var121.field1876 - class75.field1226, var121.field1879, var5, (class65) null);
                }
            }
            if (var2.field4163 != 0) {
                class44 var122 = var2.field4152;
                if (var122 != null && !class331.method2294(var6, var3, var4, var122.field700.method95())) {
                    if ((var122.field689 & var2.field4163) != 0) {
                        if (class43.field680) {
                            class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                        }
                        var122.field700.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var122.field692 + var122.field687 - class233.field3870, var122.field695 - class205.field3502, var122.field702 + var122.field699 - class75.field1226, var122.field701, var5, (class65) null);
                    } else if (var122.field689 == 256) {
                        int var123 = var122.field692 - class233.field3870;
                        int var124 = var122.field695 - class205.field3502;
                        int var125 = var122.field702 - class75.field1226;
                        int var126 = var122.field697;
                        int var127;
                        if (var126 == 1 || var126 == 2) {
                            var127 = -var123;
                        } else {
                            var127 = var123;
                        }
                        int var128;
                        if (var126 == 2 || var126 == 3) {
                            var128 = -var125;
                        } else {
                            var128 = var125;
                        }
                        if (var128 >= var127) {
                            if (class43.field680) {
                                class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                            }
                            var122.field700.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var122.field687 + var123, var124, var122.field699 + var125, var122.field701, var5, (class65) null);
                        } else if (var122.field694 != null) {
                            if (class43.field680) {
                                class245.method1721(class233.field3870, class205.field3502, class75.field1226, var5, var3, var4);
                            }
                            var122.field694.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var123, var124, var125, var122.field701, var5, (class65) null);
                        }
                    }
                }
                class297 var129 = var2.field4146;
                if (var129 != null) {
                    if ((var129.field4739 & var2.field4163) != 0 && !class348.method2437(var6, var3, var4, var129.field4739)) {
                        if (class43.field680) {
                            class245.method1709(var129.field4739, class233.field3870, class205.field3502, class75.field1226, var6, var3, var4);
                        }
                        var129.field4744.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var129.field4735 - class233.field3870, var129.field4742 - class205.field3502, var129.field4743 - class75.field1226, var129.field4732, var5, (class65) null);
                    }
                    if ((var129.field4734 & var2.field4163) != 0 && !class348.method2437(var6, var3, var4, var129.field4734)) {
                        if (class43.field680) {
                            class245.method1709(var129.field4734, class233.field3870, class205.field3502, class75.field1226, var6, var3, var4);
                        }
                        var129.field4741.method74(0, class134.field2313, class191.field3192, class30.field434, class205.field3482, var129.field4735 - class233.field3870, var129.field4742 - class205.field3502, var129.field4743 - class75.field1226, var129.field4732, var5, (class65) null);
                    }
                }
            }
            if (var5 < class42.field622 - 1) {
                class257 var130 = class279.field4430[var5 + 1][var3][var4];
                if (var130 != null && var130.field4161) {
                    class141.field2589.method2303((byte) -124, var130);
                }
            }
            if (var3 < class51.field788) {
                class257 var131 = var7[var3 + 1][var4];
                if (var131 != null && var131.field4161) {
                    class141.field2589.method2303((byte) -124, var131);
                }
            }
            if (var4 < class238.field3905) {
                class257 var132 = var7[var3][var4 + 1];
                if (var132 != null && var132.field4161) {
                    class141.field2589.method2303((byte) -124, var132);
                }
            }
            if (var3 > class51.field788) {
                class257 var133 = var7[var3 - 1][var4];
                if (var133 != null && var133.field4161) {
                    class141.field2589.method2303((byte) -124, var133);
                }
            }
            if (var4 > class238.field3905) {
                class257 var134 = var7[var3][var4 - 1];
                if (var134 != null && var134.field4161) {
                    class141.field2589.method2303((byte) -124, var134);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(CI)Z", line = 1308)
    public static final boolean method2459(char arg0, int arg1) {
        field5581++;
        if (!(arg0 <= arg1 || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class56.field865;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 1352)
    public static final Class method2460(String arg0, int arg1) throws ClassNotFoundException {
        field5584++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg1 != 0) {
            return (Class) null;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }
}
