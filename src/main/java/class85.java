import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class85 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "F")
    private static float field1522 = -1.0F;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    private static int field1523 = -1;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "[F")
    public static float[] field1529 = new float[4];

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1524 = 13156520;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "F")
    private static float field1520 = -1.0F;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "[F")
    public static float[] field1530 = new float[4];

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    private static int field1527 = -1;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "[F")
    private static float[] field1526 = new float[4];

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    private static int field1531 = -1;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1528 = 16777215;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "F")
    private static float field1521;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(FFF)V", line = 9)
    public static final void method588(float arg0, float arg1, float arg2) {
        if (field1529[0] == arg0 && field1529[1] == arg1 && field1529[2] == arg2) {
            return;
        }
        field1529[0] = arg0;
        field1529[1] = arg1;
        field1529[2] = arg2;
        field1526[0] = -arg0;
        field1526[1] = -arg1;
        field1526[2] = -arg2;
        field1525 = (int) (arg0 * 256.0F / arg1);
        field1532 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V", line = 30)
    private static final void method589() {
        method592(field1528, 1.1523438F, 0.69921875F, 1.2F);
        method588(-50.0F, -60.0F, -50.0F);
        method594(field1524, 0);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()F", line = 35)
    public static final float method590() {
        return field1520;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()V", line = 39)
    public static final void method591() {
        GL var0 = class147.field2479;
        var0.glLightfv(16384, 4611, field1529, 0);
        var0.glLightfv(16385, 4611, field1526, 0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IFFF)V", line = 53)
    public static final void method592(int arg0, float arg1, float arg2, float arg3) {
        if (field1531 == arg0 && field1521 == arg1 && field1520 == arg2 && field1522 == arg3) {
            return;
        }
        field1531 = arg0;
        field1521 = arg1;
        field1520 = arg2;
        field1522 = arg3;
        GL var4 = class147.field2479;
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

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "()V", line = 82)
    public static final void method593() {
        GL var0 = class147.field2479;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field1531 = -1;
        field1527 = -1;
        method589();
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V", line = 103)
    public static final void method594(int arg0, int arg1) {
        if (field1527 == arg0 && field1523 == arg1) {
            return;
        }
        field1527 = arg0;
        field1523 = arg1;
        GL var2 = class147.field2479;
        byte var3 = 50;
        short var4 = 3584;
        field1530[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field1530[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field1530[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field1530, 0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([F)V", line = 133)
    public static final void method595(float[] arg0) {
        if (arg0 == null) {
            arg0 = field1530;
        }
        GL var1 = class147.field2479;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "()I", line = 142)
    public static final int method596() {
        return field1531;
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "()V", line = 145)
    public static void method597() {
        field1529 = null;
        field1526 = null;
        field1530 = null;
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "()F", line = 160)
    public static final float method598() {
        return field1521;
    }
}
