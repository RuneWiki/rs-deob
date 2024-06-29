import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class98 extends class148 {

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    private int field1431 = 409;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    private int field1430 = 0;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    private int field1429 = 4;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    private int field1428 = 81;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    private int field1433 = 1024;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    private int field1435 = 204;

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
    private int field1441 = 1024;

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    private int field1437 = 8;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "Lki;")
    public static class498 field1425 = new class498(33, 3);

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "I")
    public static int field1439 = 0;

    @OriginalMember(owner = "client!pj", name = "bb", descriptor = "Llt;")
    public static class475 field1442 = new class475("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    private int field1424;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client!pj", name = "cb", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "[I")
    private int[] field1444;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "[[I")
    private int[][] field1432;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "[[I")
    private int[][] field1436;

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(B)V")
    public static void method602(byte arg0) {
        if (arg0 < 49) {
            method604(-54, -8);
        }
        field1425 = null;
        field1442 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        this.method603(4096);
        if (arg0 != -1285532468) {
            this.method23(89, (class209) null, 34);
        }
        ++field1438;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    private final void method603(int arg0) {
        ++field1434;
        Random var2 = new Random((long) this.field1437);
        this.field1445 = this.field1428 / 2;
        this.field1424 = arg0 / this.field1429;
        this.field1440 = 4096 / this.field1437;
        int var3 = this.field1424 / 2;
        this.field1444 = new int[this.field1437 - -1];
        this.field1432 = new int[this.field1437][this.field1429];
        int var4 = this.field1440 / 2;
        this.field1436 = new int[this.field1437][this.field1429 + 1];
        this.field1444[0] = 0;
        for (int var5 = 0; ~var5 > ~this.field1437; ++var5) {
            if (var5 > 0) {
                int var6 = this.field1440;
                int var7 = (-2048 + class317.method1984(-128, var2, 4096)) * this.field1435 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1444[var5] = this.field1444[var5 + -1] + var8;
            }
            this.field1436[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field1429; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field1424;
                    int var11 = (-2048 + class317.method1984(-63, var2, 4096)) * this.field1431 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1436[var5][var9] = this.field1436[var5][var9 + -1] + var12;
                }
                this.field1432[var5][var9] = ~this.field1441 < -1 ? 4096 - class317.method1984(119, var2, this.field1441) : 4096;
            }
            this.field1436[var5][this.field1429] = 4096;
        }
        this.field1444[this.field1437] = 4096;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field1441 = arg1.method1450((byte) 92);
                                    }
                                } else {
                                    this.field1428 = arg1.method1450((byte) 97);
                                }
                            } else {
                                this.field1430 = arg1.method1450((byte) 57);
                            }
                        } else {
                            this.field1433 = arg1.method1450((byte) 29);
                        }
                    } else {
                        this.field1435 = arg1.method1450((byte) 103);
                    }
                } else {
                    this.field1431 = arg1.method1450((byte) 49);
                }
            } else {
                this.field1437 = arg1.method1428(32122);
            }
        } else {
            this.field1429 = arg1.method1428(32122);
        }
        ++field1426;
        int var5 = 57 / ((arg2 - -88) / 33);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)I")
    public static final int method604(int arg0, int arg1) {
        if (arg0 != 204) {
            field1425 = null;
        }
        ++field1443;
        return arg1 & 127;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIII)V")
    public static final void method605(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 95) {
            method602((byte) -47);
        }
        ++field1427;
        class338 var5 = class230.method1580(8, -1332166328, arg4);
        var5.method2053(-109);
        var5.field4756 = arg2;
        var5.field4748 = arg1;
        var5.field4751 = arg3;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field1446;
        int[] var3 = super.field2193.method497(arg1, false);
        if (arg0 >= -65) {
            return null;
        } else {
            if (super.field2193.field1312) {
                int var4 = 0;
                int var5;
                for (var5 = class456.field6752[arg1] + this.field1430; var5 < 0; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (~this.field1437 < ~var4 && this.field1444[var4] <= var5) {
                    ++var4;
                }
                int var6 = var4 - 1;
                boolean var7 = ~(1 & var4) == -1;
                int var8 = this.field1444[var4];
                int var9 = this.field1444[var4 + -1];
                if (~var5 < ~(this.field1445 + var9) && ~(var8 - this.field1445) < ~var5) {
                    for (int var10 = 0; ~var10 > ~class320.field4579; ++var10) {
                        int var11 = 0;
                        int var12 = var7 ? this.field1433 : -this.field1433;
                        int var13;
                        for (var13 = (this.field1424 * var12 >> 12) + class517.field7539[var10]; ~var13 > -1; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (this.field1429 > var11 && ~this.field1436[var6][var11] >= ~var13) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field1436[var6][var11];
                        int var16 = this.field1436[var6][var14];
                        if (var13 > var16 - -this.field1445 && ~var13 > ~(-this.field1445 + var15)) {
                            var3[var10] = this.field1432[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class520.method3074(var3, 0, class320.field4579, 0);
                }
            }
            return var3;
        }
    }
}
