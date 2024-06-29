import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class214 extends class405 {

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    private int field3132;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    private int field3129;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    private int field3130;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    private int field3123;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    private int field3131;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    private int field3124;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    private int field3126;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    private int field3128;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)V", line = 9)
    public final void method1403(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            this.field3129 = -37;
        }
        ++field3122;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)V", line = 19)
    public final void method1404(int arg0, byte arg1, int arg2) {
        ++field3127;
        if (arg1 != -72) {
            field3121 = 80;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 29)
    public class214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3132 = arg2;
        this.field3129 = arg1;
        this.field3130 = arg3;
        this.field3123 = arg6;
        this.field3131 = arg5;
        this.field3124 = arg4;
        this.field3126 = arg7;
        this.field3128 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 50)
    public final void method1405(int arg0, int arg1, int arg2) {
        ++field3133;
        int var4 = this.field3128 * arg2 >> 12;
        int var5 = this.field3129 * arg1 >> 12;
        int var6 = -74 % ((arg0 - -71) / 53);
        int var7 = this.field3132 * arg2 >> 12;
        int var8 = this.field3130 * arg1 >> 12;
        int var9 = this.field3124 * arg2 >> 12;
        int var10 = this.field3131 * arg1 >> 12;
        int var11 = this.field3123 * arg2 >> 12;
        int var12 = this.field3126 * arg1 >> 12;
        class418.method2427(var10, 7000, var12, var8, var7, var4, var11, var9, var5, super.field5641);
    }
}
