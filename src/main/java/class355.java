import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class355 {

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Lqfa;")
    public static class98 field5061 = new class98(87, 6);

    @OriginalMember(owner = "client!du", name = "d", descriptor = "[I")
    public static int[] field5063 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!du", name = "c", descriptor = "Lqfa;")
    public static class98 field5062 = new class98(32, 8);

    @OriginalMember(owner = "client!du", name = "e", descriptor = "Lqfa;")
    public static class98 field5064 = new class98(41, -2);

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V", line = 8)
    public static void method2286(byte arg0) {
        field5062 = null;
        field5064 = null;
        field5061 = null;
        int var1 = 74 % ((arg0 - 84) / 35);
        field5063 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V", line = 22)
    public static final void method2287(boolean arg0) {
        class746.field10368.method3606(63);
        if (!arg0) {
            method2286((byte) 9);
        }
        field5060++;
    }
}
