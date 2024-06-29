import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class264 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "[F")
    private static float[] field3942 = new float[4];

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field3949 = 13156520;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "F")
    private static float field3951 = -1.0F;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[F")
    public static float[] field3941 = new float[4];

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field3950 = 16777215;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    private static int field3944 = -1;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    private static int field3947 = -1;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "[F")
    public static float[] field3952 = new float[4];

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    private static int field3948 = -1;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "F")
    private static float field3953 = -1.0F;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "F")
    private static float field3943;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([F)V", line = 4)
    public static final void method1819(float[] arg0) {
        if (arg0 == null) {
            arg0 = field3952;
        }
        GL var1 = class36.field518;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()I", line = 12)
    public static final int method1820() {
        return field3948;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "()V", line = 17)
    public static void method1821() {
        field3941 = null;
        field3942 = null;
        field3952 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(FFF)V", line = 27)
    public static final void method1822(float arg0, float arg1, float arg2) {
        if (field3941[0] == arg0 && field3941[1] == arg1 && field3941[2] == arg2) {
            return;
        }
        field3941[0] = arg0;
        field3941[1] = arg1;
        field3941[2] = arg2;
        field3942[0] = -arg0;
        field3942[1] = -arg1;
        field3942[2] = -arg2;
        field3946 = (int) (arg0 * 256.0F / arg1);
        field3945 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IFFF)V", line = 42)
    public static final void method1823(int arg0, float arg1, float arg2, float arg3) {
        if (field3948 == arg0 && field3943 == arg1 && field3953 == arg2 && field3951 == arg3) {
            return;
        }
        field3948 = arg0;
        field3943 = arg1;
        field3953 = arg2;
        field3951 = arg3;
        GL var4 = class36.field518;
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

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "()V", line = 71)
    public static final void method1824() {
        GL var0 = class36.field518;
        var0.glLightfv(16384, 4611, field3941, 0);
        var0.glLightfv(16385, 4611, field3942, 0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V", line = 84)
    public static final void method1825(int arg0, int arg1) {
        if (field3944 == arg0 && field3947 == arg1) {
            return;
        }
        field3944 = arg0;
        field3947 = arg1;
        GL var2 = class36.field518;
        byte var3 = 50;
        short var4 = 3584;
        field3952[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field3952[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field3952[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field3952, 0);
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "()V", line = 127)
    private static final void method1826() {
        method1823(field3950, 1.1523438F, 0.69921875F, 1.2F);
        method1822(-50.0F, -60.0F, -50.0F);
        method1825(field3949, 0);
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "()F", line = 135)
    public static final float method1827() {
        return field3953;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "()V", line = 142)
    public static final void method1828() {
        GL var0 = class36.field518;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field3948 = -1;
        field3944 = -1;
        method1826();
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "()F", line = 167)
    public static final float method1829() {
        return field3943;
    }
}
