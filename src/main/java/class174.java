import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class174 extends class646 {

    @OriginalMember(owner = "client!sfa", name = "O", descriptor = "[S")
    private short[] field2800 = new short[257];

    @OriginalMember(owner = "client!sfa", name = "U", descriptor = "I")
    private int field2806 = 0;

    @OriginalMember(owner = "client!sfa", name = "K", descriptor = "Lvh;")
    public static class125 field2796 = new class125(26, 7);

    @OriginalMember(owner = "client!sfa", name = "R", descriptor = "S")
    public static short field2803 = 32767;

    @OriginalMember(owner = "client!sfa", name = "J", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!sfa", name = "L", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!sfa", name = "N", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!sfa", name = "P", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!sfa", name = "Q", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!sfa", name = "T", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!sfa", name = "V", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!sfa", name = "M", descriptor = "[I")
    private int[] field2798;

    @OriginalMember(owner = "client!sfa", name = "S", descriptor = "[I")
    private int[] field2804;

    @OriginalMember(owner = "client!sfa", name = "I", descriptor = "[[I")
    private int[][] field2794;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)V", line = 4)
    private final void method1277(int arg0) {
        ++field2802;
        int var2 = 3 % ((44 - arg0) / 58);
        int[] var3 = this.field2794[0];
        int[] var4 = this.field2794[1];
        int[] var5 = this.field2794[this.field2794.length - 2];
        int[] var6 = this.field2794[this.field2794.length + -1];
        this.field2798 = new int[] { var5[0] - -var5[0] + -var6[0], var5[1] - (-var5[1] - -var6[1]) };
        this.field2804 = new int[] { var3[0] + -var4[0] + var3[0], var3[1] - var4[1] - -var3[1] };
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)V", line = 27)
    public final void method422(int arg0) {
        ++field2807;
        if (this.field2794 == null) {
            this.field2794 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field2794.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field2806 == 2) {
                this.method1277(-74);
            }
            class549.method3223(123);
            if (arg0 != -1) {
                this.method295((class465) null, 38, (byte) 7);
            }
            this.method1281((byte) -71);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "(I)V", line = 51)
    public static void method1278(int arg0) {
        field2796 = null;
        if (arg0 < 51) {
            method1280(-18, 73);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(II)[I", line = 61)
    private final int[] method1279(int arg0, int arg1) {
        ++field2805;
        if (arg1 < ~arg0) {
            return this.field2804;
        } else {
            return this.field2794.length <= arg0 ? this.field2798 : this.field2794[arg0];
        }
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "()V", line = 82)
    public class174() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lek;IB)V", line = 87)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg2 < 7) {
            this.method1279(-86, 51);
        }
        if (~arg1 == -1) {
            this.field2806 = arg0.method2705(-78);
            this.field2794 = new int[arg0.method2705(-42)][2];
            for (int var4 = 0; ~this.field2794.length < ~var4; ++var4) {
                this.field2794[var4][0] = arg0.method2755((byte) -80);
                this.field2794[var4][1] = arg0.method2755((byte) -47);
            }
        }
        ++field2801;
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(II)V", line = 113)
    public static final void method1280(int arg0, int arg1) {
        ++field2799;
        if (arg1 > -4) {
            field2796 = null;
        }
        class449 var2 = class611.method3463(arg0, (byte) -121, 12);
        var2.method2614(61);
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(IB)[I", line = 126)
    public final int[] method424(int arg0, byte arg1) {
        ++field2797;
        if (arg1 != -120) {
            this.method422(-97);
        }
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (super.field9156.field5075) {
            int[] var4 = this.method3628(false, 0, arg0);
            for (int var5 = 0; ~class89.field1330 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2800[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V", line = 179)
    private final void method1281(byte arg0) {
        if (arg0 >= -52) {
            method1278(33);
        }
        ++field2795;
        int var2 = this.field2806;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field2794.length + -1) < ~var5 && ~var4 <= ~this.field2794[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field2794[var5 + -1];
                    int[] var7 = this.field2794[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class43.field587[var8 >> 5 & 255] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field2800[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field2794.length + -1 > var14 && ~this.field2794[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field2794[var14 + -1];
                    int[] var16 = this.field2794[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field2800[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field2794.length + -1 && ~var21 <= ~this.field2794[var22][0]; ++var22) {
                }
                int[] var23 = this.field2794[var22 - 1];
                int[] var24 = this.field2794[var22];
                int var25 = this.method1279(var22 + -2, -1)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1279(var22 + 1, -1)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 - -var26 + -var25;
                int var32 = var25 - (var26 + var31);
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 - (-var26 + -var37);
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field2800[var20] = (short) var38;
            }
        }
    }
}
