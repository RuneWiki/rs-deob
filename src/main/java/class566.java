import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class566 extends class540 {

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[B")
    public byte[] field8011;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field8013 = 0;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[I")
    public static int[] field8015 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field8014;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 7)
    public static void method3292(int arg0) {
        field8015 = null;
        if (arg0 != 0) {
            method3292(119);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 20)
    public static final void method3293(boolean arg0) {
        class145.field1852.method3632(class145.field1852.field9026, true, 1);
        field8012++;
        class145.field1852.method3632(class145.field1852.field9018, arg0, 1);
        class145.field1852.method3632(class145.field1852.field9015, true, 2);
        class145.field1852.method3632(class145.field1852.field8994, true, 2);
        class145.field1852.method3632(class145.field1852.field8993, true, 1);
        class145.field1852.method3632(class145.field1852.field9030, arg0, 1);
        class145.field1852.method3632(class145.field1852.field9033, true, 1);
        class145.field1852.method3632(class145.field1852.field8998, arg0, 1);
        class145.field1852.method3632(class145.field1852.field9008, arg0, 1);
        class145.field1852.method3632(class145.field1852.field9031, true, 1);
        class145.field1852.method3632(class145.field1852.field9017, true, 1);
        class145.field1852.method3632(class145.field1852.field8986, true, 1);
        class145.field1852.method3632(class145.field1852.field9011, arg0, 0);
        class145.field1852.method3632(class145.field1852.field8996, true, 1);
        class145.field1852.method3632(class145.field1852.field9023, arg0, 0);
        class145.field1852.method3632(class145.field1852.field8991, true, 0);
        class145.field1852.method3632(class145.field1852.field9021, arg0, 1);
        class145.field1852.method3632(class145.field1852.field8999, true, 0);
        class145.field1852.method3632(class145.field1852.field8981, arg0, 0);
        class518.method3015(-114);
        class145.field1852.method3632(class145.field1852.field9010, true, 1);
        class145.field1852.method3632(class145.field1852.field8995, arg0, 3);
        class292.method1978(true);
        class696.method3921((byte) -21);
        class654.field9234 = true;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([B)V", line = 53)
    public class566(byte[] arg0) {
        this.field8011 = arg0;
    }
}
