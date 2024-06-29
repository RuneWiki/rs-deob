import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class181 {

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "[I")
    private int[] field3328;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "[I")
    private int[] field3326;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "[B")
    private byte[] field3327;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "[I")
    public static int[] field3320 = new int[] { 0, 0, 24, 0, 0, 0, 1, 8, 6, 0, 6, 0, -2, 0, 0, 5, 0, 0, 0, 0, 0, 7, 3, 0, 10, 6, 0, 2, 0, -1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 2, 0, 0, 0, 0, 0, 0, 0, 4, 0, 2, 0, 0, 0, 8, 0, 0, 4, 0, 0, 5, 0, 0, 8, 0, -1, 2, 0, 15, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 3, 0, 0, -1, 0, 0, 0, 0, -2, 1, 0, 0, 6, 4, 0, 0, -2, 0, 5, 0, 0, -1, 1, 0, 0, 4, 0, 0, 0, 0, 0, 9, 0, 0, 0, -2, 5, 3, 6, -2, 5, 0, 0, 6, 0, 0, 0, 10, 0, -1, 0, 7, 0, 0, -1, 0, 0, -1, 3, 0, 0, 0, 0, 0, 0, -1, -2, 0, 0, 4, 0, 0, 0, -1, -2, -2, -2, 0, 5, 0, -1, -1, 14, 0, 0, 2, -2, 0, 0, 6, 0, 7, 12, 0, 0, -2, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 6, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 3, 0, 0, 0, 0, -1, 0, 0 };

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Lmb;")
    private static class132 field3331 = class166.method1092("Select", 115);

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lmb;")
    public static class132 field3324 = field3331;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field3329 = 0;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Lbg;")
    public static class19 field3325 = new class19();

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Lmb;")
    public static class132 field3333 = class166.method1092(")3runescape)3com", 120);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "[I")
    public static int[] field3332;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[S")
    public static short[] field3319;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II[BII[B)I")
    public final int method1162(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field3330++;
        int var7 = 0;
        int var8 = arg4 << 3;
        int var9 = -8 / ((arg3 + 7) / 43);
        int var10 = arg0 + arg1;
        while (arg1 < var10) {
            int var11 = arg2[arg1] & 0xFF;
            int var12 = this.field3328[var11];
            byte var13 = this.field3327[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var8 >> 3;
            int var15 = var8 & 0x7;
            int var16 = (var13 + var15 - 1 >> 3) + var14;
            int var17 = var7 & -var15 >> 31;
            int var18 = var15 + 24;
            arg5[var14] = (byte) (var7 = class219.method1368(var17, var12 >>> var18));
            if (var16 > var14) {
                var14++;
                var15 = var18 - 8;
                arg5[var14] = (byte) (var7 = var12 >>> var15);
                if (var16 > var14) {
                    var14++;
                    var15 -= 8;
                    arg5[var14] = (byte) (var7 = var12 >>> var15);
                    if (var16 > var14) {
                        var15 -= 8;
                        var14++;
                        arg5[var14] = (byte) (var7 = var12 >>> var15);
                        if (var14 < var16) {
                            var15 -= 8;
                            var14++;
                            arg5[var14] = (byte) (var7 = var12 << -var15);
                        }
                    }
                }
            }
            var8 += var13;
            arg1++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1163(int arg0) {
        field3332 = null;
        field3320 = null;
        if (arg0 != -1) {
            method1163(104);
        }
        field3324 = null;
        field3325 = null;
        field3333 = null;
        field3331 = null;
        field3319 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static final void method1164(byte arg0) {
        field3323++;
        class89.field1566.method778((byte) 100);
        if (arg0 != 61) {
            method1163(-56);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIILmf;Lmf;IIJ)V")
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, class136 arg4, class136 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class186 var10 = new class186();
        var10.field3439 = arg8;
        var10.field3453 = arg1 * 128 + 64;
        var10.field3456 = arg2 * 128 + 64;
        var10.field3455 = arg3;
        var10.field3440 = arg4;
        var10.field3449 = arg5;
        var10.field3454 = arg6;
        var10.field3444 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class101.field1900[var11][arg1][arg2] == null) {
                class101.field1900[var11][arg1][arg2] = new class169(var11, arg1, arg2);
            }
        }
        class101.field1900[arg0][arg1][arg2].field3098 = var10;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI[BI[BI)I")
    public final int method1166(byte arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field3321++;
        if (arg1 == 0) {
            return 0;
        }
        if (arg0 >= -71) {
            this.method1166((byte) 119, 26, null, -51, null, 23);
        }
        int var7 = arg1 + arg5;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var8 = this.field3326[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field3326[var8]) < 0) {
                arg4[arg5++] = (byte) ~var11;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3326[var8];
            }
            int var12;
            if ((var12 = this.field3326[var8]) < 0) {
                arg4[arg5++] = (byte) ~var12;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3326[var8];
            }
            int var13;
            if ((var13 = this.field3326[var8]) < 0) {
                arg4[arg5++] = (byte) ~var13;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3326[var8];
            }
            int var14;
            if ((var14 = this.field3326[var8]) < 0) {
                arg4[arg5++] = (byte) ~var14;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3326[var8];
            }
            int var15;
            if ((var15 = this.field3326[var8]) < 0) {
                arg4[arg5++] = (byte) ~var15;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3326[var8];
            }
            int var16;
            if ((var16 = this.field3326[var8]) < 0) {
                arg4[arg5++] = (byte) ~var16;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3326[var8];
            }
            int var17;
            if ((var17 = this.field3326[var8]) < 0) {
                arg4[arg5++] = (byte) ~var17;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3326[var8];
            }
            int var18;
            if ((var18 = this.field3326[var8]) < 0) {
                arg4[arg5++] = (byte) ~var18;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "([B)V")
    public class181(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field3328 = new int[var3];
        int var4 = 0;
        this.field3326 = new int[8];
        this.field3327 = arg0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field3328[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class219.method1368(var11, var12);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field3326[var14] == 0) {
                            this.field3326[var14] = var4;
                        }
                        var14 = this.field3326[var14];
                    }
                    if (var14 >= this.field3326.length) {
                        int[] var17 = new int[this.field3326.length * 2];
                        for (int var18 = 0; var18 < this.field3326.length; var18++) {
                            var17[var18] = this.field3326[var18];
                        }
                        this.field3326 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field3326[var14] = ~var5;
            }
        }
    }
}
