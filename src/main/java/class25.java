import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class25 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Lne;")
    public class166 field214 = null;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Lda;")
    public class420 field213 = null;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Lrn;")
    public static class633 field216 = new class633(90, -1);

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public static void method110(int arg0) {
        field216 = null;
        if (arg0 != 90) {
            method111(93, -39);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I")
    public static final int method111(int arg0, int arg1) {
        field215++;
        int var2 = 124 / ((arg0 - 41) / 54);
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lda;)V")
    public class25(class420 arg0) {
        this.field213 = arg0;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lda;Lne;)V")
    public class25(class420 arg0, class166 arg1) {
        this.field214 = arg1;
        this.field213 = arg0;
    }
}
