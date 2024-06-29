import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class695 extends class609 {

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public int field9866;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "[F")
    public static float[] field9872 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "[I")
    public static int[] field9874 = new int[13];

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field9873;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "Lf;")
    public static class257 field9870;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([BIZ)V", line = 5)
    public static final void method3914(byte[] arg0, int arg1, boolean arg2) {
        if (class348.field4920 == null) {
            class348.field4920 = new class465(20000);
        }
        field9868++;
        class348.field4920.method2731(0, arg0.length, arg0, arg1);
        if (!arg2) {
            return;
        }
        class399.method2423(class348.field4920.field6719, 117);
        class432.field6219 = new class613[class254.field3670];
        int var3 = 0;
        for (int var4 = field9867; var4 <= class302.field4240; var4++) {
            class613 var5 = class657.method3705((byte) -63, var4);
            if (var5 != null) {
                class432.field6219[var3++] = var5;
            }
        }
        class383.field5611 = false;
        class142.field2464 = class254.method1619(true);
        class348.field4920 = null;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(ILvn;Lmf;III)V", line = 46)
    public class695(int arg0, class186 arg1, class409 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9866 = arg5;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Lkq;", line = 57)
    public final class696 method726(int arg0) {
        field9873++;
        return arg0 == -17 ? class694.field9863 : null;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V", line = 68)
    public static void method3915(int arg0) {
        field9870 = null;
        field9872 = null;
        field9874 = null;
        if (arg0 != 20000) {
            method3914(null, -66, false);
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)I", line = 80)
    public static final int method3916(int arg0) {
        if (arg0 != 13) {
            field9870 = null;
        }
        field9871++;
        return 46;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lfh;Lfh;Z)V", line = 92)
    public static final void method3917(class600 arg0, class600 arg1, boolean arg2) {
        if (arg0.field8658 != null) {
            arg0.method3421(3);
        }
        field9869++;
        arg0.field8656 = arg1;
        arg0.field8658 = arg1.field8658;
        arg0.field8658.field8656 = arg0;
        arg0.field8656.field8658 = arg0;
        if (!arg2) {
            field9874 = null;
        }
    }
}
