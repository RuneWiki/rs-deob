import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class340 extends class145 {

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field4645 = 0;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4635 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "Ljava/lang/String;")
    public static String field4651 = "K";

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "[Lco;")
    private class194[] field4647;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lao;II)V", line = 4)
    public static final void method2155(class116 arg0, int arg1, int arg2) {
        ++field4641;
        if (class260.field3508) {
            class260.field3508 = false;
            arg2 = 0;
        }
        if (arg1 == 20327) {
            if (class448.field6489 == null || !class448.field6489.method933(true, arg0)) {
                class448.field6489 = arg0;
                class448.field6495 = class108.method902((byte) -93);
                class391.field5485 = arg2;
                class149.field2291 = arg2;
                if (class149.field2291 == 0) {
                    class127.method991((byte) 52);
                    return;
                }
                class95.field1385 = class183.field2657;
                class23.field418 = class440.field6325;
                class185.field2684 = class132.field1895;
                class73.field1099 = class341.field4657;
                class442.field6365 = class394.field5520;
                class437.field6248 = class41.field629;
                class227.field3158 = class445.field6403;
                class447.field6478 = class37.field567;
                class7.field68 = class239.field3301;
                class39.field592 = class367.field5043;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(CI)Z", line = 44)
    public static final boolean method2156(char arg0, int arg1) {
        if (arg1 != -1) {
            field4651 = null;
        }
        ++field4648;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class421.method2597(4963, arg0)) {
            return true;
        } else {
            char[] var2 = class126.field1756;
            for (int var3 = 0; var3 < var2.length; ++var3) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class380.field5340;
            for (int var5 = 0; var5 < var4.length; ++var5) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BZILrk;III)V", line = 90)
    public static final void method2157(byte arg0, boolean arg1, int arg2, class427 arg3, int arg4, int arg5, int arg6) {
        ++field4649;
        if (arg0 <= 64) {
            method2159(-84, -87);
        }
        class241.field3327 = arg3;
        class266.field3567 = arg5;
        class395.field5532 = arg6;
        class229.field3182 = 1;
        class163.field2414 = arg1;
        class433.field6142 = arg4;
        class148.field2286 = arg2;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V", line = 111)
    public static void method2158(boolean arg0) {
        if (!arg0) {
            field4635 = null;
        }
        field4651 = null;
        field4635 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)[[I", line = 125)
    public final int[][] method4(boolean arg0, int arg1) {
        ++field4638;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (!arg0) {
            this.field4647 = null;
        }
        if (super.field2217.field5771) {
            int var4 = class156.field2364;
            int var5 = class81.field1209;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field2217.method2553(-128);
            this.method2164((byte) 35, var6);
            for (int var8 = 0; class81.field1209 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class156.field2364 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class323.method2059(var15 << 4, 4080);
                    var12[var14] = class323.method2059(var15 >> 4, 4080);
                    var11[var14] = class323.method2059(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 189)
    public class340() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)Lca;", line = 193)
    public static final class415 method2159(int arg0, int arg1) {
        if (arg0 != 24579) {
            return null;
        } else {
            ++field4642;
            class107[] var2 = class89.field1325;
            synchronized (class89.field1325) {
                class415 var3;
                if (arg1 < class89.field1325.length && !class89.field1325[arg1].method899((byte) 122)) {
                    var3 = (class415) class89.field1325[arg1].method892(0);
                    var3.method328(-25);
                    int var10002 = class385.field5428[arg1]--;
                } else {
                    var3 = new class415();
                    var3.field5799 = new class197[arg1];
                    for (int var4 = 0; ~arg1 < ~var4; ++var4) {
                        var3.field5799[var4] = new class197();
                    }
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)V", line = 227)
    public static final void method2160(int arg0, int arg1) {
        ++field4646;
        class450 var2 = class59.method540(11, arg0, 1000);
        var2.method2798(-664528978);
        if (arg1 != 4080) {
            method2162(-86, (class338) null);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLsb;ILsb;IIIIII)V", line = 247)
    public static final void method2161(byte arg0, class362 arg1, int arg2, class362 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4644;
        int var10 = arg3.method989(4);
        if (~var10 != 0) {
            Object var11 = null;
            class80 var12 = (class80) class372.field5188.method2537(arg0 ^ 115, (long) var10);
            if (var12 == null) {
                class214[] var13 = class214.method1455(class187.field2705, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class249.field3415.method213(var13[0], true);
                class372.field5188.method2542(var12, (byte) 59, (long) var10);
            }
            class416.method2577(arg1.field3167, 7, arg9, arg1.field3176, arg5 >> 1, 0, arg1.method2146(-124) * 64, arg8, arg2 >> 1);
            int var14 = class220.field3043[0] + arg6 + -18;
            int var15 = arg7 - (-class220.field3043[1] + 16) + -54;
            int var16 = arg4 / 4 * 18 + var14;
            int var17 = arg4 % 4 * 18 + var15;
            var12.method722(var16, var17);
            if (arg0 != -1) {
                field4645 = -59;
            }
            if (arg1 == arg3) {
                class249.field3415.method2413(var16 + -1, -15084, var17 - 1, -256, 18, 18);
            }
            class264 var18 = class87.method778((byte) 2);
            var18.field3547 = arg3;
            var18.field3551 = var16;
            var18.field3550 = var17 + 16;
            var18.field3543 = var17;
            var18.field3552 = var16 - -16;
            class287.field3848.method901(false, var18);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I", line = 307)
    public final int[] method3(int arg0, int arg1) {
        ++field4634;
        int[] var3 = super.field2218.method1614(42, arg0);
        if (super.field2218.field3396) {
            this.method2164((byte) 35, super.field2218.method1610(0));
        }
        int var4 = -5 % ((16 - arg1) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILcc;)I", line = 333)
    public static final int method2162(int arg0, class338 arg1) {
        if (arg0 != 82) {
            method2158(true);
        }
        ++field4640;
        int var2 = arg1.field4591;
        class434 var3 = arg1.method2280(71);
        if (!arg1.field4982) {
            if (~arg1.field4941 != ~var3.field6190 && arg1.field4941 != var3.field6148 && arg1.field4941 != var3.field6176 && arg1.field4941 != var3.field6154) {
                if (arg1.field4941 == var3.field6174 || ~arg1.field4941 == ~var3.field6153 || arg1.field4941 == var3.field6172 || ~arg1.field4941 == ~var3.field6195) {
                    var2 = arg1.field4584;
                }
            } else {
                var2 = arg1.field4603;
            }
        } else {
            var2 = arg1.field4576;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V", line = 360)
    public static final void method2163(int arg0) {
        ++field4636;
        if (class135.field1928 < 102) {
            class135.field1928 += 6;
        }
        for (int var1 = 0; ~var1 > ~class83.field1221; ++var1) {
            int var2 = class19.field377[var1];
            char var3 = (char) class266.field3574[var1];
            if (~var2 == -85) {
                class360.method2260(-108);
            } else if (class234.field3242[82] && ~var2 == -67) {
                if (class64.field971 != null) {
                    String var4 = "";
                    for (int var5 = class77.field1161.length + -1; var5 >= 0; --var5) {
                        if (class77.field1161[var5] != null && ~class77.field1161[var5].length() < -1) {
                            var4 = var4 + class77.field1161[var5] + '\n';
                        }
                    }
                    class64.field971.setContents(new StringSelection(var4), (ClipboardOwner) null);
                }
            } else if (class234.field3242[82] && var2 == 67) {
                if (class64.field971 != null) {
                    Transferable var6 = class64.field971.getContents((Object) null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class156.method1192(0, '\n', var7);
                                if (var8.length <= 1) {
                                    class421.field5896 = class421.field5896 + var7;
                                } else {
                                    for (int var9 = 0; var9 < var8.length; ++var9) {
                                        class421.field5896 = var8[var9];
                                        class360.method2260(-114);
                                    }
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (~var2 == -86 && class421.field5896.length() > 0) {
                class421.field5896 = class421.field5896.substring(0, class421.field5896.length() + -1);
            } else if (~var2 == -105 && ~class77.field1161.length < ~class148.field2271) {
                ++class148.field2271;
                class124.method970((byte) -6);
            } else if (~var2 == -106 && class148.field2271 > 0) {
                --class148.field2271;
                class124.method970((byte) -6);
            } else if (class421.method2597(4963, var3) || var3 == ',' || ~var3 == -33 || var3 == '_' || ~var3 == -46 || var3 == '+') {
                class421.field5896 = class421.field5896 + (char) class266.field3574[var1];
            }
        }
        if (arg0 != -1) {
            method2156('e', -98);
        }
        class83.field1221 = 0;
        for (int var10 = 0; var10 < 100; ++var10) {
            int var10002;
            if (!class276.field3719[var10]) {
                var10002 = class88.field1306[var10]--;
                if (class88.field1306[var10] < 0) {
                    class323.field4388[var10] = (int) ((double) class249.field3414 * Math.random());
                    class172.field2522[var10] = (int) (350.0D * Math.random());
                    class88.field1306[var10] = 0;
                    class276.field3719[var10] = true;
                }
            } else {
                var10002 = class88.field1306[var10]++;
                if (~class88.field1306[var10] < -103) {
                    class276.field3719[var10] = false;
                }
            }
        }
        class125.method973(0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B[[I)V", line = 515)
    private final void method2164(byte arg0, int[][] arg1) {
        ++field4650;
        if (arg0 != 35) {
            this.field4647 = null;
        }
        int var3 = class156.field2364;
        int var4 = class81.field1209;
        class199.method1407(108, arg1);
        class78.method672(0, (byte) -81, class402.field5610, 0, class40.field606);
        if (this.field4647 != null) {
            for (int var5 = 0; this.field4647.length > var5; ++var5) {
                class194 var6 = this.field4647[var5];
                int var7 = var6.field2787;
                int var8 = var6.field2788;
                if (~var7 <= -1) {
                    if (var8 < 0) {
                        var6.method593(var3, var4, (byte) 18);
                    } else {
                        var6.method594(-111, var3, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method592(arg0 + 49965, var3, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lap;BI)V", line = 567)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field4637;
        int var4 = -90 % ((11 - arg1) / 52);
        if (~arg2 == -1) {
            this.field4647 = new class194[arg0.method1861((byte) -72)];
            for (int var5 = 0; ~var5 > ~this.field4647.length; ++var5) {
                int var6 = arg0.method1861((byte) -72);
                if (var6 != 0) {
                    if (~var6 != -2) {
                        if (var6 != 2) {
                            if (var6 == 3) {
                                this.field4647[var5] = class407.method2525((byte) 40, arg0);
                            }
                        } else {
                            this.field4647[var5] = class69.method599(arg0, 1);
                        }
                    } else {
                        this.field4647[var5] = class445.method2754(-108, arg0);
                    }
                } else {
                    this.field4647[var5] = class191.method1373(0, arg0);
                }
            }
        } else if (arg2 == 1) {
            super.field2205 = ~arg0.method1861((byte) -72) == -2;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIBIIII)V", line = 643)
    public static final void method2165(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4643;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (~var8 < -101) {
            var8 = 100;
        }
        int var9 = class415.field5812 - -((-class415.field5812 + class7.field54) * var8 / 100);
        int var10 = arg1 * var9 >> 8;
        int var11 = 16383 & -arg0 + 16384;
        int var12 = -arg2 + 16384 & 16383;
        if (arg3 < 125) {
            field4645 = -60;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (~var11 != -1) {
            var14 = class174.field2572[var11] * -var10 >> 15;
            var15 = class174.field2564[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class174.field2572[var12] * var15 >> 15;
            var15 = class174.field2564[var12] * var15 >> 15;
        }
        class443.field6389 = arg6 - var14;
        class286.field3837 = arg2;
        class356.field4842 = -var13 + arg5;
        class374.field5261 = -var15 + arg7;
        class167.field2488 = arg0;
    }
}
