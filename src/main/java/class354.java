import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class354 extends class15 {

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "Lsd;")
    public static class74 field5085 = new class74(88, 8);

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public static int field5086 = 0;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public static int field5089 = 0;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public int field5073;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public int field5079;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public int field5080;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public int field5082;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "Llc;")
    public class135 field5084;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "Lfc;")
    public static class209 field5088;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "Ljava/lang/String;")
    public String field5075;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "[I")
    public int[] field5074;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "[I")
    public int[] field5083;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "[Lwb;")
    public class45[] field5076;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "[Ljava/lang/String;")
    public String[] field5087;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(B)V")
    public static void method2145(byte arg0) {
        field5088 = null;
        if (arg0 != -33) {
            field5085 = null;
        }
        field5085 = null;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public static final void method2146(int arg0) {
        field5077++;
        class207.field2844.method1165((byte) 118);
        if (arg0 != 0) {
            method2146(-14);
        }
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(B)V")
    public static final void method2147(byte arg0) {
        if (class453.field6415 == 10 || class453.field6415 == 28) {
            class459.method2707(class351.field5047 >> 10, true, 5000, class58.field734 >> 10);
        } else {
            int var1 = class19.field258.field2539[0] >> 3;
            int var2 = class19.field258.field2536[0] >> 3;
            if (var1 >= 0 && var1 < (class159.field1895 >> 3) && var2 >= 0 && var2 < (class289.field4316 >> 3)) {
                class459.method2707(var2, true, 5000, var1);
            } else {
                class459.method2707(class289.field4316 >> 4, true, 5000, class159.field1895 >> 4);
            }
        }
        field5078++;
        class158.method762(arg0 ^ 0xFFFFE413);
        class72.method367(true);
        class201.method1101((byte) 103);
        if (arg0 != 93) {
            field5086 = -84;
        }
        class419.method2494((byte) -81);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
    public static final void method2148(int arg0, int arg1) {
        class282.field4114.method1166(arg0, (byte) -52);
        field5081++;
        int var2 = -53 / ((arg1 - 33) / 45);
    }
}
