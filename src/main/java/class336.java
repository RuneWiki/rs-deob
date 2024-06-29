import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class336 extends class37 {

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4146;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field4145 = 0;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lta;")
    public static class201 field4143;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Lpfa;")
    public static class275 field4147;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public final void method1922(byte arg0) {
        field4148++;
        if (arg0 != -4) {
            field4145 = 1;
        }
        this.field4146.method3515();
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    public static void method1923(byte arg0) {
        if (arg0 != 93) {
            method1923((byte) -8);
        }
        field4143 = null;
        field4147 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lcga;Ltu;B)Lmc;")
    public static final class124 method1924(class449 arg0, class324 arg1, byte arg2) {
        field4144++;
        class124 var3 = class566.method3007((byte) -123);
        var3.field1513 = arg0;
        var3.field1509 = arg0.field5654;
        if (var3.field1509 == -1) {
            var3.field1516 = new class638(260);
        } else if (var3.field1509 == -2) {
            var3.field1516 = new class638(10000);
        } else if (var3.field1509 <= 18) {
            var3.field1516 = new class638(20);
        } else if (var3.field1509 > 98) {
            var3.field1516 = new class638(260);
        } else {
            var3.field1516 = new class638(100);
        }
        var3.field1516.method3572((byte) 115, arg1);
        var3.field1516.method3580((byte) -123, var3.field1513.method2456(false));
        var3.field1515 = 0;
        int var4 = 100 / ((arg2 - 48) / 39);
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I)V")
    public class336(int arg0) {
        this.field4146 = new NativeHeap(arg0);
    }
}
