import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class257 {

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3711 = "";

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "[I")
    public static int[] field3713 = new int[8];

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1742(int arg0) {
        class174[] var1 = class726.field9828;
        synchronized (class726.field9828) {
            int var2 = 0;
            while (true) {
                if (class726.field9828.length <= var2) {
                    break;
                }
                class726.field9828[var2] = new class174();
                class234.field3391[var2] = 0;
                var2++;
            }
        }
        field3712++;
        int var3 = 60 / ((-arg0 - 36) / 57);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)V", line = 26)
    public static final void method1743(byte arg0) {
        field3715++;
        for (class55 var1 = (class55) class336.field4743.method1269(4); var1 != null; var1 = (class55) class336.field4743.method1264((byte) 57)) {
            if (var1.field1114 == -1) {
                var1.field1115 = 0;
                if (var1.field1126 >= 0 && var1.field1117 >= 0 && class376.field5325 > var1.field1126 && class175.field2711 > var1.field1117) {
                    class129.method1071(arg0 + 26, var1);
                }
            } else {
                var1.method2314((byte) 39);
            }
        }
        if (arg0 != -105) {
            method1745(-128);
        }
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V", line = 54)
    public static final void method1744(int arg0) {
        int var1 = 52 / ((33 - arg0) / 40);
        class297.field4174.method1466(0);
        field3714++;
    }

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)V", line = 70)
    public static void method1745(int arg0) {
        field3711 = null;
        if (arg0 <= 123) {
            field3713 = null;
        }
        field3713 = null;
    }
}
