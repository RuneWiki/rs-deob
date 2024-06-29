import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class308 extends class325 {

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field4449 = -1;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "[Lwea;")
    public static class167[] field4450;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V", line = 4)
    public static void method1944(boolean arg0) {
        if (!arg0) {
            field4449 = -128;
        }
        field4450 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 16)
    public class308() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljp;IB)V", line = 21)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            super.field4738 = ~arg0.method2398(-1372747256) == -2;
        }
        ++field4448;
        if (arg2 > -41) {
            this.method360(-71, (byte) 42);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)[I", line = 38)
    public final int[] method100(byte arg0, int arg1) {
        ++field4452;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (arg0 <= 21) {
            return null;
        } else {
            if (super.field4727.field6067) {
                int[] var4 = this.method2062(arg1, 0, (byte) 33);
                for (int var5 = 0; ~class261.field3874 < ~var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)[[I", line = 70)
    public final int[][] method360(int arg0, byte arg1) {
        ++field4451;
        int[][] var3 = super.field4733.method1251((byte) 82, arg0);
        if (arg1 != -9) {
            field4450 = null;
        }
        if (super.field4733.field2369) {
            int[][] var4 = this.method2063(0, 1, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class261.field3874 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }
}
