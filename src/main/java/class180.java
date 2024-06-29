import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class180 {

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public int field3246 = -1;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lid;")
    public static class149 field3241 = class60.method382("floorshadows", (byte) 21);

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Z")
    public static boolean field3252 = false;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3250 = 0;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[I")
    public static int[] field3254 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lid;")
    private static class149 field3245 = class60.method382("Allocating memory", (byte) 60);

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3242 = 0;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lid;")
    public static class149 field3244 = field3245;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field3255 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field3243;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public int field3247;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public int field3249;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field3251;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method1254(int arg0) {
        field3240++;
        if (class151.field2751 == -1 || class10.field148 == -1) {
            return;
        }
        int var1 = class171.field3149 + ((class264.field4694 - class171.field3149) * class205.field3665 >> 16);
        class205.field3665 += var1;
        if (class205.field3665 >= 65535) {
            if (class201.field3647) {
                class52.field938 = false;
            } else {
                class52.field938 = true;
            }
            class205.field3665 = 65535;
            class201.field3647 = true;
        } else {
            class201.field3647 = false;
            class52.field938 = false;
        }
        float var2 = (float) class205.field3665 / 65535.0F;
        int var3 = class217.field3841 * 2;
        float[] var4 = new float[3];
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class136.field2481[class151.field2751][var3][var5] * 3;
            int var22 = class136.field2481[class151.field2751][var3 + 1][var5] * 3;
            int var23 = (-class136.field2481[class151.field2751][var3 + 3][var5] - (-class136.field2481[class151.field2751][var3 + 2][var5] - class136.field2481[class151.field2751][var3 + 2][var5])) * 3;
            int var24 = var22 - var21;
            int var25 = var21 + var23 - (var22 * 2);
            int var26 = class136.field2481[class151.field2751][var3][var5];
            int var27 = class136.field2481[class151.field2751][var3 + 2][var5] + var22 - var23 - var26;
            var4[var5] = (((float) var27 * var2 + (float) var25) * var2 + (float) var24) * var2 + (float) var26;
        }
        class269.field4853 = (int) var4[0] - class125.field2199 * 128;
        class10.field140 = (int) var4[1] * -1;
        class2.field29 = (int) var4[2] - (class115.field1969 * 128);
        float[] var6 = new float[3];
        int var7 = class248.field4356 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class136.field2481[class10.field148][var7][var8] * 3;
            int var15 = class136.field2481[class10.field148][var7 + 1][var8] * 3;
            int var16 = (class136.field2481[class10.field148][var7 + 2][var8] + class136.field2481[class10.field148][var7 + 2][var8] - class136.field2481[class10.field148][var7 + 3][var8]) * 3;
            int var17 = class136.field2481[class10.field148][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 - (var15 * 2 - var16);
            int var20 = var15 + class136.field2481[class10.field148][var7 - -2][var8] - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var4[0];
        float var10 = (var6[arg0] - var4[1]) * -1.0F;
        float var11 = var6[2] - var4[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class243.field4273 = (float) Math.atan2((double) var10, var12);
        class150.field2731 = -((float) Math.atan2((double) var9, (double) var11));
        class186.field3354 = (int) ((double) class243.field4273 * 325.949D) & 0x7FF;
        class147.field2646 = (int) ((double) class150.field2731 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method1255(boolean arg0) {
        field3245 = null;
        field3244 = null;
        field3241 = null;
        field3254 = null;
        if (arg0) {
            field3242 = -105;
        }
    }
}
