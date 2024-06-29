import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class230 extends class261 {

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "[I")
    private int[] field3802 = new int[3];

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    private int field3809 = 4096;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    private int field3806 = 4096;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    private int field3803 = 4096;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    private int field3814 = 409;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "Lve;")
    public static class255 field3808 = class87.method607(91, "::qa_op_test");

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "Li;")
    public static class204 field3813;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "Ljh;")
    public static class256 field3810;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "[I")
    public static int[] field3804;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(Z)V", line = 18)
    public static void method1597(boolean arg0) {
        field3808 = null;
        field3810 = null;
        field3804 = null;
        if (arg0) {
            field3808 = (class255) null;
        }
        field3813 = null;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 143)
    public class230() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lpb;BI)V", line = 38)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 >= -115) {
            method1598(108, 13, -78);
        }
        if (arg2 == 0) {
            this.field3814 = arg0.method423(255);
        } else if (arg2 == 1) {
            this.field3806 = arg0.method423(255);
        } else if (arg2 == 2) {
            this.field3803 = arg0.method423(255);
        } else if (arg2 == 3) {
            this.field3809 = arg0.method423(255);
        } else if (arg2 == 4) {
            int var5 = arg0.method465(true);
            this.field3802[2] = class154.method1134(0, var5 >> 12);
            this.field3802[0] = class154.method1134(var5 << 4, 267386880);
            this.field3802[1] = class154.method1134(65280, var5) >> 4;
        }
        field3807++;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(III)V", line = 109)
    public static final void method1598(int arg0, int arg1, int arg2) {
        field3812++;
        class246 var3 = class196.method1401(arg2, arg1 + 17828);
        int var4 = var3.field4131;
        int var5 = var3.field4133;
        if (arg1 != -17764) {
            return;
        }
        int var6 = var3.field4128;
        int var7 = class101.field1711[var6 - var5];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class256.method1797(var8 & arg0 << var5 | class93.field1601[var4] & ~var8, false, var4);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)[[I", line = 148)
    public final int[][] method13(boolean arg0, int arg1) {
        int[][] var3 = this.field4418.method35(arg1, 94);
        if (!arg0) {
            this.field3802 = (int[]) null;
        }
        field3805++;
        if (this.field4418.field94) {
            int[][] var4 = this.method1819(-112, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class92.field1576; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3802[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field3814 < var13) {
                    var6[var11] = var12;
                    var10[var11] = var7[var11];
                    var9[var11] = var8[var11];
                } else {
                    int var14 = var7[var11];
                    int var15 = var14 - this.field3802[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field3814 < var15) {
                        var6[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var8[var11];
                    } else {
                        int var16 = var8[var11];
                        int var17 = var16 - this.field3802[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field3814) {
                            var6[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var6[var11] = this.field3809 * var12 >> 12;
                            var10[var11] = this.field3803 * var14 >> 12;
                            var9[var11] = this.field3806 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
