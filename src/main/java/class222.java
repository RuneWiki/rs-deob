import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class222 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[F")
    public static float[] field3330 = new float[4];

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    private static int field3333 = -1;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    private static int field3332 = -1;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "F")
    private static float field3334 = -1.0F;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "F")
    private static float field3335 = -1.0F;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field3339 = 16777215;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field3338 = 13156520;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "[F")
    public static float[] field3340 = new float[4];

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "[F")
    private static float[] field3337 = new float[4];

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    private static int field3341 = -1;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "F")
    private static float field3331;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)V", line = 14)
    public static final void method1621(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field3341 == arg0 && field3332 == arg1) {
            return;
        }
        field3341 = arg0;
        field3332 = arg1;
        GL var3 = class141.field2025;
        byte var4 = 50;
        short var5 = 3584;
        field3340[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field3340[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field3340[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field3340, 0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()F", line = 46)
    public static final float method1622() {
        return field3331;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V", line = 51)
    public static final void method1623() {
        GL var0 = class141.field2025;
        var0.glLightfv(16384, 4611, field3330, 0);
        var0.glLightfv(16385, 4611, field3337, 0);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V", line = 56)
    public static void method1624() {
        field3330 = null;
        field3337 = null;
        field3340 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V", line = 64)
    public static final void method1625(float arg0, float arg1, float arg2) {
        if (field3330[0] == arg0 && field3330[1] == arg1 && field3330[2] == arg2) {
            return;
        }
        field3330[0] = arg0;
        field3330[1] = arg1;
        field3330[2] = arg2;
        field3337[0] = -arg0;
        field3337[1] = -arg1;
        field3337[2] = -arg2;
        field3329 = (int) (arg0 * 256.0F / arg1);
        field3336 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()V", line = 80)
    public static final void method1626() {
        GL var0 = class141.field2025;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field3333 = -1;
        field3341 = -1;
        method1629();
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()F", line = 102)
    public static final float method1627() {
        return field3334;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([F)V", line = 105)
    public static final void method1628(float[] arg0) {
        if (arg0 == null) {
            arg0 = field3340;
        }
        GL var1 = class141.field2025;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()V", line = 129)
    private static final void method1629() {
        method1630(field3339, 1.1523438F, 0.69921875F, 1.2F);
        method1625(-50.0F, -60.0F, -50.0F);
        method1621(field3338, 0, false);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IFFF)V", line = 140)
    public static final void method1630(int arg0, float arg1, float arg2, float arg3) {
        if (field3333 == arg0 && field3331 == arg1 && field3334 == arg2 && field3335 == arg3) {
            return;
        }
        field3333 = arg0;
        field3331 = arg1;
        field3334 = arg2;
        field3335 = arg3;
        GL var4 = class141.field2025;
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

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "()I", line = 170)
    public static final int method1631() {
        return field3333;
    }
}
