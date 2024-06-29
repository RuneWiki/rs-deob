import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class622 extends class184 {

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Z")
    public boolean field8726 = false;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public int field8729 = -1;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "Lio;")
    public static class439 field8731 = new class439(0, 1);

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "[F")
    public static float[] field8736 = new float[4];

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field8734 = 0;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public int field8725;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public int field8728;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public int field8730;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public int field8732;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public int field8735;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "J")
    public static long field8727;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public static void method3598(byte arg0) {
        field8736 = null;
        if (arg0 != 106) {
            field8734 = -10;
        }
        field8731 = null;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V")
    public class622(int arg0) {
        this.field8729 = arg0;
    }
}
