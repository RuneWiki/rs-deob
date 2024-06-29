import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class119 extends class208 {

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Lha;")
    private static class46 field2234 = class271.method1828("Checking for updates )2 ", -46);

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field2229 = 0;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "Lha;")
    public static class46 field2237 = field2234;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "[Lua;")
    public static class232[] field2236 = new class232[27];

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field2235 = 0;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field2239 = -1;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "Lha;")
    private static class46 field2241 = class271.method1828("Ok", -46);

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "[Z")
    public static boolean[] field2243 = new boolean[100];

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "Lha;")
    public static class46 field2245 = field2241;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lha;")
    public class46 field2230;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "Lha;")
    public class46 field2232;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "Ljava/awt/Font;")
    public static Font field2244;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[[B")
    public static byte[][] field2231;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "[[[I")
    public static int[][][] field2228;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Lca;")
    public final class122 method950(int arg0) {
        ++field2233;
        if (arg0 != 18926) {
            method951(60, 20);
        }
        return class114.field2159[super.field3723];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lwk;")
    public static final class170 method951(int arg0, int arg1) {
        ++field2242;
        class170 var2 = (class170) class237.field4188.method86(7961, (long) arg1);
        if (arg0 != 0) {
            field2235 = 87;
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class134.field2436.method1293(class189.method1372(arg1, 127), class205.method1451(arg1, (byte) 64), (byte) 102);
            class170 var4 = new class170();
            if (var3 != null) {
                var4.method1216(new class75(var3), false);
            }
            var4.method1218(false);
            class237.field4188.method80(var4, (long) arg1, (byte) 67);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLwe;)Lth;")
    public static final class111 method952(byte arg0, class75 arg1) {
        ++field2238;
        class111 var2 = new class111();
        int var3 = 36 / ((11 - arg0) / 51);
        var2.field2108 = arg1.method545((byte) 78);
        var2.field2096 = class209.method1477(2, var2.field2108);
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
    public static final void method953(int arg0, int arg1, int arg2) {
        if (arg0 != 11240) {
            method952((byte) -66, (class75) null);
        }
        ++field2227;
        class146 var3 = class6.method22((byte) 16, 6, arg2);
        var3.method1088(11102);
        var3.field2640 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
    public static void method954(byte arg0) {
        field2241 = null;
        field2236 = null;
        field2228 = null;
        if (arg0 >= -103) {
            field2239 = 29;
        }
        field2234 = null;
        field2243 = null;
        field2237 = null;
        field2231 = null;
        field2245 = null;
        field2244 = null;
    }
}
