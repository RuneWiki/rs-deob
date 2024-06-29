import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class216 {

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
    public static int[] field3902 = new int[100];

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Llc;")
    public static class83 field3900;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[Lwj;")
    public static class6[] field3901;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method1529(byte arg0) {
        field3900 = null;
        field3902 = null;
        field3901 = null;
        if (arg0 < 33) {
            method1529((byte) 88);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
    public static final void method1530(int arg0, int arg1) {
        field3903++;
        class161 var2 = class204.method1456(true, 8, arg1);
        if (arg0 > 67) {
            var2.method1173(true);
        }
    }
}
