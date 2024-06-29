import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class442 extends class747 {

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field6137 = -1;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field6140 = 0;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "Luu;")
    public static class237 field6139;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V", line = 5)
    public static void method2706(int arg0) {
        field6139 = null;
        if (arg0 != -1) {
            method2708((byte) -49, 0, (class548) null, 14, (class21) null, -16, (class717) null, (class203) null, -81);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lcf;)V", line = 15)
    public static final void method2707(class397 arg0) {
        class269.field3931 = arg0;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V", line = 23)
    public class442() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BILha;ILjo;ILto;Lcu;I)V", line = 26)
    public static final void method2708(byte arg0, int arg1, class548 arg2, int arg3, class21 arg4, int arg5, class717 arg6, class203 arg7, int arg8) {
        ++field6141;
        int var9 = -(arg3 / 2) + arg5 + -5;
        int var10 = arg8 + 2;
        if (arg4.field226 != 0) {
            arg2.method3249(var9, 125, -var10 + arg8 + arg7.method1233() * arg1 + 1, arg3 + 10, arg4.field226, var10);
        }
        if (arg4.field216 != 0) {
            arg2.method3250(29600, 1 + -var10 + arg7.method1233() * arg1 + arg8, var9, arg3 + 10, var10, arg4.field216);
        }
        if (arg0 != 126) {
            field6139 = null;
        }
        int var11 = arg4.field236;
        if (arg6.field9991 && ~arg4.field246 != 0) {
            var11 = arg4.field246;
        }
        for (int var12 = 0; ~arg1 < ~var12; ++var12) {
            String var13 = class622.field8319[var12];
            if (arg1 + -1 > var12) {
                var13 = var13.substring(0, -4 + var13.length());
            }
            arg7.method1231(arg2, var13, arg5, arg8, var11, true);
            arg8 += arg7.method1233();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[I", line = 69)
    public final int[] method182(int arg0, int arg1) {
        ++field6138;
        if (arg1 >= -89) {
            this.method182(-94, -105);
        }
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int[][] var4 = this.method4158(0, arg0, 2);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class73.field1095; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] - -var7[var8]) / 3;
            }
        }
        return var3;
    }
}
