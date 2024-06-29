import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class698 extends class277 {

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "Z")
    private boolean field9875 = false;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "Lfb;")
    private class52 field9868;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "I")
    public static int field9870 = 0;

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "Z")
    public static boolean field9871 = false;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "Z")
    public static volatile boolean field9873 = false;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "I")
    public static int field9879;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "Lkp;")
    public static class507 field9867;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IILrg;)V", line = 5)
    public final void method279(int arg0, int arg1, class615 arg2) {
        ++field9876;
        if (arg1 != 7) {
            this.method284((byte) 39);
        }
        super.field3475.method2960(arg2, arg1 + -9);
        super.field3475.method3005(false, arg0);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZ)V", line = 28)
    public final void method280(int arg0, boolean arg1) {
        super.field3475.method2983(8448, -465309136, 7681);
        if (arg0 <= -64) {
            ++field9872;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)Z", line = 39)
    public final boolean method284(byte arg0) {
        if (arg0 > -93) {
            field9867 = null;
        }
        ++field9877;
        return true;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)V", line = 52)
    public final void method276(int arg0, int arg1, int arg2) {
        ++field9869;
        if (arg1 != 50) {
            field9867 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIIBI)V", line = 62)
    public static final void method3925(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (int var5 = 0; class66.field905 > var5; ++var5) {
            Rectangle var7 = class221.field2711[var5];
            if (~arg1 > ~(var7.x + var7.width) && ~(arg1 + arg2) < ~var7.x && ~(var7.y + var7.height) < ~arg0 && arg0 + arg4 > var7.y) {
                class177.field2286[var5] = true;
            }
        }
        int var6 = -105 % ((-16 - arg3) / 32);
        ++field9878;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V", line = 89)
    public final void method278(int arg0) {
        ++field9879;
        if (this.field9875) {
            this.field9868.method333(-29240, '\u0001');
            super.field3475.method3027(1, true);
            super.field3475.method2960((class615) null, -2);
            super.field3475.method3027(0, true);
        } else {
            super.field3475.method3015(5890, 770, 0, true);
        }
        super.field3475.method2983(8448, -465309136, 8448);
        if (arg0 == 1268) {
            this.field9875 = false;
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lqj;)V", line = 111)
    public class698(class548 arg0) {
        super(arg0);
        if (arg0.field7556) {
            this.field9868 = new class52(arg0, 2);
            this.field9868.method331(0, 0);
            super.field3475.method3027(1, true);
            super.field3475.method2983(34165, -465309136, 7681);
            super.field3475.method2966(2, 770, 768, 34168);
            super.field3475.method3015(34167, 770, 0, true);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field3475.method3027(0, true);
            this.field9868.method332((byte) 110);
            this.field9868.method331(1, 0);
            super.field3475.method3027(1, true);
            super.field3475.method2983(8448, -465309136, 8448);
            super.field3475.method2966(2, 770, 768, 34166);
            super.field3475.method3015(5890, 770, 0, true);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field3475.method3027(0, true);
            this.field9868.method332((byte) 105);
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(IZ)V", line = 153)
    public final void method277(int arg0, boolean arg1) {
        ++field9874;
        class33 var3 = super.field3475.method2965(8960);
        if (this.field9868 != null && var3 != null && arg1) {
            this.field9868.method333(-29240, '\u0000');
            super.field3475.method3027(1, true);
            super.field3475.method2960(var3, -2);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3475.field7516.method916(-1801), 0);
            OpenGL.glMatrixMode(5888);
            super.field3475.method3027(0, true);
            this.field9875 = true;
        } else {
            super.field3475.method3015(34168, 770, 0, true);
        }
        int var4 = -6 % ((65 - arg0) / 60);
    }

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "(B)V", line = 179)
    public static void method3926(byte arg0) {
        if (arg0 >= -31) {
            field9870 = -15;
        }
        field9867 = null;
    }
}
