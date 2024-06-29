import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class310 extends class154 {

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Ldg;")
    public static class317 field5491 = new class317();

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "Lud;")
    private static class279 field5498 = class130.method1024("cyan:", 255);

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "Lud;")
    public static class279 field5494 = field5498;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "Lud;")
    public static class279 field5501 = field5498;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "Lud;")
    public static class279 field5504 = class130.method1024("null", 255);

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "Lud;")
    public static class279 field5502 = class130.method1024("loc", 255);

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "[Lud;")
    public static class279[] field5505 = new class279[1000];

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "Lvd;")
    public static class133 field5503;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Lok;")
    public static class149 field5499;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "[Lom;")
    public static class70[] field5496;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIII)Z", line = 14)
    public static final boolean method2203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;", line = 40)
    public static final Class method2204(String arg0, boolean arg1) throws ClassNotFoundException {
        field5495++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else {
            if (!arg1) {
                field5496 = (class70[]) null;
            }
            if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 79)
    public static final void method2205(int arg0) {
        if (arg0 > 51) {
            field5492++;
            class140.field2546.method1338((byte) -122);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 93)
    public static void method2206(boolean arg0) {
        field5504 = null;
        field5491 = null;
        field5503 = null;
        field5494 = null;
        if (arg0) {
            method2208(-57, (byte) -115, 45);
        }
        field5501 = null;
        field5502 = null;
        field5505 = null;
        field5498 = null;
        field5496 = null;
        field5499 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[Lvk;)V", line = 123)
    public static final void method2207(int arg0, class168[] arg1) {
        class174.field3136[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)I", line = 128)
    public static final int method2208(int arg0, byte arg1, int arg2) {
        field5500++;
        if (arg1 != 102) {
            field5501 = (class279) null;
        }
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLgf;)V", line = 162)
    public static final void method2209(byte arg0, class8 arg1) {
        if (arg0 > -4) {
            return;
        }
        field5497++;
        int var2 = arg1.field326;
        if (var2 == 324) {
            if (class144.field2612 == -1) {
                class144.field2612 = arg1.field286;
                class181.field3299 = arg1.field216;
            }
            if (class251.field4480.field932) {
                arg1.field286 = class144.field2612;
            } else {
                arg1.field286 = class181.field3299;
            }
        } else if (var2 == 325) {
            if (class144.field2612 == -1) {
                class181.field3299 = arg1.field216;
                class144.field2612 = arg1.field286;
            }
            if (class251.field4480.field932) {
                arg1.field286 = class181.field3299;
            } else {
                arg1.field286 = class144.field2612;
            }
        } else if (var2 == 327) {
            arg1.field237 = 150;
            arg1.field227 = (int) (Math.sin((double) class8.field279 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field238 = 5;
            arg1.field274 = -1;
        } else if (var2 == 328) {
            if (class72.field1420.field4197 == null) {
                arg1.field274 = 0;
            } else {
                arg1.field237 = 150;
                arg1.field227 = (int) (Math.sin((double) class8.field279 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field238 = 5;
                arg1.field274 = ((int) class72.field1420.field4197.method2013(120) << 11) + 2047;
                arg1.field191 = class72.field1420.field25;
                arg1.field298 = class72.field1420.field9;
                arg1.field217 = class72.field1420.field14;
                arg1.field222 = 0;
            }
        }
    }
}
