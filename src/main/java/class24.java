import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class24 {

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field400 = "Discard";

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field397 = -1;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field402 = -1;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[I")
    public static int[] field395 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
    public static final void method219(int arg0, boolean arg1) {
        class184 var2 = class12.field234;
        synchronized (class12.field234) {
            class220.field3601 = arg0;
            if (arg1) {
                method224(-28);
            }
        }
        field394++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lik;IIIII)V")
    public static final void method220(class260 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class156.field2537 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class241.field3894) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class129.field2084 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class134 var14 = class288.field4563[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class124.field2012[var11][var12 + 1][var13] + class124.field2012[var11][var12][var13] + class124.field2012[var11][var12][var13 + 1] + class124.field2012[var11][var12 + 1][var13 + 1]) / 4 - (class124.field2012[arg1][arg2 + 1][arg3] + class124.field2012[arg1][arg2][arg3] + class124.field2012[arg1][arg2][arg3 + 1] + class124.field2012[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class229 var16 = var14.field2133;
                                    if (var16 != null) {
                                        if (var16.field3775.method1029()) {
                                            arg0.method1032(var16.field3775, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3784 != null && var16.field3784.method1029()) {
                                            arg0.method1032(var16.field3784, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2151; var17++) {
                                        class289 var18 = var14.field2153[var17];
                                        if (var18 != null && var18.field4581.method1029() && (var18.field4567 == var12 || var7 == var12) && (var18.field4575 == var13 || var9 == var13)) {
                                            int var19 = var18.field4573 + 1 - var18.field4567;
                                            int var20 = var18.field4571 + 1 - var18.field4575;
                                            arg0.method1032(var18.field4581, (var18.field4567 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4575 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method221(byte arg0) {
        field400 = null;
        field395 = null;
        if (arg0 < 43) {
            field397 = -23;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([Lf;II)V")
    public static final void method222(class36[] arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class36 var4 = arg0[var3];
            if (var4 != null && var4.field632 == arg2 && (!var4.field597 || !client.method1089(var4))) {
                if (var4.field709 == 0) {
                    if (!var4.field597 && client.method1089(var4) && class135.field2168 != var4) {
                        continue;
                    }
                    method222(arg0, 6, var4.field648);
                    if (var4.field658 != null) {
                        method222(var4.field658, arg1, var4.field648);
                    }
                    class258 var5 = (class258) class128.field2062.method1400((long) var4.field648, true);
                    if (var5 != null) {
                        class79.method549(var5.field4100, arg1 - 108);
                    }
                }
                if (var4.field709 == 6) {
                    if (var4.field664 != -1 || var4.field585 != -1) {
                        boolean var6 = class154.method1074(var4, 124);
                        int var7;
                        if (var6) {
                            var7 = var4.field585;
                        } else {
                            var7 = var4.field664;
                        }
                        if (var7 != -1) {
                            class181 var8 = class49.method384(var7, 4);
                            if (var8 != null) {
                                var4.field635 += class287.field4533;
                                while (var8.field2836[var4.field683] < var4.field635) {
                                    var4.field635 -= var8.field2836[var4.field683];
                                    var4.field683++;
                                    if (var8.field2848.length <= var4.field683) {
                                        var4.field683 -= var8.field2858;
                                        if (var4.field683 < 0 || var4.field683 >= var8.field2848.length) {
                                            var4.field683 = 0;
                                        }
                                    }
                                    var4.field689 = var4.field683 + 1;
                                    if (var4.field689 >= var8.field2848.length) {
                                        var4.field689 -= var8.field2858;
                                        if (var4.field689 < 0 || var8.field2848.length <= var4.field689) {
                                            var4.field689 = -1;
                                        }
                                    }
                                    class280.method1886(var4, 32);
                                }
                            }
                        }
                    }
                    if (var4.field563 != 0 && !var4.field597) {
                        int var9 = var4.field563 >> 16;
                        int var10 = class287.field4533 * var9;
                        int var11 = var4.field563 << 16 >> 16;
                        int var12 = class287.field4533 * var11;
                        var4.field647 = var4.field647 + var10 & 0x7FF;
                        var4.field567 = var4.field567 + var12 & 0x7FF;
                        class280.method1886(var4, 32);
                    }
                }
            }
        }
        field404++;
        if (arg1 != 6) {
            field395 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I")
    public static final int method223(int arg0, int arg1) {
        if (arg0 != 64) {
            field402 = -96;
        }
        field399++;
        return (arg1 & 0x3FAEA) >> 11;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static final void method224(int arg0) {
        if (arg0 != 26364) {
            method222((class36[]) null, 28, -117);
        }
        field398++;
        class51.field892.method472((byte) -63);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method225(String arg0, byte arg1) {
        field401++;
        class238.field3868 = arg0;
        if (class105.field1684.field2620 == null) {
            return;
        }
        if (arg1 > -53) {
            method225((String) null, (byte) -11);
        }
        try {
            String var2 = class105.field1684.field2620.getParameter("cookieprefix");
            String var3 = class105.field1684.field2620.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class219.method1494(10, class276.method1861((byte) 122) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class160.method1117("document.cookie=\"" + var5 + "\"", -11998, class105.field1684.field2620);
        } catch (Throwable var6) {
        }
    }
}
