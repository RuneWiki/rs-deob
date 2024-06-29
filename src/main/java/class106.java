import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class106 extends class215 {

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field1419 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field1423 = -1;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    public static int field1421 = 0;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field1422 = 0;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "[Laa;")
    private class186[] field1426;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "[Lpi;")
    public static class191[] field1420;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLeh;II)Lwj;")
    public static final class149 method640(boolean arg0, class137 arg1, int arg2, int arg3) {
        ++field1432;
        if (arg0) {
            field1429 = 55;
        }
        return !class111.method714(arg3, arg2, arg1, 55) ? null : class129.method878(25860);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        ++field1428;
        if (arg0 != -1) {
            method644(-81);
        }
        int[][] var3 = super.field3461.method1126(1, arg1);
        if (super.field3461.field2591) {
            int var4 = class244.field4015;
            int var5 = class80.field998;
            int[][][] var6 = super.field3461.method1127(arg0 ^ 97);
            int[][] var7 = new int[var5][var4];
            this.method643(arg0 ^ 103, var7);
            for (int var8 = 0; ~var8 > ~class80.field998; ++var8) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class244.field4015 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class173.method1186(4080, var15 << 4);
                    var12[var14] = class173.method1186(4080, var15 >> 4);
                    var11[var14] = class173.method1186(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public static final void method641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1424;
        if (arg0 <= 75) {
            field1422 = 21;
        }
        int var6 = class256.method1750(79, arg3, class117.field1656, class132.field2105);
        int var7 = class256.method1750(78, arg2, class117.field1656, class132.field2105);
        int var8 = class256.method1750(59, arg4, class116.field1653, class114.field1634);
        int var9 = class256.method1750(109, arg5, class116.field1653, class114.field1634);
        for (int var10 = var6; ~var10 >= ~var7; ++var10) {
            class78.method433(var9, var8, class14.field186[var10], arg1, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static void method642(boolean arg0) {
        field1420 = null;
        if (!arg0) {
            field1419 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[[I)V")
    private final void method643(int arg0, int[][] arg1) {
        ++field1427;
        if (arg0 == -104) {
            int var3 = class244.field4015;
            int var4 = class80.field998;
            class164.method1137(arg1, arg0 ^ 1282956916);
            class110.method713(0, 0, class83.field1026, 0, class118.field1673);
            if (this.field1426 != null) {
                for (int var5 = 0; ~var5 > ~this.field1426.length; ++var5) {
                    class186 var6 = this.field1426[var5];
                    int var7 = var6.field2966;
                    int var8 = var6.field2970;
                    if (~var7 > -1) {
                        if (var8 >= 0) {
                            var6.method292(-6, var4, var3);
                        }
                    } else if (~var8 > -1) {
                        var6.method291((byte) -81, var4, var3);
                    } else {
                        var6.method293(var3, var4, (byte) 125);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public static final void method644(int arg0) {
        class206.field3306 = arg0;
        class34.field437 = 0;
        class152.field2363 = -1;
        class262.field4250 = false;
        class285.field4530 = -1;
        class160.field2557 = 0;
        class200.field3167 = -1;
        class219.field3508 = 0;
        ++field1433;
        class292.field4641 = 0;
        class233.field3856 = 0;
        class4.field57.field1228 = 0;
        class96.field1283.field1228 = 0;
        class211.field3399 = 0;
        for (int var1 = 0; ~class89.field1113.length < ~var1; ++var1) {
            if (class89.field1113[var1] != null) {
                class89.field1113[var1].field3812 = -1;
            }
        }
        for (int var2 = 0; var2 < class265.field4273.length; ++var2) {
            if (class265.field4273[var2] != null) {
                class265.field4273[var2].field3812 = -1;
            }
        }
        class216.method1514(true);
        class283.field4513 = 1;
        class2.method13(false, 30);
        for (int var3 = 0; ~var3 > -101; ++var3) {
            class21.field279[var3] = true;
        }
        class66.method380(26365);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg0 == 1521146348) {
            if (~arg1 != -1) {
                if (~arg1 == -2) {
                    super.field3453 = ~arg2.method584(255) == -2;
                }
            } else {
                this.field1426 = new class186[arg2.method584(255)];
                for (int var4 = 0; ~this.field1426.length < ~var4; ++var4) {
                    int var5 = arg2.method584(arg0 ^ 1521146131);
                    if (var5 != 0) {
                        if (~var5 != -2) {
                            if (~var5 != -3) {
                                if (var5 == 3) {
                                    this.field1426[var4] = class16.method82((byte) 88, arg2);
                                }
                            } else {
                                this.field1426[var4] = class95.method528(arg0 + -1521146266, arg2);
                            }
                        } else {
                            this.field1426[var4] = class118.method765(false, arg2);
                        }
                    } else {
                        this.field1426[var4] = class209.method1473(arg2, false);
                    }
                }
            }
            ++field1431;
        }
    }

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "(I)V")
    public static final void method645(int arg0) {
        ++field1418;
        class294.field4663.method1701((byte) 107);
        if (arg0 > -77) {
            field1421 = 0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class106() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field1434;
        if (arg1 != 255) {
            return null;
        } else {
            int[] var3 = super.field3445.method1755(arg0, (byte) 107);
            if (super.field3445.field4163) {
                this.method643(-104, super.field3445.method1752((byte) -125));
            }
            return var3;
        }
    }
}
