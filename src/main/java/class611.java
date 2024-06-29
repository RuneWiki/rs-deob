import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class611 extends class502 {

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "Lfja;")
    public static class783 field8526 = new class783(86, 7);

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Lwm;")
    public static class591 field8531 = new class591();

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "Z")
    public static boolean field8532 = false;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "F")
    public static float field8530;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field8527;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method3465(int arg0) {
        ++field8529;
        if (super.field6863.method2830((byte) 107)) {
            return false;
        } else {
            if (arg0 != 0) {
                field8526 = null;
            }
            return super.field6863.method2826(true) == class505.field6887;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Leka;)V", line = 24)
    public class611(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 27)
    public static final void method3466(int arg0) {
        ++field8528;
        for (int var1 = arg0; ~var1 > ~class57.field806; ++var1) {
            class481 var2 = class531.field7189[var1];
            if (~var2.field6489 == -4) {
                if (var2.field6487 == null) {
                    var2.field6495 = Integer.MIN_VALUE;
                } else {
                    class456.field6213.method352(var2.field6487);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 54)
    public final void method58(boolean arg0) {
        ++field8524;
        if (super.field6863.method2826(arg0) != class505.field6887) {
            super.field6865 = 1;
        } else if (super.field6863.method2830((byte) 110)) {
            super.field6865 = 0;
        }
        if (~super.field6865 != -1 && ~super.field6865 != -2) {
            super.field6865 = this.method55(-2);
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)I", line = 74)
    public final int method3467(byte arg0) {
        if (arg0 <= 49) {
            field8532 = false;
        }
        ++field8523;
        return super.field6865;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)V", line = 85)
    public final void method52(int arg0, int arg1) {
        super.field6865 = arg0;
        ++field8527;
        if (arg1 != 0) {
            field8532 = false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I", line = 96)
    public final int method55(int arg0) {
        ++field8522;
        if (arg0 != -2) {
            method3468((byte) -128);
        }
        return 1;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILeka;)V", line = 107)
    public class611(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(B)V", line = 112)
    public static void method3468(byte arg0) {
        field8531 = null;
        if (arg0 <= 109) {
            field8530 = -0.7449604F;
        }
        field8526 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I", line = 124)
    public final int method57(int arg0, int arg1) {
        ++field8525;
        if (super.field6863.method2830((byte) 104)) {
            return 3;
        } else if (super.field6863.method2826(true) == class505.field6887) {
            if (~arg0 == -1) {
                if (~super.field6863.field6765.method330((byte) 62) == -2) {
                    return 2;
                }
                if (~super.field6863.field6743.method3385((byte) 123) == -2) {
                    return 2;
                }
                if (super.field6863.field6735.method1135((byte) 98) > 0) {
                    return 2;
                }
            }
            return 1;
        } else {
            if (arg1 != 0) {
                field8531 = null;
            }
            return 3;
        }
    }
}
