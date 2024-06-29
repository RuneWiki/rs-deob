import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class232 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3706 = " is already on your ignore list.";

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[I")
    public static int[] field3709 = new int[14];

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field3708 = 0;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "[I")
    public static int[] field3711 = new int[14];

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILfa;)Z")
    public static final boolean method1625(int arg0, class273 arg1) {
        if (arg0 != -6493) {
            field3708 = 24;
        }
        field3707++;
        return arg1.method1874(class207.field3308, 3883);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method1626(int arg0) {
        if (arg0 != 14) {
            field3709 = null;
        }
        field3709 = null;
        field3711 = null;
        field3706 = null;
    }
}
