import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class52 extends class152 {

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "Z")
    public static boolean field798 = false;

    @OriginalMember(owner = "client!wf", name = "cb", descriptor = "I")
    public static int field800 = 2;

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "I")
    public static int field797 = -1;

    @OriginalMember(owner = "client!wf", name = "db", descriptor = "Lce;")
    public static class126 field801 = class206.method1445(-7923, "Poser");

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "I")
    public static int field795 = 100;

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "Lce;")
    public static class126 field796 = class206.method1445(-7923, "k");

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!wf", name = "bb", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!wf", name = "eb", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "[Lgj;")
    private class274[] field792;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)[I", line = 9)
    public final int[] method6(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            this.method327(this.field2776.method1796((byte) 69), true);
        }
        field789++;
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)V", line = 31)
    public static void method326(int arg0) {
        if (arg0 != -1) {
            field801 = (class126) null;
        }
        field796 = null;
        field801 = null;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 46)
    public class52() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILbb;)V", line = 54)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            return;
        }
        field790++;
        if (arg1 == 0) {
            this.field792 = new class274[arg2.method948(-121)];
            for (int var4 = 0; var4 < this.field792.length; var4++) {
                int var5 = arg2.method948(-127);
                if (var5 == 0) {
                    this.field792[var4] = class231.method1571(29599, arg2);
                } else if (var5 == 1) {
                    this.field792[var4] = class298.method2006(arg2, true);
                } else if (var5 == 2) {
                    this.field792[var4] = class240.method1646(arg2, 0);
                } else if (var5 == 3) {
                    this.field792[var4] = class319.method2224((byte) 126, arg2);
                }
            }
        } else if (arg1 == 1) {
            this.field2781 = arg2.method948(-121) == 1;
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(II)[[I", line = 132)
    public final int[][] method26(int arg0, int arg1) {
        int[][] var3 = this.field2775.method319(95, arg1);
        field799++;
        if (this.field2775.field775) {
            int var4 = class244.field4133;
            int var5 = class143.field2599;
            int[][][] var6 = this.field2775.method316(-74);
            int[][] var7 = new int[var5][var4];
            this.method327(var7, true);
            for (int var8 = 0; var8 < class143.field2599; var8++) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class244.field4133; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class47.method289(255, var15) << 4;
                    var12[var14] = class47.method289(4080, var15 >> 4);
                    var11[var14] = class47.method289(16711680, var15) >> 12;
                }
            }
        }
        if (arg0 != 0) {
            field795 = -47;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([[IZ)V", line = 199)
    private final void method327(int[][] arg0, boolean arg1) {
        field794++;
        int var3 = class244.field4133;
        int var4 = class143.field2599;
        if (!arg1) {
            field800 = -126;
        }
        class282.method1888(arg0, 9393);
        class260.method1762(0, 0, class314.field5378, (byte) 48, class321.field5490);
        if (this.field792 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field792.length; var5++) {
            class274 var6 = this.field792[var5];
            int var7 = var6.field4609;
            int var8 = var6.field4610;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method56(var3, var4, (byte) 66);
                }
            } else if (var8 >= 0) {
                var6.method52(var3, (byte) 66, var4);
            } else {
                var6.method50(var3, var4, 1);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BIIJZ)Lce;", line = 250)
    public static final class126 method328(byte arg0, int arg1, int arg2, long arg3, boolean arg4) {
        field793++;
        class126 var6 = class161.method1191(0, (byte) 11);
        if (arg3 < 0L) {
            var6.method835(class16.field224, (byte) -10);
            arg3 = -arg3;
        }
        class126 var7 = class213.field3619;
        class126 var8 = class117.field1979;
        if (arg1 == 1) {
            var8 = class213.field3619;
            var7 = class117.field1979;
        }
        if (arg1 == 2) {
            var8 = class213.field3619;
            var7 = class20.field275;
        }
        if (arg1 == 3) {
            var7 = class117.field1979;
            var8 = class213.field3619;
        }
        class126 var9 = class161.method1191(0, (byte) -115);
        class126 var10 = class161.method1191(0, (byte) -123);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method835(class195.method1386((byte) 20, (int) (arg3 % 10L)), (byte) -10);
            arg3 /= 10L;
        }
        if (arg3 == 0L) {
            var9 = class19.field261;
        }
        if (arg0 != 27) {
            field798 = false;
        }
        int var12 = 0;
        while (arg3 > 0L) {
            if (arg4 && var12 != 0 && (var12 % 3) == 0) {
                var9.method835(var7, (byte) -10);
            }
            var12++;
            var9.method835(class195.method1386((byte) 20, (int) (arg3 % 10L)), (byte) -10);
            arg3 /= 10L;
        }
        if (var10.method878((byte) 109) > 0) {
            var10.method835(var8, (byte) -10);
        }
        return class12.method69(new class126[] { var6, var9.method857(-65), var10.method857(arg0 ^ 0xFFFFFF91) }, (byte) 115);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIILsh;IIIZIZ)V", line = 329)
    public static final void method329(int arg0, int arg1, int arg2, int arg3, class32 arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, boolean arg10) {
        field802++;
        if (arg10 && !class22.method109(4096) && (class301.field4992[0][arg1][arg5] & 0x2) == 0) {
            if ((class301.field4992[arg2][arg1][arg5] & 0x10) != 0) {
                return;
            }
            if (class265.method1791(arg5, 25460, arg1, arg2) != class297.field4944) {
                return;
            }
        }
        if (arg2 < class245.field4147) {
            class245.field4147 = arg2;
        }
        int var11 = 79 % ((arg0 + 53) / 59);
        class265 var12 = class185.method1338(arg9, -7153);
        if (class56.field846 && var12.field4436) {
            return;
        }
        int var13;
        int var14;
        if (arg7 == 1 || arg7 == 3) {
            var14 = var12.field4452;
            var13 = var12.field4474;
        } else {
            var13 = var12.field4452;
            var14 = var12.field4474;
        }
        int var15;
        int var16;
        if ((arg1 + var14) <= 104) {
            var15 = (var14 >> 1) + arg1;
            var16 = (var14 + 1 >> 1) + arg1;
        } else {
            var16 = arg1 + 1;
            var15 = arg1;
        }
        int var17;
        int var18;
        if (arg5 + var13 <= 104) {
            var17 = (var13 >> 1) + arg5;
            var18 = (var13 + 1 >> 1) + arg5;
        } else {
            var17 = arg5;
            var18 = arg5 + 1;
        }
        int var19 = (arg1 << 7) + (var14 << 6);
        int[][] var20 = class264.field4396[arg3];
        int var21 = var20[var15][var17] + var20[var16][var17] + var20[var15][var18] + var20[var16][var18] >> 2;
        int var22 = (arg5 << 7) + (var13 << 6);
        int var23 = 0;
        if (class56.field846 && arg3 != 0) {
            int[][] var24 = class264.field4396[0];
            var23 = var21 - (var24[var15][var17] + var24[var16][var18] + var24[var15][var18] + var24[var16][var17] >> 2);
        }
        int[][] var25 = (int[][]) null;
        if (arg8) {
            var25 = class320.field5486[0];
        } else if (arg3 < 3) {
            var25 = class264.field4396[arg3 + 1];
        }
        long var26 = (long) (arg6 << 14 | arg5 << 7 | arg1 | arg7 << 20 | 0x40000000);
        if (var12.field4489 == 0 || arg8) {
            var26 |= Long.MIN_VALUE;
        }
        if (var12.field4437 == 1) {
            var26 |= 0x400000L;
        }
        if (var12.field4431) {
            var26 |= 0x80000000L;
        }
        if (var12.method1792(true)) {
            class53.method336(128, arg7, (class89) null, var12, arg1, (class301) null, arg2, arg5);
        }
        boolean var28 = !arg8 & var12.field4487;
        long var29 = var26 | (long) arg9 << 32;
        if (arg6 == 22) {
            if (class44.field677 || var12.field4489 != 0 || var12.field4470 == 1 || var12.field4478) {
                class114 var32;
                if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                    class21 var31 = var12.method1785(arg7, var21, arg10, var19, 97, var20, 22, var25, var22, var28, (class2) null);
                    if (class56.field846 && var28) {
                        class66.method475(var31.field279, var19, var23, var22);
                    }
                    var32 = var31.field283;
                } else {
                    var32 = new class95(arg9, 22, arg7, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
                }
                class87.method616(arg2, arg1, arg5, var21, var32, var29, var12.field4472);
                if (var12.field4470 == 1 && arg4 != null) {
                    arg4.method172((byte) 90, arg1, arg5);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class114 var74;
            if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                class21 var73 = var12.method1785(arg6 == 11 ? arg7 + 4 : arg7, var21, arg10, var19, 118, var20, 10, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var73.field279, var19, var23, var22);
                }
                var74 = var73.field283;
            } else {
                var74 = new class95(arg9, 10, arg6 == 11 ? arg7 + 4 : arg7, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
            }
            if (var74 != null) {
                boolean var75 = class241.method1662(arg2, arg1, arg5, var21, var14, var13, var74, 0, var29);
                if (var12.field4417 && var75 && arg10) {
                    int var76 = 15;
                    if (var74 instanceof class196) {
                        var76 = ((class196) var74).method242() / 4;
                        if (var76 > 30) {
                            var76 = 30;
                        }
                    }
                    for (int var77 = 0; var77 <= var14; var77++) {
                        for (int var78 = 0; var78 <= var13; var78++) {
                            if (class122.field2036[arg2][arg1 + var77][arg5 + var78] < var76) {
                                class122.field2036[arg2][arg1 + var77][arg5 + var78] = (byte) var76;
                            }
                        }
                    }
                }
            }
            if (var12.field4470 != 0 && arg4 != null) {
                arg4.method174(arg5, 1, var14, arg1, var13, var12.field4483);
            }
        } else if (arg6 >= 12) {
            class114 var72;
            if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                class21 var71 = var12.method1785(arg7, var21, arg10, var19, -119, var20, arg6, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var71.field279, var19, var23, var22);
                }
                var72 = var71.field283;
            } else {
                var72 = new class95(arg9, arg6, arg7, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
            }
            class241.method1662(arg2, arg1, arg5, var21, 1, 1, var72, 0, var29);
            if (arg10 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg2 > 0) {
                class119.field2003[arg2][arg1][arg5] = class221.method1516(class119.field2003[arg2][arg1][arg5], 4);
            }
            if (var12.field4470 != 0 && arg4 != null) {
                arg4.method174(arg5, 1, var14, arg1, var13, var12.field4483);
            }
        } else if (arg6 == 0) {
            class114 var34;
            if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                class21 var33 = var12.method1785(arg7, var21, arg10, var19, -127, var20, 0, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var33.field279, var19, var23, var22);
                }
                var34 = var33.field283;
            } else {
                var34 = new class95(arg9, 0, arg7, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
            }
            class76.method553(arg2, arg1, arg5, var21, var34, (class114) null, class315.field5409[arg7], 0, var29);
            if (arg10) {
                if (arg7 == 0) {
                    if (var12.field4417) {
                        class122.field2036[arg2][arg1][arg5] = 50;
                        class122.field2036[arg2][arg1][arg5 + 1] = 50;
                    }
                    if (var12.field4468) {
                        class119.field2003[arg2][arg1][arg5] = class221.method1516(class119.field2003[arg2][arg1][arg5], 1);
                    }
                } else if (arg7 == 1) {
                    if (var12.field4417) {
                        class122.field2036[arg2][arg1][arg5 + 1] = 50;
                        class122.field2036[arg2][arg1 + 1][arg5 + 1] = 50;
                    }
                    if (var12.field4468) {
                        class119.field2003[arg2][arg1][arg5 + 1] = class221.method1516(class119.field2003[arg2][arg1][arg5 + 1], 2);
                    }
                } else if (arg7 == 2) {
                    if (var12.field4417) {
                        class122.field2036[arg2][arg1 + 1][arg5] = 50;
                        class122.field2036[arg2][arg1 + 1][arg5 + 1] = 50;
                    }
                    if (var12.field4468) {
                        class119.field2003[arg2][arg1 + 1][arg5] = class221.method1516(class119.field2003[arg2][arg1 + 1][arg5], 1);
                    }
                } else if (arg7 == 3) {
                    if (var12.field4417) {
                        class122.field2036[arg2][arg1][arg5] = 50;
                        class122.field2036[arg2][arg1 + 1][arg5] = 50;
                    }
                    if (var12.field4468) {
                        class119.field2003[arg2][arg1][arg5] = class221.method1516(class119.field2003[arg2][arg1][arg5], 2);
                    }
                }
            }
            if (var12.field4470 != 0 && arg4 != null) {
                arg4.method156(var12.field4483, arg5, arg6, 40, arg1, arg7);
            }
            if (var12.field4469 != 16) {
                class165.method1217(arg2, arg1, arg5, var12.field4469);
            }
        } else if (arg6 == 1) {
            class114 var36;
            if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                class21 var35 = var12.method1785(arg7, var21, arg10, var19, 101, var20, 1, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var35.field279, var19, var23, var22);
                }
                var36 = var35.field283;
            } else {
                var36 = new class95(arg9, 1, arg7, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
            }
            class76.method553(arg2, arg1, arg5, var21, var36, (class114) null, class242.field4108[arg7], 0, var29);
            if (var12.field4417 && arg10) {
                if (arg7 == 0) {
                    class122.field2036[arg2][arg1][arg5 + 1] = 50;
                } else if (arg7 == 1) {
                    class122.field2036[arg2][arg1 + 1][arg5 + 1] = 50;
                } else if (arg7 == 2) {
                    class122.field2036[arg2][arg1 + 1][arg5] = 50;
                } else if (arg7 == 3) {
                    class122.field2036[arg2][arg1][arg5] = 50;
                }
            }
            if (var12.field4470 != 0 && arg4 != null) {
                arg4.method156(var12.field4483, arg5, arg6, 40, arg1, arg7);
            }
        } else if (arg6 == 2) {
            int var66 = arg7 + 1 & 0x3;
            class114 var68;
            class114 var70;
            if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                class21 var67 = var12.method1785(arg7 + 4, var21, arg10, var19, -97, var20, 2, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var67.field279, var19, var23, var22);
                }
                var68 = var67.field283;
                class21 var69 = var12.method1785(var66, var21, arg10, var19, 102, var20, 2, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var69.field279, var19, var23, var22);
                }
                var70 = var69.field283;
            } else {
                var68 = new class95(arg9, 2, arg7 + 4, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
                var70 = new class95(arg9, 2, var66, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
            }
            class76.method553(arg2, arg1, arg5, var21, var68, var70, class315.field5409[arg7], class315.field5409[var66], var29);
            if (var12.field4468 && arg10) {
                if (arg7 == 0) {
                    class119.field2003[arg2][arg1][arg5] = class221.method1516(class119.field2003[arg2][arg1][arg5], 1);
                    class119.field2003[arg2][arg1][arg5 + 1] = class221.method1516(class119.field2003[arg2][arg1][arg5 + 1], 2);
                } else if (arg7 == 1) {
                    class119.field2003[arg2][arg1][arg5 + 1] = class221.method1516(class119.field2003[arg2][arg1][arg5 + 1], 2);
                    class119.field2003[arg2][arg1 + 1][arg5] = class221.method1516(class119.field2003[arg2][arg1 + 1][arg5], 1);
                } else if (arg7 == 2) {
                    class119.field2003[arg2][arg1 + 1][arg5] = class221.method1516(class119.field2003[arg2][arg1 + 1][arg5], 1);
                    class119.field2003[arg2][arg1][arg5] = class221.method1516(class119.field2003[arg2][arg1][arg5], 2);
                } else if (arg7 == 3) {
                    class119.field2003[arg2][arg1][arg5] = class221.method1516(class119.field2003[arg2][arg1][arg5], 2);
                    class119.field2003[arg2][arg1][arg5] = class221.method1516(class119.field2003[arg2][arg1][arg5], 1);
                }
            }
            if (var12.field4470 != 0 && arg4 != null) {
                arg4.method156(var12.field4483, arg5, arg6, 40, arg1, arg7);
            }
            if (var12.field4469 != 16) {
                class165.method1217(arg2, arg1, arg5, var12.field4469);
            }
        } else if (arg6 == 3) {
            class114 var38;
            if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                class21 var37 = var12.method1785(arg7, var21, arg10, var19, -111, var20, 3, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var37.field279, var19, var23, var22);
                }
                var38 = var37.field283;
            } else {
                var38 = new class95(arg9, 3, arg7, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
            }
            class76.method553(arg2, arg1, arg5, var21, var38, (class114) null, class242.field4108[arg7], 0, var29);
            if (var12.field4417 && arg10) {
                if (arg7 == 0) {
                    class122.field2036[arg2][arg1][arg5 + 1] = 50;
                } else if (arg7 == 1) {
                    class122.field2036[arg2][arg1 + 1][arg5 + 1] = 50;
                } else if (arg7 == 2) {
                    class122.field2036[arg2][arg1 + 1][arg5] = 50;
                } else if (arg7 == 3) {
                    class122.field2036[arg2][arg1][arg5] = 50;
                }
            }
            if (var12.field4470 != 0 && arg4 != null) {
                arg4.method156(var12.field4483, arg5, arg6, 40, arg1, arg7);
            }
        } else if (arg6 == 9) {
            class114 var40;
            if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                class21 var39 = var12.method1785(arg7, var21, arg10, var19, 66, var20, arg6, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var39.field279, var19, var23, var22);
                }
                var40 = var39.field283;
            } else {
                var40 = new class95(arg9, arg6, arg7, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
            }
            class241.method1662(arg2, arg1, arg5, var21, 1, 1, var40, 0, var29);
            if (var12.field4470 != 0 && arg4 != null) {
                arg4.method174(arg5, 1, var14, arg1, var13, var12.field4483);
            }
            if (var12.field4469 != 16) {
                class165.method1217(arg2, arg1, arg5, var12.field4469);
            }
        } else if (arg6 == 4) {
            class114 var42;
            if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                class21 var41 = var12.method1785(arg7, var21, arg10, var19, 111, var20, 4, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var41.field279, var19, var23, var22);
                }
                var42 = var41.field283;
            } else {
                var42 = new class95(arg9, 4, arg7, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
            }
            class298.method2009(arg2, arg1, arg5, var21, var42, (class114) null, class315.field5409[arg7], 0, 0, 0, var29);
        } else if (arg6 == 5) {
            int var43 = 16;
            long var44 = class214.method1486(arg2, arg1, arg5);
            if (var44 != 0L) {
                var43 = class185.method1338((int) (var44 >>> 32) & Integer.MAX_VALUE, -7153).field4469;
            }
            class114 var47;
            if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                class21 var46 = var12.method1785(arg7, var21, arg10, var19, 108, var20, 4, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var46.field279, var19 - (class14.field195[arg7] * 8), var23, var22 - (class91.field1445[arg7] * 8));
                }
                var47 = var46.field283;
            } else {
                var47 = new class95(arg9, 4, arg7, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
            }
            class298.method2009(arg2, arg1, arg5, var21, var47, (class114) null, class315.field5409[arg7], 0, class14.field195[arg7] * var43, class91.field1445[arg7] * var43, var29);
        } else if (arg6 == 6) {
            int var61 = 8;
            long var62 = class214.method1486(arg2, arg1, arg5);
            if (var62 != 0L) {
                var61 = class185.method1338((int) (var62 >>> 32) & Integer.MAX_VALUE, -7153).field4469 / 2;
            }
            class114 var65;
            if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                class21 var64 = var12.method1785(arg7 + 4, var21, arg10, var19, -120, var20, 4, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var64.field279, var19 - (class199.field3388[arg7] * 8), var23, var22 - (class294.field4902[arg7] * 8));
                }
                var65 = var64.field283;
            } else {
                var65 = new class95(arg9, 4, arg7 + 4, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
            }
            class298.method2009(arg2, arg1, arg5, var21, var65, (class114) null, 256, arg7, class199.field3388[arg7] * var61, class294.field4902[arg7] * var61, var29);
        } else if (arg6 == 7) {
            int var48 = arg7 + 2 & 0x3;
            class114 var50;
            if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                class21 var49 = var12.method1785(var48 + 4, var21, arg10, var19, -108, var20, 4, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var49.field279, var19, var23, var22);
                }
                var50 = var49.field283;
            } else {
                var50 = new class95(arg9, 4, var48 + 4, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
            }
            class298.method2009(arg2, arg1, arg5, var21, var50, (class114) null, 256, var48, 0, 0, var29);
        } else if (arg6 == 8) {
            int var51 = 8;
            long var52 = class214.method1486(arg2, arg1, arg5);
            if (var52 != 0L) {
                var51 = class185.method1338(Integer.MAX_VALUE & (int) (var52 >>> 32), -7153).field4469 / 2;
            }
            int var54 = arg7 + 2 & 0x3;
            class114 var58;
            class114 var60;
            if (var12.field4434 == -1 && var12.field4435 == null && !var12.field4457) {
                int var55 = class199.field3388[arg7] * 8;
                int var56 = class294.field4902[arg7] * 8;
                class21 var57 = var12.method1785(arg7 + 4, var21, arg10, var19, 75, var20, 4, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var57.field279, var19 - var55, var23, var22 - var56);
                }
                var58 = var57.field283;
                class21 var59 = var12.method1785(var54 + 4, var21, arg10, var19, -120, var20, 4, var25, var22, var28, (class2) null);
                if (class56.field846 && var28) {
                    class66.method475(var59.field279, var19 - var55, var23, var22 - var56);
                }
                var60 = var59.field283;
            } else {
                var58 = new class95(arg9, 4, arg7 + 4, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
                var60 = new class95(arg9, 4, var54 + 4, arg3, arg1, arg5, var12.field4434, var12.field4455, (class114) null);
            }
            class298.method2009(arg2, arg1, arg5, var21, var58, var60, 256, arg7, class199.field3388[arg7] * var51, class294.field4902[arg7] * var51, var29);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 992)
    public static final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class197.field3377 * 128) {
            arg0 = class197.field3377 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class65.field1094 * 128) {
            arg2 = class65.field1094 * 128 - 1;
        }
        class15.field201 = class236.field3985[arg3];
        class306.field5137 = class236.field3971[arg3];
        class195.field3320 = class236.field3985[arg4];
        class41.field670 = class236.field3971[arg4];
        class39.field625 = arg0;
        class189.field3241 = arg1;
        class318.field5452 = arg2;
        class175.field3094 = arg0 / 128;
        class169.field3016 = arg2 / 128;
        class300.field4970 = class175.field3094 - class31.field438;
        if (class300.field4970 < 0) {
            class300.field4970 = 0;
        }
        class270.field4558 = class169.field3016 - class31.field438;
        if (class270.field4558 < 0) {
            class270.field4558 = 0;
        }
        class130.field2226 = class31.field438 + class175.field3094;
        if (class130.field2226 > class197.field3377) {
            class130.field2226 = class197.field3377;
        }
        class112.field1846 = class31.field438 + class169.field3016;
        if (class112.field1846 > class65.field1094) {
            class112.field1846 = class65.field1094;
        }
        short var15;
        if (class56.field846) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class31.field438 + class31.field438 + 2; var16++) {
            for (int var17 = 0; var17 < class31.field438 + class31.field438 + 2; var17++) {
                int var18 = (var16 - class31.field438 << 7) - (class39.field625 & 0x7F);
                int var19 = (var17 - class31.field438 << 7) - (class318.field5452 & 0x7F);
                int var20 = class175.field3094 + var16 - class31.field438;
                int var21 = class169.field3016 + var17 - class31.field438;
                if (var20 >= 0 && var21 >= 0 && var20 < class197.field3377 && var21 < class65.field1094) {
                    int var22;
                    if (class177.field3122 == null) {
                        var22 = class320.field5486[0][var20][var21] + 128 - class189.field3241;
                    } else {
                        var22 = class177.field3122[0][var20][var21] + 128 - class189.field3241;
                    }
                    int var23 = class320.field5486[3][var20][var21] - class189.field3241 - 1000;
                    class63.field1072[var16][var17] = class301.method2022(var18, var23, var22, var19, var15);
                } else {
                    class63.field1072[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class31.field438 + class31.field438 + 1; var24++) {
            for (int var25 = 0; var25 < class31.field438 + class31.field438 + 1; var25++) {
                class29.field411[var24][var25] = class63.field1072[var24][var25] || class63.field1072[var24 + 1][var25] || class63.field1072[var24][var25 + 1] || class63.field1072[var24 + 1][var25 + 1];
            }
        }
        class30.field418 = arg6;
        class89.field1397 = arg7;
        class286.field4757 = arg8;
        class31.field427 = arg9;
        class241.field4079 = arg10;
        class175.method1271();
        if (class307.field5211 != null) {
            class309.method2112(true);
            class144.method1050(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class56.field846) {
                class182.field3165 = false;
                class51.method325(0, 0, 26604);
                class235.method1598((float[]) null);
                class256.method1731();
            }
            class309.method2112(false);
        }
        class144.method1050(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
}
