import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class315 {

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public int field4311 = 0;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field4309 = -1;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILlh;)V", line = 8)
    private final void method1779(int arg0, int arg1, class365 arg2) {
        if (arg1 == 5) {
            this.field4311 = arg2.method2062((byte) 14);
        }
        field4308++;
        if (arg0 <= 13) {
            this.method1780(-89, null);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILlh;)V", line = 25)
    public final void method1780(int arg0, class365 arg1) {
        field4310++;
        if (arg0 >= -21) {
            return;
        }
        while (true) {
            int var3 = arg1.method2099(255);
            if (var3 == 0) {
                return;
            }
            this.method1779(60, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V", line = 49)
    public static final void method1781(boolean arg0) {
        if (class410.field5850 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class306.field4199.length; var2++) {
                if (class306.field4199[var2].startsWith("--> ")) {
                    var1++;
                    if (class410.field5850 == var1) {
                        class452.field6564 = class306.field4199[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class452.field6564 = "";
        }
        field4312++;
        if (arg0) {
            method1781(false);
        }
    }
}
