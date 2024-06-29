import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class class402 {

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field5871 = 0;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field5869 = 0;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field5870 = 0;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field5874 = 0;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Lir;")
    public static class185 field5872;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)Z")
    public abstract boolean method107(byte arg0);

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)V")
    public abstract void method114(int arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ltj;I)Lri;")
    public abstract class372 method118(class298 arg0, int arg1);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILtj;II)Z")
    public abstract boolean method120(int arg0, class298 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLtj;)V")
    public abstract void method126(byte arg0, class298 arg1);

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(B)V")
    public static void method2570(byte arg0) {
        if (arg0 >= 37) {
            field5872 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILtj;BIZLkm;I)V")
    public abstract void method112(int arg0, class298 arg1, byte arg2, int arg3, boolean arg4, class402 arg5, int arg6);
}
