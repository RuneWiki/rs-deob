import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class34 {

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "Lbja;")
    public static class34 field443 = new class34();

    @OriginalMember(owner = "client!bja", name = "f", descriptor = "Lbja;")
    public static class34 field448 = new class34();

    @OriginalMember(owner = "client!bja", name = "g", descriptor = "Lbja;")
    public static class34 field449 = new class34();

    @OriginalMember(owner = "client!bja", name = "h", descriptor = "Lbja;")
    public static class34 field450 = new class34();

    @OriginalMember(owner = "client!bja", name = "i", descriptor = "Ljo;")
    public static class351 field451 = new class351(71, 3);

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!bja", name = "d", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!bja", name = "e", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(BZ)V", line = 6)
    public static final void method232(byte arg0, boolean arg1) {
        field445++;
        class145.field1852.method3632(class145.field1852.field9026, true, 0);
        class145.field1852.method3632(class145.field1852.field9018, true, 0);
        class145.field1852.method3632(class145.field1852.field9015, true, 1);
        class145.field1852.method3632(class145.field1852.field8994, true, 1);
        class145.field1852.method3632(class145.field1852.field8993, true, 0);
        class145.field1852.method3632(class145.field1852.field8996, true, 0);
        class145.field1852.method3632(class145.field1852.field9030, true, 0);
        class145.field1852.method3632(class145.field1852.field9033, true, 0);
        class145.field1852.method3632(class145.field1852.field8998, true, 0);
        class145.field1852.method3632(class145.field1852.field9008, true, 0);
        class145.field1852.method3632(class145.field1852.field9017, true, 0);
        class145.field1852.method3632(class145.field1852.field9031, true, 0);
        class145.field1852.method3632(class145.field1852.field8986, true, 0);
        class145.field1852.method3632(class145.field1852.field9011, true, 0);
        class145.field1852.method3632(class145.field1852.field9023, true, 0);
        class145.field1852.method3632(class145.field1852.field8991, true, 0);
        class145.field1852.method3632(class145.field1852.field9021, true, 0);
        class145.field1852.method3632(class145.field1852.field8999, true, 0);
        class145.field1852.method3632(class145.field1852.field8981, true, 0);
        class518.method3015(-57);
        if (arg0 >= -36) {
            field451 = null;
        }
        class145.field1852.method3632(class145.field1852.field9010, true, 2);
        class145.field1852.method3632(class145.field1852.field8995, true, 1);
        class292.method1978(true);
        class696.method3921((byte) -21);
        class654.field9234 = true;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(BI)V", line = 43)
    public static final void method233(byte arg0, int arg1) {
        field446++;
        if (arg1 == -1 || !class323.field4845[arg1]) {
            return;
        }
        class611.field8623.method3141(arg1, 22675);
        class110.field1382[arg1] = null;
        class222.field3192[arg1] = null;
        class323.field4845[arg1] = false;
        if (arg0 != -22) {
            field443 = null;
        }
    }

    @OriginalMember(owner = "client!bja", name = "toString", descriptor = "()Ljava/lang/String;", line = 65)
    public final String toString() {
        field447++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(ZIII)Lcb;", line = 73)
    public static final class544 method234(boolean arg0, int arg1, int arg2, int arg3) {
        field444++;
        class23 var4 = null;
        if (class305.field4567 != null) {
            var4 = new class23(arg3, class305.field4567, class485.field6881[arg3], 1000000);
        }
        class656.field9245[arg3] = class126.field1654.method3855((byte) 94, arg3, class427.field6004, var4);
        class656.field9245[arg3].method1720((byte) 1);
        if (arg2 != 1000000) {
            method233((byte) -126, -62);
        }
        return new class544(class656.field9245[arg3], arg0, arg1);
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V", line = 92)
    public static void method235(int arg0) {
        if (arg0 != 2) {
            field451 = null;
        }
        field443 = null;
        field451 = null;
        field448 = null;
        field450 = null;
        field449 = null;
    }
}
