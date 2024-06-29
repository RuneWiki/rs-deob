import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class427 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
    public int[] field6392 = new int[3];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[I")
    public int[] field6390 = new int[100];

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[Lqi;")
    public class402[] field6395 = new class402[100];

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[Lbk;")
    public class256[] field6397 = new class256[8];

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Lmn;")
    public static class249 field6393 = new class249(8);

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public int field6394;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field6391;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static final void method2584(byte arg0) {
        if (class506.field7382 == 1 || class506.field7382 == 3 || class52.field1085 != class506.field7382 && (class506.field7382 == 0 || class52.field1085 == 0)) {
            class341.field5128 = 0;
            class334.field5054 = 0;
            class209.field3337.method1614((byte) -24);
        }
        field6396++;
        class52.field1085 = class506.field7382;
        if (arg0 > -51) {
            method2585(-19);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method2585(int arg0) {
        if (arg0 != 8) {
            method2584((byte) -120);
        }
        field6393 = null;
    }
}
