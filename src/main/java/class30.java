import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class30 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static volatile int field501 = 0;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[Lmr;")
    public static class84[] field506 = new class84[4];

    @OriginalMember(owner = "client!he", name = "e", descriptor = "J")
    public static long field504 = 0L;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "[I")
    public static int[] field508 = new int[14];

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lbi;")
    public static class139 field500;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lbd;")
    public static class304 field502;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "[Lmp;")
    public static class21[] field511;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V")
    public static final void method342(boolean arg0, int arg1) {
        field505++;
        byte[][] var2;
        if (arg0) {
            var2 = class360.field4894;
        } else {
            var2 = class192.field2760;
        }
        int var3 = class329.field4474.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class101.field1500[var4] >> 8) * 64 - class283.field3794;
                int var7 = (class101.field1500[var4] & 0xFF) * 64 - class296.field3988;
                class127.method996(117);
                class179.method1324((byte) 124, var5, arg0, var6, var7, class235.field3247, class249.field3415);
            }
        }
        if (arg1 != -17956) {
            method345(true);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method343(byte arg0) {
        field506 = null;
        field508 = null;
        if (arg0 != -16) {
            method345(true);
        }
        field502 = null;
        field500 = null;
        field511 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z")
    public static final boolean method344(int arg0) {
        field507++;
        if (arg0 != -710) {
            field508 = null;
        }
        return class434.field6179;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public static final void method345(boolean arg0) {
        field509++;
        if (class417.field5848 != null) {
            return;
        }
        class417.field5848 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
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
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var9 = var8;
                    var11 = var16;
                } else if (var14 == 1) {
                    var11 = var16;
                    var9 = var17;
                    var10 = var8;
                } else if (var14 == 2) {
                    var9 = var16;
                    var10 = var8;
                    var11 = var18;
                } else if (var14 == 3) {
                    var11 = var8;
                    var10 = var17;
                    var9 = var16;
                } else if (var14 == 4) {
                    var10 = var16;
                    var9 = var18;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class417.field5848[var3++] = var25;
            }
        }
        if (!arg0) {
            field506 = null;
        }
    }
}
