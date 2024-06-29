import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class223 {

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "[Lfp;")
    public static class528[] field2856 = new class528[4];

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field2857 = 0;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "Z")
    public static boolean field2858 = true;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILjava/net/Socket;I)Lwa;")
    public static final class605 method1424(int arg0, Socket arg1, int arg2) throws IOException {
        if (arg0 != 13198) {
            field2858 = false;
        }
        field2860++;
        return new class580(arg1, arg2);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BCI)I")
    public static final int method1425(byte arg0, char arg1, int arg2) {
        field2861++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        if (arg0 <= 89) {
            field2858 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
    public static void method1426(int arg0) {
        field2856 = null;
        int var1 = -127 % ((arg0 - 18) / 47);
    }
}
