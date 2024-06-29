import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class496 extends class642 {

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    private int field7020 = 4;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    private int field7027 = 4;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field7021 = 0;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "[Lgd;")
    public static class344[] field7024 = new class344[35];

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "Lvg;")
    public static class622 field7026 = new class622(15, -2);

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "Lvg;")
    public static class622 field7029 = new class622(16, -2);

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "F")
    public static float field7028;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field7019;
        int[] var3 = super.field9216.method1185(arg0, -101);
        if (super.field9216.field2418) {
            int var4 = class338.field4909 / this.field7020;
            int var5 = class106.field1578 / this.field7027;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method3658((byte) 112, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method3658((byte) 105, class106.field1578 * var7 / var5, 0);
            }
            for (int var8 = 0; class338.field4909 > var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class338.field4909 * var9 / var4];
                }
            }
        }
        if (arg1 != -9) {
            this.method3(65, -16);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[[I")
    public final int[][] method138(int arg0, int arg1) {
        ++field7023;
        int[][] var3 = super.field9211.method1068(0, arg1);
        if (arg0 != 21402) {
            field7029 = null;
        }
        if (super.field9211.field2131) {
            int var4 = class338.field4909 / this.field7020;
            int var5 = class106.field1578 / this.field7027;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method3657(class106.field1578 * var6 / var5, true, 0);
            } else {
                var7 = this.method3657(0, true, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class338.field4909; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class338.field4909 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
    public static final void method2831(boolean arg0, int arg1) {
        ++field7022;
        class489 var2 = class704.method3942(arg1, 11, 0);
        var2.method2799(-84);
        if (!arg0) {
            method2831(true, -105);
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
    public static void method2832(int arg0) {
        field7026 = null;
        if (arg0 == 0) {
            field7029 = null;
            field7024 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class496() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field7027 = arg1.method3115(29871);
            }
        } else {
            this.field7020 = arg1.method3115(29871);
        }
        if (arg2 < 29) {
            method2832(-32);
        }
        ++field7025;
    }
}
