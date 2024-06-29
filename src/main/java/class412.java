import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class412 implements class300 {

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lfp;")
    private class323 field5813;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lfp;)V", line = 7)
    public class412(class323 arg0) {
        this.field5813 = arg0;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Ldn;", line = 16)
    public final class516 method149(int arg0) {
        int var2 = -58 % ((-arg0 - 19) / 60);
        field5814++;
        return class516.field7351;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIB)Luu;", line = 28)
    public static final class285 method2535(int arg0, int arg1, byte arg2) {
        field5812++;
        class285 var3 = new class285();
        var3.field4041 = -1;
        var3.field4044 = arg1 + 6;
        var3.field4046 = -1;
        var3.field4051 = arg0 + 1 + 5;
        var3.field4035 = new int[var3.field4051][var3.field4044];
        if (arg2 < 64) {
            return null;
        } else {
            var3.method1871((byte) 93);
            return var3;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V", line = 47)
    public static final void method2536(int arg0) {
        class600.field8425.method4023((byte) -15);
        field5815++;
        int var1 = 30 / ((arg0 + 56) / 44);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)I", line = 57)
    public final int method146(int arg0) {
        field5811++;
        if (arg0 == 6340) {
            return this.field5813.method2086(arg0 ^ 0xFFFFFB44) ? 100 : this.field5813.method2082(0);
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lr;III[Z)V", line = 72)
    public static final void method2537(class180 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class459.field6474 == class135.field1969) {
            return;
        }
        int var5 = class588.field8292[arg1].method1815(arg3, arg2, -126);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class278 var7 = class588.field8292[var6];
                if (var7 != null) {
                    var7.method1810(arg0, arg2, var5 - var7.method1815(arg3, arg2, -126), arg3, 0, false);
                }
            }
        }
    }
}
