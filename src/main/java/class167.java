import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class167 {

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[F")
    public static float[] field2659 = new float[4];

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[F")
    private static float[] field2660 = new float[4];

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2657 = 13156520;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2661 = 16777215;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    private static int field2656 = -1;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[F")
    public static float[] field2664 = new float[4];

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "F")
    private static float field2665 = -1.0F;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    private static int field2666 = -1;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "F")
    private static float field2655 = -1.0F;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    private static int field2667 = -1;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "F")
    private static float field2662;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V", line = 6)
    public static final void method1295() {
        GL var0 = class42.field627;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field2656 = -1;
        field2666 = -1;
        method1302();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([F)V", line = 22)
    public static final void method1296(float[] arg0) {
        if (arg0 == null) {
            arg0 = field2664;
        }
        GL var1 = class42.field627;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(FFF)V", line = 31)
    public static final void method1297(float arg0, float arg1, float arg2) {
        if (field2659[0] == arg0 && field2659[1] == arg1 && field2659[2] == arg2) {
            return;
        }
        field2659[0] = arg0;
        field2659[1] = arg1;
        field2659[2] = arg2;
        field2660[0] = -arg0;
        field2660[1] = -arg1;
        field2660[2] = -arg2;
        field2663 = (int) (arg0 * 256.0F / arg1);
        field2658 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()F", line = 45)
    public static final float method1298() {
        return field2665;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZ)V", line = 56)
    public static final void method1299(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field2666 == arg0 && field2667 == arg1) {
            return;
        }
        field2666 = arg0;
        field2667 = arg1;
        GL var3 = class42.field627;
        byte var4 = 50;
        short var5 = 3584;
        field2664[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field2664[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field2664[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field2664, 0);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "()I", line = 92)
    public static final int method1300() {
        return field2656;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "()V", line = 96)
    public static void method1301() {
        field2659 = null;
        field2660 = null;
        field2664 = null;
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "()V", line = 109)
    private static final void method1302() {
        method1305(field2661, 1.1523438F, 0.69921875F, 1.2F);
        method1297(-50.0F, -60.0F, -50.0F);
        method1299(field2657, 0, false);
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "()F", line = 124)
    public static final float method1303() {
        return field2662;
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "()V", line = 132)
    public static final void method1304() {
        GL var0 = class42.field627;
        var0.glLightfv(16384, 4611, field2659, 0);
        var0.glLightfv(16385, 4611, field2660, 0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IFFF)V", line = 147)
    public static final void method1305(int arg0, float arg1, float arg2, float arg3) {
        if (field2656 == arg0 && field2662 == arg1 && field2665 == arg2 && field2655 == arg3) {
            return;
        }
        field2656 = arg0;
        field2662 = arg1;
        field2665 = arg2;
        field2655 = arg3;
        GL var4 = class42.field627;
        float var5 = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        float var6 = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        float var7 = (float) (arg0 & 0xFF) / 255.0F;
        float[] var8 = new float[] { arg1 * var5, arg1 * var6, arg1 * var7, 1.0F };
        var4.glLightModelfv(2899, var8, 0);
        float[] var9 = new float[] { arg2 * var5, arg2 * var6, arg2 * var7, 1.0F };
        var4.glLightfv(16384, 4609, var9, 0);
        float[] var10 = new float[] { -arg3 * var5, -arg3 * var6, -arg3 * var7, 1.0F };
        var4.glLightfv(16385, 4609, var10, 0);
    }
}
