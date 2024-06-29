import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class129 {

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Z")
    public static boolean field1892 = true;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1893 = "skill: ";

    @OriginalMember(owner = "client!w", name = "b", descriptor = "F")
    public static float field1890;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 5)
    public static void method943(int arg0) {
        field1893 = null;
        int var1 = 55 % ((arg0 - 10) / 53);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 14)
    public static final void method944(byte arg0) {
        if (arg0 != -3) {
            return;
        }
        if (class137.field2192.toLowerCase().indexOf("microsoft") == -1) {
            class249.field3923[91] = 42;
            class249.field3923[45] = 26;
            class249.field3923[61] = 27;
            class249.field3923[47] = 73;
            class249.field3923[46] = 72;
            if (class137.field2194 == null) {
                class249.field3923[222] = 59;
                class249.field3923[192] = 58;
            } else {
                class249.field3923[520] = 59;
                class249.field3923[192] = 28;
                class249.field3923[222] = 58;
            }
            class249.field3923[93] = 43;
            class249.field3923[59] = 57;
            class249.field3923[92] = 74;
            class249.field3923[44] = 71;
        } else {
            class249.field3923[192] = 58;
            class249.field3923[219] = 42;
            class249.field3923[222] = 59;
            class249.field3923[187] = 27;
            class249.field3923[190] = 72;
            class249.field3923[188] = 71;
            class249.field3923[223] = 28;
            class249.field3923[191] = 73;
            class249.field3923[221] = 43;
            class249.field3923[220] = 74;
            class249.field3923[186] = 57;
            class249.field3923[189] = 26;
        }
        field1889++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 66)
    public static final void method945(boolean arg0) {
        class135.field1981 = -1;
        class130.field1919 = arg0;
        field1891++;
        class343.field5328 = 0;
        class81.field1110 = 0;
        class156.field2415 = 0;
        class124.field1797 = 1;
        class91.field1216 = -3;
    }
}
