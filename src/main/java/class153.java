import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class153 extends class535 {

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    private int field2329 = 4096;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    private int field2333 = 4096;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    private int field2331 = 4096;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "Lgw;")
    public static class118 field2328 = new class118();

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "F")
    public static float field2327;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 135)
    public class153() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILwn;I)V", line = 13)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 != -6232) {
            this.field2331 = -33;
        }
        ++field2330;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field2329 = arg1.method3018(566990904);
                }
            } else {
                this.field2331 = arg1.method3018(arg2 ^ -566984816);
            }
        } else {
            this.field2333 = arg1.method3018(566990904);
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(B)V", line = 59)
    public static void method1081(byte arg0) {
        if (arg0 < 0) {
            method1081((byte) 93);
        }
        field2328 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[[I", line = 72)
    public final int[][] method61(int arg0, int arg1) {
        ++field2324;
        if (arg0 > -116) {
            method1082(-1, 29, -2, 0, (byte) 74, -100, -106, 8, -125, -36);
        }
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528) {
            int[][] var4 = this.method3157((byte) 67, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class174.field2597 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field2333 * var12 >> 12;
                    var9[var11] = this.field2331 * var13 >> 12;
                    var10[var11] = this.field2329 * var14 >> 12;
                } else {
                    var8[var11] = this.field2333;
                    var9[var11] = this.field2331;
                    var10[var11] = this.field2329;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIBIIIII)V", line = 142)
    public static final void method1082(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -24 / ((-51 - arg4) / 61);
        ++field2325;
        if (~arg9 <= ~class465.field6763 && ~class176.field2630 <= ~arg9 && arg1 >= class465.field6763 && ~class176.field2630 <= ~arg1 && ~class465.field6763 >= ~arg7 && ~arg7 >= ~class176.field2630 && class465.field6763 <= arg6 && arg6 <= class176.field2630 && ~class424.field5996 >= ~arg8 && ~arg8 >= ~class333.field4936 && ~class424.field5996 >= ~arg5 && class333.field4936 >= arg5 && class424.field5996 <= arg3 && class333.field4936 >= arg3 && ~class424.field5996 >= ~arg2 && arg2 <= class333.field4936) {
            class231.method1542(arg5, arg3, false, arg8, arg6, arg9, arg1, arg7, arg2, arg0);
        } else {
            class3.method8(arg9, arg0, arg1, arg2, arg7, -27192, arg3, arg8, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)I", line = 161)
    public static final int method1083(int arg0, int arg1, int arg2) {
        ++field2326;
        if (arg0 != -19392) {
            method1081((byte) -68);
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = 1 & arg2 | var3 << 1;
            --arg1;
            arg2 >>>= 1;
        }
        return var3;
    }
}
