import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class25 {

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "[Z")
    public static boolean[] field317 = new boolean[200];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method142(int arg0) {
        if (arg0 != 200) {
            method142(12);
        }
        field317 = null;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)C")
    public abstract char method143(int arg0);

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)J")
    public abstract long method144(int arg0);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static final void method145(byte arg0) {
        class138.field1994.method1519(-16576);
        field316++;
        if (arg0 != -1) {
            method142(-87);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Z")
    public abstract boolean method146(byte arg0);

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)I")
    public abstract int method147(byte arg0);

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)I")
    public abstract int method148(int arg0);
}
