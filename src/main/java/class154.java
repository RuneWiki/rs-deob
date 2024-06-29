import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class154 extends class443 {

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field1961 = 255;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "C")
    private char field1958;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "Lir;")
    public static class185 field1965;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "Lvc;")
    public static class225 field1962;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "Ljava/lang/String;")
    public String field1963;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BII)V", line = 8)
    public static final void method1036(byte arg0, int arg1, int arg2) {
        if (class134.field1753 != arg1) {
            class361.field5340 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class361.field5340[var3] = (var3 << 12) / arg1;
            }
            class359.field5322 = arg1 * 32;
            class188.field2572 = arg1 - 1;
            class134.field1753 = arg1;
        }
        field1959++;
        if (arg0 < 25) {
            field1962 = null;
        }
        if (class370.field5474 == arg2) {
            return;
        }
        if (class134.field1753 == arg2) {
            class436.field6337 = class361.field5340;
        } else {
            class436.field6337 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class436.field6337[var4] = (var4 << 12) / arg2;
            }
        }
        class215.field3000 = arg2 - 1;
        class370.field5474 = arg2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lfb;B)V", line = 59)
    public final void method1037(class341 arg0, byte arg1) {
        field1968++;
        while (true) {
            int var3 = arg0.method2233((byte) 104);
            if (var3 == 0) {
                if (arg1 == -113) {
                    return;
                } else {
                    method1040(42);
                    return;
                }
            }
            this.method1041(var3, arg0, 5);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V", line = 85)
    public static final void method1038(int arg0, byte arg1) {
        class421.field6125 = arg0;
        field1964++;
        class51 var2 = class38.field565;
        synchronized (class38.field565) {
            if (arg1 != -57) {
                method1038(7, (byte) -92);
            }
            class38.field565.method372(126);
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)Z", line = 99)
    public final boolean method1039(int arg0) {
        field1966++;
        if (arg0 == -116) {
            return this.field1958 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V", line = 110)
    public static void method1040(int arg0) {
        field1965 = null;
        field1962 = null;
        if (arg0 != -2480) {
            field1957 = -31;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILfb;I)V", line = 125)
    private final void method1041(int arg0, class341 arg1, int arg2) {
        field1967++;
        if (arg2 != 5) {
            field1965 = null;
        }
        if (arg0 == 1) {
            this.field1958 = class95.method758(arg1.method2211(arg2 + 250), false);
        } else if (arg0 == 2) {
            this.field1960 = arg1.method2232(arg2 ^ 0xFFFFFF80);
        } else if (arg0 == 5) {
            this.field1963 = arg1.method2261((byte) 67);
            return;
        }
    }
}
