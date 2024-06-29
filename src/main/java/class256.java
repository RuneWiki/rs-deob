import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class256 extends class107 {

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "[S")
    private short[] field4220 = new short[257];

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    private int field4226 = 0;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "[I")
    private int[] field4218;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "[I")
    private int[] field4222;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "[[I")
    private int[][] field4225;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(CI)Z")
    public static final boolean method1730(char arg0, int arg1) {
        ++field4216;
        if (arg1 >= -7) {
            method1731(-31, -39, 7, -2, 4);
        }
        return ~arg0 <= -49 && arg0 <= '9' || ~arg0 <= -66 && ~arg0 >= -91 || arg0 >= 'a' && ~arg0 >= -123;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V")
    public static final void method1731(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4224;
        class311.field5027.field4458 = 0;
        class311.field5027.method1865(20, arg3 + 87);
        class311.field5027.method1865(arg2, -116);
        class311.field5027.method1865(arg1, 123);
        class311.field5027.method1824(arg4, arg3 + 28357);
        class311.field5027.method1824(arg0, 28357);
        class72.field1150 = arg3;
        class31.field530 = 0;
        class112.field1719 = 1;
        class24.field444 = -3;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class256() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)[I")
    private final int[] method1732(int arg0, int arg1) {
        ++field4221;
        if (arg0 < arg1) {
            return this.field4218;
        } else {
            return arg0 >= this.field4225.length ? this.field4222 : this.field4225[arg0];
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field4215;
        int var3 = 58 / ((-34 - arg0) / 49);
        int[] var4 = super.field1661.method894(117, arg1);
        if (super.field1661.field2115) {
            int[] var5 = this.method756(0, arg1, -29053);
            for (int var6 = 0; class24.field443 > var6; ++var6) {
                int var7 = var5[var6] >> 4;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var4[var6] = this.field4220[var7];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field4228;
        if (~arg0 == -1) {
            this.field4226 = arg1.method1849(255);
            this.field4225 = new int[arg1.method1849(255)][2];
            for (int var4 = 0; this.field4225.length > var4; ++var4) {
                this.field4225[var4][0] = arg1.method1837(252);
                this.field4225[var4][1] = arg1.method1837(252);
            }
        }
        if (arg2 != 28) {
            this.method1732(44, -108);
        }
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V")
    private final void method1733(int arg0) {
        ++field4227;
        if (arg0 == -15522) {
            int[] var2 = this.field4225[this.field4225.length + -2];
            int[] var3 = this.field4225[1];
            int[] var4 = this.field4225[0];
            int[] var5 = this.field4225[this.field4225.length - 1];
            this.field4218 = new int[] { -var3[0] - (-var4[0] - var4[0]), -var3[1] - (-var4[1] - var4[1]) };
            this.field4222 = new int[] { -var5[0] - -var2[0] + var2[0], var2[1] - (var5[1] - var2[1]) };
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        ++field4223;
        if (this.field4225 == null) {
            this.field4225 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0 != 35) {
            this.field4226 = -119;
        }
        if (~this.field4225.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field4226 == -3) {
                this.method1733(-15522);
            }
            class28.method220((byte) 103);
            this.method1734(1332850156);
        }
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V")
    private final void method1734(int arg0) {
        int var2 = this.field4226;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field4225.length - 1) && var4 >= this.field4225[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field4225[var5 + -1];
                    int[] var7 = this.field4225[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class144.field2323[(8175 & var8) >> 5] >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field4220[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field4225.length + -1) && this.field4225[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field4225[var14 + -1];
                    int[] var16 = this.field4225[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field4220[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field4225.length + -1 && var21 >= this.field4225[var22][0]; ++var22) {
                }
                int[] var23 = this.field4225[var22];
                int[] var24 = this.field4225[var22 + -1];
                int var25 = this.method1732(var22 + -2, arg0 ^ 1332850156)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1732(var22 + 1, 0)[1];
                int var29 = (-var24[0] + var21 << 12) / (var23[0] + -var24[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 - (-var27 + var26);
                int var33 = -var27 + var25 + -var31;
                int var34 = -var25 + var26;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var29 * var34 >> 12;
                int var37 = var30 * var33 >> 12;
                int var38 = var35 + var37 + var36 + var27;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field4220[var20] = (short) var38;
            }
        }
        if (arg0 != 1332850156) {
            this.method1734(-11);
        }
        ++field4214;
    }
}
