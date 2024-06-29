import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class59 {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    private static int field809 = -1;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "[F")
    public static float[] field811 = new float[4];

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field813 = 16777215;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field812 = 13156520;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    private static int field807 = -1;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "[F")
    public static float[] field814 = new float[4];

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    private static int field810 = -1;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "F")
    private static float field816 = -1.0F;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "F")
    private static float field818 = -1.0F;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "[F")
    private static float[] field819 = new float[4];

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "F")
    private static float field815;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V", line = 4)
    public static final void method382(int arg0, int arg1) {
        if (field809 == arg0 && field807 == arg1) {
            return;
        }
        field809 = arg0;
        field807 = arg1;
        GL var2 = class167.field2806;
        byte var3 = 50;
        short var4 = 3584;
        field814[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field814[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field814[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field814, 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()F", line = 33)
    public static final float method383() {
        return field815;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()V", line = 36)
    public static void method384() {
        field811 = null;
        field819 = null;
        field814 = null;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "()I", line = 47)
    public static final int method385() {
        return field810;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(FFF)V", line = 50)
    public static final void method386(float arg0, float arg1, float arg2) {
        if (field811[0] == arg0 && field811[1] == arg1 && field811[2] == arg2) {
            return;
        }
        field811[0] = arg0;
        field811[1] = arg1;
        field811[2] = arg2;
        field819[0] = -arg0;
        field819[1] = -arg1;
        field819[2] = -arg2;
        field808 = (int) (arg0 * 256.0F / arg1);
        field817 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "()V", line = 70)
    public static final void method387() {
        GL var0 = class167.field2806;
        var0.glLightfv(16384, 4611, field811, 0);
        var0.glLightfv(16385, 4611, field819, 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([F)V", line = 75)
    public static final void method388(float[] arg0) {
        if (arg0 == null) {
            arg0 = field814;
        }
        GL var1 = class167.field2806;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IFFF)V", line = 83)
    public static final void method389(int arg0, float arg1, float arg2, float arg3) {
        if (field810 == arg0 && field815 == arg1 && field818 == arg2 && field816 == arg3) {
            return;
        }
        field810 = arg0;
        field815 = arg1;
        field818 = arg2;
        field816 = arg3;
        GL var4 = class167.field2806;
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

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "()V", line = 114)
    public static final void method390() {
        GL var0 = class167.field2806;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field810 = -1;
        field809 = -1;
        method392();
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "()F", line = 148)
    public static final float method391() {
        return field818;
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "()V", line = 155)
    public static final void method392() {
        method389(field813, 1.1523438F, 0.69921875F, 1.2F);
        method386(-50.0F, -60.0F, -50.0F);
        method382(field812, 0);
    }
}
