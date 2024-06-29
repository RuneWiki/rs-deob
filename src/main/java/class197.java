import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class197 extends class105 {

    @OriginalMember(owner = "client!vh", name = "fb", descriptor = "I")
    private int field3841 = 4096;

    @OriginalMember(owner = "client!vh", name = "bb", descriptor = "Leh;")
    public static class47 field3837 = class195.method1282((byte) -4, "swe");

    @OriginalMember(owner = "client!vh", name = "db", descriptor = "[J")
    public static long[] field3839 = new long[256];

    @OriginalMember(owner = "client!vh", name = "jb", descriptor = "Z")
    public static volatile boolean field3845;

    @OriginalMember(owner = "client!vh", name = "hb", descriptor = "Leh;")
    public static class47 field3843;

    @OriginalMember(owner = "client!vh", name = "ib", descriptor = "Lhd;")
    public static class68 field3844;

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!vh", name = "Z", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!vh", name = "ab", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!vh", name = "cb", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!vh", name = "eb", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!vh", name = "gb", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!vh", name = "lb", descriptor = "Lig;")
    public static class79 field3847;

    @OriginalMember(owner = "client!vh", name = "kb", descriptor = "[[[B")
    public static byte[][][] field3846;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        int[] var3 = super.field2192.method336(-49, arg0);
        if (super.field2192.field770) {
            int[] var4 = this.method851(0, true, arg0 - 1 & class122.field2468);
            int[] var5 = this.method851(0, true, arg0);
            int[] var6 = this.method851(0, true, arg0 + 1 & class122.field2468);
            for (int var7 = 0; ~var7 > ~class149.field2928; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3841;
                int var9 = (var5[class121.field2453 & var7 - -1] + -var5[var7 + -1 & class121.field2453]) * this.field3841;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((var11 - (-var13 + -4096)) / 4096)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        ++field3835;
        if (arg1 <= 78) {
            method1296(43, -93, -114);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Llc;IIIII)V")
    public static final void method1291(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class8.field167 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class103.field2156) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class100.field2102 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class152 var14 = class173.field3351[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class41.field821[var11][var12 + 1][var13] + class41.field821[var11][var12][var13] + class41.field821[var11][var12][var13 + 1] + class41.field821[var11][var12 + 1][var13 + 1]) / 4 - (class41.field821[arg1][arg2 + 1][arg3] + class41.field821[arg1][arg2][arg3] + class41.field821[arg1][arg2][arg3 + 1] + class41.field821[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class44 var16 = var14.field2991;
                                    if (var16 != null) {
                                        if (var16.field876 instanceof class102) {
                                            class102 var17 = (class102) var16.field876;
                                            class102.method827(arg0, var17, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field878 instanceof class102) {
                                            class102 var18 = (class102) var16.field878;
                                            class102.method827(arg0, var18, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var19 = 0; var19 < var14.field2975; ++var19) {
                                        class60 var20 = var14.field2979[var19];
                                        if (var20 != null && var20.field1150 instanceof class102) {
                                            class102 var21 = (class102) var20.field1150;
                                            int var22 = var20.field1153 - var20.field1172 + 1;
                                            int var23 = var20.field1168 - var20.field1170 + 1;
                                            class102.method827(arg0, var21, (var20.field1172 - arg2) * 128 + (var22 - arg4) * 64, var15, (var20.field1170 - arg3) * 128 + (var23 - arg5) * 64, var6);
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

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)V")
    public static final void method1292(byte arg0) {
        ++field3836;
        if (~class150.field2948.toLowerCase().indexOf("microsoft") == 0) {
            class68.field1506[61] = 27;
            class68.field1506[45] = 26;
            class68.field1506[46] = 72;
            if (class150.field2939 != null) {
                class68.field1506[222] = 58;
                class68.field1506[520] = 59;
                class68.field1506[192] = 28;
            } else {
                class68.field1506[222] = 59;
                class68.field1506[192] = 58;
            }
            class68.field1506[92] = 74;
            class68.field1506[47] = 73;
            class68.field1506[91] = 42;
            class68.field1506[44] = 71;
            class68.field1506[93] = 43;
            class68.field1506[59] = 57;
        } else {
            class68.field1506[220] = 74;
            class68.field1506[219] = 42;
            class68.field1506[187] = 27;
            class68.field1506[221] = 43;
            class68.field1506[192] = 58;
            class68.field1506[191] = 73;
            class68.field1506[190] = 72;
            class68.field1506[223] = 28;
            class68.field1506[222] = 59;
            class68.field1506[189] = 26;
            class68.field1506[186] = 57;
            class68.field1506[188] = 71;
        }
        if (arg0 != -78) {
            method1293(108);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field3841 = arg1.method569(26496);
        }
        ++field3838;
        if (arg2 != -256) {
            field3834 = -42;
        }
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
    public static void method1293(int arg0) {
        field3844 = null;
        field3847 = null;
        field3839 = null;
        field3837 = null;
        field3843 = null;
        if (arg0 == 3) {
            field3846 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V")
    public static final void method1294(int arg0) {
        ++field3842;
        for (int var1 = arg0; ~var1 > ~class130.field2575; ++var1) {
            int var5;
            if (~var1 == 0) {
                var5 = 2047;
            } else {
                var5 = class146.field2853[var1];
            }
            class32 var6 = class40.field795[var5];
            if (var6 != null && var6.field3325 > 0) {
                --var6.field3325;
                if (~var6.field3325 == -1) {
                    var6.field3335 = null;
                }
            }
        }
        for (int var2 = 0; ~var2 > ~class80.field1727; ++var2) {
            int var3 = class136.field2666[var2];
            class72 var4 = class133.field2626[var3];
            if (var4 != null && var4.field3325 > 0) {
                --var4.field3325;
                if (var4.field3325 == 0) {
                    var4.field3335 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(Z)V")
    public static final void method1295(boolean arg0) {
        ++field3840;
        for (int var1 = 0; ~var1 > ~class94.field1942; ++var1) {
            int var2 = class196.field3810[var1];
            class72 var3 = class133.field2626[var2];
            int var4 = class22.field418.method604((byte) 10);
            if ((1 & var4) != 0) {
                int var5 = class22.field418.method569(26496);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class22.field418.method604((byte) 0);
                if (var3.field3330 == var5 && ~var5 != 0) {
                    int var7 = class25.method236(false, var5).field442;
                    if (~var7 == -2) {
                        var3.field3336 = 0;
                        var3.field3305 = 0;
                        var3.field3290 = 0;
                        var3.field3329 = var6;
                    }
                    if (~var7 == -3) {
                        var3.field3336 = 0;
                    }
                } else if (var5 == -1 || ~var3.field3330 == 0 || class25.method236(false, var5).field420 >= class25.method236(!arg0, var3.field3330).field420) {
                    var3.field3290 = 0;
                    var3.field3330 = var5;
                    var3.field3300 = var3.field3272;
                    var3.field3336 = 0;
                    var3.field3305 = 0;
                    var3.field3329 = var6;
                }
            }
            if (~(var4 & 128) != -1) {
                int var8 = class22.field418.method604((byte) -123);
                int var9 = class22.field418.method584((byte) -36);
                var3.method1157(var9, 4, class18.field362, var8);
            }
            if ((2 & var4) != 0) {
                var3.field1547 = class195.method1284(class22.field418.method569(26496), 43);
                var3.field3308 = var3.field1547.field1068;
                var3.field3319 = var3.field1547.field1088;
                var3.field3280 = var3.field1547.field1103;
                var3.field3275 = var3.field1547.field1100;
                var3.field3332 = var3.field1547.field1066;
                var3.field3276 = var3.field1547.field1111;
                var3.field3338 = var3.field1547.field1064;
                var3.field3314 = var3.field1547.field1094;
                var3.field3328 = var3.field1547.field1099;
            }
            if ((var4 & 32) != 0) {
                var3.field3335 = class22.field418.method575(64);
                var3.field3325 = 100;
            }
            if (~(16 & var4) != -1) {
                var3.field3279 = class22.field418.method608(-118);
                int var10 = class22.field418.method599((byte) 96);
                var3.field3320 = var10 >> 16;
                var3.field3292 = (65535 & var10) + class18.field362;
                var3.field3337 = 0;
                if (var3.field3279 == 65535) {
                    var3.field3279 = -1;
                }
                var3.field3324 = 0;
                if (~var3.field3292 < ~class18.field362) {
                    var3.field3337 = -1;
                }
            }
            if ((64 & var4) != 0) {
                var3.field3303 = class22.field418.method608(100);
                var3.field3322 = class22.field418.method608(-126);
            }
            if (~(var4 & 8) != -1) {
                var3.field3287 = class22.field418.method569(26496);
                if (var3.field3287 == 65535) {
                    var3.field3287 = -1;
                }
            }
            if ((var4 & 4) != 0) {
                int var11 = class22.field418.method604((byte) 61);
                int var12 = class22.field418.method594(27796);
                var3.method1157(var12, 4, class18.field362, var11);
                var3.field3299 = class18.field362 + 300;
                var3.field3295 = class22.field418.method604((byte) -125);
            }
        }
        if (!arg0) {
            field3846 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class197() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(III)J")
    public static final long method1296(int arg0, int arg1, int arg2) {
        class152 var3 = class173.field3351[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field2975; ++var4) {
                class60 var5 = var3.field2979[var4];
                if ((var5.field1157 >> 29 & 3L) == 2L && var5.field1172 == arg1 && var5.field1170 == arg2) {
                    return var5.field1157;
                }
            }
            return 0L;
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if (~(var1 & 1L) != -2L) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                }
            }
            field3839[var0] = var1;
        }
        field3845 = false;
        field3843 = class195.method1282((byte) -4, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");
        field3844 = new class68(8);
    }
}
