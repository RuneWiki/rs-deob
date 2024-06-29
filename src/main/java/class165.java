import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class165 extends class288 {

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "[J")
    public static long[] field2536 = new long[32];

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Loh;")
    public class165 field2533;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Loh;")
    public class165 field2535;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Llc;")
    public static class270 field2541;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Llf;")
    public static class94 field2537;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[I")
    public static int[] field2534;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static void method1183(int arg0) {
        field2536 = null;
        field2541 = null;
        field2537 = null;
        if (arg0 != 6) {
            method1186(-44);
        }
        field2534 = null;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    public static final void method1184(byte arg0) {
        if (arg0 > -127) {
            field2536 = null;
        }
        field2538++;
        class276.field4464.method1420((byte) 119);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public final void method1185(int arg0) {
        field2542++;
        if (this.field2535 == null) {
            return;
        }
        this.field2535.field2533 = this.field2533;
        this.field2533.field2535 = this.field2535;
        this.field2533 = null;
        this.field2535 = null;
        if (arg0 != -11201) {
            method1183(-107);
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)I")
    public static final int method1186(int arg0) {
        field2540++;
        int var1 = -42 / ((arg0 - 53) / 50);
        return 6;
    }
}
