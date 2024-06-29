import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class734 {

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "[J")
    public static long[] field10230 = new long[32];

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Ljava/lang/String;")
    public static String field10237 = null;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public int field10228;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public int field10229;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public int field10231;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public int field10232;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public int field10233;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public int field10236;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field10238;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public int field10239;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "[B")
    public byte[] field10234;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "[B")
    public byte[] field10235;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 4)
    public static void method4107(boolean arg0) {
        if (!arg0) {
            method4107(false);
        }
        field10237 = null;
        field10230 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILni;)V", line = 20)
    public static final void method4108(int arg0, class522 arg1) {
        if (arg0 == -13258) {
            class38.field396 = arg1;
            field10238++;
        }
    }
}
