import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class218 extends class388 implements class171 {

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "Llc;")
    public class444 field2682;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Z")
    private boolean field2673;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public static int field2695;

    static {
        new class72("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        new class72("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field2692 = 0;
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V", line = 4)
    public final void method140(int arg0) {
        ++field2679;
        if (arg0 <= -24) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)I", line = 18)
    public final int method420(byte arg0) {
        int var2 = -73 % ((arg0 - -21) / 44);
        ++field2683;
        return this.field2682.field6163;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V", line = 29)
    public static final void method1322(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class427.field5837.field3211 = 0;
        ++field2695;
        if (arg2 <= 70) {
            method1328(105, 114, 101, -78, -91, 77, -2);
        }
        class427.field5837.method1593(20, -104);
        class427.field5837.method1593(arg0, -104);
        class427.field5837.method1593(arg3, -121);
        class427.field5837.method1573(-6266, arg1);
        class427.field5837.method1573(-6266, arg4);
        class388.field5299 = -3;
        class80.field981 = 0;
        class265.field3417 = 0;
        class102.field1189 = 1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Luo;B)V", line = 49)
    public final void method411(class118 arg0, byte arg1) {
        if (arg1 != 88) {
            method1323((byte) 50);
        }
        this.field2682.method2747(arg0, arg1 + 13606);
        ++field2693;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V", line = 64)
    public final void method423(int arg0) {
        ++field2672;
        if (arg0 != 22486) {
            this.method423(-116);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Luo;IIZ)Z", line = 75)
    public final boolean method134(class118 arg0, int arg1, int arg2, boolean arg3) {
        ++field2685;
        if (!arg3) {
            field2692 = 110;
        }
        class386 var5 = this.field2682.method2746(65536, arg0, super.field5296, super.field5297, false, false, false);
        if (var5 == null) {
            return false;
        } else {
            class450 var6 = arg0.method742();
            var6.method929(super.field5297, super.field5291, super.field5296);
            return var5.method1474(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V", line = 95)
    public static final void method1323(byte arg0) {
        if (arg0 < -43) {
            ++field2674;
            class80.field972 = null;
            class202.field2379 = null;
            class281.field3671 = null;
            class136.field1546 = null;
            class23.field250 = null;
            class168.field1959 = null;
            class419.field5719 = null;
            class102.field1186 = null;
            class420.field5730 = null;
            class307.field4176 = null;
            class225.field2838 = null;
            class226.field2868 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Luo;IIIZBLpc;)V", line = 118)
    public final void method137(class118 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class22 arg6) {
        ++field2675;
        if (arg5 >= -115) {
            field2692 = -27;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBIIII)V", line = 130)
    public static final void method1324(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2694;
        int var6 = arg5 - arg0;
        int var7 = -arg2 + arg4;
        if (~var6 == -1) {
            if (var7 != 0) {
                class338.method2163(arg2, arg0, arg3, arg4, 23251);
            }
        } else if (var7 == 0) {
            class247.method1619(arg5, arg0, arg3, arg2, 3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = -(arg0 * var8 >> 12) + arg2;
            int var10;
            int var11;
            if (~class295.field3937 < ~arg5) {
                var10 = (class295.field3937 * var8 >> 12) + var9;
                var11 = class295.field3937;
            } else if (arg5 > class427.field5844) {
                var11 = class427.field5844;
                var10 = (class427.field5844 * var8 >> 12) + var9;
            } else {
                var11 = arg5;
                var10 = arg4;
            }
            int var12;
            int var13;
            if (class295.field3937 <= arg0) {
                if (~arg0 >= ~class427.field5844) {
                    var12 = arg2;
                    var13 = arg0;
                } else {
                    var12 = var9 - -(class427.field5844 * var8 >> 12);
                    var13 = class427.field5844;
                }
            } else {
                var12 = (class295.field3937 * var8 >> 12) + var9;
                var13 = class295.field3937;
            }
            if (class53.field624 <= var10) {
                if (var10 > class118.field1356) {
                    var10 = class118.field1356;
                    var11 = (-var9 + class118.field1356 << 12) / var8;
                }
            } else {
                var11 = (class53.field624 - var9 << 12) / var8;
                var10 = class53.field624;
            }
            if (~class53.field624 < ~var12) {
                var12 = class53.field624;
                var13 = (class53.field624 - var9 << 12) / var8;
            } else if (class118.field1356 < var12) {
                var12 = class118.field1356;
                var13 = (class118.field1356 - var9 << 12) / var8;
            }
            int var14 = 84 % ((-7 - arg1) / 37);
            class344.method2189(114, var11, var13, var12, arg3, var10);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Luo;Lnd;IIIIIIZI)V", line = 233)
    public class218(class118 arg0, class446 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field6208, arg1.field6239);
        this.field2682 = new class444(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field2673 = arg1.field6235 != 0 && !arg8;
    }

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "(I)V", line = 244)
    public static final void method1325(int arg0) {
        ++field2678;
        if (class80.field970 != 0 && class80.field970 != 5) {
            try {
                if (++class411.field5665 > 2000) {
                    if (class181.field2107 != null) {
                        class181.field2107.method2465((byte) -85);
                        class181.field2107 = null;
                    }
                    if (~class427.field5843 <= -2) {
                        class406.field5620 = -5;
                        class80.field970 = 0;
                        return;
                    }
                    class80.field970 = 1;
                    if (~class70.field874 != ~class249.field3279) {
                        class70.field874 = class249.field3279;
                    } else {
                        class70.field874 = class389.field5303;
                    }
                    ++class427.field5843;
                    class411.field5665 = 0;
                }
                if (~class80.field970 == -2) {
                    class181.field2110 = class401.field5525.method2714(class70.field874, false, class330.field4505);
                    class80.field970 = 2;
                }
                if (~class80.field970 == -3) {
                    if (class181.field2110.field4244 == 2) {
                        throw new IOException();
                    }
                    if (~class181.field2110.field4244 != -2) {
                        return;
                    }
                    class181.field2107 = new class399((Socket) class181.field2110.field4243, class401.field5525);
                    class181.field2110 = null;
                    long var1 = class278.field3606 = class412.method2551(class252.field3305, (byte) -105);
                    class427.field5837.field3211 = 0;
                    int var3 = (int) (31L & var1 >> 16);
                    class427.field5837.method1593(14, arg0 + 2531);
                    class427.field5837.method1593(var3, -127);
                    class181.field2107.method2464((byte) 101, 0, 2, class427.field5837.field3188);
                    if (class252.field3301 != null) {
                        class252.field3301.method1113((byte) -126);
                    }
                    if (class424.field5811 != null) {
                        class424.field5811.method1113((byte) -124);
                    }
                    int var4 = class181.field2107.method2469(-19969);
                    if (class252.field3301 != null) {
                        class252.field3301.method1113((byte) -126);
                    }
                    if (class424.field5811 != null) {
                        class424.field5811.method1113((byte) -128);
                    }
                    if (var4 != 0) {
                        class80.field970 = 0;
                        class406.field5620 = var4;
                        class181.field2107.method2465((byte) -85);
                        class181.field2107 = null;
                        return;
                    }
                    class80.field970 = 3;
                }
                if (~class80.field970 == -4) {
                    if (~class181.field2107.method2467((byte) -124) > -9) {
                        return;
                    }
                    class181.field2107.method2466(0, 8, 16752, class215.field2658.field3188);
                    class215.field2658.field3211 = 0;
                    class387.field5285 = class215.field2658.method1542(-1844808528);
                    int[] var5 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (9.9999999E7D * Math.random()), (int) (class387.field5285 >> 32), (int) class387.field5285 };
                    class427.field5837.field3211 = 0;
                    class427.field5837.method1593(10, arg0 + 2523);
                    class427.field5837.method1560(-26356, var5[0]);
                    class427.field5837.method1560(-26356, var5[1]);
                    class427.field5837.method1560(-26356, var5[2]);
                    class427.field5837.method1560(-26356, var5[3]);
                    class427.field5837.method1591(2013886536, class412.method2551(class252.field3305, (byte) -115));
                    class427.field5837.method1562(114, class352.field4786);
                    class427.field5837.method1594(-88, class4.field28, class349.field4747);
                    class207.field2507.field3211 = 0;
                    if (~class174.field2017 == -41) {
                        class207.field2507.method1593(18, -98);
                    } else {
                        class207.field2507.method1593(16, -114);
                    }
                    class207.field2507.method1573(-6266, class427.field5837.field3211 + 161 + class350.method2229(2, class175.field2033));
                    class207.field2507.method1560(-26356, 568);
                    class207.field2507.method1593(class158.field1849, arg0 ^ 2606);
                    class207.field2507.method1593(client.method2697(-123), -124);
                    class207.field2507.method1573(-6266, class39.field457);
                    class207.field2507.method1573(-6266, class28.field315);
                    class207.field2507.method1593(class414.field5684, -124);
                    class168.method1069(-1, class207.field2507);
                    class207.field2507.method1562(-118, class175.field2033);
                    class207.field2507.method1560(arg0 ^ 27839, class333.field4549);
                    class207.field2507.method1560(-26356, class389.method2416(32364));
                    class75.field905 = true;
                    class207.field2507.method1573(-6266, class219.field2703);
                    class207.field2507.method1560(arg0 + -23719, class228.field2876.method1816(false));
                    class207.field2507.method1560(-26356, class446.field6192.method1816(false));
                    class207.field2507.method1560(-26356, class332.field4520.method1816(false));
                    class207.field2507.method1560(arg0 + -23719, class14.field174.method1816(false));
                    class207.field2507.method1560(-26356, class349.field4759.method1816(false));
                    class207.field2507.method1560(-26356, class335.field4572.method1816(false));
                    class207.field2507.method1560(arg0 ^ 27839, class150.field1738.method1816(false));
                    class207.field2507.method1560(-26356, class363.field4936.method1816(false));
                    class207.field2507.method1560(-26356, class15.field177.method1816(false));
                    class207.field2507.method1560(-26356, class319.field4287.method1816(false));
                    class207.field2507.method1560(-26356, class364.field4951.method1816(false));
                    class207.field2507.method1560(arg0 ^ 27839, client.field6060.method1816(false));
                    class207.field2507.method1560(-26356, class108.field1294.method1816(false));
                    class207.field2507.method1560(-26356, class201.field2370.method1816(false));
                    class207.field2507.method1560(-26356, class296.field3947.method1816(false));
                    class207.field2507.method1560(-26356, class434.field5936.method1816(false));
                    class207.field2507.method1560(-26356, class90.field1054.method1816(false));
                    class207.field2507.method1560(arg0 ^ 27839, class127.field1420.method1816(false));
                    class207.field2507.method1560(-26356, class382.field5236.method1816(false));
                    class207.field2507.method1560(arg0 ^ 27839, class267.field3455.method1816(false));
                    class207.field2507.method1560(-26356, class412.field5672.method1816(false));
                    class207.field2507.method1560(arg0 + -23719, class424.field5813.method1816(false));
                    class207.field2507.method1560(-26356, class429.field5867.method1816(false));
                    class207.field2507.method1560(-26356, class33.field365.method1816(false));
                    class207.field2507.method1560(arg0 ^ 27839, class28.field322.method1816(false));
                    class207.field2507.method1560(-26356, class421.field5773.method1816(false));
                    class207.field2507.method1560(arg0 ^ 27839, class282.field3682.method1816(false));
                    class207.field2507.method1560(-26356, class316.field4248.method1816(false));
                    class207.field2507.method1560(-26356, class259.field3342.method1816(false));
                    class207.field2507.method1544(class427.field5837.field3211, arg0 ^ -2564, 0, class427.field5837.field3188);
                    class181.field2107.method2464((byte) 105, 0, class207.field2507.field3211, class207.field2507.field3188);
                    class427.field5837.method2164(arg0 ^ 2610, var5);
                    for (int var6 = 0; var6 < 4; ++var6) {
                        var5[var6] += 50;
                    }
                    class215.field2658.method2164(arg0 + 2537, var5);
                    class80.field970 = 4;
                }
                if (class80.field970 == 4) {
                    if (~class181.field2107.method2467((byte) 58) > -2) {
                        return;
                    }
                    int var7 = class181.field2107.method2469(-19969);
                    if (var7 == 21) {
                        class80.field970 = 7;
                    } else if (~var7 != -30) {
                        if (~var7 == -2) {
                            class406.field5620 = var7;
                            class80.field970 = 5;
                            return;
                        }
                        if (var7 != 2) {
                            if (~var7 == -16) {
                                class80.field970 = 0;
                                class406.field5620 = var7;
                                return;
                            }
                            if (~var7 == -24 && class427.field5843 < 1) {
                                class80.field970 = 1;
                                class411.field5665 = 0;
                                ++class427.field5843;
                                class181.field2107.method2465((byte) -85);
                                class181.field2107 = null;
                                return;
                            }
                            class406.field5620 = var7;
                            class80.field970 = 0;
                            class181.field2107.method2465((byte) -85);
                            class181.field2107 = null;
                            return;
                        }
                        class80.field970 = 8;
                    } else {
                        class80.field970 = 10;
                    }
                }
                if (~class80.field970 == -7) {
                    class427.field5837.field3211 = 0;
                    class427.field5837.method2162(false, 17);
                    class181.field2107.method2464((byte) 96, 0, class427.field5837.field3211, class427.field5837.field3188);
                    class80.field970 = 4;
                } else if (~class80.field970 == -8) {
                    if (class181.field2107.method2467((byte) -119) >= 1) {
                        class332.field4539 = class181.field2107.method2469(-19969) * 60 + 180;
                        class80.field970 = 0;
                        class406.field5620 = 21;
                        class181.field2107.method2465((byte) -85);
                        class181.field2107 = null;
                    }
                } else {
                    if (arg0 != -2637) {
                        method1328(35, -20, 4, -59, -50, -3, 123);
                    }
                    if (class80.field970 == 10) {
                        if (class181.field2107.method2467((byte) 45) >= 1) {
                            class252.field3306 = class181.field2107.method2469(-19969);
                            class80.field970 = 0;
                            class406.field5620 = 29;
                            class181.field2107.method2465((byte) -85);
                            class181.field2107 = null;
                        }
                    } else {
                        if (~class80.field970 == -9) {
                            if (~class181.field2107.method2467((byte) 60) > -14) {
                                return;
                            }
                            class181.field2107.method2466(0, 13, 16752, class215.field2658.field3188);
                            class215.field2658.field3211 = 0;
                            class427.field5842 = class215.field2658.method1563(arg0 ^ 2611);
                            class267.field3453 = class215.field2658.method1563(arg0 + 2509);
                            class374.field5070 = class215.field2658.method1563(-128) == 1;
                            class265.field3419 = class215.field2658.method1563(-128) == 1;
                            class96.field1124 = ~class215.field2658.method1563(-128) == -2;
                            class352.field4788 = class215.field2658.method1563(arg0 ^ 2611) == 1;
                            class429.field5865 = class215.field2658.method1587((byte) -102);
                            class316.field4246 = ~class215.field2658.method1563(-128) == -2;
                            class357.field4843 = class215.field2658.method1563(-128) == 1;
                            class267.method1676((byte) -88, class357.field4843);
                            class152.method979(class357.field4843, -1);
                            class390.method2427(class357.field4843, 0);
                            if ((!class374.field5070 || class96.field1124) && !class316.field4246) {
                                try {
                                    class443.method2743(class401.field5525.field6077, arg0 + -21788, "unzap");
                                } catch (Throwable var9) {
                                }
                            } else {
                                try {
                                    class443.method2743(class401.field5525.field6077, -24425, "zap");
                                } catch (Throwable var10) {
                                }
                            }
                            if (~class94.field1105 == -1) {
                                try {
                                    class443.method2743(class401.field5525.field6077, -24425, "loggedin");
                                } catch (Throwable var8) {
                                }
                            }
                            class269.field3478 = class215.field2658.method2166(-103);
                            class134.field1533 = class215.field2658.method1587((byte) -102);
                            class80.field970 = 9;
                        }
                        if (~class80.field970 == -10) {
                            if (~class181.field2107.method2467((byte) -105) <= ~class134.field1533) {
                                class215.field2658.field3211 = 0;
                                class181.field2107.method2466(0, class134.field1533, arg0 ^ -19261, class215.field2658.field3188);
                                class406.field5620 = 2;
                                class80.field970 = 0;
                                class153.method987(5613);
                                class234.field3069 = -1;
                                class180.method1126(false, -126);
                                class269.field3478 = -1;
                            }
                        }
                    }
                }
            } catch (IOException var11) {
                if (class181.field2107 != null) {
                    class181.field2107.method2465((byte) -85);
                    class181.field2107 = null;
                }
                if (~class427.field5843 > -2) {
                    ++class427.field5843;
                    class411.field5665 = 0;
                    if (~class70.field874 != ~class249.field3279) {
                        class70.field874 = class249.field3279;
                    } else {
                        class70.field874 = class389.field5303;
                    }
                    class80.field970 = 1;
                } else {
                    class406.field5620 = -4;
                    class80.field970 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)I", line = 624)
    public final int method409(int arg0) {
        if (arg0 != -50) {
            this.field2682 = null;
        }
        ++field2684;
        return this.field2682.field6132;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)Z", line = 636)
    public final boolean method129(int arg0) {
        ++field2677;
        if (arg0 != 3652) {
            this.field2673 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Luo;B)V", line = 656)
    public final void method422(class118 arg0, byte arg1) {
        this.field2682.method2750(-121, arg0);
        ++field2687;
        if (arg1 != -7) {
            field2692 = 14;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Luo;I)V", line = 667)
    public static final void method1326(class118 arg0, int arg1) {
        ++field2690;
        if ((~class57.field660 <= -3 || class104.field1224) && class264.field3404 == null) {
            String var2;
            if (class104.field1224 && class57.field660 < 2) {
                var2 = class335.field4569 + class191.field2236.method434(class373.field5057, arg1 ^ -22925) + class381.field5204 + " ->";
            } else if (class384.field5257 && class261.field3359.method623(9, 81) && ~class57.field660 < -3) {
                var2 = class302.method1921(false, (class266) class97.field1138.field3483.field507.field507);
            } else {
                class266 var3 = (class266) class97.field1138.field3483.field507;
                var2 = class302.method1921(false, var3);
                int[] var4 = null;
                if (class94.method590(var3.field3424, 45)) {
                    var4 = class131.method843((byte) 5, (int) var3.field3427).field716;
                } else if (class213.method1308(var3.field3424, -50)) {
                    class298 var5 = class220.field2726[(int) var3.field3427];
                    if (var5 != null) {
                        var4 = var5.field3971.field4174;
                    }
                } else if (class276.method1737(2, var3.field3424)) {
                    if (~var3.field3424 != -1012) {
                        var4 = class380.method2361((int) (var3.field3427 >>> 32 & 2147483647L), -29012).field6220;
                    } else {
                        var4 = class380.method2361((int) var3.field3427, -29012).field6220;
                    }
                }
                if (var4 != null) {
                    var2 = var2 + class337.method2161(var4, (byte) -34);
                }
            }
            if (class57.field660 > 2) {
                var2 = var2 + "<col=ffffff> / " + (class57.field660 + -2) + class453.field6452.method434(class373.field5057, -8192);
            }
            if (class342.field4669 != null) {
                class31 var6 = class342.field4669.method2803(arg0, 31039);
                if (var6 == null) {
                    var6 = class210.field2544;
                }
                var6.method205(class342.field4669.field6357, class342.field4669.field6377, 23650, class392.field5343, class153.field1779, class342.field4669.field6476, class342.field4669.field6385, class342.field4669.field6432, class192.field2257, class342.field4669.field6473, class314.field4237, class53.field621, class141.field1662, class290.field3823, var2);
                class31.method203(class141.field1662[3], class141.field1662[2], class141.field1662[1], class141.field1662[0], 174);
            } else if (class202.field2382 != null && ~class31.field356 == -1) {
                int var7 = class210.field2544.method201(class264.field3406 - -16, class141.field1660 + 4, arg1 ^ -2145406421, class53.field621, class192.field2257, class392.field5343, var2, class314.field4237, 16777215, 0);
                class31.method203(16, var7 + class213.field2611.method2203((byte) -105, var2), class264.field3406, class141.field1660 + 4, 174);
            }
            if (arg1 != 18035) {
                field2692 = 80;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[IIZIII[IILg;IIIII)I", line = 753)
    public static final int method1327(int arg0, int[] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, class366 arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; ~var15 > -129; ++var15) {
            for (int var35 = 0; ~var35 > -129; ++var35) {
                class428.field5847[var15][var35] = 0;
                class402.field5587[var15][var35] = 99999999;
            }
        }
        if (arg4 != -9) {
            method1327(97, (int[]) null, -64, true, -117, 24, 5, (int[]) null, 10, (class366) null, 88, -113, -7, -65, 80);
        }
        ++field2689;
        boolean var16;
        if (~arg11 != -2) {
            if (arg11 == 2) {
                var16 = class287.method1829(arg2, arg5, arg13, arg12, arg8, false, arg14, arg9, arg6, arg10, arg0);
            } else {
                var16 = class345.method2194(arg9, arg13, -115, arg0, arg12, arg8, arg10, arg14, arg5, arg2, arg11, arg6);
            }
        } else {
            var16 = class97.method600(arg5, arg10, arg8, arg2, arg0, arg13, arg14, arg12, arg9, 127, arg6);
        }
        int var17 = arg5 + -64;
        int var18 = arg10 - 64;
        int var19 = class150.field1760;
        int var20 = class252.field3300;
        if (!var16) {
            if (!arg3) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = -var23 + arg13; ~var24 >= ~(arg13 + var23); ++var24) {
                for (int var25 = -var23 + arg12; ~var25 >= ~(arg12 + var23); ++var25) {
                    int var26 = -var17 + var24;
                    int var27 = -var18 + var25;
                    if (~var26 <= -1 && var27 >= 0 && var26 < 128 && ~var27 > -129 && ~class402.field5587[var26][var27] > -101) {
                        int var28 = 0;
                        if (~var24 <= ~arg13) {
                            if (arg6 + arg13 + -1 < var24) {
                                var28 = -arg6 - -1 + -arg13 + var24;
                            }
                        } else {
                            var28 = -var24 + arg13;
                        }
                        int var29 = 0;
                        if (arg12 > var25) {
                            var29 = -var25 + arg12;
                        } else if (var25 > arg12 + -1 + arg0) {
                            var29 = -arg12 - arg0 + var25 + 1;
                        }
                        int var30 = var28 * var28 - -(var29 * var29);
                        if (var21 > var30 || var21 == var30 && ~class402.field5587[var26][var27] > ~var22) {
                            var19 = var24;
                            var22 = class402.field5587[var26][var27];
                            var21 = var30;
                            var20 = var25;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (~arg5 == ~var19 && ~arg10 == ~var20) {
            return 0;
        } else {
            byte var31 = 0;
            class11.field135[var31] = var19;
            int var37 = var31 + 1;
            class261.field3355[var31] = var20;
            int var32;
            int var33 = var32 = class428.field5847[-var17 + var19][-var18 + var20];
            while (~arg5 != ~var19 || arg10 != var20) {
                if (var32 != var33) {
                    class11.field135[var37] = var19;
                    var32 = var33;
                    class261.field3355[var37++] = var20;
                }
                if (~(1 & var33) != -1) {
                    ++var20;
                } else if ((4 & var33) != 0) {
                    --var20;
                }
                if (~(var33 & 2) == -1) {
                    if (~(8 & var33) != -1) {
                        --var19;
                    }
                } else {
                    ++var19;
                }
                var33 = class428.field5847[-var17 + var19][-var18 + var20];
            }
            int var34 = 0;
            while (var37-- > 0) {
                arg1[var34] = class11.field135[var37];
                arg7[var34++] = class261.field3355[var37];
                if (var34 >= arg1.length) {
                    break;
                }
            }
            return var34;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(Luo;B)Lkj;", line = 928)
    public final class175 method130(class118 arg0, byte arg1) {
        ++field2691;
        class386 var3 = this.field2682.method2746(1024, arg0, super.field5296, super.field5297, true, false, false);
        if (var3 == null) {
            return null;
        } else {
            class450 var4 = arg0.method742();
            var4.method929(super.field5297, super.field5291, super.field5296);
            class175 var5 = null;
            if (this.field2673) {
                var5 = class68.method392((byte) -117, 1);
            }
            if (this.field2682.field6131 == null) {
                var3.method1441(var4, var5 == null ? null : var5.field2030[0], 0);
            } else {
                class291 var6 = this.field2682.field6131.method404();
                arg0.method729(var3, var6, var4, var5 == null ? null : var5.field2030[0], 0);
            }
            int var7 = -27 % ((arg1 - 11) / 37);
            this.field2682.method2754((byte) -32, arg0, var3, super.field5296 >> 7, super.field5297 >> 7, true, super.field5296 >> 7, super.field5297 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIII)V", line = 964)
    public static final void method1328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2686;
        if (arg2 != 14933) {
            field2692 = -48;
        }
        for (class303 var7 = (class303) class80.field974.method1838(-6325); var7 != null; var7 = (class303) class80.field974.method1834((byte) 91)) {
            if (class106.field1273 >= var7.field4066) {
                var7.method358(arg2 ^ 14975);
            } else {
                class320.method1996(arg1, arg3, arg6 >> 1, (var7.field4074 << 7) + 64, (var7.field4072 << 7) + 64, false, var7.field4073 * 2, arg0 >> 1);
                class210.field2544.method204(0, class242.field3234[0] + arg4, var7.field4067 | -16777216, class242.field3234[1] + arg5, false, var7.field4069);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)I", line = 995)
    public final int method417(byte arg0) {
        if (arg0 != -116) {
            this.method138((byte) 100, (class118) null);
        }
        ++field2676;
        return this.field2682.field6136;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Z", line = 1006)
    public final boolean method412(int arg0) {
        if (arg0 != 18942) {
            return true;
        } else {
            ++field2688;
            return this.field2682.method2755(-1);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Luo;II)Lge;", line = 1017)
    public final class386 method419(class118 arg0, int arg1, int arg2) {
        if (arg1 != -20264) {
            return null;
        } else {
            ++field2680;
            return this.field2682.method2746(arg2, arg0, 0, 0, false, false, false);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLuo;)V", line = 1035)
    public final void method138(byte arg0, class118 arg1) {
        ++field2681;
        if (arg0 < 78) {
            field2692 = 60;
        }
        class386 var3 = this.field2682.method2746(131072, arg1, super.field5296, super.field5297, true, false, true);
        if (var3 != null) {
            this.field2682.method2754((byte) -32, arg1, var3, super.field5296 >> 7, super.field5297 >> 7, false, super.field5296 >> 7, super.field5297 >> 7);
        }
    }
}
