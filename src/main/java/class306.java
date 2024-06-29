import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class class306 extends class223 {

    @OriginalMember(owner = "client!os", name = "n", descriptor = "Lgk;")
    public static class331 field4341 = new class331(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field4343 = 0;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "Lbf;")
    public static class372 field4342 = new class372(0, 15);

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1901(boolean arg0) {
        field4339++;
        if (class509.field7505 == -1 || class408.field6072 == -1) {
            return;
        }
        int var1 = ((class241.field3570 - class496.field7279) * class75.field1026 >> 16) + class496.field7279;
        class75.field1026 += var1;
        if (class75.field1026 >= 65535) {
            class75.field1026 = 65535;
            if (class148.field2075) {
                class420.field6219 = false;
            } else {
                class420.field6219 = true;
            }
            class148.field2075 = true;
        } else {
            class148.field2075 = false;
            class420.field6219 = false;
        }
        float var2 = (float) class75.field1026 / 65535.0F;
        float[] var3 = new float[3];
        if (!arg0) {
            return;
        }
        int var4 = class486.field7140 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class408.field6081[class509.field7505][var4][var5] * 3;
            int var22 = class408.field6081[class509.field7505][var4 + 1][var5] * 3;
            int var23 = (class408.field6081[class509.field7505][var4 + 2][var5] + class408.field6081[class509.field7505][var4 + 2][var5] - class408.field6081[class509.field7505][var4 + 3][var5]) * 3;
            int var24 = class408.field6081[class509.field7505][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class408.field6081[class509.field7505][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class161.field2268 = (int) var3[0] - (class340.field4713 * 128);
        class487.field7162 = (int) var3[1] * -1;
        class486.field7138 = (int) var3[2] - (class476.field7013 * 128);
        float[] var6 = new float[3];
        int var7 = class429.field6320 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class408.field6081[class408.field6072][var7][var8] * 3;
            int var15 = class408.field6081[class408.field6072][var7 + 1][var8] * 3;
            int var16 = (class408.field6081[class408.field6072][var7 + 2][var8] + class408.field6081[class408.field6072][var7 - -2][var8] - class408.field6081[class408.field6072][var7 + 3][var8]) * 3;
            int var17 = class408.field6081[class408.field6072][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class408.field6081[class408.field6072][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class321.field4529 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class316.field4503 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class170.field2418 = class408.field6081[class509.field7505][var4][3] + ((class408.field6081[class509.field7505][var4 + 2][3] - class408.field6081[class509.field7505][var4][3]) * class75.field1026 >> 16);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 119)
    public static void method1902(int arg0) {
        field4341 = null;
        if (arg0 != 3) {
            field4342 = null;
        }
        field4342 = null;
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(B)I")
    public abstract int method231(byte arg0);

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(B)J")
    public abstract long method235(byte arg0);

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)I")
    public abstract int method233(int arg0);

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(B)I")
    public abstract int method236(byte arg0);
}
