import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "[I")
    public static int[] field214;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILag;)Ljava/lang/String;")
    public static final String method116(int arg0, class188 arg1) {
        field209++;
        if (client.method1063(arg1).method1456((byte) 121) == 0) {
            return null;
        }
        if (arg0 > -5) {
            field214 = null;
        }
        if (arg1.field3004 == null || arg1.field3004.trim().length() == 0) {
            return class102.field1626 ? "Hidden-use" : null;
        } else {
            return arg1.field3004;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method117(boolean arg0, String arg1) {
        field208++;
        class174.field2588 = arg1;
        if (class22.field329.field934 == null) {
            return;
        }
        try {
            String var2 = class22.field329.field934.getParameter("cookieprefix");
            String var3 = class22.field329.field934.getParameter("cookiehost");
            if (arg0) {
                field210 = -111;
            }
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class92.method728(class269.method1823(-61) + 94608000000L, (byte) -120) + "; Max-Age=" + 94608000L;
            }
            class138.method960((byte) 110, "document.cookie=\"" + var5 + "\"", class22.field329.field934);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method118(byte arg0) {
        field214 = null;
        if (arg0 > -94) {
            method121(-23, (byte) -17);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Z")
    public static final boolean method119(int arg0, int arg1) {
        field213++;
        if (arg0 < 5) {
            return false;
        } else if (arg1 >= 0 && class214.field3309.length > arg1) {
            return class214.field3309[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIILbf;JLbf;Lbf;)V")
    public static final void method120(int arg0, int arg1, int arg2, int arg3, class205 arg4, long arg5, class205 arg6, class205 arg7) {
        class175 var9 = new class175();
        var9.field2606 = arg4;
        var9.field2598 = arg1 * 128 + 64;
        var9.field2604 = arg2 * 128 + 64;
        var9.field2600 = arg3;
        var9.field2596 = arg5;
        var9.field2602 = arg6;
        var9.field2593 = arg7;
        int var10 = 0;
        class23 var11 = class255.field3907[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field360; var12++) {
                class172 var13 = var11.field358[var12];
                if ((var13.field2569 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2566.method223();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2603 = -var10;
        if (class255.field3907[arg0][arg1][arg2] == null) {
            class255.field3907[arg0][arg1][arg2] = new class23(arg0, arg1, arg2);
        }
        class255.field3907[arg0][arg1][arg2].field345 = var9;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)C")
    public static final char method121(int arg0, byte arg1) {
        field212++;
        int var2 = arg1 & 0xFF;
        if (arg0 != 63) {
            method116(31, (class188) null);
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class241.field3733[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILlf;III)V")
    public static final void method122(int arg0, class217 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 16) {
            field210 = -100;
        }
        field211++;
        if (class220.field3450 >= 400) {
            return;
        }
        if (arg1.field3405 != null) {
            arg1 = arg1.method1446(-125);
        }
        if (arg1 == null || !arg1.field3359) {
            return;
        }
        String var5 = arg1.field3411;
        if (arg1.field3355 != 0) {
            String var6 = class154.field2352 == 1 ? class7.field124 : class171.field2542;
            var5 = var5 + class228.method1515(arg1.field3355, class261.field4058.field428, 120) + " (" + var6 + arg1.field3355 + ")";
        }
        if (class90.field1458 == 1) {
            class124.field1955++;
            class155.method1045(class56.field870 + " -> <col=ffff00>" + var5, (short) 43, class256.field3920, arg2, class86.field1418, (long) arg4, (byte) 78, arg0);
        } else if (class179.field2678) {
            class289 var14 = class258.field3951 == -1 ? null : class31.method250(class258.field3951, -89);
            if ((class71.field1135 & 0x2) != 0 && var14 == null || arg1.method1454(var14.field4557, class258.field3951, (byte) 79) != var14.field4557) {
                class85.field1396++;
                class155.method1045(class126.field1982 + " -> <col=ffff00>" + var5, (short) 49, class78.field1316, arg2, class87.field1421, (long) arg4, (byte) 78, arg0);
            }
        } else {
            class78.field1315++;
            String[] var7 = arg1.field3410;
            if (class215.field3316) {
                var7 = class296.method1987(var7, 117);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class154.field2352 != 0 || !var7[var8].equalsIgnoreCase(class218.field3418))) {
                        class85.field1393++;
                        int var9 = -1;
                        byte var10 = 0;
                        if (arg1.field3347 == var8) {
                            var9 = arg1.field3409;
                        }
                        if (arg1.field3399 == var8) {
                            var9 = arg1.field3385;
                        }
                        if (var8 == 0) {
                            var10 = 21;
                        }
                        if (var8 == 1) {
                            var10 = 16;
                        }
                        if (var8 == 2) {
                            var10 = 25;
                        }
                        if (var8 == 3) {
                            var10 = 10;
                        }
                        if (var8 == 4) {
                            var10 = 18;
                        }
                        class155.method1045("<col=ffff00>" + var5, var10, var7[var8], arg2, var9, (long) arg4, (byte) 78, arg0);
                    }
                }
            }
            if (class154.field2352 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class218.field3418)) {
                        class70.field1113++;
                        short var12 = 0;
                        if (arg1.field3355 > class261.field4058.field428) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 21;
                        }
                        if (var11 == 1) {
                            var13 = 16;
                        }
                        if (var11 == 2) {
                            var13 = 25;
                        }
                        if (var11 == 3) {
                            var13 = 10;
                        }
                        if (var11 == 4) {
                            var13 = 18;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class155.method1045("<col=ffff00>" + var5, var13, var7[var11], arg2, arg1.field3404, (long) arg4, (byte) 78, arg0);
                    }
                }
            }
            class155.method1045("<col=ffff00>" + var5, (short) 1005, class117.field1822, arg2, class228.field3576, (long) arg4, (byte) 78, arg0);
        }
    }
}
