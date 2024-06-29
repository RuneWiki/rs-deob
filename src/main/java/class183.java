import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class183 extends class114 {

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "[S")
    private short[] field2769 = new short[257];

    @OriginalMember(owner = "client!tk", name = "Y", descriptor = "I")
    private int field2781 = 0;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "Z")
    public static boolean field2772 = false;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "Ljd;")
    public static class244 field2775 = new class244(0, 0);

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!tk", name = "W", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!tk", name = "X", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!tk", name = "Z", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!tk", name = "ab", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "[I")
    private int[] field2770;

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "[I")
    private int[] field2777;

    @OriginalMember(owner = "client!tk", name = "V", descriptor = "[[I")
    private int[][] field2778;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        ++field2776;
        if (arg2 != 12953) {
            this.method1167(-36, -85);
        }
        if (arg1 == 0) {
            this.field2781 = arg0.method1374((byte) -60);
            this.field2778 = new int[arg0.method1374((byte) -60)][2];
            for (int var4 = 0; this.field2778.length > var4; ++var4) {
                this.field2778[var4][0] = arg0.method1379(-87);
                this.field2778[var4][1] = arg0.method1379(-115);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBIIIIIIILmi;ZLwk;I)Lmi;")
    public static final class94 method1165(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10, boolean arg11, class195 arg12, int arg13) {
        ++field2782;
        long var14 = ((long) arg1 << 48) + ((long) arg8 << 32) + (long) ((arg3 << 24) + (arg5 << 16) + arg0);
        class94 var16 = (class94) class78.field1084.method950(var14, (byte) -45);
        if (var16 == null) {
            byte var17;
            if (arg0 == 1) {
                var17 = 9;
            } else if (~arg0 == -3) {
                var17 = 12;
            } else if (arg0 != 3) {
                if (~arg0 == -5) {
                    var17 = 18;
                } else {
                    var17 = 21;
                }
            } else {
                var17 = 15;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class162 var20 = new class162(var17 * var18 + 1, var17 * var18 * 2 + -var17, 0);
            int[][] var21 = new int[var18][var17];
            int var22 = var20.method1035(0, 0, 0);
            for (int var23 = 0; var23 < var18; ++var23) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; ~var17 < ~var32; ++var32) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class118.field1690[var33] * var31 + arg13 >> 16;
                    int var35 = arg6 - -(class118.field1697[var33] * var30) >> 16;
                    var21[var23][var32] = var20.method1035(var35, 0, var34);
                }
            }
            for (int var24 = 0; var18 > var24; ++var24) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg3 * var25 + arg5 * var26 >> 8);
                short var28 = (short) ((16515072 & (arg1 & 64512) * var25 + (arg8 & 64512) * var26) + ((arg1 & 896) * var25 + (896 & arg8) * var26 & 229376) + ((127 & arg1) * var25 + (127 & arg8) * var26 & 32512) >> 8);
                for (int var29 = 0; ~var29 > ~var17; ++var29) {
                    if (var24 == 0) {
                        var20.method1009(var22, var21[0][(var29 + 1) % var17], var21[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method1009(var21[var24 + -1][var29], var21[var24 + -1][(var29 + 1) % var17], var21[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var20.method1009(var21[var24 + -1][var29], var21[var24][(var29 + 1) % var17], var21[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method1024(64, 768, -50, -10, -50);
            class78.field1084.method942(var14, (byte) 18, var16);
        }
        int var36 = arg0 * 64 + -1;
        if (arg2 != -73) {
            field2775 = null;
        }
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        if (arg11) {
            if (~arg9 < -129 && ~arg9 > -897) {
                var37 -= 128;
            }
            if (~arg9 < -641 && ~arg9 > -1409) {
                var40 = var36 + 128;
            }
            if (~arg9 < -1665 || arg9 < 384) {
                var38 -= 128;
            }
            if (~arg9 < -1153 && arg9 < 1920) {
                var39 = var36 + 128;
            }
        }
        int var41 = arg10.method434();
        int var42 = arg10.method419();
        if (~var39 > ~var42) {
            var42 = var39;
        }
        if (var41 < var37) {
            var41 = var37;
        }
        class82 var43 = null;
        int var44 = arg10.method433();
        if (~var44 > ~var38) {
            var44 = var38;
        }
        int var45 = arg10.method426();
        if (arg12 != null) {
            int var46 = arg12.field2989[arg4];
            var43 = class235.method1541(var46 >> 16, -85);
            arg4 = var46 & 65535;
        }
        if (var40 < var45) {
            var45 = var40;
        }
        class94 var47;
        if (var43 == null) {
            var47 = var16.method404(true, true, true);
            var47.method438((-var41 + var42) / 2, 128, (-var44 + var45) / 2);
            var47.method409((var41 - -var42) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method404(!var43.method520(arg4, 7502), !var43.method523(arg4, -72), true);
            var47.method438((-var41 + var42) / 2, 128, (-var44 + var45) / 2);
            var47.method409((var41 + var42) / 2, 0, (var44 + var45) / 2);
            var47.method609(var43, arg4);
        }
        if (~arg9 != -1) {
            var47.method411(arg9);
        }
        class66 var48 = (class66) var47;
        if (~arg7 != ~class58.method360(arg13 + var44, arg6 + var41, false, class166.field2364) || arg7 != class58.method360(arg13 + var45, arg6 + var42, false, class166.field2364)) {
            for (int var49 = 0; var49 < var48.field899; ++var49) {
                var48.field901[var49] += -arg7 + class58.method360(var48.field903[var49] + arg13, var48.field872[var49] + arg6, false, class166.field2364);
            }
            var48.field882 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIB)V")
    public static final void method1166(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 30) {
            method1165(-109, 113, (byte) 66, 7, -128, 34, 99, 39, -117, 80, (class94) null, true, (class195) null, 127);
        }
        class39 var5 = class149.method935(-102, arg0, 8);
        ++field2773;
        var5.method261(arg4 ^ 30);
        var5.field593 = arg2;
        var5.field598 = arg1;
        var5.field591 = arg3;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(II)[I")
    private final int[] method1167(int arg0, int arg1) {
        ++field2774;
        if (arg1 < ~arg0) {
            return this.field2777;
        } else {
            return ~this.field2778.length >= ~arg0 ? this.field2770 : this.field2778[arg0];
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)V")
    public static void method1168(byte arg0) {
        if (arg0 != 13) {
            field2772 = false;
        }
        field2775 = null;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class183() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        if (this.field2778 == null) {
            this.field2778 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field2771;
        if (arg0 <= 101) {
            method1165(-71, 65, (byte) 73, 36, 75, -35, 99, 127, 29, -116, (class94) null, false, (class195) null, 115);
        }
        if (this.field2778.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field2781 == 2) {
                this.method1169((byte) 76);
            }
            class288.method1923((byte) -68);
            this.method1170(503834636);
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
    private final void method1169(byte arg0) {
        ++field2779;
        int[] var2 = this.field2778[0];
        int[] var3 = this.field2778[1];
        int[] var4 = this.field2778[this.field2778.length - 2];
        int var5 = -58 % ((32 - arg0) / 35);
        int[] var6 = this.field2778[this.field2778.length + -1];
        this.field2770 = new int[] { var4[0] + -var6[0] + var4[0], var4[1] + -var6[1] + var4[1] };
        this.field2777 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - -var2[1] + -var3[1] };
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        int[] var3 = super.field1630.method302(arg0, -111);
        if (arg1) {
            field2775 = null;
        }
        ++field2780;
        if (super.field1630.field710) {
            int[] var4 = this.method729(arg0, 0, 0);
            for (int var5 = 0; ~var5 > ~class145.field2009; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field2769[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "(I)V")
    private final void method1170(int arg0) {
        ++field2783;
        int var2 = this.field2781;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field2778.length + -1 && var4 >= this.field2778[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field2778[var5 - 1];
                    int[] var7 = this.field2778[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class134.field1843[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field2769[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field2778.length + -1) && this.field2778[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field2778[var14 + -1];
                    int[] var16 = this.field2778[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field2769[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field2778.length + -1) && ~var21 <= ~this.field2778[var22][0]; ++var22) {
                }
                int[] var23 = this.field2778[var22];
                int[] var24 = this.field2778[var22 + -1];
                int var25 = this.method1167(var22 + -2, arg0 + -503834637)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method1167(var22 - -1, -1)[1];
                int var30 = var27 - var25;
                int var31 = -var27 + var28 + -var25 - -var26;
                int var32 = (-var24[0] + var21 << 12) / (var23[0] - var24[0]);
                int var33 = var32 * var32 >> 12;
                int var34 = -var26 + -var31 + var25;
                int var35 = var33 * var34 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = (var31 * var32 >> 12) * var33 >> 12;
                int var38 = var36 + var37 + var26 - -var35;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field2769[var20] = (short) var38;
            }
        }
        if (arg0 != 503834636) {
            this.method1169((byte) -112);
        }
    }
}
