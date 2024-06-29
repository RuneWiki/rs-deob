import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 implements Runnable {

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Z")
    public boolean field54 = true;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Ljava/lang/Object;")
    private Object field48 = new Object();

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "[I")
    private int[] field56 = new int[500];

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "[I")
    private int[] field57 = new int[500];

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public int field58 = 0;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field43 = 0;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Z")
    public static boolean field46 = true;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "[I")
    public static int[] field53 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILfe;ILci;I)V")
    private static final void method17(int arg0, int arg1, int arg2, class231 arg3, int arg4, class189 arg5, int arg6) {
        field52++;
        if (arg5 == null) {
            return;
        }
        int var7 = (int) class144.field2145 + class146.field2173 & 0x7FF;
        int var8 = Math.max(arg3.field3730 / 2, arg3.field3686 / 2) + 10;
        int var9 = arg1 * arg1 + arg6 * arg6;
        if (var9 > (var8 * var8)) {
            return;
        }
        int var10 = class221.field3465[var7];
        int var11 = var10 * 256 / (class60.field876 + 256);
        int var12 = class221.field3468[var7];
        int var13 = var12 * 256 / (class60.field876 + 256);
        int var14 = -56 % ((arg4 - 27) / 55);
        int var15 = arg1 * var13 + arg6 * var11 >> 16;
        int var16 = arg1 * var11 - arg6 * var13 >> 16;
        ((class91) arg5).method619(arg3.field3730 / 2 + arg0 + var15 - arg5.field2951 / 2, arg3.field3686 / 2 + arg2 + -(arg5.field2945 / 2) + -var16, arg3.field3637, arg3.field3687);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILvl;)[Lci;")
    public static final class189[] method18(int arg0, int arg1, int arg2, class73 arg3) {
        field44++;
        if (arg2 != -4449) {
            method23(-94, -79, 92, 22, (byte) -119);
        }
        return class135.method862(arg0, arg1, (byte) 93, arg3) ? class206.method1422(arg2 + 4549) : null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)I")
    public static final int method19(byte arg0, int arg1) {
        int var2 = 82 / ((arg0 - 54) / 38);
        field49++;
        if (class270.field4405 != null) {
            class270.field4405.method567(0);
            class270.field4405 = null;
        }
        class105.field1536++;
        if (class105.field1536 > 4) {
            class105.field1536 = 0;
            class181.field2858 = 0;
            return arg1;
        }
        class181.field2858 = 0;
        if (class8.field108 == class57.field831) {
            class8.field108 = class6.field80;
        } else {
            class8.field108 = class57.field831;
        }
        return -1;
    }

    @OriginalMember(owner = "client!pd", name = "run", descriptor = "()V")
    public final void run() {
        field41++;
        while (this.field54) {
            Object var1 = this.field48;
            synchronized (this.field48) {
                if (this.field58 < 500) {
                    this.field57[this.field58] = class50.field633;
                    this.field56[this.field58] = class71.field1042;
                    this.field58++;
                }
            }
            class7.method43(-89, 50L);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
    public static final int method20(int arg0, int arg1) {
        field55++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + arg1;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILfe;IIII)V")
    public static final void method21(int arg0, int arg1, class231 arg2, int arg3, int arg4, int arg5, int arg6) {
        field45++;
        class152 var7 = class136.method863(arg6, arg5);
        if (var7 == null || !var7.field2238 || !var7.method1051(-8963)) {
            return;
        }
        if (var7.field2249 != null) {
            int[] var8 = new int[var7.field2249.length];
            for (int var9 = 0; var9 < (var8.length / 2); var9++) {
                int var11 = (int) class144.field2145 + class146.field2173 & 0x7FF;
                int var12 = class221.field3468[var11];
                int var13 = var12 * 256 / (class60.field876 + 256);
                int var14 = class221.field3465[var11];
                int var15 = var14 * 256 / (class60.field876 + 256);
                var8[var9 * 2] = ((var7.field2249[var9 * 2] * 4 + arg0) * var15 + (var7.field2249[var9 * 2 + 1] * 4 + arg1) * var13 >> 16) + arg2.field3730 / 2 + arg3;
                var8[var9 * 2 + 1] = arg2.field3686 / 2 + arg4 - ((arg1 - -(var7.field2249[var9 * 2 - -1] * 4)) * var15 + -((var7.field2249[var9 * 2] * 4 + arg0) * var13) >> 16);
            }
            class246.method1749(var8, var7.field2255, var7.field2255 >>> 24, arg2.field3637, arg2.field3687);
            for (int var10 = 0; var10 < (var8.length / 2 - 1); var10++) {
                class151.method1034(var8[var10 * 2], var8[var10 * 2 + 1], var8[var10 * 2 + 2], var8[var10 * 2 + 2 + 1], var7.field2258, var7.field2258 >>> 24, arg2.field3637, arg2.field3687);
            }
            class151.method1034(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field2258, var7.field2258 >>> 24, arg2.field3637, arg2.field3687);
        }
        class189 var16 = null;
        if (var7.field2241 != -1) {
            var16 = var7.method1052(-28744, false, false);
            if (var16 != null) {
                method17(arg3, arg1, arg4, arg2, 127, var16, arg0);
            }
        }
        if (var7.field2243 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.field2952;
        }
        class213 var18 = class178.field2788;
        if (var7.field2251 == 1) {
            var18 = class183.field2880;
        }
        if (var7.field2251 == 2) {
            var18 = class306.field4885;
        }
        class16.method96(var7.field2243, var18, arg0, arg5 ^ 0x2E, arg2, var17, arg3, arg4, arg1, var7.field2260);
        return;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static final void method22(int arg0) {
        field40++;
        if (class128.field1832 > 0) {
            class128.field1832--;
        }
        if (class205.field3200 > 1) {
            class165.field2550 = client.field3871;
            class205.field3200--;
        }
        if (class120.field1733) {
            class120.field1733 = false;
            class9.method50(-105);
            return;
        }
        for (int var1 = 0; var1 < 100 && class78.method532((byte) 91); var1++) {
        }
        if (class40.field480 != 30) {
            return;
        }
        class93.method632(175, 1, class150.field2218);
        Object var2 = class168.field2588.field48;
        synchronized (class168.field2588.field48) {
            if (!class245.field3997) {
                class168.field2588.field58 = 0;
            } else if (class235.field3796 != 0 || class168.field2588.field58 >= 40) {
                class153.field2283++;
                class150.field2218.method445(110, 7);
                int var3 = 0;
                class150.field2218.method1183(0, 984049208);
                int var4 = class150.field2218.field2676;
                for (int var5 = 0; class168.field2588.field58 > var5 && (class150.field2218.field2676 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class168.field2588.field56[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class168.field2588.field57[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class168.field2588.field56[var5] == -1 && class168.field2588.field57[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class297.field4741 != var7 || class61.field892 != var6) {
                        int var9 = var7 - class297.field4741;
                        int var10 = var6 - class61.field892;
                        class61.field892 = var6;
                        class297.field4741 = var7;
                        if (class140.field2012 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class150.field2218.method1180(-17437, (class140.field2012 << 12) + (var9 << 6) + var10);
                            class140.field2012 = 0;
                        } else if (class140.field2012 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class150.field2218.method1183(class140.field2012 + 128, 984049208);
                            var9 += 128;
                            var10 += 128;
                            class150.field2218.method1180(-17437, (var9 << 8) + var10);
                            class140.field2012 = 0;
                        } else if (class140.field2012 < 32) {
                            class150.field2218.method1183(class140.field2012 + 192, 984049208);
                            if (var8) {
                                class150.field2218.method1210(Integer.MIN_VALUE, (byte) -16);
                            } else {
                                class150.field2218.method1210(var6 << 16 | var7, (byte) -16);
                            }
                            class140.field2012 = 0;
                        } else {
                            class150.field2218.method1180(-17437, class140.field2012 + 57344);
                            if (var8) {
                                class150.field2218.method1210(Integer.MIN_VALUE, (byte) -16);
                            } else {
                                class150.field2218.method1210(var7 | var6 << 16, (byte) -16);
                            }
                            class140.field2012 = 0;
                        }
                    } else if (class140.field2012 < 2047) {
                        class140.field2012++;
                    }
                }
                class150.field2218.method1177(class150.field2218.field2676 - var4, 255);
                if (class168.field2588.field58 > var3) {
                    class168.field2588.field58 -= var3;
                    for (int var11 = 0; var11 < class168.field2588.field58; var11++) {
                        class168.field2588.field57[var11] = class168.field2588.field57[var3 + var11];
                        class168.field2588.field56[var11] = class168.field2588.field56[var3 + var11];
                    }
                } else {
                    class168.field2588.field58 = 0;
                }
            }
        }
        if (class235.field3796 != 0) {
            long var12 = (class86.field1305 - class4.field62) / 50L;
            int var14 = class223.field3493;
            class235.field3793++;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class171.field2686;
            class4.field62 = class86.field1305;
            byte var16 = 0;
            int var17 = (int) var12;
            if (class235.field3796 == 2) {
                var16 = 1;
            }
            class150.field2218.method445(194, 7);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            class150.field2218.method1213(var17 | var16 << 15, (byte) -90);
            class150.field2218.method1164(var14 << 16 | var15, 8825);
        }
        if (class16.field222 > 0) {
            class16.field222--;
        }
        if (class89.field1345 && class16.field222 <= 0) {
            class16.field222 = 20;
            class89.field1345 = false;
            class150.field2218.method445(190, 7);
            class260.field4223++;
            class150.field2218.method1207(true, (int) class144.field2145);
            class150.field2218.method1180(-17437, (int) class215.field3356);
        }
        if (class283.field4598 && !class232.field3758) {
            class100.field1495++;
            class232.field3758 = true;
            class150.field2218.method445(144, 7);
            class150.field2218.method1183(1, 984049208);
        }
        if (!class283.field4598 && class232.field3758) {
            class100.field1495++;
            class232.field3758 = false;
            class150.field2218.method445(144, 7);
            class150.field2218.method1183(0, 984049208);
        }
        if (!class52.field741) {
            class150.field2218.method445(88, 7);
            class150.field2218.method1164(class181.method1290(62288211), 8825);
            class67.field999++;
            class52.field741 = true;
        }
        if (class147.field2187) {
            class147.field2187 = false;
        } else {
            class233.field3768 /= 2.0F;
        }
        if (class266.field4316) {
            class266.field4316 = false;
        } else {
            class296.field4731 /= 2.0F;
        }
        class258.method1829(-22758);
        if (class40.field480 != 30) {
            return;
        }
        class233.method1643((byte) 32);
        class237.method1659((byte) -77);
        class68.method451(-1);
        class215.field3354++;
        if (class215.field3354 > 750) {
            class9.method50(-105);
            return;
        }
        class105.method702((byte) -65);
        class226.method1593(true);
        class105.method701(0);
        for (int var18 = class78.method534(false, true); var18 != -1; var18 = class78.method534(false, false)) {
            class61.method391(-7, var18);
            class200.field3158[class205.method1411(31, class158.field2369++)] = var18;
        }
        for (class181 var19 = class301.method2028(-111); var19 != null; var19 = class301.method2028(-21)) {
            int var20 = var19.method1291(172107424);
            int var21 = var19.method1282(377131010);
            if (var20 == 1) {
                class56.field814[var21] = var19.field2847;
                class215.field3367[class205.method1411(31, class117.field1695++)] = var21;
            } else if (var20 == 2) {
                class272.field4433[var21] = var19.field2850;
                class147.field2188[class205.method1411(class256.field4164++, 31)] = var21;
            } else if (var20 == 3) {
                class231 var22 = class201.method1398(var21, 0);
                if (!var19.field2850.equals(var22.field3571)) {
                    var22.field3571 = var19.field2850;
                    class247.method1761(var22, (byte) -106);
                }
            } else if (var20 == 4) {
                class231 var23 = class201.method1398(var21, 0);
                int var24 = var19.field2845;
                int var25 = var19.field2843;
                int var26 = var19.field2847;
                if (var23.field3675 != var26 || var23.field3609 != var24 || var23.field3672 != var25) {
                    var23.field3609 = var24;
                    var23.field3672 = var25;
                    var23.field3675 = var26;
                    class247.method1761(var23, (byte) -87);
                }
            } else if (var20 == 5) {
                class231 var27 = class201.method1398(var21, 0);
                if (var19.field2847 != var27.field3631 || var19.field2847 == -1) {
                    var27.field3669 = 0;
                    var27.field3647 = 1;
                    var27.field3659 = 0;
                    var27.field3631 = var19.field2847;
                    class247.method1761(var27, (byte) -95);
                }
            } else if (var20 == 6) {
                int var28 = var19.field2847;
                int var29 = (var28 & 0x3E0) >> 5;
                int var30 = var28 >> 10 & 0x1F;
                int var31 = var28 & 0x1F;
                class231 var32 = class201.method1398(var21, 0);
                int var33 = (var30 << 19) + (var31 << 3) + (var29 << 11);
                if (var32.field3583 != var33) {
                    var32.field3583 = var33;
                    class247.method1761(var32, (byte) -121);
                }
            } else if (var20 == 7) {
                class231 var34 = class201.method1398(var21, 0);
                boolean var35 = var19.field2847 == 1;
                if (var34.field3692 != var35) {
                    var34.field3692 = var35;
                    class247.method1761(var34, (byte) -89);
                }
            } else if (var20 == 8) {
                class231 var36 = class201.method1398(var21, 0);
                if (var19.field2847 != var36.field3651 || var19.field2845 != var36.field3695 || var19.field2843 != var36.field3727) {
                    var36.field3727 = var19.field2843;
                    if (var36.field3657 != -1) {
                        if (var36.field3597 > 0) {
                            var36.field3727 = var36.field3727 * 32 / var36.field3597;
                        } else if (var36.field3603 > 0) {
                            var36.field3727 = var36.field3727 * 32 / var36.field3603;
                        }
                    }
                    var36.field3651 = var19.field2847;
                    var36.field3695 = var19.field2845;
                    class247.method1761(var36, (byte) -94);
                }
            } else if (var20 == 9) {
                class231 var37 = class201.method1398(var21, 0);
                if (var19.field2847 != var37.field3657 || var19.field2845 != var37.field3645) {
                    var37.field3657 = var19.field2847;
                    var37.field3645 = var19.field2845;
                    class247.method1761(var37, (byte) -100);
                }
            } else if (var20 == 10) {
                class231 var42 = class201.method1398(var21, 0);
                if (var19.field2847 != var42.field3617 || var19.field2845 != var42.field3710 || var19.field2843 != var42.field3738) {
                    var42.field3738 = var19.field2843;
                    var42.field3617 = var19.field2847;
                    var42.field3710 = var19.field2845;
                    class247.method1761(var42, (byte) -124);
                }
            } else if (var20 == 11) {
                class231 var38 = class201.method1398(var21, 0);
                var38.field3579 = 0;
                var38.field3608 = var38.field3607 = var19.field2845;
                var38.field3644 = 0;
                var38.field3734 = var38.field3740 = var19.field2847;
                class247.method1761(var38, (byte) -92);
            } else if (var20 == 12) {
                class231 var39 = class201.method1398(var21, 0);
                int var40 = var19.field2847;
                if (var39 != null && var39.field3620 == 0) {
                    if (var40 > var39.field3648 - var39.field3686) {
                        var40 = var39.field3648 - var39.field3686;
                    }
                    if (var40 < 0) {
                        var40 = 0;
                    }
                    if (var39.field3661 != var40) {
                        var39.field3661 = var40;
                        class247.method1761(var39, (byte) -98);
                    }
                }
            } else if (var20 == 13) {
                class231 var41 = class201.method1398(var21, 0);
                var41.field3673 = var19.field2847;
            }
        }
        if (class268.field4345 != 0) {
            class313.field5023 += 20;
            if (class313.field5023 >= 400) {
                class268.field4345 = 0;
            }
        }
        class135.field1949++;
        if (class297.field4739 != null) {
            class217.field3396++;
            if (class217.field3396 >= 15) {
                class247.method1761(class297.field4739, (byte) -122);
                class297.field4739 = null;
            }
        }
        if (class169.field2608 != null) {
            class247.method1761(class169.field2608, (byte) -102);
            class205.field3213++;
            if ((class148.field2194 + 5) < class50.field633 || class50.field633 < class148.field2194 - 5 || class276.field4473 + 5 < class71.field1042 || class71.field1042 < class276.field4473 - 5) {
                class33.field391 = true;
            }
            if (class284.field4606 == 0) {
                if (class33.field391 && class205.field3213 >= 5) {
                    if (class169.field2608 == class104.field1521 && class79.field1189 != class191.field3031) {
                        class118.field1712++;
                        byte var43 = 0;
                        class231 var44 = class169.field2608;
                        if (class191.field2979 == 1 && var44.field3563 == 206) {
                            var43 = 1;
                        }
                        if (var44.field3708[class79.field1189] <= 0) {
                            var43 = 0;
                        }
                        if (client.method1698(var44).method161(-56)) {
                            int var47 = class191.field3031;
                            int var48 = class79.field1189;
                            var44.field3708[var48] = var44.field3708[var47];
                            var44.field3582[var48] = var44.field3582[var47];
                            var44.field3708[var47] = -1;
                            var44.field3582[var47] = 0;
                        } else if (var43 == 1) {
                            int var45 = class191.field3031;
                            int var46 = class79.field1189;
                            while (var45 != var46) {
                                if (var45 > var46) {
                                    var44.method1621(0, var45, var45 - 1);
                                    var45--;
                                } else if (var45 < var46) {
                                    var44.method1621(0, var45, var45 + 1);
                                    var45++;
                                }
                            }
                        } else {
                            var44.method1621(0, class191.field3031, class79.field1189);
                        }
                        class150.field2218.method445(238, 7);
                        class150.field2218.method1164(class169.field2608.field3595, 8825);
                        class150.field2218.method1202(24924, var43);
                        class150.field2218.method1207(true, class191.field3031);
                        class150.field2218.method1180(-17437, class79.field1189);
                    }
                } else if ((class10.field153 == 1 || class10.method62(class173.field2721 - 1, true)) && class173.field2721 > 2) {
                    class300.method2017(84);
                } else if (class173.field2721 > 0) {
                    class171.method1223(-3);
                }
                class217.field3396 = 10;
                class235.field3796 = 0;
                class169.field2608 = null;
            }
        }
        class45.field547 = false;
        class80.field1227 = null;
        class231 var49 = class93.field1399;
        class231 var50 = class236.field3804;
        class237.field3811 = false;
        class67.field996 = 0;
        class93.field1399 = null;
        class236.field3804 = null;
        int var51 = -82 / ((arg0 - 23) / 39);
        while (class193.method1356(1) && class67.field996 < 128) {
            class297.field4736[class67.field996] = class140.field2006;
            class7.field99[class67.field996] = class296.field4729;
            class67.field996++;
        }
        class281.field4569 = null;
        if (class238.field3824 != -1) {
            class111.method743(0, class112.field1626, 0, class126.field1814, 9481, 0, 0, class238.field3824);
        }
        client.field3871++;
        if (class281.field4569 != null) {
            class286.method1956(-3);
        }
        while (true) {
            class122 var52;
            class231 var53;
            class231 var54;
            do {
                var52 = (class122) class275.field4463.method1547(122);
                if (var52 == null) {
                    while (true) {
                        class122 var55;
                        class231 var56;
                        class231 var57;
                        do {
                            var55 = (class122) class72.field1066.method1547(121);
                            if (var55 == null) {
                                while (true) {
                                    class122 var58;
                                    class231 var59;
                                    class231 var60;
                                    do {
                                        var58 = (class122) class84.field1294.method1547(122);
                                        if (var58 == null) {
                                            if (class281.field4569 == null) {
                                                class92.field1371 = 0;
                                            }
                                            if (class142.field2079 != null) {
                                                class278.method1925((byte) -65);
                                            }
                                            if (class72.field1072 > 0 && class309.field4977[82] && class309.field4977[81] && class256.field4185 != 0) {
                                                int var61 = class148.field2204 - class256.field4185;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class62.method397(class214.field3347.field3970[0] + class113.field1653, class214.field3347.field3972[0] + class5.field77, var61, false);
                                            }
                                            if (class72.field1072 > 0 && class309.field4977[82] && class309.field4977[81]) {
                                                if (class234.field3777 != -1) {
                                                    class62.method397(class234.field3777 + class113.field1653, class5.field77 + class24.field302, class148.field2204, false);
                                                }
                                                class184.field2895 = 0;
                                                class266.field4321 = 0;
                                            } else if (class266.field4321 == 2) {
                                                if (class234.field3777 != -1) {
                                                    class215.field3363++;
                                                    class150.field2218.method445(173, 7);
                                                    class150.field2218.method1180(-17437, class113.field1653 + class234.field3777);
                                                    class150.field2218.method1180(-17437, class304.field4829);
                                                    class150.field2218.method1203(class5.field77 + class24.field302, 714844776);
                                                    class150.field2218.method1163(class71.field1034, (byte) 40);
                                                    class257.field4190 = class171.field2686;
                                                    class313.field5023 = 0;
                                                    class268.field4345 = 1;
                                                    class114.field1672 = class223.field3493;
                                                }
                                                class266.field4321 = 0;
                                            } else if (class184.field2895 == 2) {
                                                if (class234.field3777 != -1) {
                                                    class220.field3451++;
                                                    class150.field2218.method445(81, 7);
                                                    class150.field2218.method1203(class234.field3777 + class113.field1653, 714844776);
                                                    class150.field2218.method1180(-17437, class5.field77 + class24.field302);
                                                    class313.field5023 = 0;
                                                    class114.field1672 = class223.field3493;
                                                    class268.field4345 = 1;
                                                    class257.field4190 = class171.field2686;
                                                }
                                                class184.field2895 = 0;
                                            } else if (class234.field3777 != -1 && class266.field4321 == 0 && class184.field2895 == 0) {
                                                class195.method1364((class24.field302 << 1) + 1 - class214.field3347.method8((byte) -68) >> 1, 0, 19, (class234.field3777 << 1) + (1 - class214.field3347.method8((byte) -111)) >> 1);
                                                class114.field1672 = class223.field3493;
                                                class313.field5023 = 0;
                                                class257.field4190 = class171.field2686;
                                                class268.field4345 = 1;
                                            }
                                            class234.field3777 = -1;
                                            class270.method1881(-25653);
                                            if (class93.field1399 != var49) {
                                                if (var49 != null) {
                                                    class247.method1761(var49, (byte) -109);
                                                }
                                                if (class93.field1399 != null) {
                                                    class247.method1761(class93.field1399, (byte) -106);
                                                }
                                            }
                                            if (class236.field3804 != var50 && class218.field3416 == class102.field1504) {
                                                if (var50 != null) {
                                                    class247.method1761(var50, (byte) -113);
                                                }
                                                if (class236.field3804 != null) {
                                                    class247.method1761(class236.field3804, (byte) -124);
                                                }
                                            }
                                            if (class236.field3804 == null) {
                                                if (class218.field3416 > 0) {
                                                    class218.field3416--;
                                                }
                                            } else if (class102.field1504 > class218.field3416) {
                                                class218.field3416++;
                                                if (class218.field3416 == class102.field1504) {
                                                    class247.method1761(class236.field3804, (byte) -119);
                                                }
                                            }
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class1.field16[var62]++;
                                            }
                                            int var63 = class80.method545((byte) 106);
                                            int var64 = class248.method1767((byte) 116);
                                            if (var63 > 15000 && var64 > 15000) {
                                                class172.field2712++;
                                                class128.field1832 = 250;
                                                class138.method873(14500, (byte) -111);
                                                class150.field2218.method445(127, 7);
                                            }
                                            if (class123.field1762 != null && class123.field1762.field2399 == 1) {
                                                if (class123.field1762.field2401 != null) {
                                                    class297.method2002(9558, class258.field4201, class275.field4466);
                                                }
                                                class258.field4201 = null;
                                                class123.field1762 = null;
                                                class275.field4466 = false;
                                            }
                                            class134.field1897++;
                                            class97.field1465++;
                                            class29.field366++;
                                            if (class29.field366 > 500) {
                                                class29.field366 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x2) == 2) {
                                                    class206.field3221 += class99.field1481;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class97.field1466 += class129.field1853;
                                                }
                                                if ((var65 & 0x4) == 4) {
                                                    class177.field2785 += class177.field2786;
                                                }
                                            }
                                            if (class177.field2785 < -40) {
                                                class177.field2786 = 1;
                                            }
                                            if (class206.field3221 < -55) {
                                                class99.field1481 = 2;
                                            }
                                            if (class177.field2785 > 40) {
                                                class177.field2786 = -1;
                                            }
                                            if (class206.field3221 > 55) {
                                                class99.field1481 = -2;
                                            }
                                            if (class97.field1465 > 500) {
                                                class97.field1465 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class60.field876 += class263.field4279;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class146.field2173 += class29.field372;
                                                }
                                            }
                                            if (class97.field1466 < -50) {
                                                class129.field1853 = 2;
                                            }
                                            if (class146.field2173 < -60) {
                                                class29.field372 = 2;
                                            }
                                            if (class146.field2173 > 60) {
                                                class29.field372 = -2;
                                            }
                                            if (class60.field876 < -20) {
                                                class263.field4279 = 1;
                                            }
                                            if (class97.field1466 > 50) {
                                                class129.field1853 = -2;
                                            }
                                            if (class60.field876 > 10) {
                                                class263.field4279 = -1;
                                            }
                                            if (class134.field1897 > 50) {
                                                class150.field2218.method445(71, 7);
                                                class10.field149++;
                                            }
                                            if (class262.field4256) {
                                                class153.method1062(8488);
                                                class262.field4256 = false;
                                            }
                                            try {
                                                if (class270.field4405 != null && class150.field2218.field2676 > 0) {
                                                    class270.field4405.method562(class150.field2218.field2676, class150.field2218.field2650, 0, 76);
                                                    class150.field2218.field2676 = 0;
                                                    class134.field1897 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var67) {
                                                class9.method50(-105);
                                                return;
                                            }
                                        }
                                        var59 = var58.field1752;
                                        if (var59.field3739 < 0) {
                                            break;
                                        }
                                        var60 = class201.method1398(var59.field3633, 0);
                                    } while (var60 == null || var60.field3578 == null || var59.field3739 >= var60.field3578.length || var60.field3578[var59.field3739] != var59);
                                    class122.method795(var58, -123);
                                }
                            }
                            var56 = var55.field1752;
                            if (var56.field3739 < 0) {
                                break;
                            }
                            var57 = class201.method1398(var56.field3633, 0);
                        } while (var57 == null || var57.field3578 == null || var57.field3578.length <= var56.field3739 || var57.field3578[var56.field3739] != var56);
                        class122.method795(var55, -118);
                    }
                }
                var53 = var52.field1752;
                if (var53.field3739 < 0) {
                    break;
                }
                var54 = class201.method1398(var53.field3633, 0);
            } while (var54 == null || var54.field3578 == null || var54.field3578.length <= var53.field3739 || var54.field3578[var53.field3739] != var53);
            class122.method795(var52, -116);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIB)V")
    public static final void method23(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class181 var5 = class95.method652(10, (byte) 34, arg3);
        if (arg4 > -57) {
            field43 = 110;
        }
        var5.method1285((byte) 64);
        var5.field2847 = arg1;
        field50++;
        var5.field2845 = arg2;
        var5.field2843 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static void method24(byte arg0) {
        int var1 = 12 / ((arg0 - 11) / 52);
        field53 = null;
    }
}
