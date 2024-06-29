import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class257 {

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "J")
    public long field4069 = 0L;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4064 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field4060 = 0;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field4063 = 0;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public int field4058;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public int field4065;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public int field4066;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public int field4067;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public int field4068;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lkm;")
    public class162 field4059;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lkm;")
    public class162 field4070;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 21)
    public static void method1822(byte arg0) {
        if (arg0 != -46) {
            field4060 = 74;
        }
        field4064 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)I", line = 36)
    public static final int method1823(byte arg0) {
        if (arg0 >= -36) {
            method1822((byte) 93);
        }
        field4061++;
        return class3.field24;
    }
}
