import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class169 {

    @OriginalMember(owner = "client!we", name = "b", descriptor = "F")
    private static float field2993 = -1.0F;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[F")
    private static float[] field2995 = new float[4];

    @OriginalMember(owner = "client!we", name = "g", descriptor = "F")
    private static float field2998 = -1.0F;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    private static int field2999 = -1;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[F")
    public static float[] field2994 = new float[4];

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field2997 = 16777215;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    private static int field3002 = -1;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field2996 = 13156520;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    private static int field3004 = -1;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "[F")
    public static float[] field3000 = new float[4];

    @OriginalMember(owner = "client!we", name = "a", descriptor = "F")
    private static float field2992;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()F", line = 4)
    public static final float method1226() {
        return field2998;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IFFF)V", line = 7)
    public static final void method1227(int arg0, float arg1, float arg2, float arg3) {
        if (field3004 == arg0 && field2992 == arg1 && field2998 == arg2 && field2993 == arg3) {
            return;
        }
        field3004 = arg0;
        field2992 = arg1;
        field2998 = arg2;
        field2993 = arg3;
        GL var4 = class253.field4319;
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

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()F", line = 37)
    public static final float method1228() {
        return field2992;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "()V", line = 41)
    private static final void method1229() {
        method1227(field2997, 1.1523438F, 0.69921875F, 1.2F);
        method1230(-50.0F, -60.0F, -50.0F);
        method1233(field2996, 0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(FFF)V", line = 56)
    public static final void method1230(float arg0, float arg1, float arg2) {
        if (field3000[0] == arg0 && field3000[1] == arg1 && field3000[2] == arg2) {
            return;
        }
        field3000[0] = arg0;
        field3000[1] = arg1;
        field3000[2] = arg2;
        field2995[0] = -arg0;
        field2995[1] = -arg1;
        field2995[2] = -arg2;
        field3003 = (int) (arg0 * 256.0F / arg1);
        field3001 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "()V", line = 69)
    public static void method1231() {
        field3000 = null;
        field2995 = null;
        field2994 = null;
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "()V", line = 75)
    public static final void method1232() {
        GL var0 = class253.field4319;
        var0.glLightfv(16384, 4611, field3000, 0);
        var0.glLightfv(16385, 4611, field2995, 0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V", line = 80)
    public static final void method1233(int arg0, int arg1) {
        if (field3002 == arg0 && field2999 == arg1) {
            return;
        }
        field3002 = arg0;
        field2999 = arg1;
        GL var2 = class253.field4319;
        byte var3 = 50;
        short var4 = 3584;
        field2994[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field2994[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field2994[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field2994, 0);
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "()V", line = 109)
    public static final void method1234() {
        GL var0 = class253.field4319;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field3004 = -1;
        field3002 = -1;
        method1229();
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "()I", line = 142)
    public static final int method1235() {
        return field3004;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([F)V", line = 153)
    public static final void method1236(float[] arg0) {
        if (arg0 == null) {
            arg0 = field2994;
        }
        GL var1 = class253.field4319;
        var1.glFogfv(2918, arg0, 0);
    }
}
