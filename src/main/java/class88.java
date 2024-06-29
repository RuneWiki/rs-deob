import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class88 extends class41 {

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "Lsc;")
    private static class181 field1392 = class149.method967(255, " is already on your friend list)3");

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Lsc;")
    public static class181 field1397 = field1392;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field1406 = 0;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "Lo;")
    public static class175 field1402;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "[I")
    public int[] field1395;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "[I")
    public int[] field1396;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "[I")
    public static int[] field1401;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "[I")
    public int[] field1404;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "[Lni;")
    public class118[] field1394;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "[Lni;")
    public class118[] field1400;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "[[[B")
    public byte[][][] field1399;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)Lab;")
    public static final class12 method588(int arg0) {
        if (arg0 != 1023) {
            method590((byte) -73, -93);
        }
        field1405++;
        try {
            return (class12) Class.forName("rc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class3();
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public static final void method589(int arg0) {
        field1393++;
        class73.field1164.method1790(arg0 + 386);
        if (arg0 != -386) {
            field1402 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)I")
    public static final int method590(byte arg0, int arg1) {
        if (arg0 == -39) {
            field1403++;
            return arg1 & 0x3FF;
        } else {
            return -55;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
    public static void method591(boolean arg0) {
        field1397 = null;
        field1392 = null;
        field1402 = null;
        if (arg0) {
            field1402 = null;
        }
        field1401 = null;
    }
}
