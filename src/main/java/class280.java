import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class280 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "[F")
    private static float[] field4249 = new float[4];

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "[F")
    public static float[] field4254 = new float[4];

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "F")
    private static float field4252 = -1.0F;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    private static int field4256 = -1;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field4255 = 13156520;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    private static int field4248 = -1;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "[F")
    public static float[] field4251 = new float[4];

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    private static int field4258 = -1;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "F")
    private static float field4257 = -1.0F;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field4260 = 16777215;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "F")
    private static float field4259;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()F", line = 7)
    public static final float method1950() {
        return field4252;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "()V", line = 16)
    public static final void method1951() {
        GL var0 = class117.field1801;
        var0.glLightfv(16384, 4611, field4251, 0);
        var0.glLightfv(16385, 4611, field4249, 0);
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "()V", line = 25)
    public static void method1952() {
        field4251 = null;
        field4249 = null;
        field4254 = null;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "()F", line = 32)
    public static final float method1953() {
        return field4259;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([F)V", line = 35)
    public static final void method1954(float[] arg0) {
        if (arg0 == null) {
            arg0 = field4254;
        }
        GL var1 = class117.field1801;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "()V", line = 69)
    public static final void method1955() {
        GL var0 = class117.field1801;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field4248 = -1;
        field4258 = -1;
        method1959();
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "()I", line = 88)
    public static final int method1956() {
        return field4248;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V", line = 91)
    public static final void method1957(int arg0, int arg1) {
        if (field4258 == arg0 && field4256 == arg1) {
            return;
        }
        field4258 = arg0;
        field4256 = arg1;
        GL var2 = class117.field1801;
        byte var3 = 50;
        short var4 = 3584;
        field4254[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field4254[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field4254[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field4254, 0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFF)V", line = 118)
    public static final void method1958(float arg0, float arg1, float arg2) {
        if (field4251[0] == arg0 && field4251[1] == arg1 && field4251[2] == arg2) {
            return;
        }
        field4251[0] = arg0;
        field4251[1] = arg1;
        field4251[2] = arg2;
        field4249[0] = -arg0;
        field4249[1] = -arg1;
        field4249[2] = -arg2;
        field4250 = (int) (arg0 * 256.0F / arg1);
        field4253 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "()V", line = 131)
    private static final void method1959() {
        method1960(field4260, 1.1523438F, 0.69921875F, 1.2F);
        method1958(-50.0F, -60.0F, -50.0F);
        method1957(field4255, 0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IFFF)V", line = 147)
    public static final void method1960(int arg0, float arg1, float arg2, float arg3) {
        if (field4248 == arg0 && field4259 == arg1 && field4252 == arg2 && field4257 == arg3) {
            return;
        }
        field4248 = arg0;
        field4259 = arg1;
        field4252 = arg2;
        field4257 = arg3;
        GL var4 = class117.field1801;
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
