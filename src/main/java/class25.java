import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[Lrw;")
    public static class543[] field354 = new class543[14];

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field355 = -1;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Lbd;")
    public static class44 field356 = new class44("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[[[I")
    public static int[][][] field359 = new int[2][][];

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Lwp;")
    public static class122 field358 = new class122();

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "[Z")
    public static boolean[] field361 = new boolean[100];

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[I")
    public static int[] field360 = new int[32];

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "[[B")
    public static byte[][] field363;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static void method158(byte arg0) {
        field358 = null;
        field354 = null;
        field356 = null;
        field359 = null;
        field363 = null;
        field360 = null;
        if (arg0 != -8) {
            method159(-118, -81);
        }
        field361 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V")
    public static final void method159(int arg0, int arg1) {
        class446.field6368 = 100;
        class238.field3599 = arg1;
        class288.field4266 = 3;
        class356.field5183 = arg0;
        field357++;
    }
}
