import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class424 extends class184 {

    @OriginalMember(owner = "client!ifa", name = "l", descriptor = "Lqr;")
    private class64 field5931;

    @OriginalMember(owner = "client!ifa", name = "r", descriptor = "Lrha;")
    private class219 field5937;

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!ifa", name = "n", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!ifa", name = "p", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!ifa", name = "q", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!ifa", name = "o", descriptor = "Leha;")
    private class89 field5934;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ)V", line = 5)
    public final void method699(int arg0, boolean arg1) {
        if (super.field2626.field8671 > 0) {
            float var3 = -0.5F / (float) super.field2626.field8671;
            super.field2626.method3413(1, 33984);
            class487.field6894[3] = super.field2626.field8594 * var3 + 0.25F;
            class487.field6894[1] = 0.0F;
            class487.field6894[0] = 0.0F;
            class487.field6894[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class487.field6894, 0);
            OpenGL.glPopMatrix();
            super.field2626.method3428((byte) 127, (float) super.field2626.field8671, 0.5F);
            super.field2626.method3425(this.field5937, -106);
            super.field2626.method3413(0, 33984);
        }
        ++field5927;
        this.field5934.method834((byte) 105, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
        if (arg0 >= -54) {
            this.method700((class87) null, true, 54);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZI)V", line = 40)
    public final void method704(boolean arg0, int arg1) {
        ++field5933;
        if (arg1 != -28981) {
            this.method705(-83, 7, false);
        }
        super.field2626.method3485(260, (byte) 46, 8448);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)Z", line = 54)
    public final boolean method698(int arg0) {
        ++field5929;
        return arg0 == -20958;
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)V", line = 65)
    private final void method2586(int arg0) {
        this.field5934 = new class89(super.field2626, 2);
        ++field5928;
        this.field5934.method836(4864, 0);
        super.field2626.method3413(1, 33984);
        super.field2626.method3485(7681, (byte) 40, 260);
        int var2 = -100 / ((arg0 - 38) / 55);
        super.field2626.method3464(0, 768, false, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field2626.method3413(0, 33984);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field5931.field1157) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field5934.method832(99);
        this.field5934.method836(4864, 1);
        super.field2626.method3413(1, 33984);
        super.field2626.method3485(8448, (byte) 55, 8448);
        super.field2626.method3464(0, 768, false, 5890);
        OpenGL.glDisable(3168);
        super.field2626.method3413(0, 33984);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field5931.field1157) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field5934.method832(99);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Liia;ZI)V", line = 110)
    public final void method700(class87 arg0, boolean arg1, int arg2) {
        ++field5932;
        if (arg1) {
            this.field5937 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)V", line = 121)
    public final void method702(boolean arg0) {
        ++field5930;
        this.field5934.method834((byte) 105, '\u0001');
        if (super.field2626.field8671 > 0) {
            super.field2626.method3413(1, 33984);
            super.field2626.method3425((class87) null, 65);
            super.field2626.method3428((byte) 121, 0.0F, 1.0F);
            super.field2626.method3413(0, 33984);
        }
        super.field2626.method3485(8448, (byte) 123, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        if (!arg0) {
            this.field5931 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIZ)V", line = 144)
    public final void method705(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field5936;
            if ((arg1 & 1) != 1) {
                if (!this.field5931.field1157) {
                    super.field2626.method3425(this.field5931.field1158[0], -117);
                } else {
                    super.field2626.method3425(this.field5931.field1162, 91);
                    class487.field6894[1] = 0.0F;
                    class487.field6894[2] = 0.0F;
                    class487.field6894[0] = 0.0F;
                    class487.field6894[3] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class487.field6894, 0);
                }
            } else if (!this.field5931.field1157) {
                int var4 = super.field2626.field8544 % 4000 * 16 / 4000;
                super.field2626.method3425(this.field5931.field1158[var4], 93);
            } else {
                super.field2626.method3425(this.field5931.field1162, -123);
                class487.field6894[1] = 0.0F;
                class487.field6894[3] = (float) (super.field2626.field8544 % 4000) / 4000.0F;
                class487.field6894[2] = 0.0F;
                class487.field6894[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class487.field6894, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Loea;Lqr;)V", line = 190)
    public class424(class594 arg0, class64 arg1) {
        super(arg0);
        this.field5931 = arg1;
        this.method2586(-34);
        this.field5937 = new class219(super.field2626, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field5937.method1517(-112, false);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IB)Lva;", line = 201)
    public static final class494 method2587(int arg0, byte arg1) {
        ++field5935;
        class494 var2 = (class494) class65.field1169.method3054((byte) -103, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class360.field5050.method1453(arg0, -116, 1);
            class494 var4 = new class494();
            var4.field7053 = arg0;
            if (var3 != null) {
                var4.method2974(new class35(var3), (byte) -75);
            }
            var4.method2975(23);
            int var5 = 48 % ((45 - arg1) / 37);
            if (~var4.field7049 == -3 && class404.field5628.method4203(true, (long) arg0) == null) {
                class404.field5628.method4211(new class528(class468.field6751), (byte) 112, (long) arg0);
                class725.field10142[class468.field6751++] = var4;
            }
            class65.field1169.method3047(false, var4, (long) arg0);
            return var4;
        }
    }
}
