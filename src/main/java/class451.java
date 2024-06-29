import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class451 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lda;")
    public class61 field6664 = null;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Lhia;")
    public class66 field6665 = null;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Lmia;")
    public static class63 field6667 = new class63(40, -1);

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "[I")
    public static int[] field6668 = new int[250];

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public static final void method2769(boolean arg0) {
        class672.field9372 = 0;
        class386.field5833 = 0;
        if (!arg0) {
            field6667 = null;
        }
        field6666++;
        for (int var1 = 0; var1 < class627.field8770; var1++) {
            int var2 = class73.field1021 * var1;
            for (int var3 = 0; var3 < class73.field1021; var3++) {
                int var4 = var2 + var3;
                class302.field4293[var4].method1372(class634.field8902 * var3, class437.field6477 * var1, class634.field8902, class437.field6477, 0, 0, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method2770(byte arg0) {
        if (arg0 != 50) {
            field6667 = null;
        }
        field6667 = null;
        field6668 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lda;)V")
    public class451(class61 arg0) {
        this.field6664 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lda;Lhia;)V")
    public class451(class61 arg0, class66 arg1) {
        this.field6664 = arg0;
        this.field6665 = arg1;
    }
}
