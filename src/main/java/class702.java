import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class702 {

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
    public int field9972 = -1;

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "I")
    public int field9973 = -1;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "I")
    public static int field9974;

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "I")
    public static int field9975;

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "I")
    public static int field9976;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "[I")
    public int[] field9971;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILgk;)V", line = 8)
    public final void method3935(int arg0, class540 arg1) {
        if (arg0 != -14532) {
            return;
        }
        while (true) {
            int var3 = arg1.method3115(29871);
            if (var3 == 0) {
                field9976++;
                return;
            }
            this.method3936(arg1, (byte) -75, var3);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lgk;BI)V", line = 41)
    private final void method3936(class540 arg0, byte arg1, int arg2) {
        if (arg1 > -43) {
            return;
        }
        field9974++;
        if (arg2 == 1) {
            this.field9972 = arg0.method3169(26488);
        } else if (arg2 == 2) {
            this.field9971 = new int[arg0.method3115(29871)];
            for (int var4 = 0; var4 < this.field9971.length; var4++) {
                this.field9971[var4] = arg0.method3169(26488);
            }
        } else if (arg2 == 3) {
            this.field9973 = arg0.method3115(29871);
        }
    }
}
