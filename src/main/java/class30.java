import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class30 extends class183 {

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
    private int field520 = 1;

    @OriginalMember(owner = "client!hj", name = "eb", descriptor = "I")
    private int field527 = 1;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
    public static int field521 = -1;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
    public static int field519 = 0;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!hj", name = "cb", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!hj", name = "db", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!hj", name = "fb", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!hj", name = "hb", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!hj", name = "gb", descriptor = "[I")
    public static int[] field529;

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 3)
    public class30() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)[[I", line = 12)
    public final int[][] method12(int arg0, int arg1) {
        int var3 = -33 % ((18 - arg0) / 61);
        field528++;
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int var5 = this.field527 + this.field527 + 1;
            int var6 = this.field520 + this.field520 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var5][][];
            for (int var9 = arg1 - this.field527; var9 <= this.field527 + arg1; var9++) {
                int[][] var10 = this.method1250(class252.field4405 & var9, 0, (byte) 58);
                int[][] var11 = new int[3][class22.field393];
                int var12 = 0;
                int var13 = 0;
                int[] var14 = var10[0];
                int[] var15 = var10[1];
                int var16 = 0;
                int[] var17 = var10[2];
                for (int var18 = -this.field520; var18 <= this.field520; var18++) {
                    int var19 = class52.field913 & var18;
                    var12 += var14[var19];
                    var13 += var15[var19];
                    var16 += var17[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (class22.field393 > var23) {
                    var20[var23] = var7 * var12 >> 16;
                    var21[var23] = var7 * var13 >> 16;
                    var22[var23] = var7 * var16 >> 16;
                    int var24 = class52.field913 & var23 - this.field520;
                    var23++;
                    int var25 = var12 - var14[var24];
                    int var26 = var13 - var15[var24];
                    int var27 = var16 - var17[var24];
                    int var28 = class52.field913 & this.field520 + var23;
                    var12 = var14[var28] + var25;
                    var13 = var15[var28] + var26;
                    var16 = var17[var28] + var27;
                }
                var8[this.field527 + var9 - arg1] = var11;
            }
            int var29 = 65536 / var5;
            int[] var30 = var4[0];
            int[] var31 = var4[1];
            int[] var32 = var4[2];
            for (int var33 = 0; var33 < class22.field393; var33++) {
                int var34 = 0;
                int var35 = 0;
                int var36 = 0;
                for (int var37 = 0; var37 < var5; var37++) {
                    int[][] var38 = var8[var37];
                    var35 += var38[1][var33];
                    var34 += var38[0][var33];
                    var36 += var38[2][var33];
                }
                var30[var33] = var29 * var34 >> 16;
                var31[var33] = var29 * var35 >> 16;
                var32[var33] = var29 * var36 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V", line = 140)
    public static void method253(int arg0) {
        field529 = null;
        if (arg0 != 2) {
            field519 = -106;
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(Z)V", line = 163)
    public static final void method254(boolean arg0) {
        if (arg0) {
            return;
        }
        field523++;
        class253 var1 = class301.field5117;
        synchronized (class301.field5117) {
            class293.field5020++;
            class235.field4062 = class90.field1655;
            class287.field4914 = class78.field1426;
            class82.field1511 = class148.field2557;
            class55.field969 = class323.field5445;
            class222.field3791 = class269.field4615;
            class60.field1033 = class90.field1654;
            class298.field5084 = class83.field1590;
            class323.field5445 = 0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(II)[I", line = 196)
    public final int[] method10(int arg0, int arg1) {
        field522++;
        if (arg1 != -1) {
            return (int[]) null;
        }
        int[] var3 = this.field3161.method664(arg0, arg1 + 1);
        if (this.field3161.field1736) {
            int var4 = this.field520 + this.field520 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field527 + this.field527 + 1;
            int[][] var7 = new int[var6][];
            int var8 = 65536 / var6;
            for (int var9 = arg0 - this.field527; var9 <= (arg0 + this.field527); var9++) {
                int var10 = 0;
                int[] var11 = this.method1253(0, var9 & class252.field4405, 79);
                int[] var12 = new int[class22.field393];
                for (int var13 = -this.field520; var13 <= this.field520; var13++) {
                    var10 += var11[var13 & class52.field913];
                }
                int var14 = 0;
                while (var14 < class22.field393) {
                    var12[var14] = var5 * var10 >> 16;
                    int var15 = var10 - var11[var14 - this.field520 & class52.field913];
                    var14++;
                    var10 = var11[class52.field913 & this.field520 + var14] + var15;
                }
                var7[var9 + this.field527 - arg0] = var12;
            }
            for (int var16 = 0; var16 < class22.field393; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var6; var18++) {
                    var17 += var7[var18][var16];
                }
                var3[var16] = var8 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V", line = 288)
    public static final void method255(byte arg0) {
        class84.field1608.method1397(30, 0);
        field525++;
        class232.field4014++;
        class84.field1608.method140(class165.method1132((byte) 97), (byte) 75);
        class84.field1608.method125(-25369, class175.field3046);
        if (arg0 != -54) {
            method259(15, true);
        }
        class84.field1608.method125(-25369, class78.field1429);
        class84.field1608.method140(class252.field4406, (byte) 75);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILkh;I)V", line = 306)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg0 >= -43) {
            method257(-54, -102);
        }
        if (arg2 == 0) {
            this.field520 = arg1.method93(false);
        } else if (arg2 == 1) {
            this.field527 = arg1.method93(false);
        } else if (arg2 == 2) {
            this.field3166 = arg1.method93(false) == 1;
        }
        field530++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLpk;)V", line = 353)
    public static final void method256(boolean arg0, class112 arg1) {
        arg1.field2025 = arg1.field1986;
        field517++;
        if (arg1.field2006 == 0) {
            arg1.field2005 = 0;
            return;
        }
        if (arg1.field2000 != -1 && arg1.field2016 == 0) {
            class194 var2 = class280.method1965(arg1.field2000, 103);
            if (arg1.field1985 > 0 && var2.field3359 == 0) {
                arg1.field2005++;
                return;
            }
            if (arg1.field1985 <= 0 && var2.field3370 == 0) {
                arg1.field2005++;
                return;
            }
        }
        int var3 = arg1.field2028;
        int var4 = arg1.field1983;
        int var5 = arg1.field2018[arg1.field2006 - 1] * 128 + (arg1.method299(true) * 64);
        int var6 = arg1.field2017[arg1.field2006 - 1] * 128 + (arg1.method299(true) * 64);
        if ((var5 - var4) > 256 || (var5 - var4) < -256 || var6 - var3 > 256 || (var6 - var3) < -256) {
            arg1.field1983 = var5;
            arg1.field2028 = var6;
            return;
        }
        if (var5 > var4) {
            if (var3 < var6) {
                arg1.field1964 = 1280;
            } else if (var6 >= var3) {
                arg1.field1964 = 1536;
            } else {
                arg1.field1964 = 1792;
            }
        } else if (var4 > var5) {
            if (var3 < var6) {
                arg1.field1964 = 768;
            } else if (var3 > var6) {
                arg1.field1964 = 256;
            } else {
                arg1.field1964 = 512;
            }
        } else if (var6 > var3) {
            arg1.field1964 = 1024;
        } else if (var3 > var6) {
            arg1.field1964 = 0;
        }
        int var7 = arg1.field2026;
        int var8 = arg1.field1964 - arg1.field1987 & 0x7FF;
        int var9 = 4;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg1.field1981;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg1.field2030;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg1.field2008;
        }
        boolean var10 = true;
        if (var7 == -1) {
            var7 = arg1.field1981;
        }
        arg1.field2025 = var7;
        if (arg0) {
            field529 = (int[]) null;
        }
        if (arg1 instanceof class331) {
            var10 = ((class331) arg1).field5631.field2900;
        }
        if (var10) {
            if (arg1.field1987 != arg1.field1964 && arg1.field1966 == -1 && arg1.field2004 != 0) {
                var9 = 2;
            }
            if (arg1.field2006 > 2) {
                var9 = 6;
            }
            if (arg1.field2006 > 3) {
                var9 = 8;
            }
            if (arg1.field2005 > 0 && arg1.field2006 > 1) {
                arg1.field2005--;
                var9 = 8;
            }
        } else {
            if (arg1.field2006 > 1) {
                var9 = 6;
            }
            if (arg1.field2006 > 2) {
                var9 = 8;
            }
            if (arg1.field2005 > 0 && arg1.field2006 > 1) {
                var9 = 8;
                arg1.field2005--;
            }
        }
        if (arg1.field2036[arg1.field2006 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 > var4) {
            arg1.field1983 += var9;
            if (var5 < arg1.field1983) {
                arg1.field1983 = var5;
            }
        } else if (var4 > var5) {
            arg1.field1983 -= var9;
            if (arg1.field1983 < var5) {
                arg1.field1983 = var5;
            }
        }
        if (var9 >= 8 && arg1.field2025 == arg1.field1981 && arg1.field2019 != -1) {
            arg1.field2025 = arg1.field2019;
        }
        if (var3 < var6) {
            arg1.field2028 += var9;
            if (var6 < arg1.field2028) {
                arg1.field2028 = var6;
            }
        } else if (var6 < var3) {
            arg1.field2028 -= var9;
            if (arg1.field2028 < var6) {
                arg1.field2028 = var6;
            }
        }
        if (arg1.field1983 == var5 && arg1.field2028 == var6) {
            if (arg1.field1985 > 0) {
                arg1.field1985--;
            }
            arg1.field2006--;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(II)Llk;", line = 560)
    public static final class281 method257(int arg0, int arg1) {
        field526++;
        class281 var2 = (class281) class57.field1009.method229((long) arg0, arg1 ^ 0x1337);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class167.field2862.method1275(arg0, 3, arg1 ^ 0x760);
        class281 var4 = new class281();
        if (arg1 != -4923) {
            return (class281) null;
        }
        if (var3 != null) {
            var4.method1972((byte) 87, new class14(var3));
        }
        class57.field1009.method227(-25077, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljf;B)V", line = 600)
    public static final void method258(class229 arg0, byte arg1) {
        int var2 = -104 % ((arg1 + 74) / 41);
        class225.method1548(false, (byte) -20);
        field516++;
        class270.method1906(arg0, (byte) -119);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V", line = 611)
    public static final void method259(int arg0, boolean arg1) {
        class16.field243 = arg0;
        if (!arg1) {
            method254(false);
        }
        field524++;
        class48.field867 = 50;
    }
}
