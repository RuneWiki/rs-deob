import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class94 extends class74 {

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    private int field1518 = 4;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    private int field1516 = 0;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    private int field1513 = 4;

    @OriginalMember(owner = "client!cf", name = "bb", descriptor = "I")
    private int field1526 = 1638;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "[B")
    private byte[] field1525 = new byte[512];

    @OriginalMember(owner = "client!cf", name = "fb", descriptor = "Z")
    private boolean field1530 = true;

    @OriginalMember(owner = "client!cf", name = "gb", descriptor = "I")
    private int field1531 = 4;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "[[I")
    public static int[][] field1514 = new int[5][5000];

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "[I")
    public static int[] field1517 = new int[50];

    @OriginalMember(owner = "client!cf", name = "db", descriptor = "[I")
    public static int[] field1528 = new int[50];

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!cf", name = "cb", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!cf", name = "eb", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "[S")
    private short[] field1512;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "[S")
    private short[] field1519;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "[[I")
    public static int[][] field1521;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field1522;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (arg0 != 4) {
            this.field1516 = 96;
        }
        if (super.field1254.field3118) {
            this.method740(var3, -1839401588, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)Lnf;")
    public static final class159 method734(int arg0, int arg1) {
        ++field1515;
        class159 var2 = (class159) class249.field3839.method1780((long) arg1, (byte) -120);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class135.field2109.method1163(34, arg1, 48);
            if (arg0 != 23588) {
                method738(4);
            }
            class159 var4 = new class159();
            if (var3 != null) {
                var4.method1074(new class37(var3), arg1, arg0 ^ 23588);
            }
            class249.field3839.method1784(var4, false, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIILbf;IJIIII)Z")
    public static final boolean method735(int arg0, int arg1, int arg2, int arg3, class205 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class66.method521(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class94() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        ++field1524;
        if (arg0) {
            method734(-110, 111);
        }
        this.field1525 = class10.method114((byte) -64, this.field1516);
        this.method739((byte) 66);
        for (int var2 = this.field1518 + -1; var2 >= 1; --var2) {
            short var3 = this.field1519[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field1518;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(II)I")
    public static final int method736(int arg0, int arg1) {
        if (arg0 != -1677178904) {
            method736(-46, -79);
        }
        ++field1523;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBIIIII)I")
    private final int method737(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1511;
        int var8 = arg4 + -4096;
        int var9 = arg5 >> 12;
        int var10 = arg5 & 4095;
        int var11 = var10 - 4096;
        int var12 = var9 - -1;
        int var13 = var9 & 255;
        if (var12 >= arg6) {
            var12 = 0;
        }
        int var14 = var12 & 255;
        int var15 = this.field1525[arg2 + var13] & 3;
        int var16 = class99.field1573[var10];
        int var17;
        if (var15 > 1) {
            var17 = var15 != 2 ? -arg4 + -var10 : var10 - arg4;
        } else {
            var17 = ~var15 != -1 ? -var10 + arg4 : var10 - -arg4;
        }
        int var18 = this.field1525[var14 - -arg2] & 3;
        int var19;
        if (~var18 < -2) {
            var19 = var18 == 2 ? -arg4 + var11 : -arg4 + -var11;
        } else {
            var19 = var18 == 0 ? arg4 + var11 : -var11 + arg4;
        }
        int var20 = ((-var17 + var19) * var16 >> 12) + var17;
        int var21 = 3 & this.field1525[var13 - -arg3];
        int var22;
        if (var21 <= 1) {
            var22 = ~var21 == -1 ? var10 - -var8 : var8 - var10;
        } else {
            var22 = var21 != 2 ? -var10 - var8 : -var8 + var10;
        }
        int var23 = -13 % ((37 - arg1) / 34);
        int var24 = 3 & this.field1525[arg3 + var14];
        int var25;
        if (~var24 >= -2) {
            var25 = ~var24 == -1 ? var11 - -var8 : -var11 + var8;
        } else {
            var25 = var24 == 2 ? -var8 + var11 : -var11 - var8;
        }
        int var26 = ((-var22 + var25) * var16 >> 12) + var22;
        return ((-var20 + var26) * arg0 >> 12) + var20;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
    public static void method738(int arg0) {
        field1521 = null;
        if (arg0 > -24) {
            method738(-13);
        }
        field1517 = null;
        field1514 = null;
        field1528 = null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    private final void method739(byte arg0) {
        ++field1520;
        if (~this.field1526 < -1) {
            this.field1519 = new short[this.field1518];
            this.field1512 = new short[this.field1518];
            for (int var2 = 0; ~this.field1518 < ~var2; ++var2) {
                this.field1519[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1526 / 4096.0F), (double) var2)));
                this.field1512[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field1519 != null && ~this.field1519.length == ~this.field1518) {
            this.field1512 = new short[this.field1518];
            for (int var3 = 0; ~var3 > ~this.field1518; ++var3) {
                this.field1512[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 66) {
            this.method448(-92, 122);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field1531 = arg1.method333((byte) -59);
                                }
                            } else {
                                this.field1513 = arg1.method333((byte) -59);
                            }
                        } else {
                            this.field1516 = arg1.method333((byte) -59);
                        }
                    } else {
                        this.field1513 = this.field1531 = arg1.method333((byte) -59);
                    }
                } else {
                    this.field1526 = arg1.method306(48);
                    if (~this.field1526 > -1) {
                        this.field1519 = new short[this.field1518];
                        for (int var5 = 0; ~var5 > ~this.field1518; ++var5) {
                            this.field1519[var5] = (short) arg1.method306(class76.method605(arg0, -59));
                        }
                    }
                }
            } else {
                this.field1518 = arg1.method333((byte) -59);
            }
        } else {
            this.field1530 = arg1.method333((byte) -59) == 1;
        }
        if (arg0 != -79) {
            this.field1519 = null;
        }
        ++field1527;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([III)V")
    private final void method740(int[] arg0, int arg1, int arg2) {
        int var4 = class207.field3212[arg2] * this.field1531;
        ++field1529;
        if (arg1 != -1839401588) {
            this.method448(37, 100);
        }
        if (this.field1518 == 1) {
            short var5 = this.field1519[0];
            int var6 = this.field1512[0] << 12;
            int var7 = this.field1531 * var6 >> 12;
            int var8 = this.field1513 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var9 & 4095;
            int var12 = class99.field1573[var11];
            int var13 = var10 + 1;
            int var14 = this.field1525[255 & var10] & 255;
            if (~var7 >= ~var13) {
                var13 = 0;
            }
            int var15 = this.field1525[var13 & 255] & 255;
            if (!this.field1530) {
                for (int var16 = 0; var16 < class178.field2662; ++var16) {
                    int var17 = class224.field3522[var16] * this.field1513;
                    int var18 = this.method737(var12, (byte) 105, var14, var15, var11, var6 * var17 >> 12, var8);
                    arg0[var16] = var5 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; ~class178.field2662 < ~var19; ++var19) {
                    int var20 = class224.field3522[var19] * this.field1513;
                    int var21 = this.method737(var12, (byte) 105, var14, var15, var11, var6 * var20 >> 12, var8);
                    int var22 = var5 * var21 >> 12;
                    arg0[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field1519[0];
            if (~var23 < -9 || var23 < -8) {
                int var24 = this.field1512[0] << 12;
                int var25 = this.field1531 * var24 >> 12;
                int var26 = this.field1513 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 + 1;
                int var30 = 255 & this.field1525[255 & var28];
                int var31 = var27 & 4095;
                if (var25 <= var29) {
                    var29 = 0;
                }
                int var32 = class99.field1573[var31];
                int var33 = this.field1525[var29 & 255] & 255;
                for (int var34 = 0; var34 < class178.field2662; ++var34) {
                    int var54 = class224.field3522[var34] * this.field1513;
                    int var55 = this.method737(var32, (byte) 84, var30, var33, var31, var24 * var54 >> 12, var26);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~var35 > ~this.field1518; ++var35) {
                short var36 = this.field1519[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field1512[var35] << 12;
                    int var38 = this.field1531 * var37 >> 12;
                    int var39 = var4 * var37 >> 12;
                    int var40 = var39 >> 12;
                    int var41 = var39 & 4095;
                    int var42 = class99.field1573[var41];
                    int var43 = this.field1525[var40 & 255] & 255;
                    int var44 = var40 - -1;
                    int var45 = this.field1513 * var37 >> 12;
                    if (var38 <= var44) {
                        var44 = 0;
                    }
                    int var46 = this.field1525[255 & var44] & 255;
                    if (this.field1530 && this.field1518 + -1 == var35) {
                        for (int var47 = 0; ~class178.field2662 < ~var47; ++var47) {
                            int var48 = class224.field3522[var47] * this.field1513;
                            int var49 = this.method737(var42, (byte) -30, var43, var46, var41, var37 * var48 >> 12, var45);
                            int var50 = (var36 * var49 >> 12) + arg0[var47];
                            arg0[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; class178.field2662 > var51; ++var51) {
                            int var52 = class224.field3522[var51] * this.field1513;
                            int var53 = this.method737(var42, (byte) -43, var43, var46, var41, var37 * var52 >> 12, var45);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }
}
