import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class240 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "Lwc;")
    private class53 field3975 = new class53();

    @OriginalMember(owner = "client!em", name = "w", descriptor = "Lwc;")
    private class53 field3996 = new class53();

    @OriginalMember(owner = "client!em", name = "B", descriptor = "Lwc;")
    private class53 field4001 = new class53();

    @OriginalMember(owner = "client!em", name = "D", descriptor = "Lwc;")
    private class53 field4003 = new class53();

    @OriginalMember(owner = "client!em", name = "H", descriptor = "Lb;")
    private class94 field4007 = new class94(4);

    @OriginalMember(owner = "client!em", name = "K", descriptor = "I")
    public volatile int field4010 = 0;

    @OriginalMember(owner = "client!em", name = "I", descriptor = "B")
    private byte field4008 = 0;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "I")
    public volatile int field4011 = 0;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "Lb;")
    private class94 field4009 = new class94(8);

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field3982 = 0;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "Lfe;")
    public static class251 field3998 = new class251();

    @OriginalMember(owner = "client!em", name = "C", descriptor = "[J")
    public static long[] field4002 = new long[500];

    @OriginalMember(owner = "client!em", name = "A", descriptor = "Lbd;")
    public static class162 field4000 = class17.method142(0, "Loaded titlescreen)3");

    @OriginalMember(owner = "client!em", name = "z", descriptor = "Lbd;")
    public static class162 field3999 = class17.method142(0, "Angreifen");

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    private int field4006;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "J")
    private long field4005;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "Loc;")
    private class267 field4004;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "Lmk;")
    private class89 field4012;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method1691(int arg0) {
        if (this.field4004 != null) {
            long var2 = class300.method2048((byte) 18);
            int var4 = (int) (var2 - this.field4005);
            this.field4005 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4006 += var4;
            if (this.field4006 > 30000) {
                try {
                    this.field4004.method1829((byte) 4);
                } catch (Exception var31) {
                }
                this.field4004 = null;
            }
        }
        field3974++;
        if (this.field4004 == null) {
            return this.method1703(118) == 0 && this.method1693(true) == 0;
        }
        try {
            this.field4004.method1828(-1);
            for (class89 var6 = (class89) this.field3975.method373(true); var6 != null; var6 = (class89) this.field3975.method376(true)) {
                this.field4007.field1653 = 0;
                this.field4007.method753(1, true);
                this.field4007.method740(28918, (int) var6.field3604);
                this.field4004.method1827(0, 90, this.field4007.field1681, 4);
                this.field3996.method379(var6, 255);
            }
            for (class89 var7 = (class89) this.field4001.method373(true); var7 != null; var7 = (class89) this.field4001.method376(true)) {
                this.field4007.field1653 = 0;
                this.field4007.method753(0, true);
                this.field4007.method740(28918, (int) var7.field3604);
                this.field4004.method1827(0, -76, this.field4007.field1681, 4);
                this.field4003.method379(var7, 255);
            }
            int var8 = -65 / ((arg0 + 5) / 63);
            for (int var9 = 0; var9 < 100; var9++) {
                int var10 = this.field4004.method1826(108);
                if (var10 < 0) {
                    throw new IOException();
                }
                if (var10 == 0) {
                    break;
                }
                this.field4006 = 0;
                byte var11 = 0;
                if (this.field4012 == null) {
                    var11 = 8;
                } else if (this.field4012.field1587 == 0) {
                    var11 = 1;
                }
                if (var11 > 0) {
                    int var12 = var11 - this.field4009.field1653;
                    if (var12 > var10) {
                        var12 = var10;
                    }
                    this.field4004.method1830(var12, (byte) -78, this.field4009.field1681, this.field4009.field1653);
                    if (this.field4008 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field4009.field1681[this.field4009.field1653 + var13] = (byte) class110.method887(this.field4009.field1681[this.field4009.field1653 + var13], this.field4008);
                        }
                    }
                    this.field4009.field1653 += var12;
                    if (this.field4009.field1653 >= var11) {
                        if (this.field4012 == null) {
                            this.field4009.field1653 = 0;
                            int var14 = this.field4009.method756(915905888);
                            int var15 = this.field4009.method761((byte) 108);
                            int var16 = this.field4009.method756(915905888);
                            boolean var17 = (var16 & 0x80) != 0;
                            int var18 = this.field4009.method747(false);
                            long var19 = (long) ((var14 << 16) + var15);
                            Object var21 = null;
                            int var22 = var16 & 0x7F;
                            class89 var23;
                            if (var17) {
                                for (var23 = (class89) this.field4003.method373(true); var23 != null && var23.field3604 != var19; var23 = (class89) this.field4003.method376(true)) {
                                }
                            } else {
                                for (var23 = (class89) this.field3996.method373(true); var23 != null && var23.field3604 != var19; var23 = (class89) this.field3996.method376(true)) {
                                }
                            }
                            if (var23 == null) {
                                throw new IOException();
                            }
                            this.field4012 = var23;
                            int var24 = var22 == 0 ? 5 : 9;
                            this.field4012.field1592 = new class94(var18 + var24 + this.field4012.field1580);
                            this.field4012.field1592.method753(var22, true);
                            this.field4012.field1592.method730(false, var18);
                            this.field4009.field1653 = 0;
                            this.field4012.field1587 = 8;
                        } else if (this.field4012.field1587 != 0) {
                            throw new IOException();
                        } else if (this.field4009.field1681[0] == -1) {
                            this.field4009.field1653 = 0;
                            this.field4012.field1587 = 1;
                        } else {
                            this.field4012 = null;
                        }
                    }
                } else {
                    int var25 = this.field4012.field1592.field1681.length - this.field4012.field1580;
                    int var26 = 512 - this.field4012.field1587;
                    if (var26 > var25 - this.field4012.field1592.field1653) {
                        var26 = var25 - this.field4012.field1592.field1653;
                    }
                    if (var10 < var26) {
                        var26 = var10;
                    }
                    this.field4004.method1830(var26, (byte) 127, this.field4012.field1592.field1681, this.field4012.field1592.field1653);
                    if (this.field4008 != 0) {
                        for (int var27 = 0; var27 < var26; var27++) {
                            this.field4012.field1592.field1681[this.field4012.field1592.field1653 + var27] = (byte) class110.method887(this.field4012.field1592.field1681[this.field4012.field1592.field1653 + var27], this.field4008);
                        }
                    }
                    this.field4012.field1587 += var26;
                    this.field4012.field1592.field1653 += var26;
                    if (this.field4012.field1592.field1653 == var25) {
                        this.field4012.method1573(-9728);
                        this.field4012.field2311 = false;
                        this.field4012 = null;
                    } else if (this.field4012.field1587 == 512) {
                        this.field4012.field1587 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var32) {
            try {
                this.field4004.method1829((byte) 4);
            } catch (Exception var30) {
            }
            this.field4004 = null;
            this.field4010++;
            this.field4011 = -2;
            return this.method1703(119) == 0 && this.method1693(true) == 0;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZBIIB)Lmk;", line = 286)
    public final class89 method1692(boolean arg0, byte arg1, int arg2, int arg3, byte arg4) {
        field3997++;
        int var6 = -22 / ((arg4 - 12) / 58);
        long var7 = (long) ((arg2 << 16) + arg3);
        class89 var9 = new class89();
        var9.field2302 = arg0;
        var9.field3604 = var7;
        var9.field1580 = arg1;
        if (arg0) {
            if (this.method1703(122) >= 20) {
                throw new RuntimeException();
            }
            this.field3975.method379(var9, 255);
        } else if (this.method1693(true) < 20) {
            this.field4001.method379(var9, 255);
        } else {
            throw new RuntimeException();
        }
        return var9;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)I", line = 330)
    private final int method1693(boolean arg0) {
        if (arg0) {
            field3995++;
            return this.field4001.method380((byte) -68) + this.field4003.method380((byte) -48);
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)V", line = 343)
    public static final void method1694(int arg0, byte arg1) {
        if (arg1 <= 122) {
            method1700(-27, 30);
        }
        if (class9.field105 == 0) {
            class48.field764.method1925(false, arg0);
        } else {
            class126.field2295 = arg0;
        }
        field3977++;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)Z", line = 364)
    public final boolean method1695(int arg0) {
        field3989++;
        if (arg0 == -21) {
            return this.method1693(true) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Loc;ZB)V", line = 375)
    public final void method1696(class267 arg0, boolean arg1, byte arg2) {
        field3990++;
        if (this.field4004 != null) {
            try {
                this.field4004.method1829((byte) 4);
            } catch (Exception var11) {
            }
            this.field4004 = null;
        }
        this.field4004 = arg0;
        this.method1709(2);
        this.method1706(arg2 ^ 0x4A8B, arg1);
        this.field4012 = null;
        this.field4009.field1653 = 0;
        while (true) {
            class89 var5 = (class89) this.field3996.method374(1348);
            if (var5 == null) {
                while (true) {
                    class89 var6 = (class89) this.field4003.method374(1348);
                    if (var6 == null) {
                        if (this.field4008 != 0) {
                            try {
                                this.field4007.field1653 = 0;
                                this.field4007.method753(4, true);
                                this.field4007.method753(this.field4008, true);
                                this.field4007.method751(0, -1044017976);
                                this.field4004.method1827(0, -123, this.field4007.field1681, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4004.method1829((byte) 4);
                                } catch (Exception var9) {
                                }
                                this.field4004 = null;
                                this.field4010++;
                                this.field4011 = -2;
                            }
                        }
                        this.field4006 = 0;
                        this.field4005 = class300.method2048((byte) 18);
                        if (arg2 != -104) {
                            method1700(-2, -103);
                        }
                        return;
                    }
                    this.field4001.method379(var6, 255);
                }
            }
            this.field3975.method379(var5, 255);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIII)V", line = 446)
    public static final void method1697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class39.field633 = 0;
        field3986++;
        for (int var7 = -1; var7 < class31.field520 + class171.field2966; var7++) {
            class301 var8;
            if (var7 == -1) {
                var8 = class122.field2215;
            } else if (class171.field2966 > var7) {
                var8 = class270.field4520[class123.field2233[var7]];
            } else {
                var8 = class204.field3446[class278.field4674[var7 - class171.field2966]];
            }
            if (var8 != null && var8.method289(arg2 + 20970)) {
                if (var8 instanceof class60) {
                    class83 var9 = ((class60) var8).field926;
                    if (var9.field1502 != null) {
                        var9 = var9.method643(true);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class171.field2966) {
                    class83 var15 = ((class60) var8).field926;
                    if (var15.field1502 != null) {
                        var15 = var15.method643(true);
                    }
                    if (var15.field1455 >= 0 && class50.field801.length > var15.field1455) {
                        int var16;
                        if (var15.field1453 == -1) {
                            var16 = var8.method2050(-128) + 15;
                        } else {
                            var16 = var15.field1453 + 15;
                        }
                        class88.method668(var16, arg6 >> 1, arg1, arg0 >> 1, var8, arg5, arg2 + 31713);
                        if (class86.field1533 > -1) {
                            class50.field801[var15.field1455].method285(arg4 + class86.field1533 - 12, arg3 + -30 + class203.field3443);
                        }
                    }
                    class222[] var17 = class149.field2679;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class222 var19 = var17[var18];
                        if (var19 != null && var19.field3712 == 1 && class278.field4674[var7 - class171.field2966] == var19.field3702 && (class90.field1598 % 20) < 10) {
                            int var20;
                            if (var15.field1453 == -1) {
                                var20 = var8.method2050(-111) + 15;
                            } else {
                                var20 = var15.field1453 + 15;
                            }
                            class88.method668(var20, arg6 >> 1, arg1, arg0 >> 1, var8, arg5, 56);
                            if (class86.field1533 > -1) {
                                class251.field4187[var19.field3717].method285(class86.field1533 + arg4 - 12, class203.field3443 + arg3 - 28);
                            }
                        }
                    }
                } else {
                    class39 var10 = (class39) var8;
                    int var11 = 30;
                    if (var10.field618 != -1 || var10.field643 != -1) {
                        class88.method668(var8.method2050(-86) + 15, arg6 >> 1, arg1, arg0 >> 1, var8, arg5, arg2 + 31751);
                        if (class86.field1533 > -1) {
                            if (var10.field618 != -1) {
                                class165.field2924[var10.field618].method285(class86.field1533 + arg4 - 12, arg3 - -class203.field3443 + -var11);
                                var11 += 25;
                            }
                            if (var10.field643 != -1) {
                                class50.field801[var10.field643].method285(class86.field1533 + arg4 - 12, arg3 - -class203.field3443 + -var11);
                                var11 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class222[] var12 = class149.field2679;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            class222 var14 = var12[var13];
                            if (var14 != null && var14.field3712 == 10 && class123.field2233[var7] == var14.field3702) {
                                class88.method668(var8.method2050(-116) + 15, arg6 >> 1, arg1, arg0 >> 1, var8, arg5, 97);
                                if (class86.field1533 > -1) {
                                    class251.field4187[var14.field3717].method285(class86.field1533 + arg4 - 12, arg3 - -class203.field3443 + -var11);
                                }
                            }
                        }
                    }
                }
                if (var8.field5070 != null && (class171.field2966 <= var7 || class263.field4381 == 0 || class263.field4381 == 3 || class263.field4381 == 1 && class283.method1962(((class39) var8).field611, (byte) 125))) {
                    class88.method668(var8.method2050(-110), arg6 >> 1, arg1, arg0 >> 1, var8, arg5, 81);
                    if (class86.field1533 > -1 && class244.field4047 > class39.field633) {
                        class244.field4050[class39.field633] = class207.field3507.method1896(var8.field5070) / 2;
                        class244.field4063[class39.field633] = class207.field3507.field4606;
                        class244.field4058[class39.field633] = class86.field1533;
                        class244.field4059[class39.field633] = class203.field3443;
                        class244.field4054[class39.field633] = var8.field5024;
                        class244.field4049[class39.field633] = var8.field5011;
                        class244.field4064[class39.field633] = var8.field5052;
                        class244.field4061[class39.field633] = var8.field5070;
                        class39.field633++;
                    }
                }
                if (class90.field1598 < var8.field5065) {
                    class71 var21 = class106.field1926[0];
                    class71 var22 = class106.field1926[1];
                    int var26;
                    if (var8 instanceof class60) {
                        class60 var23 = (class60) var8;
                        class71[] var24 = (class71[]) ((class71[]) class136.field2427.method1536((long) var23.field926.field1490, -105));
                        if (var24 == null) {
                            var24 = class39.method290(0, var23.field926.field1490, class35.field577, 0);
                            if (var24 != null) {
                                class136.field2427.method1532((long) var23.field926.field1490, -71, var24);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[1];
                            var21 = var24[0];
                        }
                        class83 var25 = var23.field926;
                        if (var25.field1453 == -1) {
                            var26 = var8.method2050(-103);
                        } else {
                            var26 = var25.field1453;
                        }
                    } else {
                        var26 = var8.method2050(-91);
                    }
                    class88.method668(var26 + var21.field1135 + 10, arg6 >> 1, arg1, arg0 >> 1, var8, arg5, arg2 ^ 0xFFFF8400);
                    if (class86.field1533 > -1) {
                        int var27 = arg4 + class86.field1533 - (var21.field1131 >> 1);
                        int var28 = class203.field3443 + arg3 - 3;
                        var21.method285(var27, var28);
                        int var29 = var8.field5071 * var21.field1131 / 255;
                        int var30 = var21.field1135;
                        if (class117.field2159) {
                            class16.method125(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class316.method2163(var27, var28, var27 + var29, var28 + var30);
                        }
                        var22.method285(var27, var28);
                        if (class117.field2159) {
                            class16.method133(arg4, arg3, arg0 + arg4, arg3 + arg6);
                        } else {
                            class316.method2168(arg4, arg3, arg0 + arg4, arg3 + arg6);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field5044[var31] > class90.field1598) {
                        int var34;
                        if (var8 instanceof class60) {
                            class60 var32 = (class60) var8;
                            class83 var33 = var32.field926;
                            if (var33.field1453 == -1) {
                                var34 = var8.method2050(-101) / 2;
                            } else {
                                var34 = var33.field1453 / 2;
                            }
                        } else {
                            var34 = var8.method2050(-95) / 2;
                        }
                        class88.method668(var34, arg6 >> 1, arg1, arg0 >> 1, var8, arg5, 92);
                        if (class86.field1533 > -1) {
                            if (var31 == 1) {
                                class203.field3443 -= 20;
                            }
                            if (var31 == 2) {
                                class86.field1533 -= 15;
                                class203.field3443 -= 10;
                            }
                            if (var31 == 3) {
                                class203.field3443 -= 10;
                                class86.field1533 += 15;
                            }
                            class213.field3579[var8.field5045[var31]].method285(class86.field1533 + arg4 - 12, class203.field3443 + arg3 + -12);
                            class268.field4487.method1884(class156.method1212(arg2 + 31642, var8.field5005[var31]), class86.field1533 + arg4 - 1, arg3 - -class203.field3443 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg2 != -31632) {
            field3982 = 85;
        }
        for (int var35 = 0; var35 < class39.field633; var35++) {
            int var36 = class244.field4058[var35];
            int var37 = class244.field4059[var35];
            int var38 = class244.field4050[var35];
            int var39 = class244.field4063[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((class244.field4059[var41] - class244.field4063[var41]) < (var37 + 2) && (class244.field4059[var41] + 2) > (var37 - var39) && var36 - var38 < class244.field4058[var41] + class244.field4050[var41] && (class244.field4058[var41] - class244.field4050[var41]) < (var36 + var38) && var37 > class244.field4059[var41] - class244.field4063[var41]) {
                        var37 = class244.field4059[var41] - class244.field4063[var41];
                        var40 = true;
                    }
                }
            }
            class86.field1533 = class244.field4058[var35];
            class203.field3443 = class244.field4059[var35] = var37;
            class162 var42 = class244.field4061[var35];
            if (class138.field2473 == 0) {
                int var43 = 16776960;
                if (class244.field4054[var35] < 6) {
                    var43 = class22.field344[class244.field4054[var35]];
                }
                if (class244.field4054[var35] == 6) {
                    var43 = class279.field4702 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class244.field4054[var35] == 7) {
                    var43 = class279.field4702 % 20 >= 10 ? 65535 : 255;
                }
                if (class244.field4054[var35] == 8) {
                    var43 = (class279.field4702 % 20) < 10 ? 45056 : 8454016;
                }
                if (class244.field4054[var35] == 9) {
                    int var44 = 150 - class244.field4064[var35];
                    if (var44 < 50) {
                        var43 = (var44 * 1280) + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16384000 + 16776960 - (var44 * 327680);
                    } else if (var44 < 150) {
                        var43 = var44 * 5 + 64780;
                    }
                }
                if (class244.field4054[var35] == 10) {
                    int var45 = 150 - class244.field4064[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - ((var45 - 50) * 327680);
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 - (32768000 - (255 - (var45 - 100) * 5));
                    }
                }
                if (class244.field4054[var35] == 11) {
                    int var46 = 150 - class244.field4064[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = var46 * 327685 - 16318970;
                    } else if (var46 < 150) {
                        var43 = 16777215 - ((var46 - 100) * 327680);
                    }
                }
                if (class244.field4049[var35] == 0) {
                    class207.field3507.method1884(var42, class86.field1533 + arg4, arg3 - -class203.field3443, var43, 0);
                }
                if (class244.field4049[var35] == 1) {
                    class207.field3507.method1885(var42, class86.field1533 + arg4, class203.field3443 + arg3, var43, 0, class279.field4702);
                }
                if (class244.field4049[var35] == 2) {
                    class207.field3507.method1878(var42, class86.field1533 + arg4, class203.field3443 + arg3, var43, 0, class279.field4702);
                }
                if (class244.field4049[var35] == 3) {
                    class207.field3507.method1891(var42, arg4 + class86.field1533, class203.field3443 + arg3, var43, 0, class279.field4702, 150 - class244.field4064[var35]);
                }
                if (class244.field4049[var35] == 4) {
                    int var47 = (150 - class244.field4064[var35]) * (class207.field3507.method1896(var42) + 100) / 150;
                    if (class117.field2159) {
                        class16.method125(class86.field1533 + arg4 - 50, arg3, class86.field1533 + arg4 + 50, arg3 + arg6);
                    } else {
                        class316.method2163(arg4 + class86.field1533 - 50, arg3, arg4 + class86.field1533 + 50, arg3 + arg6);
                    }
                    class207.field3507.method1881(var42, class86.field1533 + arg4 + 50 - var47, class203.field3443 + arg3, var43, 0);
                    if (class117.field2159) {
                        class16.method133(arg4, arg3, arg0 + arg4, arg3 - -arg6);
                    } else {
                        class316.method2168(arg4, arg3, arg0 + arg4, arg3 - -arg6);
                    }
                }
                if (class244.field4049[var35] == 5) {
                    int var48 = 150 - class244.field4064[var35];
                    if (class117.field2159) {
                        class16.method125(arg4, arg3 + class203.field3443 + (-class207.field3507.field4606 - 1), arg4 - -arg0, class203.field3443 + arg3 + 5);
                    } else {
                        class316.method2163(arg4, arg3 + class203.field3443 - class207.field3507.field4606 - 1, arg0 + arg4, class203.field3443 + arg3 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class207.field3507.method1884(var42, class86.field1533 + arg4, class203.field3443 + arg3 - -var49, var43, 0);
                    if (class117.field2159) {
                        class16.method133(arg4, arg3, arg0 + arg4, arg3 + arg6);
                    } else {
                        class316.method2168(arg4, arg3, arg4 + arg0, arg3 - -arg6);
                    }
                }
            } else {
                class207.field3507.method1884(var42, class86.field1533 + arg4, class203.field3443 + arg3, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 934)
    public final void method1698(byte arg0) {
        if (arg0 > -88) {
            this.field4004 = (class267) null;
        }
        field3985++;
        if (this.field4004 == null) {
            return;
        }
        try {
            this.field4007.field1653 = 0;
            this.field4007.method753(7, true);
            this.field4007.method740(28918, 0);
            this.field4004.method1827(0, 42, this.field4007.field1681, 4);
        } catch (IOException var5) {
            try {
                this.field4004.method1829((byte) 4);
            } catch (Exception var4) {
            }
            this.field4011 = -2;
            this.field4010++;
            this.field4004 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)V", line = 963)
    public final void method1699(int arg0) {
        if (this.field4004 != null) {
            this.field4004.method1831(56);
        }
        if (arg0 > -101) {
            this.method1709(9);
        }
        field3988++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Lka;", line = 977)
    public static final class217 method1700(int arg0, int arg1) {
        field3991++;
        class217 var2 = (class217) class84.field1504.method1382((byte) -122, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 71) {
            field3999 = (class162) null;
        }
        byte[] var3 = class168.field2949.method1128(arg0, 0, 5);
        class217 var4 = new class217();
        if (var3 != null) {
            var4.method1574(-86, new class94(var3));
        }
        class84.field1504.method1386(var4, -83, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)Z", line = 1010)
    public final boolean method1701(int arg0) {
        if (arg0 <= 107) {
            this.field4009 = (class94) null;
        }
        field3980++;
        return this.method1703(112) >= 20;
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(I)V", line = 1024)
    public static final void method1702(int arg0) {
        int var1 = class173.field3003;
        field3994++;
        int var2 = class194.field3273 - class251.field4201 - var1;
        int var3 = class110.field1999;
        if (arg0 != 0) {
            return;
        }
        int var4 = class212.field3562 - class252.field4205 - var3;
        if (var1 <= 0 && var2 <= 0 && var3 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class168.field2950 != null) {
                var5 = class168.field2950;
            } else if (class95.field1740 == null) {
                var5 = client.field1903.field469;
            } else {
                var5 = class95.field1740;
            }
            int var6 = 0;
            int var7 = 0;
            if (class95.field1740 == var5) {
                Insets var8 = class95.field1740.getInsets();
                var6 = var8.top;
                var7 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var6, var1, class212.field3562);
            }
            if (var3 > 0) {
                var9.fillRect(var7, var6, class194.field3273, var3);
            }
            if (var2 > 0) {
                var9.fillRect(class194.field3273 + var7 - var2, var6, var2, class212.field3562);
            }
            if (var4 > 0) {
                var9.fillRect(var7, var6 + class212.field3562 - var4, class194.field3273, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "(I)I", line = 1089)
    public final int method1703(int arg0) {
        if (arg0 <= 100) {
            this.field3975 = (class53) null;
        }
        field3981++;
        return this.field3975.method380((byte) -23) + this.field3996.method380((byte) -116);
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(B)V", line = 1101)
    public final void method1704(byte arg0) {
        try {
            this.field4004.method1829((byte) 4);
            if (arg0 != 47) {
                this.field4009 = (class94) null;
            }
        } catch (Exception var3) {
        }
        this.field4010++;
        field3976++;
        this.field4004 = null;
        this.field4011 = -1;
        this.field4008 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!em", name = "g", descriptor = "(I)V", line = 1120)
    public static void method1705(int arg0) {
        field4000 = null;
        field4002 = null;
        field3999 = null;
        if (arg0 != 6828) {
            field3999 = (class162) null;
        }
        field3998 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)V", line = 1134)
    public final void method1706(int arg0, boolean arg1) {
        if (arg0 != -19181) {
            method1705(-53);
        }
        field3993++;
        if (this.field4004 == null) {
            return;
        }
        try {
            this.field4007.field1653 = 0;
            this.field4007.method753(arg1 ? 2 : 3, true);
            this.field4007.method740(arg0 + 48099, 0);
            this.field4004.method1827(0, 56, this.field4007.field1681, 4);
        } catch (IOException var6) {
            try {
                this.field4004.method1829((byte) 4);
            } catch (Exception var5) {
            }
            this.field4004 = null;
            this.field4011 = -2;
            this.field4010++;
        }
    }

    @OriginalMember(owner = "client!em", name = "h", descriptor = "(I)V", line = 1161)
    public final void method1707(int arg0) {
        field3992++;
        if (arg0 == 16776960 && this.field4004 != null) {
            this.field4004.method1829((byte) 4);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIILdj;)V", line = 1177)
    public static final void method1708(int arg0, int arg1, int arg2, int arg3, class39 arg4) {
        field3979++;
        if (class122.field2215 == arg4 || class293.field4931 >= 400) {
            return;
        }
        class162 var10;
        if (~arg4.field612 == arg0) {
            boolean var5 = true;
            if (class122.field2215.field624 != -1 && arg4.field624 != -1) {
                int var6 = arg4.field624 > class122.field2215.field624 ? class122.field2215.field624 : arg4.field624;
                int var7 = arg4.field642 < class122.field2215.field642 ? class122.field2215.field642 : arg4.field642;
                int var8 = var7 * 10 / 100 + var6 + 5;
                int var9 = class122.field2215.field642 - arg4.field642;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var9 > var8) {
                    var5 = false;
                }
            }
            if (arg4.field642 < arg4.field631) {
                var10 = class135.method1062(new class162[] { arg4.method292(0), var5 ? class128.method1032(class122.field2215.field642, arg4.field642, (byte) -73) : class80.field1401, class257.field4263, class216.field3605, class156.method1212(10, arg4.field642), class280.field4717, class156.method1212(10, arg4.field631 - arg4.field642), class258.field4297 }, true);
            } else {
                var10 = class135.method1062(new class162[] { arg4.method292(0), var5 ? class128.method1032(class122.field2215.field642, arg4.field642, (byte) 100) : class80.field1401, class257.field4263, class216.field3605, class156.method1212(10, arg4.field642), class258.field4297 }, true);
            }
        } else {
            var10 = class135.method1062(new class162[] { arg4.method292(0), class257.field4263, class315.field5325, class156.method1212(10, arg4.field612), class258.field4297 }, true);
        }
        if (class148.field2674 == 1) {
            class143.method1143((long) arg3, (short) 35, 10015, arg2, arg1, class267.field4443, class135.method1062(new class162[] { class190.field3246, class266.field4433, var10 }, true));
            class224.field3746++;
        } else if (!class13.field213) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class262.field4369[var11] != null) {
                    class151.field2708++;
                    short var12 = 0;
                    if (class53.field841 == 0 && class262.field4369[var11].method1282(class154.field2725, 53)) {
                        if (class122.field2215.field642 < arg4.field642) {
                            var12 = 2000;
                        }
                        if (class122.field2215.field636 != 0 && arg4.field636 != 0) {
                            if (class122.field2215.field636 == arg4.field636) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class286.field4818[var11]) {
                        var12 = 2000;
                    }
                    boolean var13 = false;
                    short var14 = class6.field55[var11];
                    short var15 = (short) (var12 + var14);
                    class143.method1143((long) arg3, var15, 10015, arg2, arg1, class262.field4369[var11], class135.method1062(new class162[] { class80.field1401, var10 }, true));
                }
            }
        } else if ((class60.field930 & 0x8) == 8) {
            class259.field4316++;
            class143.method1143((long) arg3, (short) 45, 10015, arg2, arg1, class245.field4074, class135.method1062(new class162[] { class243.field4042, class266.field4433, var10 }, true));
        }
        for (int var16 = 0; var16 < class293.field4931; var16++) {
            if (class105.field1911[var16] == 18) {
                class31.field516[var16] = class135.method1062(new class162[] { class80.field1401, var10 }, true);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "i", descriptor = "(I)V", line = 1308)
    private final void method1709(int arg0) {
        field3983++;
        if (this.field4004 == null) {
            return;
        }
        try {
            if (arg0 != 2) {
                this.method1695(60);
            }
            this.field4007.field1653 = 0;
            this.field4007.method753(6, true);
            this.field4007.method740(arg0 + 28916, 3);
            this.field4004.method1827(0, 86, this.field4007.field1681, 4);
        } catch (IOException var5) {
            try {
                this.field4004.method1829((byte) 4);
            } catch (Exception var4) {
            }
            this.field4011 = -2;
            this.field4010++;
            this.field4004 = null;
        }
    }
}
