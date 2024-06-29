import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class513 extends class788 {

    @OriginalMember(owner = "client!lda", name = "s", descriptor = "I")
    public int field7032 = -1;

    @OriginalMember(owner = "client!lda", name = "r", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!lda", name = "u", descriptor = "I")
    public int field7034;

    @OriginalMember(owner = "client!lda", name = "w", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!lda", name = "q", descriptor = "Ljava/lang/String;")
    public String field7030;

    @OriginalMember(owner = "client!lda", name = "v", descriptor = "Ljava/lang/String;")
    public String field7035;

    @OriginalMember(owner = "client!lda", name = "t", descriptor = "[[[Ljd;")
    public static class243[][][] field7033;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "(I)Lkaa;")
    public final class51 method2985(int arg0) {
        ++field7031;
        if (arg0 != -1) {
            this.field7034 = -97;
        }
        return class604.field8210[super.field10846];
    }

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "(I)V")
    public static void method2986(int arg0) {
        field7033 = null;
        int var1 = 107 / ((arg0 - 1) / 46);
    }
}
