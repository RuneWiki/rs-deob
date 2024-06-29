import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class330 {

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    public int field4036 = 2048;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public int field4035 = 2048;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
    public int field4041 = 0;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public int field4042 = 0;

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    public static int field4043 = -1;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public static int field4040 = -1;

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "Lbt;")
    public static class437 field4038 = new class437(3, 4);

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V", line = 7)
    public static void method1911(int arg0) {
        field4038 = null;
        if (arg0 != -22893) {
            method1913((byte) 106, null);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lmc;Z)V", line = 17)
    public final void method1912(class234 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                if (!arg1) {
                    this.method1912(null, false);
                }
                field4034++;
                return;
            }
            this.method1914((byte) 116, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLjha;)V", line = 44)
    public static final void method1913(byte arg0, class33 arg1) {
        if (arg0 != 115) {
            method1911(-116);
        }
        field4044++;
        class53 var2 = (class53) class548.field6848.method2616((long) arg1.field4737, (byte) 119);
        if (var2 == null) {
            return;
        }
        if (var2.field686 != null) {
            class1.field10.method30(var2.field686);
            var2.field686 = null;
        }
        var2.method1946(-10364);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BILmc;)V", line = 81)
    private final void method1914(byte arg0, int arg1, class234 arg2) {
        field4037++;
        if (arg0 < 96) {
            return;
        }
        if (arg1 == 1) {
            this.field4041 = arg2.method1509(true);
        } else if (arg1 == 2) {
            this.field4036 = arg2.method1553((byte) 14);
        } else if (arg1 == 3) {
            this.field4035 = arg2.method1553((byte) 81);
        } else if (arg1 == 4) {
            this.field4042 = arg2.method1542(27067);
        }
    }
}
