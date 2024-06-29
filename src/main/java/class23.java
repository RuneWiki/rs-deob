import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class23 extends class59 {

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "Lsd;")
    public static class166 field391 = class135.method935("Schrifts-=tze geladen)3", 0);

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "Lsd;")
    private static class166 field393 = class135.method935("wishes to duel with you)3", 0);

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "[I")
    public static int[] field390 = new int[99];

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "Lsd;")
    public static class166 field389 = field393;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "[I")
    public static int[] field400;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "Lsd;")
    private static class166 field402;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "Lsd;")
    public static class166 field403;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "Lvd;")
    public static class193 field399;

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class23() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)I")
    public static final int method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(1 & arg5) == -2) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
        }
        ++field396;
        int var8 = arg4 & 3;
        if (arg6 <= 10) {
            field403 = null;
        }
        if (var8 == 0) {
            return arg1;
        } else if (~var8 == -2) {
            return arg3;
        } else {
            return var8 == 2 ? 7 - (arg1 - 1) + -arg0 : -arg2 - -1 + -arg3 + 7;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public static void method157(byte arg0) {
        field389 = null;
        field399 = null;
        if (arg0 != -62) {
            field401 = 77;
        }
        field391 = null;
        field403 = null;
        field402 = null;
        field390 = null;
        field400 = null;
        field393 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lf;Lsd;ILsd;Lf;)Lhb;")
    public static final class66 method158(class47 arg0, class166 arg1, int arg2, class166 arg3, class47 arg4) {
        ++field394;
        int var5 = arg4.method363(arg1, 0);
        int var6 = arg4.method362(var5, arg3, 89);
        if (arg2 > -8) {
            field400 = null;
        }
        return class30.method230(var5, var6, 100, arg4, arg0);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        ++field398;
        int[] var3 = super.field1219.method721(arg0, -125);
        if (arg1 > -124) {
            return null;
        } else {
            if (super.field1219.field1816) {
                int var4 = class136.field2657[arg0];
                for (int var5 = 0; ~var5 > ~class98.field1879; ++var5) {
                    var3[var5] = this.method160(false, class187.field3569[var5], var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(III)Z")
    public static final boolean method159(int arg0, int arg1, int arg2) {
        ++field395;
        if (arg1 != -32174) {
            method156(-123, 12, -58, 16, -117, -83, 1);
        }
        class145 var3 = class170.method1185((byte) 45, arg0);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && ~arg2 >= -9) {
            arg2 = 4;
        }
        return var3.method997(arg2, true);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZII)I")
    private final int method160(boolean arg0, int arg1, int arg2) {
        ++field397;
        int var4 = arg1 - -(arg2 * 57);
        if (arg0) {
            return 34;
        } else {
            int var5 = var4 << 1 ^ var4;
            return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 - -1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field390[var1] = var0 / 4;
        }
        field400 = new int[2000];
        field402 = class135.method935("Unexpected server response)3", 0);
        field403 = field402;
        field401 = 0;
    }
}
