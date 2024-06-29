import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class174 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4012 = -1;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lbe;")
    public static class283 field4014 = class153.method941(-6, "<col=ff3000>");

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lbe;")
    public static class283 field4029 = class153.method941(127, "Hidden)2");

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lbe;")
    public static class283 field4011 = class153.method941(125, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lkg;)Z", line = 7)
    public static final boolean method1590(class69 arg0) {
        if (class297.field5037) {
            if (method1601(arg0) != 0) {
                return false;
            }
            if (arg0.field1143 == 0) {
                return false;
            }
        }
        return arg0.field1127;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 21)
    private final void method1591(int arg0, int arg1) {
        class242.field4075++;
        field4020++;
        class24.field357 = 0;
        if (arg1 != 12) {
            method1593((class172) null, -82, (byte) 51, 62);
        }
        class74.field1296 = null;
        if (class53.field714 == class13.field138) {
            class53.field714 = class54.field721;
        } else {
            class53.field714 = class13.field138;
        }
        class177.field3050 = null;
        if (class242.field4075 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class175.field3019 == 0 || class175.field3019 == 5) {
                this.method1136("js5connect_full", arg1 ^ 0x5014);
                class175.field3019 = 1000;
            } else {
                class88.field1483 = 3000;
            }
        } else if (class242.field4075 >= 2 && arg0 == 6) {
            this.method1136("js5connect_outofdate", arg1 + 20492);
            class175.field3019 = 1000;
        } else if (class242.field4075 >= 4) {
            if (class175.field3019 == 0 || class175.field3019 == 5) {
                this.method1136("js5connect", 20504);
                class175.field3019 = 1000;
            } else {
                class88.field1483 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 80)
    private final String method1592(int arg0, String arg1) {
        StringBuffer var3 = new StringBuffer();
        field4026++;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            char var5 = arg1.charAt(var4);
            if ((var5 < '0' || var5 > '9') && (var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z')) {
                int var6 = (var5 & 0xF2) >> 4;
                var3.append('%');
                if (var6 >= 0 && var6 <= 9) {
                    var3.append((char) (var6 + 48));
                } else if (var6 >= 10 && var6 <= 15) {
                    var3.append((char) (var6 + 65 - 10));
                }
                int var7 = var5 & 0xF;
                if (var7 >= 0 && var7 <= 9) {
                    var3.append((char) (var7 + 48));
                } else if (var7 >= 10 && var7 <= 15) {
                    var3.append((char) (var7 + 55));
                }
            } else {
                var3.append(var5);
            }
        }
        if (arg0 != -13119) {
            this.method1591(-125, 81);
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lek;IBI)[Lnh;", line = 134)
    public static final class107[] method1593(class172 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 69) {
            method1594((class69[]) null, 98, 67, -103, 117, -99, 8, 87);
        }
        field4016++;
        return class26.method183(true, arg0, arg3, arg1) ? class171.method1085(false) : null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lkg;IIIIIII)V", line = 166)
    public static final void method1594(class69[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class69 var9 = arg0[var8];
            if (var9 != null && var9.field1059 == arg1 && (!var9.field1121 || var9.field1143 == 0 || var9.field992 || method1601(var9) != 0 || class110.field1864 == var9 || var9.field975 == 1338) && (!var9.field1121 || !method1590(var9))) {
                int var10 = var9.field1135 + arg6;
                int var11 = var9.field1128 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1143 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1069 + var10;
                    int var17 = var9.field1085 + var11;
                    if (var9.field1143 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class20.field274 == var9) {
                    class38.field548 = true;
                    class219.field3703 = var10;
                    class13.field131 = var11;
                }
                if (!var9.field1121 || var12 < var14 && var13 < var15) {
                    if (var9.field1143 == 0) {
                        if (!var9.field1121 && method1590(var9) && class117.field1978 != var9) {
                            continue;
                        }
                        if (var9.field1132 && class109.field1849 >= var12 && class163.field2700 >= var13 && class109.field1849 < var14 && class163.field2700 < var15) {
                            for (class231 var18 = (class231) class254.field4294.method1812((byte) -6); var18 != null; var18 = (class231) class254.field4294.method1813((byte) 78)) {
                                if (var18.field3920) {
                                    var18.method557((byte) -89);
                                }
                            }
                            if (class48.field667 == 0) {
                                class20.field274 = null;
                                class110.field1864 = null;
                            }
                            class52.field707 = false;
                        }
                    }
                    if (var9.field1121) {
                        boolean var19;
                        if (class109.field1849 >= var12 && class163.field2700 >= var13 && class109.field1849 < var14 && class163.field2700 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class177.field3051 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class61.field859 == 1 && class47.field647 >= var12 && class269.field4537 >= var13 && class47.field647 < var14 && class269.field4537 < var15) {
                            var21 = true;
                        }
                        if (class228.field3838 > 0 && var9.field989 != null) {
                            for (int var22 = 0; var22 < var9.field989.length; var22++) {
                                for (int var23 = 0; var23 < class228.field3838; var23++) {
                                    int var24 = var9.field989[var22] & 0xFF;
                                    if (class302.field5104[var23] == var24) {
                                        if (var9.field1033 != null) {
                                            byte var25 = var9.field1033[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class246.field4178[86] || (var25 & 0x1) != 0 && !class246.field4178[82] || (var25 & 0x4) != 0 && !class246.field4178[81])) {
                                                continue;
                                            }
                                        }
                                        class159.method972(var22 + 1, class213.field3616, var9.field1079, -1, 77);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class240.method1615(class47.field647 - var10, 109, class269.field4537 - var11, var9);
                        }
                        if (class20.field274 != null && class20.field274 != var9 && var19 && class77.method501((byte) 80, method1601(var9))) {
                            class176.field3026 = var9;
                        }
                        if (class110.field1864 == var9) {
                            class137.field2277 = true;
                            class110.field1866 = var10;
                            class301.field5095 = var11;
                        }
                        if (var9.field992 || var9.field975 != 0) {
                            if (var19 && class229.field3908 != 0 && var9.field1045 != null) {
                                class231 var26 = new class231();
                                var26.field3920 = true;
                                var26.field3912 = var9;
                                var26.field3921 = class229.field3908;
                                var26.field3919 = var9.field1045;
                                class254.field4294.method1809(var26, (byte) -126);
                            }
                            if (class20.field274 != null || class195.field3332 != null || class306.field5253 || var9.field975 != 1400 && class52.field707) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field975 != 0) {
                                if (var9.field975 == 1337) {
                                    class282.field4777 = var9;
                                    class272.method1834(var9, 0);
                                    continue;
                                }
                                if (var9.field975 == 1338) {
                                    if (var21) {
                                        class126.method789(var9, class269.field4537 - var11, 91, class47.field647 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field975 == 1400) {
                                    class91.field1530 = var9;
                                    if (var21) {
                                        if (class246.field4178[82] && class299.field5067 > 0) {
                                            int var27 = (int) ((double) (class47.field647 - var10 - var9.field1069 / 2) * 2.0D / (double) class123.field2044);
                                            int var28 = (int) ((double) (class269.field4537 - var11 - var9.field1085 / 2) * 2.0D / (double) class123.field2044);
                                            int var29 = class7.field79 + var27;
                                            int var30 = class159.field2604 + var28;
                                            int var31 = class123.field2045 + var29;
                                            int var32 = class134.field2254 + class110.field1865 - var30 - 1;
                                            class166.method1021(1998761094, 0, var32, var31);
                                            class252.method1711(0);
                                            continue;
                                        }
                                        class52.field707 = true;
                                        class256.field4324 = class109.field1849;
                                        class262.field4470 = class163.field2700;
                                        class16.field185 = class7.field79;
                                        class270.field4558 = class159.field2604;
                                        continue;
                                    }
                                    if (var20 && class52.field707) {
                                        class110.method728(-1, (int) ((double) (class256.field4324 - class109.field1849) * 2.0D / (double) class162.field2649) + class16.field185);
                                        class143.method897((byte) 125, (int) ((double) (class262.field4470 - class163.field2700) * 2.0D / (double) class162.field2649) + class270.field4558);
                                        continue;
                                    }
                                    class52.field707 = false;
                                    continue;
                                }
                                if (var9.field975 == 1401) {
                                    if (var20) {
                                        class99.method657((byte) -37, class163.field2700 - var11, var9.field1085, var9.field1069, class109.field1849 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field975 == 1402 || var9.field975 == 1404) {
                                    continue;
                                }
                            }
                            if (!var9.field1106 && var21) {
                                var9.field1106 = true;
                                if (var9.field1115 != null) {
                                    class231 var33 = new class231();
                                    var33.field3920 = true;
                                    var33.field3912 = var9;
                                    var33.field3927 = class47.field647 - var10;
                                    var33.field3921 = class269.field4537 - var11;
                                    var33.field3919 = var9.field1115;
                                    class254.field4294.method1809(var33, (byte) -122);
                                }
                            }
                            if (var9.field1106 && var20 && var9.field1048 != null) {
                                class231 var34 = new class231();
                                var34.field3920 = true;
                                var34.field3912 = var9;
                                var34.field3927 = class109.field1849 - var10;
                                var34.field3921 = class163.field2700 - var11;
                                var34.field3919 = var9.field1048;
                                class254.field4294.method1809(var34, (byte) -123);
                            }
                            if (var9.field1106 && !var20) {
                                var9.field1106 = false;
                                if (var9.field1084 != null) {
                                    class231 var35 = new class231();
                                    var35.field3920 = true;
                                    var35.field3912 = var9;
                                    var35.field3927 = class109.field1849 - var10;
                                    var35.field3921 = class163.field2700 - var11;
                                    var35.field3919 = var9.field1084;
                                    class112.field1886.method1809(var35, (byte) -124);
                                }
                            }
                            if (var20 && var9.field1119 != null) {
                                class231 var36 = new class231();
                                var36.field3920 = true;
                                var36.field3912 = var9;
                                var36.field3927 = class109.field1849 - var10;
                                var36.field3921 = class163.field2700 - var11;
                                var36.field3919 = var9.field1119;
                                class254.field4294.method1809(var36, (byte) -122);
                            }
                            if (!var9.field1109 && var19) {
                                var9.field1109 = true;
                                if (var9.field1105 != null) {
                                    class231 var37 = new class231();
                                    var37.field3920 = true;
                                    var37.field3912 = var9;
                                    var37.field3927 = class109.field1849 - var10;
                                    var37.field3921 = class163.field2700 - var11;
                                    var37.field3919 = var9.field1105;
                                    class254.field4294.method1809(var37, (byte) -128);
                                }
                            }
                            if (var9.field1109 && var19 && var9.field1096 != null) {
                                class231 var38 = new class231();
                                var38.field3920 = true;
                                var38.field3912 = var9;
                                var38.field3927 = class109.field1849 - var10;
                                var38.field3921 = class163.field2700 - var11;
                                var38.field3919 = var9.field1096;
                                class254.field4294.method1809(var38, (byte) -128);
                            }
                            if (var9.field1109 && !var19) {
                                var9.field1109 = false;
                                if (var9.field1051 != null) {
                                    class231 var39 = new class231();
                                    var39.field3920 = true;
                                    var39.field3912 = var9;
                                    var39.field3927 = class109.field1849 - var10;
                                    var39.field3921 = class163.field2700 - var11;
                                    var39.field3919 = var9.field1051;
                                    class112.field1886.method1809(var39, (byte) -126);
                                }
                            }
                            if (var9.field1093 != null) {
                                class231 var40 = new class231();
                                var40.field3912 = var9;
                                var40.field3919 = var9.field1093;
                                class270.field4559.method1809(var40, (byte) -128);
                            }
                            if (var9.field1010 != null && class241.field4067 > var9.field1021) {
                                if (var9.field1049 == null || class241.field4067 - var9.field1021 > 32) {
                                    class231 var45 = new class231();
                                    var45.field3912 = var9;
                                    var45.field3919 = var9.field1010;
                                    class254.field4294.method1809(var45, (byte) -120);
                                } else {
                                    label550: for (int var41 = var9.field1021; var41 < class241.field4067; var41++) {
                                        int var42 = class262.field4452[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field1049.length; var43++) {
                                            if (var9.field1049[var43] == var42) {
                                                class231 var44 = new class231();
                                                var44.field3912 = var9;
                                                var44.field3919 = var9.field1010;
                                                class254.field4294.method1809(var44, (byte) -122);
                                                break label550;
                                            }
                                        }
                                    }
                                }
                                var9.field1021 = class241.field4067;
                            }
                            if (var9.field1004 != null && class241.field4073 > var9.field1122) {
                                if (var9.field1089 == null || class241.field4073 - var9.field1122 > 32) {
                                    class231 var50 = new class231();
                                    var50.field3912 = var9;
                                    var50.field3919 = var9.field1004;
                                    class254.field4294.method1809(var50, (byte) -128);
                                } else {
                                    label526: for (int var46 = var9.field1122; var46 < class241.field4073; var46++) {
                                        int var47 = class277.field4624[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field1089.length; var48++) {
                                            if (var9.field1089[var48] == var47) {
                                                class231 var49 = new class231();
                                                var49.field3912 = var9;
                                                var49.field3919 = var9.field1004;
                                                class254.field4294.method1809(var49, (byte) -125);
                                                break label526;
                                            }
                                        }
                                    }
                                }
                                var9.field1122 = class241.field4073;
                            }
                            if (var9.field1017 != null && class237.field3970 > var9.field1029) {
                                if (var9.field1020 == null || class237.field3970 - var9.field1029 > 32) {
                                    class231 var55 = new class231();
                                    var55.field3912 = var9;
                                    var55.field3919 = var9.field1017;
                                    class254.field4294.method1809(var55, (byte) -121);
                                } else {
                                    label502: for (int var51 = var9.field1029; var51 < class237.field3970; var51++) {
                                        int var52 = class177.field3052[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field1020.length; var53++) {
                                            if (var9.field1020[var53] == var52) {
                                                class231 var54 = new class231();
                                                var54.field3912 = var9;
                                                var54.field3919 = var9.field1017;
                                                class254.field4294.method1809(var54, (byte) -123);
                                                break label502;
                                            }
                                        }
                                    }
                                }
                                var9.field1029 = class237.field3970;
                            }
                            if (var9.field1142 != null && class24.field366 > var9.field1018) {
                                if (var9.field1141 == null || class24.field366 - var9.field1018 > 32) {
                                    class231 var60 = new class231();
                                    var60.field3912 = var9;
                                    var60.field3919 = var9.field1142;
                                    class254.field4294.method1809(var60, (byte) -119);
                                } else {
                                    label478: for (int var56 = var9.field1018; var56 < class24.field366; var56++) {
                                        int var57 = class40.field570[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field1141.length; var58++) {
                                            if (var9.field1141[var58] == var57) {
                                                class231 var59 = new class231();
                                                var59.field3912 = var9;
                                                var59.field3919 = var9.field1142;
                                                class254.field4294.method1809(var59, (byte) -121);
                                                break label478;
                                            }
                                        }
                                    }
                                }
                                var9.field1018 = class24.field366;
                            }
                            if (var9.field1016 != null && class30.field445 > var9.field1065) {
                                if (var9.field1036 == null || class30.field445 - var9.field1065 > 32) {
                                    class231 var65 = new class231();
                                    var65.field3912 = var9;
                                    var65.field3919 = var9.field1016;
                                    class254.field4294.method1809(var65, (byte) -126);
                                } else {
                                    label454: for (int var61 = var9.field1065; var61 < class30.field445; var61++) {
                                        int var62 = class162.field2651[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field1036.length; var63++) {
                                            if (var9.field1036[var63] == var62) {
                                                class231 var64 = new class231();
                                                var64.field3912 = var9;
                                                var64.field3919 = var9.field1016;
                                                class254.field4294.method1809(var64, (byte) -127);
                                                break label454;
                                            }
                                        }
                                    }
                                }
                                var9.field1065 = class30.field445;
                            }
                            if (class24.field361 > var9.field1125 && var9.field1095 != null) {
                                class231 var66 = new class231();
                                var66.field3912 = var9;
                                var66.field3919 = var9.field1095;
                                class254.field4294.method1809(var66, (byte) -126);
                            }
                            if (class141.field2359 > var9.field1125 && var9.field978 != null) {
                                class231 var67 = new class231();
                                var67.field3912 = var9;
                                var67.field3919 = var9.field978;
                                class254.field4294.method1809(var67, (byte) -122);
                            }
                            if (class213.field3623 > var9.field1125 && var9.field1083 != null) {
                                class231 var68 = new class231();
                                var68.field3912 = var9;
                                var68.field3919 = var9.field1083;
                                class254.field4294.method1809(var68, (byte) -127);
                            }
                            if (class23.field350 > var9.field1125 && var9.field1117 != null) {
                                class231 var69 = new class231();
                                var69.field3912 = var9;
                                var69.field3919 = var9.field1117;
                                class254.field4294.method1809(var69, (byte) -121);
                            }
                            if (class279.field4662 > var9.field1125 && var9.field1082 != null) {
                                class231 var70 = new class231();
                                var70.field3912 = var9;
                                var70.field3919 = var9.field1082;
                                class254.field4294.method1809(var70, (byte) -120);
                            }
                            var9.field1125 = class252.field4284;
                            if (var9.field1149 != null) {
                                for (int var71 = 0; var71 < class228.field3838; var71++) {
                                    class231 var72 = new class231();
                                    var72.field3912 = var9;
                                    var72.field3917 = class302.field5104[var71];
                                    var72.field3913 = class94.field1595[var71];
                                    var72.field3919 = var9.field1149;
                                    class254.field4294.method1809(var72, (byte) -121);
                                }
                            }
                            if (class291.field4939 && var9.field1028 != null) {
                                class231 var73 = new class231();
                                var73.field3912 = var9;
                                var73.field3919 = var9.field1028;
                                class254.field4294.method1809(var73, (byte) -128);
                            }
                        }
                    }
                    if (!var9.field1121 && class20.field274 == null && class195.field3332 == null && !class306.field5253) {
                        if ((var9.field1070 >= 0 || var9.field1019 != 0) && class109.field1849 >= var12 && class163.field2700 >= var13 && class109.field1849 < var14 && class163.field2700 < var15) {
                            if (var9.field1070 >= 0) {
                                class117.field1978 = arg0[var9.field1070];
                            } else {
                                class117.field1978 = var9;
                            }
                        }
                        if (var9.field1143 == 8 && class109.field1849 >= var12 && class163.field2700 >= var13 && class109.field1849 < var14 && class163.field2700 < var15) {
                            class282.field4774 = var9;
                        }
                        if (var9.field987 > var9.field1085) {
                            class149.method921(class109.field1849, var9.field987, class163.field2700, var9, var9.field1085, var11, (byte) 108, var9.field1069 + var10);
                        }
                    }
                    if (var9.field1143 == 0) {
                        method1594(arg0, var9.field1079, var12, var13, var14, var15, var10 - var9.field1011, var11 - var9.field1098);
                        if (var9.field1043 != null) {
                            method1594(var9.field1043, var9.field1079, var12, var13, var14, var15, var10 - var9.field1011, var11 - var9.field1098);
                        }
                        class159 var74 = (class159) class58.field805.method1612((long) var9.field1079, 115);
                        if (var74 != null) {
                            class295.method2004(1, var13, var10, var74.field2600, var12, var14, var11, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 924)
    public final void init() {
        field4021++;
        if (!this.method1149(115)) {
            return;
        }
        class160.field2639 = Integer.parseInt(this.getParameter("worldid"));
        class191.field3291 = Integer.parseInt(this.getParameter("modewhat"));
        class256.field4325 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class114.field1917 = true;
        } else {
            class114.field1917 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class110.field1860 = true;
        } else {
            class110.field1860 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null) {
            try {
                class30.field468 = Integer.parseInt(var3);
            } catch (Exception var14) {
            }
        }
        class87.method561(class30.field468, true);
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class280.field4678 = 1;
        } else {
            class280.field4678 = 0;
        }
        try {
            class33.field497 = Integer.parseInt(this.getParameter("js"));
            class19.field230 = Integer.parseInt(this.getParameter("plug"));
            class303.field5117 = Integer.parseInt(this.getParameter("affid"));
            class97.field1626 = Integer.parseInt(this.getParameter("haveie6")) == 1;
        } catch (Exception var13) {
        }
        class201.field3436 = class16.field186.method1909((byte) 107, this);
        if (class201.field3436 == null) {
            class201.field3436 = class213.field3616;
        }
        String var7 = this.getParameter("advert");
        if (var7 != null) {
            byte[] var8;
            try {
                var8 = var7.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var12) {
                var8 = var7.getBytes();
            }
            class283 var10 = class219.method1440(159, var8.length, var8, 0);
            boolean var11 = class298.method2021(true, var10);
            if (var11) {
                class290.field4923 = var10;
            }
        }
        class62.field866 = this.getCodeBase().getHost();
        this.method1151(class191.field3291 + 32, 511, (byte) 91, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1013)
    public final void method1147(byte arg0) {
        method1596(false);
        field4024++;
        class283.method1940(-91);
        class219.method1438(-46);
        class128.method801(15);
        class299.method2024(21551);
        class174.method1137((byte) 124);
        class167.method1030();
        class214.method1416(-65536);
        class194.method1249((byte) -49);
        class19.method118(-115);
        class290.method1979(92);
        class229.method1536(-1025210008);
        class199.method1281((byte) 98);
        class71.method463((byte) -111);
        class162.method984(64);
        class49.method288(false);
        class54.method349(5369);
        class172.method1104((byte) 109);
        class180.method1189(arg0 ^ 0xFFFFFFDF);
        class30.method207(arg0 - 187);
        class242.method1633(-25906);
        class60.method393(2047);
        class96.method625(8);
        class104.method686((byte) 118);
        class69.method443(0);
        class113.method739(arg0 - 83);
        class191.method1239((byte) -88);
        class269.method1818((byte) 34);
        class239.method1610(arg0 ^ 0x2);
        class23.method170(arg0 ^ 0xFFFFFFE5);
        class24.method171(-1);
        class245.method1671((byte) 73);
        class107.method714(-70);
        class20.method122(arg0 ^ 0x74);
        class225.method1477((byte) -123);
        class221.method1450((byte) -119);
        if (arg0 != 116) {
            return;
        }
        class262.method1768(-98);
        class157.method962((byte) -90);
        class70.method462(arg0 ^ 0x74);
        class160.method976(arg0 ^ 0x2A7C);
        class91.method584(12861);
        class129.method810(-1);
        class159.method973(127);
        class86.method552(59);
        class18.method108((byte) 5);
        class302.method2042(-32388);
        class125.method785(0);
        class228.method1491(-1);
        class232.method1565((byte) -47);
        class112.method734(true);
        class257.method1735(95);
        class16.method89(true);
        class31.method211((byte) 11);
        class210.method1388((byte) -76);
        class298.method2019(0);
        class142.method895(false);
        class281.method1890(false);
        class1.method3(1);
        class59.method384();
        class89.method576((byte) -122);
        class165.method1017();
        class201.method1289((byte) 108);
        class206.method1342();
        class304.method2066((byte) 0);
        class258.method1746();
        class12.method62(10);
        class138.method858(-31529);
        class216.method1424((byte) 111);
        class123.method778((byte) 14);
        class272.method1836(-116);
        class101.method669();
        class14.method76(false);
        class195.method1255(arg0 ^ 0xFFFFFFCF);
        class87.method563(arg0 ^ 0x34);
        class244.method1662();
        class190.method1237(true);
        class100.method663();
        class26.method178(87);
        class116.method748(arg0 - 116);
        class7.method45((byte) -118);
        class197.method1266(false);
        class291.method1984(1);
        class110.method729((byte) 98);
        class305.method2074((byte) 107);
        class141.method890(-121);
        class211.method1389();
        class158.method970();
        class177.method1165(4);
        class15.method83(-15424);
        class97.method642(9868);
        class139.method868();
        class78.method515();
        class295.method2002(-1);
        class144.method905(false);
        class17.method91();
        class115.method745(49);
        class42.method256((byte) 53);
        class22.method166(arg0 - 25364);
        class212.method1399();
        class218.method1434();
        class287.method1966(256);
        class63.method406(0);
        class311.method2117();
        class150.method927(true);
        class40.method252(5);
        class181.method1192();
        class46.method271(arg0 ^ 0xFFFFFFEF);
        class27.method185(16320);
        class29.method190();
        class264.method1787(-26872);
        class132.method823(arg0 ^ 0x2F);
        class133.method827(0);
        class103.method680(false);
        class44.method264(arg0 ^ 0x74);
        class37.method234((byte) 125);
        class182.method1206(-28762);
        class38.method236(112);
        class118.method754(-123);
        class145.method909((byte) 83);
        class122.method772((byte) 16);
        class196.method1260(0);
        class213.method1409((byte) 114);
        class50.method292(1);
        class169.method1073(-1153);
        class94.method603(128);
        class58.method379(arg0 ^ 0xFFFFFFFD);
        class223.method1467(arg0 - 244);
        class140.method881(9666);
        class306.method2080(arg0 ^ 0xFFFFFFE3);
        class64.method410(true);
        class294.method1993(0);
        class33.method219(-126);
        class256.method1731(true);
        class166.method1020(-103);
        class184.method1213(3);
        class130.method816(72);
        class231.method1562((byte) 103);
        class149.method923((byte) 16);
        class117.method752(false);
        class252.method1713(false);
        class261.method1765(arg0 ^ 0x74);
        class254.method1723((byte) 14);
        class72.method480(arg0 ^ 0x8B);
        class74.method491(-22860);
        class183.method1209((byte) -103);
        class248.method1686((byte) -48);
        class109.method724((byte) 125);
        class297.method2015((byte) -20);
        class238.method1586();
        class280.method1870(arg0 + 12);
        class148.method920((byte) -80);
        class241.method1621(-19339);
        class25.method175((byte) 0);
        class247.method1680((byte) 123);
        class301.method2040(47);
        class119.method764(arg0 - 16390);
        class57.method371((byte) -25);
        class163.method989(114);
        class164.method996(false);
        class207.method1376((byte) -127);
        class81.method531(-107);
        class236.method1576(arg0 ^ 0x6818);
        class168.method1063(9554);
        class234.method1573(arg0 ^ 0xFFFFC7C4);
        class309.method2100(true);
        class200.method1286(4);
        class187.method1226((byte) -27);
        class36.method231(true);
        class288.method1974(-17954);
        class303.method2049(-213277759);
        class175.method1154(0);
        class93.method600();
        class151.method929(17355);
        class249.method1689(arg0 ^ 0xFFFFC146);
        class55.method359(-72);
        class2.method12(1);
        class62.method404((byte) -124);
        class82.method533(24);
        class56.method364();
        class308.method2094();
        class41.method253();
        class307.method2093((byte) -93);
        class154.method950(-24308);
        class246.method1673((byte) -110);
        class66.method420((byte) -112);
        class173.method1124();
        class84.method543();
        class68.method432((byte) -5);
        class61.method398(-1921846484);
        class114.method740(88);
        class279.method1866(31275);
        class153.method945(false);
        class237.method1585((byte) -8);
        class143.method899(arg0 ^ 0xFFFFFFE3);
        class76.method500(1280);
        class243.method1638((byte) 114);
        class226.method1483(arg0 ^ 0xFFFFE688);
        class284.method1955((byte) -107);
        class73.method490();
        class105.method701();
        class185.method1218();
        class178.method1172(-5933);
        class45.method266((byte) 118);
        class186.method1223(17446);
        class83.method539((byte) -119);
        class79.method524((byte) -44);
        class240.method1617(1);
        class208.method1380(-3);
        class155.method953((byte) -123);
        class3.method15(false);
        class111.method731(-16117);
        class203.method1300(7140);
        class277.method1851(-114);
        class260.method1758(arg0 ^ 0x5F1);
        class10.method54((byte) 15);
        class99.method661((byte) 15);
        class90.method581(false);
        class135.method840(false);
        class77.method505((byte) 28);
        class92.method586(0);
        class5.method32(-45);
        class193.method1246(74);
        class278.method1857(20019);
        class134.method835(4);
        class267.method1801((byte) 119);
        class176.method1164((byte) 49);
        class259.method1754(0);
        class222.method1460(6607);
        class263.method1785(4096);
        class124.method779(arg0 - 29028);
        class275.method1846(-3584);
        class205.method1317(0);
        class273.method1837(-125);
        class255.method1726(true);
        class227.method1484((byte) 63);
        class121.method769((byte) 84);
        class265.method1791(104);
        class170.method1080((byte) 118);
        class67.method425((byte) -17);
        class127.method794(0);
        class126.method787(true);
        class48.method278(true);
        class137.method854((byte) 101);
        class220.method1445((byte) 75);
        class53.method340((byte) -80);
        class270.method1821((byte) -71);
        class35.method228(-2);
        class215.method1421(65);
        class6.method38(false);
        class296.method2013(95);
        class292.method1985(-6827);
        class65.method414(-3584);
        class34.method227((byte) -123);
        class171.method1087(0);
        class202.method1294((byte) 125);
        class217.method1433((byte) -7);
        class13.method69(91);
        class282.method1895(-30694);
        class75.method496(0);
        class85.method550(-9968);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1284)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class81.method526(1);
            }
            class160.field2639 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class256.field4325 = 0;
            } else if (arg0[1].equals("office")) {
                class256.field4325 = 1;
            } else if (arg0[1].equals("local")) {
                class256.field4325 = 2;
            } else {
                class81.method526(1);
            }
            int var1 = -1;
            if (arg0[2].equals("live")) {
                class191.field3291 = 0;
            } else if (arg0[2].equals("rc")) {
                class191.field3291 = 1;
            } else if (arg0[2].equals("wip")) {
                class191.field3291 = 2;
            } else {
                class81.method526(1);
            }
            if (arg0[4].equals("free")) {
                class110.field1860 = false;
            } else if (arg0[4].equals("members")) {
                class110.field1860 = true;
            } else {
                class81.method526(1);
            }
            try {
                byte[] var2 = arg0[5].getBytes("ISO-8859-1");
                var1 = class62.method403(class219.method1440(159, var2.length, var2, 0), 0);
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class30.field468 = var1;
            } else if (arg0[5].equals("english")) {
                class30.field468 = 0;
            } else if (arg0[5].equals("german")) {
                class30.field468 = 1;
            } else {
                class81.method526(1);
            }
            class87.method561(class30.field468, true);
            if (arg0[6].equals("game0")) {
                class280.field4678 = 0;
            } else if (arg0[6].equals("game1")) {
                class280.field4678 = 1;
            } else {
                class81.method526(1);
            }
            if (arg0.length != 8) {
                class114.field1917 = false;
            } else if (arg0[7].equals("safemode")) {
                class114.field1917 = true;
            } else {
                class81.method526(1);
            }
            class201.field3436 = class213.field3616;
            class62.field866 = "127.0.0.1";
            class303.field5117 = 0;
            client var4 = new client();
            var4.method1142(27, "runescape", class191.field3291 + 32, 768, 511, true, 1024);
            class164.field2711.setLocation(40, 40);
        } catch (Exception var7) {
            class296.method2011(true, (String) null, var7);
        }
        field4022++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1396)
    private final void method1595(int arg0) {
        field4019++;
        if (class5.field41 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class216.method1426(255);
            if (class40.field571 == 0L) {
                class40.field571 = var4;
            }
            if (var3 > 16384 && (var4 - class40.field571) < 5000L) {
                if ((var4 - class219.field3697) > 1000L) {
                    System.gc();
                    class219.field3697 = var4;
                }
                class267.field4523 = class306.field5260;
                class37.field541 = 5;
            } else {
                class5.field41 = 10;
                class267.field4523 = class203.field3476;
                class37.field541 = 5;
            }
        } else if (class5.field41 == 10) {
            class111.method730(4, 104, 104, 28);
            class17.method94(4, 104, 104);
            for (int var6 = 0; var6 < 4; var6++) {
                class180.field3102[var6] = new class104(104, 104);
            }
            class37.field541 = 10;
            class5.field41 = 30;
            class267.field4523 = class89.field1508;
        } else if (class5.field41 == 30) {
            if (class67.field930 == null) {
                class67.field930 = new class49(class129.field2196, class66.field924);
            }
            if (class67.field930.method286((byte) -64)) {
                class63.field878 = class20.method152(true, true, 0, false, true);
                class259.field4411 = class20.method152(true, true, 1, false, true);
                class74.field1291 = class20.method152(true, true, 2, true, false);
                class282.field4772 = class20.method152(true, true, 3, false, true);
                class103.field1741 = class20.method152(true, true, 4, false, true);
                class61.field849 = class20.method152(true, true, 5, true, true);
                class109.field1843 = class20.method152(true, false, 6, true, true);
                class169.field2832 = class20.method152(true, true, 7, false, true);
                class69.field1067 = class20.method152(true, true, 8, false, true);
                class115.field1928 = class20.method152(true, true, 9, false, true);
                class155.field2558 = class20.method152(true, true, 10, false, true);
                class210.field3580 = class20.method152(true, true, 11, false, true);
                class227.field3821 = class20.method152(true, true, 12, false, true);
                class94.field1587 = class20.method152(true, true, 13, false, true);
                class234.field3945 = class20.method152(true, false, 14, false, true);
                class196.field3354 = class20.method152(true, true, 15, false, true);
                class144.field2388 = class20.method152(true, true, 16, false, true);
                class22.field336 = class20.method152(true, true, 17, false, true);
                class262.field4468 = class20.method152(true, true, 18, false, true);
                class12.field111 = class20.method152(true, true, 19, false, true);
                class228.field3842 = class20.method152(true, true, 20, false, true);
                class301.field5094 = class20.method152(true, true, 21, false, true);
                class183.field3154 = class20.method152(true, true, 22, false, true);
                class232.field3931 = class20.method152(true, true, 23, true, true);
                class231.field3916 = class20.method152(true, true, 24, false, true);
                class175.field3022 = class20.method152(true, true, 25, false, true);
                class221.field3720 = class20.method152(true, true, 26, true, true);
                class267.field4523 = class149.field2428;
                class5.field41 = 40;
                class37.field541 = 15;
            }
        } else if (class5.field41 == 40) {
            int var35 = 0;
            for (int var36 = 0; var36 < 27; var36++) {
                var35 += class294.field4971[var36].method354((byte) -109) * class57.field772[var36] / 100;
            }
            if (var35 == 100) {
                class267.field4523 = class75.field1312;
                class37.field541 = 20;
                class31.method214(class69.field1067, -116);
                class112.method735(arg0 + 21411, class69.field1067);
                class103.method677(arg0 + 21478, class69.field1067);
                class97.method644(14700, class69.field1067);
                class5.field41 = 45;
            } else {
                if (var35 != 0) {
                    class267.field4523 = class299.method2022(new class283[] { class215.field3650, class296.method2012(var35, (byte) 116), class34.field507 }, (byte) 90);
                }
                class37.field541 = 20;
            }
        } else if (class5.field41 == 45) {
            class269.method1808(class33.field501, true, 22050, 2);
            class239.field4035 = new class20();
            class239.field4035.method119(9, 128, 7731);
            class60.field827 = class18.method115(48, class150.field2460, 0, 22050, class264.field4487);
            class60.field827.method1469(50, class239.field4035);
            class118.method755(class196.field3354, class239.field4035, class234.field3945, arg0 + 21600, class103.field1741);
            class155.field2561 = class18.method115(49, class150.field2460, 1, 2048, class264.field4487);
            class301.field5089 = new class198();
            class155.field2561.method1469(50, class301.field5089);
            class281.field4739 = new class221(22050, class205.field3493);
            class200.field3428 = class109.field1843.method1097(class160.field2610, 0);
            class37.field541 = 30;
            class267.field4523 = class257.field4333;
            class5.field41 = 50;
        } else if (class5.field41 == 50) {
            int var7 = class157.method966(class69.field1067, (byte) 122, class94.field1587);
            int var8 = class261.method1766((byte) 122);
            if (var8 <= var7) {
                class37.field541 = 35;
                class5.field41 = 60;
                class267.field4523 = class20.field293;
            } else {
                class267.field4523 = class299.method2022(new class283[] { class64.field886, class296.method2012(var7 * 100 / var8, (byte) 124), class34.field507 }, (byte) 127);
                class37.field541 = 35;
            }
        } else if (class5.field41 == 60) {
            int var9 = class174.method1133(0, class69.field1067);
            int var10 = class69.method450(false);
            if (var10 > var9) {
                class267.field4523 = class299.method2022(new class283[] { class297.field5032, class296.method2012(var9 * 100 / var10, (byte) -5), class34.field507 }, (byte) 126);
                class37.field541 = 40;
            } else {
                class267.field4523 = class2.field15;
                class5.field41 = 65;
                class37.field541 = 40;
            }
        } else if (class5.field41 == 65) {
            for (int var26 = 0; var26 < 6; var26++) {
                class310 var27 = class150.field2460.method1707(this.getClass(), arg0 + 3926);
                while (var27.field5293 == 0) {
                    class2.method11((byte) -20, 100L);
                }
                if (var27.field5293 == 1) {
                    break;
                }
                if (var26 == 5) {
                    this.method1136("dll", arg0 ^ 0xFFFFFC07);
                    class175.field3019 = 1000;
                    return;
                }
                class2.method11((byte) -20, 1000L);
            }
            int var28 = class167.method1029(class264.field4487, class119.field2007 * 2);
            if (var28 == 0) {
                class212.method1396(104, 104);
                class42.field587 = false;
                class20.method136(class94.field1587, 0, class69.field1067);
                class37.field541 = 45;
                class267.field4523 = class60.field823;
                class77.method506(5, -30354);
                class5.field41 = 70;
            } else {
                String var29 = class167.field2784;
                String var30 = "unknown";
                String var31 = class167.field2810;
                String var32 = var29.toLowerCase();
                if (var32.indexOf("microsoft") != -1) {
                    var30 = "vesa";
                } else if (var32.indexOf("nvidia") != -1) {
                    var30 = "nvidia";
                } else if (var32.indexOf("intel") != -1) {
                    var30 = "intel";
                } else if (var32.indexOf("s3") == -1) {
                    if (var32.indexOf("ati") != -1) {
                        var30 = "ati";
                    }
                } else if (var31.toLowerCase().indexOf("unichrome") == -1) {
                    var30 = "s3";
                } else {
                    var30 = "via_s3";
                }
                String var33 = this.method1592(-13119, class251.field4271 + " " + class251.field4262 + " " + class251.field4255);
                String var34 = this.method1592(arg0 + 8354, var29 + " " + var31);
                this.method1144("os=" + var33 + "&gcard=" + var34 + "&error_code=" + var28, "caps_" + var30, false);
                class175.field3019 = 1000;
            }
        } else if (class5.field41 == 70) {
            class74.field1291.method1111((byte) -111);
            byte var15 = 0;
            int var16 = var15 + class74.field1291.method1119(44);
            class144.field2388.method1111((byte) -117);
            int var17 = var16 + class144.field2388.method1119(43);
            class22.field336.method1111((byte) -123);
            int var18 = var17 + class22.field336.method1119(105);
            class262.field4468.method1111((byte) -109);
            int var19 = var18 + class262.field4468.method1119(40);
            class12.field111.method1111((byte) -95);
            int var20 = var19 + class12.field111.method1119(33);
            class228.field3842.method1111((byte) -119);
            int var21 = var20 + class228.field3842.method1119(arg0 ^ 0xFFFFAC7A);
            class301.field5094.method1111((byte) -89);
            int var22 = var21 + class301.field5094.method1119(109);
            class183.field3154.method1111((byte) -99);
            int var23 = var22 + class183.field3154.method1119(67);
            class231.field3916.method1111((byte) -127);
            int var24 = var23 + class231.field3916.method1119(68);
            class175.field3022.method1111((byte) -100);
            int var25 = var24 + class175.field3022.method1119(111);
            if (var25 < 1000) {
                class267.field4523 = class299.method2022(new class283[] { class53.field713, class296.method2012(var25 / 10, (byte) 108), class34.field507 }, (byte) 43);
                class37.field541 = 50;
            } else {
                class272.method1830(class74.field1291, (byte) 35);
                class216.method1429(arg0 + 27299, class74.field1291);
                class13.method70(class74.field1291, true);
                class153.method942((byte) -39, class169.field2832, class74.field1291);
                class197.method1265(false, class169.field2832, class110.field1860, class144.field2388);
                class122.method774(class262.field4468, false, class169.field2832);
                class280.method1872(class110.field1860, class169.field2832, false, class178.field3072, class12.field111);
                class225.method1470(class74.field1291, (byte) 124);
                class58.method376(class228.field3842, class259.field4411, class63.field878, -113);
                class97.method648(class301.field5094, class169.field2832, arg0 ^ 0xFFFFAC66);
                class130.method814(class183.field3154, (byte) -113);
                class97.method640(class74.field1291, true);
                class252.method1712(class94.field1587, class69.field1067, class282.field4772, 1, class169.field2832);
                class262.method1776(class74.field1291, (byte) -117);
                class133.method826(class22.field336, -30723);
                class75.method495((byte) 58, new class64(), class231.field3916, class175.field3022);
                class26.method182(class175.field3022, class231.field3916, (byte) -89);
                class37.field541 = 50;
                class267.field4523 = class82.field1387;
                class299.method2027(arg0 + 21473);
                class5.field41 = 80;
            }
        } else if (class5.field41 == 80) {
            int var13 = class305.method2072(false, class69.field1067);
            int var14 = class246.method1678((byte) 46);
            if (var14 <= var13) {
                class57.method369(class69.field1067, false);
                class5.field41 = 90;
                class37.field541 = 60;
                class267.field4523 = class66.field923;
            } else {
                class267.field4523 = class299.method2022(new class283[] { class307.field5273, class296.method2012(var13 * 100 / var14, (byte) 126), class34.field507 }, (byte) 105);
                class37.field541 = 60;
            }
        } else if (class5.field41 == 90) {
            if (class221.field3720.method1111((byte) -96)) {
                class97 var11 = new class97(class115.field1928, class221.field3720, class69.field1067, 200, !class149.field2432);
                class139.method866(var11);
                if (class44.field601) {
                    class139.method870(0.7F);
                } else {
                    if (class155.field2552 == 1) {
                        class139.method870(0.9F);
                    }
                    if (class155.field2552 == 2) {
                        class139.method870(0.8F);
                    }
                    if (class155.field2552 == 3) {
                        class139.method870(0.7F);
                    }
                    if (class155.field2552 == 4) {
                        class139.method870(0.6F);
                    }
                }
                class267.field4523 = class166.field2764;
                class5.field41 = 100;
                class37.field541 = 70;
            } else {
                class267.field4523 = class299.method2022(new class283[] { class301.field5075, class296.method2012(class221.field3720.method1119(51), (byte) 126), class34.field507 }, (byte) 104);
                class37.field541 = 70;
            }
        } else if (class5.field41 == 100) {
            class5.field41 = 110;
        } else if (arg0 == -21473) {
            if (class5.field41 == 110) {
                class257.field4334 = new class19();
                class150.field2460.method1691(10, arg0 + 21498, class257.field4334);
                class267.field4523 = class236.field3952;
                class5.field41 = 120;
                class37.field541 = 75;
            } else if (class5.field41 == 120) {
                if (class155.field2558.method1121((byte) 95, class243.field4103, class213.field3616)) {
                    class33 var12 = new class33(class155.field2558.method1102(arg0 - 3973, class243.field4103, class213.field3616));
                    class154.method948(var12, 101);
                    class5.field41 = 130;
                    class267.field4523 = class243.field4110;
                    class37.field541 = 80;
                } else {
                    class267.field4523 = class299.method2022(new class283[] { class2.field21, class135.field2262 }, (byte) 49);
                    class37.field541 = 80;
                }
            } else if (class5.field41 == 130) {
                if (!class282.field4772.method1111((byte) -115)) {
                    class267.field4523 = class299.method2022(new class283[] { class27.field419, class296.method2012(class282.field4772.method1119(14) * 3 / 4, (byte) 123), class34.field507 }, (byte) 87);
                    class37.field541 = 85;
                } else if (!class227.field3821.method1111((byte) -107)) {
                    class267.field4523 = class299.method2022(new class283[] { class27.field419, class296.method2012(class227.field3821.method1119(118) / 10 + 75, (byte) -22), class34.field507 }, (byte) 27);
                    class37.field541 = 85;
                } else if (!class94.field1587.method1111((byte) -87)) {
                    class267.field4523 = class299.method2022(new class283[] { class27.field419, class296.method2012(class94.field1587.method1119(76) / 20 + 85, (byte) 114), class34.field507 }, (byte) 91);
                    class37.field541 = 85;
                } else if (class232.field3931.method1093(class306.field5261, 1736)) {
                    class295.method2001(class15.field169, class25.field375, class213.field3629, class205.field3494, class232.field3931, class260.field4421, 4);
                    class37.field541 = 100;
                    class267.field4523 = class247.field4202;
                    class5.field41 = 140;
                } else {
                    class267.field4523 = class299.method2022(new class283[] { class27.field419, class296.method2012(class232.field3931.method1105(class306.field5261, arg0 ^ 0xFFFFAC7B) / 10 + 90, (byte) 124), class34.field507 }, (byte) 93);
                    class37.field541 = 85;
                }
            } else if (class5.field41 == 140) {
                class190.field3254 = class282.field4772.method1097(class307.field5270, 0);
                class61.field849.method1095(true, (byte) 108, false);
                class109.field1843.method1095(true, (byte) 123, true);
                class69.field1067.method1095(true, (byte) 123, true);
                class94.field1587.method1095(true, (byte) 102, true);
                class155.field2558.method1095(true, (byte) 64, true);
                class282.field4772.method1095(true, (byte) 79, true);
                class15.field159 = true;
                class241.method1620(arg0 ^ 0xFFFFAC03);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 1898)
    public final void method1146(int arg0) {
        field4018++;
        if (class175.field3019 == 1000) {
            return;
        }
        boolean var2 = class193.method1248((byte) 118);
        if (var2 && class306.field5263 && class60.field827 != null) {
            class60.field827.method1479((byte) -93);
        }
        if (class175.field3019 == 30 || class175.field3019 == 10) {
            if (class67.field941) {
                class245.method1669(false);
            } else if (class23.field356 != 0L && class216.method1426(255) > class23.field356) {
                class245.method1669(false);
            }
        }
        if (class2.field27 != 0L && class2.field27 < class216.method1426(255) && class263.field4484 != null && (class175.field3019 == 30 || class175.field3019 == 25)) {
            class125.method784(-12017);
        }
        if (class1.field2 == null) {
            Container var3;
            if (class1.field2 != null) {
                var3 = class1.field2;
            } else if (class164.field2711 == null) {
                var3 = class150.field2460.field4272;
            } else {
                var3 = class164.field2711;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class164.field2711 == var3) {
                Insets var6 = class164.field2711.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class1.field1 != var4 || class103.field1757 != var5) {
                class202.method1291(500, (byte) 109);
            }
        }
        boolean var7 = false;
        if (class1.field2 != null && !class18.field222 && (class175.field3019 == 30 || class175.field3019 == 10)) {
            class143.method903((byte) -126);
        }
        if (arg0 != 50) {
            field4011 = (class283) null;
        }
        if (class142.field2364) {
            var7 = true;
            class142.field2364 = false;
        }
        if (var7) {
            class6.method34(0);
        }
        for (int var8 = 0; var8 < 100; var8++) {
            class201.field3434[var8] = true;
        }
        if (class175.field3019 == 0) {
            class34.method223(class37.field541, (byte) -94, var7, (Color) null, class267.field4523);
        } else if (class175.field3019 == 5) {
            class267.method1799(class240.field4056, arg0 - 145);
        } else if (class175.field3019 == 10) {
            class10.method56(2);
        } else if (class175.field3019 == 25 || class175.field3019 == 28) {
            if (class111.field1879 == 1) {
                if (class144.field2382 < class303.field5124) {
                    class144.field2382 = class303.field5124;
                }
                int var10 = (class144.field2382 - class303.field5124) * 50 / class144.field2382;
                class145.method910(false, arg0 - 160, class299.method2022(new class283[] { class200.field3424, class114.field1911, class296.method2012(var10, (byte) -29), class6.field58 }, (byte) 110));
            } else if (class111.field1879 == 2) {
                if (class104.field1770 < class104.field1775) {
                    class104.field1770 = class104.field1775;
                }
                int var9 = ((class104.field1770 - class104.field1775) * 50 / class104.field1770) + 50;
                class145.method910(false, -79, class299.method2022(new class283[] { class200.field3424, class114.field1911, class296.method2012(var9, (byte) 119), class6.field58 }, (byte) 77));
            } else {
                class145.method910(false, -54, class200.field3424);
            }
        } else if (class175.field3019 == 30) {
            class305.method2073(-31116);
        } else if (class175.field3019 == 40) {
            class145.method910(false, -97, class299.method2022(new class283[] { class184.field3176, class48.field668, class104.field1777 }, (byte) 83));
        }
        if (class175.field3019 != 0) {
            class167.method1039();
            for (int var17 = 0; var17 < class217.field3686; var17++) {
                class69.field1147[var17] = false;
            }
        } else if ((class175.field3019 == 30 || class175.field3019 == 10) && class194.field3313 == 0 && !var7) {
            try {
                Graphics var14 = class264.field4487.getGraphics();
                for (int var15 = 0; var15 < class217.field3686; var15++) {
                    if (class69.field1147[var15]) {
                        class66.field925.method1251(class3.field32[var15], class70.field1209[var15], class288.field4895[var15], (byte) -80, var14, class62.field861[var15]);
                        class69.field1147[var15] = false;
                    }
                }
            } catch (Exception var22) {
                class264.field4487.repaint();
            }
        } else if (class175.field3019 != 0) {
            try {
                Graphics var11 = class264.field4487.getGraphics();
                class66.field925.method1252(0, 0, var11, 200);
                for (int var12 = 0; var12 < class217.field3686; var12++) {
                    class69.field1147[var12] = false;
                }
            } catch (Exception var23) {
                class264.field4487.repaint();
            }
        }
        if (class15.field159) {
            class38.method240((byte) 123);
        }
        if (!browsercontrol.iscreated() || class46.field634 == 0) {
            return;
        }
        try {
            Point var18 = class264.field4487.getLocationOnScreen();
            Dimension var19 = class264.field4487.getSize();
            browsercontrol.set_position(var18.x, var18.y - class46.field634, var19.width, class46.field634);
        } catch (Exception var21) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 2142)
    public static void method1596(boolean arg0) {
        field4029 = null;
        field4011 = null;
        if (arg0) {
            method1598((Component) null, (byte) 68);
        }
        field4014 = null;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2169)
    private final void method1597(int arg0) {
        boolean var2 = class129.field2196.method475(14);
        field4015++;
        if (arg0 == -2 && !var2) {
            this.method1602((byte) -25);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 2190)
    public final void method1143(int arg0) {
        class167.method1035();
        field4010++;
        if (browsercontrol.iscreated()) {
            browsercontrol.destroy();
        }
        if (class1.field2 != null) {
            class60.method396(class1.field2, class150.field2460, arg0 ^ 0xFFFF8DEC);
            class1.field2 = null;
        }
        if (class150.field2460 != null) {
            class150.field2460.method1697(this.getClass(), 20922);
        }
        if (class257.field4334 != null) {
            class257.field4334.field237 = false;
        }
        class257.field4334 = null;
        if (class263.field4484 != null) {
            class263.field4484.method1282(true);
            class263.field4484 = null;
        }
        class57.method372(class264.field4487, 31499);
        class197.method1268(23725, class264.field4487);
        if (class272.field4571 != null) {
            class272.field4571.method52(176, class264.field4487);
        }
        class38.method235((byte) -60);
        if (arg0 != 0) {
            method1593((class172) null, -11, (byte) -11, -81);
        }
        class104.method682(-29443);
        class272.field4571 = null;
        if (class60.field827 != null) {
            class60.field827.method1476(-13575);
        }
        if (class155.field2561 != null) {
            class155.field2561.method1476(arg0 - 13575);
        }
        class129.field2196.method473(true);
        class66.field924.method981(arg0 + 1);
        try {
            if (class143.field2379 != null) {
                class143.field2379.method1182((byte) 78);
            }
            if (class201.field3437 != null) {
                for (int var2 = 0; var2 < class201.field3437.length; var2++) {
                    if (class201.field3437[var2] != null) {
                        class201.field3437[var2].method1182((byte) 78);
                    }
                }
            }
            if (class163.field2681 != null) {
                class163.field2681.method1182((byte) 78);
            }
            if (class37.field543 != null) {
                class37.field543.method1182((byte) 78);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 2280)
    public static final void method1598(Component arg0, byte arg1) {
        Method var2 = class251.field4274;
        field4028++;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        arg0.addKeyListener(class278.field4645);
        int var4 = 21 % ((-arg1 - 51) / 60);
        arg0.addFocusListener(class278.field4645);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lkg;)Lkg;", line = 2311)
    public static final class69 method1599(class69 arg0) {
        int var1 = class294.method1990(29373, method1601(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class65.method418(-8429, arg0.field1059);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2357)
    private final void method1600(int arg0) {
        class36.method232(this, (byte) -101);
        for (class228.field3838 = 0; class87.method558((byte) -125) && class228.field3838 < 128; class228.field3838++) {
            class302.field5104[class228.field3838] = class35.field523;
            class94.field1595[class228.field3838] = class215.field3652;
        }
        if (arg0 != 1000) {
            this.method1134((byte) -17);
        }
        field4017++;
        class44.field606++;
        if (class82.field1397 != -1) {
            class295.method2004(1, 0, 0, class82.field1397, 0, class115.field1945, 0, class48.field655);
        }
        class252.field4284++;
        int var2 = 19137023;
        label183: for (int var3 = 0; var3 < 32768; var3++) {
            class60 var4 = class33.field493[var3];
            if (var4 != null) {
                byte var5 = var4.field822.field2198;
                if ((var5 & 0x2) > 0 && var4.field1212 == 0 && Math.random() * 1000.0D < 10.0D) {
                    int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                    int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                    if (var6 != 0 || var7 != 0) {
                        var4.field1178[0] = (var4.field1193 >> 7) + var6;
                        var4.field1150[0] = (var4.field1210 >> 7) + var7;
                        class180.field3102[class61.field850].method695(var4.field1193 >> 7, var4.method460((byte) -7), 0, arg0 ^ 0x203E8, false, var4.field1210 >> 7, var4.method460((byte) -120));
                        if (var4.field1178[0] >= 0 && var4.field1178[0] <= 104 - var4.method460((byte) -86) && var4.field1150[0] >= 0 && var4.field1150[0] <= 104 - var4.method460((byte) -82) && class180.field3102[class61.field850].method693(var4.field1178[0], var4.field1150[0], var4.field1210 >> 7, var4.field1193 >> 7, arg0 ^ 0x6D5F)) {
                            if (var4.method460((byte) 36) > 1) {
                                for (int var8 = var4.field1178[0]; var4.field1178[0] + var4.method460((byte) -21) > var8; var8++) {
                                    for (int var9 = var4.field1150[0]; (var4.field1150[0] + var4.method460((byte) 124)) > var9; var9++) {
                                        if ((var2 & class180.field3102[class61.field850].field1765[var8][var9]) != 0) {
                                            continue label183;
                                        }
                                    }
                                }
                            }
                            var4.field1212 = 1;
                        }
                    }
                }
                class184.method1217((byte) 123, var4);
                class283.method1931(var4, true);
                class19.method117(true, var4);
                class180.field3102[class61.field850].method697(var4.method460((byte) 123), var4.field1193 >> 7, var4.method460((byte) 118), false, var4.field1210 >> 7, false);
            }
        }
        if (class299.field5056 == 0 && class194.field3316 == 0) {
            if (class26.field377 == 2) {
                class134.method830(7515);
            } else {
                class38.method238(true);
            }
            if (class116.field1976 >> 7 < 14 || class116.field1976 >> 7 >= 90 || (class135.field2273 >> 7) < 14 || class135.field2273 >> 7 >= 90) {
                class58.method381(29744);
            }
        }
        while (true) {
            class231 var10;
            class69 var17;
            class69 var18;
            do {
                var10 = (class231) class270.field4559.method1814(false);
                if (var10 == null) {
                    while (true) {
                        class231 var11;
                        class69 var15;
                        class69 var16;
                        do {
                            var11 = (class231) class112.field1886.method1814(false);
                            if (var11 == null) {
                                while (true) {
                                    class231 var12;
                                    class69 var13;
                                    class69 var14;
                                    do {
                                        var12 = (class231) class254.field4294.method1814(false);
                                        if (var12 == null) {
                                            if (class20.field274 != null) {
                                                class75.method497(6353);
                                            }
                                            if (class92.field1548 != null && class92.field1548.field5293 == 1) {
                                                if (class92.field1548.field5296 != null) {
                                                    class226.method1482(class278.field4651, class38.field550, -17397);
                                                }
                                                class38.field550 = false;
                                                class278.field4651 = null;
                                                class92.field1548 = null;
                                            }
                                            return;
                                        }
                                        var13 = var12.field3912;
                                        if (var13.field1126 < 0) {
                                            break;
                                        }
                                        var14 = class65.method418(-8429, var13.field1059);
                                    } while (var14 == null || var14.field1043 == null || var14.field1043.length <= var13.field1126 || var14.field1043[var13.field1126] != var13);
                                    class194.method1253(var12, arg0 + 20258);
                                }
                            }
                            var15 = var11.field3912;
                            if (var15.field1126 < 0) {
                                break;
                            }
                            var16 = class65.method418(-8429, var15.field1059);
                        } while (var16 == null || var16.field1043 == null || var16.field1043.length <= var15.field1126 || var16.field1043[var15.field1126] != var15);
                        class194.method1253(var11, arg0 ^ 0x50E2);
                    }
                }
                var17 = var10.field3912;
                if (var17.field1126 < 0) {
                    break;
                }
                var18 = class65.method418(-8429, var17.field1059);
            } while (var18 == null || var18.field1043 == null || var17.field1126 >= var18.field1043.length || var18.field1043[var17.field1126] != var17);
            class194.method1253(var10, arg0 ^ 0x50E2);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lkg;)I", line = 2567)
    public static final int method1601(class69 arg0) {
        class119 var1 = (class119) class110.field1857.method1612(((long) arg0.field1079 << 32) + (long) arg0.field1126, 115);
        return var1 == null ? arg0.field983 : var1.field1998;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2577)
    private final void method1602(byte arg0) {
        field4027++;
        if (arg0 != -25) {
            method1601((class69) null);
        }
        if (class129.field2196.field1255 >= 4) {
            this.method1136("js5crc", 20504);
            class175.field3019 = 1000;
            return;
        }
        if (class129.field2196.field1257 >= 4) {
            if (class175.field3019 == 0 || class175.field3019 == 5) {
                this.method1136("js5io", arg0 ^ 0xFFFFAFFF);
                class175.field3019 = 1000;
                return;
            }
            class129.field2196.field1257 = 3;
            class88.field1483 = 3000;
        }
        if ((class88.field1483--) > 0) {
            return;
        }
        try {
            if (class24.field357 == 0) {
                class177.field3050 = class150.field2460.method1692(class62.field866, class53.field714, 83);
                class24.field357++;
            }
            if (class24.field357 == 1) {
                if (class177.field3050.field5293 == 2) {
                    this.method1591(-1, 12);
                    return;
                }
                if (class177.field3050.field5293 == 1) {
                    class24.field357++;
                }
            }
            if (class24.field357 == 2) {
                class74.field1296 = new class199((Socket) class177.field3050.field5296, class150.field2460);
                class229 var2 = new class229(5);
                var2.method1499(true, 15);
                var2.method1515(511, 82);
                class74.field1296.method1278(5, var2.field3879, 0, (byte) -37);
                class24.field357++;
                class294.field4964 = class216.method1426(255);
            }
            if (class24.field357 == 3) {
                if (class175.field3019 == 0 || class175.field3019 == 5 || class74.field1296.method1284(-1) > 0) {
                    int var3 = class74.field1296.method1280((byte) 63);
                    if (var3 != 0) {
                        this.method1591(var3, arg0 ^ 0xFFFFFFEB);
                        return;
                    }
                    class24.field357++;
                } else if (class216.method1426(255) - class294.field4964 > 30000L) {
                    this.method1591(-2, 12);
                    return;
                }
            }
            if (class24.field357 == 4) {
                boolean var4 = class175.field3019 == 5 || class175.field3019 == 10 || class175.field3019 == 28;
                class129.field2196.method476(class74.field1296, !var4, 4);
                class74.field1296 = null;
                class177.field3050 = null;
                class24.field357 = 0;
                class242.field4075 = 0;
            }
        } catch (IOException var6) {
            this.method1591(-3, 12);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 2717)
    public final void method1148(boolean arg0) {
        field4023++;
        class66.field924 = new class162();
        class129.field2196 = new class71();
        if (class191.field3291 == 0) {
        }
        class220.method1449(class150.field2460, -1, class114.field1917);
        class54.field721 = class256.field4325 == 0 ? 443 : class160.field2639 + 50000;
        class92.field1571 = class280.field4680 = class304.field5137 = class277.field4638 = new short[256];
        class13.field138 = class256.field4325 == 0 ? 43594 : class160.field2639 + 40000;
        class53.field714 = class13.field138;
        if (class280.field4678 == 1) {
            class30.field447 = class267.field4521;
            class213.field3628 = class294.field4962;
            class184.field3169 = class267.field4522;
            class104.field1803 = class74.field1300;
            class59.field812 = 0;
            class59.field813 = 16777215;
        } else {
            class184.field3169 = class15.field168;
            class30.field447 = class68.field962;
            class213.field3628 = class14.field155;
            class104.field1803 = class30.field465;
        }
        class183.method1212(-28828);
        method1598(class264.field4487, (byte) -126);
        if (arg0) {
            return;
        }
        class86.method553(class264.field4487, 3);
        class272.field4571 = class205.method1319((byte) 127);
        if (class272.field4571 != null) {
            class272.field4571.method53(-4277, class264.field4487);
        }
        class82.field1399 = class251.field4257;
        try {
            if (class150.field2460.field4260 != null) {
                class143.field2379 = new class180(class150.field2460.field4260, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class201.field3437[var2] = new class180(class150.field2460.field4267[var2], 6000, 0);
                }
                class163.field2681 = new class180(class150.field2460.field4266, 6000, 0);
                class122.field2039 = new class30(255, class143.field2379, class163.field2681, 500000);
                class37.field543 = new class180(class150.field2460.field4258, 24, 0);
                class150.field2460.field4258 = null;
                class150.field2460.field4266 = null;
                class150.field2460.field4267 = null;
                class150.field2460.field4260 = null;
            }
        } catch (IOException var4) {
            class37.field543 = null;
            class163.field2681 = null;
            class143.field2379 = null;
            class122.field2039 = null;
        }
        class83.field1411 = class225.field3776;
        if (class256.field4325 != 0) {
            class65.field906 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 2800)
    public final void method1134(byte arg0) {
        field4025++;
        if (class175.field3019 == 1000) {
            return;
        }
        class75.field1309++;
        if (arg0 > -75) {
            return;
        }
        if ((class75.field1309 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class30.field466 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class163.field2692.setSeed((long) class30.field466);
        }
        this.method1597(-2);
        if (class67.field930 != null) {
            class67.field930.method283((byte) -38);
        }
        class222.method1456((byte) -108);
        class281.method1876((byte) 9);
        class305.method2077((byte) -77);
        class284.method1956((byte) 104);
        class101.method674();
        if (class272.field4571 != null) {
            int var3 = class272.field4571.method51((byte) 107);
            class229.field3908 = var3;
        }
        if (class175.field3019 == 0) {
            this.method1595(-21473);
            class82.method535((byte) 5);
        } else if (class175.field3019 == 5) {
            this.method1595(-21473);
            class82.method535((byte) 5);
        } else if (class175.field3019 == 25 || class175.field3019 == 28) {
            class20.method123(true);
        }
        if (class175.field3019 == 10) {
            this.method1600(1000);
            class193.method1247(0);
            class26.method180(2);
        } else if (class175.field3019 == 30) {
            class199.method1283(127);
        } else if (class175.field3019 == 40) {
            class26.method180(2);
            if (class255.field4302 != -3) {
                if (class255.field4302 == 15) {
                    class151.method932((byte) -115);
                } else if (class255.field4302 != 2) {
                    class241.method1620(28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V", line = 2888)
    public static final void method1603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4013++;
        if (arg1 == arg3) {
            class137.method853((byte) 110, arg0, arg2, arg3, arg4);
            return;
        }
        if (arg5 != 130) {
            field4011 = (class283) null;
        }
        if (class269.field4551 <= (arg4 - arg3) && arg3 + arg4 <= class166.field2765 && (arg0 - arg1) >= class217.field3677 && class247.field4220 >= (arg0 + arg1)) {
            class299.method2026(arg4, arg1, arg0, arg2, 98, arg3);
        } else {
            class197.method1263(arg2, arg1, arg0, (byte) 106, arg3, arg4);
        }
    }
}
