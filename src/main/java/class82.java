import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class82 extends class56 {

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Lre;")
    private class222 field1096;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "Lgs;")
    private class288 field1101;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZBI)V", line = 3)
    public static final void method525(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        ++field1100;
        if (class380.field5802 == null) {
            class337.field5242.method2952(arg0, arg1, arg5, -16777216, (byte) -53, arg2);
        } else if (class339.field5365.field2217 >= 0 && class96.field1403 * 128 > class339.field5365.field2217 && ~class339.field5365.field2215 <= -1 && class485.field7122 * 128 > class339.field5365.field2215) {
            ++class527.field7787;
            if (class339.field5365 != null && ~(class339.field5365.field2217 - 64 * class339.field5365.method2091(-15245) + 64 >> 7) == ~class112.field1573 && class339.field5365.field2215 - 64 * (-1 + class339.field5365.method2091(-15245)) >> 7 == class479.field7009) {
                class479.field7009 = -1;
                class112.field1573 = -1;
                class515.method3063((byte) -63);
            }
            class100.method675((byte) 65);
            if (!arg3) {
                class254.method1657(-14179);
            }
            class389.method2402(0);
            class282.method1767(arg1, true, -16777216, arg0, arg2, arg5);
            int var6 = class290.field4312;
            int var7 = class493.field7198;
            int var8 = class130.field1908;
            int var9 = class99.field1429;
            if (class432.field6409 != 1) {
                if (~class432.field6409 != -5) {
                    if (~class432.field6409 == -6) {
                        class183.method1302(var9, arg4 + -19114);
                    }
                } else {
                    int var10 = (int) class99.field1428;
                    if (class389.field5905 >> 8 > var10) {
                        var10 = class389.field5905 >> 8;
                    }
                    if (class185.field2614[4] && ~var10 > ~(class435.field6470[4] + 128)) {
                        var10 = class435.field6470[4] + 128;
                    }
                    int var11 = 16383 & (int) class482.field7022;
                    class313.method2036(var10, class205.field2896, 16383, var11, var9, (var10 >> 3) * 3 + 600 << 0, class165.field2409, -50 + class500.method2985(class274.field3815, 5293, class195.field2770, class209.field2963));
                }
            } else {
                int var12 = (int) class99.field1428;
                if (~var12 > ~(class389.field5905 >> 8)) {
                    var12 = class389.field5905 >> 8;
                }
                if (class185.field2614[4] && ~(class435.field6470[4] + 128) < ~var12) {
                    var12 = class435.field6470[4] + 128;
                }
                int var13 = 16383 & (int) class482.field7022 + class498.field7281;
                class313.method2036(var12, class205.field2896, arg4 ^ -16294, var13, var9, (var12 >> 3) * 3 + 600 << 0, class165.field2409, class500.method2985(class339.field5365.field2217, 5293, class195.field2770, class339.field5365.field2215) + -50);
            }
            if (arg4 != -91) {
                method526(-8, 126, 28);
            }
            int var14 = class34.field539;
            int var15 = class154.field2246;
            int var16 = class301.field4447;
            int var17 = class353.field5478;
            int var18 = class30.field461;
            for (int var19 = 0; ~var19 > -6; ++var19) {
                if (class185.field2614[var19]) {
                    int var22 = (int) ((double) (-class374.field5733[var19]) + (double) (class374.field5733[var19] * 2 - -1) * Math.random() + Math.sin((double) class480.field7012[var19] / 100.0D * (double) class395.field6004[var19]) * (double) class435.field6470[var19]);
                    if (~var19 == -1) {
                        class34.field539 += var22;
                    }
                    if (var19 == 3) {
                        class30.field461 = 16383 & class30.field461 - -var22;
                    }
                    if (~var19 == -5) {
                        class353.field5478 += var22;
                        if (class353.field5478 >= 1024) {
                            if (~class353.field5478 < -3073) {
                                class353.field5478 = 3072;
                            }
                        } else {
                            class353.field5478 = 1024;
                        }
                    }
                    if (var19 == 2) {
                        class301.field4447 += var22;
                    }
                    if (var19 == 1) {
                        class154.field2246 += var22;
                    }
                }
            }
            if (class34.field539 < 0) {
                class34.field539 = 0;
            }
            if (~class301.field4447 > -1) {
                class301.field4447 = 0;
            }
            if ((class492.field7186 << 7) + -1 < class34.field539) {
                class34.field539 = (class492.field7186 << 7) + -1;
            }
            if (~((class285.field4248 << 7) + -1) > ~class301.field4447) {
                class301.field4447 = (class285.field4248 << 7) + -1;
            }
            class410.method2493((byte) -29);
            class281.method1761(0);
            class337.field5242.method1046(var6, var7, var6 + var8, var7 + var9);
            class337.field5242.method1066();
            int var20 = class197.field2783;
            if (class429.field6384 == null) {
                class337.field5242.method1053(var20);
            } else {
                class429.field6384.method3121(class30.field461, var8, class353.field5478, var20, var7, class337.field5242, var9, class21.field336 << 3, arg4 + -36, var6);
            }
            class300.method1929((byte) -4);
            class245.field3425.method184(class34.field539, class154.field2246, class301.field4447, -class353.field5478 & 16383, 16383 & -class30.field461, -class522.field7715 & 16383);
            class337.field5242.method1064(class245.field3425);
            class337.field5242.method1127(var8 / 2 + var6, var9 / 2 + var7, class57.field763 << 1, class57.field763 << 1);
            class20.method162(var8 / 2 + var6, class57.field763 << 1, class57.field763 << 1, (byte) -114, var7 - -(var9 / 2));
            class437.method2614(-class30.field461 & 16383, class301.field4447, -class522.field7715 & 16383, 13265, -class353.field5478 & 16383, class154.field2246, class34.field539);
            byte var21 = ~class96.field1399.method1738(arg4 + -6, class441.field6563) != -3 ? 1 : (byte) class527.field7787;
            class4.method43(class337.field5242, class405.field6116, class505.field7541, class245.field3425, class34.field539, class154.field2246, class301.field4447, class307.field4504, class66.field915, class415.field6220, class205.field2898, class344.field5392, class34.field538, class339.field5365.field2210 - -1, var21, class339.field5365.field2217 >> 7, class339.field5365.field2215 >> 7, !class96.field1399.field5208);
            class300.method1929((byte) -4);
            if (~class144.field2077 == -31) {
                class190.method1330(121, var6, 256, var7, var8, 256, var9);
                class530.method3132(2, 256, var8, 256, var7, var6, var9);
                class86.method557(var9, 256, var8, var7, 256, 14748, var6);
                class220.method1487(var6, var7, var8, var9, true);
            }
            class466.method2782();
            class154.field2246 = var15;
            class34.field539 = var14;
            class301.field4447 = var16;
            class353.field5478 = var17;
            class30.field461 = var18;
            if (class95.field1394 && ~class514.field7617.method2257(arg4 + 170) == -1) {
                class95.field1394 = false;
            }
            if (class95.field1394) {
                class337.field5242.method2952(var8, var9, var6, -16777216, (byte) -53, var7);
                class252.method1645(class84.field1153, (byte) 31, class107.field1512.method2335((byte) -100, class288.field4292), false);
            }
        } else {
            class337.field5242.method2952(arg0, arg1, arg5, -16777216, (byte) -53, arg2);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)V", line = 193)
    public final void method380(boolean arg0, int arg1) {
        if (arg1 <= 42) {
            this.field1096 = null;
        }
        ++field1093;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(ZI)V", line = 203)
    public final void method383(boolean arg0, int arg1) {
        this.field1101.method1866(13, '\u0000');
        ++field1110;
        if (arg1 > -77) {
            method525(120, -26, 109, false, (byte) -91, -68);
        }
        if (this.field1096.field3106) {
            super.field752.method1819(1, (byte) 97);
            super.field752.method1787(this.field1096.field3110, (byte) 121);
            super.field752.method1819(0, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V", line = 222)
    public static final void method526(int arg0, int arg1, int arg2) {
        ++field1094;
        int var3 = 49 / ((arg0 - -59) / 36);
        class141 var4 = new class141(16);
        for (class481 var5 = (class481) class392.field5964.method948(51); var5 != null; var5 = (class481) class392.field5964.method938(-78)) {
            var5.method2785((byte) -120);
            int var6 = (int) (var5.field6799 >> 28);
            int var7 = -arg2 + (int) (16383L & var5.field6799 >> 14);
            int var8 = (int) (var5.field6799 & 16383L) + -arg1;
            if (~var8 <= -1 && ~var7 <= -1 && ~class96.field1403 < ~var8 && ~class485.field7122 < ~var7) {
                var4.method940((long) (var8 | var6 << 28 | var7 << 14), -60, var5);
            }
        }
        class392.field5964 = var4;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Lpj;", line = 255)
    public static final class507 method527(int arg0, int arg1) {
        if (arg1 != 1761171873) {
            method526(25, 100, -66);
        }
        ++field1108;
        class380[] var2 = class349.field5436;
        synchronized (class349.field5436) {
            class507 var3;
            if (class349.field5436.length > arg0 && !class349.field5436[arg0].method2359(true)) {
                var3 = (class507) class349.field5436[arg0].method2360(-117);
                var3.method142(0);
                int var10002 = class190.field2659[arg0]--;
            } else {
                var3 = new class507();
                var3.field7549 = new class159[arg0];
                for (int var4 = 0; ~arg0 < ~var4; ++var4) {
                    var3.field7549[var4] = new class159();
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lbv;Lre;)V", line = 291)
    public class82(class282 arg0, class222 arg1) {
        super(arg0);
        this.field1096 = arg1;
        this.field1101 = new class288(arg0, 2);
        this.field1101.method1864((byte) 77, 0);
        super.field752.method1819(1, (byte) 95);
        if (this.field1096.field3106) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field752.method1819(0, (byte) 94);
        this.field1101.method1865(-35);
        this.field1101.method1864((byte) 114, 1);
        super.field752.method1819(1, (byte) 116);
        if (this.field1096.field3106) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field752.method1819(0, (byte) 96);
        this.field1101.method1865(126);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 327)
    public final void method381(int arg0) {
        ++field1098;
        this.field1101.method1866(13, '\u0001');
        if (arg0 <= -50) {
            super.field752.method1819(1, (byte) 98);
            super.field752.method1787((class14) null, (byte) 121);
            super.field752.method1819(0, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILic;)Ljava/lang/String;", line = 341)
    public static final String method528(int arg0, class32 arg1) {
        ++field1109;
        int var2 = -78 % ((arg0 - -7) / 47);
        return arg1.field494 != null && ~arg1.field494.length() < -1 ? arg1.field492 + class158.field2313.method2335((byte) -100, class288.field4292) + arg1.field494 : arg1.field492;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V", line = 355)
    public final void method382(int arg0, int arg1, int arg2) {
        ++field1103;
        float var4 = (float) ((3 & arg1) + 1) * -5.0E-4F;
        float var5 = (float) (((arg1 & 28) >> 3) - -1) * 5.0E-4F;
        float var6 = ~(arg1 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = (arg1 & 128) != 0;
        super.field752.method1819(1, (byte) 115);
        if (var7) {
            class306.field4492[0] = var6;
            class306.field4492[3] = 0.0F;
            class306.field4492[1] = 0.0F;
            class306.field4492[2] = 0.0F;
        } else {
            class306.field4492[2] = var6;
            class306.field4492[0] = 0.0F;
            class306.field4492[3] = 0.0F;
            class306.field4492[1] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class306.field4492, arg2);
        class306.field4492[2] = 0.0F;
        class306.field4492[0] = 0.0F;
        class306.field4492[1] = var6;
        class306.field4492[3] = (float) super.field752.field4086 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class306.field4492, 0);
        if (!this.field1096.field3106) {
            int var8 = (int) ((float) super.field752.field4086 * var5 * 16.0F);
            super.field752.method1787(this.field1096.field3109[var8 % 16], (byte) 121);
        } else {
            class306.field4492[3] = (float) super.field752.field4086 * var5 % 1.0F;
            class306.field4492[1] = 0.0F;
            class306.field4492[2] = 0.0F;
            class306.field4492[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class306.field4492, 0);
        }
        super.field752.method1819(0, (byte) 103);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z", line = 408)
    public final boolean method377(byte arg0) {
        ++field1102;
        if (arg0 > -8) {
            this.field1096 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V", line = 422)
    public static final void method529(int arg0, boolean arg1) {
        ++field1104;
        class377 var2 = class99.method672(arg0, false, 12);
        var2.method2339(-11688);
        if (!arg1) {
            method525(-4, -30, 61, true, (byte) -112, 24);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZIIZ)I", line = 439)
    public static final int method530(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        ++field1097;
        class410 var5 = class261.method1684(arg2, 25, arg1);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            for (int var7 = 0; ~var7 > ~var5.field6169.length; ++var7) {
                if (var5.field6169[var7] >= 0 && ~var5.field6169[var7] > ~class84.field1154.field6053) {
                    class61 var8 = class84.field1154.method2451(-1, var5.field6169[var7]);
                    int var9 = var8.method416(-16777215, class209.field2960.method3083(arg3, 103).field1532, arg3);
                    if (arg4) {
                        var6 += var5.field6166[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            if (arg0 != 1194896931) {
                method526(-48, 24, -106);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljb;I)V", line = 484)
    public static final void method531(class499 arg0, int arg1) {
        ++field1099;
        if (arg1 >= -28) {
            field1106 = -107;
        }
        if (arg0.field7355 == 5 && arg0.field7310 != -1) {
            class91.method592((byte) -95, arg0, class337.field5242);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILkv;)V", line = 499)
    public final void method379(int arg0, int arg1, class14 arg2) {
        int var4 = 55 % ((arg1 - 81) / 39);
        super.field752.method1787(arg2, (byte) 121);
        ++field1107;
        super.field752.method1794(arg0, 110);
    }
}
