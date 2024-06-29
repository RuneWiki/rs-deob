import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class213 extends class229 {

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "Z")
    private boolean field3030 = false;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "Lwu;")
    private class250 field3027;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "Luf;")
    public static class310 field3032 = new class310(63, 6);

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "[I")
    public static int[] field3037 = new int[1];

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
    public static int field3038 = 0;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "Lgu;")
    public static class409 field3039;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(III)Ljava/lang/String;", line = 3)
    public static final String method1278(int arg0, int arg1, int arg2) {
        ++field3040;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else {
            if (arg1 >= -22) {
                method1278(79, -105, -24);
            }
            if (~var3 > 2) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (~var3 < -4) {
                return "<col=80ff00>";
            } else {
                return ~var3 < -1 ? "<col=c0ff00>" : "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIZ)V", line = 45)
    public static final void method1279(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3026;
        if (class437.field6374.field4262 != 0 && arg1 != 0 && class292.field3915 < 50 && ~arg2 != 0) {
            class526.field7723[class292.field3915++] = new class20((byte) 1, arg2, arg1, arg3, arg0, 0);
        }
        if (arg4) {
            field3039 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIZ)Z", line = 63)
    public static final boolean method1280(int arg0, int arg1, boolean arg2) {
        ++field3034;
        if (!class180.method1095(arg0, (byte) -108, arg1)) {
            return false;
        } else {
            if (arg2) {
                field3038 = 114;
            }
            return ~(arg0 & 45056) != -1 | class385.method2215(arg1, arg0, 540800) | class329.method1832(1000, arg0, arg1) ? true : (arg1 & 55) == 0 & (class435.method2594(arg0, -51, arg1) | class233.method1357(0, arg1, arg0));
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILao;)V", line = 81)
    public final void method22(int arg0, int arg1, class188 arg2) {
        ++field3029;
        if (arg0 > -45) {
            this.method13((byte) -39);
        }
        super.field3194.method2412((byte) 4, arg2);
        super.field3194.method2365(true, arg1);
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)Z", line = 94)
    public final boolean method13(byte arg0) {
        ++field3028;
        if (arg0 <= 123) {
            method1280(11, -52, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lht;)V", line = 115)
    public class213(class410 arg0) {
        super(arg0);
        if (arg0.field5933) {
            this.field3027 = new class250(arg0, 2);
            this.field3027.method1471(2, 0);
            super.field3194.method2398(1, (byte) 102);
            super.field3194.method2383(34165, 79, 7681);
            super.field3194.method2362(34168, (byte) 65, 770, 2);
            super.field3194.method2379(770, (byte) -92, 34167, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field3194.method2398(0, (byte) -28);
            this.field3027.method1475(17);
            this.field3027.method1471(2, 1);
            super.field3194.method2398(1, (byte) 120);
            super.field3194.method2383(8448, 89, 8448);
            super.field3194.method2362(34166, (byte) 65, 770, 2);
            super.field3194.method2379(770, (byte) -120, 5890, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field3194.method2398(0, (byte) 120);
            this.field3027.method1475(17);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V", line = 154)
    public final void method19(int arg0) {
        ++field3035;
        if (this.field3030) {
            this.field3027.method1473(-2, '\u0001');
            super.field3194.method2398(1, (byte) 12);
            super.field3194.method2412((byte) 4, (class188) null);
            super.field3194.method2398(0, (byte) 13);
        } else {
            super.field3194.method2379(770, (byte) -123, 5890, 0);
        }
        super.field3194.method2383(8448, arg0 + -262018, 8448);
        this.field3030 = false;
        if (arg0 != 262144) {
            field3039 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZZ)V", line = 176)
    public final void method20(boolean arg0, boolean arg1) {
        if (!arg0) {
            method1280(37, 86, false);
        }
        ++field3041;
        class7 var3 = super.field3194.method2370(5);
        if (this.field3027 != null && var3 != null && arg1) {
            this.field3027.method1473(-2, '\u0000');
            super.field3194.method2398(1, (byte) 126);
            super.field3194.method2412((byte) 4, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3194.field5990.method348(14), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field3194.method2398(0, (byte) 123);
            this.field3030 = true;
        } else {
            super.field3194.method2379(770, (byte) -56, 34168, 0);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)V", line = 204)
    public final void method17(boolean arg0, int arg1) {
        super.field3194.method2383(8448, 82, 7681);
        if (arg1 != -27632) {
            method1280(36, -14, true);
        }
        ++field3031;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(III)V", line = 221)
    public final void method12(int arg0, int arg1, int arg2) {
        int var4 = -100 / ((arg1 - 13) / 46);
        ++field3033;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V", line = 240)
    public static void method1281(int arg0) {
        int var1 = -101 % ((-67 - arg0) / 55);
        field3032 = null;
        field3037 = null;
        field3039 = null;
    }
}
