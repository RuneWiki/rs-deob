import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class259 extends class435 {

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "[[I")
    public static int[][] field3714 = new int[128][128];

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "Leda;")
    public static class116 field3712 = new class116(91, 10);

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public int field3716;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "Lvo;")
    public static class345 field3715;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "[Lvp;")
    public static class613[] field3713;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 14)
    public static void method1642(byte arg0) {
        field3714 = null;
        field3712 = null;
        field3715 = null;
        field3713 = null;
        int var1 = -21 % ((82 - arg0) / 40);
    }
}
