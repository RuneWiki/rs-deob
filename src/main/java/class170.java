import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class170 {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Z")
    public static boolean field2683 = false;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field2680 = -1;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field2687 = -1;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
    public static int[] field2686 = new int[14];

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lsf;")
    public static class139 field2684;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Lki;")
    public class170 field2690;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Lki;")
    public class170 field2693;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "[[[Lqo;")
    public static class329[][][] field2689;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 11)
    public final void method1340(int arg0) {
        field2688++;
        if (this.field2690 == null) {
            return;
        }
        this.field2690.field2693 = this.field2693;
        this.field2693.field2690 = this.field2690;
        this.field2693 = null;
        if (arg0 > 31) {
            this.field2690 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lrg;I)V", line = 32)
    public static final void method1341(class342 arg0, int arg1) {
        field2691++;
        class342 var2 = class244.method1837(arg0, (byte) -119);
        if (arg1 != -13214) {
            return;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class362.field5740;
            var4 = class126.field2113;
        } else {
            var3 = var2.field5339;
            var4 = var2.field5374;
        }
        class287.method2075(-27006, var3, arg0, false, var4);
        class146.method1223(var4, true, arg0, var3);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lrg;B)Z", line = 62)
    public static final boolean method1342(class342 arg0, byte arg1) {
        field2682++;
        if (arg0.field5442 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 < 123) {
            return true;
        }
        while (var2 < arg0.field5442.length) {
            int var3 = class210.method1558(-17249, arg0, var2);
            int var4 = arg0.field5269[var2];
            if (arg0.field5442[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field5442[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field5442[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 140)
    public static void method1343(byte arg0) {
        field2686 = null;
        field2689 = (class329[][][]) null;
        if (arg0 <= -51) {
            field2684 = null;
        }
    }
}
