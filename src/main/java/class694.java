import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class694 extends class214 {

    @OriginalMember(owner = "client!v", name = "H", descriptor = "[S")
    private short[] field9841 = new short[257];

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    private int field9850 = 0;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field9839 = 0;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "[[Z")
    public static boolean[][] field9848 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!v", name = "I", descriptor = "F")
    public static float field9842;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field9837;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field9838;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field9845;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field9852;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field9853;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "[I")
    private int[] field9849;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "[I")
    private int[] field9851;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "[[I")
    private int[][] field9847;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V", line = 6)
    private final void method3872(byte arg0) {
        if (arg0 < -30) {
            int var2 = this.field9850;
            if (~var2 != -3) {
                if (var2 == 1) {
                    for (int var3 = 0; ~var3 > -258; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; var5 < this.field9847.length + -1 && ~this.field9847[var5][0] >= ~var4; ++var5) {
                        }
                        int[] var6 = this.field9847[var5 + -1];
                        int[] var7 = this.field9847[var5];
                        int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                        int var9 = 4096 - class3.field18[255 & var8 >> 5] >> 1;
                        int var10 = 4096 - var9;
                        int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                        if (~var11 >= 32767) {
                            var11 = -32767;
                        }
                        if (var11 >= 32768) {
                            var11 = 32767;
                        }
                        this.field9841[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; ~var12 > -258; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; var14 < this.field9847.length + -1 && ~this.field9847[var14][0] >= ~var13; ++var14) {
                        }
                        int[] var15 = this.field9847[var14 + -1];
                        int[] var16 = this.field9847[var14];
                        int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                        int var18 = 4096 - var17;
                        int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                        if (var19 <= -32768) {
                            var19 = -32767;
                        }
                        if (~var19 <= -32769) {
                            var19 = 32767;
                        }
                        this.field9841[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; ~var20 > -258; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; var22 < this.field9847.length + -1 && ~var21 <= ~this.field9847[var22][0]; ++var22) {
                    }
                    int[] var23 = this.field9847[var22 + -1];
                    int[] var24 = this.field9847[var22];
                    int var25 = this.method3873(var22 + -2, -1)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method3873(var22 + 1, -1)[1];
                    int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = var28 - var27 + -var25 + var26;
                    int var32 = -var26 + -var31 + var25;
                    int var33 = -var25 + var27;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var26 + var37 + var35 + var36;
                    if (~var38 >= 32767) {
                        var38 = -32767;
                    }
                    if (var38 >= 32768) {
                        var38 = 32767;
                    }
                    this.field9841[var20] = (short) var38;
                }
            }
            ++field9853;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(II)[I", line = 186)
    private final int[] method3873(int arg0, int arg1) {
        ++field9837;
        if (~arg0 > arg1) {
            return this.field9849;
        } else {
            return arg0 >= this.field9847.length ? this.field9851 : this.field9847[arg0];
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 201)
    public class694() {
        super(1, true);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)V", line = 204)
    public static final void method3874(boolean arg0, int arg1) {
        if (class166.field2624 != null) {
            class166.field2624.method3118(25);
            class166.field2624 = null;
        }
        ++field9843;
        class714.field10032 = 0;
        class127.method975((byte) -83);
        class645.method3638();
        for (int var2 = 0; var2 < 4; ++var2) {
            class247.field3958[var2].method1650((byte) 124);
        }
        class520.method3097(false, 16);
        System.gc();
        class340.method2167(arg1, 2);
        class647.field9210 = -1;
        class354.field5373 = false;
        class384.method2409(false);
        class313.method2062(true, (byte) 43);
        class319.field4745 = 0;
        class567.field8048 = 0;
        class265.field4123 = arg1;
        class723.field10155 = 0;
        class157.field2437 = 0;
        class130.field2123 = 0;
        for (int var3 = 0; ~class541.field7732.length < ~var3; ++var3) {
            class541.field7732[var3] = null;
        }
        class494.method3001(21332);
        for (int var4 = 0; ~var4 > -2049; ++var4) {
            class279.field4271[var4] = null;
        }
        class356.field5394 = 0;
        class332.field4881.method3517(arg1 ^ -58);
        class271.field4162 = 0;
        class665.field9441.method3517(-60);
        class625.method3533((byte) -107);
        class110.field1714 = 0;
        class422.field6216.method2015((byte) 24);
        class449.method2759(10);
        class222.method1574(true);
        class73.field1102 = 0L;
        class53.field851 = null;
        if (arg0) {
            class658.method3704(-5697, 12);
        } else {
            class658.method3704(-5697, 3);
            try {
                class284.method1862(class351.field5138, "loggedout", (byte) 47);
            } catch (Throwable var5) {
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(B)V", line = 282)
    public static void method3875(byte arg0) {
        field9848 = null;
        if (arg0 >= -3) {
            field9848 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V", line = 293)
    public final void method65(int arg0) {
        ++field9854;
        if (arg0 <= 48) {
            this.method3873(106, 72);
        }
        if (this.field9847 == null) {
            this.field9847 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field9847.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field9850 == 2) {
                this.method3877((byte) -110);
            }
            class465.method2853(256);
            this.method3872((byte) -117);
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V", line = 316)
    public static final void method3876(int arg0) {
        class13.field119.method244(class418.field6153);
        if (arg0 != 1) {
            method3876(118);
        }
        ++field9838;
        class13.field119.method288(class665.field9440, class650.field9234, class304.field4628, class328.field4848);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)[I", line = 345)
    public final int[] method64(int arg0, byte arg1) {
        ++field9840;
        int[] var3 = super.field3544.method3869(arg0, -126);
        if (super.field3544.field9836) {
            int[] var4 = this.method1545(arg0, 0, arg1 ^ -6);
            for (int var5 = 0; ~class626.field8787 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field9841[var6];
            }
        }
        if (arg1 != 5) {
            this.method65(-96);
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(B)V", line = 386)
    private final void method3877(byte arg0) {
        ++field9845;
        int[] var2 = this.field9847[0];
        int[] var3 = this.field9847[1];
        int[] var4 = this.field9847[this.field9847.length + -2];
        int[] var5 = this.field9847[this.field9847.length + -1];
        this.field9851 = new int[] { var4[0] - -var4[0] - var5[0], var4[1] + -var5[1] + var4[1] };
        this.field9849 = new int[] { var2[0] + var2[0] - var3[0], var2[1] - -var2[1] + -var3[1] };
        if (arg0 >= -54) {
            this.method64(-44, (byte) 19);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILofa;I)V", line = 407)
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 > 92) {
            if (arg2 == 0) {
                this.field9850 = arg1.method1987(-76);
                this.field9847 = new int[arg1.method1987(-26)][2];
                for (int var4 = 0; ~var4 > ~this.field9847.length; ++var4) {
                    this.field9847[var4][0] = arg1.method1989((byte) -40);
                    this.field9847[var4][1] = arg1.method1989((byte) -105);
                }
            }
            ++field9844;
        }
    }
}
