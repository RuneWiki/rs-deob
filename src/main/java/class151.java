import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class151 {

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "Lfe;")
    public static class384 field1947 = new class384(32);

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "Z")
    public static boolean field1950 = false;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "Ldc;")
    public static class5 field1951 = new class5(260);

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "Lnf;")
    public static class389 field1952 = new class389();

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method926(String arg0, int arg1) {
        field1948++;
        if (arg0 == null) {
            return -1;
        }
        if (arg1 != 7622) {
            method927(68, -2);
        }
        for (int var2 = 0; var2 < class296.field4317; var2++) {
            if (arg0.equalsIgnoreCase(class281.field4019[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)V")
    public static final void method927(int arg0, int arg1) {
        field1949++;
        int var2 = -81 % ((24 - arg1) / 52);
        class338 var3 = class380.method2294((byte) 90, arg0, 16);
        var3.method2048(121);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method928(int arg0) {
        if (arg0 != -1) {
            field1947 = null;
        }
        field1951 = null;
        field1947 = null;
        field1952 = null;
    }
}
