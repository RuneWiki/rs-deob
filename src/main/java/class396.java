import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class396 extends class751 {

    @OriginalMember(owner = "client!fha", name = "B", descriptor = "I")
    public int field5612 = 4;

    @OriginalMember(owner = "client!fha", name = "D", descriptor = "I")
    public int field5614 = 0;

    @OriginalMember(owner = "client!fha", name = "F", descriptor = "[B")
    private byte[] field5616 = new byte[512];

    @OriginalMember(owner = "client!fha", name = "C", descriptor = "Z")
    public boolean field5613 = true;

    @OriginalMember(owner = "client!fha", name = "P", descriptor = "I")
    public int field5626 = 4;

    @OriginalMember(owner = "client!fha", name = "N", descriptor = "I")
    public int field5624 = 4;

    @OriginalMember(owner = "client!fha", name = "J", descriptor = "I")
    public int field5620 = 1638;

    @OriginalMember(owner = "client!fha", name = "E", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!fha", name = "G", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!fha", name = "K", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!fha", name = "L", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!fha", name = "M", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!fha", name = "O", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!fha", name = "Q", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!fha", name = "R", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!fha", name = "H", descriptor = "[S")
    private short[] field5618;

    @OriginalMember(owner = "client!fha", name = "I", descriptor = "[S")
    private short[] field5619;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I[ILkv;IZIII)Lbo;")
    public static final class759 method2415(int arg0, int[] arg1, class280 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 4095) {
            return null;
        } else {
            ++field5627;
            if (!arg2.field4218 && (!class315.method2071(-126, arg3) || !class315.method2071(-128, arg5))) {
                return !arg2.field4291 ? new class759(arg2, arg3, arg5, class89.method631((byte) -69, arg3), class89.method631((byte) 102, arg5), arg1) : new class759(arg2, 34037, arg3, arg5, arg4, arg1, arg0, arg7);
            } else {
                return new class759(arg2, 3553, arg3, arg5, arg4, arg1, arg0, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)V")
    public final void method1454(byte arg0) {
        ++field5625;
        this.field5616 = class406.method2442(-79, this.field5614);
        this.method2418((byte) 123);
        if (arg0 < 123) {
            this.method1454((byte) 72);
        }
        for (int var2 = this.field5626 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field5619[var2];
            if (var3 > 8) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field5626;
        }
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "()V")
    public class396() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(BIIIIII)I")
    private final int method2416(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5617;
        int var8 = arg1 >> 12;
        int var9 = var8 + 1;
        if (var9 >= arg3) {
            var9 = 0;
        }
        int var10 = var8 & 255;
        int var11 = arg1 & 4095;
        int var12 = 77 % ((arg0 - -17) / 44);
        int var13 = var9 & 255;
        int var14 = arg2 + -4096;
        int var15 = var11 - 4096;
        int var16 = this.field5616[arg4 + var10] & 3;
        int var17 = class711.field10011[var11];
        int var18;
        if (~var16 >= -2) {
            var18 = var16 == 0 ? arg2 + var11 : -var11 + arg2;
        } else {
            var18 = var16 != 2 ? -arg2 + -var11 : var11 - arg2;
        }
        int var19 = this.field5616[arg4 + var13] & 3;
        int var20;
        if (~var19 < -2) {
            var20 = ~var19 == -3 ? -arg2 + var15 : -arg2 + -var15;
        } else {
            var20 = ~var19 != -1 ? arg2 - var15 : arg2 + var15;
        }
        int var21 = 3 & this.field5616[arg5 + var10];
        int var22 = ((-var18 + var20) * var17 >> 12) + var18;
        int var23;
        if (var21 > 1) {
            var23 = ~var21 == -3 ? -var14 + var11 : -var11 - var14;
        } else {
            var23 = ~var21 != -1 ? -var11 + var14 : var11 - -var14;
        }
        int var24 = 3 & this.field5616[arg5 + var13];
        int var25;
        if (var24 <= 1) {
            var25 = var24 == 0 ? var14 + var15 : -var15 + var14;
        } else {
            var25 = var24 != 2 ? -var14 + -var15 : -var14 + var15;
        }
        int var26 = ((-var23 + var25) * var17 >> 12) + var23;
        return var22 - -((-var22 + var26) * arg6 >> 12);
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field5623;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field5612 = arg1.method842(2384);
                                }
                            } else {
                                this.field5624 = arg1.method842(2384);
                            }
                        } else {
                            this.field5614 = arg1.method842(2384);
                        }
                    } else {
                        this.field5624 = this.field5612 = arg1.method842(2384);
                    }
                } else {
                    this.field5620 = arg1.method838(true);
                    if (~this.field5620 > -1) {
                        this.field5619 = new short[this.field5626];
                        for (int var5 = 0; ~var5 > ~this.field5626; ++var5) {
                            this.field5619[var5] = (short) arg1.method838(true);
                        }
                    }
                }
            } else {
                this.field5626 = arg1.method842(2384);
            }
        } else {
            this.field5613 = arg1.method842(2384) == 1;
        }
        int var6 = 70 % ((arg0 - 25) / 63);
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I[IB)V")
    public final void method2417(int arg0, int[] arg1, byte arg2) {
        ++field5615;
        int var4 = class619.field8728[arg0] * this.field5612;
        int var5 = 31 / ((-3 - arg2) / 40);
        if (this.field5626 != 1) {
            short var6 = this.field5619[0];
            if (var6 > 8 || var6 < -8) {
                int var7 = this.field5618[0] << 12;
                int var8 = this.field5624 * var7 >> 12;
                int var9 = var4 * var7 >> 12;
                int var10 = this.field5612 * var7 >> 12;
                int var11 = var9 >> 12;
                int var12 = var11 + 1;
                if (~var10 >= ~var12) {
                    var12 = 0;
                }
                int var13 = var9 & 4095;
                int var14 = class711.field10011[var13];
                int var15 = 255 & this.field5616[255 & var12];
                int var16 = this.field5616[255 & var11] & 255;
                for (int var17 = 0; var17 < class673.field9452; ++var17) {
                    int var37 = class179.field2708[var17] * this.field5624;
                    int var38 = this.method2416((byte) 86, var7 * var37 >> 12, var13, var8, var16, var15, var14);
                    arg1[var17] = var6 * var38 >> 12;
                }
            }
            for (int var18 = 1; this.field5626 > var18; ++var18) {
                short var19 = this.field5619[var18];
                if (var19 > 8 || ~var19 > 7) {
                    int var20 = this.field5618[var18] << 12;
                    int var21 = var4 * var20 >> 12;
                    int var22 = this.field5612 * var20 >> 12;
                    int var23 = this.field5624 * var20 >> 12;
                    int var24 = var21 >> 12;
                    int var25 = var24 + 1;
                    int var26 = var21 & 4095;
                    if (var25 >= var22) {
                        var25 = 0;
                    }
                    int var27 = 255 & this.field5616[var24 & 255];
                    int var28 = class711.field10011[var26];
                    int var29 = 255 & this.field5616[var25 & 255];
                    if (this.field5613 && ~(this.field5626 - 1) == ~var18) {
                        for (int var30 = 0; var30 < class673.field9452; ++var30) {
                            int var31 = class179.field2708[var30] * this.field5624;
                            int var32 = this.method2416((byte) 28, var20 * var31 >> 12, var26, var23, var27, var29, var28);
                            int var33 = (var19 * var32 >> 12) + arg1[var30];
                            arg1[var30] = (var33 >> 1) + 2048;
                        }
                    } else {
                        for (int var34 = 0; class673.field9452 > var34; ++var34) {
                            int var35 = class179.field2708[var34] * this.field5624;
                            int var36 = this.method2416((byte) 58, var20 * var35 >> 12, var26, var23, var27, var29, var28);
                            arg1[var34] += var19 * var36 >> 12;
                        }
                    }
                }
            }
        } else {
            short var39 = this.field5619[0];
            int var40 = this.field5618[0] << 12;
            int var41 = this.field5612 * var40 >> 12;
            int var42 = var4 * var40 >> 12;
            int var43 = this.field5624 * var40 >> 12;
            int var44 = var42 >> 12;
            int var45 = var44 - -1;
            if (~var45 <= ~var41) {
                var45 = 0;
            }
            int var46 = var42 & 4095;
            int var47 = 255 & this.field5616[255 & var44];
            int var48 = class711.field10011[var46];
            int var49 = 255 & this.field5616[var45 & 255];
            if (!this.field5613) {
                for (int var50 = 0; ~var50 > ~class673.field9452; ++var50) {
                    int var51 = class179.field2708[var50] * this.field5624;
                    int var52 = this.method2416((byte) 106, var40 * var51 >> 12, var46, var43, var47, var49, var48);
                    arg1[var50] = var39 * var52 >> 12;
                }
            } else {
                for (int var53 = 0; ~var53 > ~class673.field9452; ++var53) {
                    int var54 = class179.field2708[var53] * this.field5624;
                    int var55 = this.method2416((byte) -123, var40 * var54 >> 12, var46, var43, var47, var49, var48);
                    int var56 = var39 * var55 >> 12;
                    arg1[var53] = (var56 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fha", name = "e", descriptor = "(B)V")
    private final void method2418(byte arg0) {
        ++field5628;
        if (~this.field5620 >= -1) {
            if (this.field5619 != null && this.field5619.length == this.field5626) {
                this.field5618 = new short[this.field5626];
                for (int var2 = 0; var2 < this.field5626; ++var2) {
                    this.field5618[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field5618 = new short[this.field5626];
            this.field5619 = new short[this.field5626];
            for (int var3 = 0; ~this.field5626 < ~var3; ++var3) {
                this.field5619[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field5620 / 4096.0F), (double) var3)));
                this.field5618[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 < 79) {
            method2415(15, (int[]) null, (class280) null, -52, false, -82, -106, -108);
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        ++field5622;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (arg1 != 4095) {
            this.field5619 = null;
        }
        if (super.field10405.field8923) {
            this.method2417(arg0, var3, (byte) 66);
        }
        return var3;
    }
}
