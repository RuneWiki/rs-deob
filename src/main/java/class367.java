import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class367 extends class165 {

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Z")
    private boolean field4712 = false;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lrj;")
    private class359 field4716;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Ljia;")
    public static class336 field4709 = new class336();

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field4714 = 0;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lcw;")
    public static class21 field4707;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
    public final void method673(int arg0, boolean arg1) {
        ++field4710;
        class633 var3 = super.field2260.method2102(true);
        if (this.field4716 != null && var3 != null && arg1) {
            this.field4716.method2021(-43, '\u0000');
            super.field2260.method2196(1, (byte) 89);
            super.field2260.method2154(var3, -2);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2260.field4984.method2623((byte) 123), 0);
            OpenGL.glMatrixMode(5888);
            super.field2260.method2196(0, (byte) 89);
            this.field4712 = true;
        } else {
            super.field2260.method2190(0, 770, true, 34168);
        }
        if (arg0 > -115) {
            this.field4712 = true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Z")
    public final boolean method672(byte arg0) {
        if (arg0 <= 11) {
            this.method679((byte) -73);
        }
        ++field4711;
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public final void method679(byte arg0) {
        if (!this.field4712) {
            super.field2260.method2190(0, 770, true, 5890);
        } else {
            this.field4716.method2021(-61, '\u0001');
            super.field2260.method2196(1, (byte) 89);
            super.field2260.method2154((class396) null, -2);
            super.field2260.method2196(0, (byte) 89);
        }
        if (arg0 >= -97) {
            this.method678(true, 81);
        }
        ++field4715;
        super.field2260.method2207(8448, 8448, -25248);
        this.field4712 = false;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static void method2057(int arg0) {
        field4709 = null;
        field4707 = null;
        if (arg0 != 1) {
            field4707 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lep;)V")
    public class367(class371 arg0) {
        super(arg0);
        if (arg0.field5019) {
            this.field4716 = new class359(arg0, 2);
            this.field4716.method2024(0, 110);
            super.field2260.method2196(1, (byte) 89);
            super.field2260.method2207(34165, 7681, -25248);
            super.field2260.method2202(390803672, 770, 34168, 2);
            super.field2260.method2190(0, 770, true, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field2260.method2196(0, (byte) 89);
            this.field4716.method2022(0);
            this.field4716.method2024(1, 79);
            super.field2260.method2196(1, (byte) 89);
            super.field2260.method2207(8448, 8448, -25248);
            super.field2260.method2202(390803672, 770, 34166, 2);
            super.field2260.method2190(0, 770, true, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field2260.method2196(0, (byte) 89);
            this.field4716.method2022(0);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)V")
    public final void method675(int arg0, byte arg1, int arg2) {
        if (arg1 > 3) {
            ++field4708;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZLhl;)V")
    public final void method671(int arg0, boolean arg1, class396 arg2) {
        super.field2260.method2154(arg2, -2);
        ++field4706;
        super.field2260.method2208(arg0, 6406);
        if (!arg1) {
            method2057(14);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)V")
    public final void method678(boolean arg0, int arg1) {
        super.field2260.method2207(8448, 7681, arg1 + -25248);
        if (arg1 != 0) {
            this.method673(64, false);
        }
        ++field4713;
    }
}
