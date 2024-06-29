import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class289 {

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    private static int field4813 = -1;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "[F")
    public static float[] field4812 = new float[4];

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field4816 = 13156520;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "F")
    private static float field4817 = -1.0F;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "[F")
    public static float[] field4819 = new float[4];

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "[F")
    private static float[] field4821 = new float[4];

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "F")
    private static float field4818 = -1.0F;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field4822 = 16777215;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    private static int field4823 = -1;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    private static int field4824 = -1;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "F")
    private static float field4820;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()V", line = 6)
    public static final void method2029() {
        GL var0 = class255.field4181;
        var0.glLightfv(16384, 4611, field4812, 0);
        var0.glLightfv(16385, 4611, field4821, 0);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "()F", line = 20)
    public static final float method2030() {
        return field4817;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IFFF)V", line = 26)
    public static final void method2031(int arg0, float arg1, float arg2, float arg3) {
        if (field4813 == arg0 && field4820 == arg1 && field4817 == arg2 && field4818 == arg3) {
            return;
        }
        field4813 = arg0;
        field4820 = arg1;
        field4817 = arg2;
        field4818 = arg3;
        GL var4 = class255.field4181;
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

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "()V", line = 53)
    public static void method2032() {
        field4812 = null;
        field4821 = null;
        field4819 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V", line = 67)
    public static final void method2033(int arg0, int arg1) {
        if (field4824 == arg0 && field4823 == arg1) {
            return;
        }
        field4824 = arg0;
        field4823 = arg1;
        GL var2 = class255.field4181;
        byte var3 = 50;
        short var4 = 3584;
        field4819[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field4819[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field4819[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field4819, 0);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(FFF)V", line = 94)
    public static final void method2034(float arg0, float arg1, float arg2) {
        if (field4812[0] == arg0 && field4812[1] == arg1 && field4812[2] == arg2) {
            return;
        }
        field4812[0] = arg0;
        field4812[1] = arg1;
        field4812[2] = arg2;
        field4821[0] = -arg0;
        field4821[1] = -arg1;
        field4821[2] = -arg2;
        field4814 = (int) (arg0 * 256.0F / arg1);
        field4815 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "()I", line = 118)
    public static final int method2035() {
        return field4813;
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "()V", line = 133)
    public static final void method2036() {
        GL var0 = class255.field4181;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field4813 = -1;
        field4824 = -1;
        method2038();
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([F)V", line = 150)
    public static final void method2037(float[] arg0) {
        if (arg0 == null) {
            arg0 = field4819;
        }
        GL var1 = class255.field4181;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "()V", line = 158)
    private static final void method2038() {
        method2031(field4822, 1.1523438F, 0.69921875F, 1.2F);
        method2034(-50.0F, -60.0F, -50.0F);
        method2033(field4816, 0);
    }

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "()F", line = 170)
    public static final float method2039() {
        return field4820;
    }
}
