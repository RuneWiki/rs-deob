import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class630 {

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)V", line = 3)
    public static final void method3430(byte arg0) {
        class627.field8745 = 0;
        field8759++;
        int var1 = 0;
        int var2 = 81 / ((-arg0 - 62) / 45);
        while (var1 < 2048) {
            class576.field8042[var1] = null;
            class664.field9089[var1] = 1;
            class16.field225[var1] = null;
            var1++;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(II[[[BIILha;IIIIIII)V", line = 31)
    public static final void method3431(int arg0, int arg1, byte[][][] arg2, int arg3, int arg4, class454 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field8760++;
        if (arg7 == 0 || arg4 == 0) {
            return;
        }
        if (arg7 == 9) {
            arg7 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        if (arg8 != 3) {
            return;
        }
        if (arg7 == 10) {
            arg1 = arg1 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg7 = 8;
        }
        arg5.method63(arg9, arg12, arg11, arg6, arg10, arg0, arg2[arg7 - 1][arg1], arg4, arg3);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(B[I[J)V", line = 64)
    public static final void method3432(byte arg0, int[] arg1, long[] arg2) {
        field8761++;
        class603.method3317(101, arg1, 0, arg2, arg2.length - 1);
        if (arg0 > 100) {
            ;
        }
    }
}
