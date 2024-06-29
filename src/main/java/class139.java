import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class139 {

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field1905 = 16777215;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "[F")
    public static float[] field1908 = new float[4];

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    private static int field1904 = -1;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    private static int field1906 = -1;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field1907 = 13156520;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "[F")
    private static float[] field1909 = new float[4];

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[F")
    public static float[] field1912 = new float[4];

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "F")
    private static float field1913 = -1.0F;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    private static int field1911 = -1;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "F")
    private static float field1902 = -1.0F;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "F")
    private static float field1914;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V", line = 15)
    public static final void method1002() {
        GL var0 = class67.field899;
        var0.glLightfv(16384, 4611, field1912, 0);
        var0.glLightfv(16385, 4611, field1909, 0);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(FFF)V", line = 20)
    public static final void method1003(float arg0, float arg1, float arg2) {
        if (field1912[0] == arg0 && field1912[1] == arg1 && field1912[2] == arg2) {
            return;
        }
        field1912[0] = arg0;
        field1912[1] = arg1;
        field1912[2] = arg2;
        field1909[0] = -arg0;
        field1909[1] = -arg1;
        field1909[2] = -arg2;
        field1910 = (int) (arg0 * 256.0F / arg1);
        field1903 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IFFF)V", line = 34)
    public static final void method1004(int arg0, float arg1, float arg2, float arg3) {
        if (field1904 == arg0 && field1914 == arg1 && field1902 == arg2 && field1913 == arg3) {
            return;
        }
        field1904 = arg0;
        field1914 = arg1;
        field1902 = arg2;
        field1913 = arg3;
        GL var4 = class67.field899;
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

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([F)V", line = 60)
    public static final void method1005(float[] arg0) {
        if (arg0 == null) {
            arg0 = field1908;
        }
        GL var1 = class67.field899;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()F", line = 71)
    public static final float method1006() {
        return field1902;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "()V", line = 74)
    private static final void method1007() {
        method1004(field1905, 1.1523438F, 0.69921875F, 1.2F);
        method1003(-50.0F, -60.0F, -50.0F);
        method1008(field1907, 0, false);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZ)V", line = 81)
    public static final void method1008(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field1911 == arg0 && field1906 == arg1) {
            return;
        }
        field1911 = arg0;
        field1906 = arg1;
        GL var3 = class67.field899;
        byte var4 = 50;
        short var5 = 3584;
        field1908[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field1908[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field1908[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field1908, 0);
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "()V", line = 115)
    public static void method1009() {
        field1912 = null;
        field1909 = null;
        field1908 = null;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "()F", line = 132)
    public static final float method1010() {
        return field1914;
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "()I", line = 135)
    public static final int method1011() {
        return field1904;
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "()V", line = 142)
    public static final void method1012() {
        GL var0 = class67.field899;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field1904 = -1;
        field1911 = -1;
        method1007();
    }
}
