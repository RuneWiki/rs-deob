import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class270 {

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "Lda;")
    public class61 field3397 = null;

    @OriginalMember(owner = "client!tia", name = "f", descriptor = "Ljl;")
    public class274 field3402 = null;

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "Z")
    public static boolean field3398 = false;

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "[[B")
    public static byte[][] field3401 = new byte[250][];

    @OriginalMember(owner = "client!tia", name = "h", descriptor = "I")
    public static int field3404 = 1;

    @OriginalMember(owner = "client!tia", name = "g", descriptor = "[I")
    public static int[] field3403 = new int[1];

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "Lhg;")
    public static class693 field3399 = new class693(14, -1);

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!tia", name = "i", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!tia", name = "j", descriptor = "Ljl;")
    public static class274 field3406;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1604(int arg0, byte arg1, int arg2) {
        field3400++;
        if (arg1 < 21) {
            field3401 = null;
        }
        return class210.method1352(arg0, arg2, (byte) 62) | (arg0 & 0x70000) != 0 || class92.method736(-65, arg0, arg2);
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(B)V")
    public static void method1605(byte arg0) {
        field3406 = null;
        field3403 = null;
        field3399 = null;
        int var1 = -88 % ((26 - arg0) / 44);
        field3401 = null;
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(Lda;)V")
    public class270(class61 arg0) {
        this.field3397 = arg0;
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(Lda;Ljl;)V")
    public class270(class61 arg0, class274 arg1) {
        this.field3397 = arg0;
        this.field3402 = arg1;
    }
}
