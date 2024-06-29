import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class246 {

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Lc;")
    public static class125 field4288 = new class125();

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lr;")
    public static class66 field4290 = class93.method641(43, ": ");

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[I")
    public static int[] field4293 = new int[100];

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "[S")
    public static short[] field4291;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lqj;B)Lqj;")
    public abstract class156 method758(class156 arg0, byte arg1);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method1619(int arg0) {
        field4291 = null;
        field4293 = null;
        field4288 = null;
        if (arg0 != 190) {
            method1621((byte) 96);
        }
        field4290 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lcj;Lcj;I)V")
    public static final void method1620(class28 arg0, class28 arg1, int arg2) {
        class95.field1837 = arg0;
        class161.field2886 = arg1;
        if (arg2 != -27619) {
            field4291 = null;
        }
        field4294++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static final void method1621(byte arg0) {
        if (class117.field2178.toLowerCase().indexOf("microsoft") == -1) {
            class12.field154[93] = 43;
            class12.field154[92] = 74;
            class12.field154[44] = 71;
            class12.field154[45] = 26;
            class12.field154[61] = 27;
            class12.field154[47] = 73;
            class12.field154[46] = 72;
            class12.field154[59] = 57;
            class12.field154[91] = 42;
            if (class117.field2191 == null) {
                class12.field154[222] = 59;
                class12.field154[192] = 58;
            } else {
                class12.field154[222] = 58;
                class12.field154[520] = 59;
                class12.field154[192] = 28;
            }
        } else {
            class12.field154[223] = 28;
            class12.field154[220] = 74;
            class12.field154[189] = 26;
            class12.field154[221] = 43;
            class12.field154[188] = 71;
            class12.field154[190] = 72;
            class12.field154[187] = 27;
            class12.field154[222] = 59;
            class12.field154[191] = 73;
            class12.field154[219] = 42;
            class12.field154[192] = 58;
            class12.field154[186] = 57;
        }
        if (arg0 != -109) {
            method1619(-115);
        }
        field4289++;
    }
}
