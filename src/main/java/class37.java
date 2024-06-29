import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class37 extends class212 {

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    private int field557 = 1;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    private int field564 = 204;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
    private int field568 = 1;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "Lsc;")
    public static class181 field560 = class149.method967(255, "Angreifen");

    @OriginalMember(owner = "client!va", name = "V", descriptor = "Lsc;")
    private static class181 field558 = class149.method967(255, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!va", name = "db", descriptor = "Lsc;")
    public static class181 field566 = field558;

    @OriginalMember(owner = "client!va", name = "kb", descriptor = "I")
    public static int field573 = 0;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!va", name = "ib", descriptor = "Ldg;")
    public static class90 field571;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(II)V")
    public static final void method268(int arg0, int arg1) {
        ++field559;
        class196 var2 = (class196) class254.field4435.method1424(true, (long) arg0);
        if (var2 != null) {
            var2.method290((byte) -48);
            if (arg1 < 71) {
                method271((class11) null, (class11) null, 72);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V")
    public static void method269(byte arg0) {
        field571 = null;
        if (arg0 != 23) {
            method271((class11) null, (class11) null, 41);
        }
        field560 = null;
        field566 = null;
        field558 = null;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class37() {
        super(0, true);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILo;IIIZ)V")
    public static final void method270(int arg0, int arg1, class175 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg1 * arg1 - -(arg0 * arg0);
        ++field561;
        if (var7 <= 360000) {
            if (!arg6) {
                field560 = null;
            }
            int var8 = Math.min(arg2.field3057 / 2, arg2.field3041 / 2);
            if (var7 > var8 * var8) {
                var8 -= 10;
                int var9 = 2047 & class214.field3682 + class144.field2348;
                int var10 = class72.field1150[var9];
                int var11 = class72.field1145[var9];
                int var12 = var11 * 256 / (class221.field3821 + 256);
                int var13 = var10 * 256 / (class221.field3821 + 256);
                int var14 = arg0 * var12 + -(arg1 * var13) >> 16;
                int var15 = arg0 * var13 + arg1 * var12 >> 16;
                double var16 = Math.atan2((double) var15, (double) var14);
                int var18 = (int) ((double) var8 * Math.sin(var16));
                int var19 = (int) (Math.cos(var16) * (double) var8);
                ((class48) class26.field454[arg3]).method342(arg2.field3057 / 2 + arg5 - 10 + var18, -var19 + arg4 - -(arg2.field3041 / 2) - 10, 20, 20, 15, 15, var16, 256);
            } else {
                class138.method887(arg4, class97.field1579[arg3], arg1, (byte) 92, arg0, arg2, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljb;Ljb;I)V")
    public static final void method271(class11 arg0, class11 arg1, int arg2) {
        int var3 = -7 / ((arg2 - -16) / 59);
        ++field563;
        class169.field2841 = arg0;
        class137.field2245 = arg1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILed;III)V")
    public static final void method272(int arg0, class116 arg1, int arg2, int arg3, int arg4) {
        ++field567;
        if (class258.field4507 != arg1) {
            if (arg3 != 4096) {
                method269((byte) 99);
            }
            if (~class131.field2177 > -401) {
                class181 var5;
                if (arg1.field1910 == 0) {
                    var5 = class175.method1164(new class181[] { arg1.method770(arg3 + -4052), class250.method1698(class258.field4507.field1919, arg1.field1919, (byte) -57), class200.field3459, class116.field1906, class169.method1119((byte) -126, arg1.field1919), class238.field4136 }, (byte) 123);
                } else {
                    var5 = class175.method1164(new class181[] { arg1.method770(75), class200.field3459, class237.field4123, class169.method1119((byte) 54, arg1.field1910), class238.field4136 }, (byte) 127);
                }
                if (~class216.field3710 != -2) {
                    if (!class220.field3781) {
                        for (int var6 = 7; var6 >= 0; --var6) {
                            if (class114.field1852[var6] != null) {
                                ++class126.field2087;
                                boolean var7 = false;
                                short var8 = 0;
                                if (~class65.field1069 == -1 && class114.field1852[var6].method1227(arg3 ^ 25997, class146.field2402)) {
                                    if (~class258.field4507.field1919 > ~arg1.field1919) {
                                        var8 = 2000;
                                    }
                                    if (class258.field4507.field1920 != 0 && ~arg1.field1920 != -1) {
                                        if (~class258.field4507.field1920 != ~arg1.field1920) {
                                            var8 = 0;
                                        } else {
                                            var8 = 2000;
                                        }
                                    }
                                } else if (class262.field4575[var6]) {
                                    var8 = 2000;
                                }
                                short var9 = class1.field6[var6];
                                short var10 = (short) (var8 + var9);
                                class199.method1348(class175.method1164(new class181[] { class43.field678, var5 }, (byte) 123), true, arg4, var10, arg2, (long) arg0, class114.field1852[var6]);
                            }
                        }
                    } else if (~(class121.field1974 & 8) == -9) {
                        ++class74.field1192;
                        class199.method1348(class175.method1164(new class181[] { class166.field2817, class79.field1280, var5 }, (byte) 126), true, arg4, (short) 57, arg2, (long) arg0, class177.field3113);
                    }
                } else {
                    ++class90.field1427;
                    class199.method1348(class175.method1164(new class181[] { class208.field3568, class79.field1280, var5 }, (byte) 123), true, arg4, (short) 36, arg2, (long) arg0, class52.field830);
                }
                for (int var11 = 0; var11 < class131.field2177; ++var11) {
                    if (~class172.field2873[var11] == -21) {
                        class63.field970[var11] = class175.method1164(new class181[] { class43.field678, var5 }, (byte) 123);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        if (arg1 <= 25) {
            method272(-84, (class116) null, -17, -92, -31);
        }
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            for (int var4 = 0; var4 < class26.field452; ++var4) {
                int var5 = class253.field4416[var4];
                int var6 = this.field557 * var5 >> 12;
                int var7 = class176.field3090[arg0];
                int var8 = this.field568 * var7 >> 12;
                int var9 = var7 % (4096 / this.field568) * this.field568;
                int var10 = var5 % (4096 / this.field557) * this.field557;
                if (var9 < this.field564) {
                    for (var6 -= var8; ~var6 > -1; var6 += 4) {
                    }
                    while (~var6 < -4) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field564 > var10) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field564 < ~var10) {
                    int var11;
                    for (var11 = var6 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        ++field565;
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lej;BLvf;I)V")
    public static final void method273(class142 arg0, byte arg1, class230 arg2, int arg3) {
        class88 var4 = new class88();
        ++field572;
        if (arg1 == -27) {
            var4.field1398 = arg2.method1516((byte) 82);
            var4.field1407 = arg2.method1529(-32494);
            var4.field1394 = new class118[var4.field1398];
            var4.field1400 = new class118[var4.field1398];
            var4.field1404 = new int[var4.field1398];
            var4.field1399 = new byte[var4.field1398][][];
            var4.field1396 = new int[var4.field1398];
            var4.field1395 = new int[var4.field1398];
            for (int var5 = 0; var4.field1398 > var5; ++var5) {
                try {
                    int var6 = arg2.method1516((byte) 82);
                    if (~var6 != -1 && var6 != 1 && var6 != 2) {
                        if (var6 == 3 || ~var6 == -5) {
                            String var7 = new String(arg2.method1549(108).method1247(-96));
                            String var8 = new String(arg2.method1549(76).method1247(-84));
                            int var9 = arg2.method1516((byte) 82);
                            String[] var10 = new String[var9];
                            for (int var11 = 0; ~var11 > ~var9; ++var11) {
                                var10[var11] = new String(arg2.method1549(50).method1247(-5));
                            }
                            byte[][] var12 = new byte[var9][];
                            if (var6 == 3) {
                                for (int var13 = 0; var13 < var9; ++var13) {
                                    int var14 = arg2.method1529(-32494);
                                    var12[var13] = new byte[var14];
                                    arg2.method1530(0, -117, var12[var13], var14);
                                }
                            }
                            Class[] var15 = new Class[var9];
                            var4.field1395[var5] = var6;
                            for (int var16 = 0; ~var16 > ~var9; ++var16) {
                                var15[var16] = class243.method1647(var10[var16], (byte) 91);
                            }
                            var4.field1400[var5] = arg0.method917(var15, var8, class243.method1647(var7, (byte) 115), class102.method690(arg1, -19));
                            var4.field1399[var5] = var12;
                        }
                    } else {
                        String var17 = new String(arg2.method1549(76).method1247(-67));
                        String var18 = new String(arg2.method1549(32).method1247(117));
                        int var19 = 0;
                        if (~var6 == -2) {
                            var19 = arg2.method1529(-32494);
                        }
                        var4.field1395[var5] = var6;
                        var4.field1404[var5] = var19;
                        var4.field1394[var5] = arg0.method913(var18, class243.method1647(var17, (byte) 109), 102);
                    }
                } catch (ClassNotFoundException var20) {
                    var4.field1396[var5] = -1;
                } catch (SecurityException var21) {
                    var4.field1396[var5] = -2;
                } catch (NullPointerException var22) {
                    var4.field1396[var5] = -3;
                } catch (Exception var23) {
                    var4.field1396[var5] = -4;
                } catch (Throwable var24) {
                    var4.field1396[var5] = -5;
                }
            }
            class203.field3485.method1689(var4, 61);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field564 = arg0.method1535(2);
                }
            } else {
                this.field568 = arg0.method1516((byte) 82);
            }
        } else {
            this.field557 = arg0.method1516((byte) 82);
        }
        if (arg2 != -3) {
            field558 = null;
        }
        ++field570;
    }
}
