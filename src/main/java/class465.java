import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class class465 extends class271 {

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "Lvs;")
    public class416 field6878;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public int field6879;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "Lki;")
    public static class498 field6880 = new class498(19, -1);

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "Lri;")
    public static class73 field6882 = new class73(67, 12);

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field6883 = 0;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "Lki;")
    public static class498 field6884 = new class498(25, 7);

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "Ljava/lang/String;")
    public static String field6885 = null;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "Lic;")
    public static class491 field6881;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method555(int arg0);

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)Z")
    public abstract boolean method554(byte arg0);

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lvs;I)V")
    public class465(class416 arg0, int arg1) {
        this.field6878 = arg0;
        this.field6879 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V")
    public static void method2792(int arg0) {
        field6885 = null;
        field6880 = null;
        field6882 = null;
        field6881 = null;
        if (arg0 < 108) {
            method2792(35);
        }
        field6884 = null;
    }
}
