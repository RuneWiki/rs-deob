import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class71 extends class610 {

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "Z")
    private boolean field978 = false;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "Lml;")
    private class353 field973;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "Z")
    public static boolean field977 = false;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "Lfc;")
    public static class235 field976 = new class235(91, 4);

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)V", line = 5)
    public static void method577(int arg0) {
        if (arg0 == -15843) {
            field976 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZZ)V", line = 17)
    public final void method254(boolean arg0, boolean arg1) {
        if (!arg0) {
            field979 = -125;
        }
        ++field974;
        super.field8473.method1798(false, 7681, 8448);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIB)V", line = 28)
    public final void method258(int arg0, int arg1, byte arg2) {
        if (arg2 == 70) {
            ++field971;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILit;)V", line = 39)
    public final void method255(int arg0, int arg1, class591 arg2) {
        ++field975;
        if (arg0 == 256) {
            super.field8473.method1804(false, arg2);
            super.field8473.method1801(arg1, 34166);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)Z", line = 51)
    public final boolean method262(int arg0) {
        if (arg0 != -1) {
            field977 = false;
        }
        ++field972;
        return true;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZI)V", line = 63)
    public final void method257(boolean arg0, int arg1) {
        ++field980;
        class389 var3 = super.field8473.method1746(0);
        if (this.field973 != null && var3 != null && arg0) {
            this.field973.method2094((byte) 119, '\u0000');
            super.field8473.method1747(1, (byte) 108);
            super.field8473.method1804(false, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field8473.field4257.method2909((byte) 42), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field8473.method1747(0, (byte) 108);
            this.field978 = true;
        } else {
            super.field8473.method1811(770, 0, false, 34168);
        }
        if (arg1 > -19) {
            field977 = false;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V", line = 98)
    public static final void method578(int arg0, int arg1) {
        ++field969;
        class328 var2 = class44.field661;
        synchronized (class44.field661) {
            class44.field661.method1989(arg0, (byte) 120);
        }
        class328 var3 = class533.field7259;
        synchronized (class533.field7259) {
            class533.field7259.method1989(arg0, (byte) 116);
        }
        if (arg1 != 770) {
            method577(-86);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V", line = 117)
    public final void method252(int arg0) {
        ++field970;
        if (this.field978) {
            this.field973.method2094((byte) 121, '\u0001');
            super.field8473.method1747(1, (byte) 108);
            super.field8473.method1804(false, (class591) null);
            super.field8473.method1747(0, (byte) 108);
        } else {
            super.field8473.method1811(770, 0, false, 5890);
        }
        super.field8473.method1798(false, 8448, 8448);
        this.field978 = false;
        if (arg0 != 31130) {
            field976 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Len;)V", line = 145)
    public class71(class289 arg0) {
        super(arg0);
        if (arg0.field4325) {
            this.field973 = new class353(arg0, 2);
            this.field973.method2097(0, -14434);
            super.field8473.method1747(1, (byte) 108);
            super.field8473.method1798(false, 7681, 34165);
            super.field8473.method1797(2, (byte) 80, 770, 34168);
            super.field8473.method1811(770, 0, false, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field8473.method1747(0, (byte) 108);
            this.field973.method2099(6493);
            this.field973.method2097(1, -14434);
            super.field8473.method1747(1, (byte) 108);
            super.field8473.method1798(false, 8448, 8448);
            super.field8473.method1797(2, (byte) 65, 770, 34166);
            super.field8473.method1811(770, 0, false, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field8473.method1747(0, (byte) 108);
            this.field973.method2099(6493);
        }
    }
}
