import java.awt.Component;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 {

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "I")
    public static int field2 = -1;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "[I")
    public static int[] field1 = new int[128];

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "Ll;")
    public static class22 field4 = class33.method229("Fishing Shop", -54);

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "Z")
    public static boolean field6 = true;

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "[J")
    public static long[] field5 = new long[32];

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "I")
    private static int field7 = 0;

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "[I")
    public static int[] field8 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "[B")
    public static byte[] field3;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/lang/String;I)Ll;", line = 8)
    public static final class22 method1(String arg0, int arg1) {
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class22 var4 = new class22();
        var4.field213 = 0;
        var4.field215 = var2;
        int var5 = 0;
        if (arg1 != 10071) {
            method4((byte) -85);
        }
        while (var2.length > var5) {
            if (var2[var5] != 0) {
                var2[var4.field213++] = var2[var5];
            }
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(II)[B", line = 45)
    public static final synchronized byte[] method2(int arg0, int arg1) {
        if (arg0 == 100 && class12.field128 > 0) {
            byte[] var2 = class28.field369[--class12.field128];
            class28.field369[class12.field128] = null;
            return var2;
        } else if (arg0 == 5000 && class12.field127 > 0) {
            byte[] var3 = class32.field439[--class12.field127];
            class32.field439[class12.field127] = null;
            return var3;
        } else if (arg0 == 30000 && field7 > 0) {
            byte[] var4 = class2.field16[--field7];
            class2.field16[field7] = null;
            return var4;
        } else {
            if (arg1 != 13929) {
                field6 = true;
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 96)
    public static final void method3(int arg0, Component arg1) {
        if (arg0 != -1) {
            method2(-124, -118);
        }
        arg1.addMouseListener(class5.field36);
        arg1.addMouseMotionListener(class5.field36);
        arg1.addFocusListener(class5.field36);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)V", line = 149)
    public static void method4(byte arg0) {
        field1 = null;
        field5 = null;
        int var1 = 63 % ((arg0 + 83) / 37);
        field4 = null;
        field3 = null;
        field8 = null;
    }
}
