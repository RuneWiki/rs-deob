import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class class559 extends class508 {

    @OriginalMember(owner = "client!ft", name = "x", descriptor = "Z")
    public volatile boolean field7755 = true;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "Lwl;")
    public static class679 field7750 = new class679("LIVE", 0);

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "[I")
    public static int[] field7753 = new int[1];

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "J")
    public static long field7751;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "Z")
    public boolean field7752;

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "Z")
    public boolean field7754;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)I")
    public abstract int method229(byte arg0);

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)V")
    public static void method3072(byte arg0) {
        if (arg0 != -93) {
            field7751 = -100L;
        }
        field7753 = null;
        field7750 = null;
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(B)[B")
    public abstract byte[] method232(byte arg0);
}
