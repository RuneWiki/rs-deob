import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class114 {

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    private int field1488 = -1;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "Z")
    private boolean field1480 = true;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "[Lrp;")
    private class287[] field1484;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "[Lrp;")
    private class287[] field1495;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "Lrp;")
    private class287 field1491;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "C")
    public static char field1493;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Ll;")
    private class315 field1476;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "[Lpg;")
    public static class321[] field1489;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BIIIILtj;IIII)V")
    public final void method837(byte arg0, int arg1, int arg2, int arg3, int arg4, class298 arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 >= -48) {
            return;
        }
        field1492++;
        int var11 = arg7 + arg9 & 0x3FFF;
        if (this.field1478 == -1) {
            arg5.method435(arg4, arg6, arg8, arg2, arg1, 0);
        } else {
            class3 var12 = class264.field3896.method1962(this.field1478, -11999);
            if (this.field1476 == null && class264.field3896.method1960(false, this.field1478)) {
                int[] var13 = var12.field48 ? class264.field3896.method1961(this.field1485, false, this.field1478, 22881, 0.7F, this.field1485) : class264.field3896.method1958(22410, this.field1485, this.field1485, false, this.field1478, 0.7F);
                this.field1476 = arg5.method514(var13, 0, this.field1485, this.field1485, this.field1485);
            }
            if (!var12.field48) {
                arg5.method435(arg4, arg6, arg8, arg2, arg1, 0);
            }
            if (this.field1476 != null) {
                int var14 = var12.field48 ? 0 : 1;
                int var15 = arg2 * arg3 / -4096;
                int var16;
                for (var16 = arg2 * var11 / 4096 + (arg8 - arg2) / 2; var16 > arg2; var16 -= arg2) {
                }
                while (var15 > arg2) {
                    var15 -= arg2;
                }
                while (var16 < 0) {
                    var16 += arg2;
                }
                while (var15 < 0) {
                    var15 += arg2;
                }
                for (int var17 = var16 - arg2; var17 < arg8; var17 += arg2) {
                    for (int var18 = var15 - arg2; var18 < arg2; var18 += arg2) {
                        this.field1476.method200(arg4 + var17, arg6 + var18, arg2, arg2, 0, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field1477 - 1; var19 >= 0; var19--) {
            this.field1495[var19].method1957(arg5, arg4, arg6, arg8, arg2, arg3, var11);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIII)I")
    public static final int method838(int arg0, int arg1, int arg2, int arg3) {
        field1496++;
        if ((class406.field5912[arg1][arg0][arg2] & 0x8) == arg3) {
            return arg1 <= 0 || (class406.field5912[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZLtj;)Z")
    public final boolean method839(int arg0, boolean arg1, class298 arg2) {
        field1483++;
        if (this.field1488 != arg0) {
            this.field1488 = arg0;
            int var4 = class41.method299(2, arg0);
            if (arg0 < var4) {
                var4 = class437.method2740(381, arg0);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field1485 != var4) {
                this.field1476 = null;
                this.field1485 = var4;
            }
            if (this.field1484 != null) {
                this.field1477 = 0;
                int[] var5 = new int[this.field1484.length];
                for (int var6 = 0; var6 < this.field1484.length; var6++) {
                    class287 var7 = this.field1484[var6];
                    if (var7.method1950(this.field1486, this.field1482, this.field1481, this.field1488)) {
                        var5[this.field1477] = var7.field4322;
                        this.field1495[this.field1477++] = var7;
                    }
                }
                class333.method2175(this.field1495, (byte) -127, var5, this.field1477 - 1, 0);
            }
            this.field1480 = true;
        }
        boolean var8 = false;
        if (this.field1480) {
            this.field1480 = false;
            for (int var9 = this.field1477 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field1495[var9].method1952(arg2, this.field1491);
                this.field1480 |= !var10;
                var8 |= var10;
            }
        }
        if (!arg1) {
            this.field1481 = -46;
        }
        return var8;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
    public static void method840(byte arg0) {
        int var1 = -17 / ((11 - arg0) / 39);
        field1489 = null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method841(int arg0, int arg1) {
        field1487++;
        String var2 = Integer.toString(arg0);
        int var3 = var2.length() - 3;
        if (arg1 != 0) {
            field1493 = '7';
        }
        while (var3 > 0) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            var3 -= 3;
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class258.field3802 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class338.field4999 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method842(int arg0, int arg1, String arg2) {
        field1494++;
        class440 var3 = class186.method1241(arg1, 3, (byte) 56);
        var3.method2756(-1369656528);
        if (arg0 != 1) {
            method843(false, -20, (Object) null);
        }
        var3.field6376 = arg2;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method843(boolean arg0, int arg1, Object arg2) {
        if (arg1 != 0) {
            method840((byte) -110);
        }
        field1479++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class101.method775(0, var3) : var3;
        } else if (arg2 instanceof class190) {
            class190 var4 = (class190) arg2;
            return var4.method1268(0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public final void method844(int arg0) {
        if (arg0 < 32) {
            return;
        }
        field1490++;
        if (this.field1484 != null) {
            for (int var2 = 0; var2 < this.field1484.length; var2++) {
                this.field1484[var2].method1951();
            }
        }
        this.field1476 = null;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(I[Lrp;IIII)V")
    public class114(int arg0, class287[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1484 = arg1;
        this.field1486 = arg3;
        this.field1478 = arg0;
        this.field1482 = arg4;
        this.field1481 = arg5;
        if (arg1 == null) {
            this.field1491 = null;
            this.field1495 = null;
        } else {
            this.field1495 = new class287[arg1.length];
            this.field1491 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IC)Z")
    public static final boolean method845(int arg0, char arg1) {
        field1474++;
        if (arg0 >= -72) {
            field1493 = '\u001D';
        }
        return arg1 >= '0' && arg1 <= '9';
    }
}
