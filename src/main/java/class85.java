import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class85 {

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "F")
    public float field1218 = 0.25F;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "F")
    public float field1227 = 1.0F;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "F")
    public float field1237 = 1.0F;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public int field1238;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "F")
    public float field1220;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "F")
    public float field1239;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "F")
    public float field1222;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Ldc;")
    public class75 field1230;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1225 = "wishes to trade with you.";

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    public static int field1236 = 1;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "Lkm;")
    public static class133 field1234;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Lh;")
    public static class341 field1216;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "[[B")
    public static byte[][] field1235;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 7)
    public static void method655(byte arg0) {
        field1225 = null;
        field1235 = (byte[][]) null;
        int var1 = 115 / ((33 - arg0) / 46);
        field1234 = null;
        field1216 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V", line = 22)
    public static final void method656(boolean arg0, int arg1) {
        if (arg1 != 0) {
            method657((byte) -107, -5, 92, true, -80, -90);
        }
        field1221++;
        if (arg0 != class275.field4132) {
            class275.field4132 = arg0;
            class307.method2084((byte) -61);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BIIZII)V", line = 40)
    public static final void method657(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1224++;
        class8.field83++;
        class326.method2282(true);
        if (arg3) {
            class183.method1273(false, 0, -73, false);
        } else {
            class136.method987(-105, 0);
            class183.method1273(true, 0, 127, false);
            if (class145.field2002 == 0) {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class183.method1273(false, var6, 117, false);
                    class183.method1273(false, var6, -114, true);
                    class136.method987(-119, var6);
                }
            } else {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class136.method987(-117, var7);
                    class183.method1273(false, var7, 124, false);
                    class183.method1273(false, var7, 124, true);
                }
            }
        }
        if (!arg3) {
            class54.method372(-13313);
        }
        class155.method1120(40);
        if (class67.field908) {
            class165.method1181(arg5, 25824, arg1, true, arg2, arg4);
            arg4 = class293.field4362;
            arg2 = class280.field4202;
            arg5 = class17.field224;
            arg1 = class97.field1312;
        }
        if (class343.field5168 == 1) {
            int var8 = (int) class124.field1674;
            if (var8 < (class93.field1286 / 256)) {
                var8 = class93.field1286 / 256;
            }
            int var9 = (int) class89.field1257 + class7.field67 & 0x7FF;
            if (class306.field4592[4] && var8 < class237.field3364[4] + 128) {
                var8 = class237.field3364[4] + 128;
            }
            class209.method1469(var9, var8, arg2, var8 * 3 + 600, class111.field1505, class135.method985(class173.field2356.field3679, class251.field3603, class173.field2356.field3745, (byte) -108) - 50, class17.field228, (byte) 115);
        } else if (class343.field5168 == 5) {
            class329.method2298(arg2, -122);
        }
        int var10 = class198.field2820;
        int var11 = class101.field1394;
        int var12 = class204.field2944;
        int var13 = class275.field4123;
        int var14 = class236.field3347;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class306.field4592[var15]) {
                int var16 = (int) ((double) (class175.field2381[var15] * 2 + 1) * Math.random() + Math.sin((double) class100.field1376[var15] / 100.0D * (double) class145.field2005[var15]) * (double) class237.field3364[var15] - (double) class175.field2381[var15]);
                if (var15 == 1) {
                    class101.field1394 += var16;
                }
                if (var15 == 3) {
                    class236.field3347 = class236.field3347 + var16 & 0x7FF;
                }
                if (var15 == 4) {
                    class204.field2944 += var16;
                    if (class204.field2944 < 128) {
                        class204.field2944 = 128;
                    }
                    if (class204.field2944 > 383) {
                        class204.field2944 = 383;
                    }
                }
                if (var15 == 2) {
                    class275.field4123 += var16;
                }
                if (var15 == 0) {
                    class198.field2820 += var16;
                }
            }
        }
        class221.method1561(true);
        if (class67.field908) {
            class102.method753(arg4, arg5, arg1 + arg4, arg2 + arg5);
            float var17 = (float) class236.field3347 * 0.17578125F;
            float var18 = (float) class204.field2944 * 0.17578125F;
            if (class343.field5168 == 3) {
                var18 = class207.field2972 * 360.0F / 6.2831855F;
                var17 = class188.field2605 * 360.0F / 6.2831855F;
            }
            boolean var19 = false;
            int var20;
            if (class148.field2051 == 10) {
                var20 = class163.method1172(class198.field2820 >> 10, class297.field4401, class275.field4123 >> 10, class287.field4278, 0);
            } else {
                var20 = class163.method1172(class173.field2356.field3706[0] >> 3, class297.field4401, class173.field2356.field3768[0] >> 3, class287.field4278, 0);
            }
            if (class266.field3879 >= 0) {
                class67.method487();
                class49 var21 = class239.method1638(0, class71.field965, class266.field3879, class324.field4911, class92.field1270);
                var21.method310(class48.field592, arg4, arg5, arg1, arg2, class204.field2944, class236.field3347, var20);
            } else {
                class67.method458(var20);
            }
            class67.method492(arg4, arg5, arg1, arg2, arg1 / 2 + arg4, arg2 / 2 + arg5, var18, var17, class77.field1065, class77.field1065);
            class8.method42(false, false);
            class67.method483();
            class67.method459(true);
            class67.method476(true);
        } else {
            class38.method220(arg4, arg5, arg1 + arg4, arg2 + arg5);
            class184.method1290();
            if (class266.field3879 < 0) {
                class38.method224(arg4, arg5, arg1, arg2, 0);
            } else {
                class49 var22 = class239.method1638(0, class71.field965, class266.field3879, class324.field4911, class92.field1270);
                var22.method305(class48.field592, arg4, arg5, arg1, arg2, class204.field2944, class236.field3347, 0);
            }
        }
        if (class100.field1380 || arg4 > class55.field751 || arg1 + arg4 <= class55.field751 || arg5 > class82.field1189 || class82.field1189 >= (arg2 + arg5)) {
            class188.field2600 = 0;
            class17.field239 = false;
        } else {
            class188.field2600 = 0;
            int var23 = class324.field4913;
            int var24 = class313.field4731;
            int var25 = class99.field1344;
            class17.field239 = true;
            class89.field1252 = (var23 - var24) * (class55.field751 - arg4) / arg1 + var24;
            int var26 = class185.field2556;
            class174.field2376 = (class82.field1189 - arg5) * (var26 - var25) / arg2 + var25;
        }
        class15.method98(-98);
        byte var27 = class201.method1432((byte) -43) == 2 ? (byte) class8.field83 : 1;
        if (class67.field908) {
            class147.method1065(class329.field4966, !class119.field1610);
            class4.method22(class236.field3347, class204.field2944, class101.field1394, class275.field4123, class198.field2820, (byte) 90);
            class67.field900 = class329.field4966;
            class129.method929(class198.field2820, class101.field1394, class275.field4123, class204.field2944, class236.field3347, class136.field1887, class124.field1672, class289.field4306, class21.field277, class254.field3632, class100.field1372, class251.field3603 + 1, var27, class173.field2356.field3745 >> 7, class173.field2356.field3679 >> 7);
            class287.field4275 = true;
            class147.method1060();
            class4.method22(0, 0, 0, 0, 0, (byte) 110);
            class15.method98(-123);
            class93.method697(arg5, arg1, arg2, class77.field1065, arg4, class77.field1065, false);
            class59.method403(arg5, -1, class77.field1065, arg1, arg4, arg2, class77.field1065);
            class71.method517();
        } else {
            class129.method929(class198.field2820, class101.field1394, class275.field4123, class204.field2944, class236.field3347, class136.field1887, class124.field1672, class289.field4306, class21.field277, class254.field3632, class100.field1372, class251.field3603 + 1, var27, class173.field2356.field3745 >> 7, class173.field2356.field3679 >> 7);
            class15.method98(-100);
            class71.method517();
            class93.method697(arg5, arg1, arg2, 256, arg4, 256, false);
            class59.method403(arg5, -1, 256, arg1, arg4, arg2, 256);
        }
        ((class204) class184.field2543).method1443((byte) 113, class287.field4278);
        class301.method2049(arg4, 101, arg5, arg2, arg1);
        class236.field3347 = var14;
        class101.field1394 = var11;
        class198.field2820 = var10;
        if (arg0 > -35) {
            field1236 = -108;
        }
        class204.field2944 = var12;
        class275.field4123 = var13;
        if (class6.field48 && class78.field1133.method84((byte) 103) == 0) {
            class6.field48 = false;
        }
        if (class6.field48) {
            if (class67.field908) {
                class102.method738(arg4, arg5, arg1, arg2, 0);
            } else {
                class38.method224(arg4, arg5, arg1, arg2, 0);
            }
            class301.method2052(false, (byte) -116, class175.field2382);
        }
        if (!arg3 && !class6.field48 && !class100.field1380 && arg4 <= class55.field751 && class55.field751 < arg1 + arg4 && class82.field1189 >= arg5 && (arg2 + arg5) > class82.field1189) {
            class35.method195(arg2, class55.field751, arg5, class82.field1189, arg1, arg4, true);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZII)I", line = 304)
    public static final int method658(int arg0, boolean arg1, int arg2, int arg3) {
        field1219++;
        if (!arg1) {
            return 33;
        }
        int var4 = class184.field2527[class50.method311(arg2, arg3)];
        if (arg0 > 0) {
            int var5 = class184.field2543.method666(arg0 & 0xFFFF, -93);
            if (var5 != 0) {
                int var6;
                if (arg3 < 0) {
                    var6 = 0;
                } else if (arg3 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg3 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var6 & 0xFF00) * var5 + ((var4 & 0xFF00) * var8) & 0xFF0000) >> 8;
                }
            }
            int var9 = class184.field2543.method674(255, arg0 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = (var4 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = ((var4 & 0xFF00) >> 8) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = ((var10 & 0x2800FF00) << 8) + (var12 & 0xFF00) + (var11 >> 8);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 776)
    public class85() {
        this.field1238 = -50;
        this.field1220 = 0.69921875F;
        this.field1231 = 0;
        this.field1228 = -60;
        this.field1226 = class139.field1907;
        this.field1239 = 1.2F;
        this.field1214 = -50;
        this.field1222 = 1.1523438F;
        this.field1233 = class139.field1905;
        if (class207.field2979 != null) {
            this.field1230 = class75.method553(class207.field2979[0], class207.field2979[1], class207.field2979[2], class207.field2979[3], class207.field2979[4], class207.field2979[5]);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lcg;)V", line = 794)
    public class85(class316 arg0) {
        int var2 = arg0.method2219(16448);
        if ((var2 & 0x1) == 0) {
            this.field1233 = class139.field1905;
        } else {
            this.field1233 = arg0.method2172((byte) 71);
        }
        if ((var2 & 0x2) == 0) {
            this.field1222 = 1.1523438F;
        } else {
            this.field1222 = (float) arg0.method2220((byte) 103) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field1220 = 0.69921875F;
        } else {
            this.field1220 = (float) arg0.method2220((byte) 37) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field1239 = 1.2F;
        } else {
            this.field1239 = (float) arg0.method2220((byte) 111) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1228 = -60;
            this.field1214 = -50;
            this.field1238 = -50;
        } else {
            this.field1214 = arg0.method2161(28984);
            this.field1228 = arg0.method2161(28984);
            this.field1238 = arg0.method2161(28984);
        }
        if ((var2 & 0x20) == 0) {
            this.field1226 = class139.field1907;
        } else {
            this.field1226 = arg0.method2172((byte) 71);
        }
        if ((var2 & 0x40) == 0) {
            this.field1231 = 0;
        } else {
            this.field1231 = arg0.method2220((byte) 114);
        }
        if ((var2 & 0x80) != 0) {
            this.field1230 = class75.method553(arg0.method2220((byte) 98), arg0.method2220((byte) 83), arg0.method2220((byte) 116), arg0.method2220((byte) 69), arg0.method2220((byte) 94), arg0.method2220((byte) 43));
        } else if (class207.field2979 != null) {
            this.field1230 = class75.method553(class207.field2979[0], class207.field2979[1], class207.field2979[2], class207.field2979[3], class207.field2979[4], class207.field2979[5]);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIILdn;JLdn;Ldn;)V", line = 378)
    public static final void method659(int arg0, int arg1, int arg2, int arg3, class132 arg4, long arg5, class132 arg6, class132 arg7) {
        class186 var9 = new class186();
        var9.field2575 = arg4;
        var9.field2563 = arg1 * 128 + 64;
        var9.field2573 = arg2 * 128 + 64;
        var9.field2561 = arg3;
        var9.field2567 = arg5;
        var9.field2568 = arg6;
        var9.field2570 = arg7;
        int var10 = 0;
        class202 var11 = class142.field1940[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2875; var12++) {
                class280 var13 = var11.field2896[var12];
                if ((var13.field4203 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4199.method105();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2562 = -var10;
        if (class142.field1940[arg0][arg1][arg2] == null) {
            class142.field1940[arg0][arg1][arg2] = new class202(arg0, arg1, arg2);
        }
        class142.field1940[arg0][arg1][arg2].field2887 = var9;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lcg;I)V", line = 433)
    public final void method660(class316 arg0, int arg1) {
        if (arg1 != -25667) {
            this.field1237 = 1.0603658F;
        }
        this.field1237 = (float) (arg0.method2219(arg1 + 42115) * 8) / 255.0F;
        field1215++;
        this.field1218 = (float) (arg0.method2219(16448) * 8) / 255.0F;
        this.field1227 = (float) (arg0.method2219(16448) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZZIIII)V", line = 450)
    public static final void method661(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field1240++;
        if (!arg3 && class237.field3368 == arg0 && class320.field4877 == arg7 && class270.field4028 == arg5 || class154.method1113(-114)) {
            return;
        }
        class320.field4877 = arg7;
        class270.field4028 = arg5;
        class237.field3368 = arg0;
        if (class154.method1113(-128)) {
            class270.field4028 = 0;
        }
        if (arg2) {
            class189.method1325(1, 28);
        } else {
            class189.method1325(1, 25);
        }
        class301.method2052(true, (byte) -128, class175.field2382);
        int var8 = class296.field4394;
        class296.field4394 = arg7 * 8 - 48;
        int var9 = class132.field1809;
        class132.field1809 = arg0 * 8 - 48;
        class131.field1798 = class226.method1589(class320.field4877 * 8, class237.field3368 * 8, 0);
        int var10 = class296.field4394 - var8;
        int var11 = class296.field4394;
        class111.field1506 = null;
        int var12 = class132.field1809 - var9;
        int var13 = class132.field1809;
        if (arg2) {
            class338.field5084 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class329 var18 = class42.field484[var17];
                if (var18 != null) {
                    var18.field3679 -= var10 * 128;
                    var18.field3745 -= var12 * 128;
                    if (var18.field3745 >= 0 && var18.field3745 <= 13184 && var18.field3679 >= 0 && var18.field3679 <= 13184) {
                        for (int var19 = 0; var19 < 10; var19++) {
                            var18.field3706[var19] -= var12;
                            var18.field3768[var19] -= var10;
                        }
                        class257.field3807[class338.field5084++] = var17;
                    } else {
                        class42.field484[var17].method2301((class181) null, (byte) -6);
                        class42.field484[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class329 var15 = class42.field484[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field3706[var16] -= var12;
                        var15.field3768[var16] -= var10;
                    }
                    var15.field3679 -= var10 * 128;
                    var15.field3745 -= var12 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class241 var21 = class169.field2306[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field3706[var22] -= var12;
                    var21.field3768[var22] -= var10;
                }
                var21.field3745 -= var12 * 128;
                var21.field3679 -= var10 * 128;
            }
        }
        class251.field3603 = arg5;
        byte var23 = 104;
        byte var24 = 0;
        byte var25 = 1;
        if (var12 < 0) {
            var25 = -1;
            var23 = -1;
            var24 = 103;
        }
        byte var26 = 104;
        class173.field2356.method1645(arg6, arg4, false, -68);
        byte var27 = 1;
        byte var28 = 0;
        if (var10 < 0) {
            var27 = -1;
            var26 = -1;
            var28 = 103;
        }
        for (int var29 = var24; var29 != var23; var29 += var25) {
            for (int var30 = var28; var30 != var26; var30 += var27) {
                int var31 = var30 + var10;
                int var32 = var12 + var29;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var32 >= 0 && var31 >= 0 && var32 < 104 && var31 < 104) {
                        class246.field3544[var33][var29][var30] = class246.field3544[var33][var32][var31];
                    } else {
                        class246.field3544[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class238 var34 = (class238) class53.field706.method1335(1); var34 != null; var34 = (class238) class53.field706.method1336(3)) {
            var34.field3370 -= var10;
            var34.field3384 -= var12;
            if (var34.field3384 < 0 || var34.field3370 < 0 || var34.field3384 >= 104 || var34.field3370 >= 104) {
                var34.method1274((byte) -26);
            }
        }
        if (arg2) {
            class106.field1424 -= var12;
            class275.field4123 -= var10 * 128;
            class74.field1024 -= var10;
            class66.field870 -= var10;
            class198.field2820 -= var12 * 128;
            class314.field4737 -= var12;
        } else {
            class343.field5168 = 1;
        }
        if (class167.field2278 != 0) {
            class288.field4282 -= var10;
            class167.field2278 -= var12;
        }
        class48.field591 = 0;
        if (class67.field908 && arg2 && (Math.abs(var12) > 104 || Math.abs(var10) > 104)) {
            class207.method1463((byte) -97);
        }
        class336.field5060 = -1;
        class332.field4994.method1345(-59);
        class159.field2178.method1345(-115);
        if (arg1 != 13184) {
            field1234 = (class133) null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 704)
    public static final void method662(boolean arg0) {
        if (!arg0) {
            field1216 = (class341) null;
        }
        field1223++;
        class121.field1628.method118((byte) -65);
        class187.field2581.method446(61);
        class315.field4745.method446(62);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZBI)V", line = 717)
    public static final void method663(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        class100.field1385 = 0L;
        field1217++;
        int var5 = class323.method2270(116);
        boolean var6 = false;
        if (arg0 == 3 || var5 == 3) {
            arg2 = true;
        }
        if (arg0 <= 0 != var5 <= 0) {
            var6 = true;
        }
        if (arg3 != 44) {
            field1236 = -58;
        }
        if (class80.field1164.startsWith("mac") && arg0 > 0) {
            arg2 = true;
        }
        if (arg2 && arg0 > 0) {
            var6 = true;
        }
        class98.method711(arg0, arg1, arg2, (byte) -119, var6, var5, arg4);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Z", line = 750)
    public static final boolean method664(int arg0, int arg1) {
        field1229++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class54.field722[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1002) {
            return true;
        } else {
            if (arg1 != 2000) {
                field1235 = (byte[][]) ((byte[][]) null);
            }
            return false;
        }
    }
}
