import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class202 extends class68 {

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "[S")
    private short[] field2807 = new short[257];

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    private int field2809 = 0;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field2795 = 0;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field2801 = 0;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field2798 = 0;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2799 = "Loading interfaces - ";

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "I")
    public static int field2812 = -1;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "I")
    public static int field2806 = 0;

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "[S")
    public static short[] field2814 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "[I")
    private int[] field2803;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "[I")
    private int[] field2804;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "[I")
    public static int[] field2808;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "[[I")
    private int[][] field2805;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IB)Z")
    public static final boolean method1277(int arg0, byte arg1) {
        ++field2796;
        if (arg0 < 0) {
            return false;
        } else {
            if (arg1 != 83) {
                method1281(-90, 56, 56, 112, (class268) null, 39, -83L, 119, 64, 89, -79);
            }
            int var2 = class221.field3306[arg0];
            if (~var2 <= -2001) {
                var2 -= 2000;
            }
            return ~var2 == -1007;
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)V")
    public static void method1278(byte arg0) {
        field2808 = null;
        field2814 = null;
        field2799 = null;
        if (arg0 != -37) {
            method1281(9, 0, -61, -29, (class268) null, 76, -116L, 98, -121, 107, 124);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class202() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    private final void method1279(boolean arg0) {
        int[] var2 = this.field2805[0];
        ++field2800;
        int[] var3 = this.field2805[this.field2805.length + -2];
        int[] var4 = this.field2805[1];
        int[] var5 = this.field2805[this.field2805.length - 1];
        this.field2803 = new int[] { var3[0] + -var5[0] + var3[0], var3[1] + -var5[1] + var3[1] };
        this.field2804 = new int[] { var2[0] + -var4[0] + var2[0], var2[1] - var4[1] - -var2[1] };
        if (arg0) {
            method1277(45, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method192(-53);
        }
        if (~arg1 == -1) {
            this.field2809 = arg0.method1453((byte) -127);
            this.field2805 = new int[arg0.method1453((byte) -128)][2];
            for (int var4 = 0; ~this.field2805.length < ~var4; ++var4) {
                this.field2805[var4][0] = arg0.method1445(false);
                this.field2805[var4][1] = arg0.method1445(false);
            }
        }
        ++field2811;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[I")
    private final int[] method1280(int arg0, int arg1) {
        if (arg0 <= 68) {
            field2795 = 89;
        }
        ++field2810;
        if (~arg1 > -1) {
            return this.field2804;
        } else {
            return ~arg1 <= ~this.field2805.length ? this.field2803 : this.field2805[arg1];
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIILsa;IJIIII)Z")
    public static final boolean method1281(int arg0, int arg1, int arg2, int arg3, class268 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class193.method1233(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(B)V")
    private final void method1282(byte arg0) {
        int var2 = this.field2809;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field2805.length + -1) < ~var5 && var4 >= this.field2805[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field2805[var5 + -1];
                    int[] var7 = this.field2805[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class54.field778[(var8 & 8166) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field2807[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field2805.length + -1 > var14 && this.field2805[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field2805[var14 + -1];
                    int[] var16 = this.field2805[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field2807[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field2805.length - 1) && var21 >= this.field2805[var22][0]; ++var22) {
                }
                int[] var23 = this.field2805[var22 + -1];
                int[] var24 = this.field2805[var22];
                int var25 = this.method1280(123, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1280(73, var22 + 1)[1];
                int var29 = -var27 + var28 + -var25 + var26;
                int var30 = -var29 + var25 + -var26;
                int var31 = var27 - var25;
                int var33 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var34 = var33 * var33 >> 12;
                int var35 = (var29 * var33 >> 12) * var34 >> 12;
                int var36 = var31 * var33 >> 12;
                int var37 = var30 * var34 >> 12;
                int var38 = var35 + var36 - (-var37 - var26);
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field2807[var20] = (short) var38;
            }
        }
        if (arg0 >= -89) {
            this.method1279(true);
        }
        ++field2797;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        ++field2813;
        int[] var3 = super.field917.method1920(arg0, true);
        if (arg1 > -118) {
            method1277(-23, (byte) -98);
        }
        if (super.field917.field4474) {
            int[] var4 = this.method423(0, (byte) -54, arg0);
            for (int var5 = 0; ~var5 > ~class89.field1248; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field2807[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
    public final void method192(int arg0) {
        ++field2802;
        if (this.field2805 == null) {
            this.field2805 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0 >= -18) {
            this.method192(25);
        }
        if (~this.field2805.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field2809 == 2) {
                this.method1279(false);
            }
            class250.method1674(true);
            this.method1282((byte) -103);
        }
    }
}
