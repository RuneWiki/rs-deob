import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class401 extends class392 {

    @OriginalMember(owner = "client!jba", name = "w", descriptor = "[[S")
    public short[][] field5670;

    @OriginalMember(owner = "client!jba", name = "A", descriptor = "D")
    public double field5674;

    @OriginalMember(owner = "client!jba", name = "v", descriptor = "I")
    public static int field5669 = -1;

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "Lea;")
    public static class547 field5673 = new class547(36, 3);

    @OriginalMember(owner = "client!jba", name = "E", descriptor = "Loq;")
    public static class362 field5677 = new class362();

    @OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!jba", name = "B", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!jba", name = "D", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)J", line = 6)
    public final long method2319(int arg0) {
        if (arg0 == 2) {
            field5671++;
            return (long) (this.field5670[0].length | this.field5670.length << 0);
        } else {
            return -37L;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)V", line = 21)
    public static final void method2320(int arg0, int arg1) {
        field5676++;
        if (!class382.method2244(arg0, 11) || arg1 != -12889) {
            return;
        }
        class218[] var2 = class357.field4742[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class218 var4 = var2[var3];
            if (var4 != null) {
                var4.field2772 = 0;
                var4.field2782 = 0;
                var4.field2753 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZB)I", line = 64)
    public static final int method2321(boolean arg0, byte arg1) {
        field5675++;
        if (class427.field6031 == null) {
            return 0;
        } else if (arg0 || class583.field8166 == null) {
            int var2 = 0;
            for (int var3 = 0; var3 < class427.field6031.length; var3++) {
                int var4 = class427.field6031[var3];
                if (class421.field5901.method2882(arg1 - 161, var4)) {
                    var2++;
                }
                if (class473.field6550.method2882(arg1 ^ 0xFFFFFFB2, var4)) {
                    var2++;
                }
            }
            if (arg1 != 90) {
                field5669 = 34;
            }
            return var2;
        } else {
            return class427.field6031.length * 2;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(BC)Z", line = 102)
    public static final boolean method2322(byte arg0, char arg1) {
        field5672++;
        if (arg0 < 117) {
            method2323(false);
        }
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "([[SD)V", line = 113)
    public class401(short[][] arg0, double arg1) {
        this.field5670 = arg0;
        this.field5674 = arg1;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)V", line = 123)
    public static void method2323(boolean arg0) {
        if (!arg0) {
            field5669 = 72;
        }
        field5677 = null;
        field5673 = null;
    }
}
