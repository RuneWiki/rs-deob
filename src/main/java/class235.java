import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class235 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    private static int field3957 = -1;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[F")
    public static float[] field3960 = new float[4];

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    private static int field3965 = -1;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "[F")
    private static float[] field3958 = new float[4];

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field3964 = 13156520;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "F")
    private static float field3963 = -1.0F;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[F")
    public static float[] field3959 = new float[4];

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    private static int field3969 = -1;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "F")
    private static float field3968 = -1.0F;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field3967 = 16777215;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "F")
    private static float field3962;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()V", line = 6)
    public static final void method1594() {
        GL var0 = class56.field848;
        var0.glLightfv(16384, 4611, field3959, 0);
        var0.glLightfv(16385, 4611, field3958, 0);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()V", line = 17)
    public static final void method1595() {
        GL var0 = class56.field848;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field3957 = -1;
        field3969 = -1;
        method1596();
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()V", line = 33)
    private static final void method1596() {
        method1602(field3967, 1.1523438F, 0.69921875F, 1.2F);
        method1603(-50.0F, -60.0F, -50.0F);
        method1601(field3964, 0);
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()F", line = 43)
    public static final float method1597() {
        return field3962;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([F)V", line = 46)
    public static final void method1598(float[] arg0) {
        if (arg0 == null) {
            arg0 = field3960;
        }
        GL var1 = class56.field848;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "()I", line = 55)
    public static final int method1599() {
        return field3957;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "()V", line = 63)
    public static void method1600() {
        field3959 = null;
        field3958 = null;
        field3960 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 69)
    public static final void method1601(int arg0, int arg1) {
        if (field3969 == arg0 && field3965 == arg1) {
            return;
        }
        field3969 = arg0;
        field3965 = arg1;
        GL var2 = class56.field848;
        byte var3 = 50;
        short var4 = 3584;
        field3960[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field3960[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field3960[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field3960, 0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IFFF)V", line = 97)
    public static final void method1602(int arg0, float arg1, float arg2, float arg3) {
        if (field3957 == arg0 && field3962 == arg1 && field3968 == arg2 && field3963 == arg3) {
            return;
        }
        field3957 = arg0;
        field3962 = arg1;
        field3968 = arg2;
        field3963 = arg3;
        GL var4 = class56.field848;
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

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(FFF)V", line = 134)
    public static final void method1603(float arg0, float arg1, float arg2) {
        if (field3959[0] == arg0 && field3959[1] == arg1 && field3959[2] == arg2) {
            return;
        }
        field3959[0] = arg0;
        field3959[1] = arg1;
        field3959[2] = arg2;
        field3958[0] = -arg0;
        field3958[1] = -arg1;
        field3958[2] = -arg2;
        field3961 = (int) (arg0 * 256.0F / arg1);
        field3966 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "()F", line = 157)
    public static final float method1604() {
        return field3968;
    }
}
