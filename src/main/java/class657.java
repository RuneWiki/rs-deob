import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class657 extends class214 {

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field9347 = 100;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "Lew;")
    public static class685 field9349 = new class685("", 15);

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field9353 = 0;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "Lpl;")
    public static class616 field9351 = new class616(16);

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "[Lsk;")
    private class119[] field9352;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field9346;
        int[] var3 = super.field3544.method3869(arg0, arg1 + -129);
        if (super.field3544.field9836) {
            this.method3699((byte) 117, super.field3544.method3866((byte) -110));
        }
        if (arg1 != 5) {
            method3697((byte) 68);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class657() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 <= 92) {
            field9353 = 63;
        }
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field3540 = ~arg1.method1987(-110) == -2;
            }
        } else {
            this.field9352 = new class119[arg1.method1987(-32)];
            for (int var4 = 0; this.field9352.length > var4; ++var4) {
                int var5 = arg1.method1987(-98);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field9352[var4] = class597.method3428(true, arg1);
                            }
                        } else {
                            this.field9352[var4] = class439.method2704(arg1, 15543);
                        }
                    } else {
                        this.field9352[var4] = class398.method2461(arg1, (byte) -20);
                    }
                } else {
                    this.field9352[var4] = class242.method1681(14064, arg1);
                }
            }
        }
        ++field9350;
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)V")
    public static void method3697(byte arg0) {
        field9349 = null;
        int var1 = -87 / ((-60 - arg0) / 41);
        field9351 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII[B)V")
    public static final void method3698(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg3 < 124) {
            method3697((byte) -92);
        }
        ++field9355;
        if (~arg4 > ~arg0) {
            int var6 = arg0 - arg4 >> 2;
            int var7 = arg2 + arg4;
            while (true) {
                --var6;
                if (var6 < 0) {
                    int var8 = 3 & -arg4 + arg0;
                    while (true) {
                        --var8;
                        if (var8 < 0) {
                            return;
                        }
                        arg5[var7++] = 1;
                    }
                }
                arg5[var7++] = 1;
                arg5[var7++] = 1;
                arg5[var7++] = 1;
                arg5[var7++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field9354;
        int[][] var3 = super.field3545.method2996((byte) 119, arg0);
        if (super.field3545.field7147) {
            int var4 = class626.field8787;
            int var5 = class259.field4054;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field3545.method3000(arg1 + 12569);
            this.method3699((byte) 117, var6);
            for (int var8 = 0; class259.field4054 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class626.field8787; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class636.method3603(var15, 255) << 4;
                    var12[var14] = class636.method3603(4080, var15 >> 4);
                    var11[var14] = class636.method3603(var15 >> 12, 4080);
                }
            }
        }
        if (arg1 != -256) {
            field9351 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B[[I)V")
    private final void method3699(byte arg0, int[][] arg1) {
        ++field9348;
        int var3 = class626.field8787;
        int var4 = class259.field4054;
        if (arg0 != 117) {
            this.method59(-121, (class301) null, -15);
        }
        class536.method3158(arg1, -73);
        class110.method900(class580.field8203, (byte) -3, 0, class245.field3948, 0);
        if (this.field9352 != null) {
            for (int var5 = 0; ~this.field9352.length < ~var5; ++var5) {
                class119 var6 = this.field9352[var5];
                int var7 = var6.field1830;
                int var8 = var6.field1832;
                if (var7 >= 0) {
                    if (~var8 <= -1) {
                        var6.method465(var4, 2, var3);
                    } else {
                        var6.method463(false, var3, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method460(var4, var3, false);
                }
            }
        }
    }
}
