import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class45 extends class187 {

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field636 = 0;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field637 = 0;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "[I")
    public static int[] field639 = new int[14];

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Lwf;")
    public static class306 field641;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 4)
    public static void method314(byte arg0) {
        if (arg0 <= 12) {
            method314((byte) -81);
        }
        field639 = null;
        field641 = null;
    }
}
