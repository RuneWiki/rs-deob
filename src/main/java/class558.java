import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class558 extends class334 {

    @OriginalMember(owner = "client!oaa", name = "H", descriptor = "I")
    public int field7740 = 4;

    @OriginalMember(owner = "client!oaa", name = "K", descriptor = "I")
    public int field7743 = 0;

    @OriginalMember(owner = "client!oaa", name = "N", descriptor = "I")
    public int field7746 = 4;

    @OriginalMember(owner = "client!oaa", name = "R", descriptor = "I")
    public int field7750 = 4;

    @OriginalMember(owner = "client!oaa", name = "E", descriptor = "[B")
    private byte[] field7737 = new byte[512];

    @OriginalMember(owner = "client!oaa", name = "L", descriptor = "Z")
    public boolean field7744 = true;

    @OriginalMember(owner = "client!oaa", name = "U", descriptor = "I")
    public int field7753 = 1638;

    @OriginalMember(owner = "client!oaa", name = "G", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!oaa", name = "I", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!oaa", name = "J", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!oaa", name = "M", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!oaa", name = "O", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!oaa", name = "P", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!oaa", name = "S", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!oaa", name = "T", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!oaa", name = "V", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!oaa", name = "F", descriptor = "[S")
    private short[] field7738;

    @OriginalMember(owner = "client!oaa", name = "Q", descriptor = "[S")
    private short[] field7749;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "([III)V")
    public final void method3252(int[] arg0, int arg1, int arg2) {
        ++field7739;
        int var4 = -69 % ((-8 - arg2) / 59);
        int var5 = class527.field7361[arg1] * this.field7740;
        if (this.field7746 != 1) {
            short var6 = this.field7738[0];
            if (var6 > 8 || ~var6 > 7) {
                int var7 = this.field7749[0] << 12;
                int var8 = var5 * var7 >> 12;
                int var9 = this.field7740 * var7 >> 12;
                int var10 = this.field7750 * var7 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 + 1;
                if (var9 <= var12) {
                    var12 = 0;
                }
                int var13 = var8 & 4095;
                int var14 = class741.field10259[var13];
                int var15 = 255 & this.field7737[255 & var11];
                int var16 = 255 & this.field7737[255 & var12];
                for (int var17 = 0; ~var17 > ~class439.field6099; ++var17) {
                    int var37 = class295.field4296[var17] * this.field7750;
                    int var38 = this.method3255(var7 * var37 >> 12, var16, var15, var14, var13, (byte) -26, var10);
                    arg0[var17] = var6 * var38 >> 12;
                }
            }
            for (int var18 = 1; var18 < this.field7746; ++var18) {
                short var19 = this.field7738[var18];
                if (var19 > 8 || var19 < -8) {
                    int var20 = this.field7749[var18] << 12;
                    int var21 = var5 * var20 >> 12;
                    int var22 = this.field7750 * var20 >> 12;
                    int var23 = this.field7740 * var20 >> 12;
                    int var24 = var21 >> 12;
                    int var25 = var24 + 1;
                    int var26 = var21 & 4095;
                    if (var23 <= var25) {
                        var25 = 0;
                    }
                    int var27 = this.field7737[var24 & 255] & 255;
                    int var28 = class741.field10259[var26];
                    int var29 = 255 & this.field7737[255 & var25];
                    if (this.field7744 && ~(this.field7746 + -1) == ~var18) {
                        for (int var30 = 0; var30 < class439.field6099; ++var30) {
                            int var31 = class295.field4296[var30] * this.field7750;
                            int var32 = this.method3255(var20 * var31 >> 12, var29, var27, var28, var26, (byte) -26, var22);
                            int var33 = arg0[var30] - -(var19 * var32 >> 12);
                            arg0[var30] = (var33 >> 1) + 2048;
                        }
                    } else {
                        for (int var34 = 0; ~class439.field6099 < ~var34; ++var34) {
                            int var35 = class295.field4296[var34] * this.field7750;
                            int var36 = this.method3255(var20 * var35 >> 12, var29, var27, var28, var26, (byte) -26, var22);
                            arg0[var34] += var19 * var36 >> 12;
                        }
                    }
                }
            }
        } else {
            int var39 = this.field7749[0] << 12;
            short var40 = this.field7738[0];
            int var41 = this.field7750 * var39 >> 12;
            int var42 = var5 * var39 >> 12;
            int var43 = this.field7740 * var39 >> 12;
            int var44 = var42 >> 12;
            int var45 = var44 + 1;
            if (~var45 <= ~var43) {
                var45 = 0;
            }
            int var46 = var42 & 4095;
            int var47 = 255 & this.field7737[255 & var44];
            int var48 = this.field7737[var45 & 255] & 255;
            int var49 = class741.field10259[var46];
            if (!this.field7744) {
                for (int var50 = 0; class439.field6099 > var50; ++var50) {
                    int var51 = class295.field4296[var50] * this.field7750;
                    int var52 = this.method3255(var39 * var51 >> 12, var48, var47, var49, var46, (byte) -26, var41);
                    arg0[var50] = var40 * var52 >> 12;
                }
            } else {
                for (int var53 = 0; ~class439.field6099 < ~var53; ++var53) {
                    int var54 = class295.field4296[var53] * this.field7750;
                    int var55 = this.method3255(var39 * var54 >> 12, var48, var47, var49, var46, (byte) -26, var41);
                    int var56 = var40 * var55 >> 12;
                    arg0[var53] = (var56 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "(I)V")
    public static final void method3253(int arg0) {
        ++field7742;
        if (class295.field4298) {
            class519 var1 = class153.method1203(0, class65.field979, class568.field7906);
            if (var1 != null && var1.field7202 != null) {
                class511 var2 = new class511();
                var2.field7023 = var1;
                var2.field7021 = var1.field7202;
                class46.method357(var2);
            }
            class295.field4298 = false;
            class578.field8338 = -1;
            class121.field2051 = -1;
            if (var1 != null) {
                class172.method1268(var1, -41);
            }
            int var3 = -125 / ((-39 - arg0) / 38);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
    public class558() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BII)Z")
    public static final boolean method3254(byte arg0, int arg1, int arg2) {
        ++field7752;
        if (arg0 != 27) {
            return false;
        } else {
            return class131.method1102(arg1, -3157, arg2) | ~(arg2 & 262144) != -1 || class518.method3033(arg2, -110, arg1);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        if (arg1 != -22563988) {
            method3256(-86);
        }
        ++field7741;
        int[] var3 = super.field4743.method1027((byte) -113, arg0);
        if (super.field4743.field1993) {
            this.method3252(var3, arg0, arg1 + 22563886);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIBI)I")
    private final int method3255(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field7745;
        int var8 = arg0 >> 12;
        int var9 = var8 - -1;
        int var10 = arg0 & 4095;
        int var11 = var8 & 255;
        if (var9 >= arg6) {
            var9 = 0;
        }
        int var12 = var9 & 255;
        int var13 = arg4 - 4096;
        int var14 = var10 - 4096;
        int var15 = this.field7737[var11 - -arg2] & 3;
        int var16 = class741.field10259[var10];
        int var17;
        if (~var15 >= -2) {
            var17 = ~var15 != -1 ? arg4 - var10 : arg4 + var10;
        } else {
            var17 = ~var15 != -3 ? -var10 - arg4 : -arg4 + var10;
        }
        int var18 = 3 & this.field7737[var12 - -arg2];
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 == -1 ? arg4 + var14 : -var14 + arg4;
        } else {
            var19 = var18 != 2 ? -arg4 + -var14 : var14 - arg4;
        }
        int var20 = ((-var17 + var19) * var16 >> 12) + var17;
        int var21 = this.field7737[arg1 + var11] & 3;
        int var22;
        if (~var21 >= -2) {
            var22 = ~var21 != -1 ? -var10 + var13 : var10 + var13;
        } else {
            var22 = var21 != 2 ? -var10 + -var13 : var10 - var13;
        }
        int var23 = this.field7737[arg1 + var12] & 3;
        if (arg5 != -26) {
            method3256(-14);
        }
        int var24;
        if (var23 <= 1) {
            var24 = ~var23 == -1 ? var13 + var14 : -var14 + var13;
        } else {
            var24 = var23 != 2 ? -var13 + -var14 : -var13 + var14;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((var25 - var20) * arg3 >> 12) + var20;
    }

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "(I)V")
    public static final void method3256(int arg0) {
        if (class609.field8651 > 1) {
            --class609.field8651;
            class700.field9818 = class745.field10359;
        }
        ++field7754;
        if (class244.field3488) {
            class244.field3488 = false;
            class317.method1929(13);
        } else {
            if (!class383.field5382) {
                class110.method877(92);
            }
            for (int var1 = 0; var1 < 100 && class466.method2726((byte) -99); ++var1) {
            }
            if (~class141.field2306 == -11) {
                while (class40.method298((byte) -111)) {
                    class302 var2 = class582.method3419(class176.field2649, (byte) 125, class626.field8901);
                    var2.field4341.method2524(false, 0);
                    int var3 = var2.field4341.field5983;
                    class9.method146(var2.field4341, (byte) -121);
                    var2.field4341.method2571(-1350378040, -var3 + var2.field4341.field5983);
                    class501.method2928(0, var2);
                }
                if (class168.field2547 != null) {
                    if (class168.field2547.field5466 != -1) {
                        class302 var4 = class582.method3419(class531.field7391, (byte) 125, class626.field8901);
                        var4.field4341.method2546(true, class168.field2547.field5466);
                        class501.method2928(0, var4);
                        class168.field2547 = null;
                        class762.field10560 = 30000L + class337.method2062(false);
                    }
                } else if (~class762.field10560 >= ~class337.method2062(false)) {
                    class168.field2547 = class224.field3278.method4263(class472.field6424.field5595, 1);
                }
                class453 var5 = (class453) class397.field5480.method3731((byte) -76);
                if (var5 != null || ~(-2000L + class337.method2062(false)) < ~class761.field10538) {
                    class302 var6 = null;
                    int var7 = 0;
                    for (class453 var8 = (class453) class483.field6658.method3731((byte) -85); var8 != null && (var6 == null || ~(var6.field4341.field5983 - var7) > -241); var8 = (class453) class483.field6658.method3729((byte) -8)) {
                        var8.method4237(-1);
                        int var9 = var8.method1869((byte) -97);
                        if (~var9 > 0) {
                            var9 = -1;
                        } else if (var9 > 65534) {
                            var9 = 65534;
                        }
                        int var10 = var8.method1873(110);
                        if (~var10 > 0) {
                            var10 = -1;
                        } else if (var10 > 65534) {
                            var10 = 65534;
                        }
                        if (class199.field2987 != var10 || ~class512.field7038 != ~var9) {
                            if (var6 == null) {
                                ++class359.field5085;
                                var6 = class582.method3419(class573.field8101, (byte) 127, class626.field8901);
                                var6.field4341.method2524(false, 0);
                                var7 = var6.field4341.field5983;
                            }
                            int var11 = -class199.field2987 + var10;
                            class199.field2987 = var10;
                            int var12 = -class512.field7038 + var9;
                            class512.field7038 = var9;
                            int var13 = (int) ((var8.method1871((byte) -126) - class761.field10538) / 20L);
                            if (var13 < 8 && ~var11 <= 31 && var11 <= 31 && ~var12 <= 31 && var12 <= 31) {
                                var12 += 32;
                                var11 += 32;
                                var6.field4341.method2546(true, (var13 << 12) + (var11 << 6) + var12);
                            } else if (var13 < 32 && ~var11 <= 127 && var11 <= 127 && var12 >= -128 && ~var12 >= -128) {
                                var12 += 128;
                                var11 += 128;
                                var6.field4341.method2524(false, var13 + 128);
                                var6.field4341.method2546(true, (var11 << 8) + var12);
                            } else if (~var13 <= -33) {
                                var6.field4341.method2546(true, var13 + 57344);
                                if (var10 != 1 && var9 != -1) {
                                    var6.field4341.method2548(var10 | var9 << 16, (byte) -105);
                                } else {
                                    var6.field4341.method2548(Integer.MIN_VALUE, (byte) -112);
                                }
                            } else {
                                var6.field4341.method2524(false, var13 + 192);
                                if (~var10 != -2 && ~var9 != 0) {
                                    var6.field4341.method2548(var10 | var9 << 16, (byte) -98);
                                } else {
                                    var6.field4341.method2548(Integer.MIN_VALUE, (byte) -122);
                                }
                            }
                            class761.field10538 = var8.method1871((byte) -126);
                        }
                    }
                    if (var6 != null) {
                        var6.field4341.method2571(-1350378040, -var7 + var6.field4341.field5983);
                        class501.method2928(0, var6);
                    }
                }
                if (var5 != null) {
                    long var14 = (var5.method1871((byte) -126) - class254.field3645) / 50L;
                    class254.field3645 = var5.method1871((byte) -126);
                    if (var14 > 32767L) {
                        var14 = 32767L;
                    }
                    int var16 = var5.method1869((byte) -119);
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (~var16 < -65536) {
                        var16 = 65535;
                    }
                    int var17 = var5.method1873(-111);
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (var17 > 65535) {
                        var17 = 65535;
                    }
                    byte var18 = 0;
                    if (var5.method1868((byte) 114) == 2) {
                        var18 = 1;
                    }
                    ++class636.field8988;
                    int var19 = (int) var14;
                    class302 var20 = class582.method3419(class774.field10659, (byte) 126, class626.field8901);
                    var20.field4341.method2546(true, var19 | var18 << 15);
                    var20.field4341.method2542(337533360, var17 | var16 << 16);
                    class501.method2928(0, var20);
                }
                if (~class79.field1174 < -1) {
                    ++class626.field8899;
                    class302 var21 = class582.method3419(class594.field8495, (byte) 127, class626.field8901);
                    var21.field4341.method2524(false, class79.field1174 * 3);
                    for (int var22 = 0; ~var22 > ~class79.field1174; ++var22) {
                        class618 var23 = class506.field6944[var22];
                        long var24 = (var23.method763((byte) -89) + -class709.field9924) / 50L;
                        class709.field9924 = var23.method763((byte) -89);
                        if (~var24 < -65536L) {
                            var24 = 65535L;
                        }
                        var21.field4341.method2524(false, var23.method765(-124));
                        var21.field4341.method2546(true, (int) var24);
                    }
                    class501.method2928(0, var21);
                }
                if (~class460.field6285 < -1) {
                    --class460.field6285;
                }
                if (class438.field6083 && ~class460.field6285 >= -1) {
                    class438.field6083 = false;
                    ++class778.field10679;
                    class460.field6285 = 20;
                    class302 var26 = class582.method3419(class403.field5558, (byte) 127, class626.field8901);
                    var26.field4341.method2546(true, (int) class208.field3031 >> 3);
                    var26.field4341.method2559((int) class98.field1423 >> 3, 116);
                    class501.method2928(0, var26);
                }
                if (!class531.field7395 != !class505.field6936) {
                    class505.field6936 = class531.field7395;
                    ++class697.field9799;
                    class302 var27 = class582.method3419(class508.field6982, (byte) 125, class626.field8901);
                    var27.field4341.method2524(false, !class531.field7395 ? 0 : 1);
                    class501.method2928(0, var27);
                }
                if (!class356.field5069) {
                    ++class341.field4843;
                    class302 var28 = class582.method3419(class517.field7108, (byte) 127, class626.field8901);
                    var28.field4341.method2524(false, 0);
                    int var29 = var28.field4341.field5983;
                    class431 var30 = class420.field5820.method3785(24);
                    var28.field4341.method2514(var30.field6002, var30.field5983, (byte) -111, 0);
                    var28.field4341.method2571(-1350378040, var28.field4341.field5983 - var29);
                    class501.method2928(0, var28);
                    class356.field5069 = true;
                }
                if (class514.field7096 != null) {
                    if (class783.field10725 != 2) {
                        if (class783.field10725 == 3) {
                            class198.method1409(false);
                        }
                    } else {
                        class726.method4027(16384);
                    }
                }
                if (!class239.field3450) {
                    class322.field4582 /= 2.0F;
                } else {
                    class239.field3450 = false;
                }
                if (class215.field3142) {
                    class215.field3142 = false;
                } else {
                    class133.field2232 /= 2.0F;
                }
                class555.method3200((byte) 30);
                if (class141.field2306 == 10) {
                    class338.method2067(false);
                    class28.method228(-1);
                    class275.method1747(false);
                    ++class577.field8318;
                    if (class577.field8318 > 750) {
                        class317.method1929(13);
                    } else {
                        class538.method3120((byte) 109);
                        class445.method2640(-1);
                        class110.method874(-24);
                        for (int var31 = class578.field8328.method4313(true, (byte) -116); ~var31 != 0; var31 = class578.field8328.method4313(false, (byte) -119)) {
                            class210.method1456(var31, (byte) 81);
                            class133.field2228[class194.method1380(class16.field180++, 31)] = var31;
                        }
                        for (class371 var32 = class494.method2886(-75); var32 != null; var32 = class494.method2886(-48)) {
                            int var33 = var32.method2214(255);
                            long var34 = var32.method2216(-69);
                            if (~var33 == -2) {
                                class362.field5135[(int) var34] = var32.field5233;
                                class193.field2899 |= class769.field10616[(int) var34];
                                class455.field6218[class194.method1380(class335.field4772++, 31)] = (int) var34;
                            } else if (var33 == 2) {
                                class17.field187[(int) var34] = var32.field5227;
                                class656.field9265[class194.method1380(31, class586.field8418++)] = (int) var34;
                            } else if (var33 == 3) {
                                class519 var36 = class604.method3506((int) var34, 255);
                                if (!var32.field5227.equals(var36.field7181)) {
                                    var36.field7181 = var32.field5227;
                                    class172.method1268(var36, -48);
                                }
                            } else if (var33 != 4) {
                                if (var33 != 5) {
                                    if (var33 == 6) {
                                        int var37 = var32.field5233;
                                        int var38 = (var37 & 32494) >> 10;
                                        int var39 = 31 & var37 >> 5;
                                        int var40 = 31 & var37;
                                        int var41 = (var38 << 19) + (var39 << 11) + (var40 << 3);
                                        class519 var42 = class604.method3506((int) var34, 255);
                                        if (~var42.field7157 != ~var41) {
                                            var42.field7157 = var41;
                                            class172.method1268(var42, -25);
                                        }
                                    } else if (~var33 != -8) {
                                        if (var33 == 8) {
                                            class519 var43 = class604.method3506((int) var34, 255);
                                            if (var32.field5233 != var43.field7162 || var32.field5225 != var43.field7133 || var32.field5232 != var43.field7235) {
                                                var43.field7133 = var32.field5225;
                                                var43.field7162 = var32.field5233;
                                                var43.field7235 = var32.field5232;
                                                if (var43.field7129 != -1) {
                                                    if (~var43.field7289 < -1) {
                                                        var43.field7235 = var43.field7235 * 32 / var43.field7289;
                                                    } else if (var43.field7166 > 0) {
                                                        var43.field7235 = var43.field7235 * 32 / var43.field7166;
                                                    }
                                                }
                                                class172.method1268(var43, -90);
                                            }
                                        } else if (var33 == 9) {
                                            class519 var44 = class604.method3506((int) var34, 255);
                                            if (~var32.field5233 != ~var44.field7129 || ~var32.field5225 != ~var44.field7132) {
                                                var44.field7132 = var32.field5225;
                                                var44.field7129 = var32.field5233;
                                                class172.method1268(var44, -71);
                                            }
                                        } else if (~var33 != -11) {
                                            if (~var33 != -12) {
                                                if (var33 != 12) {
                                                    if (~var33 == -15) {
                                                        class519 var45 = class604.method3506((int) var34, 255);
                                                        var45.field7246 = var32.field5233;
                                                    } else if (~var33 != -16) {
                                                        if (~var33 == -17) {
                                                            class519 var46 = class604.method3506((int) var34, 255);
                                                            var46.field7131 = var32.field5233;
                                                        } else if (var33 == 17) {
                                                            class519 var47 = class604.method3506((int) var34, 255);
                                                            var47.field7208 = var32.field5233;
                                                        } else if (~var33 == -19) {
                                                            class519 var48 = class604.method3506((int) var34, 255);
                                                            int var49 = (int) (var34 >> 32);
                                                            var48.method3044(var49, (short) var32.field5225, -1, (short) var32.field5233);
                                                        } else if (~var33 == -20) {
                                                            class519 var50 = class604.method3506((int) var34, 255);
                                                            int var51 = (int) (var34 >> 32);
                                                            var50.method3045((short) var32.field5233, var51, 0, (short) var32.field5225);
                                                        }
                                                    } else {
                                                        class263.field3717 = var32.field5233;
                                                        class104.field1516 = var32.field5225;
                                                        class687.field9717 = true;
                                                    }
                                                } else {
                                                    class519 var52 = class604.method3506((int) var34, 255);
                                                    int var53 = var32.field5233;
                                                    if (var52 != null && var52.field7190 == 0) {
                                                        if (~(-var52.field7255 + var52.field7161) > ~var53) {
                                                            var53 = -var52.field7255 + var52.field7161;
                                                        }
                                                        if (~var53 > -1) {
                                                            var53 = 0;
                                                        }
                                                        if (~var52.field7244 != ~var53) {
                                                            var52.field7244 = var53;
                                                            class172.method1268(var52, -127);
                                                        }
                                                    }
                                                }
                                            } else {
                                                class519 var54 = class604.method3506((int) var34, 255);
                                                var54.field7151 = var54.field7124 = var32.field5225;
                                                var54.field7191 = var54.field7283 = var32.field5233;
                                                var54.field7256 = 0;
                                                var54.field7184 = 0;
                                                class172.method1268(var54, -103);
                                            }
                                        } else {
                                            class519 var55 = class604.method3506((int) var34, 255);
                                            if (var32.field5233 != var55.field7216 || ~var32.field5225 != ~var55.field7176 || var32.field5232 != var55.field7266) {
                                                var55.field7176 = var32.field5225;
                                                var55.field7216 = var32.field5233;
                                                var55.field7266 = var32.field5232;
                                                class172.method1268(var55, -62);
                                            }
                                        }
                                    } else {
                                        class519 var56 = class604.method3506((int) var34, 255);
                                        boolean var57 = ~var32.field5233 == -2;
                                        if (!var56.field7264 == var57) {
                                            var56.field7264 = var57;
                                            class172.method1268(var56, -24);
                                        }
                                    }
                                } else {
                                    class519 var58 = class604.method3506((int) var34, 255);
                                    if (var32.field5233 != var58.field7219 || ~var32.field5233 == 0) {
                                        var58.field7258 = 0;
                                        var58.field7152 = 1;
                                        var58.field7219 = var32.field5233;
                                        var58.field7275 = 0;
                                        class98 var59 = var58.field7219 != -1 ? class168.field2552.method3287(74, var58.field7219) : null;
                                        if (var59 != null) {
                                            class354.method2142(255, var58.field7275, var59);
                                        }
                                        class172.method1268(var58, -59);
                                    }
                                }
                            } else {
                                class519 var60 = class604.method3506((int) var34, 255);
                                int var61 = var32.field5233;
                                int var62 = var32.field5225;
                                int var63 = var32.field5232;
                                if (var60.field7146 != var61 || var60.field7211 != var62 || ~var60.field7226 != ~var63) {
                                    var60.field7146 = var61;
                                    var60.field7226 = var63;
                                    var60.field7211 = var62;
                                    class172.method1268(var60, -33);
                                }
                            }
                        }
                        ++class662.field9326;
                        if (~class775.field10664 != -1) {
                            class785.field10756 += 20;
                            if (class785.field10756 >= 400) {
                                class775.field10664 = 0;
                            }
                        }
                        if (class504.field6918 != null) {
                            ++class445.field6159;
                            if (class445.field6159 >= 15) {
                                class172.method1268(class504.field6918, -36);
                                class504.field6918 = null;
                            }
                        }
                        class302.field4344 = false;
                        class260.field3685 = null;
                        class466.field6363 = false;
                        class600.field8556 = null;
                        class246.method1633(false, -1, (class519) null, -1);
                        class623.method3565(-1, (class519) null, -1, (byte) 94);
                        if (!class295.field4298) {
                            class578.field8338 = -1;
                        }
                        class141.method1141((byte) 111);
                        ++class745.field10359;
                        if (class153.field2439) {
                            ++class387.field5412;
                            class302 var64 = class582.method3419(class411.field5629, (byte) 125, class626.field8901);
                            var64.field4341.method2542(337533360, class420.field5832 << 14 | class770.field10627 << 28 | class338.field4797);
                            class501.method2928(0, var64);
                            class153.field2439 = false;
                        }
                        while (true) {
                            class511 var65;
                            class519 var66;
                            class519 var67;
                            do {
                                var65 = (class511) class781.field10710.method3726(12691);
                                if (var65 == null) {
                                    while (true) {
                                        class511 var68;
                                        class519 var69;
                                        class519 var70;
                                        do {
                                            var68 = (class511) class349.field4958.method3726(12691);
                                            if (var68 == null) {
                                                while (true) {
                                                    class511 var71;
                                                    class519 var72;
                                                    class519 var73;
                                                    do {
                                                        var71 = (class511) class37.field441.method3726(12691);
                                                        if (var71 == null) {
                                                            if (class260.field3685 == null) {
                                                                class653.field9249 = 0;
                                                            }
                                                            if (class766.field10586 != null) {
                                                                class785.method4305(-59);
                                                            }
                                                            if (~class778.field10675 < -1 && class681.field9656.method681((byte) 118, 82) && class681.field9656.method681((byte) 104, 81) && class179.field2745 != 0) {
                                                                int var74 = -class179.field2745 + class719.field10041.field10361;
                                                                if (~var74 > -1) {
                                                                    var74 = 0;
                                                                } else if (var74 > 3) {
                                                                    var74 = 3;
                                                                }
                                                                class499.method2917(class222.field3266 - -class719.field10041.field4142[0], var74, 63, class697.field9798 - -class719.field10041.field4136[0]);
                                                            }
                                                            class133.method1104(40);
                                                            if (arg0 > -74) {
                                                                return;
                                                            }
                                                            for (int var75 = 0; ~var75 > -6; ++var75) {
                                                                int var10002 = class51.field732[var75]++;
                                                            }
                                                            if (class193.field2899 && class337.method2062(false) - 60000L > class20.field198) {
                                                                class203.method1433(121);
                                                            }
                                                            for (class521 var76 = (class521) class430.field5949.method1730((byte) 114); var76 != null; var76 = (class521) class430.field5949.method1729((byte) 100)) {
                                                                if (~((long) var76.field7306) > ~(class337.method2062(false) / 1000L - 5L)) {
                                                                    if (~var76.field7307 < -1) {
                                                                        class437.method2608("", var76.field7309 + class563.field7817.method3281(class423.field5892, -1), 5, "", (byte) 120, "", 0);
                                                                    }
                                                                    if (var76.field7307 == 0) {
                                                                        class437.method2608("", var76.field7309 + class563.field7818.method3281(class423.field5892, -1), 5, "", (byte) 120, "", 0);
                                                                    }
                                                                    var76.method781(5555);
                                                                }
                                                            }
                                                            ++class355.field5028;
                                                            if (class355.field5028 > 500) {
                                                                class355.field5028 = 0;
                                                                int var77 = (int) (8.0D * Math.random());
                                                                if (~(var77 & 2) == -3) {
                                                                    class355.field5024 += class698.field9800;
                                                                }
                                                                if ((1 & var77) == 1) {
                                                                    class308.field4392 += class678.field9565;
                                                                }
                                                                if (~(4 & var77) == -5) {
                                                                    class193.field2902 += class473.field6433;
                                                                }
                                                            }
                                                            if (class308.field4392 < -50) {
                                                                class678.field9565 = 2;
                                                            }
                                                            if (class308.field4392 > 50) {
                                                                class678.field9565 = -2;
                                                            }
                                                            if (~class355.field5024 > 54) {
                                                                class698.field9800 = 2;
                                                            }
                                                            if (class355.field5024 > 55) {
                                                                class698.field9800 = -2;
                                                            }
                                                            if (class193.field2902 < -40) {
                                                                class473.field6433 = 1;
                                                            }
                                                            if (class193.field2902 > 40) {
                                                                class473.field6433 = -1;
                                                            }
                                                            ++class168.field2548;
                                                            if (class168.field2548 > 500) {
                                                                class168.field2548 = 0;
                                                                int var78 = (int) (8.0D * Math.random());
                                                                if ((var78 & 1) == 1) {
                                                                    class654.field9251 += class402.field5546;
                                                                }
                                                                if ((var78 & 2) == 2) {
                                                                    class592.field8487 += class249.field3582;
                                                                }
                                                            }
                                                            if (~class654.field9251 > 59) {
                                                                class402.field5546 = 2;
                                                            }
                                                            if (~class592.field8487 > 19) {
                                                                class249.field3582 = 1;
                                                            }
                                                            if (class654.field9251 > 60) {
                                                                class402.field5546 = -2;
                                                            }
                                                            ++class368.field5212;
                                                            if (~class592.field8487 < -11) {
                                                                class249.field3582 = -1;
                                                            }
                                                            if (~class368.field5212 < -51) {
                                                                ++class243.field3477;
                                                                class302 var79 = class582.method3419(class253.field3632, (byte) 125, class626.field8901);
                                                                class501.method2928(0, var79);
                                                            }
                                                            if (class344.field4890) {
                                                                class368.method2203((byte) -61);
                                                                class344.field4890 = false;
                                                            }
                                                            try {
                                                                class323.method1951(false);
                                                                return;
                                                            } catch (IOException var80) {
                                                                class317.method1929(13);
                                                                return;
                                                            }
                                                        }
                                                        var72 = var71.field7023;
                                                        if (~var72.field7193 > -1) {
                                                            break;
                                                        }
                                                        var73 = class604.method3506(var72.field7223, 255);
                                                    } while (var73 == null || var73.field7170 == null || var72.field7193 >= var73.field7170.length || var73.field7170[var72.field7193] != var72);
                                                    class46.method357(var71);
                                                }
                                            }
                                            var69 = var68.field7023;
                                            if (var69.field7193 < 0) {
                                                break;
                                            }
                                            var70 = class604.method3506(var69.field7223, 255);
                                        } while (var70 == null || var70.field7170 == null || var70.field7170.length <= var69.field7193 || var70.field7170[var69.field7193] != var69);
                                        class46.method357(var68);
                                    }
                                }
                                var66 = var65.field7023;
                                if (var66.field7193 < 0) {
                                    break;
                                }
                                var67 = class604.method3506(var66.field7223, 255);
                            } while (var67 == null || var67.field7170 == null || var67.field7170.length <= var66.field7193 || var67.field7170[var66.field7193] != var66);
                            class46.method357(var65);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)V")
    public final void method27(byte arg0) {
        this.field7737 = class117.method1033(this.field7743, -3979);
        ++field7748;
        this.method3257(40);
        if (arg0 >= -27) {
            this.field7750 = 104;
        }
        for (int var2 = this.field7746 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field7738[var2];
            if (var3 > 8) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field7746;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "(I)V")
    private final void method3257(int arg0) {
        if (this.field7753 > 0) {
            this.field7749 = new short[this.field7746];
            this.field7738 = new short[this.field7746];
            for (int var2 = 0; this.field7746 > var2; ++var2) {
                this.field7738[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field7753 / 4096.0F), (double) var2)));
                this.field7749[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field7738 != null && ~this.field7738.length == ~this.field7746) {
            this.field7749 = new short[this.field7746];
            for (int var3 = 0; ~this.field7746 < ~var3; ++var3) {
                this.field7749[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field7751;
        int var4 = -11 / ((arg0 - -8) / 34);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (!arg1) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (arg0 != 4) {
                                if (arg0 != 5) {
                                    if (~arg0 == -7) {
                                        this.field7740 = arg2.method2557(14929);
                                    }
                                } else {
                                    this.field7750 = arg2.method2557(14929);
                                }
                            } else {
                                this.field7743 = arg2.method2557(14929);
                            }
                        } else {
                            this.field7750 = this.field7740 = arg2.method2557(14929);
                        }
                    } else {
                        this.field7753 = arg2.method2528((byte) 89);
                        if (this.field7753 < 0) {
                            this.field7738 = new short[this.field7746];
                            for (int var5 = 0; var5 < this.field7746; ++var5) {
                                this.field7738[var5] = (short) arg2.method2528((byte) 89);
                            }
                        }
                    }
                } else {
                    this.field7746 = arg2.method2557(14929);
                }
            } else {
                this.field7744 = arg2.method2557(14929) == 1;
            }
            ++field7747;
        }
    }
}
