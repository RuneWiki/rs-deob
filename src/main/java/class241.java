import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class241 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lbf;")
    public static class328 field3765;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Ljava/lang/String;")
    public String field3761;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I", line = 9)
    public static final int method1593(int arg0, int arg1) {
        field3767++;
        if (arg1 > 0) {
            return 1;
        } else if (arg1 < 0) {
            return -1;
        } else {
            int var2 = -31 / ((86 - arg0) / 39);
            return 0;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 28)
    public static void method1594(int arg0) {
        field3765 = null;
        int var1 = 42 % ((arg0 + 39) / 38);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)I", line = 45)
    public static final int method1595(int arg0) {
        field3766++;
        if (class177.field2866 != null) {
            return 3;
        } else if (class249.field3893 && class196.field3153) {
            return 2;
        } else if (arg0 == 2) {
            return class249.field3893 && !class196.field3153 ? 1 : 0;
        } else {
            return -71;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V", line = 69)
    public static final void method1596(int arg0, int arg1) {
        if (arg1 == 0) {
            class260.field4055 = 1000 / arg0;
            field3763++;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZI)V", line = 80)
    public static final void method1597(int arg0, boolean arg1, int arg2) {
        field3764++;
        if (arg1) {
            field3765 = (class328) null;
        }
        class2 var3 = class212.method1433(arg2, 1, -13802);
        var3.method13((byte) -1);
        var3.field39 = arg0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[III)V", line = 96)
    public static final void method1598(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        arg4--;
        field3759++;
        int var6 = arg3 - 1;
        int var5 = arg1 + var6;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg2[var7] = arg0;
            int var8 = var7 + 1;
            arg2[var8] = arg0;
            int var9 = var8 + 1;
            arg2[var9] = arg0;
            int var10 = var9 + 1;
            arg2[var10] = arg0;
            int var11 = var10 + 1;
            arg2[var11] = arg0;
            int var12 = var11 + 1;
            arg2[var12] = arg0;
            int var13 = var12 + 1;
            arg2[var13] = arg0;
            arg4 = var13 + 1;
            arg2[arg4] = arg0;
        }
        while (arg4 < var6) {
            arg4++;
            arg2[arg4] = arg0;
        }
    }
}
