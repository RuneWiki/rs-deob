import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class438 {

    @OriginalMember(owner = "client!st", name = "m", descriptor = "[I")
    private int[] field6040 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!st", name = "w", descriptor = "[I")
    private int[] field6050 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!st", name = "z", descriptor = "Z")
    public boolean field6053;

    @OriginalMember(owner = "client!st", name = "u", descriptor = "Ljb;")
    private class496 field6048;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "I")
    public int field6046;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public int field6029;

    @OriginalMember(owner = "client!st", name = "E", descriptor = "I")
    public int field6057;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "Llh;")
    private class528 field6044;

    @OriginalMember(owner = "client!st", name = "y", descriptor = "[[[B")
    private byte[][][] field6052;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "[[[B")
    public byte[][][] field6031;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "[[[I")
    public int[][][] field6041;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "[[[B")
    private byte[][][] field6043;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "[[[B")
    private byte[][][] field6038;

    @OriginalMember(owner = "client!st", name = "B", descriptor = "[[[B")
    private byte[][][] field6054;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "S")
    public static short field6047 = 256;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!st", name = "v", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!st", name = "x", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!st", name = "C", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!st", name = "D", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!st", name = "F", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "[[[B")
    public byte[][][] field6039;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(JJ)J", line = 4)
    public static long method2514(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIILee;[Lkb;II)V", line = 11)
    public final void method2515(int arg0, int arg1, int arg2, class677 arg3, class691[] arg4, int arg5, int arg6) {
        field6035++;
        if (!this.field6053) {
            for (int var8 = 0; var8 < 4; var8++) {
                class691 var9 = arg4[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg1 + var10;
                        int var13 = arg6 + var11;
                        if (var12 >= 0 && var12 < this.field6046 && var13 >= 0 && var13 < this.field6029) {
                            var9.method3885(var12, -112, var13);
                        }
                    }
                }
            }
        }
        if (arg5 != -27506) {
            this.method2516(-40, null, null, null);
        }
        int var14 = arg2 + arg1;
        int var15 = arg0 + arg6;
        for (int var16 = 0; var16 < this.field6057; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2527(0, 0, arg1 + var17, var14 + var17, arg3, var15 + var18, var16, arg6 + var18, true, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I[[[ILha;[Lkb;)V", line = 90)
    public final void method2516(int arg0, int[][][] arg1, class59 arg2, class691[] arg3) {
        field6056++;
        if (arg0 > -58) {
            return;
        }
        if (!this.field6053) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field6046; var6++) {
                    for (int var7 = 0; var7 < this.field6029; var7++) {
                        if ((class184.field2782[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class184.field2782[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method3891(2097152, var6, var7);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field6057; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field6053) {
                if (class111.field1632) {
                    var11 |= 0x8;
                }
                if (class323.field4589) {
                    var10 |= 0x2;
                }
                if (class261.field3633 != 0) {
                    if (class40.field546 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class323.field4589) {
                var11 |= 0x7;
            }
            if (!class528.field7004) {
                var11 |= 0x20;
            }
            int[][] var12 = arg1 == null || var9 >= arg1.length ? this.field6041[var9] : arg1[var9];
            class257.method1563(var9, arg2.method452(this.field6046, this.field6029, this.field6041[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V", line = 191)
    public static final void method2517(byte arg0) {
        field6030++;
        if (class397.field5539 > 1) {
            class397.field5539--;
            class101.field1416 = class691.field9630;
        }
        if (class383.field5328) {
            class383.field5328 = false;
            class92.method694(16384);
            return;
        }
        if (!class403.field5625) {
            class645.method3532((byte) 60);
        }
        for (int var1 = 0; var1 < 100 && class47.method332((byte) -7); var1++) {
        }
        if (class15.field215 != 10) {
            return;
        }
        while (class89.method681(0)) {
            class583 var2 = class381.method2246(1, class128.field2105, class514.field6820);
            var2.field7637.method3823(-83, 0);
            int var3 = var2.field7637.field9419;
            class327.method1973(var2.field7637, (byte) 101);
            var2.field7637.method3828(-20198, var2.field7637.field9419 - var3);
            class42.method309(var2, 0);
        }
        if (class66.field826 == null) {
            if (class375.method2193(116) >= class281.field3982) {
                class66.field826 = class462.field6346.method3845(class284.field4030.field7333, -23210);
            }
        } else if (class66.field826.field900 != -1) {
            class583 var4 = class381.method2246(1, class128.field2105, class658.field8693);
            var4.field7637.method3831(1182, class66.field826.field900);
            class42.method309(var4, 0);
            class66.field826 = null;
            class281.field3982 = class375.method2193(116) + 30000L;
        }
        class466 var5 = (class466) class334.field4747.method21(2);
        if (var5 != null || class325.field4620 < (class375.method2193(116) - 2000L)) {
            class583 var6 = null;
            int var7 = 0;
            for (class466 var8 = (class466) class63.field774.method21(2); var8 != null && (var6 == null || (var6.field7637.field9419 - var7) < 240); var8 = (class466) class63.field774.method9(-128)) {
                var8.method3564(true);
                int var9 = var8.method1099((byte) 127);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1098(-15204);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class569.field7487 != var10 || class456.field6237 != var9) {
                    if (var6 == null) {
                        var6 = class381.method2246(1, class128.field2105, class537.field7075);
                        class163.field2446++;
                        var6.field7637.method3823(-91, 0);
                        var7 = var6.field7637.field9419;
                    }
                    int var11 = var10 - class569.field7487;
                    class569.field7487 = var10;
                    int var12 = var9 - class456.field6237;
                    class456.field6237 = var9;
                    int var13 = (int) ((var8.method1096(0) - class325.field4620) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field7637.method3831(1182, (var11 << 6) + (var13 << 12) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var12 += 128;
                        var6.field7637.method3823(-111, var13 + 128);
                        var11 += 128;
                        var6.field7637.method3831(1182, (var11 << 8) + var12);
                    } else if (var13 < 32) {
                        var6.field7637.method3823(-58, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field7637.method3798(27695, Integer.MIN_VALUE);
                        } else {
                            var6.field7637.method3798(27695, var9 << 16 | var10);
                        }
                    } else {
                        var6.field7637.method3831(1182, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field7637.method3798(27695, Integer.MIN_VALUE);
                        } else {
                            var6.field7637.method3798(27695, var10 | var9 << 16);
                        }
                    }
                    class325.field4620 = var8.method1096(0);
                }
            }
            if (var6 != null) {
                var6.field7637.method3828(-20198, var6.field7637.field9419 - var7);
                class42.method309(var6, 0);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1096(0) - class686.field9561) / 50L;
            class686.field9561 = var5.method1096(0);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method1099((byte) -56);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1098(-15204);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1100(-126) == 2) {
                var18 = 1;
            }
            class572.field7509++;
            int var19 = (int) var14;
            class583 var20 = class381.method2246(1, class128.field2105, class118.field1894);
            var20.field7637.method3831(1182, var18 << 15 | var19);
            var20.field7637.method3798(27695, var17 | var16 << 16);
            class42.method309(var20, 0);
        }
        if (class639.field8478 > 0) {
            class210.field3094++;
            class583 var21 = class381.method2246(1, class128.field2105, class90.field1091);
            var21.field7637.method3823(-120, class639.field8478 * 3);
            for (int var22 = 0; var22 < class639.field8478; var22++) {
                class638 var23 = class32.field495[var22];
                long var24 = (var23.method2249(30000) - class584.field7641) / 50L;
                class584.field7641 = var23.method2249(30000);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field7637.method3823(-36, var23.method2250(-18458));
                var21.field7637.method3831(1182, (int) var24);
            }
            class42.method309(var21, 0);
        }
        if (class47.field600 > 0) {
            class47.field600--;
        }
        if (class616.field8238 && class47.field600 <= 0) {
            class47.field600 = 20;
            class616.field8238 = false;
            class286.field4055++;
            class583 var26 = class381.method2246(1, class128.field2105, class338.field4777);
            var26.field7637.method3780((int) class578.field7586 >> 3, 110);
            var26.field7637.method3831(1182, (int) class547.field7230 >> 3);
            class42.method309(var26, 0);
        }
        if (class265.field3687 != class709.field9831) {
            class431.field5941++;
            class265.field3687 = class709.field9831;
            class583 var27 = class381.method2246(1, class128.field2105, class125.field2071);
            var27.field7637.method3823(-41, class709.field9831 ? 1 : 0);
            class42.method309(var27, 0);
        }
        if (!class41.field548) {
            class97.field1207++;
            class583 var28 = class381.method2246(1, class128.field2105, class471.field6444);
            var28.field7637.method3823(-121, 0);
            int var29 = var28.field7637.field9419;
            class677 var30 = class411.field5711.method1674((byte) -112);
            var28.field7637.method3827(0, (byte) -32, var30.field9399, var30.field9419);
            var28.field7637.method3828(-20198, var28.field7637.field9419 - var29);
            class42.method309(var28, 0);
            class41.field548 = true;
        }
        if (class660.field8718 != null) {
            if (class278.field3898 == 2) {
                class421.method2436(18128);
            } else if (class278.field3898 == 3) {
                class514.method2872(2);
            }
        }
        if (class718.field9926) {
            class718.field9926 = false;
        } else {
            class394.field5492 /= 2.0F;
        }
        if (class12.field194) {
            class12.field194 = false;
        } else {
            class528.field7009 /= 2.0F;
        }
        class95.method716((byte) 34);
        if (class15.field215 != 10) {
            return;
        }
        class464.method2629(109);
        class525.method2903(2249);
        class750.method4206(-119);
        class574.field7540++;
        if (class574.field7540 > 750) {
            class92.method694(16384);
            return;
        }
        class209.method1395(-24458);
        class436.method2507(51);
        class692.method3902(32684);
        for (int var31 = class74.field901.method4068(117, true); var31 != -1; var31 = class74.field901.method4068(116, false)) {
            class615.method3362(false, var31);
            class135.field2157[class48.method346(class142.field2265++, 31)] = var31;
        }
        for (class127 var32 = class267.method1614(31638); var32 != null; var32 = class267.method1614(31638)) {
            int var33 = var32.method1003(-126);
            int var34 = var32.method1009((byte) 81);
            if (var33 == 1) {
                class540.field7160[var34] = var32.field2099;
                class464.field6381 |= class763.field10629[var34];
                class660.field8719[class48.method346(31, class105.field1449++)] = var34;
            } else if (var33 == 2) {
                class92.field1119[var34] = var32.field2090;
                class278.field3914[class48.method346(31, class82.field991++)] = var34;
            } else if (var33 == 3) {
                class672 var58 = class21.method225(65535, var34);
                if (!var32.field2090.equals(var58.field9205)) {
                    var58.field9205 = var32.field2090;
                    class399.method2347(var58, 2260);
                }
            } else if (var33 == 4) {
                class672 var35 = class21.method225(65535, var34);
                int var36 = var32.field2099;
                int var37 = var32.field2092;
                int var38 = var32.field2097;
                if (var35.field9177 != var36 || var35.field9224 != var37 || var35.field9293 != var38) {
                    var35.field9177 = var36;
                    var35.field9224 = var37;
                    var35.field9293 = var38;
                    class399.method2347(var35, 2260);
                }
            } else if (var33 == 5) {
                class672 var39 = class21.method225(65535, var34);
                if (var32.field2099 != var39.field9203 || var32.field2099 == -1) {
                    var39.field9192 = 0;
                    var39.field9189 = 0;
                    var39.field9203 = var32.field2099;
                    var39.field9237 = 1;
                    class456 var40 = var39.field9203 == -1 ? null : class509.field6780.method663((byte) -90, var39.field9203);
                    if (var40 != null) {
                        class532.method2965(var40, false, var39.field9192);
                    }
                    class399.method2347(var39, 2260);
                }
            } else if (var33 == 6) {
                int var52 = var32.field2099;
                int var53 = (var52 & 0x7DB9) >> 10;
                int var54 = var52 >> 5 & 0x1F;
                int var55 = var52 & 0x1F;
                int var56 = (var53 << 19) + (var54 << 11) + (var55 << 3);
                class672 var57 = class21.method225(65535, var34);
                if (var57.field9263 != var56) {
                    var57.field9263 = var56;
                    class399.method2347(var57, 2260);
                }
            } else if (var33 == 7) {
                class672 var41 = class21.method225(65535, var34);
                boolean var42 = var32.field2099 == 1;
                if (var41.field9248 != var42) {
                    var41.field9248 = var42;
                    class399.method2347(var41, 2260);
                }
            } else if (var33 == 8) {
                class672 var43 = class21.method225(65535, var34);
                if (var32.field2099 != var43.field9283 || var32.field2092 != var43.field9164 || var32.field2097 != var43.field9320) {
                    var43.field9283 = var32.field2099;
                    var43.field9164 = var32.field2092;
                    var43.field9320 = var32.field2097;
                    if (var43.field9318 != -1) {
                        if (var43.field9276 > 0) {
                            var43.field9320 = var43.field9320 * 32 / var43.field9276;
                        } else if (var43.field9261 > 0) {
                            var43.field9320 = var43.field9320 * 32 / var43.field9261;
                        }
                    }
                    class399.method2347(var43, 2260);
                }
            } else if (var33 == 9) {
                class672 var51 = class21.method225(65535, var34);
                if (var32.field2099 != var51.field9318 || var32.field2092 != var51.field9218) {
                    var51.field9318 = var32.field2099;
                    var51.field9218 = var32.field2092;
                    class399.method2347(var51, 2260);
                }
            } else if (var33 == 10) {
                class672 var50 = class21.method225(65535, var34);
                if (var32.field2099 != var50.field9235 || var32.field2092 != var50.field9305 || var32.field2097 != var50.field9244) {
                    var50.field9244 = var32.field2097;
                    var50.field9235 = var32.field2099;
                    var50.field9305 = var32.field2092;
                    class399.method2347(var50, 2260);
                }
            } else if (var33 == 11) {
                class672 var44 = class21.method225(65535, var34);
                var44.field9253 = 0;
                var44.field9212 = var44.field9286 = var32.field2099;
                var44.field9325 = var44.field9194 = var32.field2092;
                var44.field9198 = 0;
                class399.method2347(var44, 2260);
            } else if (var33 == 12) {
                class672 var48 = class21.method225(65535, var34);
                int var49 = var32.field2099;
                if (var48 != null && var48.field9239 == 0) {
                    if (var49 > var48.field9300 - var48.field9178) {
                        var49 = var48.field9300 - var48.field9178;
                    }
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (var48.field9226 != var49) {
                        var48.field9226 = var49;
                        class399.method2347(var48, 2260);
                    }
                }
            } else if (var33 == 14) {
                class672 var45 = class21.method225(65535, var34);
                var45.field9209 = var32.field2099;
            } else if (var33 == 15) {
                class359.field5044 = var32.field2099;
                class102.field1421 = var32.field2092;
                class376.field5231 = true;
            } else if (var33 == 16) {
                class672 var46 = class21.method225(65535, var34);
                var46.field9230 = var32.field2099;
            } else if (var33 == 17) {
                class672 var47 = class21.method225(65535, var34);
                var47.field9291 = var32.field2099;
            }
        }
        if (class21.field389 != 0) {
            class680.field9505 += 20;
            if (class680.field9505 >= 400) {
                class21.field389 = 0;
            }
        }
        class244.field3417++;
        if (class508.field6777 != null) {
            class416.field5751++;
            if (class416.field5751 >= 15) {
                class399.method2347(class508.field6777, 2260);
                class508.field6777 = null;
            }
        }
        class463.field6373 = false;
        class557.field7340 = null;
        class366.field5132 = null;
        class700.field9719 = false;
        class668.method3690(-1, -104, null, -1);
        class416.method2410(-1, null, -1, (byte) 13);
        if (!class142.field2268) {
            class737.field10192 = -1;
        }
        class473.method2667(0);
        class691.field9630++;
        if (class305.field4394) {
            class354.field4985++;
            class583 var59 = class381.method2246(1, class128.field2105, class681.field9512);
            var59.field7637.method3778((byte) 109, class333.field4733 << 14 | class322.field4585 << 28 | class388.field5408);
            class42.method309(var59, 0);
            class305.field4394 = false;
        }
        while (true) {
            class309 var60;
            class672 var61;
            class672 var62;
            do {
                var60 = (class309) class127.field2095.method10(false);
                if (var60 == null) {
                    while (true) {
                        class309 var63;
                        class672 var64;
                        class672 var65;
                        do {
                            var63 = (class309) class706.field9783.method10(false);
                            if (var63 == null) {
                                while (true) {
                                    class309 var66;
                                    class672 var67;
                                    class672 var68;
                                    do {
                                        var66 = (class309) class358.field5005.method10(false);
                                        if (var66 == null) {
                                            if (class557.field7340 == null) {
                                                class211.field3105 = 0;
                                            }
                                            if (class137.field2182 != null) {
                                                class59.method461((byte) 65);
                                            }
                                            if (class257.field3521 > 0 && class153.field2345.method2313(true, 82) && class153.field2345.method2313(true, 81) && class118.field1903 != 0) {
                                                int var69 = class472.field6475.field3508 - class118.field1903;
                                                if (var69 < 0) {
                                                    var69 = 0;
                                                } else if (var69 > 3) {
                                                    var69 = 3;
                                                }
                                                class559.method3108(class472.field6475.field10321[0] + class334.field4757, class472.field6475.field10322[0] + class503.field6752, var69, false);
                                            }
                                            class442.method2544((byte) -16);
                                            for (int var70 = 0; var70 < 5; var70++) {
                                                int var10002 = class114.field1867[var70]++;
                                            }
                                            if (class464.field6381 && class640.field8487 < class375.method2193(116) - 60000L) {
                                                class654.method3560((byte) -99);
                                            }
                                            for (class22 var71 = (class22) class407.field5653.method3874((byte) 14); var71 != null; var71 = (class22) class407.field5653.method3868(-24951)) {
                                                if ((long) var71.field393 < class375.method2193(116) / 1000L - 5L) {
                                                    if (var71.field397 > 0) {
                                                        class494.method2789(0, var71.field396 + class517.field6859.method2877(class713.field9854, (byte) -108), "", (byte) -15, "", "", 5);
                                                    }
                                                    if (var71.field397 == 0) {
                                                        class494.method2789(0, var71.field396 + class517.field6860.method2877(class713.field9854, (byte) -108), "", (byte) -15, "", "", 5);
                                                    }
                                                    var71.method2815(-128);
                                                }
                                            }
                                            class682.field9520++;
                                            if (class682.field9520 > 500) {
                                                class682.field9520 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x1) == 1) {
                                                    class356.field4996 += class177.field2664;
                                                }
                                                if ((var72 & 0x4) == 4) {
                                                    class262.field3656 += class430.field5922;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class171.field2622 += class462.field6341;
                                                }
                                            }
                                            if (arg0 > -5) {
                                                return;
                                            }
                                            if (class356.field4996 < -50) {
                                                class177.field2664 = 2;
                                            }
                                            if (class356.field4996 > 50) {
                                                class177.field2664 = -2;
                                            }
                                            if (class171.field2622 < -55) {
                                                class462.field6341 = 2;
                                            }
                                            if (class171.field2622 > 55) {
                                                class462.field6341 = -2;
                                            }
                                            if (class262.field3656 < -40) {
                                                class430.field5922 = 1;
                                            }
                                            class295.field4221++;
                                            if (class262.field3656 > 40) {
                                                class430.field5922 = -1;
                                            }
                                            if (class295.field4221 > 500) {
                                                class295.field4221 = 0;
                                                int var73 = (int) (Math.random() * 8.0D);
                                                if ((var73 & 0x2) == 2) {
                                                    class260.field3629 += class288.field4090;
                                                }
                                                if ((var73 & 0x1) == 1) {
                                                    class649.field8626 += class648.field8619;
                                                }
                                            }
                                            if (class649.field8626 < -60) {
                                                class648.field8619 = 2;
                                            }
                                            if (class649.field8626 > 60) {
                                                class648.field8619 = -2;
                                            }
                                            if (class260.field3629 < -20) {
                                                class288.field4090 = 1;
                                            }
                                            class567.field7457++;
                                            if (class260.field3629 > 10) {
                                                class288.field4090 = -1;
                                            }
                                            if (class567.field7457 > 50) {
                                                class388.field5410++;
                                                class583 var74 = class381.method2246(1, class128.field2105, class587.field7673);
                                                class42.method309(var74, 0);
                                            }
                                            if (class172.field2632) {
                                                class749.method4190(0);
                                                class172.field2632 = false;
                                            }
                                            try {
                                                class539.method3007(7388);
                                                return;
                                            } catch (IOException var75) {
                                                class92.method694(16384);
                                                return;
                                            }
                                        }
                                        var67 = var66.field4435;
                                        if (var67.field9277 < 0) {
                                            break;
                                        }
                                        var68 = class21.method225(65535, var67.field9255);
                                    } while (var68 == null || var68.field9240 == null || var67.field9277 >= var68.field9240.length || var68.field9240[var67.field9277] != var67);
                                    class182.method1249(var66);
                                }
                            }
                            var64 = var63.field4435;
                            if (var64.field9277 < 0) {
                                break;
                            }
                            var65 = class21.method225(65535, var64.field9255);
                        } while (var65 == null || var65.field9240 == null || var65.field9240.length <= var64.field9277 || var65.field9240[var64.field9277] != var64);
                        class182.method1249(var63);
                    }
                }
                var61 = var60.field4435;
                if (var61.field9277 < 0) {
                    break;
                }
                var62 = class21.method225(65535, var61.field9255);
            } while (var62 == null || var62.field9240 == null || var61.field9277 >= var62.field9240.length || var62.field9240[var61.field9277] != var61);
            class182.method1249(var60);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIII)V", line = 1065)
    public final void method2518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6051++;
        for (int var7 = arg5; var7 < arg2 + arg5; var7++) {
            for (int var10 = arg4; var10 < (arg1 + arg4); var10++) {
                if (var10 >= 0 && this.field6046 > var10 && var7 >= 0 && var7 < this.field6029) {
                    this.field6041[arg3][var10][var7] = arg3 <= 0 ? 0 : this.field6041[arg3 - 1][var10][var7] - 960;
                }
            }
        }
        if (arg4 > 0 && arg4 < this.field6046) {
            for (int var8 = arg5 + 1; var8 < (arg2 + arg5); var8++) {
                if (var8 >= 0 && var8 < this.field6029) {
                    this.field6041[arg3][arg4][var8] = this.field6041[arg3][arg4 - 1][var8];
                }
            }
        }
        if (arg5 > 0 && arg5 < this.field6029) {
            for (int var9 = arg4 + 1; var9 < (arg1 + arg4); var9++) {
                if (var9 >= 0 && this.field6046 > var9) {
                    this.field6041[arg3][var9][arg5] = this.field6041[arg3][var9][arg5 - 1];
                }
            }
        }
        if (arg0 < ~arg4 || arg5 < 0 || arg4 >= this.field6046 || this.field6029 <= arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 > 0 && this.field6041[arg3][arg4 - 1][arg5] != 0) {
                this.field6041[arg3][arg4][arg5] = this.field6041[arg3][arg4 - 1][arg5];
                return;
            }
            if (arg5 <= 0 || this.field6041[arg3][arg4][arg5 - 1] == 0) {
                if (arg4 > 0 && arg5 > 0 && this.field6041[arg3][arg4 - 1][arg5 - 1] != 0) {
                    this.field6041[arg3][arg4][arg5] = this.field6041[arg3][arg4 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            this.field6041[arg3][arg4][arg5] = this.field6041[arg3][arg4][arg5 - 1];
        } else if (arg4 <= 0 || this.field6041[arg3 - 1][arg4 - 1][arg5] == this.field6041[arg3][arg4 - 1][arg5]) {
            if (arg5 > 0 && this.field6041[arg3 - 1][arg4][arg5 - 1] != this.field6041[arg3][arg4][arg5 - 1]) {
                this.field6041[arg3][arg4][arg5] = this.field6041[arg3][arg4][arg5 - 1];
                return;
            }
            if (arg4 > 0 && arg5 > 0 && this.field6041[arg3 - 1][arg4 - 1][arg5 - 1] != this.field6041[arg3][arg4 - 1][arg5 - 1]) {
                this.field6041[arg3][arg4][arg5] = this.field6041[arg3][arg4 - 1][arg5 - 1];
                return;
            }
        } else {
            this.field6041[arg3][arg4][arg5] = this.field6041[arg3][arg4 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZ)Z", line = 1159)
    public static final boolean method2519(int arg0, boolean arg1) {
        field6049++;
        if (arg0 <= 24) {
            field6047 = 91;
        }
        boolean var2 = class341.field4807.method459();
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class341.field4807.method475();
        } else if (!class341.field4807.method505()) {
            arg1 = false;
        }
        if (var2 == arg1) {
            return false;
        } else {
            class411.field5711.method1677(class411.field5711.field3876, (byte) -71, arg1 ? 1 : 0);
            class2.method15(17458);
            return true;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIBII[Lkb;Lee;III)V", line = 1212)
    public final void method2520(int arg0, int arg1, byte arg2, int arg3, int arg4, class691[] arg5, class677 arg6, int arg7, int arg8, int arg9) {
        field6034++;
        int var11 = (arg0 & 0x7) * 8;
        int var12 = (arg8 & 0x7) * 8;
        if (!this.field6053) {
            class691 var13 = arg5[arg7];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class51.method358(arg3, var15 & 0x7, var14 & 0x7, arg2 + 30139) + arg9;
                    int var17 = arg1 + class553.method3081(var15 & 0x7, arg3, var14 & 0x7, true);
                    if (var16 > 0 && (this.field6046 - 1) > var16 && var17 > 0 && this.field6029 - 1 > var17) {
                        var13.method3885(var16, -35, var17);
                    }
                }
            }
        }
        int var18 = arg0 & 0x1FFFFFF8 << 3;
        int var19 = arg8 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg3 == 1) {
            var21 = 1;
        } else if (arg3 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg3 == 3) {
            var20 = 1;
        }
        if (arg2 != 2) {
            return;
        }
        for (int var22 = 0; var22 < this.field6057; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg4 == var22 && var11 <= var23 && var11 + 8 >= var23 && var24 >= var12 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var12 + 8) == var24) {
                            if (arg3 == 0) {
                                var26 = arg1 + var24 - var12;
                                var25 = var23 + arg9 - var11;
                            } else if (arg3 == 1) {
                                var25 = arg9 - (var12 - var24);
                                var26 = var11 + arg1 + 8 - var23;
                            } else if (arg3 == 2) {
                                var26 = var12 + arg1 + 8 - var24;
                                var25 = arg9 + var11 + 8 - var23;
                            } else {
                                var26 = var23 + arg1 - var11;
                                var25 = -var24 - (-var12 - arg9 - 8);
                            }
                            this.method2527(0, 0, var25, var18 + var23, arg6, var19 + var24, arg7, var26, true, 0, true);
                        } else {
                            var25 = arg9 + class51.method358(arg3, var24 & 0x7, var23 & 0x7, 30141);
                            var26 = class553.method3081(var24 & 0x7, arg3, var23 & 0x7, true) + arg1;
                            this.method2527(arg3, var21, var25, var18 + var23, arg6, var19 + var24, arg7, var26, true, var20, false);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var30 = var24 == 63 ? 64 : var24;
                                    var29 = var23 == 63 ? 64 : var23;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg3 == 0) {
                                    var32 = arg1 - (var12 - var30);
                                    var31 = var29 + arg9 - var11;
                                } else if (arg3 == 1) {
                                    var31 = arg9 - (var12 - var30);
                                    var32 = arg1 + var11 + 8 - var29;
                                } else if (arg3 == 2) {
                                    var32 = var12 + (arg1 - -8) - var30;
                                    var31 = arg9 + 8 - (-var11 + var29);
                                } else {
                                    var31 = -var30 - (-var12 - arg9 - 8);
                                    var32 = var29 + arg1 - var11;
                                }
                                if (var31 >= 0 && var31 < this.field6046 && var32 >= 0 && this.field6029 > var32) {
                                    this.field6041[arg7][var31][var32] = this.field6041[arg7][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method2527(0, 0, -1, 0, arg6, 0, 0, -1, true, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Z", line = 1416)
    public static final boolean method2521(int arg0) {
        if (arg0 > -89) {
            return true;
        } else {
            field6045++;
            return class320.field4576 == 0 ? class566.field7445.method36(100) : true;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILs;Ls;ILha;[[ILs;)V", line = 1433)
    private final void method2522(int arg0, class282 arg1, class282 arg2, int arg3, class59 arg4, int[][] arg5, class282 arg6) {
        field6055++;
        byte[][] var8 = this.field6038[arg3];
        byte[][] var9 = this.field6052[arg3];
        if (arg0 != 2) {
            method2517((byte) -52);
        }
        byte[][] var10 = this.field6054[arg3];
        byte[][] var11 = this.field6043[arg3];
        for (int var12 = 0; var12 < this.field6046; var12++) {
            int var13 = this.field6046 - 1 > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field6029; var14++) {
                int var15 = this.field6029 - 1 <= var14 ? var14 : var14 + 1;
                if (client.field4374 == -1 || class753.method4218(var12, client.field4374, var14, arg0, arg3)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class403 var26 = var21 == 0 ? null : this.field6048.method2798(var21 - 1, arg0 + -112);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class155 var27 = var22 == 0 ? null : this.field6044.method2953(var22 - 1, false);
                        class403 var28 = var26;
                        if (var26 != null) {
                            if (var26.field5624 == -1 && var26.field5616 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field5627;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field6046 > var12 && var14 < this.field6029) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var35 = 0;
                            int var36 = var35 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var33++;
                            } else {
                                var33--;
                                var34--;
                            }
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var34++;
                            } else {
                                var32--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var33--;
                                var36--;
                            }
                            int var37 = var33 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg6.method1742(var12, arg0 + 45, var14) - arg6.method1742(var13, 81, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg6.method1742(var13, 53, var14) - arg6.method1742(var12, 116, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class330.field4714[var39] = -1;
                            class416.field5737[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field5627 ? class650.field8635[var19] : class349.field4915[var19];
                        this.method2529(var14, var18, var8, var12, var27, var26, var11, this.field6029, var9, arg4, var19, arg0 ^ 0x5B, this.field6046, var20);
                        boolean var41 = var26 != null && var26.field5624 != var26.field5616;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class330.field4714[var42] >= 0 && class694.field9653[var42] != class371.field5170[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class65.method550(var18[1], class48.method346(class416.field5737[2], class416.field5737[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class65.method550(var18[3], class48.method346(class416.field5737[0], class416.field5737[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class65.method550(var18[0], class48.method346(class416.field5737[2], class416.field5737[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class65.method550(var18[2], class48.method346(class416.field5737[6], class416.field5737[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var48 = class468.field6430[var19];
                            var47 = var26 == null ? 0 : class538.field7115[var19];
                            var49 = class730.field10116[var19];
                            var45 = class170.field2609[var19];
                            var46 = var27 == null ? 0 : class572.field7507[var19];
                        } else if (var17) {
                            var45 = class241.field3385[var19];
                            var46 = var27 == null ? 0 : class431.field5943[var19];
                            var47 = var26 == null ? 0 : class620.field8268[var19];
                            var48 = class136.field2172[var19];
                            var44 = class752.field10492[var19];
                            var49 = class180.field2725[var19];
                        } else {
                            var48 = class520.field6928[var19];
                            var49 = class494.field6670[var19];
                            var47 = var26 == null ? 0 : class224.field3181[var19];
                            var44 = class468.field6428[var19];
                            var45 = class68.field839[var19];
                            var46 = var27 == null ? 0 : class284.field4024[var19];
                        }
                        int var50 = var46 + var47;
                        if (var50 <= 0) {
                            class421.method2442(arg3, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg1 == null ? null : new int[var53];
                            int[] var61 = arg1 == null && arg2 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var63 = var26.field5618;
                                var64 = var26.field5619;
                                var62 = var26.field5624;
                                int var65 = class207.method1385(true, var26, arg4);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class76.field923[0] = var48[var51];
                                        class76.field923[1] = 1;
                                        class76.field923[2] = var45[var51];
                                        class76.field923[3] = 1;
                                        class76.field923[4] = var49[var51];
                                        var68 = 6;
                                        class76.field923[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class76.field923[0] = var48[var51];
                                        class76.field923[1] = 5;
                                        class76.field923[2] = var45[var51];
                                        class76.field923[3] = 5;
                                        class76.field923[4] = var49[var51];
                                        class76.field923[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class76.field923[0] = var48[var51];
                                        class76.field923[1] = 3;
                                        class76.field923[2] = var45[var51];
                                        class76.field923[3] = 3;
                                        class76.field923[4] = var49[var51];
                                        class76.field923[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class76.field923[0] = var48[var51];
                                        class76.field923[1] = 7;
                                        class76.field923[2] = var45[var51];
                                        class76.field923[3] = 7;
                                        class76.field923[4] = var49[var51];
                                        var68 = 6;
                                        class76.field923[5] = var45[var51];
                                    } else {
                                        class76.field923[0] = var48[var51];
                                        class76.field923[1] = var49[var51];
                                        var68 = 3;
                                        class76.field923[2] = var45[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class76.field923[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field6050[var70];
                                        int var73 = this.field6040[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = 512 - var72;
                                            var75 = var73;
                                        } else if (var20 == 2) {
                                            var75 = 512 - var72;
                                            var74 = 512 - var73;
                                        } else if (var20 == 3) {
                                            var74 = var72;
                                            var75 = 512 - var73;
                                        } else {
                                            var74 = var73;
                                            var75 = var72;
                                        }
                                        var55[var52] = var75;
                                        var56[var52] = var74;
                                        if (var60 != null && class26.field427[var19][var70]) {
                                            int var76 = (var12 << 9) + var75;
                                            int var77 = (var14 << 9) + var74;
                                            var60[var52] = arg1.method1750((byte) 109, var76, var77) - arg6.method1750((byte) 123, var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class26.field427[var19][var70]) {
                                                int var78 = (var12 << 9) + var75;
                                                int var79 = (var14 << 9) + var74;
                                                var61[var52] = arg6.method1750((byte) 106, var78, var79) - arg1.method1750((byte) 109, var78, var79);
                                            } else if (arg2 != null && !class204.field3063[var19][var70]) {
                                                int var80 = (var12 << 9) + var75;
                                                int var81 = (var14 << 9) + var74;
                                                var61[var52] = arg2.method1750((byte) 126, var80, var81) - arg6.method1750((byte) 120, var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && var26.field5613 < class330.field4714[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class694.field9653[var71];
                                            }
                                            var59[var52] = class621.field8282[var71];
                                            var58[var52] = class228.field3257[var71];
                                            var57[var52] = class371.field5170[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field5618;
                                            var59[var52] = var26.field5619;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field6053 && arg3 == 0) {
                                    class20.method221(var12, var14, var26.field5617, var26.field5609 * 8, var26.field5615);
                                }
                                if (var19 != 12 && var26.field5624 != -1 && var26.field5626) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class538.field7115[var19];
                            } else if (var17) {
                                var51 += class620.field8268[var19];
                            } else {
                                var51 += class224.field3181[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class155 var82 = this.field6044.method2953(var22 - 1, false);
                                class155 var83 = this.field6044.method2953(var23 - 1, false);
                                class155 var84 = this.field6044.method2953(var24 - 1, false);
                                class155 var85 = this.field6044.method2953(var25 - 1, false);
                                for (int var86 = 0; var86 < var46; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class76.field923[0] = var48[var51];
                                        class76.field923[1] = 1;
                                        class76.field923[2] = var45[var51];
                                        class76.field923[3] = 1;
                                        class76.field923[4] = var49[var51];
                                        class76.field923[5] = var45[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class76.field923[0] = var48[var51];
                                        class76.field923[1] = 5;
                                        class76.field923[2] = var45[var51];
                                        class76.field923[3] = 5;
                                        class76.field923[4] = var49[var51];
                                        var88 = 6;
                                        class76.field923[5] = var45[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class76.field923[0] = var48[var51];
                                        class76.field923[1] = 3;
                                        class76.field923[2] = var45[var51];
                                        class76.field923[3] = 3;
                                        class76.field923[4] = var49[var51];
                                        var88 = 6;
                                        class76.field923[5] = var45[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class76.field923[0] = var48[var51];
                                        class76.field923[1] = 7;
                                        class76.field923[2] = var45[var51];
                                        class76.field923[3] = 7;
                                        class76.field923[4] = var49[var51];
                                        var88 = 6;
                                        class76.field923[5] = var45[var51];
                                    } else {
                                        class76.field923[0] = var48[var51];
                                        class76.field923[1] = var49[var51];
                                        class76.field923[2] = var45[var51];
                                        var88 = 3;
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class76.field923[var89];
                                        int var91 = var90 - var20 * 2 & 0x7;
                                        int var92 = this.field6050[var90];
                                        int var93 = this.field6040[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var95 = 512 - var92;
                                            var94 = var93;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var92;
                                            var95 = 512 - var93;
                                        } else if (var20 == 3) {
                                            var94 = 512 - var93;
                                            var95 = var92;
                                        } else {
                                            var95 = var93;
                                            var94 = var92;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class26.field427[var19][var90]) {
                                            int var96 = (var12 << 9) + var94;
                                            int var97 = (var14 << 9) + var95;
                                            var60[var52] = arg1.method1750((byte) 118, var96, var97) - arg6.method1750((byte) 108, var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class26.field427[var19][var90]) {
                                                int var98 = (var12 << 9) + var94;
                                                int var99 = (var14 << 9) + var95;
                                                var61[var52] = arg6.method1750((byte) 122, var98, var99) - arg1.method1750((byte) 126, var98, var99);
                                            } else if (arg2 != null && !class204.field3063[var19][var90]) {
                                                int var100 = (var12 << 9) + var94;
                                                int var101 = (var14 << 9) + var95;
                                                var61[var52] = arg2.method1750((byte) 104, var100, var101) - arg6.method1750((byte) 110, var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class330.field4714[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class694.field9653[var91];
                                            }
                                            var59[var52] = class621.field8282[var91];
                                            var58[var52] = class228.field3257[var91];
                                            var57[var52] = class371.field5170[var91];
                                        } else {
                                            if (var17 && class26.field427[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg5[var12][var14];
                                                var58[var52] = var82.field2357;
                                                var59[var52] = var82.field2371;
                                            } else if (var94 == 0 && var95 == 512) {
                                                var57[var52] = arg5[var12][var15];
                                                var58[var52] = var83.field2357;
                                                var59[var52] = var83.field2371;
                                            } else if (var94 == 512 && var95 == 512) {
                                                var57[var52] = arg5[var13][var15];
                                                var58[var52] = var84.field2357;
                                                var59[var52] = var84.field2371;
                                            } else if (var94 == 512 && var95 == 0) {
                                                var57[var52] = arg5[var13][var14];
                                                var58[var52] = var85.field2357;
                                                var59[var52] = var85.field2371;
                                            } else {
                                                if (var94 >= 256) {
                                                    if (var95 < 256) {
                                                        var58[var52] = var85.field2357;
                                                        var59[var52] = var85.field2371;
                                                    } else {
                                                        var58[var52] = var84.field2357;
                                                        var59[var52] = var84.field2371;
                                                    }
                                                } else if (var95 >= 256) {
                                                    var58[var52] = var83.field2357;
                                                    var59[var52] = var83.field2371;
                                                } else {
                                                    var58[var52] = var82.field2357;
                                                    var59[var52] = var82.field2371;
                                                }
                                                int var102 = class524.method2901(64512, arg5[var12][var14], var94 << 7 >> 9, arg5[var13][var14]);
                                                int var103 = class524.method2901(64512, arg5[var12][var15], var94 << 7 >> 9, arg5[var13][var15]);
                                                var57[var52] = class524.method2901(arg0 + 64510, var102, var95 << 7 >> 9, var103);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field2367) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg6.method1742(var12, arg0 ^ 0x36, var14);
                            int var105 = arg6.method1742(var13, arg0 + 76, var14);
                            int var106 = arg6.method1742(var13, 106, var15);
                            int var107 = arg6.method1742(var12, 118, var15);
                            boolean var108 = class498.method2810(arg0 - 10389, var12, var14);
                            if (var108 && arg3 > 1 || !var108 && arg3 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field2361) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field5614) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field6031[arg3][var12][var14] = (byte) class446.method2556(this.field6031[arg3][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field6053) {
                                var110 = class733.method4104(var12, var14);
                                var111 = class361.method2150(var12, var14);
                                var112 = class163.method1173(var12, var14);
                            }
                            arg6.method1735(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class421.method2442(arg3, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BIIII)V", line = 2306)
    public final void method2523(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 0;
        if (arg0 != -14) {
            this.field6053 = false;
        }
        while (var6 < this.field6057) {
            this.method2518(-1, arg4, arg2, var6, arg3, arg1);
            var6++;
        }
        field6058++;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V", line = 2326)
    public static final void method2524(int arg0) {
        class164.field2494.method486(((float) class411.field5711.field3893.method692(true) * 0.1F + 0.7F) * class399.field5564);
        if (arg0 < 105) {
            method2519(46, true);
        }
        field6036++;
        class164.field2494.method423(class635.field8453, class580.field7602, class389.field5447, (float) (class111.field1703 << 2), (float) (class156.field2386 << 2), (float) (class427.field5895 << 2));
        class164.field2494.method440(class193.field2912);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "([[IIB)V", line = 2341)
    public final void method2525(int[][] arg0, int arg1, byte arg2) {
        if (arg2 > -103) {
            this.field6038 = null;
        }
        field6033++;
        int[][] var4 = this.field6041[arg1];
        for (int var5 = 0; var5 < (this.field6046 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field6029 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(IIIZLjb;Llh;)V", line = 3441)
    public class438(int arg0, int arg1, int arg2, boolean arg3, class496 arg4, class528 arg5) {
        this.field6053 = arg3;
        this.field6048 = arg4;
        this.field6046 = arg1;
        this.field6029 = arg2;
        this.field6057 = arg0;
        this.field6044 = arg5;
        this.field6052 = new byte[this.field6057][this.field6046][this.field6029];
        this.field6031 = new byte[this.field6057][this.field6046 + 1][this.field6029 + 1];
        this.field6041 = new int[this.field6057][this.field6046 + 1][this.field6029 + 1];
        this.field6043 = new byte[this.field6057][this.field6046][this.field6029];
        this.field6038 = new byte[this.field6057][this.field6046][this.field6029];
        this.field6054 = new byte[this.field6057][this.field6046][this.field6029];
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ls;BLha;Ls;)V", line = 2377)
    public final void method2526(class282 arg0, byte arg1, class59 arg2, class282 arg3) {
        field6028++;
        int[][] var5 = new int[this.field6046][this.field6029];
        if (class305.field4390 == null || class305.field4390.length != this.field6029) {
            class305.field4390 = new int[this.field6029];
            class107.field1456 = new int[this.field6029];
            class132.field2149 = new int[this.field6029];
            class739.field10204 = new int[this.field6029];
            class93.field1122 = new int[this.field6029];
        }
        for (int var6 = 0; var6 < this.field6057; var6++) {
            for (int var8 = 0; var8 < this.field6029; var8++) {
                class305.field4390[var8] = 0;
                class132.field2149[var8] = 0;
                class107.field1456[var8] = 0;
                class93.field1122[var8] = 0;
                class739.field10204[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field6046; var9++) {
                for (int var10 = 0; var10 < this.field6029; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field6046) {
                        int var20 = this.field6054[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class155 var21 = this.field6044.method2953(var20 - 1, false);
                            class305.field4390[var10] += var21.field2364;
                            class132.field2149[var10] += var21.field2360;
                            class107.field1456[var10] += var21.field2373;
                            class93.field1122[var10] += var21.field2369;
                            var10002 = class739.field10204[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field6054[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class155 var24 = this.field6044.method2953(var23 - 1, false);
                            class305.field4390[var10] -= var24.field2364;
                            class132.field2149[var10] -= var24.field2360;
                            class107.field1456[var10] -= var24.field2373;
                            class93.field1122[var10] -= var24.field2369;
                            var10002 = class739.field10204[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field6029; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field6029) {
                            var12 += class132.field2149[var17];
                            var11 += class305.field4390[var17];
                            var15 += class739.field10204[var17];
                            var14 += class93.field1122[var17];
                            var13 += class107.field1456[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var15 -= class739.field10204[var18];
                            var11 -= class305.field4390[var18];
                            var13 -= class107.field1456[var18];
                            var12 -= class132.field2149[var18];
                            var14 -= class93.field1122[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class94.method698(var13 / var15, false, var11 * 256 / var14, var12 / var15);
                        }
                    }
                }
            }
            if (class278.field3896) {
                this.method2522(2, var6 == 0 ? arg0 : null, var6 == 0 ? arg3 : null, var6, arg2, var5, class507.field6771[var6]);
            } else {
                this.method2528(var6 == 0 ? arg0 : null, arg2, var6 == 0 ? arg3 : null, var5, 1, class507.field6771[var6], var6);
            }
            this.field6054[var6] = null;
            this.field6043[var6] = null;
            this.field6038[var6] = null;
            this.field6052[var6] = null;
        }
        if (!this.field6053) {
            if (class261.field3633 != 0) {
                class333.method2005();
            }
            if (class323.field4589) {
                class186.method1284();
            }
        }
        if (arg1 >= -6) {
            this.field6050 = null;
        }
        for (int var7 = 0; var7 < this.field6057; var7++) {
            class507.field6771[var7].method1737();
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIILee;IIIZIZ)V", line = 2555)
    private final void method2527(int arg0, int arg1, int arg2, int arg3, class677 arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, boolean arg10) {
        field6042++;
        if (arg0 == 1) {
            arg1 = 1;
        } else if (arg0 == 2) {
            arg9 = 1;
            arg1 = 1;
        } else if (arg0 == 3) {
            arg9 = 1;
        }
        if (arg2 >= 0 && this.field6046 > arg2 && arg7 >= 0 && this.field6029 > arg7) {
            if (!this.field6053 && !arg10) {
                class184.field2782[arg6][arg2][arg7] = 0;
            }
            while (true) {
                int var12 = arg4.method3821((byte) -61);
                if (var12 == 0) {
                    if (this.field6053) {
                        this.field6041[0][arg2 + arg9][arg7 + arg1] = 0;
                    } else if (arg6 == 0) {
                        this.field6041[0][arg2 + arg9][arg1 + arg7] = -class360.method2137((byte) 96, arg5 + 556238, arg3 + 932731) * 8 << 2;
                    } else {
                        this.field6041[arg6][arg2 + arg9][arg7 + arg1] = this.field6041[arg6 - 1][arg2 + arg9][arg1 + arg7] - 960;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg4.method3821((byte) -92);
                    if (this.field6053) {
                        this.field6041[0][arg2 + arg9][arg1 + arg7] = var13 * 8 << 2;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg6 == 0) {
                            this.field6041[0][arg2 + arg9][arg1 + arg7] = -var13 * 8 << 2;
                        } else {
                            this.field6041[arg6][arg2 + arg9][arg1 + arg7] = this.field6041[arg6 - 1][arg2 + arg9][arg1 + arg7] - (var13 * 8 << 2);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg10) {
                        arg4.method3821((byte) 103);
                    } else {
                        this.field6043[arg6][arg2][arg7] = arg4.method3811(120);
                        this.field6038[arg6][arg2][arg7] = (byte) ((var12 - 2) / 4);
                        this.field6052[arg6][arg2][arg7] = (byte) class48.method346(3, arg0 + var12 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!this.field6053 && !arg10) {
                        class184.field2782[arg6][arg2][arg7] = (byte) (var12 - 49);
                    }
                } else if (!arg10) {
                    this.field6054[arg6][arg2][arg7] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg4.method3821((byte) 127);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg4.method3821((byte) 106);
                    break;
                }
                if (var14 <= 49) {
                    arg4.method3821((byte) -61);
                }
            }
        }
        if (!arg8) {
            this.method2529(-99, null, null, 35, null, null, null, 1, null, null, -46, 85, 87, 76);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ls;Lha;Ls;[[IILs;I)V", line = 2683)
    private final void method2528(class282 arg0, class59 arg1, class282 arg2, int[][] arg3, int arg4, class282 arg5, int arg6) {
        int var8 = 0;
        if (arg4 != 1) {
            this.field6043 = null;
        }
        while (var8 < this.field6046) {
            for (int var9 = 0; var9 < this.field6029; var9++) {
                if (client.field4374 == -1 || class753.method4218(var8, client.field4374, var9, 2, arg6)) {
                    byte var10 = this.field6038[arg6][var8][var9];
                    byte var11 = this.field6052[arg6][var8][var9];
                    int var12 = this.field6043[arg6][var8][var9] & 0xFF;
                    int var13 = this.field6054[arg6][var8][var9] & 0xFF;
                    class403 var14 = var12 == 0 ? null : this.field6048.method2798(var12 - 1, -14);
                    class155 var15 = var13 == 0 ? null : this.field6044.method2953(var13 - 1, false);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class403 var16 = var14;
                    if (var14 != null && var14.field5624 == -1 && var14.field5616 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class572.field7507[var10];
                        int var18 = class538.field7115[var10];
                        int var19 = (var15 == null ? 0 : var17) + (var14 == null ? 0 : var18);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field5618;
                        int var23 = var15 == null ? -1 : var15.field2357;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field5616 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class468.field6430[var10][var21];
                                var25[var20] = class730.field10116[var10][var21];
                                var26[var20] = class170.field2609[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field5619;
                                var27[var20] = var14.field5624;
                                if (var30 != null) {
                                    var30[var20] = var14.field5616;
                                }
                                var21++;
                                var20++;
                            }
                            if (!this.field6053 && arg6 == 0) {
                                class20.method221(var8, var9, var14.field5617, var14.field5609 * 8, var14.field5615);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class468.field6430[var10][var21];
                                var25[var20] = class730.field10116[var10][var21];
                                var26[var20] = class170.field2609[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field2371;
                                var27[var20] = arg3[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var21++;
                                var20++;
                            }
                        }
                        int var33 = this.field6050.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg0 == null ? null : new int[var33];
                        int[] var37 = arg0 == null && arg2 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field6050[var38];
                            int var49 = this.field6040[var38];
                            if (var11 == 0) {
                                var34[var38] = var48;
                                var35[var38] = var49;
                            } else if (var11 == 1) {
                                var34[var38] = var49;
                                var35[var38] = 512 - var48;
                            } else if (var11 == 2) {
                                var34[var38] = 512 - var48;
                                var35[var38] = 512 - var49;
                            } else if (var11 == 3) {
                                var34[var38] = 512 - var49;
                                var35[var38] = var48;
                            }
                            if (var36 != null && class26.field427[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg0.method1750((byte) 110, var52, var53) - arg5.method1750((byte) 98, var52, var53);
                            }
                            if (var37 != null) {
                                if (arg0 != null && !class26.field427[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg5.method1750((byte) 121, var54, var55) - arg0.method1750((byte) 107, var54, var55);
                                } else if (arg2 != null && !class204.field3063[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg2.method1750((byte) 108, var56, var57) - arg5.method1750((byte) 117, var56, var57);
                                }
                            }
                        }
                        int var39 = arg5.method1742(var8, arg4 + 39, var9);
                        int var40 = arg5.method1742(var8 + 1, 66, var9);
                        int var41 = arg5.method1742(var8 + 1, arg4 ^ 0x7C, var9 + 1);
                        int var42 = arg5.method1742(var8, 89, var9 + 1);
                        boolean var43 = class498.method2810(-10387, var8, var9);
                        if (var43 && arg6 > 1 || !var43 && arg6 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field2361) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field5614) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field6031[arg6][var8][var9] = (byte) class446.method2556(this.field6031[arg6][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field6053) {
                            var45 = class733.method4104(var8, var9);
                            var46 = class361.method2150(var8, var9);
                            var47 = class163.method1173(var8, var9);
                        }
                        arg5.method1734(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class421.method2442(arg6, var8, var9);
                    }
                }
            }
            var8++;
        }
        field6032++;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I[Z[[BILib;Ljba;[[BI[[BLha;IIII)V", line = 2964)
    private final void method2529(int arg0, boolean[] arg1, byte[][] arg2, int arg3, class155 arg4, class403 arg5, byte[][] arg6, int arg7, byte[][] arg8, class59 arg9, int arg10, int arg11, int arg12, int arg13) {
        field6037++;
        boolean[] var15 = arg5 != null && arg5.field5627 ? class650.field8635[arg10] : class349.field4915[arg10];
        if (arg0 > 0) {
            if (arg3 > 0) {
                int var16 = arg6[arg3 - 1][arg0 - 1] & 0xFF;
                if (var16 > 0) {
                    class403 var17 = this.field6048.method2798(var16 - 1, -62);
                    if (var17.field5624 != -1 && var17.field5627) {
                        byte var18 = arg2[arg3 - 1][arg0 - 1];
                        int var19 = arg8[arg3 - 1][arg0 - 1] * 2 + 4 & 0x7;
                        int var20 = class207.method1385(true, var17, arg9);
                        if (class26.field427[var18][var19]) {
                            class371.field5170[0] = var17.field5624;
                            class694.field9653[0] = var20;
                            class228.field3257[0] = var17.field5618;
                            class621.field8282[0] = var17.field5619;
                            class330.field4714[0] = var17.field5613;
                            class416.field5737[0] = 256;
                        }
                    }
                }
            }
            if ((arg12 - 1) > arg3) {
                int var21 = arg6[arg3 + 1][arg0 - 1] & 0xFF;
                if (var21 > 0) {
                    class403 var22 = this.field6048.method2798(var21 - 1, -60);
                    if (var22.field5624 != -1 && var22.field5627) {
                        byte var23 = arg2[arg3 + 1][arg0 - 1];
                        int var24 = arg8[arg3 + 1][arg0 - 1] * 2 + 6 & 0x7;
                        int var25 = class207.method1385(true, var22, arg9);
                        if (class26.field427[var23][var24]) {
                            class371.field5170[2] = var22.field5624;
                            class694.field9653[2] = var25;
                            class228.field3257[2] = var22.field5618;
                            class621.field8282[2] = var22.field5619;
                            class330.field4714[2] = var22.field5613;
                            class416.field5737[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg0 < (arg7 - 1)) {
            if (arg3 > 0) {
                int var26 = arg6[arg3 - 1][arg0 + 1] & 0xFF;
                if (var26 > 0) {
                    class403 var27 = this.field6048.method2798(var26 - 1, -50);
                    if (var27.field5624 != -1 && var27.field5627) {
                        byte var28 = arg2[arg3 - 1][arg0 + 1];
                        int var29 = arg8[arg3 - 1][arg0 + 1] * 2 + 2 & 0x7;
                        int var30 = class207.method1385(true, var27, arg9);
                        if (class26.field427[var28][var29]) {
                            class371.field5170[6] = var27.field5624;
                            class694.field9653[6] = var30;
                            class228.field3257[6] = var27.field5618;
                            class621.field8282[6] = var27.field5619;
                            class330.field4714[6] = var27.field5613;
                            class416.field5737[6] = 64;
                        }
                    }
                }
            }
            if (arg12 - 1 > arg3) {
                int var31 = arg6[arg3 + 1][arg0 + 1] & 0xFF;
                if (var31 > 0) {
                    class403 var32 = this.field6048.method2798(var31 - 1, -9);
                    if (var32.field5624 != -1 && var32.field5627) {
                        byte var33 = arg2[arg3 + 1][arg0 + 1];
                        int var34 = arg8[arg3 + 1][arg0 + 1] * 2 & 0x7;
                        int var35 = class207.method1385(true, var32, arg9);
                        if (class26.field427[var33][var34]) {
                            class371.field5170[4] = var32.field5624;
                            class694.field9653[4] = var35;
                            class228.field3257[4] = var32.field5618;
                            class621.field8282[4] = var32.field5619;
                            class330.field4714[4] = var32.field5613;
                            class416.field5737[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg0 > 0) {
            int var36 = arg6[arg3][arg0 - 1] & 0xFF;
            if (var36 > 0) {
                class403 var37 = this.field6048.method2798(var36 - 1, -20);
                if (var37.field5624 != -1) {
                    byte var38 = arg2[arg3][arg0 - 1];
                    byte var39 = arg8[arg3][arg0 - 1];
                    if (var37.field5627) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class207.method1385(true, var37, arg9);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class26.field427[var38][var41] && class330.field4714[var40] <= var37.field5613) {
                                class371.field5170[var40] = var37.field5624;
                                class694.field9653[var40] = var42;
                                class228.field3257[var40] = var37.field5618;
                                class621.field8282[var40] = var37.field5619;
                                if (class330.field4714[var40] == var37.field5613) {
                                    class416.field5737[var40] = class446.method2556(class416.field5737[var40], 32);
                                } else {
                                    class416.field5737[var40] = 32;
                                }
                                class330.field4714[var40] = var37.field5613;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg13 & 0x3]) {
                            arg1[0] = class650.field8635[var38][class48.method346(3, var39 + 2)];
                        }
                    } else if (!var15[arg13 & 0x3]) {
                        arg1[0] = class349.field4915[var38][class48.method346(3, var39 + 2)];
                    }
                }
            }
        }
        if ((arg7 - 1) > arg0) {
            int var44 = arg6[arg3][arg0 + 1] & 0xFF;
            if (var44 > 0) {
                class403 var45 = this.field6048.method2798(var44 - 1, -112);
                if (var45.field5624 != -1) {
                    byte var46 = arg2[arg3][arg0 + 1];
                    byte var47 = arg8[arg3][arg0 + 1];
                    if (var45.field5627) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class207.method1385(true, var45, arg9);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class26.field427[var46][var49] && class330.field4714[var48] <= var45.field5613) {
                                class371.field5170[var48] = var45.field5624;
                                class694.field9653[var48] = var50;
                                class228.field3257[var48] = var45.field5618;
                                class621.field8282[var48] = var45.field5619;
                                if (class330.field4714[var48] == var45.field5613) {
                                    class416.field5737[var48] = class446.method2556(class416.field5737[var48], 16);
                                } else {
                                    class416.field5737[var48] = 16;
                                }
                                class330.field4714[var48] = var45.field5613;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg13 + 2 & 0x3]) {
                            arg1[2] = class650.field8635[var46][class48.method346(3, var47)];
                        }
                    } else if (!var15[arg13 + 2 & 0x3]) {
                        arg1[2] = class349.field4915[var46][class48.method346(3, var47)];
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var52 = arg6[arg3 - 1][arg0] & 0xFF;
            if (var52 > 0) {
                class403 var53 = this.field6048.method2798(var52 - 1, -64);
                if (var53.field5624 != -1) {
                    byte var54 = arg2[arg3 - 1][arg0];
                    byte var55 = arg8[arg3 - 1][arg0];
                    if (var53.field5627) {
                        int var56 = 6;
                        int var57 = (var55 * 2) + 4;
                        int var58 = class207.method1385(true, var53, arg9);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class26.field427[var54][var57] && class330.field4714[var56] <= var53.field5613) {
                                class371.field5170[var56] = var53.field5624;
                                class694.field9653[var56] = var58;
                                class228.field3257[var56] = var53.field5618;
                                class621.field8282[var56] = var53.field5619;
                                if (class330.field4714[var56] == var53.field5613) {
                                    class416.field5737[var56] = class446.method2556(class416.field5737[var56], 8);
                                } else {
                                    class416.field5737[var56] = 8;
                                }
                                class330.field4714[var56] = var53.field5613;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg13 + 3 & 0x3]) {
                            arg1[3] = class650.field8635[var54][class48.method346(var55 + 1, 3)];
                        }
                    } else if (!var15[arg13 + 3 & 0x3]) {
                        arg1[3] = class349.field4915[var54][class48.method346(3, var55 + 1)];
                    }
                }
            }
        }
        if ((arg12 - 1) > arg3) {
            int var60 = arg6[arg3 + 1][arg0] & 0xFF;
            if (var60 > 0) {
                class403 var61 = this.field6048.method2798(var60 - 1, -92);
                if (var61.field5624 != -1) {
                    byte var62 = arg2[arg3 + 1][arg0];
                    byte var63 = arg8[arg3 + 1][arg0];
                    if (var61.field5627) {
                        int var64 = 4;
                        int var65 = (var63 * 2) + 6;
                        int var66 = class207.method1385(true, var61, arg9);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class26.field427[var62][var65] && class330.field4714[var64] <= var61.field5613) {
                                class371.field5170[var64] = var61.field5624;
                                class694.field9653[var64] = var66;
                                class228.field3257[var64] = var61.field5618;
                                class621.field8282[var64] = var61.field5619;
                                if (class330.field4714[var64] == var61.field5613) {
                                    class416.field5737[var64] = class446.method2556(class416.field5737[var64], 4);
                                } else {
                                    class416.field5737[var64] = 4;
                                }
                                class330.field4714[var64] = var61.field5613;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg13 + 1 & 0x3]) {
                            arg1[1] = class650.field8635[var62][class48.method346(3, var63 + 3)];
                        }
                    } else if (!var15[arg13 + 1 & 0x3]) {
                        arg1[1] = class349.field4915[var62][class48.method346(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg11 < 46 || arg5 == null) {
            return;
        }
        int var68 = class207.method1385(true, arg5, arg9);
        if (!arg5.field5627) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg13 * 2) & 0x7;
            if (class26.field427[arg10][var69] && class330.field4714[var70] <= arg5.field5613) {
                class371.field5170[var70] = arg5.field5624;
                class694.field9653[var70] = var68;
                class228.field3257[var70] = arg5.field5618;
                class621.field8282[var70] = arg5.field5619;
                if (class330.field4714[var70] == arg5.field5613) {
                    class416.field5737[var70] = class446.method2556(class416.field5737[var70], 2);
                } else {
                    class416.field5737[var70] = 2;
                }
                class330.field4714[var70] = arg5.field5613;
            }
        }
        return;
    }
}
