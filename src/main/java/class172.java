import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class172 extends class150 {

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    private int field2826;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    private int field2822;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    private int field2824;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    private int field2825;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field2820 = 0;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Z")
    public static boolean field2828 = true;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field2832 = 0;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBI)V")
    public final void method220(int arg0, byte arg1, int arg2) {
        int var4 = -127 % ((39 - arg1) / 62);
        ++field2821;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIII)V")
    public class172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2826 = arg2;
        this.field2822 = arg0;
        this.field2824 = arg3;
        this.field2825 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
    public final void method218(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method221((byte) -19, 88, 84);
        }
        ++field2827;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BII)V")
    public final void method221(byte arg0, int arg1, int arg2) {
        ++field2829;
        int var4 = this.field2822 * arg2 >> 12;
        int var5 = this.field2826 * arg2 >> 12;
        int var6 = 104 % ((arg0 - 7) / 63);
        int var7 = this.field2825 * arg1 >> 12;
        int var8 = this.field2824 * arg1 >> 12;
        class157.method1081(var5, var7, super.field2518, var4, 1686341260, var8);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)I")
    public static final int method1154(byte arg0) {
        if (arg0 != -23) {
            method1154((byte) -59);
        }
        ++field2830;
        return 15;
    }
}
