import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class213 extends class548 {

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Z")
    private boolean field2790 = false;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lik;")
    private class222 field2789;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Ljb;")
    public static class519 field2791 = new class519(98, 1);

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "Ljea;")
    public static class474 field2798 = new class474(9, 3);

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "Ljb;")
    public static class519 field2799 = new class519(42, 3);

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field2800 = -1;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)Z")
    public final boolean method756(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field2797;
            return true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static void method1380(int arg0) {
        field2799 = null;
        if (arg0 != 0) {
            method1381(89);
        }
        field2798 = null;
        field2791 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)V")
    public final void method758(boolean arg0, int arg1) {
        super.field7571.method1630(8448, 7681, 123);
        ++field2796;
        if (arg1 != 0) {
            this.method754(true, false);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
    public final void method753(int arg0, int arg1, int arg2) {
        if (arg2 == 14106) {
            ++field2795;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public static final void method1381(int arg0) {
        int var1 = 4 % ((-41 - arg0) / 40);
        for (int var2 = 0; ~var2 > ~class178.field2352; ++var2) {
            int var3 = class245.field3206[var2];
            class316 var4 = (class316) class176.field2326.method1248(98, (long) var3);
            if (var4 != null) {
                class22 var5 = var4.field4455;
                class377.method2361(var5.field217.field4300, var5, true);
            }
        }
        ++field2792;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public final void method759(int arg0) {
        ++field2787;
        if (this.field2790) {
            this.field2789.method1413('\u0001', 0);
            super.field7571.method1631(1, -96);
            super.field7571.method1595((byte) 117, (class205) null);
            super.field7571.method1631(0, -98);
        } else {
            super.field7571.method1581(770, arg0 ^ 13115, 0, 5890);
        }
        if (arg0 != 3) {
            this.method758(true, -22);
        }
        super.field7571.method1630(8448, 8448, 110);
        this.field2790 = false;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Llf;)V")
    public class213(class250 arg0) {
        super(arg0);
        if (arg0.field3603) {
            this.field2789 = new class222(arg0, 2);
            this.field2789.method1416(0, -28867);
            super.field7571.method1631(1, -89);
            super.field7571.method1630(34165, 7681, 117);
            super.field7571.method1600(17104, 34168, 2, 770);
            super.field7571.method1581(770, 13112, 0, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field7571.method1631(0, 75);
            this.field2789.method1418(4864);
            this.field2789.method1416(1, -28867);
            super.field7571.method1631(1, 106);
            super.field7571.method1630(8448, 8448, 106);
            super.field7571.method1600(17104, 34166, 2, 770);
            super.field7571.method1581(770, 13112, 0, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field7571.method1631(0, -79);
            this.field2789.method1418(4864);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V")
    public final void method754(boolean arg0, boolean arg1) {
        ++field2794;
        class107 var3 = super.field7571.method1577(!arg1);
        if (this.field2789 != null && var3 != null && arg0) {
            this.field2789.method1413('\u0000', 0);
            super.field7571.method1631(1, 80);
            super.field7571.method1595((byte) 101, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field7571.field3551.method3291(-105), 0);
            OpenGL.glMatrixMode(5888);
            super.field7571.method1631(0, -85);
            this.field2790 = true;
        } else {
            super.field7571.method1581(770, 13112, 0, 34168);
        }
        if (arg1) {
            field2798 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JIZ)Ljava/lang/String;")
    public static final String method1382(long arg0, int arg1, boolean arg2) {
        ++field2788;
        class215.method1391(arg2, arg0);
        int var4 = class79.field1085.get(5);
        int var5 = 1 + class79.field1085.get(2);
        int var6 = class79.field1085.get(1);
        return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lru;II)V")
    public final void method760(class205 arg0, int arg1, int arg2) {
        super.field7571.method1595((byte) 117, arg0);
        ++field2793;
        super.field7571.method1601(25456, arg2);
        if (arg1 != -1) {
            this.method758(true, -121);
        }
    }
}
