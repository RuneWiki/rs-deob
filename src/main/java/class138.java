import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class138 {

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "[I")
    private int[] field2582;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "[I")
    private int[] field2588;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Lga;")
    private class166 field2578;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Lga;")
    private class166 field2576;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "[Lga;")
    private class166[] field2579;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Z")
    public static boolean field2573 = false;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "S")
    public static short field2574 = 205;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Z")
    public static boolean field2575 = false;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lhj;")
    private static class69 field2580 = class181.method1318("Loading )2 please wait)3", (byte) -109);

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "[I")
    public static int[] field2577 = new int[100];

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Lhj;")
    public static class69 field2589 = field2580;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "Lcc;")
    public static class201 field2586;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "[I")
    public static int[] field2585;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IDZZLse;Lnc;ZI)[I")
    public final int[] method1063(int arg0, double arg1, boolean arg2, boolean arg3, class198 arg4, class83 arg5, boolean arg6, int arg7) {
        class20.method116(!arg3, arg1);
        field2587++;
        class130.field2422 = arg5;
        class162.field2999 = arg4;
        class182.method1327(arg7, arg0, (byte) 89);
        for (int var10 = 0; var10 < this.field2579.length; var10++) {
            this.field2579[var10].method1228(arg0, arg7, -256);
        }
        int[] var11 = new int[arg0 * arg7];
        byte var12;
        int var13;
        int var14;
        if (arg6) {
            var12 = -1;
            var13 = -1;
            var14 = arg7 - 1;
        } else {
            var13 = arg7;
            var14 = 0;
            var12 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2578.field3074) {
                int[] var18 = this.field2578.method20(var16, 8388607);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field2578.method134(0, var16);
                var19 = var22[0];
                var21 = var22[2];
                var20 = var22[1];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class251.field4546[var24];
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class251.field4546[var25];
                int var29 = class251.field4546[var26];
                var11[var15++] = (var28 << 16) + (var27 << 8) + var29;
                if (arg2) {
                    var15 += arg7 - 1;
                }
            }
        }
        if (arg3) {
            this.field2579 = null;
        }
        for (int var17 = 0; var17 < this.field2579.length; var17++) {
            this.field2579[var17].method1225(-1);
        }
        return var11;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLfh;)Lga;")
    private static final class166 method1064(boolean arg0, class128 arg1) {
        field2581++;
        arg1.method937(false);
        int var2 = arg1.method937(false);
        class166 var3 = class115.method849(var2, (byte) -128);
        var3.field3070 = arg1.method937(arg0);
        int var4 = arg1.method937(false);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method937(false);
            var3.method18((byte) 96, arg1, var6);
        }
        var3.method16(122);
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method1065(int arg0) {
        field2585 = null;
        field2577 = null;
        if (arg0 != -256) {
            method1064(true, (class128) null);
        }
        field2586 = null;
        field2580 = null;
        field2589 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLse;Lnc;)Z")
    public final boolean method1066(byte arg0, class198 arg1, class83 arg2) {
        field2584++;
        for (int var4 = 0; var4 < this.field2588.length; var4++) {
            if (!arg2.method612(this.field2588[var4], -97)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field2582.length; var5++) {
            if (!arg1.method771(this.field2582[var5], 58)) {
                return false;
            }
        }
        if (arg0 < 33) {
            method1065(-50);
        }
        return true;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class138() {
        this.field2582 = new int[0];
        this.field2588 = new int[0];
        this.field2578 = new class262();
        this.field2578.field3070 = 1;
        this.field2576 = new class262();
        this.field2579 = new class166[] { this.field2578, this.field2576 };
        this.field2576.field3070 = 1;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lfh;)V")
    public class138(class128 arg0) {
        int var2 = arg0.method937(false);
        this.field2579 = new class166[var2];
        int[][] var3 = new int[var2][];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class166 var16 = method1064(false, arg0);
            if (var16.method1227(false) >= 0) {
                var4++;
            }
            if (var16.method1222((byte) 43) >= 0) {
                var5++;
            }
            int var17 = var16.field3057.length;
            var3[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var3[var6][var18] = arg0.method937(false);
            }
            this.field2579[var6] = var16;
        }
        this.field2588 = new int[var4];
        int var7 = 0;
        this.field2582 = new int[var5];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class166 var11 = this.field2579[var9];
            int var12 = var11.field3057.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3057[var13] = this.field2579[var3[var9][var13]];
            }
            int var14 = var11.method1227(false);
            int var15 = var11.method1222((byte) 43);
            if (var14 > 0) {
                this.field2588[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2582[var8++] = var15;
            }
            var3[var9] = null;
        }
        this.field2578 = this.field2579[arg0.method937(false)];
        Object var10 = null;
        this.field2576 = this.field2579[arg0.method937(false)];
    }
}
