import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class162 {

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "J")
    public long field2350 = 0L;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[[[Lag;")
    public static class97[][][] field2335 = new class97[4][104][104];

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field2341 = 0;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "[I")
    public static int[] field2345 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field2355 = 0;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "[I")
    public static int[] field2359 = new int[14];

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public int field2357;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public int field2358;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lnk;")
    public static class11 field2338;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Ltk;")
    public class219 field2348;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lve;")
    public static class233 field2344;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Z")
    public static boolean field2347;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ltk;III)V")
    public static final void method1084(class219 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class90.field1372) {
            class131 var4 = class16.field233[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1930 != null && var4.field1930.field1569.method864()) {
                arg0.method884(var4.field1930.field1569, 128, 0, 0, true);
            }
        }
        if (arg3 < class90.field1372) {
            class131 var5 = class16.field233[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1930 != null && var5.field1930.field1569.method864()) {
                arg0.method884(var5.field1930.field1569, 0, 0, 128, true);
            }
        }
        if (arg2 < class90.field1372 && arg3 < class225.field3383) {
            class131 var6 = class16.field233[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1930 != null && var6.field1930.field1569.method864()) {
                arg0.method884(var6.field1930.field1569, 128, 0, 128, true);
            }
        }
        if (arg2 < class90.field1372 && arg3 > 0) {
            class131 var7 = class16.field233[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1930 != null && var7.field1930.field1569.method864()) {
                arg0.method884(var7.field1930.field1569, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static final void method1085(byte arg0) {
        field2354++;
        if (class81.field1251 == 0) {
            return;
        }
        try {
            if ((++class40.field591) > 2000) {
                if (class10.field180 != null) {
                    class10.field180.method362(false);
                    class10.field180 = null;
                }
                if (class221.field3259 >= 1) {
                    class204.field2956 = -5;
                    class81.field1251 = 0;
                    return;
                }
                if (class39.field581 == class224.field3349) {
                    class224.field3349 = class132.field1939;
                } else {
                    class224.field3349 = class39.field581;
                }
                class221.field3259++;
                class40.field591 = 0;
                class81.field1251 = 1;
            }
            if (class81.field1251 == 1) {
                class182.field2600 = class163.field2378.method550(class60.field910, 32606, class224.field3349);
                class81.field1251 = 2;
            }
            if (class81.field1251 == 2) {
                if (class182.field2600.field3588 == 2) {
                    throw new IOException();
                }
                if (class182.field2600.field3588 != 1) {
                    return;
                }
                class10.field180 = new class54((Socket) class182.field2600.field3585, class163.field2378);
                class182.field2600 = null;
                class10.field180.method356((byte) 13, class95.field1451.field1629, 0, class95.field1451.field1673);
                if (class217.field3198 != null) {
                    class217.field3198.method1455(false);
                }
                if (class240.field3599 != null) {
                    class240.field3599.method1455(false);
                }
                int var1 = class10.field180.method358(110);
                if (class217.field3198 != null) {
                    class217.field3198.method1455(false);
                }
                if (class240.field3599 != null) {
                    class240.field3599.method1455(false);
                }
                if (var1 != 21) {
                    class81.field1251 = 0;
                    class204.field2956 = var1;
                    class10.field180.method362(false);
                    class10.field180 = null;
                    return;
                }
                class81.field1251 = 3;
            }
            int var2 = -3 % ((arg0 - 64) / 36);
            if (class81.field1251 == 3) {
                if (class10.field180.method357((byte) -110) < 1) {
                    return;
                }
                class72.field1108 = new String[class10.field180.method358(26)];
                class81.field1251 = 4;
            }
            if (class81.field1251 == 4 && class10.field180.method357((byte) -112) >= class72.field1108.length * 8) {
                class68.field1071.field1673 = 0;
                class10.field180.method363(class68.field1071.field1629, -5942, class72.field1108.length * 8, 0);
                for (int var3 = 0; var3 < class72.field1108.length; var3++) {
                    class72.field1108[var3] = class74.method496(4096, class68.field1071.method769(-1682));
                }
                class204.field2956 = 21;
                class81.field1251 = 0;
                class10.field180.method362(false);
                class10.field180 = null;
            }
        } catch (IOException var4) {
            if (class10.field180 != null) {
                class10.field180.method362(false);
                class10.field180 = null;
            }
            if (class221.field3259 >= 1) {
                class81.field1251 = 0;
                class204.field2956 = -4;
            } else {
                class221.field3259++;
                class40.field591 = 0;
                class81.field1251 = 1;
                if (class39.field581 == class224.field3349) {
                    class224.field3349 = class132.field1939;
                } else {
                    class224.field3349 = class39.field581;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1086(int arg0, int arg1, int arg2, int arg3) {
        if (class191.method1225(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return client.method1433(var4 + 1, class107.field1556[arg0][arg1][arg2] + arg3, var5 + 1) && client.method1433(var4 + 128 - 1, class107.field1556[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && client.method1433(var4 + 128 - 1, class107.field1556[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && client.method1433(var4 + 1, class107.field1556[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lfd;")
    public static final class213 method1087(int arg0, int arg1) {
        field2356++;
        class213 var2 = (class213) class178.field2520.method1501((long) arg1, (byte) -59);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class131.field1904.method1538(1, arg1, (byte) 117);
        } else {
            var3 = class141.field2049.method1538(1, arg1 & 0x7FFF, (byte) 99);
        }
        class213 var4 = new class213();
        if (var3 != null) {
            var4.method1357(new class114(var3), 903);
        }
        if (arg1 >= 32768) {
            var4.method1362(-28977);
        }
        if (arg0 == 1) {
            class178.field2520.method1499((long) arg1, -91, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIZII)V")
    public static final void method1088(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2349++;
        class166.field2422++;
        class258.method1733(false);
        if (arg3) {
            class121.method827(false, 0, false, 80);
        } else {
            class194.method1244(0, arg2 - 27658);
            class121.method827(false, 0, true, -21);
            if (class221.field3269 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class121.method827(false, var7, false, -128);
                    class121.method827(true, var7, false, 103);
                    class194.method1244(var7, 43);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class194.method1244(var6, arg2 ^ 0x6C09);
                    class121.method827(false, var6, false, arg2 - 27901);
                    class121.method827(true, var6, false, 46);
                }
            }
        }
        if (arg2 != 27773) {
            method1090(false, -125);
        }
        if (!arg3) {
            class42.method287(32292);
        }
        class26.method198(-1);
        if (class68.field1069 == 1) {
            int var8 = class103.field1535;
            int var9 = class253.field3847 + class245.field3667 & 0x7FF;
            if (class29.field414 / 256 > var8) {
                var8 = class29.field414 / 256;
            }
            if (class14.field215[4] && (class234.field3521[4] + 128) > var8) {
                var8 = class234.field3521[4] + 128;
            }
            class70.method480((var8 * 3) + 600, var9, arg2 ^ 0x7A7A, class81.method542(class55.field847.field45, -1, class163.field2364, class55.field847.field94) - 50, var8, arg1, class25.field332, class104.field1544);
        }
        int var10 = class89.field1355;
        int var11 = class169.field2442;
        int var12 = class223.field3341;
        int var13 = class146.field2097;
        int var14 = class30.field439;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class14.field215[var15]) {
                int var21 = (int) ((double) (-class86.field1327[var15]) + Math.random() * (double) (class86.field1327[var15] * 2 + 1) + Math.sin((double) class221.field3265[var15] / 100.0D * (double) class194.field2780[var15]) * (double) class234.field3521[var15]);
                if (var15 == 0) {
                    class89.field1355 += var21;
                }
                if (var15 == 1) {
                    class169.field2442 += var21;
                }
                if (var15 == 2) {
                    class223.field3341 += var21;
                }
                if (var15 == 4) {
                    class146.field2097 += var21;
                    if (class146.field2097 < 128) {
                        class146.field2097 = 128;
                    }
                    if (class146.field2097 > 383) {
                        class146.field2097 = 383;
                    }
                }
                if (var15 == 3) {
                    class30.field439 = class30.field439 + var21 & 0x7FF;
                }
            }
        }
        class113.method732(1000000);
        class144.method950(arg0, arg4, arg0 + arg5, arg4 - -arg1);
        class18.method150();
        if (class151.field2185 || class261.field3942 < arg0 || class261.field3942 >= arg0 + arg5 || class222.field3311 < arg4 || arg1 + arg4 <= class222.field3311) {
            class178.field2519 = 0;
            class19.field271 = false;
        } else {
            class19.field271 = true;
            int var16 = class51.field757;
            class178.field2519 = 0;
            int var17 = class132.field1941;
            int var18 = class43.field622;
            class206.field2989 = (var18 - var16) * (class261.field3942 - arg0) / arg5 + var16;
            int var19 = class152.field2191;
            class269.field4215 = (class222.field3311 - arg4) * (var19 - var17) / arg1 + var17;
        }
        class270.method1804(arg2 - 17485);
        byte var20 = class221.method1425(2) == 2 ? (byte) class166.field2422 : 1;
        class144.method955(arg0, arg4, arg5, arg1, 0);
        class224.method1465(class89.field1355, class169.field2442, class223.field3341, class146.field2097, class30.field439, class10.field175, class251.field3829, class97.field1465, class67.field1045, class193.field2773, class128.field1882, class163.field2364 + 1, var20, class55.field847.field45 >> 7, class55.field847.field94 >> 7);
        class270.method1804(10288);
        class285.method1917();
        class61.method419(256, -128, arg1, arg5, 256, arg0, arg4);
        class76.method508(256, arg4, arg1, arg5, 104, 256, arg0);
        ((class242) class18.field252).method1575(62, class38.field566);
        class171.method1132((byte) -126, arg5, arg1, arg4, arg0);
        class89.field1355 = var10;
        class146.field2097 = var13;
        class223.field3341 = var12;
        class30.field439 = var14;
        class169.field2442 = var11;
        if (class57.field878 && class81.field1257.method1627((byte) -127) == 0) {
            class57.field878 = false;
        }
        if (class57.field878) {
            class144.method955(arg0, arg4, arg5, arg1, 0);
            class69.method474(false, class86.field1333, true);
        }
        if (!arg3 && !class57.field878 && !class151.field2185 && class261.field3942 >= arg0 && class261.field3942 < arg0 + arg5 && arg4 <= class222.field3311 && arg1 + arg4 > class222.field3311) {
            class73.method495(arg0, arg4, arg2 ^ 0xFFFF9382, class222.field3311, arg5, arg1, class261.field3942);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
    public static void method1089(byte arg0) {
        field2345 = null;
        field2359 = null;
        field2335 = null;
        field2344 = null;
        field2338 = null;
        int var1 = -34 % ((arg0 - 64) / 39);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method1090(boolean arg0, int arg1) {
        if (!arg0) {
            field2345 = null;
        }
        field2360++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class280.field4474 + "</col>";
        } else {
            return "<col=00ff80>" + arg1 / 1000000 + class184.field2626 + "</col>";
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BIILde;)V")
    public static final void method1091(byte arg0, int arg1, int arg2, class53 arg3) {
        if (arg0 < 10) {
            field2338 = null;
        }
        field2342++;
        if (arg3.field98 == arg1 && arg1 != -1) {
            class196 var4 = class70.method478(arg1, false);
            int var5 = var4.field2820;
            if (var5 == 1) {
                arg3.field38 = 0;
                arg3.field88 = arg2;
                arg3.field133 = 0;
                arg3.field63 = 1;
                arg3.field37 = 0;
                class206.method1327(arg3.field38, 66, var4, class55.field847 == arg3, arg3.field94, arg3.field45);
            }
            if (var5 == 2) {
                arg3.field37 = 0;
                return;
            }
        } else if (arg1 == -1 || arg3.field98 == -1 || class70.method478(arg1, false).field2830 >= class70.method478(arg3.field98, false).field2830) {
            arg3.field37 = 0;
            arg3.field133 = 0;
            arg3.field103 = arg3.field84;
            arg3.field98 = arg1;
            arg3.field38 = 0;
            arg3.field88 = arg2;
            arg3.field63 = 1;
            if (arg3.field98 == -1) {
                return;
            }
            class206.method1327(arg3.field38, 61, class70.method478(arg3.field98, false), class55.field847 == arg3, arg3.field94, arg3.field45);
        }
    }
}
