import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class273 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "F")
    private static float field4526 = -1.0F;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    private static int field4531 = -1;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field4527 = 13156520;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    private static int field4532 = -1;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field4533 = 16777215;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[F")
    public static float[] field4529 = new float[4];

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    private static int field4536 = -1;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[F")
    private static float[] field4528 = new float[4];

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "F")
    private static float field4534 = -1.0F;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "[F")
    public static float[] field4537 = new float[4];

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "F")
    private static float field4535;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V", line = 4)
    private static final void method1885() {
        method1890(field4533, 1.1523438F, 0.69921875F, 1.2F);
        method1891(-50.0F, -60.0F, -50.0F);
        method1893(field4527, 0);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V", line = 14)
    public static final void method1886() {
        GL var0 = class21.field377;
        var0.glLightfv(16384, 4611, field4537, 0);
        var0.glLightfv(16385, 4611, field4528, 0);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()V", line = 20)
    public static final void method1887() {
        GL var0 = class21.field377;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field4536 = -1;
        field4531 = -1;
        method1885();
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()F", line = 38)
    public static final float method1888() {
        return field4534;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "()I", line = 43)
    public static final int method1889() {
        return field4536;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IFFF)V", line = 46)
    public static final void method1890(int arg0, float arg1, float arg2, float arg3) {
        if (field4536 == arg0 && field4535 == arg1 && field4534 == arg2 && field4526 == arg3) {
            return;
        }
        field4536 = arg0;
        field4535 = arg1;
        field4534 = arg2;
        field4526 = arg3;
        GL var4 = class21.field377;
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

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(FFF)V", line = 74)
    public static final void method1891(float arg0, float arg1, float arg2) {
        if (field4537[0] == arg0 && field4537[1] == arg1 && field4537[2] == arg2) {
            return;
        }
        field4537[0] = arg0;
        field4537[1] = arg1;
        field4537[2] = arg2;
        field4528[0] = -arg0;
        field4528[1] = -arg1;
        field4528[2] = -arg2;
        field4530 = (int) (arg0 * 256.0F / arg1);
        field4538 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([F)V", line = 92)
    public static final void method1892(float[] arg0) {
        if (arg0 == null) {
            arg0 = field4529;
        }
        GL var1 = class21.field377;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V", line = 102)
    public static final void method1893(int arg0, int arg1) {
        if (field4531 == arg0 && field4532 == arg1) {
            return;
        }
        field4531 = arg0;
        field4532 = arg1;
        GL var2 = class21.field377;
        byte var3 = 50;
        short var4 = 3584;
        field4529[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field4529[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field4529[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field4529, 0);
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "()F", line = 140)
    public static final float method1894() {
        return field4535;
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "()V", line = 144)
    public static void method1895() {
        field4537 = null;
        field4528 = null;
        field4529 = null;
    }
}
