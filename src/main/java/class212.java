import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class212 {

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "[Lqj;")
    public static class196[] field3811 = new class196[200];

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public int field3808;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public int field3812;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public int field3814;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[Lub;")
    public static class43[] field3804;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1463(int arg0, int arg1, int arg2, int arg3) {
        if (!class246.method1678(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class42.field480[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class202.field3586) {
                    if (!class25.method144(var4, var6, var5)) {
                        return false;
                    }
                    if (!class25.method144(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class25.method144(var4, var7, var5)) {
                        return false;
                    }
                    if (!class25.method144(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class25.method144(var4, var8, var5)) {
                    return false;
                }
                if (!class25.method144(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class224.field4012) {
                    if (!class25.method144(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class25.method144(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class25.method144(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class25.method144(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class25.method144(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class25.method144(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class202.field3586) {
                    if (!class25.method144(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class25.method144(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class25.method144(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class25.method144(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class25.method144(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class25.method144(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class224.field4012) {
                    if (!class25.method144(var4, var6, var5)) {
                        return false;
                    }
                    if (!class25.method144(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class25.method144(var4, var7, var5)) {
                        return false;
                    }
                    if (!class25.method144(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class25.method144(var4, var8, var5)) {
                    return false;
                }
                if (!class25.method144(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class25.method144(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class25.method144(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class25.method144(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class25.method144(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class25.method144(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZIIII)V")
    public static final void method1464(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        class6.field50 = (short) arg3;
        if (arg2 == 128) {
            field3813++;
            class173.field2921 = (short) arg0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public abstract void method442(int arg0, int arg1);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    public abstract void method439(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILra;I[B)V")
    public static final void method1465(int arg0, class69 arg1, int arg2, byte[] arg3) {
        field3810++;
        class57 var4 = new class57();
        var4.field774 = arg1;
        var4.field761 = arg2;
        var4.field1850 = arg0;
        var4.field759 = arg3;
        class243 var5 = class243.field4323;
        synchronized (class243.field4323) {
            class243.field4323.method1652(26532, var4);
        }
        class253.method1711((byte) 101);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static final void method1466(int arg0) {
        field3815++;
        for (int var1 = 0; var1 < class148.field2336; var1++) {
            int var2 = class104.field1507[var1];
            class164 var3 = class153.field2482[var2];
            int var4 = class229.field4077.method367(1);
            if ((var4 & 0x2) != 0) {
                int var5 = class229.field4077.method336((byte) -69);
                int var6 = class229.field4077.method309((byte) 74);
                var3.method856(var6, class171.field2879, 88, var5);
            }
            if ((var4 & 0x40) != 0) {
                var3.field2113 = class229.field4077.method315(85);
                int var7 = class229.field4077.method335(true);
                var3.field2090 = 0;
                var3.field2072 = (var7 & 0xFFFF) + class171.field2879;
                var3.field2059 = 0;
                var3.field2053 = var7 >> 16;
                if (var3.field2072 > class171.field2879) {
                    var3.field2059 = -1;
                }
                if (var3.field2113 == 65535) {
                    var3.field2113 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var8 = class229.field4077.method305(true);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class229.field4077.method343((byte) -23);
                class78.method490(var3, var8, var9, true);
            }
            if ((var4 & 0x1) != 0) {
                var3.field2051 = class229.field4077.method326(true);
                var3.field2095 = 100;
            }
            if ((var4 & 0x80) != 0) {
                var3.field2111 = class229.field4077.method318(true);
                var3.field2050 = class229.field4077.method305(true);
            }
            if ((var4 & 0x20) != 0) {
                var3.field2075 = class229.field4077.method305(true);
                if (var3.field2075 == 65535) {
                    var3.field2075 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field2648.method676((byte) 126)) {
                    class125.method772(-99, var3);
                }
                var3.field2648 = class126.method777((byte) -55, class229.field4077.method315(72));
                var3.field2082 = var3.field2648.field1611;
                var3.field2097 = var3.field2648.field1583;
                var3.field2108 = var3.field2648.field1618;
                var3.field2062 = var3.field2648.field1579;
                var3.field2052 = var3.field2648.field1637;
                var3.field2107 = var3.field2648.field1606;
                var3.field2074 = var3.field2648.field1594;
                var3.field2091 = var3.field2648.field1627;
                var3.field2049 = var3.field2648.field1599;
                if (var3.field2648.method676((byte) 124)) {
                    class82.method512(null, -77, var3.field2046[0], 0, null, var3, var3.field2102[0], class27.field335);
                }
            }
            if ((var4 & 0x8) != 0) {
                int var10 = class229.field4077.method309((byte) 78);
                int var11 = class229.field4077.method309((byte) 77);
                var3.method856(var11, class171.field2879, 114, var10);
                var3.field2110 = class171.field2879 + 300;
                var3.field2099 = class229.field4077.method309((byte) 105);
            }
        }
        if (arg0 < 38) {
            field3804 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1467(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class102.field1480++;
        class234.field4168 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class137.field2056; var12 < class39.field442; var12++) {
            class61[][] var38 = class249.field4410[var12];
            for (int var39 = class135.field1959; var39 < class24.field313; var39++) {
                for (int var40 = class149.field2380; var40 < class242.field4299; var40++) {
                    class61 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (var41.field841 <= class218.field3913 && class195.field3423[var39 + class168.field2827 - class71.field1006][var40 + class168.field2827 - class238.field4236] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field837 = true;
                            var41.field828 = true;
                            if (var41.field836 > 0) {
                                var41.field832 = true;
                            } else {
                                var41.field832 = false;
                            }
                            class234.field4168++;
                        } else {
                            var41.field837 = false;
                            var41.field828 = false;
                            var41.field824 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field829 != null) {
                                    class221 var42 = var41.field829;
                                    var42.field3992.method948(var42.field3986, var42.field3983, 1, var42.field3983, var42.field3986);
                                    if (var42.field3979 != null) {
                                        var42.field3979.method948(var42.field3986, var42.field3983, 1, var42.field3983, var42.field3986);
                                    }
                                }
                                if (var41.field830 != null) {
                                    class7 var43 = var41.field830;
                                    var43.field59.method948(var43.field65, var43.field68, 1, var43.field68, var43.field65);
                                    if (var43.field63 != null) {
                                        var43.field63.method948(var43.field65, var43.field68, 1, var43.field68, var43.field65);
                                    }
                                }
                                if (var41.field818 != null) {
                                    class116 var44 = var41.field818;
                                    var44.field1681.method948(var44.field1682, var44.field1673, 1, var44.field1673, var44.field1682);
                                }
                                if (var41.field823 != null) {
                                    for (int var45 = 0; var45 < var41.field836; var45++) {
                                        class200 var46 = var41.field823[var45];
                                        var46.field3544.method948(var46.field3548, var46.field3539, 1, var46.field3549, var46.field3556);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class42.field480 == class145.field2265;
        for (int var14 = class137.field2056; var14 < class39.field442; var14++) {
            class61[][] var27 = class249.field4410[var14];
            for (int var28 = -class168.field2827; var28 <= 0; var28++) {
                int var29 = class71.field1006 + var28;
                int var30 = class71.field1006 - var28;
                if (var29 >= class135.field1959 || var30 < class24.field313) {
                    for (int var31 = -class168.field2827; var31 <= 0; var31++) {
                        int var32 = class238.field4236 + var31;
                        int var33 = class238.field4236 - var31;
                        if (var29 >= class135.field1959) {
                            if (var32 >= class149.field2380) {
                                class61 var34 = var27[var29][var32];
                                if (var34 != null && var34.field837) {
                                    class13.method61(var34, true);
                                }
                            }
                            if (var33 < class242.field4299) {
                                class61 var35 = var27[var29][var33];
                                if (var35 != null && var35.field837) {
                                    class13.method61(var35, true);
                                }
                            }
                        }
                        if (var30 < class24.field313) {
                            if (var32 >= class149.field2380) {
                                class61 var36 = var27[var30][var32];
                                if (var36 != null && var36.field837) {
                                    class13.method61(var36, true);
                                }
                            }
                            if (var33 < class242.field4299) {
                                class61 var37 = var27[var30][var33];
                                if (var37 != null && var37.field837) {
                                    class13.method61(var37, true);
                                }
                            }
                        }
                        if (class234.field4168 == 0) {
                            if (!var13) {
                                class161.field2587 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class137.field2056; var15 < class39.field442; var15++) {
            class61[][] var16 = class249.field4410[var15];
            for (int var17 = -class168.field2827; var17 <= 0; var17++) {
                int var18 = class71.field1006 + var17;
                int var19 = class71.field1006 - var17;
                if (var18 >= class135.field1959 || var19 < class24.field313) {
                    for (int var20 = -class168.field2827; var20 <= 0; var20++) {
                        int var21 = class238.field4236 + var20;
                        int var22 = class238.field4236 - var20;
                        if (var18 >= class135.field1959) {
                            if (var21 >= class149.field2380) {
                                class61 var23 = var16[var18][var21];
                                if (var23 != null && var23.field837) {
                                    class13.method61(var23, false);
                                }
                            }
                            if (var22 < class242.field4299) {
                                class61 var24 = var16[var18][var22];
                                if (var24 != null && var24.field837) {
                                    class13.method61(var24, false);
                                }
                            }
                        }
                        if (var19 < class24.field313) {
                            if (var21 >= class149.field2380) {
                                class61 var25 = var16[var19][var21];
                                if (var25 != null && var25.field837) {
                                    class13.method61(var25, false);
                                }
                            }
                            if (var22 < class242.field4299) {
                                class61 var26 = var16[var19][var22];
                                if (var26 != null && var26.field837) {
                                    class13.method61(var26, false);
                                }
                            }
                        }
                        if (class234.field4168 == 0) {
                            if (!var13) {
                                class161.field2587 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class161.field2587 = false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static void method1468(boolean arg0) {
        if (!arg0) {
            field3804 = null;
            field3811 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3805++;
        int var6 = arg5 - arg4;
        int var7 = arg3 - arg2;
        if (~var6 == arg1) {
            if (var7 != 0) {
                class31.method167(arg2, arg3, 52, arg4, arg0);
            }
        } else if (var7 == 0) {
            class166.method1071(arg5, arg4, arg0, arg1 - 94, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg4;
                int var10 = arg5;
                arg5 = arg3;
                arg4 = arg2;
                arg3 = var10;
                arg2 = var9;
            }
            if (arg5 < arg4) {
                int var11 = arg4;
                arg4 = arg5;
                int var12 = arg2;
                arg5 = var11;
                arg2 = arg3;
                arg3 = var12;
            }
            int var13 = arg3 - arg2;
            int var14 = arg5 - arg4;
            int var15 = arg2;
            int var16 = arg3 > arg2 ? 1 : -1;
            if (var13 < 0) {
                var13 = -var13;
            }
            int var17 = -(var14 >> 1);
            if (var8) {
                for (int var19 = arg4; var19 <= arg5; var19++) {
                    class95.field1380[var19][var15] = arg0;
                    var17 += var13;
                    if (var17 > 0) {
                        var17 -= var14;
                        var15 += var16;
                    }
                }
            } else {
                for (int var18 = arg4; var18 <= arg5; var18++) {
                    var17 += var13;
                    class95.field1380[var15][var18] = arg0;
                    if (var17 > 0) {
                        var15 += var16;
                        var17 -= var14;
                    }
                }
            }
        }
    }
}
