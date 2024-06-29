import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class class271 extends class449 {

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    public static int field3943 = 0;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public static int field3944 = 0;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "Lrc;")
    public static class108 field3942 = new class108(36, -2);

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "Lmb;")
    public static class262 field3945 = new class262();

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
    public static final void method1828(byte arg0) {
        field3941++;
        if (class21.field227 != null) {
            return;
        }
        class21.field227 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = -69 % ((59 - arg0) / 56);
        int var4 = 0;
        for (int var5 = 0; var5 < 512; var5++) {
            float var6 = ((float) (var5 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var7 = (float) (var5 & 0x7) / 8.0F + 0.0625F;
            for (int var8 = 0; var8 < 128; var8++) {
                float var9 = (float) var8 / 128.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = 0.0F;
                float var13 = var6 / 60.0F;
                int var14 = (int) var13;
                int var15 = var14 % 6;
                float var16 = (float) (-var14) + var13;
                float var17 = (1.0F - var7) * var9;
                float var18 = (1.0F - (var7 * var16)) * var9;
                float var19 = (1.0F - ((1.0F - var16) * var7)) * var9;
                if (var15 == 0) {
                    var11 = var19;
                    var10 = var9;
                    var12 = var17;
                } else if (var15 == 1) {
                    var11 = var9;
                    var10 = var18;
                    var12 = var17;
                } else if (var15 == 2) {
                    var11 = var9;
                    var10 = var17;
                    var12 = var19;
                } else if (var15 == 3) {
                    var11 = var18;
                    var10 = var17;
                    var12 = var9;
                } else if (var15 == 4) {
                    var12 = var9;
                    var11 = var17;
                    var10 = var19;
                } else if (var15 == 5) {
                    var11 = var17;
                    var12 = var18;
                    var10 = var9;
                }
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                float var22 = (float) Math.pow((double) var12, var1);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (int) (var22 * 256.0F);
                int var26 = (var24 << 8) + var25 + (var23 << 16) - 16777216;
                class21.field227[var4++] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V")
    public static void method1829(byte arg0) {
        if (arg0 != -60) {
            field3944 = -16;
        }
        field3945 = null;
        field3942 = null;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(B)J")
    public abstract long method939(byte arg0);

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)I")
    public abstract int method936(int arg0);

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "(I)I")
    public abstract int method937(int arg0);

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)I")
    public abstract int method938(int arg0);
}
