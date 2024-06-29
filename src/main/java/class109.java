import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1628 = 13156520;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    private static int field1634 = -1;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    private static int field1629 = -1;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "F")
    private static float field1635 = -1.0F;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1632 = 16777215;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "[F")
    private static float[] field1636 = new float[4];

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[F")
    public static float[] field1637 = new float[4];

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    private static int field1638 = -1;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "F")
    private static float field1639 = -1.0F;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "[F")
    public static float[] field1640 = new float[4];

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "F")
    private static float field1631;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()F", line = 4)
    public static final float method747() {
        return field1631;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(FFF)V", line = 8)
    public static final void method748(float arg0, float arg1, float arg2) {
        if (field1637[0] == arg0 && field1637[1] == arg1 && field1637[2] == arg2) {
            return;
        }
        field1637[0] = arg0;
        field1637[1] = arg1;
        field1637[2] = arg2;
        field1636[0] = -arg0;
        field1636[1] = -arg1;
        field1636[2] = -arg2;
        field1630 = (int) (arg0 * 256.0F / arg1);
        field1633 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([F)V", line = 25)
    public static final void method749(float[] arg0) {
        if (arg0 == null) {
            arg0 = field1640;
        }
        GL var1 = class186.field2990;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()V", line = 33)
    public static void method750() {
        field1637 = null;
        field1636 = null;
        field1640 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)V", line = 39)
    public static final void method751(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field1634 == arg0 && field1629 == arg1) {
            return;
        }
        field1634 = arg0;
        field1629 = arg1;
        GL var3 = class186.field2990;
        byte var4 = 50;
        short var5 = 3584;
        field1640[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field1640[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field1640[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field1640, 0);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()V", line = 69)
    public static final void method752() {
        GL var0 = class186.field2990;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field1638 = -1;
        field1634 = -1;
        method754();
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "()V", line = 87)
    public static final void method753() {
        GL var0 = class186.field2990;
        var0.glLightfv(16384, 4611, field1637, 0);
        var0.glLightfv(16385, 4611, field1636, 0);
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "()V", line = 99)
    private static final void method754() {
        method755(field1632, 1.1523438F, 0.69921875F, 1.2F);
        method748(-50.0F, -60.0F, -50.0F);
        method751(field1628, 0, false);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IFFF)V", line = 115)
    public static final void method755(int arg0, float arg1, float arg2, float arg3) {
        if (field1638 == arg0 && field1631 == arg1 && field1639 == arg2 && field1635 == arg3) {
            return;
        }
        field1638 = arg0;
        field1631 = arg1;
        field1639 = arg2;
        field1635 = arg3;
        GL var4 = class186.field2990;
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

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "()I", line = 158)
    public static final int method756() {
        return field1638;
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "()F", line = 167)
    public static final float method757() {
        return field1639;
    }
}
