import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class704 extends class589 {

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "Z")
    public static boolean field9640 = false;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    public int field9632;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
    public int field9633;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public int field9634;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    public int field9636;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "I")
    public int field9637;

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
    public int field9638;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "Ljava/lang/String;")
    public String field9641;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "[Lhh;")
    public static class140[] field9635;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V", line = 8)
    public static void method3918(byte arg0) {
        if (arg0 <= 57) {
            field9640 = false;
        }
        field9635 = null;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)Z", line = 23)
    public static final boolean method3919(int arg0, int arg1) {
        field9639++;
        if (arg1 != -8) {
            field9635 = null;
        }
        return arg0 == 7 || arg0 == 9;
    }
}
