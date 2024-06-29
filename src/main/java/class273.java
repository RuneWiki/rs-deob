import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class273 extends class667 {

    @OriginalMember(owner = "client!vea", name = "H", descriptor = "Z")
    private boolean field3897 = true;

    @OriginalMember(owner = "client!vea", name = "K", descriptor = "Z")
    private boolean field3900 = true;

    @OriginalMember(owner = "client!vea", name = "I", descriptor = "I")
    public static int field3898 = -1;

    @OriginalMember(owner = "client!vea", name = "B", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!vea", name = "D", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!vea", name = "F", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!vea", name = "G", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!vea", name = "J", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILud;)Liha;")
    public static final class30 method1800(int arg0, class35 arg1) {
        if (arg0 != -2) {
            field3898 = -81;
        }
        ++field3899;
        return new class30(arg1.method225((byte) 106), arg1.method225((byte) 123), arg1.method225((byte) 85), arg1.method225((byte) 99), arg1.method239(-113), arg1.method273(arg0 + 257));
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method777(boolean arg0, int arg1) {
        ++field3894;
        if (arg0) {
            return null;
        } else {
            int[][] var3 = super.field9357.method2314((byte) 41, arg1);
            if (super.field9357.field5178) {
                int[][] var4 = this.method3748(!this.field3900 ? arg1 : -arg1 + class77.field1453, 0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (!this.field3897) {
                    for (int var11 = 0; ~var11 > ~class77.field1455; ++var11) {
                        var8[var11] = var5[var11];
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    }
                } else {
                    for (int var12 = 0; ~var12 > ~class77.field1455; ++var12) {
                        var8[var12] = var5[-var12 + class439.field6131];
                        var9[var12] = var6[-var12 + class439.field6131];
                        var10[var12] = var7[-var12 + class439.field6131];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        ++field3896;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field9344 = ~arg0.method273(arg1 + 252) == -2;
                }
            } else {
                this.field3900 = ~arg0.method273(arg1 + 252) == -2;
            }
        } else {
            this.field3897 = arg0.method273(arg1 ^ 252) == 1;
        }
        if (arg1 != 3) {
            field3898 = 124;
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "()V")
    public class273() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lsp;Lqaa;I)Lvr;")
    public static final class135 method1801(class633 arg0, class27 arg1, int arg2) {
        if (arg2 != 2) {
            return null;
        } else {
            ++field3893;
            class135 var3 = class215.method1499((byte) 64);
            var3.field2106 = arg1;
            var3.field2114 = arg1.field377;
            if (var3.field2114 != -1) {
                if (var3.field2114 != -2) {
                    if (~var3.field2114 < -19) {
                        if (var3.field2114 <= 98) {
                            var3.field2109 = new class452(100);
                        } else {
                            var3.field2109 = new class452(260);
                        }
                    } else {
                        var3.field2109 = new class452(20);
                    }
                } else {
                    var3.field2109 = new class452(10000);
                }
            } else {
                var3.field2109 = new class452(260);
            }
            var3.field2109.method2689(arg0, arg2 ^ -29590);
            var3.field2109.method2682(var3.field2106.method195(0), (byte) -120);
            var3.field2112 = 0;
            return var3;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field3895;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (arg0 >= -87) {
            this.field3900 = true;
        }
        if (super.field9355.field3728) {
            int[] var4 = this.method3744(!this.field3900 ? arg1 : -arg1 + class77.field1453, (byte) 119, 0);
            if (this.field3897) {
                for (int var5 = 0; class77.field1455 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class439.field6131];
                }
            } else {
                class622.method3596(var4, 0, var3, 0, class77.field1455);
            }
        }
        return var3;
    }
}
