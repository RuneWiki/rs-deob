import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class282 extends class232 {

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    private int field4441 = -32768;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    private int field4450 = -1;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    private int field4443 = 0;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Z")
    public boolean field4435 = false;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    private int field4437 = 0;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public int field4434;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    private int field4432;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public int field4440;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public int field4451;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public int field4439;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Lv;")
    private class80 field4438;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "J")
    public static long field4445 = 0L;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    public static int field4456 = 0;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "S")
    public static short field4454 = 32767;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4458 = null;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "Lpm;")
    public static class111 field4452 = new class111(128);

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lll;")
    private class167 field4431;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Lmf;")
    public static class53 field4433;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "[Lok;")
    public static class160[] field4449;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1995(int arg0) {
        if (class6.field72.toLowerCase().indexOf("microsoft") == -1) {
            class161.field2639[91] = 42;
            class161.field2639[93] = 43;
            if (class6.field81 == null) {
                class161.field2639[192] = 58;
                class161.field2639[222] = 59;
            } else {
                class161.field2639[222] = 58;
                class161.field2639[520] = 59;
                class161.field2639[192] = 28;
            }
            class161.field2639[47] = 73;
            class161.field2639[45] = 26;
            class161.field2639[46] = 72;
            class161.field2639[59] = 57;
            class161.field2639[61] = 27;
            class161.field2639[44] = 71;
            class161.field2639[92] = 74;
        } else {
            class161.field2639[219] = 42;
            class161.field2639[223] = 28;
            class161.field2639[220] = 74;
            class161.field2639[191] = 73;
            class161.field2639[192] = 58;
            class161.field2639[190] = 72;
            class161.field2639[187] = 27;
            class161.field2639[221] = 43;
            class161.field2639[222] = 59;
            class161.field2639[186] = 57;
            class161.field2639[189] = 26;
            class161.field2639[188] = 71;
        }
        if (arg0 != 188) {
            method2000(109, 7, 74, 89, 29, -62, -24);
        }
        field4446++;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()I", line = 71)
    public final int method152() {
        field4448++;
        return this.field4441;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIIII)V", line = 771)
    public class282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4434 = arg1;
        this.field4432 = arg0;
        this.field4457 = arg3;
        this.field4440 = arg4;
        this.field4451 = arg2;
        this.field4439 = arg5 + arg6;
        int var8 = class264.method1881((byte) 120, this.field4432).field302;
        if (var8 == -1) {
            this.field4435 = true;
        } else {
            this.field4435 = false;
            this.field4438 = class37.method236(var8, 20254);
        }
        if (this.field4439 == arg6) {
            class253.method1789(19080, this.field4457, this.field4438, this.field4437, this.field4451, false);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Llf;", line = 86)
    private final class134 method1996(int arg0) {
        if (arg0 != 59) {
            this.field4431 = (class167) null;
        }
        field4442++;
        class20 var2 = class264.method1881((byte) 107, this.field4432);
        class134 var3;
        if (this.field4435) {
            var3 = var2.method136(0, (byte) 80, -1, -1);
        } else {
            var3 = var2.method136(this.field4443, (byte) 80, this.field4450, this.field4437);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)V", line = 112)
    public final void method1997(int arg0, int arg1) {
        field4453++;
        if (this.field4435) {
            return;
        }
        this.field4443 += arg1;
        if (arg0 != -187338239) {
            this.method152();
        }
        while (this.field4438.field1223[this.field4437] < this.field4443) {
            this.field4443 -= this.field4438.field1223[this.field4437];
            this.field4437++;
            if (this.field4438.field1209.length <= this.field4437) {
                this.field4435 = true;
                break;
            }
        }
        if (!this.field4435) {
            class253.method1789(19080, this.field4457, this.field4438, this.field4437, this.field4451, false);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLkb;)V", line = 145)
    public static final void method1998(byte arg0, class39 arg1) {
        int var2 = -5 % ((50 - arg0) / 50);
        class342.field5322 = arg1;
        field4436++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIJILll;)V", line = 162)
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class167 arg10) {
        field4460++;
        class134 var13 = this.method1996(59);
        if (var13 != null) {
            var13.method153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4431);
            this.field4441 = var13.method152();
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V", line = 177)
    public static void method1999(byte arg0) {
        field4458 = null;
        if (arg0 > -84) {
            field4461 = 68;
        }
        field4449 = null;
        field4433 = null;
        field4452 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIII)V", line = 190)
    public static final void method2000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class193.field3168 = 0;
        field4447++;
        if (arg3 >= -100) {
            return;
        }
        for (int var7 = -1; var7 < (class24.field350 + class176.field2875); var7++) {
            class132 var8;
            if (var7 == -1) {
                var8 = class13.field159;
            } else if (var7 < class24.field350) {
                var8 = class100.field1523[class103.field1575[var7]];
            } else {
                var8 = class297.field4657[class128.field1906[var7 - class24.field350]];
            }
            if (var8 != null && var8.method911(120)) {
                if (var8 instanceof class196) {
                    class118 var9 = ((class196) var8).field3210;
                    if (var9.field1786 != null) {
                        var9 = var9.method819((byte) -9);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class24.field350 <= var7) {
                    class118 var10 = ((class196) var8).field3210;
                    if (var10.field1786 != null) {
                        var10 = var10.method819((byte) -9);
                    }
                    if (var10.field1805 >= 0 && var10.field1805 < class46.field629.length) {
                        int var11;
                        if (var10.field1789 == -1) {
                            var11 = var8.method895(58) + 15;
                        } else {
                            var11 = var10.field1789 + 15;
                        }
                        class84.method621(arg2 >> 1, -12200, arg5, var8, arg1, arg0 >> 1, var11);
                        if (class69.field900 > -1) {
                            class46.field629[var10.field1805].method84(class69.field900 + arg6 - 12, class329.field5122 + arg4 + -30);
                        }
                    }
                    int var12 = 0;
                    class249[] var13 = class283.field4472;
                    while (var12 < var13.length) {
                        class249 var14 = var13[var12];
                        if (var14 != null && var14.field3967 == 1 && class128.field1906[var7 - class24.field350] == var14.field3951 && class48.field648 % 20 < 10) {
                            int var15;
                            if (var10.field1789 == -1) {
                                var15 = var8.method895(93) + 15;
                            } else {
                                var15 = var10.field1789 + 15;
                            }
                            class84.method621(arg2 >> 1, -12200, arg5, var8, arg1, arg0 >> 1, var15);
                            if (class69.field900 > -1) {
                                class158.field2431[var14.field3952].method84(class69.field900 + arg6 - 12, class329.field5122 + arg4 - 28);
                            }
                        }
                        var12++;
                    }
                } else {
                    int var16 = 30;
                    class320 var17 = (class320) var8;
                    if (var17.field5014 != -1 || var17.field4990 != -1) {
                        class84.method621(arg2 >> 1, -12200, arg5, var8, arg1, arg0 >> 1, var8.method895(112) + 15);
                        if (class69.field900 > -1) {
                            if (var17.field5014 != -1) {
                                class338.field5243[var17.field5014].method84(class69.field900 + arg6 - 12, -var16 + arg4 - -class329.field5122);
                                var16 += 25;
                            }
                            if (var17.field4990 != -1) {
                                class46.field629[var17.field4990].method84(class69.field900 + arg6 - 12, -var16 + class329.field5122 + arg4);
                                var16 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var18 = 0;
                        class249[] var19 = class283.field4472;
                        while (var19.length > var18) {
                            class249 var20 = var19[var18];
                            if (var20 != null && var20.field3967 == 10 && class103.field1575[var7] == var20.field3951) {
                                class84.method621(arg2 >> 1, -12200, arg5, var8, arg1, arg0 >> 1, var8.method895(93) + 15);
                                if (class69.field900 > -1) {
                                    class158.field2431[var20.field3952].method84(class69.field900 + arg6 - 12, class329.field5122 + arg4 + -var16);
                                }
                            }
                            var18++;
                        }
                    }
                }
                if (var8.field1949 != null && (var7 >= class24.field350 || class249.field3962 == 0 || class249.field3962 == 3 || class249.field3962 == 1 && class188.method1329((byte) 39, ((class320) var8).field5003))) {
                    class84.method621(arg2 >> 1, -12200, arg5, var8, arg1, arg0 >> 1, var8.method895(-104));
                    if (class69.field900 > -1 && class2.field13 > class193.field3168) {
                        class2.field7[class193.field3168] = class55.field732.method995(var8.field1949) / 2;
                        class2.field12[class193.field3168] = class55.field732.field2154;
                        class2.field9[class193.field3168] = class69.field900;
                        class2.field5[class193.field3168] = class329.field5122;
                        class2.field8[class193.field3168] = var8.field2032;
                        class2.field16[class193.field3168] = var8.field1961;
                        class2.field14[class193.field3168] = var8.field2028;
                        class2.field4[class193.field3168] = var8.field1949;
                        class193.field3168++;
                    }
                }
                if (var8.field1992 > class48.field648) {
                    class321 var21 = class337.field5235[0];
                    class321 var22 = class337.field5235[1];
                    int var26;
                    if (var8 instanceof class196) {
                        class196 var23 = (class196) var8;
                        class321[] var24 = (class321[]) ((class321[]) class187.field3040.method1619((long) var23.field3210.field1787, 102));
                        if (var24 == null) {
                            var24 = class305.method2132(var23.field3210.field1787, class149.field2248, 256, 0);
                            if (var24 != null) {
                                class187.field3040.method1621((long) var23.field3210.field1787, -105, var24);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[1];
                            var21 = var24[0];
                        }
                        class118 var25 = var23.field3210;
                        if (var25.field1789 == -1) {
                            var26 = var8.method895(119);
                        } else {
                            var26 = var25.field1789;
                        }
                    } else {
                        var26 = var8.method895(119);
                    }
                    class84.method621(arg2 >> 1, -12200, arg5, var8, arg1, arg0 >> 1, var26 + var21.field5030 + 10);
                    if (class69.field900 > -1) {
                        int var27 = arg6 + class69.field900 - (var21.field5040 >> 1);
                        int var28 = class329.field5122 + arg4 - 3;
                        var21.method84(var27, var28);
                        int var29 = var21.field5030;
                        int var30 = var8.field2040 * var21.field5040 / 255;
                        if (class186.field2991) {
                            class344.method2379(var27, var28, var27 + var30, var28 - -var29);
                        } else {
                            class216.method1577(var27, var28, var27 + var30, var28 + var29);
                        }
                        var22.method84(var27, var28);
                        if (class186.field2991) {
                            class344.method2376(arg6, arg4, arg2 + arg6, arg0 + arg4);
                        } else {
                            class216.method1571(arg6, arg4, arg2 + arg6, arg0 + arg4);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class48.field648 < var8.field2030[var31]) {
                        int var34;
                        if (var8 instanceof class196) {
                            class196 var32 = (class196) var8;
                            class118 var33 = var32.field3210;
                            if (var33.field1789 == -1) {
                                var34 = var8.method895(-88) / 2;
                            } else {
                                var34 = var33.field1789 / 2;
                            }
                        } else {
                            var34 = var8.method895(-84) / 2;
                        }
                        class84.method621(arg2 >> 1, -12200, arg5, var8, arg1, arg0 >> 1, var34);
                        if (class69.field900 > -1) {
                            if (var31 == 1) {
                                class329.field5122 -= 20;
                            }
                            if (var31 == 2) {
                                class329.field5122 -= 10;
                                class69.field900 -= 15;
                            }
                            if (var31 == 3) {
                                class69.field900 += 15;
                                class329.field5122 -= 10;
                            }
                            class59.field783[var8.field1942[var31]].method84(arg6 + class69.field900 - 12, class329.field5122 + arg4 + -12);
                            class99.field1516.method1001(Integer.toString(var8.field2034[var31]), arg6 + class69.field900 - 1, class329.field5122 + arg4 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class193.field3168; var35++) {
            int var36 = class2.field5[var35];
            int var37 = class2.field7[var35];
            int var38 = class2.field9[var35];
            int var39 = class2.field12[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((class2.field5[var41] - class2.field12[var41]) < (var36 + 2) && (class2.field5[var41] + 2) > (var36 - var39) && (class2.field9[var41] + class2.field7[var41]) > (var38 - var37) && var37 + var38 > class2.field9[var41] + -class2.field7[var41] && class2.field5[var41] - class2.field12[var41] < var36) {
                        var36 = class2.field5[var41] - class2.field12[var41];
                        var40 = true;
                    }
                }
            }
            class69.field900 = class2.field9[var35];
            class329.field5122 = class2.field5[var35] = var36;
            String var42 = class2.field4[var35];
            if (class48.field665 == 0) {
                int var43 = 16776960;
                if (class2.field8[var35] < 6) {
                    var43 = class264.field4186[class2.field8[var35]];
                }
                if (class2.field8[var35] == 6) {
                    var43 = class162.field2649 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class2.field8[var35] == 7) {
                    var43 = (class162.field2649 % 20) >= 10 ? 65535 : 255;
                }
                if (class2.field8[var35] == 8) {
                    var43 = class162.field2649 % 20 < 10 ? 45056 : 8454016;
                }
                if (class2.field8[var35] == 9) {
                    int var44 = 150 - class2.field14[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - ((var44 - 50) * 327680);
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class2.field8[var35] == 10) {
                    int var45 = 150 - class2.field14[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 33095935 - var45 * 327680;
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 + 255 + 500 - (var45 * 5) - 32768000;
                    }
                }
                if (class2.field8[var35] == 11) {
                    int var46 = 150 - class2.field14[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = var46 * 327685 - 16318970;
                    } else if (var46 < 150) {
                        var43 = 16777215 - ((var46 - 100) * 327680);
                    }
                }
                if (class2.field16[var35] == 0) {
                    class55.field732.method1001(var42, class69.field900 + arg6, class329.field5122 + arg4, var43, 0);
                }
                if (class2.field16[var35] == 1) {
                    class55.field732.method994(var42, arg6 + class69.field900, class329.field5122 + arg4, var43, 0, class162.field2649);
                }
                if (class2.field16[var35] == 2) {
                    class55.field732.method1002(var42, arg6 + class69.field900, class329.field5122 + arg4, var43, 0, class162.field2649);
                }
                if (class2.field16[var35] == 3) {
                    class55.field732.method1012(var42, class69.field900 + arg6, arg4 - -class329.field5122, var43, 0, class162.field2649, 150 - class2.field14[var35]);
                }
                if (class2.field16[var35] == 4) {
                    int var47 = (150 - class2.field14[var35]) * (class55.field732.method995(var42) + 100) / 150;
                    if (class186.field2991) {
                        class344.method2379(arg6 + class69.field900 - 50, arg4, arg6 + class69.field900 + 50, arg0 + arg4);
                    } else {
                        class216.method1577(arg6 + class69.field900 - 50, arg4, class69.field900 + arg6 + 50, arg4 - -arg0);
                    }
                    class55.field732.method1009(var42, class69.field900 + arg6 - (-50 - -var47), class329.field5122 + arg4, var43, 0);
                    if (class186.field2991) {
                        class344.method2376(arg6, arg4, arg2 + arg6, arg0 + arg4);
                    } else {
                        class216.method1571(arg6, arg4, arg2 + arg6, arg0 + arg4);
                    }
                }
                if (class2.field16[var35] == 5) {
                    int var48 = 150 - class2.field14[var35];
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    if (class186.field2991) {
                        class344.method2379(arg6, arg4 - (class55.field732.field2154 - class329.field5122) - 1, arg2 + arg6, arg4 + class329.field5122 + 5);
                    } else {
                        class216.method1577(arg6, class329.field5122 + arg4 - class55.field732.field2154 - 1, arg2 + arg6, class329.field5122 + arg4 + 5);
                    }
                    class55.field732.method1001(var42, class69.field900 + arg6, class329.field5122 + var49 + arg4, var43, 0);
                    if (class186.field2991) {
                        class344.method2376(arg6, arg4, arg6 + arg2, arg4 - -arg0);
                    } else {
                        class216.method1571(arg6, arg4, arg2 + arg6, arg0 + arg4);
                    }
                }
            } else {
                class55.field732.method1001(var42, class69.field900 + arg6, class329.field5122 + arg4, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V", line = 672)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4444++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB[S[Ljava/lang/String;I)V", line = 692)
    public static final void method2001(int arg0, byte arg1, short[] arg2, String[] arg3, int arg4) {
        if (arg1 > -14) {
            field4452 = (class111) null;
        }
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg0; var9 < arg4; var9++) {
                if (var7 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].compareTo(var7)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method2001(arg0, (byte) -115, arg2, arg3, var6 - 1);
            method2001(var6 + 1, (byte) -98, arg2, arg3, arg4);
        }
        field4459++;
    }
}
