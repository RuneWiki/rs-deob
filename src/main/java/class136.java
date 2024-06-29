import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class136 extends class68 {

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "[I")
    public int[] field3311 = new int[1];

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "[I")
    public int[] field3312 = new int[] { -1 };

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field3308 = -1;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "Lae;")
    private static class6 field3313 = class64.method474(126, "Loaded update list");

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "Lae;")
    public static class6 field3310 = field3313;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "Lae;")
    public static class6 field3316 = class64.method474(118, "Name eingeben:");

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "Lle;")
    public static class73 field3309 = new class73();

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "Lae;")
    private static class6 field3317 = class64.method474(115, "Drop");

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "Lae;")
    public static class6 field3318 = field3317;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)I", line = 16)
    public static final int method1106(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 179) {
            arg1 /= 2;
        }
        if (arg0 > 192) {
            arg1 /= 2;
        }
        int var4 = 101 % ((arg2 + 41) / 51);
        field3314++;
        if (arg0 > 217) {
            arg1 /= 2;
        }
        if (arg0 > 243) {
            arg1 /= 2;
        }
        return arg0 / 2 + (arg1 / 32 << 7) + (arg3 / 4 << 10);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 70)
    public static void method1107(byte arg0) {
        field3316 = null;
        int var1 = 32 / ((arg0 - 70) / 41);
        field3318 = null;
        field3309 = null;
        field3310 = null;
        field3317 = null;
        field3313 = null;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V", line = 87)
    public static final void method1108(int arg0) {
        field3315++;
        int var1 = -1;
        if (class19.field382 == 0 && !class117.field2783) {
            class41.field949++;
            class6.method26(class117.field2771, class52.field1182, class57.field1244, class133.field3262, (byte) -70, 0, 33);
        }
        int var2 = 0;
        if (arg0 != -65) {
            field3309 = null;
        }
        while (var2 < class131.field3227) {
            int var3 = class131.field3222[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 29 & 0x3;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                label274: {
                    var1 = var3;
                    if (var6 == 2 && class81.field1967.method524(class15.field305, var4, var5, var3) >= 0) {
                        class107 var8 = class80.method687(var7, (byte) 108);
                        if (var8.field2559 != null) {
                            var8 = var8.method900(0);
                        }
                        if (var8 == null) {
                            break label274;
                        }
                        if (class19.field382 == 1) {
                            class6.method26(var4, class76.field1792, var5, class85.method731(new class6[] { class96.field2290, class47.field1054, var8.field2527 }, 14569), (byte) -97, var3, 45);
                            class24.field614++;
                        } else if (!class117.field2783) {
                            class77.field1832++;
                            class6[] var9 = var8.field2562;
                            if (class82.field2012) {
                                var9 = class26.method233((byte) 127, var9);
                            }
                            if (var9 != null) {
                                for (int var10 = 4; var10 >= 0; var10--) {
                                    if (var9[var10] != null) {
                                        class105.field2485++;
                                        short var11 = 0;
                                        if (var10 == 0) {
                                            var11 = 55;
                                        }
                                        if (var10 == 1) {
                                            var11 = 57;
                                        }
                                        if (var10 == 2) {
                                            var11 = 43;
                                        }
                                        if (var10 == 3) {
                                            var11 = 6;
                                        }
                                        if (var10 == 4) {
                                            var11 = 1005;
                                        }
                                        class6.method26(var4, var9[var10], var5, class85.method731(new class6[] { class6.field129, var8.field2527 }, 14569), (byte) -74, var3, var11);
                                    }
                                }
                            }
                            class6.method26(var4, class25.field636, var5, class85.method731(new class6[] { class6.field129, var8.field2527 }, 14569), (byte) -98, var8.field2526 << 14, 1006);
                        } else if ((class70.field1562 & 0x4) == 4) {
                            class6.method26(var4, client.field472, var5, class85.method731(new class6[] { class20.field395, class47.field1054, var8.field2527 }, 14569), (byte) -51, var3, 12);
                            class89.field2136++;
                        }
                    }
                    if (var6 == 1) {
                        class2 var12 = class49.field1097[var7];
                        if (var12.field11.field2347 == 1 && (var12.field1783 & 0x7F) == 64 && (var12.field1752 & 0x7F) == 64) {
                            for (int var13 = 0; var13 < class138.field3365; var13++) {
                                class2 var16 = class49.field1097[class42.field967[var13]];
                                if (var16 != null && var12 != var16 && var16.field11.field2347 == 1 && var12.field1783 == var16.field1783 && var12.field1752 == var16.field1752) {
                                    class109.method922(var4, class42.field967[var13], (byte) -120, var5, var16.field11);
                                }
                            }
                            for (int var14 = 0; var14 < class47.field1065; var14++) {
                                class66 var15 = class20.field387[class4.field47[var14]];
                                if (var15 != null && var12.field1783 == var15.field1783 && var12.field1752 == var15.field1752) {
                                    class32.method297(var4, class4.field47[var14], var5, var15, (byte) 61);
                                }
                            }
                        }
                        class109.method922(var4, var7, (byte) -103, var5, var12.field11);
                    }
                    if (var6 == 0) {
                        class66 var17 = class20.field387[var7];
                        if ((var17.field1783 & 0x7F) == 64 && (var17.field1752 & 0x7F) == 64) {
                            for (int var18 = 0; var18 < class138.field3365; var18++) {
                                class2 var21 = class49.field1097[class42.field967[var18]];
                                if (var21 != null && var21.field11.field2347 == 1 && var17.field1783 == var21.field1783 && var17.field1752 == var21.field1752) {
                                    class109.method922(var4, class42.field967[var18], (byte) -94, var5, var21.field11);
                                }
                            }
                            for (int var19 = 0; var19 < class47.field1065; var19++) {
                                class66 var20 = class20.field387[class4.field47[var19]];
                                if (var20 != null && var17 != var20 && var17.field1783 == var20.field1783 && var17.field1752 == var20.field1752) {
                                    class32.method297(var4, class4.field47[var19], var5, var20, (byte) 12);
                                }
                            }
                        }
                        class32.method297(var4, var7, var5, var17, (byte) -121);
                    }
                    if (var6 == 3) {
                        class95 var22 = class27.field682[class15.field305][var4][var5];
                        if (var22 != null) {
                            for (class49 var23 = (class49) var22.method791(arg0 ^ 0xFFFFFFA9); var23 != null; var23 = (class49) var22.method786((byte) -106)) {
                                class22 var24 = class43.method356(arg0 - 6, var23.field1106);
                                if (class19.field382 == 1) {
                                    class5.field60++;
                                    class6.method26(var4, class76.field1792, var5, class85.method731(new class6[] { class96.field2290, class30.field736, var24.field549 }, 14569), (byte) -63, var23.field1106, 4);
                                } else if (!class117.field2783) {
                                    class102.field2385++;
                                    class6[] var25 = var24.field561;
                                    if (class82.field2012) {
                                        var25 = class26.method233((byte) 127, var25);
                                    }
                                    for (int var26 = 4; var26 >= 0; var26--) {
                                        if (var25 != null && var25[var26] != null) {
                                            class52.field1177++;
                                            byte var27 = 0;
                                            if (var26 == 0) {
                                                var27 = 40;
                                            }
                                            if (var26 == 1) {
                                                var27 = 38;
                                            }
                                            if (var26 == 2) {
                                                var27 = 34;
                                            }
                                            if (var26 == 3) {
                                                var27 = 11;
                                            }
                                            if (var26 == 4) {
                                                var27 = 3;
                                            }
                                            class6.method26(var4, var25[var26], var5, class85.method731(new class6[] { class111.field2661, var24.field549 }, arg0 + 14634), (byte) -15, var23.field1106, var27);
                                        } else if (var26 == 2) {
                                            class51.field1142++;
                                            class6.method26(var4, class41.field926, var5, class85.method731(new class6[] { class111.field2661, var24.field549 }, 14569), (byte) -103, var23.field1106, 34);
                                        }
                                    }
                                    class6.method26(var4, class25.field636, var5, class85.method731(new class6[] { class111.field2661, var24.field549 }, 14569), (byte) -80, var23.field1106, 1003);
                                } else if ((class70.field1562 & 0x1) == 1) {
                                    class6.method26(var4, client.field472, var5, class85.method731(new class6[] { class20.field395, class30.field736, var24.field549 }, 14569), (byte) -47, var23.field1106, 27);
                                    class49.field1088++;
                                }
                            }
                        }
                    }
                }
            }
            var2++;
        }
    }
}
