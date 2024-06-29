import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class283 extends class297 {

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "J")
    public long field4801;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lma;")
    public static class5 field4800 = class12.method119("", (byte) 101);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field4796 = 0;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lpd;")
    public static class100 field4799;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[I")
    public static int[] field4803;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILni;)Lae;", line = 22)
    public static final class97 method1917(int arg0, int arg1, class202 arg2) {
        if (arg0 <= 63) {
            method1917(77, -13, (class202) null);
        }
        field4795++;
        byte[] var3 = arg2.method1329(arg1, 1);
        return var3 == null ? null : new class97(var3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)V", line = 40)
    public static final void method1918(int arg0, int arg1, boolean arg2) {
        field4802++;
        long var3 = (long) ((arg1 << 16) + arg0);
        class136 var5 = (class136) class282.field4780.method1372(arg2, var3);
        if (var5 != null) {
            class216.field3414.method788(79, var5);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V", line = 56)
    public static void method1919(byte arg0) {
        field4800 = null;
        if (arg0 != 114) {
            method1918(-61, 6, false);
        }
        field4799 = null;
        field4803 = null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 79)
    public class283() {
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(J)V", line = 84)
    public class283(long arg0) {
        this.field4801 = arg0;
    }
}
