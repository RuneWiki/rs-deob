import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class173 extends class10 {

    @OriginalMember(owner = "client!qe", name = "xb", descriptor = "Lwd;")
    public static class232 field3241 = new class232(4096);

    @OriginalMember(owner = "client!qe", name = "Ab", descriptor = "Lvd;")
    public static class222 field3244 = class212.method1357("headicons_prayer", 10731);

    @OriginalMember(owner = "client!qe", name = "Db", descriptor = "I")
    public static int field3247 = 0;

    @OriginalMember(owner = "client!qe", name = "Eb", descriptor = "Lvd;")
    private static class222 field3248 = class212.method1357("red:", 10731);

    @OriginalMember(owner = "client!qe", name = "Cb", descriptor = "Lvd;")
    public static class222 field3246 = class212.method1357(":duelstake:", 10731);

    @OriginalMember(owner = "client!qe", name = "Lb", descriptor = "Lvd;")
    private static class222 field3255 = class212.method1357("Started 3d library", 10731);

    @OriginalMember(owner = "client!qe", name = "Kb", descriptor = "Lvd;")
    public static class222 field3254 = field3248;

    @OriginalMember(owner = "client!qe", name = "Mb", descriptor = "Lvd;")
    private static class222 field3256 = class212.method1357("This world is running a closed Beta)3", 10731);

    @OriginalMember(owner = "client!qe", name = "Ob", descriptor = "Lvd;")
    private static class222 field3258 = class212.method1357("Press (Wrecover a locked account(W on front page)3", 10731);

    @OriginalMember(owner = "client!qe", name = "Jb", descriptor = "Lvd;")
    public static class222 field3253 = field3258;

    @OriginalMember(owner = "client!qe", name = "Hb", descriptor = "Lvd;")
    public static class222 field3251 = field3256;

    @OriginalMember(owner = "client!qe", name = "Fb", descriptor = "Lvd;")
    public static class222 field3249 = class212.method1357("Begeben Sie sich in ein freies Gebiet)1 um", 10731);

    @OriginalMember(owner = "client!qe", name = "Pb", descriptor = "Lvd;")
    public static class222 field3259 = field3248;

    @OriginalMember(owner = "client!qe", name = "zb", descriptor = "Lvd;")
    public static class222 field3243 = field3255;

    @OriginalMember(owner = "client!qe", name = "Qb", descriptor = "Lvd;")
    private static class222 field3260 = class212.method1357(" from your ignore list first)3", 10731);

    @OriginalMember(owner = "client!qe", name = "Sb", descriptor = "Lvd;")
    public static class222 field3262 = class212.method1357("Passwort: ", 10731);

    @OriginalMember(owner = "client!qe", name = "Rb", descriptor = "Lvd;")
    public static class222 field3261 = class212.method1357("details)3dat", 10731);

    @OriginalMember(owner = "client!qe", name = "Tb", descriptor = "I")
    public static int field3263 = 0;

    @OriginalMember(owner = "client!qe", name = "Nb", descriptor = "Lvd;")
    public static class222 field3257 = field3260;

    @OriginalMember(owner = "client!qe", name = "ub", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!qe", name = "vb", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!qe", name = "wb", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!qe", name = "Bb", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!qe", name = "Gb", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!qe", name = "Ib", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!qe", name = "yb", descriptor = "Lba;")
    public static class13 field3242;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILag;III)V")
    public static final void method1094(int arg0, int arg1, int arg2, class8 arg3, int arg4, int arg5, int arg6) {
        long var7 = 0L;
        if (~arg2 == -1) {
            var7 = class146.method921(arg4, arg6, arg0);
        }
        if (arg2 == 1) {
            var7 = class56.method413(arg4, arg6, arg0);
        }
        if (~arg2 == -3) {
            var7 = class200.method1280(arg4, arg6, arg0);
        }
        boolean var9 = true;
        if (arg2 == 3) {
            var7 = class94.method603(arg4, arg6, arg0);
        }
        boolean var10 = false;
        ++field3250;
        boolean var11 = false;
        if (~var7 != -1L) {
            int var12 = Integer.MAX_VALUE & (int) (var7 >>> 32);
            int var13 = ((int) var7 & 3567506) >> 20;
            class65 var14 = class174.method1102(var12, 0);
            int var15 = ((int) var7 & 522639) >> 14;
            if (~arg2 == -1) {
                class84.method547(arg4, arg6, arg0);
                if (var14.field1225 != 0) {
                    arg3.method74(var14.field1189, -48, arg6, var13, arg0, var15);
                }
            }
            if (~arg2 == -2) {
                class10.method100(arg4, arg6, arg0);
            }
            if (~arg2 == -3) {
                class93.method595(arg4, arg6, arg0);
                if (~var14.field1225 != -1 && ~(var14.field1196 + arg6) > -105 && var14.field1196 + arg0 < 104 && var14.field1209 + arg6 < 104 && var14.field1209 + arg0 < 104) {
                    arg3.method66((byte) 38, var14.field1196, var13, var14.field1209, arg6, arg0, var14.field1189);
                }
            }
            if (~arg2 == -4) {
                class17.method146(arg4, arg6, arg0);
                if (var14.field1225 == 1) {
                    arg3.method77((byte) -110, arg6, arg0);
                }
            }
        }
        if (arg5 < 115) {
            method1095(-119);
        }
    }

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "(I)V")
    public static final void method1095(int arg0) {
        if (arg0 == 31) {
            ++field3239;
            try {
                if (~class79.field1518 == -1) {
                    if (class31.field656 != null) {
                        class31.field656.method784(5000);
                        class31.field656 = null;
                    }
                    class79.field1518 = 1;
                    class1.field7 = 0;
                    class42.field896 = false;
                    class118.field2229 = null;
                }
                if (class79.field1518 == 1) {
                    if (class118.field2229 == null) {
                        class118.field2229 = class191.field3509.method278(class26.field593, (byte) 124, class120.field2266);
                    }
                    if (~class118.field2229.field2716 == -3) {
                        throw new IOException();
                    }
                    if (class118.field2229.field2716 == 1) {
                        class31.field656 = new class123((Socket) class118.field2229.field2714, class191.field3509);
                        class79.field1518 = 2;
                        class118.field2229 = null;
                    }
                }
                if (class79.field1518 == 2) {
                    long var1 = class66.field1245 = class97.field1819.method1428(15109);
                    class42.field895.field2053 = 0;
                    int var3 = (int) (var1 >> 16 & 31L);
                    class42.field895.method676(14, (byte) -3);
                    class42.field895.method676(var3, (byte) -3);
                    class31.field656.method785(0, 0, class42.field895.field2006, 2);
                    class21.field505.field2053 = 0;
                    class79.field1518 = 3;
                }
                if (class79.field1518 == 3) {
                    if (class72.field1407 != null) {
                        class72.field1407.method186((byte) 114);
                    }
                    if (class47.field963 != null) {
                        class47.field963.method186((byte) 114);
                    }
                    int var4 = class31.field656.method780(0);
                    if (class72.field1407 != null) {
                        class72.field1407.method186((byte) 114);
                    }
                    if (class47.field963 != null) {
                        class47.field963.method186((byte) 114);
                    }
                    if (var4 != 0) {
                        class52.method372(arg0 + -29131, var4);
                        return;
                    }
                    class21.field505.field2053 = 0;
                    class79.field1518 = 4;
                }
                if (~class79.field1518 == -5) {
                    if (class21.field505.field2053 < 8) {
                        int var5 = class31.field656.method786(arg0 + 80);
                        if (~(-class21.field505.field2053 + 8) > ~var5) {
                            var5 = -class21.field505.field2053 + 8;
                        }
                        if (var5 > 0) {
                            class31.field656.method783((byte) 90, class21.field505.field2053, class21.field505.field2006, var5);
                            class21.field505.field2053 += var5;
                        }
                    }
                    if (class21.field505.field2053 == 8) {
                        class21.field505.field2053 = 0;
                        class193.field3561 = class21.field505.method709((byte) 7);
                        class79.field1518 = 5;
                    }
                }
                if (~class79.field1518 == -6) {
                    class42.field895.field2053 = 0;
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (9.9999999E7D * Math.random()), (int) (class193.field3561 >> 32), (int) class193.field3561 };
                    class42.field895.method676(10, (byte) -3);
                    class42.field895.method684(var6[0], -59);
                    class42.field895.method684(var6[1], arg0 ^ 113);
                    class42.field895.method684(var6[2], arg0 + 38);
                    class42.field895.method684(var6[3], arg0 ^ -59);
                    class42.field895.method668(class97.field1819.method1428(15109), 8);
                    class42.field895.method670(class97.field1814, (byte) -113);
                    class42.field895.method690(class190.field3503, class94.field1759, 0);
                    class21.field503.field2053 = 0;
                    if (class34.field749 == 40) {
                        class21.field503.method676(18, (byte) -3);
                    } else {
                        class21.field503.method676(16, (byte) -3);
                    }
                    class21.field503.method676(class42.field895.field2053 + 129 + class125.method791(class135.field2613, 1), (byte) -3);
                    class21.field503.method684(492, arg0 ^ -9);
                    class21.field503.method676(!class122.field2331 ? 0 : 1, (byte) -3);
                    class69.method467((byte) -23, class21.field503);
                    class21.field503.method670(class135.field2613, (byte) -113);
                    class21.field503.method684(class77.field1490, -46);
                    class21.field503.method684(class83.field1590.field57, arg0 ^ -62);
                    class21.field503.method684(class97.field1809.field57, 124);
                    class21.field503.method684(class118.field2241.field57, arg0 + -88);
                    class21.field503.method684(class115.field2197.field57, arg0 ^ -82);
                    class21.field503.method684(class153.field2941.field57, -87);
                    class21.field503.method684(class109.field2037.field57, -44);
                    class21.field503.method684(class187.field3466.field57, 63);
                    class21.field503.method684(class116.field2217.field57, arg0 ^ -115);
                    class21.field503.method684(class78.field1508.field57, 69);
                    class21.field503.method684(class130.field2531.field57, 125);
                    class21.field503.method684(class120.field2268.field57, 83);
                    class21.field503.method684(class87.field1655.field57, 98);
                    class21.field503.method684(class43.field913.field57, 93);
                    class21.field503.method684(class8.field126.field57, 122);
                    class21.field503.method684(class130.field2520.field57, 117);
                    class21.field503.method684(class233.field4360.field57, -66);
                    class21.field503.method684(class161.field3073.field57, -102);
                    class21.field503.method684(class114.field2150.field57, 113);
                    class21.field503.method684(class3.field35.field57, -45);
                    class21.field503.method684(class214.field3974.field57, 72);
                    class21.field503.method684(class39.field873.field57, arg0 ^ 120);
                    class21.field503.method684(class73.field1449.field57, 99);
                    class21.field503.method684(class56.field1067.field57, 98);
                    class21.field503.method684(class6.field94.field57, -29);
                    class21.field503.method689(false, 0, class42.field895.field2006, class42.field895.field2053);
                    class31.field656.method785(0, 0, class21.field503.field2006, class21.field503.field2053);
                    class42.field895.method1353(var6, 19903);
                    for (int var7 = 0; ~var7 > -5; ++var7) {
                        var6[var7] += 50;
                    }
                    class21.field505.method1353(var6, 19903);
                    class79.field1518 = 6;
                }
                if (class79.field1518 == 6 && class31.field656.method786(arg0 ^ 11) > 0) {
                    int var8 = class31.field656.method780(0);
                    if (var8 == 21 && ~class34.field749 == -21) {
                        class79.field1518 = 7;
                    } else if (var8 == 2) {
                        class79.field1518 = 9;
                    } else {
                        if (var8 == 15 && ~class34.field749 == -41) {
                            class162.method1020(-108);
                            return;
                        }
                        if (var8 != 23 || class107.field1971 >= 1) {
                            class52.method372(arg0 ^ -29109, var8);
                            return;
                        }
                        class79.field1518 = 0;
                        ++class107.field1971;
                    }
                }
                if (class79.field1518 == 7 && ~class31.field656.method786(82) < -1) {
                    class108.field1987 = 60 * (3 + class31.field656.method780(arg0 + -31));
                    class79.field1518 = 8;
                }
                if (class79.field1518 == 8) {
                    class1.field7 = 0;
                    class1.method1(class68.field1284, class69.field1292, class234.method1531(new class222[] { class56.method414(arg0 + -142, class108.field1987 / 60), class205.field3813 }, arg0 ^ -10972), arg0 ^ 31);
                    if (--class108.field1987 <= 0) {
                        class79.field1518 = 0;
                    }
                } else {
                    if (~class79.field1518 == -10 && ~class31.field656.method786(52) <= -10) {
                        class5.field87 = class31.field656.method780(0);
                        class113.field2132 = class31.field656.method780(0);
                        class65.field1233 = class31.field656.method780(0) == 1;
                        class35.field773 = class31.field656.method780(arg0 + -31);
                        class35.field773 <<= 8;
                        class35.field773 += class31.field656.method780(0);
                        class105.field1947 = class31.field656.method780(0);
                        class31.field656.method783((byte) 104, 0, class21.field505.field2006, 1);
                        class21.field505.field2053 = 0;
                        class202.field3703 = class21.field505.method1351(true);
                        class31.field656.method783((byte) 127, 0, class21.field505.field2006, 2);
                        class21.field505.field2053 = 0;
                        class70.field1306 = class21.field505.method675(arg0 ^ 29);
                        class79.field1518 = 10;
                    }
                    if (~class79.field1518 == -11) {
                        if (~class31.field656.method786(106) <= ~class70.field1306) {
                            class21.field505.field2053 = 0;
                            class31.field656.method783((byte) 110, 0, class21.field505.field2006, class70.field1306);
                            class106.method649((byte) 97);
                            class208.field3870 = -1;
                            class128.method812(false, arg0 + -28);
                            class202.field3703 = -1;
                        }
                    } else {
                        ++class1.field7;
                        if (class1.field7 > 2000) {
                            if (class107.field1971 < 1) {
                                ++class107.field1971;
                                class79.field1518 = 0;
                                if (~class26.field593 == ~class181.field3359) {
                                    class26.field593 = class226.field4238;
                                } else {
                                    class26.field593 = class181.field3359;
                                }
                            } else {
                                class52.method372(-29100, -3);
                            }
                        }
                    }
                }
            } catch (IOException var9) {
                if (~class107.field1971 > -2) {
                    ++class107.field1971;
                    if (class26.field593 != class181.field3359) {
                        class26.field593 = class181.field3359;
                    } else {
                        class26.field593 = class226.field4238;
                    }
                    class79.field1518 = 0;
                } else {
                    class52.method372(-29100, -2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
    public static void method1096(byte arg0) {
        field3262 = null;
        field3241 = null;
        field3261 = null;
        field3244 = null;
        field3256 = null;
        field3257 = null;
        field3248 = null;
        field3246 = null;
        field3249 = null;
        field3258 = null;
        field3243 = null;
        field3259 = null;
        field3260 = null;
        field3242 = null;
        field3253 = null;
        field3251 = null;
        field3255 = null;
        field3254 = null;
        if (arg0 > -117) {
            method1094(92, -104, 99, (class8) null, 75, -100, 87);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        ++field3240;
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (super.field3815.field3015 && this.method99(-23838)) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int var7 = arg0 % super.field184 * super.field184;
            for (int var8 = 0; ~var8 > ~class118.field2245; ++var8) {
                int var9 = super.field185[var7 - -(var8 % super.field195)];
                var5[var8] = class139.method876(255, var9) << 4;
                var4[var8] = class139.method876(var9, 65280) >> 4;
                var6[var8] = class139.method876(var9, 16711680) >> 12;
            }
        }
        if (arg1 < 98) {
            method1095(-34);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIB)I")
    public static final int method1097(int arg0, int arg1, byte arg2) {
        if (arg2 != -112) {
            method1095(-56);
        }
        ++field3238;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (var5 & 134015921) >> 19;
    }
}
