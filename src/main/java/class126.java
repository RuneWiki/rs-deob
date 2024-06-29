import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class126 extends class242 {

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "Lp;")
    private static class280 field2199 = class18.method140((byte) -121, "Examine");

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "Lp;")
    private static class280 field2201 = class18.method140((byte) -128, "Loading fonts )2 ");

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "Lp;")
    public static class280 field2207 = class18.method140((byte) -124, "mapflag");

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
    public static int field2213 = 0;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "Lp;")
    public static class280 field2205 = field2201;

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "Lp;")
    public static class280 field2214 = field2199;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "Lsb;")
    public static class221 field2203 = new class221(4);

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!pb", name = "eb", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "[I")
    public static int[] field2197;

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "[[I")
    public static int[][] field2204;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "(I)V")
    public static final void method868(int arg0) {
        class243.field4263 = null;
        class57.field915 = null;
        class97.field1562 = null;
        class124.field2172 = null;
        if (arg0 == -15434) {
            ++field2212;
            class182.field3178 = null;
            class16.field309 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field2200;
        int[] var3 = super.field4251.method1417((byte) 116, arg0);
        if (super.field4251.field3655) {
            class143.method986(var3, 0, class264.field4654, class117.field2106[arg0]);
        }
        int var4 = 69 % ((arg1 - 73) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ltg;Ltg;Z)V")
    public static final void method869(class180 arg0, class180 arg1, boolean arg2) {
        ++field2206;
        class236.field4109 = arg1;
        if (!arg2) {
            class263.field4645 = arg0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBIII)V")
    public static final void method870(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field2208;
        for (class23 var5 = (class23) class13.field259.method651(12916); var5 != null; var5 = (class23) class13.field259.method643(11066)) {
            class145.method1001(0, arg4, arg0, arg2, arg3, var5);
        }
        int var6 = -28 / ((45 - arg1) / 57);
        for (class23 var7 = (class23) class38.field678.method651(12916); var7 != null; var7 = (class23) class38.field678.method643(11066)) {
            byte var11 = 1;
            if (var7.field415.field4834 != var7.field415.field4803) {
                if (~var7.field415.field4803 == ~var7.field415.field4794) {
                    var11 = 2;
                }
            } else {
                var11 = 0;
            }
            if (var7.field412 != var11) {
                int var12 = class44.method339(var7.field415, (byte) 112);
                if (var7.field417 != var12) {
                    if (var7.field411 != null) {
                        class234.field4082.method1823(var7.field411);
                        var7.field411 = null;
                    }
                    var7.field417 = var12;
                }
                var7.field412 = var11;
            }
            var7.field424 = var7.field415.field4791;
            var7.field423 = var7.field415.field4791 + 64 * var7.field415.method984((byte) -34);
            var7.field430 = var7.field415.field4793;
            var7.field425 = var7.field415.field4793 - -(64 * var7.field415.method984((byte) -34));
            class145.method1001(0, arg4, arg0, arg2, arg3, var7);
        }
        for (class23 var8 = (class23) class83.field1370.method142(true); var8 != null; var8 = (class23) class83.field1370.method143((byte) -127)) {
            byte var9 = 1;
            if (var8.field418.field4834 == var8.field418.field4803) {
                var9 = 0;
            } else if (~var8.field418.field4803 == ~var8.field418.field4794) {
                var9 = 2;
            }
            if (~var8.field412 != ~var9) {
                int var10 = class68.method464(0, var8.field418);
                if (var8.field417 != var10) {
                    if (var8.field411 != null) {
                        class234.field4082.method1823(var8.field411);
                        var8.field411 = null;
                    }
                    var8.field417 = var10;
                }
                var8.field412 = var9;
            }
            var8.field424 = var8.field418.field4791;
            var8.field423 = var8.field418.field4791 - -(var8.field418.method984((byte) -34) * 64);
            var8.field430 = var8.field418.field4793;
            var8.field425 = var8.field418.field4793 - -(var8.field418.method984((byte) -34) * 64);
            class145.method1001(0, arg4, arg0, arg2, arg3, var8);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
    public static void method871(boolean arg0) {
        field2205 = null;
        field2204 = null;
        field2207 = null;
        field2201 = null;
        field2199 = null;
        field2203 = null;
        field2214 = null;
        if (!arg0) {
            field2197 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lil;Lil;I)V")
    public static final void method872(class161 arg0, class161 arg1, int arg2) {
        ++field2209;
        if (arg0.field2819 != null) {
            arg0.method1146(26159);
        }
        if (arg2 > 12) {
            arg0.field2828 = arg1;
            arg0.field2819 = arg1.field2819;
            arg0.field2819.field2828 = arg0;
            arg0.field2828.field2819 = arg0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class126() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lp;ZI)V")
    public static final void method873(class280 arg0, boolean arg1, int arg2) {
        ++field2210;
        class280 var3 = arg0.method1854(-66);
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; class231.field4015 > var6; ++var6) {
            class220 var9 = class23.method177((byte) -99, var6);
            if ((!arg1 || var9.field3799) && var9.field3801 == -1 && ~var9.field3802 == 0 && var9.field3791 == 0 && ~var9.field3818.method1854(-66).method1866(var3, (byte) -76) != 0) {
                if (~var5 <= -251) {
                    class59.field956 = null;
                    class83.field1364 = -1;
                    return;
                }
                if (~var4.length >= ~var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; ~var11 > ~var5; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class83.field1364 = var5;
        class59.field956 = var4;
        class280[] var7 = new class280[class83.field1364];
        class175.field3033 = 0;
        if (arg2 != -251) {
            field2199 = null;
        }
        for (int var8 = 0; class83.field1364 > var8; ++var8) {
            var7[var8] = class23.method177((byte) -120, var4[var8]).field3818;
        }
        class106.method742(var7, class59.field956, 14073);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZI)V")
    public static final void method874(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method869((class180) null, (class180) null, false);
        }
        class97.field1558 = -arg0 - -class243.field4268 + class74.field1222 + -1;
        ++field2198;
        class277.field4818 = -class113.field2023 + arg2;
        int var3 = -((int) ((float) class145.field2532.field1869 / class49.field809)) + class277.field4818;
        int var4 = (int) ((float) class145.field2532.field1869 / class49.field809) + class277.field4818;
        int var5 = class97.field1558 - (int) ((float) class145.field2532.field1995 / class49.field809);
        if (var3 < 0) {
            class277.field4818 = (int) ((float) class145.field2532.field1869 / class49.field809);
        }
        if (~class47.field779 > ~var4) {
            class277.field4818 = class47.field779 - (int) ((float) class145.field2532.field1869 / class49.field809);
        }
        int var6 = (int) ((float) class145.field2532.field1995 / class49.field809) + class97.field1558;
        if (~var5 > -1) {
            class97.field1558 = (int) ((float) class145.field2532.field1995 / class49.field809);
        }
        if (~class74.field1222 > ~var6) {
            class97.field1558 = -((int) ((float) class145.field2532.field1995 / class49.field809)) + class74.field1222;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lrk;IIIII)V")
    public static final void method875(class265 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class78.field1281 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class57.field928) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class86.field1411 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class162 var14 = class220.field3787[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class145.field2529[var11][var12 + 1][var13] + class145.field2529[var11][var12][var13] + class145.field2529[var11][var12][var13 + 1] + class145.field2529[var11][var12 + 1][var13 + 1]) / 4 - (class145.field2529[arg1][arg2 + 1][arg3] + class145.field2529[arg1][arg2][arg3] + class145.field2529[arg1][arg2][arg3 + 1] + class145.field2529[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class163 var16 = var14.field2849;
                                    if (var16 != null) {
                                        if (var16.field2870.method825()) {
                                            arg0.method827(var16.field2870, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2865 != null && var16.field2865.method825()) {
                                            arg0.method827(var16.field2865, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2841; ++var17) {
                                        class160 var18 = var14.field2845[var17];
                                        if (var18 != null && var18.field2811.method825() && (var18.field2814 == var12 || var7 == var12) && (var18.field2796 == var13 || var9 == var13)) {
                                            int var19 = var18.field2790 - var18.field2814 + 1;
                                            int var20 = var18.field2788 - var18.field2796 + 1;
                                            arg0.method827(var18.field2811, (var18.field2814 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2796 - arg3) * 128 + (var20 - arg5) * 64, var6);
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
}
