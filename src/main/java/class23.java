import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class23 {

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "[B")
    private byte[] field606;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "[I")
    private int[] field608;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "[I")
    private int[] field611;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lpd;")
    private static class94 field596 = class28.method249(80, "Accept trade");

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Lpd;")
    public static class94 field601 = field596;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field605 = 0;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "[I")
    public static int[] field604 = new int[4000];

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lpd;")
    public static class94 field598 = class28.method249(-53, "Name eingeben:");

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field594 = 0;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "Lpd;")
    public static class94 field610 = class28.method249(114, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "[I")
    public static int[] field612 = new int[50];

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "[Luc;")
    public static class122[] field613 = new class122[2048];

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Ls;")
    public static class111 field597;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "[[[B")
    public static byte[][][] field599;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[BI[BI)I", line = 15)
    public final int method164(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field592++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg0 + arg3;
        int var8 = 0;
        if (arg1 != 1) {
            field597 = null;
        }
        int var9 = arg5;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field611[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field611[var8]) < 0) {
                arg2[arg0++] = (byte) ~var11;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field611[var8];
            }
            int var12;
            if ((var12 = this.field611[var8]) < 0) {
                arg2[arg0++] = (byte) ~var12;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field611[var8];
            }
            int var13;
            if ((var13 = this.field611[var8]) < 0) {
                arg2[arg0++] = (byte) ~var13;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field611[var8];
            }
            int var14;
            if ((var14 = this.field611[var8]) < 0) {
                arg2[arg0++] = (byte) ~var14;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field611[var8];
            }
            int var15;
            if ((var15 = this.field611[var8]) < 0) {
                arg2[arg0++] = (byte) ~var15;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field611[var8];
            }
            int var16;
            if ((var16 = this.field611[var8]) < 0) {
                arg2[arg0++] = (byte) ~var16;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field611[var8];
            }
            int var17;
            if ((var17 = this.field611[var8]) < 0) {
                arg2[arg0++] = (byte) ~var17;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field611[var8];
            }
            int var18;
            if ((var18 = this.field611[var8]) < 0) {
                arg2[arg0++] = (byte) ~var18;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)I", line = 164)
    public static final int method165(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 / arg3;
        field603++;
        int var5 = arg1 / arg3;
        int var6 = arg0 & arg3 - arg2;
        int var7 = class66.method500(var4, 1, var5);
        int var8 = arg3 - 1 & arg1;
        int var9 = class66.method500(var4 + 1, arg2, var5);
        int var10 = class66.method500(var4, arg2, var5 + 1);
        int var11 = class66.method500(var4 + 1, 1, var5 + 1);
        int var12 = class107.method783(var9, var6, 65536, arg3, var7);
        int var13 = class107.method783(var11, var6, 65536, arg3, var10);
        return class107.method783(var13, var8, arg2 + 65535, arg3, var12);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII[Lme;IIIIIII)V", line = 194)
    public static final void method166(int arg0, int arg1, int arg2, int arg3, class77[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field591++;
        if (arg0 < arg10 || arg2 > arg5 || arg7 <= arg0 || arg11 <= arg5) {
            return;
        }
        int var12 = 0;
        if (arg3 > -115) {
            method167(87);
        }
        while (var12 < arg4.length) {
            class77 var13 = arg4[var12];
            if (var13 != null && var13.field1920 == arg1 && (!var13.field1895 || !var13.field1897 || class39.field1014)) {
                label437: {
                    int var14 = var13.field1878 + arg10 - arg8;
                    int var15 = arg2 + var13.field1961 - arg9;
                    if (var13.field1917 == 8 && var14 <= arg0 && var15 <= arg5 && var14 + var13.field1964 > arg0 && var13.field1967 + var15 > arg5) {
                        class102.field2591 = var12;
                    }
                    if ((var13.field1909 >= 0 || var13.field1916 != 0) && arg0 >= var14 && var15 <= arg5 && arg0 < var14 + var13.field1964 && arg5 < var13.field1967 + var15) {
                        if (var13.field1909 >= 0) {
                            class81.field2081 = var13.field1909;
                        } else {
                            class81.field2081 = var12;
                        }
                    }
                    if (var13.field1917 == 0) {
                        if (var13.field1897 && !class80.method597(arg6, -4, var12) && !class39.field1014) {
                            break label437;
                        }
                        method166(arg0, var13.field1928, var15, -125, arg4, arg5, arg6, var14 + var13.field1964, var13.field1873, var13.field1915, var14, var13.field1967 + var15);
                        if (var13.field1918 != null) {
                            method166(arg0, var13.field1928, var15, -126, var13.field1918, arg5, arg6, var13.field1964 + var14, var13.field1873, var13.field1915, var14, var15 + var13.field1967);
                        }
                        if (var13.field1866 > var13.field1967) {
                            class128.method1008(arg0, arg6, var13.field1866, var13.field1967, var13, 113, var15, arg5, var14 + var13.field1964);
                        }
                        if (!var13.field1895) {
                            break label437;
                        }
                    }
                    if (var13.field1894 == 1 && arg0 >= var14 && arg5 >= var15 && var13.field1964 + var14 > arg0 && arg5 < var13.field1967 + var15) {
                        boolean var16 = false;
                        if (var13.field1896 != 0) {
                            var16 = class50.method393((byte) -52, var13);
                        }
                        if (!var16) {
                            class33.field910++;
                            class97.method738(var13.field1928, 0, class8.field230, var13.field1906, 0, 58, -30801);
                        }
                    }
                    if (var13.field1894 == 2 && class31.field882 == 0 && arg0 >= var14 && arg5 >= var15 && var13.field1964 + var14 > arg0 && var13.field1967 + var15 > arg5) {
                        class97.method738(var13.field1928, 0, class4.method20(new class94[] { class7.field133, var13.field1874 }, true), var13.field1861, 0, 4, -30801);
                        class127.field3184++;
                    }
                    if (var13.field1894 == 3 && arg0 >= var14 && arg5 >= var15 && arg0 < var13.field1964 + var14 && arg5 < var13.field1967 + var15) {
                        class54.field1380++;
                        byte var17;
                        if (arg6 == 3) {
                            var17 = 31;
                        } else {
                            var17 = 36;
                        }
                        class97.method738(var13.field1928, 0, class8.field230, class37.field973, 0, var17, -30801);
                    }
                    if (var13.field1894 == 4 && var14 <= arg0 && arg5 >= var15 && arg0 < var13.field1964 + var14 && arg5 < var13.field1967 + var15) {
                        class123.field3112++;
                        class97.method738(var13.field1928, 0, class8.field230, var13.field1906, 0, 16, -30801);
                    }
                    if (var13.field1894 == 5 && arg0 >= var14 && var15 <= arg5 && arg0 < var14 + var13.field1964 && arg5 < var13.field1967 + var15) {
                        class122.field3046++;
                        class97.method738(var13.field1928, 0, class8.field230, var13.field1906, 0, 2, -30801);
                    }
                    if (var13.field1894 == 6 && class111.field2809 == -1 && arg0 >= var14 && var15 <= arg5 && arg0 < var13.field1964 + var14 && arg5 < var15 + var13.field1967) {
                        class97.method738(var13.field1928, 0, class8.field230, var13.field1906, 0, 51, -30801);
                        class122.field3099++;
                    }
                    if (var13.field1917 == 2) {
                        int var18 = 0;
                        for (int var19 = 0; var19 < var13.field1967; var19++) {
                            for (int var20 = 0; var20 < var13.field1964; var20++) {
                                int var21 = (var13.field1968 + 32) * var19 + var15;
                                int var22 = (var13.field1903 + 32) * var20 + var14;
                                if (var18 < 20) {
                                    var22 += var13.field1979[var18];
                                    var21 += var13.field1933[var18];
                                }
                                if (arg0 >= var22 && var21 <= arg5 && var22 + 32 > arg0 && var21 + 32 > arg5) {
                                    class111.field2802 = var13.field1928;
                                    class50.field1249 = var18;
                                    if (var13.field1869[var18] > 0) {
                                        class110 var23 = class39.method295(var13.field1869[var18] - 1, 1);
                                        if (class126.field3178 == 1 && var13.field1914) {
                                            if (class17.field422 != var13.field1928 || class107.field2669 != var18) {
                                                class97.method738(var13.field1928, var18, class4.method20(new class94[] { class113.field2848, class14.field364, var23.field2713 }, true), class99.field2492, var23.field2736, 3, -30801);
                                                class13.field316++;
                                            }
                                        } else if (class31.field882 != 1 || !var13.field1914) {
                                            class128.field3223++;
                                            class94[] var24 = var23.field2745;
                                            if (class4.field99) {
                                                var24 = class70.method511(var24, 5);
                                            }
                                            if (var13.field1914) {
                                                for (int var25 = 4; var25 >= 3; var25--) {
                                                    if (var24 != null && var24[var25] != null) {
                                                        class121.field3036++;
                                                        byte var26;
                                                        if (var25 == 3) {
                                                            var26 = 35;
                                                        } else {
                                                            var26 = 43;
                                                        }
                                                        class97.method738(var13.field1928, var18, class4.method20(new class94[] { class51.field1275, var23.field2713 }, true), var24[var25], var23.field2736, var26, -30801);
                                                    } else if (var25 == 4) {
                                                        class97.method738(var13.field1928, var18, class4.method20(new class94[] { class51.field1275, var23.field2713 }, true), class7.field148, var23.field2736, 43, -30801);
                                                        class20.field551++;
                                                    }
                                                }
                                            }
                                            if (var13.field1890) {
                                                class64.field1567++;
                                                class97.method738(var13.field1928, var18, class4.method20(new class94[] { class51.field1275, var23.field2713 }, true), class99.field2492, var23.field2736, 41, -30801);
                                            }
                                            if (var13.field1914 && var24 != null) {
                                                for (int var27 = 2; var27 >= 0; var27--) {
                                                    if (var24[var27] != null) {
                                                        class69.field1668++;
                                                        byte var28 = 0;
                                                        if (var27 == 0) {
                                                            var28 = 26;
                                                        }
                                                        if (var27 == 1) {
                                                            var28 = 27;
                                                        }
                                                        if (var27 == 2) {
                                                            var28 = 8;
                                                        }
                                                        class97.method738(var13.field1928, var18, class4.method20(new class94[] { class51.field1275, var23.field2713 }, true), var24[var27], var23.field2736, var28, -30801);
                                                    }
                                                }
                                            }
                                            class94[] var29 = var13.field1932;
                                            if (class4.field99) {
                                                var29 = class70.method511(var29, 5);
                                            }
                                            if (var29 != null) {
                                                for (int var30 = 4; var30 >= 0; var30--) {
                                                    if (var29[var30] != null) {
                                                        class79.field2030++;
                                                        byte var31 = 0;
                                                        if (var30 == 0) {
                                                            var31 = 24;
                                                        }
                                                        if (var30 == 1) {
                                                            var31 = 15;
                                                        }
                                                        if (var30 == 2) {
                                                            var31 = 40;
                                                        }
                                                        if (var30 == 3) {
                                                            var31 = 11;
                                                        }
                                                        if (var30 == 4) {
                                                            var31 = 34;
                                                        }
                                                        class97.method738(var13.field1928, var18, class4.method20(new class94[] { class51.field1275, var23.field2713 }, true), var29[var30], var23.field2736, var31, -30801);
                                                    }
                                                }
                                            }
                                            class97.method738(var13.field1928, var18, class4.method20(new class94[] { class51.field1275, var23.field2713 }, true), class70.field1701, var23.field2736, 1006, -30801);
                                        } else if ((class67.field1647 & 0x10) == 16) {
                                            class97.method738(var13.field1928, var18, class4.method20(new class94[] { class66.field1632, class14.field364, var23.field2713 }, true), class19.field526, var23.field2736, 47, -30801);
                                            class133.field3249++;
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                    if (var13.field1974 && class31.field882 == 1 && (class67.field1647 & 0x20) == 32) {
                        if (var14 <= arg0 && var15 <= arg5 && arg0 < var13.field1964 + var14 && var15 + var13.field1967 > arg5) {
                            if (var13.field1928 >= 0) {
                                class97.method738(var13.field1928, -1, class4.method20(new class94[] { class66.field1632, class40.field1019, var13.field1872 }, true), class19.field526, 0, 20, -30801);
                            } else {
                                class97.method738(var13.field1920, var13.field1928 & 0x7FFF, class4.method20(new class94[] { class66.field1632, class40.field1019, var13.field1872 }, true), class19.field526, 0, 20, -30801);
                            }
                            class74.field1812++;
                        }
                    } else if (var13.field1885 && var13.field1867 != null && class31.field882 == 0 && arg0 >= var14 && var15 <= arg5 && arg0 < var13.field1964 + var14 && arg5 < var13.field1967 + var15) {
                        for (int var32 = var13.field1867.length - 1; var32 >= 0; var32--) {
                            if (var13.field1867[var32] != null) {
                                class4.field88++;
                                if (var13.field1928 < 0) {
                                    class97.method738(var13.field1920, var13.field1928 & 0x7FFF, var13.field1872, var13.field1867[var32], var32 + 1, 13, -30801);
                                } else {
                                    class97.method738(var13.field1928, -1, var13.field1872, var13.field1867[var32], var32 + 1, 13, -30801);
                                }
                            }
                        }
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 583)
    public static void method167(int arg0) {
        field599 = null;
        field597 = null;
        if (arg0 != 0) {
            method169((byte) -84, null, 49, -98, 104, 5, -23, -92);
        }
        field596 = null;
        field601 = null;
        field613 = null;
        field604 = null;
        field610 = null;
        field612 = null;
        field598 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Ldb;", line = 610)
    public static final class20 method168(int arg0, int arg1) {
        class20 var2 = (class20) class97.field2466.method1007((long) arg0, (byte) -117);
        field602++;
        if (arg1 != 14187) {
            method166(83, -26, 26, -109, null, -101, 7, -119, 40, -93, -126, 54);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class13.field317.method808((byte) -126, arg0, 0);
        if (var3 == null) {
            return null;
        }
        class20 var4 = new class20();
        class122 var5 = new class122(var3);
        var5.field3047 = var5.field3074.length - 12;
        int var6 = var5.method952(false);
        int var7 = 0;
        var4.field538 = var5.method938((byte) 18);
        var4.field530 = var5.method938((byte) -124);
        var4.field542 = var5.method938((byte) 51);
        var4.field552 = var5.method938((byte) -116);
        var4.field558 = new int[var6];
        var4.field545 = new class94[var6];
        var5.field3047 = 0;
        var4.field540 = new int[var6];
        while (var5.field3074.length - 12 > var5.field3047) {
            int var8 = var5.method938((byte) 30);
            if (var8 == 3) {
                var4.field545[var7] = var5.method937(1);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field540[var7] = var5.method943(arg1 - 15212);
            } else {
                var4.field540[var7] = var5.method952(false);
            }
            var4.field558[var7++] = var8;
        }
        class97.field2466.method1012(arg1 - 14137, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLuc;IIIIII)V", line = 667)
    public static final void method169(byte arg0, class122 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field595++;
        if (arg0 > -126) {
            field597 = null;
        }
        if (arg5 < 0 || arg5 >= 104 || arg6 < 0 || arg6 >= 104) {
            while (true) {
                int var10 = arg1.method943(-1025);
                if (var10 == 0) {
                    return;
                }
                if (var10 == 1) {
                    arg1.method943(-1025);
                    return;
                }
                if (var10 <= 49) {
                    arg1.method943(-1025);
                }
            }
        }
        class108.field2679[arg4][arg5][arg6] = 0;
        while (true) {
            int var8 = arg1.method943(-1025);
            if (var8 == 0) {
                if (arg4 == 0) {
                    class41.field1049[0][arg5][arg6] = -class36.method283(arg5 + arg7 + 932731, true, arg6 + arg2 + 556238) * 8;
                    return;
                } else {
                    class41.field1049[arg4][arg5][arg6] = class41.field1049[arg4 - 1][arg5][arg6] - 240;
                    return;
                }
            }
            if (var8 == 1) {
                int var9 = arg1.method943(-1025);
                if (var9 == 1) {
                    var9 = 0;
                }
                if (arg4 != 0) {
                    class41.field1049[arg4][arg5][arg6] = class41.field1049[arg4 - 1][arg5][arg6] - var9 * 8;
                    return;
                }
                class41.field1049[0][arg5][arg6] = -var9 * 8;
                return;
            }
            if (var8 <= 49) {
                class99.field2511[arg4][arg5][arg6] = arg1.method934((byte) -108);
                field599[arg4][arg5][arg6] = (byte) ((var8 - 2) / 4);
                class121.field3018[arg4][arg5][arg6] = (byte) class81.method605(3, var8 + arg3 - 2);
            } else if (var8 <= 81) {
                class108.field2679[arg4][arg5][arg6] = (byte) (var8 - 49);
            } else {
                class127.field3206[arg4][arg5][arg6] = (byte) (var8 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[B[BII)I", line = 756)
    public final int method170(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = arg1 + arg4;
        int var8 = arg0 << 3;
        int var9 = 0;
        field609++;
        if (arg5 != 1) {
            return -78;
        }
        while (arg4 < var7) {
            int var10 = arg3[arg4] & 0xFF;
            int var11 = this.field608[var10];
            byte var12 = this.field606[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var9 & -var14 >> 31;
            var8 += var12;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var9 = class100.method756(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var9 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var9 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var9 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var8 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([B)V", line = 863)
    public class23(byte[] arg0) {
        int var2 = arg0.length;
        this.field606 = arg0;
        this.field608 = new int[var2];
        this.field611 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = var3[var6];
                this.field608[var5] = var7;
                int var8 = 0x1 << 32 - var6;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var7 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class100.method756(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var7) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var7) == 0) {
                        var14++;
                    } else {
                        if (this.field611[var14] == 0) {
                            this.field611[var14] = var4;
                        }
                        var14 = this.field611[var14];
                    }
                    if (this.field611.length <= var14) {
                        int[] var17 = new int[this.field611.length * 2];
                        for (int var18 = 0; var18 < this.field611.length; var18++) {
                            var17[var18] = this.field611[var18];
                        }
                        this.field611 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field611[var14] = ~var5;
            }
        }
    }
}
