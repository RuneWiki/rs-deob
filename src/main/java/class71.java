import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class71 {

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "[I")
    private int[] field1244;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "[I")
    private int[] field1242;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "[B")
    private byte[] field1234;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1238 = "Select";

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "[Lem;")
    public static class285[] field1243;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 4)
    public static final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class232 var20 = new class232(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class129.field2184[var21][arg1][arg2] == null) {
                    class129.field2184[var21][arg1][arg2] = new class36(var21, arg1, arg2);
                }
            }
            class129.field2184[arg0][arg1][arg2].field529 = var20;
        } else if (arg3 == 1) {
            class232 var22 = new class232(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class129.field2184[var23][arg1][arg2] == null) {
                    class129.field2184[var23][arg1][arg2] = new class36(var23, arg1, arg2);
                }
            }
            class129.field2184[arg0][arg1][arg2].field529 = var22;
        } else {
            class15 var24 = new class15(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class129.field2184[var25][arg1][arg2] == null) {
                    class129.field2184[var25][arg1][arg2] = new class36(var25, arg1, arg2);
                }
            }
            class129.field2184[arg0][arg1][arg2].field530 = var24;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)Z", line = 53)
    public static final boolean method603(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class281.field4613 * arg0 + class279.field4597 * arg3 >> 16;
        int var6 = class281.field4613 * arg3 - class279.field4597 * arg0 >> 16;
        int var7 = class75.field1284 * var6 + class130.field2196 * arg1 >> 16;
        int var8 = class75.field1284 * arg1 - class130.field2196 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class75.field1284 * var6 + class130.field2196 * arg2 >> 16;
        int var12 = class75.field1284 * arg2 - class130.field2196 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class45.field702 && var13 < class45.field702) {
            return false;
        } else if (var9 > class338.field5393 && var13 > class338.field5393) {
            return false;
        } else if (var10 < class241.field3987 && var14 < class241.field3987) {
            return false;
        } else {
            return var10 <= class338.field5385 || var14 <= class338.field5385;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lqm;I)Lco;", line = 100)
    public static final class298 method604(class227 arg0, int arg1) {
        if (arg1 != 6181) {
            method602(124, 19, 33, -70, -72, -72, 105, 24, -122, 59, -40, 45, 70, -123, -95, 25, -100, -57, 58, 32);
        }
        field1236++;
        return new class298(arg0.method1769(-30726), arg0.method1769(arg1 - 36907), arg0.method1769(-30726), arg0.method1769(-30726), arg0.method1736(255), arg0.method1736(255), arg0.method1720((byte) -67));
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 117)
    public static void method605(int arg0) {
        field1243 = null;
        if (arg0 == -1954419165) {
            field1238 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[B[BII)I", line = 129)
    public final int method606(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        field1233++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg1;
        int var8 = arg0 + arg5;
        int var9 = arg4;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field1242[var7];
            }
            int var11;
            if ((var11 = this.field1242[var7]) < 0) {
                arg3[arg5++] = (byte) (~var11);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field1242[var7];
            }
            int var12;
            if ((var12 = this.field1242[var7]) < 0) {
                arg3[arg5++] = (byte) (~var12);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field1242[var7];
            }
            int var13;
            if ((var13 = this.field1242[var7]) < 0) {
                arg3[arg5++] = (byte) (~var13);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field1242[var7];
            }
            int var14;
            if ((var14 = this.field1242[var7]) < 0) {
                arg3[arg5++] = (byte) (~var14);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field1242[var7];
            }
            int var15;
            if ((var15 = this.field1242[var7]) < 0) {
                arg3[arg5++] = (byte) (~var15);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field1242[var7];
            }
            int var16;
            if ((var16 = this.field1242[var7]) < 0) {
                arg3[arg5++] = (byte) (~var16);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field1242[var7];
            }
            int var17;
            if ((var17 = this.field1242[var7]) < 0) {
                arg3[arg5++] = (byte) (~var17);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field1242[var7];
            }
            int var18;
            if ((var18 = this.field1242[var7]) < 0) {
                arg3[arg5++] = (byte) (~var18);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II[B[BII)I", line = 278)
    public final int method607(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        if (arg0 != -26218) {
            return -68;
        }
        int var7 = arg1 + arg4;
        field1235++;
        int var8 = arg5 << 3;
        int var9 = 0;
        while (arg1 < var7) {
            int var10 = arg2[arg1] & 0xFF;
            int var11 = this.field1244[var10];
            byte var12 = this.field1234[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            var8 += var12;
            int var15 = var9 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var9 = class75.method624(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var9 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var9 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var9 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 348)
    public static final void method608(int arg0) {
        class159.field2538.method2326(-4);
        field1241++;
        if (arg0 != 0) {
            method602(-42, 66, -31, -61, 18, -98, 3, 108, -125, 40, 123, -76, 95, -80, -52, 54, 66, 50, 25, 110);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BC)C", line = 359)
    public static final char method609(byte arg0, char arg1) {
        field1240++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            if (arg0 < 0) {
                field1243 = (class285[]) null;
            }
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 390)
    public static final int method610(String arg0, byte arg1) {
        int var2 = arg0.length();
        field1239++;
        int var3 = 0;
        if (arg1 != -124) {
            field1238 = (String) null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg0.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "([B)V", line = 418)
    public class71(byte[] arg0) {
        int var2 = arg0.length;
        this.field1244 = new int[var2];
        this.field1242 = new int[8];
        int[] var3 = new int[33];
        this.field1234 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1244[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class75.method624(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1242[var14] == 0) {
                            this.field1242[var14] = var4;
                        }
                        var14 = this.field1242[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1242.length <= var14) {
                        int[] var18 = new int[this.field1242.length * 2];
                        for (int var19 = 0; var19 < this.field1242.length; var19++) {
                            var18[var19] = this.field1242[var19];
                        }
                        this.field1242 = var18;
                    }
                }
                this.field1242[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
