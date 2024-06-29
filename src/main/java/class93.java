import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class93 extends class19 {

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
    public int field2126 = 0;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "Lkc;")
    public static class67 field2123 = class19.method144("Ihr Charakter)2Profil wird in:", 117);

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "Lkc;")
    public static class67 field2127 = class19.method144("rot:", 84);

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "Lkc;")
    public static class67 field2124 = class19.method144("Passwort: ", 80);

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "Lkc;")
    public static class67 field2125 = class19.method144("RuneScape wird geladen )2 bitte warten)3)3)3", 106);

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "I")
    public static int field2133 = 1;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "Lkc;")
    public static class67 field2122 = class19.method144("Handel)4Duell", 86);

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "I")
    public static int field2132 = 0;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V", line = 4)
    public static final void method733(byte arg0) {
        field2120++;
        if (class9.field192 > 0) {
            class140.method1092(-92);
            return;
        }
        class126.method981(40, (byte) -120);
        if (arg0 != 55) {
            method733((byte) 23);
        }
        class18.field353 = class71.field1679;
        class71.field1679 = null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V", line = 28)
    public static void method734(boolean arg0) {
        field2123 = null;
        field2127 = null;
        if (!arg0) {
            method737(-80, (byte) -112);
        }
        field2124 = null;
        field2122 = null;
        field2125 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lwd;IZ)V", line = 60)
    private final void method735(class140 arg0, int arg1, boolean arg2) {
        field2121++;
        if (arg1 == 2) {
            this.field2126 = arg0.method1072(99);
        }
        if (arg2) {
            field2127 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILwd;)V", line = 77)
    private final void method736(int arg0, class140 arg1) {
        field2131++;
        while (true) {
            int var3 = arg1.method1105(255);
            if (var3 == 0) {
                if (arg0 >= -61) {
                    this.method736(-99, null);
                    return;
                } else {
                    return;
                }
            }
            this.method735(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)Loe;", line = 99)
    public static final class93 method737(int arg0, byte arg1) {
        class93 var2 = (class93) class103.field2302.method373((byte) 106, (long) arg0);
        field2128++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class38.field892.method27(arg0, true, 5);
        int var4 = 105 / ((-arg1 - 44) / 50);
        class93 var5 = new class93();
        if (var3 != null) {
            var5.method736(-94, new class140(var3));
        }
        class103.field2302.method374(0, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Led;", line = 132)
    public static final class33 method738(int arg0, int arg1, int arg2) {
        field2129++;
        if (arg0 != 1) {
            return null;
        }
        class33 var3 = class88.method685((byte) -110, arg2);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field700 == null || var3.field700.length <= arg1) {
            return null;
        } else {
            return var3.field700[arg1];
        }
    }
}
