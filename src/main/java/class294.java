import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class294 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lpn;")
    public static class49 field4535 = new class49(81, 3);

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lpu;")
    public static class179 field4536 = new class179("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lmo;")
    public static class271 field4538 = new class271(5, 7);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
    public static final void method1963(int arg0, byte arg1) {
        class274.field4298 = arg0;
        class240.field3593 = -1;
        field4534++;
        class240.field3593 = -1;
        if (arg1 != 116) {
            method1965((byte) -124, -86);
        }
        class321.method2121(arg1 ^ 0x6027);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1964(int arg0) {
        field4536 = null;
        if (arg0 != -7172) {
            field4539 = -9;
        }
        field4538 = null;
        field4535 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)Z")
    public static final boolean method1965(byte arg0, int arg1) {
        field4533++;
        if (arg0 != -54) {
            method1966(null, -69);
        }
        return arg1 == 23 || arg1 == 25 || arg1 == 1008 || arg1 == 2 || arg1 == 47;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lsj;I)V")
    public static final void method1966(class511 arg0, int arg1) {
        field4537++;
        class491 var2 = (class491) class299.field4604.method358((byte) 79, (long) arg0.field7562);
        if (var2 != null) {
            if (var2.field7182 != null) {
                class503.field7313.method1802(var2.field7182);
                var2.field7182 = null;
            }
            var2.method947((byte) 117);
        }
        if (arg1 != -30498) {
            field4539 = -27;
        }
    }
}
