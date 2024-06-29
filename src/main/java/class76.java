import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class76 {

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Lui;")
    public static class239 field1038 = new class239(64);

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Leg;")
    public static class272 field1039 = new class272(64);

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field1040 = -1;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "[I")
    public static int[] field1043 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Lsj;")
    public static class48 field1041 = new class48();

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static volatile int field1044 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method576(int arg0) {
        field1038 = null;
        if (arg0 == 16773818) {
            field1039 = null;
            field1043 = null;
            field1041 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
    public static final void method577(int arg0, int arg1, int arg2) {
        if (arg2 != 21767) {
            field1044 = 46;
        }
        field1037++;
        if (class280.method1870(arg2 ^ 0x5567, arg0)) {
            class88.method622(class133.field2204[arg0], arg1, -119);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method578(byte arg0) {
        field1036++;
        if (arg0 >= -87) {
            field1043 = null;
        }
        String var1;
        if (class262.field4151 == 1 && class202.field3248 < 2) {
            var1 = class46.field556 + class62.field849 + class74.field1010 + " ->";
        } else if (class290.field4632 && class202.field3248 < 2) {
            var1 = class117.field1995 + class62.field849 + class21.field268 + " ->";
        } else if (class219.field3507 && class247.field3975[81] && class202.field3248 > 2) {
            var1 = class207.method1396((byte) 45, class202.field3248 - 2);
        } else {
            var1 = class207.method1396((byte) 101, class202.field3248 - 1);
        }
        if (class202.field3248 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class202.field3248 - 2) + class191.field3049;
        }
        return var1;
    }
}
