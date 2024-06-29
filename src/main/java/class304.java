import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class304 extends class398 {

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "Z")
    private boolean field4515 = false;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "Lbq;")
    private class646 field4509;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)V", line = 6)
    public final void method92(int arg0) {
        ++field4514;
        if (this.field4515) {
            this.field4509.method3678('\u0001', 127);
            super.field6009.method1745(true, 1);
            super.field6009.method1709((byte) -118, (class517) null);
            super.field6009.method1745(true, 0);
        } else {
            super.field6009.method1724((byte) 11, 770, 5890, 0);
        }
        if (arg0 != 512) {
            this.field4509 = null;
        }
        super.field6009.method1701(8448, 1, 8448);
        this.field4515 = false;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)Z", line = 29)
    public final boolean method87(int arg0) {
        if (arg0 != 3) {
            this.method86(23, (byte) 127, -126);
        }
        ++field4516;
        return true;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B[Ljava/lang/String;[S)V", line = 40)
    public static final void method1914(byte arg0, String[] arg1, short[] arg2) {
        class314.method1954(119, arg2, arg1, 0, arg1.length + -1);
        if (arg0 != -46) {
            method1914((byte) 77, (String[]) null, (short[]) null);
        }
        ++field4513;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IZ)V", line = 54)
    public final void method94(int arg0, boolean arg1) {
        ++field4518;
        if (arg0 != 0) {
            this.method92(111);
        }
        super.field6009.method1701(8448, 1, 7681);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILvaa;B)V", line = 65)
    public final void method93(int arg0, class517 arg1, byte arg2) {
        super.field6009.method1709((byte) -127, arg1);
        int var4 = -114 / ((76 - arg2) / 41);
        ++field4512;
        super.field6009.method1751(arg0, 21575);
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)V", line = 76)
    public static final void method1915(byte arg0) {
        class603.field8721 = class187.method1238(4, 8, true, 8, (byte) -77, 2048, 35, 0.4F);
        if (arg0 > 110) {
            ++field4511;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IBI)V", line = 87)
    public final void method86(int arg0, byte arg1, int arg2) {
        ++field4508;
        if (arg1 != 82) {
            this.method86(-111, (byte) 46, 92);
        }
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Luca;)V", line = 100)
    public class304(class287 arg0) {
        super(arg0);
        if (arg0.field4090) {
            this.field4509 = new class646(arg0, 2);
            this.field4509.method3680(0, (byte) -127);
            super.field6009.method1745(true, 1);
            super.field6009.method1701(34165, 1, 7681);
            super.field6009.method1755(34168, 34176, 770, 2);
            super.field6009.method1724((byte) 11, 770, 34167, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field6009.method1745(true, 0);
            this.field4509.method3679(-117);
            this.field4509.method3680(1, (byte) -128);
            super.field6009.method1745(true, 1);
            super.field6009.method1701(8448, 1, 8448);
            super.field6009.method1755(34166, 34176, 770, 2);
            super.field6009.method1724((byte) 11, 770, 5890, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field6009.method1745(true, 0);
            this.field4509.method3679(-118);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZI)V", line = 139)
    public final void method91(boolean arg0, int arg1) {
        ++field4517;
        class364 var3 = super.field6009.method1698((byte) -29);
        if (arg1 != -5191) {
            this.method87(-71);
        }
        if (this.field4509 != null && var3 != null && arg0) {
            this.field4509.method3678('\u0000', arg1 + 5294);
            super.field6009.method1745(true, 1);
            super.field6009.method1709((byte) -96, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6009.field4058.method1277(1), 0);
            OpenGL.glMatrixMode(5888);
            super.field6009.method1745(true, 0);
            this.field4515 = true;
        } else {
            super.field6009.method1724((byte) 11, 770, 34168, 0);
        }
    }
}
