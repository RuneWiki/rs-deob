import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class112 {

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public int field2035 = 1;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field2032 = 1;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "C")
    public char field2033;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static final void method931(byte arg0) {
        if (arg0 > 96) {
            class470.field6983.method654(false);
            field2030++;
            class138.field2322 = null;
            class491.field7200 = 1;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILnn;)V")
    private final void method932(int arg0, int arg1, class289 arg2) {
        field2036++;
        if (arg0 != 2506) {
            return;
        }
        if (arg1 == 1) {
            this.field2033 = class289.method1878(arg0 ^ 0x9A7, arg2.method1816(true));
        } else if (arg1 == 2) {
            this.field2035 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method933(int arg0, int arg1, boolean arg2) {
        field2034++;
        if (arg2) {
            return class280.method1754((byte) -119, arg0, arg1) || class181.method1237(arg0, 0, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLnn;)V")
    public final void method934(byte arg0, class289 arg1) {
        field2031++;
        while (true) {
            int var3 = arg1.method1858(-3256);
            if (var3 == 0) {
                if (arg0 == -88) {
                    return;
                } else {
                    this.field2033 = (char) 65487;
                    return;
                }
            }
            this.method932(2506, var3, arg1);
        }
    }
}
