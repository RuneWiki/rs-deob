import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class class71 extends class314 {

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "[Ltm;")
    public class71[] field1393;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "Z")
    public boolean field1389;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "Lud;")
    public static class279 field1397 = class130.method1024("sch-Utteln:", 255);

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Lud;")
    private static class279 field1387 = class130.method1024("Loading fonts )2 ", 255);

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "Lud;")
    public static class279 field1388 = field1387;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "Lud;")
    public static class279 field1402 = class130.method1024("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 255);

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "[Z")
    public static boolean[] field1398 = new boolean[100];

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "Lud;")
    private static class279 field1403 = class130.method1024("Loaded sprites", 255);

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "Lud;")
    public static class279 field1399 = field1403;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "Lce;")
    public class245 field1400;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "Lbk;")
    public class63 field1390;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)[[I", line = 4)
    public final int[][] method619(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            return (int[][]) ((int[][]) null);
        }
        field1395++;
        if (this.field1393[arg0].field1389) {
            int[] var4 = this.field1393[arg0].method199(arg2, (byte) -100);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1393[arg0].method86(arg2, 112);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 36)
    public static final void method620(int arg0) {
        field1405++;
        try {
            if (class181.field3310 == 1) {
                int var1 = class17.field538.method104(-465);
                if (var1 > 0 && class17.field538.method124(arg0 + 35915)) {
                    int var2 = var1 - class235.field4103;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class17.field538.method130(arg0 ^ 0xFFFF9B71, var2);
                    return;
                }
                class17.field538.method115(false);
                class17.field538.method137((byte) -54);
                class185.field3399 = null;
                class214.field3759 = null;
                if (class204.field3633 == null) {
                    class181.field3310 = 0;
                } else {
                    class181.field3310 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class17.field538.method115(false);
            class214.field3759 = null;
            class185.field3399 = null;
            class204.field3633 = null;
            class181.field3310 = 0;
        }
        if (arg0 != -25813) {
            method626(-126);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZLvh;)V", line = 80)
    public void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            method620(124);
        }
        field1404++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)[[I", line = 94)
    public int[][] method86(int arg0, int arg1) {
        field1411++;
        int var3 = -43 / ((-arg1 - 70) / 54);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIZII)V", line = 106)
    public static final void method621(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (!arg4) {
            return;
        }
        int var7 = 0;
        class130[] var8 = class268.field4807;
        while (var8.length > var7) {
            class130 var9 = var8[var7];
            if (var9 != null && var9.field2365 == 2) {
                class260.method1864((var9.field2370 - class12.field396 << 7) + var9.field2375, true, arg3, arg6, (var9.field2371 - class112.field2058 << 7) + var9.field2379, arg1 >> 1, var9.field2372 * 2, arg5 >> 1);
                if (class209.field3679 > -1 && (class8.field279 % 20) < 10) {
                    class199.field3557[var9.field2380].method584(arg0 - (12 - class209.field3679), arg2 - 28 + class12.field385);
                }
            }
            var7++;
        }
        field1394++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)V", line = 147)
    public static final void method622(int arg0, byte arg1) {
        field1406++;
        class104 var2 = class293.method2085(2, arg0, false);
        if (arg1 != 24) {
            field1387 = (class279) null;
        }
        var2.method875(12466);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(III)V", line = 164)
    public final void method623(int arg0, int arg1, int arg2) {
        field1409++;
        int var4 = this.field1391 == arg0 ? arg1 : this.field1391;
        if (this.field1389) {
            this.field1390 = new class63(var4, arg1, arg2);
        } else {
            this.field1400 = new class245(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(III)[I", line = 192)
    public final int[] method624(int arg0, int arg1, int arg2) {
        if (arg1 == -3) {
            field1396++;
            return this.field1393[arg2].field1389 ? this.field1393[arg2].method199(arg0, (byte) -107) : this.field1393[arg2].method86(arg0, -125)[0];
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)I", line = 221)
    public int method625(byte arg0) {
        field1410++;
        int var2 = 100 % ((arg0 - 53) / 56);
        return -1;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(IB)[I", line = 245)
    public int[] method199(int arg0, byte arg1) {
        field1407++;
        if (arg1 > -69) {
            field1403 = (class279) null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 258)
    public static void method626(int arg0) {
        field1388 = null;
        field1399 = null;
        field1402 = null;
        if (arg0 != -27576) {
            field1403 = (class279) null;
        }
        field1398 = null;
        field1403 = null;
        field1387 = null;
        field1397 = null;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)I", line = 275)
    public int method87(int arg0) {
        field1392++;
        if (arg0 != -3) {
            field1387 = (class279) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V", line = 293)
    public void method627(int arg0) {
        if (arg0 != 7) {
            this.method619(66, -50, -116);
        }
        field1408++;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IZ)V", line = 307)
    public class71(int arg0, boolean arg1) {
        this.field1393 = new class71[arg0];
        this.field1389 = arg1;
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)V", line = 331)
    public void method85(int arg0) {
        if (this.field1389) {
            this.field1390.method556(12536);
            this.field1390 = null;
        } else {
            this.field1400.method1748(102);
            this.field1400 = null;
        }
        if (arg0 != 30767) {
            field1387 = (class279) null;
        }
        field1401++;
    }
}
