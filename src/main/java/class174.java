import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class174 {

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "Lp;")
    private class446 field2573;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "Lps;")
    private class395 field2567;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Luj;")
    private class440 field2571;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "[I")
    public static int[] field2564 = new int[16384];

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "[I")
    public static int[] field2572 = new int[16384];

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Lap;")
    private class289 field2574;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "[Lkc;")
    private class436[] field2577;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLan;Lan;I)Lkc;")
    public final class436 method1292(byte arg0, class377 arg1, class377 arg2, int arg3) {
        if (arg0 >= -46) {
            field2564 = null;
        }
        field2569++;
        return this.method1293(arg1, false, arg2, arg3, true);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lan;ZLan;IZ)Lkc;")
    private final class436 method1293(class377 arg0, boolean arg1, class377 arg2, int arg3, boolean arg4) {
        field2575++;
        if (this.field2574 == null) {
            throw new RuntimeException();
        }
        this.field2574.field3938 = arg3 * 8 + 5;
        if (this.field2574.field3882.length <= this.field2574.field3938) {
            throw new RuntimeException();
        } else if (this.field2577[arg3] != null) {
            return this.field2577[arg3];
        } else if (arg1) {
            return null;
        } else {
            int var6 = this.field2574.method1856((byte) 119);
            int var7 = this.field2574.method1856((byte) 81);
            class436 var8 = new class436(arg3, arg2, arg0, this.field2573, this.field2567, var6, var7, arg4);
            this.field2577[arg3] = var8;
            return var8;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
    public static void method1294(boolean arg0) {
        field2572 = null;
        if (arg0) {
            field2578 = 108;
        }
        field2564 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public final void method1295(byte arg0) {
        field2568++;
        if (this.field2577 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2577.length; var2++) {
            if (this.field2577[var2] != null) {
                this.field2577[var2].method2706(arg0 + 120);
            }
        }
        if (arg0 != -42) {
            this.method1292((byte) 101, (class377) null, (class377) null, -33);
        }
        for (int var3 = 0; var3 < this.field2577.length; var3++) {
            if (this.field2577[var3] != null) {
                this.field2577[var3].method2707(-70);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
    public final boolean method1296(int arg0) {
        field2570++;
        if (this.field2574 != null) {
            return true;
        }
        if (this.field2571 == null) {
            if (this.field2573.method2763(true)) {
                return false;
            }
            this.field2571 = this.field2573.method2764((byte) 0, true, 255, 255, (byte) -60);
        }
        if (this.field2571.field1384) {
            return false;
        }
        this.field2574 = new class289(this.field2571.method643(false));
        this.field2577 = new class436[(this.field2574.field3882.length - 5) / 8];
        if (arg0 != 8840) {
            field2564 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
    public static final void method1297(int arg0) {
        field2566++;
        class415.field5808 = 0;
        class268.field3613.method1250(10346);
        class268.field3613.method1249(class134.field1897, (byte) -113);
        if (arg0 < 36) {
            field2564 = null;
        }
        class415.field5808++;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILap;)V")
    public static final void method1298(int arg0, class289 arg1) {
        field2576++;
        if ((arg1.field3882.length - arg1.field3938) < 1) {
            return;
        }
        int var2 = arg1.method1861((byte) -72);
        if (var2 < 0 || var2 > 14) {
            return;
        }
        byte var3;
        if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg1.field3882.length - arg1.field3938)) {
            return;
        }
        class73.field1095 = arg1.method1861((byte) -72);
        if (class73.field1095 < 1) {
            class73.field1095 = 1;
        } else if (class73.field1095 > 4) {
            class73.field1095 = 4;
        }
        class95.method814(arg1.method1861((byte) -72) == 1, false);
        class173.field2554 = arg1.method1861((byte) -72) == 1;
        class162.field2401 = arg1.method1861((byte) -72) == 1;
        class416.field5823 = arg1.method1861((byte) -72) == 1;
        class275.field3703 = arg1.method1861((byte) -72) == 1 ? 1 : 0;
        class109.field1580 = arg1.method1861((byte) -72) == 1;
        class441.field6352 = arg1.method1861((byte) -72) == 1;
        class61.field952 = arg1.method1861((byte) -72) == 1;
        class179.field2633 = arg1.method1861((byte) -72);
        if (class179.field2633 > 2) {
            class179.field2633 = 2;
        }
        if (var2 >= 2) {
            class385.field5429 = arg1.method1861((byte) -72) == 1;
        } else {
            class385.field5429 = arg1.method1861((byte) -72) == 1;
            arg1.method1861((byte) -72);
        }
        class223.field3086 = arg1.method1861((byte) -72) == 1;
        class130.field1846 = arg1.method1861((byte) -72) == 1;
        class32.field527 = arg1.method1861((byte) -72);
        if (class32.field527 > 2) {
            class32.field527 = 2;
        }
        class31.field514 = class32.field527;
        class177.field2610 = arg1.method1861((byte) -72) == 1;
        class40.field626 = arg1.method1861((byte) -72);
        if (class40.field626 > 127) {
            class40.field626 = 127;
        }
        class148.field2284 = arg1.method1861((byte) -72);
        class331.field4504 = arg1.method1861((byte) -72);
        if (class331.field4504 > 127) {
            class331.field4504 = 127;
        }
        if (var2 >= 1) {
            class42.field638 = arg1.method1853(-82);
            class422.field5903 = arg1.method1853(-38);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1861((byte) -72);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1861((byte) -72);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class297.field4005 < 96) {
                var4 = 0;
            }
            class161.method1208(var4, 0);
        }
        if (var2 >= 5) {
            class264.field3557 = arg1.method1856((byte) 37);
        }
        int var5 = arg0;
        if (var2 >= 6) {
            class102.field1513 = var5 = arg1.method1861((byte) -72);
        }
        if (class102.field1513 != 1 && class102.field1513 != 2) {
            class102.field1513 = 2;
        }
        if (var2 >= 7) {
            class27.field476 = arg1.method1861((byte) -72) == 1;
        }
        if (var2 >= 8) {
            class100.field1443 = arg1.method1861((byte) -72) == 1;
        }
        if (var2 >= 9) {
            class41.field630 = arg1.method1861((byte) -72);
        }
        if (class41.field630 < 0 || class41.field630 > 3) {
            class41.field630 = 0;
        }
        if (var2 >= 10) {
            class318.field4308 = arg1.method1861((byte) -72) != 0;
        }
        if (var2 >= 11) {
            class338.field4590 = arg1.method1861((byte) -72) != 0;
        }
        if (var2 >= 12) {
            class275.field3703 = arg1.method1861((byte) -72);
        }
        if (class275.field3703 < 0 || class275.field3703 > 2) {
            class275.field3703 = 1;
        }
        if (var2 >= 13) {
            class26.field467 = arg1.method1861((byte) -72) == 1;
        }
        if (var2 >= 14) {
            class447.field6440 = arg1.method1861((byte) -72);
        } else if (var5 == 0) {
            class447.field6440 = 2;
        } else {
            class447.field6440 = 1;
        }
        if (class447.field6440 < 0 || class447.field6440 > 3) {
            class447.field6440 = 2;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lp;Lps;)V")
    public class174(class446 arg0, class395 arg1) {
        this.field2573 = arg0;
        this.field2567 = arg1;
        if (!this.field2573.method2763(true)) {
            this.field2571 = this.field2573.method2764((byte) 0, true, 255, 255, (byte) -60);
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2572[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field2564[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field2578 = 0;
        field2579 = 0;
    }
}
