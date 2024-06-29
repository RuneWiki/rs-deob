import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class135 extends class313 {

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field2358 = 100;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field2353 = 0;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "[Lqe;")
    public static class205[] field2359 = new class205[2048];

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "Ljo;")
    public static class98 field2357 = new class98();

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "Lnc;")
    public static class160 field2362;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V", line = 11)
    public static void method1110(byte arg0) {
        field2359 = null;
        field2362 = null;
        if (arg0 != -9) {
            method1114(34, -81, -117, (class200[]) null, 97, 36, 39, true, (byte[]) null, 22, 74);
        }
        field2357 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBIII)I", line = 26)
    public static final int method1111(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 35 % ((-arg1 - 43) / 40);
        field2361++;
        int var6 = arg2 & 0xF;
        int var7 = var6 >= 4 ? (var6 == 12 || var6 == 14 ? arg4 : arg0) : arg3;
        int var8 = var6 < 8 ? arg4 : arg3;
        return ((var6 & 0x2) == 0 ? var7 : -var7) + ((var6 & 0x1) == 0 ? var8 : -var8);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILpi;)V", line = 41)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field2356++;
        if (arg1 != -17848) {
            method1110((byte) 36);
        }
        if (arg0 == 0) {
            this.field4968 = arg2.method2364(-9069) == 1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)I", line = 55)
    public static final int method1112(int arg0) {
        if (arg0 == 4314) {
            field2355++;
            return class57.field882.method468(0);
        } else {
            return -4;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)[I", line = 71)
    public final int[] method111(int arg0, int arg1) {
        field2360++;
        if (arg0 != 4) {
            field2358 = 93;
        }
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int[] var4 = this.method2156(0, true, arg1);
            for (int var5 = 0; var5 < class133.field2269; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)[[I", line = 105)
    public final int[][] method299(int arg0, int arg1) {
        field2363++;
        if (arg1 != 2) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4958.method2404(arg0, (byte) 118);
        if (this.field4958.field5463) {
            int[][] var4 = this.method2161(0, arg1 + 2, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class133.field2269; var11++) {
                var7[var11] = 4096 - var6[var11];
                var9[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var8[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIZILve;ZZI)Lwb;", line = 152)
    public static final class171 method1113(int arg0, int arg1, int arg2, boolean arg3, int arg4, class293 arg5, boolean arg6, boolean arg7, int arg8) {
        class134 var9 = class5.method31(-1731690365, arg0);
        if (arg8 > 1 && var9.field2336 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg8 >= var9.field2340[var11] && var9.field2340[var11] != 0) {
                    var10 = var9.field2336[var11];
                }
            }
            if (var10 != -1) {
                var9 = class5.method31(-1731690365, var10);
            }
        }
        field2354++;
        class103 var12 = var9.method1109(arg5, 115);
        if (var12 == null) {
            return null;
        }
        class309 var13 = null;
        if (var9.field2290 != -1) {
            var13 = (class309) method1113(var9.field2334, 0, 1, true, -1, arg5, false, true, 10);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2308 != -1) {
            var13 = (class309) method1113(var9.field2351, arg1, arg2, true, -1, arg5, false, false, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class47.field725;
        int var15 = class47.field721;
        int var16 = class47.field729;
        int[] var17 = new int[4];
        class47.method410(var17);
        class309 var18 = new class309(36, 32);
        class47.method407(var18.field4907, 36, 32);
        class62.method575();
        class62.method576(16, 16);
        class62.field958 = false;
        int var19 = var9.field2294;
        if (arg7) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class62.field962[var9.field2287] * var19 >> 16;
        int var21 = class62.field961[var9.field2287] * var19 >> 16;
        var12.method88(0, var9.field2326, var9.field2299, var9.field2287, var9.field2321, var20 + var9.field2307 - var12.method95() / 2, var21 - -var9.field2307, (long) arg4);
        if (arg2 >= 1) {
            var18.method2146(1);
            if (arg2 >= 2) {
                var18.method2146(16777215);
            }
            class47.method407(var18.field4907, 36, 32);
        }
        if (arg1 != 0) {
            var18.method2143(arg1);
        }
        if (var9.field2290 != -1) {
            var13.method1248(0, 0);
        } else if (var9.field2308 != -1) {
            class47.method407(var13.field4907, 36, 32);
            var18.method1248(0, 0);
            var18 = var13;
        }
        if (arg6 && (var9.field2338 == 1 || arg8 != 1) && arg8 != -1) {
            class139.field2557.method2240(class261.method1803(1000000, arg8), 0, 9, 16776960, 1);
        }
        class47.method407(var14, var16, var15);
        class47.method406(var17);
        class62.method575();
        class62.field958 = true;
        return class43.field680 && !arg3 ? new class157(var18) : var18;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[Lao;IIIZ[BII)[I", line = 282)
    public static final int[] method1114(int arg0, int arg1, int arg2, class200[] arg3, int arg4, int arg5, int arg6, boolean arg7, byte[] arg8, int arg9, int arg10) {
        field2352++;
        int var11 = (arg9 & 0x7) * 8;
        byte var12;
        if (arg7) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        int var13 = (arg4 & 0x7) * 8;
        if (arg5 != -18982) {
            field2362 = (class160) null;
        }
        if (!arg7) {
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg0 + class324.method2249(arg2, var15 & 0x7, var14 & 0x7, (byte) 3);
                    int var17 = class243.method1700(88, arg2, var14 & 0x7, var15 & 0x7) + arg10;
                    if (var16 > 0 && var16 < 103 && var17 > 0 && var17 < 103) {
                        arg3[arg1].field3418[var16][var17] = class36.method319(arg3[arg1].field3418[var16][var17], -2097153);
                    }
                }
            }
        }
        int var18 = arg4 & 0x1FFFFFF8 << 3;
        int var19 = (arg9 & 0xFFFFFFF8) << 3;
        class336 var20 = new class336(arg8);
        byte var21 = 0;
        byte var22 = 0;
        if (arg2 == 1) {
            var21 = 1;
        } else if (arg2 == 2) {
            var21 = 1;
            var22 = 1;
        } else if (arg2 == 3) {
            var22 = 1;
        }
        for (int var23 = 0; var23 < var12; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg6 != var23 || var24 < var13 || var24 > (var13 + 8) || var25 < var11 || var25 > var11 + 8) {
                        class259.method1798(false, var20, 0, 0, (byte) -115, arg7, 0, 0, 0, 0, -1, -1);
                    } else if ((var13 + 8) == var24 || var11 + 8 == var25) {
                        int var32;
                        int var33;
                        if (arg2 == 0) {
                            var32 = -var11 - (-var25 - arg10);
                            var33 = -var13 - (-var24 - arg0);
                        } else if (arg2 == 1) {
                            var33 = var25 + arg0 - var11;
                            var32 = var13 + arg10 + 8 - var24;
                        } else if (arg2 == 2) {
                            var33 = arg0 + var13 + 8 - var24;
                            var32 = var11 + arg10 - (var25 - 8);
                        } else {
                            var33 = arg0 - var25 - (-var11 - 8);
                            var32 = var24 - (var13 - arg10);
                        }
                        class259.method1798(true, var20, 0, var18 + var24, (byte) -108, arg7, var19 + var25, 0, 0, arg1, var32, var33);
                    } else {
                        int var26 = class324.method2249(arg2, var25 & 0x7, var24 & 0x7, (byte) 3) + arg0;
                        int var27 = class243.method1700(-120, arg2, var24 & 0x7, var25 & 0x7) + arg10;
                        class259.method1798(false, var20, var21, var18 + var24, (byte) -121, arg7, var19 + var25, arg2, var22, arg1, var27, var26);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg2 == 0) {
                                var30 = arg10 - (var11 - var29);
                                var31 = var28 + arg0 - var13;
                            } else if (arg2 == 1) {
                                var31 = arg0 + var29 - var11;
                                var30 = var13 + arg10 + 8 - var28;
                            } else if (arg2 == 2) {
                                var31 = arg0 + var13 + 8 - var28;
                                var30 = arg10 + var11 + 8 - var29;
                            } else {
                                var30 = arg10 + var28 - var13;
                                var31 = var11 + arg0 + 8 - var29;
                            }
                            if (var31 >= 0 && var31 < 104 && var30 >= 0 && var30 < 104) {
                                class137.field2487[arg1][var31][var30] = class137.field2487[arg1][var26 + var22][var21 + var27];
                            }
                        }
                    }
                }
            }
        }
        boolean var34 = false;
        boolean var35 = false;
        while (var20.field5342.length > var20.field5353) {
            int var36 = var20.method2364(arg5 + 9913);
            if (var36 == 128) {
                class286.field4563[0] = var20.method2339((byte) -46);
                var34 = true;
                class286.field4563[1] = var20.method2326(82);
                class286.field4563[2] = var20.method2326(arg5 + 18937);
                class286.field4563[3] = var20.method2326(-124);
                class286.field4563[4] = var20.method2339((byte) -46);
            } else {
                if (var36 != 129) {
                    var20.field5353--;
                    break;
                }
                for (int var37 = 0; var37 < 4; var37++) {
                    byte var38 = var20.method2323(-106);
                    if (var38 == 0) {
                        if (arg6 >= var37) {
                            int var39 = arg0;
                            int var40 = arg0 + 7;
                            if (arg0 < 0) {
                                var39 = 0;
                            } else if (arg0 >= 104) {
                                var39 = 104;
                            }
                            if (var40 < 0) {
                                var40 = 0;
                            } else if (var40 >= 104) {
                                var40 = 104;
                            }
                            int var41 = arg10;
                            if (arg10 < 0) {
                                var41 = 0;
                            } else if (arg10 >= 104) {
                                var41 = 104;
                            }
                            int var42 = arg10 + 7;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 >= 104) {
                                var42 = 104;
                            }
                            while (var40 > var39) {
                                while (var42 > var41) {
                                    class41.field615[arg1][var39][var41] = 0;
                                    var41++;
                                }
                                var39++;
                            }
                        }
                    } else if (var38 == 1) {
                        for (int var43 = 0; var43 < 64; var43 += 4) {
                            for (int var44 = 0; var44 < 64; var44 += 4) {
                                byte var45 = var20.method2323(126);
                                if (arg6 >= var37) {
                                    for (int var46 = var43; var46 < var43 + 4; var46++) {
                                        for (int var47 = var44; var47 < var44 + 4; var47++) {
                                            if (var13 <= var46 && var46 < var13 + 8 && var11 <= var47 && var11 < (var11 + 8)) {
                                                int var48 = arg0 + class324.method2249(arg2, var47 & 0x7, var46 & 0x7, (byte) 3);
                                                int var49 = class243.method1700(arg5 + 19090, arg2, var46 & 0x7, var47 & 0x7) + arg10;
                                                if (var48 >= 0 && var48 < 104 && var49 >= 0 && var49 < 104) {
                                                    class41.field615[arg1][var48][var49] = var45;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var38 == 2) {
                    }
                }
            }
        }
        if (class43.field680 && !arg7) {
            class36 var50 = null;
            while (true) {
                while (var20.field5342.length > var20.field5353) {
                    int var51 = var20.method2364(-9069);
                    if (var51 == 0) {
                        var50 = new class36(var20);
                    } else if (var51 == 1) {
                        int var52 = var20.method2364(-9069);
                        if (var52 > 0) {
                            for (int var53 = 0; var53 < var52; var53++) {
                                class114 var54 = new class114(var20);
                                if (var54.field1919 == 31) {
                                    class351 var55 = class265.method1823(var20.method2339((byte) -46), -29180);
                                    var54.method968(97, var55.field5557, var55.field5566, var55.field5565, var55.field5564);
                                }
                                int var56 = var54.field1920 >> 7;
                                int var57 = var54.field1906 >> 7;
                                if (var54.field1914 == arg6 && var13 <= var57 && var57 < var13 + 8 && var11 <= var56 && var11 + 8 > var56) {
                                    int var58 = (arg0 << 7) + class172.method1352(arg2, 0, var54.field1906 & 0x3FF, var54.field1920 & 0x3FF);
                                    int var59 = class79.method735(arg2, var54.field1906 & 0x3FF, (byte) -106, var54.field1920 & 0x3FF) + (arg10 << 7);
                                    var54.field1920 = var59;
                                    int var60 = var54.field1920 >> 7;
                                    var54.field1906 = var58;
                                    int var61 = var54.field1906 >> 7;
                                    if (var61 >= 0 && var60 >= 0 && var61 < 104 && var60 < 104) {
                                        var54.field1905 = (class152.field2683[1][var61][var60] & 0x2) != 0;
                                        var54.field1922 = class137.field2487[var54.field1914][var61][var60] - var54.field1922;
                                        class245.method1720(var54);
                                    }
                                }
                            }
                        }
                    } else if (var51 == 2) {
                        if (var50 == null) {
                            var50 = new class36();
                        }
                        var50.method318((byte) -88, var20);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var50 == null) {
                    var50 = new class36();
                }
                client.field4377[arg0 >> 3][arg10 >> 3] = var50;
                break;
            }
        }
        if (!var35) {
            int var62 = arg0 + 7;
            int var63 = arg10 + 7;
            for (int var64 = arg0; var64 < var62; var64++) {
                for (int var65 = arg10; var65 < var63; var65++) {
                    class41.field615[arg1][var64][var65] = 0;
                }
            }
        }
        return var34 ? class286.field4563 : null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 753)
    public class135() {
        super(1, false);
    }
}
