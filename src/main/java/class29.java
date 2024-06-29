import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class29 extends class26 {

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "Ljava/lang/String;")
    public String field332;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "[I")
    public static int[] field331 = new int[2];

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "[Lfd;")
    public static class299[] field334 = new class299[2048];

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "Z")
    public static boolean field330;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "[I")
    public static int[] field329;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V", line = 8)
    public static void method186(int arg0) {
        field334 = null;
        field329 = null;
        if (arg0 <= 39) {
            method186(20);
        }
        field331 = null;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V", line = 22)
    public static final void method187(int arg0) {
        field328++;
        if (arg0 != -19674) {
            method187(32);
        }
        class104.field1351.method2258((byte) 86);
        class231.field3307.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 42)
    public class29() {
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIZII)V", line = 46)
    public static final void method188(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class42.field531++;
        field333++;
        class357.method2483(68);
        if (arg3) {
            class254.method1771(0, true, false, false);
        } else {
            class268.method1831(0, 92);
            class254.method1771(0, true, false, true);
            if (class48.field643 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class254.method1771(var7, true, false, false);
                    class254.method1771(var7, true, true, false);
                    class268.method1831(var7, -122);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class268.method1831(var6, -103);
                    class254.method1771(var6, true, false, false);
                    class254.method1771(var6, true, true, false);
                }
            }
        }
        if (!arg3) {
            class109.method775((byte) -12);
        }
        class92.method669(60);
        if (class47.field623) {
            class318.method2197(arg5, true, false, arg2, arg1, arg4);
            arg4 = class30.field340;
            arg2 = class339.field5302;
            arg5 = class242.field3501;
            arg1 = class223.field3208;
        }
        class187.field2573 = arg1;
        class187.field2567 = arg5;
        if (client.field1631 == 1) {
            int var8 = (int) class302.field4426;
            if (class100.field1312 / 256 > var8) {
                var8 = class100.field1312 / 256;
            }
            int var9 = (int) class247.field3601 + class59.field753 & 0x7FF;
            if (class214.field3024[4] && (class355.field5562[4] + 128) > var8) {
                var8 = class355.field5562[4] + 128;
            }
            class167.method1248(57, var9, class271.method1847(class359.field5616.field4893, true, class359.field5616.field4855, class56.field724) - 50, var8, var8 * 3 + 600, class135.field1845, arg2, class322.field4730);
        } else if (client.field1631 == 5) {
            class78.method559(true, arg2);
        }
        int var10 = class112.field1453;
        int var11 = class248.field3606;
        int var12 = class94.field1222;
        int var13 = class343.field5332;
        int var14 = class347.field5398;
        for (int var15 = arg0; var15 < 5; var15++) {
            if (class214.field3024[var15]) {
                int var16 = (int) ((double) (-class225.field3235[var15]) + Math.random() * (double) (class225.field3235[var15] * 2 + 1) + Math.sin((double) class345.field5365[var15] / 100.0D * (double) class345.field5368[var15]) * (double) class355.field5562[var15]);
                if (var15 == 1) {
                    class343.field5332 += var16;
                }
                if (var15 == 4) {
                    class94.field1222 += var16;
                    if (class94.field1222 < 128) {
                        class94.field1222 = 128;
                    }
                    if (class94.field1222 > 383) {
                        class94.field1222 = 383;
                    }
                }
                if (var15 == 3) {
                    class347.field5398 = class347.field5398 + var16 & 0x7FF;
                }
                if (var15 == 2) {
                    class248.field3606 += var16;
                }
                if (var15 == 0) {
                    class112.field1453 += var16;
                }
            }
        }
        class232.method1656(false);
        if (class47.field623) {
            class129.method989(arg1, arg5, arg1 + arg4, arg2 + arg5);
            boolean var18 = false;
            float var19 = (float) class94.field1222 * 0.17578125F;
            float var20 = (float) class347.field5398 * 0.17578125F;
            if (client.field1631 == 3) {
                var19 = class40.field504 * 360.0F / 6.2831855F;
                var20 = class13.field156 * 360.0F / 6.2831855F;
            }
            int var21;
            if (class316.field4661 == 10) {
                var21 = class261.method1799(class254.field3713, class248.field3606 >> 10, class186.field2551, class112.field1453 >> 10, true);
            } else {
                var21 = class261.method1799(class254.field3713, class359.field5616.field4936[0] >> 3, class186.field2551, class359.field5616.field4842[0] >> 3, true);
            }
            if (class238.field3437 >= 0) {
                class47.method360();
                class324 var22 = class292.method2003(class199.field2799, (byte) 126, class138.field1907, class238.field3437, class104.field1358);
                var22.method2239(class72.field966, arg1, arg5, arg4, arg2, class94.field1222, class347.field5398, var21);
            } else {
                class47.method374(var21);
            }
            class47.method339(arg1, arg5, arg4, arg2, arg1 + (arg4 / 2), arg2 / 2 + arg5, var19, var20, class277.field3968, class277.field3968);
            class351.method2446(-3472, false);
            class47.method375();
            class47.method345(true);
            class47.method350(true);
        } else {
            class37.method235(arg1, arg5, arg1 + arg4, arg5 - -arg2);
            class350.method2444();
            if (class238.field3437 >= 0) {
                class324 var17 = class292.method2003(class199.field2799, (byte) 127, class138.field1907, class238.field3437, class104.field1358);
                var17.method2238(class72.field966, arg1, arg5, arg4, arg2, class94.field1222, class347.field5398, 0);
            } else {
                class37.method231(arg1, arg5, arg4, arg2, 0);
            }
        }
        if (class159.field2263 || class73.field971 < arg1 || class73.field971 >= (arg1 + arg4) || arg5 > class302.field4434 || class302.field4434 >= (arg2 + arg5)) {
            class273.field3917 = false;
            class66.field835 = 0;
        } else {
            class66.field835 = 0;
            class273.field3917 = true;
            int var23 = class237.field3432;
            int var24 = class40.field499;
            int var25 = class124.field1652;
            int var26 = class7.field71;
            class56.field723 = (class73.field971 - arg1) * (var23 - var26) / arg4 + var26;
            class208.field2952 = (class302.field4434 - arg5) * (var24 - var25) / arg2 + var25;
        }
        class323.method2235(false);
        byte var27 = class161.method1228((byte) -82) == 2 ? (byte) class42.field531 : 1;
        if (class47.field623) {
            class22.method136(class313.field4603, !class80.field1017);
            class212.method1550(class347.field5398, class94.field1222, class343.field5332, class248.field3606, 85, class112.field1453);
            class47.field625 = class313.field4603;
            class73.method540(class112.field1453, class343.field5332, class248.field3606, class94.field1222, class347.field5398, class306.field4480, class48.field646, class221.field3181, class7.field64, class291.field4235, field331, class56.field724 + 1, var27, class359.field5616.field4855 >> 7, class359.field5616.field4893 >> 7);
            class103.field1345 = true;
            class22.method137();
            class212.method1550(0, 0, 0, 0, 91, 0);
            class323.method2235(false);
            class233.method1657(arg1, class277.field3968, arg2, class277.field3968, arg4, arg5, (byte) -127);
            class138.method1044(arg5, -8967, class277.field3968, arg2, class277.field3968, arg4, arg1);
            class272.method1851();
        } else {
            class73.method540(class112.field1453, class343.field5332, class248.field3606, class94.field1222, class347.field5398, class306.field4480, class48.field646, class221.field3181, class7.field64, class291.field4235, field331, class56.field724 + 1, var27, class359.field5616.field4855 >> 7, class359.field5616.field4893 >> 7);
            class323.method2235(false);
            class272.method1851();
            class233.method1657(arg1, 256, arg2, 256, arg4, arg5, (byte) -125);
            class138.method1044(arg5, -8967, 256, arg2, 256, arg4, arg1);
        }
        ((class138) class350.field5467).method1040(class186.field2551, -103);
        class94.method682(arg5, arg1, arg2, arg4, true);
        class112.field1453 = var10;
        class343.field5332 = var13;
        class347.field5398 = var14;
        class94.field1222 = var12;
        class248.field3606 = var11;
        if (class233.field3339 && class85.field1092.method21(false) == 0) {
            class233.field3339 = false;
        }
        if (class233.field3339) {
            if (class47.field623) {
                class129.method997(arg1, arg5, arg4, arg2, 0);
            } else {
                class37.method231(arg1, arg5, arg4, arg2, 0);
            }
            class190.method1383((byte) -103, class207.field2885, false);
        }
        if (!arg3 && !class233.field3339 && !class159.field2263 && arg1 <= class73.field971 && arg1 + arg4 > class73.field971 && arg5 <= class302.field4434 && arg2 + arg5 > class302.field4434) {
            class42.method305(arg2, class73.field971, arg5, arg1, arg4, -105, class302.field4434);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 307)
    public class29(String arg0) {
        this.field332 = arg0;
    }
}
