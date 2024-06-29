import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public abstract class class313 {

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "[I")
    public static int[] field4573 = new int[32];

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4577 = new String[100];

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "Lla;")
    public static class319 field4576 = new class319(17, -2);

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "Ldh;")
    public static class214 field4574;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field4578;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Liq;")
    public abstract class438 method1969(int arg0);

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZI)Z")
    public abstract boolean method1970(boolean arg0, int arg1);

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V")
    public abstract void method1971(int arg0);

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
    public abstract void method1972(byte arg0);

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)V")
    public static final void method1973(byte arg0) {
        if (arg0 < 68) {
            field4578 = null;
        }
        field4575++;
        class263.field3690 = new class282[class25.field359.method1294(-1)][];
        class41.field614 = new class282[class25.field359.method1294(-1)][];
        class24.field351 = new boolean[class25.field359.method1294(-1)];
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V")
    public static void method1974(int arg0) {
        field4578 = null;
        field4576 = null;
        if (arg0 == 100) {
            field4577 = null;
            field4573 = null;
            field4574 = null;
        }
    }
}
