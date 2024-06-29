import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class115 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field1597 = 16777215;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "[F")
    public static float[] field1602 = new float[4];

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "F")
    private static float field1598 = -1.0F;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    private static int field1604 = -1;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "F")
    private static float field1603 = -1.0F;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    private static int field1606 = -1;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field1601 = 13156520;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    private static int field1607 = -1;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "[F")
    private static float[] field1605 = new float[4];

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "[F")
    public static float[] field1609 = new float[4];

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "F")
    private static float field1600;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIZ)V", line = 4)
    public static final void method807(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field1606 == arg0 && field1607 == arg1) {
            return;
        }
        field1606 = arg0;
        field1607 = arg1;
        GL var3 = class109.field1456;
        byte var4 = 50;
        short var5 = 3584;
        field1602[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field1602[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field1602[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field1602, 0);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFF)V", line = 34)
    public static final void method808(float arg0, float arg1, float arg2) {
        if (field1609[0] == arg0 && field1609[1] == arg1 && field1609[2] == arg2) {
            return;
        }
        field1609[0] = arg0;
        field1609[1] = arg1;
        field1609[2] = arg2;
        field1605[0] = -arg0;
        field1605[1] = -arg1;
        field1605[2] = -arg2;
        field1608 = (int) (arg0 * 256.0F / arg1);
        field1599 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "()V", line = 47)
    private static final void method809() {
        method811(field1597, 1.1523438F, 0.69921875F, 1.2F);
        method808(-50.0F, -60.0F, -50.0F);
        method807(field1601, 0, false);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "()V", line = 57)
    public static final void method810() {
        GL var0 = class109.field1456;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field1604 = -1;
        field1606 = -1;
        method809();
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IFFF)V", line = 73)
    public static final void method811(int arg0, float arg1, float arg2, float arg3) {
        if (field1604 == arg0 && field1600 == arg1 && field1598 == arg2 && field1603 == arg3) {
            return;
        }
        field1604 = arg0;
        field1600 = arg1;
        field1598 = arg2;
        field1603 = arg3;
        GL var4 = class109.field1456;
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

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "()F", line = 101)
    public static final float method812() {
        return field1600;
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "()F", line = 110)
    public static final float method813() {
        return field1598;
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "()I", line = 115)
    public static final int method814() {
        return field1604;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([F)V", line = 121)
    public static final void method815(float[] arg0) {
        if (arg0 == null) {
            arg0 = field1602;
        }
        GL var1 = class109.field1456;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "()V", line = 141)
    public static final void method816() {
        GL var0 = class109.field1456;
        var0.glLightfv(16384, 4611, field1609, 0);
        var0.glLightfv(16385, 4611, field1605, 0);
    }

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "()V", line = 154)
    public static void method817() {
        field1609 = null;
        field1605 = null;
        field1602 = null;
    }
}
