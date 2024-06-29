import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class class588 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field8258 = 0;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Z")
    public static boolean field8262 = false;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Lgca;")
    public static class227 field8265 = new class227();

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Lsea;")
    public static class648 field8260;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "[Z")
    public static boolean[] field8266;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static void method3338(byte arg0) {
        field8260 = null;
        if (arg0 < 50) {
            field8258 = -109;
        }
        field8266 = null;
        field8265 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static final void method3339(int arg0) {
        class663 var1 = class120.field1658;
        synchronized (class120.field1658) {
            class120.field1658.method3749(7648);
        }
        field8267++;
        if (arg0 != 5890) {
            method3341((byte) -83, null);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILlj;III)Lnea;")
    public static final class665 method3340(int arg0, class565 arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            field8265 = null;
        }
        field8264++;
        if (!arg1.field7870 && (!method3342(-125, arg2) || !method3342(arg0 + 70, arg3))) {
            return arg1.field7973 ? new class665(arg1, 34037, arg4, arg2, arg3) : new class665(arg1, arg4, arg2, arg3, class206.method1334(-1, arg2), class206.method1334(-1, arg3));
        } else {
            return new class665(arg1, 3553, arg4, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(FI[FFFIIIIIF)V")
    public abstract void method3159(float arg0, int arg1, float[] arg2, float arg3, float arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float arg10);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLhw;)I")
    public static final int method3341(byte arg0, class115 arg1) {
        field8261++;
        if (class262.field3553 == arg1) {
            return 5890;
        } else if (class227.field3159 == arg1) {
            return 34167;
        } else if (class78.field1179 == arg1) {
            return 34168;
        } else if (class452.field6221 == arg1) {
            return 34166;
        } else {
            int var2 = -65 % ((92 - arg0) / 33);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Z")
    public static final boolean method3342(int arg0, int arg1) {
        int var2 = 110 % ((arg0 + 32) / 60);
        field8263++;
        return (-arg1 & arg1) == arg1;
    }
}
