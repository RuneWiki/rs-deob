import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class2 extends class518 {

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
    public int field27 = 4;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public int field26 = 4;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public int field30 = 1638;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "[B")
    private byte[] field32 = new byte[512];

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    public int field36 = 0;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "Z")
    public boolean field37 = true;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public int field41 = 4;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "[Ljava/lang/String;")
    private static final String[] field45 = new String[] { method21(method20("[\u0000BE\u000f")), method21(method20("[\u0000BK\u000f")), method21(method20("^\u0012\u0000a")), method21(method20("KIB#Z")), method21(method20("[\u0000BG\u000f")), method21(method20("[\u0000BJ\u000f")), method21(method20("[\u0000BO\u000f")), method21(method20("[\u0000BN\u000f")), method21(method20("[\u0000BI\u000f")), method21(method20("[\u0000BH\u000f")) };

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "Z")
    public static boolean field25 = false;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "[I")
    public static int[] field35 = new int[3];

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "Lnha;")
    public static class335 field31;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "[S")
    private short[] field24;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "[S")
    private short[] field42;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V", line = 3)
    public final void method12(int arg0) {
        try {
            ++field34;
            this.field32 = class712.method5156(this.field36, (byte) 126);
            this.method13(false);
            if (arg0 >= 38) {
                for (int var2 = this.field41 + -1; ~var2 <= -2; --var2) {
                    short var3 = this.field24[var2];
                    if (~var3 < -9 || ~var3 > 7) {
                        return;
                    }
                    --this.field41;
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field45[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V", line = 34)
    private final void method13(boolean arg0) {
        try {
            if (!arg0) {
                ++field23;
                if (this.field30 <= 0) {
                    if (this.field24 != null && ~this.field24.length == ~this.field41) {
                        this.field42 = new short[this.field41];
                        for (int var2 = 0; ~this.field41 < ~var2; ++var2) {
                            this.field42[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                        }
                        return;
                    }
                } else {
                    this.field42 = new short[this.field41];
                    this.field24 = new short[this.field41];
                    for (int var3 = 0; ~this.field41 < ~var3; ++var3) {
                        this.field24[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field30 / 4096.0F), (double) var3)));
                        this.field42[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field45[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)[I", line = 76)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field44;
            int var3 = -78 % ((-57 - arg1) / 55);
            int[] var4 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                this.method18(arg0, (byte) -7, var4);
            }
            return var4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field45[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZII)I", line = 103)
    public static final int method15(int arg0, boolean arg1, int arg2, int arg3) {
        try {
            ++field43;
            class375 var4 = class279.method2276(arg1, 0, arg0);
            if (var4 == null) {
                return 0;
            } else if (arg2 >= 0 && ~arg2 > ~var4.field5472.length) {
                int var5 = 42 % ((31 - arg3) / 51);
                return var4.field5472[arg2];
            } else {
                return 0;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field45[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V", line = 123)
    public static void method16(int arg0) {
        try {
            if (arg0 != 1) {
                method16(-69);
            }
            field35 = null;
            field31 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field45[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 404)
    public class2() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjc;I)V", line = 138)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field40;
            if (arg2 != -3) {
                field29 = -117;
            }
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    this.field41 = arg1.method5128(0);
                } else {
                    if (~arg0 != -3) {
                        if (arg0 == 3) {
                            this.field26 = this.field27 = arg1.method5128(arg2 + 3);
                            return;
                        }
                        if (~arg0 == -5) {
                            this.field36 = arg1.method5128(0);
                            return;
                        }
                        if (arg0 == 5) {
                            this.field26 = arg1.method5128(0);
                            return;
                        }
                        if (arg0 == 6) {
                            this.field27 = arg1.method5128(arg2 ^ -3);
                            return;
                        }
                    } else {
                        this.field30 = arg1.method5087((byte) -26);
                        if (this.field30 < 0) {
                            this.field24 = new short[this.field41];
                            for (int var5 = 0; ~this.field41 < ~var5; ++var5) {
                                this.field24[var5] = (short) arg1.method5087((byte) -26);
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field37 = ~arg1.method5128(arg2 + 3) == -2;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field45[7] + arg0 + ',' + (arg1 != null ? field45[3] : field45[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB[I)V", line = 242)
    public final void method18(int arg0, byte arg1, int[] arg2) {
        try {
            ++field33;
            if (arg1 != -7) {
                this.method19(-97, -77, -49, 74, -120, -79, -86);
            }
            int var4 = class568.field8263[arg0] * this.field27;
            if (~this.field41 == -2) {
                short var5 = this.field24[0];
                int var6 = this.field42[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field26 * var6 >> 12;
                int var9 = this.field27 * var6 >> 12;
                int var10 = var7 >> 12;
                int var11 = var10 + 1;
                if (~var9 >= ~var11) {
                    var11 = 0;
                }
                int var12 = var7 & 4095;
                int var13 = class585.field8435[var12];
                int var14 = this.field32[255 & var10] & 255;
                int var15 = 255 & this.field32[var11 & 255];
                if (this.field37) {
                    for (int var16 = 0; ~var16 > ~class110.field1436; ++var16) {
                        int var17 = class393.field5718[var16] * this.field26;
                        int var18 = this.method19(var14, var6 * var17 >> 12, var13, var12, var8, var15, 1245953004);
                        int var19 = var5 * var18 >> 12;
                        arg2[var16] = (var19 >> 1) + 2048;
                    }
                } else {
                    for (int var20 = 0; var20 < class110.field1436; ++var20) {
                        int var21 = class393.field5718[var20] * this.field26;
                        int var22 = this.method19(var14, var6 * var21 >> 12, var13, var12, var8, var15, arg1 + 1245953011);
                        arg2[var20] = var5 * var22 >> 12;
                    }
                }
            } else {
                short var23 = this.field24[0];
                if (~var23 < -9 || var23 < -8) {
                    int var24 = this.field42[0] << 12;
                    int var25 = this.field26 * var24 >> 12;
                    int var26 = this.field27 * var24 >> 12;
                    int var27 = var4 * var24 >> 12;
                    int var28 = var27 >> 12;
                    int var29 = var28 + 1;
                    if (~var26 >= ~var29) {
                        var29 = 0;
                    }
                    int var30 = var27 & 4095;
                    int var31 = 255 & this.field32[var29 & 255];
                    int var32 = this.field32[255 & var28] & 255;
                    int var33 = class585.field8435[var30];
                    for (int var34 = 0; var34 < class110.field1436; ++var34) {
                        int var35 = class393.field5718[var34] * this.field26;
                        int var36 = this.method19(var32, var24 * var35 >> 12, var33, var30, var25, var31, 1245953004);
                        arg2[var34] = var23 * var36 >> 12;
                    }
                }
                for (int var37 = 1; ~var37 > ~this.field41; ++var37) {
                    short var38 = this.field24[var37];
                    if (var38 > 8 || ~var38 > 7) {
                        int var39 = this.field42[var37] << 12;
                        int var40 = this.field27 * var39 >> 12;
                        int var41 = this.field26 * var39 >> 12;
                        int var42 = var4 * var39 >> 12;
                        int var43 = var42 >> 12;
                        int var44 = var43 + 1;
                        int var45 = var42 & 4095;
                        if (~var40 >= ~var44) {
                            var44 = 0;
                        }
                        int var46 = this.field32[255 & var44] & 255;
                        int var47 = class585.field8435[var45];
                        int var48 = 255 & this.field32[255 & var43];
                        if (this.field37 && this.field41 + -1 == var37) {
                            for (int var52 = 0; ~var52 > ~class110.field1436; ++var52) {
                                int var53 = class393.field5718[var52] * this.field26;
                                int var54 = this.method19(var48, var39 * var53 >> 12, var47, var45, var41, var46, 1245953004);
                                int var55 = (var38 * var54 >> 12) + arg2[var52];
                                arg2[var52] = (var55 >> 1) + 2048;
                            }
                        } else {
                            for (int var49 = 0; ~class110.field1436 < ~var49; ++var49) {
                                int var50 = class393.field5718[var49] * this.field26;
                                int var51 = this.method19(var48, var39 * var50 >> 12, var47, var45, var41, var46, 1245953004);
                                arg2[var49] += var38 * var51 >> 12;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var57) {
            throw class665.method4799(var57, field45[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field45[3] : field45[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)I", line = 425)
    private final int method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field38;
            int var8 = arg1 >> 12;
            int var9 = var8 - -1;
            int var27 = arg1 & 4095;
            if (var9 >= arg4) {
                var9 = 0;
            }
            int var10 = var8 & 255;
            int var11 = var27 + -4096;
            if (arg6 != 1245953004) {
                method16(57);
            }
            int var12 = arg3 + -4096;
            int var13 = var9 & 255;
            int var14 = class585.field8435[var27];
            int var15 = 3 & this.field32[arg0 + var10];
            int var16;
            if (var15 > 1) {
                var16 = var15 == 2 ? -arg3 + var27 : -var27 + -arg3;
            } else {
                var16 = ~var15 != -1 ? arg3 - var27 : var27 + arg3;
            }
            int var17 = 3 & this.field32[var13 - -arg0];
            int var18;
            if (var17 > 1) {
                var18 = ~var17 != -3 ? -arg3 + -var11 : -arg3 + var11;
            } else {
                var18 = ~var17 != -1 ? arg3 - var11 : var11 - -arg3;
            }
            int var19 = ((-var16 + var18) * var14 >> 12) + var16;
            int var20 = this.field32[arg5 + var10] & 3;
            int var21;
            if (var20 > 1) {
                var21 = ~var20 != -3 ? -var27 - var12 : -var12 + var27;
            } else {
                var21 = var20 == 0 ? var27 + var12 : -var27 + var12;
            }
            int var22 = 3 & this.field32[arg5 + var13];
            int var23;
            if (~var22 >= -2) {
                var23 = ~var22 == -1 ? var11 + var12 : -var11 + var12;
            } else {
                var23 = ~var22 != -3 ? -var11 + -var12 : var11 - var12;
            }
            int var24 = var21 - -((var23 - var21) * var14 >> 12);
            return ((-var19 + var24) * arg2 >> 12) + var19;
        } catch (RuntimeException var26) {
            throw class665.method4799(var26, field45[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method20(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method21(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 103;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
