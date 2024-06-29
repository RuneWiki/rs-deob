import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class71 extends class80 {

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    private int field1412 = 81;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    private int field1424 = 0;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
    private int field1428 = 1024;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
    private int field1423 = 204;

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "I")
    private int field1434 = 8;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    private int field1426 = 4;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    private int field1411 = 1024;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
    private int field1429 = 409;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "Ls;")
    public static class186 field1421 = new class186(77, 4);

    @OriginalMember(owner = "client!eg", name = "hb", descriptor = "F")
    public static float field1435 = 0.25F;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "Lmo;")
    public static class531 field1431 = new class531(5, 5);

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!eg", name = "ib", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!eg", name = "jb", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "[I")
    private int[] field1410;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "[[I")
    private int[][] field1417;

    @OriginalMember(owner = "client!eg", name = "kb", descriptor = "[[I")
    private int[][] field1438;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        if (!arg0) {
            method612(-90);
        }
        ++field1422;
        this.method609((byte) -119);
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(Z)V")
    public static void method607(boolean arg0) {
        field1421 = null;
        if (arg0) {
            field1431 = null;
        }
        field1431 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLms;)V")
    public static final void method608(boolean arg0, class535 arg1) {
        ++field1432;
        if (!arg0) {
            if (arg1 instanceof class163) {
                class163 var2 = (class163) arg1;
                if (var2.field2613 != null) {
                    class347.method2169(class15.field266.field6084 != var2.field6084, (byte) 51, var2);
                    return;
                }
            } else {
                if (!(arg1 instanceof class366)) {
                    return;
                }
                class366 var3 = (class366) arg1;
                class422.method2577(22314, class15.field266.field6084 != var3.field6084, var3);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
    private final void method609(byte arg0) {
        ++field1420;
        Random var2 = new Random((long) this.field1434);
        this.field1416 = 4096 / this.field1434;
        if (arg0 < -94) {
            this.field1436 = 4096 / this.field1426;
            this.field1413 = this.field1412 / 2;
            int var3 = this.field1436 / 2;
            int var4 = this.field1416 / 2;
            this.field1438 = new int[this.field1434][this.field1426];
            this.field1410 = new int[this.field1434 - -1];
            this.field1417 = new int[this.field1434][this.field1426 + 1];
            this.field1410[0] = 0;
            for (int var5 = 0; ~var5 > ~this.field1434; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field1416;
                    int var7 = (-2048 + class32.method222(var2, -13086, 4096)) * this.field1423 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field1410[var5] = this.field1410[var5 + -1] - -var8;
                }
                this.field1417[var5][0] = 0;
                for (int var9 = 0; this.field1426 > var9; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field1436;
                        int var11 = (class32.method222(var2, -13086, 4096) - 2048) * this.field1429 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field1417[var5][var9] = this.field1417[var5][var9 + -1] + var12;
                    }
                    this.field1438[var5][var9] = ~this.field1411 >= -1 ? 4096 : -class32.method222(var2, -13086, this.field1411) + 4096;
                }
                this.field1417[var5][this.field1426] = 4096;
            }
            this.field1410[this.field1434] = 4096;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field1411 = arg2.method1841((byte) -126);
                                    }
                                } else {
                                    this.field1412 = arg2.method1841((byte) -119);
                                }
                            } else {
                                this.field1424 = arg2.method1841((byte) -126);
                            }
                        } else {
                            this.field1428 = arg2.method1841((byte) -119);
                        }
                    } else {
                        this.field1423 = arg2.method1841((byte) 16);
                    }
                } else {
                    this.field1429 = arg2.method1841((byte) 7);
                }
            } else {
                this.field1434 = arg2.method1858(-3256);
            }
        } else {
            this.field1426 = arg2.method1858(-3256);
        }
        int var5 = 114 % ((28 - arg1) / 53);
        ++field1419;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class71() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field1427;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (arg1 != -16828) {
            return null;
        } else {
            if (super.field1601.field124) {
                int var4 = 0;
                int var5;
                for (var5 = class44.field795[arg0] - -this.field1424; var5 < 0; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (var4 < this.field1434 && ~var5 <= ~this.field1410[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = (1 & var4) == 0;
                int var8 = this.field1410[var4];
                int var9 = this.field1410[var4 - 1];
                if (var5 > var9 - -this.field1413 && ~(-this.field1413 + var8) < ~var5) {
                    for (int var10 = 0; var10 < class137.field2308; ++var10) {
                        int var11 = 0;
                        int var12 = !var7 ? -this.field1428 : this.field1428;
                        int var13;
                        for (var13 = class460.field6860[var10] - -(this.field1436 * var12 >> 12); var13 < 0; var13 += 4096) {
                        }
                        while (~var13 < -4097) {
                            var13 -= 4096;
                        }
                        while (var11 < this.field1426 && ~this.field1417[var6][var11] >= ~var13) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field1417[var6][var14];
                        int var16 = this.field1417[var6][var11];
                        if (var13 > this.field1413 + var15 && ~(var16 - this.field1413) < ~var13) {
                            var3[var10] = this.field1438[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class394.method2451(var3, 0, class137.field2308, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(III)I")
    public static final int method610(int arg0, int arg1, int arg2) {
        ++field1425;
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var5 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var5;
        }
        int var4 = -64 / ((-76 - arg1) / 34);
        return arg0;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(III)Z")
    public static final boolean method611(int arg0, int arg1, int arg2) {
        int var3 = -19 / ((arg2 - 23) / 43);
        ++field1414;
        return (arg0 & 544) == 544 | (arg0 & 24) != 0;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public static final void method612(int arg0) {
        ++field1430;
        if (class480.field7076 != 3) {
            class444.field6606 = class134.field2254;
        }
        if (arg0 != 734) {
            field1437 = -52;
        }
    }
}
