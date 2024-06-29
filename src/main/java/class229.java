import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class229 {

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field3957 = 0;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Lp;")
    public static class280 field3959 = class18.method140((byte) -117, "");

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Lp;")
    public static class280 field3963 = field3959;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Lp;")
    public static class280 field3961 = field3959;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lqa;")
    public class150 field3956;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[I")
    public int[] field3955;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "[[[S")
    public static short[][][] field3960;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static final void method1541(int arg0) {
        field3958++;
        class188.field3297.method1481(false);
        if (arg0 != 0) {
            field3963 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method1542(byte arg0) {
        field3960 = null;
        field3963 = null;
        field3959 = null;
        field3961 = null;
        if (arg0 < 11) {
            field3957 = -105;
        }
    }
}
