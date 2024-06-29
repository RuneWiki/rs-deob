import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class74 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Lec;")
    public static class40 field892 = new class40("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lg;")
    public static class470 field900;

    @OriginalMember(owner = "client!sd", name = "toString", descriptor = "()Ljava/lang/String;", line = 8)
    public final String toString() {
        field899++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)I", line = 16)
    public final int method378(int arg0) {
        if (arg0 != 0) {
            method380(21);
        }
        field896++;
        return this.field895;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 33)
    public static void method379(boolean arg0) {
        field900 = null;
        field892 = null;
        if (!arg0) {
            method379(true);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 46)
    public static final void method380(int arg0) {
        class232.field3221 = arg0;
        for (int var1 = 0; var1 < class176.field2122; var1++) {
            for (int var2 = 0; var2 < class225.field3116; var2++) {
                if (class293.field4356[arg0][var1][var2] == null) {
                    class293.field4356[arg0][var1][var2] = new class263(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(II)V", line = 69)
    public class74(int arg0, int arg1) {
        this.field895 = arg0;
        this.field897 = arg1;
    }
}
