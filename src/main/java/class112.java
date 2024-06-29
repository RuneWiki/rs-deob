import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class class112 extends class418 {

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "Lgda;")
    public static class53 field1371 = new class53(39, 0);

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "[I")
    public static int[] field1372 = new int[14];

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "Z")
    public static boolean field1370;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V", line = 6)
    public static void method793(int arg0) {
        field1371 = null;
        field1372 = null;
        if (arg0 != 39) {
            field1371 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)Lgw;")
    public abstract class168 method794(int arg0);
}
