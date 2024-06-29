import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class281 extends class203 {

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    private final int field4938;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    private final int field4934;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    private final int field4942;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    private final int field4932;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field4939 = 0;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "Llc;")
    public static class143 field4941 = class66.method374("Lade Sprites )2 ", -1);

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Llc;")
    public static class143 field4935 = class66.method374(" s(West connect-B)3", -1);

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "Lvh;")
    public static class43 field4937 = null;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BII)V")
    public final void method500(byte arg0, int arg1, int arg2) {
        ++field4933;
        int var4 = this.field4932 * arg2 >> 12;
        int var5 = this.field4942 * arg2 >> 12;
        int var6 = this.field4938 * arg1 >> 12;
        int var7 = this.field4934 * arg1 >> 12;
        int var8 = -101 % ((arg0 - -14) / 59);
        class211.method1472(var7, var4, super.field3696, -24335, var6, var5);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)I")
    public static final int method1845(int arg0, byte arg1) {
        int var2 = arg0 * 6 - 61440;
        int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var4 = 40960 - -(arg0 * var2 >> 12);
        if (arg1 != -72) {
            field4941 = null;
        }
        ++field4931;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
    public static final void method1846(boolean arg0, int arg1) {
        ++field4936;
        if (class50.field993 != arg0) {
            class50.field993 = arg0;
            if (arg1 == 23757) {
                class39.method254(arg1 + -23630);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)V")
    public final void method498(int arg0, int arg1, int arg2) {
        ++field4940;
        int var4 = this.field4932 * arg1 >> 12;
        int var5 = this.field4938 * arg2 >> 12;
        if (arg0 != -13349) {
            field4939 = 122;
        }
        int var6 = this.field4934 * arg2 >> 12;
        int var7 = this.field4942 * arg1 >> 12;
        class184.method1202(super.field3696, var5, var4, var6, super.field3686, var7, 88, super.field3688);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBI)V")
    public final void method497(int arg0, byte arg1, int arg2) {
        ++field4943;
        if (arg1 > -17) {
            method1845(73, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
    public static void method1847(byte arg0) {
        field4941 = null;
        field4935 = null;
        if (arg0 < 106) {
            field4935 = null;
        }
        field4937 = null;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIII)V")
    public class281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4938 = arg1;
        this.field4934 = arg3;
        this.field4942 = arg0;
        this.field4932 = arg2;
    }
}
