import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class162 extends class122 {

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    private int field3112;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    private int field3101;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    private int field3106;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
    private int field3108;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    private int field3100;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    private int field3103;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "Lic;")
    private class77 field3102;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
    private int field3107;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    private int field3105;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "Lai;")
    public static class10 field3099 = class44.method278("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", -23);

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    public static int field3111 = 0;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "Lai;")
    public static class10 field3115 = class44.method278("Hierhin gehen", 98);

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "Lc;")
    public static class21 field3114;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
    public static final void method1071(int arg0) {
        class97 var1 = class84.field1460;
        synchronized (class84.field1460) {
            int var2 = 37 % ((arg0 + 6) / 63);
            class58.field1014 = class45.field737;
            class79.field1389 = class180.field3428;
            class89.field1559 = class134.field2519;
            class25.field384 = class166.field3188;
            class172.field3330 = class11.field194;
            class5.field58 = class56.field989;
            class170.field3296 = class67.field1174;
            class166.field3188 = 0;
        }
        field3109++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIZ)Lai;")
    private static final class10 method1072(int arg0, int arg1, boolean arg2) {
        field3110++;
        if (arg1 >= -12) {
            field3115 = null;
        }
        return class149.method1024(arg2, 10, arg0, 69);
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)Lsa;")
    public final class164 method264(int arg0) {
        field3104++;
        if (this.field3102 != null) {
            int var2 = class120.field2304 - this.field3105;
            if (var2 > 100 && this.field3102.field1355 > 0) {
                var2 = 100;
            }
            label48: {
                do {
                    do {
                        if (var2 <= this.field3102.field1358[this.field3107]) {
                            break label48;
                        }
                        var2 -= this.field3102.field1358[this.field3107];
                        this.field3107++;
                    } while (this.field3107 < this.field3102.field1339.length);
                    this.field3107 -= this.field3102.field1355;
                } while (this.field3107 >= 0 && this.field3102.field1339.length > this.field3107);
                this.field3102 = null;
            }
            this.field3105 = class120.field2304 - var2;
        }
        class47 var3 = class184.method1189(this.field3100, 6);
        if (var3.field788 != null) {
            var3 = var3.method299(false);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field3112 == 1 || this.field3112 == 3) {
            var4 = var3.field804;
            var5 = var3.field792;
        } else {
            var4 = var3.field792;
            var5 = var3.field804;
        }
        int var6 = 25 / ((66 - arg0) / 59);
        int var7 = (var5 >> 1) + this.field3108;
        int var8 = this.field3108 + (var5 + 1 >> 1);
        int var9 = (var4 + 1 >> 1) + this.field3103;
        int var10 = (var4 >> 1) + this.field3103;
        int[][] var11 = class186.field3556[this.field3101];
        int var12 = var11[var7][var10] + var11[var8][var10] + var11[var7][var9] + var11[var8][var9] >> 2;
        int var13 = (this.field3103 << 7) + (var4 << 6);
        int var14 = (this.field3108 << 7) + (var5 << 6);
        return var3.method292(var14, this.field3106, this.field3107, var13, var11, var12, 0, this.field3102, this.field3112);
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V")
    public static void method1073(int arg0) {
        field3099 = null;
        field3115 = null;
        if (arg0 != -1303) {
            method1073(-119);
        }
        field3114 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILad;)V")
    public static final void method1074(int arg0, int arg1, class5 arg2) {
        Object[] var3 = arg2.field53;
        field3113++;
        int var4 = (Integer) var3[0];
        class128 var5 = class27.method174((byte) -26, var4);
        if (var5 == null) {
            return;
        }
        class142.field2673 = 0;
        int var6 = 0;
        int var7 = -1;
        int var8 = 0;
        int[] var9 = var5.field2432;
        int var10 = -89 / ((arg0 - 54) / 59);
        int[] var11 = var5.field2426;
        byte var12 = -1;
        try {
            int var13 = 0;
            class118.field2273 = new int[var5.field2418];
            class5.field51 = new class10[var5.field2425];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg2.field59;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field52;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field55 == null ? -1 : arg2.field55.field3833;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field50;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field55 == null ? -1 : arg2.field55.field3871;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field56 == null ? -1 : arg2.field56.field3833;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field56 == null ? -1 : arg2.field56.field3871;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field60;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field49;
                    }
                    class118.field2273[var13++] = var16;
                } else if (var3[var15] instanceof class10) {
                    class10 var17 = (class10) var3[var15];
                    if (var17.method64(-99, class189.field3610)) {
                        var17 = arg2.field57;
                    }
                    class5.field51[var14++] = var17;
                }
            }
            int var18 = 0;
            label2181: while (true) {
                var18++;
                if (arg1 < var18) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var312 = var9[var7];
                if (var312 < 100) {
                    if (var312 == 0) {
                        class5.field62[var6++] = var11[var7];
                        continue;
                    }
                    if (var312 == 1) {
                        int var19 = var11[var7];
                        class5.field62[var6++] = class13.field215[var19];
                        continue;
                    }
                    if (var312 == 2) {
                        int var20 = var11[var7];
                        var6--;
                        class13.field215[var20] = class5.field62[var6];
                        continue;
                    }
                    if (var312 == 3) {
                        class40.field666[var8++] = var5.field2436[var7];
                        continue;
                    }
                    if (var312 == 6) {
                        var7 += var11[var7];
                        continue;
                    }
                    if (var312 == 7) {
                        var6 -= 2;
                        if (class5.field62[var6 + 1] != class5.field62[var6]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var312 == 8) {
                        var6 -= 2;
                        if (class5.field62[var6 + 1] == class5.field62[var6]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var312 == 9) {
                        var6 -= 2;
                        if (class5.field62[var6 + 1] > class5.field62[var6]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var312 == 10) {
                        var6 -= 2;
                        if (class5.field62[var6] > class5.field62[var6 + 1]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var312 == 21) {
                        if (class142.field2673 == 0) {
                            return;
                        }
                        class176 var21 = class66.field1156[--class142.field2673];
                        class118.field2273 = var21.field3377;
                        var5 = var21.field3370;
                        var11 = var5.field2426;
                        var7 = var21.field3378;
                        var9 = var5.field2432;
                        class5.field51 = var21.field3371;
                        continue;
                    }
                    if (var312 == 25) {
                        int var22 = var11[var7];
                        class5.field62[var6++] = class207.method1336((byte) 82, var22);
                        continue;
                    }
                    if (var312 == 27) {
                        int var23 = var11[var7];
                        var6--;
                        class25.method169(var23, (byte) -88, class5.field62[var6]);
                        continue;
                    }
                    if (var312 == 31) {
                        var6 -= 2;
                        if (class5.field62[var6 + 1] >= class5.field62[var6]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var312 == 32) {
                        var6 -= 2;
                        if (class5.field62[var6 + 1] <= class5.field62[var6]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var312 == 33) {
                        class5.field62[var6++] = class118.field2273[var11[var7]];
                        continue;
                    }
                    int var10001;
                    if (var312 == 34) {
                        var10001 = var11[var7];
                        var6--;
                        class118.field2273[var10001] = class5.field62[var6];
                        continue;
                    }
                    if (var312 == 35) {
                        class40.field666[var8++] = class5.field51[var11[var7]];
                        continue;
                    }
                    if (var312 == 36) {
                        var10001 = var11[var7];
                        var8--;
                        class5.field51[var10001] = class40.field666[var8];
                        continue;
                    }
                    if (var312 == 37) {
                        int var24 = var11[var7];
                        var8 -= var24;
                        class10 var25 = class193.method1234(-105, var24, class40.field666, var8);
                        class40.field666[var8++] = var25;
                        continue;
                    }
                    if (var312 == 38) {
                        var6--;
                        continue;
                    }
                    if (var312 == 39) {
                        var8--;
                        continue;
                    }
                    if (var312 == 40) {
                        int var26 = var11[var7];
                        class128 var27 = class27.method174((byte) -26, var26);
                        int[] var28 = new int[var27.field2418];
                        class10[] var29 = new class10[var27.field2425];
                        for (int var30 = 0; var30 < var27.field2421; var30++) {
                            var28[var30] = class5.field62[var6 + var30 - var27.field2421];
                        }
                        for (int var31 = 0; var31 < var27.field2430; var31++) {
                            var29[var31] = class40.field666[var31 + var8 - var27.field2430];
                        }
                        var6 -= var27.field2421;
                        var8 -= var27.field2430;
                        class176 var32 = new class176();
                        var32.field3370 = var5;
                        var32.field3377 = class118.field2273;
                        var32.field3371 = class5.field51;
                        var32.field3378 = var7;
                        if (class142.field2673 >= class66.field1156.length) {
                            throw new RuntimeException();
                        }
                        var5 = var27;
                        class66.field1156[class142.field2673++] = var32;
                        class118.field2273 = var28;
                        var7 = -1;
                        var9 = var27.field2432;
                        class5.field51 = var29;
                        var11 = var27.field2426;
                        continue;
                    }
                    if (var312 == 42) {
                        class5.field62[var6++] = class152.field2918[var11[var7]];
                        continue;
                    }
                    if (var312 == 43) {
                        var10001 = var11[var7];
                        var6--;
                        class152.field2918[var10001] = class5.field62[var6];
                        continue;
                    }
                    if (var312 == 44) {
                        var6--;
                        int var33 = class5.field62[var6];
                        int var34 = var11[var7] & 0xFFFF;
                        int var35 = var11[var7] >> 16;
                        if (var33 >= 0 && var33 <= 5000) {
                            class102.field1910[var35] = var33;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var33 <= var37) {
                                    continue label2181;
                                }
                                class157.field3029[var35][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var312 == 45) {
                        int var38 = var11[var7];
                        var6--;
                        int var39 = class5.field62[var6];
                        if (var39 >= 0 && class102.field1910[var38] > var39) {
                            class5.field62[var6++] = class157.field3029[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var312 == 46) {
                        var6 -= 2;
                        int var40 = var11[var7];
                        int var41 = class5.field62[var6];
                        if (var41 >= 0 && var41 < class102.field1910[var40]) {
                            class157.field3029[var40][var41] = class5.field62[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var312 == 47) {
                        class10 var42 = class194.field3689[var11[var7]];
                        if (var42 == null) {
                            var42 = class120.field2315;
                        }
                        class40.field666[var8++] = var42;
                        continue;
                    }
                    if (var312 == 48) {
                        var10001 = var11[var7];
                        var8--;
                        class194.field3689[var10001] = class40.field666[var8];
                        continue;
                    }
                }
                boolean var43;
                if (var11[var7] == 1) {
                    var43 = true;
                } else {
                    var43 = false;
                }
                if (var312 < 1000) {
                    if (var312 == 100) {
                        var6 -= 3;
                        int var292 = class5.field62[var6 + 1];
                        int var293 = class5.field62[var6 + 2];
                        int var294 = class5.field62[var6];
                        if (var292 == 0) {
                            throw new RuntimeException();
                        }
                        class200 var295 = class66.method432(var294, false);
                        if (var295.field3796 == null) {
                            var295.field3796 = new class200[var293 + 1];
                        }
                        if (var295.field3796.length <= var293) {
                            class200[] var296 = new class200[var293 + 1];
                            for (int var297 = 0; var297 < var295.field3796.length; var297++) {
                                var296[var297] = var295.field3796[var297];
                            }
                            var295.field3796 = var296;
                        }
                        if (var293 > 0 && var295.field3796[var293 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var293 - 1));
                        }
                        class200 var298 = new class200();
                        var298.field3927 = true;
                        var298.field3871 = var293;
                        var298.field3888 = var292;
                        var298.field3794 = var298.field3833 = var295.field3833;
                        var295.field3796[var293] = var298;
                        if (var43) {
                            class145.field2778 = var298;
                        } else {
                            class115.field2214 = var298;
                        }
                        class168.method1116(var295, -96);
                        continue;
                    }
                    if (var312 == 101) {
                        class200 var299 = var43 ? class145.field2778 : class115.field2214;
                        if (var299.field3871 == -1) {
                            if (var43) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class200 var300 = class66.method432(var299.field3833, false);
                        var300.field3796[var299.field3871] = null;
                        class168.method1116(var300, -108);
                        continue;
                    }
                    if (var312 == 102) {
                        var6--;
                        class200 var301 = class66.method432(class5.field62[var6], false);
                        var301.field3796 = null;
                        class168.method1116(var301, -80);
                        continue;
                    }
                    if (var312 == 200) {
                        var6 -= 2;
                        int var302 = class5.field62[var6];
                        int var303 = class5.field62[var6 + 1];
                        class200 var304 = class82.method507((byte) 118, var302, var303);
                        if (var304 != null && var303 != -1) {
                            class5.field62[var6++] = 1;
                            if (var43) {
                                class145.field2778 = var304;
                            } else {
                                class115.field2214 = var304;
                            }
                            continue;
                        }
                        class5.field62[var6++] = 0;
                        continue;
                    }
                    if (var312 == 201) {
                        var6--;
                        int var305 = class5.field62[var6];
                        class200 var306 = class66.method432(var305, false);
                        if (var306 == null) {
                            class5.field62[var6++] = 0;
                        } else {
                            class5.field62[var6++] = 1;
                            if (var43) {
                                class145.field2778 = var306;
                            } else {
                                class115.field2214 = var306;
                            }
                        }
                        continue;
                    }
                } else if (var312 >= 1000 && var312 < 1100 || !(var312 < 2000 || var312 >= 2100)) {
                    class200 var44;
                    if (var312 < 2000) {
                        var44 = var43 ? class145.field2778 : class115.field2214;
                    } else {
                        var6--;
                        var44 = class66.method432(class5.field62[var6], false);
                        var312 -= 1000;
                    }
                    if (var312 == 1000) {
                        var6 -= 2;
                        var44.field3822 = class5.field62[var6];
                        var44.field3842 = class5.field62[var6 + 1];
                        class168.method1116(var44, -97);
                        continue;
                    }
                    if (var312 == 1001) {
                        var6 -= 2;
                        var44.field3845 = class5.field62[var6];
                        var44.field3925 = class5.field62[var6 + 1];
                        class168.method1116(var44, -99);
                        continue;
                    }
                    if (var312 == 1003) {
                        var6--;
                        boolean var45 = class5.field62[var6] == 1;
                        if (var45 != var44.field3768) {
                            var44.field3768 = var45;
                            class168.method1116(var44, -87);
                        }
                        continue;
                    }
                } else if (var312 >= 1100 && var312 < 1200 || var312 >= 2100 && var312 < 2200) {
                    class200 var289;
                    if (var312 < 2000) {
                        var289 = var43 ? class145.field2778 : class115.field2214;
                    } else {
                        var6--;
                        var289 = class66.method432(class5.field62[var6], false);
                        var312 -= 1000;
                    }
                    if (var312 == 1100) {
                        var6 -= 2;
                        var289.field3829 = class5.field62[var6];
                        if (var289.field3829 > var289.field3890 - var289.field3845) {
                            var289.field3829 = var289.field3890 - var289.field3845;
                        }
                        if (var289.field3829 < 0) {
                            var289.field3829 = 0;
                        }
                        var289.field3907 = class5.field62[var6 + 1];
                        if (var289.field3873 - var289.field3925 < var289.field3907) {
                            var289.field3907 = var289.field3873 - var289.field3925;
                        }
                        if (var289.field3907 < 0) {
                            var289.field3907 = 0;
                        }
                        class168.method1116(var289, -75);
                        continue;
                    }
                    if (var312 == 1101) {
                        var6--;
                        var289.field3800 = class5.field62[var6];
                        class168.method1116(var289, -104);
                        continue;
                    }
                    if (var312 == 1102) {
                        var6--;
                        var289.field3783 = class5.field62[var6] == 1;
                        class168.method1116(var289, -90);
                        continue;
                    }
                    if (var312 == 1103) {
                        var6--;
                        var289.field3899 = class5.field62[var6];
                        class168.method1116(var289, -126);
                        continue;
                    }
                    if (var312 == 1104) {
                        var6--;
                        var289.field3881 = class5.field62[var6];
                        class168.method1116(var289, -85);
                        continue;
                    }
                    if (var312 == 1105) {
                        var6--;
                        var289.field3915 = class5.field62[var6];
                        class168.method1116(var289, -83);
                        continue;
                    }
                    if (var312 == 1106) {
                        var6--;
                        var289.field3876 = class5.field62[var6];
                        class168.method1116(var289, -125);
                        continue;
                    }
                    if (var312 == 1107) {
                        var6--;
                        var289.field3885 = class5.field62[var6] == 1;
                        class168.method1116(var289, -128);
                        continue;
                    }
                    if (var312 == 1108) {
                        var289.field3841 = 1;
                        var6--;
                        var289.field3788 = class5.field62[var6];
                        class168.method1116(var289, -89);
                        continue;
                    }
                    if (var312 == 1109) {
                        var6 -= 6;
                        var289.field3862 = class5.field62[var6];
                        var289.field3902 = class5.field62[var6 + 1];
                        var289.field3827 = class5.field62[var6 + 2];
                        var289.field3909 = class5.field62[var6 + 3];
                        var289.field3825 = class5.field62[var6 + 4];
                        var289.field3807 = class5.field62[var6 + 5];
                        class168.method1116(var289, -99);
                        continue;
                    }
                    if (var312 == 1110) {
                        var6--;
                        int var290 = class5.field62[var6];
                        if (var289.field3920 != var290) {
                            var289.field3860 = 0;
                            var289.field3893 = 0;
                            var289.field3920 = var290;
                            class168.method1116(var289, -96);
                        }
                        continue;
                    }
                    if (var312 == 1111) {
                        var6--;
                        var289.field3853 = class5.field62[var6] == 1;
                        class168.method1116(var289, -84);
                        continue;
                    }
                    if (var312 == 1112) {
                        var8--;
                        class10 var291 = class40.field666[var8];
                        if (!var291.method64(-64, var289.field3922)) {
                            var289.field3922 = var291;
                            class168.method1116(var289, -112);
                        }
                        continue;
                    }
                    if (var312 == 1113) {
                        var6--;
                        var289.field3773 = class5.field62[var6];
                        class168.method1116(var289, -79);
                        continue;
                    }
                    if (var312 == 1114) {
                        var6 -= 3;
                        var289.field3867 = class5.field62[var6];
                        var289.field3848 = class5.field62[var6 + 1];
                        var289.field3874 = class5.field62[var6 + 2];
                        class168.method1116(var289, -112);
                        continue;
                    }
                    if (var312 == 1115) {
                        var6--;
                        var289.field3818 = class5.field62[var6] == 1;
                        class168.method1116(var289, -123);
                        continue;
                    }
                    if (var312 == 1116) {
                        var6--;
                        var289.field3864 = class5.field62[var6];
                        class168.method1116(var289, -108);
                        continue;
                    }
                    if (var312 == 1117) {
                        var6--;
                        var289.field3836 = class5.field62[var6];
                        class168.method1116(var289, -127);
                        continue;
                    }
                    if (var312 == 1118) {
                        var6--;
                        var289.field3820 = class5.field62[var6] == 1;
                        class168.method1116(var289, -76);
                        continue;
                    }
                    if (var312 == 1119) {
                        var6--;
                        var289.field3914 = class5.field62[var6] == 1;
                        class168.method1116(var289, -89);
                        continue;
                    }
                    if (var312 == 1120) {
                        var6 -= 2;
                        var289.field3890 = class5.field62[var6];
                        var289.field3873 = class5.field62[var6 + 1];
                        class168.method1116(var289, -94);
                        continue;
                    }
                } else if (var312 >= 1200 && var312 < 1300 || !(var312 < 2200 || var312 >= 2300)) {
                    class200 var285;
                    if (var312 < 2000) {
                        var285 = var43 ? class145.field2778 : class115.field2214;
                    } else {
                        var6--;
                        var285 = class66.method432(class5.field62[var6], false);
                        var312 -= 1000;
                    }
                    class168.method1116(var285, -107);
                    if (var312 == 1200) {
                        var6 -= 2;
                        int var286 = class5.field62[var6 + 1];
                        int var287 = class5.field62[var6];
                        var285.field3919 = var286;
                        var285.field3766 = var287;
                        class94 var288 = class104.method678(500, var287);
                        var285.field3807 = var288.field1703;
                        var285.field3825 = var288.field1731;
                        var285.field3827 = var288.field1735;
                        if (var285.field3845 > 0) {
                            var285.field3807 = var285.field3807 * 32 / var285.field3845;
                        }
                        var285.field3902 = var288.field1697;
                        var285.field3862 = var288.field1700;
                        var285.field3909 = var288.field1722;
                        continue;
                    }
                    if (var312 == 1201) {
                        var285.field3841 = 2;
                        var6--;
                        var285.field3788 = class5.field62[var6];
                        continue;
                    }
                    if (var312 == 1202) {
                        var285.field3841 = 3;
                        var285.field3788 = class145.field2767.field609.method832((byte) 84);
                        continue;
                    }
                    if (var312 == 1203) {
                        var285.field3841 = 6;
                        var6--;
                        var285.field3788 = class5.field62[var6];
                        continue;
                    }
                    if (var312 == 1204) {
                        var285.field3841 = 5;
                        var6--;
                        var285.field3788 = class5.field62[var6];
                        continue;
                    }
                } else if ((var312 < 1300 || var312 >= 1400) && (var312 < 2300 || var312 >= 2400)) {
                    if (var312 >= 1400 && var312 < 1500 || var312 >= 2400 && var312 < 2500) {
                        class200 var46;
                        if (var312 < 2000) {
                            var46 = var43 ? class145.field2778 : class115.field2214;
                        } else {
                            var6--;
                            var46 = class66.method432(class5.field62[var6], false);
                            var312 -= 1000;
                        }
                        var8--;
                        class10 var47 = class40.field666[var8];
                        int[] var48 = null;
                        if (var47.method40((byte) -66) > 0 && var47.method61(var47.method40((byte) 87) - 1, -1) == 89) {
                            var6--;
                            int var49 = class5.field62[var6];
                            if (var49 > 0) {
                                var48 = new int[var49];
                                while (var49-- > 0) {
                                    var6--;
                                    var48[var49] = class5.field62[var6];
                                }
                            }
                            var47 = var47.method44(var47.method40((byte) 83) - 1, 0, (byte) -94);
                        }
                        Object[] var50 = new Object[var47.method40((byte) -125) + 1];
                        for (int var51 = var50.length - 1; var51 >= 1; var51--) {
                            if (var47.method61(var51 - 1, -1) == 115) {
                                var8--;
                                var50[var51] = class40.field666[var8];
                            } else {
                                var6--;
                                var50[var51] = Integer.valueOf(class5.field62[var6]);
                            }
                        }
                        var6--;
                        int var52 = class5.field62[var6];
                        if (var52 == -1) {
                            var50 = null;
                        } else {
                            var50[0] = Integer.valueOf(var52);
                        }
                        var46.field3851 = true;
                        if (var312 == 1402) {
                            var46.field3843 = var50;
                        }
                        if (var312 == 1404) {
                            var46.field3903 = var50;
                        }
                        if (var312 == 1401) {
                            var46.field3784 = var50;
                        }
                        if (var312 == 1417) {
                            var46.field3906 = var50;
                        }
                        if (var312 == 1422) {
                            var46.field3769 = var50;
                        }
                        if (var312 == 1416) {
                            var46.field3790 = var50;
                        }
                        if (var312 == 1421) {
                            var46.field3834 = var50;
                        }
                        if (var312 == 1409) {
                            var46.field3762 = var50;
                        }
                        if (var312 == 1414) {
                            var46.field3896 = var48;
                            var46.field3798 = var50;
                        }
                        if (var312 == 1425) {
                            var46.field3897 = var50;
                        }
                        if (var312 == 1415) {
                            var46.field3835 = var48;
                            var46.field3826 = var50;
                        }
                        if (var312 == 1410) {
                            var46.field3891 = var50;
                        }
                        if (var312 == 1406) {
                            var46.field3911 = var50;
                        }
                        if (var312 == 1419) {
                            var46.field3855 = var50;
                        }
                        if (var312 == 1423) {
                            var46.field3801 = var50;
                        }
                        if (var312 == 1405) {
                            var46.field3819 = var50;
                        }
                        if (var312 == 1418) {
                            var46.field3823 = var50;
                        }
                        if (var312 == 1408) {
                            var46.field3856 = var50;
                        }
                        if (var312 == 1424) {
                            var46.field3878 = var50;
                        }
                        if (var312 == 1420) {
                            var46.field3824 = var50;
                        }
                        if (var312 == 1412) {
                            var46.field3808 = var50;
                        }
                        if (var312 == 1407) {
                            var46.field3852 = var50;
                            var46.field3863 = var48;
                        }
                        if (var312 == 1400) {
                            var46.field3832 = var50;
                        }
                        if (var312 == 1403) {
                            var46.field3875 = var50;
                        }
                        if (var312 == 1411) {
                            var46.field3846 = var50;
                        }
                        continue;
                    }
                    if (var312 < 1600) {
                        class200 var53 = var43 ? class145.field2778 : class115.field2214;
                        if (var312 == 1500) {
                            class5.field62[var6++] = var53.field3822;
                            continue;
                        }
                        if (var312 == 1501) {
                            class5.field62[var6++] = var53.field3842;
                            continue;
                        }
                        if (var312 == 1502) {
                            class5.field62[var6++] = var53.field3845;
                            continue;
                        }
                        if (var312 == 1503) {
                            class5.field62[var6++] = var53.field3925;
                            continue;
                        }
                        if (var312 == 1504) {
                            class5.field62[var6++] = var53.field3768 ? 1 : 0;
                            continue;
                        }
                        if (var312 == 1505) {
                            class5.field62[var6++] = var53.field3794;
                            continue;
                        }
                    } else if (var312 < 1700) {
                        class200 var280 = var43 ? class145.field2778 : class115.field2214;
                        if (var312 == 1600) {
                            class5.field62[var6++] = var280.field3829;
                            continue;
                        }
                        if (var312 == 1601) {
                            class5.field62[var6++] = var280.field3907;
                            continue;
                        }
                        if (var312 == 1602) {
                            class40.field666[var8++] = var280.field3922;
                            continue;
                        }
                        if (var312 == 1603) {
                            class5.field62[var6++] = var280.field3890;
                            continue;
                        }
                        if (var312 == 1604) {
                            class5.field62[var6++] = var280.field3873;
                            continue;
                        }
                        if (var312 == 1605) {
                            class5.field62[var6++] = var280.field3807;
                            continue;
                        }
                        if (var312 == 1606) {
                            class5.field62[var6++] = var280.field3827;
                            continue;
                        }
                        if (var312 == 1607) {
                            class5.field62[var6++] = var280.field3825;
                            continue;
                        }
                        if (var312 == 1608) {
                            class5.field62[var6++] = var280.field3909;
                            continue;
                        }
                        if (var312 == 1609) {
                            class5.field62[var6++] = var280.field3899;
                            continue;
                        }
                    } else if (var312 < 1800) {
                        class200 var279 = var43 ? class145.field2778 : class115.field2214;
                        if (var312 == 1700) {
                            class5.field62[var6++] = var279.field3766;
                            continue;
                        }
                        if (var312 == 1701) {
                            if (var279.field3766 == -1) {
                                class5.field62[var6++] = 0;
                            } else {
                                class5.field62[var6++] = var279.field3919;
                            }
                            continue;
                        }
                        if (var312 == 1702) {
                            class5.field62[var6++] = var279.field3871;
                            continue;
                        }
                    } else if (var312 < 1900) {
                        class200 var54 = var43 ? class145.field2778 : class115.field2214;
                        if (var312 == 1800) {
                            class5.field62[var6++] = class166.method1102((byte) 81, class203.method1318(0, var54));
                            continue;
                        }
                        if (var312 == 1801) {
                            var6--;
                            int var55 = class5.field62[var6];
                            int var313 = var55 - 1;
                            if (var54.field3780 != null && var313 < var54.field3780.length && var54.field3780[var313] != null) {
                                class40.field666[var8++] = var54.field3780[var313];
                                continue;
                            }
                            class40.field666[var8++] = class76.field1328;
                            continue;
                        }
                        if (var312 == 1802) {
                            if (var54.field3792 == null) {
                                class40.field666[var8++] = class76.field1328;
                            } else {
                                class40.field666[var8++] = var54.field3792;
                            }
                            continue;
                        }
                    } else if (var312 < 2600) {
                        var6--;
                        class200 var278 = class66.method432(class5.field62[var6], false);
                        if (var312 == 2500) {
                            class5.field62[var6++] = var278.field3822;
                            continue;
                        }
                        if (var312 == 2501) {
                            class5.field62[var6++] = var278.field3842;
                            continue;
                        }
                        if (var312 == 2502) {
                            class5.field62[var6++] = var278.field3845;
                            continue;
                        }
                        if (var312 == 2503) {
                            class5.field62[var6++] = var278.field3925;
                            continue;
                        }
                        if (var312 == 2504) {
                            class5.field62[var6++] = var278.field3768 ? 1 : 0;
                            continue;
                        }
                        if (var312 == 2505) {
                            class5.field62[var6++] = var278.field3794;
                            continue;
                        }
                    } else if (var312 < 2700) {
                        var6--;
                        class200 var56 = class66.method432(class5.field62[var6], false);
                        if (var312 == 2600) {
                            class5.field62[var6++] = var56.field3829;
                            continue;
                        }
                        if (var312 == 2601) {
                            class5.field62[var6++] = var56.field3907;
                            continue;
                        }
                        if (var312 == 2602) {
                            class40.field666[var8++] = var56.field3922;
                            continue;
                        }
                        if (var312 == 2603) {
                            class5.field62[var6++] = var56.field3890;
                            continue;
                        }
                        if (var312 == 2604) {
                            class5.field62[var6++] = var56.field3873;
                            continue;
                        }
                        if (var312 == 2605) {
                            class5.field62[var6++] = var56.field3807;
                            continue;
                        }
                        if (var312 == 2606) {
                            class5.field62[var6++] = var56.field3827;
                            continue;
                        }
                        if (var312 == 2607) {
                            class5.field62[var6++] = var56.field3825;
                            continue;
                        }
                        if (var312 == 2608) {
                            class5.field62[var6++] = var56.field3909;
                            continue;
                        }
                        if (var312 == 2609) {
                            class5.field62[var6++] = var56.field3899;
                            continue;
                        }
                    } else if (var312 < 2800) {
                        if (var312 == 2700) {
                            var6--;
                            class200 var57 = class66.method432(class5.field62[var6], false);
                            class5.field62[var6++] = var57.field3766;
                            continue;
                        }
                        if (var312 == 2701) {
                            var6--;
                            class200 var58 = class66.method432(class5.field62[var6], false);
                            if (var58.field3766 == -1) {
                                class5.field62[var6++] = 0;
                            } else {
                                class5.field62[var6++] = var58.field3919;
                            }
                            continue;
                        }
                        if (var312 == 2702) {
                            var6--;
                            int var59 = class5.field62[var6];
                            class118 var60 = (class118) class165.field3162.method213(-74, (long) var59);
                            if (var60 == null) {
                                class5.field62[var6++] = 0;
                            } else {
                                class5.field62[var6++] = 1;
                            }
                            continue;
                        }
                        if (var312 == 2703) {
                            var6--;
                            class200 var61 = class66.method432(class5.field62[var6], false);
                            if (var61.field3796 == null) {
                                class5.field62[var6++] = 0;
                                continue;
                            }
                            int var62 = var61.field3796.length;
                            for (int var63 = 0; var63 < var61.field3796.length; var63++) {
                                if (var61.field3796[var63] == null) {
                                    var62 = var63;
                                    break;
                                }
                            }
                            class5.field62[var6++] = var62;
                            continue;
                        }
                        if (var312 == 2704 || var312 == 2705) {
                            var6 -= 2;
                            int var64 = class5.field62[var6 + 1];
                            int var65 = class5.field62[var6];
                            class118 var66 = (class118) class165.field3162.method213(118, (long) var65);
                            if (var66 != null && var66.field2272 == var64) {
                                class5.field62[var6++] = 1;
                                continue;
                            }
                            class5.field62[var6++] = 0;
                            continue;
                        }
                    } else if (var312 < 2900) {
                        var6--;
                        class200 var276 = class66.method432(class5.field62[var6], false);
                        if (var312 == 2800) {
                            class5.field62[var6++] = class166.method1102((byte) 126, class203.method1318(0, var276));
                            continue;
                        }
                        if (var312 == 2801) {
                            var6--;
                            int var277 = class5.field62[var6];
                            int var314 = var277 - 1;
                            if (var276.field3780 != null && var276.field3780.length > var314 && var276.field3780[var314] != null) {
                                class40.field666[var8++] = var276.field3780[var314];
                                continue;
                            }
                            class40.field666[var8++] = class76.field1328;
                            continue;
                        }
                        if (var312 == 2802) {
                            if (var276.field3792 == null) {
                                class40.field666[var8++] = class76.field1328;
                            } else {
                                class40.field666[var8++] = var276.field3792;
                            }
                            continue;
                        }
                    } else if (var312 < 3200) {
                        if (var312 == 3100) {
                            var8--;
                            class10 var261 = class40.field666[var8];
                            class6.method20(0, var261, (byte) 117, class76.field1328);
                            continue;
                        }
                        if (var312 == 3101) {
                            var6 -= 2;
                            class65.method426(0, class5.field62[var6 + 1], class5.field62[var6], class145.field2767);
                            continue;
                        }
                        if (var312 == 3103) {
                            class139.method949(-1);
                            continue;
                        }
                        if (var312 == 3104) {
                            class63.field1056++;
                            var8--;
                            class10 var262 = class40.field666[var8];
                            int var263 = 0;
                            if (var262.method49(false)) {
                                var263 = var262.method55((byte) -96);
                            }
                            class76.field1323.method635((byte) -54, 95);
                            class76.field1323.method786(var263, (byte) -83);
                            continue;
                        }
                        if (var312 == 3105) {
                            var8--;
                            class10 var264 = class40.field666[var8];
                            class134.field2515++;
                            class76.field1323.method635((byte) -108, 253);
                            class76.field1323.method783(var264.method62((byte) -74), -23);
                            continue;
                        }
                        if (var312 == 3106) {
                            class45.field743++;
                            var8--;
                            class10 var265 = class40.field666[var8];
                            class76.field1323.method635((byte) -113, 128);
                            class76.field1323.method781(0, var265.method40((byte) -42) + 1);
                            class76.field1323.method769(0, var265);
                            continue;
                        }
                        if (var312 == 3107) {
                            var6--;
                            int var266 = class5.field62[var6];
                            var8--;
                            class10 var267 = class40.field666[var8];
                            class155.method1051(var266, (byte) -77, var267);
                            continue;
                        }
                        if (var312 == 3108) {
                            var6 -= 3;
                            int var268 = class5.field62[var6 + 2];
                            int var269 = class5.field62[var6 + 1];
                            int var270 = class5.field62[var6];
                            class200 var271 = class66.method432(var268, false);
                            class77.method473(var270, -7, var271, var269);
                            continue;
                        }
                        if (var312 == 3109) {
                            var6 -= 2;
                            class200 var272 = var43 ? class145.field2778 : class115.field2214;
                            int var273 = class5.field62[var6];
                            int var274 = class5.field62[var6 + 1];
                            class77.method473(var273, -7, var272, var274);
                            continue;
                        }
                        if (var312 == 3110) {
                            class183.field3479++;
                            var6--;
                            int var275 = class5.field62[var6];
                            class76.field1323.method635((byte) -79, 201);
                            class76.field1323.method793(88, var275);
                            continue;
                        }
                    } else if (var312 < 3300) {
                        if (var312 == 3200) {
                            var6 -= 3;
                            class130.method907(21, class5.field62[var6 + 2], class5.field62[var6 + 1], class5.field62[var6]);
                            continue;
                        }
                        if (var312 == 3201) {
                            var6--;
                            class106.method684(class5.field62[var6], 26415);
                            continue;
                        }
                        if (var312 == 3202) {
                            var6 -= 2;
                            class98.method645(class5.field62[var6], class5.field62[var6 + 1], 0);
                            continue;
                        }
                    } else if (var312 < 3400) {
                        if (var312 == 3300) {
                            class5.field62[var6++] = class120.field2304;
                            continue;
                        }
                        if (var312 == 3301) {
                            var6 -= 2;
                            int var239 = class5.field62[var6];
                            int var240 = class5.field62[var6 + 1];
                            class5.field62[var6++] = class82.method506(var239, (byte) -37, var240);
                            continue;
                        }
                        if (var312 == 3302) {
                            var6 -= 2;
                            int var241 = class5.field62[var6];
                            int var242 = class5.field62[var6 + 1];
                            class5.field62[var6++] = class87.method531(var241, 64, var242);
                            continue;
                        }
                        if (var312 == 3303) {
                            var6 -= 2;
                            int var243 = class5.field62[var6 + 1];
                            int var244 = class5.field62[var6];
                            class5.field62[var6++] = class35.method237(var244, var243, -128);
                            continue;
                        }
                        if (var312 == 3304) {
                            var6--;
                            int var245 = class5.field62[var6];
                            class5.field62[var6++] = class193.method1238(var245, 1).field1984;
                            continue;
                        }
                        if (var312 == 3305) {
                            var6--;
                            int var246 = class5.field62[var6];
                            class5.field62[var6++] = class172.field3319[var246];
                            continue;
                        }
                        if (var312 == 3306) {
                            var6--;
                            int var247 = class5.field62[var6];
                            class5.field62[var6++] = class107.field1991[var247];
                            continue;
                        }
                        if (var312 == 3307) {
                            var6--;
                            int var248 = class5.field62[var6];
                            class5.field62[var6++] = class65.field1135[var248];
                            continue;
                        }
                        if (var312 == 3308) {
                            int var249 = (class145.field2767.field1100 >> 7) + class2.field16;
                            int var250 = (class145.field2767.field1097 >> 7) + class200.field3767;
                            int var251 = class42.field687;
                            class5.field62[var6++] = (var249 << 14) + (var251 << 28) + var250;
                            continue;
                        }
                        if (var312 == 3309) {
                            var6--;
                            int var252 = class5.field62[var6];
                            class5.field62[var6++] = class123.method861(16383, var252 >> 14);
                            continue;
                        }
                        if (var312 == 3310) {
                            var6--;
                            int var253 = class5.field62[var6];
                            class5.field62[var6++] = var253 >> 28;
                            continue;
                        }
                        if (var312 == 3311) {
                            var6--;
                            int var254 = class5.field62[var6];
                            class5.field62[var6++] = class123.method861(16383, var254);
                            continue;
                        }
                        if (var312 == 3312) {
                            class5.field62[var6++] = class25.field377 ? 1 : 0;
                            continue;
                        }
                        if (var312 == 3313) {
                            var6 -= 2;
                            int var255 = class5.field62[var6] + 32768;
                            int var256 = class5.field62[var6 + 1];
                            class5.field62[var6++] = class82.method506(var255, (byte) -37, var256);
                            continue;
                        }
                        if (var312 == 3314) {
                            var6 -= 2;
                            int var257 = class5.field62[var6 + 1];
                            int var258 = class5.field62[var6] + 32768;
                            class5.field62[var6++] = class87.method531(var258, -82, var257);
                            continue;
                        }
                        if (var312 == 3315) {
                            var6 -= 2;
                            int var259 = class5.field62[var6 + 1];
                            int var260 = class5.field62[var6] + 32768;
                            class5.field62[var6++] = class35.method237(var260, var259, -122);
                            continue;
                        }
                        if (var312 == 3316) {
                            if (class111.field2057 >= 2) {
                                class5.field62[var6++] = class111.field2057;
                            } else {
                                class5.field62[var6++] = 0;
                            }
                            continue;
                        }
                        if (var312 == 3317) {
                            class5.field62[var6++] = class37.field584;
                            continue;
                        }
                        if (var312 == 3318) {
                            class5.field62[var6++] = class191.field3630;
                            continue;
                        }
                        if (var312 == 3321) {
                            class5.field62[var6++] = class149.field2875;
                            continue;
                        }
                        if (var312 == 3322) {
                            class5.field62[var6++] = class154.field2982;
                            continue;
                        }
                        if (var312 == 3323) {
                            if (class111.field2057 == 1) {
                                class5.field62[var6++] = 1;
                            } else {
                                class5.field62[var6++] = 0;
                            }
                            continue;
                        }
                        if (var312 == 3324) {
                            if (class109.field2024 >= 5 && class109.field2024 <= 9) {
                                class5.field62[var6++] = class109.field2024;
                                continue;
                            }
                            class5.field62[var6++] = 0;
                            continue;
                        }
                        if (var312 == 3325) {
                            if (class109.field2020 > 0) {
                                class5.field62[var6++] = 1;
                            } else {
                                class5.field62[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var312 < 3500) {
                        if (var312 == 3400) {
                            var6 -= 2;
                            int var229 = class5.field62[var6];
                            int var230 = class5.field62[var6 + 1];
                            class93 var231 = class14.method89((byte) -117, var229);
                            for (int var232 = 0; var232 < var231.field1673; var232++) {
                                if (var231.field1669[var232] == var230) {
                                    class40.field666[var8++] = var231.field1671[var232];
                                    var231 = null;
                                    break;
                                }
                            }
                            if (var231 != null) {
                                class40.field666[var8++] = var231.field1678;
                            }
                            continue;
                        }
                        if (var312 == 3408) {
                            var6 -= 4;
                            int var233 = class5.field62[var6];
                            int var234 = class5.field62[var6 + 1];
                            int var235 = class5.field62[var6 + 3];
                            int var236 = class5.field62[var6 + 2];
                            class93 var237 = class14.method89((byte) -51, var236);
                            if (var237.field1674 == var233 && var237.field1689 == var234) {
                                for (int var238 = 0; var238 < var237.field1673; var238++) {
                                    if (var237.field1669[var238] == var235) {
                                        if (var234 == 115) {
                                            class40.field666[var8++] = var237.field1671[var238];
                                        } else {
                                            class5.field62[var6++] = var237.field1675[var238];
                                        }
                                        var237 = null;
                                        break;
                                    }
                                }
                                if (var237 != null) {
                                    if (var234 == 115) {
                                        class40.field666[var8++] = var237.field1678;
                                    } else {
                                        class5.field62[var6++] = var237.field1676;
                                    }
                                }
                                continue;
                            }
                            if (var234 == 115) {
                                class40.field666[var8++] = class120.field2315;
                            } else {
                                class5.field62[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var312 < 3700) {
                        if (var312 == 3600) {
                            if (class129.field2452 == 0) {
                                class5.field62[var6++] = -2;
                            } else if (class129.field2452 == 1) {
                                class5.field62[var6++] = -1;
                            } else {
                                class5.field62[var6++] = class124.field2380;
                            }
                            continue;
                        }
                        if (var312 == 3601) {
                            var6--;
                            int var211 = class5.field62[var6];
                            if (class129.field2452 == 2 && class124.field2380 > var211) {
                                class40.field666[var8++] = class131.field2480[var211];
                                continue;
                            }
                            class40.field666[var8++] = class76.field1328;
                            continue;
                        }
                        if (var312 == 3602) {
                            var6--;
                            int var212 = class5.field62[var6];
                            if (class129.field2452 == 2 && var212 < class124.field2380) {
                                class5.field62[var6++] = class47.field795[var212];
                                continue;
                            }
                            class5.field62[var6++] = 0;
                            continue;
                        }
                        if (var312 == 3603) {
                            var6--;
                            int var213 = class5.field62[var6];
                            if (class129.field2452 == 2 && var213 < class124.field2380) {
                                class5.field62[var6++] = class77.field1341[var213];
                                continue;
                            }
                            class5.field62[var6++] = 0;
                            continue;
                        }
                        if (var312 == 3604) {
                            var8--;
                            class10 var214 = class40.field666[var8];
                            var6--;
                            int var215 = class5.field62[var6];
                            class174.method1144(var215, 15, var214);
                            continue;
                        }
                        if (var312 == 3605) {
                            var8--;
                            class10 var216 = class40.field666[var8];
                            class191.method1216(0, var216.method62((byte) -110));
                            continue;
                        }
                        if (var312 == 3606) {
                            var8--;
                            class10 var217 = class40.field666[var8];
                            class75.method466(var217.method62((byte) -78), (byte) -99);
                            continue;
                        }
                        if (var312 == 3607) {
                            var8--;
                            class10 var218 = class40.field666[var8];
                            class18.method124(var218.method62((byte) -78), (byte) 0);
                            continue;
                        }
                        if (var312 == 3608) {
                            var8--;
                            class10 var219 = class40.field666[var8];
                            class93.method609(var219.method62((byte) -79), true);
                            continue;
                        }
                        if (var312 == 3609) {
                            var8--;
                            class10 var220 = class40.field666[var8];
                            if (var220.method36((byte) 69, class179.field3405) || var220.method36((byte) 69, class71.field1219)) {
                                var220 = var220.method52((byte) -118, 7);
                            }
                            class5.field62[var6++] = class107.method689(var220, -1) ? 1 : 0;
                            continue;
                        }
                        if (var312 == 3611) {
                            if (class64.field1061 == null) {
                                class40.field666[var8++] = class76.field1328;
                            } else {
                                class40.field666[var8++] = class64.field1061.method39(-105);
                            }
                            continue;
                        }
                        if (var312 == 3612) {
                            if (class64.field1061 == null) {
                                class5.field62[var6++] = 0;
                            } else {
                                class5.field62[var6++] = class193.field3674;
                            }
                            continue;
                        }
                        if (var312 == 3613) {
                            var6--;
                            int var221 = class5.field62[var6];
                            if (class64.field1061 != null && var221 < class193.field3674) {
                                class40.field666[var8++] = class75.field1288[var221].field114.method39(-117);
                                continue;
                            }
                            class40.field666[var8++] = class76.field1328;
                            continue;
                        }
                        if (var312 == 3614) {
                            var6--;
                            int var222 = class5.field62[var6];
                            if (class64.field1061 != null && class193.field3674 > var222) {
                                class5.field62[var6++] = class75.field1288[var222].field110;
                                continue;
                            }
                            class5.field62[var6++] = 0;
                            continue;
                        }
                        if (var312 == 3615) {
                            var6--;
                            int var223 = class5.field62[var6];
                            if (class64.field1061 != null && class193.field3674 > var223) {
                                class5.field62[var6++] = class75.field1288[var223].field106;
                                continue;
                            }
                            class5.field62[var6++] = 0;
                            continue;
                        }
                        if (var312 == 3616) {
                            class5.field62[var6++] = class144.field2758;
                            continue;
                        }
                        if (var312 == 3617) {
                            var8--;
                            class10 var224 = class40.field666[var8];
                            class57.method387(126, var224);
                            continue;
                        }
                        if (var312 == 3618) {
                            class5.field62[var6++] = class44.field724;
                            continue;
                        }
                        if (var312 == 3619) {
                            var8--;
                            class10 var225 = class40.field666[var8];
                            class121.method854((byte) 125, var225.method62((byte) -66));
                            continue;
                        }
                        if (var312 == 3620) {
                            class21.method145(41);
                            continue;
                        }
                        if (var312 == 3621) {
                            if (class129.field2452 == 0) {
                                class5.field62[var6++] = -1;
                            } else {
                                class5.field62[var6++] = class78.field1375;
                            }
                            continue;
                        }
                        if (var312 == 3622) {
                            var6--;
                            int var226 = class5.field62[var6];
                            if (class129.field2452 != 0 && var226 < class78.field1375) {
                                class40.field666[var8++] = class56.method381(class153.field2935[var226], (byte) 72).method39(-102);
                                continue;
                            }
                            class40.field666[var8++] = class76.field1328;
                            continue;
                        }
                        if (var312 == 3623) {
                            var8--;
                            class10 var227 = class40.field666[var8];
                            if (var227.method36((byte) 69, class179.field3405) || var227.method36((byte) 69, class71.field1219)) {
                                var227 = var227.method52((byte) -118, 7);
                            }
                            class5.field62[var6++] = class189.method1210(var227, -1) ? 1 : 0;
                            continue;
                        }
                        if (var312 == 3624) {
                            var6--;
                            int var228 = class5.field62[var6];
                            if (class75.field1288 != null && var228 < class193.field3674 && class75.field1288[var228].field114.method70((byte) 123, class145.field2767.field602)) {
                                class5.field62[var6++] = 1;
                                continue;
                            }
                            class5.field62[var6++] = 0;
                            continue;
                        }
                        if (var312 == 3625) {
                            if (class47.field817 == null) {
                                class40.field666[var8++] = class76.field1328;
                            } else {
                                class40.field666[var8++] = class47.field817.method39(-120);
                            }
                            continue;
                        }
                    } else if (var312 < 4000) {
                        if (var312 == 3903) {
                            var6--;
                            int var67 = class5.field62[var6];
                            class5.field62[var6++] = class47.field818[var67].method819(8);
                            continue;
                        }
                        if (var312 == 3904) {
                            var6--;
                            int var68 = class5.field62[var6];
                            class5.field62[var6++] = class47.field818[var68].field2212;
                            continue;
                        }
                        if (var312 == 3905) {
                            var6--;
                            int var69 = class5.field62[var6];
                            class5.field62[var6++] = class47.field818[var69].field2209;
                            continue;
                        }
                        if (var312 == 3906) {
                            var6--;
                            int var70 = class5.field62[var6];
                            class5.field62[var6++] = class47.field818[var70].field2211;
                            continue;
                        }
                        if (var312 == 3907) {
                            var6--;
                            int var71 = class5.field62[var6];
                            class5.field62[var6++] = class47.field818[var71].field2204;
                            continue;
                        }
                        if (var312 == 3908) {
                            var6--;
                            int var72 = class5.field62[var6];
                            class5.field62[var6++] = class47.field818[var72].field2208;
                            continue;
                        }
                        if (var312 == 3910) {
                            var6--;
                            int var73 = class5.field62[var6];
                            int var74 = class47.field818[var73].method818(7);
                            class5.field62[var6++] = var74 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var312 == 3911) {
                            var6--;
                            int var75 = class5.field62[var6];
                            int var76 = class47.field818[var75].method818(7);
                            class5.field62[var6++] = var76 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var312 == 3912) {
                            var6--;
                            int var77 = class5.field62[var6];
                            int var78 = class47.field818[var77].method818(7);
                            class5.field62[var6++] = var78 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var312 == 3913) {
                            var6--;
                            int var79 = class5.field62[var6];
                            int var80 = class47.field818[var79].method818(7);
                            class5.field62[var6++] = var80 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var312 < 4100) {
                        if (var312 == 4000) {
                            var6 -= 2;
                            int var81 = class5.field62[var6 + 1];
                            int var82 = class5.field62[var6];
                            class5.field62[var6++] = var81 + var82;
                            continue;
                        }
                        if (var312 == 4001) {
                            var6 -= 2;
                            int var83 = class5.field62[var6];
                            int var84 = class5.field62[var6 + 1];
                            class5.field62[var6++] = var83 - var84;
                            continue;
                        }
                        if (var312 == 4002) {
                            var6 -= 2;
                            int var85 = class5.field62[var6 + 1];
                            int var86 = class5.field62[var6];
                            class5.field62[var6++] = var85 * var86;
                            continue;
                        }
                        if (var312 == 4003) {
                            var6 -= 2;
                            int var87 = class5.field62[var6];
                            int var88 = class5.field62[var6 + 1];
                            class5.field62[var6++] = var87 / var88;
                            continue;
                        }
                        if (var312 == 4004) {
                            var6--;
                            int var89 = class5.field62[var6];
                            class5.field62[var6++] = (int) ((double) var89 * Math.random());
                            continue;
                        }
                        if (var312 == 4005) {
                            var6--;
                            int var90 = class5.field62[var6];
                            class5.field62[var6++] = (int) (Math.random() * (double) (var90 + 1));
                            continue;
                        }
                        if (var312 == 4006) {
                            var6 -= 5;
                            int var91 = class5.field62[var6];
                            int var92 = class5.field62[var6 + 1];
                            int var93 = class5.field62[var6 + 2];
                            int var94 = class5.field62[var6 + 4];
                            int var95 = class5.field62[var6 + 3];
                            class5.field62[var6++] = (var92 - var91) * (-var93 + var94) / (var95 - var93) + var91;
                            continue;
                        }
                        if (var312 == 4007) {
                            var6 -= 2;
                            int var96 = class5.field62[var6 + 1];
                            int var97 = class5.field62[var6];
                            class5.field62[var6++] = var96 * var97 / 100 + var97;
                            continue;
                        }
                        if (var312 == 4008) {
                            var6 -= 2;
                            int var98 = class5.field62[var6];
                            int var99 = class5.field62[var6 + 1];
                            class5.field62[var6++] = class66.method434(var98, 0x1 << var99);
                            continue;
                        }
                        if (var312 == 4009) {
                            var6 -= 2;
                            int var100 = class5.field62[var6 + 1];
                            int var101 = class5.field62[var6];
                            class5.field62[var6++] = class123.method861(var101, -(0x1 << var100) - 1);
                            continue;
                        }
                        if (var312 == 4010) {
                            var6 -= 2;
                            int var102 = class5.field62[var6];
                            int var103 = class5.field62[var6 + 1];
                            class5.field62[var6++] = class123.method861(0x1 << var103, var102) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var312 == 4011) {
                            var6 -= 2;
                            int var104 = class5.field62[var6];
                            int var105 = class5.field62[var6 + 1];
                            class5.field62[var6++] = var104 % var105;
                            continue;
                        }
                        if (var312 == 4012) {
                            var6 -= 2;
                            int var106 = class5.field62[var6 + 1];
                            int var107 = class5.field62[var6];
                            if (var107 == 0) {
                                class5.field62[var6++] = 0;
                            } else {
                                class5.field62[var6++] = (int) Math.pow((double) var107, (double) var106);
                            }
                            continue;
                        }
                        if (var312 == 4013) {
                            var6 -= 2;
                            int var108 = class5.field62[var6];
                            int var109 = class5.field62[var6 + 1];
                            if (var108 == 0) {
                                class5.field62[var6++] = 0;
                            } else if (var109 == 0) {
                                class5.field62[var6++] = Integer.MAX_VALUE;
                            } else {
                                class5.field62[var6++] = (int) Math.pow((double) var108, 1.0D / (double) var109);
                            }
                            continue;
                        }
                        if (var312 == 4014) {
                            var6 -= 2;
                            int var110 = class5.field62[var6];
                            int var111 = class5.field62[var6 + 1];
                            class5.field62[var6++] = class123.method861(var110, var111);
                            continue;
                        }
                        if (var312 == 4015) {
                            var6 -= 2;
                            int var112 = class5.field62[var6];
                            int var113 = class5.field62[var6 + 1];
                            class5.field62[var6++] = class66.method434(var113, var112);
                            continue;
                        }
                        if (var312 == 4016) {
                            var6 -= 2;
                            int var114 = class5.field62[var6];
                            int var115 = class5.field62[var6 + 1];
                            class5.field62[var6++] = var114 >= var115 ? var115 : var114;
                            continue;
                        }
                        if (var312 == 4017) {
                            var6 -= 2;
                            int var116 = class5.field62[var6 + 1];
                            int var117 = class5.field62[var6];
                            class5.field62[var6++] = var117 > var116 ? var117 : var116;
                            continue;
                        }
                        if (var312 == 4018) {
                            var6 -= 3;
                            long var118 = (long) class5.field62[var6 + 1];
                            long var120 = (long) class5.field62[var6];
                            long var122 = (long) class5.field62[var6 + 2];
                            class5.field62[var6++] = (int) (var120 * var122 / var118);
                            continue;
                        }
                    } else if (var312 < 4200) {
                        if (var312 == 4100) {
                            var8--;
                            class10 var161 = class40.field666[var8];
                            var6--;
                            int var162 = class5.field62[var6];
                            class40.field666[var8++] = class67.method440(0, new class10[] { var161, class119.method846(0, var162) });
                            continue;
                        }
                        if (var312 == 4101) {
                            var8 -= 2;
                            class10 var163 = class40.field666[var8];
                            class10 var164 = class40.field666[var8 + 1];
                            class40.field666[var8++] = class67.method440(0, new class10[] { var163, var164 });
                            continue;
                        }
                        if (var312 == 4102) {
                            var6--;
                            int var165 = class5.field62[var6];
                            var8--;
                            class10 var166 = class40.field666[var8];
                            class40.field666[var8++] = class67.method440(0, new class10[] { var166, method1072(var165, -67, true) });
                            continue;
                        }
                        if (var312 == 4103) {
                            var8--;
                            class10 var167 = class40.field666[var8];
                            class40.field666[var8++] = var167.method48(-34);
                            continue;
                        }
                        if (var312 == 4104) {
                            var6--;
                            int var168 = class5.field62[var6];
                            long var169 = ((long) var168 + 11745L) * 86400000L;
                            class71.field1212.setTime(new Date(var169));
                            int var171 = class71.field1212.get(5);
                            int var172 = class71.field1212.get(2);
                            int var173 = class71.field1212.get(1);
                            class40.field666[var8++] = class67.method440(0, new class10[] { class119.method846(0, var171), class94.field1746, class200.field3814[var172], class94.field1746, class119.method846(0, var173) });
                            continue;
                        }
                        if (var312 == 4105) {
                            var8 -= 2;
                            class10 var174 = class40.field666[var8];
                            class10 var175 = class40.field666[var8 + 1];
                            if (class145.field2767.field609 != null && class145.field2767.field609.field2223) {
                                class40.field666[var8++] = var175;
                                continue;
                            }
                            class40.field666[var8++] = var174;
                            continue;
                        }
                        if (var312 == 4106) {
                            var6--;
                            int var176 = class5.field62[var6];
                            class40.field666[var8++] = class119.method846(0, var176);
                            continue;
                        }
                        if (var312 == 4107) {
                            var8 -= 2;
                            class5.field62[var6++] = class40.field666[var8].method41((byte) 89, class40.field666[var8 + 1]);
                            continue;
                        }
                        if (var312 == 4108) {
                            var6 -= 2;
                            var8--;
                            class10 var177 = class40.field666[var8];
                            int var178 = class5.field62[var6];
                            int var179 = class5.field62[var6 + 1];
                            byte[] var180 = class140.field2640.method159((byte) -123, 0, var179);
                            class177 var181 = new class177(var180);
                            class5.field62[var6++] = var181.method1259(var177, var178);
                            continue;
                        }
                        if (var312 == 4109) {
                            var6 -= 2;
                            var8--;
                            class10 var182 = class40.field666[var8];
                            int var183 = class5.field62[var6 + 1];
                            int var184 = class5.field62[var6];
                            byte[] var185 = class140.field2640.method159((byte) 84, 0, var183);
                            class177 var186 = new class177(var185);
                            class5.field62[var6++] = var186.method1276(var182, var184);
                            continue;
                        }
                        if (var312 == 4110) {
                            var8 -= 2;
                            class10 var187 = class40.field666[var8];
                            class10 var188 = class40.field666[var8 + 1];
                            var6--;
                            if (class5.field62[var6] == 1) {
                                class40.field666[var8++] = var187;
                            } else {
                                class40.field666[var8++] = var188;
                            }
                            continue;
                        }
                        if (var312 == 4111) {
                            var8--;
                            class10 var189 = class40.field666[var8];
                            class40.field666[var8++] = class198.method1264(var189);
                            continue;
                        }
                        if (var312 == 4112) {
                            var8--;
                            class10 var190 = class40.field666[var8];
                            var6--;
                            int var191 = class5.field62[var6];
                            class40.field666[var8++] = var190.method38((byte) 90, var191);
                            continue;
                        }
                        if (var312 == 4113) {
                            var6--;
                            int var192 = class5.field62[var6];
                            class5.field62[var6++] = class30.method196(var192, -3431) ? 1 : 0;
                            continue;
                        }
                        if (var312 == 4114) {
                            var6--;
                            int var193 = class5.field62[var6];
                            class5.field62[var6++] = class41.method261(var193, false) ? 1 : 0;
                            continue;
                        }
                        if (var312 == 4115) {
                            var6--;
                            int var194 = class5.field62[var6];
                            class5.field62[var6++] = class168.method1119(var194, false) ? 1 : 0;
                            continue;
                        }
                        if (var312 == 4116) {
                            var6--;
                            int var195 = class5.field62[var6];
                            class5.field62[var6++] = class193.method1233(var195, (byte) 127) ? 1 : 0;
                            continue;
                        }
                        if (var312 == 4117) {
                            var8--;
                            class10 var196 = class40.field666[var8];
                            if (var196 == null) {
                                class5.field62[var6++] = 0;
                            } else {
                                class5.field62[var6++] = var196.method40((byte) 122);
                            }
                            continue;
                        }
                        if (var312 == 4118) {
                            var6 -= 2;
                            var8--;
                            class10 var197 = class40.field666[var8];
                            int var198 = class5.field62[var6];
                            int var199 = class5.field62[var6 + 1];
                            class40.field666[var8++] = var197.method44(var199, var198, (byte) 87);
                            continue;
                        }
                        if (var312 == 4119) {
                            var8--;
                            class10 var200 = class40.field666[var8];
                            boolean var201 = false;
                            class10 var202 = class7.method24(true, var200.method40((byte) -47));
                            for (int var203 = 0; var200.method40((byte) 115) > var203; var203++) {
                                int var204 = var200.method61(var203, -1);
                                if (var204 == 60) {
                                    var201 = true;
                                } else if (var204 == 62) {
                                    var201 = false;
                                } else if (!var201) {
                                    var202.method56(var204, -1);
                                }
                            }
                            var202.method60((byte) -59);
                            class40.field666[var8++] = var202;
                            continue;
                        }
                        if (var312 == 4120) {
                            var8--;
                            class10 var205 = class40.field666[var8];
                            var6 -= 2;
                            int var206 = class5.field62[var6];
                            int var207 = class5.field62[var6 + 1];
                            class5.field62[var6++] = var205.method51(-1, var206, var207);
                            continue;
                        }
                        if (var312 == 4121) {
                            var6--;
                            int var208 = class5.field62[var6];
                            var8 -= 2;
                            class10 var209 = class40.field666[var8];
                            class10 var210 = class40.field666[var8 + 1];
                            class5.field62[var6++] = var209.method67(var208, (byte) 116, var210);
                            continue;
                        }
                    } else if (var312 < 4300) {
                        if (var312 == 4200) {
                            var6--;
                            int var145 = class5.field62[var6];
                            class40.field666[var8++] = class104.method678(500, var145).field1718;
                            continue;
                        }
                        if (var312 == 4201) {
                            var6 -= 2;
                            int var146 = class5.field62[var6];
                            int var147 = class5.field62[var6 + 1];
                            class94 var148 = class104.method678(500, var146);
                            if (var147 >= 1 && var147 <= 5 && var148.field1738[var147 - 1] != null) {
                                class40.field666[var8++] = var148.field1738[var147 - 1];
                                continue;
                            }
                            class40.field666[var8++] = class76.field1328;
                            continue;
                        }
                        if (var312 == 4202) {
                            var6 -= 2;
                            int var149 = class5.field62[var6];
                            int var150 = class5.field62[var6 + 1];
                            class94 var151 = class104.method678(500, var149);
                            if (var150 >= 1 && var150 <= 5 && var151.field1705[var150 - 1] != null) {
                                class40.field666[var8++] = var151.field1705[var150 - 1];
                                continue;
                            }
                            class40.field666[var8++] = class76.field1328;
                            continue;
                        }
                        if (var312 == 4203) {
                            var6--;
                            int var152 = class5.field62[var6];
                            class5.field62[var6++] = class104.method678(500, var152).field1711;
                            continue;
                        }
                        if (var312 == 4204) {
                            var6--;
                            int var153 = class5.field62[var6];
                            class5.field62[var6++] = class104.method678(500, var153).field1693 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var312 == 4205) {
                            var6--;
                            int var154 = class5.field62[var6];
                            class94 var155 = class104.method678(500, var154);
                            if (var155.field1741 == -1 && var155.field1733 >= 0) {
                                class5.field62[var6++] = var155.field1733;
                                continue;
                            }
                            class5.field62[var6++] = var154;
                            continue;
                        }
                        if (var312 == 4206) {
                            var6--;
                            int var156 = class5.field62[var6];
                            class94 var157 = class104.method678(500, var156);
                            if (var157.field1741 >= 0 && var157.field1733 >= 0) {
                                class5.field62[var6++] = var157.field1733;
                                continue;
                            }
                            class5.field62[var6++] = var156;
                            continue;
                        }
                        if (var312 == 4207) {
                            var6--;
                            int var158 = class5.field62[var6];
                            class5.field62[var6++] = class104.method678(500, var158).field1713 ? 1 : 0;
                            continue;
                        }
                        if (var312 == 4210) {
                            var8--;
                            class10 var159 = class40.field666[var8];
                            var6--;
                            int var160 = class5.field62[var6];
                            class55.method380(var159, var160 == 1, 0);
                            class5.field62[var6++] = class115.field2206;
                            continue;
                        }
                        if (var312 == 4211) {
                            if (class121.field2335 != null && class131.field2483 < class115.field2206) {
                                class5.field62[var6++] = class123.method861(class121.field2335[class131.field2483++], 65535);
                                continue;
                            }
                            class5.field62[var6++] = -1;
                            continue;
                        }
                        if (var312 == 4212) {
                            class131.field2483 = 0;
                            continue;
                        }
                    } else if (var312 < 5100) {
                        if (var312 == 5000) {
                            class5.field62[var6++] = class34.field525;
                            continue;
                        }
                        if (var312 == 5001) {
                            class64.field1075++;
                            var6 -= 3;
                            class34.field525 = class5.field62[var6];
                            client.field451 = class5.field62[var6 + 1];
                            class104.field1940 = class5.field62[var6 + 2];
                            class76.field1323.method635((byte) -90, 119);
                            class76.field1323.method781(0, class34.field525);
                            class76.field1323.method781(0, client.field451);
                            class76.field1323.method781(0, class104.field1940);
                            continue;
                        }
                        if (var312 == 5002) {
                            var8--;
                            class10 var124 = class40.field666[var8];
                            class118.field2278++;
                            var6 -= 2;
                            int var125 = class5.field62[var6];
                            int var126 = class5.field62[var6 + 1];
                            class76.field1323.method635((byte) -121, 134);
                            class76.field1323.method783(var124.method62((byte) -113), -49);
                            class76.field1323.method781(0, var125 - 1);
                            class76.field1323.method781(0, var126);
                            continue;
                        }
                        if (var312 == 5003) {
                            class10 var127 = null;
                            var6--;
                            int var128 = class5.field62[var6];
                            if (var128 < 100) {
                                var127 = client.field443[var128];
                            }
                            if (var127 == null) {
                                var127 = class76.field1328;
                            }
                            class40.field666[var8++] = var127;
                            continue;
                        }
                        if (var312 == 5004) {
                            var6--;
                            int var129 = class5.field62[var6];
                            int var130 = -1;
                            if (var129 < 100 && client.field443[var129] != null) {
                                var130 = class27.field404[var129];
                            }
                            class5.field62[var6++] = var130;
                            continue;
                        }
                        if (var312 == 5005) {
                            class5.field62[var6++] = client.field451;
                            continue;
                        }
                        if (var312 == 5008) {
                            var8--;
                            class10 var131 = class40.field666[var8];
                            if (var131.method36((byte) 69, class137.field2575)) {
                                class142.method964(true, var131);
                            } else {
                                class98.field1800++;
                                class10 var132 = var131.method48(-34);
                                byte var133 = 0;
                                if (var132.method36((byte) 69, class205.field3977)) {
                                    var131 = var131.method52((byte) -118, class205.field3977.method40((byte) 120));
                                    var133 = 0;
                                } else if (var132.method36((byte) 69, class58.field1026)) {
                                    var131 = var131.method52((byte) -118, class58.field1026.method40((byte) -114));
                                    var133 = 1;
                                } else if (var132.method36((byte) 69, class157.field3024)) {
                                    var133 = 2;
                                    var131 = var131.method52((byte) -118, class157.field3024.method40((byte) 86));
                                } else if (var132.method36((byte) 69, client.field452)) {
                                    var133 = 3;
                                    var131 = var131.method52((byte) -118, client.field452.method40((byte) 89));
                                } else if (var132.method36((byte) 69, class114.field2182)) {
                                    var133 = 4;
                                    var131 = var131.method52((byte) -118, class114.field2182.method40((byte) 92));
                                } else if (var132.method36((byte) 69, class117.field2241)) {
                                    var133 = 5;
                                    var131 = var131.method52((byte) -118, class117.field2241.method40((byte) -70));
                                } else if (var132.method36((byte) 69, class207.field4037)) {
                                    var133 = 6;
                                    var131 = var131.method52((byte) -118, class207.field4037.method40((byte) 94));
                                } else if (var132.method36((byte) 69, class53.field958)) {
                                    var131 = var131.method52((byte) -118, class53.field958.method40((byte) 126));
                                    var133 = 7;
                                } else if (var132.method36((byte) 69, class98.field1802)) {
                                    var133 = 8;
                                    var131 = var131.method52((byte) -118, class98.field1802.method40((byte) 111));
                                } else if (var132.method36((byte) 69, class34.field514)) {
                                    var133 = 9;
                                    var131 = var131.method52((byte) -118, class34.field514.method40((byte) 0));
                                } else if (var132.method36((byte) 69, class41.field677)) {
                                    var133 = 10;
                                    var131 = var131.method52((byte) -118, class41.field677.method40((byte) 116));
                                } else if (var132.method36((byte) 69, class108.field2017)) {
                                    var131 = var131.method52((byte) -118, class108.field2017.method40((byte) -44));
                                    var133 = 11;
                                } else if (class63.field1057 != 0) {
                                    if (var132.method36((byte) 69, class205.field3981)) {
                                        var131 = var131.method52((byte) -118, class205.field3981.method40((byte) 79));
                                        var133 = 0;
                                    } else if (var132.method36((byte) 69, class58.field1007)) {
                                        var131 = var131.method52((byte) -118, class58.field1007.method40((byte) 97));
                                        var133 = 1;
                                    } else if (var132.method36((byte) 69, class157.field3038)) {
                                        var133 = 2;
                                        var131 = var131.method52((byte) -118, class157.field3038.method40((byte) -120));
                                    } else if (var132.method36((byte) 69, client.field444)) {
                                        var133 = 3;
                                        var131 = var131.method52((byte) -118, client.field444.method40((byte) -37));
                                    } else if (var132.method36((byte) 69, class114.field2153)) {
                                        var131 = var131.method52((byte) -118, class114.field2153.method40((byte) 84));
                                        var133 = 4;
                                    } else if (var132.method36((byte) 69, class117.field2254)) {
                                        var131 = var131.method52((byte) -118, class117.field2254.method40((byte) -63));
                                        var133 = 5;
                                    } else if (var132.method36((byte) 69, class207.field4042)) {
                                        var133 = 6;
                                        var131 = var131.method52((byte) -118, class207.field4042.method40((byte) 100));
                                    } else if (var132.method36((byte) 69, class53.field960)) {
                                        var131 = var131.method52((byte) -118, class53.field960.method40((byte) 122));
                                        var133 = 7;
                                    } else if (var132.method36((byte) 69, class98.field1805)) {
                                        var133 = 8;
                                        var131 = var131.method52((byte) -118, class98.field1805.method40((byte) 109));
                                    } else if (var132.method36((byte) 69, class34.field524)) {
                                        var131 = var131.method52((byte) -118, class34.field524.method40((byte) 102));
                                        var133 = 9;
                                    } else if (var132.method36((byte) 69, class41.field681)) {
                                        var133 = 10;
                                        var131 = var131.method52((byte) -118, class41.field681.method40((byte) -55));
                                    } else if (var132.method36((byte) 69, class108.field2003)) {
                                        var131 = var131.method52((byte) -118, class108.field2003.method40((byte) -13));
                                        var133 = 11;
                                    }
                                }
                                byte var134 = 0;
                                class10 var135 = var131.method48(-34);
                                if (var135.method36((byte) 69, class166.field3176)) {
                                    var131 = var131.method52((byte) -118, class166.field3176.method40((byte) 100));
                                    var134 = 1;
                                } else if (var135.method36((byte) 69, class98.field1798)) {
                                    var131 = var131.method52((byte) -118, class98.field1798.method40((byte) -34));
                                    var134 = 2;
                                } else if (var135.method36((byte) 69, class135.field2531)) {
                                    var131 = var131.method52((byte) -118, class135.field2531.method40((byte) 116));
                                    var134 = 3;
                                } else if (var135.method36((byte) 69, class201.field3939)) {
                                    var134 = 4;
                                    var131 = var131.method52((byte) -118, class201.field3939.method40((byte) 108));
                                } else if (var135.method36((byte) 69, class134.field2512)) {
                                    var134 = 5;
                                    var131 = var131.method52((byte) -118, class134.field2512.method40((byte) -79));
                                } else if (class63.field1057 != 0) {
                                    if (var135.method36((byte) 69, class166.field3174)) {
                                        var134 = 1;
                                        var131 = var131.method52((byte) -118, class166.field3174.method40((byte) -19));
                                    } else if (var135.method36((byte) 69, class98.field1816)) {
                                        var131 = var131.method52((byte) -118, class98.field1816.method40((byte) 101));
                                        var134 = 2;
                                    } else if (var135.method36((byte) 69, class135.field2525)) {
                                        var134 = 3;
                                        var131 = var131.method52((byte) -118, class135.field2525.method40((byte) -45));
                                    } else if (var135.method36((byte) 69, class201.field3936)) {
                                        var134 = 4;
                                        var131 = var131.method52((byte) -118, class201.field3936.method40((byte) -15));
                                    } else if (var135.method36((byte) 69, class134.field2509)) {
                                        var134 = 5;
                                        var131 = var131.method52((byte) -118, class134.field2509.method40((byte) 93));
                                    }
                                }
                                class76.field1323.method635((byte) -102, 160);
                                class76.field1323.method781(0, 0);
                                int var136 = class76.field1323.field2170;
                                class76.field1323.method781(0, var133);
                                class76.field1323.method781(0, var134);
                                class207.method1337(class76.field1323, -3014, var131);
                                class76.field1323.method789(class76.field1323.field2170 - var136, (byte) 7);
                            }
                            continue;
                        }
                        if (var312 == 5009) {
                            var8 -= 2;
                            class146.field2783++;
                            class10 var137 = class40.field666[var8 + 1];
                            class10 var138 = class40.field666[var8];
                            class76.field1323.method635((byte) -119, 141);
                            class76.field1323.method781(0, 0);
                            int var139 = class76.field1323.field2170;
                            class76.field1323.method783(var138.method62((byte) -93), -91);
                            class207.method1337(class76.field1323, -3014, var137);
                            class76.field1323.method789(class76.field1323.field2170 - var139, (byte) 7);
                            continue;
                        }
                        if (var312 == 5010) {
                            var6--;
                            int var140 = class5.field62[var6];
                            class10 var141 = null;
                            if (var140 < 100) {
                                var141 = class65.field1094[var140];
                            }
                            if (var141 == null) {
                                var141 = class76.field1328;
                            }
                            class40.field666[var8++] = var141;
                            continue;
                        }
                        if (var312 == 5011) {
                            var6--;
                            int var142 = class5.field62[var6];
                            class10 var143 = null;
                            if (var142 < 100) {
                                var143 = class174.field3356[var142];
                            }
                            if (var143 == null) {
                                var143 = class76.field1328;
                            }
                            class40.field666[var8++] = var143;
                            continue;
                        }
                        if (var312 == 5015) {
                            class10 var144;
                            if (class145.field2767 == null || class145.field2767.field602 == null) {
                                var144 = class10.field123;
                            } else {
                                var144 = class145.field2767.field602;
                            }
                            class40.field666[var8++] = var144;
                            continue;
                        }
                        if (var312 == 5016) {
                            class5.field62[var6++] = class104.field1940;
                            continue;
                        }
                        if (var312 == 5017) {
                            class5.field62[var6++] = class169.field3257;
                            continue;
                        }
                    }
                } else {
                    class200 var281;
                    if (var312 < 2000) {
                        var281 = var43 ? class145.field2778 : class115.field2214;
                    } else {
                        var312 -= 1000;
                        var6--;
                        var281 = class66.method432(class5.field62[var6], false);
                    }
                    if (var312 == 1300) {
                        var6--;
                        int var282 = class5.field62[var6] - 1;
                        if (var282 >= 0 && var282 <= 9) {
                            var8--;
                            var281.method1299(class40.field666[var8], var282, 0);
                            continue;
                        }
                        var8--;
                        continue;
                    }
                    if (var312 == 1301) {
                        var6 -= 2;
                        int var283 = class5.field62[var6];
                        int var284 = class5.field62[var6 + 1];
                        var281.field3870 = class82.method507((byte) 120, var283, var284);
                        continue;
                    }
                    if (var312 == 1302) {
                        var6--;
                        var281.field3913 = class5.field62[var6] == 1;
                        continue;
                    }
                    if (var312 == 1303) {
                        var6--;
                        var281.field3879 = class5.field62[var6];
                        continue;
                    }
                    if (var312 == 1304) {
                        var6--;
                        var281.field3889 = class5.field62[var6];
                        continue;
                    }
                    if (var312 == 1305) {
                        var8--;
                        var281.field3792 = class40.field666[var8];
                        continue;
                    }
                    if (var312 == 1306) {
                        var8--;
                        var281.field3803 = class40.field666[var8];
                        continue;
                    }
                    if (var312 == 1307) {
                        var281.field3780 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var311) {
            if (var5.field2423 == null) {
                if (class128.field2427 != 0) {
                    class6.method20(0, class80.field1407, (byte) 117, class76.field1328);
                }
                class109.method700(var311, "CS2 - scr:" + var5.field2291 + " op:" + var12, (byte) -93);
            } else {
                class10 var308 = class7.method24(true, 30);
                var308.method50((byte) 115, class27.field409).method50((byte) 115, var5.field2423);
                for (int var309 = class142.field2673 - 1; var309 >= 0; var309--) {
                    var308.method50((byte) 115, class83.field1446).method50((byte) 115, class66.field1156[var309].field3370.field2423);
                }
                if (var12 == 40) {
                    int var310 = var11[var7];
                    var308.method50((byte) 115, class203.field3960).method50((byte) 115, class119.method846(0, var310));
                }
                if (class128.field2427 != 0) {
                    class6.method20(0, class67.method440(0, new class10[] { class158.field3042, var5.field2423 }), (byte) 117, class76.field1328);
                }
                class109.method700(var311, "CS2 - scr:" + var5.field2291 + " op:" + var12 + new String(var308.method45((byte) 89)), (byte) -99);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIIIIZLnd;)V")
    public class162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class122 arg8) {
        this.field3112 = arg2;
        this.field3101 = arg3;
        this.field3106 = arg1;
        this.field3108 = arg4;
        this.field3100 = arg0;
        this.field3103 = arg5;
        if (arg6 != -1) {
            this.field3102 = class142.method958((byte) -112, arg6);
            this.field3107 = 0;
            this.field3105 = class120.field2304 - 1;
            if (this.field3102.field1347 == 0 && arg8 != null && arg8 instanceof class162) {
                class162 var10 = (class162) arg8;
                if (this.field3102 == var10.field3102) {
                    this.field3107 = var10.field3107;
                    this.field3105 = var10.field3105;
                    return;
                }
            }
            if (arg7 && this.field3102.field1355 != -1) {
                this.field3107 = (int) (Math.random() * (double) this.field3102.field1339.length);
                this.field3105 -= (int) ((double) this.field3102.field1358[this.field3107] * Math.random());
                return;
            }
        }
    }
}
