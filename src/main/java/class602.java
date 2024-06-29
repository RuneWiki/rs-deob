import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class602 extends class649 {

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "[Z")
    public static boolean[] field8518 = new boolean[8];

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field8515 = new Hashtable();

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "D")
    public static double field8517;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Lla;")
    public static class422 field8511;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "Lvh;")
    public static class626 field8522;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        ++field8514;
        if (arg0 != 18648) {
            method3455(-117, false);
        }
        return 1;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        ++field8516;
        if (arg0 == 1) {
            if (~super.field9223 != -2 && super.field9223 != 0) {
                super.field9223 = this.method135(arg0 + -82);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public static final void method3452(boolean arg0) {
        ++field8520;
        if (~class714.field10032 == -6) {
            if (!arg0) {
                class714.field10032 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I")
    public final int method3453(int arg0) {
        if (arg0 != 3) {
            return -120;
        } else {
            ++field8513;
            return super.field9223;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)V")
    public static void method3454(boolean arg0) {
        field8518 = null;
        field8511 = null;
        field8515 = null;
        field8522 = null;
        if (!arg0) {
            field8522 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lhs;)V")
    public class602(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IZ)I")
    public static final int method3455(int arg0, boolean arg1) {
        ++field8521;
        if (arg1) {
            return -35;
        } else {
            int var2 = arg0 >>> 1;
            int var3 = var2 | var2 >>> 1;
            int var4 = var3 | var3 >>> 2;
            int var5 = var4 | var4 >>> 4;
            int var6 = var5 | var5 >>> 8;
            int var7 = var6 | var6 >>> 16;
            return arg0 & ~var7;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        ++field8510;
        if (arg1 > -120) {
            this.method135(-68);
        }
        super.field9223 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(ILhs;)V")
    public class602(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        int var2 = 11 / ((arg0 - -18) / 50);
        ++field8519;
        return 1;
    }
}
