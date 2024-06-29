import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class388 extends class430 {

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "Lgr;")
    public static class530 field5600 = new class530(37, 3);

    @OriginalMember(owner = "client!wfa", name = "p", descriptor = "I")
    public static int field5605 = 0;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!wfa", name = "o", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!wfa", name = "q", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!wfa", name = "m", descriptor = "J")
    public long field5602;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "Lwfa;")
    public class388 field5596;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "Lwfa;")
    public class388 field5597;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(Z)V", line = 6)
    public static final void method2380(boolean arg0) {
        int var1 = 0;
        if (!arg0) {
            return;
        }
        while (var1 < class680.field9653.length) {
            for (int var2 = 0; var2 < class680.field9653[var1].length; var2++) {
                class680.field9653[var1][var2] = class567.field8197;
            }
            var1++;
        }
        field5603++;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V", line = 36)
    public final void method2381(int arg0) {
        if (arg0 != 15735) {
            field5606 = -119;
        }
        field5599++;
        if (this.field5597 != null) {
            this.field5597.field5596 = this.field5596;
            this.field5596.field5597 = this.field5597;
            this.field5597 = null;
            this.field5596 = null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V", line = 54)
    public static void method2382(int arg0) {
        field5600 = null;
        if (arg0 < 65) {
            field5605 = -10;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZILla;)Lqba;", line = 65)
    public static final class102 method2383(boolean arg0, int arg1, class423 arg2) {
        field5604++;
        byte[] var3 = arg2.method2611((byte) -123, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (arg0) {
                field5600 = null;
            }
            return new class102(var3);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)Lhf;", line = 85)
    public static final class644 method2384(int arg0, int arg1, int arg2) {
        class375 var3 = class565.field8185[arg0][arg1][arg2];
        return var3 == null || var3.field5422 == null ? null : var3.field5422;
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)Z", line = 98)
    public final boolean method2385(byte arg0) {
        field5598++;
        if (this.field5597 == null) {
            return false;
        } else {
            int var2 = -22 / ((-arg0 - 35) / 42);
            return true;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZI)I", line = 111)
    public static final int method2386(boolean arg0, int arg1) {
        if (arg0) {
            field5601++;
            return arg1 >>> 10;
        } else {
            return -123;
        }
    }
}
