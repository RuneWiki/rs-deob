import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class671 extends class55 {

    @OriginalMember(owner = "client!vfa", name = "m", descriptor = "I")
    public int field9321;

    @OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
    public int field9326;

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "I")
    public static int field9319 = 0;

    @OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
    public static int field9324 = 0;

    @OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!vfa", name = "n", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!vfa", name = "q", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)I")
    public static final int method3774(int arg0) {
        if (arg0 <= 21) {
            return 2;
        } else {
            field9320++;
            return 16;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IILcn;BFFIFIIF[BF)V")
    public static final void method3775(int arg0, int arg1, class516 arg2, byte arg3, float arg4, float arg5, int arg6, float arg7, int arg8, int arg9, float arg10, byte[] arg11, float arg12) {
        for (int var13 = 0; var13 < arg1; var13++) {
            class5.method12(arg7, false, arg0, arg5, arg1, arg4, arg2, arg9, arg10, arg6, arg11, arg12, arg8, var13);
            arg0 += arg6 * arg8;
        }
        if (arg3 > -14) {
            field9324 = 28;
        }
        field9325++;
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(II)V")
    public class671(int arg0, int arg1) {
        this.field9321 = arg0;
        this.field9326 = arg1;
    }
}
