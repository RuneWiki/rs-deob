import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class126 {

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "[I")
    private int[] field2859;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "[B")
    private byte[] field2858;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
    private int[] field2847;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[I")
    public static int[] field2849 = new int[2000];

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field2850 = 0;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lsc;")
    public static class128 field2855 = class129.method1017(false, "Art");

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lsc;")
    private static class128 field2852 = class129.method1017(false, "wishes to trade with you)3");

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Lsc;")
    public static class128 field2862 = class129.method1017(false, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Lsc;")
    public static class128 field2863 = field2852;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lsc;")
    public static class128 field2864 = class129.method1017(false, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field2857 = 0;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILsc;Lsc;)V")
    public static final void method958(int arg0, int arg1, class128 arg2, class128 arg3) {
        if (arg1 != 1) {
            field2852 = null;
        }
        class16.method153(null, arg0, arg3, 16799, arg2);
        field2856++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lsf;ILsc;Lsc;IZ)V")
    public static final void method959(class131 arg0, int arg1, class128 arg2, class128 arg3, int arg4, boolean arg5) {
        field2846++;
        int var6 = arg0.method1036(arg2, (byte) -103);
        int var7 = arg0.method1031(var6, arg3, (byte) -127);
        if (arg1 <= 42) {
            field2862 = null;
        }
        class79.method595(var7, arg0, 1, var6, arg5, arg4);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIII[BB)I")
    public final int method960(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5) {
        field2865++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg2 + arg3;
        int var8 = 0;
        int var9 = -107 / ((arg5 - 3) / 63);
        int var10 = arg1;
        while (true) {
            byte var11 = arg4[var10];
            if (var11 < 0) {
                var8 = this.field2859[var8];
            } else {
                var8++;
            }
            int var12;
            if ((var12 = this.field2859[var8]) < 0) {
                arg0[arg2++] = (byte) ~var12;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2859[var8];
            }
            int var13;
            if ((var13 = this.field2859[var8]) < 0) {
                arg0[arg2++] = (byte) ~var13;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2859[var8];
            }
            int var14;
            if ((var14 = this.field2859[var8]) < 0) {
                arg0[arg2++] = (byte) ~var14;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2859[var8];
            }
            int var15;
            if ((var15 = this.field2859[var8]) < 0) {
                arg0[arg2++] = (byte) ~var15;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2859[var8];
            }
            int var16;
            if ((var16 = this.field2859[var8]) < 0) {
                arg0[arg2++] = (byte) ~var16;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2859[var8];
            }
            int var17;
            if ((var17 = this.field2859[var8]) < 0) {
                arg0[arg2++] = (byte) ~var17;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2859[var8];
            }
            int var18;
            if ((var18 = this.field2859[var8]) < 0) {
                arg0[arg2++] = (byte) ~var18;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2859[var8];
            }
            int var19;
            if ((var19 = this.field2859[var8]) < 0) {
                arg0[arg2++] = (byte) ~var19;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static final void method961(byte arg0) {
        if (arg0 > -30) {
            field2864 = null;
        }
        field2854++;
        while (true) {
            class121 var1 = class131.field3026;
            class102 var2;
            synchronized (class131.field3026) {
                var2 = (class102) class35.field655.method928((byte) 80);
            }
            if (var2 == null) {
                return;
            }
            var2.field2337.method20(var2.field2330, var2.field2321, false, (byte) 63, (int) var2.field365);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[B[BII)I")
    public final int method962(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = arg1 + arg5;
        field2848++;
        int var8 = arg4;
        int var9 = arg0 << 3;
        while (arg5 < var7) {
            int var10 = arg3[arg5] & 0xFF;
            int var11 = this.field2847[var10];
            byte var12 = this.field2858[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var9 >> 3;
            var9 += var12;
            int var16 = (var13 + var12 - 1 >> 3) + var15;
            int var17 = var13 + 24;
            arg2[var15] = (byte) (var8 = class97.method751(var14, var11 >>> var17));
            if (var16 > var15) {
                var13 = var17 - 8;
                var15++;
                arg2[var15] = (byte) (var8 = var11 >>> var13);
                if (var15 < var16) {
                    var15++;
                    var13 -= 8;
                    arg2[var15] = (byte) (var8 = var11 >>> var13);
                    if (var15 < var16) {
                        var15++;
                        var13 -= 8;
                        arg2[var15] = (byte) (var8 = var11 >>> var13);
                        if (var15 < var16) {
                            var15++;
                            var13 -= 8;
                            arg2[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method963(int arg0) {
        field2863 = null;
        field2849 = null;
        field2864 = null;
        int var1 = 24 / ((arg0 + 6) / 37);
        field2862 = null;
        field2852 = null;
        field2855 = null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([B)V")
    public class126(byte[] arg0) {
        int var2 = arg0.length;
        this.field2859 = new int[8];
        this.field2858 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        this.field2847 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2847[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class97.method751(var12, var11);
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
                        if (this.field2859[var14] == 0) {
                            this.field2859[var14] = var4;
                        }
                        var14 = this.field2859[var14];
                    }
                    if (this.field2859.length <= var14) {
                        int[] var17 = new int[this.field2859.length * 2];
                        for (int var18 = 0; var18 < this.field2859.length; var18++) {
                            var17[var18] = this.field2859[var18];
                        }
                        this.field2859 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field2859[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
