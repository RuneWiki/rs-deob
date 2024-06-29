import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class64 {

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
    private int[] field1084;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "[I")
    private int[] field1087;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[B")
    private byte[] field1082;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Loj;")
    public static class17 field1083 = new class17(50);

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Lhh;")
    public static class163 field1088 = class137.method1065("::rect_debug", 17);

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Lhh;")
    public static class163 field1094 = class137.method1065("<img=0>", 17);

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "Lhh;")
    private static class163 field1092 = class137.method1065("glow2:", 17);

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "Lhh;")
    public static class163 field1090 = field1092;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Lhh;")
    public static class163 field1093 = class137.method1065(" <col=ffff00>", 17);

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Lhh;")
    public static class163 field1091 = field1092;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Lee;")
    public static class108 field1081;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "[Lrh;")
    public static class242[] field1080;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([BIIB[BI)I")
    public final int method447(byte[] arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5) {
        int var7 = arg1 + arg2;
        int var8 = arg5 << 3;
        int var9 = 0;
        int var10 = 106 % ((24 - arg3) / 37);
        field1079++;
        while (var7 > arg2) {
            int var11 = arg0[arg2] & 0xFF;
            int var12 = this.field1087[var11];
            byte var13 = this.field1082[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var8 >> 3;
            int var15 = var8 & 0x7;
            int var16 = var9 & -var15 >> 31;
            var8 += var13;
            int var17 = (var13 + var15 - 1 >> 3) + var14;
            int var18 = var15 + 24;
            arg4[var14] = (byte) (var9 = class3.method27(var16, var12 >>> var18));
            if (var17 > var14) {
                var14++;
                var15 = var18 - 8;
                arg4[var14] = (byte) (var9 = var12 >>> var15);
                if (var17 > var14) {
                    var14++;
                    var15 -= 8;
                    arg4[var14] = (byte) (var9 = var12 >>> var15);
                    if (var17 > var14) {
                        var15 -= 8;
                        var14++;
                        arg4[var14] = (byte) (var9 = var12 >>> var15);
                        if (var14 < var17) {
                            var14++;
                            var15 -= 8;
                            arg4[var14] = (byte) (var9 = var12 << -var15);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBIII)V")
    public static final void method448(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1077++;
        class197 var5 = (class197) class76.field1427.method1743((long) arg4, false);
        if (var5 == null) {
            var5 = new class197();
            class76.field1427.method1741(var5, false, (long) arg4);
        }
        if (var5.field3557.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field3557.length; var8++) {
                var6[var8] = var5.field3557[var8];
                var7[var8] = var5.field3549[var8];
            }
            for (int var9 = var5.field3557.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3557 = var6;
            var5.field3549 = var7;
        }
        var5.field3557[arg2] = arg3;
        if (arg1 == 88) {
            var5.field3549[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Lke;")
    public static final class75 method449(int arg0, byte arg1) {
        class75 var2 = (class75) class24.field388.method114((long) arg0, 0);
        field1086++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 85) {
            field1091 = null;
        }
        byte[] var3 = class49.field833.method973(16, true, arg0);
        class75 var4 = new class75();
        if (var3 != null) {
            var4.method552((byte) -24, new class81(var3));
        }
        class24.field388.method117(var4, false, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method450(int arg0) {
        field1081 = null;
        field1093 = null;
        field1094 = null;
        if (arg0 != 2145254081) {
            field1092 = null;
        }
        field1080 = null;
        field1091 = null;
        field1088 = null;
        field1083 = null;
        field1092 = null;
        field1090 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([BIII[BI)I")
    public final int method451(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1085++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg1 + arg2;
        int var8 = 0;
        int var9 = arg5;
        if (arg3 != -12660) {
            field1093 = null;
        }
        while (true) {
            byte var10 = arg4[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var11;
            if ((var11 = this.field1084[var8]) < 0) {
                arg0[arg2++] = (byte) (~var11);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var12;
            if ((var12 = this.field1084[var8]) < 0) {
                arg0[arg2++] = (byte) (~var12);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var13;
            if ((var13 = this.field1084[var8]) < 0) {
                arg0[arg2++] = (byte) (~var13);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var14;
            if ((var14 = this.field1084[var8]) < 0) {
                arg0[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var15;
            if ((var15 = this.field1084[var8]) < 0) {
                arg0[arg2++] = (byte) (~var15);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var16;
            if ((var16 = this.field1084[var8]) < 0) {
                arg0[arg2++] = (byte) (~var16);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var17;
            if ((var17 = this.field1084[var8]) < 0) {
                arg0[arg2++] = (byte) (~var17);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1084[var8];
            }
            int var18;
            if ((var18 = this.field1084[var8]) < 0) {
                arg0[arg2++] = (byte) (~var18);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V")
    public static final void method452(boolean arg0, int arg1) {
        int var2 = -75 % ((arg1 + 4) / 44);
        field1078++;
        for (int var3 = 0; var3 < class199.field3573; var3++) {
            class2 var4 = class111.field2098[class155.field2887[var3]];
            long var5 = (long) class155.field2887[var3] << 32 | 0x20000000L;
            if (var4 != null && var4.method24((byte) 69) && var4.field41.field3328 == arg0 && var4.field41.method1323(-125)) {
                int var7 = var4.field3633 >> 7;
                int var8 = var4.field3615 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field3645 == 1 && (var4.field3633 & 0x7F) == 64 && (var4.field3615 & 0x7F) == 64) {
                        if (class211.field3821[var7][var8] == class114.field2145) {
                            continue;
                        }
                        class211.field3821[var7][var8] = class114.field2145;
                    }
                    if (!var4.field41.field3308) {
                        var5 |= Long.MIN_VALUE;
                    }
                    var4.field3619 = class127.method1011(var4.field3645 * 64 + var4.field3615 - 64, var4.field3633 - 64 - -(var4.field3645 * 64), class20.field323, 29908);
                    class174.method1287(class20.field323, var4.field3633, var4.field3615, var4.field3619, var4.field3645 * 64 + 60 - 64, var4, var4.field3667, var5, var4.field3659);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "([B)V")
    public class64(byte[] arg0) {
        int var2 = arg0.length;
        this.field1084 = new int[8];
        this.field1087 = new int[var2];
        this.field1082 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1087[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class3.method27(var11, var10);
                    }
                    var12 = var7 | var8;
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
                        if (this.field1084[var14] == 0) {
                            this.field1084[var14] = var4;
                        }
                        var14 = this.field1084[var14];
                    }
                    if (var14 >= this.field1084.length) {
                        int[] var17 = new int[this.field1084.length * 2];
                        for (int var18 = 0; var18 < this.field1084.length; var18++) {
                            var17[var18] = this.field1084[var18];
                        }
                        this.field1084 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field1084[var14] = ~var5;
            }
        }
    }
}
