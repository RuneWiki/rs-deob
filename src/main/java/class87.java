import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class87 {

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    private static int field1200 = -1;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    private static int field1204 = -1;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field1203 = 13156520;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[F")
    public static float[] field1199 = new float[4];

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "[F")
    public static float[] field1206 = new float[4];

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "F")
    private static float field1209 = -1.0F;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    private static int field1202 = -1;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[F")
    private static float[] field1211 = new float[4];

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "F")
    private static float field1210 = -1.0F;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field1201 = 16777215;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "F")
    private static float field1208;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()F", line = 5)
    public static final float method588() {
        return field1208;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZ)V", line = 14)
    public static final void method589(int arg0, int arg1, boolean arg2) {
        if (!arg2 && field1200 == arg0 && field1204 == arg1) {
            return;
        }
        field1200 = arg0;
        field1204 = arg1;
        GL var3 = class232.field3716;
        byte var4 = 50;
        short var5 = 3584;
        field1199[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field1199[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field1199[2] = (float) (arg0 & 0xFF) / 255.0F;
        var3.glFogi(2917, 9729);
        var3.glFogf(2914, 0.95F);
        var3.glHint(3156, 4353);
        int var6 = var5 - arg1 - 512;
        if (var6 < var4) {
            var6 = var4;
        }
        var3.glFogf(2915, (float) var6);
        var3.glFogf(2916, (float) (var5 - 256));
        var3.glFogfv(2918, field1199, 0);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()V", line = 43)
    public static final void method590() {
        GL var0 = class232.field3716;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field1202 = -1;
        field1200 = -1;
        method595();
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()V", line = 65)
    public static final void method591() {
        GL var0 = class232.field3716;
        var0.glLightfv(16384, 4611, field1206, 0);
        var0.glLightfv(16385, 4611, field1211, 0);
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()F", line = 70)
    public static final float method592() {
        return field1209;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "()I", line = 74)
    public static final int method593() {
        return field1202;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(FFF)V", line = 85)
    public static final void method594(float arg0, float arg1, float arg2) {
        if (field1206[0] == arg0 && field1206[1] == arg1 && field1206[2] == arg2) {
            return;
        }
        field1206[0] = arg0;
        field1206[1] = arg1;
        field1206[2] = arg2;
        field1211[0] = -arg0;
        field1211[1] = -arg1;
        field1211[2] = -arg2;
        field1207 = (int) (arg0 * 256.0F / arg1);
        field1205 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "()V", line = 106)
    private static final void method595() {
        method598(field1201, 1.1523438F, 0.69921875F, 1.2F);
        method594(-50.0F, -60.0F, -50.0F);
        method589(field1203, 0, false);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([F)V", line = 113)
    public static final void method596(float[] arg0) {
        if (arg0 == null) {
            arg0 = field1199;
        }
        GL var1 = class232.field3716;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "()V", line = 123)
    public static void method597() {
        field1206 = null;
        field1211 = null;
        field1199 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IFFF)V", line = 131)
    public static final void method598(int arg0, float arg1, float arg2, float arg3) {
        if (field1202 == arg0 && field1208 == arg1 && field1209 == arg2 && field1210 == arg3) {
            return;
        }
        field1202 = arg0;
        field1208 = arg1;
        field1209 = arg2;
        field1210 = arg3;
        GL var4 = class232.field3716;
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
}
