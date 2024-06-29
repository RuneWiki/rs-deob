import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class21 extends class443 {

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "Liu;")
    public static class517 field303 = new class517(66, 0);

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "F")
    public static float field305;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "I")
    public int field308;

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "Ljava/lang/String;")
    public String field299;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)I")
    public final int method224(int arg0) {
        if (arg0 < 38) {
            return 88;
        } else {
            ++field309;
            return (int) (super.field1798 >>> 32 & 255L);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILjj;IIII)Log;")
    public static final class98 method225(int arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field306;
        if (arg0 != 34037) {
            field305 = -0.27187365F;
        }
        if (!arg1.field1164 && (!class32.method294(arg2, false) || !class32.method294(arg4, false))) {
            return arg1.field1158 ? new class98(arg1, 34037, arg3, arg5, arg2, arg4, true) : new class98(arg1, arg3, arg5, arg2, arg4, class243.method1546(-26367, arg2), class243.method1546(-26367, arg4), true);
        } else {
            return new class98(arg1, 3553, arg3, arg5, arg2, arg4, true);
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
    public static void method226(int arg0) {
        if (arg0 == 66) {
            field303 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(Z)V")
    public final void method227(boolean arg0) {
        if (!arg0) {
            method226(-50);
        }
        super.field6471 = class508.method2860(false) + 500L | super.field6471 & Long.MIN_VALUE;
        ++field307;
        class471.field6776.method477(this, false);
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(Z)I")
    public final int method228(boolean arg0) {
        ++field301;
        return arg0 ? 26 : (int) super.field1798;
    }

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "(I)J")
    public final long method229(int arg0) {
        ++field310;
        if (arg0 != 17173856) {
            this.field308 = 106;
        }
        return Long.MAX_VALUE & super.field6471;
    }

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)V")
    public final void method230(int arg0) {
        ++field300;
        if (arg0 != 18340) {
            this.method230(-114);
        }
        super.field6471 |= Long.MIN_VALUE;
        if (this.method229(arg0 + 17155516) == 0L) {
            class74.field1380.method477(this, false);
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(II)V")
    public class21(int arg0, int arg1) {
        super.field1798 = (long) arg1 | (long) arg0 << 32;
    }
}
