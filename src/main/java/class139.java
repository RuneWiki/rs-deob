import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class139 {

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[I")
    public static int[] field2416 = new int[2000];

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public int field2414;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lub;")
    public class227 field2412;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Z")
    public boolean field2408;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method887(int arg0) {
        field2416 = null;
        int var1 = -50 / ((arg0 - 46) / 54);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lta;Z)Lta;")
    public static final class105 method888(class105 arg0, boolean arg1) {
        field2413++;
        if (arg0.field1968 != -1) {
            return class27.method137(arg0.field1968, -954490064);
        }
        int var2 = arg0.field1861 >>> 16;
        for (class182 var3 = (class182) class58.field1070.method1299((byte) 23); var3 != null; var3 = (class182) class58.field1070.method1295((byte) 31)) {
            if (var3.field3106 == var2) {
                return class27.method137((int) var3.field1113, -954490064);
            }
        }
        if (!arg1) {
            field2416 = null;
        }
        return null;
    }
}
