import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class267 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3694 = new String[5];

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field3695 = -1;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "[I")
    public static int[] field3697 = new int[14];

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 9)
    public static void method1732(byte arg0) {
        if (arg0 != -34) {
            field3697 = null;
        }
        field3694 = null;
        field3697 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 29)
    public static final void method1733(int arg0) {
        class170.field2329 = null;
        class290.field4074 = null;
        if (arg0 <= 39) {
            return;
        }
        class277.field3882 = null;
        class57.field783 = null;
        field3696++;
        class442.field6205 = null;
        class414.field5879 = null;
        class329.field4569 = null;
        class195.field2682 = null;
        class65.field968 = null;
        class348.field4796 = null;
        class288.field4053 = null;
        class397.field5672 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lgr;IIIII)V", line = 51)
    public static final void method1734(class249 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3522 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field3521[var6] != null) {
                arg0.field3522++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field3522; var7++) {
            int var8 = class54.field754[arg1][arg2][arg3];
            while (var8 != 0) {
                class404 var12 = class14.field280[(var8 & 0xFF) - 1];
                var8 >>>= 0x8;
                if (arg0.field3521[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class54.field754[arg1][arg4][arg5];
            while (var9 != 0) {
                class404 var11 = class14.field280[(var9 & 0xFF) - 1];
                var9 >>>= 0x8;
                if (arg0.field3521[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field3522 - 1; var10++) {
                arg0.field3521[var10] = arg0.field3521[var10 + 1];
            }
            arg0.field3522--;
        }
    }
}
