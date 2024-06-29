import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class128 extends class69 {

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Leg;")
    public static class272 field2136 = new class272(64);

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field2139 = 0;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lsj;")
    public static class48 field2141 = new class48();

    @OriginalMember(owner = "client!d", name = "r", descriptor = "[I")
    public static int[] field2142 = new int[14];

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Z")
    public static volatile boolean field2143 = true;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public int field2137;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Ljj;")
    public static class134 field2138;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "[Ljg;")
    public static class271[] field2140;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V")
    public static void method893(boolean arg0) {
        field2138 = null;
        field2136 = null;
        field2142 = null;
        field2140 = null;
        if (!arg0) {
            method893(true);
        }
        field2141 = null;
    }
}
