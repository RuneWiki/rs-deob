import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class class366 extends class241 {

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "Lvfa;")
    public static class672 field5132 = null;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(III)Ldaa;")
    public static final class10 method2162(int arg0, int arg1, int arg2) {
        class701 var3 = class660.field8718[arg0][arg1][arg2];
        return var3 == null ? null : var3.field9742;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILur;I[I)Leh;")
    public static final class365 method2163(int arg0, class538 arg1, int arg2, int[] arg3) {
        field5131++;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        float[][] var7 = null;
        if (arg1.field7082 != null) {
            int var8 = arg1.field7095;
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
            for (int var16 = 0; var16 < arg0; var16++) {
                int var23 = arg3[var16];
                if (arg1.field7082[var23] != -1) {
                    int var24 = arg1.field7082[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg1.field7102[var23];
                        } else if (var25 == 1) {
                            var26 = arg1.field7080[var23];
                        } else {
                            var26 = arg1.field7129[var23];
                        }
                        int var27 = arg1.field7083[var26];
                        int var28 = arg1.field7125[var26];
                        int var29 = arg1.field7096[var26];
                        if (var9[var24] > var27) {
                            var9[var24] = var27;
                        }
                        if (var27 > var10[var24]) {
                            var10[var24] = var27;
                        }
                        if (var11[var24] > var28) {
                            var11[var24] = var28;
                        }
                        if (var28 > var12[var24]) {
                            var12[var24] = var28;
                        }
                        if (var13[var24] > var29) {
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
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg1.field7089[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var19;
                    float var20;
                    float var21;
                    if (var18 == 1) {
                        int var22 = arg1.field7114[var17];
                        var20 = 64.0F / (float) arg1.field7085[var17];
                        if (var22 == 0) {
                            var21 = 1.0F;
                            var19 = 1.0F;
                        } else if (var22 > 0) {
                            var21 = (float) var22 / 1024.0F;
                            var19 = 1.0F;
                        } else {
                            var21 = 1.0F;
                            var19 = (float) (-var22) / 1024.0F;
                        }
                    } else if (var18 == 2) {
                        var21 = 64.0F / (float) arg1.field7077[var17];
                        var20 = 64.0F / (float) arg1.field7085[var17];
                        var19 = 64.0F / (float) arg1.field7114[var17];
                    } else {
                        var19 = (float) arg1.field7114[var17] / 1024.0F;
                        var20 = (float) arg1.field7085[var17] / 1024.0F;
                        var21 = (float) arg1.field7077[var17] / 1024.0F;
                    }
                    var7[var17] = class535.method2970(arg1.field7103[var17], 125, arg1.field7105[var17], class48.method346(arg1.field7111[var17], 255), var19, var20, var21, arg1.field7126[var17]);
                }
            }
        }
        return arg2 == 0 ? new class365(var4, var5, var6, var7) : null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
    public static void method2164(int arg0) {
        if (arg0 != 0) {
            method2163(-96, null, 61, null);
        }
        field5132 = null;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)Lnp;")
    public abstract class493 method2165(byte arg0);
}
