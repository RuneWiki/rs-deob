import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("oa")
public class class131 extends class85 {

    @OriginalMember(owner = "oa", name = "W", descriptor = "Z")
    private boolean field2529 = true;

    @OriginalMember(owner = "oa", name = "gb", descriptor = "Z")
    private boolean field2539 = true;

    @OriginalMember(owner = "oa", name = "R", descriptor = "I")
    public static int field2524 = -1;

    @OriginalMember(owner = "oa", name = "V", descriptor = "Z")
    public static boolean field2528 = false;

    @OriginalMember(owner = "oa", name = "bb", descriptor = "Llf;")
    public static class109 field2534 = class35.method275("Lade Konfiguration )2 ", 2);

    @OriginalMember(owner = "oa", name = "db", descriptor = "Llf;")
    private static class109 field2536 = class35.method275("Loaded update list", 2);

    @OriginalMember(owner = "oa", name = "X", descriptor = "Llf;")
    public static class109 field2530 = field2536;

    @OriginalMember(owner = "oa", name = "U", descriptor = "I")
    public static int field2527 = 0;

    @OriginalMember(owner = "oa", name = "Y", descriptor = "I")
    public static int field2531 = 7759444;

    @OriginalMember(owner = "oa", name = "Q", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "oa", name = "T", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "oa", name = "Z", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "oa", name = "ab", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "oa", name = "cb", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "oa", name = "eb", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "oa", name = "fb", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "oa", name = "hb", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "oa", name = "S", descriptor = "[I")
    public static int[] field2525;

    @OriginalMember(owner = "oa", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        if (arg0 > -49) {
            method941((byte) 119);
        }
        int[] var3 = super.field1736.method835(-314, arg1);
        ++field2537;
        if (super.field1736.field2253) {
            int[] var4 = this.method540(!this.field2529 ? arg1 : -arg1 + class150.field2892, 55, 0);
            if (!this.field2539) {
                class122.method879(var4, 0, var3, 0, class57.field1152);
            } else {
                for (int var5 = 0; ~var5 > ~class57.field1152; ++var5) {
                    var3[var5] = var4[class29.field624 - var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "oa", name = "<init>", descriptor = "()V")
    public class131() {
        super(1, false);
    }

    @OriginalMember(owner = "oa", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        if (arg1 != 2177) {
            return null;
        } else {
            ++field2533;
            int[][] var3 = super.field1719.method673((byte) -127, arg0);
            if (super.field1719.field1926) {
                int[][] var4 = this.method544(false, !this.field2529 ? arg0 : -arg0 + class150.field2892, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (this.field2539) {
                    for (int var11 = 0; class57.field1152 > var11; ++var11) {
                        var8[var11] = var5[-var11 + class29.field624];
                        var9[var11] = var6[-var11 + class29.field624];
                        var10[var11] = var7[class29.field624 - var11];
                    }
                } else {
                    for (int var12 = 0; ~class57.field1152 < ~var12; ++var12) {
                        var8[var12] = var5[var12];
                        var9[var12] = var6[var12];
                        var10[var12] = var7[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "oa", name = "d", descriptor = "(B)V")
    public static void method941(byte arg0) {
        field2536 = null;
        field2525 = null;
        field2534 = null;
        field2530 = null;
        int var1 = 31 % ((-62 - arg0) / 34);
    }

    @OriginalMember(owner = "oa", name = "a", descriptor = "(IILlf;)V")
    public static final void method942(int arg0, int arg1, class109 arg2) {
        ++field2526;
        class109 var3 = arg2.method797(true).method810(true);
        boolean var4 = false;
        int var5 = -107 / ((50 - arg0) / 43);
        for (int var6 = 0; var6 < class157.field2956; ++var6) {
            class184 var7 = class202.field3975[class125.field2405[var6]];
            if (var7 != null && var7.field3455 != null && var7.field3455.method778((byte) -121, var3)) {
                var4 = true;
                class55.method358(0, 1, 1, var7.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var7.field3567[0], 0, 0);
                if (~arg1 != -2) {
                    if (~arg1 != -5) {
                        if (~arg1 == -7) {
                            class200.field3850.method1339((byte) 95, 8);
                            ++class67.field1296;
                            class200.field3850.method600(class125.field2405[var6], 128);
                        } else if (arg1 == 7) {
                            ++class199.field3803;
                            class200.field3850.method1339((byte) 107, 222);
                            class200.field3850.method557(9698, class125.field2405[var6]);
                        }
                    } else {
                        class200.field3850.method1339((byte) 104, 12);
                        ++class209.field4071;
                        class200.field3850.method574(1174839336, class125.field2405[var6]);
                    }
                } else {
                    class200.field3850.method1339((byte) 111, 121);
                    ++class49.field1004;
                    class200.field3850.method603(class125.field2405[var6], true);
                }
                break;
            }
        }
        if (!var4) {
            class98.method690(class174.field3306, false, class36.method279(new class109[] { class134.field2568, var3 }, -46), 0);
        }
    }

    @OriginalMember(owner = "oa", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field1726 = ~arg2.method598((byte) 122) == -2;
                }
            } else {
                this.field2529 = arg2.method598((byte) 87) == 1;
            }
        } else {
            this.field2539 = arg2.method598((byte) 107) == 1;
        }
        if (arg0 > -120) {
            method941((byte) 2);
        }
        ++field2523;
    }
}
