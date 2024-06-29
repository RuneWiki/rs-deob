import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class100 {

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public int field1460 = -1;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public int field1456 = -1;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[Z")
    public static boolean[] field1455 = new boolean[8];

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Lvp;")
    public static class123 field1459 = new class123();

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Z")
    public static boolean field1462 = false;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "[I")
    public int[] field1457;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ldh;I)V", line = 7)
    public final void method615(class209 arg0, int arg1) {
        if (arg1 >= -77) {
            this.method615(null, -79);
        }
        while (true) {
            int var3 = arg0.method1428(32122);
            if (var3 == 0) {
                field1458++;
                return;
            }
            this.method616((byte) 60, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BILdh;)V", line = 31)
    private final void method616(byte arg0, int arg1, class209 arg2) {
        if (arg1 == 1) {
            this.field1460 = arg2.method1450((byte) 68);
        } else if (arg1 == 2) {
            this.field1457 = new int[arg2.method1428(32122)];
            for (int var4 = 0; var4 < this.field1457.length; var4++) {
                this.field1457[var4] = arg2.method1450((byte) 65);
            }
        } else if (arg1 == 3) {
            this.field1456 = arg2.method1428(32122);
        }
        field1461++;
        if (arg0 != 60) {
            method617((byte) 123);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 65)
    public static void method617(byte arg0) {
        field1455 = null;
        field1459 = null;
        if (arg0 < 56) {
            field1462 = false;
        }
    }
}
