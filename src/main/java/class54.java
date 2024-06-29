import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class54 extends class431 {

    @OriginalMember(owner = "client!u", name = "k", descriptor = "[I")
    public static int[] field666 = new int[1000];

    @OriginalMember(owner = "client!u", name = "l", descriptor = "[I")
    public static int[] field667 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field668 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lcg;IIIII)V")
    public static final void method507(class93 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1314 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field1311[var6] != null) {
                arg0.field1314++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field1314; var7++) {
            long var8 = class329.field4942[arg1][arg2][arg3];
            while (var8 != 0L) {
                class396 var14 = class503.field7256[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field1311[var7] == var14.field5918) {
                    continue label50;
                }
            }
            long var10 = class329.field4942[arg1][arg4][arg5];
            while (var10 != 0L) {
                class396 var13 = class503.field7256[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field1311[var7] == var13.field5918) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field1314 - 1; var12++) {
                arg0.field1311[var12] = arg0.field1311[var12 + 1];
            }
            arg0.field1314--;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method508(byte arg0) {
        field667 = null;
        if (arg0 >= 0) {
            method507(null, -99, 32, -31, 72, -66);
        }
        field666 = null;
    }
}
