import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class350 {

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "Lmh;")
    public static class139 field5178 = new class139(4, 1);

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "[Z")
    public static boolean[] field5181 = new boolean[8];

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public int field5174;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public int field5175;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public int field5177;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILgk;B)V", line = 4)
    private final void method2164(int arg0, class540 arg1, byte arg2) {
        field5179++;
        if (arg0 == 1) {
            this.field5177 = arg1.method3169(26488);
            this.field5175 = arg1.method3115(29871);
            this.field5174 = arg1.method3115(29871);
        }
        if (arg2 >= -1) {
            this.field5177 = 7;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V", line = 25)
    public static void method2165(int arg0) {
        if (arg0 == 1) {
            field5181 = null;
            field5178 = null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZLgk;)V", line = 43)
    public final void method2166(boolean arg0, class540 arg1) {
        while (true) {
            int var3 = arg1.method3115(29871);
            if (var3 == 0) {
                if (arg0) {
                    return;
                }
                field5176++;
                return;
            }
            this.method2164(var3, arg1, (byte) -58);
        }
    }
}
