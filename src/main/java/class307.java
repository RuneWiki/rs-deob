import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class307 {

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public int field4902 = -1;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Z")
    public boolean field4903 = false;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public int field4898 = 5;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public int field4909 = -1;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public int field4893 = 2;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public int field4901 = -1;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Z")
    public boolean field4910 = false;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "Z")
    public boolean field4919 = false;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public int field4904 = 99;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public int field4921 = -1;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public int field4918 = -1;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "Z")
    public boolean field4915 = false;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
    public static int[] field4896 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field4916 = -1;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public int field4905;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "Ldk;")
    public static class251 field4920;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[I")
    public int[] field4891;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
    private int[] field4892;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
    public int[] field4895;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "[Z")
    public boolean[] field4894;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "[[I")
    public int[][] field4899;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
    public static final void method2048(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -11232) {
            method2056(107, -75);
        }
        field4897++;
        int var5 = 0;
        int var6 = -arg3;
        int var7 = arg3;
        int var8 = class123.method866(class82.field1374, arg1 + arg3, (byte) -113, class259.field4188);
        int var9 = -1;
        int var10 = class123.method866(class82.field1374, arg1 - arg3, (byte) 64, class259.field4188);
        class73.method494(arg4, class204.field3253[arg2], 4028, var8, var10);
        while (var5 < var7) {
            var9 += 2;
            var6 += var9;
            if (var6 > 0) {
                var7--;
                var6 -= var7 << 1;
                int var11 = arg2 - var7;
                int var12 = arg2 + var7;
                if (var12 >= class85.field1409 && class234.field3774 >= var11) {
                    int var13 = class123.method866(class82.field1374, arg1 + var5, (byte) 98, class259.field4188);
                    int var14 = class123.method866(class82.field1374, arg1 - var5, (byte) 120, class259.field4188);
                    if (class234.field3774 >= var12) {
                        class73.method494(arg4, class204.field3253[var12], 4028, var13, var14);
                    }
                    if (var11 >= class85.field1409) {
                        class73.method494(arg4, class204.field3253[var11], 4028, var13, var14);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (class85.field1409 <= var16 && var15 <= class234.field3774) {
                int var17 = class123.method866(class82.field1374, arg1 + var7, (byte) 97, class259.field4188);
                int var18 = class123.method866(class82.field1374, arg1 - var7, (byte) -127, class259.field4188);
                if (class234.field3774 >= var16) {
                    class73.method494(arg4, class204.field3253[var16], 4028, var17, var18);
                }
                if (var15 >= class85.field1409) {
                    class73.method494(arg4, class204.field3253[var15], 4028, var17, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lk;IIZI)Lk;")
    public final class37 method2049(class37 arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4917++;
        int var6 = this.field4891[arg1];
        int var7 = this.field4895[arg1];
        class304 var8 = class312.method2084(var7 >> 16, 0);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg0.method175(true, true, true);
        }
        class304 var10 = null;
        if ((this.field4903 || class174.field2846) && arg4 != -1 && this.field4895.length > arg4) {
            int var11 = this.field4895[arg4];
            var10 = class312.method2084(var11 >> 16, 0);
            arg4 = var11 & 0xFFFF;
        }
        class304 var12 = null;
        if (arg3) {
            method2056(78, -82);
        }
        class304 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field4892 != null) {
            if (arg1 < this.field4892.length) {
                var14 = this.field4892[arg1];
                if (var14 != 65535) {
                    var12 = class312.method2084(var14 >> 16, 0);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field4903 || class174.field2846) && arg4 != -1 && this.field4892.length > arg4) {
                var15 = this.field4892[arg4];
                if (var15 != 65535) {
                    var13 = class312.method2084(var15 >> 16, 0);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method2035(var9, 123);
        boolean var17 = !var8.method2034(-106, var9);
        if (var12 != null) {
            var16 &= !var12.method2035(var14, 79);
            var17 &= !var12.method2034(-124, var14);
        }
        if (var10 != null) {
            var16 &= !var10.method2035(arg4, 91);
            var17 &= !var10.method2034(-120, arg4);
        }
        if (var13 != null) {
            var16 &= !var13.method2035(var15, 127);
            var17 &= !var13.method2034(-106, var15);
        }
        class37 var18 = arg0.method175(var16, var17, !this.field4919);
        var18.method230(var8, var9, var10, arg4, arg2 - 1, var6, this.field4919);
        if (var12 != null) {
            var18.method230(var12, var14, var13, var15, arg2 - 1, var6, this.field4919);
        }
        return var18;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public final void method2050(int arg0) {
        if (this.field4909 == -1) {
            if (this.field4894 == null) {
                this.field4909 = 0;
            } else {
                this.field4909 = 2;
            }
        }
        if (arg0 != 663) {
            this.field4904 = 15;
        }
        field4907++;
        if (this.field4902 != -1) {
            return;
        }
        if (this.field4894 == null) {
            this.field4902 = 0;
        } else {
            this.field4902 = 2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4900++;
        if (class46.field778 == 0) {
            int var7 = class123.field1960;
            int var8 = class251.field4001;
            int var9 = class46.field773;
            int var10 = class183.field3010;
            int var11 = (arg5 - arg1) * (var9 - var7) / arg2 + var7;
            int var12 = (var10 - var8) * (arg3 - arg6) / arg4 + var8;
            if (class139.field2211 && (class258.field4168 & 0x40) != 0) {
                class211 var13 = class32.method217(class78.field1310, class251.field3997, 120);
                if (var13 == null) {
                    class131.method923((byte) -27);
                } else {
                    class266.method1789(" ->", var11, var12, class19.field230, 0L, class143.field2268, -25, (short) 11);
                }
            } else {
                if (class299.field4792 == 1) {
                    class266.method1789("", var11, var12, class314.field5007, 0L, -1, 123, (short) 7);
                }
                class266.method1789("", var11, var12, class72.field1215, 0L, -1, -97, (short) 50);
                class258.field4170++;
            }
        }
        long var14 = -1L;
        int var16 = -33 / ((arg0 + 6) / 63);
        for (int var17 = 0; var17 < class71.field1206; var17++) {
            long var18 = class13.field143[var17];
            int var20 = (int) var18 >> 7 & 0x7F;
            int var21 = ((int) var18 & 0x692F1C05) >> 29;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            int var23 = (int) var18 & 0x7F;
            if (var14 != var18) {
                var14 = var18;
                if (var21 == 2 && class15.method73(class56.field941, var23, var20, var18)) {
                    class158 var24 = class5.method29(var22, true);
                    if (var24.field2448 != null) {
                        var24 = var24.method1077(-6291);
                    }
                    if (var24 == null) {
                        continue;
                    }
                    if (class46.field778 == 1) {
                        class51.field861++;
                        class266.method1789(class14.field159 + " -> <col=00ffff>" + var24.field2482, var23, var20, class100.field1625, var18, class161.field2557, -3, (short) 48);
                    } else if (class139.field2211) {
                        class60 var29 = class46.field767 == -1 ? null : class186.method1335(class46.field767, 18773);
                        if ((class258.field4168 & 0x4) != 0 && (var29 == null || var24.method1083(class46.field767, var29.field974, (byte) 121) != var29.field974)) {
                            class227.field3662++;
                            class266.method1789(class203.field3235 + " -> <col=00ffff>" + var24.field2482, var23, var20, class19.field230, var18, class143.field2268, -55, (short) 45);
                        }
                    } else {
                        class141.field2238++;
                        String[] var25 = var24.field2455;
                        if (class117.field1896) {
                            var25 = class236.method1600(15502, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class174.field2853++;
                                    int var27 = -1;
                                    if (var24.field2450 == var26) {
                                        var27 = var24.field2456;
                                    }
                                    if (var24.field2526 == var26) {
                                        var27 = var24.field2444;
                                    }
                                    short var28 = 0;
                                    if (var26 == 0) {
                                        var28 = 38;
                                    }
                                    if (var26 == 1) {
                                        var28 = 5;
                                    }
                                    if (var26 == 2) {
                                        var28 = 59;
                                    }
                                    if (var26 == 3) {
                                        var28 = 41;
                                    }
                                    if (var26 == 4) {
                                        var28 = 1004;
                                    }
                                    class266.method1789("<col=00ffff>" + var24.field2482, var23, var20, var25[var26], var18, var27, -72, var28);
                                }
                            }
                        }
                        class266.method1789("<col=00ffff>" + var24.field2482, var23, var20, class67.field1113, (long) var24.field2474, class155.field2421, -28, (short) 1007);
                    }
                }
                if (var21 == 1) {
                    class131 var30 = class12.field127[var22];
                    if ((var30.field2056.field4048 & 0x1) == 0 && (var30.field637 & 0x7F) == 0 && (var30.field710 & 0x7F) == 0 || (var30.field2056.field4048 & 0x1) == 1 && (var30.field637 & 0x7F) == 64 && (var30.field710 & 0x7F) == 64) {
                        int var31 = var30.field637 - (var30.field2056.field4048 << 6);
                        int var32 = var30.field2056.field4048 << 7;
                        int var33 = var30.field710 - (var30.field2056.field4048 << 6);
                        if (class67.field1111) {
                            for (int var34 = 0; var34 < class246.field3912; var34++) {
                                class131 var40 = class12.field127[class184.field3020[var34]];
                                if (var40 != null && !var40.field711 && var30 != var40 && var40.field713) {
                                    int var41 = var40.field637 - (var40.field2056.field4048 << 6);
                                    int var42 = var40.field710 - (var40.field2056.field4048 << 6);
                                    int var43 = var40.field2056.field4048 << 7;
                                    if (class1.method6(var41, var32, var33, var32, var42, var31, var43, var43, 14938)) {
                                        class263.method1767(class184.field3020[var34], 16841, var20, var23, var40.field2056);
                                        var40.field711 = true;
                                    }
                                }
                            }
                            for (int var35 = 0; var35 < class13.field145; var35++) {
                                class299 var36 = class270.field4355[class259.field4176[var35]];
                                if (var36 != null && !var36.field711 && var36.field713) {
                                    int var37 = var36.field637 - (var36.method279(23397) << 6);
                                    int var38 = var36.field710 - (var36.method279(23397) << 6);
                                    int var39 = var36.method279(23397) << 7;
                                    if (class1.method6(var37, var32, var33, var32, var38, var31, var39, var39, 14938)) {
                                        class149.method1035(7920, var20, var36, class259.field4176[var35], var23);
                                        var36.field711 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var30.field711) {
                        continue;
                    }
                    class263.method1767(var22, 16841, var20, var23, var30.field2056);
                    var30.field711 = true;
                }
                if (var21 == 0) {
                    class299 var44 = class270.field4355[var22];
                    if ((var44.field637 & 0x7F) == 64 && (var44.field710 & 0x7F) == 64) {
                        int var45 = var44.field637 - (var44.method279(23397) << 6);
                        int var46 = var44.field710 - (var44.method279(23397) << 6);
                        int var47 = var44.method279(23397) << 7;
                        if (class67.field1111) {
                            for (int var48 = 0; var48 < class246.field3912; var48++) {
                                class131 var54 = class12.field127[class184.field3020[var48]];
                                if (var54 != null && !var54.field711 && var54.field713) {
                                    int var55 = var54.field637 - (var54.field2056.field4048 << 6);
                                    int var56 = var54.field2056.field4048 << 7;
                                    int var57 = var54.field710 - (var54.field2056.field4048 << 6);
                                    if (class1.method6(var55, var47, var46, var47, var57, var45, var56, var56, 14938)) {
                                        class263.method1767(class184.field3020[var48], 16841, var20, var23, var54.field2056);
                                        var54.field711 = true;
                                    }
                                }
                            }
                            for (int var49 = 0; var49 < class13.field145; var49++) {
                                class299 var50 = class270.field4355[class259.field4176[var49]];
                                if (var50 != null && !var50.field711 && var44 != var50 && var50.field713) {
                                    int var51 = var50.field637 - (var50.method279(23397) << 6);
                                    int var52 = var50.field710 - (var50.method279(23397) << 6);
                                    int var53 = var50.method279(23397) << 7;
                                    if (class1.method6(var51, var47, var46, var47, var52, var45, var53, var53, 14938)) {
                                        class149.method1035(7920, var20, var50, class259.field4176[var49], var23);
                                        var50.field711 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var44.field711) {
                        continue;
                    }
                    class149.method1035(7920, var20, var44, var22, var23);
                    var44.field711 = true;
                }
                if (var21 == 3) {
                    class246 var58 = class192.field3113[class56.field941][var23][var20];
                    if (var58 != null) {
                        for (class294 var59 = (class294) var58.method1640((byte) -34); var59 != null; var59 = (class294) var58.method1647(1939253256)) {
                            int var60 = var59.field4707.field2530;
                            class115 var61 = class81.method562(var60, -20358);
                            if (class46.field778 == 1) {
                                class266.method1789(class14.field159 + " -> <col=ff9040>" + var61.field1799, var23, var20, class100.field1625, (long) var60, class161.field2557, 119, (short) 8);
                                class53.field890++;
                            } else if (class139.field2211) {
                                class60 var66 = class46.field767 == -1 ? null : class186.method1335(class46.field767, 18773);
                                if ((class258.field4168 & 0x1) != 0 && (var66 == null || var61.method805(class46.field767, 0, var66.field974) != var66.field974)) {
                                    class266.method1789(class203.field3235 + " -> <col=ff9040>" + var61.field1799, var23, var20, class19.field230, (long) var60, class143.field2268, 122, (short) 4);
                                    class75.field1252++;
                                }
                            } else {
                                String[] var62 = var61.field1832;
                                class49.field818++;
                                if (class117.field1896) {
                                    var62 = class236.method1600(15502, var62);
                                }
                                for (int var63 = 4; var63 >= 0; var63--) {
                                    if (var62 != null && var62[var63] != null) {
                                        class165.field2662++;
                                        byte var64 = 0;
                                        int var65 = -1;
                                        if (var63 == 0) {
                                            var64 = 1;
                                        }
                                        if (var63 == 1) {
                                            var64 = 46;
                                        }
                                        if (var61.field1796 == var63) {
                                            var65 = var61.field1807;
                                        }
                                        if (var61.field1797 == var63) {
                                            var65 = var61.field1809;
                                        }
                                        if (var63 == 2) {
                                            var64 = 31;
                                        }
                                        if (var63 == 3) {
                                            var64 = 17;
                                        }
                                        if (var63 == 4) {
                                            var64 = 60;
                                        }
                                        class266.method1789("<col=ff9040>" + var61.field1799, var23, var20, var62[var63], (long) var60, var65, 116, var64);
                                    }
                                }
                                class266.method1789("<col=ff9040>" + var61.field1799, var23, var20, class67.field1113, (long) var60, class155.field2421, -107, (short) 1003);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLwd;)V")
    public final void method2052(byte arg0, class162 arg1) {
        if (arg0 >= -77) {
            this.field4921 = -17;
        }
        while (true) {
            int var3 = arg1.method1133((byte) 53);
            if (var3 == 0) {
                field4908++;
                return;
            }
            this.method2058(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method2053(byte arg0, String arg1) {
        int var2 = arg1.length();
        field4906++;
        long var3 = 0L;
        if (arg0 < 43) {
            method2057(-86);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lk;IIIIB)Lk;")
    public final class37 method2054(class37 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = -87 / ((34 - arg5) / 61);
        int var8 = this.field4891[arg2];
        int var9 = this.field4895[arg2];
        field4911++;
        class304 var10 = class312.method2084(var9 >> 16, 0);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            return arg0.method198(true, true, true);
        }
        int var12 = arg3 & 0x3;
        class304 var13 = null;
        if ((this.field4903 || class174.field2846) && arg1 != -1 && this.field4895.length > arg1) {
            int var14 = this.field4895[arg1];
            var13 = class312.method2084(var14 >> 16, 0);
            arg1 = var14 & 0xFFFF;
        }
        class37 var15;
        if (var13 == null) {
            var15 = arg0.method198(!var10.method2035(var11, 77), !var10.method2034(-105, var11), !this.field4919);
        } else {
            var15 = arg0.method198(!var10.method2035(var11, 86) & !var13.method2035(arg1, 117), !var10.method2034(-109, var11) & !var13.method2034(-109, arg1), !this.field4919);
        }
        if (var12 == 1) {
            var15.method188();
        } else if (var12 == 2) {
            var15.method189();
        } else if (var12 == 3) {
            var15.method196();
        }
        var15.method230(var10, var11, var13, arg1, arg4 - 1, var8, this.field4919);
        if (var12 == 1) {
            var15.method196();
        } else if (var12 == 2) {
            var15.method189();
        } else if (var12 == 3) {
            var15.method188();
        }
        return var15;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIILk;I)Lk;")
    public final class37 method2055(int arg0, int arg1, int arg2, class37 arg3, int arg4) {
        field4913++;
        int var6 = this.field4891[arg4];
        int var7 = this.field4895[arg4];
        if (arg2 > -38) {
            method2057(72);
        }
        class304 var8 = class312.method2084(var7 >> 16, 0);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method177(true, true, true);
        }
        class304 var10 = null;
        if ((this.field4903 || class174.field2846) && arg0 != -1 && this.field4895.length > arg0) {
            int var11 = this.field4895[arg0];
            var10 = class312.method2084(var11 >> 16, 0);
            arg0 = var11 & 0xFFFF;
        }
        class37 var12;
        if (var10 == null) {
            var12 = arg3.method177(!var8.method2035(var9, 82), !var8.method2034(-110, var9), !this.field4919);
        } else {
            var12 = arg3.method177(!var8.method2035(var9, 81) & !var10.method2035(arg0, 76), !var8.method2034(-110, var9) & !var10.method2034(-119, arg0), !this.field4919);
        }
        var12.method230(var8, var9, var10, arg0, arg1 - 1, var6, this.field4919);
        return var12;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public static final void method2056(int arg0, int arg1) {
        class204.field3248.method1262(arg0, 2736);
        field4890++;
        class94.field1522.method1262(arg0, arg1 ^ 0xABD);
        if (arg1 != 13) {
            method2051(-52, -108, 78, -109, -5, -104, -29);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static void method2057(int arg0) {
        field4920 = null;
        int var1 = -26 / ((arg0 - 81) / 41);
        field4896 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lwd;ZI)V")
    private final void method2058(class162 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method2057(14);
        }
        if (arg2 == 1) {
            int var13 = arg0.method1142(-18970);
            this.field4891 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4891[var14] = arg0.method1142(-18970);
            }
            this.field4895 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field4895[var15] = arg0.method1142(-18970);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field4895[var16] += arg0.method1142(-18970) << 16;
            }
        } else if (arg2 == 2) {
            this.field4921 = arg0.method1142(-18970);
        } else if (arg2 == 3) {
            this.field4894 = new boolean[256];
            int var4 = arg0.method1133((byte) 53);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4894[arg0.method1133((byte) 53)] = true;
            }
        } else if (arg2 == 4) {
            this.field4910 = true;
        } else if (arg2 == 5) {
            this.field4898 = arg0.method1133((byte) 53);
        } else if (arg2 == 6) {
            this.field4918 = arg0.method1142(-18970);
        } else if (arg2 == 7) {
            this.field4901 = arg0.method1142(-18970);
        } else if (arg2 == 8) {
            this.field4904 = arg0.method1133((byte) 53);
        } else if (arg2 == 9) {
            this.field4902 = arg0.method1133((byte) 53);
        } else if (arg2 == 10) {
            this.field4909 = arg0.method1133((byte) 53);
        } else if (arg2 == 11) {
            this.field4893 = arg0.method1133((byte) 53);
        } else if (arg2 == 12) {
            int var6 = arg0.method1133((byte) 53);
            this.field4892 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4892[var7] = arg0.method1142(-18970);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field4892[var8] = (arg0.method1142(-18970) << 16) + this.field4892[var8];
            }
        } else if (arg2 == 13) {
            int var9 = arg0.method1142(-18970);
            this.field4899 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg0.method1133((byte) 53);
                if (var11 > 0) {
                    this.field4899[var10] = new int[var11];
                    this.field4899[var10][0] = arg0.method1137(31155);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field4899[var10][var12] = arg0.method1142(-18970);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field4919 = true;
        } else if (arg2 == 15) {
            this.field4903 = true;
        } else if (arg2 == 16) {
            this.field4915 = true;
        }
        field4914++;
    }
}
