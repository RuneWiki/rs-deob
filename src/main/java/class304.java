import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class304 extends class86 {

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public int field4412;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "Lgn;")
    public static class475 field4411 = new class475(74, -1);

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V")
    public static void method1827(byte arg0) {
        field4411 = null;
        int var1 = 106 / ((arg0 - 20) / 50);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1828(byte arg0, byte[] arg1) {
        field4409++;
        int var2 = arg1.length;
        if (arg0 > -23) {
            method1830((byte) -108, null);
        }
        byte[] var3 = new byte[var2];
        class268.method1638(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII)V")
    public static final void method1829(byte arg0, int arg1, int arg2) {
        field4407++;
        class338 var3 = class380.method2294((byte) 117, arg2, 12);
        var3.method2052((byte) -89);
        if (arg0 != 32) {
            field4411 = null;
        }
        var3.field4930 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLae;)Laf;")
    public static final class286 method1830(byte arg0, class156 arg1) {
        int var2 = 38 / ((arg0 - 73) / 36);
        field4410++;
        return new class286(arg1.method936((byte) -96), arg1.method936((byte) -96), arg1.method936((byte) -96), arg1.method936((byte) -96), arg1.method943(1295851312), arg1.method943(1295851312), arg1.method941((byte) 124));
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class304() {
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(I)V")
    public class304(int arg0) {
        this.field4412 = arg0;
    }
}
