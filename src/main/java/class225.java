import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class225 extends class189 {

    @OriginalMember(owner = "client!on", name = "m", descriptor = "Z")
    private boolean field3235 = false;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "Lgk;")
    private class336 field3245;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "Z")
    public static boolean field3238 = false;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field3233 = 0;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "[I")
    public static int[] field3236 = new int[32];

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public static int field3244 = 0;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3240;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
    public final void method48(boolean arg0) {
        if (!this.field3235) {
            super.field2702.method2956(770, 5890, 0, (byte) 55);
        } else {
            this.field3245.method2006('\u0001', -14591);
            super.field2702.method2940(1, (byte) 118);
            super.field2702.method2968((class478) null, -104);
            super.field2702.method2940(0, (byte) 84);
        }
        ++field3246;
        super.field2702.method2935((byte) 87, 8448, 8448);
        if (arg0) {
            this.field3235 = false;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)Z")
    public final boolean method53(byte arg0) {
        ++field3242;
        int var2 = -32 % ((-58 - arg0) / 43);
        return true;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)V")
    public final void method47(boolean arg0, int arg1) {
        if (arg1 == 2) {
            ++field3241;
            super.field2702.method2935((byte) 87, 7681, 8448);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(ZI)V")
    public final void method55(boolean arg0, int arg1) {
        int var3 = 25 / ((arg1 - 36) / 46);
        ++field3239;
        class55 var4 = super.field2702.method2982((byte) 65);
        if (this.field3245 != null && var4 != null && arg0) {
            this.field3245.method2006('\u0000', -14591);
            super.field2702.method2940(1, (byte) 117);
            super.field2702.method2968(var4, -83);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2702.field7390.method1728(0), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field2702.method2940(0, (byte) 116);
            this.field3235 = true;
        } else {
            super.field2702.method2956(770, 34168, 0, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lih;)V")
    public class225(class503 arg0) {
        super(arg0);
        if (arg0.field7408) {
            this.field3245 = new class336(arg0, 2);
            this.field3245.method2012(4864, 0);
            super.field2702.method2940(1, (byte) 99);
            super.field2702.method2935((byte) 87, 7681, 34165);
            super.field2702.method2969(2, 4611, 34168, 770);
            super.field2702.method2956(770, 34167, 0, (byte) 55);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field2702.method2940(0, (byte) 90);
            this.field3245.method2013(4864);
            this.field3245.method2012(4864, 1);
            super.field2702.method2940(1, (byte) 104);
            super.field2702.method2935((byte) 87, 8448, 8448);
            super.field2702.method2969(2, 4611, 34166, 770);
            super.field2702.method2956(770, 5890, 0, (byte) 55);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field2702.method2940(0, (byte) 103);
            this.field3245.method2013(4864);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
    public static final void method1385(byte arg0) {
        ++field3234;
        if (class375.field5328 != null) {
            class375.field5328.method1801(0);
            class375.field5328 = null;
            class176.field2533 = null;
        }
        if (arg0 > -71) {
            method1385((byte) -59);
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(Z)V")
    public static void method1386(boolean arg0) {
        field3240 = null;
        if (!arg0) {
            field3236 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lsv;IB)V")
    public final void method51(class478 arg0, int arg1, byte arg2) {
        super.field2702.method2968(arg0, arg2 ^ 22);
        ++field3237;
        if (arg2 == -58) {
            super.field2702.method2999(arg1, 108);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BII)V")
    public final void method52(byte arg0, int arg1, int arg2) {
        ++field3247;
        if (arg0 != 117) {
            field3236 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lhm;III)V")
    public static final void method1387(class150 arg0, int arg1, int arg2, int arg3) {
        ++field3243;
        if (arg0 != null) {
            if (arg3 != 34165) {
                field3244 = -119;
            }
            if (arg0.field2016 != null) {
                class389 var4 = new class389();
                var4.field5457 = arg0;
                var4.field5466 = arg0.field2016;
                class495.method2866(var4);
            }
            class231.field3397 = arg0.field2134;
            class319.field4621 = arg1;
            class432.field6097 = arg0.field2096;
            class483.field6724 = arg0.field2089;
            class180.field2579 = arg2;
            class474.field6601 = arg0.field2007;
            class235.field3424 = arg0.field2105;
            class427.field6024 = true;
            class187.method1190(arg0, 98);
        }
    }
}
