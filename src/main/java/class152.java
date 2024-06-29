import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class152 {

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lpg;")
    public static class320 field2284 = new class320(5);

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field2288 = 0;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Z")
    public static boolean field2291 = true;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2295 = "scroll:";

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Ll;")
    public static class133 field2286;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lfg;")
    public static class192 field2287;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljava/lang/String;")
    public String field2283;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2294;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
    public static int[] field2289;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BIIIII)V", line = 8)
    public static final void method1050(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -78 / ((arg0 - 23) / 51);
        field2285++;
        if (arg3 == arg5) {
            class257.method1760(arg4, arg1, arg2, (byte) -47, arg3);
        } else if (class206.field3170 <= arg4 - arg3 && class12.field184 >= (arg4 + arg3) && class119.field1817 <= arg1 - arg5 && class141.field2187 >= (arg1 + arg5)) {
            class20.method151(-1, arg2, arg3, arg5, arg1, arg4);
        } else {
            class131.method941(-22111, arg2, arg5, arg3, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILkh;)Lui;", line = 32)
    public static final class244 method1051(int arg0, class166 arg1) {
        field2282++;
        if (arg0 > -52) {
            method1050((byte) 46, -52, -110, 103, -86, -81);
        }
        return new class244(arg1.method1166(52), arg1.method1166(52), arg1.method1166(52), arg1.method1166(52), arg1.method1156((byte) 59), arg1.method1156((byte) 16), arg1.method1178(0));
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 51)
    public static final void method1052(int arg0) {
        for (int var1 = arg0; var1 < class310.field4816; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class103.field1606[var1];
            }
            class33 var3 = class254.field3992[var2];
            if (var3 != null && var3.field1916 > 0) {
                var3.field1916--;
                if (var3.field1916 == 0) {
                    var3.field1945 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class312.field4839; var4++) {
            int var5 = class325.field5049[var4];
            class313 var6 = class254.field3989[var5];
            if (var6 != null && var6.field1916 > 0) {
                var6.field1916--;
                if (var6.field1916 == 0) {
                    var6.field1945 = null;
                }
            }
        }
        field2290++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 102)
    public static final void method1053(byte arg0) {
        field2281++;
        class321.field5014.method2176((byte) 109);
        class149.field2261.method2176((byte) 109);
        class229.field3639.method2176((byte) -110);
        int var1 = -45 / ((49 - arg0) / 62);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 131)
    public static void method1054(int arg0) {
        field2286 = null;
        if (arg0 != 0) {
            method1052(60);
        }
        field2289 = null;
        field2284 = null;
        field2294 = null;
        field2287 = null;
        field2295 = null;
    }
}
