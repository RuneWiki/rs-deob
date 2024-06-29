import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class19 extends class123 {

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public int field354 = 0;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public static int field352 = 0;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "Lgd;")
    public static class325 field359 = new class325(5);

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "Lnk;")
    public static class14 field357;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILaj;)V", line = 6)
    public final void method201(int arg0, class1 arg1) {
        field356++;
        if (arg0 != 0) {
            this.field354 = -72;
        }
        while (true) {
            int var3 = arg1.method15((byte) 80);
            if (var3 == 0) {
                return;
            }
            this.method205(var3, arg1, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V", line = 27)
    public static void method202(int arg0) {
        field359 = null;
        if (arg0 != 0) {
            method202(98);
        }
        field357 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Lcc;", line = 46)
    public static final class264 method203(int arg0, int arg1) {
        field358++;
        int var2 = 115 / ((51 - arg1) / 59);
        class264 var3 = (class264) class225.field3481.method2288((long) arg0, (byte) 88);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class39.field597.method967(30, arg0, 65280);
        class264 var5 = new class264();
        if (var4 != null) {
            var5.method1825(new class1(var4), arg0, (byte) -101);
        }
        class225.field3481.method2281(0, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z[B)[B", line = 73)
    public static final byte[] method204(boolean arg0, byte[] arg1) {
        field351++;
        int var2 = arg1.length;
        if (arg0) {
            byte[] var3 = new byte[var2];
            class330.method2315(arg1, 0, var3, 0, var2);
            return var3;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILaj;B)V", line = 103)
    private final void method205(int arg0, class1 arg1, byte arg2) {
        field353++;
        if (arg2 <= 103) {
            field359 = (class325) null;
        }
        if (arg0 == 2) {
            this.field354 = arg1.method56(19612);
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V", line = 123)
    public static final void method206(int arg0) {
        field355++;
        if (arg0 != 12962) {
            field359 = (class325) null;
        }
        class30.field478 = null;
        class204.field3172 = null;
        class14.field301 = null;
        class243.field3642 = null;
    }
}
