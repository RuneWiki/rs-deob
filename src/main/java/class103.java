import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class103 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[F")
    public static float[] field1540 = new float[4];

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "F")
    private static float field1541 = -1.0F;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    private static int field1542 = -1;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field1545 = 13156520;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    private static int field1544 = -1;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "F")
    private static float field1543 = -1.0F;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    private static int field1550 = -1;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "[F")
    private static float[] field1547 = new float[4];

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "[F")
    public static float[] field1549 = new float[4];

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field1551 = 16777215;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "F")
    private static float field1548;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V", line = 14)
    public static final void method888() {
        GL var0 = class240.field3771;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field1550 = -1;
        field1542 = -1;
        method894();
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()F", line = 32)
    public static final float method889() {
        return field1543;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "()V", line = 35)
    public static void method890() {
        field1549 = null;
        field1547 = null;
        field1540 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([F)V", line = 41)
    public static final void method891(float[] arg0) {
        if (arg0 == null) {
            arg0 = field1540;
        }
        GL var1 = class240.field3771;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "()V", line = 51)
    public static final void method892() {
        GL var0 = class240.field3771;
        var0.glLightfv(16384, 4611, field1549, 0);
        var0.glLightfv(16385, 4611, field1547, 0);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(FFF)V", line = 61)
    public static final void method893(float arg0, float arg1, float arg2) {
        if (field1549[0] == arg0 && field1549[1] == arg1 && field1549[2] == arg2) {
            return;
        }
        field1549[0] = arg0;
        field1549[1] = arg1;
        field1549[2] = arg2;
        field1547[0] = -arg0;
        field1547[1] = -arg1;
        field1547[2] = -arg2;
        field1539 = (int) (arg0 * 256.0F / arg1);
        field1546 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "()V", line = 75)
    private static final void method894() {
        method898(field1551, 1.1523438F, 0.69921875F, 1.2F);
        method893(-50.0F, -60.0F, -50.0F);
        method896(field1545, 0, false);
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "()I", line = 88)
    public static final int method895() {
        return field1550;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)V", line = 94)
    public static final void method896(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field1542 == arg0 && field1544 == arg1) {
            return;
        }
        field1542 = arg0;
        field1544 = arg1;
        GL var3 = class240.field3771;
        byte var4 = 50;
        short var5 = 3584;
        field1540[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field1540[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field1540[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field1540, 0);
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "()F", line = 130)
    public static final float method897() {
        return field1548;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IFFF)V", line = 142)
    public static final void method898(int arg0, float arg1, float arg2, float arg3) {
        if (field1550 == arg0 && field1548 == arg1 && field1543 == arg2 && field1541 == arg3) {
            return;
        }
        field1550 = arg0;
        field1548 = arg1;
        field1543 = arg2;
        field1541 = arg3;
        GL var4 = class240.field3771;
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
