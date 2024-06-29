import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class279 extends class263 {

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    private int field4221 = 4096;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    private int field4222 = 4096;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    private int field4223 = 4096;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field4218 = 0;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "[Ll;")
    public static class127[] field4217;

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 6)
    public class279() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)[[I", line = 9)
    public final int[][] method34(int arg0, byte arg1) {
        ++field4220;
        if (arg1 >= -45) {
            method1740(15, 64, 12, 125, 98, -2);
        }
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681) {
            int[][] var4 = this.method1646(0, 2, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class367.field5597; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field4221 * var12 >> 12;
                    var9[var11] = this.field4223 * var13 >> 12;
                    var10[var11] = this.field4222 * var14 >> 12;
                } else {
                    var8[var11] = this.field4221;
                    var9[var11] = this.field4223;
                    var10[var11] = this.field4222;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZLgk;)V", line = 73)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (!arg1) {
            field4217 = null;
        }
        ++field4219;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field4222 = arg2.method2727((byte) 43);
                }
            } else {
                this.field4223 = arg2.method2727((byte) 43);
            }
        } else {
            this.field4221 = arg2.method2727((byte) 43);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIII)Z", line = 127)
    public static final boolean method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class98.method760(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << class9.field75;
                int var7 = arg3 << class9.field75;
                return class486.method2891(var6 + 1, class249.field3405[arg0].method707(arg1, arg3) + arg5, var7 + 1) && class486.method2891(class324.field5060 + var6 - 1, class249.field3405[arg0].method707(arg1 + 1, arg3) + arg5, var7 + 1) && class486.method2891(class324.field5060 + var6 - 1, class249.field3405[arg0].method707(arg1 + 1, arg3 + 1) + arg5, class324.field5060 + var7 - 1) && class486.method2891(var6 + 1, class249.field3405[arg0].method707(arg1, arg3 + 1) + arg5, class324.field5060 + var7 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class500.field7400[arg0][var8][var14] == -class520.field7642) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class9.field75) + 1;
            int var10 = (arg3 << class9.field75) + 2;
            int var11 = class249.field3405[arg0].method707(arg1, arg3) + arg5;
            if (!class486.method2891(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << class9.field75) - 1;
                if (!class486.method2891(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << class9.field75) - 1;
                    if (!class486.method2891(var9, var11, var13)) {
                        return false;
                    } else if (!class486.method2891(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)V", line = 191)
    public static void method1741(byte arg0) {
        int var1 = -46 / ((arg0 - 74) / 38);
        field4217 = null;
    }
}
