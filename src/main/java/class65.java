import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class65 {

    @OriginalMember(owner = "client!g", name = "d", descriptor = "[F")
    public static float[] field1239 = new float[4];

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    private static int field1240 = -1;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "F")
    private static float field1237 = -1.0F;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1238 = 13156520;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    private static int field1241 = -1;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "F")
    private static float field1236 = -1.0F;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    private static int field1245 = -1;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "[F")
    public static float[] field1242 = new float[4];

    @OriginalMember(owner = "client!g", name = "m", descriptor = "[F")
    private static float[] field1248 = new float[4];

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field1247 = 16777215;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "F")
    private static float field1244;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(FFF)V", line = 5)
    public static final void method494(float arg0, float arg1, float arg2) {
        if (field1242[0] == arg0 && field1242[1] == arg1 && field1242[2] == arg2) {
            return;
        }
        field1242[0] = arg0;
        field1242[1] = arg1;
        field1242[2] = arg2;
        field1248[0] = -arg0;
        field1248[1] = -arg1;
        field1248[2] = -arg2;
        field1243 = (int) (arg0 * 256.0F / arg1);
        field1246 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()V", line = 19)
    public static final void method495() {
        GL var0 = class249.field3898;
        var0.glLightfv(16384, 4611, field1242, 0);
        var0.glLightfv(16385, 4611, field1248, 0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([F)V", line = 35)
    public static final void method496(float[] arg0) {
        if (arg0 == null) {
            arg0 = field1239;
        }
        GL var1 = class249.field3898;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "()V", line = 44)
    public static final void method497() {
        GL var0 = class249.field3898;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field1245 = -1;
        field1241 = -1;
        method499();
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "()I", line = 60)
    public static final int method498() {
        return field1245;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "()V", line = 67)
    private static final void method499() {
        method502(field1247, 1.1523438F, 0.69921875F, 1.2F);
        method494(-50.0F, -60.0F, -50.0F);
        method501(field1238, 0, false);
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "()F", line = 73)
    public static final float method500() {
        return field1236;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZ)V", line = 79)
    public static final void method501(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field1241 == arg0 && field1240 == arg1) {
            return;
        }
        field1241 = arg0;
        field1240 = arg1;
        GL var3 = class249.field3898;
        byte var4 = 50;
        short var5 = 3584;
        field1239[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field1239[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field1239[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field1239, 0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IFFF)V", line = 112)
    public static final void method502(int arg0, float arg1, float arg2, float arg3) {
        if (field1245 == arg0 && field1244 == arg1 && field1236 == arg2 && field1237 == arg3) {
            return;
        }
        field1245 = arg0;
        field1244 = arg1;
        field1236 = arg2;
        field1237 = arg3;
        GL var4 = class249.field3898;
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

    @OriginalMember(owner = "client!g", name = "f", descriptor = "()F", line = 149)
    public static final float method503() {
        return field1244;
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "()V", line = 162)
    public static void method504() {
        field1242 = null;
        field1248 = null;
        field1239 = null;
    }
}
