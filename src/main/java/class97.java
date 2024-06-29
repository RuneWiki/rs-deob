import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class97 {

    @OriginalMember(owner = "client!q", name = "c", descriptor = "F")
    private static float field1611 = -1.0F;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    private static int field1615 = -1;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "F")
    private static float field1617 = -1.0F;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field1616 = 16777215;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[F")
    private static float[] field1613 = new float[4];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field1609 = 13156520;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "[F")
    public static float[] field1619 = new float[4];

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    private static int field1621 = -1;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "[F")
    public static float[] field1620 = new float[4];

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    private static int field1618 = -1;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "F")
    private static float field1610;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V", line = 9)
    private static final void method700() {
        method707(field1616, 1.1523438F, 0.69921875F, 1.2F);
        method709(-50.0F, -60.0F, -50.0F);
        method701(field1609, 0);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V", line = 23)
    public static final void method701(int arg0, int arg1) {
        if (field1621 == arg0 && field1615 == arg1) {
            return;
        }
        field1621 = arg0;
        field1615 = arg1;
        GL var2 = class265.field4099;
        byte var3 = 50;
        short var4 = 3584;
        field1619[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field1619[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field1619[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field1619, 0);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([F)V", line = 50)
    public static final void method702(float[] arg0) {
        if (arg0 == null) {
            arg0 = field1619;
        }
        GL var1 = class265.field4099;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()F", line = 64)
    public static final float method703() {
        return field1610;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "()I", line = 69)
    public static final int method704() {
        return field1618;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "()V", line = 72)
    public static void method705() {
        field1620 = null;
        field1613 = null;
        field1619 = null;
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "()F", line = 88)
    public static final float method706() {
        return field1611;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IFFF)V", line = 92)
    public static final void method707(int arg0, float arg1, float arg2, float arg3) {
        if (field1618 == arg0 && field1610 == arg1 && field1611 == arg2 && field1617 == arg3) {
            return;
        }
        field1618 = arg0;
        field1610 = arg1;
        field1611 = arg2;
        field1617 = arg3;
        GL var4 = class265.field4099;
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

    @OriginalMember(owner = "client!q", name = "f", descriptor = "()V", line = 122)
    public static final void method708() {
        GL var0 = class265.field4099;
        var0.glLightfv(16384, 4611, field1620, 0);
        var0.glLightfv(16385, 4611, field1613, 0);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FFF)V", line = 128)
    public static final void method709(float arg0, float arg1, float arg2) {
        if (field1620[0] == arg0 && field1620[1] == arg1 && field1620[2] == arg2) {
            return;
        }
        field1620[0] = arg0;
        field1620[1] = arg1;
        field1620[2] = arg2;
        field1613[0] = -arg0;
        field1613[1] = -arg1;
        field1613[2] = -arg2;
        field1614 = (int) (arg0 * 256.0F / arg1);
        field1612 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!q", name = "g", descriptor = "()V", line = 142)
    public static final void method710() {
        GL var0 = class265.field4099;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field1618 = -1;
        field1621 = -1;
        method700();
    }
}
