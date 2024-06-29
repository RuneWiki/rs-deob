import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class204 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field2795 = 0;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lbn;")
    public static class257 field2796 = new class257();

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[I")
    public static int[] field2798 = new int[250];

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public int field2794;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Ljb;")
    public class286 field2793;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "[I")
    public int[] field2797;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Lfm;", line = 9)
    public static final class436 method1300(int arg0, int arg1, int arg2) {
        class302 var3 = class19.field202[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4313;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 16)
    public static void method1301(int arg0) {
        field2796 = null;
        field2798 = null;
        if (arg0 != 250) {
            method1300(-128, -15, 110);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIB)V", line = 35)
    public static final void method1302(int arg0, int arg1, byte arg2) {
        field2799++;
        int var3 = 98 % ((-arg2 - 30) / 63);
        class175.field2435 = new class331(arg0);
        class72.field808 = new class331(arg1);
    }
}
