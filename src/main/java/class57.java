import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class57 extends class466 {

    @OriginalMember(owner = "client!qr", name = "F", descriptor = "I")
    private int field1008 = 1;

    @OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
    private int field1014 = 1;

    @OriginalMember(owner = "client!qr", name = "L", descriptor = "Lcba;")
    public static class471 field1013 = new class471(48, 3);

    @OriginalMember(owner = "client!qr", name = "G", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!qr", name = "I", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!qr", name = "J", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!qr", name = "K", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!qr", name = "N", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field1015;
        int[][] var3 = super.field6569.method828((byte) -123, arg0);
        if (arg1) {
            this.field1014 = 73;
        }
        if (super.field6569.field1934) {
            int var4 = this.field1014 + 1 + this.field1014;
            int var5 = 65536 / var4;
            int var6 = this.field1008 + 1 + this.field1008;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field1014 + arg0; this.field1014 + arg0 >= var9; ++var9) {
                int[][] var19 = this.method2719(0, class105.field1581 & var9, 5);
                int[][] var20 = new int[3][class312.field4207];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field1008; this.field1008 >= var27; ++var27) {
                    int var37 = class340.field4582 & var27;
                    var23 += var26[var37];
                    var22 += var25[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class312.field4207 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field1008 & class340.field4582;
                    int var33 = var21 - var24[var32];
                    int var34 = var22 - var25[var32];
                    ++var31;
                    int var35 = var23 - var26[var32];
                    int var36 = var31 - -this.field1008 & class340.field4582;
                    var21 = var24[var36] + var33;
                    var22 = var25[var36] + var34;
                    var23 = var26[var36] + var35;
                }
                var8[this.field1014 + var9 - arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class312.field4207 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
    public static void method515(byte arg0) {
        if (arg0 == -2) {
            field1013 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ldj;IIBLjava/awt/Component;)Lpr;")
    public static final class379 method516(class288 arg0, int arg1, int arg2, byte arg3, Component arg4) {
        ++field1011;
        if (class223.field3180 == 0) {
            throw new IllegalStateException();
        } else if (~arg1 <= -1 && ~arg1 > -3) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class379 var5 = (class379) Class.forName("sl").newInstance();
                var5.field5110 = arg2;
                var5.field5088 = new int[(class626.field9116 ? 2 : 1) * 256];
                if (arg3 <= 98) {
                    field1012 = -99;
                }
                var5.method2055(arg4);
                var5.field5109 = (arg2 & -1024) + 1024;
                if (var5.field5109 > 16384) {
                    var5.field5109 = 16384;
                }
                var5.method2053(var5.field5109);
                if (~class622.field8980 < -1 && class515.field7247 == null) {
                    class515.field7247 = new class346();
                    class515.field7247.field4647 = arg0;
                    arg0.method1848(-10, class515.field7247, class622.field8980);
                }
                if (class515.field7247 != null) {
                    if (class515.field7247.field4651[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class515.field7247.field4651[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class338 var6 = new class338(arg0, arg1);
                    var6.field5088 = new int[256 * (class626.field9116 ? 2 : 1)];
                    var6.field5110 = arg2;
                    var6.method2055(arg4);
                    var6.field5109 = 16384;
                    var6.method2053(var6.field5109);
                    if (~class622.field8980 < -1 && class515.field7247 == null) {
                        class515.field7247 = new class346();
                        class515.field7247.field4647 = arg0;
                        arg0.method1848(-10, class515.field7247, class622.field8980);
                    }
                    if (class515.field7247 != null) {
                        if (class515.field7247.field4651[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class515.field7247.field4651[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class379();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field1010;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (arg1 != 0) {
            this.field1014 = 35;
        }
        if (super.field6557.field1163) {
            int var4 = this.field1014 + this.field1014 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1008 - -this.field1008 - -1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field1014 + arg0; ~var9 >= ~(this.field1014 + arg0); ++var9) {
                int[] var13 = this.method2721(0, var9 & class105.field1581, 2);
                int[] var14 = new int[class312.field4207];
                int var15 = 0;
                for (int var16 = -this.field1008; ~this.field1008 <= ~var16; ++var16) {
                    var15 += var13[class340.field4582 & var16];
                }
                int var17 = 0;
                while (var17 < class312.field4207) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field1008 + var17 & class340.field4582];
                    ++var17;
                    var15 = var13[this.field1008 + var17 & class340.field4582] + var18;
                }
                var8[this.field1014 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; class312.field4207 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
    public class57() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 == -5062) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        super.field6565 = arg0.method110((byte) 35) == 1;
                    }
                } else {
                    this.field1014 = arg0.method110((byte) 110);
                }
            } else {
                this.field1008 = arg0.method110((byte) 42);
            }
            ++field1009;
        }
    }
}
