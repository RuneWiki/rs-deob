import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class454 {

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "Lgl;")
    public static class432 field6669 = new class432("", 15);

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "[I")
    public static int[] field6674 = new int[1];

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "Lui;")
    public static class375 field6672 = new class375("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "Lc;")
    public class201 field6670;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "Lj;")
    public class229 field6667;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "Ljava/lang/String;")
    public static String field6673;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static void method2731(int arg0) {
        field6674 = null;
        field6672 = null;
        if (arg0 != 22050) {
            method2735(-81, false);
        }
        field6673 = null;
        field6669 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BILns;)Lse;")
    public static final class4 method2732(byte arg0, int arg1, class438 arg2) {
        field6668++;
        byte[] var3 = arg2.method2638(true, arg1);
        if (arg0 != -40) {
            method2731(-87);
        }
        return var3 == null ? null : new class4(var3);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
    public static final void method2733(byte arg0) {
        class184.method1309();
        if (arg0 > -28) {
            field6673 = null;
        }
        field6666++;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)Z")
    public static final boolean method2734(int arg0) {
        field6665++;
        try {
            if (arg0 != -14159) {
                return false;
            }
            if (class30.field464 == 2) {
                if (class189.field2648 == null) {
                    class189.field2648 = class239.method1609(class466.field6795, class225.field3230, class369.field5667);
                    if (class189.field2648 == null) {
                        return false;
                    }
                }
                if (class231.field3285 == null) {
                    class231.field3285 = new class276(class467.field6807, class129.field1813);
                }
                if (class295.field4368.method1539(class515.field7634, (byte) 48, class189.field2648, 22050, class231.field3285)) {
                    class295.field4368.method1524(-8144);
                    class295.field4368.method1515(class388.field5899, -193);
                    class295.field4368.method1536(class189.field2648, class32.field496, 4);
                    class231.field3285 = null;
                    class189.field2648 = null;
                    class466.field6795 = null;
                    class30.field464 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class295.field4368.method1522((byte) -30);
            class466.field6795 = null;
            class231.field3285 = null;
            class30.field464 = 0;
            class189.field2648 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZ)V")
    public static final void method2735(int arg0, boolean arg1) {
        if (arg1) {
            method2735(9, false);
        }
        field6671++;
        class156.field2262 = arg0;
        class15.field250.method1015((byte) 127);
    }
}
