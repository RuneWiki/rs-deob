import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class111 extends class114 {

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    public static int field1596 = 0;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "J")
    public static long field1592 = 0L;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "[Lel;")
    public static class82[] field1589 = new class82[14];

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "B")
    public static byte field1587;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)V")
    public static final void method706(boolean arg0) {
        ++field1599;
        if (!(class97.field1401 < class97.field1407)) {
            if (class97.field1407 < class97.field1401) {
                class97.field1401 = (float) ((double) class97.field1401 - (double) class97.field1401 / 30.0D);
                if (class97.field1407 > class97.field1401) {
                    class97.field1401 = class97.field1407;
                }
                class163.method1040(0);
            }
        } else {
            class97.field1401 = (float) ((double) class97.field1401 / 30.0D + (double) class97.field1401);
            if (class97.field1401 > class97.field1407) {
                class97.field1401 = class97.field1407;
            }
            class163.method1040(0);
        }
        if (class170.field2422 != -1 && class145.field2008 != -1) {
            int var1 = class170.field2422 - class223.field3477;
            int var2 = -class311.field5005 + class145.field2008;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 4;
            }
            class223.field3477 -= -var1;
            if (~var2 > -3 || ~var2 < -3) {
                var2 >>= 4;
            }
            class311.field5005 += var2;
            if (var1 == 0 && ~var2 == -1) {
                class170.field2422 = -1;
                class145.field2008 = -1;
            }
            class163.method1040(0);
        }
        if (class307.field4931 > 0) {
            --class34.field520;
            if (class34.field520 == 0) {
                class34.field520 = 100;
                --class307.field4931;
            }
        } else {
            class109.field1554 = -1;
            class14.field227 = -1;
        }
        if (class84.field1190 && class116.field1675 != null) {
            for (class187 var3 = (class187) class116.field1675.method369((byte) -95); var3 != null; var3 = (class187) class116.field1675.method362(arg0)) {
                class149 var4 = class121.method784(84, var3.field2842.field3688);
                if (~class69.field991 == -1 && var3.method1184(class249.field3891, -17820, class17.field304)) {
                    if (!var3.field2842.field3695) {
                        var3.field2842.field3695 = true;
                        class234.method1536(var3.field2842.field3688, 99, 15, var4.field2059);
                    }
                    if (var3.field2842.field3695) {
                        class234.method1536(var3.field2842.field3688, 53, 17, var4.field2059);
                    }
                } else if (var3.field2842.field3695) {
                    var3.field2842.field3695 = false;
                    class234.method1536(var3.field2842.field3688, 116, 16, var4.field2059);
                }
            }
        }
        if (arg0) {
            method712((class256) null, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field1595;
        if (arg0 != -112) {
            return null;
        } else {
            int[][] var3 = super.field1627.method104(arg1, (byte) 115);
            if (super.field1627.field280) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class145.field2009; ++var7) {
                    var4[var7] = this.field1602;
                    var5[var7] = this.field1586;
                    var6[var7] = this.field1590;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(Z)V")
    public static void method707(boolean arg0) {
        if (arg0) {
            field1589 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
    public static final void method708(byte arg0) {
        class192.field2925.method944(114);
        ++field1593;
        if (arg0 < 24) {
            field1596 = 113;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLnh;)V")
    public static final void method709(byte arg0, class305 arg1) {
        class5.field39 = arg1;
        ++field1594;
        if (arg0 < 37) {
            method707(false);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(BI)V")
    private final void method710(byte arg0, int arg1) {
        ++field1600;
        this.field1590 = arg1 << 4 & 4080;
        this.field1602 = (arg1 & 16711680) >> 12;
        this.field1586 = 4080 & arg1 >> 4;
        if (arg0 >= -86) {
            field1589 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
    private class111(int arg0) {
        super(0, false);
        this.method710((byte) -121, arg0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIB)V")
    public static final void method711(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field1591;
        if (arg5 != 34) {
            method707(false);
        }
        if (~arg1 >= ~class311.field5001 && class271.field4322 <= arg0) {
            boolean var6;
            if (arg3 < class261.field4204) {
                arg3 = class261.field4204;
                var6 = false;
            } else if (~class18.field310 <= ~arg3) {
                var6 = true;
            } else {
                arg3 = class18.field310;
                var6 = false;
            }
            boolean var7;
            if (~class261.field4204 >= ~arg4) {
                if (~class18.field310 > ~arg4) {
                    arg4 = class18.field310;
                    var7 = false;
                } else {
                    var7 = true;
                }
            } else {
                var7 = false;
                arg4 = class261.field4204;
            }
            if (arg1 >= class271.field4322) {
                class129.method822(class247.field3876[arg1++], arg3, -2426, arg2, arg4);
            } else {
                arg1 = class271.field4322;
            }
            if (class311.field5001 < arg0) {
                arg0 = class311.field5001;
            } else {
                class129.method822(class247.field3876[arg0--], arg3, -2426, arg2, arg4);
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg0; ++var8) {
                    int[] var9 = class247.field3876[var8];
                    var9[arg3] = var9[arg4] = arg2;
                }
                return;
            }
            if (var6) {
                for (int var10 = arg1; var10 <= arg0; ++var10) {
                    class247.field3876[var10][arg3] = arg2;
                }
                return;
            }
            if (var7) {
                for (int var11 = arg1; var11 <= arg0; ++var11) {
                    class247.field3876[var11][arg4] = arg2;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lcm;B)V")
    public static final void method712(class256 arg0, byte arg1) {
        ++field1597;
        if (arg0.field4045 != 0) {
            if (arg1 == 25) {
                class85 var2 = arg0.method1685(arg1 + -25);
                if (~arg0.field4047 != 0 && ~arg0.field4047 > -32769) {
                    class310 var3 = class88.field1274[arg0.field4047];
                    if (var3 != null) {
                        int var4 = arg0.field4081 - var3.field4081;
                        int var5 = arg0.field4140 - var3.field4140;
                        if (~var4 != -1 || var5 != 0) {
                            arg0.field4142 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                        }
                    }
                }
                if (~arg0.field4047 <= -32769) {
                    int var6 = arg0.field4047 + -32768;
                    if (~class305.field4917 == ~var6) {
                        var6 = 2047;
                    }
                    class314 var7 = class48.field689[var6];
                    if (var7 != null) {
                        int var8 = -var7.field4140 + arg0.field4140;
                        int var9 = -var7.field4081 + arg0.field4081;
                        if (var9 != 0 || var8 != 0) {
                            arg0.field4142 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 2047;
                        }
                    }
                }
                if ((arg0.field4125 != 0 || ~arg0.field4132 != -1) && (arg0.field4064 == 0 || ~arg0.field4068 < -1)) {
                    int var10 = -((-class228.field3570 + arg0.field4125 + -class228.field3570) * 64) + arg0.field4081;
                    int var11 = arg0.field4140 - (-class170.field2421 + arg0.field4132 - class170.field2421) * 64;
                    if (var10 != 0 || var11 != 0) {
                        arg0.field4142 = 2047 & (int) (Math.atan2((double) var10, (double) var11) * 325.949D);
                    }
                    arg0.field4125 = 0;
                    arg0.field4132 = 0;
                }
                int var12 = -arg0.field4093 + arg0.field4142 & 2047;
                if (~var12 == -1) {
                    arg0.field4094 = 0;
                    arg0.field4070 = 0;
                } else if (var2.field1228 == 0) {
                    ++arg0.field4094;
                    if (~var12 < -1025) {
                        arg0.field4093 -= arg0.field4045;
                        boolean var13 = true;
                        if (arg0.field4045 > var12 || var12 > -arg0.field4045 + 2048) {
                            arg0.field4093 = arg0.field4142;
                            var13 = false;
                        }
                        if (arg0.field4094 > 25 || var13) {
                            arg0.field4102 = var2.field1234;
                            if (~arg0.field4064 >= -1) {
                                if (var2.field1230 != -1) {
                                    arg0.field4102 = var2.field1230;
                                }
                            } else if (arg0.field4077[arg0.field4064 + -1] == 2) {
                                if (var2.field1204 != -1) {
                                    arg0.field4102 = var2.field1204;
                                } else if (var2.field1199 != -1) {
                                    arg0.field4102 = var2.field1199;
                                }
                            } else if (arg0.field4077[arg0.field4064 + -1] != 0) {
                                if (var2.field1232 != -1) {
                                    arg0.field4102 = var2.field1232;
                                }
                            } else if (var2.field1221 != -1) {
                                arg0.field4102 = var2.field1221;
                            } else if (var2.field1192 != -1) {
                                arg0.field4102 = var2.field1192;
                            }
                        }
                    } else {
                        boolean var14 = true;
                        arg0.field4093 += arg0.field4045;
                        if (arg0.field4045 > var12 || 2048 - arg0.field4045 < var12) {
                            var14 = false;
                            arg0.field4093 = arg0.field4142;
                        }
                        if (arg0.field4094 > 25 || var14) {
                            arg0.field4102 = var2.field1234;
                            if (arg0.field4064 <= 0) {
                                if (~var2.field1222 != 0) {
                                    arg0.field4102 = var2.field1222;
                                }
                            } else if (~arg0.field4077[arg0.field4064 + -1] != -3) {
                                if (arg0.field4077[arg0.field4064 + -1] == 0) {
                                    if (var2.field1227 != -1) {
                                        arg0.field4102 = var2.field1227;
                                    } else if (var2.field1192 != -1) {
                                        arg0.field4102 = var2.field1192;
                                    }
                                } else if (var2.field1218 != -1) {
                                    arg0.field4102 = var2.field1218;
                                }
                            } else if (~var2.field1193 == 0) {
                                if (var2.field1199 != -1) {
                                    arg0.field4102 = var2.field1199;
                                }
                            } else {
                                arg0.field4102 = var2.field1193;
                            }
                        }
                    }
                    arg0.field4093 &= 2047;
                } else {
                    arg0.field4102 = -1;
                    int var15 = arg0.field4142 << 5;
                    if (~arg0.field4137 != ~var15) {
                        arg0.field4137 = var15;
                        arg0.field4095 = 0;
                        int var16 = 65535 & -arg0.field4120 + var15;
                        int var17 = arg0.field4070 * arg0.field4070 / (var2.field1228 * 2);
                        if (~arg0.field4070 < -1 && var16 >= var17 && ~(-var17 + var16) > -32769) {
                            arg0.field4145 = true;
                            arg0.field4106 = var16 / 2;
                            int var18 = var2.field1195 * var2.field1195 / (var2.field1228 * 2);
                            if (~var18 < -32768) {
                                var18 = 32767;
                            }
                            if (var18 < arg0.field4106) {
                                arg0.field4106 = -var18 + var16;
                            }
                        } else if (~arg0.field4070 > -1 && -var16 + 65536 >= var17 && ~(65536 - var16 - var17) > -32769) {
                            int var19 = var2.field1195 * var2.field1195 / (var2.field1228 * 2);
                            arg0.field4145 = true;
                            if (~var19 < -32768) {
                                var19 = 32767;
                            }
                            arg0.field4106 = (-var16 + 65536) / 2;
                            if (~arg0.field4106 < ~var19) {
                                arg0.field4106 = -var16 + 65536 - var19;
                            }
                        } else {
                            arg0.field4145 = false;
                        }
                    }
                    if (arg0.field4070 != 0) {
                        if (~arg0.field4070 < -1) {
                            if (arg0.field4106 <= arg0.field4095) {
                                arg0.field4145 = false;
                            }
                            if (arg0.field4145) {
                                if (~arg0.field4070 > ~var2.field1195) {
                                    arg0.field4070 += var2.field1228;
                                }
                            } else {
                                arg0.field4070 -= var2.field1228;
                                if (arg0.field4070 < 0) {
                                    arg0.field4070 = 0;
                                }
                            }
                        } else {
                            if (arg0.field4095 >= arg0.field4106) {
                                arg0.field4145 = false;
                            }
                            if (!arg0.field4145) {
                                arg0.field4070 += var2.field1228;
                                if (~arg0.field4070 < -1) {
                                    arg0.field4070 = 0;
                                }
                            } else if (~arg0.field4070 < ~(-var2.field1195)) {
                                arg0.field4070 -= var2.field1228;
                            }
                        }
                    } else {
                        int var20 = 65535 & -arg0.field4120 + arg0.field4137;
                        if (~var2.field1228 >= ~var20) {
                            int var21 = var2.field1195 * var2.field1195 / (var2.field1228 * 2);
                            if (var21 > 32767) {
                                var21 = 32767;
                            }
                            if (var20 >= 32768) {
                                arg0.field4106 = (65536 - var20) / 2;
                                if (var21 < arg0.field4106) {
                                    arg0.field4106 = 65536 - var20 + -var21;
                                }
                                arg0.field4070 = -var2.field1228;
                            } else {
                                arg0.field4070 = var2.field1228;
                                arg0.field4106 = var20 / 2;
                                if (~var21 > ~arg0.field4106) {
                                    arg0.field4106 = -var21 + var20;
                                }
                            }
                            arg0.field4145 = true;
                            arg0.field4095 = 0;
                        } else {
                            arg0.field4120 = arg0.field4137;
                        }
                    }
                    arg0.field4120 += arg0.field4070;
                    if (arg0.field4070 > 0) {
                        arg0.field4095 += arg0.field4070;
                    } else {
                        arg0.field4095 -= arg0.field4070;
                    }
                    arg0.field4120 &= 65535;
                    arg0.field4093 = arg0.field4120 >> 5;
                    if (~arg0.field4070 > -1) {
                        if (~arg0.field4064 < -1) {
                            if (arg0.field4077[arg0.field4064 + -1] != 2) {
                                if (~arg0.field4077[arg0.field4064 + -1] == -1) {
                                    if (~var2.field1221 == 0) {
                                        if (var2.field1192 != -1) {
                                            arg0.field4102 = var2.field1192;
                                        }
                                    } else {
                                        arg0.field4102 = var2.field1221;
                                    }
                                }
                            } else if (var2.field1204 == -1) {
                                if (var2.field1199 != -1) {
                                    arg0.field4102 = var2.field1199;
                                }
                            } else {
                                arg0.field4102 = var2.field1204;
                            }
                        }
                        if (arg0.field4102 == -1) {
                            if (~var2.field1232 != 0) {
                                arg0.field4102 = var2.field1232;
                            } else if (~var2.field1230 != 0) {
                                arg0.field4102 = var2.field1230;
                            }
                        }
                    } else {
                        if (arg0.field4064 > 0) {
                            if (~arg0.field4077[arg0.field4064 + -1] != -3) {
                                if (~arg0.field4077[arg0.field4064 + -1] == -1) {
                                    if (var2.field1227 == -1) {
                                        if (~var2.field1192 != 0) {
                                            arg0.field4102 = var2.field1192;
                                        }
                                    } else {
                                        arg0.field4102 = var2.field1227;
                                    }
                                }
                            } else if (var2.field1193 != -1) {
                                arg0.field4102 = var2.field1193;
                            } else if (var2.field1199 != -1) {
                                arg0.field4102 = var2.field1199;
                            }
                        }
                        if (~arg0.field4102 == 0) {
                            if (~var2.field1218 == 0) {
                                if (~var2.field1222 != 0) {
                                    arg0.field4102 = var2.field1222;
                                }
                            } else {
                                arg0.field4102 = var2.field1218;
                            }
                        }
                    }
                    if (~arg0.field4102 == 0) {
                        arg0.field4102 = var2.field1234;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.method710((byte) -97, arg0.method1403(arg2 ^ 11046));
        }
        if (arg2 != 12953) {
            this.field1590 = -42;
        }
        ++field1601;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class111() {
        this(0);
    }
}
