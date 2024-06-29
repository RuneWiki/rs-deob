import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class580 {

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "I")
    public int field8146 = 128;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
    public int field8150 = 128;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
    public int field8143;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
    public int field8141;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "I")
    public int field8145;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
    public int field8144;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "[I")
    public static int[] field8142 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "I")
    public static int field8151 = 0;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "Lld;")
    public static class127 field8147 = new class127(2);

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "[C")
    public static char[] field8154 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "Lbt;")
    public static class519 field8153 = new class519();

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V", line = 4)
    public static void method3399(int arg0) {
        field8154 = null;
        field8153 = null;
        field8142 = null;
        if (arg0 >= -11) {
            field8147 = null;
        }
        field8147 = null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILkga;)V", line = 19)
    public final void method3400(int arg0, class580 arg1) {
        this.field8144 = arg1.field8144;
        this.field8146 = arg1.field8146;
        field8152++;
        if (arg0 > -91) {
            this.field8150 = 60;
        }
        this.field8143 = arg1.field8143;
        this.field8150 = arg1.field8150;
        this.field8145 = arg1.field8145;
        this.field8141 = arg1.field8141;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZBILae;IILlp;)V", line = 38)
    public static final void method3401(boolean arg0, byte arg1, int arg2, class283 arg3, int arg4, int arg5, class82 arg6) {
        field8148++;
        class707.method3988(arg4, (byte) -98, arg2, arg5, arg0, arg3);
        class574.field8079 = arg6;
        int var7 = 123 / ((arg1 + 33) / 49);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)Lkga;", line = 56)
    public final class580 method3402(int arg0) {
        field8149++;
        int var2 = -85 / ((-arg0 - 70) / 54);
        return new class580(this.field8143, this.field8146, this.field8150, this.field8145, this.field8141, this.field8144);
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(I)V", line = 74)
    public class580(int arg0) {
        this.field8143 = arg0;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(IIIIII)V", line = 81)
    private class580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8141 = arg4;
        this.field8146 = arg1;
        this.field8145 = arg3;
        this.field8144 = arg5;
        this.field8143 = arg0;
        this.field8150 = arg2;
    }
}
