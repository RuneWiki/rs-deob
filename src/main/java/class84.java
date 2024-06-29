import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class84 extends class298 {

    @OriginalMember(owner = "client!wn", name = "O", descriptor = "I")
    public static int field1019 = -1;

    @OriginalMember(owner = "client!wn", name = "N", descriptor = "Z")
    public static boolean field1018 = false;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "[[Z")
    public static boolean[][] field1015 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!wn", name = "P", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!wn", name = "Q", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!wn", name = "R", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!wn", name = "S", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!wn", name = "T", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V", line = 3)
    public class84() {
        super(3, false);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)[[I", line = 6)
    public final int[][] method157(int arg0, int arg1) {
        ++field1020;
        int[][] var3 = super.field4454.method1638((byte) -105, arg1);
        if (arg0 != -24032) {
            method426(-102);
        }
        if (super.field4454.field3886) {
            int[] var4 = this.method1882(2, -2594, arg1);
            int[][] var5 = this.method1878(0, arg1, 93);
            int[][] var6 = this.method1878(1, arg1, 66);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class158.field1877 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILvt;)V", line = 84)
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg1 == 0) {
            super.field4449 = arg2.method895((byte) -76) == 1;
        }
        if (arg0 >= -44) {
            method424((byte) -61);
        }
        ++field1022;
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(B)V", line = 101)
    public static void method424(byte arg0) {
        if (arg0 < 50) {
            field1015 = null;
        }
        field1015 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 111)
    public static final String method425(int arg0, boolean arg1, int arg2) {
        if (arg2 != -20347) {
            method424((byte) -126);
        }
        ++field1024;
        return arg1 && arg0 >= 0 ? class22.method138(arg0, 32405, arg1, 10) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V", line = 139)
    public static final void method426(int arg0) {
        ++field1016;
        class79.field939.method2016(82);
        int var1 = class79.field939.method2017(-9, 8);
        if (var1 < class356.field5112) {
            for (int var2 = var1; ~var2 > ~class356.field5112; ++var2) {
                class73.field880[class353.field5070++] = class25.field353[var2];
            }
        }
        if (class356.field5112 < var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class356.field5112 = 0;
            if (arg0 == -32665) {
                for (int var3 = 0; ~var1 < ~var3; ++var3) {
                    int var4 = class25.field353[var3];
                    class137 var5 = class448.field6366[var4];
                    int var6 = class79.field939.method2017(-12, 1);
                    if (var6 == 0) {
                        class25.field353[class356.field5112++] = var4;
                        var5.field2489 = class204.field2796;
                    } else {
                        int var7 = class79.field939.method2017(-32, 2);
                        if (var7 == 0) {
                            class25.field353[class356.field5112++] = var4;
                            var5.field2489 = class204.field2796;
                            class232.field3219[class360.field5194++] = var4;
                        } else if (var7 == 1) {
                            class25.field353[class356.field5112++] = var4;
                            var5.field2489 = class204.field2796;
                            int var8 = class79.field939.method2017(-13, 3);
                            var5.method647(var8, 1, arg0 ^ -32666);
                            int var9 = class79.field939.method2017(-68, 1);
                            if (var9 == 1) {
                                class232.field3219[class360.field5194++] = var4;
                            }
                        } else if (~var7 == -3) {
                            class25.field353[class356.field5112++] = var4;
                            var5.field2489 = class204.field2796;
                            if (class79.field939.method2017(-64, 1) != 1) {
                                int var10 = class79.field939.method2017(-103, 3);
                                var5.method647(var10, 0, 1);
                            } else {
                                int var11 = class79.field939.method2017(-90, 3);
                                var5.method647(var11, 2, 1);
                                int var12 = class79.field939.method2017(-5, 3);
                                var5.method647(var12, 2, 1);
                            }
                            int var13 = class79.field939.method2017(arg0 + 32582, 1);
                            if (var13 == 1) {
                                class232.field3219[class360.field5194++] = var4;
                            }
                        } else if (var7 == 3) {
                            class73.field880[class353.field5070++] = var4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V", line = 252)
    public static final void method427(int arg0) {
        class424.field6127 = new class158(class422.field6093.method205((byte) 114, class68.field849), "", class283.field4126, 1009, -1, 0L, 0, arg0, true, false);
        ++field1017;
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(III)I", line = 262)
    public static final int method428(int arg0, int arg1, int arg2) {
        ++field1023;
        return ~arg0 != arg2 && arg0 != 5 ? 256 : class31.field384[3 & arg1];
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)[I", line = 274)
    public final int[] method13(int arg0, boolean arg1) {
        ++field1021;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (!arg1) {
            field1015 = null;
        }
        if (super.field4443.field6915) {
            int[] var4 = this.method1882(0, -2594, arg0);
            int[] var5 = this.method1882(1, -2594, arg0);
            int[] var6 = this.method1882(2, -2594, arg0);
            for (int var7 = 0; class158.field1877 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }
}
