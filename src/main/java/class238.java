import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class238 extends class259 {

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    private int field4232 = 1;

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
    private int field4246 = 1;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "Lb;")
    public static class48 field4237 = new class48();

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
    public static int field4239 = 1;

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "Lsg;")
    public static class30 field4241 = class167.method1221((byte) 33, "sch-Utteln:");

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "Lsg;")
    private static class30 field4242 = class167.method1221((byte) 33, "Drop");

    @OriginalMember(owner = "client!j", name = "db", descriptor = "Z")
    public static boolean field4243 = true;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "Lsg;")
    public static class30 field4244 = field4242;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
    public static int field4245 = -1;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1689(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++class250.field4425;
        class123.field2415 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class45.field1060; var12 < class182.field3347; ++var12) {
            class195[][] var38 = class71.field1613[var12];
            for (int var39 = class4.field58; var39 < class150.field2850; ++var39) {
                for (int var40 = class91.field1841; var40 < class88.field1804; ++var40) {
                    class195 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class155.field2948[var39 - class57.field1258 + class76.field1674][var40 - class15.field320 + class76.field1674] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3538 = true;
                            var41.field3542 = true;
                            if (var41.field3522 > 0) {
                                var41.field3526 = true;
                            } else {
                                var41.field3526 = false;
                            }
                            ++class123.field2415;
                        } else {
                            var41.field3538 = false;
                            var41.field3542 = false;
                            var41.field3533 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field3532 != null) {
                                    class225 var42 = var41.field3532;
                                    var42.field4031.method191(var42.field4038, var42.field4025, var42.field4038, var42.field4025, -1);
                                    if (var42.field4029 != null) {
                                        var42.field4029.method191(var42.field4038, var42.field4025, var42.field4038, var42.field4025, -1);
                                    }
                                }
                                if (var41.field3537 != null) {
                                    class146 var43 = var41.field3537;
                                    var43.field2800.method191(var43.field2797, var43.field2796, var43.field2797, var43.field2796, -1);
                                    if (var43.field2798 != null) {
                                        var43.field2798.method191(var43.field2797, var43.field2796, var43.field2797, var43.field2796, -1);
                                    }
                                }
                                if (var41.field3541 != null) {
                                    class104 var44 = var41.field3541;
                                    var44.field2089.method191(var44.field2093, var44.field2104, var44.field2093, var44.field2104, -1);
                                }
                                if (var41.field3540 != null) {
                                    for (int var45 = 0; var45 < var41.field3522; ++var45) {
                                        class35 var46 = var41.field3540[var45];
                                        var46.field857.method191(var46.field856, var46.field854, var46.field853, var46.field844, -1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class87.field1790 == class242.field4333;
        for (int var14 = class45.field1060; var14 < class182.field3347; ++var14) {
            class195[][] var27 = class71.field1613[var14];
            for (int var28 = -class76.field1674; var28 <= 0; ++var28) {
                int var29 = class57.field1258 + var28;
                int var30 = class57.field1258 - var28;
                if (var29 >= class4.field58 || var30 < class150.field2850) {
                    for (int var31 = -class76.field1674; var31 <= 0; ++var31) {
                        int var32 = class15.field320 + var31;
                        int var33 = class15.field320 - var31;
                        if (var29 >= class4.field58) {
                            if (var32 >= class91.field1841) {
                                class195 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3538) {
                                    class215.method1577(var34, true);
                                }
                            }
                            if (var33 < class88.field1804) {
                                class195 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3538) {
                                    class215.method1577(var35, true);
                                }
                            }
                        }
                        if (var30 < class150.field2850) {
                            if (var32 >= class91.field1841) {
                                class195 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3538) {
                                    class215.method1577(var36, true);
                                }
                            }
                            if (var33 < class88.field1804) {
                                class195 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3538) {
                                    class215.method1577(var37, true);
                                }
                            }
                        }
                        if (class123.field2415 == 0) {
                            if (!var13) {
                                class45.field1059 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class45.field1060; var15 < class182.field3347; ++var15) {
            class195[][] var16 = class71.field1613[var15];
            for (int var17 = -class76.field1674; var17 <= 0; ++var17) {
                int var18 = class57.field1258 + var17;
                int var19 = class57.field1258 - var17;
                if (var18 >= class4.field58 || var19 < class150.field2850) {
                    for (int var20 = -class76.field1674; var20 <= 0; ++var20) {
                        int var21 = class15.field320 + var20;
                        int var22 = class15.field320 - var20;
                        if (var18 >= class4.field58) {
                            if (var21 >= class91.field1841) {
                                class195 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3538) {
                                    class215.method1577(var23, false);
                                }
                            }
                            if (var22 < class88.field1804) {
                                class195 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3538) {
                                    class215.method1577(var24, false);
                                }
                            }
                        }
                        if (var19 < class150.field2850) {
                            if (var21 >= class91.field1841) {
                                class195 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3538) {
                                    class215.method1577(var25, false);
                                }
                            }
                            if (var22 < class88.field1804) {
                                class195 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3538) {
                                    class215.method1577(var26, false);
                                }
                            }
                        }
                        if (class123.field2415 == 0) {
                            if (!var13) {
                                class45.field1059 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class45.field1059 = false;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
    public static void method1690(boolean arg0) {
        field4241 = null;
        field4244 = null;
        field4237 = null;
        field4242 = null;
        if (!arg0) {
            field4244 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLmc;)V")
    public static final void method1691(byte arg0, class151 arg1) {
        if (arg0 == -44) {
            class273.field4777 = arg1;
            ++field4235;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            method1692(-16, 45);
        }
        ++field4236;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field4588 = ~arg2.method63((byte) 127) == -2;
                }
            } else {
                this.field4246 = arg2.method63((byte) 96);
            }
        } else {
            this.field4232 = arg2.method63((byte) 89);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field4233;
        int[] var3 = super.field4581.method1841(18, arg0);
        if (arg1) {
            field4238 = -8;
        }
        if (super.field4581.field4729) {
            int var4 = this.field4246 + this.field4246 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4232 + this.field4232 + 1;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field4246 + arg0; var9 <= this.field4246 + arg0; ++var9) {
                int[] var13 = this.method1799(0, class263.field4649 & var9, 119);
                int var14 = 0;
                for (int var15 = -this.field4232; ~var15 >= ~this.field4232; ++var15) {
                    var14 += var13[var15 & class52.field1174];
                }
                int[] var16 = new int[class223.field3999];
                int var17 = 0;
                while (~class223.field3999 < ~var17) {
                    var16[var17] = var8 * var14 >> 16;
                    int var18 = var14 - var13[-this.field4232 + var17 & class52.field1174];
                    ++var17;
                    var14 = var13[class52.field1174 & this.field4232 + var17] + var18;
                }
                var7[var9 - arg0 + this.field4246] = var16;
            }
            for (int var10 = 0; ~var10 > ~class223.field3999; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class238() {
        super(1, false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        int[][] var3 = super.field4568.method241(-82, arg1);
        ++field4240;
        int var4 = -122 / ((arg0 - -48) / 42);
        if (super.field4568.field564) {
            int var5 = this.field4246 + this.field4246 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field4232 + 1 + this.field4232;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = -this.field4246 + arg1; ~var10 >= ~(this.field4246 + arg1); ++var10) {
                int[][] var20 = this.method1795(class263.field4649 & var10, 2, 0);
                int[][] var21 = new int[3][class223.field3999];
                int var22 = 0;
                int var23 = 0;
                int var24 = 0;
                int[] var25 = var20[1];
                int[] var26 = var20[0];
                int[] var27 = var20[2];
                for (int var28 = -this.field4232; ~this.field4232 <= ~var28; ++var28) {
                    int var38 = class52.field1174 & var28;
                    var22 += var26[var38];
                    var24 += var25[var38];
                    var23 += var27[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (class223.field3999 > var32) {
                    var29[var32] = var8 * var22 >> 16;
                    var30[var32] = var8 * var24 >> 16;
                    var31[var32] = var8 * var23 >> 16;
                    int var33 = class52.field1174 & -this.field4232 + var32;
                    int var34 = var22 - var26[var33];
                    int var35 = var24 - var25[var33];
                    int var36 = var23 - var27[var33];
                    ++var32;
                    int var37 = var32 - -this.field4232 & class52.field1174;
                    var23 = var27[var37] + var36;
                    var22 = var26[var37] + var34;
                    var24 = var25[var37] + var35;
                }
                var9[-arg1 + this.field4246 + var10] = var21;
            }
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            int[] var13 = var3[0];
            for (int var14 = 0; ~class223.field3999 < ~var14; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; var18 < var5; ++var18) {
                    int[][] var19 = var9[var18];
                    var15 += var19[0][var14];
                    var16 += var19[1][var14];
                    var17 += var19[2][var14];
                }
                var13[var14] = var6 * var15 >> 16;
                var11[var14] = var6 * var16 >> 16;
                var12[var14] = var6 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Z")
    public static final boolean method1692(int arg0, int arg1) {
        ++field4234;
        if (arg0 != 0) {
            return false;
        } else {
            return (-arg1 & arg1) == arg1;
        }
    }
}
