import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class453 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lwa;")
    public static class433 field6659 = new class433("RC", 1);

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lqp;")
    public static class466 field6661 = new class466("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field6662 = 0;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field6663 = new String[100];

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    public abstract void method2667(int arg0, int arg1);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method2668(int arg0) {
        field6661 = null;
        field6659 = null;
        field6663 = null;
        if (arg0 != 0) {
            field6662 = 83;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method2669(byte arg0, int arg1);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)I")
    public abstract int method2670(int arg0, byte arg1);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Lqn;")
    public abstract class46 method2671(byte arg0);
}
