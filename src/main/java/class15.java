import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class15 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[Lpc;")
    public static class142[] field257 = new class142[500];

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Lad;")
    public static class5 field266 = new class5();

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "[I")
    public static int[] field267 = new int[5];

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Lrf;")
    public static class163 field268 = class53.method392(117, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static final void method97(int arg0) {
        if (arg0 != 1) {
            method103(-33, 75, 119, -104, 26, -128, 60, 123, 51, -55, -19, false);
        }
        field256++;
        class17.field295.method399(false);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIBIIII)I")
    public static final int method98(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg5;
            arg5 = var7;
        }
        field259++;
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg1;
        } else {
            if (arg2 >= -26) {
                method102(6, 13, 72, null);
            }
            return var8 == 2 ? 8 - arg0 - arg6 : -arg1 - (arg5 + -1) + 7;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lig;BII)V")
    public static final void method99(class84 arg0, byte arg1, int arg2, int arg3) {
        if (arg0.field1834 == 1) {
            class62.method453((short) 7, 0L, 0, arg0.field1782, arg0.field1764, (byte) -109, class36.field728);
            class70.field1479++;
        }
        if (arg0.field1834 == 2 && !class189.field3766) {
            class163 var4 = class90.method627(false, arg0);
            if (var4 != null) {
                class63.field1337++;
                class62.method453((short) 2, 0L, -1, arg0.field1782, var4, (byte) -64, class180.method1216(new class163[] { class205.field4005, arg0.field1835 }, false));
            }
        }
        field261++;
        if (arg0.field1834 == 3) {
            class193.field3804++;
            class62.method453((short) 18, 0L, 0, arg0.field1782, class142.field2932, (byte) -40, class36.field728);
        }
        if (arg0.field1834 == 4) {
            class74.field1546++;
            class62.method453((short) 8, 0L, 0, arg0.field1782, arg0.field1764, (byte) -116, class36.field728);
        }
        if (arg0.field1834 == 5) {
            class62.method453((short) 12, 0L, 0, arg0.field1782, arg0.field1764, (byte) 114, class36.field728);
            class22.field390++;
        }
        int var5 = 69 % ((arg1 + 37) / 44);
        if (arg0.field1834 == 6 && class88.field1924 == null) {
            class62.method453((short) 11, 0L, -1, arg0.field1782, arg0.field1764, (byte) 119, class36.field728);
            class64.field1350++;
        }
        if (arg0.field1755 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field1815; var7++) {
                for (int var8 = 0; var8 < arg0.field1746; var8++) {
                    int var9 = (arg0.field1793 + 32) * var8;
                    int var10 = (arg0.field1812 + 32) * var7;
                    if (var6 < 20) {
                        var10 += arg0.field1752[var6];
                        var9 += arg0.field1791[var6];
                    }
                    if (var9 <= arg2 && arg3 >= var10 && var9 + 32 > arg2 && var10 + 32 > arg3) {
                        class57.field1162 = arg0;
                        class117.field2472 = var6;
                        if (arg0.field1750[var6] > 0) {
                            class4 var11 = class97.method669(-100, arg0.field1750[var6] - 1);
                            if (class62.field1326 == 1 && class69.method493(class21.method130(arg0, (byte) 77), 5000)) {
                                if (class190.field3777 != arg0.field1782 || class9.field183 != var6) {
                                    class62.method453((short) 25, (long) var11.field49, var6, arg0.field1782, class193.field3794, (byte) -105, class180.method1216(new class163[] { class119.field2516, class29.field538, var11.field62 }, false));
                                    class159.field3236++;
                                }
                            } else if (!class189.field3766 || !class69.method493(class21.method130(arg0, (byte) 77), 5000)) {
                                class22.field384++;
                                class163[] var12 = var11.field42;
                                if (class19.field312) {
                                    var12 = class197.method1306(var12, true);
                                }
                                if (class69.method493(class21.method130(arg0, (byte) 77), 5000)) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var12 != null && var12[var13] != null) {
                                            class146.field2987++;
                                            byte var14;
                                            if (var13 == 3) {
                                                var14 = 21;
                                            } else {
                                                var14 = 44;
                                            }
                                            class62.method453(var14, (long) var11.field49, var6, arg0.field1782, var12[var13], (byte) -21, class180.method1216(new class163[] { class191.field3787, var11.field62 }, false));
                                        } else if (var13 == 4) {
                                            class113.field2396++;
                                            class62.method453((short) 44, (long) var11.field49, var6, arg0.field1782, class80.field1622, (byte) -100, class180.method1216(new class163[] { class191.field3787, var11.field62 }, false));
                                        }
                                    }
                                }
                                if (class108.method730((byte) 55, class21.method130(arg0, (byte) 77))) {
                                    class16.field273++;
                                    class62.method453((short) 32, (long) var11.field49, var6, arg0.field1782, class193.field3794, (byte) -98, class180.method1216(new class163[] { class191.field3787, var11.field62 }, false));
                                }
                                if (class69.method493(class21.method130(arg0, (byte) 77), 5000) && var12 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var12[var15] != null) {
                                            class37.field742++;
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 42;
                                            }
                                            if (var15 == 1) {
                                                var16 = 22;
                                            }
                                            if (var15 == 2) {
                                                var16 = 31;
                                            }
                                            class62.method453(var16, (long) var11.field49, var6, arg0.field1782, var12[var15], (byte) 123, class180.method1216(new class163[] { class191.field3787, var11.field62 }, false));
                                        }
                                    }
                                }
                                class163[] var17 = arg0.field1843;
                                if (class19.field312) {
                                    var17 = class197.method1306(var17, true);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            class73.field1539++;
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 10;
                                            }
                                            if (var18 == 1) {
                                                var19 = 13;
                                            }
                                            if (var18 == 2) {
                                                var19 = 39;
                                            }
                                            if (var18 == 3) {
                                                var19 = 30;
                                            }
                                            if (var18 == 4) {
                                                var19 = 51;
                                            }
                                            class62.method453(var19, (long) var11.field49, var6, arg0.field1782, var17[var18], (byte) -60, class180.method1216(new class163[] { class191.field3787, var11.field62 }, false));
                                        }
                                    }
                                }
                                class62.method453((short) 1001, (long) var11.field49, var6, arg0.field1782, class167.field3391, (byte) -98, class180.method1216(new class163[] { class191.field3787, var11.field62 }, false));
                            } else if ((class112.field2362 & 0x10) == 16) {
                                class62.method453((short) 37, (long) var11.field49, var6, arg0.field1782, class181.field3635, (byte) -104, class180.method1216(new class163[] { class6.field134, class29.field538, var11.field62 }, false));
                                class62.field1302++;
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg0.field1853) {
            return;
        }
        if (!class189.field3766) {
            for (int var20 = 9; var20 >= 5; var20--) {
                class163 var24 = class121.method822(var20, 35, arg0);
                if (var24 != null) {
                    class62.method453((short) 1003, (long) (var20 + 1), arg0.field1758, arg0.field1782, var24, (byte) -27, arg0.field1800);
                    class159.field3242++;
                }
            }
            class163 var21 = class90.method627(false, arg0);
            if (var21 != null) {
                class63.field1337++;
                class62.method453((short) 2, 0L, arg0.field1758, arg0.field1782, var21, (byte) -43, arg0.field1800);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class163 var23 = class121.method822(var22, 59, arg0);
                if (var23 != null) {
                    class62.method453((short) 47, (long) (var22 + 1), arg0.field1758, arg0.field1782, var23, (byte) 122, arg0.field1800);
                    class159.field3242++;
                }
            }
            if (!class166.method1129(class21.method130(arg0, (byte) 77), (byte) 114)) {
                return;
            }
            class62.method453((short) 11, 0L, arg0.field1758, arg0.field1782, class21.field364, (byte) 115, class36.field728);
            class64.field1350++;
        } else if (class103.method704((byte) -43, class21.method130(arg0, (byte) 77)) && (class112.field2362 & 0x20) == 32) {
            class62.method453((short) 1, 0L, arg0.field1758, arg0.field1782, class181.field3635, (byte) -59, class180.method1216(new class163[] { class6.field134, class84.field1717, arg0.field1800 }, false));
            class37.field746++;
            return;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static final void method100(int arg0) {
        if (arg0 != 32) {
            field260 = 60;
        }
        field263++;
        class154.field3191.method399(false);
        class53.field1095.method399(false);
        class8.field171.method399(false);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method101(byte arg0) {
        int var1 = 20 / ((arg0 - 18) / 40);
        field266 = null;
        field268 = null;
        field267 = null;
        field257 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILu;)Lpf;")
    public static final class145 method102(int arg0, int arg1, int arg2, class184 arg3) {
        if (arg1 == 0) {
            field262++;
            return class102.method700(arg0, arg3, (byte) -8, arg2) ? class19.method122(61) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public static final boolean method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        int var12 = 125 % ((arg4 - 2) / 35);
        field265++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var37 = 0; var37 < 104; var37++) {
                class89.field1928[var13][var37] = 0;
                class136.field2810[var13][var37] = 99999999;
            }
        }
        class89.field1928[arg0][arg7] = 99;
        class136.field2810[arg0][arg7] = 0;
        int var14 = arg0;
        byte var15 = 0;
        class190.field3780[var15] = arg0;
        int var38 = var15 + 1;
        class27.field508[var15] = arg7;
        int var16 = arg7;
        int var17 = 0;
        int[][] var18 = class103.field2163[class60.field1227].field2736;
        int var19 = class190.field3780.length;
        boolean var20 = false;
        while (var38 != var17) {
            var14 = class190.field3780[var17];
            var16 = class27.field508[var17];
            var17 = (var17 + 1) % var19;
            if (arg1 == var14 && arg8 == var16) {
                var20 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class103.field2163[class60.field1227].method874(arg9, arg5 - 1, var16, var14, arg8, arg1, 1)) {
                    var20 = true;
                    break;
                }
                if (arg5 < 10 && class103.field2163[class60.field1227].method878(-62, var14, arg9, arg1, arg8, var16, arg5 - 1)) {
                    var20 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg10 != 0 && class103.field2163[class60.field1227].method870(arg8, 2, var16, arg1, arg10, arg6, arg2, var14)) {
                var20 = true;
                break;
            }
            int var36 = class136.field2810[var14][var16] + 1;
            if (var14 > 0 && class89.field1928[var14 - 1][var16] == 0 && (var18[var14 - 1][var16] & 0x12C0108) == 0) {
                class190.field3780[var38] = var14 - 1;
                class27.field508[var38] = var16;
                class89.field1928[var14 - 1][var16] = 2;
                var38 = (var38 + 1) % var19;
                class136.field2810[var14 - 1][var16] = var36;
            }
            if (var14 < 103 && class89.field1928[var14 + 1][var16] == 0 && (var18[var14 + 1][var16] & 0x12C0180) == 0) {
                class190.field3780[var38] = var14 + 1;
                class27.field508[var38] = var16;
                var38 = (var38 + 1) % var19;
                class89.field1928[var14 + 1][var16] = 8;
                class136.field2810[var14 + 1][var16] = var36;
            }
            if (var16 > 0 && class89.field1928[var14][var16 - 1] == 0 && (var18[var14][var16 - 1] & 0x12C0102) == 0) {
                class190.field3780[var38] = var14;
                class27.field508[var38] = var16 - 1;
                class89.field1928[var14][var16 - 1] = 1;
                var38 = (var38 + 1) % var19;
                class136.field2810[var14][var16 - 1] = var36;
            }
            if (var16 < 103 && class89.field1928[var14][var16 + 1] == 0 && (var18[var14][var16 + 1] & 0x12C0120) == 0) {
                class190.field3780[var38] = var14;
                class27.field508[var38] = var16 + 1;
                var38 = (var38 + 1) % var19;
                class89.field1928[var14][var16 + 1] = 4;
                class136.field2810[var14][var16 + 1] = var36;
            }
            if (var14 > 0 && var16 > 0 && class89.field1928[var14 - 1][var16 - 1] == 0 && (var18[var14 - 1][var16 - 1] & 0x12C010E) == 0 && (var18[var14 - 1][var16] & 0x12C0108) == 0 && (var18[var14][var16 - 1] & 0x12C0102) == 0) {
                class190.field3780[var38] = var14 - 1;
                class27.field508[var38] = var16 - 1;
                var38 = (var38 + 1) % var19;
                class89.field1928[var14 - 1][var16 - 1] = 3;
                class136.field2810[var14 - 1][var16 - 1] = var36;
            }
            if (var14 < 103 && var16 > 0 && class89.field1928[var14 + 1][var16 - 1] == 0 && (var18[var14 + 1][var16 - 1] & 0x12C0183) == 0 && (var18[var14 + 1][var16] & 0x12C0180) == 0 && (var18[var14][var16 - 1] & 0x12C0102) == 0) {
                class190.field3780[var38] = var14 + 1;
                class27.field508[var38] = var16 - 1;
                class89.field1928[var14 + 1][var16 - 1] = 9;
                class136.field2810[var14 + 1][var16 - 1] = var36;
                var38 = (var38 + 1) % var19;
            }
            if (var14 > 0 && var16 < 103 && class89.field1928[var14 - 1][var16 + 1] == 0 && (var18[var14 - 1][var16 + 1] & 0x12C0138) == 0 && (var18[var14 - 1][var16] & 0x12C0108) == 0 && (var18[var14][var16 + 1] & 0x12C0120) == 0) {
                class190.field3780[var38] = var14 - 1;
                class27.field508[var38] = var16 + 1;
                class89.field1928[var14 - 1][var16 + 1] = 6;
                class136.field2810[var14 - 1][var16 + 1] = var36;
                var38 = (var38 + 1) % var19;
            }
            if (var14 < 103 && var16 < 103 && class89.field1928[var14 + 1][var16 + 1] == 0 && (var18[var14 + 1][var16 + 1] & 0x12C01E0) == 0 && (var18[var14 + 1][var16] & 0x12C0180) == 0 && (var18[var14][var16 + 1] & 0x12C0120) == 0) {
                class190.field3780[var38] = var14 + 1;
                class27.field508[var38] = var16 + 1;
                class89.field1928[var14 + 1][var16 + 1] = 12;
                var38 = (var38 + 1) % var19;
                class136.field2810[var14 + 1][var16 + 1] = var36;
            }
        }
        class65.field1391 = 0;
        if (!var20) {
            if (!arg11) {
                return false;
            }
            int var21 = 100;
            int var22 = 1000;
            byte var23 = 10;
            for (int var24 = arg1 - var23; var24 <= arg1 + var23; var24++) {
                for (int var25 = arg8 - var23; var25 <= arg8 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class136.field2810[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg1) {
                            var26 = arg1 - var24;
                        } else if (var24 > arg1 + arg6 - 1) {
                            var26 = var24 + 1 - arg1 - arg6;
                        }
                        int var27 = 0;
                        if (var25 < arg8) {
                            var27 = arg8 - var25;
                        } else if (var25 > arg8 + arg10 - 1) {
                            var27 = var25 + 1 - arg8 - arg10;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var22 > var28 || var22 == var28 && var21 > class136.field2810[var24][var25]) {
                            var21 = class136.field2810[var24][var25];
                            var16 = var25;
                            var22 = var28;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (arg0 == var14 && arg7 == var16) {
                return false;
            }
            class65.field1391 = 1;
        }
        byte var29 = 0;
        class190.field3780[var29] = var14;
        int var39 = var29 + 1;
        class27.field508[var29] = var16;
        int var30;
        int var31 = var30 = class89.field1928[var14][var16];
        while (arg0 != var14 || arg7 != var16) {
            if (var30 != var31) {
                var30 = var31;
                class190.field3780[var39] = var14;
                class27.field508[var39++] = var16;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var16++;
            } else if ((var31 & 0x4) != 0) {
                var16--;
            }
            var31 = class89.field1928[var14][var16];
        }
        if (var39 > 0) {
            int var32 = var39;
            if (var39 > 25) {
                var32 = 25;
            }
            var39--;
            int var33 = class190.field3780[var39];
            int var34 = class27.field508[var39];
            if (arg3 == 0) {
                class138.field2835++;
                class141.field2896.method326(104, 55);
                class141.field2896.method370(var32 + var32 + 3, (byte) 123);
            }
            if (arg3 == 1) {
                class87.field1895++;
                class141.field2896.method326(104, 130);
                class141.field2896.method370(var32 + var32 + 17, (byte) 123);
            }
            if (arg3 == 2) {
                class141.field2896.method326(104, 137);
                class141.field2896.method370(var32 + var32 + 3, (byte) 123);
                class19.field336++;
            }
            class141.field2896.method355(var33 + class172.field3493, (byte) 89);
            class141.field2896.method346(0, class69.field1470 + var34);
            class158.field3233 = class27.field508[0];
            class113.field2392 = class190.field3780[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var39--;
                class141.field2896.method370(class190.field3780[var39] - var33, (byte) 123);
                class141.field2896.method391(false, class27.field508[var39] - var34);
            }
            class141.field2896.method372(class119.field2518[82] ? 1 : 0, (byte) 104);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lu;Lrf;ILrf;)Lpf;")
    public static final class145 method104(class184 arg0, class163 arg1, int arg2, class163 arg3) {
        if (arg2 != 1) {
            field268 = null;
        }
        int var4 = arg0.method1228(arg2 ^ 0x7E, arg3);
        int var5 = arg0.method1231(arg1, var4, 2);
        field258++;
        return method102(var4, arg2 ^ 0x1, var5, arg0);
    }
}
