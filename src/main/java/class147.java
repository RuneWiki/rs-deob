import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class147 extends class488 {

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public int field2269 = (int) (class165.method1188((byte) 26) / 1000L);

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "S")
    public short field2267;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Ljava/lang/String;")
    public String field2265;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lrn;")
    public static class180 field2266;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lfh;")
    public static class470 field2270;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
    public static int[] field2268;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static final void method1041(byte arg0) {
        if (class411.field5811.toLowerCase().indexOf("microsoft") == -1) {
            class176.field2633[59] = 57;
            class176.field2633[92] = 74;
            class176.field2633[44] = 71;
            class176.field2633[61] = 27;
            if (class411.field5825 == null) {
                class176.field2633[192] = 58;
                class176.field2633[222] = 59;
            } else {
                class176.field2633[520] = 59;
                class176.field2633[222] = 58;
                class176.field2633[192] = 28;
            }
            class176.field2633[45] = 26;
            class176.field2633[46] = 72;
            class176.field2633[47] = 73;
            class176.field2633[93] = 43;
            class176.field2633[91] = 42;
        } else {
            class176.field2633[189] = 26;
            class176.field2633[187] = 27;
            class176.field2633[220] = 74;
            class176.field2633[223] = 28;
            class176.field2633[188] = 71;
            class176.field2633[190] = 72;
            class176.field2633[222] = 59;
            class176.field2633[186] = 57;
            class176.field2633[192] = 58;
            class176.field2633[221] = 43;
            class176.field2633[191] = 73;
            class176.field2633[219] = 42;
        }
        field2271++;
        if (arg0 > -3) {
            method1042(-11);
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
    public static void method1042(int arg0) {
        if (arg0 != 59) {
            method1041((byte) -103);
        }
        field2268 = null;
        field2270 = null;
        field2266 = null;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class147(String arg0, int arg1) {
        this.field2267 = (short) arg1;
        this.field2265 = arg0;
    }
}
