import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class421 extends class194 {

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
    public int field5760 = 1638;

    @OriginalMember(owner = "client!nq", name = "U", descriptor = "I")
    public int field5768 = 4;

    @OriginalMember(owner = "client!nq", name = "R", descriptor = "I")
    public int field5765 = 4;

    @OriginalMember(owner = "client!nq", name = "Y", descriptor = "Z")
    public boolean field5772 = true;

    @OriginalMember(owner = "client!nq", name = "W", descriptor = "[B")
    private byte[] field5770 = new byte[512];

    @OriginalMember(owner = "client!nq", name = "X", descriptor = "I")
    public int field5771 = 0;

    @OriginalMember(owner = "client!nq", name = "ab", descriptor = "I")
    public int field5774 = 4;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "Z")
    public static boolean field5757 = false;

    @OriginalMember(owner = "client!nq", name = "db", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!nq", name = "O", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!nq", name = "S", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!nq", name = "T", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!nq", name = "bb", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!nq", name = "cb", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!nq", name = "Z", descriptor = "Lwo;")
    public static class285 field5773;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "[S")
    private short[] field5758;

    @OriginalMember(owner = "client!nq", name = "V", descriptor = "[S")
    private short[] field5769;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILuo;IIBI)V")
    public static final void method2578(int arg0, class118 arg1, int arg2, int arg3, byte arg4, int arg5) {
        arg1.method774(arg3, arg2, arg3 - -arg0, arg2 + arg5);
        ++field5756;
        arg1.method739((byte) 127, -16777216, arg3, arg0, arg2, arg5);
        if (~class342.field4655 <= -101) {
            float var6 = (float) class224.field2833 / (float) class224.field2816;
            int var7 = arg0;
            int var8 = arg5;
            if (!(var6 < 1.0F)) {
                var7 = (int) ((float) arg5 / var6);
            } else {
                var8 = (int) ((float) arg0 * var6);
            }
            int var9 = (arg0 - var7) / 2 + arg3;
            if (arg4 != -25) {
                method2579(true);
            }
            int var10 = (-var8 + arg5) / 2 + arg2;
            if (class41.field489 == null || arg0 != class41.field489.method230() || ~arg5 != ~class41.field489.method237()) {
                class224.method1375(class224.field2825, class224.field2815 - -class224.field2833, class224.field2825 + class224.field2816, class224.field2815, var9, var10, var7 + var9, var10 - -var8);
                class224.method1362(arg1);
                class41.field489 = arg1.method767(var9, var10, var7, var8, false);
            }
            class41.field489.method2659(var9, var10);
            int var11 = class296.field3948 * var7 / class224.field2816;
            int var12 = class57.field658 * var8 / class224.field2833;
            int var13 = class221.field2734 * var7 / class224.field2816 + var9;
            int var14 = -(class287.field3782 * var8 / class224.field2833) + var10 + -var12 - -var8;
            int var15 = -1996554240;
            if (~class31.field356 == -2) {
                var15 = -1996488705;
            }
            arg1.method789(var13, var14, var11, var12, var15, 1);
            arg1.method748(var13, var14, var11, var12, var15, 0);
            if (class76.field943 > 0) {
                int var16;
                if (class390.field5325 <= 50) {
                    var16 = class390.field5325 * 5;
                } else {
                    var16 = -(class390.field5325 * 5) + 500;
                }
                for (class278 var17 = (class278) class224.field2806.method1690((byte) -109); var17 != null; var17 = (class278) class224.field2806.method1699((byte) 41)) {
                    class222 var18 = class339.method2178(false, var17.field3596);
                    if (class288.method1839(64, var18)) {
                        if (class42.field501 == var17.field3596) {
                            int var19 = var9 - -(var17.field3601 * var7 / class224.field2816);
                            int var20 = (class224.field2833 - var17.field3593) * var8 / class224.field2833 + var10;
                            arg1.method739((byte) -127, var16 << 24 | 16776960, var19 - 2, 4, var20 - 2, 4);
                        } else if (~class373.field5052 != 0 && class373.field5052 == var18.field2784) {
                            int var21 = var17.field3601 * var7 / class224.field2816 + var9;
                            int var22 = (-var17.field3593 + class224.field2833) * var8 / class224.field2833 + var10;
                            arg1.method739((byte) 89, var16 << 24 | 16776960, var21 + -2, 4, var22 + -2, 4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
    public class421() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V")
    public static final void method2579(boolean arg0) {
        class62.field764 = null;
        ++field5763;
        class391.method2431((byte) -63, 0, 0, -1, class366.field4983, 0, class28.field315, class39.field457, 0);
        if (class62.field764 != null) {
            class201.method1239(0, -1412584499, class28.field315, class137.field1559.field6440, class62.field764, -97, class39.field456, 0, class39.field457, class411.field5668);
            class62.field764 = null;
        }
        if (arg0) {
            field5757 = false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field5768 = arg2.method1563(-128);
                                }
                            } else {
                                this.field5765 = arg2.method1563(-128);
                            }
                        } else {
                            this.field5771 = arg2.method1563(-128);
                        }
                    } else {
                        this.field5765 = this.field5768 = arg2.method1563(-128);
                    }
                } else {
                    this.field5760 = arg2.method1582(false);
                    if (this.field5760 < 0) {
                        this.field5769 = new short[this.field5774];
                        for (int var5 = 0; ~var5 > ~this.field5774; ++var5) {
                            this.field5769[var5] = (short) arg2.method1582(false);
                        }
                    }
                }
            } else {
                this.field5774 = arg2.method1563(-128);
            }
        } else {
            this.field5772 = arg2.method1563(-128) == 1;
        }
        ++field5776;
        int var6 = 97 % ((arg1 - 52) / 61);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([IBI)V")
    public final void method2580(int[] arg0, byte arg1, int arg2) {
        ++field5759;
        int var4 = class249.field3283[arg2] * this.field5768;
        if (arg1 > 36) {
            if (this.field5774 != 1) {
                short var5 = this.field5769[0];
                if (var5 > 8 || var5 < -8) {
                    int var6 = this.field5758[0] << 12;
                    int var7 = this.field5768 * var6 >> 12;
                    int var8 = this.field5765 * var6 >> 12;
                    int var9 = var4 * var6 >> 12;
                    int var10 = var9 >> 12;
                    int var11 = var10 + 1;
                    int var12 = var9 & 4095;
                    if (var11 >= var7) {
                        var11 = 0;
                    }
                    int var13 = class204.field2401[var12];
                    int var14 = this.field5770[var11 & 255] & 255;
                    int var15 = 255 & this.field5770[255 & var10];
                    for (int var16 = 0; ~class138.field1579 < ~var16; ++var16) {
                        int var36 = class277.field3585[var16] * this.field5765;
                        int var37 = this.method2582(1460471788, var8, var13, var6 * var36 >> 12, var14, var12, var15);
                        arg0[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; this.field5774 > var17; ++var17) {
                    short var18 = this.field5769[var17];
                    if (~var18 < -9 || ~var18 > 7) {
                        int var19 = this.field5758[var17] << 12;
                        int var20 = this.field5765 * var19 >> 12;
                        int var21 = this.field5768 * var19 >> 12;
                        int var22 = var4 * var19 >> 12;
                        int var23 = var22 >> 12;
                        int var24 = var23 + 1;
                        if (~var21 >= ~var24) {
                            var24 = 0;
                        }
                        int var25 = var22 & 4095;
                        int var26 = 255 & this.field5770[var24 & 255];
                        int var27 = 255 & this.field5770[var23 & 255];
                        int var28 = class204.field2401[var25];
                        if (this.field5772 && this.field5774 + -1 == var17) {
                            for (int var29 = 0; class138.field1579 > var29; ++var29) {
                                int var30 = class277.field3585[var29] * this.field5765;
                                int var31 = this.method2582(1460471788, var20, var28, var19 * var30 >> 12, var26, var25, var27);
                                int var32 = (var18 * var31 >> 12) + arg0[var29];
                                arg0[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~class138.field1579; ++var33) {
                                int var34 = class277.field3585[var33] * this.field5765;
                                int var35 = this.method2582(1460471788, var20, var28, var19 * var34 >> 12, var26, var25, var27);
                                arg0[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field5758[0] << 12;
                short var39 = this.field5769[0];
                int var40 = var4 * var38 >> 12;
                int var41 = this.field5768 * var38 >> 12;
                int var42 = this.field5765 * var38 >> 12;
                int var43 = var40 >> 12;
                int var44 = var43 + 1;
                if (var41 <= var44) {
                    var44 = 0;
                }
                int var45 = var40 & 4095;
                int var46 = 255 & this.field5770[255 & var44];
                int var47 = class204.field2401[var45];
                int var48 = 255 & this.field5770[255 & var43];
                if (!this.field5772) {
                    for (int var49 = 0; ~class138.field1579 < ~var49; ++var49) {
                        int var50 = class277.field3585[var49] * this.field5765;
                        int var51 = this.method2582(1460471788, var42, var47, var38 * var50 >> 12, var46, var45, var48);
                        arg0[var49] = var39 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; class138.field1579 > var52; ++var52) {
                        int var53 = class277.field3585[var52] * this.field5765;
                        int var54 = this.method2582(1460471788, var42, var47, var38 * var53 >> 12, var46, var45, var48);
                        int var55 = var39 * var54 >> 12;
                        arg0[var52] = (var55 >> 1) + 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field5764;
        int[] var3 = super.field2292.method1781(arg0, false);
        int var4 = 3 % ((arg1 - 57) / 46);
        if (super.field2292.field3708) {
            this.method2580(var3, (byte) 59, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILaq;)V")
    public static final void method2581(int arg0, class453 arg1) {
        if (arg0 >= -23) {
            method2583((byte) 35);
        }
        ++field5775;
        class453 var2 = class389.method2417(arg1, 124);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class39.field457;
            var4 = class28.field315;
        } else {
            var3 = var2.field6377;
            var4 = var2.field6432;
        }
        class14.method83(false, (byte) -80, var4, var3, arg1);
        class106.method641(arg1, var3, 0, var4);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIII)I")
    private final int method2582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5767;
        if (arg0 != 1460471788) {
            this.field5768 = 35;
        }
        int var8 = arg3 >> 12;
        int var9 = var8 - -1;
        int var10 = var8 & 255;
        if (~var9 <= ~arg1) {
            var9 = 0;
        }
        int var11 = arg3 & 4095;
        int var12 = arg5 + -4096;
        int var13 = var9 & 255;
        int var14 = var11 + -4096;
        int var15 = 3 & this.field5770[arg6 + var10];
        int var16 = class204.field2401[var11];
        int var17;
        if (~var15 < -2) {
            var17 = ~var15 == -3 ? var11 - arg5 : -arg5 + -var11;
        } else {
            var17 = var15 != 0 ? -var11 + arg5 : arg5 + var11;
        }
        int var18 = 3 & this.field5770[arg6 + var13];
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg5 + var14 : arg5 - var14;
        } else {
            var19 = ~var18 == -3 ? var14 - arg5 : -arg5 + -var14;
        }
        int var20 = ((-var17 + var19) * var16 >> 12) + var17;
        int var21 = this.field5770[arg4 + var10] & 3;
        int var22;
        if (var21 <= 1) {
            var22 = ~var21 == -1 ? var11 + var12 : -var11 + var12;
        } else {
            var22 = ~var21 == -3 ? var11 - var12 : -var11 + -var12;
        }
        int var23 = 3 & this.field5770[arg4 + var13];
        int var24;
        if (~var23 >= -2) {
            var24 = ~var23 != -1 ? -var14 + var12 : var14 - -var12;
        } else {
            var24 = ~var23 != -3 ? -var12 + -var14 : -var12 + var14;
        }
        int var25 = ((var24 - var22) * var16 >> 12) + var22;
        return ((-var20 + var25) * arg2 >> 12) + var20;
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
    public final void method280(int arg0) {
        this.field5770 = class428.method2613(this.field5771, 511);
        ++field5766;
        this.method2584(0);
        int var2 = -9 / ((28 - arg0) / 63);
        for (int var3 = this.field5774 + -1; ~var3 <= -2; --var3) {
            short var4 = this.field5769[var3];
            if (var4 > 8) {
                return;
            }
            if (var4 < -8) {
                return;
            }
            --this.field5774;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
    public static void method2583(byte arg0) {
        field5773 = null;
        if (arg0 <= 92) {
            method2581(126, (class453) null);
        }
    }

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)V")
    private final void method2584(int arg0) {
        ++field5762;
        if (this.field5760 <= arg0) {
            if (this.field5769 != null && ~this.field5769.length == ~this.field5774) {
                this.field5758 = new short[this.field5774];
                for (int var2 = 0; ~var2 > ~this.field5774; ++var2) {
                    this.field5758[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field5769 = new short[this.field5774];
            this.field5758 = new short[this.field5774];
            for (int var3 = 0; ~this.field5774 < ~var3; ++var3) {
                this.field5769[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field5760 / 4096.0F), (double) var3)));
                this.field5758[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    static {
        new class72("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field5777 = 99;
    }
}
