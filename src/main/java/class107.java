import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class107 extends class144 {

    @OriginalMember(owner = "client!je", name = "O", descriptor = "[B")
    private byte[] field1442 = new byte[512];

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    private int field1437 = 4;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    private int field1450 = 4;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "Z")
    private boolean field1451 = true;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "I")
    private int field1452 = 4;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
    private int field1455 = 0;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    private int field1448 = 1638;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "Z")
    public static volatile boolean field1443 = false;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field1447 = 0;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "[J")
    public static long[] field1446 = new long[32];

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1444 = null;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!je", name = "db", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "[S")
    private short[] field1439;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "[S")
    private short[] field1440;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
    public static void method670(int arg0) {
        field1444 = null;
        field1446 = null;
        if (arg0 < 117) {
            field1447 = 33;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B[II)V")
    private final void method671(byte arg0, int[] arg1, int arg2) {
        int var4 = class143.field2045[arg2] * this.field1452;
        ++field1456;
        if (arg0 > 72) {
            if (this.field1450 != 1) {
                short var5 = this.field1439[0];
                if (~var5 < -9 || ~var5 > 7) {
                    int var6 = this.field1440[0] << 12;
                    int var7 = var4 * var6 >> 12;
                    int var8 = this.field1452 * var6 >> 12;
                    int var9 = var7 >> 12;
                    int var10 = 255 & this.field1442[255 & var9];
                    int var11 = this.field1437 * var6 >> 12;
                    int var12 = var7 & 4095;
                    int var13 = class175.field2491[var12];
                    int var14 = var9 + 1;
                    if (~var14 <= ~var8) {
                        var14 = 0;
                    }
                    int var15 = 255 & this.field1442[var14 & 255];
                    for (int var16 = 0; ~var16 > ~class104.field1411; ++var16) {
                        int var36 = class87.field1178[var16] * this.field1437;
                        int var37 = this.method673(var10, var13, (byte) 126, var12, var15, var11, var6 * var36 >> 12);
                        arg1[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~var17 > ~this.field1450; ++var17) {
                    short var18 = this.field1439[var17];
                    if (~var18 < -9 || var18 < -8) {
                        int var19 = this.field1440[var17] << 12;
                        int var20 = this.field1452 * var19 >> 12;
                        int var21 = var4 * var19 >> 12;
                        int var22 = this.field1437 * var19 >> 12;
                        int var23 = var21 >> 12;
                        int var24 = 255 & this.field1442[255 & var23];
                        int var25 = var23 + 1;
                        if (~var25 <= ~var20) {
                            var25 = 0;
                        }
                        int var26 = 255 & this.field1442[var25 & 255];
                        int var27 = var21 & 4095;
                        int var28 = class175.field2491[var27];
                        if (this.field1451 && this.field1450 + -1 == var17) {
                            for (int var29 = 0; var29 < class104.field1411; ++var29) {
                                int var30 = class87.field1178[var29] * this.field1437;
                                int var31 = this.method673(var24, var28, (byte) 35, var27, var26, var22, var19 * var30 >> 12);
                                int var32 = (var18 * var31 >> 12) + arg1[var29];
                                arg1[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~class104.field1411; ++var33) {
                                int var34 = class87.field1178[var33] * this.field1437;
                                int var35 = this.method673(var24, var28, (byte) 116, var27, var26, var22, var19 * var34 >> 12);
                                arg1[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field1440[0] << 12;
                int var39 = this.field1452 * var38 >> 12;
                int var40 = this.field1437 * var38 >> 12;
                int var41 = var4 * var38 >> 12;
                int var42 = var41 >> 12;
                short var43 = this.field1439[0];
                int var44 = var41 & 4095;
                int var45 = var42 + 1;
                int var46 = 255 & this.field1442[var42 & 255];
                int var47 = class175.field2491[var44];
                if (~var45 <= ~var39) {
                    var45 = 0;
                }
                int var48 = 255 & this.field1442[255 & var45];
                if (!this.field1451) {
                    for (int var49 = 0; class104.field1411 > var49; ++var49) {
                        int var50 = class87.field1178[var49] * this.field1437;
                        int var51 = this.method673(var46, var47, (byte) -126, var44, var48, var40, var38 * var50 >> 12);
                        arg1[var49] = var43 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; var52 < class104.field1411; ++var52) {
                        int var53 = class87.field1178[var52] * this.field1437;
                        int var54 = this.method673(var46, var47, (byte) 119, var44, var48, var40, var38 * var53 >> 12);
                        int var55 = var43 * var54 >> 12;
                        arg1[var52] = (var55 >> 1) + 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class107() {
        super(0, true);
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(B)V")
    private final void method672(byte arg0) {
        if (arg0 <= -47) {
            ++field1449;
            if (~this.field1448 >= -1) {
                if (this.field1439 != null && this.field1439.length == this.field1450) {
                    this.field1440 = new short[this.field1450];
                    for (int var2 = 0; var2 < this.field1450; ++var2) {
                        this.field1440[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                    }
                    return;
                }
            } else {
                this.field1440 = new short[this.field1450];
                this.field1439 = new short[this.field1450];
                for (int var3 = 0; ~this.field1450 < ~var3; ++var3) {
                    this.field1439[var3] = (short) ((int) (Math.pow((double) ((float) this.field1448 / 4096.0F), (double) var3) * 4096.0D));
                    this.field1440[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (arg2 != 20630) {
            this.method9(-48, (class216) null, 86);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field1452 = arg1.method1407(arg2 + -20515);
                                }
                            } else {
                                this.field1437 = arg1.method1407(108);
                            }
                        } else {
                            this.field1455 = arg1.method1407(115);
                        }
                    } else {
                        this.field1437 = this.field1452 = arg1.method1407(arg2 + -20523);
                    }
                } else {
                    this.field1448 = arg1.method1357((byte) 50);
                    if (this.field1448 < 0) {
                        this.field1439 = new short[this.field1450];
                        for (int var5 = 0; ~var5 > ~this.field1450; ++var5) {
                            this.field1439[var5] = (short) arg1.method1357((byte) 50);
                        }
                    }
                }
            } else {
                this.field1450 = arg1.method1407(122);
            }
        } else {
            this.field1451 = ~arg1.method1407(113) == -2;
        }
        ++field1438;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIBIIII)I")
    private final int method673(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1457;
        int var8 = -94 % ((arg2 - 74) / 37);
        int var9 = arg3 + -4096;
        int var10 = arg6 >> 12;
        int var11 = arg6 & 4095;
        int var12 = var10 + 1;
        int var13 = var11 + -4096;
        int var14 = var10 & 255;
        int var15 = class175.field2491[var11];
        int var16 = 3 & this.field1442[arg0 + var14];
        int var17;
        if (var16 > 1) {
            var17 = var16 == 2 ? -arg3 + var11 : -arg3 + -var11;
        } else {
            var17 = ~var16 == -1 ? var11 - -arg3 : arg3 - var11;
        }
        if (arg5 <= var12) {
            var12 = 0;
        }
        int var18 = var12 & 255;
        int var19 = this.field1442[arg0 + var18] & 3;
        int var20;
        if (~var19 < -2) {
            var20 = var19 == 2 ? -arg3 + var13 : -arg3 + -var13;
        } else {
            var20 = var19 == 0 ? arg3 + var13 : -var13 + arg3;
        }
        int var21 = var17 - -((-var17 + var20) * var15 >> 12);
        int var22 = 3 & this.field1442[arg4 + var14];
        int var23;
        if (var22 > 1) {
            var23 = var22 == 2 ? -var9 + var11 : -var9 + -var11;
        } else {
            var23 = var22 != 0 ? var9 - var11 : var11 - -var9;
        }
        int var24 = 3 & this.field1442[arg4 + var18];
        int var25;
        if (~var24 < -2) {
            var25 = var24 == 2 ? -var9 + var13 : -var9 + -var13;
        } else {
            var25 = var24 != 0 ? -var13 + var9 : var9 + var13;
        }
        int var26 = ((-var23 + var25) * var15 >> 12) + var23;
        return var21 - -((-var21 + var26) * arg1 >> 12);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method674(String arg0, byte arg1) {
        int var2 = 112 % ((-52 - arg1) / 37);
        ++field1453;
        String var3 = class110.method686(class60.method370((byte) -8, arg0), true);
        if (var3 == null) {
            var3 = "";
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V")
    public static final void method675(int arg0) {
        class82.field1116.method71(arg0 ^ 9692);
        ++field1441;
        class104.field1408.method71(-122);
        if (arg0 != -9635) {
            method675(-6);
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        this.field1442 = class260.method1665(this.field1455, -77);
        ++field1436;
        this.method672((byte) -68);
        if (arg0 >= -109) {
            this.field1439 = null;
        }
        for (int var2 = this.field1450 - 1; var2 >= 1; --var2) {
            short var3 = this.field1439[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field1450;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            int[] var3 = super.field2069.method425(true, arg0);
            if (super.field2069.field820) {
                this.method671((byte) 122, var3, arg0);
            }
            ++field1454;
            return var3;
        }
    }
}
