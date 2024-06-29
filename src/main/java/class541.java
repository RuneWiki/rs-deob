import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class541 extends class202 {

    @OriginalMember(owner = "client!wv", name = "K", descriptor = "Z")
    private boolean field7902 = true;

    @OriginalMember(owner = "client!wv", name = "S", descriptor = "I")
    private int field7910 = 4096;

    @OriginalMember(owner = "client!wv", name = "L", descriptor = "[I")
    public static int[] field7903 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wv", name = "M", descriptor = "Lnj;")
    public static class317 field7904 = new class317();

    @OriginalMember(owner = "client!wv", name = "J", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!wv", name = "N", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!wv", name = "R", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!wv", name = "I", descriptor = "Lbi;")
    public static class104 field7900;

    @OriginalMember(owner = "client!wv", name = "Q", descriptor = "Lnj;")
    public static class317 field7908;

    @OriginalMember(owner = "client!wv", name = "O", descriptor = "Ldp;")
    public static class342 field7906;

    @OriginalMember(owner = "client!wv", name = "P", descriptor = "[I")
    public static int[] field7907;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field7909;
        int[][] var3 = super.field3081.method1050(arg1, arg0 ^ 104);
        if (super.field3081.field2432) {
            int[] var4 = this.method1376(1046794076, 0, class335.field5237 & arg1 + -1);
            int[] var5 = this.method1376(arg0 ^ -1046794077, 0, arg1);
            int[] var6 = this.method1376(1046794076, 0, arg1 + 1 & class335.field5237);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class276.field4375; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field7910;
                int var12 = (var5[class538.field7882 & var10 + 1] + -var5[var10 + -1 & class538.field7882]) * this.field7910;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                }
                if (this.field7902) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        if (arg0 != -1) {
            method3192(-96);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "(I)V")
    public static void method3192(int arg0) {
        field7906 = null;
        field7903 = null;
        field7907 = null;
        field7904 = null;
        field7900 = null;
        field7908 = null;
        if (arg0 != -9297) {
            field7908 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = 35 % ((-46 - arg1) / 50);
        ++field7901;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field7902 = ~arg0.method1445(-90) == -2;
            }
        } else {
            this.field7910 = arg0.method1455(-3387);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BLta;IIIJIILgi;)V")
    public static final void method3193(byte arg0, class453 arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, class437 arg8) {
        if (arg0 != -74) {
            method3193((byte) 69, (class453) null, 89, -120, 64, 62L, 104, 78, (class437) null);
        }
        ++field7905;
        int var10 = arg4 * arg4 + arg6 * arg6;
        if (~arg5 <= ~((long) var10)) {
            int var11 = Math.min(arg8.field6615 / 2, arg8.field6730 / 2);
            if (var10 <= var11 * var11) {
                class299.method2010(arg3, class172.field2526[arg2], arg6, arg8, arg7, 70, arg4, arg1);
            } else {
                var11 -= 10;
                int var12;
                if (~class334.field5222 == -5) {
                    var12 = (int) class388.field5918 & 16383;
                } else {
                    var12 = 16383 & (int) class388.field5918 + class386.field5903;
                }
                int var13 = class147.field1988[var12];
                int var14 = class147.field1986[var12];
                if (class334.field5222 != 4) {
                    var13 = var13 * 256 / (class326.field5126 + 256);
                    var14 = var14 * 256 / (class326.field5126 + 256);
                }
                int var15 = arg4 * var13 + arg6 * var14 >> 15;
                int var16 = arg4 * var14 + -(arg6 * var13) >> 15;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) (Math.sin(var17) * (double) var11);
                int var20 = (int) (Math.cos(var17) * (double) var11);
                class376.field5792[arg2].method846((float) arg8.field6615 / 2.0F + (float) arg7 + (float) var19, (float) arg8.field6730 / 2.0F + (float) arg3 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
    public class541() {
        super(1, false);
    }
}
