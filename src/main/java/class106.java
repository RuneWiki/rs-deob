import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class106 {

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "B")
    private byte field1416;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "[Lqg;")
    public static class307[] field1421;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)I", line = 3)
    public final int method632(int arg0) {
        if (arg0 != 7) {
            this.field1420 = 15;
        }
        field1425++;
        return this.field1416 & 0x7;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 18)
    public static final void method633(String arg0, int arg1) {
        field1423++;
        if (arg1 == 9812) {
            System.out.println("Error: " + class163.method1028("%0a", 10276, "\n", arg0));
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lmg;ILmg;)V", line = 29)
    public static final void method634(class96 arg0, int arg1, class96 arg2) {
        field1424++;
        if (arg0.field1286 != null) {
            arg0.method589((byte) 51);
        }
        arg0.field1286 = arg2;
        arg0.field1287 = arg2.field1287;
        arg0.field1286.field1287 = arg0;
        arg0.field1287.field1286 = arg0;
        if (arg1 != 0) {
            method636((byte) 61);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZI)Lqo;", line = 48)
    public static final class19 method635(int arg0, boolean arg1, int arg2) {
        field1417++;
        class19 var3 = new class19();
        var3.field259 = -1;
        var3.field258 = -1;
        var3.field270 = arg0 + 1 + 5;
        if (arg1) {
            method633(null, 5);
        }
        var3.field272 = arg2 + 1 + 5;
        var3.field275 = new int[var3.field270][var3.field272];
        var3.method139(true);
        return var3;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V", line = 71)
    public static void method636(byte arg0) {
        field1421 = null;
        if (arg0 != 82) {
            method634(null, -73, null);
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)I", line = 81)
    public final int method637(int arg0) {
        if (arg0 == 1246) {
            field1427++;
            return (this.field1416 & 0x8) == 8 ? 1 : 0;
        } else {
            return 79;
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V", line = 98)
    public class106() {
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lae;)V", line = 100)
    public class106(class156 arg0) {
        this.field1416 = arg0.method946(31);
        this.field1422 = arg0.method993((byte) -73);
        this.field1418 = arg0.method950(186);
        this.field1420 = arg0.method950(186);
        this.field1426 = arg0.method950(186);
        this.field1419 = arg0.method950(186);
    }
}
