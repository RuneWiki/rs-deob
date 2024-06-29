import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class259 extends class739 {

    @OriginalMember(owner = "client!se", name = "H", descriptor = "[[I")
    public static int[][] field3279 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field3280 = -1;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Lan;")
    public static class23 field3282;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "[Lrba;")
    public static class435[] field3278;

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 4)
    public class259() {
        super(0, true);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([I[IB)V", line = 14)
    public static final void method1566(int[] arg0, int[] arg1, byte arg2) {
        field3277++;
        if (arg1 == null || arg0 == null) {
            class106.field1532 = null;
            class712.field9881 = null;
            class565.field7938 = null;
            return;
        }
        class712.field9881 = arg1;
        class106.field1532 = new int[arg1.length];
        class565.field7938 = new byte[arg1.length][][];
        if (arg2 != 20) {
            field3279 = null;
        }
        for (int var3 = 0; var3 < class712.field9881.length; var3++) {
            class565.field7938[var3] = new byte[arg0[var3]][];
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[I", line = 44)
    public final int[] method215(int arg0, int arg1) {
        field3276++;
        if (arg0 != -23347) {
            field3279 = null;
        }
        return class634.field8751;
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V", line = 55)
    public static void method1567(int arg0) {
        field3278 = null;
        if (arg0 != 0) {
            field3279 = null;
        }
        field3282 = null;
        field3279 = null;
    }
}
