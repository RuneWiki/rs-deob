import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class74 extends class177 {

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public int field1439 = 0;

    @OriginalMember(owner = "client!ng", name = "Z", descriptor = "B")
    public byte field1450 = 0;

    @OriginalMember(owner = "client!ng", name = "eb", descriptor = "Z")
    private boolean field1455 = false;

    @OriginalMember(owner = "client!ng", name = "cb", descriptor = "I")
    public int field1453 = 0;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "[I")
    public int[] field1441;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "[I")
    public int[] field1415;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "[I")
    public int[] field1425;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "[I")
    private int[] field1442;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "[I")
    public int[] field1417;

    @OriginalMember(owner = "client!ng", name = "jb", descriptor = "[I")
    public int[] field1460;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "[I")
    public int[] field1427;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "[B")
    public byte[] field1413;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "[B")
    public byte[] field1429;

    @OriginalMember(owner = "client!ng", name = "ab", descriptor = "[B")
    public byte[] field1451;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "[S")
    public short[] field1419;

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "[S")
    public short[] field1449;

    @OriginalMember(owner = "client!ng", name = "ib", descriptor = "[B")
    public byte[] field1459;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "[I")
    private int[] field1444;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "[B")
    public byte[] field1421;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "[S")
    public short[] field1422;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "[S")
    public short[] field1434;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "[S")
    public short[] field1414;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "[S")
    private short[] field1430;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "[S")
    private short[] field1420;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "[S")
    private short[] field1445;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "[B")
    private byte[] field1440;

    @OriginalMember(owner = "client!ng", name = "db", descriptor = "[B")
    private byte[] field1454;

    @OriginalMember(owner = "client!ng", name = "fb", descriptor = "[B")
    private byte[] field1456;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "[B")
    private byte[] field1428;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "[B")
    private byte[] field1416;

    @OriginalMember(owner = "client!ng", name = "W", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!ng", name = "kb", descriptor = "[[I")
    public int[][] field1461;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "[[I")
    public int[][] field1437;

    @OriginalMember(owner = "client!ng", name = "gb", descriptor = "[Lhe;")
    public class19[] field1457;

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "[Ltg;")
    public class176[] field1446;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "[Lhe;")
    public class19[] field1435;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "S")
    public short field1438;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "S")
    public short field1424;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "[I")
    private static int[] field1432 = new int[10000];

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "[I")
    private static int[] field1426 = new int[10000];

    @OriginalMember(owner = "client!ng", name = "X", descriptor = "[I")
    private static int[] field1448 = class178.field3232;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    private static int field1431 = 0;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "[I")
    private static int[] field1436 = class178.field3247;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "S")
    private short field1418;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "S")
    private short field1423;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "S")
    private short field1433;

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "S")
    private short field1443;

    @OriginalMember(owner = "client!ng", name = "bb", descriptor = "S")
    private short field1452;

    @OriginalMember(owner = "client!ng", name = "hb", descriptor = "S")
    private short field1458;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "()V")
    public final void method511() {
        for (int var1 = 0; var1 < this.field1439; var1++) {
            int var2 = this.field1441[var1];
            this.field1441[var1] = this.field1425[var1];
            this.field1425[var1] = -var2;
        }
        this.method537();
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "()Z")
    public final boolean method512() {
        return true;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[[I[[IIIIZZ)Lng;")
    public final class74 method513(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method531();
        int var10 = this.field1452 + arg4;
        int var11 = this.field1418 + arg4;
        int var12 = this.field1443 + arg6;
        int var13 = this.field1423 + arg6;
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
        class74 var18;
        if (arg7) {
            var18 = new class74();
            var18.field1439 = this.field1439;
            var18.field1453 = this.field1453;
            var18.field1447 = this.field1447;
            var18.field1417 = this.field1417;
            var18.field1460 = this.field1460;
            var18.field1427 = this.field1427;
            var18.field1413 = this.field1413;
            var18.field1429 = this.field1429;
            var18.field1451 = this.field1451;
            var18.field1459 = this.field1459;
            var18.field1419 = this.field1419;
            var18.field1449 = this.field1449;
            var18.field1450 = this.field1450;
            var18.field1421 = this.field1421;
            var18.field1422 = this.field1422;
            var18.field1434 = this.field1434;
            var18.field1414 = this.field1414;
            var18.field1430 = this.field1430;
            var18.field1420 = this.field1420;
            var18.field1445 = this.field1445;
            var18.field1440 = this.field1440;
            var18.field1454 = this.field1454;
            var18.field1456 = this.field1456;
            var18.field1428 = this.field1428;
            var18.field1416 = this.field1416;
            var18.field1442 = this.field1442;
            var18.field1444 = this.field1444;
            var18.field1461 = this.field1461;
            var18.field1437 = this.field1437;
            var18.field1438 = this.field1438;
            var18.field1424 = this.field1424;
            var18.field1457 = this.field1457;
            var18.field1446 = this.field1446;
            var18.field1435 = this.field1435;
            if (arg0 == 3) {
                var18.field1441 = class240.method1695(this.field1441, true);
                var18.field1415 = class240.method1695(this.field1415, true);
                var18.field1425 = class240.method1695(this.field1425, true);
            } else {
                var18.field1441 = this.field1441;
                var18.field1415 = new int[var18.field1439];
                var18.field1425 = this.field1425;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field1439; var19++) {
                int var20 = this.field1441[var19] + arg4;
                int var21 = this.field1425[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field1415[var19] = this.field1415[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field1439; var29++) {
                int var30 = (this.field1415[var29] << 16) / this.field1433;
                if (var30 < arg1) {
                    int var31 = this.field1441[var29] + arg4;
                    int var32 = this.field1425[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field1415[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field1415[var29];
                } else {
                    var18.field1415[var29] = this.field1415[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method541(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field1458 - this.field1433;
            for (int var43 = 0; var43 < this.field1439; var43++) {
                int var44 = this.field1441[var43] + arg4;
                int var45 = this.field1425[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field1415[var43] = var52 + this.field1415[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field1458 - this.field1433;
            for (int var54 = 0; var54 < this.field1439; var54++) {
                int var55 = this.field1441[var54] + arg4;
                int var56 = this.field1425[var54] + arg6;
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
                var18.field1415[var54] = ((this.field1415[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method537();
        } else {
            this.field1455 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(SS)V")
    public final void method514(short arg0, short arg1) {
        if (this.field1449 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1453; var3++) {
            if (this.field1449[var3] == arg0) {
                this.field1449[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "()V")
    public final void method515() {
        for (int var1 = 0; var1 < this.field1439; var1++) {
            this.field1441[var1] = -this.field1441[var1];
            this.field1425[var1] = -this.field1425[var1];
        }
        this.method537();
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIBSB)I")
    public final int method516(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field1417[this.field1453] = arg0;
        this.field1460[this.field1453] = arg1;
        this.field1427[this.field1453] = arg2;
        this.field1413[this.field1453] = arg3;
        this.field1459[this.field1453] = -1;
        this.field1419[this.field1453] = arg4;
        this.field1449[this.field1453] = -1;
        this.field1451[this.field1453] = arg5;
        return this.field1453++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Led;")
    public final class177 method517(int arg0, int arg1, int arg2) {
        return this.method526(this.field1438, this.field1424, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "()Lng;")
    public final class74 method518() {
        class74 var1 = new class74();
        if (this.field1413 != null) {
            var1.field1413 = new byte[this.field1453];
            for (int var2 = 0; var2 < this.field1453; var2++) {
                var1.field1413[var2] = this.field1413[var2];
            }
        }
        var1.field1439 = this.field1439;
        var1.field1453 = this.field1453;
        var1.field1447 = this.field1447;
        var1.field1441 = this.field1441;
        var1.field1415 = this.field1415;
        var1.field1425 = this.field1425;
        var1.field1417 = this.field1417;
        var1.field1460 = this.field1460;
        var1.field1427 = this.field1427;
        var1.field1429 = this.field1429;
        var1.field1451 = this.field1451;
        var1.field1459 = this.field1459;
        var1.field1419 = this.field1419;
        var1.field1449 = this.field1449;
        var1.field1450 = this.field1450;
        var1.field1421 = this.field1421;
        var1.field1422 = this.field1422;
        var1.field1434 = this.field1434;
        var1.field1414 = this.field1414;
        var1.field1430 = this.field1430;
        var1.field1420 = this.field1420;
        var1.field1445 = this.field1445;
        var1.field1440 = this.field1440;
        var1.field1454 = this.field1454;
        var1.field1456 = this.field1456;
        var1.field1428 = this.field1428;
        var1.field1416 = this.field1416;
        var1.field1442 = this.field1442;
        var1.field1444 = this.field1444;
        var1.field1461 = this.field1461;
        var1.field1437 = this.field1437;
        var1.field1457 = this.field1457;
        var1.field1446 = this.field1446;
        var1.field1438 = this.field1438;
        var1.field1424 = this.field1424;
        return var1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([B)V")
    private final void method519(byte[] arg0) {
        class128 var2 = new class128(arg0);
        class128 var3 = new class128(arg0);
        class128 var4 = new class128(arg0);
        class128 var5 = new class128(arg0);
        class128 var6 = new class128(arg0);
        class128 var7 = new class128(arg0);
        class128 var8 = new class128(arg0);
        var2.field2379 = arg0.length - 23;
        int var9 = var2.method912(-102);
        int var10 = var2.method912(106);
        int var11 = var2.method937(false);
        int var12 = var2.method937(false);
        int var13 = var2.method937(false);
        int var14 = var2.method937(false);
        int var15 = var2.method937(false);
        int var16 = var2.method937(false);
        int var17 = var2.method937(false);
        int var18 = var2.method912(75);
        int var19 = var2.method912(105);
        int var20 = var2.method912(40);
        int var21 = var2.method912(-87);
        int var22 = var2.method912(-118);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1421 = new byte[var11];
            var2.field2379 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1421[var26] = var2.method950(1495791448);
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
        this.field1439 = var9;
        this.field1453 = var10;
        this.field1447 = var11;
        this.field1441 = new int[var9];
        this.field1415 = new int[var9];
        this.field1425 = new int[var9];
        this.field1417 = new int[var10];
        this.field1460 = new int[var10];
        this.field1427 = new int[var10];
        if (var17 == 1) {
            this.field1442 = new int[var9];
        }
        if (var12 == 1) {
            this.field1413 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1429 = new byte[var10];
        } else {
            this.field1450 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1451 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1444 = new int[var10];
        }
        if (var16 == 1) {
            this.field1449 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1459 = new byte[var10];
        }
        this.field1419 = new short[var10];
        if (var11 > 0) {
            this.field1422 = new short[var11];
            this.field1434 = new short[var11];
            this.field1414 = new short[var11];
            if (var24 > 0) {
                this.field1430 = new short[var24];
                this.field1420 = new short[var24];
                this.field1445 = new short[var24];
                this.field1440 = new byte[var24];
                this.field1454 = new byte[var24];
                this.field1456 = new byte[var24];
            }
            if (var25 > 0) {
                this.field1428 = new byte[var25];
                this.field1416 = new byte[var25];
            }
        }
        var2.field2379 = var11;
        var3.field2379 = var44;
        var4.field2379 = var46;
        var5.field2379 = var48;
        var6.field2379 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method937(false);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method929(false);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method929(false);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method929(false);
            }
            this.field1441[var66] = var63 + var80;
            this.field1415[var66] = var64 + var81;
            this.field1425[var66] = var65 + var82;
            var63 = this.field1441[var66];
            var64 = this.field1415[var66];
            var65 = this.field1425[var66];
            if (var17 == 1) {
                this.field1442[var66] = var6.method937(false);
            }
        }
        var2.field2379 = var42;
        var3.field2379 = var31;
        var4.field2379 = var34;
        var5.field2379 = var37;
        var6.field2379 = var35;
        var7.field2379 = var40;
        var8.field2379 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field1419[var67] = (short) var2.method912(98);
            if (var12 == 1) {
                this.field1413[var67] = var3.method950(1495791448);
            }
            if (var13 == 255) {
                this.field1429[var67] = var4.method950(1495791448);
            }
            if (var14 == 1) {
                this.field1451[var67] = var5.method950(1495791448);
            }
            if (var15 == 1) {
                this.field1444[var67] = var6.method937(false);
            }
            if (var16 == 1) {
                this.field1449[var67] = (short) (var7.method912(92) - 1);
            }
            if (this.field1459 != null) {
                if (this.field1449[var67] == -1) {
                    this.field1459[var67] = -1;
                } else {
                    this.field1459[var67] = (byte) (var8.method937(false) - 1);
                }
            }
        }
        var2.field2379 = var33;
        var3.field2379 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method937(false);
            if (var75 == 1) {
                var68 = var2.method929(false) + var71;
                var69 = var2.method929(false) + var68;
                var70 = var2.method929(false) + var69;
                var71 = var70;
                this.field1417[var72] = var68;
                this.field1460[var72] = var69;
                this.field1427[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method929(false) + var71;
                var71 = var70;
                this.field1417[var72] = var68;
                this.field1460[var72] = var69;
                this.field1427[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method929(false) + var71;
                var71 = var70;
                this.field1417[var72] = var68;
                this.field1460[var72] = var69;
                this.field1427[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method929(false) + var71;
                var71 = var70;
                this.field1417[var72] = var68;
                this.field1460[var72] = var78;
                this.field1427[var72] = var70;
            }
        }
        var2.field2379 = var50;
        var3.field2379 = var52;
        var4.field2379 = var54;
        var5.field2379 = var56;
        var6.field2379 = var58;
        var7.field2379 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field1421[var73] & 0xFF;
            if (var74 == 0) {
                this.field1422[var73] = (short) var2.method912(40);
                this.field1434[var73] = (short) var2.method912(46);
                this.field1414[var73] = (short) var2.method912(95);
            }
            if (var74 == 1) {
                this.field1422[var73] = (short) var3.method912(-85);
                this.field1434[var73] = (short) var3.method912(-103);
                this.field1414[var73] = (short) var3.method912(-84);
                this.field1430[var73] = (short) var4.method912(85);
                this.field1420[var73] = (short) var4.method912(110);
                this.field1445[var73] = (short) var4.method912(107);
                this.field1440[var73] = var5.method950(1495791448);
                this.field1454[var73] = var6.method950(1495791448);
                this.field1456[var73] = var7.method950(1495791448);
            }
            if (var74 == 2) {
                this.field1422[var73] = (short) var3.method912(89);
                this.field1434[var73] = (short) var3.method912(127);
                this.field1414[var73] = (short) var3.method912(-78);
                this.field1430[var73] = (short) var4.method912(59);
                this.field1420[var73] = (short) var4.method912(103);
                this.field1445[var73] = (short) var4.method912(-91);
                this.field1440[var73] = var5.method950(1495791448);
                this.field1454[var73] = var6.method950(1495791448);
                this.field1456[var73] = var7.method950(1495791448);
                this.field1428[var73] = var7.method950(1495791448);
                this.field1416[var73] = var7.method950(1495791448);
            }
            if (var74 == 3) {
                this.field1422[var73] = (short) var3.method912(-107);
                this.field1434[var73] = (short) var3.method912(106);
                this.field1414[var73] = (short) var3.method912(74);
                this.field1430[var73] = (short) var4.method912(44);
                this.field1420[var73] = (short) var4.method912(45);
                this.field1445[var73] = (short) var4.method912(-123);
                this.field1440[var73] = var5.method950(1495791448);
                this.field1454[var73] = var6.method950(1495791448);
                this.field1456[var73] = var7.method950(1495791448);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIIII)Lad;")
    public final class238 method520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class238(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "()V")
    public final void method521() {
        for (int var1 = 0; var1 < this.field1439; var1++) {
            int var2 = this.field1425[var1];
            this.field1425[var1] = this.field1441[var1];
            this.field1441[var1] = -var2;
        }
        this.method537();
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Led;IIIZ)V")
    public final void method522(class177 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class74 var6 = (class74) arg0;
        var6.method531();
        var6.method532();
        field1431++;
        int var7 = 0;
        int[] var8 = var6.field1441;
        int var9 = var6.field1439;
        for (int var10 = 0; var10 < this.field1439; var10++) {
            class19 var13 = this.field1457[var10];
            if (var13.field241 != 0) {
                int var14 = this.field1415[var10] - arg2;
                if (var14 >= var6.field1433 && var14 <= var6.field1458) {
                    int var15 = this.field1441[var10] - arg1;
                    if (var15 >= var6.field1452 && var15 <= var6.field1418) {
                        int var16 = this.field1425[var10] - arg3;
                        if (var16 >= var6.field1443 && var16 <= var6.field1423) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class19 var18 = var6.field1457[var17];
                                if (var8[var17] == var15 && var6.field1425[var17] == var16 && var6.field1415[var17] == var14 && var18.field241 != 0) {
                                    if (this.field1435 == null) {
                                        this.field1435 = new class19[this.field1439];
                                    }
                                    if (var6.field1435 == null) {
                                        var6.field1435 = new class19[var9];
                                    }
                                    class19 var19 = this.field1435[var10];
                                    if (var19 == null) {
                                        var19 = this.field1435[var10] = new class19(var13);
                                    }
                                    class19 var20 = var6.field1435[var17];
                                    if (var20 == null) {
                                        var20 = var6.field1435[var17] = new class19(var18);
                                    }
                                    var19.field242 += var18.field242;
                                    var19.field249 += var18.field249;
                                    var19.field251 += var18.field251;
                                    var19.field241 += var18.field241;
                                    var20.field242 += var13.field242;
                                    var20.field249 += var13.field249;
                                    var20.field251 += var13.field251;
                                    var20.field241 += var13.field241;
                                    var7++;
                                    field1426[var10] = field1431;
                                    field1432[var17] = field1431;
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
        for (int var11 = 0; var11 < this.field1453; var11++) {
            if (field1426[this.field1417[var11]] == field1431 && field1426[this.field1460[var11]] == field1431 && field1426[this.field1427[var11]] == field1431) {
                if (this.field1413 == null) {
                    this.field1413 = new byte[this.field1453];
                }
                this.field1413[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field1453; var12++) {
            if (field1432[var6.field1417[var12]] == field1431 && field1432[var6.field1460[var12]] == field1431 && field1432[var6.field1427[var12]] == field1431) {
                if (var6.field1413 == null) {
                    var6.field1413 = new byte[var6.field1453];
                }
                var6.field1413[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lnc;II)Lng;")
    public static final class74 method523(class83 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method590(arg2, arg1, 0);
        return var3 == null ? null : new class74(var3);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)V")
    public final void method524(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1439; var4++) {
            this.field1441[var4] = this.field1441[var4] * arg0 / 128;
            this.field1415[var4] = this.field1415[var4] * arg1 / 128;
            this.field1425[var4] = this.field1425[var4] * arg2 / 128;
        }
        this.method537();
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "()V")
    public final void method525() {
        for (int var1 = 0; var1 < this.field1439; var1++) {
            this.field1425[var1] = -this.field1425[var1];
        }
        for (int var2 = 0; var2 < this.field1453; var2++) {
            int var3 = this.field1417[var2];
            this.field1417[var2] = this.field1427[var2];
            this.field1427[var2] = var3;
        }
        this.method537();
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(IIIII)Lsf;")
    public final class92 method526(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class238(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "([B)V")
    private final void method527(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class128 var4 = new class128(arg0);
        class128 var5 = new class128(arg0);
        class128 var6 = new class128(arg0);
        class128 var7 = new class128(arg0);
        class128 var8 = new class128(arg0);
        var4.field2379 = arg0.length - 18;
        int var9 = var4.method912(-123);
        int var10 = var4.method912(-117);
        int var11 = var4.method937(false);
        int var12 = var4.method937(false);
        int var13 = var4.method937(false);
        int var14 = var4.method937(false);
        int var15 = var4.method937(false);
        int var16 = var4.method937(false);
        int var17 = var4.method912(73);
        int var18 = var4.method912(125);
        int var19 = var4.method912(-106);
        int var20 = var4.method912(73);
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
        this.field1439 = var9;
        this.field1453 = var10;
        this.field1447 = var11;
        this.field1441 = new int[var9];
        this.field1415 = new int[var9];
        this.field1425 = new int[var9];
        this.field1417 = new int[var10];
        this.field1460 = new int[var10];
        this.field1427 = new int[var10];
        if (var11 > 0) {
            this.field1421 = new byte[var11];
            this.field1422 = new short[var11];
            this.field1434 = new short[var11];
            this.field1414 = new short[var11];
        }
        if (var16 == 1) {
            this.field1442 = new int[var9];
        }
        if (var12 == 1) {
            this.field1413 = new byte[var10];
            this.field1459 = new byte[var10];
            this.field1449 = new short[var10];
        }
        if (var13 == 255) {
            this.field1429 = new byte[var10];
        } else {
            this.field1450 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1451 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1444 = new int[var10];
        }
        this.field1419 = new short[var10];
        var4.field2379 = var21;
        var5.field2379 = var36;
        var6.field2379 = var38;
        var7.field2379 = var40;
        var8.field2379 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method937(false);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method929(false);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method929(false);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method929(false);
            }
            this.field1441[var46] = var43 + var63;
            this.field1415[var46] = var44 + var64;
            this.field1425[var46] = var45 + var65;
            var43 = this.field1441[var46];
            var44 = this.field1415[var46];
            var45 = this.field1425[var46];
            if (var16 == 1) {
                this.field1442[var46] = var8.method937(false);
            }
        }
        var4.field2379 = var32;
        var5.field2379 = var28;
        var6.field2379 = var26;
        var7.field2379 = var30;
        var8.field2379 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field1419[var47] = (short) var4.method912(-94);
            if (var12 == 1) {
                int var61 = var5.method937(false);
                if ((var61 & 0x1) == 1) {
                    this.field1413[var47] = 1;
                    var2 = true;
                } else {
                    this.field1413[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field1459[var47] = (byte) (var61 >> 2);
                    this.field1449[var47] = this.field1419[var47];
                    this.field1419[var47] = 127;
                    if (this.field1449[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1459[var47] = -1;
                    this.field1449[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1429[var47] = var6.method950(1495791448);
            }
            if (var14 == 1) {
                this.field1451[var47] = var7.method950(1495791448);
            }
            if (var15 == 1) {
                this.field1444[var47] = var8.method937(false);
            }
        }
        var4.field2379 = var25;
        var5.field2379 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method937(false);
            if (var57 == 1) {
                var48 = var4.method929(false) + var51;
                var49 = var4.method929(false) + var48;
                var50 = var4.method929(false) + var49;
                var51 = var50;
                this.field1417[var52] = var48;
                this.field1460[var52] = var49;
                this.field1427[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method929(false) + var51;
                var51 = var50;
                this.field1417[var52] = var48;
                this.field1460[var52] = var49;
                this.field1427[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method929(false) + var51;
                var51 = var50;
                this.field1417[var52] = var48;
                this.field1460[var52] = var49;
                this.field1427[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method929(false) + var51;
                var51 = var50;
                this.field1417[var52] = var48;
                this.field1460[var52] = var60;
                this.field1427[var52] = var50;
            }
        }
        var4.field2379 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field1421[var53] = 0;
            this.field1422[var53] = (short) var4.method912(-120);
            this.field1434[var53] = (short) var4.method912(56);
            this.field1414[var53] = (short) var4.method912(111);
        }
        if (this.field1459 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field1459[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field1422[var56] & 0xFFFF) == this.field1417[var55] && (this.field1434[var56] & 0xFFFF) == this.field1460[var55] && (this.field1414[var56] & 0xFFFF) == this.field1427[var55]) {
                        this.field1459[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field1459 = null;
            }
        }
        if (!var3) {
            this.field1449 = null;
        }
        if (!var2) {
            this.field1413 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lng;I)I")
    private final int method528(class74 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1441[arg1];
        int var5 = arg0.field1415[arg1];
        int var6 = arg0.field1425[arg1];
        for (int var7 = 0; var7 < this.field1439; var7++) {
            if (this.field1441[var7] == var4 && this.field1415[var7] == var5 && this.field1425[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1441[this.field1439] = var4;
            this.field1415[this.field1439] = var5;
            this.field1425[this.field1439] = var6;
            if (arg0.field1442 != null) {
                this.field1442[this.field1439] = arg0.field1442[arg1];
            }
            var3 = this.field1439++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    private final void method529(int arg0) {
        int var2 = field1436[arg0];
        int var3 = field1448[arg0];
        for (int var4 = 0; var4 < this.field1439; var4++) {
            int var5 = this.field1441[var4] * var3 + this.field1415[var4] * var2 >> 16;
            this.field1415[var4] = this.field1415[var4] * var3 - this.field1441[var4] * var2 >> 16;
            this.field1441[var4] = var5;
        }
        this.method537();
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "()V")
    public final void method530() {
        int var10002;
        if (this.field1442 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1439; var3++) {
                int var7 = this.field1442[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1461 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field1461[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1439) {
                int var6 = this.field1442[var5];
                this.field1461[var6][var1[var6]++] = var5++;
            }
            this.field1442 = null;
        }
        if (this.field1444 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1453; var10++) {
            int var14 = this.field1444[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field1437 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field1437[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field1453) {
            int var13 = this.field1444[var12];
            this.field1437[var13][var8[var13]++] = var12++;
        }
        this.field1444 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "()V")
    private final void method531() {
        if (this.field1455) {
            return;
        }
        this.field1455 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field1439; var7++) {
            int var8 = this.field1441[var7];
            int var9 = this.field1415[var7];
            int var10 = this.field1425[var7];
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
        this.field1452 = (short) var1;
        this.field1418 = (short) var4;
        this.field1433 = (short) var2;
        this.field1458 = (short) var5;
        this.field1443 = (short) var3;
        this.field1423 = (short) var6;
    }

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "()V")
    public final void method532() {
        if (this.field1457 != null) {
            return;
        }
        this.field1457 = new class19[this.field1439];
        for (int var1 = 0; var1 < this.field1439; var1++) {
            this.field1457[var1] = new class19();
        }
        for (int var2 = 0; var2 < this.field1453; var2++) {
            int var3 = this.field1417[var2];
            int var4 = this.field1460[var2];
            int var5 = this.field1427[var2];
            int var6 = this.field1441[var4] - this.field1441[var3];
            int var7 = this.field1415[var4] - this.field1415[var3];
            int var8 = this.field1425[var4] - this.field1425[var3];
            int var9 = this.field1441[var5] - this.field1441[var3];
            int var10 = this.field1415[var5] - this.field1415[var3];
            int var11 = this.field1425[var5] - this.field1425[var3];
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
            if (this.field1413 == null) {
                var19 = 0;
            } else {
                var19 = this.field1413[var2];
            }
            if (var19 == 0) {
                class19 var20 = this.field1457[var3];
                var20.field242 += var16;
                var20.field249 += var17;
                var20.field251 += var18;
                var20.field241++;
                class19 var21 = this.field1457[var4];
                var21.field242 += var16;
                var21.field249 += var17;
                var21.field251 += var18;
                var21.field241++;
                class19 var22 = this.field1457[var5];
                var22.field242 += var16;
                var22.field249 += var17;
                var22.field251 += var18;
                var22.field241++;
            } else if (var19 == 1) {
                if (this.field1446 == null) {
                    this.field1446 = new class176[this.field1453];
                }
                class176 var23 = this.field1446[var2] = new class176();
                var23.field3213 = var16;
                var23.field3210 = var17;
                var23.field3214 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(SS)V")
    public final void method533(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1453; var3++) {
            if (this.field1419[var3] == arg0) {
                this.field1419[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(III)I")
    public final int method534(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1439; var4++) {
            if (this.field1441[var4] == arg0 && this.field1415[var4] == arg1 && this.field1425[var4] == arg2) {
                return var4;
            }
        }
        this.field1441[this.field1439] = arg0;
        this.field1415[this.field1439] = arg1;
        this.field1425[this.field1439] = arg2;
        return this.field1439++;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    private final void method535(int arg0) {
        int var2 = field1436[arg0];
        int var3 = field1448[arg0];
        for (int var4 = 0; var4 < this.field1439; var4++) {
            int var5 = this.field1415[var4] * var3 - this.field1425[var4] * var2 >> 16;
            this.field1425[var4] = this.field1425[var4] * var3 + this.field1415[var4] * var2 >> 16;
            this.field1415[var4] = var5;
        }
        this.method537();
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([[III)I")
    private static final int method536(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "()V")
    private final void method537() {
        this.field1457 = null;
        this.field1435 = null;
        this.field1446 = null;
        this.field1455 = false;
    }

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "()V")
    public final void method538() {
        this.field1442 = null;
        this.field1444 = null;
        this.field1461 = null;
        this.field1437 = null;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
    public final void method539(int arg0) {
        int var2 = field1436[arg0];
        int var3 = field1448[arg0];
        for (int var4 = 0; var4 < this.field1439; var4++) {
            int var5 = this.field1441[var4] * var3 + this.field1425[var4] * var2 >> 16;
            this.field1425[var4] = this.field1425[var4] * var3 - this.field1441[var4] * var2 >> 16;
            this.field1441[var4] = var5;
        }
        this.method537();
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(III)V")
    public final void method540(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1439; var4++) {
            this.field1441[var4] += arg0;
            this.field1415[var4] += arg1;
            this.field1425[var4] += arg2;
        }
        this.method537();
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([[IIIIII)V")
    private final void method541(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method536(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method536(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method536(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method536(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method535(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method529(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method540(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "()V")
    public static void method542() {
        field1426 = null;
        field1432 = null;
        field1436 = null;
        field1448 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()I")
    public final int method211() {
        if (!this.field1455) {
            this.method531();
        }
        return this.field1433;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    private class74() {
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(III)V")
    public final void method543(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field1436[arg2];
            int var5 = field1448[arg2];
            for (int var6 = 0; var6 < this.field1439; var6++) {
                int var7 = this.field1441[var6] * var5 + this.field1415[var6] * var4 >> 16;
                this.field1415[var6] = this.field1415[var6] * var5 - this.field1441[var6] * var4 >> 16;
                this.field1441[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field1436[arg0];
            int var9 = field1448[arg0];
            for (int var10 = 0; var10 < this.field1439; var10++) {
                int var11 = this.field1415[var10] * var9 - this.field1425[var10] * var8 >> 16;
                this.field1425[var10] = this.field1425[var10] * var9 + this.field1415[var10] * var8 >> 16;
                this.field1415[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field1436[arg1];
        int var13 = field1448[arg1];
        for (int var14 = 0; var14 < this.field1439; var14++) {
            int var15 = this.field1441[var14] * var13 + this.field1425[var14] * var12 >> 16;
            this.field1425[var14] = this.field1425[var14] * var13 - this.field1441[var14] * var12 >> 16;
            this.field1441[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "([B)V")
    private class74(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method519(arg0);
        } else {
            this.method527(arg0);
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(III)V")
    public class74(int arg0, int arg1, int arg2) {
        this.field1441 = new int[arg0];
        this.field1415 = new int[arg0];
        this.field1425 = new int[arg0];
        this.field1442 = new int[arg0];
        this.field1417 = new int[arg1];
        this.field1460 = new int[arg1];
        this.field1427 = new int[arg1];
        this.field1413 = new byte[arg1];
        this.field1429 = new byte[arg1];
        this.field1451 = new byte[arg1];
        this.field1419 = new short[arg1];
        this.field1449 = new short[arg1];
        this.field1459 = new byte[arg1];
        this.field1444 = new int[arg1];
        if (arg2 > 0) {
            this.field1421 = new byte[arg2];
            this.field1422 = new short[arg2];
            this.field1434 = new short[arg2];
            this.field1414 = new short[arg2];
            this.field1430 = new short[arg2];
            this.field1420 = new short[arg2];
            this.field1445 = new short[arg2];
            this.field1440 = new byte[arg2];
            this.field1454 = new byte[arg2];
            this.field1456 = new byte[arg2];
            this.field1428 = new byte[arg2];
            this.field1416 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "([Lng;I)V")
    public class74(class74[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1439 = 0;
        this.field1453 = 0;
        this.field1447 = 0;
        this.field1450 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class74 var15 = arg0[var9];
            if (var15 != null) {
                this.field1439 += var15.field1439;
                this.field1453 += var15.field1453;
                this.field1447 += var15.field1447;
                if (var15.field1429 == null) {
                    if (this.field1450 == -1) {
                        this.field1450 = var15.field1450;
                    }
                    if (this.field1450 != var15.field1450) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field1413 != null;
                var5 |= var15.field1451 != null;
                var6 |= var15.field1444 != null;
                var7 |= var15.field1449 != null;
                var8 |= var15.field1459 != null;
            }
        }
        this.field1441 = new int[this.field1439];
        this.field1415 = new int[this.field1439];
        this.field1425 = new int[this.field1439];
        this.field1442 = new int[this.field1439];
        this.field1417 = new int[this.field1453];
        this.field1460 = new int[this.field1453];
        this.field1427 = new int[this.field1453];
        if (var3) {
            this.field1413 = new byte[this.field1453];
        }
        if (var4) {
            this.field1429 = new byte[this.field1453];
        }
        if (var5) {
            this.field1451 = new byte[this.field1453];
        }
        if (var6) {
            this.field1444 = new int[this.field1453];
        }
        if (var7) {
            this.field1449 = new short[this.field1453];
        }
        if (var8) {
            this.field1459 = new byte[this.field1453];
        }
        this.field1419 = new short[this.field1453];
        if (this.field1447 > 0) {
            this.field1421 = new byte[this.field1447];
            this.field1422 = new short[this.field1447];
            this.field1434 = new short[this.field1447];
            this.field1414 = new short[this.field1447];
            this.field1430 = new short[this.field1447];
            this.field1420 = new short[this.field1447];
            this.field1445 = new short[this.field1447];
            this.field1440 = new byte[this.field1447];
            this.field1454 = new byte[this.field1447];
            this.field1456 = new byte[this.field1447];
            this.field1428 = new byte[this.field1447];
            this.field1416 = new byte[this.field1447];
        }
        this.field1439 = 0;
        this.field1453 = 0;
        this.field1447 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class74 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field1453; var12++) {
                    if (var3 && var11.field1413 != null) {
                        this.field1413[this.field1453] = var11.field1413[var12];
                    }
                    if (var4) {
                        if (var11.field1429 == null) {
                            this.field1429[this.field1453] = var11.field1450;
                        } else {
                            this.field1429[this.field1453] = var11.field1429[var12];
                        }
                    }
                    if (var5 && var11.field1451 != null) {
                        this.field1451[this.field1453] = var11.field1451[var12];
                    }
                    if (var6 && var11.field1444 != null) {
                        this.field1444[this.field1453] = var11.field1444[var12];
                    }
                    if (var7) {
                        if (var11.field1449 == null) {
                            this.field1449[this.field1453] = -1;
                        } else {
                            this.field1449[this.field1453] = var11.field1449[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field1459 == null || var11.field1459[var12] == -1) {
                            this.field1459[this.field1453] = -1;
                        } else {
                            this.field1459[this.field1453] = (byte) (var11.field1459[var12] + this.field1447);
                        }
                    }
                    this.field1419[this.field1453] = var11.field1419[var12];
                    this.field1417[this.field1453] = this.method528(var11, var11.field1417[var12]);
                    this.field1460[this.field1453] = this.method528(var11, var11.field1460[var12]);
                    this.field1427[this.field1453] = this.method528(var11, var11.field1427[var12]);
                    this.field1453++;
                }
                for (int var13 = 0; var13 < var11.field1447; var13++) {
                    byte var14 = this.field1421[this.field1447] = var11.field1421[var13];
                    if (var14 == 0) {
                        this.field1422[this.field1447] = (short) this.method528(var11, var11.field1422[var13]);
                        this.field1434[this.field1447] = (short) this.method528(var11, var11.field1434[var13]);
                        this.field1414[this.field1447] = (short) this.method528(var11, var11.field1414[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field1422[this.field1447] = var11.field1422[var13];
                        this.field1434[this.field1447] = var11.field1434[var13];
                        this.field1414[this.field1447] = var11.field1414[var13];
                        this.field1430[this.field1447] = var11.field1430[var13];
                        this.field1420[this.field1447] = var11.field1420[var13];
                        this.field1445[this.field1447] = var11.field1445[var13];
                        this.field1440[this.field1447] = var11.field1440[var13];
                        this.field1454[this.field1447] = var11.field1454[var13];
                        this.field1456[this.field1447] = var11.field1456[var13];
                    }
                    if (var14 == 2) {
                        this.field1428[this.field1447] = var11.field1428[var13];
                        this.field1416[this.field1447] = var11.field1416[var13];
                    }
                    this.field1447++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lng;ZZZZ)V")
    public class74(class74 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1439 = arg0.field1439;
        this.field1453 = arg0.field1453;
        this.field1447 = arg0.field1447;
        if (arg1) {
            this.field1441 = arg0.field1441;
            this.field1415 = arg0.field1415;
            this.field1425 = arg0.field1425;
        } else {
            this.field1441 = new int[this.field1439];
            this.field1415 = new int[this.field1439];
            this.field1425 = new int[this.field1439];
            for (int var6 = 0; var6 < this.field1439; var6++) {
                this.field1441[var6] = arg0.field1441[var6];
                this.field1415[var6] = arg0.field1415[var6];
                this.field1425[var6] = arg0.field1425[var6];
            }
        }
        if (arg2) {
            this.field1419 = arg0.field1419;
        } else {
            this.field1419 = new short[this.field1453];
            for (int var7 = 0; var7 < this.field1453; var7++) {
                this.field1419[var7] = arg0.field1419[var7];
            }
        }
        if (arg3 || arg0.field1449 == null) {
            this.field1449 = arg0.field1449;
        } else {
            this.field1449 = new short[this.field1453];
            for (int var8 = 0; var8 < this.field1453; var8++) {
                this.field1449[var8] = arg0.field1449[var8];
            }
        }
        if (arg4) {
            this.field1451 = arg0.field1451;
        } else {
            this.field1451 = new byte[this.field1453];
            if (arg0.field1451 == null) {
                for (int var9 = 0; var9 < this.field1453; var9++) {
                    this.field1451[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1453; var10++) {
                    this.field1451[var10] = arg0.field1451[var10];
                }
            }
        }
        this.field1417 = arg0.field1417;
        this.field1460 = arg0.field1460;
        this.field1427 = arg0.field1427;
        this.field1413 = arg0.field1413;
        this.field1429 = arg0.field1429;
        this.field1459 = arg0.field1459;
        this.field1450 = arg0.field1450;
        this.field1421 = arg0.field1421;
        this.field1422 = arg0.field1422;
        this.field1434 = arg0.field1434;
        this.field1414 = arg0.field1414;
        this.field1430 = arg0.field1430;
        this.field1420 = arg0.field1420;
        this.field1445 = arg0.field1445;
        this.field1440 = arg0.field1440;
        this.field1454 = arg0.field1454;
        this.field1456 = arg0.field1456;
        this.field1428 = arg0.field1428;
        this.field1416 = arg0.field1416;
        this.field1442 = arg0.field1442;
        this.field1444 = arg0.field1444;
        this.field1461 = arg0.field1461;
        this.field1437 = arg0.field1437;
        this.field1457 = arg0.field1457;
        this.field1446 = arg0.field1446;
        this.field1435 = arg0.field1435;
        this.field1438 = arg0.field1438;
        this.field1424 = arg0.field1424;
    }
}
