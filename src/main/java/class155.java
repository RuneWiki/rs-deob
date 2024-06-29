import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class155 {

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "[B")
    private byte[] field1966;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "[I")
    private int[] field1960;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[I")
    private int[] field1968;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Lkg;")
    public static class179 field1964 = new class179(12, -1);

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "[I")
    public static int[] field1970 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "[Z")
    public static boolean[] field1971 = new boolean[8];

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lgj;")
    public static class450 field1965;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1010(boolean arg0) {
        field1964 = null;
        field1965 = null;
        field1970 = null;
        field1971 = null;
        if (arg0) {
            method1015(-27);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 22)
    public static final String method1011(int arg0, int arg1, byte[] arg2, int arg3) {
        field1967++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg2[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = client.field2575[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg3 != 9716) {
            field1965 = null;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([BII[BII)I", line = 63)
    public final int method1012(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field1969++;
        int var7 = 0;
        int var8 = arg1 + arg2;
        int var9 = 68 % ((-arg4 - 20) / 61);
        int var10 = arg5 << 3;
        while (arg2 < var8) {
            int var11 = arg3[arg2] & 0xFF;
            int var12 = this.field1960[var11];
            byte var13 = this.field1966[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 >> 3;
            int var15 = var10 & 0x7;
            int var16 = var7 & -var15 >> 31;
            int var17 = (var15 + var13 - 1 >> 3) + var14;
            var10 += var13;
            int var18 = var15 + 24;
            arg0[var14] = (byte) (var7 = class215.method1323(var16, var12 >>> var18));
            if (var14 < var17) {
                var14++;
                var15 = var18 - 8;
                arg0[var14] = (byte) (var7 = var12 >>> var15);
                if (var17 > var14) {
                    var15 -= 8;
                    var14++;
                    arg0[var14] = (byte) (var7 = var12 >>> var15);
                    if (var17 > var14) {
                        var15 -= 8;
                        var14++;
                        arg0[var14] = (byte) (var7 = var12 >>> var15);
                        if (var14 < var17) {
                            var14++;
                            var15 -= 8;
                            arg0[var14] = (byte) (var7 = var12 << -var15);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var10 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZIIII[BI[B)V", line = 139)
    public static final void method1013(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, byte[] arg8) {
        field1962++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        int var11 = -arg5;
        if (arg1) {
            field1964 = null;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg8[var10001] = (byte) (arg8[var10001] - arg6[arg3++]);
                int var14 = arg4++;
                arg8[var14] = (byte) (arg8[var14] - arg6[arg3++]);
                int var15 = arg4++;
                arg8[var15] = (byte) (arg8[var15] - arg6[arg3++]);
                int var16 = arg4++;
                arg8[var16] = (byte) (arg8[var16] - arg6[arg3++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg8[var10001] = (byte) (arg8[var10001] - arg6[arg3++]);
            }
            arg4 += arg0;
            arg3 += arg2;
            var11++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[BIB[B)I", line = 183)
    public final int method1014(int arg0, int arg1, byte[] arg2, int arg3, byte arg4, byte[] arg5) {
        field1963++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg1 + arg3;
        int var9 = arg0;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var7 = this.field1968[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field1968[var7]) < 0) {
                arg5[arg3++] = (byte) (~var11);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field1968[var7];
            }
            int var12;
            if ((var12 = this.field1968[var7]) < 0) {
                arg5[arg3++] = (byte) (~var12);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field1968[var7];
            }
            int var13;
            if ((var13 = this.field1968[var7]) < 0) {
                arg5[arg3++] = (byte) (~var13);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field1968[var7];
            }
            int var14;
            if ((var14 = this.field1968[var7]) < 0) {
                arg5[arg3++] = (byte) (~var14);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field1968[var7];
            }
            int var15;
            if ((var15 = this.field1968[var7]) < 0) {
                arg5[arg3++] = (byte) (~var15);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field1968[var7];
            }
            int var16;
            if ((var16 = this.field1968[var7]) < 0) {
                arg5[arg3++] = (byte) (~var16);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field1968[var7];
            }
            int var17;
            if ((var17 = this.field1968[var7]) < 0) {
                arg5[arg3++] = (byte) (~var17);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field1968[var7];
            }
            int var18;
            if ((var18 = this.field1968[var7]) < 0) {
                arg5[arg3++] = (byte) (~var18);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        if (arg4 >= -45) {
            this.field1960 = null;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 335)
    public static final void method1015(int arg0) {
        client.field2572.method2642(0);
        field1961++;
        class240.field3085.method2642(0);
        class109.field1476.method2642(0);
        if (arg0 == 14584) {
            class91.field1117.method2642(0);
            class159.field2028.method2642(0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([B)V", line = 362)
    public class155(byte[] arg0) {
        int var2 = arg0.length;
        this.field1966 = arg0;
        this.field1960 = new int[var2];
        this.field1968 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1960[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class215.method1323(var10, var11);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1968[var14] == 0) {
                            this.field1968[var14] = var4;
                        }
                        var14 = this.field1968[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field1968.length) {
                        int[] var18 = new int[this.field1968.length * 2];
                        for (int var19 = 0; var19 < this.field1968.length; var19++) {
                            var18[var19] = this.field1968[var19];
                        }
                        this.field1968 = var18;
                    }
                }
                this.field1968[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
