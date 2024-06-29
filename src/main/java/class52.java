import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class52 {

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "[F")
    public static float[] field839 = new float[4];

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    private static int field835 = -1;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "F")
    private static float field834 = -1.0F;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    private static int field840 = -1;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field843 = 13156520;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "[F")
    public static float[] field844 = new float[4];

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "[F")
    private static float[] field846 = new float[4];

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field841 = 16777215;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "F")
    private static float field842 = -1.0F;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    private static int field845 = -1;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "F")
    private static float field836;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()I", line = 5)
    public static final int method384() {
        return field845;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "()V", line = 9)
    public static final void method385() {
        method393(field841, 1.1523438F, 0.69921875F, 1.2F);
        method392(-50.0F, -60.0F, -50.0F);
        method388(field843, 0);
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "()V", line = 16)
    public static final void method386() {
        GL var0 = class123.field2212;
        var0.glLightfv(16384, 4611, field844, 0);
        var0.glLightfv(16385, 4611, field846, 0);
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "()V", line = 22)
    public static final void method387() {
        GL var0 = class123.field2212;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field845 = -1;
        field840 = -1;
        method385();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V", line = 38)
    public static final void method388(int arg0, int arg1) {
        if (field840 == arg0 && field835 == arg1) {
            return;
        }
        field840 = arg0;
        field835 = arg1;
        GL var2 = class123.field2212;
        byte var3 = 50;
        short var4 = 3584;
        field839[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field839[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field839[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field839, 0);
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "()F", line = 76)
    public static final float method389() {
        return field836;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "()V", line = 89)
    public static void method390() {
        field844 = null;
        field846 = null;
        field839 = null;
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "()F", line = 96)
    public static final float method391() {
        return field842;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(FFF)V", line = 100)
    public static final void method392(float arg0, float arg1, float arg2) {
        if (field844[0] == arg0 && field844[1] == arg1 && field844[2] == arg2) {
            return;
        }
        field844[0] = arg0;
        field844[1] = arg1;
        field844[2] = arg2;
        field846[0] = -arg0;
        field846[1] = -arg1;
        field846[2] = -arg2;
        field837 = (int) (arg0 * 256.0F / arg1);
        field838 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IFFF)V", line = 113)
    public static final void method393(int arg0, float arg1, float arg2, float arg3) {
        if (field845 == arg0 && field836 == arg1 && field842 == arg2 && field834 == arg3) {
            return;
        }
        field845 = arg0;
        field836 = arg1;
        field842 = arg2;
        field834 = arg3;
        GL var4 = class123.field2212;
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

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([F)V", line = 148)
    public static final void method394(float[] arg0) {
        if (arg0 == null) {
            arg0 = field839;
        }
        GL var1 = class123.field2212;
        var1.glFogfv(2918, arg0, 0);
    }
}
