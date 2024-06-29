import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class136 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Ldi;")
    public static class83 field1954 = new class83(33, 8);

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Ldi;")
    public static class83 field1955 = new class83(39, 15);

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Ldi;")
    public static class83 field1956 = new class83(38, 12);

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lwj;")
    public static class270 field1957 = new class270(72, 3);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lmg;")
    public static class101 field1958;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static final void method920(byte arg0) {
        field1953++;
        if (arg0 != -1) {
            method922(109);
        }
        class61.field763 = true;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method921(int arg0) {
        field1952++;
        if (class40.field506 != null) {
            return;
        }
        class40.field506 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
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
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var10 = var8;
                    var9 = var17;
                    var11 = var16;
                } else if (var14 == 2) {
                    var10 = var8;
                    var11 = var18;
                    var9 = var16;
                } else if (var14 == 3) {
                    var11 = var8;
                    var10 = var17;
                    var9 = var16;
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
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class40.field506[var3++] = var25;
            }
        }
        if (arg0 > -28) {
            method920((byte) -41);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static void method922(int arg0) {
        field1957 = null;
        field1954 = null;
        field1958 = null;
        field1956 = null;
        field1955 = null;
        if (arg0 != 10115) {
            field1954 = null;
        }
    }
}
