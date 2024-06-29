import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class235 extends class631 {

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Z")
    private boolean field3160 = false;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Lup;")
    private class274 field3165;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "[I")
    public static int[] field3156 = new int[14];

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lgda;")
    public static class53 field3154 = new class53(42, 2);

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field3168 = 1;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Lqfa;")
    public static class98 field3167 = new class98(49, -1);

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V")
    public final void method1506(int arg0, boolean arg1) {
        super.field8722.method946(false, 8448, 7681);
        if (arg0 == 17660) {
            ++field3158;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Z")
    public final boolean method1507(byte arg0) {
        ++field3155;
        int var2 = 58 % ((arg0 - -9) / 53);
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILta;)V")
    public final void method1508(int arg0, int arg1, class210 arg2) {
        ++field3162;
        int var4 = 5 % ((arg1 - 52) / 62);
        super.field8722.method926(arg2, 110);
        super.field8722.method891(arg0, (byte) 17);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZZ)V")
    public final void method1509(boolean arg0, boolean arg1) {
        ++field3166;
        class375 var3 = super.field8722.method929(0);
        if (!arg0) {
            this.method1513(-112);
        }
        if (this.field3165 != null && var3 != null && arg1) {
            this.field3165.method1783(-119, '\u0000');
            super.field8722.method884(1, true);
            super.field8722.method926(var3, 50);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field8722.field1823.method355((byte) -115), 0);
            OpenGL.glMatrixMode(5888);
            super.field8722.method884(0, true);
            this.field3160 = true;
        } else {
            super.field8722.method948(34168, 0, 770, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static void method1510(byte arg0) {
        field3167 = null;
        if (arg0 != -85) {
            method1511(-76, (byte) -125);
        }
        field3154 = null;
        field3156 = null;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Leea;)V")
    public class235(class131 arg0) {
        super(arg0);
        if (arg0.field1886) {
            this.field3165 = new class274(arg0, 2);
            this.field3165.method1785(0, 91);
            super.field8722.method884(1, true);
            super.field8722.method946(false, 34165, 7681);
            super.field8722.method883((byte) 34, 2, 770, 34168);
            super.field8722.method948(34167, 0, 770, (byte) -128);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field8722.method884(0, true);
            this.field3165.method1784(-50135600);
            this.field3165.method1785(1, 89);
            super.field8722.method884(1, true);
            super.field8722.method946(false, 8448, 8448);
            super.field8722.method883((byte) 34, 2, 770, 34166);
            super.field8722.method948(5890, 0, 770, (byte) 104);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field8722.method884(0, true);
            this.field3165.method1784(-50135600);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)Z")
    public static final boolean method1511(int arg0, byte arg1) {
        if (arg1 >= -26) {
            method1510((byte) 48);
        }
        ++field3161;
        for (class37 var2 = (class37) class215.field2820.method2765(-12261); var2 != null; var2 = (class37) class215.field2820.method2759(-15361)) {
            if (class71.method592(var2.field463, (byte) -94) && ~((long) arg0) == ~var2.field474) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
    public final void method1512(int arg0, int arg1, int arg2) {
        ++field3157;
        if (arg1 < 72) {
            this.method1509(true, false);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public final void method1513(int arg0) {
        ++field3159;
        if (arg0 < 74) {
            field3167 = null;
        }
        if (!this.field3160) {
            super.field8722.method948(5890, 0, 770, (byte) 122);
        } else {
            this.field3165.method1783(-103, '\u0001');
            super.field8722.method884(1, true);
            super.field8722.method926((class210) null, 61);
            super.field8722.method884(0, true);
        }
        super.field8722.method946(false, 8448, 8448);
        this.field3160 = false;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
    public static final void method1514(int arg0) {
        ++field3164;
        for (class101 var1 = (class101) class400.field5666.method1176(24490); var1 != null; var1 = (class101) class400.field5666.method1178((byte) 71)) {
            if (!var1.field1198) {
                class748.method4158(var1.field1202, (byte) 84);
            } else {
                var1.field1198 = false;
            }
        }
        if (arg0 >= -41) {
            field3167 = null;
        }
    }
}
