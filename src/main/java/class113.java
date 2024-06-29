import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class113 extends class128 {

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Lid;")
    public static class60 field2705 = class11.method72("<col=00ff80>", (byte) -115);

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Lid;")
    public static class60 field2701 = class11.method72(" )2> <col=ffffff>", (byte) 104);

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "Lid;")
    private static class60 field2707 = class11.method72("World", (byte) 6);

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "Lid;")
    public static class60 field2706 = field2707;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Lid;")
    public static class60 field2704 = field2707;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "Lqd;")
    public static class115 field2708 = new class115(64);

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "[[[I")
    public static int[][][] field2711 = new int[4][105][105];

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Lwb;")
    public static class155 field2703;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Lid;")
    public class60 field2709;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "Lie;")
    public static class61 field2710;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public static final void method906(int arg0) {
        field2700++;
        if (arg0 >= -96) {
            field2711 = null;
        }
        class23.field567.method118(-15881);
        class106.field2626 = 1;
        field2710 = null;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public static void method907(int arg0) {
        field2708 = null;
        field2704 = null;
        field2705 = null;
        field2701 = null;
        field2710 = null;
        if (arg0 == 64) {
            field2707 = null;
            field2711 = null;
            field2706 = null;
            field2703 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
    public static final void method908(int arg0) {
        if (arg0 < 60) {
            field2711 = null;
        }
        class132.field3007.method920((byte) 14);
        field2699++;
        class38.field909.method920((byte) 14);
        class78.field1915.method920((byte) 14);
    }
}
