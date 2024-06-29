import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class class725 {

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "Lfia;")
    public static class577 field10109 = new class577(2, 4, 4, 0);

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "[I")
    public static int[] field10110 = new int[3];

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "Lkg;")
    public static class275 field10111 = new class275(84, 0);

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "Lkg;")
    public static class275 field10112 = new class275(75, 2);

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field10113 = 1405;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V", line = 15)
    public static void method4048(int arg0) {
        field10111 = null;
        field10109 = null;
        if (arg0 == 0) {
            field10112 = null;
            field10110 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)Z", line = 35)
    public final boolean method4049(byte arg0) {
        int var2 = -31 % ((arg0 - 27) / 47);
        field10108++;
        return this.method1109(false) || this.method1119(-23098) || this.method1113((byte) 65);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I")
    public abstract int method1115(int arg0);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)I")
    public abstract int method1118(byte arg0);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1109(boolean arg0);

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)Lcia;")
    public abstract class614 method1114(int arg0);

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V")
    public abstract void method1111(int arg0);

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V")
    public abstract void method1117(int arg0);

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)Z")
    public abstract boolean method1119(int arg0);

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)Z")
    public abstract boolean method1113(byte arg0);
}
