import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class290 extends class122 {

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "Lqd;")
    public static class40 field4848 = class147.method1106("cookiehost", (byte) -119);

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "[I")
    public static int[] field4851 = new int[64];

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "Lqd;")
    public static class40 field4855 = class147.method1106("Schlie-8en", (byte) -67);

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "Lqd;")
    public static class40 field4861 = class147.method1106("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", (byte) -106);

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "Lqd;")
    public static class40 field4859 = class147.method1106("(U(Y", (byte) -70);

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "Lqd;")
    private static class40 field4856 = class147.method1106("Loaded config", (byte) -89);

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "Lqd;")
    public static class40 field4853 = field4856;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "Lch;")
    public static class133 field4846 = new class133(64);

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public int field4847;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    private int field4850;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "Lqd;")
    public class40 field4863;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "[I")
    public static int[] field4854;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "[[[Lue;")
    public static class14[][][] field4857;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)V", line = 9)
    public static final void method1998(byte arg0, int arg1) {
        field4852++;
        class177 var2 = class177.method1310(71, 8, arg1);
        var2.method1303((byte) 101);
        if (arg0 != 68) {
            method1999(true);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V", line = 22)
    public static void method1999(boolean arg0) {
        field4846 = null;
        field4857 = (class14[][][]) null;
        field4854 = null;
        field4851 = null;
        if (arg0) {
            method1998((byte) -17, 29);
        }
        field4855 = null;
        field4848 = null;
        field4861 = null;
        field4856 = null;
        field4853 = null;
        field4859 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lsd;BI)V", line = 42)
    private final void method2000(class26 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field4850 = arg0.method226(255);
        } else if (arg2 == 2) {
            this.field4847 = arg0.method203(-22066);
        } else if (arg2 == 5) {
            this.field4863 = arg0.method251((byte) 77);
        }
        if (arg1 != -94) {
            field4849 = -28;
        }
        field4860++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lsd;I)V", line = 91)
    public final void method2001(class26 arg0, int arg1) {
        if (arg1 <= 85) {
            return;
        }
        field4858++;
        while (true) {
            int var3 = arg0.method226(255);
            if (var3 == 0) {
                return;
            }
            this.method2000(arg0, (byte) -94, var3);
        }
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)Z", line = 128)
    public final boolean method2002(int arg0) {
        if (arg0 != 115) {
            this.field4850 = 99;
        }
        field4862++;
        return this.field4850 == 115;
    }
}
