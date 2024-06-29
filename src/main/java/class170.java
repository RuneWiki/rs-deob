import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class170 extends class518 {

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "Z")
    private boolean field2128 = false;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Z")
    private boolean field2121 = false;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lpba;")
    private class472 field2127;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Log;")
    private class564 field2125;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "[Lfv;")
    public static class495[] field2119 = new class495[14];

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "[I")
    public static int[] field2126 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lnn;")
    public static class446 field2118 = new class446(8, 3);

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method1131(boolean arg0) {
        if (arg0) {
            this.field2121 = false;
        }
        ++field2131;
        return this.field2128;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Z", line = 15)
    public static final boolean method1132(int arg0) throws IOException {
        ++field2124;
        if (class80.field1014 == null) {
            return false;
        } else {
            if (class308.field4138 == null) {
                if (class643.field9114) {
                    if (!class80.field1014.method965((byte) -46, 1)) {
                        return false;
                    }
                    class80.field1014.method964(class164.field2068.field1712, 1, 51, 0);
                    class643.field9114 = false;
                    class365.field5243 = 0;
                    ++class6.field51;
                }
                class164.field2068.field1745 = 0;
                if (class164.field2068.method744(true)) {
                    if (!class80.field1014.method965((byte) -64, 1)) {
                        return false;
                    }
                    class80.field1014.method964(class164.field2068.field1712, 1, 71, 1);
                    ++class6.field51;
                    class365.field5243 = 0;
                }
                class643.field9114 = true;
                class318[] var1 = class200.method1267(true);
                int var2 = class164.field2068.method748((byte) -15);
                if (~var2 > -1 || ~var1.length >= ~var2) {
                    throw new IOException("invo:" + var2 + " ip:" + class164.field2068.field1745);
                }
                class308.field4138 = var1[var2];
                class161.field2037 = class308.field4138.field4636;
            }
            if (~class161.field2037 == 0) {
                if (!class80.field1014.method965((byte) -4, 1)) {
                    return false;
                }
                class80.field1014.method964(class164.field2068.field1712, 1, -118, 0);
                class365.field5243 = 0;
                class161.field2037 = class164.field2068.field1712[0] & 255;
                ++class6.field51;
            }
            if (~class161.field2037 == 1) {
                if (!class80.field1014.method965((byte) 125, 2)) {
                    return false;
                }
                class80.field1014.method964(class164.field2068.field1712, 2, -125, 0);
                class164.field2068.field1745 = 0;
                class161.field2037 = class164.field2068.method922((byte) -124);
                class365.field5243 = 0;
                class6.field51 += 2;
            }
            if (~class161.field2037 < -1) {
                if (!class80.field1014.method965((byte) -97, class161.field2037)) {
                    return false;
                }
                class164.field2068.field1745 = 0;
                class80.field1014.method964(class164.field2068.field1712, class161.field2037, 119, 0);
                class365.field5243 = 0;
                class6.field51 += class161.field2037;
            }
            class99.field1210 = class143.field1819;
            class143.field1819 = class253.field3494;
            class253.field3494 = class308.field4138;
            if (class308.field4138 == class306.field4104) {
                int var3 = class164.field2068.method929(-104);
                int var4 = class164.field2068.method922((byte) -123);
                class327.field4771.method2156(var4, (byte) 43, var3);
                class308.field4138 = null;
                return true;
            } else if (class91.field1117 == class308.field4138) {
                int var5 = class164.field2068.method948(false);
                int var6 = class164.field2068.method922((byte) -116);
                if (~var6 == -65536) {
                    var6 = -1;
                }
                int var7 = class164.field2068.method929(-106);
                if (class195.method1245(var5, (byte) 90)) {
                    class530.method3011(-1, 1, false, var6, var7);
                }
                class308.field4138 = null;
                return true;
            } else if (class7.field61 == class308.field4138) {
                int var8 = class164.field2068.method943(-90);
                class150.field1893 = class495.field6687.method621(65535, var8);
                class308.field4138 = null;
                return true;
            } else if (class597.field8168 == class308.field4138) {
                if (class316.field4599 != -1) {
                    class175.method1162(0, 2, class316.field4599);
                }
                class308.field4138 = null;
                return true;
            } else if (class476.field6426 == class308.field4138) {
                int var9 = class164.field2068.method922((byte) -113);
                int var10 = class164.field2068.method936((byte) -31);
                int var11 = class164.field2068.method922((byte) -115);
                if (class195.method1245(var9, (byte) 12)) {
                    if (~var10 == -3) {
                        class429.method2473(false);
                    }
                    class316.field4599 = var11;
                    class690.method3822(true, var11);
                    class255.method1599(false, true);
                    class317.method2041(class316.field4599);
                    for (int var12 = 0; var12 < 100; ++var12) {
                        class200.field2630[var12] = true;
                    }
                }
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class308.field4135) {
                int var13 = class164.field2068.method957((byte) -96);
                if (~class164.field2068.method957((byte) -107) == -1) {
                    class466.field6352[var13] = new class33();
                } else {
                    --class164.field2068.field1745;
                    class466.field6352[var13] = new class33(class164.field2068);
                }
                class319.field4665 = class141.field1800;
                class308.field4138 = null;
                return true;
            } else if (class322.field4724 == class308.field4138) {
                int var14 = class164.field2068.method944(702964904);
                String var15 = class164.field2068.method907(false);
                int var16 = class164.field2068.method948(false);
                if (class195.method1245(var16, (byte) -39)) {
                    class431.method2484(var15, -91, var14);
                }
                class308.field4138 = null;
                return true;
            } else if (class603.field8228 == class308.field4138) {
                int var17 = class164.field2068.method930((byte) -75);
                int var18 = class164.field2068.method898((byte) 96);
                int var19 = class164.field2068.method942(-101);
                int var20 = class164.field2068.method922((byte) -113);
                if (class195.method1245(var18, (byte) 91)) {
                    class524 var21 = (class524) class54.field742.method2506(9, (long) var17);
                    if (var21 != null) {
                        class63.method389(var21.field7256 != var20, false, var21, -122);
                    }
                    class384.method2321(var19, (byte) 111, var17, var20, false);
                }
                class308.field4138 = null;
                return true;
            } else if (class501.field6764 == class308.field4138) {
                class641.field8818 = class164.field2068.method957((byte) -80);
                for (int var22 = 0; ~class641.field8818 < ~var22; ++var22) {
                    class353.field5147[var22] = class164.field2068.method907(false);
                    class207.field2698[var22] = class164.field2068.method907(false);
                    if (class207.field2698[var22].equals("")) {
                        class207.field2698[var22] = class353.field5147[var22];
                    }
                    class291.field3892[var22] = class164.field2068.method907(false);
                    class623.field8473[var22] = class164.field2068.method907(false);
                    if (class623.field8473[var22].equals("")) {
                        class623.field8473[var22] = class291.field3892[var22];
                    }
                    class42.field550[var22] = false;
                }
                class308.field4138 = null;
                class309.field4142 = class141.field1800;
                return true;
            } else if (class326.field4748 == class308.field4138) {
                class477.method2675(-1, class528.field7313);
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class227.field2976) {
                int var23 = class164.field2068.method948(false);
                int var24 = class164.field2068.method912(0);
                if (~var24 == -65536) {
                    var24 = -1;
                }
                int var25 = class164.field2068.method944(702964904);
                if (class195.method1245(var23, (byte) 97)) {
                    class69.method410(var25, var24, -126);
                }
                class308.field4138 = null;
                return true;
            } else if (class489.field6599 == class308.field4138) {
                int var26 = class164.field2068.method944(702964904);
                int var27 = class164.field2068.method922((byte) -114);
                int var28 = class164.field2068.method933(10967);
                if (class195.method1245(var27, (byte) 5)) {
                    class199.method1265(var26, var28, (byte) -102);
                }
                class308.field4138 = null;
                return true;
            } else if (class544.field7456 == class308.field4138) {
                class161.method1094(117);
                class308.field4138 = null;
                return false;
            } else if (class438.field6054 == class308.field4138) {
                int var29 = class164.field2068.method948(false);
                int var30 = class164.field2068.method898((byte) 96);
                int var31 = class164.field2068.method928(-112);
                class637 var32 = (class637) class77.field955.method2506(71, (long) var30);
                if (var32 != null) {
                    class87.method485(var29, var32.field8702, var31, (byte) -119);
                }
                class308.field4138 = null;
                return true;
            } else if (class669.field9512 == class308.field4138) {
                int var33 = class164.field2068.method930((byte) -122);
                int var34 = class164.field2068.method912(0);
                int var35 = class164.field2068.method948(false);
                if (class195.method1245(var35, (byte) 87)) {
                    class344.method2169(var34, 0, var33);
                }
                class308.field4138 = null;
                return true;
            } else if (class537.field7376 == class308.field4138) {
                int var36 = class164.field2068.method933(10967);
                int var37 = class164.field2068.method898((byte) 96);
                int var38 = class164.field2068.method944(702964904);
                int var39 = class164.field2068.method924(2);
                if (class195.method1245(var37, (byte) 81)) {
                    class252.method1580(var39, var38, (byte) 120, var36);
                }
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class141.field1798) {
                boolean var40 = class164.field2068.method957((byte) -112) == 1;
                byte[] var41 = new byte[class161.field2037 + -1];
                class164.field2068.method934(8, 0, class161.field2037 - 1, var41);
                class564.method3179(var41, var40, 17);
                class308.field4138 = null;
                return true;
            } else if (class338.field4950 == class308.field4138) {
                int var42 = class164.field2068.method936((byte) -31);
                int var43 = var42 >> 2;
                int var44 = 3 & var42;
                int var45 = class286.field3869[var43];
                int var46 = class164.field2068.method898((byte) 96);
                if (~var46 == -65536) {
                    var46 = -1;
                }
                int var47 = class164.field2068.method943(-97);
                int var48 = (969042823 & var47) >> 28;
                int var49 = var47 >> 14 & 16383;
                int var50 = var47 & 16383;
                int var51 = var49 - class253.field3490;
                int var52 = var50 - class186.field2280;
                class463.method2627(var46, var51, var44, var52, (byte) -98, var48, var45, var43);
                class308.field4138 = null;
                return true;
            } else if (class581.field8008 == class308.field4138) {
                class483.method2696(-15145);
                class308.field4138 = null;
                return false;
            } else if (class588.field8080 == class308.field4138) {
                class477.method2675(-1, class516.field7080);
                class308.field4138 = null;
                return true;
            } else if (class483.field6540 == class308.field4138) {
                String var53 = class164.field2068.method907(false);
                boolean var54 = ~class164.field2068.method957((byte) -74) == -2;
                String var55;
                if (!var54) {
                    var55 = var53;
                } else {
                    var55 = class164.field2068.method907(false);
                }
                int var56 = class164.field2068.method922((byte) -116);
                byte var57 = class164.field2068.method950(false);
                boolean var58 = false;
                if (~var57 == 127) {
                    var58 = true;
                }
                if (!var58) {
                    String var59 = class164.field2068.method907(false);
                    class80 var60 = new class80();
                    var60.field1008 = var55;
                    var60.field1016 = var53;
                    var60.field1010 = class303.method1825(var60.field1008, 1);
                    var60.field1009 = var56;
                    var60.field1007 = var57;
                    var60.field1015 = var59;
                    int var61;
                    for (var61 = class35.field341 + -1; ~var61 <= -1; --var61) {
                        int var62 = class624.field8496[var61].field1010.compareTo(var60.field1010);
                        if (~var62 == -1) {
                            class624.field8496[var61].field1009 = var56;
                            class624.field8496[var61].field1007 = var57;
                            class624.field8496[var61].field1015 = var59;
                            if (var55.equals(class596.field8164.field7191)) {
                                class554.field7579 = var57;
                            }
                            class157.field1971 = class141.field1800;
                            class308.field4138 = null;
                            return true;
                        }
                        if (var62 < 0) {
                            break;
                        }
                    }
                    if (~class624.field8496.length >= ~class35.field341) {
                        class308.field4138 = null;
                        return true;
                    }
                    for (int var63 = class35.field341 + -1; ~var61 > ~var63; --var63) {
                        class624.field8496[var63 - -1] = class624.field8496[var63];
                    }
                    if (class35.field341 == 0) {
                        class624.field8496 = new class80[100];
                    }
                    class624.field8496[var61 + 1] = var60;
                    ++class35.field341;
                    if (var55.equals(class596.field8164.field7191)) {
                        class554.field7579 = var57;
                    }
                } else {
                    if (~class35.field341 == -1) {
                        class308.field4138 = null;
                        return true;
                    }
                    boolean var64 = false;
                    int var65;
                    for (var65 = 0; var65 < class35.field341 && (!class624.field8496[var65].field1008.equals(var55) || class624.field8496[var65].field1009 != var56); ++var65) {
                    }
                    if (~class35.field341 < ~var65) {
                        while (var65 < class35.field341 + -1) {
                            class624.field8496[var65] = class624.field8496[var65 + 1];
                            ++var65;
                        }
                        --class35.field341;
                        class624.field8496[class35.field341] = null;
                    }
                }
                class308.field4138 = null;
                class157.field1971 = class141.field1800;
                return true;
            } else if (class308.field4138 == class248.field3339) {
                int var66 = class164.field2068.method957((byte) -89);
                int var67 = var66 >> 5;
                int var68 = var66 & 31;
                if (var68 == 0) {
                    class249.field3357[var67] = null;
                    class308.field4138 = null;
                    return true;
                } else {
                    class90 var69 = new class90();
                    var69.field1099 = var68;
                    var69.field1100 = class164.field2068.method957((byte) -110);
                    if (var69.field1100 >= 0 && var69.field1100 < class521.field7222.length) {
                        if (~var69.field1099 != -2 && ~var69.field1099 != -11) {
                            if (var69.field1099 >= 2 && var69.field1099 <= 6) {
                                if (var69.field1099 == 2) {
                                    var69.field1105 = 256;
                                    var69.field1098 = 256;
                                }
                                if (~var69.field1099 == -4) {
                                    var69.field1098 = 0;
                                    var69.field1105 = 256;
                                }
                                if (~var69.field1099 == -5) {
                                    var69.field1105 = 256;
                                    var69.field1098 = 512;
                                }
                                if (~var69.field1099 == -6) {
                                    var69.field1098 = 256;
                                    var69.field1105 = 0;
                                }
                                if (var69.field1099 == 6) {
                                    var69.field1105 = 512;
                                    var69.field1098 = 256;
                                }
                                var69.field1099 = 2;
                                var69.field1101 = class164.field2068.method957((byte) -74);
                                var69.field1098 += class164.field2068.method922((byte) -115) + -class253.field3490 << 9;
                                var69.field1105 += class164.field2068.method922((byte) -124) - class186.field2280 << 9;
                                var69.field1103 = class164.field2068.method957((byte) -110) << 2;
                                var69.field1102 = class164.field2068.method922((byte) -118);
                            }
                        } else {
                            var69.field1106 = class164.field2068.method922((byte) -115);
                            class164.field2068.field1745 += 6;
                        }
                        var69.field1108 = class164.field2068.method922((byte) -120);
                        if (~var69.field1108 == -65536) {
                            var69.field1108 = -1;
                        }
                        class249.field3357[var67] = var69;
                    }
                    class308.field4138 = null;
                    return true;
                }
            } else if (class373.field5383 == class308.field4138) {
                boolean var70 = ~class164.field2068.method957((byte) -98) == -2;
                String var71 = class164.field2068.method907(false);
                String var72 = var71;
                if (var70) {
                    var72 = class164.field2068.method907(false);
                }
                long var73 = class164.field2068.method949(126);
                long var75 = (long) class164.field2068.method922((byte) -119);
                long var77 = (long) class164.field2068.method904(116);
                int var79 = class164.field2068.method957((byte) -74);
                long var80 = (var75 << 32) - -var77;
                boolean var82 = false;
                int var83 = 0;
                while (true) {
                    if (var83 >= 100) {
                        if (var79 <= 1) {
                            if ((!class276.field3741 || class205.field2682) && !class283.field3832) {
                                if (class559.method3124(-118, var72)) {
                                    var82 = true;
                                }
                            } else {
                                var82 = true;
                            }
                        }
                        break;
                    }
                    if (class484.field6545[var83] == var80) {
                        var82 = true;
                        break;
                    }
                    ++var83;
                }
                if (!var82 && class557.field7604 == 0) {
                    class484.field6545[class632.field8585] = var80;
                    class632.field8585 = (class632.field8585 + 1) % 100;
                    String var84 = class549.method3089(class328.method2104(false, class164.field2068), true);
                    if (var79 != 2 && var79 != 3) {
                        if (~var79 == -2) {
                            class537.method3033(-1, class443.method2547(var73, 0), 9, var84, -124, var71, "<img=0>" + var72, 0, "<img=0>" + var71);
                        } else {
                            class537.method3033(-1, class443.method2547(var73, 0), 9, var84, -95, var71, var72, 0, var71);
                        }
                    } else {
                        class537.method3033(-1, class443.method2547(var73, 0), 9, var84, -117, var71, "<img=1>" + var72, 0, "<img=1>" + var71);
                    }
                }
                class308.field4138 = null;
                return true;
            } else if (class676.field9592 == class308.field4138) {
                int var85 = class164.field2068.method948(false);
                int var86 = class164.field2068.method930((byte) -78);
                int var87 = class164.field2068.method948(false);
                if (class195.method1245(var85, (byte) 115)) {
                    class393.method2337(var87, -8558, var86);
                }
                class308.field4138 = null;
                return true;
            } else if (class88.field1094 == class308.field4138) {
                int var88 = class164.field2068.method898((byte) 96);
                int var89 = class164.field2068.method898((byte) 96);
                int var90 = class164.field2068.method943(-106);
                if (class195.method1245(var88, (byte) 9)) {
                    class569.method3208(var90, 1, var89);
                }
                class308.field4138 = null;
                return true;
            } else if (class679.field9653 == class308.field4138) {
                int var91 = class164.field2068.method914(-43);
                int var92 = class164.field2068.method943(-98);
                int var93 = class164.field2068.method957((byte) -117);
                String var94 = "";
                String var95 = var94;
                if (~(1 & var93) != -1) {
                    var94 = class164.field2068.method907(false);
                    if ((var93 & 2) != 0) {
                        var95 = class164.field2068.method907(false);
                    } else {
                        var95 = var94;
                    }
                }
                String var96 = class164.field2068.method907(false);
                if (var91 == 99) {
                    class451.method2571(var96, 95);
                } else {
                    if (!var95.equals("") && class559.method3124(-81, var95)) {
                        class308.field4138 = null;
                        return true;
                    }
                    class334.method2133(var95, var91, var94, var96, var92, -57, var94);
                }
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class255.field3519) {
                int var97 = class164.field2068.method922((byte) -117);
                int var98 = class164.field2068.method957((byte) -91);
                boolean var99 = (var98 & 1) == 1;
                class305.method1832(var97, var99, (byte) 74);
                int var100 = class164.field2068.method922((byte) -124);
                for (int var101 = 0; ~var101 > ~var100; ++var101) {
                    int var102 = class164.field2068.method928(-118);
                    if (var102 == 255) {
                        var102 = class164.field2068.method943(-118);
                    }
                    int var103 = class164.field2068.method922((byte) -122);
                    class690.method3821(var102, var97, 0, var99, var101, var103 + -1);
                }
                class519.field7186[class230.method1424(class492.field6662++, 31)] = var97;
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class111.field1336) {
                String var104 = class164.field2068.method907(false);
                int var105 = class164.field2068.method948(false);
                int var106 = class164.field2068.method898((byte) 96);
                if (class195.method1245(var106, (byte) -77)) {
                    class256.method1603(var105, true, var104);
                }
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class140.field1790) {
                class96.field1179 = class500.method2813(0, class164.field2068.method957((byte) -75));
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class198.field2620) {
                class466.method2637(true);
                class308.field4138 = null;
                return true;
            } else if (class47.field646 == class308.field4138) {
                int var107 = class164.field2068.method912(0);
                String var108 = class164.field2068.method907(false);
                int var109 = class164.field2068.method922((byte) -122);
                if (class195.method1245(var109, (byte) -31)) {
                    class256.method1603(var107, true, var108);
                }
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class278.field3763) {
                class325.field4740 = class164.field2068.method957((byte) -124);
                class308.field4138 = null;
                return true;
            } else if (class666.field9472 == class308.field4138) {
                String var110 = class164.field2068.method907(false);
                int var111 = class164.field2068.method922((byte) -122);
                String var112 = class673.field9539.method2804(27993, var111).method3233(-126, class164.field2068);
                class537.method3033(var111, (String) null, 19, var112, -120, var110, var110, 0, var110);
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class256.field3535) {
                class468.method2642(false, 0);
                class308.field4138 = null;
                return true;
            } else if (class643.field9107 == class308.field4138) {
                int var113 = class164.field2068.method922((byte) -115);
                int var114 = class164.field2068.method922((byte) -118);
                int var115 = class164.field2068.method922((byte) -117);
                int var116 = class164.field2068.method922((byte) -113);
                if (class195.method1245(var113, (byte) 108) && class328.field4799[var114] != null) {
                    for (int var117 = var115; ~var116 < ~var117; ++var117) {
                        int var118 = class164.field2068.method904(127);
                        if (~class328.field4799[var114].length < ~var117 && class328.field4799[var114][var117] != null) {
                            class328.field4799[var114][var117].field2365 = var118;
                        }
                    }
                }
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class222.field2872) {
                while (class164.field2068.field1745 < class161.field2037) {
                    boolean var129 = class164.field2068.method957((byte) -120) == 1;
                    String var130 = class164.field2068.method907(false);
                    String var131 = class164.field2068.method907(false);
                    int var132 = class164.field2068.method922((byte) -117);
                    int var133 = class164.field2068.method957((byte) -98);
                    String var134 = "";
                    boolean var135 = false;
                    if (~var132 < -1) {
                        var134 = class164.field2068.method907(false);
                        var135 = class164.field2068.method957((byte) -109) == 1;
                    }
                    for (int var136 = 0; var136 < class110.field1323; ++var136) {
                        if (var129) {
                            if (var131.equals(class320.field4711[var136])) {
                                class320.field4711[var136] = var130;
                                var130 = null;
                                class248.field3335[var136] = var131;
                                break;
                            }
                        } else if (var130.equals(class320.field4711[var136])) {
                            if (class314.field4515[var136] != var132) {
                                boolean var137 = true;
                                for (class394 var138 = (class394) class245.field3296.method2224((byte) -112); var138 != null; var138 = (class394) class245.field3296.method2222((byte) -47)) {
                                    if (var138.field5647.equals(var130)) {
                                        if (var132 != 0 && var138.field5652 == 0) {
                                            var137 = false;
                                            var138.method2357(3553);
                                        } else if (~var132 == -1 && ~var138.field5652 != -1) {
                                            var138.method2357(3553);
                                            var137 = false;
                                        }
                                    }
                                }
                                if (var137) {
                                    class245.field3296.method2216(4, new class394(var130, var132));
                                }
                                class314.field4515[var136] = var132;
                            }
                            class248.field3335[var136] = var131;
                            class383.field5573[var136] = var134;
                            class47.field647[var136] = var133;
                            class598.field8189[var136] = var135;
                            var130 = null;
                            break;
                        }
                    }
                    if (var130 != null && class110.field1323 < 200) {
                        class320.field4711[class110.field1323] = var130;
                        class248.field3335[class110.field1323] = var131;
                        class314.field4515[class110.field1323] = var132;
                        class383.field5573[class110.field1323] = var134;
                        class47.field647[class110.field1323] = var133;
                        class598.field8189[class110.field1323] = var135;
                        ++class110.field1323;
                    }
                }
                class309.field4142 = class141.field1800;
                class99.field1209 = 2;
                boolean var119 = false;
                int var120 = class110.field1323;
                while (~var120 < -1) {
                    --var120;
                    boolean var121 = true;
                    for (int var122 = 0; ~var120 < ~var122; ++var122) {
                        if (class314.field4515[var122] != class79.field1002.field9558 && class314.field4515[var122 - -1] == class79.field1002.field9558 || class314.field4515[var122] == 0 && class314.field4515[var122 - -1] != 0) {
                            int var123 = class314.field4515[var122];
                            class314.field4515[var122] = class314.field4515[var122 + 1];
                            class314.field4515[var122 - -1] = var123;
                            String var124 = class383.field5573[var122];
                            class383.field5573[var122] = class383.field5573[var122 + 1];
                            class383.field5573[var122 + 1] = var124;
                            String var125 = class320.field4711[var122];
                            class320.field4711[var122] = class320.field4711[var122 + 1];
                            class320.field4711[var122 + 1] = var125;
                            String var126 = class248.field3335[var122];
                            class248.field3335[var122] = class248.field3335[var122 + 1];
                            class248.field3335[var122 + 1] = var126;
                            int var127 = class47.field647[var122];
                            class47.field647[var122] = class47.field647[var122 + 1];
                            class47.field647[var122 + 1] = var127;
                            boolean var128 = class598.field8189[var122];
                            class598.field8189[var122] = class598.field8189[var122 + 1];
                            class598.field8189[var122 + 1] = var128;
                            var121 = false;
                        }
                    }
                    if (var121) {
                        break;
                    }
                }
                class308.field4138 = null;
                return true;
            } else if (class612.field8346 == class308.field4138) {
                int var139 = class164.field2068.method948(false);
                int var140 = class164.field2068.method929(-120);
                int var141 = class164.field2068.method929(-87);
                int var142 = class164.field2068.method898((byte) 96);
                if (var142 == 65535) {
                    var142 = -1;
                }
                if (class195.method1245(var139, (byte) -127)) {
                    class432.method2487(var140, var141, var142, -113);
                    class660 var143 = class237.field3088.method1349(-1, var142);
                    class654.method3622(-1, var143.field9319, var143.field9352, var143.field9311, var141);
                    class156.method1044(var143.field9300, false, var143.field9366, var141, var143.field9369);
                }
                class308.field4138 = null;
                return true;
            } else if (class312.field4365 == class308.field4138) {
                class477.method2675(-1, class100.field1220);
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class293.field3915) {
                int var144 = class164.field2068.method922((byte) -116);
                int var145 = class164.field2068.method922((byte) -127);
                int var146 = class164.field2068.method922((byte) -115);
                int var147 = class164.field2068.method957((byte) -81);
                int var148 = class164.field2068.method929(67);
                boolean var149 = ~(var147 & 128) != -1;
                if (var148 >> 30 == 0) {
                    if (~(var148 >> 29) == -1) {
                        if (~(var148 >> 28) != -1) {
                            int var150 = var148 & 65535;
                            class519 var151;
                            if (~class224.field2907 == ~var150) {
                                var151 = class596.field8164;
                            } else {
                                var151 = class292.field3912[var150];
                            }
                            if (var151 != null) {
                                if (~var144 == -65536) {
                                    var144 = -1;
                                }
                                boolean var152 = true;
                                int var153 = !var149 ? var151.field444 : var151.field453;
                                if (var144 != -1 && ~var153 != 0) {
                                    if (var144 == var153) {
                                        class328 var154 = class236.field3079.method1047(var144, (byte) 121);
                                        if (var154.field4811 && var154.field4797 != -1) {
                                            class463 var155 = class77.field971.method776(var154.field4797, (byte) -97);
                                            int var156 = var155.field6314;
                                            if (var156 != 0 && ~var156 != -3) {
                                                if (~var156 == -2) {
                                                    var152 = true;
                                                }
                                            } else {
                                                var152 = false;
                                            }
                                        }
                                    } else {
                                        class328 var157 = class236.field3079.method1047(var144, (byte) -37);
                                        class328 var158 = class236.field3079.method1047(var153, (byte) -58);
                                        if (~var157.field4797 != 0 && ~var158.field4797 != 0) {
                                            class463 var159 = class77.field971.method776(var157.field4797, (byte) 89);
                                            class463 var160 = class77.field971.method776(var158.field4797, (byte) -101);
                                            if (~var160.field6334 < ~var159.field6334) {
                                                var152 = false;
                                            }
                                        }
                                    }
                                }
                                if (var152) {
                                    if (!var149) {
                                        var151.field444 = var144;
                                        var151.field449 = var147 & 7;
                                        var151.field436 = var146;
                                        var151.field490 = 0;
                                        var151.field466 = 0;
                                        var151.field448 = 1;
                                        var151.field473 = class430.field5984 + var145;
                                        if (var151.field473 > class430.field5984) {
                                            var151.field466 = -1;
                                        }
                                        if (~var151.field444 == -65536) {
                                            var151.field444 = -1;
                                        }
                                        if (var151.field444 != -1 && class430.field5984 == var151.field473) {
                                            int var161 = class236.field3079.method1047(var151.field444, (byte) -59).field4797;
                                            if (~var161 != 0) {
                                                class463 var162 = class77.field971.method776(var161, (byte) 113);
                                                if (var162 != null && var162.field6307 != null) {
                                                    class311.method1870(0, var151.field3917, (byte) 1, class596.field8164 == var151, var151.field3929, var162, var151.field3925);
                                                }
                                            }
                                        }
                                    } else {
                                        var151.field467 = class430.field5984 + var145;
                                        var151.field445 = var147 & 7;
                                        var151.field481 = 0;
                                        var151.field429 = 0;
                                        var151.field453 = var144;
                                        var151.field442 = var146;
                                        var151.field476 = 1;
                                        if (var151.field467 > class430.field5984) {
                                            var151.field481 = -1;
                                        }
                                        if (~var151.field453 == -65536) {
                                            var151.field453 = -1;
                                        }
                                        if (var151.field453 != -1 && class430.field5984 == var151.field467) {
                                            int var163 = class236.field3079.method1047(var151.field453, (byte) 125).field4797;
                                            if (~var163 != 0) {
                                                class463 var164 = class77.field971.method776(var163, (byte) 63);
                                                if (var164 != null && var164.field6307 != null) {
                                                    class311.method1870(0, var151.field3917, (byte) 1, class596.field8164 == var151, var151.field3929, var164, var151.field3925);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int var165 = 65535 & var148;
                        class637 var166 = (class637) class77.field955.method2506(56, (long) var165);
                        if (var166 != null) {
                            class676 var167 = var166.field8702;
                            if (~var144 == -65536) {
                                var144 = -1;
                            }
                            boolean var168 = true;
                            int var169 = var149 ? var167.field453 : var167.field444;
                            if (var144 != -1 && var169 != -1) {
                                if (~var144 != ~var169) {
                                    class328 var170 = class236.field3079.method1047(var144, (byte) 120);
                                    class328 var171 = class236.field3079.method1047(var169, (byte) 120);
                                    if (var170.field4797 != -1 && var171.field4797 != -1) {
                                        class463 var172 = class77.field971.method776(var170.field4797, (byte) 116);
                                        class463 var173 = class77.field971.method776(var171.field4797, (byte) -79);
                                        if (var172.field6334 < var173.field6334) {
                                            var168 = false;
                                        }
                                    }
                                } else {
                                    class328 var174 = class236.field3079.method1047(var144, (byte) 116);
                                    if (var174.field4811 && var174.field4797 != -1) {
                                        class463 var175 = class77.field971.method776(var174.field4797, (byte) -83);
                                        int var176 = var175.field6314;
                                        if (~var176 != -1 && var176 != 2) {
                                            if (var176 == 1) {
                                                var168 = true;
                                            }
                                        } else {
                                            var168 = false;
                                        }
                                    }
                                }
                            }
                            if (var168) {
                                if (!var149) {
                                    var167.field466 = 0;
                                    var167.field436 = var146;
                                    var167.field490 = 0;
                                    var167.field449 = 7 & var147;
                                    var167.field473 = class430.field5984 + var145;
                                    var167.field444 = var144;
                                    var167.field448 = 1;
                                    if (~class430.field5984 > ~var167.field473) {
                                        var167.field466 = -1;
                                    }
                                    if (~var167.field444 != 0 && ~class430.field5984 == ~var167.field473) {
                                        int var177 = class236.field3079.method1047(var167.field444, (byte) -58).field4797;
                                        if (var177 != -1) {
                                            class463 var178 = class77.field971.method776(var177, (byte) 68);
                                            if (var178 != null && var178.field6307 != null) {
                                                class311.method1870(0, var167.field3917, (byte) 1, false, var167.field3929, var178, var167.field3925);
                                            }
                                        }
                                    }
                                } else {
                                    var167.field467 = class430.field5984 - -var145;
                                    var167.field453 = var144;
                                    var167.field476 = 1;
                                    var167.field481 = 0;
                                    var167.field442 = var146;
                                    var167.field445 = 7 & var147;
                                    var167.field429 = 0;
                                    if (~class430.field5984 > ~var167.field467) {
                                        var167.field481 = -1;
                                    }
                                    if (~var167.field453 != 0 && class430.field5984 == var167.field467) {
                                        int var179 = class236.field3079.method1047(var167.field453, (byte) -37).field4797;
                                        if (~var179 != 0) {
                                            class463 var180 = class77.field971.method776(var179, (byte) -124);
                                            if (var180 != null && var180.field6307 != null) {
                                                class311.method1870(0, var167.field3917, (byte) 1, false, var167.field3929, var180, var167.field3925);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var181 = var148 >> 28 & 3;
                    int var182 = (16383 & var148 >> 14) + -class253.field3490;
                    int var183 = (var148 & 16383) - class186.field2280;
                    if (var182 >= 0 && var183 >= 0 && ~class588.field8082 < ~var182 && var183 < class12.field113) {
                        int var184 = var182 * 512 + 256;
                        int var185 = var183 * 512 + 256;
                        int var186 = var181;
                        if (var181 < 3 && class313.method2026(var183, 3550, var182)) {
                            var186 = var181 + 1;
                        }
                        class542 var187 = new class542(var144, 0, class430.field5984, var181, var186, var184, -var146 + class394.method2340(var184, -1, var181, var185), var185, var182, var182, var183, var183, var147 & 7);
                        class28.field278.method378(new class121(var187), 31316);
                    }
                }
                class308.field4138 = null;
                return true;
            } else if (class529.field7324 == class308.field4138) {
                class144.field1835 = class164.field2068.method936((byte) -31);
                class28.field277 = class164.field2068.method899(11923) << 3;
                class301.field4019 = class164.field2068.method950(false) << 3;
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class155.field1919) {
                int var188 = class164.field2068.method922((byte) -119);
                int var189 = class164.field2068.method957((byte) -112);
                class327.field4771.method2156(var188, (byte) 51, var189);
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class252.field3439) {
                int var190 = class164.field2068.method936((byte) -31);
                int var191 = class164.field2068.method912(0);
                boolean var192 = ~(1 & var190) == -2;
                class643.method3581(var191, var192, (byte) 54);
                class519.field7186[class230.method1424(class492.field6662++, 31)] = var191;
                class308.field4138 = null;
                return true;
            } else if (class48.field653 == class308.field4138) {
                int var193 = class164.field2068.method922((byte) -119);
                class519 var194;
                if (~class224.field2907 == ~var193) {
                    var194 = class596.field8164;
                } else {
                    var194 = class292.field3912[var193];
                }
                if (var194 == null) {
                    class308.field4138 = null;
                    return true;
                } else {
                    int var195 = class164.field2068.method922((byte) -125);
                    int var196 = class164.field2068.method957((byte) -68);
                    boolean var197 = (var195 & 32768) != 0;
                    if (var194.field7191 != null && var194.field7193 != null) {
                        boolean var198 = false;
                        if (~var196 >= -2) {
                            if (!var197 && (class276.field3741 && !class205.field2682 || class283.field3832)) {
                                var198 = true;
                            } else if (class559.method3124(-92, var194.field7191)) {
                                var198 = true;
                            }
                        }
                        if (!var198 && class557.field7604 == 0) {
                            int var199 = -1;
                            String var200;
                            if (!var197) {
                                var200 = class549.method3089(class328.method2104(false, class164.field2068), true);
                            } else {
                                var195 &= 32767;
                                class672 var201 = class51.method290((byte) 0, class164.field2068);
                                var199 = var201.field9533;
                                var200 = var201.field9531.method3233(-26, class164.field2068);
                            }
                            var194.field503 = var200.trim();
                            var194.field439 = 255 & var195;
                            var194.field452 = var195 >> 8;
                            var194.field443 = 150;
                            int var202;
                            if (~var196 != -2 && var196 != 2) {
                                var202 = var197 ? 17 : 2;
                            } else {
                                var202 = var197 ? 17 : 1;
                            }
                            if (var196 == 2) {
                                class537.method3033(var199, (String) null, var202, var200, -46, var194.field7157, "<img=1>" + var194.method2956(-1, false), 0, "<img=1>" + var194.method2957(true, true));
                            } else if (var196 == 1) {
                                class537.method3033(var199, (String) null, var202, var200, -54, var194.field7157, "<img=0>" + var194.method2956(-1, false), 0, "<img=0>" + var194.method2957(true, true));
                            } else {
                                class537.method3033(var199, (String) null, var202, var200, -40, var194.field7157, var194.method2956(-1, false), 0, var194.method2957(true, true));
                            }
                        }
                    }
                    class308.field4138 = null;
                    return true;
                }
            } else if (class308.field4138 == class121.field1559) {
                class511.method2893(1000000, false);
                class308.field4138 = null;
                return false;
            } else if (class308.field4138 == class304.field4095) {
                int var203 = class164.field2068.method957((byte) -108);
                int var204 = class164.field2068.method948(false);
                if (~var204 == -65536) {
                    var204 = -1;
                }
                String var205 = class164.field2068.method907(false);
                int var206 = class164.field2068.method957((byte) -112);
                if (~var203 <= -2 && var203 <= 8) {
                    if (var205.equalsIgnoreCase("null")) {
                        var205 = null;
                    }
                    class270.field3679[var203 + -1] = var205;
                    class536.field7369[var203 + -1] = var204;
                    class629.field8556[var203 - 1] = var206 == 0;
                }
                class308.field4138 = null;
                return true;
            } else if (class396.field5663 == class308.field4138) {
                int var207 = class164.field2068.method898((byte) 96);
                int var208 = class164.field2068.method912(0);
                int var209 = class164.field2068.method929(47);
                int var210 = class164.field2068.method898((byte) 96);
                if (class195.method1245(var210, (byte) 125)) {
                    class459.method2595((var208 << 16) - -var207, (byte) 108, var209);
                }
                class308.field4138 = null;
                return true;
            } else if (class649.field9194 == class308.field4138) {
                if (class463.field6333 != null) {
                    class587.method3284(-1, 3954, -1, class72.field935.field6507, false);
                }
                byte[] var211 = new byte[class161.field2037];
                class164.field2068.method746((byte) 95, var211, 0, class161.field2037);
                String var212 = class93.method523(class161.field2037, var211, (byte) -114, 0);
                class509.method2880(class495.field6687, ~class161.field2038 == -2, var212, true, 108);
                class308.field4138 = null;
                return true;
            } else if (class86.field1070 == class308.field4138) {
                class428.field5950 = class164.field2068.method910(-1703526384);
                class276.field3741 = class164.field2068.method957((byte) -73) == 1;
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class208.field2731) {
                class477.method2675(-1, class50.field666);
                class308.field4138 = null;
                return true;
            } else if (class35.field342 == class308.field4138) {
                int var213 = class164.field2068.method948(false);
                int var214 = class164.field2068.method944(702964904);
                int var215 = class164.field2068.method948(false);
                int var216 = class164.field2068.method898((byte) 96);
                int var217 = class164.field2068.method948(false);
                if (class195.method1245(var213, (byte) -106)) {
                    class654.method3622(-1, var216, var215, var217, var214);
                }
                class308.field4138 = null;
                return true;
            } else if (class323.field4729 == class308.field4138) {
                class511.method2893(1000000, class168.field2096);
                class308.field4138 = null;
                return false;
            } else if (class379.field5438 == class308.field4138) {
                int var218 = class164.field2068.method944(702964904);
                int var219 = class164.field2068.method948(false);
                class327.field4771.method2155(7412, var219, var218);
                class308.field4138 = null;
                return true;
            } else if (class462.field6302 == class308.field4138) {
                class144.field1835 = class164.field2068.method942(-124);
                class301.field4019 = class164.field2068.method903(29600) << 3;
                class28.field277 = class164.field2068.method899(11923) << 3;
                for (class397 var220 = (class397) class645.field9141.method2499(-64); var220 != null; var220 = (class397) class645.field9141.method2503(0)) {
                    int var222 = (int) (var220.field272 >> 28 & 3L);
                    int var223 = (int) (var220.field272 & 16383L);
                    int var224 = -class253.field3490 + var223;
                    int var225 = (int) (var220.field272 >> 14 & 16383L);
                    int var226 = -class186.field2280 + var225;
                    if (class144.field1835 == var222 && ~var224 <= ~class301.field4019 && ~(class301.field4019 + 8) < ~var224 && ~class28.field277 >= ~var226 && var226 < class28.field277 - -8) {
                        var220.method175(30604);
                        if (var224 >= 0 && ~var226 <= -1 && ~class588.field8082 < ~var224 && class12.field113 > var226) {
                            class341.method2163(class144.field1835, var224, 0, var226);
                        }
                    }
                }
                for (class192 var221 = (class192) class234.field3049.method374((byte) 102); var221 != null; var221 = (class192) class234.field3049.method372(-20740)) {
                    if (var221.field2493 >= class301.field4019 && var221.field2493 < class301.field4019 + 8 && class28.field277 <= var221.field2487 && class28.field277 + 8 > var221.field2487 && ~class144.field1835 == ~var221.field2496) {
                        var221.field2504 = 0;
                    }
                }
                class308.field4138 = null;
                return true;
            } else if (client.field3006 == class308.field4138) {
                int var227 = class164.field2068.method948(false);
                int var228 = class164.field2068.method948(false);
                if (var228 == 65535) {
                    var228 = -1;
                }
                int var229 = class164.field2068.method930((byte) -66);
                int var230 = class164.field2068.method898((byte) 96);
                int var231 = class164.field2068.method948(false);
                if (~var231 == -65536) {
                    var231 = -1;
                }
                if (class195.method1245(var230, (byte) 116)) {
                    for (int var232 = var231; ~var232 >= ~var228; ++var232) {
                        long var233 = ((long) var229 << 32) + (long) var232;
                        class266 var235 = (class266) class363.field5237.method2506(71, var233);
                        class266 var236;
                        if (var235 == null) {
                            if (~var232 != 0) {
                                var236 = new class266(0, var227);
                            } else {
                                var236 = new class266(class557.method3117(var229, (byte) 71).field2415.field3648, var227);
                            }
                        } else {
                            var236 = new class266(var235.field3648, var227);
                            var235.method175(30604);
                        }
                        class363.field5237.method2504(var233, 122, var236);
                    }
                }
                class308.field4138 = null;
                return true;
            } else if (class464.field6340 == class308.field4138) {
                int var237 = class164.field2068.method957((byte) -109);
                boolean var238 = ~(var237 & 1) == -2;
                String var239 = class164.field2068.method907(false);
                String var240 = class164.field2068.method907(false);
                if (var240.equals("")) {
                    var240 = var239;
                }
                String var241 = class164.field2068.method907(false);
                String var242 = class164.field2068.method907(false);
                if (var242.equals("")) {
                    var242 = var241;
                }
                if (var238) {
                    for (int var243 = 0; class641.field8818 > var243; ++var243) {
                        if (class207.field2698[var243].equals(var242)) {
                            class353.field5147[var243] = var239;
                            class207.field2698[var243] = var240;
                            class291.field3892[var243] = var241;
                            class623.field8473[var243] = var242;
                            break;
                        }
                    }
                } else {
                    class353.field5147[class641.field8818] = var239;
                    class207.field2698[class641.field8818] = var240;
                    class291.field3892[class641.field8818] = var241;
                    class623.field8473[class641.field8818] = var242;
                    class42.field550[class641.field8818] = ~class230.method1424(var237, 2) == -3;
                    ++class641.field8818;
                }
                class308.field4138 = null;
                class309.field4142 = class141.field1800;
                return true;
            } else if (class612.field8326 == class308.field4138) {
                class301.field4019 = class164.field2068.method899(11923) << 3;
                class144.field1835 = class164.field2068.method957((byte) -124);
                class28.field277 = class164.field2068.method899(11923) << 3;
                while (~class164.field2068.field1745 > ~class161.field2037) {
                    class446 var244 = class336.method2147((byte) -59)[class164.field2068.method957((byte) -105)];
                    class477.method2675(-1, var244);
                }
                class308.field4138 = null;
                return true;
            } else if (class690.field9741 == class308.field4138) {
                class477.field6442 = ~class161.field2037 < -3 ? class164.field2068.method907(false) : class243.field3237.method1491(class350.field5121, (byte) 127);
                class188.field2422 = ~class161.field2037 >= -1 ? -1 : class164.field2068.method922((byte) -114);
                class308.field4138 = null;
                if (class188.field2422 == 65535) {
                    class188.field2422 = -1;
                }
                return true;
            } else if (class425.field5917 == class308.field4138) {
                class309.field4142 = class141.field1800;
                class308.field4138 = null;
                class99.field1209 = 1;
                return true;
            } else if (class659.field9287 == class308.field4138) {
                class477.method2675(-1, class341.field5006);
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class252.field3469) {
                String var245 = class164.field2068.method907(false);
                String var246 = class549.method3089(class328.method2104(false, class164.field2068), true);
                class334.method2133(var245, 6, var245, var246, 0, -50, var245);
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class22.field207) {
                class477.method2675(-1, class165.field2075);
                class308.field4138 = null;
                return true;
            } else if (class581.field8014 == class308.field4138) {
                class477.method2675(-1, class433.field6007);
                class308.field4138 = null;
                return true;
            } else if (class421.field5866 == class308.field4138) {
                int var247 = class164.field2068.method922((byte) -118);
                int var248 = class164.field2068.method957((byte) -86);
                boolean var249 = (var248 & 1) == 1;
                while (~class161.field2037 < ~class164.field2068.field1745) {
                    int var250 = class164.field2068.method914(-29);
                    int var251 = class164.field2068.method922((byte) -120);
                    int var252 = 0;
                    if (~var251 != -1) {
                        var252 = class164.field2068.method957((byte) -65);
                        if (var252 == 255) {
                            var252 = class164.field2068.method943(-114);
                        }
                    }
                    class690.method3821(var252, var247, 0, var249, var250, var251 - 1);
                }
                class519.field7186[class230.method1424(class492.field6662++, 31)] = var247;
                class308.field4138 = null;
                return true;
            } else if (client.field3008 == class308.field4138) {
                int var253 = class164.field2068.method922((byte) -119);
                int var254 = class164.field2068.method943(-106);
                if (class195.method1245(var253, (byte) 124)) {
                    class524 var255 = (class524) class54.field742.method2506(21, (long) var254);
                    if (var255 != null) {
                        class63.method389(true, false, var255, -93);
                    }
                    if (class12.field114 != null) {
                        class553.method3100(class12.field114, 0);
                        class12.field114 = null;
                    }
                }
                class308.field4138 = null;
                return true;
            } else if (class494.field6682 == class308.field4138) {
                int var256 = class164.field2068.method943(-95);
                int var257 = class164.field2068.method943(-102);
                int var258 = class164.field2068.method912(0);
                if (class195.method1245(var258, (byte) -103)) {
                    class524 var259 = (class524) class54.field742.method2506(116, (long) var256);
                    class524 var260 = (class524) class54.field742.method2506(26, (long) var257);
                    if (var260 != null) {
                        class63.method389(var259 == null || ~var259.field7256 != ~var260.field7256, false, var260, -87);
                    }
                    if (var259 != null) {
                        var259.method175(30604);
                        class54.field742.method2504((long) var257, -20, var259);
                    }
                    class188 var261 = class557.method3117(var256, (byte) 71);
                    if (var261 != null) {
                        class553.method3100(var261, 0);
                    }
                    class188 var262 = class557.method3117(var257, (byte) 71);
                    if (var262 != null) {
                        class553.method3100(var262, 0);
                        class59.method370(66, true, var262);
                    }
                    if (class316.field4599 != -1) {
                        class175.method1162(1, 2, class316.field4599);
                    }
                }
                class308.field4138 = null;
                return true;
            } else if (class664.field9415 == class308.field4138) {
                int var263 = class164.field2068.method942(108);
                int var264 = class164.field2068.method957((byte) -71);
                if (var263 == 255) {
                    var264 = -1;
                    var263 = -1;
                }
                class648.method3598((byte) 113, var263, var264);
                class308.field4138 = null;
                return true;
            } else if (class679.field9644 == class308.field4138) {
                class477.method2675(-1, class420.field5861);
                class308.field4138 = null;
                return true;
            } else if (class308.field4138 == class186.field2283) {
                int var265 = class164.field2068.method930((byte) -95);
                int var266 = class164.field2068.method929(36);
                int var267 = class164.field2068.method948(false);
                int var268 = class164.field2068.method922((byte) -120);
                if (class195.method1245(var268, (byte) 79)) {
                    class530.method3011(var266, 5, false, var267, var265);
                }
                class308.field4138 = null;
                return true;
            } else if (class430.field5982 == class308.field4138) {
                int var269 = class164.field2068.method898((byte) 96);
                if (var269 == 65535) {
                    var269 = -1;
                }
                int var270 = class164.field2068.method930((byte) -63);
                int var271 = class164.field2068.method898((byte) 96);
                int var272 = class164.field2068.method948(false);
                if (~var272 == -65536) {
                    var272 = -1;
                }
                int var273 = class164.field2068.method944(702964904);
                if (class195.method1245(var271, (byte) -87)) {
                    for (int var274 = var272; ~var274 >= ~var269; ++var274) {
                        long var275 = ((long) var270 << 32) - -((long) var274);
                        class266 var277 = (class266) class363.field5237.method2506(71, var275);
                        class266 var278;
                        if (var277 == null) {
                            if (var274 != -1) {
                                var278 = new class266(var273, -1);
                            } else {
                                var278 = new class266(var273, class557.method3117(var270, (byte) 71).field2415.field3647);
                            }
                        } else {
                            var278 = new class266(var273, var277.field3647);
                            var277.method175(30604);
                        }
                        class363.field5237.method2504(var275, 119, var278);
                    }
                }
                class308.field4138 = null;
                return true;
            } else if (class78.field976 == class308.field4138) {
                int var279 = class164.field2068.method922((byte) -125);
                int var280 = class164.field2068.method957((byte) -75);
                int var281 = class164.field2068.method957((byte) -99);
                int var282 = class164.field2068.method922((byte) -122) << 2;
                int var283 = class164.field2068.method957((byte) -82);
                int var284 = class164.field2068.method957((byte) -63);
                if (class195.method1245(var279, (byte) -125)) {
                    class442.method2533(var284, var283, var282, var281, var280, true, -109);
                }
                class308.field4138 = null;
                return true;
            } else {
                int var285 = -72 / ((arg0 - 55) / 45);
                if (class308.field4138 == class273.field3701) {
                    class217.field2795 = class164.field2068.method924(2);
                    class308.field4138 = null;
                    class451.field6151 = class141.field1800;
                    return true;
                } else if (class308.field4138 == class187.field2290) {
                    class327.field4771.method2154(true);
                    class308.field4138 = null;
                    class341.field5016 += 32;
                    return true;
                } else if (class339.field4961 == class308.field4138) {
                    int var286 = class164.field2068.method922((byte) -121);
                    int var287 = class164.field2068.method943(-127);
                    int var288 = class164.field2068.method948(false);
                    if (class195.method1245(var288, (byte) -73)) {
                        class520.method2966(var287, (byte) 127, var286);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class506.field6839 == class308.field4138) {
                    class477.method2675(-1, class107.field1296);
                    class308.field4138 = null;
                    return true;
                } else if (class312.field4368 == class308.field4138) {
                    int var289 = class164.field2068.method922((byte) -128);
                    int var290 = class164.field2068.method930((byte) -68);
                    if (class195.method1245(var289, (byte) -71)) {
                        class530.method3011(0, 5, false, class224.field2907, var290);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class626.field8519 == class308.field4138) {
                    int var291 = class164.field2068.method922((byte) -118);
                    if (class195.method1245(var291, (byte) -78)) {
                        class177.method1166(0);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class579.field8001 == class308.field4138) {
                    int var292 = class164.field2068.method922((byte) -128);
                    if (~var292 == -65536) {
                        var292 = -1;
                    }
                    int var293 = class164.field2068.method957((byte) -66);
                    int var294 = class164.field2068.method922((byte) -118);
                    int var295 = class164.field2068.method957((byte) -75);
                    class411.method2410(true, var295, var292, var293, var294);
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class15.field125) {
                    int var296 = class164.field2068.method948(false);
                    int var297 = class164.field2068.method929(-107);
                    int var298 = class164.field2068.method922((byte) -113);
                    int var299 = class164.field2068.method922((byte) -124);
                    int var300 = class164.field2068.method912(0);
                    if (class195.method1245(var298, (byte) 115)) {
                        class530.method3011(var300, 7, false, var299 << 16 | var296, var297);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class261.field3602) {
                    int var301 = class164.field2068.method957((byte) -116);
                    int var302 = class164.field2068.method948(false);
                    if (var302 == 65535) {
                        var302 = -1;
                    }
                    int var303 = class164.field2068.method957((byte) -98);
                    class503.method2849(0, var302, var303, var301);
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class194.field2516) {
                    int var304 = class164.field2068.method935(255);
                    int var305 = class164.field2068.method922((byte) -115);
                    if (var305 == 65535) {
                        var305 = -1;
                    }
                    int var306 = class164.field2068.method942(124);
                    class672.method3718(-64, var305, var306, var304);
                    class308.field4138 = null;
                    return true;
                } else if (class314.field4519 == class308.field4138) {
                    int var307 = class164.field2068.method922((byte) -121);
                    String var308 = class164.field2068.method907(false);
                    Object[] var309 = new Object[var308.length() + 1];
                    for (int var310 = var308.length() - 1; ~var310 <= -1; --var310) {
                        if (var308.charAt(var310) == 's') {
                            var309[var310 + 1] = class164.field2068.method907(false);
                        } else {
                            var309[var310 + 1] = new Integer(class164.field2068.method943(-76));
                        }
                    }
                    var309[0] = new Integer(class164.field2068.method943(-95));
                    if (class195.method1245(var307, (byte) 123)) {
                        class425 var311 = new class425();
                        var311.field5913 = var309;
                        class317.method2051(var311);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class413.field5787 == class308.field4138) {
                    int var312 = class164.field2068.method948(false);
                    byte var313 = class164.field2068.method903(29600);
                    class327.field4771.method2155(7412, var312, var313);
                    class308.field4138 = null;
                    return true;
                } else if (class666.field9470 == class308.field4138) {
                    if (class20.method113(74, class476.field6436)) {
                        class412.field5780 = (int) ((float) class164.field2068.method922((byte) -124) * 2.5F);
                    } else {
                        class412.field5780 = class164.field2068.method922((byte) -116) * 30;
                    }
                    class451.field6151 = class141.field1800;
                    class308.field4138 = null;
                    return true;
                } else if (class365.field5244 == class308.field4138) {
                    for (int var314 = 0; ~class292.field3912.length < ~var314; ++var314) {
                        if (class292.field3912[var314] != null) {
                            class292.field3912[var314].field459 = -1;
                        }
                    }
                    for (int var315 = 0; ~class327.field4786 < ~var315; ++var315) {
                        class42.field541[var315].field8702.field459 = -1;
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class355.field5171 == class308.field4138) {
                    int var316 = class164.field2068.method942(123);
                    int var317 = class164.field2068.method898((byte) 96);
                    if (class195.method1245(var317, (byte) -107)) {
                        class9.field98 = var316;
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class629.field8549 == class308.field4138) {
                    boolean var318 = ~class164.field2068.method957((byte) -115) == -2;
                    String var319 = class164.field2068.method907(false);
                    String var320 = var319;
                    if (var318) {
                        var320 = class164.field2068.method907(false);
                    }
                    long var321 = (long) class164.field2068.method922((byte) -126);
                    long var323 = (long) class164.field2068.method904(118);
                    int var325 = class164.field2068.method957((byte) -72);
                    long var326 = (var321 << 32) + var323;
                    boolean var328 = false;
                    int var329 = 0;
                    while (true) {
                        if (var329 >= 100) {
                            if (var325 <= 1) {
                                if ((!class276.field3741 || class205.field2682) && !class283.field3832) {
                                    if (class559.method3124(-108, var320)) {
                                        var328 = true;
                                    }
                                } else {
                                    var328 = true;
                                }
                            }
                            break;
                        }
                        if (class484.field6545[var329] == var326) {
                            var328 = true;
                            break;
                        }
                        ++var329;
                    }
                    if (!var328 && class557.field7604 == 0) {
                        class484.field6545[class632.field8585] = var326;
                        class632.field8585 = (class632.field8585 + 1) % 100;
                        String var330 = class549.method3089(class328.method2104(false, class164.field2068), true);
                        if (~var325 == -3) {
                            class537.method3033(-1, (String) null, 7, var330, -41, var319, "<img=1>" + var320, 0, "<img=1>" + var319);
                        } else if (var325 == 1) {
                            class537.method3033(-1, (String) null, 7, var330, -77, var319, "<img=0>" + var320, 0, "<img=0>" + var319);
                        } else {
                            class537.method3033(-1, (String) null, 3, var330, -94, var319, var320, 0, var319);
                        }
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class454.field6198 == class308.field4138) {
                    int var331 = class164.field2068.method943(-118);
                    int var332 = class164.field2068.method957((byte) -73);
                    int var333 = class164.field2068.method936((byte) -31);
                    class177.field2216[var333] = var331;
                    class545.field7476[var333] = var332;
                    class518.field7146[var333] = 1;
                    int var334 = class480.field6470[var333] - 1;
                    for (int var335 = 0; var334 > var335; ++var335) {
                        if (class575.field7960[var335] <= var331) {
                            class518.field7146[var333] = var335 + 2;
                        }
                    }
                    class283.field3828[class230.method1424(31, class375.field5399++)] = var333;
                    class308.field4138 = null;
                    return true;
                } else if (class79.field998 == class308.field4138) {
                    class652.field9246 = class164.field2068.method957((byte) -122);
                    class308.field4138 = null;
                    class451.field6151 = class141.field1800;
                    return true;
                } else if (class430.field5978 == class308.field4138) {
                    class164.field2068.field1745 += 28;
                    if (class164.field2068.method940(4)) {
                        class109.method580(class164.field2068, class164.field2068.field1745 + -28, -1);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class16.field138) {
                    class477.method2675(-1, class299.field3996);
                    class308.field4138 = null;
                    return true;
                } else if (class612.field8351 == class308.field4138) {
                    boolean var336 = class164.field2068.method957((byte) -72) == 1;
                    String var337 = class164.field2068.method907(false);
                    String var338 = var337;
                    if (var336) {
                        var338 = class164.field2068.method907(false);
                    }
                    int var339 = class164.field2068.method957((byte) -94);
                    boolean var340 = false;
                    if (var339 <= 1) {
                        if ((!class276.field3741 || class205.field2682) && !class283.field3832) {
                            if (var339 <= 1 && class559.method3124(-128, var338)) {
                                var340 = true;
                            }
                        } else {
                            var340 = true;
                        }
                    }
                    if (!var340 && ~class557.field7604 == -1) {
                        String var341 = class549.method3089(class328.method2104(false, class164.field2068), true);
                        if (var339 == 2) {
                            class537.method3033(-1, (String) null, 24, var341, -89, var337, "<img=1>" + var338, 0, "<img=1>" + var337);
                        } else if (~var339 != -2) {
                            class537.method3033(-1, (String) null, 24, var341, -48, var337, var338, 0, var337);
                        } else {
                            class537.method3033(-1, (String) null, 24, var341, -72, var337, "<img=0>" + var338, 0, "<img=0>" + var337);
                        }
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class24.field234) {
                    boolean var342 = ~class164.field2068.method957((byte) -124) == -2;
                    String var343 = class164.field2068.method907(false);
                    String var344 = var343;
                    if (var342) {
                        var344 = class164.field2068.method907(false);
                    }
                    int var345 = class164.field2068.method957((byte) -90);
                    int var346 = class164.field2068.method922((byte) -124);
                    boolean var347 = false;
                    if (var345 <= 1 && class559.method3124(-95, var344)) {
                        var347 = true;
                    }
                    if (!var347 && ~class557.field7604 == -1) {
                        String var348 = class673.field9539.method2804(27993, var346).method3233(-94, class164.field2068);
                        if (var345 != 2) {
                            if (~var345 != -2) {
                                class537.method3033(var346, (String) null, 25, var348, -121, var343, var344, 0, var343);
                            } else {
                                class537.method3033(var346, (String) null, 25, var348, -120, var343, "<img=0>" + var344, 0, "<img=0>" + var343);
                            }
                        } else {
                            class537.method3033(var346, (String) null, 25, var348, -51, var343, "<img=1>" + var344, 0, "<img=1>" + var343);
                        }
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class251.field3386) {
                    class140.field1791 = class164.field2068.method936((byte) -31);
                    class127.field1619 = class164.field2068.method928(-119);
                    class308.field4138 = null;
                    return true;
                } else if (class413.field5800 == class308.field4138) {
                    class477.method2675(-1, class579.field7998);
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class244.field3284) {
                    int var349 = class164.field2068.method922((byte) -128);
                    int var350 = class164.field2068.method957((byte) -126);
                    int var351 = class164.field2068.method957((byte) -89);
                    int var352 = class164.field2068.method957((byte) -84);
                    int var353 = class164.field2068.method957((byte) -98);
                    int var354 = class164.field2068.method922((byte) -114);
                    if (class195.method1245(var349, (byte) -46)) {
                        class676.field9596[var350] = true;
                        class18.field158[var350] = var351;
                        class394.field5655[var350] = var352;
                        class505.field6826[var350] = var353;
                        class503.field6815[var350] = var354;
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class547.field7485 == class308.field4138) {
                    int var355 = class164.field2068.method898((byte) 96);
                    int var356 = class164.field2068.method912(0);
                    if (~var356 == -65536) {
                        var356 = -1;
                    }
                    int var357 = class164.field2068.method929(-87);
                    if (class195.method1245(var355, (byte) 120)) {
                        class530.method3011(-1, 2, false, var356, var357);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class131.field1674) {
                    class477.method2675(-1, class410.field5752);
                    class308.field4138 = null;
                    return true;
                } else if (class459.field6245 == class308.field4138) {
                    class374.method2284(class495.field6687, class161.field2037, (byte) -38, class164.field2068);
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class129.field1638) {
                    class268.method1653(class161.field2037, class164.field2068, 0);
                    class308.field4138 = null;
                    return true;
                } else if (class533.field7352 == class308.field4138) {
                    int var358 = class164.field2068.method912(0);
                    byte var359 = class164.field2068.method899(11923);
                    int var360 = class164.field2068.method948(false);
                    if (class195.method1245(var358, (byte) 112)) {
                        class569.method3208(var359, 1, var360);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class370.field5320 == class308.field4138) {
                    class308.field4138 = null;
                    return false;
                } else if (class628.field8538 == class308.field4138) {
                    int var361 = class164.field2068.method898((byte) 96);
                    int var362 = class164.field2068.method943(-116);
                    if (class195.method1245(var361, (byte) 102)) {
                        class530.method3011(-1, 3, false, -1, var362);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class235.field3060) {
                    class157.field1971 = class141.field1800;
                    if (~class161.field2037 == -1) {
                        class624.field8496 = null;
                        class308.field4138 = null;
                        class21.field192 = null;
                        class34.field328 = null;
                        class35.field341 = 0;
                        return true;
                    } else {
                        class34.field328 = class164.field2068.method907(false);
                        boolean var363 = class164.field2068.method957((byte) -127) == 1;
                        if (var363) {
                            class164.field2068.method907(false);
                        }
                        long var364 = class164.field2068.method949(112);
                        class21.field192 = class98.method538(var364, 93);
                        class383.field5572 = class164.field2068.method950(false);
                        int var366 = class164.field2068.method957((byte) -65);
                        if (~var366 == -256) {
                            class308.field4138 = null;
                            return true;
                        } else {
                            class35.field341 = var366;
                            class80[] var367 = new class80[100];
                            for (int var368 = 0; ~var368 > ~class35.field341; ++var368) {
                                var367[var368] = new class80();
                                var367[var368].field1016 = class164.field2068.method907(false);
                                boolean var374 = ~class164.field2068.method957((byte) -123) == -2;
                                if (!var374) {
                                    var367[var368].field1008 = var367[var368].field1016;
                                } else {
                                    var367[var368].field1008 = class164.field2068.method907(false);
                                }
                                var367[var368].field1010 = class303.method1825(var367[var368].field1008, 1);
                                var367[var368].field1009 = class164.field2068.method922((byte) -113);
                                var367[var368].field1007 = class164.field2068.method950(false);
                                var367[var368].field1015 = class164.field2068.method907(false);
                                if (var367[var368].field1008.equals(class596.field8164.field7191)) {
                                    class554.field7579 = var367[var368].field1007;
                                }
                            }
                            boolean var369 = false;
                            int var370 = class35.field341;
                            while (var370 > 0) {
                                boolean var371 = true;
                                --var370;
                                for (int var372 = 0; ~var370 < ~var372; ++var372) {
                                    if (var367[var372].field1010.compareTo(var367[var372 + 1].field1010) > 0) {
                                        class80 var373 = var367[var372];
                                        var367[var372] = var367[var372 + 1];
                                        var371 = false;
                                        var367[var372 - -1] = var373;
                                    }
                                }
                                if (var371) {
                                    break;
                                }
                            }
                            class624.field8496 = var367;
                            class308.field4138 = null;
                            return true;
                        }
                    }
                } else if (class308.field4138 == class294.field3935) {
                    int var375 = class164.field2068.method922((byte) -117);
                    if (class195.method1245(var375, (byte) -80)) {
                        class401.method2364(26061);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class2.field11) {
                    boolean var376 = class164.field2068.method957((byte) -90) == 1;
                    String var377 = class164.field2068.method907(false);
                    String var378 = var377;
                    if (var376) {
                        var378 = class164.field2068.method907(false);
                    }
                    long var379 = class164.field2068.method949(124);
                    long var381 = (long) class164.field2068.method922((byte) -116);
                    long var383 = (long) class164.field2068.method904(119);
                    int var385 = class164.field2068.method957((byte) -83);
                    int var386 = class164.field2068.method922((byte) -120);
                    long var387 = (var381 << 32) + var383;
                    boolean var389 = false;
                    int var390 = 0;
                    while (true) {
                        if (var390 >= 100) {
                            if (~var385 >= -2 && class559.method3124(-115, var378)) {
                                var389 = true;
                            }
                            break;
                        }
                        if (~class484.field6545[var390] == ~var387) {
                            var389 = true;
                            break;
                        }
                        ++var390;
                    }
                    if (!var389 && ~class557.field7604 == -1) {
                        class484.field6545[class632.field8585] = var387;
                        class632.field8585 = (class632.field8585 + 1) % 100;
                        String var391 = class673.field9539.method2804(27993, var386).method3233(16, class164.field2068);
                        if (var385 != 2) {
                            if (~var385 == -2) {
                                class537.method3033(var386, class443.method2547(var379, 0), 20, var391, -83, var377, "<img=0>" + var378, 0, "<img=0>" + var377);
                            } else {
                                class537.method3033(var386, class443.method2547(var379, 0), 20, var391, -104, var377, var378, 0, var377);
                            }
                        } else {
                            class537.method3033(var386, class443.method2547(var379, 0), 20, var391, -67, var377, "<img=1>" + var378, 0, "<img=1>" + var377);
                        }
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class218.field2824) {
                    int var392 = class164.field2068.method922((byte) -119);
                    int var393 = class164.field2068.method929(110);
                    int var394 = class164.field2068.method928(-117);
                    if (class195.method1245(var392, (byte) -90)) {
                        class421.method2441((byte) 33, var394, var393);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class441.field6069 == class308.field4138) {
                    class477.method2675(-1, class440.field6063);
                    class308.field4138 = null;
                    return true;
                } else if (class609.field8306 == class308.field4138) {
                    int var395 = class164.field2068.method922((byte) -125);
                    int var396 = class164.field2068.method948(false);
                    int var397 = class164.field2068.method922((byte) -119);
                    if (class195.method1245(var396, (byte) 112)) {
                        class417.method2423(125, var395, var397, 0);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class132.field1678) {
                    int var398 = class164.field2068.method922((byte) -120);
                    int var399 = class164.field2068.method957((byte) -100);
                    int var400 = class164.field2068.method957((byte) -118);
                    int var401 = class164.field2068.method922((byte) -119) << 2;
                    int var402 = class164.field2068.method957((byte) -92);
                    int var403 = class164.field2068.method957((byte) -84);
                    if (class195.method1245(var398, (byte) 117)) {
                        class363.method2231(var403, var399, var400, var402, var401, 126);
                    }
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class22.field217) {
                    int var404 = class164.field2068.method922((byte) -114);
                    if (~var404 == -65536) {
                        var404 = -1;
                    }
                    int var405 = class164.field2068.method957((byte) -120);
                    int var406 = class164.field2068.method922((byte) -119);
                    int var407 = class164.field2068.method957((byte) -66);
                    class683.method3780(var404, false, var406, false, var407, var405);
                    class308.field4138 = null;
                    return true;
                } else if (class548.field7495 == class308.field4138) {
                    class79.method456(121, class164.field2068.method907(false));
                    class308.field4138 = null;
                    return true;
                } else if (class679.field9648 == class308.field4138) {
                    class477.method2675(-1, field2118);
                    class308.field4138 = null;
                    return true;
                } else if (class308.field4138 == class29.field281) {
                    int var408 = class164.field2068.method922((byte) -121);
                    if (var408 == 65535) {
                        var408 = -1;
                    }
                    int var409 = class164.field2068.method957((byte) -123);
                    int var410 = class164.field2068.method922((byte) -124);
                    int var411 = class164.field2068.method957((byte) -98);
                    class683.method3780(var408, true, var410, false, var411, var409);
                    class308.field4138 = null;
                    return true;
                } else if (class87.field1075 == class308.field4138) {
                    class468.method2642(true, 0);
                    class308.field4138 = null;
                    return true;
                } else if (class516.field7079 == class308.field4138) {
                    class477.method2675(-1, class679.field9658);
                    class308.field4138 = null;
                    return true;
                } else if (class349.field5101 != class308.field4138) {
                    if (class545.field7474 == class308.field4138) {
                        class477.method2675(-1, class49.field660);
                        class308.field4138 = null;
                        return true;
                    } else {
                        class282.method1694("T1 - " + (class308.field4138 == null ? -1 : class308.field4138.method2056(52)) + "," + (class143.field1819 != null ? class143.field1819.method2056(60) : -1) + "," + (class99.field1210 != null ? class99.field1210.method2056(98) : -1) + " - " + class161.field2037, (byte) 47, (Throwable) null);
                        class511.method2893(1000000, false);
                        return true;
                    }
                } else {
                    boolean var412 = class164.field2068.method957((byte) -118) == 1;
                    String var413 = class164.field2068.method907(false);
                    String var414 = var413;
                    if (var412) {
                        var414 = class164.field2068.method907(false);
                    }
                    long var415 = (long) class164.field2068.method922((byte) -118);
                    long var417 = (long) class164.field2068.method904(116);
                    int var419 = class164.field2068.method957((byte) -62);
                    int var420 = class164.field2068.method922((byte) -117);
                    long var421 = (var415 << 32) + var417;
                    boolean var423 = false;
                    int var424 = 0;
                    while (true) {
                        if (var424 >= 100) {
                            if (~var419 >= -2 && class559.method3124(-120, var414)) {
                                var423 = true;
                            }
                            break;
                        }
                        if (~class484.field6545[var424] == ~var421) {
                            var423 = true;
                            break;
                        }
                        ++var424;
                    }
                    if (!var423 && class557.field7604 == 0) {
                        class484.field6545[class632.field8585] = var421;
                        class632.field8585 = (class632.field8585 + 1) % 100;
                        String var425 = class673.field9539.method2804(27993, var420).method3233(-99, class164.field2068);
                        if (~var419 == -3) {
                            class537.method3033(var420, (String) null, 18, var425, -128, var413, "<img=1>" + var414, 0, "<img=1>" + var413);
                        } else if (var419 == 1) {
                            class537.method3033(var420, (String) null, 18, var425, -30, var413, "<img=0>" + var414, 0, "<img=0>" + var413);
                        } else {
                            class537.method3033(var420, (String) null, 18, var425, -34, var413, var414, 0, var413);
                        }
                    }
                    class308.field4138 = null;
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lpea;Lpba;)V", line = 3289)
    public class170(class641 arg0, class472 arg1) {
        super(arg0);
        this.field2127 = arg1;
        if (this.field2127.field6388 != null && super.field7145.field9041 && super.field7145.field9071) {
            class216 var3 = class506.method2862(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 16686, super.field7145);
            class216 var4 = class506.method2862(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 16686, super.field7145);
            this.field2125 = class529.method3008((byte) -108, new class216[] { var3, var4 }, super.field7145);
            this.field2128 = this.field2125 != null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V", line = 3310)
    public final void method1133(boolean arg0, int arg1) {
        if (arg1 > 79) {
            ++field2120;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZI)V", line = 3320)
    public final void method1134(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method1134(85, false, 34);
        }
        ++field2117;
        if (this.field2121) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            float var8 = (float) ((8110669 & arg2) >> 19) / 16.0F;
            float var9 = (float) (15 & arg2 >> 23) / 16.0F;
            int var10 = arg2 >> 27 & 15;
            long var11 = this.field2125.field7719;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field7145.field8943 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIZIBIF)[I", line = 3359)
    public static final int[] method1135(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6, float arg7) {
        ++field2129;
        if (arg5 != 23) {
            field2118 = null;
        }
        int[] var8 = new int[arg6];
        class541 var9 = new class541();
        var9.field7409 = arg4;
        var9.field7415 = arg1;
        var9.field7400 = arg2;
        var9.field7404 = arg3;
        var9.field7408 = arg0;
        var9.field7399 = (int) (arg7 * 4096.0F);
        var9.method11((byte) -63);
        class261.method1635(arg5 ^ -66, arg6, 1);
        var9.method3047(var8, 0, 4095);
        return var8;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V", line = 3383)
    public static void method1136(boolean arg0) {
        field2119 = null;
        field2126 = null;
        field2118 = null;
        if (arg0) {
            method1135(111, 25, 90, false, -79, (byte) -64, -37, 0.24120012F);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 3397)
    public final void method1137(int arg0) {
        if (arg0 != 6) {
            this.method1133(false, -89);
        }
        ++field2130;
        if (this.field2121) {
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3553((byte) 42, (class254) null);
            super.field7145.method3488(0, (byte) 23);
            super.field7145.method3553((byte) 31, (class254) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2121 = false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLwq;I)V", line = 3425)
    public final void method1138(byte arg0, class254 arg1, int arg2) {
        if (arg0 != 75) {
            field2126 = null;
        }
        ++field2122;
        if (!this.field2121) {
            super.field7145.method3553((byte) -89, arg1);
            super.field7145.method3524(arg2, 14);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZB)V", line = 3447)
    public final void method1139(boolean arg0, byte arg1) {
        ++field2123;
        if (arg1 != 127) {
            method1135(-22, -82, 114, true, 85, (byte) 59, 22, -0.30437967F);
        }
        class322 var3 = super.field7145.method3528(arg1 ^ -22);
        if (this.field2128 && var3 != null) {
            float var4 = 1.0F + 2.0F * (-Math.abs(super.field7145.field8989[1]) + 1.0F);
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3553((byte) -100, var3);
            super.field7145.method3488(0, (byte) 23);
            super.field7145.method3553((byte) -89, this.field2127.field6388);
            long var5 = this.field2125.field7719;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field7145.field8989[0], -super.field7145.field8989[1], -super.field7145.field8989[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field7145.field9052 * var4, super.field7145.field8975 * var4, super.field7145.field9061 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + 928.0F * Math.abs(super.field7145.field8989[1]));
            this.field2121 = true;
        }
    }
}
