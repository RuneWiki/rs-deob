import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class480 extends class529 {

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "Z")
    private boolean field6850 = true;

    @OriginalMember(owner = "client!vq", name = "M", descriptor = "Z")
    private boolean field6857 = true;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "Lqi;")
    public static class669 field6848 = new class669(8, 1);

    @OriginalMember(owner = "client!vq", name = "I", descriptor = "I")
    public static int field6853 = -1;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!vq", name = "G", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!vq", name = "H", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!vq", name = "J", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)V")
    public static void method2809(int arg0) {
        if (arg0 != 16) {
            field6853 = 6;
        }
        field6848 = null;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
    public class480() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field6852;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field7461 = ~arg2.method1094(255) == -2;
                }
            } else {
                this.field6850 = ~arg2.method1094(255) == -2;
            }
        } else {
            this.field6857 = ~arg2.method1094(255) == -2;
        }
        if (arg1 <= 45) {
            field6853 = 50;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)[[I")
    public final int[][] method592(int arg0, int arg1) {
        ++field6855;
        if (arg1 != 2) {
            return null;
        } else {
            int[][] var3 = super.field7450.method2241(-1, arg0);
            if (super.field7450.field5165) {
                int[][] var4 = this.method3026(0, this.field6850 ? class33.field516 - arg0 : arg0, 18464);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (this.field6857) {
                    for (int var11 = 0; class304.field3909 > var11; ++var11) {
                        var8[var11] = var5[-var11 + class404.field5700];
                        var9[var11] = var6[-var11 + class404.field5700];
                        var10[var11] = var7[-var11 + class404.field5700];
                    }
                } else {
                    for (int var12 = 0; class304.field3909 > var12; ++var12) {
                        var8[var12] = var5[var12];
                        var9[var12] = var6[var12];
                        var10[var12] = var7[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field6849;
        int[] var3 = super.field7456.method1635(arg0, -60);
        if (super.field7456.field3449) {
            int[] var4 = this.method3028((byte) 110, this.field6850 ? -arg0 + class33.field516 : arg0, 0);
            if (this.field6857) {
                for (int var5 = 0; class304.field3909 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class404.field5700];
                }
            } else {
                class617.method3391(var4, 0, var3, 0, class304.field3909);
            }
        }
        int var6 = 78 % ((27 - arg1) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(B)V")
    public static final void method2810(byte arg0) {
        if (arg0 < -77) {
            if (~class668.field9150 == -4) {
                class614.method3369(4, (byte) -72);
            } else if (~class668.field9150 == -8) {
                class614.method3369(8, (byte) -62);
            } else if (~class668.field9150 == -11) {
                class614.method3369(11, (byte) -114);
            }
            ++field6854;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIBII)V")
    public static final void method2811(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field6851;
        if (arg2 != -122) {
            method2810((byte) -41);
        }
        if (arg1 != 8 && arg1 != 16) {
            class73 var5 = class495.field7002[arg4][arg0][arg3];
            if (var5 != null) {
                if (~arg1 == -2) {
                    var5.field967 = 0;
                } else if (arg1 == 2) {
                    var5.field972 = 0;
                }
            }
            class408.method2417((byte) -2);
        } else {
            for (int var6 = 0; var6 < class206.field2635; ++var6) {
                class600 var7 = class359.field5120[var6];
                if (var7.field8344 == arg1 && ~var7.field8333 == ~arg0 && ~var7.field8341 == ~arg3 || ~var7.field8335 == ~arg0 && ~var7.field8341 == ~arg3) {
                    if (~class206.field2635 != ~var6) {
                        class617.method3390(class359.field5120, var6 + 1, class359.field5120, var6, -var6 + -1 + class359.field5120.length);
                    }
                    --class206.field2635;
                    return;
                }
            }
        }
    }
}
