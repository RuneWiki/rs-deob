import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class35 extends class122 {

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "[I")
    public static int[] field821 = new int[100];

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[I")
    public static int[] field820 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Lbd;")
    public static class12 field819 = new class12(200);

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Lae;")
    private static class6 field829 = class64.method474(123, "Sorry invited players only)3");

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "Lae;")
    public static class6 field830 = field829;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field827 = 0;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "Lae;")
    public static class6 field831 = class64.method474(115, "Side panel redrawn");

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field832 = 0;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "[[Lte;")
    public static class121[][] field828;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILl;IIIILh;ZI)V", line = 5)
    public static final void method309(int arg0, class71 arg1, int arg2, int arg3, int arg4, int arg5, class47 arg6, boolean arg7, int arg8) {
        field816++;
        if (class82.field2017 && (class108.field2582[0][arg5][arg2] & 0x2) == 0) {
            if ((class108.field2582[arg4][arg5][arg2] & 0x10) != 0) {
                return;
            }
            if (class82.method706(arg2, arg5, arg4, (byte) 23) != class92.field2180) {
                return;
            }
        }
        if (arg4 < class47.field1069) {
            class47.field1069 = arg4;
        }
        int var9 = class137.field3331[arg4][arg5][arg2];
        int var10 = class137.field3331[arg4][arg5][arg2 + 1];
        int var11 = class137.field3331[arg4][arg5 + 1][arg2 + 1];
        int var12 = class137.field3331[arg4][arg5 + 1][arg2];
        int var13 = var9 + var12 + var10 + var11 >> 2;
        class107 var14 = class80.method687(arg3, (byte) 65);
        int var15 = arg5 + (arg2 << 7) + (arg3 << 14) + 1073741824;
        if (var14.field2537 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        int var16 = (arg8 << 6) + arg0;
        if (var14.field2566 == 1) {
            var16 += 256;
        }
        if (var14.method901(31739)) {
            class46.method371((byte) -73, arg2, arg8, arg5, var14, arg4);
        }
        if (arg0 == 22) {
            if (!class82.field2017 || var14.field2537 != 0 || var14.field2568) {
                class42 var17;
                if (var14.field2535 == -1 && var14.field2559 == null) {
                    var17 = var14.method909(66, 22, var9, arg8, var10, var11, var12);
                } else {
                    var17 = new class46(arg3, 22, arg8, var9, var12, var11, var10, var14.field2535, true, null);
                }
                arg1.method546(arg4, arg5, arg2, var13, var17, var15, var16);
                if (var14.field2522 && var14.field2537 == 1 && arg6 != null) {
                    arg6.method383((byte) -85, arg2, arg5);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class42 var37;
            if (var14.field2535 == -1 && var14.field2559 == null) {
                var37 = var14.method909(66, 10, var9, arg8, var10, var11, var12);
            } else {
                var37 = new class46(arg3, 10, arg8, var9, var12, var11, var10, var14.field2535, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg8 == 1 || arg8 == 3) {
                    var38 = var14.field2516;
                    var39 = var14.field2546;
                } else {
                    var38 = var14.field2546;
                    var39 = var14.field2516;
                }
                int var40 = 0;
                if (arg0 == 11) {
                    var40 += 256;
                }
                if (arg1.method548(arg4, arg5, arg2, var13, var39, var38, var37, var40, var15, var16) && var14.field2557) {
                    class131 var41;
                    if (var37 instanceof class131) {
                        var41 = (class131) var37;
                    } else {
                        var41 = var14.method909(66, 10, var9, arg8, var10, var11, var12);
                    }
                    if (var41 != null) {
                        for (int var42 = 0; var42 <= var39; var42++) {
                            for (int var43 = 0; var43 <= var38; var43++) {
                                int var44 = var41.method1081() / 4;
                                if (var44 > 30) {
                                    var44 = 30;
                                }
                                if (var44 > class22.field560[arg4][arg5 + var42][arg2 + var43]) {
                                    class22.field560[arg4][arg5 + var42][arg2 + var43] = (byte) var44;
                                }
                            }
                        }
                    }
                }
            }
            if (var14.field2522 && arg6 != null) {
                arg6.method381(var14.field2547, arg5, var14.field2516, (byte) -54, arg2, var14.field2546, arg8);
            }
        } else if (arg0 >= 12) {
            class42 var18;
            if (var14.field2535 == -1 && var14.field2559 == null) {
                var18 = var14.method909(66, arg0, var9, arg8, var10, var11, var12);
            } else {
                var18 = new class46(arg3, arg0, arg8, var9, var12, var11, var10, var14.field2535, true, null);
            }
            arg1.method548(arg4, arg5, arg2, var13, 1, 1, var18, 0, var15, var16);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg4 > 0) {
                class87.field2097[arg4][arg5][arg2] = class105.method885(class87.field2097[arg4][arg5][arg2], 2340);
            }
            if (var14.field2522 && arg6 != null) {
                arg6.method381(var14.field2547, arg5, var14.field2516, (byte) -54, arg2, var14.field2546, arg8);
            }
        } else if (arg0 == 0) {
            class42 var19;
            if (var14.field2535 == -1 && var14.field2559 == null) {
                var19 = var14.method909(66, 0, var9, arg8, var10, var11, var12);
            } else {
                var19 = new class46(arg3, 0, arg8, var9, var12, var11, var10, var14.field2535, true, null);
            }
            arg1.method570(arg4, arg5, arg2, var13, var19, null, class121.field2860[arg8], 0, var15, var16);
            if (arg8 == 0) {
                if (var14.field2557) {
                    class22.field560[arg4][arg5][arg2] = 50;
                    class22.field560[arg4][arg5][arg2 + 1] = 50;
                }
                if (var14.field2524) {
                    class87.field2097[arg4][arg5][arg2] = class105.method885(class87.field2097[arg4][arg5][arg2], 585);
                }
            } else if (arg8 == 1) {
                if (var14.field2557) {
                    class22.field560[arg4][arg5][arg2 + 1] = 50;
                    class22.field560[arg4][arg5 + 1][arg2 + 1] = 50;
                }
                if (var14.field2524) {
                    class87.field2097[arg4][arg5][arg2 + 1] = class105.method885(class87.field2097[arg4][arg5][arg2 + 1], 1170);
                }
            } else if (arg8 == 2) {
                if (var14.field2557) {
                    class22.field560[arg4][arg5 + 1][arg2] = 50;
                    class22.field560[arg4][arg5 + 1][arg2 + 1] = 50;
                }
                if (var14.field2524) {
                    class87.field2097[arg4][arg5 + 1][arg2] = class105.method885(class87.field2097[arg4][arg5 + 1][arg2], 585);
                }
            } else if (arg8 == 3) {
                if (var14.field2557) {
                    class22.field560[arg4][arg5][arg2] = 50;
                    class22.field560[arg4][arg5 + 1][arg2] = 50;
                }
                if (var14.field2524) {
                    class87.field2097[arg4][arg5][arg2] = class105.method885(class87.field2097[arg4][arg5][arg2], 1170);
                }
            }
            if (var14.field2522 && arg6 != null) {
                arg6.method379(arg5, 16384, var14.field2547, arg2, arg8, arg0);
            }
            if (var14.field2532 != 16) {
                arg1.method532(arg4, arg5, arg2, var14.field2532);
            }
        } else if (arg0 == 1) {
            class42 var20;
            if (var14.field2535 == -1 && var14.field2559 == null) {
                var20 = var14.method909(66, 1, var9, arg8, var10, var11, var12);
            } else {
                var20 = new class46(arg3, 1, arg8, var9, var12, var11, var10, var14.field2535, true, null);
            }
            arg1.method570(arg4, arg5, arg2, var13, var20, null, field820[arg8], 0, var15, var16);
            if (var14.field2557) {
                if (arg8 == 0) {
                    class22.field560[arg4][arg5][arg2 + 1] = 50;
                } else if (arg8 == 1) {
                    class22.field560[arg4][arg5 + 1][arg2 + 1] = 50;
                } else if (arg8 == 2) {
                    class22.field560[arg4][arg5 + 1][arg2] = 50;
                } else if (arg8 == 3) {
                    class22.field560[arg4][arg5][arg2] = 50;
                }
            }
            if (var14.field2522 && arg6 != null) {
                arg6.method379(arg5, 16384, var14.field2547, arg2, arg8, arg0);
            }
        } else if (arg0 == 2) {
            int var21 = arg8 + 1 & 0x3;
            class42 var22;
            class42 var23;
            if (var14.field2535 == -1 && var14.field2559 == null) {
                var22 = var14.method909(66, 2, var9, arg8 + 4, var10, var11, var12);
                var23 = var14.method909(66, 2, var9, var21, var10, var11, var12);
            } else {
                var22 = new class46(arg3, 2, arg8 + 4, var9, var12, var11, var10, var14.field2535, true, null);
                var23 = new class46(arg3, 2, var21, var9, var12, var11, var10, var14.field2535, true, null);
            }
            arg1.method570(arg4, arg5, arg2, var13, var22, var23, class121.field2860[arg8], class121.field2860[var21], var15, var16);
            if (var14.field2524) {
                if (arg8 == 0) {
                    class87.field2097[arg4][arg5][arg2] = class105.method885(class87.field2097[arg4][arg5][arg2], 585);
                    class87.field2097[arg4][arg5][arg2 + 1] = class105.method885(class87.field2097[arg4][arg5][arg2 + 1], 1170);
                } else if (arg8 == 1) {
                    class87.field2097[arg4][arg5][arg2 + 1] = class105.method885(class87.field2097[arg4][arg5][arg2 + 1], 1170);
                    class87.field2097[arg4][arg5 + 1][arg2] = class105.method885(class87.field2097[arg4][arg5 + 1][arg2], 585);
                } else if (arg8 == 2) {
                    class87.field2097[arg4][arg5 + 1][arg2] = class105.method885(class87.field2097[arg4][arg5 + 1][arg2], 585);
                    class87.field2097[arg4][arg5][arg2] = class105.method885(class87.field2097[arg4][arg5][arg2], 1170);
                } else if (arg8 == 3) {
                    class87.field2097[arg4][arg5][arg2] = class105.method885(class87.field2097[arg4][arg5][arg2], 1170);
                    class87.field2097[arg4][arg5][arg2] = class105.method885(class87.field2097[arg4][arg5][arg2], 585);
                }
            }
            if (var14.field2522 && arg6 != null) {
                arg6.method379(arg5, 16384, var14.field2547, arg2, arg8, arg0);
            }
            if (var14.field2532 != 16) {
                arg1.method532(arg4, arg5, arg2, var14.field2532);
            }
        } else if (arg0 == 3) {
            class42 var24;
            if (var14.field2535 == -1 && var14.field2559 == null) {
                var24 = var14.method909(66, 3, var9, arg8, var10, var11, var12);
            } else {
                var24 = new class46(arg3, 3, arg8, var9, var12, var11, var10, var14.field2535, true, null);
            }
            arg1.method570(arg4, arg5, arg2, var13, var24, null, field820[arg8], 0, var15, var16);
            if (var14.field2557) {
                if (arg8 == 0) {
                    class22.field560[arg4][arg5][arg2 + 1] = 50;
                } else if (arg8 == 1) {
                    class22.field560[arg4][arg5 + 1][arg2 + 1] = 50;
                } else if (arg8 == 2) {
                    class22.field560[arg4][arg5 + 1][arg2] = 50;
                } else if (arg8 == 3) {
                    class22.field560[arg4][arg5][arg2] = 50;
                }
            }
            if (var14.field2522 && arg6 != null) {
                arg6.method379(arg5, 16384, var14.field2547, arg2, arg8, arg0);
            }
        } else if (arg0 == 9) {
            class42 var25;
            if (var14.field2535 == -1 && var14.field2559 == null) {
                var25 = var14.method909(66, arg0, var9, arg8, var10, var11, var12);
            } else {
                var25 = new class46(arg3, arg0, arg8, var9, var12, var11, var10, var14.field2535, true, null);
            }
            arg1.method548(arg4, arg5, arg2, var13, 1, 1, var25, 0, var15, var16);
            if (var14.field2522 && arg6 != null) {
                arg6.method381(var14.field2547, arg5, var14.field2516, (byte) -54, arg2, var14.field2546, arg8);
            }
        } else {
            if (var14.field2549) {
                if (arg8 == 1) {
                    int var29 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var9;
                    var9 = var29;
                } else if (arg8 == 2) {
                    int var26 = var10;
                    var10 = var12;
                    var12 = var26;
                    int var27 = var11;
                    var11 = var9;
                    var9 = var27;
                } else if (arg8 == 3) {
                    int var28 = var10;
                    var10 = var9;
                    var9 = var12;
                    var12 = var11;
                    var11 = var28;
                }
            }
            if (arg0 == 4) {
                class42 var30;
                if (var14.field2535 == -1 && var14.field2559 == null) {
                    var30 = var14.method909(66, 4, var9, 0, var10, var11, var12);
                } else {
                    var30 = new class46(arg3, 4, 0, var9, var12, var11, var10, var14.field2535, true, null);
                }
                arg1.method530(arg4, arg5, arg2, var13, var30, class121.field2860[arg8], arg8 * 512, 0, 0, var15, var16);
            } else {
                if (!arg7) {
                    field820 = null;
                }
                if (arg0 == 5) {
                    int var31 = 16;
                    int var32 = arg1.method544(arg4, arg5, arg2);
                    if (var32 > 0) {
                        var31 = class80.method687(var32 >> 14 & 0x7FFF, (byte) 100).field2532;
                    }
                    class42 var33;
                    if (var14.field2535 == -1 && var14.field2559 == null) {
                        var33 = var14.method909(66, 4, var9, 0, var10, var11, var12);
                    } else {
                        var33 = new class46(arg3, 4, 0, var9, var12, var11, var10, var14.field2535, true, null);
                    }
                    arg1.method530(arg4, arg5, arg2, var13, var33, class121.field2860[arg8], arg8 * 512, class105.field2491[arg8] * var31, class104.field2471[arg8] * var31, var15, var16);
                } else if (arg0 == 6) {
                    class42 var34;
                    if (var14.field2535 == -1 && var14.field2559 == null) {
                        var34 = var14.method909(66, 4, var9, 0, var10, var11, var12);
                    } else {
                        var34 = new class46(arg3, 4, 0, var9, var12, var11, var10, var14.field2535, true, null);
                    }
                    arg1.method530(arg4, arg5, arg2, var13, var34, 256, arg8, 0, 0, var15, var16);
                } else if (arg0 == 7) {
                    class42 var35;
                    if (var14.field2535 == -1 && var14.field2559 == null) {
                        var35 = var14.method909(66, 4, var9, 0, var10, var11, var12);
                    } else {
                        var35 = new class46(arg3, 4, 0, var9, var12, var11, var10, var14.field2535, true, null);
                    }
                    arg1.method530(arg4, arg5, arg2, var13, var35, 512, arg8, 0, 0, var15, var16);
                } else if (arg0 == 8) {
                    class42 var36;
                    if (var14.field2535 == -1 && var14.field2559 == null) {
                        var36 = var14.method909(66, 4, var9, 0, var10, var11, var12);
                    } else {
                        var36 = new class46(arg3, 4, 0, var9, var12, var11, var10, var14.field2535, true, null);
                    }
                    arg1.method530(arg4, arg5, arg2, var13, var36, 768, arg8, 0, 0, var15, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIJ)Z", line = 513)
    public final boolean method310(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xE0) == 128) {
            int var6 = 0x1 << (arg0 & 0xF);
            int var7 = class47.field1050[arg1];
            if (arg0 < 144 || arg2 == 0) {
                class47.field1050[arg1] = var7 & ~var6;
            } else if ((var7 & var6) == 0) {
                class47.field1050[arg1] = var7 | var6;
            } else {
                this.method315(arg0, arg1, 0, arg3);
            }
            return false;
        }
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method315(arg0, arg1, arg2, arg3);
                int var8 = arg0 & 0xF;
                class95.field2234[var8] = 12800;
                int var9 = method316(var8);
                this.method315(arg0, 7, var9 >> 7, arg3);
                this.method315(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var10 = arg0 & 0xF;
                if (arg1 == 7) {
                    class95.field2234[var10] = (arg2 << 7) + (class95.field2234[var10] & 0x7F);
                } else {
                    class95.field2234[var10] = (class95.field2234[var10] & 0x3F80) + arg2;
                }
                int var11 = method316(var10);
                this.method315(arg0, 7, var11 >> 7, arg3);
                this.method315(arg0, 39, var11 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(JZI)V", line = 577)
    public final void method311(long arg0, boolean arg1, int arg2) {
        field824++;
        if (!arg1) {
            field831 = null;
        }
        class58.field1257 = arg2;
        for (int var5 = 0; var5 < 16; var5++) {
            class95.field2234[var5] = 12800;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            int var7 = method316(var6);
            this.method315(var6 + 176, 7, var7 >> 7, arg0);
            this.method315(var6 + 176, 39, var7 & 0x7F, arg0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(JI)V", line = 607)
    public final void method312(long arg0, int arg1) {
        for (int var4 = 0; var4 < 128; var4++) {
            int var11 = class47.field1050[var4];
            class47.field1050[var4] = 0;
            for (int var12 = 0; var12 < 16; var12++) {
                if ((0x1 << var12 & var11) != 0) {
                    this.method315(var12 + 144, var4, 0, arg0);
                }
            }
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method315(var5 + 176, 123, 0, arg0);
        }
        field826++;
        for (int var6 = 0; var6 < 16; var6++) {
            this.method315(var6 + 176, 120, 0, arg0);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method315(var7 + 176, 121, 0, arg0);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method315(var8 + 176, 0, 0, arg0);
        }
        for (int var9 = arg1; var9 < 16; var9++) {
            this.method315(var9 + 176, 32, 0, arg0);
        }
        for (int var10 = 0; var10 < 16; var10++) {
            this.method315(var10 + 192, 0, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLlb;)V", line = 678)
    public static final void method313(byte arg0, class69 arg1) {
        field825++;
        class40.field904 = arg1;
        if (arg0 != -12) {
            field820 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(IB)Lne;", line = 689)
    public static final class85 method314(int arg0, byte arg1) {
        if (arg1 != 54) {
            method317(-47);
        }
        field822++;
        class85 var2 = (class85) class6.field79.method128((byte) 0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class88.field2117.method160(30605, 12, arg0);
        class85 var4 = new class85();
        if (var3 != null) {
            var4.method721(new class77(var3), 17877);
        }
        var4.method725((byte) -106);
        class6.field79.method130(var4, (long) arg0, (byte) -44);
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)I", line = 720)
    private static final int method316(int arg0) {
        int var1 = class95.field2234[arg0];
        int var2 = (class58.field1257 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V", line = 734)
    public static void method317(int arg0) {
        field830 = null;
        field829 = null;
        field819 = null;
        if (arg0 <= -89) {
            field828 = null;
            field820 = null;
            field831 = null;
            field821 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIJI)V", line = 756)
    public final void method318(byte arg0, int arg1, long arg2, int arg3) {
        int var6 = (int) (Math.pow(0.1D, (double) arg1 * 5.0E-4D) * (double) arg3 + 0.5D);
        if (arg0 != -9) {
            field829 = null;
        }
        if (class58.field1257 != var6) {
            class58.field1257 = var6;
            for (int var7 = 0; var7 < 16; var7++) {
                int var8 = method316(var7);
                this.method315(var7 + 176, 7, var8 >> 7, arg2);
                this.method315(var7 + 176, 39, var8 & 0x7F, arg2);
            }
        }
        field817++;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIIJ)V")
    public abstract void method315(int arg0, int arg1, int arg2, long arg3);
}
