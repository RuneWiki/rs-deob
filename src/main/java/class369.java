import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class369 {

    @OriginalMember(owner = "client!og", name = "h", descriptor = "B")
    public byte field5326 = 0;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "B")
    public byte field5328;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "B")
    public byte field5352;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "S")
    public short field5348;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "S")
    public short field5340;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "[I")
    public static int[] field5331 = new int[25];

    @OriginalMember(owner = "client!og", name = "o", descriptor = "B")
    public byte field5333;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "B")
    public byte field5336;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "B")
    public byte field5342;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "B")
    public byte field5343;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "Lrr;")
    public class206 field5345;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lds;")
    public class233 field5327;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "Lds;")
    public class233 field5334;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "Lcl;")
    public class323 field5346;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "Log;")
    public class369 field5351;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "Lci;")
    public class400 field5339;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Lik;")
    public class422 field5332;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "Lik;")
    public class422 field5335;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "Lhl;")
    public class63 field5341;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "S")
    public short field5344;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Z")
    public boolean field5330;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "Z")
    public boolean field5338;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "Z")
    public boolean field5350;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "[Lae;")
    public static class285[] field5353;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public static final void method2341(boolean arg0) {
        field5324++;
        class363 var1 = class160.field2146;
        synchronized (class160.field2146) {
            class160.field2146.method2313(95);
            if (arg0) {
                field5320 = 24;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLrc;Lfp;)I")
    public static final int method2342(boolean arg0, class103 arg1, class9 arg2) {
        field5322++;
        if (arg0) {
            return -6;
        } else if (arg1.field1326 == -1) {
            if (arg1.field1329 != -1) {
                class17 var3 = class259.field3819.method468((byte) -37, arg2.method109() ? arg1.field1329 : arg1.field1333);
                if (!var3.field260) {
                    return var3.field259;
                }
            }
            return arg1.field1338;
        } else {
            return arg1.field1326;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method2343(byte arg0) {
        field5353 = null;
        field5331 = null;
        if (arg0 != -46) {
            field5320 = 116;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Leg;ILqm;Lfp;ILtd;II)V")
    public static final void method2344(class376 arg0, int arg1, class297 arg2, class9 arg3, int arg4, class110 arg5, int arg6, int arg7) {
        if (arg7 != -10) {
            method2345(25, 55, false, false, 95, -94, -25);
        }
        field5319++;
        int var8 = arg0.field5488 - (arg1 / 2) - 5;
        int var9 = arg4 + 2;
        if (arg5.field1516 != 0) {
            arg3.method150(-90, var9, var8, arg2.method1975() * arg6 + (arg4 - var9) + 1, arg5.field1516, arg1 + 10);
        }
        if (arg5.field1519 != 0) {
            arg3.method88(arg2.method1975() * arg6 + arg4 + 1 - var9, var8, arg5.field1519, arg1 + 10, var9, arg7 ^ 0x42);
        }
        int var10 = arg5.field1525;
        if (arg0.field5486 && arg5.field1527 != -1) {
            var10 = arg5.field1527;
        }
        for (int var11 = 0; var11 < arg6; var11++) {
            String var12 = class419.field6078[var11];
            if (var11 < arg6 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg2.method1974(arg3, var12, arg0.field5488, arg4, var10, true);
            arg4 += arg2.method1975();
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZZIII)V")
    public static final void method2345(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class86.field1064 = arg4;
        class417.field6030 = arg6;
        class2.field27 = arg0;
        class296.field4322 = arg1;
        field5347++;
        class385.field5638 = arg5;
        if (arg2 && class417.field6030 >= 100) {
            class345.field5077 = class86.field1064 * 128 + 64;
            class298.field4343 = class2.field27 * 128 + 64;
            class164.field2171 = class133.method889(class423.field6117, class298.field4343, class345.field5077, false) - class385.field5638;
        }
        class28.field402 = 2;
        if (arg3) {
            field5331 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III)V")
    public class369(int arg0, int arg1, int arg2) {
        this.field5352 = this.field5328 = (byte) arg0;
        this.field5348 = (short) arg1;
        this.field5340 = (short) arg2;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)I")
    public static final int method2346(int arg0) {
        field5323++;
        if (class22.field317) {
            return 0;
        }
        if (arg0 != 0) {
            field5349 = -92;
        }
        if (class163.method1082((byte) 95)) {
            return class323.field4773 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public static final void method2347(byte arg0) {
        field5325++;
        if (class74.field942 != null) {
            class456.field6749.method2021(-16777216);
            class359.method2285();
            class83.method554(-127);
            class99.method655(114);
            class157.method1061((byte) -118);
            class400.method2500(arg0 - 214);
            if (class187.field2613 != null) {
                class187.field2613.method2194(64);
            }
            class186.method1276((byte) -78);
            class446.method2748(-109);
            class52.method404(true);
            class188.method1285((byte) 127, false);
            class13.method204((byte) -104);
            for (int var1 = 0; var1 < 2048; var1++) {
                class380 var5 = class455.field6731[var1];
                if (var5 != null) {
                    var5.field787 = null;
                    for (int var6 = 0; var6 < var5.field792.length; var6++) {
                        var5.field792[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class364.field5260.length; var2++) {
                class26 var3 = class364.field5260[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field792.length; var4++) {
                        var3.field792[var4] = null;
                    }
                }
            }
            class74.field942.method136(65);
            class74.field942 = null;
        }
        if (arg0 != 125) {
            method2342(true, (class103) null, (class9) null);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II[Ljava/lang/String;[SI)V")
    public static final void method2348(int arg0, int arg1, String[] arg2, short[] arg3, int arg4) {
        if (arg4 != 2) {
            method2342(true, (class103) null, (class9) null);
        }
        field5337++;
        if (arg1 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg1;
        String var7 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var7;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var8;
        for (int var9 = arg1; var9 < arg0; var9++) {
            if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg2[arg0] = arg2[var6];
        arg2[var6] = var7;
        arg3[arg0] = arg3[var6];
        arg3[var6] = var8;
        method2348(var6 - 1, arg1, arg2, arg3, 2);
        method2348(arg0, var6 + 1, arg2, arg3, 2);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(JZ)V")
    public static final void method2349(long arg0, boolean arg1) {
        field5321++;
        int var3 = class402.field5806 + class187.field2619.field4954;
        if (!arg1) {
            return;
        }
        int var4 = class119.field1596 + class187.field2619.field4951;
        if (class108.field1463 - var3 < -500 || (class108.field1463 - var3) > 500 || (class171.field2236 - var4) < -500 || class171.field2236 - var4 > 500) {
            class171.field2236 = var4;
            class108.field1463 = var3;
        }
        if (class108.field1463 != var3) {
            int var5 = var3 - class108.field1463;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class108.field1463 += var6;
        }
        if (class171.field2236 != var4) {
            int var7 = var4 - class171.field2236;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class171.field2236 += var8;
        }
        if (!class400.field5790) {
            class1.field19 += (float) arg0 * class164.field2166 / 6.0F;
            class170.field2220 += (float) arg0 * class299.field4361 / 6.0F;
        }
        class129.method862(arg1);
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
    public final void method2350(byte arg0) {
        while (this.field5345 != null) {
            class206 var2 = this.field5345.field2882;
            this.field5345.method1417(-30226);
            this.field5345 = var2;
        }
        field5329++;
        this.field5326 = arg0;
    }
}
