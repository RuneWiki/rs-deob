import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class137 extends class332 {

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Ldh;")
    public static class179 field1900 = new class179(4);

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Ljava/lang/String;")
    public static String field1916 = "Loading...";

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "[I")
    public static int[] field1918 = new int[1000];

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public int field1891;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public int field1893;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public int field1926;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "Lnk;")
    public class14 field1911;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Ldf;")
    public class174 field1903;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lgl;")
    public class203 field1895;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Lof;")
    public class253 field1912;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "Lbi;")
    public static class91 field1919;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 4)
    public static final void method910(int arg0) {
        if (arg0 < 10) {
            return;
        }
        for (int var1 = 0; var1 < class140.field1963; var1++) {
            class237 var2 = class221.method1519((byte) 108, var1);
            if (var2 != null && var2.field3477 == 0) {
                class121.field1698[var1] = 0;
                class226.field3235[var1] = 0;
            }
        }
        class187.field2697 = new class224(16);
        field1905++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 32)
    public static void method911(byte arg0) {
        field1918 = null;
        field1916 = null;
        field1919 = null;
        field1900 = null;
        if (arg0 != 10) {
            method914(-70, -41, -18, -23, -33, 64, -120, -115);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILge;Lge;ZB)I", line = 45)
    public static final int method912(int arg0, class163 arg1, class163 arg2, boolean arg3, byte arg4) {
        field1906++;
        if (arg0 == 1) {
            int var5 = arg1.field2678;
            int var6 = arg2.field2678;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return class26.method166(class172.field2484, 0, arg2.method1071(7).field946, arg1.method1071(7).field946);
        } else if (arg0 == 3) {
            if (arg1.field2248.equals("-")) {
                if (arg2.field2248.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field2248.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class26.method166(class172.field2484, 0, arg2.field2248, arg1.field2248);
            }
        } else if (arg0 == 4) {
            return arg1.method1283((byte) 73) ? (arg2.method1283((byte) 85) ? 0 : 1) : (arg2.method1283((byte) 41) ? -1 : 0);
        } else {
            int var7 = 105 / ((arg4 - 23) / 63);
            if (arg0 == 5) {
                return arg1.method1284(0) ? (arg2.method1284(0) ? 0 : 1) : (arg2.method1284(0) ? -1 : 0);
            } else if (arg0 == 6) {
                return arg1.method1290(-27585) ? (arg2.method1290(-27585) ? 0 : 1) : (arg2.method1290(-27585) ? -1 : 0);
            } else if (arg0 == 7) {
                return arg1.method1291(-101) ? (arg2.method1291(-95) ? 0 : 1) : (arg2.method1291(-86) ? -1 : 0);
            } else {
                return arg1.field2254 - arg2.field2254;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBIIII)V", line = 114)
    public static final void method913(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1907++;
        int var6 = class140.method930(24918, arg0, class248.field3759, class272.field4273);
        int var7 = class140.method930(24918, arg5, class248.field3759, class272.field4273);
        int var8 = class140.method930(24918, arg2, class56.field678, class109.field1494);
        int var9 = -27 / ((arg1 + 60) / 57);
        int var10 = class140.method930(24918, arg4, class56.field678, class109.field1494);
        for (int var11 = var6; var11 <= var7; var11++) {
            class279.method1997(var10, -824384948, var8, arg3, class206.field2886[var11]);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIII)V", line = 148)
    public static final void method914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1914++;
        int var8 = arg2;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg7 - arg5;
        int var12 = arg7 * arg7;
        int var13 = arg2 - arg5;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var13 * var13;
        int var17 = var14 << 1;
        int var18 = var15 << 1;
        int var19 = var12 << 1;
        int var20 = arg2 << 1;
        int var21 = (1 - var20) * var12 + var17;
        int var22 = var16 << 1;
        int var23 = var14 - ((var20 - 1) * var19);
        int var24 = var13 << 1;
        int var25 = (1 - var24) * var15 + var22;
        int var26 = var16 - ((var24 - 1) * var18);
        int var27 = var12 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var17 * 3;
        int var31 = var16 << 2;
        int var32 = (var20 - 3) * var19;
        int var33 = var22 * 3;
        int var34 = var28;
        int var35 = (arg2 + arg6) * var27;
        int var36 = (var24 - 3) * var18;
        int var37 = var31;
        int[] var38 = class206.field2886[arg1];
        int var39 = (var13 - 1) * var29;
        class279.method1997(arg0 - var11, arg6 ^ 0x31231DB3, arg0 - arg7, arg3, var38);
        class279.method1997(arg0 + var11, -824384948, arg0 - var11, arg4, var38);
        class279.method1997(arg0 + arg7, arg6 ^ 0x31231DB3, arg0 + var11, arg3, var38);
        while (var8 > 0) {
            if (var21 < 0) {
                while (var21 < 0) {
                    var23 += var34;
                    var21 += var30;
                    var30 += var28;
                    var9++;
                    var34 += var28;
                }
            }
            boolean var40 = var13 >= var8;
            var8--;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var25 += var33;
                        var33 += var31;
                        var26 += var37;
                        var37 += var31;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var37;
                    var37 += var31;
                    var25 += var33;
                    var33 += var31;
                }
                var26 += -var36;
                var25 += -var39;
                var39 -= var29;
                var36 -= var29;
            }
            int var41 = arg1 - var8;
            if (var23 < 0) {
                var21 += var30;
                var9++;
                var30 += var28;
                var23 += var34;
                var34 += var28;
            }
            var23 += -var32;
            int var42 = arg0 + var9;
            var21 += -var35;
            var35 -= var27;
            int var43 = arg0 - var9;
            int var44 = arg1 + var8;
            if (var40) {
                int var45 = arg0 + var10;
                int var46 = arg0 - var10;
                class279.method1997(var46, arg6 ^ 0x31231DB3, var43, arg3, class206.field2886[var41]);
                class279.method1997(var45, -824384948, var46, arg4, class206.field2886[var41]);
                class279.method1997(var42, -824384948, var45, arg3, class206.field2886[var41]);
                class279.method1997(var46, -824384948, var43, arg3, class206.field2886[var44]);
                class279.method1997(var45, -824384948, var46, arg4, class206.field2886[var44]);
                class279.method1997(var42, arg6 ^ 0x31231DB3, var45, arg3, class206.field2886[var44]);
            } else {
                class279.method1997(var42, arg6 - 824384947, var43, arg3, class206.field2886[var41]);
                class279.method1997(var42, -824384948, var43, arg3, class206.field2886[var44]);
            }
            var32 -= var27;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIILlc;Z)V", line = 313)
    public static final void method915(int arg0, int arg1, int arg2, int arg3, int arg4, class175 arg5, boolean arg6) {
        field1897++;
        class224.field3177 = arg6;
        class216.field3040 = arg0;
        class283.field4440 = arg5;
        class96.field1252 = arg4;
        class281.field4357 = arg1;
        class267.field4212 = arg2;
        class259.field3933 = arg3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIIII)V", line = 343)
    public static final void method916(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            field1900 = (class179) null;
        }
        for (class298 var5 = (class298) class68.field895.method2331((byte) 104); var5 != null; var5 = (class298) class68.field895.method2332(-93)) {
            class128.method857(arg0, arg4, var5, arg3, arg1, arg2);
        }
        field1923++;
        for (class298 var6 = (class298) class299.field4667.method2331((byte) 108); var6 != null; var6 = (class298) class299.field4667.method2332(-91)) {
            byte var7 = 1;
            class191 var8 = var6.field4656.method1102((byte) -45);
            if (var6.field4656.field2376 == var8.field2737) {
                var7 = 0;
            } else if (var6.field4656.field2376 == var8.field2728 || var6.field4656.field2376 == var8.field2757 || var6.field4656.field2376 == var8.field2721 || var6.field4656.field2376 == var8.field2732) {
                var7 = 2;
            } else if (var6.field4656.field2376 == var8.field2739 || var6.field4656.field2376 == var8.field2742 || var6.field4656.field2376 == var8.field2722 || var6.field4656.field2376 == var8.field2738) {
                var7 = 3;
            }
            if (var6.field4654 != var7) {
                int var9 = class142.method945(var6.field4656, false);
                if (var6.field4643 != var9) {
                    if (var6.field4650 != null) {
                        class19.field255.method27(var6.field4650);
                        var6.field4650 = null;
                    }
                    var6.field4643 = var9;
                }
                var6.field4654 = var7;
            }
            var6.field4639 = var6.field4656.field2392;
            var6.field4640 = var6.field4656.field2392 + (var6.field4656.method748(false) * 64);
            var6.field4635 = var6.field4656.field2357;
            var6.field4651 = var6.field4656.field2357 + (var6.field4656.method748(false) * 64);
            class128.method857(arg0, arg4, var6, arg3, arg1, arg2);
        }
        for (class298 var10 = (class298) class120.field1695.method1540(-124); var10 != null; var10 = (class298) class120.field1695.method1544(-14)) {
            byte var11 = 1;
            class191 var12 = var10.field4636.method1102((byte) -65);
            if (var10.field4636.field2376 == var12.field2737) {
                var11 = 0;
            } else if (var10.field4636.field2376 == var12.field2728 || var10.field4636.field2376 == var12.field2757 || var10.field4636.field2376 == var12.field2721 || var10.field4636.field2376 == var12.field2732) {
                var11 = 2;
            } else if (var10.field4636.field2376 == var12.field2739 || var10.field4636.field2376 == var12.field2742 || var10.field4636.field2376 == var12.field2722 || var10.field4636.field2376 == var12.field2738) {
                var11 = 3;
            }
            if (var10.field4654 != var11) {
                int var13 = class224.method1547((byte) 117, var10.field4636);
                if (var10.field4643 != var13) {
                    if (var10.field4650 != null) {
                        class19.field255.method27(var10.field4650);
                        var10.field4650 = null;
                    }
                    var10.field4643 = var13;
                }
                var10.field4654 = var11;
            }
            var10.field4639 = var10.field4636.field2392;
            var10.field4640 = var10.field4636.field2392 + (var10.field4636.method748(false) * 64);
            var10.field4635 = var10.field4636.field2357;
            var10.field4651 = var10.field4636.field2357 + (var10.field4636.method748(false) * 64);
            class128.method857(true, arg4, var10, arg3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V", line = 460)
    public static final void method917(boolean arg0) {
        field1904++;
        if (class44.field527 == 0) {
            return;
        }
        try {
            if (++class331.field5061 > 1500) {
                if (class236.field3463 != null) {
                    class236.field3463.method1096((byte) 103);
                    class236.field3463 = null;
                }
                if (class334.field5158 >= 1) {
                    class44.field527 = 0;
                    class255.field3876 = -5;
                    return;
                }
                class44.field527 = 1;
                if (class298.field4647 == class230.field3364) {
                    class230.field3364 = class320.field4911;
                } else {
                    class230.field3364 = class298.field4647;
                }
                class331.field5061 = 0;
                class334.field5158++;
            }
            if (class44.field527 == 1) {
                class163.field2259 = class9.field131.method1915(class311.field4823, class230.field3364, arg0);
                class44.field527 = 2;
            }
            if (class44.field527 == 2) {
                if (class163.field2259.field238 == 2) {
                    throw new IOException();
                }
                if (class163.field2259.field238 != 1) {
                    return;
                }
                class236.field3463 = new class167((Socket) class163.field2259.field241, class9.field131);
                class163.field2259 = null;
                class236.field3463.method1097(class140.field1954.field1388, 0, true, class140.field1954.field1400);
                if (class170.field2380 != null) {
                    class170.field2380.method1717(-7234);
                }
                if (class224.field3186 != null) {
                    class224.field3186.method1717(-7234);
                }
                int var1 = class236.field3463.method1094((byte) 67);
                if (class170.field2380 != null) {
                    class170.field2380.method1717(-7234);
                }
                if (class224.field3186 != null) {
                    class224.field3186.method1717(-7234);
                }
                if (var1 != 101) {
                    class255.field3876 = var1;
                    class44.field527 = 0;
                    class236.field3463.method1096((byte) 80);
                    class236.field3463 = null;
                    return;
                }
                class44.field527 = 3;
            }
            if (class44.field527 == 3) {
                if (class236.field3463.method1091((byte) 18) >= 2) {
                    int var2 = class236.field3463.method1094((byte) 67) << 8 | class236.field3463.method1094((byte) 67);
                    class295.method2092((byte) -69, var2);
                    if (class109.field1500 != -1) {
                        class44.field527 = 0;
                        class236.field3463.method1096((byte) 112);
                        class236.field3463 = null;
                        class68.method425((byte) 74);
                        return;
                    }
                    class255.field3876 = 6;
                    class44.field527 = 0;
                    class236.field3463.method1096((byte) 116);
                    class236.field3463 = null;
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class236.field3463 != null) {
                class236.field3463.method1096((byte) 94);
                class236.field3463 = null;
            }
            if (class334.field5158 < 1) {
                if (class298.field4647 == class230.field3364) {
                    class230.field3364 = class320.field4911;
                } else {
                    class230.field3364 = class298.field4647;
                }
                class334.field5158++;
                class44.field527 = 1;
                class331.field5061 = 0;
            } else {
                class255.field3876 = -4;
                class44.field527 = 0;
            }
        }
        if (arg0) {
            field1915 = 67;
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V", line = 630)
    public final void method918(int arg0) {
        this.field1895 = null;
        this.field1912 = null;
        this.field1911 = null;
        this.field1903 = null;
        field1901++;
        if (arg0 != 2047) {
            this.field1917 = -123;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLg;)V", line = 652)
    public static final void method919(boolean arg0, class170 arg1) {
        field1908++;
        if (arg0) {
            return;
        }
        class191 var2 = arg1.method1102((byte) -27);
        arg1.field2376 = var2.field2737;
        if (arg1.field2411 == 0) {
            arg1.field2419 = 0;
            return;
        }
        if (arg1.field2435 != -1 && arg1.field2365 == 0) {
            class247 var3 = class185.method1289(arg1.field2435, (byte) 107);
            if (arg1.field2450 > 0 && var3.field3752 == 0) {
                arg1.field2419++;
                return;
            }
            if (arg1.field2450 <= 0 && var3.field3747 == 0) {
                arg1.field2419++;
                return;
            }
        }
        if (arg1.field2372 != -1 && class38.field463 >= arg1.field2396) {
            class159 var4 = class120.method818((byte) 96, arg1.field2372);
            if (var4.field2196 && var4.field2205 != -1) {
                class247 var5 = class185.method1289(var4.field2205, (byte) 122);
                if (arg1.field2450 > 0 && var5.field3752 == 0) {
                    arg1.field2419++;
                    return;
                }
                if (arg1.field2450 <= 0 && var5.field3747 == 0) {
                    arg1.field2419++;
                    return;
                }
            }
        }
        int var6 = arg1.field2392;
        int var7 = arg1.field2357;
        int var8 = arg1.field2359[arg1.field2411 - 1] * 128 + arg1.method748(arg0) * 64;
        int var9 = arg1.field2403[arg1.field2411 - 1] * 128 + (arg1.method748(false) * 64);
        if ((var8 - var6) > 256 || (var8 - var6) < -256 || var9 - var7 > 256 || (var9 - var7) < -256) {
            arg1.field2392 = var8;
            arg1.field2357 = var9;
            return;
        }
        if (var6 < var8) {
            if (var9 > var7) {
                arg1.field2387 = 1280;
            } else if (var7 > var9) {
                arg1.field2387 = 1792;
            } else {
                arg1.field2387 = 1536;
            }
        } else if (var6 > var8) {
            if (var9 > var7) {
                arg1.field2387 = 768;
            } else if (var9 < var7) {
                arg1.field2387 = 256;
            } else {
                arg1.field2387 = 512;
            }
        } else if (var9 > var7) {
            arg1.field2387 = 1024;
        } else if (var7 > var9) {
            arg1.field2387 = 0;
        }
        int var10 = 4;
        int var11 = var2.field2759;
        int var12 = arg1.field2387 - arg1.field2368 & 0x7FF;
        boolean var13 = true;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 >= -256 && var12 <= 256) {
            var11 = var2.field2758;
        } else if (var12 >= 256 && var12 < 768) {
            var11 = var2.field2733;
        } else if (var12 >= -768 && var12 <= -256) {
            var11 = var2.field2731;
        }
        byte var14 = 1;
        if (var11 == -1) {
            var11 = var2.field2758;
        }
        arg1.field2376 = var11;
        if (arg1 instanceof class184) {
            var13 = ((class184) arg1).field2657.field4375;
        }
        if (var13) {
            if (arg1.field2387 != arg1.field2368 && arg1.field2444 == -1 && arg1.field2360 != 0) {
                var10 = 2;
            }
            if (arg1.field2411 > 2) {
                var10 = 6;
            }
            if (arg1.field2411 > 3) {
                var10 = 8;
            }
            if (arg1.field2419 > 0 && arg1.field2411 > 1) {
                arg1.field2419--;
                var10 = 8;
            }
        } else {
            if (arg1.field2411 > 1) {
                var10 = 6;
            }
            if (arg1.field2411 > 2) {
                var10 = 8;
            }
            if (arg1.field2419 > 0 && arg1.field2411 > 1) {
                arg1.field2419--;
                var10 = 8;
            }
        }
        if (arg1.field2406[arg1.field2411 - 1] == 2) {
            var10 <<= 0x1;
            var14 = 2;
        } else if (arg1.field2406[arg1.field2411 - 1] == 0) {
            var10 >>= 0x1;
            var14 = 0;
        }
        if (var10 < 8 || var2.field2728 == -1) {
            if (var2.field2739 != -1 && var14 == 0) {
                if (arg1.field2376 == var2.field2759 && var2.field2742 != -1) {
                    arg1.field2376 = var2.field2742;
                } else if (arg1.field2376 == var2.field2731 && var2.field2738 != -1) {
                    arg1.field2376 = var2.field2738;
                } else if (arg1.field2376 == var2.field2733 && var2.field2722 != -1) {
                    arg1.field2376 = var2.field2722;
                } else {
                    arg1.field2376 = var2.field2739;
                }
            }
        } else if (arg1.field2376 == var2.field2759 && var2.field2757 != -1) {
            arg1.field2376 = var2.field2757;
        } else if (arg1.field2376 == var2.field2731 && var2.field2732 != -1) {
            arg1.field2376 = var2.field2732;
        } else if (arg1.field2376 == var2.field2733 && var2.field2721 != -1) {
            arg1.field2376 = var2.field2721;
        } else {
            arg1.field2376 = var2.field2728;
        }
        if (var2.field2752 != -1) {
            int var15 = var10 << 7;
            if (arg1.field2411 == 1) {
                int var16 = arg1.field2358 * arg1.field2358;
                int var17 = (var9 >= arg1.field2357 ? var9 - arg1.field2357 : arg1.field2357 - var9) << 7;
                int var18 = (arg1.field2392 > var8 ? arg1.field2392 - var8 : var8 - arg1.field2392) << 7;
                int var19 = var18 <= var17 ? var17 : var18;
                int var20 = var2.field2752 * 2 * var19;
                if (var16 > var20) {
                    arg1.field2358 /= 2;
                } else if (var19 < var16 / 2) {
                    arg1.field2358 -= var2.field2752;
                    if (arg1.field2358 < 0) {
                        arg1.field2358 = 0;
                    }
                } else if (var15 > arg1.field2358) {
                    arg1.field2358 += var2.field2752;
                    if (arg1.field2358 > var15) {
                        arg1.field2358 = var15;
                    }
                }
            } else if (var15 > arg1.field2358) {
                arg1.field2358 += var2.field2752;
                if (arg1.field2358 > var15) {
                    arg1.field2358 = var15;
                }
            } else if (arg1.field2358 > 0) {
                arg1.field2358 -= var2.field2752;
                if (arg1.field2358 < 0) {
                    arg1.field2358 = 0;
                }
            }
            var10 = arg1.field2358 >> 7;
            if (var10 < 1) {
                var10 = 1;
            }
        }
        if (var7 < var9) {
            arg1.field2357 += var10;
            if (var9 < arg1.field2357) {
                arg1.field2357 = var9;
            }
        } else if (var9 < var7) {
            arg1.field2357 -= var10;
            if (arg1.field2357 < var9) {
                arg1.field2357 = var9;
            }
        }
        if (var8 > var6) {
            arg1.field2392 += var10;
            if (var8 < arg1.field2392) {
                arg1.field2392 = var8;
            }
        } else if (var8 < var6) {
            arg1.field2392 -= var10;
            if (var8 > arg1.field2392) {
                arg1.field2392 = var8;
            }
        }
        if (arg1.field2392 == var8 && arg1.field2357 == var9) {
            if (arg1.field2450 > 0) {
                arg1.field2450--;
            }
            arg1.field2411--;
        }
    }
}
