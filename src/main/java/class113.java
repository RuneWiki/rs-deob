import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class113 extends class131 {

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public int field1518 = 0;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Z")
    private boolean field1543 = false;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "B")
    public byte field1545 = 0;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public int field1514 = 0;

    @OriginalMember(owner = "client!i", name = "hb", descriptor = "I")
    public int field1555 = 0;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "[I")
    public int[] field1522;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "[I")
    public int[] field1515;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "[I")
    public int[] field1523;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "[I")
    public int[] field1533;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "[I")
    public int[] field1542;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "[I")
    public int[] field1535;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "[I")
    public int[] field1532;

    @OriginalMember(owner = "client!i", name = "ib", descriptor = "[B")
    public byte[] field1556;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "[B")
    public byte[] field1540;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "[B")
    public byte[] field1536;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[S")
    public short[] field1511;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "[S")
    public short[] field1516;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "[B")
    public byte[] field1549;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "[I")
    public int[] field1534;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "[B")
    public byte[] field1509;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "[S")
    public short[] field1528;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "[S")
    public short[] field1527;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "[S")
    public short[] field1530;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "[S")
    private short[] field1537;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "[S")
    private short[] field1541;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "[S")
    private short[] field1521;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "[B")
    private byte[] field1546;

    @OriginalMember(owner = "client!i", name = "jb", descriptor = "[B")
    private byte[] field1557;

    @OriginalMember(owner = "client!i", name = "kb", descriptor = "[B")
    private byte[] field1558;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "[B")
    private byte[] field1538;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "[B")
    private byte[] field1529;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "[S")
    public short[] field1539;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "[S")
    public short[] field1525;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "[[I")
    public int[][] field1544;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "[[I")
    public int[][] field1517;

    @OriginalMember(owner = "client!i", name = "fb", descriptor = "[Lfl;")
    public class80[] field1553;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "[Lud;")
    public class51[] field1531;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "[Lfl;")
    public class80[] field1513;

    @OriginalMember(owner = "client!i", name = "gb", descriptor = "S")
    public short field1554;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "S")
    public short field1519;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[I")
    private static int[] field1510 = class297.field4698;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    private static int field1508 = 0;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "[I")
    private static int[] field1520 = class297.field4697;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "[I")
    private static int[] field1507 = new int[10000];

    @OriginalMember(owner = "client!i", name = "C", descriptor = "[I")
    private static int[] field1524 = new int[10000];

    @OriginalMember(owner = "client!i", name = "q", descriptor = "S")
    private short field1512;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "S")
    private short field1526;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "S")
    private short field1547;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "S")
    private short field1548;

    @OriginalMember(owner = "client!i", name = "db", descriptor = "S")
    private short field1551;

    @OriginalMember(owner = "client!i", name = "eb", descriptor = "S")
    private short field1552;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I")
    public final int method700(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1514; var4++) {
            if (this.field1522[var4] == arg0 && this.field1515[var4] == arg1 && this.field1523[var4] == arg2) {
                return var4;
            }
        }
        this.field1522[this.field1514] = arg0;
        this.field1515[this.field1514] = arg1;
        this.field1523[this.field1514] = arg2;
        this.field1518 = ++this.field1514;
        return this.field1514 - 1;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
    public final void method701() {
        for (int var1 = 0; var1 < this.field1514; var1++) {
            int var2 = this.field1522[var1];
            this.field1522[var1] = this.field1523[var1];
            this.field1523[var1] = -var2;
        }
        this.method707();
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public final void method702(int arg0) {
        int var2 = field1520[arg0];
        int var3 = field1510[arg0];
        for (int var4 = 0; var4 < this.field1514; var4++) {
            int var5 = this.field1523[var4] * var2 + this.field1522[var4] * var3 >> 16;
            this.field1523[var4] = this.field1523[var4] * var3 - this.field1522[var4] * var2 >> 16;
            this.field1522[var4] = var5;
        }
        this.method707();
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([B)V")
    private final void method703(byte[] arg0) {
        class216 var2 = new class216(arg0);
        class216 var3 = new class216(arg0);
        class216 var4 = new class216(arg0);
        class216 var5 = new class216(arg0);
        class216 var6 = new class216(arg0);
        class216 var7 = new class216(arg0);
        class216 var8 = new class216(arg0);
        var2.field3021 = arg0.length - 23;
        int var9 = var2.method1380(true);
        int var10 = var2.method1380(true);
        int var11 = var2.method1407(121);
        int var12 = var2.method1407(122);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method1407(107);
        int var16 = var2.method1407(110);
        int var17 = var2.method1407(103);
        int var18 = var2.method1407(126);
        int var19 = var2.method1407(116);
        int var20 = var2.method1380(true);
        int var21 = var2.method1380(true);
        int var22 = var2.method1380(true);
        int var23 = var2.method1380(true);
        int var24 = var2.method1380(true);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field1509 = new byte[var11];
            var2.field3021 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field1509[var28] = var2.method1355(true);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field1514 = var9;
        this.field1555 = var10;
        this.field1550 = var11;
        this.field1522 = new int[var9];
        this.field1515 = new int[var9];
        this.field1523 = new int[var9];
        this.field1542 = new int[var10];
        this.field1535 = new int[var10];
        this.field1532 = new int[var10];
        if (var19 == 1) {
            this.field1533 = new int[var9];
        }
        if (var13) {
            this.field1556 = new byte[var10];
        }
        if (var15 == 255) {
            this.field1540 = new byte[var10];
        } else {
            this.field1545 = (byte) var15;
        }
        if (var16 == 1) {
            this.field1536 = new byte[var10];
        }
        if (var17 == 1) {
            this.field1534 = new int[var10];
        }
        if (var18 == 1) {
            this.field1516 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field1549 = new byte[var10];
        }
        this.field1511 = new short[var10];
        if (var11 > 0) {
            this.field1528 = new short[var11];
            this.field1527 = new short[var11];
            this.field1530 = new short[var11];
            if (var26 > 0) {
                this.field1537 = new short[var26];
                this.field1541 = new short[var26];
                this.field1521 = new short[var26];
                this.field1546 = new byte[var26];
                this.field1557 = new byte[var26];
                this.field1558 = new byte[var26];
            }
            if (var27 > 0) {
                this.field1538 = new byte[var27];
                this.field1529 = new byte[var27];
            }
        }
        var2.field3021 = var11;
        var3.field3021 = var46;
        var4.field3021 = var48;
        var5.field3021 = var50;
        var6.field3021 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var84 = var2.method1407(126);
            int var85 = 0;
            if ((var84 & 0x1) != 0) {
                var85 = var3.method1408(false);
            }
            int var86 = 0;
            if ((var84 & 0x2) != 0) {
                var86 = var4.method1408(false);
            }
            int var87 = 0;
            if ((var84 & 0x4) != 0) {
                var87 = var5.method1408(false);
            }
            this.field1522[var69] = var66 + var85;
            this.field1515[var69] = var67 + var86;
            this.field1523[var69] = var68 + var87;
            var66 = this.field1522[var69];
            var67 = this.field1515[var69];
            var68 = this.field1523[var69];
            if (var19 == 1) {
                this.field1533[var69] = var6.method1407(123);
            }
        }
        var2.field3021 = var44;
        var3.field3021 = var33;
        var4.field3021 = var36;
        var5.field3021 = var39;
        var6.field3021 = var37;
        var7.field3021 = var42;
        var8.field3021 = var41;
        for (int var70 = 0; var70 < var10; var70++) {
            this.field1511[var70] = (short) var2.method1380(true);
            if (var13) {
                this.field1556[var70] = var3.method1355(true);
            }
            if (var15 == 255) {
                this.field1540[var70] = var4.method1355(true);
            }
            if (var16 == 1) {
                this.field1536[var70] = var5.method1355(true);
            }
            if (var17 == 1) {
                this.field1534[var70] = var6.method1407(106);
            }
            if (var18 == 1) {
                this.field1516[var70] = (short) (var7.method1380(true) - 1);
            }
            if (this.field1549 != null) {
                if (this.field1516[var70] == -1) {
                    this.field1549[var70] = -1;
                } else {
                    this.field1549[var70] = (byte) (var8.method1407(110) - 1);
                }
            }
        }
        this.field1518 = -1;
        var2.field3021 = var35;
        var3.field3021 = var32;
        int var71 = 0;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        for (int var75 = 0; var75 < var10; var75++) {
            int var80 = var3.method1407(107);
            if (var80 == 1) {
                var71 = var2.method1408(false) + var74;
                var72 = var2.method1408(false) + var71;
                var73 = var2.method1408(false) + var72;
                var74 = var73;
                this.field1542[var75] = var71;
                this.field1535[var75] = var72;
                this.field1532[var75] = var73;
                if (var71 > this.field1518) {
                    this.field1518 = var71;
                }
                if (var72 > this.field1518) {
                    this.field1518 = var72;
                }
                if (var73 > this.field1518) {
                    this.field1518 = var73;
                }
            }
            if (var80 == 2) {
                var72 = var73;
                var73 = var2.method1408(false) + var74;
                var74 = var73;
                this.field1542[var75] = var71;
                this.field1535[var75] = var72;
                this.field1532[var75] = var73;
                if (var73 > this.field1518) {
                    this.field1518 = var73;
                }
            }
            if (var80 == 3) {
                var71 = var73;
                var73 = var2.method1408(false) + var74;
                var74 = var73;
                this.field1542[var75] = var71;
                this.field1535[var75] = var72;
                this.field1532[var75] = var73;
                if (var73 > this.field1518) {
                    this.field1518 = var73;
                }
            }
            if (var80 == 4) {
                int var83 = var71;
                var71 = var72;
                var72 = var83;
                var73 = var2.method1408(false) + var74;
                var74 = var73;
                this.field1542[var75] = var71;
                this.field1535[var75] = var83;
                this.field1532[var75] = var73;
                if (var73 > this.field1518) {
                    this.field1518 = var73;
                }
            }
        }
        this.field1518++;
        var2.field3021 = var52;
        var3.field3021 = var54;
        var4.field3021 = var56;
        var5.field3021 = var58;
        var6.field3021 = var60;
        var7.field3021 = var62;
        for (int var76 = 0; var76 < var11; var76++) {
            int var79 = this.field1509[var76] & 0xFF;
            if (var79 == 0) {
                this.field1528[var76] = (short) var2.method1380(true);
                this.field1527[var76] = (short) var2.method1380(true);
                this.field1530[var76] = (short) var2.method1380(true);
            }
            if (var79 == 1) {
                this.field1528[var76] = (short) var3.method1380(true);
                this.field1527[var76] = (short) var3.method1380(true);
                this.field1530[var76] = (short) var3.method1380(true);
                this.field1537[var76] = (short) var4.method1380(true);
                this.field1541[var76] = (short) var4.method1380(true);
                this.field1521[var76] = (short) var4.method1380(true);
                this.field1546[var76] = var5.method1355(true);
                this.field1557[var76] = var6.method1355(true);
                this.field1558[var76] = var7.method1355(true);
            }
            if (var79 == 2) {
                this.field1528[var76] = (short) var3.method1380(true);
                this.field1527[var76] = (short) var3.method1380(true);
                this.field1530[var76] = (short) var3.method1380(true);
                this.field1537[var76] = (short) var4.method1380(true);
                this.field1541[var76] = (short) var4.method1380(true);
                this.field1521[var76] = (short) var4.method1380(true);
                this.field1546[var76] = var5.method1355(true);
                this.field1557[var76] = var6.method1355(true);
                this.field1558[var76] = var7.method1355(true);
                this.field1538[var76] = var7.method1355(true);
                this.field1529[var76] = var7.method1355(true);
            }
            if (var79 == 3) {
                this.field1528[var76] = (short) var3.method1380(true);
                this.field1527[var76] = (short) var3.method1380(true);
                this.field1530[var76] = (short) var3.method1380(true);
                this.field1537[var76] = (short) var4.method1380(true);
                this.field1541[var76] = (short) var4.method1380(true);
                this.field1521[var76] = (short) var4.method1380(true);
                this.field1546[var76] = var5.method1355(true);
                this.field1557[var76] = var6.method1355(true);
                this.field1558[var76] = var7.method1355(true);
            }
        }
        if (!var14) {
            return;
        }
        var2.field3021 = var64;
        int var77 = var2.method1407(104);
        if (var77 > 0) {
            var2.field3021 += var77 * 4;
        }
        int var78 = var2.method1407(120);
        if (var78 > 0) {
            var2.field3021 += var78 * 4;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
    public final void method704() {
        for (int var1 = 0; var1 < this.field1514; var1++) {
            this.field1523[var1] = -this.field1523[var1];
        }
        for (int var2 = 0; var2 < this.field1555; var2++) {
            int var3 = this.field1542[var2];
            this.field1542[var2] = this.field1532[var2];
            this.field1532[var2] = var3;
        }
        this.method707();
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
    public final void method705() {
        if (this.field1553 != null) {
            return;
        }
        this.field1553 = new class80[this.field1518];
        for (int var1 = 0; var1 < this.field1518; var1++) {
            this.field1553[var1] = new class80();
        }
        for (int var2 = 0; var2 < this.field1555; var2++) {
            int var3 = this.field1542[var2];
            int var4 = this.field1535[var2];
            int var5 = this.field1532[var2];
            int var6 = this.field1522[var4] - this.field1522[var3];
            int var7 = this.field1515[var4] - this.field1515[var3];
            int var8 = this.field1523[var4] - this.field1523[var3];
            int var9 = this.field1522[var5] - this.field1522[var3];
            int var10 = this.field1515[var5] - this.field1515[var3];
            int var11 = this.field1523[var5] - this.field1523[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field1556 == null) {
                var19 = 0;
            } else {
                var19 = this.field1556[var2];
            }
            if (var19 == 0) {
                class80 var20 = this.field1553[var3];
                var20.field956 += var16;
                var20.field955 += var17;
                var20.field945 += var18;
                var20.field951++;
                class80 var21 = this.field1553[var4];
                var21.field956 += var16;
                var21.field955 += var17;
                var21.field945 += var18;
                var21.field951++;
                class80 var22 = this.field1553[var5];
                var22.field956 += var16;
                var22.field955 += var17;
                var22.field945 += var18;
                var22.field951++;
            } else if (var19 == 1) {
                if (this.field1531 == null) {
                    this.field1531 = new class51[this.field1555];
                }
                class51 var23 = this.field1531[var2] = new class51();
                var23.field579 = var16;
                var23.field577 = var17;
                var23.field587 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
    private final void method706(int arg0) {
        int var2 = field1520[arg0];
        int var3 = field1510[arg0];
        for (int var4 = 0; var4 < this.field1514; var4++) {
            int var5 = this.field1515[var4] * var3 - this.field1523[var4] * var2 >> 16;
            this.field1523[var4] = this.field1523[var4] * var3 + this.field1515[var4] * var2 >> 16;
            this.field1515[var4] = var5;
        }
        this.method707();
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
    private final void method707() {
        this.field1553 = null;
        this.field1513 = null;
        this.field1531 = null;
        this.field1543 = false;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lca;IIIZ)V")
    public final void method708(class131 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class113 var6 = (class113) arg0;
        var6.method731();
        var6.method705();
        field1508++;
        int var7 = 0;
        int[] var8 = var6.field1522;
        int var9 = var6.field1518;
        for (int var10 = 0; var10 < this.field1518; var10++) {
            class80 var13 = this.field1553[var10];
            if (var13.field951 != 0) {
                int var14 = this.field1515[var10] - arg2;
                if (var14 >= var6.field1526 && var14 <= var6.field1512) {
                    int var15 = this.field1522[var10] - arg1;
                    if (var15 >= var6.field1552 && var15 <= var6.field1551) {
                        int var16 = this.field1523[var10] - arg3;
                        if (var16 >= var6.field1547 && var16 <= var6.field1548) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class80 var18 = var6.field1553[var17];
                                if (var8[var17] == var15 && var6.field1523[var17] == var16 && var6.field1515[var17] == var14 && var18.field951 != 0) {
                                    if (this.field1513 == null) {
                                        this.field1513 = new class80[this.field1518];
                                    }
                                    if (var6.field1513 == null) {
                                        var6.field1513 = new class80[var9];
                                    }
                                    class80 var19 = this.field1513[var10];
                                    if (var19 == null) {
                                        var19 = this.field1513[var10] = new class80(var13);
                                    }
                                    class80 var20 = var6.field1513[var17];
                                    if (var20 == null) {
                                        var20 = var6.field1513[var17] = new class80(var18);
                                    }
                                    var19.field956 += var18.field956;
                                    var19.field955 += var18.field955;
                                    var19.field945 += var18.field945;
                                    var19.field951 += var18.field951;
                                    var20.field956 += var13.field956;
                                    var20.field955 += var13.field955;
                                    var20.field945 += var13.field945;
                                    var20.field951 += var13.field951;
                                    var7++;
                                    field1524[var10] = field1508;
                                    field1507[var17] = field1508;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field1555; var11++) {
            if (field1524[this.field1542[var11]] == field1508 && field1524[this.field1535[var11]] == field1508 && field1524[this.field1532[var11]] == field1508) {
                if (this.field1556 == null) {
                    this.field1556 = new byte[this.field1555];
                }
                this.field1556[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field1555; var12++) {
            if (field1507[var6.field1542[var12]] == field1508 && field1507[var6.field1535[var12]] == field1508 && field1507[var6.field1532[var12]] == field1508) {
                if (var6.field1556 == null) {
                    var6.field1556 = new byte[var6.field1555];
                }
                var6.field1556[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([[III)I")
    private static final int method709(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[[I[[IIIIZZ)Li;")
    public final class113 method710(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method731();
        int var10 = this.field1552 + arg4;
        int var11 = this.field1551 + arg4;
        int var12 = this.field1547 + arg6;
        int var13 = this.field1548 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class113 var18;
        if (arg7) {
            var18 = new class113();
            var18.field1514 = this.field1514;
            var18.field1518 = this.field1518;
            var18.field1555 = this.field1555;
            var18.field1550 = this.field1550;
            var18.field1542 = this.field1542;
            var18.field1535 = this.field1535;
            var18.field1532 = this.field1532;
            var18.field1556 = this.field1556;
            var18.field1540 = this.field1540;
            var18.field1536 = this.field1536;
            var18.field1549 = this.field1549;
            var18.field1511 = this.field1511;
            var18.field1516 = this.field1516;
            var18.field1545 = this.field1545;
            var18.field1509 = this.field1509;
            var18.field1528 = this.field1528;
            var18.field1527 = this.field1527;
            var18.field1530 = this.field1530;
            var18.field1537 = this.field1537;
            var18.field1541 = this.field1541;
            var18.field1521 = this.field1521;
            var18.field1546 = this.field1546;
            var18.field1557 = this.field1557;
            var18.field1558 = this.field1558;
            var18.field1538 = this.field1538;
            var18.field1529 = this.field1529;
            var18.field1533 = this.field1533;
            var18.field1534 = this.field1534;
            var18.field1544 = this.field1544;
            var18.field1517 = this.field1517;
            var18.field1554 = this.field1554;
            var18.field1519 = this.field1519;
            var18.field1553 = this.field1553;
            var18.field1531 = this.field1531;
            var18.field1513 = this.field1513;
            if (arg0 == 3) {
                var18.field1522 = class98.method591(this.field1522, -92);
                var18.field1515 = class98.method591(this.field1515, -71);
                var18.field1523 = class98.method591(this.field1523, -120);
            } else {
                var18.field1522 = this.field1522;
                var18.field1515 = new int[var18.field1514];
                var18.field1523 = this.field1523;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field1518; var19++) {
                int var30 = this.field1522[var19] + arg4;
                int var31 = this.field1523[var19] + arg6;
                int var32 = var30 & 0x7F;
                int var33 = var31 & 0x7F;
                int var34 = var30 >> 7;
                int var35 = var31 >> 7;
                int var36 = (128 - var32) * arg2[var34][var35] + arg2[var34 + 1][var35] * var32 >> 7;
                int var37 = (128 - var32) * arg2[var34][var35 + 1] + arg2[var34 + 1][var35 + 1] * var32 >> 7;
                int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                var18.field1515[var19] = this.field1515[var19] + var38 - arg5;
            }
            for (int var20 = var18.field1518; var20 < var18.field1514; var20++) {
                int var21 = this.field1522[var20] + arg4;
                int var22 = this.field1523[var20] + arg6;
                int var23 = var21 & 0x7F;
                int var24 = var22 & 0x7F;
                int var25 = var21 >> 7;
                int var26 = var22 >> 7;
                if (var25 >= 0 && var25 < arg2.length - 1 && var26 >= 0 && var26 < arg2[0].length - 1) {
                    int var27 = (128 - var23) * arg2[var25][var26] + arg2[var25 + 1][var26] * var23 >> 7;
                    int var28 = (128 - var23) * arg2[var25][var26 + 1] + arg2[var25 + 1][var26 + 1] * var23 >> 7;
                    int var29 = (128 - var24) * var27 + var24 * var28 >> 7;
                    var18.field1515[var20] = this.field1515[var20] + var29 - arg5;
                }
            }
        } else if (arg0 == 2) {
            for (int var39 = 0; var39 < var18.field1518; var39++) {
                int var51 = (this.field1515[var39] << 16) / this.field1526;
                if (var51 < arg1) {
                    int var52 = this.field1522[var39] + arg4;
                    int var53 = this.field1523[var39] + arg6;
                    int var54 = var52 & 0x7F;
                    int var55 = var53 & 0x7F;
                    int var56 = var52 >> 7;
                    int var57 = var53 >> 7;
                    int var58 = (128 - var54) * arg2[var56][var57] + arg2[var56 + 1][var57] * var54 >> 7;
                    int var59 = (128 - var54) * arg2[var56][var57 + 1] + arg2[var56 + 1][var57 + 1] * var54 >> 7;
                    int var60 = (128 - var55) * var58 + var55 * var59 >> 7;
                    var18.field1515[var39] = (arg1 - var51) * (var60 - arg5) / arg1 + this.field1515[var39];
                } else {
                    var18.field1515[var39] = this.field1515[var39];
                }
            }
            for (int var40 = var18.field1518; var40 < var18.field1514; var40++) {
                int var41 = (this.field1515[var40] << 16) / this.field1526;
                if (var41 < arg1) {
                    int var42 = this.field1522[var40] + arg4;
                    int var43 = this.field1523[var40] + arg6;
                    int var44 = var42 & 0x7F;
                    int var45 = var43 & 0x7F;
                    int var46 = var42 >> 7;
                    int var47 = var43 >> 7;
                    if (var46 >= 0 && var46 < arg2.length - 1 && var47 >= 0 && var47 < arg2[0].length - 1) {
                        int var48 = (128 - var44) * arg2[var46][var47] + arg2[var46 + 1][var47] * var44 >> 7;
                        int var49 = (128 - var44) * arg2[var46][var47 + 1] + arg2[var46 + 1][var47 + 1] * var44 >> 7;
                        int var50 = (128 - var45) * var48 + var45 * var49 >> 7;
                        var18.field1515[var40] = (arg1 - var41) * (var50 - arg5) / arg1 + this.field1515[var40];
                    }
                } else {
                    var18.field1515[var40] = this.field1515[var40];
                }
            }
        } else if (arg0 == 3) {
            int var61 = (arg1 & 0xFF) * 4;
            int var62 = (arg1 >> 8 & 0xFF) * 4;
            var18.method723(arg2, arg4, arg5, arg6, var61, var62);
        } else if (arg0 == 4) {
            int var63 = this.field1512 - this.field1526;
            for (int var64 = 0; var64 < this.field1518; var64++) {
                int var75 = this.field1522[var64] + arg4;
                int var76 = this.field1523[var64] + arg6;
                int var77 = var75 & 0x7F;
                int var78 = var76 & 0x7F;
                int var79 = var75 >> 7;
                int var80 = var76 >> 7;
                int var81 = (128 - var77) * arg3[var79][var80] + arg3[var79 + 1][var80] * var77 >> 7;
                int var82 = (128 - var77) * arg3[var79][var80 + 1] + arg3[var79 + 1][var80 + 1] * var77 >> 7;
                int var83 = (128 - var78) * var81 + var78 * var82 >> 7;
                var18.field1515[var64] = var83 + this.field1515[var64] + var63 - arg5;
            }
            for (int var65 = var18.field1518; var65 < var18.field1514; var65++) {
                int var66 = this.field1522[var65] + arg4;
                int var67 = this.field1523[var65] + arg6;
                int var68 = var66 & 0x7F;
                int var69 = var67 & 0x7F;
                int var70 = var66 >> 7;
                int var71 = var67 >> 7;
                if (var70 >= 0 && var70 < arg3.length - 1 && var71 >= 0 && var71 < arg3[0].length - 1) {
                    int var72 = (128 - var68) * arg3[var70][var71] + arg3[var70 + 1][var71] * var68 >> 7;
                    int var73 = (128 - var68) * arg3[var70][var71 + 1] + arg3[var70 + 1][var71 + 1] * var68 >> 7;
                    int var74 = (128 - var69) * var72 + var69 * var73 >> 7;
                    var18.field1515[var65] = var74 + this.field1515[var65] + var63 - arg5;
                }
            }
        } else if (arg0 == 5) {
            int var84 = this.field1512 - this.field1526;
            for (int var85 = 0; var85 < this.field1518; var85++) {
                int var100 = this.field1522[var85] + arg4;
                int var101 = this.field1523[var85] + arg6;
                int var102 = var100 & 0x7F;
                int var103 = var101 & 0x7F;
                int var104 = var100 >> 7;
                int var105 = var101 >> 7;
                int var106 = (128 - var102) * arg2[var104][var105] + arg2[var104 + 1][var105] * var102 >> 7;
                int var107 = (128 - var102) * arg2[var104][var105 + 1] + arg2[var104 + 1][var105 + 1] * var102 >> 7;
                int var108 = (128 - var103) * var106 + var103 * var107 >> 7;
                int var109 = (128 - var102) * arg3[var104][var105] + arg3[var104 + 1][var105] * var102 >> 7;
                int var110 = (128 - var102) * arg3[var104][var105 + 1] + arg3[var104 + 1][var105 + 1] * var102 >> 7;
                int var111 = (128 - var103) * var109 + var103 * var110 >> 7;
                int var112 = var108 - var111;
                var18.field1515[var85] = ((this.field1515[var85] << 8) / var84 * var112 >> 8) - (arg5 - var108);
            }
            for (int var86 = var18.field1518; var86 < var18.field1514; var86++) {
                int var87 = this.field1522[var86] + arg4;
                int var88 = this.field1523[var86] + arg6;
                int var89 = var87 & 0x7F;
                int var90 = var88 & 0x7F;
                int var91 = var87 >> 7;
                int var92 = var88 >> 7;
                if (var91 >= 0 && var91 < arg2.length - 1 && var91 < arg3.length - 1 && var92 >= 0 && var92 < arg2[0].length - 1 && var92 < arg3[0].length - 1) {
                    int var93 = (128 - var89) * arg2[var91][var92] + arg2[var91 + 1][var92] * var89 >> 7;
                    int var94 = (128 - var89) * arg2[var91][var92 + 1] + arg2[var91 + 1][var92 + 1] * var89 >> 7;
                    int var95 = (128 - var90) * var93 + var90 * var94 >> 7;
                    int var96 = (128 - var89) * arg3[var91][var92] + arg3[var91 + 1][var92] * var89 >> 7;
                    int var97 = (128 - var89) * arg3[var91][var92 + 1] + arg3[var91 + 1][var92 + 1] * var89 >> 7;
                    int var98 = (128 - var90) * var96 + var90 * var97 >> 7;
                    int var99 = var95 - var98;
                    var18.field1515[var86] = ((this.field1515[var86] << 8) / var84 * var99 >> 8) - (arg5 - var95);
                }
            }
        }
        if (arg8) {
            var18.method707();
        } else {
            this.field1543 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()Z")
    public final boolean method711() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(III)V")
    public final void method712(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1514; var4++) {
            this.field1522[var4] = this.field1522[var4] * arg0 / 128;
            this.field1515[var4] = this.field1515[var4] * arg1 / 128;
            this.field1523[var4] = this.field1523[var4] * arg2 / 128;
        }
        this.method707();
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(SS)V")
    public final void method713(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1555; var3++) {
            if (this.field1511[var3] == arg0) {
                this.field1511[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIII)Lah;")
    public final class106 method714(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class275(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Lca;")
    public final class131 method715(int arg0, int arg1, int arg2) {
        return this.method714(this.field1554, this.field1519, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(IIIII)Lpa;")
    public final class275 method716(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class275(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
    public final void method717() {
        this.field1533 = null;
        this.field1534 = null;
        this.field1544 = null;
        this.field1517 = null;
    }

    @OriginalMember(owner = "client!i", name = "h", descriptor = "()V")
    public final void method718() {
        int var10002;
        if (this.field1533 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1514; var3++) {
                int var7 = this.field1533[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1544 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field1544[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1514) {
                int var6 = this.field1533[var5];
                this.field1544[var6][var1[var6]++] = var5++;
            }
            this.field1533 = null;
        }
        if (this.field1534 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1555; var10++) {
            int var14 = this.field1534[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field1517 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field1517[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field1555) {
            int var13 = this.field1534[var12];
            this.field1517[var13][var8[var13]++] = var12++;
        }
        this.field1534 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lbc;II)Li;")
    public static final class113 method719(class282 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1861(arg2, arg1, 1);
        return var3 == null ? null : new class113(var3);
    }

    @OriginalMember(owner = "client!i", name = "i", descriptor = "()V")
    public static void method720() {
        field1524 = null;
        field1507 = null;
        field1520 = null;
        field1510 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIBSB)I")
    public final int method721(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field1542[this.field1555] = arg0;
        this.field1535[this.field1555] = arg1;
        this.field1532[this.field1555] = arg2;
        this.field1556[this.field1555] = arg3;
        this.field1549[this.field1555] = -1;
        this.field1511[this.field1555] = arg4;
        this.field1516[this.field1555] = -1;
        this.field1536[this.field1555] = arg5;
        return this.field1555++;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
    private final void method722(int arg0) {
        int var2 = field1520[arg0];
        int var3 = field1510[arg0];
        for (int var4 = 0; var4 < this.field1514; var4++) {
            int var5 = this.field1522[var4] * var3 + this.field1515[var4] * var2 >> 16;
            this.field1515[var4] = this.field1515[var4] * var3 - this.field1522[var4] * var2 >> 16;
            this.field1522[var4] = var5;
        }
        this.method707();
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([[IIIIII)V")
    private final void method723(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method709(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method709(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method709(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method709(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method706(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method722(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method730(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(SS)V")
    public final void method724(short arg0, short arg1) {
        if (this.field1516 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1555; var3++) {
            if (this.field1516[var3] == arg0) {
                this.field1516[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "j", descriptor = "()V")
    public final void method725() {
        for (int var1 = 0; var1 < this.field1514; var1++) {
            int var2 = this.field1523[var1];
            this.field1523[var1] = this.field1522[var1];
            this.field1522[var1] = -var2;
        }
        this.method707();
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V")
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "([B)V")
    private final void method726(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class216 var4 = new class216(arg0);
        class216 var5 = new class216(arg0);
        class216 var6 = new class216(arg0);
        class216 var7 = new class216(arg0);
        class216 var8 = new class216(arg0);
        var4.field3021 = arg0.length - 18;
        int var9 = var4.method1380(true);
        int var10 = var4.method1380(true);
        int var11 = var4.method1407(118);
        int var12 = var4.method1407(117);
        int var13 = var4.method1407(109);
        int var14 = var4.method1407(117);
        int var15 = var4.method1407(108);
        int var16 = var4.method1407(126);
        int var17 = var4.method1380(true);
        int var18 = var4.method1380(true);
        int var19 = var4.method1380(true);
        int var20 = var4.method1380(true);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1514 = var9;
        this.field1555 = var10;
        this.field1550 = var11;
        this.field1522 = new int[var9];
        this.field1515 = new int[var9];
        this.field1523 = new int[var9];
        this.field1542 = new int[var10];
        this.field1535 = new int[var10];
        this.field1532 = new int[var10];
        if (var11 > 0) {
            this.field1509 = new byte[var11];
            this.field1528 = new short[var11];
            this.field1527 = new short[var11];
            this.field1530 = new short[var11];
        }
        if (var16 == 1) {
            this.field1533 = new int[var9];
        }
        if (var12 == 1) {
            this.field1556 = new byte[var10];
            this.field1549 = new byte[var10];
            this.field1516 = new short[var10];
        }
        if (var13 == 255) {
            this.field1540 = new byte[var10];
        } else {
            this.field1545 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1536 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1534 = new int[var10];
        }
        this.field1511 = new short[var10];
        var4.field3021 = var21;
        var5.field3021 = var36;
        var6.field3021 = var38;
        var7.field3021 = var40;
        var8.field3021 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1407(108);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1408(false);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1408(false);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1408(false);
            }
            this.field1522[var46] = var43 + var63;
            this.field1515[var46] = var44 + var64;
            this.field1523[var46] = var45 + var65;
            var43 = this.field1522[var46];
            var44 = this.field1515[var46];
            var45 = this.field1523[var46];
            if (var16 == 1) {
                this.field1533[var46] = var8.method1407(123);
            }
        }
        var4.field3021 = var32;
        var5.field3021 = var28;
        var6.field3021 = var26;
        var7.field3021 = var30;
        var8.field3021 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field1511[var47] = (short) var4.method1380(true);
            if (var12 == 1) {
                int var61 = var5.method1407(107);
                if ((var61 & 0x1) == 1) {
                    this.field1556[var47] = 1;
                    var2 = true;
                } else {
                    this.field1556[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field1549[var47] = (byte) (var61 >> 2);
                    this.field1516[var47] = this.field1511[var47];
                    this.field1511[var47] = 127;
                    if (this.field1516[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1549[var47] = -1;
                    this.field1516[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1540[var47] = var6.method1355(true);
            }
            if (var14 == 1) {
                this.field1536[var47] = var7.method1355(true);
            }
            if (var15 == 1) {
                this.field1534[var47] = var8.method1407(126);
            }
        }
        this.field1518 = -1;
        var4.field3021 = var25;
        var5.field3021 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1407(115);
            if (var57 == 1) {
                var48 = var4.method1408(false) + var51;
                var49 = var4.method1408(false) + var48;
                var50 = var4.method1408(false) + var49;
                var51 = var50;
                this.field1542[var52] = var48;
                this.field1535[var52] = var49;
                this.field1532[var52] = var50;
                if (var48 > this.field1518) {
                    this.field1518 = var48;
                }
                if (var49 > this.field1518) {
                    this.field1518 = var49;
                }
                if (var50 > this.field1518) {
                    this.field1518 = var50;
                }
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1408(false) + var51;
                var51 = var50;
                this.field1542[var52] = var48;
                this.field1535[var52] = var49;
                this.field1532[var52] = var50;
                if (var50 > this.field1518) {
                    this.field1518 = var50;
                }
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1408(false) + var51;
                var51 = var50;
                this.field1542[var52] = var48;
                this.field1535[var52] = var49;
                this.field1532[var52] = var50;
                if (var50 > this.field1518) {
                    this.field1518 = var50;
                }
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1408(false) + var51;
                var51 = var50;
                this.field1542[var52] = var48;
                this.field1535[var52] = var60;
                this.field1532[var52] = var50;
                if (var50 > this.field1518) {
                    this.field1518 = var50;
                }
            }
        }
        this.field1518++;
        var4.field3021 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field1509[var53] = 0;
            this.field1528[var53] = (short) var4.method1380(true);
            this.field1527[var53] = (short) var4.method1380(true);
            this.field1530[var53] = (short) var4.method1380(true);
        }
        if (this.field1549 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field1549[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field1528[var56] & 0xFFFF) == this.field1542[var55] && (this.field1527[var56] & 0xFFFF) == this.field1535[var55] && (this.field1530[var56] & 0xFFFF) == this.field1532[var55]) {
                        this.field1549[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field1549 = null;
            }
        }
        if (!var3) {
            this.field1516 = null;
        }
        if (!var2) {
            this.field1556 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Li;IS)I")
    private final int method727(class113 arg0, int arg1, short arg2) {
        int var4 = arg0.field1522[arg1];
        int var5 = arg0.field1515[arg1];
        int var6 = arg0.field1523[arg1];
        for (int var7 = 0; var7 < this.field1514; var7++) {
            if (this.field1522[var7] == var4 && this.field1515[var7] == var5 && this.field1523[var7] == var6) {
                this.field1539[var7] |= arg2;
                return var7;
            }
        }
        this.field1522[this.field1514] = var4;
        this.field1515[this.field1514] = var5;
        this.field1523[this.field1514] = var6;
        this.field1539[this.field1514] = arg2;
        if (arg0.field1533 != null) {
            this.field1533[this.field1514] = arg0.field1533[arg1];
        }
        return this.field1514++;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(III)V")
    public final void method728(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field1520[arg2];
            int var5 = field1510[arg2];
            for (int var6 = 0; var6 < this.field1514; var6++) {
                int var7 = this.field1522[var6] * var5 + this.field1515[var6] * var4 >> 16;
                this.field1515[var6] = this.field1515[var6] * var5 - this.field1522[var6] * var4 >> 16;
                this.field1522[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field1520[arg0];
            int var9 = field1510[arg0];
            for (int var10 = 0; var10 < this.field1514; var10++) {
                int var11 = this.field1515[var10] * var9 - this.field1523[var10] * var8 >> 16;
                this.field1523[var10] = this.field1523[var10] * var9 + this.field1515[var10] * var8 >> 16;
                this.field1515[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field1520[arg1];
        int var13 = field1510[arg1];
        for (int var14 = 0; var14 < this.field1514; var14++) {
            int var15 = this.field1523[var14] * var12 + this.field1522[var14] * var13 >> 16;
            this.field1523[var14] = this.field1523[var14] * var13 - this.field1522[var14] * var12 >> 16;
            this.field1522[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!i", name = "k", descriptor = "()Li;")
    public final class113 method729() {
        class113 var1 = new class113();
        if (this.field1556 != null) {
            var1.field1556 = new byte[this.field1555];
            for (int var2 = 0; var2 < this.field1555; var2++) {
                var1.field1556[var2] = this.field1556[var2];
            }
        }
        var1.field1514 = this.field1514;
        var1.field1518 = this.field1518;
        var1.field1555 = this.field1555;
        var1.field1550 = this.field1550;
        var1.field1522 = this.field1522;
        var1.field1515 = this.field1515;
        var1.field1523 = this.field1523;
        var1.field1542 = this.field1542;
        var1.field1535 = this.field1535;
        var1.field1532 = this.field1532;
        var1.field1540 = this.field1540;
        var1.field1536 = this.field1536;
        var1.field1549 = this.field1549;
        var1.field1511 = this.field1511;
        var1.field1516 = this.field1516;
        var1.field1545 = this.field1545;
        var1.field1509 = this.field1509;
        var1.field1528 = this.field1528;
        var1.field1527 = this.field1527;
        var1.field1530 = this.field1530;
        var1.field1537 = this.field1537;
        var1.field1541 = this.field1541;
        var1.field1521 = this.field1521;
        var1.field1546 = this.field1546;
        var1.field1557 = this.field1557;
        var1.field1558 = this.field1558;
        var1.field1538 = this.field1538;
        var1.field1529 = this.field1529;
        var1.field1533 = this.field1533;
        var1.field1534 = this.field1534;
        var1.field1544 = this.field1544;
        var1.field1517 = this.field1517;
        var1.field1553 = this.field1553;
        var1.field1531 = this.field1531;
        var1.field1554 = this.field1554;
        var1.field1519 = this.field1519;
        return var1;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(III)V")
    public final void method730(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1514; var4++) {
            this.field1522[var4] += arg0;
            this.field1515[var4] += arg1;
            this.field1523[var4] += arg2;
        }
        this.method707();
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()I")
    public final int method227() {
        if (!this.field1543) {
            this.method731();
        }
        return this.field1526;
    }

    @OriginalMember(owner = "client!i", name = "l", descriptor = "()V")
    private final void method731() {
        if (this.field1543) {
            return;
        }
        this.field1543 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field1518; var7++) {
            int var8 = this.field1522[var7];
            int var9 = this.field1515[var7];
            int var10 = this.field1523[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field1552 = (short) var1;
        this.field1551 = (short) var4;
        this.field1526 = (short) var2;
        this.field1512 = (short) var5;
        this.field1547 = (short) var3;
        this.field1548 = (short) var6;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIIJILqd;)V")
    public final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class162 arg10) {
    }

    @OriginalMember(owner = "client!i", name = "m", descriptor = "()V")
    public final void method732() {
        for (int var1 = 0; var1 < this.field1514; var1++) {
            this.field1522[var1] = -this.field1522[var1];
            this.field1523[var1] = -this.field1523[var1];
        }
        this.method707();
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    private class113() {
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "([B)V")
    private class113(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method703(arg0);
        } else {
            this.method726(arg0);
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III)V")
    public class113(int arg0, int arg1, int arg2) {
        this.field1522 = new int[arg0];
        this.field1515 = new int[arg0];
        this.field1523 = new int[arg0];
        this.field1533 = new int[arg0];
        this.field1542 = new int[arg1];
        this.field1535 = new int[arg1];
        this.field1532 = new int[arg1];
        this.field1556 = new byte[arg1];
        this.field1540 = new byte[arg1];
        this.field1536 = new byte[arg1];
        this.field1511 = new short[arg1];
        this.field1516 = new short[arg1];
        this.field1549 = new byte[arg1];
        this.field1534 = new int[arg1];
        if (arg2 > 0) {
            this.field1509 = new byte[arg2];
            this.field1528 = new short[arg2];
            this.field1527 = new short[arg2];
            this.field1530 = new short[arg2];
            this.field1537 = new short[arg2];
            this.field1541 = new short[arg2];
            this.field1521 = new short[arg2];
            this.field1546 = new byte[arg2];
            this.field1557 = new byte[arg2];
            this.field1558 = new byte[arg2];
            this.field1538 = new byte[arg2];
            this.field1529 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "([Li;I)V")
    public class113(class113[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1514 = 0;
        this.field1555 = 0;
        this.field1550 = 0;
        boolean var9 = false;
        boolean var10 = false;
        this.field1545 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class113 var25 = arg0[var11];
            if (var25 != null) {
                this.field1514 += var25.field1514;
                this.field1555 += var25.field1555;
                this.field1550 += var25.field1550;
                if (var25.field1540 == null) {
                    if (this.field1545 == -1) {
                        this.field1545 = var25.field1545;
                    }
                    if (this.field1545 != var25.field1545) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var25.field1556 != null;
                var5 |= var25.field1536 != null;
                var6 |= var25.field1534 != null;
                var7 |= var25.field1516 != null;
                var8 |= var25.field1549 != null;
            }
        }
        this.field1522 = new int[this.field1514];
        this.field1515 = new int[this.field1514];
        this.field1523 = new int[this.field1514];
        this.field1533 = new int[this.field1514];
        this.field1539 = new short[this.field1514];
        this.field1542 = new int[this.field1555];
        this.field1535 = new int[this.field1555];
        this.field1532 = new int[this.field1555];
        if (var3) {
            this.field1556 = new byte[this.field1555];
        }
        if (var4) {
            this.field1540 = new byte[this.field1555];
        }
        if (var5) {
            this.field1536 = new byte[this.field1555];
        }
        if (var6) {
            this.field1534 = new int[this.field1555];
        }
        if (var7) {
            this.field1516 = new short[this.field1555];
        }
        if (var8) {
            this.field1549 = new byte[this.field1555];
        }
        this.field1511 = new short[this.field1555];
        this.field1525 = new short[this.field1555];
        if (this.field1550 > 0) {
            this.field1509 = new byte[this.field1550];
            this.field1528 = new short[this.field1550];
            this.field1527 = new short[this.field1550];
            this.field1530 = new short[this.field1550];
            this.field1537 = new short[this.field1550];
            this.field1541 = new short[this.field1550];
            this.field1521 = new short[this.field1550];
            this.field1546 = new byte[this.field1550];
            this.field1557 = new byte[this.field1550];
            this.field1558 = new byte[this.field1550];
            this.field1538 = new byte[this.field1550];
            this.field1529 = new byte[this.field1550];
        }
        this.field1514 = 0;
        this.field1555 = 0;
        this.field1550 = 0;
        boolean var12 = false;
        boolean var13 = false;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var22 = (short) (0x1 << var14);
            class113 var23 = arg0[var14];
            if (var23 != null) {
                for (int var24 = 0; var24 < var23.field1555; var24++) {
                    if (var3 && var23.field1556 != null) {
                        this.field1556[this.field1555] = var23.field1556[var24];
                    }
                    if (var4) {
                        if (var23.field1540 == null) {
                            this.field1540[this.field1555] = var23.field1545;
                        } else {
                            this.field1540[this.field1555] = var23.field1540[var24];
                        }
                    }
                    if (var5 && var23.field1536 != null) {
                        this.field1536[this.field1555] = var23.field1536[var24];
                    }
                    if (var6 && var23.field1534 != null) {
                        this.field1534[this.field1555] = var23.field1534[var24];
                    }
                    if (var7) {
                        if (var23.field1516 == null) {
                            this.field1516[this.field1555] = -1;
                        } else {
                            this.field1516[this.field1555] = var23.field1516[var24];
                        }
                    }
                    this.field1511[this.field1555] = var23.field1511[var24];
                    this.field1525[this.field1555] = var22;
                    this.field1542[this.field1555] = this.method727(var23, var23.field1542[var24], var22);
                    this.field1535[this.field1555] = this.method727(var23, var23.field1535[var24], var22);
                    this.field1532[this.field1555] = this.method727(var23, var23.field1532[var24], var22);
                    this.field1555++;
                }
            }
        }
        int var15 = 0;
        this.field1518 = this.field1514;
        for (int var16 = 0; var16 < arg1; var16++) {
            class113 var17 = arg0[var16];
            short var18 = (short) (0x1 << var16);
            if (var17 != null) {
                for (int var19 = 0; var19 < var17.field1555; var19++) {
                    if (var8) {
                        this.field1549[var15++] = (byte) (var17.field1549 == null || var17.field1549[var19] == -1 ? -1 : var17.field1549[var19] + this.field1550);
                    }
                }
                for (int var20 = 0; var20 < var17.field1550; var20++) {
                    byte var21 = this.field1509[this.field1550] = var17.field1509[var20];
                    if (var21 == 0) {
                        this.field1528[this.field1550] = (short) this.method727(var17, var17.field1528[var20], var18);
                        this.field1527[this.field1550] = (short) this.method727(var17, var17.field1527[var20], var18);
                        this.field1530[this.field1550] = (short) this.method727(var17, var17.field1530[var20], var18);
                    }
                    if (var21 >= 1 && var21 <= 3) {
                        this.field1528[this.field1550] = var17.field1528[var20];
                        this.field1527[this.field1550] = var17.field1527[var20];
                        this.field1530[this.field1550] = var17.field1530[var20];
                        this.field1537[this.field1550] = var17.field1537[var20];
                        this.field1541[this.field1550] = var17.field1541[var20];
                        this.field1521[this.field1550] = var17.field1521[var20];
                        this.field1546[this.field1550] = var17.field1546[var20];
                        this.field1557[this.field1550] = var17.field1557[var20];
                        this.field1558[this.field1550] = var17.field1558[var20];
                    }
                    if (var21 == 2) {
                        this.field1538[this.field1550] = var17.field1538[var20];
                        this.field1529[this.field1550] = var17.field1529[var20];
                    }
                    this.field1550++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Li;ZZZZ)V")
    public class113(class113 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1514 = arg0.field1514;
        this.field1518 = arg0.field1518;
        this.field1555 = arg0.field1555;
        this.field1550 = arg0.field1550;
        if (arg1) {
            this.field1522 = arg0.field1522;
            this.field1515 = arg0.field1515;
            this.field1523 = arg0.field1523;
        } else {
            this.field1522 = new int[this.field1514];
            this.field1515 = new int[this.field1514];
            this.field1523 = new int[this.field1514];
            for (int var6 = 0; var6 < this.field1514; var6++) {
                this.field1522[var6] = arg0.field1522[var6];
                this.field1515[var6] = arg0.field1515[var6];
                this.field1523[var6] = arg0.field1523[var6];
            }
        }
        if (arg2) {
            this.field1511 = arg0.field1511;
        } else {
            this.field1511 = new short[this.field1555];
            for (int var7 = 0; var7 < this.field1555; var7++) {
                this.field1511[var7] = arg0.field1511[var7];
            }
        }
        if (arg3 || arg0.field1516 == null) {
            this.field1516 = arg0.field1516;
        } else {
            this.field1516 = new short[this.field1555];
            for (int var8 = 0; var8 < this.field1555; var8++) {
                this.field1516[var8] = arg0.field1516[var8];
            }
        }
        if (arg4) {
            this.field1536 = arg0.field1536;
        } else {
            this.field1536 = new byte[this.field1555];
            if (arg0.field1536 == null) {
                for (int var9 = 0; var9 < this.field1555; var9++) {
                    this.field1536[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1555; var10++) {
                    this.field1536[var10] = arg0.field1536[var10];
                }
            }
        }
        this.field1542 = arg0.field1542;
        this.field1535 = arg0.field1535;
        this.field1532 = arg0.field1532;
        this.field1556 = arg0.field1556;
        this.field1540 = arg0.field1540;
        this.field1549 = arg0.field1549;
        this.field1545 = arg0.field1545;
        this.field1509 = arg0.field1509;
        this.field1528 = arg0.field1528;
        this.field1527 = arg0.field1527;
        this.field1530 = arg0.field1530;
        this.field1537 = arg0.field1537;
        this.field1541 = arg0.field1541;
        this.field1521 = arg0.field1521;
        this.field1546 = arg0.field1546;
        this.field1557 = arg0.field1557;
        this.field1558 = arg0.field1558;
        this.field1538 = arg0.field1538;
        this.field1529 = arg0.field1529;
        this.field1533 = arg0.field1533;
        this.field1534 = arg0.field1534;
        this.field1544 = arg0.field1544;
        this.field1517 = arg0.field1517;
        this.field1553 = arg0.field1553;
        this.field1531 = arg0.field1531;
        this.field1513 = arg0.field1513;
        this.field1554 = arg0.field1554;
        this.field1519 = arg0.field1519;
    }
}
