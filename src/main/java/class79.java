import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class79 extends class51 {

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "Led;")
    public static class43 field1559 = class191.method1219("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", false);

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "Led;")
    public static class43 field1562 = class191.method1219("da dieser Computer gegen unsere ", false);

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "Led;")
    public static class43 field1564 = class191.method1219("Ung-Ultiges Anmelde)2Paket)3", false);

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "Led;")
    public static class43 field1566 = class191.method1219("mapscene", false);

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "I")
    private int field1565;

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ie", name = "kb", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!ie", name = "lb", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ie", name = "mb", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client!ie", name = "ob", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
    private final void method481(int arg0, int arg1) {
        this.field1565 = (arg1 & 255) << 4;
        this.field1571 = (arg1 & 65280) >> 4;
        if (arg0 == -27975) {
            this.field1560 = (arg1 & 16711680) >> 12;
            ++field1572;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([BZLf;I)V")
    public static final void method482(byte[] arg0, boolean arg1, class48 arg2, int arg3) {
        class201 var4 = new class201();
        var4.field3943 = 0;
        var4.field1353 = (long) arg3;
        var4.field3949 = arg0;
        ++field1557;
        var4.field3953 = arg2;
        class118 var5 = class112.field2145;
        synchronized (class112.field2145) {
            if (!arg1) {
                return;
            }
            class112.field2145.method756(25541, var4);
        }
        class36.method203(1);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field1569;
        if (arg2 == 0) {
            this.method481(arg1 ^ -27975, arg0.method565(3));
        }
        if (arg1 != 0) {
            this.field1565 = -31;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIIIZI)Lnb;")
    public static final class120 method483(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field1570;
        if (arg0 != -14) {
            return null;
        } else {
            long var6 = (long) arg2 - -((long) arg3 << 38) + ((long) arg1 << 40) + ((long) arg5 << 16);
            if (!arg4) {
                class120 var8 = (class120) class186.field3655.method1106(100, var6);
                if (var8 != null) {
                    return var8;
                }
            }
            class46 var9 = class2.method18(arg2, 0);
            if (arg5 > 1 && var9.field889 != null) {
                int var10 = -1;
                for (int var11 = 0; ~var11 > -11; ++var11) {
                    if (arg5 >= var9.field931[var11] && var9.field931[var11] != 0) {
                        var10 = var9.field889[var11];
                    }
                }
                if (var10 != -1) {
                    var9 = class2.method18(var10, 0);
                }
            }
            class63 var12 = var9.method288((byte) 25);
            if (var12 == null) {
                return null;
            } else {
                class120 var13 = null;
                if (var9.field906 != -1) {
                    var13 = method483((byte) -14, 0, var9.field910, 1, true, 10);
                    if (var13 == null) {
                        return null;
                    }
                }
                int[] var14 = class168.field3334;
                int var15 = class168.field3338;
                int[] var16 = new int[4];
                int var17 = class168.field3337;
                class168.method1043(var16);
                class120 var18 = new class120(36, 32);
                class168.method1047(var18.field2388, 36, 32);
                class168.method1054();
                class135.method866();
                class135.method867(16, 16);
                class135.field2805 = false;
                int var19 = var9.field923;
                if (arg4) {
                    var19 = (int) ((double) var19 * 1.5D);
                } else if (~arg3 == -3) {
                    var19 = (int) ((double) var19 * 1.04D);
                }
                int var20 = class135.field2798[var9.field943] * var19 >> 16;
                int var21 = class135.field2797[var9.field943] * var19 >> 16;
                var12.method1304();
                var12.method399(0, var9.field935, var9.field927, var9.field943, var9.field903, var9.field891 + var21 + -(var12.field1819 / 2), var9.field891 + var20);
                if (~arg3 <= -2) {
                    var18.method784(1);
                }
                if (~arg3 <= -3) {
                    var18.method784(16777215);
                }
                if (arg1 != 0) {
                    var18.method770(arg1);
                }
                class168.method1047(var18.field2388, 36, 32);
                if (~var9.field906 != 0) {
                    var13.method788(0, 0);
                }
                if (!arg4 && (var9.field924 == 1 || ~arg5 != -2) && arg5 != -1) {
                    class58.field1172.method954(class90.method587(-10000001, arg5), 0, 9, 16776960, 1);
                }
                if (!arg4) {
                    class186.field3655.method1107(var6, var18, arg0 ^ 103);
                }
                class168.method1047(var14, var15, var17);
                class168.method1052(var16);
                class135.method866();
                class135.field2805 = true;
                return var18;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZI)I")
    public static final int method484(int arg0, int arg1, boolean arg2, int arg3) {
        ++field1561;
        if (!arg2) {
            method482((byte[]) null, false, (class48) null, -121);
        }
        int var4 = arg3 & 3;
        if (~var4 == -1) {
            return arg0;
        } else if (~var4 == -2) {
            return arg1;
        } else {
            return var4 == 2 ? -arg0 + 7 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
    private class79(int arg0) {
        super(0, false);
        this.method481(-27975, arg0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        if (arg1 != -94) {
            return null;
        } else {
            ++field1558;
            int[][] var3 = super.field1027.method1087(arg0, -2);
            if (super.field1027.field3428) {
                int[] var4 = var3[0];
                int[] var5 = var3[2];
                int[] var6 = var3[1];
                for (int var7 = 0; ~class122.field2442 < ~var7; ++var7) {
                    var4[var7] = this.field1560;
                    var6[var7] = this.field1571;
                    var5[var7] = this.field1565;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
    public static void method485(byte arg0) {
        int var1 = 87 % ((3 - arg0) / 63);
        field1564 = null;
        field1566 = null;
        field1559 = null;
        field1562 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
    public static final void method486(boolean arg0, int arg1) {
        if (class67.field1348.field2347 >> 7 == class124.field2457 && ~(class67.field1348.field2328 >> 7) == ~class35.field631) {
            class124.field2457 = 0;
        }
        ++field1563;
        int var2 = class170.field3399;
        if (arg0) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg1 == 267) {
            while (~var2 < ~var3) {
                int var4;
                class1 var5;
                if (arg0) {
                    var4 = 33538048;
                    var5 = class67.field1348;
                } else {
                    var5 = class12.field183[class125.field2472[var3]];
                    var4 = class125.field2472[var3] << 14;
                }
                if (var5 != null && var5.method4(121)) {
                    var5.field2 = false;
                    if ((class9.field163 && class170.field3399 > 50 || class170.field3399 > 200) && !arg0 && ~var5.field2344 == ~var5.field2326) {
                        var5.field2 = true;
                    }
                    int var6 = var5.field2347 >> 7;
                    int var7 = var5.field2328 >> 7;
                    if (var6 >= 0 && var6 < 104 && ~var7 <= -1 && var7 < 104) {
                        if (var5.field6 != null && var5.field7 <= client.field559 && ~client.field559 > ~var5.field3) {
                            var5.field2 = false;
                            var5.field2338 = class108.method668(var5.field2328, var5.field2347, -128, class93.field1839);
                            class137.field2842.method1144(class93.field1839, var5.field2347, var5.field2328, var5.field2338, 60, var5, var5.field2352, var4, var5.field27, var5.field22, var5.field19, var5.field12);
                        } else {
                            label94: {
                                if (~(127 & var5.field2347) == -65 && (var5.field2328 & 127) == 64) {
                                    if (~class59.field1220[var6][var7] == ~class115.field2256) {
                                        break label94;
                                    }
                                    class59.field1220[var6][var7] = class115.field2256;
                                }
                                var5.field2338 = class108.method668(var5.field2328, var5.field2347, -127, class93.field1839);
                                class137.field2842.method1154(class93.field1839, var5.field2347, var5.field2328, var5.field2338, 60, var5, var5.field2352, var4, var5.field2356);
                            }
                        }
                    }
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class79() {
        this(0);
    }
}
