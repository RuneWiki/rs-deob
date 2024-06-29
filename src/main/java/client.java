import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class286 {

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lbj;")
    public static class162 field3216;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "J")
    public static long field3218;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lza;")
    public static class288 field3213;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field3220;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
    public static int[] field3219;

    static {
        new class309("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field3216 = new class162(77, -1);
        field3218 = -1L;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 6)
    public static final void method1352() {
        for (int var0 = 0; var0 < class339.field5099; var0++) {
            int[] var1 = class316.field4800[var0];
            for (int var2 = 0; var2 < class484.field7129; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 26)
    public static final void method1353(int arg0) {
        int var1 = class229.field3560;
        int[] var2 = class316.field4782;
        int var3 = class460.field6852 ? var1 : class341.field5128 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class535 var5;
            if (var4 < var1) {
                var5 = class73.field1444[var2[var4]];
            } else {
                var5 = ((class435) class209.field3337.method1622((long) class515.field7477[var4 - var1], 115)).field6471;
            }
            if (var5.field6084 == arg0) {
                var5.field7832 = 0;
                if (var5.field7829 < 0) {
                    var5.field7782 = false;
                } else {
                    int var6 = var5.method2241(-73);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6073 & 0x7F) != 0 || (var5.field6078 & 0x7F) != 0) {
                            var5.field7782 = false;
                            continue;
                        }
                    } else if ((var5.field6073 & 0x7F) != 64 || (var5.field6078 & 0x7F) != 64) {
                        var5.field7782 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6073 >> 7;
                        int var8 = var5.field6078 >> 7;
                        if (class316.field4800[var7][var8] != var5.field7829) {
                            var5.field7782 = true;
                            continue;
                        }
                        if (class56.field1188[var7][var8] > 1) {
                            var10002 = class56.field1188[var7][var8]--;
                            var5.field7782 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field6073 - var9 >> 7;
                        int var11 = var5.field6078 - var9 >> 7;
                        int var12 = var5.field6073 + var9 >> 7;
                        int var13 = var5.field6078 + var9 >> 7;
                        if (!class404.method2516(25428, var12, var10, var5.field7829, var11, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class316.field4800[var14][var15] == var5.field7829) {
                                        var10002 = class56.field1188[var14][var15]--;
                                    }
                                }
                            }
                            var5.field7782 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class366 && var5.field7868 != null && class62.field1268 >= var5.field7868.field6479 && class62.field1268 < var5.field7868.field6486) {
                        ((class366) var5).field5340 = false;
                    }
                    var5.field7782 = false;
                    var5.field6083 = class483.method2899(var5.field6084, var5.field6073, var5.field6078, false);
                    class234.method1538(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BFFF)F", line = 148)
    public static final float method1354(byte arg0, float arg1, float arg2, float arg3) {
        if (arg0 != 59) {
            method1354((byte) 123, -0.6353191F, -0.5747528F, 1.2658622F);
        }
        field3196++;
        return (arg2 - arg1) * arg3 + arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)V", line = 160)
    private static final void method1355(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3208++;
        float var5 = (float) class319.field4865 / (float) class319.field4880;
        int var6 = arg2;
        int var7 = arg3;
        if (arg0 != -7) {
            field3216 = null;
        }
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = arg1 - (arg3 - var7) / 2;
        int var9 = arg4 - (arg2 - var6) / 2;
        class322.field4926 = -1;
        class71.field1437 = class319.field4880 * var9 / var6;
        class79.field1578 = -1;
        class457.field6775 = class319.field4865 - (class319.field4865 * var8 / var7);
        class191.method1295(arg0 ^ 0xFFFFFB93);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 189)
    private final void method1356(int arg0) {
        field3205++;
        if (class466.field6932 == 13) {
            return;
        }
        long var2 = class18.method124(true) / 1000000L - class520.field7563;
        class520.field7563 = class18.method124(true) / 1000000L;
        if (arg0 != -10) {
            this.init();
        }
        boolean var4 = class387.method2371(-127);
        if (var4 && class281.field4250 && class99.field1922 != null) {
            class99.field1922.method1493(true);
        }
        if (class445.method2659(arg0 + 10, class466.field6932)) {
            if (class80.field1594 != 0L && class80.field1594 < class423.method2578(-19698)) {
                class56.method509(class186.field2990.field2565, true, class13.method86(arg0 + 13), class186.field2990.field2528, false);
            } else if (!class262.field4006.method302() && class49.field997) {
                class486.method2914((byte) 80);
            }
        }
        if (class387.field5662 == null) {
            Container var5;
            if (class97.field1889 == null) {
                var5 = class497.field7305.field7072;
            } else {
                var5 = class97.field1889;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class97.field1889 == var5) {
                Insets var8 = class97.field1889.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class322.field4917 != var6 || class456.field6771 != var7) {
                if (class262.field4006 == null || class262.field4006.method383()) {
                    class17.method111(false);
                } else {
                    class322.field4917 = var6;
                    class456.field6771 = var7;
                }
                class80.field1594 = class423.method2578(-19698) + 500L;
            }
        }
        if (class387.field5662 != null && !class97.field1896 && class445.method2659(0, class466.field6932)) {
            class56.method509(-1, true, class186.field2990.field2536, -1, false);
        }
        boolean var9 = false;
        if (class370.field5436) {
            class370.field5436 = false;
            var9 = true;
        }
        if (var9) {
            class183.method1253(123);
        }
        if (class262.field4006 != null && class262.field4006.method302() || class13.method86(arg0 + 13) != 1) {
            class102.method895(0);
        }
        if (class466.field6932 == 0) {
            class160.method1147(class159.field2572, class87.field1781[class447.field6651], true, class379.field5543[class447.field6651], class174.field2805, var9, class119.field2089[class447.field6651]);
        } else if (class466.field6932 == 1) {
            class258.method1663(class87.field1781[class447.field6651].getRGB(), class379.field5543[class447.field6651].getRGB(), class119.field2089[class447.field6651].getRGB(), class262.field4006.method302() | var9, class262.field4006, 83, class356.field5232);
        } else if (class252.method1628(arg0 + 69, class466.field6932)) {
            class139.method1044((byte) 84);
        } else if (class36.method246(-9, class466.field6932)) {
            class139.method1044((byte) -11);
        } else if (class457.method2725(false, class466.field6932)) {
            if (class105.field1967 == 1) {
                if (class429.field6411 > class424.field6374) {
                    class424.field6374 = class429.field6411;
                }
                int var11 = (class424.field6374 - class429.field6411) * 50 / class424.field6374;
                class361.method2216((byte) -59, true, class470.field6980, class166.field2685.method1977(class146.field2452, -58) + "<br>(" + var11 + "%)");
            } else if (class105.field1967 == 2) {
                if (class299.field4527 > class307.field4652) {
                    class307.field4652 = class299.field4527;
                }
                int var10 = ((class307.field4652 - class299.field4527) * 50 / class307.field4652) + 50;
                class361.method2216((byte) -59, true, class470.field6980, class166.field2685.method1977(class146.field2452, 77) + "<br>(" + var10 + "%)");
            } else {
                class361.method2216((byte) -59, true, class470.field6980, class166.field2685.method1977(class146.field2452, -88));
            }
        } else if (class466.field6932 == 9) {
            class54.method508(arg0 ^ 0xFFFFFFF6, var2);
        } else if (class466.field6932 == 12) {
            class361.method2216((byte) -59, true, class470.field6980, class246.field3798.method1977(class146.field2452, -69) + "<br>" + class502.field7347.method1977(class146.field2452, arg0 ^ 0x2D));
        }
        if (class47.field974 == 3) {
            for (int var12 = 0; var12 < class108.field1986; var12++) {
                Rectangle var13 = class31.field498[var12];
                if (class420.field6338[var12]) {
                    class262.field4006.method1809(var13.y, var13.x, -1996553985, var13.height, var13.width, -7456);
                } else if (class188.field3023[var12]) {
                    class262.field4006.method1809(var13.y, var13.x, -1996554240, var13.height, var13.width, arg0 ^ 0x1D16);
                }
            }
        }
        if (class259.method1666(-97)) {
            class280.method1753(class262.field4006, (byte) 112);
        }
        if (class445.method2659(0, class466.field6932) && class47.field974 == 0 && class13.method86(arg0 ^ 0xFFFFFFF5) == 1 && !var9 && class480.field7089.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class108.field1986; var15++) {
                if (class188.field3023[var15]) {
                    class188.field3023[var15] = false;
                    class492.field7214[var14++] = class31.field498[var15];
                }
            }
            class262.field4006.method337(class492.field7214, var14);
        } else if (class466.field6932 != 0) {
            class262.field4006.method355();
            for (int var16 = 0; var16 < class108.field1986; var16++) {
                class188.field3023[var16] = false;
            }
        }
        if (class186.field2990.field2554 == 0) {
            class50.method470(15L, -5);
        } else if (class186.field2990.field2554 == 1) {
            class50.method470(10L, -5);
        } else if (class186.field2990.field2554 == 2) {
            class50.method470(5L, -5);
        } else if (class186.field2990.field2554 == 3) {
            class50.method470(2L, arg0 + 5);
        }
        if (class418.field6298) {
            class15.method103((byte) 117);
        }
        if (class186.field2990.field2566 && class466.field6932 == 2 && class155.field2523 != -1) {
            class186.field2990.field2566 = false;
            class186.field2990.method1787((byte) 99, class497.field7305);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 422)
    private final void method1357(byte arg0) {
        field3198++;
        if (class466.field6932 == 6 && class179.field2910 == 0) {
            if (class43.field593 > 0) {
                class43.field593--;
            }
            if (class483.field7115 > 1) {
                class509.field7423 = class112.field2032;
                class483.field7115--;
            }
            if (!class76.field1543) {
                class76.method686(arg0 - 62);
            }
            for (int var2 = 0; var2 < 100 && class435.method2607((byte) -82); var2++) {
            }
        }
        class5.field97++;
        class208.method1427(-1, 29000, -1, null);
        class360.method2215(-1, null, -1, (byte) -42);
        class475.method2841(-126);
        class112.field2032++;
        for (int var3 = 0; var3 < class334.field5054; var3++) {
            class163 var4 = class525.field7636[var3].field6471;
            if (var4 != null) {
                byte var5 = var4.field2613.field1047;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2241(-27);
                    if ((var5 & 0x2) != 0 && var4.field7863 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field7866[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class339.field5099 - var6 - 1 < var9) {
                                var9 = class339.field5099 - var6 - 1;
                            }
                            int var10 = var4.field7870[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > class484.field7129 - var6 - 1) {
                                var10 = class484.field7129 - var6 - 1;
                            }
                            int var11 = class3.method22(var4.field7870[0], 0, class67.field1367[var4.field6084], -1, var6, (byte) 60, var4.field7866[0], var6, true, var9, var10, 0, class372.field5445, var6, class210.field3354);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field7866[var12] = class210.field3354[var11 - var12 - 1];
                                    var4.field7870[var12] = class372.field5445[var11 - var12 - 1];
                                    var4.field7864[var12] = 1;
                                }
                                var4.field7863 = var11;
                            }
                        }
                    }
                    class145.method1076(var4, -128, true);
                    int var13 = class493.method2975(true, var4);
                    class124.method988(-653, class183.field2946, class166.field2688, var4, var13);
                    class311.method1983(var4, arg0 + 36);
                }
            }
        }
        if (arg0 != 62) {
            this.method1374((byte) -61);
        }
        if (class179.field2910 == 0 && class210.field3355 == 0) {
            if (class510.field7435 == 2) {
                class87.method803(-26657);
            } else {
                class78.method699(-65536);
            }
            if (class509.field7427 >> 7 < 14 || class339.field5099 - 14 <= class509.field7427 >> 7 || (class432.field6435 >> 7) < 14 || class432.field6435 >> 7 >= class484.field7129 - 14) {
                class193.method1307(-127);
            }
        }
        while (true) {
            class322 var14;
            class388 var15;
            class388 var16;
            do {
                var14 = (class322) class260.field3968.method1894((byte) -74);
                if (var14 == null) {
                    while (true) {
                        class322 var17;
                        class388 var18;
                        class388 var19;
                        do {
                            var17 = (class322) class177.field2863.method1894((byte) -113);
                            if (var17 == null) {
                                while (true) {
                                    class322 var20;
                                    class388 var21;
                                    class388 var22;
                                    do {
                                        var20 = (class322) class212.field3376.method1894((byte) -84);
                                        if (var20 == null) {
                                            if (class253.field3885 != null) {
                                                class292.method1903((byte) 119);
                                            }
                                            if ((class62.field1268 % 1500) == 0) {
                                                class41.method253(arg0 ^ 0x32);
                                            }
                                            if (class466.field6932 == 6 && class179.field2910 == 0) {
                                                class452.method2698(true);
                                            }
                                            class524.method3098(arg0 ^ 0x58);
                                            if (class166.field2690 && class423.method2578(arg0 ^ 0xFFFFB330) - 60000L > class404.field6098) {
                                                class177.method1213(arg0 ^ 0x3F);
                                            }
                                            for (class257 var23 = (class257) class441.field6536.method533((byte) -75); var23 != null; var23 = (class257) class441.field6536.method536(arg0 + 20)) {
                                                if ((long) var23.field3941 < class423.method2578(-19698) / 1000L - 5L) {
                                                    if (var23.field3943 > 0) {
                                                        class492.method2969("", 0, var23.field3938 + class20.field317.method1977(class146.field2452, 70), "", arg0 ^ 0x3E, 5);
                                                    }
                                                    if (var23.field3943 == 0) {
                                                        class492.method2969("", 0, var23.field3938 + class204.field3271.method1977(class146.field2452, -55), "", 0, 5);
                                                    }
                                                    var23.method2352((byte) 108);
                                                }
                                            }
                                            if (class466.field6932 == 6 && class179.field2910 == 0) {
                                                if (class216.field3417 == null) {
                                                    class391.method2414(false, 5424);
                                                    return;
                                                }
                                                class322.field4919++;
                                                if (class322.field4919 > 50) {
                                                    class327.field4965++;
                                                    class459.method2765(class317.field4802, (byte) 87);
                                                }
                                                try {
                                                    if (class216.field3417 != null && class335.field5062.field4399 > 0) {
                                                        class433.field6445 += class335.field5062.field4399;
                                                        class216.field3417.method2329(0, class335.field5062.field4399, 3, class335.field5062.field4408);
                                                        class335.field5062.field4399 = 0;
                                                        class322.field4919 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class391.method2414(false, arg0 ^ 0x150E);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field4918;
                                        if (var21.field5777 < 0) {
                                            break;
                                        }
                                        var22 = class271.method1716(27411, var21.field5728);
                                    } while (var22 == null || var22.field5819 == null || var22.field5819.length <= var21.field5777 || var22.field5819[var21.field5777] != var21);
                                    class495.method2982(var20);
                                }
                            }
                            var18 = var17.field4918;
                            if (var18.field5777 < 0) {
                                break;
                            }
                            var19 = class271.method1716(27411, var18.field5728);
                        } while (var19 == null || var19.field5819 == null || var18.field5777 >= var19.field5819.length || var19.field5819[var18.field5777] != var18);
                        class495.method2982(var17);
                    }
                }
                var15 = var14.field4918;
                if (var15.field5777 < 0) {
                    break;
                }
                var16 = class271.method1716(27411, var15.field5728);
            } while (var16 == null || var16.field5819 == null || var15.field5777 >= var16.field5819.length || var16.field5819[var15.field5777] != var15);
            class495.method2982(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lza;BJ)V", line = 712)
    public static final void method1358(class288 arg0, byte arg1, long arg2) {
        field3201++;
        class492.field7216 = 0;
        class273.field4149 = class274.field4163;
        class274.field4163 = 0;
        long var4 = class423.method2578(-19698);
        for (class53 var6 = (class53) class63.field1296.method533((byte) -127); var6 != null; var6 = (class53) class63.field1296.method536(101)) {
            if (var6.method494(arg0, arg2)) {
                class492.field7216++;
            }
        }
        if (arg1 > -82) {
            field3219 = null;
        }
        if (class255.field3908 && arg2 % 100L == 0L) {
            System.out.println("Particle system count: " + class63.field1296.method537((byte) -107) + ", running: " + class492.field7216 + ". Particles: " + class274.field4163 + ". Time taken: " + (class423.method2578(-19698) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 745)
    public static final void method1359() {
        class226.field3539 = 0;
        for (int var0 = 0; var0 < class341.field5128; var0++) {
            class163 var1 = ((class435) class209.field3337.method1622((long) class515.field7477[var0], 113)).field6471;
            if (var1.field7782 && var1.method1155(-93) != -1) {
                int var2 = (var1.method2241(-75) - 1) * 64 + 60;
                int var3 = var1.field6073 - var2 >> 7;
                int var4 = var1.field6078 - var2 >> 7;
                class535 var5 = class75.method678(var3, var1.field6084, (byte) -124, var4);
                if (var5 != null) {
                    int var6 = var5.field7789;
                    if (var5 instanceof class163) {
                        var6 += 2048;
                    }
                    if (var5.field7832 == 0 && var5.method1155(-127) != -1) {
                        class344.field5141[class226.field3539] = var6;
                        class252.field3875[class226.field3539] = var6;
                        class226.field3539++;
                        var5.field7832++;
                    }
                    class344.field5141[class226.field3539] = var6;
                    class252.field3875[class226.field3539] = var1.field7789 + 2048;
                    class226.field3539++;
                    var5.field7832++;
                }
            }
        }
        class264.method1689(0, class226.field3539 - 1, class344.field5141, class252.field3875, -93);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lgh;IIIIIIIII)V", line = 796)
    public static final void method1360(class388[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class388 var11 = arg0[var10];
            if (var11 != null && var11.field5728 == arg1) {
                int var12 = var11.field5701 + arg6;
                int var13 = var11.field5778 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field5784 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field5745 + var12;
                    int var19 = var11.field5712 + var13;
                    if (var11.field5784 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field5784 == 0 || var11.field5732 || method1371(var11).field1911 != 0 || class44.field779 == var11 || class235.field3628 == var11.field5765) {
                    if (!method1365(var11)) {
                        if (class253.field3885 == var11) {
                            class488.field7186 = true;
                            class459.field6846 = var12;
                            class135.field2279 = var13;
                        }
                        if (var11.field5766 || var14 < var16 && var15 < var17) {
                            if (var11.field5669 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class322 var20 = (class322) class212.field3376.method1892(104); var20 != null; var20 = (class322) class212.field3376.method1893((byte) -2)) {
                                    if (var20.field4916) {
                                        var20.method1676(true);
                                        var20.field4918.field5723 = false;
                                    }
                                }
                                if (class247.field3812 == 0) {
                                    class253.field3885 = null;
                                    class44.field779 = null;
                                }
                                class218.field3435 = 0;
                                class84.field1745 = false;
                                class368.field5393 = false;
                                if (!class76.field1543) {
                                    class76.method686(0);
                                }
                            }
                            boolean var21;
                            if (class393.field5991.method132(95) >= var14 && class393.field5991.method139(-91) >= var15 && class393.field5991.method132(10) < var16 && class393.field5991.method139(-96) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class233.field3597 && var21) {
                                if (var11.field5775 >= 0) {
                                    class271.field4116 = var11.field5775;
                                } else if (var11.field5669) {
                                    class271.field4116 = -1;
                                }
                            }
                            if (!class76.field1543 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class387.method2368(var11, -91, arg9 - var13, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class393.field5991.method131((byte) -125) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class356 var24 = (class356) class293.field4478.method1892(94);
                            if (var24 != null && var24.method50(8) == 0 && var24.method52(-128) >= var14 && var24.method54(false) >= var15 && var24.method52(-80) < var16 && var24.method54(false) < var17) {
                                var23 = true;
                            }
                            if (var11.field5720 != null) {
                                for (int var25 = 0; var25 < var11.field5720.length; var25++) {
                                    if (class179.field2912.method1458(100, var11.field5720[var25])) {
                                        if (var11.field5817 == null || class62.field1268 >= var11.field5817[var25]) {
                                            byte var26 = var11.field5668[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class179.field2912.method1458(100, 86) && !class179.field2912.method1458(100, 82) && !class179.field2912.method1458(100, 81)) && ((var26 & 0x2) == 0 || class179.field2912.method1458(100, 86)) && ((var26 & 0x1) == 0 || class179.field2912.method1458(100, 82)) && ((var26 & 0x4) == 0 || class179.field2912.method1458(100, 81))) {
                                                if (var25 < 10) {
                                                    class379.method2334(var25 + 1, var11.field5700, "", -12689, -1);
                                                } else if (var25 == 10) {
                                                    class320.method2056(-122);
                                                    class99 var27 = method1371(var11);
                                                    class144.method1072(var27.field1918, var27.method881(20740), var11, false);
                                                    class101.field1932 = class67.method587(var11, 115);
                                                    if (class101.field1932 == null) {
                                                        class101.field1932 = "Null";
                                                    }
                                                    class373.field5465 = var11.field5729 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field5788[var25];
                                                if (var11.field5817 == null) {
                                                    var11.field5817 = new int[var11.field5720.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field5817[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field5817[var25] = class62.field1268 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field5817 != null) {
                                        var11.field5817[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class515.method3070(false, var24.method54(false) - var13, var11, var24.method52(-93) - var12);
                            }
                            if (class253.field3885 != null && class253.field3885 != var11 && var21 && method1371(var11).method888(-95)) {
                                class235.field3629 = var11;
                            }
                            if (class44.field779 == var11) {
                                class208.field3329 = true;
                                class409.field6190 = var12;
                                class318.field4841 = var13;
                            }
                            if (var11.field5732 || var11.field5765 != 0) {
                                if (var21 && class80.field1592 != 0 && var11.field5774 != null) {
                                    class322 var29 = new class322();
                                    var29.field4916 = true;
                                    var29.field4918 = var11;
                                    var29.field4914 = class80.field1592;
                                    var29.field4911 = var11.field5774;
                                    class212.field3376.method1885(false, var29);
                                }
                                if (class253.field3885 != null || class76.field1543 || class199.field3247 != var11.field5765 && class218.field3435 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field5765 != 0) {
                                    if (class154.field2507 == var11.field5765 || class335.field5065 == var11.field5765) {
                                        class46.field968 = var11;
                                        if (class299.field4519 != null) {
                                            class299.field4519.method2823((byte) -36, class262.field4006, var11.field5712);
                                        }
                                        if (class154.field2507 == var11.field5765) {
                                            if (!class76.field1543 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class518.method3074(arg9, arg8, 87, class262.field4006);
                                                for (class504 var30 = (class504) class243.field3768.method533((byte) -93); var30 != null; var30 = (class504) class243.field3768.method536(-124)) {
                                                    if (arg8 >= var30.field7364 && arg8 < var30.field7363 && arg9 >= var30.field7362 && arg9 < var30.field7367) {
                                                        class76.method686(0);
                                                        class71.method608(false, var30.field7365);
                                                    }
                                                }
                                            }
                                            class208.method1427(var13, 29000, var12, var11);
                                            continue;
                                        }
                                    }
                                    if (class235.field3628 == var11.field5765) {
                                        if (var11.method2389(class262.field4006, true) == null || class419.field6312 != 0 && class419.field6312 != 3 || class76.field1543 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field5800[var32];
                                        if (var31 < var33 || var31 > var11.field5786[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field5745 / 2;
                                        int var35 = var32 - var11.field5712 / 2;
                                        int var36;
                                        if (class510.field7435 == 4) {
                                            var36 = (int) class525.field7631 & 0x3FFF;
                                        } else {
                                            var36 = (int) class525.field7631 + class1.field49 & 0x3FFF;
                                        }
                                        int var37 = class407.field6169[var36];
                                        int var38 = class407.field6168[var36];
                                        if (class510.field7435 != 4) {
                                            var37 = (class60.field1242 + 256) * var37 >> 8;
                                            var38 = (class60.field1242 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class510.field7435 == 4) {
                                            var41 = (class344.field5142 >> 7) + (var39 >> 2);
                                            var42 = (class388.field5798 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class15.field266.method2241(-108) - 1) * 64;
                                            var41 = (class15.field266.field6073 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class15.field266.field6078 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class233.field3597 && (class364.field5326 & 0x40) != 0) {
                                            class388 var44 = class447.method2677(class341.field5130, 0, class506.field7383);
                                            if (var44 == null) {
                                                class320.method2056(-108);
                                            } else {
                                                class274.method1739(class101.field1932, 77, 49, 1L, var41, false, class220.field3455, " ->", true, var11.field5688, var42);
                                            }
                                            continue;
                                        }
                                        if (class424.field6366 == class209.field3343) {
                                            class274.method1739(class137.field2304.method1977(class146.field2452, -105), 36, 48, 1L, var41, false, -1, "", true, -1, var42);
                                        }
                                        class274.method1739(class7.field107, 112, 5, 1L, var41, false, class353.field5218, "", true, -1, var42);
                                        continue;
                                    }
                                    if (class199.field3247 == var11.field5765) {
                                        class67.field1371 = var11;
                                        if (var21) {
                                            class84.field1745 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method52(-62) - var12 - var11.field5745 / 2) * 2.0D / (double) class319.field4859);
                                            int var46 = (int) (-((double) (var24.method54(false) - var13 - var11.field5712 / 2) * 2.0D / (double) class319.field4859));
                                            int var47 = class71.field1437 + var45 + class319.field4876;
                                            int var48 = class457.field6775 + var46 + class319.field4869;
                                            class191 var49 = class193.method1305(-23338);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1294(var48, var47, 12800, var50);
                                            if (var50 != null) {
                                                if (class179.field2912.method1458(100, 82) && class239.field3706 > 0) {
                                                    class127.method1001(var50[2], var50[1], 63, var50[0]);
                                                    continue;
                                                }
                                                class368.field5393 = true;
                                                class447.field6661 = var50[0];
                                                class308.field4680 = var50[1];
                                                class442.field6559 = var50[2];
                                            }
                                            class218.field3435 = 1;
                                            class493.field7230 = false;
                                            class239.field3704 = class393.field5991.method132(103);
                                            class460.field6855 = class393.field5991.method139(-95);
                                            continue;
                                        }
                                        if (var22 && class218.field3435 > 0) {
                                            if (class218.field3435 == 1 && (class239.field3704 != class393.field5991.method132(28) || class460.field6855 != class393.field5991.method139(-96))) {
                                                class175.field2854 = class71.field1437;
                                                class237.field3661 = class457.field6775;
                                                class218.field3435 = 2;
                                            }
                                            if (class218.field3435 == 2) {
                                                class493.field7230 = true;
                                                class276.method1743(class175.field2854 + (int) ((double) (class239.field3704 - class393.field5991.method132(41)) * 2.0D / (double) class319.field4856), 0);
                                                class509.method3053(class237.field3661 - (int) ((double) (class460.field6855 - class393.field5991.method139(-107)) * 2.0D / (double) class319.field4856), -1);
                                            }
                                            continue;
                                        }
                                        if (class218.field3435 > 0 && !class493.field7230) {
                                            if ((class47.field971 == 1 || class290.method1882(-1453414076)) && class332.field5041 > 2) {
                                                class183.method1245(class460.field6855, (byte) -18, class239.field3704);
                                            } else if (class93.method846(true)) {
                                                class183.method1245(class460.field6855, (byte) -18, class239.field3704);
                                            }
                                        }
                                        class218.field3435 = 0;
                                        continue;
                                    }
                                    if (class442.field6563 == var11.field5765) {
                                        if (var22) {
                                            method1355(-7, class393.field5991.method139(-93) - var13, var11.field5745, var11.field5712, class393.field5991.method132(68) - var12);
                                        }
                                        continue;
                                    }
                                    if (class432.field6437 == var11.field5765) {
                                        class360.method2215(var13, var11, var12, (byte) -42);
                                        continue;
                                    }
                                }
                                if (!var11.field5769 && var23) {
                                    var11.field5769 = true;
                                    if (var11.field5832 != null) {
                                        class322 var51 = new class322();
                                        var51.field4916 = true;
                                        var51.field4918 = var11;
                                        var51.field4922 = var24.method52(-113) - var12;
                                        var51.field4914 = var24.method54(false) - var13;
                                        var51.field4911 = var11.field5832;
                                        class212.field3376.method1885(false, var51);
                                    }
                                }
                                if (var11.field5769 && var22 && var11.field5692 != null) {
                                    class322 var52 = new class322();
                                    var52.field4916 = true;
                                    var52.field4918 = var11;
                                    var52.field4922 = class393.field5991.method132(95) - var12;
                                    var52.field4914 = class393.field5991.method139(-76) - var13;
                                    var52.field4911 = var11.field5692;
                                    class212.field3376.method1885(false, var52);
                                }
                                if (var11.field5769 && !var22) {
                                    var11.field5769 = false;
                                    if (var11.field5680 != null) {
                                        class322 var53 = new class322();
                                        var53.field4916 = true;
                                        var53.field4918 = var11;
                                        var53.field4922 = class393.field5991.method132(51) - var12;
                                        var53.field4914 = class393.field5991.method139(-119) - var13;
                                        var53.field4911 = var11.field5680;
                                        class177.field2863.method1885(false, var53);
                                    }
                                }
                                if (var22 && var11.field5670 != null) {
                                    class322 var54 = new class322();
                                    var54.field4916 = true;
                                    var54.field4918 = var11;
                                    var54.field4922 = class393.field5991.method132(11) - var12;
                                    var54.field4914 = class393.field5991.method139(-114) - var13;
                                    var54.field4911 = var11.field5670;
                                    class212.field3376.method1885(false, var54);
                                }
                                if (!var11.field5723 && var21) {
                                    var11.field5723 = true;
                                    if (var11.field5790 != null) {
                                        class322 var55 = new class322();
                                        var55.field4916 = true;
                                        var55.field4918 = var11;
                                        var55.field4922 = class393.field5991.method132(94) - var12;
                                        var55.field4914 = class393.field5991.method139(-98) - var13;
                                        var55.field4911 = var11.field5790;
                                        class212.field3376.method1885(false, var55);
                                    }
                                }
                                if (var11.field5723 && var21 && var11.field5756 != null) {
                                    class322 var56 = new class322();
                                    var56.field4916 = true;
                                    var56.field4918 = var11;
                                    var56.field4922 = class393.field5991.method132(13) - var12;
                                    var56.field4914 = class393.field5991.method139(-92) - var13;
                                    var56.field4911 = var11.field5756;
                                    class212.field3376.method1885(false, var56);
                                }
                                if (var11.field5723 && !var21) {
                                    var11.field5723 = false;
                                    if (var11.field5812 != null) {
                                        class322 var57 = new class322();
                                        var57.field4916 = true;
                                        var57.field4918 = var11;
                                        var57.field4922 = class393.field5991.method132(5) - var12;
                                        var57.field4914 = class393.field5991.method139(-78) - var13;
                                        var57.field4911 = var11.field5812;
                                        class177.field2863.method1885(false, var57);
                                    }
                                }
                                if (var11.field5828 != null) {
                                    class322 var58 = new class322();
                                    var58.field4918 = var11;
                                    var58.field4911 = var11.field5828;
                                    class260.field3968.method1885(false, var58);
                                }
                                if (var11.field5808 != null && class448.field6671 > var11.field5783) {
                                    if (var11.field5743 == null || class448.field6671 - var11.field5783 > 32) {
                                        class322 var63 = new class322();
                                        var63.field4918 = var11;
                                        var63.field4911 = var11.field5808;
                                        class212.field3376.method1885(false, var63);
                                    } else {
                                        label691: for (int var59 = var11.field5783; var59 < class448.field6671; var59++) {
                                            int var60 = class533.field7747[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field5743.length; var61++) {
                                                if (var11.field5743[var61] == var60) {
                                                    class322 var62 = new class322();
                                                    var62.field4918 = var11;
                                                    var62.field4911 = var11.field5808;
                                                    class212.field3376.method1885(false, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5783 = class448.field6671;
                                }
                                if (var11.field5671 != null && class202.field3261 > var11.field5744) {
                                    if (var11.field5831 == null || class202.field3261 - var11.field5744 > 32) {
                                        class322 var68 = new class322();
                                        var68.field4918 = var11;
                                        var68.field4911 = var11.field5671;
                                        class212.field3376.method1885(false, var68);
                                    } else {
                                        label667: for (int var64 = var11.field5744; var64 < class202.field3261; var64++) {
                                            int var65 = class80.field1599[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field5831.length; var66++) {
                                                if (var11.field5831[var66] == var65) {
                                                    class322 var67 = new class322();
                                                    var67.field4918 = var11;
                                                    var67.field4911 = var11.field5671;
                                                    class212.field3376.method1885(false, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5744 = class202.field3261;
                                }
                                if (var11.field5829 != null && class46.field969 > var11.field5706) {
                                    if (var11.field5687 == null || class46.field969 - var11.field5706 > 32) {
                                        class322 var73 = new class322();
                                        var73.field4918 = var11;
                                        var73.field4911 = var11.field5829;
                                        class212.field3376.method1885(false, var73);
                                    } else {
                                        label643: for (int var69 = var11.field5706; var69 < class46.field969; var69++) {
                                            int var70 = class246.field3796[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field5687.length; var71++) {
                                                if (var11.field5687[var71] == var70) {
                                                    class322 var72 = new class322();
                                                    var72.field4918 = var11;
                                                    var72.field4911 = var11.field5829;
                                                    class212.field3376.method1885(false, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5706 = class46.field969;
                                }
                                if (var11.field5682 != null && class266.field4047 > var11.field5733) {
                                    if (var11.field5695 == null || class266.field4047 - var11.field5733 > 32) {
                                        class322 var78 = new class322();
                                        var78.field4918 = var11;
                                        var78.field4911 = var11.field5682;
                                        class212.field3376.method1885(false, var78);
                                    } else {
                                        label619: for (int var74 = var11.field5733; var74 < class266.field4047; var74++) {
                                            int var75 = class208.field3336[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field5695.length; var76++) {
                                                if (var11.field5695[var76] == var75) {
                                                    class322 var77 = new class322();
                                                    var77.field4918 = var11;
                                                    var77.field4911 = var11.field5682;
                                                    class212.field3376.method1885(false, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5733 = class266.field4047;
                                }
                                if (var11.field5711 != null && class434.field6457 > var11.field5730) {
                                    if (var11.field5748 == null || class434.field6457 - var11.field5730 > 32) {
                                        class322 var83 = new class322();
                                        var83.field4918 = var11;
                                        var83.field4911 = var11.field5711;
                                        class212.field3376.method1885(false, var83);
                                    } else {
                                        label595: for (int var79 = var11.field5730; var79 < class434.field6457; var79++) {
                                            int var80 = class432.field6438[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field5748.length; var81++) {
                                                if (var11.field5748[var81] == var80) {
                                                    class322 var82 = new class322();
                                                    var82.field4918 = var11;
                                                    var82.field4911 = var11.field5711;
                                                    class212.field3376.method1885(false, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5730 = class434.field6457;
                                }
                                if (class499.field7331 > var11.field5679 && var11.field5746 != null) {
                                    class322 var84 = new class322();
                                    var84.field4918 = var11;
                                    var84.field4911 = var11.field5746;
                                    class212.field3376.method1885(false, var84);
                                }
                                if (class398.field6037 > var11.field5679 && var11.field5815 != null) {
                                    class322 var85 = new class322();
                                    var85.field4918 = var11;
                                    var85.field4911 = var11.field5815;
                                    class212.field3376.method1885(false, var85);
                                }
                                if (class521.field7568 > var11.field5679 && var11.field5705 != null) {
                                    class322 var86 = new class322();
                                    var86.field4918 = var11;
                                    var86.field4911 = var11.field5705;
                                    class212.field3376.method1885(false, var86);
                                }
                                if (class422.field6359 > var11.field5679 && var11.field5735 != null) {
                                    class322 var87 = new class322();
                                    var87.field4918 = var11;
                                    var87.field4911 = var11.field5735;
                                    class212.field3376.method1885(false, var87);
                                }
                                if (class509.field7423 > var11.field5679 && var11.field5673 != null) {
                                    class322 var88 = new class322();
                                    var88.field4918 = var11;
                                    var88.field4911 = var11.field5673;
                                    class212.field3376.method1885(false, var88);
                                }
                                var11.field5679 = class112.field2032;
                                if (var11.field5713 != null) {
                                    for (int var89 = 0; var89 < class76.field1540; var89++) {
                                        class322 var90 = new class322();
                                        var90.field4918 = var11;
                                        var90.field4909 = class137.field2300[var89].method1923(false);
                                        var90.field4915 = class137.field2300[var89].method1924(-8478);
                                        var90.field4911 = var11.field5713;
                                        class212.field3376.method1885(false, var90);
                                    }
                                }
                                if (class366.field5365 && var11.field5830 != null) {
                                    class322 var91 = new class322();
                                    var91.field4918 = var11;
                                    var91.field4911 = var11.field5830;
                                    class212.field3376.method1885(false, var91);
                                }
                            }
                            if (var11.field5784 == 5 && var11.field5813 != -1) {
                                var11.method2387((byte) 98, class159.field2574, class464.field6883).method2823((byte) -24, class262.field4006, var11.field5712);
                            }
                            class534.method3153((byte) 99, var11);
                            if (var11.field5784 == 0) {
                                method1360(arg0, var11.field5700, var14, var15, var16, var17, var12 - var11.field5782, var13 - var11.field5740, arg8, arg9);
                                if (var11.field5819 != null) {
                                    method1360(var11.field5819, var11.field5700, var14, var15, var16, var17, var12 - var11.field5782, var13 - var11.field5740, arg8, arg9);
                                }
                                class141 var92 = (class141) class470.field6975.method1622((long) var11.field5700, -127);
                                if (var92 != null) {
                                    if (class424.field6366 == class316.field4779 && var92.field2338 == 0 && !class76.field1543 && var21 && !class321.field4902) {
                                        class76.method686(0);
                                    }
                                    class415.method2549(arg9, var12, 4, var17, var14, var13, var92.field2342, var15, arg8, var16);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class534.method3153((byte) 99, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 1701)
    private final void method1361(int arg0, int arg1) {
        field3217++;
        class450.field6699.field4156 = arg0;
        class190.field3070 = 0;
        class245.field3789 = null;
        if (arg1 != 2) {
            field3218 = -13L;
        }
        class450.field6699.field4153++;
        class408.field6180 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 1716)
    private final void method1362(byte[] arg0, int arg1) {
        if (arg1 != -1) {
            field3218 = 91L;
        }
        field3212++;
        class289 var3 = new class289(arg0);
        while (true) {
            while (true) {
                int var4 = var3.method1858(-3256);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class8.field112 = new int[6];
                    var5[0] = var3.method1841((byte) 23);
                    var5[1] = var3.method1841((byte) 90);
                    var5[2] = var3.method1841((byte) -12);
                    var5[3] = var3.method1841((byte) -119);
                    var5[4] = var3.method1841((byte) 37);
                    var5[5] = var3.method1841((byte) 51);
                } else if (var4 == 4) {
                    int var8 = var3.method1858(-3256);
                    class86.field1776 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class86.field1776[var9] = var3.method1841((byte) -125);
                        if (class86.field1776[var9] == 65535) {
                            class86.field1776[var9] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var6 = var3.method1858(arg1 - 3255);
                    class322.field4910 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class322.field4910[var7] = var3.method1841((byte) -118);
                        if (class322.field4910[var7] == 65535) {
                            class322.field4910[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 1791)
    public final void method1363(boolean arg0) {
        field3215++;
        if (class166.field2690) {
            class177.method1213(1);
        }
        if (class262.field4006 != null) {
            class262.field4006.method1802((byte) -65);
        }
        if (class387.field5662 != null) {
            class308.method1969(class497.field7305, class387.field5662, 1603251406);
            class387.field5662 = null;
        }
        if (!arg0) {
            method1365(null);
        }
        if (class216.field3417 != null) {
            class216.field3417.method2319((byte) 122);
            class216.field3417 = null;
        }
        if (class229.field3562 != null) {
            class229.field3562.method811(class262.field4007, (byte) -123);
        }
        class229.field3562 = null;
        class523.method3093(arg0);
        class450.field6699.method1737((byte) 95);
        class395.field6014.method1772(-67);
        if (class502.field7343 != null) {
            class502.field7343.method115(2);
            class502.field7343 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1835)
    public final void method1364(byte arg0) {
        method1377(true);
        field3203++;
        class460.method2770(true);
        class308.method1970(0);
        class18.method117(arg0 + 34);
        class309.method1976(false);
        class236.method1545(arg0 ^ 0x4246);
        class20.method135(3);
        class189.method1288((byte) 48);
        class261.method1675((byte) 90);
        class83.method784((byte) -119);
        class249.method1613(false);
        class286.method1798(-128);
        class449.method2684(arg0 - 18914);
        class383.method2355(-125);
        class341.method2150(1);
        class124.method987((byte) -102);
        class288.method1811(arg0 + 21);
        class481.method2891(-3);
        class14.method99(-87);
        class291.method1897(0);
        class222.method1481(-114);
        class378.method2324(100);
        class273.method1733((byte) -93);
        class284.method1774(arg0 + 18);
        class332.method2098((byte) 126);
        class179.method1223((byte) -26);
        class459.method2751(123);
        class331.method2092((byte) 109);
        class137.method1038(true);
        class395.method2459(3129);
        class200.method1385(arg0 - 3982);
        class329.method2078(-47);
        class75.method677(-107);
        class58.method522(false);
        class146.method1085(-26734);
        class231.method1531((byte) -79);
        class183.method1250(0);
        class339.method2127((byte) -108);
        class93.method845(arg0 + 140);
        class253.method1634(-98);
        class48.method465(0);
        class238.method1557((byte) -99);
        class34.method241(true);
        class403.method2511(24130);
        class390.method2412((byte) 80);
        class68.method592((byte) -3);
        class122.method979(arg0 ^ 0x79);
        class360.method2214(64);
        class19.method127((byte) -50);
        class216.method1449(true);
        class205.method1396((byte) 44);
        class78.method703(true);
        class27.method192(32767);
        class435.method2608(99);
        class43.method263((byte) 116);
        class186.method1271((byte) -125);
        class17.method112((byte) -96);
        class103.method899((byte) 91);
        class63.method548((byte) -74);
        class344.method2162(arg0 ^ 0xFFFFFFEB);
        class473.method2828(-32340);
        class60.method534((byte) 17);
        class388.method2380(-128);
        class39.method249(0);
        class366.method2245(-1);
        class160.method1142(2);
        class414.method2545((byte) 104);
        class439.method2617(25709);
        class289.method1870(29385);
        class535.method3162((byte) 105);
        class317.method2011(-31);
        class531.method3140((byte) -87);
        class169.method1186(-124);
        class506.method3034(45);
        class163.method1158(0);
        class141.method1052(2);
        class99.method884(-3813);
        class162.method1151(-115);
        class265.method1691(31757);
        class415.method2547(-96);
        class304.method1945((byte) -126);
        class108.method921(-10);
        class488.method2958((byte) 118);
        class382.method2353(false);
        class405.method2517(arg0 ^ 0xD);
        class87.method802(arg0 ^ 0x64);
        class407.method2526(2);
        class455.method2716(28923);
        class255.method1645((byte) 97);
        class454.method2713(-30451);
        class248.method1603(arg0 ^ 0x3995);
        class512.method3062((byte) -94);
        class491.method2964(false);
        class59.method530((byte) 127);
        class224.method1499(100);
        class156.method1133(arg0 - 101);
        class370.method2273(false);
        class119.method957(false);
        class452.method2701(2);
        class374.method2293(0);
        class396.method2461((byte) 4);
        class325.method2067((byte) 95);
        class352.method2183(14592);
        class306.method1948((byte) 115);
        class528.method3127(false);
        class177.method1214((byte) 16);
        class38.method248(arg0 ^ 0xFFFFFFEE);
        class51.method480(-14);
        class12.method73(4);
        class144.method1075((byte) 75);
        class15.method100(-125);
        class470.method2814(101);
        class502.method3024(false);
        class256.method1656(-124);
        class529.method3139(-128);
        class73.method629((byte) -70);
        class223.method1498(0);
        class229.method1514(-105);
        class387.method2375((byte) 37);
        class36.method244(-11168914);
        class275.method1741(true);
        class212.method1439((byte) -66);
        class457.method2723(arg0 - 30752);
        class293.method1909(196);
        class527.method3118((byte) -28);
        class499.method3010((byte) -112);
        class362.method2221(arg0 ^ 0x378C);
        class299.method1930(0);
        class402.method2508((byte) -7);
        class421.method2572(arg0 ^ 0xFFFFFFEB);
        class385.method2362(-51);
        class524.method3101(79);
        class53.method491();
        class436.method2611(arg0 ^ 0xFFFFFF9C);
        class166.method1169(arg0 ^ 0x6C);
        class386.method2366(arg0 ^ 0x2A8E);
        class368.method2253((byte) 76);
        class461.method2771(0);
        class498.method3007(arg0 ^ 0xFFFFFF23);
        class495.method2987();
        class319.method2047();
        class510.method3057(61);
        class97.method863(0);
        class126.method998();
        class482.method2894(31);
        class130.method1012((byte) 40);
        class42.method257(arg0 ^ 0xFFFF89A7);
        class330.method2084(0);
        class5.method40(arg0 - 103);
        class486.method2912(10030);
        class207.method1419(true);
        class215.method1446(22461);
        class247.method1599(-106);
        class450.method2691((byte) -12);
        class494.method2980(arg0 + 17);
        class113.method945(false);
        class318.method2027((byte) 126);
        class441.method2629(6);
        class61.method544(false);
        class281.method1764(124);
        class533.method3146(true);
        class443.method2637(-250);
        class534.method3152(arg0 + 20);
        class155.method1121(0);
        class45.method450(arg0 + 129);
        if (arg0 != -21) {
            return;
        }
        class278.method1750(true);
        class389.method2399(119);
        class520.method3084(arg0 + 85);
        class479.method2858((byte) -26);
        class181.method1241(-110);
        class90.method818();
        class41.method252((byte) -65);
        class380.method2339(false);
        class500.method3015(0);
        class139.method1046((byte) -88);
        class244.method1591(false);
        class507.method3041(arg0 ^ 0xFFFFFFEF);
        class322.method2061(true);
        class208.method1428((byte) -80);
        class384.method2358(arg0 ^ 0xFFFFFFF1);
        class456.method2721(29501);
        class519.method3078((byte) -106);
        class188.method1285(21243);
        class50.method469(-69);
        class210.method1430((byte) 1);
        class427.method2585(arg0 ^ 0xFFFFFFE3);
        class31.method220(117);
        class2.method21(arg0 + 148);
        class64.method571(arg0 ^ 0x14);
        class11.method62(125);
        class136.method1030(-1);
        class334.method2105(-15664);
        class202.method1392((byte) 68);
        class143.method1066(50);
        class307.method1963(arg0 - 13287);
        class230.method1521((byte) -121);
        class235.method1542(1542);
        class321.method2059(1);
        class22.method142(1977377160);
        class471.method2818((byte) -100);
        class484.method2902((byte) 95);
        class1.method4(0);
        class419.method2562((byte) -50);
        class416.method2553(-84);
        class161.method1150((byte) 119);
        class514.method3068((byte) 16);
        class250.method1624(-6484);
        class239.method1565((byte) -37);
        class327.method2072(8);
        class133.method1018(arg0 + 20);
        class199.method1381((byte) 80);
        class246.method1595(arg0 ^ 0xFFFFFFEA);
        class195.method1315(arg0 ^ 0xFFFFFFE9);
        class444.method2656(29186);
        class164.method1164();
        class393.method2446((byte) 76);
        class13.method87(-78);
        class218.method1464((byte) -114);
        class525.method3107((byte) -88);
        class272.method1720((byte) -124);
        class204.method1394(19211);
        class56.method512(16383);
        class76.method684(0);
        class132.method1014((byte) 73);
        class219.method1467(0);
        class476.method2848(0);
        class401.method2506();
        class52.method487(20351);
        class243.method1586(57);
        class429.method2588(arg0 ^ 0xFFFFFF89);
        class94.method851((byte) -119);
        class95.method853(arg0 + 21);
        class150.method1101(14503);
        class174.method1204(10);
        class54.method507(-118);
        class110.method926(false);
        class237.method1549(false);
        class280.method1757(true);
        class447.method2676(0);
        class100.method890(true);
        class268.method1704((byte) 81);
        class88.method806(true);
        class376.method2310(true);
        class151.method1105(arg0 ^ 0xFFFF03EB);
        class518.method3077(true);
        class74.method665();
        class138.method1041(100);
        class424.method2581(arg0 ^ 0xFFFFFFE9);
        class465.method2791();
        class269.method1709();
        class337.method2121();
        class326.method2071(30959);
        class517.method3072((byte) 33);
        class437.method2613();
        class129.method1011(10);
        class135.method1027(0);
        class7.method43((byte) -69);
        class377.method2318(8972);
        class147.method1087();
        class80.method709(false);
        class361.method2218(0);
        class96.method861(false);
        class8.method49(-102);
        class348.method2172((byte) 5);
        class493.method2973(5171);
        class264.method1690((byte) -73);
        class214.method1444((byte) -44);
        class196.method1318((byte) -127);
        class198.method1351(false);
        class263.method1687((byte) 122);
        class296.method1915(255);
        class270.method1711(false);
        class283.method1769(32);
        class406.method2523(16383);
        class44.method286((byte) -117);
        class483.method2898(true);
        class347.method2168(0);
        class453.method2711((byte) -127);
        class316.method1998((byte) 119);
        class28.method199((byte) -117);
        class523.method3092(arg0 ^ 0x71F6);
        class206.method1418((byte) -98);
        class381.method2345(false);
        class120.method974(arg0 ^ 0xFFFFFFCD);
        class10.method57(true);
        class67.method588((byte) 17);
        class81.method760(true);
        class70.method603(-111);
        class364.method2233(arg0 ^ 0x64);
        class46.method455(arg0 ^ 0xFFFFFFED);
        class178.method1218();
        class4.method31(0);
        class310.method1980(7);
        class40.method250(false);
        class71.method607(false);
        class320.method2054(-2);
        class91.method825(arg0 - 64);
        class49.method468(-31177);
        class497.method3006(257);
        class324.method2064((byte) 124);
        class111.method929((byte) -37);
        class173.method1197(-69);
        class375.method2303((byte) -44);
        class496.method2996(false);
        class420.method2567(arg0 - 83);
        class175.method1210((byte) -128);
        class467.method2795(true);
        class211.method1437(-38);
        class290.method1880((byte) -1);
        class336.method2113(false);
        class79.method704(-79);
        class209.method1429(arg0 ^ 0xFFFFD488);
        class123.method983(21832);
        class182.method1244(-3996);
        class225.method1500(true);
        class315.method1992(87);
        class472.method2821(true);
        class442.method2631((byte) 97);
        class492.method2967(1822746508);
        class245.method1594(false);
        class258.method1662((byte) 15);
        class433.method2599(arg0 + 139);
        class3.method27(true);
        class417.method2555(true);
        class451.method2696();
        class392.method2443();
        class127.method1003(0);
        class391.method2413((byte) 114);
        class29.method205(false);
        class464.method2780(arg0 ^ 0xFFFFFFEA);
        class458.method2730(-32010);
        class509.method3052(arg0 ^ 0xFFFFFFEA);
        class434.method2605(true);
        class438.method2616((byte) 121);
        class142.method1063(-99);
        class428.method2586(-1859);
        class353.method2184((byte) -54);
        class187.method1275(arg0 ^ 0xFFFFFFBA);
        class134.method1021((byte) -50);
        class397.method2464(-117);
        class171.method1192(9977);
        class267.method1701(true);
        class363.method2226(arg0 ^ 0x6B);
        class86.method798((byte) 97);
        class140.method1048(arg0 ^ 0xFFFF9CBC);
        class21.method141(-29464);
        class271.method1715(-92);
        class292.method1900((byte) 5);
        class102.method896(5);
        class114.method946(34962);
        class274.method1740((byte) 45);
        class128.method1004(-22845);
        class314.method1990(34336);
        class432.method2596(63357569);
        class312.method1985((byte) -55);
        class226.method1505(20407);
        class77.method692((byte) 83);
        class516.method3071(true);
        class287.method1799(1);
        class466.method2794(31990);
        class260.method1672(-8227);
        class62.method547((byte) -68);
        class23.method144(0);
        class513.method3064((byte) 72);
        class145.method1078((byte) 122);
        class106.method907(4096);
        class485.method2909(1);
        class154.method1120((byte) 126);
        class159.method1141(-86);
        class490.method2963(0);
        class262.method1681((byte) 72);
        class85.method792((byte) -89);
        class422.method2576((byte) 95);
        class82.method773((byte) -80);
        class379.method2330(0);
        class101.method893(arg0 - 86);
        class257.method1660(101);
        class398.method2467(2);
        class252.method1627(11885);
        class477.method2849(-19122);
        class356.method2199((byte) -118);
        class335.method2110(9463);
        class373.method2290(true);
        class408.method2528(true);
        class47.method459(false);
        class463.method2778(-90);
        class328.method2076(100);
        class298.method1925(arg0 ^ 0xFFFFFFEC);
        class9.method51(7);
        class522.method3088(75);
        class259.method1667((byte) 60);
        class515.method3069(3);
        class372.method2282(23867);
        class475.method2842(false);
        class365.method2235((byte) -36);
        class35.method243(-107);
        class418.method2557(false);
        class192.method1303(8);
        class220.method1468(true);
        class536.method3170((byte) 115);
        class430.method2590((byte) 25);
        class276.method1746(true);
        if (class286.field4332) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lgh;)Z", line = 2247)
    public static final boolean method1365(class388 arg0) {
        if (class321.field4902) {
            if (method1371(arg0).field1911 != 0) {
                return false;
            }
            if (arg0.field5784 == 0) {
                return false;
            }
        }
        return arg0.field5736;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 2260)
    public final void method1366(byte arg0) {
        field3214++;
        try {
            this.method1370(-128);
        } catch (OutOfMemoryError var3) {
            if (var3.getMessage() == null || !var3.getMessage().startsWith("native")) {
                throw var3;
            }
            class304.method1944(false, 0);
            class486.method2913(var3.getMessage() + " (Recovered) " + this.method1374((byte) -121), var3, (byte) -120);
        }
        if (arg0 >= -115) {
            this.method1357((byte) 115);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 2283)
    public static final void method1367(int arg0) {
        int var1 = class229.field3560;
        int[] var2 = class316.field4782;
        for (int var3 = 0; var3 < class341.field5128 + var1; var3++) {
            class535 var4;
            if (var3 < var1) {
                var4 = class73.field1444[var2[var3]];
            } else {
                var4 = ((class435) class209.field3337.method1622((long) class515.field7477[var3 - var1], 94)).field6471;
            }
            if (var4.field6084 == arg0 && var4.field7829 >= 0) {
                int var5 = var4.method2241(-117);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6073 & 0x7F) != 0 || (var4.field6078 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field6073 & 0x7F) != 64 || (var4.field6078 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6073 >> 7;
                    int var7 = var4.field6078 >> 7;
                    if (var4.field7829 > class316.field4800[var6][var7]) {
                        class316.field4800[var6][var7] = var4.field7829;
                        class56.field1188[var6][var7] = 1;
                    } else if (class316.field4800[var6][var7] == var4.field7829) {
                        var10002 = class56.field1188[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field6073 - var8 >> 7;
                    int var10 = var4.field6078 - var8 >> 7;
                    int var11 = var4.field6073 + var8 >> 7;
                    int var12 = var4.field6078 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field7829 > class316.field4800[var13][var14]) {
                                class316.field4800[var13][var14] = var4.field7829;
                                class56.field1188[var13][var14] = 1;
                            } else if (class316.field4800[var13][var14] == var4.field7829) {
                                var10002 = class56.field1188[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2380)
    public static final void main(String[] arg0) {
        field3207++;
        try {
            if (arg0.length != 6) {
                class474.method2834(false, "Argument count");
            }
            class199.field3244 = new class248();
            class199.field3244.field3818 = Integer.parseInt(arg0[0]);
            class397.field6032 = new class248();
            class397.field6032.field3818 = Integer.parseInt(arg0[1]);
            class3.field69 = new class248();
            class3.field69.field3818 = Integer.parseInt(arg0[2]);
            class522.field7582 = class490.field7190;
            if (arg0[3].equals("live")) {
                class281.field4249 = class382.field5587;
            } else if (arg0[3].equals("rc")) {
                class281.field4249 = class523.field7606;
            } else if (arg0[3].equals("wip")) {
                class281.field4249 = class471.field6990;
            } else {
                class474.method2834(false, "modewhat");
            }
            class146.field2452 = class60.method540((byte) 91, arg0[4]);
            if (class146.field2452 == -1) {
                if (arg0[4].equals("english")) {
                    class146.field2452 = 0;
                } else if (arg0[4].equals("german")) {
                    class146.field2452 = 1;
                } else {
                    class474.method2834(false, "language");
                }
            }
            class364.field5329 = false;
            class407.field6166 = false;
            if (arg0[5].equals("game0")) {
                class424.field6366 = class316.field4779;
            } else if (arg0[5].equals("game1")) {
                class424.field6366 = class209.field3343;
            } else {
                class474.method2834(false, "game");
            }
            class258.field3952 = true;
            class464.field6887 = true;
            class447.field6651 = class424.field6366.field5121;
            class406.field6107 = false;
            class242.field3745 = 0;
            class439.field6524 = 0;
            class27.field437 = "";
            client var1 = new client();
            class418.field6296 = var1;
            var1.method1789(1024, false, 768, 30, class281.field4249.method2773(-72) + 32, 597, true, class424.field6366.field5125);
            class97.field1889.setLocation(40, 40);
        } catch (Exception var3) {
            class486.method2913(null, var3, (byte) -103);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 2453)
    public final void method1368(int arg0) {
        field3210++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class17.method111(false);
        class395.field6014 = new class284(class497.field7305);
        class450.field6699 = new class273();
        if (arg0 > -59) {
            return;
        }
        if (class9.field137 != class522.field7582) {
            class189.field3040 = new byte[50][];
        }
        class186.field2990 = new class285(class497.field7305);
        if (class9.field137 == class522.field7582) {
            class199.field3244.field3826 = this.getCodeBase().getHost();
        } else if (class453.method2705(class522.field7582, true)) {
            class199.field3244.field3826 = this.getCodeBase().getHost();
            class199.field3244.field3824 = class199.field3244.field3818 + 40000;
            class397.field6032.field3824 = class397.field6032.field3818 + 40000;
            class3.field69.field3824 = class3.field69.field3818 + 40000;
            class199.field3244.field3815 = class199.field3244.field3818 + 50000;
            class397.field6032.field3815 = class397.field6032.field3818 + 50000;
            class3.field69.field3815 = class3.field69.field3818 + 50000;
        } else if (class522.field7582 == class490.field7190) {
            class199.field3244.field3826 = "127.0.0.1";
            class397.field6032.field3826 = "127.0.0.1";
            class3.field69.field3826 = "127.0.0.1";
            class199.field3244.field3824 = class199.field3244.field3818 + 40000;
            class397.field6032.field3824 = class397.field6032.field3818 + 40000;
            class3.field69.field3824 = class3.field69.field3818 + 40000;
            class199.field3244.field3815 = class199.field3244.field3818 + 50000;
            class397.field6032.field3815 = class397.field6032.field3818 + 50000;
            class3.field69.field3815 = class3.field69.field3818 + 50000;
        }
        class97.field1886 = class384.field5617 = class38.field556 = class226.field3536 = new short[256];
        if (class424.field6366 == class316.field4779) {
            class230.field3569 = false;
        }
        if (class424.field6366 == class209.field3343) {
            class439.field6525 = class46.field961;
            class494.field7241 = class250.field3852;
            class107.field1979 = 16777215;
            class435.field6474 = class385.field5628;
            class320.field4898 = 0;
            class111.field2023 = class215.field3399;
            class479.field7063 = true;
        } else {
            class111.field2023 = class77.field1549;
            class494.field7241 = class175.field2852;
            class435.field6474 = class211.field3370;
            class439.field6525 = class331.field5016;
        }
        class444.field6606 = class199.field3244;
        class179.field2912 = class63.method559(class262.field4007, -1);
        class393.field5991 = class479.method2857(class262.field4007, true, false);
        class229.field3562 = class462.method2772(0);
        if (class229.field3562 != null) {
            class229.field3562.method810(class262.field4007, -123);
        }
        class380.field5559 = class480.field7076;
        try {
            if (class497.field7305.field7085 != null) {
                class316.field4781 = new class331(class497.field7305.field7085, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class246.field3800[var3] = new class331(class497.field7305.field7084[var3], 6000, 0);
                }
                class403.field6096 = new class331(class497.field7305.field7083, 6000, 0);
                class443.field6575 = new class137(255, class316.field4781, class403.field6096, 500000);
                class208.field3331 = new class331(class497.field7305.field7090, 24, 0);
                class497.field7305.field7085 = null;
                class497.field7305.field7083 = null;
                class497.field7305.field7084 = null;
                class497.field7305.field7090 = null;
            }
        } catch (IOException var4) {
            class403.field6096 = null;
            class316.field4781 = null;
            class443.field6575 = null;
            class208.field3331 = null;
        }
        if (class9.field137 != class522.field7582) {
            class1.field32 = true;
        }
        if (class424.field6366 == class316.field4779) {
            class430.field6424 = class382.field5584.method1977(class146.field2452, 69);
        } else if (class424.field6366 == class209.field3343) {
            class430.field6424 = class23.field334.method1977(class146.field2452, -87);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2580)
    public final void init() {
        field3206++;
        if (!this.method1791(true)) {
            return;
        }
        class199.field3244 = new class248();
        class199.field3244.field3818 = Integer.parseInt(this.getParameter("worldid"));
        class397.field6032 = new class248();
        class397.field6032.field3818 = Integer.parseInt(this.getParameter("lobbyid"));
        class397.field6032.field3826 = this.getParameter("lobbyaddress");
        class3.field69 = new class248();
        class3.field69.field3818 = Integer.parseInt(this.getParameter("demoid"));
        class3.field69.field3826 = this.getParameter("demoaddress");
        class522.field7582 = class150.method1104(true, Integer.parseInt(this.getParameter("modewhere")));
        if (!class453.method2705(class522.field7582, true) && class9.field137 != class522.field7582) {
            class522.field7582 = class9.field137;
        }
        class281.field4249 = class415.method2550(Integer.parseInt(this.getParameter("modewhat")), -128);
        if (class471.field6990 != class281.field4249 && class523.field7606 != class281.field4249 && class382.field5587 != class281.field4249) {
            class281.field4249 = class382.field5587;
        }
        try {
            class146.field2452 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class146.field2452 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class364.field5329 = true;
        } else {
            class364.field5329 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class407.field6166 = true;
        } else {
            class407.field6166 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class171.field2774 = true;
        } else {
            class171.field2774 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class424.field6366 = class316.field4779;
            } else if (var4.equals("1")) {
                class424.field6366 = class209.field3343;
            }
        }
        try {
            class242.field3745 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class242.field3745 = 0;
        }
        class524.field7619 = this.getParameter("quiturl");
        class27.field437 = this.getParameter("settings");
        if (class27.field437 == null) {
            class27.field437 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class439.field6524 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class439.field6524 = 0;
            }
        }
        class447.field6651 = Integer.parseInt(this.getParameter("colourid"));
        if (class447.field6651 < 0 || class447.field6651 >= class379.field5543.length) {
            class447.field6651 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class258.field3952 = true;
            class464.field6887 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class406.field6107 = true;
        }
        if (class424.field6366 == class316.field4779) {
            class327.field4958 = 765;
            class458.field6802 = 503;
        } else if (class424.field6366 == class209.field3343) {
            class327.field4958 = 640;
            class458.field6802 = 480;
        }
        class418.field6296 = this;
        this.method1793(class281.field4249.method2773(-101) + 32, (byte) -102, class327.field4958, 597, class458.field6802);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2696)
    public static final void method1369() {
        int var0 = class229.field3560;
        int[] var1 = class316.field4782;
        int var2 = class460.field6852 ? var0 : class341.field5128 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class535 var4;
            if (var3 < var0) {
                var4 = class73.field1444[var1[var3]];
            } else {
                var4 = ((class435) class209.field3337.method1622((long) class515.field7477[var3 - var0], 91)).field6471;
            }
            if (var4.field7829 >= 0) {
                int var5 = var4.method2241(-27);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6073 & 0x7F) == 0 && (var4.field6078 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field6073 & 0x7F) == 64 && (var4.field6078 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class366 && var4.field7868 != null && class62.field1268 >= var4.field7868.field6479 && class62.field1268 < var4.field7868.field6486) {
                    ((class366) var4).field5340 = false;
                }
                var4.field6083 = class483.method2899(var4.field6084, var4.field6073, var4.field6078, false);
                class234.method1538(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2741)
    private final void method1370(int arg0) {
        field3211++;
        if (class466.field6932 == 13) {
            return;
        }
        class62.field1268++;
        if ((class62.field1268 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class410.field6210 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class120.field2102.setSeed((long) class410.field6210);
        }
        if ((class62.field1268 % 50) == 0) {
            class258.field3948 = class433.field6445;
            class433.field6445 = 0;
            class335.field5066 = class214.field3395;
            class214.field3395 = 0;
        }
        this.method1376(20109);
        if (class151.field2496 != null) {
            class151.field2496.method2104(true);
        }
        class330.method2085((byte) -55);
        class179.field2912.method1462(96);
        class393.field5991.method134((byte) -84);
        if (class229.field3562 != null) {
            int var3 = class229.field3562.method812(19706);
            class80.field1592 = var3;
        }
        if (arg0 > -127) {
            method1354((byte) -17, -0.21629842F, -0.058732506F, 0.49396914F);
        }
        if (class262.field4006 != null) {
            class262.field4006.method307((int) class423.method2578(-19698));
        }
        class430.method2592(true);
        class76.field1540 = 0;
        for (class477 var4 = class179.field2912.method1465(-65536); var4 != null && class76.field1540 < 128; var4 = class179.field2912.method1465(-65536)) {
            if (var4.method1921(false) != 1) {
                char var5 = var4.method1924(-8478);
                if (!class145.method1077(-17638) || !(var5 == '`' || var5 == '§')) {
                    class137.field2300[class76.field1540] = var4;
                    class76.field1540++;
                } else if (class259.method1666(-120)) {
                    class376.method2309(-77);
                } else {
                    class448.method2679(5593);
                }
            }
        }
        for (class356 var6 = class393.field5991.method137((byte) -121); var6 != null; var6 = class393.field5991.method137((byte) -123)) {
            int var7 = var6.method50(8);
            if (var7 == -1) {
                class79.field1575.method1885(false, var6);
            } else if (class521.method3086(-1, var7)) {
                class293.field4478.method1885(false, var6);
            }
            if (class293.field4478.method1886(-31340) > 10) {
                class293.field4478.method1894((byte) -101);
            }
        }
        if (class259.method1666(-101)) {
            class182.method1243(96);
        }
        if (class466.field6932 == 0) {
            this.method1378((byte) 68);
            class175.method1208((byte) 36);
        } else if (class466.field6932 == 1) {
            this.method1378((byte) 68);
            class175.method1208((byte) 36);
        } else if (class457.method2725(false, class466.field6932)) {
            class50.method472(1924904676);
        }
        if (class464.method2779(class466.field6932, true) && !class457.method2725(false, class466.field6932)) {
            this.method1357((byte) 62);
            class376.method2311(-5);
            class32.method223((byte) -40);
        } else if (class332.method2097((byte) -109, class466.field6932) && !class457.method2725(false, class466.field6932)) {
            this.method1357((byte) 62);
            class32.method223((byte) -111);
        } else if (class466.field6932 == 11) {
            class32.method223((byte) -28);
        } else if (class263.method1682(true, class466.field6932) && !class457.method2725(false, class466.field6932)) {
            class187.method1276((byte) 67);
        } else if (class466.field6932 == 12) {
            class32.method223((byte) -81);
            if (class524.field7623 != -3 && class524.field7623 != 2 && class524.field7623 != 15) {
                class391.method2414(false, 5424);
            }
        }
        class380.method2340((byte) 94, class262.field4006);
        class293.field4478.method1894((byte) -106);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lgh;)Lqm;", line = 2896)
    public static final class99 method1371(class388 arg0) {
        class99 var1 = (class99) class248.field3828.method1622(((long) arg0.field5700 << 32) + (long) arg0.field5777, -115);
        return var1 == null ? arg0.field5697 : var1;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 2900)
    private final void method1372(byte arg0) {
        int var2 = -126 % ((-arg0 - 59) / 34);
        field3200++;
        if (class450.field6699.field4153 > class174.field2804) {
            class444.field6606.field3822 = !class444.field6606.field3822;
            class174.field2802 = (class450.field6699.field4153 * 50 - 50) * 5;
            if (class174.field2802 > 3000) {
                class174.field2802 = 3000;
            }
            if (class450.field6699.field4153 >= 2 && class450.field6699.field4156 == 6) {
                this.method1790("js5connect_outofdate", false);
                class466.field6932 = 13;
                return;
            }
            if (class450.field6699.field4153 >= 4 && class450.field6699.field4156 == -1) {
                this.method1790("js5crc", false);
                class466.field6932 = 13;
                return;
            }
            if (class450.field6699.field4153 >= 4 && class18.method125(class466.field6932, 9704)) {
                if (class450.field6699.field4156 == 7 || class450.field6699.field4156 == 9) {
                    this.method1790("js5connect_full", false);
                } else if (class450.field6699.field4156 > 0) {
                    this.method1790("js5connect", false);
                } else {
                    this.method1790("js5io", false);
                }
                class466.field6932 = 13;
                return;
            }
        }
        class174.field2804 = class450.field6699.field4153;
        if (class174.field2802 > 0) {
            class174.field2802--;
            return;
        }
        try {
            if (class190.field3070 == 0) {
                class408.field6180 = class497.field7305.method2882(true, class444.field6606.method1605((byte) -115), class444.field6606.field3826);
                class190.field3070++;
            }
            if (class190.field3070 == 1) {
                if (class408.field6180.field2119 == 2) {
                    this.method1361(1000, 2);
                    return;
                }
                if (class408.field6180.field2119 == 1) {
                    class190.field3070++;
                }
            }
            if (class190.field3070 == 2) {
                class245.field3789 = new class378((Socket) class408.field6180.field2115, class497.field7305);
                class289 var3 = new class289(5);
                var3.method1814(class316.field4785.field2207, true);
                var3.method1862((byte) -115, 597);
                class245.field3789.method2329(0, 5, 3, var3.field4408);
                class190.field3070++;
                class18.field299 = class423.method2578(-19698);
            }
            if (class190.field3070 == 3) {
                if (class18.method125(class466.field6932, 9704) || class245.field3789.method2321(0) > 0) {
                    int var4 = class245.field3789.method2328(0);
                    if (var4 != 0) {
                        this.method1361(var4, 2);
                        return;
                    }
                    class190.field3070++;
                } else if (class423.method2578(-19698) - class18.field299 > 30000L) {
                    this.method1361(1001, 2);
                    return;
                }
            }
            if (class190.field3070 == 4) {
                boolean var5 = class466.field6932 == 1 || class464.method2779(class466.field6932, true) || class332.method2097((byte) -82, class466.field6932);
                class450.field6699.method1732((byte) -110, !var5, class245.field3789);
                class190.field3070 = 0;
                class245.field3789 = null;
                class408.field6180 = null;
            }
        } catch (IOException var6) {
            this.method1361(1002, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3046)
    public static final void method1373() {
        int var0 = class229.field3560;
        int[] var1 = class316.field4782;
        boolean var2 = class186.field2990.field2546 == 1 && var0 > 200 || class186.field2990.field2546 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class366 var13 = class73.field1444[var1[var3]];
            if (var13.method2236(87)) {
                var13.method11(63);
                if (var13.field6082 >= 0 && var13.field6077 >= 0 && var13.field6081 < class339.field5099 && var13.field6075 < class484.field7129) {
                    var13.field5340 = var13.field7781 ? var2 : false;
                    if (class15.field266 == var13) {
                        var13.field7829 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field7782) {
                            var14++;
                        }
                        if (var13.field7818 > class62.field1268) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method2241(-105) << 2);
                        if (var13.field5354) {
                            var15 += 512;
                        } else {
                            if (class461.field6862 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field7829 = var15 + 1;
                    }
                } else {
                    var13.field7829 = -1;
                }
            } else {
                var13.field7829 = -1;
            }
        }
        for (int var4 = 0; var4 < class341.field5128; var4++) {
            class163 var10 = ((class435) class209.field3337.method1622((long) class515.field7477[var4], -113)).field6471;
            if (var10.method1157(103) && var10.field2613.method483((byte) 104, class402.field6080)) {
                var10.method11(124);
                if (var10.field6082 >= 0 && var10.field6077 >= 0 && var10.field6081 < class339.field5099 && var10.field6075 < class484.field7129) {
                    int var11 = 0;
                    if (!var10.field7782) {
                        var11++;
                    }
                    if (var10.field7818 > class62.field1268) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method2241(-63) << 2);
                    if (class461.field6862 == 0) {
                        if (var10.field2613.field1076) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class461.field6862 == 1) {
                        if (var10.field2613.field1076) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field2613.field1052) {
                        var12 += 1024;
                    } else if (!var10.field2613.field1042) {
                        var12 += 256;
                    }
                    var10.field7829 = var12 + 1;
                } else {
                    var10.field7829 = -1;
                }
            } else {
                var10.field7829 = -1;
            }
        }
        for (int var5 = 0; var5 < class139.field2328.length; var5++) {
            class481 var6 = class139.field2328[var5];
            if (var6 != null) {
                if (var6.field7094 == 1) {
                    class435 var7 = (class435) class209.field3337.method1622((long) var6.field7100, -128);
                    if (var7 != null) {
                        class163 var8 = var7.field6471;
                        if (var8.field7829 >= 0) {
                            var8.field7829 += 2048;
                        }
                    }
                } else if (var6.field7094 == 10) {
                    class366 var9 = class73.field1444[var6.field7100];
                    if (var9 != null && class15.field266 != var9 && var9.field7829 >= 0) {
                        var9.field7829 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;", line = 3211)
    public final String method1374(byte arg0) {
        field3197++;
        String var2 = null;
        try {
            var2 = "[1)" + class496.field7292 + "," + class212.field3378 + "," + class339.field5099 + "," + class484.field7129 + "|";
            if (class15.field266 != null) {
                var2 = var2 + "2)" + class211.field3371 + "," + (class15.field266.field7866[0] + class496.field7292) + "," + (class15.field266.field7870[0] + class212.field3378) + "|";
            }
            var2 = var2 + "3)" + class133.field2236 + "|4)" + class186.field2990.field2542 + "|5)" + class13.method86(3) + "|6)" + class71.field1415 + "," + class65.field1330 + "|";
            var2 = var2 + "7)" + class186.field2990.method1129(0, class133.field2236) + "|";
            var2 = var2 + "8)" + class186.field2990.method1130(class133.field2236, 111) + "|";
            var2 = var2 + "9)" + class186.field2990.field2538 + "|";
            var2 = var2 + "10)" + class186.field2990.field2531 + "|";
            var2 = var2 + "11)" + class186.field2990.field2530 + "|";
            var2 = var2 + "12)" + class186.field2990.method1783(-1, class133.field2236) + "|";
            var2 = var2 + "13)" + class370.field5418 + "|";
            var2 = var2 + "14)" + class466.field6932;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
                int var3 = 55 / ((arg0 + 53) / 35);
            } catch (Throwable var4) {
            }
            var2 = var2 + "]";
        } catch (Throwable var5) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lgh;)Lgh;", line = 3247)
    public static final class388 method1375(class388 arg0) {
        int var1 = method1371(arg0).method880((byte) 99);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class271.method1716(27411, arg0.field5728);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 3267)
    private final void method1376(int arg0) {
        field3209++;
        if (arg0 != 20109) {
            this.method1357((byte) -64);
        }
        boolean var2 = class450.field6699.method1725((byte) 50);
        if (!var2) {
            this.method1372((byte) 8);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 3286)
    public static void method1377(boolean arg0) {
        field3219 = null;
        if (!arg0) {
            method1353(85);
        }
        field3213 = null;
        field3216 = null;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 3298)
    private final void method1378(byte arg0) {
        if (!class186.field2990.field2566) {
            for (int var2 = 0; var2 < class76.field1540; var2++) {
                if (class137.field2300[var2].method1924(-8478) == 's' || class137.field2300[var2].method1924(-8478) == 'S') {
                    class186.field2990.field2566 = true;
                    break;
                }
            }
        }
        field3204++;
        if (class344.field5145 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class423.method2578(-19698);
            if (class289.field4433 == 0L) {
                class289.field4433 = var5;
            }
            if (var4 > 16384 && (var5 - class289.field4433) < 5000L) {
                if ((var5 - class506.field7387) > 1000L) {
                    System.gc();
                    class506.field7387 = var5;
                }
                class159.field2572 = class183.field2942.method1977(class146.field2452, -74);
                class174.field2805 = 5;
            } else {
                class159.field2572 = class464.field6885.method1977(class146.field2452, -42);
                class344.field5145 = 10;
                class174.field2805 = 5;
            }
        } else if (class344.field5145 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class67.field1367[var7] = class86.method799(class484.field7129, class339.field5099, false);
            }
            class159.field2572 = class79.field1573.method1977(class146.field2452, arg0 ^ 0xFFFFFFF0);
            class174.field2805 = 10;
            class344.field5145 = 20;
        } else if (class344.field5145 == 20) {
            if (class151.field2496 == null) {
                class151.field2496 = new class332(class450.field6699, class395.field6014);
            }
            if (class151.field2496.method2102(false)) {
                class312.field4716 = class376.method2312(1, (byte) 126, false, 0, true);
                class419.field6311 = class376.method2312(1, (byte) 104, false, 1, true);
                class249.field3845 = class376.method2312(1, (byte) 87, false, 2, true);
                class59.field1234 = class376.method2312(1, (byte) 97, false, 3, true);
                class237.field3657 = class376.method2312(1, (byte) 86, false, 4, true);
                class361.field5290 = class376.method2312(1, (byte) 124, true, 5, true);
                class202.field3263 = class376.method2312(1, (byte) 68, true, 6, false);
                class477.field7053 = class376.method2312(1, (byte) 99, false, 7, true);
                class455.field6758 = class376.method2312(1, (byte) 68, false, 8, true);
                class113.field2038 = class376.method2312(1, (byte) 85, false, 9, true);
                class151.field2493 = class376.method2312(1, (byte) 115, false, 10, true);
                class199.field3246 = class376.method2312(1, (byte) 83, false, 11, true);
                class510.field7434 = class376.method2312(1, (byte) 98, false, 12, true);
                class483.field7117 = class376.method2312(1, (byte) 91, false, 13, true);
                class219.field3448 = class376.method2312(1, (byte) 122, false, 14, false);
                class388.field5702 = class376.method2312(1, (byte) 75, false, 15, true);
                class444.field6595 = class376.method2312(1, (byte) 105, false, 16, true);
                class374.field5483 = class376.method2312(1, (byte) 71, false, 17, true);
                class324.field4929 = class376.method2312(1, (byte) 126, false, 18, true);
                class127.field2169 = class376.method2312(1, (byte) 90, false, 19, true);
                class100.field1927 = class376.method2312(1, (byte) 107, false, 20, true);
                class454.field6753 = class376.method2312(1, (byte) 109, false, 21, true);
                class230.field3570 = class376.method2312(1, (byte) 73, false, 22, true);
                class449.field6678 = class376.method2312(1, (byte) 106, true, 23, true);
                class199.field3243 = class376.method2312(1, (byte) 87, false, 24, true);
                class267.field4056 = class376.method2312(1, (byte) 98, false, 25, true);
                class534.field7760 = class376.method2312(1, (byte) 67, true, 26, true);
                class192.field3103 = class376.method2312(1, (byte) 106, false, 27, true);
                class58.field1222 = class376.method2312(1, (byte) 86, true, 28, true);
                class41.field576 = class376.method2312(1, (byte) 109, false, 29, true);
                class159.field2572 = class510.field7429.method1977(class146.field2452, -127);
                class344.field5145 = 30;
                class174.field2805 = 15;
            } else {
                class159.field2572 = class225.field3524.method1977(class146.field2452, ~arg0);
                class174.field2805 = 12;
            }
        } else if (class344.field5145 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class352.field5193[var9].method1236(arg0 ^ 0x3F85) * class414.field6262[var9] / 100;
            }
            if (var8 == 100) {
                class159.field2572 = class88.field1791.method1977(class146.field2452, arg0 + 6);
                class174.field2805 = 20;
                class93.method840(64, class455.field6758);
                class373.method2291((byte) 110, class455.field6758);
                class344.field5145 = 40;
            } else {
                if (var8 != 0) {
                    class159.field2572 = class42.field586.method1977(class146.field2452, 114) + var8 + "%";
                }
                class174.field2805 = 20;
            }
        } else if (class344.field5145 == 40) {
            if (class58.field1222.method2750((byte) -126)) {
                this.method1362(class58.field1222.method2760((byte) -127, 1), -1);
                class159.field2572 = class528.field7708.method1977(class146.field2452, -41);
                class344.field5145 = 50;
                class174.field2805 = 25;
            } else {
                class159.field2572 = class536.field7882.method1977(class146.field2452, -99) + class58.field1222.method2743(-1) + "%";
                class174.field2805 = 25;
            }
        } else if (arg0 == 68) {
            if (class344.field5145 == 50) {
                class174.method1199((byte) 104);
                class159.field2572 = class142.field2353.method1977(class146.field2452, arg0 ^ 0x36);
                class174.field2805 = 30;
                class344.field5145 = 60;
            } else if (class344.field5145 == 60) {
                int var10 = class308.method1968(class455.field6758, class483.field7117, 0);
                int var11 = class281.method1763(106);
                if (var10 < var11) {
                    class159.field2572 = class23.field338.method1977(class146.field2452, arg0 - 106) + var10 * 100 / var11 + "%";
                    class174.field2805 = 35;
                } else {
                    class159.field2572 = class499.field7317.method1977(class146.field2452, 87);
                    class344.field5145 = 70;
                    class174.field2805 = 35;
                }
            } else if (class344.field5145 == 70) {
                int var12 = class216.method1454(class455.field6758, 599684871);
                int var13 = class159.method1140(46);
                if (var12 < var13) {
                    class159.field2572 = class374.field5484.method1977(class146.field2452, 102) + var12 * 100 / var13 + "%";
                    class174.field2805 = 40;
                } else {
                    class159.field2572 = class428.field6405.method1977(class146.field2452, -88);
                    class174.field2805 = 40;
                    class344.field5145 = 80;
                }
            } else if (class344.field5145 == 80) {
                if (class534.field7760.method2750((byte) -99)) {
                    class173.field2792 = new class330(class534.field7760, class113.field2038, class455.field6758);
                    class159.field2572 = class500.field7336.method1977(class146.field2452, 89);
                    class174.field2805 = 45;
                    class344.field5145 = 90;
                } else {
                    class159.field2572 = class513.field7447.method1977(class146.field2452, arg0 ^ 0xFFFFFFFD) + class534.field7760.method2743(-1) + "%";
                    class174.field2805 = 45;
                }
            } else if (class344.field5145 == 90) {
                class159.field2572 = class173.field2785.method1977(class146.field2452, 119);
                class174.field2805 = 50;
                class344.field5145 = 95;
            } else if (class344.field5145 == 95) {
                if (class186.field2990.field2566) {
                    class186.field2990.field2537 = 0;
                    class186.field2990.field2536 = 1;
                    class186.field2990.field2545 = 0;
                    class186.field2990.field2552 = 0;
                    class186.field2990.field2542 = 0;
                }
                class186.field2990.field2566 = true;
                class186.field2990.method1787((byte) 56, class497.field7305);
                class418.method2559(class186.field2990.field2537, 0, false);
                class159.field2572 = class162.field2594.method1977(class146.field2452, 112);
                class344.field5145 = 100;
                class174.field2805 = 55;
            } else if (class344.field5145 == 100) {
                class312.method1987(class483.field7117, class262.field4006, 0, class455.field6758);
                class159.field2572 = class85.field1746.method1977(class146.field2452, -54);
                class174.field2805 = 60;
                class253.method1639(1, -16646);
                class344.field5145 = 110;
            } else if (class344.field5145 == 110) {
                byte var14 = 0;
                class249.field3845.method2750((byte) -102);
                int var15 = var14 + class249.field3845.method2743(-1);
                class444.field6595.method2750((byte) -28);
                int var16 = var15 + class444.field6595.method2743(-1);
                class374.field5483.method2750((byte) -113);
                int var17 = var16 + class374.field5483.method2743(-1);
                class324.field4929.method2750((byte) -119);
                int var18 = var17 + class324.field4929.method2743(-1);
                class127.field2169.method2750((byte) -46);
                int var19 = var18 + class127.field2169.method2743(-1);
                class100.field1927.method2750((byte) -62);
                int var20 = var19 + class100.field1927.method2743(arg0 - 69);
                class454.field6753.method2750((byte) -55);
                int var21 = var20 + class454.field6753.method2743(-1);
                class230.field3570.method2750((byte) -77);
                int var22 = var21 + class230.field3570.method2743(-1);
                class199.field3243.method2750((byte) -51);
                int var23 = var22 + class199.field3243.method2743(-1);
                class267.field4056.method2750((byte) -50);
                int var24 = var23 + class267.field4056.method2743(-1);
                class192.field3103.method2750((byte) -98);
                int var25 = var24 + class192.field3103.method2743(-1);
                class41.field576.method2750((byte) -47);
                int var26 = var25 + class41.field576.method2743(-1);
                if (var26 < 1200) {
                    class159.field2572 = class171.field2775.method1977(class146.field2452, -44) + var26 / 12 + "%";
                    class174.field2805 = 65;
                } else {
                    class453.field6727 = new class48(class424.field6366, class146.field2452, class249.field3845);
                    class452.field6708 = new class395(class424.field6366, class146.field2452, class249.field3845);
                    class62.field1264 = new class266(class424.field6366, class146.field2452, class249.field3845, class455.field6758);
                    class370.field5440 = new class200(class424.field6366, class146.field2452, class374.field5483);
                    class293.field4482 = new class329(class424.field6366, class146.field2452, class249.field3845);
                    class127.field2174 = new class75(class424.field6366, class146.field2452, class249.field3845);
                    class428.field6404 = new class58(class424.field6366, class146.field2452, class249.field3845, class477.field7053);
                    class169.field2755 = new class448(class424.field6366, class146.field2452, class249.field3845);
                    class214.field3396 = new class146(class424.field6366, class146.field2452, class249.field3845);
                    class123.field2142 = new class231(class424.field6366, class146.field2452, true, class444.field6595, class477.field7053);
                    class309.field4682 = new class183(class424.field6366, class146.field2452, class249.field3845, class455.field6758);
                    class160.field2586 = new class339(class424.field6366, class146.field2452, class249.field3845, class455.field6758);
                    class102.field1942 = new class93(class424.field6366, class146.field2452, true, class324.field4929, class477.field7053);
                    class135.field2271 = new class253(class424.field6366, class146.field2452, true, class453.field6727, class127.field2169, class477.field7053);
                    class523.field7610 = new class238(class424.field6366, class146.field2452, class249.field3845);
                    class422.field6355 = new class34(class424.field6366, class146.field2452, class100.field1927, class312.field4716, class419.field6311);
                    class159.field2574 = new class403(class424.field6366, class146.field2452, class249.field3845);
                    class464.field6883 = new class390(class424.field6366, class146.field2452, class249.field3845);
                    class514.field7469 = new class68(class424.field6366, class146.field2452, class454.field6753, class477.field7053);
                    class60.field1255 = new class122(class424.field6366, class146.field2452, class249.field3845);
                    class280.field4212 = new class360(class424.field6366, class146.field2452, class249.field3845);
                    class47.field975 = new class19(class424.field6366, class146.field2452, class249.field3845);
                    class155.field2526 = new class216(class424.field6366, class146.field2452, class230.field3570);
                    class161.field2593 = new class205(class424.field6366, class146.field2452, class249.field3845);
                    class9.method55(class477.field7053, (byte) -25, class59.field1234, class455.field6758, class483.field7117);
                    class220.method1469(class41.field576, 712624332);
                    class175.field2845 = new class78(class146.field2452, class199.field3243, class267.field4056);
                    class17.field280 = new class27(class146.field2452, class199.field3243, class267.field4056, new class45());
                    class159.field2572 = class299.field4528.method1977(class146.field2452, -128);
                    class174.field2805 = 65;
                    class70.method604((byte) -113);
                    class123.field2142.method1525(!class186.field2990.method1783(-1, class133.field2236), (byte) -113);
                    class402.field6080 = new class14();
                    class256.method1648(80);
                    class486.method2915(0, class192.field3103);
                    class133.method1019(class477.field7053, class173.field2792, -22018);
                    class344.field5145 = 120;
                }
            } else if (class344.field5145 == 120) {
                int var27 = class478.method2852(-25227, class455.field6758);
                int var28 = class239.method1566(arg0 - 52);
                if (var28 > var27) {
                    class159.field2572 = class245.field3787.method1977(class146.field2452, arg0 + 35) + var27 * 100 / var28 + "%";
                    class174.field2805 = 70;
                } else {
                    class143.method1070(0, class262.field4006, class455.field6758);
                    class172.method1195(class420.field6340, arg0 - 194);
                    class159.field2572 = class86.field1775.method1977(class146.field2452, -87);
                    class174.field2805 = 70;
                    class344.field5145 = 130;
                }
            } else if (class344.field5145 == 130) {
                if (class151.field2493.method2733("", "huffman", (byte) -89)) {
                    class380 var29 = new class380(class151.field2493.method2746(false, "huffman", ""));
                    class391.method2415((byte) -113, var29);
                    class159.field2572 = class52.field1088.method1977(class146.field2452, 67);
                    class174.field2805 = 75;
                    class344.field5145 = 140;
                } else {
                    class159.field2572 = class460.field6856.method1977(class146.field2452, 115) + "0%";
                    class174.field2805 = 75;
                }
            } else if (class344.field5145 == 140) {
                if (class59.field1234.method2750((byte) -63)) {
                    class159.field2572 = class283.field4263.method1977(class146.field2452, arg0 + 33);
                    class344.field5145 = 150;
                    class174.field2805 = 80;
                } else {
                    class159.field2572 = class195.field3140.method1977(class146.field2452, -77) + class59.field1234.method2743(arg0 ^ 0xFFFFFFBB) + "%";
                    class174.field2805 = 80;
                }
            } else if (class344.field5145 == 150) {
                if (class510.field7434.method2750((byte) -33)) {
                    class159.field2572 = class461.field6863.method1977(class146.field2452, arg0 ^ 0x7A);
                    class174.field2805 = 82;
                    class344.field5145 = 160;
                } else {
                    class159.field2572 = class353.field5211.method1977(class146.field2452, 72) + class510.field7434.method2743(arg0 - 69) + "%";
                    class174.field2805 = 82;
                }
            } else if (class344.field5145 == 160) {
                if (class483.field7117.method2750((byte) -123)) {
                    class159.field2572 = class406.field6105.method1977(class146.field2452, -32);
                    class174.field2805 = 85;
                    class344.field5145 = 170;
                } else {
                    class159.field2572 = class406.field6105.method1977(class146.field2452, -54) + class483.field7117.method2743(-1) + "%";
                    class174.field2805 = 85;
                }
            } else if (class344.field5145 == 170) {
                if (class449.field6678.method2732(2, "details")) {
                    class319.method2036(class449.field6678, class293.field4482, class127.field2174, class123.field2142, class309.field4682, class160.field2586, class402.field6080);
                    class159.field2572 = class141.field2341.method1977(class146.field2452, 67);
                    class174.field2805 = 89;
                    class344.field5145 = 190;
                } else {
                    class159.field2572 = class449.field6674.method1977(class146.field2452, arg0 ^ 0xFFFFFFE2) + class449.field6678.method2767(38, "details") + "%";
                    class174.field2805 = 87;
                }
            } else if (class344.field5145 == 190) {
                class81.field1675 = new int[class47.field975.field307];
                class68.field1377 = new boolean[class47.field975.field307];
                class77.field1555 = new String[class280.field4212.field5285];
                for (int var30 = 0; var30 < class47.field975.field307; var30++) {
                    if (class47.field975.method126(false, var30).field2035 == 0) {
                        class68.field1377[var30] = true;
                        class247.field3811++;
                    }
                    class81.field1675[var30] = -1;
                }
                class9.method56(arg0 ^ 0x44);
                class471.field6989 = class59.field1234.method2735("loginscreen", 121);
                class192.field3097 = class59.field1234.method2735("lobbyscreen", 117);
                class361.field5290.method2736(false, true, 7465);
                class202.field3263.method2736(true, true, 7465);
                class455.field6758.method2736(true, true, 7465);
                class483.field7117.method2736(true, true, 7465);
                class151.field2493.method2736(true, true, 7465);
                class59.field1234.method2736(true, true, 7465);
                class418.field6298 = true;
                class249.field3845.field6834 = 2;
                class374.field5483.field6834 = 2;
                class444.field6595.field6834 = 2;
                class324.field4929.field6834 = 2;
                class127.field2169.field6834 = 2;
                class100.field1927.field6834 = 2;
                class454.field6753.field6834 = 2;
                class56.method509(-1, true, class186.field2990.field2536, -1, false);
                class159.field2572 = class3.field63.method1977(class146.field2452, 103);
                class174.field2805 = 95;
                class344.field5145 = 200;
            } else if (class344.field5145 == 200) {
                class253.method1639(2, arg0 - 16714);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 3818)
    public final void method1379(byte arg0) {
        field3202++;
        try {
            this.method1356(arg0 ^ 0xFFFFFFF7);
        } catch (OutOfMemoryError var3) {
            if (var3.getMessage() == null || !var3.getMessage().startsWith("native")) {
                throw var3;
            }
            class304.method1944(false, 0);
            class486.method2913(var3.getMessage() + " (Recovered) " + this.method1374((byte) 124), var3, (byte) -105);
        }
        if (arg0 != 1) {
            field3219 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Z", line = 3850)
    public static final boolean method1380(int arg0, byte arg1, int arg2) {
        field3199++;
        if (arg1 == -109) {
            return (arg0 & 0x180) != 0;
        } else {
            return true;
        }
    }
}
