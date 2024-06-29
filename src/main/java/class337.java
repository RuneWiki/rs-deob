import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class337 implements class502 {

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Ljca;")
    private class686 field4270;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[Lnea;")
    private class716[] field4264;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field4272 = 0;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "J")
    public static volatile long field4279 = 0L;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lha;")
    private class60 field4265;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Z")
    private boolean field4263;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1933(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field4268++;
            return class171.method1184((byte) 124, arg1, arg0) | (arg0 & 0x70000) != 0 || class589.method3348(arg1, 110, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III[FIII)V")
    public static final void method1934(int arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6) {
        if (arg2 != -20169) {
            field4272 = 37;
        }
        field4275++;
        if (arg6 > 0 && !class54.method400(5533, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class54.method400(5533, arg4)) {
            int var7 = class686.method3854(arg1, arg2 + 20169);
            int var8 = 0;
            int var9 = arg6 < arg4 ? arg6 : arg4;
            int var10 = arg6 >> 1;
            int var11 = arg4 >> 1;
            float[] var12 = arg3;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg5, var8, arg0, arg6, arg4, 0, arg1, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg6 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg6 = var10;
                arg4 = var11;
                var8++;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
    public final void method1935(int arg0, boolean arg1) {
        if (arg0 >= -51) {
            return;
        }
        field4276++;
        boolean var3 = true;
        class716[] var4 = this.field4264;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class716 var6 = var4[var5];
            if (var6 != null) {
                var6.method368(var3 || this.field4263, (byte) -113);
            }
        }
        this.field4263 = false;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)I")
    public final int method1936(int arg0) {
        field4277++;
        return arg0 < 28 ? -28 : this.field4270.field9563;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ)Z")
    public final boolean method1937(int arg0, long arg1) {
        field4273++;
        if (arg0 < 74) {
            method1934(102, -74, -104, null, 23, -128, 38);
        }
        return ((long) this.field4270.field9565 + arg1) <= class446.method2525(500);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public final void method1938(int arg0) {
        field4269++;
        if (class386.field4930 != this.field4265) {
            this.field4265 = class386.field4930;
            this.field4263 = true;
        }
        this.field4265.method462(0);
        if (arg0 > -124) {
            this.method1941(70);
        }
        class716[] var2 = this.field4264;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class716 var4 = var2[var3];
            if (var4 != null) {
                var4.method366(18295);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)I")
    public final int method1939(int arg0) {
        field4267++;
        int var2 = 0;
        class716[] var3 = this.field4264;
        int var4 = 0;
        if (arg0 < 99) {
            this.field4263 = false;
        }
        while (var3.length > var4) {
            class716 var5 = var3[var4];
            if (var5 == null || var5.method369(11107)) {
                var2++;
            }
            var4++;
        }
        return var2 * 100 / this.field4264.length;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[Lria;Z)V")
    public static final void method1940(int arg0, class288[] arg1, boolean arg2) {
        if (arg2) {
            method1934(-125, 6, -104, null, -52, 40, 99);
        }
        field4278++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class288 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field3655 == 0) {
                    if (var4.field3779 != null) {
                        method1940(arg0, var4.field3779, false);
                    }
                    class491 var5 = (class491) class290.field3804.method1160((long) var4.field3696, 120);
                    if (var5 != null) {
                        class1.method1(arg0, var5.field6978, (byte) 13);
                    }
                }
                if (arg0 == 0 && var4.field3622 != null) {
                    class694 var6 = new class694();
                    var6.field9635 = var4;
                    var6.field9645 = var4.field3622;
                    class188.method1262(var6);
                }
                if (arg0 == 1 && var4.field3706 != null) {
                    if (var4.field3740 >= 0) {
                        class288 var7 = class501.method2936(-114, var4.field3696);
                        if (var7 == null || var7.field3779 == null || var4.field3740 >= var7.field3779.length || var7.field3779[var4.field3740] != var4) {
                            continue;
                        }
                    }
                    class694 var8 = new class694();
                    var8.field9635 = var4;
                    var8.field9645 = var4.field3706;
                    class188.method1262(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public final void method1941(int arg0) {
        if (arg0 != 30861) {
            field4272 = -60;
        }
        field4271++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[[BLsa;)V")
    public static final void method1942(int arg0, byte[][] arg1, class207 arg2) {
        field4266++;
        int var3 = class385.field4921.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class201.field2708[var4] >> 8) * 64 - class332.field4232;
                int var7 = (class201.field2708[var4] & 0xFF) * 64 - class447.field5936;
                class14.method102(true);
                arg2.method1340(true, class386.field4930, class526.field7350, var5, var6, var7);
            }
        }
        if (arg0 != -28983) {
            field4272 = 87;
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
    public static final void method1943(int arg0) {
        if (class705.field9777 > 1) {
            class122.field1762 = class676.field9444;
            class705.field9777--;
        }
        field4274++;
        if (class459.field6127) {
            class459.field6127 = false;
            class274.method1614((byte) 83);
            return;
        }
        if (!class14.field276) {
            class193.method1291(0);
        }
        for (int var1 = 0; var1 < 100 && class717.method4010((byte) 119); var1++) {
        }
        if (class27.field484 != 10) {
            return;
        }
        while (class225.method1449(0)) {
            class589 var2 = class514.method2994(-29488, class760.field10605, class299.field3930);
            var2.field8251.method2578(0, -1221492240);
            int var3 = var2.field8251.field6193;
            class349.method2049(-17, var2.field8251);
            var2.field8251.method2581(-1, var2.field8251.field6193 - var3);
            class737.method4107(var2, 7);
        }
        if (class176.field2459 == null) {
            if (class446.method2525(500) >= class643.field8911) {
                class176.field2459 = class140.field1993.method1782(class292.field3842.field1938, false);
            }
        } else if (class176.field2459.field1987 != -1) {
            class589 var4 = class514.method2994(-29488, class760.field10605, class618.field8525);
            var4.field8251.method2620(class176.field2459.field1987, false);
            class737.method4107(var4, 7);
            class176.field2459 = null;
            class643.field8911 = class446.method2525(500) + 30000L;
        }
        class614 var5 = (class614) class235.field3065.method3672(-1);
        if (var5 != null || class171.field2368 < (class446.method2525(500) - 2000L)) {
            class589 var6 = null;
            int var7 = 0;
            for (class614 var8 = (class614) class239.field3101.method3672(-1); var8 != null && (var6 == null || var6.field8251.field6193 - var7 < 240); var8 = (class614) class239.field3101.method3662(-1)) {
                var8.method1175(-2);
                int var9 = var8.method1425((byte) -75);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1428(1212);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class312.field4090 != var10 || class552.field7715 != var9) {
                    if (var6 == null) {
                        class536.field7428++;
                        var6 = class514.method2994(-29488, class760.field10605, class594.field8297);
                        var6.field8251.method2578(0, -1221492240);
                        var7 = var6.field8251.field6193;
                    }
                    int var11 = var10 - class312.field4090;
                    class312.field4090 = var10;
                    int var12 = var9 - class552.field7715;
                    class552.field7715 = var9;
                    int var13 = (int) ((var8.method1427(32) - class171.field2368) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field8251.method2620((var13 << 12) + (var11 << 6) + var12, false);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var6.field8251.method2578(var13 + 128, -1221492240);
                        var12 += 128;
                        var6.field8251.method2620((var11 << 8) + var12, false);
                    } else if (var13 < 32) {
                        var6.field8251.method2578(var13 + 192, -1221492240);
                        if (var10 == 1 || var9 == -1) {
                            var6.field8251.method2568(Integer.MIN_VALUE, -535701016);
                        } else {
                            var6.field8251.method2568(var10 | var9 << 16, -535701016);
                        }
                    } else {
                        var6.field8251.method2620(var13 + 57344, false);
                        if (var10 == 1 || var9 == -1) {
                            var6.field8251.method2568(Integer.MIN_VALUE, -535701016);
                        } else {
                            var6.field8251.method2568(var9 << 16 | var10, -535701016);
                        }
                    }
                    class171.field2368 = var8.method1427(32);
                }
            }
            if (var6 != null) {
                var6.field8251.method2581(-1, var6.field8251.field6193 - var7);
                class737.method4107(var6, 7);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1427(32) - class740.field10332) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class740.field10332 = var5.method1427(32);
            int var16 = var5.method1425((byte) 127);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1428(1212);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1426(1600925004) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class76.field1070++;
            class589 var20 = class514.method2994(-29488, class760.field10605, class281.field3546);
            var20.field8251.method2624(-122, var19 | var18 << 15);
            var20.field8251.method2598(var17 | var16 << 16, (byte) 116);
            class737.method4107(var20, 7);
        }
        if (class383.field4860 > 0) {
            class195.field2665++;
            class589 var21 = class514.method2994(-29488, class760.field10605, class365.field4709);
            var21.field8251.method2578(class383.field4860 * 3, -1221492240);
            for (int var22 = 0; var22 < class383.field4860; var22++) {
                class704 var23 = class293.field3861[var22];
                long var24 = (var23.method2110(88) - class24.field441) / 50L;
                class24.field441 = var23.method2110(52);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field8251.method2578(var23.method2108((byte) 109), -1221492240);
                var21.field8251.method2620((int) var24, false);
            }
            class737.method4107(var21, 7);
        }
        if (class498.field7010 > 0) {
            class498.field7010--;
        }
        if (class366.field4718 && class498.field7010 <= 0) {
            class284.field3582++;
            class498.field7010 = 20;
            class366.field4718 = false;
            class589 var26 = class514.method2994(-29488, class760.field10605, class742.field10354);
            var26.field8251.method2630(83, (int) class101.field1404 >> 3);
            var26.field8251.method2611((int) class521.field7309 >> 3, (byte) -37);
            class737.method4107(var26, 7);
        }
        if (class498.field7020 != class430.field5752) {
            class498.field7020 = class430.field5752;
            class8.field85++;
            class589 var27 = class514.method2994(-29488, class760.field10605, class25.field464);
            var27.field8251.method2578(class430.field5752 ? 1 : 0, -1221492240);
            class737.method4107(var27, 7);
        }
        if (!class332.field4236) {
            class698.field9712++;
            class589 var28 = class514.method2994(-29488, class760.field10605, class296.field3905);
            var28.field8251.method2578(0, -1221492240);
            int var29 = var28.field8251.field6193;
            class461 var30 = class748.field10451.method4144(24);
            var28.field8251.method2614(3, 0, var30.field6180, var30.field6193);
            var28.field8251.method2581(-1, var28.field8251.field6193 - var29);
            class737.method4107(var28, 7);
            class332.field4236 = true;
        }
        if (class197.field2689 != null) {
            if (class650.field9023 == 2) {
                class278.method1645(16384);
            } else if (class650.field9023 == 3) {
                class491.method2899((byte) -104);
            }
        }
        if (class647.field8963) {
            class647.field8963 = false;
        } else {
            class631.field8710 /= 2.0F;
        }
        if (class623.field8573) {
            class623.field8573 = false;
        } else {
            class749.field10471 /= 2.0F;
        }
        class638.method3576(28805);
        if (class27.field484 != 10) {
            return;
        }
        class562.method3243(98);
        class26.method181(16);
        class681.method3836(59);
        class661.field9200++;
        if (class661.field9200 > 750) {
            class274.method1614((byte) 83);
            return;
        }
        class23.method160(false);
        class263.method1578(1537192584);
        class709.method3969((byte) -128);
        for (int var31 = class516.field7236.method2278(true, (byte) -123); var31 != -1; var31 = class516.field7236.method2278(false, (byte) -109)) {
            class553.method3206(var31, false);
            class556.field7733[class702.method3949(31, class510.field7185++)] = var31;
        }
        for (class37 var32 = class362.method2096(0); var32 != null; var32 = class362.method2096(0)) {
            int var33 = var32.method229(255);
            int var34 = var32.method231(-21314);
            if (var33 == 1) {
                class564.field7931[var34] = var32.field579;
                class473.field6353 |= class133.field1924[var34];
                class368.field4757[class702.method3949(class58.field803++, 31)] = var34;
            } else if (var33 == 2) {
                class629.field8664[var34] = var32.field578;
                class386.field4931[class702.method3949(class739.field10315++, 31)] = var34;
            } else if (var33 == 3) {
                class288 var58 = class501.method2936(-117, var34);
                if (!var32.field578.equals(var58.field3732)) {
                    var58.field3732 = var32.field578;
                    class207.method1332((byte) -109, var58);
                }
            } else if (var33 == 4) {
                class288 var35 = class501.method2936(-65, var34);
                int var36 = var32.field579;
                int var37 = var32.field582;
                int var38 = var32.field585;
                if (var35.field3689 != var36 || var35.field3755 != var37 || var35.field3668 != var38) {
                    var35.field3755 = var37;
                    var35.field3668 = var38;
                    var35.field3689 = var36;
                    class207.method1332((byte) -104, var35);
                }
            } else if (var33 == 5) {
                class288 var56 = class501.method2936(-76, var34);
                if (var32.field579 != var56.field3648 || var32.field579 == -1) {
                    var56.field3748 = 0;
                    var56.field3776 = 0;
                    var56.field3648 = var32.field579;
                    var56.field3616 = 1;
                    class56 var57 = var56.field3648 == -1 ? null : class66.field941.method1299((byte) -92, var56.field3648);
                    if (var57 != null) {
                        class484.method2857(true, var57, var56.field3776);
                    }
                    class207.method1332((byte) -114, var56);
                }
            } else if (var33 == 6) {
                int var39 = var32.field579;
                int var40 = var39 >> 10 & 0x1F;
                int var41 = (var39 & 0x3E6) >> 5;
                int var42 = var39 & 0x1F;
                int var43 = (var42 << 3) + ((var40 << 19) + (var41 << 11));
                class288 var44 = class501.method2936(-83, var34);
                if (var44.field3671 != var43) {
                    var44.field3671 = var43;
                    class207.method1332((byte) -89, var44);
                }
            } else if (var33 == 7) {
                class288 var45 = class501.method2936(-53, var34);
                boolean var46 = var32.field579 == 1;
                if (var46 != var45.field3637) {
                    var45.field3637 = var46;
                    class207.method1332((byte) -119, var45);
                }
            } else if (var33 == 8) {
                class288 var55 = class501.method2936(-104, var34);
                if (var32.field579 != var55.field3765 || var32.field582 != var55.field3708 || var32.field585 != var55.field3693) {
                    var55.field3693 = var32.field585;
                    var55.field3708 = var32.field582;
                    var55.field3765 = var32.field579;
                    if (var55.field3700 != -1) {
                        if (var55.field3680 > 0) {
                            var55.field3693 = var55.field3693 * 32 / var55.field3680;
                        } else if (var55.field3660 > 0) {
                            var55.field3693 = var55.field3693 * 32 / var55.field3660;
                        }
                    }
                    class207.method1332((byte) -101, var55);
                }
            } else if (var33 == 9) {
                class288 var54 = class501.method2936(-81, var34);
                if (var32.field579 != var54.field3700 || var32.field582 != var54.field3643) {
                    var54.field3700 = var32.field579;
                    var54.field3643 = var32.field582;
                    class207.method1332((byte) -123, var54);
                }
            } else if (var33 == 10) {
                class288 var53 = class501.method2936(-72, var34);
                if (var32.field579 != var53.field3722 || var32.field582 != var53.field3659 || var32.field585 != var53.field3657) {
                    var53.field3722 = var32.field579;
                    var53.field3657 = var32.field585;
                    var53.field3659 = var32.field582;
                    class207.method1332((byte) -96, var53);
                }
            } else if (var33 == 11) {
                class288 var52 = class501.method2936(-55, var34);
                var52.field3635 = var52.field3683 = var32.field579;
                var52.field3687 = var52.field3642 = var32.field582;
                var52.field3697 = 0;
                var52.field3640 = 0;
                class207.method1332((byte) -84, var52);
            } else if (var33 == 12) {
                class288 var50 = class501.method2936(-119, var34);
                int var51 = var32.field579;
                if (var50 != null && var50.field3655 == 0) {
                    if (var51 > var50.field3656 - var50.field3714) {
                        var51 = var50.field3656 - var50.field3714;
                    }
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (var50.field3737 != var51) {
                        var50.field3737 = var51;
                        class207.method1332((byte) -94, var50);
                    }
                }
            } else if (var33 == 14) {
                class288 var49 = class501.method2936(-127, var34);
                var49.field3676 = var32.field579;
            } else if (var33 == 15) {
                class366.field4727 = var32.field582;
                class755.field10539 = var32.field579;
                class526.field7347 = true;
            } else if (var33 == 16) {
                class288 var48 = class501.method2936(-85, var34);
                var48.field3626 = var32.field579;
            } else if (var33 == 17) {
                class288 var47 = class501.method2936(-62, var34);
                var47.field3670 = var32.field579;
            }
        }
        if (class717.field9983 != 0) {
            class211.field2793 += 20;
            if (class211.field2793 >= 400) {
                class717.field9983 = 0;
            }
        }
        class602.field8367++;
        if (class533.field7392 != null) {
            class516.field7234++;
            if (class516.field7234 >= 15) {
                class207.method1332((byte) -114, class533.field7392);
                class533.field7392 = null;
            }
        }
        class270.field3398 = false;
        class190.field2623 = null;
        class100.field1390 = false;
        class232.field3042 = null;
        class326.method1901(null, -1, -1, -1);
        class682.method3837(-200, null, -1, -1);
        if (!class8.field103) {
            class740.field10331 = -1;
        }
        class478.method2754(127);
        class676.field9444++;
        if (class134.field1940) {
            class375.field4802++;
            class589 var59 = class514.method2994(-29488, class760.field10605, class590.field8273);
            var59.field8251.method2568(class207.field2747 << 28 | class736.field10230 << 14 | class164.field2274, -535701016);
            class737.method4107(var59, 7);
            class134.field1940 = false;
        }
        while (true) {
            class694 var60;
            class288 var61;
            class288 var62;
            do {
                var60 = (class694) class367.field4733.method3665(23290);
                if (var60 == null) {
                    while (true) {
                        class694 var63;
                        class288 var64;
                        class288 var65;
                        do {
                            var63 = (class694) class600.field8356.method3665(23290);
                            if (var63 == null) {
                                while (true) {
                                    class694 var66;
                                    class288 var67;
                                    class288 var68;
                                    do {
                                        var66 = (class694) class129.field1834.method3665(23290);
                                        if (var66 == null) {
                                            if (class190.field2623 == null) {
                                                class721.field10038 = 0;
                                            }
                                            if (class617.field8508 != null) {
                                                class630.method3542((byte) -86);
                                            }
                                            if (class683.field9525 > 0 && class349.field4502.method207(82, 20541) && class349.field4502.method207(81, 20541) && class688.field9584 != 0) {
                                                int var69 = class380.field4847.field5796 - class688.field9584;
                                                if (var69 < 0) {
                                                    var69 = 0;
                                                } else if (var69 > 3) {
                                                    var69 = 3;
                                                }
                                                class415.method2330(class380.field4847.field260[0] + class447.field5936, class380.field4847.field264[0] + class332.field4232, var69, 108078022);
                                            }
                                            class255.method1556(true);
                                            for (int var70 = 0; var70 < 5; var70++) {
                                                int var10002 = class227.field3011[var70]++;
                                            }
                                            if (class473.field6353 && (class446.method2525(500) - 60000L) > class412.field5244) {
                                                class548.method3187(true);
                                            }
                                            for (class421 var71 = (class421) class372.field4776.method162(-22305); var71 != null; var71 = (class421) class372.field4776.method158(false)) {
                                                if ((class446.method2525(500) / 1000L - 5L) > ((long) var71.field5349)) {
                                                    if (var71.field5350 > 0) {
                                                        class64.method588(1699767752, var71.field5353 + class454.field6022.method2547(-79, class243.field3143), 0, "", "", 5, "");
                                                    }
                                                    if (var71.field5350 == 0) {
                                                        class64.method588(1699767752, var71.field5353 + class454.field6023.method2547(-69, class243.field3143), 0, "", "", 5, "");
                                                    }
                                                    var71.method3835(0);
                                                }
                                            }
                                            class470.field6295++;
                                            if (class470.field6295 > 500) {
                                                class470.field6295 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x2) == 2) {
                                                    class403.field5104 += class101.field1402;
                                                }
                                                if ((var72 & 0x4) == 4) {
                                                    class216.field2926 += class505.field7119;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class277.field3485 += class477.field6468;
                                                }
                                            }
                                            if (class277.field3485 < -50) {
                                                class477.field6468 = 2;
                                            }
                                            if (class277.field3485 > 50) {
                                                class477.field6468 = -2;
                                            }
                                            if (class403.field5104 < -55) {
                                                class101.field1402 = 2;
                                            }
                                            if (class403.field5104 > 55) {
                                                class101.field1402 = -2;
                                            }
                                            if (class216.field2926 < -40) {
                                                class505.field7119 = 1;
                                            }
                                            if (arg0 <= 86) {
                                                method1934(35, -61, -55, null, 122, 108, 109);
                                            }
                                            class298.field3919++;
                                            if (class216.field2926 > 40) {
                                                class505.field7119 = -1;
                                            }
                                            if (class298.field3919 > 500) {
                                                class298.field3919 = 0;
                                                int var73 = (int) (Math.random() * 8.0D);
                                                if ((var73 & 0x1) == 1) {
                                                    class683.field9519 += class274.field3447;
                                                }
                                                if ((var73 & 0x2) == 2) {
                                                    class127.field1815 += class112.field1618;
                                                }
                                            }
                                            if (class683.field9519 < -60) {
                                                class274.field3447 = 2;
                                            }
                                            if (class683.field9519 > 60) {
                                                class274.field3447 = -2;
                                            }
                                            if (class127.field1815 < -20) {
                                                class112.field1618 = 1;
                                            }
                                            if (class127.field1815 > 10) {
                                                class112.field1618 = -1;
                                            }
                                            class688.field9586++;
                                            if (class688.field9586 > 50) {
                                                class367.field4729++;
                                                class589 var74 = class514.method2994(-29488, class760.field10605, class393.field4991);
                                                class737.method4107(var74, 7);
                                            }
                                            if (class652.field9071) {
                                                class25.method176(3);
                                                class652.field9071 = false;
                                            }
                                            try {
                                                class402.method2242((byte) 18);
                                                return;
                                            } catch (IOException var75) {
                                                class274.method1614((byte) 83);
                                                return;
                                            }
                                        }
                                        var67 = var66.field9635;
                                        if (var67.field3740 < 0) {
                                            break;
                                        }
                                        var68 = class501.method2936(-115, var67.field3743);
                                    } while (var68 == null || var68.field3779 == null || var68.field3779.length <= var67.field3740 || var68.field3779[var67.field3740] != var67);
                                    class188.method1262(var66);
                                }
                            }
                            var64 = var63.field9635;
                            if (var64.field3740 < 0) {
                                break;
                            }
                            var65 = class501.method2936(-123, var64.field3743);
                        } while (var65 == null || var65.field3779 == null || var65.field3779.length <= var64.field3740 || var65.field3779[var64.field3740] != var64);
                        class188.method1262(var63);
                    }
                }
                var61 = var60.field9635;
                if (var61.field3740 < 0) {
                    break;
                }
                var62 = class501.method2936(-86, var61.field3743);
            } while (var62 == null || var62.field3779 == null || var62.field3779.length <= var61.field3740 || var62.field3779[var61.field3740] != var61);
            class188.method1262(var60);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Ljca;Ler;)V")
    public class337(class686 arg0, class109 arg1) {
        this.field4270 = arg0;
        this.field4264 = new class716[this.field4270.field9559.length];
        for (int var3 = 0; var3 < this.field4264.length; var3++) {
            this.field4264[var3] = arg1.method875(this.field4270.field9559[var3], -21576);
        }
    }
}
