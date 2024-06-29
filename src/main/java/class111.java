import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class111 extends class274 implements class285 {

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "B")
    private byte field1374;

    @OriginalMember(owner = "client!pg", name = "eb", descriptor = "S")
    private short field1392;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "Z")
    private boolean field1381;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "Z")
    private boolean field1380;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "B")
    private byte field1376;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "B")
    private byte field1365;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "Z")
    private boolean field1364;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "Ljn;")
    private class396 field1375;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "Lve;")
    private class307 field1379;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
    public static int field1387 = 1;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "Ljp;")
    public static class402 field1385;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "[Llg;")
    public static class20[] field1371;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lvm;II)Ljn;", line = 3)
    public final class396 method349(class322 arg0, int arg1, int arg2) {
        if (arg1 != -24206) {
            this.method351((byte) 88);
        }
        ++field1386;
        return this.method591(arg2, arg0, false);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V", line = 14)
    public final void method350(byte arg0) {
        if (this.field1375 != null) {
            this.field1375.method2308();
        }
        ++field1388;
        if (arg0 < 114) {
            this.field1376 = 41;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lvm;I)V", line = 29)
    public final void method352(class322 arg0, int arg1) {
        if (arg1 == 0) {
            ++field1370;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIILhs;)V", line = 53)
    public static final void method587(int arg0, int arg1, int arg2, int arg3, class420 arg4) {
        arg4.field6126 = (arg1 << 7) + 64;
        arg4.field6127 = arg3;
        arg4.field6132 = (arg2 << 7) + 64;
        class96 var5 = class176.field2209[arg0][arg1][arg2];
        if (var5 != null) {
            int var6 = 0;
            for (class122 var7 = var5.field1130; var7 != null; var7 = var7.field1511) {
                if (var7.field1505.field156) {
                    int var8 = var7.field1505.method76(20765);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field6127 += var6;
                arg4.field6133 = true;
            }
        }
        if (class176.field2209[arg0][arg1][arg2] == null) {
            class307.method1807(arg0, arg1, arg2);
        }
        class176.field2209[arg0][arg1][arg2].field1124 = arg4;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)I", line = 94)
    public final int method588(boolean arg0) {
        ++field1378;
        if (arg0) {
            this.field1381 = true;
        }
        return this.field1375 != null ? this.field1375.method2299() : 0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZLvm;)V", line = 105)
    public final void method357(boolean arg0, class322 arg1) {
        if (arg0) {
            this.field1375 = null;
        }
        ++field1367;
        Object var3 = null;
        class307 var5;
        if (this.field1379 == null && this.field1364) {
            class56 var4 = this.method593(131072, true, arg1, 3);
            var5 = var4 == null ? null : var4.field569;
        } else {
            var5 = this.field1379;
            this.field1379 = null;
        }
        if (var5 != null) {
            class434.method2681(var5, this.field1365, super.field3688, super.field3703, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLvm;)V", line = 134)
    public final void method347(byte arg0, class322 arg1) {
        ++field1390;
        if (arg0 == -108) {
            Object var3 = null;
            class307 var5;
            if (this.field1379 == null && this.field1364) {
                class56 var4 = this.method593(131072, true, arg1, 3);
                var5 = var4 != null ? var4.field569 : null;
            } else {
                var5 = this.field1379;
                this.field1379 = null;
            }
            if (var5 != null) {
                class307.method1803(var5, this.field1365, super.field3688, super.field3703, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)I", line = 163)
    public final int method351(byte arg0) {
        if (arg0 != 103) {
            this.field1364 = true;
        }
        ++field1366;
        return this.field1374;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)Z", line = 174)
    public final boolean method358(byte arg0) {
        ++field1384;
        if (arg0 != 24) {
            field1371 = null;
        }
        return this.field1364;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lvm;Lds;IIIIZIIIII)V", line = 188)
    public class111(class322 arg0, class225 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class233.method1259(arg10, arg11, 57));
        this.field1374 = (byte) arg11;
        this.field1392 = (short) arg1.field3051;
        this.field1381 = arg6;
        this.field1380 = ~arg1.field3027 != -1;
        this.field1376 = (byte) arg10;
        this.field1365 = (byte) arg2;
        super.field3688 = (short) arg3;
        super.field3703 = (short) arg5;
        this.field1364 = arg0.method1585() && arg1.field3056 && !this.field1381 && class169.field2133 != 0;
        class56 var13 = this.method593(1024, this.field1364, arg0, 3);
        if (var13 != null) {
            this.field1375 = var13.field567;
            this.field1379 = var13.field569;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)I", line = 213)
    public final int method356(int arg0) {
        if (arg0 != 10397) {
            method590((class17) null, true);
        }
        ++field1369;
        return 65535 & this.field1392;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V", line = 227)
    public static final void method589(int arg0) {
        if (class47.field472 < 102) {
            class47.field472 += 6;
        }
        ++field1373;
        for (int var1 = 0; ~class428.field6289 < ~var1; ++var1) {
            int var2 = class314.field4208[var1];
            char var3 = (char) class5.field39[var1];
            if (~var2 == -85) {
                class405.method2535((byte) -32);
            } else if (class249.field3361[82] && var2 == 66) {
                if (class106.field1310 != null) {
                    String var4 = "";
                    for (int var5 = class330.field4403.length - 1; var5 >= 0; --var5) {
                        if (class330.field4403[var5] != null && class330.field4403[var5].length() > 0) {
                            var4 = var4 + class330.field4403[var5] + '\n';
                        }
                    }
                    class106.field1310.setContents(new StringSelection(var4), (ClipboardOwner) null);
                }
            } else if (class249.field3361[82] && ~var2 == -68) {
                if (class106.field1310 != null) {
                    Transferable var6 = class106.field1310.getContents((Object) null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class167.method889(-104, var7, '\n');
                                if (var8.length <= 1) {
                                    class334.field4437 = class334.field4437 + var7;
                                } else {
                                    for (int var9 = 0; var9 < var8.length; ++var9) {
                                        class334.field4437 = var8[var9];
                                        class405.method2535((byte) -32);
                                    }
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (~var2 == -86 && ~class334.field4437.length() < -1) {
                class334.field4437 = class334.field4437.substring(0, class334.field4437.length() - 1);
            } else if (~var2 == -105 && ~class89.field1005 > ~class330.field4403.length) {
                ++class89.field1005;
                class390.method2429((byte) 17);
            } else if (~var2 == -106 && ~class89.field1005 < -1) {
                --class89.field1005;
                class390.method2429((byte) 17);
            } else if (class97.method532(-19611, var3) || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || ~var3 == -44) {
                class334.field4437 = class334.field4437 + (char) class5.field39[var1];
            }
        }
        class428.field6289 = 0;
        int var10 = 56 % ((-16 - arg0) / 41);
        for (int var11 = 0; var11 < 100; ++var11) {
            int var10002;
            if (class317.field4225[var11]) {
                var10002 = class327.field4345[var11]++;
                if (~class327.field4345[var11] < -103) {
                    class317.field4225[var11] = false;
                }
            } else {
                var10002 = class327.field4345[var11]--;
                if (class327.field4345[var11] < 0) {
                    class129.field1660[var11] = (int) ((double) class333.field4423 * Math.random());
                    class317.field4226[var11] = (int) (350.0D * Math.random());
                    class327.field4345[var11] = 0;
                    class317.field4225[var11] = true;
                }
            }
        }
        class84.method458((byte) -105);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)I", line = 377)
    public final int method339(int arg0) {
        int var2 = -43 / ((arg0 - 19) / 32);
        ++field1391;
        return this.field1376;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lhd;Z)Z", line = 389)
    public static final boolean method590(class17 arg0, boolean arg1) {
        boolean var2 = class98.field1161 == class275.field3707;
        int var3 = 0;
        arg0.method75(82);
        if (arg0.field168 >= 0 && arg0.field159 >= 0 && arg0.field158 < class231.field3184 && arg0.field153 < class209.field2840) {
            for (int var4 = arg0.field168; var4 <= arg0.field158; ++var4) {
                for (int var7 = arg0.field159; var7 <= arg0.field153; ++var7) {
                    int var8 = 0;
                    if (var4 > arg0.field168) {
                        ++var8;
                    }
                    if (var4 < arg0.field158) {
                        var8 += 4;
                    }
                    if (var7 > arg0.field159) {
                        var8 += 8;
                    }
                    if (var7 < arg0.field153) {
                        var8 += 2;
                    }
                    class307.method1807(arg0.field161, var4, var7);
                    class96 var9 = class176.field2209[arg0.field161][var4][var7];
                    class122 var10 = class84.method457(var8, 0, arg0);
                    class122 var11 = var9.field1130;
                    if (var11 == null) {
                        var9.field1130 = var10;
                    } else {
                        while (var11.field1511 != null) {
                            var11 = var11.field1511;
                        }
                        var11.field1511 = var10;
                    }
                    var9.field1133 = (byte) (var9.field1133 | var8);
                    if (var2 && class116.field1450[var4][var7] != 0) {
                        var3 = class116.field1450[var4][var7];
                    }
                }
            }
            if (var2 && var3 != 0) {
                for (int var5 = arg0.field168; var5 <= arg0.field158; ++var5) {
                    for (int var6 = arg0.field159; var6 <= arg0.field153; ++var6) {
                        if (class116.field1450[var5][var6] == 0) {
                            class116.field1450[var5][var6] = var3;
                        }
                    }
                }
            }
            if (arg1) {
                class420.field6141[class10.field89++] = arg0;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILvm;Z)Ljn;", line = 476)
    private final class396 method591(int arg0, class322 arg1, boolean arg2) {
        ++field1389;
        if (this.field1375 != null && arg1.method1620(this.field1375.method2312(), arg0) == 0) {
            return this.field1375;
        } else {
            class56 var4 = this.method593(arg0, arg2, arg1, 3);
            return var4 == null ? null : var4.field567;
        }
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V", line = 494)
    public static void method592(int arg0) {
        field1371 = null;
        field1385 = null;
        if (arg0 != -106) {
            field1387 = -2;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZLvm;I)Lf;", line = 509)
    private final class56 method593(int arg0, boolean arg1, class322 arg2, int arg3) {
        ++field1368;
        if (arg3 != 3) {
            return null;
        } else {
            class225 var5 = class281.method1655((byte) -28, 65535 & this.field1392);
            class54 var6;
            class54 var7;
            if (!this.field1381) {
                var6 = class272.field3682[this.field1365];
                if (this.field1365 >= 3) {
                    var7 = null;
                } else {
                    var7 = class272.field3682[this.field1365 + 1];
                }
            } else {
                var6 = class275.field3707[this.field1365];
                var7 = class272.field3682[0];
            }
            return var5.method1214(arg1, var6, super.field3702, var7, arg0, super.field3688, true, this.field1376, arg2, this.field1374, super.field3703);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([I[JIZI)V", line = 542)
    public static final void method594(int[] arg0, long[] arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            if (~arg4 < ~arg2) {
                int var5 = (arg2 + arg4) / 2;
                int var6 = arg2;
                long var7 = arg1[var5];
                arg1[var5] = arg1[arg4];
                arg1[arg4] = var7;
                int var9 = arg0[var5];
                arg0[var5] = arg0[arg4];
                arg0[arg4] = var9;
                for (int var10 = arg2; arg4 > var10; ++var10) {
                    if (arg1[var10] < (long) (1 & var10) + var7) {
                        long var11 = arg1[var10];
                        arg1[var10] = arg1[var6];
                        arg1[var6] = var11;
                        int var13 = arg0[var10];
                        arg0[var10] = arg0[var6];
                        arg0[var6++] = var13;
                    }
                }
                arg1[arg4] = arg1[var6];
                arg1[var6] = var7;
                arg0[arg4] = arg0[var6];
                arg0[var6] = var9;
                method594(arg0, arg1, arg2, arg3, var6 + -1);
                method594(arg0, arg1, var6 + 1, true, arg4);
            }
            ++field1372;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lvm;Z)Ldn;", line = 600)
    public final class321 method355(class322 arg0, boolean arg1) {
        ++field1383;
        if (this.field1375 == null) {
            return null;
        } else {
            class247 var3 = arg0.method1650();
            var3.method747(super.field3690 + super.field3688, super.field3702, super.field3703 - -super.field3701);
            if (arg1) {
                return null;
            } else {
                class321 var4 = null;
                if (this.field1380) {
                    var4 = class204.method1110(258, 1);
                }
                this.field1375.method2284(var3, var4 != null ? var4.field4293[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIILvm;)Z", line = 626)
    public final boolean method344(int arg0, int arg1, int arg2, class322 arg3) {
        ++field1377;
        class396 var5 = this.method591(65536, arg3, false);
        if (arg0 != -23563) {
            this.method593(-128, true, (class322) null, 54);
        }
        if (var5 != null) {
            class247 var6 = arg3.method1650();
            var6.method747(super.field3688, super.field3702, super.field3703);
            return var5.method2300(arg1, arg2, var6, false);
        } else {
            return false;
        }
    }
}
