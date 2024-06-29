import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class110 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
    public static int[] field1890 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lbg;")
    public static class310 field1894 = new class310(4, -1);

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "F")
    public static float field1897;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1896;

    static {
        new class423(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z", line = 7)
    public static final boolean method789(int arg0, int arg1) {
        field1892++;
        if (arg1 != 1135345664) {
            field1890 = null;
        }
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 18)
    public static void method790(int arg0) {
        field1894 = null;
        field1890 = null;
        if (arg0 != 1) {
            field1897 = 0.0053847213F;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 30)
    public static final void method791(byte arg0) {
        class312.field4695 = -1;
        if (arg0 != 29) {
            field1894 = null;
        }
        field1891++;
        class402.field5846 = -1;
        class57.field975 = 0;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)Z", line = 45)
    public static final boolean method792(int arg0) {
        if (arg0 != -21786) {
            method791((byte) 35);
        }
        field1895++;
        return class107.field1870;
    }
}
