import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class190 {

    @OriginalMember(owner = "client!op", name = "l", descriptor = "Ljt;")
    private class106 field2883 = new class106(64);

    @OriginalMember(owner = "client!op", name = "f", descriptor = "Lvd;")
    private class39 field2877;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field2881 = 0;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field2880 = -1;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "Lmia;")
    public static class63 field2872 = new class63(83, -1);

    @OriginalMember(owner = "client!op", name = "m", descriptor = "F")
    public static float field2884;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public final void method1318(byte arg0) {
        class106 var2 = this.field2883;
        synchronized (this.field2883) {
            if (arg0 > -112) {
                method1320(false, null, 89, (byte) 12, -35, 101, false);
            }
            this.field2883.method809(true);
        }
        field2878++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)Lsp;")
    public final class638 method1319(int arg0, byte arg1) {
        field2873++;
        class106 var3 = this.field2883;
        class638 var4;
        synchronized (this.field2883) {
            var4 = (class638) this.field2883.method803(113, (long) arg0);
            if (arg1 != 57) {
                field2872 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field2877;
        byte[] var6;
        synchronized (this.field2877) {
            var6 = this.field2877.method211(true, 16, arg0);
        }
        class638 var7 = new class638();
        if (var6 != null) {
            var7.method3665(new class645(var6), (byte) -106);
        }
        class106 var8 = this.field2883;
        synchronized (this.field2883) {
            this.field2883.method801(1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method1320(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class91.field1277 = 0;
        class630.field8794 = 0;
        class440.field6515++;
        if ((arg5 & 0x2) == 0) {
            for (class593 var8 = class577.field8153[var7]; var8 != null; var8 = var8.field8431) {
                if (!class740.method4144(var8, arg0, arg1, arg2, arg3)) {
                    class56.method396(var8);
                    if (var8.field8425 != -1) {
                        class518.field7395[class91.field1277++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class593 var9 = class614.field8664[var7]; var9 != null; var9 = var9.field8431) {
                if (!class740.method4144(var9, arg0, arg1, arg2, arg3)) {
                    class56.method396(var9);
                    if (var9.field8425 != -1) {
                        class274.field3907[class630.field8794++] = var9;
                    }
                }
            }
            for (class593 var10 = class374.field5677[var7]; var10 != null; var10 = var10.field8431) {
                if (!class740.method4144(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method329((byte) 116)) {
                        class56.method396(var10);
                        if (var10.field8425 != -1) {
                            class274.field3907[class630.field8794++] = var10;
                        }
                    } else {
                        class56.method396(var10);
                        if (var10.field8425 != -1) {
                            class518.field7395[class91.field1277++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class425.field6313; var11++) {
                    if (!class740.method4144(class187.field2850[var11], arg0, arg1, arg2, arg3)) {
                        class56.method396(class187.field2850[var11]);
                        if (class187.field2850[var11].field8425 != -1) {
                            if (class187.field2850[var11].method329((byte) 93)) {
                                class274.field3907[class630.field8794++] = class187.field2850[var11];
                            } else {
                                class518.field7395[class91.field1277++] = class187.field2850[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class91.field1277 > 0) {
            class225.method1520(class518.field7395, 0, class91.field1277 - 1);
            for (int var12 = 0; var12 < class91.field1277; var12++) {
                class343.method2180(class518.field7395[var12], true, arg6);
            }
        }
        if (class94.field1347) {
            class118.field1620.method501(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class509.field7252; var13 < class409.field6165; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class464.field6819.length;
                    if (class464.field6819.length + class358.field5196 > class34.field356) {
                        var23 -= class464.field6819.length + class358.field5196 - class34.field356;
                    }
                    int var24 = class464.field6819[0].length;
                    if (class464.field6819[0].length + class8.field110 > class565.field8040) {
                        var24 -= class464.field6819[0].length + class8.field110 - class565.field8040;
                    }
                    boolean[][] var25 = class582.field8264;
                    if (class557.field7949) {
                        if (class413.field6206) {
                            var25 = class727.field10148[var13];
                        }
                        for (int var26 = class214.field3202; var26 < var23; var26++) {
                            int var27 = class358.field5196 + var26 - class214.field3202;
                            for (int var28 = class285.field4047; var28 < var24; var28++) {
                                if (class464.field6819[var26][var28] && !class361.method2249(class8.field110 + var28 - class285.field4047, 65, var27, var13)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class413.field6206) {
                        if (arg4 >= 0) {
                            class582.field8287[var13].method975(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class582.field8287[var13].method977(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class686.field9489; var29++) {
                            class379.field5736[var29].method291((byte) 122, new class105(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class582.field8287[var13].method975(class736.field10315, class116.field1600, class60.field843, class582.field8264, true, arg4, arg5);
                    } else {
                        class582.field8287[var13].method977(class736.field10315, class116.field1600, class60.field843, class582.field8264, true, arg5);
                    }
                } else {
                    int var14 = class464.field6819.length;
                    if (class464.field6819.length + class358.field5196 > class34.field356) {
                        var14 -= class464.field6819.length + class358.field5196 - class34.field356;
                    }
                    int var15 = class464.field6819[0].length;
                    if (class464.field6819[0].length + class8.field110 > class565.field8040) {
                        var15 -= class464.field6819[0].length + class8.field110 - class565.field8040;
                    }
                    boolean[][] var16 = class582.field8264;
                    if (class557.field7949) {
                        if (class413.field6206) {
                            var16 = class727.field10148[var13];
                        }
                        for (int var17 = class214.field3202; var17 < var14; var17++) {
                            int var18 = class358.field5196 + var17 - class214.field3202;
                            for (int var19 = class285.field4047; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class464.field6819[var17][var19]) {
                                    int var20 = class8.field110 + var19 - class285.field4047;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class80.field1136[var21][var18][var20] != null && class80.field1136[var21][var18][var20].field2831 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class361.method2249(var20, 123, var18, var13)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class413.field6206) {
                        if (arg4 >= 0) {
                            class582.field8287[var13].method975(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class582.field8287[var13].method977(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class686.field9489; var22++) {
                            class379.field5736[var22].method291((byte) 122, new class105(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class582.field8287[var13].method975(class736.field10315, class116.field1600, class60.field843, class582.field8264, false, arg4, arg5);
                    } else {
                        class582.field8287[var13].method977(class736.field10315, class116.field1600, class60.field843, class582.field8264, false, arg5);
                    }
                }
            }
        }
        if (class630.field8794 > 0) {
            class38.method193(class274.field3907, 0, class630.field8794 - 1);
            for (int var30 = 0; var30 < class630.field8794; var30++) {
                class343.method2180(class274.field3907[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V")
    public static void method1321(byte arg0) {
        if (arg0 == 102) {
            field2872 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II[BFFFFIIILoia;IF)V")
    public static final void method1322(int arg0, int arg1, byte[] arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, class89 arg10, int arg11, float arg12) {
        field2882++;
        if (arg0 != -31231) {
            method1320(true, null, -53, (byte) -96, 99, -51, false);
        }
        for (int var13 = 0; var13 < arg8; var13++) {
            class400.method2537(arg6, arg7, arg2, arg9, arg3, arg8, 0, arg10, arg5, arg4, arg1, var13, arg12, arg11);
            arg9 += arg1 * arg11;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public final void method1323(int arg0) {
        class106 var2 = this.field2883;
        synchronized (this.field2883) {
            this.field2883.method800(116);
            if (arg0 != -1) {
                this.method1319(24, (byte) 47);
            }
        }
        field2879++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
    public final void method1324(int arg0, int arg1) {
        field2875++;
        class106 var3 = this.field2883;
        synchronized (this.field2883) {
            int var4 = -58 / ((arg0 - 44) / 34);
            this.field2883.method807(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lqg;ILvd;)V")
    public class190(class464 arg0, int arg1, class39 arg2) {
        this.field2877 = arg2;
        if (this.field2877 == null) {
            this.field2876 = 0;
        } else {
            this.field2876 = this.field2877.method229(16, 0);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1325(String arg0, byte arg1) {
        field2874++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        int var4 = 0;
        if (arg1 != -74) {
            field2881 = -2;
        }
        while (var3 > var4) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && (var4 + 2) < var3) {
                label102: {
                    char var6 = arg0.charAt(var4 + 1);
                    boolean var7 = false;
                    int var8;
                    if (var6 >= '0' && var6 <= '9') {
                        var8 = var6 - 48;
                    } else if (var6 >= 'a' && var6 <= 'f') {
                        var8 = var6 + 10 - 97;
                    } else {
                        if (var6 < 'A' || var6 > 'F') {
                            var2.append('%');
                            break label102;
                        }
                        var8 = var6 - 55;
                    }
                    int var9 = var8 * 16;
                    char var10 = arg0.charAt(var4 + 2);
                    int var11;
                    if (var10 >= '0' && var10 <= '9') {
                        var11 = var10 + var9 - 48;
                    } else if (var10 >= 'a' && var10 <= 'f') {
                        var11 = var10 + var9 - 87;
                    } else {
                        if (var10 < 'A' || var10 > 'F') {
                            var2.append('%');
                            break label102;
                        }
                        var11 = var10 + var9 + '\n' - 65;
                    }
                    if (var11 != 0 && class317.method2012((byte) var11, arg1 ^ 0xFFFFE151)) {
                        var2.append(class33.method166(false, (byte) var11));
                    }
                    var4 += 2;
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
            var4++;
        }
        return var2.toString();
    }
}
