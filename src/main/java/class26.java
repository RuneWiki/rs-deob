import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class26 extends class192 {

    @OriginalMember(owner = "client!ov", name = "J", descriptor = "I")
    private int field315 = 4096;

    @OriginalMember(owner = "client!ov", name = "L", descriptor = "I")
    private int field316 = 4096;

    @OriginalMember(owner = "client!ov", name = "P", descriptor = "[I")
    private int[] field320 = new int[3];

    @OriginalMember(owner = "client!ov", name = "U", descriptor = "I")
    private int field325 = 4096;

    @OriginalMember(owner = "client!ov", name = "N", descriptor = "I")
    private int field318 = 409;

    @OriginalMember(owner = "client!ov", name = "Q", descriptor = "Lrba;")
    public static class101 field321 = new class101("", 17);

    @OriginalMember(owner = "client!ov", name = "I", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ov", name = "M", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!ov", name = "O", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ov", name = "R", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!ov", name = "S", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ov", name = "T", descriptor = "[Ljba;")
    public static class138[] field324;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILfd;)Lu;", line = 3)
    public static final class53 method150(int arg0, class418 arg1) {
        ++field314;
        class41 var2 = class432.method2472(arg1, (byte) 111);
        int var3 = arg1.method2355(45);
        int var4 = arg1.method2355(68);
        int var5 = arg1.method2393(-30727);
        return arg0 != -3 ? null : new class53(var2.field579, var2.field574, var2.field581, var2.field582, var2.field584, var2.field585, var2.field575, var2.field587, var2.field586, var3, var4, var5);
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V", line = 57)
    public class26() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)I", line = 30)
    public static final int method151(int arg0) {
        ++field323;
        return arg0 != 1818702860 ? 114 : class446.field5735;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(III)Z", line = 41)
    public static final boolean method152(int arg0, int arg1, int arg2) {
        if (arg1 <= 116) {
            method151(-89);
        }
        ++field317;
        return (2048 & arg2) != 0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILfd;I)V", line = 63)
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            int var5 = arg1.method2364(-127);
                            this.field320[2] = class597.method3238(var5 >> 12, 0);
                            this.field320[1] = class597.method3238(var5 >> 4, 4080);
                            this.field320[0] = class597.method3238(var5, 16711680) << 4;
                        }
                    } else {
                        this.field316 = arg1.method2393(-30727);
                    }
                } else {
                    this.field315 = arg1.method2393(-30727);
                }
            } else {
                this.field325 = arg1.method2393(arg2 ^ 22393);
            }
        } else {
            this.field318 = arg1.method2393(-30727);
        }
        if (arg2 != -12160) {
            this.field320 = null;
        }
        ++field319;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(Z)V", line = 135)
    public static void method153(boolean arg0) {
        field324 = null;
        field321 = null;
        if (arg0) {
            method151(54);
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(IB)[[I", line = 146)
    public final int[][] method107(int arg0, byte arg1) {
        ++field322;
        int[][] var3 = super.field2467.method2466(arg0, 0);
        int var4 = -58 % ((-14 - arg1) / 34);
        if (super.field2467.field5565) {
            int[][] var5 = this.method1251(0, arg0, (byte) 78);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~class561.field7319 < ~var12; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field320[0] + var13;
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (~var14 < ~this.field318) {
                    var9[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = var15 - this.field320[1];
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (~var16 < ~this.field318) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field320[2] + var17;
                        if (~var18 > -1) {
                            var18 = -var18;
                        }
                        if (~var18 < ~this.field318) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field316 * var13 >> 12;
                            var10[var12] = this.field315 * var15 >> 12;
                            var11[var12] = this.field325 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
