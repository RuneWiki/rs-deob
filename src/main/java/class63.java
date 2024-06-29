import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class63 extends class139 {

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "Lrf;")
    private static class163 field1332 = class53.method392(-76, "Loaded interfaces");

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lrf;")
    public static class163 field1334 = field1332;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "Lrf;")
    public static class163 field1335 = class53.method392(-56, "null");

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "[Lab;")
    private class3[] field1336;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILu;ZLu;)Lj;")
    public static final class86 method454(int arg0, int arg1, class184 arg2, boolean arg3, class184 arg4) {
        boolean var5 = true;
        ++field1327;
        int[] var6 = arg2.method1230(-30, arg0);
        for (int var7 = arg1; ~var7 > ~var6.length; ++var7) {
            byte[] var8 = arg2.method1243(var6[var7], ~arg1, arg0);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 255 | 65280 & var8[0] << 8;
                byte[] var10;
                if (!arg3) {
                    var10 = arg4.method1243(0, -1, var9);
                } else {
                    var10 = arg4.method1243(var9, -1, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        } else {
            try {
                return new class86(arg2, arg4, arg0, arg3);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([[IB)V")
    private final void method455(int[][] arg0, byte arg1) {
        ++field1338;
        int var3 = class23.field402;
        if (arg1 == -119) {
            int var4 = class205.field4008;
            class6.method57(arg0, false);
            class108.method732(0, 0, class29.field542, class15.field260, 0);
            if (this.field1336 != null) {
                for (int var5 = 0; ~this.field1336.length < ~var5; ++var5) {
                    class3 var6 = this.field1336[var5];
                    int var7 = var6.field27;
                    int var8 = var6.field28;
                    if (~var7 <= -1) {
                        if (var8 >= 0) {
                            var6.method28(var3, true, var4);
                        } else {
                            var6.method29(var4, var3, (byte) -57);
                        }
                    } else if (~var8 <= -1) {
                        var6.method31(var4, -14422, var3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class63() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field1331;
        if (arg0 <= 53) {
            method456(-83);
        }
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885) {
            int var4 = class23.field402;
            int var5 = class205.field4008;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field2866.method261(0);
            this.method455(var6, (byte) -119);
            for (int var8 = 0; class205.field4008 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class23.field402 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class133.method887(var15 << 4, 4080);
                    var12[var14] = class133.method887(65280, var15) >> 4;
                    var11[var14] = class133.method887(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
    public static void method456(int arg0) {
        field1332 = null;
        if (arg0 == -20403) {
            field1335 = null;
            field1334 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg1 != 7451) {
            return null;
        } else {
            ++field1330;
            int[] var3 = super.field2859.method1319(-119, arg0);
            if (super.field2859.field3966) {
                this.method455(super.field2859.method1317(arg1 ^ -7544), (byte) -119);
            }
            return var3;
        }
    }
}
