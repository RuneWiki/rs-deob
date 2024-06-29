import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class378 extends class324 {

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "[B")
    public byte[] field5757;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5756 = new String[100];

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "[I")
    public static int[] field5758 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method2441(int arg0) {
        field5756 = null;
        if (arg0 <= -31) {
            field5758 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([B)V")
    public class378(byte[] arg0) {
        this.field5757 = arg0;
    }
}
