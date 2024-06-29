import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class157 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2260 = "red:";

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
    public static int[] field2258 = new int[50];

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2272 = "Loading wordpack - ";

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public int field2269;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public int field2270;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "J")
    public long field2263;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lca;")
    public class131 field2262;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lca;")
    public class131 field2264;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lca;")
    public class131 field2271;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Log;")
    public static class41 field2261;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1042(int arg0) {
        field2261 = null;
        field2272 = null;
        field2258 = null;
        field2260 = null;
        if (arg0 != 30208) {
            field2260 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)J")
    public static final long method1043(int arg0, int arg1, int arg2) {
        class133 var3 = class6.field94[arg0][arg1][arg2];
        return var3 == null || var3.field1920 == null ? 0L : var3.field1920.field2347;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1044(boolean arg0, String arg1) throws ClassNotFoundException {
        field2259++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else {
            if (arg0) {
                method1042(-127);
            }
            if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1045(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != 13) {
            method1045(21, -53, 79, 19, 9, -9, (byte) -116);
        }
        class287[] var7 = class243.field3528;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class287 var9 = var7[var8];
            if (var9 != null && var9.field4470 == 2) {
                class292.method1959(0, arg2, arg4 >> 1, arg1 >> 1, (var9.field4479 - class110.field1473 << 7) + var9.field4464, var9.field4465 * 2, arg5, (var9.field4473 - class166.field2383 << 7) + var9.field4460);
                if (class118.field1678 > -1 && class198.field2819 % 20 < 10) {
                    class108.field1463[var9.field4466].method848(class118.field1678 + arg0 - 12, class292.field4622 + -28 + arg3);
                }
            }
        }
        field2265++;
    }
}
