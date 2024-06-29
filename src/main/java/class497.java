import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class497 extends class363 {

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "Lqh;")
    private class48 field7339;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "Lav;")
    private class450 field7344;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field7333 = -1;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "Lbw;")
    private class483 field7346;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)V", line = 4)
    public static final void method2978(boolean arg0) {
        ++field7345;
        if (arg0) {
            method2981(-95, 19, 41);
        }
        class342.field4908.method1540(0);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljk;IB)V", line = 15)
    public final void method121(class446 arg0, int arg1, byte arg2) {
        ++field7343;
        if (arg2 >= -69) {
            this.method125(false, -29);
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lod;Lqh;)V", line = 26)
    public class497(class349 arg0, class48 arg1) {
        super(arg0);
        this.field7339 = arg1;
        this.method2979(27);
        this.field7344 = new class450(super.field5564, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field7344.method2716(8416, false);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V", line = 38)
    public final void method128(int arg0, int arg1, int arg2) {
        ++field7338;
        if (arg1 < -13) {
            if (~(arg2 & 1) == -2) {
                if (!this.field7339.field778) {
                    int var4 = super.field5564.field5228 % 4000 * 16 / 4000;
                    super.field5564.method2200(this.field7339.field779[var4], (byte) 117);
                } else {
                    super.field5564.method2200(this.field7339.field775, (byte) 120);
                    class308.field4430[2] = 0.0F;
                    class308.field4430[3] = (float) (super.field5564.field5228 % 4000) / 4000.0F;
                    class308.field4430[0] = 0.0F;
                    class308.field4430[1] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class308.field4430, 0);
                }
            } else if (this.field7339.field778) {
                super.field5564.method2200(this.field7339.field775, (byte) 125);
                class308.field4430[1] = 0.0F;
                class308.field4430[3] = 0.0F;
                class308.field4430[2] = 0.0F;
                class308.field4430[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class308.field4430, 0);
            } else {
                super.field5564.method2200(this.field7339.field779[0], (byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V", line = 86)
    public final void method120(boolean arg0) {
        this.field7346.method2863(arg0, '\u0001');
        if (arg0) {
            this.field7344 = null;
        }
        ++field7335;
        if (super.field5564.field5323 > 0) {
            super.field5564.method2176(1, 101);
            super.field5564.method2200((class446) null, (byte) 116);
            super.field5564.method2163(1.0F, (byte) -101, 0.0F);
            super.field5564.method2176(0, 91);
        }
        super.field5564.method2131(34162, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V", line = 111)
    private final void method2979(int arg0) {
        ++field7341;
        int var2 = 60 % ((arg0 - 70) / 32);
        this.field7346 = new class483(super.field5564, 2);
        this.field7346.method2869(0, 92);
        super.field5564.method2176(1, 94);
        super.field5564.method2131(34162, 260, 7681);
        super.field5564.method2156(34168, 768, 2969, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field5564.method2176(0, 37);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field7339.field778) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field7346.method2870(1952872654);
        this.field7346.method2869(1, 31);
        super.field5564.method2176(1, 94);
        super.field5564.method2131(34162, 8448, 8448);
        super.field5564.method2156(5890, 768, 2969, 0);
        OpenGL.glDisable(3168);
        super.field5564.method2176(0, 64);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field7339.field778) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field7346.method2870(1952872654);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILse;)V", line = 156)
    public static final void method2980(int arg0, class167 arg1) {
        ++field7336;
        if (arg0 != 0) {
            method2980(-31, (class167) null);
        }
        for (class404 var2 = (class404) class372.field5674.method816(98); var2 != null; var2 = (class404) class372.field5674.method812(126)) {
            if (var2.field6103 == arg1) {
                if (var2.field6085 != null) {
                    class366.field5591.method1794(var2.field6085);
                    var2.field6085 = null;
                }
                var2.method2049(-55);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(III)Lwo;", line = 194)
    public static final class522 method2981(int arg0, int arg1, int arg2) {
        class518 var3 = class108.field1553[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7552;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)V", line = 203)
    public final void method125(boolean arg0, int arg1) {
        if (~super.field5564.field5323 < -1) {
            float var3 = -0.5F / (float) super.field5564.field5323;
            super.field5564.method2176(1, 103);
            class308.field4430[2] = var3;
            class308.field4430[1] = 0.0F;
            class308.field4430[0] = 0.0F;
            class308.field4430[3] = super.field5564.field5274 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class308.field4430, 0);
            OpenGL.glPopMatrix();
            super.field5564.method2163(0.5F, (byte) -101, (float) super.field5564.field5323);
            super.field5564.method2200(this.field7344, (byte) 112);
            super.field5564.method2176(0, 83);
        }
        ++field7342;
        this.field7346.method2863(false, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
        if (arg1 > -69) {
            this.field7346 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)Z", line = 242)
    public final boolean method126(int arg0) {
        ++field7334;
        int var2 = 100 % ((37 - arg0) / 48);
        return true;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IZ)I", line = 259)
    public static final int method2982(int arg0, boolean arg1) {
        ++field7337;
        if (!arg1) {
            field7333 = 24;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZB)V", line = 270)
    public final void method122(boolean arg0, byte arg1) {
        ++field7340;
        if (arg1 == 52) {
            super.field5564.method2131(arg1 + 34110, 8448, 260);
        }
    }
}
