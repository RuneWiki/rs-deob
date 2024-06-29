import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class209 extends class197 {

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    private final int field3917;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    private final int field3924;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    private final int field3932;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    private final int field3927;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    private final int field3930;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    private final int field3921;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    private final int field3916;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    private final int field3913;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Ldc;")
    public static class37 field3918 = class185.method1233((byte) 86, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field3925 = 0;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field3923 = 0;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Ldc;")
    private static class37 field3922 = class185.method1233((byte) 86, "New User");

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Ldc;")
    public static class37 field3915 = field3922;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "[S")
    public static short[] field3933 = new short[256];

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "[I")
    public static int[] field3910;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lwa;B)V")
    public static final void method1387(class238 arg0, byte arg1) {
        int var2 = -122 % ((7 - arg1) / 54);
        ++field3931;
        class224.field4154 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V")
    public final void method714(int arg0, int arg1, int arg2) {
        ++field3928;
        if (arg2 > -101) {
            field3925 = 113;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)I")
    public static final int method1388(int arg0, byte arg1) {
        if (arg1 != -99) {
            field3915 = null;
        }
        ++field3911;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lwa;ZII)Lqh;")
    public static final class182 method1389(class238 arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            method1388(104, (byte) -54);
        }
        ++field3912;
        return !class192.method1278(arg0, 0, arg2, arg3) ? null : class191.method1273(-86);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Z")
    public static final boolean method1390(byte arg0, int arg1) {
        int var2 = 16 / ((arg0 - 61) / 42);
        ++field3929;
        if (~arg1 > -1) {
            return false;
        } else {
            int var3 = class171.field3281[arg1];
            if (~var3 <= -2001) {
                var3 -= 2000;
            }
            return var3 == 1002;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3917 = arg1;
        this.field3924 = arg6;
        this.field3932 = arg3;
        this.field3927 = arg2;
        this.field3930 = arg0;
        this.field3921 = arg4;
        this.field3916 = arg5;
        this.field3913 = arg7;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static final void method1391(int arg0) {
        if (arg0 != 7566) {
            method1390((byte) 113, -13);
        }
        class11.method70(56, false);
        ++field3909;
        class92.field1588 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class118.field2117.length; ++var2) {
            if (~class151.field2862[var2] != 0 && class118.field2117[var2] == null) {
                class118.field2117[var2] = class185.field3416.method1547(0, arg0 + -7566, class151.field2862[var2]);
                if (class118.field2117[var2] == null) {
                    var1 = false;
                    ++class92.field1588;
                }
            }
            if (class199.field3708[var2] != -1 && class50.field1003[var2] == null) {
                class50.field1003[var2] = class185.field3416.method1549(class199.field3708[var2], -119, 0, class19.field315[var2]);
                if (class50.field1003[var2] == null) {
                    var1 = false;
                    ++class92.field1588;
                }
            }
        }
        if (!var1) {
            class157.field2986 = 1;
        } else {
            boolean var3 = true;
            class61.field1123 = 0;
            for (int var4 = 0; class118.field2117.length > var4; ++var4) {
                byte[] var19 = class50.field1003[var4];
                if (var19 != null) {
                    int var20 = (255 & class142.field2745[var4]) * 64 + -class124.field2212;
                    int var21 = (class142.field2745[var4] >> 8) * 64 + -class99.field1735;
                    if (class231.field4225) {
                        var21 = 10;
                        var20 = 10;
                    }
                    var3 &= class8.method56(var20, var19, var21, (byte) 24);
                }
            }
            if (!var3) {
                class157.field2986 = 2;
            } else {
                if (class157.field2986 != 0) {
                    class192.method1279(class80.method548(new class37[] { class136.field2649, class195.field3653 }, -61), true, false);
                }
                class108.method707((byte) 51);
                class112.method769(74);
                class6.method45();
                for (int var5 = 0; ~var5 > -5; ++var5) {
                    class11.field143[var5].method1096(94);
                }
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    for (int var17 = 0; ~var17 > -105; ++var17) {
                        for (int var18 = 0; ~var18 > -105; ++var18) {
                            class193.field3602[var6][var17][var18] = 0;
                        }
                    }
                }
                class95.method635(arg0 ^ -13893);
                class108.method707((byte) 71);
                System.gc();
                class108.method707((byte) -91);
                class11.method70(56, true);
                class97.method651(arg0 + 1848034130, false);
                if (!class231.field4225) {
                    class108.method706((byte) 126, false);
                    class11.method70(56, true);
                    class171.method1162(21601, false);
                }
                if (class231.field4225) {
                    class131.method915(112, false);
                    class11.method70(56, true);
                    class229.method1484(false, (byte) 123);
                }
                class112.method769(115);
                class11.method70(56, true);
                class108.method707((byte) -101);
                class170.method1149(class11.field143, arg0 ^ -366, false);
                class11.method70(arg0 + -7510, true);
                class108.method707((byte) 103);
                int var7 = class65.field1172;
                if (~class125.field2246 > ~var7) {
                    var7 = class125.field2246;
                }
                if (~var7 > ~(class125.field2246 + -1)) {
                    int var8 = class125.field2246 + -1;
                }
                if (class16.field259) {
                    class225.method1476(class65.field1172);
                } else {
                    class225.method1476(0);
                }
                class237.method1534(arg0 + -7683);
                for (int var9 = 0; var9 < 104; ++var9) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        class101.method666(var9, var16, (byte) 118);
                    }
                }
                class108.method707((byte) -93);
                class150.method1028(-1);
                class112.method769(118);
                if (class131.field2451 != null) {
                    class49.field970.method1503(7, arg0 + -4590);
                    ++class245.field4487;
                    class49.field970.method183(1057001181, arg0 ^ -1137901162);
                }
                if (!class231.field4225) {
                    int var10 = (class151.field2859 + -6) / 8;
                    int var11 = (class151.field2859 + 6) / 8;
                    int var12 = (class136.field2648 + -6) / 8;
                    int var13 = (class136.field2648 + 6) / 8;
                    for (int var14 = var10 - 1; var14 <= var11 + 1; ++var14) {
                        for (int var15 = var12 + -1; ~var15 >= ~(var13 + 1); ++var15) {
                            if (~var10 < ~var14 || var11 < var14 || ~var12 < ~var15 || ~var15 < ~var13) {
                                class185.field3416.method1539(-1, class80.method548(new class37[] { client.field669, class151.method1034((byte) -9, var14), class66.field1186, class151.method1034((byte) -9, var15) }, -120));
                                class185.field3416.method1539(-1, class80.method548(new class37[] { class96.field1689, class151.method1034((byte) -9, var14), class66.field1186, class151.method1034((byte) -9, var15) }, -15));
                            }
                        }
                    }
                }
                class236.method1525(30, arg0 ^ 30634);
                class108.method707((byte) 100);
                class49.field970.method1503(70, 2976);
                class30.method250((byte) -86);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
    public static final void method1392(int arg0, boolean arg1) {
        ++field3914;
        if (arg1) {
            method1392(-80, true);
        }
        if (class39.method352(-10924, arg0)) {
            class63.method473(class177.field3344[arg0], -1, -22561);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
    public final void method715(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            this.method714(-124, -126, 109);
        }
        ++field3920;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method1393(byte arg0) {
        if (arg0 != 65) {
            method1392(-103, true);
        }
        field3922 = null;
        field3933 = null;
        field3915 = null;
        field3918 = null;
        field3910 = null;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(III)V")
    public final void method713(int arg0, int arg1, int arg2) {
        if (arg1 < 31) {
            method1391(-76);
        }
        int var4 = this.field3930 * arg0 >> 12;
        int var5 = this.field3917 * arg2 >> 12;
        ++field3926;
        int var6 = this.field3927 * arg0 >> 12;
        int var7 = this.field3932 * arg2 >> 12;
        int var8 = this.field3921 * arg0 >> 12;
        int var9 = this.field3916 * arg2 >> 12;
        int var10 = this.field3913 * arg2 >> 12;
        int var11 = this.field3924 * arg0 >> 12;
        class122.method833(var7, var9, var10, -2, super.field3681, var4, var11, var5, var6, var8);
    }
}
