import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class240 extends class443 {

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "Liu;")
    public static class517 field3487 = null;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field3494 = new String[100];

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public int field3484;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public int field3485;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public int field3488;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Lid;")
    public class224 field3486;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "Ljava/lang/String;")
    public String field3483;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "[I")
    public int[] field3493;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "[I")
    public int[] field3495;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "[J")
    public static long[] field3491;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "[Lcb;")
    public class78[] field3490;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field3492;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 7)
    public static void method1540(byte arg0) {
        field3491 = null;
        field3494 = null;
        field3487 = null;
        if (arg0 < 11) {
            field3487 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBI)Z", line = 26)
    public static final boolean method1541(int arg0, byte arg1, int arg2) {
        if (arg1 > -72) {
            method1541(55, (byte) -124, -82);
        }
        field3489++;
        return (arg0 & 0x400) != 0;
    }
}
