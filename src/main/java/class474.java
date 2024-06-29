import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class474 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public int field7243;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public int field7246;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public int field7248;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public int field7249;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2885(int arg0, int arg1, int arg2) {
        int var3 = -37 / ((42 - arg0) / 59);
        field7247++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 15)
    public static final void method2886(int arg0) {
        field7245++;
        if (class150.field1929 != null) {
            return;
        }
        class150.field1929 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var6 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var7 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
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
                    var12 = var17;
                    var11 = var19;
                    var10 = var9;
                } else if (var15 == 1) {
                    var10 = var18;
                    var12 = var17;
                    var11 = var9;
                } else if (var15 == 2) {
                    var12 = var19;
                    var10 = var17;
                    var11 = var9;
                } else if (var15 == 3) {
                    var12 = var9;
                    var10 = var17;
                    var11 = var18;
                } else if (var15 == 4) {
                    var11 = var17;
                    var12 = var9;
                    var10 = var19;
                } else if (var15 == 5) {
                    var10 = var9;
                    var12 = var18;
                    var11 = var17;
                }
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                float var22 = (float) Math.pow((double) var12, var1);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (int) (var22 * 256.0F);
                int var26 = var25 + (var23 << 16) + (var24 << 8) - 16777216;
                class150.field1929[var3++] = var26;
            }
        }
        int var5 = 11 / ((77 - arg0) / 38);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ldda;Ldda;I)V", line = 144)
    public static final void method2887(class597 arg0, class597 arg1, int arg2) {
        class346.field5036 = arg0;
        class277.field4071 = arg1;
        if (arg2 == 21304) {
            field7244++;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBI)Z", line = 156)
    public static final boolean method2888(int arg0, byte arg1, int arg2) {
        int var3 = 6 % ((arg1 - 28) / 55);
        field7250++;
        return false;
    }
}
