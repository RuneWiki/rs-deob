import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class186 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Z")
    public static boolean field2746 = false;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lhi;")
    public static class45 field2749 = new class45(54, 6);

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lrb;")
    public static class283 field2751 = new class283(97, 11);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1247(boolean arg0) {
        field2747++;
        if (class142.field2115 == -1 || class358.field5167 == -1) {
            return;
        }
        if (arg0) {
            field2746 = true;
        }
        int var1 = ((class408.field5774 - class502.field7348) * class80.field1129 >> 16) + class502.field7348;
        class80.field1129 += var1;
        if (class80.field1129 < 65535) {
            class375.field5394 = false;
            class74.field1045 = false;
        } else {
            if (class74.field1045) {
                class375.field5394 = false;
            } else {
                class375.field5394 = true;
            }
            class80.field1129 = 65535;
            class74.field1045 = true;
        }
        float var2 = (float) class80.field1129 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class3.field36 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class32.field494[class142.field2115][var4][var5] * 3;
            int var22 = class32.field494[class142.field2115][var4 + 1][var5] * 3;
            int var23 = (class32.field494[class142.field2115][var4 + 2][var5] + class32.field494[class142.field2115][var4 + 2][var5] - class32.field494[class142.field2115][var4 + 3][var5]) * 3;
            int var24 = class32.field494[class142.field2115][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class32.field494[class142.field2115][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class118.field1848 = (int) var3[0] - class110.field1775 * 128;
        class108.field1747 = (int) var3[2] - (class399.field5727 * 128);
        class159.field2421 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class312.field4238 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class32.field494[class358.field5167][var7][var8] * 3;
            int var15 = class32.field494[class358.field5167][var7 + 1][var8] * 3;
            int var16 = (class32.field494[class358.field5167][var7 + 2][var8] + class32.field494[class358.field5167][var7 + 2][var8] - class32.field494[class358.field5167][var7 + 3][var8]) * 3;
            int var17 = class32.field494[class358.field5167][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class32.field494[class358.field5167][var7 + 2][var8] - var17 - (-var15 - -var16);
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class153.field2357 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class49.field706 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class455.field6641 = class32.field494[class142.field2115][var4][3] + ((class32.field494[class142.field2115][var4 + 2][3] - class32.field494[class142.field2115][var4][3]) * class80.field1129 >> 16);
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V", line = 108)
    public static void method1248(int arg0) {
        if (arg0 != -23390) {
            field2751 = null;
        }
        field2749 = null;
        field2751 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIII)V", line = 123)
    public static final void method1249(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2750++;
        class375.field5387 = arg4;
        class23.field320 = arg1;
        class519.field7633 = arg2;
        if (!arg0) {
            field2751 = null;
        }
        class233.field3241 = arg3;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Z")
    public abstract boolean method169(int arg0);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLza;)Lql;")
    public abstract class121 method171(byte arg0, class295 arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Llb;IZIBILza;)V")
    public abstract void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBILza;)Z")
    public abstract boolean method158(int arg0, byte arg1, int arg2, class295 arg3);

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
    public abstract void method168(int arg0);

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(Lza;I)V")
    public abstract void method166(class295 arg0, int arg1);
}
