import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class97 extends class256 {

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1404;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Z")
    public static boolean field1408 = false;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Z")
    public static boolean field1411 = false;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field1409 = 0;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lju;")
    public static class102 field1407 = new class102(72, 18);

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Lmaa;")
    public static class505 field1413 = new class505();

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Ltp;")
    public static class295 field1412;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "[Lsp;")
    public static class471[] field1410;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public final void method657(int arg0) {
        field1406++;
        this.field1404.method2560();
        if (arg0 != 7875) {
            field1407 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
    public class97(int arg0) {
        this.field1404 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
    public static final void method658(int arg0) {
        if (arg0 != 1717352424) {
            method659(109);
        }
        field1405++;
        if (class278.field3718 != null) {
            return;
        }
        class278.field3718 = new int[65536];
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
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var9 = var8;
                    var10 = var18;
                } else if (var14 == 1) {
                    var9 = var17;
                    var11 = var16;
                    var10 = var8;
                } else if (var14 == 2) {
                    var10 = var8;
                    var9 = var16;
                    var11 = var18;
                } else if (var14 == 3) {
                    var11 = var8;
                    var10 = var17;
                    var9 = var16;
                } else if (var14 == 4) {
                    var9 = var18;
                    var11 = var8;
                    var10 = var16;
                } else if (var14 == 5) {
                    var9 = var8;
                    var10 = var16;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + var24 + (var23 << 8) - 16777216;
                class278.field3718[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V")
    public static void method659(int arg0) {
        if (arg0 > -71) {
            method659(2);
        }
        field1413 = null;
        field1410 = null;
        field1412 = null;
        field1407 = null;
    }
}
