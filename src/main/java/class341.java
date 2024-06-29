import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class341 extends class35 {

    @OriginalMember(owner = "client!q", name = "q", descriptor = "[I")
    public int[] field5108 = new int[] { -1 };

    @OriginalMember(owner = "client!q", name = "s", descriptor = "[I")
    public int[] field5110 = new int[1];

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lct;")
    public static class285 field5104 = new class285(29, 3);

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field5111 = 0;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Z")
    public static boolean field5112 = false;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "[I")
    public static int[] field5109 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([IB[IIZ)J", line = 5)
    private final long method2090(int[] arg0, byte arg1, int[] arg2, int arg3, boolean arg4) {
        field5107++;
        long[] var6 = class82.field1154;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg3 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var18 = var6[(int) ((var11 ^ (long) (arg2[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var20 = var6[(int) (((long) (arg2[var13] >> 16) ^ var18) & 0xFFL)] ^ var18 >>> 8;
            long var22 = var20 >>> 8 ^ var6[(int) ((var20 ^ (long) (arg2[var13] >> 8)) & 0xFFL)];
            var11 = var22 >>> 8 ^ var6[(int) (((long) arg2[var13] ^ var22) & 0xFFL)];
        }
        int var14 = 122 % ((41 - arg1) / 58);
        if (arg0 != null) {
            for (int var15 = 0; var15 < 5; var15++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg0[var15] ^ var11) & 0xFFL)];
            }
        }
        return var6[(int) (((long) (arg4 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLpp;ILcu;IIIILtq;I)Lns;", line = 55)
    public final class57 method2091(boolean arg0, class356 arg1, int arg2, class330 arg3, int arg4, int arg5, int arg6, int arg7, class63 arg8, int arg9) {
        field5105++;
        class57 var11 = null;
        int var12 = arg4;
        class322 var13 = null;
        if (arg6 != -1) {
            var13 = class297.field4454.method1829(arg6, (byte) -78);
        }
        int[] var14 = this.field5108;
        if (var13 != null && var13.field4807 != null) {
            var14 = new int[var13.field4807.length];
            for (int var15 = 0; var15 < var13.field4807.length; var15++) {
                int var16 = var13.field4807[var15];
                if (var16 >= 0 && this.field5108.length > var16) {
                    var14[var15] = this.field5108[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        if (arg7 != 1317929992) {
            field5109 = null;
        }
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        class110 var23 = null;
        class110 var24 = null;
        if (arg1 != null) {
            var12 = arg4 | 0x20;
            int var25 = arg1.field5389[arg5];
            int var26 = var25 >>> 16;
            var20 = var25 & 0xFFFF;
            var23 = class170.field2423.method1580(1, var26);
            if (var23 != null) {
                var18 |= var23.method808(104, var20);
                var17 |= var23.method807(true, var20);
                var19 |= arg1.field5398;
            }
            if ((arg1.field5396 || class155.field2162) && arg2 != -1 && arg1.field5389.length > arg2) {
                var22 = arg1.field5421[arg5];
                int var27 = arg1.field5389[arg2];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class170.field2423.method1580(1, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method808(121, var21);
                    var17 |= var24.method807(true, var21);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
        }
        long var29 = this.method2090(arg3 == null ? null : arg3.field4941, (byte) -93, var14, arg6, arg0);
        if (class286.field4369 != null) {
            var11 = (class57) class286.field4369.method2393(arg7 - 1317930115, var29);
        }
        if (var11 == null || arg8.method583(var11.method402(), var12) != 0) {
            if (var11 != null) {
                var12 = arg8.method578(var12, var11.method402());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class23.field309.method2364((byte) 118, var14[var33]).method1262(arg0, (byte) 94)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class246[] var34 = new class246[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class23.field309.method2364((byte) 118, var14[var35]).method1272(class76.method648(arg7, -1317930069), arg0);
                }
            }
            if (var13 != null && var13.field4818 != null) {
                for (int var36 = 0; var36 < var13.field4818.length; var36++) {
                    if (var13.field4818[var36] != null && var34[var36] != null) {
                        int var37 = var13.field4818[var36][0];
                        int var38 = var13.field4818[var36][1];
                        int var39 = var13.field4818[var36][2];
                        int var40 = var13.field4818[var36][3];
                        int var41 = var13.field4818[var36][4];
                        int var42 = var13.field4818[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method1571(arg7 - 1317945346, var41, var40, var42);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method1569(0, var38, var37, var39);
                        }
                    }
                }
            }
            if (arg3 != null) {
                var31 = var12 | 0x2000;
            }
            class246 var43 = new class246(var34, var34.length);
            var11 = arg8.method555(var43, var31, class131.field1827, 64, 850);
            if (arg3 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (arg3.field4941[var44] < class87.field1233[var44].length) {
                        var11.method420(class76.field1071[var44], class87.field1233[var44][arg3.field4941[var44]]);
                    }
                    if (class314.field4733[var44].length > arg3.field4941[var44]) {
                        var11.method420(class73.field989[var44], class314.field4733[var44][arg3.field4941[var44]]);
                    }
                }
            }
            if (class286.field4369 != null) {
                var11.method441(var12);
                class286.field4369.method2395(0, var11, var29);
            }
        }
        if (arg1 == null || var23 == null) {
            return var11;
        } else {
            class57 var45 = var11.method437((byte) 1, var12, true);
            var45.method410(var23, 0, var24, var21, arg7 ^ 0xB171EB8A, arg1.field5398, var20, var22, arg9 - 1);
            return var45;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 290)
    public static final void method2092(String arg0, int arg1) {
        class229.field3374 = arg0;
        field5103++;
        if (class21.field261.field2125 == null) {
            return;
        }
        try {
            String var2 = class21.field261.field2125.getParameter("cookieprefix");
            String var3 = class21.field261.field2125.getParameter("cookiehost");
            int var4 = 97 % ((82 - arg1) / 40);
            String var5 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var6;
            if (arg0.length() == 0) {
                var6 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var6 = var5 + "; Expires=" + class23.method208(class435.method2539(-10659) + 94608000000L, (byte) 99) + "; Max-Age=" + 94608000L;
            }
            class399.method2384("document.cookie=\"" + var6 + "\"", class21.field261.field2125, -29105);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIB)Ljava/lang/String;", line = 323)
    public static final String method2093(int arg0, int arg1, byte arg2) {
        if (arg2 <= 126) {
            return null;
        }
        field5106++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V", line = 372)
    public static void method2094(int arg0) {
        field5109 = null;
        field5104 = null;
        if (arg0 != -24810) {
            field5111 = 23;
        }
    }
}
