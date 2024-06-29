import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class214 extends class23 {

    @OriginalMember(owner = "client!le", name = "N", descriptor = "Llc;")
    private static class143 field3954 = class66.method374("level: ", -1);

    @OriginalMember(owner = "client!le", name = "P", descriptor = "Z")
    public static boolean field3956 = false;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Llc;")
    public static class143 field3951 = field3954;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field3957 = 0;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "Llc;")
    public static class143 field3958 = class66.method374("", -1);

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "[Lbc;")
    public static class100[] field3952;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILgf;I)[Lvg;")
    public static final class230[] method1482(int arg0, int arg1, class7 arg2, int arg3) {
        ++field3949;
        int var4 = 92 / ((50 - arg0) / 58);
        return !class189.method1223(arg2, arg1, 36, arg3) ? null : class144.method918((byte) 91);
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
    public static void method1483(int arg0) {
        field3954 = null;
        if (arg0 <= -6) {
            field3952 = null;
            field3951 = null;
            field3958 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLgf;)V")
    public static final void method1484(boolean arg0, class7 arg1) {
        ++field3950;
        if (!class13.field248) {
            if (arg0) {
                field3957 = 17;
            }
            class260.method1721();
            class271.field4835 = class217.method1491(2, arg1, class65.field1216);
            int var2 = class269.field4820;
            int var3 = var2 * 956 / 503;
            class271.field4835.method1065((-var3 + class10.field222) / 2, 0, var3, var2);
            class79.field1438 = class219.method1497(class76.field1412, 101, arg1);
            class79.field1438.method598(class10.field222 / 2 - class79.field1438.field3940 / 2, 18);
            class13.field248 = true;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3953;
        if (~arg3 <= -129 && arg4 >= 128 && arg3 <= 13056 && ~arg4 >= -13057) {
            int var8 = class20.method140(arg3, 117, arg4, class170.field3044) - arg1;
            int var9 = var8 - class92.field1658;
            int var10 = arg3 - class167.field2992;
            int var11 = arg4 - class154.field2776;
            int var12 = class196.field3630[class163.field2925];
            int var13 = class196.field3635[class163.field2925];
            int var14 = class196.field3635[class148.field2729];
            if (arg0 != -2101) {
                field3957 = 98;
            }
            int var15 = class196.field3630[class148.field2729];
            int var16 = var10 * var15 + var11 * var14 >> 16;
            int var17 = var11 * var15 + -(var10 * var14) >> 16;
            int var19 = var9 * var12 - var13 * var17 >> 16;
            int var20 = var9 * var13 + var12 * var17 >> 16;
            if (var20 < 50) {
                class33.field565 = -1;
                class67.field1272 = -1;
            } else {
                class67.field1272 = (var19 << 9) / var20 + arg2;
                class33.field565 = (var16 << 9) / var20 + arg5;
            }
        } else {
            class67.field1272 = -1;
            class33.field565 = -1;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class214() {
        super(1, true);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field3955;
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int[][] var4 = this.method161(arg1, 0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            for (int var8 = 0; var8 < class72.field1359; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return arg0 > -13 ? null : var3;
    }
}
