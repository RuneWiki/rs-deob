import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class147 extends class259 {

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2133 = "Connection lost.";

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field2132 = -2;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
    public int field2137;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "Lpk;")
    public static class237 field2126;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "Ljava/lang/String;")
    public String field2130;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field2138;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "[I")
    public int[] field2134;

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "[I")
    public int[] field2139;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "[Ldb;")
    public class39[] field2125;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "[Ljava/lang/String;")
    public String[] field2127;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public static void method1001(byte arg0) {
        field2138 = null;
        field2133 = null;
        if (arg0 != 27) {
            field2132 = 16;
        }
        field2126 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
    public static final void method1002(int arg0, byte arg1) {
        if (arg1 != -85) {
            field2133 = null;
        }
        class76.field1207.method938(arg0, (byte) -123);
        field2136++;
        class177.field2591.method938(arg0, (byte) -123);
        class109.field1599.method938(arg0, (byte) -123);
    }
}
