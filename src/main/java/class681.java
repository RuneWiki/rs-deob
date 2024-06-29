import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class681 extends class334 {

    @OriginalMember(owner = "client!gr", name = "Q", descriptor = "[S")
    private short[] field9663 = new short[257];

    @OriginalMember(owner = "client!gr", name = "R", descriptor = "I")
    private int field9664 = 0;

    @OriginalMember(owner = "client!gr", name = "N", descriptor = "F")
    public static float field9660;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    public static int field9654;

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!gr", name = "M", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!gr", name = "S", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "Lkc;")
    public static class72 field9656;

    @OriginalMember(owner = "client!gr", name = "K", descriptor = "[I")
    private int[] field9658;

    @OriginalMember(owner = "client!gr", name = "P", descriptor = "[I")
    private int[] field9662;

    @OriginalMember(owner = "client!gr", name = "O", descriptor = "[[I")
    private int[][] field9661;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(B)V", line = 5)
    private final void method3835(byte arg0) {
        ++field9655;
        if (arg0 > -23) {
            field9660 = 0.693979F;
        }
        int var2 = this.field9664;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field9661.length + -1 > var5 && var4 >= this.field9661[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field9661[var5 + -1];
                    int[] var7 = this.field9661[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class615.field8725[(var8 & 8170) >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field9663[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field9661.length + -1) && var13 >= this.field9661[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field9661[var14 + -1];
                    int[] var16 = this.field9661[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field9663[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field9661.length - 1) < ~var22 && var21 >= this.field9661[var22][0]; ++var22) {
                }
                int[] var23 = this.field9661[var22 + -1];
                int[] var24 = this.field9661[var22];
                int var25 = this.method3838(var22 - 2, (byte) -31)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3838(var22 + 1, (byte) -31)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - -var26 + -var27 + -var25;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 + var37 + var35 - -var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field9663[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)[I", line = 182)
    public final int[] method28(int arg0, int arg1) {
        if (arg1 != -22563988) {
            this.field9658 = null;
        }
        ++field9657;
        int[] var3 = super.field4743.method1027((byte) -128, arg0);
        if (super.field4743.field1993) {
            int[] var4 = this.method2052(0, arg1 ^ -22563988, arg0);
            for (int var5 = 0; ~class439.field6099 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field9663[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V", line = 224)
    public final void method27(byte arg0) {
        if (this.field9661 == null) {
            this.field9661 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field9653;
        if (this.field9661.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else if (arg0 < -27) {
            if (this.field9664 == 2) {
                this.method3837(98);
            }
            class177.method1292(0);
            this.method3835((byte) -104);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)V", line = 247)
    public static void method3836(boolean arg0) {
        field9656 = null;
        if (arg0) {
            field9660 = -1.0197115F;
        }
    }

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "(I)V", line = 258)
    private final void method3837(int arg0) {
        ++field9654;
        int[] var2 = this.field9661[0];
        int[] var3 = this.field9661[1];
        int[] var4 = this.field9661[this.field9661.length - 2];
        int[] var5 = this.field9661[this.field9661.length + -1];
        this.field9658 = new int[] { var4[0] + -var5[0] + var4[0], -var5[1] - (-var4[1] - var4[1]) };
        if (arg0 >= 84) {
            this.field9662 = new int[] { var2[0] + var2[0] + -var3[0], -var3[1] - (-var2[1] - var2[1]) };
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZLol;)V", line = 279)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg1) {
            this.method27((byte) 38);
        }
        ++field9659;
        if (arg0 == 0) {
            this.field9664 = arg2.method2557(14929);
            this.field9661 = new int[arg2.method2557(14929)][2];
            for (int var4 = 0; ~var4 > ~this.field9661.length; ++var4) {
                this.field9661[var4][0] = arg2.method2565((byte) -84);
                this.field9661[var4][1] = arg2.method2565((byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V", line = 310)
    public class681() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)[I", line = 316)
    private final int[] method3838(int arg0, byte arg1) {
        if (arg1 != -31) {
            this.method3838(125, (byte) -89);
        }
        ++field9652;
        if (arg0 < 0) {
            return this.field9662;
        } else {
            return ~this.field9661.length >= ~arg0 ? this.field9658 : this.field9661[arg0];
        }
    }
}
