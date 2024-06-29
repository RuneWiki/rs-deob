import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class197 extends class503 {

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    private int field3292;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    private int field3286;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    private int field3293;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    private int field3282;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3287 = 0;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field3291 = 0;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "[I")
    public static int[] field3285;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IBI)V", line = 4)
    public final void method748(int arg0, byte arg1, int arg2) {
        ++field3284;
        int var4 = this.field3292 * arg0 >> 12;
        if (arg1 != 25) {
            this.method749(52, 49, 27);
        }
        int var5 = this.field3282 * arg0 >> 12;
        int var6 = this.field3286 * arg2 >> 12;
        int var7 = this.field3293 * arg2 >> 12;
        class397.method2503(true, var5, super.field7261, var7, var4, var6);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIII)V", line = 25)
    public class197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3292 = arg0;
        this.field3286 = arg1;
        this.field3293 = arg3;
        this.field3282 = arg2;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIB)V", line = 36)
    public final void method747(int arg0, int arg1, byte arg2) {
        ++field3288;
        if (arg2 != 39) {
            field3287 = 52;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 55)
    public static void method1370(int arg0) {
        field3285 = null;
        if (arg0 <= 50) {
            field3291 = -103;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(III)V", line = 77)
    public final void method749(int arg0, int arg1, int arg2) {
        if (arg0 != -19475) {
            this.method748(-24, (byte) 25, -113);
        }
        ++field3289;
    }
}
