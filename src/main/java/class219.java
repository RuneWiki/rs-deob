import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class219 {

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    private static int field3869 = -1;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[F")
    private static float[] field3871 = new float[4];

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "F")
    private static float field3875 = -1.0F;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    private static int field3874 = -1;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    private static int field3877 = -1;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3870 = 13156520;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[F")
    public static float[] field3868 = new float[4];

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "F")
    private static float field3879 = -1.0F;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field3878 = 16777215;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "[F")
    public static float[] field3880 = new float[4];

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "F")
    private static float field3876;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(FFF)V", line = 8)
    public static final void method1600(float arg0, float arg1, float arg2) {
        if (field3880[0] == arg0 && field3880[1] == arg1 && field3880[2] == arg2) {
            return;
        }
        field3880[0] = arg0;
        field3880[1] = arg1;
        field3880[2] = arg2;
        field3871[0] = -arg0;
        field3871[1] = -arg1;
        field3871[2] = -arg2;
        field3872 = (int) (arg0 * 256.0F / arg1);
        field3873 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V", line = 22)
    public static final void method1601(int arg0, int arg1) {
        if (field3869 == arg0 && field3877 == arg1) {
            return;
        }
        field3869 = arg0;
        field3877 = arg1;
        GL var2 = class97.field1801;
        byte var3 = 50;
        short var4 = 3584;
        field3868[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field3868[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field3868[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field3868, 0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()I", line = 53)
    public static final int method1602() {
        return field3874;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "()F", line = 64)
    public static final float method1603() {
        return field3875;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "()V", line = 68)
    public static final void method1604() {
        GL var0 = class97.field1801;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field3874 = -1;
        field3869 = -1;
        method1608();
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "()V", line = 89)
    public static void method1605() {
        field3880 = null;
        field3871 = null;
        field3868 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([F)V", line = 95)
    public static final void method1606(float[] arg0) {
        if (arg0 == null) {
            arg0 = field3868;
        }
        GL var1 = class97.field1801;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "()F", line = 106)
    public static final float method1607() {
        return field3876;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "()V", line = 110)
    private static final void method1608() {
        method1610(field3878, 1.1523438F, 0.69921875F, 1.2F);
        method1600(-50.0F, -60.0F, -50.0F);
        method1601(field3870, 0);
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "()V", line = 116)
    public static final void method1609() {
        GL var0 = class97.field1801;
        var0.glLightfv(16384, 4611, field3880, 0);
        var0.glLightfv(16385, 4611, field3871, 0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IFFF)V", line = 135)
    public static final void method1610(int arg0, float arg1, float arg2, float arg3) {
        if (field3874 == arg0 && field3876 == arg1 && field3875 == arg2 && field3879 == arg3) {
            return;
        }
        field3874 = arg0;
        field3876 = arg1;
        field3875 = arg2;
        field3879 = arg3;
        GL var4 = class97.field1801;
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
