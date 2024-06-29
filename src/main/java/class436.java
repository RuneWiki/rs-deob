import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class436 extends class601 {

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
    private int field6014 = 204;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    private int field6011 = 1;

    @OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
    private int field6018 = 1;

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "Lht;")
    public static class582 field6012 = new class582(5, 3);

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!ss", name = "P", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!ss", name = "N", descriptor = "Lli;")
    public static class433 field6017;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ss", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field6020;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2510(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lee;BI)V", line = 10)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field6014 = arg0.method3807(-1);
                }
            } else {
                this.field6011 = arg0.method3821((byte) -25);
            }
        } else {
            this.field6018 = arg0.method3821((byte) -67);
        }
        if (arg1 != -61) {
            field6012 = null;
        }
        ++field6010;
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V", line = 54)
    public class436() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(III)I", line = 57)
    public static final int method2505(int arg0, int arg1, int arg2) {
        ++field6019;
        int var3 = arg0 >>> 31;
        if (arg2 < 98) {
            field6012 = null;
        }
        return (arg0 + var3) / arg1 + -var3;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lha;BI)Z", line = 81)
    public static final boolean method2506(class59 arg0, byte arg1, int arg2) {
        ++field6016;
        int var3 = (class719.field10004 + -104) / 2;
        int var4 = (class107.field1453 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; ~var6 > ~(var3 + 104); ++var6) {
            for (int var57 = var4; ~var57 > ~(var4 - -104); ++var57) {
                for (int var58 = arg2; ~var58 >= -4; ++var58) {
                    if (class753.method4218(var6, arg2, var57, arg1 + 100, var58)) {
                        int var59 = var58;
                        if (class498.method2810(arg1 + -10289, var6, var57)) {
                            var59 = var58 - 1;
                        }
                        if (~var59 <= -1) {
                            var5 &= class759.method4226(var59, var57, var6, (byte) 12);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
                var7[var8] = -16777216;
            }
            class355.field4993 = arg0.method450(512, (byte) 99, 512, var7, 0, 512);
            class29.method264((byte) 73);
            int var9 = -10 + (int) (20.0D * Math.random()) + 238 + (-10 + (int) (20.0D * Math.random()) + 238 << 16) + (228 + (int) (Math.random() * 20.0D) << 8) | -16777216;
            int var10 = -16777216 | (int) (Math.random() * 20.0D) + 238 - 10 << 16;
            if (arg1 != -98) {
                method2507(76);
            }
            int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (8.0D * Math.random());
            boolean[][] var12 = new boolean[class76.field926 + 3][class76.field926 - -1 - -2];
            for (int var13 = var3; var13 < var3 + 104; var13 += class76.field926) {
                for (int var36 = var4; ~(var4 + 104) < ~var36; var36 += class76.field926) {
                    int var37 = 0;
                    int var38 = 0;
                    int var39 = var13;
                    if (~var13 < -1) {
                        var37 += 4;
                        var39 = var13 - 1;
                    }
                    int var40 = var36;
                    if (~var36 < -1) {
                        var40 = var36 - 1;
                    }
                    int var41 = class76.field926 + var13;
                    if (var41 < 104) {
                        ++var41;
                    }
                    int var42 = class76.field926 + var36;
                    if (var42 < 104) {
                        var38 += 4;
                        ++var42;
                    }
                    arg0.method419(0, 0, var37 - -(class76.field926 * 4), class76.field926 * 4 + var38);
                    arg0.method392(-16777216);
                    for (int var43 = arg2; var43 <= 3; ++var43) {
                        for (int var50 = 0; var50 <= class76.field926; ++var50) {
                            for (int var56 = 0; class76.field926 >= var56; ++var56) {
                                var12[var50][var56] = class753.method4218(var39 + var50, arg2, var40 + var56, 2, var43);
                            }
                        }
                        class113.field1866[var43].method1738(0, 0, 1024, var39, var40, var41, var42, var12);
                        if (!class113.field1864) {
                            for (int var51 = -4; var51 < class76.field926; ++var51) {
                                for (int var52 = -4; ~class76.field926 < ~var52; ++var52) {
                                    int var53 = var13 - -var51;
                                    int var54 = var36 + var52;
                                    if (~var53 <= ~var3 && ~var54 <= ~var4 && class753.method4218(var53, arg2, var54, 2, var43)) {
                                        int var55 = var43;
                                        if (class498.method2810(-10387, var53, var54)) {
                                            var55 = var43 - 1;
                                        }
                                        if (var55 >= 0) {
                                            class646.method3539(var55, 99, var10, var53, var54, var51 * 4 + var37, var9, (-var52 + class76.field926) * 4 + var38 - 4, arg0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class113.field1864) {
                        class691 var44 = class456.field6226[arg2];
                        for (int var45 = 0; ~class76.field926 < ~var45; ++var45) {
                            for (int var46 = 0; ~class76.field926 < ~var46; ++var46) {
                                int var47 = var13 + var45;
                                int var48 = var36 - -var46;
                                int var49 = var44.field9639[-var44.field9624 + var47][-var44.field9640 + var48];
                                if ((var49 & 1076101120) != 0) {
                                    arg0.method489(4, 40, 4, (-var46 + class76.field926) * 4 + var38 + -4, var45 * 4 + var37, -1713569622);
                                } else if ((var49 & 8388608) == 0) {
                                    if ((var49 & 33554432) == 0) {
                                        if (~(var49 & 134217728) != -1) {
                                            arg0.method467(-112, (class76.field926 - var46) * 4 + var38 + -1, 4, var45 * 4 + var37, -1713569622);
                                        } else if ((536870912 & var49) != 0) {
                                            arg0.method509(-1713569622, 1, 4, (-var46 + class76.field926) * 4 + -4 + var38, var45 * 4 + var37);
                                        }
                                    } else {
                                        arg0.method509(-1713569622, arg1 + 99, 4, var38 - (-((-var46 + class76.field926) * 4) + 4), var45 * 4 - -3 + var37);
                                    }
                                } else {
                                    arg0.method467(arg1 + 225, var38 - -((-var46 + class76.field926) * 4) - 4, 4, var37 - -(var45 * 4), -1713569622);
                                }
                            }
                        }
                    }
                    arg0.method504(var37, var38, class76.field926 * 4, class76.field926 * 4, var11, 2);
                    class355.field4993.method1051(48 - -((-var3 + var13) * 4), -(class76.field926 * 4) + 464 + -((-var4 + var36) * 4), class76.field926 * 4, class76.field926 * 4, var37, var38);
                }
            }
            arg0.method435();
            arg0.method392(-16777215);
            class312.method1915(arg1 + -3);
            class437.field6022 = 0;
            class643.field8560.method23(10);
            if (!class113.field1864) {
                for (int var14 = var3; var14 < var3 + 104; ++var14) {
                    for (int var20 = var4; ~(var4 + 104) < ~var20; ++var20) {
                        for (int var21 = arg2; ~(arg2 - -1) <= ~var21 && var21 <= 3; ++var21) {
                            if (class753.method4218(var14, arg2, var20, 2, var21)) {
                                class624 var22 = (class624) class694.method3906(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class624) class490.method2780(var21, var14, var20, field6020 != null ? field6020 : (field6020 = method2510("paa")));
                                }
                                if (var22 == null) {
                                    var22 = (class624) class672.method3710(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class624) class88.method674(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class100 var23 = class462.field6333.method2008((byte) -115, var22.method1759((byte) 95));
                                    if (!var23.field1274 || class142.field2266) {
                                        int var24 = var23.field1291;
                                        if (var23.field1307 != null) {
                                            for (int var25 = 0; var25 < var23.field1307.length; ++var25) {
                                                if (~var23.field1307[var25] != 0) {
                                                    class100 var26 = class462.field6333.method2008((byte) -93, var23.field1307[var25]);
                                                    if (var26.field1291 >= 0) {
                                                        var24 = var26.field1291;
                                                    }
                                                }
                                            }
                                        }
                                        if (~var24 <= -1) {
                                            boolean var27 = false;
                                            if (~var24 <= -1) {
                                                class325 var28 = class361.field5088.method3192((byte) 117, var24);
                                                if (var28 != null && var28.field4612) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class456.field6226[var21].field9639;
                                                int var32 = class456.field6226[var21].field9624;
                                                int var33 = class456.field6226[var21].field9640;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (4.0D * Math.random());
                                                    if (~var35 == -1 && var3 < var29 && var14 - 3 < var29 && (2883848 & var31[var29 - (var32 + 1)][-var33 + var30]) == 0) {
                                                        --var29;
                                                    }
                                                    if (~var35 == -2 && var29 < var3 + -1 + 104 && ~(var14 + 3) < ~var29 && (var31[var29 + 1 - var32][-var33 + var30] & 2883968) == 0) {
                                                        ++var29;
                                                    }
                                                    if (var35 == 2 && var30 > var4 && var20 - 3 < var30 && ~(2883842 & var31[-var32 + var29][var30 + -1 + -var33]) == -1) {
                                                        --var30;
                                                    }
                                                    if (var35 == 3 && ~var30 > ~(var4 + 104 - 1) && ~(var20 + 3) < ~var30 && (2883872 & var31[-var32 + var29][var30 + 1 + -var33]) == 0) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class573.field7528[class437.field6022] = var23.field1301;
                                            class418.field5770[class437.field6022] = var29;
                                            class48.field606[class437.field6022] = var30;
                                            ++class437.field6022;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class668.field9128 != null) {
                    class622.field8296.field5225 = 1;
                    class361.field5088.method3193(1024, (byte) -77, 64);
                    for (int var15 = 0; var15 < class668.field9128.field5095; ++var15) {
                        int var16 = class668.field9128.field5096[var15];
                        if (var16 >> 28 == class472.field6475.field3508) {
                            int var17 = (16383 & var16 >> 14) + -class503.field6752;
                            int var18 = (16383 & var16) + -class334.field4757;
                            if (var17 >= 0 && class719.field10004 > var17 && var18 >= 0 && class107.field1453 > var18) {
                                class643.field8560.method11(new class651(var15), arg1 ^ 4);
                            } else {
                                class325 var19 = class361.field5088.method3192((byte) 23, class668.field9128.field5098[var15]);
                                if (var19.field4625 != null && var17 - -var19.field4649 >= 0 && ~class719.field10004 < ~(var17 - -var19.field4640) && ~(var19.field4607 + var18) <= -1 && ~class107.field1453 < ~(var19.field4641 + var18)) {
                                    class643.field8560.method11(new class651(var15), arg1 ^ 17);
                                }
                            }
                        }
                    }
                    class361.field5088.method3193(128, (byte) -100, 64);
                    class622.field8296.field5225 = 2;
                    class622.field8296.method2208(0);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)V", line = 530)
    public static final void method2507(int arg0) {
        if (arg0 <= 0) {
            field6017 = null;
        }
        for (int var1 = 0; var1 < class306.field4404; ++var1) {
            int var2 = class628.field8351[var1];
            class134 var3 = (class134) class390.field5470.method2135((long) var2, (byte) 31);
            if (var3 != null) {
                class556 var4 = var3.field2154;
                class169.method1206(256, var4, var4.field7328.field2544);
            }
        }
        ++field6008;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V", line = 560)
    public static final void method2508(byte arg0) {
        int var1 = -20 % ((arg0 - 69) / 52);
        if (~class15.field215 == -4) {
            class66.method566(4, -21035);
        } else if (~class15.field215 == -8) {
            class66.method566(8, -21035);
        } else if (~class15.field215 == -11) {
            class66.method566(11, -21035);
        }
        ++field6015;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)[I", line = 586)
    public final int[] method5(byte arg0, int arg1) {
        ++field6013;
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            for (int var4 = 0; class171.field2624 > var4; ++var4) {
                int var5 = class453.field6186[var4];
                int var6 = class250.field3446[arg1];
                int var7 = this.field6018 * var5 >> 12;
                int var8 = this.field6011 * var6 >> 12;
                int var9 = var5 % (4096 / this.field6018) * this.field6018;
                int var10 = var6 % (4096 / this.field6011) * this.field6011;
                if (this.field6014 > var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field6014) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field6014) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg0 != -40) {
            this.method6((class677) null, (byte) -114, -118);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(Z)V", line = 672)
    public static void method2509(boolean arg0) {
        field6012 = null;
        if (arg0) {
            method2509(true);
        }
        field6017 = null;
    }
}
