import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class152 extends class132 {

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "[I")
    public static int[] field2453 = new int[100];

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "[I")
    public static int[] field2455 = new int[25];

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "Lqj;")
    public static class196 field2454 = class80.method502(" steht bereits auf Ihrer Freunde)2Liste(Q", -48);

    @OriginalMember(owner = "client!me", name = "W", descriptor = "Lqj;")
    public static class196 field2450 = class80.method502("", -48);

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "Lqj;")
    public static class196 field2456 = field2450;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "Lqj;")
    public static class196 field2446 = field2450;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "Lnb;")
    public static class95 field2447;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Lnb;")
    public static class95 field2448;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "[I")
    public static int[] field2451;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(III)Z")
    public static final boolean method955(int arg0, int arg1, int arg2) {
        field2449++;
        if (arg0 != 19253) {
            method955(-32, 37, -124);
        }
        return (arg1 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public static void method956(int arg0) {
        field2455 = null;
        field2450 = null;
        field2447 = null;
        field2446 = null;
        if (arg0 != 100) {
            return;
        }
        field2453 = null;
        field2454 = null;
        field2451 = null;
        field2456 = null;
        field2448 = null;
    }
}
