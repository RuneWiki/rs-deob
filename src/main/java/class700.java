import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class700 extends class513 {

    @OriginalMember(owner = "client!vfa", name = "w", descriptor = "[B")
    public byte[] field9651;

    @OriginalMember(owner = "client!vfa", name = "v", descriptor = "[I")
    public static int[] field9650 = new int[1];

    @OriginalMember(owner = "client!vfa", name = "x", descriptor = "I")
    public static int field9652 = 0;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V", line = 11)
    public static void method3894(int arg0) {
        if (arg0 == 5168) {
            field9650 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "([B)V", line = 21)
    public class700(byte[] arg0) {
        this.field9651 = arg0;
    }
}
