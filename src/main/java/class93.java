import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class93 extends class115 {

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    private int field1413 = 0;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    private int field1421 = 0;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    private int field1424 = 0;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field1408 = 1;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field1417 = 0;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field1412 = 0;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1414 = "glow1:";

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "Lnk;")
    public static class11 field1425;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "Lbh;")
    public static class239 field1419;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIBI)V")
    private final void method633(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = arg1 <= 2048 ? (arg0 + 4096) * arg1 >> 12 : arg0 + arg1 + -(arg0 * arg1 >> 12);
        if (var5 > 0) {
            int var6 = arg3 * 6;
            int var7 = var6 >> 12;
            int var8 = arg1 - -arg1 + -var5;
            int var10 = (-var8 + var5 << 12) / var5;
            int var11 = var5 * var10 >> 12;
            int var12 = -(var7 << 12) + var6;
            int var13 = var11 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var8 + var13;
            if (var7 != 0) {
                if (var7 != 1) {
                    if (var7 != 2) {
                        if (var7 != 3) {
                            if (~var7 != -5) {
                                if (var7 == 5) {
                                    this.field1411 = var8;
                                    this.field1406 = var14;
                                    this.field1415 = var5;
                                }
                            } else {
                                this.field1411 = var8;
                                this.field1415 = var15;
                                this.field1406 = var5;
                            }
                        } else {
                            this.field1406 = var5;
                            this.field1415 = var8;
                            this.field1411 = var14;
                        }
                    } else {
                        this.field1411 = var5;
                        this.field1415 = var8;
                        this.field1406 = var15;
                    }
                } else {
                    this.field1406 = var8;
                    this.field1411 = var5;
                    this.field1415 = var14;
                }
            } else {
                this.field1406 = var8;
                this.field1411 = var15;
                this.field1415 = var5;
            }
        } else {
            this.field1415 = this.field1411 = this.field1406 = arg1;
        }
        if (arg2 == 93) {
            ++field1423;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field1421 = (arg1.method741(3083) << 12) / 100;
                }
            } else {
                this.field1413 = (arg1.method741(arg0 ^ -3084) << 12) / 100;
            }
        } else {
            this.field1424 = arg1.method763(true);
        }
        ++field1422;
        if (arg0 != -1) {
            this.field1416 = -54;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class93() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        if (arg0 > -33) {
            return null;
        } else {
            ++field1410;
            int[][] var3 = super.field1716.method6(arg1, (byte) -90);
            if (super.field1716.field23) {
                int[][] var4 = this.method798(0, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var3[2];
                int[] var7 = var4[2];
                int[] var8 = var3[1];
                int[] var9 = var3[0];
                int[] var10 = var4[1];
                for (int var11 = 0; class77.field1178 > var11; ++var11) {
                    this.method635(var7[var11], 41, var10[var11], var5[var11]);
                    this.field1416 += this.field1424;
                    this.field1407 += this.field1421;
                    while (~this.field1416 > -1) {
                        this.field1416 += 4096;
                    }
                    this.field1409 += this.field1413;
                    if (this.field1407 < 0) {
                        this.field1407 = 0;
                    }
                    while (this.field1416 > 4096) {
                        this.field1416 -= 4096;
                    }
                    if (this.field1409 < 0) {
                        this.field1409 = 0;
                    }
                    if (this.field1409 > 4096) {
                        this.field1409 = 4096;
                    }
                    if (this.field1407 > 4096) {
                        this.field1407 = 4096;
                    }
                    this.method633(this.field1409, this.field1407, (byte) 93, this.field1416);
                    var9[var11] = this.field1415;
                    var8[var11] = this.field1411;
                    var6[var11] = this.field1406;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
    public static void method634(boolean arg0) {
        if (arg0) {
            field1419 = null;
            field1414 = null;
            field1425 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIII)V")
    private final void method635(int arg0, int arg1, int arg2, int arg3) {
        ++field1420;
        if (arg1 < 17) {
            this.method235(3, -78);
        }
        int var5 = arg3 <= arg2 ? arg2 : arg3;
        int var6 = ~arg3 > ~arg2 ? arg3 : arg2;
        int var7 = ~var5 > ~arg0 ? arg0 : var5;
        int var8 = var6 > arg0 ? arg0 : var6;
        this.field1407 = (var7 + var8) / 2;
        int var9 = -var8 + var7;
        if (this.field1407 > 0 && ~this.field1407 > -4097) {
            this.field1409 = (var9 << 12) / (this.field1407 > 2048 ? -(this.field1407 * 2) + 8192 : this.field1407 * 2);
        } else {
            this.field1409 = 0;
        }
        if (var9 <= 0) {
            this.field1416 = 0;
        } else {
            int var10 = (-arg3 + var7 << 12) / var9;
            int var11 = (-arg2 + var7 << 12) / var9;
            int var12 = (-arg0 + var7 << 12) / var9;
            if (arg3 == var7) {
                this.field1416 = arg2 == var8 ? 20480 - -var12 : -var11 + 4096;
            } else if (~arg2 != ~var7) {
                this.field1416 = ~arg3 == ~var8 ? var11 + 12288 : -var10 + 20480;
            } else {
                this.field1416 = ~arg0 != ~var8 ? 12288 - var12 : 4096 - -var10;
            }
            this.field1416 /= 6;
        }
    }
}
