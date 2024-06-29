import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class483 extends class657 {

    @OriginalMember(owner = "client!lda", name = "t", descriptor = "I")
    public int field6844 = -1;

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "[B")
    public static byte[] field6837 = new byte[2048];

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "[[F")
    public static float[][] field6840 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
    public int field6838;

    @OriginalMember(owner = "client!lda", name = "s", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!lda", name = "q", descriptor = "Lkd;")
    public static class280 field6841;

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "Ljava/lang/String;")
    public String field6839;

    @OriginalMember(owner = "client!lda", name = "r", descriptor = "Ljava/lang/String;")
    public String field6842;

    @OriginalMember(owner = "client!lda", name = "u", descriptor = "[Lkr;")
    public static class743[] field6845;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(B)V")
    public static void method2910(byte arg0) {
        field6845 = null;
        if (arg0 <= -108) {
            field6841 = null;
            field6837 = null;
            field6840 = null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "(B)Llv;")
    public final class442 method2911(byte arg0) {
        ++field6836;
        if (arg0 > -11) {
            this.field6844 = -71;
        }
        return class7.field111[super.field9244];
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)V")
    public static final void method2912(int arg0, int arg1) {
        ++field6843;
        if (~arg0 > -1 || arg0 > 2) {
            arg0 = 0;
        }
        class508.field7250 = arg0;
        class464.field6699 = new class753[class590.field8289[class508.field7250] - -1];
        class172.field2498 = arg1;
        class248.field3474 = 0;
    }
}
