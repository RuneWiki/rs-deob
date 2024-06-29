import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class568 extends class557 {

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field7754 = 0;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "B")
    public static byte field7755;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    private int field7758;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Luq;")
    public static class172 field7756;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Ljava/lang/String;")
    private String field7757;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ltn;I)V")
    public final void method32(class95 arg0, int arg1) {
        arg0.method749(this.field7758, this.field7757, -78);
        field7753++;
        if (arg1 != -29265) {
            method3241(-124, (byte) 61, true);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLdt;)V")
    public final void method30(byte arg0, class254 arg1) {
        if (arg0 != 110) {
            this.method32(null, -75);
        }
        this.field7758 = arg1.method1672(-16516);
        field7760++;
        this.field7757 = arg1.method1699(-78);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBZ)Lpia;")
    public static final class104 method3241(int arg0, byte arg1, boolean arg2) {
        field7759++;
        class345[] var3 = class223.field2890;
        synchronized (class223.field2890) {
            class104 var4;
            if (class223.field2890.length <= arg0 || class223.field2890[arg0].method2187((byte) 67)) {
                var4 = new class104();
                var4.field1479 = new class136[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4.field1479[var5] = new class136();
                }
            } else {
                var4 = (class104) class223.field2890[arg0].method2184(126);
                var4.method3310(30305);
                int var10002 = class68.field950[arg0]--;
            }
            var4.field1483 = arg2;
            int var6 = -103 % ((arg1 + 12) / 50);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method3242(int arg0) {
        if (arg0 != 9421) {
            field7755 = -124;
        }
        field7756 = null;
    }
}
