import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class240 extends class348 {

    @OriginalMember(owner = "client!us", name = "v", descriptor = "Z")
    private boolean field3912 = false;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "Lkp;")
    private class292 field3901;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "Lss;")
    public static class213 field3903;

    @OriginalMember(owner = "client!us", name = "s", descriptor = "Lsb;")
    public static class278 field3909;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!us", name = "t", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!us", name = "u", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!us", name = "w", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "Laq;")
    public static class340 field3905;

    @OriginalMember(owner = "client!us", name = "r", descriptor = "[[[B")
    public static byte[][][] field3908;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)Z")
    public final boolean method267(int arg0) {
        if (arg0 != -233) {
            this.field3912 = false;
        }
        ++field3906;
        return true;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)V")
    public final void method263(int arg0, int arg1, byte arg2) {
        ++field3904;
        if (arg2 >= -51) {
            this.method262(true, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lna;)V")
    public class240(class211 arg0) {
        super(arg0);
        if (arg0.field3525) {
            this.field3901 = new class292(arg0, 2);
            this.field3901.method1965(0, (byte) -46);
            super.field5398.method1507(1, 0);
            super.field5398.method1568(7681, 2896, 34165);
            super.field5398.method1498(34192, 2, 34168, 770);
            super.field5398.method1539(0, 34167, 770, (byte) 124);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field5398.method1507(0, 0);
            this.field3901.method1962(-6635);
            this.field3901.method1965(1, (byte) -64);
            super.field5398.method1507(1, 0);
            super.field5398.method1568(8448, 2896, 8448);
            super.field5398.method1498(34192, 2, 34166, 770);
            super.field5398.method1539(0, 5890, 770, (byte) 118);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field5398.method1507(0, 0);
            this.field3901.method1962(-6635);
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)V")
    public final void method265(int arg0) {
        if (!this.field3912) {
            super.field5398.method1539(0, 5890, 770, (byte) 121);
        } else {
            this.field3901.method1963(true, '\u0001');
            super.field5398.method1507(1, 0);
            super.field5398.method1540(100, (class427) null);
            super.field5398.method1507(0, 0);
        }
        ++field3900;
        int var2 = 52 % ((arg0 - 61) / 63);
        super.field5398.method1568(8448, 2896, 8448);
        this.field3912 = false;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(ZB)V")
    public final void method261(boolean arg0, byte arg1) {
        ++field3910;
        if (arg1 >= -30) {
            this.method261(true, (byte) 14);
        }
        class15 var3 = super.field5398.method1517((byte) 115);
        if (this.field3901 != null && var3 != null && arg0) {
            this.field3901.method1963(true, '\u0000');
            super.field5398.method1507(1, 0);
            super.field5398.method1540(62, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5398.field3515.method609((byte) -98), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field5398.method1507(0, 0);
            this.field3912 = true;
        } else {
            super.field5398.method1539(0, 34168, 770, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IILed;)V")
    public final void method264(int arg0, int arg1, class427 arg2) {
        ++field3907;
        super.field5398.method1540(118, arg2);
        int var4 = -116 / ((arg1 - -49) / 44);
        super.field5398.method1494(arg0, -25951);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZB)V")
    public final void method262(boolean arg0, byte arg1) {
        ++field3899;
        int var3 = -97 / ((-23 - arg1) / 41);
        super.field5398.method1568(7681, 2896, 8448);
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(I)V")
    public static void method1677(int arg0) {
        field3909 = null;
        field3903 = null;
        field3905 = null;
        field3908 = null;
        if (arg0 > -66) {
            method1677(-76);
        }
    }

    static {
        new class213(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field3903 = new class213("green:", "grün:", "vert:", "verde:");
        field3909 = new class278();
    }
}
