import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class266 extends class297 {

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public static int field4545 = 0;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "Ldd;")
    public static class286 field4543 = new class286();

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "[Lkg;")
    public static class107[] field4550 = new class107[100];

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "J")
    public long field4541;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "Lfk;")
    public class266 field4544;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "Lfk;")
    public class266 field4546;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "[Lf;")
    public static class303[] field4549;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V", line = 7)
    public static void method1827(int arg0) {
        field4550 = null;
        field4549 = null;
        field4543 = null;
        if (arg0 != 100) {
            field4543 = (class286) null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 21)
    public final void method1828(int arg0) {
        field4542++;
        if (this.field4544 == null) {
            return;
        }
        this.field4544.field4546 = this.field4546;
        this.field4546.field4544 = this.field4544;
        this.field4544 = null;
        this.field4546 = null;
        if (arg0 > -66) {
            this.field4546 = (class266) null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Z", line = 48)
    public static final boolean method1829(int arg0, int arg1) {
        field4548++;
        if (arg1 > -45) {
            field4550 = (class107[]) null;
        }
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILni;)V", line = 66)
    public static final void method1830(int arg0, class202 arg1) {
        field4547++;
        int var2 = 65 / ((arg0 - 46) / 45);
        class172.field2653 = arg1.method1346((byte) 103, class52.field825);
        class119.field1801 = arg1.method1346((byte) 47, class41.field620);
        class50.field777 = arg1.method1346((byte) -96, class117.field1778);
        class59.field920 = arg1.method1346((byte) -97, class76.field1188);
    }
}
