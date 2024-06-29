import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class545 {

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
    public int field7930 = 128;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public int field7928 = 128;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
    public int field7936;

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "I")
    public int field7935;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public int field7925;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public int field7927;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "[B")
    public static byte[] field7924 = new byte[2048];

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
    public static int field7931 = 0;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "[Lf;")
    public static class702[] field7932;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Leba;B)V")
    public final void method3292(class545 arg0, byte arg1) {
        this.field7925 = arg0.field7925;
        this.field7936 = arg0.field7936;
        this.field7930 = arg0.field7930;
        if (arg1 < -47) {
            field7933++;
            this.field7928 = arg0.field7928;
            this.field7927 = arg0.field7927;
            this.field7935 = arg0.field7935;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)Leba;")
    public final class545 method3293(byte arg0) {
        field7929++;
        if (arg0 != 84) {
            this.method3292(null, (byte) 24);
        }
        return new class545(this.field7936, this.field7928, this.field7930, this.field7925, this.field7927, this.field7935);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)Z")
    public static final boolean method3294(int arg0) {
        field7934++;
        class318 var1 = (class318) class89.field1077.method3465((byte) -98);
        if (var1 == null) {
            return false;
        }
        if (arg0 != -26978) {
            field7924 = null;
        }
        for (int var2 = 0; var2 < var1.field4990; var2++) {
            if (var1.field4989[var2] != null && var1.field4989[var2].field9884 == 0) {
                return false;
            }
            if (var1.field4994[var2] != null && var1.field4994[var2].field9884 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLr;II)V")
    public static final void method3295(byte arg0, class167 arg1, int arg2, int arg3) {
        field7926++;
        if (arg3 < 0 || arg2 < 0 || class96.field1534 == 0 || class559.field8074 == 0) {
            return;
        }
        arg1.method318(class563.field8097, class118.field1896, class96.field1534, class559.field8074);
        arg1.method352(class101.field1678, class464.field6927, class96.field1534, class559.field8074);
        class393 var4 = arg1.method272();
        var4.method497(class355.field5669, class538.field7859, class550.field7994, class579.field8256, class240.field3808, class391.field6055);
        arg1.method346(var4);
        if (class491.field7187 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method322();
            int var8 = (arg3 - class563.field8097) * var7 / class96.field1534;
            int var9 = (arg2 - class118.field1896) * var7 / class559.field8074;
            int var10 = arg1.method315();
            int var11 = (arg3 - class563.field8097) * var10 / class96.field1534;
            int var12 = (arg2 - class118.field1896) * var10 / class559.field8074;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method500(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method500(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && var20 < class275.field4426 && var22 < class417.field6374) {
                    int var23 = class567.field8141.field9695;
                    if (var23 < 3 && (class690.field9676[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class491.field7187[var23].method477(-1, var21, var19) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class567.field8141.method1841(20744) - 1 << 8) + var19 >> 9;
                        var6 = var21 + (class567.field8141.method1841(20744) - 1 << 8) >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class145.field2450 && (class73.field918 & 0x40) != 0) {
                    class665 var24 = class626.method3656(28613, class198.field3243, class517.field7498);
                    if (var24 == null) {
                        class490.method3001((byte) 116);
                    } else {
                        class652.method3758(var6, -1, class523.field7609, " ->", true, 15, false, false, 0L, var5, class558.field8067);
                    }
                } else {
                    if (class48.field646) {
                        class652.method3758(var6, -1, class122.field1999.method1091(class135.field2206, 1), "", true, 3, false, false, 0L, var5, -1);
                    }
                    class652.method3758(var6, -1, class22.field345, "", true, 6, false, false, 0L, var5, class250.field4004);
                    class661.field9205++;
                }
            }
        }
        if (arg0 < 29) {
            return;
        }
        class433 var25 = class485.field7108;
        for (class468 var26 = (class468) var25.method2754((byte) 108); var26 != null; var26 = (class468) var25.method2759(1486415172)) {
            if ((class472.field6983 || class567.field8141.field9695 == var26.field6949.field9695) && var26.method2908(0, arg2, arg3, arg1)) {
                boolean var27 = false;
                boolean var28 = false;
                int var29;
                int var30;
                if ((var26.field6949 instanceof class459)) {
                    var30 = ((class459) var26.field6949).field6869;
                    var29 = ((class459) var26.field6949).field6865;
                } else {
                    var29 = var26.field6949.field9696 >> 9;
                    var30 = var26.field6949.field9705 >> 9;
                }
                if (var26.field6949 instanceof class304) {
                    class304 var31 = (class304) var26.field6949;
                    int var32 = var31.method1841(20744);
                    if ((var32 & 0x1) == 0 && (var31.field9696 & 0x1FF) == 0 && (var31.field9705 & 0x1FF) == 0 || (var32 & 0x1) == 1 && (var31.field9696 & 0x1FF) == 256 && (var31.field9705 & 0x1FF) == 256) {
                        int var33 = var31.field9696 - (var31.method1841(20744) - 1 << 8);
                        int var34 = var31.field9705 - (var31.method1841(20744) - 1 << 8);
                        for (int var35 = 0; var35 < class283.field4523; var35++) {
                            class348 var42 = (class348) class592.field8395.method1558((long) class102.field1690[var35], (byte) -93);
                            if (var42 != null) {
                                class589 var43 = var42.field5577;
                                if (class562.field8084 != var43.field4227 && var43.field4180) {
                                    int var44 = var43.field9696 - (var43.field8354.field9949 - 1 << 8);
                                    int var45 = var43.field9705 - (var43.field8354.field9949 - 1 << 8);
                                    if (var33 <= var44 && var43.field8354.field9949 <= (var31.method1841(20744) - (var44 - var33 >> 9)) && var34 <= var45 && var43.field8354.field9949 <= var31.method1841(20744) - (var45 - var34 >> 9)) {
                                        class9.method194(var43, class567.field8141.field9695 != var26.field6949.field9695, 1);
                                        var43.field4227 = class562.field8084;
                                    }
                                }
                            }
                        }
                        int var36 = class99.field1607;
                        int[] var37 = class359.field5700;
                        for (int var38 = 0; var38 < var36; var38++) {
                            class304 var39 = class597.field8465[var37[var38]];
                            if (var39 != null && class562.field8084 != var39.field4227 && var31 != var39 && var39.field4180) {
                                int var40 = var39.field9696 - (var39.method1841(20744) - 1 << 8);
                                int var41 = var39.field9705 - (var39.method1841(20744) - 1 << 8);
                                if (var33 <= var40 && var39.method1841(20744) <= (var31.method1841(20744) - (var40 - var33 >> 9)) && var41 >= var34 && var39.method1841(20744) <= var31.method1841(20744) - (var41 - var34 >> 9)) {
                                    class235.method1700(class567.field8141.field9695 != var26.field6949.field9695, (byte) -94, var39);
                                    var39.field4227 = class562.field8084;
                                }
                            }
                        }
                    }
                    if (class562.field8084 == var31.field4227) {
                        continue;
                    }
                    class235.method1700(class567.field8141.field9695 != var26.field6949.field9695, (byte) -107, var31);
                    var31.field4227 = class562.field8084;
                }
                if (var26.field6949 instanceof class589) {
                    class589 var46 = (class589) var26.field6949;
                    if (var46.field8354 != null) {
                        if ((var46.field8354.field9949 & 0x1) == 0 && (var46.field9696 & 0x1FF) == 0 && (var46.field9705 & 0x1FF) == 0 || (var46.field8354.field9949 & 0x1) == 1 && (var46.field9696 & 0x1FF) == 256 && (var46.field9705 & 0x1FF) == 256) {
                            int var47 = var46.field9696 - (var46.field8354.field9949 - 1 << 8);
                            int var48 = var46.field9705 - (var46.field8354.field9949 - 1 << 8);
                            for (int var49 = 0; var49 < class283.field4523; var49++) {
                                class348 var56 = (class348) class592.field8395.method1558((long) class102.field1690[var49], (byte) -93);
                                if (var56 != null) {
                                    class589 var57 = var56.field5577;
                                    if (class562.field8084 != var57.field4227 && var46 != var57 && var57.field4180) {
                                        int var58 = var57.field9696 - (var57.field8354.field9949 - 1 << 8);
                                        int var59 = var57.field9705 - (var57.field8354.field9949 - 1 << 8);
                                        if (var58 >= var47 && var46.field8354.field9949 - (var58 - var47 >> 9) >= var57.field8354.field9949 && var48 <= var59 && var57.field8354.field9949 <= var46.field8354.field9949 - (var59 - var48 >> 9)) {
                                            class9.method194(var57, class567.field8141.field9695 != var26.field6949.field9695, 1);
                                            var57.field4227 = class562.field8084;
                                        }
                                    }
                                }
                            }
                            int var50 = class99.field1607;
                            int[] var51 = class359.field5700;
                            for (int var52 = 0; var52 < var50; var52++) {
                                class304 var53 = class597.field8465[var51[var52]];
                                if (var53 != null && class562.field8084 != var53.field4227 && var53.field4180) {
                                    int var54 = var53.field9696 - (var53.method1841(20744) - 1 << 8);
                                    int var55 = var53.field9705 - (var53.method1841(20744) - 1 << 8);
                                    if (var47 <= var54 && var53.method1841(20744) <= var46.field8354.field9949 - (var54 - var47 >> 9) && var48 <= var55 && var53.method1841(20744) <= (var46.field8354.field9949 - (var55 - var48 >> 9))) {
                                        class235.method1700(class567.field8141.field9695 != var26.field6949.field9695, (byte) 103, var53);
                                        var53.field4227 = class562.field8084;
                                    }
                                }
                            }
                        }
                        if (class562.field8084 == var46.field4227) {
                            continue;
                        }
                        class9.method194(var46, class567.field8141.field9695 != var26.field6949.field9695, 1);
                        var46.field4227 = class562.field8084;
                    }
                }
                if (var26.field6949 instanceof class211) {
                    int var60 = class612.field8702 + var29;
                    int var61 = var30 + class626.field8855;
                    class138 var62 = (class138) class290.field4590.method1558((long) (var61 << 14 | var26.field6949.field9695 << 28 | var60), (byte) -93);
                    if (var62 != null) {
                        for (class559 var63 = (class559) var62.field2332.method3470(0); var63 != null; var63 = (class559) var62.field2332.method3467(0)) {
                            class117 var64 = class91.field1083.method2859(var63.field8072, (byte) 126);
                            if (class145.field2450 && class567.field8141.field9695 == var26.field6949.field9695) {
                                class638 var65 = class340.field5505 == -1 ? null : class610.field8680.method3566(class340.field5505, -14724);
                                if ((class73.field918 & 0x1) != 0 && (var65 == null || var64.method1054(var65.field8960, -2, class340.field5505) != var65.field8960)) {
                                    class652.method3758(var30, -1, class523.field7609, class289.field4586 + " -> <col=ff9040>" + var64.field1869, true, 23, false, false, (long) var63.field8072, var29, class558.field8067);
                                    class225.field3629++;
                                }
                            }
                            if (class567.field8141.field9695 == var26.field6949.field9695) {
                                String[] var66 = var64.field1811;
                                for (int var67 = 4; var67 >= 0; var67--) {
                                    if (var66 != null && var66[var67] != null) {
                                        byte var68 = 0;
                                        if (var67 == 0) {
                                            var68 = 44;
                                        }
                                        int var69 = class95.field1486;
                                        if (var67 == 1) {
                                            var68 = 21;
                                        }
                                        if (var67 == 2) {
                                            var68 = 13;
                                        }
                                        if (var67 == 3) {
                                            var68 = 30;
                                        }
                                        if (var64.field1865 == var67) {
                                            var69 = var64.field1839;
                                        }
                                        if (var67 == 4) {
                                            var68 = 11;
                                        }
                                        if (var64.field1831 == var67) {
                                            var69 = var64.field1851;
                                        }
                                        class652.method3758(var30, -1, var66[var67], "<col=ff9040>" + var64.field1869, true, var68, false, false, (long) var63.field8072, var29, var69);
                                        class423.field6441++;
                                    }
                                }
                            }
                            class96.field1504++;
                            class652.method3758(var30, -1, class122.field1994.method1091(class135.field2206, 1), "<col=ff9040>" + var64.field1869, true, 1009, false, class567.field8141.field9695 != var26.field6949.field9695, (long) var63.field8072, var29, class163.field2751);
                        }
                    }
                }
                if (var26.field6949 instanceof class302) {
                    class302 var70 = (class302) var26.field6949;
                    class698 var71 = class213.field3537.method94(var70.method394((byte) -127), (byte) -42);
                    if (var71.field9826 != null) {
                        var71 = var71.method3934(class539.field7869, 103);
                    }
                    if (var71 != null) {
                        if (class145.field2450 && class567.field8141.field9695 == var26.field6949.field9695) {
                            class638 var72 = class340.field5505 == -1 ? null : class610.field8680.method3566(class340.field5505, -14724);
                            if ((class73.field918 & 0x4) != 0 && (var72 == null || var71.method3932(class340.field5505, var72.field8960, true) != var72.field8960)) {
                                class338.field5490++;
                                class652.method3758(var30, -1, class523.field7609, class289.field4586 + " -> <col=00ffff>" + var71.field9783, true, 50, false, false, class251.method1784(var70, var30, var29, 5363), var29, class558.field8067);
                            }
                        }
                        if (class567.field8141.field9695 == var26.field6949.field9695) {
                            String[] var73 = var71.field9811;
                            if (var73 != null) {
                                for (int var74 = 4; var74 >= 0; var74--) {
                                    if (var73[var74] != null) {
                                        short var75 = 0;
                                        int var76 = class95.field1486;
                                        if (var74 == 0) {
                                            var75 = 10;
                                        }
                                        if (var74 == 1) {
                                            var75 = 48;
                                        }
                                        if (var74 == 2) {
                                            var75 = 17;
                                        }
                                        if (var74 == 3) {
                                            var75 = 20;
                                        }
                                        if (var74 == 4) {
                                            var75 = 1007;
                                        }
                                        if (var71.field9769 == var74) {
                                            var76 = var71.field9854;
                                        }
                                        if (var71.field9776 == var74) {
                                            var76 = var71.field9773;
                                        }
                                        class652.method3758(var30, -1, var73[var74], "<col=00ffff>" + var71.field9783, true, var75, false, false, class251.method1784(var70, var30, var29, 5363), var29, var76);
                                        class20.field331++;
                                    }
                                }
                            }
                        }
                        class652.method3758(var30, -1, class122.field1994.method1091(class135.field2206, 1), "<col=00ffff>" + var71.field9783, true, 1002, false, class567.field8141.field9695 != var26.field6949.field9695, (long) var71.field9825, var29, class163.field2751);
                        class164.field2755++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)V")
    public static void method3296(byte arg0) {
        field7924 = null;
        field7932 = null;
        int var1 = 70 % ((arg0 + 2) / 47);
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(I)V")
    public class545(int arg0) {
        this.field7936 = arg0;
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(IIIIII)V")
    private class545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7928 = arg1;
        this.field7930 = arg2;
        this.field7935 = arg5;
        this.field7936 = arg0;
        this.field7925 = arg3;
        this.field7927 = arg4;
    }
}
