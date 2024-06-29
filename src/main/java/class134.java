import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class134 extends class32 {

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Lp;")
    private static class280 field2367 = class18.method140((byte) -118, "cyan:");

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Lp;")
    public static class280 field2371 = field2367;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "Lp;")
    public static class280 field2373 = field2367;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Lp;")
    public static class280 field2375 = class18.method140((byte) -122, "::clientdrop");

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Lp;")
    public static class280 field2372 = class18.method140((byte) -125, "settings=");

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field2378 = 0;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static volatile int field2377 = 0;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "[[S")
    public static short[][] field2369;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static void method924(int arg0) {
        field2369 = null;
        field2372 = null;
        field2375 = null;
        field2371 = null;
        field2373 = null;
        if (arg0 == 4096) {
            field2367 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V")
    public static final void method925(int arg0, int arg1, int arg2, int arg3) {
        field2370++;
        class157 var4 = class257.method1740(arg0, (byte) 84, 11);
        var4.method1112((byte) 109);
        var4.field2748 = arg2;
        if (arg1 >= -1) {
            field2376 = -97;
        }
        var4.field2751 = arg3;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)I")
    public static final int method926(int arg0, int arg1) {
        if (arg0 == 11) {
            field2368++;
            return arg1 & 0x7F;
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)V")
    public static final void method927(int arg0, int arg1) {
        class212.field3654.method1478(arg1, 91);
        if (arg0 == 8127) {
            field2379++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(II)V")
    public static final void method928(int arg0, int arg1) {
        field2374++;
        class157 var2 = class257.method1740(arg1, (byte) -59, arg0);
        var2.method1121(24223);
    }
}
