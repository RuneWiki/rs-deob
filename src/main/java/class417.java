import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class417 extends class435 {

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public int field5939;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public int field5941;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "[I")
    public static int[] field5937 = new int[3];

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "[I")
    public static int[] field5940 = new int[1000];

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method2474(int arg0) {
        field5940 = null;
        field5937 = null;
        if (arg0 != 0) {
            field5937 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(II)V")
    public class417(int arg0, int arg1) {
        this.field5939 = arg1;
        this.field5941 = arg0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)V")
    public static final void method2475(byte arg0, int arg1) {
        field5938++;
        if (arg1 == -1) {
            return;
        }
        if (arg0 != -64) {
            field5940 = null;
        }
        if (class529.field7803[arg1]) {
            class515.field7631.method2069(0, arg1);
            class265.field3806[arg1] = null;
            class700.field9917[arg1] = null;
            class529.field7803[arg1] = false;
        }
    }
}
