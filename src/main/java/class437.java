import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class437 extends class60 {

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    public static int field5757 = 0;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public static int field5755 = 0;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "[I")
    public static int[] field5749;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)I")
    public final int method406(int arg0, int arg1) {
        ++field5750;
        return ~super.field798.method4288(arg0 ^ arg0).method1438(false) > -97 ? 3 : 1;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2577(String[] arg0, int arg1) {
        ++field5754;
        String[] var2 = new String[arg1];
        for (int var3 = 0; ~var3 > -6; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(ILhd;)V")
    public class437(int arg0, class773 arg1) {
        super(arg0, arg1);
        class260.method1564(-122, super.field799);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZI)I")
    public static final int method2578(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return -89;
        } else {
            ++field5759;
            int var3 = class13.method192(arg2 + -1, arg0 + -1, -114) + (class13.method192(arg2 + -1, arg0 + 1, -50) - -class13.method192(arg2 + 1, arg0 + -1, -90)) + class13.method192(arg2 + 1, arg0 + 1, -101);
            int var4 = class13.method192(arg2, arg0 + -1, -127) + class13.method192(arg2, arg0 + 1, -127) + class13.method192(arg2 + -1, arg0, -70) + class13.method192(arg2 + 1, arg0, -110);
            int var5 = class13.method192(arg2, arg0, -125);
            return var3 / 16 - -(var4 / 8) - -(var5 / 4);
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V")
    public final void method409(byte arg0) {
        if (arg0 > -27) {
            method2577((String[]) null, -29);
        }
        if (super.field798.method4288(0).method1438(false) < 96) {
            super.field799 = 0;
        }
        ++field5758;
        if (~super.field799 > -1 || ~super.field799 < -3) {
            super.field799 = this.method405(false);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)I")
    public final int method2579(int arg0) {
        ++field5752;
        if (arg0 != 0) {
            field5749 = null;
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)V")
    public final void method407(byte arg0, int arg1) {
        super.field799 = arg1;
        ++field5753;
        int var3 = 71 / ((arg0 - 28) / 50);
        class260.method1564(-119, super.field799);
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
    public static void method2580(int arg0) {
        if (arg0 == -1) {
            field5749 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)I")
    public final int method405(boolean arg0) {
        ++field5751;
        return ~super.field798.method4288(0).method1438(arg0) > -97 ? 0 : 2;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)Z")
    public final boolean method2581(byte arg0) {
        ++field5756;
        if (super.field798.method4288(0).method1438(false) < 96) {
            return false;
        } else {
            return arg0 <= -61;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lhd;)V")
    public class437(class773 arg0) {
        super(arg0);
        class260.method1564(-91, super.field799);
    }
}
