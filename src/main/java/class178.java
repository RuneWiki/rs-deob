import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class178 {

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field2838 = 16777215;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    private static int field2842 = -1;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field2843 = 13156520;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "F")
    private static float field2841 = -1.0F;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    private static int field2840 = -1;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "[F")
    private static float[] field2846 = new float[4];

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    private static int field2848 = -1;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "F")
    private static float field2845 = -1.0F;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "[F")
    public static float[] field2847 = new float[4];

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "[F")
    public static float[] field2850 = new float[4];

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "F")
    private static float field2849;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()V", line = 5)
    public static final void method1134() {
        method1138(field2838, 1.1523438F, 0.69921875F, 1.2F);
        method1144(-50.0F, -60.0F, -50.0F);
        method1136(field2843, 0);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "()F", line = 13)
    public static final float method1135() {
        return field2849;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V", line = 21)
    public static final void method1136(int arg0, int arg1) {
        if (field2842 == arg0 && field2840 == arg1) {
            return;
        }
        field2842 = arg0;
        field2840 = arg1;
        GL var2 = class264.field4313;
        byte var3 = 50;
        short var4 = 3584;
        field2850[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field2850[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field2850[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field2850, 0);
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "()F", line = 48)
    public static final float method1137() {
        return field2845;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IFFF)V", line = 51)
    public static final void method1138(int arg0, float arg1, float arg2, float arg3) {
        if (field2848 == arg0 && field2849 == arg1 && field2845 == arg2 && field2841 == arg3) {
            return;
        }
        field2848 = arg0;
        field2849 = arg1;
        field2845 = arg2;
        field2841 = arg3;
        GL var4 = class264.field4313;
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

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "()I", line = 78)
    public static final int method1139() {
        return field2848;
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "()V", line = 90)
    public static void method1140() {
        field2847 = null;
        field2846 = null;
        field2850 = null;
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "()V", line = 99)
    public static final void method1141() {
        GL var0 = class264.field4313;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field2848 = -1;
        field2842 = -1;
        method1134();
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([F)V", line = 122)
    public static final void method1142(float[] arg0) {
        if (arg0 == null) {
            arg0 = field2850;
        }
        GL var1 = class264.field4313;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "()V", line = 133)
    public static final void method1143() {
        GL var0 = class264.field4313;
        var0.glLightfv(16384, 4611, field2847, 0);
        var0.glLightfv(16385, 4611, field2846, 0);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(FFF)V", line = 146)
    public static final void method1144(float arg0, float arg1, float arg2) {
        if (field2847[0] == arg0 && field2847[1] == arg1 && field2847[2] == arg2) {
            return;
        }
        field2847[0] = arg0;
        field2847[1] = arg1;
        field2847[2] = arg2;
        field2846[0] = -arg0;
        field2846[1] = -arg1;
        field2846[2] = -arg2;
        field2844 = (int) (arg0 * 256.0F / arg1);
        field2839 = (int) (arg2 * 256.0F / arg1);
    }
}
