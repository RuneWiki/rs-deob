import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class517 extends class335 {

    @OriginalMember(owner = "client!au", name = "G", descriptor = "I")
    private int field7185 = 4;

    @OriginalMember(owner = "client!au", name = "F", descriptor = "I")
    private int field7184 = 4;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!au", name = "E", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!au", name = "J", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!au", name = "H", descriptor = "[I")
    public static int[] field7186;

    @OriginalMember(owner = "client!au", name = "I", descriptor = "[J")
    public static long[] field7187;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method2933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class414.field5433 = arg1;
        class576.field7857 = arg4;
        if (arg5 == 1) {
            class538.field7390 = arg3;
            ++field7180;
            class603.field8433 = arg6;
            class404.field5345 = arg0;
            class300.field3973 = arg2;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZI)[I", line = 20)
    public final int[] method3(boolean arg0, int arg1) {
        ++field7181;
        if (!arg0) {
            field7186 = null;
        }
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int var4 = class649.field8968 / this.field7185;
            int var5 = class316.field4237 / this.field7184;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1969(0, class316.field4237 * var6 / var5, -79);
            } else {
                var7 = this.method1969(0, 0, -43);
            }
            for (int var8 = 0; ~var8 > ~class649.field8968; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class649.field8968 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IZ)[[I", line = 77)
    public final int[][] method1(int arg0, boolean arg1) {
        ++field7188;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (arg1) {
            field7187 = null;
        }
        if (super.field4527.field1468) {
            int var4 = class649.field8968 / this.field7185;
            int var5 = class316.field4237 / this.field7184;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method1968(0, 3, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1968(class316.field4237 * var7 / var5, 3, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class649.field8968; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class649.field8968 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V", line = 146)
    public class517() {
        super(1, false);
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "(I)V", line = 149)
    public static void method2934(int arg0) {
        field7187 = null;
        field7186 = null;
        int var1 = -13 / ((15 - arg0) / 53);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILio;I)V", line = 159)
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg2 == -66) {
            ++field7182;
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    this.field7184 = arg1.method930(255);
                }
            } else {
                this.field7185 = arg1.method930(255);
            }
        }
    }
}
