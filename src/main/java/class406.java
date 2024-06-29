import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class406 implements class117 {

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public int field5721;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "Lada;")
    public class267 field5719;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "I")
    public int field5722;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
    public int field5717;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    public int field5723;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "Loe;")
    public class15 field5716;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
    public int field5720;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public int field5715;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
    public int field5724;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "Lpb;")
    public static class2 field5718 = new class2(2);

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "Lae;")
    public static class283 field5726;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)Lof;")
    public class475 method473(int arg0) {
        if (arg0 != 6) {
            field5718 = null;
        }
        field5725++;
        return null;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V")
    public static void method2486(byte arg0) {
        field5726 = null;
        if (arg0 > -20) {
            method2486((byte) 6);
        }
        field5718 = null;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IBIZII)V")
    public static final void method2487(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field5714++;
        long var6 = (long) (arg5 | (arg3 ? Integer.MIN_VALUE : 0));
        class717 var8 = (class717) class495.field6809.method3669(false, var6);
        if (var8 == null) {
            var8 = new class717();
            class495.field6809.method3666((byte) 65, var6, var8);
        }
        if (arg4 >= var8.field9937.length) {
            int[] var9 = new int[arg4 + 1];
            int[] var10 = new int[arg4 + 1];
            for (int var11 = 0; var11 < var8.field9937.length; var11++) {
                var9[var11] = var8.field9937[var11];
                var10[var11] = var8.field9935[var11];
            }
            for (int var12 = var8.field9937.length; var12 < arg4; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field9937 = var9;
            var8.field9935 = var10;
        }
        int var13 = 79 % ((45 - arg1) / 48);
        var8.field9937[arg4] = arg2;
        var8.field9935[arg4] = arg0;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lada;Loe;IIIIIII)V")
    public class406(class267 arg0, class15 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5721 = arg7;
        this.field5719 = arg0;
        this.field5722 = arg5;
        this.field5717 = arg2;
        this.field5723 = arg4;
        this.field5716 = arg1;
        this.field5720 = arg8;
        this.field5715 = arg3;
        this.field5724 = arg6;
    }
}
