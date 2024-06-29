import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class686 extends class497 {

    @OriginalMember(owner = "client!kja", name = "l", descriptor = "Z")
    private boolean field9639 = false;

    @OriginalMember(owner = "client!kja", name = "r", descriptor = "Lpba;")
    private class352 field9645;

    @OriginalMember(owner = "client!kja", name = "q", descriptor = "Ltja;")
    public static class288 field9644 = new class288(9, 19);

    @OriginalMember(owner = "client!kja", name = "s", descriptor = "[I")
    public static int[] field9646 = new int[3];

    @OriginalMember(owner = "client!kja", name = "g", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!kja", name = "h", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!kja", name = "i", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!kja", name = "j", descriptor = "I")
    public static int field9637;

    @OriginalMember(owner = "client!kja", name = "k", descriptor = "I")
    public static int field9638;

    @OriginalMember(owner = "client!kja", name = "m", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!kja", name = "n", descriptor = "I")
    public static int field9641;

    @OriginalMember(owner = "client!kja", name = "o", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!kja", name = "p", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!kja", name = "t", descriptor = "Lbd;")
    public static class67 field9647;

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method3808(boolean arg0) {
        ++field9640;
        int var1 = 0;
        if (~class712.field9959.field1288.method3327(109) == -2) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (!arg0) {
            if (~class712.field9959.field1307.method1209(28) == -1) {
                var1 |= 64;
            }
            class496.method2869((byte) -80, var1);
            class350.field5132.method3730(8, var1);
            class770.field10602.method2473(var1, (byte) 114);
            class364.field5309.method3339(var1, 100);
            class784.field10798.method3968(var1, (byte) -111);
            class788.method4357(var1, (byte) -66);
            class749.method4143((byte) -101, var1);
            class679.method3752(var1, 0);
            class382.method2437(var1, true);
            class627.method3531(-100);
        }
    }

    @OriginalMember(owner = "client!kja", name = "c", descriptor = "(I)V", line = 41)
    public final void method161(int arg0) {
        if (this.field9639) {
            this.field9645.method2219('\u0001', (byte) -89);
            super.field6867.method1637(33984, 1);
            super.field6867.method1653((byte) 81, (class7) null);
            super.field6867.method1637(33984, 0);
        } else {
            super.field6867.method1657((byte) 90, 770, 0, 5890);
        }
        ++field9635;
        super.field6867.method1622(8448, 8448, (byte) -100);
        this.field9639 = false;
        if (arg0 != -1756) {
            field9647 = null;
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(ILil;I)V", line = 63)
    public final void method158(int arg0, class7 arg1, int arg2) {
        super.field6867.method1653((byte) 81, arg1);
        if (arg0 != 9) {
            field9644 = null;
        }
        ++field9634;
        super.field6867.method1589(-4, arg2);
    }

    @OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(Ldia;)V", line = 75)
    public class686(class246 arg0) {
        super(arg0);
        if (arg0.field3672) {
            this.field9645 = new class352(arg0, 2);
            this.field9645.method2218(0, false);
            super.field6867.method1637(33984, 1);
            super.field6867.method1622(7681, 34165, (byte) 127);
            super.field6867.method1641(34168, 770, 2, 34192);
            super.field6867.method1657((byte) 90, 770, 0, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field6867.method1637(33984, 0);
            this.field9645.method2220(27294);
            this.field9645.method2218(1, false);
            super.field6867.method1637(33984, 1);
            super.field6867.method1622(8448, 8448, (byte) 124);
            super.field6867.method1641(34166, 770, 2, 34192);
            super.field6867.method1657((byte) 90, 770, 0, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field6867.method1637(33984, 0);
            this.field9645.method2220(27294);
        }
    }

    @OriginalMember(owner = "client!kja", name = "b", descriptor = "(I)Z", line = 115)
    public final boolean method157(int arg0) {
        ++field9642;
        return arg0 != -6808 ? true : true;
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIIII)V", line = 129)
    public static final void method3809(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 == 22486) {
            ++field9643;
            float var5 = (float) class375.field5436 / (float) class375.field5448;
            int var6 = arg3;
            int var7 = arg1;
            if (!(var5 < 1.0F)) {
                var6 = (int) ((float) arg1 / var5);
            } else {
                var7 = (int) ((float) arg3 * var5);
            }
            int var8 = arg0 - (-var7 + arg1) / 2;
            int var9 = arg4 - (-var6 + arg3) / 2;
            class276.field4092 = class375.field5448 * var9 / var6;
            class587.field7831 = -1;
            class66.field947 = -(class375.field5436 * var8 / var7) + class375.field5436;
            class232.field3167 = -1;
            class155.method1131((byte) 66);
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(IZ)V", line = 162)
    public final void method164(int arg0, boolean arg1) {
        ++field9637;
        if (arg0 == 0) {
            super.field6867.method1622(7681, 8448, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!kja", name = "d", descriptor = "(I)V", line = 178)
    public static final void method3810(int arg0) {
        for (class81 var1 = (class81) class57.field805.method697(0); var1 != null; var1 = (class81) class57.field805.method699(true)) {
            if (~var1.field1151 < -2) {
                var1.field1151 = 0;
                class498.field6877.method1544(true, var1, ((class275) var1.field1155.field1176.field4146).field4087);
                var1.field1155.method700(108);
            }
        }
        ++field9638;
        class491.field6811 = 0;
        class746.field10297 = 0;
        if (arg0 < 39) {
            method3810(-110);
        }
        class280.field4138.method2549(-63);
        class643.field8925.method3959(0);
        class57.field805.method700(90);
        class526.field7216 = false;
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(III)V", line = 209)
    public final void method162(int arg0, int arg1, int arg2) {
        ++field9636;
        if (arg0 < 122) {
            this.method164(-21, true);
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(B)V", line = 220)
    public static void method3811(byte arg0) {
        field9646 = null;
        field9644 = null;
        field9647 = null;
        if (arg0 < 39) {
            method3810(93);
        }
    }

    @OriginalMember(owner = "client!kja", name = "b", descriptor = "(ZZ)V", line = 234)
    public final void method163(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method161(-104);
        }
        ++field9641;
        class196 var3 = super.field6867.method1618(1);
        if (this.field9645 != null && var3 != null && arg0) {
            this.field9645.method2219('\u0000', (byte) -89);
            super.field6867.method1637(33984, 1);
            super.field6867.method1653((byte) 89, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6867.field3566.method977((byte) 76), 0);
            OpenGL.glMatrixMode(5888);
            super.field6867.method1637(33984, 0);
            this.field9639 = true;
        } else {
            super.field6867.method1657((byte) 90, 770, 0, 34168);
        }
    }
}
