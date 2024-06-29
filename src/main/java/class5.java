import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class5 {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field55 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field52 = "Attack";

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field53 = 0;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "[[I")
    public static int[][] field57 = new int[5][5000];

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field60 = 0;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lfh;")
    public static class140 field61;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "[Lub;")
    public static class181[] field59;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)I", line = 6)
    public static final int method34(int arg0, byte arg1) {
        field58++;
        if (arg1 != 70) {
            field60 = 13;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 19)
    public static void method35(byte arg0) {
        field61 = null;
        field57 = (int[][]) null;
        field59 = null;
        field52 = null;
        if (arg0 <= 60) {
            method36(-105, (class70[]) null);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[Lih;)V", line = 37)
    public static final void method36(int arg0, class70[] arg1) {
        class240.field3491[arg0] = arg1;
    }
}
