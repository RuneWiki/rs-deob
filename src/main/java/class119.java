import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class119 {

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    private static int field2005 = -1;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field2004 = 16777215;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "[F")
    private static float[] field2010 = new float[4];

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "F")
    private static float field2012 = -1.0F;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    private static int field2008 = -1;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    private static int field2009 = -1;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "[F")
    public static float[] field2011 = new float[4];

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "[F")
    public static float[] field2014 = new float[4];

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "F")
    private static float field2013 = -1.0F;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field2015 = 13156520;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "F")
    private static float field2003;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()V", line = 10)
    public static final void method713() {
        GL var0 = class247.field4253;
        var0.glColorMaterial(1028, 5634);
        var0.glEnable(2903);
        float[] var1 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16384, 4608, var1, 0);
        var0.glEnable(16384);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        var0.glLightfv(16385, 4608, var2, 0);
        var0.glEnable(16385);
        field2009 = -1;
        field2008 = -1;
        method723();
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IFFF)V", line = 35)
    public static final void method714(int arg0, float arg1, float arg2, float arg3) {
        if (field2009 == arg0 && field2003 == arg1 && field2012 == arg2 && field2013 == arg3) {
            return;
        }
        field2009 = arg0;
        field2003 = arg1;
        field2012 = arg2;
        field2013 = arg3;
        GL var4 = class247.field4253;
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

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "()F", line = 65)
    public static final float method715() {
        return field2003;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "()V", line = 70)
    public static final void method716() {
        GL var0 = class247.field4253;
        var0.glLightfv(16384, 4611, field2011, 0);
        var0.glLightfv(16385, 4611, field2010, 0);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(FFF)V", line = 78)
    public static final void method717(float arg0, float arg1, float arg2) {
        if (field2011[0] == arg0 && field2011[1] == arg1 && field2011[2] == arg2) {
            return;
        }
        field2011[0] = arg0;
        field2011[1] = arg1;
        field2011[2] = arg2;
        field2010[0] = -arg0;
        field2010[1] = -arg1;
        field2010[2] = -arg2;
        field2007 = (int) (arg0 * 256.0F / arg1);
        field2006 = (int) (arg2 * 256.0F / arg1);
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "()V", line = 111)
    public static void method718() {
        field2011 = null;
        field2010 = null;
        field2014 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V", line = 120)
    public static final void method719(int arg0, int arg1) {
        if (field2008 == arg0 && field2005 == arg1) {
            return;
        }
        field2008 = arg0;
        field2005 = arg1;
        GL var2 = class247.field4253;
        byte var3 = 50;
        short var4 = 3584;
        field2014[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
        field2014[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
        field2014[2] = (float) (arg0 & 0xFF) / 255.0F;
        var2.glFogi(2917, 9729);
        var2.glFogf(2914, 0.95F);
        var2.glHint(3156, 4353);
        int var5 = var4 - arg1 - 512;
        if (var5 < var3) {
            var5 = var3;
        }
        var2.glFogf(2915, (float) var5);
        var2.glFogf(2916, (float) (var4 - 256));
        var2.glFogfv(2918, field2014, 0);
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "()F", line = 147)
    public static final float method720() {
        return field2012;
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "()I", line = 150)
    public static final int method721() {
        return field2009;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([F)V", line = 156)
    public static final void method722(float[] arg0) {
        if (arg0 == null) {
            arg0 = field2014;
        }
        GL var1 = class247.field4253;
        var1.glFogfv(2918, arg0, 0);
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "()V", line = 168)
    public static final void method723() {
        method714(field2004, 1.1523438F, 0.69921875F, 1.2F);
        method717(-50.0F, -60.0F, -50.0F);
        method719(field2015, 0);
    }
}
