import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class605 implements class231 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Ljava/lang/String;")
    private String field8020;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lbi;")
    private class449 field8019;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field8022 = 0;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "J")
    public static long field8023 = 0L;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
    public final int method592(int arg0) {
        field8024++;
        if (this.field8019.method2550(arg0 + 11428, this.field8020)) {
            return 100;
        } else if (arg0 == -11428) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lbi;Ljava/lang/String;)V")
    public class605(class449 arg0, String arg1) {
        this.field8020 = arg1;
        this.field8019 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method3327(int arg0) {
        field8021++;
        class511.field6819 = null;
        if (arg0 != 0) {
            field8023 = -63L;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Liaa;")
    public final class462 method590(byte arg0) {
        field8018++;
        int var2 = 27 / ((arg0 - 6) / 57);
        return class462.field6253;
    }
}
