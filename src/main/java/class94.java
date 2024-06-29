import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class94 extends class247 {

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1405 = "Unable to find ";

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "[I")
    public static int[] field1411 = new int[5];

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[I)V")
    public final void method637(int arg0, int arg1, int arg2, int[] arg3) {
        field1420++;
        arg3[2] = -this.field1418 - (-this.field1416 - arg1);
        arg3[0] = this.field1423;
        arg3[arg0] = arg2 - (this.field1422 - this.field1414);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBII)Z")
    public final boolean method638(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -53) {
            this.field1409 = -77;
        }
        field1403++;
        return this.field1423 == arg2 && arg0 >= this.field1414 && arg0 <= this.field1404 && arg3 >= this.field1416 && this.field1407 >= arg3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
    public static final void method639(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class268.field4345 == 1) {
            class61.field886[class313.field5023 / 100].method285(class257.field4190 - 8, class114.field1672 + -8);
        }
        field1417++;
        if (arg4 != 4) {
            field1405 = null;
        }
        if (class268.field4345 == 2) {
            class61.field886[class313.field5023 / 100 + 4].method285(class257.field4190 - 8, class114.field1672 - 8);
        }
        class179.method1272((byte) 27);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B[B)Lek;")
    public static final class173 method640(byte arg0, byte[] arg1) {
        field1410++;
        class173 var2 = new class173();
        class170 var3 = new class170(arg1);
        var3.field2676 = var3.field2650.length - 2;
        int var4 = var3.method1186((byte) -35);
        int var5 = var3.field2650.length - var4 - 12 - 2;
        var3.field2676 = var5;
        int var6 = var3.method1190(6345);
        var2.field2720 = var3.method1186((byte) -50);
        var2.field2726 = var3.method1186((byte) -37);
        var2.field2719 = var3.method1186((byte) -50);
        var2.field2714 = var3.method1186((byte) -125);
        if (arg0 < 51) {
            return null;
        }
        int var7 = var3.method1218(-49);
        if (var7 > 0) {
            var2.field2724 = new class153[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1186((byte) -119);
                class153 var10 = new class153(class297.method1997(111, var9));
                var2.field2724[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1190(6345);
                    int var12 = var3.method1190(6345);
                    var10.method1054(-3510, new class178(var12), (long) var11);
                }
            }
        }
        var3.field2676 = 0;
        var2.field2718 = var3.method1176((byte) -125);
        int var13 = 0;
        var2.field2715 = new int[var6];
        var2.field2722 = new String[var6];
        var2.field2717 = new int[var6];
        while (var3.field2676 < var5) {
            int var14 = var3.method1186((byte) -41);
            if (var14 == 3) {
                var2.field2722[var13] = var3.method1195(-1).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field2715[var13] = var3.method1218(113);
            } else {
                var2.field2715[var13] = var3.method1190(6345);
            }
            var2.field2717[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BII)Z")
    public final boolean method641(byte arg0, int arg1, int arg2) {
        field1415++;
        int var4 = 117 / ((arg0 + 13) / 49);
        return this.field1414 <= arg2 && arg2 <= this.field1404 && arg1 >= this.field1416 && arg1 <= this.field1407;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public static void method642(int arg0) {
        if (arg0 < -112) {
            field1411 = null;
            field1405 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Z")
    public static final boolean method643(int arg0) {
        field1413++;
        if (arg0 < 9) {
            return false;
        }
        if (class293.field4697) {
            try {
                if ((Boolean) class25.method132(class95.field1425.field3832, "showingVideoAd", (byte) 111)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Z")
    public final boolean method644(int arg0, int arg1, int arg2) {
        if (arg1 != 5) {
            this.field1414 = -104;
        }
        field1406++;
        return arg2 >= this.field1422 && arg2 <= this.field1402 && this.field1418 <= arg0 && arg0 <= this.field1419;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Lbh;")
    public static final class260 method645(byte arg0, int arg1) {
        class260 var2 = (class260) class134.field1931.method1517((long) arg1, (byte) 3);
        field1412++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class104.field1512.method501(arg0 ^ 0x6, arg1, 3);
        class260 var4 = new class260();
        if (var3 != null) {
            var4.method1837(true, new class170(var3));
        }
        class134.field1931.method1518(var4, (long) arg1, (byte) 75);
        return arg0 == -8 ? var4 : null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[II)V")
    public final void method646(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[1] = this.field1422 + arg0 - this.field1414;
        if (arg1 == 8) {
            arg2[2] = this.field1418 + arg3 - this.field1416;
            field1421++;
            arg2[0] = this.field1409;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1423 = arg0;
        this.field1407 = arg5;
        this.field1409 = arg1;
        this.field1422 = arg6;
        this.field1414 = arg2;
        this.field1418 = arg7;
        this.field1416 = arg3;
        this.field1419 = arg9;
        this.field1404 = arg4;
        this.field1402 = arg8;
    }
}
