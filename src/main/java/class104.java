import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class104 implements class198 {

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "Z")
    private boolean field1955 = false;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    private int field1974 = 50;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "Lnc;")
    private class83 field1967;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Lnc;")
    private class83 field1951;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "Lnb;")
    private class199 field1959;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "[Z")
    private boolean[] field1971;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "[S")
    private short[] field1954;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "[B")
    private byte[] field1957;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "[B")
    private byte[] field1942;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "[B")
    private byte[] field1950;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "[Z")
    private boolean[] field1944;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "[Z")
    private boolean[] field1966;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "[Z")
    private boolean[] field1941;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "[B")
    private byte[] field1953;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "[Z")
    private boolean[] field1975;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "Lhj;")
    public static class69 field1963 = class181.method1318("sl_arrows", (byte) -112);

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "[[B")
    public static byte[][] field1968 = new byte[50][];

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Z")
    public static boolean field1973 = false;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "Lhj;")
    private static class69 field1960 = class181.method1318(" ", (byte) -111);

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field1947 = -1;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lhj;")
    public static class69 field1939 = field1960;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lta;")
    public static class241 field1952 = new class241(64);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZZIZI)Lnc;")
    public static final class83 method770(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field1964++;
        class105 var5 = null;
        if (class10.field87 != null) {
            var5 = new class105(arg2, class10.field87, class192.field3483[arg2], 1000000);
        }
        class230.field4208[arg2] = class138.field2586.method1466(var5, arg2, (byte) -112, class246.field4504);
        int var6 = 23 / ((arg4 + 85) / 39);
        if (arg1) {
            class230.field4208[arg2].method1402(25021);
        }
        return new class83(class230.field4208[arg2], arg3, arg0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Z")
    public final boolean method771(int arg0, int arg1) {
        if (arg1 <= 16) {
            this.field1944 = null;
        }
        class139 var3 = this.method789(arg0, 6378);
        field1956++;
        return var3 == null ? false : var3.method1071(this, 4, this.field1967);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)I")
    public final int method772(byte arg0, int arg1) {
        if (arg0 == 2) {
            field1946++;
            return this.field1954[arg1] & 0xFFFF;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1940++;
        int var11 = arg10 - arg4;
        int var12 = arg8 - arg1;
        boolean var13;
        if (class118.field2243 > 0 && class118.field2243 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg7;
        int var15 = 983040 / arg5;
        if (arg2 != 626061808) {
            return;
        }
        for (int var16 = -var15; var16 < var12 + var15; var16++) {
            int var18 = arg3 + (arg5 * var16) >> 16;
            int var19 = (var16 + 1) * arg5 + arg3 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg6 + var19;
                int var22 = arg6 + var18;
                int var23 = arg1 + var16 >> 6;
                if (var23 >= 0 && (class17.field226.length - 1) >= var23) {
                    int[][] var24 = class17.field226[var23];
                    for (int var25 = -var14; var25 < (var11 + var14); var25++) {
                        int var26 = arg7 * var25 + arg0 >> 16;
                        int var27 = (var25 + 1) * arg7 + arg0 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            int var29 = arg9 + var26;
                            var10000 = arg9 + var27;
                            int var31 = arg4 + var25 >> 6;
                            if (var31 >= 0 && (var24.length - 1) >= var31 && var24[var31] != null) {
                                int var32 = (arg4 + var25 & 0x3F << 6) + (arg1 + var16 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class12 var34 = class145.method1102(var33 - 1, arg2 ^ 0x2550F1F0);
                                    if (var13 && class208.field3796 == var34.field154) {
                                        class268 var35 = new class268();
                                        var35.field4765 = var29;
                                        var35.field4776 = var34.field154;
                                        var35.field4761 = var22;
                                        class266.field4732.method1727(-98, var35);
                                    }
                                    class208.field3792[var34.field154].method341(var22 - 7, var29 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class268 var17 = (class268) class266.field4732.method1724(255); var17 != null; var17 = (class268) class266.field4732.method1726(104)) {
            class208.field3792[var17.field4776].method341(var17.field4761 - 7, var17.field4765 + -7);
            class15.method90(var17.field4761, var17.field4765, 15, 16776960, 128);
            class15.method90(var17.field4761, var17.field4765, 7, 16777215, 256);
        }
        class266.field4732.method1732(108);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method774(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class163.field3021++;
        class199.field3597 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class182.field3318; var12 < class66.field1275; var12++) {
            class217[][] var38 = class158.field2935[var12];
            for (int var39 = class217.field3926; var39 < class105.field1984; var39++) {
                for (int var40 = class268.field4772; var40 < class182.field3322; var40++) {
                    class217 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class186.field3348[var39 + class53.field950 - class78.field1496][var40 + class53.field950 - class45.field646] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3943 = true;
                            var41.field3928 = true;
                            if (var41.field3940 > 0) {
                                var41.field3945 = true;
                            } else {
                                var41.field3945 = false;
                            }
                            class199.field3597++;
                        } else {
                            var41.field3943 = false;
                            var41.field3928 = false;
                            var41.field3937 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field3932 != null) {
                                    class118 var42 = var41.field3932;
                                    var42.field2235.method693(var42.field2239, var42.field2229, var42.field2229, var42.field2239, 128);
                                    if (var42.field2227 != null) {
                                        var42.field2227.method693(var42.field2239, var42.field2229, var42.field2229, var42.field2239, 128);
                                    }
                                }
                                if (var41.field3946 != null) {
                                    class212 var43 = var41.field3946;
                                    var43.field3857.method693(var43.field3856, var43.field3864, var43.field3864, var43.field3856, 128);
                                    if (var43.field3866 != null) {
                                        var43.field3866.method693(var43.field3856, var43.field3864, var43.field3864, var43.field3856, 128);
                                    }
                                }
                                if (var41.field3949 != null) {
                                    class68 var44 = var41.field3949;
                                    var44.field1288.method693(var44.field1294, var44.field1290, var44.field1290, var44.field1294, 128);
                                }
                                if (var41.field3933 != null) {
                                    for (int var45 = 0; var45 < var41.field3940; var45++) {
                                        class85 var46 = var41.field3933[var45];
                                        var46.field1660.method693(var46.field1651, var46.field1653, var46.field1655, var46.field1662, 128);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class271.field4793 == class263.field4673;
        for (int var14 = class182.field3318; var14 < class66.field1275; var14++) {
            class217[][] var27 = class158.field2935[var14];
            for (int var28 = -class53.field950; var28 <= 0; var28++) {
                int var29 = class78.field1496 + var28;
                int var30 = class78.field1496 - var28;
                if (var29 >= class217.field3926 || var30 < class105.field1984) {
                    for (int var31 = -class53.field950; var31 <= 0; var31++) {
                        int var32 = class45.field646 + var31;
                        int var33 = class45.field646 - var31;
                        if (var29 >= class217.field3926) {
                            if (var32 >= class268.field4772) {
                                class217 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3943) {
                                    class246.method1738(var34, true);
                                }
                            }
                            if (var33 < class182.field3322) {
                                class217 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3943) {
                                    class246.method1738(var35, true);
                                }
                            }
                        }
                        if (var30 < class105.field1984) {
                            if (var32 >= class268.field4772) {
                                class217 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3943) {
                                    class246.method1738(var36, true);
                                }
                            }
                            if (var33 < class182.field3322) {
                                class217 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3943) {
                                    class246.method1738(var37, true);
                                }
                            }
                        }
                        if (class199.field3597 == 0) {
                            if (!var13) {
                                class196.field3566 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class182.field3318; var15 < class66.field1275; var15++) {
            class217[][] var16 = class158.field2935[var15];
            for (int var17 = -class53.field950; var17 <= 0; var17++) {
                int var18 = class78.field1496 + var17;
                int var19 = class78.field1496 - var17;
                if (var18 >= class217.field3926 || var19 < class105.field1984) {
                    for (int var20 = -class53.field950; var20 <= 0; var20++) {
                        int var21 = class45.field646 + var20;
                        int var22 = class45.field646 - var20;
                        if (var18 >= class217.field3926) {
                            if (var21 >= class268.field4772) {
                                class217 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3943) {
                                    class246.method1738(var23, false);
                                }
                            }
                            if (var22 < class182.field3322) {
                                class217 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3943) {
                                    class246.method1738(var24, false);
                                }
                            }
                        }
                        if (var19 < class105.field1984) {
                            if (var21 >= class268.field4772) {
                                class217 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3943) {
                                    class246.method1738(var25, false);
                                }
                            }
                            if (var22 < class182.field3322) {
                                class217 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3943) {
                                    class246.method1738(var26, false);
                                }
                            }
                        }
                        if (class199.field3597 == 0) {
                            if (!var13) {
                                class196.field3566 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class196.field3566 = false;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V")
    public static final void method775(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1948++;
        if (arg4 > arg1) {
            class99.method740(arg0, class186.field3402[arg2], -1162793114, arg4, arg1);
        } else {
            class99.method740(arg0, class186.field3402[arg2], arg3 ^ 0xBAB16E80, arg1, arg4);
        }
        if (arg3 != 16870) {
            method778((byte) -94);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZB)V")
    public static final void method776(boolean arg0, byte arg1) {
        if (arg1 != 34) {
            field1960 = null;
        }
        byte[][] var2 = class40.field568;
        field1965++;
        int var3 = class230.field4204.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class245.field4486[var4] >> 8) * 64 - class242.field4441;
                int var7 = (class245.field4486[var4] & 0xFF) * 64 - class220.field3962;
                class17.method105(-125);
                class240.method1699(var5, -17230, var7, class79.field1518, var6, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IFB)[I")
    public final int[] method777(int arg0, float arg1, byte arg2) {
        field1972++;
        if (arg2 != 116) {
            field1939 = null;
        }
        class139 var4 = this.method789(arg0, 6378);
        if (var4 == null) {
            return null;
        } else {
            var4.field2598 = true;
            return var4.method1069(arg1, this.field1967, this, true, this.field1955 || this.field1941[arg0]);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method778(byte arg0) {
        field1968 = null;
        int var1 = -91 / ((74 - arg0) / 32);
        field1952 = null;
        field1939 = null;
        field1963 = null;
        field1960 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljd;)V")
    public static final void method779(class85 arg0) {
        for (int var1 = arg0.field1662; var1 <= arg0.field1651; var1++) {
            for (int var2 = arg0.field1653; var2 <= arg0.field1655; var2++) {
                class217 var3 = class158.field2935[arg0.field1652][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3940; var4++) {
                        if (var3.field3933[var4] == arg0) {
                            var3.field3940--;
                            for (int var5 = var4; var5 < var3.field3940; var5++) {
                                var3.field3933[var5] = var3.field3933[var5 + 1];
                                var3.field3941[var5] = var3.field3941[var5 + 1];
                            }
                            var3.field3933[var3.field3940] = null;
                            break;
                        }
                    }
                    var3.field3948 = 0;
                    for (int var6 = 0; var6 < var3.field3940; var6++) {
                        var3.field3948 |= var3.field3941[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(II)V")
    public final void method780(int arg0, int arg1) {
        for (class139 var3 = (class139) this.field1959.method1452((byte) 106); var3 != null; var3 = (class139) this.field1959.method1446(true)) {
            if (var3.field2598) {
                var3.method1068(arg1, -15037);
                var3.field2598 = false;
            }
        }
        if (arg0 >= -9) {
            this.method787(true, -43);
        }
        field1938++;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)Z")
    public final boolean method781(int arg0, int arg1) {
        field1945++;
        if (arg0 == 896171494) {
            return this.field1955 || this.field1941[arg1];
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
    public static final void method782(byte arg0) {
        for (int var1 = -1; var1 < class98.field1856; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class38.field525[var1];
            }
            class108 var3 = class35.field491[var2];
            if (var3 != null) {
                class26.method150((byte) -121, var3.method813(15963), var3);
            }
        }
        field1949++;
        if (arg0 <= 124) {
            field1963 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
    public final void method783(byte arg0) {
        this.field1959.method1451(false);
        int var2 = -41 / ((arg0 + 58) / 45);
        field1962++;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)[I")
    public final int[] method784(int arg0, int arg1) {
        class139 var3 = this.method789(arg1, 6378);
        field1937++;
        int var4 = 78 % ((-arg0 - 52) / 55);
        return var3 == null ? null : var3.method1074(128, this, this.field1955 || this.field1941[arg1], this.field1967);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIBIII)V")
    public static final void method785(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1961++;
        if (arg0 == arg1) {
            class85.method627(arg3, arg1, arg4, -34, arg5);
            return;
        }
        if ((arg3 - arg1) >= class201.field3629 && class35.field485 >= arg1 + arg3 && (arg4 - arg0) >= class19.field252 && arg0 + arg4 <= class166.field3075) {
            class76.method549(arg3, arg1, arg4, arg5, (byte) 11, arg0);
        } else {
            class166.method1226(arg1, arg4, 126, arg3, arg5, arg0);
        }
        if (arg2 < 73) {
            field1960 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)Z")
    public final boolean method786(int arg0, byte arg1) {
        field1958++;
        int var3 = -74 / ((arg1 - 58) / 35);
        return this.field1975[arg0];
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)Z")
    public final boolean method787(boolean arg0, int arg1) {
        field1970++;
        if (!arg0) {
            method785(-60, -99, (byte) 15, 41, -49, 93);
        }
        return this.field1944[arg1];
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)V")
    public final void method788(int arg0, boolean arg1) {
        this.field1955 = arg1;
        this.method783((byte) -126);
        if (arg0 != 5930) {
            method776(true, (byte) -90);
        }
        field1969++;
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(II)Loe;")
    private final class139 method789(int arg0, int arg1) {
        field1943++;
        class139 var3 = (class139) this.field1959.method1448((long) arg0, (byte) -40);
        if (arg1 != 6378) {
            this.field1941 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1951.method590(0, arg0, 0);
        if (var4 == null) {
            return null;
        } else {
            class128 var5 = new class128(var4);
            class139 var6 = new class139(var5);
            this.field1959.method1453(0, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lnc;Lnc;Lnc;IZ)V")
    public class104(class83 arg0, class83 arg1, class83 arg2, int arg3, boolean arg4) {
        this.field1955 = arg4;
        this.field1967 = arg2;
        this.field1974 = arg3;
        this.field1951 = arg0;
        this.field1959 = new class199(this.field1974);
        class128 var6 = new class128(arg1.method590(0, 0, 0));
        int var7 = var6.method912(54);
        this.field1971 = new boolean[var7];
        this.field1954 = new short[var7];
        this.field1957 = new byte[var7];
        this.field1942 = new byte[var7];
        this.field1950 = new byte[var7];
        this.field1944 = new boolean[var7];
        this.field1966 = new boolean[var7];
        this.field1941 = new boolean[var7];
        this.field1953 = new byte[var7];
        this.field1975 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1971[var8] = var6.method937(false) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1971[var9]) {
                this.field1975[var9] = var6.method937(false) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1971[var10]) {
                this.field1944[var10] = var6.method937(false) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1971[var11]) {
                this.field1941[var11] = var6.method937(false) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1971[var12]) {
                this.field1966[var12] = var6.method937(false) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1971[var13]) {
                this.field1942[var13] = var6.method950(1495791448);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1971[var14]) {
                this.field1957[var14] = var6.method950(1495791448);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1971[var15]) {
                this.field1950[var15] = var6.method950(1495791448);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1971[var16]) {
                this.field1953[var16] = var6.method950(1495791448);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1971[var17]) {
                this.field1954[var17] = (short) var6.method912(117);
            }
        }
    }
}
