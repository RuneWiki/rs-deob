import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class293 {

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "[F")
    public static float[] field4948 = new float[4];

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    private static int field4950 = -1;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "[F")
    private static float[] field4946 = new float[4];

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field4949 = 13156520;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    private static int field4953 = -1;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "F")
    private static float field4947 = -1.0F;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    private static int field4954 = -1;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field4951 = 16777215;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "[F")
    public static float[] field4955 = new float[4];

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "F")
    private static float field4943 = -1.0F;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "F")
    private static float field4945;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()V", line = 6)
    public static final void method1968() {
        GL var0 = class45.field688;
        var0.glLightfv(16384, 4611, field4955, 0);
        var0.glLightfv(16385, 4611, field4946, 0);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "()F", line = 11)
    public static final float method1969() {
        return field4945;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "()V", line = 21)
    public static final void method1970() {
        method1972(field4951, 1.1523438F, 0.69921875F, 1.2F);
        method1971(-50.0F, -60.0F, -50.0F);
        method1975(field4949, 0);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(FFF)V", line = 26)
    public static final void method1971(float arg0, float arg1, float arg2) {
        if (field4955[0] == arg0 && field4955[1] == arg1 && field4955[2] == arg2) {
            return;
        }
        field4955[0] = arg0;
        field4955[1] = arg1;
        field4955[2] = arg2;
        field4946[0] = -arg0;
        field4946[1] = -arg1;
        field4946[2] = -arg2;
        field4944 = (int) (arg0 * 256.0F / arg1);
        field4952 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IFFF)V", line = 40)
    public static final void method1972(int arg0, float arg1, float arg2, float arg3) {
        if (field4950 == arg0 && field4945 == arg1 && field4943 == arg2 && field4947 == arg3) {
            return;
        }
        field4950 = arg0;
        field4945 = arg1;
        field4943 = arg2;
        field4947 = arg3;
        GL var4 = class45.field688;
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

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "()F", line = 70)
    public static final float method1973() {
        return field4943;
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "()V", line = 73)
    public static void method1974() {
        field4955 = null;
        field4946 = null;
        field4948 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V", line = 79)
    public static final void method1975(int arg0, int arg1) {
        if (field4954 == arg0 && field4953 == arg1) {
            return;
        }
        field4954 = arg0;
        field4953 = arg1;
        GL var2 = class45.field688;
        byte var3 = 50;
        short var4 = 3584;
        field4948[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field4948[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field4948[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field4948, 0);
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "()I", line = 106)
    public static final int method1976() {
        return field4950;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([F)V", line = 109)
    public static final void method1977(float[] arg0) {
        if (arg0 == null) {
            arg0 = field4948;
        }
        GL var1 = class45.field688;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "()V", line = 135)
    public static final void method1978() {
        GL var0 = class45.field688;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field4950 = -1;
        field4954 = -1;
        method1970();
    }
}
