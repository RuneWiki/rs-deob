import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class141 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    private static int field2346 = -1;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "F")
    private static float field2349 = -1.0F;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "[F")
    private static float[] field2348 = new float[4];

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field2354 = 13156520;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    private static int field2345 = -1;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[F")
    public static float[] field2350 = new float[4];

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "F")
    private static float field2355 = -1.0F;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    private static int field2352 = -1;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "[F")
    public static float[] field2357 = new float[4];

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field2356 = 16777215;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "F")
    private static float field2347;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(FFF)V", line = 4)
    public static final void method1024(float arg0, float arg1, float arg2) {
        if (field2357[0] == arg0 && field2357[1] == arg1 && field2357[2] == arg2) {
            return;
        }
        field2357[0] = arg0;
        field2357[1] = arg1;
        field2357[2] = arg2;
        field2348[0] = -arg0;
        field2348[1] = -arg1;
        field2348[2] = -arg2;
        field2351 = (int) (arg0 * 256.0F / arg1);
        field2353 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([F)V", line = 20)
    public static final void method1025(float[] arg0) {
        if (arg0 == null) {
            arg0 = field2350;
        }
        GL var1 = class55.field812;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V", line = 28)
    public static final void method1026() {
        method1031(field2356, 1.1523438F, 0.69921875F, 1.2F);
        method1024(-50.0F, -60.0F, -50.0F);
        method1033(field2354, 0);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()I", line = 41)
    public static final int method1027() {
        return field2345;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()F", line = 56)
    public static final float method1028() {
        return field2347;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()V", line = 69)
    public static void method1029() {
        field2357 = null;
        field2348 = null;
        field2350 = null;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "()V", line = 76)
    public static final void method1030() {
        GL var0 = class55.field812;
        var0.glLightfv(16384, 4611, field2357, 0);
        var0.glLightfv(16385, 4611, field2348, 0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IFFF)V", line = 84)
    public static final void method1031(int arg0, float arg1, float arg2, float arg3) {
        if (field2345 == arg0 && field2347 == arg1 && field2349 == arg2 && field2355 == arg3) {
            return;
        }
        field2345 = arg0;
        field2347 = arg1;
        field2349 = arg2;
        field2355 = arg3;
        GL var4 = class55.field812;
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

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "()F", line = 111)
    public static final float method1032() {
        return field2349;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V", line = 119)
    public static final void method1033(int arg0, int arg1) {
        if (field2346 == arg0 && field2352 == arg1) {
            return;
        }
        field2346 = arg0;
        field2352 = arg1;
        GL var2 = class55.field812;
        byte var3 = 50;
        short var4 = 3584;
        field2350[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field2350[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field2350[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field2350, 0);
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "()V", line = 154)
    public static final void method1034() {
        GL var0 = class55.field812;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field2345 = -1;
        field2346 = -1;
        method1026();
    }
}
