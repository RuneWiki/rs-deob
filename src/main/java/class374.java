import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class374 {

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field5255 = -1;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field5256 = 0;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field5258 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
    public static void method2231(byte arg0) {
        field5258 = null;
        if (arg0 != -75) {
            method2232(67, null, null, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lvfa;I)Lvfa;")
    public abstract class486 method686(class486 arg0, int arg1);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILgga;Lgga;B)V")
    public static final void method2232(int arg0, class513 arg1, class513 arg2, byte arg3) {
        if (arg3 >= -16) {
            method2231((byte) -59);
        }
        class517.field7107 = arg2;
        field5257++;
        class320.field4558 = arg1;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)Z")
    public static final boolean method2233(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field5259++;
            return class227.method1539(true, arg1, arg0) & (class381.method2294(arg1, 0, arg0) | (arg1 & 0x2000) != 0 | class208.method1444(arg0, arg1, (byte) -47));
        } else {
            return false;
        }
    }
}
