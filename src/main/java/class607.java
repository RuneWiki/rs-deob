import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class607 extends class249 {

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    private int field8245;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    private int field8247;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    private int field8246;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    private int field8243;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "Ljw;")
    public static class581 field8244 = new class581(100, 1);

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public static int field8248 = -1;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(IIIIII)V")
    public class607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field8245 = arg1;
        this.field8247 = arg2;
        this.field8246 = arg0;
        this.field8243 = arg3;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
    public static void method3361(int arg0) {
        field8244 = null;
        if (arg0 > -58) {
            method3361(-97);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)V")
    public final void method844(int arg0, int arg1, int arg2) {
        if (arg2 != -7895) {
            field8244 = null;
        }
        ++field8250;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(BII)V")
    public final void method845(byte arg0, int arg1, int arg2) {
        if (arg0 == 85) {
            ++field8251;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BII)V")
    public final void method843(byte arg0, int arg1, int arg2) {
        ++field8249;
        int var4 = this.field8246 * arg2 >> 12;
        if (arg0 != 101) {
            method3361(91);
        }
        int var5 = this.field8247 * arg2 >> 12;
        int var6 = this.field8245 * arg1 >> 12;
        int var7 = this.field8243 * arg1 >> 12;
        class214.method1415(arg0 + -31, var7, var5, var6, var4, super.field3689);
    }
}
