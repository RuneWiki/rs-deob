import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class514 extends class331 {

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lus;")
    public static class328 field7239 = new class328(78, 2);

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "[I")
    public static int[] field7248 = new int[8];

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7247 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Lkha;")
    public static class687 field7245;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            return 28;
        } else {
            ++field7242;
            return 0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)Z")
    public final boolean method2952(byte arg0) {
        ++field7246;
        if (arg0 <= 103) {
            return true;
        } else {
            int var2 = super.field4203.method343((byte) 124).method357(-1);
            return var2 >= 96;
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)I")
    public final int method2953(byte arg0) {
        if (arg0 > -119) {
            return -126;
        } else {
            ++field7241;
            return super.field4202;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        ++field7244;
        int var2 = super.field4203.method343((byte) 124).method357(-1);
        if (~var2 > -97) {
            super.field4202 = 0;
        }
        if (arg0 != -1959) {
            this.method224(-91);
        }
        if (~super.field4202 < -2 && var2 < 128) {
            super.field4202 = 1;
        }
        if (super.field4202 > 2 && var2 < 192) {
            super.field4202 = 2;
        }
        if (~super.field4202 > -1 || ~super.field4202 < -4) {
            super.field4202 = this.method226((byte) 13);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        ++field7243;
        int var3 = super.field4203.method343((byte) 126).method357(-1);
        if (var3 < 96) {
            return 3;
        } else if (arg1 < arg0 && ~var3 > -129) {
            return 3;
        } else {
            return arg0 > 3 && var3 < 192 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lts;)V")
    public class514(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        super.field4202 = arg1;
        if (arg0 <= 113) {
            this.method222(12, -104);
        }
        ++field7240;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(ILts;)V")
    public class514(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static void method2954(int arg0) {
        if (arg0 != 78) {
            method2954(-55);
        }
        field7239 = null;
        field7248 = null;
        field7245 = null;
        field7247 = null;
    }
}
