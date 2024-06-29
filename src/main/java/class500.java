import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class500 extends class386 {

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    private int field6988 = 4096;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    private int field6986 = 4096;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    private int field6996 = 4096;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "[I")
    public static int[] field6987 = new int[1];

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "Lsb;")
    public static class264 field6994 = new class264("LIVE", 0);

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "F")
    public static float field6992;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "F")
    public static float field6995;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "[Ln;")
    public static class17[] field6991;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg1 < 111) {
            this.method645(-40, -66);
        }
        ++field6998;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field6988 = arg2.method2260(-81);
                }
            } else {
                this.field6996 = arg2.method2260(-88);
            }
        } else {
            this.field6986 = arg2.method2260(-126);
        }
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V")
    public static void method2908(int arg0) {
        field6994 = null;
        if (arg0 == 64) {
            field6987 = null;
            field6991 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class500() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2909(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6989;
        int var5 = -128 % ((arg0 - 16) / 48);
        if (~(2 & class73.field1104[0][arg1][arg4]) != -1) {
            return true;
        } else if ((class73.field1104[arg3][arg1][arg4] & 16) != 0) {
            return false;
        } else {
            return ~arg2 == ~class349.method1985(arg1, arg4, -1, arg3);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI[BI)[B")
    public static final byte[] method2910(byte arg0, int arg1, byte[] arg2, int arg3) {
        ++field6993;
        byte[] var4;
        if (~arg3 >= -1) {
            var4 = arg2;
        } else {
            var4 = new byte[arg1];
            for (int var5 = 0; ~arg1 < ~var5; ++var5) {
                var4[var5] = arg2[arg3 + var5];
            }
        }
        if (arg0 <= 115) {
            return null;
        } else {
            class326 var6 = new class326();
            var6.method1896((byte) 126);
            var6.method1901(-1, var4, (long) (arg1 * 8));
            byte[] var7 = new byte[64];
            var6.method1900(false, var7, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[[I")
    public final int[][] method645(int arg0, int arg1) {
        ++field6990;
        if (arg1 != 3) {
            field6997 = 43;
        }
        int[][] var3 = super.field5148.method1054(arg0, 16257);
        if (super.field5148.field2041) {
            int[][] var4 = this.method2211(arg0, 0, -120);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class599.field8643; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field6986 * var12 >> 12;
                    var9[var11] = this.field6996 * var13 >> 12;
                    var10[var11] = this.field6988 * var14 >> 12;
                } else {
                    var8[var11] = this.field6986;
                    var9[var11] = this.field6996;
                    var10[var11] = this.field6988;
                }
            }
        }
        return var3;
    }
}
