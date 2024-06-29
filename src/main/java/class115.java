import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class115 extends class62 {

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "I")
    public static int field2496 = 0;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "Lfe;")
    public static class36 field2498 = new class36(64);

    @OriginalMember(owner = "client!u", name = "db", descriptor = "[I")
    public static int[] field2501 = new int[4000];

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "I")
    public static int field2502 = 0;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "Lcb;")
    public static class15 field2494;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "Lcc;")
    public class16 field2492;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method841(byte arg0) {
        field2501 = null;
        field2494 = null;
        if (arg0 == -42) {
            field2498 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)V")
    public static final void method842(int arg0, boolean arg1) {
        field2497++;
        if (!arg1) {
            method841((byte) -79);
        }
        class30.method190(0, arg0, null, (byte) -26, false);
    }
}
