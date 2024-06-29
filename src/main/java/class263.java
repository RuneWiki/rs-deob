import jaggl.OpenGL;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class263 extends class692 {

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "Z")
    private boolean field3720 = false;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "Lbfa;")
    private class264 field3714;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field3712 = 0;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public static int field3717 = -1;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field3721 = new String[100];

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field3723;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZI)V", line = 5)
    public final void method1113(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            ++field3715;
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Llea;)V", line = 16)
    public class263(class573 arg0) {
        super(arg0);
        if (arg0.field8176) {
            this.field3714 = new class264(arg0, 2);
            this.field3714.method1704(0, -110);
            super.field9753.method3321(1, -19587);
            super.field9753.method3359(34165, 7681, true);
            super.field9753.method3351(770, 2, 34168, (byte) -85);
            super.field9753.method3374(0, 770, 34167, -108);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field9753.method3321(0, -19587);
            this.field3714.method1701((byte) 126);
            this.field3714.method1704(1, -126);
            super.field9753.method3321(1, -19587);
            super.field9753.method3359(8448, 8448, true);
            super.field9753.method3351(770, 2, 34166, (byte) -85);
            super.field9753.method3374(0, 770, 5890, 54);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field9753.method3321(0, -19587);
            this.field3714.method1701((byte) 103);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V", line = 55)
    public final void method1111(byte arg0) {
        if (!this.field3720) {
            super.field9753.method3374(0, 770, 5890, -82);
        } else {
            this.field3714.method1700('\u0001', 3711);
            super.field9753.method3321(1, -19587);
            super.field9753.method3384((class377) null, (byte) 73);
            super.field9753.method3321(0, arg0 + -19701);
        }
        ++field3713;
        if (arg0 != 114) {
            field3718 = 9;
        }
        super.field9753.method3359(8448, 8448, true);
        this.field3720 = false;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI)V", line = 79)
    public final void method1118(boolean arg0, int arg1) {
        ++field3716;
        class653 var3 = super.field9753.method3331((byte) -97);
        if (this.field3714 != null && var3 != null && arg0) {
            this.field3714.method1700('\u0000', 3711);
            super.field9753.method3321(1, -19587);
            super.field9753.method3384(var3, (byte) 60);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field9753.field8169.method1570((byte) -38), 0);
            OpenGL.glMatrixMode(5888);
            super.field9753.method3321(0, -19587);
            this.field3720 = true;
        } else {
            super.field9753.method3374(0, 770, 34168, 79);
        }
        if (arg1 != -3826) {
            field3718 = -3;
        }
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V", line = 106)
    public static void method1699(int arg0) {
        if (arg0 != 17643) {
            method1699(7);
        }
        field3721 = null;
        field3723 = null;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Z", line = 117)
    public final boolean method1112(int arg0) {
        if (arg0 > -124) {
            this.method1112(-71);
        }
        ++field3711;
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V", line = 142)
    public final void method1117(boolean arg0, byte arg1) {
        ++field3719;
        super.field9753.method3359(8448, 7681, true);
        if (arg1 != 57) {
            field3723 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILfga;I)V", line = 159)
    public final void method1119(int arg0, class377 arg1, int arg2) {
        if (arg0 > 48) {
            ++field3722;
            super.field9753.method3384(arg1, (byte) 95);
            super.field9753.method3375(arg2, (byte) 102);
        }
    }
}
