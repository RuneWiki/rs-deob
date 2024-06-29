import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class516 extends class387 {

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "Z")
    private boolean field6828 = false;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "Lvi;")
    private class540 field6827;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "Lqr;")
    public static class65 field6825 = new class65(64);

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
    public final void method644(boolean arg0) {
        ++field6831;
        if (!this.field6828) {
            super.field5405.method3599(0, 770, (byte) 37, 5890);
        } else {
            this.field6827.method3013((byte) 58, '\u0001');
            super.field5405.method3630(true, 1);
            super.field5405.method3639(-2, (class460) null);
            super.field5405.method3630(true, 0);
        }
        super.field5405.method3608(-25, 8448, 8448);
        this.field6828 = arg0;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z")
    public final boolean method641(int arg0) {
        if (arg0 != -16777216) {
            this.field6827 = null;
        }
        ++field6826;
        return true;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BILiga;)V")
    public final void method638(byte arg0, int arg1, class460 arg2) {
        ++field6832;
        super.field5405.method3639(-2, arg2);
        super.field5405.method3631((byte) 114, arg1);
        if (arg0 < 53) {
            field6830 = 7;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BZ)V")
    public final void method639(byte arg0, boolean arg1) {
        ++field6829;
        if (arg0 > -123) {
            method2876(-29);
        }
        super.field5405.method3608(120, 7681, 8448);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V")
    public final void method643(int arg0, int arg1, int arg2) {
        ++field6834;
        int var4 = 111 % ((arg2 - 74) / 36);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZB)V")
    public final void method640(boolean arg0, byte arg1) {
        if (arg1 >= 1) {
            ++field6833;
            class444 var3 = super.field5405.method3625(1);
            if (this.field6827 != null && var3 != null && arg0) {
                this.field6827.method3013((byte) 106, '\u0000');
                super.field5405.method3630(true, 1);
                super.field5405.method3639(-2, var3);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field5405.field8984.method1790(9), 0);
                OpenGL.glMatrixMode(5888);
                super.field5405.method3630(true, 0);
                this.field6828 = true;
            } else {
                super.field5405.method3599(0, 770, (byte) 37, 34168);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
    public static void method2876(int arg0) {
        field6825 = null;
        if (arg0 != 34166) {
            field6830 = 127;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lrda;)V")
    public class516(class663 arg0) {
        super(arg0);
        if (arg0.field9032) {
            this.field6827 = new class540(arg0, 2);
            this.field6827.method3012(-126, 0);
            super.field5405.method3630(true, 1);
            super.field5405.method3608(120, 7681, 34165);
            super.field5405.method3661(770, 34168, 2, (byte) 4);
            super.field5405.method3599(0, 770, (byte) 37, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field5405.method3630(true, 0);
            this.field6827.method3015((byte) 26);
            this.field6827.method3012(-100, 1);
            super.field5405.method3630(true, 1);
            super.field5405.method3608(123, 8448, 8448);
            super.field5405.method3661(770, 34166, 2, (byte) 4);
            super.field5405.method3599(0, 770, (byte) 37, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field5405.method3630(true, 0);
            this.field6827.method3015((byte) 26);
        }
    }
}
