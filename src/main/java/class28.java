import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class28 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lce;")
    private class246 field462 = new class246();

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Lce;")
    private class246 field478 = new class246();

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lce;")
    private class246 field483 = new class246();

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "Lce;")
    private class246 field487 = new class246();

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "Lwa;")
    private class82 field491 = new class82(4);

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "B")
    private byte field493 = 0;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public volatile int field495 = 0;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public volatile int field494 = 0;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "Lwa;")
    private class82 field492 = new class82(8);

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lna;")
    public static class26 field464 = class69.method505("(Y<)4col>", (byte) -121);

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field477 = -1;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field475 = 0;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field486 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "J")
    private long field488;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "Lpm;")
    private class103 field496;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "Lma;")
    private class285 field489;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "[Lqf;")
    public static class148[] field472;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method219(int arg0) {
        field466++;
        if (arg0 != -30064) {
            this.field478 = (class246) null;
        }
        return this.method224(11706) >= 20;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 21)
    public static void method220(byte arg0) {
        field472 = null;
        if (arg0 != -88) {
            method228(-72, true);
        }
        field464 = null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Z", line = 32)
    public final boolean method221(byte arg0) {
        field470++;
        if (this.field489 != null) {
            long var2 = class128.method869((byte) -55);
            int var4 = (int) (var2 - this.field488);
            this.field488 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field490 += var4;
            if (this.field490 > 30000) {
                try {
                    this.field489.method2018(14821);
                } catch (Exception var31) {
                }
                this.field489 = null;
            }
        }
        if (this.field489 == null) {
            return this.method231(4) == 0 && this.method224(11706) == 0;
        }
        try {
            this.field489.method2016(127);
            for (class103 var6 = (class103) this.field462.method1692((byte) 125); var6 != null; var6 = (class103) this.field462.method1694(119)) {
                this.field491.field1301 = 0;
                this.field491.method591((byte) -26, 1);
                this.field491.method618((int) var6.field1564, 6517);
                this.field489.method2014(false, 0, this.field491.field1280, 4);
                this.field478.method1695(var6, (byte) -125);
            }
            for (class103 var7 = (class103) this.field483.method1692((byte) 51); var7 != null; var7 = (class103) this.field483.method1694(-53)) {
                this.field491.field1301 = 0;
                this.field491.method591((byte) -22, 0);
                this.field491.method618((int) var7.field1564, 6517);
                this.field489.method2014(false, 0, this.field491.field1280, 4);
                this.field487.method1695(var7, (byte) -128);
            }
            int var8 = 100 % ((33 - arg0) / 54);
            for (int var9 = 0; var9 < 100; var9++) {
                int var10 = this.field489.method2015(-18358);
                if (var10 < 0) {
                    throw new IOException();
                }
                if (var10 == 0) {
                    break;
                }
                this.field490 = 0;
                byte var11 = 0;
                if (this.field496 == null) {
                    var11 = 8;
                } else if (this.field496.field1650 == 0) {
                    var11 = 1;
                }
                if (var11 <= 0) {
                    int var12 = this.field496.field1652.field1280.length - this.field496.field1645;
                    int var13 = 512 - this.field496.field1650;
                    if (var13 > var12 - this.field496.field1652.field1301) {
                        var13 = var12 - this.field496.field1652.field1301;
                    }
                    if (var13 > var10) {
                        var13 = var10;
                    }
                    this.field489.method2011(this.field496.field1652.field1301, var13, -18455, this.field496.field1652.field1280);
                    if (this.field493 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field496.field1652.field1280[this.field496.field1652.field1301 + var14] = (byte) class282.method1982(this.field496.field1652.field1280[this.field496.field1652.field1301 + var14], this.field493);
                        }
                    }
                    this.field496.field1650 += var13;
                    this.field496.field1652.field1301 += var13;
                    if (this.field496.field1652.field1301 == var12) {
                        this.field496.method722((byte) -107);
                        this.field496.field930 = false;
                        this.field496 = null;
                    } else if (this.field496.field1650 == 512) {
                        this.field496.field1650 = 0;
                    }
                } else {
                    int var15 = var11 - this.field492.field1301;
                    if (var10 < var15) {
                        var15 = var10;
                    }
                    this.field489.method2011(this.field492.field1301, var15, -18455, this.field492.field1280);
                    if (this.field493 != 0) {
                        for (int var16 = 0; var16 < var15; var16++) {
                            this.field492.field1280[this.field492.field1301 + var16] = (byte) class282.method1982(this.field492.field1280[this.field492.field1301 + var16], this.field493);
                        }
                    }
                    this.field492.field1301 += var15;
                    if (this.field492.field1301 >= var11) {
                        if (this.field496 == null) {
                            this.field492.field1301 = 0;
                            int var17 = this.field492.method642((byte) -34);
                            int var18 = this.field492.method576(1);
                            int var19 = this.field492.method642((byte) -26);
                            int var20 = this.field492.method587(-502942936);
                            int var21 = var19 & 0x7F;
                            boolean var22 = (var19 & 0x80) != 0;
                            Object var23 = null;
                            long var24 = (long) ((var17 << 16) + var18);
                            class103 var26;
                            if (var22) {
                                for (var26 = (class103) this.field487.method1692((byte) 76); var26 != null && var26.field1564 != var24; var26 = (class103) this.field487.method1694(122)) {
                                }
                            } else {
                                for (var26 = (class103) this.field478.method1692((byte) 65); var26 != null && var26.field1564 != var24; var26 = (class103) this.field478.method1694(-15)) {
                                }
                            }
                            if (var26 == null) {
                                throw new IOException();
                            }
                            int var27 = var21 == 0 ? 5 : 9;
                            this.field496 = var26;
                            this.field496.field1652 = new class82(var20 - (-var27 - this.field496.field1645));
                            this.field496.field1652.method591((byte) -127, var21);
                            this.field496.field1652.method577(-125, var20);
                            this.field496.field1650 = 8;
                            this.field492.field1301 = 0;
                        } else if (this.field496.field1650 != 0) {
                            throw new IOException();
                        } else if (this.field492.field1280[0] == -1) {
                            this.field496.field1650 = 1;
                            this.field492.field1301 = 0;
                        } else {
                            this.field496 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var32) {
            try {
                this.field489.method2018(14821);
            } catch (Exception var30) {
            }
            this.field494 = -2;
            this.field495++;
            this.field489 = null;
            return this.method231(4) == 0 && this.method224(11706) == 0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 309)
    public final void method222(boolean arg0) {
        field484++;
        if (this.field489 == null) {
            return;
        }
        try {
            this.field491.field1301 = 0;
            if (!arg0) {
                this.method234((byte) 21);
            }
            this.field491.method591((byte) -48, 7);
            this.field491.method618(0, 6517);
            this.field489.method2014(false, 0, this.field491.field1280, 4);
        } catch (IOException var5) {
            try {
                this.field489.method2018(14821);
            } catch (Exception var4) {
            }
            this.field495++;
            this.field494 = -2;
            this.field489 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILve;I)Ljk;", line = 347)
    public static final class88 method223(int arg0, class266 arg1, int arg2) {
        if (arg0 <= 12) {
            field486 = 107;
        }
        byte[] var3 = arg1.method1894(arg2, 0);
        field467++;
        return var3 == null ? null : new class88(var3);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I", line = 365)
    private final int method224(int arg0) {
        if (arg0 != 11706) {
            field472 = (class148[]) null;
        }
        field480++;
        return this.field483.method1690(-79) + this.field487.method1690(-118);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZ)V", line = 376)
    public final void method225(boolean arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field468++;
        if (this.field489 == null) {
            return;
        }
        try {
            this.field491.field1301 = 0;
            this.field491.method591((byte) -27, arg0 ? 2 : 3);
            this.field491.method618(0, 6517);
            this.field489.method2014(false, 0, this.field491.field1280, 4);
        } catch (IOException var6) {
            try {
                this.field489.method2018(14821);
            } catch (Exception var5) {
            }
            this.field495++;
            this.field494 = -2;
            this.field489 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V", line = 409)
    public final void method226(int arg0) {
        field471++;
        if (arg0 != -29340) {
            this.method224(-28);
        }
        if (this.field489 != null) {
            this.field489.method2017(false);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLma;I)V", line = 426)
    public final void method227(boolean arg0, class285 arg1, int arg2) {
        if (this.field489 != null) {
            try {
                this.field489.method2018(arg2 ^ 0x39E5);
            } catch (Exception var11) {
            }
            this.field489 = null;
        }
        this.field489 = arg1;
        this.method234((byte) -77);
        this.method225(arg0, true);
        this.field492.field1301 = 0;
        this.field496 = null;
        field469++;
        while (true) {
            class103 var5 = (class103) this.field478.method1693(-1);
            if (var5 == null) {
                while (true) {
                    class103 var6 = (class103) this.field487.method1693(-1);
                    if (var6 == null) {
                        if (this.field493 != arg2) {
                            try {
                                this.field491.field1301 = 0;
                                this.field491.method591((byte) -52, 4);
                                this.field491.method591((byte) -24, this.field493);
                                this.field491.method643(-20037, 0);
                                this.field489.method2014(false, 0, this.field491.field1280, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field489.method2018(14821);
                                } catch (Exception var9) {
                                }
                                this.field494 = -2;
                                this.field495++;
                                this.field489 = null;
                            }
                        }
                        this.field490 = 0;
                        this.field488 = class128.method869((byte) -55);
                        return;
                    }
                    this.field483.method1695(var6, (byte) 95);
                }
            }
            this.field462.method1695(var5, (byte) 80);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V", line = 494)
    public static final void method228(int arg0, boolean arg1) {
        field473++;
        class35.field578 = (byte[][][]) null;
        class229.field3631 = (int[][][]) null;
        if (arg0 < 14) {
            method228(10, true);
        }
        class66.field1033 = null;
        class236.field3770 = (byte[][][]) null;
        class124.field1924 = null;
        class263.field4310 = (byte[][][]) null;
        if (arg1 && class82.field1328 != null) {
            class181.field2815 = class82.field1328.field1047;
        } else {
            class181.field2815 = null;
        }
        class260.field4257 = (byte[][][]) null;
        class315.field5386 = (byte[][][]) null;
        class167.field2588 = (int[][][]) null;
        class189.field2970 = (int[][][]) null;
        class109.field1725 = 0;
        class82.field1328 = null;
        class124.field1925.method253(-108);
        class298.field5133 = null;
        class18.field253 = -1;
        class36.field599 = null;
        class228.field3606 = null;
        class285.field4786 = null;
        class154.field2410 = null;
        class51.field796 = null;
        class67.field1054 = null;
        class36.field584 = null;
        class298.field5136 = null;
        class260.field4254 = null;
        class165.field2566 = -1;
        class181.field2817 = null;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)Z", line = 537)
    public final boolean method229(byte arg0) {
        int var2 = 33 % ((2 - arg0) / 58);
        field481++;
        return this.method231(4) >= 20;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V", line = 548)
    public final void method230(byte arg0) {
        field476++;
        int var2 = -116 / ((arg0 - 45) / 51);
        try {
            this.field489.method2018(14821);
        } catch (Exception var4) {
        }
        this.field494 = -1;
        this.field493 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field489 = null;
        this.field495++;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)I", line = 571)
    public final int method231(int arg0) {
        if (arg0 != 4) {
            this.method230((byte) -45);
        }
        field485++;
        return this.field462.method1690(-127) + this.field478.method1690(-108);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V", line = 587)
    public final void method232(boolean arg0) {
        if (this.field489 != null) {
            this.field489.method2018(14821);
        }
        field479++;
        if (arg0) {
            this.method225(true, false);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIBIZ)Lpm;", line = 604)
    public final class103 method233(int arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field482++;
        class103 var6 = new class103();
        long var7 = (long) ((arg1 << 16) + arg3);
        var6.field926 = arg4;
        var6.field1564 = var7;
        var6.field1645 = arg2;
        int var9 = 120 / ((63 - arg0) / 47);
        if (arg4) {
            if (this.method231(4) >= 20) {
                throw new RuntimeException();
            }
            this.field462.method1695(var6, (byte) -125);
        } else if (this.method224(11706) < 20) {
            this.field483.method1695(var6, (byte) 78);
        } else {
            throw new RuntimeException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V", line = 652)
    private final void method234(byte arg0) {
        field465++;
        if (this.field489 == null || arg0 != -77) {
            return;
        }
        try {
            this.field491.field1301 = 0;
            this.field491.method591((byte) -125, 6);
            this.field491.method618(3, 6517);
            this.field489.method2014(false, 0, this.field491.field1280, 4);
        } catch (IOException var5) {
            try {
                this.field489.method2018(14821);
            } catch (Exception var4) {
            }
            this.field495++;
            this.field489 = null;
            this.field494 = -2;
        }
    }
}
