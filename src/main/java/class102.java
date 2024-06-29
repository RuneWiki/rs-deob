import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class102 {

    @OriginalMember(owner = "client!je", name = "f", descriptor = "[B")
    private byte[] field1894;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "[I")
    private int[] field1890;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "[I")
    private int[] field1896;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lvd;")
    private static class222 field1904 = class212.method1357("scroll:", 10731);

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lvd;")
    public static class222 field1895 = field1904;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Lvd;")
    public static class222 field1900 = field1904;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lvd;")
    private static class222 field1905 = class212.method1357("Too many connections from your address)3", 10731);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lvd;")
    public static class222 field1889 = field1905;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lba;")
    public static class13 field1902;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Lab;")
    public static class3 field1898;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V")
    public static final void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1901++;
        if (arg4 != -33) {
            field1898 = null;
        }
        if (arg1 == arg5) {
            class206.method1326(arg2, arg3, arg0, false, arg5);
        } else if (class112.field2107 <= arg3 - arg5 && class127.field2448 >= arg3 + arg5 && arg2 - arg1 >= class129.field2514 && class230.field4322 >= arg1 + arg2) {
            class174.method1098(arg0, arg2, arg4 - 32579, arg5, arg1, arg3);
        } else {
            class232.method1524((byte) -6, arg5, arg1, arg0, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[BI[BI)I")
    public final int method632(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field1891++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg5;
        int var9 = arg1;
        if (arg3 != 7) {
            method635(-2);
        }
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var7 = this.field1896[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field1896[var7]) < 0) {
                arg2[arg0++] = (byte) ~var11;
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field1896[var7];
            }
            int var12;
            if ((var12 = this.field1896[var7]) < 0) {
                arg2[arg0++] = (byte) ~var12;
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field1896[var7];
            }
            int var13;
            if ((var13 = this.field1896[var7]) < 0) {
                arg2[arg0++] = (byte) ~var13;
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field1896[var7];
            }
            int var14;
            if ((var14 = this.field1896[var7]) < 0) {
                arg2[arg0++] = (byte) ~var14;
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field1896[var7];
            }
            int var15;
            if ((var15 = this.field1896[var7]) < 0) {
                arg2[arg0++] = (byte) ~var15;
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field1896[var7];
            }
            int var16;
            if ((var16 = this.field1896[var7]) < 0) {
                arg2[arg0++] = (byte) ~var16;
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field1896[var7];
            }
            int var17;
            if ((var17 = this.field1896[var7]) < 0) {
                arg2[arg0++] = (byte) ~var17;
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field1896[var7];
            }
            int var18;
            if ((var18 = this.field1896[var7]) < 0) {
                arg2[arg0++] = (byte) ~var18;
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static final void method633(int arg0) {
        class21.field505.method1343(true);
        int var1 = class21.field505.method1350(1, 7);
        field1897++;
        if (var1 == 0) {
            return;
        }
        int var2 = class21.field505.method1350(2, 7);
        if (var2 == 0) {
            class122.field2341[class162.field3088++] = 2047;
        } else if (var2 == 1) {
            int var3 = class21.field505.method1350(3, 7);
            class17.field432.method476(false, var3, false);
            int var4 = class21.field505.method1350(1, 7);
            if (var4 == 1) {
                class122.field2341[class162.field3088++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class21.field505.method1350(3, 7);
            class17.field432.method476(true, var5, false);
            int var6 = class21.field505.method1350(3, arg0 ^ 0xFFFFFFFB);
            class17.field432.method476(true, var6, false);
            int var7 = class21.field505.method1350(1, 7);
            if (var7 == 1) {
                class122.field2341[class162.field3088++] = 2047;
            }
        } else if (~var2 == arg0) {
            int var8 = class21.field505.method1350(1, 7);
            if (var8 == 1) {
                class122.field2341[class162.field3088++] = 2047;
            }
            int var9 = class21.field505.method1350(7, arg0 ^ 0xFFFFFFFB);
            int var10 = class21.field505.method1350(1, arg0 + 11);
            class217.field4036 = class21.field505.method1350(2, 7);
            int var11 = class21.field505.method1350(7, 7);
            class17.field432.method477(var11, var9, -123, ~var10 == -2);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BBII[BI)I")
    public final int method634(byte[] arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg2 + arg5;
        int var8 = 0;
        if (arg1 != -11) {
            this.method632(-65, -69, null, 48, null, 46);
        }
        field1893++;
        int var9 = arg3 << 3;
        while (var7 > arg5) {
            int var10 = arg4[arg5] & 0xFF;
            int var11 = this.field1890[var10];
            byte var12 = this.field1894[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = (var14 + var12 - 1 >> 3) + var13;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var8 = class213.method1361(var16, var11 >>> var17));
            if (var15 > var13) {
                var14 = var17 - 8;
                var13++;
                arg0[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var8 = var11 >>> var14);
                    if (var15 > var13) {
                        var14 -= 8;
                        var13++;
                        arg0[var13] = (byte) (var8 = var11 >>> var14);
                        if (var15 > var13) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public static void method635(int arg0) {
        field1900 = null;
        field1898 = null;
        int var1 = -47 % ((arg0 - 49) / 54);
        field1902 = null;
        field1889 = null;
        field1904 = null;
        field1895 = null;
        field1905 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([B[Lag;IBI)V")
    public static final void method636(byte[] arg0, class8[] arg1, int arg2, byte arg3, int arg4) {
        int var5 = 112 % ((-arg3 - 32) / 41);
        class109 var6 = new class109(arg0);
        field1903++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method685(false);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method699(15784);
                if (var10 == 0) {
                    break;
                }
                int var11 = var6.method662((byte) -116);
                var9 += var10 - 1;
                int var12 = var11 >> 2;
                int var13 = var9 >> 12;
                int var14 = var9 >> 6 & 0x3F;
                int var15 = var11 & 0x3;
                int var16 = var9 & 0x3F;
                int var17 = arg2 + var14;
                int var18 = arg4 + var16;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    int var19 = var13;
                    if ((class161.field3074[1][var17][var18] & 0x2) == 2) {
                        var19 = var13 - 1;
                    }
                    class8 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg1[var19];
                    }
                    class108.method658(var18, var12, -1, var15, var17, true, var7, var13, var20, var13, class122.field2331);
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
    public class102(byte[] arg0) {
        int var2 = arg0.length;
        this.field1894 = arg0;
        this.field1890 = new int[var2];
        this.field1896 = new int[8];
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1890[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class213.method1361(var11, var12);
                    }
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1896[var14] == 0) {
                            this.field1896[var14] = var3;
                        }
                        var14 = this.field1896[var14];
                    }
                    if (var14 >= this.field1896.length) {
                        int[] var17 = new int[this.field1896.length * 2];
                        for (int var18 = 0; var18 < this.field1896.length; var18++) {
                            var17[var18] = this.field1896[var18];
                        }
                        this.field1896 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field1896[var14] = ~var5;
            }
        }
    }
}
