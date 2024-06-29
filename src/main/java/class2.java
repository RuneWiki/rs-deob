import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field8 = 0;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
    public static int[] field9 = new int[50];

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[I")
    public static int[] field11 = new int[13];

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field12 = -1;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "J")
    public static long field10 = 0L;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V", line = 11)
    public static final void method3(boolean arg0, int arg1) {
        field13++;
        class273.field3458++;
        if (arg1 != 0) {
            method4(13, 77, 19);
        }
        class650 var2 = class314.method1837(class223.field2941, true, class625.field8727);
        class108.method745(var2, -40);
        for (class157 var3 = (class157) class148.field1802.method3245(false); var3 != null; var3 = (class157) class148.field1802.method3252(12938)) {
            if (!var3.method3425(arg1 - 16972)) {
                var3 = (class157) class148.field1802.method3245(false);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field2027 == 0) {
                class22.method239(true, arg0, var3, 7799);
            }
        }
        if (class419.field5958 != null) {
            class663.method3591(16886, class419.field5958);
            class419.field5958 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z", line = 58)
    public static final boolean method4(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field10 = -58L;
        }
        field7++;
        return class303.method1784((byte) 122, arg2, arg1) & class756.method4204(true, arg2, arg1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 83)
    public static void method5(boolean arg0) {
        field11 = null;
        if (arg0) {
            field9 = null;
        }
    }
}
