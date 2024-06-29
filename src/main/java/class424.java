import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class424 extends class211 {

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public int field6246 = 1638;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "Z")
    public boolean field6251 = true;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public int field6254 = 4;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public int field6249 = 4;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "[B")
    private byte[] field6244 = new byte[512];

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public int field6260 = 4;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public int field6262 = 0;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "[Ljava/lang/String;")
    private static final String[] field6263 = new String[] { method3276(method3275("B~fW\u0017")), method3276(method3275("B~fT\u0017")), method3276(method3275("Cc$~")), method3276(method3275("V8f<B")), method3276(method3275("B~fS\u0017")), method3276(method3275("B~fQ\u0017")), method3276(method3275("B~fV\u0017")), method3276(method3275("B~fP\u0017")), method3276(method3275("B~fY\u0017")) };

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public static int field6256 = -1;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "Z")
    public static boolean field6257 = false;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "[S")
    private short[] field6245;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "[S")
    private short[] field6252;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BILib;)V", line = 4)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (~arg1 == -7) {
                                        this.field6254 = arg2.method1455((byte) 62);
                                    }
                                } else {
                                    this.field6249 = arg2.method1455((byte) 62);
                                }
                            } else {
                                this.field6262 = arg2.method1455((byte) 62);
                            }
                        } else {
                            this.field6249 = this.field6254 = arg2.method1455((byte) 62);
                        }
                    } else {
                        this.field6246 = arg2.method1442(65280);
                        if (~this.field6246 > -1) {
                            this.field6252 = new short[this.field6260];
                            for (int var5 = 0; ~var5 > ~this.field6260; ++var5) {
                                this.field6252[var5] = (short) arg2.method1442(65280);
                            }
                        }
                    }
                } else {
                    this.field6260 = arg2.method1455((byte) 62);
                }
            } else {
                this.field6251 = ~arg2.method1455((byte) 62) == -2;
            }
            if (arg0 <= 67) {
                this.field6262 = -116;
            }
            ++field6248;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6263[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6263[3] : field6263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V", line = 98)
    private final void method3271(byte arg0) {
        try {
            if (arg0 != 16) {
                this.method3271((byte) -90);
            }
            if (this.field6246 <= 0) {
                if (this.field6252 != null && ~this.field6252.length == ~this.field6260) {
                    this.field6245 = new short[this.field6260];
                    for (int var2 = 0; this.field6260 > var2; ++var2) {
                        this.field6245[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                    }
                }
            } else {
                this.field6252 = new short[this.field6260];
                this.field6245 = new short[this.field6260];
                for (int var3 = 0; ~this.field6260 < ~var3; ++var3) {
                    this.field6252[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field6246 / 4096.0F), (double) var3)));
                    this.field6245[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
            ++field6258;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6263[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIBIIII)I", line = 138)
    private final int method3272(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field6250;
            int var8 = arg5 >> 12;
            int var9 = var8 + 1;
            if (arg4 <= var9) {
                var9 = 0;
            }
            int var10 = var8 & 255;
            if (arg2 < 48) {
                return 23;
            } else {
                int var27 = arg5 & 4095;
                int var11 = arg6 + -4096;
                int var12 = var27 + -4096;
                int var13 = var9 & 255;
                int var14 = 3 & this.field6244[var10 - -arg1];
                int var15 = class170.field2327[var27];
                int var16;
                if (var14 <= 1) {
                    var16 = ~var14 == -1 ? var27 + arg6 : arg6 - var27;
                } else {
                    var16 = var14 != 2 ? -var27 + -arg6 : -arg6 + var27;
                }
                int var17 = 3 & this.field6244[var13 - -arg1];
                int var18;
                if (var17 <= 1) {
                    var18 = ~var17 == -1 ? var12 - -arg6 : -var12 + arg6;
                } else {
                    var18 = var17 == 2 ? -arg6 + var12 : -var12 - arg6;
                }
                int var19 = ((-var16 + var18) * var15 >> 12) + var16;
                int var20 = this.field6244[arg0 + var10] & 3;
                int var21;
                if (~var20 >= -2) {
                    var21 = ~var20 != -1 ? -var27 + var11 : var27 - -var11;
                } else {
                    var21 = ~var20 != -3 ? -var27 - var11 : -var11 + var27;
                }
                int var22 = 3 & this.field6244[arg0 + var13];
                int var23;
                if (var22 <= 1) {
                    var23 = var22 == 0 ? var11 + var12 : -var12 + var11;
                } else {
                    var23 = ~var22 != -3 ? -var11 + -var12 : var12 - var11;
                }
                int var24 = var21 - -((var23 - var21) * var15 >> 12);
                return ((var24 - var19) * arg3 >> 12) + var19;
            }
        } catch (RuntimeException var26) {
            throw class759.method5498(var26, field6263[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ[I)V", line = 214)
    public final void method3273(int arg0, boolean arg1, int[] arg2) {
        try {
            ++field6255;
            int var4 = class302.field4735[arg0] * this.field6254;
            if (!arg1) {
                this.field6249 = 36;
            }
            if (~this.field6260 == -2) {
                int var5 = this.field6245[0] << 12;
                short var6 = this.field6252[0];
                int var7 = this.field6249 * var5 >> 12;
                int var8 = var4 * var5 >> 12;
                int var9 = this.field6254 * var5 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 - -1;
                int var12 = var8 & 4095;
                if (~var9 >= ~var11) {
                    var11 = 0;
                }
                int var13 = this.field6244[var10 & 255] & 255;
                int var14 = class170.field2327[var12];
                int var15 = 255 & this.field6244[255 & var11];
                if (!this.field6251) {
                    for (int var16 = 0; ~class343.field5332 < ~var16; ++var16) {
                        int var17 = class88.field997[var16] * this.field6249;
                        int var18 = this.method3272(var15, var13, (byte) 119, var14, var7, var5 * var17 >> 12, var12);
                        arg2[var16] = var6 * var18 >> 12;
                    }
                } else {
                    for (int var19 = 0; var19 < class343.field5332; ++var19) {
                        int var20 = class88.field997[var19] * this.field6249;
                        int var21 = this.method3272(var15, var13, (byte) 91, var14, var7, var5 * var20 >> 12, var12);
                        int var22 = var6 * var21 >> 12;
                        arg2[var19] = (var22 >> 1) + 2048;
                    }
                }
            } else {
                short var23 = this.field6252[0];
                if (~var23 < -9 || var23 < -8) {
                    int var24 = this.field6245[0] << 12;
                    int var25 = this.field6249 * var24 >> 12;
                    int var26 = var4 * var24 >> 12;
                    int var27 = this.field6254 * var24 >> 12;
                    int var28 = var26 >> 12;
                    int var29 = var28 + 1;
                    if (var29 >= var27) {
                        var29 = 0;
                    }
                    int var30 = var26 & 4095;
                    int var31 = 255 & this.field6244[255 & var29];
                    int var32 = this.field6244[var28 & 255] & 255;
                    int var33 = class170.field2327[var30];
                    for (int var34 = 0; ~class343.field5332 < ~var34; ++var34) {
                        int var35 = class88.field997[var34] * this.field6249;
                        int var36 = this.method3272(var31, var32, (byte) 97, var33, var25, var24 * var35 >> 12, var30);
                        arg2[var34] = var23 * var36 >> 12;
                    }
                }
                for (int var37 = 1; this.field6260 > var37; ++var37) {
                    short var38 = this.field6252[var37];
                    if (~var38 < -9 || var38 < -8) {
                        int var39 = this.field6245[var37] << 12;
                        int var40 = this.field6249 * var39 >> 12;
                        int var41 = this.field6254 * var39 >> 12;
                        int var42 = var4 * var39 >> 12;
                        int var43 = var42 >> 12;
                        int var44 = var43 + 1;
                        int var45 = var42 & 4095;
                        if (var41 <= var44) {
                            var44 = 0;
                        }
                        int var46 = 255 & this.field6244[255 & var44];
                        int var47 = class170.field2327[var45];
                        int var48 = this.field6244[255 & var43] & 255;
                        if (this.field6251 && this.field6260 + -1 == var37) {
                            for (int var49 = 0; var49 < class343.field5332; ++var49) {
                                int var50 = class88.field997[var49] * this.field6249;
                                int var51 = this.method3272(var46, var48, (byte) 106, var47, var40, var39 * var50 >> 12, var45);
                                int var52 = (var38 * var51 >> 12) + arg2[var49];
                                arg2[var49] = (var52 >> 1) + 2048;
                            }
                        } else {
                            for (int var53 = 0; ~var53 > ~class343.field5332; ++var53) {
                                int var54 = class88.field997[var53] * this.field6249;
                                int var55 = this.method3272(var46, var48, (byte) 70, var47, var40, var39 * var54 >> 12, var45);
                                arg2[var53] += var38 * var55 >> 12;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var57) {
            throw class759.method5498(var57, field6263[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6263[3] : field6263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 384)
    public class424() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)[I", line = 395)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field6261;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                this.method3273(arg1, true, var3);
            }
            if (arg0 != 8217) {
                method3274((class163) null, -64);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6263[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lib;I)Lcs;", line = 430)
    public static final class358 method3274(class163 arg0, int arg1) {
        try {
            ++field6253;
            class384 var2 = class301.method2531(114, arg0);
            int var3 = arg0.method1445((byte) 117);
            int var4 = arg0.method1445((byte) 125);
            int var5 = arg0.method1445((byte) 112);
            int var6 = arg0.method1445((byte) 119);
            if (arg1 < 101) {
                return null;
            } else {
                int var7 = arg0.method1445((byte) 108);
                int var8 = arg0.method1445((byte) 127);
                return new class358(var2.field5805, var2.field5813, var2.field5804, var2.field5807, var2.field5809, var2.field5810, var2.field5814, var2.field5806, var2.field5815, var3, var4, var5, var6, var7, var8);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field6263[4] + (arg0 != null ? field6263[3] : field6263[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 458)
    public final void method437(int arg0) {
        try {
            ++field6259;
            if (arg0 != 27132) {
                this.field6262 = -39;
            }
            this.field6244 = class705.method5154(this.field6262, (byte) 120);
            this.method3271((byte) 16);
            for (int var2 = this.field6260 + -1; var2 >= 1; --var2) {
                short var3 = this.field6252[var2];
                if (~var3 < -9) {
                    return;
                }
                if (var3 < -8) {
                    return;
                }
                --this.field6260;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6263[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3275(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3276(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 22;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
