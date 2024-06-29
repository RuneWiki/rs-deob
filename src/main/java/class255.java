import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class255 extends class154 {

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "Lud;")
    public static class279 field4546 = class130.method1024("(U (X", 255);

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "Z")
    public static boolean field4554 = false;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "Lud;")
    public static class279 field4549 = class130.method1024("Abbrechen", 255);

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "Ltj;")
    public static class177 field4552;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "Lcd;")
    public static class69 field4547;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "[[[I")
    public static int[][][] field4550;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 25)
    public static void method1821(boolean arg0) {
        field4549 = null;
        field4550 = (int[][][]) null;
        field4546 = null;
        if (arg0) {
            field4552 = null;
            field4547 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 40)
    public static final void method1822(int arg0) {
        if (arg0 != 28) {
            return;
        }
        field4551++;
        if (class53.field1111 == 10 && class97.field1824) {
            class172.method1343(28, -29401);
        }
        if (class53.field1111 == 30) {
            class172.method1343(25, -29401);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[B)Llm;", line = 66)
    public static final class49 method1823(int arg0, byte[] arg1) {
        field4548++;
        if (arg1 == null) {
            return null;
        }
        class49 var2;
        if (class97.field1824) {
            var2 = new class46(arg1, class44.field915, class216.field3811, class1.field92, class115.field2097, class113.field2080);
        } else {
            var2 = new class6(arg1, class44.field915, class216.field3811, class1.field92, class115.field2097, class113.field2080);
        }
        class162.method1278(false);
        return arg0 == -31 ? var2 : (class49) null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 95)
    public static final void method1824(int arg0, int arg1) {
        class298.field5282 = arg0;
        field4553++;
        class298.field5284 = -1;
        if (arg1 != -1656) {
            field4552 = (class177) null;
        }
        class298.field5284 = -1;
        class239.method1717(-2984);
    }
}
