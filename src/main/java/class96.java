import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class96 extends class301 {

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "Z")
    private boolean field1304 = false;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "Lnc;")
    private class516 field1300;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "Luw;")
    public static class208 field1301 = new class208(33, 20);

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field1305 = -1;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field1308 = 0;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "Lhv;")
    public static class151 field1307 = new class151();

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZ)V", line = 5)
    public final void method29(int arg0, boolean arg1) {
        ++field1306;
        if (arg0 > 18) {
            class528 var3 = super.field3803.method3933(true);
            if (this.field1300 != null && var3 != null && arg1) {
                this.field1300.method2855(4864, '\u0000');
                super.field3803.method3945(1, false);
                super.field3803.method3975((byte) 113, var3);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field3803.field9840.method453((byte) 101), 0);
                OpenGL.glMatrixMode(5888);
                super.field3803.method3945(0, false);
                this.field1304 = true;
            } else {
                super.field3803.method3922(0, 1, 770, 34168);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lwj;II)V", line = 33)
    public final void method28(class128 arg0, int arg1, int arg2) {
        ++field1303;
        super.field3803.method3975((byte) 122, arg0);
        super.field3803.method3979((byte) 66, arg2);
        if (arg1 != 0) {
            this.method29(-52, true);
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lck;)V", line = 50)
    public class96(class733 arg0) {
        super(arg0);
        if (arg0.field9907) {
            this.field1300 = new class516(arg0, 2);
            this.field1300.method2857(0, (byte) -118);
            super.field3803.method3945(1, false);
            super.field3803.method3917(20, 34165, 7681);
            super.field3803.method3954(2, 770, 34168, (byte) 124);
            super.field3803.method3922(0, 1, 770, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field3803.method3945(0, false);
            this.field1300.method2856((byte) -109);
            this.field1300.method2857(1, (byte) -102);
            super.field3803.method3945(1, false);
            super.field3803.method3917(59, 8448, 8448);
            super.field3803.method3954(2, 770, 34166, (byte) 118);
            super.field3803.method3922(0, 1, 770, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field3803.method3945(0, false);
            this.field1300.method2856((byte) -87);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V", line = 89)
    public final void method24(byte arg0) {
        if (!this.field1304) {
            super.field3803.method3922(0, 1, 770, 5890);
        } else {
            this.field1300.method2855(4864, '\u0001');
            super.field3803.method3945(1, false);
            super.field3803.method3975((byte) 115, (class128) null);
            super.field3803.method3945(0, false);
        }
        if (arg0 > -89) {
            field1308 = 19;
        }
        ++field1297;
        super.field3803.method3917(19, 8448, 8448);
        this.field1304 = false;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z", line = 112)
    public final boolean method25(byte arg0) {
        ++field1302;
        if (arg0 <= 7) {
            field1305 = -55;
        }
        return true;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V", line = 127)
    public final void method22(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method28((class128) null, 82, -61);
        }
        ++field1299;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V", line = 143)
    public static void method567(int arg0) {
        field1307 = null;
        field1301 = null;
        int var1 = 17 % ((54 - arg0) / 50);
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(IZ)V", line = 154)
    public final void method27(int arg0, boolean arg1) {
        super.field3803.method3917(11, 8448, 7681);
        if (arg0 != 0) {
            this.method27(63, true);
        }
        ++field1298;
    }
}
