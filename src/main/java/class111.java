import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class111 extends class11 {

    @OriginalMember(owner = "client!aq", name = "P", descriptor = "Lqp;")
    public static class466 field1674 = new class466("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "[Lvf;")
    public static class104[] field1676 = new class104[14];

    @OriginalMember(owner = "client!aq", name = "G", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!aq", name = "I", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!aq", name = "L", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!aq", name = "N", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!aq", name = "O", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!aq", name = "S", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!aq", name = "Q", descriptor = "Lva;")
    public static class343 field1675;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(IIB)V")
    private final void method803(int arg0, int arg1, byte arg2) {
        ++field1668;
        if (arg2 != -40) {
            field1676 = null;
        }
        int var4 = class448.field6606[arg1];
        int var5 = class328.field4484[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class37.field461 = arg1;
            class5.field54 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class37.field461 = arg0;
            class5.field54 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class37.field461 = class90.field1316 - arg0;
            class5.field54 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class5.field54 = class508.field7537 - arg0;
            class37.field461 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class37.field461 = -arg1 + class90.field1316;
            class5.field54 = -arg0 + class508.field7537;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class37.field461 = class90.field1316 - arg0;
            class5.field54 = -arg1 + class508.field7537;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class37.field461 = arg0;
            class5.field54 = -arg1 + class508.field7537;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class37.field461 = class90.field1316 - arg1;
            class5.field54 = arg0;
        }
        class37.field461 &= class99.field1490;
        class5.field54 &= class183.field2683;
    }

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)V")
    public static void method804(int arg0) {
        field1674 = null;
        if (arg0 == 2) {
            field1676 = null;
            field1675 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lmg;ILmg;)V")
    public static final void method805(class101 arg0, int arg1, class101 arg2) {
        class204.field2872 = arg2;
        if (arg1 == 2) {
            class204.field2870 = arg0;
            ++field1673;
        }
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field1669;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            for (int var4 = 0; ~class90.field1316 < ~var4; ++var4) {
                this.method803(arg1, var4, (byte) -40);
                int[] var5 = this.method48(class5.field54, 0, (byte) -70);
                var3[var4] = var5[class37.field461];
            }
        }
        if (arg0 > -42) {
            field1676 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
    public class111() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg1 > -40) {
            field1676 = null;
        }
        if (arg2 == 0) {
            super.field167 = ~arg0.method2348(-2) == -2;
        }
        ++field1670;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1667;
        if (arg8 != 24294) {
            field1674 = null;
        }
        if (class256.method1534(32554, arg4)) {
            if (class421.field6175[arg4] == null) {
                client.method1220(class495.field7226[arg4], -1, arg3, arg5, arg0, arg1, arg2, arg6, arg7, arg9);
            } else {
                client.method1220(class421.field6175[arg4], -1, arg3, arg5, arg0, arg1, arg2, arg6, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method807(int arg0, String arg1, int arg2) {
        ++class414.field6039;
        class491.method2878((byte) 92, class318.field4358);
        ++field1677;
        class481.field7027.method2302(arg2 ^ -3, arg2 - -class252.method1507(arg1, true));
        class481.field7027.method2349(arg1, true);
        class481.field7027.method2316(arg0, (byte) -111);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIZ)V")
    public static final void method808(int arg0, int arg1, boolean arg2) {
        ++field1671;
        class128 var3 = class507.method3024(arg0, arg2, arg1 ^ 2147458226);
        if (var3 != null) {
            if (arg1 != -25422) {
                method805((class101) null, -98, (class101) null);
            }
            for (int var4 = 0; var3.field1893.length > var4; ++var4) {
                var3.field1893[var4] = -1;
                var3.field1902[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)[[I")
    public final int[][] method41(int arg0, int arg1) {
        ++field1666;
        int var3 = -21 / ((arg0 - -75) / 49);
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class90.field1316 < ~var8; ++var8) {
                this.method803(arg1, var8, (byte) -40);
                int[][] var9 = this.method49(class5.field54, 0, 117);
                var5[var8] = var9[0][class37.field461];
                var6[var8] = var9[1][class37.field461];
                var7[var8] = var9[2][class37.field461];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)V")
    public static final void method809(int arg0) {
        ++field1672;
        if (class459.field6727 != arg0 && ~class459.field6727 != -6) {
            try {
                if (~(++class59.field719) < -2001) {
                    if (class33.field438 != null) {
                        class33.field438.method2839(arg0 + -20828);
                        class33.field438 = null;
                    }
                    if (class401.field5887 >= 1) {
                        class459.field6727 = 0;
                        class154.field2357 = -5;
                        return;
                    }
                    ++class401.field5887;
                    class59.field719 = 0;
                    class459.field6727 = 1;
                    if (~class314.field4277 != ~class27.field353) {
                        class314.field4277 = class27.field353;
                    } else {
                        class314.field4277 = class223.field3177;
                    }
                }
                if (class459.field6727 == 1) {
                    class85.field1262 = class202.field2840.method2952(class314.field4277, false, class494.field7216);
                    class459.field6727 = 2;
                }
                if (~class459.field6727 == -3) {
                    if (class85.field1262.field667 == 2) {
                        throw new IOException();
                    }
                    if (class85.field1262.field667 != 1) {
                        return;
                    }
                    class33.field438 = new class483((Socket) class85.field1262.field670, class202.field2840);
                    class85.field1262 = null;
                    long var1 = class377.field5531 = class506.method3021(-1453, class491.field7167);
                    int var3 = (int) (31L & var1 >> 16);
                    class481.field7027.field5719 = 0;
                    class481.field7027.method2302(-4, class141.field2016.field311);
                    class481.field7027.method2302(-4, var3);
                    class33.field438.method2835((byte) 78, 2, class481.field7027.field5678, 0);
                    class67.method570(arg0 + -30266);
                    int var4 = class33.field438.method2844(arg0 ^ -103);
                    class67.method570(-30266);
                    if (var4 != 0) {
                        class154.field2357 = var4;
                        class459.field6727 = 0;
                        class33.field438.method2839(-20828);
                        class33.field438 = null;
                        return;
                    }
                    class459.field6727 = 3;
                }
                if (class459.field6727 == 3) {
                    if (~class33.field438.method2842(0) > -9) {
                        return;
                    }
                    class33.field438.method2833(0, class179.field2631.field5678, 8, (byte) -125);
                    class179.field2631.field5719 = 0;
                    class325.field4423 = class179.field2631.method2306((byte) -127);
                    class391 var5 = new class391(70);
                    int[] var6 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (Math.random() * 9.9999999E7D), (int) (class325.field4423 >> 32), (int) class325.field4423 };
                    var5.method2302(arg0 + -4, 10);
                    var5.method2359(var6[0], -110);
                    var5.method2359(var6[1], -122);
                    var5.method2359(var6[2], -106);
                    var5.method2359(var6[3], arg0 + -115);
                    var5.method2303(class506.method3021(-1453, class491.field7167), (byte) -28);
                    var5.method2349(class115.field1720, true);
                    var5.method2363(class474.field6926, (byte) -46, class120.field1776);
                    class481.field7027.field5719 = 0;
                    if (~class492.field7178 != -41) {
                        class481.field7027.method2302(-4, class141.field2018.field311);
                    } else {
                        class481.field7027.method2302(-4, class141.field2020.field311);
                    }
                    class481.field7027.method2355(1686288168, 0);
                    int var7 = class481.field7027.field5719;
                    class481.field7027.method2359(591, arg0 ^ -124);
                    class481.field7027.method2302(-4, class360.field5257);
                    class481.field7027.method2302(arg0 ^ -4, class50.method445(arg0 + -8));
                    class481.field7027.method2355(arg0 + 1686288168, class117.field1754);
                    class481.field7027.method2355(1686288168, class27.field359);
                    class481.field7027.method2302(-4, class20.field269.field7670);
                    class187.method1176(0, class481.field7027);
                    class481.field7027.method2349(class194.field2773, true);
                    class481.field7027.method2359(class461.field6784, arg0 ^ -88);
                    class391 var8 = class20.field269.method1709((byte) 63);
                    class481.field7027.method2302(-4, var8.field5719);
                    class481.field7027.method2315(4, var8.field5719, var8.field5678, 0);
                    class143.field2052 = true;
                    class481.field7027.method2355(1686288168, class28.field363);
                    class481.field7027.method2359(class179.field2630.method738((byte) -102), arg0 ^ -113);
                    class481.field7027.method2359(class294.field4051.method738((byte) -115), -92);
                    class481.field7027.method2359(class356.field5196.method738((byte) -98), arg0 + -95);
                    class481.field7027.method2359(class73.field995.method738((byte) -115), arg0 + -84);
                    class481.field7027.method2359(class167.field2509.method738((byte) -127), -94);
                    class481.field7027.method2359(class297.field4079.method738((byte) -114), -112);
                    class481.field7027.method2359(class177.field2625.method738((byte) -93), -90);
                    class481.field7027.method2359(class523.field7739.method738((byte) -64), -112);
                    class481.field7027.method2359(class364.field5334.method738((byte) -100), -119);
                    class481.field7027.method2359(class23.field308.method738((byte) -102), arg0 ^ -97);
                    class481.field7027.method2359(class144.field2062.method738((byte) -70), -108);
                    class481.field7027.method2359(class414.field6044.method738((byte) -74), arg0 ^ -126);
                    class481.field7027.method2359(class481.field7022.method738((byte) -92), -96);
                    class481.field7027.method2359(class188.field2726.method738((byte) -70), arg0 + -110);
                    class481.field7027.method2359(class497.field7247.method738((byte) -112), -112);
                    class481.field7027.method2359(class251.field3473.method738((byte) -123), arg0 ^ -87);
                    class481.field7027.method2359(class427.field6259.method738((byte) -106), arg0 + -119);
                    class481.field7027.method2359(class27.field358.method738((byte) -65), -123);
                    class481.field7027.method2359(class127.field1888.method738((byte) -63), -103);
                    class481.field7027.method2359(class469.field6853.method738((byte) -72), -125);
                    class481.field7027.method2359(class115.field1719.method738((byte) -83), -119);
                    class481.field7027.method2359(class138.field1974.method738((byte) -123), -125);
                    class481.field7027.method2359(class128.field1903.method738((byte) -121), -111);
                    class481.field7027.method2359(class352.field5173.method738((byte) -75), -112);
                    class481.field7027.method2359(class279.field3821.method738((byte) -74), -90);
                    class481.field7027.method2359(class252.field3499.method738((byte) -126), arg0 + -107);
                    class481.field7027.method2359(class62.field777.method738((byte) -81), -88);
                    class481.field7027.method2359(class432.field6342.method738((byte) -72), -119);
                    class481.field7027.method2359(class138.field1975.method738((byte) -93), -128);
                    class481.field7027.method2359(class425.field6244.method738((byte) -73), arg0 ^ -106);
                    class481.field7027.method2315(4, var5.field5719, var5.field5678, 0);
                    class481.field7027.method2318((byte) 0, -var7 + class481.field7027.field5719);
                    class33.field438.method2835((byte) 96, class481.field7027.field5719, class481.field7027.field5678, 0);
                    class481.field7027.method1280(178105062, var6);
                    for (int var9 = 0; var9 < 4; ++var9) {
                        var6[var9] += 50;
                    }
                    class179.field2631.method1280(arg0 + 178105062, var6);
                    class459.field6727 = 4;
                }
                if (~class459.field6727 == -5) {
                    if (~class33.field438.method2842(0) > -2) {
                        return;
                    }
                    int var10 = class33.field438.method2844(arg0 ^ 66);
                    if (var10 == 21) {
                        class459.field6727 = 7;
                    } else if (var10 != 29) {
                        if (~var10 == -2) {
                            class459.field6727 = 5;
                            class154.field2357 = var10;
                            return;
                        }
                        if (~var10 == -3) {
                            class459.field6727 = 8;
                        } else {
                            if (var10 != 15) {
                                if (var10 == 23 && class401.field5887 < 1) {
                                    ++class401.field5887;
                                    class59.field719 = 0;
                                    class459.field6727 = 1;
                                    class33.field438.method2839(-20828);
                                    class33.field438 = null;
                                    return;
                                }
                                class459.field6727 = 0;
                                class154.field2357 = var10;
                                class33.field438.method2839(-20828);
                                class33.field438 = null;
                                return;
                            }
                            class459.field6727 = 12;
                            class422.field6187 = -2;
                        }
                    } else {
                        class459.field6727 = 11;
                    }
                }
                if (~class459.field6727 == -7) {
                    class481.field7027.field5719 = 0;
                    class481.field7027.method1281(class141.field2019.field311, -3);
                    class33.field438.method2835((byte) 76, class481.field7027.field5719, class481.field7027.field5678, 0);
                    class459.field6727 = 4;
                } else if (class459.field6727 == 7) {
                    if (class33.field438.method2842(0) >= 1) {
                        class149.field2156 = class33.field438.method2844(arg0 + 66) * 60 + 180;
                        class459.field6727 = 0;
                        class154.field2357 = 21;
                        class33.field438.method2839(-20828);
                        class33.field438 = null;
                    }
                } else if (class459.field6727 == 11) {
                    if (~class33.field438.method2842(arg0) <= -2) {
                        class438.field6405 = class33.field438.method2844(51);
                        class154.field2357 = 29;
                        class459.field6727 = 0;
                        class33.field438.method2839(-20828);
                        class33.field438 = null;
                    }
                } else {
                    if (class459.field6727 == 8) {
                        if (class33.field438.method2842(0) < 13) {
                            return;
                        }
                        class33.field438.method2833(0, class179.field2631.field5678, 13, (byte) -120);
                        class179.field2631.field5719 = 0;
                        class68.field929 = class179.field2631.method2348(-2);
                        class244.field3418 = class179.field2631.method2348(-2);
                        class58.field691 = ~class179.field2631.method2348(-2) == -2;
                        class275.field3776 = ~class179.field2631.method2348(-2) == -2;
                        class153.field2353 = class179.field2631.method2348(arg0 ^ -2) == 1;
                        class414.field6040 = class179.field2631.method2348(arg0 ^ -2) == 1;
                        class152.field2335 = class179.field2631.method2353((byte) 85);
                        class217.field3019 = class179.field2631.method2348(-2) == 1;
                        class64.field870 = class179.field2631.method2348(arg0 ^ -2) == 1;
                        class78.field1141.method2109(class64.field870, 0);
                        class328.field4480.method3101(0, class64.field870);
                        class158.field2401.method2211(class64.field870, (byte) -115);
                        if ((!class58.field691 || class153.field2353) && !class217.field3019) {
                            try {
                                class390.method2298("unzap", class202.field2840.field7425, (byte) 87);
                            } catch (Throwable var15) {
                            }
                        } else {
                            try {
                                class390.method2298("zap", class202.field2840.field7425, (byte) 118);
                            } catch (Throwable var16) {
                                if (class308.field4197) {
                                    try {
                                        class202.field2840.field7425.getAppletContext().showDocument(new URL(class202.field2840.field7425.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var14) {
                                    }
                                }
                            }
                        }
                        if (class404.field5937 == class373.field5469) {
                            try {
                                class390.method2298("loggedin", class202.field2840.field7425, (byte) 100);
                            } catch (Throwable var13) {
                            }
                        }
                        class459.field6727 = 10;
                    }
                    if (class459.field6727 == 10) {
                        if (class179.field2631.method1277(34)) {
                            if (~class33.field438.method2842(arg0) > -2) {
                                return;
                            }
                            class33.field438.method2833(class179.field2631.field5719 + 2, class179.field2631.field5678, 1, (byte) -124);
                        }
                        class469.field6850 = class230.method1422((byte) -91)[class179.field2631.method1287((byte) 105)];
                        class422.field6187 = class179.field2631.method2353((byte) 95);
                        class459.field6727 = 9;
                    }
                    if (class459.field6727 == 9) {
                        if (~class33.field438.method2842(0) <= ~class422.field6187) {
                            class33.field438.method2833(0, class179.field2631.field5678, class422.field6187, (byte) -116);
                            class179.field2631.field5719 = 0;
                            int var11 = class422.field6187;
                            class154.field2357 = 2;
                            class459.field6727 = 0;
                            class37.method218((byte) -106);
                            class441.method2623(true, class179.field2631);
                            class38.field474 = -1;
                            class270.method1612((byte) -105);
                            if (class179.field2631.field5719 != var11) {
                                throw new RuntimeException("lswp pos:" + class179.field2631.field5719 + " psize:" + var11);
                            } else {
                                class469.field6850 = null;
                            }
                        }
                    } else if (~class459.field6727 == -13) {
                        if (~class422.field6187 == 1) {
                            if (class33.field438.method2842(0) < 2) {
                                return;
                            }
                            class33.field438.method2833(0, class179.field2631.field5678, 2, (byte) -127);
                            class179.field2631.field5719 = 0;
                            class422.field6187 = class179.field2631.method2353((byte) 80);
                        }
                        if (~class33.field438.method2842(0) <= ~class422.field6187) {
                            class33.field438.method2833(0, class179.field2631.field5678, class422.field6187, (byte) -125);
                            class179.field2631.field5719 = 0;
                            int var12 = class422.field6187;
                            class459.field6727 = 0;
                            class154.field2357 = 15;
                            class451.method2663((byte) 40);
                            class441.method2623(true, class179.field2631);
                            if (class179.field2631.field5719 != var12) {
                                throw new RuntimeException("lswpr pos:" + class179.field2631.field5719 + " psize:" + var12);
                            } else {
                                class469.field6850 = null;
                            }
                        }
                    }
                }
            } catch (IOException var17) {
                if (class33.field438 != null) {
                    class33.field438.method2839(-20828);
                    class33.field438 = null;
                }
                if (~class401.field5887 > -2) {
                    ++class401.field5887;
                    class459.field6727 = 1;
                    class59.field719 = 0;
                    if (class314.field4277 == class27.field353) {
                        class314.field4277 = class223.field3177;
                    } else {
                        class314.field4277 = class27.field353;
                    }
                } else {
                    class459.field6727 = 0;
                    class154.field2357 = -4;
                }
            }
        }
    }
}
