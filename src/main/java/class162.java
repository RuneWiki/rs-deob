import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class162 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[B")
    private byte[] field2922;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[I")
    private int[] field2925;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[I")
    private int[] field2927;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Loc;")
    private static class151 field2932 = class137.method873(2, "cyan:");

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2924 = -1;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Loc;")
    private static class151 field2933 = class137.method873(2, "glow1:");

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Loc;")
    public static class151 field2921 = field2933;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Loc;")
    public static class151 field2929 = field2933;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Loc;")
    private static class151 field2937 = class137.method873(2, "This computers address has been blocked");

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Loc;")
    public static class151 field2930 = field2932;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "Loc;")
    public static class151 field2936 = class137.method873(2, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Loc;")
    public static class151 field2935 = field2937;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Loc;")
    public static class151 field2926 = field2932;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Lv;")
    public static class218 field2919 = new class218();

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Loc;")
    public static class151 field2938 = class137.method873(2, "Cabbage");

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Loc;")
    public static class151 field2940 = class137.method873(2, "Angreifen");

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "J")
    public static long field2939;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILoc;)V")
    public static final void method1047(int arg0, class151 arg1) {
        if (arg0 != 0) {
            method1052((byte) -114);
        }
        class144.field2604 = arg1;
        class117.method719((byte) -20);
        field2934++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lgd;Lnd;IB)V")
    public static final void method1048(class69 arg0, class142 arg1, int arg2, byte arg3) {
        byte[] var4 = null;
        field2923++;
        class218 var5 = class144.field2600;
        synchronized (class144.field2600) {
            for (class220 var6 = (class220) class144.field2600.method1358(arg3 ^ 0xFFFF8BB3); var6 != null; var6 = (class220) class144.field2600.method1360(true)) {
                if ((long) arg2 == var6.field1881 && var6.field3821 == arg0 && var6.field3825 == 0) {
                    var4 = var6.field3822;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg1.method914(arg0, arg3 + 18, arg2, var4, true);
            return;
        }
        byte[] var7 = arg0.method468(arg2, 93);
        if (arg3 != 81) {
            field2921 = null;
        }
        arg1.method914(arg0, 99, arg2, var7, true);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[BII[BB)I")
    public final int method1049(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, byte arg5) {
        field2928++;
        int var7 = -56 % ((57 - arg5) / 47);
        if (arg0 == 0) {
            return 0;
        }
        int var8 = arg0 + arg3;
        int var9 = 0;
        int var10 = arg2;
        while (true) {
            byte var11 = arg1[var10];
            if (var11 < 0) {
                var9 = this.field2927[var9];
            } else {
                var9++;
            }
            int var12;
            if ((var12 = this.field2927[var9]) < 0) {
                arg4[arg3++] = (byte) ~var12;
                if (var8 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var9++;
            } else {
                var9 = this.field2927[var9];
            }
            int var13;
            if ((var13 = this.field2927[var9]) < 0) {
                arg4[arg3++] = (byte) ~var13;
                if (var8 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var9++;
            } else {
                var9 = this.field2927[var9];
            }
            int var14;
            if ((var14 = this.field2927[var9]) < 0) {
                arg4[arg3++] = (byte) ~var14;
                if (var8 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var9++;
            } else {
                var9 = this.field2927[var9];
            }
            int var15;
            if ((var15 = this.field2927[var9]) < 0) {
                arg4[arg3++] = (byte) ~var15;
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var9++;
            } else {
                var9 = this.field2927[var9];
            }
            int var16;
            if ((var16 = this.field2927[var9]) < 0) {
                arg4[arg3++] = (byte) ~var16;
                if (var8 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var9++;
            } else {
                var9 = this.field2927[var9];
            }
            int var17;
            if ((var17 = this.field2927[var9]) < 0) {
                arg4[arg3++] = (byte) ~var17;
                if (var8 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var9++;
            } else {
                var9 = this.field2927[var9];
            }
            int var18;
            if ((var18 = this.field2927[var9]) < 0) {
                arg4[arg3++] = (byte) ~var18;
                if (var8 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var9++;
            } else {
                var9 = this.field2927[var9];
            }
            int var19;
            if ((var19 = this.field2927[var9]) < 0) {
                arg4[arg3++] = (byte) ~var19;
                if (var8 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg2;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([B)V")
    public class162(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = 0;
        int var4 = arg0.length;
        this.field2922 = arg0;
        this.field2925 = new int[var4];
        this.field2927 = new int[8];
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field2925[var5] = var8;
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
                        var2[var10] = class73.method479(var11, var12);
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
                        if (this.field2927[var14] == 0) {
                            this.field2927[var14] = var3;
                        }
                        var14 = this.field2927[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field2927.length <= var14) {
                        int[] var18 = new int[this.field2927.length * 2];
                        for (int var19 = 0; var19 < this.field2927.length; var19++) {
                            var18[var19] = this.field2927[var19];
                        }
                        this.field2927 = var18;
                    }
                }
                this.field2927[var14] = ~var5;
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[B[BIII)I")
    public final int method1050(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 + arg4;
        int var8 = arg3 << 3;
        field2931++;
        int var9 = 0;
        if (arg5 != 2101620963) {
            return -110;
        }
        while (var7 > arg4) {
            int var10 = arg1[arg4] & 0xFF;
            int var11 = this.field2925[var10];
            byte var12 = this.field2922[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            var8 += var12;
            int var15 = var9 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var9 = class73.method479(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var9 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var9 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var9 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var8 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)V")
    public static final void method1051(byte arg0, int arg1, int arg2) {
        field2918++;
        if (arg0 != 5) {
            return;
        }
        long var3 = (long) ((arg1 << 16) + arg2);
        class188 var5 = (class188) class20.field426.method1538(var3, (byte) 127);
        if (var5 != null) {
            class53.field1079.method329((byte) 42, var5);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static void method1052(byte arg0) {
        field2926 = null;
        field2936 = null;
        field2919 = null;
        field2938 = null;
        field2935 = null;
        field2937 = null;
        field2933 = null;
        field2932 = null;
        field2929 = null;
        if (arg0 != 20) {
            method1052((byte) -111);
        }
        field2940 = null;
        field2921 = null;
        field2930 = null;
    }
}
