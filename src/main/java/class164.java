import java.awt.Component;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class164 extends class66 {

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "Len;")
    public static class49 field2755 = new class49();

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public int field2747;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "Lma;")
    public class318 field2748;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "Ljava/lang/Thread;")
    public static Thread field2750;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "[B")
    public byte[] field2752;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)I", line = 5)
    public final int method447(int arg0) {
        field2751++;
        if (this.field1243) {
            return 0;
        } else if (arg0 == -20913) {
            return 100;
        } else {
            return -103;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIILkk;IIZZB)Lbn;", line = 28)
    public static final class75 method1178(boolean arg0, int arg1, int arg2, class260 arg3, int arg4, int arg5, boolean arg6, boolean arg7, byte arg8) {
        field2753++;
        class11 var9 = class296.method2124(0, arg5);
        if (arg2 > 1 && var9.field325 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg2 >= var9.field358[var11] && var9.field358[var11] != 0) {
                    var10 = var9.field325[var11];
                }
            }
            if (var10 != -1) {
                var9 = class296.method2124(0, var10);
            }
        }
        if (arg8 != 45) {
            return (class75) null;
        }
        class95 var12 = var9.method110(arg3, -50);
        if (var12 == null) {
            return null;
        }
        class288 var13 = null;
        if (var9.field300 != -1) {
            var13 = (class288) method1178(false, 1, 10, arg3, 0, var9.field296, true, true, (byte) 45);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field303 != -1) {
            var13 = (class288) method1178(false, arg1, arg2, arg3, arg4, var9.field314, false, true, (byte) 45);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class270.field4403;
        int var15 = class270.field4404;
        int[] var16 = new int[4];
        int var17 = class270.field4406;
        class270.method1899(var16);
        class288 var18 = new class288(36, 32);
        class270.method1907(var18.field4697, 36, 32);
        class305.method2226();
        class305.method2217(16, 16);
        int var19 = var9.field360;
        if (arg6) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg1 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class305.field4972 = false;
        int var20 = class305.field4957[var9.field332] * var19 >> 16;
        int var21 = class305.field4959[var9.field332] * var19 >> 16;
        var12.method326(0, var9.field306, var9.field341, var9.field332, var9.field329, var21 + var9.field345 - (var12.method340() / 2), var9.field345 + var20, -1L);
        if (arg1 >= 1) {
            var18.method2054(1);
            if (arg1 >= 2) {
                var18.method2054(16777215);
            }
            class270.method1907(var18.field4697, 36, 32);
        }
        if (arg4 != 0) {
            var18.method2048(arg4);
        }
        if (var9.field300 != -1) {
            var13.method568(0, 0);
        } else if (var9.field303 != -1) {
            class270.method1907(var13.field4697, 36, 32);
            var18.method568(0, 0);
            var18 = var13;
        }
        if (arg0 && (var9.field338 == 1 || arg2 != 1) && arg2 != -1) {
            class51.field1041.method619(class160.method1152(arg2, 1000000), 0, 9, 16776960, 1);
        }
        class270.method1907(var14, var17, var15);
        class270.method1887(var16);
        class305.method2226();
        class305.field4972 = true;
        return class241.field4016 && !arg7 ? new class265(var18) : var18;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lee;Z)V", line = 155)
    public static final void method1179(class312 arg0, boolean arg1) {
        class351.field5596.method437(arg0, (byte) 51);
        while (true) {
            class312 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class312[][] var7;
            class312 var120;
            do {
                class312 var119;
                do {
                    class312 var118;
                    do {
                        class312 var117;
                        do {
                            do {
                                do {
                                    float var8;
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class312) class351.field5596.method432(true);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field5093);
                                            var3 = var2.field5098;
                                            var4 = var2.field5077;
                                            var5 = var2.field5091;
                                            var6 = var2.field5086;
                                            var7 = class353.field5644[var5];
                                            var8 = 0.0F;
                                            if (class241.field4016) {
                                                if (class55.field1085 == class144.field2427) {
                                                    int var9 = class318.field5180[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class222.field3678 != var10) {
                                                        class222.field3678 = var10;
                                                        class27.method219(var10, -125);
                                                        class259.method1818(class198.method1356((byte) 100));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class362.field5728 != var11) {
                                                        class362.field5728 = var11;
                                                        class338.method2390((byte) -10, var11);
                                                    }
                                                    int var12 = class123.field2166[0][var3 + 1][var4] + class123.field2166[0][var3][var4] + class123.field2166[0][var3][var4 + 1] + class123.field2166[0][var3 + 1][var4 + 1] >> 2;
                                                    class109.method815(-118, -var12, 3);
                                                    var8 = 201.5F;
                                                    class241.method1699(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class241.method1699(var8);
                                                }
                                            }
                                            if (!var2.field5081) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class312 var13 = class353.field5644[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field5093) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class107.field1943 && var3 > class266.field4341) {
                                                    class312 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field5093 && (var14.field5081 || (var2.field5097 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class107.field1943 && var3 < class129.field2247 - 1) {
                                                    class312 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field5093 && (var15.field5081 || (var2.field5097 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class274.field4465 && var4 > class26.field673) {
                                                    class312 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field5093 && (var16.field5081 || (var2.field5097 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class274.field4465 && var4 < class251.field4121 - 1) {
                                                    class312 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field5093 && (var17.field5081 || (var2.field5097 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field5081 = false;
                                            if (var2.field5079 != null) {
                                                class312 var18 = var2.field5079;
                                                if (class241.field4016) {
                                                    class241.method1699(201.5F - (float) (var18.field5086 + 1) * 50.0F);
                                                }
                                                if (var18.field5087 == null) {
                                                    if (var18.field5094 != null) {
                                                        if (class296.method2130(0, var3, var4)) {
                                                            class86.method657(var18.field5094, class16.field474, class86.field1496, class91.field1614, class340.field5379, var3, var4, true);
                                                        } else {
                                                            class86.method657(var18.field5094, class16.field474, class86.field1496, class91.field1614, class340.field5379, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class296.method2130(0, var3, var4)) {
                                                    class272.method1918(var18.field5087, 0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var3, var4, true);
                                                } else {
                                                    class272.method1918(var18.field5087, 0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var3, var4, false);
                                                }
                                                class16 var19 = var18.field5102;
                                                if (var19 != null) {
                                                    if (class241.field4016) {
                                                        if ((var19.field470 & var2.field5084) == 0) {
                                                            class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                                                        } else {
                                                            class2.method21(var19.field470, class1.field3, class267.field4370, class105.field1915, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field473.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var19.field464 - class1.field3, var19.field472 - class267.field4370, var19.field468 - class105.field1915, var19.field469, var5, (class214) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field5078; var20++) {
                                                    class278 var21 = var18.field5089[var20];
                                                    if (var21 != null) {
                                                        if (class241.field4016) {
                                                            class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                                                        }
                                                        var21.field4529.method327(var21.field4531, class16.field474, class86.field1496, class91.field1614, class340.field5379, var21.field4536 - class1.field3, var21.field4521 - class267.field4370, var21.field4522 - class105.field1915, var21.field4527, var5, (class214) null);
                                                    }
                                                }
                                                if (class241.field4016) {
                                                    class241.method1699(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field5087 == null) {
                                                if (var2.field5094 != null) {
                                                    if (class296.method2130(var6, var3, var4)) {
                                                        class86.method657(var2.field5094, class16.field474, class86.field1496, class91.field1614, class340.field5379, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class86.method657(var2.field5094, class16.field474, class86.field1496, class91.field1614, class340.field5379, var3, var4, false);
                                                    }
                                                }
                                            } else if (class296.method2130(var6, var3, var4)) {
                                                class272.method1918(var2.field5087, var6, class16.field474, class86.field1496, class91.field1614, class340.field5379, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field5087.field3486 != 12345678 || class31.field712 && var5 <= class267.field4360) {
                                                    class272.method1918(var2.field5087, var6, class16.field474, class86.field1496, class91.field1614, class340.field5379, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class94 var23 = var2.field5092;
                                                if (var23 != null && (var23.field1652 & 0x80000000L) != 0L) {
                                                    if (class241.field4016 && var23.field1648) {
                                                        class241.method1699(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class241.field4016) {
                                                        class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                                                    }
                                                    var23.field1653.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var23.field1654 - class1.field3, var23.field1655 - class267.field4370, var23.field1649 - class105.field1915, var23.field1652, var5, (class214) null);
                                                    if (class241.field4016 && var23.field1648) {
                                                        class241.method1699(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class16 var26 = var2.field5102;
                                            class332 var27 = var2.field5082;
                                            if (var26 != null || var27 != null) {
                                                if (class107.field1943 == var3) {
                                                    var24++;
                                                } else if (class107.field1943 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class274.field4465 == var4) {
                                                    var24 += 3;
                                                } else if (class274.field4465 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class253.field4156[var24];
                                                var2.field5084 = class351.field5599[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field470 & class342.field5422[var24]) == 0) {
                                                    var2.field5100 = 0;
                                                } else if (var26.field470 == 16) {
                                                    var2.field5100 = 3;
                                                    var2.field5085 = class306.field4982[var24];
                                                    var2.field5095 = 3 - var2.field5085;
                                                } else if (var26.field470 == 32) {
                                                    var2.field5100 = 6;
                                                    var2.field5085 = class36.field785[var24];
                                                    var2.field5095 = 6 - var2.field5085;
                                                } else if (var26.field470 == 64) {
                                                    var2.field5100 = 12;
                                                    var2.field5085 = class104.field1905[var24];
                                                    var2.field5095 = 12 - var2.field5085;
                                                } else {
                                                    var2.field5100 = 9;
                                                    var2.field5085 = class358.field5695[var24];
                                                    var2.field5095 = 9 - var2.field5085;
                                                }
                                                if ((var26.field470 & var25) != 0 && !class248.method1749(var6, var3, var4, var26.field470)) {
                                                    if (class241.field4016) {
                                                        class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                                                    }
                                                    var26.field473.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var26.field464 - class1.field3, var26.field472 - class267.field4370, var26.field468 - class105.field1915, var26.field469, var5, (class214) null);
                                                }
                                                if ((var26.field466 & var25) != 0 && !class248.method1749(var6, var3, var4, var26.field466)) {
                                                    if (class241.field4016) {
                                                        class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                                                    }
                                                    var26.field465.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var26.field464 - class1.field3, var26.field472 - class267.field4370, var26.field468 - class105.field1915, var26.field469, var5, (class214) null);
                                                }
                                            }
                                            if (var27 != null && !class99.method750(var6, var3, var4, var27.field5307.method340())) {
                                                if (class241.field4016) {
                                                    class241.method1699(var8 - 0.5F);
                                                }
                                                if ((var27.field5304 & var25) != 0) {
                                                    if (class241.field4016) {
                                                        class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                                                    }
                                                    var27.field5307.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var27.field5310 + var27.field5312 - class1.field3, var27.field5309 - class267.field4370, var27.field5313 + var27.field5306 - class105.field1915, var27.field5299, var5, (class214) null);
                                                } else if (var27.field5304 == 256) {
                                                    int var28 = var27.field5310 - class1.field3;
                                                    int var29 = var27.field5309 - class267.field4370;
                                                    int var30 = var27.field5313 - class105.field1915;
                                                    int var31 = var27.field5311;
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
                                                        if (class241.field4016) {
                                                            class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                                                        }
                                                        var27.field5307.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var27.field5312 + var28, var29, var27.field5306 + var30, var27.field5299, var5, (class214) null);
                                                    } else if (var27.field5305 != null) {
                                                        if (class241.field4016) {
                                                            class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                                                        }
                                                        var27.field5305.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var28, var29, var30, var27.field5299, var5, (class214) null);
                                                    }
                                                }
                                                if (class241.field4016) {
                                                    class241.method1699(var8);
                                                }
                                            }
                                            if (var22) {
                                                class94 var34 = var2.field5092;
                                                if (var34 != null && (var34.field1652 & 0x80000000L) == 0L) {
                                                    if (class241.field4016 && var34.field1648) {
                                                        class241.method1699(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class241.field4016) {
                                                        class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                                                    }
                                                    var34.field1653.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var34.field1654 - class1.field3, var34.field1655 - class267.field4370, var34.field1649 - class105.field1915, var34.field1652, var5, (class214) null);
                                                    if (class241.field4016 && var34.field1648) {
                                                        class241.method1699(var8);
                                                    }
                                                }
                                                class267 var35 = var2.field5080;
                                                if (var35 != null && var35.field4373 == 0) {
                                                    if (class241.field4016) {
                                                        class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                                                    }
                                                    if (var35.field4359 != null) {
                                                        var35.field4359.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var35.field4366 - class1.field3, var35.field4369 - class267.field4370, var35.field4367 - class105.field1915, var35.field4372, var5, (class214) null);
                                                    }
                                                    if (var35.field4361 != null) {
                                                        var35.field4361.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var35.field4366 - class1.field3, var35.field4369 - class267.field4370, var35.field4367 - class105.field1915, var35.field4372, var5, (class214) null);
                                                    }
                                                    if (var35.field4362 != null) {
                                                        var35.field4362.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var35.field4366 - class1.field3, var35.field4369 - class267.field4370, var35.field4367 - class105.field1915, var35.field4372, var5, (class214) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field5097;
                                            if (var36 != 0) {
                                                if (var3 < class107.field1943 && (var36 & 0x4) != 0) {
                                                    class312 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field5093) {
                                                        class351.field5596.method437(var37, (byte) 51);
                                                    }
                                                }
                                                if (var4 < class274.field4465 && (var36 & 0x2) != 0) {
                                                    class312 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field5093) {
                                                        class351.field5596.method437(var38, (byte) 51);
                                                    }
                                                }
                                                if (var3 > class107.field1943 && (var36 & 0x1) != 0) {
                                                    class312 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field5093) {
                                                        class351.field5596.method437(var39, (byte) 51);
                                                    }
                                                }
                                                if (var4 > class274.field4465 && (var36 & 0x8) != 0) {
                                                    class312 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field5093) {
                                                        class351.field5596.method437(var40, (byte) 51);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field5100 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field5078; var42++) {
                                                if (class264.field4332 != var2.field5089[var42].field4538 && (var2.field5101[var42] & var2.field5100) == var2.field5085) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class16 var43 = var2.field5102;
                                                if (!class248.method1749(var6, var3, var4, var43.field470)) {
                                                    if (class241.field4016) {
                                                        label1037: {
                                                            if ((var43.field469 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field464 - class1.field3;
                                                                int var45 = var43.field468 - class105.field1915;
                                                                int var46 = (int) (var43.field469 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class280.field4578 - 1) {
                                                                        class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3 - 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class224.field3701 - 1 && var4 < class280.field4578 - 1) {
                                                                        class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3 + 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class224.field3701 - 1 && var4 > 0) {
                                                                        class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3 + 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3 - 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                }
                                                            }
                                                            class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field473.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var43.field464 - class1.field3, var43.field472 - class267.field4370, var43.field468 - class105.field1915, var43.field469, var5, (class214) null);
                                                }
                                                var2.field5100 = 0;
                                            }
                                        }
                                        if (!var2.field5083) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field5078;
                                            var2.field5083 = false;
                                            int var48 = 0;
                                            label844: for (int var49 = 0; var49 < var47; var49++) {
                                                class278 var50 = var2.field5089[var49];
                                                if (class264.field4332 != var50.field4538) {
                                                    for (int var51 = var50.field4523; var51 <= var50.field4525; var51++) {
                                                        for (int var52 = var50.field4530; var52 <= var50.field4544; var52++) {
                                                            class312 var53 = var7[var51][var52];
                                                            if (var53.field5081) {
                                                                var2.field5083 = true;
                                                                continue label844;
                                                            }
                                                            if (var53.field5100 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4523) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4525) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4530) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4544) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field5100) == var2.field5095) {
                                                                    var2.field5083 = true;
                                                                    continue label844;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class160.field2706[var48++] = var50;
                                                    int var55 = class107.field1943 - var50.field4523;
                                                    int var56 = var50.field4525 - class107.field1943;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class274.field4465 - var50.field4530;
                                                    int var58 = var50.field4544 - class274.field4465;
                                                    if (var58 > var57) {
                                                        var50.field4535 = var55 + var58;
                                                    } else {
                                                        var50.field4535 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class278 var62 = class160.field2706[var61];
                                                    if (class264.field4332 != var62.field4538) {
                                                        if (var62.field4535 > var59) {
                                                            var59 = var62.field4535;
                                                            var60 = var61;
                                                        } else if (var62.field4535 == var59) {
                                                            int var63 = var62.field4536 - class1.field3;
                                                            int var64 = var62.field4522 - class105.field1915;
                                                            int var65 = class160.field2706[var60].field4536 - class1.field3;
                                                            int var66 = class160.field2706[var60].field4522 - class105.field1915;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class278 var67 = class160.field2706[var60];
                                                var67.field4538 = class264.field4332;
                                                if (!class273.method1940(var6, var67.field4523, var67.field4525, var67.field4530, var67.field4544, var67.field4529.method340())) {
                                                    if (class241.field4016) {
                                                        if ((var67.field4527 & 0xFC000L) == 147456L) {
                                                            class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                                                            int var68 = var67.field4536 - class1.field3;
                                                            int var69 = var67.field4522 - class105.field1915;
                                                            int var70 = (int) (var67.field4527 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class2.method14(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class2.method14(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class2.method14(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class2.method14(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class2.method27(class1.field3, class267.field4370, class105.field1915, var5, var67.field4523, var67.field4530, var67.field4525, var67.field4544);
                                                        }
                                                    }
                                                    var67.field4529.method327(var67.field4531, class16.field474, class86.field1496, class91.field1614, class340.field5379, var67.field4536 - class1.field3, var67.field4521 - class267.field4370, var67.field4522 - class105.field1915, var67.field4527, var5, (class214) null);
                                                }
                                                for (int var71 = var67.field4523; var71 <= var67.field4525; var71++) {
                                                    for (int var72 = var67.field4530; var72 <= var67.field4544; var72++) {
                                                        class312 var73 = var7[var71][var72];
                                                        if (var73.field5100 != 0) {
                                                            class351.field5596.method437(var73, (byte) 51);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field5093) {
                                                            class351.field5596.method437(var73, (byte) 51);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field5083) {
                                                break;
                                            }
                                        } catch (Exception var135) {
                                            var2.field5083 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field5096 != null) {
                                        if (class241.field4016) {
                                            GL var75 = class241.field4012;
                                            class241.method1699(var8);
                                            class214.method1494(class1.field3, class267.field4370, class105.field1915);
                                            int var76 = var2.field5098 * 128 + 64 - class1.field3;
                                            int var77 = class144.field2427[var5][var2.field5098][var2.field5077] - class267.field4370;
                                            int var78 = var2.field5077 * 128 + 64 - class105.field1915;
                                            int var79;
                                            if (var5 < 3) {
                                                var79 = class144.field2427[var5][var2.field5098][var2.field5077] - class144.field2427[var5 + 1][var2.field5098][var2.field5077];
                                            } else {
                                                var79 = 1024;
                                            }
                                            int var80 = class340.field5379 * var78 - class91.field1614 * var76 >> 16;
                                            int var81 = class86.field1496 * var80 + class16.field474 * var77 >> 16;
                                            int var82 = (class86.field1496 * 91 + class16.field474 * 0 >> 16) + var81;
                                            int var83 = (class86.field1496 * -91 - class16.field474 * var79 >> 16) + var81;
                                            if (var83 < var82 - 1597) {
                                                var83 = var82 - 1597;
                                            }
                                            int var84 = var82 + 2 - var83;
                                            class118 var85 = null;
                                            class172 var86 = null;
                                            int var87 = -1;
                                            class118 var88 = (class118) var2.field5096.method89(16);
                                            while (true) {
                                                label1054: {
                                                    if (var88 != null) {
                                                        if (var88.field2089 == null || var88.field2089.field2845.field3531) {
                                                            var88.method460(false);
                                                            break label1054;
                                                        }
                                                        if ((byte) ((int) (var88.field2089.field2845.field3537 & 0xFFL)) != var2.field5090) {
                                                            var2.field5096 = null;
                                                            break;
                                                        }
                                                        if (var85 == null) {
                                                            var85 = var88;
                                                            var86 = var88.field2089;
                                                            var87 = var86.field2846.field593;
                                                            break label1054;
                                                        }
                                                    }
                                                    if (var85 != null && (var88 == null || var88.field2089 != var86 || var88.field2089.field2846.field593 != var87)) {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            class214.field3555[var89] = 0;
                                                        }
                                                        for (int var90 = 0; var90 < 32; var90++) {
                                                            class214.field3567[var90] = 0;
                                                        }
                                                        class214.field3565 = 0;
                                                        for (class118 var91 = var85; var91 != var88; var91 = (class118) var91.field2641) {
                                                            if (var91.field2089 != null) {
                                                                int var92 = (var91.field2097 >> 12) - class1.field3;
                                                                int var93 = (var91.field2098 >> 12) - class267.field4370;
                                                                int var94 = (var91.field2093 >> 12) - class105.field1915;
                                                                int var95 = class340.field5379 * var94 - class91.field1614 * var92 >> 16;
                                                                int var96 = (class86.field1496 * var95 + class16.field474 * var93 >> 16) - var83;
                                                                if (class214.field3555[var96] < 32) {
                                                                    class214.field3551[var96][class214.field3555[var96]++] = var91.field2101;
                                                                } else {
                                                                    if (class214.field3555[var96] == 32) {
                                                                        if (class214.field3565 == 32) {
                                                                            if (class214.field3534) {
                                                                                System.out.println("Overflowed world-based radix sort");
                                                                            }
                                                                            break;
                                                                        }
                                                                        class214.field3555[var96] += class214.field3565++ + 1;
                                                                    }
                                                                    int var97 = class214.field3567[class214.field3555[var96] - 32 - 1];
                                                                    if (var97 < 768) {
                                                                        short[] var10000 = class214.field3553[class214.field3555[var96] - 32 - 1];
                                                                        int var10002 = class214.field3555[var96] - 32 - 1;
                                                                        int var10004 = class214.field3567[class214.field3555[var96] - 32 - 1];
                                                                        class214.field3567[var10002] = class214.field3567[class214.field3555[var96] - 32 - 1] + 1;
                                                                        var10000[var10004] = var91.field2101;
                                                                    }
                                                                }
                                                            }
                                                            if (var2.field5096.field277 == var91.field2641) {
                                                                break;
                                                            }
                                                        }
                                                        boolean var98 = false;
                                                        if (class214.field3544 && var86.field2846.field637 != -1) {
                                                            class305.field4968.method77((byte) -124, var86.field2846.field637);
                                                            var98 = true;
                                                        } else {
                                                            class241.method1687(-1);
                                                        }
                                                        float var99 = (float) var87 * class214.field3576;
                                                        if (var99 > 64.0F) {
                                                            var99 = 64.0F;
                                                        }
                                                        var75.glPointSize(var99);
                                                        var86.field2845.method1482(var75, var84, var98, var86.field2846.field597);
                                                        if (var88 != null) {
                                                            var85 = var88;
                                                            var86 = var88.field2089;
                                                            var87 = var88.field2089.field2846.field593;
                                                        }
                                                    }
                                                    if (var88 == null) {
                                                        break;
                                                    }
                                                }
                                                var88 = (class118) var2.field5096.method95((byte) 48);
                                            }
                                            class214.method1493();
                                        } else {
                                            int var100 = class305.field4964 + class214.field3542;
                                            int var101 = class305.field4963 + class214.field3545;
                                            class156 var102 = var2.field5096.field277;
                                            for (class156 var103 = var102.field2641; var103 != var102; var103 = var103.field2641) {
                                                class118 var104 = (class118) var103;
                                                if (var104.field2089 != null && !var104.field2089.field2845.field3531) {
                                                    if ((byte) ((int) (var104.field2089.field2845.field3537 & 0xFFL)) != var2.field5090) {
                                                        var2.field5096 = null;
                                                        break;
                                                    }
                                                    int var105 = (var104.field2097 >> 12) - class1.field3;
                                                    int var106 = (var104.field2098 >> 12) - class267.field4370;
                                                    int var107 = (var104.field2093 >> 12) - class105.field1915;
                                                    int var108 = class91.field1614 * var107 + class340.field5379 * var105 >> 16;
                                                    int var109 = class340.field5379 * var107 - class91.field1614 * var105 >> 16;
                                                    int var111 = class86.field1496 * var106 - class16.field474 * var109 >> 16;
                                                    int var112 = class86.field1496 * var109 + class16.field474 * var106 >> 16;
                                                    if (var112 >= 50) {
                                                        int var114 = (var108 << 9) / var112 + var100;
                                                        int var115 = (var111 << 9) / var112 + var101;
                                                        int var116 = var112 * 400;
                                                        if (var116 == 0) {
                                                            var116 = 1;
                                                        }
                                                        class270.method1908(var114, var115, (var104.field2089.field2846.field593 << 16) / var116, var104.field2099, var104.field2099 >> 24 & 0xFF);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field5093);
                            } while (var2.field5100 != 0);
                            if (var3 > class107.field1943 || var3 <= class266.field4341) {
                                break;
                            }
                            var117 = var7[var3 - 1][var4];
                        } while (var117 != null && var117.field5093);
                        if (var3 < class107.field1943 || var3 >= class129.field2247 - 1) {
                            break;
                        }
                        var118 = var7[var3 + 1][var4];
                    } while (var118 != null && var118.field5093);
                    if (var4 > class274.field4465 || var4 <= class26.field673) {
                        break;
                    }
                    var119 = var7[var3][var4 - 1];
                } while (var119 != null && var119.field5093);
                if (var4 < class274.field4465 || var4 >= class251.field4121 - 1) {
                    break;
                }
                var120 = var7[var3][var4 + 1];
            } while (var120 != null && var120.field5093);
            var2.field5093 = false;
            class57.field1118--;
            class267 var121 = var2.field5080;
            if (var121 != null && var121.field4373 != 0) {
                if (class241.field4016) {
                    class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                }
                if (var121.field4359 != null) {
                    var121.field4359.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var121.field4366 - class1.field3, var121.field4369 - class267.field4370 - var121.field4373, var121.field4367 - class105.field1915, var121.field4372, var5, (class214) null);
                }
                if (var121.field4361 != null) {
                    var121.field4361.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var121.field4366 - class1.field3, var121.field4369 - class267.field4370 - var121.field4373, var121.field4367 - class105.field1915, var121.field4372, var5, (class214) null);
                }
                if (var121.field4362 != null) {
                    var121.field4362.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var121.field4366 - class1.field3, var121.field4369 - class267.field4370 - var121.field4373, var121.field4367 - class105.field1915, var121.field4372, var5, (class214) null);
                }
            }
            if (var2.field5084 != 0) {
                class332 var122 = var2.field5082;
                if (var122 != null && !class99.method750(var6, var3, var4, var122.field5307.method340())) {
                    if ((var122.field5304 & var2.field5084) != 0) {
                        if (class241.field4016) {
                            class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                        }
                        var122.field5307.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var122.field5310 + var122.field5312 - class1.field3, var122.field5309 - class267.field4370, var122.field5313 + var122.field5306 - class105.field1915, var122.field5299, var5, (class214) null);
                    } else if (var122.field5304 == 256) {
                        int var123 = var122.field5310 - class1.field3;
                        int var124 = var122.field5309 - class267.field4370;
                        int var125 = var122.field5313 - class105.field1915;
                        int var126 = var122.field5311;
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
                            if (class241.field4016) {
                                class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                            }
                            var122.field5307.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var122.field5312 + var123, var124, var122.field5306 + var125, var122.field5299, var5, (class214) null);
                        } else if (var122.field5305 != null) {
                            if (class241.field4016) {
                                class2.method20(class1.field3, class267.field4370, class105.field1915, var5, var3, var4);
                            }
                            var122.field5305.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var123, var124, var125, var122.field5299, var5, (class214) null);
                        }
                    }
                }
                class16 var129 = var2.field5102;
                if (var129 != null) {
                    if ((var129.field466 & var2.field5084) != 0 && !class248.method1749(var6, var3, var4, var129.field466)) {
                        if (class241.field4016) {
                            class2.method21(var129.field466, class1.field3, class267.field4370, class105.field1915, var6, var3, var4);
                        }
                        var129.field465.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var129.field464 - class1.field3, var129.field472 - class267.field4370, var129.field468 - class105.field1915, var129.field469, var5, (class214) null);
                    }
                    if ((var129.field470 & var2.field5084) != 0 && !class248.method1749(var6, var3, var4, var129.field470)) {
                        if (class241.field4016) {
                            class2.method21(var129.field470, class1.field3, class267.field4370, class105.field1915, var6, var3, var4);
                        }
                        var129.field473.method327(0, class16.field474, class86.field1496, class91.field1614, class340.field5379, var129.field464 - class1.field3, var129.field472 - class267.field4370, var129.field468 - class105.field1915, var129.field469, var5, (class214) null);
                    }
                }
            }
            if (var5 < class138.field2345 - 1) {
                class312 var130 = class353.field5644[var5 + 1][var3][var4];
                if (var130 != null && var130.field5093) {
                    class351.field5596.method437(var130, (byte) 51);
                }
            }
            if (var3 < class107.field1943) {
                class312 var131 = var7[var3 + 1][var4];
                if (var131 != null && var131.field5093) {
                    class351.field5596.method437(var131, (byte) 51);
                }
            }
            if (var4 < class274.field4465) {
                class312 var132 = var7[var3][var4 + 1];
                if (var132 != null && var132.field5093) {
                    class351.field5596.method437(var132, (byte) 51);
                }
            }
            if (var3 > class107.field1943) {
                class312 var133 = var7[var3 - 1][var4];
                if (var133 != null && var133.field5093) {
                    class351.field5596.method437(var133, (byte) 51);
                }
            }
            if (var4 > class274.field4465) {
                class312 var134 = var7[var3][var4 - 1];
                if (var134 != null && var134.field5093) {
                    class351.field5596.method437(var134, (byte) 51);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)[B", line = 1373)
    public final byte[] method442(int arg0) {
        field2749++;
        if (this.field1243) {
            throw new RuntimeException();
        }
        if (arg0 < 99) {
            this.method447(-36);
        }
        return this.field2752;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)V", line = 1391)
    public static void method1180(byte arg0) {
        field2750 = null;
        if (arg0 != -102) {
            field2755 = (class49) null;
        }
        field2755 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 1403)
    public static final void method1181(int arg0, Component arg1) {
        arg1.removeMouseListener(class317.field5164);
        field2754++;
        arg1.removeMouseMotionListener(class317.field5164);
        arg1.removeFocusListener(class317.field5164);
        if (arg0 != 1) {
            method1180((byte) -40);
        }
        class190.field3228 = 0;
    }
}
