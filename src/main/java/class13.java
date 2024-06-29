import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 extends class129 {

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    private final int field238;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    private final int field243;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    private final int field248;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    private final int field239;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    private final int field246;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    private final int field237;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    private final int field253;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "I")
    private final int field244;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "Lcc;")
    public static class209 field249 = class95.method669(95, "<)4col>");

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "Lcc;")
    public static class209 field247 = class95.method669(96, "hitbar_default");

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "Lcc;")
    public static class209 field234 = class95.method669(127, "_labels");

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Lsj;")
    public static class49 field235;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
    public final void method96(int arg0, int arg1, int arg2) {
        int var4 = 60 / ((arg2 - 37) / 32);
        ++field240;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)Z")
    public static final boolean method97(int arg0, int arg1) {
        if (arg0 <= 36) {
            field249 = null;
        }
        ++field236;
        return ~(arg1 >> 21 & 1) != -1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lcc;Z)V")
    public static final void method98(class209 arg0, boolean arg1) {
        ++field242;
        if (~class198.field3550 <= -3) {
            if (arg0.method1483(class200.field3588, (byte) -80)) {
                class122.method895(true);
                for (int var2 = 0; ~var2 > -11; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class238.method1649((byte) -118, (class209) null, 0, class229.method1604(new class209[] { class44.field878, class66.method485(var4, (byte) 44), class28.field510 }, (byte) 75));
            }
            if (arg0.method1483(class60.field1211, (byte) -29)) {
                class64.method475(50);
            }
            if (arg0.method1483(class109.field2185, (byte) -56)) {
                class265.field4759.method1376(4);
            }
            if (arg0.method1483(class216.field3892, (byte) -102)) {
                class265.field4759.method1393(-2);
            }
            if (arg0.method1483(class164.field2972, (byte) -123)) {
                class230.field4187.method1000(-117);
                class193.field3488.method1923(-45);
                class265.field4759.method1392(0);
            }
            if (arg0.method1483(class173.field3155, (byte) -65)) {
                class76.field1429 = true;
            }
            if (arg0.method1483(class76.field1430, (byte) -99)) {
                class155.method1088(25, -3280);
            }
            if (arg0.method1483(class42.field775, (byte) -102)) {
                class266.field4777 = true;
            }
            if (arg0.method1483(class243.field4398, (byte) -35)) {
                class266.field4777 = false;
            }
            if (arg0.method1483(class224.field4092, (byte) -101)) {
                for (int var5 = 0; var5 < 4; ++var5) {
                    for (int var6 = 1; ~var6 > -104; ++var6) {
                        for (int var7 = 1; var7 < 103; ++var7) {
                            class122.field2404[var5].field3103[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method1472(class75.field1400, 0) && ~class100.field1945 != -1) {
                class220.method1549(arg0.method1461(-44, 6).method1477((byte) 126), 1000);
            }
            if (arg0.method1483(class99.field1924, (byte) -124) && ~class100.field1945 == -3) {
                throw new RuntimeException();
            }
            if (arg0.method1472(class215.field3882, 0)) {
                field251 = arg0.method1461(-55, 12).method1454(87).method1477((byte) 114);
                class238.method1649((byte) -119, (class209) null, 0, class229.method1604(new class209[] { class257.field4658, class66.method485(field251, (byte) 40) }, (byte) 107));
            }
            if (arg0.method1483(class190.field3451, (byte) -107)) {
                class70.field1332 = true;
            }
        }
        if (!arg1) {
            field235 = null;
        }
        ++class160.field2907;
        class84.field1677.method287((byte) 123, 215);
        class84.field1677.method773(-6385, arg0.method1486(5) + -1);
        class84.field1677.method745(arg0.method1461(-118, 2), (byte) -91);
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field238 = arg0;
        this.field243 = arg3;
        this.field248 = arg2;
        this.field239 = arg6;
        this.field246 = arg4;
        this.field237 = arg7;
        this.field253 = arg5;
        this.field244 = arg1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZI)Lcc;")
    public static final class209 method99(int arg0, boolean arg1, int arg2) {
        ++field250;
        int var3 = -arg0 + arg2;
        if (~var3 > 8) {
            return class176.field3207;
        } else if (var3 < -6) {
            return class231.field4196;
        } else if (var3 < -3) {
            return class289.field5102;
        } else if (~var3 > -1) {
            return class279.field4896;
        } else if (!arg1) {
            return null;
        } else if (~var3 < -10) {
            return class19.field375;
        } else if (var3 > 6) {
            return class249.field4498;
        } else if (var3 > 3) {
            return class252.field4535;
        } else {
            return var3 > 0 ? class256.field4624 : class14.field259;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(III)V")
    public final void method100(int arg0, int arg1, int arg2) {
        ++field252;
        if (arg1 != 100) {
            field235 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ltf;B)V")
    public static final void method101(class106 arg0, byte arg1) {
        ++field241;
        if (arg1 < -108) {
            while (true) {
                while (arg0.field2085 < arg0.field2108.length) {
                    int var2 = 0;
                    boolean var3 = false;
                    int var4 = 0;
                    if (arg0.method774((byte) 123) == 1) {
                        var3 = true;
                        var4 = arg0.method774((byte) 103);
                        var2 = arg0.method774((byte) 112);
                    }
                    int var5 = arg0.method774((byte) 80);
                    int var6 = arg0.method774((byte) 74);
                    int var7 = var5 * 64 + -class38.field654;
                    int var8 = class98.field1921 + class224.field4082 + -(var6 * 64) + -1;
                    if (~var7 <= -1 && ~(var8 + -63) <= -1 && ~(var7 + 63) > ~class59.field1194 && ~class98.field1921 < ~var8) {
                        int var9 = var7 >> 6;
                        int var10 = var8 >> 6;
                        for (int var11 = 0; ~var11 > -65; ++var11) {
                            for (int var12 = 0; var12 < 64; ++var12) {
                                if (!var3 || var11 >= var4 * 8 && ~(var4 * 8 + 8) < ~var11 && var12 >= var2 * 8 && var2 * 8 + 8 > var12) {
                                    int var13 = arg0.method774((byte) 120);
                                    if (~var13 != -1) {
                                        if ((var13 & 1) == 1) {
                                            int var14 = arg0.method774((byte) 99);
                                            if (class87.field1737[var9][var10] == null) {
                                                class87.field1737[var9][var10] = new byte[4096];
                                            }
                                            class87.field1737[var9][var10][(-var12 + 63 << 6) + var11] = (byte) var14;
                                        }
                                        if (~(var13 & 2) == -3) {
                                            int var15 = arg0.method736(124);
                                            if (class1.field23[var9][var10] == null) {
                                                class1.field23[var9][var10] = new short[4096];
                                            }
                                            class1.field23[var9][var10][(-var12 + 63 << 6) + var11] = (short) var15;
                                        }
                                        if (~(4 & var13) == -5) {
                                            int var16 = ((arg0.method774((byte) 74) & 255) << 16) - -((arg0.method774((byte) 76) & 255) << 8) + (255 & arg0.method774((byte) 88));
                                            if (class147.field2702[var9][var10] == null) {
                                                class147.field2702[var9][var10] = new int[4096];
                                            }
                                            --var16;
                                            class218 var17 = class245.method1711(27093, var16);
                                            if (var17.field3917 != null) {
                                                var17 = var17.method1535((byte) 109);
                                                if (var17 == null || ~var17.field3944 == 0) {
                                                    continue;
                                                }
                                            }
                                            class147.field2702[var9][var10][(63 - var12 << 6) + var11] = var17.field3952 - -1;
                                            class214 var18 = new class214();
                                            var18.field3867 = var8;
                                            var18.field3863 = var7;
                                            var18.field3864 = var17.field3944;
                                            class158.field2885.method1123(var18, (byte) -127);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var19 = 0; ~(var3 ? 64 : 4096) < ~var19; ++var19) {
                            int var20 = arg0.method774((byte) 86);
                            if (var20 != 0) {
                                if ((var20 & 1) == 1) {
                                    ++arg0.field2085;
                                }
                                if ((2 & var20) == 2) {
                                    arg0.field2085 += 2;
                                }
                                if ((4 & var20) == 4) {
                                    arg0.field2085 += 3;
                                }
                            }
                        }
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static void method102(byte arg0) {
        field249 = null;
        field234 = null;
        field247 = null;
        field235 = null;
        if (arg0 >= -57) {
            field251 = -30;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)V")
    public final void method103(int arg0, int arg1, int arg2) {
        ++field254;
        int var4 = this.field238 * arg1 >> 12;
        int var5 = this.field243 * arg2 >> 12;
        int var6 = this.field248 * arg1 >> 12;
        int var7 = this.field244 * arg2 >> 12;
        int var8 = this.field246 * arg1 >> 12;
        int var9 = this.field253 * arg2 >> 12;
        int var10 = this.field237 * arg2 >> 12;
        int var11 = this.field239 * arg1 >> 12;
        class93.method649(var5, var11, var4, super.field2481, (byte) 108, var10, var7, var6, var9, var8);
        if (arg0 > -106) {
            field247 = null;
        }
    }
}
