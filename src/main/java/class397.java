import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class397 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "[B")
    public static byte[] field5909 = new byte[2048];

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lgca;")
    public static class206 field5910 = new class206();

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([ILb;II)Ldj;", line = 5)
    public static final class705 method2458(int[] arg0, class352 arg1, int arg2, int arg3) {
        field5908++;
        int[] var4 = null;
        int[] var5 = null;
        if (arg2 != 18767) {
            return null;
        }
        int[] var6 = null;
        float[][] var7 = null;
        if (arg1.field5195 != null) {
            int var8 = arg1.field5166;
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
            var4 = new int[var8];
            var7 = new float[var8][];
            var6 = new int[var8];
            for (int var16 = 0; var16 < arg3; var16++) {
                int var23 = arg0[var16];
                if (arg1.field5195[var23] != -1) {
                    int var24 = arg1.field5195[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg1.field5150[var23];
                        } else if (var25 == 1) {
                            var26 = arg1.field5177[var23];
                        } else {
                            var26 = arg1.field5183[var23];
                        }
                        int var27 = arg1.field5159[var26];
                        int var28 = arg1.field5175[var26];
                        int var29 = arg1.field5164[var26];
                        if (var27 < var9[var24]) {
                            var9[var24] = var27;
                        }
                        if (var10[var24] < var27) {
                            var10[var24] = var27;
                        }
                        if (var11[var24] > var28) {
                            var11[var24] = var28;
                        }
                        if (var12[var24] < var28) {
                            var12[var24] = var28;
                        }
                        if (var29 < var13[var24]) {
                            var13[var24] = var29;
                        }
                        if (var14[var24] < var29) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            var5 = new int[var8];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg1.field5162[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var19;
                    float var20;
                    float var21;
                    if (var18 == 1) {
                        int var22 = arg1.field5185[var17];
                        var20 = 64.0F / (float) arg1.field5190[var17];
                        if (var22 == 0) {
                            var21 = 1.0F;
                            var19 = 1.0F;
                        } else if (var22 > 0) {
                            var21 = 1.0F;
                            var19 = (float) var22 / 1024.0F;
                        } else {
                            var19 = 1.0F;
                            var21 = (float) (-var22) / 1024.0F;
                        }
                    } else if (var18 == 2) {
                        var19 = 64.0F / (float) arg1.field5172[var17];
                        var20 = 64.0F / (float) arg1.field5190[var17];
                        var21 = 64.0F / (float) arg1.field5185[var17];
                    } else {
                        var20 = (float) arg1.field5190[var17] / 1024.0F;
                        var19 = (float) arg1.field5172[var17] / 1024.0F;
                        var21 = (float) arg1.field5185[var17] / 1024.0F;
                    }
                    var7[var17] = class662.method3723(var19, var20, var21, arg1.field5156[var17], class636.method3603(arg1.field5165[var17], 255), arg1.field5152[var17], arg1.field5155[var17], (byte) 118);
                }
            }
        }
        return new class705(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V", line = 184)
    public static final void method2459(int arg0, int arg1) {
        int var2 = -22 % ((arg0 + 26) / 55);
        class695.field9855.method68(-16878, arg1);
        field5911++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V", line = 194)
    public static void method2460(boolean arg0) {
        field5909 = null;
        if (arg0) {
            method2460(false);
        }
        field5910 = null;
    }
}
