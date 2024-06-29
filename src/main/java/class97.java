import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class97 extends class477 {

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Lwl;")
    private class511 field1353;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "Ljq;")
    private class363 field1361;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Lhb;")
    public static class250 field1354 = new class250(61, 15);

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "Lbf;")
    private class181 field1362;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "Lm;")
    public static class79 field1360;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method271(boolean arg0, int arg1) {
        if (arg1 == -13) {
            super.field6964.method2794(260, 8448, true);
            ++field1358;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Z", line = 14)
    public final boolean method264(byte arg0) {
        ++field1351;
        if (arg0 <= 45) {
            field1354 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lgk;Lwl;)V", line = 25)
    public class97(class463 arg0, class511 arg1) {
        super(arg0);
        this.field1353 = arg1;
        this.method665((byte) -20);
        this.field1361 = new class363(super.field6964, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1361.method2136(31927, false);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZZ)V", line = 36)
    public final void method270(boolean arg0, boolean arg1) {
        ++field1352;
        if (!arg0) {
            this.method264((byte) 80);
        }
        if (~super.field6964.field6810 < -1) {
            float var3 = -0.5F / (float) super.field6964.field6810;
            super.field6964.method2741((byte) -38, 1);
            class213.field2731[0] = 0.0F;
            class213.field2731[2] = var3;
            class213.field2731[3] = super.field6964.field6826 * var3 + 0.25F;
            class213.field2731[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class213.field2731, 0);
            OpenGL.glPopMatrix();
            super.field6964.method2734((float) super.field6964.field6810, 3008, 0.5F);
            super.field6964.method2771(this.field1361, -16785);
            super.field6964.method2741((byte) -38, 0);
        }
        this.field1362.method1190((byte) 63, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V", line = 70)
    public final void method269(byte arg0) {
        this.field1362.method1190((byte) -111, '\u0001');
        ++field1363;
        if (super.field6964.field6810 > 0) {
            super.field6964.method2741((byte) -38, 1);
            super.field6964.method2771((class31) null, -16785);
            super.field6964.method2734(0.0F, 3008, 1.0F);
            super.field6964.method2741((byte) -38, 0);
        }
        super.field6964.method2794(8448, 8448, true);
        OpenGL.glMatrixMode(5890);
        if (arg0 == 126) {
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)V", line = 94)
    private final void method665(byte arg0) {
        this.field1362 = new class181(super.field6964, 2);
        ++field1355;
        this.field1362.method1188(0, (byte) -84);
        super.field6964.method2741((byte) -38, 1);
        super.field6964.method2794(7681, 260, true);
        super.field6964.method2781(34168, 0, arg0 ^ -2493, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field6964.method2741((byte) -38, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1353.field7523) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        if (arg0 != -20) {
            this.method264((byte) 16);
        }
        this.field1362.method1193(-20);
        this.field1362.method1188(1, (byte) 75);
        super.field6964.method2741((byte) -38, 1);
        super.field6964.method2794(8448, 8448, true);
        super.field6964.method2781(5890, 0, 2479, 768);
        OpenGL.glDisable(3168);
        super.field6964.method2741((byte) -38, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field1353.field7523) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field1362.method1193(-126);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 145)
    public static void method666(int arg0) {
        field1360 = null;
        if (arg0 != 768) {
            method666(118);
        }
        field1354 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII)V", line = 162)
    public final void method272(byte arg0, int arg1, int arg2) {
        if (arg0 <= 33) {
            this.field1353 = null;
        }
        ++field1357;
        if (~(arg1 & 1) != -2) {
            if (!this.field1353.field7523) {
                super.field6964.method2771(this.field1353.field7525[0], -16785);
            } else {
                super.field6964.method2771(this.field1353.field7532, -16785);
                class213.field2731[2] = 0.0F;
                class213.field2731[3] = 0.0F;
                class213.field2731[1] = 0.0F;
                class213.field2731[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class213.field2731, 0);
            }
        } else if (this.field1353.field7523) {
            super.field6964.method2771(this.field1353.field7532, -16785);
            class213.field2731[1] = 0.0F;
            class213.field2731[0] = 0.0F;
            class213.field2731[2] = 0.0F;
            class213.field2731[3] = (float) (super.field6964.field6690 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, class213.field2731, 0);
        } else {
            int var4 = super.field6964.field6690 % 4000 * 16 / 4000;
            super.field6964.method2771(this.field1353.field7525[var4], -16785);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lrh;II)V", line = 207)
    public final void method266(class31 arg0, int arg1, int arg2) {
        ++field1350;
        if (arg1 != -11) {
            this.method665((byte) -61);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILgf;Lgf;IIIIIIB)V", line = 217)
    public static final void method667(int arg0, class395 arg1, class395 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        if (arg9 > -28) {
            method667(12, (class395) null, (class395) null, -18, -88, -17, -88, -7, -91, (byte) -87);
        }
        ++field1356;
        int var10 = arg2.method1771(55);
        if (var10 != -1) {
            Object var11 = null;
            class404 var12 = (class404) class308.field3963.method78((long) var10, (byte) -98);
            if (var12 == null) {
                class136[] var13 = class136.method954(class391.field5121, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class512.field7538.method851(var13[0], true);
                class308.field3963.method88((long) var10, 27, var12);
            }
            class270.method1664(true, arg0, arg1.field6241, arg1.field6239, arg1.field6220, arg7 >> 1, 64 * arg1.method2342(10804), arg5, 0, arg6 >> 1);
            int var14 = arg4 - -class267.field3388[0] + -18;
            int var15 = arg8 / 4 * 18 + var14;
            int var16 = arg3 + -16 - -class267.field3388[1] + -54;
            int var17 = arg8 % 4 * 18 + var16;
            var12.method2406(var15, var17);
            if (arg1 == arg2) {
                class512.field7538.method902(-256, var17 + -1, 18, 18, var15 + -1, 86);
            }
            class344 var18 = class310.method1851((byte) -35);
            var18.field4379 = arg2;
            var18.field4373 = var17;
            var18.field4375 = var17 + 16;
            var18.field4372 = var15;
            var18.field4378 = var15 + 16;
            class180.field2333.method2124(var18, 110);
        }
    }
}
