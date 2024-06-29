import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class146 {

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "J")
    public long field66;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field63 = 0;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Ljava/lang/String;")
    public static String field68 = " from your friend list first.";

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Ljava/lang/String;")
    public static String field67 = "cyan:";

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Lam;")
    public static class297 field64;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "[[[Lnb;")
    public static class129[][][] field61;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
    public static final void method24(int arg0, int arg1) {
        class137.field2298 = 1000 / arg0;
        field65++;
        if (arg1 != 0) {
            method24(-88, 29);
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
    public static void method25(byte arg0) {
        field67 = null;
        field64 = null;
        if (arg0 >= 2) {
            field68 = null;
            field61 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
    public static final void method26(byte arg0) {
        if (arg0 != 74) {
            field61 = null;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class269.field4319[var1] = false;
        }
        class22.field334 = -1;
        class108.field1651 = 0;
        field62++;
        class184.field3033 = 5;
        class239.field3776 = -1;
        class260.field4131 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class5() {
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(J)V")
    public class5(long arg0) {
        this.field66 = arg0;
    }
}
