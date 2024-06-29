import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class18 extends class123 {

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "J")
    public static long field389 = 0L;

    @OriginalMember(owner = "client!ff", name = "jb", descriptor = "Leb;")
    private static class230 field400 = class68.method589(0, "Connecting to update server");

    @OriginalMember(owner = "client!ff", name = "ib", descriptor = "Leb;")
    public static class230 field399 = class68.method589(0, "Versteckt");

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "I")
    public static int field393 = 0;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "[I")
    public static int[] field392 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ff", name = "nb", descriptor = "Z")
    public static boolean field404 = false;

    @OriginalMember(owner = "client!ff", name = "qb", descriptor = "Leb;")
    public static class230 field407 = field400;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "Leb;")
    public static class230 field391 = class68.method589(0, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!ff", name = "hb", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!ff", name = "kb", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ff", name = "mb", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ff", name = "ob", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!ff", name = "pb", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!ff", name = "lb", descriptor = "[Lle;")
    private class42[] field402;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
    public static final void method219(int arg0) {
        ++field388;
        for (int var1 = 0; ~var1 > ~class17.field386; ++var1) {
            int var10002 = class110.field1982[var1]--;
            if (~class110.field1982[var1] <= 9) {
                class137 var4 = class190.field3361[var1];
                if (var4 == null) {
                    var4 = class137.method1056(class40.field733, class88.field1526[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class110.field1982[var1] += var4.method1057();
                    class190.field3361[var1] = var4;
                }
                if (~class110.field1982[var1] > -1) {
                    int var5;
                    if (~class26.field491[var1] == -1) {
                        var5 = class97.field1790;
                    } else {
                        int var6 = (class26.field491[var1] & 255) * 128;
                        int var7 = 255 & class26.field491[var1] >> 16;
                        int var8 = class26.field491[var1] >> 8 & 255;
                        int var9 = var7 * 128 + -class56.field1033.field2274 + 64;
                        if (~var9 > -1) {
                            var9 = -var9;
                        }
                        int var10 = var8 * 128 - class56.field1033.field2300 + 64;
                        if (var10 < 0) {
                            var10 = -var10;
                        }
                        int var11 = var9 + var10 - 128;
                        if (var6 < var11) {
                            class110.field1982[var1] = -100;
                            continue;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        var5 = (-var11 + var6) * class231.field4020 / var6;
                    }
                    if (~var5 < -1) {
                        class148 var12 = var4.method1059().method1130(class189.field3323);
                        class64 var13 = class64.method537(var12, 100, var5);
                        var13.method535(class179.field3144[var1] + -1);
                        class117.field2096.method1676(var13);
                    }
                    class110.field1982[var1] = -100;
                }
            } else {
                --class17.field386;
                for (int var3 = var1; ~class17.field386 < ~var3; ++var3) {
                    class88.field1526[var3] = class88.field1526[var3 - -1];
                    class190.field3361[var3] = class190.field3361[var3 + 1];
                    class179.field3144[var3] = class179.field3144[var3 + 1];
                    class110.field1982[var3] = class110.field1982[var3 + 1];
                    class26.field491[var3] = class26.field491[var3 + 1];
                }
                --var1;
            }
        }
        if (class110.field1978 && !class238.method1672(85)) {
            if (class16.field365 != 0 && ~class106.field1927 != 0) {
                class204.method1434(class16.field365, class106.field1927, (byte) 123, 0, false, class197.field3528);
            }
            class110.field1978 = false;
        } else if (class16.field365 != 0 && class106.field1927 != -1 && !class238.method1672(116)) {
            class153.field2747.method978(19, 58);
            class153.field2747.method165(class106.field1927, 1380186760);
            class106.field1927 = -1;
            ++class170.field3022;
        }
        int var2 = -47 / ((-66 - arg0) / 59);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lkk;Lkk;Lkk;I)V")
    public static final void method220(class223 arg0, class223 arg1, class223 arg2, int arg3) {
        class29.field532 = arg1;
        class252.field4517 = arg2;
        if (arg3 != 0) {
            field404 = true;
        }
        class134.field2421 = arg0;
        ++field403;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZBLeb;)V")
    public static final void method221(boolean arg0, byte arg1, class230 arg2) {
        byte var3 = 4;
        ++field405;
        int var4 = class180.field3151.method803(arg2, 250);
        int var5 = var3 + 6;
        if (arg1 == 26) {
            int var6 = var3 + 6;
            int var7 = class180.field3151.method804(arg2, 250) * 13;
            class87.method705(-var3 + var6, -var3 + var5, var3 + var4 - -var3, var3 + var7 + var3, 0);
            class87.method713(-var3 + var6, -var3 + var5, var4 - -var3 - -var3, var3 + var7 - -var3, 16777215);
            class180.field3151.method798(arg2, var6, var5, var4, var7, 16777215, -1, 1, 1, 0);
            class14.method149(var3 + var7 + var3, -var3 + var6, -var3 + var5, -14160, var4 - -var3 - -var3);
            if (arg0) {
                try {
                    Graphics var8 = class14.field307.getGraphics();
                    class251.field4499.method361(0, var8, 0, -7295);
                } catch (Exception var9) {
                    class14.field307.repaint();
                }
            } else {
                class35.method324(0, var6, var5, var4, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class18() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
    public static final void method222(int arg0, int arg1, int arg2) {
        ++field390;
        if (class140.field2505 != arg2) {
            class214.field3705 = new int[arg2];
            for (int var3 = 0; arg2 > var3; ++var3) {
                class214.field3705[var3] = (var3 << 12) / arg2;
            }
            class194.field3493 = arg2 != 64 ? 4096 : 2048;
            class217.field3743 = arg2 + -1;
            class140.field2505 = arg2;
        }
        if (~class255.field4540 != ~arg0) {
            if (~class140.field2505 == ~arg0) {
                class154.field2753 = class214.field3705;
            } else {
                class154.field2753 = new int[arg0];
                for (int var4 = 0; ~arg0 < ~var4; ++var4) {
                    class154.field2753[var4] = (var4 << 12) / arg0;
                }
            }
            class79.field1431 = arg0 + -1;
            class255.field4540 = arg0;
        }
        if (arg1 != -557025620) {
            method226((byte) 38, 55, 54, -107, 65, 80);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B[[I)V")
    private final void method223(byte arg0, int[][] arg1) {
        ++field395;
        int var3 = class255.field4540;
        int var4 = class140.field2505;
        class196.method1397(arg1, 19);
        if (arg0 >= -30) {
            field392 = null;
        }
        class171.method1256(class217.field3743, 0, class79.field1431, 0, 0);
        if (this.field402 != null) {
            for (int var5 = 0; this.field402.length > var5; ++var5) {
                class42 var6 = this.field402[var5];
                int var7 = var6.field768;
                int var8 = var6.field773;
                if (var8 < 0) {
                    if (var7 >= 0) {
                        var6.method371(var4, var3, (byte) -75);
                    }
                } else if (var7 >= 0) {
                    var6.method367(1, var4, var3);
                } else {
                    var6.method368(var3, var4, -8259);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)Z")
    public static final boolean method224(byte arg0) {
        if (arg0 != 63) {
            method219(-88);
        }
        ++field398;
        try {
            if (++class61.field1180 > 1500) {
                if (class30.field556 != null) {
                    class30.field556.method1818(-2);
                    class30.field556 = null;
                    class60.method509(-97);
                    return true;
                } else if (class30.field559 < 1) {
                    if (~class244.field4193 == ~class231.field4019) {
                        class231.field4019 = class95.field1723;
                    } else {
                        class231.field4019 = class244.field4193;
                    }
                    ++class30.field559;
                    class178.field3126 = 0;
                    class61.field1180 = 0;
                    return false;
                } else {
                    class60.method509(-111);
                    return true;
                }
            } else if (class178.field3126 == 0) {
                if (~(-5000L + class201.method1419(5)) > ~class146.field2626) {
                    return true;
                } else {
                    class146.field2626 = class201.method1419(5);
                    class53.field909 = class184.field3228.method1024((byte) -65, class146.field2629, class231.field4019);
                    class178.field3126 = 1;
                    return false;
                }
            } else if (~class178.field3126 == -2) {
                if (class53.field909.field3421 == 2) {
                    throw new IOException();
                } else if (class53.field909.field3421 != 1) {
                    return false;
                } else {
                    class30.field556 = new class261((Socket) class53.field909.field3423, class184.field3228);
                    int var1 = 0;
                    if (class166.field2931) {
                        var1 = class207.field3641;
                    }
                    class153.field2747.field318 = 0;
                    class53.field909 = null;
                    class153.field2747.method170((byte) 118, 102);
                    class153.field2747.method165(var1, 1380186760);
                    class30.field556.method1817(class153.field2747.field269, 0, -12152, class153.field2747.field318);
                    if (class92.field1659 != null) {
                        class92.field1659.method1072(-123);
                    }
                    if (class133.field2414 != null) {
                        class133.field2414.method1072(-127);
                    }
                    class91.field1647 = class30.field556.method1814(arg0 ^ 63);
                    if (class92.field1659 != null) {
                        class92.field1659.method1072(-121);
                    }
                    if (class133.field2414 != null) {
                        class133.field2414.method1072(-128);
                    }
                    class178.field3126 = 2;
                    return false;
                }
            } else if (class178.field3126 == 2) {
                if (class30.field556.method1816(0) < 1) {
                    return false;
                } else {
                    class91.field1647 <<= 8;
                    class91.field1647 += class30.field556.method1814(arg0 + -63);
                    class112.field2009 = new byte[class91.field1647];
                    class112.field2009[0] = (byte) (class91.field1647 >> 8);
                    class178.field3126 = 3;
                    class112.field2009[1] = (byte) class189.method1350(class91.field1647, 255);
                    return false;
                }
            } else {
                int var2 = class30.field556.method1816(0);
                if (~var2 > -2) {
                    return false;
                } else {
                    class30.field556.method1819(var2, class109.field1961, class112.field2009, (byte) 107);
                    class109.field1961 += var2;
                    if (~class91.field1647 < ~class109.field1961) {
                        return false;
                    } else {
                        int var3 = 0;
                        class158.method1199(arg0 + -24812, class112.field2009);
                        class189.field3325 = new class23[class68.field1269];
                        for (int var4 = class109.field1962; var4 <= class178.field3136; ++var4) {
                            class23 var5 = class261.method1812(-28, var4);
                            if (var5 != null) {
                                class189.field3325[var3++] = var5;
                            }
                        }
                        class30.field556.method1818(arg0 ^ -63);
                        class30.field556 = null;
                        class60.method509(-119);
                        return true;
                    }
                }
            }
        } catch (IOException var6) {
            if (class30.field556 != null) {
                class30.field556.method1818(-2);
                class30.field556 = null;
            }
            if (class30.field559 < 1) {
                if (class244.field4193 == class231.field4019) {
                    class231.field4019 = class95.field1723;
                } else {
                    class231.field4019 = class244.field4193;
                }
                class178.field3126 = 0;
                ++class30.field559;
                class61.field1180 = 0;
                return false;
            } else {
                class60.method509(-95);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZIIJ)Leb;")
    public static final class230 method225(int arg0, boolean arg1, int arg2, int arg3, long arg4) {
        ++field396;
        class230 var6 = class214.method1481(arg3, 0);
        if (~arg4 > -1L) {
            arg4 = -arg4;
            var6.method1606((byte) 41, class39.field717);
        }
        class230 var7 = class103.field1886;
        class230 var8 = class111.field1987;
        if (arg0 == 1) {
            var7 = class111.field1987;
            var8 = class103.field1886;
        }
        if (~arg0 == -3) {
            var8 = class222.field3802;
            var7 = class111.field1987;
        }
        class230 var9 = class214.method1481(0, 0);
        class230 var10 = class214.method1481(arg3, 0);
        for (int var11 = 0; arg2 > var11; ++var11) {
            var10.method1606((byte) 41, class37.method340((int) (arg4 % 10L), (byte) -26));
            arg4 /= 10L;
        }
        if (arg4 == 0L) {
            var9 = class8.field145;
        }
        int var12 = 0;
        while (arg4 > 0L) {
            if (arg1 && var12 != 0 && ~(var12 % 3) == -1) {
                var9.method1606((byte) 41, var8);
            }
            var9.method1606((byte) 41, class37.method340((int) (arg4 % 10L), (byte) -26));
            ++var12;
            arg4 /= 10L;
        }
        if (~var10.method1635(-85) < -1) {
            var10.method1606((byte) 41, var7);
        }
        return class173.method1267((byte) 59, new class230[] { var6, var9.method1602((byte) -78), var10.method1602((byte) 65) });
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int[] var3 = super.field2160.method1323((byte) -128, arg0);
        ++field394;
        if (super.field2160.field3243) {
            this.method223((byte) -123, super.field2160.method1319(0));
        }
        int var4 = -38 / ((-24 - arg1) / 57);
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIIIII)V")
    public static final void method226(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg2 + arg4;
        int var7 = -arg1 + arg3;
        ++field401;
        if (~var7 != -1) {
            if (~var6 == -1) {
                class98.method841(arg3, arg2, arg1, -5, arg5);
            } else {
                if (~var6 > -1) {
                    var6 = -var6;
                }
                if (~var7 > -1) {
                    var7 = -var7;
                }
                boolean var8 = var7 < var6;
                if (var8) {
                    int var9 = arg1;
                    int var10 = arg3;
                    arg1 = arg2;
                    arg2 = var9;
                    arg3 = arg4;
                    arg4 = var10;
                }
                if (~arg3 > ~arg1) {
                    int var11 = arg1;
                    int var12 = arg2;
                    arg2 = arg4;
                    arg4 = var12;
                    arg1 = arg3;
                    arg3 = var11;
                }
                int var13 = arg2;
                int var14 = -arg1 + arg3;
                int var15 = -arg2 + arg4;
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (arg0 <= -126) {
                    int var16 = ~arg2 <= ~arg4 ? -1 : 1;
                    int var17 = -(var14 >> 1);
                    if (!var8) {
                        for (int var18 = arg1; ~var18 >= ~arg3; ++var18) {
                            class66.field1254[var13][var18] = arg5;
                            var17 += var15;
                            if (~var17 < -1) {
                                var13 += var16;
                                var17 -= var14;
                            }
                        }
                    } else {
                        for (int var19 = arg1; ~var19 >= ~arg3; ++var19) {
                            var17 += var15;
                            class66.field1254[var19][var13] = arg5;
                            if (~var17 < -1) {
                                var13 += var16;
                                var17 -= var14;
                            }
                        }
                    }
                }
            }
        } else {
            if (var6 != 0) {
                class41.method359(arg5, 105, arg4, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field406;
        int[][] var3 = super.field2152.method1106(arg0, arg1 ^ -32410);
        if (arg1 != 26080) {
            method222(17, 23, -35);
        }
        if (super.field2152.field2616) {
            int var4 = class140.field2505;
            int var5 = class255.field4540;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field2152.method1103(arg1 ^ 26080);
            this.method223((byte) -121, var6);
            for (int var8 = 0; class255.field4540 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; ~class140.field2505 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var12[var14] = class189.method1350(var15 << 4, 4080);
                    var13[var14] = class189.method1350(var15 >> 4, 4080);
                    var11[var14] = class189.method1350(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field397;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field2147 = arg1.method200(255) == 1;
            }
        } else {
            this.field402 = new class42[arg1.method200(255)];
            for (int var4 = 0; this.field402.length > var4; ++var4) {
                int var5 = arg1.method200(arg2 ^ 1876195635);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field402[var4] = class201.method1420(class168.method1239(arg2, 1876195731), arg1);
                            }
                        } else {
                            this.field402[var4] = class178.method1291(arg2 + -1876195788, arg1);
                        }
                    } else {
                        this.field402[var4] = class5.method53((byte) -96, arg1);
                    }
                } else {
                    this.field402[var4] = class186.method1331(-1, arg1);
                }
            }
        }
        if (arg2 != 1876195788) {
            method221(true, (byte) -112, (class230) null);
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V")
    public static void method227(byte arg0) {
        field407 = null;
        field391 = null;
        field400 = null;
        field392 = null;
        field399 = null;
        if (arg0 >= -42) {
            field393 = 113;
        }
    }
}
