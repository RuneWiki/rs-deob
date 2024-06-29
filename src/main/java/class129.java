import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class129 extends class45 {

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    private int field2046 = 0;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "[S")
    private short[] field2051 = new short[257];

    @OriginalMember(owner = "client!me", name = "N", descriptor = "Lef;")
    public static class335 field2049 = new class335(1, 2, 2, 0);

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Liv;")
    public static class64 field2056 = new class64(60, -2);

    @OriginalMember(owner = "client!me", name = "V", descriptor = "[I")
    public static int[] field2057 = new int[8];

    @OriginalMember(owner = "client!me", name = "W", descriptor = "[[I")
    public static int[][] field2058 = new int[128][128];

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "[I")
    private int[] field2048;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "[I")
    private int[] field2052;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "[[I")
    private int[][] field2053;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    private final void method966(int arg0) {
        ++field2044;
        int var2 = this.field2046;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field2053.length + -1) && ~this.field2053[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field2053[var5 - 1];
                    int[] var7 = this.field2053[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class57.field1002[255 & var8 >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field2051[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field2053.length + -1 && var13 >= this.field2053[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field2053[var14 + -1];
                    int[] var16 = this.field2053[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field2051[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field2053.length + -1 > var22 && ~var21 <= ~this.field2053[var22][0]; ++var22) {
                }
                int[] var23 = this.field2053[var22 + -1];
                int[] var24 = this.field2053[var22];
                int var25 = this.method967(1396, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method967(1396, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var27 - -var26 + -var25;
                int var32 = var25 - var26 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 + var37 + var35 + var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2051[var20] = (short) var38;
            }
        }
        if (arg0 >= -39) {
            field2055 = -75;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field2046 = arg0.method1063((byte) 104);
            this.field2053 = new int[arg0.method1063((byte) 127)][2];
            for (int var4 = 0; ~var4 > ~this.field2053.length; ++var4) {
                this.field2053[var4][0] = arg0.method1069((byte) -34);
                this.field2053[var4][1] = arg0.method1069((byte) -112);
            }
        }
        ++field2050;
        if (arg1 != -26471) {
            this.method37((class145) null, -110, -37);
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
    public final void method38(int arg0) {
        if (this.field2053 == null) {
            this.field2053 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0 != 4095) {
            this.method967(97, 30);
        }
        ++field2054;
        if (~this.field2053.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field2046 == -3) {
                this.method969(-11305);
            }
            class416.method2523(4096);
            this.method966(arg0 ^ -3978);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(II)[I")
    private final int[] method967(int arg0, int arg1) {
        if (arg0 != 1396) {
            this.field2048 = null;
        }
        ++field2045;
        if (~arg1 > -1) {
            return this.field2048;
        } else {
            return arg1 >= this.field2053.length ? this.field2052 : this.field2053[arg1];
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
    public static void method968(int arg0) {
        field2057 = null;
        field2056 = null;
        field2049 = null;
        field2058 = null;
        if (arg0 != 128) {
            field2057 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2043;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            int[] var4 = this.method434(0, arg1, 125);
            for (int var5 = 0; ~var5 > ~class259.field3768; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2051[var6];
            }
        }
        return arg0 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V")
    private final void method969(int arg0) {
        if (arg0 != -11305) {
            this.method38(28);
        }
        ++field2047;
        int[] var2 = this.field2053[0];
        int[] var3 = this.field2053[1];
        int[] var4 = this.field2053[this.field2053.length + -2];
        int[] var5 = this.field2053[this.field2053.length + -1];
        this.field2048 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[1] };
        this.field2052 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class129() {
        super(1, true);
    }
}
