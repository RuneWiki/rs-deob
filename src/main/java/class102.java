import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class102 extends class37 {

    @OriginalMember(owner = "client!bba", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1520;

    @OriginalMember(owner = "client!bba", name = "t", descriptor = "[I")
    public static int[] field1523 = new int[5];

    @OriginalMember(owner = "client!bba", name = "s", descriptor = "Lcu;")
    public static class206 field1522 = new class206(43, 3);

    @OriginalMember(owner = "client!bba", name = "u", descriptor = "Ljw;")
    public static class520 field1524 = new class520(16);

    @OriginalMember(owner = "client!bba", name = "w", descriptor = "I")
    public static int field1526 = 0;

    @OriginalMember(owner = "client!bba", name = "p", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!bba", name = "v", descriptor = "Ldb;")
    public static class298 field1525;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V", line = 4)
    public final void method776(byte arg0) {
        if (arg0 < 109) {
            field1524 = null;
        }
        field1519++;
        this.field1520.method3468();
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(I)V", line = 16)
    public class102(int arg0) {
        this.field1520 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V", line = 25)
    public static final void method777(int arg0) {
        field1521++;
        for (class369 var1 = (class369) class82.field1278.method329((byte) 77); var1 != null; var1 = (class369) class82.field1278.method329((byte) 77)) {
            class325.method1959(var1, 5);
        }
        int var2;
        int var3;
        if (class344.field4718.method1553(class571.field7587, -2058)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class669.field9491;
            var3 = class669.field9491;
        }
        client.method1684();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1698();
            client.method1682(var4);
            client.method1683(var4);
        }
        client.method1696();
        if (arg0 != 16) {
            field1522 = null;
        }
        client.method1692();
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Z)V", line = 69)
    public static void method778(boolean arg0) {
        if (arg0) {
            field1524 = null;
            field1522 = null;
            field1523 = null;
            field1525 = null;
        }
    }
}
