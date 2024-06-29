import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class57 extends class84 {

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    private int field811 = 0;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    private int field815 = 20;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    private int field817 = 1365;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    private int field814 = 0;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "Lcc;")
    public static class216 field812 = new class216(260);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    public static int field820 = -1;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "[J")
    public static long[] field819 = new long[200];

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field821 = 0;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field816;
        if (arg0 >= -125) {
            this.method91((byte) -123, 48);
        }
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            for (int var4 = 0; ~class20.field221 < ~var4; ++var4) {
                int var5 = (class26.field301[arg1] << 12) / this.field817 - -this.field814;
                int var6 = var5;
                int var7 = (class184.field2967[var4] << 12) / this.field817 + this.field811;
                int var8 = var7;
                int var9 = var7;
                int var10 = var5;
                int var11 = var7 * var7 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && ~this.field815 < ~var13) {
                    ++var13;
                    var10 = (var9 * var10 >> 12) * 2 - -var6;
                    var9 = var8 + var11 + -var12;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field815 - 1 > var13 ? (var13 << 12) / this.field815 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field814 = arg0.method1126(false);
                    }
                } else {
                    this.field811 = arg0.method1126(false);
                }
            } else {
                this.field815 = arg0.method1126(false);
            }
        } else {
            this.field817 = arg0.method1126(false);
        }
        ++field813;
        if (arg1 < 87) {
            this.field817 = 77;
        }
    }

    @OriginalMember(owner = "client!i", name = "i", descriptor = "(I)V")
    public static void method418(int arg0) {
        if (arg0 != -13276) {
            method418(-40);
        }
        field819 = null;
        field812 = null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class57() {
        super(0, true);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBIII)V")
    public static final void method419(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class272.field4374 = arg3;
        class211.field3386 = arg2;
        if (arg1 != -62) {
            method418(59);
        }
        class207.field3328 = arg0;
        class228.field3657 = arg4;
        ++field818;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class135 var20 = new class135(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class220.field3525[var21][arg1][arg2] == null) {
                    class220.field3525[var21][arg1][arg2] = new class286(var21, arg1, arg2);
                }
            }
            class220.field3525[arg0][arg1][arg2].field4537 = var20;
        } else if (arg3 != 1) {
            class203 var24 = new class203(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class220.field3525[var25][arg1][arg2] == null) {
                    class220.field3525[var25][arg1][arg2] = new class286(var25, arg1, arg2);
                }
            }
            class220.field3525[arg0][arg1][arg2].field4527 = var24;
        } else {
            class135 var22 = new class135(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class220.field3525[var23][arg1][arg2] == null) {
                    class220.field3525[var23][arg1][arg2] = new class286(var23, arg1, arg2);
                }
            }
            class220.field3525[arg0][arg1][arg2].field4537 = var22;
        }
    }
}
