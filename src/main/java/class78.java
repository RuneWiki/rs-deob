import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class78 extends class128 {

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    private int field976 = 0;

    @OriginalMember(owner = "client!on", name = "O", descriptor = "I")
    private int field983 = 4096;

    @OriginalMember(owner = "client!on", name = "P", descriptor = "[I")
    public static int[] field984 = new int[100];

    @OriginalMember(owner = "client!on", name = "L", descriptor = "[I")
    public static int[] field980 = new int[4];

    @OriginalMember(owner = "client!on", name = "U", descriptor = "[Lpn;")
    public static class207[] field989 = new class207[4];

    @OriginalMember(owner = "client!on", name = "I", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!on", name = "J", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!on", name = "M", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!on", name = "N", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!on", name = "Q", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!on", name = "R", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!on", name = "S", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!on", name = "T", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!on", name = "K", descriptor = "Llc;")
    public static class175 field979;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(BI)[I", line = 9)
    public final int[] method126(byte arg0, int arg1) {
        field982++;
        int[] var3 = this.field1748.method902(arg1, true);
        if (arg0 <= 100) {
            field984 = (int[]) null;
        }
        if (this.field1748.field1878) {
            int[] var4 = this.method851((byte) -69, 0, arg1);
            for (int var5 = 0; var5 < class10.field141; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field976 <= var6 && var6 <= this.field983 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIII)V", line = 41)
    public static final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field987++;
        int var6 = arg4 - arg0;
        int var7 = arg2 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class226.method1557(arg3, arg1, arg2, arg0, -114);
            }
        } else if (var7 == 0) {
            class26.method164((byte) -107, arg3, arg1, arg4, arg0);
        } else {
            int var8 = -71 / ((arg5 - 82) / 37);
            int var9 = (var7 << 12) / var6;
            int var10 = arg3 - (arg0 * var9 >> 12);
            int var11;
            int var12;
            if (arg0 < class109.field1494) {
                var11 = (class109.field1494 * var9 >> 12) + var10;
                var12 = class109.field1494;
            } else if (arg0 <= class56.field678) {
                var12 = arg0;
                var11 = arg3;
            } else {
                var11 = (class56.field678 * var9 >> 12) + var10;
                var12 = class56.field678;
            }
            int var13;
            int var14;
            if (arg4 < class109.field1494) {
                var13 = class109.field1494;
                var14 = (class109.field1494 * var9 >> 12) + var10;
            } else if (arg4 > class56.field678) {
                var14 = (class56.field678 * var9 >> 12) + var10;
                var13 = class56.field678;
            } else {
                var13 = arg4;
                var14 = arg2;
            }
            if (var11 < class272.field4273) {
                var11 = class272.field4273;
                var12 = (class272.field4273 - var10 << 12) / var9;
            } else if (var11 > class248.field3759) {
                var12 = (class248.field3759 - var10 << 12) / var9;
                var11 = class248.field3759;
            }
            if (var14 < class272.field4273) {
                var14 = class272.field4273;
                var13 = (class272.field4273 - var10 << 12) / var9;
            } else if (class248.field3759 < var14) {
                var13 = (class248.field3759 - var10 << 12) / var9;
                var14 = class248.field3759;
            }
            class233.method1647(arg1, var13, var12, 72, var14, var11);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([Lhm;IIZII[BI)[I", line = 144)
    public static final int[] method461(class22[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        if (!arg3) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg5 + var9) > 0 && arg5 + var9 < 103 && arg4 + var10 > 0 && (arg4 + var10) < 103) {
                            arg0[var8].field282[arg5 + var9][arg4 + var10] = class229.method1613(arg0[var8].field282[arg5 + var9][arg4 + var10], -2097153);
                        }
                    }
                }
            }
        }
        field977++;
        byte var11;
        if (arg3) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        int var12 = arg1 + arg4;
        if (arg7 >= -41) {
            method460(-87, 52, 16, 83, -11, 124);
        }
        int var13 = arg2 + arg5;
        class107 var14 = new class107(arg6);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class157.method1042(-69, var15, 0, arg4 + var17, arg3, var14, 0, false, arg5 + var16, 0, var12 + var17, var13 + var16);
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var14.field1388.length > var14.field1400) {
            int var20 = var14.method661(-1);
            if (var20 == 128) {
                class73.field930[0] = var14.method624(14612);
                class73.field930[1] = var14.method656(-61);
                var18 = true;
                class73.field930[2] = var14.method656(-72);
                class73.field930[3] = var14.method656(-81);
                class73.field930[4] = var14.method624(14612);
            } else {
                if (var20 != 129) {
                    var14.field1400--;
                    break;
                }
                var19 = true;
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var14.method679(-3);
                    if (var22 == 0) {
                        int var23 = arg5;
                        int var24 = arg5 + 64;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        int var25 = arg4 + 64;
                        int var26 = arg4;
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        if (arg4 < 0) {
                            var26 = 0;
                        } else if (arg4 >= 104) {
                            var26 = 104;
                        }
                        if (arg5 < 0) {
                            var23 = 0;
                        } else if (arg5 >= 104) {
                            var23 = 104;
                        }
                        while (var24 > var23) {
                            while (var25 > var26) {
                                class148.field2053[var21][var23][var26] = 0;
                                var26++;
                            }
                            var23++;
                        }
                    } else if (var22 == 1) {
                        for (int var31 = 0; var31 < 64; var31 += 4) {
                            for (int var32 = 0; var32 < 64; var32 += 4) {
                                byte var33 = var14.method679(-3);
                                for (int var34 = arg5 + var31; var34 < var31 + arg5 + 4; var34++) {
                                    for (int var35 = arg4 + var32; var35 < (var32 - (-arg4 - 4)); var35++) {
                                        if (var34 >= 0 && var34 < 104 && var35 >= 0 && var35 < 104) {
                                            class148.field2053[var21][var34][var35] = var33;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var27 = arg5 + 64;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 >= 104) {
                            var27 = 104;
                        }
                        int var28 = arg5;
                        if (arg5 < 0) {
                            var28 = 0;
                        } else if (arg5 >= 104) {
                            var28 = 104;
                        }
                        int var29 = arg4 + 64;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        int var30 = arg4;
                        if (arg4 < 0) {
                            var30 = 0;
                        } else if (arg4 >= 104) {
                            var30 = 104;
                        }
                        while (var28 < var27) {
                            while (var30 < var29) {
                                class148.field2053[var21][var28][var30] = class148.field2053[var21 - 1][var28][var30];
                                var30++;
                            }
                            var28++;
                        }
                    }
                }
            }
        }
        if (class250.field3787 && !arg3) {
            class222 var36 = null;
            while (true) {
                while (var14.field1388.length > var14.field1400) {
                    int var37 = var14.method661(-1);
                    if (var37 == 0) {
                        var36 = new class222(var14);
                    } else if (var37 == 1) {
                        int var38 = var14.method661(-1);
                        if (var38 > 0) {
                            for (int var39 = 0; var39 < var38; var39++) {
                                class62 var40 = new class62(var14);
                                if (var40.field765 == 31) {
                                    class139 var41 = client.method1944(var14.method624(14612), 31);
                                    var40.method364(var41.field1947, (byte) -89, var41.field1941, var41.field1950, var41.field1949);
                                }
                                var40.field764 += arg4 << 7;
                                var40.field759 += arg5 << 7;
                                int var42 = var40.field759 >> 7;
                                int var43 = var40.field764 >> 7;
                                if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                                    var40.field784 = (class264.field4163[1][var42][var43] & 0x2) != 0;
                                    var40.field758 = class167.field2324[var40.field773][var42][var43] - var40.field758;
                                    class193.method1341(var40);
                                }
                            }
                        }
                    } else if (var37 == 2) {
                        if (var36 == null) {
                            var36 = new class222();
                        }
                        var36.method1528((byte) -78, var14);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var36 == null) {
                    var36 = new class222();
                }
                for (int var44 = 0; var44 < 8; var44++) {
                    for (int var45 = 0; var45 < 8; var45++) {
                        int var46 = (arg5 >> 3) + var44;
                        int var47 = (arg4 >> 3) + var45;
                        if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                            class295.field4611[var46][var47] = var36;
                        }
                    }
                }
                break;
            }
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg4 >> 2) + var50;
                        int var52 = (arg5 >> 2) + var49;
                        if (var52 >= 0 && var52 < 26 && var51 >= 0 && var51 < 26) {
                            class148.field2053[var48][var52][var51] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class73.field930 : null;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V", line = 569)
    public class78() {
        super(1, true);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lp;II)V", line = 582)
    public final void method107(class107 arg0, int arg1, int arg2) {
        field985++;
        if (arg1 == 0) {
            this.field976 = arg0.method624(14612);
        } else if (arg1 == 1) {
            this.field983 = arg0.method624(14612);
        }
        if (arg2 >= -85) {
            field988 = 13;
        }
    }

    @OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V", line = 619)
    public static final void method462(int arg0) {
        field981++;
        if (class43.field503 == null || class276.field4298 == null) {
            class43.field503 = new int[256];
            class276.field4298 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class43.field503[var1] = (int) (Math.sin(var2) * 4096.0D);
                class276.field4298[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != -1) {
            method463(false);
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(Z)V", line = 664)
    public static void method463(boolean arg0) {
        field984 = null;
        field980 = null;
        if (arg0) {
            field980 = (int[]) null;
        }
        field989 = null;
        field979 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BILg;)V", line = 677)
    public static final void method464(byte arg0, int arg1, class170 arg2) {
        if (class38.field463 < arg2.field2454) {
            class58.method338((byte) 88, arg2);
        } else if (arg2.field2388 < class38.field463) {
            class137.method919(false, arg2);
        } else {
            class253.method1843(arg2, 121);
        }
        field986++;
        if (arg2.field2392 < 128 || arg2.field2357 < 128 || arg2.field2392 >= 13184 || arg2.field2357 >= 13184) {
            arg2.field2454 = 0;
            arg2.field2372 = -1;
            arg2.field2435 = -1;
            arg2.field2388 = 0;
            arg2.field2392 = arg2.field2359[0] * 128 + (arg2.method748(false) * 64);
            arg2.field2357 = arg2.field2403[0] * 128 + arg2.method748(false) * 64;
            arg2.method1104((byte) 127);
        }
        if (class118.field1664 == arg2 && (arg2.field2392 < 1536 || arg2.field2357 < 1536 || arg2.field2392 >= 11776 || arg2.field2357 >= 11776)) {
            arg2.field2372 = -1;
            arg2.field2435 = -1;
            arg2.field2454 = 0;
            arg2.field2388 = 0;
            arg2.field2392 = arg2.field2359[0] * 128 + arg2.method748(false) * 64;
            arg2.field2357 = arg2.field2403[0] * 128 + arg2.method748(false) * 64;
            arg2.method1104((byte) 127);
        }
        class149.method1003(0, arg2);
        class10.method54(arg2, true);
        int var3 = -12 / ((arg0 - 22) / 38);
    }
}
