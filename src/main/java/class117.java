import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class117 {

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    private static int field1973 = -1;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1974 = 16777215;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1970 = 13156520;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    private static int field1977 = -1;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "[F")
    public static float[] field1976 = new float[4];

    @OriginalMember(owner = "client!p", name = "h", descriptor = "[F")
    public static float[] field1975 = new float[4];

    @OriginalMember(owner = "client!p", name = "l", descriptor = "[F")
    private static float[] field1979 = new float[4];

    @OriginalMember(owner = "client!p", name = "k", descriptor = "F")
    private static float field1978 = -1.0F;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    private static int field1969 = -1;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "F")
    private static float field1980 = -1.0F;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "F")
    private static float field1968;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()F", line = 7)
    public static final float method879() {
        return field1968;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IFFF)V", line = 11)
    public static final void method880(int arg0, float arg1, float arg2, float arg3) {
        if (field1973 == arg0 && field1968 == arg1 && field1978 == arg2 && field1980 == arg3) {
            return;
        }
        field1973 = arg0;
        field1968 = arg1;
        field1978 = arg2;
        field1980 = arg3;
        GL var4 = class99.field1682;
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

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I", line = 44)
    public static final int method881() {
        return field1973;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()V", line = 48)
    public static final void method882() {
        GL var0 = class99.field1682;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field1973 = -1;
        field1977 = -1;
        method886();
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()V", line = 66)
    public static final void method883() {
        GL var0 = class99.field1682;
        var0.glLightfv(16384, 4611, field1976, 0);
        var0.glLightfv(16385, 4611, field1979, 0);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(FFF)V", line = 79)
    public static final void method884(float arg0, float arg1, float arg2) {
        if (field1976[0] == arg0 && field1976[1] == arg1 && field1976[2] == arg2) {
            return;
        }
        field1976[0] = arg0;
        field1976[1] = arg1;
        field1976[2] = arg2;
        field1979[0] = -arg0;
        field1979[1] = -arg1;
        field1979[2] = -arg2;
        field1972 = (int) (arg0 * 256.0F / arg1);
        field1971 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([F)V", line = 93)
    public static final void method885(float[] arg0) {
        if (arg0 == null) {
            arg0 = field1975;
        }
        GL var1 = class99.field1682;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()V", line = 106)
    private static final void method886() {
        method880(field1974, 1.1523438F, 0.69921875F, 1.2F);
        method884(-50.0F, -60.0F, -50.0F);
        method889(field1970, 0);
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "()F", line = 111)
    public static final float method887() {
        return field1978;
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "()V", line = 118)
    public static void method888() {
        field1976 = null;
        field1979 = null;
        field1975 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 123)
    public static final void method889(int arg0, int arg1) {
        if (field1977 == arg0 && field1969 == arg1) {
            return;
        }
        field1977 = arg0;
        field1969 = arg1;
        GL var2 = class99.field1682;
        byte var3 = 50;
        short var4 = 3584;
        field1975[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field1975[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field1975[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field1975, 0);
    }
}
