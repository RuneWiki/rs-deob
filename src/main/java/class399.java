import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class399 extends class184 {

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public int field5954;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public int field5956;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "F")
    public static float field5959;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 7)
    public static final void method2533(byte arg0) {
        class163.field2582 = class335.field4827.field940 - (-class335.field4827.field938 - 2);
        field5955++;
        class146.field1946 = new String[500];
        class610.field8632 = class55.field764.field940 + class55.field764.field938 + 2;
        for (int var1 = 0; var1 < class146.field1946.length; var1++) {
            class146.field1946[var1] = "";
        }
        class533.method3136(119, class430.field6367.method2679(class650.field9160, -108));
        if (arg0 >= -28) {
            method2535(42, 91, -86);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)I", line = 28)
    public static final int method2534(int arg0, byte arg1) {
        field5958++;
        if (arg1 > -60) {
            method2534(-56, (byte) -80);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Z", line = 42)
    public static final boolean method2535(int arg0, int arg1, int arg2) {
        if (arg0 != 500) {
            field5959 = -0.8414461F;
        }
        field5957++;
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(II)V", line = 52)
    public class399(int arg0, int arg1) {
        this.field5954 = arg0;
        this.field5956 = arg1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 62)
    public static final void method2536(int arg0) {
        if (arg0 != -21685) {
            method2536(86);
        }
        field5960++;
        class533.field7667 = class243.method1621(0.4F, 8, 8, 2048, 0, true, 35, 4);
    }
}
