import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class3 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field36 = new String[100];

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static final void method18(byte arg0) {
        field37++;
        if (class162.field2612 == 5 && arg0 > 12) {
            class162.field2612 = 6;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method19(int arg0) {
        int var1 = -124 / ((-arg0 - 59) / 55);
        field36 = null;
    }
}
