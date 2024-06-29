import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class569 {

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "[I")
    public static int[] field7968 = new int[2];

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "Lfga;")
    public class569 field7966;

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "Lfga;")
    public class569 field7971;

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field7969;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "[[[B")
    public static byte[][][] field7970;

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "(B)V")
    public static void method3145(byte arg0) {
        field7970 = null;
        int var1 = 40 / ((arg0 - 44) / 51);
        field7968 = null;
        field7969 = null;
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V")
    public final void method3146(int arg0) {
        field7967++;
        if (this.field7971 == null) {
            return;
        }
        this.field7971.field7966 = this.field7966;
        this.field7966.field7971 = this.field7971;
        if (arg0 == 2) {
            this.field7971 = null;
            this.field7966 = null;
        }
    }
}
