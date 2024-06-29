import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class104 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lvd;")
    public static class222 field1925 = class212.method1357(" GMT", 10731);

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lvd;")
    public static class222 field1928 = class212.method1357("null", 10731);

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field1931 = -1;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Lvd;")
    public static class222 field1932 = class212.method1357("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", 10731);

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "[Z")
    public static boolean[] field1933 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Lvd;")
    public static class222 field1934 = class212.method1357(")3)3)3", 10731);

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "D")
    public static double field1929;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method639(int arg0) {
        field1925 = null;
        field1933 = null;
        field1928 = null;
        if (arg0 != -20771) {
            field1929 = -1.079477468180301D;
        }
        field1932 = null;
        field1934 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZIB)V")
    public static final void method640(int arg0, boolean arg1, int arg2, byte arg3) {
        if (arg3 != -49) {
            field1929 = -1.4169974615122187D;
        }
        field1930++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class168.field3201 = arg1;
        class166.field3172 = arg0;
        class106.field1956 = arg2;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static final void method641(int arg0) {
        if (arg0 != -48001) {
            field1933 = null;
        }
        field1926++;
        while (true) {
            class28 var1 = class185.field3420;
            class174 var2;
            synchronized (class185.field3420) {
                var2 = (class174) class111.field2080.method244(-4835);
            }
            if (var2 == null) {
                return;
            }
            var2.field3264.method1460(28068, var2.field3274, false, var2.field3268, (int) var2.field2555);
        }
    }
}
