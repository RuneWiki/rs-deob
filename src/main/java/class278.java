import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class278 extends class17 {

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    private int field4113 = 2048;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    private int field4114 = 3072;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    private int field4121 = 1024;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "Loi;")
    public static class53 field4122;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 != 5159) {
            this.field4121 = 56;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field205 = arg0.method2357((byte) 105) == 1;
                }
            } else {
                this.field4114 = arg0.method2338(0);
            }
        } else {
            this.field4121 = arg0.method2338(arg2 ^ 5159);
        }
        ++field4118;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class278() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field4119;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (arg1 != -25) {
            this.method34((class403) null, -36, 126);
        }
        if (super.field201.field4431) {
            int[][] var4 = this.method91(0, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class530.field7763; ++var11) {
                var8[var11] = this.field4121 - -(var5[var11] * this.field4113 >> 12);
                var9[var11] = (var6[var11] * this.field4113 >> 12) + this.field4121;
                var10[var11] = (var7[var11] * this.field4113 >> 12) + this.field4121;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field4117;
        if (arg1 < 53) {
            this.method27(62, -22);
        }
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int[] var4 = this.method88(arg0, -4526, 0);
            for (int var5 = 0; var5 < class530.field7763; ++var5) {
                var3[var5] = this.field4121 - -(var4[var5] * this.field4113 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lwm;Z)Lme;")
    public static final class133 method1740(class403 arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field4112;
            return new class133(arg0.method2371(7162), arg0.method2371(7162), arg0.method2371(7162), arg0.method2371(7162), arg0.method2323((byte) 85), arg0.method2357((byte) 112));
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
    public static final void method1741(int arg0, boolean arg1) {
        while (true) {
            if (~class264.field3874.method1522(arg0 + -20848, class190.field2715) <= -16) {
                int var2 = class264.field3874.method1520(-12494, 15);
                if (~var2 != -32768) {
                    boolean var3 = false;
                    class378 var4 = (class378) class125.field1687.method2405((long) var2, arg0 ^ -20826);
                    if (var4 == null) {
                        class429 var5 = new class429();
                        var5.field3289 = var2;
                        var4 = new class378(var5);
                        class125.field1687.method2413((long) var2, var4, -1);
                        class367.field5245[class481.field6704++] = var4;
                        var3 = true;
                    }
                    class429 var6 = var4.field5353;
                    class488.field6834[class434.field6110++] = var2;
                    var6.field3316 = class390.field5481;
                    if (var6.field6055 != null && var6.field6055.method1938((byte) -116)) {
                        class336.method2010(var6, (byte) -78);
                    }
                    int var7 = class264.field3874.method1520(-12494, 1);
                    if (var7 == 1) {
                        class373.field5317[class169.field2464++] = var2;
                    }
                    int var8;
                    if (arg1) {
                        var8 = class264.field3874.method1520(-12494, 8);
                        if (~var8 < -128) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = class264.field3874.method1520(-12494, 5);
                        if (~var8 < -16) {
                            var8 -= 32;
                        }
                    }
                    int var9;
                    if (arg1) {
                        var9 = class264.field3874.method1520(-12494, 8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = class264.field3874.method1520(-12494, 5);
                        if (~var9 < -16) {
                            var9 -= 32;
                        }
                    }
                    int var10 = class264.field3874.method1520(arg0 ^ -25014, 1);
                    int var11 = 15048 & class264.field3874.method1520(-12494, 3) - -4 << 11;
                    var6.method2541(class106.field1400.method2580(class264.field3874.method1520(arg0 ^ -25014, 14), -125), false);
                    int var12 = class264.field3874.method1520(-12494, 2);
                    var6.method1404((byte) 58, var6.field6055.field4711);
                    var6.field3313 = var6.field6055.field4657 << 3;
                    if (var3) {
                        var6.method1408(var11, true, 989076559);
                    }
                    var6.method2537(-7917, class246.field3587.field3378[0] - -var9, var10 == 1, var12, var6.method125((byte) -107), class246.field3587.field3368[0] + var8);
                    if (var6.field6055.method1938((byte) -124)) {
                        class138.method863(0, var6.field3368[0], var6, var6.field3378[0], var6.field1904, (class22) null, -9518, (class270) null);
                    }
                    continue;
                }
            }
            if (arg0 != 20856) {
                field4122 = null;
            }
            ++field4116;
            class264.field3874.method1514(false);
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
    public final void method31(int arg0) {
        ++field4120;
        this.field4113 = -this.field4121 + this.field4114;
        if (arg0 != -9) {
            method1742(28);
        }
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V")
    public static void method1742(int arg0) {
        field4122 = null;
        if (arg0 != 1) {
            field4122 = null;
        }
    }

    static {
        new class530(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }
}
