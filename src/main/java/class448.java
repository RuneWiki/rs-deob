import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class448 extends class214 {

    @OriginalMember(owner = "client!te", name = "L", descriptor = "Lib;")
    public static class148 field6174 = new class148();

    @OriginalMember(owner = "client!te", name = "O", descriptor = "Lfn;")
    public static class52 field6177 = new class52(19, 12);

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "[I")
    public static int[] field6179 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "Lmt;")
    public static class182 field6178;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 6)
    public class448() {
        super(1, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Llk;II)V", line = 9)
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg1 <= -114) {
            if (arg2 == 0) {
                super.field3032 = arg0.method2503(true) == 1;
            }
            ++field6176;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)[I", line = 23)
    public final int[] method14(byte arg0, int arg1) {
        ++field6172;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            int[] var4 = this.method1352(arg1, 0, -42);
            for (int var5 = 0; ~class399.field5585 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        if (arg0 != 123) {
            method2603((byte) 3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)[[I", line = 59)
    public final int[][] method11(int arg0, byte arg1) {
        ++field6175;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (arg1 != 92) {
            return null;
        } else {
            if (super.field3030.field6644) {
                int[][] var4 = this.method1354(0, arg0, (byte) 23);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class399.field5585 > var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = 4096 - var7[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIIIZFII)[[I", line = 107)
    public static final int[][] method2602(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float arg6, int arg7, int arg8) {
        ++field6173;
        int[][] var9 = new int[arg3][arg2];
        class153 var10 = new class153();
        var10.field2189 = arg7;
        var10.field2193 = (int) (arg6 * 4096.0F);
        var10.field2185 = arg4;
        var10.field2190 = arg5;
        var10.field2199 = arg1;
        var10.method12(27108);
        class382.method2291(arg3, -121, arg2);
        for (int var11 = 0; var11 < arg3; ++var11) {
            var10.method924(104, var11, var9[var11]);
        }
        return arg0 < 25 ? null : var9;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V", line = 138)
    public static void method2603(byte arg0) {
        field6174 = null;
        field6179 = null;
        field6178 = null;
        int var1 = -67 / ((59 - arg0) / 54);
        field6177 = null;
    }
}
