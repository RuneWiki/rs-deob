import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class149 {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "[I")
    public static int[] field2060 = new int[25];

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Lhc;")
    public static class235 field2061;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1001(int arg0, int arg1) {
        field2067++;
        if (arg1 == 100 && class280.field4345 > 0) {
            byte[] var2 = class294.field4629[--class280.field4345];
            class294.field4629[class280.field4345] = null;
            return var2;
        }
        if (arg0 != 26906) {
            field2061 = null;
        }
        if (arg1 == 5000 && class108.field1513 > 0) {
            byte[] var3 = class119.field1682[--class108.field1513];
            class119.field1682[class108.field1513] = null;
            return var3;
        } else if (arg1 == 30000 && class89.field1253 > 0) {
            byte[] var4 = class251.field3846[--class89.field1253];
            class251.field3846[class89.field1253] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1002(String arg0, int arg1) {
        field2065++;
        return arg1 >= -76 ? 88 : class111.method728(true, 10, arg0, 114);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method1003(int arg0) {
        if (arg0 != 0) {
            field2060 = null;
        }
        field2060 = null;
        field2061 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lai;[I[I[II)V")
    public static final void method1004(class88 arg0, int[] arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg4 != -101) {
            method1003(-12);
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg1[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg0.field4022.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field4022[var9] = null;
                    } else {
                        class240 var10 = class132.method905(true, var6);
                        int var11 = var10.field3674;
                        class212 var12 = arg0.field4022[var9];
                        if (var12 != null) {
                            if (var12.field3195 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field4022[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3189 = 0;
                                    var12.field3196 = 1;
                                    var12.field3197 = var8;
                                    var12.field3191 = 0;
                                    var12.field3190 = 0;
                                    class116.method781(arg0.field4085, 236, arg0.field4019, class217.field3280 == arg0, 0, var10);
                                } else if (var11 == 2) {
                                    var12.field3191 = 0;
                                }
                            } else if (var10.field3671 >= class132.method905(true, var12.field3195).field3671) {
                                var12 = arg0.field4022[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class212 var13 = arg0.field4022[var9] = new class212();
                            var13.field3189 = 0;
                            var13.field3197 = var8;
                            var13.field3195 = var6;
                            var13.field3196 = 1;
                            var13.field3190 = 0;
                            var13.field3191 = 0;
                            class116.method781(arg0.field4085, 236, arg0.field4019, class217.field3280 == arg0, 0, var10);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field2062++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLhc;)V")
    public static final void method1005(byte arg0, class235 arg1) {
        field2063++;
        if (class89.field1250) {
            return;
        }
        class64.method397();
        class219.field3292 = class124.method817(class28.field358, 24502, arg1);
        int var2 = -114 / ((arg0 + 53) / 54);
        int var3 = class197.field2739;
        int var4 = var3 * 956 / 503;
        class219.field3292.method705((class275.field4263 - var4) / 2, 0, var4, var3);
        class229.field3476 = class101.method665(arg1, class245.field3745, (byte) 125);
        class229.field3476.method452(class275.field4263 / 2 - (class229.field3476.field2611 / 2), 18);
        class89.field1250 = true;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method1006(byte arg0, String arg1, int arg2) {
        class280 var3 = class181.method1180(arg2, 0, 2);
        field2066++;
        var3.method1876(1840457248);
        if (arg0 != -31) {
            field2061 = null;
        }
        var3.field4336 = arg1;
    }
}
