import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class251 {

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public int field4309 = -1;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Ljd;")
    private static class85 field4303 = class221.method1499("fr", (byte) 107);

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Ljd;")
    private static class85 field4314 = class221.method1499("de", (byte) -59);

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Ljd;")
    private static class85 field4305 = class221.method1499("Loading title screen )2 ", (byte) -45);

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Ljd;")
    private static class85 field4310 = class221.method1499("en", (byte) 99);

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field4312 = 0;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Ljd;")
    private static class85 field4307 = class221.method1499(")3de", (byte) 94);

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "Ljd;")
    public static class85 field4319 = class221.method1499(")4a=", (byte) 103);

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field4316 = 0;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "Ljd;")
    private static class85 field4326 = class221.method1499(")3fr", (byte) -120);

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "Ljd;")
    public static class85 field4324 = class221.method1499("Zugewiesener Speicher)3", (byte) -84);

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "[I")
    public static int[] field4313 = new int[500];

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field4308 = 0;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Ljd;")
    private static class85 field4317 = class221.method1499(")3en", (byte) -71);

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "[Ljd;")
    private static class85[] field4327 = new class85[] { field4317, field4307, field4326 };

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "[Ljd;")
    public static class85[] field4311 = new class85[] { field4310, field4314, field4303 };

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "Z")
    public static boolean field4330 = false;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "Ljd;")
    public static class85 field4333 = field4305;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public int field4301;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public int field4304;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public int field4306;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public int field4321;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method1730(int arg0) {
        class108.field1903.method202(103);
        for (int var1 = arg0; var1 < 32; var1++) {
            class190.field3257[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class153.field2637[var2] = 0L;
        }
        class249.field4296 = 0;
        field4323++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static void method1731(byte arg0) {
        field4303 = null;
        field4324 = null;
        field4310 = null;
        field4314 = null;
        field4311 = null;
        field4333 = null;
        field4317 = null;
        field4327 = null;
        field4305 = null;
        field4313 = null;
        field4319 = null;
        field4307 = null;
        if (arg0 == -86) {
            field4326 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjd;)I")
    public static final int method1732(int arg0, class85 arg1) {
        field4329++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = -107 % ((arg0 - 57) / 60);
        for (int var3 = 0; var3 < class45.field810; var3++) {
            if (arg1.method582(class1.field5[var3], -42)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBI)I")
    public static final int method1733(int arg0, int arg1, byte arg2, int arg3) {
        field4322++;
        if (arg2 != 122) {
            field4305 = null;
        }
        if ((class228.field3952[arg0][arg1][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (class228.field3952[1][arg1][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIB)I")
    public static final int method1734(int arg0, int arg1, byte arg2) {
        if (arg2 != 29) {
            method1734(-107, 79, (byte) 103);
        }
        field4318++;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)Lpe;")
    public static final class233 method1735(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3656;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static final void method1736(int arg0) {
        if (arg0 != -9816) {
            field4312 = -1;
        }
        for (int var1 = 0; var1 < class246.field4204; var1++) {
            class21 var2 = class169.method1134(true, var1);
            if (var2 != null && var2.field298 == 0) {
                class260.field4599[var1] = 0;
                class256.field4563[var1] = 0;
            }
        }
        field4302++;
        class48.field857 = new class204(16);
    }
}
