import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class683 {

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lwp;")
    public static class453 field9597 = new class453(69, 6);

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "[[I")
    public static int[][] field9598 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[I")
    public static int[] field9600 = new int[32];

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Z")
    public static boolean field9601 = false;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field9591;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public int field9592;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public int field9593;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public int field9594;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field9596;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "[[Lmc;")
    public static class424[][] field9599;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method3842(byte arg0) {
        field9599 = null;
        field9600 = null;
        field9598 = null;
        if (arg0 != 17) {
            field9599 = null;
        }
        field9597 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZI)V")
    public static final void method3843(int arg0, boolean arg1, int arg2) {
        field9595++;
        class492 var3 = class183.method1141(arg1, (byte) 59, arg2);
        if (var3 != null) {
            if (arg0 <= 39) {
                field9599 = null;
            }
            var3.method1871(-10);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BILes;)V")
    private final void method3844(byte arg0, int arg1, class630 arg2) {
        field9596++;
        if (arg1 == 1) {
            this.field9593 = arg2.method3470(13111);
            this.field9594 = arg2.method3501(-9268);
            this.field9592 = arg2.method3501(-9268);
        }
        if (arg0 < 124) {
            method3843(-104, true, -28);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILes;)V")
    public final void method3845(int arg0, class630 arg1) {
        if (arg0 != 1) {
            this.method3844((byte) 118, 111, null);
        }
        while (true) {
            int var3 = arg1.method3501(-9268);
            if (var3 == 0) {
                field9591++;
                return;
            }
            this.method3844((byte) 127, var3, arg1);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field9600[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
