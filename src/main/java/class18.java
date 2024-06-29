import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class18 {

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "[I")
    public static int[] field291 = new int[8];

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "Lkk;")
    public class239 field286;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Lqd;")
    public static class3 field289;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
    public int[] field287;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "[S")
    public static short[] field290;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "[[[I")
    public static int[][][] field285;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)Lkd;")
    public static final class209 method163(byte arg0) {
        field284++;
        int var1 = -44 % ((arg0 - 65) / 60);
        class105.field1695 = 0;
        return class271.method1830((byte) -92);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
    public static void method164(boolean arg0) {
        field289 = null;
        field291 = null;
        if (!arg0) {
            field290 = null;
        }
        field285 = null;
        field290 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
    public static final void method165(int arg0, int arg1) {
        if (arg0 != -8702) {
            method164(true);
        }
        field283++;
        class35.field565.method1778(arg1, -44);
        class220.field3438.method1778(arg1, -58);
    }
}
