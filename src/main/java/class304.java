import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class304 {

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    private static int field5182 = -1;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "F")
    private static float field5179 = -1.0F;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field5181 = 13156520;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "[F")
    private static float[] field5183 = new float[4];

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "[F")
    public static float[] field5185 = new float[4];

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "[F")
    public static float[] field5189 = new float[4];

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    private static int field5186 = -1;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "F")
    private static float field5190 = -1.0F;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field5187 = 16777215;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    private static int field5191 = -1;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "F")
    private static float field5188;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V", line = 7)
    public static final void method2122(int arg0, int arg1) {
        if (field5182 == arg0 && field5191 == arg1) {
            return;
        }
        field5182 = arg0;
        field5191 = arg1;
        GL var2 = class257.field4409;
        byte var3 = 50;
        short var4 = 3584;
        field5185[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field5185[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field5185[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field5185, 0);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()V", line = 36)
    public static final void method2123() {
        GL var0 = class257.field4409;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field5186 = -1;
        field5182 = -1;
        method2126();
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([F)V", line = 52)
    public static final void method2124(float[] arg0) {
        if (arg0 == null) {
            arg0 = field5185;
        }
        GL var1 = class257.field4409;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "()V", line = 65)
    public static void method2125() {
        field5189 = null;
        field5183 = null;
        field5185 = null;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "()V", line = 74)
    public static final void method2126() {
        method2132(field5187, 1.1523438F, 0.69921875F, 1.2F);
        method2129(-50.0F, -60.0F, -50.0F);
        method2122(field5181, 0);
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "()V", line = 84)
    public static final void method2127() {
        GL var0 = class257.field4409;
        var0.glLightfv(16384, 4611, field5189, 0);
        var0.glLightfv(16385, 4611, field5183, 0);
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "()I", line = 89)
    public static final int method2128() {
        return field5186;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(FFF)V", line = 93)
    public static final void method2129(float arg0, float arg1, float arg2) {
        if (field5189[0] == arg0 && field5189[1] == arg1 && field5189[2] == arg2) {
            return;
        }
        field5189[0] = arg0;
        field5189[1] = arg1;
        field5189[2] = arg2;
        field5183[0] = -arg0;
        field5183[1] = -arg1;
        field5183[2] = -arg2;
        field5180 = (int) (arg0 * 256.0F / arg1);
        field5184 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "()F", line = 106)
    public static final float method2130() {
        return field5188;
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "()F", line = 116)
    public static final float method2131() {
        return field5190;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IFFF)V", line = 123)
    public static final void method2132(int arg0, float arg1, float arg2, float arg3) {
        if (field5186 == arg0 && field5188 == arg1 && field5190 == arg2 && field5179 == arg3) {
            return;
        }
        field5186 = arg0;
        field5188 = arg1;
        field5190 = arg2;
        field5179 = arg3;
        GL var4 = class257.field4409;
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
