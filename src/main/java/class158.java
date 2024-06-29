import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class158 {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[[F")
    public static float[][] field2368 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Liu;")
    public static class517 field2369 = new class517(78, -1);

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lbv;")
    public static class567 field2374 = new class567("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "[B")
    public byte[] field2367;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[I")
    public static int[] field2366;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "[S")
    public short[] field2371;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[S")
    public short[] field2372;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "[S")
    public short[] field2373;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 5)
    public static void method1120(byte arg0) {
        field2374 = null;
        int var1 = -5 / ((arg0 - 47) / 57);
        field2368 = null;
        field2366 = null;
        field2369 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Llu;", line = 19)
    public static final class514 method1121(int arg0) {
        int var1 = -93 % ((36 - arg0) / 35);
        field2370++;
        try {
            return (class514) Class.forName("rc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I", line = 44)
    public static final int method1122(int arg0, int arg1) {
        if (arg1 == 1812914344) {
            field2365++;
            return arg0 >>> 8;
        } else {
            return -95;
        }
    }
}
