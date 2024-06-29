import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class31 extends class245 {

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client!mca", name = "x", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client!mca", name = "w", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!mca", name = "y", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!mca", name = "v", descriptor = "Ltia;")
    public static class269 field325;

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "Lqj;")
    public static class511 field324;

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "[Lnn;")
    public static class417[] field316;

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 4)
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field322 = arg0;
        this.field327 = arg5;
        this.field315 = arg2;
        this.field326 = arg6;
        this.field317 = arg1;
        this.field319 = arg3;
        this.field321 = arg7;
        this.field320 = arg4;
    }

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "(III)V", line = 28)
    public final void method158(int arg0, int arg1, int arg2) {
        ++field323;
        if (arg1 != 0) {
            field325 = null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(III)V", line = 45)
    public final void method159(int arg0, int arg1, int arg2) {
        if (arg0 != 521) {
            this.field326 = -21;
        }
        ++field328;
        int var4 = this.field322 * arg1 >> 12;
        int var5 = this.field317 * arg2 >> 12;
        int var6 = this.field315 * arg1 >> 12;
        int var7 = this.field319 * arg2 >> 12;
        int var8 = this.field320 * arg1 >> 12;
        int var9 = this.field327 * arg2 >> 12;
        int var10 = this.field326 * arg1 >> 12;
        int var11 = this.field321 * arg2 >> 12;
        class35.method185(var6, var7, -251, var9, var8, var4, var5, var11, var10, super.field3574);
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V", line = 73)
    public static void method160(int arg0) {
        if (arg0 == 321413452) {
            field325 = null;
            field324 = null;
            field316 = null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V", line = 86)
    public final void method161(int arg0, int arg1, int arg2) {
        ++field318;
        int var4 = -118 / ((-27 - arg1) / 62);
    }
}
