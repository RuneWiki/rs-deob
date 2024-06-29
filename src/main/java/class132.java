import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class132 extends class182 {

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "Z")
    private boolean field1837 = false;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "Lcl;")
    private class75 field1836;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "Z")
    public static boolean field1835 = false;

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(B)Z", line = 3)
    public final boolean method77(byte arg0) {
        ++field1834;
        if (arg0 != -96) {
            this.method84(false, true);
        }
        return true;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V", line = 15)
    public final void method82(int arg0) {
        if (arg0 != 26813) {
            field1841 = 73;
        }
        ++field1839;
        if (this.field1837) {
            this.field1836.method412('\u0001', arg0 ^ -26827);
            super.field2540.method2625(20296, 1);
            super.field2540.method2627(arg0 + -26720, (class262) null);
            super.field2540.method2625(20296, 0);
        } else {
            super.field2540.method2637(770, -513, 0, 5890);
        }
        super.field2540.method2669(8448, -128, 8448);
        this.field1837 = false;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILvfa;B)V", line = 37)
    public final void method83(int arg0, class262 arg1, byte arg2) {
        super.field2540.method2627(102, arg1);
        if (arg2 <= 87) {
            field1841 = 82;
        }
        ++field1832;
        super.field2540.method2650((byte) -77, arg0);
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lag;)V", line = 50)
    public class132(class469 arg0) {
        super(arg0);
        if (arg0.field6446) {
            this.field1836 = new class75(arg0, 2);
            this.field1836.method414((byte) 126, 0);
            super.field2540.method2625(20296, 1);
            super.field2540.method2669(7681, -95, 34165);
            super.field2540.method2636(2, 770, 34168, -111);
            super.field2540.method2637(770, -513, 0, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field2540.method2625(20296, 0);
            this.field1836.method415(false);
            this.field1836.method414((byte) 126, 1);
            super.field2540.method2625(20296, 1);
            super.field2540.method2669(8448, 23, 8448);
            super.field2540.method2636(2, 770, 34166, -91);
            super.field2540.method2637(770, -513, 0, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field2540.method2625(20296, 0);
            this.field1836.method415(false);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZZ)V", line = 90)
    public final void method84(boolean arg0, boolean arg1) {
        ++field1838;
        if (!arg0) {
            this.field1836 = null;
        }
        class327 var3 = super.field2540.method2681(-21692);
        if (this.field1836 != null && var3 != null && arg1) {
            this.field1836.method412('\u0000', -89);
            super.field2540.method2625(20296, 1);
            super.field2540.method2627(66, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2540.field6432.method366(13341), 0);
            OpenGL.glMatrixMode(5888);
            super.field2540.method2625(20296, 0);
            this.field1837 = true;
        } else {
            super.field2540.method2637(770, -513, 0, 34168);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZI)V", line = 123)
    public final void method79(boolean arg0, int arg1) {
        ++field1840;
        super.field2540.method2669(7681, -94, 8448);
        if (arg1 > -21) {
            this.field1837 = true;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(III)V", line = 136)
    public final void method81(int arg0, int arg1, int arg2) {
        ++field1833;
        if (arg0 != 2) {
            field1835 = true;
        }
    }
}
