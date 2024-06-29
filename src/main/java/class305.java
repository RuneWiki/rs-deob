import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class305 {

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field4988 = 0;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field4989 = 0;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4993 = "Members object";

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Lui;")
    public static class98 field4991 = new class98(128);

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field4995 = 0;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4994 = "Loading sprites - ";

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Lnm;")
    public static class221 field4992;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method2134(int arg0, int arg1) {
        if (arg1 != -7) {
            field4991 = (class98) null;
        }
        field4987++;
        return arg0 == 4 || arg0 == 8;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V", line = 19)
    public static final void method2135(boolean arg0) {
        if (arg0) {
            method2139(-90, -81, 106);
        }
        field4984++;
        if (class221.field3424 == 0) {
            return;
        }
        try {
            if (++class33.field490 > 1500) {
                if (class346.field5545 != null) {
                    class346.field5545.method674((byte) -83);
                    class346.field5545 = null;
                }
                if (class181.field2822 >= 1) {
                    class221.field3424 = 0;
                    class15.field202 = -5;
                    return;
                }
                class181.field2822++;
                if (class344.field5523 == class171.field2665) {
                    class171.field2665 = class270.field4452;
                } else {
                    class171.field2665 = class344.field5523;
                }
                class221.field3424 = 1;
                class33.field490 = 0;
            }
            if (class221.field3424 == 1) {
                class218.field3366 = class96.field1382.method1950(class228.field3581, class171.field2665, 94);
                class221.field3424 = 2;
            }
            if (class221.field3424 == 2) {
                if (class218.field3366.field2542 == 2) {
                    throw new IOException();
                }
                if (class218.field3366.field2542 != 1) {
                    return;
                }
                class346.field5545 = new class102((Socket) class218.field3366.field2538, class96.field1382);
                class218.field3366 = null;
                class346.field5545.method669(0, class195.field2992.field5124, class195.field2992.field5137, (byte) -86);
                if (class291.field4828 != null) {
                    class291.field4828.method1096(false);
                }
                if (class15.field199 != null) {
                    class15.field199.method1096(arg0);
                }
                int var1 = class346.field5545.method668(0);
                if (class291.field4828 != null) {
                    class291.field4828.method1096(false);
                }
                if (class15.field199 != null) {
                    class15.field199.method1096(false);
                }
                if (var1 != 101) {
                    class15.field202 = var1;
                    class221.field3424 = 0;
                    class346.field5545.method674((byte) -83);
                    class346.field5545 = null;
                    return;
                }
                class221.field3424 = 3;
            }
            if (class221.field3424 == 3) {
                if (class346.field5545.method667(true) < 2) {
                    return;
                }
                int var2 = class346.field5545.method668(0) << 8 | class346.field5545.method668(0);
                class180.method1256(40000, var2);
                if (class203.field3111 != -1) {
                    class221.field3424 = 0;
                    class346.field5545.method674((byte) -83);
                    class346.field5545 = null;
                    class31.method263(19130);
                    return;
                }
                class221.field3424 = 0;
                class15.field202 = 6;
                class346.field5545.method674((byte) -83);
                class346.field5545 = null;
                return;
            }
        } catch (IOException var4) {
            if (class346.field5545 != null) {
                class346.field5545.method674((byte) -83);
                class346.field5545 = null;
            }
            if (class181.field2822 >= 1) {
                class221.field3424 = 0;
                class15.field202 = -4;
            } else {
                class221.field3424 = 1;
                class33.field490 = 0;
                if (class344.field5523 == class171.field2665) {
                    class171.field2665 = class270.field4452;
                } else {
                    class171.field2665 = class344.field5523;
                }
                class181.field2822++;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)[Lfo;", line = 173)
    public static final class239[] method2136(int arg0) {
        field4986++;
        class239[] var1 = new class239[class2.field9];
        for (int var2 = arg0; var2 < class2.field9; var2++) {
            var1[var2] = new class239(class300.field4961, class96.field1400, class18.field228[var2], class28.field419[var2], class322.field5289[var2], class94.field1379[var2], class105.field1522[var2], class201.field3085);
        }
        class167.method1164(false);
        return var1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 200)
    public static void method2137(byte arg0) {
        field4992 = null;
        field4994 = null;
        int var1 = 74 / ((-arg0 - 3) / 50);
        field4991 = null;
        field4993 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lbb;ILpl;BI)V", line = 224)
    public static final void method2138(class148 arg0, int arg1, class312 arg2, byte arg3, int arg4) {
        field4990++;
        if (arg2.field5100 != null) {
            boolean var5 = false;
            int[] var6 = new int[arg2.field5100.length];
            for (int var7 = 0; var7 < (var6.length / 2); var7++) {
                int var8 = arg0.field2381 - arg2.field5100[var7 * 2 + 1];
                int var9 = arg2.field5100[var7 * 2] + arg0.field2391;
                int var10 = var6[var7 * 2] = class88.field1279 + ((class88.field1270 - class88.field1279) * (var9 - class88.field1267) / (class88.field1277 - class88.field1267));
                int var11 = var6[var7 * 2 + 1] = (class88.field1278 - class88.field1273) * (var8 - class88.field1269) / (class88.field1274 - class88.field1269) + class88.field1273;
                if (class88.field1279 < var10 && var10 < class88.field1270 && class88.field1273 < var11 && class88.field1278 > var11) {
                    var5 = true;
                }
            }
            if (!var5) {
                return;
            }
            class303.method2128(var6, arg2.field5097, arg2.field5097 >>> 24);
            for (int var12 = 0; var12 < var6.length / 2 - 1; var12++) {
                class317.method2288(var6[var12 * 2], var6[var12 * 2 + 1], var6[(var12 + 1) * 2], var6[var12 * 2 + 2 + 1], arg2.field5071, arg2.field5071 >>> 24);
            }
            class317.method2288(var6[var6.length - 2], var6[var6.length - 1], var6[0], var6[1], arg2.field5071, arg2.field5071 >>> 24);
        } else if (arg0.field2380) {
            return;
        }
        if (arg3 != 91) {
            return;
        }
        class239 var13 = null;
        class34 var14 = new class34(arg0);
        if (arg2.field5080 != -1) {
            if (arg0.field2376 && arg2.field5076 != -1) {
                var13 = (class239) arg2.method2176(true, true, -18);
            } else {
                var13 = (class239) arg2.method2176(true, false, -18);
            }
            if (var13 != null) {
                if (class268.field4416 > 0 && (class325.field5326 != -1 && class325.field5326 == arg0.field2378 || class2.field14 != -1 && class2.field14 == arg2.field5095)) {
                    int var15;
                    if (class6.field76 > 50) {
                        var15 = (100 - class6.field76) * 3;
                    } else {
                        var15 = class6.field76 * 3;
                    }
                    class317.method2271(arg0.field2389, arg0.field2379, var13.field2915 / 2 + 7, 16776960, var15);
                    class317.method2271(arg0.field2389, arg0.field2379, var13.field2915 / 2 + 5, 16776960, var15);
                    class317.method2271(arg0.field2389, arg0.field2379, var13.field2915 / 2 + 3, 16776960, var15);
                    class317.method2271(arg0.field2389, arg0.field2379, var13.field2915 / 2 + 1, 16776960, var15);
                    class317.method2271(arg0.field2389, arg0.field2379, var13.field2915 / 2, 16776960, var15);
                }
                var13.method572(arg0.field2389 - (var13.field2915 >> 1), arg0.field2379 - (var13.field2913 >> 1));
                var14.field530 = arg1 + arg0.field2379 - (var13.field2913 >> 1);
                var14.field524 = arg0.field2389 + arg4 - (var13.field2915 >> 1);
                var14.field531 = arg4 - (-(var13.field2915 >> 1) - arg0.field2389);
                var14.field525 = (var13.field2913 >> 1) + arg0.field2379 + arg1;
            }
        }
        if (arg2.field5104 != null) {
            if (var13 == null) {
                class310.method2167(arg2, 0, var14, arg1, true, arg0, arg4, false);
            } else {
                class310.method2167(arg2, (var13.field2913 >> 1) + 5, var14, arg1, false, arg0, arg4, false);
            }
        }
        if (var14.method289(field4988, class130.field1982, -646) && arg2.field5090 != null) {
            if (arg2.field5090[4] != null) {
                class322.method2309(arg2.field5075, arg2.field5095, (short) 1001, false, -1, arg2.field5090[4], 0, (long) arg0.field2378);
            }
            if (arg2.field5090[3] != null) {
                class322.method2309(arg2.field5075, arg2.field5095, (short) 1008, false, -1, arg2.field5090[3], 0, (long) arg0.field2378);
            }
            if (arg2.field5090[2] != null) {
                class322.method2309(arg2.field5075, arg2.field5095, (short) 1005, false, -1, arg2.field5090[2], 0, (long) arg0.field2378);
            }
            if (arg2.field5090[1] != null) {
                class322.method2309(arg2.field5075, arg2.field5095, (short) 1012, false, -1, arg2.field5090[1], 0, (long) arg0.field2378);
            }
            if (arg2.field5090[0] != null) {
                class322.method2309(arg2.field5075, arg2.field5095, (short) 1009, false, -1, arg2.field5090[0], 0, (long) arg0.field2378);
            }
        }
        class65.field957.method1077(arg3 + 16711844, var14);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V", line = 357)
    public static final void method2139(int arg0, int arg1, int arg2) {
        if (arg1 >= -58) {
            method2135(true);
        }
        field4983++;
        class211 var3 = class17.method115(7, arg2, 4086);
        var3.method1433(true);
        var3.field3210 = arg0;
    }
}
