import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class237 {

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field3605 = 0;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field3604 = 0;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Lhc;")
    public static class235 field3602;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Llg;")
    public static final class13 method1588(int arg0) {
        int var1 = -119 / ((arg0 - 60) / 54);
        field3599++;
        try {
            return (class13) Class.forName("lj").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class43();
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static void method1589(boolean arg0) {
        field3602 = null;
        if (!arg0) {
            method1589(false);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1590(byte arg0, String arg1) {
        field3603++;
        if (arg0 >= -43) {
            return null;
        } else {
            int var2 = class187.method1197(arg1, (byte) 43);
            return var2 == -1 ? "" : class180.method1176(class146.field2037.field2395[var2], " ", true, "<br>");
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static final void method1591(int arg0) {
        field3601++;
        if (arg0 != 11624) {
            method1589(true);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(CI)C")
    public static final char method1592(char arg0, int arg1) {
        if (arg1 != 23754) {
            field3604 = -15;
        }
        field3600++;
        return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
    }
}
