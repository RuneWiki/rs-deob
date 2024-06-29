import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class481 {

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
    public int field6608 = 8;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
    public int field6612 = 16777215;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "F")
    public static float field6605;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public int field6604;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
    public int field6607;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
    public int field6609;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
    public int field6611;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
    public int field6616;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "Z")
    public boolean field6614;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILol;)V", line = 5)
    public final void method2844(int arg0, class431 arg1) {
        field6615++;
        while (true) {
            int var3 = arg1.method2557(14929);
            if (var3 == 0) {
                if (arg0 > -35) {
                    this.field6604 = -69;
                    return;
                } else {
                    return;
                }
            }
            this.method2845(var3, (byte) -117, arg1);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IBLol;)V", line = 38)
    private final void method2845(int arg0, byte arg1, class431 arg2) {
        if (arg0 == 1) {
            this.field6608 = arg2.method2565((byte) -118);
        } else if (arg0 == 2) {
            this.field6614 = true;
        } else if (arg0 == 3) {
            this.field6611 = arg2.method2528((byte) 89);
            this.field6607 = arg2.method2528((byte) 89);
            this.field6609 = arg2.method2528((byte) 89);
        } else if (arg0 == 4) {
            this.field6616 = arg2.method2557(14929);
        } else if (arg0 == 5) {
            this.field6604 = arg2.method2565((byte) -125);
        } else if (arg0 == 6) {
            this.field6612 = arg2.method2515(100);
        }
        int var4 = 1 % ((arg1 + 38) / 42);
        field6606++;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Luf;Z)Ljava/lang/String;", line = 84)
    public static final String method2846(class519 arg0, boolean arg1) {
        field6613++;
        if (!arg1) {
            field6605 = -0.30215827F;
        }
        if (client.method885(arg0).method1255((byte) 105) == 0) {
            return null;
        } else if (arg0.field7160 == null || arg0.field7160.trim().length() == 0) {
            return class346.field4929 ? "Hidden-use" : null;
        } else {
            return arg0.field7160;
        }
    }
}
