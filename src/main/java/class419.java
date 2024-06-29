import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class419 extends class398 {

    @OriginalMember(owner = "client!lo", name = "S", descriptor = "Ljava/lang/String;")
    public static String field6206 = "wave2:";

    @OriginalMember(owner = "client!lo", name = "R", descriptor = "Lke;")
    public static class162 field6205 = new class162();

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!lo", name = "P", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!lo", name = "Q", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!lo", name = "T", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!lo", name = "U", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "Llm;")
    public static class347 field6198;

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "[[B")
    public static byte[][] field6200;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(FIIIIZII)[I", line = 6)
    public static final int[] method2679(float arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        ++field6199;
        int[] var8 = new int[arg4];
        class385 var9 = new class385();
        var9.field5579 = (int) (arg0 * 4096.0F);
        var9.field5573 = arg1;
        if (arg3 != -1) {
            return null;
        } else {
            var9.field5582 = arg7;
            var9.field5569 = arg2;
            var9.field5576 = arg6;
            var9.field5584 = arg5;
            var9.method209(16);
            class226.method1308((byte) -35, arg4, 1);
            var9.method2480(255, var8, 0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIIILba;III)Z", line = 32)
    public static final boolean method2680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class270 arg7, int arg8, int arg9, int arg10) {
        ++field6201;
        int var11 = arg8;
        int var12 = arg6;
        byte var13 = 64;
        if (arg4 >= -73) {
            return true;
        } else {
            byte var14 = 64;
            int var15 = -var13 + arg8;
            class264.field3830[var13][var14] = 99;
            int var16 = -var14 + arg6;
            class100.field1404[var13][var14] = 0;
            byte var17 = 0;
            int var18 = 0;
            class295.field4231[var17] = arg8;
            byte var10001 = var17;
            int var26 = var17 + 1;
            class173.field2306[var10001] = arg6;
            int[][] var19 = arg7.field3914;
            while (~var26 != ~var18) {
                var12 = class173.field2306[var18];
                var11 = class295.field4231[var18];
                var18 = var18 + 1 & 4095;
                int var20 = -var15 + var11;
                int var21 = -var16 + var12;
                int var22 = -arg7.field3908 + var11;
                int var23 = -arg7.field3915 + var12;
                if (~arg0 != 3) {
                    if (arg0 != -3) {
                        if (~arg0 != 1) {
                            if (arg0 != -1) {
                                if (arg0 != 0 && ~arg0 != -2 && ~arg0 != -3 && arg0 != 3 && ~arg0 != -10) {
                                    if (arg7.method1848(var12, 2, arg9, arg5, var11, arg3, -13282, arg0)) {
                                        class148.field2036 = var11;
                                        class253.field3499 = var12;
                                        return true;
                                    }
                                } else if (arg7.method1859(arg5, arg0, false, arg9, 2, arg3, var11, var12)) {
                                    class148.field2036 = var11;
                                    class253.field3499 = var12;
                                    return true;
                                }
                            } else if (arg7.method1856(arg1, 2, var11, var12, (byte) 57, arg2, arg3, arg5, arg10)) {
                                class253.field3499 = var12;
                                class148.field2036 = var11;
                                return true;
                            }
                        } else if (arg7.method1842(2, arg10, arg1, arg5, 13406, arg3, 2, var11, var12, arg2)) {
                            class148.field2036 = var11;
                            class253.field3499 = var12;
                            return true;
                        }
                    } else if (class369.method2396(arg3, arg5, arg10, var11, 2, -10954, 2, arg2, var12)) {
                        class253.field3499 = var12;
                        class148.field2036 = var11;
                        return true;
                    }
                } else if (arg3 == var11 && ~arg5 == ~var12) {
                    class148.field2036 = var11;
                    class253.field3499 = var12;
                    return true;
                }
                int var25 = class100.field1404[var20][var21] - -1;
                if (~var20 < -1 && class264.field3830[var20 + -1][var21] == 0 && (1134821376 & var19[var22 + -1][var23]) == 0 && ~(var19[var22 + -1][var23 - -1] & 1310982144) == -1) {
                    class295.field4231[var26] = var11 - 1;
                    class173.field2306[var26] = var12;
                    class264.field3830[var20 + -1][var21] = 2;
                    var26 = 4095 & var26 + 1;
                    class100.field1404[var20 + -1][var21] = var25;
                }
                if (~var20 > -127 && ~class264.field3830[var20 + 1][var21] == -1 && (1625554944 & var19[var22 + 2][var23]) == 0 && (var19[var22 + 2][var23 - -1] & 2015625216) == 0) {
                    class295.field4231[var26] = var11 + 1;
                    class173.field2306[var26] = var12;
                    var26 = 4095 & var26 + 1;
                    class264.field3830[var20 - -1][var21] = 8;
                    class100.field1404[var20 + 1][var21] = var25;
                }
                if (~var21 < -1 && ~class264.field3830[var20][var21 + -1] == -1 && ~(var19[var22][var23 + -1] & 1134821376) == -1 && ~(1625554944 & var19[var22 - -1][var23 + -1]) == -1) {
                    class295.field4231[var26] = var11;
                    class173.field2306[var26] = var12 + -1;
                    class264.field3830[var20][var21 + -1] = 1;
                    var26 = var26 + 1 & 4095;
                    class100.field1404[var20][var21 + -1] = var25;
                }
                if (~var21 > -127 && class264.field3830[var20][var21 + 1] == 0 && (1310982144 & var19[var22][var23 + 2]) == 0 && ~(2015625216 & var19[var22 + 1][var23 - -2]) == -1) {
                    class295.field4231[var26] = var11;
                    class173.field2306[var26] = var12 - -1;
                    var26 = 4095 & var26 + 1;
                    class264.field3830[var20][var21 + 1] = 4;
                    class100.field1404[var20][var21 + 1] = var25;
                }
                if (~var20 < -1 && var21 > 0 && class264.field3830[var20 + -1][var21 + -1] == 0 && (var19[var22 - 1][var23] & 1336147968) == 0 && (1134821376 & var19[var22 - 1][var23 + -1]) == 0 && (var19[var22][var23 - 1] & 1675886592) == 0) {
                    class295.field4231[var26] = var11 + -1;
                    class173.field2306[var26] = var12 - 1;
                    class264.field3830[var20 + -1][var21 + -1] = 3;
                    var26 = 4095 & var26 + 1;
                    class100.field1404[var20 + -1][var21 + -1] = var25;
                }
                if (~var20 > -127 && ~var21 < -1 && class264.field3830[var20 + 1][var21 + -1] == 0 && ~(1675886592 & var19[var22 - -1][var23 + -1]) == -1 && (var19[var22 + 2][var23 + -1] & 1625554944) == 0 && ~(2028208128 & var19[var22 + 2][var23]) == -1) {
                    class295.field4231[var26] = var11 + 1;
                    class173.field2306[var26] = var12 + -1;
                    var26 = 4095 & var26 + 1;
                    class264.field3830[var20 + 1][var21 + -1] = 9;
                    class100.field1404[var20 + 1][var21 + -1] = var25;
                }
                if (var20 > 0 && var21 < 126 && ~class264.field3830[var20 + -1][var21 - -1] == -1 && (1336147968 & var19[var22 + -1][var23 + 1]) == 0 && ~(1310982144 & var19[var22 + -1][var23 + 2]) == -1 && ~(var19[var22][var23 + 2] & 2116288512) == -1) {
                    class295.field4231[var26] = var11 + -1;
                    class173.field2306[var26] = var12 + 1;
                    var26 = var26 + 1 & 4095;
                    class264.field3830[var20 - 1][var21 - -1] = 6;
                    class100.field1404[var20 - 1][var21 + 1] = var25;
                }
                if (~var20 > -127 && ~var21 > -127 && ~class264.field3830[var20 + 1][var21 + 1] == -1 && (2116288512 & var19[var22 + 1][var23 + 2]) == 0 && (2015625216 & var19[var22 - -2][var23 + 2]) == 0 && ~(2028208128 & var19[var22 + 2][var23 + 1]) == -1) {
                    class295.field4231[var26] = var11 + 1;
                    class173.field2306[var26] = var12 + 1;
                    class264.field3830[var20 + 1][var21 + 1] = 12;
                    var26 = var26 + 1 & 4095;
                    class100.field1404[var20 + 1][var21 - -1] = var25;
                }
            }
            class148.field2036 = var11;
            class253.field3499 = var12;
            return false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(I)V", line = 386)
    public static void method2681(int arg0) {
        field6205 = null;
        field6206 = null;
        field6198 = null;
        field6200 = null;
        if (arg0 != 22273) {
            field6206 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V", line = 400)
    public static final void method2682(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 == -1) {
            ++field6202;
            class263 var5 = class47.method337(4, 0, arg3);
            var5.method1807((byte) -125);
            var5.field3809 = arg0;
            var5.field3813 = arg4;
            var5.field3820 = arg1;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZIIIZIII)V", line = 417)
    public static final void method2683(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field6208;
        if (arg0 || class179.field2373 != arg1 || ~class220.field2905 != ~arg3 || class200.field2661 != arg2 && !class11.method79((byte) -128)) {
            class179.field2373 = arg1;
            class200.field2661 = arg2;
            class220.field2905 = arg3;
            if (class11.method79((byte) 127)) {
                class200.field2661 = 0;
            }
            if (arg4) {
                class232.method1391(-26, 28);
            } else {
                class232.method1391(-26, 25);
            }
            class89.method629(0, true, class372.field5413, class393.field5626);
            int var8 = class7.field138;
            class7.field138 = (class179.field2373 - (class192.field2574 >> 4)) * 8;
            int var9 = class200.field2660;
            class200.field2660 = (-(class364.field5262 >> 4) + class220.field2905) * 8;
            class62.field815 = class293.method2000(class179.field2373 * 8, class220.field2905 * 8);
            class181.field2398 = null;
            int var10 = -var8 + class7.field138;
            int var11 = -var9 + class200.field2660;
            if (!arg4) {
                for (int var12 = 0; var12 < 32768; ++var12) {
                    class43 var13 = class306.field4496[var12];
                    if (var13 != null) {
                        for (int var14 = 0; var14 < 10; ++var14) {
                            var13.field4360[var14] -= var10;
                            var13.field4362[var14] -= var11;
                        }
                        var13.field734 -= var11 * 128;
                        var13.field740 -= var10 * 128;
                    }
                }
            } else {
                class198.field2637 = 0;
                int var15 = class192.field2574 * 128 + -128;
                int var16 = (class364.field5262 + -1) * 128;
                for (int var17 = 0; var17 < 32768; ++var17) {
                    class43 var22 = class306.field4496[var17];
                    if (var22 != null) {
                        var22.field740 -= var10 * 128;
                        var22.field734 -= var11 * 128;
                        if (~var22.field740 <= -1 && ~var15 <= ~var22.field740 && var22.field734 >= 0 && ~var16 <= ~var22.field734) {
                            boolean var23 = true;
                            for (int var24 = 0; var24 < 10; ++var24) {
                                var22.field4360[var24] -= var10;
                                var22.field4362[var24] -= var11;
                                if (~var22.field4360[var24] > -1 || var22.field4360[var24] >= class192.field2574 || ~var22.field4362[var24] > -1 || var22.field4362[var24] >= class364.field5262) {
                                    var23 = false;
                                }
                            }
                            if (var23) {
                                class398.field5938[class198.field2637++] = var17;
                            } else {
                                class306.field4496[var17].method306(0, (class249) null);
                                class306.field4496[var17] = null;
                            }
                        } else {
                            class306.field4496[var17].method306(0, (class249) null);
                            class306.field4496[var17] = null;
                        }
                    }
                }
            }
            for (int var18 = 0; ~var18 > -2049; ++var18) {
                class25 var20 = class206.field2777[var18];
                if (var20 != null) {
                    for (int var21 = 0; ~var21 > -11; ++var21) {
                        var20.field4360[var21] -= var10;
                        var20.field4362[var21] -= var11;
                    }
                    var20.field740 -= var10 * 128;
                    var20.field734 -= var11 * 128;
                }
            }
            class227.field2981 = arg2;
            class227.field2988.method165(arg6, class227.field2981, false, arg5, false);
            class398.method2560(var10, var11, (byte) 59);
            class306 var19 = (class306) class198.field2639.method332(-2130841184);
            if (arg7 != 128) {
                field6197 = 40;
            }
            while (var19 != null) {
                var19.field4492 -= var10;
                var19.field4503 -= var11;
                if (~var19.field4492 > -1 || var19.field4503 < 0 || class192.field2574 <= var19.field4492 || ~class364.field5262 >= ~var19.field4503) {
                    var19.method322(11);
                }
                var19 = (class306) class198.field2639.method343((byte) -86);
            }
            class321.field4730 = 0;
            if (class59.field792 != 0) {
                class376.field5470 -= var11;
                class59.field792 -= var10;
            }
            if (arg4) {
                class115.field1605 -= var11;
                class166.field2237 -= var11;
                class97.field1361 -= var10;
                class411.field6071 -= var10;
                class400.field5971 -= var10 * 128;
                class179.field2371 -= var11 * 128;
                if (~Math.abs(var10) < ~class192.field2574 || ~Math.abs(var11) < ~class364.field5262) {
                    class245.method1484((byte) 64);
                }
            } else if (~class346.field4979 == -5) {
                class153.field2071 -= var10 * 128;
                class122.field1687 -= var11 * 128;
                class144.field1962 -= var11 * 128;
                class363.field5238 -= var10 * 128;
            } else {
                class346.field4979 = 1;
            }
            class71.method520(125);
            class431.method2731(-1);
            class43.field609.method335((byte) 72);
            class178.field2366.method335((byte) -122);
            field6205.method998((byte) 120);
            class400.method2577((byte) -119);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)[I", line = 632)
    public final int[] method95(int arg0, int arg1) {
        ++field6203;
        if (arg1 != 0) {
            field6206 = null;
        }
        int[] var3 = super.field5927.method305(arg0, (byte) 119);
        if (super.field5927.field591) {
            class60.method420(var3, 0, class140.field1922, class84.field1206[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V", line = 656)
    public class419() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)V", line = 659)
    public static final void method2684(int arg0) {
        if (~class349.field5060 != -1) {
            class447.field6558 -= class349.field5060 * 5;
            class349.field5060 = 0;
            if (class447.field6558 < class124.field1724) {
                if (~class447.field6558 > -1) {
                    class447.field6558 = 0;
                }
            } else {
                class447.field6558 = class124.field1724 + -1;
            }
        }
        ++field6204;
        if (~class173.field2313 > -103) {
            class173.field2313 += 6;
        }
        int var1 = -28 % ((48 - arg0) / 53);
        for (int var2 = 0; ~class254.field3526 < ~var2; ++var2) {
            int var3 = class192.field2575[var2];
            char var4 = (char) class369.field5332[var2];
            if (~var3 == -85) {
                class407.method2622((byte) -117);
            } else if (class30.field437[82] && ~var3 == -67) {
                if (class30.field434 != null) {
                    String var5 = "";
                    for (int var6 = class65.field859.length + -1; var6 >= 0; --var6) {
                        if (class65.field859[var6] != null && class65.field859[var6].length() > 0) {
                            var5 = var5 + class65.field859[var6] + '\n';
                        }
                    }
                    class30.field434.setContents(new StringSelection(var5), (ClipboardOwner) null);
                }
            } else if (class30.field437[82] && var3 == 67) {
                if (class30.field434 != null) {
                    Transferable var7 = class30.field434.getContents((Object) null);
                    if (var7 != null) {
                        try {
                            String var8 = (String) var7.getTransferData(DataFlavor.stringFlavor);
                            if (var8 != null) {
                                String[] var9 = class243.method1459(var8, '\n', 0);
                                if (var9.length <= 1) {
                                    class276.field4000 = class276.field4000 + var8;
                                } else {
                                    for (int var10 = 0; ~var9.length < ~var10; ++var10) {
                                        class276.field4000 = var9[var10];
                                        class407.method2622((byte) -117);
                                    }
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class368.field5320 > 0) {
                class276.field4000 = class276.field4000.substring(0, class368.field5320 + -1) + class276.field4000.substring(class368.field5320);
                --class368.field5320;
            } else if (var3 == 101 && class368.field5320 < class276.field4000.length()) {
                class276.field4000 = class276.field4000.substring(0, class368.field5320) + class276.field4000.substring(class368.field5320 + 1);
            } else if (~var3 == -97 && ~class368.field5320 < -1) {
                --class368.field5320;
            } else if (~var3 == -98 && ~class368.field5320 > ~class276.field4000.length()) {
                ++class368.field5320;
            } else if (var3 == 102) {
                class368.field5320 = 0;
            } else if (var3 == 103) {
                class368.field5320 = class276.field4000.length();
            } else if (~var3 == -105 && ~class296.field4244 > ~class65.field859.length) {
                ++class296.field4244;
                class388.method2493(-2);
                class368.field5320 = class276.field4000.length();
            } else if (~var3 == -106 && class296.field4244 > 0) {
                --class296.field4244;
                class388.method2493(-2);
                class368.field5320 = class276.field4000.length();
            } else if (class28.method194(var4, -49) || var4 == ':' || ~var4 == -45 || ~var4 == -33 || ~var4 == -96 || var4 == '-' || var4 == '+') {
                class276.field4000 = class276.field4000.substring(0, class368.field5320) + (char) class369.field5332[var2] + class276.field4000.substring(class368.field5320);
                ++class368.field5320;
            }
        }
        class254.field3526 = 0;
        for (int var11 = 0; ~var11 > -101; ++var11) {
            int var10002;
            if (class12.field197[var11]) {
                var10002 = class120.field1672[var11]++;
                if (~class120.field1672[var11] < -103) {
                    class12.field197[var11] = false;
                }
            } else {
                var10002 = class120.field1672[var11]--;
                if (class120.field1672[var11] < 0) {
                    class394.field5660[var11] = (int) ((double) class138.field1907 * Math.random());
                    class169.field2271[var11] = (int) (350.0D * Math.random());
                    class120.field1672[var11] = 0;
                    class12.field197[var11] = true;
                }
            }
        }
        class145.method927(0);
    }
}
