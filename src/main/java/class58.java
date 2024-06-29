import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class58 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "F")
    private static float field827 = -1.0F;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "[F")
    public static float[] field828 = new float[4];

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    private static int field830 = -1;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[F")
    private static float[] field833 = new float[4];

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field831 = 16777215;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field835 = 13156520;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[F")
    public static float[] field832 = new float[4];

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    private static int field837 = -1;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "F")
    private static float field836 = -1.0F;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    private static int field838 = -1;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "F")
    private static float field829;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V", line = 9)
    public static final void method402() {
        method405(field831, 1.1523438F, 0.69921875F, 1.2F);
        method403(-50.0F, -60.0F, -50.0F);
        method412(field835, 0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(FFF)V", line = 16)
    public static final void method403(float arg0, float arg1, float arg2) {
        if (field832[0] == arg0 && field832[1] == arg1 && field832[2] == arg2) {
            return;
        }
        field832[0] = arg0;
        field832[1] = arg1;
        field832[2] = arg2;
        field833[0] = -arg0;
        field833[1] = -arg1;
        field833[2] = -arg2;
        field826 = (int) (arg0 * 256.0F / arg1);
        field834 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()V", line = 44)
    public static final void method404() {
        GL var0 = class166.field2648;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field838 = -1;
        field830 = -1;
        method402();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IFFF)V", line = 68)
    public static final void method405(int arg0, float arg1, float arg2, float arg3) {
        if (field838 == arg0 && field829 == arg1 && field827 == arg2 && field836 == arg3) {
            return;
        }
        field838 = arg0;
        field829 = arg1;
        field827 = arg2;
        field836 = arg3;
        GL var4 = class166.field2648;
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

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()I", line = 96)
    public static final int method406() {
        return field838;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([F)V", line = 99)
    public static final void method407(float[] arg0) {
        if (arg0 == null) {
            arg0 = field828;
        }
        GL var1 = class166.field2648;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "()V", line = 114)
    public static void method408() {
        field832 = null;
        field833 = null;
        field828 = null;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "()F", line = 119)
    public static final float method409() {
        return field827;
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "()V", line = 127)
    public static final void method410() {
        GL var0 = class166.field2648;
        var0.glLightfv(16384, 4611, field832, 0);
        var0.glLightfv(16385, 4611, field833, 0);
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "()F", line = 139)
    public static final float method411() {
        return field829;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V", line = 142)
    public static final void method412(int arg0, int arg1) {
        if (field830 == arg0 && field837 == arg1) {
            return;
        }
        field830 = arg0;
        field837 = arg1;
        GL var2 = class166.field2648;
        byte var3 = 50;
        short var4 = 3584;
        field828[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field828[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field828[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field828, 0);
    }
}
