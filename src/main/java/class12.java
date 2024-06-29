import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class12 extends class34 {

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    public static int field172 = 0;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    public static int field170 = 0;

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field180 = "Face here";

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    public static int field173 = 0;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "Ldb;")
    public static class39 field175 = new class39(16);

    @OriginalMember(owner = "client!mi", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field185 = "green:";

    @OriginalMember(owner = "client!mi", name = "eb", descriptor = "Z")
    public static boolean field184 = false;

    @OriginalMember(owner = "client!mi", name = "db", descriptor = "Lhl;")
    public static class139 field183 = new class139(2);

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)I")
    public static final int method83(int arg0) {
        ++field181;
        if (arg0 != 2) {
            field185 = null;
        }
        return class159.field2317.method949(0);
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field178;
        int[] var3 = super.field610.method228(24856, arg1);
        if (arg0 < 75) {
            field185 = null;
        }
        if (super.field610.field597) {
            int var4 = class199.field2985[arg1];
            for (int var5 = 0; ~var5 > ~class226.field3527; ++var5) {
                var3[var5] = this.method85(var4, -17660, class112.field1716[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
    public static final void method84(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class105 var5 = class9.method72(arg3, -1, arg1);
        ++field169;
        var5.method763(false);
        var5.field1540 = arg2;
        var5.field1545 = arg4;
        var5.field1553 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)I")
    private final int method85(int arg0, int arg1, int arg2) {
        ++field176;
        if (arg1 != -17660) {
            field177 = 6;
        }
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 ^ var4 << 1;
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V")
    public static void method86(int arg0) {
        if (arg0 <= 90) {
            method87(true, -92, 100, 50, -38, false, 17, 52);
        }
        field180 = null;
        field185 = null;
        field183 = null;
        field175 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class12() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZIIIIZII)V")
    public static final void method87(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        ++field174;
        if (arg1 != 789221) {
            field170 = -73;
        }
        if (arg5 || class121.field1806 != arg6 || ~class16.field297 != ~arg3 || ~class51.field832 != ~arg2 && !class101.method741(-6425)) {
            class51.field832 = arg2;
            class121.field1806 = arg6;
            class16.field297 = arg3;
            if (class101.method741(-6425)) {
                class51.field832 = 0;
            }
            if (arg0) {
                class88.method668(true, 28);
            } else {
                class88.method668(true, 25);
            }
            class226.method1550(true, false, class295.field4491);
            int var8 = class90.field1367;
            int var9 = class188.field2774;
            class90.field1367 = (arg6 + -6) * 8;
            class188.field2774 = arg3 * 8 + -48;
            class66.field1092 = class196.method1321(class16.field297 * 8, -501, class121.field1806 * 8);
            class21.field358 = null;
            int var10 = -var8 + class90.field1367;
            int var11 = class90.field1367;
            int var12 = class188.field2774 - var9;
            int var13 = class188.field2774;
            if (arg0) {
                class207.field3093 = 0;
                for (int var14 = 0; ~var14 > -32769; ++var14) {
                    class87 var15 = class243.field3762[var14];
                    if (var15 != null) {
                        var15.field455 -= var12 * 128;
                        var15.field425 -= var10 * 128;
                        if (var15.field425 >= 0 && var15.field425 <= 13184 && var15.field455 >= 0 && var15.field455 <= 13184) {
                            for (int var16 = 0; var16 < 10; ++var16) {
                                var15.field449[var16] -= var10;
                                var15.field493[var16] -= var12;
                            }
                            class285.field4379[class207.field3093++] = var14;
                        } else {
                            class243.field3762[var14].method665((class189) null, (byte) -84);
                            class243.field3762[var14] = null;
                        }
                    }
                }
            } else {
                for (int var17 = 0; ~var17 > -32769; ++var17) {
                    class87 var33 = class243.field3762[var17];
                    if (var33 != null) {
                        for (int var34 = 0; ~var34 > -11; ++var34) {
                            var33.field449[var34] -= var10;
                            var33.field493[var34] -= var12;
                        }
                        var33.field425 -= var10 * 128;
                        var33.field455 -= var12 * 128;
                    }
                }
            }
            for (int var18 = 0; ~var18 > -2049; ++var18) {
                class224 var31 = class166.field2438[var18];
                if (var31 != null) {
                    for (int var32 = 0; var32 < 10; ++var32) {
                        var31.field449[var32] -= var10;
                        var31.field493[var32] -= var12;
                    }
                    var31.field425 -= var10 * 128;
                    var31.field455 -= var12 * 128;
                }
            }
            class260.field3986 = arg2;
            class185.field2687.method1528(false, arg4, arg7, 79);
            byte var19 = 1;
            byte var20 = 0;
            byte var21 = 104;
            if (var10 < 0) {
                var21 = -1;
                var19 = -1;
                var20 = 103;
            }
            byte var22 = 0;
            byte var23 = 104;
            byte var24 = 1;
            if (~var12 > -1) {
                var24 = -1;
                var22 = 103;
                var23 = -1;
            }
            for (int var25 = var20; ~var21 != ~var25; var25 += var19) {
                for (int var27 = var22; var23 != var27; var27 += var24) {
                    int var28 = var12 + var27;
                    int var29 = var10 + var25;
                    for (int var30 = 0; var30 < 4; ++var30) {
                        if (~var29 <= -1 && var28 >= 0 && var29 < 104 && ~var28 > -105) {
                            class235.field3614[var30][var25][var27] = class235.field3614[var30][var29][var28];
                        } else {
                            class235.field3614[var30][var25][var27] = null;
                        }
                    }
                }
            }
            for (class184 var26 = (class184) class269.field4183.method1894((byte) -90); var26 != null; var26 = (class184) class269.field4183.method1886(-95)) {
                var26.field2674 -= var10;
                var26.field2669 -= var12;
                if (var26.field2674 < 0 || ~var26.field2669 > -1 || ~var26.field2674 <= -105 || ~var26.field2669 <= -105) {
                    var26.method1193(119);
                }
            }
            class213.field3283 = -1;
            if (~class111.field1693 != -1) {
                class97.field1427 -= var12;
                class111.field1693 -= var10;
            }
            class284.field4353 = 0;
            if (!arg0) {
                class133.field1954 = 1;
            } else {
                class178.field2607 -= var12;
                class210.field3135 -= var10;
                class90.field1377 -= var10 * 128;
                class139.field2006 -= var12;
                class209.field3127 -= var12 * 128;
                class44.field776 -= var10;
            }
            class73.field1187.method1891(116);
            class21.field349.method1891(arg1 + -789142);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lpk;BI)Lji;")
    public static final class256 method88(class237 arg0, byte arg1, int arg2) {
        if (arg1 != -112) {
            return null;
        } else {
            ++field182;
            return !class125.method878(arg2, arg0, -1) ? null : class90.method683(0);
        }
    }
}
