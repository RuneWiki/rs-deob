import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class24 extends class182 {

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "Lfe;")
    public static class127 field437;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "(I)V")
    public static void method152(int arg0) {
        if (arg0 < 87) {
            field437 = null;
        }
        field437 = null;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
    public class24() {
        super(3, false);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        ++field436;
        int[] var3 = super.field2911.method77(arg1, -82);
        if (super.field2911.field287) {
            int[] var4 = this.method1323(0, -17707, arg1);
            int[] var5 = this.method1323(1, -17707, arg1);
            int[] var6 = this.method1323(2, -17707, arg1);
            for (int var7 = 0; class4.field116 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        if (arg0) {
            field437 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIILda;IJ)Z")
    public static final boolean method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class312 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class42.method250(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (arg0) {
            method156((byte) 87);
        }
        if (~arg2 == -1) {
            super.field2896 = ~arg1.method1802((byte) 115) == -2;
        }
        ++field433;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
    public static final void method156(byte arg0) {
        ++field431;
        if (arg0 == -65) {
            class278.field4624.method990((byte) 44);
            class244.field4099.method455(-22178);
            class293.field4806.method455(-22178);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        int var3 = -5 / ((-64 - arg0) / 49);
        int[][] var4 = super.field2905.method50(arg1, (byte) 119);
        ++field432;
        if (super.field2905.field158) {
            int[] var5 = this.method1323(2, -17707, arg1);
            int[][] var6 = this.method1327(0, 0, arg1);
            int[][] var7 = this.method1327(0, 1, arg1);
            int[] var8 = var4[1];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var7[0];
            int[] var13 = var6[2];
            int[] var14 = var6[1];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; ~class4.field116 < ~var17; ++var17) {
                int var18 = var5[var17];
                if (~var18 != -4097) {
                    if (~var18 != -1) {
                        int var19 = -var18 + 4096;
                        var9[var17] = var11[var17] * var18 + var12[var17] * var19 >> 12;
                        var8[var17] = var14[var17] * var18 + var15[var17] * var19 >> 12;
                        var10[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                    } else {
                        var9[var17] = var12[var17];
                        var8[var17] = var15[var17];
                        var10[var17] = var16[var17];
                    }
                } else {
                    var9[var17] = var11[var17];
                    var8[var17] = var14[var17];
                    var10[var17] = var13[var17];
                }
            }
        }
        return var4;
    }
}
