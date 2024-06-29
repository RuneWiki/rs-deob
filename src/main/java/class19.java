import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class19 extends class192 {

    @OriginalMember(owner = "client!nr", name = "O", descriptor = "Z")
    private boolean field215 = true;

    @OriginalMember(owner = "client!nr", name = "N", descriptor = "I")
    private int field214 = 4096;

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!nr", name = "M", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "Lpe;")
    public static class615 field211;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILjava/lang/String;B)I", line = 3)
    public static final int method106(int arg0, String arg1, byte arg2) {
        ++field209;
        return arg2 != 99 ? -124 : class174.method1179(arg1, true, arg2 + -2541, arg0);
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(IB)[[I", line = 21)
    public final int[][] method107(int arg0, byte arg1) {
        ++field212;
        int[][] var3 = super.field2467.method2466(arg0, 0);
        int var4 = 122 % ((-14 - arg1) / 34);
        if (super.field2467.field5565) {
            int[] var5 = this.method1253(0, arg0 + -1 & class95.field1247, 0);
            int[] var6 = this.method1253(0, arg0, 0);
            int[] var7 = this.method1253(0, class95.field1247 & arg0 + 1, 0);
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class561.field7319; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field214;
                int var13 = (var6[class337.field4356 & var11 - -1] + -var6[var11 + -1 & class337.field4356]) * this.field214;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var16 - (-var17 - 4096)) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (~var18 != -1) {
                    var19 = var12 / var18;
                    var20 = 16777216 / var18;
                    var21 = var13 / var18;
                } else {
                    var19 = 0;
                    var21 = 0;
                    var20 = 0;
                }
                if (this.field215) {
                    var20 = 2048 - -(var20 >> 1);
                    var21 = (var21 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var8[var11] = var21;
                var9[var11] = var19;
                var10[var11] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(Z)V", line = 102)
    public static void method108(boolean arg0) {
        if (arg0) {
            field211 = null;
        }
        field211 = null;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILfd;I)V", line = 114)
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field215 = arg1.method2396(arg2 ^ -12087) == 1;
            }
        } else {
            this.field214 = arg1.method2393(-30727);
        }
        if (arg2 == -12160) {
            ++field210;
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V", line = 152)
    public class19() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Loa;I)V", line = 162)
    public static final void method110(class43 arg0, int arg1) {
        ++field213;
        if (arg1 != -2) {
            method108(true);
        }
        if (class288.field3723) {
            class553.method2964(arg0, arg1 ^ -258);
        } else {
            class277.method1680(89, arg0);
        }
    }
}
