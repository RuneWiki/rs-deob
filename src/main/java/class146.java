import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class146 extends class354 {

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)I", line = 3)
    public final int method391(int arg0, int arg1) {
        ++field2046;
        if (arg0 != 3) {
            method1048((byte) 125);
        }
        return 1;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V", line = 15)
    public final void method388(int arg0) {
        if (arg0 != 6384) {
            field2043 = 50;
        }
        ++field2039;
        if (super.field4545 < 0 && super.field4545 > 4) {
            super.field4545 = this.method393((byte) -89);
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)I", line = 30)
    public final int method1045(byte arg0) {
        ++field2040;
        int var2 = 9 % ((7 - arg0) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)Lqca;", line = 41)
    public static final class118 method1046(int arg0, int arg1, int arg2) {
        class14 var3 = class197.field2689[arg0][arg1][arg2];
        return var3 != null && var3.field279 != null ? var3.field279 : null;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lwo;)V", line = 48)
    public class146(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I", line = 51)
    public final int method393(byte arg0) {
        int var2 = -9 % ((arg0 - 37) / 63);
        ++field2045;
        return super.field4544.method4148((byte) 104).method25(1) > 1 ? 4 : 2;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILjava/lang/String;)V", line = 67)
    public static final void method1047(int arg0, int arg1, String arg2) {
        ++field2042;
        class37 var3 = class636.method3571(arg1, arg0, -48);
        var3.method232(-3);
        var3.field578 = arg2;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(ILwo;)V", line = 81)
    public class146(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)V", line = 85)
    public static final void method1048(byte arg0) {
        ++field2044;
        if (arg0 != 76) {
            field2043 = -81;
        }
        if (!class386.field4930.method498()) {
            class415.method2331(false, class748.field10451.field10399.method1924((byte) -39), -4);
        } else {
            class386.field4930.method533(class262.field3311);
            class545.method3145((byte) 9);
            if (class676.field9448) {
                class275.method1628(class262.field3311, (byte) -93);
            } else {
                Dimension var1 = class262.field3311.getSize();
                class386.field4930.method518(class262.field3311, var1.width, var1.height);
            }
            class386.field4930.method486(class262.field3311);
        }
        class433.method2476(arg0 ^ 1);
        class563.field7924 = true;
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(II)V", line = 116)
    public final void method389(int arg0, int arg1) {
        ++field2041;
        if (arg0 != -1) {
            method1047(-86, -97, (String) null);
        }
        super.field4545 = arg1;
    }
}
