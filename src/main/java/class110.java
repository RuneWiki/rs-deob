import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public abstract class class110 {

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "[I")
    public static int[] field1524 = new int[16384];

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "[I")
    public static int[] field1523 = new int[16384];

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "[I")
    public static int[] field1526 = new int[8];

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "[I")
    public static int[] field1527;

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "[Lw;")
    public static class316[] field1528;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    public static int field1525;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1524[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field1523[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field1527 = new int[] { 1, -1, -1, 1 };
        field1528 = new class316[1024];
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V", line = 4)
    public static final void method826(byte arg0) {
        class584.method3288(-124);
        field1525++;
        class324.method2095(-116);
        if (arg0 != 56) {
            method826((byte) -103);
        }
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)V", line = 25)
    public static void method827(byte arg0) {
        field1526 = null;
        field1528 = null;
        if (arg0 != -103) {
            method826((byte) -30);
        }
        field1524 = null;
        field1523 = null;
        field1527 = null;
    }
}
