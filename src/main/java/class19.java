import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 extends class113 {

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "[S")
    private short[] field422 = new short[6];

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "I")
    private int field430 = 0;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
    private int field428 = 0;

    @OriginalMember(owner = "client!cd", name = "ob", descriptor = "I")
    private int field434 = 0;

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "[S")
    private short[] field426 = new short[6];

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    private int field421 = 128;

    @OriginalMember(owner = "client!cd", name = "vb", descriptor = "I")
    private int field441 = 128;

    @OriginalMember(owner = "client!cd", name = "zb", descriptor = "I")
    public int field445 = -1;

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "Lu;")
    public static class135 field427 = class87.method676((byte) -87, "overlay_multiway");

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "Lu;")
    public static class135 field418 = class87.method676((byte) -44, "scape main");

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "I")
    public static int field425 = -1;

    @OriginalMember(owner = "client!cd", name = "xb", descriptor = "I")
    public static int field443 = 0;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "Lu;")
    public static class135 field423 = class87.method676((byte) -103, "huffman");

    @OriginalMember(owner = "client!cd", name = "rb", descriptor = "Le;")
    public static class29 field437 = new class29(128);

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!cd", name = "mb", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!cd", name = "nb", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!cd", name = "pb", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!cd", name = "qb", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!cd", name = "sb", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!cd", name = "tb", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!cd", name = "ub", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!cd", name = "yb", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "Lae;")
    public static class6 field419;

    @OriginalMember(owner = "client!cd", name = "wb", descriptor = "Lae;")
    public static class6 field442;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method139(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field440++;
        int var8 = 124 % ((arg4 + 70) / 34);
        if (arg1 < 1 || arg5 < 1 || arg1 > 102 || arg5 > 102) {
            return;
        }
        if (class100.field2422 && class136.field3301 != arg6) {
            return;
        }
        int var9 = 0;
        if (arg2 == 0) {
            var9 = class100.field2418.method1019(arg6, arg1, arg5);
        }
        if (arg2 == 1) {
            var9 = class100.field2418.method991(arg6, arg1, arg5);
        }
        boolean var10 = true;
        boolean var11 = false;
        boolean var12 = false;
        if (arg2 == 2) {
            var9 = class100.field2418.method1013(arg6, arg1, arg5);
        }
        if (arg2 == 3) {
            var9 = class100.field2418.method1011(arg6, arg1, arg5);
        }
        if (var9 != 0) {
            int var13 = class100.field2418.method998(arg6, arg1, arg5, var9);
            int var14 = var13 & 0x1F;
            int var15 = var9 >> 14 & 0x7FFF;
            int var16 = var13 >> 6 & 0x3;
            if (arg2 == 0) {
                class100.field2418.method1006(arg6, arg1, arg5);
                class119 var17 = class2.method9(false, var15);
                if (var17.field2834 != 0) {
                    class58.field1437[arg6].method807(arg1, var14, arg5, var17.field2862, var16, -5890);
                }
            }
            if (arg2 == 1) {
                class100.field2418.method1028(arg6, arg1, arg5);
            }
            if (arg2 == 2) {
                class100.field2418.method1010(arg6, arg1, arg5);
                class119 var18 = class2.method9(false, var15);
                if (var18.field2890 + arg1 > 103 || arg5 + var18.field2890 > 103 || arg1 + var18.field2860 > 103 || var18.field2860 + arg5 > 103) {
                    return;
                }
                if (var18.field2834 != 0) {
                    class58.field1437[arg6].method810(var16, (byte) -38, var18.field2860, arg1, arg5, var18.field2890, var18.field2862);
                }
            }
            if (arg2 == 3) {
                class100.field2418.method1038(arg6, arg1, arg5);
                class119 var19 = class2.method9(false, var15);
                if (var19.field2834 == 1) {
                    class58.field1437[arg6].method812(arg1, arg5, false);
                }
            }
        }
        if (arg0 < 0) {
            return;
        }
        int var20 = arg6;
        if (arg6 < 3 && (client.field525[1][arg1][arg5] & 0x2) == 2) {
            var20 = arg6 + 1;
        }
        class50.method376(arg6, arg7, arg1, arg5, class100.field2418, 4, arg0, arg3, var20, class58.field1437[arg6]);
        return;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILic;I)V")
    private final void method140(int arg0, class59 arg1, int arg2) {
        field424++;
        if (arg0 == 1) {
            this.field435 = arg1.method483((byte) 24);
        } else if (arg0 == 2) {
            this.field445 = arg1.method483((byte) 24);
        } else if (arg0 == 4) {
            this.field421 = arg1.method483((byte) 24);
        } else if (arg0 == 5) {
            this.field441 = arg1.method483((byte) 24);
        } else if (arg0 == 6) {
            this.field434 = arg1.method483((byte) 24);
        } else if (arg0 == 7) {
            this.field428 = arg1.method480(0);
        } else if (arg0 == 8) {
            this.field430 = arg1.method480(0);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field426[arg0 - 40] = (short) arg1.method483((byte) 24);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field422[arg0 - 50] = (short) arg1.method483((byte) 24);
        }
        if (arg2 != 40) {
            this.method142(75, null);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static final void method141(byte arg0) {
        field436++;
        class48.method363(-111);
        if (class148.field3692 == 1) {
            class101.field2442[class44.field1069 / 100].method76(class90.field2116 - 8 - 4, class145.field3517 + -8 + -4);
        }
        if (class148.field3692 == 2) {
            class101.field2442[class44.field1069 / 100 + 4].method76(class90.field2116 - 12, class145.field3517 + -8 + -4);
        }
        if (class95.field2294 != -1) {
            class107.method865(true, class95.field2294);
            class101.method830(4, 0, 334, 512, 0, 0, class95.field2294);
        }
        if (class106.field2552 != -1) {
            class107.method865(true, class106.field2552);
            class101.method830(0, 0, 334, 512, 0, 0, class106.field2552);
        }
        class82.method636(0);
        if (!class128.field3077) {
            class77.method619((byte) 22);
            class10.method53(408);
        } else if (class94.field2237 == 0) {
            class60.method505(0);
        }
        if (class138.field3350 == 1) {
            class1.field6.method76(472, 296);
        }
        if (class103.field2498) {
            short var1 = 507;
            byte var2 = 20;
            class93.field2200.method116(class107.method867(2, new class135[] { class120.field2897, class68.method547(-1, class116.field2770) }), var1, var2, 16776960);
            int var3 = 16776960;
            int var10 = var2 + 15;
            Runtime var4 = Runtime.getRuntime();
            int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
            if (var5 > 32768 && class100.field2422) {
                var3 = 16711680;
            }
            if (var5 > 65536 && !class100.field2422) {
                var3 = 16711680;
            }
            class93.field2200.method116(class107.method867(2, new class135[] { class116.field2797, class68.method547(-1, var5), class55.field1287 }), var1, var10, var3);
            var10 += 15;
            if (class126.field3004) {
                class93.field2200.method116(class85.field2039, var1, var10, 16711680);
                var10 += 15;
                class126.field3004 = false;
            }
            if (class95.field2306) {
                class93.field2200.method116(class56.field1372, var1, var10, 16711680);
                class95.field2306 = false;
                var10 += 15;
            }
            if (class128.field3081) {
                class93.field2200.method116(class68.field1664, var1, var10, 16711680);
                class128.field3081 = false;
                var10 += 15;
            }
        }
        int var6 = -2 % ((-arg0 - 42) / 41);
        if (class63.field1586 == 0) {
            return;
        }
        int var7 = class63.field1586 / 50;
        int var8 = var7 / 60;
        int var9 = var7 % 60;
        if (var9 >= 10) {
            class93.field2200.method121(class107.method867(2, new class135[] { class5.field123, class68.method547(-1, var8), class138.field3345, class68.method547(-1, var9) }), 4, 329, 16776960);
        } else {
            class93.field2200.method121(class107.method867(2, new class135[] { class5.field123, class68.method547(-1, var8), class65.field1617, class68.method547(-1, var9) }), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILic;)V")
    public final void method142(int arg0, class59 arg1) {
        field429++;
        while (true) {
            int var3 = arg1.method480(0);
            if (var3 == 0) {
                if (arg0 <= 72) {
                    this.field430 = 7;
                    return;
                } else {
                    return;
                }
            }
            this.method140(var3, arg1, 40);
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
    public static final void method143(int arg0) {
        if (arg0 > -16) {
            method143(-3);
        }
        while (class23.field581.method931(class21.field499, true) >= 11) {
            int var1 = class23.field581.method934((byte) 104, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class131.field3166[var1] == null) {
                class131.field3166[var1] = new class145();
                var2 = true;
                if (class78.field1844[var1] != null) {
                    class131.field3166[var1].method1184(true, class78.field1844[var1]);
                }
            }
            class108.field2600[class14.field329++] = var1;
            class145 var3 = class131.field3166[var1];
            var3.field184 = class126.field2998;
            int var4 = class23.field581.method934((byte) 118, 5);
            int var5 = class23.field581.method934((byte) 118, 1);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var6 = class23.field581.method934((byte) 108, 1);
            if (var6 == 1) {
                class97.field2358[class126.field3009++] = var1;
            }
            int var7 = class139.field3390[class23.field581.method934((byte) 105, 3)];
            if (var2) {
                var3.field230 = var7;
            }
            int var8 = class23.field581.method934((byte) 112, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method51(var5 == 1, 101, class116.field2789.field192[0] + var4, class116.field2789.field162[0] + var8);
        }
        field420++;
        class23.field581.method933((byte) 106);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBIIIIIII[Lve;I)V")
    public static final void method144(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class146[] arg10, int arg11) {
        if (arg2 != -25) {
            return;
        }
        field438++;
        if (arg7 < arg1 || arg9 > arg11 || arg4 <= arg7 || arg5 <= arg11) {
            return;
        }
        for (int var12 = 0; var12 < arg10.length; var12++) {
            class146 var13 = arg10[var12];
            if (var13 != null && var13.field3611 == arg0 && (!var13.field3628 || !class77.method618(var13, -1))) {
                int var14 = var13.field3575 + arg1 - arg6;
                int var15 = var13.field3669 + arg9 - arg8;
                if (var13.field3564 == 8 && arg7 >= var14 && var15 <= arg11 && var13.field3623 + var14 > arg7 && var13.field3661 + var15 > arg11) {
                    class60.field1531 = var12;
                }
                if ((var13.field3605 >= 0 || var13.field3590 != 0) && var14 <= arg7 && arg11 >= var15 && var13.field3623 + var14 > arg7 && var13.field3661 + var15 > arg11) {
                    if (var13.field3605 >= 0) {
                        class129.field3107 = var13.field3605;
                    } else {
                        class129.field3107 = var12;
                    }
                }
                if (var13.field3564 == 0) {
                    if (!var13.field3628 && class77.method618(var13, -1) && !client.method166((byte) 123, arg3, var12)) {
                        continue;
                    }
                    method144(var13.field3595, var14, (byte) -25, arg3, var14 + var13.field3623, var13.field3661 + var15, var13.field3664, arg7, var13.field3671, var15, arg10, arg11);
                    if (var13.field3574 != null) {
                        method144(var13.field3595, var14, (byte) -25, arg3, var13.field3623 + var14, var13.field3661 + var15, var13.field3664, arg7, var13.field3671, var15, var13.field3574, arg11);
                    }
                    if (var13.field3619 > var13.field3661 && !var13.field3628) {
                        class90.method684(arg3, arg11, var13.field3623 + var14, var15, arg7, var13, var13.field3661, -4, var13.field3619);
                    }
                    if (!var13.field3628) {
                        continue;
                    }
                }
                if (var13.field3660 == 1 && var14 <= arg7 && var15 <= arg11 && arg7 < var13.field3623 + var14 && var13.field3661 + var15 > arg11) {
                    boolean var16 = false;
                    if (var13.field3601 != 0) {
                        var16 = class85.method666(arg2 ^ 0xFFFFFDBE, var13);
                    }
                    if (!var16) {
                        class69.field1708++;
                        class95.method785(var13.field3595, (byte) -99, 0, class113.field2742, var13.field3609, 0, 49);
                    }
                }
                if (var13.field3660 == 2 && !class8.field143 && arg7 >= var14 && arg11 >= var15 && var14 + var13.field3623 > arg7 && arg11 < var13.field3661 + var15) {
                    class135 var17 = class40.method301(var13, -5338);
                    if (var17 != null) {
                        class95.method785(var13.field3595, (byte) -99, -1, class107.method867(arg2 ^ -27, new class135[] { class85.field2017, var13.field3572 }), var17, 0, 22);
                        class10.field260++;
                    }
                }
                if (var13.field3660 == 3 && var14 <= arg7 && arg11 >= var15 && arg7 < var13.field3623 + var14 && arg11 < var13.field3661 + var15) {
                    class35.field805++;
                    byte var18;
                    if (arg3 == 3) {
                        var18 = 55;
                    } else {
                        var18 = 58;
                    }
                    class95.method785(var13.field3595, (byte) -99, 0, class113.field2742, class148.field3683, 0, var18);
                }
                if (var13.field3660 == 4 && var14 <= arg7 && var15 <= arg11 && var13.field3623 + var14 > arg7 && var13.field3661 + var15 > arg11) {
                    class78.field1842++;
                    class95.method785(var13.field3595, (byte) -99, 0, class113.field2742, var13.field3609, 0, 44);
                }
                if (var13.field3660 == 5 && var14 <= arg7 && var15 <= arg11 && var13.field3623 + var14 > arg7 && var13.field3661 + var15 > arg11) {
                    class136.field3296++;
                    class95.method785(var13.field3595, (byte) -99, 0, class113.field2742, var13.field3609, 0, 21);
                }
                if (var13.field3660 == 6 && class104.field2507 == -1 && arg7 >= var14 && var15 <= arg11 && arg7 < var13.field3623 + var14 && arg11 < var13.field3661 + var15) {
                    class95.method785(var13.field3595, (byte) -99, -1, class113.field2742, var13.field3609, 0, 46);
                    class148.field3707++;
                }
                if (var13.field3564 == 2) {
                    int var19 = 0;
                    for (int var20 = 0; var20 < var13.field3661; var20++) {
                        for (int var21 = 0; var21 < var13.field3623; var21++) {
                            int var22 = (var13.field3573 + 32) * var21 + var14;
                            int var23 = var15 + (var13.field3562 + 32) * var20;
                            if (var19 < 20) {
                                var23 += var13.field3637[var19];
                                var22 += var13.field3570[var19];
                            }
                            if (var22 <= arg7 && arg11 >= var23 && arg7 < var22 + 32 && arg11 < var23 + 32) {
                                class125.field2991 = var19;
                                class152.field3743 = var13.field3595;
                                if (var13.field3597[var19] > 0) {
                                    class94 var24 = class41.method306(-91, var13.field3597[var19] - 1);
                                    if (class47.field1125 == 1 && class97.method796(21, class23.method196(var13, (byte) -123))) {
                                        if (class94.field2232 != var13.field3595 || class55.field1286 != var19) {
                                            class95.method785(var13.field3595, (byte) -99, var19, class107.method867(2, new class135[] { class141.field3433, class145.field3520, var24.field2284 }), class108.field2607, var24.field2257, 52);
                                            class79.field1859++;
                                        }
                                    } else if (!class8.field143 || !class97.method796(21, class23.method196(var13, (byte) -122))) {
                                        class135[] var25 = var24.field2256;
                                        if (class1.field21) {
                                            var25 = class17.method114((byte) -122, var25);
                                        }
                                        class94.field2285++;
                                        if (class97.method796(21, class23.method196(var13, (byte) -128))) {
                                            for (int var26 = 4; var26 >= 3; var26--) {
                                                if (var25 != null && var25[var26] != null) {
                                                    class30.field728++;
                                                    byte var27;
                                                    if (var26 == 3) {
                                                        var27 = 47;
                                                    } else {
                                                        var27 = 31;
                                                    }
                                                    class95.method785(var13.field3595, (byte) -99, var19, class107.method867(2, new class135[] { class65.field1630, var24.field2284 }), var25[var26], var24.field2257, var27);
                                                } else if (var26 == 4) {
                                                    class53.field1273++;
                                                    class95.method785(var13.field3595, (byte) -99, var19, class107.method867(2, new class135[] { class65.field1630, var24.field2284 }), class139.field3382, var24.field2257, 31);
                                                }
                                            }
                                        }
                                        if (class146.method1201(class23.method196(var13, (byte) -123), true)) {
                                            class95.method785(var13.field3595, (byte) -99, var19, class107.method867(2, new class135[] { class65.field1630, var24.field2284 }), class108.field2607, var24.field2257, 29);
                                            class78.field1843++;
                                        }
                                        if (class97.method796(21, class23.method196(var13, (byte) -124)) && var25 != null) {
                                            for (int var28 = 2; var28 >= 0; var28--) {
                                                if (var25[var28] != null) {
                                                    class38.field877++;
                                                    byte var29 = 0;
                                                    if (var28 == 0) {
                                                        var29 = 18;
                                                    }
                                                    if (var28 == 1) {
                                                        var29 = 36;
                                                    }
                                                    if (var28 == 2) {
                                                        var29 = 57;
                                                    }
                                                    class95.method785(var13.field3595, (byte) -99, var19, class107.method867(arg2 + 27, new class135[] { class65.field1630, var24.field2284 }), var25[var28], var24.field2257, var29);
                                                }
                                            }
                                        }
                                        class135[] var30 = var13.field3622;
                                        if (class1.field21) {
                                            var30 = class17.method114((byte) -104, var30);
                                        }
                                        if (var30 != null) {
                                            for (int var31 = 4; var31 >= 0; var31--) {
                                                if (var30[var31] != null) {
                                                    class141.field3403++;
                                                    byte var32 = 0;
                                                    if (var31 == 0) {
                                                        var32 = 8;
                                                    }
                                                    if (var31 == 1) {
                                                        var32 = 1;
                                                    }
                                                    if (var31 == 2) {
                                                        var32 = 17;
                                                    }
                                                    if (var31 == 3) {
                                                        var32 = 19;
                                                    }
                                                    if (var31 == 4) {
                                                        var32 = 34;
                                                    }
                                                    class95.method785(var13.field3595, (byte) -99, var19, class107.method867(arg2 ^ 0xFFFFFFE5, new class135[] { class65.field1630, var24.field2284 }), var30[var31], var24.field2257, var32);
                                                }
                                            }
                                        }
                                        class95.method785(var13.field3595, (byte) -99, var19, class107.method867(2, new class135[] { class65.field1630, var24.field2284 }), class2.field67, var24.field2257, 1002);
                                    } else if ((class79.field1887 & 0x10) == 16) {
                                        class105.field2522++;
                                        class95.method785(var13.field3595, (byte) -99, var19, class107.method867(2, new class135[] { class4.field102, class145.field3520, var24.field2284 }), class30.field741, var24.field2257, 38);
                                    }
                                }
                            }
                            var19++;
                        }
                    }
                }
                if (var13.field3628) {
                    if (class8.field143) {
                        if (class94.method765(arg2 ^ 0xFFFFFF96, class23.method196(var13, (byte) -128)) && (class79.field1887 & 0x20) == 32 && var14 <= arg7 && var15 <= arg11 && var13.field3623 + var14 > arg7 && arg11 < var13.field3661 + var15) {
                            class95.method785(var13.field3595, (byte) -99, var13.field3580, class107.method867(arg2 + 27, new class135[] { class4.field102, class23.field577, var13.field3565 }), class30.field741, 0, 14);
                            class98.field2366++;
                        }
                    } else if (arg7 >= var14 && arg11 >= var15 && arg7 < var13.field3623 + var14 && var15 + var13.field3661 > arg11) {
                        for (int var33 = 9; var33 >= 5; var33--) {
                            class135 var37 = class32.method258(0, var33, var13);
                            if (var37 != null) {
                                class132.field3184++;
                                class95.method785(var13.field3595, (byte) -99, var13.field3580, var13.field3565, var37, var33 + 1, 26);
                            }
                        }
                        class135 var34 = class40.method301(var13, -5338);
                        if (var34 != null) {
                            class10.field260++;
                            class95.method785(var13.field3595, (byte) -99, var13.field3580, var13.field3565, var34, 0, 22);
                        }
                        for (int var35 = 4; var35 >= 0; var35--) {
                            class135 var36 = class32.method258(0, var35, var13);
                            if (var36 != null) {
                                class132.field3184++;
                                class95.method785(var13.field3595, (byte) -99, var13.field3580, var13.field3565, var36, var35 + 1, 26);
                            }
                        }
                        if (class53.method408(class23.method196(var13, (byte) -128), arg2 + 215)) {
                            class148.field3707++;
                            class95.method785(var13.field3595, (byte) -99, var13.field3580, class113.field2742, var13.field3609, 0, 46);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lh;Z)V")
    public static final void method145(class49 arg0, boolean arg1) {
        field444++;
        if (!arg1) {
            class124.field2973 = arg0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Lna;")
    public final class91 method146(int arg0, int arg1) {
        field431++;
        if (arg0 != 30814) {
            return null;
        }
        class91 var3 = (class91) class14.field296.method239(9325, (long) this.field439);
        if (var3 == null) {
            class110 var4 = class110.method903(class42.field968, this.field435, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field426[0] != 0) {
                    var4.method904(this.field426[var5], this.field422[var5]);
                }
            }
            var3 = var4.method901(this.field428 + 64, this.field430 + 850, -30, -50, -30);
            class14.field296.method241(var3, 0, (long) this.field439);
        }
        class91 var6;
        if (this.field445 == -1 || arg1 == -1) {
            var6 = var3.method705(true);
        } else {
            var6 = class17.method108(this.field445, 0).method652(var3, 1, arg1);
        }
        if (this.field421 != 128 || this.field441 != 128) {
            var6.method698(this.field421, this.field441, this.field421);
        }
        if (this.field434 != 0) {
            if (this.field434 == 90) {
                var6.method692();
            }
            if (this.field434 == 180) {
                var6.method692();
                var6.method692();
            }
            if (this.field434 == 270) {
                var6.method692();
                var6.method692();
                var6.method692();
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    public static void method147(int arg0) {
        field437 = null;
        field423 = null;
        field442 = null;
        if (arg0 == 0) {
            field419 = null;
            field418 = null;
            field427 = null;
        }
    }
}
