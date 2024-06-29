import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class26 {

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    private static int field298 = -1;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "F")
    private static float field300 = -1.0F;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "[F")
    public static float[] field299 = new float[4];

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field303 = 13156520;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    private static int field302 = -1;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field304 = 16777215;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "[F")
    public static float[] field307 = new float[4];

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "[F")
    private static float[] field306 = new float[4];

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "F")
    private static float field309 = -1.0F;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    private static int field308 = -1;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "F")
    private static float field297;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()V", line = 10)
    public static final void method186() {
        GL var0 = class272.field4310;
        var0.glLightfv(16384, 4611, field307, 0);
        var0.glLightfv(16385, 4611, field306, 0);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IFFF)V", line = 15)
    public static final void method187(int arg0, float arg1, float arg2, float arg3) {
        if (field308 == arg0 && field297 == arg1 && field300 == arg2 && field309 == arg3) {
            return;
        }
        field308 = arg0;
        field297 = arg1;
        field300 = arg2;
        field309 = arg3;
        GL var4 = class272.field4310;
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

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()V", line = 43)
    public static void method188() {
        field307 = null;
        field306 = null;
        field299 = null;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "()V", line = 50)
    private static final void method189() {
        method187(field304, 1.1523438F, 0.69921875F, 1.2F);
        method190(-50.0F, -60.0F, -50.0F);
        method194(field303, 0, false);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(FFF)V", line = 75)
    public static final void method190(float arg0, float arg1, float arg2) {
        if (field307[0] == arg0 && field307[1] == arg1 && field307[2] == arg2) {
            return;
        }
        field307[0] = arg0;
        field307[1] = arg1;
        field307[2] = arg2;
        field306[0] = -arg0;
        field306[1] = -arg1;
        field306[2] = -arg2;
        field305 = (int) (arg0 * 256.0F / arg1);
        field301 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "()I", line = 88)
    public static final int method191() {
        return field308;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "()V", line = 93)
    public static final void method192() {
        GL var0 = class272.field4310;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field308 = -1;
        field302 = -1;
        method189();
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "()F", line = 109)
    public static final float method193() {
        return field300;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZ)V", line = 116)
    public static final void method194(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field302 == arg0 && field298 == arg1) {
            return;
        }
        field302 = arg0;
        field298 = arg1;
        GL var3 = class272.field4310;
        byte var4 = 50;
        short var5 = 3584;
        field299[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field299[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field299[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field299, 0);
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "()F", line = 148)
    public static final float method195() {
        return field297;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([F)V", line = 151)
    public static final void method196(float[] arg0) {
        if (arg0 == null) {
            arg0 = field299;
        }
        GL var1 = class272.field4310;
        var1.glFogfv(2918, arg0, 0);
    }
}
