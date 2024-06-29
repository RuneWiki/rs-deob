import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class261 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "[F")
    public static float[] field3876 = new float[4];

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    private static int field3878 = -1;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    private static int field3879 = -1;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    private static int field3883 = -1;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "[F")
    private static float[] field3880 = new float[4];

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "F")
    private static float field3884 = -1.0F;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field3886 = 13156520;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "[F")
    public static float[] field3885 = new float[4];

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "F")
    private static float field3888 = -1.0F;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field3887 = 16777215;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "F")
    private static float field3877;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZ)V", line = 6)
    public static final void method1809(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field3878 == arg0 && field3883 == arg1) {
            return;
        }
        field3878 = arg0;
        field3883 = arg1;
        GL var3 = class162.field2654;
        byte var4 = 50;
        short var5 = 3584;
        field3885[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field3885[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field3885[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field3885, 0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "()V", line = 33)
    public static void method1810() {
        field3876 = null;
        field3880 = null;
        field3885 = null;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "()V", line = 39)
    public static final void method1811() {
        GL var0 = class162.field2654;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field3879 = -1;
        field3878 = -1;
        method1819();
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "()F", line = 59)
    public static final float method1812() {
        return field3877;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(FFF)V", line = 69)
    public static final void method1813(float arg0, float arg1, float arg2) {
        if (field3876[0] == arg0 && field3876[1] == arg1 && field3876[2] == arg2) {
            return;
        }
        field3876[0] = arg0;
        field3876[1] = arg1;
        field3876[2] = arg2;
        field3880[0] = -arg0;
        field3880[1] = -arg1;
        field3880[2] = -arg2;
        field3881 = (int) (arg0 * 256.0F / arg1);
        field3882 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "()V", line = 84)
    public static final void method1814() {
        GL var0 = class162.field2654;
        var0.glLightfv(16384, 4611, field3876, 0);
        var0.glLightfv(16385, 4611, field3880, 0);
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "()F", line = 89)
    public static final float method1815() {
        return field3884;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IFFF)V", line = 100)
    public static final void method1816(int arg0, float arg1, float arg2, float arg3) {
        if (field3879 == arg0 && field3877 == arg1 && field3884 == arg2 && field3888 == arg3) {
            return;
        }
        field3879 = arg0;
        field3877 = arg1;
        field3884 = arg2;
        field3888 = arg3;
        GL var4 = class162.field2654;
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

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([F)V", line = 133)
    public static final void method1817(float[] arg0) {
        if (arg0 == null) {
            arg0 = field3885;
        }
        GL var1 = class162.field2654;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "()I", line = 146)
    public static final int method1818() {
        return field3879;
    }

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "()V", line = 152)
    private static final void method1819() {
        method1816(field3887, 1.1523438F, 0.69921875F, 1.2F);
        method1813(-50.0F, -60.0F, -50.0F);
        method1809(field3886, 0, false);
    }
}
