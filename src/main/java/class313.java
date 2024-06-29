import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class313 extends class145 {

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    private int field4226 = 4096;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    private int field4230 = 409;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    private int field4234 = 4096;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "[I")
    private int[] field4235 = new int[3];

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    private int field4231 = 4096;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "F")
    public static float field4229 = 0.0F;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)V", line = 4)
    public static final void method1995(int arg0, int arg1) {
        ++field4227;
        if (arg0 <= 65) {
            method1996(52, -74, 0);
        }
        class125.field1748 = arg1;
        class81.field1207.method2533(0);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lap;BI)V", line = 17)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        int var4 = 116 % ((11 - arg1) / 52);
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var6 = arg0.method1880((byte) -105);
                            this.field4235[0] = class323.method2059(var6 << 4, 267386880);
                            this.field4235[2] = class323.method2059(0, var6 >> 12);
                            this.field4235[1] = class323.method2059(4080, var6 >> 4);
                        }
                    } else {
                        this.field4234 = arg0.method1853(87);
                    }
                } else {
                    this.field4231 = arg0.method1853(-125);
                }
            } else {
                this.field4226 = arg0.method1853(95);
            }
        } else {
            this.field4230 = arg0.method1853(-32);
        }
        ++field4233;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(III)I", line = 83)
    public static final int method1996(int arg0, int arg1, int arg2) {
        ++field4232;
        if (arg1 != 1313487783) {
            method1996(123, 57, -96);
        }
        int var3 = (127 & arg0) * arg2 >> 7;
        if (~var3 <= -3) {
            if (~var3 < -127) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return (65408 & arg0) + var3;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 104)
    public class313() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)[[I", line = 119)
    public final int[][] method4(boolean arg0, int arg1) {
        ++field4228;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (!arg0) {
            method1996(-70, -105, -23);
        }
        if (super.field2217.field5771) {
            int[][] var4 = this.method1121(arg1, 0, 2);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class156.field2364; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field4235[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field4230) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field4235[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field4230 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field4235[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (this.field4230 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4234 * var12 >> 12;
                            var9[var11] = this.field4231 * var14 >> 12;
                            var10[var11] = this.field4226 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
