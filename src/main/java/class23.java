import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class class23 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Llh;")
    public static class342 field434 = new class342();

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lvg;")
    public static class622 field435 = new class622(74, -2);

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "[S")
    private static short[] field439 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[S")
    private static short[] field438 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "[S")
    private static short[] field440 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "[I")
    public static int[] field437 = new int[32];

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "[S")
    private static short[] field441 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "[[S")
    public static short[][] field436 = new short[][] { field441, field439, field440, field438 };

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lmo;")
    public static class480 field431;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[Lf;")
    public static class256[] field433;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V", line = 5)
    public static void method157(byte arg0) {
        field435 = null;
        field436 = null;
        field439 = null;
        field437 = null;
        field440 = null;
        field441 = null;
        field434 = null;
        if (arg0 > -92) {
            method157((byte) 58);
        }
        field431 = null;
        field438 = null;
        field433 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lgaa;B)Lgaa;")
    public abstract class431 method158(class431 arg0, byte arg1);
}
