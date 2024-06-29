import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class27 extends class498 {

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "Ljo;")
    public static class351 field390 = new class351(28, 3);

    @OriginalMember(owner = "client!fba", name = "v", descriptor = "I")
    public static int field394 = 0;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!fba", name = "w", descriptor = "Lkj;")
    public static class590 field395;

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "Lcp;")
    public static class753 field393;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
    public static void method203(byte arg0) {
        field393 = null;
        field395 = null;
        field390 = null;
        if (arg0 >= -50) {
            field395 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V")
    public static final void method204(int arg0) {
        ++field392;
        if (class595.field8378 == null) {
            class595.field8378 = new int[65536];
            double var1 = 0.7D + -0.015D + 0.03D * Math.random();
            int var3 = arg0;
            for (int var4 = 0; ~var4 > -513; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (var4 & 7) / 8.0F + 0.0625F;
                for (int var7 = 0; ~var7 > -129; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = (float) (-var13) + var12;
                    float var16 = (-var6 + 1.0F) * var8;
                    float var17 = (-(var6 * var15) + 1.0F) * var8;
                    float var18 = (-((1.0F - var15) * var6) + 1.0F) * var8;
                    if (~var14 != -1) {
                        if (~var14 == -2) {
                            var11 = var16;
                            var10 = var8;
                            var9 = var17;
                        } else if (var14 != 2) {
                            if (~var14 != -4) {
                                if (var14 == 4) {
                                    var10 = var16;
                                    var9 = var18;
                                    var11 = var8;
                                } else if (~var14 == -6) {
                                    var9 = var8;
                                    var11 = var17;
                                    var10 = var16;
                                }
                            } else {
                                var10 = var17;
                                var11 = var8;
                                var9 = var16;
                            }
                        } else {
                            var9 = var16;
                            var11 = var18;
                            var10 = var8;
                        }
                    } else {
                        var9 = var8;
                        var10 = var18;
                        var11 = var16;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (var22 << 16) + (var23 << 8) + -16777216 + var24;
                    class595.field8378[var3++] = var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BII)V")
    public final void method157(byte arg0, int arg1, int arg2) {
        ++field389;
        int var4 = this.field391 * arg1 >> 12;
        int var5 = this.field386 * arg1 >> 12;
        int var6 = -36 % ((arg0 - 53) / 49);
        int var7 = this.field387 * arg2 >> 12;
        int var8 = this.field388 * arg2 >> 12;
        class395.method2407(var7, super.field7075, 0, var4, var5, super.field7074, super.field7081, var8);
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(III)V")
    public final void method159(int arg0, int arg1, int arg2) {
        ++field385;
        int var4 = this.field391 * arg0 >> 12;
        int var5 = this.field386 * arg0 >> 12;
        if (arg2 <= -37) {
            int var6 = this.field387 * arg1 >> 12;
            int var7 = this.field388 * arg1 >> 12;
            class467.method2758((byte) 11, super.field7074, var4, super.field7081, var5, var7, var6);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(III)V")
    public final void method160(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field393 = null;
        }
        ++field384;
        int var4 = this.field391 * arg2 >> 12;
        int var5 = this.field386 * arg2 >> 12;
        int var6 = this.field387 * arg1 >> 12;
        int var7 = this.field388 * arg1 >> 12;
        class561.method3261((byte) -18, super.field7075, var4, var7, var5, var6);
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(III)V")
    public static final void method205(int arg0, int arg1, int arg2) {
        ++field383;
        int var3 = -60 % ((31 - arg0) / 51);
        if (class536.field7555 == class23.field344) {
            if (!class553.method3214(1, arg2, 14, 0, false, -2, 0, 1, arg1)) {
                class553.method3214(1, arg2, 14, 0, false, -3, 0, 1, arg1);
            }
        } else if (!class553.method3214(1, arg2, 14, 0, false, -3, 0, 1, arg1)) {
            class553.method3214(1, arg2, 14, 0, false, -2, 0, 1, arg1);
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(IIIIIII)V")
    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field391 = arg0;
        this.field388 = arg3;
        this.field386 = arg2;
        this.field387 = arg1;
    }
}
