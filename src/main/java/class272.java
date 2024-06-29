import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class272 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "[F")
    public static float[] field4683 = new float[4];

    @OriginalMember(owner = "client!j", name = "d", descriptor = "[F")
    private static float[] field4686 = new float[4];

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field4689 = 13156520;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    private static int field4688 = -1;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "F")
    private static float field4690 = -1.0F;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    private static int field4693 = -1;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "[F")
    public static float[] field4687 = new float[4];

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    private static int field4692 = -1;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "F")
    private static float field4695 = -1.0F;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field4691 = 16777215;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "F")
    private static float field4685;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IFFF)V", line = 6)
    public static final void method1896(int arg0, float arg1, float arg2, float arg3) {
        if (field4692 == arg0 && field4685 == arg1 && field4690 == arg2 && field4695 == arg3) {
            return;
        }
        field4692 = arg0;
        field4685 = arg1;
        field4690 = arg2;
        field4695 = arg3;
        GL var4 = class281.field4839;
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

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V", line = 34)
    public static void method1897() {
        field4683 = null;
        field4686 = null;
        field4687 = null;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()F", line = 40)
    public static final float method1898() {
        return field4685;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()V", line = 44)
    public static final void method1899() {
        method1896(field4691, 1.1523438F, 0.69921875F, 1.2F);
        method1903(-50.0F, -60.0F, -50.0F);
        method1906(field4689, 0);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()V", line = 53)
    public static final void method1900() {
        GL var0 = class281.field4839;
        var0.glLightfv(16384, 4611, field4683, 0);
        var0.glLightfv(16385, 4611, field4686, 0);
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "()F", line = 59)
    public static final float method1901() {
        return field4690;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "()I", line = 63)
    public static final int method1902() {
        return field4692;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFF)V", line = 67)
    public static final void method1903(float arg0, float arg1, float arg2) {
        if (field4683[0] == arg0 && field4683[1] == arg1 && field4683[2] == arg2) {
            return;
        }
        field4683[0] = arg0;
        field4683[1] = arg1;
        field4683[2] = arg2;
        field4686[0] = -arg0;
        field4686[1] = -arg1;
        field4686[2] = -arg2;
        field4684 = (int) (arg0 * 256.0F / arg1);
        field4694 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "()V", line = 82)
    public static final void method1904() {
        GL var0 = class281.field4839;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field4692 = -1;
        field4693 = -1;
        method1899();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([F)V", line = 107)
    public static final void method1905(float[] arg0) {
        if (arg0 == null) {
            arg0 = field4687;
        }
        GL var1 = class281.field4839;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V", line = 129)
    public static final void method1906(int arg0, int arg1) {
        if (field4693 == arg0 && field4688 == arg1) {
            return;
        }
        field4693 = arg0;
        field4688 = arg1;
        GL var2 = class281.field4839;
        byte var3 = 50;
        short var4 = 3584;
        field4687[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field4687[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field4687[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field4687, 0);
    }
}
