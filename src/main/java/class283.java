import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class283 {

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Loga;")
    private class178 field4059 = null;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lsia;")
    private class402 field4048;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Z")
    private boolean field4064;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public int field4076;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field4066 = 328;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "[Ljava/lang/Object;")
    private Object[] field4078;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4044;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 3)
    public final void method1836(int arg0) {
        field4072++;
        if (arg0 == 0 && this.field4078 != null) {
            for (int var2 = 0; var2 < this.field4078.length; var2++) {
                this.field4078[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 27)
    public final boolean method1837(byte arg0, String arg1) {
        if (arg0 != -99) {
            this.method1851(-58);
        }
        field4070++;
        if (this.method1840(-26833)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4059.field2250.method3990(class12.method41(var3, (byte) -82), true);
            return this.method1865(var4, (byte) -16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z", line = 51)
    private final boolean method1838(String arg0, byte arg1, String arg2) {
        field4081++;
        if (!this.method1840(-26833)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        if (arg1 < 26) {
            this.method1855(-69, -70);
        }
        String var5 = arg2.toLowerCase();
        int var6 = this.field4059.field2250.method3990(class12.method41(var4, (byte) -72), true);
        if (this.method1855(var6, -1)) {
            int var7 = this.field4059.field2249[var6].method3990(class12.method41(var5, (byte) -78), true);
            return this.method1862(50, var7, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/lang/String;)I", line = 75)
    public final int method1839(int arg0, String arg1) {
        field4075++;
        if (!this.method1840(-26833)) {
            return -1;
        }
        if (arg0 != -1) {
            this.field4078 = null;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field4059.field2250.method3990(class12.method41(var3, (byte) -80), true);
        return this.method1855(var4, arg0) ? var4 : -1;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Z", line = 97)
    private final boolean method1840(int arg0) {
        if (arg0 != -26833) {
            return false;
        }
        field4073++;
        if (this.field4059 == null) {
            this.field4059 = this.field4048.method1647((byte) 29);
            if (this.field4059 == null) {
                return false;
            }
            this.field4078 = new Object[this.field4059.field2251];
            this.field4044 = new Object[this.field4059.field2251][];
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)I", line = 129)
    public final int method1841(byte arg0, int arg1) {
        field4079++;
        if (!this.method1840(-26833)) {
            return -1;
        }
        if (arg0 > -100) {
            this.method1848(54, (byte) -6, null, 9);
        }
        int var3 = this.field4059.field2250.method3990(arg1, true);
        return this.method1855(var3, -1) ? var3 : -1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V", line = 148)
    private final void method1842(boolean arg0, int arg1) {
        if (this.field4064) {
            this.field4078[arg1] = this.field4048.method1659(arg1, (byte) 100);
        } else {
            this.field4078[arg1] = class485.method2881(-137, this.field4048.method1659(arg1, (byte) 114), false);
        }
        field4077++;
        if (arg0) {
            this.method1841((byte) -126, 92);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[III)Z", line = 167)
    private final boolean method1843(int arg0, int[] arg1, int arg2, int arg3) {
        field4065++;
        if (!this.method1855(arg0, -1)) {
            return false;
        } else if (this.field4078[arg0] == null) {
            return false;
        } else {
            int var5 = this.field4059.field2255[arg0];
            int[] var6 = this.field4059.field2252[arg0];
            if (arg2 > -86) {
                this.field4064 = true;
            }
            if (this.field4044[arg0] == null) {
                this.field4044[arg0] = new Object[this.field4059.field2241[arg0]];
            }
            Object[] var7 = this.field4044[arg0];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var11 = class410.method2503(this.field4078[arg0], 5, false);
            } else {
                var11 = class410.method2503(this.field4078[arg0], 5, true);
                class511 var12 = new class511(var11);
                var12.method2994(var12.field6979.length, -1640531527, 5, arg1);
            }
            byte[] var13;
            try {
                var13 = class244.method1630(var11, (byte) -23);
            } catch (RuntimeException var49) {
                throw class736.method4082(var49, "T3 - " + (arg1 != null) + "," + arg0 + "," + var11.length + "," + class510.method2969(var11, 0, var11.length) + "," + class510.method2969(var11, 0, var11.length - 2) + "," + this.field4059.field2257[arg0] + "," + this.field4059.field2244);
            }
            if (this.field4064) {
                this.field4078[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field4076 == 0) {
                    var7[var15] = class485.method2881(-137, var13, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field4076 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var17 * 4 * var5;
                class511 var19 = new class511(var13);
                int var20 = 0;
                var19.field6962 = var18;
                int var21 = 0;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method3008(64);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg3 == var25) {
                            var20 += var23;
                            var21 = var25;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                var19.field6962 = var18;
                int var27 = 0;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method3008(64);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg3 == var32) {
                            class335.method2118(var13, var28, var26, var27, var30);
                            var27 += var30;
                        }
                        var28 += var30;
                    }
                }
                var7[var21] = var26;
            } else {
                int var33 = var13.length;
                int var51 = var33 - 1;
                int var34 = var13[var51] & 0xFF;
                int var35 = var51 - var34 * 4 * var5;
                class511 var36 = new class511(var13);
                int[] var37 = new int[var5];
                var36.field6962 = var35;
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method3008(64);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field6962 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method3008(64);
                        class335.method2118(var13, var43, var41[var46], var37[var46], var45);
                        var37[var46] += var45;
                        var43 += var45;
                    }
                }
                for (int var47 = 0; var47 < var5; var47++) {
                    int var48;
                    if (var6 == null) {
                        var48 = var47;
                    } else {
                        var48 = var6[var47];
                    }
                    if (this.field4076 == 0) {
                        var7[var48] = class485.method2881(-137, var41[var47], false);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 453)
    public final void method1844(byte arg0) {
        field4063++;
        if (this.field4044 != null) {
            for (int var2 = 0; var2 < this.field4044.length; var2++) {
                this.field4044[var2] = null;
            }
        }
        if (arg0 != 112) {
            this.method1854(-115, 111);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(BLjava/lang/String;)Z", line = 475)
    public final boolean method1845(byte arg0, String arg1) {
        field4067++;
        if (this.method1840(-26833)) {
            String var3 = arg1.toLowerCase();
            int var4 = -58 % ((arg0 + 45) / 42);
            int var5 = this.field4059.field2250.method3990(class12.method41(var3, (byte) -115), true);
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z", line = 495)
    public final boolean method1846(byte arg0, String arg1, String arg2) {
        int var4 = 119 % ((39 - arg0) / 51);
        field4053++;
        if (!this.method1840(-26833)) {
            return false;
        }
        String var5 = arg2.toLowerCase();
        String var6 = arg1.toLowerCase();
        int var7 = this.field4059.field2250.method3990(class12.method41(var5, (byte) -116), true);
        if (var7 < 0) {
            return false;
        } else {
            int var8 = this.field4059.field2249[var7].method3990(class12.method41(var6, (byte) -103), true);
            return var8 >= 0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)Z", line = 522)
    private final boolean method1847(int arg0, int arg1, byte arg2) {
        field4050++;
        if (!this.method1840(-26833)) {
            return false;
        } else if (arg2 != -16) {
            return true;
        } else if (arg0 >= 0 && arg1 >= 0 && this.field4059.field2241.length > arg0 && arg1 < this.field4059.field2241[arg0]) {
            return true;
        } else if (class88.field1042) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB[II)[B", line = 546)
    public final byte[] method1848(int arg0, byte arg1, int[] arg2, int arg3) {
        if (arg1 < 9) {
            return null;
        }
        field4054++;
        if (!this.method1847(arg0, arg3, (byte) -16)) {
            return null;
        }
        if (this.field4044[arg0] == null || this.field4044[arg0][arg3] == null) {
            boolean var5 = this.method1843(arg0, arg2, -125, arg3);
            if (!var5) {
                this.method1842(false, arg0);
                boolean var6 = this.method1843(arg0, arg2, -89, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class410.method2503(this.field4044[arg0][arg3], 5, false);
        if (this.field4076 == 1) {
            this.field4044[arg0][arg3] = null;
            if (this.field4059.field2241[arg0] == 1) {
                this.field4044[arg0] = null;
            }
        } else if (this.field4076 == 2) {
            this.field4044[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBI)[B", line = 598)
    public final byte[] method1849(int arg0, byte arg1, int arg2) {
        int var4 = 51 % ((-arg1 - 55) / 32);
        field4058++;
        return this.method1848(arg2, (byte) 45, null, arg0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[I", line = 608)
    public final int[] method1850(int arg0, int arg1) {
        field4061++;
        if (!this.method1855(arg0, -1)) {
            return null;
        }
        if (arg1 < 30) {
            this.method1842(false, -112);
        }
        int[] var3 = this.field4059.field2252[arg0];
        if (var3 == null) {
            var3 = new int[this.field4059.field2255[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)Z", line = 642)
    public final boolean method1851(int arg0) {
        field4082++;
        if (!this.method1840(-26833)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4059.field2245.length; var3++) {
            int var4 = this.field4059.field2245[var3];
            if (this.field4078[var4] == null) {
                this.method1842(false, var4);
                if (this.field4078[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 < 76) {
            this.field4044 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)I", line = 679)
    public final int method1852(int arg0) {
        field4083++;
        if (!this.method1840(-26833)) {
            throw new IllegalStateException("");
        }
        if (arg0 != 12613) {
            this.field4078 = null;
        }
        return this.field4059.field2244;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)I", line = 696)
    public final int method1853(int arg0) {
        field4045++;
        if (!this.method1840(-26833)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4078.length; var4++) {
            if (this.field4059.field2255[var4] > 0) {
                var3 += this.method1856(0, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        }
        int var5 = var3 * 100 / var2;
        if (arg0 != -11168) {
            this.field4044 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)[B", line = 737)
    public final byte[] method1854(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field4044 = null;
        }
        field4049++;
        if (!this.method1840(-26833)) {
            return null;
        } else if (this.field4059.field2241.length == 1) {
            return this.method1849(arg1, (byte) 55, 0);
        } else if (!this.method1855(arg1, -1)) {
            return null;
        } else if (this.field4059.field2241[arg1] == 1) {
            return this.method1849(0, (byte) -117, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)Z", line = 764)
    private final boolean method1855(int arg0, int arg1) {
        field4062++;
        if (!this.method1840(arg1 ^ 0x68D0)) {
            return false;
        } else if (~arg0 <= arg1 && this.field4059.field2241.length > arg0 && this.field4059.field2241[arg0] != 0) {
            return true;
        } else if (class88.field1042) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(II)I", line = 785)
    private final int method1856(int arg0, int arg1) {
        field4068++;
        if (this.method1855(arg1, -1)) {
            if (arg0 != 0) {
                this.field4078 = null;
            }
            return this.field4078[arg1] == null ? this.field4048.method1657(0, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(II)V", line = 812)
    public final void method1857(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field4044 = null;
        }
        field4060++;
        if (this.method1855(arg0, arg1 - 1) && this.field4044 != null) {
            this.field4044[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 830)
    public final void method1858(String arg0, int arg1) {
        field4057++;
        if (!this.method1840(-26833)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4059.field2250.method3990(class12.method41(var3, (byte) -61), true);
        this.method1863((byte) -72, var4);
        if (arg1 != 0) {
            this.field4076 = -80;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(ILjava/lang/String;)Z", line = 849)
    public final boolean method1859(int arg0, String arg1) {
        if (arg0 == 0) {
            field4074++;
            int var3 = this.method1839(arg0 - 1, "");
            return var3 == -1 ? this.method1838(arg1, (byte) 53, "") : this.method1838("", (byte) 127, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Z", line = 866)
    public final boolean method1860(int arg0, byte arg1) {
        field4052++;
        if (!this.method1840(-26833)) {
            return false;
        } else if (this.field4059.field2241.length == 1) {
            return this.method1862(52, arg0, 0);
        } else if (this.method1855(arg0, -1)) {
            if (arg1 != 124) {
                this.field4064 = false;
            }
            if (this.field4059.field2241[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method1862(65, 0, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)[B", line = 892)
    public final byte[] method1861(boolean arg0, String arg1, String arg2) {
        field4047++;
        if (!this.method1840(-26833)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        if (!arg0) {
            return null;
        }
        int var6 = this.field4059.field2250.method3990(class12.method41(var4, (byte) -103), arg0);
        if (this.method1855(var6, -1)) {
            int var7 = this.field4059.field2249[var6].method3990(class12.method41(var5, (byte) -87), arg0);
            return this.method1849(var7, (byte) -93, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z", line = 917)
    public final boolean method1862(int arg0, int arg1, int arg2) {
        field4055++;
        if (!this.method1847(arg2, arg1, (byte) -16)) {
            return false;
        } else if (this.field4044[arg2] != null && this.field4044[arg2][arg1] != null) {
            return true;
        } else if (this.field4078[arg2] == null) {
            if (arg0 < 33) {
                this.method1853(-46);
            }
            this.method1842(false, arg2);
            return this.field4078[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)V", line = 947)
    private final void method1863(byte arg0, int arg1) {
        this.field4048.method1649((byte) 120, arg1);
        if (arg0 == -72) {
            field4080++;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZZI)V", line = 961)
    public final void method1864(boolean arg0, boolean arg1, int arg2) {
        field4069++;
        if (!this.method1840(arg2 ^ 0x1CB6)) {
            return;
        }
        if (arg1) {
            this.field4059.field2253 = null;
            this.field4059.field2250 = null;
        }
        if (arg0) {
            this.field4059.field2239 = null;
            this.field4059.field2249 = null;
        }
        if (arg2 != -29799) {
            this.method1838(null, (byte) 37, null);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)Z", line = 994)
    public final boolean method1865(int arg0, byte arg1) {
        field4071++;
        if (arg1 != -16) {
            field4066 = -30;
        }
        if (!this.method1855(arg0, arg1 ^ 0xF)) {
            return false;
        } else if (this.field4078[arg0] == null) {
            this.method1842(false, arg0);
            return this.field4078[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I", line = 1015)
    public final int method1866(byte arg0) {
        if (arg0 <= 24) {
            this.method1846((byte) 41, null, null);
        }
        field4046++;
        return this.method1840(-26833) ? this.field4059.field2241.length : -1;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(IB)I", line = 1033)
    public final int method1867(int arg0, byte arg1) {
        if (arg1 != 49) {
            this.method1857(64, 7);
        }
        field4056++;
        return this.method1855(arg0, -1) ? this.field4059.field2241[arg0] : 0;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(ILjava/lang/String;)I", line = 1053)
    public final int method1868(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field4044 = null;
        }
        field4051++;
        if (this.method1840(-26833)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4059.field2250.method3990(class12.method41(var3, (byte) -79), true);
            return this.method1856(0, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lsia;ZI)V", line = 1076)
    public class283(class402 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field4048 = arg0;
        this.field4064 = arg1;
        this.field4076 = arg2;
    }
}
