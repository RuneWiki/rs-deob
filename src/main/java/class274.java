import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class274 {

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[I")
    public static int[] field3955 = new int[14];

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lgf;")
    public static class180 field3956 = new class180("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Lkp;")
    public static class337 field3957;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lcm;")
    public class509 field3953;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[I")
    public static int[] field3954;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "[I")
    public int[] field3963;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "[[S")
    public static short[][] field3964;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILtn;I)Ljava/lang/String;", line = 6)
    public static final String method1746(int arg0, class58 arg1, int arg2) {
        int var3 = 36 / ((arg0 + 33) / 55);
        field3952++;
        if (!client.method1349(arg1).method782(arg2, 0) && arg1.field880 == null) {
            return null;
        } else if (arg1.field941 == null || arg1.field941.length <= arg2 || arg1.field941[arg2] == null || arg1.field941[arg2].trim().length() == 0) {
            return class38.field578 ? "Hidden-" + arg2 : null;
        } else {
            return arg1.field941[arg2];
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 34)
    public static final void method1747(int arg0) {
        if (class312.field4475.toLowerCase().indexOf("microsoft") == -1) {
            class292.field4182[93] = 43;
            class292.field4182[61] = 27;
            class292.field4182[45] = 26;
            class292.field4182[91] = 42;
            class292.field4182[47] = 73;
            class292.field4182[44] = 71;
            class292.field4182[92] = 74;
            class292.field4182[59] = 57;
            if (class312.field4480 == null) {
                class292.field4182[192] = 58;
                class292.field4182[222] = 59;
            } else {
                class292.field4182[192] = 28;
                class292.field4182[520] = 59;
                class292.field4182[222] = 58;
            }
            class292.field4182[46] = 72;
        } else {
            class292.field4182[222] = 59;
            class292.field4182[223] = 28;
            class292.field4182[191] = 73;
            class292.field4182[186] = 57;
            class292.field4182[190] = 72;
            class292.field4182[220] = 74;
            class292.field4182[219] = 42;
            class292.field4182[187] = 27;
            class292.field4182[192] = 58;
            class292.field4182[221] = 43;
            class292.field4182[189] = 26;
            class292.field4182[188] = 71;
        }
        if (arg0 != 46) {
            method1746(98, null, 6);
        }
        field3962++;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 88)
    public static void method1748(int arg0) {
        field3956 = null;
        field3954 = null;
        field3964 = null;
        field3955 = null;
        if (arg0 >= -117) {
            method1747(29);
        }
        field3957 = null;
    }
}
