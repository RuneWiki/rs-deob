import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class231 {

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    private static int field3857 = -1;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field3859 = 13156520;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "[F")
    public static float[] field3864 = new float[4];

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "[F")
    public static float[] field3866 = new float[4];

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "F")
    private static float field3867 = -1.0F;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    private static int field3858 = -1;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field3861 = 16777215;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "F")
    private static float field3856 = -1.0F;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "[F")
    private static float[] field3862 = new float[4];

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    private static int field3863 = -1;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "F")
    private static float field3865;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IFFF)V", line = 7)
    public static final void method1690(int arg0, float arg1, float arg2, float arg3) {
        if (field3858 == arg0 && field3865 == arg1 && field3856 == arg2 && field3867 == arg3) {
            return;
        }
        field3858 = arg0;
        field3865 = arg1;
        field3856 = arg2;
        field3867 = arg3;
        GL var4 = class271.field4641;
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

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()V", line = 36)
    public static final void method1691() {
        GL var0 = class271.field4641;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field3858 = -1;
        field3863 = -1;
        method1699();
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(FFF)V", line = 53)
    public static final void method1692(float arg0, float arg1, float arg2) {
        if (field3866[0] == arg0 && field3866[1] == arg1 && field3866[2] == arg2) {
            return;
        }
        field3866[0] = arg0;
        field3866[1] = arg1;
        field3866[2] = arg2;
        field3862[0] = -arg0;
        field3862[1] = -arg1;
        field3862[2] = -arg2;
        field3855 = (int) (arg0 * 256.0F / arg1);
        field3860 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([F)V", line = 71)
    public static final void method1693(float[] arg0) {
        if (arg0 == null) {
            arg0 = field3864;
        }
        GL var1 = class271.field4641;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "()I", line = 81)
    public static final int method1694() {
        return field3858;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "()F", line = 87)
    public static final float method1695() {
        return field3856;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V", line = 91)
    public static final void method1696(int arg0, int arg1) {
        if (field3863 == arg0 && field3857 == arg1) {
            return;
        }
        field3863 = arg0;
        field3857 = arg1;
        GL var2 = class271.field4641;
        byte var3 = 50;
        short var4 = 3584;
        field3864[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field3864[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field3864[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field3864, 0);
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "()V", line = 119)
    public static void method1697() {
        field3866 = null;
        field3862 = null;
        field3864 = null;
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "()F", line = 127)
    public static final float method1698() {
        return field3865;
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "()V", line = 137)
    private static final void method1699() {
        method1690(field3861, 1.1523438F, 0.69921875F, 1.2F);
        method1692(-50.0F, -60.0F, -50.0F);
        method1696(field3859, 0);
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "()V", line = 153)
    public static final void method1700() {
        GL var0 = class271.field4641;
        var0.glLightfv(16384, 4611, field3866, 0);
        var0.glLightfv(16385, 4611, field3862, 0);
    }
}
