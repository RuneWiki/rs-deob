import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class654 extends class38 {

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "Lda;")
    public static class61 field9181;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZI)I", line = 3)
    private final int method3783(int arg0, boolean arg1, int arg2) {
        ++field9179;
        int var4 = arg0 - -(arg2 * 57);
        if (!arg1) {
            return 122;
        } else {
            int var5 = var4 ^ var4 << 1;
            return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 18)
    public static void method3784(int arg0) {
        if (arg0 <= 20) {
            method3787(true);
        }
        field9181 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)[I", line = 29)
    public final int[] method199(byte arg0, int arg1) {
        ++field9175;
        int[] var3 = super.field397.method1376(arg1, (byte) -108);
        if (arg0 > -43) {
            return null;
        } else {
            if (super.field397.field3005) {
                int var4 = class136.field1816[arg1];
                for (int var5 = 0; ~class729.field10216 < ~var5; ++var5) {
                    var3[var5] = this.method3783(class255.field3666[var5], true, var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIILsca;)V", line = 63)
    public static final void method3785(int arg0, int arg1, int arg2, class46 arg3) {
        ++field9180;
        if (arg3.field625 == 0) {
            arg3.field669 = arg3.field681;
        } else if (~arg3.field625 == -2) {
            arg3.field669 = (-arg3.field549 + arg1) / 2 + arg3.field681;
        } else if (arg3.field625 == 2) {
            arg3.field669 = -arg3.field681 + arg1 + -arg3.field549;
        } else if (~arg3.field625 == -4) {
            arg3.field669 = arg3.field681 * arg1 >> 14;
        } else if (arg3.field625 == 4) {
            arg3.field669 = (-arg3.field549 + arg1) / 2 - -(arg3.field681 * arg1 >> 14);
        } else {
            arg3.field669 = arg1 - (arg3.field549 - -(arg3.field681 * arg1 >> 14));
        }
        if (arg2 <= 53) {
            field9181 = null;
        }
        if (~arg3.field637 == -1) {
            arg3.field643 = arg3.field642;
        } else if (~arg3.field637 == -2) {
            arg3.field643 = (-arg3.field574 + arg0) / 2 + arg3.field642;
        } else if (~arg3.field637 != -3) {
            if (arg3.field637 == 3) {
                arg3.field643 = arg3.field642 * arg0 >> 14;
            } else if (arg3.field637 == 4) {
                arg3.field643 = (arg3.field642 * arg0 >> 14) + (-arg3.field574 + arg0) / 2;
            } else {
                arg3.field643 = -arg3.field574 + arg0 - (arg3.field642 * arg0 >> 14);
            }
        } else {
            arg3.field643 = -arg3.field642 + arg0 + -arg3.field574;
        }
        if (class501.field7119) {
            if (~client.method1886(arg3).field3393 == -1 && arg3.field577 != 0) {
                return;
            }
            if (~arg3.field643 <= -1) {
                if (arg3.field643 + arg3.field574 > arg0) {
                    arg3.field643 = -arg3.field574 + arg0;
                }
            } else {
                arg3.field643 = 0;
            }
            if (arg3.field669 < 0) {
                arg3.field669 = 0;
                return;
            }
            if (arg3.field669 + arg3.field549 > arg1) {
                arg3.field669 = arg1 - arg3.field549;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([J[Ljava/lang/Object;BII)V", line = 137)
    public static final void method3786(long[] arg0, Object[] arg1, byte arg2, int arg3, int arg4) {
        if (arg3 < arg4) {
            int var5 = (arg3 - -arg4) / 2;
            int var6 = arg3;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg3; ~arg4 < ~var11; ++var11) {
                if (~arg0[var11] > ~((long) (var11 & var10) + var7)) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var9;
            method3786(arg0, arg1, (byte) 25, arg3, var6 - 1);
            method3786(arg0, arg1, (byte) 61, var6 - -1, arg4);
        }
        ++field9176;
        int var15 = -11 % ((arg2 - -40) / 46);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V", line = 191)
    public static final void method3787(boolean arg0) {
        ++field9178;
        for (int var1 = 0; class228.field3346 > var1; ++var1) {
            int var2 = class451.field6668[var1];
            class282 var3 = ((class432) class497.field7067.method2287((long) var2, (byte) -117)).field6439;
            int var4 = class469.field6851.method3745(-6314);
            if ((var4 & 64) != 0) {
                var4 += class469.field6851.method3745(-6314) << 8;
            }
            if ((32768 & var4) != 0) {
                var4 += class469.field6851.method3745(-6314) << 16;
            }
            if (~(var4 & 65536) != -1) {
                var3.field4009 = class469.field6851.method3693(87);
                if (var3.field4009 == 65535) {
                    var3.field4009 = var3.field4008.field5036;
                }
            }
            if (~(var4 & 1024) != -1) {
                int var5 = class469.field6851.method3712((byte) -6);
                var3.field6083 = class469.field6851.method3701(-111);
                var3.field6033 = class469.field6851.method3714((byte) 19);
                var3.field6019 = var5 & 32767;
                var3.field6024 = (32768 & var5) != 0;
                var3.field6115 = class357.field5189 - -var3.field6019 + var3.field6083;
            }
            if ((var4 & 4) != 0) {
                var3.field4005 = class469.field6851.method3755(128);
                var3.field3987 = class469.field6851.method3693(63);
            }
            if (~(1 & var4) != -1) {
                int var6 = class469.field6851.method3714((byte) 19);
                if (~var6 < -1) {
                    for (int var7 = 0; var6 > var7; ++var7) {
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = class469.field6851.method3728((byte) 88);
                        if (~var11 != -32768) {
                            if (~var11 != -32767) {
                                var9 = class469.field6851.method3728((byte) 88);
                            } else {
                                var11 = -1;
                            }
                        } else {
                            var11 = class469.field6851.method3728((byte) 88);
                            var9 = class469.field6851.method3728((byte) 88);
                            var8 = class469.field6851.method3728((byte) 88);
                            var10 = class469.field6851.method3728((byte) 88);
                        }
                        int var12 = class469.field6851.method3728((byte) 88);
                        int var13 = class469.field6851.method3701(-120);
                        var3.method2576(var9, var10, var8, false, var13, var11, var12, class357.field5189);
                    }
                }
            }
            if ((128 & var4) != 0) {
                int[] var14 = new int[4];
                for (int var15 = 0; ~var15 > -5; ++var15) {
                    var14[var15] = class469.field6851.method3755(128);
                    if (~var14[var15] == -65536) {
                        var14[var15] = -1;
                    }
                }
                int var16 = class469.field6851.method3701(-115);
                class513.method3035(var3, var14, var16, 0);
            }
            if (~(16384 & var4) != -1) {
                int var17 = class469.field6851.method3701(-119);
                int[] var18 = new int[var17];
                int[] var19 = new int[var17];
                int[] var20 = new int[var17];
                for (int var21 = 0; ~var17 < ~var21; ++var21) {
                    int var22 = class469.field6851.method3726(false);
                    if (var22 == 65535) {
                        var22 = -1;
                    }
                    var18[var21] = var22;
                    var19[var21] = class469.field6851.method3745(-6314);
                    var20[var21] = class469.field6851.method3755(128);
                }
                class592.method3460(var19, var18, var20, var3, 1);
            }
            if ((32 & var4) != 0) {
                int var23 = class469.field6851.method3755(128);
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = class469.field6851.method3722((byte) 109);
                int var25 = class469.field6851.method3717(true);
                int var26 = var25 & 7;
                int var27 = var25 >> 3 & 15;
                if (~var27 == -16) {
                    var27 = -1;
                }
                var3.method2583(false, var26, -115, var23, var24, var27);
            }
            if (~(8192 & var4) != -1) {
                var3.field6035 = class469.field6851.method3724((byte) 96);
                var3.field6043 = class469.field6851.method3731(-380);
                var3.field6048 = class469.field6851.method3743(true);
                var3.field6062 = (byte) class469.field6851.method3701(-117);
                var3.field6079 = class357.field5189 - -class469.field6851.method3726(false);
                var3.field6071 = class357.field5189 + class469.field6851.method3726(false);
            }
            if ((512 & var4) != 0) {
                int var28 = var3.field4008.field5067.length;
                int var29 = 0;
                if (var3.field4008.field5031 != null) {
                    var29 = var3.field4008.field5031.length;
                }
                int var30 = 0;
                if (var3.field4008.field5077 != null) {
                    var30 = var3.field4008.field5077.length;
                }
                int var31 = class469.field6851.method3701(-110);
                if (~(var31 & 1) == -2) {
                    var3.field3996 = null;
                } else {
                    int[] var32 = null;
                    if (~(var31 & 2) == -3) {
                        var32 = new int[var28];
                        for (int var33 = 0; var33 < var28; ++var33) {
                            var32[var33] = class469.field6851.method3755(128);
                        }
                    }
                    short[] var34 = null;
                    if (~(var31 & 4) == -5) {
                        var34 = new short[var29];
                        for (int var35 = 0; var29 > var35; ++var35) {
                            var34[var35] = (short) class469.field6851.method3726(arg0);
                        }
                    }
                    short[] var36 = null;
                    if ((var31 & 8) == 8) {
                        var36 = new short[var30];
                        for (int var37 = 0; ~var37 > ~var30; ++var37) {
                            var36[var37] = (short) class469.field6851.method3755(128);
                        }
                    }
                    long var38 = (long) (var3.field3997++) << 32 | (long) var2;
                    var3.field3996 = new class367(var38, var32, var34, var36);
                }
            }
            if ((262144 & var4) != 0) {
                var3.field3995 = class469.field6851.method3752(-2);
                if ("".equals(var3.field3995) || var3.field3995.equals(var3.field4008.field5069)) {
                    var3.field3995 = var3.field4008.field5069;
                }
            }
            if ((4096 & var4) != 0) {
                var3.field6093 = class469.field6851.method3711(16711680);
                var3.field6113 = class469.field6851.method3743(true);
                var3.field6086 = class469.field6851.method3743(true);
                var3.field6023 = class469.field6851.method3711(16711680);
                var3.field6052 = class469.field6851.method3755(128) - -class357.field5189;
                var3.field6100 = class469.field6851.method3712((byte) 76) + class357.field5189;
                var3.field6068 = class469.field6851.method3717(true);
                var3.field6023 += var3.field6139[0];
                var3.field6130 = 1;
                var3.field6134 = 0;
                var3.field6113 += var3.field6139[0];
                var3.field6086 += var3.field6133[0];
                var3.field6093 += var3.field6133[0];
            }
            if ((var4 & 16) != 0) {
                var3.field6125 = class469.field6851.method3726(arg0);
                if (~var3.field6125 == -65536) {
                    var3.field6125 = -1;
                }
            }
            if (~(8 & var4) != -1) {
                var3.field6020 = class469.field6851.method3752(-2);
                var3.field6099 = 100;
            }
            if ((var4 & 2048) != 0) {
                int var40 = class469.field6851.method3726(arg0);
                if (~var40 == -65536) {
                    var40 = -1;
                }
                int var41 = class469.field6851.method3720(-19541);
                int var42 = class469.field6851.method3701(-116);
                int var43 = var42 & 7;
                int var44 = 15 & var42 >> 3;
                if (var44 == 15) {
                    var44 = -1;
                }
                var3.method2583(true, var43, -115, var40, var41, var44);
            }
            if ((2 & var4) != 0) {
                if (var3.field4008.method2205(-81)) {
                    class734.method4131(var3, false);
                }
                var3.method1806(-9430, class74.field1032.method3327(class469.field6851.method3755(128), false));
                var3.method2575(-124, var3.field4008.field5053);
                var3.field6088 = var3.field4008.field5070 << 3;
                if (var3.field4008.method2205(-95)) {
                    class447.method2762((class689) null, var3.field6133[0], var3.field6139[0], 0, var3, var3.field8429, (class211) null, 1);
                }
            }
            if (~(131072 & var4) != -1) {
                int var45 = var3.field4008.field5091.length;
                int var46 = 0;
                if (var3.field4008.field5031 != null) {
                    var46 = var3.field4008.field5031.length;
                }
                byte var47 = 0;
                if (var3.field4008.field5077 != null) {
                    var46 = var3.field4008.field5077.length;
                }
                int var48 = class469.field6851.method3714((byte) 19);
                if ((1 & var48) != 1) {
                    int[] var49 = null;
                    if (~(var48 & 2) == -3) {
                        var49 = new int[var45];
                        for (int var50 = 0; ~var45 < ~var50; ++var50) {
                            var49[var50] = class469.field6851.method3726(false);
                        }
                    }
                    short[] var51 = null;
                    if (~(4 & var48) == -5) {
                        var51 = new short[var46];
                        for (int var52 = 0; var52 < var46; ++var52) {
                            var51[var52] = (short) class469.field6851.method3726(false);
                        }
                    }
                    short[] var53 = null;
                    if (~(8 & var48) == -9) {
                        var53 = new short[var47];
                        for (int var54 = 0; var54 < var47; ++var54) {
                            var53[var54] = (short) class469.field6851.method3693(123);
                        }
                    }
                    long var55 = (long) (var3.field4001++) << 32 | (long) var2;
                    new class367(var55, var49, var51, var53);
                }
            }
            if ((256 & var4) != 0) {
                int var57 = class469.field6851.method3701(-123);
                int[] var58 = new int[var57];
                int[] var59 = new int[var57];
                for (int var60 = 0; var60 < var57; ++var60) {
                    int var61 = class469.field6851.method3755(128);
                    if (~(var61 & 49152) != -49153) {
                        var58[var60] = var61;
                    } else {
                        int var62 = class469.field6851.method3693(67);
                        var58[var60] = class625.method3600(var61 << 16, var62);
                    }
                    var59[var60] = class469.field6851.method3712((byte) -15);
                }
                var3.method2574(var58, var59, -1);
            }
        }
        if (arg0) {
            method3785(-81, 31, 117, (class46) null);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZIIZILvd;)V", line = 651)
    public static final void method3788(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, class39 arg6) {
        ++field9177;
        class152.field2350 = 1;
        class706.field9945 = arg4;
        class581.field8257 = arg0;
        class2.field18 = null;
        class758.field10600 = arg3;
        class347.field5018 = arg2;
        if (arg1) {
            field9174 = 2;
        }
        class242.field3529 = arg5;
        class354.field5152 = arg6;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 671)
    public class654() {
        super(0, true);
    }
}
