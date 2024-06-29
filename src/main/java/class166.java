import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class166 extends class34 {

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    private int field2441 = 1365;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    private int field2444 = 20;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    private int field2439 = 0;

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
    private int field2448 = 0;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "[Lgk;")
    public static class224[] field2438 = new class224[2048];

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "[I")
    public static int[] field2447 = new int[2500];

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "Lhl;")
    public static class139 field2446 = new class139(4);

    @OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
    public static int field2454 = -1;

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "[I")
    public static int[] field2453 = new int[100];

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "Lgf;")
    public static class26 field2452;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "[[[I")
    public static int[][][] field2451;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 < 75) {
            return null;
        } else {
            ++field2450;
            int[] var3 = super.field610.method228(24856, arg1);
            if (super.field610.field597) {
                for (int var4 = 0; var4 < class226.field3527; ++var4) {
                    int var5 = (class199.field2985[arg1] << 12) / this.field2441 - -this.field2448;
                    int var6 = (class112.field1716[var4] << 12) / this.field2441 + this.field2439;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var6;
                    int var10 = var5;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && ~this.field2444 < ~var13) {
                        var10 = (var8 * var10 >> 12) * 2 + var7;
                        var8 = -var11 + var12 + var9;
                        ++var13;
                        var11 = var10 * var10 >> 12;
                        var12 = var8 * var8 >> 12;
                    }
                    var3[var4] = var13 < this.field2444 + -1 ? (var13 << 12) / this.field2444 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
    public static final void method1127(int arg0) {
        ++field2442;
        if (arg0 < 99) {
            field2447 = null;
        }
        class8.field93.method944(65535);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)V")
    public static final void method1128(boolean arg0, int arg1) {
        ++field2443;
        if (arg1 != -15632) {
            field2454 = -125;
        }
        byte[][] var2 = class165.field2429;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var4 > var5; ++var5) {
            int[] var11 = null;
            byte[] var12 = var2[var5];
            int var13 = class18.field323[var5] >> 8;
            int var14 = 255 & class18.field323[var5];
            int var15 = var13 * 64 + -class90.field1367;
            int var16 = var14 * 64 + -class188.field2774;
            if (var12 != null) {
                class195.method1316(-105);
                var11 = class32.method221(var16, class90.field1367, class243.field3763, -113, arg0, var12, class188.field2774, var15);
            }
            if (!arg0 && ~(class121.field1806 / 8) == ~var13 && ~(class16.field297 / 8) == ~var14) {
                if (var11 != null) {
                    class218.field3348 = var11[2];
                    class246.field3833 = var11[3];
                    class169.field2486 = var11[0];
                    class223.field3470 = var11[4];
                    class184.field2679 = var11[1];
                } else {
                    class169.field2486 = -1;
                }
            }
        }
        for (int var6 = 0; var6 < var4; ++var6) {
            int var7 = (class18.field323[var6] >> 8) * 64 - class90.field1367;
            int var8 = (class18.field323[var6] & 255) * 64 + -class188.field2774;
            byte[] var9 = var2[var6];
            if (var9 == null && ~class16.field297 > -801) {
                class195.method1316(-88);
                for (int var10 = 0; var10 < var3; ++var10) {
                    class55.method466(var7, 64, var8, 64, true, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class166() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg0 == 6) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (arg1 == 3) {
                            this.field2448 = arg2.method423(-121);
                        }
                    } else {
                        this.field2439 = arg2.method423(-123);
                    }
                } else {
                    this.field2444 = arg2.method423(118);
                }
            } else {
                this.field2441 = arg2.method423(arg0 ^ 59);
            }
            ++field2445;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(BI)V")
    public static final void method1129(byte arg0, int arg1) {
        ++field2440;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (~arg1 < -11) {
            arg1 = 10;
        }
        class133.field1950 += arg1 * 128;
        if (~class221.field3446.length > ~class133.field1950) {
            class133.field1950 -= class221.field3446.length;
            int var3 = (int) (Math.random() * 12.0D);
            class237.method1618(-89, class51.field830[var3]);
        }
        int var4 = arg1 * 128;
        int var5 = 0;
        int var6 = (-arg1 + var2) * 128;
        for (int var7 = 0; var6 > var7; ++var7) {
            int var26 = class47.field795[var4 + var5] - class221.field3446[class133.field1950 + var5 & class221.field3446.length + -1] * arg1 / 6;
            if (var26 < 0) {
                var26 = 0;
            }
            class47.field795[var5++] = var26;
        }
        for (int var8 = var2 - arg1; var2 > var8; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; ~var24 > -129; ++var24) {
                int var25 = (int) (Math.random() * 100.0D);
                if (~var25 > -51 && var24 > 10 && ~var24 > -119) {
                    class47.field795[var23 + var24] = 255;
                } else {
                    class47.field795[var24 - -var23] = 0;
                }
            }
        }
        for (int var9 = 0; ~(var2 - arg1) < ~var9; ++var9) {
            class128.field1891[var9] = class128.field1891[arg1 + var9];
        }
        for (int var10 = var2 - arg1; ~var10 > ~var2; ++var10) {
            class128.field1891[var10] = (int) (16.0D * Math.sin((double) class150.field2171 / 14.0D) + Math.sin((double) class150.field2171 / 15.0D) * 14.0D + Math.sin((double) class150.field2171 / 16.0D) * 12.0D);
            ++class150.field2171;
        }
        if (arg0 != 94) {
            field2452 = null;
        }
        class78.field1235 += arg1;
        int var11 = (arg1 - -(class120.field1794 & 1)) / 2;
        if (~var11 < -1) {
            for (int var12 = 0; class78.field1235 > var12; ++var12) {
                int var21 = 2 + (int) (Math.random() * 124.0D);
                int var22 = (int) (Math.random() * 128.0D) + 128;
                class47.field795[(var22 << 7) + var21] = 192;
            }
            class78.field1235 = 0;
            for (int var13 = 0; var13 < var2; ++var13) {
                int var18 = var13 * 128;
                int var19 = 0;
                for (int var20 = -var11; var20 < 128; ++var20) {
                    if (~(var11 + var20) > -129) {
                        var19 += class47.field795[var20 - -var18 + var11];
                    }
                    if (-var11 - 1 + var20 >= 0) {
                        var19 -= class47.field795[var20 - 1 + var18 - var11];
                    }
                    if (var20 >= 0) {
                        class111.field1681[var20 - -var18] = var19 / (var11 * 2 - -1);
                    }
                }
            }
            for (int var14 = 0; ~var14 > -129; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; var2 > var16; ++var16) {
                    int var17 = var16 * 128;
                    if (var11 + var16 < var2) {
                        var15 += class111.field1681[var14 - (-var17 - var11 * 128)];
                    }
                    if (-var11 + var16 - 1 >= 0) {
                        var15 -= class111.field1681[var14 - (var11 + 1) * 128 + var17];
                    }
                    if (~var16 <= -1) {
                        class47.field795[var14 - -var17] = var15 / (var11 * 2 - -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)V")
    public static void method1130(int arg0) {
        if (arg0 == -2525) {
            field2446 = null;
            field2451 = null;
            field2447 = null;
            field2438 = null;
            field2452 = null;
            field2453 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(III)V")
    public static final void method1131(int arg0, int arg1, int arg2) {
        ++field2449;
        if (arg1 != -27957) {
            field2451 = null;
        }
        class105 var3 = class9.method72(1, -1, arg0);
        var3.method763(false);
        var3.field1553 = arg2;
    }
}
