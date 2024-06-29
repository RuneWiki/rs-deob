import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class89 extends class151 {

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    private final int field1377;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    private final int field1380;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    private final int field1385;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    private final int field1386;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field1384 = 0;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "Lqe;")
    public static class168 field1392 = class66.method448("<img=1>", 48);

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "Lqe;")
    private static class168 field1391 = class66.method448("white:", 37);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Lqe;")
    public static class168 field1378 = field1391;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "Lqe;")
    public static class168 field1390 = field1391;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "[I")
    public static int[] field1383;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "[[[B")
    public static byte[][][] field1394;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
    public final void method424(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field1384 = -99;
        }
        ++field1396;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lfk;")
    public static final class29 method588(int arg0, int arg1) {
        ++field1388;
        class29 var2 = (class29) class240.field4104.method1499(arg1 ^ arg1, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class103.field1664.method1712(arg0, 11, -1);
            class29 var4 = new class29();
            if (var3 != null) {
                var4.method195(new class112(var3), (byte) -99);
            }
            class240.field4104.method1502((byte) -18, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IBI)V")
    public final void method422(int arg0, byte arg1, int arg2) {
        int var4 = 66 % ((79 - arg1) / 38);
        ++field1387;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method589(byte arg0) {
        field1391 = null;
        field1392 = null;
        field1390 = null;
        field1394 = null;
        if (arg0 != 51) {
            field1391 = null;
        }
        field1383 = null;
        field1378 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpc;Loe;ILoe;Loe;)Z")
    public static final boolean method590(class202 arg0, class256 arg1, int arg2, class256 arg3, class256 arg4) {
        ++field1381;
        if (arg2 >= -103) {
            field1392 = null;
        }
        class172.field2992 = arg3;
        class114.field1866 = arg0;
        class190.field3314 = arg4;
        class190.field3305 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(ILoe;B)[Lqg;")
    public static final class217[] method591(int arg0, class256 arg1, byte arg2) {
        int var3 = -116 % ((53 - arg2) / 32);
        ++field1382;
        return !class105.method697(false, arg0, arg1) ? null : class149.method995(6410);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIII)V")
    public class89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1377 = arg0;
        this.field1380 = arg1;
        this.field1385 = arg2;
        this.field1386 = arg3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBI)V")
    public final void method426(int arg0, byte arg1, int arg2) {
        ++field1379;
        int var4 = this.field1377 * arg0 >> 12;
        if (arg1 == -110) {
            int var5 = this.field1385 * arg0 >> 12;
            int var6 = this.field1380 * arg2 >> 12;
            int var7 = this.field1386 * arg2 >> 12;
            class78.method525(var7, super.field2627, arg1 ^ -110, var4, var6, var5);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZLhh;I)V")
    public static final void method592(int arg0, int arg1, boolean arg2, class121 arg3, int arg4) {
        ++field1393;
        if (class7.field85 != arg3) {
            if (~class109.field1748 > -401) {
                class168 var5;
                if (~arg3.field1989 == -1) {
                    var5 = class50.method347(2, new class168[] { arg3.field2000, class26.method174(arg3.field1993, 78, class7.field85.field1993), class167.field2847, class254.field4402, class128.method867((byte) 126, arg3.field1993), class44.field577 });
                } else {
                    var5 = class50.method347(2, new class168[] { arg3.field2000, class167.field2847, class151.field2628, class128.method867((byte) 123, arg3.field1989), class44.field577 });
                }
                if (class190.field3311 != 1) {
                    if (!class84.field1277) {
                        for (int var6 = 7; ~var6 <= -1; --var6) {
                            if (class97.field1530[var6] != null) {
                                ++class81.field1222;
                                short var7 = 0;
                                if (class30.field367 == 0 && class97.field1530[var6].method1106(-115, class238.field4078)) {
                                    if (~arg3.field1993 < ~class7.field85.field1993) {
                                        var7 = 2000;
                                    }
                                    if (~class7.field85.field1978 != -1 && arg3.field1978 != 0) {
                                        if (~class7.field85.field1978 != ~arg3.field1978) {
                                            var7 = 0;
                                        } else {
                                            var7 = 2000;
                                        }
                                    }
                                } else if (class189.field3301[var6]) {
                                    var7 = 2000;
                                }
                                boolean var8 = false;
                                short var9 = class154.field2673[var6];
                                short var10 = (short) (var7 + var9);
                                class94.method624(arg0, (long) arg1, var10, arg4, class50.method347(2, new class168[] { class143.field2514, var5 }), class97.field1530[var6], (byte) 125);
                            }
                        }
                    } else if ((8 & class172.field2985) == 8) {
                        ++class119.field1943;
                        class94.method624(arg0, (long) arg1, (short) 32, arg4, class50.method347(2, new class168[] { class128.field2118, class212.field3661, var5 }), class19.field236, (byte) 114);
                    }
                } else {
                    ++class31.field374;
                    class94.method624(arg0, (long) arg1, (short) 5, arg4, class50.method347(2, new class168[] { class117.field1911, class212.field3661, var5 }), class90.field1398, (byte) 112);
                }
                int var11 = 0;
                if (arg2) {
                    while (class109.field1748 > var11) {
                        if (class51.field701[var11] == 51) {
                            class125.field2052[var11] = class50.method347(2, new class168[] { class143.field2514, var5 });
                            return;
                        }
                        ++var11;
                    }
                }
            }
        }
    }
}
