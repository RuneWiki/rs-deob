import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 extends class113 {

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
    public int field1986 = -1;

    @OriginalMember(owner = "client!ma", name = "ob", descriptor = "I")
    public int field1995 = -1;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    public int field1979 = -1;

    @OriginalMember(owner = "client!ma", name = "rb", descriptor = "I")
    public int field1998 = 99;

    @OriginalMember(owner = "client!ma", name = "Db", descriptor = "I")
    public int field2010 = 5;

    @OriginalMember(owner = "client!ma", name = "xb", descriptor = "I")
    public int field2004 = -1;

    @OriginalMember(owner = "client!ma", name = "wb", descriptor = "Z")
    public boolean field2003 = false;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "I")
    public int field1984 = -1;

    @OriginalMember(owner = "client!ma", name = "Eb", descriptor = "I")
    public int field2011 = 2;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "Lu;")
    public static class135 field1983 = class87.method676((byte) -93, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!ma", name = "nb", descriptor = "[I")
    public static int[] field1994 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "Lu;")
    public static class135 field1987 = class87.method676((byte) -85, "Untersuchen");

    @OriginalMember(owner = "client!ma", name = "pb", descriptor = "I")
    public static int field1996 = 255;

    @OriginalMember(owner = "client!ma", name = "zb", descriptor = "Lu;")
    public static class135 field2006 = class87.method676((byte) -67, "backright1");

    @OriginalMember(owner = "client!ma", name = "yb", descriptor = "Lu;")
    private static class135 field2005 = class87.method676((byte) -90, "button near the top of that page)3");

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "Lu;")
    public static class135 field1988 = field2005;

    @OriginalMember(owner = "client!ma", name = "sb", descriptor = "Lu;")
    public static class135 field1999 = class87.method676((byte) -102, "Versteckt");

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ma", name = "kb", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ma", name = "mb", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!ma", name = "qb", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!ma", name = "tb", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ma", name = "vb", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!ma", name = "Ab", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ma", name = "Cb", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!ma", name = "Fb", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "[I")
    public int[] field1980;

    @OriginalMember(owner = "client!ma", name = "lb", descriptor = "[I")
    private int[] field1992;

    @OriginalMember(owner = "client!ma", name = "ub", descriptor = "[I")
    private int[] field2001;

    @OriginalMember(owner = "client!ma", name = "Bb", descriptor = "[I")
    public int[] field2008;

    @OriginalMember(owner = "client!ma", name = "Gb", descriptor = "[I")
    public int[] field2013;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lna;II)Lna;")
    public final class91 method647(class91 arg0, int arg1, int arg2) {
        field1981++;
        int var4 = this.field2013[arg1];
        class136 var5 = class146.method1198(-65536, var4 >> 16);
        int var6 = var4 & arg2;
        if (var5 == null) {
            return arg0.method686(true);
        } else {
            class91 var7 = arg0.method686(!var5.method1106(var6, -1));
            var7.method687(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIZLna;)Lna;")
    public final class91 method648(int arg0, int arg1, boolean arg2, class91 arg3) {
        field1985++;
        int var5 = this.field2013[arg1];
        class136 var6 = class146.method1198(-65536, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method686(true);
        } else if (arg2) {
            return null;
        } else {
            int var8 = arg0 & 0x3;
            class91 var9 = arg3.method686(!var6.method1106(var7, -1));
            if (var8 == 1) {
                var9.method685();
            } else if (var8 == 2) {
                var9.method693();
            } else if (var8 == 3) {
                var9.method692();
            }
            var9.method687(var6, var7);
            if (var8 == 1) {
                var9.method692();
            } else if (var8 == 2) {
                var9.method693();
            } else if (var8 == 3) {
                var9.method685();
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lna;ZI)Lna;")
    public final class91 method649(class91 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method655(false, 45);
        }
        field2002++;
        int var4 = this.field2013[arg2];
        class136 var5 = class146.method1198(-65536, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method686(true);
        }
        int var7 = 0;
        class136 var8 = null;
        if (this.field2001 != null && this.field2001.length > arg2) {
            int var9 = this.field2001[arg2];
            var8 = class146.method1198(-65536, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class91 var11 = arg0.method686(!var5.method1106(var6, -1));
            var11.method687(var5, var6);
            return var11;
        } else {
            class91 var10 = arg0.method686(!var5.method1106(var6, -1) & !var8.method1106(var7, -1));
            var10.method687(var5, var6);
            var10.method687(var8, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lic;I)V")
    public final void method650(class59 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method480(0);
            if (var3 == 0) {
                field2007++;
                if (arg1 > -32) {
                    field1983 = null;
                    return;
                }
                return;
            }
            this.method657(arg0, var3, 6525);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIII[Lve;II)Z")
    public static final boolean method651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class146[] arg7, int arg8, int arg9) {
        field2012++;
        class70.method573(arg9, arg8, arg2, arg1);
        boolean var10 = true;
        for (int var11 = arg4; var11 < arg7.length; var11++) {
            class146 var12 = arg7[var11];
            if (var12 != null && (var12.field3611 == arg3 || arg3 == -1412584499 && class119.field2828 == var12)) {
                if (var12.field3601 > 0) {
                    class22.method178(var12, arg4);
                }
                int var13 = var12.field3669 + arg8 - arg6;
                int var14 = var12.field3575 + arg9 - arg0;
                int var15 = var12.field3663;
                if (class119.field2828 == var12) {
                    if (arg3 != -1412584499 && !var12.field3656) {
                        class12.field276 = arg6 - arg8;
                        class62.field1558 = arg7;
                        class37.field844 = arg0 - arg9;
                        continue;
                    }
                    class146 var16 = class20.method154(var12, (byte) 18);
                    if (var16 == null) {
                        class119.field2828 = null;
                    } else {
                        int var17 = class53.field1278;
                        int var18 = class76.field1798;
                        if (class82.field1928 == 0) {
                            var18 -= 4;
                            var17 -= 4;
                        }
                        if (class82.field1928 == 1) {
                            var18 -= 205;
                            var17 -= 553;
                        }
                        if (class82.field1928 == 2) {
                            var17 -= 17;
                            var18 -= 357;
                        }
                        int var19 = var18 - class4.field109;
                        int var20 = var17 - class97.field2362;
                        int[] var21 = class47.method357(var16, 0);
                        if (var21[0] > var20) {
                            var20 = var21[0];
                        }
                        class146 var22 = class105.field2528[var12.field3595 >> 16][var12.field3611 & 0xFFFF];
                        if (var12.field3623 + var20 > var21[0] + var16.field3623) {
                            var20 = var21[0] + var16.field3623 - var12.field3623;
                        }
                        if (var21[1] > var19) {
                            var19 = var21[1];
                        }
                        if (var12.field3661 + var19 > var21[1] - -var16.field3661) {
                            var19 = var21[1] + var16.field3661 - var12.field3661;
                        }
                        int[] var23 = class47.method357(var22, 0);
                        if (!var12.field3656) {
                            var15 = 128;
                        }
                        int var24 = var20 + var22.field3664 - var23[0];
                        int var25 = var24 - var12.field3575;
                        int var26 = var22.field3671 + var19 - var23[1];
                        int var27 = var26 - var12.field3669;
                        if (var12.field3554 >= var25 && var25 >= -var12.field3554 && var12.field3554 >= var27 && -var12.field3554 <= var27 && !class44.field1082) {
                            var27 = 0;
                            var25 = 0;
                        } else if (var12.field3552 >= class128.field3094 && !class44.field1082) {
                            var25 = 0;
                            var27 = 0;
                        }
                        var13 += var27;
                        var14 += var25;
                    }
                }
                if ((!var12.field3628 || class70.field1718 >= var14 && class70.field1719 >= var13 && class70.field1716 <= var12.field3623 + var14 && class70.field1720 <= var12.field3661 + var13) && (!var12.field3628 || !class77.method618(var12, -1))) {
                    if (var12.field3564 == 0) {
                        if (!var12.field3628 && class77.method618(var12, -1) && !client.method166((byte) -98, arg5, var11)) {
                            continue;
                        }
                        if (!var12.field3628) {
                            if (var12.field3671 > var12.field3619 - var12.field3661) {
                                var12.field3671 = var12.field3619 - var12.field3661;
                            }
                            if (var12.field3671 < 0) {
                                var12.field3671 = 0;
                            }
                        }
                        var10 &= method651(var12.field3664, var13 + var12.field3661, var14 - -var12.field3623, var12.field3595, 0, arg5, var12.field3671, arg7, var13, var14);
                        if (var12.field3574 != null) {
                            var10 &= method651(var12.field3664, var12.field3661 + var13, var14 - -var12.field3623, var12.field3595, 0, arg5, var12.field3671, var12.field3574, var13, var14);
                        }
                        class70.method573(arg9, arg8, arg2, arg1);
                        if (var12.field3619 > var12.field3661 && !var12.field3628) {
                            class23.method189(var12.field3623 + var14, var13, (byte) -10, var12.field3619, var12.field3671, var12.field3661);
                        }
                    }
                    if (var12.field3564 != 1) {
                        if (var12.field3564 == 2) {
                            int var28 = 0;
                            for (int var29 = 0; var29 < var12.field3661; var29++) {
                                for (int var30 = 0; var30 < var12.field3623; var30++) {
                                    int var31 = (var12.field3573 + 32) * var30 + var14;
                                    int var32 = (var12.field3562 + 32) * var29 + var13;
                                    if (var28 < 20) {
                                        var32 += var12.field3637[var28];
                                        var31 += var12.field3570[var28];
                                    }
                                    if (var12.field3597[var28] > 0) {
                                        boolean var34 = false;
                                        boolean var35 = false;
                                        int var36 = var12.field3597[var28] - 1;
                                        if (var31 > class70.field1716 - 32 && class70.field1718 > var31 && class70.field1720 - 32 < var32 && var32 < class70.field1719 || class32.field760 != 0 && class12.field293 == var28) {
                                            class11 var37;
                                            if (class47.field1125 == 1 && class55.field1286 == var28 && class94.field2232 == var12.field3595) {
                                                var37 = class56.method435(false, var12.field3657[var28], 2, var36, (byte) -124, 0);
                                            } else {
                                                var37 = class56.method435(false, var12.field3657[var28], 1, var36, (byte) -116, 3153952);
                                            }
                                            if (var37 == null) {
                                                var10 = false;
                                            } else if (class32.field760 != 0 && class12.field293 == var28 && class32.field749 == var12.field3595) {
                                                int var38 = class76.field1798 - class69.field1695;
                                                int var39 = class53.field1278 - class68.field1656;
                                                if (var39 < 5 && var39 > -5) {
                                                    var39 = 0;
                                                }
                                                if (var38 < 5 && var38 > -5) {
                                                    var38 = 0;
                                                }
                                                if (class14.field314 < 5) {
                                                    var39 = 0;
                                                    var38 = 0;
                                                }
                                                var37.method64(var31 + var39, var32 + var38, 128);
                                                if (arg3 != -1) {
                                                    class146 var40 = arg7[arg3 & 0xFFFF];
                                                    if (var32 + var38 < class70.field1720 && var40.field3671 > 0) {
                                                        int var41 = (class70.field1720 - var32 - var38) * class20.field452 / 3;
                                                        if (var41 > class20.field452 * 10) {
                                                            var41 = class20.field452 * 10;
                                                        }
                                                        if (var41 > var40.field3671) {
                                                            var41 = var40.field3671;
                                                        }
                                                        var40.field3671 -= var41;
                                                        class69.field1695 += var41;
                                                    }
                                                    if (class70.field1719 < var38 + var32 + 32 && var40.field3619 - var40.field3661 > var40.field3671) {
                                                        int var42 = (var32 + var38 + 32 - class70.field1719) * class20.field452 / 3;
                                                        if (class20.field452 * 10 < var42) {
                                                            var42 = class20.field452 * 10;
                                                        }
                                                        if (var40.field3619 - var40.field3671 - var40.field3661 < var42) {
                                                            var42 = var40.field3619 - var40.field3671 - var40.field3661;
                                                        }
                                                        var40.field3671 += var42;
                                                        class69.field1695 -= var42;
                                                    }
                                                }
                                            } else if (class107.field2568 != 0 && class44.field1079 == var28 && class100.field2415 == var12.field3595) {
                                                var37.method64(var31, var32, 128);
                                            } else {
                                                var37.method76(var31, var32);
                                            }
                                        }
                                    } else if (var12.field3639 != null && var28 < 20) {
                                        class11 var33 = var12.method1196(var28, (byte) 88);
                                        if (var33 != null) {
                                            var33.method76(var31, var32);
                                        } else if (class79.field1863) {
                                            var10 = false;
                                        }
                                    }
                                    var28++;
                                }
                            }
                        } else if (var12.field3564 == 3) {
                            int var43;
                            if (class65.method533(var12, 118)) {
                                var43 = var12.field3620;
                                if (client.method166((byte) 126, arg5, var11) && var12.field3584 != 0) {
                                    var43 = var12.field3584;
                                }
                            } else {
                                var43 = var12.field3635;
                                if (client.method166((byte) 121, arg5, var11) && var12.field3590 != 0) {
                                    var43 = var12.field3590;
                                }
                            }
                            if (var15 == 0) {
                                if (var12.field3641) {
                                    class70.method564(var14, var13, var12.field3623, var12.field3661, var43);
                                } else {
                                    class70.method574(var14, var13, var12.field3623, var12.field3661, var43);
                                }
                            } else if (var12.field3641) {
                                class70.method572(var14, var13, var12.field3623, var12.field3661, var43, 256 - (var15 & 0xFF));
                            } else {
                                class70.method559(var14, var13, var12.field3623, var12.field3661, var43, 256 - (var15 & 0xFF));
                            }
                        } else if (var12.field3564 == 4) {
                            class18 var44 = var12.method1207(arg4 + 1);
                            if (var44 != null) {
                                class135 var45 = var12.field3568;
                                int var46;
                                if (class65.method533(var12, 114)) {
                                    var46 = var12.field3620;
                                    if (client.method166((byte) 120, arg5, var11) && var12.field3584 != 0) {
                                        var46 = var12.field3584;
                                    }
                                    if (var12.field3653.method1063(-64) > 0) {
                                        var45 = var12.field3653;
                                    }
                                } else {
                                    var46 = var12.field3635;
                                    if (client.method166((byte) 123, arg5, var11) && var12.field3590 != 0) {
                                        var46 = var12.field3590;
                                    }
                                }
                                if (var12.field3628 && var12.field3618 != -1) {
                                    class94 var47 = class41.method306(-95, var12.field3618);
                                    var45 = var47.field2284;
                                    if (var45 == null) {
                                        var45 = class90.field2113;
                                    }
                                    if ((var47.field2272 == 1 || var12.field3582 != 1) && var12.field3582 != -1) {
                                        var45 = class107.method867(arg4 ^ 0x2, new class135[] { var45, class108.field2611, class62.method520(var12.field3582, arg4 - 8) });
                                    }
                                }
                                if (class104.field2507 == var12.field3595 && class46.field1107 == var12.field3580) {
                                    var46 = var12.field3635;
                                    var45 = class151.field3732;
                                }
                                if (class70.field1717 == 479) {
                                    if (var46 == 16776960) {
                                        var46 = 255;
                                    }
                                    if (var46 == 49152) {
                                        var46 = 16777215;
                                    }
                                }
                                class135 var48 = class120.method956(false, var12, var45);
                                var44.method124(var48, var14, var13, var12.field3623, var12.field3661, var46, var12.field3549, var12.field3649, var12.field3666, var12.field3591);
                            } else if (class79.field1863) {
                                var10 = false;
                            }
                        } else if (var12.field3564 == 5) {
                            if (var12.field3628) {
                                class11 var50;
                                if (var12.field3618 == -1) {
                                    var50 = var12.method1195(2, false);
                                } else {
                                    var50 = class56.method435(false, var12.field3582, var12.field3629, var12.field3618, (byte) -123, var12.field3606);
                                }
                                if (var50 != null) {
                                    int var51 = var50.field265;
                                    int var52 = var50.field269;
                                    if (var12.field3599) {
                                        int[] var53 = new int[4];
                                        int var54 = var14;
                                        class70.method571(var53);
                                        if (var14 < var53[0]) {
                                            var54 = var53[0];
                                        }
                                        int var55 = var13;
                                        int var56 = var12.field3623 + var14;
                                        int var57 = var13 + var12.field3661;
                                        if (var13 < var53[1]) {
                                            var55 = var53[1];
                                        }
                                        if (var53[2] < var56) {
                                            var56 = var53[2];
                                        }
                                        if (var57 > var53[3]) {
                                            var57 = var53[3];
                                        }
                                        class70.method573(var54, var55, var56, var57);
                                        int var58 = (var52 + var12.field3623 - 1) / var52;
                                        int var59 = (var12.field3661 + var51 - 1) / var51;
                                        for (int var60 = 0; var60 < var58; var60++) {
                                            for (int var61 = 0; var61 < var59; var61++) {
                                                if (var12.field3600 != 0) {
                                                    var50.method79(var52 / 2 + var52 * var60 + var14, var51 / 2 + var51 * var61 + var13, var12.field3600, 4096);
                                                } else if (var15 == 0) {
                                                    var50.method76(var14 + var52 * var60, var51 * var61 + var13);
                                                } else {
                                                    var50.method64(var52 * var60 + var14, var51 * var61 + var13, 256 - (var15 & 0xFF));
                                                }
                                            }
                                        }
                                        class70.method565(var53);
                                    } else {
                                        int var62 = var12.field3623 * 4096 / var52;
                                        if (var12.field3600 != 0) {
                                            var50.method79(var14 + var12.field3623 / 2, var12.field3661 / 2 + var13, var12.field3600, var62);
                                        } else if (var15 != 0) {
                                            var50.method71(var14, var13, var12.field3623, var12.field3661, 256 - (var15 & 0xFF));
                                        } else if (var12.field3623 == var52 && var12.field3661 == var51) {
                                            var50.method76(var14, var13);
                                        } else {
                                            var50.method82(var14, var13, var12.field3623, var12.field3661);
                                        }
                                    }
                                } else if (class79.field1863) {
                                    var10 = false;
                                }
                            } else {
                                class11 var49 = var12.method1195(arg4 + 2, class65.method533(var12, 119));
                                if (var49 != null) {
                                    var49.method76(var14, var13);
                                } else if (class79.field1863) {
                                    var10 = false;
                                }
                            }
                        } else if (var12.field3564 == 6) {
                            boolean var63 = class65.method533(var12, 120);
                            int var64 = 0;
                            class91 var65 = null;
                            int var66;
                            if (var63) {
                                var66 = var12.field3558;
                            } else {
                                var66 = var12.field3624;
                            }
                            if (var12.field3618 != -1) {
                                class94 var68 = class41.method306(-81, var12.field3618);
                                if (var68 != null) {
                                    class94 var69 = var68.method767(var12.field3582, -116);
                                    var65 = var69.method774(arg4 ^ 0xFFFFFFA5, 1);
                                    if (var65 == null) {
                                        var10 = false;
                                    } else {
                                        var65.method702();
                                        var64 = var65.field3495 / 2;
                                    }
                                }
                            } else if (var12.field3551 == 5) {
                                if (var12.field3625 == 0) {
                                    var65 = class128.field3089.method209(arg4 - 110, -1, null, null, -1);
                                } else {
                                    var65 = class116.field2789.method273((byte) -2);
                                }
                            } else if (var66 == -1) {
                                var65 = var12.method1204(-1, var63, ~arg4, null, class116.field2789.field3526);
                                if (var65 == null && class79.field1863) {
                                    var10 = false;
                                }
                            } else {
                                class84 var67 = class17.method108(var66, 0);
                                var65 = var12.method1204(var12.field3614, var63, -1, var67, class116.field2789.field3526);
                                if (var65 == null && class79.field1863) {
                                    var10 = false;
                                }
                            }
                            class51.method396(var12.field3623 / 2 + var14, var12.field3661 / 2 + var13);
                            int var70 = class51.field1213[var12.field3654] * var12.field3655 >> 16;
                            int var71 = class51.field1203[var12.field3654] * var12.field3655 >> 16;
                            if (var65 != null) {
                                if (var12.field3628) {
                                    var65.method702();
                                    if (var12.field3559) {
                                        var65.method703(0, var12.field3593, var12.field3581, var12.field3654, var12.field3589, var64 + var70 + var12.field3607, var12.field3607 + var71, var12.field3655);
                                    } else {
                                        var65.method699(0, var12.field3593, var12.field3581, var12.field3654, var12.field3589, var70 + var64 + var12.field3607, var71 - -var12.field3607);
                                    }
                                } else {
                                    var65.method699(0, var12.field3593, 0, var12.field3654, 0, var70, var71);
                                }
                            }
                            class51.method394();
                        } else {
                            if (var12.field3564 == 7) {
                                class18 var72 = var12.method1207(1);
                                if (var72 == null) {
                                    if (class79.field1863) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var73 = 0;
                                for (int var74 = 0; var74 < var12.field3661; var74++) {
                                    for (int var75 = 0; var75 < var12.field3623; var75++) {
                                        if (var12.field3597[var73] > 0) {
                                            class94 var76 = class41.method306(-79, var12.field3597[var73] - 1);
                                            class135 var77 = var76.field2284;
                                            if (var77 == null) {
                                                var77 = class90.field2113;
                                            }
                                            if (var76.field2272 == 1 || var12.field3657[var73] != 1) {
                                                var77 = class107.method867(arg4 ^ 0x2, new class135[] { var77, class108.field2611, class62.method520(var12.field3657[var73], -8) });
                                            }
                                            int var78 = var14 + (var12.field3573 + 115) * var75;
                                            int var79 = var13 + (var12.field3562 + 12) * var74;
                                            if (var12.field3649 == 0) {
                                                var72.method137(var77, var78, var79, var12.field3635, var12.field3549);
                                            } else if (var12.field3649 == 1) {
                                                var72.method130(var77, var12.field3623 / 2 + var78, var79, var12.field3635, var12.field3549);
                                            } else {
                                                var72.method117(var77, var12.field3623 + var78 - 1, var79, var12.field3635, var12.field3549);
                                            }
                                        }
                                        var73++;
                                    }
                                }
                            }
                            if (var12.field3564 == 8 && class68.method546(var11, arg5, (byte) -117) && class60.field1533 == class52.field1231) {
                                int var80 = 0;
                                int var81 = 0;
                                class135 var82 = var12.field3568;
                                class18 var83 = class93.field2200;
                                class135 var84 = class120.method956(false, var12, var82);
                                while (var84.method1063(-64) > 0) {
                                    int var92 = var84.method1090((byte) 64, class40.field938);
                                    class135 var93;
                                    if (var92 == -1) {
                                        var93 = var84;
                                        var84 = class113.field2742;
                                    } else {
                                        var93 = var84.method1074(0, var92, arg4 ^ 0xFFFF962E);
                                        var84 = var84.method1065((byte) -60, var92 + 2);
                                    }
                                    int var94 = var83.method120(var93);
                                    if (var94 > var80) {
                                        var80 = var94;
                                    }
                                    var81 += var83.field394 + 1;
                                }
                                var80 += 6;
                                int var85 = var12.field3623 + var14 - var80 - 5;
                                if (var85 < var14 + 5) {
                                    var85 = var14 + 5;
                                }
                                var81 += 7;
                                if (var80 + var85 > arg2) {
                                    var85 = arg2 - var80;
                                }
                                int var86 = var13 + var12.field3661 + 5;
                                if (var81 + var86 > arg1) {
                                    var86 = arg1 - var81;
                                }
                                class70.method564(var85, var86, var80, var81, 16777120);
                                class70.method574(var85, var86, var80, var81, 0);
                                class135 var87 = var12.field3568;
                                int var88 = var83.field394 + var86 + 2;
                                class135 var89 = class120.method956(false, var12, var87);
                                while (var89.method1063(arg4 - 64) > 0) {
                                    int var90 = var89.method1090((byte) 64, class40.field938);
                                    class135 var91;
                                    if (var90 == -1) {
                                        var91 = var89;
                                        var89 = class113.field2742;
                                    } else {
                                        var91 = var89.method1074(0, var90, -27090);
                                        var89 = var89.method1065((byte) -119, var90 + 2);
                                    }
                                    var83.method137(var91, var85 + 3, var88, 0, false);
                                    var88 += var83.field394 + 1;
                                }
                            }
                            if (var12.field3564 == 9) {
                                if (var12.field3603 == 1) {
                                    class70.method563(var14, var13, var12.field3623 + var14, var13 - -var12.field3661, var12.field3635);
                                } else {
                                    int var95 = var12.field3623 >= 0 ? var12.field3623 : -var12.field3623;
                                    int var96 = var12.field3661 >= 0 ? var12.field3661 : -var12.field3661;
                                    int var97 = var95;
                                    if (var95 < var96) {
                                        var97 = var96;
                                    }
                                    if (var97 != 0) {
                                        int var98 = (var12.field3623 << 16) / var97;
                                        int var99 = (var12.field3661 << 16) / var97;
                                        if (var98 >= var99) {
                                            var98 = -var98;
                                        } else {
                                            var99 = -var99;
                                        }
                                        int var100 = var12.field3603 * var99 >> 17;
                                        int var101 = var12.field3603 * var99 + 1 >> 17;
                                        int var102 = var12.field3603 * var98 >> 17;
                                        int var103 = var14 - var101;
                                        int var104 = var14 + var100;
                                        int var105 = var14 + var12.field3623 + var100;
                                        int var106 = var13 + var102;
                                        int var107 = var14 + var12.field3623 - var101;
                                        int var108 = var12.field3603 * var98 + 1 >> 17;
                                        int var109 = var12.field3661 + var13 + var102;
                                        int var110 = var13 + var12.field3661 - var108;
                                        class51.method393(var104, var103, var107);
                                        int var111 = var13 - var108;
                                        class51.method388(var106, var111, var110, var104, var103, var107, var12.field3635);
                                        class51.method393(var104, var107, var105);
                                        class51.method388(var106, var110, var109, var104, var107, var105, var12.field3635);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lna;II)Lna;")
    public final class91 method652(class91 arg0, int arg1, int arg2) {
        int var4 = this.field2013[arg2];
        field1982++;
        if (arg1 != 1) {
            return null;
        }
        class136 var5 = class146.method1198(-65536, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method705(true);
        } else {
            class91 var7 = arg0.method705(!var5.method1106(var6, -1));
            var7.method687(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIILna;Lma;)Lna;")
    public final class91 method653(int arg0, int arg1, int arg2, class91 arg3, class84 arg4) {
        field1989++;
        int var6 = this.field2013[arg0];
        if (arg2 != -5926) {
            return null;
        }
        class136 var7 = class146.method1198(arg2 ^ 0xE8DA, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method647(arg3, arg1, 65535);
        }
        int var9 = arg4.field2013[arg1];
        class136 var10 = class146.method1198(-65536, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class91 var12 = arg3.method686(!var7.method1106(var8, -1));
            var12.method687(var7, var8);
            return var12;
        } else {
            class91 var13 = arg3.method686(!var7.method1106(var8, -1) & !var10.method1106(var11, -1));
            var13.method697(var7, var8, var10, var11, this.field1992);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
    public static void method654(int arg0) {
        field2005 = null;
        field1983 = null;
        int var1 = -71 / ((-arg0 - 21) / 62);
        field1999 = null;
        field1988 = null;
        field1994 = null;
        field1987 = null;
        field2006 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)Lu;")
    public static final class135 method655(boolean arg0, int arg1) {
        if (arg0) {
            field1990++;
            return class107.method867(2, new class135[] { class68.method547(-1, arg1 >> 24 & 0xFF), class30.field722, class68.method547(-1, arg1 >> 16 & 0xFF), class30.field722, class68.method547(-1, arg1 >> 8 & 0xFF), class30.field722, class68.method547(-1, arg1 & 0xFF) });
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
    public final void method656(int arg0) {
        if (arg0 >= -76) {
            this.field2001 = null;
        }
        if (this.field1986 == -1) {
            if (this.field1992 == null) {
                this.field1986 = 0;
            } else {
                this.field1986 = 2;
            }
        }
        if (this.field2004 == -1) {
            if (this.field1992 == null) {
                this.field2004 = 0;
            } else {
                this.field2004 = 2;
            }
        }
        field1997++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lic;II)V")
    private final void method657(class59 arg0, int arg1, int arg2) {
        field2009++;
        if (arg2 != 6525) {
            return;
        }
        if (arg1 == 1) {
            int var11 = arg0.method480(0);
            this.field2008 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2008[var12] = arg0.method483((byte) 24);
            }
            this.field2013 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field2013[var13] = arg0.method483((byte) 24);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field2013[var14] += arg0.method483((byte) 24) << 16;
            }
        } else if (arg1 == 2) {
            this.field1984 = arg0.method483((byte) 24);
        } else if (arg1 == 3) {
            int var9 = arg0.method480(0);
            this.field1992 = new int[var9 + 1];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1992[var10] = arg0.method480(arg2 - 6525);
            }
            this.field1992[var9] = 9999999;
        } else if (arg1 == 4) {
            this.field2003 = true;
        } else if (arg1 == 5) {
            this.field2010 = arg0.method480(0);
        } else if (arg1 == 6) {
            this.field1995 = arg0.method483((byte) 24);
        } else if (arg1 == 7) {
            this.field1979 = arg0.method483((byte) 24);
        } else if (arg1 == 8) {
            this.field1998 = arg0.method480(arg2 ^ 0x197D);
        } else if (arg1 == 9) {
            this.field2004 = arg0.method480(0);
        } else if (arg1 == 10) {
            this.field1986 = arg0.method480(arg2 ^ 0x197D);
        } else if (arg1 == 11) {
            this.field2011 = arg0.method480(0);
        } else if (arg1 == 12) {
            int var4 = arg0.method480(0);
            this.field2001 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2001[var5] = arg0.method483((byte) 24);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2001[var6] += arg0.method483((byte) 24) << 16;
            }
            return;
        } else if (arg1 == 13) {
            int var7 = arg0.method480(0);
            this.field1980 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1980[var8] = arg0.method455(true);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lg;I)V")
    public static final void method658(class43 arg0, int arg1) {
        if (arg1 == -6898) {
            class15.field358 = arg0;
            field2000++;
        }
    }
}
