import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class206 extends class115 {

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field2980 = 0;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field2976 = -1;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field2984 = null;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "[I")
    public static int[] field2977 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "Z")
    public static boolean field2986 = false;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "[J")
    public static long[] field2987 = new long[256];

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
    public static final void method1325(boolean arg0, int arg1) {
        ++field2974;
        class102.field1531 = new int[arg1];
        class76.field1173 = new int[104];
        class268.field4192 = new int[104];
        class264.field3988 = 99;
        class226.field3401 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class259.field3920 = new byte[var2][104][104];
        class118.field1729 = new byte[var2][104][104];
        class26.field372 = new byte[var2][104][104];
        class214.field3077 = new byte[var2][105][105];
        class204.field2964 = new int[104];
        class175.field2500 = new byte[var2][104][104];
        class98.field1475 = new int[var2][105][105];
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1326(byte arg0, String arg1) {
        String var2 = class204.method1321((byte) -128, class109.method712((byte) 46, arg1));
        int var3 = -58 % ((42 - arg0) / 40);
        if (var2 == null) {
            var2 = "";
        }
        ++field2978;
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILfc;ZII)V")
    public static final void method1327(int arg0, int arg1, class196 arg2, boolean arg3, int arg4, int arg5) {
        ++field2973;
        if (~class224.field3358 > -51) {
            if (arg2.field2834 != null && arg0 < arg2.field2834.length && arg2.field2834[arg0] != null) {
                int var6 = arg2.field2834[arg0][0];
                int var7 = var6 & 31;
                int var8 = var6 >> 8;
                int var9 = (243 & var6) >> 5;
                if (~arg2.field2834[arg0].length < -2) {
                    int var10 = (int) (Math.random() * (double) arg2.field2834[arg0].length);
                    if (~var10 < -1) {
                        var8 = arg2.field2834[arg0][var10];
                    }
                }
                if (~var7 == -1) {
                    if (arg3) {
                        class205.method1322(0, var8, var9, 0);
                    }
                } else if (class62.field1000 != 0) {
                    class212.field3042[class224.field3358] = var8;
                    class160.field2325[class224.field3358] = var9;
                    int var11 = (arg5 + -64) / 128;
                    class146.field2098[class224.field3358] = 0;
                    int var12 = (arg4 - 64) / 128;
                    int var13 = 89 / ((arg1 - -4) / 56);
                    class236.field3563[class224.field3358] = null;
                    class123.field1783[class224.field3358] = (var11 << 16) - -(var12 << 8) - -var7;
                    ++class224.field3358;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(II)Ldk;")
    public static final class184 method1328(int arg0, int arg1) {
        ++field2982;
        class184 var2 = (class184) class58.field893.method1501((long) arg1, (byte) 117);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class152.field2205.method1538(26, arg1, (byte) 64);
            class184 var4 = new class184();
            if (var3 != null) {
                var4.method1191(new class114(var3), false);
            }
            class58.field893.method1499((long) arg1, -118, var4);
            int var5 = 90 / ((6 - arg0) / 48);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
    public static final void method1329(int arg0, boolean arg1) {
        ++field2975;
        if (!arg1) {
            field2988 = -39;
        }
        if (arg0 == -1 && !class200.field2884) {
            class149.method993(2047);
        } else if (~arg0 != 0 && (class229.field3429 != arg0 || !class15.method121(true)) && class209.field3015 != 0 && !class200.field2884) {
            class28.method212(false, 2, class53.field777, class209.field3015, arg0, 7970, 0);
        }
        class229.field3429 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
    public static void method1330(int arg0) {
        field2984 = null;
        if (arg0 != 1) {
            field2989 = 88;
        }
        field2977 = null;
        field2987 = null;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field2985;
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int var4 = class187.field2664[arg1];
            for (int var5 = 0; var5 < class77.field1178; ++var5) {
                var3[var5] = this.method1332(27174, class169.field2444[var5], var4) % 4096;
            }
        }
        if (arg0 != 242152972) {
            method1331(-116, -105, (byte) 115, 108, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class206() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIBIZ)V")
    public static final void method1331(int arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        if (arg2 == -118) {
            ++field2979;
            if (class159.method1072((byte) -14, arg0)) {
                class90.method610(class19.field268[arg0], arg1, arg4, 127, -1, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(III)I")
    private final int method1332(int arg0, int arg1, int arg2) {
        ++field2981;
        int var4 = arg1 - -(arg2 * 57);
        int var5 = var4 ^ var4 << 1;
        if (arg0 != 27174) {
            field2990 = 45;
        }
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 - -1376312589) / 262144) + 4096;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if ((1L & var1) != 1L) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                }
            }
            field2987[var0] = var1;
        }
        field2989 = 0;
        field2990 = 0;
    }
}
