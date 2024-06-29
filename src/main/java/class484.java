import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class484 extends class193 {

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "Lpl;")
    private class462 field7074;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Lbu;")
    private class17 field7069;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field7070 = 0;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 5)
    public final void method92(byte arg0) {
        if (arg0 > -56) {
            this.method94(false, false);
        }
        ++field7078;
        this.field7069.method149('\u0001', 4864);
        super.field2498.method2321(1, 25322);
        super.field2498.method2322((class119) null, 14);
        super.field2498.method2321(0, 25322);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lsq;II)V", line = 23)
    public final void method97(class119 arg0, int arg1, int arg2) {
        ++field7076;
        super.field2498.method2322(arg0, 14);
        if (arg2 == 36) {
            super.field2498.method2305(7681, arg1);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIZ)V", line = 35)
    public final void method99(int arg0, int arg1, boolean arg2) {
        ++field7073;
        float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
        float var5 = (float) (((24 & arg0) >> 3) - -1) * 5.0E-4F;
        float var6 = ~(arg0 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        super.field2498.method2321(1, 25322);
        boolean var7 = ~(arg0 & 128) != -1;
        if (!var7) {
            class442.field6340[2] = var6;
            class442.field6340[3] = 0.0F;
            class442.field6340[0] = 0.0F;
            class442.field6340[1] = 0.0F;
        } else {
            class442.field6340[1] = 0.0F;
            class442.field6340[0] = var6;
            class442.field6340[3] = 0.0F;
            class442.field6340[2] = 0.0F;
        }
        if (arg2) {
            this.method94(false, true);
        }
        OpenGL.glTexGenfv(8192, 9474, class442.field6340, 0);
        class442.field6340[1] = var6;
        class442.field6340[2] = 0.0F;
        class442.field6340[0] = 0.0F;
        class442.field6340[3] = (float) super.field2498.field5503 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class442.field6340, 0);
        if (!this.field7074.field6613) {
            int var8 = (int) ((float) super.field2498.field5503 * var5 * 16.0F);
            super.field2498.method2322(this.field7074.field6615[var8 % 16], 14);
        } else {
            class442.field6340[0] = 0.0F;
            class442.field6340[2] = 0.0F;
            class442.field6340[1] = 0.0F;
            class442.field6340[3] = (float) super.field2498.field5503 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class442.field6340, 0);
        }
        super.field2498.method2321(0, 25322);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)Z", line = 91)
    public final boolean method93(boolean arg0) {
        if (arg0) {
            this.field7069 = null;
        }
        ++field7077;
        return true;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(ZZ)V", line = 104)
    public final void method95(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.field7074 = null;
        }
        ++field7075;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lug;Lpl;)V", line = 114)
    public class484(class395 arg0, class462 arg1) {
        super(arg0);
        this.field7074 = arg1;
        this.field7069 = new class17(arg0, 2);
        this.field7069.method152((byte) 63, 0);
        super.field2498.method2321(1, 25322);
        if (this.field7074.field6613) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field2498.method2321(0, 25322);
        this.field7069.method150((byte) 124);
        this.field7069.method152((byte) 63, 1);
        super.field2498.method2321(1, 25322);
        if (this.field7074.field6613) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field2498.method2321(0, 25322);
        this.field7069.method150((byte) 97);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 150)
    public static final int method2942(int arg0, String arg1, int arg2) {
        ++field7071;
        if (arg0 != 9474) {
            field7070 = -111;
        }
        return class410.method2433(arg1, true, 5565, arg2);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZZ)V", line = 163)
    public final void method94(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field7074 = null;
        }
        ++field7072;
        this.field7069.method149('\u0000', 4864);
        if (this.field7074.field6613) {
            super.field2498.method2321(1, 25322);
            super.field2498.method2322(this.field7074.field6606, 14);
            super.field2498.method2321(0, 25322);
        }
    }
}
