import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class112 extends class454 {

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "Lqj;")
    public class572 field1622;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field1620 = 0;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field1621 = 0;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "Lsv;")
    public static class570 field1623 = new class570(62, -1);

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "[I")
    public static int[] field1624;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(JJ)J")
    public static long method927(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method339(byte arg0);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method928(int arg0) {
        field1624 = null;
        if (arg0 != 0) {
            method929((byte) -37);
        }
        field1623 = null;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
    public static final void method929(byte arg0) {
        if (arg0 != 76) {
            return;
        }
        field1616++;
        int var1 = 0;
        for (int var2 = 0; var2 < class192.field2891; var2++) {
            for (int var3 = 0; var3 < class456.field6225; var3++) {
                if (class77.method695(class514.field7096, var1, var3, true, var2, -23)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "(I)Z")
    public abstract boolean method340(int arg0);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIILuf;)V")
    public static final void method930(int arg0, int arg1, int arg2, class519 arg3) {
        field1619++;
        class88 var4 = arg3.method3047(93, class686.field9702);
        int var5 = 104 / ((arg1 - 57) / 39);
        if (var4 == null) {
            return;
        }
        class686.field9702.method488(arg0, arg2, arg3.field7128 + arg0, arg2 - -arg3.field7255);
        if (class198.field2985 < 3) {
            class727.field10127.method752((float) arg3.field7128 / 2.0F + (float) arg0, (float) arg3.field7255 / 2.0F + (float) arg2, 4096, ((int) (-class98.field1423) & 0x3FFF) << 2, var4, arg0, arg2);
        } else {
            class686.field9702.method464(-16777216, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lqj;I)V")
    public class112(class572 arg0, int arg1) {
        this.field1622 = arg0;
        this.field1618 = arg1;
    }

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "(I)V")
    public static final void method931(int arg0) {
        int var1 = 95 / ((arg0 - 45) / 59);
        if (class646.field9183 != null) {
            class646.field9183.method3621((byte) 74);
        }
        field1617++;
        if (class500.field6868 != null) {
            class500.field6868.method3621((byte) 42);
        }
    }
}
