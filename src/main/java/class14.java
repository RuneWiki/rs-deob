import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class14 {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[F")
    private static float[] field188 = new float[4];

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    private static int field190 = -1;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "F")
    private static float field191 = -1.0F;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "[F")
    public static float[] field193 = new float[4];

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "[F")
    public static float[] field194 = new float[4];

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    private static int field195 = -1;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "F")
    private static float field197 = -1.0F;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field198 = 16777215;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    private static int field196 = -1;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field186 = 13156520;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "F")
    private static float field187;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V", line = 4)
    public static void method84() {
        field194 = null;
        field188 = null;
        field193 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "()F", line = 11)
    public static final float method85() {
        return field187;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "()V", line = 15)
    private static final void method86() {
        method93(field198, 1.1523438F, 0.69921875F, 1.2F);
        method88(-50.0F, -60.0F, -50.0F);
        method87(field186, 0);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V", line = 23)
    public static final void method87(int arg0, int arg1) {
        if (field195 == arg0 && field196 == arg1) {
            return;
        }
        field195 = arg0;
        field196 = arg1;
        GL var2 = class217.field3551;
        byte var3 = 50;
        short var4 = 3584;
        field193[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field193[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field193[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field193, 0);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFF)V", line = 50)
    public static final void method88(float arg0, float arg1, float arg2) {
        if (field194[0] == arg0 && field194[1] == arg1 && field194[2] == arg2) {
            return;
        }
        field194[0] = arg0;
        field194[1] = arg1;
        field194[2] = arg2;
        field188[0] = -arg0;
        field188[1] = -arg1;
        field188[2] = -arg2;
        field192 = (int) (arg0 * 256.0F / arg1);
        field189 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "()F", line = 63)
    public static final float method89() {
        return field191;
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "()V", line = 77)
    public static final void method90() {
        GL var0 = class217.field3551;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field190 = -1;
        field195 = -1;
        method86();
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "()V", line = 99)
    public static final void method91() {
        GL var0 = class217.field3551;
        var0.glLightfv(16384, 4611, field194, 0);
        var0.glLightfv(16385, 4611, field188, 0);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([F)V", line = 110)
    public static final void method92(float[] arg0) {
        if (arg0 == null) {
            arg0 = field193;
        }
        GL var1 = class217.field3551;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IFFF)V", line = 124)
    public static final void method93(int arg0, float arg1, float arg2, float arg3) {
        if (field190 == arg0 && field187 == arg1 && field191 == arg2 && field197 == arg3) {
            return;
        }
        field190 = arg0;
        field187 = arg1;
        field191 = arg2;
        field197 = arg3;
        GL var4 = class217.field3551;
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

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "()I", line = 152)
    public static final int method94() {
        return field190;
    }
}
