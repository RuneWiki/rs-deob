import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class168 {

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field2522 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public int field2523;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public int field2524;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lba;")
    public static class161 field2517;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Llm;")
    public static class210 field2516;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Llm;")
    public static class210 field2518;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[Lie;")
    public static class2[] field2521;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILre;I)V", line = 4)
    private final void method1171(int arg0, class263 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2515 = arg1.method1830((byte) -77);
            this.field2524 = arg1.method1787(false);
            this.field2523 = arg1.method1787(false);
        }
        if (arg0 != 0) {
            field2518 = (class210) null;
        }
        field2514++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 30)
    public static void method1172(byte arg0) {
        field2521 = null;
        field2518 = null;
        if (arg0 == 94) {
            field2517 = null;
            field2516 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILre;)V", line = 60)
    public final void method1173(int arg0, class263 arg1) {
        while (true) {
            int var3 = arg1.method1787(false);
            if (var3 == 0) {
                field2520++;
                if (arg0 <= 75) {
                    field2517 = (class161) null;
                }
                return;
            }
            this.method1171(0, arg1, var3);
        }
    }
}
