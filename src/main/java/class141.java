import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class141 {

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "[I")
    public static int[] field2290;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field2289;

    static {
        new class423("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field2290 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)V", line = 8)
    public static final void method933(int arg0, int arg1, int arg2) {
        field2288++;
        if (class376.method2264((byte) -111, arg2) && arg0 == 255) {
            class98.method740(-1, class409.field5933[arg2], arg1);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 22)
    public static void method934(int arg0) {
        if (arg0 >= -118) {
            field2290 = null;
        }
        field2290 = null;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(III)I", line = 32)
    public static final int method935(int arg0, int arg1, int arg2) {
        if (arg0 <= 83) {
            return -50;
        }
        field2289++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7F83A69) >> 19;
    }
}
