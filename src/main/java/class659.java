import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class659 extends class335 {

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "[Lfaa;")
    private class296[] field9383;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field9383 = new class296[arg1.method930(255)];
            for (int var4 = 0; var4 < this.field9383.length; ++var4) {
                int var5 = arg1.method930(255);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field9383[var4] = class41.method224((byte) 37, arg1);
                            }
                        } else {
                            this.field9383[var4] = class141.method795(arg1, (byte) -128);
                        }
                    } else {
                        this.field9383[var4] = class244.method1494((byte) -121, arg1);
                    }
                } else {
                    this.field9383[var4] = class704.method3951(arg1, true);
                }
            }
        } else if (~arg0 == -2) {
            super.field4537 = arg1.method930(255) == 1;
        }
        if (arg2 != -66) {
            this.method3771((int[][]) null, (byte) -106);
        }
        ++field9388;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        ++field9386;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (!arg0) {
            this.method1(87, false);
        }
        if (super.field4525.field5435) {
            this.method3771(super.field4525.method2345((byte) 15), (byte) -111);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIIIII)V")
    public static final void method3769(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class529.field7314 != null && (~arg2 != -4 || ~class602.field8408.field4346 != ~arg1 || class602.field8408.field4299 != arg4)) {
            class216.method1372(class312.field4206, false, class529.field7314);
            class529.field7314 = null;
        }
        ++field9384;
        if (~arg2 == -4 && class529.field7314 == null) {
            class529.field7314 = class107.method586(arg4, 0, (byte) -128, class312.field4206, arg1, 0);
            if (class529.field7314 != null) {
                class602.field8408.field4299 = arg4;
                class602.field8408.field4346 = arg1;
                class602.field8408.method3557(class312.field4206, arg5 + 1);
            }
        }
        if (~arg2 == -4 && class529.field7314 == null) {
            method3769(true, -1, class602.field8408.field4313, arg3, -1, -3);
        } else {
            Container var7;
            if (class529.field7314 == null) {
                if (class190.field2630 != null) {
                    Insets var6 = class190.field2630.getInsets();
                    int var10001 = var6.right + var6.left;
                    class455.field5994 = class190.field2630.getSize().width - var10001;
                    class246.field3213 = class190.field2630.getSize().height - var6.top - var6.bottom;
                    var7 = class190.field2630;
                } else {
                    if (class516.field7178 != null) {
                        var7 = class516.field7178;
                    } else {
                        var7 = class27.field400;
                    }
                    class455.field5994 = var7.getSize().width;
                    class246.field3213 = var7.getSize().height;
                }
            } else {
                class246.field3213 = arg4;
                class455.field5994 = arg1;
                var7 = class529.field7314;
            }
            if (arg2 != 1) {
                class263.method1584(false);
            } else {
                class399.field5301 = class666.field9479;
                class60.field750 = class399.field5293;
                class646.field8936 = (-class666.field9479 + class455.field5994) / 2;
                class628.field8692 = 0;
            }
            if (class480.field6673 != class180.field2522) {
                boolean var10000;
                if (~class399.field5301 > -1025 && ~class60.field750 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (!arg0) {
                class583.field7996.setSize(class399.field5301, class60.field750);
                class146.field1963.method1052(class583.field7996);
                if (class190.field2630 != var7) {
                    class583.field7996.setLocation(class646.field8936, class628.field8692);
                } else {
                    Insets var8 = class190.field2630.getInsets();
                    class583.field7996.setLocation(class646.field8936 + var8.left, var8.top - -class628.field8692);
                }
            } else {
                class25.method145(0);
            }
            if (arg5 >= ~arg2) {
                class6.field59 = true;
            } else {
                class6.field59 = false;
            }
            if (class164.field2349 != -1) {
                class166.method1012(arg5 ^ -33, true);
            }
            if (class163.field2346 != null && class96.method543(-12756, class576.field7861)) {
                class616.method3406((byte) -126);
            }
            for (int var9 = 0; var9 < 100; ++var9) {
                class325.field4383[var9] = true;
            }
            class340.field4575 = true;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Z")
    public static final boolean method3770(int arg0, int arg1) {
        ++field9385;
        if (arg0 <= 84) {
            method3770(-35, 125);
        }
        return ~arg1 == -4 || ~arg1 == -8 || ~arg1 == -11;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class659() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        ++field9387;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (arg1) {
            this.method2(91, (class157) null, -95);
        }
        if (super.field4527.field1468) {
            int var4 = class649.field8968;
            int var5 = class316.field4237;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field4527.method670(false);
            this.method3771(var6, (byte) -112);
            for (int var8 = 0; ~var8 > ~class316.field4237; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class649.field8968 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class15.method97(var15 << 4, 4080);
                    var12[var14] = class15.method97(65280, var15) >> 4;
                    var11[var14] = class15.method97(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([[IB)V")
    private final void method3771(int[][] arg0, byte arg1) {
        ++field9389;
        int var3 = class649.field8968;
        int var4 = class316.field4237;
        int var5 = -66 / ((-63 - arg1) / 46);
        class568.method3145(0, arg0);
        class664.method3788(class29.field413, class326.field4386, 0, (byte) -71, 0);
        if (this.field9383 != null) {
            for (int var6 = 0; var6 < this.field9383.length; ++var6) {
                class296 var7 = this.field9383[var6];
                int var8 = var7.field3920;
                int var9 = var7.field3919;
                if (var8 >= 0) {
                    if (var9 < 0) {
                        var7.method134(var3, var4, -127);
                    } else {
                        var7.method135(var3, (byte) 104, var4);
                    }
                } else if (~var9 <= -1) {
                    var7.method136((byte) 122, var4, var3);
                }
            }
        }
    }
}
