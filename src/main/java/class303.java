import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class303 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Z")
    private boolean field4788 = false;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public int field4803 = 0;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public int field4808 = 0;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static volatile int field4809 = -1;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "[I")
    public static int[] field4793 = new int[2];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public int field4787;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    private int field4790;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public int field4792;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public int field4794;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public int field4804;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public int field4806;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public int field4807;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "J")
    public long field4799;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILpi;I)V", line = 5)
    private final void method2086(int arg0, class336 arg1, int arg2) {
        if (arg0 != 0) {
            return;
        }
        if (arg2 == 1) {
            this.field4790 = arg1.method2339((byte) -46);
        } else if (arg2 == 2) {
            arg1.method2364(-9069);
        } else if (arg2 == 3) {
            this.field4792 = arg1.method2338((byte) 115);
            this.field4805 = arg1.method2338((byte) 87);
            this.field4806 = arg1.method2338((byte) 26);
        } else if (arg2 == 4) {
            this.field4807 = arg1.method2364(-9069);
            this.field4794 = arg1.method2338((byte) 94);
        } else if (arg2 == 6) {
            this.field4786 = arg1.method2364(-9069);
        } else if (arg2 == 8) {
            this.field4808 = 1;
        } else if (arg2 == 9) {
            this.field4803 = 1;
        } else if (arg2 == 10) {
            this.field4788 = true;
        }
        field4800++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Z", line = 68)
    public static final boolean method2087(int arg0) {
        field4801++;
        if (class265.field4275) {
            try {
                return !(Boolean) class251.method1754("showingVideoAd", (byte) -104, class85.field1369.field910);
            } catch (Throwable var3) {
            }
        }
        int var2 = 106 / ((arg0 - 9) / 37);
        return true;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 87)
    public static void method2088(int arg0) {
        if (arg0 != 24799) {
            method2088(-78);
        }
        field4793 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II[Lao;IZ[BII)[I", line = 98)
    public static final int[] method2089(int arg0, int arg1, class200[] arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        field4810++;
        if (!arg4) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg3 + var9 > 0 && (arg3 + var9) < 103 && (arg6 + var10) > 0 && (arg6 + var10) < 103) {
                            arg2[var8].field3418[arg3 + var9][arg6 + var10] = class36.method319(arg2[var8].field3418[arg3 + var9][arg6 + var10], -2097153);
                        }
                    }
                }
            }
        }
        if (arg7 != 4706) {
            return (int[]) null;
        }
        byte var11;
        if (arg4) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class336 var12 = new class336(arg5);
        int var13 = arg1 + arg3;
        int var14 = arg0 + arg6;
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class259.method1798(false, var12, 0, var13 + var16, (byte) -105, arg4, var14 + var17, 0, 0, var15, arg6 + var17, var16 - -arg3);
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var12.field5342.length > var12.field5353) {
            int var20 = var12.method2364(-9069);
            if (var20 == 128) {
                var18 = true;
                class286.field4563[0] = var12.method2339((byte) -46);
                class286.field4563[1] = var12.method2326(93);
                class286.field4563[2] = var12.method2326(-78);
                class286.field4563[3] = var12.method2326(-40);
                class286.field4563[4] = var12.method2339((byte) -46);
            } else {
                if (var20 != 129) {
                    var12.field5353--;
                    break;
                }
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var12.method2323(102);
                    if (var22 == 0) {
                        int var32 = arg3;
                        if (arg3 < 0) {
                            var32 = 0;
                        } else if (arg3 >= 104) {
                            var32 = 104;
                        }
                        int var33 = arg3 + 64;
                        int var34 = arg6;
                        if (var33 < 0) {
                            var33 = 0;
                        } else if (var33 >= 104) {
                            var33 = 104;
                        }
                        if (arg6 < 0) {
                            var34 = 0;
                        } else if (arg6 >= 104) {
                            var34 = 104;
                        }
                        int var35 = arg6 + 64;
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 >= 104) {
                            var35 = 104;
                        }
                        while (var32 < var33) {
                            while (var35 > var34) {
                                class41.field615[var21][var32][var34] = 0;
                                var34++;
                            }
                            var32++;
                        }
                    } else if (var22 == 1) {
                        for (int var27 = 0; var27 < 64; var27 += 4) {
                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                byte var29 = var12.method2323(116);
                                for (int var30 = var27 + arg3; var30 < arg3 + var27 + 4; var30++) {
                                    for (int var31 = var28 + arg6; var31 < (arg6 + var28 + 4); var31++) {
                                        if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                            class41.field615[var21][var30][var31] = var29;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var23 = arg3;
                        if (arg3 < 0) {
                            var23 = 0;
                        } else if (arg3 >= 104) {
                            var23 = 104;
                        }
                        int var24 = arg3 + 64;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        int var25 = arg6 + 64;
                        int var26 = arg6;
                        if (arg6 < 0) {
                            var26 = 0;
                        } else if (arg6 >= 104) {
                            var26 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        while (var24 > var23) {
                            while (var26 < var25) {
                                class41.field615[var21][var23][var26] = class41.field615[var21 - 1][var23][var26];
                                var26++;
                            }
                            var23++;
                        }
                    }
                }
                var19 = true;
            }
        }
        if (class43.field680 && !arg4) {
            class36 var36 = null;
            label287: while (true) {
                while (true) {
                    while (var12.field5353 < var12.field5342.length) {
                        int var37 = var12.method2364(-9069);
                        if (var37 == 0) {
                            var36 = new class36(var12);
                        } else if (var37 == 1) {
                            int var38 = var12.method2364(-9069);
                            if (var38 > 0) {
                                for (int var39 = 0; var39 < var38; var39++) {
                                    class114 var40 = new class114(var12);
                                    if (var40.field1919 == 31) {
                                        class351 var41 = class265.method1823(var12.method2339((byte) -46), -29180);
                                        var40.method968(arg7 ^ 0xFFFFEDFB, var41.field5557, var41.field5566, var41.field5565, var41.field5564);
                                    }
                                    var40.field1920 += arg6 << 7;
                                    var40.field1906 += arg3 << 7;
                                    int var42 = var40.field1906 >> 7;
                                    int var43 = var40.field1920 >> 7;
                                    if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                                        var40.field1905 = (class152.field2683[1][var42][var43] & 0x2) != 0;
                                        var40.field1922 = class137.field2487[var40.field1914][var42][var43] - var40.field1922;
                                        class245.method1720(var40);
                                    }
                                }
                            }
                        } else if (var37 == 2) {
                            if (var36 == null) {
                                var36 = new class36();
                            }
                            var36.method318((byte) -88, var12);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (var36 == null) {
                        var36 = new class36();
                    }
                    for (int var44 = 0; var44 < 8; var44++) {
                        for (int var45 = 0; var45 < 8; var45++) {
                            int var46 = (arg3 >> 3) + var44;
                            int var47 = (arg6 >> 3) + var45;
                            if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                                client.field4377[var46][var47] = var36;
                            }
                        }
                    }
                    break label287;
                }
            }
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg3 >> 2) + var49;
                        int var52 = (arg6 >> 2) + var50;
                        if (var51 >= 0 && var51 < 26 && var52 >= 0 && var52 < 26) {
                            class41.field615[var48][var51][var52] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class286.field4563 : null;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V", line = 516)
    public static final void method2090(int arg0) {
        field4791++;
        if (class126.field2168 == 0 || class126.field2168 == 5) {
            return;
        }
        try {
            if ((++class48.field737) > 2000) {
                if (class279.field4426 != null) {
                    class279.field4426.method177(false);
                    class279.field4426 = null;
                }
                if (class21.field314 >= 1) {
                    class86.field1378 = -5;
                    class126.field2168 = 0;
                    return;
                }
                if (class86.field1377 == class184.field3122) {
                    class86.field1377 = class140.field2566;
                } else {
                    class86.field1377 = class184.field3122;
                }
                class21.field314++;
                class48.field737 = 0;
                class126.field2168 = 1;
            }
            if (class126.field2168 == 1) {
                class356.field5613 = class85.field1369.method541(false, class86.field1377, class64.field1004);
                class126.field2168 = 2;
            }
            if (class126.field2168 == 2) {
                if (class356.field5613.field709 == 2) {
                    throw new IOException();
                }
                if (class356.field5613.field709 != 1) {
                    return;
                }
                class279.field4426 = new class17((Socket) class356.field5613.field712, class85.field1369);
                class356.field5613 = null;
                long var1 = class38.field550 = class142.method1151(class58.field902, -90);
                class341.field5443.field5353 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class341.field5443.method2370(14, (byte) -20);
                class341.field5443.method2370(var3, (byte) -20);
                class279.field4426.method178(0, 2, class341.field5443.field5342, false);
                if (class135.field2362 != null) {
                    class135.field2362.method1281((byte) 103);
                }
                if (class320.field5064 != null) {
                    class320.field5064.method1281((byte) 127);
                }
                int var4 = class279.field4426.method180(0);
                if (class135.field2362 != null) {
                    class135.field2362.method1281((byte) 106);
                }
                if (class320.field5064 != null) {
                    class320.field5064.method1281((byte) 97);
                }
                if (var4 != 0) {
                    class86.field1378 = var4;
                    class126.field2168 = 0;
                    class279.field4426.method177(false);
                    class279.field4426 = null;
                    return;
                }
                class126.field2168 = 3;
            }
            if (class126.field2168 == 3) {
                if (class279.field4426.method175(-21329) < 8) {
                    return;
                }
                class279.field4426.method179(class276.field4398.field5342, 0, 8, 9395);
                int[] var5 = new int[4];
                class276.field4398.field5353 = 0;
                class352.field5577 = class276.field4398.method2367((byte) 29);
                var5[3] = (int) class352.field5577;
                class341.field5443.field5353 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class352.field5577 >> 32);
                class341.field5443.method2370(10, (byte) -20);
                class341.field5443.method2320(-6128, var5[0]);
                class341.field5443.method2320(-6128, var5[1]);
                class341.field5443.method2320(-6128, var5[2]);
                class341.field5443.method2320(-6128, var5[3]);
                class341.field5443.method2333(class142.method1151(class58.field902, -115), -107);
                class341.field5443.method2349(true, class276.field4388);
                class341.field5443.method2330(class226.field3809, class137.field2545, 0);
                class80.field1309.field5353 = 0;
                if (class88.field1397 == 40) {
                    class80.field1309.method2370(18, (byte) -20);
                } else {
                    class80.field1309.method2370(16, (byte) -20);
                }
                class80.field1309.method2359(-805606200, class341.field5443.field5353 + (class283.method1927(true, class256.field4125) + 163));
                class80.field1309.method2320(-6128, 546);
                class80.field1309.method2370(class52.field818, (byte) -20);
                class80.field1309.method2370(class255.field4109 ? 1 : 0, (byte) -20);
                class80.field1309.method2370(1, (byte) -20);
                class80.field1309.method2370(class209.method1554(-126), (byte) -20);
                class80.field1309.method2359(-805606200, class313.field4973);
                class80.field1309.method2359(-805606200, class188.field3152);
                class80.field1309.method2370(class30.field440, (byte) -20);
                class152.method1199(class80.field1309, 24);
                class80.field1309.method2349(true, class256.field4125);
                class80.field1309.method2320(-6128, class201.field3433);
                class80.field1309.method2320(-6128, class108.method948(-88));
                class257.field4149 = true;
                class80.field1309.method2359(-805606200, class227.field3818);
                class80.field1309.method2320(-6128, class266.field4288.method443(-2065));
                class80.field1309.method2320(-6128, class105.field1752.method443(-2065));
                class80.field1309.method2320(-6128, class104.field1742.method443(-2065));
                class80.field1309.method2320(-6128, class27.field369.method443(-2065));
                class80.field1309.method2320(-6128, class207.field3517.method443(-2065));
                class80.field1309.method2320(-6128, class92.field1446.method443(-2065));
                class80.field1309.method2320(-6128, class179.field3030.method443(-2065));
                class80.field1309.method2320(-6128, class262.field4248.method443(-2065));
                class80.field1309.method2320(-6128, class321.field5091.method443(-2065));
                class80.field1309.method2320(-6128, class29.field405.method443(-2065));
                class80.field1309.method2320(-6128, class26.field366.method443(-2065));
                class80.field1309.method2320(-6128, class86.field1374.method443(-2065));
                class80.field1309.method2320(-6128, class24.field344.method443(-2065));
                class80.field1309.method2320(-6128, class188.field3149.method443(-2065));
                class80.field1309.method2320(-6128, class158.field2801.method443(-2065));
                class80.field1309.method2320(-6128, class144.field2625.method443(-2065));
                class80.field1309.method2320(-6128, class80.field1318.method443(-2065));
                class80.field1309.method2320(-6128, class254.field4099.method443(-2065));
                class80.field1309.method2320(-6128, class215.field3614.method443(-2065));
                class80.field1309.method2320(-6128, class124.field2148.method443(-2065));
                class80.field1309.method2320(-6128, class249.field4038.method443(-2065));
                class80.field1309.method2320(-6128, class341.field5445.method443(-2065));
                class80.field1309.method2320(-6128, class122.field2130.method443(-2065));
                class80.field1309.method2320(-6128, class166.field2895.method443(-2065));
                class80.field1309.method2320(-6128, class305.field4838.method443(-2065));
                class80.field1309.method2320(-6128, class277.field4408.method443(-2065));
                class80.field1309.method2320(-6128, class28.field378.method443(-2065));
                class80.field1309.method2320(-6128, class177.field3011.method443(-2065));
                class80.field1309.method2320(-6128, class276.field4392.method443(-2065));
                class80.field1309.method2345((byte) -100, class341.field5443.field5353, class341.field5443.field5342, 0);
                class279.field4426.method178(0, class80.field1309.field5353, class80.field1309.field5342, false);
                class341.field5443.method34(101, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class276.field4398.method34(64, var5);
                class126.field2168 = 4;
            }
            int var7 = -78 / ((arg0 - 27) / 61);
            if (class126.field2168 == 4) {
                if (class279.field4426.method175(-21329) < 1) {
                    return;
                }
                int var8 = class279.field4426.method180(0);
                if (var8 == 21) {
                    class126.field2168 = 7;
                } else if (var8 == 29) {
                    class126.field2168 = 10;
                } else if (var8 == 1) {
                    class126.field2168 = 5;
                    class86.field1378 = var8;
                    return;
                } else if (var8 == 2) {
                    class126.field2168 = 8;
                } else if (var8 == 15) {
                    class86.field1378 = var8;
                    class126.field2168 = 0;
                    return;
                } else if (var8 == 23 && class21.field314 < 1) {
                    class48.field737 = 0;
                    class126.field2168 = 1;
                    class21.field314++;
                    class279.field4426.method177(false);
                    class279.field4426 = null;
                    return;
                } else {
                    class126.field2168 = 0;
                    class86.field1378 = var8;
                    class279.field4426.method177(false);
                    class279.field4426 = null;
                    return;
                }
            }
            if (class126.field2168 == 6) {
                class341.field5443.field5353 = 0;
                class341.field5443.method26(17, 7);
                class279.field4426.method178(0, class341.field5443.field5353, class341.field5443.field5342, false);
                class126.field2168 = 4;
                return;
            }
            if (class126.field2168 == 7) {
                if (class279.field4426.method175(-21329) >= 1) {
                    class49.field763 = (class279.field4426.method180(0) + 3) * 60;
                    class126.field2168 = 0;
                    class86.field1378 = 21;
                    class279.field4426.method177(false);
                    class279.field4426 = null;
                    return;
                }
                return;
            }
            if (class126.field2168 == 10) {
                if (class279.field4426.method175(-21329) < 1) {
                    return;
                }
                class310.field4911 = class279.field4426.method180(0);
                class86.field1378 = 29;
                class126.field2168 = 0;
                class279.field4426.method177(false);
                class279.field4426 = null;
                return;
            }
            if (class126.field2168 == 8) {
                if (class279.field4426.method175(-21329) < 14) {
                    return;
                }
                class279.field4426.method179(class276.field4398.field5342, 0, 14, 9395);
                class276.field4398.field5353 = 0;
                class158.field2787 = class276.field4398.method2364(-9069);
                class5.field79 = class276.field4398.method2364(-9069);
                class37.field537 = class276.field4398.method2364(-9069) == 1;
                class331.field5268 = class276.field4398.method2364(-9069) == 1;
                class34.field487 = class276.field4398.method2364(-9069) == 1;
                class330.field5256 = class276.field4398.method2364(-9069) == 1;
                class241.field3943 = class276.field4398.method2364(-9069) == 1;
                class316.field5010 = class276.field4398.method2339((byte) -46);
                class261.field4227 = class276.field4398.method2364(-9069) == 1;
                class36.field527 = class276.field4398.method2364(-9069) == 1;
                class99.method854(-7790, class36.field527);
                class1.method7(class36.field527, (byte) 35);
                if (!class255.field4109) {
                    if ((!class37.field537 || class34.field487) && !class261.field4227) {
                        try {
                            class251.method1754("unzap", (byte) -104, class85.field1369.field910);
                        } catch (Throwable var15) {
                        }
                    } else {
                        try {
                            class251.method1754("zap", (byte) -104, class85.field1369.field910);
                        } catch (Throwable var14) {
                        }
                    }
                }
                try {
                    class251.method1754("loggedin", (byte) -104, class85.field1369.field910);
                } catch (Throwable var13) {
                }
                class40.field592 = class276.field4398.method36(43);
                class308.field4906 = class276.field4398.method2339((byte) -46);
                class126.field2168 = 9;
            }
            if (class126.field2168 == 9) {
                if (class279.field4426.method175(-21329) >= class308.field4906) {
                    class276.field4398.field5353 = 0;
                    class279.field4426.method179(class276.field4398.field5342, 0, class308.field4906, 9395);
                    class86.field1378 = 2;
                    class126.field2168 = 0;
                    class21.method212((byte) 35);
                    class144.field2626 = -1;
                    class330.method2289(149, false);
                    class40.field592 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var16) {
            if (class279.field4426 != null) {
                class279.field4426.method177(false);
                class279.field4426 = null;
            }
            if (class21.field314 >= 1) {
                class86.field1378 = -4;
                class126.field2168 = 0;
            } else {
                class48.field737 = 0;
                class21.field314++;
                class126.field2168 = 1;
                if (class86.field1377 == class184.field3122) {
                    class86.field1377 = class140.field2566;
                } else {
                    class86.field1377 = class184.field3122;
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V", line = 909)
    public final void method2091(int arg0) {
        if (arg0 != 26889) {
            return;
        }
        field4796++;
        this.field4795 = class62.field961[this.field4790];
        this.field4804 = (int) Math.sqrt((double) (this.field4805 * this.field4805 + this.field4806 * this.field4806 + this.field4792 * this.field4792));
        if (this.field4794 == 0) {
            this.field4794 = 1;
        }
        if (this.field4807 == 0) {
            this.field4799 = 2147483647L;
        } else if (this.field4807 == 1) {
            this.field4799 = (long) (this.field4804 * 8 / this.field4794);
            this.field4799 *= this.field4799;
        } else if (this.field4807 == 2) {
            this.field4799 = (long) (this.field4804 * 8 / this.field4794);
        }
        if (this.field4788) {
            this.field4804 *= -1;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lpi;Z)V", line = 967)
    public final void method2092(class336 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2364(-9069);
            if (var3 == 0) {
                field4797++;
                if (arg1) {
                    this.field4807 = 78;
                }
                return;
            }
            this.method2086(0, arg0, var3);
        }
    }
}
