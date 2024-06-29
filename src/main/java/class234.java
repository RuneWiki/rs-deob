import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class234 {

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "[F")
    public static float[] field3721 = new float[4];

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "F")
    private static float field3723 = -1.0F;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    private static int field3722 = -1;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "[F")
    private static float[] field3726 = new float[4];

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    private static int field3720 = -1;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "[F")
    public static float[] field3727 = new float[4];

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    private static int field3729 = -1;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field3730 = 16777215;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field3724 = 13156520;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "F")
    private static float field3719 = -1.0F;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "F")
    private static float field3728;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()F", line = 4)
    public static final float method1611() {
        return field3728;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()F", line = 9)
    public static final float method1612() {
        return field3723;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "()I", line = 12)
    public static final int method1613() {
        return field3729;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "()V", line = 15)
    private static final void method1614() {
        method1620(field3730, 1.1523438F, 0.69921875F, 1.2F);
        method1617(-50.0F, -60.0F, -50.0F);
        method1616(field3724, 0, false);
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "()V", line = 26)
    public static final void method1615() {
        GL var0 = class245.field3884;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field3729 = -1;
        field3720 = -1;
        method1614();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIZ)V", line = 43)
    public static final void method1616(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field3720 == arg0 && field3722 == arg1) {
            return;
        }
        field3720 = arg0;
        field3722 = arg1;
        GL var3 = class245.field3884;
        byte var4 = 50;
        short var5 = 3584;
        field3721[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field3721[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field3721[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field3721, 0);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(FFF)V", line = 76)
    public static final void method1617(float arg0, float arg1, float arg2) {
        if (field3727[0] == arg0 && field3727[1] == arg1 && field3727[2] == arg2) {
            return;
        }
        field3727[0] = arg0;
        field3727[1] = arg1;
        field3727[2] = arg2;
        field3726[0] = -arg0;
        field3726[1] = -arg1;
        field3726[2] = -arg2;
        field3718 = (int) (arg0 * 256.0F / arg1);
        field3725 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "()V", line = 95)
    public static void method1618() {
        field3727 = null;
        field3726 = null;
        field3721 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([F)V", line = 111)
    public static final void method1619(float[] arg0) {
        if (arg0 == null) {
            arg0 = field3721;
        }
        GL var1 = class245.field3884;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IFFF)V", line = 127)
    public static final void method1620(int arg0, float arg1, float arg2, float arg3) {
        if (field3729 == arg0 && field3728 == arg1 && field3723 == arg2 && field3719 == arg3) {
            return;
        }
        field3729 = arg0;
        field3728 = arg1;
        field3723 = arg2;
        field3719 = arg3;
        GL var4 = class245.field3884;
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

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "()V", line = 165)
    public static final void method1621() {
        GL var0 = class245.field3884;
        var0.glLightfv(16384, 4611, field3727, 0);
        var0.glLightfv(16385, 4611, field3726, 0);
    }
}
