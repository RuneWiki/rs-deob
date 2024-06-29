import jaggl.OpenGL;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class124 extends class509 {

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "Lmm;")
    private class19 field1859;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "Lqn;")
    private class439 field1863;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field1851 = 0;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Lpu;")
    public static class179 field1856 = new class179("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lgw;")
    private class108 field1850;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field1855;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)Z", line = 4)
    public static final boolean method918(int arg0, int arg1) {
        if (arg0 != -16242) {
            return true;
        } else {
            ++field1860;
            return arg1 == 2 || arg1 == 4 || arg1 == 5;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BZ)V", line = 16)
    public final void method128(byte arg0, boolean arg1) {
        super.field7409.method1741(260, (byte) -61, 8448);
        if (arg0 < 44) {
            method919(-95);
        }
        ++field1857;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 29)
    public final void method121(byte arg0) {
        ++field1862;
        this.field1850.method850(false, '\u0001');
        if (~super.field7409.field3998 < -1) {
            super.field7409.method1756(1, 119);
            super.field7409.method1749(25752, (class169) null);
            super.field7409.method1751(1.0F, 1, 0.0F);
            super.field7409.method1756(0, -15);
        }
        super.field7409.method1741(8448, (byte) 114, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        if (arg0 != 38) {
            field1856 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V", line = 53)
    public static void method919(int arg0) {
        field1855 = null;
        if (arg0 != 8448) {
            method918(46, -61);
        }
        field1856 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIZ)V", line = 67)
    public final void method123(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field1858;
            if ((arg1 & 1) == 1) {
                if (!this.field1859.field212) {
                    int var4 = super.field7409.field3927 % 4000 * 16 / 4000;
                    super.field7409.method1749(25752, this.field1859.field213[var4]);
                } else {
                    super.field7409.method1749(25752, this.field1859.field210);
                    class442.field6589[1] = 0.0F;
                    class442.field6589[2] = 0.0F;
                    class442.field6589[3] = (float) (super.field7409.field3927 % 4000) / 4000.0F;
                    class442.field6589[0] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class442.field6589, 0);
                }
            } else if (this.field1859.field212) {
                super.field7409.method1749(25752, this.field1859.field210);
                class442.field6589[0] = 0.0F;
                class442.field6589[3] = 0.0F;
                class442.field6589[2] = 0.0F;
                class442.field6589[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class442.field6589, 0);
            } else {
                super.field7409.method1749(25752, this.field1859.field213[0]);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V", line = 118)
    public final void method122(boolean arg0, int arg1) {
        if (~super.field7409.field3998 < -1) {
            float var3 = -0.5F / (float) super.field7409.field3998;
            super.field7409.method1756(1, 118);
            class442.field6589[1] = 0.0F;
            class442.field6589[0] = 0.0F;
            class442.field6589[3] = super.field7409.field3988 * var3 + 0.25F;
            class442.field6589[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class442.field6589, 0);
            OpenGL.glPopMatrix();
            super.field7409.method1751(0.5F, arg1 ^ 65, (float) super.field7409.field3998);
            super.field7409.method1749(25752, this.field1863);
            super.field7409.method1756(0, 120);
        }
        ++field1854;
        this.field1850.method850(false, '\u0000');
        if (arg1 != 64) {
            this.method128((byte) -37, false);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BILin;)V", line = 151)
    public final void method125(byte arg0, int arg1, class169 arg2) {
        if (arg0 < 9) {
            this.field1863 = null;
        }
        ++field1852;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V", line = 161)
    private final void method920(int arg0) {
        ++field1853;
        this.field1850 = new class108(super.field7409, 2);
        this.field1850.method848(0, true);
        super.field7409.method1756(1, -56);
        super.field7409.method1741(7681, (byte) -4, 260);
        super.field7409.method1780(768, 34168, 34176, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field7409.method1756(0, -84);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1859.field212) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field1850.method851(87);
        this.field1850.method848(1, true);
        int var2 = -14 / ((arg0 - -4) / 60);
        super.field7409.method1756(1, -9);
        super.field7409.method1741(8448, (byte) 123, 8448);
        super.field7409.method1780(768, 5890, 34176, 0);
        OpenGL.glDisable(3168);
        super.field7409.method1756(0, 106);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field1859.field212) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field1850.method851(119);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Lso;", line = 211)
    public static final class202 method921(int arg0, int arg1, int arg2) {
        class281 var3 = class348.field5192[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4376;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Z", line = 219)
    public final boolean method124(int arg0) {
        ++field1861;
        if (arg0 != -32170) {
            this.method123(-18, 108, true);
        }
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Ltt;Lmm;)V", line = 236)
    public class124(class249 arg0, class19 arg1) {
        super(arg0);
        this.field1859 = arg1;
        this.method920(119);
        this.field1863 = new class439(super.field7409, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1863.method2719(false, (byte) -63);
    }
}
