import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class514 {

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public int field6738 = -1;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "J")
    public static long field6728 = 0L;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public static int field6735 = 0;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public int field6725;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public int field6726;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public int field6727;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public int field6729;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public int field6730;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public int field6731;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public int field6732;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public int field6733;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "Lah;")
    public static class249 field6737;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "Ljava/lang/String;")
    public static String field6736;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 3)
    public static void method2770(int arg0) {
        field6736 = null;
        if (arg0 > -116) {
            method2771(90, -76, (byte) 18);
        }
        field6737 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIB)Z", line = 25)
    public static final boolean method2771(int arg0, int arg1, byte arg2) {
        int var3 = -107 % ((arg2 + 51) / 56);
        field6734++;
        return class376.method2153(-95, arg1, arg0) | (arg0 & 0x70000) != 0 || class559.method2992((byte) -84, arg0, arg1);
    }
}
