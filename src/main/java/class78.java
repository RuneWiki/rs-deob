import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class78 {

    @OriginalMember(owner = "client!in", name = "b", descriptor = "Lfc;")
    public static class235 field1069 = new class235(29, -1);

    @OriginalMember(owner = "client!in", name = "c", descriptor = "Z")
    public static boolean field1070 = false;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1071 = new String[100];

    @OriginalMember(owner = "client!in", name = "e", descriptor = "[I")
    public static int[] field1072 = new int[13];

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public static void method610(int arg0) {
        field1069 = null;
        field1071 = null;
        if (arg0 == 0) {
            field1072 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)V")
    public static final void method611(int arg0, int arg1) {
        if (arg1 != -18954) {
            field1072 = null;
        }
        field1068++;
        if (arg0 != -1 && class552.field7488[arg0]) {
            class138.field1939.method929(arg0, arg1 + 19024);
            class676.field9545[arg0] = null;
            class24.field321[arg0] = null;
            class552.field7488[arg0] = false;
        }
    }
}
