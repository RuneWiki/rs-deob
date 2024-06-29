import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class443 extends class283 {

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Z")
    private boolean field6162 = false;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Lfo;")
    private class518 field6169;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Lea;")
    public static class547 field6167 = new class547(43, -1);

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "[I")
    public static int[] field6171 = new int[4096];

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "Ljga;")
    public static class716 field6170;

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field6171[var0] = class202.method1118(-83, var0);
        }
        field6174 = 0;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lac;)V", line = 3)
    public class443(class541 arg0) {
        super(arg0);
        if (arg0.field7602) {
            this.field6169 = new class518(arg0, 2);
            this.field6169.method2852(0, -30389);
            super.field3749.method2988(1, 847872872);
            super.field3749.method3042(7681, 8960, 34165);
            super.field3749.method2983(2, 770, 86, 34168);
            super.field3749.method3029(770, 0, 34200, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field3749.method2988(0, 847872872);
            this.field6169.method2851((byte) 100);
            this.field6169.method2852(1, -30389);
            super.field3749.method2988(1, 847872872);
            super.field3749.method3042(8448, 8960, 8448);
            super.field3749.method2983(2, 770, -62, 34166);
            super.field3749.method3029(770, 0, 34200, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field3749.method2988(0, 847872872);
            this.field6169.method2851((byte) -125);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V", line = 45)
    public static void method2491(byte arg0) {
        int var1 = 116 % ((arg0 - -58) / 42);
        field6170 = null;
        field6171 = null;
        field6167 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V", line = 56)
    public final void method137(int arg0, int arg1, int arg2) {
        if (arg2 > -2) {
            this.method144((byte) 108);
        }
        ++field6168;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZZ)V", line = 67)
    public final void method141(boolean arg0, boolean arg1) {
        ++field6165;
        class132 var3 = super.field3749.method2970(-126);
        if (arg0) {
            field6170 = null;
        }
        if (this.field6169 != null && var3 != null && arg1) {
            this.field6169.method2853('\u0000', arg0);
            super.field3749.method2988(1, 847872872);
            super.field3749.method3006(1, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3749.field7565.method1510(54), 0);
            OpenGL.glMatrixMode(5888);
            super.field3749.method2988(0, 847872872);
            this.field6162 = true;
        } else {
            super.field3749.method3029(770, 0, 34200, 34168);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lcu;ZI)V", line = 94)
    public final void method140(class221 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            super.field3749.method3006(1, arg0);
            ++field6166;
            super.field3749.method3039(260, arg2);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V", line = 106)
    public final void method142(boolean arg0, int arg1) {
        super.field3749.method3042(7681, arg1 + 8705, 8448);
        ++field6173;
        if (arg1 != 255) {
            field6167 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Z", line = 121)
    public final boolean method138(int arg0) {
        ++field6164;
        if (arg0 != 31565) {
            field6170 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 134)
    public final void method144(byte arg0) {
        if (!this.field6162) {
            super.field3749.method3029(770, 0, 34200, 5890);
        } else {
            this.field6169.method2853('\u0001', false);
            super.field3749.method2988(1, 847872872);
            super.field3749.method3006(1, (class221) null);
            super.field3749.method2988(0, 847872872);
        }
        ++field6163;
        super.field3749.method3042(8448, 8960, 8448);
        if (arg0 <= 25) {
            field6170 = null;
        }
        this.field6162 = false;
    }
}
