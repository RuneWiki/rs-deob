import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class178 extends class224 {

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    private int field2774 = 32768;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "[I")
    public static int[] field2775 = new int[1000];

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "[I")
    public static int[] field2777 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2771 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2780 = "Select";

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field2781 = 0;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "Ljava/lang/String;")
    public static String field2782 = "red:";

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "[I")
    public static int[] field2783 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "[I")
    public static int[] field2785 = new int[99];

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "S")
    public static short field2786 = 256;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "[[[B")
    public static byte[][][] field2787;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZZ)Ljava/lang/String;")
    public static final String method1238(int arg0, boolean arg1, boolean arg2) {
        ++field2778;
        if (arg2 && ~arg0 <= -1) {
            return !arg1 ? null : class202.method1388(arg2, arg1, 10, arg0);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 >= -4) {
            this.field2774 = 16;
        }
        class189.method1329(21822);
        ++field2779;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 > -46) {
            method1240(39, (class25) null);
        }
        ++field2772;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field3624 = arg0.method201(255) == 1;
            }
        } else {
            this.field2774 = arg0.method190(-3) << 4;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1239(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++class31.field420;
        class79.field1141 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class151.field2240; var12 < class194.field3046; ++var12) {
            class49[][] var38 = class90.field1382[var12];
            for (int var39 = class110.field1674; var39 < class131.field1922; ++var39) {
                for (int var40 = class60.field846; var40 < class102.field1584; ++var40) {
                    class49 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class17.field197[var39 - class72.field1010 + class33.field429][var40 - class173.field2721 + class33.field429] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field642 = true;
                            var41.field649 = true;
                            if (var41.field639 > 0) {
                                var41.field629 = true;
                            } else {
                                var41.field629 = false;
                            }
                            ++class79.field1141;
                        } else {
                            var41.field642 = false;
                            var41.field649 = false;
                            var41.field651 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field627 != null) {
                                    class69 var42 = var41.field627;
                                    var42.field963.method370(0, var12, var42.field976, var42.field970, var42.field964);
                                    if (var42.field965 != null) {
                                        var42.field965.method370(0, var12, var42.field976, var42.field970, var42.field964);
                                    }
                                }
                                if (var41.field631 != null) {
                                    class264 var43 = var41.field631;
                                    var43.field4266.method370(var43.field4259, var12, var43.field4248, var43.field4252, var43.field4258);
                                    if (var43.field4261 != null) {
                                        var43.field4261.method370(var43.field4259, var12, var43.field4248, var43.field4252, var43.field4258);
                                    }
                                }
                                if (var41.field635 != null) {
                                    class17 var44 = var41.field635;
                                    var44.field203.method370(0, var12, var44.field206, var44.field210, var44.field207);
                                }
                                if (var41.field643 != null) {
                                    for (int var45 = 0; var45 < var41.field639; ++var45) {
                                        class284 var46 = var41.field643[var45];
                                        var46.field4500.method370(var46.field4507, var12, var46.field4502, var46.field4511, var46.field4495);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class235.field3772 == class200.field3128;
        for (int var14 = class151.field2240; var14 < class194.field3046; ++var14) {
            class49[][] var27 = class90.field1382[var14];
            for (int var28 = -class33.field429; var28 <= 0; ++var28) {
                int var29 = class72.field1010 + var28;
                int var30 = class72.field1010 - var28;
                if (var29 >= class110.field1674 || var30 < class131.field1922) {
                    for (int var31 = -class33.field429; var31 <= 0; ++var31) {
                        int var32 = class173.field2721 + var31;
                        int var33 = class173.field2721 - var31;
                        if (var29 >= class110.field1674) {
                            if (var32 >= class60.field846) {
                                class49 var34 = var27[var29][var32];
                                if (var34 != null && var34.field642) {
                                    class87.method596(var34, true);
                                }
                            }
                            if (var33 < class102.field1584) {
                                class49 var35 = var27[var29][var33];
                                if (var35 != null && var35.field642) {
                                    class87.method596(var35, true);
                                }
                            }
                        }
                        if (var30 < class131.field1922) {
                            if (var32 >= class60.field846) {
                                class49 var36 = var27[var30][var32];
                                if (var36 != null && var36.field642) {
                                    class87.method596(var36, true);
                                }
                            }
                            if (var33 < class102.field1584) {
                                class49 var37 = var27[var30][var33];
                                if (var37 != null && var37.field642) {
                                    class87.method596(var37, true);
                                }
                            }
                        }
                        if (class79.field1141 == 0) {
                            if (!var13) {
                                class78.field1109 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class151.field2240; var15 < class194.field3046; ++var15) {
            class49[][] var16 = class90.field1382[var15];
            for (int var17 = -class33.field429; var17 <= 0; ++var17) {
                int var18 = class72.field1010 + var17;
                int var19 = class72.field1010 - var17;
                if (var18 >= class110.field1674 || var19 < class131.field1922) {
                    for (int var20 = -class33.field429; var20 <= 0; ++var20) {
                        int var21 = class173.field2721 + var20;
                        int var22 = class173.field2721 - var20;
                        if (var18 >= class110.field1674) {
                            if (var21 >= class60.field846) {
                                class49 var23 = var16[var18][var21];
                                if (var23 != null && var23.field642) {
                                    class87.method596(var23, false);
                                }
                            }
                            if (var22 < class102.field1584) {
                                class49 var24 = var16[var18][var22];
                                if (var24 != null && var24.field642) {
                                    class87.method596(var24, false);
                                }
                            }
                        }
                        if (var19 < class131.field1922) {
                            if (var21 >= class60.field846) {
                                class49 var25 = var16[var19][var21];
                                if (var25 != null && var25.field642) {
                                    class87.method596(var25, false);
                                }
                            }
                            if (var22 < class102.field1584) {
                                class49 var26 = var16[var19][var22];
                                if (var26 != null && var26.field642) {
                                    class87.method596(var26, false);
                                }
                            }
                        }
                        if (class79.field1141 == 0) {
                            if (!var13) {
                                class78.field1109 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class78.field1109 = false;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            field2782 = null;
        }
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int[] var4 = this.method1527(arg0, 1, (byte) 84);
            int[] var5 = this.method1527(arg0, 2, (byte) 84);
            for (int var6 = 0; var6 < class78.field1108; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field2774 >> 12;
                int var9 = class262.field4243[var7] * var8 >> 12;
                int var10 = class216.field3527[var7] * var8 >> 12;
                int var11 = class206.field3220 & (var10 >> 12) + var6;
                int var12 = (var9 >> 12) + arg0 & class261.field4217;
                int[] var13 = this.method1527(var12, 0, (byte) 84);
                var3[var6] = var13[var11];
            }
        }
        ++field2770;
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class178() {
        super(3, false);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field2776;
        if (arg1 != 1) {
            method1242(false);
        }
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042) {
            int[] var4 = this.method1527(arg0, 1, (byte) 84);
            int[] var5 = this.method1527(arg0, 2, (byte) 84);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class78.field1108; ++var9) {
                int var10 = (1046225 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field2774 >> 12;
                int var12 = class262.field4243[var10] * var11 >> 12;
                int var13 = class216.field3527[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + arg0 & class261.field4217;
                int var15 = class206.field3220 & var9 - -(var13 >> 12);
                int[][] var16 = this.method1532(81, 0, var14);
                var7[var9] = var16[0][var15];
                var6[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILlj;)V")
    public static final void method1240(int arg0, class25 arg1) {
        if (arg0 >= 55) {
            ++field2773;
            while (true) {
                while (~arg1.field339.length < ~arg1.field349) {
                    int var2 = 0;
                    boolean var3 = false;
                    int var4 = 0;
                    if (arg1.method201(255) == 1) {
                        var2 = arg1.method201(255);
                        var3 = true;
                        var4 = arg1.method201(255);
                    }
                    int var5 = arg1.method201(255);
                    int var6 = arg1.method201(255);
                    int var7 = var5 * 64 + -class47.field599;
                    int var8 = class104.field1611 + -1 + class120.field1751 + -(var6 * 64);
                    if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class165.field2565 && ~var8 > ~class104.field1611) {
                        int var9 = var7 >> 6;
                        int var10 = var8 >> 6;
                        for (int var11 = 0; ~var11 > -65; ++var11) {
                            for (int var12 = 0; ~var12 > -65; ++var12) {
                                if (!var3 || ~var11 <= ~(var2 * 8) && ~(var2 * 8 + 8) < ~var11 && ~(var4 * 8) >= ~var12 && var4 * 8 + 8 > var12) {
                                    byte var13 = arg1.method188(-98);
                                    if (var13 != 0) {
                                        if (class173.field2711[var9][var10] == null) {
                                            class173.field2711[var9][var10] = new byte[4096];
                                        }
                                        class173.field2711[var9][var10][(-var12 + 63 << 6) + var11] = var13;
                                        byte var14 = arg1.method188(20);
                                        if (class126.field1868[var9][var10] == null) {
                                            class126.field1868[var9][var10] = new byte[4096];
                                        }
                                        class126.field1868[var9][var10][(63 - var12 << 6) - -var11] = var14;
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var15 = 0; var15 < (var3 ? 64 : 4096); ++var15) {
                            byte var16 = arg1.method188(-111);
                            if (~var16 != -1) {
                                ++arg1.field349;
                            }
                        }
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
    public static void method1241(int arg0) {
        field2780 = null;
        field2783 = null;
        field2787 = null;
        if (arg0 != 1) {
            field2771 = null;
        }
        field2771 = null;
        field2775 = null;
        field2785 = null;
        field2777 = null;
        field2782 = null;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(Z)V")
    public static final void method1242(boolean arg0) {
        if (arg0) {
            method1238(17, true, false);
        }
        ++field2769;
        class248.field3960.method1420(-1);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2785[var1] = var0 / 4;
        }
    }
}
