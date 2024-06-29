import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class4 extends class245 {

    @OriginalMember(owner = "client!de", name = "mb", descriptor = "[I")
    public static int[] field36 = new int[1000];

    @OriginalMember(owner = "client!de", name = "pb", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!de", name = "jb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field33 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!de", name = "vb", descriptor = "Lmh;")
    public static class62 field45 = class201.method1405(true, "Untersuchen");

    @OriginalMember(owner = "client!de", name = "xb", descriptor = "Lmh;")
    public static class62 field47 = class201.method1405(true, ": ");

    @OriginalMember(owner = "client!de", name = "wb", descriptor = "Lw;")
    public static class38 field46 = new class38(64);

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!de", name = "kb", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!de", name = "lb", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!de", name = "nb", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!de", name = "ob", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!de", name = "qb", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!de", name = "rb", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!de", name = "tb", descriptor = "Lwj;")
    public static class135 field43;

    @OriginalMember(owner = "client!de", name = "ub", descriptor = "Lpb;")
    public static class177 field44;

    @OriginalMember(owner = "client!de", name = "sb", descriptor = "[S")
    public static short[] field42;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method17(int arg0, int arg1, int arg2, int arg3) {
        field32++;
        if (arg1 != -16168) {
            field44 = (class177) null;
        }
        return arg3 < arg0 ? arg0 : (arg3 <= arg2 ? arg3 : arg2);
    }

    @OriginalMember(owner = "client!de", name = "k", descriptor = "(B)V", line = 20)
    public static void method18(byte arg0) {
        if (arg0 >= -84) {
            field45 = (class62) null;
        }
        field33 = null;
        field45 = null;
        field43 = null;
        field44 = null;
        field46 = null;
        field47 = null;
        field42 = null;
        field36 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V", line = 37)
    public static final void method19(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field41++;
        if (arg0 > -121) {
            return;
        }
        if (class156.field2519 == 1) {
            class197.field3338[class218.field3761 / 100].method305(class111.field1827 - 8, class102.field1687 + -8);
        }
        if (class156.field2519 == 2) {
            class197.field3338[class218.field3761 / 100 + 4].method305(class111.field1827 - 8, class102.field1687 + -8);
        }
        class191.method1337((byte) -78);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lmi;I)V", line = 62)
    public static final void method20(class92 arg0, int arg1) {
        field37++;
        if ((arg0.field1495.length - arg0.field1476) < 1) {
            return;
        }
        int var2 = arg0.method702(-1);
        if (var2 < 0 || var2 > 3) {
            return;
        }
        byte var3;
        if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg0.field1495.length - arg0.field1476)) {
            return;
        }
        class44.field662 = arg0.method702(-1);
        if (class44.field662 < 1) {
            class44.field662 = 1;
        } else if (class44.field662 > 4) {
            class44.field662 = 4;
        }
        class229.method1624(0, arg0.method702(-1) == 1);
        class113.field1877 = arg0.method702(-1) == 1;
        class276.field4733 = arg0.method702(-1) == 1;
        class306.field5262 = arg0.method702(-1) == 1;
        class74.field1157 = arg0.method702(-1) == 1;
        class92.field1499 = arg0.method702(-1) == 1;
        class170.field2777 = arg0.method702(-1) == 1;
        class158.field2547 = arg0.method702(-1) == 1;
        class301.field5179 = arg0.method702(-1);
        if (class301.field5179 > 2) {
            class301.field5179 = 2;
        }
        if (var2 >= 2) {
            client.field5162 = arg0.method702(-1) == 1;
        } else {
            client.field5162 = arg0.method702(-1) == 1;
            arg0.method702(-1);
        }
        class72.field1107 = arg0.method702(-1) == 1;
        class52.field756 = arg0.method702(-1) == 1;
        class97.field1596 = arg0.method702(-1);
        if (class97.field1596 > 2) {
            class97.field1596 = 2;
        }
        class218.field3770 = arg0.method702(-1) == 1;
        class169.field2744 = arg0.method702(-1);
        if (arg1 >= -69) {
            return;
        }
        if (class169.field2744 > 127) {
            class169.field2744 = 127;
        }
        class100.field1650 = arg0.method702(-1);
        class114.field1902 = arg0.method702(-1);
        if (class114.field1902 > 127) {
            class114.field1902 = 127;
        }
        if (var2 >= 1) {
            class124.field2055 = arg0.method721(75);
            class54.field795 = arg0.method721(66);
        }
        if (var2 >= 3) {
            class235.field4039 = arg0.method702(-1) == 1;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V", line = 164)
    public static final void method21(int arg0) {
        field40++;
        if (!class214.field3637) {
            return;
        }
        if (arg0 <= 87) {
            field42 = (short[]) null;
        }
        class214.field3637 = false;
        class272.field4630 = null;
        field43 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)[[I", line = 188)
    public final int[][] method11(boolean arg0, int arg1) {
        if (arg0) {
            field39 = -15;
        }
        field38++;
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320 && this.method1713((byte) 61)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = arg1 % this.field4170 * this.field4170;
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class109.field1770; var8++) {
                int var9 = this.field4175[var8 % this.field4166 + var6];
                var7[var8] = class234.method1648(var9, 255) << 4;
                var5[var8] = class234.method1648(var9 >> 4, 4080);
                var4[var8] = class234.method1648(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[Lsg;IIIIII)V", line = 246)
    public static final void method22(int arg0, int arg1, int arg2, class191[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field34++;
        if (arg8 <= 63) {
            method18((byte) -113);
        }
        class311.method2118(arg1, arg9, arg4, arg2);
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class191 var11 = arg3[var10];
            if (var11 != null && (var11.field3074 == arg7 || arg7 == -1412584499 && class164.field2674 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class166.field2725[class221.field3805] = var11.field3152 + arg6;
                    class199.field3362[class221.field3805] = var11.field3098 + arg5;
                    class161.field2604[class221.field3805] = var11.field3190;
                    class183.field2935[class221.field3805] = var11.field3126;
                    var12 = class221.field3805++;
                } else {
                    var12 = arg0;
                }
                var11.field3207 = var12;
                var11.field3094 = class199.field3367;
                if (!var11.field3209 || !client.method2051(var11)) {
                    if (var11.field3083 > 0) {
                        class146.method1064(var11, -11465);
                    }
                    int var13 = var11.field3152 + arg6;
                    int var14 = var11.field3098 + arg5;
                    int var15 = var11.field3172;
                    if (class263.field4433 && (client.method2058(var11) != 0 || var11.field3068 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class164.field2674 == var11) {
                        if (arg7 != -1412584499 && !var11.field3129) {
                            class41.field624 = arg3;
                            class193.field3248 = arg5;
                            class85.field1380 = arg6;
                            continue;
                        }
                        if (!var11.field3129) {
                            var15 = 128;
                        }
                        if (class78.field1300 && class205.field3453) {
                            int var16 = class275.field4725;
                            int var17 = var16 - class72.field1101;
                            int var18 = class221.field3795;
                            int var19 = var18 - class209.field3544;
                            if (var17 < class131.field2139) {
                                var17 = class131.field2139;
                            }
                            if (var11.field3190 + var17 > class131.field2139 - -class80.field1342.field3190) {
                                var17 = class131.field2139 + class80.field1342.field3190 - var11.field3190;
                            }
                            var13 = var17;
                            if (var19 < class232.field4005) {
                                var19 = class232.field4005;
                            }
                            if ((class232.field4005 + class80.field1342.field3126) < (var11.field3126 + var19)) {
                                var19 = class232.field4005 + class80.field1342.field3126 - var11.field3126;
                            }
                            var14 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field3068 == 2) {
                        var20 = arg1;
                        var24 = arg4;
                        var21 = arg9;
                        var25 = arg2;
                    } else {
                        var20 = var13 <= arg1 ? arg1 : var13;
                        var21 = var14 > arg9 ? var14 : arg9;
                        int var22 = var11.field3190 + var13;
                        int var23 = var14 + var11.field3126;
                        if (var11.field3068 == 9) {
                            var22++;
                            var23++;
                        }
                        var24 = var22 < arg4 ? var22 : arg4;
                        var25 = var23 >= arg2 ? arg2 : var23;
                    }
                    if (!var11.field3209 || var20 < var24 && var25 > var21) {
                        if (var11.field3083 != 0) {
                            if (var11.field3083 == 1337 || var11.field3083 == 1403) {
                                class304.field5238 = var14;
                                class102.field1689 = var13;
                                class297.field5074 = var11;
                                class107.method827(var11.field3083 == 1403, var11.field3190, var11.field3126, var14, -19934, var13);
                                class311.method2118(arg1, arg9, arg4, arg2);
                                continue;
                            }
                            if (var11.field3083 == 1338) {
                                if (var11.method1333(-125)) {
                                    class113.method882(var11, false, var14, var12, var13);
                                    class311.method2118(arg1, arg9, arg4, arg2);
                                }
                                continue;
                            }
                            if (var11.field3083 == 1339) {
                                if (var11.method1333(113)) {
                                    class45.method295(var14, var12, var13, var11, (byte) 125);
                                    class311.method2118(arg1, arg9, arg4, arg2);
                                }
                                continue;
                            }
                            if (var11.field3083 == 1400) {
                                class263.method1820(var11.field3126, var11.field3190, 0, var14, var13);
                                class220.field3784[var12] = true;
                                class159.field2560[var12] = true;
                                class311.method2118(arg1, arg9, arg4, arg2);
                                continue;
                            }
                            if (var11.field3083 == 1401) {
                                class195.method1369((byte) -103, var11.field3190, var14, var11.field3126, var13);
                                class220.field3784[var12] = true;
                                class159.field2560[var12] = true;
                                class311.method2118(arg1, arg9, arg4, arg2);
                                continue;
                            }
                            if (var11.field3083 == 1402) {
                                continue;
                            }
                            if (var11.field3083 == 1404) {
                                class264.method1822(class296.field5047, class125.field2097, var11, (byte) -93, var14, var11.field3126, var13, var11.field3190);
                                class220.field3784[var12] = true;
                                class159.field2560[var12] = true;
                                continue;
                            }
                            if (var11.field3083 == 1405) {
                                if (!class214.field3639) {
                                    continue;
                                }
                                int var26 = var14 + 15;
                                int var27 = var11.field3190 + var13;
                                class20.field195.method2036(class254.method1772(new class62[] { class14.field114, class42.method284(class191.field3070, -123) }, 0), var27, var26, 16776960, -1);
                                int var122 = var26 + 15;
                                int var28 = 16776960;
                                Runtime var29 = Runtime.getRuntime();
                                int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                if (var30 > 65536) {
                                    var28 = 16711680;
                                }
                                class20.field195.method2036(class254.method1772(new class62[] { class54.field801, class42.method284(var30, -121), class42.field642 }, 0), var27, var122, var28, -1);
                                var26 = var122 + 15;
                                int var31 = 16776960;
                                int var32 = (class79.field1321 + class79.field1323 + class79.field1326) / 1024;
                                if (var32 > 65536) {
                                    var31 = 16711680;
                                }
                                class20.field195.method2036(class254.method1772(new class62[] { class151.field2382, class42.method284(var32, -127), class42.field642 }, 0), var27, var26, var31, -1);
                                var26 += 15;
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 27; var37++) {
                                    var34 += class170.field2765[var37].method875((byte) -83);
                                    var36 += class170.field2765[var37].method873(false);
                                    var35 += class170.field2765[var37].method874(18203);
                                }
                                int var38 = var35 * 100 / var34;
                                int var39 = var36 * 10000 / var34;
                                class62 var40 = class254.method1772(new class62[] { class203.field3422, class24.method125((long) var39, true, 2, 0, 0), class2.field29, class42.method284(var38, -120), class248.field4214 }, 0);
                                class125.field2097.method2036(var40, var27, var26, var33, -1);
                                var26 += 12;
                                class220.field3784[var12] = true;
                                class159.field2560[var12] = true;
                                continue;
                            }
                        }
                        if (!class80.field1341) {
                            if (var11.field3068 == 0 && var11.field3075 && var20 <= class45.field678 && var21 <= class113.field1883 && var24 > class45.field678 && class113.field1883 < var25 && !class263.field4433) {
                                class286.field4892[0] = 1005;
                                class195.field3293 = 1;
                                class146.field2317[0] = class112.field1853;
                                class244.field4151[0] = class275.field4694;
                            }
                            if (class45.field678 >= var20 && var21 <= class113.field1883 && var24 > class45.field678 && class113.field1883 < var25) {
                                class298.method2015((byte) -110, class113.field1883 - var14, var11, class45.field678 - var13);
                            }
                        }
                        if (var11.field3068 == 0) {
                            if (!var11.field3209 && client.method2051(var11) && class166.field2716 != var11) {
                                continue;
                            }
                            if (!var11.field3209) {
                                if ((var11.field3067 - var11.field3126) < var11.field3188) {
                                    var11.field3188 = var11.field3067 - var11.field3126;
                                }
                                if (var11.field3188 < 0) {
                                    var11.field3188 = 0;
                                }
                            }
                            method22(var12, var20, var25, arg3, var24, var14 - var11.field3188, var13 - var11.field3073, var11.field3142, 96, var21);
                            if (var11.field3180 != null) {
                                method22(var12, var20, var25, var11.field3180, var24, var14 - var11.field3188, -var11.field3073 + var13, var11.field3142, 121, var21);
                            }
                            class146 var41 = (class146) class214.field3632.method311((byte) 114, (long) var11.field3142);
                            if (var41 != null) {
                                if (var41.field2309 == 0 && !class80.field1341 && class45.field678 >= var20 && var21 <= class113.field1883 && class45.field678 < var24 && var25 > class113.field1883 && !class263.field4433) {
                                    class146.field2317[0] = class112.field1853;
                                    class286.field4892[0] = 1005;
                                    class244.field4151[0] = class275.field4694;
                                    class195.field3293 = 1;
                                }
                                class140.method1046(var12, var25, var41.field2312, var21, var20, var14, var13, (byte) -125, var24);
                            }
                            class311.method2118(arg1, arg9, arg4, arg2);
                        }
                        if (class57.field839[var12] || class32.field444 > 1) {
                            if (var11.field3068 == 0 && !var11.field3209 && var11.field3067 > var11.field3126) {
                                class185.method1298(var11.field3067, var11.field3126, var11.field3188, (byte) -126, var14, var13 + var11.field3190);
                            }
                            if (var11.field3068 != 1) {
                                if (var11.field3068 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var11.field3128; var43++) {
                                        for (int var44 = 0; var44 < var11.field3163; var44++) {
                                            int var45 = (var11.field3201 + 32) * var44 + var13;
                                            int var46 = var14 + ((var11.field3122 + 32) * var43);
                                            if (var42 < 20) {
                                                var45 += var11.field3169[var42];
                                                var46 += var11.field3109[var42];
                                            }
                                            if (var11.field3085[var42] > 0) {
                                                boolean var48 = false;
                                                int var49 = var11.field3085[var42] - 1;
                                                boolean var50 = false;
                                                if (arg1 < var45 + 32 && var45 < arg4 && var46 + 32 > arg9 && var46 < arg2 || class254.field4319 == var11 && class237.field4065 == var42) {
                                                    class135 var51;
                                                    if (class263.field4429 == 1 && class290.field4929 == var42 && class151.field2376 == var11.field3142) {
                                                        var51 = class284.method1934(2, var49, var11.field3066, var11.field3106[var42], 0, true);
                                                    } else {
                                                        var51 = class284.method1934(1, var49, var11.field3066, var11.field3106[var42], 3153952, true);
                                                    }
                                                    if (class23.field243) {
                                                        class220.field3784[var12] = true;
                                                    }
                                                    if (var51 == null) {
                                                        class250.method1744(var11, (byte) -61);
                                                    } else if (class254.field4319 == var11 && class237.field4065 == var42) {
                                                        int var52 = class275.field4725 - class227.field3944;
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        int var53 = class221.field3795 - class146.field2311;
                                                        if (var53 < 5 && var53 > -5) {
                                                            var53 = 0;
                                                        }
                                                        if (class270.field4586 < 5) {
                                                            var52 = 0;
                                                            var53 = 0;
                                                        }
                                                        var51.method642(var45 + var52, var46 + var53, 128);
                                                        if (arg7 != -1) {
                                                            class191 var54 = arg3[arg7 & 0xFFFF];
                                                            int var55 = class311.field5307;
                                                            int var56 = class311.field5304;
                                                            if ((var46 + var53) < var56 && var54.field3188 > 0) {
                                                                int var57 = (var56 - var46 - var53) * class277.field4757 / 3;
                                                                if (class277.field4757 * 10 < var57) {
                                                                    var57 = class277.field4757 * 10;
                                                                }
                                                                if (var57 > var54.field3188) {
                                                                    var57 = var54.field3188;
                                                                }
                                                                var54.field3188 -= var57;
                                                                class146.field2311 += var57;
                                                                class250.method1744(var54, (byte) 114);
                                                            }
                                                            if (var55 < var46 + var53 + 32 && (var54.field3067 - var54.field3126) > var54.field3188) {
                                                                int var58 = (var53 + var46 + 32 - var55) * class277.field4757 / 3;
                                                                if (class277.field4757 * 10 < var58) {
                                                                    var58 = class277.field4757 * 10;
                                                                }
                                                                if ((var54.field3067 - var54.field3126 - var54.field3188) < var58) {
                                                                    var58 = var54.field3067 - var54.field3126 - var54.field3188;
                                                                }
                                                                var54.field3188 += var58;
                                                                class146.field2311 -= var58;
                                                                class250.method1744(var54, (byte) -102);
                                                            }
                                                        }
                                                    } else if (class304.field5237 == var11 && class199.field3368 == var42) {
                                                        var51.method642(var45, var46, 128);
                                                    } else {
                                                        var51.method305(var45, var46);
                                                    }
                                                }
                                            } else if (var11.field3189 != null && var42 < 20) {
                                                class135 var47 = var11.method1331(-8041, var42);
                                                if (var47 != null) {
                                                    var47.method305(var45, var46);
                                                } else if (class80.field1339) {
                                                    class250.method1744(var11, (byte) -120);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var11.field3068 == 3) {
                                    int var121;
                                    if (class122.method936(19515, var11)) {
                                        var121 = var11.field3200;
                                        if (class166.field2716 == var11 && var11.field3204 != 0) {
                                            var121 = var11.field3204;
                                        }
                                    } else {
                                        var121 = var11.field3174;
                                        if (class166.field2716 == var11 && var11.field3058 != 0) {
                                            var121 = var11.field3058;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3187) {
                                            class311.method2117(var13, var14, var11.field3190, var11.field3126, var121);
                                        } else {
                                            class311.method2115(var13, var14, var11.field3190, var11.field3126, var121);
                                        }
                                    } else if (var11.field3187) {
                                        class311.method2113(var13, var14, var11.field3190, var11.field3126, var121, 256 - (var15 & 0xFF));
                                    } else {
                                        class311.method2122(var13, var14, var11.field3190, var11.field3126, var121, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3068 == 4) {
                                    class299 var117 = var11.method1330(-12729, class248.field4212);
                                    if (var117 != null) {
                                        class62 var118 = var11.field3199;
                                        int var119;
                                        if (class122.method936(19515, var11)) {
                                            var119 = var11.field3200;
                                            if (class166.field2716 == var11 && var11.field3204 != 0) {
                                                var119 = var11.field3204;
                                            }
                                            if (var11.field3064.method439(-48) > 0) {
                                                var118 = var11.field3064;
                                            }
                                        } else {
                                            var119 = var11.field3174;
                                            if (class166.field2716 == var11 && var11.field3058 != 0) {
                                                var119 = var11.field3058;
                                            }
                                        }
                                        if (var11.field3209 && var11.field3159 != -1) {
                                            class37 var120 = class189.method1320(0, var11.field3159);
                                            var118 = var120.field541;
                                            if (var118 == null) {
                                                var118 = class190.field3018;
                                            }
                                            if ((var120.field528 == 1 || var11.field3171 != 1) && var11.field3171 != -1) {
                                                var118 = class254.method1772(new class62[] { class113.field1876, var118, class212.field3574, class137.method1036(var11.field3171, true) }, 0);
                                            }
                                        }
                                        if (class81.field1354 == var11) {
                                            var119 = var11.field3174;
                                            var118 = class177.field2832;
                                        }
                                        if (!var11.field3209) {
                                            var118 = class225.method1594(var118, var11, (byte) 115);
                                        }
                                        var117.method2023(var118, var13, var14, var11.field3190, var11.field3126, var119, var11.field3165 ? 0 : -1, var11.field3164, var11.field3079, var11.field3048);
                                    } else if (class80.field1339) {
                                        class250.method1744(var11, (byte) 116);
                                    }
                                } else if (var11.field3068 == 5) {
                                    if (var11.field3209) {
                                        class135 var59;
                                        if (var11.field3159 == -1) {
                                            var59 = var11.method1340(false, (byte) -128);
                                        } else {
                                            var59 = class284.method1934(var11.field3108, var11.field3159, var11.field3066, var11.field3171, var11.field3100, true);
                                        }
                                        if (var59 != null) {
                                            int var60 = var59.field2205;
                                            int var61 = var59.field2199;
                                            if (var11.field3135) {
                                                int var62 = (var11.field3126 + var61 - 1) / var61;
                                                int var63 = (var60 + var11.field3190 - 1) / var60;
                                                class311.method2109(var13, var14, var11.field3190 + var13, var11.field3126 + var14);
                                                boolean var64 = class220.method1570(var59.field2207, 104);
                                                boolean var65 = class220.method1570(var59.field2202, 121);
                                                class257 var66 = (class257) var59;
                                                if (var64 && var65) {
                                                    if (var15 == 0) {
                                                        var66.method1784(var13, var14, var63, var62);
                                                    } else {
                                                        var66.method1788(var13, var14, 256 - (var15 & 0xFF), var63, var62);
                                                    }
                                                } else if (var64) {
                                                    for (int var67 = 0; var67 < var62; var67++) {
                                                        if (var15 == 0) {
                                                            var66.method1784(var13, var14 + (var61 * var67), var63, 1);
                                                        } else {
                                                            var66.method1788(var13, var61 * var67 + var14, 256 - (var15 & 0xFF), var63, 1);
                                                        }
                                                    }
                                                } else if (var65) {
                                                    for (int var68 = 0; var68 < var63; var68++) {
                                                        if (var15 == 0) {
                                                            var66.method1784(var60 * var68 + var13, var14, 1, var62);
                                                        } else {
                                                            var66.method1788(var60 * var68 + var13, var14, 256 - (var15 & 0xFF), 1, var62);
                                                        }
                                                    }
                                                } else {
                                                    for (int var69 = 0; var69 < var63; var69++) {
                                                        for (int var70 = 0; var70 < var62; var70++) {
                                                            if (var15 == 0) {
                                                                var59.method305(var60 * var69 + var13, var61 * var70 + var14);
                                                            } else {
                                                                var59.method642(var60 * var69 + var13, var61 * var70 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                }
                                                class311.method2118(arg1, arg9, arg4, arg2);
                                            } else {
                                                int var71 = var11.field3190 * 4096 / var60;
                                                if (var11.field3095 != 0) {
                                                    var59.method1018(var11.field3095, var71, var11.field3190 / 2 + var13, 48, var14 + (var11.field3126 / 2));
                                                } else if (var15 != 0) {
                                                    var59.method637(var13, var14, var11.field3190, var11.field3126, 256 - (var15 & 0xFF));
                                                } else if (var11.field3190 == var60 && var11.field3126 == var61) {
                                                    var59.method305(var13, var14);
                                                } else {
                                                    var59.method644(var13, var14, var11.field3190, var11.field3126);
                                                }
                                            }
                                        } else if (class80.field1339) {
                                            class250.method1744(var11, (byte) -46);
                                        }
                                    } else {
                                        class135 var72 = var11.method1340(class122.method936(19515, var11), (byte) -102);
                                        if (var72 != null) {
                                            var72.method305(var13, var14);
                                        } else if (class80.field1339) {
                                            class250.method1744(var11, (byte) -103);
                                        }
                                    }
                                } else if (var11.field3068 == 6) {
                                    boolean var73 = class122.method936(19515, var11);
                                    int var74;
                                    if (var73) {
                                        var74 = var11.field3193;
                                    } else {
                                        var74 = var11.field3177;
                                    }
                                    class138 var75 = null;
                                    int var76 = 0;
                                    if (var11.field3159 != -1) {
                                        class37 var81 = class189.method1320(0, var11.field3159);
                                        if (var81 != null) {
                                            class37 var82 = var81.method250(-2, var11.field3171);
                                            class96 var83 = var74 == -1 ? null : class151.method1085(var74, (byte) 97);
                                            var75 = var82.method244(1, var11.field3160, (byte) -82, var83);
                                            if (var75 == null) {
                                                class250.method1744(var11, (byte) -98);
                                            } else {
                                                var76 = -var75.method278() / 2;
                                            }
                                        }
                                    } else if (var11.field3105 == 5) {
                                        if (var11.field3141 == -1) {
                                            var75 = class162.field2616.method91((class96) null, -1, -1, 125, (class96) null);
                                        } else {
                                            int var78 = var11.field3141 & 0x7FF;
                                            if (class156.field2523 == var78) {
                                                var78 = 2047;
                                            }
                                            class153 var79 = class5.field50[var78];
                                            class96 var80 = var74 == -1 ? null : class151.method1085(var74, (byte) 123);
                                            if (var79 != null && ((int) var79.field2430.method451(43) << 11) == (var11.field3141 & 0xFFFFF800)) {
                                                var75 = var79.field2448.method91((class96) null, var11.field3160, 0, 123, var80);
                                            }
                                        }
                                    } else if (var74 == -1) {
                                        var75 = var11.method1338((byte) -101, class268.field4551.field2448, (class96) null, -1, var73);
                                        if (var75 == null && class80.field1339) {
                                            class250.method1744(var11, (byte) -57);
                                        }
                                    } else {
                                        class96 var77 = class151.method1085(var74, (byte) 99);
                                        var75 = var11.method1338((byte) 120, class268.field4551.field2448, var77, var11.field3160, var73);
                                        if (var75 == null && class80.field1339) {
                                            class250.method1744(var11, (byte) 102);
                                        }
                                    }
                                    if (var75 != null) {
                                        int var84;
                                        if (var11.field3202 > 0) {
                                            var84 = (var11.field3190 << 8) / var11.field3202;
                                        } else {
                                            var84 = 256;
                                        }
                                        int var85;
                                        if (var11.field3051 > 0) {
                                            var85 = (var11.field3126 << 8) / var11.field3051;
                                        } else {
                                            var85 = 256;
                                        }
                                        int var86 = var11.field3190 / 2 + (var11.field3107 * var84 >> 8) + var13;
                                        int var87 = (var11.field3196 * var85 >> 8) + var11.field3126 / 2 + var14;
                                        if (var11.field3113) {
                                            class154.method1123(var86, var87, var11.field3118, var11.field3047, var84, var85);
                                        } else {
                                            class154.method1119(var86, var87, var84, var85);
                                            class154.method1108((float) var11.field3210, (float) var11.field3047 * 1.5F);
                                        }
                                        class154.method1122();
                                        class154.method1137(true);
                                        class154.method1120(false);
                                        class269.method1849((byte) -90);
                                        if (class230.field3989) {
                                            class311.method2110();
                                            class154.method1125();
                                            class311.method2118(arg1, arg9, arg4, arg2);
                                            class230.field3989 = false;
                                        }
                                        if (var11.field3213) {
                                            class154.method1106();
                                        }
                                        int var88 = class23.field245[var11.field3182] * var11.field3118 >> 16;
                                        int var89 = class23.field254[var11.field3182] * var11.field3118 >> 16;
                                        if (var11.field3209) {
                                            var75.method483(0, var11.field3192, var11.field3125, var11.field3182, var11.field3158, var76 + var88 + var11.field3090, var11.field3090 + var89);
                                        } else {
                                            var75.method483(0, var11.field3192, 0, var11.field3182, 0, var88, var89);
                                        }
                                        if (var11.field3213) {
                                            class154.method1132();
                                        }
                                    }
                                } else {
                                    if (var11.field3068 == 7) {
                                        class299 var90 = var11.method1330(-12729, class248.field4212);
                                        if (var90 == null) {
                                            if (class80.field1339) {
                                                class250.method1744(var11, (byte) 101);
                                            }
                                            continue;
                                        }
                                        int var91 = 0;
                                        for (int var92 = 0; var92 < var11.field3128; var92++) {
                                            for (int var93 = 0; var93 < var11.field3163; var93++) {
                                                if (var11.field3085[var91] > 0) {
                                                    class37 var94 = class189.method1320(0, var11.field3085[var91] - 1);
                                                    class62 var95;
                                                    if (var94.field528 != 1 && var11.field3106[var91] == 1) {
                                                        var95 = class254.method1772(new class62[] { class113.field1876, var94.field541, class17.field162 }, 0);
                                                    } else {
                                                        var95 = class254.method1772(new class62[] { class113.field1876, var94.field541, class212.field3574, class137.method1036(var11.field3106[var91], true) }, 0);
                                                    }
                                                    int var96 = (var11.field3201 + 115) * var93 + var13;
                                                    int var97 = (var11.field3122 + 12) * var92 + var14;
                                                    if (var11.field3164 == 0) {
                                                        var90.method2021(var95, var96, var97, var11.field3174, var11.field3165 ? 0 : -1);
                                                    } else if (var11.field3164 == 1) {
                                                        var90.method2018(var95, var96 + 57, var97, var11.field3174, var11.field3165 ? 0 : -1);
                                                    } else {
                                                        var90.method2036(var95, var96 + 115 - 1, var97, var11.field3174, var11.field3165 ? 0 : -1);
                                                    }
                                                }
                                                var91++;
                                            }
                                        }
                                    }
                                    if (var11.field3068 == 8 && class22.field229 == var11 && class29.field403 == class227.field3947) {
                                        int var98 = 0;
                                        int var99 = 0;
                                        class299 var100 = class20.field195;
                                        class62 var101 = var11.field3199;
                                        class62 var102 = class225.method1594(var101, var11, (byte) 115);
                                        while (var102.method439(93) > 0) {
                                            int var103 = var102.method457(-27773, class220.field3782);
                                            class62 var104;
                                            if (var103 == -1) {
                                                var104 = var102;
                                                var102 = class275.field4694;
                                            } else {
                                                var104 = var102.method429(var103, 0, true);
                                                var102 = var102.method407(var103 + 4, 15552);
                                            }
                                            int var105 = var100.method2040(var104);
                                            var99 += var100.field5109 + 1;
                                            if (var105 > var98) {
                                                var98 = var105;
                                            }
                                        }
                                        var99 += 7;
                                        var98 += 6;
                                        int var106 = var11.field3190 + var13 - var98 - 5;
                                        if (var106 < (var13 + 5)) {
                                            var106 = var13 + 5;
                                        }
                                        if (arg4 < var98 + var106) {
                                            var106 = arg4 - var98;
                                        }
                                        int var107 = var11.field3126 + var14 + 5;
                                        if (arg2 < (var99 + var107)) {
                                            var107 = arg2 - var99;
                                        }
                                        class311.method2117(var106, var107, var98, var99, 16777120);
                                        class311.method2115(var106, var107, var98, var99, 0);
                                        class62 var108 = var11.field3199;
                                        int var109 = var100.field5109 + var107 + 2;
                                        class62 var110 = class225.method1594(var108, var11, (byte) 116);
                                        while (var110.method439(126) > 0) {
                                            int var111 = var110.method457(-27773, class220.field3782);
                                            class62 var112;
                                            if (var111 == -1) {
                                                var112 = var110;
                                                var110 = class275.field4694;
                                            } else {
                                                var112 = var110.method429(var111, 0, true);
                                                var110 = var110.method407(var111 + 4, 15552);
                                            }
                                            var100.method2021(var112, var106 + 3, var109, 0, -1);
                                            var109 += var100.field5109 + 1;
                                        }
                                    }
                                    if (var11.field3068 == 9) {
                                        int var113;
                                        int var114;
                                        int var115;
                                        int var116;
                                        if (var11.field3170) {
                                            var113 = var11.field3190 + var13;
                                            var114 = var14;
                                            var115 = var13;
                                            var116 = var11.field3126 + var14;
                                        } else {
                                            var116 = var14;
                                            var115 = var13;
                                            var114 = var14 + var11.field3126;
                                            var113 = var11.field3190 + var13;
                                        }
                                        if (var11.field3206 == 1) {
                                            class311.method2121(var115, var116, var113, var114, var11.field3174);
                                        } else {
                                            class311.method2107(var115, var116, var113, var114, var11.field3174, var11.field3206);
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
