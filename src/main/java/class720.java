import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class720 {

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public int field9966 = 0;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public int field9965 = 2048;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public int field9963 = 2048;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    public int field9969 = 0;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "Loo;")
    public static class652 field9964 = new class652(20);

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field9967;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public static int field9968;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public static int field9971;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field9972;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "Lqaa;")
    public static class29 field9970;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIBIII)V")
    public static final void method4029(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = -103 / ((-arg2 - 21) / 52);
        if (class407.field5535 >= arg5 && class734.field10153 <= arg0) {
            boolean var7;
            if (class618.field8645 > arg4) {
                arg4 = class618.field8645;
                var7 = false;
            } else if (class463.field6533 >= arg4) {
                var7 = true;
            } else {
                var7 = false;
                arg4 = class463.field6533;
            }
            boolean var8;
            if (class618.field8645 > arg3) {
                var8 = false;
                arg3 = class618.field8645;
            } else if (arg3 <= class463.field6533) {
                var8 = true;
            } else {
                var8 = false;
                arg3 = class463.field6533;
            }
            if (class734.field10153 > arg5) {
                arg5 = class734.field10153;
            } else {
                class434.method2601(class746.field10330[arg5++], arg4, arg1, (byte) -62, arg3);
            }
            if (class407.field5535 >= arg0) {
                class434.method2601(class746.field10330[arg0--], arg4, arg1, (byte) -62, arg3);
            } else {
                arg0 = class407.field5535;
            }
            if (var7 && var8) {
                for (int var9 = arg5; var9 <= arg0; var9++) {
                    int[] var10 = class746.field10330[var9];
                    var10[arg4] = var10[arg3] = arg1;
                }
            } else if (var7) {
                for (int var12 = arg5; var12 <= arg0; var12++) {
                    class746.field10330[var12][arg4] = arg1;
                }
            } else if (var8) {
                for (int var11 = arg5; var11 <= arg0; var11++) {
                    class746.field10330[var11][arg3] = arg1;
                }
            }
        }
        field9967++;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public static void method4030(int arg0) {
        if (arg0 > -77) {
            field9970 = null;
        }
        field9970 = null;
        field9964 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lso;B)V")
    public final void method4031(class494 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2964((byte) 86);
            if (var3 == 0) {
                if (arg1 <= 103) {
                    method4030(105);
                }
                field9971++;
                return;
            }
            this.method4032(arg0, -3, var3);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lso;II)V")
    private final void method4032(class494 arg0, int arg1, int arg2) {
        if (arg1 != -3) {
            return;
        }
        if (arg2 == 1) {
            this.field9969 = arg0.method2964((byte) 118);
        } else if (arg2 == 2) {
            this.field9965 = arg0.method2998(true);
        } else if (arg2 == 3) {
            this.field9963 = arg0.method2998(true);
        } else if (arg2 == 4) {
            this.field9966 = arg0.method2988(-3);
        }
        field9968++;
    }
}
