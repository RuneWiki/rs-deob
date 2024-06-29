import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class185 extends class253 {

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public int field3166 = 0;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lle;")
    public static class41 field3165 = null;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "[I")
    public static int[] field3179 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "Lve;")
    public static class184 field3185 = new class184(30);

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public int field3168;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "Ldb;")
    public class17 field3183;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Lnb;")
    public class199 field3177;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Lfj;")
    public class238 field3172;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Lfj;")
    public class238 field3182;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Lrh;")
    public class44 field3169;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "Z")
    public boolean field3181;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "[I")
    public int[] field3184;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
    public static final void method1274(int arg0) {
        field3187++;
        if (class254.field4383 == 0 || class254.field4383 == 5) {
            return;
        }
        try {
            if ((++class111.field1943) > 2000) {
                if (class198.field3390 != null) {
                    class198.field3390.method218(122);
                    class198.field3390 = null;
                }
                if (class271.field4799 >= 1) {
                    class254.field4383 = 0;
                    class205.field3580 = -5;
                    return;
                }
                class254.field4383 = 1;
                class111.field1943 = 0;
                class271.field4799++;
                if (class43.field751 == class239.field4128) {
                    class239.field4128 = class58.field1058;
                } else {
                    class239.field4128 = class43.field751;
                }
            }
            if (class254.field4383 == 1) {
                class161.field2780 = class107.field1882.method559((byte) 60, class239.field4128, class6.field70);
                class254.field4383 = 2;
            }
            if (class254.field4383 == 2) {
                if (class161.field2780.field1296 == 2) {
                    throw new IOException();
                }
                if (class161.field2780.field1296 != 1) {
                    return;
                }
                class198.field3390 = new class31((Socket) class161.field2780.field1292, class107.field1882);
                class161.field2780 = null;
                long var1 = class268.field4766 = class100.field1796.method624(false);
                class207.field3618.field4224 = 0;
                class207.field3618.method1714(14, -714043120);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class207.field3618.method1714(var3, -714043120);
                class198.field3390.method214(class207.field3618.field4238, 2, 0, (byte) 15);
                if (class247.field4223 != null) {
                    class247.field4223.method269(-21792);
                }
                if (class24.field346 != null) {
                    class24.field346.method269(-21792);
                }
                int var4 = class198.field3390.method213(-1588);
                if (class247.field4223 != null) {
                    class247.field4223.method269(-21792);
                }
                if (class24.field346 != null) {
                    class24.field346.method269(-21792);
                }
                if (var4 != 0) {
                    class254.field4383 = 0;
                    class205.field3580 = var4;
                    class198.field3390.method218(122);
                    class198.field3390 = null;
                    return;
                }
                class254.field4383 = 3;
            }
            if (class254.field4383 == 3) {
                if (class198.field3390.method212((byte) 40) < 8) {
                    return;
                }
                class198.field3390.method216(class189.field3249.field4238, 8, 0, 0);
                int[] var5 = new int[4];
                class189.field3249.field4224 = 0;
                class74.field1387 = class189.field3249.method1720((byte) -3);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class74.field1387 >> 32);
                class207.field3618.field4224 = 0;
                var5[3] = (int) class74.field1387;
                class207.field3618.method1714(10, -714043120);
                class207.field3618.method1715(var5[0], (byte) 125);
                class207.field3618.method1715(var5[1], (byte) -71);
                class207.field3618.method1715(var5[2], (byte) 123);
                class207.field3618.method1715(var5[3], (byte) 119);
                class207.field3618.method1674((byte) 101, class100.field1796.method624(false));
                class207.field3618.method1698((byte) -72, class100.field1790);
                class207.field3618.method1719(class125.field2207, class125.field2208, 0);
                class219.field3848.field4224 = 0;
                if (class1.field4 == 40) {
                    class219.field3848.method1714(18, -714043120);
                } else {
                    class219.field3848.method1714(16, -714043120);
                }
                class219.field3848.method1703(class207.field3618.field4224 + (class66.method442((byte) -34, class172.field2967) + 153), -105);
                class219.field3848.method1715(511, (byte) 16);
                class219.field3848.method1714(class253.field4363, -714043120);
                class219.field3848.method1714(0, -714043120);
                class219.field3848.method1714(class171.method1144(-65), -714043120);
                class219.field3848.method1703(class154.field2664, -93);
                class219.field3848.method1703(class154.field2662, -92);
                class4.method16(class219.field3848, 15081);
                class219.field3848.method1698((byte) -72, class172.field2967);
                class219.field3848.method1715(class245.field4191, (byte) 121);
                class219.field3848.method1715(class133.method889((byte) -128), (byte) -90);
                class226.field3937 = true;
                class219.field3848.method1703(class23.field325, -91);
                class219.field3848.method1715(class75.field1395.field1262, (byte) 4);
                class219.field3848.method1715(class171.field2961.field1262, (byte) 121);
                class219.field3848.method1715(class215.field3773.field1262, (byte) -108);
                class219.field3848.method1715(class239.field4122.field1262, (byte) -61);
                class219.field3848.method1715(class79.field1449.field1262, (byte) 122);
                class219.field3848.method1715(class36.field555.field1262, (byte) -64);
                class219.field3848.method1715(class213.field3744.field1262, (byte) -82);
                class219.field3848.method1715(class271.field4798.field1262, (byte) 124);
                class219.field3848.method1715(class161.field2773.field1262, (byte) 119);
                class219.field3848.method1715(class201.field3508.field1262, (byte) 127);
                class219.field3848.method1715(class33.field496.field1262, (byte) -73);
                class219.field3848.method1715(class28.field440.field1262, (byte) -47);
                class219.field3848.method1715(class12.field192.field1262, (byte) 122);
                class219.field3848.method1715(class2.field19.field1262, (byte) -110);
                class219.field3848.method1715(class225.field3926.field1262, (byte) -104);
                class219.field3848.method1715(class44.field782.field1262, (byte) -127);
                class219.field3848.method1715(class13.field196.field1262, (byte) 124);
                class219.field3848.method1715(class189.field3250.field1262, (byte) 123);
                class219.field3848.method1715(class78.field1440.field1262, (byte) 124);
                class219.field3848.method1715(class15.field214.field1262, (byte) 119);
                class219.field3848.method1715(class27.field419.field1262, (byte) 121);
                class219.field3848.method1715(class97.field1762.field1262, (byte) 11);
                class219.field3848.method1715(class228.field3949.field1262, (byte) -87);
                class219.field3848.method1715(class1.field10.field1262, (byte) 7);
                class219.field3848.method1715(class116.field2067.field1262, (byte) -119);
                class219.field3848.method1715(class38.field589.field1262, (byte) -117);
                class219.field3848.method1715(class193.field3300.field1262, (byte) 127);
                class219.field3848.method1668(class207.field3618.field4238, 0, 255, class207.field3618.field4224);
                class198.field3390.method214(class219.field3848.field4238, class219.field3848.field4224, 0, (byte) 15);
                class207.field3618.method494(0, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class189.field3249.method494(0, var5);
                class254.field4383 = 4;
            }
            if (class254.field4383 == 4) {
                if (class198.field3390.method212((byte) 86) < 1) {
                    return;
                }
                int var7 = class198.field3390.method213(-1588);
                if (var7 == 21) {
                    class254.field4383 = 7;
                } else if (var7 == 29) {
                    class254.field4383 = 10;
                } else if (var7 == 1) {
                    class254.field4383 = 5;
                    class205.field3580 = var7;
                    return;
                } else if (var7 == 2) {
                    class254.field4383 = 8;
                } else if (var7 == 15) {
                    class254.field4383 = 0;
                    class205.field3580 = var7;
                    return;
                } else if (var7 == 23 && class271.field4799 < 1) {
                    class254.field4383 = 1;
                    class111.field1943 = 0;
                    class271.field4799++;
                    class198.field3390.method218(127);
                    class198.field3390 = null;
                    return;
                } else {
                    class205.field3580 = var7;
                    class254.field4383 = 0;
                    class198.field3390.method218(125);
                    class198.field3390 = null;
                    return;
                }
            }
            if (arg0 > -24) {
                field3165 = null;
            }
            if (class254.field4383 == 6) {
                class207.field3618.field4224 = 0;
                class207.field3618.method483(-24260, 17);
                class198.field3390.method214(class207.field3618.field4238, class207.field3618.field4224, 0, (byte) 15);
                class254.field4383 = 4;
            } else if (class254.field4383 == 7) {
                if (class198.field3390.method212((byte) -122) >= 1) {
                    class35.field540 = class198.field3390.method213(-1588) * 60 + 180;
                    class205.field3580 = 21;
                    class254.field4383 = 0;
                    class198.field3390.method218(127);
                    class198.field3390 = null;
                }
            } else if (class254.field4383 != 10) {
                if (class254.field4383 == 8) {
                    if (class198.field3390.method212((byte) -125) < 11) {
                        return;
                    }
                    class198.field3390.method216(class189.field3249.field4238, 11, 0, 0);
                    class189.field3249.field4224 = 0;
                    class63.field1174 = class189.field3249.method1711((byte) -67);
                    class181.field3096 = class189.field3249.method1711((byte) -67);
                    class98.field1766 = class189.field3249.method1711((byte) -67);
                    if (class98.field1766 == 1) {
                        try {
                            class66.field1218.method580(true, class107.field1882.field1478);
                        } catch (Throwable var8) {
                        }
                    } else {
                        try {
                            class191.field3273.method580(true, class107.field1882.field1478);
                        } catch (Throwable var9) {
                        }
                    }
                    class169.field2916 = class189.field3249.method1711((byte) -67);
                    class63.field1166 = class189.field3249.method1711((byte) -67) == 1;
                    class213.field3748 = class189.field3249.method1694((byte) -100);
                    class108.field1898 = class189.field3249.method1711((byte) -67);
                    class181.field3100 = class189.field3249.method489(127);
                    class85.field1593 = class189.field3249.method1694((byte) -100);
                    class254.field4383 = 9;
                }
                if (class254.field4383 == 9 && class198.field3390.method212((byte) -126) >= class85.field1593) {
                    class189.field3249.field4224 = 0;
                    class198.field3390.method216(class189.field3249.field4238, class85.field1593, 0, 0);
                    class254.field4383 = 0;
                    class205.field3580 = 2;
                    class4.method15(127);
                    class67.field1232 = -1;
                    class107.method743(false, 6238);
                    class181.field3100 = -1;
                }
            } else if (class198.field3390.method212((byte) -121) >= 1) {
                class215.field3778 = class198.field3390.method213(-1588);
                class205.field3580 = 29;
                class254.field4383 = 0;
                class198.field3390.method218(121);
                class198.field3390 = null;
            }
        } catch (IOException var10) {
            if (class198.field3390 != null) {
                class198.field3390.method218(121);
                class198.field3390 = null;
            }
            if (class271.field4799 >= 1) {
                class254.field4383 = 0;
                class205.field3580 = -4;
            } else {
                class111.field1943 = 0;
                class254.field4383 = 1;
                class271.field4799++;
                if (class43.field751 == class239.field4128) {
                    class239.field4128 = class58.field1058;
                } else {
                    class239.field4128 = class43.field751;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[Lvj;I)V")
    public static final void method1275(int arg0, int arg1, class112[] arg2, int arg3) {
        if (arg1 < 82) {
            return;
        }
        field3180++;
        if (arg3 >= arg0) {
            return;
        }
        int var4 = arg3 - 1;
        int var5 = arg0 + 1;
        int var6 = (arg0 + arg3) / 2;
        class112 var7 = arg2[var6];
        arg2[var6] = arg2[arg3];
        arg2[arg3] = var7;
        while (var5 > var4) {
            boolean var8 = true;
            do {
                var5--;
                for (int var9 = 0; var9 < 4; var9++) {
                    int var10;
                    int var11;
                    if (class153.field2655[var9] == 2) {
                        var11 = var7.field1959;
                        var10 = arg2[var5].field1959;
                    } else if (class153.field2655[var9] == 1) {
                        var10 = arg2[var5].field1964;
                        if (var10 == -1 && class204.field3560[var9] == 1) {
                            var10 = 2001;
                        }
                        var11 = var7.field1964;
                        if (var11 == -1 && class204.field3560[var9] == 1) {
                            var11 = 2001;
                        }
                    } else if (class153.field2655[var9] == 3) {
                        var10 = arg2[var5].field1962 ? 1 : 0;
                        var11 = var7.field1962 ? 1 : 0;
                    } else {
                        var10 = arg2[var5].field1951;
                        var11 = var7.field1951;
                    }
                    if (var10 != var11) {
                        if ((class204.field3560[var9] != 1 || var10 <= var11) && (class204.field3560[var9] != 0 || var11 <= var10)) {
                            var8 = false;
                        }
                        break;
                    }
                    if (var9 == 3) {
                        var8 = false;
                    }
                }
            } while (var8);
            boolean var12 = true;
            do {
                var4++;
                for (int var13 = 0; var13 < 4; var13++) {
                    int var14;
                    int var15;
                    if (class153.field2655[var13] == 2) {
                        var14 = var7.field1959;
                        var15 = arg2[var4].field1959;
                    } else if (class153.field2655[var13] == 1) {
                        var14 = var7.field1964;
                        if (var14 == -1 && class204.field3560[var13] == 1) {
                            var14 = 2001;
                        }
                        var15 = arg2[var4].field1964;
                        if (var15 == -1 && class204.field3560[var13] == 1) {
                            var15 = 2001;
                        }
                    } else if (class153.field2655[var13] == 3) {
                        var15 = arg2[var4].field1962 ? 1 : 0;
                        var14 = var7.field1962 ? 1 : 0;
                    } else {
                        var15 = arg2[var4].field1951;
                        var14 = var7.field1951;
                    }
                    if (var14 != var15) {
                        if ((class204.field3560[var13] != 1 || var14 <= var15) && (class204.field3560[var13] != 0 || var15 <= var14)) {
                            var12 = false;
                        }
                        break;
                    }
                    if (var13 == 3) {
                        var12 = false;
                    }
                }
            } while (var12);
            if (var5 > var4) {
                class112 var16 = arg2[var4];
                arg2[var4] = arg2[var5];
                arg2[var5] = var16;
            }
        }
        method1275(var5, 108, arg2, arg3);
        method1275(arg0, 104, arg2, var5 + 1);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
    public final void method1276(boolean arg0) {
        field3189++;
        if (!arg0) {
            method1278(111, -37, true, -72, 116, -83, -122);
        }
        int var2 = this.field3186;
        if (this.field3177 != null) {
            class199 var5 = this.field3177.method1355(-1);
            if (var5 == null) {
                this.field3168 = 0;
                this.field3171 = 0;
                this.field3186 = -1;
                this.field3170 = 0;
                this.field3184 = null;
            } else {
                this.field3171 = var5.field3465;
                this.field3184 = var5.field3469;
                this.field3170 = var5.field3442;
                this.field3186 = var5.field3436;
                this.field3168 = var5.field3402 * 128;
            }
        } else if (this.field3183 != null) {
            int var3 = class207.method1415(-1, this.field3183);
            if (var2 != var3) {
                this.field3186 = var3;
                class263 var4 = this.field3183.field247;
                if (var4.field4695 != null) {
                    var4 = var4.method1794((byte) 86);
                }
                if (var4 == null) {
                    this.field3168 = 0;
                } else {
                    this.field3168 = var4.field4687 * 128;
                }
            }
        } else if (this.field3169 != null) {
            this.field3186 = class168.method1128(this.field3169, -3102);
            this.field3168 = this.field3169.field795 * 128;
        }
        if (this.field3186 != var2 && this.field3182 != null) {
            class247.field4249.method954(this.field3182);
            this.field3182 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(DB)V")
    public static final void method1277(double arg0, byte arg1) {
        field3174++;
        if (class107.field1893 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class216.field3797[var3] = var4 > 255 ? 255 : var4;
            }
            class107.field1893 = arg0;
        }
        if (arg1 != -66) {
            method1274(-40);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZIIII)V")
    public static final void method1278(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field3167++;
        if (class67.field1232 == arg0 && class48.field849 == arg6 && class82.field1498 == arg5 || class121.method833((byte) 95)) {
            return;
        }
        class67.field1232 = arg0;
        class82.field1498 = arg5;
        class48.field849 = arg6;
        if (class121.method833((byte) 127)) {
            class82.field1498 = 0;
        }
        if (arg2) {
            class169.method1136(true, 28);
        } else {
            class169.method1136(true, 25);
        }
        class163.method1083(true, true, class67.field1242);
        int var7 = class244.field4172;
        int var8 = class213.field3742;
        class213.field3742 = arg6 * 8 - 48;
        class244.field4172 = arg0 * 8 - 48;
        class186.field3192 = class175.method1183(class67.field1232 * 8, class48.field849 * 8, false);
        int var9 = class244.field4172 - var7;
        int var10 = class244.field4172;
        int var11 = class213.field3742 - var8;
        int var12 = class213.field3742;
        if (arg2) {
            class44.field775 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class17 var14 = class194.field3320[var13];
                if (var14 != null) {
                    var14.field1042 -= var9 * 128;
                    var14.field1027 -= var11 * 128;
                    if (var14.field1042 >= 0 && var14.field1042 <= 13184 && var14.field1027 >= 0 && var14.field1027 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field1043[var15] -= var9;
                            var14.field1066[var15] -= var11;
                        }
                        class137.field2380[class44.field775++] = var13;
                    } else {
                        class194.field3320[var13].field247 = null;
                        class194.field3320[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class17 var32 = class194.field3320[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field1043[var33] -= var9;
                        var32.field1066[var33] -= var11;
                    }
                    var32.field1027 -= var11 * 128;
                    var32.field1042 -= var9 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class44 var30 = class249.field4291[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field1043[var31] -= var9;
                    var30.field1066[var31] -= var11;
                }
                var30.field1027 -= var11 * 128;
                var30.field1042 -= var9 * 128;
            }
        }
        byte var18 = 0;
        class116.field2066 = arg5;
        class22.field308.method313(arg3, 2, arg1, false);
        byte var19 = 104;
        byte var20 = 104;
        byte var21 = 1;
        int var22 = arg4;
        if (var9 < 0) {
            var21 = -1;
            var18 = 103;
            var20 = -1;
        }
        byte var23 = 0;
        if (var11 < 0) {
            var23 = 103;
            var19 = -1;
            var22 = -1;
        }
        for (int var24 = var18; var24 != var20; var24 += var21) {
            for (int var26 = var23; var26 != var19; var26 += var22) {
                int var27 = var11 + var26;
                int var28 = var24 + var9;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                        class191.field3278[var29][var24][var26] = class191.field3278[var29][var28][var27];
                    } else {
                        class191.field3278[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class218 var25 = (class218) class256.field4571.method110(arg4 ^ 0x41); var25 != null; var25 = (class218) class256.field4571.method117((byte) 122)) {
            var25.field3826 -= var11;
            var25.field3830 -= var9;
            if (var25.field3830 < 0 || var25.field3826 < 0 || var25.field3830 >= 104 || var25.field3826 >= 104) {
                var25.method1753(137);
            }
        }
        class232.field4008 = -1;
        if (arg2) {
            class11.field181 -= var11;
            class160.field2750 -= var9;
            class74.field1385 -= var9;
            class119.field2117 -= var11;
        } else {
            class273.field4825 = 1;
        }
        if (class7.field79 != 0) {
            class7.field79 -= var9;
            class18.field259 -= var11;
        }
        class127.field2229 = 0;
        class213.field3738.method112(arg4 ^ 0x6A);
        class195.field3327.method112(arg4 ^ 0xFFFFFF84);
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
    public static void method1279(int arg0) {
        int var1 = -77 / ((-arg0 - 47) / 49);
        field3185 = null;
        field3179 = null;
    }
}
