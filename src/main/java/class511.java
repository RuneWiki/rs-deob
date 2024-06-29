import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class511 {

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "Llda;")
    public class511 field7127;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "Lnga;")
    public class539 field7126;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "[[[S")
    public static short[][][] field7120;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Ljava/lang/String;ILdt;)I")
    public static final int method2983(String arg0, int arg1, class254 arg2) {
        field7125++;
        int var3 = arg2.field3725;
        byte[] var4 = class50.method322(arg0, -1985169656);
        arg2.method1688(var4.length, true);
        arg2.field3725 += class393.field5664.method3590(arg2.field3789, var4.length, var4, 125, arg2.field3725, arg1);
        return arg2.field3725 - var3;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method2984(boolean arg0, int arg1, String arg2) {
        field7124++;
        if (arg1 < 28) {
            field7121 = -63;
        }
        class459.method2724(-1, (byte) 85, arg2, -1, arg0);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIBI)V")
    public static final void method2985(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = -68 / ((-arg3 - 20) / 42);
        field7122++;
        class778 var6 = class389.method2406(93, (long) arg1, 10);
        var6.method4274(123);
        var6.field10690 = arg0;
        var6.field10692 = arg2;
        var6.field10693 = arg4;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
    public final void method2986(byte arg0) {
        field7123++;
        if (arg0 == 67 && class641.field8645 < 500) {
            this.field7126 = null;
            this.field7127 = class68.field951;
            class641.field8645++;
            class68.field951 = this;
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)V")
    public static void method2987(byte arg0) {
        field7120 = null;
        if (arg0 != -121) {
            field7120 = null;
        }
    }
}
