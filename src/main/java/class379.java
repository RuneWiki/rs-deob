import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class379 extends class187 {

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "[B")
    public byte[] field5357;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field5358 = 0;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "[[Z")
    public static boolean[][] field5356;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I")
    public static int method2318(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V")
    public static final void method2319(byte arg0) {
        class452.method2806(-123, (long) class234.field3224, class88.field1003);
        field5355++;
        if (class272.field3680 != -1) {
            class209.method1133(class272.field3680, 122);
        }
        int var1 = 0;
        int var2 = 101 % ((-arg0 - 18) / 45);
        while (var1 < class274.field3694) {
            if (class321.field4290[var1]) {
                class405.field5895[var1] = true;
            }
            class175.field2194[var1] = class321.field4290[var1];
            class321.field4290[var1] = false;
            var1++;
        }
        class300.field4088 = class234.field3224;
        if (class88.field1003.method1562()) {
            class1.field2 = true;
        }
        class212.field2878 = null;
        if (class272.field3680 != -1) {
            class274.field3694 = 0;
            class298.method1747(4);
        }
        class88.field1003.method1584();
        class314.method1819(class12.field116, -126);
        class259.field3526 = 0;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)V")
    public static void method2320(byte arg0) {
        if (arg0 != 62) {
            field5352 = 104;
        }
        field5356 = null;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "([B)V")
    public class379(byte[] arg0) {
        this.field5357 = arg0;
    }
}
