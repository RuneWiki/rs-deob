import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class259 extends class334 {

    @OriginalMember(owner = "client!dga", name = "L", descriptor = "Lcp;")
    public static class271 field3674 = new class271();

    @OriginalMember(owner = "client!dga", name = "O", descriptor = "F")
    public static float field3677;

    @OriginalMember(owner = "client!dga", name = "E", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!dga", name = "F", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!dga", name = "G", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!dga", name = "H", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!dga", name = "I", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!dga", name = "K", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!dga", name = "M", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!dga", name = "N", descriptor = "Ljava/awt/Frame;")
    public static Frame field3676;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B[S)[S", line = 5)
    public static final short[] method1686(byte arg0, short[] arg1) {
        ++field3669;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = -124 % ((arg0 - -9) / 62);
            short[] var3 = new short[arg1.length];
            class171.method1266(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IILcea;Ljava/awt/Component;B)Liv;", line = 22)
    public static final class635 method1687(int arg0, int arg1, class111 arg2, Component arg3, byte arg4) {
        ++field3670;
        if (~class702.field9843 == -1) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (~arg0 > -257) {
                arg0 = 256;
            }
            try {
                int var5 = -62 / ((29 - arg4) / 59);
                class635 var6 = (class635) Class.forName("bj").newInstance();
                var6.field8966 = new int[(!class209.field3076 ? 1 : 2) * 256];
                var6.field8976 = arg0;
                var6.method2283(arg3);
                var6.field8984 = (-1024 & arg0) + 1024;
                if (~var6.field8984 < -16385) {
                    var6.field8984 = 16384;
                }
                var6.method2282(var6.field8984);
                if (class619.field8755 > 0 && class329.field4687 == null) {
                    class329.field4687 = new class493();
                    class329.field4687.field6760 = arg2;
                    arg2.method918(-6, class619.field8755, class329.field4687);
                }
                if (class329.field4687 != null) {
                    if (class329.field4687.field6761[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class329.field4687.field6761[arg1] = var6;
                }
                return var6;
            } catch (Throwable var9) {
                try {
                    class378 var7 = new class378(arg2, arg1);
                    var7.field8976 = arg0;
                    var7.field8966 = new int[(!class209.field3076 ? 1 : 2) * 256];
                    var7.method2283(arg3);
                    var7.field8984 = 16384;
                    var7.method2282(var7.field8984);
                    if (class619.field8755 > 0 && class329.field4687 == null) {
                        class329.field4687 = new class493();
                        class329.field4687.field6760 = arg2;
                        arg2.method918(-6, class619.field8755, class329.field4687);
                    }
                    if (class329.field4687 != null) {
                        if (class329.field4687.field6761[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class329.field4687.field6761[arg1] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class635();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(BZ)V", line = 106)
    public static final void method1688(byte arg0, boolean arg1) {
        if (arg0 == 7) {
            ++field3668;
            int var2 = class86.field1280;
            int var3 = class424.field5898;
            if (arg1 && class765.field10581) {
                var2 <<= 1;
                var3 = -var2;
            }
            class686.field9702.method484(var3, var2);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILus;I)V", line = 127)
    public static final void method1689(int arg0, class341 arg1, int arg2) {
        if (class272.field3827) {
            class272.field3827 = false;
            arg0 = 0;
        }
        ++field3675;
        if (arg2 == 0) {
            if (class174.field2634 == null || !class174.field2634.method2099(arg1, (byte) 95)) {
                class174.field2634 = arg1;
                class24.field271 = class337.method2062(false);
                class760.field10527 = arg0;
                class277.field3998 = arg0;
                if (~class277.field3998 == -1) {
                    class711.method3961(-1);
                    return;
                }
                class27.field289 = class271.field3810;
                class176.field2655 = class33.field405;
                class359.field5082 = class747.field10386;
                class659.field9289 = class681.field9660;
                class184.field2800 = class163.field2506;
                class346.field4932 = class397.field5482;
                class393.field5462 = class469.field6391;
                class544.field7551 = class762.field10564;
                class742.field10275 = class515.field7099;
                class609.field8656 = class379.field5319;
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZI)[[I", line = 172)
    public final int[][] method283(boolean arg0, int arg1) {
        ++field3672;
        if (!arg0) {
            method1687(-12, 44, (class111) null, (Component) null, (byte) -20);
        }
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (super.field4734.field425) {
            int[] var4 = this.method2052(2, 0, arg1);
            int[][] var5 = this.method2053(1, 0, arg1);
            int[][] var6 = this.method2053(1, 1, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class439.field6099; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 == -1) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IZLol;)V", line = 253)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg0 == 0) {
            super.field4747 = ~arg2.method2557(14929) == -2;
        }
        if (arg1) {
            method1687(12, 49, (class111) null, (Component) null, (byte) 38);
        }
        ++field3673;
    }

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "(I)V", line = 267)
    public static void method1690(int arg0) {
        field3674 = null;
        if (arg0 != -1) {
            method1687(-15, 106, (class111) null, (Component) null, (byte) -68);
        }
        field3676 = null;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "()V", line = 278)
    public class259() {
        super(3, false);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)[I", line = 284)
    public final int[] method28(int arg0, int arg1) {
        ++field3671;
        int[] var3 = super.field4743.method1027((byte) -95, arg0);
        if (arg1 != -22563988) {
            return null;
        } else {
            if (super.field4743.field1993) {
                int[] var4 = this.method2052(0, arg1 + 22563988, arg0);
                int[] var5 = this.method2052(1, arg1 ^ -22563988, arg0);
                int[] var6 = this.method2052(2, arg1 + 22563988, arg0);
                for (int var7 = 0; ~class439.field6099 < ~var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 != 4096) {
                        if (~var8 == -1) {
                            var3[var7] = var5[var7];
                        } else {
                            var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }
}
