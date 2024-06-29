import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class105 extends class456 {

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    public int field1459 = 4;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public int field1462 = 1638;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "Z")
    public boolean field1465 = true;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public int field1461 = 0;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
    public int field1473 = 4;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "[B")
    private byte[] field1470 = new byte[512];

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "I")
    public int field1474 = 4;

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "Lct;")
    public static class285 field1471 = new class285(5, -1);

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "I")
    public static int field1478 = 0;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "Ltb;")
    public static class304 field1479 = new class304(16);

    @OriginalMember(owner = "client!ci", name = "eb", descriptor = "Z")
    public static boolean field1482 = true;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ci", name = "db", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ci", name = "cb", descriptor = "Lui;")
    public static class451 field1480;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "[S")
    private short[] field1472;

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "[S")
    private short[] field1475;

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "[[B")
    public static byte[][] field1477;

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class105() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "(I)V")
    public static void method779(int arg0) {
        field1477 = null;
        field1471 = null;
        field1479 = null;
        int var1 = -72 % ((arg0 - 11) / 49);
        field1480 = null;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        ++field1468;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            this.method780(7, arg1, var3);
        }
        return arg0 != -1 ? null : var3;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 != 55) {
            this.method653(false);
        }
        ++field1463;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field1473 = arg2.method2628(49152);
            } else {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field1474 = this.field1459 = arg2.method2628(49152);
                        return;
                    }
                    if (~arg0 == -5) {
                        this.field1461 = arg2.method2628(arg1 + 49097);
                        return;
                    }
                    if (~arg0 == -6) {
                        this.field1474 = arg2.method2628(49152);
                        return;
                    }
                    if (~arg0 == -7) {
                        this.field1459 = arg2.method2628(49152);
                        return;
                    }
                } else {
                    this.field1462 = arg2.method2634(arg1 + 68);
                    if (~this.field1462 > -1) {
                        this.field1472 = new short[this.field1473];
                        for (int var5 = 0; ~var5 > ~this.field1473; ++var5) {
                            this.field1472[var5] = (short) arg2.method2634(class76.method648(arg1, 52));
                        }
                        return;
                    }
                }
            }
        } else {
            this.field1465 = arg2.method2628(49152) == 1;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II[I)V")
    public final void method780(int arg0, int arg1, int[] arg2) {
        ++field1469;
        int var4 = class14.field206[arg1] * this.field1459;
        if (arg0 != 7) {
            field1480 = null;
        }
        if (~this.field1473 != -2) {
            short var5 = this.field1472[0];
            if (var5 > 8 || ~var5 > 7) {
                int var6 = this.field1475[0] << 12;
                int var7 = this.field1459 * var6 >> 12;
                int var8 = this.field1474 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 - -1;
                int var12 = var9 & 4095;
                if (~var11 <= ~var7) {
                    var11 = 0;
                }
                int var13 = 255 & this.field1470[255 & var10];
                int var14 = class480.field6762[var12];
                int var15 = this.field1470[var11 & 255] & 255;
                for (int var16 = 0; ~class156.field2169 < ~var16; ++var16) {
                    int var36 = class288.field4397[var16] * this.field1474;
                    int var37 = this.method781(0, var12, var8, var15, var14, var13, var6 * var36 >> 12);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; var17 < this.field1473; ++var17) {
                short var18 = this.field1472[var17];
                if (var18 > 8 || var18 < -8) {
                    int var19 = this.field1475[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field1459 * var19 >> 12;
                    int var22 = this.field1474 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var20 & 4095;
                    if (~var24 <= ~var21) {
                        var24 = 0;
                    }
                    int var26 = this.field1470[var23 & 255] & 255;
                    int var27 = class480.field6762[var25];
                    int var28 = 255 & this.field1470[var24 & 255];
                    if (this.field1465 && ~(this.field1473 - 1) == ~var17) {
                        for (int var29 = 0; ~class156.field2169 < ~var29; ++var29) {
                            int var30 = class288.field4397[var29] * this.field1474;
                            int var31 = this.method781(0, var25, var22, var28, var27, var26, var19 * var30 >> 12);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class156.field2169; ++var33) {
                            int var34 = class288.field4397[var33] * this.field1474;
                            int var35 = this.method781(0, var25, var22, var28, var27, var26, var19 * var34 >> 12);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field1475[0] << 12;
            short var39 = this.field1472[0];
            int var40 = this.field1459 * var38 >> 12;
            int var41 = this.field1474 * var38 >> 12;
            int var42 = var4 * var38 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 + 1;
            int var45 = var42 & 4095;
            if (var40 <= var44) {
                var44 = 0;
            }
            int var46 = 255 & this.field1470[var44 & 255];
            int var47 = this.field1470[255 & var43] & 255;
            int var48 = class480.field6762[var45];
            if (!this.field1465) {
                for (int var49 = 0; class156.field2169 > var49; ++var49) {
                    int var50 = class288.field4397[var49] * this.field1474;
                    int var51 = this.method781(0, var45, var41, var46, var48, var47, var38 * var50 >> 12);
                    arg2[var49] = var39 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~class156.field2169 < ~var52; ++var52) {
                    int var53 = class288.field4397[var52] * this.field1474;
                    int var54 = this.method781(0, var45, var41, var46, var48, var47, var38 * var53 >> 12);
                    int var55 = var39 * var54 >> 12;
                    arg2[var52] = 2048 - -(var55 >> 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIII)I")
    private final int method781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1466;
        int var8 = arg6 >> 12;
        int var9 = var8 - -1;
        if (arg0 != 0) {
            this.field1462 = 9;
        }
        if (~arg2 >= ~var9) {
            var9 = 0;
        }
        int var10 = arg6 & 4095;
        int var11 = var8 & 255;
        int var12 = var9 & 255;
        int var13 = var10 + -4096;
        int var14 = arg1 - 4096;
        int var15 = class480.field6762[var10];
        int var16 = 3 & this.field1470[var11 - -arg5];
        int var17;
        if (~var16 >= -2) {
            var17 = ~var16 == -1 ? var10 - -arg1 : -var10 + arg1;
        } else {
            var17 = ~var16 != -3 ? -var10 - arg1 : -arg1 + var10;
        }
        int var18 = this.field1470[var12 - -arg5] & 3;
        int var19;
        if (~var18 < -2) {
            var19 = var18 == 2 ? -arg1 + var13 : -var13 - arg1;
        } else {
            var19 = ~var18 != -1 ? -var13 + arg1 : arg1 + var13;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = 3 & this.field1470[var11 - -arg3];
        int var22;
        if (var21 > 1) {
            var22 = ~var21 != -3 ? -var10 + -var14 : var10 - var14;
        } else {
            var22 = var21 == 0 ? var10 + var14 : var14 - var10;
        }
        int var23 = 3 & this.field1470[arg3 + var12];
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var13 - -var14 : var14 - var13;
        } else {
            var24 = var23 != 2 ? -var13 - var14 : var13 - var14;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return ((var25 - var20) * arg4 >> 12) + var20;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public final void method653(boolean arg0) {
        this.field1470 = class72.method620(0, this.field1461);
        ++field1467;
        this.method782(-17);
        if (!arg0) {
            this.field1474 = 59;
        }
        for (int var2 = this.field1473 - 1; var2 >= 1; --var2) {
            short var3 = this.field1472[var2];
            if (~var3 < -9 || ~var3 > 7) {
                return;
            }
            --this.field1473;
        }
    }

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "(I)V")
    private final void method782(int arg0) {
        ++field1476;
        if (this.field1462 > 0) {
            this.field1472 = new short[this.field1473];
            this.field1475 = new short[this.field1473];
            for (int var2 = 0; ~this.field1473 < ~var2; ++var2) {
                this.field1472[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1462 / 4096.0F), (double) var2)));
                this.field1475[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field1472 != null && this.field1472.length == this.field1473) {
            this.field1475 = new short[this.field1473];
            for (int var3 = 0; this.field1473 > var3; ++var3) {
                this.field1475[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 > -13) {
            this.method780(-23, 102, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lps;")
    public static final class321 method783(Component arg0, boolean arg1, int arg2) {
        ++field1460;
        if (arg2 != 0) {
            method784((byte) -109, 4, (char) 65434);
        }
        return new class335(arg0, arg1);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BIC)I")
    public static final int method784(byte arg0, int arg1, char arg2) {
        int var3 = 87 % ((arg0 - -1) / 62);
        ++field1464;
        int var4 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var4 = (arg2 << 4) + 1;
        }
        if (~arg2 == -242 && arg1 == 0) {
            var4 = 1762;
        }
        return var4;
    }
}
