import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class34 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field390 = 13156520;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[F")
    private static float[] field398 = new float[4];

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field396 = 16777215;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    private static int field393 = -1;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    private static int field395 = -1;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "F")
    private static float field399 = -1.0F;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "F")
    private static float field392 = -1.0F;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "[F")
    public static float[] field400 = new float[4];

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "[F")
    public static float[] field402 = new float[4];

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    private static int field401 = -1;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "F")
    private static float field397;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(FFF)V", line = 7)
    public static final void method161(float arg0, float arg1, float arg2) {
        if (field402[0] == arg0 && field402[1] == arg1 && field402[2] == arg2) {
            return;
        }
        field402[0] = arg0;
        field402[1] = arg1;
        field402[2] = arg2;
        field398[0] = -arg0;
        field398[1] = -arg1;
        field398[2] = -arg2;
        field391 = (int) (arg0 * 256.0F / arg1);
        field394 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V", line = 24)
    public static final void method162(int arg0, int arg1) {
        if (field401 == arg0 && field393 == arg1) {
            return;
        }
        field401 = arg0;
        field393 = arg1;
        GL var2 = class90.field1390;
        byte var3 = 50;
        short var4 = 3584;
        field400[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field400[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field400[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field400, 0);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()F", line = 52)
    public static final float method163() {
        return field397;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()V", line = 59)
    public static final void method164() {
        method167(field396, 1.1523438F, 0.69921875F, 1.2F);
        method161(-50.0F, -60.0F, -50.0F);
        method162(field390, 0);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "()F", line = 69)
    public static final float method165() {
        return field399;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "()V", line = 72)
    public static void method166() {
        field402 = null;
        field398 = null;
        field400 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IFFF)V", line = 79)
    public static final void method167(int arg0, float arg1, float arg2, float arg3) {
        if (field395 == arg0 && field397 == arg1 && field399 == arg2 && field392 == arg3) {
            return;
        }
        field395 = arg0;
        field397 = arg1;
        field399 = arg2;
        field392 = arg3;
        GL var4 = class90.field1390;
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

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "()I", line = 112)
    public static final int method168() {
        return field395;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "()V", line = 123)
    public static final void method169() {
        GL var0 = class90.field1390;
        var0.glLightfv(16384, 4611, field402, 0);
        var0.glLightfv(16385, 4611, field398, 0);
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "()V", line = 136)
    public static final void method170() {
        GL var0 = class90.field1390;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field395 = -1;
        field401 = -1;
        method164();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([F)V", line = 152)
    public static final void method171(float[] arg0) {
        if (arg0 == null) {
            arg0 = field400;
        }
        GL var1 = class90.field1390;
        var1.glFogfv(2918, arg0, 0);
    }
}
