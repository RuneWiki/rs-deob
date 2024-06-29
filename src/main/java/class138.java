import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class138 extends class139 {

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "Lud;")
    public class2 field2236;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field2231 = 0;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2233 = "flash3:";

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field2235 = 2;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "[Lth;")
    public static class113[] field2237 = new class113[4];

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "[I")
    public static int[] field2240 = new int[100];

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "Ldc;")
    public static class243 field2232;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "Lbh;")
    public static class7 field2241;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([Lth;IIZZIIII[BI)[I")
    public static final int[] method979(class113[] arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        field2239++;
        int var11 = (arg2 & 0x7) * 8;
        if (!arg3) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    int var14 = class40.method313(-117, arg10, var12 & 0x7, var13 & 0x7) + arg7;
                    int var15 = arg6 + class165.method1216(arg10, var13 & 0x7, (byte) 119, var12 & 0x7);
                    if (var14 > 0 && var14 < 103 && var15 > 0 && var15 < 103) {
                        arg0[arg8].field1633[var14][var15] = class179.method1337(arg0[arg8].field1633[var14][var15], -2097153);
                    }
                }
            }
        }
        int var16 = (arg5 & 0x7) * 8;
        byte var17;
        if (arg3) {
            var17 = 1;
        } else {
            var17 = 4;
        }
        class152 var18 = new class152(arg9);
        int var19 = arg5 & 0x1FFFFFF8 << 3;
        int var20 = arg2 & 0x1FFFFFF8 << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg10 == 1) {
            var22 = 1;
        } else if (arg10 == 2) {
            var21 = 1;
            var22 = 1;
        } else if (arg10 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < var17; var23++) {
            for (int var44 = 0; var44 < 64; var44++) {
                for (int var45 = 0; var45 < 64; var45++) {
                    if (arg1 != var23 || var44 < var11 || (var11 + 8) < var44 || var45 < var16 || var45 > var16 + 8) {
                        class45.method338(arg3, -1, 0, 0, 0, -1, 0, 0, var18, 4276, 0, false);
                    } else if (var11 + 8 == var44 || (var16 + 8) == var45) {
                        int var52;
                        int var53;
                        if (arg10 == 0) {
                            var52 = var44 + arg7 - var11;
                            var53 = arg6 - (var16 - var45);
                        } else if (arg10 == 1) {
                            var53 = var11 + arg6 + 8 - var44;
                            var52 = arg7 + var45 - var16;
                        } else if (arg10 == 2) {
                            var52 = arg7 + var11 + 8 - var44;
                            var53 = arg6 + var16 + 8 - var45;
                        } else {
                            var52 = var16 - (var45 - (arg7 + 8));
                            var53 = var44 + arg6 - var11;
                        }
                        class45.method338(arg3, var52, 0, 0, arg8, var53, var19 + var45, 0, var18, 4276, var20 + var44, true);
                    } else {
                        int var46 = class40.method313(-124, arg10, var44 & 0x7, var45 & 0x7) + arg7;
                        int var47 = arg6 + class165.method1216(arg10, var45 & 0x7, (byte) -90, var44 & 0x7);
                        class45.method338(arg3, var46, var21, arg10, arg8, var47, var19 + var45, var22, var18, 4276, var20 + var44, false);
                        if (var44 == 63 || var45 == 63) {
                            int var48 = var44 == 63 ? 64 : var44;
                            int var49 = var45 == 63 ? 64 : var45;
                            int var50;
                            int var51;
                            if (arg10 == 0) {
                                var50 = var49 + arg6 - var16;
                                var51 = arg7 - (var11 - var48);
                            } else if (arg10 == 1) {
                                var51 = arg7 + var49 - var16;
                                var50 = arg6 + var11 + 8 - var48;
                            } else if (arg10 == 2) {
                                var51 = arg7 + var11 + 8 - var48;
                                var50 = var16 + arg6 + 8 - var49;
                            } else {
                                var50 = var48 + arg6 - var11;
                                var51 = -var49 - (-var16 - (arg7 + 8));
                            }
                            if (var51 >= 0 && var51 < 104 && var50 >= 0 && var50 < 104) {
                                class220.field3533[arg8][var51][var50] = class220.field3533[arg8][var46 + var21][var47 + var22];
                            }
                        }
                    }
                }
            }
        }
        boolean var24 = false;
        while (var18.field2511 < var18.field2523.length) {
            int var26 = var18.method1111(255);
            if (var26 == 128) {
                class110.field1581[0] = var18.method1126(arg4);
                class110.field1581[1] = var18.method1090(12107);
                class110.field1581[2] = var18.method1090(12107);
                var24 = true;
                class110.field1581[3] = var18.method1090(12107);
                class110.field1581[4] = var18.method1126(false);
            } else {
                if (var26 != 129) {
                    var18.field2511--;
                    break;
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    byte var32 = var18.method1092((byte) -62);
                    if (var32 == 0) {
                        if (arg1 >= var31) {
                            int var40 = arg7;
                            if (arg7 < 0) {
                                var40 = 0;
                            } else if (arg7 >= 104) {
                                var40 = 104;
                            }
                            int var41 = arg7 + 7;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 >= 104) {
                                var41 = 104;
                            }
                            int var42 = arg6;
                            if (arg6 < 0) {
                                var42 = 0;
                            } else if (arg6 >= 104) {
                                var42 = 104;
                            }
                            int var43 = arg6 + 7;
                            if (var43 < 0) {
                                var43 = 0;
                            } else if (var43 >= 104) {
                                var43 = 104;
                            }
                            while (var40 < var41) {
                                while (var43 > var42) {
                                    class117.field1676[arg8][var40][var42] = 0;
                                    var42++;
                                }
                                var40++;
                            }
                        }
                    } else if (var32 == 1) {
                        for (int var33 = 0; var33 < 64; var33 += 4) {
                            for (int var34 = 0; var34 < 64; var34 += 4) {
                                byte var35 = var18.method1092((byte) -62);
                                if (arg1 >= var31) {
                                    for (int var36 = var33; var36 < var33 + 4; var36++) {
                                        for (int var37 = var34; var37 < (var34 + 4); var37++) {
                                            if (var36 >= var11 && var36 < (var11 + 8) && var16 <= var37 && (var16 + 8) > var16) {
                                                int var38 = class40.method313(-123, arg10, var36 & 0x7, var37 & 0x7) + arg7;
                                                int var39 = class165.method1216(arg10, var37 & 0x7, (byte) -83, var36 & 0x7) + arg6;
                                                if (var38 >= 0 && var38 < 104 && var39 >= 0 && var39 < 104) {
                                                    class117.field1676[arg8][var38][var39] = var35;
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
        if (!arg4) {
            int var27 = arg6 + 7;
            int var28 = arg7 + 7;
            for (int var29 = arg7; var29 < var28; var29++) {
                for (int var30 = arg6; var30 < var27; var30++) {
                    class117.field1676[arg8][var29][var30] = 0;
                }
            }
        }
        if (var24) {
            return class110.field1581;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
    public static void method980(int arg0) {
        field2240 = null;
        field2241 = null;
        field2232 = null;
        field2233 = null;
        field2237 = null;
        if (arg0 != -23087) {
            field2241 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILlc;Llc;)V")
    public static final void method981(int arg0, class86 arg1, class86 arg2) {
        class238.field3808 = class101.method763(2047, 0, class141.field2281, arg2, arg1);
        field2234++;
        if (arg0 == 5400) {
            class143.field2322 = (class35) class238.field3808;
            class12.field139 = class101.method763(2047, 0, class98.field1446, arg2, arg1);
            class285.field4511 = class101.method763(2047, 0, class164.field2663, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)I")
    public static final int method982(int arg0, int arg1) {
        field2238++;
        if (arg1 != -25030) {
            method982(40, 67);
        }
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V")
    public static final void method983(int arg0) {
        field2230++;
        if (class267.method1856((byte) 85) != 2) {
            return;
        }
        byte var1 = (byte) (class230.field3707 - 4 & 0xFF);
        int var2 = class230.field3707 % 104;
        if (arg0 != 18224) {
            field2231 = -109;
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class105.field1533[var3][var2][var16] = var1;
            }
        }
        if (class58.field826 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class241.field3848[var4] = -1000000;
            class220.field3530[var4] = 1000000;
            class174.field2832[var4] = 0;
            class3.field32[var4] = 1000000;
            class159.field2604[var4] = 0;
        }
        if (class176.field2853 != 1) {
            int var5 = class129.method930(class196.field3177, class50.field736, 113, class58.field826);
            if (var5 - class185.field2986 < 800 && (class86.field1277[class58.field826][class50.field736 >> 7][class196.field3177 >> 7] & 0x4) != 0) {
                class242.method1697(1, class50.field736 >> 7, -112, class196.field3177 >> 7, class220.field3525, false);
                return;
            }
            return;
        }
        if ((class86.field1277[class58.field826][class186.field2993.field1979 >> 7][class186.field2993.field1910 >> 7] & 0x4) != 0) {
            class242.method1697(0, class186.field2993.field1979 >> 7, arg0 - 18332, class186.field2993.field1910 >> 7, class220.field3525, false);
        }
        if (class67.field988 >= 310) {
            return;
        }
        int var6 = class50.field736 >> 7;
        int var7 = class196.field3177 >> 7;
        int var8 = class186.field2993.field1910 >> 7;
        int var9 = class186.field2993.field1979 >> 7;
        int var10;
        if (var7 < var8) {
            var10 = var8 - var7;
        } else {
            var10 = var7 - var8;
        }
        int var11;
        if (var9 > var6) {
            var11 = var9 - var6;
        } else {
            var11 = var6 - var9;
        }
        if (var11 == 0 && var10 == 0 || var11 <= -104 || var11 >= 104 || var10 <= -104 || var10 >= 104) {
            class191.method1422((Throwable) null, "RC: " + var6 + "," + var7 + " " + var9 + "," + var8 + " " + class282.field4487 + "," + class99.field1465, (byte) 96);
            return;
        }
        if (var11 > var10) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var6 != var9) {
                if (var9 > var6) {
                    var6++;
                } else if (var9 < var6) {
                    var6--;
                }
                if ((class86.field1277[class58.field826][var6][var7] & 0x4) != 0) {
                    class242.method1697(1, var6, -85, var7, class220.field3525, false);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var8 > var7) {
                        var7++;
                    } else if (var8 < var7) {
                        var7--;
                    }
                    if ((class86.field1277[class58.field826][var6][var7] & 0x4) != 0) {
                        class242.method1697(1, var6, -122, var7, class220.field3525, false);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = 32768;
        int var15 = var11 * 65536 / var10;
        while (var7 != var8) {
            if (var7 < var8) {
                var7++;
            } else if (var8 < var7) {
                var7--;
            }
            if ((class86.field1277[class58.field826][var6][var7] & 0x4) != 0) {
                class242.method1697(1, var6, arg0 ^ 0xFFFFB8BD, var7, class220.field3525, false);
                return;
            }
            var14 += var15;
            if (var14 >= 65536) {
                if (var9 > var6) {
                    var6++;
                } else if (var9 < var6) {
                    var6--;
                }
                var14 -= 65536;
                if ((class86.field1277[class58.field826][var6][var7] & 0x4) != 0) {
                    class242.method1697(1, var6, -120, var7, class220.field3525, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lud;)V")
    public class138(class2 arg0) {
        this.field2236 = arg0;
    }
}
