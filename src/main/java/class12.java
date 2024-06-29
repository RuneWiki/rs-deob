import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class12 extends class477 {

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "[B")
    public byte[] field115;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    public static int field113 = 104;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "Lfca;")
    public static class188 field114 = null;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "J")
    public static long field116 = 0L;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 3)
    public static void method72(int arg0) {
        if (arg0 != 0) {
            method72(127);
        }
        field114 = null;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "([B)V", line = 24)
    public class12(byte[] arg0) {
        this.field115 = arg0;
    }
}
