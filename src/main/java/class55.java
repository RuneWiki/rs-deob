import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class55 extends class337 {

    @OriginalMember(owner = "client!c", name = "s", descriptor = "Ljava/lang/String;")
    public String field715;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field710 = 0;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
    public static int[] field714 = new int[13];

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Lth;")
    public static class306 field713;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Lws;")
    public static class723 field708;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "[[B")
    public static byte[][] field712;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method336(int arg0) {
        field713 = null;
        field708 = null;
        field714 = null;
        field712 = null;
        if (arg0 > -70) {
            method338(23, 120, -68);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static final void method337(int arg0) {
        if (arg0 != -25572) {
            field712 = null;
        }
        field711++;
        class647.field8259 = new class391[class192.field2689.method143((byte) 106)][];
        class598.field7612 = new class391[class192.field2689.method143((byte) 106)][];
        class202.field2800 = new boolean[class192.field2689.method143((byte) 106)];
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
    public static final int method338(int arg0, int arg1, int arg2) {
        field709++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg0 != -5729) {
            method336(-101);
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class55() {
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class55(String arg0) {
        this.field715 = arg0;
    }
}
