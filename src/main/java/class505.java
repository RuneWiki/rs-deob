import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class505 extends class192 {

    @OriginalMember(owner = "client!mp", name = "M", descriptor = "I")
    private int field6636 = 1;

    @OriginalMember(owner = "client!mp", name = "O", descriptor = "I")
    private int field6638 = 204;

    @OriginalMember(owner = "client!mp", name = "K", descriptor = "I")
    private int field6634 = 1;

    @OriginalMember(owner = "client!mp", name = "Q", descriptor = "Lbc;")
    public static class9 field6640 = new class9(64);

    @OriginalMember(owner = "client!mp", name = "U", descriptor = "[I")
    public static int[] field6644 = new int[2];

    @OriginalMember(owner = "client!mp", name = "I", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!mp", name = "J", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!mp", name = "L", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!mp", name = "N", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!mp", name = "P", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!mp", name = "T", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!mp", name = "S", descriptor = "[I")
    public static int[] field6642;

    @OriginalMember(owner = "client!mp", name = "R", descriptor = "[[Z")
    public static boolean[][] field6641;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)[I", line = 13)
    public final int[] method118(int arg0, byte arg1) {
        ++field6639;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 >= -123) {
            return null;
        } else {
            if (super.field2448.field7266) {
                for (int var4 = 0; ~class561.field7319 < ~var4; ++var4) {
                    int var5 = class183.field2359[var4];
                    int var6 = class221.field2895[arg0];
                    int var7 = this.field6634 * var5 >> 12;
                    int var8 = this.field6636 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field6634) * this.field6634;
                    int var10 = var6 % (4096 / this.field6636) * this.field6636;
                    if (~var10 > ~this.field6638) {
                        for (var7 -= var8; ~var7 > -1; var7 += 4) {
                        }
                        while (var7 > 3) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (var9 < this.field6638) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (~this.field6638 < ~var9) {
                        int var11;
                        for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Loa;II)Lsga;", line = 99)
    public static final class547 method2719(class43 arg0, int arg1, int arg2) {
        ++field6633;
        if (arg1 != -65536) {
            return null;
        } else {
            class435 var3 = class38.method306(false, true, arg0, arg2);
            return var3 == null ? null : var3.field5640;
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V", line = 400)
    public class505() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "(B)V", line = 118)
    public static final void method2720(byte arg0) {
        if (arg0 != 89) {
            field6642 = null;
        }
        ++field6637;
        for (int var1 = 0; ~var1 > ~class642.field8933; ++var1) {
            int var2 = class604.field8188[var1];
            class532 var3 = ((class234) field6640.method39((long) var2, arg0 + 31661)).field3131;
            int var4 = class230.field3069.method2396(-103);
            if (~(var4 & 32) != -1) {
                var4 += class230.field3069.method2396(arg0 + -206) << 8;
            }
            if (~(512 & var4) != -1) {
                var3.field2978 = class230.field3069.method2381(8);
                var3.field2950 = class230.field3069.method2384(arg0 ^ 32678);
                var3.field2997 = class230.field3069.method2384(32767);
                var3.field3027 = (byte) class230.field3069.method2363(arg0 ^ -44);
                var3.field2948 = class424.field5503 - -class230.field3069.method2379((byte) -103);
                var3.field2989 = class424.field5503 + class230.field3069.method2379((byte) -124);
            }
            if (~(var4 & 1) != -1) {
                int var5 = class230.field3069.method2390((byte) 118);
                int var6 = class230.field3069.method2402(-1028506808);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var7 = class230.field3069.method2413((byte) -109);
                var3.method1432(1, false, var5, var7, var6);
            }
            if ((4096 & var4) != 0) {
                int var8 = class230.field3069.method2396(-126);
                int[] var9 = new int[var8];
                int[] var10 = new int[var8];
                int[] var11 = new int[var8];
                for (int var12 = 0; ~var12 > ~var8; ++var12) {
                    int var13 = class230.field3069.method2379((byte) -117);
                    if (~var13 == -65536) {
                        var13 = -1;
                    }
                    var9[var12] = var13;
                    var10[var12] = class230.field3069.method2413((byte) -124);
                    var11[var12] = class230.field3069.method2399(true);
                }
                class552.method2959(-27920, var11, var10, var9, var3);
            }
            if ((16 & var4) != 0) {
                var3.field6931 = class230.field3069.method2393(-30727);
                var3.field6911 = class230.field3069.method2393(-30727);
            }
            if ((2048 & var4) != 0) {
                var3.field3024 = class230.field3069.method2375(-8643);
                var3.field2964 = class230.field3069.method2381(-114);
                var3.field3013 = class230.field3069.method2384(arg0 + 32678);
                var3.field2959 = class230.field3069.method2381(arg0 + -72);
                var3.field2973 = class230.field3069.method2393(-30727) + class424.field5503;
                var3.field3000 = class230.field3069.method2393(arg0 + -30816) - -class424.field5503;
                var3.field2953 = class230.field3069.method2363(-118);
                var3.field2964 += var3.field3039[0];
                var3.field3013 += var3.field3030[0];
                var3.field3038 = 1;
                var3.field3024 += var3.field3030[0];
                var3.field2959 += var3.field3039[0];
                var3.field3037 = 0;
            }
            if (~(64 & var4) != -1) {
                var3.field3001 = class230.field3069.method2399(true);
                if (var3.field3001 == 65535) {
                    var3.field3001 = -1;
                }
            }
            if ((var4 & 8) != 0) {
                int[] var14 = new int[4];
                for (int var15 = 0; ~var15 > -5; ++var15) {
                    var14[var15] = class230.field3069.method2379((byte) -122);
                    if (var14[var15] == 65535) {
                        var14[var15] = -1;
                    }
                }
                int var16 = class230.field3069.method2363(4);
                class232.method1473(true, var14, var3, var16);
            }
            if (~(var4 & 8192) != -1) {
                int var17 = class230.field3069.method2400((byte) 36);
                int var18 = class230.field3069.method2396(-102);
                var3.method1425(var18, class424.field5503, false, var17);
            }
            if ((var4 & 2) != 0) {
                if (var3.field6914.method3822(true)) {
                    class438.method2488(var3, 22299);
                }
                var3.method2830((byte) -75, class646.field8998.method519(class230.field3069.method2393(arg0 + -30816), 0));
                var3.method1434(arg0 + -89, var3.field6914.field9711);
                var3.field2946 = var3.field6914.field9695 << 3;
                if (var3.field6914.method3822(true)) {
                    class64.method535((byte) -126, var3.field3030[0], (class698) null, var3, 0, (class193) null, var3.field508, var3.field3039[0]);
                }
            }
            if (~(4 & var4) != -1) {
                var3.field3017 = class230.field3069.method2394(4);
                var3.field2999 = 100;
            }
            if (~(var4 & 256) != -1) {
                int var19 = class230.field3069.method2390((byte) 102);
                int var20 = class230.field3069.method2355(29);
                if (~var19 == -65536) {
                    var19 = -1;
                }
                int var21 = class230.field3069.method2413((byte) -118);
                var3.method1432(1, true, var19, var21, var20);
            }
            if ((128 & var4) != 0) {
                int var22 = class230.field3069.method2400((byte) 36);
                int var23 = class230.field3069.method2396(-114);
                var3.method1425(var23, class424.field5503, false, var22);
                var3.field3016 = class424.field5503 + 300;
                var3.field2996 = class230.field3069.method2363(arg0 ^ -40);
            }
            if (~(1024 & var4) != -1) {
                int var24 = class230.field3069.method2399(true);
                var3.field3002 = class230.field3069.method2405((byte) 124);
                var3.field2951 = class230.field3069.method2405((byte) 126);
                var3.field2982 = (var24 & 32768) != 0;
                var3.field3005 = 32767 & var24;
                var3.field3012 = class424.field5503 - -var3.field3005 + var3.field3002;
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILfd;I)V", line = 333)
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field6638 = arg1.method2393(-30727);
                }
            } else {
                this.field6636 = arg1.method2396(-109);
            }
        } else {
            this.field6634 = arg1.method2396(-127);
        }
        if (arg2 != -12160) {
            this.field6636 = 117;
        }
        ++field6632;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(Z)V", line = 386)
    public static void method2721(boolean arg0) {
        field6642 = null;
        field6640 = null;
        field6644 = null;
        if (arg0) {
            method2721(false);
        }
        field6641 = null;
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)Z", line = 404)
    public static final boolean method2722(int arg0) {
        if (arg0 != 64) {
            field6641 = null;
        }
        ++field6635;
        if (class508.field6667) {
            try {
                if ((Boolean) class92.method688(arg0 ^ -13317, "showingVideoAd", class348.field4462)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }
}
