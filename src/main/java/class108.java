import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class108 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "[F")
    private static float[] field1941 = new float[4];

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    private static int field1943 = -1;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "F")
    private static float field1944 = -1.0F;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "[F")
    public static float[] field1947 = new float[4];

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "F")
    private static float field1942 = -1.0F;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    private static int field1951 = -1;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field1945 = 13156520;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "[F")
    public static float[] field1952 = new float[4];

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    private static int field1946 = -1;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field1950 = 16777215;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "F")
    private static float field1953;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()F", line = 7)
    public static final float method871() {
        return field1944;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IFFF)V", line = 10)
    public static final void method872(int arg0, float arg1, float arg2, float arg3) {
        if (field1951 == arg0 && field1953 == arg1 && field1944 == arg2 && field1942 == arg3) {
            return;
        }
        field1951 = arg0;
        field1953 = arg1;
        field1944 = arg2;
        field1942 = arg3;
        GL var4 = class117.field2143;
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

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([F)V", line = 36)
    public static final void method873(float[] arg0) {
        if (arg0 == null) {
            arg0 = field1952;
        }
        GL var1 = class117.field2143;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()I", line = 44)
    public static final int method874() {
        return field1951;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()F", line = 49)
    public static final float method875() {
        return field1953;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(FFF)V", line = 52)
    public static final void method876(float arg0, float arg1, float arg2) {
        if (field1947[0] == arg0 && field1947[1] == arg1 && field1947[2] == arg2) {
            return;
        }
        field1947[0] = arg0;
        field1947[1] = arg1;
        field1947[2] = arg2;
        field1941[0] = -arg0;
        field1941[1] = -arg1;
        field1941[2] = -arg2;
        field1949 = (int) (arg0 * 256.0F / arg1);
        field1948 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()V", line = 72)
    public static void method877() {
        field1947 = null;
        field1941 = null;
        field1952 = null;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "()V", line = 78)
    public static final void method878() {
        GL var0 = class117.field2143;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field1951 = -1;
        field1943 = -1;
        method879();
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "()V", line = 95)
    public static final void method879() {
        method872(field1950, 1.1523438F, 0.69921875F, 1.2F);
        method876(-50.0F, -60.0F, -50.0F);
        method881(field1945, 0);
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "()V", line = 106)
    public static final void method880() {
        GL var0 = class117.field2143;
        var0.glLightfv(16384, 4611, field1947, 0);
        var0.glLightfv(16385, 4611, field1941, 0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 126)
    public static final void method881(int arg0, int arg1) {
        if (field1943 == arg0 && field1946 == arg1) {
            return;
        }
        field1943 = arg0;
        field1946 = arg1;
        GL var2 = class117.field2143;
        byte var3 = 50;
        short var4 = 3584;
        field1952[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field1952[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field1952[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field1952, 0);
    }
}
