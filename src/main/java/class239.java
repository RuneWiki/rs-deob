import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class239 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "F")
    private static float field4033 = -1.0F;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    private static int field4038 = -1;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "[F")
    private static float[] field4041 = new float[4];

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[F")
    public static float[] field4036 = new float[4];

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    private static int field4043 = -1;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    private static int field4042 = -1;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4037 = 16777215;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[F")
    public static float[] field4034 = new float[4];

    @OriginalMember(owner = "client!t", name = "m", descriptor = "F")
    private static float field4045 = -1.0F;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field4044 = 13156520;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "F")
    private static float field4040;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([F)V", line = 10)
    public static final void method1740(float[] arg0) {
        if (arg0 == null) {
            arg0 = field4034;
        }
        GL var1 = class47.field739;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V", line = 21)
    public static final void method1741() {
        method1745(field4037, 1.1523438F, 0.69921875F, 1.2F);
        method1746(-50.0F, -60.0F, -50.0F);
        method1749(field4044, 0);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V", line = 28)
    public static final void method1742() {
        GL var0 = class47.field739;
        var0.glLightfv(16384, 4611, field4036, 0);
        var0.glLightfv(16385, 4611, field4041, 0);
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()V", line = 39)
    public static void method1743() {
        field4036 = null;
        field4041 = null;
        field4034 = null;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()F", line = 49)
    public static final float method1744() {
        return field4040;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IFFF)V", line = 52)
    public static final void method1745(int arg0, float arg1, float arg2, float arg3) {
        if (field4043 == arg0 && field4040 == arg1 && field4045 == arg2 && field4033 == arg3) {
            return;
        }
        field4043 = arg0;
        field4040 = arg1;
        field4045 = arg2;
        field4033 = arg3;
        GL var4 = class47.field739;
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

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFF)V", line = 82)
    public static final void method1746(float arg0, float arg1, float arg2) {
        if (field4036[0] == arg0 && field4036[1] == arg1 && field4036[2] == arg2) {
            return;
        }
        field4036[0] = arg0;
        field4036[1] = arg1;
        field4036[2] = arg2;
        field4041[0] = -arg0;
        field4041[1] = -arg1;
        field4041[2] = -arg2;
        field4039 = (int) (arg0 * 256.0F / arg1);
        field4035 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "()I", line = 99)
    public static final int method1747() {
        return field4043;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "()V", line = 106)
    public static final void method1748() {
        GL var0 = class47.field739;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field4043 = -1;
        field4042 = -1;
        method1741();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 135)
    public static final void method1749(int arg0, int arg1) {
        if (field4042 == arg0 && field4038 == arg1) {
            return;
        }
        field4042 = arg0;
        field4038 = arg1;
        GL var2 = class47.field739;
        byte var3 = 50;
        short var4 = 3584;
        field4034[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field4034[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field4034[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field4034, 0);
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "()F", line = 170)
    public static final float method1750() {
        return field4045;
    }
}
