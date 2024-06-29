import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class276 {

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    private static int field4749 = -1;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[F")
    public static float[] field4746 = new float[4];

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    private static int field4748 = -1;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[F")
    private static float[] field4745 = new float[4];

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[F")
    public static float[] field4755 = new float[4];

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field4754 = 13156520;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field4750 = 16777215;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    private static int field4756 = -1;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "F")
    private static float field4753 = -1.0F;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "F")
    private static float field4757 = -1.0F;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "F")
    private static float field4747;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(FFF)V", line = 5)
    public static final void method1937(float arg0, float arg1, float arg2) {
        if (field4746[0] == arg0 && field4746[1] == arg1 && field4746[2] == arg2) {
            return;
        }
        field4746[0] = arg0;
        field4746[1] = arg1;
        field4746[2] = arg2;
        field4745[0] = -arg0;
        field4745[1] = -arg1;
        field4745[2] = -arg2;
        field4752 = (int) (arg0 * 256.0F / arg1);
        field4751 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([F)V", line = 29)
    public static final void method1938(float[] arg0) {
        if (arg0 == null) {
            arg0 = field4755;
        }
        GL var1 = class108.field1899;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()I", line = 40)
    public static final int method1939() {
        return field4749;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 48)
    public static final void method1940(int arg0, int arg1) {
        if (field4748 == arg0 && field4756 == arg1) {
            return;
        }
        field4748 = arg0;
        field4756 = arg1;
        GL var2 = class108.field1899;
        byte var3 = 50;
        short var4 = 3584;
        field4755[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field4755[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field4755[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field4755, 0);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()V", line = 75)
    private static final void method1941() {
        method1947(field4750, 1.1523438F, 0.69921875F, 1.2F);
        method1937(-50.0F, -60.0F, -50.0F);
        method1940(field4754, 0);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()F", line = 83)
    public static final float method1942() {
        return field4757;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "()V", line = 92)
    public static final void method1943() {
        GL var0 = class108.field1899;
        var0.glLightfv(16384, 4611, field4746, 0);
        var0.glLightfv(16385, 4611, field4745, 0);
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "()V", line = 101)
    public static final void method1944() {
        GL var0 = class108.field1899;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field4749 = -1;
        field4748 = -1;
        method1941();
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "()F", line = 122)
    public static final float method1945() {
        return field4747;
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "()V", line = 125)
    public static void method1946() {
        field4746 = null;
        field4745 = null;
        field4755 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IFFF)V", line = 136)
    public static final void method1947(int arg0, float arg1, float arg2, float arg3) {
        if (field4749 == arg0 && field4747 == arg1 && field4757 == arg2 && field4753 == arg3) {
            return;
        }
        field4749 = arg0;
        field4747 = arg1;
        field4757 = arg2;
        field4753 = arg3;
        GL var4 = class108.field1899;
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
