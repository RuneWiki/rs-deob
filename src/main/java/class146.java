import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class146 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
    public static boolean field2975 = false;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lcd;")
    public static class23 field2981 = class54.method414("Titelbild geladen)3", -1);

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field2988 = 0;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field2984 = 0;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lcd;")
    public static class23 field2994 = class54.method414("Benutzeroberfl-=che geladen)3", -1);

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lcd;")
    public static class23 field2990 = class54.method414("<col=00ff80>", -1);

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Lcd;")
    public static class23 field2996 = class54.method414(")3", -1);

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lcd;")
    private static class23 field2995 = class54.method414("wave:", -1);

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Lcd;")
    public static class23 field2987 = field2995;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lcd;")
    public static class23 field2991 = field2995;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public int field2974;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public int field2997;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[B")
    public byte[] field2977;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "[B")
    public byte[] field2989;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method922(int arg0) {
        field2987 = null;
        field2991 = null;
        field2996 = null;
        field2994 = null;
        field2995 = null;
        int var1 = -8 % ((-arg0 - 75) / 44);
        field2990 = null;
        field2981 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static final void method923(boolean arg0) {
        class104.field2264 = 0;
        field2980++;
        class108.field2307 = 0;
        class15.method82((byte) 78);
        class152.method944(!arg0);
        class97.method636((byte) -123);
        if (arg0) {
            field2975 = false;
        }
        for (int var1 = 0; var1 < class104.field2264; var1++) {
            int var3 = class56.field1310[var1];
            if (class15.field339 != class91.field1944[var3].field266) {
                class91.field1944[var3].field3595 = null;
                class91.field1944[var3] = null;
            }
        }
        if (class199.field3900 != class81.field1769.field3752) {
            throw new RuntimeException("gnp1 pos:" + class81.field1769.field3752 + " psize:" + class199.field3900);
        }
        for (int var2 = 0; var2 < class67.field1583; var2++) {
            if (class91.field1944[class8.field161[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class67.field1583);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static final void method924(int arg0) {
        class159.field3190.method631(190, -1);
        class66.field1551++;
        class159.field3190.method1199(0L, -1898826808);
        if (arg0 != -2) {
            method924(-20);
        }
        field2979++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIILob;Lfh;I)V")
    public static final void method925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class127 arg6, class54 arg7, int arg8) {
        field2976++;
        if (class193.field3810 && (class53.field1253[0][arg1][arg4] & 0x2) == 0) {
            if ((class53.field1253[arg2][arg1][arg4] & 0x10) != 0) {
                return;
            }
            if (class169.method1036(arg1, arg2, arg4, -79) != class28.field614) {
                return;
            }
        }
        if (class21.field445 > arg2) {
            class21.field445 = arg2;
        }
        class104 var9 = class65.method486(arg8, (byte) -66);
        if (arg3 != -741) {
            method926(1, 88, null, -21);
        }
        int[][] var10 = class182.field3596[arg2];
        int var11;
        int var12;
        if (arg0 == 1 || arg0 == 3) {
            var11 = var9.field2232;
            var12 = var9.field2205;
        } else {
            var11 = var9.field2205;
            var12 = var9.field2232;
        }
        int var13 = (arg1 << 7) + (var12 << 6);
        int var14;
        int var15;
        if (arg1 + var12 <= 104) {
            var14 = (var12 >> 1) + arg1;
            var15 = arg1 + (var12 + 1 >> 1);
        } else {
            var14 = arg1;
            var15 = arg1 + 1;
        }
        int var16;
        int var17;
        if (arg4 + var11 <= 104) {
            var16 = (var11 >> 1) + arg4;
            var17 = arg4 + (var11 + 1 >> 1);
        } else {
            var16 = arg4;
            var17 = arg4 + 1;
        }
        int var18 = var10[var14][var16] + var10[var15][var16] + var10[var15][var17] + var10[var14][var17] >> 2;
        int var19 = (arg4 << 7) + (var11 << 6);
        int var20 = (arg4 << 7) + (arg8 << 14) + arg1 + 1073741824;
        if (var9.field2210 == 0) {
            var20 += Integer.MIN_VALUE;
        }
        int var21 = (arg0 << 6) + arg5;
        if (var9.field2263 == 1) {
            var21 += 256;
        }
        if (var9.method681(false)) {
            class160.method981(arg1, arg4, var9, arg0, arg2, (byte) -9);
        }
        if (arg5 == 22) {
            if (!class193.field3810 || var9.field2210 != 0 || var9.field2224 == 1 || var9.field2225) {
                class169 var22;
                if (var9.field2243 == -1 && var9.field2238 == null) {
                    var22 = var9.method688(var19, 92, arg0, var10, var18, 22, var13);
                } else {
                    var22 = new class117(arg8, 22, arg0, arg2, arg1, arg4, var9.field2243, true, null);
                }
                arg6.method822(arg2, arg1, arg4, var18, var22, var20, var21);
                if (var9.field2224 == 1 && arg7 != null) {
                    arg7.method422(arg4, (byte) 85, arg1);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class169 var45;
            if (var9.field2243 == -1 && var9.field2238 == null) {
                var45 = var9.method688(var19, arg3 + 820, arg0, var10, var18, 10, var13);
            } else {
                var45 = new class117(arg8, 10, arg0, arg2, arg1, arg4, var9.field2243, true, null);
            }
            if (var45 != null && arg6.method800(arg2, arg1, arg4, var18, var12, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field2236) {
                int var46 = 15;
                if (var45 instanceof class18) {
                    var46 = ((class18) var45).method123() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var12; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > class110.field2337[arg2][arg1 + var47][arg4 + var48]) {
                            class110.field2337[arg2][arg1 + var47][arg4 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field2224 != 0 && arg7 != null) {
                arg7.method426(var11, arg1, arg4, -90, var12, var9.field2217);
            }
        } else if (arg5 >= 12) {
            class169 var23;
            if (var9.field2243 == -1 && var9.field2238 == null) {
                var23 = var9.method688(var19, 97, arg0, var10, var18, arg5, var13);
            } else {
                var23 = new class117(arg8, arg5, arg0, arg2, arg1, arg4, var9.field2243, true, null);
            }
            arg6.method800(arg2, arg1, arg4, var18, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg2 > 0) {
                class40.field852[arg2][arg1][arg4] = class119.method745(class40.field852[arg2][arg1][arg4], 2340);
            }
            if (var9.field2224 != 0 && arg7 != null) {
                arg7.method426(var11, arg1, arg4, -112, var12, var9.field2217);
            }
        } else if (arg5 == 0) {
            class169 var24;
            if (var9.field2243 == -1 && var9.field2238 == null) {
                var24 = var9.method688(var19, arg3 + 832, arg0, var10, var18, 0, var13);
            } else {
                var24 = new class117(arg8, 0, arg0, arg2, arg1, arg4, var9.field2243, true, null);
            }
            arg6.method824(arg2, arg1, arg4, var18, var24, null, class160.field3217[arg0], 0, var20, var21);
            if (arg0 == 0) {
                if (var9.field2236) {
                    class110.field2337[arg2][arg1][arg4] = 50;
                    class110.field2337[arg2][arg1][arg4 + 1] = 50;
                }
                if (var9.field2220) {
                    class40.field852[arg2][arg1][arg4] = class119.method745(class40.field852[arg2][arg1][arg4], 585);
                }
            } else if (arg0 == 1) {
                if (var9.field2236) {
                    class110.field2337[arg2][arg1][arg4 + 1] = 50;
                    class110.field2337[arg2][arg1 + 1][arg4 + 1] = 50;
                }
                if (var9.field2220) {
                    class40.field852[arg2][arg1][arg4 + 1] = class119.method745(class40.field852[arg2][arg1][arg4 + 1], 1170);
                }
            } else if (arg0 == 2) {
                if (var9.field2236) {
                    class110.field2337[arg2][arg1 + 1][arg4] = 50;
                    class110.field2337[arg2][arg1 + 1][arg4 + 1] = 50;
                }
                if (var9.field2220) {
                    class40.field852[arg2][arg1 + 1][arg4] = class119.method745(class40.field852[arg2][arg1 + 1][arg4], 585);
                }
            } else if (arg0 == 3) {
                if (var9.field2236) {
                    class110.field2337[arg2][arg1][arg4] = 50;
                    class110.field2337[arg2][arg1 + 1][arg4] = 50;
                }
                if (var9.field2220) {
                    class40.field852[arg2][arg1][arg4] = class119.method745(class40.field852[arg2][arg1][arg4], 1170);
                }
            }
            if (var9.field2224 != 0 && arg7 != null) {
                arg7.method423(arg5, arg1, var9.field2217, arg4, false, arg0);
            }
            if (var9.field2256 != 16) {
                arg6.method794(arg2, arg1, arg4, var9.field2256);
            }
        } else if (arg5 == 1) {
            class169 var25;
            if (var9.field2243 == -1 && var9.field2238 == null) {
                var25 = var9.method688(var19, 74, arg0, var10, var18, 1, var13);
            } else {
                var25 = new class117(arg8, 1, arg0, arg2, arg1, arg4, var9.field2243, true, null);
            }
            arg6.method824(arg2, arg1, arg4, var18, var25, null, class6.field111[arg0], 0, var20, var21);
            if (var9.field2236) {
                if (arg0 == 0) {
                    class110.field2337[arg2][arg1][arg4 + 1] = 50;
                } else if (arg0 == 1) {
                    class110.field2337[arg2][arg1 + 1][arg4 + 1] = 50;
                } else if (arg0 == 2) {
                    class110.field2337[arg2][arg1 + 1][arg4] = 50;
                } else if (arg0 == 3) {
                    class110.field2337[arg2][arg1][arg4] = 50;
                }
            }
            if (var9.field2224 != 0 && arg7 != null) {
                arg7.method423(arg5, arg1, var9.field2217, arg4, false, arg0);
            }
        } else if (arg5 == 2) {
            int var26 = arg0 + 1 & 0x3;
            class169 var27;
            class169 var28;
            if (var9.field2243 == -1 && var9.field2238 == null) {
                var27 = var9.method688(var19, 85, arg0 + 4, var10, var18, 2, var13);
                var28 = var9.method688(var19, 118, var26, var10, var18, 2, var13);
            } else {
                var27 = new class117(arg8, 2, arg0 + 4, arg2, arg1, arg4, var9.field2243, true, null);
                var28 = new class117(arg8, 2, var26, arg2, arg1, arg4, var9.field2243, true, null);
            }
            arg6.method824(arg2, arg1, arg4, var18, var27, var28, class160.field3217[arg0], class160.field3217[var26], var20, var21);
            if (var9.field2220) {
                if (arg0 == 0) {
                    class40.field852[arg2][arg1][arg4] = class119.method745(class40.field852[arg2][arg1][arg4], 585);
                    class40.field852[arg2][arg1][arg4 + 1] = class119.method745(class40.field852[arg2][arg1][arg4 + 1], 1170);
                } else if (arg0 == 1) {
                    class40.field852[arg2][arg1][arg4 + 1] = class119.method745(class40.field852[arg2][arg1][arg4 + 1], 1170);
                    class40.field852[arg2][arg1 + 1][arg4] = class119.method745(class40.field852[arg2][arg1 + 1][arg4], 585);
                } else if (arg0 == 2) {
                    class40.field852[arg2][arg1 + 1][arg4] = class119.method745(class40.field852[arg2][arg1 + 1][arg4], 585);
                    class40.field852[arg2][arg1][arg4] = class119.method745(class40.field852[arg2][arg1][arg4], 1170);
                } else if (arg0 == 3) {
                    class40.field852[arg2][arg1][arg4] = class119.method745(class40.field852[arg2][arg1][arg4], 1170);
                    class40.field852[arg2][arg1][arg4] = class119.method745(class40.field852[arg2][arg1][arg4], 585);
                }
            }
            if (var9.field2224 != 0 && arg7 != null) {
                arg7.method423(arg5, arg1, var9.field2217, arg4, false, arg0);
            }
            if (var9.field2256 != 16) {
                arg6.method794(arg2, arg1, arg4, var9.field2256);
            }
        } else if (arg5 == 3) {
            class169 var29;
            if (var9.field2243 == -1 && var9.field2238 == null) {
                var29 = var9.method688(var19, arg3 + 821, arg0, var10, var18, 3, var13);
            } else {
                var29 = new class117(arg8, 3, arg0, arg2, arg1, arg4, var9.field2243, true, null);
            }
            arg6.method824(arg2, arg1, arg4, var18, var29, null, class6.field111[arg0], 0, var20, var21);
            if (var9.field2236) {
                if (arg0 == 0) {
                    class110.field2337[arg2][arg1][arg4 + 1] = 50;
                } else if (arg0 == 1) {
                    class110.field2337[arg2][arg1 + 1][arg4 + 1] = 50;
                } else if (arg0 == 2) {
                    class110.field2337[arg2][arg1 + 1][arg4] = 50;
                } else if (arg0 == 3) {
                    class110.field2337[arg2][arg1][arg4] = 50;
                }
            }
            if (var9.field2224 != 0 && arg7 != null) {
                arg7.method423(arg5, arg1, var9.field2217, arg4, false, arg0);
            }
        } else if (arg5 == 9) {
            class169 var30;
            if (var9.field2243 == -1 && var9.field2238 == null) {
                var30 = var9.method688(var19, arg3 ^ 0xFFFFFD48, arg0, var10, var18, arg5, var13);
            } else {
                var30 = new class117(arg8, arg5, arg0, arg2, arg1, arg4, var9.field2243, true, null);
            }
            arg6.method800(arg2, arg1, arg4, var18, 1, 1, var30, 0, var20, var21);
            if (var9.field2224 != 0 && arg7 != null) {
                arg7.method426(var11, arg1, arg4, arg3 ^ 0x2BC, var12, var9.field2217);
            }
            if (var9.field2256 != 16) {
                arg6.method794(arg2, arg1, arg4, var9.field2256);
            }
        } else if (arg5 == 4) {
            class169 var31;
            if (var9.field2243 == -1 && var9.field2238 == null) {
                var31 = var9.method688(var19, arg3 ^ 0xFFFFFD77, arg0, var10, var18, 4, var13);
            } else {
                var31 = new class117(arg8, 4, arg0, arg2, arg1, arg4, var9.field2243, true, null);
            }
            arg6.method793(arg2, arg1, arg4, var18, var31, null, class160.field3217[arg0], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method784(arg2, arg1, arg4);
            if (var33 != 0) {
                var32 = class65.method486(var33 >> 14 & 0x7FFF, (byte) -66).field2256;
            }
            class169 var34;
            if (var9.field2243 == -1 && var9.field2238 == null) {
                var34 = var9.method688(var19, 99, arg0, var10, var18, 4, var13);
            } else {
                var34 = new class117(arg8, 4, arg0, arg2, arg1, arg4, var9.field2243, true, null);
            }
            arg6.method793(arg2, arg1, arg4, var18, var34, null, class160.field3217[arg0], 0, class53.field1258[arg0] * var32, class54.field1281[arg0] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method784(arg2, arg1, arg4);
            if (var36 != 0) {
                var35 = class65.method486(var36 >> 14 & 0x7FFF, (byte) -66).field2256 / 2;
            }
            class169 var37;
            if (var9.field2243 == -1 && var9.field2238 == null) {
                var37 = var9.method688(var19, 108, arg0 + 4, var10, var18, 4, var13);
            } else {
                var37 = new class117(arg8, 4, arg0 + 4, arg2, arg1, arg4, var9.field2243, true, null);
            }
            arg6.method793(arg2, arg1, arg4, var18, var37, null, 256, arg0, class94.field1967[arg0] * var35, class96.field2028[arg0] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg0 + 2 & 0x3;
            class169 var39;
            if (var9.field2243 == -1 && var9.field2238 == null) {
                var39 = var9.method688(var19, 88, var38 + 4, var10, var18, 4, var13);
            } else {
                var39 = new class117(arg8, 4, var38 + 4, arg2, arg1, arg4, var9.field2243, true, null);
            }
            arg6.method793(arg2, arg1, arg4, var18, var39, null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method784(arg2, arg1, arg4);
            int var42 = arg0 + 2 & 0x3;
            if (var41 != 0) {
                var40 = class65.method486(var41 >> 14 & 0x7FFF, (byte) -66).field2256 / 2;
            }
            class169 var43;
            class169 var44;
            if (var9.field2243 == -1 && var9.field2238 == null) {
                var43 = var9.method688(var19, arg3 ^ 0xFFFFFD46, arg0 + 4, var10, var18, 4, var13);
                var44 = var9.method688(var19, 115, var42 + 4, var10, var18, 4, var13);
            } else {
                var43 = new class117(arg8, 4, arg0 + 4, arg2, arg1, arg4, var9.field2243, true, null);
                var44 = new class117(arg8, 4, var42 + 4, arg2, arg1, arg4, var9.field2243, true, null);
            }
            arg6.method793(arg2, arg1, arg4, var18, var43, var44, 256, arg0, class94.field1967[arg0] * var40, class96.field2028[arg0] * var40, var20, var21);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILgb;I)V")
    public static final void method926(int arg0, int arg1, class57 arg2, int arg3) {
        if (arg2.field288 == arg3 && arg3 != -1) {
            int var4 = class20.method128(arg3, (byte) 79).field1962;
            if (var4 == 1) {
                arg2.field252 = arg1;
                arg2.field273 = 0;
                arg2.field220 = 0;
                arg2.field242 = 0;
            }
            if (var4 == 2) {
                arg2.field273 = 0;
            }
        } else if (arg3 == -1 || arg2.field288 == -1 || class20.method128(arg3, (byte) 37).field1971 >= class20.method128(arg2.field288, (byte) 74).field1971) {
            arg2.field242 = 0;
            arg2.field236 = arg2.field247;
            arg2.field220 = 0;
            arg2.field252 = arg1;
            arg2.field288 = arg3;
            arg2.field273 = 0;
        }
        if (arg0 > 19) {
            field2982++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static final void method927(byte arg0) {
        field2986++;
        if (!class73.field1660) {
            return;
        }
        class47 var1 = class15.method79(class191.field3789, class167.field3331, -12910);
        if (var1 != null && var1.field1020 != null) {
            class144 var2 = new class144();
            var2.field2939 = var1;
            var2.field2942 = var1.field1020;
            class50.method391(-1142686098, var2);
        }
        class73.field1660 = false;
        class3.method12(var1, false);
        if (arg0 != 27) {
            method924(-30);
        }
    }
}
