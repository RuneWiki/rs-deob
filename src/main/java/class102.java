import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class102 {

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[I")
    public static int[] field1478 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "[I")
    public static int[] field1476 = new int[2];

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lla;")
    public static class319 field1475 = new class319(32, 6);

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "J")
    public static long field1480 = 0L;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lir;")
    public static class21 field1481;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 8)
    public static void method667(int arg0) {
        field1478 = null;
        field1481 = null;
        field1475 = null;
        field1476 = null;
        if (arg0 != 32018) {
            method668(87, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)V", line = 24)
    public static final void method668(int arg0, byte arg1) {
        field1477++;
        int var2 = -11 / ((arg1 + 19) / 60);
        class177 var3 = class344.method2229(1, arg0, (byte) 119);
        var3.method1194(-56);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZBI)V", line = 42)
    public static final void method669(boolean arg0, byte arg1, int arg2) {
        field1479++;
        class94 var3 = class402.method2483(arg0, (byte) -103, arg2);
        if (arg1 == -117 && var3 != null) {
            for (int var4 = 0; var4 < var3.field1373.length; var4++) {
                var3.field1373[var4] = -1;
                var3.field1377[var4] = 0;
            }
        }
    }
}
