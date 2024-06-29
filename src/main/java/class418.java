import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class418 extends class86 {

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "Z")
    private boolean field6376 = false;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lhq;")
    private class110 field6365;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field6370 = 0;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[I")
    public static int[] field6373 = new int[8];

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Luu;")
    public static class191 field6372;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lf;")
    public static class540 field6367;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Z")
    public static final boolean method2556(int arg0, int arg1, int arg2) {
        if (arg0 > -127) {
            return true;
        } else {
            ++field6371;
            return (class307.method1928(arg2, arg1, 33) | class412.method2538(arg1, arg2, 34) | class37.method317(arg2, arg1, false)) & class435.method2646(arg1, arg2, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZB)V")
    public final void method235(boolean arg0, byte arg1) {
        super.field1248.method2030(8448, 7681, (byte) 71);
        if (arg1 != 112) {
            field6379 = 106;
        }
        ++field6375;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILcd;III)V")
    public static final void method2557(int arg0, class209 arg1, int arg2, int arg3, int arg4) {
        ++field6368;
        if (arg4 != 5888) {
            field6372 = null;
        }
        for (class179 var5 = (class179) class86.field1251.method445(arg4 ^ 5921); var5 != null; var5 = (class179) class86.field1251.method451(false)) {
            if (var5.field2406 == arg0 && arg2 << 7 == var5.field2394 && arg3 << 7 == var5.field2392 && ~var5.field2402.field2936 == ~arg1.field2936) {
                if (var5.field2400 != null) {
                    class31.field463.method883(var5.field2400);
                    var5.field2400 = null;
                }
                if (var5.field2391 != null) {
                    class31.field463.method883(var5.field2391);
                    var5.field2391 = null;
                }
                var5.method25(-13489);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method237(int arg0) {
        ++field6377;
        if (!this.field6376) {
            super.field1248.method2044(0, 770, (byte) 64, 5890);
        } else {
            this.field6365.method693((byte) 107, '\u0001');
            super.field1248.method2040((byte) -127, 1);
            super.field1248.method2075((class538) null, 0);
            super.field1248.method2040((byte) 28, 0);
        }
        super.field1248.method2030(8448, 8448, (byte) 71);
        this.field6376 = false;
        if (arg0 != 27670) {
            this.method236(true, (class538) null, 29);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLlr;I)V")
    public final void method236(boolean arg0, class538 arg1, int arg2) {
        ++field6378;
        super.field1248.method2075(arg1, 0);
        if (!arg0) {
            method2558((byte) -1);
        }
        super.field1248.method2045(34023, arg2);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)Z")
    public final boolean method238(byte arg0) {
        if (arg0 > -2) {
            return true;
        } else {
            ++field6380;
            return true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lnq;)V")
    public class418(class325 arg0) {
        super(arg0);
        if (arg0.field5025) {
            this.field6365 = new class110(arg0, 2);
            this.field6365.method694(4864, 0);
            super.field1248.method2040((byte) -94, 1);
            super.field1248.method2030(34165, 7681, (byte) 71);
            super.field1248.method2059(34168, 770, 2, -31277);
            super.field1248.method2044(0, 770, (byte) 64, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field1248.method2040((byte) 96, 0);
            this.field6365.method691(-36);
            this.field6365.method694(4864, 1);
            super.field1248.method2040((byte) -88, 1);
            super.field1248.method2030(8448, 8448, (byte) 71);
            super.field1248.method2059(34166, 770, 2, -31277);
            super.field1248.method2044(0, 770, (byte) 64, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field1248.method2040((byte) -111, 0);
            this.field6365.method691(-128);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)V")
    public final void method239(int arg0, byte arg1, int arg2) {
        ++field6369;
        int var4 = 7 / ((-50 - arg1) / 53);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
    public static void method2558(byte arg0) {
        field6373 = null;
        if (arg0 == -97) {
            field6372 = null;
            field6367 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)V")
    public final void method241(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field6370 = 12;
        }
        ++field6374;
        class1 var3 = super.field1248.method2080(27094);
        if (this.field6365 != null && var3 != null && arg1) {
            this.field6365.method693((byte) 109, '\u0000');
            super.field1248.method2040((byte) 35, 1);
            super.field1248.method2075(var3, 0);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field1248.field4986.method2554(arg0 + 1), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field1248.method2040((byte) -1, 0);
            this.field6376 = true;
        } else {
            super.field1248.method2044(0, 770, (byte) 64, 34168);
        }
    }
}
