import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class55 {

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "[I")
    private int[] field725;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "[B")
    private byte[] field718;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "[I")
    private int[] field724;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "Lol;")
    public static class246 field722 = new class246(16);

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
    public static int[] field728 = new int[32];

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "Ljava/lang/String;")
    public static String field730 = "flash1:";

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Z")
    public static boolean field729 = false;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Lml;")
    public static class143 field732;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "Lug;")
    public static class321 field726;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([BB[BIII)I", line = 10)
    public final int method386(byte[] arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field717++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var8 = this.field724[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var11);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field724[var8];
            }
            int var12;
            if ((var12 = this.field724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var12);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field724[var8];
            }
            int var13;
            if ((var13 = this.field724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var13);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field724[var8];
            }
            int var14;
            if ((var14 = this.field724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var14);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field724[var8];
            }
            int var15;
            if ((var15 = this.field724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var15);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field724[var8];
            }
            int var16;
            if ((var16 = this.field724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var16);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field724[var8];
            }
            int var17;
            if ((var17 = this.field724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var17);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field724[var8];
            }
            int var18;
            if ((var18 = this.field724[var8]) < 0) {
                arg0[arg4++] = (byte) (~var18);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg1 > -87) {
            field731 = -40;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 161)
    public static void method387(byte arg0) {
        field732 = null;
        field726 = null;
        field722 = null;
        int var1 = 117 / ((-arg0 - 17) / 39);
        field728 = null;
        field730 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 174)
    public static final void method388(int arg0, int arg1, String arg2, String arg3, String arg4) {
        class192.method1405(arg2, arg0, arg4, arg1, arg3, 1637740768);
        field721++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 184)
    public static final void method389(int arg0) {
        if (arg0 == 8) {
            class202.field3301.method1623(1);
            field720++;
            class3.field21.method1623(1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIIB)I", line = 196)
    public static final int method390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg3;
            arg3 = var7;
        }
        if (arg6 != -69) {
            method393(-3, 74, 9, -15, -108);
        }
        int var8 = arg4 & 0x3;
        field719++;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg2 - arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 228)
    public static final void method391(int arg0) {
        class230.field3662++;
        class21.field313.method1541(-83, 98);
        class21.field313.method1365(-32769, class60.method416(arg0 ^ -14));
        field733++;
        if (arg0 != 1) {
            method387((byte) 44);
        }
        class21.field313.method1368(class160.field2601, 4796);
        class21.field313.method1368(class210.field3432, 4796);
        class21.field313.method1365(arg0 - 32770, class330.field5138);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II[BBI[B)I", line = 244)
    public final int method392(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, byte[] arg5) {
        field727++;
        int var7 = arg1 + arg4;
        int var8 = 38 / ((arg3 + 69) / 33);
        int var9 = 0;
        int var10 = arg0 << 3;
        while (var7 > arg1) {
            int var11 = arg2[arg1] & 0xFF;
            int var12 = this.field725[var11];
            byte var13 = this.field718[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 >> 3;
            int var15 = var10 & 0x7;
            int var16 = var9 & -var15 >> 31;
            int var17 = (var15 + var13 - 1 >> 3) + var14;
            var10 += var13;
            int var18 = var15 + 24;
            arg5[var14] = (byte) (var9 = class24.method149(var16, var12 >>> var18));
            if (var17 > var14) {
                var14++;
                var15 = var18 - 8;
                arg5[var14] = (byte) (var9 = var12 >>> var15);
                if (var17 > var14) {
                    var14++;
                    var15 -= 8;
                    arg5[var14] = (byte) (var9 = var12 >>> var15);
                    if (var14 < var17) {
                        var14++;
                        var15 -= 8;
                        arg5[var14] = (byte) (var9 = var12 >>> var15);
                        if (var14 < var17) {
                            var15 -= 8;
                            var14++;
                            arg5[var14] = (byte) (var9 = var12 << -var15);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var10 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V", line = 314)
    public static final void method393(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class224.field3575 <= arg0 && arg0 <= class231.field3697) {
            int var5 = class235.method1685(arg4, class235.field3735, class233.field3721, 104);
            int var6 = class235.method1685(arg2, class235.field3735, class233.field3721, 115);
            class290.method2036(var5, var6, arg3, arg0, 16);
        }
        if (arg1 != -5441) {
            method387((byte) 62);
        }
        field723++;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([B)V", line = 366)
    public class55(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field725 = new int[var3];
        this.field718 = arg0;
        this.field724 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field725[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class24.method149(var12, var11);
                    }
                    var9 = var7 | var8;
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
                        if (this.field724[var14] == 0) {
                            this.field724[var14] = var4;
                        }
                        var14 = this.field724[var14];
                    }
                    if (this.field724.length <= var14) {
                        int[] var17 = new int[this.field724.length * 2];
                        for (int var18 = 0; var18 < this.field724.length; var18++) {
                            var17[var18] = this.field724[var18];
                        }
                        this.field724 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field724[var14] = ~var5;
            }
        }
    }
}
