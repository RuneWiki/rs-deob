import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class300 {

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field4323 = 0;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "Lsv;")
    public static class570 field4326 = new class570(22, 3);

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "Lgga;")
    public static class513 field4324;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)I", line = 13)
    public static final int method1874(byte arg0) {
        if (arg0 != -90) {
            method1875((byte) 95);
        }
        field4325++;
        class494 var1 = class725.field10099;
        synchronized (class725.field10099) {
            return class725.field10099.method2884(-27192);
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)V", line = 28)
    public static void method1875(byte arg0) {
        field4324 = null;
        int var1 = 92 % ((arg0 - 72) / 38);
        field4326 = null;
    }
}
