import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class509 extends class707 {

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    private int field7191 = 0;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZI)V")
    public final void method620(boolean arg0, int arg1) {
        ++field7195;
        if (arg1 <= 108) {
            this.method620(false, -116);
        }
        int var3 = super.field9960.field7905.method4235(false, class303.field3896, super.field9954.method1892()) + super.field9960.field7910;
        int var4 = super.field9960.field7902.method2413(super.field9954.method1882(), class708.field9966, (byte) -8) + super.field9960.field7903;
        super.field9954.method3930((float) (super.field9954.method1892() / 2 + var3), (float) (var4 + super.field9954.method1882() / 2), 4096, this.field7191);
        this.field7191 += ((class267) super.field9960).field3383;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IFBFIF[BILhm;FIFII)V")
    public static final void method2936(int arg0, float arg1, byte arg2, float arg3, int arg4, float arg5, byte[] arg6, int arg7, class229 arg8, float arg9, int arg10, float arg11, int arg12, int arg13) {
        ++field7193;
        int var14 = arg7 * arg10;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg13; ++var16) {
            int var20 = arg0;
            arg8.method832(arg11 / (float) arg4, arg4, arg7, arg9 / (float) arg10, arg3 * 127.0F, 512, arg10, var15, arg12, arg5 / (float) arg7, 0);
            arg11 *= 2.0F;
            arg9 *= 2.0F;
            for (int var21 = 0; var21 < var14; ++var21) {
                arg6[var20] = (byte) ((int) ((float) arg6[var20] + var15[var21]));
                ++var20;
            }
            arg5 *= 2.0F;
            arg3 = arg1 * arg3;
        }
        int var17 = arg0;
        int var18 = 13 / ((arg2 - -1) / 48);
        for (int var19 = 0; ~var14 < ~var19; ++var19) {
            arg6[var17] = (byte) (arg6[var17] + 127);
            ++var17;
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lkha;Lfm;)V")
    public class509(class687 arg0, class267 arg1) {
        super(arg0, arg1);
    }
}
