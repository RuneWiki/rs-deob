import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class317 extends class673 {

    @OriginalMember(owner = "client!ow", name = "o", descriptor = "I")
    private int field4191;

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
    private int field4187;

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
    private int field4189;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "I")
    private int field4188;

    @OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ow", name = "p", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!ow", name = "q", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!ow", name = "r", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!ow", name = "s", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIB)V", line = 5)
    public final void method695(int arg0, int arg1, byte arg2) {
        ++field4192;
        if (arg2 != 48) {
            this.field4187 = 96;
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)V", line = 16)
    public static final void method1849(int arg0) {
        if (class600.field8656 != null) {
            class600.field8656.method1485(arg0 + 1);
        }
        if (arg0 == -1) {
            ++field4194;
            if (class247.field3389 != null) {
                class247.field3389.method1485(0);
            }
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIZ)V", line = 33)
    public final void method693(int arg0, int arg1, boolean arg2) {
        ++field4193;
        if (!arg2) {
            this.method695(22, -82, (byte) 100);
        }
        int var4 = this.field4187 * arg0 >> 12;
        int var5 = this.field4189 * arg0 >> 12;
        int var6 = this.field4191 * arg1 >> 12;
        int var7 = this.field4188 * arg1 >> 12;
        class621.method3554(super.field9672, var5, var4, 47, var6, var7);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(FIFLwfa;FIFII[BZIF)V", line = 52)
    public static final void method1850(float arg0, int arg1, float arg2, class181 arg3, float arg4, int arg5, float arg6, int arg7, int arg8, byte[] arg9, boolean arg10, int arg11, float arg12) {
        ++field4190;
        for (int var13 = 0; ~var13 > ~arg11; ++var13) {
            class505.method2925(arg12, arg4, arg1, true, arg7, arg6, arg11, arg3, arg5, arg0, arg8, arg9, var13, arg2);
            arg8 += arg1 * arg5;
        }
        if (!arg10) {
            method1850(-2.6283438F, -79, 1.1807253F, (class181) null, -1.3731846F, 38, -0.011838942F, -61, -66, (byte[]) null, false, -125, 0.40645787F);
        }
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(IIIIII)V", line = 72)
    public class317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4191 = arg1;
        this.field4187 = arg0;
        this.field4189 = arg2;
        this.field4188 = arg3;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(III)V", line = 85)
    public final void method694(int arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            this.field4187 = -35;
        }
        ++field4195;
    }
}
