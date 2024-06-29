import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class286 extends class102 {

    @OriginalMember(owner = "client!am", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field4142 = new String[8];

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field4145 = 0;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public int field4141;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public int field4146;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public int field4150;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "Ljava/lang/String;")
    public String field4152;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "[I")
    public static int[] field4148;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V", line = 9)
    public static void method1962(int arg0) {
        if (arg0 == -26507) {
            field4148 = null;
            field4142 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 26)
    public static final void method1963(byte arg0) {
        field4151++;
        class245.method1471(false, false);
        if (class253.field3493 >= 0 && class253.field3493 != 0) {
            class283.method1953(class253.field3493, (byte) -22);
            class253.field3493 = -1;
        }
        if (arg0 <= 45) {
            field4148 = null;
        }
    }
}
