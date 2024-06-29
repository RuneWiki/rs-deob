import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class221 {

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "[I")
    public static int[] field3370 = new int[13];

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field3371 = 0;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "[I")
    public static int[] field3363 = new int[256];

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "Lwl;")
    public static class452 field3367 = new class452(85, -1);

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "Lnn;")
    public static class151 field3373 = new class151("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "Lwp;")
    public class292 field3362;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "Lqn;")
    public class380 field3366;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "[[[B")
    public static byte[][][] field3372;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public static void method1342(byte arg0) {
        if (arg0 >= -110) {
            return;
        }
        field3367 = null;
        field3370 = null;
        field3363 = null;
        field3373 = null;
        field3372 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)I")
    public static final int method1343(byte arg0, int arg1) {
        field3365++;
        return arg0 == -92 ? arg1 >>> 8 : 8;
    }
}
