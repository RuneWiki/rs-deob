import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class63 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lok;")
    private static class41 field926 = class137.method956("wave:", 45);

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lok;")
    public static class41 field924 = field926;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lok;")
    public static class41 field923 = field926;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Lak;")
    public static class20 field927 = new class20(64);

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "J")
    public static long field931 = 0L;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lok;")
    public static class41 field930 = class137.method956("rect_debug=", 45);

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lmh;")
    public static class65 field929;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 25)
    public static final void method439(boolean arg0) {
        field925++;
        if (class120.field1762 == -1 || class306.field5134 == -1) {
            return;
        }
        int var1 = class222.field3552 + ((class305.field5110 - class222.field3552) * class175.field2845 >> 16);
        class175.field2845 += var1;
        float[] var2 = new float[3];
        if (class175.field2845 >= 65535) {
            class175.field2845 = 65535;
            if (class239.field3820) {
                class67.field1014 = false;
            } else {
                class67.field1014 = true;
            }
            class239.field3820 = true;
        } else {
            class239.field3820 = false;
            class67.field1014 = false;
        }
        float var3 = (float) class175.field2845 / 65535.0F;
        int var4 = class140.field2148 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class142.field2176[class120.field1762][var4][var5] * 3;
            int var7 = class142.field2176[class120.field1762][var4 + 1][var5] * 3;
            int var8 = (class142.field2176[class120.field1762][var4 + 2][var5] + class142.field2176[class120.field1762][var4 + 2][var5] - class142.field2176[class120.field1762][var4 + 3][var5]) * 3;
            int var9 = class142.field2176[class120.field1762][var4][var5];
            int var10 = var8 + var6 - (var7 * 2);
            int var11 = var7 - var6;
            int var12 = var7 + class142.field2176[class120.field1762][var4 + 2][var5] - var9 - var8;
            var2[var5] = (((float) var12 * var3 + (float) var10) * var3 + (float) var11) * var3 + (float) var9;
        }
        class251.field3990 = (int) var2[2] - (class55.field809 * 128);
        class235.field3779 = (int) var2[0] - class88.field1300 * 128;
        class13.field159 = (int) var2[1] * -1;
        float[] var13 = new float[3];
        int var14 = class274.field4484 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class142.field2176[class306.field5134][var14 + 1][var15] * 3;
            int var17 = class142.field2176[class306.field5134][var14][var15] * 3;
            int var18 = (class142.field2176[class306.field5134][var14 + 2][var15] + class142.field2176[class306.field5134][var14 + 2][var15] - class142.field2176[class306.field5134][var14 + 3][var15]) * 3;
            int var19 = class142.field2176[class306.field5134][var14][var15];
            int var20 = class142.field2176[class306.field5134][var14 + 2][var15] - var18 - (var19 - var16);
            int var21 = var16 - var17;
            int var22 = var17 + var18 - (var16 * 2);
            var13[var15] = (((float) var20 * var3 + (float) var22) * var3 + (float) var21) * var3 + (float) var19;
        }
        float var23 = var13[0] - var2[0];
        float var24 = (var13[1] - var2[1]) * -1.0F;
        if (!arg0) {
            return;
        }
        float var25 = var13[2] - var2[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class175.field2847 = (float) Math.atan2((double) var24, var26);
        class77.field1144 = -((float) Math.atan2((double) var23, (double) var25));
        class304.field5072 = (int) ((double) class77.field1144 * 325.949D) & 0x7FF;
        class57.field823 = (int) ((double) class175.field2847 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 144)
    public static void method440(int arg0) {
        field927 = null;
        field924 = null;
        field923 = null;
        field930 = null;
        if (arg0 != -2) {
            field928 = -90;
        }
        field926 = null;
        field929 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V", line = 164)
    public static final void method441(int arg0, int arg1) {
        class308 var2 = class205.field3312[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class308 var4 = class205.field3312[var3][arg0][arg1] = class205.field3312[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field5192--;
                for (int var5 = 0; var5 < var4.field5193; var5++) {
                    class232 var6 = var4.field5201[var5];
                    if ((var6.field3672 >> 29 & 0x3L) == 2L && var6.field3668 == arg0 && var6.field3665 == arg1) {
                        var6.field3667--;
                    }
                }
            }
        }
        if (class205.field3312[0][arg0][arg1] == null) {
            class205.field3312[0][arg0][arg1] = new class308(0, arg0, arg1);
        }
        class205.field3312[0][arg0][arg1].field5205 = var2;
        class205.field3312[3][arg0][arg1] = null;
    }
}
