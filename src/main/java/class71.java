import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class71 extends class55 {

    @OriginalMember(owner = "client!aj", name = "db", descriptor = "Z")
    private boolean field1009 = false;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    private int field991 = 0;

    @OriginalMember(owner = "client!aj", name = "ib", descriptor = "I")
    private int field1014 = 0;

    @OriginalMember(owner = "client!aj", name = "cb", descriptor = "I")
    private int field1008 = -1;

    @OriginalMember(owner = "client!aj", name = "eb", descriptor = "I")
    private int field1010 = -32768;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!aj", name = "wb", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!aj", name = "sb", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "client!aj", name = "gb", descriptor = "I")
    public int field1012;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "Lrj;")
    private class12 field1005;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field995 = -1;

    @OriginalMember(owner = "client!aj", name = "jb", descriptor = "I")
    public static int field1015 = 52;

    @OriginalMember(owner = "client!aj", name = "lb", descriptor = "I")
    public static int field1017 = 0;

    @OriginalMember(owner = "client!aj", name = "qb", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field996 = -1;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "D")
    private double field1001;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "D")
    private double field1003;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "D")
    private double field1004;

    @OriginalMember(owner = "client!aj", name = "nb", descriptor = "D")
    private double field1019;

    @OriginalMember(owner = "client!aj", name = "ub", descriptor = "D")
    private double field1026;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "D")
    private double field983;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "D")
    private double field987;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "D")
    private double field998;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!aj", name = "fb", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!aj", name = "hb", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!aj", name = "kb", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!aj", name = "mb", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!aj", name = "ob", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!aj", name = "pb", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!aj", name = "rb", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!aj", name = "tb", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!aj", name = "vb", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!aj", name = "xb", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client!aj", name = "yb", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!aj", name = "zb", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!aj", name = "Ab", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!aj", name = "Bb", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!aj", name = "Cb", descriptor = "Llm;")
    public static class347 field1034;

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "Lps;")
    public static class394 field1007;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "Lkr;")
    private class6 field993;

    // $FF: synthetic field
    @OriginalMember(owner = "client!aj", name = "Db", descriptor = "Ljava/lang/Class;")
    public static Class field1035;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
    public static void method513(boolean arg0) {
        field1007 = null;
        field1034 = null;
        if (arg0) {
            method520(-61);
        }
    }

    @OriginalMember(owner = "client!aj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1016;
        if (this.field993 != null) {
            this.field993.method40();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        if (!arg0) {
            ++field1021;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)I")
    public final int method174(int arg0) {
        ++field1031;
        if (arg0 != 2) {
            this.field992 = -28;
        }
        return this.field1010;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Lii;I)Leb;")
    public final class382 method117(class405 arg0, int arg1) {
        ++field1006;
        class375 var3 = this.method523(arg0, 1024, arg1 + 1);
        if (var3 == null) {
            return null;
        } else {
            class177 var4 = arg0.method1735();
            var4.method978(this.field1029);
            var4.method980(this.field1013);
            var4.method981((int) this.field1019, (int) this.field1001, (int) this.field987);
            if (this.field993 != null) {
                class352 var5 = this.field993.method35();
                arg0.method1653(var3, var5, var4, (class330) null, 0);
            } else {
                var3.method1601(var4, (class330) null, 0);
            }
            this.field1010 = var3.method1597();
            this.method517(arg1, var3, arg0);
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static final void method514(byte arg0) {
        ++field1023;
        try {
            if (arg0 <= 113) {
                field1015 = 40;
            }
            Method var1 = (field1035 != null ? field1035 : (field1035 = method526("java.lang.Runtime"))).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class247.field3333 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)V")
    public final void method515(int arg0, boolean arg1) {
        this.field1009 = true;
        if (this.field992 == -1) {
            this.field1001 += (double) arg0 * this.field1003;
        } else {
            this.field1001 += this.field1004 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1003;
            this.field1003 += (double) arg0 * this.field1004;
        }
        this.field1019 += (double) arg0 * this.field998;
        ++field1033;
        this.field987 += (double) arg0 * this.field983;
        this.field1013 = 16383 & 8192 + (int) (Math.atan2(this.field998, this.field983) * 2607.5945876176133D);
        if (!arg1) {
            this.field1029 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field1003, this.field1026));
            if (this.field1005 != null) {
                this.field991 += arg0;
                while (true) {
                    do {
                        do {
                            if (~this.field1005.field176[this.field1014] <= ~this.field991) {
                                return;
                            }
                            this.field991 -= this.field1005.field176[this.field1014];
                            ++this.field1014;
                            if (this.field1014 >= this.field1005.field182.length) {
                                this.field1014 -= this.field1005.field177;
                                if (~this.field1014 > -1 || ~this.field1014 <= ~this.field1005.field182.length) {
                                    this.field1014 = 0;
                                }
                            }
                            this.field1008 = this.field1014 + 1;
                        } while (~this.field1005.field182.length < ~this.field1008);
                        this.field1008 -= this.field1005.field177;
                    } while (this.field1008 >= 0 && this.field1005.field182.length > this.field1008);
                    this.field1008 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static final void method516(int arg0) {
        ++field1027;
        if (arg0 != -3248) {
            method513(false);
        }
        class189 var1 = class52.field713;
        synchronized (class52.field713) {
            class52.field713.method1136((byte) -91);
        }
        class189 var2 = class22.field285;
        synchronized (class22.field285) {
            class22.field285.method1136((byte) -128);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILdc;Lii;)V")
    private final void method517(int arg0, class375 arg1, class405 arg2) {
        ++field988;
        if (arg0 != -1) {
            field1007 = null;
        }
        class359[] var4 = arg1.method1577();
        class215[] var5 = arg1.method1616();
        if ((this.field993 == null || this.field993.field73) && (var4 != null || var5 != null)) {
            this.field993 = new class6(class28.field418);
        }
        if (this.field993 != null) {
            this.field993.method36(arg2, (long) class28.field418, var4, var5, false);
            this.field993.method44(super.field727, super.field743, super.field742, super.field726, super.field737);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILii;)V")
    public final void method103(int arg0, class405 arg1) {
        ++field1032;
        class375 var3 = this.method523(arg1, 0, 0);
        if (var3 != null) {
            class177 var4 = arg1.method1735();
            var4.method978(this.field1029);
            var4.method980(this.field1013);
            var4.method981((int) this.field1019, (int) this.field1001, (int) this.field987);
            this.field1010 = var3.method1597();
            if (arg0 < 102) {
                field1034 = null;
            }
            this.method517(-1, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lii;IIIILnc;Z)V")
    public final void method169(class405 arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, boolean arg6) {
        if (arg3 >= -106) {
            this.field992 = -83;
        }
        ++field1020;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLlm;)V")
    public static final void method518(byte arg0, class347 arg1) {
        class156.field2117 = arg1.method2270("p11_full", (byte) 115);
        ++field990;
        class377.field5493 = arg1.method2270("p12_full", (byte) 115);
        class201.field2694 = arg1.method2270("b12_full", (byte) 115);
        class244.field3263 = arg1.method2270("hitmarks", (byte) 115);
        class167.field2260 = arg1.method2270("hitbar_default", (byte) 115);
        class90.field1273 = arg1.method2270("timerbar_default", (byte) 115);
        class184.field2494 = arg1.method2270("headicons_pk", (byte) 115);
        class439.field6448 = arg1.method2270("headicons_prayer", (byte) 115);
        class5.field69 = arg1.method2270("hint_headicons", (byte) 115);
        class94.field1352 = arg1.method2270("hint_mapmarkers", (byte) 115);
        class347.field5022 = arg1.method2270("mapflag", (byte) 115);
        class63.field850 = arg1.method2270("cross", (byte) 115);
        class65.field862 = arg1.method2270("mapdots", (byte) 115);
        class379.field5508 = arg1.method2270("scrollbar", (byte) 115);
        class382.field5545 = arg1.method2270("name_icons", (byte) 115);
        if (arg0 == -123) {
            class131.field1803 = arg1.method2270("floorshadows", (byte) 115);
            class115.field1609 = arg1.method2270("compass", (byte) 115);
            class213.field2848 = arg1.method2270("hint_mapedge", (byte) 115);
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field984 = arg5;
        this.field1028 = arg6;
        this.field992 = arg7;
        this.field985 = arg9;
        this.field1009 = false;
        this.field1024 = arg0;
        this.field1012 = arg10;
        this.field989 = arg8;
        int var12 = class426.method2706((byte) 11, this.field1024).field4406;
        if (~var12 == 0) {
            this.field1005 = null;
        } else {
            this.field1005 = class33.method221((byte) 102, var12);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZLii;)Z")
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        if (arg2) {
            method513(true);
        }
        ++field1018;
        return false;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)I")
    public static final int method519(int arg0) {
        ++field994;
        try {
            if (~class220.field2907 == arg0) {
                if (-5000L + class114.method735(109) < class105.field1525) {
                    return 0;
                }
                class145.field1997 = class76.field1085.method261(-5159, class393.field5627, class354.field5129);
                class394.field5646 = class114.method735(117);
                class220.field2907 = 1;
            }
            if (~class114.method735(127) < ~(class394.field5646 + 30000L)) {
                return class152.method950(false, 1000);
            } else {
                if (class220.field2907 == 1) {
                    if (~class145.field1997.field6308 == -3) {
                        return class152.method950(false, 1001);
                    }
                    if (class145.field1997.field6308 != 1) {
                        return -1;
                    }
                    class191.field2558 = new class233((Socket) class145.field1997.field6309, class76.field1085);
                    class145.field1997 = null;
                    int var1 = 0;
                    class185.field2507.field3029 = 0;
                    if (class352.field5101) {
                        var1 = class281.field4092;
                    }
                    class185.field2507.method1346(23, 32767);
                    class185.field2507.method1330(var1, -108);
                    class191.field2558.method1401(3, 0, class185.field2507.field3029, class185.field2507.field3040);
                    if (class230.field3073 != null) {
                        class230.field3073.method1203(arg0 ^ -500001);
                    }
                    if (class281.field4093 != null) {
                        class281.field4093.method1203(arg0 ^ -500001);
                    }
                    int var2 = class191.field2558.method1399(arg0 + -7572);
                    if (class230.field3073 != null) {
                        class230.field3073.method1203(500000);
                    }
                    if (class281.field4093 != null) {
                        class281.field4093.method1203(500000);
                    }
                    if (~var2 != -1) {
                        return class152.method950(false, var2);
                    }
                    class220.field2907 = 2;
                }
                if (~class220.field2907 == -3) {
                    if (~class191.field2558.method1394(true) > -3) {
                        return -1;
                    }
                    class120.field1674 = class191.field2558.method1399(arg0 ^ 7572);
                    class120.field1674 <<= 8;
                    class120.field1674 += class191.field2558.method1399(-7573);
                    class227.field2985 = new byte[class120.field1674];
                    class220.field2907 = 3;
                    class304.field4467 = 0;
                }
                if (~class220.field2907 == -4) {
                    int var3 = class191.field2558.method1394(true);
                    if (~var3 > -2) {
                        return -1;
                    } else {
                        if (var3 > -class304.field4467 + class120.field1674) {
                            var3 = -class304.field4467 + class120.field1674;
                        }
                        class191.field2558.method1397(false, class304.field4467, class227.field2985, var3);
                        class304.field4467 += var3;
                        if (class120.field1674 > class304.field4467) {
                            return -1;
                        } else if (!class328.method2184(class227.field2985, 12596)) {
                            return class152.method950(false, 1002);
                        } else {
                            class16.field226 = new class92[class57.field774];
                            int var4 = 0;
                            for (int var5 = class27.field396; class295.field4229 >= var5; ++var5) {
                                class92 var6 = class282.method1943(var5, arg0 + -3489);
                                if (var6 != null) {
                                    class16.field226[var4++] = var6;
                                }
                            }
                            class372.field5412 = null;
                            class407.field6046 = 0;
                            class191.field2558.method1398((byte) -122);
                            class220.field2907 = 0;
                            class191.field2558 = null;
                            class227.field2985 = null;
                            class438.field6429 = 0;
                            class105.field1525 = class114.method735(103);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var7) {
            return class152.method950(false, 1003);
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    public static final void method520(int arg0) {
        class212.field2844 = 0;
        ++field1011;
        class321.field4726.method335((byte) 116);
        class321.field4726.method330(class363.field5246, -2130841184);
        ++class212.field2844;
        if (arg0 <= 124) {
            field1015 = 51;
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
    public final void method521(int arg0) {
        if (arg0 != -4) {
            method516(-45);
        }
        if (this.field993 != null) {
            this.field993.method40();
        }
        ++field1002;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIBII)V")
    public final void method522(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field986;
        if (!this.field1009) {
            double var6 = (double) (arg0 - super.field740);
            double var8 = (double) (-super.field734 + arg4);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1001 = (double) super.field729;
            this.field987 = (double) this.field989 * var8 / var10 + (double) super.field734;
            this.field1019 = (double) this.field989 * var6 / var10 + (double) super.field740;
        }
        double var12 = (double) (this.field1028 - -1 + -arg1);
        this.field998 = ((double) arg0 - this.field1019) / var12;
        this.field983 = ((double) arg4 - this.field987) / var12;
        if (arg2 != -83) {
            this.field1028 = 51;
        }
        this.field1026 = Math.sqrt(this.field998 * this.field998 + this.field983 * this.field983);
        if (~this.field992 == 0) {
            this.field1003 = ((double) arg3 - this.field1001) / var12;
        } else {
            if (!this.field1009) {
                this.field1003 = -this.field1026 * Math.tan((double) this.field992 * 0.02454369D);
            }
            this.field1004 = ((double) arg3 - this.field1001 + -(this.field1003 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lii;II)Ldc;")
    private final class375 method523(class405 arg0, int arg1, int arg2) {
        ++field997;
        class300 var4 = class426.method2706((byte) 11, this.field1024);
        if (arg2 != 0) {
            this.field984 = 7;
        }
        return var4.method2060(arg1, (byte) -98, arg0, this.field1008, this.field991, this.field1014);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)V")
    public static final void method524(byte arg0) {
        if (arg0 != -38) {
            field1015 = 81;
        }
        class189 var1 = class263.field3816;
        synchronized (class263.field3816) {
            class263.field3816.method1141(256);
        }
        ++field1030;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V")
    public final void method373(byte arg0) {
        super.field743 = super.field742 = (short) ((int) (this.field1019 / 128.0D));
        if (arg0 >= -91) {
            this.method515(27, true);
        }
        super.field726 = super.field737 = (short) ((int) (this.field987 / 128.0D));
        ++field1000;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZIII)V")
    public static final void method525(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class373.field5422 == 0) {
            class245.method1471(false, false);
        } else {
            class253.field3493 = class373.field5422;
            class283.method1953(0, (byte) -22);
        }
        if (arg0 <= 76) {
            method520(4);
        }
        ++field1025;
        class8.field144 = arg3;
        class211.field2820 = arg1;
        class177.field2339 = arg2;
        class293.method1989(arg4);
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        ++field999;
        if (arg0 != -17506) {
            this.method117((class405) null, 1);
        }
        return false;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method526(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
