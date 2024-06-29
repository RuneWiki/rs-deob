import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class class229 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "Lis;")
    private class1 field3350;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "Ltq;")
    private class63 field3368;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "Lj;")
    public static class240 field3369 = new class240(0, 15);

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "[I")
    public static int[] field3371 = new int[100];

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "[I")
    public static int[] field3372 = new int[5];

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3374 = null;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method1085(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([IIII[ILjava/lang/String;ILjava/util/Random;IBIIII[Ldp;)I")
    public final int method1486(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, String arg5, int arg6, Random arg7, int arg8, byte arg9, int arg10, int arg11, int arg12, int arg13, class319[] arg14) {
        field3370++;
        if (arg5 == null) {
            return 0;
        }
        arg7.setSeed((long) arg10);
        int var16 = (arg7.nextInt() & 0x1F) + 192;
        this.method1501(var16 << 24 | arg13 & 0xFFFFFF, arg3 & 0xFFFFFF | var16 << 24, (byte) 36);
        int var17 = arg5.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg7.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg8;
        int var22 = this.field3350.field16 + arg11;
        if (arg9 != 123) {
            this.method1490((String) null, -127, -68, -21, 126, 54);
        }
        int var23 = -1;
        if (arg1 == 1) {
            var22 += (arg12 - this.field3350.field6 - this.field3350.field16) / 2;
        } else if (arg1 == 2) {
            var22 = arg11 + arg12 - this.field3350.field6;
        }
        if (arg6 == 1) {
            var23 = var19 + this.field3350.method3(arg5, (byte) 92);
            var21 = (arg2 - var23) / 2 + arg8;
        } else if (arg6 == 2) {
            var23 = this.field3350.method3(arg5, (byte) 92) + var19;
            var21 = arg2 + arg8 - var23;
        }
        this.method1493((int[]) null, arg4, var22, var18, -8458, var21, arg5, arg14);
        if (arg0 != null) {
            if (var23 == -1) {
                var23 = this.field3350.method3(arg5, (byte) 92) + var19;
            }
            arg0[0] = var21;
            arg0[1] = var22 - this.field3350.field16;
            arg0[3] = this.field3350.field16 + this.field3350.field6;
            arg0[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lak;Lke;)V")
    public static final void method1487(class32 arg0, class337 arg1) {
        if (!arg1.field5061) {
            return;
        }
        short var2 = arg1.field5053;
        short var3 = arg1.field5057;
        byte var4 = arg1.field5064;
        byte var5 = arg1.field5051;
        int var6 = (var2 << class426.field6091) + class47.field683;
        int var7 = (var3 << class426.field6091) + class47.field683;
        class337[][] var8 = class170.field2427[var4];
        float var9;
        if (class55.field765 == class479.field6745) {
            class432.field6150.method570(class483.field6781[0].method204(var6, var7), class71.method618(var2, var3), class465.method2733(var2, var3), class19.method186(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class432.field6150.method501(3000.0F, var9 * 1.5F);
        if (arg1.field5060) {
            if (class187.field2835) {
                if (var4 > 0) {
                    class337 var10 = class170.field2427[var4 - 1][var2][var3];
                    if (var10 != null && var10.field5061) {
                        return;
                    }
                }
                if (var2 <= class307.field4577 && var2 > class473.field6635) {
                    class337 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field5061 && (var11.field5060 || (arg1.field5065 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class307.field4577 && var2 < class121.field1671 - 1) {
                    class337 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field5061 && (var12.field5060 || (arg1.field5065 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class386.field5702 && var3 > class314.field4723) {
                    class337 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field5061 && (var13.field5060 || (arg1.field5065 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class386.field5702 && var3 < class385.field5698 - 1) {
                    class337 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field5061 && (var14.field5060 || (arg1.field5065 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class187.field2835 = true;
            }
            arg1.field5060 = false;
            if (arg1.field5062 != null) {
                class337 var15 = arg1.field5062;
                class432.field6150.method501(3000.0F, (201.5F - (float) (var15.field5051 + 1) * 50.0F) * 1.5F);
                if (!class247.method1583(var15.field5051, var2, var3)) {
                    class479.field6745[var15.field5051].method193(var2, var3);
                }
                class100 var16 = var15.field5044;
                if (var16 != null) {
                    if (class252.field3628) {
                        if ((var16.field1425 & arg1.field5052) == 0) {
                            class165.method1128(arg0, var4, var2, var3);
                        } else {
                            class299.method1866(arg0, var16.field1425, var5, var2, var3);
                        }
                        class432.field6150.method542(arg0.field415, arg0.field418);
                    }
                    var16.method252(class432.field6150, 2);
                }
                for (class448 var17 = var15.field5054; var17 != null; var17 = var17.field6340) {
                    class305 var18 = var17.field6343;
                    if (var18 != null) {
                        if (class252.field3628) {
                            class165.method1128(arg0, var4, var2, var3);
                            class432.field6150.method542(arg0.field415, arg0.field418);
                        }
                        var18.method252(class432.field6150, 2);
                    }
                }
                class432.field6150.method501(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class247.method1583(var5, var2, var3);
            if (var19) {
                class479.field6745[var5].method193(var2, var3);
                class47 var20 = arg1.field5063;
                if (var20 != null && var20.field679) {
                    if (var20.field682) {
                        class432.field6150.method501(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class252.field3628) {
                        class165.method1128(arg0, var4, var2, var3);
                        class432.field6150.method542(arg0.field415, arg0.field418);
                    }
                    class123 var21 = var20.method252(class432.field6150, 2);
                    if (var21 != null) {
                        var21.field1696 = var20;
                        var21.field1693 = var4;
                        var21.field1692 = var2;
                        var21.field1697 = var3;
                        class453.field6428.method1597(var21, (byte) -111);
                    }
                    if (var20.field682) {
                        class432.field6150.method501(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class100 var24 = arg1.field5044;
            class287 var25 = arg1.field5058;
            if (var24 != null || var25 != null) {
                if (class307.field4577 == var2) {
                    var22++;
                } else if (class307.field4577 < var2) {
                    var22 += 2;
                }
                if (class386.field5702 == var3) {
                    var22 += 3;
                } else if (class386.field5702 > var3) {
                    var22 += 6;
                }
                var23 = class131.field1833[var22];
                arg1.field5052 = class228.field3334[var22];
            }
            if (var24 != null) {
                if ((var24.field1425 & class2.field50[var22]) == 0) {
                    arg1.field5049 = 0;
                } else if (var24.field1425 == 16) {
                    arg1.field5049 = 3;
                    arg1.field5048 = class302.field4503[var22];
                    arg1.field5056 = (byte) (3 - arg1.field5048);
                } else if (var24.field1425 == 32) {
                    arg1.field5049 = 6;
                    arg1.field5048 = class158.field2196[var22];
                    arg1.field5056 = (byte) (6 - arg1.field5048);
                } else if (var24.field1425 == 64) {
                    arg1.field5049 = 12;
                    arg1.field5048 = class144.field2045[var22];
                    arg1.field5056 = (byte) (12 - arg1.field5048);
                } else {
                    arg1.field5049 = 9;
                    arg1.field5048 = class367.field5541[var22];
                    arg1.field5056 = (byte) (9 - arg1.field5048);
                }
                if ((var24.field1425 & var23) != 0 && !class313.method1939(var5, var2, var3, var24.field1425)) {
                    if (class252.field3628) {
                        class165.method1128(arg0, var4, var2, var3);
                        class432.field6150.method542(arg0.field415, arg0.field418);
                    }
                    class123 var26 = var24.method252(class432.field6150, 2);
                    if (var26 != null) {
                        var26.field1696 = var24;
                        var26.field1693 = var4;
                        var26.field1692 = var2;
                        var26.field1697 = var3;
                        class453.field6428.method1597(var26, (byte) -72);
                    }
                }
                class100 var27 = arg1.field5047;
                if (var27 != null && (var27.field1425 & var23) != 0 && !class313.method1939(var5, var2, var3, var27.field1425)) {
                    if (class252.field3628) {
                        class165.method1128(arg0, var4, var2, var3);
                        class432.field6150.method542(arg0.field415, arg0.field418);
                    }
                    class123 var28 = var27.method252(class432.field6150, 2);
                    if (var28 != null) {
                        var28.field1696 = var27;
                        var28.field1693 = var4;
                        var28.field1692 = var2;
                        var28.field1697 = var3;
                        class453.field6428.method1597(var28, (byte) 78);
                    }
                }
            }
            if (var25 != null && !class227.method1479(var5, var2, var3, var25.method286((byte) 126))) {
                class287 var29 = arg1.field5050;
                class432.field6150.method501(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field4393 & var23) != 0) {
                    if (class252.field3628) {
                        class165.method1128(arg0, var4, var2, var3);
                        class432.field6150.method542(arg0.field415, arg0.field418);
                    }
                    class123 var30 = var25.method252(class432.field6150, 2);
                    if (var30 != null) {
                        var30.field1696 = var25;
                        var30.field1693 = var4;
                        var30.field1692 = var2;
                        var30.field1697 = var3;
                        class453.field6428.method1597(var30, (byte) 64);
                    }
                } else if (var25.field4393 == 256) {
                    int var31 = var25.field4392 - class100.field1420;
                    int var32 = var25.field4387 - class208.field3132;
                    int var33 = var25.field4390;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class252.field3628) {
                        class165.method1128(arg0, var4, var2, var3);
                        class432.field6150.method542(arg0.field415, arg0.field418);
                    }
                    if (var35 < var34) {
                        class123 var36 = var25.method252(class432.field6150, 2);
                        if (var36 != null) {
                            var36.field1696 = var25;
                            var36.field1693 = var4;
                            var36.field1692 = var2;
                            var36.field1697 = var3;
                            class453.field6428.method1597(var36, (byte) -83);
                        }
                    } else if (var29 != null) {
                        class123 var37 = var29.method252(class432.field6150, 2);
                        if (var37 != null) {
                            var37.field1696 = var29;
                            var37.field1693 = var4;
                            var37.field1692 = var2;
                            var37.field1697 = var3;
                            class453.field6428.method1597(var37, (byte) 39);
                        }
                    }
                }
                class432.field6150.method501(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class47 var38 = arg1.field5063;
                if (var38 != null && !var38.field679) {
                    if (var38.field682) {
                        class432.field6150.method501(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class252.field3628) {
                        class165.method1128(arg0, var4, var2, var3);
                        class432.field6150.method542(arg0.field415, arg0.field418);
                    }
                    class123 var39 = var38.method252(class432.field6150, 2);
                    if (var39 != null) {
                        var39.field1696 = var38;
                        var39.field1693 = var4;
                        var39.field1692 = var2;
                        var39.field1697 = var3;
                        class453.field6428.method1597(var39, (byte) 88);
                    }
                    if (var38.field682) {
                        class432.field6150.method501(3000.0F, var9 * 1.5F);
                    }
                }
                class367 var40 = arg1.field5055;
                if (var40 != null && !var40.field5549) {
                    if (class252.field3628) {
                        class165.method1128(arg0, var4, var2, var3);
                        class432.field6150.method542(arg0.field415, arg0.field418);
                    }
                    class123 var41 = var40.method252(class432.field6150, 2);
                    if (var41 != null) {
                        var41.field1696 = var40;
                        var41.field1693 = var4;
                        var41.field1692 = var2;
                        var41.field1697 = var3;
                        class453.field6428.method1597(var41, (byte) -85);
                    }
                }
            }
            byte var42 = arg1.field5065;
            if (var42 != 0) {
                if (var2 < class307.field4577 && (var42 & 0x4) != 0) {
                    class337 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field5061) {
                        class44.field632.method100(var43, -23157);
                    }
                }
                if (var3 < class386.field5702 && (var42 & 0x2) != 0) {
                    class337 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field5061) {
                        class44.field632.method100(var44, -23157);
                    }
                }
                if (var2 > class307.field4577 && (var42 & 0x1) != 0) {
                    class337 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field5061) {
                        class44.field632.method100(var45, -23157);
                    }
                }
                if (var3 > class386.field5702 && (var42 & 0x8) != 0) {
                    class337 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field5061) {
                        class44.field632.method100(var46, -23157);
                    }
                }
            }
        }
        if (arg1.field5049 != 0) {
            boolean var47 = true;
            for (class448 var48 = arg1.field5054; var48 != null; var48 = var48.field6340) {
                if (class382.field5657 != var48.field6343.field4548 && (var48.field6345 & arg1.field5049) == arg1.field5048) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class100 var49 = arg1.field5044;
                if (!class313.method1939(var5, var2, var3, var49.field1425)) {
                    if (class252.field3628) {
                        label687: {
                            if (var49.field1425 >= 16) {
                                int var50 = var2 - class307.field4577;
                                int var51 = var3 - class386.field5702;
                                if (var49.field1425 == 16) {
                                    int var52 = var50 - class47.field683;
                                    int var53 = class47.field683 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class315.field4743) {
                                        class165.method1128(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var49.field1425 == 32) {
                                    int var54 = class47.field683 + var50;
                                    int var55 = class47.field683 + var51;
                                    if (var55 < -var54 && var2 < class412.field5957 && var3 < class315.field4743) {
                                        class165.method1128(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var49.field1425 == 64) {
                                    int var56 = class47.field683 + var50;
                                    int var57 = var51 - class47.field683;
                                    if (var57 > var56 && var2 < class412.field5957 && var3 > 0) {
                                        class165.method1128(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var49.field1425 == 128) {
                                    int var58 = var50 - class47.field683;
                                    int var59 = var51 - class47.field683;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class165.method1128(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class165.method1128(arg0, var4, var2, var3);
                        }
                        class432.field6150.method542(arg0.field415, arg0.field418);
                    }
                    class123 var60 = var49.method252(class432.field6150, 2);
                    if (var60 != null) {
                        var60.field1696 = var49;
                        var60.field1693 = var4;
                        var60.field1692 = var2;
                        var60.field1697 = var3;
                        class453.field6428.method1597(var60, (byte) -117);
                    }
                }
                arg1.field5049 = 0;
            }
        }
        if (arg1.field5045) {
            try {
                arg1.field5045 = false;
                int var61 = 0;
                label630: for (class448 var62 = arg1.field5054; var62 != null; var62 = var62.field6340) {
                    class305 var63 = var62.field6343;
                    if (class382.field5657 != var63.field4548) {
                        for (int var64 = var63.field4542; var64 <= var63.field4541; var64++) {
                            for (int var65 = var63.field4547; var65 <= var63.field4552; var65++) {
                                class337 var66 = var8[var64][var65];
                                if (var66.field5060) {
                                    arg1.field5045 = true;
                                    continue label630;
                                }
                                if (var66.field5049 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field4542) {
                                        var67++;
                                    }
                                    if (var64 < var63.field4541) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field4547) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field4552) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field5049) == arg1.field5056) {
                                        arg1.field5045 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var68 = class307.field4577 - var63.field4542;
                        int var69 = var63.field4541 - class307.field4577;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class386.field5702 - var63.field4547;
                        int var71 = var63.field4552 - class386.field5702;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field414[var61] = var63;
                        arg0.field420[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class305 var75 = arg0.field414[var74];
                        if (class382.field5657 != var75.field4548) {
                            int var76 = arg0.field420[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field4543 - class100.field1420;
                                int var78 = var75.field4538 - class208.field3132;
                                int var79 = arg0.field414[var73].field4543 - class100.field1420;
                                int var80 = arg0.field414[var73].field4538 - class208.field3132;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class305 var81 = arg0.field414[var73];
                    var81.field4548 = class382.field5657;
                    if (!class144.method986(var5, var81.field4542, var81.field4541, var81.field4547, var81.field4552, var81.method899(0))) {
                        if (class252.field3628) {
                            if (var81.field4537 == 0) {
                                class176.method1209(arg0, var4, var81.field4542, var81.field4547, var81.field4541, var81.field4552);
                            } else {
                                class165.method1128(arg0, var4, var2, var3);
                                int var82 = var2 - class307.field4577;
                                int var83 = var3 - class386.field5702;
                                if (var81.field4537 == 2) {
                                    if (var83 > -var82) {
                                        class253.method1606(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class253.method1606(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class253.method1606(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class253.method1606(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class432.field6150.method542(arg0.field415, arg0.field418);
                        }
                        class123 var84 = var81.method252(class432.field6150, 2);
                        if (var84 != null) {
                            var84.field1696 = var81;
                            var84.field1693 = var4;
                            var84.field1692 = var81.field4542;
                            var84.field1697 = var81.field4547;
                            class453.field6428.method1597(var84, (byte) 82);
                        }
                    }
                    for (int var85 = var81.field4542; var85 <= var81.field4541; var85++) {
                        for (int var86 = var81.field4547; var86 <= var81.field4552; var86++) {
                            class337 var87 = var8[var85][var86];
                            if (var87.field5049 != 0) {
                                class44.field632.method100(var87, -23157);
                            } else if ((var2 != var85 || var3 != var86) && var87.field5061) {
                                class44.field632.method100(var87, -23157);
                            }
                        }
                    }
                }
                if (arg1.field5045) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field5045 = false;
            }
        }
        if (arg1.field5046 != null) {
            if ((byte) (class492.field6919 & 0xFF) == arg1.field5059) {
                class268 var88 = arg1.field5046;
                int var89 = class479.field6745[var4].method199(var2, var3);
                int var90;
                if (var4 < class344.field5192 - 1) {
                    var90 = class479.field6745[var4].method199(var2, var3) - class479.field6745[var4 + 1].method199(var2, var3);
                } else {
                    var90 = 1024;
                }
                class163.field2269.method483(var6, var89, var7, arg0.field416);
                int var91 = arg0.field416[2];
                class163.field2269.method483(var6, var89 - var90, var7, arg0.field416);
                int var92 = arg0.field416[2];
                int var93 = var91;
                int var94 = var92;
                if (var91 > var92) {
                    var93 = var92;
                    var94 = var91;
                }
                int var95 = var93 - class106.field1487;
                int var96 = class106.field1487 + var94;
                if (var95 < var96 - 1597) {
                    var95 = var96 - 1597;
                }
                var88.field3969 = var95;
                var88.field3967 = var96;
                var88.field3971 = true;
                class432.field6150.method502(var88);
            } else {
                arg1.field5046 = null;
            }
        }
        if (!arg1.field5061) {
            return;
        }
        if (arg1.field5049 != 0) {
            return;
        }
        if (var2 <= class307.field4577 && var2 > class473.field6635) {
            class337 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field5061) {
                return;
            }
        }
        if (var2 >= class307.field4577 && var2 < class121.field1671 - 1) {
            class337 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field5061) {
                return;
            }
        }
        if (var3 <= class386.field5702 && var3 > class314.field4723) {
            class337 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field5061) {
                return;
            }
        }
        if (var3 >= class386.field5702 && var3 < class385.field5698 - 1) {
            class337 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field5061) {
                return;
            }
        }
        arg1.field5061 = false;
        class341.field5111--;
        class367 var101 = arg1.field5055;
        if (var101 != null && var101.field5549) {
            if (class252.field3628) {
                class165.method1128(arg0, var4, var2, var3);
                class432.field6150.method542(arg0.field415, arg0.field418);
            }
            class123 var102 = var101.method252(class432.field6150, 2);
            if (var102 != null) {
                var102.field1696 = var101;
                var102.field1693 = var4;
                var102.field1692 = var2;
                var102.field1697 = var3;
                class453.field6428.method1597(var102, (byte) 115);
            }
        }
        if (arg1.field5052 != 0) {
            class287 var103 = arg1.field5058;
            if (var103 != null && !class227.method1479(var5, var2, var3, var103.method286((byte) 127))) {
                if ((var103.field4393 & arg1.field5052) != 0) {
                    if (class252.field3628) {
                        class165.method1128(arg0, var4, var2, var3);
                        class432.field6150.method542(arg0.field415, arg0.field418);
                    }
                    class123 var104 = var103.method252(class432.field6150, 2);
                    if (var104 != null) {
                        var104.field1696 = var103;
                        var104.field1693 = var4;
                        var104.field1692 = var2;
                        var104.field1697 = var3;
                        class453.field6428.method1597(var104, (byte) -120);
                    }
                } else if (var103.field4393 == 256) {
                    int var105 = var103.field4392 - class100.field1420;
                    int var106 = var103.field4387 - class208.field3132;
                    int var107 = var103.field4390;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class252.field3628) {
                        class165.method1128(arg0, var4, var2, var3);
                        class432.field6150.method542(arg0.field415, arg0.field418);
                    }
                    class287 var110 = arg1.field5050;
                    if (var109 > var108) {
                        class123 var111 = var103.method252(class432.field6150, 2);
                        if (var111 != null) {
                            var111.field1696 = var103;
                            var111.field1693 = var4;
                            var111.field1692 = var2;
                            var111.field1697 = var3;
                            class453.field6428.method1597(var111, (byte) 41);
                        }
                    } else if (var110 != null) {
                        class123 var112 = var110.method252(class432.field6150, 2);
                        if (var112 != null) {
                            var112.field1696 = var110;
                            var112.field1693 = var4;
                            var112.field1692 = var2;
                            var112.field1697 = var3;
                            class453.field6428.method1597(var112, (byte) -105);
                        }
                    }
                }
            }
            class100 var113 = arg1.field5044;
            class100 var114 = arg1.field5047;
            if (var114 != null && (var114.field1425 & arg1.field5052) != 0 && !class313.method1939(var5, var2, var3, var114.field1425)) {
                if (class252.field3628) {
                    class299.method1866(arg0, var114.field1425, var4, var2, var3);
                    class432.field6150.method542(arg0.field415, arg0.field418);
                }
                class123 var115 = var114.method252(class432.field6150, 2);
                if (var115 != null) {
                    var115.field1696 = var114;
                    var115.field1693 = var4;
                    var115.field1692 = var2;
                    var115.field1697 = var3;
                    class453.field6428.method1597(var115, (byte) -76);
                }
            }
            if (var113 != null && (var113.field1425 & arg1.field5052) != 0 && !class313.method1939(var5, var2, var3, var113.field1425)) {
                if (class252.field3628) {
                    class299.method1866(arg0, var113.field1425, var4, var2, var3);
                    class432.field6150.method542(arg0.field415, arg0.field418);
                }
                class123 var116 = var113.method252(class432.field6150, 2);
                if (var116 != null) {
                    var116.field1696 = var113;
                    var116.field1693 = var4;
                    var116.field1692 = var2;
                    var116.field1697 = var3;
                    class453.field6428.method1597(var116, (byte) 40);
                }
            }
        }
        if (var4 < class344.field5192 - 1) {
            class337 var117 = class170.field2427[var4 + 1][var2][var3];
            if (var117 != null && var117.field5061) {
                class44.field632.method90((byte) 25, var117);
            }
        }
        if (var2 < class307.field4577) {
            class337 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field5061) {
                class44.field632.method100(var118, -23157);
            }
        }
        if (var3 < class386.field5702) {
            class337 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field5061) {
                class44.field632.method100(var119, -23157);
            }
        }
        if (var2 > class307.field4577) {
            class337 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field5061) {
                class44.field632.method100(var120, -23157);
            }
        }
        if (var3 > class386.field5702) {
            class337 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field5061) {
                class44.field632.method100(var121, -23157);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method1488(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3352++;
        if (arg0 == null) {
            return;
        }
        this.method1501(arg4, arg2, (byte) 36);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1493(var9, (int[]) null, arg6, (int[]) null, arg1 - 8460, arg5 + -(this.field3350.method3(arg0, (byte) 92) / arg1), arg0, (class319[]) null);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public static final void method1489(byte arg0) {
        field3360++;
        if (arg0 <= 121) {
            return;
        }
        if (class321.field4796 < 102) {
            class321.field4796 += 6;
        }
        if (class340.field5095 != 0) {
            class230.field3391 -= class340.field5095 * 5;
            if (class230.field3391 >= class186.field2831) {
                class230.field3391 = class186.field2831 - 1;
            }
            class340.field5095 = 0;
            if (class230.field3391 < 0) {
                class230.field3391 = 0;
            }
        }
        for (int var1 = 0; var1 < class336.field5032; var1++) {
            int var2 = class164.field2281[var1].method892(-1);
            char var3 = class164.field2281[var1].method895((byte) 120);
            if (var2 == 84) {
                class157.method1068((byte) 21);
            } else if (class296.field4445.method1100(false, 82) && var2 == 66) {
                if (class373.field5603 != null) {
                    String var4 = "";
                    for (int var5 = class362.field5480.length - 1; var5 >= 0; var5--) {
                        if (class362.field5480[var5] != null && class362.field5480[var5].length() > 0) {
                            var4 = var4 + class362.field5480[var5] + '\n';
                        }
                    }
                    class373.field5603.setContents(new StringSelection(var4), (ClipboardOwner) null);
                }
            } else if (class296.field4445.method1100(false, 82) && var2 == 67) {
                if (class373.field5603 != null) {
                    Transferable var6 = class373.field5603.getContents((Object) null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class3.method17(var7, 11205, '\n');
                                if (var8.length <= 1) {
                                    class394.field5805 = class394.field5805 + var7;
                                } else {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class394.field5805 = var8[var9];
                                        class157.method1068((byte) 21);
                                    }
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class122.field1687 > 0) {
                class394.field5805 = class394.field5805.substring(0, class122.field1687 - 1) + class394.field5805.substring(class122.field1687);
                class122.field1687--;
            } else if (var2 == 101 && class122.field1687 < class394.field5805.length()) {
                class394.field5805 = class394.field5805.substring(0, class122.field1687) + class394.field5805.substring(class122.field1687 + 1);
            } else if (var2 == 96 && class122.field1687 > 0) {
                class122.field1687--;
            } else if (var2 == 97 && class122.field1687 < class394.field5805.length()) {
                class122.field1687++;
            } else if (var2 == 102) {
                class122.field1687 = 0;
            } else if (var2 == 103) {
                class122.field1687 = class394.field5805.length();
            } else if (var2 == 104 && class362.field5480.length > class402.field5872) {
                class402.field5872++;
                class380.method2325(true);
                class122.field1687 = class394.field5805.length();
            } else if (var2 == 105 && class402.field5872 > 0) {
                class402.field5872--;
                class380.method2325(true);
                class122.field1687 = class394.field5805.length();
            } else if (class178.method1234(-84, var3) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class394.field5805 = class394.field5805.substring(0, class122.field1687) + class164.field2281[var1].method895((byte) 94) + class394.field5805.substring(class122.field1687);
                class122.field1687++;
            }
        }
        class336.field5032 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class450.field6362[var10]) {
                var10002 = class35.field441[var10]++;
                if (class35.field441[var10] > 102) {
                    class450.field6362[var10] = false;
                }
            } else {
                var10002 = class35.field441[var10]--;
                if (class35.field441[var10] < 0) {
                    class245.field3502[var10] = (int) (Math.random() * (double) class342.field5115);
                    class285.field4359[var10] = (int) (Math.random() * 350.0D);
                    class35.field441[var10] = 0;
                    class450.field6362[var10] = true;
                }
            }
        }
        class456.method2706((byte) 114);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1490(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3364++;
        if (arg0 == null) {
            return;
        }
        this.method1501(arg5, arg1, (byte) 36);
        this.method1505(arg2 - this.field3350.method3(arg0, (byte) 92), 23378, arg0, (class319[]) null, (int[]) null, arg3, 0, 0, (class401) null);
        if (arg4 != 29729) {
            field3371 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/lang/String;)V")
    private final void method1491(int arg0, String arg1) {
        try {
            if (arg0 != 0) {
                return;
            }
            if (arg1.startsWith("col=")) {
                class203.field3094 = class203.field3094 & 0xFF000000 | class344.method2123((byte) 116, arg1.substring(4), 16) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class203.field3094 = class137.field1971 & 0xFFFFFF | class203.field3094 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class203.field3094 = class344.method2123((byte) 97, arg1.substring(5), 16);
            } else if (arg1.equals("/argb")) {
                class203.field3094 = class137.field1971;
            } else if (arg1.startsWith("str=")) {
                class486.field6837 = class344.method2123((byte) 56, arg1.substring(4), 16) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class486.field6837 = -8388608;
            } else if (arg1.equals("/str")) {
                class486.field6837 = -1;
            } else if (arg1.startsWith("u=")) {
                class155.field2164 = class344.method2123((byte) 98, arg1.substring(2), 16) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class155.field2164 = -16777216;
            } else if (arg1.equals("/u")) {
                class155.field2164 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class270.field4000 = 0;
            } else if (arg1.startsWith("shad=")) {
                class270.field4000 = class344.method2123((byte) 101, arg1.substring(5), 16) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class270.field4000 = -16777216;
            } else if (arg1.equals("/shad")) {
                class270.field4000 = class367.field5552;
            } else if (arg1.equals("br")) {
                this.method1501(class367.field5552, class137.field1971, (byte) 36);
            }
        } catch (Exception var3) {
        }
        field3351++;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIILjava/lang/String;IILus;[IIIII[Ldp;III)I")
    public final int method1492(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, class401 arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, class319[] arg12, int arg13, int arg14, int arg15) {
        field3357++;
        if (arg3 == null) {
            return 0;
        }
        this.method1501(arg5, arg14, (byte) 36);
        if (arg13 == 0) {
            arg13 = this.field3350.field3;
        }
        int[] var17;
        if ((this.field3350.field6 + this.field3350.field16 + arg13) > arg0 && (arg13 + arg13) > arg0) {
            var17 = null;
        } else {
            var17 = new int[] { arg1 };
        }
        int var18 = this.field3350.method4(arg3, 1, arg12, class163.field2260, var17);
        if (arg10 == 3 && var18 == 1) {
            arg10 = 1;
        }
        int var20;
        if (arg10 == 0) {
            var20 = this.field3350.field16 + arg15;
        } else if (arg10 == 1) {
            var20 = (arg0 - this.field3350.field16 - (var18 + -1) * arg13 - this.field3350.field6) / 2 + this.field3350.field16 + arg15;
        } else if (arg10 == 2) {
            var20 = arg15 + arg0 - this.field3350.field6 - ((var18 + -1) * arg13);
        } else {
            int var19 = (arg0 - ((var18 - 1) * arg13) - this.field3350.field16 - this.field3350.field6) / (var18 + 1);
            if (var19 < 0) {
                var19 = 0;
            }
            var20 = this.field3350.field16 + arg15 + var19;
            arg13 += var19;
        }
        int var21 = 0;
        if (arg11 >= -107) {
            field3372 = null;
        }
        while (var18 > var21) {
            if (arg9 == 0) {
                this.method1505(arg8, 23378, class163.field2260[var21], arg12, arg7, var20, arg4, arg2, arg6);
            } else if (arg9 == 1) {
                this.method1505(arg8 + (arg1 - this.field3350.method3(class163.field2260[var21], (byte) 92)) / 2, 23378, class163.field2260[var21], arg12, arg7, var20, arg4, arg2, arg6);
            } else if (arg9 == 2) {
                this.method1505(arg1 + (arg8 - this.field3350.method3(class163.field2260[var21], (byte) 92)), 23378, class163.field2260[var21], arg12, arg7, var20, arg4, arg2, arg6);
            } else if (var18 - 1 == var21) {
                this.method1505(arg8, 23378, class163.field2260[var21], arg12, arg7, var20, arg4, arg2, arg6);
            } else {
                this.method1495(class163.field2260[var21], arg1, (byte) 123);
                this.method1505(arg8, 23378, class163.field2260[var21], arg12, arg7, var20, arg4, arg2, arg6);
                class75.field1042 = 0;
            }
            var20 += arg13;
            var21++;
        }
        return var18;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([I[II[IIILjava/lang/String;[Ldp;)V")
    private final void method1493(int[] arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, String arg6, class319[] arg7) {
        int var9 = arg2 - this.field3350.field3;
        if (arg4 != -8458) {
            method1489((byte) -128);
        }
        field3361++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class156.method1065((byte) -79, arg6.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg6.substring(var10 + 1, var14);
                    var10 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17;
                                    if (arg3 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg3[var12];
                                    }
                                    int var18;
                                    if (arg0 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg0[var12];
                                    }
                                    var12++;
                                    int var19 = class427.method2512(10, var16.substring(4));
                                    class319 var20 = arg7[var19];
                                    int var21 = arg1 == null ? var20.method789() : arg1[var19];
                                    var20.method793(arg5 + var17, -var21 + var9 - (-this.field3350.field3 - var18), 0, 0, 1);
                                    var11 = -1;
                                    arg5 += arg7[var19].method791();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1491(0, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg5 += this.field3350.method10(var15, var11, 15338);
                    }
                    int var22;
                    if (arg3 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg3[var12];
                    }
                    int var23;
                    if (arg0 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg0[var12];
                    }
                    if (var15 != ' ') {
                        if ((class270.field4000 & 0xFF000000) != 0) {
                            this.method1085(var15, var22 + arg5 + 1, var9 + 1 + var23, class270.field4000, true);
                        }
                        this.method1085(var15, arg5 + var22, var9 + var23, class203.field3094, false);
                    } else if (class75.field1042 > 0) {
                        class469.field6607 += class75.field1042;
                        arg5 += class469.field6607 >> 8;
                        class469.field6607 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field3350.method9(var15, 0);
                    if (class486.field6837 != -1) {
                        this.field3368.method582((int) ((double) this.field3350.field3 * 0.7D) + var9, var24, class486.field6837, arg5, -15118);
                    }
                    if (class155.field2164 != -1) {
                        this.field3368.method582(this.field3350.field3 + var9, var24, class155.field2164, arg5, -15118);
                    }
                    arg5 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIBLjava/lang/String;I)V")
    public final void method1494(int arg0, int arg1, int arg2, byte arg3, String arg4, int arg5) {
        field3359++;
        if (arg4 == null) {
            return;
        }
        this.method1501(arg0, arg1, (byte) 36);
        if (arg3 < 20) {
            method1502(false, (class451) null, -15);
        }
        this.method1505(arg2 - (this.field3350.method3(arg4, (byte) 92) / 2), 23378, arg4, (class319[]) null, (int[]) null, arg5, 0, 0, (class401) null);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    private final void method1495(String arg0, int arg1, byte arg2) {
        field3373++;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 49 / ((63 - arg2) / 43);
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            char var8 = arg0.charAt(var7);
            if (var8 == '<') {
                var5 = true;
            } else if (var8 == '>') {
                var5 = false;
            } else if (!var5 && var8 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class75.field1042 = (arg1 - this.field3350.method3(arg0, (byte) 92) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZ)V")
    public static final void method1496(int arg0, boolean arg1) {
        class75.field1050 = arg1;
        field3354++;
        if (class75.field1050) {
            int var2 = class220.field3246.method2585(122);
            int var3 = class220.field3246.method2616((byte) -111);
            boolean var4 = class220.field3246.method2620(-128) == 1;
            int var5 = class220.field3246.method2637(-4);
            class103.method778(var3, true);
            class220.field3246.method378((byte) 84);
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var21 = 0; var21 < class379.field5642 >> 3; var21++) {
                    for (int var22 = 0; var22 < class456.field6477 >> 3; var22++) {
                        int var23 = class220.field3246.method369((byte) 126, 1);
                        if (var23 == 1) {
                            class38.field530[var6][var21][var22] = class220.field3246.method369((byte) 126, 26);
                        } else {
                            class38.field530[var6][var21][var22] = -1;
                        }
                    }
                }
            }
            class220.field3246.method371(true);
            int var7 = (class95.field1342 - class220.field3246.field6315) / 16;
            client.field6672 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var20 = 0; var20 < 4; var20++) {
                    client.field6672[var8][var20] = class220.field3246.method2604(-126);
                }
            }
            class485.field6820 = new byte[var7][];
            class298.field4462 = new int[var7];
            class209.field3151 = new byte[var7][];
            class408.field5915 = new byte[var7][];
            client.field6674 = null;
            class184.field2792 = new int[var7];
            class81.field1139 = new int[var7];
            class124.field1707 = new int[var7];
            class340.field5098 = null;
            class105.field1477 = new byte[var7][];
            class145.field2052 = new int[var7];
            int var9 = 0;
            for (int var10 = 0; var10 < 4; var10++) {
                for (int var11 = 0; var11 < class379.field5642 >> 3; var11++) {
                    for (int var12 = 0; var12 < class456.field6477 >> 3; var12++) {
                        int var13 = class38.field530[var10][var11][var12];
                        if (var13 != -1) {
                            int var14 = (var13 & 0xFFCECE) >> 14;
                            int var15 = var13 >> 3 & 0x7FF;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < var9; var17++) {
                                if (class145.field2052[var17] == var16) {
                                    var16 = -1;
                                    break;
                                }
                            }
                            if (var16 != -1) {
                                class145.field2052[var9] = var16;
                                int var18 = var16 >> 8 & 0xFF;
                                int var19 = var16 & 0xFF;
                                class184.field2792[var9] = class170.field2421.method2676("m" + var18 + "_" + var19, (byte) -98);
                                class124.field1707[var9] = class170.field2421.method2676("l" + var18 + "_" + var19, (byte) -50);
                                class81.field1139[var9] = class170.field2421.method2676("um" + var18 + "_" + var19, (byte) -66);
                                class298.field4462[var9] = class170.field2421.method2676("ul" + var18 + "_" + var19, (byte) -57);
                                var9++;
                            }
                        }
                    }
                }
            }
            class298.method1864(var2, var5, (byte) 45, var4, false);
        } else {
            boolean var24 = class220.field3246.method2628(49152) == 1;
            int var25 = class220.field3246.method2598(15229);
            int var26 = class220.field3246.method2628(49152);
            int var27 = class220.field3246.method2637(-4);
            class103.method778(var26, true);
            int var28 = (class95.field1342 - class220.field3246.field6315) / 16;
            client.field6672 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var33 = 0; var33 < 4; var33++) {
                    client.field6672[var29][var33] = class220.field3246.method2604(75);
                }
            }
            class485.field6820 = new byte[var28][];
            class145.field2052 = new int[var28];
            client.field6674 = null;
            class184.field2792 = new int[var28];
            class124.field1707 = new int[var28];
            class408.field5915 = new byte[var28][];
            class81.field1139 = new int[var28];
            class340.field5098 = null;
            class209.field3151 = new byte[var28][];
            class298.field4462 = new int[var28];
            class105.field1477 = new byte[var28][];
            int var30 = 0;
            for (int var31 = (var25 - (class379.field5642 >> 4)) / 8; var31 <= (((class379.field5642 >> 4) + var25) / 8); var31++) {
                for (int var32 = (var27 - (class456.field6477 >> 4)) / 8; var32 <= ((var27 + (class456.field6477 >> 4)) / 8); var32++) {
                    class145.field2052[var30] = (var31 << 8) + var32;
                    class184.field2792[var30] = class170.field2421.method2676("m" + var31 + "_" + var32, (byte) -106);
                    class124.field1707[var30] = class170.field2421.method2676("l" + var31 + "_" + var32, (byte) -44);
                    class81.field1139[var30] = class170.field2421.method2676("um" + var31 + "_" + var32, (byte) -112);
                    class298.field4462[var30] = class170.field2421.method2676("ul" + var31 + "_" + var32, (byte) -117);
                    var30++;
                }
            }
            class298.method1864(var25, var27, (byte) 45, var24, false);
        }
        if (arg0 != 1862775652) {
            method1496(-73, false);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/lang/String;IBII)V")
    public final void method1497(int arg0, String arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3366++;
        if (arg1 == null) {
            return;
        }
        this.method1501(arg0, arg4, (byte) 36);
        if (arg3 >= -37) {
            this.method1497(55, (String) null, -85, (byte) -113, -89, -39);
        }
        this.method1505(arg2, 23378, arg1, (class319[]) null, (int[]) null, arg5, 0, 0, (class401) null);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method1498(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3353++;
        if (arg1 == null) {
            return;
        }
        this.method1501(arg4, arg0, (byte) 36);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg3 != 1784) {
            field3372 = null;
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1493(var10, (int[]) null, arg2, var9, -8458, arg6 - (this.field3350.method3(arg1, (byte) 92) / 2), arg1, (class319[]) null);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static void method1499(int arg0) {
        field3374 = null;
        field3372 = null;
        int var1 = 16 / ((arg0 - 71) / 49);
        field3369 = null;
        field3371 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
    public final void method1500(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3355++;
        if (arg0 == null) {
            return;
        }
        if (arg1 != 255) {
            field3372 = null;
        }
        this.method1501(arg5, arg4, (byte) 36);
        double var9 = 7.0D - ((double) arg2 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg0.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg6) * var9);
        }
        this.method1493(var12, (int[]) null, arg3, (int[]) null, -8458, arg7 - (this.field3350.method3(arg0, (byte) 92) / 2), arg0, (class319[]) null);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(CIIIZLus;II)V")
    public abstract void method1086(char arg0, int arg1, int arg2, int arg3, boolean arg4, class401 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIB)V")
    private final void method1501(int arg0, int arg1, byte arg2) {
        class469.field6607 = 0;
        if (arg2 != 36) {
            return;
        }
        class486.field6837 = -1;
        class137.field1971 = arg1;
        class203.field3094 = arg1;
        field3362++;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class75.field1042 = 0;
        class155.field2164 = -1;
        class367.field5552 = arg0;
        class270.field4000 = arg0;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZLui;I)Lmd;")
    public static final class199 method1502(boolean arg0, class451 arg1, int arg2) {
        field3356++;
        if (arg0) {
            byte[] var3 = arg1.method2667((byte) -116, arg2);
            return var3 == null ? null : new class199(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1503(byte[] arg0, int arg1) {
        field3363++;
        class446 var2 = new class446(arg0);
        int var3 = var2.method2628(49152);
        int var4 = var2.method2604(109);
        if (arg1 > var4 || !(class370.field5576 == 0 || class370.field5576 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2589(var4, 0, 112, var5);
            return var5;
        } else {
            int var6 = var2.method2604(38);
            if (var6 < 0 || class370.field5576 != 0 && var6 > class370.field5576) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class177.method1217(var7, var6, arg0, var4, 9);
            } else {
                class179.field2672.method1857(var2, var7, arg1 - 1);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;IIIII[I[Ldp;)V")
    public final void method1504(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, class319[] arg7) {
        if (arg4 >= -98) {
            return;
        }
        field3365++;
        if (arg0 != null) {
            this.method1501(arg1, arg5, (byte) 36);
            this.method1505(arg2, 23378, arg0, arg7, arg6, arg3, 0, 0, (class401) null);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IILjava/lang/String;[Ldp;[IIIILus;)V")
    private final void method1505(int arg0, int arg1, String arg2, class319[] arg3, int[] arg4, int arg5, int arg6, int arg7, class401 arg8) {
        int var10 = arg5 - this.field3350.field3;
        field3358++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg2.length();
        if (arg1 != 23378) {
            return;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class156.method1065((byte) -89, arg2.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg2.substring(var11 + 1, var14);
                    var11 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17 = class427.method2512(10, var16.substring(4));
                                    class319 var18 = arg3[var17];
                                    int var19 = arg4 == null ? var18.method789() : arg4[var17];
                                    if ((class203.field3094 & 0xFF000000) == -16777216) {
                                        var18.method793(arg0, var10 + this.field3350.field3 - var19, 0, 0, 1);
                                    } else {
                                        var18.method793(arg0, var10 + this.field3350.field3 - var19, 1, class203.field3094 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg0 += arg3[var17].method791();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1491(0, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg0 += this.field3350.method10(var15, var12, 15338);
                    }
                    if (var15 == ' ') {
                        if (class75.field1042 > 0) {
                            class469.field6607 += class75.field1042;
                            arg0 += class469.field6607 >> 8;
                            class469.field6607 &= 0xFF;
                        }
                    } else if (arg8 == null) {
                        if ((class270.field4000 & 0xFF000000) != 0) {
                            this.method1085(var15, arg0 + 1, var10 - -1, class270.field4000, true);
                        }
                        this.method1085(var15, arg0, var10, class203.field3094, false);
                    } else {
                        if ((class270.field4000 & 0xFF000000) != 0) {
                            this.method1086(var15, arg0 + 1, var10 + 1, class270.field4000, true, arg8, arg7, arg6);
                        }
                        this.method1086(var15, arg0, var10, class203.field3094, false, arg8, arg7, arg6);
                    }
                    int var20 = this.field3350.method9(var15, arg1 ^ 0x5B52);
                    if (class486.field6837 != -1) {
                        this.field3368.method582(var10 + ((int) ((double) this.field3350.field3 * 0.7D)), var20, class486.field6837, arg0, -15118);
                    }
                    if (class155.field2164 != -1) {
                        this.field3368.method582(var10 + this.field3350.field3 + 1, var20, class155.field2164, arg0, arg1 - 38496);
                    }
                    arg0 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Ltq;Lis;)V")
    public class229(class63 arg0, class1 arg1) {
        this.field3350 = arg1;
        this.field3368 = arg0;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III[Ldp;ILjava/lang/String;ZILjava/util/Random;[I)I")
    public final int method1506(int arg0, int arg1, int arg2, class319[] arg3, int arg4, String arg5, boolean arg6, int arg7, Random arg8, int[] arg9) {
        if (arg6) {
            return 95;
        }
        field3367++;
        if (arg5 == null) {
            return 0;
        }
        arg8.setSeed((long) arg7);
        int var11 = (arg8.nextInt() & 0x1F) + 192;
        this.method1501(var11 << 24 | arg0 & 0xFFFFFF, var11 << 24 | arg1 & 0xFFFFFF, (byte) 36);
        int var12 = arg5.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg8.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1493((int[]) null, arg9, arg2, var13, -8458, arg4, arg5, arg3);
        return var14;
    }
}
