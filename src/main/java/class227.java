import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class227 {

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public int field3951 = -1;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field3964 = 0;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Loc;")
    public static class151 field3965 = class137.method873(2, ")1");

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lwh;")
    public static class236 field3961 = new class236(8);

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Ljh;")
    public static class105 field3955;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "Lbd;")
    public class16 field3966;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Lhh;")
    public static class84 field3962;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "[I")
    public int[] field3952;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "[Loc;")
    public class151[] field3950;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static final void method1419(byte arg0) {
        field3953++;
        class1.field34.method648(false);
        int var1 = class1.field34.method645(8, (byte) 10);
        if (class23.field505 > var1) {
            for (int var2 = var1; var2 < class23.field505; var2++) {
                class163.field2942[class21.field462++] = class81.field1553[var2];
            }
        }
        int var3 = 96 % ((-arg0 - 24) / 62);
        if (var1 > class23.field505) {
            throw new RuntimeException("gnpov1");
        }
        class23.field505 = 0;
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class81.field1553[var4];
            class203 var6 = class122.field2190[var5];
            int var7 = class1.field34.method645(1, (byte) 10);
            if (var7 == 0) {
                class81.field1553[class23.field505++] = var5;
                var6.field4028 = class200.field3541;
            } else {
                int var8 = class1.field34.method645(2, (byte) 10);
                if (var8 == 0) {
                    class81.field1553[class23.field505++] = var5;
                    var6.field4028 = class200.field3541;
                    class218.field3800[class111.field1956++] = var5;
                } else if (var8 == 1) {
                    class81.field1553[class23.field505++] = var5;
                    var6.field4028 = class200.field3541;
                    int var9 = class1.field34.method645(3, (byte) 10);
                    var6.method1430(false, var9, -10527);
                    int var10 = class1.field34.method645(1, (byte) 10);
                    if (var10 == 1) {
                        class218.field3800[class111.field1956++] = var5;
                    }
                } else if (var8 == 2) {
                    class81.field1553[class23.field505++] = var5;
                    var6.field4028 = class200.field3541;
                    int var11 = class1.field34.method645(3, (byte) 10);
                    var6.method1430(true, var11, -10527);
                    int var12 = class1.field34.method645(3, (byte) 10);
                    var6.method1430(true, var12, -10527);
                    int var13 = class1.field34.method645(1, (byte) 10);
                    if (var13 == 1) {
                        class218.field3800[class111.field1956++] = var5;
                    }
                } else if (var8 == 3) {
                    class163.field2942[class21.field462++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lsd;II)Lcg;")
    public static final class30 method1420(class192 arg0, int arg1, int arg2) {
        field3956++;
        if (arg1 == -5) {
            return class75.method489(arg2, arg0, 103) ? class148.method938(75) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
    public static final void method1421(boolean arg0) {
        if (class138.field2517 > class188.field3339) {
            class188.field3339 += class188.field3339 / 30.0D;
            if (class188.field3339 > class138.field2517) {
                class188.field3339 = class138.field2517;
            }
            class237.method1541(true);
        } else if (class138.field2517 < class188.field3339) {
            class188.field3339 -= class188.field3339 / 30.0D;
            if (class138.field2517 > class188.field3339) {
                class188.field3339 = class138.field2517;
            }
            class237.method1541(true);
        }
        if (arg0) {
            field3962 = null;
        }
        if (class138.field2508 != -1 && class106.field1877 != -1) {
            int var1 = class138.field2508 - class110.field1943;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class106.field1877 - class25.field541;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class106.field1877 = -1;
                class138.field2508 = -1;
            }
            class25.field541 += var2;
            class110.field1943 += var1;
            class237.method1541(true);
        }
        field3963++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Laa;")
    public static final class2 method1422(int arg0, int arg1) {
        int var2 = 92 % ((arg0 - 56) / 35);
        class2 var3 = (class2) class121.field2172.method1318((byte) -121, (long) arg1);
        field3957++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class36.field729.method1208(arg1, (byte) 58, 3);
        class2 var5 = new class2();
        if (var4 != null) {
            var5.method25(32, new class229(var4));
        }
        class121.field2172.method1324(var5, 18373, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
    public static void method1423(byte arg0) {
        field3955 = null;
        field3962 = null;
        field3965 = null;
        int var1 = -52 / ((40 - arg0) / 60);
        field3961 = null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V")
    public static final void method1424(boolean arg0) {
        class79.field1521 = null;
        class231.field4122 = null;
        field3960++;
        class109.field1941 = null;
        class94.field1759 = null;
        class103.field1850 = null;
        class197.field3506 = null;
        if (arg0) {
            method1420(null, 3, 71);
        }
        class185.field3319 = null;
        class141.field2558 = null;
        class78.field1508 = null;
        class223.field3883 = null;
        class175.field3167 = null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)I")
    public static final int method1425(int arg0, int arg1) {
        field3958++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = arg1 + (arg0 * var3 >> 12);
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static final void method1426(int arg0) {
        field3959++;
        if (class144.field2604 == null) {
            return;
        }
        if (class124.field2239 < 10) {
            if (!class58.field1164.method1197(class144.field2604, (byte) 36)) {
                class124.field2239 = class58.field1164.method1193(class144.field2604, 250) / 10;
                return;
            }
            class124.field2239 = 10;
        }
        if (class124.field2239 == 10) {
            class229 var1 = new class229(class58.field1164.method1195(class226.field3942, 0, class144.field2604));
            int var2 = var1.method1490((byte) 73);
            int var3 = var1.method1490((byte) 73);
            int var4 = var1.method1490((byte) 73);
            int var5 = var1.method1490((byte) 73);
            int var6 = var1.method1490((byte) 73);
            int var7 = var1.method1490((byte) 73);
            class36.field759 = var3 * 64;
            class188.field3339 = 8.0D;
            class138.field2517 = 8.0D;
            class27.field581 = (var5 - var3) * 64 + 64;
            class217.field3788 = (var4 + 1 - var2) * 64;
            class19.field396 = new int[class208.field3659 + 1];
            class63.field1228 = var2 * 64;
            int var8 = (class228.field3975.field4029 >> 7) + class64.field1255 - class36.field759;
            int var9 = var8 + (int) (Math.random() * 10.0D) - 5;
            int var10 = class217.field3788 >> 6;
            int var11 = class223.field3881 >> 2 << 10;
            int var12 = (class228.field3975.field3976 >> 7) + (class232.field4188 - class63.field1228);
            int var13 = class27.field581 >> 6;
            class160.field2900 = new byte[var10][var13][];
            class175.field3171 = new int[var10][var13][];
            class152.field2751 = new byte[var10][var13][];
            class166.field3007 = new byte[var10][var13][];
            class180.field3264 = new byte[var10][var13][];
            class106.field1876 = new byte[var10][var13][];
            class43.field883 = new int[var10][var13][];
            class107.field1891 = new byte[var10][var13][];
            int var14 = var12 + (int) (Math.random() * 10.0D) - 5;
            if (var14 >= 0 && class217.field3788 > var14 && var9 >= 0 && class27.field581 > var9) {
                class110.field1943 = var14;
                class25.field541 = class27.field581 - var9;
            } else {
                class25.field541 = class36.field759 + class27.field581 - var7 * 64;
                class110.field1943 = var6 * 64 - class63.field1228;
            }
            int var15 = class177.field3195 >> 1;
            for (int var16 = 0; var16 < class208.field3659; var16++) {
                class74 var17 = class48.method342(-1817, var16);
                if (var17 != null) {
                    int var18 = var17.field1436;
                    if (var18 >= 0 && !class61.field1198.method453(var18, (byte) -24)) {
                        var18 = -1;
                    }
                    int var22;
                    if (var17.field1429 >= 0) {
                        int var19 = var17.field1429;
                        int var20 = (var19 & 0x7F) + var15;
                        if (var20 < 0) {
                            var20 = 0;
                        } else if (var20 > 127) {
                            var20 = 127;
                        }
                        int var21 = (var11 + var19 & 0xFC00) - (-(var19 & 0x380) - var20);
                        var22 = class61.field1207[class160.method1039(var21, 96, (byte) 121)];
                    } else if (var18 >= 0) {
                        var22 = class61.field1207[class160.method1039(class61.field1198.method462(true, var18), 96, (byte) 116)];
                    } else if (var17.field1438 == -1) {
                        var22 = -1;
                    } else {
                        int var23 = var17.field1438;
                        int var24 = (var23 & 0x7F) + var15;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 > 127) {
                            var24 = 127;
                        }
                        int var25 = (var23 + var11 & 0xFC00) + (var23 & 0x380) + var24;
                        var22 = class61.field1207[class160.method1039(var25, 96, (byte) 116)];
                    }
                    class19.field396[var16 + 1] = var22;
                }
            }
            class124.field2239 = 20;
        } else if (class124.field2239 == 20) {
            class66.method436((byte) -88, class58.field1164.method1195(class154.field2794, 0, class144.field2604));
            class124.field2239 = 30;
            class5.method34(arg0 + 10376);
        } else if (class124.field2239 == 30) {
            class112.method679(-1, class58.field1164.method1195(class185.field3313, 0, class144.field2604));
            class124.field2239 = 50;
            class5.method34(103);
        } else {
            if (arg0 != -10267) {
                field3967 = -54;
            }
            if (class124.field2239 == 50) {
                class224.method1411(class58.field1164.method1195(class196.field3487, arg0 ^ 0xFFFFD7E5, class144.field2604), 111);
                class124.field2239 = 70;
                class5.method34(98);
            } else if (class124.field2239 == 70) {
                class44.method316((byte) -38, class58.field1164.method1195(class94.field1760, arg0 + 10267, class144.field2604));
                class124.field2239 = 90;
                class5.method34(117);
            } else {
                class200.method1252(0, class58.field1164.method1195(class192.field3431, 0, class144.field2604));
                if (class124.field2239 == 90) {
                    class89.field1635 = new class214(11, true, class39.field798);
                    class231.field4126 = new class214(12, true, class39.field798);
                    class121.field2183 = new class214(14, true, class39.field798);
                    class42.field872 = new class214(17, true, class39.field798);
                    class54.field1101 = new class214(19, true, class39.field798);
                    class154.field2797 = new class214(22, true, class39.field798);
                    class66.field1276 = new class214(26, true, class39.field798);
                    class21.field467 = new class214(30, true, class39.field798);
                    class124.field2239 = 100;
                }
                class138.field2508 = -1;
                class106.field1877 = -1;
                class124.field2239 = 100;
                class5.method34(116);
                System.gc();
            }
        }
    }
}
