import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class150 {

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Z")
    public static boolean field2366 = false;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Loh;")
    public static class281 field2361 = new class281(50);

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2368 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "J")
    public static long field2369 = 0L;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lhc;")
    public static class235 field2370;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static final void method1008(boolean arg0) {
        field2362++;
        if (!class122.field1960) {
            return;
        }
        class228 var1 = class31.method239(class139.field2132, -1, class102.field1704);
        if (var1 != null && var1.field3612 != null) {
            class116 var2 = new class116();
            var2.field1895 = var1.field3612;
            var2.field1892 = var1;
            class44.method322(var2, 200000);
        }
        class122.field1960 = false;
        class248.field4020 = -1;
        class82.method591(var1, arg0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lhi;IIIIIIZ)V")
    public static final void method1009(class225 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3440.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field3440[var9] - class6.field127;
            int var23 = arg0.field3438[var9] - class140.field2145;
            int var24 = arg0.field3429[var9] - class193.field3029;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field3435 != null) {
                class225.field3439[var9] = var25;
                class225.field3437[var9] = var28;
                class225.field3447[var9] = var29;
            }
            class225.field3445[var9] = (var25 << 9) / var29 + class195.field3078;
            class225.field3443[var9] = (var28 << 9) / var29 + class195.field3082;
        }
        class195.field3092 = 0;
        int var10 = arg0.field3436.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field3436[var11];
            int var13 = arg0.field3442[var11];
            int var14 = arg0.field3431[var11];
            int var15 = class225.field3445[var12];
            int var16 = class225.field3445[var13];
            int var17 = class225.field3445[var14];
            int var18 = class225.field3443[var12];
            int var19 = class225.field3443[var13];
            int var20 = class225.field3443[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class16.field248 && class243.method1679(class195.field3078 + class112.field1840, class278.field4420 + class195.field3082, var18, var19, var20, var15, var16, var17)) {
                    class283.field4480 = arg5;
                    class51.field749 = arg6;
                }
                if (!arg7) {
                    class195.field3088 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class195.field3084 || var16 > class195.field3084 || var17 > class195.field3084) {
                        class195.field3088 = true;
                    }
                    if (arg0.field3435 == null || arg0.field3435[var11] == -1) {
                        if (arg0.field3446[var11] != 12345678) {
                            class195.method1329(var18, var19, var20, var15, var16, var17, arg0.field3446[var11], arg0.field3433[var11], arg0.field3434[var11]);
                        }
                    } else if (!class170.field2648) {
                        int var21 = class195.field3087.method497(arg0.field3435[var11], (byte) -74);
                        class195.method1329(var18, var19, var20, var15, var16, var17, class147.method992(var21, arg0.field3446[var11]), class147.method992(var21, arg0.field3433[var11]), class147.method992(var21, arg0.field3434[var11]));
                    } else if (arg0.field3444) {
                        class195.method1326(var18, var19, var20, var15, var16, var17, arg0.field3446[var11], arg0.field3433[var11], arg0.field3434[var11], class225.field3439[0], class225.field3439[1], class225.field3439[3], class225.field3437[0], class225.field3437[1], class225.field3437[3], class225.field3447[0], class225.field3447[1], class225.field3447[3], arg0.field3435[var11]);
                    } else {
                        class195.method1326(var18, var19, var20, var15, var16, var17, arg0.field3446[var11], arg0.field3433[var11], arg0.field3434[var11], class225.field3439[var12], class225.field3439[var13], class225.field3439[var14], class225.field3437[var12], class225.field3437[var13], class225.field3437[var14], class225.field3447[var12], class225.field3447[var13], class225.field3447[var14], arg0.field3435[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method1010(int arg0) {
        field2370 = null;
        field2361 = null;
        if (arg0 != 1) {
            field2370 = null;
        }
        field2368 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BJ)V")
    public static final void method1011(byte arg0, long arg1) {
        field2364++;
        if (arg0 != 41 || arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class268.method1806(false, arg1 - 1L);
            class268.method1806(false, 1L);
        } else {
            class268.method1806(false, arg1);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
    public static final void method1012(int arg0, int arg1) {
        field2367++;
        if (arg0 <= -56) {
            class41 var2 = class221.method1492((byte) -42, arg1, 7);
            var2.method303(23981);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)V")
    public static final void method1013(int arg0, int arg1) {
        class71.field1140 = 3;
        field2360++;
        class19.field280 = arg0;
        class6.field135 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILhc;)V")
    public static final void method1014(int arg0, class235 arg1) {
        class267.field4264 = arg1.method1603(-128, "p11_full");
        class171.field2663 = arg1.method1603(arg0 + 16334, "p12_full");
        if (arg0 != -16443) {
            field2366 = true;
        }
        class182.field2833 = arg1.method1603(-109, "b12_full");
        field2359++;
        class173.field2729 = arg1.method1603(arg0 ^ 0x4054, "mapfunction");
        class111.field1813 = arg1.method1603(arg0 + 16335, "hitmarks");
        class72.field1170 = arg1.method1603(arg0 ^ 0x4053, "hitbar_default");
        class60.field1026 = arg1.method1603(-122, "headicons_pk");
        class231.field3679 = arg1.method1603(-106, "headicons_prayer");
        class239.field3881 = arg1.method1603(arg0 + 16338, "hint_headicons");
        class95.field1616 = arg1.method1603(arg0 ^ 0x4042, "hint_mapmarkers");
        class229.field3647 = arg1.method1603(-115, "mapflag");
        class34.field509 = arg1.method1603(-128, "cross");
        class61.field1051 = arg1.method1603(-126, "mapdots");
        class40.field581 = arg1.method1603(-113, "scrollbar");
        class203.field3166 = arg1.method1603(-117, "name_icons");
        class5.field69 = arg1.method1603(-105, "floorshadows");
        class48.field696 = arg1.method1603(-116, "compass");
        class204.field3182 = arg1.method1603(arg0 + 16328, "hint_mapedge");
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(II)I")
    public static final int method1015(int arg0, int arg1) {
        field2363++;
        int var2 = arg1 * 6 - 61440;
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 != -342945940) {
            method1015(94, -47);
        }
        int var4 = (arg1 * var2 >> 12) + 40960;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method1016(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 >= 0 && arg7 >= 0 && arg5 < 103 && arg7 < 103) {
            if (arg3 == 0) {
                class7 var8 = class112.method790(arg2, arg5, arg7);
                if (var8 != null) {
                    int var9 = (int) (var8.field159 >>> 32) & Integer.MAX_VALUE;
                    if (arg6 == 2) {
                        var8.field149 = new class269(var9, 2, arg1 + 4, arg2, arg5, arg7, arg4, false, var8.field149);
                        var8.field156 = new class269(var9, 2, arg1 + 1 & 0x3, arg2, arg5, arg7, arg4, false, var8.field156);
                    } else {
                        var8.field149 = new class269(var9, arg6, arg1, arg2, arg5, arg7, arg4, false, var8.field149);
                    }
                }
            }
            if (arg3 == 1) {
                class206 var10 = class160.method1084(arg2, arg5, arg7);
                if (var10 != null) {
                    int var11 = (int) (var10.field3217 >>> 32) & Integer.MAX_VALUE;
                    if (arg6 == 4 || arg6 == 5) {
                        var10.field3224 = new class269(var11, 4, arg1, arg2, arg5, arg7, arg4, false, var10.field3224);
                    } else if (arg6 == 6) {
                        var10.field3224 = new class269(var11, 4, arg1 + 4, arg2, arg5, arg7, arg4, false, var10.field3224);
                    } else if (arg6 == 7) {
                        var10.field3224 = new class269(var11, 4, (arg1 + 2 & 0x3) + 4, arg2, arg5, arg7, arg4, false, var10.field3224);
                    } else if (arg6 == 8) {
                        var10.field3224 = new class269(var11, 4, arg1 + 4, arg2, arg5, arg7, arg4, false, var10.field3224);
                        var10.field3222 = new class269(var11, 4, (arg1 + 2 & 0x3) + 4, arg2, arg5, arg7, arg4, false, var10.field3222);
                    }
                }
            }
            if (arg3 == 2) {
                if (arg6 == 11) {
                    arg6 = 10;
                }
                class293 var12 = class42.method310(arg2, arg5, arg7);
                if (var12 != null) {
                    var12.field4619 = new class269(Integer.MAX_VALUE & (int) (var12.field4618 >>> 32), arg6, arg1, arg2, arg5, arg7, arg4, false, var12.field4619);
                }
            }
            if (arg3 == 3) {
                class140 var13 = class286.method1916(arg2, arg5, arg7);
                if (var13 != null) {
                    var13.field2137 = new class269((int) (var13.field2146 >>> 32) & Integer.MAX_VALUE, 22, arg1, arg2, arg5, arg7, arg4, false, var13.field2137);
                }
            }
        }
        if (arg0) {
            field2365++;
        }
    }
}
