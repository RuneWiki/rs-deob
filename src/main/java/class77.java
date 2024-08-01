import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hh")
public class class77 extends class147 {

    @OriginalMember(owner = "hh", name = "T", descriptor = "Z")
    public boolean field1482 = false;

    @OriginalMember(owner = "hh", name = "K", descriptor = "[I")
    private int[] field1473 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "hh", name = "R", descriptor = "I")
    public int field1480 = -1;

    @OriginalMember(owner = "hh", name = "M", descriptor = "I")
    public static int field1475 = 0;

    @OriginalMember(owner = "hh", name = "Q", descriptor = "Llf;")
    private static class109 field1479 = class35.method275("glow3:", 2);

    @OriginalMember(owner = "hh", name = "L", descriptor = "Llf;")
    public static class109 field1474 = field1479;

    @OriginalMember(owner = "hh", name = "J", descriptor = "Llf;")
    public static class109 field1472 = field1479;

    @OriginalMember(owner = "hh", name = "bb", descriptor = "Llf;")
    private static class109 field1490 = class35.method275("Drop", 2);

    @OriginalMember(owner = "hh", name = "gb", descriptor = "I")
    public static int field1495 = 0;

    @OriginalMember(owner = "hh", name = "V", descriptor = "Llf;")
    public static class109 field1484 = field1490;

    @OriginalMember(owner = "hh", name = "db", descriptor = "[I")
    public static int[] field1492 = new int[32];

    @OriginalMember(owner = "hh", name = "G", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "hh", name = "H", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "hh", name = "N", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "hh", name = "O", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "hh", name = "S", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "hh", name = "U", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "hh", name = "Y", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "hh", name = "Z", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "hh", name = "W", descriptor = "Lkf;")
    public static class100 field1485;

    @OriginalMember(owner = "hh", name = "P", descriptor = "[I")
    private int[] field1478;

    @OriginalMember(owner = "hh", name = "fb", descriptor = "[I")
    public static int[] field1494;

    @OriginalMember(owner = "hh", name = "X", descriptor = "[S")
    private short[] field1486;

    @OriginalMember(owner = "hh", name = "ab", descriptor = "[S")
    private short[] field1489;

    @OriginalMember(owner = "hh", name = "cb", descriptor = "[S")
    private short[] field1491;

    @OriginalMember(owner = "hh", name = "eb", descriptor = "[S")
    private short[] field1493;

    @OriginalMember(owner = "hh", name = "a", descriptor = "(III)J")
    public static final long method483(int arg0, int arg1, int arg2) {
        class3 var3 = class78.field1550[arg0][arg1][arg2];
        return var3 == null || var3.field27 == null ? 0L : var3.field27.field1030;
    }

    @OriginalMember(owner = "hh", name = "d", descriptor = "(B)Loe;")
    public final class135 method484(byte arg0) {
        field1483++;
        class135[] var2 = new class135[5];
        if (arg0 != -62) {
            field1472 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1473[var4] != -1) {
                var2[var3++] = class135.method969(class117.field2318, this.field1473[var4], 0);
            }
        }
        class135 var5 = new class135(var2, var3);
        if (this.field1486 != null) {
            for (int var6 = 0; var6 < this.field1486.length; var6++) {
                var5.method965(this.field1486[var6], this.field1491[var6]);
            }
        }
        if (this.field1489 != null) {
            for (int var7 = 0; var7 < this.field1489.length; var7++) {
                var5.method974(this.field1489[var7], this.field1493[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "hh", name = "b", descriptor = "(I)Loe;")
    public final class135 method485(int arg0) {
        field1476++;
        if (this.field1478 == null) {
            return null;
        }
        class135[] var2 = new class135[this.field1478.length];
        for (int var3 = arg0; var3 < this.field1478.length; var3++) {
            var2[var3] = class135.method969(class117.field2318, this.field1478[var3], 0);
        }
        class135 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class135(var2, var2.length);
        }
        if (this.field1486 != null) {
            for (int var5 = 0; var5 < this.field1486.length; var5++) {
                var4.method965(this.field1486[var5], this.field1491[var5]);
            }
        }
        if (this.field1489 != null) {
            for (int var6 = 0; var6 < this.field1489.length; var6++) {
                var4.method974(this.field1489[var6], this.field1493[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "hh", name = "a", descriptor = "(IILja;)V")
    private final void method486(int arg0, int arg1, class86 arg2) {
        field1471++;
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 1) {
            this.field1480 = arg2.method598((byte) 117);
        } else if (arg0 == 2) {
            int var8 = arg2.method598((byte) 92);
            this.field1478 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1478[var9] = arg2.method569(true);
            }
        } else if (arg0 == 3) {
            this.field1482 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method598((byte) 89);
            this.field1486 = new short[var6];
            this.field1491 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1486[var7] = (short) arg2.method569(true);
                this.field1491[var7] = (short) arg2.method569(true);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method598((byte) 109);
            this.field1489 = new short[var4];
            this.field1493 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1489[var5] = (short) arg2.method569(true);
                this.field1493[var5] = (short) arg2.method569(true);
            }
            return;
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1473[arg0 - 60] = arg2.method569(true);
            return;
        }
    }

    @OriginalMember(owner = "hh", name = "b", descriptor = "(Z)Z")
    public final boolean method487(boolean arg0) {
        field1477++;
        if (this.field1478 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0) {
            this.field1480 = -91;
        }
        for (int var3 = 0; var3 < this.field1478.length; var3++) {
            if (!class117.field2318.method161(0, this.field1478[var3], -113)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "hh", name = "e", descriptor = "(B)V")
    public static void method488(byte arg0) {
        field1474 = null;
        field1479 = null;
        field1492 = null;
        field1490 = null;
        field1485 = null;
        field1484 = null;
        if (arg0 == -15) {
            field1494 = null;
            field1472 = null;
        }
    }

    @OriginalMember(owner = "hh", name = "c", descriptor = "(I)Z")
    public final boolean method489(int arg0) {
        field1488++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1473[var3] != -1 && !class117.field2318.method161(0, this.field1473[var3], -121)) {
                var2 = false;
            }
        }
        if (arg0 != -1) {
            this.field1493 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "hh", name = "a", descriptor = "(ILja;)V")
    public final void method490(int arg0, class86 arg1) {
        while (true) {
            int var3 = arg1.method598((byte) 116);
            if (var3 == 0) {
                field1487++;
                if (arg0 != 60) {
                    this.field1491 = null;
                    return;
                }
                return;
            }
            this.method486(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "hh", name = "a", descriptor = "(ZIIILvg;)V")
    public static final void method491(boolean arg0, int arg1, int arg2, int arg3, class200 arg4) {
        if (class40.field845 < 3) {
            class42.field881.method723(arg2, arg3, arg4.field3881, arg4.field3901, class42.field881.field2009 / 2, class42.field881.field2008 / 2, class69.field1343, 256, arg4.field3815, arg4.field3876);
        } else {
            class11.method77(arg2, arg3, 0, arg4.field3815, arg4.field3876);
        }
        field1481++;
        class186.field3538[arg1] = arg0;
    }

    @OriginalMember(owner = "hh", name = "f", descriptor = "(B)V")
    public static final void method492(byte arg0) {
        field1470++;
        class115.method851(class182.field3431, -23101);
        class121.field2342++;
        if (class52.field1048 && class27.field596) {
            int var1 = class21.field479;
            int var2 = class109.field2134;
            int var3 = var2 - class147.field2842;
            int var4 = var1 - class161.field3013;
            if (arg0 != 121) {
                method492((byte) 31);
            }
            if (class193.field3688 > var3) {
                var3 = class193.field3688;
            }
            if (class21.field473 > var4) {
                var4 = class21.field473;
            }
            if (class193.field3688 + class46.field955.field3901 < class182.field3431.field3901 + var3) {
                var3 = class193.field3688 + class46.field955.field3901 - class182.field3431.field3901;
            }
            if (class182.field3431.field3881 + var4 > class21.field473 + class46.field955.field3881) {
                var4 = class21.field473 + class46.field955.field3881 - class182.field3431.field3881;
            }
            int var5 = var3 - class71.field1383;
            int var6 = var4 - class139.field2697;
            int var7 = class46.field955.field3817 + var4 - class21.field473;
            int var8 = class182.field3431.field3883;
            if (class121.field2342 > class182.field3431.field3872 && (var8 < var6 || -var8 > var6 || var8 < var5 || -var8 > var5)) {
                class139.field2701 = true;
            }
            int var9 = var3 + class46.field955.field3945 - class193.field3688;
            if (class182.field3431.field3940 != null && class139.field2701) {
                class82 var10 = new class82();
                var10.field1608 = class182.field3431;
                var10.field1613 = class182.field3431.field3940;
                var10.field1626 = var7;
                var10.field1611 = var9;
                class42.method305(24087, var10);
            }
            if (class206.field4043 == 0) {
                if (class139.field2701) {
                    if (class182.field3431.field3953 != null) {
                        class82 var11 = new class82();
                        var11.field1613 = class182.field3431.field3953;
                        var11.field1611 = var9;
                        var11.field1609 = class48.field984;
                        var11.field1626 = var7;
                        var11.field1608 = class182.field3431;
                        class42.method305(24087, var11);
                    }
                    if (class48.field984 != null && class4.method16(true, class182.field3431) != null) {
                        class187.field3551++;
                        class200.field3850.method1339((byte) 94, 161);
                        class200.field3850.method588((byte) 117, class48.field984.field3866);
                        class200.field3850.method603(class48.field984.field3900, true);
                        class200.field3850.method588((byte) 117, class182.field3431.field3866);
                        class200.field3850.method603(class182.field3431.field3900, true);
                    }
                } else if ((class126.field2429 == 1 || class28.method229(-1159860534, class149.field2882 - 1)) && class149.field2882 > 2) {
                    class127.method925((byte) -128);
                } else if (class149.field2882 > 0) {
                    class7.method34((byte) 116, class149.field2882 - 1);
                }
                class182.field3431 = null;
            }
        } else if (class121.field2342 > 1) {
            class182.field3431 = null;
        }
    }
}
