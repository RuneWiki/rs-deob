import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public abstract class class283 {

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "Lkw;")
    public class346 field3958;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "Llc;")
    public static class435 field3952 = new class435(11, -2);

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "[I")
    public static int[] field3957 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "D")
    public static double field3954;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "Lnca;")
    public static class627 field3959;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZII)V")
    public abstract void method79(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)V")
    public abstract void method74(byte arg0);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1812(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field3953++;
            return arg0 == 7 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)Z")
    public abstract boolean method77(int arg0);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZI)V")
    public abstract void method73(boolean arg0, int arg1);

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(IZ)V")
    public abstract void method76(int arg0, boolean arg1);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILfu;[IZ)Lje;")
    public static final class363 method1813(int arg0, class637 arg1, int[] arg2, boolean arg3) {
        field3955++;
        int[] var4 = null;
        int[] var5 = null;
        if (arg3) {
            return null;
        }
        int[] var6 = null;
        float[][] var7 = null;
        if (arg1.field9025 != null) {
            int var8 = arg1.field9000;
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
            var7 = new float[var8][];
            var5 = new int[var8];
            for (int var16 = 0; var16 < arg0; var16++) {
                int var23 = arg2[var16];
                if (arg1.field9025[var23] != -1) {
                    int var24 = arg1.field9025[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg1.field9015[var23];
                        } else if (var25 == 1) {
                            var26 = arg1.field9016[var23];
                        } else {
                            var26 = arg1.field9022[var23];
                        }
                        int var27 = arg1.field8985[var26];
                        int var28 = arg1.field8995[var26];
                        int var29 = arg1.field8994[var26];
                        if (var9[var24] > var27) {
                            var9[var24] = var27;
                        }
                        if (var10[var24] < var27) {
                            var10[var24] = var27;
                        }
                        if (var11[var24] > var28) {
                            var11[var24] = var28;
                        }
                        if (var28 > var12[var24]) {
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
            var6 = new int[var8];
            var4 = new int[var8];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg1.field9027[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var19;
                    float var20;
                    float var21;
                    if (var18 == 1) {
                        int var22 = arg1.field9014[var17];
                        if (var22 == 0) {
                            var20 = 1.0F;
                            var19 = 1.0F;
                        } else if (var22 > 0) {
                            var19 = (float) var22 / 1024.0F;
                            var20 = 1.0F;
                        } else {
                            var20 = (float) (-var22) / 1024.0F;
                            var19 = 1.0F;
                        }
                        var21 = 64.0F / (float) arg1.field8997[var17];
                    } else if (var18 == 2) {
                        var19 = 64.0F / (float) arg1.field9029[var17];
                        var20 = 64.0F / (float) arg1.field9014[var17];
                        var21 = 64.0F / (float) arg1.field8997[var17];
                    } else {
                        var20 = (float) arg1.field9014[var17] / 1024.0F;
                        var19 = (float) arg1.field9029[var17] / 1024.0F;
                        var21 = (float) arg1.field8997[var17] / 1024.0F;
                    }
                    var7[var17] = class140.method985((byte) -123, arg1.field9030[var17], arg1.field9012[var17], arg1.field8983[var17], class368.method2314(255, arg1.field8988[var17]), var21, var20, var19);
                }
            }
        }
        return new class363(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lou;II)V")
    public abstract void method75(class158 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lla;I)V")
    public static final void method1814(class423 arg0, int arg1) {
        class505.field7348 = arg0.method2602((byte) -118, "p11_full");
        if (arg1 != -14805) {
            method1812(-97, false);
        }
        field3956++;
        class555.field8066 = arg0.method2602((byte) -120, "p12_full");
        class265.field3791 = arg0.method2602((byte) -119, "b12_full");
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)V")
    public static void method1815(int arg0) {
        if (arg0 != 2) {
            field3952 = null;
        }
        field3957 = null;
        field3952 = null;
        field3959 = null;
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lkw;)V")
    public class283(class346 arg0) {
        this.field3958 = arg0;
    }
}
