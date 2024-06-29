import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class280 extends class610 {

    @OriginalMember(owner = "client!cha", name = "j", descriptor = "I")
    public static int field4067 = -1;

    @OriginalMember(owner = "client!cha", name = "o", descriptor = "Z")
    public static boolean field4072 = true;

    @OriginalMember(owner = "client!cha", name = "k", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!cha", name = "m", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!cha", name = "n", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!cha", name = "l", descriptor = "[Lsb;")
    public static class94[] field4069;

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "(B)V")
    public static void method1870(byte arg0) {
        field4069 = null;
        int var1 = -124 % ((-arg0 - 52) / 41);
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(III)Z")
    public static final boolean method1871(int arg0, int arg1, int arg2) {
        field4071++;
        if (arg0 != 1) {
            field4067 = -21;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V")
    public static final void method1872(int arg0) {
        class149.field2066.method1761(2);
        field4068++;
        if (arg0 != 13155) {
            field4070 = -60;
        }
        class217.field2826 = 1;
        class524.field7281 = null;
        class123.field1689 = null;
    }
}
