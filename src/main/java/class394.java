import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class394 {

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Z")
    public static boolean field5762 = false;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field5764 = -1;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5757 = new String[100];

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public int field5756;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public int field5758;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public int field5759;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public int field5765;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public int field5767;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public int field5768;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public int field5770;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[B")
    public byte[] field5760;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "[B")
    public byte[] field5761;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V", line = 7)
    public static void method2560(boolean arg0) {
        if (!arg0) {
            method2560(true);
        }
        field5757 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lqj;I)V", line = 25)
    public static final void method2561(class296 arg0, int arg1) {
        if (arg1 < -51) {
            field5766++;
            class359.field5064 = arg0;
        }
    }
}
