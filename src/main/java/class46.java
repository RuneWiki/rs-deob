import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class46 {

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "[I")
    private int[] field746;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "[I")
    private int[] field742;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Lmg;")
    private class264 field738;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lmg;")
    private class264 field745;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[Lmg;")
    private class264[] field740;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Z")
    public static boolean field739 = true;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lcf;")
    public static class93 field744 = class147.method1066("0", -48);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lil;")
    public static class162 field737 = new class162();

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field747 = 0;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field748 = 0;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Lcf;")
    private static class93 field750 = class147.method1066(" is already on your friend list)3", -48);

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lcf;")
    public static class93 field749 = field750;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field752 = 0;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
    public static void method257(boolean arg0) {
        field737 = null;
        field749 = null;
        field744 = null;
        if (arg0) {
            field737 = null;
        }
        field750 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lt;Lhg;B)Z")
    public final boolean method258(class197 arg0, class177 arg1, byte arg2) {
        field741++;
        if (class52.field853 > 0) {
            for (int var4 = 0; var4 < this.field742.length; var4++) {
                if (!arg1.method1287(this.field742[var4], class52.field853, (byte) -65)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field742.length; var5++) {
                if (!arg1.method1280(this.field742[var5], (byte) -48)) {
                    return false;
                }
            }
        }
        if (arg2 != 117) {
            return true;
        }
        for (int var6 = 0; var6 < this.field746.length; var6++) {
            if (!arg0.method1417((byte) 33, this.field746[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lt;ZLhg;DIIZZ)[I")
    public final int[] method259(class197 arg0, boolean arg1, class177 arg2, double arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field743++;
        class203.method1447(arg3, (byte) 97);
        class6.field77 = arg2;
        class125.field2220 = arg0;
        class121.method902(arg4, (byte) -119, arg5);
        int[] var10 = new int[arg4 * arg5];
        for (int var11 = 0; var11 < this.field740.length; var11++) {
            this.field740[var11].method1771(arg4, -118, arg5);
        }
        if (!arg1) {
            this.method258((class197) null, (class177) null, (byte) 93);
        }
        int var12;
        int var13;
        byte var14;
        if (arg7) {
            var13 = arg4 - 1;
            var14 = -1;
            var12 = -1;
        } else {
            var12 = arg4;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field738.field4698) {
                int[] var18 = this.field738.method22(var16, (byte) -92);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field738.method17(var16, false);
                var20 = var22[0];
                var19 = var22[2];
                var21 = var22[1];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var20[var23] >> 4;
                int var25 = var21[var23] >> 4;
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class168.field2960[var26];
                if (var24 > 255) {
                    var24 = 255;
                }
                int var28 = class168.field2960[var25];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var29 = class168.field2960[var24];
                var10[var15++] = (var29 << 16) + var27 + (var28 << 8);
                if (arg6) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field740.length; var17++) {
            this.field740[var17].method67((byte) 106);
        }
        return var10;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class46() {
        this.field746 = new int[0];
        this.field742 = new int[0];
        this.field738 = new class68();
        this.field738.field4707 = 1;
        this.field745 = new class68();
        this.field740 = new class264[] { this.field738, this.field745 };
        this.field745.field4707 = 1;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lee;)V")
    public class46(class280 arg0) {
        int var2 = arg0.method1907(16832);
        this.field740 = new class264[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class264 var16 = class204.method1450(-9170, arg0);
            if (var16.method1769(112) >= 0) {
                var3++;
            }
            if (var16.method72(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field4709.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1907(16832);
            }
            this.field740[var6] = var16;
        }
        this.field746 = new int[var4];
        int var7 = 0;
        this.field742 = new int[var3];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class264 var11 = this.field740[var9];
            int var12 = var11.field4709.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4709[var13] = this.field740[var5[var9][var13]];
            }
            int var14 = var11.method1769(-101);
            int var15 = var11.method72(-1);
            if (var14 > 0) {
                this.field742[var8++] = var14;
            }
            if (var15 > 0) {
                this.field746[var7++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field738 = this.field740[arg0.method1907(16832)];
        this.field745 = this.field740[arg0.method1907(16832)];
    }
}
