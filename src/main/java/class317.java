import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class317 {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[I")
    public static int[] field4325 = new int[13];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static final void method1996(byte arg0) {
        if (arg0 <= 125) {
            method1997(89);
        }
        class392.field5380 = -1;
        class231.field3356 = -1;
        class442.field5989 = 0;
        field4323++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1997(int arg0) {
        field4325 = null;
        int var1 = 115 % ((arg0 + 5) / 40);
    }
}
