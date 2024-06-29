import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class47 extends class154 {

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    private int field656;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    private int field645;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;ILlh;)I")
    public static final int method291(String arg0, int arg1, class365 arg2) {
        ++field652;
        int var3 = arg2.field5069;
        byte[] var4 = class352.method1946(arg0, (byte) 123);
        arg2.method2114(arg1 + 122, var4.length);
        arg2.field5069 += class245.field3415.method2200(arg2.field5069, var4, var4.length, arg2.field5073, arg1, arg1 + 115);
        return arg2.field5069 - var3;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIIII)V")
    public class47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field654 = arg3;
        this.field656 = arg1;
        this.field645 = arg0;
        this.field647 = arg2;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IBI)V")
    public static final void method292(int arg0, byte arg1, int arg2) {
        ++field651;
        int var3 = 53 % ((69 - arg1) / 33);
        class163 var4 = class271.method1546(arg2, 5, true);
        var4.method1017(0);
        var4.field2328 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)I")
    public static final int method293(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 3;
        ++field650;
        if (var4 == 0) {
            return arg1;
        } else if (arg3 == var4) {
            return arg2;
        } else {
            return ~var4 == -3 ? 1023 - arg1 : -arg2 + 1023;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBI)V")
    public final void method294(int arg0, byte arg1, int arg2) {
        ++field655;
        if (arg1 != 21) {
            method291((String) null, 109, (class365) null);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
    public final void method295(int arg0, int arg1, int arg2) {
        ++field646;
        if (arg2 == 14619) {
            int var4 = this.field645 * arg1 >> 12;
            int var5 = this.field647 * arg1 >> 12;
            int var6 = this.field656 * arg0 >> 12;
            int var7 = this.field654 * arg0 >> 12;
            class393.method2248(var6, var4, super.field2213, 101, super.field2214, var7, super.field2212, var5);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)V")
    public final void method296(int arg0, int arg1, int arg2) {
        ++field648;
        int var4 = this.field645 * arg0 >> 12;
        int var5 = this.field647 * arg0 >> 12;
        int var6 = this.field656 * arg2 >> 12;
        if (arg1 <= -29) {
            int var7 = this.field654 * arg2 >> 12;
            class17.method137(var5, var6, var4, super.field2213, 58, var7);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
    public static final void method297(long[] arg0, int arg1, Object[] arg2) {
        ++field653;
        class29.method202(arg0, 0, arg2, (byte) -107, arg0.length + -1);
        if (arg1 < 118) {
            field644 = -33;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method298(boolean arg0, String arg1) {
        ++field649;
        if (arg0) {
            method293(-64, 7, 85, -87);
        }
        return class506.method2976(true, arg1, 10, 0);
    }
}
