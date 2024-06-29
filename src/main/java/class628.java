import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class628 extends class647 {

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Lmm;")
    public static class295 field8782 = new class295(14, 0);

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Lmm;")
    public static class295 field8787 = new class295(15, 4);

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Lmm;")
    public static class295 field8788 = new class295(16, -2);

    @OriginalMember(owner = "client!re", name = "R", descriptor = "Lmm;")
    public static class295 field8789 = new class295(17, 0);

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Lmm;")
    public static class295 field8790 = new class295(19, -2);

    @OriginalMember(owner = "client!re", name = "U", descriptor = "Lmm;")
    public static class295 field8791 = new class295(22, -2);

    @OriginalMember(owner = "client!re", name = "V", descriptor = "Lmm;")
    public static class295 field8792 = new class295(23, 4);

    @OriginalMember(owner = "client!re", name = "W", descriptor = "Lmm;")
    public static class295 field8793 = new class295(24, -1);

    @OriginalMember(owner = "client!re", name = "X", descriptor = "Lmm;")
    public static class295 field8794 = new class295(26, 0);

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "Lmm;")
    public static class295 field8795 = new class295(27, 0);

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "Lmm;")
    public static class295 field8796 = new class295(28, -2);

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "Lmm;")
    public static class295 field8797 = new class295(29, -2);

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "Lmm;")
    public static class295 field8798 = new class295(30, -2);

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "[Lmm;")
    private static class295[] field8799 = new class295[32];

    @OriginalMember(owner = "client!re", name = "db", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "[B")
    private byte[] field8785;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIB)V")
    public final void method2278(boolean arg0, int arg1, byte arg2) {
        field8783++;
        int var4 = arg1 * 2;
        if (arg0) {
            int var5 = arg2 & 0xFF;
            this.field8785[var4++] = -1;
            this.field8785[var4] = (byte) (var5 * 3 >> 5);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3532(int arg0, int arg1, int arg2, int arg3) {
        this.field8785 = new byte[arg0 * arg2 * arg3 * 2];
        if (arg1 != -31095) {
            method3534(-118);
        }
        field8786++;
        this.method1751((byte) -123, arg0, arg3, arg2);
        return this.field8785;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLaj;)V")
    public static final void method3533(byte arg0, class333 arg1) {
        int var2 = 86 / ((arg0 - 56) / 37);
        field8781++;
        class491.field6807 = arg1;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class628() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V")
    public static void method3534(int arg0) {
        field8796 = null;
        field8782 = null;
        field8797 = null;
        field8790 = null;
        field8794 = null;
        field8798 = null;
        field8787 = null;
        field8791 = null;
        field8793 = null;
        field8792 = null;
        if (arg0 != 8) {
            method3533((byte) 118, null);
        }
        field8789 = null;
        field8795 = null;
        field8799 = null;
        field8788 = null;
    }

    static {
        class295[] var0 = class4.method29(-122);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field8799[var0[var1].field4282] = var0[var1];
        }
        field8800 = 104;
    }
}
