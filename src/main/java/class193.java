import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class193 extends class404 {

    @OriginalMember(owner = "client!le", name = "C", descriptor = "Z")
    private boolean field3042 = true;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "Z")
    private boolean field3045 = true;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "Lbg;")
    public static class310 field3046 = new class310(70, 8);

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field3052 = 0;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "[I")
    public static int[] field3049 = new int[1000];

    @OriginalMember(owner = "client!le", name = "L", descriptor = "Lbg;")
    public static class310 field3051 = new class310(26, 3);

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Les;")
    public static class248 field3050;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "Llt;")
    public static class458 field3048;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)[[I", line = 3)
    public final int[][] method89(int arg0, int arg1) {
        if (arg0 != -1) {
            method1202(19);
        }
        ++field3043;
        int[][] var3 = super.field5869.method2819(arg1, arg0 + 2);
        if (super.field5869.field7156) {
            int[][] var4 = this.method2400(-11872, !this.field3045 ? arg1 : -arg1 + class435.field6374, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field3042) {
                for (int var11 = 0; class431.field6348 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~class431.field6348 < ~var12; ++var12) {
                    var8[var12] = var5[-var12 + class98.field1757];
                    var9[var12] = var6[class98.field1757 - var12];
                    var10[var12] = var7[-var12 + class98.field1757];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "h", descriptor = "(I)V", line = 69)
    public static void method1202(int arg0) {
        field3046 = null;
        field3048 = null;
        field3051 = null;
        int var1 = -114 % ((-24 - arg0) / 36);
        field3049 = null;
        field3050 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILha;I)V", line = 82)
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field3040;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field5873 = arg1.method257((byte) 97) == 1;
                }
            } else {
                this.field3045 = arg1.method257((byte) 110) == 1;
            }
        } else {
            this.field3042 = ~arg1.method257((byte) 91) == -2;
        }
        if (arg0 != 0) {
            this.method89(-74, 4);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 128)
    public class193() {
        super(1, false);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[I", line = 141)
    public final int[] method90(int arg0, int arg1) {
        ++field3047;
        int[] var3 = super.field5870.method372(arg1, (byte) 79);
        if (arg0 > -47) {
            this.method89(-78, 31);
        }
        if (super.field5870.field810) {
            int[] var4 = this.method2394(0, (byte) 64, this.field3045 ? -arg1 + class435.field6374 : arg1);
            if (!this.field3042) {
                class356.method2182(var4, 0, var3, 0, class431.field6348);
            } else {
                for (int var5 = 0; ~var5 > ~class431.field6348; ++var5) {
                    var3[var5] = var4[-var5 + class98.field1757];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V", line = 180)
    public static final void method1203(boolean arg0) {
        if (arg0) {
            ++field3044;
            for (class216 var1 = (class216) class480.field7334.method8((byte) -98); var1 != null; var1 = (class216) class480.field7334.method17((byte) -78)) {
                class378 var2 = var1.field3336;
                if (var2.field5523) {
                    var1.method1121(!arg0);
                    var2.method2276((byte) -118);
                } else if (var2.field5517 <= class369.field5424) {
                    var2.method2278(0, class115.field1951);
                    if (!var2.field5523) {
                        class408.method2418(var2, true);
                    } else {
                        var1.method1121(false);
                    }
                }
            }
        }
    }
}
