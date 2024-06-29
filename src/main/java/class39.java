import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class39 extends class326 {

    @OriginalMember(owner = "client!in", name = "T", descriptor = "Lod;")
    public static class223 field558 = new class223(128);

    @OriginalMember(owner = "client!in", name = "U", descriptor = "Ljava/lang/String;")
    public static String field559 = "wave2:";

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!in", name = "W", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!in", name = "V", descriptor = "Lun;")
    public static class190 field560;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "Lug;")
    public static class253 field551;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "[I")
    public static int[] field550;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I[Lcd;I)V", line = 6)
    public static final void method330(int arg0, class136[] arg1, int arg2) {
        field556++;
        for (int var3 = arg2; var3 < arg1.length; var3++) {
            class136 var4 = arg1[var3];
            if (var4 != null && var4.field2090 == arg0 && (!var4.field2164 || !client.method952(var4))) {
                if (var4.field2063 == 0) {
                    if (!var4.field2164 && client.method952(var4) && class174.field2856 != var4) {
                        continue;
                    }
                    method330(var4.field2069, arg1, arg2 ^ 0x0);
                    if (var4.field2062 != null) {
                        method330(var4.field2069, var4.field2062, 0);
                    }
                    class25 var5 = (class25) class210.field3304.method2168((long) var4.field2069, (byte) -86);
                    if (var5 != null) {
                        class211.method1538(true, var5.field376);
                    }
                }
                if (var4.field2063 == 6) {
                    if (var4.field2128 != -1 || var4.field2052 != -1) {
                        boolean var6 = class301.method2083(arg2 ^ 0x68, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2052;
                        } else {
                            var7 = var4.field2128;
                        }
                        if (var7 != -1) {
                            class281 var8 = class295.method2064(0, var7);
                            if (var8 != null) {
                                var4.field2088 += class153.field2373;
                                while (var8.field4328[var4.field2147] < var4.field2088) {
                                    var4.field2088 -= var8.field4328[var4.field2147];
                                    var4.field2147++;
                                    if (var4.field2147 >= var8.field4319.length) {
                                        var4.field2147 -= var8.field4339;
                                        if (var4.field2147 < 0 || var8.field4319.length <= var4.field2147) {
                                            var4.field2147 = 0;
                                        }
                                    }
                                    var4.field2130 = var4.field2147 + 1;
                                    if (var8.field4319.length <= var4.field2130) {
                                        var4.field2130 -= var8.field4339;
                                        if (var4.field2130 < 0 || var4.field2130 >= var8.field4319.length) {
                                            var4.field2130 = -1;
                                        }
                                    }
                                    class167.method1250(var4, 412);
                                }
                            }
                        }
                    }
                    if (var4.field2036 != 0 && !var4.field2164) {
                        int var9 = var4.field2036 >> 16;
                        int var10 = class153.field2373 * var9;
                        var4.field2145 = var4.field2145 + var10 & 0x7FF;
                        int var11 = var4.field2036 << 16 >> 16;
                        int var12 = class153.field2373 * var11;
                        var4.field2096 = var4.field2096 + var12 & 0x7FF;
                        class167.method1250(var4, 412);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(I)V", line = 120)
    private class39(int arg0) {
        super(0, false);
        this.method333(74, arg0);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZLvl;)V", line = 135)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (!arg1) {
            if (arg0 == 0) {
                this.method333(77, arg2.method31(-22888));
            }
            field561++;
        }
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V", line = 162)
    public static void method331(int arg0) {
        if (arg0 != 2047) {
            field552 = 94;
        }
        field551 = null;
        field550 = null;
        field559 = null;
        field560 = null;
        field558 = null;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 175)
    public class39() {
        this(0);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIBLcd;I)V", line = 179)
    public static final void method332(int arg0, int arg1, byte arg2, class136 arg3, int arg4) {
        if (class109.field1458) {
            class122.method885(arg1, arg0, arg3.field2137 + arg1, arg3.field2078 + arg0);
        }
        if (class274.field4236 >= 3) {
            if (class109.field1458) {
                class169 var5 = arg3.method998(false, true);
                if (var5 != null) {
                    var5.method1273(arg1, arg0);
                }
            } else {
                class280.method1962(arg1, arg0, 0, arg3.field2084, arg3.field2027);
            }
        } else if (class109.field1458) {
            ((class239) class207.field3284).method1704(arg1, arg0, arg3.field2137, arg3.field2078, class207.field3284.field2788 / 2, class207.field3284.field2791 / 2, (int) class45.field604, 256, (class239) arg3.method998(false, true));
        } else {
            ((class190) class207.field3284).method1367(arg1, arg0, arg3.field2137, arg3.field2078, class207.field3284.field2788 / 2, class207.field3284.field2791 / 2, (int) class45.field604, 256, arg3.field2084, arg3.field2027);
        }
        class97.field1277[arg4] = true;
        field557++;
        if (arg2 <= 71) {
            method332(-29, 53, (byte) -69, (class136) null, 87);
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V", line = 218)
    private final void method333(int arg0, int arg1) {
        this.field555 = arg1 >> 12 & 0xFF0;
        int var3 = 31 / ((-arg0 - 21) / 54);
        this.field548 = (arg1 & 0xFF) << 4;
        this.field554 = arg1 >> 4 & 0xFF0;
        field549++;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)[[I", line = 239)
    public final int[][] method253(int arg0, byte arg1) {
        int var3 = -91 % ((arg1 - 60) / 51);
        field553++;
        int[][] var4 = this.field5104.method2365((byte) 23, arg0);
        if (this.field5104.field5325) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class166.field2731; var8++) {
                var5[var8] = this.field555;
                var6[var8] = this.field554;
                var7[var8] = this.field548;
            }
        }
        return var4;
    }
}
