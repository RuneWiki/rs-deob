import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class77 extends class102 {

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "Z")
    public boolean field1534 = false;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "Lad;")
    private class214 field1529;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "Z")
    private boolean field1521;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "Z")
    private boolean field1526;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "Lr;")
    public static class66 field1519 = class93.method641(43, " )2> ");

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "Lr;")
    public static class66 field1523 = class93.method641(43, " ");

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field1527 = 0;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "F")
    private float field1531;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "[I")
    public static int[] field1517;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "[I")
    private int[] field1530;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "[[I")
    public static int[][] field1533;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)Z")
    public static final boolean method544(int arg0, int arg1) {
        if (arg1 != -207106658) {
            method546((byte) 70, (class63) null);
        }
        field1520++;
        return (arg0 & 0x7ECFBAC6) >> 30 != 0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lri;ILcj;Z)[I")
    public final int[] method545(class116 arg0, int arg1, class28 arg2, boolean arg3) {
        field1537++;
        if (!this.field1529.method1376(arg0, 0, arg2)) {
            return null;
        }
        if (arg1 > -30) {
            this.method550(-97, -107);
        }
        int var5 = arg3 ? 64 : 128;
        return this.field1529.method1374(this.field1526, false, arg2, arg0, var5, var5, 1.0D, 2000);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLha;)Lha;")
    public static final class63 method546(byte arg0, class63 arg1) {
        field1538++;
        if (arg1.field1122 != -1) {
            return class54.method367(arg1.field1122, (byte) -80);
        }
        int var2 = arg1.field1115 >>> 16;
        if (arg0 < 121) {
            field1523 = null;
        }
        for (class75 var3 = (class75) class230.field3981.method1382(-32642); var3 != null; var3 = (class75) class230.field3981.method1386((byte) -125)) {
            if (var3.field1492 == var2) {
                return class54.method367((int) var3.field1560, (byte) -80);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
    public static final void method547(int arg0) {
        field1528++;
        class84.field1627.method570(111);
        int var1 = class84.field1627.method572((byte) 0, 1);
        if (var1 == 0) {
            return;
        }
        if (arg0 != -19342) {
            field1527 = -21;
        }
        int var2 = class84.field1627.method572((byte) 0, 2);
        if (var2 == 0) {
            class83.field1599[class240.field4170++] = 2047;
        } else if (var2 == 1) {
            int var3 = class84.field1627.method572((byte) 0, 3);
            class207.field3595.method734(false, var3, (byte) 21);
            int var4 = class84.field1627.method572((byte) 0, 1);
            if (var4 == 1) {
                class83.field1599[class240.field4170++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class84.field1627.method572((byte) 0, 3);
            class207.field3595.method734(true, var5, (byte) 21);
            int var6 = class84.field1627.method572((byte) 0, 3);
            class207.field3595.method734(true, var6, (byte) 21);
            int var7 = class84.field1627.method572((byte) 0, 1);
            if (var7 == 1) {
                class83.field1599[class240.field4170++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class84.field1627.method572((byte) 0, 7);
            int var9 = class84.field1627.method572((byte) 0, 1);
            class196.field3401 = class84.field1627.method572((byte) 0, 2);
            int var10 = class84.field1627.method572((byte) 0, 1);
            if (var10 == 1) {
                class83.field1599[class240.field4170++] = 2047;
            }
            int var11 = class84.field1627.method572((byte) 0, 7);
            class207.field3595.method731(var11, (byte) -68, var8, var9 == 1);
        }
    }

    @OriginalMember(owner = "client!fe", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field1535++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lri;ILcj;)Z")
    public final boolean method548(class116 arg0, int arg1, class28 arg2) {
        field1525++;
        if (arg1 != -5947) {
            this.method552((byte) -13, (class28) null, (class116) null, -0.6478323F, true);
        }
        return this.field1529.method1376(arg0, 0, arg2);
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
    public static void method549(int arg0) {
        field1523 = null;
        if (arg0 <= -63) {
            field1517 = null;
            field1533 = null;
            field1519 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(II)V")
    public final void method550(int arg0, int arg1) {
        field1518++;
        if (arg1 != -27276) {
            field1523 = null;
        }
        if (this.field1530 == null || this.field1532 == 0 && this.field1536 == 0) {
            return;
        }
        if (class85.field1669 == null || class85.field1669.length < this.field1530.length) {
            class85.field1669 = new int[this.field1530.length];
        }
        int var3 = this.field1530.length == 4096 ? 64 : 128;
        int var4 = this.field1530.length;
        int var5 = this.field1536 * arg0;
        int var6 = var3 - 1;
        int var7 = this.field1532 * arg0 * var3;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var9 + var7 & var8;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var6 & var5 + var12) + var11;
                class85.field1669[var13] = this.field1530[var14];
            }
        }
        int[] var10 = this.field1530;
        this.field1530 = class85.field1669;
        class85.field1669 = var10;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
    public static final void method551(byte arg0) {
        class64.field1258 = 0L;
        field1524++;
        if (arg0 != -118) {
            field1519 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLcj;Lri;FZ)[I")
    public final int[] method552(byte arg0, class28 arg1, class116 arg2, float arg3, boolean arg4) {
        field1522++;
        if (this.field1530 == null || this.field1531 != arg3) {
            if (!this.field1529.method1376(arg2, 0, arg1)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field1530 = this.field1529.method1374(this.field1526, true, arg1, arg2, var6, var6, (double) arg3, 2000);
            this.field1531 = arg3;
            if (this.field1521) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int var10 = var6;
                int var11 = var6;
                int var12 = var6;
                int[] var13 = new int[var6 * var6];
                int var14 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var14; var34 >= 0; var34--) {
                        var11--;
                        int var35 = this.field1530[var11];
                        var8[var34] += class115.method767(255, var35 >> 16);
                        var7[var34] += class115.method767(255, var35 >> 8);
                        var9[var34] += class115.method767(255, var35);
                    }
                    if (var11 == 0) {
                        var11 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var24--;
                        var23 += var8[var24];
                        var22 += var9[var24];
                        var21 += var7[var24];
                        if (var24 == 0) {
                            var24 = var10;
                        }
                    }
                    for (int var27 = var14; var27 >= 0; var27--) {
                        var25--;
                        int var31 = var22 / 9;
                        int var32 = var23 / 9;
                        int var33 = var21 / 9;
                        var19--;
                        var13[var19] = class73.method521(class73.method521(var32 << 16, var33 << 8), var31);
                        var24--;
                        var22 += var9[var24] - var9[var25];
                        var23 += var8[var24] - var8[var25];
                        var21 += var7[var24] - var7[var25];
                        if (var25 == 0) {
                            var25 = var10;
                        }
                        if (var24 == 0) {
                            var24 = var10;
                        }
                    }
                    for (int var28 = var14; var28 >= 0; var28--) {
                        var11--;
                        int var29 = this.field1530[var11];
                        var12--;
                        int var30 = this.field1530[var12];
                        var8[var28] += -class115.method767(255, var30 >> 16) + (class115.method767(var29, 16759453) >> 16);
                        var7[var28] += -(class115.method767(65376, var30) >> 8) + (class115.method767(var29, 65471) >> 8);
                        var9[var28] += class115.method767(255, var29) - class115.method767(255, var30);
                    }
                    if (var11 == 0) {
                        var11 = var17;
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                this.field1530 = var13;
            }
        }
        int var36 = 120 / ((arg0 - 49) / 61);
        return this.field1530;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Llh;)V")
    public class77(class249 arg0) {
        this.field1529 = new class214(arg0);
        this.field1521 = arg0.method1677(-6677) == 1;
        this.field1526 = arg0.method1677(-6677) == 1;
        arg0.method1677(-6677);
        arg0.method1677(-6677);
        int var2 = arg0.method1677(-6677) & 0x3;
        this.field1536 = arg0.method1682(3390);
        this.field1532 = arg0.method1682(3390);
        arg0.method1677(-6677);
        arg0.method1677(-6677);
    }
}
