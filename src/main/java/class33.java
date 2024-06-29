import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class33 extends class117 {

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field506 = 0;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "Lmd;")
    public static class12 field502 = new class12(5000);

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "Ltj;")
    public static class208 field510 = new class208();

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
    public static int field513 = 0;

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "Lhh;")
    private static class163 field514 = class137.method1065("Select", 17);

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "Lhh;")
    public static class163 field512 = field514;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "[Lef;")
    private class246[] field501;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([[II)V")
    private final void method191(int[][] arg0, int arg1) {
        ++field505;
        int var3 = class143.field2702;
        int var4 = class1.field26;
        class155.method1151(arg0, (byte) -107);
        if (arg1 == -31446) {
            class149.method1112(0, class54.field884, class258.field4520, 0, (byte) 123);
            if (this.field501 != null) {
                for (int var5 = 0; ~this.field501.length < ~var5; ++var5) {
                    class246 var6 = this.field501[var5];
                    int var7 = var6.field4333;
                    int var8 = var6.field4342;
                    if (var7 < 0) {
                        if (~var8 <= -1) {
                            var6.method44((byte) 6, var3, var4);
                        }
                    } else if (var8 >= 0) {
                        var6.method42(-97, var3, var4);
                    } else {
                        var6.method46(var3, 2, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)V")
    public static void method192(byte arg0) {
        if (arg0 > -119) {
            field511 = 3;
        }
        field502 = null;
        field514 = null;
        field510 = null;
        field512 = null;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V")
    public static final void method193(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class7.field126; ++var3) {
            for (int var4 = 0; var4 < class58.field948; ++var4) {
                for (int var5 = 0; var5 < class106.field2033; ++var5) {
                    class144 var6 = class259.field4542[var3][var4][var5];
                    if (var6 != null) {
                        class159 var7 = var6.field2731;
                        if (var7 != null && var7.field2930.method295()) {
                            class120.method940(var7.field2930, var3, var4, var5, 1, 1);
                            if (var7.field2932 != null && var7.field2932.method295()) {
                                class120.method940(var7.field2932, var3, var4, var5, 1, 1);
                                var7.field2930.method306(var7.field2932, 0, 0, 0, false);
                                var7.field2932 = var7.field2932.method284(arg0, arg1, arg2);
                            }
                            var7.field2930 = var7.field2930.method284(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2741; ++var8) {
                            class132 var10 = var6.field2746[var8];
                            if (var10 != null && var10.field2558.method295()) {
                                class120.method940(var10.field2558, var3, var4, var5, var10.field2565 - var10.field2555 + 1, var10.field2551 - var10.field2550 + 1);
                                var10.field2558 = var10.field2558.method284(arg0, arg1, arg2);
                            }
                        }
                        class211 var9 = var6.field2736;
                        if (var9 != null && var9.field3828.method295()) {
                            class151.method1124(var9.field3828, var3, var4, var5);
                            var9.field3828 = var9.field3828.method284(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
    public static final int method194(boolean arg0) {
        ++field503;
        if (!arg0) {
            method194(false);
        }
        return class247.field4371;
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)V")
    public static final void method195(byte arg0) {
        int var1 = class216.field3932.method568(class265.field4615);
        ++field499;
        for (int var2 = 0; ~class202.field3647 < ~var2; ++var2) {
            int var6 = class216.field3932.method568(class110.method882((byte) -55, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        class239.field4247 = class202.field3647 * 15 + 22;
        if (arg0 >= 73) {
            class130.field2530 = true;
            int var3 = class202.field3647 * 15 + 21;
            var1 += 8;
            int var4 = class265.field4604;
            int var5 = -(var1 / 2) + class84.field1598;
            if (var1 + var5 > class233.field4160) {
                var5 = -var1 + class233.field4160;
            }
            if (var3 + var4 > class205.field3706) {
                var4 = -var3 + class205.field3706;
            }
            if (~var4 > -1) {
                var4 = 0;
            }
            class153.field2867 = var1;
            class14.field221 = var4;
            if (var5 < 0) {
                var5 = 0;
            }
            class190.field3484 = var5;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 != 0) {
            field514 = null;
        }
        if (~arg1 == -1) {
            this.field501 = new class246[arg2.method622(true)];
            for (int var4 = 0; var4 < this.field501.length; ++var4) {
                int var5 = arg2.method622(true);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field501[var4] = class102.method813(arg2, arg0 + 113);
                            }
                        } else {
                            this.field501[var4] = class245.method1687(arg2, (byte) 121);
                        }
                    } else {
                        this.field501[var4] = class104.method843(arg2, -24011);
                    }
                } else {
                    this.field501[var4] = class186.method1378(arg2, (byte) 36);
                }
            }
        } else if (arg1 == 1) {
            super.field2208 = arg2.method622(true) == 1;
        }
        ++field507;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class33() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field500;
        int[] var3 = super.field2218.method1044(arg1, arg0 ^ arg0);
        if (super.field2218.field2587) {
            this.method191(super.field2218.method1046(true), arg0 ^ 10565);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLhh;)V")
    public static final void method196(boolean arg0, class163 arg1) {
        ++field509;
        int var2 = class229.method1594(0, arg1);
        if (var2 != -1) {
            class27.field419 = class127.field2469.field4105[var2] + -class54.field892;
            class175.field3192 = class58.field952 - (class127.field2469.field4097[var2] - class218.field3965) + -1;
            int var3 = class27.field419 - (int) ((float) class87.field1630.field1183 / class21.field335);
            int var4 = (int) ((float) class87.field1630.field1183 / class21.field335) + class27.field419;
            if (arg0) {
                method196(true, (class163) null);
            }
            if (var3 < 0) {
                class27.field419 = (int) ((float) class87.field1630.field1183 / class21.field335);
            }
            int var5 = class175.field3192 - (int) ((float) class87.field1630.field1220 / class21.field335);
            int var6 = (int) ((float) class87.field1630.field1220 / class21.field335) + class175.field3192;
            if (~var5 > -1) {
                class175.field3192 = (int) ((float) class87.field1630.field1220 / class21.field335);
            }
            if (~class124.field2395 > ~var4) {
                class27.field419 = -((int) ((float) class87.field1630.field1183 / class21.field335)) + class124.field2395;
            }
            if (class58.field952 < var6) {
                class175.field3192 = -((int) ((float) class87.field1630.field1220 / class21.field335)) + class58.field952;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
    public static final void method197(int arg0, int arg1) {
        ++field504;
        if (arg0 != arg1) {
            if (class29.field458[arg0]) {
                class8.field140.method984(arg0, 0);
                if (class109.field2060[arg0] != null) {
                    boolean var2 = true;
                    for (int var3 = 0; class109.field2060[arg0].length > var3; ++var3) {
                        if (class109.field2060[arg0][var3] != null) {
                            if (~class109.field2060[arg0][var3].field1294 == -3) {
                                var2 = false;
                            } else {
                                class109.field2060[arg0][var3] = null;
                            }
                        }
                    }
                    if (var2) {
                        class109.field2060[arg0] = null;
                    }
                    class29.field458[arg0] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(III)I")
    public static final int method198(int arg0, int arg1, int arg2) {
        ++field508;
        class197 var3 = (class197) class76.field1427.method1743((long) arg1, false);
        if (var3 == null) {
            return -1;
        } else if (arg0 != 12421) {
            return 31;
        } else {
            return ~arg2 <= -1 && ~arg2 > ~var3.field3557.length ? var3.field3557[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        if (!arg1) {
            this.method60(8, 73, (class81) null);
        }
        ++field515;
        int[][] var3 = super.field2228.method1304(arg0, (byte) -93);
        if (super.field2228.field3221) {
            int var4 = class143.field2702;
            int var5 = class1.field26;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field2228.method1307(32329);
            this.method191(var6, -31446);
            for (int var8 = 0; ~class1.field26 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class143.field2702; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class7.method50(4080, var15 << 4);
                    var12[var14] = class7.method50(var15, 65280) >> 4;
                    var11[var14] = class7.method50(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }
}
