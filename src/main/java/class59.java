import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class59 extends class193 {

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field743 = 52;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field744 = new String[100];

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
    public static int[] field745 = new int[4096];

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lfn;")
    public static class120 field742;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 13)
    public static void method391(byte arg0) {
        field742 = null;
        field745 = null;
        field744 = null;
        if (arg0 >= -53) {
            method391((byte) -72);
        }
    }
}
