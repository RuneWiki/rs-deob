import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class343 extends class371 {

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
    private int field5007 = 4096;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "[I")
    private int[] field5010 = new int[3];

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    private int field5012 = 4096;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    private int field5016 = 4096;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    private int field5018 = 409;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "Lwca;")
    public static class311 field5011 = null;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "[F")
    public static float[] field5009 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        int var4 = -4 % ((arg1 - -15) / 39);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            int var6 = arg2.method2601(124);
                            this.field5010[0] = class637.method3693(var6, 16711680) << 4;
                            this.field5010[2] = class637.method3693(var6, 255) >> 12;
                            this.field5010[1] = class637.method3693(4080, var6 >> 4);
                        }
                    } else {
                        this.field5016 = arg2.method2620(49);
                    }
                } else {
                    this.field5007 = arg2.method2620(118);
                }
            } else {
                this.field5012 = arg2.method2620(51);
            }
        } else {
            this.field5018 = arg2.method2620(64);
        }
        ++field5017;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class343() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([BIIIII)Z")
    public static final boolean method2122(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5014;
        boolean var6 = true;
        if (arg5 != -23) {
            return false;
        } else {
            class428 var7 = new class428(arg0);
            int var8 = -1;
            label72: while (true) {
                int var9 = var7.method2602(-128);
                if (~var9 == -1) {
                    return var6;
                }
                var8 += var9;
                int var10 = 0;
                boolean var11 = false;
                while (true) {
                    int var15;
                    class158 var18;
                    do {
                        int var16;
                        int var17;
                        do {
                            do {
                                do {
                                    do {
                                        while (var11) {
                                            int var19 = var7.method2573(-14319);
                                            if (var19 == 0) {
                                                continue label72;
                                            }
                                            var7.method2561((byte) 107);
                                        }
                                        int var12 = var7.method2573(-14319);
                                        if (var12 == 0) {
                                            continue label72;
                                        }
                                        var10 += var12 + -1;
                                        int var13 = 63 & var10;
                                        int var14 = (4057 & var10) >> 6;
                                        var15 = var7.method2561((byte) -109) >> 2;
                                        var16 = arg3 + var14;
                                        var17 = var13 - -arg4;
                                    } while (var16 <= 0);
                                } while (~var17 >= -1);
                            } while (var16 >= arg1 + -1);
                        } while (var17 >= arg2 - 1);
                        var18 = class312.field4690.method2004(false, var8);
                    } while (~var15 == -23 && !class94.field1158.field268 && var18.field2028 == 0 && ~var18.field2059 != -2 && !var18.field2036);
                    var11 = true;
                    if (!var18.method914((byte) 67)) {
                        var6 = false;
                        ++class608.field8960;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        ++field5008;
        int[][] var3 = super.field5364.method3064(1, arg1);
        if (arg0 != 36) {
            method2123(71);
        }
        if (super.field5364.field7632) {
            int[][] var4 = this.method2263((byte) -76, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class41.field455; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field5010[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field5018) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field5010[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field5018) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field5010[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field5018) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field5016 * var12 >> 12;
                            var9[var11] = this.field5007 * var14 >> 12;
                            var10[var11] = this.field5012 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V")
    public static void method2123(int arg0) {
        field5011 = null;
        field5009 = null;
        if (arg0 != 0) {
            field5009 = null;
        }
    }
}
