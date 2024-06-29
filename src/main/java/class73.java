import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class73 {

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[I")
    public static int[] field1275 = new int[32];

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Z")
    public static boolean field1277;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lli;")
    public static class185 field1276;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "J")
    public long field1278;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lua;")
    public class73 field1269;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lua;")
    public class73 field1273;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "[Ldd;")
    public static class211[] field1279;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)I")
    public static final int method472(int arg0, int arg1, byte arg2) {
        class18 var3 = (class18) class152.field2871.method195(118, (long) arg0);
        field1274++;
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = -49 / (-arg2 / 51);
            int var5 = 0;
            for (int var6 = 0; var6 < var3.field285.length; var6++) {
                if (var3.field286[var6] == arg1) {
                    var5 += var3.field285[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lhi;ZILhi;I)Llf;")
    public static final class105 method473(class250 arg0, boolean arg1, int arg2, class250 arg3, int arg4) {
        field1267++;
        int[] var5 = arg0.method1698(false, arg4);
        boolean var6 = true;
        int var7 = 0;
        if (arg2 != 65280) {
            field1279 = null;
        }
        while (var5.length > var7) {
            byte[] var8 = arg0.method1695(arg4, var5[var7], 0);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg3.method1695(0, var9, 0);
                } else {
                    var10 = arg3.method1695(var9, 0, 0);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
            var7++;
        }
        if (!var6) {
            return null;
        }
        try {
            return new class105(arg0, arg3, arg4, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)V")
    public static final void method474(int arg0, byte arg1) {
        field1270++;
        class184.field3387.method85((byte) 75, arg0);
        if (arg1 < 0) {
            class204.field3726.method85((byte) 75, arg0);
            class256.field4528.method85((byte) 75, arg0);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method475(boolean arg0) {
        field1279 = null;
        field1276 = null;
        field1275 = null;
        if (!arg0) {
            method478(-96, 60, -112, -79, 61, -124, -105, -120, 86, 32);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public final void method476(int arg0) {
        field1268++;
        int var2 = 12 % ((16 - arg0) / 62);
        if (this.field1273 != null) {
            this.field1273.field1269 = this.field1269;
            this.field1269.field1273 = this.field1273;
            this.field1273 = null;
            this.field1269 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)Z")
    public final boolean method477(boolean arg0) {
        if (arg0) {
            field1279 = null;
        }
        field1271++;
        return this.field1273 != null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg5 && arg1 == arg9 && arg3 == arg4 && arg2 == arg6) {
            class166.method1185(arg1, arg3, -24025, arg7, arg0, arg2);
        } else {
            int var10 = arg0;
            int var11 = arg1;
            int var12 = arg0 * 3;
            int var13 = arg1 * 3;
            int var14 = arg5 * 3;
            int var15 = arg9 * 3;
            int var16 = arg6 * 3;
            int var17 = arg4 * 3;
            int var18 = var15 + arg2 - arg1 - var16;
            int var19 = arg3 + var14 - arg0 - var17;
            int var20 = var14 - var12;
            int var21 = var16 + var13 - var15 - var15;
            int var22 = var15 - var13;
            int var23 = var17 + var12 - var14 - var14;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var21 * var26;
                int var31 = var22 * var24;
                int var32 = var23 * var26;
                int var33 = var20 * var24;
                int var34 = (var29 + var33 + var32 >> 12) + arg0;
                int var35 = arg1 + (var28 + var30 + var31 >> 12);
                class166.method1185(var11, var34, -24025, arg7, var10, var35);
                var10 = var34;
                var11 = var35;
            }
        }
        int var25 = -5 % ((-arg8 - 57) / 54);
        field1272++;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1275[var1] = var0 - 1;
            var0 += var0;
        }
        field1277 = true;
        field1276 = class245.method1649("Ladevorgang )2 bitte warten Sie)3", -86);
    }
}
