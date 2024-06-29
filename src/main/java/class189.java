import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class189 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field3297 = 0;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lqe;")
    public static class168 field3295 = class66.method448("logo", 55);

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "[Lqe;")
    public static class168[] field3299 = new class168[100];

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[Z")
    public static boolean[] field3301 = new boolean[8];

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Luj;")
    public static final class158 method1221(byte arg0) {
        field3296++;
        class217 var1 = new class217(class243.field4225, class150.field2597, class33.field415[0], class54.field746[0], class85.field1332[0], class69.field978[0], class7.field84[0], class92.field1457);
        int var2 = -104 % ((arg0 + 54) / 61);
        class246.method1613(0);
        return var1;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
    public static void method1222(byte arg0) {
        field3295 = null;
        field3299 = null;
        field3301 = null;
        int var1 = -63 / ((-arg0 - 88) / 38);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
    public static final void method1223(int arg0, boolean arg1) {
        if (!arg1) {
            field3298 = -72;
        }
        if (class135.field2361 == 0) {
            class114.field1866.method1319((byte) 89, arg0);
        } else {
            class161.field2764 = arg0;
        }
        field3300++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)I")
    public static final int method1224(byte arg0, int arg1) {
        field3302++;
        if (arg0 >= 65 && arg0 <= 90) {
            return arg0 - 65;
        }
        if (arg1 != 0) {
            method1222((byte) -45);
        }
        if (arg0 >= 97 && arg0 <= 122) {
            return arg0 + 26 - 97;
        } else if (arg0 >= 48 && arg0 <= 57) {
            return arg0 + 52 - 48;
        } else if (arg0 == 43) {
            return 62;
        } else if (arg0 == 42) {
            return 62;
        } else if (arg0 == 47) {
            return 63;
        } else if (arg0 == 45) {
            return 63;
        } else {
            return -1;
        }
    }
}
