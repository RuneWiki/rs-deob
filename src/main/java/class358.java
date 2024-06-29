import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class358 {

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public int field4766 = -1;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Z")
    public static boolean field4759 = false;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lwv;")
    public static class423 field4762 = null;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Ltt;")
    public static class338 field4764 = new class338(69, 8);

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "[I")
    public static int[] field4767 = new int[200];

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Leba;")
    public static class550 field4768 = new class550(99, 7);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lbm;")
    public class295 field4765;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "[I")
    public int[] field4761;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field4763;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2102(int arg0) {
        field4758++;
        if (class310.field4189 != null) {
            return;
        }
        class310.field4189 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = arg0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var11 = var16;
                    var10 = var18;
                } else if (var14 == 1) {
                    var10 = var8;
                    var9 = var17;
                    var11 = var16;
                } else if (var14 == 2) {
                    var10 = var8;
                    var11 = var18;
                    var9 = var16;
                } else if (var14 == 3) {
                    var9 = var16;
                    var11 = var8;
                    var10 = var17;
                } else if (var14 == 4) {
                    var10 = var16;
                    var11 = var8;
                    var9 = var18;
                } else if (var14 == 5) {
                    var10 = var16;
                    var9 = var8;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = var24 + (var22 << 16) + (var23 << 8) - 16777216;
                class310.field4189[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljca;ILjca;)V", line = 124)
    public static final void method2103(class45 arg0, int arg1, class45 arg2) {
        if (arg0.field547 != null) {
            arg0.method242(true);
        }
        field4760++;
        arg0.field548 = arg2;
        arg0.field547 = arg2.field547;
        arg0.field547.field548 = arg0;
        if (arg1 != 13600) {
            field4764 = null;
        }
        arg0.field548.field547 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 160)
    public static void method2104(byte arg0) {
        field4764 = null;
        field4767 = null;
        field4768 = null;
        if (arg0 != -77) {
            field4768 = null;
        }
        field4762 = null;
    }
}
