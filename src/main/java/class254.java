import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class254 extends class13 {

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    private int field3578 = 4096;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    private int field3579 = 4096;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    private int field3575 = 4096;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "F")
    public static float field3584;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "Lnq;")
    public static class268 field3576;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lkh;BI)V", line = 3)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg1 < 50) {
            this.method222(-97, 55);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3575 = arg0.method174(255);
                }
            } else {
                this.field3578 = arg0.method174(255);
            }
        } else {
            this.field3579 = arg0.method174(255);
        }
        ++field3577;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BJ)V", line = 49)
    public static final void method1693(byte arg0, long arg1) {
        ++field3582;
        try {
            Thread.sleep(arg1);
            int var3 = -118 % ((-43 - arg0) / 41);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 63)
    public class254() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILqa;I)V", line = 70)
    public static final void method1694(int arg0, int arg1, class134 arg2, int arg3) {
        if ((arg1 & 4096) != 0) {
            int var4 = class333.field4591.method158(true);
            arg2.field5282 = class333.field4591.method206(112);
            arg2.field5272 = class333.field4591.method206(arg0 ^ -11172);
            arg2.field5311 = 32767 & var4;
            arg2.field5322 = (var4 & 32768) != 0;
            arg2.field5271 = class276.field3837 + arg2.field5282 + arg2.field5311;
        }
        ++field3581;
        if (~(1024 & arg1) != -1) {
            int var5 = class333.field4591.method158(true);
            int var6 = class333.field4591.method185(25239);
            if (~var5 == -65536) {
                var5 = -1;
            }
            boolean var7 = true;
            if (var5 != -1 && arg2.field5300 != -1) {
                if (arg2.field5300 == var5) {
                    class80 var8 = class393.method2484(var5, 57);
                    if (var8.field1144 && ~var8.field1125 != 0) {
                        class411 var9 = class108.method761((byte) -82, var8.field1125);
                        int var10 = var9.field5832;
                        if (var10 != 0) {
                            if (var10 != 1) {
                                if (~var10 == -3) {
                                    var7 = false;
                                    arg2.field5250 = 0;
                                }
                            } else {
                                var7 = true;
                            }
                        } else {
                            var7 = false;
                        }
                    }
                } else {
                    class80 var11 = class393.method2484(var5, -82);
                    class80 var12 = class393.method2484(arg2.field5300, 79);
                    if (~var11.field1125 != 0 && var12.field1125 != -1) {
                        class411 var13 = class108.method761((byte) -82, var11.field1125);
                        class411 var14 = class108.method761((byte) -82, var12.field1125);
                        if (~var14.field5825 < ~var13.field5825) {
                            var7 = false;
                        }
                    }
                }
            }
            if (var7) {
                arg2.field5257 = 0;
                arg2.field5316 = 1;
                arg2.field5295 = 0;
                arg2.field5288 = var6 >> 16;
                arg2.field5300 = var5;
                arg2.field5320 = (65535 & var6) + class276.field3837;
                if (arg2.field5320 > class276.field3837) {
                    arg2.field5295 = -1;
                }
                if (arg2.field5300 != -1 && class276.field3837 == arg2.field5320) {
                    int var15 = class393.method2484(arg2.field5300, 126).field1125;
                    if (~var15 != 0) {
                        class411 var16 = class108.method761((byte) -82, var15);
                        if (var16 != null && var16.field5824 != null) {
                            class431.method2721(arg2.field6266, arg2.field6262, var16, arg0 + -11125, class412.field5841 == arg2, 0);
                        }
                    }
                }
            }
        }
        if ((arg1 & 16) != 0) {
            arg2.field5281 = class333.field4591.method166(false);
            arg2.field5258 = class333.field4591.method166(false);
        }
        if ((8 & arg1) != 0) {
            int var17 = class333.field4591.method158(true);
            int var18 = class333.field4591.method206(-122);
            int var19 = class333.field4591.method177((byte) 55);
            int var20 = class333.field4591.field191;
            boolean var21 = ~(var17 & 32768) != -1;
            if (arg2.field1922 != null && arg2.field1934 != null) {
                boolean var22 = false;
                if (~var18 >= -2) {
                    if (var21 || (!class387.field5561 || class74.field1068) && !class292.field4086) {
                        if (class273.method1784(arg2.field1922, arg0 ^ 11221)) {
                            var22 = true;
                        }
                    } else {
                        var22 = true;
                    }
                }
                if (!var22 && class389.field5591 == 0) {
                    class143.field2047.field191 = 0;
                    class333.field4591.method203(class143.field2047.field230, 0, var19, (byte) -119);
                    class143.field2047.field191 = 0;
                    int var23 = -1;
                    String var24;
                    if (!var21) {
                        var24 = class128.method875(-1, class181.method1179(class357.method2294(class143.field2047, 16), (byte) 111));
                    } else {
                        var17 &= 32767;
                        class279 var25 = class192.method1245(class143.field2047, -105);
                        var23 = var25.field3914;
                        var24 = var25.field3913.method2056(26, class143.field2047);
                    }
                    arg2.field5292 = var24.trim();
                    arg2.field5318 = var17 & 255;
                    arg2.field5253 = var17 >> 8;
                    arg2.field5245 = 150;
                    int var26;
                    if (var18 != 1 && var18 != 2) {
                        var26 = !var21 ? 2 : 17;
                    } else {
                        var26 = !var21 ? 1 : 17;
                    }
                    if (~var18 != -3) {
                        if (var18 != 1) {
                            class384.method2437(var24, 1, arg2.method931((byte) -124, true), var23, (String) null, var26, 0, arg2.method939(false, (byte) 0));
                        } else {
                            class384.method2437(var24, 1, "<img=0>" + arg2.method931((byte) -124, true), var23, (String) null, var26, 0, "<img=0>" + arg2.method939(false, (byte) 0));
                        }
                    } else {
                        class384.method2437(var24, 1, "<img=1>" + arg2.method931((byte) -128, true), var23, (String) null, var26, 0, "<img=1>" + arg2.method939(false, (byte) 0));
                    }
                }
            }
            class333.field4591.field191 = var19 + var20;
        }
        if (~(4 & arg1) != -1) {
            arg2.field5275 = class333.field4591.method188(-128);
            if (~arg2.field5275 == -65536) {
                arg2.field5275 = -1;
            }
        }
        if (~(2048 & arg1) != -1) {
            arg2.field5309 = class333.field4591.method187(-19097);
            arg2.field5263 = class333.field4591.method177((byte) 55);
            arg2.field5303 = class333.field4591.method172((byte) 52);
            arg2.field5252 = class333.field4591.method177((byte) 55);
            arg2.field5293 = class333.field4591.method158(true) + class276.field3837;
            arg2.field5265 = class333.field4591.method174(arg0 + -10966) + class276.field3837;
            arg2.field5249 = class333.field4591.method206(59);
            arg2.field5328 = 0;
            arg2.field5344 = 1;
        }
        if (~(arg1 & 512) != -1) {
            int var27 = class333.field4591.method175(255);
            int var28 = class333.field4591.method177((byte) 55);
            arg2.method2393(class276.field3837, (byte) 34, var27, var28);
        }
        if (~(arg1 & 2) != -1) {
            int var29 = class333.field4591.method174(255);
            if (~var29 == -65536) {
                var29 = -1;
            }
            int var30 = class333.field4591.method172((byte) 52);
            class142.method978(arg2, var30, 1, var29);
        }
        if (arg0 != 11221) {
            field3583 = -114;
        }
        if ((256 & arg1) != 0) {
            int var31 = class333.field4591.method187(-19097);
            int[] var32 = new int[var31];
            int[] var33 = new int[var31];
            int[] var34 = new int[var31];
            for (int var35 = 0; ~var35 > ~var31; ++var35) {
                int var36 = class333.field4591.method188(-128);
                if (var36 == 65535) {
                    var36 = -1;
                }
                var32[var35] = var36;
                var33[var35] = class333.field4591.method172((byte) 52);
                var34[var35] = class333.field4591.method174(255);
            }
            class311.method2000(30204, var32, arg2, var33, var34);
        }
        if ((arg1 & 32) != 0) {
            arg2.field5292 = class333.field4591.method171(-9265);
            if (arg2.field5292.charAt(0) == '~') {
                arg2.field5292 = arg2.field5292.substring(1);
                class41.method378(0, arg2.method931((byte) -124, true), 2, arg2.method939(false, (byte) 0), arg2.field5292, (byte) 115);
            } else if (class412.field5841 == arg2) {
                class41.method378(0, arg2.method931((byte) -128, true), 2, arg2.method939(false, (byte) 0), arg2.field5292, (byte) 101);
            }
            arg2.field5253 = 0;
            arg2.field5318 = 0;
            arg2.field5245 = 150;
        }
        if (~(1 & arg1) != -1) {
            int var37 = class333.field4591.method175(255);
            int var38 = class333.field4591.method206(118);
            arg2.method2393(class276.field3837, (byte) 34, var37, var38);
            arg2.field5299 = class276.field3837 + 300;
            arg2.field5248 = class333.field4591.method206(-128);
        }
        if ((arg1 & 128) != 0) {
            int var39 = class333.field4591.method206(6);
            byte[] var40 = new byte[var39];
            class11 var41 = new class11(var40);
            class333.field4591.method181(23384, var39, 0, var40);
            class414.field5864[arg3] = var41;
            arg2.method938(var41, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 404)
    public static void method1695(boolean arg0) {
        if (!arg0) {
            method1695(false);
        }
        field3576 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[[I", line = 417)
    public final int[][] method222(int arg0, int arg1) {
        ++field3574;
        int[][] var3 = super.field256.method1930(arg1, (byte) 123);
        if (arg0 != -27832) {
            field3583 = -7;
        }
        if (super.field256.field4154) {
            int[][] var4 = this.method227(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class269.field3751; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field3579 * var12 >> 12;
                    var9[var11] = this.field3578 * var13 >> 12;
                    var10[var11] = this.field3575 * var14 >> 12;
                } else {
                    var8[var11] = this.field3579;
                    var9[var11] = this.field3578;
                    var10[var11] = this.field3575;
                }
            }
        }
        return var3;
    }
}
