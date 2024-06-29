import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class363 extends class402 {

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lod;")
    private class533 field4517;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Lpia;")
    private class104 field4518;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "Lbja;")
    public static class34 field4525 = new class34(7, 0, 1, 1);

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4527 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "Lha;")
    public static class66 field4526;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V", line = 3)
    public final void method183(int arg0, int arg1, int arg2) {
        ++field4523;
        float var4 = (float) ((3 & arg1) - -1) * -5.0E-4F;
        float var5 = (float) ((3 & arg1 >> 3) + 1) * 5.0E-4F;
        float var6 = (arg0 & arg1) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        super.field5243.method3925((byte) -115, 1);
        boolean var7 = ~(128 & arg1) != -1;
        if (var7) {
            class174.field2178[0] = var6;
            class174.field2178[3] = 0.0F;
            class174.field2178[1] = 0.0F;
            class174.field2178[2] = 0.0F;
        } else {
            class174.field2178[1] = 0.0F;
            class174.field2178[3] = 0.0F;
            class174.field2178[0] = 0.0F;
            class174.field2178[2] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class174.field2178, 0);
        class174.field2178[1] = var6;
        class174.field2178[3] = (float) super.field5243.field9726 * var4 % 1.0F;
        class174.field2178[0] = 0.0F;
        class174.field2178[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class174.field2178, 0);
        if (!this.field4517.field7506) {
            int var8 = (int) ((float) super.field5243.field9726 * var5 * 16.0F);
            super.field5243.method3936(false, this.field4517.field7505[var8 % 16]);
        } else {
            class174.field2178[2] = 0.0F;
            class174.field2178[1] = 0.0F;
            class174.field2178[3] = (float) super.field5243.field9726 * var5 % 1.0F;
            class174.field2178[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class174.field2178, 0);
        }
        super.field5243.method3925((byte) 24, 0);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V", line = 59)
    public static void method2122(byte arg0) {
        field4526 = null;
        if (arg0 != 98) {
            field4526 = null;
        }
        field4525 = null;
        field4527 = null;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(IZ)V", line = 71)
    public final void method184(int arg0, boolean arg1) {
        ++field4524;
        if (arg0 != 64) {
            field4527 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(IZ)V", line = 86)
    public final void method176(int arg0, boolean arg1) {
        ++field4519;
        this.field4518.method856(-68, '\u0000');
        if (this.field4517.field7506) {
            super.field5243.method3925((byte) 20, 1);
            super.field5243.method3936(false, this.field4517.field7503);
            super.field5243.method3925((byte) 25, 0);
        }
        if (arg0 > -32) {
            this.method184(-64, true);
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lpc;Lod;)V", line = 104)
    public class363(class700 arg0, class533 arg1) {
        super(arg0);
        this.field4517 = arg1;
        this.field4518 = new class104(arg0, 2);
        this.field4518.method858(0, (byte) -49);
        super.field5243.method3925((byte) -98, 1);
        if (this.field4517.field7506) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field5243.method3925((byte) -123, 0);
        this.field4518.method857(0);
        this.field4518.method858(1, (byte) -119);
        super.field5243.method3925((byte) 107, 1);
        if (this.field4517.field7506) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field5243.method3925((byte) -117, 0);
        this.field4518.method857(0);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Z", line = 140)
    public final boolean method178(byte arg0) {
        if (arg0 >= -55) {
            this.method183(-18, 3, -41);
        }
        ++field4520;
        return true;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLfha;)V", line = 151)
    public final void method180(int arg0, byte arg1, class400 arg2) {
        super.field5243.method3936(false, arg2);
        if (arg1 >= -103) {
            field4526 = null;
        }
        ++field4522;
        super.field5243.method3932(arg0, (byte) -102);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 168)
    public final void method181(int arg0) {
        ++field4521;
        if (arg0 != -1) {
            field4525 = null;
        }
        this.field4518.method856(-94, '\u0001');
        super.field5243.method3925((byte) 15, 1);
        super.field5243.method3936(false, (class400) null);
        super.field5243.method3925((byte) -115, 0);
    }
}
