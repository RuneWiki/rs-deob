import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class49 extends class220 {

    @OriginalMember(owner = "client!ip", name = "V", descriptor = "[I")
    public static int[] field691 = new int[50];

    @OriginalMember(owner = "client!ip", name = "P", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!ip", name = "Q", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ip", name = "R", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!ip", name = "S", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!ip", name = "T", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ip", name = "U", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!ip", name = "W", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(II)V")
    public static final void method338(int arg0, int arg1) {
        ++field687;
        int var2 = 15 / ((-10 - arg0) / 61);
        class256 var3 = class363.method2385(3, arg1, (byte) 1);
        var3.method1611(-58);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg1 == -49) {
            if (~arg0 == -1) {
                super.field3131 = arg2.method1697(arg1 + 169) == 1;
            }
            ++field689;
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(III)V")
    private final void method339(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method340((class249) null, (byte) 80, 54);
        }
        ++field690;
        int var4 = class160.field2096[arg0];
        int var5 = class58.field831[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class324.field4658 = arg0;
            class284.field4154 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class284.field4154 = arg0;
            class324.field4658 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class284.field4154 = arg0;
            class324.field4658 = -arg2 + class344.field5043;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class324.field4658 = arg0;
            class284.field4154 = -arg2 + class110.field1518;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class284.field4154 = -arg2 + class110.field1518;
            class324.field4658 = class344.field5043 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class324.field4658 = -arg2 + class344.field5043;
            class284.field4154 = class110.field1518 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class324.field4658 = arg2;
            class284.field4154 = class110.field1518 - arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class284.field4154 = arg2;
            class324.field4658 = -arg0 + class344.field5043;
        }
        class324.field4658 &= class392.field5887;
        class284.field4154 &= class315.field4510;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
    public class49() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lro;BI)I")
    public static final int method340(class249 arg0, byte arg1, int arg2) {
        ++field688;
        if (!client.method1572(arg0).method1141(arg2, (byte) -118) && arg0.field3632 == null) {
            return -1;
        } else {
            int var3 = 101 % ((39 - arg1) / 60);
            return arg0.field3482 != null && ~arg0.field3482.length < ~arg2 ? arg0.field3482[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field692;
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (arg1 != 0) {
            return null;
        } else {
            if (super.field3135.field4087) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; class344.field5043 > var7; ++var7) {
                    this.method339(var7, ~arg1, arg0);
                    int[][] var8 = this.method1369(0, (byte) 115, class284.field4154);
                    var4[var7] = var8[0][class324.field4658];
                    var5[var7] = var8[1][class324.field4658];
                    var6[var7] = var8[2][class324.field4658];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)V")
    public static void method341(int arg0) {
        if (arg0 == 2) {
            field691 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field686;
        if (arg0 != -11543) {
            field691 = null;
        }
        int[] var3 = super.field3125.method2005(arg1, (byte) 97);
        if (super.field3125.field4676) {
            for (int var4 = 0; ~var4 > ~class344.field5043; ++var4) {
                this.method339(var4, -1, arg1);
                int[] var5 = this.method1366(0, (byte) -40, class284.field4154);
                var3[var4] = var5[class324.field4658];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZZ)V")
    public static final void method342(boolean arg0, boolean arg1) {
        ++field685;
        int[] var2 = null;
        byte var3;
        byte[][] var4;
        if (!arg1) {
            var3 = 4;
            var4 = class240.field3383;
        } else {
            var3 = 1;
            var4 = class387.field5785;
        }
        if (!arg0) {
            for (int var5 = 0; var3 > var5; ++var5) {
                class87.method540(-122);
                for (int var6 = 0; ~var6 > ~(class324.field4652 >> 3); ++var6) {
                    for (int var7 = 0; ~var7 > ~(class336.field4964 >> 3); ++var7) {
                        boolean var8 = false;
                        int var9 = class445.field6484[var5][var6][var7];
                        if (var9 != -1) {
                            int var10 = (var9 & 65928306) >> 24;
                            if (!arg1 || ~var10 == -1) {
                                int var11 = (var9 & 6) >> 1;
                                int var12 = 1023 & var9 >> 14;
                                int var13 = var9 >> 3 & 2047;
                                int var14 = (var12 / 8 << 8) - -(var13 / 8);
                                for (int var15 = 0; ~var15 > ~class106.field1417.length; ++var15) {
                                    if (class106.field1417[var15] == var14 && var4[var15] != null) {
                                        int[] var16 = class364.method2387(class119.field1605, var12, arg1, var10, var7 * 8, var4[var15], var11, var13, var5, -27837, var6 * 8, class35.field574);
                                        if (var2 == null && var16 != null) {
                                            var2 = var16;
                                        }
                                        var8 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (!var8) {
                            class91.method565(8, var7 * 8, 8, -22467, var5, var6 * 8);
                        }
                    }
                }
            }
            if (var2 == null) {
                class94.field1305 = null;
            } else {
                class94.field1305 = class277.method1769(var2[0], var2[1], var2[3], (byte) 104, var2[2]);
                class179.field2350 = var2[4];
            }
        }
    }
}
