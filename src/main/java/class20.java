import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class20 extends class196 {

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public int field299 = 0;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field301 = 0;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field304 = 1;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "Lk;")
    public static class91 field297;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "[[[B")
    public static byte[][][] field298;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
    public static final void method131(byte arg0) {
        class30.field473 = null;
        class47.field784 = null;
        field302++;
        class153.field2947 = null;
        int var1 = 107 % ((23 - arg0) / 34);
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    public static void method132(int arg0) {
        field298 = null;
        field297 = null;
        if (arg0 >= -30) {
            field297 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILme;)V")
    public final void method133(int arg0, class114 arg1) {
        field300++;
        while (true) {
            int var3 = arg1.method767(true);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    field297 = null;
                    return;
                }
            }
            this.method134(arg1, arg0 ^ 0xFFFFEBB6, var3);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lme;II)V")
    private final void method134(class114 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            this.field299 = arg0.method762((byte) 122);
        }
        if (arg1 == -5194) {
            field303++;
        }
    }
}
