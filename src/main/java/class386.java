import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class386 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Lej;")
    public static class124 field5598 = new class124(34, 15);

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field5599 = 2;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lej;")
    public static class124 field5600 = new class124(40, 12);

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field5601 = 0;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Lej;")
    public static class124 field5602 = new class124(72, 16);

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)[B")
    public abstract byte[] method2435(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method2436(int arg0) {
        field5602 = null;
        field5600 = null;
        field5598 = null;
        int var1 = -29 / ((arg0 + 54) / 45);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[B)V")
    public abstract void method2437(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)[B")
    public abstract byte[] method2438(int arg0);
}
