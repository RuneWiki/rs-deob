import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class94 {

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    private int field1469 = 0;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "[Lhf;")
    public class287[] field1463;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[[I")
    public static int[][] field1450 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Z")
    public static boolean field1459 = true;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Z")
    public static boolean field1452 = true;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static volatile int field1455 = -1;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field1462 = -1;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "J")
    private long field1454;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lhf;")
    private class287 field1457;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "Lhf;")
    private class287 field1471;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "[[[B")
    public static byte[][][] field1467;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 4)
    public static void method683(int arg0) {
        field1467 = (byte[][][]) null;
        field1450 = (int[][]) null;
        if (arg0 != 13382) {
            field1459 = false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 18)
    public static final void method684(int arg0, int arg1) {
        field1461++;
        class186 var2 = class67.method561(32, arg1, arg0);
        var2.method1381(true);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(JI)Lhf;", line = 29)
    public final class287 method685(long arg0, int arg1) {
        if (arg1 != 128) {
            this.field1457 = (class287) null;
        }
        field1466++;
        this.field1454 = arg0;
        class287 var4 = this.field1463[(int) (arg0 & (long) (this.field1453 - 1))];
        for (this.field1457 = var4.field4939; this.field1457 != var4; this.field1457 = this.field1457.field4939) {
            if (this.field1457.field4932 == arg0) {
                class287 var5 = this.field1457;
                this.field1457 = this.field1457.field4939;
                return var5;
            }
        }
        this.field1457 = null;
        return null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[Lhf;)I", line = 59)
    public final int method686(int arg0, class287[] arg1) {
        field1458++;
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field1453; var4++) {
            class287 var5 = this.field1463[var4];
            for (class287 var6 = var5.field4939; var6 != var5; var6 = var6.field4939) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIII)V", line = 87)
    public static final void method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1451++;
        int var6 = arg3 - arg4;
        int var7 = arg5 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class165.method1165(arg5, arg1, arg4, arg2, arg0 ^ 0x42523C4C);
            }
        } else if (var7 == 0) {
            class56.method424(arg4, arg3, (byte) -119, arg2, arg1);
        } else if (arg0 == 1112685644) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg3 < class69.field1061) {
                var10 = class69.field1061;
                var11 = var9 + (class69.field1061 * var8 >> 12);
            } else if (arg3 > class153.field2504) {
                var11 = var9 + (class153.field2504 * var8 >> 12);
                var10 = class153.field2504;
            } else {
                var11 = arg5;
                var10 = arg3;
            }
            int var12;
            int var13;
            if (arg4 < class69.field1061) {
                var12 = class69.field1061;
                var13 = (class69.field1061 * var8 >> 12) + var9;
            } else if (arg4 > class153.field2504) {
                var13 = (class153.field2504 * var8 >> 12) + var9;
                var12 = class153.field2504;
            } else {
                var12 = arg4;
                var13 = arg1;
            }
            if (class28.field369 > var11) {
                var11 = class28.field369;
                var10 = (class28.field369 - var9 << 12) / var8;
            } else if (class62.field957 < var11) {
                var10 = (class62.field957 - var9 << 12) / var8;
                var11 = class62.field957;
            }
            if (class28.field369 > var13) {
                var12 = (class28.field369 - var9 << 12) / var8;
                var13 = class28.field369;
            } else if (class62.field957 < var13) {
                var12 = (class62.field957 - var9 << 12) / var8;
                var13 = class62.field957;
            }
            class248.method1742(arg0 ^ 0xBDADC3B3, var13, arg2, var12, var11, var10);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Lhf;", line = 191)
    public final class287 method688(int arg0) {
        field1456++;
        if (this.field1457 == null) {
            return null;
        } else if (arg0 < 125) {
            return (class287) null;
        } else {
            class287 var2 = this.field1463[(int) (this.field1454 & (long) (this.field1453 - 1))];
            while (this.field1457 != var2) {
                if (this.field1457.field4932 == this.field1454) {
                    class287 var3 = this.field1457;
                    this.field1457 = this.field1457.field4939;
                    return var3;
                }
                this.field1457 = this.field1457.field4939;
            }
            this.field1457 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)I", line = 227)
    public final int method689(int arg0) {
        field1460++;
        return arg0 == 18768 ? this.field1453 : -60;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V", line = 245)
    public final void method690(int arg0) {
        for (int var2 = 0; var2 < this.field1453; var2++) {
            class287 var3 = this.field1463[var2];
            while (true) {
                class287 var4 = var3.field4939;
                if (var3 == var4) {
                    break;
                }
                var4.method2000(127);
            }
        }
        field1472++;
        if (arg0 != 10) {
            this.method688(-25);
        }
        this.field1471 = null;
        this.field1457 = null;
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)I", line = 278)
    public final int method691(int arg0) {
        field1470++;
        int var2 = 0;
        int var3 = -59 / ((38 - arg0) / 49);
        for (int var4 = 0; var4 < this.field1453; var4++) {
            class287 var5 = this.field1463[var4];
            for (class287 var6 = var5.field4939; var6 != var5; var6 = var6.field4939) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)Lhf;", line = 310)
    public final class287 method692(int arg0) {
        if (arg0 == 64) {
            this.field1469 = 0;
            field1468++;
            return this.method693((byte) 106);
        } else {
            return (class287) null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)Lhf;", line = 326)
    public final class287 method693(byte arg0) {
        if (arg0 != 106) {
            field1467 = (byte[][][]) ((byte[][][]) null);
        }
        field1464++;
        if (this.field1469 > 0 && this.field1463[this.field1469 - 1] != this.field1471) {
            class287 var2 = this.field1471;
            this.field1471 = var2.field4939;
            return var2;
        }
        class287 var3;
        do {
            if (this.field1469 >= this.field1453) {
                return null;
            }
            var3 = this.field1463[this.field1469++].field4939;
        } while (this.field1463[this.field1469 - 1] == var3);
        this.field1471 = var3.field4939;
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lhf;BJ)V", line = 370)
    public final void method694(class287 arg0, byte arg1, long arg2) {
        field1465++;
        if (arg0.field4941 != null) {
            arg0.method2000(122);
        }
        if (arg1 != -90) {
            return;
        }
        class287 var5 = this.field1463[(int) (arg2 & (long) (this.field1453 - 1))];
        arg0.field4932 = arg2;
        arg0.field4939 = var5;
        arg0.field4941 = var5.field4941;
        arg0.field4941.field4939 = arg0;
        arg0.field4939.field4941 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I)V", line = 389)
    public class94(int arg0) {
        this.field1463 = new class287[arg0];
        this.field1453 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class287 var3 = this.field1463[var2] = new class287();
            var3.field4939 = var3;
            var3.field4941 = var3;
        }
    }
}
