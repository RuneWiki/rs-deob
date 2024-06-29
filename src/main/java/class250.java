import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class250 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    private static int field3944 = -1;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field3943 = 16777215;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "F")
    private static float field3946 = -1.0F;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "F")
    private static float field3950 = -1.0F;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "[F")
    public static float[] field3952 = new float[4];

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    private static int field3951 = -1;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    private static int field3953 = -1;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "[F")
    public static float[] field3947 = new float[4];

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field3948 = 13156520;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "[F")
    private static float[] field3949 = new float[4];

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "F")
    private static float field3954;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()F", line = 5)
    public static final float method1728() {
        return field3954;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()I", line = 8)
    public static final int method1729() {
        return field3953;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZ)V", line = 12)
    public static final void method1730(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field3944 == arg0 && field3951 == arg1) {
            return;
        }
        field3944 = arg0;
        field3951 = arg1;
        GL var3 = class94.field1473;
        byte var4 = 50;
        short var5 = 3584;
        field3952[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field3952[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field3952[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field3952, 0);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()F", line = 44)
    public static final float method1731() {
        return field3950;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "()V", line = 48)
    private static final void method1732() {
        method1736(field3943, 1.1523438F, 0.69921875F, 1.2F);
        method1734(-50.0F, -60.0F, -50.0F);
        method1730(field3948, 0, false);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([F)V", line = 60)
    public static final void method1733(float[] arg0) {
        if (arg0 == null) {
            arg0 = field3952;
        }
        GL var1 = class94.field1473;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(FFF)V", line = 73)
    public static final void method1734(float arg0, float arg1, float arg2) {
        if (field3947[0] == arg0 && field3947[1] == arg1 && field3947[2] == arg2) {
            return;
        }
        field3947[0] = arg0;
        field3947[1] = arg1;
        field3947[2] = arg2;
        field3949[0] = -arg0;
        field3949[1] = -arg1;
        field3949[2] = -arg2;
        field3945 = (int) (arg0 * 256.0F / arg1);
        field3955 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "()V", line = 87)
    public static final void method1735() {
        GL var0 = class94.field1473;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field3953 = -1;
        field3944 = -1;
        method1732();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IFFF)V", line = 108)
    public static final void method1736(int arg0, float arg1, float arg2, float arg3) {
        if (field3953 == arg0 && field3954 == arg1 && field3950 == arg2 && field3946 == arg3) {
            return;
        }
        field3953 = arg0;
        field3954 = arg1;
        field3950 = arg2;
        field3946 = arg3;
        GL var4 = class94.field1473;
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

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "()V", line = 141)
    public static void method1737() {
        field3947 = null;
        field3949 = null;
        field3952 = null;
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "()V", line = 152)
    public static final void method1738() {
        GL var0 = class94.field1473;
        var0.glLightfv(16384, 4611, field3947, 0);
        var0.glLightfv(16385, 4611, field3949, 0);
    }
}
