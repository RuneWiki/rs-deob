import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class176 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lad;")
    private class5 field3492 = new class5();

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lma;")
    private class110 field3509 = new class110();

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    private int field3504;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    private int field3505;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Lbf;")
    private class17 field3507;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Ln;")
    public static class118 field3499 = new class118();

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Led;")
    public static class43 field3502 = class191.method1219("Lade Benutzeroberfl-=che )2 ", false);

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Led;")
    public static class43 field3503 = class191.method1219("Ihr Spielkonto wurde deaktiviert)3", false);

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Led;")
    private static class43 field3501 = class191.method1219("Username: ", false);

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Led;")
    public static class43 field3508 = class191.method1219("Spieler kann nicht gefunden werden: ", false);

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Led;")
    public static class43 field3506 = field3501;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(JI)V")
    public final void method1102(long arg0, int arg1) {
        if (arg1 != -1) {
            this.field3504 = 106;
        }
        field3493++;
        class5 var4 = (class5) this.field3507.method75(arg0, -113);
        if (var4 != null) {
            var4.method417(108);
            var4.method30(arg1 ^ 0xFFFFFFF2);
            this.field3505++;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method1103(int arg0) {
        if (arg0 != 4350) {
            field3508 = null;
        }
        field3503 = null;
        field3506 = null;
        field3499 = null;
        field3501 = null;
        field3508 = null;
        field3502 = null;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Lhb;")
    public final class67 method1104(int arg0) {
        field3494++;
        if (arg0 < 87) {
            this.field3492 = null;
        }
        return this.field3507.method79((byte) 76);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)Z")
    public static final boolean method1105(int arg0) {
        field3491++;
        if (class48.field977 == null) {
            return false;
        }
        try {
            int var1 = class48.field977.method523(122);
            if (var1 == 0) {
                return false;
            }
            if (class18.field298 == -1) {
                var1--;
                class48.field977.method526(1, (byte) 103, 0, class38.field723.field1769);
                class38.field723.field1727 = 0;
                class18.field298 = class38.field723.method336(-6);
                class114.field2215 = class9.field167[class18.field298];
            }
            if (class114.field2215 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class48.field977.method526(1, (byte) 103, 0, class38.field723.field1769);
                class114.field2215 = class38.field723.field1769[0] & 0xFF;
            }
            if (class114.field2215 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class48.field977.method526(2, (byte) 103, 0, class38.field723.field1769);
                class38.field723.field1727 = 0;
                class114.field2215 = class38.field723.method555(-1113627096);
                var1 -= 2;
            }
            if (var1 < class114.field2215) {
                return false;
            }
            class38.field723.field1727 = 0;
            class48.field977.method526(class114.field2215, (byte) 103, 0, class38.field723.field1769);
            class20.field343 = 0;
            class157.field3182 = class96.field1871;
            class96.field1871 = class198.field3906;
            class198.field3906 = class18.field298;
            if (class18.field298 == 66) {
                int var2 = class38.field723.method532((byte) 17);
                int var3 = class38.field723.method557(-106);
                class129 var4 = class124.method801((byte) -36, var2);
                if (var4.field2586 != var3 || var3 == -1) {
                    var4.field2586 = var3;
                    var4.field2674 = 0;
                    var4.field2589 = 0;
                    class43.method265(false, var4);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 253) {
                if (class187.field3666 != -1) {
                    class67.method416((byte) -112, 0, class187.field3666);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 36) {
                long var5 = class38.field723.method561((byte) -127);
                int var7 = class38.field723.method555(-1113627096);
                byte var8 = class38.field723.method577((byte) 30);
                boolean var9 = false;
                if ((Long.MIN_VALUE & var5) != 0L) {
                    var9 = true;
                }
                if (var9) {
                    if (class121.field2407 == 0) {
                        class18.field298 = -1;
                        return true;
                    }
                    long var14 = var5 & Long.MAX_VALUE;
                    boolean var16 = false;
                    int var17;
                    for (var17 = 0; class121.field2407 > var17 && (class33.field614[var17].field1353 != var14 || class33.field614[var17].field3698 != var7); var17++) {
                    }
                    if (var17 < class121.field2407) {
                        while (var17 < class121.field2407 - 1) {
                            class33.field614[var17] = class33.field614[var17 + 1];
                            var17++;
                        }
                        class121.field2407--;
                        class33.field614[class121.field2407] = null;
                    }
                } else {
                    class189 var10 = new class189();
                    var10.field1353 = var5;
                    var10.field3699 = class9.method47(var10.field1353, (byte) -100);
                    var10.field3703 = var8;
                    var10.field3698 = var7;
                    int var11;
                    for (var11 = class121.field2407 - 1; var11 >= 0; var11--) {
                        int var12 = class33.field614[var11].field3699.method262(var10.field3699, arg0 + 21497);
                        if (var12 == 0) {
                            class33.field614[var11].field3698 = var7;
                            class33.field614[var11].field3703 = var8;
                            if (class9.field162 == var5) {
                                class89.field1781 = var8;
                            }
                            class18.field298 = -1;
                            class145.field2977 = class200.field3940;
                            return true;
                        }
                        if (var12 < 0) {
                            break;
                        }
                    }
                    if (class121.field2407 >= class33.field614.length) {
                        class18.field298 = -1;
                        return true;
                    }
                    for (int var13 = class121.field2407 - 1; var13 > var11; var13--) {
                        class33.field614[var13 + 1] = class33.field614[var13];
                    }
                    if (class121.field2407 == 0) {
                        class33.field614 = new class189[100];
                    }
                    class33.field614[var11 + 1] = var10;
                    class121.field2407++;
                    if (class9.field162 == var5) {
                        class89.field1781 = var8;
                    }
                }
                class145.field2977 = class200.field3940;
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 155) {
                int var18 = class38.field723.method532((byte) 17);
                int var19 = class38.field723.method547(-111);
                int var20 = class38.field723.method579(arg0 + 21662);
                if (var20 == 65535) {
                    var20 = -1;
                }
                class129 var21 = class124.method801((byte) -36, var19);
                if (var21.field2707) {
                    var21.field2666 = var20;
                    var21.field2577 = var18;
                    class46 var23 = class2.method18(var20, arg0 + 21557);
                    var21.field2605 = var23.field927;
                    var21.field2592 = var23.field943;
                    var21.field2695 = var23.field891;
                    var21.field2616 = var23.field903;
                    var21.field2682 = var23.field923;
                    var21.field2591 = var23.field935;
                    if (var21.field2656 > 0) {
                        var21.field2682 = var21.field2682 * 32 / var21.field2656;
                    }
                    class43.method265(false, var21);
                } else if (var20 == -1) {
                    var21.field2635 = 0;
                    class18.field298 = -1;
                    return true;
                } else {
                    class46 var22 = class2.method18(var20, 0);
                    var21.field2604 = var20;
                    var21.field2635 = 4;
                    var21.field2592 = var22.field943;
                    var21.field2591 = var22.field935;
                    var21.field2682 = var22.field923 * 100 / var18;
                    class43.method265(false, var21);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 187) {
                int var24 = class114.field2215 + class38.field723.field1727;
                int var25 = class38.field723.method555(-1113627096);
                int var26 = class38.field723.method555(-1113627096);
                if (class187.field3666 != var25) {
                    class187.field3666 = var25;
                    class34.method194(99, class187.field3666);
                    class92.method591(class187.field3666, (byte) -74);
                    for (int var27 = 0; var27 < 100; var27++) {
                        class107.field2056[var27] = true;
                    }
                }
                while (var26-- > 0) {
                    int var28 = class38.field723.method545(-7436);
                    int var29 = class38.field723.method555(arg0 ^ 0x4260CDE3);
                    int var30 = class38.field723.method538((byte) 101);
                    class137 var31 = (class137) class15.field227.method75((long) var28, 74);
                    if (var31 != null && var31.field2850 != var29) {
                        class30.method158((byte) -112, var31, true);
                        var31 = null;
                    }
                    if (var31 == null) {
                        var31 = class206.method1332(var30, var28, (byte) 15, var29);
                    }
                    var31.field2841 = true;
                }
                for (class137 var32 = (class137) class15.field227.method76(arg0 + 21626); var32 != null; var32 = (class137) class15.field227.method79((byte) 76)) {
                    if (var32.field2841) {
                        var32.field2841 = false;
                    } else {
                        class30.method158((byte) -88, var32, true);
                    }
                }
                class86.field1674 = new class17(512);
                while (var24 > class38.field723.field1727) {
                    int var33 = class38.field723.method545(arg0 ^ 0x493F);
                    int var34 = class38.field723.method555(-1113627096);
                    int var35 = class38.field723.method555(-1113627096);
                    int var36 = class38.field723.method545(-7436);
                    for (int var37 = var34; var37 <= var35; var37++) {
                        long var38 = ((long) var33 << 32) + ((long) var37);
                        class86.field1674.method82(55, new class30(var36), var38);
                    }
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 244) {
                class128.method824(0);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 138) {
                class57.method340(arg0 + 26926, class38.field723, class114.field2215, class32.field585);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 119) {
                int var40 = class38.field723.method538((byte) -91);
                if (class38.field723.method538((byte) -41) == 0) {
                    class145.field2980[var40] = new class144();
                } else {
                    class38.field723.field1727--;
                    class145.field2980[var40] = new class144(class38.field723);
                }
                class57.field1127 = class200.field3940;
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 245) {
                class117.field2282 = false;
                for (int var41 = 0; var41 < 5; var41++) {
                    class108.field2067[var41] = false;
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 113) {
                class117.field2282 = true;
                class132.field2762 = class38.field723.method538((byte) -68);
                class30.field572 = class38.field723.method538((byte) 117);
                class101.field1937 = class38.field723.method555(arg0 ^ 0x4260CDE3);
                field3497 = class38.field723.method538((byte) 76);
                class193.field3756 = class38.field723.method538((byte) -111);
                if (class193.field3756 >= 100) {
                    class184.field3617 = class132.field2762 * 128 + 64;
                    class188.field3686 = class30.field572 * 128 + 64;
                    class185.field3647 = class108.method668(class188.field3686, class184.field3617, -128, class93.field1839) - class101.field1937;
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 85) {
                class77.method476(true, false);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 239) {
                class73.field1457 = class114.field2215 / 8;
                for (int var42 = 0; var42 < class73.field1457; var42++) {
                    class78.field1546[var42] = class38.field723.method561((byte) 54);
                    class185.field3640[var42] = class9.method47(class78.field1546[var42], (byte) -122);
                }
                class27.field479 = class200.field3940;
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 241) {
                int var43 = class38.field723.method579(arg0 ^ 0xFFFFABBE);
                int var44 = class38.field723.method532((byte) 17);
                int var45 = class38.field723.method563(arg0 ^ 0x306A);
                int var46 = class38.field723.method544(true);
                class129 var47 = class124.method801((byte) -36, var44);
                if (var47.field2592 != var46 || var47.field2591 != var43 || var47.field2682 != var45) {
                    var47.field2592 = var46;
                    var47.field2591 = var43;
                    var47.field2682 = var45;
                    class43.method265(false, var47);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 118) {
                int var48 = class38.field723.method545(-7436);
                int var49 = class38.field723.method555(arg0 ^ 0x4260CDE3);
                if (var48 < -70000) {
                    var49 += 32768;
                }
                class129 var50;
                if (var48 < 0) {
                    var50 = null;
                } else {
                    var50 = class124.method801((byte) -36, var48);
                }
                if (var50 != null) {
                    for (int var51 = 0; var51 < var50.field2597.length; var51++) {
                        var50.field2597[var51] = 0;
                        var50.field2609[var51] = 0;
                    }
                }
                class38.method211(true, var49);
                int var52 = class38.field723.method555(arg0 ^ 0x4260CDE3);
                for (int var53 = 0; var53 < var52; var53++) {
                    int var54 = class38.field723.method543(-6);
                    if (var54 == 255) {
                        var54 = class38.field723.method540((byte) 75);
                    }
                    int var55 = class38.field723.method563(-25695);
                    if (var50 != null && var50.field2597.length > var53) {
                        var50.field2597[var53] = var55;
                        var50.field2609[var53] = var54;
                    }
                    class159.method1001(var55 - 1, var49, var53, var54, -123);
                }
                if (var50 != null) {
                    class43.method265(false, var50);
                }
                class116.method737(false);
                class54.field1096[class7.method38(31, class9.field166++)] = class7.method38(var49, 32767);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 74) {
                class38.field724 = class38.field723.method543(arg0 + 21551);
                class93.field1834 = class38.field723.method538((byte) -98);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 148) {
                int var56 = class38.field723.method543(-6);
                int var57 = class38.field723.method538((byte) -52);
                class43 var58 = class38.field723.method541(936);
                if (var56 >= 1 && var56 <= 8) {
                    if (var58.method250(63, class47.field956)) {
                        var58 = null;
                    }
                    class157.field3174[var56 - 1] = var58;
                    class122.field2449[var56 - 1] = var57 == 0;
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 128) {
                class1.field30 = class38.field723.method538((byte) -119);
                class98.field1898 = class38.field723.method538((byte) 122);
                class119.field2382 = class38.field723.method538((byte) 110);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 115) {
                int var59 = class38.field723.method538((byte) 102);
                int var60 = class38.field723.method578(0);
                int var61 = class38.field723.method578(arg0 + 21557);
                class93.field1839 = var60 >> 1;
                class67.field1348.method758((byte) 93, var61, var59, (var60 & 0x1) == 1);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 117) {
                class88.method528((byte) 95);
                class18.field298 = -1;
                return false;
            }
            if (class18.field298 == 255) {
                int var62 = class38.field723.method545(arg0 + 14121);
                class129 var63 = class124.method801((byte) -36, var62);
                for (int var64 = 0; var64 < var63.field2597.length; var64++) {
                    var63.field2597[var64] = -1;
                    var63.field2597[var64] = 0;
                }
                class43.method265(false, var63);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 189 || class18.field298 == 49 || class18.field298 == 143 || class18.field298 == 226 || class18.field298 == 205 || class18.field298 == 133 || class18.field298 == 235 || class18.field298 == 136 || class18.field298 == 188 || class18.field298 == 64 || class18.field298 == 247) {
                class35.method202(arg0 + 21561);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 53) {
                class116.method737(false);
                class143.field2952 = class38.field723.method552((byte) -116);
                class18.field298 = -1;
                class36.field692 = class200.field3940;
                return true;
            }
            if (class18.field298 == 228) {
                int var65 = class38.field723.method544(true);
                int var66 = class38.field723.method532((byte) 17);
                class35.field634[var65] = var66;
                if (class30.field569[var65] != var66) {
                    class30.field569[var65] = var66;
                    class189.method1200(true, var65);
                }
                class22.field386[class7.method38(class99.field1905++, 31)] = var65;
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 131) {
                int var67 = class38.field723.method579(96);
                class206.method1331((byte) 90, var67);
                class54.field1096[class7.method38(class9.field166++, 31)] = class7.method38(32767, var67);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 144) {
                int var68 = class38.field723.method540((byte) -118);
                int var69 = class38.field723.method555(-1113627096);
                int var70 = var69 & 0x1F;
                int var71 = var69 >> 10 & 0x1F;
                int var72 = var69 >> 5 & 0x1F;
                int var73 = (var72 << 11) + (var70 << 3) + (var71 << 19);
                class129 var74 = class124.method801((byte) -36, var68);
                if (var74.field2655 != var73) {
                    var74.field2655 = var73;
                    class43.method265(false, var74);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 180) {
                class116.method737(false);
                class126.field2513 = class38.field723.method538((byte) -82);
                class18.field298 = -1;
                class36.field692 = class200.field3940;
                return true;
            }
            if (class18.field298 == 73) {
                int var75 = class38.field723.method544(true);
                class187.field3666 = var75;
                class34.method194(107, var75);
                class92.method591(class187.field3666, (byte) -74);
                for (int var76 = 0; var76 < 100; var76++) {
                    class107.field2056[var76] = true;
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 209) {
                class7.field147 = class38.field723.method538((byte) 123);
                if (class7.field147 == 1) {
                    class171.field3417 = class38.field723.method555(-1113627096);
                }
                if (class7.field147 >= 2 && class7.field147 <= 6) {
                    if (class7.field147 == 2) {
                        class129.field2659 = 64;
                        class114.field2218 = 64;
                    }
                    if (class7.field147 == 3) {
                        class129.field2659 = 0;
                        class114.field2218 = 64;
                    }
                    if (class7.field147 == 4) {
                        class129.field2659 = 128;
                        class114.field2218 = 64;
                    }
                    if (class7.field147 == 5) {
                        class114.field2218 = 0;
                        class129.field2659 = 64;
                    }
                    if (class7.field147 == 6) {
                        class114.field2218 = 128;
                        class129.field2659 = 64;
                    }
                    class7.field147 = 2;
                    class116.field2269 = class38.field723.method555(arg0 - 1113605539);
                    class142.field2941 = class38.field723.method555(arg0 ^ 0x4260CDE3);
                    class161.field3255 = class38.field723.method538((byte) 117);
                }
                if (class7.field147 == 10) {
                    class164.field3279 = class38.field723.method555(-1113627096);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 237) {
                int var77 = class38.field723.method563(-25695);
                byte var78 = class38.field723.method531((byte) -125);
                class35.field634[var77] = var78;
                if (class30.field569[var77] != var78) {
                    class30.field569[var77] = var78;
                    class189.method1200(true, var77);
                }
                class22.field386[class7.method38(class99.field1905++, 31)] = var77;
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 7) {
                class117.field2282 = true;
                class203.field3966 = class38.field723.method538((byte) -122);
                class24.field458 = class38.field723.method538((byte) -74);
                class102.field1947 = class38.field723.method555(-1113627096);
                class150.field3036 = class38.field723.method538((byte) -40);
                class13.field191 = class38.field723.method538((byte) -57);
                if (class13.field191 >= 100) {
                    int var79 = class203.field3966 * 128 + 64;
                    int var80 = class24.field458 * 128 + 64;
                    int var81 = class108.method668(var80, var79, -127, class93.field1839) - class102.field1947;
                    int var82 = var79 - class184.field3617;
                    int var83 = var80 - class188.field3686;
                    int var84 = var81 - class185.field3647;
                    int var85 = (int) Math.sqrt((double) (var82 * var82 + var83 * var83));
                    class51.field1034 = (int) (Math.atan2((double) var84, (double) var85) * 325.949D) & 0x7FF;
                    class32.field591 = (int) (Math.atan2((double) var82, (double) var83) * -325.949D) & 0x7FF;
                    if (class51.field1034 < 128) {
                        class51.field1034 = 128;
                    }
                    if (class51.field1034 > 383) {
                        class51.field1034 = 383;
                    }
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 122) {
                class204.field3970 = class38.field723.method563(-25695) * 30;
                class18.field298 = -1;
                class36.field692 = class200.field3940;
                return true;
            }
            if (class18.field298 == 169) {
                int var86 = class38.field723.method547(-81);
                class129 var87 = class124.method801((byte) -36, var86);
                var87.field2635 = 3;
                var87.field2604 = class67.field1348.field24.method467((byte) -63);
                class43.method265(false, var87);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 72) {
                for (int var88 = 0; var88 < class12.field183.length; var88++) {
                    if (class12.field183[var88] != null) {
                        class12.field183[var88].field2351 = -1;
                    }
                }
                for (int var89 = 0; var89 < class172.field3433.length; var89++) {
                    if (class172.field3433[var89] != null) {
                        class172.field3433[var89].field2351 = -1;
                    }
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 191) {
                int var90 = class38.field723.method544(true);
                int var91 = class38.field723.method540((byte) 92);
                int var92 = class38.field723.method538((byte) -94);
                class137 var93 = (class137) class15.field227.method75((long) var91, -72);
                if (var93 != null) {
                    class30.method158((byte) -103, var93, var93.field2850 != var90);
                }
                class206.method1332(var92, var91, (byte) 15, var90);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 84) {
                class116.method737(false);
                int var94 = class38.field723.method547(-85);
                int var95 = class38.field723.method538((byte) -115);
                int var96 = class38.field723.method538((byte) 109);
                class96.field1874[var95] = var94;
                class108.field2074[var95] = var96;
                class32.field589[var95] = 1;
                for (int var97 = 0; var97 < 98; var97++) {
                    if (class198.field3905[var97] <= var94) {
                        class32.field589[var95] = var97 + 2;
                    }
                }
                class46.field940[class7.method38(class156.field3151++, 31)] = var95;
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 153) {
                int var98 = class38.field723.method544(true);
                int var99 = class38.field723.method579(114);
                int var100 = class38.field723.method532((byte) 17);
                if (var99 == 65535) {
                    var99 = -1;
                }
                if (var98 == 65535) {
                    var98 = -1;
                }
                int var101 = class38.field723.method545(arg0 + 14121);
                for (int var102 = var99; var102 <= var98; var102++) {
                    long var103 = ((long) var101 << 32) + ((long) var102);
                    class67 var105 = class86.field1674.method75(var103, -90);
                    if (var105 != null) {
                        var105.method417(106);
                    }
                    class86.field1674.method82(-98, new class30(var100), var103);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 222) {
                long var106 = class38.field723.method561((byte) 56);
                int var108 = class38.field723.method555(arg0 - 1113605539);
                int var109 = class38.field723.method538((byte) 95);
                class43 var110 = class9.method47(var106, (byte) -91).method273(-105);
                for (int var111 = 0; var111 < class40.field778; var111++) {
                    if (class117.field2286[var111] == var106) {
                        if (class80.field1585[var111] != var108) {
                            class80.field1585[var111] = var108;
                            if (var108 > 0) {
                                class81.method504(class167.method1036(new class43[] { var110, class172.field3444 }, true), class110.field2127, 5, (byte) 61);
                            }
                            if (var108 == 0) {
                                class81.method504(class167.method1036(new class43[] { var110, class76.field1510 }, true), class110.field2127, 5, (byte) 100);
                            }
                        }
                        var110 = null;
                        class78.field1545[var111] = var109;
                        break;
                    }
                }
                boolean var112 = false;
                if (var110 != null && class40.field778 < 200) {
                    class117.field2286[class40.field778] = var106;
                    class148.field3018[class40.field778] = var110;
                    class80.field1585[class40.field778] = var108;
                    class78.field1545[class40.field778] = var109;
                    class40.field778++;
                }
                int var113 = class40.field778;
                class27.field479 = class200.field3940;
                while (var113 > 0) {
                    boolean var114 = true;
                    var113--;
                    for (int var115 = 0; var115 < var113; var115++) {
                        if (class80.field1585[var115] != class95.field1859 && class80.field1585[var115 + 1] == class95.field1859 || class80.field1585[var115] == 0 && class80.field1585[var115 + 1] != 0) {
                            var114 = false;
                            int var116 = class80.field1585[var115];
                            class80.field1585[var115] = class80.field1585[var115 + 1];
                            class80.field1585[var115 + 1] = var116;
                            class43 var117 = class148.field3018[var115];
                            class148.field3018[var115] = class148.field3018[var115 + 1];
                            class148.field3018[var115 + 1] = var117;
                            long var118 = class117.field2286[var115];
                            class117.field2286[var115] = class117.field2286[var115 + 1];
                            class117.field2286[var115 + 1] = var118;
                            int var120 = class78.field1545[var115];
                            class78.field1545[var115] = class78.field1545[var115 + 1];
                            class78.field1545[var115 + 1] = var120;
                        }
                    }
                    if (var114) {
                        break;
                    }
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 47) {
                class124.field2457 = 0;
                class18.field298 = -1;
                return true;
            }
            if (arg0 != -21557) {
                field3506 = null;
            }
            if (class18.field298 == 147) {
                class43 var121 = class38.field723.method541(936);
                if (var121.method243(class16.field250, arg0 ^ 0x5475)) {
                    boolean var122 = false;
                    class43 var123 = var121.method241((byte) 99, 0, var121.method261((byte) -127, class54.field1088));
                    long var124 = var123.method249(-48);
                    for (int var126 = 0; var126 < class73.field1457; var126++) {
                        if (class78.field1546[var126] == var124) {
                            var122 = true;
                            break;
                        }
                    }
                    if (!var122 && class57.field1122 == 0) {
                        class81.method504(class19.field336, var123, 4, (byte) 40);
                    }
                } else if (var121.method243(class159.field3209, -66)) {
                    class43 var127 = var121.method241((byte) 125, 0, var121.method261((byte) 63, class54.field1088));
                    boolean var128 = false;
                    long var129 = var127.method249(-48);
                    for (int var131 = 0; var131 < class73.field1457; var131++) {
                        if (class78.field1546[var131] == var129) {
                            var128 = true;
                            break;
                        }
                    }
                    if (!var128 && class57.field1122 == 0) {
                        class43 var132 = var121.method241((byte) -36, var121.method261((byte) 35, class54.field1088) + 1, var121.method248((byte) 60) + -9);
                        class81.method504(var132, var127, 8, (byte) 55);
                    }
                } else if (var121.method243(class154.field3121, arg0 + 21491)) {
                    class43 var151 = var121.method241((byte) 82, 0, var121.method261((byte) 114, class54.field1088));
                    long var152 = var151.method249(-48);
                    boolean var154 = false;
                    for (int var155 = 0; var155 < class73.field1457; var155++) {
                        if (class78.field1546[var155] == var152) {
                            var154 = true;
                            break;
                        }
                    }
                    if (!var154 && class57.field1122 == 0) {
                        class81.method504(class110.field2127, var151, 10, (byte) 70);
                    }
                } else if (var121.method243(class161.field3260, arg0 ^ 0x5475)) {
                    class43 var150 = var121.method241((byte) -63, 0, var121.method261((byte) 39, class161.field3260));
                    class81.method504(var150, class110.field2127, 11, (byte) 111);
                } else if (var121.method243(class48.field969, -66)) {
                    class43 var149 = var121.method241((byte) 114, 0, var121.method261((byte) 126, class48.field969));
                    if (class57.field1122 == 0) {
                        class81.method504(var149, class110.field2127, 12, (byte) 46);
                    }
                } else if (var121.method243(class58.field1130, arg0 + 21491)) {
                    class43 var133 = var121.method241((byte) 104, 0, var121.method261((byte) -127, class58.field1130));
                    if (class57.field1122 == 0) {
                        class81.method504(var133, class110.field2127, 13, (byte) 42);
                    }
                } else if (var121.method243(class167.field3312, arg0 ^ 0x5475)) {
                    class43 var134 = var121.method241((byte) 127, 0, var121.method261((byte) 120, class54.field1088));
                    long var135 = var134.method249(-48);
                    boolean var137 = false;
                    for (int var138 = 0; var138 < class73.field1457; var138++) {
                        if (class78.field1546[var138] == var135) {
                            var137 = true;
                            break;
                        }
                    }
                    if (!var137 && class57.field1122 == 0) {
                        class81.method504(class110.field2127, var134, 14, (byte) 47);
                    }
                } else if (var121.method243(class54.field1097, -66)) {
                    class43 var144 = var121.method241((byte) -37, 0, var121.method261((byte) 114, class54.field1088));
                    boolean var145 = false;
                    long var146 = var144.method249(-48);
                    for (int var148 = 0; var148 < class73.field1457; var148++) {
                        if (class78.field1546[var148] == var146) {
                            var145 = true;
                            break;
                        }
                    }
                    if (!var145 && class57.field1122 == 0) {
                        class81.method504(class110.field2127, var144, 15, (byte) 84);
                    }
                } else if (var121.method243(class105.field2006, arg0 ^ 0x5475)) {
                    class43 var139 = var121.method241((byte) -107, 0, var121.method261((byte) 86, class54.field1088));
                    long var140 = var139.method249(-48);
                    boolean var142 = false;
                    for (int var143 = 0; var143 < class73.field1457; var143++) {
                        if (class78.field1546[var143] == var140) {
                            var142 = true;
                            break;
                        }
                    }
                    if (!var142 && class57.field1122 == 0) {
                        class81.method504(class110.field2127, var139, 16, (byte) 102);
                    }
                } else {
                    class81.method504(var121, class110.field2127, 0, (byte) 123);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 95) {
                class105.method646(false);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 1) {
                class118.field2307 = class38.field723.method538((byte) 83);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 121) {
                class38.field724 = class38.field723.method543(-6);
                class93.field1834 = class38.field723.method543(-6);
                for (int var156 = class93.field1834; var156 < class93.field1834 + 8; var156++) {
                    for (int var157 = class38.field724; var157 < class38.field724 + 8; var157++) {
                        if (class46.field922[class93.field1839][var156][var157] != null) {
                            class46.field922[class93.field1839][var156][var157] = null;
                            class122.method798(var157, (byte) 15, var156);
                        }
                    }
                }
                for (class138 var158 = (class138) field3499.method753(-26703); var158 != null; var158 = (class138) field3499.method755((byte) 125)) {
                    if (var158.field2870 >= class93.field1834 && var158.field2870 < class93.field1834 + 8 && class38.field724 <= var158.field2867 && var158.field2867 < class38.field724 + 8 && class93.field1839 == var158.field2864) {
                        var158.field2865 = 0;
                    }
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 26) {
                for (int var159 = 0; var159 < class148.field3020; var159++) {
                    class53 var160 = class191.method1216(255, var159);
                    if (var160 != null && var160.field1073 == 0) {
                        class35.field634[var159] = 0;
                        class30.field569[var159] = 0;
                    }
                }
                class116.method737(false);
                class99.field1905 += 32;
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 168) {
                boolean var161 = class38.field723.method560((byte) -69) == 1;
                int var162 = class38.field723.method547(-58);
                class129 var163 = class124.method801((byte) -36, var162);
                if (var161 != var163.field2686) {
                    var163.field2686 = var161;
                    class43.method265(false, var163);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 196) {
                int var164 = class38.field723.method538((byte) 114);
                int var165 = class38.field723.method538((byte) -64);
                int var166 = class38.field723.method538((byte) 118);
                int var167 = class38.field723.method538((byte) 117);
                int var168 = class38.field723.method555(-1113627096);
                class108.field2067[var164] = true;
                class23.field432[var164] = var165;
                class137.field2838[var164] = var166;
                class109.field2108[var164] = var167;
                class156.field3155[var164] = var168;
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 199) {
                int var169 = class38.field723.method557(arg0 + 21670);
                int var170 = class38.field723.method545(-7436);
                int var171 = class38.field723.method552((byte) -105);
                class129 var172 = class124.method801((byte) -36, var170);
                int var173 = var172.field2581 + var169;
                int var174 = var172.field2671 + var171;
                if (var172.field2633 != var173 || var172.field2607 != var174) {
                    var172.field2607 = var174;
                    var172.field2633 = var173;
                    class43.method265(false, var172);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 216) {
                int var175 = class38.field723.method563(arg0 - 4138);
                int var176 = class38.field723.method532((byte) 17);
                int var177 = class38.field723.method579(98);
                class129 var178 = class124.method801((byte) -36, var176);
                class18.field298 = -1;
                var178.field2673 = (var177 << 16) + var175;
                return true;
            }
            if (class18.field298 == 145) {
                long var179 = class38.field723.method561((byte) -96);
                class38.field723.method577((byte) 30);
                long var181 = class38.field723.method561((byte) -87);
                long var183 = (long) class38.field723.method555(-1113627096);
                long var185 = (long) class38.field723.method565(3);
                int var187 = class38.field723.method538((byte) 91);
                boolean var188 = false;
                long var189 = (var183 << 32) + var185;
                for (int var191 = 0; var191 < 100; var191++) {
                    if (class38.field727[var191] == var189) {
                        var188 = true;
                        break;
                    }
                }
                if (var187 <= 1) {
                    for (int var192 = 0; var192 < class73.field1457; var192++) {
                        if (class78.field1546[var192] == var179) {
                            var188 = true;
                            break;
                        }
                    }
                }
                if (!var188 && class57.field1122 == 0) {
                    class38.field727[class184.field3630] = var189;
                    class184.field3630 = (class184.field3630 + 1) % 100;
                    class43 var193 = class151.method945(class109.method678((byte) -9, class38.field723).method245(0));
                    if (var187 == 2 || var187 == 3) {
                        client.method150(var193, (byte) 56, class167.method1036(new class43[] { class158.field3199, class9.method47(var179, (byte) -79).method273(84) }, true), 9, class9.method47(var181, (byte) -125).method273(arg0 + 21606));
                    } else if (var187 == 1) {
                        client.method150(var193, (byte) -127, class167.method1036(new class43[] { class153.field3112, class9.method47(var179, (byte) -96).method273(arg0 + 21608) }, true), 9, class9.method47(var181, (byte) -77).method273(64));
                    } else {
                        client.method150(var193, (byte) -126, class9.method47(var179, (byte) -113).method273(72), 9, class9.method47(var181, (byte) -86).method273(-28));
                    }
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 137) {
                long var194 = class38.field723.method561((byte) -75);
                class43 var196 = class151.method945(class109.method678((byte) 25, class38.field723).method245(arg0 ^ 0xFFFFABCB));
                class81.method504(var196, class9.method47(var194, (byte) -94).method273(42), 6, (byte) 119);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 192) {
                int var197 = class38.field723.method547(-85);
                class22.field377 = class32.field585.method1009(10037, var197);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 249) {
                int var198 = class38.field723.method555(arg0 - 1113605539);
                int var199 = class38.field723.method545(arg0 + 14121);
                class129 var200 = class124.method801((byte) -36, var199);
                if (var200 != null && var200.field2690 == 0) {
                    if (var200.field2590 - var200.field2662 < var198) {
                        var198 = var200.field2590 - var200.field2662;
                    }
                    if (var198 < 0) {
                        var198 = 0;
                    }
                    if (var200.field2680 != var198) {
                        var200.field2680 = var198;
                        class43.method265(false, var200);
                    }
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 171) {
                class189.method1204((byte) 107, class38.field723);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 111) {
                class43 var201 = class38.field723.method541(arg0 + 22493);
                Object[] var202 = new Object[var201.method248((byte) 60) + 1];
                for (int var203 = var201.method248((byte) 60) - 1; var203 >= 0; var203--) {
                    if (var201.method256(true, var203) == 115) {
                        var202[var203 + 1] = class38.field723.method541(arg0 + 22493);
                    } else {
                        var202[var203 + 1] = Integer.valueOf(class38.field723.method545(-7436));
                    }
                }
                var202[0] = Integer.valueOf(class38.field723.method545(-7436));
                class115 var204 = new class115();
                var204.field2238 = var202;
                class203.method1311(var204, 3538);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 2) {
                int var205 = class38.field723.method545(-7436);
                int var206 = class38.field723.method555(arg0 - 1113605539);
                if (var205 < -70000) {
                    var206 += 32768;
                }
                class129 var207;
                if (var205 >= 0) {
                    var207 = class124.method801((byte) -36, var205);
                } else {
                    var207 = null;
                }
                while (class38.field723.field1727 < class114.field2215) {
                    int var208 = class38.field723.method533((byte) 75);
                    int var209 = 0;
                    int var210 = class38.field723.method555(-1113627096);
                    if (var210 != 0) {
                        var209 = class38.field723.method538((byte) 118);
                        if (var209 == 255) {
                            var209 = class38.field723.method545(-7436);
                        }
                    }
                    if (var207 != null && var208 >= 0 && var207.field2597.length > var208) {
                        var207.field2597[var208] = var210;
                        var207.field2609[var208] = var209;
                    }
                    class159.method1001(var210 - 1, var206, var208, var209, 35);
                }
                if (var207 != null) {
                    class43.method265(false, var207);
                }
                class116.method737(false);
                class54.field1096[class7.method38(class9.field166++, 31)] = class7.method38(var206, 32767);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 58) {
                int var211 = class38.field723.method555(arg0 ^ 0x4260CDE3);
                int var212 = class38.field723.method538((byte) -62);
                int var213 = class38.field723.method555(-1113627096);
                class189.method1201(var213, var212, var211, (byte) 117);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 8) {
                class50.field1016 = class38.field723.method538((byte) -121);
                class18.field298 = -1;
                class27.field479 = class200.field3940;
                return true;
            }
            if (class18.field298 == 33) {
                class145.field2977 = class200.field3940;
                long var214 = class38.field723.method561((byte) 44);
                if (var214 == 0L) {
                    class33.field614 = null;
                    class85.field1667 = null;
                    class121.field2407 = 0;
                    class18.field298 = -1;
                    class174.field3472 = null;
                    return true;
                }
                long var216 = class38.field723.method561((byte) -60);
                class174.field3472 = class9.method47(var216, (byte) -108);
                class85.field1667 = class9.method47(var214, (byte) -114);
                class194.field3777 = class38.field723.method577((byte) 30);
                int var218 = class38.field723.method538((byte) -75);
                if (var218 == 255) {
                    class18.field298 = -1;
                    return true;
                }
                class121.field2407 = var218;
                class189[] var219 = new class189[100];
                for (int var220 = 0; var220 < class121.field2407; var220++) {
                    var219[var220] = new class189();
                    var219[var220].field1353 = class38.field723.method561((byte) -108);
                    var219[var220].field3699 = class9.method47(var219[var220].field1353, (byte) -102);
                    var219[var220].field3698 = class38.field723.method555(-1113627096);
                    var219[var220].field3703 = class38.field723.method577((byte) 30);
                    if (class9.field162 == var219[var220].field1353) {
                        class89.field1781 = var219[var220].field3703;
                    }
                }
                boolean var221 = false;
                int var222 = class121.field2407;
                while (var222 > 0) {
                    var222--;
                    boolean var223 = true;
                    for (int var224 = 0; var224 < var222; var224++) {
                        if (var219[var224].field3699.method262(var219[var224 + 1].field3699, arg0 + 21505) > 0) {
                            class189 var225 = var219[var224];
                            var219[var224] = var219[var224 + 1];
                            var219[var224 + 1] = var225;
                            var223 = false;
                        }
                    }
                    if (var223) {
                        break;
                    }
                }
                class33.field614 = var219;
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 12) {
                int var226 = class38.field723.method563(-25695);
                if (var226 == 65535) {
                    var226 = -1;
                }
                class23.method118(59, var226);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 172) {
                int var227 = class38.field723.method574(true);
                int var228 = class38.field723.method579(arg0 ^ 0xFFFFABBD);
                if (var228 == 65535) {
                    var228 = -1;
                }
                class108.method671(var228, (byte) 93, var227);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 162) {
                long var229 = class38.field723.method561((byte) 70);
                long var231 = (long) class38.field723.method555(arg0 - 1113605539);
                long var233 = (long) class38.field723.method565(3);
                int var235 = class38.field723.method538((byte) -118);
                boolean var236 = false;
                long var237 = (var231 << 32) + var233;
                for (int var239 = 0; var239 < 100; var239++) {
                    if (class38.field727[var239] == var237) {
                        var236 = true;
                        break;
                    }
                }
                if (var235 <= 1) {
                    for (int var240 = 0; var240 < class73.field1457; var240++) {
                        if (class78.field1546[var240] == var229) {
                            var236 = true;
                            break;
                        }
                    }
                }
                if (!var236 && class57.field1122 == 0) {
                    class38.field727[class184.field3630] = var237;
                    class184.field3630 = (class184.field3630 + 1) % 100;
                    class43 var241 = class151.method945(class109.method678((byte) -126, class38.field723).method245(arg0 + 21557));
                    if (var235 == 2 || var235 == 3) {
                        class81.method504(var241, class167.method1036(new class43[] { class158.field3199, class9.method47(var229, (byte) -108).method273(48) }, true), 7, (byte) 65);
                    } else if (var235 == 1) {
                        class81.method504(var241, class167.method1036(new class43[] { class153.field3112, class9.method47(var229, (byte) -90).method273(-75) }, true), 7, (byte) 70);
                    } else {
                        class81.method504(var241, class9.method47(var229, (byte) -88).method273(arg0 + 21643), 3, (byte) 126);
                    }
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 97) {
                for (int var242 = 0; var242 < class30.field569.length; var242++) {
                    if (class35.field634[var242] != class30.field569[var242]) {
                        class30.field569[var242] = class35.field634[var242];
                        class189.method1200(true, var242);
                        class22.field386[class7.method38(31, class99.field1905++)] = var242;
                    }
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 35) {
                int var243 = class38.field723.method563(-25695);
                int var244 = class38.field723.method532((byte) 17);
                class129 var245 = class124.method801((byte) -36, var244);
                if (var245.field2635 != 1 || var245.field2604 != var243) {
                    var245.field2604 = var243;
                    var245.field2635 = 1;
                    class43.method265(false, var245);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 18) {
                int var246 = class38.field723.method544(true);
                int var247 = class38.field723.method545(-7436);
                class129 var248 = class124.method801((byte) -36, var247);
                if (var248.field2635 != 2 || var248.field2604 != var246) {
                    var248.field2635 = 2;
                    var248.field2604 = var246;
                    class43.method265(false, var248);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 27) {
                class77.method476(false, false);
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 139) {
                class43 var249 = class38.field723.method541(arg0 ^ 0xFFFFA863);
                int var250 = class38.field723.method545(arg0 ^ 0x493F);
                class129 var251 = class124.method801((byte) -36, var250);
                if (!var249.method257(var251.field2596, 118)) {
                    var251.field2596 = var249;
                    class43.method265(false, var251);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 183) {
                class38.field724 = class38.field723.method578(0);
                class93.field1834 = class38.field723.method543(-6);
                while (class38.field723.field1727 < class114.field2215) {
                    class18.field298 = class38.field723.method538((byte) -45);
                    class35.method202(4);
                }
                class18.field298 = -1;
                return true;
            }
            if (class18.field298 == 174) {
                int var252 = class38.field723.method545(-7436);
                class137 var253 = (class137) class15.field227.method75((long) var252, -114);
                if (var253 != null) {
                    class30.method158((byte) -125, var253, true);
                }
                if (class107.field2052 != null) {
                    class43.method265(false, class107.field2052);
                    class107.field2052 = null;
                }
                class18.field298 = -1;
                return true;
            }
            class171.method1086("T1 - " + class18.field298 + "," + class96.field1871 + "," + class157.field3182 + " - " + class114.field2215, arg0 ^ 0x5F44, null);
            class88.method528((byte) 36);
        } catch (IOException var257) {
            class54.method332((byte) 30);
        } catch (Exception var258) {
            String var255 = "T2 - " + class18.field298 + "," + class96.field1871 + "," + class157.field3182 + " - " + class114.field2215 + "," + (class67.field1348.field2357[0] + class170.field3393) + "," + (class67.field1348.field2335[0] + class83.field1641) + " - ";
            for (int var256 = 0; var256 < class114.field2215 && var256 < 50; var256++) {
                var255 = var255 + class38.field723.field1769[var256] + ",";
            }
            class171.method1086(var255, -2929, var258);
            class88.method528((byte) 87);
        }
        return true;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IJ)Lad;")
    public final class5 method1106(int arg0, long arg1) {
        if (arg0 != 100) {
            this.method1107(18L, null, -46);
        }
        field3498++;
        class5 var4 = (class5) this.field3507.method75(arg1, 83);
        if (var4 != null) {
            this.field3509.method681(arg0 + 17445, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(JLad;I)V")
    public final void method1107(long arg0, class5 arg1, int arg2) {
        int var5 = -56 / ((-arg2 - 43) / 61);
        field3496++;
        if (this.field3505 == 0) {
            class5 var6 = this.field3509.method685((byte) -97);
            var6.method417(120);
            var6.method30(13);
            if (this.field3492 == var6) {
                class5 var7 = this.field3509.method685((byte) -98);
                var7.method417(-81);
                var7.method30(13);
            }
        } else {
            this.field3505--;
        }
        this.field3507.method82(35, arg1, arg0);
        this.field3509.method681(17545, arg1);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public final void method1108(byte arg0) {
        while (true) {
            class5 var2 = this.field3509.method685((byte) 118);
            if (var2 == null) {
                this.field3505 = this.field3504;
                if (arg0 != -90) {
                    this.field3507 = null;
                }
                field3495++;
                return;
            }
            var2.method417(arg0 + 212);
            var2.method30(arg0 + 103);
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Lhb;")
    public final class67 method1109(byte arg0) {
        field3500++;
        return arg0 > -4 ? null : this.field3507.method76(56);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V")
    public class176(int arg0) {
        this.field3504 = arg0;
        this.field3505 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3507 = new class17(var2);
    }
}
