import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class149 {

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "Lpca;")
    public static class653 field1701 = new class653(8);

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public static int field1702 = 0;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I[B)[B", line = 3)
    public static final byte[] method817(int arg0, byte[] arg1) {
        field1703++;
        if (arg0 != 9) {
            return null;
        }
        class452 var2 = new class452(arg1);
        int var3 = var2.method2541(arg0 ^ 0x2A);
        int var4 = var2.method2575((byte) -48);
        if (var4 < 0 || !(class491.field7118 == 0 || class491.field7118 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2552(0, arg0 ^ 0xD, var4, var5);
            return var5;
        } else {
            int var6 = var2.method2575((byte) -48);
            if (var6 < 0 || class491.field7118 != 0 && var6 > class491.field7118) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class371.method2030(var7, var6, arg1, var4, 9);
            } else {
                class263 var8 = class454.field6293;
                synchronized (class454.field6293) {
                    class454.field6293.method1492(var2, var7, (byte) 123);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V", line = 61)
    public static final void method818(int arg0) {
        class436.field6076 = null;
        if (arg0 == -1) {
            class683.field9690 = null;
            field1700++;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)V", line = 73)
    public static void method819(boolean arg0) {
        field1701 = null;
        if (arg0) {
            method819(false);
        }
    }
}
