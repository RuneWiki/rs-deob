import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class763 extends class601 {

    @OriginalMember(owner = "client!dha", name = "J", descriptor = "I")
    private int field10387 = 1;

    @OriginalMember(owner = "client!dha", name = "I", descriptor = "I")
    private int field10386 = 1;

    @OriginalMember(owner = "client!dha", name = "F", descriptor = "I")
    public static int field10383;

    @OriginalMember(owner = "client!dha", name = "G", descriptor = "I")
    public static int field10384;

    @OriginalMember(owner = "client!dha", name = "H", descriptor = "I")
    public static int field10385;

    @OriginalMember(owner = "client!dha", name = "L", descriptor = "I")
    public static int field10389;

    @OriginalMember(owner = "client!dha", name = "M", descriptor = "Lha;")
    public static class570 field10390;

    @OriginalMember(owner = "client!dha", name = "K", descriptor = "[Lbha;")
    public static class318[] field10388;

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "()V", line = 3)
    public class763() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dha", name = "f", descriptor = "(I)V", line = 8)
    public static void method4156(int arg0) {
        field10390 = null;
        if (arg0 == -1090782256) {
            field10388 = null;
        }
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(II)[[I", line = 19)
    public final int[][] method638(int arg0, int arg1) {
        ++field10389;
        if (arg0 != 2017) {
            field10388 = null;
        }
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int var4 = this.field10386 - -this.field10386 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field10387 - -this.field10387 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field10386 + arg1; this.field10386 + arg1 >= var9; ++var9) {
                int[][] var19 = this.method3247((byte) -96, 0, var9 & class104.field1388);
                int[][] var20 = new int[3][class418.field5518];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field10387; ~var27 >= ~this.field10387; ++var27) {
                    int var37 = var27 & class511.field6519;
                    var22 += var25[var37];
                    var23 += var26[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class418.field5518) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class511.field6519 & var31 - this.field10387;
                    ++var31;
                    int var33 = var22 - var25[var32];
                    int var34 = var21 - var24[var32];
                    int var35 = var23 - var26[var32];
                    int var36 = class511.field6519 & var31 - -this.field10387;
                    var21 = var24[var36] + var34;
                    var23 = var26[var36] + var35;
                    var22 = var25[var36] + var33;
                }
                var8[-arg1 + this.field10386 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class418.field5518 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lmc;II)V", line = 153)
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field10383;
        int var4 = 124 / ((40 - arg2) / 52);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field7646 = arg0.method1509(true) == 1;
                }
            } else {
                this.field10386 = arg0.method1509(true);
            }
        } else {
            this.field10387 = arg0.method1509(true);
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IB)[I", line = 203)
    public final int[] method261(int arg0, byte arg1) {
        ++field10384;
        if (arg1 >= -76) {
            return null;
        } else {
            int[] var3 = super.field7643.method2054(arg0, 9986);
            if (super.field7643.field4364) {
                int var4 = this.field10386 + 1 + this.field10386;
                int var5 = 65536 / var4;
                int var6 = this.field10387 - (-this.field10387 - 1);
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field10386 + arg0; ~(this.field10386 + arg0) <= ~var9; ++var9) {
                    int[] var13 = this.method3243(class104.field1388 & var9, 27123, 0);
                    int[] var14 = new int[class418.field5518];
                    int var15 = 0;
                    for (int var16 = -this.field10387; var16 <= this.field10387; ++var16) {
                        var15 += var13[var16 & class511.field6519];
                    }
                    int var17 = 0;
                    while (var17 < class418.field5518) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[var17 - this.field10387 & class511.field6519];
                        ++var17;
                        var15 = var13[var17 - -this.field10387 & class511.field6519] + var18;
                    }
                    var8[this.field10386 + var9 - arg0] = var14;
                }
                for (int var10 = 0; ~class418.field5518 < ~var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var12 > ~var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Z)V", line = 294)
    public static final void method4157(boolean arg0) {
        ++field10385;
        ++class100.field1330;
        class341.field4183 = 0;
        class338.field4123 = 0;
        class366.method2105(0);
        class734.method3994((byte) -48);
        class765.method4158(arg0);
        boolean var1 = false;
        for (int var2 = 0; ~var2 > ~class341.field4183; ++var2) {
            int var5 = class523.field6665[var2];
            class232 var6 = (class232) class444.field5811.method2616((long) var5, (byte) -120);
            class727 var7 = var6.field3125;
            if (class525.field6678 && class527.method2892(-1, var5)) {
                class581.method3111(-56);
            }
            if (class100.field1330 != var7.field4662) {
                if (var7.field9545.method1580(false)) {
                    class569.method3062(-10290, var7);
                }
                var7.method3887((class240) null, 1);
                var6.method1946(-10364);
                var1 = true;
            }
        }
        if (var1) {
            class750.field10228 = class444.field5811.method2618(-1);
            class444.field5811.method2612(class542.field6811, -1);
        }
        if (~class199.field2766 != ~class356.field4337.field3133) {
            throw new RuntimeException("gnp1 pos:" + class356.field4337.field3133 + " psize:" + class199.field2766);
        } else {
            for (int var3 = 0; ~class349.field4271 < ~var3; ++var3) {
                if (class444.field5811.method2616((long) class88.field1224[var3], (byte) -84) == null) {
                    throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class349.field4271);
                }
            }
            if (-class349.field4271 + class750.field10228 != 0) {
                throw new RuntimeException("gnp3 mis:" + (-class349.field4271 + class750.field10228));
            } else {
                for (int var4 = 0; ~var4 > ~class750.field10228; ++var4) {
                    if (~class100.field1330 != ~class542.field6811[var4].field3125.field4662) {
                        throw new RuntimeException("gnp4 uk:" + class542.field6811[var4].field3125.field4737);
                    }
                }
            }
        }
    }
}
