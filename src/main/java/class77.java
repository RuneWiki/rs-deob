import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class77 extends class102 {

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    private int field1486 = 0;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
    private int field1494 = 0;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    private int field1497 = 0;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "Ldc;")
    public static class36 field1495 = new class36();

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "[I")
    public static int[] field1500 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "Lqe;")
    private static class179 field1502 = class206.method1380("Your account has been disabled)3", (byte) 19);

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "Lqe;")
    public static class179 field1505 = field1502;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client!ha", name = "ib", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Lgf;")
    public static class71 field1484;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)Lfi;")
    public static final class64 method494(byte arg0, int arg1) {
        ++field1496;
        class64 var2 = (class64) class220.field4073.method1299((byte) 10, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class111.field2089.method342(arg1, 1, (byte) 91);
            if (arg0 != 16) {
                field1502 = null;
            }
            class64 var4 = new class64();
            if (var3 != null) {
                var4.method421(arg1, new class185(var3), (byte) -84);
            }
            class220.field4073.method1303(var4, (long) arg1, (byte) 43);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (arg2) {
            method497((byte) 9);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field1494 = (arg0.method1204(false) << 12) / 100;
                }
            } else {
                this.field1497 = (arg0.method1204(false) << 12) / 100;
            }
        } else {
            this.field1486 = arg0.method1225((byte) -77);
        }
        ++field1487;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILeh;)Z")
    public static final boolean method495(int arg0, int arg1, int arg2, class52 arg3) {
        if (arg0 != 20480) {
            field1484 = null;
        }
        ++field1506;
        byte[] var4 = arg3.method342(arg1, arg2, (byte) -43);
        if (var4 == null) {
            return false;
        } else {
            class233.method1518(var4, (byte) 61);
            return true;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIB)V")
    private final void method496(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg0 < arg1 ? arg1 : arg0;
        int var6 = arg0 > arg1 ? arg1 : arg0;
        int var7 = ~arg2 >= ~var5 ? var5 : arg2;
        ++field1492;
        int var8 = var6 <= arg2 ? var6 : arg2;
        this.field1485 = (var7 + var8) / 2;
        int var9 = -var8 + var7;
        if (arg3 == 85) {
            if (this.field1485 > 0 && this.field1485 < 4096) {
                this.field1489 = (var9 << 12) / (~this.field1485 < -2049 ? -(this.field1485 * 2) + 8192 : this.field1485 * 2);
            } else {
                this.field1489 = 0;
            }
            if (var9 <= 0) {
                this.field1490 = 0;
            } else {
                int var10 = (-arg1 + var7 << 12) / var9;
                int var11 = (-arg2 + var7 << 12) / var9;
                int var12 = (var7 - arg0 << 12) / var9;
                if (~arg1 != ~var7) {
                    if (arg0 != var7) {
                        this.field1490 = ~arg1 == ~var8 ? var12 + 12288 : 20480 - var10;
                    } else {
                        this.field1490 = arg2 != var8 ? 12288 - var11 : var10 + 4096;
                    }
                } else {
                    this.field1490 = arg0 != var8 ? -var12 + 4096 : var11 + 20480;
                }
                this.field1490 /= 6;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != 64) {
            return null;
        } else {
            ++field1488;
            int[][] var3 = super.field1950.method598((byte) -49, arg0);
            if (super.field1950.field1724) {
                int[][] var4 = this.method677(arg1 ^ 28, arg0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var3[1];
                int[] var8 = var3[0];
                int[] var9 = var3[2];
                int[] var10 = var4[2];
                for (int var11 = 0; class155.field2796 > var11; ++var11) {
                    this.method496(var6[var11], var5[var11], var10[var11], (byte) 85);
                    for (this.field1490 += this.field1486; this.field1490 < 0; this.field1490 += 4096) {
                    }
                    while (this.field1490 > 4096) {
                        this.field1490 -= 4096;
                    }
                    this.field1489 += this.field1497;
                    this.field1485 += this.field1494;
                    if (~this.field1489 > -1) {
                        this.field1489 = 0;
                    }
                    if (this.field1489 > 4096) {
                        this.field1489 = 4096;
                    }
                    if (~this.field1485 > -1) {
                        this.field1485 = 0;
                    }
                    if (this.field1485 > 4096) {
                        this.field1485 = 4096;
                    }
                    this.method499(this.field1485, this.field1490, arg1 ^ -24, this.field1489);
                    var8[var11] = this.field1499;
                    var7[var11] = this.field1504;
                    var9[var11] = this.field1493;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V")
    public static final void method497(byte arg0) {
        if (arg0 < 85) {
            field1505 = null;
        }
        class112 var1 = (class112) class58.field1253.method242(16711680);
        ++field1491;
        while (var1 != null) {
            if (~var1.field2098 != 0) {
                var1.method592((byte) -128);
            } else {
                var1.field2096 = 0;
                class74.method468(101, var1);
            }
            var1 = (class112) class58.field1253.method237(10);
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(B)V")
    public static void method498(byte arg0) {
        field1502 = null;
        field1484 = null;
        field1505 = null;
        field1500 = null;
        if (arg0 == -5) {
            field1495 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    private final void method499(int arg0, int arg1, int arg2, int arg3) {
        ++field1498;
        int var5 = ~arg0 < -2049 ? arg0 - (-arg3 - -(arg0 * arg3 >> 12)) : (arg3 + 4096) * arg0 >> 12;
        int var6 = -16 / ((58 - arg2) / 43);
        if (var5 <= 0) {
            this.field1499 = this.field1504 = this.field1493 = arg0;
        } else {
            int var7 = arg1 * 6;
            int var8 = -var5 + arg0 - -arg0;
            int var9 = var7 >> 12;
            int var10 = (-var8 + var5 << 12) / var5;
            int var11 = -(var9 << 12) + var7;
            int var13 = var10 * var5 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 + var14;
            int var16 = var5 - var14;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (~var9 == -6) {
                                    this.field1499 = var5;
                                    this.field1504 = var8;
                                    this.field1493 = var16;
                                }
                            } else {
                                this.field1504 = var8;
                                this.field1493 = var5;
                                this.field1499 = var15;
                            }
                        } else {
                            this.field1499 = var8;
                            this.field1493 = var5;
                            this.field1504 = var16;
                        }
                    } else {
                        this.field1504 = var5;
                        this.field1499 = var8;
                        this.field1493 = var15;
                    }
                } else {
                    this.field1504 = var5;
                    this.field1493 = var8;
                    this.field1499 = var16;
                }
            } else {
                this.field1493 = var8;
                this.field1499 = var5;
                this.field1504 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class77() {
        super(1, false);
    }
}
