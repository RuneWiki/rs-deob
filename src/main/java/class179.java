import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class179 {

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "F")
    private static float field2854 = -1.0F;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[F")
    public static float[] field2852 = new float[4];

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    private static int field2857 = -1;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    private static int field2858 = -1;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    private static int field2855 = -1;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[F")
    public static float[] field2849 = new float[4];

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[F")
    private static float[] field2856 = new float[4];

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "F")
    private static float field2851 = -1.0F;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field2859 = 13156520;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field2860 = 16777215;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "F")
    private static float field2850;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V", line = 5)
    public static final void method1252() {
        method1257(field2860, 1.1523438F, 0.69921875F, 1.2F);
        method1262(-50.0F, -60.0F, -50.0F);
        method1256(field2859, 0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([F)V", line = 13)
    public static final void method1253(float[] arg0) {
        if (arg0 == null) {
            arg0 = field2852;
        }
        GL var1 = class154.field2479;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()F", line = 23)
    public static final float method1254() {
        return field2850;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()I", line = 26)
    public static final int method1255() {
        return field2858;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V", line = 29)
    public static final void method1256(int arg0, int arg1) {
        if (field2857 == arg0 && field2855 == arg1) {
            return;
        }
        field2857 = arg0;
        field2855 = arg1;
        GL var2 = class154.field2479;
        byte var3 = 50;
        short var4 = 3584;
        field2852[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field2852[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field2852[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field2852, 0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IFFF)V", line = 56)
    public static final void method1257(int arg0, float arg1, float arg2, float arg3) {
        if (field2858 == arg0 && field2850 == arg1 && field2851 == arg2 && field2854 == arg3) {
            return;
        }
        field2858 = arg0;
        field2850 = arg1;
        field2851 = arg2;
        field2854 = arg3;
        GL var4 = class154.field2479;
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

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "()V", line = 91)
    public static final void method1258() {
        GL var0 = class154.field2479;
        var0.glLightfv(16384, 4611, field2849, 0);
        var0.glLightfv(16385, 4611, field2856, 0);
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "()V", line = 119)
    public static final void method1259() {
        GL var0 = class154.field2479;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field2858 = -1;
        field2857 = -1;
        method1252();
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "()F", line = 135)
    public static final float method1260() {
        return field2851;
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "()V", line = 151)
    public static void method1261() {
        field2849 = null;
        field2856 = null;
        field2852 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(FFF)V", line = 157)
    public static final void method1262(float arg0, float arg1, float arg2) {
        if (field2849[0] == arg0 && field2849[1] == arg1 && field2849[2] == arg2) {
            return;
        }
        field2849[0] = arg0;
        field2849[1] = arg1;
        field2849[2] = arg2;
        field2856[0] = -arg0;
        field2856[1] = -arg1;
        field2856[2] = -arg2;
        field2861 = (int) (arg0 * 256.0F / arg1);
        field2853 = (int) (arg2 * 256.0F / arg1);
    }
}
