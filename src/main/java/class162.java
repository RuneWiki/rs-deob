import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class162 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    private int field2595;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Los;")
    public static class309 field2594 = new class309("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "[[[I")
    public static int[][][] field2598;

    @OriginalMember(owner = "client!bj", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field2599++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 16)
    public static void method1151(int arg0) {
        field2594 = null;
        field2598 = null;
        int var1 = 126 % ((arg0 + 57) / 53);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)I", line = 28)
    public final int method1152(int arg0) {
        field2596++;
        return arg0 == 10196 ? this.field2595 : 42;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(II)V", line = 39)
    public class162(int arg0, int arg1) {
        this.field2595 = arg0;
    }
}
