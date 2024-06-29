import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class126 extends class326 {

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "I")
    private int field1820 = 4;

    @OriginalMember(owner = "client!ao", name = "V", descriptor = "I")
    private int field1829 = 4;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1819 = "Loading - please wait.";

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!ao", name = "R", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!ao", name = "U", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!ao", name = "W", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ao", name = "X", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "Lcd;")
    public static class136 field1827;

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "Lug;")
    public static class253 field1826;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)[[I", line = 8)
    public final int[][] method253(int arg0, byte arg1) {
        int var3 = -24 / ((arg1 - 60) / 51);
        field1823++;
        int[][] var4 = this.field5104.method2365((byte) 98, arg0);
        if (this.field5104.field5325) {
            int var5 = class302.field4637 / this.field1820;
            int var6 = class166.field2731 / this.field1829;
            int[][] var7;
            if (var5 <= 0) {
                var7 = this.method2293(-15033, 0, 0);
            } else {
                int var8 = arg0 % var5;
                var7 = this.method2293(-15033, class302.field4637 * var8 / var5, 0);
            }
            int[] var9 = var4[0];
            int[] var10 = var7[1];
            int[] var11 = var7[0];
            int[] var12 = var7[2];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; var15 < class166.field2731; var15++) {
                int var16;
                if (var6 <= 0) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var6;
                    var16 = class166.field2731 * var17 / var6;
                }
                var9[var15] = var11[var16];
                var13[var15] = var10[var16];
                var14[var15] = var12[var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 78)
    public static final int method914(String arg0, int arg1) {
        field1824++;
        if (class278.field4290 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = arg1; var2 < class278.field4290.field4244; var2++) {
            if (class110.method783(112, " ", "<br>", class278.field4290.field4246[var2]).equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)Lof;", line = 101)
    public static final class283 method915(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1779;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 108)
    public class126() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)[I", line = 118)
    public final int[] method103(int arg0, int arg1) {
        if (arg0 > -25) {
            this.field1820 = -67;
        }
        field1822++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int var4 = class166.field2731 / this.field1829;
            int var5 = class302.field4637 / this.field1820;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method2287(0, 0, -3896);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method2287(0, class302.field4637 * var7 / var5, -3896);
            }
            for (int var8 = 0; var8 < class166.field2731; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class166.field2731 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)V", line = 175)
    public static final void method916(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 13513) {
            field1826 = (class253) null;
        }
        field1828++;
        for (int var6 = arg1; var6 <= (arg1 + arg3); var6++) {
            for (int var7 = arg2; var7 <= arg2 + arg5; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class24.field360[arg4][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg1; var8 < (arg1 + arg3); var8++) {
            for (int var9 = arg2; var9 < arg2 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class172.field2843[arg4][var9][var8] = arg4 <= 0 ? 0 : class172.field2843[arg4 - 1][var9][var8];
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var10 = arg1 + 1; var10 < (arg1 + arg3); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class172.field2843[arg4][arg2][var10] = class172.field2843[arg4][arg2 - 1][var10];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var11 = arg2 + 1; var11 < arg2 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class172.field2843[arg4][var11][arg1] = class172.field2843[arg4][var11][arg1 - 1];
                }
            }
        }
        if (arg2 < 0 || arg1 < 0 || arg2 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 > 0 && class172.field2843[arg4][arg2 - 1][arg1] != 0) {
                class172.field2843[arg4][arg2][arg1] = class172.field2843[arg4][arg2 - 1][arg1];
            } else if (arg1 > 0 && class172.field2843[arg4][arg2][arg1 - 1] != 0) {
                class172.field2843[arg4][arg2][arg1] = class172.field2843[arg4][arg2][arg1 - 1];
            } else if (arg2 > 0 && arg1 > 0 && class172.field2843[arg4][arg2 - 1][arg1 - 1] != 0) {
                class172.field2843[arg4][arg2][arg1] = class172.field2843[arg4][arg2 - 1][arg1 - 1];
            }
        } else if (arg2 > 0 && class172.field2843[arg4 - 1][arg2 - 1][arg1] != class172.field2843[arg4][arg2 - 1][arg1]) {
            class172.field2843[arg4][arg2][arg1] = class172.field2843[arg4][arg2 - 1][arg1];
        } else if (arg1 > 0 && class172.field2843[arg4 - 1][arg2][arg1 - 1] != class172.field2843[arg4][arg2][arg1 - 1]) {
            class172.field2843[arg4][arg2][arg1] = class172.field2843[arg4][arg2][arg1 - 1];
        } else if (arg2 > 0 && arg1 > 0 && class172.field2843[arg4 - 1][arg2 - 1][arg1 - 1] != class172.field2843[arg4][arg2 - 1][arg1 - 1]) {
            class172.field2843[arg4][arg2][arg1] = class172.field2843[arg4][arg2 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZLvl;)V", line = 305)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field1829 = arg2.method58(-288140008);
        } else if (arg0 == 1) {
            this.field1820 = arg2.method58(-288140008);
        }
        field1830++;
        if (arg1) {
            this.method253(76, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBIIIIILcd;)V", line = 332)
    public static final void method917(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class136 arg7) {
        field1831++;
        int var8 = arg0 * arg0 + arg2 * arg2;
        if (arg6 < var8 || arg1 != 26) {
            return;
        }
        int var9 = Math.min(arg7.field2137 / 2, arg7.field2078 / 2);
        if (var9 * var9 >= var8) {
            class56.method442(arg7, arg0, 6555, arg4, arg3, class328.field5140[arg5], arg2);
            return;
        }
        var9 -= 10;
        int var10 = (int) class45.field604 + class220.field3483 & 0x7FF;
        int var11 = class31.field451[var10];
        int var12 = class31.field467[var10];
        int var13 = var11 * 256 / (class293.field4541 + 256);
        int var14 = var12 * 256 / (class293.field4541 + 256);
        int var15 = arg0 * var13 - (arg2 * var14) >> 16;
        int var16 = arg0 * var14 + arg2 * var13 >> 16;
        double var17 = Math.atan2((double) var16, (double) var15);
        int var19 = (int) ((double) var9 * Math.sin(var17));
        int var20 = (int) ((double) var9 * Math.cos(var17));
        if (class109.field1458) {
            ((class239) class221.field3500[arg5]).method1706(240, 240, (arg7.field2137 / 2 + var19 + arg4) * 16, (arg7.field2078 / 2 + arg3 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class190) class221.field3500[arg5]).method1373(arg7.field2137 / 2 + var19 + arg4 - 10, arg7.field2078 / 2 + -var20 + arg3 + -10, 20, 20, 15, 15, var17, 256);
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V", line = 380)
    public static final void method918(int arg0, int arg1) {
        field1818++;
        int var2 = class232.field3631;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class337 var4;
            if (arg1 == 0) {
                var4 = class146.field2310;
            } else {
                var4 = class284.field4403[class81.field1116[var3]];
            }
            if (var4 != null && var4.method1546((byte) 96)) {
                int var5 = var4.method2099((byte) 123);
                if (arg1 == 0 || arg1 == var5) {
                    if (var5 == 1) {
                        if ((var4.field4698 & 0x7F) == 64 && (var4.field4731 & 0x7F) == 64) {
                            int var6 = var4.field4698 >> 7;
                            int var7 = var4.field4731 >> 7;
                            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                                var10002 = class235.field3675[var6][var7]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field4698 & 0x7F) == 0 && (var4.field4731 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field4698 & 0x7F) == 64 && (var4.field4731 & 0x7F) == 64)) {
                        int var8 = var4.field4698 - (var5 * 64) >> 7;
                        int var9 = var4.field4731 - var5 * 64 >> 7;
                        int var10 = var8 + var4.method2099((byte) 123);
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        int var11 = var4.method2099((byte) 123) + var9;
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        for (int var12 = var8; var12 < var10; var12++) {
                            for (int var13 = var9; var13 < var11; var13++) {
                                var10002 = class235.field3675[var12][var13]++;
                            }
                        }
                    }
                }
            }
        }
        int var14 = 84 % ((arg0 - 54) / 60);
        label220: for (int var15 = 0; var15 < var2; var15++) {
            long var16;
            class337 var18;
            if (arg1 == 0) {
                var16 = 8791798054912L;
                var18 = class146.field2310;
            } else {
                var16 = (long) class81.field1116[var15] << 32;
                var18 = class284.field4403[class81.field1116[var15]];
            }
            if (var18 != null && var18.method1546((byte) 96)) {
                int var19 = var18.method2099((byte) 123);
                if (arg1 == 0 || arg1 == var19) {
                    var18.field5272 = false;
                    var18.field4659 = true;
                    if ((class187.field3018 && class232.field3631 > 200 || class232.field3631 > 50) && arg1 != 0 && var18.field4724 == var18.method2100(2000117776).field1451) {
                        var18.field5272 = true;
                    }
                    if (var19 == 1) {
                        if ((var18.field4698 & 0x7F) == 64 && (var18.field4731 & 0x7F) == 64) {
                            int var29 = var18.field4698 >> 7;
                            int var30 = var18.field4731 >> 7;
                            if (var29 < 0 || var29 >= 104 || var30 < 0 || var30 >= 104) {
                                continue;
                            }
                            if (class235.field3675[var29][var30] > 1) {
                                var10002 = class235.field3675[var29][var30]--;
                                continue;
                            }
                        }
                    } else if ((var19 & 0x1) == 0 && (var18.field4698 & 0x7F) == 0 && (var18.field4731 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var18.field4698 & 0x7F) == 64 && (var18.field4731 & 0x7F) == 0) {
                        int var20 = var18.field4731 - (var19 * 64) >> 7;
                        int var21 = var19 + var20;
                        if (var21 > 104) {
                            var21 = 104;
                        }
                        boolean var22 = true;
                        if (var20 < 0) {
                            var20 = 0;
                        }
                        int var23 = var18.field4698 - (var19 * 64) >> 7;
                        int var24 = var19 + var23;
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        if (var23 < 0) {
                            var23 = 0;
                        }
                        for (int var25 = var23; var25 < var24; var25++) {
                            for (int var26 = var20; var26 < var21; var26++) {
                                if (class235.field3675[var25][var26] <= 1) {
                                    var22 = false;
                                    break;
                                }
                            }
                        }
                        if (var22) {
                            int var27 = var23;
                            while (true) {
                                if (var24 <= var27) {
                                    continue label220;
                                }
                                for (int var28 = var20; var28 < var21; var28++) {
                                    var10002 = class235.field3675[var27][var28]--;
                                }
                                var27++;
                            }
                        }
                    }
                    if (var18.field4666 == null || class229.field3595 < var18.field4737 || var18.field4649 <= class229.field3595) {
                        var18.field4659 = false;
                        var18.field4747 = class320.method2245((byte) -116, var18.field4731, class154.field2392, var18.field4698);
                        class6.method94(class154.field2392, var18.field4698, var18.field4731, var18.field4747, (var19 - 1) * 64 + 60, var18, var18.field4715, var16, var18.field4686);
                    } else {
                        var18.field4659 = false;
                        var18.field5272 = false;
                        var18.field4747 = class320.method2245((byte) -72, var18.field4731, class154.field2392, var18.field4698);
                        class20.method204(class154.field2392, var18.field4698, var18.field4731, var18.field4747, var18, var18.field4715, var16, var18.field4689, var18.field4699, var18.field4687, var18.field4654);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V", line = 638)
    public static final void method919(int arg0, boolean arg1) {
        class50.method373((byte) 126);
        field1821++;
        if (class105.field1388 != 30 && class105.field1388 != 25) {
            return;
        }
        class119.field1661++;
        if (arg0 != 132) {
            field1826 = (class253) null;
        }
        if (class119.field1661 < 50 && !arg1) {
            return;
        }
        class119.field1661 = 0;
        if (!class130.field1919 && class275.field4247 != null) {
            class183.field2965.method1947((byte) -57, 132);
            try {
                class275.field4247.method221(107, class183.field2965.field115, 0, class183.field2965.field111);
                class183.field2965.field111 = 0;
            } catch (IOException var3) {
                class130.field1919 = true;
            }
            class284.field4391++;
        }
        class50.method373((byte) 115);
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(B)V", line = 684)
    public static void method920(byte arg0) {
        field1826 = null;
        if (arg0 == 52) {
            field1827 = null;
            field1819 = null;
        }
    }
}
