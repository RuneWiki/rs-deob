import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class232 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    private int field3375;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[[I")
    private int[][] field3379;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    private int field3391;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lfm;")
    public static class52 field3380 = null;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "[[Z")
    public static boolean[][] field3383 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!h", name = "k", descriptor = "[I")
    public static int[] field3385 = new int[5];

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public static int field3393 = 0;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "[I")
    public static int[] field3394 = new int[1000];

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)I", line = 4)
    public final int method1629(int arg0, byte arg1) {
        field3390++;
        if (this.field3379 != null) {
            arg0 = ((int) ((long) this.field3375 * (long) arg0 / (long) this.field3391)) + 6;
        }
        return arg1 == -83 ? arg0 : -57;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 18)
    public static void method1630(boolean arg0) {
        if (arg0) {
            field3380 = null;
            field3383 = (boolean[][]) null;
            field3385 = null;
            field3394 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I", line = 35)
    public final int method1631(int arg0, int arg1) {
        field3382++;
        if (this.field3379 != null) {
            arg0 = (int) ((long) this.field3375 * (long) arg0 / (long) this.field3391);
        }
        if (arg1 != 1033634818) {
            method1632(11, 112, 27, -85, 18, 9, -107, -31, -51, 25);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V", line = 61)
    public static final void method1632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class7 var10 = null;
        field3384++;
        for (class7 var11 = (class7) class74.field955.method2331((byte) 9); var11 != null; var11 = (class7) class74.field955.method2332(-40)) {
            if (var11.field102 == arg7 && var11.field86 == arg1 && var11.field88 == arg0 && var11.field103 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class7();
            var10.field88 = arg0;
            var10.field86 = arg1;
            var10.field103 = arg9;
            var10.field102 = arg7;
            class20.method123((byte) -105, var10);
            class74.field955.method2325(var10, (byte) 34);
        }
        if (arg8 != 0) {
            return;
        }
        var10.field97 = arg5;
        var10.field101 = arg3;
        var10.field91 = arg4;
        var10.field92 = arg6;
        var10.field90 = arg2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB[Lcc;ZI)V", line = 107)
    public static final void method1633(int arg0, int arg1, byte arg2, class263[] arg3, boolean arg4, int arg5) {
        field3392++;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class263 var7 = arg3[var6];
            if (var7 != null && var7.field4065 == arg5) {
                class216.method1489(arg4, arg1, arg0, var7, 250);
                class187.method1297((byte) 82, var7, arg1, arg0);
                if (var7.field4068 > var7.field3984 - var7.field3989) {
                    var7.field4068 = var7.field3984 - var7.field3989;
                }
                if (var7.field4068 < 0) {
                    var7.field4068 = 0;
                }
                if ((var7.field4059 - var7.field4096) < var7.field3990) {
                    var7.field3990 = var7.field4059 - var7.field4096;
                }
                if (var7.field3990 < 0) {
                    var7.field3990 = 0;
                }
                if (var7.field3981 == 0) {
                    class112.method769(var7, arg4, 268219088);
                }
            }
        }
        if (arg2 != 0) {
            field3388 = -32;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(CI)Z", line = 154)
    public static final boolean method1634(char arg0, int arg1) {
        if (arg1 <= 122) {
            field3394 = (int[]) null;
        }
        field3389++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([BZ)[B", line = 166)
    public final byte[] method1635(byte[] arg0, boolean arg1) {
        if (!arg1) {
            return (byte[]) null;
        }
        field3377++;
        if (this.field3379 != null) {
            int var3 = 0;
            int var4 = (int) ((long) arg0.length * (long) this.field3375 / (long) this.field3391) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var8 = arg0[var7];
                int[] var9 = this.field3379[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var5[var3 + var10] += var9[var10] * var8;
                }
                int var11 = this.field3375 + var6;
                int var12 = var11 / this.field3391;
                var3 += var12;
                var6 = var11 - this.field3391 * var12;
            }
            arg0 = new byte[var4];
            for (int var13 = 0; var13 < var4; var13++) {
                int var14 = var5[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 > 127) {
                    arg0[var13] = 127;
                } else {
                    arg0[var13] = (byte) var14;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V", line = 237)
    public static final void method1636(boolean arg0) {
        field3376++;
        while (class307.field4742.method568(-65, class132.field1817) >= 11) {
            int var1 = class307.field4742.method566(11, 0);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class328.field5009[var1] == null) {
                var2 = true;
                class328.field5009[var1] = new class109();
                if (class319.field4898[var1] != null) {
                    class328.field5009[var1].method747(class319.field4898[var1], (byte) -76);
                }
            }
            class180.field2612[class204.field2864++] = var1;
            class109 var3 = class328.field5009[var1];
            var3.field2422 = class38.field463;
            int var4 = class307.field4742.method566(1, 0);
            if (var4 == 1) {
                class129.field1772[class21.field278++] = var1;
            }
            int var5 = class307.field4742.method566(5, 0);
            int var6 = class307.field4742.method566(5, 0);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            int var7 = class307.field4742.method566(1, 0);
            int var8 = class22.field304[class307.field4742.method566(3, 0)];
            if (var2) {
                var3.field2387 = var3.field2368 = var8;
            }
            var3.method749(0, class118.field1664.field2359[0] + var6, class118.field1664.field2403[0] - -var5, var7 == 1);
        }
        class307.field4742.method569(!arg0);
        if (arg0) {
            field3380 = (class52) null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(JII[I)Ljava/lang/String;", line = 300)
    public static final String method1637(long arg0, int arg1, int arg2, int[] arg3) {
        if (arg2 != -15966) {
            return (String) null;
        }
        field3381++;
        if (field3380 != null) {
            String var5 = field3380.method318(26040, arg0, arg3, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)Z", line = 323)
    public static final boolean method1638(int arg0, int arg1, byte arg2) {
        class238 var3 = class142.method951(arg1, 26915);
        if (arg2 != -68) {
            method1632(92, -41, -89, -117, -23, 48, 111, 93, -69, 80);
        }
        field3378++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method1704((byte) -126, arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([JIII[I)V", line = 345)
    public static final void method1639(long[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg1 != -32239) {
            return;
        }
        field3386++;
        if (arg2 >= arg3) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        long var6 = arg0[var5];
        int var8 = arg2;
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var6;
        int var9 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var9;
        for (int var10 = arg2; var10 < arg3; var10++) {
            if (arg0[var10] < var6 + ((long) (var10 & 0x1))) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var8];
                arg0[var8] = var11;
                int var13 = arg4[var10];
                arg4[var10] = arg4[var8];
                arg4[var8++] = var13;
            }
        }
        arg0[arg3] = arg0[var8];
        arg0[var8] = var6;
        arg4[arg3] = arg4[var8];
        arg4[var8] = var9;
        method1639(arg0, arg1 ^ 0x0, arg2, var8 - 1, arg4);
        method1639(arg0, -32239, var8 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V", line = 406)
    public class232(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class336.method2318(94, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3375 = var4;
            this.field3379 = new int[var5][14];
            this.field3391 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3379[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V", line = 467)
    public static final void method1640(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method1638(-115, -90, (byte) -57);
        }
        class121.field1698[arg0] = arg1;
        class231 var3 = (class231) class187.field2697.method1537((long) arg0, -22708);
        if (var3 == null) {
            class231 var4 = new class231(4611686018427387905L);
            class187.field2697.method1541(false, var4, (long) arg0);
        } else if (var3.field3372 != 4611686018427387905L) {
            var3.field3372 = class200.method1375(-16185) + 500L | 0x4000000000000000L;
        }
        field3387++;
    }
}
