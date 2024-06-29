import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class54 extends class260 {

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    private int field1131 = 12288;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    private int field1136 = 0;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    private int field1134 = 4096;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    private int field1139 = 0;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    private int field1137 = 2048;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    private int field1145 = 2048;

    @OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
    private int field1149 = 8192;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    public static int field1143 = 0;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "Loh;")
    public static class263 field1135 = class253.method1681(-121, "<)4col>");

    @OriginalMember(owner = "client!i", name = "X", descriptor = "Z")
    public static boolean field1142 = false;

    @OriginalMember(owner = "client!i", name = "fb", descriptor = "I")
    public static int field1150 = 0;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!i", name = "db", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!i", name = "hb", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!i", name = "ib", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!i", name = "gb", descriptor = "Lue;")
    public static class86 field1151;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lnj;IIIII)V")
    public static final void method342(class139 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class7.field120 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class254.field4425) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class85.field1678 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class2 var14 = class18.field417[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class112.field2102[var11][var12 + 1][var13] + class112.field2102[var11][var12][var13] + class112.field2102[var11][var12][var13 + 1] + class112.field2102[var11][var12 + 1][var13 + 1]) / 4 - (class112.field2102[arg1][arg2 + 1][arg3] + class112.field2102[arg1][arg2][arg3] + class112.field2102[arg1][arg2][arg3 + 1] + class112.field2102[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class22 var16 = var14.field43;
                                    if (var16 != null) {
                                        if (var16.field633.method905()) {
                                            arg0.method909(var16.field633, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field641 != null && var16.field641.method905()) {
                                            arg0.method909(var16.field641, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field27; ++var17) {
                                        class70 var18 = var14.field37[var17];
                                        if (var18 != null && var18.field1398.method905() && (var18.field1405 == var12 || var7 == var12) && (var18.field1403 == var13 || var9 == var13)) {
                                            int var19 = var18.field1418 - var18.field1405 + 1;
                                            int var20 = var18.field1413 - var18.field1403 + 1;
                                            arg0.method909(var18.field1398, (var18.field1405 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1403 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)Z")
    private final boolean method343(int arg0, int arg1, byte arg2) {
        ++field1138;
        int var4 = (arg1 - -arg0) * this.field1131 >> 12;
        if (arg2 != 34) {
            return false;
        } else {
            int var5 = class251.field4374[var4 * 255 >> 12 & 255];
            int var6 = (var5 << 12) / this.field1131;
            int var7 = (var6 << 12) / this.field1149;
            int var8 = this.field1134 * var7 >> 12;
            return arg1 - arg0 < var8 && -arg0 + arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        if (arg0 >= 81) {
            ++field1147;
            class217.method1481((byte) -127);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (arg1 == 5701) {
            ++field1140;
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (arg0 != 3) {
                            if (arg0 != 4) {
                                if (arg0 != 5) {
                                    if (~arg0 == -7) {
                                        this.field1149 = arg2.method1294((byte) 3);
                                    }
                                } else {
                                    this.field1134 = arg2.method1294((byte) 3);
                                }
                            } else {
                                this.field1131 = arg2.method1294((byte) 3);
                            }
                        } else {
                            this.field1145 = arg2.method1294((byte) 3);
                        }
                    } else {
                        this.field1136 = arg2.method1294((byte) 3);
                    }
                } else {
                    this.field1139 = arg2.method1294((byte) 3);
                }
            } else {
                this.field1137 = arg2.method1294((byte) 3);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class54() {
        super(0, true);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
    public static final void method344(byte arg0) {
        ++field1141;
        int var1 = -100 / ((arg0 - 67) / 44);
        if (class13.field346 != null) {
            class16 var2 = class13.field346;
            synchronized (class13.field346) {
                class13.field346 = null;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
    public static void method345(int arg0) {
        if (arg0 < -114) {
            field1151 = null;
            field1135 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZI)Z")
    private final boolean method346(int arg0, boolean arg1, int arg2) {
        ++field1148;
        int var4 = (-arg0 + arg2) * this.field1131 >> 12;
        int var5 = class251.field4374[(1045618 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field1131;
        int var7 = (var6 << 12) / this.field1149;
        int var8 = this.field1134 * var7 >> 12;
        if (!arg1) {
            return false;
        } else {
            return ~var8 < ~(arg0 + arg2) && -var8 < arg0 + arg2;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field1152;
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            int var4 = class275.field4825[arg0] + -2048;
            for (int var5 = 0; ~class49.field1052 < ~var5; ++var5) {
                int var6 = class70.field1409[var5] + -2048;
                int var7 = this.field1137 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = this.field1139 + var4;
                int var10 = var9 < -2048 ? var9 - -4096 : var9;
                int var11 = var8 <= 2048 ? var8 : var8 + -4096;
                int var12 = var6 - -this.field1136;
                int var13 = var12 >= -2048 ? var12 : var12 + 4096;
                int var14 = var13 > 2048 ? var13 + -4096 : var13;
                int var15 = var10 > 2048 ? var10 + -4096 : var10;
                int var16 = this.field1145 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = ~var17 >= -2049 ? var17 : var17 - 4096;
                var3[var5] = !this.method346(var11, true, var15) && !this.method343(var14, var18, (byte) 34) ? 0 : 4096;
            }
        }
        if (arg1 != 255) {
            this.field1139 = 8;
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)Lm;")
    public static final class113 method347(int arg0, byte arg1) {
        ++field1144;
        if (arg1 >= -78) {
            return null;
        } else {
            class113 var2 = (class113) class190.field3414.method1464((byte) 41, (long) arg0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class182.field3303.method596(117, arg0, 0);
                if (var3 == null) {
                    return null;
                } else {
                    class113 var4 = new class113();
                    class194 var5 = new class194(var3);
                    var5.field3497 = var5.field3469.length + -2;
                    int var6 = var5.method1294((byte) 3);
                    int var7 = -var6 + -2 + -12 + var5.field3469.length;
                    var5.field3497 = var7;
                    int var8 = var5.method1266(4);
                    var4.field2117 = var5.method1294((byte) 3);
                    var4.field2116 = var5.method1294((byte) 3);
                    var4.field2114 = var5.method1294((byte) 3);
                    var4.field2119 = var5.method1294((byte) 3);
                    int var9 = var5.method1301(-8317);
                    if (var9 > 0) {
                        var4.field2118 = new class5[var9];
                        for (int var10 = 0; var10 < var9; ++var10) {
                            int var11 = var5.method1294((byte) 3);
                            class5 var12 = new class5(class143.method943(1487780168, var11));
                            var4.field2118[var10] = var12;
                            while (var11-- > 0) {
                                int var13 = var5.method1266(4);
                                int var14 = var5.method1266(4);
                                var12.method33(new class182(var14), (long) var13, -120);
                            }
                        }
                    }
                    var5.field3497 = 0;
                    var4.field2120 = var5.method1302(-17617);
                    int var15 = 0;
                    var4.field2123 = new int[var8];
                    var4.field2112 = new int[var8];
                    var4.field2113 = new class263[var8];
                    while (~var7 < ~var5.field3497) {
                        int var16 = var5.method1294((byte) 3);
                        if (~var16 == -4) {
                            var4.field2113[var15] = var5.method1320(false);
                        } else if (var16 < 100 && var16 != 21 && var16 != 38 && var16 != 39) {
                            var4.field2123[var15] = var5.method1266(4);
                        } else {
                            var4.field2123[var15] = var5.method1301(-8317);
                        }
                        var4.field2112[var15++] = var16;
                    }
                    class190.field3414.method1472((byte) -29, (long) arg0, var4);
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)I")
    public static final int method348(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 3282) {
            method345(-127);
        }
        ++field1153;
        if ((8 & class77.field1576[arg3][arg2][arg0]) != 0) {
            return 0;
        } else {
            return ~arg3 < -1 && ~(2 & class77.field1576[1][arg2][arg0]) != -1 ? arg3 + -1 : arg3;
        }
    }
}
