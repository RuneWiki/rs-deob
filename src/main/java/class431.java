import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class431 extends class675 {

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lb;")
    private class350 field6144;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lee;")
    private class703 field6148;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "[Z")
    public static boolean[] field6149;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZZ)V", line = 3)
    public final void method1350(boolean arg0, boolean arg1) {
        ++field6147;
        if (arg1) {
            this.method1354(true, -111);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V", line = 14)
    public final void method1351(int arg0, int arg1, int arg2) {
        ++field6146;
        float var4 = (float) ((arg0 & 3) - -1) * -5.0E-4F;
        float var5 = (float) (((29 & arg0) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(arg0 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        super.field9618.method1825(1, 116);
        boolean var7 = (arg0 & 128) != 0;
        if (!var7) {
            class10.field230[2] = var6;
            class10.field230[3] = 0.0F;
            class10.field230[1] = 0.0F;
            class10.field230[0] = 0.0F;
        } else {
            class10.field230[2] = 0.0F;
            class10.field230[1] = 0.0F;
            class10.field230[3] = 0.0F;
            class10.field230[0] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class10.field230, 0);
        class10.field230[3] = (float) super.field9618.field4167 * var4 % 1.0F;
        if (arg1 == 8865) {
            class10.field230[2] = 0.0F;
            class10.field230[0] = 0.0F;
            class10.field230[1] = var6;
            OpenGL.glTexGenfv(8193, 9474, class10.field230, 0);
            if (!this.field6144.field5113) {
                int var8 = (int) ((float) super.field9618.field4167 * var5 * 16.0F);
                super.field9618.method1840(this.field6144.field5106[var8 % 16], 2205);
            } else {
                class10.field230[2] = 0.0F;
                class10.field230[3] = (float) super.field9618.field4167 * var5 % 1.0F;
                class10.field230[1] = 0.0F;
                class10.field230[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class10.field230, 0);
            }
            super.field9618.method1825(0, -35);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 70)
    public static void method2593(int arg0) {
        if (arg0 != 7080) {
            field6149 = null;
        }
        field6149 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 80)
    public final void method1353(byte arg0) {
        this.field6148.method3982((byte) -120, '\u0001');
        if (arg0 != 52) {
            method2594(8, 49, -74);
        }
        ++field6150;
        super.field9618.method1825(1, -90);
        super.field9618.method1840((class599) null, 2205);
        super.field9618.method1825(0, -97);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZI)V", line = 100)
    public final void method1354(boolean arg0, int arg1) {
        this.field6148.method3982((byte) -120, '\u0000');
        if (arg1 != -24765) {
            method2593(67);
        }
        ++field6142;
        if (this.field6144.field5113) {
            super.field9618.method1825(1, arg1 + 24870);
            super.field9618.method1840(this.field6144.field5111, 2205);
            super.field9618.method1825(0, arg1 + 24729);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lkv;Lb;)V", line = 118)
    public class431(class280 arg0, class350 arg1) {
        super(arg0);
        this.field6144 = arg1;
        this.field6148 = new class703(arg0, 2);
        this.field6148.method3980(0, -27400);
        super.field9618.method1825(1, -3);
        if (this.field6144.field5113) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field9618.method1825(0, -72);
        this.field6148.method3978(0);
        this.field6148.method3980(1, -27400);
        super.field9618.method1825(1, 127);
        if (this.field6144.field5113) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field9618.method1825(0, 118);
        this.field6148.method3978(0);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)V", line = 155)
    public static final void method2594(int arg0, int arg1, int arg2) {
        ++class788.field10827;
        if (arg1 != 3) {
            method2594(-43, 71, 28);
        }
        ++field6145;
        class731 var3 = class155.method1222(260, class25.field368, class237.field3417);
        var3.field10211.method896(arg2, (byte) 61);
        var3.field10211.method879((byte) -79, arg0);
        class533.method3088(var3, 0);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)Z", line = 173)
    public final boolean method1347(byte arg0) {
        if (arg0 < 105) {
            return true;
        } else {
            ++field6143;
            return true;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lfia;IZ)V", line = 188)
    public final void method1348(class599 arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field6141;
            super.field9618.method1840(arg0, 2205);
            super.field9618.method1889(false, arg1);
        }
    }
}
