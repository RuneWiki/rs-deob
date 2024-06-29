import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class class137 {

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "S")
    public static short field2127 = 1;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field2131 = new String[1000];

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2125 = 0;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2132 = 0;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2128 = "white:";

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
    public abstract void method550(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZII)V")
    public abstract void method542(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
    public static final void method957(int arg0, int arg1) {
        field2133++;
        class127 var2 = (class127) class251.field3858.method1414(true, (long) arg0);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg1 != -1) {
            method957(-125, 50);
        }
        while (var2.field1998.length > var3) {
            var2.field1998[var3] = -1;
            var2.field1989[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(III)V")
    public class137(int arg0, int arg1, int arg2) {
        this.field2124 = arg1;
        this.field2126 = arg0;
        this.field2123 = arg2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method958(int arg0) {
        if (arg0 <= -21) {
            field2128 = null;
            field2131 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(III)V")
    public abstract void method549(int arg0, int arg1, int arg2);
}
