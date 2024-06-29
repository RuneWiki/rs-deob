import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class288 {

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    private int field32 = 4;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    private int field26 = 0;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "Z")
    private boolean field34 = true;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "[B")
    private byte[] field40 = new byte[512];

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    private int field45 = 4;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    private int field44 = 1638;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    private int field27 = 4;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "[I")
    public static int[] field41 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field43 = 0;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "[I")
    public static int[] field36 = new int[500];

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field48 = "yellow:";

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "Ljj;")
    public static class134 field39;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field35;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "[S")
    private short[] field30;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "[S")
    private short[] field33;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        if (arg0 == -125) {
            this.field40 = class184.method1262(true, this.field26);
            ++field38;
            this.method25(-106);
            for (int var2 = this.field32 + -1; ~var2 <= -2; --var2) {
                short var3 = this.field30[var2];
                if (~var3 < -9 || var3 < -8) {
                    return;
                }
                --this.field32;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V")
    public static final void method17(int arg0, byte arg1) {
        ++field25;
        int var2 = 49 % ((arg1 - 45) / 63);
        class16.field186 = new int[arg0];
        class164.field2664 = new int[arg0];
        class160.field2604 = new int[arg0];
        class8.field110 = new int[arg0];
        class129.field2163 = new int[arg0];
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    public static void method18(int arg0) {
        field48 = null;
        field39 = null;
        field41 = null;
        if (arg0 == 717631692) {
            field35 = null;
            field36 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIII)I")
    private final int method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field29;
        if (arg1 != 4) {
            return -37;
        } else {
            int var8 = arg5 + -4096;
            int var9 = arg4 >> 12;
            int var10 = var9 - -1;
            int var11 = arg4 & 4095;
            int var12 = var9 & 255;
            if (~var10 <= ~arg0) {
                var10 = 0;
            }
            int var13 = this.field40[var12 - -arg2] & 3;
            int var14 = var11 + -4096;
            int var15;
            if (var13 > 1) {
                var15 = ~var13 != -3 ? -arg5 + -var11 : -arg5 + var11;
            } else {
                var15 = ~var13 == -1 ? arg5 + var11 : -var11 + arg5;
            }
            int var16 = class208.field3374[var11];
            int var17 = var10 & 255;
            int var18 = 3 & this.field40[arg2 + var17];
            int var19;
            if (var18 <= 1) {
                var19 = ~var18 == -1 ? arg5 + var14 : -var14 + arg5;
            } else {
                var19 = ~var18 != -3 ? -var14 - arg5 : var14 - arg5;
            }
            int var20 = 3 & this.field40[var12 - -arg6];
            int var21 = ((-var15 + var19) * var16 >> 12) + var15;
            int var22;
            if (var20 > 1) {
                var22 = var20 != 2 ? -var11 - var8 : -var8 + var11;
            } else {
                var22 = var20 != 0 ? -var11 + var8 : var8 + var11;
            }
            int var23 = this.field40[var17 - -arg6] & 3;
            int var24;
            if (~var23 < -2) {
                var24 = ~var23 == -3 ? -var8 + var14 : -var8 + -var14;
            } else {
                var24 = ~var23 == -1 ? var8 + var14 : -var14 + var8;
            }
            int var25 = ((-var22 + var24) * var16 >> 12) + var22;
            return ((-var21 + var25) * arg3 >> 12) + var21;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg1 == -19) {
            ++field47;
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field32 = arg0.method1779(arg1 + -45);
                } else {
                    if (~arg2 != -3) {
                        if (~arg2 == -4) {
                            this.field27 = this.field45 = arg0.method1779(arg1 + -37);
                            return;
                        }
                        if (~arg2 == -5) {
                            this.field26 = arg0.method1779(arg1 ^ 102);
                            return;
                        }
                        if (arg2 == 5) {
                            this.field27 = arg0.method1779(arg1 ^ 73);
                            return;
                        }
                        if (~arg2 == -7) {
                            this.field45 = arg0.method1779(-59);
                            return;
                        }
                    } else {
                        this.field44 = arg0.method1756(-104);
                        if (~this.field44 > -1) {
                            this.field30 = new short[this.field32];
                            for (int var5 = 0; ~var5 > ~this.field32; ++var5) {
                                this.field30[var5] = (short) arg0.method1756(class223.method1477(arg1, 110));
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field34 = arg0.method1779(-56) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB[I)V")
    private final void method21(int arg0, byte arg1, int[] arg2) {
        ++field50;
        int var4 = class1.field15[arg0] * this.field45;
        if (arg1 != -112) {
            field36 = null;
        }
        if (this.field32 == 1) {
            short var5 = this.field30[0];
            int var6 = this.field33[0] << 12;
            int var7 = this.field27 * var6 >> 12;
            int var8 = this.field45 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var9 & 4095;
            int var12 = 255 & this.field40[255 & var10];
            int var13 = var10 - -1;
            int var14 = class208.field3374[var11];
            if (var8 <= var13) {
                var13 = 0;
            }
            int var15 = this.field40[255 & var13] & 255;
            if (!this.field34) {
                for (int var16 = 0; ~var16 > ~class186.field2986; ++var16) {
                    int var17 = class246.field3958[var16] * this.field27;
                    int var18 = this.method19(var7, 4, var12, var14, var6 * var17 >> 12, var11, var15);
                    arg2[var16] = var5 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; var19 < class186.field2986; ++var19) {
                    int var20 = class246.field3958[var19] * this.field27;
                    int var21 = this.method19(var7, 4, var12, var14, var6 * var20 >> 12, var11, var15);
                    int var22 = var5 * var21 >> 12;
                    arg2[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field30[0];
            if (~var23 < -9 || var23 < -8) {
                int var24 = this.field33[0] << 12;
                int var25 = var4 * var24 >> 12;
                int var26 = this.field27 * var24 >> 12;
                int var27 = var25 >> 12;
                int var28 = this.field40[255 & var27] & 255;
                int var29 = var25 & 4095;
                int var30 = class208.field3374[var29];
                int var31 = var27 + 1;
                int var32 = this.field45 * var24 >> 12;
                if (var31 >= var32) {
                    var31 = 0;
                }
                int var33 = this.field40[var31 & 255] & 255;
                for (int var34 = 0; ~class186.field2986 < ~var34; ++var34) {
                    int var54 = class246.field3958[var34] * this.field27;
                    int var55 = this.method19(var26, 4, var28, var30, var24 * var54 >> 12, var29, var33);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; var35 < this.field32; ++var35) {
                short var36 = this.field30[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field33[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field27 * var37 >> 12;
                    int var40 = var38 >> 12;
                    int var41 = var40 - -1;
                    int var42 = 255 & this.field40[var40 & 255];
                    int var43 = var38 & 4095;
                    int var44 = this.field45 * var37 >> 12;
                    int var45 = class208.field3374[var43];
                    if (var41 >= var44) {
                        var41 = 0;
                    }
                    int var46 = this.field40[var41 & 255] & 255;
                    if (this.field34 && ~(this.field32 - 1) == ~var35) {
                        for (int var47 = 0; ~var47 > ~class186.field2986; ++var47) {
                            int var48 = class246.field3958[var47] * this.field27;
                            int var49 = this.method19(var39, 4, var42, var45, var37 * var48 >> 12, var43, var46);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = 2048 - -(var50 >> 1);
                        }
                    } else {
                        for (int var51 = 0; var51 < class186.field2986; ++var51) {
                            int var52 = class246.field3958[var51] * this.field27;
                            int var53 = this.method19(var39, 4, var42, var45, var37 * var52 >> 12, var43, var46);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZII)Ld;")
    public static final class128 method22(int arg0, boolean arg1, int arg2, int arg3) {
        ++field37;
        class128 var4 = new class128();
        var4.field2137 = arg2;
        var4.field2135 = arg3;
        class294.field4656.method466((long) arg0, var4, (byte) 93);
        class204.method1371(103, arg3);
        class103 var5 = class168.method1180(8931, arg0);
        if (var5 != null) {
            class45.method346((byte) 43, var5);
        }
        if (class247.field3969 != null) {
            class45.method346((byte) 60, class247.field3969);
            class247.field3969 = null;
        }
        int var6 = class202.field3248;
        if (arg1) {
            method17(16, (byte) -58);
        }
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            if (class62.method479(class23.field291[var7], 32000)) {
                class117.method830(-128, var7);
            }
        }
        if (class202.field3248 == 1) {
            class240.field3852 = false;
            class134.method944(class283.field4512, class214.field3451, class179.field2897, class250.field4007, false);
        } else {
            class134.method944(class283.field4512, class214.field3451, class179.field2897, class250.field4007, false);
            int var8 = class283.field4524.method1119(class205.field3282);
            for (int var9 = 0; class202.field3248 > var9; ++var9) {
                int var10 = class283.field4524.method1119(class207.method1396((byte) 42, var9));
                if (~var8 > ~var10) {
                    var8 = var10;
                }
            }
            class283.field4512 = class202.field3248 * 15 - -(class41.field482 ? 26 : 22);
            class179.field2897 = var8 + 8;
        }
        if (var5 != null) {
            class88.method624(false, (byte) 111, var5);
        }
        class183.method1257(1, arg3);
        if (~class113.field1944 != 0) {
            class76.method577(class113.field1944, 1, 21767);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
    public static final void method23(byte arg0) {
        ++field46;
        if (!class200.method1349(false) && ~class28.field336 != ~class109.field1891) {
            class149.method1014((byte) 110, class28.field336, class197.field3179.field692[0], class197.field3179.field610[0], class103.field1675, class263.field4159, false, false);
        } else {
            int var1 = 109 / ((arg0 - 48) / 40);
            if (class48.field590 != class28.field336 && class274.method1851(-37, class28.field336)) {
                class48.field590 = class28.field336;
                class58.method446(19956);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)Ljg;")
    public static final class271 method24(int arg0) {
        int var1 = class263.field4168[0] * class207.field3348[0];
        byte[] var2 = class168.field2726[0];
        int[] var3 = new int[var1];
        if (arg0 != -1140) {
            method18(103);
        }
        ++field28;
        for (int var4 = 0; var4 < var1; ++var4) {
            var3[var4] = class131.field2187[class204.method1369(var2[var4], 255)];
        }
        class43 var5 = new class43(class88.field1215, class64.field904, class70.field968[0], class249.field3993[0], class207.field3348[0], class263.field4168[0], var3);
        class111.method804(arg0 + 1140);
        return var5;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class3() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)V")
    private final void method25(int arg0) {
        if (arg0 <= -50) {
            if (this.field44 <= 0) {
                if (this.field30 != null && this.field30.length == this.field32) {
                    this.field33 = new short[this.field32];
                    for (int var2 = 0; var2 < this.field32; ++var2) {
                        this.field33[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                    }
                }
            } else {
                this.field33 = new short[this.field32];
                this.field30 = new short[this.field32];
                for (int var3 = 0; ~var3 > ~this.field32; ++var3) {
                    this.field30[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field44 / 4096.0F), (double) var3)));
                    this.field33[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
            ++field42;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            this.method21(arg1, (byte) -112, var3);
        }
        if (arg0 != 0) {
            field43 = 103;
        }
        ++field51;
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([BI)Lmc;")
    public static final class163 method27(byte[] arg0, int arg1) {
        ++field31;
        if (arg0 == null) {
            return null;
        } else {
            class210 var2 = new class210(arg0, class70.field968, class249.field3993, class207.field3348, class263.field4168, class168.field2726);
            class111.method804(arg1 + arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILei;Lei;)V")
    public static final void method28(int arg0, class175 arg1, class175 arg2) {
        ++field49;
        if (arg1.field2812 != null) {
            arg1.method1213(true);
        }
        arg1.field2812 = arg2;
        arg1.field2816 = arg2.field2816;
        if (arg0 != -27420) {
            field52 = 102;
        }
        arg1.field2812.field2816 = arg1;
        arg1.field2816.field2812 = arg1;
    }
}
