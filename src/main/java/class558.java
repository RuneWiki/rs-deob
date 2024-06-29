import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class558 extends class283 {

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "Z")
    private boolean field8109 = false;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "Ltw;")
    private class523 field8103;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field8113 = new String[5];

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "Lgr;")
    public static class530 field8105 = new class530(2, 6);

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "Z")
    public static boolean field8116 = false;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "[[I")
    public static int[][] field8115;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        ++field8104;
        class96 var3 = super.field3958.method2150(-119);
        if (this.field8103 != null && var3 != null && arg1) {
            this.field8103.method3185(119, '\u0000');
            super.field3958.method2171(arg0 ^ -977, 1);
            super.field3958.method2164(6, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3958.field5005.method2345(arg0 ^ -981), 0);
            OpenGL.glMatrixMode(5888);
            super.field3958.method2171(126, 0);
            this.field8109 = true;
        } else {
            super.field3958.method2136(8960, 34168, 0, 770);
        }
        if (arg0 != -938) {
            this.method79(true, -75, -61);
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lkw;)V")
    public class558(class346 arg0) {
        super(arg0);
        if (arg0.field5030) {
            this.field8103 = new class523(arg0, 2);
            this.field8103.method3184(0, 118);
            super.field3958.method2171(109, 1);
            super.field3958.method2149(-11771, 7681, 34165);
            super.field3958.method2167(34168, 770, 10603, 2);
            super.field3958.method2136(8960, 34167, 0, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field3958.method2171(123, 0);
            this.field8103.method3181(true);
            this.field8103.method3184(1, -89);
            super.field3958.method2171(127, 1);
            super.field3958.method2149(-11771, 8448, 8448);
            super.field3958.method2167(34166, 770, 10603, 2);
            super.field3958.method2136(8960, 5890, 0, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field3958.method2171(111, 0);
            this.field8103.method3181(true);
        }
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)V")
    public static void method3352(int arg0) {
        if (arg0 < 92) {
            method3352(67);
        }
        field8115 = null;
        field8113 = null;
        field8105 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)V")
    public final void method73(boolean arg0, int arg1) {
        super.field3958.method2149(-11771, 7681, 8448);
        if (arg1 == 2) {
            ++field8108;
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
    public static final void method3353(byte arg0) {
        class660.field9437.method1569((byte) 119);
        ++field8107;
        class196.method1381(false);
        class326.field4421 = 0;
        class93.field1338 = null;
        class94.field1353 = null;
        class352.field5213.field6864 = 0;
        class671.field9570 = 0;
        class362.field5296 = null;
        if (arg0 != 116) {
            field8113 = null;
        }
        class751.method4184(false);
        class634.field8940 = 0;
        class38.field495 = 0;
        class386.field5583 = 0;
        class295.field4048 = null;
        class528.field7684 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lou;II)V")
    public final void method75(class158 arg0, int arg1, int arg2) {
        super.field3958.method2164(6, arg0);
        ++field8106;
        if (arg1 != 2) {
            this.method73(true, -96);
        }
        super.field3958.method2120(arg2, 122);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZII)V")
    public final void method79(boolean arg0, int arg1, int arg2) {
        ++field8110;
        if (!arg0) {
            this.method77(-52);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        ++field8112;
        if (arg0 < 96) {
            this.method76(32, true);
        }
        return true;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public final void method74(byte arg0) {
        ++field8111;
        if (this.field8109) {
            this.field8103.method3185(117, '\u0001');
            super.field3958.method2171(110, 1);
            super.field3958.method2164(6, (class158) null);
            super.field3958.method2171(arg0 + 38, 0);
        } else {
            super.field3958.method2136(8960, 5890, 0, 770);
        }
        super.field3958.method2149(-11771, 8448, 8448);
        if (arg0 != 85) {
            field8113 = null;
        }
        this.field8109 = false;
    }
}
