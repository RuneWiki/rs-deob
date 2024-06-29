import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class217 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field3861 = 16777215;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    private static int field3864 = -1;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[F")
    private static float[] field3865 = new float[4];

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "F")
    private static float field3866 = -1.0F;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field3868 = 13156520;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "F")
    private static float field3869 = -1.0F;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[F")
    public static float[] field3862 = new float[4];

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    private static int field3871 = -1;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    private static int field3870 = -1;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "[F")
    public static float[] field3867 = new float[4];

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "F")
    private static float field3863;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V", line = 14)
    public static final void method1488(int arg0, int arg1) {
        if (field3870 == arg0 && field3871 == arg1) {
            return;
        }
        field3870 = arg0;
        field3871 = arg1;
        GL var2 = class231.field4052;
        byte var3 = 50;
        short var4 = 3584;
        field3867[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field3867[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field3867[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field3867, 0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V", line = 45)
    public static final void method1489() {
        GL var0 = class231.field4052;
        var0.glLightfv(16384, 4611, field3862, 0);
        var0.glLightfv(16385, 4611, field3865, 0);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()V", line = 52)
    public static final void method1490() {
        GL var0 = class231.field4052;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field3864 = -1;
        field3870 = -1;
        method1494();
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IFFF)V", line = 68)
    public static final void method1491(int arg0, float arg1, float arg2, float arg3) {
        if (field3864 == arg0 && field3863 == arg1 && field3866 == arg2 && field3869 == arg3) {
            return;
        }
        field3864 = arg0;
        field3863 = arg1;
        field3866 = arg2;
        field3869 = arg3;
        GL var4 = class231.field4052;
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

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()F", line = 99)
    public static final float method1492() {
        return field3863;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([F)V", line = 102)
    public static final void method1493(float[] arg0) {
        if (arg0 == null) {
            arg0 = field3867;
        }
        GL var1 = class231.field4052;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()V", line = 114)
    private static final void method1494() {
        method1491(field3861, 1.1523438F, 0.69921875F, 1.2F);
        method1496(-50.0F, -60.0F, -50.0F);
        method1488(field3868, 0);
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "()V", line = 122)
    public static void method1495() {
        field3862 = null;
        field3865 = null;
        field3867 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(FFF)V", line = 145)
    public static final void method1496(float arg0, float arg1, float arg2) {
        if (field3862[0] == arg0 && field3862[1] == arg1 && field3862[2] == arg2) {
            return;
        }
        field3862[0] = arg0;
        field3862[1] = arg1;
        field3862[2] = arg2;
        field3865[0] = -arg0;
        field3865[1] = -arg1;
        field3865[2] = -arg2;
        field3860 = (int) (arg0 * 256.0F / arg1);
        field3872 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "()F", line = 159)
    public static final float method1497() {
        return field3866;
    }

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "()I", line = 169)
    public static final int method1498() {
        return field3864;
    }
}
