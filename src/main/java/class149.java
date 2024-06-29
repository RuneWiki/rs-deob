import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class149 extends class681 {

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public int field2063;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public int field2065;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public int field2067;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Ljava/lang/String;")
    public String field2060;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(JZ)V", line = 6)
    public static final void method1052(long arg0, boolean arg1) {
        field2062++;
        if (arg0 <= 0L || !arg1) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class339.method1948(arg0 - 1L, 0);
            class339.method1948(1L, 0);
        } else {
            class339.method1948(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lnd;Lnd;Lnd;BLnd;)V", line = 28)
    public static final void method1053(class547 arg0, class547 arg1, class547 arg2, byte arg3, class547 arg4) {
        class235.field3068 = arg4;
        class222.field2973 = arg2;
        int var5 = 13 / ((-arg3 - 80) / 38);
        class659.field9178 = arg1;
        field2061++;
        class218.field2938 = new class288[class659.field9178.method3155((byte) -83)][];
        class214.field2818 = new boolean[class659.field9178.method3155((byte) -107)];
    }
}
