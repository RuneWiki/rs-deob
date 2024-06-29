import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class24 extends class202 {

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
    public static int field268 = 999999;

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "[I")
    public static int[] field270 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "[[Z")
    public static boolean[][] field269 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "Lbi;")
    public static class104 field272 = new class104(20, 6);

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!bo", name = "N", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!bo", name = "S", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bo", name = "T", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!bo", name = "Q", descriptor = "Lc;")
    public static class205 field274;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZI)V")
    public static final void method148(int arg0, boolean arg1, int arg2) {
        ++field271;
        class456 var3 = class233.method1654(arg0, 16, 124);
        var3.method2858(10250);
        var3.field7042 = arg2;
        if (arg1) {
            field274 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III[[[Lce;IZ)Z")
    public static final boolean method149(int arg0, int arg1, int arg2, class409[][][] arg3, int arg4, boolean arg5) {
        ++field275;
        byte var6 = !arg5 ? (byte) (class479.field7323 & 255) : 1;
        if (arg4 > -64) {
            return true;
        } else if (class240.field3908[class201.field3057][arg1][arg0] == var6) {
            return false;
        } else if ((4 & class416.field6309[class201.field3057][arg1][arg0]) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class212.field3628[var7] = arg1;
            int var35 = var7 + 1;
            class3.field35[var7] = arg0;
            class240.field3908[class201.field3057][arg1][arg0] = var6;
            while (~var35 != ~var8) {
                int var9 = class212.field3628[var8] & 65535;
                int var10 = (class212.field3628[var8] & 16758455) >> 16;
                int var11 = class212.field3628[var8] >> 24 & 255;
                int var12 = class3.field35[var8] & 65535;
                int var13 = class3.field35[var8] >> 16 & 255;
                var8 = 4095 & var8 + 1;
                boolean var14 = false;
                if (~(4 & class416.field6309[class201.field3057][var9][var12]) == -1) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class201.field3057 - -1; var16 <= 3; ++var16) {
                    if (~(8 & class416.field6309[var16][var9][var12]) == -1) {
                        if (var14 && arg3[var16][var9][var12] != null) {
                            if (arg3[var16][var9][var12].field6180 != null) {
                                int var20 = class529.method3144(var10, (byte) 73);
                                if (arg3[var16][var9][var12].field6180.field7302 == var20 || arg3[var16][var9][var12].field6188 != null && arg3[var16][var9][var12].field6188.field7302 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class529.method3144(var11, (byte) 73);
                                    if (~arg3[var16][var9][var12].field6180.field7302 == ~var21 || arg3[var16][var9][var12].field6188 != null && ~arg3[var16][var9][var12].field6188.field7302 == ~var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class529.method3144(var13, (byte) 73);
                                    if (~arg3[var16][var9][var12].field6180.field7302 == ~var22 || arg3[var16][var9][var12].field6188 != null && ~arg3[var16][var9][var12].field6188.field7302 == ~var22) {
                                        continue;
                                    }
                                }
                            }
                            class409 var23 = arg3[var16][var9][var12];
                            if (var23.field6175 != null) {
                                for (class192 var24 = var23.field6175; var24 != null; var24 = var24.field2841) {
                                    class423 var25 = var24.field2845;
                                    if (var25 instanceof class267) {
                                        class267 var26 = (class267) var25;
                                        int var27 = var26.method99((byte) 88);
                                        int var28 = var26.method106((byte) 18);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (~var10 == ~var29 || var11 != 0 && var11 == var29 || ~var13 != -1 && ~var13 == ~var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class409 var30 = arg3[var16][var9][var12];
                        if (var30 != null && var30.field6175 != null) {
                            for (class192 var31 = var30.field6175; var31 != null; var31 = var31.field2841) {
                                class423 var32 = var31.field2845;
                                if (var32.field6423 != var32.field6420 || var32.field6424 != var32.field6418) {
                                    for (int var33 = var32.field6423; ~var32.field6420 <= ~var33; ++var33) {
                                        for (int var34 = var32.field6424; ~var32.field6418 <= ~var34; ++var34) {
                                            class240.field3908[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class240.field3908[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class53.field732[class201.field3057 + 1].method688(var9, var12);
                    if (~class279.field4424[arg2] > ~var17) {
                        class279.field4424[arg2] = var17;
                    }
                    int var18 = var9 << 7;
                    if (~class180.field2623[arg2] >= ~var18) {
                        if (~class421.field6390[arg2] > ~var18) {
                            class421.field6390[arg2] = var18;
                        }
                    } else {
                        class180.field2623[arg2] = var18;
                    }
                    int var19 = var12 << 7;
                    if (~var19 <= ~class16.field170[arg2]) {
                        if (var19 > class160.field2187[arg2]) {
                            class160.field2187[arg2] = var19;
                        }
                    } else {
                        class16.field170[arg2] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class240.field3908[class201.field3057][var9 + -1][var12] != var6) {
                        class212.field3628[var35] = class410.method2621(class410.method2621(var9 - 1, 1179648), -754974720);
                        class3.field35[var35] = class410.method2621(1245184, var12);
                        var35 = 4095 & var35 + 1;
                        class240.field3908[class201.field3057][var9 + -1][var12] = var6;
                    }
                    ++var12;
                    if (var12 < class197.field3038) {
                        if (var9 + -1 >= 0 && ~class240.field3908[class201.field3057][var9 + -1][var12] != ~var6 && ~(class416.field6309[class201.field3057][var9][var12] & 4) == -1 && ~(4 & class416.field6309[class201.field3057][var9 - 1][var12 + -1]) == -1) {
                            class212.field3628[var35] = class410.method2621(class410.method2621(1179648, var9 + -1), 1375731712);
                            class3.field35[var35] = class410.method2621(1245184, var12);
                            var35 = 4095 & var35 + 1;
                            class240.field3908[class201.field3057][var9 + -1][var12] = var6;
                        }
                        if (class240.field3908[class201.field3057][var9][var12] != var6) {
                            class212.field3628[var35] = class410.method2621(class410.method2621(var9, 5373952), 318767104);
                            class3.field35[var35] = class410.method2621(var12, 5439488);
                            class240.field3908[class201.field3057][var9][var12] = var6;
                            var35 = var35 + 1 & 4095;
                        }
                        if (~(var9 + 1) > ~class135.field1839 && class240.field3908[class201.field3057][var9 + 1][var12] != var6 && (4 & class416.field6309[class201.field3057][var9][var12]) == 0 && ~(class416.field6309[class201.field3057][var9 + 1][var12 - 1] & 4) == -1) {
                            class212.field3628[var35] = class410.method2621(-1845493760, class410.method2621(var9 - -1, 5373952));
                            class3.field35[var35] = class410.method2621(5439488, var12);
                            var35 = 4095 & var35 + 1;
                            class240.field3908[class201.field3057][var9 + 1][var12] = var6;
                        }
                    }
                    --var12;
                    if (~(var9 + 1) > ~class135.field1839 && class240.field3908[class201.field3057][var9 - -1][var12] != var6) {
                        class212.field3628[var35] = class410.method2621(1392508928, class410.method2621(9568256, var9 + 1));
                        class3.field35[var35] = class410.method2621(9633792, var12);
                        var35 = 4095 & var35 + 1;
                        class240.field3908[class201.field3057][var9 + 1][var12] = var6;
                    }
                    --var12;
                    if (~var12 <= -1) {
                        if (var9 + -1 >= 0 && ~class240.field3908[class201.field3057][var9 + -1][var12] != ~var6 && (class416.field6309[class201.field3057][var9][var12] & 4) == 0 && (class416.field6309[class201.field3057][var9 - 1][var12 - -1] & 4) == 0) {
                            class212.field3628[var35] = class410.method2621(class410.method2621(13762560, var9 - 1), 301989888);
                            class3.field35[var35] = class410.method2621(13828096, var12);
                            var35 = 4095 & var35 + 1;
                            class240.field3908[class201.field3057][var9 + -1][var12] = var6;
                        }
                        if (class240.field3908[class201.field3057][var9][var12] != var6) {
                            class212.field3628[var35] = class410.method2621(class410.method2621(var9, 13762560), -1828716544);
                            class3.field35[var35] = class410.method2621(13828096, var12);
                            var35 = 4095 & var35 + 1;
                            class240.field3908[class201.field3057][var9][var12] = var6;
                        }
                        if (~(var9 + 1) > ~class135.field1839 && class240.field3908[class201.field3057][var9 + 1][var12] != var6 && (4 & class416.field6309[class201.field3057][var9][var12]) == 0 && (class416.field6309[class201.field3057][var9 + 1][var12 + 1] & 4) == 0) {
                            class212.field3628[var35] = class410.method2621(class410.method2621(var9 - -1, 9568256), -771751936);
                            class3.field35[var35] = class410.method2621(9633792, var12);
                            var35 = 4095 & var35 + 1;
                            class240.field3908[class201.field3057][var9 - -1][var12] = var6;
                        }
                    }
                }
            }
            if (class279.field4424[arg2] != -1000000) {
                class279.field4424[arg2] += 10;
                class180.field2623[arg2] -= 50;
                class421.field6390[arg2] += 50;
                class160.field2187[arg2] += 50;
                class16.field170[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
    public class24() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZII)Lgi;")
    public static final class437 method150(boolean arg0, int arg1, int arg2) {
        ++field267;
        class437 var3 = class255.method1747(arg2, !arg0);
        if (!arg0) {
            field274 = null;
        }
        if (~arg1 == 0) {
            return var3;
        } else {
            return var3 != null && var3.field6675 != null && arg1 < var3.field6675.length ? var3.field6675[arg1] : null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        if (arg0 != -1) {
            field268 = -88;
        }
        ++field273;
        int[][] var3 = super.field3081.method1050(arg1, -101);
        if (super.field3081.field2432) {
            int[] var4 = this.method1376(1046794076, 2, arg1);
            int[][] var5 = this.method1382(0, arg1, -80);
            int[][] var6 = this.method1382(1, arg1, arg0 ^ 118);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class276.field4375 > var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = 4096 - var17;
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

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        if (!arg1) {
            method150(false, 100, 71);
        }
        ++field276;
        int[] var3 = super.field3064.method2452((byte) 22, arg0);
        if (super.field3064.field5837) {
            int[] var4 = this.method1376(1046794076, 0, arg0);
            int[] var5 = this.method1376(1046794076, 1, arg0);
            int[] var6 = this.method1376(1046794076, 2, arg0);
            for (int var7 = 0; ~var7 > ~class276.field4375; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 != 0) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)V")
    public static void method151(int arg0) {
        field269 = null;
        field272 = null;
        int var1 = 86 % ((50 - arg0) / 37);
        field274 = null;
        field270 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = 79 / ((-46 - arg1) / 50);
        if (arg2 == 0) {
            super.field3071 = ~arg0.method1445(56) == -2;
        }
        ++field277;
    }
}
