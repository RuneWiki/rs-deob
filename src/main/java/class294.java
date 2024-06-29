import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class294 extends class171 {

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "[Z")
    public static boolean[] field4621 = new boolean[100];

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field4625 = 0;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "[[B")
    public static byte[][] field4629 = new byte[1000][];

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4630 = "cyan:";

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field4626;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
    public static final void method1968(int arg0, int arg1) {
        class280 var2 = class181.method1180(arg1, 0, 11);
        var2.method1871((byte) 26);
        field4624++;
        if (arg0 != -16748) {
            method1969(-13);
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
    public static void method1969(int arg0) {
        field4621 = null;
        field4630 = null;
        field4629 = null;
        if (arg0 != 1000) {
            field4625 = -42;
        }
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
    public static final void method1970(int arg0) {
        if (arg0 <= 98) {
            method1971(106);
        }
        field4627++;
        class281.field4359.method1864(91, (byte) -69);
        class6.field46++;
        class281.field4359.method1447(class89.method568(-20891), 17363472);
        class281.field4359.method1470(393660232, class275.field4263);
        class281.field4359.method1470(393660232, class197.field2739);
        class281.field4359.method1447(class111.field1617, 17363472);
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)V")
    public static final void method1971(int arg0) {
        class181.field2533.method544(false);
        if (arg0 == 0) {
            field4631++;
            class296.field4663.method544(false);
            class179.field2505.method544(false);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lhc;II)Z")
    public static final boolean method1972(class235 arg0, int arg1, int arg2) {
        field4632++;
        byte[] var3 = arg0.method1565(arg2, 51);
        if (var3 == null) {
            return false;
        }
        class236.method1585(-17859, var3);
        if (arg1 > -21) {
            method1969(-64);
        }
        return true;
    }
}
