import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class431 {

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public int field6245;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "[I")
    public int[] field6243;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "[I")
    public int[] field6240;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "F")
    public static float field6241;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method2558(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 == -1) {
            field6246++;
            if (class76.field1075.field3651 != 0 && arg4 != 0 && class40.field602 < 50 && arg3 != -1) {
                class320.field4411[class40.field602++] = new class441((byte) 1, arg3, arg4, arg1, arg0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 21)
    public static final void method2559(int arg0) {
        field6244++;
        if (arg0 != 1) {
            field6241 = -0.58648676F;
        }
        if (class188.field2769 != null) {
            return;
        }
        class188.field2769 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
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
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var11 = var16;
                    var10 = var8;
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
                    var9 = var18;
                    var10 = var16;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var10 = var16;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class188.field2769[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIB)V", line = 143)
    public static final void method2560(int arg0, int arg1, byte arg2) {
        field6242++;
        if (arg2 >= -52) {
            field6241 = 0.13806848F;
        }
        class314 var3 = class177.method1213(false, 15, 0);
        var3.method1808(-7412);
        var3.field4253 = arg0;
        var3.field4259 = arg1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([FII)[F", line = 160)
    public static final float[] method2561(float[] arg0, int arg1, int arg2) {
        field6247++;
        if (arg2 != -21311) {
            field6241 = 0.45540282F;
        }
        float[] var3 = new float[arg1];
        class57.method374(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(I)V", line = 182)
    public class431(int arg0) {
        this.field6245 = arg0;
        this.field6243 = new int[this.field6245];
        this.field6240 = new int[this.field6245];
    }
}
