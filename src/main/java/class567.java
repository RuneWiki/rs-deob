import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class567 {

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    private int field7911 = 0;

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "Z")
    private boolean field7919 = false;

    @OriginalMember(owner = "client!rea", name = "v", descriptor = "I")
    private int field7924 = -1;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
    private int field7903 = -1;

    @OriginalMember(owner = "client!rea", name = "x", descriptor = "Z")
    private boolean field7926 = false;

    @OriginalMember(owner = "client!rea", name = "t", descriptor = "I")
    private int field7922 = 0;

    @OriginalMember(owner = "client!rea", name = "H", descriptor = "I")
    private int field7936 = -1;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    private int field7905;

    @OriginalMember(owner = "client!rea", name = "J", descriptor = "B")
    private byte field7938;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "B")
    private byte field7904;

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
    private int field7907;

    @OriginalMember(owner = "client!rea", name = "L", descriptor = "I")
    public int field7940;

    @OriginalMember(owner = "client!rea", name = "y", descriptor = "I")
    public int field7927;

    @OriginalMember(owner = "client!rea", name = "w", descriptor = "I")
    public int field7925;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "Z")
    private boolean field7913;

    @OriginalMember(owner = "client!rea", name = "D", descriptor = "[I")
    public static int[] field7932 = new int[8];

    @OriginalMember(owner = "client!rea", name = "C", descriptor = "I")
    public static int field7931 = 0;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    private int field7915;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
    private int field7917;

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!rea", name = "u", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!rea", name = "A", descriptor = "I")
    private int field7929;

    @OriginalMember(owner = "client!rea", name = "B", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!rea", name = "E", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!rea", name = "F", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!rea", name = "G", descriptor = "I")
    private int field7935;

    @OriginalMember(owner = "client!rea", name = "I", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!rea", name = "s", descriptor = "Lha;")
    private class119 field7921;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "Ldr;")
    private class395 field7908;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "Lda;")
    private class474 field7914;

    @OriginalMember(owner = "client!rea", name = "K", descriptor = "Ltq;")
    public class93 field7939;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "[Z")
    private boolean[] field7910;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BLr;)V", line = 5)
    public final void method3120(byte arg0, class566 arg1) {
        this.method3130(true, this.field7907, arg1, true, true, this.field7905, 262144);
        if (arg0 < 87) {
            this.method3128(114);
        }
        field7930++;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V", line = 16)
    public static void method3121(byte arg0) {
        if (arg0 == 66) {
            field7932 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BI)V", line = 29)
    private final void method3122(byte arg0, int arg1) {
        field7920++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class441 var5 = class428.field5352.method3138((byte) 108, this.field7927);
            class441 var6 = var5;
            if (var5.field5574 != null) {
                var5 = var5.method2355(class684.field9606, -1643);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field5566 != null) {
                if (this.field7908 != null && var5.method2352(false, this.field7908.field4966)) {
                    return;
                }
                var3 = var5.method2363(-1);
                if (this.field7903 != var5.field5504) {
                    var4 = var5.field5552;
                }
            } else if (var5.field5576 == -1) {
                if (var6 != null && var6.field5566 != null) {
                    if (this.field7908 != null && var6.method2352(false, this.field7908.field4966)) {
                        return;
                    }
                    var3 = var6.method2363(-1);
                    if (this.field7903 != var6.field5504) {
                        var4 = var6.field5552;
                    }
                } else if (var6 != null && var6.field5576 != -1 && this.field7903 != var6.field5504) {
                    var3 = var6.field5576;
                    var4 = var6.field5552;
                }
            } else if (this.field7903 != var5.field5504) {
                var4 = var5.field5552;
                var3 = var5.field5576;
            }
        }
        if (var3 == -1) {
            this.field7908 = null;
            return;
        }
        this.field7914 = null;
        if (this.field7908 == null || this.field7908.field4966 != var3) {
            this.field7908 = class583.field8149.method1844(64, var3);
        } else if (this.field7908.field4970 == 0) {
            return;
        }
        if (this.field7908.field4979 == null) {
            this.field7908 = null;
            return;
        }
        if (var4) {
            this.field7915 = (int) ((double) this.field7908.field4979.length * Math.random());
            this.field7929 = ((int) ((double) this.field7908.field4991[this.field7915] * Math.random())) + 1;
        } else {
            this.field7915 = 0;
            this.field7929 = 1;
        }
        this.field7935 = this.field7915 + 1;
        if (arg0 > 55) {
            if (this.field7935 < 0 || this.field7908.field4979.length <= this.field7935) {
                this.field7935 = -1;
            }
            this.field7917 = class133.field1735 - this.field7929;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILr;)V", line = 151)
    public final void method3123(int arg0, class566 arg1) {
        if (this.field7921 != null) {
            class182.method1138(this.field7921, this.field7938, this.field7907, this.field7905, this.field7910);
            this.field7921 = null;
            this.field7910 = null;
        }
        field7906++;
        if (arg0 != 2) {
            this.method3123(47, null);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)V", line = 169)
    public final void method3124(int arg0, int arg1) {
        field7912++;
        this.field7926 = true;
        if (arg1 != 2911) {
            this.field7917 = -86;
        }
        this.method3122((byte) 79, arg0);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)V", line = 181)
    private final void method3125(int arg0, int arg1, int arg2) {
        field7909++;
        if (arg0 != 0) {
            return;
        }
        label90: while (true) {
            if (this.field7908 == null) {
                if (this.field7926) {
                    return;
                }
                this.method3122((byte) 122, -1);
                if (this.field7908 == null) {
                    return;
                }
            }
            int var4 = class133.field1735 - this.field7917;
            if (var4 > 100 && this.field7908.field4988 > 0) {
                int var5 = this.field7908.field4979.length - this.field7908.field4988;
                while (var5 > this.field7915 && var4 > this.field7908.field4991[this.field7915]) {
                    var4 -= this.field7908.field4991[this.field7915];
                    this.field7915++;
                }
                if (this.field7915 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field7908.field4979.length; var7++) {
                        var6 += this.field7908.field4991[var7];
                    }
                    var4 %= var6;
                }
                this.field7935 = this.field7915 + 1;
                if (this.field7935 >= this.field7908.field4979.length) {
                    this.field7935 -= this.field7908.field4988;
                    if (this.field7935 < 0 || this.field7935 >= this.field7908.field4979.length) {
                        this.field7935 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field7908.field4991[this.field7915] >= var4) {
                            this.field7917 = class133.field1735 - var4;
                            this.field7929 = var4;
                            return;
                        }
                        class192.method1159(this.field7904, this.field7908, arg2, arg1, arg0 ^ 0x78, this.field7915, false);
                        var4 -= this.field7908.field4991[this.field7915];
                        this.field7915++;
                        if (this.field7908.field4979.length <= this.field7915) {
                            this.field7915 -= this.field7908.field4988;
                            if (this.field7915 < 0 || this.field7915 >= this.field7908.field4979.length) {
                                this.field7908 = null;
                                continue label90;
                            }
                        }
                        this.field7935 = this.field7915 + 1;
                    } while (this.field7935 < this.field7908.field4979.length);
                    this.field7935 -= this.field7908.field4988;
                } while (this.field7935 >= 0 && this.field7935 < this.field7908.field4979.length);
                this.field7935 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!rea", name = "finalize", descriptor = "()V", line = 290)
    protected final void finalize() {
        if (this.field7939 != null) {
            this.field7939.method543();
        }
        field7923++;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)Z", line = 302)
    public final boolean method3126(int arg0) {
        field7937++;
        return arg0 == 0 ? this.field7913 : true;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILr;ILhv;)V", line = 319)
    public static final void method3127(int arg0, class566 arg1, int arg2, class199 arg3) {
        field7928++;
        if (class402.field5040 != null && arg3.field2524 >= arg0) {
            for (int var4 = 0; var4 < class402.field5040.length; var4++) {
                if (class402.field5040[var4] != -1000000 && (class402.field5040[var4] >= arg3.field2511[0] || class402.field5040[var4] >= arg3.field2511[1] || arg3.field2511[2] <= class402.field5040[var4] || arg3.field2511[3] <= class402.field5040[var4]) && (class287.field3570[var4] >= arg3.field2523[0] || arg3.field2523[1] <= class287.field3570[var4] || arg3.field2523[2] <= class287.field3570[var4] || arg3.field2523[3] <= class287.field3570[var4]) && (class636.field8926[var4] <= arg3.field2523[0] || arg3.field2523[1] >= class636.field8926[var4] || class636.field8926[var4] <= arg3.field2523[2] || arg3.field2523[3] >= class636.field8926[var4]) && (class286.field3559[var4] >= arg3.field2515[0] || arg3.field2515[1] <= class286.field3559[var4] || class286.field3559[var4] >= arg3.field2515[2] || arg3.field2515[3] <= class286.field3559[var4]) && (class343.field4400[var4] <= arg3.field2515[0] || arg3.field2515[1] >= class343.field4400[var4] || class343.field4400[var4] <= arg3.field2515[2] || arg3.field2515[3] >= class343.field4400[var4])) {
                    return;
                }
            }
        }
        if (arg3.field2518 == 1) {
            int var5 = class479.field6372 + arg3.field2520 - class516.field7041;
            if (var5 >= 0 && var5 <= (class479.field6372 + class479.field6372)) {
                int var6 = arg3.field2512 - (class204.field2599 - class479.field6372);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > class479.field6372 + class479.field6372) {
                    return;
                }
                int var7 = class479.field6372 + arg3.field2517 - class204.field2599;
                if ((class479.field6372 + class479.field6372) < var7) {
                    var7 = class479.field6372 + class479.field6372;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class354.field4511[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class115.field1488 - arg3.field2523[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!((float) class605.field8510 > var9) && class88.method502(arg3, 0, 0) && class88.method502(arg3, 1, 0) && class88.method502(arg3, 2, 0) && class88.method502(arg3, 3, 0)) {
                        class484.field6435[class145.field1881++] = arg3;
                    }
                }
            }
        } else if (arg2 == 0) {
            if (arg3.field2518 == 2) {
                int var10 = arg3.field2512 + class479.field6372 - class204.field2599;
                if (var10 >= 0 && var10 <= (class479.field6372 + class479.field6372)) {
                    int var11 = class479.field6372 + arg3.field2520 - class516.field7041;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (class479.field6372 + class479.field6372 < var11) {
                        return;
                    }
                    int var12 = arg3.field2525 + class479.field6372 - class516.field7041;
                    if (var12 > class479.field6372 + class479.field6372) {
                        var12 = class479.field6372 + class479.field6372;
                    } else if (var12 < 0) {
                        return;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class354.field4511[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        float var14 = (float) (class11.field197 - arg3.field2515[0]);
                        if (var14 < 0.0F) {
                            var14 *= -1.0F;
                        }
                        if (!(var14 < (float) class605.field8510) && class88.method502(arg3, 0, 0) && class88.method502(arg3, 1, 0) && class88.method502(arg3, 2, 0) && class88.method502(arg3, 3, arg2)) {
                            class484.field6435[class145.field1881++] = arg3;
                        }
                    }
                }
            } else if (arg3.field2518 == 16 || arg3.field2518 == 8) {
                int var23 = class479.field6372 + arg3.field2520 - class516.field7041;
                if (var23 >= 0 && var23 <= class479.field6372 + class479.field6372) {
                    int var24 = class479.field6372 + arg3.field2512 - class204.field2599;
                    if (var24 >= 0 && class479.field6372 + class479.field6372 >= var24 && class354.field4511[var23][var24]) {
                        float var25 = (float) (class115.field1488 - arg3.field2523[0]);
                        if (var25 < 0.0F) {
                            var25 *= -1.0F;
                        }
                        float var26 = (float) (class11.field197 - arg3.field2515[0]);
                        if (var26 < 0.0F) {
                            var26 *= -1.0F;
                        }
                        if (!((float) class605.field8510 > var25) || !(var26 < (float) class605.field8510) && class88.method502(arg3, 0, 0) && class88.method502(arg3, 1, 0) && class88.method502(arg3, 2, 0) && class88.method502(arg3, 3, 0)) {
                            class484.field6435[class145.field1881++] = arg3;
                        }
                    }
                }
            } else if (arg3.field2518 == 4) {
                float var15 = (float) (arg3.field2511[0] - class3.field24);
                if (!((float) class152.field1945 >= var15)) {
                    int var16 = arg3.field2512 + class479.field6372 - class204.field2599;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if ((class479.field6372 + class479.field6372) < var16) {
                        return;
                    }
                    int var17 = class479.field6372 + arg3.field2517 - class204.field2599;
                    if (class479.field6372 + class479.field6372 < var17) {
                        var17 = class479.field6372 + class479.field6372;
                    } else if (var17 < 0) {
                        return;
                    }
                    int var18 = class479.field6372 + arg3.field2520 - class516.field7041;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > class479.field6372 + class479.field6372) {
                        return;
                    }
                    int var19 = arg3.field2525 + class479.field6372 - class516.field7041;
                    if ((class479.field6372 + class479.field6372) < var19) {
                        var19 = class479.field6372 + class479.field6372;
                    } else if (var19 < 0) {
                        return;
                    }
                    boolean var20 = false;
                    label294: for (int var21 = var18; var21 <= var19; var21++) {
                        for (int var22 = var16; var22 <= var17; var22++) {
                            if (class354.field4511[var21][var22]) {
                                var20 = true;
                                break label294;
                            }
                        }
                    }
                    if (var20 && class88.method502(arg3, 0, arg2) && class88.method502(arg3, 1, arg2) && class88.method502(arg3, 2, arg2) && class88.method502(arg3, 3, arg2)) {
                        class484.field6435[class145.field1881++] = arg3;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)I", line = 646)
    public final int method3128(int arg0) {
        field7918++;
        return arg0 == 28110 ? this.field7922 : -61;
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lr;Lbda;IIIIIIZI)V", line = 894)
    public class567(class566 arg0, class441 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field7905 = arg7;
        this.field7938 = (byte) arg5;
        this.field7904 = (byte) arg4;
        this.field7919 = arg8;
        this.field7907 = arg6;
        this.field7940 = arg3;
        this.field7927 = arg1.field5504;
        this.field7925 = arg2;
        this.field7913 = arg0.method975() && arg1.field5558 && !this.field7919;
        if (arg9 != -1) {
            this.field7926 = true;
        }
        this.method3122((byte) 105, arg9);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lda;ILr;IZIIILq;)V", line = 666)
    public final void method3129(class474 arg0, int arg1, class566 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, class491 arg8) {
        field7916++;
        class64[] var10 = arg0.method728();
        class214[] var11 = arg0.method706();
        if ((this.field7939 == null || this.field7939.field1293) && (var10 != null || var11 != null)) {
            class441 var12 = class428.field5352.method3138((byte) 120, this.field7927);
            if (var12.field5574 != null) {
                var12 = var12.method2355(class684.field9606, -1643);
            }
            if (var12 != null) {
                this.field7939 = class93.method540(class133.field1735, true);
            }
        }
        if (this.field7939 != null) {
            arg0.method720(arg8);
            if (arg4) {
                this.field7939.method533(arg2, (long) class133.field1735, var10, var11, false);
            } else {
                this.field7939.method534((long) class133.field1735);
            }
            this.field7939.method544(this.field7904, arg1, arg5, arg6, arg3);
        }
        int var13 = -13 % ((-arg7 - 71) / 44);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZILr;ZZII)Lda;", line = 706)
    public final class474 method3130(boolean arg0, int arg1, class566 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field7933++;
        class441 var8 = class428.field5352.method3138((byte) 94, this.field7927);
        if (var8.field5574 != null) {
            var8 = var8.method2355(class684.field9606, -1643);
        }
        if (var8 == null) {
            this.method3123(2, arg2);
            this.field7936 = -1;
            this.field7924 = -1;
            this.field7903 = -1;
            return null;
        }
        if (!this.field7926 && this.field7903 != var8.field5504) {
            this.field7914 = null;
            this.method3122((byte) 112, -1);
        }
        this.method3125(0, arg5, arg1);
        if (arg3) {
            boolean var9 = arg3 & this.field7913 & class301.field3698.method2703(class651.field9191, -108) != 0;
            arg3 = var9 & (this.field7936 != var8.field5504 || this.field7908 != null && class301.field3698.method2703(class651.field9191, -128) >= 2 && (this.field7924 != this.field7915 || (this.field7908.field4992 || class426.field5349) && this.field7935 != this.field7915));
        }
        if (!arg0) {
            field7931 = -12;
        }
        if (arg4 && !arg3) {
            this.field7903 = var8.field5504;
            return null;
        }
        if (arg3) {
            class182.method1138(this.field7921, this.field7938, this.field7907, this.field7905, this.field7910);
            this.field7936 = -1;
            this.field7924 = -1;
        }
        class272 var10 = class491.field6485[this.field7938];
        class272 var11;
        if (this.field7919) {
            var11 = class256.field3127[0];
        } else {
            var11 = this.field7938 < 3 ? class491.field6485[this.field7938 + 1] : null;
        }
        class474 var12 = null;
        if (this.field7908 != null) {
            if (arg3) {
                arg6 |= 0x40000;
            }
            var12 = var8.method2354(this.field7907, this.field7925 == 11 ? this.field7940 + 4 : this.field7940, var10, this.field7929, var11, this.field7908, this.field7935, arg2, var10.method1565(this.field7905, this.field7907, true), this.field7905, this.field7915, 4, arg6, this.field7925 == 11 ? 10 : this.field7925);
            if (var12 == null) {
                this.field7922 = 0;
                this.field7921 = null;
                this.field7911 = 0;
                this.field7910 = null;
            } else {
                if (arg3) {
                    if (this.field7910 == null) {
                        this.field7910 = new boolean[4];
                    }
                    this.field7921 = var12.method752(this.field7921);
                    class8.method63(this.field7921, this.field7938, arg1, arg5, this.field7910);
                    this.field7924 = this.field7915;
                    this.field7936 = var8.field5504;
                }
                this.field7911 = var12.method757();
                this.field7922 = var12.method704();
            }
            this.field7914 = null;
        } else if (this.field7914 != null && (this.field7914.method764() & arg6) == arg6 && this.field7903 == var8.field5504) {
            var12 = this.field7914;
        } else {
            if (this.field7914 != null) {
                arg6 |= this.field7914.method764();
            }
            class275 var13 = var8.method2362(arg6, arg2, var10.method1565(this.field7905, this.field7907, true), var10, this.field7907, -129, var11, this.field7905, arg3, this.field7925 == 11 ? 10 : this.field7925, this.field7925 == 11 ? this.field7940 + 4 : this.field7940);
            if (var13 == null) {
                this.field7914 = null;
                this.field7921 = null;
                this.field7922 = 0;
                this.field7911 = 0;
                this.field7910 = null;
            } else {
                var12 = var13.field3456;
                this.field7914 = var13.field3456;
                if (arg3) {
                    this.field7910 = null;
                    this.field7921 = var13.field3457;
                    class8.method63(this.field7921, this.field7938, arg1, arg5, null);
                    this.field7936 = var8.field5504;
                    this.field7924 = -1;
                }
                this.field7911 = var12.method757();
                this.field7922 = var12.method704();
            }
        }
        this.field7903 = var8.field5504;
        this.field7907 = arg1;
        this.field7905 = arg5;
        return var12;
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)I", line = 862)
    public final int method3131(byte arg0) {
        field7934++;
        if (arg0 != -99) {
            this.field7907 = -88;
        }
        return this.field7911;
    }
}
