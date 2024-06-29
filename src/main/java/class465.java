import jagex3.jagmisc.jagmisc;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class465 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field6392 = 0;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Llh;")
    public static class487 field6394 = new class487(77, 3);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field6395;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field6396;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2628(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I", line = 4)
    public static final int method2623(int arg0) {
        field6395++;
        if (!class366.field4875.field9362) {
            for (int var1 = 0; var1 < class356.field4730; var1++) {
                if (class378.field5057[var1].method1853(-29475) == 's' || class378.field5057[var1].method1853(-29475) == 'S') {
                    class366.field4875.field9362 = true;
                    break;
                }
            }
        }
        if (class543.field7350 == class296.field4059) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class577.method3295((byte) 15);
            if (class700.field9925 == 0L) {
                class700.field9925 = var4;
            }
            if (var3 > 16384 && (var4 - class700.field9925) < 5000L) {
                if (var4 - class704.field9961 > 1000L) {
                    System.gc();
                    class704.field9961 = var4;
                }
                return 0;
            }
        }
        if (class543.field7353 == class296.field4059) {
            if (class315.field4347 == null) {
                class315.field4347 = new class3(class654.field9099, class41.field477, class333.field4488, class193.field2743);
            }
            if (!class315.field4347.method3(122)) {
                return 0;
            }
            class109.method789(0, null, 0);
            class499.field6777 = !class254.method1566(false);
            class30.field383 = class162.method1141(false, class499.field6777 ? 34 : 32, 1, 0);
            class568.field8015 = class162.method1141(false, 33, 1, 0);
            class55.field627 = class162.method1141(false, 13, 1, 0);
        }
        if (class543.field7354 == class296.field4059) {
            class568.field8015.method3620((byte) 2);
            int var6 = class372.field5017[33].method853(true);
            int var7 = var6 + class372.field5017[class499.field6777 ? 34 : 32].method853(true);
            int var8 = var7 + class372.field5017[13].method853(true);
            int var9 = var8 + class568.field8015.method3647(2);
            if (var9 != 400) {
                return var9 / 4;
            }
            class61.field698 = class30.field383.method3652((byte) 27);
            class203.field2862 = class568.field8015.method3652((byte) 27);
            class325.method1948(class30.field383, 115);
            int var10 = class366.field4875.field9336;
            class674.field9525 = new class207(class219.field3065, class697.field9900, class568.field8015);
            int[] var11 = class674.field9525.method1341(var10, 123);
            class14 var12 = new class14(class30.field383, class55.field627);
            if (var11.length > 0) {
                class610.field8464 = new class374[var11.length];
                for (int var13 = 0; var13 < class610.field8464.length; var13++) {
                    class610.field8464[var13] = new class477(class674.field9525.method1343(1, var11[var13]), var12);
                }
            }
        }
        if (class543.field7355 == class296.field4059) {
            class378.method2168(class55.field627, -2, class30.field383, class414.method2402((byte) 114));
        }
        if (class543.field7356 == class296.field4059) {
            int var14 = class548.method3081((byte) -38);
            int var15 = class568.method3256((byte) -14);
            if (var15 > var14) {
                return var14 * 100 / var15;
            }
        }
        if (class543.field7357 == class296.field4059) {
            if (class610.field8464 != null && class610.field8464.length > 0) {
                if (class610.field8464[0].method2152(true) < 100) {
                    return 0;
                }
                if (class610.field8464.length > 1 && class674.field9525.method1342(924) && class610.field8464[1].method2152(true) < 100) {
                    return 0;
                }
            }
            class24.method237(class334.field4506, 87);
            class574.method3276((byte) 80, class334.field4506);
            class178.method1232(1, (byte) 90);
        }
        if (class543.field7358 == class296.field4059) {
            for (int var16 = 0; var16 < 4; var16++) {
                class151.field2218[var16] = class131.method928(class401.field5620, 1, class257.field3508);
            }
        }
        if (class543.field7359 == class296.field4059) {
            class508.field6961 = class162.method1141(false, 8, 1, 0);
            class419.field5912 = class162.method1141(false, 0, 1, 0);
            class330.field4459 = class162.method1141(false, 1, 1, 0);
            class565.field7749 = class162.method1141(false, 2, 1, 0);
            class402.field5641 = class162.method1141(false, 3, 1, 0);
            class23.field279 = class162.method1141(false, 4, 1, 0);
            class609.field8458 = class162.method1141(true, 5, 1, 0);
            class481.field6621 = class162.method1141(true, 6, 1, 0);
            class125.field1812 = class162.method1141(false, 7, 1, 0);
            class412.field5848 = class162.method1141(false, 9, 1, 0);
            class378.field5060 = class162.method1141(false, 10, 1, 0);
            class700.field9930 = class162.method1141(false, 11, 1, 0);
            class221.field3091 = class162.method1141(false, 12, 1, 0);
            class76.field992 = class162.method1141(false, 14, 1, 0);
            class442.field6134 = class162.method1141(false, 15, 1, 0);
            class523.field7097 = class162.method1141(false, 16, 1, 0);
            class341.field4579 = class162.method1141(false, 17, 1, 0);
            class630.field8745 = class162.method1141(false, 18, 1, 0);
            class697.field9899 = class162.method1141(false, 19, 1, 0);
            class314.field4343 = class162.method1141(false, 20, 1, 0);
            class84.field1250 = class162.method1141(false, 21, 1, 0);
            class13.field137 = class162.method1141(false, 22, 1, 0);
            class114.field1580 = class162.method1141(true, 23, 1, 0);
            class69.field932 = class162.method1141(false, 24, 1, 0);
            class589.field8274 = class162.method1141(false, 25, 1, 0);
            class507.field6953 = class162.method1141(true, 26, 1, 0);
            class360.field4757 = class162.method1141(false, 27, 1, 0);
            class609.field8459 = class162.method1141(true, 28, 1, 0);
            class426.field5969 = class162.method1141(false, 29, 1, 0);
            class227.field3162 = class162.method1141(true, 30, 1, 0);
            class605.field8413 = class162.method1141(true, 31, 1, 0);
        }
        if (class543.field7360 == class296.field4059) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class372.field5017[var18] != null) {
                    var17 += class372.field5017[var18].method853(true) * class454.field6294[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class16.field165 < 0) {
                    class16.field165 = var17;
                }
                return (var17 - class16.field165) * 100 / (100 - class16.field165);
            }
            class16.method81(class508.field6961, 63);
            class378.method2168(class55.field627, -2, class508.field6961, class414.method2402((byte) 118));
        }
        if (class543.field7361 == class296.field4059) {
            class23.method234((byte) 115);
            class178.method1232(2, (byte) 53);
        }
        if (class543.field7362 == class296.field4059) {
            class653.method3685(7, class227.field3162, class543.field7374);
        }
        if (class543.field7363 == class296.field4059) {
            int var19 = class245.method1519(48);
            if (var19 < 100) {
                return var19;
            }
            class35.method312(class609.field8459.method3632(true, 1), false);
            class263.method1609(class609.field8459.method3632(true, 3), (byte) -49);
        }
        if (class543.field7364 == class296.field4059) {
            if (class227.field3163 != -1 && !class125.field1812.method3630(0, class227.field3163, -124)) {
                return 99;
            }
            class345.field4629 = new class285(class507.field6953, class412.field5848, class508.field6961);
            class71.field952 = new class338(class219.field3065, class697.field9900, class565.field7749);
            class198.field2828 = new class433(class219.field3065, class697.field9900, class565.field7749);
            class542.field7338 = new class593(class219.field3065, class697.field9900, class565.field7749, class508.field6961);
            class545.field7395 = new class113(class219.field3065, class697.field9900, class341.field4579);
            class389.field5502 = new class456(class219.field3065, class697.field9900, class565.field7749);
            class322.field4389 = new class627(class219.field3065, class697.field9900, class565.field7749);
            class85.field1251 = new class582(class219.field3065, class697.field9900, class565.field7749, class125.field1812);
            class557.field7504 = new class32(class219.field3065, class697.field9900, class565.field7749);
            class683.field9761 = new class13(class219.field3065, class697.field9900, class565.field7749);
            class475.field6543 = new class476(class219.field3065, class697.field9900, true, class523.field7097, class125.field1812);
            class123.field1685 = new class660(class219.field3065, class697.field9900, class565.field7749, class508.field6961);
            class643.field8871 = new class40(class219.field3065, class697.field9900, class565.field7749, class508.field6961);
            class347.field4640 = new class454(class219.field3065, class697.field9900, true, class630.field8745, class125.field1812);
            class599.field8366 = new class706(class219.field3065, class697.field9900, true, class71.field952, class697.field9899, class125.field1812);
            class202.field2859 = new class16(class219.field3065, class697.field9900, class565.field7749);
            class192.field2727 = new class549(class219.field3065, class697.field9900, class314.field4343, class419.field5912, class330.field4459);
            class433.field6033 = new class668(class219.field3065, class697.field9900, class565.field7749);
            class444.field6147 = new class599(class219.field3065, class697.field9900, class565.field7749);
            class430.field5994 = new class341(class219.field3065, class697.field9900, class84.field1250, class125.field1812);
            class173.field2514 = new class182(class219.field3065, class697.field9900, class565.field7749);
            class185.field2680 = new class361(class219.field3065, class697.field9900, class565.field7749);
            class166.field2417 = new class412(class219.field3065, class697.field9900, class565.field7749);
            class333.field4490 = new class355(class219.field3065, class697.field9900, class13.field137);
            class59.field667 = new class509(class219.field3065, class697.field9900, class565.field7749);
            class396.method2327(class125.field1812, class402.field5641, 102, class508.field6961, class55.field627);
            class449.method2553(2, class426.field5969);
            class292.field4019 = new class125(class697.field9900, class69.field932, class589.field8274);
            class213.field2984 = new class700(class697.field9900, class69.field932, class589.field8274, new class53());
            class148.method1085(-743175167);
            class475.field6543.method2683(50, !class366.field4875.method537(class503.field6917, 0));
            class578.field8156 = new class121();
            class628.method3511((byte) -108);
            class502.method2879(class360.field4757, (byte) 127);
            class521.method2968(class125.field1812, 16383, class345.field4629);
            class605 var20 = new class605(class378.field5060.method3642(89, "", "huffman"));
            class268.method1634(var20, (byte) -121);
            try {
                jagmisc.init();
            } catch (Throwable var30) {
            }
            class541.field7317 = class577.method3296((byte) 94);
            class652.field9066 = new class197(true, class543.field7374);
        }
        if (class543.field7366 == class296.field4059) {
            int var21 = class181.method1246((byte) -119, class508.field6961) + class688.method3878((byte) 116, true);
            int var22 = class4.method8(16) + class568.method3256((byte) -93);
            if (var22 > var21) {
                return var21 * 100 / var22;
            }
        }
        int var23 = 77 % ((-arg0 - 26) / 36);
        if (class543.field7367 == class296.field4059) {
            class510.method2929(class114.field1580, class389.field5502, class322.field4389, class475.field6543, class123.field1685, class643.field8871, class578.field8156);
        }
        if (class543.field7368 == class296.field4059) {
            class675.field9526 = new String[class185.field2680.field4761];
            class588.field8266 = new boolean[class166.field2417.field5838];
            class324.field4421 = new int[class166.field2417.field5838];
            for (int var24 = 0; var24 < class166.field2417.field5838; var24++) {
                if (class166.field2417.method2396((byte) 82, var24).field9716 == 0) {
                    class588.field8266[var24] = true;
                    field6392++;
                }
                class324.field4421[var24] = -1;
            }
            class162.method1144(1000000);
            class80.field1209 = class402.field5641.method3643("loginscreen", 1);
            class606.field8431 = class402.field5641.method3643("lobbyscreen", 1);
            class609.field8458.method3622(false, false, true);
            class481.field6621.method3622(true, false, true);
            class508.field6961.method3622(true, false, true);
            class55.field627.method3622(true, false, true);
            class378.field5060.method3622(true, false, true);
            class402.field5641.method3622(true, false, true);
            class108.field1496 = true;
            class565.field7749.field8990 = 2;
            class341.field4579.field8990 = 2;
            class523.field7097.field8990 = 2;
            class630.field8745.field8990 = 2;
            class697.field9899.field8990 = 2;
            class314.field4343.field8990 = 2;
            class84.field1250.field8990 = 2;
        }
        if (class543.field7369 == class296.field4059) {
            if (!client.method1683(class80.field1209, (byte) 103)) {
                return 0;
            }
            for (int var25 = 0; var25 < class167.field2439[class80.field1209].length; var25++) {
                class78 var26 = class167.field2439[class80.field1209][var25];
                if (var26.field1075 == 5 && var26.field1136 != -1) {
                    var26.method601((byte) 101, class334.field4506);
                }
            }
        }
        if (class543.field7370 == class296.field4059) {
            for (int var27 = 0; var27 < class167.field2439[class80.field1209].length; var27++) {
                class78 var28 = class167.field2439[class80.field1209][var27];
                if (var28.field1075 == 5 && var28.field1136 != -1 && var28.method601((byte) 101, class334.field4506) == null && class346.field4634) {
                    return 0;
                }
            }
        }
        if (class543.field7371 == class296.field4059) {
            class570.method3266(true, -12236);
        }
        if (class543.field7372 == class296.field4059) {
            class618.field8608.method265((byte) -123);
            try {
                class308.field4258.join();
            } catch (InterruptedException var29) {
                return 0;
            }
            class618.field8608 = null;
            class610.field8464 = null;
            class308.field4258 = null;
            class30.field383 = null;
            class674.field9525 = null;
            class568.field8015 = null;
            class628.method3509(-1);
            class214.field3017 = class366.field4875.field9362;
            class366.field4875.field9362 = true;
            class366.field4875.method543(class543.field7374, (byte) 106);
            if (class214.field3017) {
                class203.method1327((byte) 63, 0);
            } else {
                class203.method1327((byte) 63, class366.field4875.field9372);
            }
            class75.method584(-1, false, class366.field4875.field9370, -1, (byte) -102);
            class24.method237(class334.field4506, 40);
            class574.method3276((byte) 48, class334.field4506);
            class375.method2156(class334.field4506, class508.field6961, 0);
            class623.method3462(class382.field5248, -18469);
        }
        return class636.method3553(1);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLr;)V", line = 446)
    public static final void method2624(boolean arg0, class166 arg1) {
        if (class541.field7327) {
            class476.method2690(arg1, (byte) -124);
        } else {
            class362.method2063(arg1, -32768);
        }
        field6391++;
        if (!arg0) {
            field6394 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BZLjava/awt/Component;)Loca;", line = 468)
    public static final class239 method2625(byte arg0, boolean arg1, Component arg2) {
        field6390++;
        try {
            Constructor var3 = Class.forName("nl").getDeclaredConstructor(field6396 == null ? (field6396 = method2628("java.awt.Component")) : field6396, Boolean.TYPE);
            if (arg0 != -95) {
                method2624(false, null);
            }
            return (class239) var3.newInstance(arg2, Boolean.valueOf(arg1));
        } catch (Throwable var4) {
            return new class583(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 485)
    public static void method2626(int arg0) {
        field6394 = null;
        if (arg0 != -5201) {
            method2624(false, null);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 496)
    public static final String method2627(String arg0, int arg1) {
        field6393++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        if (arg1 <= 108) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && (var4 + 2) < var3) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + 10 - 'a';
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + '\n' - 65;
                }
                char var9 = arg0.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 + var10 - '0';
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var9 + var10 + '\n' - 97;
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + var10 + 10 - 65;
                }
                var4 += 2;
                if (var11 != 0 && class88.method646((byte) var11, -65)) {
                    var2.append(class435.method2490(-128, (byte) var11));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }
}
