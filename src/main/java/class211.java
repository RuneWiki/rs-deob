import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class211 extends RuntimeException {

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3819;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Ljava/lang/String;")
    public String field3825;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Ljd;")
    public static class86 field3813 = class122.method868("Untersuchen", true);

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static volatile int field3817 = 0;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[Lnb;")
    public static class199[] field3815 = new class199[50];

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Ljd;")
    public static class86 field3818 = class122.method868("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", true);

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Ljd;")
    public static class86 field3826 = class122.method868("Verbindung abgebrochen)3", true);

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Ljd;")
    public static class86 field3827 = class122.method868("Eingabeprozedur geladen)3", true);

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Ljd;")
    private static class86 field3829 = class122.method868("Select", true);

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Ljd;")
    public static class86 field3816 = field3829;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lwk;")
    public static class259 field3820;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static final void method1495(int arg0) {
        class191.field3395.method702((byte) -88);
        class272.field4773.method702((byte) -88);
        field3814++;
        if (arg0 != 23120) {
            method1498(-117, -31);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method1496(byte arg0) {
        field3815 = null;
        field3818 = null;
        int var1 = -83 % ((arg0 - 13) / 33);
        field3827 = null;
        field3813 = null;
        field3826 = null;
        field3820 = null;
        field3829 = null;
        field3816 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static final void method1497(boolean arg0) {
        if (arg0) {
            class248.field4406 = class76.field1506;
            class35.field796 = class219.field3930;
        } else {
            class248.field4406 = class114.field2191;
            class35.field796 = class78.field1536;
        }
        class194.field3462 = class248.field4406.length;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    public static final void method1498(int arg0, int arg1) {
        int var2 = 127 / ((-arg0 - 64) / 56);
        field3821++;
        if (arg1 == -1 && !class91.field1854) {
            class136.method977((byte) -113);
        } else if (arg1 != -1 && (class39.field909 != arg1 || !class155.method1134(120)) && class139.field2646 != 0 && !class91.field1854) {
            class122.method860(0, false, class139.field2646, 2, 0, arg1, class232.field4204);
        }
        class39.field909 = arg1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILwj;)Ljd;")
    public static final class86 method1499(int arg0, int arg1, class6 arg2) {
        if (arg1 != 0) {
            return null;
        }
        field3828++;
        if (!class268.method1839((byte) -101, client.method1111(arg2), arg0) && arg2.field133 == null) {
            return null;
        } else if (arg2.field238 == null || arg2.field238.length <= arg0 || arg2.field238[arg0] == null || arg2.field238[arg0].method588(-1).method612((byte) 102) == 0) {
            return class180.field3251 ? class109.method783(2, new class86[] { class70.field1447, class4.method26(false, arg0) }) : null;
        } else {
            return arg2.field238[arg0];
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class211(Throwable arg0, String arg1) {
        this.field3819 = arg0;
        this.field3825 = arg1;
    }
}
