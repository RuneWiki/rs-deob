import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class106 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[I")
    public static int[] field1515 = new int[50];

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Llm;")
    public static class150 field1520 = new class150(50);

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1523 = "Loading defaults - ";

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[[I")
    public static int[][] field1517;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)I")
    public static final int method672(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 65536 - class118.field1690[arg1 * 1024 / arg4] >> 1;
        field1521++;
        int var6 = 14 % ((-arg2 - 35) / 57);
        return ((65536 - var5) * arg0 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static final void method673(byte arg0) {
        class143.field1964.method948((byte) 58);
        class119.field1706.method948((byte) 58);
        field1522++;
        if (arg0 != 122) {
            field1516 = -88;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(CB)Z")
    public static final boolean method674(char arg0, byte arg1) {
        field1519++;
        if (arg1 > -44) {
            method673((byte) 50);
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)Lqa;")
    public static final class78 method675(byte arg0) {
        field1518++;
        try {
            return arg0 == 92 ? (class78) Class.forName("ja").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZB)V")
    public static final void method676(boolean arg0, byte arg1) {
        field1524++;
        if (arg0 == class116.field1668) {
            return;
        }
        if (arg1 < 59) {
            method675((byte) 42);
        }
        class116.field1668 = arg0;
        class233.method1534(5414);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public static void method677(boolean arg0) {
        field1523 = null;
        field1517 = null;
        if (arg0) {
            field1516 = -86;
        }
        field1515 = null;
        field1520 = null;
    }
}
