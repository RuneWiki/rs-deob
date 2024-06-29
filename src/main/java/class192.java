import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class192 extends class23 {

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "I")
    private int field3593 = 0;

    @OriginalMember(owner = "client!rg", name = "db", descriptor = "[S")
    private short[] field3596 = new short[257];

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "Ldc;")
    public static class37 field3586 = class185.method1233((byte) 86, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "Ldc;")
    public static class37 field3590 = class185.method1233((byte) 86, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "Ldc;")
    private static class37 field3589 = class185.method1233((byte) 86, "Allocated memory");

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "Ldc;")
    public static class37 field3585 = field3589;

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "I")
    public static int field3592 = 0;

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "[[I")
    public static int[][] field3591 = new int[104][104];

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!rg", name = "bb", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!rg", name = "cb", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!rg", name = "eb", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!rg", name = "fb", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "[I")
    private int[] field3581;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "[I")
    private int[] field3587;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "[[I")
    private int[][] field3579;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
    public static void method1276(int arg0) {
        field3590 = null;
        if (arg0 < 49) {
            field3591 = null;
        }
        field3589 = null;
        field3586 = null;
        field3591 = null;
        field3585 = null;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        ++field3595;
        if (this.field3579 == null) {
            this.field3579 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field3579.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field3593 == 2) {
                this.method1277((byte) -115);
            }
            class74.method521(2);
            if (arg0 != -21746) {
                field3591 = null;
            }
            this.method1283(true);
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
    private final void method1277(byte arg0) {
        ++field3597;
        int[] var2 = this.field3579[0];
        int[] var3 = this.field3579[1];
        if (arg0 == -115) {
            int[] var4 = this.field3579[this.field3579.length + -1];
            int[] var5 = this.field3579[this.field3579.length + -2];
            this.field3581 = new int[] { var5[0] + var5[0] + -var4[0], var5[1] - (var4[1] + -var5[1]) };
            this.field3587 = new int[] { var2[0] - (var3[0] + -var2[0]), var2[1] - (-var2[1] - -var3[1]) };
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lwa;III)Z")
    public static final boolean method1278(class238 arg0, int arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method1547(arg3, arg1, arg2);
        ++field3583;
        if (var4 == null) {
            return false;
        } else {
            class35.method292(var4, 1);
            return true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        int[] var3 = super.field405.method1461(arg1, (byte) -104);
        ++field3598;
        if (super.field405.field4114) {
            int[] var4 = this.method162(arg1, 0, (byte) 18);
            for (int var5 = 0; class199.field3705 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3596[var6];
            }
        }
        return arg0 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ldc;ZZ)V")
    public static final void method1279(class37 arg0, boolean arg1, boolean arg2) {
        ++field3588;
        if (arg2) {
            field3586 = null;
        }
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class190.field3468.method622(arg0, 250);
        int var7 = 13 * class190.field3468.method624(arg0, 250);
        class48.method420(-var3 + var4, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, 0);
        class48.method413(var4 - var3, -var3 + var5, var3 + var6 - -var3, var3 + var3 + var7, 16777215);
        class190.field3468.method620(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class241.method1579(var3 + var3 + var7, var6 - -var3 + var3, -var3 + var4, -var3 + var5, true);
        if (arg1) {
            Canvas var8 = class225.field4158;
            try {
                Graphics var9 = var8.getGraphics();
                class224.field4151.method394(3, var9, 0, 0);
            } catch (Exception var10) {
                var8.repaint();
            }
        } else {
            class12.method76(var4, var6, var7, -717, var5);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class192() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)[I")
    private final int[] method1280(byte arg0, int arg1) {
        if (arg0 < 52) {
            this.method1283(false);
        }
        ++field3582;
        if (~arg1 > -1) {
            return this.field3587;
        } else {
            return ~this.field3579.length >= ~arg1 ? this.field3581 : this.field3579[arg1];
        }
    }

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)V")
    public static final void method1281(int arg0) {
        if (arg0 != -18065) {
            field3589 = null;
        }
        ++field3580;
        if (class166.field3172 != null) {
            class166.field3172.method557(false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        ++field3594;
        if (~arg1 == -1) {
            this.field3593 = arg0.method215(-1797813752);
            this.field3579 = new int[arg0.method215(arg2 ^ -1797813792)][2];
            for (int var4 = 0; var4 < this.field3579.length; ++var4) {
                this.field3579[var4][0] = arg0.method230((byte) -109);
                this.field3579[var4][1] = arg0.method230((byte) -98);
            }
        }
        if (arg2 != 1000) {
            this.method1277((byte) -22);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([Ldc;III)Ldc;")
    public static final class37 method1282(class37[] arg0, int arg1, int arg2, int arg3) {
        ++field3584;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; ++var5) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class44.field942;
            }
            var4 += arg0[arg2 + var5].field733;
        }
        if (arg1 != -32768) {
            field3590 = null;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; ~arg3 < ~var8; ++var8) {
            class37 var10 = arg0[arg2 + var8];
            class4.method35(var10.field743, 0, var6, var7, var10.field733);
            var7 += var10.field733;
        }
        class37 var9 = new class37();
        var9.field733 = var4;
        var9.field743 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V")
    private final void method1283(boolean arg0) {
        if (arg0) {
            int var2 = this.field3593;
            if (~var2 != -3) {
                if (~var2 == -2) {
                    for (int var3 = 0; var3 < 257; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; var5 < this.field3579.length + -1 && ~var4 <= ~this.field3579[var5][0]; ++var5) {
                        }
                        int[] var6 = this.field3579[var5 - 1];
                        int[] var7 = this.field3579[var5];
                        int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                        int var9 = -class120.field2144[255 & var8 >> 5] + 4096 >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                        if (var11 <= -32768) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field3596[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; ~var12 > -258; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; this.field3579.length - 1 > var14 && ~var13 <= ~this.field3579[var14][0]; ++var14) {
                        }
                        int[] var15 = this.field3579[var14];
                        int[] var16 = this.field3579[var14 + -1];
                        int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                        int var18 = -var17 + 4096;
                        int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                        if (~var19 >= 32767) {
                            var19 = -32767;
                        }
                        if (var19 >= 32768) {
                            var19 = 32767;
                        }
                        this.field3596[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; ~var20 > -258; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~(this.field3579.length + -1) < ~var22 && this.field3579[var22][0] <= var21; ++var22) {
                    }
                    int[] var23 = this.field3579[var22 + -1];
                    int[] var24 = this.field3579[var22];
                    int var25 = this.method1280((byte) 127, var22 + -2)[1];
                    int var26 = var24[1];
                    int var27 = -var25 + var26;
                    int var28 = var23[1];
                    int var29 = this.method1280((byte) 76, var22 + 1)[1];
                    int var30 = -var26 + var28 + var29 + -var25;
                    int var32 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                    int var33 = var32 * var32 >> 12;
                    int var34 = (var30 * var32 >> 12) * var33 >> 12;
                    int var35 = -var28 + -var30 + var25;
                    int var36 = var27 * var32 >> 12;
                    int var37 = var33 * var35 >> 12;
                    int var38 = var28 + var36 + var34 + var37;
                    if (var38 <= -32768) {
                        var38 = -32767;
                    }
                    if (var38 >= 32768) {
                        var38 = 32767;
                    }
                    this.field3596[var20] = (short) var38;
                }
            }
            ++field3578;
        }
    }
}
