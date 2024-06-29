import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class72 {

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field1245 = 0;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "[I")
    public static int[] field1246 = new int[3];

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "[I")
    public static int[] field1244 = new int[2];

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "Z")
    public static boolean field1247 = true;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Lug;")
    public static class392 field1243 = new class392();

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "[I")
    public static int[] field1249 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V", line = 3)
    public static void method587(byte arg0) {
        field1243 = null;
        field1246 = null;
        field1249 = null;
        field1244 = null;
        int var1 = -88 % ((arg0 + 12) / 57);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZI)V", line = 17)
    public static final void method588(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1248++;
            class54 var3 = class442.method2651(arg2, 6, -13208);
            var3.method480(0);
            var3.field934 = arg0;
        }
    }
}
