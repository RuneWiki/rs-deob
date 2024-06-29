import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class366 {

    @OriginalMember(owner = "client!us", name = "s", descriptor = "Lpe;")
    private class430 field10;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "Lcn;")
    private class356 field8;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "Lgf;")
    public static class180 field4 = new class180("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!us", name = "t", descriptor = "Log;")
    public static class456 field11 = new class456("LIVE", 0);

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "r", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)V")
    public final void method1(int arg0) {
        this.field8.method2298('\u0001', 0);
        ++field2;
        if (arg0 <= 2) {
            this.field8 = null;
        }
        super.field5494.method2030(1, (byte) 35);
        super.field5494.method2042((class440) null, 0);
        super.field5494.method2030(0, (byte) 59);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIII)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5;
        int var6 = class39.method299(class229.field3347, (byte) -56, class156.field2366, arg4);
        if (arg0 != 8977) {
            field4 = null;
        }
        int var7 = class39.method299(class229.field3347, (byte) -56, class156.field2366, arg5);
        int var8 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg1);
        int var9 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg3);
        for (int var10 = var6; ~var10 >= ~var7; ++var10) {
            class217.method1448(class436.field6332[var10], var8, arg2, 4, var9);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class322 var7 = new class322();
        var7.field4935 = arg1 >> class225.field3278;
        var7.field4952 = arg2 >> class225.field3278;
        var7.field4940 = arg3 >> class225.field3278;
        var7.field4931 = arg4 >> class225.field3278;
        var7.field4936 = arg0;
        var7.field4939 = arg1;
        var7.field4949 = arg2;
        var7.field4946 = arg3;
        var7.field4937 = arg4;
        var7.field4950 = arg5;
        var7.field4944 = arg6;
        class207.field2982[class396.field5825++] = var7;
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)V")
    public static void method4(int arg0) {
        field11 = null;
        field4 = null;
        int var1 = 4 % ((27 - arg0) / 52);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)V")
    public final void method5(boolean arg0, int arg1) {
        int var3 = -69 % ((arg1 - 10) / 48);
        this.field8.method2298('\u0000', 0);
        ++field6;
        if (this.field10.field6264) {
            super.field5494.method2030(1, (byte) -26);
            super.field5494.method2042(this.field10.field6267, 0);
            super.field5494.method2030(0, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILgo;B)V")
    public final void method6(int arg0, class440 arg1, byte arg2) {
        int var4 = 16 / ((31 - arg2) / 59);
        super.field5494.method2042(arg1, 0);
        ++field9;
        super.field5494.method2068(arg0, 13134);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZZ)V")
    public final void method7(boolean arg0, boolean arg1) {
        ++field7;
        if (!arg0) {
            this.field10 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)V")
    public final void method8(int arg0, int arg1, byte arg2) {
        ++field1;
        float var4 = (float) ((arg1 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((3 & arg1 >> 3) + 1) * 5.0E-4F;
        float var6 = ~(arg1 & 64) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var7 = (128 & arg1) != 0;
        super.field5494.method2030(1, (byte) 44);
        if (!var7) {
            class91.field1509[2] = var6;
            class91.field1509[1] = 0.0F;
            class91.field1509[0] = 0.0F;
            class91.field1509[3] = 0.0F;
        } else {
            class91.field1509[1] = 0.0F;
            class91.field1509[2] = 0.0F;
            class91.field1509[0] = var6;
            class91.field1509[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class91.field1509, 0);
        if (arg2 > 18) {
            class91.field1509[0] = 0.0F;
            class91.field1509[2] = 0.0F;
            class91.field1509[1] = var6;
            class91.field1509[3] = (float) super.field5494.field4781 * var4 % 1.0F;
            OpenGL.glTexGenfv(8193, 9474, class91.field1509, 0);
            if (!this.field10.field6264) {
                int var8 = (int) ((float) super.field5494.field4781 * var5 * 16.0F);
                super.field5494.method2042(this.field10.field6263[var8 % 16], 0);
            } else {
                class91.field1509[2] = 0.0F;
                class91.field1509[0] = 0.0F;
                class91.field1509[3] = (float) super.field5494.field4781 * var5 % 1.0F;
                class91.field1509[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class91.field1509, 0);
            }
            super.field5494.method2030(0, (byte) -10);
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lqg;Lpe;)V")
    public class1(class321 arg0, class430 arg1) {
        super(arg0);
        this.field10 = arg1;
        this.field8 = new class356(arg0, 2);
        this.field8.method2295(0, (byte) 118);
        super.field5494.method2030(1, (byte) 80);
        if (this.field10.field6264) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field5494.method2030(0, (byte) 113);
        this.field8.method2296(-53);
        this.field8.method2295(1, (byte) 120);
        super.field5494.method2030(1, (byte) -128);
        if (this.field10.field6264) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field5494.method2030(0, (byte) -120);
        this.field8.method2296(-96);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)Z")
    public final boolean method9(int arg0) {
        if (arg0 < 21) {
            this.field8 = null;
        }
        ++field3;
        return true;
    }
}
