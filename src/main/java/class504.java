import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class504 {

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public int field7138;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "[I")
    public int[] field7136;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "[I")
    public int[] field7140;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Ltda;")
    public static class546 field7139 = new class546(11, 0, 1, 2);

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "[I")
    public static int[] field7142 = new int[13];

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static final void method2996(byte arg0) {
        field7137++;
        if (arg0 > 104) {
            for (int var1 = 0; var1 < 100; var1++) {
                class104.field1511[var1] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method2997(int arg0) {
        field7142 = null;
        if (arg0 != 32351) {
            field7139 = null;
        }
        field7139 = null;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
    public class504(int arg0) {
        this.field7138 = arg0;
        this.field7136 = new int[this.field7138];
        this.field7140 = new int[this.field7138];
    }
}
