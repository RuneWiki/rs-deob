import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class345 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Llo;")
    public static class451 field4893 = new class451();

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!fe", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4892++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILida;[I)Lqs;")
    public static final class741 method2109(int arg0, int arg1, class678 arg2, int[] arg3) {
        field4894++;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        if (arg0 != -3) {
            return null;
        }
        float[][] var7 = null;
        if (arg2.field9578 != null) {
            int var8 = arg2.field9593;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; var15++) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            var5 = new int[var8];
            var6 = new int[var8];
            var4 = new int[var8];
            for (int var16 = 0; var16 < arg1; var16++) {
                int var23 = arg3[var16];
                if (arg2.field9578[var23] != -1) {
                    int var24 = arg2.field9578[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg2.field9582[var23];
                        } else if (var25 == 1) {
                            var26 = arg2.field9586[var23];
                        } else {
                            var26 = arg2.field9557[var23];
                        }
                        int var27 = arg2.field9561[var26];
                        int var28 = arg2.field9580[var26];
                        int var29 = arg2.field9584[var26];
                        if (var9[var24] > var27) {
                            var9[var24] = var27;
                        }
                        if (var27 > var10[var24]) {
                            var10[var24] = var27;
                        }
                        if (var28 < var11[var24]) {
                            var11[var24] = var28;
                        }
                        if (var28 > var12[var24]) {
                            var12[var24] = var28;
                        }
                        if (var29 < var13[var24]) {
                            var13[var24] = var29;
                        }
                        if (var29 > var14[var24]) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            var7 = new float[var8][];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg2.field9554[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg2.field9568[var17];
                        if (var19 == 0) {
                            var20 = 1.0F;
                            var21 = 1.0F;
                        } else if (var19 > 0) {
                            var21 = 1.0F;
                            var20 = (float) var19 / 1024.0F;
                        } else {
                            var20 = 1.0F;
                            var21 = (float) (-var19) / 1024.0F;
                        }
                        var22 = 64.0F / (float) arg2.field9589[var17];
                    } else if (var18 == 2) {
                        var21 = 64.0F / (float) arg2.field9568[var17];
                        var22 = 64.0F / (float) arg2.field9589[var17];
                        var20 = 64.0F / (float) arg2.field9558[var17];
                    } else {
                        var22 = (float) arg2.field9589[var17] / 1024.0F;
                        var21 = (float) arg2.field9568[var17] / 1024.0F;
                        var20 = (float) arg2.field9558[var17] / 1024.0F;
                    }
                    var7[var17] = class138.method1130(arg0 + 8, var20, arg2.field9543[var17], arg2.field9546[var17], arg2.field9552[var17], var21, class194.method1380(255, arg2.field9547[var17]), var22);
                }
            }
        }
        return new class741(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)I")
    public final int method2110(int arg0, int arg1, int arg2) {
        field4895++;
        int var4 = arg0 >= class448.field6174 ? arg0 : class448.field6174;
        if (class653.field9247 == this) {
            return 0;
        } else if (class206.field3013 == this) {
            return var4 - arg1;
        } else if (arg2 == -29133) {
            return class494.field6785 == this ? (var4 - arg1) / 2 : 0;
        } else {
            return 17;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method2111(int arg0) {
        if (arg0 != 20695) {
            method2109(96, -48, null, null);
        }
        field4893 = null;
    }
}
