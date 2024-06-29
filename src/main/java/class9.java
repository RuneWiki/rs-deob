import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class9 {

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "[F")
    public static float[] field115 = new float[4];

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    private static int field118 = -1;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    private static int field120 = -1;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "[F")
    private static float[] field121 = new float[4];

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field117 = 13156520;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field123 = 16777215;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    private static int field119 = -1;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "F")
    private static float field116 = -1.0F;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "F")
    private static float field124 = -1.0F;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "[F")
    public static float[] field122 = new float[4];

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "F")
    private static float field125;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()V", line = 9)
    private static final void method61() {
        method68(field123, 1.1523438F, 0.69921875F, 1.2F);
        method70(-50.0F, -60.0F, -50.0F);
        method71(field117, 0, false);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "()V", line = 19)
    public static final void method62() {
        GL var0 = class43.field651;
        var0.glLightfv(16384, 4611, field115, 0);
        var0.glLightfv(16385, 4611, field121, 0);
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "()V", line = 32)
    public static void method63() {
        field115 = null;
        field121 = null;
        field122 = null;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "()F", line = 37)
    public static final float method64() {
        return field125;
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "()I", line = 43)
    public static final int method65() {
        return field118;
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "()F", line = 46)
    public static final float method66() {
        return field116;
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "()V", line = 50)
    public static final void method67() {
        GL var0 = class43.field651;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field118 = -1;
        field119 = -1;
        method61();
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IFFF)V", line = 70)
    public static final void method68(int arg0, float arg1, float arg2, float arg3) {
        if (field118 == arg0 && field125 == arg1 && field116 == arg2 && field124 == arg3) {
            return;
        }
        field118 = arg0;
        field125 = arg1;
        field116 = arg2;
        field124 = arg3;
        GL var4 = class43.field651;
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

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([F)V", line = 106)
    public static final void method69(float[] arg0) {
        if (arg0 == null) {
            arg0 = field122;
        }
        GL var1 = class43.field651;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(FFF)V", line = 117)
    public static final void method70(float arg0, float arg1, float arg2) {
        if (field115[0] == arg0 && field115[1] == arg1 && field115[2] == arg2) {
            return;
        }
        field115[0] = arg0;
        field115[1] = arg1;
        field115[2] = arg2;
        field121[0] = -arg0;
        field121[1] = -arg1;
        field121[2] = -arg2;
        field114 = (int) (arg0 * 256.0F / arg1);
        field126 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZ)V", line = 134)
    public static final void method71(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field119 == arg0 && field120 == arg1) {
            return;
        }
        field119 = arg0;
        field120 = arg1;
        GL var3 = class43.field651;
        byte var4 = 50;
        short var5 = 3584;
        field122[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field122[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field122[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field122, 0);
    }
}
