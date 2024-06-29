import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class103 {

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Lbn;")
    public class241 field1482;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field1487 = 0;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "[I")
    public static int[] field1481 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1485 = "rating: ";

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "F")
    public static float field1476 = 128.0F;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1489 = "Loaded sprites";

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method791(int arg0, byte arg1) {
        class265.field4049.method464(3398, arg0);
        field1488++;
        if (arg1 <= 98) {
            field1476 = -0.031828485F;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 19)
    public static final String method792(int arg0, String arg1, String arg2, String arg3) {
        if (arg0 != 2) {
            field1481 = (int[]) null;
        }
        for (int var4 = arg3.indexOf(arg2); var4 != -1; var4 = arg3.indexOf(arg2, var4 + arg1.length())) {
            arg3 = arg3.substring(0, var4) + arg1 + arg3.substring(var4 + arg2.length());
        }
        field1483++;
        return arg3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 39)
    public static final boolean method793(int arg0, String arg1) {
        field1477++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class255.field3810; var2++) {
            if (arg1.equalsIgnoreCase(class225.field3387[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class190.field2775[var2])) {
                return true;
            }
        }
        if (arg0 < 13) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 75)
    public static final void method794(int arg0) {
        field1486++;
        class119.field1668.method458((byte) -51);
        if (arg0 == 0) {
            class167.field2414.method458((byte) -75);
            class124.field1801.method458((byte) 111);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lok;", line = 91)
    public static final class120 method795(byte arg0) {
        if (arg0 != -40) {
            return (class120) null;
        }
        field1480++;
        try {
            return (class120) Class.forName("vh").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII)V", line = 109)
    public static final void method796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1475++;
        if (class256.method1887(arg5, -1)) {
            client.method345(class119.field1677[arg5], -1, arg7, arg0, arg2, arg4, arg1, arg3);
            if (arg6 != 0) {
                method794(25);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(II)V", line = 125)
    public class103(int arg0, int arg1) {
        this.field1482 = class73.method604(arg0, (byte) 108);
        this.field1478 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lbn;I)V", line = 134)
    public class103(class241 arg0, int arg1) {
        this.field1482 = arg0;
        this.field1478 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V", line = 161)
    public static void method797(byte arg0) {
        field1489 = null;
        field1481 = null;
        int var1 = 122 % ((arg0 + 38) / 52);
        field1485 = null;
    }
}
