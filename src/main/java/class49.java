import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class49 extends class65 {

    @OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
    public static int[] field810 = new int[32];

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field808 = 0;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "S")
    public static short field811 = 32767;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "[I")
    public int[] field802;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "[I")
    public int[] field805;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
    public int[] field807;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[Leha;")
    public class162[] field801;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "[Leha;")
    public class162[] field804;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "[[[B")
    public byte[][][] field800;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field810[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()V", line = 10)
    public static final void method485() {
        class55.method523(1, class386.field5782);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)Z", line = 13)
    public static final boolean method486(boolean arg0, int arg1) {
        field803++;
        if (arg1 != 2) {
            field808 = -95;
        }
        boolean var2 = class364.field5573.method1237();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class364.field5573.method1258();
        } else if (!class364.field5573.method1292()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class654.field9289.method2292(109, arg0 ? 1 : 0, class654.field9289.field5429);
            class580.method3351((byte) -125);
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 51)
    public static void method487(byte arg0) {
        field810 = null;
        if (arg0 <= 95) {
            method486(true, 101);
        }
    }
}
