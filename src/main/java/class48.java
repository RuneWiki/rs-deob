import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class48 extends class499 {

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Ljava/lang/String;")
    public String field659;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "Ltk;")
    public static class228 field658 = new class228(0, 2, 2, 1);

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V", line = 3)
    public static final void method299(int arg0, int arg1, int arg2) {
        field657++;
        class163 var3 = class271.method1546(arg1, arg2, true);
        var3.method1017(0);
        var3.field2328 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)I", line = 15)
    public static final int method300(int arg0, byte arg1) {
        if (arg1 != -93) {
            field658 = null;
        }
        field661++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lqa;I)V", line = 27)
    public static final void method301(class162 arg0, int arg1) {
        field662++;
        if (class398.field5544 == class75.field1089.field464 || class385.field5410 == null) {
            return;
        }
        if (class465.method2735(arg0, class75.field1089.field464, 84)) {
            class398.field5544 = class75.field1089.field464;
        }
        if (arg1 != 2) {
            field658 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V", line = 48)
    public static void method302(byte arg0) {
        if (arg0 != 74) {
            field658 = null;
        }
        field658 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 59)
    public static final void method303(int arg0) {
        field660++;
        class348.field4771.method992(-15728);
        class341.field4702.method1333(-54);
        class142.field2032.method1333(-67);
        if (arg0 != 13) {
            field658 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 72)
    public class48() {
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 77)
    public class48(String arg0) {
        this.field659 = arg0;
    }
}
