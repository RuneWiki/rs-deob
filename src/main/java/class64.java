import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class64 {

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    private static int field832 = -1;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    private static int field830 = -1;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "F")
    private static float field837 = -1.0F;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "F")
    private static float field833 = -1.0F;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field835 = 16777215;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[F")
    public static float[] field834 = new float[4];

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "[F")
    private static float[] field840 = new float[4];

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field836 = 13156520;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "[F")
    public static float[] field838 = new float[4];

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    private static int field841 = -1;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "F")
    private static float field839;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()V", line = 4)
    public static void method395() {
        field834 = null;
        field840 = null;
        field838 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()V", line = 9)
    private static final void method396() {
        method399(field835, 1.1523438F, 0.69921875F, 1.2F);
        method403(-50.0F, -60.0F, -50.0F);
        method398(field836, 0, false);
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "()V", line = 15)
    public static final void method397() {
        GL var0 = class250.field3818;
        var0.glLightfv(16384, 4611, field834, 0);
        var0.glLightfv(16385, 4611, field840, 0);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZ)V", line = 20)
    public static final void method398(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field830 == arg0 && field832 == arg1) {
            return;
        }
        field830 = arg0;
        field832 = arg1;
        GL var3 = class250.field3818;
        byte var4 = 50;
        short var5 = 3584;
        field838[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field838[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field838[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field838, 0);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IFFF)V", line = 48)
    public static final void method399(int arg0, float arg1, float arg2, float arg3) {
        if (field841 == arg0 && field839 == arg1 && field837 == arg2 && field833 == arg3) {
            return;
        }
        field841 = arg0;
        field839 = arg1;
        field837 = arg2;
        field833 = arg3;
        GL var4 = class250.field3818;
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

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "()F", line = 76)
    public static final float method400() {
        return field837;
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "()F", line = 81)
    public static final float method401() {
        return field839;
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "()V", line = 92)
    public static final void method402() {
        GL var0 = class250.field3818;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field841 = -1;
        field830 = -1;
        method396();
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(FFF)V", line = 109)
    public static final void method403(float arg0, float arg1, float arg2) {
        if (field834[0] == arg0 && field834[1] == arg1 && field834[2] == arg2) {
            return;
        }
        field834[0] = arg0;
        field834[1] = arg1;
        field834[2] = arg2;
        field840[0] = -arg0;
        field840[1] = -arg1;
        field840[2] = -arg2;
        field829 = (int) (arg0 * 256.0F / arg1);
        field831 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "()I", line = 138)
    public static final int method404() {
        return field841;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([F)V", line = 153)
    public static final void method405(float[] arg0) {
        if (arg0 == null) {
            arg0 = field838;
        }
        GL var1 = class250.field3818;
        var1.glFogfv(2918, arg0, 0);
    }
}
