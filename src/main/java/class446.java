import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class446 {

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field6248 = 0;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "[[[B")
    public static byte[][][] field6246;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
    public static void method2567(byte arg0) {
        if (arg0 != 120) {
            field6248 = 22;
        }
        field6246 = null;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZI)I")
    public static final int method2568(boolean arg0, int arg1) {
        if (arg0) {
            method2567((byte) -80);
        }
        field6247++;
        return arg1 >>> 7;
    }
}
