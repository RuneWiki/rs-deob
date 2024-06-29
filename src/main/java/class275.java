import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class275 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field4735 = 0;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILcb;I)Z", line = 5)
    public static final boolean method1958(int arg0, class267 arg1, int arg2) {
        byte[] var3 = arg1.method1919(1, arg0);
        if (arg2 != 0) {
            method1959((byte) -4);
        }
        field4740++;
        if (var3 == null) {
            return false;
        } else {
            class115.method883(var3, 37);
            return true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 22)
    public static final void method1959(byte arg0) {
        field4736++;
        int var1 = -45 % ((arg0 - 80) / 40);
        class28.field362.method1201(-20111);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)V", line = 40)
    public static final void method1960(byte arg0, int arg1) {
        class31.field451.method1199(arg1, 120);
        class213.field3626.method1199(arg1, 119);
        class12.field157.method1199(arg1, 123);
        field4741++;
        int var2 = 83 % ((arg0 - 75) / 48);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V", line = 65)
    public static final void method1961(int arg0, byte arg1) {
        field4738++;
        class156 var2 = class206.method1525(6, -32701, arg0);
        if (arg1 <= -86) {
            var2.method1184((byte) 87);
        }
    }
}
