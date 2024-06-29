import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class166 extends class229 {

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lna;")
    private static class26 field2569 = class69.method505("Loaded update list", (byte) -123);

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field2573 = 0;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Z")
    public static boolean field2574 = true;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Lna;")
    public static class26 field2576 = field2569;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field2578 = 20;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "Lna;")
    public static class26 field2581 = class69.method505("Stufe: ", (byte) -122);

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Lna;")
    public class26 field2570;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "Lna;")
    public class26 field2577;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "Lvh;")
    public static class53 field2580;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V", line = 7)
    public static final void method1124(int arg0) {
        class307.field5291.method1987(3);
        field2572++;
        int var1 = -86 % ((arg0 + 55) / 41);
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V", line = 19)
    public static void method1125(int arg0) {
        field2569 = null;
        field2576 = null;
        field2580 = null;
        if (arg0 != 0) {
            field2578 = 89;
        }
        field2581 = null;
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)Lee;", line = 49)
    public final class279 method1126(int arg0) {
        int var2 = -35 / ((arg0) / 56);
        field2579++;
        return class298.field5137[this.field3632];
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)I", line = 58)
    public static final int method1127(int arg0, byte arg1) {
        field2575++;
        if (arg0 < 0) {
            return 0;
        }
        class186 var2 = (class186) class55.field876.method1827((long) arg0, 0);
        if (var2 == null) {
            return class254.method1758(arg0, -126).field4084;
        } else if (arg1 > -56) {
            return -13;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field2887.length; var4++) {
                if (var2.field2887[var4] == -1) {
                    var3++;
                }
            }
            return var3 + class254.method1758(arg0, -100).field4084 - var2.field2887.length;
        }
    }
}
