import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class182 {

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2603 = "level: ";

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Z")
    public static boolean field2604 = false;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lbh;")
    public static class239 field2600;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
    public static int method1175(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static final void method1176(int arg0) {
        field2605++;
        class210 var1 = class107.field1553;
        synchronized (class107.field1553) {
            class115.field1712++;
            class206.field2980 = class288.field4566;
            if (arg0 != -28556) {
                field2603 = null;
            }
            if (class16.field236 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class19.field267[var2] = false;
                }
                class16.field236 = class206.field2990;
            } else {
                while (class206.field2990 != class16.field236) {
                    int var3 = class214.field3089[class206.field2990];
                    class206.field2990 = class206.field2990 + 1 & 0x7F;
                    if (var3 < 0) {
                        class19.field267[~var3] = false;
                    } else {
                        class19.field267[var3] = true;
                    }
                }
            }
            class288.field4566 = class222.field3309;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static final void method1177(byte arg0) {
        class39.field582.method260(0);
        field2602++;
        if (arg0 != -116) {
            field2604 = false;
        }
        class166.field2421.method260(arg0 + 116);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static void method1178(int arg0) {
        field2603 = null;
        if (arg0 == -113) {
            field2600 = null;
        }
    }
}
