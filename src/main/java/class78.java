import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class78 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
    public static int[] field1721 = new int[500];

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lkb;")
    public static class70 field1725 = new class70();

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Lvc;")
    private static class137 field1735 = class45.method325("This computers address has been blocked", -46);

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1732 = 0;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1733 = 78;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static volatile int field1736 = -1;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field1744 = 0;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "[Lqe;")
    public static class109[] field1737 = new class109[2048];

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lvc;")
    private static class137 field1731 = class45.method325("System update in: ", -46);

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lvc;")
    public static class137 field1738 = field1735;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field1741 = 0;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field1747 = 0;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Lvc;")
    private static class137 field1743 = class45.method325("Drop", -46);

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lvc;")
    public static class137 field1739 = field1743;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Lvc;")
    public static class137 field1742 = field1731;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1729 = 0;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Lvc;")
    public static class137 field1745 = class45.method325(": ", -46);

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static volatile int field1748 = 0;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Lvc;")
    public static class137 field1734 = class45.method325("sideicons", -46);

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "[S")
    public static short[] field1749 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "Lvc;")
    private static class137 field1750 = class45.method325("Please wait 5 minutes before trying again)3", -46);

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lvc;")
    public static class137 field1740 = field1750;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "[I")
    public static int[] field1730;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "[[[B")
    public static byte[][][] field1746;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lqe;B)Lvc;")
    public static final class137 method575(class109 arg0, byte arg1) {
        int var2 = -97 % ((arg1 - 17) / 32);
        field1728++;
        return class25.method213(32767, true, arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lnb;Lvc;BLvc;)Lwe;")
    public static final class145 method576(class88 arg0, class137 arg1, byte arg2, class137 arg3) {
        field1726++;
        if (arg2 <= 18) {
            return null;
        } else {
            int var4 = arg0.method641(1, arg1);
            int var5 = arg0.method654(28784, arg3, var4);
            return class80.method588((byte) -89, var4, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIILic;IIILl;)V")
    public static final void method577(int arg0, int arg1, int arg2, int arg3, class59 arg4, int arg5, int arg6, int arg7, class74 arg8) {
        field1722++;
        if (class25.field603 && (class70.field1490[0][arg2][arg7] & 0x2) == 0) {
            if ((class70.field1490[arg5][arg2][arg7] & 0x10) != 0) {
                return;
            }
            if (class111.method866((byte) -22, arg5, arg2, arg7) != class23.field559) {
                return;
            }
        }
        if (class92.field2191 > arg5) {
            class92.field2191 = arg5;
        }
        int var9 = class61.field1329[arg5][arg2][arg7];
        int var10 = class61.field1329[arg5][arg2 + 1][arg7];
        int var11 = class61.field1329[arg5][arg2 + 1][arg7 + 1];
        int var12 = class61.field1329[arg5][arg2][arg7 + 1];
        class126 var13 = class114.method886(6, arg6);
        int var14 = var11 + var12 + var9 + var10 >> 2;
        int var15 = arg2 + (arg7 << 7) + (arg6 << 14) + 1073741824;
        if (var13.field2977 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        int var16 = (arg0 << 6) + arg1;
        if (var13.field2940 == 1) {
            var16 += 256;
        }
        if (var13.method943((byte) 87)) {
            class85.method616(arg2, var13, arg5, (byte) -45, arg0, arg7);
        }
        if (arg1 == 22) {
            if (!class25.field603 || var13.field2977 != 0 || var13.field2921) {
                class103 var17;
                if (var13.field2973 == -1 && var13.field2932 == null) {
                    var17 = var13.method952(arg3 - 11770, 22, arg0, var12, var9, var10, var11);
                } else {
                    var17 = new class6(arg6, 22, arg0, var9, var10, var11, var12, var13.field2973, true, null);
                }
                arg8.method532(arg5, arg2, arg7, var14, var17, var15, var16);
                if (var13.field2919 && var13.field2977 == 1 && arg4 != null) {
                    arg4.method423(arg2, -64, arg7);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class103 var37;
            if (var13.field2973 == -1 && var13.field2932 == null) {
                var37 = var13.method952(arg3 - 11770, 10, arg0, var12, var9, var10, var11);
            } else {
                var37 = new class6(arg6, 10, arg0, var9, var10, var11, var12, var13.field2973, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg0 == 1 || arg0 == 3) {
                    var39 = var13.field2971;
                    var38 = var13.field2952;
                } else {
                    var38 = var13.field2971;
                    var39 = var13.field2952;
                }
                int var40 = 0;
                if (arg1 == 11) {
                    var40 += 256;
                }
                if (arg8.method518(arg5, arg2, arg7, var14, var39, var38, var37, var40, var15, var16) && var13.field2975) {
                    int var41 = 15;
                    if (var37 instanceof class14) {
                        var41 = ((class14) var37).method112() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var39; var42++) {
                        for (int var43 = 0; var43 <= var38; var43++) {
                            if (class28.field615[arg5][arg2 + var42][arg7 + var43] < var41) {
                                class28.field615[arg5][arg2 + var42][arg7 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var13.field2919 && arg4 != null) {
                arg4.method425(false, var13.field2917, arg2, var13.field2952, arg0, arg7, var13.field2971);
            }
        } else if (arg1 >= 12) {
            class103 var18;
            if (var13.field2973 == -1 && var13.field2932 == null) {
                var18 = var13.method952(0, arg1, arg0, var12, var9, var10, var11);
            } else {
                var18 = new class6(arg6, arg1, arg0, var9, var10, var11, var12, var13.field2973, true, null);
            }
            arg8.method518(arg5, arg2, arg7, var14, 1, 1, var18, 0, var15, var16);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg5 > 0) {
                class75.field1683[arg5][arg2][arg7] = class49.method351(class75.field1683[arg5][arg2][arg7], 2340);
            }
            if (var13.field2919 && arg4 != null) {
                arg4.method425(false, var13.field2917, arg2, var13.field2952, arg0, arg7, var13.field2971);
            }
        } else if (arg3 == 11770) {
            if (arg1 == 0) {
                class103 var19;
                if (var13.field2973 == -1 && var13.field2932 == null) {
                    var19 = var13.method952(0, 0, arg0, var12, var9, var10, var11);
                } else {
                    var19 = new class6(arg6, 0, arg0, var9, var10, var11, var12, var13.field2973, true, null);
                }
                arg8.method538(arg5, arg2, arg7, var14, var19, null, class4.field79[arg0], 0, var15, var16);
                if (arg0 == 0) {
                    if (var13.field2975) {
                        class28.field615[arg5][arg2][arg7] = 50;
                        class28.field615[arg5][arg2][arg7 + 1] = 50;
                    }
                    if (var13.field2918) {
                        class75.field1683[arg5][arg2][arg7] = class49.method351(class75.field1683[arg5][arg2][arg7], 585);
                    }
                } else if (arg0 == 1) {
                    if (var13.field2975) {
                        class28.field615[arg5][arg2][arg7 + 1] = 50;
                        class28.field615[arg5][arg2 + 1][arg7 + 1] = 50;
                    }
                    if (var13.field2918) {
                        class75.field1683[arg5][arg2][arg7 + 1] = class49.method351(class75.field1683[arg5][arg2][arg7 + 1], 1170);
                    }
                } else if (arg0 == 2) {
                    if (var13.field2975) {
                        class28.field615[arg5][arg2 + 1][arg7] = 50;
                        class28.field615[arg5][arg2 + 1][arg7 + 1] = 50;
                    }
                    if (var13.field2918) {
                        class75.field1683[arg5][arg2 + 1][arg7] = class49.method351(class75.field1683[arg5][arg2 + 1][arg7], 585);
                    }
                } else if (arg0 == 3) {
                    if (var13.field2975) {
                        class28.field615[arg5][arg2][arg7] = 50;
                        class28.field615[arg5][arg2 + 1][arg7] = 50;
                    }
                    if (var13.field2918) {
                        class75.field1683[arg5][arg2][arg7] = class49.method351(class75.field1683[arg5][arg2][arg7], 1170);
                    }
                }
                if (var13.field2919 && arg4 != null) {
                    arg4.method419(arg1, arg0, arg7, var13.field2917, false, arg2);
                }
                if (var13.field2925 != 16) {
                    arg8.method530(arg5, arg2, arg7, var13.field2925);
                }
            } else if (arg1 == 1) {
                class103 var20;
                if (var13.field2973 == -1 && var13.field2932 == null) {
                    var20 = var13.method952(arg3 - 11770, 1, arg0, var12, var9, var10, var11);
                } else {
                    var20 = new class6(arg6, 1, arg0, var9, var10, var11, var12, var13.field2973, true, null);
                }
                arg8.method538(arg5, arg2, arg7, var14, var20, null, class98.field2299[arg0], 0, var15, var16);
                if (var13.field2975) {
                    if (arg0 == 0) {
                        class28.field615[arg5][arg2][arg7 + 1] = 50;
                    } else if (arg0 == 1) {
                        class28.field615[arg5][arg2 + 1][arg7 + 1] = 50;
                    } else if (arg0 == 2) {
                        class28.field615[arg5][arg2 + 1][arg7] = 50;
                    } else if (arg0 == 3) {
                        class28.field615[arg5][arg2][arg7] = 50;
                    }
                }
                if (var13.field2919 && arg4 != null) {
                    arg4.method419(arg1, arg0, arg7, var13.field2917, false, arg2);
                }
            } else if (arg1 == 2) {
                int var21 = arg0 + 1 & 0x3;
                class103 var22;
                class103 var23;
                if (var13.field2973 == -1 && var13.field2932 == null) {
                    var22 = var13.method952(0, 2, arg0 + 4, var12, var9, var10, var11);
                    var23 = var13.method952(0, 2, var21, var12, var9, var10, var11);
                } else {
                    var22 = new class6(arg6, 2, arg0 + 4, var9, var10, var11, var12, var13.field2973, true, null);
                    var23 = new class6(arg6, 2, var21, var9, var10, var11, var12, var13.field2973, true, null);
                }
                arg8.method538(arg5, arg2, arg7, var14, var22, var23, class4.field79[arg0], class4.field79[var21], var15, var16);
                if (var13.field2918) {
                    if (arg0 == 0) {
                        class75.field1683[arg5][arg2][arg7] = class49.method351(class75.field1683[arg5][arg2][arg7], 585);
                        class75.field1683[arg5][arg2][arg7 + 1] = class49.method351(class75.field1683[arg5][arg2][arg7 + 1], 1170);
                    } else if (arg0 == 1) {
                        class75.field1683[arg5][arg2][arg7 + 1] = class49.method351(class75.field1683[arg5][arg2][arg7 + 1], 1170);
                        class75.field1683[arg5][arg2 + 1][arg7] = class49.method351(class75.field1683[arg5][arg2 + 1][arg7], 585);
                    } else if (arg0 == 2) {
                        class75.field1683[arg5][arg2 + 1][arg7] = class49.method351(class75.field1683[arg5][arg2 + 1][arg7], 585);
                        class75.field1683[arg5][arg2][arg7] = class49.method351(class75.field1683[arg5][arg2][arg7], 1170);
                    } else if (arg0 == 3) {
                        class75.field1683[arg5][arg2][arg7] = class49.method351(class75.field1683[arg5][arg2][arg7], 1170);
                        class75.field1683[arg5][arg2][arg7] = class49.method351(class75.field1683[arg5][arg2][arg7], 585);
                    }
                }
                if (var13.field2919 && arg4 != null) {
                    arg4.method419(arg1, arg0, arg7, var13.field2917, false, arg2);
                }
                if (var13.field2925 != 16) {
                    arg8.method530(arg5, arg2, arg7, var13.field2925);
                }
            } else if (arg1 == 3) {
                class103 var24;
                if (var13.field2973 == -1 && var13.field2932 == null) {
                    var24 = var13.method952(0, 3, arg0, var12, var9, var10, var11);
                } else {
                    var24 = new class6(arg6, 3, arg0, var9, var10, var11, var12, var13.field2973, true, null);
                }
                arg8.method538(arg5, arg2, arg7, var14, var24, null, class98.field2299[arg0], 0, var15, var16);
                if (var13.field2975) {
                    if (arg0 == 0) {
                        class28.field615[arg5][arg2][arg7 + 1] = 50;
                    } else if (arg0 == 1) {
                        class28.field615[arg5][arg2 + 1][arg7 + 1] = 50;
                    } else if (arg0 == 2) {
                        class28.field615[arg5][arg2 + 1][arg7] = 50;
                    } else if (arg0 == 3) {
                        class28.field615[arg5][arg2][arg7] = 50;
                    }
                }
                if (var13.field2919 && arg4 != null) {
                    arg4.method419(arg1, arg0, arg7, var13.field2917, false, arg2);
                }
            } else if (arg1 == 9) {
                class103 var25;
                if (var13.field2973 == -1 && var13.field2932 == null) {
                    var25 = var13.method952(0, arg1, arg0, var12, var9, var10, var11);
                } else {
                    var25 = new class6(arg6, arg1, arg0, var9, var10, var11, var12, var13.field2973, true, null);
                }
                arg8.method518(arg5, arg2, arg7, var14, 1, 1, var25, 0, var15, var16);
                if (var13.field2919 && arg4 != null) {
                    arg4.method425(false, var13.field2917, arg2, var13.field2952, arg0, arg7, var13.field2971);
                }
            } else {
                if (var13.field2959) {
                    if (arg0 == 1) {
                        int var29 = var12;
                        var12 = var11;
                        var11 = var10;
                        var10 = var9;
                        var9 = var29;
                    } else if (arg0 == 2) {
                        int var27 = var12;
                        var12 = var10;
                        var10 = var27;
                        int var28 = var11;
                        var11 = var9;
                        var9 = var28;
                    } else if (arg0 == 3) {
                        int var26 = var12;
                        var12 = var9;
                        var9 = var10;
                        var10 = var11;
                        var11 = var26;
                    }
                }
                if (arg1 == 4) {
                    class103 var30;
                    if (var13.field2973 == -1 && var13.field2932 == null) {
                        var30 = var13.method952(0, 4, 0, var12, var9, var10, var11);
                    } else {
                        var30 = new class6(arg6, 4, 0, var9, var10, var11, var12, var13.field2973, true, null);
                    }
                    arg8.method547(arg5, arg2, arg7, var14, var30, class4.field79[arg0], arg0 * 512, 0, 0, var15, var16);
                } else if (arg1 == 5) {
                    int var31 = 16;
                    int var32 = arg8.method524(arg5, arg2, arg7);
                    if (var32 != 0) {
                        var31 = class114.method886(6, var32 >> 14 & 0x7FFF).field2925;
                    }
                    class103 var33;
                    if (var13.field2973 == -1 && var13.field2932 == null) {
                        var33 = var13.method952(arg3 - 11770, 4, 0, var12, var9, var10, var11);
                    } else {
                        var33 = new class6(arg6, 4, 0, var9, var10, var11, var12, var13.field2973, true, null);
                    }
                    arg8.method547(arg5, arg2, arg7, var14, var33, class4.field79[arg0], arg0 * 512, class42.field930[arg0] * var31, class36.field799[arg0] * var31, var15, var16);
                } else if (arg1 == 6) {
                    class103 var34;
                    if (var13.field2973 == -1 && var13.field2932 == null) {
                        var34 = var13.method952(0, 4, 0, var12, var9, var10, var11);
                    } else {
                        var34 = new class6(arg6, 4, 0, var9, var10, var11, var12, var13.field2973, true, null);
                    }
                    arg8.method547(arg5, arg2, arg7, var14, var34, 256, arg0, 0, 0, var15, var16);
                } else if (arg1 == 7) {
                    class103 var35;
                    if (var13.field2973 == -1 && var13.field2932 == null) {
                        var35 = var13.method952(0, 4, 0, var12, var9, var10, var11);
                    } else {
                        var35 = new class6(arg6, 4, 0, var9, var10, var11, var12, var13.field2973, true, null);
                    }
                    arg8.method547(arg5, arg2, arg7, var14, var35, 512, arg0, 0, 0, var15, var16);
                } else if (arg1 == 8) {
                    class103 var36;
                    if (var13.field2973 == -1 && var13.field2932 == null) {
                        var36 = var13.method952(0, 4, 0, var12, var9, var10, var11);
                    } else {
                        var36 = new class6(arg6, 4, 0, var9, var10, var11, var12, var13.field2973, true, null);
                    }
                    arg8.method547(arg5, arg2, arg7, var14, var36, 768, arg0, 0, 0, var15, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method578(int arg0) {
        field1734 = null;
        field1750 = null;
        field1737 = null;
        field1739 = null;
        field1721 = null;
        field1738 = null;
        field1740 = null;
        field1730 = null;
        field1725 = null;
        field1746 = null;
        field1745 = null;
        field1731 = null;
        if (arg0 < 88) {
            method575(null, (byte) 86);
        }
        field1749 = null;
        field1742 = null;
        field1743 = null;
        field1735 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static final void method579(byte arg0) {
        if (class69.field1446 != null) {
            class69.field1446.method434(117);
            class69.field1446 = null;
        }
        if (arg0 != 76) {
            method577(69, -26, -53, -40, null, -121, -73, -119, null);
        }
        field1724++;
        class67.method477(-121);
        class10.field220.method535();
        for (int var1 = 0; var1 < 4; var1++) {
            class131.field3046[var1].method428((byte) -65);
        }
        System.gc();
        class13.method81((byte) 32, 10);
        class114.field2711 = -1;
        class91.field2152 = 0;
        class38.method272(0);
        class33.method245(10, arg0 - 177);
    }
}
