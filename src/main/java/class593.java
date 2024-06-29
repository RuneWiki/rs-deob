import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class593 {

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Z")
    public static boolean field8334 = false;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public int field8330;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public int field8331;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public int field8335;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Lgj;")
    public static class662 field8329;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field8327;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Z")
    public boolean field8328;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Z")
    public boolean field8333;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 20)
    public static void method3389(boolean arg0) {
        field8329 = null;
        if (!arg0) {
            method3390((byte) -65, -116L);
        }
        field8327 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BJ)I", line = 31)
    public static final int method3390(byte arg0, long arg1) {
        field8332++;
        if (arg0 >= -4) {
            method3390((byte) -128, 100L);
        }
        return (int) (arg1 / 86400000L) - 11745;
    }
}
