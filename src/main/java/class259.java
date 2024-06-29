import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class259 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "F")
    private static float field4231 = -1.0F;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    private static int field4232 = -1;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "F")
    private static float field4237 = -1.0F;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    private static int field4238 = -1;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field4239 = 16777215;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "[F")
    public static float[] field4233 = new float[4];

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "[F")
    private static float[] field4234 = new float[4];

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    private static int field4240 = -1;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field4243 = 13156520;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "[F")
    public static float[] field4242 = new float[4];

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "F")
    private static float field4235;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "()V", line = 8)
    public static final void method1813() {
        GL var0 = class241.field4012;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field4240 = -1;
        field4232 = -1;
        method1823();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(FFF)V", line = 24)
    public static final void method1814(float arg0, float arg1, float arg2) {
        if (field4233[0] == arg0 && field4233[1] == arg1 && field4233[2] == arg2) {
            return;
        }
        field4233[0] = arg0;
        field4233[1] = arg1;
        field4233[2] = arg2;
        field4234[0] = -arg0;
        field4234[1] = -arg1;
        field4234[2] = -arg2;
        field4236 = (int) (arg0 * 256.0F / arg1);
        field4241 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIZ)V", line = 41)
    public static final void method1815(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field4232 == arg0 && field4238 == arg1) {
            return;
        }
        field4232 = arg0;
        field4238 = arg1;
        GL var3 = class241.field4012;
        byte var4 = 50;
        short var5 = 3584;
        field4242[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field4242[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field4242[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field4242, 0);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "()F", line = 68)
    public static final float method1816() {
        return field4235;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "()I", line = 72)
    public static final int method1817() {
        return field4240;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([F)V", line = 78)
    public static final void method1818(float[] arg0) {
        if (arg0 == null) {
            arg0 = field4242;
        }
        GL var1 = class241.field4012;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "()V", line = 86)
    public static void method1819() {
        field4233 = null;
        field4234 = null;
        field4242 = null;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "()F", line = 94)
    public static final float method1820() {
        return field4237;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IFFF)V", line = 97)
    public static final void method1821(int arg0, float arg1, float arg2, float arg3) {
        if (field4240 == arg0 && field4235 == arg1 && field4237 == arg2 && field4231 == arg3) {
            return;
        }
        field4240 = arg0;
        field4235 = arg1;
        field4237 = arg2;
        field4231 = arg3;
        GL var4 = class241.field4012;
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

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "()V", line = 130)
    public static final void method1822() {
        GL var0 = class241.field4012;
        var0.glLightfv(16384, 4611, field4233, 0);
        var0.glLightfv(16385, 4611, field4234, 0);
    }

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "()V", line = 143)
    private static final void method1823() {
        method1821(field4239, 1.1523438F, 0.69921875F, 1.2F);
        method1814(-50.0F, -60.0F, -50.0F);
        method1815(field4243, 0, false);
    }
}
