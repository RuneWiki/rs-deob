import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class122 {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lbe;")
    public static class283 field2031 = class153.method941(-53, "Welt");

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[Z")
    public static boolean[] field2029 = new boolean[8];

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
    public static int[] field2042 = new int[128];

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Lbe;")
    public static class283 field2040 = class153.method941(-79, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "B")
    public static byte field2038;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Lih;")
    public static class30 field2039;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[Lom;")
    public static class65[] field2041;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[[Lkg;")
    public static class69[][] field2036;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[[[B")
    public static byte[][][] field2034;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Z", line = 23)
    public static final boolean method771(int arg0, byte arg1) {
        field2035++;
        if (arg1 != -97) {
            field2033 = 53;
        }
        return ((arg0 & 0x7081DB) >> 22) != 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 47)
    public static void method772(byte arg0) {
        field2042 = null;
        field2041 = null;
        field2039 = null;
        field2029 = null;
        field2031 = null;
        field2040 = null;
        field2034 = (byte[][][]) null;
        field2036 = (class69[][]) null;
        if (arg0 != 16) {
            field2036 = (class69[][]) ((class69[][]) null);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lek;III)[Lnh;", line = 66)
    public static final class107[] method773(class172 arg0, int arg1, int arg2, int arg3) {
        field2037++;
        if (arg1 <= 67) {
            method774((class172) null, true, (class172) null);
        }
        return class26.method183(true, arg0, arg3, arg2) ? class12.method65((byte) 27) : null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lek;ZLek;)V", line = 88)
    public static final void method774(class172 arg0, boolean arg1, class172 arg2) {
        class5.field50 = arg0;
        if (!arg1) {
            class295.field5013 = arg2;
            field2030++;
        }
    }
}
