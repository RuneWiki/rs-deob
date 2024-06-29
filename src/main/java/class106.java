import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class106 extends class219 {

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Lli;")
    public static class18 field1924 = new class18();

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "Lbd;")
    public static class162 field1931 = class17.method142(0, "Weiter");

    @OriginalMember(owner = "client!v", name = "R", descriptor = "Lbd;")
    public static class162 field1932 = class17.method142(0, "Untersuchen");

    @OriginalMember(owner = "client!v", name = "S", descriptor = "Lbd;")
    public static class162 field1933 = class17.method142(0, ":");

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "[Ldc;")
    public static class71[] field1926;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V", line = 4)
    public static void method868(int arg0) {
        field1933 = null;
        field1932 = null;
        field1931 = null;
        field1924 = null;
        if (arg0 != -22826) {
            field1932 = (class162) null;
        }
        field1926 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILb;)V", line = 32)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field1927++;
        if (arg0 == arg1) {
            this.field3647 = arg2.method756(915905888) == 1;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 46)
    public class106() {
        super(1, false);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)[[I", line = 54)
    public final int[][] method219(int arg0, byte arg1) {
        field1930++;
        if (arg1 != 83) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            for (int var7 = 0; var7 < class128.field2326; var7++) {
                this.method869(1, arg0, var7);
                int[][] var8 = this.method1583(class295.field4946, true, 0);
                var6[var7] = var8[0][class82.field1429];
                var4[var7] = var8[1][class82.field1429];
                var5[var7] = var8[2][class82.field1429];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V", line = 98)
    private final void method869(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            return;
        }
        int var4 = class280.field4762[arg2];
        field1928++;
        int var5 = class53.field842[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var6 && (double) var6 <= -2.356194490192345D) {
            class82.field1429 = arg2;
            class295.field4946 = arg1;
        } else if (-1.5707963267948966D >= (double) var6 && (double) var6 >= -2.356194490192345D) {
            class82.field1429 = arg1;
            class295.field4946 = arg2;
        } else if (-0.7853981633974483D >= (double) var6 && -1.5707963267948966D <= (double) var6) {
            class82.field1429 = class128.field2326 - arg1;
            class295.field4946 = arg2;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class295.field4946 = class47.field749 - arg1;
            class82.field1429 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class82.field1429 = class128.field2326 - arg2;
            class295.field4946 = class47.field749 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class82.field1429 = class128.field2326 - arg1;
            class295.field4946 = class47.field749 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class295.field4946 = class47.field749 - arg2;
            class82.field1429 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class82.field1429 = class128.field2326 - arg2;
            class295.field4946 = arg1;
        }
        class295.field4946 &= class60.field927;
        class82.field1429 &= class252.field4208;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)[I", line = 176)
    public final int[] method41(boolean arg0, int arg1) {
        if (!arg0) {
            this.method41(true, 42);
        }
        field1925++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            for (int var4 = 0; var4 < class128.field2326; var4++) {
                this.method869(1, arg1, var4);
                int[] var5 = this.method1585(0, class295.field4946, -6606);
                var3[var4] = var5[class82.field1429];
            }
        }
        return var3;
    }
}
