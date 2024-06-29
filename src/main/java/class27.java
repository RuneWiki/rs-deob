import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class27 {

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field391 = 0;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Ljava/util/Random;")
    public static Random field390 = new Random();

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[I")
    public static int[] field393 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field394 = -1;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Le;")
    public static class191 field395 = class54.method368(" )2> <col=ffffff>", 2047);

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "Le;")
    public static class191 field397 = class54.method368("null", 2047);

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field398 = 0;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Lng;")
    public static class121 field396;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Z")
    public static final boolean method195(byte arg0) {
        field388++;
        if (class70.field1238 != 0) {
            try {
                if ((Boolean) class166.field2803.method1357(false, class167.field2820.field4379)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 > -48) {
            field395 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Leg;ZI)V")
    public static final void method196(class33 arg0, boolean arg1, int arg2) {
        if (arg2 != 109) {
            method198((byte) 14);
        }
        field389++;
        int var3 = arg0.field462 == 0 ? arg0.field537 : arg0.field462;
        int var4 = arg0.field482 == 0 ? arg0.field561 : arg0.field482;
        class211.method1455(var4, arg0.field491, (byte) 95, var3, class242.field4325[arg0.field491 >> 16], arg1);
        if (arg0.field548 != null) {
            class211.method1455(var4, arg0.field491, (byte) 95, var3, arg0.field548, arg1);
        }
        class267 var5 = (class267) class73.field1259.method612((long) arg0.field491, true);
        if (var5 != null) {
            class37.method255(var4, var3, arg1, 122, var5.field4721);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static final void method197(int arg0) {
        for (int var1 = 0; var1 < class90.field1460; var1++) {
            int var3 = class18.field247[var1];
            class156 var4 = class115.field1901[var3];
            int var5 = class107.field1776.method1580(-127);
            if ((var5 & 0x8) != 0) {
                var4.field2993 = class107.field1776.method1596((byte) 72);
                var4.field2981 = 100;
            }
            if ((var5 & 0x4) != 0) {
                var4.field2988 = class107.field1776.method1598((byte) -87);
                if (var4.field2988 == 65535) {
                    var4.field2988 = -1;
                }
            }
            if ((var5 & 0x2) != 0) {
                var4.field3018 = class107.field1776.method1611((byte) -85);
                var4.field2979 = class107.field1776.method1593(true);
            }
            if ((var5 & 0x80) != 0) {
                int var6 = class107.field1776.method1598((byte) -87);
                int var7 = class107.field1776.method1580(-62);
                if (var6 == 65535) {
                    var6 = -1;
                }
                class154.method1043(var4, (byte) -119, var6, var7);
            }
            if ((var5 & 0x10) != 0) {
                int var8 = class107.field1776.method1599((byte) -101);
                int var9 = class107.field1776.method1573(-11685392);
                var4.method1188(var8, var9, class135.field2267, 70);
            }
            if ((var5 & 0x40) != 0) {
                if (var4.field2663.method1241(-1)) {
                    class111.method715(-2854, var4);
                }
                var4.field2663 = class135.method904(-125, class107.field1776.method1611((byte) -114));
                var4.method1185(1, var4.field2663.field3208);
                var4.field2974 = var4.field2663.field3213;
                var4.field3007 = var4.field2663.field3186;
                var4.field2970 = var4.field2663.field3214;
                var4.field3011 = var4.field2663.field3202;
                var4.field3012 = var4.field2663.field3163;
                var4.field2995 = var4.field2663.field3181;
                var4.field2960 = var4.field2663.field3170;
                var4.field2969 = var4.field2663.field3227;
                if (var4.field2663.method1241(-1)) {
                    class87.method531((class102) null, var4.field3014[0], 0, (class76) null, var4.field2953[0], var4, (byte) -51, class261.field4598);
                }
            }
            if ((var5 & 0x1) != 0) {
                int var10 = class107.field1776.method1599((byte) -126);
                int var11 = class107.field1776.method1599((byte) -95);
                var4.method1188(var10, var11, class135.field2267, 70);
                var4.field2950 = class135.field2267 + 300;
                var4.field2989 = class107.field1776.method1573(-11685392);
            }
            if ((var5 & 0x20) != 0) {
                var4.field3009 = class107.field1776.method1563(true);
                int var12 = class107.field1776.method1560(-115);
                var4.field3000 = 0;
                var4.field2959 = 0;
                if (var4.field3009 == 65535) {
                    var4.field3009 = -1;
                }
                var4.field3013 = (var12 & 0xFFFF) + class135.field2267;
                if (var4.field3013 > class135.field2267) {
                    var4.field2959 = -1;
                }
                var4.field2956 = var12 >> 16;
                if (var4.field3009 != -1 && class135.field2267 == var4.field3013) {
                    int var13 = class47.method323(-4453, var4.field3009).field170;
                    if (var13 != -1) {
                        class248 var14 = class67.method445((byte) -61, var13);
                        if (var14 != null && var14.field4419 != null) {
                            class252.method1750((byte) -8, var4.field3003, var4.field2972, var14, false, 0);
                        }
                    }
                }
            }
        }
        int var2 = -32 / ((arg0 - 34) / 60);
        field392++;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)J")
    public static final synchronized long method198(byte arg0) {
        if (arg0 > -112) {
            method196((class33) null, true, -36);
        }
        field386++;
        long var1 = System.currentTimeMillis();
        if (var1 < class105.field1761) {
            class137.field2304 += class105.field1761 - var1;
        }
        class105.field1761 = var1;
        return class137.field2304 + var1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II[Leg;)V")
    public static final void method199(int arg0, int arg1, class33[] arg2) {
        field387++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class33 var4 = arg2[var3];
            if (var4 != null && var4.field478 == arg1 && (!var4.field591 || !client.method661(var4))) {
                if (var4.field493 == 0) {
                    if (!var4.field591 && client.method661(var4) && class30.field422 != var4) {
                        continue;
                    }
                    method199(17081, var4.field491, arg2);
                    if (var4.field548 != null) {
                        method199(17081, var4.field491, var4.field548);
                    }
                    class267 var5 = (class267) class73.field1259.method612((long) var4.field491, true);
                    if (var5 != null) {
                        class92.method564(var5.field4721, -1);
                    }
                }
                if (var4.field493 == 6) {
                    if (var4.field514 != -1 || var4.field499 != -1) {
                        boolean var6 = class106.method680(6184, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field499;
                        } else {
                            var7 = var4.field514;
                        }
                        if (var7 != -1) {
                            class248 var8 = class67.method445((byte) -61, var7);
                            if (var8 != null) {
                                var4.field479 += class182.field3138;
                                while (var8.field4406[var4.field557] < var4.field479) {
                                    var4.field479 -= var8.field4406[var4.field557];
                                    var4.field557++;
                                    if (var4.field557 >= var8.field4419.length) {
                                        var4.field557 -= var8.field4402;
                                        if (var4.field557 < 0 || var4.field557 >= var8.field4419.length) {
                                            var4.field557 = 0;
                                        }
                                    }
                                    class184.method1238(var4, (byte) -24);
                                }
                            }
                        }
                    }
                    if (var4.field517 != 0 && !var4.field591) {
                        int var9 = var4.field517 >> 16;
                        int var10 = var4.field517 << 16 >> 16;
                        int var11 = class182.field3138 * var9;
                        var4.field603 = var4.field603 + var11 & 0x7FF;
                        int var12 = class182.field3138 * var10;
                        var4.field510 = var4.field510 + var12 & 0x7FF;
                        class184.method1238(var4, (byte) -60);
                    }
                }
            }
        }
        if (arg0 != 17081) {
            field396 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)V")
    public static void method200(byte arg0) {
        field393 = null;
        field390 = null;
        int var1 = -74 % ((arg0 + 22) / 58);
        field396 = null;
        field397 = null;
        field395 = null;
    }
}
