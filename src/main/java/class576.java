import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class576 {

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public static int field8171 = 0;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "[I")
    public static int[] field8172 = new int[1000];

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "Lfja;")
    public static class783 field8173 = new class783(6, 1);

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "Lkh;")
    public static class17 field8175 = null;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lhk;Z)V")
    public static final void method3322(class111 arg0, boolean arg1) {
        if (class791.field10837 == null) {
            class53 var2 = new class53();
            byte[] var3 = var2.method390(128, 128, 16, true);
            class791.field10837 = class513.method2938(var3, false, -101);
        }
        field8170++;
        if (class594.field8343 == null) {
            class22 var4 = new class22();
            byte[] var5 = var4.method151(128, 128, 16, 5066);
            class594.field8343 = class513.method2938(var5, false, -100);
        }
        class417 var6 = arg0.field1937;
        if (var6.method2456(arg1) && class249.field3509 == null) {
            byte[] var7 = class343.method2130(128, 0.6F, 0.5F, new class141(419684), 0, 16, 4.0F, 8, 4.0F, 16.0F, 128);
            class249.field3509 = class513.method2938(var7, false, -123);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)I")
    public static final int method3323(int arg0, int arg1) {
        return class240.field3420 == null ? 0 : class240.field3420[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
    public static final void method3324(int arg0) {
        field8174++;
        if (class624.field8692 != null) {
            return;
        }
        class624.field8692 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        if (arg0 >= -52) {
            method3323(94, 101);
        }
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
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var9 = var8;
                    var11 = var16;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var11 = var18;
                    var9 = var16;
                    var10 = var8;
                } else if (var14 == 3) {
                    var9 = var16;
                    var10 = var17;
                    var11 = var8;
                } else if (var14 == 4) {
                    var10 = var16;
                    var9 = var18;
                    var11 = var8;
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
                int var25 = (var22 << 16) + var24 + (var23 << 8) - 16777216;
                class624.field8692[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)V")
    public static void method3325(byte arg0) {
        if (arg0 != -79) {
            field8175 = null;
        }
        field8175 = null;
        field8173 = null;
        field8172 = null;
    }
}
