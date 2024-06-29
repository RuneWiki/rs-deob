import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class445 {

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "Lfba;")
    public static class348 field6357 = new class348(8);

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "I")
    public static int field6361 = 0;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "Lla;")
    public static class423 field6358;

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field6360;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "([IB[I)V")
    public static final void method2718(int[] arg0, byte arg1, int[] arg2) {
        field6356++;
        if (arg0 == null || arg2 == null) {
            class504.field7330 = null;
            class45.field745 = null;
            class160.field2301 = null;
            return;
        }
        class160.field2301 = arg0;
        class504.field7330 = new int[arg0.length];
        class45.field745 = new byte[arg0.length][][];
        if (arg1 > 112) {
            for (int var3 = 0; var3 < class160.field2301.length; var3++) {
                class45.field745[var3] = new byte[arg2[var3]][];
            }
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
    public static void method2719(int arg0) {
        field6360 = null;
        field6358 = null;
        field6357 = null;
        if (arg0 >= -11) {
            field6361 = 4;
        }
    }
}
