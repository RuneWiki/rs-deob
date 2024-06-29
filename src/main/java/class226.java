import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class226 {

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "Lvh;")
    public static class53 field3970 = new class53(new byte[5000]);

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Lud;")
    public static class279 field3972 = class130.method1024("Regarder dans cette direction", 255);

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "[[I")
    public static int[][] field3973 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "[I")
    public static int[] field3975 = new int[14];

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "Z")
    public static boolean field3974 = false;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "Lcd;")
    public static class69 field3977 = new class69(8);

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "[I")
    public static int[] field3976;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 9)
    public static void method1649(byte arg0) {
        field3975 = null;
        field3976 = null;
        field3977 = null;
        field3970 = null;
        field3973 = (int[][]) null;
        field3972 = null;
        if (arg0 <= 97) {
            method1649((byte) 28);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIII)I", line = 32)
    public static final int method1650(boolean arg0, int arg1, int arg2, int arg3) {
        class109 var4 = (class109) class103.field1928.method610((long) arg3, -1);
        field3971++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        int var6 = 0;
        if (arg2 <= 11) {
            return 111;
        }
        while (var4.field2019.length > var6) {
            if (var4.field2019[var6] >= 0 && var4.field2019[var6] < class321.field5614) {
                class157 var7 = class220.method1612(-2254, var4.field2019[var6]);
                if (var7.field2827 != null) {
                    class91 var8 = (class91) var7.field2827.method610((long) arg1, -1);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field2013[var6] * var8.field1714;
                        } else {
                            var5 += var8.field1714;
                        }
                    }
                }
            }
            var6++;
        }
        return var5;
    }
}
