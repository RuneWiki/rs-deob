import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class264 {

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "Liv;")
    public class428 field4407 = null;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "Liv;")
    public class428 field4410 = null;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "[Lah;")
    public class187[] field4412 = null;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "Liv;")
    public class428 field4411 = null;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "[Lah;")
    public class187[] field4414 = null;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Z")
    public boolean field4409;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "Ljc;")
    public static class356 field4413 = new class356(1, -1);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "Z")
    public static boolean field4406;

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lih;)V", line = 184)
    public class264(class214 arg0) {
        this.field4409 = arg0.field3670;
        class364.method2320(arg0, (byte) -19);
        if (this.field4409) {
            byte[] var6 = class378.method2398(class446.field6661, false, -7350);
            this.field4410 = new class428(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class378.method2398(class261.field4362, false, -7350);
            this.field4407 = new class428(arg0, 6410, 128, 128, 16, var7, 6410);
            class252 var8 = arg0.field3597;
            if (var8.method1719(0)) {
                byte[] var9 = class378.method2398(class147.field2395, false, -7350);
                this.field4411 = new class428(arg0, 6408, 128, 128, 16);
                class428 var10 = new class428(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method1718(var10, this.field4411, 2.0F, (byte) -118)) {
                    this.field4411.method1205((byte) 89);
                } else {
                    this.field4411.method1209(114);
                    this.field4411 = null;
                }
                var10.method1209(95);
            }
        } else {
            this.field4414 = new class187[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class177.method1195(var2 * 16384 * 2, 32768, class446.field6661, 3);
                this.field4414[var2] = new class187(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field4412 = new class187[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class177.method1195(var3 * 128 * 256, 32768, class261.field4362, 3);
                this.field4412[var3] = new class187(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IFFIFIBI)[F", line = 16)
    public static final float[] method1758(int arg0, float arg1, float arg2, int arg3, float arg4, int arg5, byte arg6, int arg7) {
        field4405++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
        var8[2] = var11;
        var8[4] = 1.0F;
        var8[6] = -var11;
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        var8[1] = 0.0F;
        var8[5] = 0.0F;
        if (arg6 < 14) {
            return null;
        }
        var8[0] = var10;
        var8[8] = var10;
        float var12 = 1.0F - var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg0 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg3 * arg3 + arg7 * arg7));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg7) / var19;
                var16 = (float) arg3 / var19;
            }
            var13[6] = var14 * var16 * var18;
            var13[2] = var14 * var16 * var18;
            var13[3] = -var16 * var17;
            var13[0] = var14 * var14 * var18 + var15;
            var13[5] = var14 * var17;
            var13[8] = var16 * var16 * var18 + var15;
            var13[4] = var15;
            var13[1] = var16 * var17;
            var13[7] = -var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[2] *= arg1;
        var9[4] *= arg2;
        var9[7] *= arg4;
        var9[0] *= arg1;
        var9[8] *= arg4;
        var9[5] *= arg2;
        var9[1] *= arg1;
        var9[3] *= arg2;
        var9[6] *= arg4;
        return var9;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 99)
    public static void method1759(int arg0) {
        field4413 = null;
        if (arg0 != 2826) {
            method1763(17, null, true, -128, 84, -35);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILec;)Z", line = 119)
    public static final boolean method1760(int arg0, class68 arg1) {
        if (arg0 != 250) {
            return false;
        }
        field4417++;
        if (class304.field4867 == arg1.field1115) {
            class265.field4447 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZIIZ)I", line = 140)
    public static final int method1761(boolean arg0, int arg1, int arg2, boolean arg3) {
        field4408++;
        class112 var4 = class295.method1888(arg3, arg1, (byte) 116);
        if (!arg0) {
            method1763(-21, null, true, -118, 97, 12);
        }
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var4.field1973.length) {
            return var4.field1973[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lec;ZII)V", line = 159)
    public static final void method1762(class68 arg0, boolean arg1, int arg2, int arg3) {
        field4418++;
        if (class164.field2598 != null || class387.field5967 || arg0 == null || class10.method59((byte) -14, arg0) == null) {
            return;
        }
        class164.field2598 = arg0;
        class529.field7780 = class10.method59((byte) -14, arg0);
        class263.field4382 = 0;
        class54.field875 = false;
        class226.field3891 = arg2;
        if (!arg1) {
            field4413 = null;
        }
        class222.field3819 = arg3;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILqs;ZIII)V", line = 249)
    public static final void method1763(int arg0, class496 arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class375.field5837 = arg3;
        class257.field4335 = 10000;
        field4416 = arg4;
        class432.field6464 = arg0;
        class104.field1743 = arg5;
        class321.field5055 = arg2;
        class505.field7357 = arg1;
        field4415++;
    }
}
