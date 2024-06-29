import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class382 extends class35 {

    @OriginalMember(owner = "client!of", name = "m", descriptor = "J")
    public long field5654;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lsh;")
    public static class472 field5656 = new class472(42, 0);

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field5658 = 0;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "[I")
    public static int[] field5659 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "Liu;")
    public static class397 field5662;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "[I")
    public static int[] field5660;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method2329(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field5661++;
        int var7 = 103 % ((-arg5 - 15) / 58);
        if (class293.field4420 <= arg4 - arg6 && arg4 + arg6 <= class119.field1643 && class176.field2503 <= arg1 - arg6 && arg1 + arg6 <= class296.field4443) {
            class94.method730(arg4, arg3, arg0, arg6, arg1, 28160, arg2);
        } else {
            class131.method913(arg2, true, arg6, arg4, arg0, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method2330(byte arg0) {
        field5659 = null;
        field5662 = null;
        if (arg0 == 34) {
            field5660 = null;
            field5656 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class382() {
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(J)V")
    public class382(long arg0) {
        this.field5654 = arg0;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static final void method2331(boolean arg0) {
        field5655++;
        class260.field3869.method716((byte) -107);
        for (int var1 = 0; var1 < 32; var1++) {
            class9.field143[var1] = 0L;
        }
        if (arg0) {
            field5656 = null;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class281.field4245[var2] = 0L;
        }
        class293.field4418 = 0;
    }
}
