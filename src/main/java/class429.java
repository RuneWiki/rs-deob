import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class429 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field6411 = 0;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Ls;")
    public static class186 field6413 = new class186(34, 3);

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Lbj;")
    public static class162 field6414 = new class162(15, 7);

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "[I")
    public static int[] field6416 = new int[1];

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "F")
    public static float field6415;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lgh;B)V")
    public static final void method2587(class388 arg0, byte arg1) {
        field6412++;
        if (class186.field2987 == arg0.field5685) {
            class486.field7167[arg0.field5780] = true;
        }
        if (arg1 != -63) {
            field6417 = -83;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lba;I)Lba;")
    public abstract class265 method954(class265 arg0, int arg1);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method2588(int arg0) {
        field6416 = null;
        if (arg0 < 19) {
            method2588(-58);
        }
        field6414 = null;
        field6413 = null;
    }
}
