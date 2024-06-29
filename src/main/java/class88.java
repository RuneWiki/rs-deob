import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class88 extends class288 {

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public int field1394 = 0;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "Z")
    public boolean field1407 = false;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Lwc;")
    private class29 field1396 = new class29();

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    private int field1411 = 0;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "Lie;")
    public class2 field1414 = new class2();

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "Z")
    private boolean field1425 = false;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    private int field1424 = 0;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "[Ljb;")
    public class198[] field1403;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "J")
    private long field1400;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field1399 = 0;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field1398 = 0;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field1401 = 0;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Z")
    private static boolean field1408 = false;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field1409 = 0;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "Lrc;")
    public static class217 field1402 = new class217(8);

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field1413 = 2;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "[Z")
    private static boolean[] field1429 = new boolean[8];

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "[Z")
    private static boolean[] field1415 = new boolean[8];

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
    private static int field1432 = 0;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "J")
    public long field1405;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "J")
    private long field1410;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "Lwc;")
    private static class29 field1406;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "[Ljb;")
    public static class198[] field1397;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V")
    public final void method650(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1407) {
            return;
        }
        if (this.field1416 != arg0) {
            for (class258 var6 = (class258) this.field1396.method182(5); var6 != null; var6 = (class258) this.field1396.method188(10)) {
                var6.field3999 = true;
            }
        }
        this.field1410 = this.field1405;
        this.field1416 = arg0;
        this.field1426 = arg1;
        this.field1422 = arg2;
        this.field1418 = arg3;
        this.field1430 = arg4;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
    public static final void method651(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()I")
    public final int method652() {
        if (this.field1427 == this.field1417 && this.field1428 == this.field1419) {
            return 92;
        }
        int var1 = this.field1427 << 7;
        int var2 = (this.field1417 << 7) + 128;
        int var3 = this.field1428 << 7;
        int var4 = (this.field1419 << 7) + 128;
        int var5 = this.field1422 - var1;
        int var6 = var2 - this.field1422;
        if (var5 > var6) {
            int var7 = this.field1430 - var3;
            int var8 = var4 - this.field1430;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field1430 - var3;
            int var10 = var4 - this.field1430;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(IIIII)V")
    public final void method653(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method650(arg0, arg1, class159.field2479 + arg2, class282.field4540 + arg3, class141.field2281 + arg4);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "()V")
    public final void method654() {
        this.field1425 = true;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Llc;)V")
    public static final void method655(class270 arg0) {
        field1401 = 0;
        field1399 = 0;
        field1406 = new class29();
        field1397 = new class198[1024];
        class78.method580(false, arg0);
        class29.method181(arg0, (byte) 126);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public static final void method656(int arg0) {
        field1413 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)V")
    private final void method657(int arg0, int arg1) {
        for (class236 var3 = (class236) this.field1414.method8(-126); var3 != null; var3 = (class236) this.field1414.method12((byte) 69)) {
            var3.field3444 = this.field1422 + var3.field3460;
            var3.field3449 = this.field1418 + var3.field3459;
            var3.field3446 = this.field1430 + var3.field3445;
            if (this.field1416 == 0) {
                var3.field3457 = var3.field3454.field1698.field2296;
                var3.field3442 = var3.field3454.field1698.field2307;
            } else {
                int var4 = var3.field3454.field1698.field2296;
                int var5 = var3.field3454.field1698.field2307;
                var3.field3457 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field3442 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "()V")
    public final void method658() {
        this.field1407 = true;
        for (class236 var1 = (class236) this.field1414.method8(-70); var1 != null; var1 = (class236) this.field1414.method12((byte) 69)) {
            if (var1.field3454.field1698.field2286 == 1) {
                var1.method1135(false);
            }
        }
        this.field1403 = new class198[8192];
        this.field1394 = 0;
        this.field1396 = new class29();
        this.field1411 = 0;
        this.field1414 = new class2();
        this.field1424 = 0;
        this.method1969((byte) 93);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(J)V")
    public static final void method659(long arg0) {
        field1409 = field1404;
        field1398 = 0;
        field1404 = 0;
        long var2 = class3.method14(29853);
        for (class88 var4 = (class88) field1406.method182(5); var4 != null; var4 = (class88) field1406.method188(10)) {
            if (var4.method662(arg0)) {
                field1398++;
            }
        }
        if (field1408 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field1406.method185(0) + ", running: " + field1398 + ". Particles: " + field1404 + ". Time taken: " + (class3.method14(29853) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([Lgi;[Lkf;Z[I[I[I)V")
    public final void method660(class286[] arg0, class100[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field1407) {
            this.method663(arg0, arg2, arg3, arg4, arg5);
            this.method661(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([Lkf;Z[I[I[I)V")
    private final void method661(class100[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field1429[var6] = false;
        }
        label91: for (class236 var7 = (class236) this.field1414.method8(-79); var7 != null; var7 = (class236) this.field1414.method12((byte) 69)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field3454) {
                        field1429[var12] = true;
                        continue label91;
                    }
                }
            }
            if (!arg1) {
                var7.method1781(5250);
                this.field1424--;
                if (var7.method1136(false)) {
                    var7.method1135(false);
                    field1432--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field1424 != 8; var8++) {
            if (!field1429[var8]) {
                class236 var9 = null;
                if (arg0[var8].field1698.field2286 == 1 && field1432 < 32) {
                    var9 = new class236(arg0[var8], this);
                    field1402.method1517((byte) -128, (long) arg0[var8].field1698.field2298, var9);
                    field1432++;
                }
                if (var9 == null) {
                    var9 = new class236(arg0[var8], this);
                }
                this.field1414.method13(32, var9);
                this.field1424++;
                field1429[var8] = true;
            }
        }
        for (class236 var10 = (class236) this.field1414.method8(-85); var10 != null; var10 = (class236) this.field1414.method12((byte) 69)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field1429[var11] && arg0[var11] == var10.field3454) {
                    var10.method1626(arg4[var10.field3454.field1697], arg2[var10.field3454.field1697], (byte) -110, arg3[var10.field3454.field1697]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(J)Z")
    private final boolean method662(long arg0) {
        long var3;
        if (this.field1400 > this.field1410) {
            var3 = this.field1400;
        } else {
            var3 = this.field1410;
        }
        int var5 = (int) (this.field1405 - var3);
        if (var5 > 750) {
            this.method658();
            return false;
        }
        if (this.field1410 > 0L) {
            this.field1427 = this.field1422 - (this.field1420 << 6) >> 7;
            this.field1417 = ((this.field1420 << 6) + this.field1422 >> 7) - 1;
            this.field1428 = this.field1430 - (this.field1421 << 6) >> 7;
            this.field1419 = ((this.field1421 << 6) + this.field1430 >> 7) - 1;
            this.field1423 = this.field1418;
            if (this.field1426 < 3) {
                this.field1431 = class103.field1792[this.field1426 + 1][this.field1427][this.field1428] + class103.field1792[this.field1426 + 1][this.field1417][this.field1428] + class103.field1792[this.field1426 + 1][this.field1427][this.field1419] + class103.field1792[this.field1426 + 1][this.field1417][this.field1419] >> 2;
            } else {
                this.field1431 = this.field1423 - 1024;
            }
            int var6 = class244.field3590[this.field1416];
            int var7 = class244.field3592[this.field1416];
            this.method657(var6, var7);
            if (this.field1425) {
                class258 var8 = (class258) this.field1396.method182(5);
                while (true) {
                    if (var8 == null) {
                        this.field1425 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field3981.field2075; var9++) {
                        var8.method1778(var7, 2, 1, var6, this.field1405, true);
                    }
                    var8 = (class258) this.field1396.method188(10);
                }
            }
            int var10 = (int) (arg0 - this.field1405);
            for (class258 var11 = (class258) this.field1396.method182(5); var11 != null; var11 = (class258) this.field1396.method188(10)) {
                var11.method1778(var7, 2, var10, var6, arg0, var5 < 10);
            }
        }
        this.field1405 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([Lgi;Z[I[I[I)V")
    private final void method663(class286[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field1415[var6] = false;
        }
        label82: for (class258 var7 = (class258) this.field1396.method182(5); var7 != null; var7 = (class258) this.field1396.method188(10)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field3977) {
                        field1415[var12] = true;
                        var7.field3995 = false;
                        continue label82;
                    }
                }
            }
            if (!arg1) {
                if (var7.field3991 == 0) {
                    var7.method1969((byte) 93);
                    this.field1411--;
                } else {
                    var7.field3995 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field1411 != 8; var8++) {
            if (!field1415[var8]) {
                class258 var9 = new class258(arg0[var8], this, this.field1405);
                this.field1396.method184(113, var9);
                this.field1411++;
                field1415[var8] = true;
            }
        }
        for (class258 var10 = (class258) this.field1396.method182(5); var10 != null; var10 = (class258) this.field1396.method188(10)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field1415[var11] && arg0[var11] == var10.field3977) {
                    var10.method1775(arg2[var10.field3977.field4586], arg4[var10.field3977.field4584], arg4[var10.field3977.field4591], arg2[var10.field3977.field4584], arg3[var10.field3977.field4586], arg3[var10.field3977.field4584], 1024, arg4[var10.field3977.field4586], arg3[var10.field3977.field4591], arg2[var10.field3977.field4591]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "()I")
    public static final int method664() {
        return field1413;
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "()V")
    public static final void method665() {
        field1402 = new class217(8);
        field1432 = 0;
        for (class88 var0 = (class88) field1406.method182(5); var0 != null; var0 = (class88) field1406.method188(10)) {
            var0.method658();
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "()V")
    public static void method666() {
        field1406 = null;
        field1397 = null;
        field1402 = null;
        field1415 = null;
        field1429 = null;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(III)V")
    public class88(int arg0, int arg1, int arg2) {
        this.field1420 = arg1;
        this.field1421 = arg2;
        this.field1403 = new class198[8192];
        this.field1400 = (long) arg0;
        this.field1425 = true;
        field1406.method184(98, this);
    }

    static {
        new class53(131056);
    }
}
