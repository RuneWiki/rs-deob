import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public abstract class class471 extends class693 {

    @OriginalMember(owner = "client!lv", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field7213 = new String[] { method3625(method3624("\u001b\u0011=7\u001b")), method3625(method3624("\u001b\u0011=[Z\u0019\u000egY\u001b")), method3625(method3624("\u001b\u0011=,\u001b")), method3625(method3624("\fI=IN")), method3625(method3624("\u001b\u0011=#\u001b")), method3625(method3624("\u0019\u0012\u007f\u000b")), method3625(method3624("\u001b\u0011=4\u001b")), method3625(method3624("\u001b\u0011=3\u001b")), method3625(method3624("\u001b\u0011=.\u001b")), method3625(method3624("9\u0012\u007f\u000b")), method3625(method3624("K\u0004|\u000b\u000e\u0011\u0001u\u0001U\u0011Y")), method3625(method3624("\u001b\u0011=%\u001b")), method3625(method3624("\u001b\u0011=\"\u001b")), method3625(method3624("\u001b\u0011=-\u001b")), method3625(method3624("\u001b\u0011=+\u001b")) };

    @OriginalMember(owner = "client!lv", name = "E", descriptor = "Lhl;")
    public static class556 field7202 = new class556(101, 4);

    @OriginalMember(owner = "client!lv", name = "A", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!lv", name = "y", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!lv", name = "C", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!lv", name = "F", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!lv", name = "H", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!lv", name = "I", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!lv", name = "B", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!lv", name = "G", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!lv", name = "D", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!lv", name = "z", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "(I)Z")
    public final boolean method53(int arg0) {
        try {
            ++field7210;
            if (arg0 != 47) {
                field7202 = null;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7213[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "(B)V")
    public final void method50(byte arg0) {
        try {
            if (arg0 >= -41) {
                field7202 = null;
            }
            ++field7204;
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7213[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZILha;ILrda;II)V")
    public final void method48(boolean arg0, int arg1, class63 arg2, int arg3, class693 arg4, int arg5, int arg6) {
        try {
            if (arg5 >= -10) {
                this.method48(false, -53, (class63) null, 24, (class693) null, 23, 49);
            }
            ++field7208;
            throw new IllegalStateException();
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7213[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7213[3] : field7213[5]) + ',' + arg3 + ',' + (arg4 != null ? field7213[3] : field7213[5]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(IIIII)V")
    public class471(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            super.field9985 = arg0;
            super.field9974 = (byte) arg4;
            super.field9972 = arg1;
            super.field9983 = arg2;
            super.field9975 = (byte) arg3;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7213[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IILmk;I)V")
    public static final void method3620(int arg0, int arg1, class59 arg2, int arg3) {
        try {
            ++field7212;
            if (arg2 != null && class439.field6858.field6307 != arg2) {
                int var4 = arg2.field769;
                int var5 = arg2.field776;
                if (arg3 != 0) {
                    method3622(68);
                }
                int var6 = arg2.field773;
                int var7 = (int) arg2.field762;
                if (var6 >= 2000) {
                    var6 -= 2000;
                }
                long var8 = arg2.field762;
                if (~var6 == -51) {
                    class735.field10782 = arg1;
                    ++class362.field5871;
                    class438.field6845 = 0;
                    class359.field5799 = 2;
                    class203.field3192 = arg0;
                    class487 var10 = class618.method4519(43, class68.field959, class185.field2948.field2659);
                    var10.field7362.method1631(class397.field6289 + var4, -25924);
                    var10.field7362.method1640(arg3 ^ -571594296, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                    var10.field7362.method1650((byte) -95, var5 - -class141.field2011);
                    var10.field7362.method1678(class196.field3117.method1189(82, 15708) ? 1 : 0, arg3 ^ 65280);
                    class185.field2948.method1546(var10, 1);
                    class571.method4207((byte) 84, var8, var4, var5);
                }
                if (var6 == 1009) {
                    class438.field6845 = 0;
                    class735.field10782 = arg1;
                    class359.field5799 = 2;
                    class203.field3192 = arg0;
                    ++class535.field7854;
                    class487 var11 = class618.method4519(65, class423.field6669, class185.field2948.field2659);
                    var11.field7362.method1678(class196.field3117.method1189(82, arg3 ^ 15708) ? 1 : 0, 65280);
                    var11.field7362.method1639(Integer.MAX_VALUE & (int) (var8 >>> 32), 128);
                    var11.field7362.method1650((byte) -95, class141.field2011 + var5);
                    var11.field7362.method1631(class397.field6289 + var4, -25924);
                    class185.field2948.method1546(var11, 1);
                    class571.method4207((byte) 77, var8, var4, var5);
                }
                if (~var6 == -23 || ~var6 == -1008) {
                    class115.method1144(var7, arg2.field760, var5, -64, var4);
                }
                if (var6 == 49) {
                    class738 var12 = class33.field395[var7];
                    if (var12 != null) {
                        class359.field5799 = 2;
                        class203.field3192 = arg0;
                        class735.field10782 = arg1;
                        ++class324.field5251;
                        class438.field6845 = 0;
                        class487 var13 = class618.method4519(19, class409.field6536, class185.field2948.field2659);
                        var13.field7362.method1639(var7, 128);
                        var13.field7362.method1642(!class196.field3117.method1189(82, 15708) ? 0 : 1, 19654);
                        class185.field2948.method1546(var13, arg3 + 1);
                        class101.method959(0, var12.field1200[0], var12.field1201[0], var12.method804(true), arg3 ^ 626, var12.method804(true), 0, true, -2);
                    }
                }
                if (var6 == 12) {
                    class19 var14 = (class19) class176.field2797.method737((byte) -39, (long) var7);
                    if (var14 != null) {
                        ++class619.field8949;
                        class359.field5799 = 2;
                        class735.field10782 = arg1;
                        class438.field6845 = 0;
                        class426 var15 = var14.field194;
                        class203.field3192 = arg0;
                        class487 var16 = class618.method4519(96, class723.field10614, class185.field2948.field2659);
                        var16.field7362.method1639(var7, arg3 + 128);
                        var16.field7362.method1647(arg3 + -87, class196.field3117.method1189(82, 15708) ? 1 : 0);
                        class185.field2948.method1546(var16, 1);
                        class101.method959(0, var15.field1200[0], var15.field1201[0], var15.method804(true), arg3 ^ 626, var15.method804(true), 0, true, -2);
                    }
                }
                if (var6 == 10) {
                    if (~class264.field4283 < -1 && class196.field3117.method1189(82, 15708) && class196.field3117.method1189(81, 15708)) {
                        class551.method4091(false, class438.field6846.field9975, class141.field2011 + var5, class397.field6289 + var4);
                    } else {
                        class487 var17 = class784.method5641(arg3 + 4268, var5, var4, var7);
                        if (~var7 != -2) {
                            class359.field5799 = 1;
                            class735.field10782 = arg1;
                            class203.field3192 = arg0;
                            class438.field6845 = 0;
                        } else {
                            var17.field7362.method1678(-1, 65280);
                            var17.field7362.method1678(-1, 65280);
                            var17.field7362.method1650((byte) -95, (int) class29.field293);
                            var17.field7362.method1678(57, arg3 ^ 65280);
                            var17.field7362.method1678(class126.field1819, arg3 ^ 65280);
                            var17.field7362.method1678(class85.field1275, arg3 ^ 65280);
                            var17.field7362.method1678(89, arg3 ^ 65280);
                            var17.field7362.method1650((byte) -95, class438.field6846.field9985);
                            var17.field7362.method1650((byte) -95, class438.field6846.field9983);
                            var17.field7362.method1678(63, 65280);
                        }
                        class185.field2948.method1546(var17, arg3 ^ 1);
                        class101.method959(0, var5, var4, 1, 626, 1, 0, true, -4);
                    }
                }
                if (var6 == 30) {
                    class738 var18 = class33.field395[var7];
                    if (var18 != null) {
                        class359.field5799 = 2;
                        class203.field3192 = arg0;
                        class438.field6845 = 0;
                        ++class427.field6736;
                        class735.field10782 = arg1;
                        class487 var19 = class618.method4519(arg3 ^ 75, class793.field11588, class185.field2948.field2659);
                        var19.field7362.method1642(class196.field3117.method1189(82, arg3 + 15708) ? 1 : 0, 19654);
                        var19.field7362.method1631(var7, -25924);
                        class185.field2948.method1546(var19, arg3 + 1);
                        class101.method959(0, var18.field1200[0], var18.field1201[0], var18.method804(true), 626, var18.method804(true), 0, true, -2);
                    }
                }
                if (var6 == 15) {
                    ++class290.field4663;
                    class203.field3192 = arg0;
                    class438.field6845 = 0;
                    class359.field5799 = 1;
                    class735.field10782 = arg1;
                    class487 var20 = class618.method4519(94, class137.field1926, class185.field2948.field2659);
                    var20.field7362.method1650((byte) -95, class167.field2708);
                    var20.field7362.method1650((byte) -95, class397.field6289 + var4);
                    var20.field7362.method1631(class671.field9527, -25924);
                    var20.field7362.method1661(242267307, class626.field9017);
                    var20.field7362.method1639(class141.field2011 - -var5, arg3 ^ 128);
                    class185.field2948.method1546(var20, 1);
                    class101.method959(0, var5, var4, 1, 626, 1, 0, true, -4);
                }
                if (~var6 == -45) {
                    class203.field3192 = arg0;
                    class438.field6845 = 0;
                    ++class104.field1523;
                    class735.field10782 = arg1;
                    class359.field5799 = 2;
                    class487 var21 = class618.method4519(109, class422.field6663, class185.field2948.field2659);
                    var21.field7362.method1631(class141.field2011 + var5, -25924);
                    var21.field7362.method1663(128, class196.field3117.method1189(82, 15708) ? 1 : 0);
                    var21.field7362.method1631(Integer.MAX_VALUE & (int) (var8 >>> 32), arg3 ^ -25924);
                    var21.field7362.method1631(class397.field6289 + var4, arg3 ^ -25924);
                    class185.field2948.method1546(var21, 1);
                    class571.method4207((byte) 67, var8, var4, var5);
                }
                if (~var6 == -5) {
                    class19 var22 = (class19) class176.field2797.method737((byte) -39, (long) var7);
                    if (var22 != null) {
                        ++class199.field3148;
                        class426 var23 = var22.field194;
                        class735.field10782 = arg1;
                        class359.field5799 = 2;
                        class203.field3192 = arg0;
                        class438.field6845 = 0;
                        class487 var24 = class618.method4519(arg3 + 111, class607.field8748, class185.field2948.field2659);
                        var24.field7362.method1650((byte) -95, var7);
                        var24.field7362.method1663(arg3 ^ 128, !class196.field3117.method1189(82, 15708) ? 0 : 1);
                        class185.field2948.method1546(var24, 1);
                        class101.method959(0, var23.field1200[0], var23.field1201[0], var23.method804(true), 626, var23.method804(true), 0, true, -2);
                    }
                }
                if (~var6 == -4) {
                    class19 var25 = (class19) class176.field2797.method737((byte) -39, (long) var7);
                    if (var25 != null) {
                        class438.field6845 = 0;
                        class359.field5799 = 2;
                        class426 var26 = var25.field194;
                        class203.field3192 = arg0;
                        ++class375.field6080;
                        class735.field10782 = arg1;
                        class487 var27 = class618.method4519(67, class386.field6184, class185.field2948.field2659);
                        var27.field7362.method1639(var7, 128);
                        var27.field7362.method1642(class196.field3117.method1189(82, 15708) ? 1 : 0, arg3 ^ 19654);
                        class185.field2948.method1546(var27, 1);
                        class101.method959(0, var26.field1200[0], var26.field1201[0], var26.method804(true), 626, var26.method804(true), 0, true, -2);
                    }
                }
                if (var6 == 46) {
                    class738 var28 = class33.field395[var7];
                    if (var28 != null) {
                        class438.field6845 = 0;
                        ++class517.field7656;
                        class359.field5799 = 2;
                        class735.field10782 = arg1;
                        class203.field3192 = arg0;
                        class487 var29 = class618.method4519(arg3 + 36, class7.field83, class185.field2948.field2659);
                        var29.field7362.method1663(128, class196.field3117.method1189(82, 15708) ? 1 : 0);
                        var29.field7362.method1639(var7, arg3 + 128);
                        class185.field2948.method1546(var29, arg3 + 1);
                        class101.method959(0, var28.field1200[0], var28.field1201[0], var28.method804(true), arg3 + 626, var28.method804(true), 0, true, -2);
                    }
                }
                if (~var6 == -14) {
                    class738 var30 = class33.field395[var7];
                    if (var30 != null) {
                        class359.field5799 = 2;
                        class735.field10782 = arg1;
                        class203.field3192 = arg0;
                        ++class165.field2678;
                        class438.field6845 = 0;
                        class487 var31 = class618.method4519(32, class231.field3584, class185.field2948.field2659);
                        var31.field7362.method1647(-52, class196.field3117.method1189(82, 15708) ? 1 : 0);
                        var31.field7362.method1680(class626.field9017, -120);
                        var31.field7362.method1650((byte) -95, var7);
                        var31.field7362.method1640(-571594296, class167.field2708);
                        var31.field7362.method1631(class671.field9527, -25924);
                        class185.field2948.method1546(var31, arg3 + 1);
                        class101.method959(0, var30.field1200[0], var30.field1201[0], var30.method804(true), arg3 + 626, var30.method804(true), 0, true, -2);
                    }
                }
                if (~var6 == -54) {
                    class683 var32 = class454.method3528(0, var4, var5);
                    if (var32 != null) {
                        class318.method2729(22906);
                        class445 var33 = client.method2695(var32);
                        class404.method3242(var32, var33.field6920, 4913, var33.method3481(arg3 + 113));
                        class480.field7309 = class670.method4857(0, var32);
                        class304.field4915 = var32.field9724 + field7213[10];
                        if (class480.field7309 == null) {
                            class480.field7309 = field7213[9];
                        }
                    }
                } else {
                    if (var6 == 59) {
                        class19 var34 = (class19) class176.field2797.method737((byte) -39, (long) var7);
                        if (var34 != null) {
                            class735.field10782 = arg1;
                            class359.field5799 = 2;
                            class426 var35 = var34.field194;
                            ++class610.field8794;
                            class203.field3192 = arg0;
                            class438.field6845 = 0;
                            class487 var36 = class618.method4519(53, class439.field6854, class185.field2948.field2659);
                            var36.field7362.method1631(var7, arg3 ^ -25924);
                            var36.field7362.method1642(class196.field3117.method1189(82, arg3 + 15708) ? 1 : 0, 19654);
                            var36.field7362.method1680(class626.field9017, -125);
                            var36.field7362.method1639(class671.field9527, arg3 + 128);
                            var36.field7362.method1631(class167.field2708, arg3 + -25924);
                            class185.field2948.method1546(var36, 1);
                            class101.method959(0, var35.field1200[0], var35.field1201[0], var35.method804(true), 626, var35.method804(true), 0, true, -2);
                        }
                    }
                    if (~var6 == -9) {
                        class738 var37 = class33.field395[var7];
                        if (var37 != null) {
                            class438.field6845 = 0;
                            class203.field3192 = arg0;
                            class359.field5799 = 2;
                            class735.field10782 = arg1;
                            ++class65.field898;
                            class487 var38 = class618.method4519(arg3 ^ 26, class389.field6212, class185.field2948.field2659);
                            var38.field7362.method1631(var7, -25924);
                            var38.field7362.method1678(!class196.field3117.method1189(82, arg3 + 15708) ? 0 : 1, 65280);
                            class185.field2948.method1546(var38, 1);
                            class101.method959(0, var37.field1200[0], var37.field1201[0], var37.method804(true), arg3 ^ 626, var37.method804(true), 0, true, -2);
                        }
                    }
                    if (~var6 == -3) {
                        class203.field3192 = arg0;
                        class735.field10782 = arg1;
                        ++class738.field10802;
                        class438.field6845 = 0;
                        class359.field5799 = 2;
                        class487 var39 = class618.method4519(arg3 + 33, class581.field8373, class185.field2948.field2659);
                        var39.field7362.method1631(class141.field2011 + var5, -25924);
                        var39.field7362.method1631(var7, -25924);
                        var39.field7362.method1631(class397.field6289 + var4, -25924);
                        var39.field7362.method1647(-36, !class196.field3117.method1189(82, 15708) ? 0 : 1);
                        class185.field2948.method1546(var39, arg3 + 1);
                        class95.method921(var4, true, var5);
                    }
                    if (var6 == 57) {
                        class738 var40 = class33.field395[var7];
                        if (var40 != null) {
                            class438.field6845 = 0;
                            class735.field10782 = arg1;
                            ++class206.field3217;
                            class203.field3192 = arg0;
                            class359.field5799 = 2;
                            class487 var41 = class618.method4519(120, class582.field8377, class185.field2948.field2659);
                            var41.field7362.method1639(var7, 128);
                            var41.field7362.method1642(!class196.field3117.method1189(82, 15708) ? 0 : 1, arg3 + 19654);
                            class185.field2948.method1546(var41, 1);
                            class101.method959(0, var40.field1200[0], var40.field1201[0], var40.method804(true), 626, var40.method804(true), 0, true, -2);
                        }
                    }
                    if (var6 == 1002) {
                        class359.field5799 = 2;
                        class203.field3192 = arg0;
                        class438.field6845 = 0;
                        class735.field10782 = arg1;
                        class19 var42 = (class19) class176.field2797.method737((byte) -39, (long) var7);
                        if (var42 != null) {
                            class426 var43 = var42.field194;
                            class162 var44 = var43.field6716;
                            if (var44.field2620 != null) {
                                var44 = var44.method1530(-114, class398.field6315);
                            }
                            if (var44 != null) {
                                ++class489.field7382;
                                class487 var45 = class618.method4519(74, class135.field1913, class185.field2948.field2659);
                                var45.field7362.method1650((byte) -95, var44.field2615);
                                class185.field2948.method1546(var45, 1);
                            }
                        }
                    }
                    if (~var6 == -48) {
                        class19 var46 = (class19) class176.field2797.method737((byte) -39, (long) var7);
                        if (var46 != null) {
                            class426 var47 = var46.field194;
                            class203.field3192 = arg0;
                            class735.field10782 = arg1;
                            ++class328.field5378;
                            class359.field5799 = 2;
                            class438.field6845 = 0;
                            class487 var48 = class618.method4519(21, class395.field6271, class185.field2948.field2659);
                            var48.field7362.method1650((byte) -95, var7);
                            var48.field7362.method1647(-29, !class196.field3117.method1189(82, 15708) ? 0 : 1);
                            class185.field2948.method1546(var48, 1);
                            class101.method959(0, var47.field1200[0], var47.field1201[0], var47.method804(true), arg3 ^ 626, var47.method804(true), 0, true, -2);
                        }
                    }
                    if (var6 == 60) {
                        ++class418.field6608;
                        class203.field3192 = arg0;
                        class735.field10782 = arg1;
                        class438.field6845 = 0;
                        class359.field5799 = 2;
                        class487 var49 = class618.method4519(73, class381.field6131, class185.field2948.field2659);
                        var49.field7362.method1631(class141.field2011 + var5, -25924);
                        var49.field7362.method1639(var7, 128);
                        var49.field7362.method1640(arg3 + -571594296, class397.field6289 + var4);
                        var49.field7362.method1642(!class196.field3117.method1189(82, 15708) ? 0 : 1, 19654);
                        class185.field2948.method1546(var49, arg3 ^ 1);
                        class95.method921(var4, true, var5);
                    }
                    if (var6 == 23) {
                        class359.field5799 = 2;
                        class203.field3192 = arg0;
                        ++class537.field7886;
                        class438.field6845 = 0;
                        class735.field10782 = arg1;
                        class487 var50 = class618.method4519(53, class622.field8980, class185.field2948.field2659);
                        var50.field7362.method1639((int) (var8 >>> 32) & Integer.MAX_VALUE, 128);
                        var50.field7362.method1631(var5 - -class141.field2011, -25924);
                        var50.field7362.method1640(-571594296, class397.field6289 + var4);
                        var50.field7362.method1678(class196.field3117.method1189(82, arg3 ^ 15708) ? 1 : 0, 65280);
                        class185.field2948.method1546(var50, arg3 + 1);
                        class571.method4207((byte) 83, var8, var4, var5);
                    }
                    if (var6 == 20) {
                        class203.field3192 = arg0;
                        class735.field10782 = arg1;
                        ++class109.field1554;
                        class438.field6845 = 0;
                        class359.field5799 = 2;
                        class487 var51 = class618.method4519(104, class32.field375, class185.field2948.field2659);
                        var51.field7362.method1639(var7, 128);
                        var51.field7362.method1631(var4 - -class397.field6289, -25924);
                        var51.field7362.method1647(-29, !class196.field3117.method1189(82, 15708) ? 0 : 1);
                        var51.field7362.method1640(-571594296, class141.field2011 + var5);
                        class185.field2948.method1546(var51, 1);
                        class95.method921(var4, true, var5);
                    }
                    if (~var6 == -49 && class145.field2053 == null) {
                        class116.method1149(var4, -28059, var5);
                        class145.field2053 = class454.method3528(0, var4, var5);
                        class454.method3525((byte) 27, class145.field2053);
                    }
                    if (~var6 == -7) {
                        class738 var52 = class33.field395[var7];
                        if (var52 != null) {
                            ++class65.field898;
                            class438.field6845 = 0;
                            class203.field3192 = arg0;
                            class359.field5799 = 2;
                            class735.field10782 = arg1;
                            class487 var53 = class618.method4519(113, class480.field7303, class185.field2948.field2659);
                            var53.field7362.method1639(var7, arg3 ^ 128);
                            var53.field7362.method1647(-118, class196.field3117.method1189(82, 15708) ? 1 : 0);
                            class185.field2948.method1546(var53, 1);
                            class101.method959(0, var52.field1200[0], var52.field1201[0], var52.method804(true), 626, var52.method804(true), 0, true, -2);
                        }
                    }
                    if (~var6 == -17) {
                        class738 var54 = class33.field395[var7];
                        if (var54 != null) {
                            class735.field10782 = arg1;
                            class359.field5799 = 2;
                            class203.field3192 = arg0;
                            ++class67.field916;
                            class438.field6845 = 0;
                            class487 var55 = class618.method4519(17, class51.field617, class185.field2948.field2659);
                            var55.field7362.method1678(class196.field3117.method1189(82, 15708) ? 1 : 0, arg3 ^ 65280);
                            var55.field7362.method1639(var7, 128);
                            class185.field2948.method1546(var55, 1);
                            class101.method959(0, var54.field1200[0], var54.field1201[0], var54.method804(true), arg3 + 626, var54.method804(true), 0, true, -2);
                        }
                    }
                    if (var6 == 21) {
                        class738 var56 = class33.field395[var7];
                        if (var56 != null) {
                            class203.field3192 = arg0;
                            class359.field5799 = 2;
                            ++class388.field6191;
                            class735.field10782 = arg1;
                            class438.field6845 = 0;
                            class487 var57 = class618.method4519(31, class747.field11030, class185.field2948.field2659);
                            var57.field7362.method1640(-571594296, var7);
                            var57.field7362.method1663(128, !class196.field3117.method1189(82, 15708) ? 0 : 1);
                            class185.field2948.method1546(var57, 1);
                            class101.method959(0, var56.field1200[0], var56.field1201[0], var56.method804(true), 626, var56.method804(true), 0, true, -2);
                        }
                    }
                    if (~var6 == -1007 || ~var6 == -1009 || var6 == 1011 || ~var6 == -1013 || var6 == 1004) {
                        class439.method3445(var6, var4, (byte) -94, var7);
                    }
                    if (var6 == 1001) {
                        class203.field3192 = arg0;
                        ++class341.field5568;
                        class735.field10782 = arg1;
                        class438.field6845 = 0;
                        class359.field5799 = 2;
                        class487 var58 = class618.method4519(85, class426.field6711, class185.field2948.field2659);
                        var58.field7362.method1650((byte) -95, var7);
                        class185.field2948.method1546(var58, 1);
                    }
                    if (var6 == 45) {
                        class203.field3192 = arg0;
                        class359.field5799 = 2;
                        class438.field6845 = 0;
                        class735.field10782 = arg1;
                        ++class133.field1892;
                        class487 var59 = class618.method4519(arg3 ^ 116, class786.field11493, class185.field2948.field2659);
                        var59.field7362.method1631(var4 - -class397.field6289, -25924);
                        var59.field7362.method1639((int) (var8 >>> 32) & Integer.MAX_VALUE, 128);
                        var59.field7362.method1639(class141.field2011 + var5, 128);
                        var59.field7362.method1639(class167.field2708, 128);
                        var59.field7362.method1650((byte) -95, class671.field9527);
                        var59.field7362.method1641((byte) -108, class626.field9017);
                        var59.field7362.method1642(!class196.field3117.method1189(82, 15708) ? 0 : 1, 19654);
                        class185.field2948.method1546(var59, 1);
                        class571.method4207((byte) 61, var8, var4, var5);
                    }
                    if (~var6 == -20) {
                        class738 var60 = class33.field395[var7];
                        if (var60 != null) {
                            class359.field5799 = 2;
                            class438.field6845 = 0;
                            class203.field3192 = arg0;
                            ++class393.field6258;
                            class735.field10782 = arg1;
                            class487 var61 = class618.method4519(124, class157.field2167, class185.field2948.field2659);
                            var61.field7362.method1640(-571594296, var7);
                            var61.field7362.method1647(-27, !class196.field3117.method1189(82, 15708) ? 0 : 1);
                            class185.field2948.method1546(var61, arg3 + 1);
                            class101.method959(0, var60.field1200[0], var60.field1201[0], var60.method804(true), arg3 + 626, var60.method804(true), 0, true, -2);
                        }
                    }
                    if (~var6 == -53) {
                        class359.field5799 = 2;
                        class735.field10782 = arg1;
                        ++class776.field11332;
                        class438.field6845 = 0;
                        class203.field3192 = arg0;
                        class487 var62 = class618.method4519(arg3 ^ 122, class426.field6727, class185.field2948.field2659);
                        var62.field7362.method1631(class397.field6289 + var4, arg3 + -25924);
                        var62.field7362.method1640(arg3 + -571594296, class671.field9527);
                        var62.field7362.method1642(class196.field3117.method1189(82, 15708) ? 1 : 0, 19654);
                        var62.field7362.method1639(class167.field2708, 128);
                        var62.field7362.method1650((byte) -95, var7);
                        var62.field7362.method1640(arg3 + -571594296, class141.field2011 + var5);
                        var62.field7362.method1638(class626.field9017, 104);
                        class185.field2948.method1546(var62, 1);
                        class95.method921(var4, true, var5);
                    }
                    if (var6 == 51) {
                        if (~class264.field4283 < -1 && class196.field3117.method1189(82, 15708) && class196.field3117.method1189(81, 15708)) {
                            class551.method4091(false, class438.field6846.field9975, class141.field2011 + var5, class397.field6289 + var4);
                        } else {
                            class359.field5799 = 1;
                            class735.field10782 = arg1;
                            class203.field3192 = arg0;
                            ++class347.field5635;
                            class438.field6845 = 0;
                            class487 var63 = class618.method4519(19, class579.field8336, class185.field2948.field2659);
                            var63.field7362.method1631(class141.field2011 - -var5, arg3 + -25924);
                            var63.field7362.method1639(class397.field6289 - -var4, 128);
                            class185.field2948.method1546(var63, 1);
                        }
                    }
                    if (var6 == 9) {
                        class683 var64 = class454.method3528(0, var4, var5);
                        if (var64 != null) {
                            class338.method2851(var64, (byte) -7);
                        }
                    }
                    if (var6 == 5) {
                        class359.field5799 = 2;
                        class203.field3192 = arg0;
                        class438.field6845 = 0;
                        ++class165.field2678;
                        class735.field10782 = arg1;
                        class487 var65 = class618.method4519(72, class231.field3584, class185.field2948.field2659);
                        var65.field7362.method1647(arg3 + -38, !class196.field3117.method1189(82, arg3 ^ 15708) ? 0 : 1);
                        var65.field7362.method1680(class626.field9017, -122);
                        var65.field7362.method1650((byte) -95, class438.field6846.field1129);
                        var65.field7362.method1640(-571594296, class167.field2708);
                        var65.field7362.method1631(class671.field9527, -25924);
                        class185.field2948.method1546(var65, arg3 + 1);
                    }
                    if (~var6 == -26) {
                        class438.field6845 = 0;
                        class735.field10782 = arg1;
                        class203.field3192 = arg0;
                        ++class211.field3346;
                        class359.field5799 = 2;
                        class487 var66 = class618.method4519(arg3 + 26, class348.field5639, class185.field2948.field2659);
                        var66.field7362.method1640(-571594296, var5 - -class141.field2011);
                        var66.field7362.method1639((int) (var8 >>> 32) & Integer.MAX_VALUE, 128);
                        var66.field7362.method1663(arg3 ^ 128, !class196.field3117.method1189(82, arg3 ^ 15708) ? 0 : 1);
                        var66.field7362.method1650((byte) -95, class397.field6289 + var4);
                        class185.field2948.method1546(var66, arg3 + 1);
                        class571.method4207((byte) 66, var8, var4, var5);
                    }
                    if (var6 == 18) {
                        class738 var67 = class33.field395[var7];
                        if (var67 != null) {
                            class438.field6845 = 0;
                            ++class65.field898;
                            class203.field3192 = arg0;
                            class735.field10782 = arg1;
                            class359.field5799 = 2;
                            class487 var68 = class618.method4519(17, class164.field2650, class185.field2948.field2659);
                            var68.field7362.method1663(128, !class196.field3117.method1189(82, 15708) ? 0 : 1);
                            var68.field7362.method1631(var7, -25924);
                            class185.field2948.method1546(var68, arg3 + 1);
                            class101.method959(0, var67.field1200[0], var67.field1201[0], var67.method804(true), arg3 ^ 626, var67.method804(true), 0, true, -2);
                        }
                    }
                    if (~var6 == -1004) {
                        class438.field6845 = 0;
                        class735.field10782 = arg1;
                        ++class751.field11061;
                        class359.field5799 = 2;
                        class203.field3192 = arg0;
                        class487 var69 = class618.method4519(118, class127.field1832, class185.field2948.field2659);
                        var69.field7362.method1650((byte) -95, var7);
                        class185.field2948.method1546(var69, 1);
                    }
                    if (~var6 == -12) {
                        class203.field3192 = arg0;
                        class735.field10782 = arg1;
                        class359.field5799 = 2;
                        ++class46.field515;
                        class438.field6845 = 0;
                        class487 var70 = class618.method4519(40, class568.field8253, class185.field2948.field2659);
                        var70.field7362.method1631(class397.field6289 + var4, -25924);
                        var70.field7362.method1640(arg3 + -571594296, var7);
                        var70.field7362.method1650((byte) -95, var5 - -class141.field2011);
                        var70.field7362.method1647(-68, class196.field3117.method1189(82, 15708) ? 1 : 0);
                        class185.field2948.method1546(var70, 1);
                        class95.method921(var4, true, var5);
                    }
                    if (~var6 == -59) {
                        class19 var71 = (class19) class176.field2797.method737((byte) -39, (long) var7);
                        if (var71 != null) {
                            class426 var72 = var71.field194;
                            class735.field10782 = arg1;
                            class438.field6845 = 0;
                            ++class620.field8952;
                            class359.field5799 = 2;
                            class203.field3192 = arg0;
                            class487 var73 = class618.method4519(arg3 ^ 21, class11.field128, class185.field2948.field2659);
                            var73.field7362.method1639(var7, arg3 + 128);
                            var73.field7362.method1678(!class196.field3117.method1189(82, arg3 ^ 15708) ? 0 : 1, 65280);
                            class185.field2948.method1546(var73, 1);
                            class101.method959(0, var72.field1200[0], var72.field1201[0], var72.method804(true), 626, var72.method804(true), 0, true, -2);
                        }
                    }
                    if (var6 == 17) {
                        class203.field3192 = arg0;
                        ++class563.field8177;
                        class359.field5799 = 2;
                        class438.field6845 = 0;
                        class735.field10782 = arg1;
                        class487 var74 = class618.method4519(arg3 + 94, class191.field3013, class185.field2948.field2659);
                        var74.field7362.method1639(var7, 128);
                        var74.field7362.method1650((byte) -95, class141.field2011 + var5);
                        var74.field7362.method1640(-571594296, class397.field6289 + var4);
                        var74.field7362.method1678(!class196.field3117.method1189(82, 15708) ? 0 : 1, 65280);
                        class185.field2948.method1546(var74, 1);
                        class95.method921(var4, true, var5);
                    }
                    if (class501.field7499) {
                        class318.method2729(22906);
                    }
                    if (class268.field4328 != null && ~class632.field9087 == -1) {
                        class454.method3525((byte) 27, class268.field4328);
                    }
                }
            }
        } catch (RuntimeException var76) {
            throw class590.method4333(var76, field7213[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7213[3] : field7213[5]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V")
    public static void method3621(int arg0) {
        try {
            field7202 = null;
            if (arg0 != 0) {
                field7202 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7213[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Lwq;")
    public static final class176 method3622(int arg0) {
        try {
            ++field7206;
            class176 var1 = new class176(518);
            class717.field10467 = new int[4];
            class717.field10467[2] = (int) (9.9999999E7D * Math.random());
            class717.field10467[3] = (int) (9.9999999E7D * Math.random());
            class717.field10467[0] = (int) (9.9999999E7D * Math.random());
            class717.field10467[arg0] = (int) (9.9999999E7D * Math.random());
            var1.method1678(10, 65280);
            var1.method1641((byte) -108, class717.field10467[0]);
            var1.method1641((byte) -108, class717.field10467[1]);
            var1.method1641((byte) -108, class717.field10467[2]);
            var1.method1641((byte) -108, class717.field10467[3]);
            return var1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7213[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IC)Z")
    public static final boolean method3623(int arg0, char arg1) {
        try {
            if (arg0 < 111) {
                return true;
            } else {
                ++field7203;
                return ~arg1 <= -66 && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7213[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(ILha;)Z")
    public final boolean method1738(int arg0, class63 arg1) {
        try {
            ++field7207;
            if (arg0 != 1) {
                return false;
            } else {
                class135 var3 = class51.method533(super.field9975, super.field9985 >> class165.field2688, super.field9983 >> class165.field2688);
                return var3 != null && var3.field1911.field2938 ? class143.method1326(super.field9983 >> class165.field2688, super.field9985 >> class165.field2688, (byte) 72, super.field9975, var3.field1911.method43(0) + this.method43(0)) : class527.method3934(79, super.field9985 >> class165.field2688, super.field9975, super.field9983 >> class165.field2688);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7213[12] + arg0 + ',' + (arg1 != null ? field7213[3] : field7213[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "(I)Z")
    public final boolean method1737(int arg0) {
        try {
            ++field7209;
            if (arg0 > -19) {
                field7202 = null;
            }
            return class441.field6890[(super.field9985 >> class165.field2688) + class297.field4835 + -class54.field689][(super.field9983 >> class165.field2688) + class297.field4835 - class316.field5137];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7213[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "([Lih;Z)I")
    public final int method1739(class731[] arg0, boolean arg1) {
        try {
            ++field7205;
            return arg1 ? 13 : this.method5034(!arg1, arg0, super.field9985 >> class165.field2688, super.field9983 >> class165.field2688);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7213[4] + (arg0 != null ? field7213[3] : field7213[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3624(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3625(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 103;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
