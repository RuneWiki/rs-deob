import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class726 extends class345 {

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "Z")
    private boolean field10114 = false;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "Lvh;")
    private class363 field10120;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "Lhg;")
    public static class693 field10117 = new class693(78, -1);

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field10124 = new String[200];

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "[[I")
    public static int[][] field10125 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field10115;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field10118;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field10119;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    public static int field10122;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    public static int field10123;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field10126;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    public static int field10127;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "Lqg;")
    public static class465 field10121;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IILcj;)V")
    public final void method36(int arg0, int arg1, class695 arg2) {
        super.field4357.method2850(-101, arg2);
        if (arg0 != 50560) {
            field10125 = null;
        }
        ++field10115;
        super.field4357.method2800(arg1, -38);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        ++field10123;
        if (this.field10114) {
            this.field10120.method2099('\u0001', -118);
            super.field4357.method2847(1, false);
            super.field4357.method2850(95, (class695) null);
            super.field4357.method2847(0, false);
        } else {
            super.field4357.method2788(770, 5890, false, 0);
        }
        super.field4357.method2799(-27874, 8448, 8448);
        int var2 = -62 % ((60 - arg0) / 60);
        this.field10114 = false;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Z")
    public final boolean method38(int arg0) {
        ++field10118;
        if (arg0 != 50560) {
            method4052((byte) 73);
        }
        return true;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZII)V")
    public final void method37(boolean arg0, int arg1, int arg2) {
        ++field10126;
        if (!arg0) {
            method4051(true);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZB)V")
    public final void method34(boolean arg0, byte arg1) {
        if (arg1 == -82) {
            ++field10127;
            class193 var3 = super.field4357.method2813((byte) 122);
            if (this.field10120 != null && var3 != null && arg0) {
                this.field10120.method2099('\u0000', -121);
                super.field4357.method2847(1, false);
                super.field4357.method2850(-88, var3);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field4357.field6811.method609(12), 0);
                OpenGL.glMatrixMode(5888);
                super.field4357.method2847(0, false);
                this.field10114 = true;
            } else {
                super.field4357.method2788(770, 34168, false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lbi;)V")
    public class726(class483 arg0) {
        super(arg0);
        if (arg0.field6914) {
            this.field10120 = new class363(arg0, 2);
            this.field10120.method2097(0, -72);
            super.field4357.method2847(1, false);
            super.field4357.method2799(-27874, 34165, 7681);
            super.field4357.method2775(34168, (byte) -88, 770, 2);
            super.field4357.method2788(770, 34167, false, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field4357.method2847(0, false);
            this.field10120.method2100(71);
            this.field10120.method2097(1, -127);
            super.field4357.method2847(1, false);
            super.field4357.method2799(-27874, 8448, 8448);
            super.field4357.method2775(34166, (byte) -88, 770, 2);
            super.field4357.method2788(770, 5890, false, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field4357.method2847(0, false);
            this.field10120.method2100(29);
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V")
    public static final void method4050(byte arg0) {
        if (arg0 != 26) {
            method4052((byte) 17);
        }
        ++field10116;
        for (int var1 = 0; var1 < 5; ++var1) {
            class193.field2644[var1] = false;
        }
        class164.field2275 = 0;
        class85.field1170 = -1;
        class459.field6112 = -1;
        class650.field9023 = 1;
        class35.field560 = -1;
        class746.field10437 = -1;
        client.field3990 = 0;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZI)V")
    public final void method40(boolean arg0, int arg1) {
        ++field10122;
        super.field4357.method2799(arg1 + -78434, 8448, 7681);
        if (arg1 != 50560) {
            this.field10120 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
    public static void method4051(boolean arg0) {
        if (!arg0) {
            field10121 = null;
        }
        field10121 = null;
        field10117 = null;
        field10125 = null;
        field10124 = null;
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(B)V")
    public static final void method4052(byte arg0) {
        class739.field10303.method511((0.1F * (float) class748.field10451.field10403.method1451((byte) 111) + 0.7F) * class102.field1412);
        ++field10119;
        if (arg0 == -113) {
            class739.field10303.method548(class563.field7923, class372.field4780, class383.field4858, (float) (class699.field9723 << 2), (float) (class154.field2098 << 2), (float) (class534.field7407 << 2));
            class739.field10303.method496(class621.field8562);
        }
    }
}
