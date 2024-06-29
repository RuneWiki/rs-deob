import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class612 extends class667 {

    @OriginalMember(owner = "client!jaa", name = "Q", descriptor = "I")
    private int field8859 = 0;

    @OriginalMember(owner = "client!jaa", name = "D", descriptor = "I")
    private int field8848 = 0;

    @OriginalMember(owner = "client!jaa", name = "X", descriptor = "I")
    private int field8866 = 0;

    @OriginalMember(owner = "client!jaa", name = "K", descriptor = "I")
    public static int field8854 = 100;

    @OriginalMember(owner = "client!jaa", name = "W", descriptor = "I")
    public static int field8865 = 0;

    @OriginalMember(owner = "client!jaa", name = "B", descriptor = "I")
    private int field8847;

    @OriginalMember(owner = "client!jaa", name = "E", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!jaa", name = "F", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!jaa", name = "G", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!jaa", name = "H", descriptor = "I")
    private int field8852;

    @OriginalMember(owner = "client!jaa", name = "I", descriptor = "I")
    private int field8853;

    @OriginalMember(owner = "client!jaa", name = "L", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!jaa", name = "O", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!jaa", name = "P", descriptor = "I")
    private int field8858;

    @OriginalMember(owner = "client!jaa", name = "R", descriptor = "I")
    private int field8860;

    @OriginalMember(owner = "client!jaa", name = "S", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!jaa", name = "T", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!jaa", name = "U", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!jaa", name = "V", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!jaa", name = "Y", descriptor = "I")
    private int field8867;

    @OriginalMember(owner = "client!jaa", name = "N", descriptor = "Lkha;")
    public static class580 field8856;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(III)I", line = 5)
    public static final int method3522(int arg0, int arg1, int arg2) {
        ++field8855;
        double var3 = Math.log((double) arg1) / Math.log(2.0D);
        double var5 = Math.log((double) arg2) / Math.log(2.0D);
        double var7 = var5 + Math.random() * (-var5 + var3);
        int var9 = -125 / ((-29 - arg0) / 36);
        return (int) (0.5D + Math.pow(2.0D, var7));
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lud;II)V", line = 22)
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field8859 = (arg0.method277((byte) -5) << 12) / 100;
                }
            } else {
                this.field8866 = (arg0.method277((byte) 85) << 12) / 100;
            }
        } else {
            this.field8848 = arg0.method225((byte) 125);
        }
        ++field8857;
        if (arg1 != 3) {
            field8865 = -8;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V", line = 75)
    public class612() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V", line = 81)
    public static void method3523(int arg0) {
        if (arg0 != -15157) {
            method3524((byte) 33, (class524) null);
        }
        field8856 = null;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZI)[[I", line = 93)
    public final int[][] method777(boolean arg0, int arg1) {
        ++field8864;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (arg0) {
            method3527((byte) -57, (byte[]) null);
        }
        if (super.field9357.field5178) {
            int[][] var4 = this.method3748(arg1, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class77.field1455 < ~var11; ++var11) {
                this.method3526(var7[var11], (byte) 92, var6[var11], var5[var11]);
                this.field8858 += this.field8866;
                this.field8860 += this.field8848;
                this.field8852 += this.field8859;
                while (this.field8860 < 0) {
                    this.field8860 += 4096;
                }
                if (~this.field8858 > -1) {
                    this.field8858 = 0;
                }
                while (~this.field8860 < -4097) {
                    this.field8860 -= 4096;
                }
                if (this.field8852 < 0) {
                    this.field8852 = 0;
                }
                if (this.field8858 > 4096) {
                    this.field8858 = 4096;
                }
                if (~this.field8852 < -4097) {
                    this.field8852 = 4096;
                }
                this.method3528(this.field8852, this.field8860, 75, this.field8858);
                var8[var11] = this.field8853;
                var9[var11] = this.field8867;
                var10[var11] = this.field8847;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLfd;)Z", line = 165)
    public static final boolean method3524(byte arg0, class524 arg1) {
        ++field8850;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field7443) {
            return false;
        } else {
            if (arg0 != 112) {
                field8856 = null;
            }
            if (!arg1.method3108(class542.field7613, 0)) {
                return false;
            } else if (class37.field552.method4203(true, (long) arg1.field7447) != null) {
                return false;
            } else {
                return class380.field5294.method4203(true, (long) arg1.field7414) == null;
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(JZ)Ljava/lang/String;", line = 199)
    public static final String method3525(long arg0, boolean arg1) {
        ++field8851;
        if (arg0 > 0L && arg0 < 6582952005840035281L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg0; ~var4 != -1L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg0 != -1L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    char var9 = class633.field9068[(int) (-(arg0 * 37L) + var7)];
                    if (var9 == '_') {
                        int var10 = var6.length() + -1;
                        var9 = 160;
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    }
                    var6.append(var9);
                }
                if (arg1) {
                    field8865 = 112;
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IBII)V", line = 253)
    private final void method3526(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > 81) {
            ++field8849;
            int var5 = ~arg2 > ~arg3 ? arg3 : arg2;
            int var6 = arg0 > var5 ? arg0 : var5;
            int var7 = arg2 > arg3 ? arg3 : arg2;
            int var8 = ~arg0 > ~var7 ? arg0 : var7;
            int var9 = -var8 + var6;
            this.field8852 = (var6 + var8) / 2;
            if (~var9 >= -1) {
                this.field8860 = 0;
            } else {
                int var10 = (var6 - arg3 << 12) / var9;
                int var11 = (-arg2 + var6 << 12) / var9;
                int var12 = (-arg0 + var6 << 12) / var9;
                if (~arg3 == ~var6) {
                    this.field8860 = ~arg2 == ~var8 ? var12 + 20480 : -var11 + 4096;
                } else if (~arg2 == ~var6) {
                    this.field8860 = arg0 != var8 ? -var12 + 12288 : var10 + 4096;
                } else {
                    this.field8860 = ~arg3 != ~var8 ? -var10 + 20480 : 12288 - -var11;
                }
                this.field8860 /= 6;
            }
            if (~this.field8852 < -1 && this.field8852 < 4096) {
                this.field8858 = (var9 << 12) / (this.field8852 > 2048 ? 8192 - this.field8852 * 2 : this.field8852 * 2);
            } else {
                this.field8858 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B[B)V", line = 310)
    public static final void method3527(byte arg0, byte[] arg1) {
        ++field8863;
        if (arg0 == -83) {
            class35 var2 = new class35(arg1);
            while (true) {
                int var3;
                label49: do {
                    while (true) {
                        while (true) {
                            var3 = var2.method273(255);
                            if (~var3 == -1) {
                                return;
                            }
                            if (~var3 != -2) {
                                if (~var3 != -5) {
                                    continue label49;
                                }
                                int var6 = var2.method273(255);
                                class40.field592 = new int[var6];
                                for (int var7 = 0; ~var7 > ~var6; ++var7) {
                                    class40.field592[var7] = var2.method253(arg0 + -13817);
                                    if (class40.field592[var7] == 65535) {
                                        class40.field592[var7] = -1;
                                    }
                                }
                            } else {
                                int[] var8 = class77.field1456 = new int[6];
                                var8[0] = var2.method253(-13900);
                                var8[1] = var2.method253(arg0 + -13817);
                                var8[2] = var2.method253(-13900);
                                var8[3] = var2.method253(arg0 + -13817);
                                var8[4] = var2.method253(-13900);
                                var8[5] = var2.method253(-13900);
                            }
                        }
                    }
                } while (~var3 != -6);
                int var4 = var2.method273(255);
                class131.field1955 = new int[var4];
                for (int var5 = 0; var4 > var5; ++var5) {
                    class131.field1955[var5] = var2.method253(arg0 + -13817);
                    if (~class131.field1955[var5] == -65536) {
                        class131.field1955[var5] = -1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIII)V", line = 386)
    private final void method3528(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -11 % ((arg2 - 9) / 61);
        ++field8861;
        int var6 = arg0 > 2048 ? -(arg0 * arg3 >> 12) + arg0 + arg3 : (arg3 + 4096) * arg0 >> 12;
        if (var6 > 0) {
            int var7 = arg1 * 6;
            int var8 = arg0 + arg0 + -var6;
            int var9 = (-var8 + var6 << 12) / var6;
            int var10 = var7 >> 12;
            int var11 = -(var10 << 12) + var7;
            int var13 = var9 * var6 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 + var14;
            int var16 = -var14 + var6;
            if (~var10 == -1) {
                this.field8853 = var6;
                this.field8867 = var15;
                this.field8847 = var8;
                return;
            }
            if (var10 == 1) {
                this.field8867 = var6;
                this.field8847 = var8;
                this.field8853 = var16;
                return;
            }
            if (var10 == 2) {
                this.field8867 = var6;
                this.field8853 = var8;
                this.field8847 = var15;
                return;
            }
            if (var10 == 3) {
                this.field8847 = var6;
                this.field8867 = var16;
                this.field8853 = var8;
                return;
            }
            if (var10 == 4) {
                this.field8847 = var6;
                this.field8853 = var15;
                this.field8867 = var8;
                return;
            }
            if (~var10 == -6) {
                this.field8853 = var6;
                this.field8847 = var16;
                this.field8867 = var8;
                return;
            }
        } else {
            this.field8853 = this.field8867 = this.field8847 = arg0;
        }
    }
}
