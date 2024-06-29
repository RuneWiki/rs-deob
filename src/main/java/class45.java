import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class45 {

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lkh;")
    private class13 field578 = new class13(64);

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Lkh;")
    public class13 field579 = new class13(50);

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Ljj;")
    public class77 field587 = new class77(250);

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Lpv;")
    private class52 field588 = new class52();

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lul;")
    private class406 field570;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Lul;")
    public class406 field572;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Z")
    private boolean field566;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "Lcc;")
    private class516 field589;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "[Ljava/lang/String;")
    private String[] field592;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field590;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lhn;")
    public static class509 field569 = new class509(93, 12);

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Z")
    public static boolean field580 = false;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field581 = 0;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Lqu;")
    public static class65 field586 = new class65(7, 0, 1, 1);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Lla;")
    public static class317 field585;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "[Lkc;")
    public static class89[] field583;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 10)
    public final void method459(int arg0) {
        field575++;
        class77 var2 = this.field587;
        synchronized (this.field587) {
            int var3 = 75 % ((arg0 - 34) / 60);
            this.field587.method665(-18632);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V", line = 23)
    public final void method460(int arg0, int arg1) {
        class13 var3 = this.field578;
        synchronized (this.field578) {
            this.field578.method91(96, arg0);
        }
        field563++;
        class13 var4 = this.field579;
        synchronized (this.field579) {
            this.field579.method91(62, arg0);
        }
        if (arg1 <= 108) {
            this.method459(19);
        }
        class77 var5 = this.field587;
        synchronized (this.field587) {
            this.field587.method661(arg0, 2047);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZ)V", line = 42)
    public final void method461(byte arg0, boolean arg1) {
        field562++;
        if (arg1 != this.field566) {
            this.field566 = arg1;
            if (arg0 < -38) {
                this.method470(-83);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 59)
    public final void method462(int arg0) {
        field568++;
        class13 var2 = this.field579;
        synchronized (this.field579) {
            this.field579.method93((byte) 91);
        }
        if (arg0 < 6) {
            this.method463(null, 16, 4, null, null, 123, 85, true, false, null, -45, 99);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lya;IILya;Led;IIZZLla;II)Ll;", line = 72)
    public final class16 method463(class38 arg0, int arg1, int arg2, class38 arg3, class500 arg4, int arg5, int arg6, boolean arg7, boolean arg8, class317 arg9, int arg10, int arg11) {
        field567++;
        class16 var13 = this.method468(arg1, arg4, arg2, arg6, -121, arg11, arg5, arg3);
        if (var13 != null) {
            return var13;
        }
        class532 var14 = this.method467((byte) -101, arg5);
        if (arg1 > 1 && var14.field7793 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field7792[var16] <= arg1 && var14.field7792[var16] != 0) {
                    var15 = var14.field7793[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method467((byte) -101, var15);
            }
        }
        int[] var17 = var14.method3163(arg0, arg9, 768, arg2, arg6, arg4, arg3, arg8, arg11, arg1);
        if (var17 == null) {
            return null;
        } else if (arg10 == -13294) {
            class16 var18;
            if (arg7) {
                var18 = arg0.method350(var17, 0, 36, 36, 32);
            } else {
                var18 = arg3.method350(var17, 0, 36, 36, 32);
            }
            if (!arg7) {
                class52 var19 = new class52();
                var19.field652 = arg3.field510;
                var19.field647 = arg2;
                var19.field645 = arg4 != null;
                var19.field648 = arg11;
                var19.field646 = arg1;
                var19.field641 = arg5;
                var19.field642 = arg6;
                this.field587.method664(var19, var18, 19635);
            }
            return var18;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V", line = 141)
    public final void method464(int arg0) {
        class13 var2 = this.field578;
        synchronized (this.field578) {
            this.field578.method88(94);
        }
        field576++;
        class13 var3 = this.field579;
        synchronized (this.field579) {
            this.field579.method88(114);
        }
        class77 var4 = this.field587;
        synchronized (this.field587) {
            this.field587.method658((byte) -125);
        }
        if (arg0 <= 89) {
            this.field592 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIZI)V", line = 160)
    public static final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (!arg7) {
            method465(-74, 66, 91, 123, -74, -71, 11, false, -63);
        }
        field577++;
        if (arg6 < 1 || arg0 < 1 || class69.field976 - 2 < arg6 || arg0 > class285.field4328 - 2) {
            return;
        }
        int var9 = arg2;
        if (arg2 < 3 && class385.method2406(-17064, arg6, arg0)) {
            var9 = arg2 + 1;
        }
        if (!class193.field3258.method938(class96.field1384, -101) && !class408.method2570(false, arg6, var9, class61.field726, arg0)) {
            return;
        }
        if (client.field3311 == null) {
            return;
        }
        class356.field5279.method1572(arg6, class377.field5692, arg2, arg0, arg8, class184.field2758[arg2], 2);
        if (arg5 < 0) {
            return;
        }
        boolean var10 = class193.field3258.field7224;
        class193.field3258.field7224 = true;
        class356.field5279.method1578(arg1, arg4, var9, arg3, class184.field2758[arg2], arg0, class377.field5692, arg6, (byte) 102, arg5, arg2);
        class193.field3258.field7224 = var10;
        return;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V", line = 206)
    public static final void method466(int arg0) {
        field582++;
        if (class350.field5176 > 1) {
            class127.field1857 = class152.field2263;
            class350.field5176--;
        }
        if (class364.field5382 > 0) {
            class364.field5382--;
        }
        if (class191.field3222) {
            class191.field3222 = false;
            class421.method2625(arg0 ^ 0xFFFFFFA2);
            return;
        }
        if (!class307.field4631) {
            class161.method1096(15036);
        }
        for (int var1 = 0; var1 < 100 && class514.method3044(-93); var1++) {
        }
        if (class429.field6373 != 9) {
            return;
        }
        class356.method2236(class325.field4891.method3103(arg0 ^ 0x20000002), class71.field1020, arg0 ^ arg0);
        if (class304.field4595 == null) {
            if (class94.field1329 <= class493.method2937(-63)) {
                class304.field4595 = class207.field3396.method2921(class283.field4310.field6311, 16);
            }
        } else if (class304.field4595.field6493 != -1) {
            class74.method640(-29627, class521.field7623);
            class71.field1020.method1542(class304.field4595.field6493, -2756);
            class304.field4595 = null;
            class94.field1329 = class493.method2937(-123) + 30000L;
        }
        class28 var2 = (class28) class102.field1459.method1004((byte) -111);
        if (var2 != null || class283.field4306 < (class493.method2937(-64) - 2000L)) {
            boolean var3 = false;
            int var4 = class71.field1020.field3556;
            for (class28 var5 = (class28) class389.field5839.method1004((byte) -96); var5 != null && (class71.field1020.field3556 - var4) < 240; var5 = (class28) class389.field5839.method996(1)) {
                var5.method2677(-22491);
                int var6 = var5.method194(arg0 + 2168);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method195((byte) 113);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method194(2170) == -1 && var5.method195((byte) 90) == -1) {
                    var8 = true;
                    var7 = -1;
                    var6 = -1;
                }
                if (class474.field6843 != var7 || class186.field2823 != var6) {
                    if (!var3) {
                        class154.field2288++;
                        class74.method640(arg0 - 29629, class319.field4811);
                        class71.field1020.method1545(0, arg0 - 104);
                        var3 = true;
                        var4 = class71.field1020.field3556;
                    }
                    int var9 = var7 - class474.field6843;
                    class474.field6843 = var7;
                    int var10 = var6 - class186.field2823;
                    class186.field2823 = var6;
                    int var11 = (int) ((var5.method192(13) - class283.field4306) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var10 += 32;
                        var9 += 32;
                        class71.field1020.method1542((var11 << 12) + (var9 << 6) + var10, -2756);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var10 += 128;
                        class71.field1020.method1545(var11 + 128, arg0 + -50);
                        var9 += 128;
                        class71.field1020.method1542((var9 << 8) + var10, -2756);
                    } else if (var11 >= 32) {
                        class71.field1020.method1542(var11 + 57344, arg0 + -2758);
                        if (var8) {
                            class71.field1020.method1566(true, Integer.MIN_VALUE);
                        } else {
                            class71.field1020.method1566(true, var6 << 16 | var7);
                        }
                    } else {
                        class71.field1020.method1545(var11 + 192, arg0 ^ 0xFFFFFFB4);
                        if (var8) {
                            class71.field1020.method1566(true, Integer.MIN_VALUE);
                        } else {
                            class71.field1020.method1566(true, var7 | var6 << 16);
                        }
                    }
                    class283.field4306 = var5.method192(13);
                }
            }
            if (var3) {
                class71.field1020.method1513(class71.field1020.field3556 - var4, (byte) 107);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method192(13) - class308.field4652) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class308.field4652 = var2.method192(13);
            int var14 = var2.method194(arg0 + 2168);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method195((byte) 80);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method190(arg0 ^ 0xFF0002) == 2) {
                var16 = 1;
            }
            class74.method640(-29627, class482.field6930);
            int var17 = (int) var12;
            class96.field1377++;
            class71.field1020.method1508(-128, var17 | var16 << 15);
            class71.field1020.method1566(true, var14 << 16 | var15);
        }
        if (class68.field877 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class68.field877; var19++) {
                if (class457.field6655[var19].method1214(true)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class169.field2502++;
                if (var18 > 75) {
                    var18 = 75;
                }
                class74.method640(arg0 ^ 0xFFFF8C47, class65.field848);
                class71.field1020.method1545(var18 * 3, -59);
                for (int var20 = 0; var20 < class68.field877; var20++) {
                    class183 var21 = class457.field6655[var20];
                    if (var21.method1214(true)) {
                        long var22 = (var21.method1216(false) - class22.field269) / 50L;
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class22.field269 = var21.method1216(false);
                        class71.field1020.method1545(var21.method1215((byte) -125), -60);
                        class71.field1020.method1542((int) var22, -2756);
                    }
                }
            }
        }
        if (class401.field5961 > 0) {
            class401.field5961--;
        }
        if (class471.field6814 && class401.field5961 <= 0) {
            class401.field5961 = 20;
            class471.field6814 = false;
            class155.field2297++;
            class74.method640(-29627, class267.field4088);
            class71.field1020.method1542((int) class473.field6830 >> 3, arg0 ^ 0xFFFFF53E);
            class71.field1020.method1542((int) class181.field2711 >> 3, -2756);
        }
        if (class190.field3215 && !class470.field6792) {
            class470.field6792 = true;
            class261.field4001++;
            class74.method640(-29627, class482.field6935);
            class71.field1020.method1545(1, -110);
        }
        if (!class190.field3215 && class470.field6792) {
            class261.field4001++;
            class470.field6792 = false;
            class74.method640(-29627, class482.field6935);
            class71.field1020.method1545(0, arg0 - 90);
        }
        if (!class360.field5348) {
            class74.method640(-29627, class213.field3480);
            class88.field1263++;
            class71.field1020.method1545(0, -60);
            int var24 = class71.field1020.field3556;
            class217 var25 = class193.field3258.method932(-1784);
            class71.field1020.method1516(var25.field3572, arg0 ^ 0x68C0, var25.field3556, 0);
            class71.field1020.method1513(class71.field1020.field3556 - var24, (byte) 107);
            class360.field5348 = true;
        }
        if (client.field3311 != null) {
            if (class176.field2611 == 2) {
                class467.method2823(1024);
            } else if (class176.field2611 == 3) {
                class226.method1606(3);
            }
        }
        if (class440.field6454) {
            class440.field6454 = false;
        } else {
            class52.field654 /= 2.0F;
        }
        if (class443.field6518) {
            class443.field6518 = false;
        } else {
            class345.field5107 /= 2.0F;
        }
        class9.method67(-1);
        if (class429.field6373 != 9) {
            return;
        }
        class239.method1649(false);
        class180.method1201((byte) -116);
        class275.method1808((byte) 55);
        class200.method1398(arg0 ^ 0x77);
        class119.field1801++;
        if (class119.field1801 > 750) {
            class421.method2625(arg0 - 8);
            return;
        }
        class231.method1626(0);
        class519.method3090(42);
        class244.method1662(arg0 - 75);
        for (int var26 = class195.field3271.method2136((byte) -128, true); var26 != -1; var26 = class195.field3271.method2136((byte) -124, false)) {
            class256.method1706(var26, (byte) 65);
            class219.field3594[class74.method644(31, class112.field1568++)] = var26;
        }
        for (class211 var27 = class118.method887(arg0 ^ 0x2); var27 != null; var27 = class118.method887(0)) {
            int var28 = var27.method1461(true);
            int var29 = var27.method1466(114);
            if (var28 == 1) {
                class505.field7385[var29] = var27.field3441;
                class73.field1045 |= class256.field3922[var29];
                class525.field7689[class74.method644(31, class359.field5332++)] = var29;
            } else if (var28 == 2) {
                class521.field7625[var29] = var27.field3445;
                class65.field846[class74.method644(class167.field2465++, 31)] = var29;
            } else if (var28 == 3) {
                class114 var30 = class475.method2864(true, var29);
                if (!var27.field3445.equals(var30.field1652)) {
                    var30.field1652 = var27.field3445;
                    class262.method1747(arg0 + 20554, var30);
                }
            } else if (var28 == 4) {
                class114 var31 = class475.method2864(true, var29);
                int var32 = var27.field3441;
                int var33 = var27.field3440;
                int var34 = var27.field3446;
                if (var31.field1681 != var32 || var31.field1732 != var33 || var31.field1741 != var34) {
                    var31.field1732 = var33;
                    var31.field1741 = var34;
                    var31.field1681 = var32;
                    class262.method1747(20556, var31);
                }
            } else if (var28 == 5) {
                class114 var35 = class475.method2864(true, var29);
                if (var27.field3441 != var35.field1661 || var27.field3441 == -1) {
                    var35.field1695 = 0;
                    var35.field1693 = 1;
                    var35.field1661 = var27.field3441;
                    var35.field1699 = 0;
                    class262.method1747(20556, var35);
                }
            } else if (var28 == 6) {
                int var46 = var27.field3441;
                int var47 = (var46 & 0x7FF2) >> 10;
                int var48 = var46 >> 5 & 0x1F;
                int var49 = var46 & 0x1F;
                int var50 = (var47 << 19) + (var48 << 11) + (var49 << 3);
                class114 var51 = class475.method2864(true, var29);
                if (var51.field1715 != var50) {
                    var51.field1715 = var50;
                    class262.method1747(arg0 ^ 0x504E, var51);
                }
            } else if (var28 == 7) {
                class114 var36 = class475.method2864(true, var29);
                boolean var37 = var27.field3441 == 1;
                if (var36.field1610 != var37) {
                    var36.field1610 = var37;
                    class262.method1747(20556, var36);
                }
            } else if (var28 == 8) {
                class114 var38 = class475.method2864(true, var29);
                if (var27.field3441 != var38.field1702 || var27.field3440 != var38.field1674 || var27.field3446 != var38.field1673) {
                    var38.field1673 = var27.field3446;
                    var38.field1674 = var27.field3440;
                    var38.field1702 = var27.field3441;
                    if (var38.field1670 != -1) {
                        if (var38.field1631 > 0) {
                            var38.field1673 = var38.field1673 * 32 / var38.field1631;
                        } else if (var38.field1641 > 0) {
                            var38.field1673 = var38.field1673 * 32 / var38.field1641;
                        }
                    }
                    class262.method1747(arg0 + 20554, var38);
                }
            } else if (var28 == 9) {
                class114 var39 = class475.method2864(true, var29);
                if (var27.field3441 != var39.field1670 || var27.field3440 != var39.field1621) {
                    var39.field1670 = var27.field3441;
                    var39.field1621 = var27.field3440;
                    class262.method1747(20556, var39);
                }
            } else if (var28 == 10) {
                class114 var45 = class475.method2864(true, var29);
                if (var27.field3441 != var45.field1686 || var27.field3440 != var45.field1666 || var27.field3446 != var45.field1657) {
                    var45.field1666 = var27.field3440;
                    var45.field1657 = var27.field3446;
                    var45.field1686 = var27.field3441;
                    class262.method1747(arg0 + 20554, var45);
                }
            } else if (var28 == 11) {
                class114 var44 = class475.method2864(true, var29);
                var44.field1704 = 0;
                var44.field1646 = var44.field1593 = var27.field3441;
                var44.field1625 = 0;
                var44.field1701 = var44.field1611 = var27.field3440;
                class262.method1747(20556, var44);
            } else if (var28 == 12) {
                class114 var40 = class475.method2864(true, var29);
                int var41 = var27.field3441;
                if (var40 != null && var40.field1585 == 0) {
                    if (var40.field1709 - var40.field1627 < var41) {
                        var41 = var40.field1709 - var40.field1627;
                    }
                    if (var41 < 0) {
                        var41 = 0;
                    }
                    if (var40.field1735 != var41) {
                        var40.field1735 = var41;
                        class262.method1747(20556, var40);
                    }
                }
            } else if (var28 == 14) {
                class114 var42 = class475.method2864(true, var29);
                var42.field1624 = var27.field3441;
            } else if (var28 == 15) {
                class532.field7839 = true;
                class523.field7652 = var27.field3440;
                class114.field1692 = var27.field3441;
            } else if (var28 == 16) {
                class114 var43 = class475.method2864(true, var29);
                var43.field1730 = var27.field3441;
            }
        }
        class295.field4496++;
        if (class407.field6061 != 0) {
            class363.field5374 += 20;
            if (class363.field5374 >= 400) {
                class407.field6061 = 0;
            }
        }
        if (class511.field7464 != null) {
            class197.field3287++;
            if (class197.field3287 >= 15) {
                class262.method1747(20556, class511.field7464);
                class511.field7464 = null;
            }
        }
        class483.field6957 = false;
        class401.field5962 = null;
        class313.field4712 = null;
        class139.field2127 = false;
        class180.method1202(false, null, -1, -1);
        class183.method1222(null, -1, 0, -1);
        if (!class245.field3859) {
            class287.field4348 = -1;
        }
        class511.method3038(0);
        class152.field2263++;
        if (class406.field6044) {
            class74.method640(-29627, class27.field327);
            class86.field1242++;
            class71.field1020.method1537((byte) -29, class76.field1101 | class66.field859 << 28 | class25.field316 << 14);
            class406.field6044 = false;
        }
        while (true) {
            class405 var52;
            class114 var53;
            class114 var54;
            do {
                var52 = (class405) class459.field6677.method1001(arg0 ^ 0xFFFFC0E5);
                if (var52 == null) {
                    while (true) {
                        class405 var55;
                        class114 var56;
                        class114 var57;
                        do {
                            var55 = (class405) class255.field3905.method1001(-16153);
                            if (var55 == null) {
                                while (true) {
                                    class405 var58;
                                    class114 var59;
                                    class114 var60;
                                    do {
                                        var58 = (class405) class186.field2821.method1001(-16153);
                                        if (var58 == null) {
                                            if (class401.field5962 == null) {
                                                class76.field1102 = 0;
                                            }
                                            if (class116.field1752 != null) {
                                                class518.method3068((byte) -121);
                                            }
                                            if (class417.field6224 > 0 && class101.field1456.method1045(82, (byte) -66) && class101.field1456.method1045(81, (byte) -91) && class333.field4974 != 0) {
                                                int var61 = class398.field5947.field5826 - class333.field4974;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class357.method2245(false, var61, class398.field5947.field1976[0] + class176.field2613, class398.field5947.field1978[0] + class390.field5842);
                                            }
                                            class436.method2698(false);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class432.field6405[var62]++;
                                            }
                                            if (class73.field1045 && class341.field5071 < class493.method2937(arg0 ^ -108) - 60000L) {
                                                class160.method1094(arg0 ^ 0xFFFFFFC0);
                                            }
                                            for (class160 var63 = (class160) class353.field5232.method1958(arg0 ^ 0x16); var63 != null; var63 = (class160) class353.field5232.method1961(arg0 ^ 0xFFFFFF96)) {
                                                if (((long) var63.field2390) < (class493.method2937(-94) / 1000L - 5L)) {
                                                    if (var63.field2394 > 0) {
                                                        class475.method2854(var63.field2391 + class229.field3720.method1635(class224.field3673, (byte) 127), 0, "", -128, "", 5);
                                                    }
                                                    if (var63.field2394 == 0) {
                                                        class475.method2854(var63.field2391 + class315.field4751.method1635(class224.field3673, (byte) -28), 0, "", -128, "", 5);
                                                    }
                                                    var63.method526((byte) -95);
                                                }
                                            }
                                            class525.field7688++;
                                            if (class525.field7688 > 500) {
                                                class525.field7688 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class428.field6372 += class450.field6578;
                                                }
                                                if ((var64 & 0x4) == 4) {
                                                    class282.field4294 += class358.field5317;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class40.field541 += class215.field3489;
                                                }
                                            }
                                            if (class428.field6372 < -50) {
                                                class450.field6578 = 2;
                                            }
                                            if (class40.field541 < -55) {
                                                class215.field3489 = 2;
                                            }
                                            if (class428.field6372 > 50) {
                                                class450.field6578 = -2;
                                            }
                                            if (class282.field4294 < -40) {
                                                class358.field5317 = 1;
                                            }
                                            if (class40.field541 > 55) {
                                                class215.field3489 = -2;
                                            }
                                            if (class282.field4294 > 40) {
                                                class358.field5317 = -1;
                                            }
                                            class179.field2698++;
                                            if (class179.field2698 > 500) {
                                                class179.field2698 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x1) == 1) {
                                                    class162.field2414 += class472.field6823;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class4.field23 += class420.field6266;
                                                }
                                            }
                                            if (class162.field2414 < -60) {
                                                class472.field6823 = 2;
                                            }
                                            if (class4.field23 < -20) {
                                                class420.field6266 = 1;
                                            }
                                            if (class162.field2414 > 60) {
                                                class472.field6823 = -2;
                                            }
                                            if (class4.field23 > 10) {
                                                class420.field6266 = -1;
                                            }
                                            class345.field5101++;
                                            if (class345.field5101 > 50) {
                                                class498.field7161++;
                                                class74.method640(-29627, class186.field2822);
                                            }
                                            if (class74.field1061) {
                                                class249.method1680(2783);
                                                class74.field1061 = false;
                                            }
                                            try {
                                                if (class162.field2413 != null && class71.field1020.field3556 > 0) {
                                                    class82.field1195 += class71.field1020.field3556;
                                                    class162.field2413.method1969(class71.field1020.field3572, 0, (byte) 108, class71.field1020.field3556);
                                                    class71.field1020.field3556 = 0;
                                                    class345.field5101 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class421.method2625(arg0 ^ 0xFFFFFFF8);
                                                return;
                                            }
                                        }
                                        var59 = var58.field6004;
                                        if (var59.field1630 < 0) {
                                            break;
                                        }
                                        var60 = class475.method2864(true, var59.field1700);
                                    } while (var60 == null || var60.field1660 == null || var60.field1660.length <= var59.field1630 || var60.field1660[var59.field1630] != var59);
                                    class192.method1356(var58);
                                }
                            }
                            var56 = var55.field6004;
                            if (var56.field1630 < 0) {
                                break;
                            }
                            var57 = class475.method2864(true, var56.field1700);
                        } while (var57 == null || var57.field1660 == null || var56.field1630 >= var57.field1660.length || var57.field1660[var56.field1630] != var56);
                        class192.method1356(var55);
                    }
                }
                var53 = var52.field6004;
                if (var53.field1630 < 0) {
                    break;
                }
                var54 = class475.method2864(true, var53.field1700);
            } while (var54 == null || var54.field1660 == null || var53.field1630 >= var54.field1660.length || var54.field1660[var53.field1630] != var53);
            class192.method1356(var52);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)Llo;", line = 1079)
    public final class532 method467(byte arg0, int arg1) {
        field565++;
        class13 var3 = this.field578;
        class532 var4;
        synchronized (this.field578) {
            var4 = (class532) this.field578.method87((long) arg1, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field570;
        byte[] var6;
        synchronized (this.field570) {
            var6 = this.field570.method2536(class157.method1081((byte) 108, arg1), 0, class227.method1610(arg1, arg0 + 356));
        }
        if (arg0 != -101) {
            this.method463(null, -11, 100, null, null, 66, 32, true, true, null, 25, -102);
        }
        class532 var7 = new class532();
        var7.field7836 = this;
        var7.field7778 = arg1;
        var7.field7767 = new String[] { null, null, class349.field5161.method1635(this.field574, (byte) -86), null, null };
        var7.field7783 = new String[] { null, null, null, null, class171.field2543.method1635(this.field574, (byte) 121) };
        if (var6 != null) {
            var7.method3160((byte) 68, new class217(var6));
        }
        var7.method3157((byte) 86);
        if (var7.field7833 != -1) {
            var7.method3147(this.method467((byte) -101, var7.field7833), (byte) 62, this.method467((byte) -101, var7.field7764));
        }
        if (var7.field7816 != -1) {
            var7.method3153(this.method467((byte) -101, var7.field7795), this.method467((byte) -101, var7.field7816), -23892);
        }
        if (!this.field566 && var7.field7807) {
            var7.field7806 = class396.field5930.method1635(this.field574, (byte) -104);
            var7.field7840 = false;
            var7.field7835 = 0;
            var7.field7767 = this.field592;
            var7.field7772 = null;
            var7.field7783 = this.field590;
            if (var7.field7837 != null) {
                boolean var8 = false;
                for (class431 var9 = var7.field7837.method2592(127); var9 != null; var9 = var7.field7837.method2589(-1)) {
                    class260 var10 = this.field589.method3057((int) var9.field6388, (byte) 54);
                    if (var10.field3987) {
                        var9.method2677(-22491);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field7837 = null;
                }
            }
        }
        class13 var11 = this.field578;
        synchronized (this.field578) {
            this.field578.method84((long) arg1, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILed;IIIIILya;)Ll;", line = 1161)
    public final class16 method468(int arg0, class500 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class38 arg7) {
        this.field588.field645 = arg1 != null;
        this.field588.field652 = arg7.field510;
        this.field588.field646 = arg0;
        int var9 = -5 / ((arg4 + 66) / 48);
        this.field588.field642 = arg3;
        field564++;
        this.field588.field647 = arg2;
        this.field588.field641 = arg6;
        this.field588.field648 = arg5;
        return (class16) this.field587.method660(this.field588, -29866);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V", line = 1178)
    public final void method469(int arg0, int arg1) {
        this.field591 = arg0;
        if (arg1 != 928624627) {
            return;
        }
        field584++;
        class13 var3 = this.field579;
        synchronized (this.field579) {
            this.field579.method93((byte) 88);
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lee;IZLcc;Lul;Lul;)V", line = 1264)
    public class45(class480 arg0, int arg1, boolean arg2, class516 arg3, class406 arg4, class406 arg5) {
        this.field570 = arg4;
        this.field572 = arg5;
        this.field566 = arg2;
        this.field589 = arg3;
        this.field574 = arg1;
        if (this.field570 == null) {
            this.field571 = 0;
        } else {
            int var7 = this.field570.method2561(-119) - 1;
            this.field571 = var7 * 256 + this.field570.method2551(var7, -26070);
        }
        this.field592 = new String[] { null, null, class349.field5161.method1635(this.field574, (byte) 120), null, null };
        this.field590 = new String[] { null, null, null, null, class171.field2543.method1635(this.field574, (byte) -54) };
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V", line = 1198)
    public final void method470(int arg0) {
        field573++;
        if (arg0 >= -72) {
            this.field590 = null;
        }
        class13 var2 = this.field578;
        synchronized (this.field578) {
            this.field578.method93((byte) 117);
        }
        class13 var3 = this.field579;
        synchronized (this.field579) {
            this.field579.method93((byte) 113);
        }
        class77 var4 = this.field587;
        synchronized (this.field587) {
            this.field587.method665(-18632);
        }
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V", line = 1218)
    public static void method471(int arg0) {
        if (arg0 != 0) {
            field569 = null;
        }
        field586 = null;
        field569 = null;
        field585 = null;
        field583 = null;
    }
}
