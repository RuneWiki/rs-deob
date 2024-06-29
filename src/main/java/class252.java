import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class252 extends class59 {

    @OriginalMember(owner = "client!wu", name = "I", descriptor = "Z")
    public static boolean field3215 = false;

    @OriginalMember(owner = "client!wu", name = "W", descriptor = "I")
    public static int field3218 = 0;

    @OriginalMember(owner = "client!wu", name = "X", descriptor = "I")
    public static int field3219 = 328;

    @OriginalMember(owner = "client!wu", name = "V", descriptor = "Ldq;")
    public static class493 field3217 = new class493(24, -1);

    @OriginalMember(owner = "client!wu", name = "L", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)[[I", line = 6)
    public final int[][] method13(int arg0, int arg1) {
        ++field3216;
        if (arg1 != 1) {
            this.method13(6, 50);
        }
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (super.field2416.field7271 && this.method545(arg1 ^ -1929842395)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field766 * super.field766;
            for (int var8 = 0; class245.field3167 > var8; ++var8) {
                int var9 = super.field760[var8 % super.field762 + var7];
                var6[var8] = class378.method2145(255, var9) << 4;
                var5[var8] = class378.method2145(4080, var9 >> 4);
                var4[var8] = class378.method2145(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)V", line = 64)
    public static void method1523(byte arg0) {
        if (arg0 > 57) {
            field3217 = null;
        }
    }
}
