import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class82 extends class145 {

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public int field1485 = 0;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "Z")
    private boolean field1491 = false;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public int field1489 = 0;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "B")
    public byte field1507 = 0;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!he", name = "ib", descriptor = "[I")
    public int[] field1522;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "[I")
    public int[] field1476;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "[I")
    public int[] field1506;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "[I")
    private int[] field1483;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "[I")
    public int[] field1511;

    @OriginalMember(owner = "client!he", name = "eb", descriptor = "[I")
    public int[] field1518;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "[I")
    public int[] field1505;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "[B")
    public byte[] field1480;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "[B")
    public byte[] field1493;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "[B")
    public byte[] field1510;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "[I")
    private int[] field1514;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "[S")
    public short[] field1503;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "[B")
    public byte[] field1488;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "[S")
    public short[] field1482;

    @OriginalMember(owner = "client!he", name = "hb", descriptor = "[B")
    public byte[] field1521;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "[S")
    public short[] field1501;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "[S")
    public short[] field1495;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[S")
    public short[] field1477;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "[S")
    private short[] field1484;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "[S")
    private short[] field1508;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "[S")
    private short[] field1475;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "[B")
    private byte[] field1478;

    @OriginalMember(owner = "client!he", name = "db", descriptor = "[B")
    private byte[] field1517;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "[B")
    private byte[] field1516;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "[B")
    private byte[] field1513;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "[B")
    private byte[] field1502;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "[[I")
    public int[][] field1487;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "[[I")
    public int[][] field1486;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "[Lie;")
    public class93[] field1497;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "[Lsd;")
    public class200[] field1512;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "[Lie;")
    public class93[] field1490;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "S")
    public short field1498;

    @OriginalMember(owner = "client!he", name = "jb", descriptor = "S")
    public short field1523;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "[I")
    private static int[] field1492 = new int[10000];

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    private static int field1500 = 0;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "[I")
    private static int[] field1509 = class173.field3356;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "[I")
    private static int[] field1496 = new int[10000];

    @OriginalMember(owner = "client!he", name = "t", descriptor = "[I")
    private static int[] field1481 = class173.field3361;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "S")
    private short field1479;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "S")
    private short field1494;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "S")
    private short field1504;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "S")
    private short field1515;

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "S")
    private short field1519;

    @OriginalMember(owner = "client!he", name = "gb", descriptor = "S")
    private short field1520;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([[III)I")
    private static final int method543(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()Z")
    public final boolean method544() {
        return true;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II[[I[[IIIIZZ)Lhe;")
    public final class82 method545(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method561();
        int var10 = this.field1515 + arg4;
        int var11 = this.field1520 + arg4;
        int var12 = this.field1504 + arg6;
        int var13 = this.field1479 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
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
        class82 var18;
        if (arg7) {
            var18 = new class82();
            var18.field1489 = this.field1489;
            var18.field1485 = this.field1485;
            var18.field1499 = this.field1499;
            var18.field1511 = this.field1511;
            var18.field1518 = this.field1518;
            var18.field1505 = this.field1505;
            var18.field1480 = this.field1480;
            var18.field1493 = this.field1493;
            var18.field1510 = this.field1510;
            var18.field1488 = this.field1488;
            var18.field1482 = this.field1482;
            var18.field1503 = this.field1503;
            var18.field1507 = this.field1507;
            var18.field1521 = this.field1521;
            var18.field1501 = this.field1501;
            var18.field1495 = this.field1495;
            var18.field1477 = this.field1477;
            var18.field1484 = this.field1484;
            var18.field1508 = this.field1508;
            var18.field1475 = this.field1475;
            var18.field1478 = this.field1478;
            var18.field1517 = this.field1517;
            var18.field1516 = this.field1516;
            var18.field1513 = this.field1513;
            var18.field1502 = this.field1502;
            var18.field1483 = this.field1483;
            var18.field1514 = this.field1514;
            var18.field1487 = this.field1487;
            var18.field1486 = this.field1486;
            var18.field1498 = this.field1498;
            var18.field1523 = this.field1523;
            var18.field1497 = this.field1497;
            var18.field1512 = this.field1512;
            var18.field1490 = this.field1490;
            if (arg0 == 3) {
                var18.field1522 = class27.method169(this.field1522, (byte) -118);
                var18.field1476 = class27.method169(this.field1476, (byte) -67);
                var18.field1506 = class27.method169(this.field1506, (byte) -65);
            } else {
                var18.field1522 = this.field1522;
                var18.field1476 = new int[var18.field1489];
                var18.field1506 = this.field1506;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field1489; var19++) {
                int var20 = this.field1522[var19] + arg4;
                int var21 = this.field1506[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field1476[var19] = this.field1476[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field1489; var29++) {
                int var30 = (this.field1476[var29] << 16) / this.field1519;
                if (var30 < arg1) {
                    int var31 = this.field1522[var29] + arg4;
                    int var32 = this.field1506[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field1476[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field1476[var29];
                } else {
                    var18.field1476[var29] = this.field1476[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method562(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field1494 - this.field1519;
            for (int var43 = 0; var43 < this.field1489; var43++) {
                int var44 = this.field1522[var43] + arg4;
                int var45 = this.field1506[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field1476[var43] = var52 + this.field1476[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field1494 - this.field1519;
            for (int var54 = 0; var54 < this.field1489; var54++) {
                int var55 = this.field1522[var54] + arg4;
                int var56 = this.field1506[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field1476[var54] = ((this.field1476[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method554();
        } else {
            this.field1491 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)Lcg;")
    public final class30 method546(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class125(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IIIII)Lle;")
    public final class125 method547(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class125(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
    public final void method548() {
        if (this.field1497 != null) {
            return;
        }
        this.field1497 = new class93[this.field1489];
        for (int var1 = 0; var1 < this.field1489; var1++) {
            this.field1497[var1] = new class93();
        }
        for (int var2 = 0; var2 < this.field1485; var2++) {
            int var3 = this.field1511[var2];
            int var4 = this.field1518[var2];
            int var5 = this.field1505[var2];
            int var6 = this.field1522[var4] - this.field1522[var3];
            int var7 = this.field1476[var4] - this.field1476[var3];
            int var8 = this.field1506[var4] - this.field1506[var3];
            int var9 = this.field1522[var5] - this.field1522[var3];
            int var10 = this.field1476[var5] - this.field1476[var3];
            int var11 = this.field1506[var5] - this.field1506[var3];
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
            if (this.field1480 == null) {
                var19 = 0;
            } else {
                var19 = this.field1480[var2];
            }
            if (var19 == 0) {
                class93 var20 = this.field1497[var3];
                var20.field1740 += var16;
                var20.field1737 += var17;
                var20.field1738 += var18;
                var20.field1739++;
                class93 var21 = this.field1497[var4];
                var21.field1740 += var16;
                var21.field1737 += var17;
                var21.field1738 += var18;
                var21.field1739++;
                class93 var22 = this.field1497[var5];
                var22.field1740 += var16;
                var22.field1737 += var17;
                var22.field1738 += var18;
                var22.field1739++;
            } else if (var19 == 1) {
                if (this.field1512 == null) {
                    this.field1512 = new class200[this.field1485];
                }
                class200 var23 = this.field1512[var2] = new class200();
                var23.field3824 = var16;
                var23.field3832 = var17;
                var23.field3827 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(III)V")
    public final void method549(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1489; var4++) {
            this.field1522[var4] += arg0;
            this.field1476[var4] += arg1;
            this.field1506[var4] += arg2;
        }
        this.method554();
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    private final void method550(int arg0) {
        int var2 = field1481[arg0];
        int var3 = field1509[arg0];
        for (int var4 = 0; var4 < this.field1489; var4++) {
            int var5 = this.field1476[var4] * var3 - this.field1506[var4] * var2 >> 16;
            this.field1506[var4] = this.field1506[var4] * var3 + this.field1476[var4] * var2 >> 16;
            this.field1476[var4] = var5;
        }
        this.method554();
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()V")
    public final void method551() {
        for (int var1 = 0; var1 < this.field1489; var1++) {
            this.field1506[var1] = -this.field1506[var1];
        }
        for (int var2 = 0; var2 < this.field1485; var2++) {
            int var3 = this.field1511[var2];
            this.field1511[var2] = this.field1505[var2];
            this.field1505[var2] = var3;
        }
        this.method554();
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(III)V")
    public final void method552(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1489; var4++) {
            this.field1522[var4] = this.field1522[var4] * arg0 / 128;
            this.field1476[var4] = this.field1476[var4] * arg1 / 128;
            this.field1506[var4] = this.field1506[var4] * arg2 / 128;
        }
        this.method554();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(SS)V")
    public final void method553(short arg0, short arg1) {
        if (this.field1503 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1485; var3++) {
            if (this.field1503[var3] == arg0) {
                this.field1503[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "()V")
    private final void method554() {
        this.field1497 = null;
        this.field1490 = null;
        this.field1512 = null;
        this.field1491 = false;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "()V")
    public final void method555() {
        for (int var1 = 0; var1 < this.field1489; var1++) {
            int var2 = this.field1522[var1];
            this.field1522[var1] = this.field1506[var1];
            this.field1506[var1] = -var2;
        }
        this.method554();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([B)V")
    private final void method556(byte[] arg0) {
        class46 var2 = new class46(arg0);
        class46 var3 = new class46(arg0);
        class46 var4 = new class46(arg0);
        class46 var5 = new class46(arg0);
        class46 var6 = new class46(arg0);
        class46 var7 = new class46(arg0);
        class46 var8 = new class46(arg0);
        var2.field831 = arg0.length - 23;
        int var9 = var2.method301(16);
        int var10 = var2.method301(52);
        int var11 = var2.method347(26119);
        int var12 = var2.method347(26119);
        int var13 = var2.method347(26119);
        int var14 = var2.method347(26119);
        int var15 = var2.method347(26119);
        int var16 = var2.method347(26119);
        int var17 = var2.method347(26119);
        int var18 = var2.method301(106);
        int var19 = var2.method301(76);
        int var20 = var2.method301(80);
        int var21 = var2.method301(85);
        int var22 = var2.method301(20);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1521 = new byte[var11];
            var2.field831 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1521[var26] = var2.method324(94);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field1489 = var9;
        this.field1485 = var10;
        this.field1499 = var11;
        this.field1522 = new int[var9];
        this.field1476 = new int[var9];
        this.field1506 = new int[var9];
        this.field1511 = new int[var10];
        this.field1518 = new int[var10];
        this.field1505 = new int[var10];
        if (var17 == 1) {
            this.field1483 = new int[var9];
        }
        if (var12 == 1) {
            this.field1480 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1493 = new byte[var10];
        } else {
            this.field1507 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1510 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1514 = new int[var10];
        }
        if (var16 == 1) {
            this.field1503 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1488 = new byte[var10];
        }
        this.field1482 = new short[var10];
        if (var11 > 0) {
            this.field1501 = new short[var11];
            this.field1495 = new short[var11];
            this.field1477 = new short[var11];
            if (var24 > 0) {
                this.field1484 = new short[var24];
                this.field1508 = new short[var24];
                this.field1475 = new short[var24];
                this.field1478 = new byte[var24];
                this.field1517 = new byte[var24];
                this.field1516 = new byte[var24];
            }
            if (var25 > 0) {
                this.field1513 = new byte[var25];
                this.field1502 = new byte[var25];
            }
        }
        var2.field831 = var11;
        var3.field831 = var44;
        var4.field831 = var46;
        var5.field831 = var48;
        var6.field831 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method347(26119);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method342(true);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method342(true);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method342(true);
            }
            this.field1522[var66] = var63 + var80;
            this.field1476[var66] = var64 + var81;
            this.field1506[var66] = var65 + var82;
            var63 = this.field1522[var66];
            var64 = this.field1476[var66];
            var65 = this.field1506[var66];
            if (var17 == 1) {
                this.field1483[var66] = var6.method347(26119);
            }
        }
        var2.field831 = var42;
        var3.field831 = var31;
        var4.field831 = var34;
        var5.field831 = var37;
        var6.field831 = var35;
        var7.field831 = var40;
        var8.field831 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field1482[var67] = (short) var2.method301(63);
            if (var12 == 1) {
                this.field1480[var67] = var3.method324(93);
            }
            if (var13 == 255) {
                this.field1493[var67] = var4.method324(15);
            }
            if (var14 == 1) {
                this.field1510[var67] = var5.method324(106);
            }
            if (var15 == 1) {
                this.field1514[var67] = var6.method347(26119);
            }
            if (var16 == 1) {
                this.field1503[var67] = (short) (var7.method301(30) - 1);
            }
            if (this.field1488 != null) {
                if (this.field1503[var67] == -1) {
                    this.field1488[var67] = -1;
                } else {
                    this.field1488[var67] = (byte) (var8.method347(26119) - 1);
                }
            }
        }
        var2.field831 = var33;
        var3.field831 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method347(26119);
            if (var75 == 1) {
                var68 = var2.method342(true) + var71;
                var69 = var2.method342(true) + var68;
                var70 = var2.method342(true) + var69;
                var71 = var70;
                this.field1511[var72] = var68;
                this.field1518[var72] = var69;
                this.field1505[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method342(true) + var71;
                var71 = var70;
                this.field1511[var72] = var68;
                this.field1518[var72] = var69;
                this.field1505[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method342(true) + var71;
                var71 = var70;
                this.field1511[var72] = var68;
                this.field1518[var72] = var69;
                this.field1505[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method342(true) + var71;
                var71 = var70;
                this.field1511[var72] = var68;
                this.field1518[var72] = var78;
                this.field1505[var72] = var70;
            }
        }
        var2.field831 = var50;
        var3.field831 = var52;
        var4.field831 = var54;
        var5.field831 = var56;
        var6.field831 = var58;
        var7.field831 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field1521[var73] & 0xFF;
            if (var74 == 0) {
                this.field1501[var73] = (short) var2.method301(73);
                this.field1495[var73] = (short) var2.method301(49);
                this.field1477[var73] = (short) var2.method301(122);
            }
            if (var74 == 1) {
                this.field1501[var73] = (short) var3.method301(69);
                this.field1495[var73] = (short) var3.method301(35);
                this.field1477[var73] = (short) var3.method301(83);
                this.field1484[var73] = (short) var4.method301(25);
                this.field1508[var73] = (short) var4.method301(73);
                this.field1475[var73] = (short) var4.method301(40);
                this.field1478[var73] = var5.method324(65);
                this.field1517[var73] = var6.method324(71);
                this.field1516[var73] = var7.method324(78);
            }
            if (var74 == 2) {
                this.field1501[var73] = (short) var3.method301(113);
                this.field1495[var73] = (short) var3.method301(96);
                this.field1477[var73] = (short) var3.method301(67);
                this.field1484[var73] = (short) var4.method301(58);
                this.field1508[var73] = (short) var4.method301(56);
                this.field1475[var73] = (short) var4.method301(53);
                this.field1478[var73] = var5.method324(92);
                this.field1517[var73] = var6.method324(64);
                this.field1516[var73] = var7.method324(53);
                this.field1513[var73] = var7.method324(76);
                this.field1502[var73] = var7.method324(78);
            }
            if (var74 == 3) {
                this.field1501[var73] = (short) var3.method301(96);
                this.field1495[var73] = (short) var3.method301(89);
                this.field1477[var73] = (short) var3.method301(50);
                this.field1484[var73] = (short) var4.method301(118);
                this.field1508[var73] = (short) var4.method301(35);
                this.field1475[var73] = (short) var4.method301(109);
                this.field1478[var73] = var5.method324(127);
                this.field1517[var73] = var6.method324(21);
                this.field1516[var73] = var7.method324(35);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "()V")
    public static void method557() {
        field1492 = null;
        field1496 = null;
        field1481 = null;
        field1509 = null;
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "()Lhe;")
    public final class82 method558() {
        class82 var1 = new class82();
        if (this.field1480 != null) {
            var1.field1480 = new byte[this.field1485];
            for (int var2 = 0; var2 < this.field1485; var2++) {
                var1.field1480[var2] = this.field1480[var2];
            }
        }
        var1.field1489 = this.field1489;
        var1.field1485 = this.field1485;
        var1.field1499 = this.field1499;
        var1.field1522 = this.field1522;
        var1.field1476 = this.field1476;
        var1.field1506 = this.field1506;
        var1.field1511 = this.field1511;
        var1.field1518 = this.field1518;
        var1.field1505 = this.field1505;
        var1.field1493 = this.field1493;
        var1.field1510 = this.field1510;
        var1.field1488 = this.field1488;
        var1.field1482 = this.field1482;
        var1.field1503 = this.field1503;
        var1.field1507 = this.field1507;
        var1.field1521 = this.field1521;
        var1.field1501 = this.field1501;
        var1.field1495 = this.field1495;
        var1.field1477 = this.field1477;
        var1.field1484 = this.field1484;
        var1.field1508 = this.field1508;
        var1.field1475 = this.field1475;
        var1.field1478 = this.field1478;
        var1.field1517 = this.field1517;
        var1.field1516 = this.field1516;
        var1.field1513 = this.field1513;
        var1.field1502 = this.field1502;
        var1.field1483 = this.field1483;
        var1.field1514 = this.field1514;
        var1.field1487 = this.field1487;
        var1.field1486 = this.field1486;
        var1.field1497 = this.field1497;
        var1.field1512 = this.field1512;
        var1.field1498 = this.field1498;
        var1.field1523 = this.field1523;
        return var1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Lnc;")
    public final class145 method559(int arg0, int arg1, int arg2) {
        return this.method546(this.field1498, this.field1523, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()I")
    public final int method88() {
        if (!this.field1491) {
            this.method561();
        }
        return this.field1519;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    private final void method560(int arg0) {
        int var2 = field1481[arg0];
        int var3 = field1509[arg0];
        for (int var4 = 0; var4 < this.field1489; var4++) {
            int var5 = this.field1522[var4] * var3 + this.field1476[var4] * var2 >> 16;
            this.field1476[var4] = this.field1476[var4] * var3 - this.field1522[var4] * var2 >> 16;
            this.field1522[var4] = var5;
        }
        this.method554();
    }

    @OriginalMember(owner = "client!he", name = "i", descriptor = "()V")
    private final void method561() {
        if (this.field1491) {
            return;
        }
        this.field1491 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field1489; var7++) {
            int var8 = this.field1522[var7];
            int var9 = this.field1476[var7];
            int var10 = this.field1506[var7];
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
        this.field1515 = (short) var1;
        this.field1520 = (short) var4;
        this.field1519 = (short) var2;
        this.field1494 = (short) var5;
        this.field1504 = (short) var3;
        this.field1479 = (short) var6;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([[IIIIII)V")
    private final void method562(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method543(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method543(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method543(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method543(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
        if (var26 != 0) {
            this.method550(var26);
        }
        int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
        if (var27 != 0) {
            this.method560(var27);
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method549(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!he", name = "j", descriptor = "()V")
    public final void method563() {
        this.field1483 = null;
        this.field1514 = null;
        this.field1487 = null;
        this.field1486 = null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(SS)V")
    public final void method564(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1485; var3++) {
            if (this.field1482[var3] == arg0) {
                this.field1482[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(III)V")
    public final void method565(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field1481[arg2];
            int var5 = field1509[arg2];
            for (int var6 = 0; var6 < this.field1489; var6++) {
                int var7 = this.field1522[var6] * var5 + this.field1476[var6] * var4 >> 16;
                this.field1476[var6] = this.field1476[var6] * var5 - this.field1522[var6] * var4 >> 16;
                this.field1522[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field1481[arg0];
            int var9 = field1509[arg0];
            for (int var10 = 0; var10 < this.field1489; var10++) {
                int var11 = this.field1476[var10] * var9 - this.field1506[var10] * var8 >> 16;
                this.field1506[var10] = this.field1506[var10] * var9 + this.field1476[var10] * var8 >> 16;
                this.field1476[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field1481[arg1];
        int var13 = field1509[arg1];
        for (int var14 = 0; var14 < this.field1489; var14++) {
            int var15 = this.field1522[var14] * var13 + this.field1506[var14] * var12 >> 16;
            this.field1506[var14] = this.field1506[var14] * var13 - this.field1522[var14] * var12 >> 16;
            this.field1522[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!he", name = "k", descriptor = "()V")
    public final void method566() {
        for (int var1 = 0; var1 < this.field1489; var1++) {
            int var2 = this.field1506[var1];
            this.field1506[var1] = this.field1522[var1];
            this.field1522[var1] = -var2;
        }
        this.method554();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lhe;I)I")
    private final int method567(class82 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1522[arg1];
        int var5 = arg0.field1476[arg1];
        int var6 = arg0.field1506[arg1];
        for (int var7 = 0; var7 < this.field1489; var7++) {
            if (this.field1522[var7] == var4 && this.field1476[var7] == var5 && this.field1506[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1522[this.field1489] = var4;
            this.field1476[this.field1489] = var5;
            this.field1506[this.field1489] = var6;
            if (arg0.field1483 != null) {
                this.field1483[this.field1489] = arg0.field1483[arg1];
            }
            var3 = this.field1489++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lnb;II)Lhe;")
    public static final class82 method568(class144 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method941((byte) 56, arg2, arg1);
        return var3 == null ? null : new class82(var3);
    }

    @OriginalMember(owner = "client!he", name = "l", descriptor = "()V")
    public final void method569() {
        int var10002;
        if (this.field1483 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1489; var3++) {
                int var7 = this.field1483[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1487 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field1487[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1489) {
                int var6 = this.field1483[var5];
                this.field1487[var6][var1[var6]++] = var5++;
            }
            this.field1483 = null;
        }
        if (this.field1514 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1485; var10++) {
            int var14 = this.field1514[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field1486 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field1486[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field1485) {
            int var13 = this.field1514[var12];
            this.field1486[var13][var8[var13]++] = var12++;
        }
        this.field1514 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lnc;IIIZ)V")
    public final void method570(class145 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class82 var6 = (class82) arg0;
        var6.method561();
        var6.method548();
        field1500++;
        int var7 = 0;
        int[] var8 = var6.field1522;
        int var9 = var6.field1489;
        for (int var10 = 0; var10 < this.field1489; var10++) {
            class93 var13 = this.field1497[var10];
            if (var13.field1739 != 0) {
                int var14 = this.field1476[var10] - arg2;
                if (var14 >= var6.field1519 && var14 <= var6.field1494) {
                    int var15 = this.field1522[var10] - arg1;
                    if (var15 >= var6.field1515 && var15 <= var6.field1520) {
                        int var16 = this.field1506[var10] - arg3;
                        if (var16 >= var6.field1504 && var16 <= var6.field1479) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class93 var18 = var6.field1497[var17];
                                if (var8[var17] == var15 && var6.field1506[var17] == var16 && var6.field1476[var17] == var14 && var18.field1739 != 0) {
                                    if (this.field1490 == null) {
                                        this.field1490 = new class93[this.field1489];
                                    }
                                    if (var6.field1490 == null) {
                                        var6.field1490 = new class93[var9];
                                    }
                                    class93 var19 = this.field1490[var10];
                                    if (var19 == null) {
                                        var19 = this.field1490[var10] = new class93(var13);
                                    }
                                    class93 var20 = var6.field1490[var17];
                                    if (var20 == null) {
                                        var20 = var6.field1490[var17] = new class93(var18);
                                    }
                                    var19.field1740 += var18.field1740;
                                    var19.field1737 += var18.field1737;
                                    var19.field1738 += var18.field1738;
                                    var19.field1739 += var18.field1739;
                                    var20.field1740 += var13.field1740;
                                    var20.field1737 += var13.field1737;
                                    var20.field1738 += var13.field1738;
                                    var20.field1739 += var13.field1739;
                                    var7++;
                                    field1492[var10] = field1500;
                                    field1496[var17] = field1500;
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
        for (int var11 = 0; var11 < this.field1485; var11++) {
            if (field1492[this.field1511[var11]] == field1500 && field1492[this.field1518[var11]] == field1500 && field1492[this.field1505[var11]] == field1500) {
                if (this.field1480 == null) {
                    this.field1480 = new byte[this.field1485];
                }
                this.field1480[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field1485; var12++) {
            if (field1496[var6.field1511[var12]] == field1500 && field1496[var6.field1518[var12]] == field1500 && field1496[var6.field1505[var12]] == field1500) {
                if (var6.field1480 == null) {
                    var6.field1480 = new byte[var6.field1485];
                }
                var6.field1480[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "([B)V")
    private final void method571(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class46 var4 = new class46(arg0);
        class46 var5 = new class46(arg0);
        class46 var6 = new class46(arg0);
        class46 var7 = new class46(arg0);
        class46 var8 = new class46(arg0);
        var4.field831 = arg0.length - 18;
        int var9 = var4.method301(31);
        int var10 = var4.method301(101);
        int var11 = var4.method347(26119);
        int var12 = var4.method347(26119);
        int var13 = var4.method347(26119);
        int var14 = var4.method347(26119);
        int var15 = var4.method347(26119);
        int var16 = var4.method347(26119);
        int var17 = var4.method301(20);
        int var18 = var4.method301(13);
        int var19 = var4.method301(83);
        int var20 = var4.method301(75);
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
        this.field1489 = var9;
        this.field1485 = var10;
        this.field1499 = var11;
        this.field1522 = new int[var9];
        this.field1476 = new int[var9];
        this.field1506 = new int[var9];
        this.field1511 = new int[var10];
        this.field1518 = new int[var10];
        this.field1505 = new int[var10];
        if (var11 > 0) {
            this.field1521 = new byte[var11];
            this.field1501 = new short[var11];
            this.field1495 = new short[var11];
            this.field1477 = new short[var11];
        }
        if (var16 == 1) {
            this.field1483 = new int[var9];
        }
        if (var12 == 1) {
            this.field1480 = new byte[var10];
            this.field1488 = new byte[var10];
            this.field1503 = new short[var10];
        }
        if (var13 == 255) {
            this.field1493 = new byte[var10];
        } else {
            this.field1507 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1510 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1514 = new int[var10];
        }
        this.field1482 = new short[var10];
        var4.field831 = var21;
        var5.field831 = var36;
        var6.field831 = var38;
        var7.field831 = var40;
        var8.field831 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method347(26119);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method342(true);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method342(true);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method342(true);
            }
            this.field1522[var46] = var43 + var63;
            this.field1476[var46] = var44 + var64;
            this.field1506[var46] = var45 + var65;
            var43 = this.field1522[var46];
            var44 = this.field1476[var46];
            var45 = this.field1506[var46];
            if (var16 == 1) {
                this.field1483[var46] = var8.method347(26119);
            }
        }
        var4.field831 = var32;
        var5.field831 = var28;
        var6.field831 = var26;
        var7.field831 = var30;
        var8.field831 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field1482[var47] = (short) var4.method301(99);
            if (var12 == 1) {
                int var61 = var5.method347(26119);
                if ((var61 & 0x1) == 1) {
                    this.field1480[var47] = 1;
                    var2 = true;
                } else {
                    this.field1480[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field1488[var47] = (byte) (var61 >> 2);
                    this.field1503[var47] = this.field1482[var47];
                    this.field1482[var47] = 127;
                    if (this.field1503[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1488[var47] = -1;
                    this.field1503[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1493[var47] = var6.method324(100);
            }
            if (var14 == 1) {
                this.field1510[var47] = var7.method324(97);
            }
            if (var15 == 1) {
                this.field1514[var47] = var8.method347(26119);
            }
        }
        var4.field831 = var25;
        var5.field831 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method347(26119);
            if (var57 == 1) {
                var48 = var4.method342(true) + var51;
                var49 = var4.method342(true) + var48;
                var50 = var4.method342(true) + var49;
                var51 = var50;
                this.field1511[var52] = var48;
                this.field1518[var52] = var49;
                this.field1505[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method342(true) + var51;
                var51 = var50;
                this.field1511[var52] = var48;
                this.field1518[var52] = var49;
                this.field1505[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method342(true) + var51;
                var51 = var50;
                this.field1511[var52] = var48;
                this.field1518[var52] = var49;
                this.field1505[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method342(true) + var51;
                var51 = var50;
                this.field1511[var52] = var48;
                this.field1518[var52] = var60;
                this.field1505[var52] = var50;
            }
        }
        var4.field831 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field1521[var53] = 0;
            this.field1501[var53] = (short) var4.method301(124);
            this.field1495[var53] = (short) var4.method301(45);
            this.field1477[var53] = (short) var4.method301(98);
        }
        if (this.field1488 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field1488[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field1501[var56] & 0xFFFF) == this.field1511[var55] && (this.field1495[var56] & 0xFFFF) == this.field1518[var55] && (this.field1477[var56] & 0xFFFF) == this.field1505[var55]) {
                        this.field1488[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field1488 = null;
            }
        }
        if (!var3) {
            this.field1503 = null;
        }
        if (!var2) {
            this.field1480 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "m", descriptor = "()V")
    public final void method572() {
        for (int var1 = 0; var1 < this.field1489; var1++) {
            this.field1522[var1] = -this.field1522[var1];
            this.field1506[var1] = -this.field1506[var1];
        }
        this.method554();
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public final void method573(int arg0) {
        int var2 = field1481[arg0];
        int var3 = field1509[arg0];
        for (int var4 = 0; var4 < this.field1489; var4++) {
            int var5 = this.field1522[var4] * var3 + this.field1506[var4] * var2 >> 16;
            this.field1506[var4] = this.field1506[var4] * var3 - this.field1522[var4] * var2 >> 16;
            this.field1522[var4] = var5;
        }
        this.method554();
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    private class82() {
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
    private class82(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method556(arg0);
        } else {
            this.method571(arg0);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([Lhe;I)V")
    public class82(class82[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1489 = 0;
        this.field1485 = 0;
        this.field1499 = 0;
        this.field1507 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class82 var15 = arg0[var9];
            if (var15 != null) {
                this.field1489 += var15.field1489;
                this.field1485 += var15.field1485;
                this.field1499 += var15.field1499;
                if (var15.field1493 == null) {
                    if (this.field1507 == -1) {
                        this.field1507 = var15.field1507;
                    }
                    if (this.field1507 != var15.field1507) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field1480 != null;
                var5 |= var15.field1510 != null;
                var6 |= var15.field1514 != null;
                var7 |= var15.field1503 != null;
                var8 |= var15.field1488 != null;
            }
        }
        this.field1522 = new int[this.field1489];
        this.field1476 = new int[this.field1489];
        this.field1506 = new int[this.field1489];
        this.field1483 = new int[this.field1489];
        this.field1511 = new int[this.field1485];
        this.field1518 = new int[this.field1485];
        this.field1505 = new int[this.field1485];
        if (var3) {
            this.field1480 = new byte[this.field1485];
        }
        if (var4) {
            this.field1493 = new byte[this.field1485];
        }
        if (var5) {
            this.field1510 = new byte[this.field1485];
        }
        if (var6) {
            this.field1514 = new int[this.field1485];
        }
        if (var7) {
            this.field1503 = new short[this.field1485];
        }
        if (var8) {
            this.field1488 = new byte[this.field1485];
        }
        this.field1482 = new short[this.field1485];
        if (this.field1499 > 0) {
            this.field1521 = new byte[this.field1499];
            this.field1501 = new short[this.field1499];
            this.field1495 = new short[this.field1499];
            this.field1477 = new short[this.field1499];
            this.field1484 = new short[this.field1499];
            this.field1508 = new short[this.field1499];
            this.field1475 = new short[this.field1499];
            this.field1478 = new byte[this.field1499];
            this.field1517 = new byte[this.field1499];
            this.field1516 = new byte[this.field1499];
            this.field1513 = new byte[this.field1499];
            this.field1502 = new byte[this.field1499];
        }
        this.field1489 = 0;
        this.field1485 = 0;
        this.field1499 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class82 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field1485; var12++) {
                    if (var3 && var11.field1480 != null) {
                        this.field1480[this.field1485] = var11.field1480[var12];
                    }
                    if (var4) {
                        if (var11.field1493 == null) {
                            this.field1493[this.field1485] = var11.field1507;
                        } else {
                            this.field1493[this.field1485] = var11.field1493[var12];
                        }
                    }
                    if (var5 && var11.field1510 != null) {
                        this.field1510[this.field1485] = var11.field1510[var12];
                    }
                    if (var6 && var11.field1514 != null) {
                        this.field1514[this.field1485] = var11.field1514[var12];
                    }
                    if (var7) {
                        if (var11.field1503 == null) {
                            this.field1503[this.field1485] = -1;
                        } else {
                            this.field1503[this.field1485] = var11.field1503[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field1488 == null || var11.field1488[var12] == -1) {
                            this.field1488[this.field1485] = -1;
                        } else {
                            this.field1488[this.field1485] = (byte) (var11.field1488[var12] + this.field1499);
                        }
                    }
                    this.field1482[this.field1485] = var11.field1482[var12];
                    this.field1511[this.field1485] = this.method567(var11, var11.field1511[var12]);
                    this.field1518[this.field1485] = this.method567(var11, var11.field1518[var12]);
                    this.field1505[this.field1485] = this.method567(var11, var11.field1505[var12]);
                    this.field1485++;
                }
                for (int var13 = 0; var13 < var11.field1499; var13++) {
                    byte var14 = this.field1521[this.field1499] = var11.field1521[var13];
                    if (var14 == 0) {
                        this.field1501[this.field1499] = (short) this.method567(var11, var11.field1501[var13]);
                        this.field1495[this.field1499] = (short) this.method567(var11, var11.field1495[var13]);
                        this.field1477[this.field1499] = (short) this.method567(var11, var11.field1477[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field1501[this.field1499] = var11.field1501[var13];
                        this.field1495[this.field1499] = var11.field1495[var13];
                        this.field1477[this.field1499] = var11.field1477[var13];
                        this.field1484[this.field1499] = var11.field1484[var13];
                        this.field1508[this.field1499] = var11.field1508[var13];
                        this.field1475[this.field1499] = var11.field1475[var13];
                        this.field1478[this.field1499] = var11.field1478[var13];
                        this.field1517[this.field1499] = var11.field1517[var13];
                        this.field1516[this.field1499] = var11.field1516[var13];
                    }
                    if (var14 == 2) {
                        this.field1513[this.field1499] = var11.field1513[var13];
                        this.field1502[this.field1499] = var11.field1502[var13];
                    }
                    this.field1499++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lhe;ZZZZ)V")
    public class82(class82 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1489 = arg0.field1489;
        this.field1485 = arg0.field1485;
        this.field1499 = arg0.field1499;
        if (arg1) {
            this.field1522 = arg0.field1522;
            this.field1476 = arg0.field1476;
            this.field1506 = arg0.field1506;
        } else {
            this.field1522 = new int[this.field1489];
            this.field1476 = new int[this.field1489];
            this.field1506 = new int[this.field1489];
            for (int var6 = 0; var6 < this.field1489; var6++) {
                this.field1522[var6] = arg0.field1522[var6];
                this.field1476[var6] = arg0.field1476[var6];
                this.field1506[var6] = arg0.field1506[var6];
            }
        }
        if (arg2) {
            this.field1482 = arg0.field1482;
        } else {
            this.field1482 = new short[this.field1485];
            for (int var7 = 0; var7 < this.field1485; var7++) {
                this.field1482[var7] = arg0.field1482[var7];
            }
        }
        if (arg3 || arg0.field1503 == null) {
            this.field1503 = arg0.field1503;
        } else {
            this.field1503 = new short[this.field1485];
            for (int var8 = 0; var8 < this.field1485; var8++) {
                this.field1503[var8] = arg0.field1503[var8];
            }
        }
        if (arg4) {
            this.field1510 = arg0.field1510;
        } else {
            this.field1510 = new byte[this.field1485];
            if (arg0.field1510 == null) {
                for (int var9 = 0; var9 < this.field1485; var9++) {
                    this.field1510[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1485; var10++) {
                    this.field1510[var10] = arg0.field1510[var10];
                }
            }
        }
        this.field1511 = arg0.field1511;
        this.field1518 = arg0.field1518;
        this.field1505 = arg0.field1505;
        this.field1480 = arg0.field1480;
        this.field1493 = arg0.field1493;
        this.field1488 = arg0.field1488;
        this.field1507 = arg0.field1507;
        this.field1521 = arg0.field1521;
        this.field1501 = arg0.field1501;
        this.field1495 = arg0.field1495;
        this.field1477 = arg0.field1477;
        this.field1484 = arg0.field1484;
        this.field1508 = arg0.field1508;
        this.field1475 = arg0.field1475;
        this.field1478 = arg0.field1478;
        this.field1517 = arg0.field1517;
        this.field1516 = arg0.field1516;
        this.field1513 = arg0.field1513;
        this.field1502 = arg0.field1502;
        this.field1483 = arg0.field1483;
        this.field1514 = arg0.field1514;
        this.field1487 = arg0.field1487;
        this.field1486 = arg0.field1486;
        this.field1497 = arg0.field1497;
        this.field1512 = arg0.field1512;
        this.field1490 = arg0.field1490;
        this.field1498 = arg0.field1498;
        this.field1523 = arg0.field1523;
    }
}
