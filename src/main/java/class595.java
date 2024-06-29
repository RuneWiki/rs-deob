import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class595 extends class243 {

    @OriginalMember(owner = "client!et", name = "R", descriptor = "I")
    private int field8298 = 0;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "[S")
    private short[] field8290 = new short[257];

    @OriginalMember(owner = "client!et", name = "D", descriptor = "I")
    public static int field8284 = 0;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "Z")
    public static boolean field8291 = false;

    @OriginalMember(owner = "client!et", name = "E", descriptor = "I")
    public static int field8285 = 0;

    @OriginalMember(owner = "client!et", name = "F", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!et", name = "L", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!et", name = "M", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!et", name = "N", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!et", name = "O", descriptor = "I")
    public static int field8295;

    @OriginalMember(owner = "client!et", name = "P", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
    public static int field8297;

    @OriginalMember(owner = "client!et", name = "T", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!et", name = "U", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "[I")
    private int[] field8288;

    @OriginalMember(owner = "client!et", name = "I", descriptor = "[I")
    private int[] field8289;

    @OriginalMember(owner = "client!et", name = "S", descriptor = "[[I")
    private int[][] field8299;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V", line = 4)
    private final void method3292(int arg0) {
        if (arg0 != -1) {
            field8284 = 81;
        }
        int var2 = this.field8298;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field8299.length + -1) && ~this.field8299[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field8299[var5 + -1];
                    int[] var7 = this.field8299[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class623.field8718[(var8 & 8160) >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field8290[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field8299.length + -1) < ~var14 && var13 >= this.field8299[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field8299[var14 + -1];
                    int[] var16 = this.field8299[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field8290[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field8299.length - 1 > var22 && ~var21 <= ~this.field8299[var22][0]; ++var22) {
                }
                int[] var23 = this.field8299[var22 - 1];
                int[] var24 = this.field8299[var22];
                int var25 = this.method3296(6435, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3296(arg0 + 6436, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 - var25 - -var26;
                int var32 = -var31 + var25 - var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var36 + var35 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field8290[var20] = (short) var38;
            }
        }
        ++field8287;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IB)I", line = 183)
    public static final int method3293(int arg0, byte arg1) {
        if (arg1 < 8) {
            field8291 = true;
        }
        ++field8296;
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V", line = 194)
    public class595() {
        super(1, true);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)[I", line = 200)
    public final int[] method5(int arg0, int arg1) {
        ++field8300;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int[] var4 = this.method1462(arg1, 0, 0);
            for (int var5 = 0; var5 < class687.field9628; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field8290[var6];
            }
        }
        if (arg0 != 255) {
            field8291 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(III)Z", line = 241)
    public static final boolean method3294(int arg0, int arg1, int arg2) {
        ++field8297;
        if (arg2 != 16) {
            return true;
        } else {
            return ~(16 & arg0) != -1;
        }
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V", line = 253)
    private final void method3295(int arg0) {
        ++field8292;
        int[] var2 = this.field8299[0];
        int[] var3 = this.field8299[1];
        int[] var4 = this.field8299[this.field8299.length + arg0];
        int[] var5 = this.field8299[this.field8299.length + -1];
        this.field8288 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
        this.field8289 = new int[] { var2[0] - var3[0] - -var2[0], var2[1] - var3[1] - -var2[1] };
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(II)[I", line = 277)
    private final int[] method3296(int arg0, int arg1) {
        ++field8294;
        if (~arg1 > -1) {
            return this.field8289;
        } else {
            if (arg0 != 6435) {
                field8291 = false;
            }
            return ~arg1 <= ~this.field8299.length ? this.field8288 : this.field8299[arg1];
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(B)V", line = 297)
    public final void method85(byte arg0) {
        if (arg0 != 66) {
            this.field8288 = null;
        }
        ++field8295;
        if (this.field8299 == null) {
            this.field8299 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field8299.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field8298 == 2) {
                this.method3295(-2);
            }
            class333.method1982(0);
            this.method3292(arg0 + -67);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIZII)V", line = 325)
    public static final void method3297(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field8293;
        if (arg0 == -1962608884) {
            if ((!arg4 ? class11.field68.field5537.method750((byte) 125) : class11.field68.field5519.method750((byte) 123)) != 0 && arg2 != 0 && class635.field8835 < 50 && arg3 != -1) {
                class643.field8975[class635.field8835++] = new class573((byte) (arg4 ? 3 : 2), arg3, arg2, arg5, arg1, 0, arg6, (class176) null);
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILji;B)V", line = 347)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        ++field8286;
        if (arg2 > -92) {
            this.method5(117, -9);
        }
        if (~arg0 == -1) {
            this.field8298 = arg1.method3428((byte) -120);
            this.field8299 = new int[arg1.method3428((byte) -123)][2];
            for (int var4 = 0; ~this.field8299.length < ~var4; ++var4) {
                this.field8299[var4][0] = arg1.method3402((byte) 127);
                this.field8299[var4][1] = arg1.method3402((byte) 127);
            }
        }
    }
}
