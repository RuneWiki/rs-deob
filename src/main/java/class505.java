import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class505 extends class297 {

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Z")
    private boolean field6950 = false;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "Liq;")
    private class429 field6948;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "Lpc;")
    public static class473 field6946;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)Z")
    public final boolean method240(boolean arg0) {
        ++field6952;
        if (arg0) {
            this.field6950 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
    public static final void method2881(int arg0) {
        ++field6954;
        class50.field772 = 0;
        int var1 = (class385.field5232.field584 >> 7) - -class401.field5382;
        int var2 = (class385.field5232.field574 >> 7) - -class421.field5762;
        if (~var1 <= -3054 && ~var1 >= -3157 && var2 >= 3056 && ~var2 >= -3137) {
            class50.field772 = 1;
        }
        if (var1 >= 3072 && ~var1 >= -3119 && var2 >= 9492 && var2 <= 9535) {
            class50.field772 = 1;
        }
        if (class50.field772 == arg0 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && ~var2 >= -3063) {
            class50.field772 = 0;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lnk;II)V")
    public final void method248(class501 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field6950 = false;
        }
        ++field6951;
        super.field3881.method2980(arg0, 113);
        super.field3881.method2976((byte) 112, arg2);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)V")
    public final void method241(boolean arg0, int arg1) {
        super.field3881.method3002((byte) -118, 8448, 7681);
        ++field6945;
        if (arg1 != -30965) {
            this.field6950 = false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZII)V")
    public final void method245(boolean arg0, int arg1, int arg2) {
        ++field6953;
        if (!arg0) {
            field6946 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lbo;)V")
    public class505(class511 arg0) {
        super(arg0);
        if (arg0.field7447) {
            this.field6948 = new class429(arg0, 2);
            this.field6948.method2482(0, -52);
            super.field3881.method3003(1, 96);
            super.field3881.method3002((byte) -100, 34165, 7681);
            super.field3881.method2953(2, (byte) 82, 770, 34168);
            super.field3881.method2950((byte) -34, 770, 0, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field3881.method3003(0, 44);
            this.field6948.method2479(-16981);
            this.field6948.method2482(1, -39);
            super.field3881.method3003(1, 54);
            super.field3881.method3002((byte) -91, 8448, 8448);
            super.field3881.method2953(2, (byte) 69, 770, 34166);
            super.field3881.method2950((byte) -34, 770, 0, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field3881.method3003(0, 54);
            this.field6948.method2479(-16981);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)V")
    public final void method244(int arg0, boolean arg1) {
        ++field6947;
        class336 var3 = super.field3881.method2936(arg0);
        if (this.field6948 != null && var3 != null && arg1) {
            this.field6948.method2480('\u0000', -1);
            super.field3881.method3003(1, 21);
            super.field3881.method2980(var3, 122);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3881.field7470.method981(-28545), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field3881.method3003(0, 29);
            this.field6950 = true;
        } else {
            super.field3881.method2950((byte) -34, 770, 0, 34168);
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
    public static void method2882(int arg0) {
        if (arg0 == 8194) {
            field6946 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (!this.field6950) {
            super.field3881.method2950((byte) -34, 770, 0, 5890);
        } else {
            this.field6948.method2480('\u0001', arg0 ^ -7);
            super.field3881.method3003(1, 104);
            super.field3881.method2980((class501) null, 113);
            super.field3881.method3003(0, 8);
        }
        if (arg0 != 6) {
            this.method246(-48);
        }
        ++field6949;
        super.field3881.method3002((byte) -34, 8448, 8448);
        this.field6950 = false;
    }
}
