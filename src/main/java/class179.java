import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class179 {

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    private static int field2844 = -1;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field2839 = 13156520;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    private static int field2847 = -1;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "[F")
    public static float[] field2848 = new float[4];

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[F")
    public static float[] field2845 = new float[4];

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    private static int field2841 = -1;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "F")
    private static float field2843 = -1.0F;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field2840 = 16777215;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "[F")
    private static float[] field2849 = new float[4];

    @OriginalMember(owner = "client!je", name = "m", descriptor = "F")
    private static float field2851 = -1.0F;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "F")
    private static float field2842;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V", line = 4)
    private static final void method1335() {
        method1345(field2840, 1.1523438F, 0.69921875F, 1.2F);
        method1343(-50.0F, -60.0F, -50.0F);
        method1339(field2839, 0, false);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()F", line = 9)
    public static final float method1336() {
        return field2843;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()I", line = 12)
    public static final int method1337() {
        return field2841;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()V", line = 17)
    public static void method1338() {
        field2848 = null;
        field2849 = null;
        field2845 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZ)V", line = 22)
    public static final void method1339(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field2847 == arg0 && field2844 == arg1) {
            return;
        }
        field2847 = arg0;
        field2844 = arg1;
        GL var3 = class73.field1051;
        byte var4 = 50;
        short var5 = 3584;
        field2845[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field2845[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field2845[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field2845, 0);
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "()V", line = 56)
    public static final void method1340() {
        GL var0 = class73.field1051;
        var0.glLightfv(16384, 4611, field2848, 0);
        var0.glLightfv(16385, 4611, field2849, 0);
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "()V", line = 66)
    public static final void method1341() {
        GL var0 = class73.field1051;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field2841 = -1;
        field2847 = -1;
        method1335();
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "()F", line = 84)
    public static final float method1342() {
        return field2842;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(FFF)V", line = 108)
    public static final void method1343(float arg0, float arg1, float arg2) {
        if (field2848[0] == arg0 && field2848[1] == arg1 && field2848[2] == arg2) {
            return;
        }
        field2848[0] = arg0;
        field2848[1] = arg1;
        field2848[2] = arg2;
        field2849[0] = -arg0;
        field2849[1] = -arg1;
        field2849[2] = -arg2;
        field2850 = (int) (arg0 * 256.0F / arg1);
        field2846 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([F)V", line = 139)
    public static final void method1344(float[] arg0) {
        if (arg0 == null) {
            arg0 = field2845;
        }
        GL var1 = class73.field1051;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IFFF)V", line = 147)
    public static final void method1345(int arg0, float arg1, float arg2, float arg3) {
        if (field2841 == arg0 && field2842 == arg1 && field2843 == arg2 && field2851 == arg3) {
            return;
        }
        field2841 = arg0;
        field2842 = arg1;
        field2843 = arg2;
        field2851 = arg3;
        GL var4 = class73.field1051;
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
