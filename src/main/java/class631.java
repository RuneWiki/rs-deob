import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class631 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field8957 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "[[[Lne;")
    public static class287[][][] field8958;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method3533(int arg0, int arg1, int arg2) {
        field8959++;
        int var3 = -33 / ((arg0 - 34) / 52);
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 21)
    public static void method3534(int arg0) {
        int var1 = 115 / ((arg0 - 14) / 42);
        field8958 = null;
    }
}
