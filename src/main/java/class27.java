import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class27 extends class188 {

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "[J")
    public static long[] field323 = new long[256];

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "[I")
    public static int[] field317 = new int[14];

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "Lgj;")
    public static class257 field327;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "Lkf;")
    public static class249 field326;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "[I")
    public int[] field313;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "[I")
    public int[] field315;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "[I")
    public int[] field325;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "[Lvd;")
    public class153[] field311;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "[Lvd;")
    public class153[] field320;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "[[[B")
    public byte[][][] field324;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([ILo;I[I[I)V", line = 7)
    public static final void method197(int[] arg0, class231 arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = 0;
        if (arg2 != 1) {
            method201(-21, (class22) null, (Object) null);
        }
        while (arg3.length > var5) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg1.field3769.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field3769[var9] = null;
                    } else {
                        class111 var10 = class289.method2067((byte) -92, var6);
                        int var11 = var10.field1542;
                        class69 var12 = arg1.field3769[var9];
                        if (var12 != null) {
                            if (var12.field867 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field3769[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field862 = 0;
                                    var12.field854 = var8;
                                    var12.field855 = 0;
                                    var12.field858 = 0;
                                    var12.field864 = 1;
                                    class313.method2210(var10, 0, 50, arg1.field3763, false, arg1.field3767);
                                } else if (var11 == 2) {
                                    var12.field855 = 0;
                                }
                            } else if (var10.field1521 >= class289.method2067((byte) -123, var12.field867).field1521) {
                                var12 = arg1.field3769[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class69 var13 = arg1.field3769[var9] = new class69();
                            var13.field864 = 1;
                            var13.field855 = 0;
                            var13.field854 = var8;
                            var13.field867 = var6;
                            var13.field858 = 0;
                            var13.field862 = 0;
                            class313.method2210(var10, 0, arg2 ^ 0x33, arg1.field3763, false, arg1.field3767);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
            var5++;
        }
        field318++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V", line = 103)
    public static final void method198(Throwable arg0, byte arg1, String arg2) {
        field321++;
        if (arg1 != 62) {
            field326 = (class249) null;
        }
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class207.method1452(arg0, (byte) -113);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class353.method2442(var3, arg1 ^ 0x3F);
            String var4 = class68.method426(":", arg1 ^ 0xFFFFF121, "%3a", var3);
            String var5 = class68.method426("@", -3809, "%40", var4);
            String var6 = class68.method426("&", -3809, "%26", var5);
            String var7 = class68.method426("#", -3809, "%23", var6);
            if (class5.field54.field254 == null) {
                return;
            }
            class153 var8 = class5.field54.method164(new URL(class5.field54.field254.getCodeBase(), "clienterror.ws?c=" + class24.field287 + "&u=" + class230.field3484 + "&v1=" + class22.field249 + "&v2=" + class22.field248 + "&e=" + var7), 0);
            while (var8.field2419 == 0) {
                class19.method140(1L, arg1 ^ 0xFF003E);
            }
            if (var8.field2419 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2421;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLlf;)V", line = 164)
    public static final void method199(byte arg0, class143 arg1) {
        byte[][] var2 = new byte[class336.field5356][class336.field5350];
        int var3 = -86 / ((arg0 + 17) / 38);
        int var4 = class336.field5348 >> 2 << 10;
        field312++;
        int var5 = class336.field5355 >> 1;
        while (arg1.field2260.length > arg1.field2295) {
            int var6 = 0;
            boolean var7 = false;
            int var8 = 0;
            if (arg1.method1043(true) == 1) {
                var7 = true;
                var6 = arg1.method1043(true);
                var8 = arg1.method1043(true);
            }
            int var9 = arg1.method1043(true);
            int var10 = arg1.method1043(true);
            int var11 = class336.field5354 + class336.field5350 - (var10 * 64) - 1;
            int var12 = var9 * 64 - class336.field5346;
            if (var12 >= 0 && (var11 - 63) >= 0 && var12 + 63 < class336.field5356 && var11 < class336.field5350) {
                for (int var13 = 0; var13 < 64; var13++) {
                    byte[] var14 = var2[var12 + var13];
                    for (int var15 = 0; var15 < 64; var15++) {
                        if (!var7 || (var6 * 8) <= var13 && var13 < var6 * 8 + 8 && var15 >= var8 * 8 && var15 < (var8 * 8 + 8)) {
                            var14[var11 - var15] = arg1.method1028(79030408);
                        }
                    }
                }
            } else if (var7) {
                arg1.field2295 += 64;
            } else {
                arg1.field2295 += 4096;
            }
        }
        int var16 = class336.field5356;
        int var17 = class336.field5350;
        int[] var18 = new int[var17];
        int[] var19 = new int[var17];
        int[] var20 = new int[var17];
        int[] var21 = new int[var17];
        int[] var22 = new int[var17];
        for (int var23 = -5; var23 < var16; var23++) {
            if ((var23 & 0x1FF) == 0) {
                class143.method1025(true, -1);
            }
            for (int var24 = 0; var24 < var17; var24++) {
                int var25 = var23 + 5;
                int var10002;
                if (var25 < var16) {
                    int var26 = var2[var25][var24] & 0xFF;
                    if (var26 > 0) {
                        class199 var27 = class250.method1783((byte) -95, var26 - 1);
                        var18[var24] += var27.field3017;
                        var19[var24] += var27.field3021;
                        var20[var24] += var27.field3022;
                        var21[var24] += var27.field3015;
                        var10002 = var22[var24]++;
                    }
                }
                int var28 = var23 - 5;
                if (var28 >= 0) {
                    int var29 = var2[var28][var24] & 0xFF;
                    if (var29 > 0) {
                        class199 var30 = class250.method1783((byte) -54, var29 - 1);
                        var18[var24] -= var30.field3017;
                        var19[var24] -= var30.field3021;
                        var20[var24] -= var30.field3022;
                        var21[var24] -= var30.field3015;
                        var10002 = var22[var24]--;
                    }
                }
            }
            if (var23 >= 0) {
                int[][] var31 = class336.field5363[var23 >> 6];
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                int var36 = 0;
                for (int var37 = -5; var37 < var17; var37++) {
                    int var38 = var37 - 5;
                    int var39 = var37 + 5;
                    if (var39 < var17) {
                        var35 += var22[var39];
                        var36 += var21[var39];
                        var32 += var19[var39];
                        var34 += var20[var39];
                        var33 += var18[var39];
                    }
                    if (var38 >= 0) {
                        var36 -= var21[var38];
                        var32 -= var19[var38];
                        var35 -= var22[var38];
                        var34 -= var20[var38];
                        var33 -= var18[var38];
                    }
                    if (var37 >= 0 && var35 > 0) {
                        int[] var40 = var31[var37 >> 6];
                        int var41 = var36 == 0 ? 0 : class186.method1284(var33 * 256 / var36, var32 / var35, (byte) 125, var34 / var35);
                        if (var2[var23][var37] != 0) {
                            int var42 = (var41 & 0x7F) + var5;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 > 127) {
                                var42 = 127;
                            }
                            int var43 = (var41 + var4 & 0xFC00) + (var41 & 0x380) + var42;
                            if (var40 == null) {
                                var40 = var31[var37 >> 6] = new int[4096];
                            }
                            var40[class261.method1840(4032, var37 << 6) + class261.method1840(var23, 63)] = class104.field1440[class174.method1213(96, var43, (byte) -5)];
                        } else if (var40 != null) {
                            var40[class261.method1840(var37 << 6, 4032) + class261.method1840(var23, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 391)
    public static void method200(int arg0) {
        field317 = null;
        field323 = null;
        field326 = null;
        if (arg0 > -103) {
            field326 = (class249) null;
        }
        field327 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILrj;Ljava/lang/Object;)V", line = 405)
    public static final void method201(int arg0, class22 arg1, Object arg2) {
        field310++;
        if (arg1.field244 == null) {
            return;
        }
        for (int var3 = arg0; var3 < 50 && arg1.field244.peekEvent() != null; var3++) {
            class19.method140(1L, 16711680);
        }
        if (arg2 != null) {
            arg1.field244.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field323[var0] = var1;
        }
        field327 = new class257();
        field328 = 0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Z", line = 435)
    public static final boolean method202(int arg0, int arg1, int arg2) {
        field319++;
        if (!class38.field437) {
            return false;
        }
        int var3 = arg0 & 0xFFFF;
        int var4 = arg0 >> 16;
        if (class232.field3512[var4] == null || class232.field3512[var4][var3] == null) {
            return false;
        }
        class323 var5 = class232.field3512[var4][var3];
        if (arg1 == -1 && var5.field5107 == 0) {
            for (int var6 = 0; var6 < class74.field924; var6++) {
                if (class105.field1442[var6] == 32 || class105.field1442[var6] == 1006 || class105.field1442[var6] == 11 || class105.field1442[var6] == 29 || class105.field1442[var6] == 45) {
                    for (class323 var7 = class45.method277(arg2 - 6855, class125.field1771[var6]); var7 != null; var7 = class76.method490(1898551440, var7)) {
                        if (var5.field5073 == var7.field5073) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class74.field924; var8++) {
                if (class296.field4669[var8] == arg1 && class125.field1771[var8] == var5.field5073 && (class105.field1442[var8] == 32 || class105.field1442[var8] == 1006 || class105.field1442[var8] == 11 || class105.field1442[var8] == 29 || class105.field1442[var8] == 45)) {
                    return true;
                }
            }
        }
        if (arg2 != -6011) {
            method197((int[]) null, (class231) null, -40, (int[]) null, (int[]) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V", line = 502)
    public static final void method203(boolean arg0, int arg1) {
        class274.field4342 = arg1;
        class19.method144((byte) -101, 3);
        field316++;
        class19.method144((byte) 124, 4);
        if (arg0) {
            field323 = (long[]) null;
        }
    }
}
