import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class69 {

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    private int field1368 = 0;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[Llk;")
    public class81[] field1363;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[I")
    public static int[] field1353 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field1354 = 0;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Z")
    public static boolean field1360 = false;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1362 = 0;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lpj;")
    public static class237 field1366 = class33.method353("<col=ffffff>", 88);

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Lpj;")
    public static class237 field1371 = class33.method353("settings=", 92);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "J")
    private long field1361;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Llk;")
    private class81 field1357;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Llk;")
    private class81 field1369;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "[[B")
    public static byte[][] field1364;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[[[Lvk;")
    public static class35[][][] field1355;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)I")
    public final int method558(byte arg0) {
        field1358++;
        return arg0 == -60 ? this.field1365 : -80;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Llk;")
    public final class81 method559(boolean arg0) {
        field1359++;
        if (arg0) {
            return null;
        } else if (this.field1357 == null) {
            return null;
        } else {
            class81 var2 = this.field1363[(int) (this.field1361 & (long) (this.field1365 - 1))];
            while (this.field1357 != var2) {
                if (this.field1357.field1530 == this.field1361) {
                    class81 var3 = this.field1357;
                    this.field1357 = this.field1357.field1527;
                    return var3;
                }
                this.field1357 = this.field1357.field1527;
            }
            this.field1357 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lne;")
    public static final class50 method560(Throwable arg0, String arg1) {
        field1372++;
        class50 var2;
        if ((arg0 instanceof class50)) {
            var2 = (class50) arg0;
            var2.field1074 = var2.field1074 + ' ' + arg1;
        } else {
            var2 = new class50(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILcj;ILw;III)V")
    public static final void method561(int arg0, class115 arg1, int arg2, class141 arg3, int arg4, int arg5, int arg6) {
        field1356++;
        if (arg1 == null) {
            return;
        }
        int var7 = class257.field4417 + class13.field222 & 0x7FF;
        int var8 = Math.max(arg3.field2575 / 2, arg3.field2490 / 2) + 10;
        int var9 = arg2 * arg2 + arg5 * arg5;
        if (var9 > var8 * var8) {
            return;
        }
        if (arg6 < 122) {
            method564(-104);
        }
        int var10 = class150.field2670[var7];
        int var11 = class150.field2676[var7];
        int var12 = var11 * 256 / (class85.field1577 + 256);
        int var13 = var10 * 256 / (class85.field1577 + 256);
        int var14 = arg5 * var13 + (arg2 * var12) >> 16;
        int var15 = arg5 * var12 - arg2 * var13 >> 16;
        ((class225) arg1).method1496(arg3.field2575 / 2 + arg0 + var14 - arg1.field2030 / 2, arg4 - -(arg3.field2490 / 2) - (arg1.field2019 / 2 + var15), arg3.field2442, arg3.field2429);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Llk;JB)V")
    public final void method562(class81 arg0, long arg1, byte arg2) {
        field1373++;
        if (arg0.field1520 != null) {
            arg0.method629(0);
        }
        class81 var5 = this.field1363[(int) (arg1 & (long) (this.field1365 - 1))];
        arg0.field1527 = var5;
        arg0.field1520 = var5.field1520;
        if (arg2 != 56) {
            field1364 = null;
        }
        arg0.field1520.field1527 = arg0;
        arg0.field1530 = arg1;
        arg0.field1527.field1520 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
    public final void method563(byte arg0) {
        field1352++;
        for (int var2 = 0; var2 < this.field1365; var2++) {
            class81 var3 = this.field1363[var2];
            while (true) {
                class81 var4 = var3.field1527;
                if (var3 == var4) {
                    break;
                }
                var4.method629(0);
            }
        }
        if (arg0 == -95) {
            this.field1357 = null;
            this.field1369 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method564(int arg0) {
        field1366 = null;
        field1371 = null;
        field1355 = null;
        field1364 = null;
        field1353 = null;
        if (arg0 != -2691) {
            field1364 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
    public class69(int arg0) {
        this.field1365 = arg0;
        this.field1363 = new class81[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class81 var3 = this.field1363[var2] = new class81();
            var3.field1527 = var3;
            var3.field1520 = var3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Llk;")
    public final class81 method565(int arg0) {
        field1375++;
        if (this.field1368 > 0 && this.field1363[this.field1368 - 1] != this.field1369) {
            class81 var2 = this.field1369;
            this.field1369 = var2.field1527;
            return var2;
        }
        while (this.field1368 < this.field1365) {
            class81 var4 = this.field1363[this.field1368++].field1527;
            if (this.field1363[this.field1368 - 1] != var4) {
                this.field1369 = var4.field1527;
                return var4;
            }
        }
        int var3 = 67 / ((26 - arg0) / 50);
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Llk;")
    public final class81 method566(int arg0) {
        this.field1368 = arg0;
        field1374++;
        return this.method565(100);
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)I")
    public final int method567(byte arg0) {
        field1370++;
        int var2 = 0;
        if (arg0 != 32) {
            this.field1357 = null;
        }
        for (int var3 = 0; var3 < this.field1365; var3++) {
            class81 var4 = this.field1363[var3];
            for (class81 var5 = var4.field1527; var5 != var4; var5 = var5.field1527) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JI)Llk;")
    public final class81 method568(long arg0, int arg1) {
        field1351++;
        this.field1361 = arg0;
        class81 var4 = this.field1363[(int) ((long) (this.field1365 + arg1) & arg0)];
        for (this.field1357 = var4.field1527; this.field1357 != var4; this.field1357 = this.field1357.field1527) {
            if (this.field1357.field1530 == arg0) {
                class81 var5 = this.field1357;
                this.field1357 = this.field1357.field1527;
                return var5;
            }
        }
        this.field1357 = null;
        return null;
    }
}
