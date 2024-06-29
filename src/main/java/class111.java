import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class111 extends class70 {

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field2032 = 2;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2034 = " from your friend list first.";

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field2033 = 2;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "Llj;")
    public static class59 field2031 = new class59(16);

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Lclient;")
    public static client field2036;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lak;ILek;Lek;Lek;)Z", line = 6)
    public static final boolean method831(class345 arg0, int arg1, class206 arg2, class206 arg3, class206 arg4) {
        class316.field5138 = arg2;
        class349.field5586 = arg0;
        if (arg1 != 2) {
            method833((byte) -107);
        }
        class238.field3969 = arg4;
        field2027++;
        class178.field2948 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)I", line = 24)
    public static final int method832(byte arg0, int arg1) {
        field2028++;
        int var2 = -58 % ((arg0 - 67) / 41);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V", line = 47)
    public static void method833(byte arg0) {
        field2036 = null;
        if (arg0 < 119) {
            method832((byte) 79, -14);
        }
        field2034 = null;
        field2031 = null;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 64)
    public class111() {
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V", line = 70)
    public class111(int arg0) {
        this.field2030 = arg0;
    }
}
