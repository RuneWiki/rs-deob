import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class58 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    private int[] field1450;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1448 = 0;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "[I")
    public static int[] field1449 = new int[50];

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Z")
    public static boolean field1455 = false;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Lmc;")
    public static class75 field1462 = class30.method234(true, ")3");

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lfa;")
    public static class32 field1457 = new class32();

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1468 = 1;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Lmc;")
    public static class75 field1467 = class30.method234(true, " x");

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lmc;")
    private static class75 field1469 = class30.method234(true, "skill)2");

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Lmc;")
    private static class75 field1472 = class30.method234(true, " has logged in)3");

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Lmc;")
    private static class75 field1466 = class30.method234(true, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lmc;")
    public static class75 field1463 = field1466;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Lmc;")
    public static class75 field1464 = field1472;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "Z")
    public static boolean field1471 = false;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "Lmc;")
    public static class75 field1473 = field1469;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "J")
    public static long field1459;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lpb;")
    public static class92 field1465;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "[Laa;")
    public static class2[] field1470;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 4)
    public static void method462(int arg0) {
        field1473 = null;
        field1467 = null;
        field1469 = null;
        field1472 = null;
        field1470 = null;
        field1465 = null;
        field1466 = null;
        field1449 = null;
        field1457 = null;
        field1463 = null;
        field1462 = null;
        if (arg0 != 19384) {
            field1469 = null;
        }
        field1464 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I", line = 25)
    public final int method463(int arg0, int arg1) {
        field1453++;
        if (arg1 > -26) {
            field1457 = null;
        }
        int var3 = this.field1450.length - 2;
        int var4 = var3 & arg0 << 1;
        while (true) {
            int var5 = this.field1450[var4];
            if (arg0 == var5) {
                return this.field1450[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILja;Lja;)V", line = 54)
    public static final void method464(int arg0, class55 arg1, class55 arg2) {
        class34.field769 = arg2;
        field1461++;
        class24.field474 = arg1;
        if (arg0 > -42) {
            field1463 = null;
        }
        class59.field1529 = class34.field769.method430(24094, 3);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZIIIII[B[Lba;)V", line = 67)
    public static final void method465(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, class8[] arg9) {
        field1451++;
        if (!arg2) {
            return;
        }
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg0 + var10 > 0 && arg0 + var10 < 103 && arg3 + var15 > 0 && arg3 + var15 < 103) {
                    arg9[arg6].field121[arg0 + var10][arg3 + var15] = class56.method456(arg9[arg6].field121[arg0 + var10][arg3 + var15], -16777217);
                }
            }
        }
        class61 var11 = new class61(arg8);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg1 == var12 && arg5 <= var13 && var13 < arg5 + 8 && arg4 <= var14 && arg4 + 8 > var14) {
                        class70.method592(var11, -77, arg0 + class63.method551(arg7, var14 & 0x7, 0, var13 & 0x7), 0, 0, method469(var14 & 0x7, var13 & 0x7, arg7, -1) + arg3, arg7, arg6);
                    } else {
                        class70.method592(var11, -49, -1, 0, 0, -1, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([I)V", line = 132)
    public class58(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1450 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1450[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1450[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field1450[var5 + var5] = arg0[var4];
            this.field1450[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lib;I)V", line = 170)
    public static final void method466(class50 arg0, int arg1) {
        int var2 = -104 % ((arg1 + 41) / 53);
        int var3 = arg0.field1200 - class34.field781;
        int var4 = arg0.field1253 * 128 + arg0.field1263 * 64;
        arg0.field1256 = 0;
        int var5 = arg0.field1263 * 64 + arg0.field1232 * 128;
        if (arg0.field1210 == 0) {
            arg0.field1271 = 1024;
        }
        arg0.field1233 += (var4 - arg0.field1233) / var3;
        arg0.field1242 += (var5 - arg0.field1242) / var3;
        if (arg0.field1210 == 1) {
            arg0.field1271 = 1536;
        }
        field1454++;
        if (arg0.field1210 == 2) {
            arg0.field1271 = 0;
        }
        if (arg0.field1210 == 3) {
            arg0.field1271 = 512;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 212)
    public static final void method467(int arg0) {
        field1456++;
        if (arg0 != -2) {
            method462(23);
        }
        for (class24 var1 = (class24) class40.field949.method248(32); var1 != null; var1 = (class24) class40.field949.method252(arg0 + 116)) {
            if (var1.field472 > 0) {
                var1.field472--;
            }
            if (var1.field472 != 0) {
                if (var1.field456 > 0) {
                    var1.field456--;
                }
                if (var1.field456 == 0 && var1.field473 >= 1 && var1.field457 >= 1 && var1.field473 <= 102 && var1.field457 <= 102 && (var1.field466 < 0 || class78.method666(var1.field466, (byte) 118, var1.field461))) {
                    class76.method662(var1.field464, var1.field460, var1.field457, var1.field473, var1.field466, false, var1.field461, var1.field470);
                    var1.field456 = -1;
                    if (var1.field475 == var1.field466 && var1.field475 == -1) {
                        var1.method589(true);
                    } else if (var1.field475 == var1.field466 && var1.field465 == var1.field460 && var1.field468 == var1.field461) {
                        var1.method589(true);
                    }
                }
            } else if (var1.field475 < 0 || class78.method666(var1.field475, (byte) 123, var1.field468)) {
                class76.method662(var1.field464, var1.field465, var1.field457, var1.field473, var1.field475, false, var1.field468, var1.field470);
                var1.method589(true);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)Z", line = 272)
    public static final boolean method468(int arg0, int arg1) {
        field1460++;
        if (!class129.method1013(arg1, -1)) {
            return false;
        } else if (arg0 > -6) {
            return true;
        } else {
            class99[] var2 = class74.field1854[arg1];
            boolean var3 = false;
            for (int var4 = 0; var4 < var2.length; var4++) {
                class99 var5 = var2[var4];
                if (var5 != null && var5.field2535 == 6) {
                    if (var5.field2495 != -1 || var5.field2545 != -1) {
                        boolean var6 = class30.method238(27389, var5);
                        int var7;
                        if (var6) {
                            var7 = var5.field2545;
                        } else {
                            var7 = var5.field2495;
                        }
                        if (var7 != -1) {
                            class107 var8 = class37.method289(var7, (byte) -125);
                            var5.field2487 += class71.field1802;
                            while (var8.field2675[var5.field2499] < var5.field2487) {
                                var5.field2487 -= var8.field2675[var5.field2499];
                                var5.field2499++;
                                if (var5.field2499 >= var8.field2662.length) {
                                    var5.field2499 -= var8.field2666;
                                    if (var5.field2499 < 0 || var8.field2662.length <= var5.field2499) {
                                        var5.field2499 = 0;
                                    }
                                }
                                var3 = true;
                            }
                        }
                    }
                    if (var5.field2547 != 0) {
                        var3 = true;
                        int var9 = var5.field2547 << 16 >> 16;
                        int var10 = class71.field1802 * var9;
                        var5.field2549 = var5.field2549 + var10 & 0x7FF;
                        int var11 = var5.field2547 >> 16;
                        int var12 = class71.field1802 * var11;
                        var5.field2505 = var5.field2505 + var12 & 0x7FF;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I", line = 362)
    private static final int method469(int arg0, int arg1, int arg2, int arg3) {
        field1452++;
        int var4 = arg2 & 0x3;
        if (~var4 == arg3) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }
}
