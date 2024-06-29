import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class729 {

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public int field9893 = 0;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field9892 = 0;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field9890;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IILdt;)V")
    private final void method4029(int arg0, int arg1, class254 arg2) {
        if (arg0 == arg1) {
            this.field9893 = arg2.method1728((byte) 32);
        }
        field9891++;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLdt;)V")
    public final void method4030(boolean arg0, class254 arg1) {
        if (arg0) {
            field9892 = 30;
        }
        field9890++;
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                return;
            }
            this.method4029(var3, 5, arg1);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)Z")
    public static final boolean method4031(byte arg0, int arg1) {
        if (arg0 >= -78) {
            return false;
        } else {
            field9889++;
            return arg1 == 4 || arg1 == 8 || arg1 == 11;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)Z")
    public static final boolean method4032(int arg0, int arg1, int arg2) {
        field9888++;
        if (arg0 != 2048) {
            field9892 = -64;
        }
        return (arg2 & 0x800) != 0;
    }
}
