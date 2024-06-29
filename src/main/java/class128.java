import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class128 extends class175 {

    @OriginalMember(owner = "client!oda", name = "E", descriptor = "I")
    public int field1751 = 1638;

    @OriginalMember(owner = "client!oda", name = "F", descriptor = "I")
    public int field1752 = 4;

    @OriginalMember(owner = "client!oda", name = "N", descriptor = "Z")
    public boolean field1760 = true;

    @OriginalMember(owner = "client!oda", name = "M", descriptor = "I")
    public int field1759 = 0;

    @OriginalMember(owner = "client!oda", name = "P", descriptor = "I")
    public int field1761 = 4;

    @OriginalMember(owner = "client!oda", name = "S", descriptor = "I")
    public int field1764 = 4;

    @OriginalMember(owner = "client!oda", name = "U", descriptor = "[B")
    private byte[] field1766 = new byte[512];

    @OriginalMember(owner = "client!oda", name = "R", descriptor = "Ljb;")
    public static class519 field1763 = new class519(130, 6);

    @OriginalMember(owner = "client!oda", name = "V", descriptor = "I")
    public static int field1767 = 0;

    @OriginalMember(owner = "client!oda", name = "W", descriptor = "J")
    public static long field1768 = 0L;

    @OriginalMember(owner = "client!oda", name = "G", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!oda", name = "H", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!oda", name = "I", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!oda", name = "K", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!oda", name = "L", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!oda", name = "Q", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!oda", name = "J", descriptor = "[S")
    private short[] field1756;

    @OriginalMember(owner = "client!oda", name = "T", descriptor = "[S")
    private short[] field1765;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIZIIII)I")
    private final int method907(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1754;
        int var8 = arg4 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        int var11 = arg4 & 4095;
        if (var9 >= arg6) {
            var9 = 0;
        }
        int var12 = var11 + -4096;
        int var13 = var9 & 255;
        int var14 = arg3 + -4096;
        if (!arg2) {
            return -17;
        } else {
            int var15 = class80.field1100[var11];
            int var16 = this.field1766[arg0 + var10] & 3;
            int var17;
            if (var16 > 1) {
                var17 = var16 != 2 ? -arg3 + -var11 : -arg3 + var11;
            } else {
                var17 = var16 == 0 ? arg3 + var11 : -var11 + arg3;
            }
            int var18 = this.field1766[arg0 + var13] & 3;
            int var19;
            if (~var18 >= -2) {
                var19 = var18 == 0 ? var12 - -arg3 : arg3 - var12;
            } else {
                var19 = var18 != 2 ? -arg3 + -var12 : -arg3 + var12;
            }
            int var20 = this.field1766[arg1 + var10] & 3;
            int var21 = ((-var17 + var19) * var15 >> 12) + var17;
            int var22;
            if (var20 > 1) {
                var22 = var20 == 2 ? -var14 + var11 : -var11 + -var14;
            } else {
                var22 = var20 != 0 ? -var11 + var14 : var11 + var14;
            }
            int var23 = this.field1766[var13 - -arg1] & 3;
            int var24;
            if (var23 <= 1) {
                var24 = ~var23 != -1 ? -var12 + var14 : var12 - -var14;
            } else {
                var24 = var23 == 2 ? -var14 + var12 : -var12 + -var14;
            }
            int var25 = ((var24 - var22) * var15 >> 12) + var22;
            return ((var25 - var21) * arg5 >> 12) + var21;
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
    public class128() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "(I)V")
    private final void method908(int arg0) {
        ++field1757;
        if (arg0 >= -120) {
            this.field1759 = -118;
        }
        if (this.field1751 <= 0) {
            if (this.field1756 != null && ~this.field1756.length == ~this.field1752) {
                this.field1765 = new short[this.field1752];
                for (int var2 = 0; this.field1752 > var2; ++var2) {
                    this.field1765[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field1765 = new short[this.field1752];
            this.field1756 = new short[this.field1752];
            for (int var3 = 0; ~var3 > ~this.field1752; ++var3) {
                this.field1756[var3] = (short) ((int) (Math.pow((double) ((float) this.field1751 / 4096.0F), (double) var3) * 4096.0D));
                this.field1765[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        ++field1755;
        if (arg0 != -8) {
            this.method47(true, -28);
        }
        this.field1766 = class703.method3907(this.field1759, (byte) 112);
        this.method908(-121);
        for (int var2 = this.field1752 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field1756[var2];
            if (var3 > 8) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field1752;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (arg2) {
            this.field1766 = null;
        }
        ++field1762;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field1752 = arg1.method1731((byte) 64);
            } else {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field1764 = this.field1761 = arg1.method1731((byte) 64);
                        return;
                    }
                    if (arg0 == 4) {
                        this.field1759 = arg1.method1731((byte) 64);
                        return;
                    }
                    if (~arg0 == -6) {
                        this.field1764 = arg1.method1731((byte) 64);
                        return;
                    }
                    if (arg0 == 6) {
                        this.field1761 = arg1.method1731((byte) 64);
                        return;
                    }
                } else {
                    this.field1751 = arg1.method1695(423951304);
                    if (~this.field1751 > -1) {
                        this.field1756 = new short[this.field1752];
                        for (int var5 = 0; this.field1752 > var5; ++var5) {
                            this.field1756[var5] = (short) arg1.method1695(423951304);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field1760 = arg1.method1731((byte) 64) == 1;
        }
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(Z)V")
    public static void method909(boolean arg0) {
        if (!arg0) {
            field1767 = 84;
        }
        field1763 = null;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(II[I)V")
    public final void method910(int arg0, int arg1, int[] arg2) {
        ++field1758;
        int var4 = class456.field6536[arg1] * this.field1761;
        if (arg0 == 8) {
            if (~this.field1752 != -2) {
                short var5 = this.field1756[0];
                if (var5 > 8 || var5 < -8) {
                    int var6 = this.field1765[0] << 12;
                    int var7 = this.field1761 * var6 >> 12;
                    int var8 = var4 * var6 >> 12;
                    int var9 = this.field1764 * var6 >> 12;
                    int var10 = var8 >> 12;
                    int var11 = var10 + 1;
                    if (var11 >= var7) {
                        var11 = 0;
                    }
                    int var12 = var8 & 4095;
                    int var13 = 255 & this.field1766[var10 & 255];
                    int var14 = this.field1766[255 & var11] & 255;
                    int var15 = class80.field1100[var12];
                    for (int var16 = 0; ~class598.field8136 < ~var16; ++var16) {
                        int var36 = class693.field9221[var16] * this.field1764;
                        int var37 = this.method907(var13, var14, true, var12, var6 * var36 >> 12, var15, var9);
                        arg2[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~this.field1752 < ~var17; ++var17) {
                    short var18 = this.field1756[var17];
                    if (~var18 < -9 || var18 < -8) {
                        int var19 = this.field1765[var17] << 12;
                        int var20 = this.field1761 * var19 >> 12;
                        int var21 = var4 * var19 >> 12;
                        int var22 = this.field1764 * var19 >> 12;
                        int var23 = var21 >> 12;
                        int var24 = var23 + 1;
                        int var25 = var21 & 4095;
                        if (~var20 >= ~var24) {
                            var24 = 0;
                        }
                        int var26 = 255 & this.field1766[255 & var24];
                        int var27 = class80.field1100[var25];
                        int var28 = 255 & this.field1766[var23 & 255];
                        if (this.field1760 && this.field1752 + -1 == var17) {
                            for (int var29 = 0; ~class598.field8136 < ~var29; ++var29) {
                                int var30 = class693.field9221[var29] * this.field1764;
                                int var31 = this.method907(var28, var26, true, var25, var19 * var30 >> 12, var27, var22);
                                int var32 = (var18 * var31 >> 12) + arg2[var29];
                                arg2[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; class598.field8136 > var33; ++var33) {
                                int var34 = class693.field9221[var33] * this.field1764;
                                int var35 = this.method907(var28, var26, true, var25, var19 * var34 >> 12, var27, var22);
                                arg2[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field1756[0];
                int var39 = this.field1765[0] << 12;
                int var40 = this.field1761 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = this.field1764 * var39 >> 12;
                int var43 = var41 >> 12;
                int var44 = var43 + 1;
                int var45 = var41 & 4095;
                if (var40 <= var44) {
                    var44 = 0;
                }
                int var46 = this.field1766[255 & var43] & 255;
                int var47 = class80.field1100[var45];
                int var48 = 255 & this.field1766[var44 & 255];
                if (!this.field1760) {
                    for (int var49 = 0; ~class598.field8136 < ~var49; ++var49) {
                        int var50 = class693.field9221[var49] * this.field1764;
                        int var51 = this.method907(var46, var48, true, var45, var39 * var50 >> 12, var47, var42);
                        arg2[var49] = var38 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; ~var52 > ~class598.field8136; ++var52) {
                        int var53 = class693.field9221[var52] * this.field1764;
                        int var54 = this.method907(var46, var48, true, var45, var39 * var53 >> 12, var47, var42);
                        int var55 = var38 * var54 >> 12;
                        arg2[var52] = (var55 >> 1) + 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field1753;
        if (!arg0) {
            this.method910(49, 91, (int[]) null);
        }
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            this.method910(8, arg1, var3);
        }
        return var3;
    }
}
