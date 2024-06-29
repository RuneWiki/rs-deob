import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class6 {

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lsb;")
    public static class98 field90 = class47.method368("hint_headicons", 0);

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lsb;")
    private static class98 field91 = class47.method368("Loading interfaces )2 ", 0);

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lsb;")
    public static class98 field87 = field91;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lsb;")
    public static class98 field92 = class47.method368("huffman", 0);

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lgj;")
    public static class226 field89 = new class226(100);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I[B)V")
    public abstract void method39(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)[B")
    public abstract byte[] method40(int arg0);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method41(byte arg0) {
        field92 = null;
        field87 = null;
        field89 = null;
        field90 = null;
        if (arg0 != 97) {
            method41((byte) -118);
        }
        field91 = null;
    }
}
