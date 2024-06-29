import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class69 extends class573 {

    @OriginalMember(owner = "client!qw", name = "I", descriptor = "Z")
    private boolean field1461 = true;

    @OriginalMember(owner = "client!qw", name = "J", descriptor = "Z")
    private boolean field1462 = true;

    @OriginalMember(owner = "client!qw", name = "K", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!qw", name = "L", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!qw", name = "M", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!qw", name = "N", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!qw", name = "O", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Llk;ILr;)V")
    public static final void method775(class545 arg0, int arg1, class167 arg2) {
        if (arg1 != 1) {
            method775((class545) null, -97, (class167) null);
        }
        ++field1465;
        boolean var3 = class268.field3985.method253(arg0.field7687, true, arg0.field7696, arg2, !arg0.field7619 ? null : class532.field7456.field8621, -16777216 | arg0.field7620, arg0.field7638, arg0.field7702) == null;
        if (var3) {
            class427.field6163.method1229(new class7(arg0.field7702, arg0.field7687, arg0.field7696, arg0.field7620 | -16777216, arg0.field7638, arg0.field7619), (byte) 120);
            class531.method3088(arg0, (byte) 54);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field1467;
        int[] var3 = super.field8321.method3164(arg0, -117);
        if (super.field8321.field7825) {
            int[] var4 = this.method3292(0, 0, this.field1461 ? -arg0 + class189.field3019 : arg0);
            if (this.field1462) {
                for (int var5 = 0; var5 < class540.field7555; ++var5) {
                    var3[var5] = var4[class591.field8492 - var5];
                }
            } else {
                class692.method3874(var4, 0, var3, 0, class540.field7555);
            }
        }
        return arg1 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "()V")
    public static final void method776() {
        for (int var0 = 0; var0 < class200.field3106; ++var0) {
            class122 var1 = class228.field3422[var0];
            class203.method1436(var1, true);
            class228.field3422[var0] = null;
        }
        class200.field3106 = 0;
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field1466;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (super.field8320.field3295) {
            int[][] var4 = this.method3293(0, 127, this.field1461 ? class189.field3019 - arg1 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field1462) {
                for (int var11 = 0; ~var11 > ~class540.field7555; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class540.field7555 > var12; ++var12) {
                    var8[var12] = var5[class591.field8492 - var12];
                    var9[var12] = var6[-var12 + class591.field8492];
                    var10[var12] = var7[-var12 + class591.field8492];
                }
            }
        }
        if (arg0 > -116) {
            this.field1461 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V")
    public class69() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILqh;)Ljava/lang/String;")
    public static final String method777(int arg0, int arg1, class61 arg2) {
        ++field1464;
        try {
            int var3 = arg2.method752(-27278);
            if (~var3 < ~arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field1393 += class301.field4497.method3684(arg1 + 28757, arg2.field1393, 0, arg2.field1397, var4, var3);
            String var5 = class255.method1692(0, var4, var3, arg1 ^ 28720);
            return arg1 != -28749 ? null : var5;
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field1463;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field8334 = ~arg0.method732(-559537960) == -2;
                }
            } else {
                this.field1461 = arg0.method732(-559537960) == 1;
            }
        } else {
            this.field1462 = ~arg0.method732(-559537960) == -2;
        }
        if (arg2 != 3) {
            method775((class545) null, -100, (class167) null);
        }
    }
}
