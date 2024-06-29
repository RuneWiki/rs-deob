import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class468 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lpca;")
    public static class716 field6423 = new class716();

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[I")
    public static int[] field6424 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[[I")
    public static int[][] field6428 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "[[I")
    public static int[][] field6430 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
    public static int[] field6425 = new int[5];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lae;")
    public static class254 field6422;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Lcl;")
    public static class269 field6426;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[S")
    public static short[] field6429;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(JI)I")
    public static final int method2641(long arg0, int arg1) {
        field6427++;
        if (arg1 < 57) {
            method2643(98, null, 17, -27);
        }
        return (int) (arg0 / 86400000L) - 11745;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method2642(boolean arg0) {
        field6425 = null;
        field6424 = null;
        field6422 = null;
        field6426 = null;
        field6423 = null;
        field6428 = null;
        field6429 = null;
        if (!arg0) {
            field6426 = null;
        }
        field6430 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[BII)[B")
    public static final byte[] method2643(int arg0, byte[] arg1, int arg2, int arg3) {
        field6421++;
        byte[] var4;
        if (arg3 > 0) {
            var4 = new byte[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                var4[var5] = arg1[arg3 + var5];
            }
        } else {
            var4 = arg1;
        }
        class319 var6 = new class319();
        var6.method1936(-126);
        var6.method1931(var4, (long) (arg2 * 8), -126);
        byte[] var7 = new byte[64];
        var6.method1932(var7, arg0, 32);
        return var7;
    }
}
