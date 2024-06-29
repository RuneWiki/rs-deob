import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class767 extends class232 {

    @OriginalMember(owner = "client!eja", name = "W", descriptor = "I")
    public int field11222 = 4;

    @OriginalMember(owner = "client!eja", name = "J", descriptor = "I")
    public int field11227 = 1638;

    @OriginalMember(owner = "client!eja", name = "M", descriptor = "[B")
    private byte[] field11230 = new byte[512];

    @OriginalMember(owner = "client!eja", name = "K", descriptor = "Z")
    public boolean field11234 = true;

    @OriginalMember(owner = "client!eja", name = "O", descriptor = "I")
    public int field11237 = 4;

    @OriginalMember(owner = "client!eja", name = "S", descriptor = "I")
    public int field11238 = 4;

    @OriginalMember(owner = "client!eja", name = "T", descriptor = "I")
    public int field11228 = 0;

    @OriginalMember(owner = "client!eja", name = "Y", descriptor = "[Ljava/lang/String;")
    private static final String[] field11240 = new String[] { method5532(method5531("r\u0012eu")), method5532(method5531("gI'7'")), method5532(method5531("y\rh7\u001f4")), method5532(method5531("y\rh7\u001c4")), method5532(method5531("y\rh7\u001b4")), method5532(method5531("y\rh7\u001e4")), method5532(method5531("y\rh7\u00164")), method5532(method5531("y\rh7\u00114")), method5532(method5531("y\rh7\u00104")), method5532(method5531("y\rh7\u00194")), method5532(method5531("y\rh7\u00174")) };

    @OriginalMember(owner = "client!eja", name = "L", descriptor = "Lhl;")
    public static class556 field11232 = new class556(13, 1);

    @OriginalMember(owner = "client!eja", name = "R", descriptor = "I")
    public static int field11223;

    @OriginalMember(owner = "client!eja", name = "P", descriptor = "I")
    public static int field11224;

    @OriginalMember(owner = "client!eja", name = "N", descriptor = "I")
    public static int field11225;

    @OriginalMember(owner = "client!eja", name = "U", descriptor = "I")
    public static int field11226;

    @OriginalMember(owner = "client!eja", name = "I", descriptor = "I")
    public static int field11229;

    @OriginalMember(owner = "client!eja", name = "V", descriptor = "I")
    public static int field11235;

    @OriginalMember(owner = "client!eja", name = "G", descriptor = "I")
    public static int field11236;

    @OriginalMember(owner = "client!eja", name = "Q", descriptor = "I")
    public static int field11239;

    @OriginalMember(owner = "client!eja", name = "X", descriptor = "[S")
    private short[] field11231;

    @OriginalMember(owner = "client!eja", name = "H", descriptor = "[S")
    private short[] field11233;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field11236;
            if (arg1 != 123) {
                this.field11228 = 41;
            }
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                this.method5525(var3, 83, arg0);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11240[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(B)V")
    public final void method67(byte arg0) {
        try {
            ++field11225;
            int var2 = 115 / ((73 - arg0) / 34);
            this.field11230 = class478.method3652(512, this.field11228);
            this.method5528((byte) -62);
            for (int var3 = this.field11222 + -1; ~var3 <= -2; --var3) {
                short var4 = this.field11231[var3];
                if (~var4 < -9 || ~var4 > 7) {
                    return;
                }
                --this.field11222;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11240[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "([III)V")
    public final void method5525(int[] arg0, int arg1, int arg2) {
        try {
            ++field11226;
            if (arg1 <= 77) {
                this.field11231 = null;
            }
            int var4 = class100.field1467[arg2] * this.field11237;
            if (~this.field11222 != -2) {
                short var5 = this.field11231[0];
                if (var5 > 8 || var5 < -8) {
                    int var6 = this.field11233[0] << 12;
                    int var7 = var4 * var6 >> 12;
                    int var8 = this.field11237 * var6 >> 12;
                    int var9 = this.field11238 * var6 >> 12;
                    int var10 = var7 >> 12;
                    int var11 = var10 + 1;
                    int var12 = var7 & 4095;
                    if (var11 >= var8) {
                        var11 = 0;
                    }
                    int var13 = class18.field186[var12];
                    int var14 = 255 & this.field11230[var11 & 255];
                    int var15 = this.field11230[255 & var10] & 255;
                    for (int var16 = 0; ~class449.field6969 < ~var16; ++var16) {
                        int var17 = class788.field11518[var16] * this.field11238;
                        int var18 = this.method5529(var13, var12, var14, var6 * var17 >> 12, var15, true, var9);
                        arg0[var16] = var5 * var18 >> 12;
                    }
                }
                for (int var19 = 1; this.field11222 > var19; ++var19) {
                    short var20 = this.field11231[var19];
                    if (~var20 < -9 || ~var20 > 7) {
                        int var21 = this.field11233[var19] << 12;
                        int var22 = this.field11238 * var21 >> 12;
                        int var23 = var4 * var21 >> 12;
                        int var24 = this.field11237 * var21 >> 12;
                        int var25 = var23 >> 12;
                        int var26 = var25 - -1;
                        int var27 = var23 & 4095;
                        if (~var24 >= ~var26) {
                            var26 = 0;
                        }
                        int var28 = 255 & this.field11230[var26 & 255];
                        int var29 = 255 & this.field11230[255 & var25];
                        int var30 = class18.field186[var27];
                        if (this.field11234 && ~(this.field11222 - 1) == ~var19) {
                            for (int var31 = 0; ~var31 > ~class449.field6969; ++var31) {
                                int var32 = class788.field11518[var31] * this.field11238;
                                int var33 = this.method5529(var30, var27, var28, var21 * var32 >> 12, var29, true, var22);
                                int var34 = arg0[var31] - -(var20 * var33 >> 12);
                                arg0[var31] = (var34 >> 1) + 2048;
                            }
                        } else {
                            for (int var35 = 0; ~var35 > ~class449.field6969; ++var35) {
                                int var36 = class788.field11518[var35] * this.field11238;
                                int var37 = this.method5529(var30, var27, var28, var21 * var36 >> 12, var29, true, var22);
                                arg0[var35] += var20 * var37 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field11231[0];
                int var39 = this.field11233[0] << 12;
                int var40 = this.field11238 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = this.field11237 * var39 >> 12;
                int var43 = var41 >> 12;
                int var44 = var43 + 1;
                int var45 = var41 & 4095;
                if (~var42 >= ~var44) {
                    var44 = 0;
                }
                int var46 = 255 & this.field11230[var43 & 255];
                int var47 = class18.field186[var45];
                int var48 = 255 & this.field11230[255 & var44];
                if (!this.field11234) {
                    for (int var49 = 0; class449.field6969 > var49; ++var49) {
                        int var50 = class788.field11518[var49] * this.field11238;
                        int var51 = this.method5529(var47, var45, var48, var39 * var50 >> 12, var46, true, var40);
                        arg0[var49] = var38 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; class449.field6969 > var52; ++var52) {
                        int var53 = class788.field11518[var52] * this.field11238;
                        int var54 = this.method5529(var47, var45, var48, var39 * var53 >> 12, var46, true, var40);
                        int var55 = var38 * var54 >> 12;
                        arg0[var52] = (var55 >> 1) + 2048;
                    }
                }
            }
        } catch (RuntimeException var57) {
            throw class590.method4333(var57, field11240[3] + (arg0 != null ? field11240[1] : field11240[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eja", name = "d", descriptor = "(I)V")
    public static void method5526(int arg0) {
        try {
            field11232 = null;
            if (arg0 != -9) {
                method5526(36);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11240[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg0 <= 96) {
                this.field11230 = null;
            }
            ++field11235;
            if (~arg2 != -1) {
                if (~arg2 == -2) {
                    this.field11222 = arg1.method1645((byte) -83);
                } else {
                    if (~arg2 != -3) {
                        if (arg2 == 3) {
                            this.field11238 = this.field11237 = arg1.method1645((byte) -107);
                            return;
                        }
                        if (arg2 == 4) {
                            this.field11228 = arg1.method1645((byte) -71);
                            return;
                        }
                        if (~arg2 == -6) {
                            this.field11238 = arg1.method1645((byte) -108);
                            return;
                        }
                        if (~arg2 == -7) {
                            this.field11237 = arg1.method1645((byte) -73);
                            return;
                        }
                    } else {
                        this.field11227 = arg1.method1657(110);
                        if (~this.field11227 > -1) {
                            this.field11231 = new short[this.field11222];
                            for (int var5 = 0; this.field11222 > var5; ++var5) {
                                this.field11231[var5] = (short) arg1.method1657(119);
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field11234 = arg1.method1645((byte) -109) == 1;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field11240[2] + arg0 + ',' + (arg1 != null ? field11240[1] : field11240[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(ILjava/awt/Component;)Lwi;")
    public static final class493 method5527(int arg0, Component arg1) {
        try {
            ++field11223;
            return arg0 != 4 ? null : new class123(arg1);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11240[7] + arg0 + ',' + (arg1 != null ? field11240[1] : field11240[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!eja", name = "<init>", descriptor = "()V")
    public class767() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "(B)V")
    private final void method5528(byte arg0) {
        try {
            ++field11239;
            if (arg0 > -50) {
                this.method5528((byte) -16);
            }
            if (~this.field11227 < -1) {
                this.field11233 = new short[this.field11222];
                this.field11231 = new short[this.field11222];
                for (int var2 = 0; ~var2 > ~this.field11222; ++var2) {
                    this.field11231[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field11227 / 4096.0F), (double) var2)));
                    this.field11233[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field11231 != null && ~this.field11231.length == ~this.field11222) {
                this.field11233 = new short[this.field11222];
                for (int var3 = 0; this.field11222 > var3; ++var3) {
                    this.field11233[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11240[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(IIIIIZI)I")
    private final int method5529(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        try {
            ++field11224;
            int var8 = arg3 >> 12;
            int var9 = var8 + 1;
            int var27 = arg3 & 4095;
            int var10 = var8 & 255;
            if (arg6 <= var9) {
                var9 = 0;
            }
            int var11 = var27 + -4096;
            int var12 = var9 & 255;
            int var13 = arg1 + -4096;
            int var14 = 3 & this.field11230[arg4 + var10];
            int var15 = class18.field186[var27];
            int var16;
            if (~var14 < -2) {
                var16 = ~var14 == -3 ? -arg1 + var27 : -arg1 + -var27;
            } else {
                var16 = ~var14 == -1 ? var27 - -arg1 : -var27 + arg1;
            }
            int var17 = this.field11230[arg4 + var12] & 3;
            int var18;
            if (~var17 >= -2) {
                var18 = ~var17 != -1 ? -var11 + arg1 : arg1 + var11;
            } else {
                var18 = var17 == 2 ? -arg1 + var11 : -arg1 + -var11;
            }
            int var19 = this.field11230[arg2 + var10] & 3;
            int var20 = ((-var16 + var18) * var15 >> 12) + var16;
            if (!arg5) {
                this.field11222 = 85;
            }
            int var21;
            if (var19 <= 1) {
                var21 = var19 != 0 ? -var27 + var13 : var27 - -var13;
            } else {
                var21 = var19 != 2 ? -var27 + -var13 : var27 - var13;
            }
            int var22 = this.field11230[var12 - -arg2] & 3;
            int var23;
            if (var22 <= 1) {
                var23 = ~var22 != -1 ? var13 - var11 : var11 - -var13;
            } else {
                var23 = ~var22 != -3 ? -var11 - var13 : var11 - var13;
            }
            int var24 = ((-var21 + var23) * var15 >> 12) + var21;
            return var20 - -((-var20 + var24) * arg0 >> 12);
        } catch (RuntimeException var26) {
            throw class590.method4333(var26, field11240[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(IIII)I")
    public static final int method5530(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field11229;
            if (arg3 <= 0) {
                method5527(127, (Component) null);
            }
            int var6 = arg0 & 3;
            if (var6 == 0) {
                return arg2;
            } else if (var6 == 1) {
                return -arg1 + 7;
            } else {
                return ~var6 == -3 ? -arg2 + 7 : arg1;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11240[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!eja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5531(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 90);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5532(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 103;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 25;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
