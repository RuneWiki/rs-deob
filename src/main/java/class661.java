import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class661 extends class39 {

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
    private int field9210 = 0;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "Luh;")
    public static class176 field9211 = new class176(4, 1, 1, 1);

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "[[B")
    public static byte[][] field9212 = new byte[1000][];

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BJ)V", line = 5)
    public static final void method3772(byte arg0, long arg1) {
        ++field9207;
        if (class767.field10562 != null) {
            if (~class416.field5704 != -2 && class416.field5704 != 5) {
                if (class416.field5704 == 4) {
                    class250.method1646(105, arg1);
                }
            } else {
                class607.method3523(1, arg1);
            }
        }
        class186.method1307(class37.field491, -103, (long) class192.field2961);
        if (class371.field5137 != -1) {
            class250.method1649(120, class371.field5137);
        }
        for (int var3 = 0; ~var3 > ~class470.field6596; ++var3) {
            if (class698.field9719[var3]) {
                class744.field10313[var3] = true;
            }
            class466.field6553[var3] = class698.field9719[var3];
            class698.field9719[var3] = false;
        }
        class42.field542 = class192.field2961;
        class440.method2622((class451) null, 60, -1, -1);
        class475.method2823((class451) null, -1, -1, 256);
        if (class371.field5137 != -1) {
            class470.field6596 = 0;
            class286.method1851(20906);
        }
        class37.field491.method511();
        class326.method2088(111, class37.field491);
        int var4 = -81 / ((15 - arg0) / 39);
        int var5 = class7.method50(-3569);
        if (var5 == -1) {
            var5 = class275.field3980;
        }
        if (~var5 == 0) {
            var5 = class572.field8073;
        }
        class758.method4211(var5, false);
        int var6 = class210.field3250.method2102(true) << 8;
        class300.method1942(class210.field3250.field5746 + var6, class210.field3250.field5755, class471.field6608, 3, class210.field3250.field5742 + var6);
        class471.field6608 = 0;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZI)V", line = 71)
    public static final void method3773(boolean arg0, int arg1) {
        if (arg1 <= -15) {
            class100.method712(class714.field9895, class371.field5137, arg0, 44, class428.field5825);
            ++field9208;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)V", line = 82)
    public static void method3774(boolean arg0) {
        field9211 = null;
        field9212 = null;
        if (!arg0) {
            field9213 = -33;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZZ)V", line = 94)
    public final void method299(boolean arg0, boolean arg1) {
        ++field9209;
        int var3 = super.field508.field9547.method703(super.field505.method1507(), class527.field7532, (byte) 99) - -super.field508.field9548;
        int var4 = super.field508.field9552.method2781(super.field505.method1505(), 0, class296.field4307) + super.field508.field9555;
        if (arg1) {
            method3774(false);
        }
        super.field505.method1612((float) (super.field505.method1507() / 2 + var3), (float) (super.field505.method1505() / 2 + var4), 4096, this.field9210);
        this.field9210 += ((class629) super.field508).field8821;
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lwia;Lcf;)V", line = 111)
    public class661(class791 arg0, class629 arg1) {
        super(arg0, arg1);
    }
}
