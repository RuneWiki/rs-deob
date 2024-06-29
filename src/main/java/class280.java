import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class280 {

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field4252 = 0;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4256 = "";

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lqb;")
    public static class289 field4251 = new class289();

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4258 = "Loaded input handler";

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lca;")
    public class131 field4248;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "[Lmc;")
    public static class176[] field4257;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static final void method1835(byte arg0) {
        field4254++;
        if (class114.field1571) {
            return;
        }
        if (arg0 != 46) {
            method1835((byte) -62);
        }
        if (class254.field3666) {
            class274.field4085 = (float) ((int) class274.field4085 - 65 & 0xFFFFFF80);
        } else {
            class238.field3438 += (-class238.field3438 - 24.0F) / 2.0F;
        }
        class200.field2855 = true;
        class114.field1571 = true;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZ)V")
    public static final void method1836(boolean arg0, boolean arg1) {
        class180.field2556 = arg0;
        if (class180.field2556) {
            int var16 = class163.field2332.method1388(-1);
            int var17 = class163.field2332.method1385(2);
            class163.field2332.method586(-9);
            for (int var18 = 0; var18 < 4; var18++) {
                for (int var37 = 0; var37 < 13; var37++) {
                    for (int var38 = 0; var38 < 13; var38++) {
                        int var39 = class163.field2332.method594((byte) 102, 1);
                        if (var39 == 1) {
                            class124.field1791[var18][var37][var38] = class163.field2332.method594((byte) 112, 26);
                        } else {
                            class124.field1791[var18][var37][var38] = -1;
                        }
                    }
                }
            }
            class163.field2332.method587((byte) -122);
            int var19 = (class230.field3314 - class163.field2332.field3021) / 16;
            class136.field1984 = new int[var19][4];
            for (int var20 = 0; var20 < var19; var20++) {
                for (int var36 = 0; var36 < 4; var36++) {
                    class136.field1984[var20][var36] = class163.field2332.method1358(55);
                }
            }
            int var21 = class163.field2332.method1362(5);
            int var22 = class163.field2332.method1400(false);
            boolean var23 = class97.method582(class163.field2332.method1369((byte) -125), -115);
            int var24 = class163.field2332.method1380(true);
            class221.field3125 = null;
            class282.field4278 = new byte[var19][];
            class3.field40 = new int[var19];
            class190.field2739 = new int[var19];
            class263.field3815 = new int[var19];
            class41.field500 = null;
            class138.field2009 = new int[var19];
            class261.field3801 = new byte[var19][];
            class51.field585 = new int[var19];
            int var25 = 0;
            for (int var26 = 0; var26 < 4; var26++) {
                for (int var27 = 0; var27 < 13; var27++) {
                    for (int var28 = 0; var28 < 13; var28++) {
                        int var29 = class124.field1791[var26][var27][var28];
                        if (var29 != -1) {
                            int var30 = (var29 & 0xFFDF5A) >> 14;
                            int var31 = var29 >> 3 & 0x7FF;
                            int var32 = (var30 / 8 << 8) + var31 / 8;
                            for (int var33 = 0; var33 < var25; var33++) {
                                if (class190.field2739[var33] == var32) {
                                    var32 = -1;
                                    break;
                                }
                            }
                            if (var32 != -1) {
                                class190.field2739[var25] = var32;
                                int var34 = var32 & 0xFF;
                                int var35 = (var32 & 0xFF86) >> 8;
                                class263.field3815[var25] = class26.field305.method1844("m" + var35 + "_" + var34, -99);
                                class3.field40[var25] = class26.field305.method1844("l" + var35 + "_" + var34, -49);
                                class138.field2009[var25] = class26.field305.method1844("um" + var35 + "_" + var34, 100);
                                class51.field585[var25] = class26.field305.method1844("ul" + var35 + "_" + var34, 110);
                                var25++;
                            }
                        }
                    }
                }
            }
            class179.method1164(false, var21, var17, var23, var16, var24, -126, var22);
        } else {
            int var2 = class163.field2332.method1388(-1);
            int var3 = class163.field2332.method1400(false);
            int var4 = (class230.field3314 - class163.field2332.field3021) / 16;
            class136.field1984 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class136.field1984[var5][var15] = class163.field2332.method1358(59);
                }
            }
            int var6 = class163.field2332.method1385(2);
            boolean var7 = class97.method582(class163.field2332.method1362(5), -95);
            boolean var8 = false;
            int var9 = class163.field2332.method1380(true);
            int var10 = class163.field2332.method1407(106);
            class190.field2739 = new int[var4];
            class41.field500 = null;
            class282.field4278 = new byte[var4][];
            class221.field3125 = null;
            class263.field3815 = new int[var4];
            class138.field2009 = new int[var4];
            class3.field40 = new int[var4];
            if (((var2 / 8) == 48 || (var2 / 8) == 49) && var3 / 8 == 48) {
                var8 = true;
            }
            class261.field3801 = new byte[var4][];
            class51.field585 = new int[var4];
            if ((var2 / 8) == 48 && (var3 / 8) == 148) {
                var8 = true;
            }
            int var11 = 0;
            for (int var12 = (var2 - 6) / 8; var12 <= ((var2 + 6) / 8); var12++) {
                for (int var13 = (var3 - 6) / 8; var13 <= ((var3 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var8 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class190.field2739[var11] = var14;
                        class263.field3815[var11] = -1;
                        class3.field40[var11] = -1;
                        class138.field2009[var11] = -1;
                        class51.field585[var11] = -1;
                    } else {
                        class190.field2739[var11] = var14;
                        class263.field3815[var11] = class26.field305.method1844("m" + var12 + "_" + var13, -71);
                        class3.field40[var11] = class26.field305.method1844("l" + var12 + "_" + var13, 92);
                        class138.field2009[var11] = class26.field305.method1844("um" + var12 + "_" + var13, -100);
                        class51.field585[var11] = class26.field305.method1844("ul" + var12 + "_" + var13, -106);
                    }
                    var11++;
                }
            }
            class179.method1164(false, var10, var3, var7, var6, var9, -124, var2);
        }
        if (arg1) {
            field4252 = -91;
        }
        field4249++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)Lmk;")
    public static final class213 method1837(int arg0, byte arg1) {
        field4247++;
        if (arg1 <= 88) {
            return null;
        }
        class213 var2 = (class213) class82.field1116.method65((byte) -110, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class167.field2405.method1861(arg0, 33, 1);
        class213 var4 = new class213();
        if (var3 != null) {
            var4.method1344(1, arg0, new class216(var3));
        }
        class82.field1116.method64((long) arg0, -1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static final void method1838(boolean arg0) {
        if (class24.field291 > 0) {
            class24.field291--;
        }
        field4255++;
        if (class206.field2931 > 1) {
            class118.field1679 = class176.field2500;
            class206.field2931--;
        }
        if (class150.field2185) {
            class150.field2185 = false;
            class185.method1208((byte) 47);
            return;
        }
        for (int var1 = 0; var1 < 100 && class231.method1512(2047); var1++) {
        }
        if (class141.field2034 != 30) {
            return;
        }
        class246.method1588(148, -23326, class94.field1259);
        Object var2 = class247.field3596.field2419;
        synchronized (class247.field3596.field2419) {
            if (!class88.field1198) {
                class247.field3596.field2425 = 0;
            } else if (class52.field599 != 0 || class247.field3596.field2425 >= 40) {
                class94.field1259.method592(143, false);
                class235.field3391++;
                int var3 = 0;
                class94.field1259.method1373(0, -13985);
                int var4 = class94.field1259.field3021;
                for (int var5 = 0; class247.field3596.field2425 > var5 && (class94.field1259.field3021 - var4) < 240; var5++) {
                    int var6 = class247.field3596.field2427[var5];
                    int var7 = class247.field3596.field2426[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    var3++;
                    if (class247.field3596.field2427[var5] == -1 && class247.field3596.field2426[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class29.field346 != var7 || class35.field409 != var6) {
                        int var9 = var7 - class29.field346;
                        class29.field346 = var7;
                        int var10 = var6 - class35.field409;
                        class35.field409 = var6;
                        if (class87.field1179 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class94.field1259.method1387((class87.field1179 << 12) + (var9 << 6) + var10, 4);
                            class87.field1179 = 0;
                        } else if (class87.field1179 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class94.field1259.method1373(class87.field1179 + 128, -13985);
                            var10 += 128;
                            var9 += 128;
                            class94.field1259.method1387((var9 << 8) + var10, 4);
                            class87.field1179 = 0;
                        } else if (class87.field1179 < 32) {
                            class94.field1259.method1373(class87.field1179 + 192, -13985);
                            if (var8) {
                                class94.field1259.method1410(Integer.MIN_VALUE, (byte) -126);
                            } else {
                                class94.field1259.method1410(var6 << 16 | var7, (byte) -124);
                            }
                            class87.field1179 = 0;
                        } else {
                            class94.field1259.method1387(class87.field1179 + 57344, 4);
                            if (var8) {
                                class94.field1259.method1410(Integer.MIN_VALUE, (byte) -13);
                            } else {
                                class94.field1259.method1410(var7 | var6 << 16, (byte) -124);
                            }
                            class87.field1179 = 0;
                        }
                    } else if (class87.field1179 < 2047) {
                        class87.field1179++;
                    }
                }
                class94.field1259.method1371(70, class94.field1259.field3021 - var4);
                if (class247.field3596.field2425 <= var3) {
                    class247.field3596.field2425 = 0;
                } else {
                    class247.field3596.field2425 -= var3;
                    for (int var11 = 0; var11 < class247.field3596.field2425; var11++) {
                        class247.field3596.field2426[var11] = class247.field3596.field2426[var11 + var3];
                        class247.field3596.field2427[var11] = class247.field3596.field2427[var3 + var11];
                    }
                }
            }
        }
        if (class52.field599 != 0) {
            long var12 = (class131.field1888 - class190.field2745) / 50L;
            class190.field2745 = class131.field1888;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class179.field2541++;
            int var14 = class76.field905;
            int var15 = class190.field2736;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (class52.field599 == 2) {
                var16 = 1;
            }
            class94.field1259.method592(103, false);
            int var17 = (int) var12;
            class94.field1259.method1387(var16 << 15 | var17, 4);
            class94.field1259.method1410(var15 << 16 | var14, (byte) 113);
        }
        if (class143.field2043 > 0) {
            class143.field2043--;
        }
        if (class200.field2855 && class143.field2043 <= 0) {
            class48.field558++;
            class143.field2043 = 20;
            class200.field2855 = false;
            class94.field1259.method592(123, arg0);
            class94.field1259.method1387((int) class274.field4085, 4);
            class94.field1259.method1376((int) class159.field2310, 94);
        }
        if (class82.field1140 && !class283.field4308) {
            class33.field392++;
            class283.field4308 = true;
            class94.field1259.method592(67, false);
            class94.field1259.method1373(1, -13985);
        }
        if (arg0 == class82.field1140 && class283.field4308) {
            class283.field4308 = false;
            class94.field1259.method592(67, false);
            class33.field392++;
            class94.field1259.method1373(0, -13985);
        }
        if (!class115.field1596) {
            class94.field1259.method592(214, false);
            class114.field1578++;
            class94.field1259.method1404((byte) 104, class71.method439(-1814797368));
            class115.field1596 = true;
        }
        if (class114.field1571) {
            class114.field1571 = false;
        } else {
            class238.field3438 /= 2.0F;
        }
        if (class49.field561) {
            class49.field561 = false;
        } else {
            class154.field2232 /= 2.0F;
        }
        class137.method896((byte) 120);
        if (class141.field2034 != 30) {
            return;
        }
        class164.method1076(-1);
        class4.method22(97);
        class33.method210((byte) 96);
        class163.field2345++;
        if (class163.field2345 > 750) {
            class185.method1208((byte) 54);
            return;
        }
        class114.method734(-97);
        class63.method387((byte) 117);
        class38.method240(31);
        if (class238.field3431 != null) {
            class71.method440((byte) 97);
        }
        for (int var18 = class119.method777(true, 0); var18 != -1; var18 = class119.method777(false, 0)) {
            class60.method372((byte) -114, var18);
            class216.field3025[class5.method26(class203.field2895++, 31)] = var18;
        }
        for (class66 var19 = class173.method1128((byte) 76); var19 != null; var19 = class173.method1128((byte) 76)) {
            int var20 = var19.method409((byte) 2);
            int var21 = var19.method406(74);
            if (var20 == 1) {
                class165.field2366[var21] = var19.field784;
                class197.field2805[class5.method26(31, class151.field2195++)] = var21;
            } else if (var20 == 2) {
                class150.field2189[var21] = var19.field785;
                class55.field650[class5.method26(31, class79.field938++)] = var21;
            } else if (var20 == 3) {
                class82 var42 = class182.method1187((byte) -41, var21);
                if (!var19.field785.equals(var42.field1123)) {
                    var42.field1123 = var19.field785;
                    class255.method1632(16711680, var42);
                }
            } else if (var20 == 4) {
                class82 var22 = class182.method1187((byte) -41, var21);
                int var23 = var19.field784;
                int var24 = var19.field782;
                int var25 = var19.field786;
                if (var22.field1098 != var23 || var22.field974 != var25 || var22.field1135 != var24) {
                    var22.field1135 = var24;
                    var22.field974 = var25;
                    var22.field1098 = var23;
                    class255.method1632(16711680, var22);
                }
            } else if (var20 == 5) {
                class82 var26 = class182.method1187((byte) -41, var21);
                if (var19.field784 != var26.field969 || var19.field784 == -1) {
                    var26.field1043 = 0;
                    var26.field1092 = 1;
                    var26.field1088 = 0;
                    var26.field969 = var19.field784;
                    class255.method1632(16711680, var26);
                }
            } else if (var20 == 6) {
                int var27 = var19.field784;
                int var28 = (var27 & 0x7C2C) >> 10;
                int var29 = var27 >> 5 & 0x1F;
                int var30 = var27 & 0x1F;
                int var31 = (var28 << 19) + ((var29 << 11) + (var30 << 3));
                class82 var32 = class182.method1187((byte) -41, var21);
                if (var32.field1134 != var31) {
                    var32.field1134 = var31;
                    class255.method1632(16711680, var32);
                }
            } else if (var20 == 7) {
                class82 var33 = class182.method1187((byte) -41, var21);
                boolean var34 = var19.field784 == 1;
                if (var34 != var33.field1013) {
                    var33.field1013 = var34;
                    class255.method1632(16711680, var33);
                }
            } else if (var20 == 8) {
                class82 var35 = class182.method1187((byte) -41, var21);
                if (var19.field784 != var35.field964 || var19.field786 != var35.field1141 || var19.field782 != var35.field1133) {
                    var35.field964 = var19.field784;
                    var35.field1141 = var19.field786;
                    var35.field1133 = var19.field782;
                    if (var35.field1024 != -1) {
                        if (var35.field983 > 0) {
                            var35.field1133 = var35.field1133 * 32 / var35.field983;
                        } else if (var35.field997 > 0) {
                            var35.field1133 = var35.field1133 * 32 / var35.field997;
                        }
                    }
                    class255.method1632(16711680, var35);
                }
            } else if (var20 == 9) {
                class82 var41 = class182.method1187((byte) -41, var21);
                if (var19.field784 != var41.field1024 || var19.field786 != var41.field987) {
                    var41.field1024 = var19.field784;
                    var41.field987 = var19.field786;
                    class255.method1632(16711680, var41);
                }
            } else if (var20 == 10) {
                class82 var40 = class182.method1187((byte) -41, var21);
                if (var19.field784 != var40.field1086 || var19.field786 != var40.field1046 || var19.field782 != var40.field1085) {
                    var40.field1086 = var19.field784;
                    var40.field1046 = var19.field786;
                    var40.field1085 = var19.field782;
                    class255.method1632(16711680, var40);
                }
            } else if (var20 == 11) {
                class82 var39 = class182.method1187((byte) -41, var21);
                var39.field1076 = 0;
                var39.field1057 = 0;
                var39.field1096 = var39.field1089 = var19.field786;
                var39.field1000 = var39.field1112 = var19.field784;
                class255.method1632(16711680, var39);
            } else if (var20 == 12) {
                class82 var36 = class182.method1187((byte) -41, var21);
                int var37 = var19.field784;
                if (var36 != null && var36.field1026 == 0) {
                    if (var36.field1079 - var36.field1048 < var37) {
                        var37 = var36.field1079 - var36.field1048;
                    }
                    if (var37 < 0) {
                        var37 = 0;
                    }
                    if (var36.field1018 != var37) {
                        var36.field1018 = var37;
                        class255.method1632(16711680, var36);
                    }
                }
            } else if (var20 == 13) {
                class82 var38 = class182.method1187((byte) -41, var21);
                var38.field1110 = var19.field784;
            }
        }
        if (class73.field880 != 0) {
            class97.field1298 += 20;
            if (class97.field1298 >= 400) {
                class73.field880 = 0;
            }
        }
        class123.field1771++;
        if (class202.field2863 != null) {
            class152.field2200++;
            if (class152.field2200 >= 15) {
                class255.method1632(16711680, class202.field2863);
                class202.field2863 = null;
            }
        }
        if (class209.field2948 != null) {
            class255.method1632(16711680, class209.field2948);
            class205.field2910++;
            if (class104.field1417 > class173.field2482 + 5 || class173.field2482 - 5 > class104.field1417 || class37.field431 > class40.field476 + 5 || class37.field431 < (class40.field476 - 5)) {
                class97.field1287 = true;
            }
            if (class151.field2193 == 0) {
                if (class97.field1287 && class205.field2910 >= 5) {
                    if (class209.field2948 == class149.field2172 && class287.field4474 != class270.field3948) {
                        class259.field3765++;
                        class82 var43 = class209.field2948;
                        byte var44 = 0;
                        if (class196.field2794 == 1 && var43.field1136 == 206) {
                            var44 = 1;
                        }
                        if (var43.field1080[class270.field3948] <= 0) {
                            var44 = 0;
                        }
                        if (client.method1920(var43).method1149((byte) 79)) {
                            int var45 = class287.field4474;
                            int var46 = class270.field3948;
                            var43.field1080[var46] = var43.field1080[var45];
                            var43.field1066[var46] = var43.field1066[var45];
                            var43.field1080[var45] = -1;
                            var43.field1066[var45] = 0;
                        } else if (var44 == 1) {
                            int var47 = class287.field4474;
                            int var48 = class270.field3948;
                            while (var47 != var48) {
                                if (var48 < var47) {
                                    var43.method486(-65536, var47, var47 - 1);
                                    var47--;
                                } else if (var48 > var47) {
                                    var43.method486(-65536, var47, var47 + 1);
                                    var47++;
                                }
                            }
                        } else {
                            var43.method486(-65536, class287.field4474, class270.field3948);
                        }
                        class94.field1259.method592(168, false);
                        class94.field1259.method1403(-98, var44);
                        class94.field1259.method1361(class209.field2948.field1025, (byte) 20);
                        class94.field1259.method1364(class270.field3948, 1024);
                        class94.field1259.method1376(class287.field4474, -117);
                    }
                } else if ((class59.field704 == 1 || class5.method29(class112.field1496 - 1, (byte) -37)) && class112.field1496 > 2) {
                    class255.method1631(256);
                } else if (class112.field1496 > 0) {
                    class292.method1957(114);
                }
                class152.field2200 = 10;
                class209.field2948 = null;
                class52.field599 = 0;
            }
        }
        class87.field1181 = false;
        class82 var49 = class246.field3580;
        class251.field3638 = null;
        class245.field3562 = false;
        class235.field3383 = 0;
        class82 var50 = class26.field311;
        class26.field311 = null;
        class246.field3580 = null;
        while (class52.method317(96) && class235.field3383 < 128) {
            class51.field589[class235.field3383] = class224.field3165;
            class247.field3594[class235.field3383] = class101.field1392;
            class235.field3383++;
        }
        class238.field3431 = null;
        if (class123.field1776 != -1) {
            class202.method1296(0, true, client.field4437, 0, class123.field1776, class84.field1166, 0, 0);
        }
        class176.field2500++;
        while (true) {
            class11 var51;
            class82 var52;
            class82 var53;
            do {
                var51 = (class11) class22.field267.method1526(16383);
                if (var51 == null) {
                    while (true) {
                        class11 var54;
                        class82 var55;
                        class82 var56;
                        do {
                            var54 = (class11) class16.field193.method1526(16383);
                            if (var54 == null) {
                                while (true) {
                                    class11 var57;
                                    class82 var58;
                                    class82 var59;
                                    do {
                                        var57 = (class11) class41.field496.method1526(16383);
                                        if (var57 == null) {
                                            if (class238.field3431 == null) {
                                                class67.field792 = 0;
                                            }
                                            if (class131.field1886 != null) {
                                                class192.method1251(1);
                                            }
                                            if (class88.field1192 > 0 && class260.field3784[82] && class260.field3784[81] && class161.field2320 != 0) {
                                                int var60 = class199.field2833 - class161.field2320;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class87.method512(64, class110.field1473 + class177.field2507.field4597[0], var60, class166.field2383 + class177.field2507.field4585[0]);
                                            }
                                            if (class88.field1192 > 0 && class260.field3784[82] && class260.field3784[81]) {
                                                if (class251.field3633 != -1) {
                                                    class87.method512(42, class251.field3633 + class110.field1473, class199.field2833, class176.field2506 + class166.field2383);
                                                }
                                                class182.field2617 = 0;
                                                class38.field454 = 0;
                                            } else if (class38.field454 == 2) {
                                                if (class251.field3633 != -1) {
                                                    class140.field2026++;
                                                    class94.field1259.method592(142, false);
                                                    class94.field1259.method1376(class110.field1473 + class251.field3633, -124);
                                                    class94.field1259.method1376(class176.field2506 + class166.field2383, 29);
                                                    class94.field1259.method1376(class276.field4192, -128);
                                                    class94.field1259.method1368(class287.field4469, -1204862360);
                                                    class285.field4413 = class76.field905;
                                                    class119.field1702 = class190.field2736;
                                                    class73.field880 = 1;
                                                    class97.field1298 = 0;
                                                }
                                                class38.field454 = 0;
                                            } else if (class182.field2617 == 2) {
                                                if (class251.field3633 != -1) {
                                                    class94.field1259.method592(94, false);
                                                    class71.field847++;
                                                    class94.field1259.method1376(class251.field3633 + class110.field1473, -114);
                                                    class94.field1259.method1364(class166.field2383 + class176.field2506, 1024);
                                                    class285.field4413 = class76.field905;
                                                    class73.field880 = 1;
                                                    class119.field1702 = class190.field2736;
                                                    class97.field1298 = 0;
                                                }
                                                class182.field2617 = 0;
                                            } else if (class251.field3633 != -1 && class38.field454 == 0 && class182.field2617 == 0) {
                                                class230.method1505(arg0, (class251.field3633 << 1) + 1 - class177.field2507.method1556(3888) >> 1, (class176.field2506 << 1) + 1 - class177.field2507.method1556(3888) >> 1, 0);
                                                class285.field4413 = class76.field905;
                                                class119.field1702 = class190.field2736;
                                                class97.field1298 = 0;
                                                class73.field880 = 1;
                                            }
                                            class251.field3633 = -1;
                                            class172.method1125(-6135);
                                            if (class246.field3580 != var49) {
                                                if (var49 != null) {
                                                    class255.method1632(16711680, var49);
                                                }
                                                if (class246.field3580 != null) {
                                                    class255.method1632(16711680, class246.field3580);
                                                }
                                            }
                                            if (class26.field311 != var50 && field4252 == class154.field2233) {
                                                if (var50 != null) {
                                                    class255.method1632(16711680, var50);
                                                }
                                                if (class26.field311 != null) {
                                                    class255.method1632(16711680, class26.field311);
                                                }
                                            }
                                            if (class26.field311 == null) {
                                                if (field4252 > 0) {
                                                    field4252--;
                                                }
                                            } else if (class154.field2233 > field4252) {
                                                field4252++;
                                                if (field4252 == class154.field2233) {
                                                    class255.method1632(16711680, class26.field311);
                                                }
                                            }
                                            for (int var61 = 0; var61 < 5; var61++) {
                                                int var10002 = class167.field2411[var61]++;
                                            }
                                            int var62 = class181.method1179((byte) 100);
                                            int var63 = class219.method1426(-1);
                                            if (var62 > 15000 && var63 > 15000) {
                                                class170.field2438++;
                                                class24.field291 = 250;
                                                class50.method303((byte) -28, 14500);
                                                class94.field1259.method592(199, false);
                                            }
                                            if (class226.field3186 != null && class226.field3186.field960 == 1) {
                                                if (class226.field3186.field958 != null) {
                                                    class96.method575(class238.field3425, class171.field2445, 1);
                                                }
                                                class238.field3425 = false;
                                                class226.field3186 = null;
                                                class171.field2445 = null;
                                            }
                                            class180.field2548++;
                                            class290.field4504++;
                                            class77.field930++;
                                            if (class77.field930 > 500) {
                                                class77.field930 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class99.field1323 += class116.field1629;
                                                }
                                                if ((var64 & 0x4) == 4) {
                                                    class226.field3174 += class17.field202;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class77.field928 += class163.field2340;
                                                }
                                            }
                                            if (class77.field928 < -55) {
                                                class163.field2340 = 2;
                                            }
                                            if (class77.field928 > 55) {
                                                class163.field2340 = -2;
                                            }
                                            if (class99.field1323 < -50) {
                                                class116.field1629 = 2;
                                            }
                                            if (class226.field3174 < -40) {
                                                class17.field202 = 1;
                                            }
                                            if (class180.field2548 > 500) {
                                                class180.field2548 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x1) == 1) {
                                                    class139.field2016 += class249.field3620;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class15.field187 += class90.field1228;
                                                }
                                            }
                                            if (class15.field187 < -20) {
                                                class90.field1228 = 1;
                                            }
                                            if (class139.field2016 < -60) {
                                                class249.field3620 = 2;
                                            }
                                            if (class99.field1323 > 50) {
                                                class116.field1629 = -2;
                                            }
                                            if (class15.field187 > 10) {
                                                class90.field1228 = -1;
                                            }
                                            if (class139.field2016 > 60) {
                                                class249.field3620 = -2;
                                            }
                                            if (class226.field3174 > 40) {
                                                class17.field202 = -1;
                                            }
                                            if (class290.field4504 > 50) {
                                                class70.field806++;
                                                class94.field1259.method592(242, arg0);
                                            }
                                            if (class259.field3770) {
                                                class70.method429((byte) -99);
                                                class259.field3770 = false;
                                            }
                                            try {
                                                if (class117.field1637 != null && class94.field1259.field3021 > 0) {
                                                    class117.field1637.method1206(class94.field1259.field3030, class94.field1259.field3021, (byte) -43, 0);
                                                    class94.field1259.field3021 = 0;
                                                    class290.field4504 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class185.method1208((byte) -112);
                                                return;
                                            }
                                        }
                                        var58 = var57.field145;
                                        if (var58.field963 < 0) {
                                            break;
                                        }
                                        var59 = class182.method1187((byte) -41, var58.field1101);
                                    } while (var59 == null || var59.field1034 == null || var58.field963 >= var59.field1034.length || var59.field1034[var58.field963] != var58);
                                    class110.method684(var57, false);
                                }
                            }
                            var55 = var54.field145;
                            if (var55.field963 < 0) {
                                break;
                            }
                            var56 = class182.method1187((byte) -41, var55.field1101);
                        } while (var56 == null || var56.field1034 == null || var56.field1034.length <= var55.field963 || var56.field1034[var55.field963] != var55);
                        class110.method684(var54, false);
                    }
                }
                var52 = var51.field145;
                if (var52.field963 < 0) {
                    break;
                }
                var53 = class182.method1187((byte) -41, var52.field1101);
            } while (var53 == null || var53.field1034 == null || var52.field963 >= var53.field1034.length || var53.field1034[var52.field963] != var52);
            class110.method684(var51, false);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method1839(int arg0) {
        field4256 = null;
        if (arg0 != 29326) {
            field4251 = null;
        }
        field4251 = null;
        field4258 = null;
        field4257 = null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
    public static final void method1840(byte arg0) {
        field4253++;
        if (class114.field1571) {
            return;
        }
        class200.field2855 = true;
        if (class254.field3666) {
            class274.field4085 = (float) ((int) class274.field4085 + 191 & 0xFFFFFF80);
        } else {
            class238.field3438 += (24.0F - class238.field3438) / 2.0F;
        }
        class114.field1571 = true;
        if (arg0 >= -55) {
            method1837(-121, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILri;ZII)V")
    public static final void method1841(int arg0, class267 arg1, boolean arg2, int arg3, int arg4) {
        field4245++;
        if (class112.field1496 >= 400) {
            return;
        }
        if (arg1.field3884 != null) {
            arg1 = arg1.method1707(-1);
        }
        if (arg1 == null || !arg1.field3846) {
            return;
        }
        if (!arg2) {
            method1838(false);
        }
        String var5 = arg1.field3886;
        if (arg1.field3882 != 0) {
            String var6 = class5.field67 == 1 ? class120.field1718 : class61.field724;
            var5 = var5 + class61.method379((byte) 111, class177.field2507.field3472, arg1.field3882) + " (" + var6 + arg1.field3882 + ")";
        }
        if (class196.field2790 == 1) {
            class176.method1143(4, arg4, (short) 18, arg0, class167.field2403, class107.field1444 + " -> <col=ffff00>" + var5, class26.field314, (long) arg3);
            class274.field4087++;
        } else if (class267.field3857) {
            class139 var7 = class227.field3201 == -1 ? null : class16.method99(class227.field3201, -31836);
            if ((class282.field4263 & 0x2) != 0) {
                if (var7 == null || arg1.method1713(var7.field2019, class227.field3201, false) != var7.field2019) {
                    class28.field334++;
                    class176.method1143(4, arg4, (short) 13, arg0, class268.field3916, class48.field560 + " -> <col=ffff00>" + var5, class133.field1945, (long) arg3);
                }
                return;
            }
        } else {
            class188.field2695++;
            String[] var8 = arg1.field3897;
            if (class149.field2171) {
                var8 = class103.method624(var8, (byte) 102);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class5.field67 != 0 || !var8[var9].equalsIgnoreCase(class180.field2554))) {
                        byte var10 = 0;
                        class224.field3155++;
                        if (var9 == 0) {
                            var10 = 21;
                        }
                        if (var9 == 1) {
                            var10 = 44;
                        }
                        int var11 = -1;
                        if (arg1.field3859 == var9) {
                            var11 = arg1.field3900;
                        }
                        if (arg1.field3878 == var9) {
                            var11 = arg1.field3903;
                        }
                        if (var9 == 2) {
                            var10 = 4;
                        }
                        if (var9 == 3) {
                            var10 = 48;
                        }
                        if (var9 == 4) {
                            var10 = 42;
                        }
                        class176.method1143(4, arg4, var10, arg0, var11, "<col=ffff00>" + var5, var8[var9], (long) arg3);
                    }
                }
            }
            if (class5.field67 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class180.field2554)) {
                        class84.field1154++;
                        short var13 = 0;
                        if (class177.field2507.field3472 < arg1.field3882) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 21;
                        }
                        if (var12 == 1) {
                            var14 = 44;
                        }
                        if (var12 == 2) {
                            var14 = 4;
                        }
                        if (var12 == 3) {
                            var14 = 48;
                        }
                        if (var12 == 4) {
                            var14 = 42;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class176.method1143(4, arg4, var14, arg0, arg1.field3854, "<col=ffff00>" + var5, var8[var12], (long) arg3);
                    }
                }
            }
            class176.method1143(4, arg4, (short) 1005, arg0, class263.field3816, "<col=ffff00>" + var5, class21.field251, (long) arg3);
        }
    }
}
