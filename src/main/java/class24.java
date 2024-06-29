import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 {

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lrd;")
    public static class117 field675 = class95.method812("Fehler bei der Verbindung zum Server)3", (byte) 8);

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field676 = 0;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field678 = 0;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Lrd;")
    private static class117 field671 = class95.method812("Login server offline)3", (byte) 8);

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lrd;")
    private static class117 field679 = class95.method812("Enter your username (V password)3", (byte) 8);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lrd;")
    public static class117 field670 = field671;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lrd;")
    public static class117 field674 = field679;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lrd;")
    public static class117 field682 = class95.method812("Bitte warten Sie eine Minute", (byte) 8);

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lge;")
    public static class47 field672;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
    public static int[] field673;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method258(int arg0) {
        field672 = null;
        field679 = null;
        field671 = null;
        field670 = null;
        field682 = null;
        field673 = null;
        if (arg0 == 0) {
            field675 = null;
            field674 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BIILge;)Lra;")
    public static final class114 method259(byte arg0, int arg1, int arg2, class47 arg3) {
        field681++;
        if (arg0 < 102) {
            method258(-111);
        }
        return class90.method790(arg2, arg3, 16711680, arg1) ? class40.method465(0) : null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static final void method260(int arg0) {
        if (class72.field2001 != null) {
            class119 var1 = class72.field2001;
            synchronized (class72.field2001) {
                class72.field2001 = null;
            }
        }
        field677++;
        if (arg0 != 20068) {
            method259((byte) 118, 52, -67, null);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static final void method261(int arg0) {
        if (arg0 >= -99) {
            field674 = null;
        }
        field680++;
        class64.field1837.method488(-7913);
        class20.field544.method929(0, 0);
        class118.field2915 = class129.method1053(class118.field2915);
    }
}
