import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class248 extends class314 {

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "Z")
    private boolean field3952 = true;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "Z")
    private boolean field3956 = true;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "Lrl;")
    public static class672 field3954 = new class672(74, -1);

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "[I")
    public static int[] field3959 = new int[8];

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field3955;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 > -1) {
            this.method4(-7, (byte) 103);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field4936 = ~arg1.method70(-9059) == -2;
                }
            } else {
                this.field3956 = arg1.method70(-9059) == 1;
            }
        } else {
            this.field3952 = ~arg1.method70(-9059) == -2;
        }
        ++field3953;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field3957;
        int[] var3 = super.field4928.method534((byte) -56, arg0);
        if (arg1 <= 109) {
            this.field3952 = false;
        }
        if (super.field4928.field618) {
            int[] var4 = this.method2140(0, !this.field3956 ? arg0 : -arg0 + class66.field849, -122);
            if (this.field3952) {
                for (int var5 = 0; class81.field1009 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class504.field7373];
                }
            } else {
                class398.method2565(var4, 0, var3, 0, class81.field1009);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
    public static void method1765(byte arg0) {
        field3959 = null;
        field3955 = null;
        field3954 = null;
        if (arg0 <= 39) {
            method1765((byte) 68);
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class248() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)[[I")
    public final int[][] method4(int arg0, byte arg1) {
        ++field3958;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (arg1 < 68) {
            this.method4(85, (byte) 32);
        }
        if (super.field4931.field2799) {
            int[][] var4 = this.method2143(0, !this.field3956 ? arg0 : class66.field849 - arg0, (byte) -4);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field3952) {
                for (int var11 = 0; ~var11 > ~class81.field1009; ++var11) {
                    var8[var11] = var5[class504.field7373 - var11];
                    var9[var11] = var6[class504.field7373 - var11];
                    var10[var11] = var7[-var11 + class504.field7373];
                }
            } else {
                for (int var12 = 0; ~class81.field1009 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }
}
