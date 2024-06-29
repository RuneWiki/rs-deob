import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class class213 extends class436 {

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "[I")
    public static int[] field3111;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "Lri;")
    public static class73 field3110;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field3115;

    static {
        new class475(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field3111 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
        field3110 = new class73(107, 16);
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V", line = 3)
    public static void method1487(int arg0) {
        field3111 = null;
        field3110 = null;
        if (arg0 != 2) {
            method1487(-44);
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V", line = 14)
    public static final void method1488(byte arg0) {
        class291.method1861((byte) -104, class177.field2604);
        field3112++;
        class299.field4238++;
        class356.field5471.method1413(-122, class483.field7081);
        if (arg0 > -31) {
            field3110 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)Lrc;")
    public abstract class374 method1489(byte arg0);
}
