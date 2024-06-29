import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class334 {

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "J")
    private long field4626;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    private int field4624;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Llu;")
    public static class610 field4620 = new class610(30, -1);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)I", line = 3)
    public final int method2033(int arg0) {
        if (arg0 != 0) {
            field4628 = -91;
        }
        field4621++;
        return this.field4624;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(JJ)J", line = 17)
    public static long method2034(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V", line = 26)
    public static void method2035(int arg0) {
        field4620 = null;
        int var1 = -27 % ((arg0 - 48) / 41);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lkda;B)I", line = 36)
    public static final int method2036(class328 arg0, byte arg1) {
        field4623++;
        int var2 = 0;
        if (arg0.method1981(true, class507.field7166)) {
            var2++;
        }
        if (arg1 != 50) {
            field4620 = null;
        }
        if (arg0.method1981(true, class87.field1313)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILqr;)V", line = 60)
    private final void method2037(int arg0, class58 arg1) {
        if (arg0 != -1) {
            this.field4626 = 93L;
        }
        field4622++;
        this.field4626 |= (arg1.field722 << class58.field735 * this.field4624++);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Lqr;", line = 72)
    public final class58 method2038(int arg0, int arg1) {
        if (arg1 <= 43) {
            this.method2037(-46, null);
        }
        field4627++;
        return class58.method386(-3034)[this.method2039(arg0, 125)];
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)I", line = 83)
    private final int method2039(int arg0, int arg1) {
        field4625++;
        return arg1 < 113 ? -118 : (int) (this.field4626 >> class58.field735 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lqr;)V", line = 93)
    public class334(class58 arg0) {
        this.field4626 = arg0.field722;
        this.field4624 = 1;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "([Lqr;)V", line = 105)
    public class334(class58[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2037(-1, arg0[var2]);
        }
    }
}
