import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class282 extends class194 {

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public int field4950;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public int field4947;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public int field4946;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public int field4955;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "Lbf;")
    public static class199 field4956 = new class199(50);

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field4959 = -1;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "Lbf;")
    public static class199 field4958 = new class199(260);

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "[J")
    public static long[] field4960 = new long[500];

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "[J")
    public static long[] field4963 = new long[100];

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "Ldk;")
    public static class275 field4962 = new class275(512);

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "[I")
    public static int[] field4961;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "[I")
    public static int[] field4964;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Z")
    public final boolean method1915(int arg0, int arg1, int arg2) {
        if (arg1 == 500) {
            field4952++;
            return arg0 >= this.field4955 && arg0 <= this.field4947 && this.field4946 <= arg2 && arg2 <= this.field4950;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
    public static final void method1916(byte arg0) {
        class256.field4580.method1390((byte) 115);
        field4953++;
        int var1 = 83 / ((-arg0 - 27) / 39);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
    public static final void method1917(boolean arg0) {
        field4949++;
        if (!arg0) {
            method1918(44, -32);
        }
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class106.method763(var1, class82.field1498, var3, true, var2, (byte) 124)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Z")
    public static final boolean method1918(int arg0, int arg1) {
        if (arg0 != 15255) {
            field4960 = null;
        }
        field4951++;
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(Z)V")
    public static final void method1919(boolean arg0) {
        if (!arg0) {
            field4959 = -19;
        }
        field4948++;
        class232.field4264.method1382(31346);
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public static void method1920(int arg0) {
        if (arg0 >= -44) {
            return;
        }
        field4964 = null;
        field4956 = null;
        field4963 = null;
        field4961 = null;
        field4958 = null;
        field4960 = null;
        field4962 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLv;)Luj;")
    public static final class279 method1921(byte arg0, class149 arg1) {
        if (arg0 < 39) {
            field4960 = null;
        }
        field4954++;
        return new class279(arg1.method1075(65536), arg1.method1075(65536), arg1.method1075(65536), arg1.method1075(65536), arg1.method1065((byte) 71), arg1.method1045((byte) -45));
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIII)V")
    public class282(int arg0, int arg1, int arg2, int arg3) {
        this.field4950 = arg3;
        this.field4947 = arg2;
        this.field4946 = arg1;
        this.field4955 = arg0;
    }
}
