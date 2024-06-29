import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class104 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lok;")
    private static class146 field1674 = class235.method1724(-12908, "Jun");

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Lok;")
    private static class146 field1682 = class235.method1724(-12908, "Aug");

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lok;")
    private static class146 field1679 = class235.method1724(-12908, "Feb");

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lok;")
    private static class146 field1677 = class235.method1724(-12908, "Dec");

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lok;")
    private static class146 field1675 = class235.method1724(-12908, "Jan");

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lok;")
    private static class146 field1678 = class235.method1724(-12908, "Oct");

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "Lok;")
    private static class146 field1685 = class235.method1724(-12908, "Apr");

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lok;")
    private static class146 field1673 = class235.method1724(-12908, "Jul");

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "Lok;")
    private static class146 field1692 = class235.method1724(-12908, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Lok;")
    private static class146 field1680 = class235.method1724(-12908, "Nov");

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "Lok;")
    private static class146 field1687 = class235.method1724(-12908, "Mar");

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field1686 = 0;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "Lok;")
    public static class146 field1694 = field1692;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "Lok;")
    private static class146 field1684 = class235.method1724(-12908, "May");

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "Lok;")
    private static class146 field1695 = class235.method1724(-12908, "Sep");

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "Lok;")
    public static class146 field1691 = class235.method1724(-12908, "<col=00ffff>");

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "[Lok;")
    public static class146[] field1689 = new class146[] { field1675, field1679, field1687, field1685, field1684, field1674, field1673, field1682, field1695, field1678, field1680, field1677 };

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "[Lan;")
    public static class315[] field1696;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIII)V", line = 25)
    public static final void method707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1690++;
        long var6 = class296.method2106(arg1, arg5, arg3);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x3D16FC) >> 20;
            int var9 = ((int) var6 & 0x7F283) >> 14;
            int var10 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class5 var11 = class112.method756((byte) -122, var10);
            if (var11.field114 == -1) {
                int var12 = arg4;
                if (var6 > 0L) {
                    var12 = arg2;
                }
                int[] var13 = class181.field3040;
                int var14 = (52736 - (arg3 * 512)) * 4 + arg5 * 4 + 24624;
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var13[var14] = var12;
                        var13[var14 + 512] = var12;
                        var13[var14 + 1024] = var12;
                        var13[var14 + 1536] = var12;
                    } else if (var8 == 1) {
                        var13[var14] = var12;
                        var13[var14 + 1] = var12;
                        var13[var14 + 2] = var12;
                        var13[var14 + 3] = var12;
                    } else if (var8 == 2) {
                        var13[var14 + 3] = var12;
                        var13[var14 + 515] = var12;
                        var13[var14 + 3 + 1024] = var12;
                        var13[var14 + 3 + 1536] = var12;
                    } else if (var8 == 3) {
                        var13[var14 + 1536] = var12;
                        var13[var14 + 1536 + 1] = var12;
                        var13[var14 + 2 + 1536] = var12;
                        var13[var14 + 1536 + 3] = var12;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var13[var14] = var12;
                    } else if (var8 == 1) {
                        var13[var14 + 3] = var12;
                    } else if (var8 == 2) {
                        var13[var14 + 3 + 1536] = var12;
                    } else if (var8 == 3) {
                        var13[var14 + 1536] = var12;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var13[var14] = var12;
                        var13[var14 + 512] = var12;
                        var13[var14 + 1024] = var12;
                        var13[var14 + 1536] = var12;
                    } else if (var8 == 0) {
                        var13[var14] = var12;
                        var13[var14 + 1] = var12;
                        var13[var14 + 2] = var12;
                        var13[var14 + 3] = var12;
                    } else if (var8 == 1) {
                        var13[var14 + 3] = var12;
                        var13[var14 + 515] = var12;
                        var13[var14 + 3 + 1024] = var12;
                        var13[var14 + 1536 + 3] = var12;
                    } else if (var8 == 2) {
                        var13[var14 + 1536] = var12;
                        var13[var14 + 1 + 1536] = var12;
                        var13[var14 + 2 + 1536] = var12;
                        var13[var14 + 1539] = var12;
                    }
                }
            } else {
                class315 var15 = null;
                int var16 = var11.field62;
                if (!var11.field84) {
                    var15 = class124.field2042[var11.field114];
                } else if (var8 == 0) {
                    var15 = class124.field2042[var11.field114];
                } else if (var8 == 1) {
                    var16 = var11.field66;
                    var15 = class175.field2926[var11.field114];
                } else if (var8 == 2) {
                    var15 = class190.field3149[var11.field114];
                } else if (var8 == 3) {
                    var16 = var11.field66;
                    var15 = class25.field448[var11.field114];
                }
                if (var15 != null) {
                    var15.method180(arg5 * 4 + 48, (104 - var16 + -arg3) * 4 + 48);
                }
            }
        }
        long var17 = class248.method1820(arg1, arg5, arg3);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x342365) >> 20;
            int var20 = ((int) var17 & 0x7C25C) >> 14;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class5 var22 = class112.method756((byte) -115, var21);
            if (var22.field114 != -1) {
                int var23 = var22.field62;
                class315 var24 = null;
                if (!var22.field84) {
                    var24 = class124.field2042[var22.field114];
                } else if (var19 == 0) {
                    var24 = class124.field2042[var22.field114];
                } else if (var19 == 1) {
                    var24 = class175.field2926[var22.field114];
                    var23 = var22.field66;
                } else if (var19 == 2) {
                    var24 = class190.field3149[var22.field114];
                } else if (var19 == 3) {
                    var23 = var22.field66;
                    var24 = class25.field448[var22.field114];
                }
                if (var24 != null) {
                    var24.method180(arg5 * 4 + 48, 48 - -((-arg3 + 104 + -var23) * 4));
                }
            } else if (var20 == 9) {
                int var25 = 15658734;
                if (var17 > 0L) {
                    var25 = 15597568;
                }
                int[] var26 = class181.field3040;
                int var27 = (52736 - (arg3 * 512)) * 4 + arg5 * 4 + 24624;
                if (var19 == 0 || var19 == 2) {
                    var26[var27 + 1536] = var25;
                    var26[var27 + 1024 + 1] = var25;
                    var26[var27 + 512 + 2] = var25;
                    var26[var27 + 3] = var25;
                } else {
                    var26[var27] = var25;
                    var26[var27 + 513] = var25;
                    var26[var27 + 1026] = var25;
                    var26[var27 + 1536 + 3] = var25;
                }
            }
        }
        if (arg0 != 2) {
            return;
        }
        long var28 = class259.method1881(arg1, arg5, arg3);
        if (var28 == 0L) {
            return;
        }
        int var30 = (int) (var28 >>> 32) & Integer.MAX_VALUE;
        class5 var31 = class112.method756((byte) -125, var30);
        int var32 = ((int) var28 & 0x35A985) >> 20;
        if (var31.field114 == -1) {
            return;
        }
        class315 var33 = null;
        int var34 = var31.field62;
        if (!var31.field84) {
            var33 = class124.field2042[var31.field114];
        } else if (var32 == 0) {
            var33 = class124.field2042[var31.field114];
        } else if (var32 == 1) {
            var33 = class175.field2926[var31.field114];
            var34 = var31.field66;
        } else if (var32 == 2) {
            var33 = class190.field3149[var31.field114];
        } else if (var32 == 3) {
            var34 = var31.field66;
            var33 = class25.field448[var31.field114];
        }
        if (var33 != null) {
            var33.method180(arg5 * 4 + 48, (-var34 + 104 + -arg3) * 4 + 48);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 340)
    public static void method708(int arg0) {
        field1691 = null;
        field1682 = null;
        field1675 = null;
        field1678 = null;
        field1684 = null;
        field1673 = null;
        int var1 = -44 % ((-arg0 - 60) / 48);
        field1685 = null;
        field1677 = null;
        field1696 = null;
        field1687 = null;
        field1680 = null;
        field1679 = null;
        field1674 = null;
        field1689 = null;
        field1694 = null;
        field1692 = null;
        field1695 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III[[[Lse;ZI)Z", line = 368)
    public static final boolean method709(int arg0, int arg1, int arg2, class11[][][] arg3, boolean arg4, int arg5) {
        field1688++;
        byte var6 = arg4 ? 1 : (byte) (class260.field4321 & 0xFF);
        if (class300.field5075[class203.field3387][arg0][arg5] == var6) {
            return false;
        } else if ((class46.field775[class203.field3387][arg0][arg5] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class191.field3162[var8] = arg0;
            int var31 = var8 + 1;
            class300.field5077[var8] = arg5;
            class300.field5075[class203.field3387][arg0][arg5] = var6;
            while (var7 != var31) {
                int var9 = class191.field3162[var7] & 0xFFFF;
                int var10 = class191.field3162[var7] >> 24 & 0xFF;
                int var11 = class300.field5077[var7] >> 16 & 0xFF;
                boolean var12 = false;
                int var13 = class300.field5077[var7] & 0xFFFF;
                int var14 = (class191.field3162[var7] & 0xFF0E1F) >> 16;
                if ((class46.field775[class203.field3387][var9][var13] & 0x4) == 0) {
                    var12 = true;
                }
                var7 = var7 + 1 & 0xFFF;
                boolean var15 = false;
                label238: for (int var16 = class203.field3387 + 1; var16 <= 3; var16++) {
                    if ((class46.field775[var16][var9][var13] & 0x8) == 0) {
                        if (var12 && arg3[var16][var9][var13] != null) {
                            if (arg3[var16][var9][var13].field212 != null) {
                                int var17 = class51.method415(18, var14);
                                if (arg3[var16][var9][var13].field212.field4773 == var17 || arg3[var16][var9][var13].field212.field4765 == var17) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var18 = class51.method415(18, var10);
                                    if (arg3[var16][var9][var13].field212.field4773 == var18 || arg3[var16][var9][var13].field212.field4765 == var18) {
                                        continue;
                                    }
                                }
                                if (var11 != 0) {
                                    int var19 = class51.method415(arg2 - 999981, var11);
                                    if (arg3[var16][var9][var13].field212.field4773 == var19 || arg3[var16][var9][var13].field212.field4765 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var16][var9][var13].field217 != null) {
                                for (int var20 = 0; var20 < arg3[var16][var9][var13].field218; var20++) {
                                    int var21 = (int) (arg3[var16][var9][var13].field217[var20].field5289 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg3[var16][var9][var13].field217[var20].field5289 >> 20 & 0x3L);
                                    int var23 = var22 << 6 | var21;
                                    if (var14 == var23 || var10 != 0 && var10 == var23 || var11 != 0 && var11 == var23) {
                                        continue label238;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class11 var24 = arg3[var16][var9][var13];
                        if (var24 != null && var24.field218 > 0) {
                            for (int var25 = 0; var25 < var24.field218; var25++) {
                                class311 var26 = var24.field217[var25];
                                if (var26.field5302 != var26.field5296 || var26.field5299 != var26.field5294) {
                                    for (int var27 = var26.field5296; var27 <= var26.field5302; var27++) {
                                        for (int var28 = var26.field5294; var28 <= var26.field5299; var28++) {
                                            class300.field5075[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class300.field5075[var16][var9][var13] = var6;
                    }
                }
                if (var15) {
                    if (class174.field2914[class203.field3387 + 1][var9][var13] > class85.field1353[arg1]) {
                        class85.field1353[arg1] = class174.field2914[class203.field3387 + 1][var9][var13];
                    }
                    int var29 = var9 << 7;
                    int var30 = var13 << 7;
                    if (class28.field484[arg1] > var29) {
                        class28.field484[arg1] = var29;
                    } else if (class248.field4136[arg1] < var29) {
                        class248.field4136[arg1] = var29;
                    }
                    if (class27.field464[arg1] > var30) {
                        class27.field464[arg1] = var30;
                    } else if (var30 > class232.field3878[arg1]) {
                        class232.field3878[arg1] = var30;
                    }
                }
                if (!var12) {
                    if (var9 >= 1 && class300.field5075[class203.field3387][var9 - 1][var13] != var6) {
                        class191.field3162[var31] = class138.method1013(class138.method1013(1179648, var9 - 1), -754974720);
                        class300.field5077[var31] = class138.method1013(var13, 1245184);
                        class300.field5075[class203.field3387][var9 - 1][var13] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var13++;
                    if (var13 < 104) {
                        if ((var9 - 1) >= 0 && class300.field5075[class203.field3387][var9 - 1][var13] != var6 && (class46.field775[class203.field3387][var9][var13] & 0x4) == 0 && (class46.field775[class203.field3387][var9 - 1][var13 - 1] & 0x4) == 0) {
                            class191.field3162[var31] = class138.method1013(1375731712, class138.method1013(1179648, var9 - 1));
                            class300.field5077[var31] = class138.method1013(1245184, var13);
                            class300.field5075[class203.field3387][var9 - 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class300.field5075[class203.field3387][var9][var13] != var6) {
                            class191.field3162[var31] = class138.method1013(318767104, class138.method1013(var9, 5373952));
                            class300.field5077[var31] = class138.method1013(var13, 5439488);
                            class300.field5075[class203.field3387][var9][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class300.field5075[class203.field3387][var9 + 1][var13] != var6 && (class46.field775[class203.field3387][var9][var13] & 0x4) == 0 && (class46.field775[class203.field3387][var9 + 1][var13 - 1] & 0x4) == 0) {
                            class191.field3162[var31] = class138.method1013(class138.method1013(5373952, var9 + 1), -1845493760);
                            class300.field5077[var31] = class138.method1013(var13, 5439488);
                            class300.field5075[class203.field3387][var9 + 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if ((var9 + 1) < 104 && class300.field5075[class203.field3387][var9 + 1][var13] != var6) {
                        class191.field3162[var31] = class138.method1013(1392508928, class138.method1013(9568256, var9 + 1));
                        class300.field5077[var31] = class138.method1013(var13, 9633792);
                        class300.field5075[class203.field3387][var9 + 1][var13] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if ((var9 - 1) >= 0 && class300.field5075[class203.field3387][var9 - 1][var13] != var6 && (class46.field775[class203.field3387][var9][var13] & 0x4) == 0 && (class46.field775[class203.field3387][var9 - 1][var13 + 1] & 0x4) == 0) {
                            class191.field3162[var31] = class138.method1013(class138.method1013(var9 - 1, 13762560), 301989888);
                            class300.field5077[var31] = class138.method1013(13828096, var13);
                            var31 = var31 + 1 & 0xFFF;
                            class300.field5075[class203.field3387][var9 - 1][var13] = var6;
                        }
                        if (class300.field5075[class203.field3387][var9][var13] != var6) {
                            class191.field3162[var31] = class138.method1013(class138.method1013(var9, 13762560), -1828716544);
                            class300.field5077[var31] = class138.method1013(var13, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class300.field5075[class203.field3387][var9][var13] = var6;
                        }
                        if (var9 + 1 < 104 && class300.field5075[class203.field3387][var9 + 1][var13] != var6 && (class46.field775[class203.field3387][var9][var13] & 0x4) == 0 && (class46.field775[class203.field3387][var9 + 1][var13 + 1] & 0x4) == 0) {
                            class191.field3162[var31] = class138.method1013(class138.method1013(9568256, var9 + 1), -771751936);
                            class300.field5077[var31] = class138.method1013(var13, 9633792);
                            class300.field5075[class203.field3387][var9 + 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (~class85.field1353[arg1] != arg2) {
                class85.field1353[arg1] += 10;
                class28.field484[arg1] -= 50;
                class248.field4136[arg1] += 50;
                class232.field3878[arg1] += 50;
                class27.field464[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZB)V", line = 705)
    public static final void method710(boolean arg0, byte arg1) {
        field1683++;
        class113.field1800 = arg0;
        if (arg1 != -8) {
            return;
        }
        if (!class113.field1800) {
            int var25 = client.field4080.method360(-1);
            int var26 = client.field4080.method346((byte) -1);
            int var27 = client.field4080.method379(-2);
            int var28 = client.field4080.method336(-2);
            int var29 = client.field4080.method379(-2);
            int var30 = (class46.field781 - client.field4080.field857) / 16;
            class36.field670 = new int[var30][4];
            for (int var31 = 0; var31 < var30; var31++) {
                for (int var32 = 0; var32 < 4; var32++) {
                    class36.field670[var31][var32] = client.field4080.method362(-1);
                }
            }
            class177.field3002 = new int[var30];
            class85.field1352 = new byte[var30][];
            class311.field5305 = new int[var30];
            class183.field3059 = new int[var30];
            class43.field735 = new byte[var30][];
            class294.field4994 = new byte[var30][];
            class55.field992 = new int[var30];
            class248.field4121 = (byte[][]) null;
            class235.field3927 = new int[var30];
            class139.field2312 = null;
            class88.field1396 = new byte[var30][];
            int var33 = 0;
            boolean var34 = false;
            if ((var27 / 8 == 48 || var27 / 8 == 49) && var28 / 8 == 48) {
                var34 = true;
            }
            if (var27 / 8 == 48 && (var28 / 8) == 148) {
                var34 = true;
            }
            for (int var35 = (var27 - 6) / 8; var35 <= (var27 + 6) / 8; var35++) {
                for (int var36 = (var28 - 6) / 8; var36 <= (var28 + 6) / 8; var36++) {
                    int var37 = (var35 << 8) + var36;
                    if (var34 && var36 == 49 || var36 == 149 || var36 == 147 || var35 == 50 || !(var35 != 49 || var36 != 47)) {
                        class177.field3002[var33] = var37;
                        class183.field3059[var33] = -1;
                        class235.field3927[var33] = -1;
                        class55.field992[var33] = -1;
                        class311.field5305[var33] = -1;
                    } else {
                        class177.field3002[var33] = var37;
                        class183.field3059[var33] = class280.field4807.method103(-126, class112.method758(-81, new class146[] { class211.field3496, class82.method585(14744, var35), class260.field4330, class82.method585(class35.method255(arg1, -14752), var36) }));
                        class235.field3927[var33] = class280.field4807.method103(29, class112.method758(120, new class146[] { class47.field827, class82.method585(class35.method255(arg1, -14752), var35), class260.field4330, class82.method585(14744, var36) }));
                        class55.field992[var33] = class280.field4807.method103(arg1 - 106, class112.method758(arg1 + -3, new class146[] { class177.field2995, class82.method585(14744, var35), class260.field4330, class82.method585(14744, var36) }));
                        class311.field5305[var33] = class280.field4807.method103(118, class112.method758(arg1 - 3, new class146[] { class174.field2913, class82.method585(14744, var35), class260.field4330, class82.method585(arg1 + 14752, var36) }));
                    }
                    var33++;
                }
            }
            class170.method1315(var27, var28, false, var26, 104, var25, var29);
            return;
        }
        int var2 = client.field4080.method360(arg1 + 7);
        client.field4080.method1653(14051);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 13; var4++) {
                for (int var5 = 0; var5 < 13; var5++) {
                    int var6 = client.field4080.method1659(1, false);
                    if (var6 == 1) {
                        class52.field944[var3][var4][var5] = client.field4080.method1659(26, false);
                    } else {
                        class52.field944[var3][var4][var5] = -1;
                    }
                }
            }
        }
        client.field4080.method1655(false);
        int var7 = (class46.field781 - client.field4080.field857) / 16;
        class36.field670 = new int[var7][4];
        for (int var8 = 0; var8 < var7; var8++) {
            for (int var9 = 0; var9 < 4; var9++) {
                class36.field670[var8][var9] = client.field4080.method366(true);
            }
        }
        int var10 = client.field4080.method379(-2);
        int var11 = client.field4080.method346((byte) -1);
        int var12 = client.field4080.method379(arg1 + 6);
        int var13 = client.field4080.method390((byte) -106);
        class248.field4121 = (byte[][]) null;
        class55.field992 = new int[var7];
        class294.field4994 = new byte[var7][];
        class311.field5305 = new int[var7];
        class88.field1396 = new byte[var7][];
        class183.field3059 = new int[var7];
        class177.field3002 = new int[var7];
        class43.field735 = new byte[var7][];
        class139.field2312 = null;
        class235.field3927 = new int[var7];
        class85.field1352 = new byte[var7][];
        int var14 = 0;
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = class52.field944[var15][var16][var17];
                    if (var18 != -1) {
                        int var19 = var18 >> 14 & 0x3FF;
                        int var20 = (var18 & 0x3FFD) >> 3;
                        int var21 = (var19 / 8 << 8) + var20 / 8;
                        for (int var22 = 0; var22 < var14; var22++) {
                            if (class177.field3002[var22] == var21) {
                                var21 = -1;
                                break;
                            }
                        }
                        if (var21 != -1) {
                            class177.field3002[var14] = var21;
                            int var23 = var21 >> 8 & 0xFF;
                            int var24 = var21 & 0xFF;
                            class183.field3059[var14] = class280.field4807.method103(arg1 + 92, class112.method758(-124, new class146[] { class211.field3496, class82.method585(14744, var23), class260.field4330, class82.method585(14744, var24) }));
                            class235.field3927[var14] = class280.field4807.method103(126, class112.method758(119, new class146[] { class47.field827, class82.method585(14744, var23), class260.field4330, class82.method585(arg1 + 14752, var24) }));
                            class55.field992[var14] = class280.field4807.method103(-84, class112.method758(123, new class146[] { class177.field2995, class82.method585(14744, var23), class260.field4330, class82.method585(14744, var24) }));
                            class311.field5305[var14] = class280.field4807.method103(-96, class112.method758(-69, new class146[] { class174.field2913, class82.method585(14744, var23), class260.field4330, class82.method585(arg1 + 14752, var24) }));
                            var14++;
                        }
                    }
                }
            }
        }
        class170.method1315(var10, var13, false, var11, arg1 ^ 0xFFFFFF90, var2, var12);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Lmg;", line = 962)
    public static final class151 method711(int arg0, int arg1, int arg2) {
        field1681++;
        class151 var3 = new class151();
        for (class194 var4 = (class194) class32.field601.method1251(51); var4 != null; var4 = (class194) class32.field601.method1253(79)) {
            if (var4.field3226 && var4.method1498(arg1, arg0, 11052)) {
                var3.method1195((byte) -93, var4);
            }
        }
        int var5 = 71 % ((-arg2 - 56) / 42);
        return var3;
    }
}
