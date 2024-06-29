import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class41 {

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    private static int field510 = -1;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "F")
    private static float field508 = -1.0F;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "F")
    private static float field513 = -1.0F;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field514 = 16777215;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "[F")
    public static float[] field515 = new float[4];

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field516 = 13156520;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "[F")
    public static float[] field512 = new float[4];

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    private static int field520 = -1;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "[F")
    private static float[] field517 = new float[4];

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    private static int field509 = -1;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "F")
    private static float field519;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "([F)V", line = 4)
    public static final void method291(float[] arg0) {
        if (arg0 == null) {
            arg0 = field512;
        }
        GL var1 = class47.field592;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "()F", line = 17)
    public static final float method292() {
        return field519;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "()V", line = 31)
    private static final void method293() {
        method301(field514, 1.1523438F, 0.69921875F, 1.2F);
        method294(-50.0F, -60.0F, -50.0F);
        method300(field516, 0, false);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(FFF)V", line = 37)
    public static final void method294(float arg0, float arg1, float arg2) {
        if (field515[0] == arg0 && field515[1] == arg1 && field515[2] == arg2) {
            return;
        }
        field515[0] = arg0;
        field515[1] = arg1;
        field515[2] = arg2;
        field517[0] = -arg0;
        field517[1] = -arg1;
        field517[2] = -arg2;
        field518 = (int) (arg0 * 256.0F / arg1);
        field511 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "()F", line = 51)
    public static final float method295() {
        return field513;
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "()V", line = 55)
    public static final void method296() {
        GL var0 = class47.field592;
        var0.glLightfv(16384, 4611, field515, 0);
        var0.glLightfv(16385, 4611, field517, 0);
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "()I", line = 85)
    public static final int method297() {
        return field509;
    }

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "()V", line = 89)
    public static final void method298() {
        GL var0 = class47.field592;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field509 = -1;
        field520 = -1;
        method293();
    }

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "()V", line = 106)
    public static void method299() {
        field515 = null;
        field517 = null;
        field512 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIZ)V", line = 117)
    public static final void method300(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field520 == arg0 && field510 == arg1) {
            return;
        }
        field520 = arg0;
        field510 = arg1;
        GL var3 = class47.field592;
        byte var4 = 50;
        short var5 = 3584;
        field512[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field512[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field512[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field512, 0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IFFF)V", line = 144)
    public static final void method301(int arg0, float arg1, float arg2, float arg3) {
        if (field509 == arg0 && field519 == arg1 && field513 == arg2 && field508 == arg3) {
            return;
        }
        field509 = arg0;
        field519 = arg1;
        field513 = arg2;
        field508 = arg3;
        GL var4 = class47.field592;
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
