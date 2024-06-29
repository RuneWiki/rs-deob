import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class261 {

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public int field4053 = 128;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Z")
    public boolean field4045 = true;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public int field4055 = -1;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    private int field4062 = 0;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[[[I")
    public static int[][][] field4046 = new int[4][13][13];

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    public static int[] field4047 = new int[5];

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "[[[Lea;")
    public static class204[][][] field4050 = new class204[4][104][104];

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public int field4044;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public int field4056;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public int field4057;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public int field4059;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "[I")
    public static int[] field4061;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V", line = 3)
    public static final void method1844(int arg0, int arg1, int arg2) {
        class168.field2603 = true;
        class46.field788 = arg0;
        class98.field1627 = arg1;
        class67.field1070 = arg2;
        class248.field3838 = -1;
        class121.field1945 = -1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIILpe;)V", line = 14)
    private final void method1845(int arg0, int arg1, int arg2, class101 arg3) {
        field4060++;
        if (arg1 != 4) {
            method1851((byte) 53);
        }
        if (arg0 == 1) {
            this.field4062 = arg3.method776(-1574267376);
            this.method1847(arg1 + 48, this.field4062);
        } else if (arg0 == 2) {
            this.field4055 = arg3.method731(false);
            if (this.field4055 == 65535) {
                this.field4055 = -1;
            }
        } else if (arg0 == 3) {
            this.field4053 = arg3.method731(false);
        } else if (arg0 == 4) {
            this.field4045 = false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 52)
    public static final void method1846(int arg0) {
        class9.field132.method1837(-125);
        field4052++;
        if (arg0 != -30584) {
            field4050 = (class204[][][]) ((class204[][][]) null);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V", line = 69)
    private final void method1847(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field4054++;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (arg0 < 21) {
            return;
        }
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        double var11 = var3;
        if (var9 > var7) {
            var9 = var7;
        }
        double var13 = 0.0D;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field4057 = (int) (var15 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field4059 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4059 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4057 < 0) {
            this.field4057 = 0;
        } else if (this.field4057 > 255) {
            this.field4057 = 255;
        }
        double var19 = var13 / 6.0D;
        if (this.field4059 < 1) {
            this.field4059 = 1;
        }
        this.field4056 = (int) ((double) this.field4059 * var19);
        this.field4044 = (int) (var17 * 256.0D);
        if (this.field4044 < 0) {
            this.field4044 = 0;
        } else if (this.field4044 > 255) {
            this.field4044 = 255;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lpe;II)V", line = 161)
    public final void method1848(class101 arg0, int arg1, int arg2) {
        if (arg1 != 20264) {
            method1849(-56);
        }
        while (true) {
            int var4 = arg0.method741(arg1 - 20181);
            if (var4 == 0) {
                field4051++;
                return;
            }
            this.method1845(var4, 4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Luk;", line = 181)
    public static final class93 method1849(int arg0) {
        if (arg0 > -52) {
            return (class93) null;
        }
        field4049++;
        try {
            return (class93) Class.forName("ge").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lcm;IIIIIIZ)V", line = 203)
    public static final void method1850(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3081.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field3081[var9] - class31.field533;
            int var11 = arg0.field3084[var9] - class203.field3223;
            int var12 = arg0.field3092[var9] - class236.field3717;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field3095 != null) {
                class194.field3090[var9] = var13;
                class194.field3085[var9] = var16;
                class194.field3078[var9] = var17;
            }
            class194.field3093[var9] = (var13 << 9) / var17 + class174.field2729;
            class194.field3088[var9] = (var16 << 9) / var17 + class174.field2742;
        }
        class174.field2733 = 0;
        int var19 = arg0.field3083.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field3083[var20];
            int var22 = arg0.field3098[var20];
            int var23 = arg0.field3082[var20];
            int var24 = class194.field3093[var21];
            int var25 = class194.field3093[var22];
            int var26 = class194.field3093[var23];
            int var27 = class194.field3088[var21];
            int var28 = class194.field3088[var22];
            int var29 = class194.field3088[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class168.field2603 && class302.method2101(class98.field1627 + class174.field2729, class67.field1070 + class174.field2742, var27, var28, var29, var24, var25, var26)) {
                    class248.field3838 = arg5;
                    class121.field1945 = arg6;
                }
                if (!class265.field4126 && !arg7) {
                    class174.field2735 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class174.field2730 || var25 > class174.field2730 || var26 > class174.field2730) {
                        class174.field2735 = true;
                    }
                    if (arg0.field3095 == null || arg0.field3095[var20] == -1) {
                        if (arg0.field3097[var20] != 12345678) {
                            class174.method1304(var27, var28, var29, var24, var25, var26, arg0.field3097[var20], arg0.field3089[var20], arg0.field3079[var20]);
                        }
                    } else if (!class217.field3474) {
                        int var30 = class174.field2734.method1476(65535, arg0.field3095[var20]);
                        class174.method1304(var27, var28, var29, var24, var25, var26, class121.method925(var30, arg0.field3097[var20]), class121.method925(var30, arg0.field3089[var20]), class121.method925(var30, arg0.field3079[var20]));
                    } else if (arg0.field3091) {
                        class174.method1297(var27, var28, var29, var24, var25, var26, arg0.field3097[var20], arg0.field3089[var20], arg0.field3079[var20], class194.field3090[0], class194.field3090[1], class194.field3090[3], class194.field3085[0], class194.field3085[1], class194.field3085[3], class194.field3078[0], class194.field3078[1], class194.field3078[3], arg0.field3095[var20]);
                    } else {
                        class174.method1297(var27, var28, var29, var24, var25, var26, arg0.field3097[var20], arg0.field3089[var20], arg0.field3079[var20], class194.field3090[var21], class194.field3090[var22], class194.field3090[var23], class194.field3085[var21], class194.field3085[var22], class194.field3085[var23], class194.field3078[var21], class194.field3078[var22], class194.field3078[var23], arg0.field3095[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 326)
    public static void method1851(byte arg0) {
        field4050 = (class204[][][]) null;
        field4046 = (int[][][]) null;
        if (arg0 != 102) {
            method1849(15);
        }
        field4061 = null;
        field4047 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 349)
    public static final void method1852(int arg0, String arg1, int arg2) {
        String var3 = class235.method1684(class53.method390(arg2, arg1), (byte) 86);
        field4058++;
        boolean var4 = false;
        for (int var5 = 0; var5 < class65.field1058; var5++) {
            class30 var6 = class82.field1228[class149.field2398[var5]];
            if (var6 != null && var6.field494 != null && var6.field494.equalsIgnoreCase(var3)) {
                var4 = true;
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var6.field1386[0], true, class19.field356.field1386[0], 1, var6.field1388[0], false, 0, 0);
                if (arg0 == 1) {
                    class30.field497++;
                    class269.field4191.method246(false, 96);
                    class269.field4191.method785(118, class149.field2398[var5]);
                } else if (arg0 == 4) {
                    class269.field4191.method246(false, 43);
                    class269.field4191.method785(arg2 + 112, class149.field2398[var5]);
                    client.field3909++;
                } else if (arg0 == 5) {
                    class269.field4191.method246(false, 60);
                    class250.field3855++;
                    class269.field4191.method739(class149.field2398[var5], -32);
                } else if (arg0 == 6) {
                    class269.field4191.method246(false, 247);
                    class312.field4903++;
                    class269.field4191.method739(class149.field2398[var5], arg2 ^ 0x3A);
                } else if (arg0 == 7) {
                    class269.field4191.method246(false, 189);
                    class25.field420++;
                    class269.field4191.method728(class149.field2398[var5], 1234856744);
                }
                break;
            }
        }
        if (!var4) {
            class252.method1782(class291.field4429 + var3, 0, "", false);
        }
    }
}
