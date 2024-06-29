import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class181 {

    @OriginalMember(owner = "client!od", name = "g", descriptor = "[I")
    public static int[] field3101 = new int[100];

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Le;")
    private static class191 field3102 = class54.method368("Loaded input handler", 2047);

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Le;")
    public static class191 field3100 = field3102;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Z")
    public static boolean field3114 = false;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Le;")
    public static class191 field3120 = class54.method368("hitmarks", 2047);

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Le;")
    public static class191 field3112 = class54.method368("loc", 2047);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "J")
    private long field3105;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "J")
    private long field3117;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3104;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Z")
    public boolean field3099;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "[I")
    private int[] field3095;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "[I")
    private int[] field3109;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "[Lpe;")
    public static class224[] field3106;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method1213(int arg0) {
        field3102 = null;
        field3112 = null;
        field3120 = null;
        field3100 = null;
        if (arg0 <= 107) {
            method1221(false);
        }
        field3106 = null;
        field3101 = null;
        field3104 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILab;ILab;)Lee;")
    public final class251 method1214(int arg0, int arg1, class248 arg2, int arg3, class248 arg4) {
        field3115++;
        if (this.field3118 != -1) {
            return class135.method904(-110, this.field3118).method1237(arg4, arg2, arg0, arg1, 60);
        }
        long var6 = this.field3105;
        int[] var8 = this.field3095;
        if (arg4 != null && (arg4.field4400 >= 0 || arg4.field4394 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3095[var9];
            }
            if (arg4.field4400 >= 0) {
                if (arg4.field4400 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class217.method1476(1073741824, arg4.field4400);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg4.field4394 >= 0) {
                if (arg4.field4394 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class217.method1476(1073741824, arg4.field4394);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class251 var10 = (class251) class20.field273.method991(var6, -25858);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((var30 & Integer.MIN_VALUE) != 0 && !class216.method1469(var30 & 0x3FFFFFFF, 0).method1050((byte) -124)) {
                        var11 = true;
                    }
                } else if (!class100.method623(-1, var30 & 0x3FFFFFFF).method1004(this.field3099, false)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3117 != -1L) {
                    var10 = (class251) class20.field273.method991(this.field3117, -25858);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var13 = 0;
                class187[] var14 = new class187[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class187 var28 = class100.method623(arg3 - 13104, var27 & 0x3FFFFFFF).method1006(this.field3099, (byte) -124);
                        if (var28 != null) {
                            var14[var13++] = var28;
                        }
                    } else if ((var27 & Integer.MIN_VALUE) != 0) {
                        class187 var29 = class216.method1469(var27 & 0x3FFFFFFF, arg3 - 13103).method1044((byte) -81);
                        if (var29 != null) {
                            var14[var13++] = var29;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class148 var17 = class100.method623(-1, var16 & 0x3FFFFFFF);
                    if (var17.field2525 != null) {
                        for (int var18 = 0; var18 < var17.field2525.length; var18++) {
                            if (var17.field2525[var18] != null && var14[var18 + 1] != null) {
                                int var19 = var17.field2525[var18][0];
                                int var20 = var17.field2525[var18][2];
                                int var21 = var17.field2525[var18][3];
                                int var22 = var17.field2525[var18][5];
                                int var23 = var17.field2525[var18][1];
                                int var24 = var17.field2525[var18][4];
                                var14[var18 + 1].method1288(var19, var23, var20);
                                var14[var18 + 1].method1286(var21, var24, var22);
                            }
                        }
                    }
                }
                class187 var25 = new class187(var14, var13);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (class200.field3582[var26].length > this.field3109[var26]) {
                        var25.method1283(class46.field833[var26], class200.field3582[var26][this.field3109[var26]]);
                    }
                    if (this.field3109[var26] < class13.field164[var26].length) {
                        var25.method1283(class143.field2375[var26], class13.field164[var26][this.field3109[var26]]);
                    }
                }
                var10 = var25.method1280(64, 850, -30, -50, -30);
                class20.field273.method987(var10, var6, -2438);
                this.field3117 = var6;
            }
        }
        if (arg4 == null && arg2 == null) {
            return var10;
        }
        class251 var31;
        if (arg4 != null && arg2 != null) {
            var31 = arg4.method1737((byte) -11, arg2, arg0, var10, arg1);
        } else if (arg4 == null) {
            var31 = arg2.method1729(arg1, var10, 94);
        } else {
            var31 = arg4.method1729(arg0, var10, 85);
        }
        return arg3 == 13103 ? var31 : null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    private final void method1215(boolean arg0) {
        field3124++;
        long[] var2 = class56.field1030;
        if (arg0) {
            this.method1226((class248) null, 59, -99);
        }
        long var3 = this.field3105;
        this.field3105 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3105 = this.field3105 >>> 8 ^ var2[(int) ((this.field3105 ^ (long) (this.field3095[var5] >> 24)) & 0xFFL)];
            this.field3105 = this.field3105 >>> 8 ^ var2[(int) (((long) (this.field3095[var5] >> 16) ^ this.field3105) & 0xFFL)];
            this.field3105 = var2[(int) ((this.field3105 ^ (long) (this.field3095[var5] >> 8)) & 0xFFL)] ^ this.field3105 >>> 8;
            this.field3105 = this.field3105 >>> 8 ^ var2[(int) (((long) this.field3095[var5] ^ this.field3105) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3105 = this.field3105 >>> 8 ^ var2[(int) (((long) this.field3109[var6] ^ this.field3105) & 0xFFL)];
        }
        this.field3105 = var2[(int) ((this.field3105 ^ (long) (this.field3099 ? 1 : 0)) & 0xFFL)] ^ this.field3105 >>> 8;
        if (var3 != 0L && this.field3105 != var3) {
            class20.field273.method994(122, var3);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V")
    public static final void method1216(boolean arg0) {
        field3121++;
        int var1 = 0;
        if (arg0) {
            field3114 = false;
        }
        while (class256.field4534 > var1) {
            class30 var2 = class30.method214((byte) -94, var1);
            if (var2 != null && var2.field424 == 0) {
                class158.field2680[var1] = 0;
                class164.field2778[var1] = 0;
            }
            var1++;
        }
        class156.field2666 = new class97(16);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)I")
    public final int method1217(int arg0) {
        if (arg0 == 1230265253) {
            field3098++;
            return this.field3118 == -1 ? (this.field3109[0] << 25) + (this.field3109[4] << 20) + (this.field3095[0] << 15) + (this.field3095[11] << 5) + (this.field3095[8] << 10) + this.field3095[1] : 305419896 - -class135.method904(-1, this.field3118).field3168;
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lab;IIII)Lee;")
    public final class251 method1218(class248 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3113++;
        if (arg2 < 79) {
            method1224((byte) -107);
        }
        long var6 = (long) (arg4 << 16) | (long) arg3 << 32 | (long) arg3;
        class251 var8 = (class251) class262.field4647.method991(var6, -25858);
        if (var8 == null) {
            int var9 = 0;
            class187[] var10 = new class187[2];
            if (!class216.method1469(arg3, 0).method1041(false) || !class216.method1469(arg4, 0).method1041(false)) {
                return null;
            }
            class187 var11 = class216.method1469(arg3, 0).method1046(109);
            if (var11 != null) {
                var10[var9++] = var11;
            }
            class187 var12 = class216.method1469(arg4, 0).method1046(97);
            if (var12 != null) {
                var10[var9++] = var12;
            }
            class187 var13 = new class187(var10, var9);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field3109[var14] < class200.field3582[var14].length) {
                    var13.method1283(class46.field833[var14], class200.field3582[var14][this.field3109[var14]]);
                }
                if (class13.field164[var14].length > this.field3109[var14]) {
                    var13.method1283(class143.field2375[var14], class13.field164[var14][this.field3109[var14]]);
                }
            }
            var8 = var13.method1280(64, 768, -50, -10, -50);
            class262.field4647.method987(var8, var6, -2438);
        }
        if (arg0 != null) {
            var8 = arg0.method1728(arg1, (byte) -97, var8);
        }
        return var8;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)V")
    public final void method1219(int arg0, byte arg1, int arg2) {
        field3116++;
        if (arg1 != -87) {
            method1221(true);
        }
        int var4 = class79.field1338[arg0];
        if (this.field3095[var4] != 0 && class216.method1469(arg2, arg1 + 87) != null) {
            this.field3095[var4] = class217.method1476(Integer.MIN_VALUE, arg2);
            this.method1215(false);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([IIB[IZ)V")
    public final void method1220(int[] arg0, int arg1, byte arg2, int[] arg3, boolean arg4) {
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class143.field2379; var7++) {
                    class154 var8 = class216.method1469(var7, 0);
                    if (var8 != null && !var8.field2653 && (var6 + (arg4 ? 7 : 0)) == var8.field2646) {
                        arg3[class79.field1338[var6]] = class217.method1476(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field3099 = arg4;
        this.field3109 = arg0;
        this.field3118 = arg1;
        this.field3095 = arg3;
        this.method1215(false);
        field3096++;
        if (arg2 <= 66) {
            method1223(19, 69, -111);
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(Z)V")
    public static final void method1221(boolean arg0) {
        if (arg0) {
            class12.field143 = class32.field453;
            class201.field3608 = class184.field3230;
        } else {
            class12.field143 = class65.field1136;
            class201.field3608 = class70.field1232;
        }
        class240.field4271 = class201.field3608.length;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
    public final void method1222(int arg0, int arg1, int arg2) {
        field3122++;
        if (arg2 != 255) {
            this.method1218((class248) null, 126, -48, 43, 103);
        }
        this.field3109[arg0] = arg1;
        this.method1215(false);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(III)Z")
    public static final boolean method1223(int arg0, int arg1, int arg2) {
        field3097++;
        if (arg0 != 3539) {
            field3119 = 85;
        }
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static final void method1224(byte arg0) {
        if (!class258.field4575) {
            class167.field2824 = 1;
            class188.field3306[0] = 1003;
            class170.field2881[0] = class199.field3533;
            class33.field475[0] = class26.field385;
            if (class23.field324 != 0) {
                class134.field2258 = class268.field4731;
                class183.field3161 = class132.field2221;
            } else if (class33.field520 == 0) {
                class183.field3161 = class133.field2229;
                class134.field2258 = class189.field3325;
            } else {
                class183.field3161 = class50.field897;
                class134.field2258 = class104.field1709;
            }
        }
        if (class130.field2166 != -1) {
            class92.method564(class130.field2166, -1);
        }
        for (int var1 = 0; var1 < class239.field4257; var1++) {
            if (class189.field3324[var1]) {
                class87.field1428[var1] = true;
            }
            class132.field2209[var1] = class189.field3324[var1];
            class189.field3324[var1] = false;
        }
        field3110++;
        class90.field1473 = class135.field2267;
        class19.field268 = -1;
        class67.field1163 = null;
        class154.field2652 = -1;
        if (class130.field2166 != -1) {
            class239.field4257 = 0;
            class97.method603(0, -1, class200.field3584, 21990, 0, 0, 0, class190.field3337, class130.field2166);
        }
        class7.method38();
        class22.method165((byte) 17);
        if (class258.field4575) {
            class66.method432(16776960);
        } else if (class154.field2652 != -1) {
            class153.method1038((byte) 62, class19.field268, class154.field2652);
        }
        if (class224.field3991 == 3) {
            for (int var2 = 0; var2 < class239.field4257; var2++) {
                if (class132.field2209[var2]) {
                    class7.method57(class86.field1420[var2], field3101[var2], class97.field1570[var2], class61.field1108[var2], 16711935, 128);
                } else if (class87.field1428[var2]) {
                    class7.method57(class86.field1420[var2], field3101[var2], class97.field1570[var2], class61.field1108[var2], 16711680, 128);
                }
            }
        }
        class248.method1734(class182.field3138, (byte) -117, class261.field4598, class175.field2946.field3003, class175.field2946.field2972);
        class182.field3138 = 0;
        if (arg0 > -109) {
            method1227(-70, (class121) null);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BZ)V")
    public final void method1225(byte arg0, boolean arg1) {
        field3107++;
        if (arg0 != -49) {
            method1224((byte) -70);
        }
        this.field3099 = arg1;
        this.method1215(false);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lab;II)Lee;")
    public final class251 method1226(class248 arg0, int arg1, int arg2) {
        field3103++;
        if (this.field3118 != -1) {
            return class135.method904(-113, this.field3118).method1246(arg0, arg1, false);
        }
        class251 var4 = (class251) class262.field4647.method991(this.field3105, -25858);
        if (arg2 != -13) {
            method1221(false);
        }
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field3095[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class216.method1469(var15 & 0x3FFFFFFF, 0).method1041(false)) {
                        var5 = true;
                    }
                } else if (!class100.method623(-1, var15 & 0x3FFFFFFF).method997(this.field3099, (byte) 85)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class187[] var7 = new class187[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field3095[var9];
                if ((var12 & 0x40000000) != 0) {
                    class187 var13 = class100.method623(-1, var12 & 0x3FFFFFFF).method1008(5, this.field3099);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class187 var14 = class216.method1469(var12 & 0x3FFFFFFF, 0).method1046(90);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class187 var10 = new class187(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class200.field3582[var11].length > this.field3109[var11]) {
                    var10.method1283(class46.field833[var11], class200.field3582[var11][this.field3109[var11]]);
                }
                if (this.field3109[var11] < class13.field164[var11].length) {
                    var10.method1283(class143.field2375[var11], class13.field164[var11][this.field3109[var11]]);
                }
            }
            var4 = var10.method1280(64, 768, -50, -10, -50);
            class262.field4647.method987(var4, this.field3105, arg2 ^ 0x989);
        }
        if (arg0 != null) {
            var4 = arg0.method1728(arg1, (byte) -97, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILng;)Z")
    public static final boolean method1227(int arg0, class121 arg1) {
        field3108++;
        return arg1.method818(arg0, class141.field2361);
    }
}
