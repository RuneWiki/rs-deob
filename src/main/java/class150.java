import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class150 extends class209 {

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field2228 = 3;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "Lnf;")
    public static class162 field2219 = new class162(32);

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "Lpf;")
    private class305 field2223;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "Lub;")
    public static class92 field2231;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILha;)V")
    private final void method1084(int arg0, int arg1, class31 arg2) {
        field2227++;
        if (arg1 != 9100) {
            method1085((byte) -41);
        }
        if (arg0 != 249) {
            return;
        }
        int var4 = arg2.method265(-89);
        if (this.field2223 == null) {
            int var5 = class126.method945(var4, true);
            this.field2223 = new class305(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method265(-128) == 1;
            int var8 = arg2.method304((byte) 84);
            class134 var9;
            if (var7) {
                var9 = new class63(arg2.method262(11386));
            } else {
                var9 = new class283(arg2.method300((byte) -30));
            }
            this.field2223.method2046(var9, -108, (long) var8);
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V")
    public static final void method1085(byte arg0) {
        class197.method1402(1, 5);
        field2221++;
        class186.method1324(false, 5);
        class220.method1510(5, -23670);
        if (arg0 >= -46) {
            field2219 = null;
        }
        class220.method1508(5, true);
        class293.method1941(5, 255);
        class214.method1480(5, -94);
        class149.method1078(5, (byte) 63);
        class229.method1581(5, (byte) -40);
        class92.method712(false, 5);
        class128.method954(false, 5);
        class79.method619(5, (byte) 62);
        class95.method745(5, (byte) 81);
        class178.method1262(1, 5);
        class102.method779(0, 5);
        class222.method1525(5, 5054);
        class23.method198((byte) 80, 5);
        class264.method1775(5, (byte) 37);
        class229.method1577(50, (byte) 103);
        class236.method1618(101, 5);
        class156.method1127(5, (byte) -55);
        class192.field3009.method1166((byte) 23, 5);
        class213.field3271.method1166((byte) 23, 5);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2220++;
        int var11 = arg1 - arg10;
        if (class152.field2247 > arg1) {
            var11++;
        }
        int var12 = arg2 - arg3;
        if (class92.field1475 > arg2) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var41 = arg5 * var13 + arg7 >> 16;
            int var42 = (var13 + 1) * arg5 + arg7 >> 16;
            int var43 = var42 - var41;
            if (var43 > 0) {
                int var44 = arg10 + var13 >> 6;
                if (var44 >= 0 && (class127.field1905.length - 1) >= var44) {
                    int[][] var45 = class127.field1905[var44];
                    int var46 = arg4 + var42;
                    int var47 = arg4 + var41;
                    byte[][] var48 = class45.field764[var44];
                    byte[][] var49 = class116.field1773[var44];
                    byte[][] var50 = class197.field3076[var44];
                    byte[][] var51 = class276.field4396[var44];
                    byte[][] var52 = class300.field4820[var44];
                    for (int var53 = 0; var53 < var12; var53++) {
                        int var54 = arg6 * var53 + arg0 >> 16;
                        int var55 = (var53 + 1) * arg6 + arg0 >> 16;
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = arg8 + var55;
                            int var58 = arg8 + var54;
                            int var59 = arg3 + var53 >> 6;
                            int var60 = arg3 + var53 & 0x3F;
                            int var61 = var13 + arg10 & 0x3F;
                            int var62 = (var60 << 6) + var61;
                            int var63;
                            if (var59 < 0 || (var45.length - 1) < var59 || var45[var59] == null) {
                                if (class92.field1467.field4881 != -1) {
                                    var63 = class92.field1467.field4881;
                                } else if ((arg3 + var53 & 0x4) == (arg10 + var13 & 0x4)) {
                                    var63 = class86.field1277[class189.field2970 + 1];
                                } else {
                                    var63 = 4936552;
                                }
                                if (var59 < 0 || (var45.length - 1) < var59) {
                                    if (var63 == 0) {
                                        var63 = 1;
                                    }
                                    class66.method532(var47, var58, var43, var56, var63);
                                    continue;
                                }
                            } else {
                                var63 = var45[var59][var62];
                            }
                            int var64 = var50[var59] == null ? 0 : class86.field1277[var50[var59][var62] & 0xFF];
                            int var65 = var48[var59] == null ? 0 : class86.field1277[var48[var59][var62] & 0xFF];
                            if (var63 == 0) {
                                var63 = 1;
                            }
                            if (var65 == 0 && var64 == 0) {
                                class66.method532(var47, var58, var43, var56, var63);
                            } else {
                                if (var65 != 0) {
                                    if (var65 == -1) {
                                        var65 = 1;
                                    }
                                    byte var66 = var49[var59] == null ? 0 : var49[var59][var62];
                                    int var67 = var66 & 0xFC;
                                    if (var67 == 0 || var43 <= 1 || var56 <= 1) {
                                        class66.method532(var47, var58, var43, var56, var65);
                                    } else {
                                        class64.method510(var63, var47, var58, var67 >> 2, var65, -863571583, var56, true, var66 & 0x3, class66.field1032, var43);
                                    }
                                }
                                if (var64 != 0) {
                                    byte var68 = var52[var59][var62];
                                    if (var64 == -1) {
                                        var64 = var63;
                                    }
                                    int var69 = var68 & 0xFC;
                                    if (var69 == 0 || var43 <= 1 || var56 <= 1) {
                                        class66.method532(var47, var58, var43, var56, var64);
                                    }
                                    class64.method510(0, var47, var58, var69 >> 2, var64, -863571583, var56, var65 == 0, var68 & 0x3, class66.field1032, var43);
                                }
                            }
                            if (var51[var59] != null) {
                                int var70 = var51[var59][var62] & 0xFF;
                                if (var70 != 0) {
                                    int var71;
                                    if (var43 == 1) {
                                        var71 = var47;
                                    } else {
                                        var71 = var46 - 1;
                                    }
                                    int var72 = 13421772;
                                    if (var70 >= 5 && var70 <= 8 || var70 >= 13 && var70 <= 16 || var70 >= 21 && var70 <= 24 || var70 == 27 || var70 == 28) {
                                        var72 = 13369344;
                                        var70 -= 4;
                                    }
                                    int var73;
                                    if (var56 == 1) {
                                        var73 = var58;
                                    } else {
                                        var73 = var57 - 1;
                                    }
                                    if (var70 == 1) {
                                        class66.method516(var47, var58, var56, var72);
                                    } else if (var70 == 2) {
                                        class66.method525(var47, var58, var43, var72);
                                    } else if (var70 == 3) {
                                        class66.method516(var71, var58, var56, var72);
                                    } else if (var70 == 4) {
                                        class66.method525(var47, var73, var43, var72);
                                    } else if (var70 == 9) {
                                        class66.method516(var47, var58, var56, 16777215);
                                        class66.method525(var47, var58, var43, var72);
                                    } else if (var70 == 10) {
                                        class66.method516(var71, var58, var56, 16777215);
                                        class66.method525(var47, var58, var43, var72);
                                    } else if (var70 == 11) {
                                        class66.method516(var71, var58, var56, 16777215);
                                        class66.method525(var47, var73, var43, var72);
                                    } else if (var70 == 12) {
                                        class66.method516(var47, var58, var56, 16777215);
                                        class66.method525(var47, var73, var43, var72);
                                    } else if (var70 == 17) {
                                        class66.method525(var47, var58, 1, var72);
                                    } else if (var70 == 18) {
                                        class66.method525(var71, var58, 1, var72);
                                    } else if (var70 == 19) {
                                        class66.method525(var71, var73, 1, var72);
                                    } else if (var70 == 20) {
                                        class66.method525(var47, var73, 1, var72);
                                    } else if (var70 == 25) {
                                        for (int var74 = 0; var74 < var56; var74++) {
                                            class66.method525(var47 + var74, var73 - var74, 1, var72);
                                        }
                                    } else if (var70 == 26) {
                                        for (int var75 = 0; var75 < var56; var75++) {
                                            class66.method525(var47 + var75, var58 + var75, 1, var72);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var76 = arg4 + var41;
                    for (int var77 = 0; var77 < var12; var77++) {
                        int var79;
                        if (class92.field1467.field4881 != -1) {
                            var79 = class92.field1467.field4881;
                        } else if ((var77 + arg3 & 0x4) == (arg10 + var13 & 0x4)) {
                            var79 = class86.field1277[class189.field2970 + 1];
                        } else {
                            var79 = 4936552;
                        }
                        int var80 = (arg6 * var77 + arg0 >> 16) + arg8;
                        if (var79 == 0) {
                            var79 = 1;
                        }
                        int var81 = ((var77 + 1) * arg6 + arg0 >> 16) + arg8;
                        int var82 = var81 - var80;
                        class66.method532(var76, var80, var43, var82, var79);
                    }
                    var10000 = arg4 + var42;
                }
            }
        }
        for (int var14 = -2; var14 < (var11 + 2); var14++) {
            int var15 = arg5 * var14 + arg7 >> 16;
            int var16 = arg7 + ((var14 + 1) * arg5) >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg4 + var15;
                var10000 = arg4 + var16;
                int var20 = var14 + arg10 >> 6;
                if (var20 >= 0 && class36.field622.length - 1 >= var20) {
                    int[][] var21 = class36.field622[var20];
                    for (int var22 = -2; var22 < var12 + 2; var22++) {
                        int var23 = (var22 + 1) * arg6 + arg0 >> 16;
                        int var24 = arg6 * var22 + arg0 >> 16;
                        int var25 = var23 - var24;
                        if (var25 > 0) {
                            var10000 = arg8 + var23;
                            int var27 = arg8 + var24;
                            int var28 = arg3 + var22 >> 6;
                            if (var28 >= 0 && var28 <= (var21.length - 1)) {
                                int var29 = (arg3 + var22 & 0x3F << 6) + (arg10 + var14 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29];
                                    int var31 = var30 & 0x1FFF;
                                    if (var31 != 0) {
                                        class35 var32 = class237.method1623(1, var31 - 1);
                                        int var33 = var30 >> 13 & 0x3;
                                        boolean var34 = (var30 >> 15 & 0x1) == 1;
                                        class13 var35 = var32.method333(true, var34, var33);
                                        if (var35 != null) {
                                            int var36 = var35.field157 * var17 / 4;
                                            int var37 = var35.field154 * var25 / 4;
                                            if (var32.field601) {
                                                int var38 = (var30 & 0xFD0B2) >> 16;
                                                int var39 = (var30 & 0xF25719) >> 20;
                                                if ((var33 & 0x1) == 1) {
                                                    int var40 = var38;
                                                    var38 = var39;
                                                    var39 = var40;
                                                }
                                                var37 = var25 * var39;
                                                var36 = var17 * var38;
                                            }
                                            if (var36 != 0 && var37 != 0) {
                                                if (var32.field607 == 0) {
                                                    var35.method110(var18, var27 + var25 - var37, var36, var37);
                                                } else {
                                                    var35.method109(var18, var27 + var25 - var37, var36, var37, var32.field607);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg9 < 35) {
            field2230 = 3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZ)I")
    public final int method1087(int arg0, int arg1, boolean arg2) {
        field2222++;
        if (this.field2223 == null) {
            return arg1;
        }
        class283 var4 = (class283) this.field2223.method2043((long) arg0, -1);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg2) {
                this.method1084(-13, -40, (class31) null);
            }
            return var4.field4457;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)Z")
    public static final boolean method1088(int arg0, int arg1, int arg2) {
        int var3 = class257.field4098[arg0][arg1][arg2];
        if (-class244.field3891 == var3) {
            return false;
        } else if (class244.field3891 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class58.method483(var4 + 1, class233.field3684[arg0][arg1][arg2], var5 + 1) && class58.method483(var4 + 128 - 1, class233.field3684[arg0][arg1 + 1][arg2], var5 + 1) && class58.method483(var4 + 128 - 1, class233.field3684[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class58.method483(var4 + 1, class233.field3684[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class257.field4098[arg0][arg1][arg2] = class244.field3891;
                return true;
            } else {
                class257.field4098[arg0][arg1][arg2] = -class244.field3891;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public static void method1089(int arg0) {
        field2219 = null;
        field2231 = null;
        if (arg0 != 0) {
            method1089(-25);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lha;I)V")
    public final void method1090(class31 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method265(-122);
            if (var3 == 0) {
                int var4 = -109 % ((arg1 - 41) / 54);
                field2226++;
                return;
            }
            this.method1084(var3, 9100, arg0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLjava/lang/String;I)Ljava/lang/String;")
    public final String method1091(boolean arg0, String arg1, int arg2) {
        field2229++;
        if (this.field2223 == null) {
            return arg1;
        }
        if (!arg0) {
            this.method1084(-48, -69, (class31) null);
        }
        class63 var4 = (class63) this.field2223.method2043((long) arg2, -1);
        return var4 == null ? arg1 : var4.field993;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)I")
    public static final int method1092(int arg0, int arg1, int arg2) {
        field2224++;
        if (arg2 != -1610637441) {
            method1092(121, -76, -68);
        }
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg0 - var3;
    }
}
