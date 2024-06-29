import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class60 extends class37 {

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    private int field1474 = 1638;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    private int field1477 = 4;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    private int field1483 = 0;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "Z")
    private boolean field1482 = true;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "I")
    private int field1489 = 4;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "[I")
    private int[] field1484 = new int[512];

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
    private int field1487 = 4;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "[Ldd;")
    public static class35[] field1480 = new class35[100];

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "Lag;")
    public static class8 field1488;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "[I")
    private int[] field1478;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "[I")
    private int[] field1485;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
    public static void method512(boolean arg0) {
        if (!arg0) {
            method513(-68, 82);
        }
        field1488 = null;
        field1480 = null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)I")
    public static final int method513(int arg0, int arg1) {
        ++field1492;
        return arg1 != -91 ? 114 : 63 & arg0 >> 11;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)Z")
    public static final boolean method514(int arg0, int arg1) {
        ++field1490;
        if (arg1 != -7161) {
            method513(40, 52);
        }
        return arg0 >= 97 && arg0 <= 122 || ~arg0 <= -66 && ~arg0 >= -91;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
    private final void method515(int arg0) {
        if (arg0 != 6051) {
            this.method11(false);
        }
        if (this.field1474 > 0) {
            this.field1478 = new int[this.field1489];
            this.field1485 = new int[this.field1489];
            for (int var2 = 0; ~this.field1489 < ~var2; ++var2) {
                this.field1485[var2] = (int) (Math.pow((double) (this.field1474 / 4096), (double) var2) * 4096.0D);
                this.field1478[var2] = (int) (Math.pow(2.0D, (double) var2) * 4096.0D);
            }
        } else if (this.field1485 != null && ~this.field1485.length == ~this.field1489) {
            this.field1478 = new int[this.field1489];
            for (int var3 = 0; ~this.field1489 < ~var3; ++var3) {
                this.field1478[var3] = (int) (4096.0D * Math.pow(2.0D, (double) var3));
            }
        }
        ++field1486;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        ++field1476;
        this.method516(-11501);
        this.method515(6051);
        if (arg0) {
            this.method517(83, 40, 26, -34, -99);
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
    private final void method516(int arg0) {
        Random var2 = new Random((long) this.field1483);
        ++field1479;
        for (int var3 = 0; ~var3 > -256; ++var3) {
            this.field1484[var3] = -1;
        }
        if (arg0 != -11501) {
            this.field1484 = null;
        }
        for (int var4 = 0; ~var4 > -256; ++var4) {
            int var5;
            do {
                var5 = class183.method1218(arg0 + 1804466253, 255, var2);
            } while (~this.field1484[var5] != 0);
            this.field1484[var5 + 255] = this.field1484[var5] = var4;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)I")
    private final int method517(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1481;
        int var6 = -4096 & arg0;
        int var7 = arg0 - var6;
        int var8 = -4096 & arg3;
        int var9 = arg2 & -4096;
        int var10 = arg3 - var8;
        int var11 = var8 >> 12;
        int var12 = var11 + 1;
        int var13 = var6 >> 12;
        int var14 = arg1 & -4096;
        int var15 = var13 + 1;
        int var16 = var11 & 255;
        int var17 = var13 & 255;
        int var18 = this.field1484[this.field1484[var16] + var17] % 4;
        if (var12 >= var14 >> 12) {
            var12 = 0;
        }
        int var19 = var12 & 255;
        int var20 = this.field1484[this.field1484[var19] + var17] % 4;
        if (var15 >= var9 >> 12) {
            var15 = 0;
        }
        int var21 = var15 & 255;
        int var22 = this.field1484[this.field1484[var16] + var21] % 4;
        int var23 = this.field1484[this.field1484[var19] + var21] % 4;
        int var24 = class203.method1340(var7, class150.field3134[var18], var10, (byte) 125);
        int var25 = class203.method1340(var7 + -4096, class150.field3134[var22], var10, (byte) 121);
        int var26 = class203.method1340(var7, class150.field3134[var20], var10 - 4096, (byte) 120);
        int var27 = class203.method1340(var7 + -4096, class150.field3134[var23], var10 + -4096, (byte) 118);
        int var28 = class50.method451(var7, 24842);
        int var29 = class50.method451(var10, arg4 + 24848);
        int var30 = class109.method800(3756, var24, var25, var28);
        int var31 = class109.method800(arg4 + 3762, var26, var27, var28);
        if (arg4 != -6) {
            method512(true);
        }
        return class109.method800(3756, var30, var31, var29);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field1477 = arg2.method221(-80);
                                }
                            } else {
                                this.field1487 = arg2.method221(-83);
                            }
                        } else {
                            this.field1483 = arg2.method221(-117);
                        }
                    } else {
                        this.field1487 = this.field1477 = arg2.method221(-113);
                    }
                } else {
                    this.field1474 = arg2.method241(false);
                    if (this.field1474 < 0) {
                        this.field1485 = new int[this.field1489];
                        for (int var5 = 0; var5 < this.field1489; ++var5) {
                            this.field1485[var5] = arg2.method241(false);
                        }
                    }
                }
            } else {
                this.field1489 = arg2.method221(-118);
            }
        } else {
            this.field1482 = ~arg2.method221(arg1 ^ -124) == -2;
        }
        if (arg1 != 1) {
            this.method7((byte) 98, -125);
        }
        ++field1491;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 != 75) {
            return null;
        } else {
            ++field1475;
            int[] var3 = super.field816.method1189((byte) 33, arg1);
            if (super.field816.field3661) {
                int var4 = this.field1487 << 12;
                int var5 = this.field1477 << 12;
                int var6 = class22.field450[arg1] * this.field1477;
                for (int var7 = 0; class72.field1719 > var7; ++var7) {
                    int var8 = class118.field2622[var7] * this.field1487;
                    int var9 = 0;
                    for (int var10 = 0; this.field1489 > var10; ++var10) {
                        int var11 = this.field1478[var10];
                        int var12 = this.field1485[var10];
                        int var13 = this.method517(var8 * var11 >> 12, var5 * var11 >> 12, var4 * var11 >> 12, var6 * var11 >> 12, -6);
                        var9 += var12 * var13 >> 12;
                    }
                    if (this.field1482) {
                        var9 = (var9 >> 1) + 2048;
                    }
                    var3[var7] = var9;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class60() {
        super(0, true);
    }
}
