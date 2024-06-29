import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class137 extends class155 {

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "Ljava/lang/String;")
    private String field2223 = "null";

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "C")
    public char field2221;

    @OriginalMember(owner = "client!ng", name = "W", descriptor = "C")
    public char field2239;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    private int field2231;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ng", name = "X", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "Lrb;")
    private class143 field2232;

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "Lrb;")
    public class143 field2238;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1027(String arg0, int arg1) {
        field2222++;
        if (this.field2238 == null) {
            return false;
        }
        if (this.field2232 == null) {
            this.method1033(0);
        }
        if (arg1 > 0) {
            return false;
        }
        for (class26 var3 = (class26) this.field2232.method1073(-1, class290.method1975(arg0, 106)); var3 != null; var3 = (class26) this.field2232.method1070((byte) 103)) {
            if (var3.field288.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILhc;I)V")
    private final void method1028(int arg0, class53 arg1, int arg2) {
        field2224++;
        if (arg2 > -11) {
            this.method1031(false);
        }
        if (arg0 == 1) {
            this.field2221 = class52.method320(1, arg1.method335((byte) 26));
        } else if (arg0 == 2) {
            this.field2239 = class52.method320(1, arg1.method335((byte) 26));
        } else if (arg0 == 3) {
            this.field2223 = arg1.method326(110);
        } else if (arg0 == 4) {
            this.field2231 = arg1.method340(-82);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method331(-9);
            this.field2238 = new class143(class172.method1224(var4, -45054224));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method340(-100);
                class259 var7;
                if (arg0 == 5) {
                    var7 = new class51(arg1.method326(68));
                } else {
                    var7 = new class108(arg1.method340(-101));
                }
                this.field2238.method1074((byte) 39, var7, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method1029(int arg0, byte arg1) {
        field2237++;
        if (arg1 != 1) {
            return null;
        } else if (this.field2238 == null) {
            return this.field2223;
        } else {
            class51 var3 = (class51) this.field2238.method1073(-1, (long) arg0);
            return var3 == null ? this.field2223 : var3.field704;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)I")
    public final int method1030(boolean arg0, int arg1) {
        if (arg0) {
            this.field2239 = (char) 65478;
        }
        field2235++;
        if (this.field2238 == null) {
            return this.field2231;
        } else {
            class108 var3 = (class108) this.field2238.method1073(-1, (long) arg1);
            return var3 == null ? this.field2231 : var3.field1828;
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(Z)V")
    private final void method1031(boolean arg0) {
        field2236++;
        this.field2232 = new class143(this.field2238.method1068(5));
        for (class108 var2 = (class108) this.field2238.method1071(-128); var2 != null; var2 = (class108) this.field2238.method1069(-123)) {
            class108 var3 = new class108((int) var2.field4008);
            this.field2232.method1074((byte) 39, var3, (long) var2.field1828);
        }
        if (arg0) {
            method1037((byte) -58);
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
    public static final void method1032(int arg0) {
        class283.field4559 = null;
        class32.field399 = null;
        class53.field748 = null;
        class280.field4506 = null;
        class165.field2534 = null;
        class297.field4765 = null;
        if (arg0 >= -94) {
            method1035(15, 50, 107, -106, 48, -101, 71);
        }
        field2234++;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V")
    private final void method1033(int arg0) {
        this.field2232 = new class143(this.field2238.method1068(5));
        field2240++;
        if (arg0 != 0) {
            method1039(-122, -107, -5, -83, -34, -79, 121, -4);
        }
        for (class51 var2 = (class51) this.field2238.method1071(-126); var2 != null; var2 = (class51) this.field2238.method1069(-123)) {
            class26 var3 = new class26(var2.field704, (int) var2.field4008);
            this.field2232.method1074((byte) 39, var3, class290.method1975(var2.field704, -121));
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(BI)I")
    public static final int method1034(byte arg0, int arg1) {
        class268 var2 = class288.method1970((byte) -43, arg1);
        int var3 = var2.field4299;
        int var4 = var2.field4307;
        if (arg0 != -17) {
            method1037((byte) -24);
        }
        int var5 = var2.field4306;
        field2241++;
        int var6 = class172.field2606[var4 - var3];
        return var6 & class303.field4900[var5] >> var3;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class247.method1701(arg5, 1000);
        field2233++;
        int var7 = 0;
        int var8 = arg5 - arg6;
        int var9 = arg5;
        int var10 = -arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = arg1;
        int var14 = -1;
        int var15 = arg2 - var8;
        int var16 = arg2 + var8;
        int[] var17 = class104.field1795[arg4];
        class89.method669(var17, arg3, var15, arg2 - arg5, (byte) -125);
        class89.method669(var17, arg0, var16, var15, (byte) -127);
        class89.method669(var17, arg3, arg2 + arg5, var16, (byte) -126);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var14;
            var12 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class114.field1887[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 >= var8) {
                    int[] var18 = class104.field1795[arg4 + var9];
                    int var19 = arg2 + var7;
                    int[] var20 = class104.field1795[arg4 - var9];
                    int var21 = arg2 - var7;
                    class89.method669(var18, arg3, var19, var21, (byte) -123);
                    class89.method669(var20, arg3, var19, var21, (byte) -124);
                } else {
                    int[] var22 = class104.field1795[arg4 + var9];
                    int[] var23 = class104.field1795[arg4 - var9];
                    int var24 = arg2 + var7;
                    int var25 = class114.field1887[var9];
                    int var26 = arg2 - var7;
                    int var27 = arg2 + var25;
                    int var28 = arg2 - var25;
                    class89.method669(var22, arg3, var28, var26, (byte) -125);
                    class89.method669(var22, arg0, var27, var28, (byte) -126);
                    class89.method669(var22, arg3, var24, var27, (byte) -126);
                    class89.method669(var23, arg3, var28, var26, (byte) -125);
                    class89.method669(var23, arg0, var27, var28, (byte) -127);
                    class89.method669(var23, arg3, var24, var27, (byte) -123);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class104.field1795[arg4 - var7];
            int[] var30 = class104.field1795[arg4 + var7];
            int var31 = arg2 - var9;
            int var32 = arg2 + var9;
            if (var7 < var8) {
                int var33 = var7 <= var11 ? var11 : class114.field1887[var7];
                int var34 = arg2 - var33;
                class89.method669(var30, arg3, var34, var31, (byte) -123);
                int var35 = arg2 + var33;
                class89.method669(var30, arg0, var35, var34, (byte) -128);
                class89.method669(var30, arg3, var32, var35, (byte) -128);
                class89.method669(var29, arg3, var34, var31, (byte) -128);
                class89.method669(var29, arg0, var35, var34, (byte) -127);
                class89.method669(var29, arg3, var32, var35, (byte) -128);
            } else {
                class89.method669(var30, arg3, var32, var31, (byte) -125);
                class89.method669(var29, arg3, var32, var31, (byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Z")
    public final boolean method1036(int arg0, int arg1) {
        field2225++;
        if (this.field2238 == null) {
            return false;
        }
        if (this.field2232 == null) {
            this.method1031(false);
        }
        class108 var3 = (class108) this.field2232.method1073(-1, (long) arg0);
        if (arg1 >= -65) {
            return false;
        } else {
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
    public static final void method1037(byte arg0) {
        if (class267.field4272 > 0) {
            class267.field4272--;
        }
        if (class283.field4556 > 1) {
            class298.field4774 = class248.field3705;
            class283.field4556--;
        }
        field2229++;
        if (class194.field2858) {
            class194.field2858 = false;
            class6.method35(-109);
            return;
        }
        for (int var1 = 0; var1 < 100 && class205.method1454(0); var1++) {
        }
        if (class98.field1677 != 30) {
            return;
        }
        class186.method1332(true, 78, class144.field2338);
        Object var2 = class84.field1330.field1220;
        synchronized (class84.field1330.field1220) {
            if (!class196.field2888) {
                class84.field1330.field1228 = 0;
            } else if (class56.field818 != 0 || class84.field1330.field1228 >= 40) {
                class144.field2338.method683(true, 199);
                class280.field4517++;
                class144.field2338.method360(0, 25759);
                int var3 = class144.field2338.field735;
                int var4 = 0;
                for (int var5 = 0; class84.field1330.field1228 > var5 && (class144.field2338.field735 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class84.field1330.field1227[var5];
                    int var7 = class84.field1330.field1226[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class84.field1330.field1227[var5] == -1 && class84.field1330.field1226[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = true;
                    }
                    if (class158.field2464 != var7 || class39.field508 != var6) {
                        int var9 = var7 - class158.field2464;
                        int var10 = var6 - class39.field508;
                        class158.field2464 = var7;
                        class39.field508 = var6;
                        if (class281.field4528 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class144.field2338.method376((var9 << 6) + (class281.field4528 << 12) + var10, false);
                            class281.field4528 = 0;
                        } else if (class281.field4528 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            class144.field2338.method360(class281.field4528 + 128, 25759);
                            var9 += 128;
                            class144.field2338.method376((var9 << 8) + var10, false);
                            class281.field4528 = 0;
                        } else if (class281.field4528 < 32) {
                            class144.field2338.method360(class281.field4528 + 192, 25759);
                            if (var8) {
                                class144.field2338.method385(Integer.MIN_VALUE, 455748840);
                            } else {
                                class144.field2338.method385(var7 | var6 << 16, 455748840);
                            }
                            class281.field4528 = 0;
                        } else {
                            class144.field2338.method376(class281.field4528 + 57344, false);
                            if (var8) {
                                class144.field2338.method385(Integer.MIN_VALUE, 455748840);
                            } else {
                                class144.field2338.method385(var7 | var6 << 16, 455748840);
                            }
                            class281.field4528 = 0;
                        }
                    } else if (class281.field4528 < 2047) {
                        class281.field4528++;
                    }
                }
                class144.field2338.method355(class144.field2338.field735 - var3, 106);
                if (class84.field1330.field1228 <= var4) {
                    class84.field1330.field1228 = 0;
                } else {
                    class84.field1330.field1228 -= var4;
                    for (int var11 = 0; var11 < class84.field1330.field1228; var11++) {
                        class84.field1330.field1226[var11] = class84.field1330.field1226[var4 + var11];
                        class84.field1330.field1227[var11] = class84.field1330.field1227[var4 + var11];
                    }
                }
            }
        }
        if (class56.field818 != 0) {
            class171.field2586++;
            int var12 = class17.field187;
            long var13 = (class111.field1853 - class128.field2150) / 50L;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 65535) {
                var12 = 65535;
            }
            int var15 = class13.field153;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var17 = (int) var13;
            if (class56.field818 == 2) {
                var16 = 1;
            }
            class128.field2150 = class111.field1853;
            class144.field2338.method683(true, 200);
            class144.field2338.method348(var12 | var15 << 16, (byte) -93);
            class144.field2338.method365(var17 | var16 << 15, (byte) 59);
        }
        if (class62.field943 > 0) {
            class62.field943--;
        }
        if (class180.field2709 && class62.field943 <= 0) {
            class180.field2709 = false;
            class32.field397++;
            class62.field943 = 20;
            class144.field2338.method683(true, 140);
            class144.field2338.method328((int) class180.field2705, (byte) 109);
            class144.field2338.method358(8117, (int) class102.field1736);
        }
        if (class296.field4757 && !class253.field3825) {
            class253.field3825 = true;
            class237.field3465++;
            class144.field2338.method683(true, 248);
            class144.field2338.method360(1, 25759);
        }
        if (!class296.field4757 && class253.field3825) {
            class237.field3465++;
            class253.field3825 = false;
            class144.field2338.method683(true, 248);
            class144.field2338.method360(0, 25759);
        }
        if (!class145.field2344) {
            class78.field1258++;
            class144.field2338.method683(true, 120);
            class144.field2338.method385(class234.method1619((byte) -82), 455748840);
            class145.field2344 = true;
        }
        if (class255.field3851) {
            class255.field3851 = false;
        } else {
            class270.field4376 /= 2.0F;
        }
        if (class171.field2581) {
            class171.field2581 = false;
        } else {
            class280.field4521 /= 2.0F;
        }
        class230.method1601(15185);
        if (class98.field1677 != 30) {
            return;
        }
        class192.method1361(false);
        class275.method1916((byte) 127);
        class166.method1187((byte) -128);
        if (arg0 <= 97) {
            method1037((byte) 87);
        }
        class243.field3574++;
        if (class243.field3574 > 750) {
            class6.method35(-127);
            return;
        }
        class162.method1173((byte) -64);
        class71.method536((byte) 89);
        class41.method254(107);
        for (int var18 = class17.method122(true, (byte) 117); var18 != -1; var18 = class17.method122(false, (byte) 116)) {
            class276.method1918(var18, (byte) -72);
            class301.field4881[class301.method2056(31, class188.field2795++)] = var18;
        }
        for (class279 var19 = class9.method54(0); var19 != null; var19 = class9.method54(0)) {
            int var20 = var19.method1936((byte) -60);
            int var21 = var19.method1932((byte) 91);
            if (var20 == 1) {
                class128.field2143[var21] = var19.field4505;
                class232.field3404[class301.method2056(31, class53.field796++)] = var21;
            } else if (var20 == 2) {
                class303.field4906[var21] = var19.field4491;
                class52.field713[class301.method2056(31, class72.field1137++)] = var21;
            } else if (var20 == 3) {
                class263 var42 = class144.method1078(var21, 8534);
                if (!var19.field4491.equals(var42.field4061)) {
                    var42.field4061 = var19.field4491;
                    class63.method476(var42, 14105);
                }
            } else if (var20 == 4) {
                class263 var38 = class144.method1078(var21, 8534);
                int var39 = var19.field4505;
                int var40 = var19.field4489;
                int var41 = var19.field4488;
                if (var38.field4158 != var39 || var38.field4060 != var40 || var38.field4186 != var41) {
                    var38.field4158 = var39;
                    var38.field4060 = var40;
                    var38.field4186 = var41;
                    class63.method476(var38, 14105);
                }
            } else if (var20 == 5) {
                class263 var22 = class144.method1078(var21, 8534);
                if (var19.field4505 != var22.field4122 || var19.field4505 == -1) {
                    var22.field4122 = var19.field4505;
                    var22.field4130 = 0;
                    var22.field4156 = 1;
                    var22.field4076 = 0;
                    class63.method476(var22, 14105);
                }
            } else if (var20 == 6) {
                int var32 = var19.field4505;
                int var33 = (var32 & 0x7F54) >> 10;
                int var34 = var32 >> 5 & 0x1F;
                class263 var35 = class144.method1078(var21, 8534);
                int var36 = var32 & 0x1F;
                int var37 = (var34 << 11) + (var33 << 19) + (var36 << 3);
                if (var35.field4114 != var37) {
                    var35.field4114 = var37;
                    class63.method476(var35, 14105);
                }
            } else if (var20 == 7) {
                class263 var23 = class144.method1078(var21, 8534);
                boolean var24 = var19.field4505 == 1;
                if (var24 != var23.field4178) {
                    var23.field4178 = var24;
                    class63.method476(var23, 14105);
                }
            } else if (var20 == 8) {
                class263 var25 = class144.method1078(var21, 8534);
                if (var19.field4505 != var25.field4211 || var19.field4489 != var25.field4071 || var19.field4488 != var25.field4217) {
                    var25.field4217 = var19.field4488;
                    var25.field4211 = var19.field4505;
                    var25.field4071 = var19.field4489;
                    if (var25.field4218 != -1) {
                        if (var25.field4210 > 0) {
                            var25.field4217 = var25.field4217 * 32 / var25.field4210;
                        } else if (var25.field4163 > 0) {
                            var25.field4217 = var25.field4217 * 32 / var25.field4163;
                        }
                    }
                    class63.method476(var25, 14105);
                }
            } else if (var20 == 9) {
                class263 var31 = class144.method1078(var21, 8534);
                if (var19.field4505 != var31.field4218 || var19.field4489 != var31.field4059) {
                    var31.field4059 = var19.field4489;
                    var31.field4218 = var19.field4505;
                    class63.method476(var31, 14105);
                }
            } else if (var20 == 10) {
                class263 var30 = class144.method1078(var21, 8534);
                if (var19.field4505 != var30.field4043 || var19.field4489 != var30.field4069 || var19.field4488 != var30.field4219) {
                    var30.field4043 = var19.field4505;
                    var30.field4069 = var19.field4489;
                    var30.field4219 = var19.field4488;
                    class63.method476(var30, 14105);
                }
            } else if (var20 == 11) {
                class263 var29 = class144.method1078(var21, 8534);
                var29.field4149 = 0;
                var29.field4140 = var29.field4164 = var19.field4489;
                var29.field4193 = 0;
                var29.field4206 = var29.field4101 = var19.field4505;
                class63.method476(var29, 14105);
            } else if (var20 == 12) {
                class263 var27 = class144.method1078(var21, 8534);
                int var28 = var19.field4505;
                if (var27 != null && var27.field4129 == 0) {
                    if (var28 > (var27.field4207 - var27.field4046)) {
                        var28 = var27.field4207 - var27.field4046;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                    if (var27.field4160 != var28) {
                        var27.field4160 = var28;
                        class63.method476(var27, 14105);
                    }
                }
            } else if (var20 == 13) {
                class263 var26 = class144.method1078(var21, 8534);
                var26.field4166 = var19.field4505;
            }
        }
        class126.field2126++;
        if (class110.field1840 != 0) {
            class84.field1329 += 20;
            if (class84.field1329 >= 400) {
                class110.field1840 = 0;
            }
        }
        if (class155.field2415 != null) {
            class213.field3141++;
            if (class213.field3141 >= 15) {
                class63.method476(class155.field2415, 14105);
                class155.field2415 = null;
            }
        }
        if (class108.field1827 != null) {
            class63.method476(class108.field1827, 14105);
            class51.field710++;
            if ((class276.field4474 + 5) < class204.field3017 || class204.field3017 < class276.field4474 - 5 || (class241.field3540 + 5) < class44.field584 || class44.field584 < class241.field3540 - 5) {
                class218.field3190 = true;
            }
            if (class79.field1274 == 0) {
                if (class218.field3190 && class51.field710 >= 5) {
                    if (class48.field669 == class108.field1827 && class232.field3406 != class194.field2862) {
                        class22.field244++;
                        byte var43 = 0;
                        class263 var44 = class108.field1827;
                        if (class231.field3400 == 1 && var44.field4179 == 206) {
                            var43 = 1;
                        }
                        if (var44.field4132[class232.field3406] <= 0) {
                            var43 = 0;
                        }
                        if (client.method903(var44).method1727(-599347940)) {
                            int var45 = class194.field2862;
                            int var46 = class232.field3406;
                            var44.field4132[var46] = var44.field4132[var45];
                            var44.field4214[var46] = var44.field4214[var45];
                            var44.field4132[var45] = -1;
                            var44.field4214[var45] = 0;
                        } else if (var43 == 1) {
                            int var47 = class194.field2862;
                            int var48 = class232.field3406;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var44.method1800(9782, var47 - 1, var47);
                                    var47--;
                                } else if (var47 < var48) {
                                    var44.method1800(9782, var47 + 1, var47);
                                    var47++;
                                }
                            }
                        } else {
                            var44.method1800(9782, class232.field3406, class194.field2862);
                        }
                        class144.field2338.method683(true, 6);
                        class144.field2338.method358(8117, class232.field3406);
                        class144.field2338.method369((byte) -119, var43);
                        class144.field2338.method341(-125, class108.field1827.field4083);
                        class144.field2338.method328(class194.field2862, (byte) 113);
                    }
                } else if ((class38.field488 == 1 || class219.method1526(class147.field2360 - 1, -1)) && class147.field2360 > 2) {
                    class227.method1573(15);
                } else if (class147.field2360 > 0) {
                    class107.method824((byte) -128);
                }
                class213.field3141 = 10;
                class56.field818 = 0;
                class108.field1827 = null;
            }
        }
        class197.field2894 = false;
        class286.field4590 = null;
        class263 var49 = class207.field3041;
        class210.field3102 = false;
        class263 var50 = class113.field1875;
        class207.field3041 = null;
        class47.field657 = 0;
        class113.field1875 = null;
        while (class304.method2067(-1456) && class47.field657 < 128) {
            class13.field155[class47.field657] = class292.field4642;
            class250.field3786[class47.field657] = class77.field1219;
            class47.field657++;
        }
        class73.field1141 = null;
        if (class1.field17 != -1) {
            class218.method1521(field2230, 0, 0, class1.field17, (byte) 124, 0, 0, class179.field2677);
        }
        class248.field3705++;
        if (class73.field1141 != null) {
            class281.method1945(true);
        }
        while (true) {
            class234 var51;
            class263 var52;
            class263 var53;
            do {
                var51 = (class234) class1.field11.method11(2);
                if (var51 == null) {
                    while (true) {
                        class234 var54;
                        class263 var55;
                        class263 var56;
                        do {
                            var54 = (class234) class133.field2183.method11(-125);
                            if (var54 == null) {
                                while (true) {
                                    class234 var57;
                                    class263 var58;
                                    class263 var59;
                                    do {
                                        var57 = (class234) class304.field4923.method11(87);
                                        if (var57 == null) {
                                            if (class73.field1141 == null) {
                                                class111.field1855 = 0;
                                            }
                                            if (class306.field4945 != null) {
                                                class66.method495(true);
                                            }
                                            if (class228.field3349 > 0 && class82.field1326[82] && class82.field1326[81] && class201.field2956 != 0) {
                                                int var60 = class37.field474 - class201.field2956;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class212.method1492(class213.field3139.field3686[0] + class149.field2390, var60, 16946, class213.field3139.field3761[0] + class163.field2520);
                                            }
                                            if (class228.field3349 > 0 && class82.field1326[82] && class82.field1326[81]) {
                                                if (class147.field2370 != -1) {
                                                    class212.method1492(class302.field4889 + class149.field2390, class37.field474, 16946, class163.field2520 + class147.field2370);
                                                }
                                                class293.field4669 = 0;
                                                class267.field4277 = 0;
                                            } else if (class267.field4277 == 2) {
                                                if (class147.field2370 != -1) {
                                                    class144.field2338.method683(true, 204);
                                                    class144.field2338.method365(class302.field4889 + class149.field2390, (byte) 59);
                                                    class38.field490++;
                                                    class144.field2338.method365(class309.field4981, (byte) 59);
                                                    class144.field2338.method341(113, class295.field4741);
                                                    class144.field2338.method328(class163.field2520 + class147.field2370, (byte) 90);
                                                    class110.field1840 = 1;
                                                    class11.field131 = class13.field153;
                                                    class151.field2393 = class17.field187;
                                                    class84.field1329 = 0;
                                                }
                                                class267.field4277 = 0;
                                            } else if (class293.field4669 == 2) {
                                                if (class147.field2370 != -1) {
                                                    class102.field1749++;
                                                    class144.field2338.method683(true, 85);
                                                    class144.field2338.method358(8117, class163.field2520 + class147.field2370);
                                                    class144.field2338.method328(class302.field4889 + class149.field2390, (byte) 125);
                                                    class11.field131 = class13.field153;
                                                    class84.field1329 = 0;
                                                    class110.field1840 = 1;
                                                    class151.field2393 = class17.field187;
                                                }
                                                class293.field4669 = 0;
                                            } else if (class147.field2370 != -1 && class267.field4277 == 0 && class293.field4669 == 0) {
                                                int var61 = (class147.field2370 << 1) - (class213.field3139.method1467(0) - 1) >> 1;
                                                int var62 = (class302.field4889 << 1) + 1 - class213.field3139.method1467(0) >> 1;
                                                class264.method1823(-23330, 0, var62, var61);
                                                class84.field1329 = 0;
                                                class151.field2393 = class17.field187;
                                                class11.field131 = class13.field153;
                                                class110.field1840 = 1;
                                                class52.method314(false, 0, class213.field3139.field3686[0], var61, 0, class213.field3139.field3761[0], 0, true, 0, var62, 0);
                                            }
                                            class147.field2370 = -1;
                                            class77.method576(-673);
                                            if (class207.field3041 != var49) {
                                                if (var49 != null) {
                                                    class63.method476(var49, 14105);
                                                }
                                                if (class207.field3041 != null) {
                                                    class63.method476(class207.field3041, 14105);
                                                }
                                            }
                                            if (class113.field1875 != var50 && class304.field4924 == class279.field4492) {
                                                if (var50 != null) {
                                                    class63.method476(var50, 14105);
                                                }
                                                if (class113.field1875 != null) {
                                                    class63.method476(class113.field1875, 14105);
                                                }
                                            }
                                            if (class113.field1875 == null) {
                                                if (class279.field4492 > 0) {
                                                    class279.field4492--;
                                                }
                                            } else if (class304.field4924 > class279.field4492) {
                                                class279.field4492++;
                                                if (class304.field4924 == class279.field4492) {
                                                    class63.method476(class113.field1875, 14105);
                                                }
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class37.field482[var63]++;
                                            }
                                            int var64 = class155.method1132((byte) -20);
                                            int var65 = class200.method1407(-1);
                                            if (var64 > 15000 && var65 > 15000) {
                                                class267.field4272 = 250;
                                                class213.field3140++;
                                                class162.method1172(14500, (byte) -128);
                                                class144.field2338.method683(true, 91);
                                            }
                                            if (class5.field48 != null && class5.field48.field936 == 1) {
                                                if (class5.field48.field932 != null) {
                                                    class218.method1520(class75.field1178, 16, class256.field3875);
                                                }
                                                class256.field3875 = false;
                                                class5.field48 = null;
                                                class75.field1178 = null;
                                            }
                                            class258.field4003++;
                                            class158.field2456++;
                                            if (class158.field2456 > 500) {
                                                class158.field2456 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class119.field1928 += class135.field2213;
                                                }
                                                if ((var66 & 0x4) == 4) {
                                                    class9.field98 += class308.field4963;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class107.field1826 += class25.field279;
                                                }
                                            }
                                            if (class107.field1826 < -50) {
                                                class25.field279 = 2;
                                            }
                                            if (class119.field1928 < -55) {
                                                class135.field2213 = 2;
                                            }
                                            class293.field4659++;
                                            if (class119.field1928 > 55) {
                                                class135.field2213 = -2;
                                            }
                                            if (class9.field98 < -40) {
                                                class308.field4963 = 1;
                                            }
                                            if (class9.field98 > 40) {
                                                class308.field4963 = -1;
                                            }
                                            if (class293.field4659 > 500) {
                                                class293.field4659 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x2) == 2) {
                                                    class131.field2168 += class39.field514;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class267.field4279 += class134.field2199;
                                                }
                                            }
                                            if (class107.field1826 > 50) {
                                                class25.field279 = -2;
                                            }
                                            if (class131.field2168 < -20) {
                                                class39.field514 = 1;
                                            }
                                            if (class131.field2168 > 10) {
                                                class39.field514 = -1;
                                            }
                                            if (class267.field4279 < -60) {
                                                class134.field2199 = 2;
                                            }
                                            if (class267.field4279 > 60) {
                                                class134.field2199 = -2;
                                            }
                                            if (class258.field4003 > 50) {
                                                class144.field2338.method683(true, 137);
                                                class293.field4650++;
                                            }
                                            if (class295.field4729) {
                                                class187.method1335(156);
                                                class295.field4729 = false;
                                            }
                                            try {
                                                if (class281.field4537 != null && class144.field2338.field735 > 0) {
                                                    class281.field4537.method1435(9, 0, class144.field2338.field758, class144.field2338.field735);
                                                    class144.field2338.field735 = 0;
                                                    class258.field4003 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var68) {
                                                class6.method35(-104);
                                                return;
                                            }
                                        }
                                        var58 = var57.field3423;
                                        if (var58.field4145 < 0) {
                                            break;
                                        }
                                        var59 = class144.method1078(var58.field4202, 8534);
                                    } while (var59 == null || var59.field4143 == null || var59.field4143.length <= var58.field4145 || var59.field4143[var58.field4145] != var58);
                                    class224.method1557((byte) 85, var57);
                                }
                            }
                            var55 = var54.field3423;
                            if (var55.field4145 < 0) {
                                break;
                            }
                            var56 = class144.method1078(var55.field4202, 8534);
                        } while (var56 == null || var56.field4143 == null || var56.field4143.length <= var55.field4145 || var56.field4143[var55.field4145] != var55);
                        class224.method1557((byte) 107, var54);
                    }
                }
                var52 = var51.field3423;
                if (var52.field4145 < 0) {
                    break;
                }
                var53 = class144.method1078(var52.field4202, 8534);
            } while (var53 == null || var53.field4143 == null || var53.field4143.length <= var52.field4145 || var53.field4143[var52.field4145] != var52);
            class224.method1557((byte) 86, var51);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(ILhc;)V")
    public final void method1038(int arg0, class53 arg1) {
        if (arg0 != -12916) {
            method1039(30, 61, 76, 47, 91, 102, -114, 81);
        }
        field2227++;
        while (true) {
            int var3 = arg1.method366(-16505);
            if (var3 == 0) {
                return;
            }
            this.method1028(var3, arg1, -20);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2228++;
        int var8 = class289.method1972(class73.field1156, (byte) 122, arg6, class59.field859);
        int var9 = class289.method1972(class73.field1156, (byte) 122, arg4, class59.field859);
        int var10 = class289.method1972(class264.field4230, (byte) 122, arg1, class273.field4418);
        int var11 = class289.method1972(class264.field4230, (byte) 122, arg7, class273.field4418);
        int var12 = class289.method1972(class73.field1156, (byte) 122, arg0 + arg6, class59.field859);
        int var13 = class289.method1972(class73.field1156, (byte) 122, arg4 - arg0, class59.field859);
        for (int var14 = var8; var14 < var12; var14++) {
            class89.method669(class104.field1795[var14], arg5, var11, var10, (byte) -128);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class89.method669(class104.field1795[var15], arg5, var11, var10, (byte) -126);
        }
        int var16 = class289.method1972(class264.field4230, (byte) 122, arg0 + arg1, class273.field4418);
        int var17 = class289.method1972(class264.field4230, (byte) 122, arg7 - arg0, class273.field4418);
        int var18 = var12;
        if (arg3 != 11974) {
            return;
        }
        while (var13 >= var18) {
            int[] var19 = class104.field1795[var18];
            class89.method669(var19, arg5, var16, var10, (byte) -126);
            class89.method669(var19, arg2, var17, var16, (byte) -126);
            class89.method669(var19, arg5, var11, var17, (byte) -125);
            var18++;
        }
    }
}
