import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class229 extends class89 {

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lqe;")
    public static class179 field4222 = class206.method1380("title)3jpg", (byte) 116);

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "Lqe;")
    private static class179 field4234 = class206.method1380("Prepared sound engine", (byte) 39);

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Lqe;")
    public static class179 field4229 = class206.method1380("(Y", (byte) -128);

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "Lqe;")
    public static class179 field4238 = field4234;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "Lqe;")
    public static class179 field4236 = class206.method1380("und die Schaltfl-=che (WSpielkonto erstellen(W am", (byte) 91);

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public int field4224;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public int field4227;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public int field4240;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Lmd;")
    public class134 field4228;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lhg;")
    public class83 field4223;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "Lhg;")
    public class83 field4244;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "[I")
    public static int[] field4243;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "[I")
    public int[] field4245;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "[[[Lsc;")
    public static class197[][][] field4232;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)I")
    public static final int method1505(int arg0, int arg1, int arg2, int arg3) {
        field4230++;
        if (arg1 != -13417) {
            method1507((byte) 41);
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method1506(int arg0) {
        field4234 = null;
        field4232 = null;
        field4243 = null;
        field4238 = null;
        field4229 = null;
        field4222 = null;
        field4236 = null;
        if (arg0 != 629) {
            method1506(-91);
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
    public static final void method1507(byte arg0) {
        class120.field2251.method1297((byte) 89);
        class125.field2310.method1339((byte) 97);
        if (arg0 != 72) {
            method1506(124);
        }
        field4226++;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public final void method1508(int arg0) {
        field4239++;
        int var2 = this.field4242;
        class134 var3 = this.field4228.method860(arg0 + 13943);
        if (var3 == null) {
            this.field4242 = -1;
            this.field4245 = null;
            this.field4224 = 0;
            this.field4233 = 0;
            this.field4240 = 0;
        } else {
            this.field4233 = var3.field2427;
            this.field4242 = var3.field2483;
            this.field4245 = var3.field2447;
            this.field4224 = var3.field2457;
            this.field4240 = var3.field2469 * 128;
        }
        if (arg0 != -14067) {
            method1506(52);
        }
        if (this.field4242 != var2 && this.field4244 != null) {
            class38.field824.method1199(this.field4244);
            this.field4244 = null;
        }
    }
}
