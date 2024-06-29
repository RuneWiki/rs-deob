import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class81 extends class220 {

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    private int field1129 = 12288;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "I")
    private int field1139 = 2048;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
    private int field1134 = 0;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
    private int field1135 = 0;

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
    private int field1142 = 8192;

    @OriginalMember(owner = "client!nh", name = "ib", descriptor = "I")
    private int field1147 = 4096;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    private int field1128 = 2048;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    public static int field1138 = 0;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "J")
    public static long field1131 = 0L;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!nh", name = "fb", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!nh", name = "gb", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!nh", name = "hb", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!nh", name = "jb", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "Lao;")
    public static class116 field1136;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V", line = 5)
    public static void method511(int arg0) {
        if (arg0 <= 74) {
            field1138 = -27;
        }
        field1136 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)Z", line = 22)
    private final boolean method512(int arg0, int arg1, boolean arg2) {
        ++field1133;
        int var4 = (arg0 - arg1) * this.field1129 >> 12;
        int var5 = class30.field520[(1044847 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field1129;
        int var7 = (var6 << 12) / this.field1142;
        if (!arg2) {
            method511(82);
        }
        int var8 = this.field1147 * var7 >> 12;
        return ~(arg1 - -arg0) > ~var8 && ~(-var8) > ~(arg0 + arg1);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 114)
    public class81() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)[I", line = 43)
    public final int[] method43(int arg0, int arg1) {
        ++field1137;
        int[] var3 = super.field3125.method2005(arg1, (byte) -69);
        if (super.field3125.field4676) {
            int var4 = class58.field831[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class344.field5043; ++var5) {
                int var6 = class160.field2096[var5] - 2048;
                int var7 = this.field1128 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 - -4096;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = var4 - -this.field1135;
                int var11 = ~var10 > 2047 ? var10 - -4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = var6 - -this.field1134;
                int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = this.field1139 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method512(var12, var9, true) && !this.method513(-80, var15, var18) ? 0 : 4096;
            }
        }
        return arg0 != -11543 ? null : var3;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)Z", line = 95)
    private final boolean method513(int arg0, int arg1, int arg2) {
        ++field1130;
        int var4 = (arg1 + arg2) * this.field1129 >> 12;
        int var5 = class30.field520[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1129;
        int var7 = (var6 << 12) / this.field1142;
        int var8 = 52 / ((45 - arg0) / 55);
        int var9 = this.field1147 * var7 >> 12;
        return ~(-arg1 + arg2) > ~var9 && arg2 - arg1 > -var9;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V", line = 125)
    public static final void method514(boolean arg0) {
        class372.method2446(class319.field4561, (byte) 2);
        ++field1145;
        class185.method1147(class319.field4561, 1023);
        if (class371.field5514 != null) {
            class371.field5514.method2493(255, class319.field4561);
        }
        class1.field9.method1605(-15896);
        class319.field4561.setBackground(Color.black);
        class312.field4474 = -1;
        class370.method2437(66, class319.field4561);
        class145.method969(-12951, class319.field4561);
        if (!arg0) {
            field1131 = 58L;
        }
        if (class371.field5514 != null) {
            class371.field5514.method2490((byte) -43, class319.field4561);
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V", line = 154)
    public final void method440(int arg0) {
        ++field1148;
        class261.method1638(arg0 + arg0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBLil;)V", line = 180)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        ++field1144;
        if (arg1 != -49) {
            this.method440(-120);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field1142 = arg2.method1685(8104);
                                }
                            } else {
                                this.field1147 = arg2.method1685(arg1 + 8153);
                            }
                        } else {
                            this.field1129 = arg2.method1685(8104);
                        }
                    } else {
                        this.field1139 = arg2.method1685(arg1 + 8153);
                    }
                } else {
                    this.field1134 = arg2.method1685(8104);
                }
            } else {
                this.field1135 = arg2.method1685(8104);
            }
        } else {
            this.field1128 = arg2.method1685(arg1 ^ -8089);
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)V", line = 259)
    public static final void method515(boolean arg0) {
        if (class127.field1688 > 1) {
            class1.field4 = class381.field5717;
            --class127.field1688;
        }
        if (class26.field474 > 0) {
            --class26.field474;
        }
        ++field1143;
        if (class205.field2961) {
            class205.field2961 = false;
            class120.method837(true);
        } else {
            if (!class229.field3230) {
                class235.method1435((byte) 81);
            }
            for (int var1 = 0; var1 < 100 && class176.method1076(9316); ++var1) {
            }
            if (class137.field1815 == 30) {
                class28.method251(-19, class232.field3279, 218);
                Object var2 = class71.field973.field3193;
                synchronized (class71.field973.field3193) {
                    if (!class390.field5847) {
                        class71.field973.field3205 = 0;
                    } else if (class84.field1173 != 0 || class71.field973.field3205 >= 40) {
                        class232.field3279.method756(0, 158);
                        ++class284.field4155;
                        class232.field3279.method1707(-116, 0);
                        int var3 = class232.field3279.field3915;
                        int var4 = 0;
                        for (int var5 = 0; ~var5 > ~class71.field973.field3205 && -var3 + class232.field3279.field3915 < 240; ++var5) {
                            ++var4;
                            int var6 = class71.field973.field3202[var5];
                            if (~var6 <= -1) {
                                if (var6 > 65534) {
                                    var6 = 65534;
                                }
                            } else {
                                var6 = 0;
                            }
                            int var7 = class71.field973.field3203[var5];
                            if (~var7 <= -1) {
                                if (~var7 < -65535) {
                                    var7 = 65534;
                                }
                            } else {
                                var7 = 0;
                            }
                            boolean var8 = false;
                            if (class71.field973.field3202[var5] == -1 && ~class71.field973.field3203[var5] == 0) {
                                var8 = true;
                                var7 = -1;
                                var6 = -1;
                            }
                            if (~class72.field980 == ~var7 && class215.field3083 == var6) {
                                if (~class101.field1364 > -2048) {
                                    ++class101.field1364;
                                }
                            } else {
                                int var9 = -class72.field980 + var7;
                                class72.field980 = var7;
                                int var10 = -class215.field3083 + var6;
                                class215.field3083 = var6;
                                if (~class101.field1364 > -9 && ~var9 <= 31 && ~var9 >= -32 && var10 >= -32 && var10 <= 31) {
                                    var10 += 32;
                                    var9 += 32;
                                    class232.field3279.method1693((class101.field1364 << 12) - -(var9 << 6) + var10, (byte) 111);
                                    class101.field1364 = 0;
                                } else if (~class101.field1364 > -33 && ~var9 <= 127 && var9 <= 127 && var10 >= -128 && ~var10 >= -128) {
                                    class232.field3279.method1707(39, class101.field1364 + 128);
                                    var9 += 128;
                                    var10 += 128;
                                    class232.field3279.method1693((var9 << 8) + var10, (byte) 96);
                                    class101.field1364 = 0;
                                } else if (~class101.field1364 > -33) {
                                    class232.field3279.method1707(-111, class101.field1364 + 192);
                                    if (!var8) {
                                        class232.field3279.method1704(var7 | var6 << 16, (byte) 126);
                                    } else {
                                        class232.field3279.method1704(Integer.MIN_VALUE, (byte) 125);
                                    }
                                    class101.field1364 = 0;
                                } else {
                                    class232.field3279.method1693(57344 - -class101.field1364, (byte) 39);
                                    if (var8) {
                                        class232.field3279.method1704(Integer.MIN_VALUE, (byte) 125);
                                    } else {
                                        class232.field3279.method1704(var7 | var6 << 16, (byte) 127);
                                    }
                                    class101.field1364 = 0;
                                }
                            }
                        }
                        class232.field3279.method1669(-var3 + class232.field3279.field3915, (byte) -42);
                        if (~var4 > ~class71.field973.field3205) {
                            class71.field973.field3205 -= var4;
                            for (int var11 = 0; var11 < class71.field973.field3205; ++var11) {
                                class71.field973.field3203[var11] = class71.field973.field3203[var4 + var11];
                                class71.field973.field3202[var11] = class71.field973.field3202[var4 + var11];
                            }
                        } else {
                            class71.field973.field3205 = 0;
                        }
                    }
                }
                if (class84.field1173 != 0) {
                    long var12 = (-class424.field6304 + field1131) / 50L;
                    class424.field6304 = field1131;
                    if (~var12 < -32768L) {
                        var12 = 32767L;
                    }
                    int var14 = class420.field6256;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > 65535) {
                        var14 = 65535;
                    }
                    int var15 = class242.field3390;
                    if (var15 >= 0) {
                        if (var15 > 65535) {
                            var15 = 65535;
                        }
                    } else {
                        var15 = 0;
                    }
                    byte var16 = 0;
                    if (class84.field1173 == 2) {
                        var16 = 1;
                    }
                    int var17 = (int) var12;
                    class232.field3279.method756(0, 87);
                    ++class226.field3189;
                    class232.field3279.method1670(var16 << 15 | var17, (byte) -115);
                    class232.field3279.method1692(113414280, var15 | var14 << 16);
                }
                if (~class277.field4071 < -1) {
                    --class277.field4071;
                }
                if (class91.field1263 && ~class277.field4071 >= -1) {
                    ++class88.field1232;
                    class277.field4071 = 20;
                    class91.field1263 = false;
                    class232.field3279.method756(0, 235);
                    class232.field3279.method1693((int) class170.field2244 >> 3, (byte) 70);
                    class232.field3279.method1670((int) class155.field2027 >> 3, (byte) -115);
                }
                if (class123.field1648 != arg0 && !class263.field3831) {
                    class263.field3831 = true;
                    ++class169.field2234;
                    class232.field3279.method756(0, 4);
                    class232.field3279.method1707(9, 1);
                }
                if (!class123.field1648 && class263.field3831) {
                    class263.field3831 = false;
                    ++class169.field2234;
                    class232.field3279.method756(0, 4);
                    class232.field3279.method1707(-114, 0);
                }
                if (!class153.field2013) {
                    ++class416.field6194;
                    class232.field3279.method756(0, 41);
                    class232.field3279.method1692(113414280, class145.method968((byte) 59));
                    class153.field2013 = true;
                }
                if (class343.field5032 != null) {
                    if (class5.field48 == 2) {
                        class355.method2331(-2511);
                    } else if (class5.field48 == 3) {
                        class171.method1055((byte) 112);
                    }
                }
                if (!class31.field525) {
                    class128.field1700 /= 2.0F;
                } else {
                    class31.field525 = false;
                }
                if (class222.field3146) {
                    class222.field3146 = false;
                } else {
                    class6.field51 /= 2.0F;
                }
                class227.method1408((byte) -82);
                if (class137.field1815 == 30) {
                    class300.method1895(-3);
                    class130.method887(-39);
                    class252.method1552(121);
                    ++class84.field1166;
                    if (class84.field1166 > 750) {
                        class120.method837(true);
                    } else {
                        class16.method114(-8822);
                        class169.method1051(-7830);
                        class24.method205((byte) -61);
                        for (int var18 = class108.method751(-57, true); ~var18 != 0; var18 = class108.method751(-101, false)) {
                            class413.method2681((byte) 36, var18);
                            class335.field4954[class401.method2606(31, class407.field6102++)] = var18;
                        }
                        for (class256 var19 = class130.method884(true); var19 != null; var19 = class130.method884(true)) {
                            int var20 = var19.method1615(-1255099360);
                            int var21 = var19.method1617((byte) -68);
                            if (var20 == 1) {
                                class320.field4575[var21] = var19.field3756;
                                class329.field4727 |= class87.field1215[var21];
                                class58.field838[class401.method2606(31, class168.field2211++)] = var21;
                            } else if (~var20 == -3) {
                                class174.field2269[var21] = var19.field3753;
                                class53.field794[class401.method2606(class229.field3232++, 31)] = var21;
                            } else if (~var20 != -4) {
                                if (var20 != 4) {
                                    if (var20 != 5) {
                                        if (~var20 != -7) {
                                            if (var20 != 7) {
                                                if (~var20 == -9) {
                                                    class249 var22 = class107.method746(var21, -61);
                                                    if (var19.field3756 != var22.field3628 || var19.field3746 != var22.field3649 || ~var19.field3748 != ~var22.field3570) {
                                                        var22.field3628 = var19.field3756;
                                                        var22.field3570 = var19.field3748;
                                                        var22.field3649 = var19.field3746;
                                                        if (var22.field3588 != -1) {
                                                            if (~var22.field3590 < -1) {
                                                                var22.field3570 = var22.field3570 * 32 / var22.field3590;
                                                            } else if (var22.field3607 > 0) {
                                                                var22.field3570 = var22.field3570 * 32 / var22.field3607;
                                                            }
                                                        }
                                                        class392.method2564(-96, var22);
                                                    }
                                                } else if (var20 == 9) {
                                                    class249 var23 = class107.method746(var21, -124);
                                                    if (var19.field3756 != var23.field3588 || ~var19.field3746 != ~var23.field3472) {
                                                        var23.field3588 = var19.field3756;
                                                        var23.field3472 = var19.field3746;
                                                        class392.method2564(-75, var23);
                                                    }
                                                } else if (var20 != 10) {
                                                    if (~var20 == -12) {
                                                        class249 var24 = class107.method746(var21, -83);
                                                        var24.field3636 = 0;
                                                        var24.field3510 = var24.field3599 = var19.field3746;
                                                        var24.field3609 = var24.field3612 = var19.field3756;
                                                        var24.field3478 = 0;
                                                        class392.method2564(-124, var24);
                                                    } else if (~var20 != -13) {
                                                        if (var20 != 13) {
                                                            if (~var20 != -15) {
                                                                if (var20 == 15) {
                                                                    class70.field967 = var19.field3746;
                                                                    class405.field6086 = true;
                                                                    class82.field1154 = var19.field3756;
                                                                }
                                                            } else {
                                                                class249 var25 = class107.method746(var21, -17);
                                                                var25.field3544 = var19.field3756;
                                                            }
                                                        } else {
                                                            class249 var26 = class107.method746(var21, -18);
                                                            var26.field3617 = var19.field3756;
                                                        }
                                                    } else {
                                                        class249 var27 = class107.method746(var21, -98);
                                                        int var28 = var19.field3756;
                                                        if (var27 != null && ~var27.field3637 == -1) {
                                                            if (var27.field3646 - var27.field3604 < var28) {
                                                                var28 = -var27.field3604 + var27.field3646;
                                                            }
                                                            if (~var28 > -1) {
                                                                var28 = 0;
                                                            }
                                                            if (var27.field3582 != var28) {
                                                                var27.field3582 = var28;
                                                                class392.method2564(-99, var27);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    class249 var29 = class107.method746(var21, -31);
                                                    if (~var19.field3756 != ~var29.field3579 || ~var19.field3746 != ~var29.field3557 || ~var19.field3748 != ~var29.field3475) {
                                                        var29.field3579 = var19.field3756;
                                                        var29.field3475 = var19.field3748;
                                                        var29.field3557 = var19.field3746;
                                                        class392.method2564(-86, var29);
                                                    }
                                                }
                                            } else {
                                                class249 var30 = class107.method746(var21, -53);
                                                boolean var31 = var19.field3756 == 1;
                                                if (var30.field3571 != var31) {
                                                    var30.field3571 = var31;
                                                    class392.method2564(-105, var30);
                                                }
                                            }
                                        } else {
                                            int var32 = var19.field3756;
                                            int var33 = (var32 & 32604) >> 10;
                                            int var34 = var32 >> 5 & 31;
                                            int var35 = var32 & 31;
                                            int var36 = (var33 << 19) + (var34 << 11) + (var35 << 3);
                                            class249 var37 = class107.method746(var21, -126);
                                            if (~var37.field3634 != ~var36) {
                                                var37.field3634 = var36;
                                                class392.method2564(-125, var37);
                                            }
                                        }
                                    } else {
                                        class249 var38 = class107.method746(var21, -53);
                                        if (var19.field3756 != var38.field3610 || ~var19.field3756 == 0) {
                                            var38.field3610 = var19.field3756;
                                            var38.field3648 = 1;
                                            var38.field3651 = 0;
                                            var38.field3505 = 0;
                                            class392.method2564(-89, var38);
                                        }
                                    }
                                } else {
                                    class249 var39 = class107.method746(var21, -11);
                                    int var40 = var19.field3756;
                                    int var41 = var19.field3746;
                                    int var42 = var19.field3748;
                                    if (var39.field3583 != var40 || ~var39.field3526 != ~var41 || var39.field3624 != var42) {
                                        var39.field3583 = var40;
                                        var39.field3526 = var41;
                                        var39.field3624 = var42;
                                        class392.method2564(-120, var39);
                                    }
                                }
                            } else {
                                class249 var43 = class107.method746(var21, -105);
                                if (!var19.field3753.equals(var43.field3524)) {
                                    var43.field3524 = var19.field3753;
                                    class392.method2564(-79, var43);
                                }
                            }
                        }
                        ++class175.field2280;
                        if (class161.field2104 != 0) {
                            class392.field5883 += 20;
                            if (~class392.field5883 <= -401) {
                                class161.field2104 = 0;
                            }
                        }
                        if (class416.field6207 != null) {
                            ++class122.field1631;
                            if (~class122.field1631 <= -16) {
                                class392.method2564(-110, class416.field6207);
                                class416.field6207 = null;
                            }
                        }
                        class249 var44 = class59.field853;
                        class59.field853 = null;
                        class249 var45 = class374.field5639;
                        class374.field5639 = null;
                        class370.field5510 = false;
                        class26.field459 = null;
                        class187.field2544 = 0;
                        class26.field465 = false;
                        while (class301.method1906(92) && ~class187.field2544 > -129) {
                            if (!class34.method281(14848) || class157.field2066 != '`' && class157.field2066 != 167) {
                                class344.field5046[class187.field2544] = class122.field1633;
                                class240.field3384[class187.field2544] = class157.field2066;
                                ++class187.field2544;
                            } else if (!class357.method2345(0)) {
                                class203.method1282(100);
                            } else {
                                class88.method545(false);
                            }
                        }
                        if (class357.method2345(0)) {
                            class433.method2748(false);
                        }
                        class204.field2952 = null;
                        class240.method1491(-1, (class249) null, -1, (byte) 88);
                        class313.method1954((class249) null, true, -1, -1);
                        class421.method2707(121);
                        ++class381.field5717;
                        if (class327.field4699) {
                            class232.field3279.method756(0, 148);
                            ++field1141;
                            class232.field3279.method1716((byte) -105, class403.field5989 | class384.field5735 << 14 | class171.field2251 << 28);
                            class327.field4699 = false;
                        }
                        while (true) {
                            class228 var46;
                            class249 var47;
                            class249 var48;
                            do {
                                var46 = (class228) class134.field1785.method2647((byte) 93);
                                if (var46 == null) {
                                    while (true) {
                                        class228 var49;
                                        class249 var50;
                                        class249 var51;
                                        do {
                                            var49 = (class228) class231.field3260.method2647((byte) 93);
                                            if (var49 == null) {
                                                while (true) {
                                                    class228 var52;
                                                    class249 var53;
                                                    class249 var54;
                                                    do {
                                                        var52 = (class228) class130.field1743.method2647((byte) 93);
                                                        if (var52 == null) {
                                                            if (class204.field2952 == null) {
                                                                class19.field329 = 0;
                                                            }
                                                            if (class372.field5533 != null) {
                                                                class437.method2765(97);
                                                            }
                                                            if (~class227.field3206 < -1 && class1.field5[82] && class1.field5[81] && class433.field6392 != 0) {
                                                                int var55 = -class433.field6392 + class193.field2688;
                                                                if (var55 < 0) {
                                                                    var55 = 0;
                                                                } else if (~var55 < -4) {
                                                                    var55 = 3;
                                                                }
                                                                class110.method767(var55, class100.field1350.field306[0] + class38.field620, class100.field1350.field303[0] + class184.field2482, 63);
                                                            }
                                                            class199.method1250(2);
                                                            if (class229.field3246 != null) {
                                                                class392.method2564(-78, class229.field3246);
                                                                if (~class34.field555 < ~(class205.field2966 - -5) || class34.field555 < class205.field2966 + -5 || ~(class272.field3975 + 5) > ~class316.field4522 || class316.field4522 < class272.field3975 + -5) {
                                                                    class280.field4120 = true;
                                                                }
                                                                ++class156.field2048;
                                                                if (~class10.field100 == -1) {
                                                                    if (class280.field4120 && ~class156.field2048 <= -6) {
                                                                        if (class363.field5308 == class229.field3246 && ~class396.field5948 != ~class376.field5681) {
                                                                            class249 var56 = class229.field3246;
                                                                            byte var57 = 0;
                                                                            if (class52.field781 == 1 && ~var56.field3608 == -207) {
                                                                                var57 = 1;
                                                                            }
                                                                            if (var56.field3567[class376.field5681] <= 0) {
                                                                                var57 = 0;
                                                                            }
                                                                            if (var57 == 1) {
                                                                                int var58 = class396.field5948;
                                                                                int var59 = class376.field5681;
                                                                                while (var58 != var59) {
                                                                                    if (~var58 < ~var59) {
                                                                                        var56.method1550(var58 + -1, -112, var58);
                                                                                        --var58;
                                                                                    } else if (var58 < var59) {
                                                                                        var56.method1550(var58 + 1, 89, var58);
                                                                                        ++var58;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                var56.method1550(class376.field5681, -71, class396.field5948);
                                                                            }
                                                                            ++class390.field5846;
                                                                            class232.field3279.method756(0, 253);
                                                                            class232.field3279.method1704(class229.field3246.field3622, (byte) 125);
                                                                            class232.field3279.method1687(-29012, var57);
                                                                            class232.field3279.method1718(class376.field5681, (byte) -127);
                                                                            class232.field3279.method1718(class396.field5948, (byte) -125);
                                                                        }
                                                                    } else if ((class288.field4183 == 1 || class246.method1512(121)) && ~class10.field97 < -3) {
                                                                        class103.method703(class34.field555, class316.field4522, (byte) -121);
                                                                    } else if (class94.method575(17762)) {
                                                                        class255.method1600((byte) 63);
                                                                    }
                                                                    class229.field3246 = null;
                                                                    class84.field1173 = 0;
                                                                    class122.field1631 = 10;
                                                                }
                                                            }
                                                            if (class59.field853 != var44) {
                                                                if (var44 != null) {
                                                                    class392.method2564(-88, var44);
                                                                }
                                                                if (class59.field853 != null) {
                                                                    class392.method2564(-94, class59.field853);
                                                                }
                                                            }
                                                            if (class374.field5639 != var45 && class300.field4309 == class133.field1782) {
                                                                if (var45 != null) {
                                                                    class392.method2564(-91, var45);
                                                                }
                                                                if (class374.field5639 != null) {
                                                                    class392.method2564(-81, class374.field5639);
                                                                }
                                                            }
                                                            if (class374.field5639 == null) {
                                                                if (~class300.field4309 < -1) {
                                                                    --class300.field4309;
                                                                }
                                                            } else if (class133.field1782 > class300.field4309) {
                                                                ++class300.field4309;
                                                                if (~class300.field4309 == ~class133.field1782) {
                                                                    class392.method2564(-108, class374.field5639);
                                                                }
                                                            }
                                                            for (int var60 = 0; ~var60 > -6; ++var60) {
                                                                int var10002 = class417.field6218[var60]++;
                                                            }
                                                            int var61 = class300.method1897((byte) 65);
                                                            int var62 = class387.method2527(-1);
                                                            if (var61 > 15000 && var62 > 15000) {
                                                                class26.field474 = 250;
                                                                ++client.field3676;
                                                                class293.method1879(14500, 606422945);
                                                                class232.field3279.method756(0, 244);
                                                            }
                                                            if (class329.field4727 && ~(-60000L + class55.method375(-3913)) < ~class191.field2656) {
                                                                class153.method993(6);
                                                            }
                                                            ++class145.field1911;
                                                            if (class145.field1911 > 500) {
                                                                class145.field1911 = 0;
                                                                int var63 = (int) (Math.random() * 8.0D);
                                                                if ((4 & var63) == 4) {
                                                                    class383.field5733 += class40.field635;
                                                                }
                                                                if ((var63 & 2) == 2) {
                                                                    class207.field2982 += class54.field807;
                                                                }
                                                                if ((1 & var63) == 1) {
                                                                    class42.field651 += class396.field5942;
                                                                }
                                                            }
                                                            if (class42.field651 < -50) {
                                                                class396.field5942 = 2;
                                                            }
                                                            if (class207.field2982 < -55) {
                                                                class54.field807 = 2;
                                                            }
                                                            if (~class42.field651 < -51) {
                                                                class396.field5942 = -2;
                                                            }
                                                            if (~class207.field2982 < -56) {
                                                                class54.field807 = -2;
                                                            }
                                                            if (class383.field5733 < -40) {
                                                                class40.field635 = 1;
                                                            }
                                                            ++class411.field6142;
                                                            if (class383.field5733 > 40) {
                                                                class40.field635 = -1;
                                                            }
                                                            if (class411.field6142 > 500) {
                                                                class411.field6142 = 0;
                                                                int var64 = (int) (Math.random() * 8.0D);
                                                                if (~(var64 & 1) == -2) {
                                                                    class66.field942 += class300.field4310;
                                                                }
                                                                if ((var64 & 2) == 2) {
                                                                    class59.field858 += class135.field1793;
                                                                }
                                                            }
                                                            if (~class66.field942 > 59) {
                                                                class300.field4310 = 2;
                                                            }
                                                            if (~class59.field858 > 19) {
                                                                class135.field1793 = 1;
                                                            }
                                                            if (class66.field942 > 60) {
                                                                class300.field4310 = -2;
                                                            }
                                                            ++class5.field45;
                                                            if (class59.field858 > 10) {
                                                                class135.field1793 = -1;
                                                            }
                                                            if (class5.field45 > 50) {
                                                                ++class52.field770;
                                                                class232.field3279.method756(0, 255);
                                                            }
                                                            if (class449.field6560) {
                                                                class247.method1525(-11983);
                                                                class449.field6560 = false;
                                                            }
                                                            try {
                                                                if (class159.field2079 != null && ~class232.field3279.field3915 < -1) {
                                                                    class159.field2079.method245(110, class232.field3279.field3915, 0, class232.field3279.field3879);
                                                                    class5.field45 = 0;
                                                                    class232.field3279.field3915 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var65) {
                                                                class120.method837(!arg0);
                                                                return;
                                                            }
                                                        }
                                                        var53 = var52.field3210;
                                                        if (~var53.field3517 > -1) {
                                                            break;
                                                        }
                                                        var54 = class107.method746(var53.field3623, -26);
                                                    } while (var54 == null || var54.field3493 == null || var53.field3517 >= var54.field3493.length || var54.field3493[var53.field3517] != var53);
                                                    class365.method2395(var52);
                                                }
                                            }
                                            var50 = var49.field3210;
                                            if (var50.field3517 < 0) {
                                                break;
                                            }
                                            var51 = class107.method746(var50.field3623, -119);
                                        } while (var51 == null || var51.field3493 == null || ~var51.field3493.length >= ~var50.field3517 || var51.field3493[var50.field3517] != var50);
                                        class365.method2395(var49);
                                    }
                                }
                                var47 = var46.field3210;
                                if (~var47.field3517 > -1) {
                                    break;
                                }
                                var48 = class107.method746(var47.field3623, -71);
                            } while (var48 == null || var48.field3493 == null || ~var48.field3493.length >= ~var47.field3517 || var48.field3493[var47.field3517] != var47);
                            class365.method2395(var46);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)Z", line = 1231)
    public static final boolean method516(int arg0) throws IOException {
        ++field1146;
        if (class159.field2079 == null) {
            return false;
        } else {
            int var1 = class159.field2079.method241((byte) 17);
            if (~var1 == -1) {
                return false;
            } else {
                if (class188.field2551 == -1) {
                    class159.field2079.method242(114, 0, class114.field1556.field3879, 1);
                    class114.field1556.field3915 = 0;
                    class188.field2551 = class114.field1556.method760(5663);
                    class413.field6176 = class261.field3794[class188.field2551];
                    --var1;
                }
                if (class413.field6176 == -1) {
                    if (var1 <= 0) {
                        return false;
                    }
                    class159.field2079.method242(116, 0, class114.field1556.field3879, 1);
                    class413.field6176 = 255 & class114.field1556.field3879[0];
                    --var1;
                }
                if (~class413.field6176 == 1) {
                    if (~var1 >= -2) {
                        return false;
                    }
                    class159.field2079.method242(101, 0, class114.field1556.field3879, 2);
                    class114.field1556.field3915 = 0;
                    var1 -= 2;
                    class413.field6176 = class114.field1556.method1685(8104);
                }
                if (class413.field6176 > var1) {
                    return false;
                } else {
                    class114.field1556.field3915 = 0;
                    class159.field2079.method242(89, 0, class114.field1556.field3879, class413.field6176);
                    class313.field4484 = class227.field3199;
                    class84.field1166 = 0;
                    class227.field3199 = class161.field2102;
                    class161.field2102 = class188.field2551;
                    if (~class188.field2551 == -234) {
                        int var2 = class114.field1556.method1666(-2);
                        class249 var3 = class107.method746(var2, -21);
                        for (int var4 = 0; ~var4 > ~var3.field3567.length; ++var4) {
                            var3.field3567[var4] = -1;
                            var3.field3567[var4] = 0;
                        }
                        class392.method2564(-99, var3);
                        class188.field2551 = -1;
                        return true;
                    } else if (class188.field2551 == 38) {
                        class22.method190((byte) -113);
                        int var5 = class114.field1556.method1674((byte) -121);
                        int var6 = class114.field1556.method1682(65280);
                        int var7 = class114.field1556.method1702(4095);
                        class215.field3084[var7] = var6;
                        class237.field3328[var7] = var5;
                        class343.field5035[var7] = 1;
                        int var8 = class139.field1848[var7] - 1;
                        for (int var9 = 0; var8 > var9; ++var9) {
                            if (var6 >= class194.field2770[var9]) {
                                class343.field5035[var7] = var9 + 2;
                            }
                        }
                        class424.field6306[class401.method2606(31, class220.field3142++)] = var7;
                        class188.field2551 = -1;
                        return true;
                    } else if (~class188.field2551 == -165) {
                        int var10 = class114.field1556.method1694(-1);
                        byte var11 = class114.field1556.method1708((byte) 127);
                        int var12 = class114.field1556.method1684((byte) 79);
                        if (class155.method997(-25976, var10)) {
                            class196.method1228(1, var11, var12);
                        }
                        class188.field2551 = -1;
                        return true;
                    } else if (~class188.field2551 == -110) {
                        int var13 = class114.field1556.method1694(-1);
                        int var14 = class114.field1556.method1671(-16777216);
                        int var15 = class114.field1556.method1705(false);
                        int var16 = class114.field1556.method1694(-1);
                        if (~(var14 >> 30) != -1) {
                            int var17 = 3 & var14 >> 28;
                            int var18 = ((268433512 & var14) >> 14) + -class184.field2482;
                            int var19 = (var14 & 16383) + -class38.field620;
                            if (var18 >= 0 && var19 >= 0 && class324.field4652 > var18 && ~class336.field4964 < ~var19) {
                                int var20 = var18 * 128 + 64;
                                int var21 = var19 * 128 + 64;
                                class392 var22 = new class392(var15, 0, class50.field698, var17, var20, class139.method935(var21, -16, var20, var17) + -var13, var21, var18, var18, var19, var19);
                                class119.field1599.method2660((byte) -125, new class268(var22));
                            }
                        } else if (~(var14 >> 29) == -1) {
                            if (~(var14 >> 28) != -1) {
                                int var23 = var14 & 65535;
                                class194 var24;
                                if (class452.field6590 != var23) {
                                    var24 = class125.field1664[var23];
                                } else {
                                    var24 = class100.field1350;
                                }
                                if (var24 != null) {
                                    if (~var15 == -65536) {
                                        var15 = -1;
                                    }
                                    boolean var25 = true;
                                    if (var15 != -1 && var24.field228 != -1) {
                                        if (~var24.field228 != ~var15) {
                                            class333 var26 = class395.method2586(var15, -6861);
                                            class333 var27 = class395.method2586(var24.field228, -6861);
                                            if (var26.field4924 != -1 && var27.field4924 != -1) {
                                                class15 var28 = class391.method2551(var26.field4924, (byte) -111);
                                                class15 var29 = class391.method2551(var27.field4924, (byte) -98);
                                                if (~var28.field153 > ~var29.field153) {
                                                    var25 = false;
                                                }
                                            }
                                        } else {
                                            class333 var30 = class395.method2586(var15, -6861);
                                            if (var30.field4922 && ~var30.field4924 != 0) {
                                                class15 var31 = class391.method2551(var30.field4924, (byte) -126);
                                                int var32 = var31.field166;
                                                if (var32 != 0 && var32 != 2) {
                                                    if (~var32 == -2) {
                                                        var25 = true;
                                                    }
                                                } else {
                                                    var25 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var25) {
                                        var24.field263 = 0;
                                        var24.field228 = var15;
                                        var24.field226 = 1;
                                        var24.field237 = 0;
                                        var24.field262 = class50.field698 + var16;
                                        var24.field261 = var13;
                                        if (~var24.field228 == -65536) {
                                            var24.field228 = -1;
                                        }
                                        if (~class50.field698 > ~var24.field262) {
                                            var24.field237 = -1;
                                        }
                                        if (var24.field228 != -1 && class50.field698 == var24.field262) {
                                            int var33 = class395.method2586(var24.field228, -6861).field4924;
                                            if (~var33 != 0) {
                                                class15 var34 = class391.method2551(var33, (byte) -105);
                                                if (var34 != null && var34.field150 != null) {
                                                    class277.method1770(var24.field5284, 21155, class100.field1350 == var24, 0, var24.field5298, var34);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int var35 = var14 & 65535;
                            class129 var36 = class23.field408[var35];
                            if (var36 != null) {
                                if (var15 == 65535) {
                                    var15 = -1;
                                }
                                boolean var37 = true;
                                if (var15 != -1 && var36.field228 != -1) {
                                    if (var36.field228 != var15) {
                                        class333 var38 = class395.method2586(var15, -6861);
                                        class333 var39 = class395.method2586(var36.field228, -6861);
                                        if (var38.field4924 != -1 && var39.field4924 != -1) {
                                            class15 var40 = class391.method2551(var38.field4924, (byte) -103);
                                            class15 var41 = class391.method2551(var39.field4924, (byte) -122);
                                            if (var41.field153 > var40.field153) {
                                                var37 = false;
                                            }
                                        }
                                    } else {
                                        class333 var42 = class395.method2586(var15, -6861);
                                        if (var42.field4922 && ~var42.field4924 != 0) {
                                            class15 var43 = class391.method2551(var42.field4924, (byte) -95);
                                            int var44 = var43.field166;
                                            if (~var44 != -1 && var44 != 2) {
                                                if (var44 == 1) {
                                                    var37 = true;
                                                }
                                            } else {
                                                var37 = false;
                                            }
                                        }
                                    }
                                }
                                if (var37) {
                                    var36.field262 = class50.field698 - -var16;
                                    var36.field228 = var15;
                                    var36.field237 = 0;
                                    var36.field261 = var13;
                                    var36.field226 = 1;
                                    var36.field263 = 0;
                                    if (~class50.field698 > ~var36.field262) {
                                        var36.field237 = -1;
                                    }
                                    if (var36.field228 != -1 && ~class50.field698 == ~var36.field262) {
                                        int var45 = class395.method2586(var36.field228, -6861).field4924;
                                        if (~var45 != 0) {
                                            class15 var46 = class391.method2551(var45, (byte) -103);
                                            if (var46 != null && var46.field150 != null) {
                                                class277.method1770(var36.field5284, 21155, false, 0, var36.field5298, var46);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        class188.field2551 = -1;
                        return true;
                    } else if (class188.field2551 == 50) {
                        int var47 = class114.field1556.method1705(false);
                        int var48 = class114.field1556.method1685(8104);
                        int var49 = class114.field1556.method1665(14684);
                        if (class155.method997(-25976, var48)) {
                            if (var49 == 2) {
                                class246.method1516((byte) -21);
                            }
                            class404.field6020 = var47;
                            class451.method2822((byte) -74, var47);
                            class110.method768(-125, false);
                            class365.method2391(class404.field6020);
                            for (int var50 = 0; ~var50 > -101; ++var50) {
                                class85.field1178[var50] = true;
                            }
                        }
                        class188.field2551 = -1;
                        return true;
                    } else if (~class188.field2551 == -199) {
                        for (int var51 = 0; class192.field2668.length > var51; ++var51) {
                            if (class315.field4512[var51] != class192.field2668[var51]) {
                                class192.field2668[var51] = class315.field4512[var51];
                                class413.method2681((byte) 127, var51);
                                class335.field4954[class401.method2606(31, class407.field6102++)] = var51;
                            }
                        }
                        class188.field2551 = -1;
                        return true;
                    } else if (~class188.field2551 == -27) {
                        boolean var52 = ~class114.field1556.method1697(-71) == -2;
                        String var53 = class114.field1556.method1712(false);
                        String var54 = var53;
                        if (var52) {
                            var54 = class114.field1556.method1712(false);
                        }
                        long var55 = (long) class114.field1556.method1685(8104);
                        long var57 = (long) class114.field1556.method1691(false);
                        int var59 = class114.field1556.method1697(-42);
                        int var60 = class114.field1556.method1685(8104);
                        long var61 = (var55 << 32) + var57;
                        boolean var63 = false;
                        int var64 = 0;
                        while (true) {
                            if (var64 >= 100) {
                                if (var59 <= 1 && class24.method216(var54, -77)) {
                                    var63 = true;
                                }
                                break;
                            }
                            if (class310.field4440[var64] == var61) {
                                var63 = true;
                                break;
                            }
                            ++var64;
                        }
                        if (!var63 && class306.field4378 == 0) {
                            class310.field4440[class156.field2047] = var61;
                            class156.field2047 = (class156.field2047 + 1) % 100;
                            String var65 = class284.method1804(var60, (byte) -99).method371(class114.field1556, -8507);
                            if (~var59 != -3) {
                                if (~var59 != -2) {
                                    class316.method1968(var53, var54, -23645, 18, var65, 0, (String) null, var60);
                                } else {
                                    class316.method1968("<img=0>" + var53, "<img=0>" + var54, -23645, 18, var65, 0, (String) null, var60);
                                }
                            } else {
                                class316.method1968("<img=1>" + var53, "<img=1>" + var54, -23645, 18, var65, 0, (String) null, var60);
                            }
                        }
                        class188.field2551 = -1;
                        return true;
                    } else if (class188.field2551 == 120) {
                        int var66 = class114.field1556.method1666(-2);
                        int var67 = class114.field1556.method1685(8104);
                        if (var66 < -70000) {
                            var67 += 32768;
                        }
                        class249 var68;
                        if (~var66 > -1) {
                            var68 = null;
                        } else {
                            var68 = class107.method746(var66, -65);
                        }
                        if (var68 != null) {
                            for (int var69 = 0; ~var69 > ~var68.field3567.length; ++var69) {
                                var68.field3567[var69] = 0;
                                var68.field3585[var69] = 0;
                            }
                        }
                        class100.method680(var67, (byte) 60);
                        int var70 = class114.field1556.method1685(8104);
                        for (int var71 = 0; ~var70 < ~var71; ++var71) {
                            int var72 = class114.field1556.method1702(4095);
                            if (var72 == 255) {
                                var72 = class114.field1556.method1682(65280);
                            }
                            int var73 = class114.field1556.method1684((byte) 79);
                            if (var68 != null && var68.field3567.length > var71) {
                                var68.field3567[var71] = var73;
                                var68.field3585[var71] = var72;
                            }
                            class212.method1313(var72, var67, var71, var73 + -1, -21180);
                        }
                        if (var68 != null) {
                            class392.method2564(-105, var68);
                        }
                        class22.method190((byte) -76);
                        class107.field1461[class401.method2606(31, class33.field547++)] = class401.method2606(32767, var67);
                        class188.field2551 = -1;
                        return true;
                    } else if (~class188.field2551 == -40) {
                        for (int var74 = 0; var74 < class125.field1664.length; ++var74) {
                            if (class125.field1664[var74] != null) {
                                class125.field1664[var74].field222 = -1;
                            }
                        }
                        for (int var75 = 0; class23.field408.length > var75; ++var75) {
                            if (class23.field408[var75] != null) {
                                class23.field408[var75].field222 = -1;
                            }
                        }
                        class188.field2551 = -1;
                        return true;
                    } else if (class188.field2551 == 186) {
                        byte var76 = class114.field1556.method1675(-6266);
                        int var77 = class114.field1556.method1694(-1);
                        class168.method1041(var77, 66, var76);
                        class188.field2551 = -1;
                        return true;
                    } else if (class188.field2551 == 235) {
                        int var78 = class114.field1556.method1685(8104);
                        if (~var78 == -65536) {
                            var78 = -1;
                        }
                        int var79 = class114.field1556.method1682(65280);
                        int var80 = class114.field1556.method1685(8104);
                        if (class155.method997(-25976, var80)) {
                            class52.method361(-1, 1, (byte) 67, var79, var78);
                        }
                        class188.field2551 = -1;
                        return true;
                    } else if (class188.field2551 == 21) {
                        int var81 = class114.field1556.method1694(-1);
                        int var82 = class114.field1556.method1682(65280);
                        int var83 = class114.field1556.method1685(8104);
                        if (class155.method997(-25976, var83)) {
                            class196.method1228(1, var82, var81);
                        }
                        class188.field2551 = -1;
                        return true;
                    } else if (class188.field2551 == 151) {
                        int var84 = class114.field1556.method1671(-16777216);
                        int var85 = class114.field1556.method1685(8104);
                        class168.method1041(var85, 119, var84);
                        class188.field2551 = -1;
                        return true;
                    } else if (class188.field2551 == 192) {
                        int var86 = class114.field1556.method1709(0);
                        int var87 = class114.field1556.method1694(-1);
                        int var88 = class114.field1556.method1694(-1);
                        int var89 = class114.field1556.method1694(-1);
                        int var90 = class114.field1556.method1705(false);
                        if (class155.method997(-25976, var87)) {
                            class52.method361(var89, 7, (byte) 67, var86, var90 | var88 << 16);
                        }
                        class188.field2551 = -1;
                        return true;
                    } else if (~class188.field2551 != -16 && ~class188.field2551 != -79 && ~class188.field2551 != -230 && class188.field2551 != 212 && class188.field2551 != 155 && class188.field2551 != 82 && class188.field2551 != 6 && ~class188.field2551 != -113 && class188.field2551 != 249 && ~class188.field2551 != -224 && class188.field2551 != 221 && ~class188.field2551 != -23 && class188.field2551 != 254 && ~class188.field2551 != -28 && ~class188.field2551 != -116) {
                        if (~class188.field2551 == -249) {
                            int var91 = class114.field1556.method1694(-1);
                            int var92 = class114.field1556.method1694(-1);
                            int var93 = class114.field1556.method1684((byte) 79);
                            if (class155.method997(-25976, var92)) {
                                class33.method276(var91, var93, 0, (byte) 62);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -203) {
                            class244.field3409 = class114.field1556.method1697(-124);
                            for (int var94 = 0; ~class244.field3409 < ~var94; ++var94) {
                                class272.field3982[var94] = class114.field1556.method1712(false);
                                class374.field5640[var94] = class114.field1556.method1712(false);
                                if (class374.field5640[var94].equals("")) {
                                    class374.field5640[var94] = class272.field3982[var94];
                                }
                                class155.field2035[var94] = class114.field1556.method1712(false);
                                class214.field3052[var94] = class114.field1556.method1712(false);
                                if (class214.field3052[var94].equals("")) {
                                    class214.field3052[var94] = class155.field2035[var94];
                                }
                                class41.field645[var94] = false;
                            }
                            class188.field2555 = class381.field5717;
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 231) {
                            class127.field1688 = 30 * class114.field1556.method1684((byte) 79);
                            class188.field2551 = -1;
                            class1.field4 = class381.field5717;
                            return true;
                        } else if (~class188.field2551 == -64) {
                            class22.method190((byte) -121);
                            class35.field579 = class114.field1556.method1697(-26);
                            class1.field4 = class381.field5717;
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 170) {
                            int var95 = class114.field1556.method1666(-2);
                            int var96 = class114.field1556.method1684((byte) 79);
                            if (class155.method997(-25976, var96)) {
                                class52.method361(0, 5, (byte) 67, var95, 2047);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -251) {
                            class108.method758((byte) -112);
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 246) {
                            if (~class413.field6176 != -1) {
                                class205.field2968 = class114.field1556.method1712(false);
                            } else {
                                class205.field2968 = class324.field4661;
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -190) {
                            int var97 = class114.field1556.method1694(-1);
                            int var98 = class114.field1556.method1684((byte) 79);
                            int var99 = class114.field1556.method1705(false);
                            int var100 = class114.field1556.method1682(65280);
                            int var101 = class114.field1556.method1685(8104);
                            if (class155.method997(-25976, var101)) {
                                class249.method1542(var97, var98, var99, var100, false);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -208) {
                            class185.field2522 = class114.field1556.method1665(14684);
                            class313.field4488 = class114.field1556.method1697(-10);
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 226) {
                            boolean var102 = class114.field1556.method1697(69) == 1;
                            String var103 = class114.field1556.method1712(false);
                            String var104 = var103;
                            if (var102) {
                                var104 = class114.field1556.method1712(false);
                            }
                            long var105 = (long) class114.field1556.method1685(8104);
                            long var107 = (long) class114.field1556.method1691(false);
                            int var109 = class114.field1556.method1697(-89);
                            long var110 = (var105 << 32) + var107;
                            boolean var112 = false;
                            int var113 = 0;
                            while (true) {
                                if (~var113 <= -101) {
                                    if (var109 <= 1) {
                                        if ((!class261.field3808 || class240.field3381) && !class35.field570) {
                                            if (class24.method216(var104, -122)) {
                                                var112 = true;
                                            }
                                        } else {
                                            var112 = true;
                                        }
                                    }
                                    break;
                                }
                                if (~class310.field4440[var113] == ~var110) {
                                    var112 = true;
                                    break;
                                }
                                ++var113;
                            }
                            if (!var112 && class306.field4378 == 0) {
                                class310.field4440[class156.field2047] = var110;
                                class156.field2047 = (class156.field2047 - -1) % 100;
                                String var114 = class297.method1886(0, class323.method1998(63, class8.method62(class114.field1556, 32767)));
                                if (var109 != 2) {
                                    if (var109 != 1) {
                                        class316.method1968(var103, var104, -23645, 3, var114, 0, (String) null, -1);
                                    } else {
                                        class316.method1968("<img=0>" + var103, "<img=0>" + var104, -23645, 7, var114, 0, (String) null, -1);
                                    }
                                } else {
                                    class316.method1968("<img=1>" + var103, "<img=1>" + var104, -23645, 7, var114, 0, (String) null, -1);
                                }
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -74) {
                            int var115 = class114.field1556.method1694(-1);
                            if (~var115 == -65536) {
                                var115 = -1;
                            }
                            String var116 = class114.field1556.method1712(false);
                            int var117 = class114.field1556.method1702(4095);
                            int var118 = class114.field1556.method1665(14684);
                            if (~var118 <= -2 && ~var118 >= -9) {
                                if (var116.equalsIgnoreCase("null")) {
                                    var116 = null;
                                }
                                class276.field4053[var118 - 1] = var116;
                                class347.field5151[var118 + -1] = var115;
                                class175.field2288[var118 + -1] = var117 == 0;
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -131) {
                            int var119 = class114.field1556.method1671(-16777216);
                            int var120 = class114.field1556.method1685(8104);
                            int var121 = class114.field1556.method1705(false);
                            if (class155.method997(-25976, var120)) {
                                class392.method2562((byte) -103, var119, var121);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -92) {
                            class126.field1675 = class381.field5717;
                            if (~class413.field6176 == -1) {
                                class288.field4180 = null;
                                class188.field2551 = -1;
                                class168.field2213 = null;
                                class409.field6130 = null;
                                class106.field1413 = 0;
                                return true;
                            } else {
                                class288.field4180 = class114.field1556.method1712(false);
                                boolean var122 = ~class114.field1556.method1697(102) == -2;
                                if (var122) {
                                    class114.field1556.method1712(false);
                                }
                                long var123 = class114.field1556.method1720(114);
                                class168.field2213 = class302.method1912(31013, var123);
                                class242.field3391 = class114.field1556.method1708((byte) 127);
                                int var125 = class114.field1556.method1697(108);
                                if (var125 == 255) {
                                    class188.field2551 = -1;
                                    return true;
                                } else {
                                    class106.field1413 = var125;
                                    class311[] var126 = new class311[100];
                                    for (int var127 = 0; ~class106.field1413 < ~var127; ++var127) {
                                        var126[var127] = new class311();
                                        var126[var127].field4451 = class114.field1556.method1712(false);
                                        boolean var133 = ~class114.field1556.method1697(-123) == -2;
                                        if (!var133) {
                                            var126[var127].field4443 = var126[var127].field4451;
                                        } else {
                                            var126[var127].field4443 = class114.field1556.method1712(false);
                                        }
                                        var126[var127].field4455 = class114.field1556.method1685(8104);
                                        var126[var127].field4450 = class114.field1556.method1708((byte) 127);
                                        var126[var127].field4457 = class114.field1556.method1712(false);
                                        if (var126[var127].field4443.equals(class100.field1350.field2756)) {
                                            class425.field6326 = var126[var127].field4450;
                                        }
                                    }
                                    boolean var128 = false;
                                    int var129 = class106.field1413;
                                    while (var129 > 0) {
                                        --var129;
                                        boolean var130 = true;
                                        for (int var131 = 0; ~var131 > ~var129; ++var131) {
                                            if (~var126[var131].field4451.compareTo(var126[var131 + 1].field4451) < -1) {
                                                class311 var132 = var126[var131];
                                                var126[var131] = var126[var131 + 1];
                                                var126[var131 + 1] = var132;
                                                var130 = false;
                                            }
                                        }
                                        if (var130) {
                                            break;
                                        }
                                    }
                                    class409.field6130 = var126;
                                    class188.field2551 = -1;
                                    return true;
                                }
                            }
                        } else if (~class188.field2551 == -164) {
                            int var134 = class114.field1556.method1685(8104);
                            class288.method1819((byte) -121, var134);
                            class107.field1461[class401.method2606(31, class33.field547++)] = class401.method2606(var134, 32767);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -146) {
                            int var135 = class114.field1556.method1666(-2);
                            int var136 = class114.field1556.method1682(65280);
                            int var137 = class114.field1556.method1694(-1);
                            int var138 = class114.field1556.method1694(-1);
                            if (var138 == 65535) {
                                var138 = -1;
                            }
                            if (class155.method997(-25976, var137)) {
                                class249 var139 = class107.method746(var135, -36);
                                if (!var139.field3522) {
                                    if (~var138 == 0) {
                                        var139.field3583 = 0;
                                        class188.field2551 = -1;
                                        return true;
                                    }
                                    class193 var140 = class166.method1031(var138, false);
                                    var139.field3649 = var140.field2691;
                                    var139.field3526 = var138;
                                    var139.field3583 = 4;
                                    var139.field3570 = var140.field2725 * 100 / var136;
                                    var139.field3628 = var140.field2705;
                                    class392.method2564(-77, var139);
                                } else {
                                    class11.method82(var135, var136, 94, var138);
                                    class193 var141 = class166.method1031(var138, false);
                                    class249.method1542(var141.field2691, var141.field2725, var141.field2705, var135, false);
                                    class72.method449(var141.field2744, var141.field2755, -124, var141.field2751, var135);
                                }
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -140) {
                            int var142 = class114.field1556.method1694(-1);
                            int var143 = class114.field1556.method1694(-1);
                            String var144 = class114.field1556.method1712(false);
                            if (class155.method997(-25976, var143)) {
                                class166.method1032(var142, true, var144);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -55) {
                            int var145 = class114.field1556.method1694(-1);
                            if (~var145 == -65536) {
                                var145 = -1;
                            }
                            int var146 = class114.field1556.method1702(4095);
                            int var147 = var146 >> 2;
                            int var148 = 3 & var146;
                            int var149 = class18.field219[var147];
                            int var150 = class114.field1556.method1682(65280);
                            int var151 = 3 & var150 >> 28;
                            int var152 = 16383 & var150 >> 14;
                            int var153 = var152 - class184.field2482;
                            int var154 = var150 & 16383;
                            int var155 = var154 - class38.field620;
                            class104.method710(8230, var145, var147, var151, var155, var148, var149, var153);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -67) {
                            class185.field2522 = class114.field1556.method1697(-50);
                            class313.field4488 = class114.field1556.method1665(14684);
                            for (class281 var156 = (class281) class231.field3261.method953(0); var156 != null; var156 = (class281) class231.field3261.method951(0)) {
                                int var158 = (int) (var156.field5903 & 16383L);
                                int var159 = (int) (var156.field5903 >> 14 & 16383L);
                                int var160 = (int) (3L & var156.field5903 >> 28);
                                if (class193.field2688 == var160 && ~var158 <= ~class313.field4488 && var158 < class313.field4488 + 8 && class185.field2522 <= var159 && var159 < class185.field2522 - -8) {
                                    var156.method2574((byte) 124);
                                    class393.method2573(var159, -90, class193.field2688, var158);
                                }
                            }
                            for (class370 var157 = (class370) class370.field5503.method2649(0); var157 != null; var157 = (class370) class370.field5503.method2656(0)) {
                                if (~class313.field4488 >= ~var157.field5498 && var157.field5498 < class313.field4488 + 8 && class185.field2522 <= var157.field5490 && var157.field5490 < class185.field2522 + 8 && class193.field2688 == var157.field5507) {
                                    var157.field5494 = 0;
                                }
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 137) {
                            boolean var161 = class114.field1556.method1697(-17) == 1;
                            String var162 = class114.field1556.method1712(false);
                            String var163 = var162;
                            if (var161) {
                                var163 = class114.field1556.method1712(false);
                            }
                            long var164 = class114.field1556.method1720(-11);
                            long var166 = (long) class114.field1556.method1685(8104);
                            long var168 = (long) class114.field1556.method1691(false);
                            int var170 = class114.field1556.method1697(-101);
                            long var171 = (var166 << 32) - -var168;
                            boolean var173 = false;
                            int var174 = 0;
                            while (true) {
                                if (~var174 <= -101) {
                                    if (var170 <= 1) {
                                        if ((!class261.field3808 || class240.field3381) && !class35.field570) {
                                            if (class24.method216(var163, -121)) {
                                                var173 = true;
                                            }
                                        } else {
                                            var173 = true;
                                        }
                                    }
                                    break;
                                }
                                if (~class310.field4440[var174] == ~var171) {
                                    var173 = true;
                                    break;
                                }
                                ++var174;
                            }
                            if (!var173 && ~class306.field4378 == -1) {
                                class310.field4440[class156.field2047] = var171;
                                class156.field2047 = (class156.field2047 + 1) % 100;
                                String var175 = class297.method1886(0, class323.method1998(63, class8.method62(class114.field1556, 32767)));
                                if (~var170 != -3 && var170 != 3) {
                                    if (~var170 == -2) {
                                        class316.method1968("<img=0>" + var162, "<img=0>" + var163, -23645, 9, var175, 0, class57.method384(124, var164), -1);
                                    } else {
                                        class316.method1968(var162, var163, -23645, 9, var175, 0, class57.method384(122, var164), -1);
                                    }
                                } else {
                                    class316.method1968("<img=1>" + var162, "<img=1>" + var163, -23645, 9, var175, 0, class57.method384(124, var164), -1);
                                }
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -57) {
                            int var176 = class114.field1556.method1685(8104);
                            int var177 = class114.field1556.method1665(14684);
                            int var178 = class114.field1556.method1685(8104);
                            int var179 = class114.field1556.method1671(-16777216);
                            if (class155.method997(-25976, var178)) {
                                class158 var180 = (class158) class269.field3933.method954(-62, (long) var179);
                                if (var180 != null) {
                                    class318.method1975(var180.field2075 != var176, 25697, var180, false);
                                }
                                class292.method1875(var176, var177, false, false, var179);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 140) {
                            int var181 = class114.field1556.method1682(65280);
                            int var182 = class114.field1556.method1694(-1);
                            int var183 = class114.field1556.method1705(false);
                            if (var183 == 65535) {
                                var183 = -1;
                            }
                            int var184 = class114.field1556.method1694(-1);
                            if (var184 == 65535) {
                                var184 = -1;
                            }
                            int var185 = class114.field1556.method1684((byte) 79);
                            if (class155.method997(-25976, var182)) {
                                for (int var186 = var184; ~var183 <= ~var186; ++var186) {
                                    long var187 = ((long) var181 << 32) + (long) var186;
                                    class185 var189 = (class185) class134.field1786.method954(68, var187);
                                    class185 var190;
                                    if (var189 == null) {
                                        if (~var186 == 0) {
                                            var190 = new class185(class107.method746(var181, -59).field3565.field2514, var185);
                                        } else {
                                            var190 = new class185(0, var185);
                                        }
                                    } else {
                                        var190 = new class185(var189.field2514, var185);
                                        var189.method2574((byte) 127);
                                    }
                                    class134.field1786.method956(false, var187, var190);
                                }
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 128) {
                            if (class106.field1428 != null) {
                                class66.method430(class161.field2107, -1, -1, false, true);
                            }
                            byte[] var191 = new byte[class413.field6176];
                            class114.field1556.method754(0, class413.field6176, 8156, var191);
                            String var192 = class413.method2680(class413.field6176, 0, 4238, var191);
                            class70.method442(false, var192, class265.field3854 == 1, class361.field5285, true);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -125) {
                            int var193 = class114.field1556.method1697(59);
                            int var194 = class114.field1556.method1705(false);
                            class104.method711(var194, -70, var193);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -76) {
                            boolean var195 = class114.field1556.method1697(103) == 1;
                            String var196 = class114.field1556.method1712(false);
                            String var197 = var196;
                            if (var195) {
                                var197 = class114.field1556.method1712(false);
                            }
                            long var198 = class114.field1556.method1720(94);
                            long var200 = (long) class114.field1556.method1685(8104);
                            long var202 = (long) class114.field1556.method1691(false);
                            int var204 = class114.field1556.method1697(62);
                            int var205 = class114.field1556.method1685(8104);
                            long var206 = (var200 << 32) - -var202;
                            boolean var208 = false;
                            int var209 = 0;
                            while (true) {
                                if (~var209 <= -101) {
                                    if (~var204 >= -2 && class24.method216(var197, -116)) {
                                        var208 = true;
                                    }
                                    break;
                                }
                                if (~class310.field4440[var209] == ~var206) {
                                    var208 = true;
                                    break;
                                }
                                ++var209;
                            }
                            if (!var208 && ~class306.field4378 == -1) {
                                class310.field4440[class156.field2047] = var206;
                                class156.field2047 = (class156.field2047 + 1) % 100;
                                String var210 = class284.method1804(var205, (byte) 92).method371(class114.field1556, -8507);
                                if (var204 == 2) {
                                    class316.method1968("<img=1>" + var196, "<img=1>" + var197, -23645, 20, var210, 0, class57.method384(127, var198), var205);
                                } else if (var204 == 1) {
                                    class316.method1968("<img=0>" + var196, "<img=0>" + var197, -23645, 20, var210, 0, class57.method384(123, var198), var205);
                                } else {
                                    class316.method1968(var196, var197, -23645, 20, var210, 0, class57.method384(125, var198), var205);
                                }
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -73) {
                            int var211 = class114.field1556.method1705(false);
                            int var212 = class114.field1556.method1685(8104);
                            int var213 = class114.field1556.method1666(-2);
                            int var214 = class114.field1556.method1694(-1);
                            if (class155.method997(-25976, var214)) {
                                class329.method2017((var211 << 16) - -var212, 13, var213);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 158) {
                            int var215 = class114.field1556.method1694(-1);
                            if (var215 == 65535) {
                                var215 = -1;
                            }
                            int var216 = class114.field1556.method1685(8104);
                            int var217 = class114.field1556.method1709(0);
                            if (class155.method997(-25976, var216)) {
                                class52.method361(-1, 2, (byte) 67, var217, var215);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 203) {
                            int var218 = class114.field1556.method1685(8104);
                            int var219 = class114.field1556.method1666(-2);
                            if (class155.method997(-25976, var218)) {
                                class158 var220 = (class158) class269.field3933.method954(-63, (long) var219);
                                if (var220 != null) {
                                    class318.method1975(true, 25697, var220, false);
                                }
                                if (class371.field5518 != null) {
                                    class392.method2564(-103, class371.field5518);
                                    class371.field5518 = null;
                                }
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 228) {
                            String var221 = class114.field1556.method1712(false);
                            boolean var222 = ~class114.field1556.method1697(-102) == -2;
                            String var223;
                            if (!var222) {
                                var223 = var221;
                            } else {
                                var223 = class114.field1556.method1712(false);
                            }
                            int var224 = class114.field1556.method1685(8104);
                            byte var225 = class114.field1556.method1708((byte) 127);
                            boolean var226 = false;
                            if (var225 == -128) {
                                var226 = true;
                            }
                            if (!var226) {
                                String var227 = class114.field1556.method1712(false);
                                class311 var228 = new class311();
                                var228.field4443 = var223;
                                var228.field4450 = var225;
                                var228.field4455 = var224;
                                var228.field4457 = var227;
                                var228.field4451 = var221;
                                int var229;
                                for (var229 = class106.field1413 + -1; ~var229 <= -1; --var229) {
                                    int var230 = class409.field6130[var229].field4443.compareTo(var228.field4443);
                                    if (~var230 == -1) {
                                        class409.field6130[var229].field4455 = var224;
                                        class409.field6130[var229].field4450 = var225;
                                        class409.field6130[var229].field4457 = var227;
                                        if (var223.equals(class100.field1350.field2756)) {
                                            class425.field6326 = var225;
                                        }
                                        class126.field1675 = class381.field5717;
                                        class188.field2551 = -1;
                                        return true;
                                    }
                                    if (var230 < 0) {
                                        break;
                                    }
                                }
                                if (~class106.field1413 <= ~class409.field6130.length) {
                                    class188.field2551 = -1;
                                    return true;
                                }
                                for (int var231 = class106.field1413 + -1; ~var231 < ~var229; --var231) {
                                    class409.field6130[var231 + 1] = class409.field6130[var231];
                                }
                                if (~class106.field1413 == -1) {
                                    class409.field6130 = new class311[100];
                                }
                                class409.field6130[var229 + 1] = var228;
                                ++class106.field1413;
                                if (var223.equals(class100.field1350.field2756)) {
                                    class425.field6326 = var225;
                                }
                            } else {
                                if (~class106.field1413 == -1) {
                                    class188.field2551 = -1;
                                    return true;
                                }
                                boolean var232 = false;
                                int var233;
                                for (var233 = 0; ~class106.field1413 < ~var233 && (!class409.field6130[var233].field4443.equals(var223) || ~class409.field6130[var233].field4455 != ~var224); ++var233) {
                                }
                                if (~class106.field1413 < ~var233) {
                                    while (~var233 > ~(class106.field1413 + -1)) {
                                        class409.field6130[var233] = class409.field6130[var233 + 1];
                                        ++var233;
                                    }
                                    --class106.field1413;
                                    class409.field6130[class106.field1413] = null;
                                }
                            }
                            class126.field1675 = class381.field5717;
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -59) {
                            int var234 = class114.field1556.method1666(-2);
                            int var235 = class114.field1556.method1685(8104);
                            if (~var234 > 69999) {
                                var235 += 32768;
                            }
                            class249 var236;
                            if (var234 >= 0) {
                                var236 = class107.method746(var234, -88);
                            } else {
                                var236 = null;
                            }
                            while (class413.field6176 > class114.field1556.field3915) {
                                int var237 = class114.field1556.method1680(-1647926640);
                                int var238 = class114.field1556.method1685(8104);
                                int var239 = 0;
                                if (var238 != 0) {
                                    var239 = class114.field1556.method1697(86);
                                    if (var239 == 255) {
                                        var239 = class114.field1556.method1666(-2);
                                    }
                                }
                                if (var236 != null && ~var237 <= -1 && ~var237 > ~var236.field3567.length) {
                                    var236.field3567[var237] = var238;
                                    var236.field3585[var237] = var239;
                                }
                                class212.method1313(var239, var235, var237, var238 + -1, -21180);
                            }
                            if (var236 != null) {
                                class392.method2564(-94, var236);
                            }
                            class22.method190((byte) -87);
                            class107.field1461[class401.method2606(class33.field547++, 31)] = class401.method2606(var235, 32767);
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 107) {
                            class175.method1070(124);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -107) {
                            int var240 = class114.field1556.method1694(-1);
                            String var241 = class114.field1556.method1712(false);
                            int var242 = class114.field1556.method1709(0);
                            if (class155.method997(-25976, var240)) {
                                class273.method1747(var241, 17889, var242);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -184) {
                            int var243 = class114.field1556.method1666(-2);
                            class35.field569 = class361.field5285.method18((byte) -26, var243);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -8) {
                            int var244 = class114.field1556.method1684((byte) 79);
                            int var245 = class114.field1556.method1684((byte) 79);
                            int var246 = class114.field1556.method1709(0);
                            if (class155.method997(-25976, var245)) {
                                class442.method2791(var246, var244, 66);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -26) {
                            int var247 = class114.field1556.method1697(-106);
                            boolean var248 = ~(var247 & 1) == -2;
                            String var249 = class114.field1556.method1712(false);
                            String var250 = class114.field1556.method1712(false);
                            String var251 = class114.field1556.method1712(false);
                            String var252 = class114.field1556.method1712(false);
                            if (!var248) {
                                class272.field3982[class244.field3409] = var249;
                                if (!var250.equals("")) {
                                    class374.field5640[class244.field3409] = var250;
                                } else {
                                    class374.field5640[class244.field3409] = var249;
                                }
                                class155.field2035[class244.field3409] = var251;
                                if (!var252.equals("")) {
                                    class214.field3052[class244.field3409] = var252;
                                } else {
                                    class214.field3052[class244.field3409] = var251;
                                }
                                class41.field645[class244.field3409] = ~class401.method2606(2, var247) == -3;
                                ++class244.field3409;
                            } else {
                                for (int var253 = 0; ~class244.field3409 < ~var253; ++var253) {
                                    if (class374.field5640[var253].equals(var252)) {
                                        class272.field3982[var253] = var249;
                                        if (!var250.equals("")) {
                                            class374.field5640[var253] = var250;
                                        } else {
                                            class374.field5640[var253] = var249;
                                        }
                                        class155.field2035[var253] = var251;
                                        if (!var252.equals("")) {
                                            class214.field3052[var253] = var252;
                                        } else {
                                            class214.field3052[var253] = var251;
                                        }
                                        break;
                                    }
                                }
                            }
                            class188.field2555 = class381.field5717;
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -196) {
                            if (class404.field6020 != -1) {
                                class116.method813(class404.field6020, 4095, 0);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 159) {
                            class175.method1072(1, class114.field1556.method1712(false));
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -66) {
                            int var254 = class114.field1556.method1702(4095);
                            int var255 = class114.field1556.method1685(8104);
                            if (class155.method997(-25976, var255)) {
                                class224.field3168 = var254;
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -245) {
                            int var256 = class114.field1556.method1685(8104);
                            if (class155.method997(-25976, var256)) {
                                class107.method744(0);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 134) {
                            int var257 = class114.field1556.method1697(101);
                            if (class114.field1556.method1697(-51) != 0) {
                                --class114.field1556.field3915;
                                class349.field5178[var257] = new class398(class114.field1556);
                            } else {
                                class349.field5178[var257] = new class398();
                            }
                            class188.field2551 = -1;
                            class246.field3424 = class381.field5717;
                            return true;
                        } else if (class188.field2551 == 157) {
                            int var258 = class114.field1556.method1685(8104);
                            int var259 = class114.field1556.method1697(83);
                            int var260 = class114.field1556.method1697(119);
                            int var261 = class114.field1556.method1697(-78);
                            int var262 = class114.field1556.method1697(-92);
                            int var263 = class114.field1556.method1685(8104);
                            if (class155.method997(-25976, var258)) {
                                class408.field6122[var259] = true;
                                class291.field4207[var259] = var260;
                                class395.field5936[var259] = var261;
                                class387.field5780[var259] = var262;
                                class417.field6218[var259] = var263;
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -220) {
                            int var264 = class114.field1556.method1705(false);
                            int var265 = class114.field1556.method1682(65280);
                            if (class155.method997(-25976, var264)) {
                                class52.method361(-1, 3, (byte) 67, var265, -1);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -123) {
                            int var266 = class114.field1556.method1697(-124);
                            int var267 = var266 >> 5;
                            int var268 = 31 & var266;
                            if (~var268 == -1) {
                                class314.field4503[var267] = null;
                                class188.field2551 = -1;
                                return true;
                            } else {
                                class130 var269 = new class130();
                                var269.field1740 = var268;
                                var269.field1748 = class114.field1556.method1697(97);
                                if (var269.field1748 >= 0 && class188.field2553.length > var269.field1748) {
                                    if (var269.field1740 != 1 && ~var269.field1740 != -11) {
                                        if (~var269.field1740 <= -3 && var269.field1740 <= 6) {
                                            if (var269.field1740 == 2) {
                                                var269.field1736 = 64;
                                                var269.field1741 = 64;
                                            }
                                            if (~var269.field1740 == -4) {
                                                var269.field1741 = 64;
                                                var269.field1736 = 0;
                                            }
                                            if (~var269.field1740 == -5) {
                                                var269.field1736 = 128;
                                                var269.field1741 = 64;
                                            }
                                            if (var269.field1740 == 5) {
                                                var269.field1736 = 64;
                                                var269.field1741 = 0;
                                            }
                                            if (var269.field1740 == 6) {
                                                var269.field1741 = 128;
                                                var269.field1736 = 64;
                                            }
                                            var269.field1740 = 2;
                                            var269.field1732 = class114.field1556.method1685(8104);
                                            var269.field1742 = class114.field1556.method1685(8104);
                                            var269.field1737 = class114.field1556.method1697(-127);
                                            var269.field1739 = class114.field1556.method1685(8104);
                                        }
                                    } else {
                                        var269.field1731 = class114.field1556.method1685(8104);
                                        class114.field1556.field3915 += 5;
                                    }
                                    var269.field1744 = class114.field1556.method1685(8104);
                                    if (~var269.field1744 == -65536) {
                                        var269.field1744 = -1;
                                    }
                                    class314.field4503[var267] = var269;
                                }
                                class188.field2551 = -1;
                                return true;
                            }
                        } else if (class188.field2551 == 208) {
                            class169.field2214 = class114.field1556.method1697(84);
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 61) {
                            int var270 = class114.field1556.method1709(0);
                            int var271 = class114.field1556.method1664(-107);
                            int var272 = class114.field1556.method1694(-1);
                            if (class155.method997(-25976, var272)) {
                                class407.method2646(var270, var271, 5);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -75) {
                            class132.field1766 = class114.field1556.method1697(-106);
                            class391.field5859 = class114.field1556.method1697(-79);
                            class11.field136 = class114.field1556.method1697(62);
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 169) {
                            class191.method1185((byte) -112);
                            class22.method190((byte) -127);
                            class407.field6102 += 32;
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 20) {
                            boolean var273 = class114.field1556.method1697(110) == 1;
                            String var274 = class114.field1556.method1712(false);
                            String var275 = class114.field1556.method1712(false);
                            int var276 = class114.field1556.method1685(8104);
                            int var277 = class114.field1556.method1697(85);
                            String var278 = "";
                            boolean var279 = false;
                            if (~var276 < -1) {
                                var278 = class114.field1556.method1712(false);
                                var279 = ~class114.field1556.method1697(-89) == -2;
                            }
                            for (int var280 = 0; class26.field463 > var280; ++var280) {
                                if (var273) {
                                    if (var275.equals(class164.field2128[var280])) {
                                        class164.field2128[var280] = var274;
                                        var274 = null;
                                        class124.field1654[var280] = var275;
                                        break;
                                    }
                                } else if (var274.equals(class164.field2128[var280])) {
                                    if (~class205.field2964[var280] != ~var276) {
                                        class205.field2964[var280] = var276;
                                        if (var276 > 0) {
                                            class215.method1352("", 5, -80, "", 0, var274 + class219.field3104);
                                        }
                                        if (~var276 == -1) {
                                            class215.method1352("", 5, -111, "", 0, var274 + class220.field3141);
                                        }
                                    }
                                    class124.field1654[var280] = var275;
                                    class272.field3994[var280] = var278;
                                    class355.field5210[var280] = var277;
                                    class35.field566[var280] = var279;
                                    var274 = null;
                                    break;
                                }
                            }
                            if (var274 != null && class26.field463 < 200) {
                                class164.field2128[class26.field463] = var274;
                                class124.field1654[class26.field463] = var275;
                                class205.field2964[class26.field463] = var276;
                                class272.field3994[class26.field463] = var278;
                                class355.field5210[class26.field463] = var277;
                                class35.field566[class26.field463] = var279;
                                ++class26.field463;
                            }
                            class188.field2555 = class381.field5717;
                            boolean var281 = false;
                            int var282 = class26.field463;
                            while (~var282 < -1) {
                                --var282;
                                boolean var283 = true;
                                for (int var284 = 0; ~var284 > ~var282; ++var284) {
                                    if (~class205.field2964[var284] != ~class163.field2123 && ~class205.field2964[var284 + 1] == ~class163.field2123 || class205.field2964[var284] == 0 && class205.field2964[var284 - -1] != 0) {
                                        int var285 = class205.field2964[var284];
                                        class205.field2964[var284] = class205.field2964[var284 + 1];
                                        class205.field2964[var284 + 1] = var285;
                                        String var286 = class272.field3994[var284];
                                        class272.field3994[var284] = class272.field3994[var284 - -1];
                                        class272.field3994[var284 + 1] = var286;
                                        String var287 = class164.field2128[var284];
                                        class164.field2128[var284] = class164.field2128[var284 + 1];
                                        class164.field2128[var284 + 1] = var287;
                                        String var288 = class124.field1654[var284];
                                        class124.field1654[var284] = class124.field1654[var284 + 1];
                                        class124.field1654[var284 + 1] = var288;
                                        int var289 = class355.field5210[var284];
                                        class355.field5210[var284] = class355.field5210[var284 + 1];
                                        class355.field5210[var284 + 1] = var289;
                                        boolean var290 = class35.field566[var284];
                                        class35.field566[var284] = class35.field566[var284 + 1];
                                        class35.field566[var284 + 1] = var290;
                                        var283 = false;
                                    }
                                }
                                if (var283) {
                                    break;
                                }
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 206) {
                            int var291 = class114.field1556.method1684((byte) 79);
                            int var292 = class114.field1556.method1671(-16777216);
                            int var293 = class114.field1556.method1709(0);
                            if (class155.method997(-25976, var291)) {
                                class158 var294 = (class158) class269.field3933.method954(90, (long) var292);
                                class158 var295 = (class158) class269.field3933.method954(108, (long) var293);
                                if (var295 != null) {
                                    class318.method1975(var294 == null || var294.field2075 != var295.field2075, 25697, var295, false);
                                }
                                if (var294 != null) {
                                    var294.method2574((byte) 114);
                                    class269.field3933.method956(false, (long) var293, var294);
                                }
                                class249 var296 = class107.method746(var292, -31);
                                if (var296 != null) {
                                    class392.method2564(-92, var296);
                                }
                                class249 var297 = class107.method746(var293, -73);
                                if (var297 != null) {
                                    class392.method2564(-90, var297);
                                    class272.method1743(68, var297, true);
                                }
                                if (~class404.field6020 != 0) {
                                    class116.method813(class404.field6020, 4095, 1);
                                }
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 127) {
                            int var298 = class114.field1556.method1697(-73);
                            int var299 = class114.field1556.method1697(-33);
                            if (~var298 == -256) {
                                var298 = -1;
                                var299 = -1;
                            }
                            class383.method2518(var299, var298, (byte) 126);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -82) {
                            class114.field1556.field3915 += 28;
                            if (class114.field1556.method1722(-76)) {
                                class442.method2793(class114.field1556, class114.field1556.field3915 + -28, 20164);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -42) {
                            int var300 = class114.field1556.method1665(14684);
                            int var301 = class114.field1556.method1684((byte) 79);
                            int var302 = class114.field1556.method1684((byte) 79);
                            class129 var303 = class23.field408[var302];
                            if (var303 != null) {
                                class192.method1193(0, var303, var301, var300);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -45) {
                            int var304 = class114.field1556.method1685(8104);
                            int var305 = class114.field1556.method1697(-34);
                            int var306 = class114.field1556.method1697(-122);
                            int var307 = class114.field1556.method1685(8104);
                            int var308 = class114.field1556.method1697(59);
                            int var309 = class114.field1556.method1697(64);
                            if (class155.method997(-25976, var304)) {
                                class261.method1640(var306, var307, var309, -1260, var305, var308);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -142) {
                            String var310 = class114.field1556.method1712(false);
                            int var311 = class114.field1556.method1685(8104);
                            String var312 = class284.method1804(var311, (byte) 98).method371(class114.field1556, -8507);
                            class316.method1968(var310, var310, -23645, 19, var312, 0, (String) null, var311);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -147) {
                            class151.method987(true, true);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -132) {
                            String var313 = class114.field1556.method1712(false);
                            int var314 = class114.field1556.method1685(8104);
                            int var315 = class114.field1556.method1694(-1);
                            if (class155.method997(-25976, var315)) {
                                class166.method1032(var314, true, var313);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 147) {
                            int var316 = class114.field1556.method1685(8104);
                            int var317 = class114.field1556.method1685(8104);
                            int var318 = class114.field1556.method1685(8104);
                            int var319 = class114.field1556.method1685(8104);
                            if (class155.method997(-25976, var316) && class119.field1607[var317] != null) {
                                for (int var320 = var318; var320 < var319; ++var320) {
                                    int var321 = class114.field1556.method1691(false);
                                    if (~class119.field1607[var317].length < ~var320 && class119.field1607[var317][var320] != null) {
                                        class119.field1607[var317][var320].field3507 = var321;
                                    }
                                }
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -4) {
                            int var322 = class114.field1556.method1705(false);
                            int var323 = class114.field1556.method1665(14684);
                            int var324 = class114.field1556.method1709(0);
                            if (class155.method997(-25976, var322)) {
                                class177.method1080(-1, var323, var324);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -189) {
                            int var325 = class114.field1556.method1694(-1);
                            if (~var325 == -65536) {
                                var325 = -1;
                            }
                            int var326 = class114.field1556.method1665(14684);
                            class41.method315(true, var325, var326);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -31) {
                            int var327 = class114.field1556.method1697(71);
                            int var328 = class114.field1556.method1701((byte) 100);
                            int var329 = class114.field1556.method1694(-1);
                            if (~var329 == -65536) {
                                var329 = -1;
                            }
                            class258.method1625(var329, var327, 1, var328);
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 104) {
                            class126.method863(class114.field1556, class361.field5285, class413.field6176, (byte) 77);
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 200) {
                            int var330 = class114.field1556.method1685(8104);
                            if (class155.method997(-25976, var330)) {
                                class91.method562((byte) -58);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -54) {
                            int var331 = class114.field1556.method1709(0);
                            int var332 = class114.field1556.method1705(false);
                            int var333 = class114.field1556.method1684((byte) 79);
                            if (class155.method997(-25976, var332)) {
                                class124.method852(var333, var331, (byte) 61);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -84) {
                            int var334 = class114.field1556.method1674((byte) 99);
                            int var335 = class114.field1556.method1674((byte) -125);
                            int var336 = class114.field1556.method1697(-35);
                            class193.field2688 = var336 >> 1;
                            class100.field1350.method1215((var336 & 1) == 1, true, var334, class193.field2688, var335);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -119) {
                            int var337 = class114.field1556.method1671(-16777216);
                            int var338 = class114.field1556.method1709(0);
                            int var339 = class114.field1556.method1684((byte) 79);
                            int var340 = class114.field1556.method1685(8104);
                            if (class155.method997(-25976, var340)) {
                                class52.method361(var338, 5, (byte) 67, var337, var339);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -71) {
                            int var341 = class114.field1556.method1685(8104);
                            String var342 = class114.field1556.method1712(false);
                            Object[] var343 = new Object[1 + var342.length()];
                            for (int var344 = -1 + var342.length(); ~var344 <= -1; --var344) {
                                if (var342.charAt(var344) != 's') {
                                    var343[var344 + 1] = new Integer(class114.field1556.method1666(-2));
                                } else {
                                    var343[var344 + 1] = class114.field1556.method1712(false);
                                }
                            }
                            var343[0] = new Integer(class114.field1556.method1666(-2));
                            if (class155.method997(-25976, var341)) {
                                class228 var345 = new class228();
                                var345.field3215 = var343;
                                class365.method2395(var345);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 160) {
                            int var346 = class114.field1556.method1694(-1);
                            int var347 = class114.field1556.method1671(-16777216);
                            int var348 = class114.field1556.method1664(-112);
                            int var349 = class114.field1556.method1661((byte) -34);
                            if (class155.method997(-25976, var346)) {
                                class288.method1822(var349, 64, var348, var347);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 76) {
                            class151.method987(false, true);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -244) {
                            int var350 = class114.field1556.method1671(-16777216);
                            int var351 = class114.field1556.method1685(8104);
                            class104.method711(var351, 113, var350);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -137) {
                            int var352 = class114.field1556.method1685(8104);
                            if (~var352 == -65536) {
                                var352 = -1;
                            }
                            int var353 = class114.field1556.method1697(77);
                            int var354 = class114.field1556.method1685(8104);
                            int var355 = class114.field1556.method1697(-16);
                            class192.method1194(0, var355, var354, var352, var353);
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -93) {
                            String var356 = class114.field1556.method1712(false);
                            String var357 = class297.method1886(0, class323.method1998(63, class8.method62(class114.field1556, 32767)));
                            class215.method1352(var356, 6, -50, var356, 0, var357);
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 2) {
                            class185.field2522 = class114.field1556.method1665(14684);
                            class313.field4488 = class114.field1556.method1665(14684);
                            while (class413.field6176 > class114.field1556.field3915) {
                                class188.field2551 = class114.field1556.method1697(126);
                                class394.method2581((byte) -93);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (class188.field2551 == 193) {
                            int var358 = class114.field1556.method1680(-1647926640);
                            int var359 = class114.field1556.method1666(-2);
                            int var360 = class114.field1556.method1697(94);
                            String var361 = "";
                            String var362 = var361;
                            if (~(var360 & 1) != -1) {
                                var361 = class114.field1556.method1712(false);
                                if ((var360 & 2) == 0) {
                                    var362 = var361;
                                } else {
                                    var362 = class114.field1556.method1712(false);
                                }
                            }
                            String var363 = class114.field1556.method1712(false);
                            if (~var358 != -100) {
                                if (!var362.equals("") && class24.method216(var362, -122)) {
                                    class188.field2551 = -1;
                                    return true;
                                }
                                class215.method1352(var362, var358, -110, var361, var359, var363);
                            } else {
                                class319.method1979(-54, var363);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 == -237) {
                            class322.method1992(2);
                            class188.field2551 = -1;
                            return false;
                        } else if (class188.field2551 == 121) {
                            int var364 = class114.field1556.method1685(8104);
                            int var365 = class114.field1556.method1697(-95);
                            int var366 = class114.field1556.method1697(-111);
                            int var367 = class114.field1556.method1685(8104);
                            int var368 = class114.field1556.method1697(-53);
                            int var369 = class114.field1556.method1697(-118);
                            if (class155.method997(-25976, var364)) {
                                class318.method1976(true, (byte) 90, var368, var367, var365, var369, var366);
                            }
                            class188.field2551 = -1;
                            return true;
                        } else if (~class188.field2551 != -114) {
                            if (class188.field2551 == 5) {
                                class255.field3722 = class114.field1556.method1697(61);
                                class188.field2555 = class381.field5717;
                                class188.field2551 = -1;
                                return true;
                            } else {
                                int var380 = -41 % ((arg0 - 61) / 37);
                                if (class188.field2551 == 0) {
                                    class22.method190((byte) -67);
                                    class280.field4126 = class114.field1556.method1698(1625554944);
                                    class1.field4 = class381.field5717;
                                    class188.field2551 = -1;
                                    return true;
                                } else {
                                    class226.method1406("T1 - " + class188.field2551 + "," + class227.field3199 + "," + class313.field4484 + " - " + class413.field6176, (Throwable) null, 0);
                                    class322.method1992(2);
                                    return true;
                                }
                            }
                        } else {
                            int var370 = class114.field1556.method1666(-2);
                            int var371 = class114.field1556.method1684((byte) 79);
                            if (~var371 == -65536) {
                                var371 = -1;
                            }
                            int var372 = class114.field1556.method1684((byte) 79);
                            if (~var372 == -65536) {
                                var372 = -1;
                            }
                            int var373 = class114.field1556.method1694(-1);
                            int var374 = class114.field1556.method1671(-16777216);
                            if (class155.method997(-25976, var373)) {
                                for (int var375 = var372; var371 >= var375; ++var375) {
                                    long var376 = ((long) var374 << 32) + (long) var375;
                                    class185 var378 = (class185) class134.field1786.method954(57, var376);
                                    class185 var379;
                                    if (var378 == null) {
                                        if (~var375 == 0) {
                                            var379 = new class185(var370, class107.method746(var374, -87).field3565.field2515);
                                        } else {
                                            var379 = new class185(var370, -1);
                                        }
                                    } else {
                                        var379 = new class185(var370, var378.field2515);
                                        var378.method2574((byte) 119);
                                    }
                                    class134.field1786.method956(false, var376, var379);
                                }
                            }
                            class188.field2551 = -1;
                            return true;
                        }
                    } else {
                        class394.method2581((byte) -93);
                        class188.field2551 = -1;
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILnr;)V", line = 4087)
    public static final void method517(int arg0, int arg1, class437 arg2) {
        ++field1140;
        class127.method867(arg2);
        if (arg0 > 1) {
            for (int var3 = 0; var3 < class324.field4652; ++var3) {
                for (int var4 = 0; ~class336.field4964 < ~var4; ++var4) {
                    if ((2 & class37.field606[1][var3][var4]) == 2) {
                        class159.method1005(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; ~var5 > ~arg0; ++var5) {
            for (int var6 = 0; class336.field4964 >= var6; ++var6) {
                for (int var7 = 0; ~class324.field4652 <= ~var7; ++var7) {
                    if (~(1 & class451.field6578[var5][var7][var6]) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (class336.field4964 > var9 && ~(class451.field6578[var5][var7][var9 + 1] & 1) != -1) {
                            ++var9;
                        }
                        while (var8 > 0 && ~(1 & class451.field6578[var5][var7][var8 - 1]) != -1) {
                            --var8;
                        }
                        label170: while (var10 > 0) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if ((1 & class451.field6578[var10 - 1][var7][var12]) == 0) {
                                    break label170;
                                }
                            }
                            --var10;
                        }
                        label159: while (~var11 > -4) {
                            for (int var13 = var8; var13 <= var9; ++var13) {
                                if (~(class451.field6578[var11 - -1][var7][var13] & 1) == -1) {
                                    break label159;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + var9 + 1) * (-var10 + var11 + 1);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = class128.field1703[var11][var7][var8] + -var15;
                            int var17 = class128.field1703[var10][var7][var8];
                            class168.method1046(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var11 >= var18; ++var18) {
                                for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                    class451.field6578[var18][var7][var19] = (byte) class401.method2606(class451.field6578[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(class451.field6578[var5][var7][var6] & 2) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (~var20 < -1 && ~(class451.field6578[var5][var20 + -1][var6] & 2) != -1) {
                            --var20;
                        }
                        while (class324.field4652 > var21 && ~(class451.field6578[var5][var21 + 1][var6] & 2) != -1) {
                            ++var21;
                        }
                        label223: while (var22 > 0) {
                            for (int var24 = var20; ~var21 <= ~var24; ++var24) {
                                if ((2 & class451.field6578[var22 + -1][var24][var6]) == 0) {
                                    break label223;
                                }
                            }
                            --var22;
                        }
                        label212: while (~var23 > -4) {
                            for (int var25 = var20; var25 <= var21; ++var25) {
                                if ((class451.field6578[var23 + 1][var25][var6] & 2) == 0) {
                                    break label212;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var21 - var20 + 1) * (var23 + 1 + -var22);
                        if (~var26 <= -3) {
                            short var27 = 240;
                            int var28 = class128.field1703[var23][var20][var6] + -var27;
                            int var29 = class128.field1703[var22][var20][var6];
                            class168.method1046(2, var20 * 128, var21 * 128 - -128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; ++var30) {
                                for (int var31 = var20; var31 <= var21; ++var31) {
                                    class451.field6578[var30][var31][var6] = (byte) class401.method2606(class451.field6578[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(class451.field6578[var5][var7][var6] & 4) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; var34 > 0 && ~(4 & class451.field6578[var5][var7][var34 + -1]) != -1; --var34) {
                        }
                        int var35;
                        for (var35 = var6; ~class336.field4964 < ~var35 && (4 & class451.field6578[var5][var7][var35 + 1]) != 0; ++var35) {
                        }
                        label276: while (var32 > 0) {
                            for (int var36 = var34; var35 >= var36; ++var36) {
                                if (~(4 & class451.field6578[var5][var32 + -1][var36]) == -1) {
                                    break label276;
                                }
                            }
                            --var32;
                        }
                        label265: while (~class324.field4652 < ~var33) {
                            for (int var37 = var34; var37 <= var35; ++var37) {
                                if (~(class451.field6578[var5][var33 + 1][var37] & 4) == -1) {
                                    break label265;
                                }
                            }
                            ++var33;
                        }
                        if (~((-var32 + var33 + 1) * (-var34 + 1 + var35)) <= -5) {
                            int var38 = class128.field1703[var5][var32][var34];
                            class168.method1046(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var33 >= var39; ++var39) {
                                for (int var40 = var34; ~var40 >= ~var35; ++var40) {
                                    class451.field6578[var5][var39][var40] = (byte) class401.method2606(class451.field6578[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -1) {
            field1131 = -2L;
        }
    }
}
