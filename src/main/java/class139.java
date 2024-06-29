import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class139 {

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field2137 = 10;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2136 = "flash1:";

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "[I")
    public static int[] field2144 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "[Lqd;")
    public static class3[] field2142;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLuf;)V")
    public static final void method961(byte arg0, class176 arg1) {
        field2141++;
        class113.field1784 = arg1.method1168(20345, "p11_full");
        class243.field3764 = arg1.method1168(20345, "p12_full");
        class226.field3546 = arg1.method1168(20345, "b12_full");
        class241.field3730 = arg1.method1168(20345, "mapfunction");
        if (arg0 >= -118) {
            return;
        }
        class35.field570 = arg1.method1168(20345, "hitmarks");
        class127.field1997 = arg1.method1168(20345, "hitbar_default");
        class21.field318 = arg1.method1168(20345, "headicons_pk");
        class116.field1799 = arg1.method1168(20345, "headicons_prayer");
        class210.field3259 = arg1.method1168(20345, "hint_headicons");
        class206.field3205 = arg1.method1168(20345, "hint_mapmarkers");
        class22.field327 = arg1.method1168(20345, "mapflag");
        class167.field2526 = arg1.method1168(20345, "cross");
        class257.field3946 = arg1.method1168(20345, "mapdots");
        class290.field4572 = arg1.method1168(20345, "scrollbar");
        class62.field999 = arg1.method1168(20345, "name_icons");
        class206.field3203 = arg1.method1168(20345, "floorshadows");
        class117.field1821 = arg1.method1168(20345, "compass");
        class262.field4090 = arg1.method1168(20345, "hint_mapedge");
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(CI)Z")
    public static final boolean method962(char arg0, int arg1) {
        if (arg1 != -49) {
            field2140 = 14;
        }
        field2138++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method963(int arg0) {
        field2144 = null;
        if (arg0 != 20) {
            method965(43, (byte) 69);
        }
        field2136 = null;
        field2142 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIBILag;)V")
    public static final void method964(int arg0, int arg1, byte arg2, int arg3, class188 arg4) {
        field2135++;
        class130.method916(-127);
        if (arg2 >= -102) {
            field2140 = -94;
        }
        class201.method1351(arg1, arg0, arg1 + arg4.field2922, arg4.field2928 + arg0);
        if (class119.field1837 == 2 || class119.field1837 == 5 || class48.field787 == null) {
            class201.method1345(arg1, arg0, 0, arg4.field2850, arg4.field2858);
        } else {
            int var5 = (int) class276.field4334 + class133.field2060 & 0x7FF;
            int var6 = (class261.field4058.field4176 / 32) + 48;
            int var7 = 464 - (class261.field4058.field4123 / 32);
            ((class49) class48.field787).method402(arg1, arg0, arg4.field2922, arg4.field2928, var6, var7, var5, class296.field4674 + 256, arg4.field2850, arg4.field2858);
            if (class210.field3256 != null) {
                for (int var8 = 0; var8 < class210.field3256.field4535; var8++) {
                    if (class210.field3256.method1942(var8, 304)) {
                        int var9 = (((class210.field3256.field4543[var8] & 0xFFFE98E) >> 14) - class118.field1828) * 4 + 2 - class261.field4058.field4176 / 32;
                        int var10 = ((class210.field3256.field4543[var8] & 0x3FFF) - class129.field2008) * 4 + 2 - (class261.field4058.field4123 / 32);
                        int var11 = class97.field1556[var5];
                        class2 var12 = class143.field2189;
                        int var13 = var11 * 256 / (class296.field4674 + 256);
                        int var14 = class97.field1557[var5];
                        int var15 = var14 * 256 / (class296.field4674 + 256);
                        if (class210.field3256.method1936(var8, -16363) == 1) {
                            var12 = class124.field1953;
                        }
                        int var16 = var9 * var13 + var10 * var15 >> 16;
                        int var17 = var10 * var13 - (var9 * var15) >> 16;
                        if (class210.field3256.method1936(var8, -16363) == 2) {
                            var12 = class123.field1925;
                        }
                        int var18 = var12.method31(class210.field3256.field4538[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (var19 >= (-arg4.field2922) && arg4.field2922 >= var19 && -arg4.field2928 <= var17 && var17 <= arg4.field2928) {
                            int var20 = 16777215;
                            if (class210.field3256.field4539[var8] != -1) {
                                var20 = class210.field3256.field4539[var8];
                            }
                            class201.method1337(arg4.field2850, arg4.field2858);
                            var12.method26(class210.field3256.field4538[var8], arg4.field2922 / 2 + arg1 + var19, arg4.field2928 / 2 + arg0 - var17, var18, 50, var20, 0, 256, 1, 0, 0);
                            class201.method1330();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class108.field1720; var21++) {
                int var58 = class215.field3320[var21] * 4 + 2 - (class261.field4058.field4176 / 32);
                int var59 = class78.field1318[var21] * 4 - (class261.field4058.field4123 / 32 - 2);
                class73 var60 = class85.method690(2276, class291.field4584[var21]);
                if (var60.field1189 != null) {
                    var60 = var60.method577(75);
                    if (var60 == null || var60.field1183 == -1) {
                        continue;
                    }
                }
                class250.method1674(arg1, arg4, var59, class203.field3168[var60.field1183], var58, 2, arg0);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var54 = 0; var54 < 104; var54++) {
                    class149 var55 = class293.field4613[class274.field4318][var22][var54];
                    if (var55 != null) {
                        int var56 = var22 * 4 + (2 - class261.field4058.field4176 / 32);
                        int var57 = var54 * 4 + 2 - (class261.field4058.field4123 / 32);
                        class250.method1674(arg1, arg4, var57, class76.field1272[0], var56, 2, arg0);
                    }
                }
            }
            for (int var23 = 0; var23 < class62.field1006; var23++) {
                class32 var50 = class72.field1144[class198.field3113[var23]];
                if (var50 != null && var50.method229(-18109)) {
                    class217 var51 = var50.field518;
                    if (var51 != null && var51.field3405 != null) {
                        var51 = var51.method1446(-124);
                    }
                    if (var51 != null && var51.field3382 && var51.field3359) {
                        int var52 = var50.field4176 / 32 - (class261.field4058.field4176 / 32);
                        int var53 = var50.field4123 / 32 - (class261.field4058.field4123 / 32);
                        if (var51.field3407 == -1) {
                            class250.method1674(arg1, arg4, var53, class76.field1272[1], var52, 2, arg0);
                        } else {
                            class250.method1674(arg1, arg4, var53, class203.field3168[var51.field3407], var52, 2, arg0);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class5.field78; var24++) {
                class28 var40 = class41.field675[class166.field2510[var24]];
                if (var40 != null && var40.method229(-18109)) {
                    int var41 = var40.field4176 / 32 - (class261.field4058.field4176 / 32);
                    boolean var42 = false;
                    int var43 = var40.field4123 / 32 - class261.field4058.field4123 / 32;
                    long var44 = class247.method1668(var40.field446, true);
                    for (int var46 = 0; var46 < class262.field4100; var46++) {
                        if (class231.field3603[var46] == var44 && class112.field1761[var46] != 0) {
                            var42 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    for (int var48 = 0; var48 < class100.field1608; var48++) {
                        if (class46.field732[var48].field1408 == var44) {
                            var47 = true;
                            break;
                        }
                    }
                    boolean var49 = false;
                    if (class261.field4058.field433 != 0 && var40.field433 != 0 && class261.field4058.field433 == var40.field433) {
                        var49 = true;
                    }
                    if (var42) {
                        class250.method1674(arg1, arg4, var43, class76.field1272[3], var41, 2, arg0);
                    } else if (var47) {
                        class250.method1674(arg1, arg4, var43, class76.field1272[5], var41, 2, arg0);
                    } else if (var49) {
                        class250.method1674(arg1, arg4, var43, class76.field1272[4], var41, 2, arg0);
                    } else {
                        class250.method1674(arg1, arg4, var43, class76.field1272[2], var41, 2, arg0);
                    }
                }
            }
            int var25 = 0;
            class25[] var26 = class217.field3360;
            while (var26.length > var25) {
                class25 var29 = var26[var25];
                if (var29 != null && var29.field385 != 0 && class267.field4256 % 20 < 10) {
                    if (var29.field385 == 1 && var29.field371 >= 0 && var29.field371 < class72.field1144.length) {
                        class32 var30 = class72.field1144[var29.field371];
                        if (var30 != null) {
                            int var31 = var30.field4176 / 32 - (class261.field4058.field4176 / 32);
                            int var32 = var30.field4123 / 32 - (class261.field4058.field4123 / 32);
                            class223.method1494(var29.field374, true, var32, arg1, 360000, var31, arg0, arg4);
                        }
                    }
                    if (var29.field385 == 2) {
                        int var33 = (var29.field375 - class118.field1828) * 4 + 2 - (class261.field4058.field4176 / 32);
                        int var34 = var29.field378 * 4;
                        int var35 = (var29.field377 - class129.field2008) * 4 + 2 - class261.field4058.field4123 / 32;
                        int var36 = var34 * var34;
                        class223.method1494(var29.field374, true, var35, arg1, var36, var33, arg0, arg4);
                    }
                    if (var29.field385 == 10 && var29.field371 >= 0 && var29.field371 < class41.field675.length) {
                        class28 var37 = class41.field675[var29.field371];
                        if (var37 != null) {
                            int var38 = var37.field4176 / 32 - (class261.field4058.field4176 / 32);
                            int var39 = var37.field4123 / 32 - (class261.field4058.field4123 / 32);
                            class223.method1494(var29.field374, true, var39, arg1, 360000, var38, arg0, arg4);
                        }
                    }
                }
                var25++;
            }
            if (class177.field2656 != 0) {
                int var27 = class177.field2656 * 4 - ((class261.field4058.field4176 / 32) - (class261.field4058.method226((byte) -97) * 2 - 2) - 2);
                int var28 = class8.field162 * 4 + class261.field4058.method226((byte) -97) * 2 + 2 - (class261.field4058.field4123 / 32) - 2;
                class250.method1674(arg1, arg4, var28, class9.field191, var27, 2, arg0);
            }
            class201.method1333(arg1 + (arg4.field2922 / 2) - 1, arg0 - -(arg4.field2928 / 2) - 1, 3, 3, 16777215);
        }
        class222.field3476[arg3] = true;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)I")
    public static final int method965(int arg0, byte arg1) {
        double var2 = (double) ((arg0 & 0xFFBEA3) >> 16) / 256.0D;
        double var4 = (double) (arg0 & 0xFF) / 256.0D;
        field2134++;
        double var6 = (double) ((arg0 & 0xFF06) >> 8) / 256.0D;
        double var8 = var2;
        double var10 = var2;
        int var12 = -61 / ((79 - arg1) / 33);
        double var13 = 0.0D;
        if (var2 < var6) {
            var10 = var6;
        }
        if (var6 < var2) {
            var8 = var6;
        }
        if (var4 < var8) {
            var8 = var4;
        }
        double var15 = 0.0D;
        if (var10 < var4) {
            var10 = var4;
        }
        double var17 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var17 < 0.5D) {
                var15 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var13 = (var6 - var4) / (var10 - var8);
            } else if (var6 == var10) {
                var13 = (var4 - var2) / (var10 - var8) + 2.0D;
            } else if (var4 == var10) {
                var13 = (var2 - var6) / (var10 - var8) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var19 = var13 / 6.0D;
        int var21 = (int) (var15 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var19 * 256.0D);
        int var23 = (int) (var17 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var21 >>= 0x4;
        } else if (var23 > 217) {
            var21 >>= 0x3;
        } else if (var23 > 192) {
            var21 >>= 0x2;
        } else if (var23 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + ((var22 >> 2 << 10) + (var23 >> 1));
    }
}
