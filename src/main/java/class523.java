import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class523 extends class658 {

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "[I")
    private int[] field7238 = new int[this.field9281];

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "Lkn;")
    public static class640 field7239 = new class640(0, 0);

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field7243 = 0;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "Lvi;")
    public static class560 field7242 = new class560(20);

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "I")
    public static int field7249 = 0;

    @OriginalMember(owner = "client!pr", name = "C", descriptor = "Lej;")
    public static class229 field7248 = new class229("", 11);

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    private int field7237;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
    private int field7244;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!pr", name = "A", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!pr", name = "B", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "[B")
    private byte[] field7241;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method2982(boolean arg0) {
        class452.field6159.method2510(-1);
        if (arg0) {
            ++field7235;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lfca;Loa;III)V", line = 16)
    public static final void method2983(class188 arg0, class689 arg1, int arg2, int arg3, int arg4) {
        ++field7247;
        if (arg2 == 4) {
            class185 var5 = arg0.method1207(arg1, 8);
            if (var5 != null) {
                arg1.method1908(arg4, arg3, arg0.field2438 + arg4, arg0.field2371 + arg3);
                if (class325.field4740 != 2 && ~class325.field4740 != -6 && class419.field5833 != null) {
                    int var6;
                    int var7;
                    int var8;
                    int var9;
                    if (~class42.field546 != -5) {
                        var6 = class596.field8164.field3929;
                        var7 = 16383 & (int) (-class620.field8432) - -class254.field3506;
                        var8 = -(class461.field6281 * 16) + 4096;
                        var9 = class596.field8164.field3917;
                    } else {
                        var6 = class294.field3939;
                        var9 = class86.field1068;
                        var8 = 4096;
                        var7 = (int) (-class620.field8432) & 16383;
                    }
                    int var10 = var6 / 128 + (48 - (class588.field8082 + -104) * 2);
                    int var11 = class12.field113 * 4 + 48 + -((class12.field113 + -104) * 2) + -(var9 / 128);
                    class419.field5833.method2447((float) arg0.field2438 / 2.0F + (float) arg4, (float) arg0.field2371 / 2.0F + (float) arg3, (float) var10, (float) var11, var8, var7 << 2, var5, arg4, arg3);
                    for (class360 var12 = (class360) class55.field780.method374((byte) 120); var12 != null; var12 = (class360) class55.field780.method372(-20740)) {
                        int var58 = var12.field5197;
                        int var59 = ((268432349 & class204.field2673.field8318[var58]) >> 14) - class253.field3490;
                        int var60 = (class204.field2673.field8318[var58] & 16383) + -class186.field2280;
                        int var61 = var59 * 4 + -(var6 / 128) + 2;
                        int var62 = var60 * 4 + 2 + -(var9 / 128);
                        class579.method3256(var62, 2, var5, arg0, arg1, class204.field2673.field8320[var58], var61, arg4, arg3);
                    }
                    for (int var13 = 0; var13 < class689.field9737; ++var13) {
                        int var55 = class99.field1211[var13] * 4 + 2 + -(var6 / 128);
                        int var56 = class189.field2469[var13] * 4 + -(var9 / 128) + 2;
                        class252 var57 = class578.field7980.method1746(class109.field1315[var13], (byte) 64);
                        if (var57.field3391 != null) {
                            var57 = var57.method1568(arg2 + -5, class327.field4771);
                            if (var57 == null || ~var57.field3411 == 0) {
                                continue;
                            }
                        }
                        class579.method3256(var56, 2, var5, arg0, arg1, var57.field3411, var55, arg4, arg3);
                    }
                    for (class397 var14 = (class397) class645.field9141.method2499(-64); var14 != null; var14 = (class397) class645.field9141.method2503(arg2 ^ 4)) {
                        int var50 = (int) (3L & var14.field272 >> 28);
                        if (~class251.field3389 == ~var50) {
                            int var51 = (int) (var14.field272 & 16383L) + -class253.field3490;
                            int var52 = -class186.field2280 + (int) (16383L & var14.field272 >> 14);
                            int var53 = var51 * 4 + -(var6 / 128) + 2;
                            int var54 = var52 * 4 + -(var9 / 128) + 2;
                            class331.method2118(var54, var53, arg4, arg3, var5, arg0, class172.field2152[0], 61);
                        }
                    }
                    for (int var15 = 0; class306.field4106 > var15; ++var15) {
                        class637 var45 = (class637) class77.field955.method2506(18, (long) class690.field9742[var15]);
                        if (var45 != null) {
                            class676 var46 = var45.field8702;
                            if (var46.method3733((byte) -119) && ~class596.field8164.field3925 == ~var46.field3925) {
                                class195 var47 = var46.field9594;
                                if (var47 != null && var47.field2557 != null) {
                                    var47 = var47.method1242(class327.field4771, (byte) -32);
                                }
                                if (var47 != null && var47.field2546 && var47.field2576) {
                                    int var48 = var46.field3929 / 128 - var6 / 128;
                                    int var49 = var46.field3917 / 128 + -(var9 / 128);
                                    if (~var47.field2555 == 0) {
                                        class331.method2118(var49, var48, arg4, arg3, var5, arg0, class172.field2152[1], 100);
                                    } else {
                                        class579.method3256(var49, arg2 ^ 6, var5, arg0, arg1, var47.field2555, var48, arg4, arg3);
                                    }
                                }
                            }
                        }
                    }
                    int var16 = class654.field9256;
                    int[] var17 = class123.field1595;
                    for (int var18 = 0; var16 > var18; ++var18) {
                        class519 var37 = class292.field3912[var17[var18]];
                        if (var37 != null && var37.method2955((byte) -119) && class596.field8164 != var37 && ~class596.field8164.field3925 == ~var37.field3925) {
                            int var38 = var37.field3929 / 128 + -(var6 / 128);
                            int var39 = var37.field3917 / 128 - var9 / 128;
                            boolean var40 = false;
                            for (int var41 = 0; ~var41 > ~class110.field1323; ++var41) {
                                if (var37.field7191.equals(class320.field4711[var41]) && ~class314.field4515[var41] != -1) {
                                    var40 = true;
                                    break;
                                }
                            }
                            boolean var42 = false;
                            for (int var43 = 0; ~var43 > ~class35.field341; ++var43) {
                                if (var37.field7191.equals(class624.field8496[var43].field1008)) {
                                    var42 = true;
                                    break;
                                }
                            }
                            boolean var44 = false;
                            if (~class596.field8164.field7161 != -1 && var37.field7161 != 0 && ~class596.field8164.field7161 == ~var37.field7161) {
                                var44 = true;
                            }
                            if (var37.field7158) {
                                class331.method2118(var39, var38, arg4, arg3, var5, arg0, class172.field2152[6], 48);
                            } else if (var40) {
                                class331.method2118(var39, var38, arg4, arg3, var5, arg0, class172.field2152[3], 82);
                            } else if (!var42) {
                                if (!var44) {
                                    class331.method2118(var39, var38, arg4, arg3, var5, arg0, class172.field2152[2], 46);
                                } else {
                                    class331.method2118(var39, var38, arg4, arg3, var5, arg0, class172.field2152[4], 49);
                                }
                            } else {
                                class331.method2118(var39, var38, arg4, arg3, var5, arg0, class172.field2152[5], 96);
                            }
                        }
                    }
                    class90[] var19 = class249.field3357;
                    for (int var20 = 0; var19.length > var20; ++var20) {
                        class90 var23 = var19[var20];
                        if (var23 != null && ~var23.field1099 != -1 && class430.field5984 % 20 < 10) {
                            if (~var23.field1099 == -2) {
                                class637 var24 = (class637) class77.field955.method2506(18, (long) var23.field1106);
                                if (var24 != null) {
                                    class676 var25 = var24.field8702;
                                    int var26 = var25.field3929 / 128 - var6 / 128;
                                    int var27 = var25.field3917 / 128 + -(var9 / 128);
                                    class284.method1707((byte) -52, var27, arg0, arg4, var5, var23.field1100, 360000L, var26, arg3);
                                }
                            }
                            if (var23.field1099 == 2) {
                                int var28 = var23.field1098 / 128 + -(var6 / 128);
                                int var29 = var23.field1105 / 128 + -(var9 / 128);
                                long var30 = (long) (var23.field1102 << 7);
                                long var32 = var30 * var30;
                                class284.method1707((byte) 126, var29, arg0, arg4, var5, var23.field1100, var32, var28, arg3);
                            }
                            if (~var23.field1099 == -11 && var23.field1106 >= 0 && class292.field3912.length > var23.field1106) {
                                class519 var34 = class292.field3912[var23.field1106];
                                if (var34 != null) {
                                    int var35 = var34.field3929 / 128 + -(var6 / 128);
                                    int var36 = var34.field3917 / 128 + -(var9 / 128);
                                    class284.method1707((byte) 125, var36, arg0, arg4, var5, var23.field1100, 360000L, var35, arg3);
                                }
                            }
                        }
                    }
                    if (class42.field546 != 4) {
                        if (~class436.field6025 != -1) {
                            int var21 = class436.field6025 * 4 - -2 - var6 / 128 + -2 + class596.field8164.method241(-25747) * 2;
                            int var22 = class251.field3388 * 4 - -2 - (var9 / 128 - (-1 + class596.field8164.method241(-25747)) * 2);
                            class331.method2118(var22, var21, arg4, arg3, var5, arg0, class167.field2089[!class329.field4819 ? 0 : 1], 125);
                        }
                        arg1.method3811(arg3 - -(arg0.field2371 / 2) + -1, 3, 3, arg4 - (-(arg0.field2438 / 2) - -1), -1, 31);
                    }
                } else {
                    arg1.method1956(-16777216, var5, arg4, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(BII)V", line = 328)
    public void method861(byte arg0, int arg1, int arg2) {
        if (arg2 != 768203713) {
            method2987((byte) 84);
        }
        ++field7234;
        this.field7241[this.field7244++] = (byte) (127 + (class230.method1424(arg0, 255) >> 1));
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BII)V", line = 343)
    public final void method2984(byte arg0, int arg1, int arg2) {
        this.field7237 += this.field7238[arg1] * arg2 >> 12;
        if (arg0 < -93) {
            ++field7246;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V", line = 354)
    public final void method2985(byte arg0) {
        ++field7240;
        if (arg0 != 92) {
            this.method2986((byte) -93);
        }
        this.field7237 = Math.abs(this.field7237);
        if (this.field7237 >= 4096) {
            this.field7237 = 4095;
        }
        this.method861((byte) (this.field7237 >> 4), this.field7244++, 768203713);
        this.field7237 = 0;
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "(B)V", line = 372)
    public final void method2986(byte arg0) {
        if (arg0 > -29) {
            this.field7244 = -93;
        }
        ++field7236;
        this.field7244 = 0;
        this.field7237 = 0;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(IIIIIF)V", line = 391)
    public class523(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field9281; ++var7) {
            this.field7238[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "(B)V", line = 408)
    public static void method2987(byte arg0) {
        int var1 = -53 % ((arg0 - 1) / 44);
        field7239 = null;
        field7248 = null;
        field7242 = null;
    }
}
