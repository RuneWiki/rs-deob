import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class126 {

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
    private int[] field2272;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "[I")
    private int[] field2273;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lof;")
    private class222 field2268;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lof;")
    private class222 field2266;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[Lof;")
    private class222[] field2274;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lsb;")
    public static class98 field2265 = class47.method368(" )2> ", 0);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lsb;")
    private static class98 field2264 = class47.method368("Starting 3d library", 0);

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Lsb;")
    public static class98 field2275 = field2264;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lsb;")
    public static class98 field2276 = class47.method368("Untersuchen", 0);

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lc;IZZILtg;DI)[I")
    public final int[] method933(class57 arg0, int arg1, boolean arg2, boolean arg3, int arg4, class75 arg5, double arg6, int arg7) {
        class263.method1793(arg6, (byte) 101);
        class103.field1828 = arg0;
        field2270++;
        int[] var10 = new int[arg4 * arg7];
        class210.field3597 = arg5;
        class158.method1146(arg7, -125, arg4);
        for (int var11 = 0; var11 < this.field2274.length; var11++) {
            this.field2274[var11].method1535(true, arg4, arg7);
        }
        byte var12;
        int var13;
        int var14;
        if (arg2) {
            var12 = -1;
            var13 = -1;
            var14 = arg7 - 1;
        } else {
            var13 = arg7;
            var14 = 0;
            var12 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2268.field3842) {
                int[] var22 = this.field2268.method7((byte) 122, var16);
                var19 = var22;
                var21 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field2268.method4(var16, 1);
                var19 = var18[1];
                var20 = var18[2];
                var21 = var18[0];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var19[var23] >> 4;
                int var25 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class119.field2133[var24];
                int var27 = var20[var23] >> 4;
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class119.field2133[var25];
                int var29 = class119.field2133[var27];
                var10[var15++] = (var26 << 8) + ((var28 << 16) + var29);
                if (arg3) {
                    var15 += arg7 - 1;
                }
            }
        }
        if (arg1 == -33) {
            for (int var17 = 0; var17 < this.field2274.length; var17++) {
                this.field2274[var17].method1497(0);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Z")
    public static final boolean method934(byte arg0, int arg1) {
        field2269++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            int var2 = 102 / ((arg0 - 6) / 56);
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method935(int arg0) {
        field2275 = null;
        if (arg0 == -33) {
            field2264 = null;
            field2265 = null;
            field2276 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class126() {
        this.field2272 = new int[0];
        this.field2273 = new int[0];
        this.field2268 = new class135();
        this.field2268.field3828 = 1;
        this.field2266 = new class135();
        this.field2274 = new class222[] { this.field2268, this.field2266 };
        this.field2266.field3828 = 1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLc;Ltg;)Z")
    public final boolean method936(boolean arg0, class57 arg1, class75 arg2) {
        field2267++;
        for (int var4 = 0; var4 < this.field2273.length; var4++) {
            if (!arg2.method575(this.field2273[var4], 0)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field2272.length; var5++) {
            if (!arg1.method145(11301, this.field2272[var5])) {
                return false;
            }
        }
        if (arg0) {
            this.field2272 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Llj;)V")
    public class126(class216 arg0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = arg0.method1446(5350);
        int[][] var5 = new int[var4][];
        this.field2274 = new class222[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            class222 var16 = class18.method172(arg0, -10990);
            if (var16.method1495(-1) >= 0) {
                var2++;
            }
            if (var16.method1532((byte) 118) >= 0) {
                var3++;
            }
            int var17 = var16.field3818.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1446(5350);
            }
            this.field2274[var6] = var16;
        }
        this.field2272 = new int[var3];
        this.field2273 = new int[var2];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var4; var9++) {
            class222 var11 = this.field2274[var9];
            int var12 = var11.field3818.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3818[var13] = this.field2274[var5[var9][var13]];
            }
            int var14 = var11.method1495(-1);
            int var15 = var11.method1532((byte) 116);
            if (var14 > 0) {
                this.field2273[var8++] = var14;
            }
            if (var15 > 0) {
                this.field2272[var7++] = var15;
            }
            var5[var9] = null;
        }
        this.field2268 = this.field2274[arg0.method1446(5350)];
        this.field2266 = this.field2274[arg0.method1446(5350)];
        Object var10 = null;
    }
}
