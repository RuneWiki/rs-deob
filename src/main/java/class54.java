import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class54 extends class133 {

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    private int field728 = 0;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Lt;")
    private class239 field732 = new class239(16);

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    private int field749 = 0;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "Lj;")
    private class269 field754 = new class269();

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "J")
    private long field757 = 0L;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Lih;")
    private class30 field735;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "Z")
    private boolean field750;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "Lj;")
    private class269 field752;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    private int field739;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "Lhc;")
    private class162 field737;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lpb;")
    private class71 field722;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    private int field741;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "Z")
    private boolean field756;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Lih;")
    private class30 field738;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Lm;")
    private class44 field740;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[F")
    public static float[] field727 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "Lbe;")
    public static class283 field746 = class153.method941(-79, "AUS");

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lsb;")
    private class103 field723;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Ldd;")
    public static class235 field725;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "Z")
    private boolean field753;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "[B")
    private byte[] field742;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "[Lnh;")
    public static class107[] field751;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "[[[B")
    public static byte[][][] field736;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V", line = 7)
    public final void method341(int arg0, int arg1) {
        field718++;
        if (this.field735 == null) {
            return;
        }
        class86 var3 = this.field754.method1812((byte) -12);
        if (arg0 <= 72) {
            return;
        }
        while (var3 != null) {
            if ((long) arg1 == var3.field1445) {
                return;
            }
            var3 = this.field754.method1813((byte) 71);
        }
        class86 var4 = new class86();
        var4.field1445 = (long) arg1;
        this.field754.method1809(var4, (byte) -123);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIIIIII)V", line = 37)
    public static final void method342(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field747++;
        if (class184.field3170 == arg3 && class114.field1914 == arg4 && class83.field1405 == arg6 || class96.method622((byte) 0)) {
            return;
        }
        class83.field1405 = arg6;
        class184.field3170 = arg3;
        class114.field1914 = arg4;
        if (class96.method622((byte) 0)) {
            class83.field1405 = 0;
        }
        if (arg0) {
            class77.method506(28, -30354);
        } else {
            class77.method506(25, -30354);
        }
        class145.method910(true, -123, class200.field3424);
        int var7 = class107.field1833;
        class107.field1833 = arg4 * 8 - 48;
        int var8 = class214.field3637;
        class214.field3637 = (arg3 - 6) * 8;
        if (arg2 != -15993) {
            method342(true, -120, -10, 109, 127, 95, -44);
        }
        class228.field3837 = class10.method58(class184.field3170 * 8, class114.field1914 * 8, true);
        int var9 = class107.field1833 - var7;
        int var10 = class214.field3637 - var8;
        int var11 = class107.field1833;
        int var12 = class214.field3637;
        if (arg0) {
            class242.field4078 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class60 var17 = class33.field493[var16];
                if (var17 != null) {
                    var17.field1193 -= var10 * 128;
                    var17.field1210 -= var9 * 128;
                    if (var17.field1193 >= 0 && var17.field1193 <= 13184 && var17.field1210 >= 0 && var17.field1210 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field1178[var18] -= var10;
                            var17.field1150[var18] -= var9;
                        }
                        class219.field3698[class242.field4078++] = var16;
                    } else {
                        class33.field493[var16].field822 = null;
                        class33.field493[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class60 var14 = class33.field493[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field1178[var15] -= var10;
                        var14.field1150[var15] -= var9;
                    }
                    var14.field1193 -= var10 * 128;
                    var14.field1210 -= var9 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class191 var20 = class149.field2436[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field1178[var21] -= var10;
                    var20.field1150[var21] -= var9;
                }
                var20.field1210 -= var9 * 128;
                var20.field1193 -= var10 * 128;
            }
        }
        class61.field850 = arg6;
        class213.field3624.method1241((byte) -118, false, arg1, arg5);
        byte var22 = 0;
        byte var23 = 1;
        byte var24 = 104;
        if (var10 < 0) {
            var24 = -1;
            var23 = -1;
            var22 = 103;
        }
        byte var25 = 104;
        byte var26 = 0;
        byte var27 = 1;
        if (var9 < 0) {
            var25 = -1;
            var26 = 103;
            var27 = -1;
        }
        for (int var28 = var22; var28 != var24; var28 += var23) {
            for (int var29 = var26; var29 != var25; var29 += var27) {
                int var30 = var10 + var28;
                int var31 = var9 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class177.field3046[var32][var28][var29] = class177.field3046[var32][var30][var31];
                    } else {
                        class177.field3046[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class91 var33 = (class91) class153.field2518.method1812((byte) -109); var33 != null; var33 = (class91) class153.field2518.method1813((byte) 98)) {
            var33.field1540 -= var10;
            var33.field1531 -= var9;
            if (var33.field1540 < 0 || var33.field1531 < 0 || var33.field1540 >= 104 || var33.field1531 >= 104) {
                var33.method557((byte) -89);
            }
        }
        if (arg0) {
            class119.field2001 -= var9;
            class192.field3296 -= var9;
            class252.field4283 -= var10;
            class187.field3205 -= var10;
        } else {
            class26.field377 = 1;
        }
        class127.field2103 = 0;
        if (class88.field1496 != 0) {
            class88.field1496 -= var10;
            class175.field3021 -= var9;
        }
        if (arg0 && (Math.abs(var10) > 104 || Math.abs(var9) > 104)) {
            class277.method1856(true);
        }
        class74.field1294 = -1;
        class259.field4412.method1810(2);
        class205.field3496.method1810(arg2 ^ 0x3E22);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)Lsb;", line = 278)
    public final class103 method343(int arg0) {
        field717++;
        if (this.field723 != null) {
            return this.field723;
        }
        if (this.field740 == null) {
            if (this.field722.method470(20)) {
                return null;
            }
            this.field740 = this.field722.method464(0, true, this.field730, (byte) 0, 255);
        }
        if (this.field740.field602) {
            return null;
        } else if (arg0 > -109) {
            return (class103) null;
        } else {
            byte[] var2 = this.field740.method216(false);
            if (this.field740 instanceof class31) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field723 = new class103(var2, this.field739);
                    if (this.field723.field1751 != this.field741) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var5) {
                    this.field723 = null;
                    if (this.field722.method470(20)) {
                        this.field740 = null;
                    } else {
                        this.field740 = this.field722.method464(0, true, this.field730, (byte) 0, 255);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field723 = new class103(var2, this.field739);
                } catch (RuntimeException var6) {
                    this.field722.method466(1);
                    this.field723 = null;
                    if (this.field722.method470(20)) {
                        this.field740 = null;
                    } else {
                        this.field740 = this.field722.method464(0, true, this.field730, (byte) 0, 255);
                    }
                    return null;
                }
                if (this.field738 != null) {
                    this.field737.method982(-114, this.field730, var2, this.field738);
                }
            }
            this.field740 = null;
            if (this.field735 != null) {
                this.field742 = new byte[this.field723.field1739];
                this.field728 = 0;
            }
            return this.field723;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 374)
    public final void method344(byte arg0) {
        field748++;
        if (this.field752 != null) {
            if (this.method343(-119) == null) {
                return;
            }
            if (this.field750) {
                boolean var6 = true;
                for (class86 var7 = this.field752.method1812((byte) 111); var7 != null; var7 = this.field752.method1813((byte) 120)) {
                    int var8 = (int) var7.field1445;
                    if (this.field742[var8] == 0) {
                        this.method346(var8, 1, arg0 + 20212);
                    }
                    if (this.field742[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method557((byte) -89);
                    }
                }
                while (this.field749 < this.field723.field1755.length) {
                    if (this.field723.field1755[this.field749] == 0) {
                        this.field749++;
                    } else {
                        if (this.field737.field2655 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field742[this.field749] == 0) {
                            this.method346(this.field749, 1, 20206);
                        }
                        if (this.field742[this.field749] == 0) {
                            class86 var9 = new class86();
                            var9.field1445 = (long) this.field749;
                            var6 = false;
                            this.field752.method1809(var9, (byte) -125);
                        }
                        this.field749++;
                    }
                }
                if (var6) {
                    this.field750 = false;
                    this.field749 = 0;
                }
            } else if (this.field753) {
                boolean var2 = true;
                for (class86 var3 = this.field752.method1812((byte) -5); var3 != null; var3 = this.field752.method1813((byte) 50)) {
                    int var4 = (int) var3.field1445;
                    if (this.field742[var4] != 1) {
                        this.method346(var4, 2, arg0 + 20212);
                    }
                    if (this.field742[var4] == 1) {
                        var3.method557((byte) -89);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field749 < this.field723.field1755.length) {
                    if (this.field723.field1755[this.field749] == 0) {
                        this.field749++;
                    } else {
                        if (this.field722.method472(-21)) {
                            var2 = false;
                            break;
                        }
                        if (this.field742[this.field749] != 1) {
                            this.method346(this.field749, 2, 20206);
                        }
                        if (this.field742[this.field749] != 1) {
                            var2 = false;
                            class86 var5 = new class86();
                            var5.field1445 = (long) this.field749;
                            this.field752.method1809(var5, (byte) -127);
                        }
                        this.field749++;
                    }
                }
                if (var2) {
                    this.field749 = 0;
                    this.field753 = false;
                }
            } else {
                this.field752 = null;
            }
        }
        if (arg0 != -6) {
            field725 = (class235) null;
        }
        if (!this.field756 || this.field757 > class216.method1426(255)) {
            return;
        }
        for (class44 var10 = (class44) this.field732.method1607(0); var10 != null; var10 = (class44) this.field732.method1604((byte) 21)) {
            if (!var10.field602) {
                if (var10.field604) {
                    if (!var10.field600) {
                        throw new RuntimeException();
                    }
                    var10.method557((byte) -89);
                } else {
                    var10.field604 = true;
                }
            }
        }
        this.field757 = class216.method1426(255) + 1000L;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBIIZ)V", line = 553)
    public static final void method345(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        field731++;
        class309.field5285++;
        if (!arg5) {
            class23.method169(true, (byte) 46);
            class234.method1572((byte) 122, true);
            class23.method169(false, (byte) 46);
        }
        class234.method1572((byte) 119, false);
        if (!arg5) {
            class169.method1076((byte) -117);
        }
        class228.method1494((byte) -117);
        class31.method215(true, arg1, arg0, arg3, -88, arg4);
        int var6 = class177.field3055;
        int var7 = class140.field2328;
        int var8 = class225.field3775;
        int var9 = class76.field1322;
        if (class26.field377 == 1) {
            int var10 = class172.field2908;
            int var11 = class203.field3477 + class162.field2663 & 0x7FF;
            if ((class196.field3357 / 256) > var10) {
                var10 = class196.field3357 / 256;
            }
            if (class121.field2018[4] && class207.field3561[4] + 128 > var10) {
                var10 = class207.field3561[4] + 128;
            }
            class182.method1204(var11, 15623, class88.field1503, class42.method254(class61.field850, class213.field3624.field1210, class213.field3624.field1193, -20341) - 50, var10, var6, class154.field2528, var10 * 3 + 600);
        }
        int var12 = class116.field1976;
        int var13 = class63.field876;
        int var14 = class135.field2273;
        int var15 = class295.field5011;
        int var16 = class150.field2450;
        for (int var17 = 0; var17 < 5; var17++) {
            if (class121.field2018[var17]) {
                int var18 = (int) (Math.random() * (double) (class44.field603[var17] * 2 + 1) + Math.sin((double) class247.field4200[var17] / 100.0D * (double) class31.field479[var17]) * (double) class207.field3561[var17] - (double) class44.field603[var17]);
                if (var17 == 0) {
                    class116.field1976 += var18;
                }
                if (var17 == 2) {
                    class135.field2273 += var18;
                }
                if (var17 == 1) {
                    class63.field876 += var18;
                }
                if (var17 == 4) {
                    class150.field2450 += var18;
                    if (class150.field2450 < 128) {
                        class150.field2450 = 128;
                    }
                    if (class150.field2450 > 383) {
                        class150.field2450 = 383;
                    }
                }
                if (var17 == 3) {
                    class295.field5011 = class295.field5011 + var18 & 0x7FF;
                }
            }
        }
        class282.method1894(true);
        class311.method2114(var7, var8, var7 + var9, var6 + var8);
        float var19 = (float) class150.field2450 * 0.17578125F;
        float var20 = (float) class295.field5011 * 0.17578125F;
        if (class26.field377 == 3) {
            var20 = class42.field590 * 360.0F / 6.2831855F;
            var19 = class20.field249 * 360.0F / 6.2831855F;
        }
        class167.method1026(var7, var8, var9, var6, var9 / 2 + var7, var8 - -(var6 / 2), var19, var20, class191.field3288, class191.field3288);
        if (class306.field5253 || var7 > class194.field3320 || class194.field3320 >= var7 + var9 || class262.field4447 < var8 || var6 + var8 <= class262.field4447) {
            class278.field4648 = 0;
            class71.field1242 = false;
        } else {
            class278.field4648 = 0;
            int var21 = class195.field3324;
            class71.field1242 = true;
            int var22 = class305.field5202;
            int var23 = class138.field2291;
            class65.field905 = (class194.field3320 - var7) * (var23 - var21) / var9 + var21;
            int var24 = class103.field1762;
            class1.field13 = (class262.field4447 - var8) * (var24 - var22) / var6 + var22;
        }
        if (arg2 >= -28) {
            return;
        }
        class281.method1876((byte) 121);
        byte var25 = class123.method776(-20253) == 2 ? (byte) class309.field5285 : 1;
        class167.method1043();
        class167.method1038(true);
        class167.method1036(true);
        boolean var26 = false;
        int var27;
        if (class175.field3019 == 10) {
            var27 = class65.method417(16711680, class155.field2552, class116.field1976 >> 10, class135.field2273 >> 10, class44.field606);
        } else {
            var27 = class65.method417(16711680, class155.field2552, class213.field3624.field1178[0] >> 3, class213.field3624.field1150[0] >> 3, class44.field606);
        }
        class17.method105(class75.field1309, !class96.field1612);
        class167.method1060(var27);
        class153.method939(class63.field876, (byte) -70, class135.field2273, class295.field5011, class150.field2450, class116.field1976);
        class167.field2803 = class75.field1309;
        class7.method39(class116.field1976, class63.field876, class135.field2273, class150.field2450, class295.field5011, class208.field3567, class169.field2843, class2.field24, class34.field517, class130.field2206, class264.field4499, class61.field850 + 1, var25, class213.field3624.field1193 >> 7, class213.field3624.field1210 >> 7);
        class57.field783 = true;
        class17.method101();
        class153.method939(0, (byte) -123, 0, 0, 0, 0);
        class281.method1876((byte) -120);
        class133.method829();
        class273.method1839(var8, class191.field3288, var7, var9, var6, (byte) -83, class191.field3288);
        class281.method1875(var8, var6, class191.field3288, 16, class191.field3288, var7, var9);
        ((class97) class139.field2315).method650(0, class44.field606);
        class254.method1721(var7, -35, var9, var6, var8);
        class150.field2450 = var16;
        class63.field876 = var13;
        class135.field2273 = var14;
        class116.field1976 = var12;
        class295.field5011 = var15;
        if (class142.field2365 && class129.field2196.method471(false) == 0) {
            class142.field2365 = false;
        }
        if (class142.field2365) {
            class311.method2116(var7, var8, var9, var6, 0);
            class145.method910(false, -120, class200.field3424);
        }
        if (!arg5 && !class142.field2365 && !class306.field5253 && var7 <= class194.field3320 && class194.field3320 < var7 + var9 && class262.field4447 >= var8 && class262.field4447 < (var6 + var8)) {
            class284.method1959(var6, -15801, var9, var7, class262.field4447, class194.field3320, var8);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)Lm;", line = 759)
    private final class44 method346(int arg0, int arg1, int arg2) {
        field734++;
        class44 var4 = (class44) this.field732.method1612((long) arg0, 115);
        if (var4 != null && arg1 == 0 && !var4.field600 && var4.field602) {
            var4.method557((byte) -89);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field735 == null || this.field742[arg0] == -1) {
                    if (this.field722.method470(20)) {
                        return null;
                    }
                    var4 = this.field722.method464(0, true, arg0, (byte) 2, this.field730);
                } else {
                    var4 = this.field737.method986(this.field735, 1, arg0);
                }
            } else if (arg1 == 1) {
                if (this.field735 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field737.method987(arg0, arg2 ^ 0x4ECE, this.field735);
            } else if (arg1 == 2) {
                if (this.field735 == null) {
                    throw new RuntimeException();
                }
                if (this.field742[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field722.method472(-21)) {
                    return null;
                }
                var4 = this.field722.method464(arg2 - 20206, false, arg0, (byte) 2, this.field730);
            } else {
                throw new RuntimeException();
            }
            this.field732.method1611(var4, -1, (long) arg0);
        }
        if (var4.field602) {
            return null;
        } else if (arg2 == 20206) {
            byte[] var5 = var4.method216(false);
            if (!var4 instanceof class31) {
                try {
                    if (var5 == null || var5.length <= 2) {
                        throw new RuntimeException();
                    }
                    class18.field223.reset();
                    class18.field223.update(var5, 0, var5.length - 2);
                    int var6 = (int) class18.field223.getValue();
                    if (this.field723.field1743[arg0] != var6) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var14) {
                    this.field722.method466(arg2 ^ 0x4EEF);
                    var4.method557((byte) -89);
                    if (var4.field600 && !this.field722.method470(20)) {
                        class210 var8 = this.field722.method464(arg2 ^ 0x4EEE, true, arg0, (byte) 2, this.field730);
                        this.field732.method1611(var8, -1, (long) arg0);
                    }
                    return null;
                }
                var5[var5.length - 2] = (byte) (this.field723.field1763[arg0] >>> 8);
                var5[var5.length - 1] = (byte) this.field723.field1763[arg0];
                if (this.field735 != null) {
                    this.field737.method982(-103, arg0, var5, this.field735);
                    if (this.field742[arg0] != 1) {
                        this.field728++;
                        this.field742[arg0] = 1;
                    }
                }
                if (!var4.field600) {
                    var4.method557((byte) -89);
                }
                return var4;
            }
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class18.field223.reset();
                class18.field223.update(var5, 0, var5.length - 2);
                int var9 = (int) class18.field223.getValue();
                if (this.field723.field1743[arg0] != var9) {
                    throw new RuntimeException();
                }
                int var10 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field723.field1763[arg0] & 0xFFFF) != var10) {
                    throw new RuntimeException();
                }
                if (this.field742[arg0] != 1) {
                    if (this.field742[arg0] == 0) {
                    }
                    this.field728++;
                    this.field742[arg0] = 1;
                }
                if (!var4.field600) {
                    var4.method557((byte) -89);
                }
                return var4;
            } catch (Exception var13) {
                this.field742[arg0] = -1;
                var4.method557((byte) -89);
                if (var4.field600 && !this.field722.method470(arg2 - 20186)) {
                    class210 var12 = this.field722.method464(0, true, arg0, (byte) 2, this.field730);
                    this.field732.method1611(var12, -1, (long) arg0);
                }
                return null;
            }
        } else {
            return (class44) null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)I", line = 973)
    public final int method347(int arg0, byte arg1) {
        field755++;
        class44 var3 = (class44) this.field732.method1612((long) arg0, 104);
        if (var3 == null) {
            int var4 = -121 % ((arg1 + 72) / 40);
            return 0;
        } else {
            return var3.method212(512);
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(ILih;Lih;Lpb;Lhc;IIZ)V", line = 1247)
    public class54(int arg0, class30 arg1, class30 arg2, class71 arg3, class162 arg4, int arg5, int arg6, boolean arg7) {
        this.field730 = arg0;
        this.field735 = arg1;
        if (this.field735 == null) {
            this.field750 = false;
        } else {
            this.field750 = true;
            this.field752 = new class269();
        }
        this.field739 = arg5;
        this.field737 = arg4;
        this.field722 = arg3;
        this.field741 = arg6;
        this.field756 = arg7;
        this.field738 = arg2;
        if (this.field738 != null) {
            this.field740 = this.field737.method986(this.field738, 1, this.field730);
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V", line = 997)
    public final void method348(int arg0) {
        field729++;
        if (this.field735 == null) {
            return;
        }
        if (arg0 != 100) {
            this.field728 = -15;
        }
        this.field753 = true;
        if (this.field752 == null) {
            this.field752 = new class269();
        }
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V", line = 1015)
    public static void method349(int arg0) {
        if (arg0 != 5369) {
            field746 = (class283) null;
        }
        field727 = null;
        field725 = null;
        field736 = (byte[][][]) null;
        field751 = null;
        field746 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)I", line = 1031)
    public final int method350(boolean arg0) {
        field744++;
        if (!arg0) {
            this.method352(68);
        }
        return this.field728;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[B", line = 1047)
    public final byte[] method351(int arg0, int arg1) {
        field719++;
        class44 var3 = this.method346(arg1, arg0, 20206);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method216(false);
            var3.method557((byte) -89);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)I", line = 1067)
    public final int method352(int arg0) {
        field726++;
        int var2 = -53 % ((67 - arg0) / 33);
        if (this.field723 == null) {
            return 0;
        } else if (this.field750) {
            class86 var3 = this.field752.method1812((byte) 97);
            return var3 == null ? 0 : (int) var3.field1445;
        } else {
            return this.field723.field1759;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(FIIZIZIII)[[I", line = 1090)
    public static final int[][] method353(float arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        int[][] var9 = new int[arg6][arg8];
        field743++;
        class61 var10 = new class61();
        var10.field840 = arg5;
        if (arg3) {
            method349(-33);
        }
        var10.field837 = arg7;
        var10.field841 = (int) (arg0 * 4096.0F);
        var10.field842 = arg2;
        var10.field860 = arg1;
        var10.method276(3);
        class138.method857(arg8, arg6, -94);
        for (int var11 = 0; var11 < arg6; var11++) {
            var10.method399(26683, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)I", line = 1134)
    public final int method354(byte arg0) {
        field745++;
        if (this.method343(arg0 ^ 0x1) == null) {
            return this.field740 == null ? 0 : this.field740.method212(512);
        } else {
            if (arg0 != -109) {
                this.method355((byte) -49);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)I", line = 1155)
    public final int method355(byte arg0) {
        field733++;
        if (this.field723 == null) {
            return 0;
        } else {
            if (arg0 != 75) {
                method345(23, 107, (byte) 107, 124, 79, false);
            }
            return this.field723.field1759;
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)V", line = 1173)
    public final void method356(byte arg0) {
        field724++;
        if (this.field752 == null || this.method343(-117) == null || arg0 != -56) {
            return;
        }
        for (class86 var2 = this.field754.method1812((byte) -114); var2 != null; var2 = this.field754.method1813((byte) 113)) {
            int var3 = (int) var2.field1445;
            if (var3 < 0 || var3 >= this.field723.field1739 || this.field723.field1755[var3] == 0) {
                var2.method557((byte) -89);
            } else {
                if (this.field742[var3] == 0) {
                    this.method346(var3, 1, 20206);
                }
                if (this.field742[var3] == -1) {
                    this.method346(var3, 2, arg0 ^ 0xFFFFB126);
                }
                if (this.field742[var3] == 1) {
                    var2.method557((byte) -89);
                }
            }
        }
    }
}
