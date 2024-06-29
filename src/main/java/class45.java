import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class45 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "[Lbs;")
    public class141[] field556 = new class141[100];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "[Llg;")
    public class21[] field554 = new class21[8];

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "[I")
    public int[] field560 = new int[3];

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[I")
    public int[] field558 = new int[100];

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Loa;")
    public static class149 field555 = new class149(64);

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Lcm;")
    public static class382 field557 = new class382(64);

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field563 = 1;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lpf;")
    public static class425 field564 = new class425(4, 1);

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lwl;")
    public static class452 field565 = new class452(16, 10);

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field561;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "[[[B")
    public static byte[][][] field562;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static void method257(boolean arg0) {
        field565 = null;
        field564 = null;
        field562 = null;
        field557 = null;
        if (!arg0) {
            method257(false);
        }
        field555 = null;
    }
}
