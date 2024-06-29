import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class457 {

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "[I")
    public static int[] field6780 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "F")
    public static float field6777;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method2723(int arg0) {
        field6780 = null;
        if (arg0 != -30773) {
            method2724(96, 63);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
    public static final void method2724(int arg0, int arg1) {
        field6779++;
        int var2 = -98 % ((2 - arg1) / 60);
        class18 var3 = class140.method1047(5, arg0, false);
        var3.method123(20983);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2725(boolean arg0, int arg1) {
        field6776++;
        if (arg0) {
            field6780 = null;
        }
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    static {
        new class309("Select", "Auswählen", "Sélectionner", "Selecionar");
    }
}
