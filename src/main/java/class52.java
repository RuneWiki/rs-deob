import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class52 extends class69 {

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    private int field725;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    private int field740;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    private int field729;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    private int field736;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[I")
    public static int[] field727 = new int[128];

    @OriginalMember(owner = "client!b", name = "u", descriptor = "[I")
    public static int[] field735 = new int[25];

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public static int field742 = 0;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field732 = 0;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Z")
    public final boolean method404(int arg0, int arg1, int arg2) {
        field730++;
        if (arg2 >= -100) {
            field742 = 104;
        }
        return arg1 >= this.field728 && this.field731 >= arg1 && this.field733 <= arg0 && arg0 <= this.field741;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(III)Z")
    public final boolean method405(int arg0, int arg1, int arg2) {
        field734++;
        if (arg2 != 20513) {
            this.method405(69, 63, -92);
        }
        return arg1 >= this.field725 && this.field736 >= arg1 && this.field729 <= arg0 && this.field740 >= arg0;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(III)[I")
    public final int[] method406(int arg0, int arg1, int arg2) {
        field726++;
        return arg2 == -1 ? new int[] { this.field744, this.field728 + arg0 - this.field725, this.field733 - this.field729 + arg1 } : null;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
    public static void method407(int arg0) {
        field735 = null;
        field727 = null;
        if (arg0 != 4301) {
            method409(false, 19, 91);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIB)Z")
    public final boolean method408(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -43) {
            method407(-117);
        }
        field737++;
        return this.field743 == arg2 && this.field725 <= arg0 && this.field736 >= arg0 && arg1 >= this.field729 && this.field740 >= arg1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method409(boolean arg0, int arg1, int arg2) {
        field739++;
        if (arg1 != 10) {
            method409(false, -12, 112);
        }
        return arg0 && arg2 >= 0 ? class273.method1843(arg0, arg2, 10, arg1 ^ 0xFFFFFF8F) : Integer.toString(arg2);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field725 = arg2;
        this.field733 = arg7;
        this.field744 = arg1;
        this.field740 = arg5;
        this.field728 = arg6;
        this.field731 = arg8;
        this.field741 = arg9;
        this.field729 = arg3;
        this.field743 = arg0;
        this.field736 = arg4;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(III)[I")
    public final int[] method410(int arg0, int arg1, int arg2) {
        field738++;
        return arg0 > -78 ? null : new int[] { this.field743, arg2 - (this.field728 - this.field725), this.field729 + arg1 + -this.field733 };
    }
}
