import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class178 extends class211 {

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    private int field3120 = -1;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Z")
    private boolean field3119 = false;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Luf;")
    private class173 field3113 = null;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    private int field3127 = -1;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    private int field3131 = -32768;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    private int field3124;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    private int field3133;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    private int field3123;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    private int field3126;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    private int field3143;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    private int field3128;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "Lna;")
    private class31 field3136;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    private int field3117;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    private int field3141;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    private int field3130;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    private int field3138;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Lcf;")
    public static class93 field3122 = class147.method1066("zap", -48);

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "[I")
    public static int[] field3142 = new int[1000];

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Lcf;")
    public static class93 field3118 = class147.method1066("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -48);

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "Lg;")
    public static class276 field3139 = new class276(16);

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "Lcf;")
    public static class93 field3144 = class147.method1066("", -48);

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "Lcf;")
    public static class93 field3146 = field3144;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "Lcf;")
    public static class93 field3147 = field3144;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "F")
    public static float field3134;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lcd;")
    public static class27 field3112;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Lod;")
    private class91 field3115;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
    public final int method93() {
        field3135++;
        return this.field3131;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILcf;)I")
    public static final int method1293(int arg0, class93 arg1) {
        field3125++;
        if (arg0 != -1) {
            return 49;
        } else if (class234.field4165 == null || arg1.method666(false) == 0) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class234.field4165.field2273; var2++) {
                if (class234.field4165.field2260[var2].method636(class249.field4481, class228.field4090, (byte) 102).method681(~arg0, arg1)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)Lgl;")
    private final class211 method1294(boolean arg0, int arg1) {
        boolean var3 = class69.field1265 != class233.field4151;
        field3137++;
        class240 var4 = class34.method197(-118, this.field3143);
        int var5 = var4.field4309;
        if (var4.field4275 != null) {
            var4 = var4.method1631(0);
        }
        if (var4 == null) {
            return null;
        }
        if (class78.field1460 != 0 && this.field3119 && (this.field3136 == null || this.field3136 != null && this.field3136.field464 != var4.field4309)) {
            int var6 = var4.field4309;
            if (var4.field4309 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field3136 = null;
            } else {
                this.field3136 = class131.method964(var6, true);
            }
            if (this.field3136 != null) {
                if (var4.field4336 && this.field3136.field489 != -1) {
                    this.field3117 = (int) (Math.random() * (double) this.field3136.field479.length);
                    this.field3138 -= (int) (Math.random() * (double) this.field3136.field486[this.field3117]);
                } else {
                    this.field3138 = class275.field4921 - 1;
                    this.field3117 = 0;
                }
            }
        }
        int var7 = this.field3128 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var8 = var4.field4288;
            var9 = var4.field4285;
        } else {
            var8 = var4.field4285;
            var9 = var4.field4288;
        }
        int var10 = (var8 >> 1) + this.field3126;
        int var11 = (var9 >> 1) + this.field3133;
        int var12 = this.field3133 + (var9 + 1 >> 1);
        int var13 = (var8 + 1 >> 1) + this.field3126;
        this.method1297(true, var11 * 128, var10 * 128);
        boolean var14 = !var3 && var4.field4276 && (this.field3127 != var4.field4318 || (this.field3120 != this.field3117 || this.field3136 != null && (this.field3136.field469 || class148.field2612) && this.field3141 != this.field3117) && class280.field5052 >= 2);
        if (arg0 && !var14) {
            return null;
        }
        int var15 = (this.field3133 << 7) + (var9 << 6);
        int var16 = (this.field3126 << 7) + (var8 << 6);
        int[][] var17 = class233.field4151[this.field3124];
        int[][] var18 = null;
        boolean var19 = this.field3113 == null;
        if (var3) {
            var18 = class69.field1265[0];
        } else if (this.field3124 < 3) {
            var18 = class233.field4151[this.field3124 + 1];
        }
        if (arg1 != 6200) {
            field3112 = null;
        }
        int var20 = var17[var11][var10] + var17[var12][var10] + var17[var11][var13] + var17[var12][var13] >> 2;
        class143 var21;
        if (this.field3136 == null) {
            var21 = var4.method1632(false, var19 ? class183.field3376 : this.field3113, var15, var17, var18, var14, (byte) 59, this.field3128, var16, var20, this.field3123);
        } else {
            var21 = var4.method1635(this.field3128, var17, this.field3141, this.field3117, this.field3136, this.field3130, var14, var15, var18, var20, var16, this.field3123, var19 ? class183.field3376 : this.field3113, -98);
        }
        return var21 == null ? null : var21.field2483;
    }

    @OriginalMember(owner = "client!tc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3121++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static void method1295(int arg0) {
        field3139 = null;
        field3144 = null;
        field3147 = null;
        field3112 = null;
        field3118 = null;
        field3122 = null;
        field3142 = null;
        field3146 = null;
        if (arg0 >= -32) {
            field3146 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)I")
    public static final int method1296(int arg0, int arg1, byte arg2) {
        int var3 = arg0 >>> 31;
        if (arg2 == -116) {
            field3114++;
            return (arg0 + var3) / arg1 - var3;
        } else {
            return 8;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZII)V")
    private final void method1297(boolean arg0, int arg1, int arg2) {
        field3111++;
        if (this.field3136 != null) {
            int var4 = class275.field4921 - this.field3138;
            if (var4 > 100 && this.field3136.field489 > 0) {
                int var5 = this.field3136.field479.length - this.field3136.field489;
                while (var5 > this.field3117 && var4 > this.field3136.field486[this.field3117]) {
                    var4 -= this.field3136.field486[this.field3117];
                    this.field3117++;
                }
                if (var5 <= this.field3117) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3136.field479.length; var7++) {
                        var6 += this.field3136.field486[var7];
                    }
                    var4 %= var6;
                }
                this.field3141 = this.field3117 + 1;
                if (this.field3136.field479.length <= this.field3141) {
                    this.field3141 -= this.field3136.field489;
                    if (this.field3141 < 0 || this.field3136.field479.length <= this.field3141) {
                        this.field3141 = -1;
                    }
                }
            }
            while (this.field3136.field486[this.field3117] < var4) {
                class55.method309(arg2, this.field3117, this.field3136, arg1, -17474, false);
                var4 -= this.field3136.field486[this.field3117];
                this.field3117++;
                if (this.field3136.field479.length <= this.field3117) {
                    this.field3117 -= this.field3136.field489;
                    if (this.field3117 < 0 || this.field3117 >= this.field3136.field479.length) {
                        this.field3136 = null;
                        break;
                    }
                }
                this.field3141 = this.field3117 + 1;
                if (this.field3136.field479.length <= this.field3141) {
                    this.field3141 -= this.field3136.field489;
                    if (this.field3141 < 0 || this.field3136.field479.length <= this.field3141) {
                        this.field3141 = -1;
                    }
                }
            }
            this.field3130 = var4;
            this.field3138 = class275.field4921 - var4;
        }
        if (!arg0) {
            method1298(80, -21, (class223) null);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1297(true, arg3, arg4);
        field3129++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILme;)V")
    public static final void method1298(int arg0, int arg1, class223 arg2) {
        field3132++;
        if (arg1 != -6) {
            return;
        }
        Object[] var3 = arg2.field4015;
        int var4 = (Integer) var3[0];
        class216 var5 = class255.method1733(arg1 ^ 0x4, var4);
        if (var5 == null) {
            return;
        }
        class105.field1813 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        byte var9 = -1;
        int[] var10 = var5.field3933;
        int[] var11 = var5.field3929;
        try {
            class243.field4388 = new int[var5.field3928];
            class60.field1017 = new class93[var5.field3935];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg2.field4022;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg2.field4014;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg2.field4017 == null ? -1 : arg2.field4017.field3219;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg2.field4023;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg2.field4017 == null ? -1 : arg2.field4017.field3293;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg2.field4016 == null ? -1 : arg2.field4016.field3219;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg2.field4016 == null ? -1 : arg2.field4016.field3293;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg2.field4010;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg2.field4013;
                    }
                    class243.field4388[var12++] = var15;
                } else if (var3[var14] instanceof class93) {
                    class93 var16 = (class93) var3[var14];
                    if (var16.method667(class97.field1728, (byte) -117)) {
                        var16 = arg2.field4012;
                    }
                    class60.field1017[var13++] = var16;
                }
            }
            int var17 = 0;
            label3877: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var498 = var11[var8];
                if (var498 < 100) {
                    if (var498 == 0) {
                        class172.field3017[var6++] = var10[var8];
                        continue;
                    }
                    if (var498 == 1) {
                        int var18 = var10[var8];
                        class172.field3017[var6++] = class176.field3061[var18];
                        continue;
                    }
                    if (var498 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class9.method40(17739, var19, class172.field3017[var6]);
                        continue;
                    }
                    if (var498 == 3) {
                        class69.field1258[var7++] = var5.field3927[var8];
                        continue;
                    }
                    if (var498 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var498 == 7) {
                        var6 -= 2;
                        if (class172.field3017[var6 + 1] != class172.field3017[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var498 == 8) {
                        var6 -= 2;
                        if (class172.field3017[var6 + 1] == class172.field3017[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var498 == 9) {
                        var6 -= 2;
                        if (class172.field3017[var6] < class172.field3017[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var498 == 10) {
                        var6 -= 2;
                        if (class172.field3017[var6 + 1] < class172.field3017[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var498 == 21) {
                        if (class105.field1813 == 0) {
                            return;
                        }
                        class1 var20 = class92.field1621[--class105.field1813];
                        class60.field1017 = var20.field1;
                        var8 = var20.field4;
                        class243.field4388 = var20.field5;
                        var5 = var20.field7;
                        var11 = var5.field3929;
                        var10 = var5.field3933;
                        continue;
                    }
                    if (var498 == 25) {
                        int var21 = var10[var8];
                        class172.field3017[var6++] = class159.method1148(1051585612, var21);
                        continue;
                    }
                    if (var498 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class82.method579(class172.field3017[var6], true, var22);
                        continue;
                    }
                    if (var498 == 31) {
                        var6 -= 2;
                        if (class172.field3017[var6 + 1] >= class172.field3017[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var498 == 32) {
                        var6 -= 2;
                        if (class172.field3017[var6 + 1] <= class172.field3017[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var498 == 33) {
                        class172.field3017[var6++] = class243.field4388[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var498 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class243.field4388[var10001] = class172.field3017[var6];
                        continue;
                    }
                    if (var498 == 35) {
                        class69.field1258[var7++] = class60.field1017[var10[var8]];
                        continue;
                    }
                    if (var498 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class60.field1017[var10001] = class69.field1258[var7];
                        continue;
                    }
                    if (var498 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class93 var24 = class86.method591(var23, (byte) 83, var7, class69.field1258);
                        class69.field1258[var7++] = var24;
                        continue;
                    }
                    if (var498 == 38) {
                        var6--;
                        continue;
                    }
                    if (var498 == 39) {
                        var7--;
                        continue;
                    }
                    if (var498 == 40) {
                        int var25 = var10[var8];
                        class216 var26 = class255.method1733(-2, var25);
                        int[] var27 = new int[var26.field3928];
                        class93[] var28 = new class93[var26.field3935];
                        for (int var29 = 0; var29 < var26.field3940; var29++) {
                            var27[var29] = class172.field3017[var6 + var29 - var26.field3940];
                        }
                        for (int var30 = 0; var30 < var26.field3932; var30++) {
                            var28[var30] = class69.field1258[var7 + var30 - var26.field3932];
                        }
                        var7 -= var26.field3932;
                        var6 -= var26.field3940;
                        class1 var31 = new class1();
                        var31.field5 = class243.field4388;
                        var31.field4 = var8;
                        var31.field7 = var5;
                        var31.field1 = class60.field1017;
                        if (class92.field1621.length <= class105.field1813) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        class92.field1621[class105.field1813++] = var31;
                        class60.field1017 = var28;
                        var5 = var26;
                        var11 = var26.field3929;
                        class243.field4388 = var27;
                        var10 = var26.field3933;
                        continue;
                    }
                    if (var498 == 42) {
                        class172.field3017[var6++] = class250.field4496[var10[var8]];
                        continue;
                    }
                    if (var498 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class250.field4496[var32] = class172.field3017[var6];
                        class120.method891(var32, -1);
                        continue;
                    }
                    if (var498 == 44) {
                        int var33 = var10[var8] & 0xFFFF;
                        var6--;
                        int var34 = class172.field3017[var6];
                        int var35 = var10[var8] >> 16;
                        if (var34 >= 0 && var34 <= 5000) {
                            class3.field25[var35] = var34;
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var34) {
                                    continue label3877;
                                }
                                class109.field1867[var35][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 45) {
                        var6--;
                        int var38 = class172.field3017[var6];
                        int var39 = var10[var8];
                        if (var38 >= 0 && class3.field25[var39] > var38) {
                            class172.field3017[var6++] = class109.field1867[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 46) {
                        var6 -= 2;
                        int var40 = class172.field3017[var6];
                        int var41 = var10[var8];
                        if (var40 >= 0 && var40 < class3.field25[var41]) {
                            class109.field1867[var41][var40] = class172.field3017[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 47) {
                        class93 var42 = class47.field758[var10[var8]];
                        if (var42 == null) {
                            var42 = class247.field4455;
                        }
                        class69.field1258[var7++] = var42;
                        continue;
                    }
                    if (var498 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class47.field758[var43] = class69.field1258[var7];
                        class131.method963(var43, -97);
                        continue;
                    }
                    if (var498 == 51) {
                        class25 var44 = var5.field3936[var10[var8]];
                        var6--;
                        class236 var45 = (class236) var44.method135((long) class172.field3017[var6], true);
                        if (var45 != null) {
                            var8 += var45.field4210;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var498 < 300) {
                    if (var498 == 100) {
                        var6 -= 3;
                        int var477 = class172.field3017[var6];
                        int var478 = class172.field3017[var6 + 2];
                        int var479 = class172.field3017[var6 + 1];
                        if (var479 == 0) {
                            throw new RuntimeException();
                        }
                        class181 var480 = client.method1114(arg1 ^ 0x51FD, var477);
                        if (var480.field3336 == null) {
                            var480.field3336 = new class181[var478 + 1];
                        }
                        if (var478 >= var480.field3336.length) {
                            class181[] var481 = new class181[var478 + 1];
                            for (int var482 = 0; var482 < var480.field3336.length; var482++) {
                                var481[var482] = var480.field3336[var482];
                            }
                            var480.field3336 = var481;
                        }
                        if (var478 > 0 && var480.field3336[var478 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var478 - 1));
                        }
                        class181 var483 = new class181();
                        var483.field3307 = true;
                        var483.field3321 = var483.field3219 = var480.field3219;
                        var483.field3293 = var478;
                        var483.field3289 = var479;
                        var480.field3336[var478] = var483;
                        if (var46) {
                            class287.field5136 = var483;
                        } else {
                            class110.field1879 = var483;
                        }
                        class254.method1731(var480, (byte) 72);
                        continue;
                    }
                    if (var498 == 101) {
                        class181 var484 = var46 ? class287.field5136 : class110.field1879;
                        if (var484.field3293 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class181 var485 = client.method1114(-20985, var484.field3219);
                        var485.field3336[var484.field3293] = null;
                        class254.method1731(var485, (byte) -94);
                        continue;
                    }
                    if (var498 == 102) {
                        var6--;
                        class181 var486 = client.method1114(-20985, class172.field3017[var6]);
                        var486.field3336 = null;
                        class254.method1731(var486, (byte) -75);
                        continue;
                    }
                    if (var498 == 200) {
                        var6 -= 2;
                        int var487 = class172.field3017[var6];
                        int var488 = class172.field3017[var6 + 1];
                        class181 var489 = class5.method21(var487, var488, (byte) 40);
                        if (var489 != null && var488 != -1) {
                            class172.field3017[var6++] = 1;
                            if (var46) {
                                class287.field5136 = var489;
                            } else {
                                class110.field1879 = var489;
                            }
                            continue;
                        }
                        class172.field3017[var6++] = 0;
                        continue;
                    }
                    if (var498 == 201) {
                        var6--;
                        int var490 = class172.field3017[var6];
                        class181 var491 = client.method1114(-20985, var490);
                        if (var491 == null) {
                            class172.field3017[var6++] = 0;
                        } else {
                            class172.field3017[var6++] = 1;
                            if (var46) {
                                class287.field5136 = var491;
                            } else {
                                class110.field1879 = var491;
                            }
                        }
                        continue;
                    }
                } else if (var498 < 500) {
                    if (var498 == 403) {
                        var6 -= 2;
                        int var47 = class172.field3017[var6];
                        int var48 = class172.field3017[var6 + 1];
                        for (int var49 = 0; var49 < class113.field1935.length; var49++) {
                            if (class113.field1935[var49] == var47) {
                                class166.field2927.field4249.method1173(var49, var48, (byte) -99);
                                continue label3877;
                            }
                        }
                        int var50 = 0;
                        while (true) {
                            if (class135.field2368.length <= var50) {
                                continue label3877;
                            }
                            if (class135.field2368[var50] == var47) {
                                class166.field2927.field4249.method1173(var50, var48, (byte) -94);
                                continue label3877;
                            }
                            var50++;
                        }
                    }
                    if (var498 == 404) {
                        var6 -= 2;
                        int var51 = class172.field3017[var6];
                        int var52 = class172.field3017[var6 + 1];
                        class166.field2927.field4249.method1175(var51, (byte) 27, var52);
                        continue;
                    }
                    if (var498 == 410) {
                        var6--;
                        boolean var53 = class172.field3017[var6] != 0;
                        class166.field2927.field4249.method1171(false, var53);
                        continue;
                    }
                } else if (var498 >= 1000 && var498 < 1100 || var498 >= 2000 && var498 < 2100) {
                    class181 var54;
                    if (var498 < 2000) {
                        var54 = var46 ? class287.field5136 : class110.field1879;
                    } else {
                        var498 -= 1000;
                        var6--;
                        var54 = client.method1114(-20985, class172.field3017[var6]);
                    }
                    if (var498 == 1000) {
                        var6 -= 4;
                        var54.field3253 = class172.field3017[var6];
                        var54.field3248 = class172.field3017[var6 + 1];
                        int var55 = class172.field3017[var6 + 2];
                        int var56 = class172.field3017[var6 + 3];
                        if (var55 < 0) {
                            var55 = 0;
                        } else if (var55 > 5) {
                            var55 = 5;
                        }
                        if (var56 < 0) {
                            var56 = 0;
                        } else if (var56 > 5) {
                            var56 = 5;
                        }
                        var54.field3351 = (byte) var55;
                        var54.field3294 = (byte) var56;
                        class254.method1731(var54, (byte) 81);
                        class40.method229((byte) 126, var54);
                        if (var54.field3293 == -1) {
                            class193.method1382(var54.field3219, -108);
                        }
                        continue;
                    }
                    if (var498 == 1001) {
                        var6 -= 4;
                        var54.field3277 = class172.field3017[var6];
                        var54.field3210 = class172.field3017[var6 + 1];
                        var54.field3292 = 0;
                        var54.field3200 = 0;
                        int var57 = class172.field3017[var6 + 3];
                        int var58 = class172.field3017[var6 + 2];
                        if (var58 < 0) {
                            var58 = 0;
                        } else if (var58 > 4) {
                            var58 = 4;
                        }
                        if (var57 < 0) {
                            var57 = 0;
                        } else if (var57 > 4) {
                            var57 = 4;
                        }
                        var54.field3229 = (byte) var58;
                        var54.field3324 = (byte) var57;
                        class254.method1731(var54, (byte) -103);
                        class40.method229((byte) 127, var54);
                        if (var54.field3289 == 0) {
                            class32.method192(var54, false, -1);
                        }
                        continue;
                    }
                    if (var498 == 1003) {
                        var6--;
                        boolean var59 = class172.field3017[var6] == 1;
                        if (var54.field3290 != var59) {
                            var54.field3290 = var59;
                            class254.method1731(var54, (byte) 93);
                        }
                        if (var54.field3293 == -1) {
                            class187.method1356(var54.field3219, -10);
                        }
                        continue;
                    }
                    if (var498 == 1004) {
                        var6 -= 2;
                        var54.field3352 = class172.field3017[var6];
                        var54.field3234 = class172.field3017[var6 + 1];
                        class254.method1731(var54, (byte) -126);
                        class40.method229((byte) 120, var54);
                        if (var54.field3289 == 0) {
                            class32.method192(var54, false, -1);
                        }
                        continue;
                    }
                    if (var498 == 1005) {
                        var6--;
                        var54.field3268 = class172.field3017[var6] == 1;
                        continue;
                    }
                } else if (var498 >= 1100 && var498 < 1200 || var498 >= 2100 && var498 < 2200) {
                    class181 var60;
                    if (var498 < 2000) {
                        var60 = var46 ? class287.field5136 : class110.field1879;
                    } else {
                        var498 -= 1000;
                        var6--;
                        var60 = client.method1114(-20985, class172.field3017[var6]);
                    }
                    if (var498 == 1100) {
                        var6 -= 2;
                        var60.field3310 = class172.field3017[var6];
                        if (var60.field3184 - var60.field3270 < var60.field3310) {
                            var60.field3310 = var60.field3184 - var60.field3270;
                        }
                        if (var60.field3310 < 0) {
                            var60.field3310 = 0;
                        }
                        var60.field3282 = class172.field3017[var6 + 1];
                        if ((var60.field3334 - var60.field3252) < var60.field3282) {
                            var60.field3282 = var60.field3334 - var60.field3252;
                        }
                        if (var60.field3282 < 0) {
                            var60.field3282 = 0;
                        }
                        class254.method1731(var60, (byte) 83);
                        if (var60.field3293 == -1) {
                            class284.method1943(var60.field3219, (byte) -85);
                        }
                        continue;
                    }
                    if (var498 == 1101) {
                        var6--;
                        var60.field3180 = class172.field3017[var6];
                        class254.method1731(var60, (byte) -95);
                        if (var60.field3293 == -1) {
                            class176.method1257(arg1 - 824181422, var60.field3219);
                        }
                        continue;
                    }
                    if (var498 == 1102) {
                        var6--;
                        var60.field3240 = class172.field3017[var6] == 1;
                        class254.method1731(var60, (byte) -122);
                        continue;
                    }
                    if (var498 == 1103) {
                        var6--;
                        var60.field3306 = class172.field3017[var6];
                        class254.method1731(var60, (byte) 87);
                        continue;
                    }
                    if (var498 == 1104) {
                        var6--;
                        var60.field3312 = class172.field3017[var6];
                        class254.method1731(var60, (byte) -65);
                        continue;
                    }
                    if (var498 == 1105) {
                        var6--;
                        var60.field3308 = class172.field3017[var6];
                        class254.method1731(var60, (byte) -69);
                        continue;
                    }
                    if (var498 == 1106) {
                        var6--;
                        var60.field3273 = class172.field3017[var6];
                        class254.method1731(var60, (byte) -128);
                        continue;
                    }
                    if (var498 == 1107) {
                        var6--;
                        var60.field3198 = class172.field3017[var6] == 1;
                        class254.method1731(var60, (byte) -102);
                        continue;
                    }
                    if (var498 == 1108) {
                        var60.field3287 = 1;
                        var6--;
                        var60.field3326 = class172.field3017[var6];
                        class254.method1731(var60, (byte) 114);
                        if (var60.field3293 == -1) {
                            class15.method70(var60.field3219, (byte) -59);
                        }
                        continue;
                    }
                    if (var498 == 1109) {
                        var6 -= 6;
                        var60.field3325 = class172.field3017[var6];
                        var60.field3249 = class172.field3017[var6 + 1];
                        var60.field3254 = class172.field3017[var6 + 2];
                        var60.field3243 = class172.field3017[var6 + 3];
                        var60.field3355 = class172.field3017[var6 + 4];
                        var60.field3260 = class172.field3017[var6 + 5];
                        class254.method1731(var60, (byte) -93);
                        if (var60.field3293 == -1) {
                            class251.method1705(false, var60.field3219);
                            class237.method1613((byte) -72, var60.field3219);
                        }
                        continue;
                    }
                    if (var498 == 1110) {
                        var6--;
                        int var61 = class172.field3017[var6];
                        if (var60.field3203 != var61) {
                            var60.field3204 = 1;
                            var60.field3203 = var61;
                            var60.field3328 = 0;
                            var60.field3337 = 0;
                            class254.method1731(var60, (byte) 99);
                        }
                        if (var60.field3293 == -1) {
                            class258.method1740(var60.field3219, arg1 + 6);
                        }
                        continue;
                    }
                    if (var498 == 1111) {
                        var6--;
                        var60.field3216 = class172.field3017[var6] == 1;
                        class254.method1731(var60, (byte) 116);
                        continue;
                    }
                    if (var498 == 1112) {
                        var7--;
                        class93 var62 = class69.field1258[var7];
                        if (!var62.method667(var60.field3258, (byte) -118)) {
                            var60.field3258 = var62;
                            class254.method1731(var60, (byte) 97);
                        }
                        if (var60.field3293 == -1) {
                            class277.method1857(72, var60.field3219);
                        }
                        continue;
                    }
                    if (var498 == 1113) {
                        var6--;
                        var60.field3347 = class172.field3017[var6];
                        class254.method1731(var60, (byte) -75);
                        continue;
                    }
                    if (var498 == 1114) {
                        var6 -= 3;
                        var60.field3183 = class172.field3017[var6];
                        var60.field3288 = class172.field3017[var6 + 1];
                        var60.field3272 = class172.field3017[var6 + 2];
                        class254.method1731(var60, (byte) 117);
                        continue;
                    }
                    if (var498 == 1115) {
                        var6--;
                        var60.field3256 = class172.field3017[var6] == 1;
                        class254.method1731(var60, (byte) 45);
                        continue;
                    }
                    if (var498 == 1116) {
                        var6--;
                        var60.field3195 = class172.field3017[var6];
                        class254.method1731(var60, (byte) -112);
                        continue;
                    }
                    if (var498 == 1117) {
                        var6--;
                        var60.field3232 = class172.field3017[var6];
                        class254.method1731(var60, (byte) 102);
                        continue;
                    }
                    if (var498 == 1118) {
                        var6--;
                        var60.field3327 = class172.field3017[var6] == 1;
                        class254.method1731(var60, (byte) 102);
                        continue;
                    }
                    if (var498 == 1119) {
                        var6--;
                        var60.field3299 = class172.field3017[var6] == 1;
                        class254.method1731(var60, (byte) 107);
                        continue;
                    }
                    if (var498 == 1120) {
                        var6 -= 2;
                        var60.field3184 = class172.field3017[var6];
                        var60.field3334 = class172.field3017[var6 + 1];
                        class254.method1731(var60, (byte) 121);
                        if (var60.field3289 == 0) {
                            class32.method192(var60, false, -1);
                        }
                        continue;
                    }
                    if (var498 == 1121) {
                        class254.method1731(var60, (byte) 46);
                        var6 -= 2;
                        continue;
                    }
                    if (var498 == 1122) {
                        var6--;
                        var60.field3285 = class172.field3017[var6] == 1;
                        class254.method1731(var60, (byte) 108);
                        continue;
                    }
                    if (var498 == 1123) {
                        var6--;
                        var60.field3260 = class172.field3017[var6];
                        class254.method1731(var60, (byte) -116);
                        if (var60.field3293 == -1) {
                            class251.method1705(false, var60.field3219);
                        }
                        continue;
                    }
                } else {
                    int var10000;
                    if (var498 >= 1200 && var498 < 1300 || var498 >= 2200 && var498 < 2300) {
                        class181 var63;
                        if (var498 >= 2000) {
                            var10000 = arg1 ^ 0x51FD;
                            var6--;
                            var63 = client.method1114(var10000, class172.field3017[var6]);
                            var498 -= 1000;
                        } else {
                            var63 = var46 ? class287.field5136 : class110.field1879;
                        }
                        class254.method1731(var63, (byte) 90);
                        if (var498 == 1200 || var498 == 1205) {
                            var6 -= 2;
                            int var64 = class172.field3017[var6 + 1];
                            int var65 = class172.field3017[var6];
                            if (var63.field3293 == -1) {
                                class275.method1844(7252, var63.field3219);
                                class251.method1705(false, var63.field3219);
                                class237.method1613((byte) -67, var63.field3219);
                            }
                            if (var65 == -1) {
                                var63.field3357 = -1;
                                var63.field3326 = -1;
                                var63.field3287 = 1;
                            } else {
                                var63.field3357 = var65;
                                var63.field3250 = var64;
                                class29 var66 = class89.method617(var65, 0);
                                var63.field3355 = var66.field411;
                                var63.field3243 = var66.field393;
                                var63.field3254 = var66.field403;
                                var63.field3249 = var66.field422;
                                var63.field3325 = var66.field371;
                                var63.field3260 = var66.field418;
                                if (var498 == 1205) {
                                    var63.field3228 = false;
                                } else {
                                    var63.field3228 = true;
                                }
                                if (var63.field3292 > 0) {
                                    var63.field3260 = var63.field3260 * 32 / var63.field3292;
                                } else if (var63.field3277 > 0) {
                                    var63.field3260 = var63.field3260 * 32 / var63.field3277;
                                }
                            }
                            continue;
                        }
                        if (var498 == 1201) {
                            var63.field3287 = 2;
                            var6--;
                            var63.field3326 = class172.field3017[var6];
                            if (var63.field3293 == -1) {
                                class15.method70(var63.field3219, (byte) -87);
                            }
                            continue;
                        }
                        if (var498 == 1202) {
                            var63.field3287 = 3;
                            var63.field3326 = class166.field2927.field4249.method1168(12);
                            if (var63.field3293 == -1) {
                                class15.method70(var63.field3219, (byte) -85);
                            }
                            continue;
                        }
                        if (var498 == 1203) {
                            var63.field3287 = 6;
                            var6--;
                            var63.field3326 = class172.field3017[var6];
                            if (var63.field3293 == -1) {
                                class15.method70(var63.field3219, (byte) -104);
                            }
                            continue;
                        }
                        if (var498 == 1204) {
                            var63.field3287 = 5;
                            var6--;
                            var63.field3326 = class172.field3017[var6];
                            if (var63.field3293 == -1) {
                                class15.method70(var63.field3219, (byte) -22);
                            }
                            continue;
                        }
                    } else if (var498 >= 1300 && var498 < 1400 || var498 >= 2300 && var498 < 2400) {
                        class181 var67;
                        if (var498 < 2000) {
                            var67 = var46 ? class287.field5136 : class110.field1879;
                        } else {
                            var6--;
                            var67 = client.method1114(-20985, class172.field3017[var6]);
                            var498 -= 1000;
                        }
                        if (var498 == 1300) {
                            var6--;
                            int var68 = class172.field3017[var6] - 1;
                            if (var68 >= 0 && var68 <= 9) {
                                var7--;
                                var67.method1339(class69.field1258[var7], var68, false);
                                continue;
                            }
                            var7--;
                            continue;
                        }
                        if (var498 == 1301) {
                            var6 -= 2;
                            int var69 = class172.field3017[var6];
                            int var70 = class172.field3017[var6 + 1];
                            var67.field3344 = class5.method21(var69, var70, (byte) 40);
                            continue;
                        }
                        if (var498 == 1302) {
                            var6--;
                            var67.field3267 = class172.field3017[var6] == 1;
                            continue;
                        }
                        if (var498 == 1303) {
                            var6--;
                            var67.field3185 = class172.field3017[var6];
                            continue;
                        }
                        if (var498 == 1304) {
                            var6--;
                            var67.field3208 = class172.field3017[var6];
                            continue;
                        }
                        if (var498 == 1305) {
                            var7--;
                            var67.field3274 = class69.field1258[var7];
                            continue;
                        }
                        if (var498 == 1306) {
                            var7--;
                            var67.field3246 = class69.field1258[var7];
                            continue;
                        }
                        if (var498 == 1307) {
                            var67.field3286 = null;
                            continue;
                        }
                        if (var498 == 1308) {
                            var6--;
                            var67.field3320 = class172.field3017[var6];
                            var6--;
                            var67.field3341 = class172.field3017[var6];
                            continue;
                        }
                        if (var498 == 1309) {
                            var6--;
                            int var71 = class172.field3017[var6];
                            var6--;
                            int var72 = class172.field3017[var6];
                            if (var72 >= 1 && var72 <= 10) {
                                var67.method1338(var71, 1, var72 - 1);
                            }
                            continue;
                        }
                    } else {
                        if (var498 >= 1400 && var498 < 1500 || var498 >= 2400 && var498 < 2500) {
                            class181 var470;
                            if (var498 < 2000) {
                                var470 = var46 ? class287.field5136 : class110.field1879;
                            } else {
                                var6--;
                                var470 = client.method1114(-20985, class172.field3017[var6]);
                                var498 -= 1000;
                            }
                            var7--;
                            class93 var471 = class69.field1258[var7];
                            int[] var472 = null;
                            if (var471.method666(false) > 0 && var471.method645(255, var471.method666(false) - 1) == 89) {
                                var6--;
                                int var473 = class172.field3017[var6];
                                if (var473 > 0) {
                                    var472 = new int[var473];
                                    while ((var473--) > 0) {
                                        var6--;
                                        var472[var473] = class172.field3017[var6];
                                    }
                                }
                                var471 = var471.method674(-126, 0, var471.method666(false) - 1);
                            }
                            Object[] var474 = new Object[var471.method666(false) + 1];
                            for (int var475 = var474.length - 1; var475 >= 1; var475--) {
                                if (var471.method645(255, var475 - 1) == 115) {
                                    var7--;
                                    var474[var475] = class69.field1258[var7];
                                } else {
                                    var6--;
                                    var474[var475] = Integer.valueOf(class172.field3017[var6]);
                                }
                            }
                            var6--;
                            int var476 = class172.field3017[var6];
                            if (var476 == -1) {
                                var474 = null;
                            } else {
                                var474[0] = Integer.valueOf(var476);
                            }
                            var470.field3237 = true;
                            if (var498 == 1400) {
                                var470.field3222 = var474;
                            } else if (var498 == 1401) {
                                var470.field3275 = var474;
                            } else if (var498 == 1402) {
                                var470.field3227 = var474;
                            } else if (var498 == 1403) {
                                var470.field3302 = var474;
                            } else if (var498 == 1404) {
                                var470.field3269 = var474;
                            } else if (var498 == 1405) {
                                var470.field3181 = var474;
                            } else if (var498 == 1406) {
                                var470.field3186 = var474;
                            } else if (var498 == 1407) {
                                var470.field3188 = var474;
                                var470.field3317 = var472;
                            } else if (var498 == 1408) {
                                var470.field3350 = var474;
                            } else if (var498 == 1409) {
                                var470.field3242 = var474;
                            } else if (var498 == 1410) {
                                var470.field3251 = var474;
                            } else if (var498 == 1411) {
                                var470.field3235 = var474;
                            } else if (var498 == 1412) {
                                var470.field3196 = var474;
                            } else if (var498 == 1414) {
                                var470.field3309 = var472;
                                var470.field3356 = var474;
                            } else if (var498 == 1415) {
                                var470.field3316 = var474;
                                var470.field3345 = var472;
                            } else if (var498 == 1416) {
                                var470.field3330 = var474;
                            } else if (var498 == 1417) {
                                var470.field3329 = var474;
                            } else if (var498 == 1418) {
                                var470.field3225 = var474;
                            } else if (var498 == 1419) {
                                var470.field3236 = var474;
                            } else if (var498 == 1420) {
                                var470.field3358 = var474;
                            } else if (var498 == 1421) {
                                var470.field3343 = var474;
                            } else if (var498 == 1422) {
                                var470.field3182 = var474;
                            } else if (var498 == 1423) {
                                var470.field3201 = var474;
                            } else if (var498 == 1424) {
                                var470.field3262 = var474;
                            } else if (var498 == 1425) {
                                var470.field3217 = var474;
                            } else if (var498 == 1426) {
                                var470.field3241 = var474;
                            } else if (var498 == 1427) {
                                var470.field3284 = var474;
                            } else if (var498 == 1428) {
                                var470.field3278 = var474;
                                var470.field3245 = var472;
                            } else if (var498 == 1429) {
                                var470.field3300 = var474;
                                var470.field3279 = var472;
                            }
                            continue;
                        }
                        if (var498 < 1600) {
                            class181 var73 = var46 ? class287.field5136 : class110.field1879;
                            if (var498 == 1500) {
                                class172.field3017[var6++] = var73.field3214;
                                continue;
                            }
                            if (var498 == 1501) {
                                class172.field3017[var6++] = var73.field3189;
                                continue;
                            }
                            if (var498 == 1502) {
                                class172.field3017[var6++] = var73.field3270;
                                continue;
                            }
                            if (var498 == 1503) {
                                class172.field3017[var6++] = var73.field3252;
                                continue;
                            }
                            if (var498 == 1504) {
                                class172.field3017[var6++] = var73.field3290 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 1505) {
                                class172.field3017[var6++] = var73.field3321;
                                continue;
                            }
                        } else if (var498 < 1700) {
                            class181 var74 = var46 ? class287.field5136 : class110.field1879;
                            if (var498 == 1600) {
                                class172.field3017[var6++] = var74.field3310;
                                continue;
                            }
                            if (var498 == 1601) {
                                class172.field3017[var6++] = var74.field3282;
                                continue;
                            }
                            if (var498 == 1602) {
                                class69.field1258[var7++] = var74.field3258;
                                continue;
                            }
                            if (var498 == 1603) {
                                class172.field3017[var6++] = var74.field3184;
                                continue;
                            }
                            if (var498 == 1604) {
                                class172.field3017[var6++] = var74.field3334;
                                continue;
                            }
                            if (var498 == 1605) {
                                class172.field3017[var6++] = var74.field3260;
                                continue;
                            }
                            if (var498 == 1606) {
                                class172.field3017[var6++] = var74.field3254;
                                continue;
                            }
                            if (var498 == 1607) {
                                class172.field3017[var6++] = var74.field3355;
                                continue;
                            }
                            if (var498 == 1608) {
                                class172.field3017[var6++] = var74.field3243;
                                continue;
                            }
                            if (var498 == 1609) {
                                class172.field3017[var6++] = var74.field3306;
                                continue;
                            }
                            if (var498 == 1610) {
                                class172.field3017[var6++] = var74.field3325;
                                continue;
                            }
                            if (var498 == 1611) {
                                class172.field3017[var6++] = var74.field3249;
                                continue;
                            }
                            if (var498 == 1612) {
                                class172.field3017[var6++] = var74.field3308;
                                continue;
                            }
                        } else if (var498 < 1800) {
                            class181 var469 = var46 ? class287.field5136 : class110.field1879;
                            if (var498 == 1700) {
                                class172.field3017[var6++] = var469.field3357;
                                continue;
                            }
                            if (var498 == 1701) {
                                if (var469.field3357 == -1) {
                                    class172.field3017[var6++] = 0;
                                } else {
                                    class172.field3017[var6++] = var469.field3250;
                                }
                                continue;
                            }
                            if (var498 == 1702) {
                                class172.field3017[var6++] = var469.field3293;
                                continue;
                            }
                        } else if (var498 < 1900) {
                            class181 var75 = var46 ? class287.field5136 : class110.field1879;
                            if (var498 == 1800) {
                                class172.field3017[var6++] = client.method1109(var75).method1430(123);
                                continue;
                            }
                            if (var498 == 1801) {
                                var6--;
                                int var76 = class172.field3017[var6];
                                int var499 = var76 - 1;
                                if (var75.field3286 != null && var499 < var75.field3286.length && var75.field3286[var499] != null) {
                                    class69.field1258[var7++] = var75.field3286[var499];
                                    continue;
                                }
                                class69.field1258[var7++] = class56.field928;
                                continue;
                            }
                            if (var498 == 1802) {
                                if (var75.field3274 == null) {
                                    class69.field1258[var7++] = class56.field928;
                                } else {
                                    class69.field1258[var7++] = var75.field3274;
                                }
                                continue;
                            }
                        } else if (var498 < 2600) {
                            var6--;
                            class181 var468 = client.method1114(-20985, class172.field3017[var6]);
                            if (var498 == 2500) {
                                class172.field3017[var6++] = var468.field3214;
                                continue;
                            }
                            if (var498 == 2501) {
                                class172.field3017[var6++] = var468.field3189;
                                continue;
                            }
                            if (var498 == 2502) {
                                class172.field3017[var6++] = var468.field3270;
                                continue;
                            }
                            if (var498 == 2503) {
                                class172.field3017[var6++] = var468.field3252;
                                continue;
                            }
                            if (var498 == 2504) {
                                class172.field3017[var6++] = var468.field3290 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 2505) {
                                class172.field3017[var6++] = var468.field3321;
                                continue;
                            }
                        } else if (var498 < 2700) {
                            var10000 = arg1 - 20979;
                            var6--;
                            class181 var77 = client.method1114(var10000, class172.field3017[var6]);
                            if (var498 == 2600) {
                                class172.field3017[var6++] = var77.field3310;
                                continue;
                            }
                            if (var498 == 2601) {
                                class172.field3017[var6++] = var77.field3282;
                                continue;
                            }
                            if (var498 == 2602) {
                                class69.field1258[var7++] = var77.field3258;
                                continue;
                            }
                            if (var498 == 2603) {
                                class172.field3017[var6++] = var77.field3184;
                                continue;
                            }
                            if (var498 == 2604) {
                                class172.field3017[var6++] = var77.field3334;
                                continue;
                            }
                            if (var498 == 2605) {
                                class172.field3017[var6++] = var77.field3260;
                                continue;
                            }
                            if (var498 == 2606) {
                                class172.field3017[var6++] = var77.field3254;
                                continue;
                            }
                            if (var498 == 2607) {
                                class172.field3017[var6++] = var77.field3355;
                                continue;
                            }
                            if (var498 == 2608) {
                                class172.field3017[var6++] = var77.field3243;
                                continue;
                            }
                            if (var498 == 2609) {
                                class172.field3017[var6++] = var77.field3306;
                                continue;
                            }
                            if (var498 == 2610) {
                                class172.field3017[var6++] = var77.field3325;
                                continue;
                            }
                            if (var498 == 2611) {
                                class172.field3017[var6++] = var77.field3249;
                                continue;
                            }
                            if (var498 == 2612) {
                                class172.field3017[var6++] = var77.field3308;
                                continue;
                            }
                        } else if (var498 < 2800) {
                            if (var498 == 2700) {
                                var6--;
                                class181 var458 = client.method1114(-20985, class172.field3017[var6]);
                                class172.field3017[var6++] = var458.field3357;
                                continue;
                            }
                            if (var498 == 2701) {
                                var6--;
                                class181 var459 = client.method1114(-20985, class172.field3017[var6]);
                                if (var459.field3357 == -1) {
                                    class172.field3017[var6++] = 0;
                                } else {
                                    class172.field3017[var6++] = var459.field3250;
                                }
                                continue;
                            }
                            if (var498 == 2702) {
                                var6--;
                                int var460 = class172.field3017[var6];
                                class214 var461 = (class214) class255.field4610.method135((long) var460, true);
                                if (var461 == null) {
                                    class172.field3017[var6++] = 0;
                                } else {
                                    class172.field3017[var6++] = 1;
                                }
                                continue;
                            }
                            if (var498 == 2703) {
                                var6--;
                                class181 var462 = client.method1114(-20985, class172.field3017[var6]);
                                if (var462.field3336 == null) {
                                    class172.field3017[var6++] = 0;
                                    continue;
                                }
                                int var463 = var462.field3336.length;
                                for (int var464 = 0; var464 < var462.field3336.length; var464++) {
                                    if (var462.field3336[var464] == null) {
                                        var463 = var464;
                                        break;
                                    }
                                }
                                class172.field3017[var6++] = var463;
                                continue;
                            }
                            if (var498 == 2704 || var498 == 2705) {
                                var6 -= 2;
                                int var465 = class172.field3017[var6];
                                int var466 = class172.field3017[var6 + 1];
                                class214 var467 = (class214) class255.field4610.method135((long) var465, true);
                                if (var467 != null && var467.field3912 == var466) {
                                    class172.field3017[var6++] = 1;
                                    continue;
                                }
                                class172.field3017[var6++] = 0;
                                continue;
                            }
                        } else if (var498 < 2900) {
                            var6--;
                            class181 var456 = client.method1114(-20985, class172.field3017[var6]);
                            if (var498 == 2800) {
                                class172.field3017[var6++] = client.method1109(var456).method1430(class175.method1248(arg1, -125));
                                continue;
                            }
                            if (var498 == 2801) {
                                var6--;
                                int var457 = class172.field3017[var6];
                                int var500 = var457 - 1;
                                if (var456.field3286 != null && var456.field3286.length > var500 && var456.field3286[var500] != null) {
                                    class69.field1258[var7++] = var456.field3286[var500];
                                    continue;
                                }
                                class69.field1258[var7++] = class56.field928;
                                continue;
                            }
                            if (var498 == 2802) {
                                if (var456.field3274 == null) {
                                    class69.field1258[var7++] = class56.field928;
                                } else {
                                    class69.field1258[var7++] = var456.field3274;
                                }
                                continue;
                            }
                        } else if (var498 < 3200) {
                            if (var498 == 3100) {
                                var7--;
                                class93 var78 = class69.field1258[var7];
                                class263.method1764(0, (byte) -116, class56.field928, var78);
                                continue;
                            }
                            if (var498 == 3101) {
                                var6 -= 2;
                                class113.method812(32, class172.field3017[var6], class166.field2927, class172.field3017[var6 + 1]);
                                continue;
                            }
                            if (var498 == 3103) {
                                class246.method1678(0);
                                continue;
                            }
                            if (var498 == 3104) {
                                class42.field665++;
                                var7--;
                                class93 var79 = class69.field1258[var7];
                                int var80 = 0;
                                if (var79.method659((byte) -123)) {
                                    var80 = var79.method650(-1);
                                }
                                class285.field5105.method1568(185, (byte) 120);
                                class285.field5105.method1886(var80, 2);
                                continue;
                            }
                            if (var498 == 3105) {
                                var7--;
                                class93 var81 = class69.field1258[var7];
                                class33.field517++;
                                class285.field5105.method1568(170, (byte) 55);
                                class285.field5105.method1882(var81.method679((byte) -62), (byte) -126);
                                continue;
                            }
                            if (var498 == 3106) {
                                class180.field3175++;
                                var7--;
                                class93 var82 = class69.field1258[var7];
                                class285.field5105.method1568(253, (byte) 78);
                                class285.field5105.method1916(var82.method666(false) + 1, arg1 + 84);
                                class285.field5105.method1898((byte) 124, var82);
                                continue;
                            }
                            if (var498 == 3107) {
                                var6--;
                                int var83 = class172.field3017[var6];
                                var7--;
                                class93 var84 = class69.field1258[var7];
                                class165.method1193(var83, 46, var84);
                                continue;
                            }
                            if (var498 == 3108) {
                                var6 -= 3;
                                int var85 = class172.field3017[var6];
                                int var86 = class172.field3017[var6 + 1];
                                int var87 = class172.field3017[var6 + 2];
                                class181 var88 = client.method1114(-20985, var87);
                                class35.method205((byte) 77, var85, var86, var88);
                                continue;
                            }
                            if (var498 == 3109) {
                                var6 -= 2;
                                int var89 = class172.field3017[var6];
                                class181 var90 = var46 ? class287.field5136 : class110.field1879;
                                int var91 = class172.field3017[var6 + 1];
                                class35.method205((byte) 126, var89, var91, var90);
                                continue;
                            }
                            if (var498 == 3110) {
                                class106.field1830++;
                                var6--;
                                int var92 = class172.field3017[var6];
                                class285.field5105.method1568(45, (byte) 109);
                                class285.field5105.method1908(-123, var92);
                                continue;
                            }
                        } else if (var498 < 3300) {
                            if (var498 == 3200) {
                                var6 -= 3;
                                class279.method1866(class172.field3017[var6], class172.field3017[var6 + 1], class172.field3017[var6 + 2], arg1 ^ 0x5);
                                continue;
                            }
                            if (var498 == 3201) {
                                var6--;
                                class139.method1012((byte) 124, class172.field3017[var6]);
                                continue;
                            }
                            if (var498 == 3202) {
                                var6 -= 2;
                                class165.method1189((byte) -104, class172.field3017[var6 + 1], class172.field3017[var6]);
                                continue;
                            }
                        } else if (var498 < 3400) {
                            if (var498 == 3300) {
                                class172.field3017[var6++] = class275.field4921;
                                continue;
                            }
                            if (var498 == 3301) {
                                var6 -= 2;
                                int var93 = class172.field3017[var6];
                                int var94 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = class249.method1690(var93, (byte) 26, var94);
                                continue;
                            }
                            if (var498 == 3302) {
                                var6 -= 2;
                                int var95 = class172.field3017[var6 + 1];
                                int var96 = class172.field3017[var6];
                                class172.field3017[var6++] = class41.method233((byte) -4, var95, var96);
                                continue;
                            }
                            if (var498 == 3303) {
                                var6 -= 2;
                                int var97 = class172.field3017[var6 + 1];
                                int var98 = class172.field3017[var6];
                                class172.field3017[var6++] = class230.method1578((byte) -23, var97, var98);
                                continue;
                            }
                            if (var498 == 3304) {
                                var6--;
                                int var99 = class172.field3017[var6];
                                class172.field3017[var6++] = class206.method1458(false, var99).field5064;
                                continue;
                            }
                            if (var498 == 3305) {
                                var6--;
                                int var100 = class172.field3017[var6];
                                class172.field3017[var6++] = class172.field3014[var100];
                                continue;
                            }
                            if (var498 == 3306) {
                                var6--;
                                int var101 = class172.field3017[var6];
                                class172.field3017[var6++] = class144.field2491[var101];
                                continue;
                            }
                            if (var498 == 3307) {
                                var6--;
                                int var102 = class172.field3017[var6];
                                class172.field3017[var6++] = class273.field4866[var102];
                                continue;
                            }
                            if (var498 == 3308) {
                                int var103 = class138.field2405;
                                int var104 = (class166.field2927.field3868 >> 7) + class229.field4111;
                                int var105 = (class166.field2927.field3784 >> 7) + class4.field52;
                                class172.field3017[var6++] = (var103 << 28) + (var104 << 14) + var105;
                                continue;
                            }
                            if (var498 == 3309) {
                                var6--;
                                int var106 = class172.field3017[var6];
                                class172.field3017[var6++] = class58.method333(var106 >> 14, 16383);
                                continue;
                            }
                            if (var498 == 3310) {
                                var6--;
                                int var107 = class172.field3017[var6];
                                class172.field3017[var6++] = var107 >> 28;
                                continue;
                            }
                            if (var498 == 3311) {
                                var6--;
                                int var108 = class172.field3017[var6];
                                class172.field3017[var6++] = class58.method333(16383, var108);
                                continue;
                            }
                            if (var498 == 3312) {
                                class172.field3017[var6++] = class144.field2494 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 3313) {
                                var6 -= 2;
                                int var109 = class172.field3017[var6] + 32768;
                                int var110 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = class249.method1690(var109, (byte) 26, var110);
                                continue;
                            }
                            if (var498 == 3314) {
                                var6 -= 2;
                                int var111 = class172.field3017[var6] + 32768;
                                int var112 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = class41.method233((byte) -4, var112, var111);
                                continue;
                            }
                            if (var498 == 3315) {
                                var6 -= 2;
                                int var113 = class172.field3017[var6] + 32768;
                                int var114 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = class230.method1578((byte) -23, var114, var113);
                                continue;
                            }
                            if (var498 == 3316) {
                                if (class285.field5109 < 2) {
                                    class172.field3017[var6++] = 0;
                                } else {
                                    class172.field3017[var6++] = class285.field5109;
                                }
                                continue;
                            }
                            if (var498 == 3317) {
                                class172.field3017[var6++] = class38.field593;
                                continue;
                            }
                            if (var498 == 3318) {
                                class172.field3017[var6++] = class74.field1352;
                                continue;
                            }
                            if (var498 == 3321) {
                                class172.field3017[var6++] = class89.field1592;
                                continue;
                            }
                            if (var498 == 3322) {
                                class172.field3017[var6++] = class121.field2173;
                                continue;
                            }
                            if (var498 == 3323) {
                                if (class97.field1730 >= 5 && class97.field1730 <= 9) {
                                    class172.field3017[var6++] = 1;
                                    continue;
                                }
                                class172.field3017[var6++] = 0;
                                continue;
                            }
                            if (var498 == 3324) {
                                if (class97.field1730 >= 5 && class97.field1730 <= 9) {
                                    class172.field3017[var6++] = class97.field1730;
                                    continue;
                                }
                                class172.field3017[var6++] = 0;
                                continue;
                            }
                            if (var498 == 3325) {
                                class172.field3017[var6++] = class196.field3593 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 3326) {
                                class172.field3017[var6++] = class166.field2927.field4228;
                                continue;
                            }
                            if (var498 == 3327) {
                                class172.field3017[var6++] = class166.field2927.field4249.field2861 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 3328) {
                                class172.field3017[var6++] = class3.field36 && !class67.field1224 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 3329) {
                                class172.field3017[var6++] = class19.field259 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 3330) {
                                var6--;
                                int var115 = class172.field3017[var6];
                                class172.field3017[var6++] = class154.method1102(var115, (byte) -96);
                                continue;
                            }
                            if (var498 == 3331) {
                                var6 -= 2;
                                int var116 = class172.field3017[var6 + 1];
                                int var117 = class172.field3017[var6];
                                class172.field3017[var6++] = class137.method1003(var117, var116, false, 0);
                                continue;
                            }
                            if (var498 == 3332) {
                                var6 -= 2;
                                int var118 = class172.field3017[var6];
                                int var119 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = class137.method1003(var118, var119, true, 0);
                                continue;
                            }
                            if (var498 == 3333) {
                                class172.field3017[var6++] = class9.field132;
                                continue;
                            }
                            if (var498 == 3335) {
                                class172.field3017[var6++] = class104.field1802;
                                continue;
                            }
                            if (var498 == 3336) {
                                var6 -= 4;
                                int var120 = class172.field3017[var6 + 1];
                                int var121 = class172.field3017[var6];
                                int var122 = class172.field3017[var6 + 2];
                                int var123 = (var120 << 14) + var121;
                                int var124 = (var122 << 28) + var123;
                                int var125 = class172.field3017[var6 + 3];
                                int var126 = var124 + var125;
                                class172.field3017[var6++] = var126;
                                continue;
                            }
                            if (var498 == 3337) {
                                class172.field3017[var6++] = class276.field4943;
                                continue;
                            }
                        } else if (var498 < 3500) {
                            if (var498 == 3400) {
                                var6 -= 2;
                                int var439 = class172.field3017[var6];
                                int var440 = class172.field3017[var6 + 1];
                                class118 var441 = class275.method1845(false, var439);
                                class69.field1258[var7++] = var441.method881(var440, 126);
                                continue;
                            }
                            if (var498 == 3408) {
                                var6 -= 4;
                                int var442 = class172.field3017[var6 + 1];
                                int var443 = class172.field3017[var6 + 2];
                                int var444 = class172.field3017[var6];
                                int var445 = class172.field3017[var6 + 3];
                                class118 var446 = class275.method1845(false, var443);
                                if (var446.field2094 == var444 && var446.field2108 == var442) {
                                    if (var442 == 115) {
                                        class69.field1258[var7++] = var446.method881(var445, arg1 - 21);
                                    } else {
                                        class172.field3017[var6++] = var446.method876(true, var445);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var498 == 3409) {
                                var6 -= 3;
                                int var447 = class172.field3017[var6];
                                int var448 = class172.field3017[var6 + 1];
                                int var449 = class172.field3017[var6 + 2];
                                if (var448 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class118 var450 = class275.method1845(false, var448);
                                if (var450.field2108 != var447) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class172.field3017[var6++] = var450.method880(var449, 2) ? 1 : 0;
                                continue;
                            }
                            if (var498 == 3410) {
                                var7--;
                                class93 var451 = class69.field1258[var7];
                                var6--;
                                int var452 = class172.field3017[var6];
                                if (var452 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class118 var453 = class275.method1845(false, var452);
                                if (var453.field2108 != 115) {
                                    throw new RuntimeException("C3410-1");
                                }
                                class172.field3017[var6++] = var453.method883(var451, (byte) -117) ? 1 : 0;
                                continue;
                            }
                            if (var498 == 3411) {
                                var6--;
                                int var454 = class172.field3017[var6];
                                class118 var455 = class275.method1845(false, var454);
                                class172.field3017[var6++] = var455.field2110.method133((byte) -45);
                                continue;
                            }
                        } else if (var498 < 3700) {
                            if (var498 == 3600) {
                                if (class69.field1257 == 0) {
                                    class172.field3017[var6++] = -2;
                                } else if (class69.field1257 == 1) {
                                    class172.field3017[var6++] = -1;
                                } else {
                                    class172.field3017[var6++] = class145.field2567;
                                }
                                continue;
                            }
                            if (var498 == 3601) {
                                var6--;
                                int var127 = class172.field3017[var6];
                                if (class69.field1257 == 2 && class145.field2567 > var127) {
                                    class69.field1258[var7++] = class171.field3004[var127];
                                    continue;
                                }
                                class69.field1258[var7++] = class56.field928;
                                continue;
                            }
                            if (var498 == 3602) {
                                var6--;
                                int var128 = class172.field3017[var6];
                                if (class69.field1257 == 2 && class145.field2567 > var128) {
                                    class172.field3017[var6++] = class220.field3999[var128];
                                    continue;
                                }
                                class172.field3017[var6++] = 0;
                                continue;
                            }
                            if (var498 == 3603) {
                                var6--;
                                int var129 = class172.field3017[var6];
                                if (class69.field1257 == 2 && var129 < class145.field2567) {
                                    class172.field3017[var6++] = class24.field296[var129];
                                    continue;
                                }
                                class172.field3017[var6++] = 0;
                                continue;
                            }
                            if (var498 == 3604) {
                                var7--;
                                class93 var130 = class69.field1258[var7];
                                var6--;
                                int var131 = class172.field3017[var6];
                                class174.method1247(var130, var131, arg1 + 105);
                                continue;
                            }
                            if (var498 == 3605) {
                                var7--;
                                class93 var132 = class69.field1258[var7];
                                class157.method1127(var132.method679((byte) -119), arg1 ^ 0xFFFFFFFA);
                                continue;
                            }
                            if (var498 == 3606) {
                                var7--;
                                class93 var133 = class69.field1258[var7];
                                class34.method203(var133.method679((byte) -127), (byte) -128);
                                continue;
                            }
                            if (var498 == 3607) {
                                var7--;
                                class93 var134 = class69.field1258[var7];
                                class250.method1698(var134.method679((byte) -78), true);
                                continue;
                            }
                            if (var498 == 3608) {
                                var7--;
                                class93 var135 = class69.field1258[var7];
                                class240.method1628(var135.method679((byte) -62), 0);
                                continue;
                            }
                            if (var498 == 3609) {
                                var7--;
                                class93 var136 = class69.field1258[var7];
                                if (var136.method664(class149.field2613, arg1 ^ 0xFFFFFFFA) || var136.method664(class7.field100, arg1 ^ 0xFFFFFFFA)) {
                                    var136 = var136.method637(arg1 + 99, 7);
                                }
                                class172.field3017[var6++] = class232.method1589(var136, (byte) 124) ? 1 : 0;
                                continue;
                            }
                            if (var498 == 3610) {
                                var6--;
                                int var137 = class172.field3017[var6];
                                if (class69.field1257 == 2 && var137 < class145.field2567) {
                                    class69.field1258[var7++] = class210.field3825[var137];
                                    continue;
                                }
                                class69.field1258[var7++] = class56.field928;
                                continue;
                            }
                            if (var498 == 3611) {
                                if (class257.field4634 == null) {
                                    class69.field1258[var7++] = class56.field928;
                                } else {
                                    class69.field1258[var7++] = class257.field4634.method687(-96);
                                }
                                continue;
                            }
                            if (var498 == 3612) {
                                if (class257.field4634 == null) {
                                    class172.field3017[var6++] = 0;
                                } else {
                                    class172.field3017[var6++] = class161.field2834;
                                }
                                continue;
                            }
                            if (var498 == 3613) {
                                var6--;
                                int var138 = class172.field3017[var6];
                                if (class257.field4634 != null && var138 < class161.field2834) {
                                    class69.field1258[var7++] = class97.field1733[var138].field1223.method687(-96);
                                    continue;
                                }
                                class69.field1258[var7++] = class56.field928;
                                continue;
                            }
                            if (var498 == 3614) {
                                var6--;
                                int var139 = class172.field3017[var6];
                                if (class257.field4634 != null && var139 < class161.field2834) {
                                    class172.field3017[var6++] = class97.field1733[var139].field1222;
                                    continue;
                                }
                                class172.field3017[var6++] = 0;
                                continue;
                            }
                            if (var498 == 3615) {
                                var6--;
                                int var140 = class172.field3017[var6];
                                if (class257.field4634 != null && class161.field2834 > var140) {
                                    class172.field3017[var6++] = class97.field1733[var140].field1225;
                                    continue;
                                }
                                class172.field3017[var6++] = 0;
                                continue;
                            }
                            if (var498 == 3616) {
                                class172.field3017[var6++] = class205.field3692;
                                continue;
                            }
                            if (var498 == 3617) {
                                var7--;
                                class93 var141 = class69.field1258[var7];
                                class89.method622(false, var141);
                                continue;
                            }
                            if (var498 == 3618) {
                                class172.field3017[var6++] = class249.field4491;
                                continue;
                            }
                            if (var498 == 3619) {
                                var7--;
                                class93 var142 = class69.field1258[var7];
                                class176.method1254((byte) 84, var142.method679((byte) 102));
                                continue;
                            }
                            if (var498 == 3620) {
                                class288.method1973(arg1 ^ 0xFFFF9206);
                                continue;
                            }
                            if (var498 == 3621) {
                                if (class69.field1257 == 0) {
                                    class172.field3017[var6++] = -1;
                                } else {
                                    class172.field3017[var6++] = class284.field5098;
                                }
                                continue;
                            }
                            if (var498 == 3622) {
                                var6--;
                                int var143 = class172.field3017[var6];
                                if (class69.field1257 != 0 && var143 < class284.field5098) {
                                    class69.field1258[var7++] = class205.method1454((byte) -101, class223.field4025[var143]).method687(-96);
                                    continue;
                                }
                                class69.field1258[var7++] = class56.field928;
                                continue;
                            }
                            if (var498 == 3623) {
                                var7--;
                                class93 var144 = class69.field1258[var7];
                                if (var144.method664(class149.field2613, arg1 + 6) || var144.method664(class7.field100, arg1 + 6)) {
                                    var144 = var144.method637(arg1 ^ 0xFFFFFF82, 7);
                                }
                                class172.field3017[var6++] = class226.method1555(-33, var144) ? 1 : 0;
                                continue;
                            }
                            if (var498 == 3624) {
                                var6--;
                                int var145 = class172.field3017[var6];
                                if (class97.field1733 != null && var145 < class161.field2834 && class97.field1733[var145].field1223.method649(class166.field2927.field4247, -4446)) {
                                    class172.field3017[var6++] = 1;
                                    continue;
                                }
                                class172.field3017[var6++] = 0;
                                continue;
                            }
                            if (var498 == 3625) {
                                if (class6.field84 == null) {
                                    class69.field1258[var7++] = class56.field928;
                                } else {
                                    class69.field1258[var7++] = class6.field84.method687(-96);
                                }
                                continue;
                            }
                            if (var498 == 3626) {
                                var6--;
                                int var146 = class172.field3017[var6];
                                if (class257.field4634 != null && var146 < class161.field2834) {
                                    class69.field1258[var7++] = class97.field1733[var146].field1226;
                                    continue;
                                }
                                class69.field1258[var7++] = class56.field928;
                                continue;
                            }
                            if (var498 == 3627) {
                                var6--;
                                int var147 = class172.field3017[var6];
                                if (class69.field1257 == 2 && var147 >= 0 && class145.field2567 > var147) {
                                    class172.field3017[var6++] = class267.field4745[var147] ? 1 : 0;
                                    continue;
                                }
                                class172.field3017[var6++] = 0;
                                continue;
                            }
                            if (var498 == 3628) {
                                var7--;
                                class93 var148 = class69.field1258[var7];
                                if (var148.method664(class149.field2613, arg1 ^ 0xFFFFFFFA) || var148.method664(class7.field100, arg1 + 6)) {
                                    var148 = var148.method637(66, 7);
                                }
                                class172.field3017[var6++] = class164.method1185(true, var148);
                                continue;
                            }
                            if (var498 == 3629) {
                                class172.field3017[var6++] = class160.field2815;
                                continue;
                            }
                        } else if (var498 < 4000) {
                            if (var498 == 3903) {
                                var6--;
                                int var425 = class172.field3017[var6];
                                class172.field3017[var6++] = class43.field691[var425].method541((byte) -126);
                                continue;
                            }
                            if (var498 == 3904) {
                                var6--;
                                int var426 = class172.field3017[var6];
                                class172.field3017[var6++] = class43.field691[var426].field1448;
                                continue;
                            }
                            if (var498 == 3905) {
                                var6--;
                                int var427 = class172.field3017[var6];
                                class172.field3017[var6++] = class43.field691[var427].field1449;
                                continue;
                            }
                            if (var498 == 3906) {
                                var6--;
                                int var428 = class172.field3017[var6];
                                class172.field3017[var6++] = class43.field691[var428].field1445;
                                continue;
                            }
                            if (var498 == 3907) {
                                var6--;
                                int var429 = class172.field3017[var6];
                                class172.field3017[var6++] = class43.field691[var429].field1469;
                                continue;
                            }
                            if (var498 == 3908) {
                                var6--;
                                int var430 = class172.field3017[var6];
                                class172.field3017[var6++] = class43.field691[var430].field1459;
                                continue;
                            }
                            if (var498 == 3910) {
                                var6--;
                                int var431 = class172.field3017[var6];
                                int var432 = class43.field691[var431].method543((byte) -95);
                                class172.field3017[var6++] = var432 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 3911) {
                                var6--;
                                int var433 = class172.field3017[var6];
                                int var434 = class43.field691[var433].method543((byte) -94);
                                class172.field3017[var6++] = var434 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 3912) {
                                var6--;
                                int var435 = class172.field3017[var6];
                                int var436 = class43.field691[var435].method543((byte) -85);
                                class172.field3017[var6++] = var436 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 3913) {
                                var6--;
                                int var437 = class172.field3017[var6];
                                int var438 = class43.field691[var437].method543((byte) 110);
                                class172.field3017[var6++] = var438 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var498 < 4100) {
                            if (var498 == 4000) {
                                var6 -= 2;
                                int var380 = class172.field3017[var6];
                                int var381 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = var380 + var381;
                                continue;
                            }
                            if (var498 == 4001) {
                                var6 -= 2;
                                int var382 = class172.field3017[var6 + 1];
                                int var383 = class172.field3017[var6];
                                class172.field3017[var6++] = var383 - var382;
                                continue;
                            }
                            if (var498 == 4002) {
                                var6 -= 2;
                                int var384 = class172.field3017[var6];
                                int var385 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = var384 * var385;
                                continue;
                            }
                            if (var498 == 4003) {
                                var6 -= 2;
                                int var386 = class172.field3017[var6];
                                int var387 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = var386 / var387;
                                continue;
                            }
                            if (var498 == 4004) {
                                var6--;
                                int var388 = class172.field3017[var6];
                                class172.field3017[var6++] = (int) (Math.random() * (double) var388);
                                continue;
                            }
                            if (var498 == 4005) {
                                var6--;
                                int var389 = class172.field3017[var6];
                                class172.field3017[var6++] = (int) ((double) (var389 + 1) * Math.random());
                                continue;
                            }
                            if (var498 == 4006) {
                                var6 -= 5;
                                int var390 = class172.field3017[var6 + 1];
                                int var391 = class172.field3017[var6];
                                int var392 = class172.field3017[var6 + 3];
                                int var393 = class172.field3017[var6 + 2];
                                int var394 = class172.field3017[var6 + 4];
                                class172.field3017[var6++] = (var390 - var391) * (var394 - var393) / (var392 - var393) + var391;
                                continue;
                            }
                            if (var498 == 4007) {
                                var6 -= 2;
                                long var395 = (long) class172.field3017[var6 + 1];
                                long var397 = (long) class172.field3017[var6];
                                class172.field3017[var6++] = (int) (var395 * var397 / 100L + var397);
                                continue;
                            }
                            if (var498 == 4008) {
                                var6 -= 2;
                                int var399 = class172.field3017[var6];
                                int var400 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = class270.method1797(var399, 0x1 << var400);
                                continue;
                            }
                            if (var498 == 4009) {
                                var6 -= 2;
                                int var401 = class172.field3017[var6];
                                int var402 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = class58.method333(-(0x1 << var402) - 1, var401);
                                continue;
                            }
                            if (var498 == 4010) {
                                var6 -= 2;
                                int var403 = class172.field3017[var6];
                                int var404 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = class58.method333(0x1 << var404, var403) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var498 == 4011) {
                                var6 -= 2;
                                int var405 = class172.field3017[var6];
                                int var406 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = var405 % var406;
                                continue;
                            }
                            if (var498 == 4012) {
                                var6 -= 2;
                                int var407 = class172.field3017[var6];
                                int var408 = class172.field3017[var6 + 1];
                                if (var407 == 0) {
                                    class172.field3017[var6++] = 0;
                                } else {
                                    class172.field3017[var6++] = (int) Math.pow((double) var407, (double) var408);
                                }
                                continue;
                            }
                            if (var498 == 4013) {
                                var6 -= 2;
                                int var409 = class172.field3017[var6];
                                int var410 = class172.field3017[var6 + 1];
                                if (var409 == 0) {
                                    class172.field3017[var6++] = 0;
                                } else if (var410 == 0) {
                                    class172.field3017[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class172.field3017[var6++] = (int) Math.pow((double) var409, 1.0D / (double) var410);
                                }
                                continue;
                            }
                            if (var498 == 4014) {
                                var6 -= 2;
                                int var411 = class172.field3017[var6];
                                int var412 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = class58.method333(var411, var412);
                                continue;
                            }
                            if (var498 == 4015) {
                                var6 -= 2;
                                int var413 = class172.field3017[var6];
                                int var414 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = class270.method1797(var413, var414);
                                continue;
                            }
                            if (var498 == 4016) {
                                var6 -= 2;
                                int var415 = class172.field3017[var6];
                                int var416 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = var415 >= var416 ? var416 : var415;
                                continue;
                            }
                            if (var498 == 4017) {
                                var6 -= 2;
                                int var417 = class172.field3017[var6];
                                int var418 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = var417 > var418 ? var417 : var418;
                                continue;
                            }
                            if (var498 == 4018) {
                                var6 -= 3;
                                long var419 = (long) class172.field3017[var6 + 1];
                                long var421 = (long) class172.field3017[var6 + 2];
                                long var423 = (long) class172.field3017[var6];
                                class172.field3017[var6++] = (int) (var421 * var423 / var419);
                                continue;
                            }
                        } else if (var498 < 4200) {
                            if (var498 == 4100) {
                                var7--;
                                class93 var149 = class69.field1258[var7];
                                var6--;
                                int var150 = class172.field3017[var6];
                                class69.field1258[var7++] = class130.method949((byte) -77, new class93[] { var149, class148.method1067(arg1 - 7009, var150) });
                                continue;
                            }
                            if (var498 == 4101) {
                                var7 -= 2;
                                class93 var151 = class69.field1258[var7];
                                class93 var152 = class69.field1258[var7 + 1];
                                class69.field1258[var7++] = class130.method949((byte) -77, new class93[] { var151, var152 });
                                continue;
                            }
                            if (var498 == 4102) {
                                var7--;
                                class93 var153 = class69.field1258[var7];
                                var6--;
                                int var154 = class172.field3017[var6];
                                class69.field1258[var7++] = class130.method949((byte) -77, new class93[] { var153, class252.method1709(arg1 + 30, var154, true) });
                                continue;
                            }
                            if (var498 == 4103) {
                                var7--;
                                class93 var155 = class69.field1258[var7];
                                class69.field1258[var7++] = var155.method663(-23);
                                continue;
                            }
                            if (var498 == 4104) {
                                var6--;
                                int var156 = class172.field3017[var6];
                                long var157 = ((long) var156 + 11745L) * 86400000L;
                                class66.field1214.setTime(new Date(var157));
                                int var159 = class66.field1214.get(5);
                                int var160 = class66.field1214.get(2);
                                int var161 = class66.field1214.get(1);
                                class69.field1258[var7++] = class130.method949((byte) -77, new class93[] { class148.method1067(class175.method1248(arg1, 7011), var159), class94.field1701, class30.field454[var160], class94.field1701, class148.method1067(arg1 - 7009, var161) });
                                continue;
                            }
                            if (var498 == 4105) {
                                var7 -= 2;
                                class93 var162 = class69.field1258[var7];
                                class93 var163 = class69.field1258[var7 + 1];
                                if (class166.field2927.field4249 != null && class166.field2927.field4249.field2861) {
                                    class69.field1258[var7++] = var163;
                                    continue;
                                }
                                class69.field1258[var7++] = var162;
                                continue;
                            }
                            if (var498 == 4106) {
                                var6--;
                                int var164 = class172.field3017[var6];
                                class69.field1258[var7++] = class148.method1067(class175.method1248(arg1, 7011), var164);
                                continue;
                            }
                            if (var498 == 4107) {
                                var7 -= 2;
                                class172.field3017[var6++] = class69.field1258[var7].method639(arg1 - 120, class69.field1258[var7 + 1]);
                                continue;
                            }
                            if (var498 == 4108) {
                                var7--;
                                class93 var165 = class69.field1258[var7];
                                var6 -= 2;
                                int var166 = class172.field3017[var6];
                                int var167 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = class185.method1351(var167, (byte) 78).method1826(var165, var166);
                                continue;
                            }
                            if (var498 == 4109) {
                                var6 -= 2;
                                int var168 = class172.field3017[var6];
                                var7--;
                                class93 var169 = class69.field1258[var7];
                                int var170 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = class185.method1351(var170, (byte) -105).method1835(var169, var168);
                                continue;
                            }
                            if (var498 == 4110) {
                                var7 -= 2;
                                class93 var171 = class69.field1258[var7];
                                class93 var172 = class69.field1258[var7 + 1];
                                var6--;
                                if (class172.field3017[var6] == 1) {
                                    class69.field1258[var7++] = var171;
                                } else {
                                    class69.field1258[var7++] = var172;
                                }
                                continue;
                            }
                            if (var498 == 4111) {
                                var7--;
                                class93 var173 = class69.field1258[var7];
                                class69.field1258[var7++] = class274.method1815(var173);
                                continue;
                            }
                            if (var498 == 4112) {
                                var6--;
                                int var174 = class172.field3017[var6];
                                var7--;
                                class93 var175 = class69.field1258[var7];
                                if (var174 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class69.field1258[var7++] = var175.method641((byte) -1, var174);
                                continue;
                            }
                            if (var498 == 4113) {
                                var6--;
                                int var176 = class172.field3017[var6];
                                class172.field3017[var6++] = class223.method1547(159, var176) ? 1 : 0;
                                continue;
                            }
                            if (var498 == 4114) {
                                var6--;
                                int var177 = class172.field3017[var6];
                                class172.field3017[var6++] = class170.method1224((byte) -87, var177) ? 1 : 0;
                                continue;
                            }
                            if (var498 == 4115) {
                                var6--;
                                int var178 = class172.field3017[var6];
                                class172.field3017[var6++] = class113.method806(var178, 31616) ? 1 : 0;
                                continue;
                            }
                            if (var498 == 4116) {
                                var6--;
                                int var179 = class172.field3017[var6];
                                class172.field3017[var6++] = class92.method635((byte) 108, var179) ? 1 : 0;
                                continue;
                            }
                            if (var498 == 4117) {
                                var7--;
                                class93 var180 = class69.field1258[var7];
                                if (var180 == null) {
                                    class172.field3017[var6++] = 0;
                                } else {
                                    class172.field3017[var6++] = var180.method666(false);
                                }
                                continue;
                            }
                            if (var498 == 4118) {
                                var6 -= 2;
                                int var181 = class172.field3017[var6];
                                var7--;
                                class93 var182 = class69.field1258[var7];
                                int var183 = class172.field3017[var6 + 1];
                                class69.field1258[var7++] = var182.method674(-49, var181, var183);
                                continue;
                            }
                            if (var498 == 4119) {
                                var7--;
                                class93 var184 = class69.field1258[var7];
                                boolean var185 = false;
                                class93 var186 = class119.method885(var184.method666(false), -102);
                                for (int var187 = 0; var187 < var184.method666(false); var187++) {
                                    int var188 = var184.method645(255, var187);
                                    if (var188 == 60) {
                                        var185 = true;
                                    } else if (var188 == 62) {
                                        var185 = false;
                                    } else if (!var185) {
                                        var186.method685((byte) 90, var188);
                                    }
                                }
                                var186.method660(51);
                                class69.field1258[var7++] = var186;
                                continue;
                            }
                            if (var498 == 4120) {
                                var7--;
                                class93 var189 = class69.field1258[var7];
                                var6 -= 2;
                                int var190 = class172.field3017[var6];
                                int var191 = class172.field3017[var6 + 1];
                                class172.field3017[var6++] = var189.method651(var190, 126, var191);
                                continue;
                            }
                            if (var498 == 4121) {
                                var7 -= 2;
                                class93 var192 = class69.field1258[var7 + 1];
                                class93 var193 = class69.field1258[var7];
                                var6--;
                                int var194 = class172.field3017[var6];
                                class172.field3017[var6++] = var193.method677(var192, var194, (byte) 38);
                                continue;
                            }
                            if (var498 == 4122) {
                                var6--;
                                int var195 = class172.field3017[var6];
                                class172.field3017[var6++] = class3.method10(var195, -4124);
                                continue;
                            }
                            if (var498 == 4123) {
                                var6--;
                                int var196 = class172.field3017[var6];
                                class172.field3017[var6++] = class214.method1512(var196, 0);
                                continue;
                            }
                            if (var498 == 4124) {
                                var6--;
                                boolean var197 = class172.field3017[var6] != 0;
                                var6--;
                                int var198 = class172.field3017[var6];
                                class69.field1258[var7++] = class112.method800((long) var198, (byte) 120, var197, class104.field1802, 0);
                                continue;
                            }
                        } else if (var498 < 4300) {
                            if (var498 == 4200) {
                                var6--;
                                int var199 = class172.field3017[var6];
                                class69.field1258[var7++] = class89.method617(var199, arg1 + 6).field357;
                                continue;
                            }
                            if (var498 == 4201) {
                                var6 -= 2;
                                int var200 = class172.field3017[var6];
                                int var201 = class172.field3017[var6 + 1];
                                class29 var202 = class89.method617(var200, arg1 ^ 0xFFFFFFFA);
                                if (var201 >= 1 && var201 <= 5 && var202.field383[var201 - 1] != null) {
                                    class69.field1258[var7++] = var202.field383[var201 - 1];
                                    continue;
                                }
                                class69.field1258[var7++] = class56.field928;
                                continue;
                            }
                            if (var498 == 4202) {
                                var6 -= 2;
                                int var203 = class172.field3017[var6];
                                int var204 = class172.field3017[var6 + 1];
                                class29 var205 = class89.method617(var203, 0);
                                if (var204 >= 1 && var204 <= 5 && var205.field438[var204 - 1] != null) {
                                    class69.field1258[var7++] = var205.field438[var204 - 1];
                                    continue;
                                }
                                class69.field1258[var7++] = class56.field928;
                                continue;
                            }
                            if (var498 == 4203) {
                                var6--;
                                int var206 = class172.field3017[var6];
                                class172.field3017[var6++] = class89.method617(var206, 0).field404;
                                continue;
                            }
                            if (var498 == 4204) {
                                var6--;
                                int var207 = class172.field3017[var6];
                                class172.field3017[var6++] = class89.method617(var207, 0).field414 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 4205) {
                                var6--;
                                int var208 = class172.field3017[var6];
                                class29 var209 = class89.method617(var208, arg1 ^ 0xFFFFFFFA);
                                if (var209.field427 == -1 && var209.field397 >= 0) {
                                    class172.field3017[var6++] = var209.field397;
                                    continue;
                                }
                                class172.field3017[var6++] = var208;
                                continue;
                            }
                            if (var498 == 4206) {
                                var6--;
                                int var210 = class172.field3017[var6];
                                class29 var211 = class89.method617(var210, 0);
                                if (var211.field427 >= 0 && var211.field397 >= 0) {
                                    class172.field3017[var6++] = var211.field397;
                                    continue;
                                }
                                class172.field3017[var6++] = var210;
                                continue;
                            }
                            if (var498 == 4207) {
                                var6--;
                                int var212 = class172.field3017[var6];
                                class172.field3017[var6++] = class89.method617(var212, 0).field424 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 4208) {
                                var6 -= 2;
                                int var213 = class172.field3017[var6 + 1];
                                int var214 = class172.field3017[var6];
                                class131 var215 = class30.method176(7255, var213);
                                if (var215.method962((byte) -115)) {
                                    class69.field1258[var7++] = class89.method617(var214, 0).method157(var215.field2323, var213, true);
                                } else {
                                    class172.field3017[var6++] = class89.method617(var214, 0).method161(0, var215.field2320, var213);
                                }
                                continue;
                            }
                            if (var498 == 4210) {
                                var6--;
                                int var216 = class172.field3017[var6];
                                var7--;
                                class93 var217 = class69.field1258[var7];
                                class110.method786(var216 == 1, var217, 120);
                                class172.field3017[var6++] = class254.field4596;
                                continue;
                            }
                            if (var498 == 4211) {
                                if (class230.field4122 != null && class254.field4596 > client.field2720) {
                                    class172.field3017[var6++] = class58.method333(class230.field4122[client.field2720++], 65535);
                                    continue;
                                }
                                class172.field3017[var6++] = -1;
                                continue;
                            }
                            if (var498 == 4212) {
                                client.field2720 = 0;
                                continue;
                            }
                        } else if (var498 >= 4400) {
                            if (var498 < 4500) {
                                if (var498 == 4400) {
                                    var6 -= 2;
                                    int var218 = class172.field3017[var6];
                                    int var219 = class172.field3017[var6 + 1];
                                    class131 var220 = class30.method176(7255, var219);
                                    if (var220.method962((byte) -115)) {
                                        class69.field1258[var7++] = class34.method197(-127, var218).method1637(var219, var220.field2323, (byte) -118);
                                    } else {
                                        class172.field3017[var6++] = class34.method197(arg1 - 113, var218).method1639(var220.field2320, 7, var219);
                                    }
                                    continue;
                                }
                            } else if (var498 < 4600) {
                                if (var498 == 4500) {
                                    var6 -= 2;
                                    int var221 = class172.field3017[var6];
                                    int var222 = class172.field3017[var6 + 1];
                                    class131 var223 = class30.method176(7255, var222);
                                    if (var223.method962((byte) -115)) {
                                        class69.field1258[var7++] = class54.method296(17057, var221).method613(var223.field2323, var222, arg1 - 244);
                                    } else {
                                        class172.field3017[var6++] = class54.method296(17057, var221).method621(var222, var223.field2320, 3053);
                                    }
                                    continue;
                                }
                            } else if (var498 < 5100) {
                                if (var498 == 5000) {
                                    class172.field3017[var6++] = class195.field3565;
                                    continue;
                                }
                                if (var498 == 5001) {
                                    var6 -= 3;
                                    class195.field3565 = class172.field3017[var6];
                                    class168.field2955 = class172.field3017[var6 + 1];
                                    class60.field1020++;
                                    class250.field4506 = class172.field3017[var6 + 2];
                                    class285.field5105.method1568(240, (byte) 58);
                                    class285.field5105.method1916(class195.field3565, arg1 ^ 0xFFFFFFAE);
                                    class285.field5105.method1916(class168.field2955, 79);
                                    class285.field5105.method1916(class250.field4506, 66);
                                    continue;
                                }
                                if (var498 == 5002) {
                                    var6 -= 2;
                                    class117.field2065++;
                                    int var312 = class172.field3017[var6 + 1];
                                    var7--;
                                    class93 var313 = class69.field1258[var7];
                                    int var314 = class172.field3017[var6];
                                    class285.field5105.method1568(48, (byte) 64);
                                    class285.field5105.method1882(var313.method679((byte) 52), (byte) -126);
                                    class285.field5105.method1916(var314 - 1, 71);
                                    class285.field5105.method1916(var312, 87);
                                    continue;
                                }
                                if (var498 == 5003) {
                                    var6--;
                                    int var315 = class172.field3017[var6];
                                    class93 var316 = null;
                                    if (var315 < 100) {
                                        var316 = class270.field4816[var315];
                                    }
                                    if (var316 == null) {
                                        var316 = class56.field928;
                                    }
                                    class69.field1258[var7++] = var316;
                                    continue;
                                }
                                if (var498 == 5004) {
                                    int var317 = -1;
                                    var6--;
                                    int var318 = class172.field3017[var6];
                                    if (var318 < 100 && class270.field4816[var318] != null) {
                                        var317 = class39.field606[var318];
                                    }
                                    class172.field3017[var6++] = var317;
                                    continue;
                                }
                                if (var498 == 5005) {
                                    class172.field3017[var6++] = class168.field2955;
                                    continue;
                                }
                                if (var498 == 5008) {
                                    var7--;
                                    class93 var319 = class69.field1258[var7];
                                    if (var319.method664(class200.field3633, 0)) {
                                        class164.method1186(var319, (byte) 21);
                                        continue;
                                    }
                                    if (class285.field5109 == 0 && (class3.field36 && !class67.field1224 || class19.field259)) {
                                        continue;
                                    }
                                    class93 var320 = var319.method663(120);
                                    class189.field3463++;
                                    byte var321 = 0;
                                    byte var322 = 0;
                                    if (var320.method664(class263.field4680, 0)) {
                                        var321 = 0;
                                        var319 = var319.method637(116, class263.field4680.method666(false));
                                    } else if (var320.method664(class217.field3961, 0)) {
                                        var321 = 1;
                                        var319 = var319.method637(121, class217.field3961.method666(false));
                                    } else if (var320.method664(class181.field3296, arg1 + 6)) {
                                        var321 = 2;
                                        var319 = var319.method637(93, class181.field3296.method666(false));
                                    } else if (var320.method664(class19.field247, 0)) {
                                        var319 = var319.method637(85, class19.field247.method666(false));
                                        var321 = 3;
                                    } else if (var320.method664(class251.field4515, arg1 + 6)) {
                                        var319 = var319.method637(arg1 ^ 0xFFFFFF97, class251.field4515.method666(false));
                                        var321 = 4;
                                    } else if (var320.method664(class76.field1421, arg1 ^ 0xFFFFFFFA)) {
                                        var319 = var319.method637(arg1 + 61, class76.field1421.method666(false));
                                        var321 = 5;
                                    } else if (var320.method664(class68.field1238, 0)) {
                                        var321 = 6;
                                        var319 = var319.method637(101, class68.field1238.method666(false));
                                    } else if (var320.method664(class282.field5070, 0)) {
                                        var319 = var319.method637(105, class282.field5070.method666(false));
                                        var321 = 7;
                                    } else if (var320.method664(class151.field2651, 0)) {
                                        var319 = var319.method637(arg1 ^ 0xFFFFFFA2, class151.field2651.method666(false));
                                        var321 = 8;
                                    } else if (var320.method664(class220.field3998, 0)) {
                                        var321 = 9;
                                        var319 = var319.method637(83, class220.field3998.method666(false));
                                    } else if (var320.method664(class258.field4641, 0)) {
                                        var319 = var319.method637(118, class258.field4641.method666(false));
                                        var321 = 10;
                                    } else if (var320.method664(class147.field2585, 0)) {
                                        var319 = var319.method637(93, class147.field2585.method666(false));
                                        var321 = 11;
                                    } else if (class104.field1802 != 0) {
                                        if (var320.method664(class263.field4694, 0)) {
                                            var321 = 0;
                                            var319 = var319.method637(50, class263.field4694.method666(false));
                                        } else if (var320.method664(class217.field3954, 0)) {
                                            var321 = 1;
                                            var319 = var319.method637(arg1 + 128, class217.field3954.method666(false));
                                        } else if (var320.method664(class181.field3226, 0)) {
                                            var321 = 2;
                                            var319 = var319.method637(67, class181.field3226.method666(false));
                                        } else if (var320.method664(class19.field255, 0)) {
                                            var321 = 3;
                                            var319 = var319.method637(90, class19.field255.method666(false));
                                        } else if (var320.method664(class251.field4522, 0)) {
                                            var319 = var319.method637(55, class251.field4522.method666(false));
                                            var321 = 4;
                                        } else if (var320.method664(class76.field1416, 0)) {
                                            var321 = 5;
                                            var319 = var319.method637(99, class76.field1416.method666(false));
                                        } else if (var320.method664(class68.field1247, 0)) {
                                            var321 = 6;
                                            var319 = var319.method637(72, class68.field1247.method666(false));
                                        } else if (var320.method664(class282.field5071, 0)) {
                                            var321 = 7;
                                            var319 = var319.method637(120, class282.field5071.method666(false));
                                        } else if (var320.method664(class151.field2646, arg1 ^ 0xFFFFFFFA)) {
                                            var319 = var319.method637(54, class151.field2646.method666(false));
                                            var321 = 8;
                                        } else if (var320.method664(class220.field3997, 0)) {
                                            var319 = var319.method637(68, class220.field3997.method666(false));
                                            var321 = 9;
                                        } else if (var320.method664(class258.field4648, arg1 + 6)) {
                                            var321 = 10;
                                            var319 = var319.method637(arg1 ^ 0xFFFFFF93, class258.field4648.method666(false));
                                        } else if (var320.method664(class147.field2594, 0)) {
                                            var321 = 11;
                                            var319 = var319.method637(64, class147.field2594.method666(false));
                                        }
                                    }
                                    class93 var323 = var319.method663(-123);
                                    if (var323.method664(class258.field4651, 0)) {
                                        var319 = var319.method637(93, class258.field4651.method666(false));
                                        var322 = 1;
                                    } else if (var323.method664(class129.field2267, arg1 + 6)) {
                                        var319 = var319.method637(74, class129.field2267.method666(false));
                                        var322 = 2;
                                    } else if (var323.method664(class51.field842, arg1 + 6)) {
                                        var319 = var319.method637(84, class51.field842.method666(false));
                                        var322 = 3;
                                    } else if (var323.method664(class78.field1455, 0)) {
                                        var322 = 4;
                                        var319 = var319.method637(122, class78.field1455.method666(false));
                                    } else if (var323.method664(class19.field249, 0)) {
                                        var322 = 5;
                                        var319 = var319.method637(56, class19.field249.method666(false));
                                    } else if (class104.field1802 != 0) {
                                        if (var323.method664(class258.field4646, 0)) {
                                            var322 = 1;
                                            var319 = var319.method637(97, class258.field4646.method666(false));
                                        } else if (var323.method664(class129.field2266, 0)) {
                                            var319 = var319.method637(125, class129.field2266.method666(false));
                                            var322 = 2;
                                        } else if (var323.method664(class51.field846, 0)) {
                                            var319 = var319.method637(99, class51.field846.method666(false));
                                            var322 = 3;
                                        } else if (var323.method664(class78.field1464, 0)) {
                                            var319 = var319.method637(71, class78.field1464.method666(false));
                                            var322 = 4;
                                        } else if (var323.method664(class19.field253, 0)) {
                                            var319 = var319.method637(59, class19.field253.method666(false));
                                            var322 = 5;
                                        }
                                    }
                                    class285.field5105.method1568(214, (byte) 101);
                                    class285.field5105.method1916(0, 116);
                                    int var324 = class285.field5105.field5027;
                                    class285.field5105.method1916(var321, 124);
                                    class285.field5105.method1916(var322, 103);
                                    class193.method1383(113, class285.field5105, var319);
                                    class285.field5105.method1874(false, class285.field5105.field5027 - var324);
                                    continue;
                                }
                                if (var498 == 5009) {
                                    var7 -= 2;
                                    class93 var325 = class69.field1258[var7];
                                    class93 var326 = class69.field1258[var7 + 1];
                                    if (class285.field5109 != 0 || (!class3.field36 || class67.field1224) && !class19.field259) {
                                        class95.field1717++;
                                        class285.field5105.method1568(132, (byte) 118);
                                        class285.field5105.method1916(0, 77);
                                        int var327 = class285.field5105.field5027;
                                        class285.field5105.method1882(var325.method679((byte) -72), (byte) -126);
                                        class193.method1383(124, class285.field5105, var326);
                                        class285.field5105.method1874(false, class285.field5105.field5027 - var327);
                                    }
                                    continue;
                                }
                                if (var498 == 5010) {
                                    class93 var328 = null;
                                    var6--;
                                    int var329 = class172.field3017[var6];
                                    if (var329 < 100) {
                                        var328 = class253.field4550[var329];
                                    }
                                    if (var328 == null) {
                                        var328 = class56.field928;
                                    }
                                    class69.field1258[var7++] = var328;
                                    continue;
                                }
                                if (var498 == 5011) {
                                    var6--;
                                    int var330 = class172.field3017[var6];
                                    class93 var331 = null;
                                    if (var330 < 100) {
                                        var331 = class260.field4676[var330];
                                    }
                                    if (var331 == null) {
                                        var331 = class56.field928;
                                    }
                                    class69.field1258[var7++] = var331;
                                    continue;
                                }
                                if (var498 == 5012) {
                                    int var332 = -1;
                                    var6--;
                                    int var333 = class172.field3017[var6];
                                    if (var333 < 100) {
                                        var332 = class9.field133[var333];
                                    }
                                    class172.field3017[var6++] = var332;
                                    continue;
                                }
                                if (var498 == 5015) {
                                    class93 var334;
                                    if (class166.field2927 == null || class166.field2927.field4247 == null) {
                                        var334 = field3146;
                                    } else {
                                        var334 = class166.field2927.method1616((byte) 52);
                                    }
                                    class69.field1258[var7++] = var334;
                                    continue;
                                }
                                if (var498 == 5016) {
                                    class172.field3017[var6++] = class250.field4506;
                                    continue;
                                }
                                if (var498 == 5017) {
                                    class172.field3017[var6++] = class172.field3015;
                                    continue;
                                }
                                if (var498 == 5050) {
                                    var6--;
                                    int var335 = class172.field3017[var6];
                                    class69.field1258[var7++] = class106.method767(var335, 82).field4164;
                                    continue;
                                }
                                if (var498 == 5051) {
                                    var6--;
                                    int var336 = class172.field3017[var6];
                                    class234 var337 = class106.method767(var336, 84);
                                    if (var337.field4163 == null) {
                                        class172.field3017[var6++] = 0;
                                    } else {
                                        class172.field3017[var6++] = var337.field4163.length;
                                    }
                                    continue;
                                }
                                if (var498 == 5052) {
                                    var6 -= 2;
                                    int var338 = class172.field3017[var6 + 1];
                                    int var339 = class172.field3017[var6];
                                    class234 var340 = class106.method767(var339, 82);
                                    int var341 = var340.field4163[var338];
                                    class172.field3017[var6++] = var341;
                                    continue;
                                }
                                if (var498 == 5053) {
                                    var6--;
                                    int var342 = class172.field3017[var6];
                                    class234 var343 = class106.method767(var342, 114);
                                    if (var343.field4167 == null) {
                                        class172.field3017[var6++] = 0;
                                    } else {
                                        class172.field3017[var6++] = var343.field4167.length;
                                    }
                                    continue;
                                }
                                if (var498 == 5054) {
                                    var6 -= 2;
                                    int var344 = class172.field3017[var6];
                                    int var345 = class172.field3017[var6 + 1];
                                    class172.field3017[var6++] = class106.method767(var344, 83).field4167[var345];
                                    continue;
                                }
                                if (var498 == 5055) {
                                    var6--;
                                    int var346 = class172.field3017[var6];
                                    class69.field1258[var7++] = class127.method928(var346, (byte) 18).method410((byte) -112);
                                    continue;
                                }
                                if (var498 == 5056) {
                                    var6--;
                                    int var347 = class172.field3017[var6];
                                    class63 var348 = class127.method928(var347, (byte) 18);
                                    if (var348.field1134 == null) {
                                        class172.field3017[var6++] = 0;
                                    } else {
                                        class172.field3017[var6++] = var348.field1134.length;
                                    }
                                    continue;
                                }
                                if (var498 == 5057) {
                                    var6 -= 2;
                                    int var349 = class172.field3017[var6];
                                    int var350 = class172.field3017[var6 + 1];
                                    class172.field3017[var6++] = class127.method928(var349, (byte) 18).field1134[var350];
                                    continue;
                                }
                                if (var498 == 5058) {
                                    class180.field3171 = new class95();
                                    var6--;
                                    class180.field3171.field1712 = class172.field3017[var6];
                                    class180.field3171.field1715 = class127.method928(class180.field3171.field1712, (byte) 18);
                                    class180.field3171.field1713 = new int[class180.field3171.field1715.method409(0)];
                                    continue;
                                }
                                if (var498 == 5059) {
                                    class54.field896++;
                                    class285.field5105.method1568(29, (byte) 109);
                                    class285.field5105.method1916(0, arg1 ^ 0xFFFFFF90);
                                    int var351 = class285.field5105.field5027;
                                    class285.field5105.method1916(0, 92);
                                    class285.field5105.method1908(-80, class180.field3171.field1712);
                                    class180.field3171.field1715.method414(class285.field5105, class180.field3171.field1713, 40);
                                    class285.field5105.method1874(false, class285.field5105.field5027 - var351);
                                    continue;
                                }
                                if (var498 == 5060) {
                                    class141.field2445++;
                                    var7--;
                                    class93 var352 = class69.field1258[var7];
                                    class285.field5105.method1568(183, (byte) 56);
                                    class285.field5105.method1916(0, 71);
                                    int var353 = class285.field5105.field5027;
                                    class285.field5105.method1882(var352.method679((byte) -91), (byte) -126);
                                    class285.field5105.method1908(-83, class180.field3171.field1712);
                                    class180.field3171.field1715.method414(class285.field5105, class180.field3171.field1713, arg1 ^ 0x6D);
                                    class285.field5105.method1874(false, class285.field5105.field5027 - var353);
                                    continue;
                                }
                                if (var498 == 5061) {
                                    class285.field5105.method1568(29, (byte) 88);
                                    class54.field896++;
                                    class285.field5105.method1916(0, 92);
                                    int var354 = class285.field5105.field5027;
                                    class285.field5105.method1916(1, 64);
                                    class285.field5105.method1908(-111, class180.field3171.field1712);
                                    class180.field3171.field1715.method414(class285.field5105, class180.field3171.field1713, 47);
                                    class285.field5105.method1874(false, class285.field5105.field5027 - var354);
                                    continue;
                                }
                                if (var498 == 5062) {
                                    var6 -= 2;
                                    int var355 = class172.field3017[var6];
                                    int var356 = class172.field3017[var6 + 1];
                                    class172.field3017[var6++] = class106.method767(var355, class175.method1248(arg1, -105)).field4157[var356];
                                    continue;
                                }
                                if (var498 == 5063) {
                                    var6 -= 2;
                                    int var357 = class172.field3017[var6 + 1];
                                    int var358 = class172.field3017[var6];
                                    class172.field3017[var6++] = class106.method767(var358, 96).field4170[var357];
                                    continue;
                                }
                                if (var498 == 5064) {
                                    var6 -= 2;
                                    int var359 = class172.field3017[var6 + 1];
                                    int var360 = class172.field3017[var6];
                                    if (var359 == -1) {
                                        class172.field3017[var6++] = -1;
                                    } else {
                                        class172.field3017[var6++] = class106.method767(var360, arg1 + 99).method1594(var359, 120);
                                    }
                                    continue;
                                }
                                if (var498 == 5065) {
                                    var6 -= 2;
                                    int var361 = class172.field3017[var6];
                                    int var362 = class172.field3017[var6 + 1];
                                    if (var362 == -1) {
                                        class172.field3017[var6++] = -1;
                                    } else {
                                        class172.field3017[var6++] = class106.method767(var361, 105).method1599((byte) -118, var362);
                                    }
                                    continue;
                                }
                                if (var498 == 5066) {
                                    var6--;
                                    int var363 = class172.field3017[var6];
                                    class172.field3017[var6++] = class127.method928(var363, (byte) 18).method409(0);
                                    continue;
                                }
                                if (var498 == 5067) {
                                    var6 -= 2;
                                    int var364 = class172.field3017[var6];
                                    int var365 = class172.field3017[var6 + 1];
                                    int var366 = class127.method928(var364, (byte) 18).method408(var365, 25335);
                                    class172.field3017[var6++] = var366;
                                    continue;
                                }
                                if (var498 == 5068) {
                                    var6 -= 2;
                                    int var367 = class172.field3017[var6 + 1];
                                    int var368 = class172.field3017[var6];
                                    class180.field3171.field1713[var368] = var367;
                                    continue;
                                }
                                if (var498 == 5069) {
                                    var6 -= 2;
                                    int var369 = class172.field3017[var6];
                                    int var370 = class172.field3017[var6 + 1];
                                    class180.field3171.field1713[var369] = var370;
                                    continue;
                                }
                                if (var498 == 5070) {
                                    var6 -= 3;
                                    int var371 = class172.field3017[var6];
                                    int var372 = class172.field3017[var6 + 1];
                                    int var373 = class172.field3017[var6 + 2];
                                    class63 var374 = class127.method928(var371, (byte) 18);
                                    if (var374.method408(var372, 25335) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class172.field3017[var6++] = var374.method411(var373, 1, var372);
                                    continue;
                                }
                                if (var498 == 5071) {
                                    var7--;
                                    class93 var375 = class69.field1258[var7];
                                    var6--;
                                    boolean var376 = class172.field3017[var6] == 1;
                                    class40.method230(var375, -90, var376);
                                    class172.field3017[var6++] = class254.field4596;
                                    continue;
                                }
                                if (var498 == 5072) {
                                    if (class230.field4122 != null && client.field2720 < class254.field4596) {
                                        class172.field3017[var6++] = class58.method333(class230.field4122[client.field2720++], 65535);
                                        continue;
                                    }
                                    class172.field3017[var6++] = -1;
                                    continue;
                                }
                                if (var498 == 5073) {
                                    client.field2720 = 0;
                                    continue;
                                }
                            } else if (var498 < 5200) {
                                if (var498 == 5100) {
                                    if (class176.field3048[86]) {
                                        class172.field3017[var6++] = 1;
                                    } else {
                                        class172.field3017[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var498 == 5101) {
                                    if (class176.field3048[82]) {
                                        class172.field3017[var6++] = 1;
                                    } else {
                                        class172.field3017[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var498 == 5102) {
                                    if (class176.field3048[81]) {
                                        class172.field3017[var6++] = 1;
                                    } else {
                                        class172.field3017[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var498 < 5300) {
                                if (var498 == 5200) {
                                    var6--;
                                    class267.method1787(class172.field3017[var6], (byte) 36);
                                    continue;
                                }
                                if (var498 == 5201) {
                                    class172.field3017[var6++] = class93.method655((byte) -123);
                                    continue;
                                }
                                if (var498 == 5202) {
                                    var6--;
                                    class123.method907(class172.field3017[var6], 0);
                                    continue;
                                }
                                if (var498 == 5203) {
                                    var7--;
                                    class251.method1703(class69.field1258[var7], (byte) -86);
                                    continue;
                                }
                                if (var498 == 5204) {
                                    class69.field1258[var7 - 1] = class112.method797((byte) 40, class69.field1258[var7 - 1]);
                                    continue;
                                }
                                if (var498 == 5205) {
                                    var7--;
                                    class249.method1689((byte) -33, class69.field1258[var7]);
                                    continue;
                                }
                                if (var498 == 5206) {
                                    var6--;
                                    int var290 = class172.field3017[var6];
                                    class157 var291 = class105.method760((var290 & 0xFFFE122) >> 14, var290 & 0x3FFF, 2048);
                                    if (var291 == null) {
                                        class69.field1258[var7++] = class56.field928;
                                    } else {
                                        class69.field1258[var7++] = var291.field2773;
                                    }
                                    continue;
                                }
                                if (var498 == 5207) {
                                    var7--;
                                    class157 var292 = class13.method58(-1787757920, class69.field1258[var7]);
                                    if (var292 != null && var292.field2777 != null) {
                                        class69.field1258[var7++] = var292.field2777;
                                        continue;
                                    }
                                    class69.field1258[var7++] = class56.field928;
                                    continue;
                                }
                                if (var498 == 5208) {
                                    class172.field3017[var6++] = class29.field406;
                                    class172.field3017[var6++] = class8.field107;
                                    continue;
                                }
                                if (var498 == 5209) {
                                    class172.field3017[var6++] = class71.field1287 + class251.field4518;
                                    class172.field3017[var6++] = class183.field3373 + class76.field1404 - class154.field2700 - 1;
                                    continue;
                                }
                                if (var498 == 5210) {
                                    class157 var293 = class231.method1584((byte) 120);
                                    if (var293 == null) {
                                        class172.field3017[var6++] = 0;
                                        class172.field3017[var6++] = 0;
                                    } else {
                                        class172.field3017[var6++] = var293.field2780 * 64;
                                        class172.field3017[var6++] = var293.field2786 * 64;
                                    }
                                    continue;
                                }
                                if (var498 == 5211) {
                                    class157 var294 = class231.method1584((byte) 124);
                                    if (var294 == null) {
                                        class172.field3017[var6++] = 0;
                                        class172.field3017[var6++] = 0;
                                    } else {
                                        class172.field3017[var6++] = var294.field2784 - var294.field2782;
                                        class172.field3017[var6++] = var294.field2783 - var294.field2772;
                                    }
                                    continue;
                                }
                                if (var498 == 5212) {
                                    int var295 = class15.method68(0);
                                    int var296 = 0;
                                    class93 var297;
                                    if (var295 == -1) {
                                        var297 = class56.field928;
                                    } else {
                                        var297 = class234.field4165.field2260[var295];
                                        var296 = class234.field4165.method940(var295, (byte) -112);
                                    }
                                    class93 var298 = var297.method636(class190.field3482, class248.field4466, (byte) 107);
                                    class69.field1258[var7++] = var298;
                                    class172.field3017[var6++] = var296;
                                    continue;
                                }
                                if (var498 == 5213) {
                                    int var299 = class39.method227(false);
                                    int var300 = 0;
                                    class93 var301;
                                    if (var299 == -1) {
                                        var301 = class56.field928;
                                    } else {
                                        var301 = class234.field4165.field2260[var299];
                                        var300 = class234.field4165.method940(var299, (byte) -112);
                                    }
                                    class93 var302 = var301.method636(class190.field3482, class248.field4466, (byte) 124);
                                    class69.field1258[var7++] = var302;
                                    class172.field3017[var6++] = var300;
                                    continue;
                                }
                                if (var498 == 5214) {
                                    var6--;
                                    int var303 = class172.field3017[var6];
                                    class193.method1386(660316969, var303 >> 14 & 0x3FFF, var303 & 0x3FFF);
                                    continue;
                                }
                                if (var498 == 5215) {
                                    var6--;
                                    int var304 = class172.field3017[var6];
                                    var7--;
                                    class93 var305 = class69.field1258[var7];
                                    boolean var306 = false;
                                    class165 var307 = class153.method1096(var304 >> 14 & 0x3FFF, var304 & 0x3FFF, 108);
                                    for (class157 var308 = (class157) var307.method1196(2); var308 != null; var308 = (class157) var307.method1200(arg1 ^ 0xFFFFD98E)) {
                                        if (var308.field2773.method649(var305, -4446)) {
                                            var306 = true;
                                            break;
                                        }
                                    }
                                    if (var306) {
                                        class172.field3017[var6++] = 1;
                                    } else {
                                        class172.field3017[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var498 == 5216) {
                                    var6--;
                                    int var309 = class172.field3017[var6];
                                    class254.method1729(-103, var309);
                                    continue;
                                }
                                if (var498 == 5217) {
                                    var6--;
                                    int var310 = class172.field3017[var6];
                                    if (class138.method1010(var310, 53)) {
                                        class172.field3017[var6++] = 1;
                                    } else {
                                        class172.field3017[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var498 == 5218) {
                                    class157 var311 = class231.method1584((byte) 113);
                                    if (var311 == null) {
                                        class172.field3017[var6++] = -1;
                                    } else {
                                        class172.field3017[var6++] = var311.field2770;
                                    }
                                    continue;
                                }
                                if (var498 == 5219) {
                                    var7--;
                                    class70.method475(class69.field1258[var7], false);
                                    continue;
                                }
                                if (var498 == 5220) {
                                    class172.field3017[var6++] = class144.field2499 == 100 ? 1 : 0;
                                    continue;
                                }
                            } else if (var498 < 5400) {
                                if (var498 == 5300) {
                                    var6 -= 2;
                                    class172.field3017[var6++] = 0;
                                    continue;
                                }
                                if (var498 == 5301) {
                                    continue;
                                }
                                if (var498 == 5302) {
                                    class172.field3017[var6++] = 0;
                                    continue;
                                }
                                if (var498 == 5303) {
                                    var6--;
                                    class172.field3017[var6++] = 0;
                                    class172.field3017[var6++] = 0;
                                    continue;
                                }
                                if (var498 == 5305) {
                                    byte var224 = -1;
                                    class172.field3017[var6++] = var224;
                                    continue;
                                }
                                if (var498 == 5306) {
                                    class172.field3017[var6++] = class55.method311(false);
                                    continue;
                                }
                                if (var498 == 5307) {
                                    var6--;
                                    int var225 = class172.field3017[var6];
                                    if (var225 < 0 || var225 > 2) {
                                        var225 = 0;
                                    }
                                    class112.method804(false, -1, -1, arg1 ^ 0x5, var225);
                                    continue;
                                }
                                if (var498 == 5308) {
                                    class172.field3017[var6++] = class180.field3168;
                                    continue;
                                }
                                if (var498 == 5309) {
                                    var6--;
                                    int var226 = class172.field3017[var6];
                                    if (var226 < 0 || var226 > 2) {
                                        var226 = 0;
                                    }
                                    class180.field3168 = var226;
                                    class271.method1800(class169.field2967, -2);
                                    continue;
                                }
                            } else if (var498 < 5500) {
                                if (var498 == 5400) {
                                    class260.field4668++;
                                    var6--;
                                    int var269 = class172.field3017[var6];
                                    var7 -= 2;
                                    class93 var270 = class69.field1258[var7];
                                    class93 var271 = class69.field1258[var7 + 1];
                                    class285.field5105.method1568(55, (byte) 71);
                                    class285.field5105.method1916(class80.method555(0, var270) - (-class80.method555(0, var271) - 1), 65);
                                    class285.field5105.method1898((byte) 119, var270);
                                    class285.field5105.method1898((byte) 118, var271);
                                    class285.field5105.method1916(var269, 73);
                                    continue;
                                }
                                if (var498 == 5401) {
                                    var6 -= 2;
                                    class177.field3097[class172.field3017[var6]] = (short) class180.method1322(class172.field3017[var6 + 1], (byte) 124);
                                    class57.method330(false);
                                    class166.method1206(arg1 ^ 0x3D);
                                    class247.method1681(0);
                                    class74.method504(arg1 ^ 0x39);
                                    class39.method226(-14863);
                                    continue;
                                }
                                if (var498 == 5405) {
                                    var6 -= 2;
                                    int var272 = class172.field3017[var6];
                                    int var273 = class172.field3017[var6 + 1];
                                    if (var272 >= 0 && var272 < 2) {
                                        class126.field2234[var272] = new int[var273 << 1][4];
                                    }
                                    continue;
                                }
                                if (var498 == 5406) {
                                    var6 -= 7;
                                    int var274 = class172.field3017[var6];
                                    int var275 = class172.field3017[var6 + 1] << 1;
                                    int var276 = class172.field3017[var6 + 3];
                                    int var277 = class172.field3017[var6 + 2];
                                    int var278 = class172.field3017[var6 + 4];
                                    int var279 = class172.field3017[var6 + 5];
                                    int var280 = class172.field3017[var6 + 6];
                                    if (var274 >= 0 && var274 < 2 && class126.field2234[var274] != null && var275 >= 0 && var275 < class126.field2234[var274].length) {
                                        class126.field2234[var274][var275] = new int[] { (class58.method333(var277, 268419770) >> 14) * 128, var276, class58.method333(16383, var277) * 128, var280 };
                                        class126.field2234[var274][var275 + 1] = new int[] { class58.method333(16383, var278 >> 14) * 128, var279, class58.method333(var278, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var498 == 5407) {
                                    var6--;
                                    int var281 = class126.field2234[class172.field3017[var6]].length >> 1;
                                    class172.field3017[var6++] = var281;
                                    continue;
                                }
                                if (var498 == 5411) {
                                    if (class246.field4432 == null) {
                                        class120.method892((byte) 91, false, class121.method896(107));
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var498 == 5419) {
                                    class93 var282 = class56.field928;
                                    if (class105.field1826 != null) {
                                        var282 = class185.method1352(-626138072, class105.field1826.field291);
                                        try {
                                            if (class105.field1826.field292 != null) {
                                                byte[] var283 = ((String) class105.field1826.field292).getBytes("ISO-8859-1");
                                                var282 = class65.method450(var283.length, 0, -121, var283);
                                            }
                                        } catch (UnsupportedEncodingException var496) {
                                        }
                                    }
                                    class69.field1258[var7++] = var282;
                                    continue;
                                }
                                if (var498 == 5420) {
                                    class172.field3017[var6++] = class286.field5122 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 5421) {
                                    var6--;
                                    boolean var284 = class172.field3017[var6] == 1;
                                    var7--;
                                    class93 var285 = class69.field1258[var7];
                                    class93 var286 = class130.method949((byte) -77, new class93[] { class121.method896(-117), var285 });
                                    if (class246.field4432 == null && (!var284 || class286.field5122 == 3 || !class286.field5121.startsWith("win") || class73.field1314)) {
                                        class120.method892((byte) 91, var284, var286);
                                        continue;
                                    }
                                    class141.field2448 = var284;
                                    class257.field4637 = var286;
                                    class166.field2932 = class169.field2967.method1964(2, new String(var286.method642(arg1 + 26), "ISO-8859-1"));
                                    continue;
                                }
                                if (var498 == 5422) {
                                    var7 -= 2;
                                    var6--;
                                    int var287 = class172.field3017[var6];
                                    class93 var288 = class69.field1258[var7];
                                    class93 var289 = class69.field1258[var7 + 1];
                                    if (var288.method666(false) > 0) {
                                        if (class110.field1885 == null) {
                                            class110.field1885 = new class93[class210.field3809[class78.field1460]];
                                        }
                                        class110.field1885[var287] = var288;
                                    }
                                    if (var289.method666(false) > 0) {
                                        if (client.field2716 == null) {
                                            client.field2716 = new class93[class210.field3809[class78.field1460]];
                                        }
                                        client.field2716[var287] = var289;
                                    }
                                    continue;
                                }
                                if (var498 == 5423) {
                                    var7--;
                                    class69.field1258[var7].method683(-104);
                                    continue;
                                }
                                if (var498 == 5424) {
                                    var6 -= 11;
                                    class18.field237 = class172.field3017[var6];
                                    class44.field697 = class172.field3017[var6 + 1];
                                    class240.field4293 = class172.field3017[var6 + 2];
                                    class104.field1799 = class172.field3017[var6 + 3];
                                    class93.field1665 = class172.field3017[var6 + 4];
                                    class250.field4498 = class172.field3017[var6 + 5];
                                    class16.field216 = class172.field3017[var6 + 6];
                                    class193.field3534 = class172.field3017[var6 + 7];
                                    class224.field4040 = class172.field3017[var6 + 8];
                                    class264.field4719 = class172.field3017[var6 + 9];
                                    class224.field4041 = class172.field3017[var6 + 10];
                                    class246.field4436.method1280(class93.field1665, (byte) -61);
                                    class246.field4436.method1280(class250.field4498, (byte) -99);
                                    class246.field4436.method1280(class16.field216, (byte) -101);
                                    class246.field4436.method1280(class193.field3534, (byte) -53);
                                    class246.field4436.method1280(class224.field4040, (byte) -41);
                                    class4.field48 = true;
                                    continue;
                                }
                                if (var498 == 5425) {
                                    class189.method1364((byte) -46);
                                    class4.field48 = false;
                                    continue;
                                }
                                if (var498 == 5426) {
                                    var6--;
                                    class157.field2789 = class172.field3017[var6];
                                    continue;
                                }
                                if (var498 == 5427) {
                                    var6 -= 2;
                                    class220.field3994 = class172.field3017[var6];
                                    class126.field2237 = class172.field3017[var6 + 1];
                                    continue;
                                }
                            } else if (var498 < 5600) {
                                if (var498 == 5500) {
                                    var6 -= 4;
                                    int var257 = class172.field3017[var6];
                                    int var258 = class172.field3017[var6 + 2];
                                    int var259 = class172.field3017[var6 + 1];
                                    int var260 = class172.field3017[var6 + 3];
                                    class146.method1061(var259, false, var258, (var257 & 0x3FFF) - class4.field52, var260, (var257 >> 14 & 0x3FFF) - class229.field4111, true);
                                    continue;
                                }
                                if (var498 == 5501) {
                                    var6 -= 4;
                                    int var261 = class172.field3017[var6];
                                    int var262 = class172.field3017[var6 + 1];
                                    int var263 = class172.field3017[var6 + 3];
                                    int var264 = class172.field3017[var6 + 2];
                                    class135.method987(((var261 & 0xFFFD34B) >> 14) - class229.field4111, (var261 & 0x3FFF) + -class4.field52, var262, var263, var264, -124);
                                    continue;
                                }
                                if (var498 == 5502) {
                                    var6 -= 6;
                                    int var265 = class172.field3017[var6];
                                    if (var265 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class267.field4759 = var265;
                                    int var266 = class172.field3017[var6 + 1];
                                    if (var266 + 1 >= class126.field2234[class267.field4759].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class267.field4760 = 0;
                                    class186.field3434 = var266;
                                    class251.field4520 = class172.field3017[var6 + 2];
                                    class151.field2650 = class172.field3017[var6 + 3];
                                    int var267 = class172.field3017[var6 + 4];
                                    if (var267 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class97.field1737 = var267;
                                    int var268 = class172.field3017[var6 + 5];
                                    if (var268 + 1 >= class126.field2234[class97.field1737].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class73.field1323 = var268;
                                    class18.field234 = 3;
                                    continue;
                                }
                                if (var498 == 5503) {
                                    class15.method71(0);
                                    continue;
                                }
                                if (var498 == 5504) {
                                    var6 -= 2;
                                    class211.field3875 = class172.field3017[var6];
                                    class50.field825 = class172.field3017[var6 + 1];
                                    if (class18.field234 == 2) {
                                        class198.field3602 = class211.field3875;
                                        class233.field4155 = class50.field825;
                                    }
                                    class19.method89((byte) 100);
                                    continue;
                                }
                                if (var498 == 5505) {
                                    class172.field3017[var6++] = class211.field3875;
                                    continue;
                                }
                                if (var498 == 5506) {
                                    class172.field3017[var6++] = class50.field825;
                                    continue;
                                }
                            } else if (var498 < 5700) {
                                if (var498 == 5600) {
                                    var6--;
                                    int var227 = class172.field3017[var6];
                                    var7 -= 2;
                                    class93 var228 = class69.field1258[var7 + 1];
                                    class93 var229 = class69.field1258[var7];
                                    if (class199.field3609 == 10 && class101.field1762 == 0 && class68.field1239 == 0 && class283.field5078 == 0 && class188.field3455 == 0) {
                                        class277.method1859(var228, (byte) -107, var227, var229);
                                    }
                                    continue;
                                }
                                if (var498 == 5601) {
                                    class125.method921(arg1 ^ 0xFFFF993C);
                                    continue;
                                }
                                if (var498 == 5602) {
                                    if (class68.field1239 == 0) {
                                        class242.field4371 = -2;
                                    }
                                    continue;
                                }
                                if (var498 == 5603) {
                                    var6 -= 4;
                                    if (class199.field3609 == 10 && class101.field1762 == 0 && class68.field1239 == 0 && class283.field5078 == 0 && class188.field3455 == 0) {
                                        class258.method1743((byte) 127, class172.field3017[var6 + 1], class172.field3017[var6 + 3], class172.field3017[var6], class172.field3017[var6 + 2]);
                                    }
                                    continue;
                                }
                                if (var498 == 5604) {
                                    var7--;
                                    if (class199.field3609 == 10 && class101.field1762 == 0 && class68.field1239 == 0 && class283.field5078 == 0 && class188.field3455 == 0) {
                                        class52.method287(-18227, class69.field1258[var7].method679((byte) -96));
                                    }
                                    continue;
                                }
                                if (var498 == 5605) {
                                    var6 -= 4;
                                    var7 -= 2;
                                    if (class199.field3609 == 10 && class101.field1762 == 0 && class68.field1239 == 0 && class283.field5078 == 0 && class188.field3455 == 0) {
                                        class18.method85((byte) 61, class172.field3017[var6 + 2], class172.field3017[var6 + 3], class69.field1258[var7 + 1], class69.field1258[var7].method679((byte) -102), class172.field3017[var6], class172.field3017[var6 + 1]);
                                    }
                                    continue;
                                }
                                if (var498 == 5606) {
                                    if (class283.field5078 == 0) {
                                        class68.field1235 = -2;
                                    }
                                    continue;
                                }
                                if (var498 == 5607) {
                                    class172.field3017[var6++] = class242.field4371;
                                    continue;
                                }
                                if (var498 == 5608) {
                                    class172.field3017[var6++] = class283.field5081;
                                    continue;
                                }
                                if (var498 == 5609) {
                                    class172.field3017[var6++] = class68.field1235;
                                    continue;
                                }
                                if (var498 == 5610) {
                                    for (int var230 = 0; var230 < 5; var230++) {
                                        class69.field1258[var7++] = class8.field115.length > var230 ? class8.field115[var230].method687(-96) : class56.field928;
                                    }
                                    class8.field115 = null;
                                    continue;
                                }
                                if (var498 == 5611) {
                                    class172.field3017[var6++] = class250.field4501;
                                    continue;
                                }
                            } else if (var498 < 6100) {
                                if (var498 == 6001) {
                                    var6--;
                                    int var231 = class172.field3017[var6];
                                    if (var231 < 1) {
                                        var231 = 1;
                                    }
                                    if (var231 > 4) {
                                        var231 = 4;
                                    }
                                    class66.field1216 = var231;
                                    if (class66.field1216 == 1) {
                                        class179.method1305(0.9F);
                                    }
                                    if (class66.field1216 == 2) {
                                        class179.method1305(0.8F);
                                    }
                                    if (class66.field1216 == 3) {
                                        class179.method1305(0.7F);
                                    }
                                    if (class66.field1216 == 4) {
                                        class179.method1305(0.6F);
                                    }
                                    class166.method1206(-90);
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6002) {
                                    var6--;
                                    class148.method1069(97, class172.field3017[var6] == 1);
                                    class9.method42(-10);
                                    class259.method1744(117);
                                    class119.method886(-13858);
                                    class271.method1800(class169.field2967, arg1 + 4);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6003) {
                                    var6--;
                                    class170.field3000 = class172.field3017[var6] == 1;
                                    class119.method886(arg1 - 13852);
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6005) {
                                    var6--;
                                    class154.field2704 = class172.field3017[var6] == 1;
                                    class259.method1744(65);
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6006) {
                                    var6--;
                                    class46.field739 = class172.field3017[var6] == 1;
                                    ((class209) class179.field3156).method1468(0, !class46.field739);
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6007) {
                                    var6--;
                                    class230.field4124 = class172.field3017[var6] == 1;
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6008) {
                                    var6--;
                                    class280.field5059 = class172.field3017[var6] == 1;
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6009) {
                                    var6--;
                                    class119.field2117 = class172.field3017[var6] == 1;
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6010) {
                                    var6--;
                                    class154.field2697 = class172.field3017[var6] == 1;
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6011) {
                                    var6--;
                                    int var232 = class172.field3017[var6];
                                    if (var232 < 0 || var232 > 2) {
                                        var232 = 0;
                                    }
                                    class280.field5052 = var232;
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6012) {
                                    var6--;
                                    class235.field4195 = class172.field3017[var6] == 1;
                                    if (class66.field1216 == 1) {
                                        class179.method1305(0.9F);
                                    }
                                    if (class66.field1216 == 2) {
                                        class179.method1305(0.8F);
                                    }
                                    if (class66.field1216 == 3) {
                                        class179.method1305(0.7F);
                                    }
                                    if (class66.field1216 == 4) {
                                        class179.method1305(0.6F);
                                    }
                                    class259.method1744(98);
                                    class271.method1800(class169.field2967, arg1 + 4);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6014) {
                                    var6--;
                                    class110.field1876 = class172.field3017[var6] == 1;
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6015) {
                                    var6--;
                                    class207.field3717 = class172.field3017[var6] == 1;
                                    class271.method1800(class169.field2967, arg1 ^ 0x4);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6016) {
                                    var6--;
                                    int var233 = class172.field3017[var6];
                                    if (var233 < 0 || var233 > 2) {
                                        var233 = 0;
                                    }
                                    class119.field2121 = var233;
                                    continue;
                                }
                                if (var498 == 6017) {
                                    var6--;
                                    class161.field2832 = class172.field3017[var6] == 1;
                                    class167.method1208(-96);
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6018) {
                                    var6--;
                                    int var234 = class172.field3017[var6];
                                    if (var234 < 0) {
                                        var234 = 0;
                                    }
                                    if (var234 > 127) {
                                        var234 = 127;
                                    }
                                    class267.field4756 = var234;
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6019) {
                                    var6--;
                                    int var235 = class172.field3017[var6];
                                    if (var235 < 0) {
                                        var235 = 0;
                                    }
                                    if (var235 > 255) {
                                        var235 = 255;
                                    }
                                    if (class195.field3552 != var235) {
                                        if (class195.field3552 == 0 && class164.field2894 != -1) {
                                            class15.method69(false, 0, class189.field3468, class164.field2894, var235, -933796316);
                                            class254.field4599 = false;
                                        } else if (var235 == 0) {
                                            class138.method1007(arg1 ^ 0xFFFFFFFA);
                                            class254.field4599 = false;
                                        } else {
                                            class117.method871(var235, arg1 ^ 0xFFFFFFBC);
                                        }
                                        class195.field3552 = var235;
                                    }
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6020) {
                                    var6--;
                                    int var236 = class172.field3017[var6];
                                    if (var236 < 0) {
                                        var236 = 0;
                                    }
                                    if (var236 > 127) {
                                        var236 = 127;
                                    }
                                    class143.field2480 = var236;
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    continue;
                                }
                                if (var498 == 6021) {
                                    var6--;
                                    class220.field3985 = class172.field3017[var6] == 1;
                                    class119.method886(-13858);
                                    continue;
                                }
                                if (var498 == 6023) {
                                    boolean var237 = false;
                                    var6--;
                                    int var238 = class172.field3017[var6];
                                    if (var238 < 0) {
                                        var238 = 0;
                                    }
                                    if (var238 > 2) {
                                        var238 = 2;
                                    }
                                    if (class58.field979 < 96) {
                                        var238 = 0;
                                        var237 = true;
                                    }
                                    class91.method629(var238);
                                    class271.method1800(class169.field2967, -2);
                                    class193.field3525 = false;
                                    class172.field3017[var6++] = var237 ? 0 : 1;
                                    continue;
                                }
                                if (var498 == 6024) {
                                    var6--;
                                    int var239 = class172.field3017[var6];
                                    if (var239 < 0 || var239 > 2) {
                                        var239 = 0;
                                    }
                                    class154.field2699 = var239;
                                    class271.method1800(class169.field2967, -2);
                                    continue;
                                }
                                if (var498 == 6028) {
                                    var6--;
                                    class42.field667 = class172.field3017[var6] != 0;
                                    class271.method1800(class169.field2967, -2);
                                    continue;
                                }
                            } else if (var498 < 6200) {
                                if (var498 == 6101) {
                                    class172.field3017[var6++] = class66.field1216;
                                    continue;
                                }
                                if (var498 == 6102) {
                                    class172.field3017[var6++] = class13.method57(class175.method1248(arg1, -2353)) ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6103) {
                                    class172.field3017[var6++] = class170.field3000 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6105) {
                                    class172.field3017[var6++] = class154.field2704 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6106) {
                                    class172.field3017[var6++] = class46.field739 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6107) {
                                    class172.field3017[var6++] = class230.field4124 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6108) {
                                    class172.field3017[var6++] = class280.field5059 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6109) {
                                    class172.field3017[var6++] = class119.field2117 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6110) {
                                    class172.field3017[var6++] = class154.field2697 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6111) {
                                    class172.field3017[var6++] = class280.field5052;
                                    continue;
                                }
                                if (var498 == 6112) {
                                    class172.field3017[var6++] = class235.field4195 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6114) {
                                    class172.field3017[var6++] = class110.field1876 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6115) {
                                    class172.field3017[var6++] = class207.field3717 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6116) {
                                    class172.field3017[var6++] = class119.field2121;
                                    continue;
                                }
                                if (var498 == 6117) {
                                    class172.field3017[var6++] = class161.field2832 ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6118) {
                                    class172.field3017[var6++] = class267.field4756;
                                    continue;
                                }
                                if (var498 == 6119) {
                                    class172.field3017[var6++] = class195.field3552;
                                    continue;
                                }
                                if (var498 == 6120) {
                                    class172.field3017[var6++] = class143.field2480;
                                    continue;
                                }
                                if (var498 == 6121) {
                                    class172.field3017[var6++] = 0;
                                    continue;
                                }
                                if (var498 == 6123) {
                                    class172.field3017[var6++] = class91.method628();
                                    continue;
                                }
                                if (var498 == 6124) {
                                    class172.field3017[var6++] = class154.field2699;
                                    continue;
                                }
                                if (var498 == 6128) {
                                    class172.field3017[var6++] = class42.field667 ? 1 : 0;
                                    continue;
                                }
                            } else if (var498 < 6300) {
                                if (var498 == 6200) {
                                    var6 -= 2;
                                    class123.field2191 = (short) class172.field3017[var6];
                                    if (class123.field2191 <= 0) {
                                        class123.field2191 = 256;
                                    }
                                    class187.field3448 = (short) class172.field3017[var6 + 1];
                                    if (class187.field3448 <= 0) {
                                        class187.field3448 = 205;
                                    }
                                    continue;
                                }
                                if (var498 == 6201) {
                                    var6 -= 2;
                                    class151.field2647 = (short) class172.field3017[var6];
                                    if (class151.field2647 <= 0) {
                                        class151.field2647 = 256;
                                    }
                                    class130.field2292 = (short) class172.field3017[var6 + 1];
                                    if (class130.field2292 <= 0) {
                                        class130.field2292 = 320;
                                    }
                                    continue;
                                }
                                if (var498 == 6202) {
                                    var6 -= 4;
                                    class80.field1495 = (short) class172.field3017[var6];
                                    if (class80.field1495 <= 0) {
                                        class80.field1495 = 1;
                                    }
                                    class72.field1295 = (short) class172.field3017[var6 + 1];
                                    if (class72.field1295 <= 0) {
                                        class72.field1295 = 32767;
                                    } else if (class72.field1295 < class80.field1495) {
                                        class72.field1295 = class80.field1495;
                                    }
                                    class263.field4682 = (short) class172.field3017[var6 + 2];
                                    if (class263.field4682 <= 0) {
                                        class263.field4682 = 1;
                                    }
                                    class177.field3085 = (short) class172.field3017[var6 + 3];
                                    if (class177.field3085 <= 0) {
                                        class177.field3085 = 32767;
                                    } else if (class177.field3085 < class263.field4682) {
                                        class177.field3085 = class263.field4682;
                                    }
                                    continue;
                                }
                                if (var498 == 6203) {
                                    class76.method533(0, 0, false, class34.field538.field3270, class34.field538.field3252, 30679);
                                    class172.field3017[var6++] = class254.field4594;
                                    class172.field3017[var6++] = class120.field2134;
                                    continue;
                                }
                                if (var498 == 6204) {
                                    class172.field3017[var6++] = class151.field2647;
                                    class172.field3017[var6++] = class130.field2292;
                                    continue;
                                }
                                if (var498 == 6205) {
                                    class172.field3017[var6++] = class123.field2191;
                                    class172.field3017[var6++] = class187.field3448;
                                    continue;
                                }
                            } else if (var498 < 6400) {
                                if (var498 == 6300) {
                                    class172.field3017[var6++] = (int) (class28.method155((byte) 118) / 60000L);
                                    continue;
                                }
                                if (var498 == 6301) {
                                    class172.field3017[var6++] = (int) (class28.method155((byte) -17) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var498 == 6302) {
                                    var6 -= 3;
                                    int var252 = class172.field3017[var6 + 1];
                                    int var253 = class172.field3017[var6 + 2];
                                    int var254 = class172.field3017[var6];
                                    class66.field1214.clear();
                                    class66.field1214.set(11, 12);
                                    class66.field1214.set(var253, var252, var254);
                                    class172.field3017[var6++] = (int) (class66.field1214.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var498 == 6303) {
                                    class66.field1214.clear();
                                    class66.field1214.setTime(new Date(class28.method155((byte) 127)));
                                    class172.field3017[var6++] = class66.field1214.get(1);
                                    continue;
                                }
                                if (var498 == 6304) {
                                    var6--;
                                    int var255 = class172.field3017[var6];
                                    boolean var256 = true;
                                    if (var255 < 0) {
                                        var256 = ((var255 + 1) % 4) == 0;
                                    } else if (var255 < 1582) {
                                        var256 = var255 % 4 == 0;
                                    } else if (var255 % 4 != 0) {
                                        var256 = false;
                                    } else if (var255 % 100 != 0) {
                                        var256 = true;
                                    } else if (var255 % 400 != 0) {
                                        var256 = false;
                                    }
                                    class172.field3017[var6++] = var256 ? 1 : 0;
                                    continue;
                                }
                            } else if (var498 < 6500) {
                                if (var498 == 6405) {
                                    class172.field3017[var6++] = class83.method584(-4) ? 1 : 0;
                                    continue;
                                }
                                if (var498 == 6406) {
                                    class172.field3017[var6++] = class129.method942(class175.method1248(arg1, -121)) ? 1 : 0;
                                    continue;
                                }
                            } else if (var498 < 6600) {
                                if (var498 == 6500) {
                                    if (class199.field3609 == 10 && class101.field1762 == 0 && class68.field1239 == 0 && class283.field5078 == 0) {
                                        class172.field3017[var6++] = class58.method338((byte) -44) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class172.field3017[var6++] = 1;
                                    continue;
                                }
                                if (var498 == 6501) {
                                    class288 var240 = class63.method402(arg1 ^ 0x31B);
                                    if (var240 == null) {
                                        class172.field3017[var6++] = -1;
                                        class172.field3017[var6++] = 0;
                                        class69.field1258[var7++] = class56.field928;
                                        class172.field3017[var6++] = 0;
                                        class69.field1258[var7++] = class56.field928;
                                        class172.field3017[var6++] = 0;
                                    } else {
                                        class172.field3017[var6++] = var240.field5140;
                                        class172.field3017[var6++] = var240.field914;
                                        class69.field1258[var7++] = var240.field5152;
                                        class49 var241 = var240.method1970(false);
                                        class172.field3017[var6++] = var241.field787;
                                        class69.field1258[var7++] = var241.field783;
                                        class172.field3017[var6++] = var240.field919;
                                    }
                                    continue;
                                }
                                if (var498 == 6502) {
                                    class288 var242 = class273.method1812((byte) -126);
                                    if (var242 == null) {
                                        class172.field3017[var6++] = -1;
                                        class172.field3017[var6++] = 0;
                                        class69.field1258[var7++] = class56.field928;
                                        class172.field3017[var6++] = 0;
                                        class69.field1258[var7++] = class56.field928;
                                        class172.field3017[var6++] = 0;
                                    } else {
                                        class172.field3017[var6++] = var242.field5140;
                                        class172.field3017[var6++] = var242.field914;
                                        class69.field1258[var7++] = var242.field5152;
                                        class49 var243 = var242.method1970(false);
                                        class172.field3017[var6++] = var243.field787;
                                        class69.field1258[var7++] = var243.field783;
                                        class172.field3017[var6++] = var242.field919;
                                    }
                                    continue;
                                }
                                if (var498 == 6503) {
                                    var6--;
                                    int var244 = class172.field3017[var6];
                                    if (class199.field3609 == 10 && class101.field1762 == 0 && class68.field1239 == 0 && class283.field5078 == 0) {
                                        class172.field3017[var6++] = class254.method1727(var244, -25805) ? 1 : 0;
                                        continue;
                                    }
                                    class172.field3017[var6++] = 0;
                                    continue;
                                }
                                if (var498 == 6504) {
                                    var6--;
                                    class133.field2340 = class172.field3017[var6];
                                    class271.method1800(class169.field2967, -2);
                                    continue;
                                }
                                if (var498 == 6505) {
                                    class172.field3017[var6++] = class133.field2340;
                                    continue;
                                }
                                if (var498 == 6506) {
                                    var6--;
                                    int var245 = class172.field3017[var6];
                                    class288 var246 = class130.method948(true, var245);
                                    if (var246 == null) {
                                        class172.field3017[var6++] = -1;
                                        class69.field1258[var7++] = class56.field928;
                                        class172.field3017[var6++] = 0;
                                        class69.field1258[var7++] = class56.field928;
                                        class172.field3017[var6++] = 0;
                                    } else {
                                        class172.field3017[var6++] = var246.field914;
                                        class69.field1258[var7++] = var246.field5152;
                                        class49 var247 = var246.method1970(false);
                                        class172.field3017[var6++] = var247.field787;
                                        class69.field1258[var7++] = var247.field783;
                                        class172.field3017[var6++] = var246.field919;
                                    }
                                    continue;
                                }
                                if (var498 == 6507) {
                                    var6 -= 4;
                                    int var248 = class172.field3017[var6];
                                    int var249 = class172.field3017[var6 + 2];
                                    boolean var250 = class172.field3017[var6 + 1] == 1;
                                    boolean var251 = class172.field3017[var6 + 3] == 1;
                                    class33.method194(var249, var251, var248, arg1 ^ 0xFFFF9C94, var250);
                                    continue;
                                }
                            } else if (var498 < 6700) {
                                if (var498 == 6600) {
                                    var6--;
                                    class223.field4026 = class172.field3017[var6] == 1;
                                    class271.method1800(class169.field2967, -2);
                                    continue;
                                }
                                if (var498 == 6601) {
                                    class172.field3017[var6++] = class223.field4026 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var498 == 4300) {
                            var6 -= 2;
                            int var377 = class172.field3017[var6];
                            int var378 = class172.field3017[var6 + 1];
                            class131 var379 = class30.method176(7255, var378);
                            if (var379.method962((byte) -115)) {
                                class69.field1258[var7++] = class5.method19((byte) -59, var377).method1051(var379.field2323, false, var378);
                            } else {
                                class172.field3017[var6++] = class5.method19((byte) -59, var377).method1054(var378, 114, var379.field2320);
                            }
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var497) {
            if (var5.field3939 == null) {
                if (class106.field1843 != 0) {
                    class263.method1764(0, (byte) -116, class56.field928, class186.field3429);
                }
                class127.method931((byte) -124, "CS2 - scr:" + var5.field4006 + " op:" + var9, var497);
            } else {
                class93 var493 = class119.method885(30, -88);
                var493.method658((byte) 109, class26.field340).method658((byte) 91, var5.field3939);
                for (int var494 = class105.field1813 - 1; var494 >= 0; var494--) {
                    var493.method658((byte) 116, class76.field1425).method658((byte) 117, class92.field1621[var494].field7.field3939);
                }
                if (var9 == 40) {
                    int var495 = var10[var8];
                    var493.method658((byte) 102, class177.field3106).method658((byte) 106, class148.method1067(-7015, var495));
                }
                if (class106.field1843 != 0) {
                    class263.method1764(0, (byte) -116, class56.field928, class130.method949((byte) -77, new class93[] { class85.field1543, var5.field3939 }));
                }
                class127.method931((byte) -124, "CS2 - scr:" + var5.field4006 + " op:" + var9 + new String(var493.method642(20)), var497);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIJILod;)V")
    public final void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class91 arg10) {
        field3140++;
        class211 var13 = this.method1299(true);
        if (var13 != null) {
            var13.method106(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3115);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)Lgl;")
    public final class211 method1299(boolean arg0) {
        field3116++;
        return arg0 ? this.method1294(false, 6200) : null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIIIIZLgl;)V")
    public class178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class211 arg8) {
        this.field3124 = arg3;
        this.field3133 = arg4;
        this.field3123 = arg1;
        this.field3126 = arg5;
        this.field3143 = arg0;
        this.field3128 = arg2;
        if (arg6 != -1) {
            this.field3136 = class131.method964(arg6, true);
            this.field3117 = 0;
            if (this.field3136.field479.length > 1) {
                this.field3141 = 1;
            } else {
                this.field3141 = 0;
            }
            this.field3130 = 1;
            this.field3138 = class275.field4921 - 1;
            if (this.field3136.field471 == 0 && arg8 != null && arg8 instanceof class178) {
                class178 var10 = (class178) arg8;
                if (this.field3136 == var10.field3136) {
                    this.field3130 = var10.field3130;
                    this.field3141 = var10.field3141;
                    this.field3117 = var10.field3117;
                    this.field3138 = var10.field3138;
                    return;
                }
            }
            if (arg7 && this.field3136.field489 != -1) {
                this.field3117 = (int) ((double) this.field3136.field479.length * Math.random());
                this.field3141 = this.field3117 + 1;
                if (this.field3141 >= this.field3136.field479.length) {
                    this.field3141 -= this.field3136.field489;
                    if (this.field3141 < 0 || this.field3141 >= this.field3136.field479.length) {
                        this.field3141 = -1;
                    }
                }
                this.field3130 = (int) (Math.random() * (double) this.field3136.field486[this.field3117]) + 1;
                this.field3138 = class275.field4921 - this.field3130;
            }
        }
        if (arg8 == null) {
            class240 var11 = class34.method197(-124, this.field3143);
            if (var11.field4275 != null) {
                this.field3119 = true;
                return;
            }
        }
    }
}
