import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class572 extends class634 {

    @OriginalMember(owner = "client!bha", name = "J", descriptor = "Lbq;")
    public static class289 field8135 = new class289();

    @OriginalMember(owner = "client!bha", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field8138 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!bha", name = "K", descriptor = "Ldh;")
    public static class320 field8136 = new class320(80, 7);

    @OriginalMember(owner = "client!bha", name = "N", descriptor = "I")
    public static int field8139 = 0;

    @OriginalMember(owner = "client!bha", name = "F", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!bha", name = "G", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!bha", name = "I", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!bha", name = "L", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!bha", name = "O", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(BI)[I", line = 3)
    public final int[] method13(byte arg0, int arg1) {
        ++field8134;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 > -55) {
            this.method3325(88, -13, (byte) -42);
        }
        if (super.field9114.field3897) {
            for (int var4 = 0; ~class635.field9139 < ~var4; ++var4) {
                this.method3325(arg1, var4, (byte) -38);
                int[] var5 = this.method3641(class448.field6466, 20604, 0);
                var3[var4] = var5[class512.field7301];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bha", name = "d", descriptor = "(B)V", line = 37)
    public static final void method3323(byte arg0) {
        ++field8140;
        class430.field6248.method3549(0);
        if (arg0 != -64) {
            field8136 = null;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(ILig;Z)V", line = 48)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        ++field8132;
        if (~arg0 == -1) {
            super.field9121 = ~arg1.method1423(-62) == -2;
        }
        if (arg2) {
            field8139 = 85;
        }
    }

    @OriginalMember(owner = "client!bha", name = "f", descriptor = "(I)V", line = 64)
    public static void method3324(int arg0) {
        field8136 = null;
        if (arg0 != 2) {
            field8136 = null;
        }
        field8138 = null;
        field8135 = null;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(BI)[[I", line = 78)
    public final int[][] method7(byte arg0, int arg1) {
        ++field8133;
        int var3 = -106 / ((arg0 - -56) / 53);
        int[][] var4 = super.field9126.method132(0, arg1);
        if (super.field9126.field295) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class635.field9139 < ~var8; ++var8) {
                this.method3325(arg1, var8, (byte) -38);
                int[][] var9 = this.method3642(0, class448.field6466, true);
                var5[var8] = var9[0][class512.field7301];
                var6[var8] = var9[1][class512.field7301];
                var7[var8] = var9[2][class512.field7301];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(IIB)V", line = 129)
    private final void method3325(int arg0, int arg1, byte arg2) {
        if (arg2 == -38) {
            ++field8137;
            int var4 = class246.field2980[arg1];
            int var5 = class164.field1840[arg0];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class448.field6466 = arg0;
                class512.field7301 = arg1;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class512.field7301 = arg0;
                class448.field6466 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class512.field7301 = -arg0 + class635.field9139;
                class448.field6466 = arg1;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class512.field7301 = arg1;
                class448.field6466 = -arg0 + class201.field2372;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class512.field7301 = -arg1 + class635.field9139;
                class448.field6466 = -arg0 + class201.field2372;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class448.field6466 = -arg1 + class201.field2372;
                class512.field7301 = -arg0 + class635.field9139;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class512.field7301 = arg0;
                class448.field6466 = -arg1 + class201.field2372;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class512.field7301 = -arg1 + class635.field9139;
                class448.field6466 = arg0;
            }
            class448.field6466 &= class312.field3870;
            class512.field7301 &= class110.field1162;
        }
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "()V", line = 206)
    public class572() {
        super(1, false);
    }
}
