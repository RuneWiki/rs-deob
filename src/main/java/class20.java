import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class20 extends class40 {

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field264 = 0;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "Lpm;")
    public static class349 field259 = new class349("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "Ltj;")
    public static class108 field269;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "[I")
    public static int[] field268;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "[Lgm;")
    private class64[] field266;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
    public static void method111(boolean arg0) {
        field259 = null;
        field269 = null;
        if (!arg0) {
            field268 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[[I")
    public final int[][] method112(int arg0, int arg1) {
        if (arg0 != 1) {
            field259 = null;
        }
        ++field267;
        int[][] var3 = super.field555.method2070(0, arg1);
        if (super.field555.field4489) {
            int var4 = class410.field5886;
            int var5 = class440.field6297;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field555.method2068(arg0 + -1);
            this.method114((byte) 10, var6);
            for (int var8 = 0; ~var8 > ~class440.field6297; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class410.field5886; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class209.method1483(var15, 255) << 4;
                    var12[var14] = class209.method1483(65280, var15) >> 4;
                    var11[var14] = class209.method1483(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        ++field261;
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            this.method114((byte) 10, super.field551.method183(-124));
        }
        if (arg0 > -20) {
            method113(-99, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
    public static final void method113(int arg0, boolean arg1) {
        ++field265;
        byte[][] var2;
        if (!arg1) {
            var2 = class75.field991;
        } else {
            var2 = class295.field4271;
        }
        int var3 = class2.field12.length;
        if (arg0 != 23473) {
            method111(false);
        }
        for (int var4 = 0; ~var4 > ~var3; ++var4) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class199.field2844[var4] >> 8) * 64 + -class306.field4459;
                int var7 = (class199.field2844[var4] & 255) * 64 + -class342.field4959;
                class127.method769(arg0 + -23473);
                class51.method334(var5, class85.field1090, arg1, var6, class59.field786, var7, -83);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B[[I)V")
    private final void method114(byte arg0, int[][] arg1) {
        ++field262;
        int var3 = class410.field5886;
        int var4 = class440.field6297;
        class2.method3(arg1, -110);
        if (arg0 != 10) {
            field264 = 19;
        }
        class2.method2(class169.field2395, 0, class84.field1067, -1, 0);
        if (this.field266 != null) {
            for (int var5 = 0; var5 < this.field266.length; ++var5) {
                class64 var6 = this.field266[var5];
                int var7 = var6.field876;
                int var8 = var6.field883;
                if (var7 >= 0) {
                    if (~var8 > -1) {
                        var6.method169(var3, var4, arg0 ^ -128);
                    } else {
                        var6.method173(arg0 + 190, var4, var3);
                    }
                } else if (~var8 <= -1) {
                    var6.method168(114, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class20() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (arg1 >= 79) {
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    super.field550 = arg2.method837(true) == 1;
                }
            } else {
                this.field266 = new class64[arg2.method837(true)];
                for (int var4 = 0; ~var4 > ~this.field266.length; ++var4) {
                    int var5 = arg2.method837(true);
                    if (var5 != 0) {
                        if (var5 != 1) {
                            if (var5 != 2) {
                                if (var5 == 3) {
                                    this.field266[var4] = class323.method2141(true, arg2);
                                }
                            } else {
                                this.field266[var4] = class214.method1500((byte) -56, arg2);
                            }
                        } else {
                            this.field266[var4] = class131.method862((byte) 69, arg2);
                        }
                    } else {
                        this.field266[var4] = class332.method2174(-12155, arg2);
                    }
                }
            }
            ++field260;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
    public static final void method115(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 64) {
            field268 = null;
        }
        if (-arg3 + arg4 >= class408.field5789 && arg3 + arg4 <= class231.field3415 && class245.field3659 <= -arg3 + arg1 && class240.field3547 >= arg1 + arg3) {
            class246.method1715((byte) -115, arg1, arg4, arg3, arg2);
        } else {
            class369.method2370(arg1, arg4, (byte) 83, arg3, arg2);
        }
        ++field263;
    }
}
