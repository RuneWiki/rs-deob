import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class523 {

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "[C")
    public static char[] field7342 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "Lag;")
    public static class214 field7343 = new class214(0, 1);

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "[Z")
    public static boolean[] field7346 = new boolean[100];

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "[Lls;")
    public static class567[] field7347;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 8)
    public static void method3125(int arg0) {
        if (arg0 != 97) {
            method3125(-36);
        }
        field7343 = null;
        field7342 = null;
        field7346 = null;
        field7347 = null;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V", line = 21)
    public static final void method3126(int arg0) {
        field7341++;
        class538 var1 = class440.field6036;
        synchronized (class440.field6036) {
            class440.field6036.method3202((byte) 127);
        }
        class538 var2 = class111.field1592;
        synchronized (class111.field1592) {
            class111.field1592.method3202((byte) 127);
            if (arg0 < 63) {
                field7343 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)I", line = 48)
    public static final int method3127(boolean arg0) {
        if (arg0) {
            field7344++;
            return 16;
        } else {
            return -83;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 61)
    public static final void method3128(byte arg0) {
        class93.field1329 = -1;
        class729.field10226 = -1;
        if (arg0 < 120) {
            field7346 = null;
        }
        class486.field6561 = 0;
        field7345++;
    }
}
