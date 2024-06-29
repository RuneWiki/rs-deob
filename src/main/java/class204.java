import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class204 {

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "[B")
    private byte[] field3451;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "[I")
    private int[] field3448;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "[I")
    private int[] field3449;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lbd;")
    public static class162 field3447 = class17.method142(0, "<col=c0ff00>");

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field3452 = 0;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lbd;")
    public static class162 field3444 = class17.method142(0, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[Llb;")
    public static class60[] field3446 = new class60[32768];

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lbd;")
    public static class162 field3454 = class17.method142(0, "Nehmen");

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field3457 = 0;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lda;")
    public static class143 field3450;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "[[B")
    public static byte[][] field3455;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BII[BII)I", line = 6)
    public final int method1514(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = arg2 + arg5;
        int var8 = 109 / ((arg1 + 7) / 45);
        int var9 = arg4 << 3;
        field3445++;
        int var10 = 0;
        while (arg5 < var7) {
            int var11 = arg3[arg5] & 0xFF;
            int var12 = this.field3448[var11];
            byte var13 = this.field3451[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var9 >> 3;
            int var15 = var9 & 0x7;
            int var16 = var10 & -var15 >> 31;
            var9 += var13;
            int var17 = (var15 + var13 - 1 >> 3) + var14;
            int var18 = var15 + 24;
            arg0[var14] = (byte) (var10 = class289.method2005(var16, var12 >>> var18));
            if (var14 < var17) {
                var15 = var18 - 8;
                var14++;
                arg0[var14] = (byte) (var10 = var12 >>> var15);
                if (var17 > var14) {
                    var14++;
                    var15 -= 8;
                    arg0[var14] = (byte) (var10 = var12 >>> var15);
                    if (var14 < var17) {
                        var14++;
                        var15 -= 8;
                        arg0[var14] = (byte) (var10 = var12 >>> var15);
                        if (var14 < var17) {
                            var15 -= 8;
                            var14++;
                            arg0[var14] = (byte) (var10 = var12 << -var15);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZIIII)V", line = 80)
    public static final void method1515(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3456++;
        if (!arg1) {
            method1515(50, true, 40, 34, -113, -121);
        }
        if (arg2 > class298.field4989 || arg3 < class303.field5106) {
            return;
        }
        boolean var6;
        if (class112.field2028 > arg4) {
            var6 = false;
            arg4 = class112.field2028;
        } else if (arg4 > class82.field1426) {
            var6 = false;
            arg4 = class82.field1426;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg0 < class112.field2028) {
            var7 = false;
            arg0 = class112.field2028;
        } else if (class82.field1426 < arg0) {
            var7 = false;
            arg0 = class82.field1426;
        } else {
            var7 = true;
        }
        if (arg2 >= class303.field5106) {
            class3.method14(arg5, arg4, arg0, class184.field3180[arg2++], -116);
        } else {
            arg2 = class303.field5106;
        }
        if (arg3 > class298.field4989) {
            arg3 = class298.field4989;
        } else {
            class3.method14(arg5, arg4, arg0, class184.field3180[arg3--], -119);
        }
        if (var6 && var7) {
            for (int var8 = arg2; var8 <= arg3; var8++) {
                int[] var9 = class184.field3180[var8];
                var9[arg4] = var9[arg0] = arg5;
            }
        } else if (var6) {
            for (int var11 = arg2; var11 <= arg3; var11++) {
                class184.field3180[var11][arg4] = arg5;
            }
        } else if (var7) {
            for (int var10 = arg2; var10 <= arg3; var10++) {
                class184.field3180[var10][arg0] = arg5;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BIB[BII)I", line = 191)
    public final int method1516(byte[] arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5) {
        if (arg2 != 38) {
            this.field3451 = (byte[]) null;
        }
        field3453++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg1 + arg5;
        int var9 = arg4;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field3449[var7];
            }
            int var11;
            if ((var11 = this.field3449[var7]) < 0) {
                arg0[arg1++] = (byte) (~var11);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field3449[var7];
            }
            int var12;
            if ((var12 = this.field3449[var7]) < 0) {
                arg0[arg1++] = (byte) (~var12);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field3449[var7];
            }
            int var13;
            if ((var13 = this.field3449[var7]) < 0) {
                arg0[arg1++] = (byte) (~var13);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field3449[var7];
            }
            int var14;
            if ((var14 = this.field3449[var7]) < 0) {
                arg0[arg1++] = (byte) (~var14);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field3449[var7];
            }
            int var15;
            if ((var15 = this.field3449[var7]) < 0) {
                arg0[arg1++] = (byte) (~var15);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field3449[var7];
            }
            int var16;
            if ((var16 = this.field3449[var7]) < 0) {
                arg0[arg1++] = (byte) (~var16);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field3449[var7];
            }
            int var17;
            if ((var17 = this.field3449[var7]) < 0) {
                arg0[arg1++] = (byte) (~var17);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field3449[var7];
            }
            int var18;
            if ((var18 = this.field3449[var7]) < 0) {
                arg0[arg1++] = (byte) (~var18);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([B)V", line = 352)
    public class204(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = 0;
        int var4 = arg0.length;
        this.field3451 = arg0;
        this.field3448 = new int[var4];
        this.field3449 = new int[8];
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field3448[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var2[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var2[var9] = var2[var9 - 1];
                            break;
                        }
                        var2[var9] = class289.method2005(var10, var11);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var2[var6 - 1];
                }
                var2[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3449[var14] == 0) {
                            this.field3449[var14] = var3;
                        }
                        var14 = this.field3449[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field3449.length) {
                        int[] var18 = new int[this.field3449.length * 2];
                        for (int var19 = 0; var19 < this.field3449.length; var19++) {
                            var18[var19] = this.field3449[var19];
                        }
                        this.field3449 = var18;
                    }
                }
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
                this.field3449[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 490)
    public static void method1517(int arg0) {
        if (arg0 != 13835) {
            return;
        }
        field3454 = null;
        field3444 = null;
        field3455 = (byte[][]) null;
        field3446 = null;
        field3447 = null;
        field3450 = null;
    }
}
