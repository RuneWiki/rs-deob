import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class326 {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    private static int field5067 = -1;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[F")
    public static float[] field5065 = new float[4];

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field5068 = 16777215;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    private static int field5069 = -1;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[F")
    public static float[] field5070 = new float[4];

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "F")
    private static float field5072 = -1.0F;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "F")
    private static float field5064 = -1.0F;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    private static int field5063 = -1;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field5071 = 13156520;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[F")
    private static float[] field5074 = new float[4];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "F")
    private static float field5062;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([F)V", line = 8)
    public static final void method2209(float[] arg0) {
        if (arg0 == null) {
            arg0 = field5065;
        }
        GL var1 = class333.field5160;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()F", line = 20)
    public static final float method2210() {
        return field5064;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "()V", line = 23)
    private static final void method2211() {
        method2218(field5068, 1.1523438F, 0.69921875F, 1.2F);
        method2212(-50.0F, -60.0F, -50.0F);
        method2217(field5071, 0, false);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(FFF)V", line = 36)
    public static final void method2212(float arg0, float arg1, float arg2) {
        if (field5070[0] == arg0 && field5070[1] == arg1 && field5070[2] == arg2) {
            return;
        }
        field5070[0] = arg0;
        field5070[1] = arg1;
        field5070[2] = arg2;
        field5074[0] = -arg0;
        field5074[1] = -arg1;
        field5074[2] = -arg2;
        field5073 = (int) (arg0 * 256.0F / arg1);
        field5066 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "()V", line = 55)
    public static final void method2213() {
        GL var0 = class333.field5160;
        var0.glLightfv(16384, 4611, field5070, 0);
        var0.glLightfv(16385, 4611, field5074, 0);
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "()V", line = 60)
    public static void method2214() {
        field5070 = null;
        field5074 = null;
        field5065 = null;
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "()V", line = 66)
    public static final void method2215() {
        GL var0 = class333.field5160;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field5069 = -1;
        field5063 = -1;
        method2211();
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "()F", line = 82)
    public static final float method2216() {
        return field5062;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZ)V", line = 92)
    public static final void method2217(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field5063 == arg0 && field5067 == arg1) {
            return;
        }
        field5063 = arg0;
        field5067 = arg1;
        GL var3 = class333.field5160;
        byte var4 = 50;
        short var5 = 3584;
        field5065[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field5065[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field5065[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field5065, 0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IFFF)V", line = 119)
    public static final void method2218(int arg0, float arg1, float arg2, float arg3) {
        if (field5069 == arg0 && field5062 == arg1 && field5064 == arg2 && field5072 == arg3) {
            return;
        }
        field5069 = arg0;
        field5062 = arg1;
        field5064 = arg2;
        field5072 = arg3;
        GL var4 = class333.field5160;
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

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "()I", line = 148)
    public static final int method2219() {
        return field5069;
    }
}
