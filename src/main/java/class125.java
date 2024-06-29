import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class125 extends class167 {

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "Lkh;")
    private static class117 field2339 = class224.method1450((byte) -73, "Loading textures )2 ");

    @OriginalMember(owner = "client!le", name = "V", descriptor = "Lkh;")
    public static class117 field2336 = field2339;

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "Lkh;")
    public static class117 field2343 = class224.method1450((byte) 115, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "[Z")
    public static boolean[] field2342 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)V")
    public static void method866(int arg0) {
        field2339 = null;
        field2343 = null;
        if (arg0 != 0) {
            field2335 = -124;
        }
        field2342 = null;
        field2336 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
    public static final void method867(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2341;
        int var5 = -arg3;
        int var6 = arg1;
        class114.method762(-arg3 + arg0, 95, arg0 - -arg3, arg4, class167.field3030[arg2]);
        int var7 = -1;
        int var8 = arg3;
        while (var8 > var6) {
            var7 += 2;
            ++var6;
            var5 += var7;
            if (var5 >= 0) {
                --var8;
                int[] var9 = class167.field3030[arg2 - -var8];
                var5 -= var8 << 1;
                int var10 = arg0 + var6;
                int var11 = -var6 + arg0;
                int[] var12 = class167.field3030[-var8 + arg2];
                class114.method762(var11, 120, var10, arg4, var9);
                class114.method762(var11, arg1 ^ 84, var10, arg4, var12);
            }
            int var13 = arg0 + var8;
            int var14 = -var8 + arg0;
            int[] var15 = class167.field3030[arg2 + var6];
            int[] var16 = class167.field3030[-var6 + arg2];
            class114.method762(var14, arg1 ^ 71, var13, arg4, var15);
            class114.method762(var14, arg1 ^ 114, var13, arg4, var16);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BZII)Lkh;")
    public static final class117 method868(byte arg0, boolean arg1, int arg2, int arg3) {
        ++field2334;
        if (arg3 >= 2 && ~arg3 >= -37) {
            int var4 = arg2 / arg3;
            int var5 = 1;
            while (~var4 != -1) {
                ++var5;
                var4 /= arg3;
            }
            int var6 = var5;
            if (~arg2 > -1 || arg1) {
                var6 = var5 + 1;
            }
            byte[] var7 = new byte[var6];
            if (arg2 < 0) {
                var7[0] = 45;
            } else if (arg1) {
                var7[0] = 43;
            }
            int var8 = 0;
            if (arg0 >= -52) {
                field2342 = null;
            }
            while (~var8 > ~var5) {
                int var10 = arg2 % arg3;
                arg2 /= arg3;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > 9) {
                    var10 += 39;
                }
                var7[-var8 + var6 + -1] = (byte) (var10 + 48);
                ++var8;
            }
            class117 var9 = new class117();
            var9.field2196 = var7;
            var9.field2213 = var6;
            return var9;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int[][] var4 = this.method1180(arg1, 26851, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            for (int var8 = 0; ~var8 > ~class115.field2146; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        if (arg0 != -96) {
            field2343 = null;
        }
        ++field2340;
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class125() {
        super(1, true);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIII)V")
    public static final void method869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 0) {
            field2336 = null;
        }
        ++field2338;
        if (~class240.field4355 >= ~(-arg2 + arg3) && arg2 + arg3 <= class146.field2678 && class159.field2910 <= -arg2 + arg4 && arg2 + arg4 <= class224.field4040) {
            class175.method1222(arg3, arg6, arg0, arg5, arg2, arg4, 0);
        } else {
            class10.method90(arg5, arg6, arg4, arg2, arg0, arg1 + -85, arg3);
        }
    }
}
