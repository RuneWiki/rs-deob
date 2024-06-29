import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class243 extends class102 {

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    private int field4445 = 409;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    private int field4440 = 4096;

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    private int field4449 = 4096;

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "[I")
    private int[] field4451 = new int[3];

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
    private int field4448 = 4096;

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "[Z")
    public static boolean[] field4450 = new boolean[5];

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "Lqe;")
    public static class179 field4439 = class206.method1380("Zu viele Anmelde)2Versuche von Ihrer Adresse", (byte) 84);

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "Lqe;")
    private static class179 field4446 = class206.method1380(" has logged in)3", (byte) 118);

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "Lqe;")
    public static class179 field4441 = field4446;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "Lra;")
    public static class185 field4444 = new class185(new byte[5000]);

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIZ)V")
    public static final void method1563(int arg0, int arg1, int arg2, boolean arg3) {
        ++field4453;
        if (~arg2 <= -8001 && ~arg2 >= -48001) {
            class80.field1542 = arg2;
            if (arg0 != -48001) {
                method1563(115, -41, 17, false);
            }
            class174.field3124 = arg1;
            class121.field2268 = arg3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method1244(-27523);
                            this.field4451[2] = class107.method696(0, var5 >> 12);
                            this.field4451[0] = class107.method696(var5, 16711680) << 4;
                            this.field4451[1] = class107.method696(65280, var5) >> 4;
                        }
                    } else {
                        this.field4440 = arg0.method1252(2);
                    }
                } else {
                    this.field4449 = arg0.method1252(2);
                }
            } else {
                this.field4448 = arg0.method1252(2);
            }
        } else {
            this.field4445 = arg0.method1252(2);
        }
        ++field4442;
        if (arg2) {
            this.field4448 = 65;
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V")
    public static void method1564(int arg0) {
        field4444 = null;
        field4441 = null;
        if (arg0 == 25973) {
            field4446 = null;
            field4450 = null;
            field4439 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)Lac;")
    public static final class4 method1565(int arg0, byte arg1) {
        ++field4443;
        class4 var2 = (class4) class157.field2842.method1299((byte) -125, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class102.field1949.method342(arg0, 16, (byte) -87);
            if (arg1 >= -55) {
                field4441 = null;
            }
            class4 var4 = new class4();
            if (var3 != null) {
                var4.method28(new class185(var3), -30671);
            }
            class157.field2842.method1303(var4, (long) arg0, (byte) -90);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field4452;
        if (arg1 != 64) {
            this.field4440 = -71;
        }
        int[][] var3 = super.field1950.method598((byte) -109, arg0);
        if (super.field1950.field1724) {
            int[][] var4 = this.method677(123, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~class155.field2796 < ~var11; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field4451[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field4445) {
                    var10[var11] = var12;
                    var8[var11] = var5[var11];
                    var9[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = -this.field4451[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field4445 < var15) {
                        var10[var11] = var12;
                        var8[var11] = var14;
                        var9[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field4451[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field4445 < var17) {
                            var10[var11] = var12;
                            var8[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var10[var11] = this.field4440 * var12 >> 12;
                            var8[var11] = this.field4449 * var14 >> 12;
                            var9[var11] = this.field4448 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lh;IIIIII)V")
    public static final void method1566(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0.field1479.length;
        for (int var8 = 0; var8 < var7; ++var8) {
            int var21 = arg0.field1479[var8] - class100.field1859;
            int var22 = arg0.field1473[var8] - class66.field1343;
            int var23 = arg0.field1472[var8] - class110.field2060;
            int var24 = arg3 * var23 + arg4 * var21 >> 16;
            int var25 = arg4 * var23 - arg3 * var21 >> 16;
            int var27 = arg2 * var22 - arg1 * var25 >> 16;
            int var28 = arg1 * var22 + arg2 * var25 >> 16;
            if (var28 < 50) {
                return;
            }
            if (arg0.field1468 != null) {
                class76.field1465[var8] = var24;
                class76.field1478[var8] = var27;
                class76.field1480[var8] = var28;
            }
            class76.field1464[var8] = (var24 << 9) / var28 + class27.field608;
            class76.field1481[var8] = (var27 << 9) / var28 + class27.field610;
        }
        class27.field609 = 0;
        int var9 = arg0.field1475.length;
        for (int var10 = 0; var10 < var9; ++var10) {
            int var11 = arg0.field1475[var10];
            int var12 = arg0.field1470[var10];
            int var13 = arg0.field1467[var10];
            int var14 = class76.field1464[var11];
            int var15 = class76.field1464[var12];
            int var16 = class76.field1464[var13];
            int var17 = class76.field1481[var11];
            int var18 = class76.field1481[var12];
            int var19 = class76.field1481[var13];
            if ((var14 - var15) * (var19 - var18) - (var16 - var15) * (var17 - var18) > 0) {
                if (class218.field4042 && class60.method409(class27.field608 + class193.field3599, class27.field610 + class240.field4413, var17, var18, var19, var14, var15, var16)) {
                    class151.field2729 = arg5;
                    class227.field4206 = arg6;
                }
                class27.field603 = false;
                if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > class27.field599 || var15 > class27.field599 || var16 > class27.field599) {
                    class27.field603 = true;
                }
                if (arg0.field1468 != null && arg0.field1468[var10] != -1) {
                    if (!class195.field3624) {
                        if (arg0.field1474) {
                            class27.method166(var17, var18, var19, var14, var15, var16, arg0.field1463[var10], arg0.field1466[var10], arg0.field1476[var10], class76.field1465[0], class76.field1465[1], class76.field1465[3], class76.field1478[0], class76.field1478[1], class76.field1478[3], class76.field1480[0], class76.field1480[1], class76.field1480[3], arg0.field1468[var10]);
                        } else {
                            class27.method166(var17, var18, var19, var14, var15, var16, arg0.field1463[var10], arg0.field1466[var10], arg0.field1476[var10], class76.field1465[var11], class76.field1465[var12], class76.field1465[var13], class76.field1478[var11], class76.field1478[var12], class76.field1478[var13], class76.field1480[var11], class76.field1480[var12], class76.field1480[var13], arg0.field1468[var10]);
                        }
                    } else {
                        int var20 = class27.field597.method515(-122, arg0.field1468[var10]);
                        class27.method184(var17, var18, var19, var14, var15, var16, class10.method72(var20, arg0.field1463[var10]), class10.method72(var20, arg0.field1466[var10]), class10.method72(var20, arg0.field1476[var10]));
                    }
                } else if (arg0.field1463[var10] != 12345678) {
                    class27.method184(var17, var18, var19, var14, var15, var16, arg0.field1463[var10], arg0.field1466[var10], arg0.field1476[var10]);
                }
            }
        }
    }
}
