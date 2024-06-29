import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class122 extends class402 {

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "Lod;")
    private class533 field1572;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "Lv;")
    private class606 field1561;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "J")
    public static long field1564 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field1566 = 52;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "Lpia;")
    private class104 field1569;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILei;)I")
    public static final int method950(int arg0, class191 arg1) {
        ++field1558;
        if (class75.field1039 != arg1) {
            if (class269.field3180 == arg1) {
                return 8448;
            } else if (class8.field135 != arg1) {
                if (class555.field7726 != arg1) {
                    if (class391.field5076 == arg1) {
                        return 34023;
                    } else if (arg0 != 34023) {
                        return 48;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 260;
                }
            } else {
                return 34165;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
    public final void method183(int arg0, int arg1, int arg2) {
        if (arg0 != 64) {
            this.method180(-127, (byte) -59, (class400) null);
        }
        ++field1562;
        if ((arg1 & 1) == 1) {
            if (this.field1572.field7506) {
                super.field5243.method3936(false, this.field1572.field7509);
                class597.field8099[3] = (float) (super.field5243.field9726 % 4000) / 4000.0F;
                class597.field8099[2] = 0.0F;
                class597.field8099[1] = 0.0F;
                class597.field8099[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class597.field8099, 0);
            } else {
                int var4 = super.field5243.field9726 % 4000 * 16 / 4000;
                super.field5243.method3936(false, this.field1572.field7508[var4]);
            }
        } else if (this.field1572.field7506) {
            super.field5243.method3936(false, this.field1572.field7509);
            class597.field8099[3] = 0.0F;
            class597.field8099[0] = 0.0F;
            class597.field8099[1] = 0.0F;
            class597.field8099[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class597.field8099, 0);
        } else {
            super.field5243.method3936(false, this.field1572.field7508[0]);
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(IZ)V")
    public final void method176(int arg0, boolean arg1) {
        ++field1560;
        if (super.field5243.field9856 > 0) {
            float var3 = -0.5F / (float) super.field5243.field9856;
            super.field5243.method3925((byte) -106, 1);
            class597.field8099[2] = var3;
            class597.field8099[0] = 0.0F;
            class597.field8099[3] = super.field5243.field9854 * var3 + 0.25F;
            class597.field8099[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class597.field8099, 0);
            OpenGL.glPopMatrix();
            super.field5243.method3969(0.5F, (float) super.field5243.field9856, (byte) -124);
            super.field5243.method3936(false, this.field1561);
            super.field5243.method3925((byte) 64, 0);
        }
        this.field1569.method856(-47, '\u0000');
        OpenGL.glMatrixMode(5890);
        if (arg0 > -32) {
            this.field1569 = null;
        }
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Lde;")
    public static final class558 method951(int arg0, int arg1) {
        ++field1568;
        if (arg0 != -10524) {
            field1564 = 65L;
        }
        class558[] var2 = class731.method4129(31251);
        for (int var3 = 0; var2.length > var3; ++var3) {
            class558 var4 = var2[var3];
            if (~var4.field7756 == ~arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public final void method181(int arg0) {
        this.field1569.method856(-78, '\u0001');
        ++field1571;
        if (super.field5243.field9856 > 0) {
            super.field5243.method3925((byte) 106, 1);
            super.field5243.method3936(false, (class400) null);
            super.field5243.method3969(1.0F, 0.0F, (byte) -102);
            super.field5243.method3925((byte) -120, 0);
        }
        super.field5243.method3961(8448, 8448, 16127);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        if (arg0 != -1) {
            method951(-29, 43);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lpc;Lod;)V")
    public class122(class700 arg0, class533 arg1) {
        super(arg0);
        this.field1572 = arg1;
        this.method952(9216);
        this.field1561 = new class606(super.field5243, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1561.method3445(false, 10497);
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(IZ)V")
    public final void method184(int arg0, boolean arg1) {
        super.field5243.method3961(8448, 260, arg0 + 16063);
        if (arg0 != 64) {
            this.method184(-110, false);
        }
        ++field1559;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBLfha;)V")
    public final void method180(int arg0, byte arg1, class400 arg2) {
        ++field1565;
        if (arg1 >= -103) {
            this.method184(94, false);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)Z")
    public final boolean method178(byte arg0) {
        ++field1570;
        return arg0 > -55 ? true : true;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
    private final void method952(int arg0) {
        this.field1569 = new class104(super.field5243, 2);
        ++field1563;
        this.field1569.method858(0, (byte) -45);
        super.field5243.method3925((byte) -126, 1);
        super.field5243.method3961(260, 7681, arg0 ^ 6911);
        super.field5243.method3903(34168, 0, 768, arg0 ^ -9330);
        OpenGL.glTexGeni(8192, 9472, arg0);
        OpenGL.glEnable(3168);
        super.field5243.method3925((byte) 122, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1572.field7506) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field1569.method857(0);
        this.field1569.method858(1, (byte) -80);
        super.field5243.method3925((byte) -105, 1);
        super.field5243.method3961(8448, 8448, 16127);
        super.field5243.method3903(5890, 0, 768, -107);
        OpenGL.glDisable(3168);
        super.field5243.method3925((byte) 60, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field1572.field7506) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field1569.method857(0);
    }
}
