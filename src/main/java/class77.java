import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class class77 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lsd;")
    public static class74 field922 = new class74(8, 20);

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "[[I")
    public static int[][] field926 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Lco;")
    public static class210 field924 = new class210(10);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Lfc;")
    public static class209 field927;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Lgu;")
    public static final class255 method389(int arg0) {
        if (arg0 != 9) {
            method390(40);
        }
        field923++;
        try {
            return (class255) Class.forName("md").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static void method390(int arg0) {
        field924 = null;
        field926 = null;
        field927 = null;
        field922 = null;
        int var1 = -112 / ((79 - arg0) / 42);
    }
}
