import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class625 extends class748 {

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    private int field8921 = 409;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "[I")
    private int[] field8926 = new int[3];

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    private int field8928 = 4096;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    private int field8922 = 4096;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    private int field8931 = 4096;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "Llg;")
    public static class139 field8924;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "Lcw;")
    public static class21 field8929;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILwu;)I", line = 3)
    public static final int method3654(int arg0, class557 arg1) {
        ++field8923;
        int var2 = 0;
        if (arg1.method3340(0, class365.field4673)) {
            ++var2;
        }
        if (arg1.method3340(0, class80.field1102)) {
            ++var2;
        }
        if (arg1.method3340(0, class545.field7707)) {
            ++var2;
        }
        if (arg0 >= -70) {
            field8925 = -110;
        }
        if (arg1.method3340(0, class42.field590)) {
            ++var2;
        }
        if (arg1.method3340(0, class453.field6243)) {
            ++var2;
        }
        if (arg1.method3340(0, class636.field9046)) {
            ++var2;
        }
        if (arg1.method3340(0, class622.field8851)) {
            ++var2;
        }
        if (arg1.method3340(0, class586.field8434)) {
            ++var2;
        }
        if (arg1.method3340(0, class18.field231)) {
            ++var2;
        }
        if (arg1.method3340(0, class529.field7402)) {
            ++var2;
        }
        if (arg1.method3340(0, class293.field3831)) {
            ++var2;
        }
        if (arg1.method3340(0, class687.field9634)) {
            ++var2;
        }
        if (arg1.method3340(0, class609.field8673)) {
            ++var2;
        }
        if (arg1.method3340(0, class405.field5623)) {
            ++var2;
        }
        if (arg1.method3340(0, class504.field7059)) {
            ++var2;
        }
        if (arg1.method3340(0, class390.field5436)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZLvj;)V", line = 80)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field8932;
        if (arg1) {
            this.field8926 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method186((byte) 119);
                            this.field8926[0] = class136.method878(var5 << 4, 267386880);
                            this.field8926[1] = class136.method878(65280, var5) >> 4;
                            this.field8926[2] = class136.method878(0, var5 >> 12);
                        }
                    } else {
                        this.field8928 = arg2.method193(2);
                    }
                } else {
                    this.field8922 = arg2.method193(2);
                }
            } else {
                this.field8931 = arg2.method193(2);
            }
        } else {
            this.field8921 = arg2.method193(2);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 148)
    public class625() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBLvj;)Ljava/lang/String;", line = 157)
    public static final String method3655(int arg0, byte arg1, class26 arg2) {
        ++field8920;
        try {
            int var3 = arg2.method190(-27226);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            if (arg1 <= 32) {
                method3655(105, (byte) -84, (class26) null);
            }
            arg2.field330 += class375.field5218.method1833(-1, var3, 0, arg2.field279, arg2.field330, var4);
            return class748.method4161(0, var4, var3, true);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "(I)V", line = 187)
    public static void method3656(int arg0) {
        int var1 = 19 / ((arg0 - -54) / 54);
        field8924 = null;
        field8929 = null;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)[[I", line = 200)
    public final int[][] method445(int arg0, int arg1) {
        ++field8927;
        int[][] var3 = super.field10420.method930(arg1 ^ 29784, arg0);
        if (arg1 != 0) {
            field8924 = null;
        }
        if (super.field10420.field1979) {
            int[][] var4 = this.method4159(0, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class424.field5889; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field8926[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~this.field8921 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field8926[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field8921 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field8926[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field8921 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field8928 * var12 >> 12;
                            var9[var11] = this.field8922 * var14 >> 12;
                            var10[var11] = this.field8931 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
