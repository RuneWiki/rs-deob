import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class541 extends class314 {

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    private int field7891 = 0;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
    private int field7897 = 4096;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "[I")
    public static int[] field7895 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        if (arg1 <= 109) {
            return null;
        } else {
            ++field7893;
            int[] var3 = super.field4928.method534((byte) -89, arg0);
            if (super.field4928.field618) {
                int[] var4 = this.method2140(0, arg0, -126);
                for (int var5 = 0; var5 < class81.field1009; ++var5) {
                    int var6 = var4[var5];
                    if (this.field7891 > var6) {
                        var3[var5] = this.field7891;
                    } else if (this.field7897 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field7897;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field4936 = ~arg1.method70(-9059) == -2;
                }
            } else {
                this.field7897 = arg1.method67(12021);
            }
        } else {
            this.field7891 = arg1.method67(12021);
        }
        if (arg0 > -1) {
            this.method5((byte) -39, (class6) null, -66);
        }
        ++field7898;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
    public class541() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[[I")
    public final int[][] method4(int arg0, byte arg1) {
        ++field7894;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (super.field4931.field2799) {
            int[][] var4 = this.method2143(0, arg0, (byte) -4);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class81.field1009; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field7891 >= ~var12) {
                    if (~var12 < ~this.field7897) {
                        var8[var11] = this.field7897;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field7891;
                }
                if (this.field7891 > var13) {
                    var9[var11] = this.field7891;
                } else if (var13 > this.field7897) {
                    var9[var11] = this.field7897;
                } else {
                    var9[var11] = var13;
                }
                if (~var14 <= ~this.field7891) {
                    if (this.field7897 >= var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field7897;
                    }
                } else {
                    var10[var11] = this.field7891;
                }
            }
        }
        if (arg1 < 68) {
            field7896 = 125;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "(I)V")
    public static void method3280(int arg0) {
        if (arg0 == 4096) {
            field7895 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V")
    public static final void method3281(int arg0, int arg1) {
        int var2 = 101 / ((27 - arg0) / 34);
        ++field7892;
        class413 var3 = class674.method3852(8, arg1, 125);
        var3.method2634(1065768928);
    }
}
