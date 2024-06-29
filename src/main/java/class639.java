import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class639 extends class314 {

    @OriginalMember(owner = "client!bw", name = "N", descriptor = "I")
    private int field8965 = 1;

    @OriginalMember(owner = "client!bw", name = "S", descriptor = "I")
    private int field8970 = 1;

    @OriginalMember(owner = "client!bw", name = "M", descriptor = "Lhga;")
    public static class158 field8964 = new class158(6, -2);

    @OriginalMember(owner = "client!bw", name = "L", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!bw", name = "O", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!bw", name = "P", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!bw", name = "Q", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!bw", name = "R", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ldw;B)V", line = 3)
    public static final void method3710(class668 arg0, byte arg1) {
        if (arg1 != -113) {
            field8964 = null;
        }
        ++field8967;
        class360.field5701 = arg0;
    }

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "(I)V", line = 16)
    public static void method3711(int arg0) {
        if (arg0 != 65536) {
            field8964 = null;
        }
        field8964 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)[I", line = 30)
    public final int[] method6(int arg0, int arg1) {
        ++field8963;
        int[] var3 = super.field4928.method534((byte) -58, arg0);
        if (arg1 < 109) {
            return null;
        } else {
            if (super.field4928.field618) {
                int var4 = this.field8965 + 1 - -this.field8965;
                int var5 = 65536 / var4;
                int var6 = this.field8970 + this.field8970 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field8965 + arg0; ~var9 >= ~(this.field8965 + arg0); ++var9) {
                    int[] var13 = this.method2140(0, class66.field849 & var9, -124);
                    int[] var14 = new int[class81.field1009];
                    int var15 = 0;
                    for (int var16 = -this.field8970; ~var16 >= ~this.field8970; ++var16) {
                        var15 += var13[var16 & class504.field7373];
                    }
                    int var17 = 0;
                    while (class81.field1009 > var17) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[var17 - this.field8970 & class504.field7373];
                        ++var17;
                        var15 = var13[class504.field7373 & this.field8970 + var17] + var18;
                    }
                    var8[var9 - -this.field8965 + -arg0] = var14;
                }
                for (int var10 = 0; class81.field1009 > var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var12 < var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "()V", line = 329)
    public class639() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)[[I", line = 127)
    public final int[][] method4(int arg0, byte arg1) {
        ++field8966;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (arg1 <= 68) {
            this.method5((byte) 53, (class6) null, -13);
        }
        if (super.field4931.field2799) {
            int var4 = this.field8965 + 1 + this.field8965;
            int var5 = 65536 / var4;
            int var6 = this.field8970 - -1 + this.field8970;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field8965 + arg0; this.field8965 + arg0 >= var9; ++var9) {
                int[][] var19 = this.method2143(0, var9 & class66.field849, (byte) -4);
                int[][] var20 = new int[3][class81.field1009];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field8970; ~var27 >= ~this.field8970; ++var27) {
                    int var37 = var27 & class504.field7373;
                    var23 += var26[var37];
                    var22 += var25[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class81.field1009) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field8970 & class504.field7373;
                    int var33 = var21 - var24[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var22 - var25[var32];
                    ++var31;
                    int var36 = class504.field7373 & this.field8970 + var31;
                    var22 = var25[var36] + var35;
                    var21 = var24[var36] + var33;
                    var23 = var26[var36] + var34;
                }
                var8[-arg0 + this.field8965 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class81.field1009 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLie;I)V", line = 259)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 >= -1) {
            this.method4(-8, (byte) -71);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field4936 = arg1.method70(-9059) == 1;
                }
            } else {
                this.field8965 = arg1.method70(-9059);
            }
        } else {
            this.field8970 = arg1.method70(-9059);
        }
        ++field8969;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lpba;B)V", line = 303)
    public static final void method3712(class304 arg0, byte arg1) {
        ++field8968;
        if (arg1 >= 89) {
            class119 var2 = (class119) class415.field6359.method1558((long) arg0.field4197, (byte) -93);
            if (var2 != null) {
                if (var2.field1911 != null) {
                    class505.field7381.method1985(var2.field1911);
                    var2.field1911 = null;
                }
                var2.method707((byte) -122);
            }
        }
    }
}
