import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class28 {

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public int field247 = -1;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Lrn;")
    public static class633 field242 = new class633(70, 3);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public int field246;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Lda;")
    public static class420 field243;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "[[[Lmf;")
    public static class766[][][] field252;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
    public static final int method118(int arg0, int arg1) {
        field245++;
        return arg0 < 8 ? 73 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
    public static void method119(boolean arg0) {
        if (!arg0) {
            method119(false);
        }
        field252 = null;
        field242 = null;
        field243 = null;
    }
}
