import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class700 extends class621 {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field9841;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([IZLlv;I)Lpl;")
    public static final class650 method3954(int[] arg0, boolean arg1, class446 arg2, int arg3) {
        if (!arg1) {
            return null;
        }
        field9841++;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        float[][] var7 = null;
        if (arg2.field6235 != null) {
            int var8 = arg2.field6201;
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
            for (int var16 = 0; var16 < arg3; var16++) {
                int var23 = arg0[var16];
                if (arg2.field6235[var23] != -1) {
                    int var24 = arg2.field6235[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg2.field6198[var23];
                        } else if (var25 == 1) {
                            var26 = arg2.field6221[var23];
                        } else {
                            var26 = arg2.field6196[var23];
                        }
                        int var27 = arg2.field6229[var26];
                        int var28 = arg2.field6206[var26];
                        int var29 = arg2.field6233[var26];
                        if (var9[var24] > var27) {
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
                        if (var29 > var14[var24]) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            var7 = new float[var8][];
            var4 = new int[var8];
            var5 = new int[var8];
            var6 = new int[var8];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg2.field6190[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg2.field6193[var17];
                        var20 = 64.0F / (float) arg2.field6211[var17];
                        if (var19 == 0) {
                            var21 = 1.0F;
                            var22 = 1.0F;
                        } else if (var19 > 0) {
                            var21 = (float) var19 / 1024.0F;
                            var22 = 1.0F;
                        } else {
                            var22 = (float) (-var19) / 1024.0F;
                            var21 = 1.0F;
                        }
                    } else if (var18 == 2) {
                        var20 = 64.0F / (float) arg2.field6211[var17];
                        var22 = 64.0F / (float) arg2.field6193[var17];
                        var21 = 64.0F / (float) arg2.field6194[var17];
                    } else {
                        var20 = (float) arg2.field6211[var17] / 1024.0F;
                        var22 = (float) arg2.field6193[var17] / 1024.0F;
                        var21 = (float) arg2.field6194[var17] / 1024.0F;
                    }
                    var7[var17] = class153.method929((byte) 123, class321.method1919(arg2.field6240[var17], 255), var22, var20, arg2.field6187[var17], arg2.field6237[var17], var21, arg2.field6210[var17]);
                }
            }
        }
        return new class650(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z[Lsba;IZII)V")
    public static final void method3955(boolean arg0, class218[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class218 var7 = arg1[var6];
            if (var7 != null && var7.field2693 == arg5) {
                class531.method2939(arg4, arg2, 1375731712, var7, arg0);
                class42.method254(arg2, arg4, var7, 119);
                if (var7.field2706 > var7.field2756 - var7.field2781) {
                    var7.field2706 = var7.field2756 - var7.field2781;
                }
                if (var7.field2687 - var7.field2718 < var7.field2671) {
                    var7.field2671 = var7.field2687 - var7.field2718;
                }
                if (var7.field2706 < 0) {
                    var7.field2706 = 0;
                }
                if (var7.field2671 < 0) {
                    var7.field2671 = 0;
                }
                if (var7.field2832 == 0) {
                    class676.method3845(var7, arg0, (byte) 61);
                }
            }
        }
        field9842++;
    }
}
