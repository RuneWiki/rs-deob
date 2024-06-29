import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class125 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1959 = "Continue";

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Ltb;")
    public static class220 field1957 = null;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Z")
    public static volatile boolean field1961 = true;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "[Z")
    public static boolean[] field1960 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 5)
    public static void method902(int arg0) {
        if (arg0 != -7900) {
            field1959 = (String) null;
        }
        field1959 = null;
        field1957 = null;
        field1960 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V", line = 17)
    public static final void method903(int arg0, int arg1) {
        field1958++;
        class181.field2731.method2175(arg1, -1401253017);
        class326.field5081.method2175(arg1, -1401253017);
        int var2 = 71 / ((arg0 - 29) / 46);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 36)
    public static final void method904(byte arg0) {
        if (arg0 >= -20) {
            method904((byte) 109);
        }
        for (class115 var1 = (class115) class89.field1430.method636(-1); var1 != null; var1 = (class115) class89.field1430.method638(123)) {
            class158 var2 = var1.field1770;
            if (class205.field3101 != var2.field2383 || var2.field2377) {
                var1.method403(1);
            } else if (var2.field2371 <= class227.field3618) {
                var2.method1074(-1, class34.field518);
                if (var2.field2377) {
                    var1.method403(1);
                } else {
                    class272.method1874(var2.field2383, var2.field2381, var2.field2386, var2.field2391, 60, var2, 0, -1L, false);
                }
            }
        }
        field1963++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ll;BLl;)V", line = 72)
    public static final void method905(class133 arg0, byte arg1, class133 arg2) {
        class35.field546 = arg0;
        class71.field1174 = arg2;
        class32.field463 = class35.field546.method954(arg1 ^ 0x5DC4, 3);
        if (arg1 != -5) {
            method907((class133) null, 84, -99);
        }
        field1956++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIB)I", line = 86)
    public static final int method906(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1962++;
        int var5 = 65536 - class15.field216[arg3 * 1024 / arg2] >> 1;
        if (arg4 != -123) {
            method907((class133) null, 22, 41);
        }
        return ((65536 - var5) * arg1 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ll;II)Z", line = 118)
    public static final boolean method907(class133 arg0, int arg1, int arg2) {
        field1964++;
        if (arg1 != -4956) {
            method905((class133) null, (byte) -42, (class133) null);
        }
        byte[] var3 = arg0.method969(true, arg2);
        if (var3 == null) {
            return false;
        } else {
            class92.method663(2346, var3);
            return true;
        }
    }
}
