import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class657 extends class502 {

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field9094 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "Lvl;")
    public static class15 field9098 = new class15(28, 4);

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "I")
    public static int field9100 = -1;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "[[Z")
    public static boolean[][] field9097;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field9092;
        if (super.field6863.method2830((byte) 113)) {
            return 3;
        } else {
            return arg1 == super.field6863.field6743.method3385((byte) 120) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        if (super.field6863.method2830((byte) 125)) {
            super.field6865 = 0;
        }
        ++field9099;
        if (~super.field6863.field6743.method3385((byte) 50) == -1) {
            super.field6865 = 0;
        }
        if (~super.field6865 > -1 || super.field6865 > 2) {
            super.field6865 = this.method55(-2);
        }
        if (!arg0) {
            field9097 = null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)Z")
    public final boolean method3692(int arg0) {
        ++field9096;
        if (arg0 != 0) {
            this.method58(true);
        }
        if (super.field6863.method2830((byte) 117)) {
            return false;
        } else {
            return ~super.field6863.field6743.method3385((byte) 59) != -1;
        }
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V")
    public static void method3693(int arg0) {
        field9094 = null;
        field9097 = null;
        if (arg0 > -95) {
            method3693(107);
        }
        field9098 = null;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IZ)V")
    public static final void method3694(int arg0, boolean arg1) {
        ++field9102;
        if (~arg0 != 0) {
            if (!arg1) {
                field9101 = 73;
            }
            if (class157.field2548[arg0]) {
                class724.field9956.method3731(arg0, 67);
                class431.field5870[arg0] = null;
                class79.field1113[arg0] = null;
                class157.field2548[arg0] = false;
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Leka;)V")
    public class657(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(B)I")
    public final int method3695(byte arg0) {
        if (arg0 <= 49) {
            this.method57(0, 105);
        }
        ++field9103;
        return super.field6865;
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(ILeka;)V")
    public class657(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method57(-61, 16);
        }
        ++field9095;
        super.field6865 = arg0;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)I")
    public final int method55(int arg0) {
        ++field9093;
        if (arg0 != -2) {
            this.method3692(40);
        }
        return 2;
    }
}
