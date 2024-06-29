import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class221 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public int field3522 = 0;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field3524 = 0;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field3526 = -1;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
    public static boolean field3528 = false;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[I")
    public static int[] field3527;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lhi;BI)V")
    private final void method1464(class264 arg0, byte arg1, int arg2) {
        if (arg2 == 5) {
            this.field3522 = arg0.method1777(-88);
        }
        field3521++;
        int var4 = -98 % ((arg1 - 51) / 42);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method1465(int arg0) {
        if (arg0 < 13) {
            field3524 = 40;
        }
        field3527 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lhi;I)V")
    public final void method1466(class264 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1779(-87);
            if (var3 == 0) {
                if (arg1 != 0) {
                    method1468(-64);
                }
                field3523++;
                return;
            }
            this.method1464(arg0, (byte) -78, var3);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljj;I)V")
    public static final void method1467(class134 arg0, int arg1) {
        int var2 = 118 % ((-arg1 - 74) / 36);
        class131.field2193 = arg0;
        field3525++;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static final void method1468(int arg0) {
        class155.field2494 = arg0;
        for (int var1 = 0; var1 < class236.field3769; var1++) {
            for (int var2 = 0; var2 < class77.field1061; var2++) {
                if (class273.field4415[arg0][var1][var2] == null) {
                    class273.field4415[arg0][var1][var2] = new class99(arg0, var1, var2);
                }
            }
        }
    }
}
