import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class119 extends class237 {

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    private final int field2236;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    private final int field2258;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    private final int field2248;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    private final int field2241;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    private final int field2249;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    private final int field2245;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    private final int field2238;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    private final int field2244;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "Lkh;")
    public static class117 field2253 = class224.method1450((byte) -100, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "Lkh;")
    public static class117 field2256 = class224.method1450((byte) 116, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field2243 = 0;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "Lkh;")
    public static class117 field2262 = class224.method1450((byte) 120, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Lkh;")
    public static class117 field2246 = class224.method1450((byte) 115, "Benutzen");

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "Ldb;")
    public static class36 field2257 = new class36();

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "Lkh;")
    public static class117 field2263 = class224.method1450((byte) 111, "gr-Un:");

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIBI)V")
    public static final void method832(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class146.field2678 = arg0;
        if (arg3 != -56) {
            field2253 = null;
        }
        class240.field4355 = arg1;
        class224.field4040 = arg2;
        class159.field2910 = arg4;
        ++field2255;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)I")
    public static final int method833(int arg0, int arg1) {
        if (arg1 != -31184) {
            field2257 = null;
        }
        ++field2239;
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)Z")
    public static final boolean method834(int arg0) {
        ++field2242;
        if (arg0 > -108) {
            method840((byte) 103, (class117) null, (class9) null);
        }
        class82 var1 = class94.field1719;
        synchronized (class94.field1719) {
            if (class90.field1665 == class159.field2913) {
                return false;
            } else {
                class223.field4024 = class38.field879[class159.field2913];
                class143.field2590 = class200.field3622[class159.field2913];
                class159.field2913 = 127 & class159.field2913 - -1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method835(byte arg0) {
        field2253 = null;
        field2256 = null;
        field2262 = null;
        field2257 = null;
        field2263 = null;
        field2246 = null;
        if (arg0 <= 73) {
            field2263 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIZIIBLvb;)V")
    public static final void method836(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, class232 arg6) {
        if (arg3 != -1334633144) {
            method842(-107, 84, -84, 3, 116, 3);
        }
        long var7 = (long) ((arg4 << 16) + arg1);
        class166 var9 = (class166) class94.field1731.method460(var7, 1);
        ++field2251;
        if (var9 == null) {
            class166 var10 = (class166) class228.field4108.method460(var7, arg3 + 1334633145);
            if (var10 == null) {
                class166 var11 = (class166) class27.field669.method460(var7, 1);
                if (var11 != null) {
                    if (arg2) {
                        var11.method1254(false);
                        class94.field1731.method461(var7, (byte) -58, var11);
                        ++class45.field968;
                        --class34.field799;
                    }
                } else {
                    if (!arg2) {
                        class166 var12 = (class166) class71.field1364.method460(var7, 1);
                        if (var12 != null) {
                            return;
                        }
                    }
                    class166 var13 = new class166();
                    var13.field3001 = arg6;
                    var13.field3004 = arg0;
                    var13.field2993 = arg5;
                    if (arg2) {
                        class94.field1731.method461(var7, (byte) -67, var13);
                        ++class45.field968;
                    } else {
                        class36.field825.method707(31164, var13);
                        class27.field669.method461(var7, (byte) -58, var13);
                        ++class34.field799;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)Lah;")
    public static final class9 method837(byte arg0, int arg1) {
        ++field2247;
        int var2 = arg1 >> 16;
        if (arg0 <= 82) {
            return null;
        } else {
            int var3 = 65535 & arg1;
            if (class90.field1675[var2] == null || class90.field1675[var2][var3] == null) {
                boolean var4 = class223.method1446(var2, 6);
                if (!var4) {
                    return null;
                }
            }
            return class90.field1675[var2][var3];
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)I")
    public static final int method838(int arg0, byte arg1) {
        ++field2235;
        if (arg1 != 41) {
            field2253 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BII)V")
    public final void method596(byte arg0, int arg1, int arg2) {
        int var4 = -78 / ((arg0 - 39) / 59);
        ++field2237;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
    public static final void method839(byte arg0) {
        ++field2260;
        class177.field3192.method503(10);
        class67.field1281.method410((byte) 71);
        if (arg0 != -115) {
            field2263 = null;
        }
        class159.field2889.method503(10);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLkh;Lah;)Lkh;")
    public static final class117 method840(byte arg0, class117 arg1, class9 arg2) {
        ++field2240;
        int var3 = 57 / ((11 - arg0) / 50);
        if (arg1.method799(class40.field913, 0) != -1) {
            while (true) {
                int var4 = arg1.method799(class214.field3888, 0);
                if (~var4 == 0) {
                    while (true) {
                        int var5 = arg1.method799(class139.field2538, 0);
                        if (var5 == -1) {
                            while (true) {
                                int var6 = arg1.method799(class103.field1869, 0);
                                if (var6 == -1) {
                                    while (true) {
                                        int var7 = arg1.method799(class94.field1734, 0);
                                        if (~var7 == 0) {
                                            while (true) {
                                                int var8 = arg1.method799(class71.field1363, 0);
                                                if (var8 == -1) {
                                                    while (true) {
                                                        int var9 = arg1.method799(class165.field2989, 0);
                                                        if (~var9 == 0) {
                                                            return arg1;
                                                        }
                                                        class117 var10 = class169.field3042;
                                                        if (class158.field2868 != null) {
                                                            var10 = class54.method418((byte) -127, class158.field2868.field1263);
                                                            try {
                                                                if (class158.field2868.field1259 != null) {
                                                                    byte[] var11 = ((String) class158.field2868.field1259).getBytes("ISO-8859-1");
                                                                    var10 = class111.method749(var11.length, 30000, 0, var11);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg1 = class36.method316((byte) -34, new class117[] { arg1.method781(true, 0, var9), var10, arg1.method802(var9 + 4, 1176819746) });
                                                    }
                                                }
                                                arg1 = class36.method316((byte) -34, new class117[] { arg1.method781(true, 0, var8), class128.method879(class31.method277(false, 4, arg2), (byte) -53), arg1.method802(var8 - -2, 1176819746) });
                                            }
                                        }
                                        arg1 = class36.method316((byte) -34, new class117[] { arg1.method781(true, 0, var7), class128.method879(class31.method277(false, 3, arg2), (byte) -53), arg1.method802(var7 + 2, 1176819746) });
                                    }
                                }
                                arg1 = class36.method316((byte) -34, new class117[] { arg1.method781(true, 0, var6), class128.method879(class31.method277(false, 2, arg2), (byte) -53), arg1.method802(var6 + 2, 1176819746) });
                            }
                        }
                        arg1 = class36.method316((byte) -34, new class117[] { arg1.method781(true, 0, var5), class128.method879(class31.method277(false, 1, arg2), (byte) -53), arg1.method802(var5 - -2, 1176819746) });
                    }
                }
                arg1 = class36.method316((byte) -34, new class117[] { arg1.method781(true, 0, var4), class128.method879(class31.method277(false, 0, arg2), (byte) -53), arg1.method802(var4 + 2, 1176819746) });
            }
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
    public static final void method841(int arg0) {
        if (arg0 != -1) {
            method842(125, 97, -122, 115, 19, -43);
        }
        class211.field3818.method410((byte) 71);
        ++field2252;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2236 = arg6;
        this.field2258 = arg4;
        this.field2248 = arg1;
        this.field2241 = arg5;
        this.field2249 = arg2;
        this.field2245 = arg7;
        this.field2238 = arg3;
        this.field2244 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIII)V")
    public static final void method842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class114.method762(-arg4 + arg0, 94, arg0 - -arg4, arg5, class167.field3030[arg1]);
        ++field2250;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg4 * arg4;
        int var9 = var8 << 1;
        if (arg3 > -43) {
            method832(-73, -7, 42, (byte) -1, 74);
        }
        int var10 = arg2 << 1;
        int var11 = arg2 * arg2;
        int var12 = var8 << 2;
        int var13 = -((var10 + -1) * var9) + var11;
        int var14 = var11 << 2;
        int var15 = (var6 + 1) * var14;
        int var16 = ((arg2 << 1) + -3) * var9;
        int var17 = var11 << 1;
        int var18 = (1 - var10) * var8 + var17;
        int var19 = (arg2 + -1) * var12;
        int var20 = ((var6 << 1) + 3) * var17;
        while (var7 > 0) {
            if (var18 < 0) {
                while (var18 < 0) {
                    var18 += var20;
                    var13 += var15;
                    var20 += var14;
                    var15 += var14;
                    ++var6;
                }
            }
            if (~var13 > -1) {
                ++var6;
                var18 += var20;
                var20 += var14;
                var13 += var15;
                var15 += var14;
            }
            --var7;
            int var21 = -var7 + arg1;
            var18 += -var19;
            var13 += -var16;
            var19 -= var12;
            var16 -= var12;
            int var22 = arg1 + var7;
            int var23 = arg0 + var6;
            int var24 = arg0 - var6;
            class114.method762(var24, 77, var23, arg5, class167.field3030[var21]);
            class114.method762(var24, 111, var23, arg5, class167.field3030[var22]);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
    public final void method598(int arg0, int arg1, int arg2) {
        int var4 = this.field2244 * arg1 >> 12;
        if (arg2 != -18503) {
            this.method596((byte) -68, -59, 54);
        }
        ++field2254;
        int var5 = this.field2248 * arg0 >> 12;
        int var6 = this.field2238 * arg0 >> 12;
        int var7 = this.field2249 * arg1 >> 12;
        int var8 = this.field2236 * arg1 >> 12;
        int var9 = this.field2241 * arg0 >> 12;
        int var10 = this.field2245 * arg0 >> 12;
        int var11 = this.field2258 * arg1 >> 12;
        class170.method1197(var11, 0, var10, var5, super.field4291, var4, var8, var9, var7, var6);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)I")
    public static final int method843(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -107) {
            return 43;
        } else {
            ++field2259;
            if (~arg0 < ~arg2) {
                return arg0;
            } else {
                return ~arg2 >= ~arg3 ? arg2 : arg3;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(BII)V")
    public final void method595(byte arg0, int arg1, int arg2) {
        ++field2261;
        if (arg0 > -13) {
            field2246 = null;
        }
    }
}
