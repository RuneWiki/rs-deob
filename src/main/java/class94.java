import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class class94 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Z")
    public static boolean field1197 = false;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "S")
    public static short field1198 = 32767;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "J")
    public static long field1201;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Ltj;")
    public static class108 field1200;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lth;B)Lth;")
    public abstract class355 method552(class355 arg0, byte arg1);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static final void method553(byte arg0) {
        if (arg0 >= -126) {
            field1200 = null;
        }
        for (int var1 = 0; var1 < class349.field5084; var1++) {
            int var2 = class314.field4623[var1];
            class128 var3 = class243.field3596[var2];
            int var4 = class352.field5114.method837(true);
            if ((var4 & 0x20) != 0) {
                var4 += class352.field5114.method837(true) << 8;
            }
            class153.method1126(var4, (byte) -74, var2, var3);
        }
        field1196++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method554(int arg0) {
        field1199++;
        if (class106.field1365 != null) {
            return;
        }
        class106.field1365 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
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
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var10 = var8;
                    var9 = var16;
                    var11 = var18;
                } else if (var14 == 3) {
                    var10 = var17;
                    var9 = var16;
                    var11 = var8;
                } else if (var14 == 4) {
                    var9 = var18;
                    var11 = var8;
                    var10 = var16;
                } else if (var14 == 5) {
                    var11 = var17;
                    var10 = var16;
                    var9 = var8;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) - (-(var22 << 16) - var24) - 16777216;
                class106.field1365[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static void method555(int arg0) {
        if (arg0 >= -5) {
            method553((byte) -118);
        }
        field1200 = null;
    }

    static {
        new class349((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field1201 = -1L;
    }
}
