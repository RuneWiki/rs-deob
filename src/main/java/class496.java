import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class496 extends class202 {

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!rs", name = "P", descriptor = "[Lso;")
    private class73[] field7471;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = 52 % ((-46 - arg1) / 50);
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field3071 = arg0.method1445(125) == 1;
            }
        } else {
            this.field7471 = new class73[arg0.method1445(89)];
            for (int var5 = 0; var5 < this.field7471.length; ++var5) {
                int var6 = arg0.method1445(-74);
                if (~var6 != -1) {
                    if (~var6 != -2) {
                        if (var6 != 2) {
                            if (~var6 == -4) {
                                this.field7471[var5] = class303.method2039(arg0, false);
                            }
                        } else {
                            this.field7471[var5] = class413.method2633(arg0, 121);
                        }
                    } else {
                        this.field7471[var5] = class306.method2059(arg0, 5);
                    }
                } else {
                    this.field7471[var5] = class171.method1082(0, arg0);
                }
            }
        }
        ++field7466;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B[[I)V")
    private final void method3032(byte arg0, int[][] arg1) {
        ++field7469;
        int var3 = class276.field4375;
        if (arg0 != -22) {
            this.field7471 = null;
        }
        int var4 = class249.field4051;
        class379.method2451(arg1, (byte) -38);
        class376.method2433(0, class538.field7882, class335.field5237, 0, 0);
        if (this.field7471 != null) {
            for (int var5 = 0; this.field7471.length > var5; ++var5) {
                class73 var6 = this.field7471[var5];
                int var7 = var6.field1096;
                int var8 = var6.field1098;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method538(var3, false, var4);
                    }
                } else if (var8 >= 0) {
                    var6.method537(var3, var4, (byte) -124);
                } else {
                    var6.method532(var4, var3, (byte) -67);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
    public class496() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
    public static final void method3033(byte arg0) {
        ++field7468;
        class479.method2962(-106, class477.field7309);
        ++class479.field7322;
        if (class387.field5906 && class6.field76) {
            int var1 = class472.field7240.method2038(-49);
            int var2 = class472.field7240.method2043((byte) -109);
            int var3 = var2 - class38.field383;
            int var4 = var1 - class7.field87;
            if (~var4 > ~class56.field904) {
                var4 = class56.field904;
            }
            if (class477.field7309.field6615 + var4 > class56.field904 + class326.field5117.field6615) {
                var4 = class56.field904 + class326.field5117.field6615 + -class477.field7309.field6615;
            }
            if (arg0 != -119) {
                method3034(false, true);
            }
            if (~var3 > ~class390.field5931) {
                var3 = class390.field5931;
            }
            if (~(class390.field5931 + class326.field5117.field6730) > ~(class477.field7309.field6730 + var3)) {
                var3 = class390.field5931 - -class326.field5117.field6730 + -class477.field7309.field6730;
            }
            int var5 = -class56.field904 + var4 + class326.field5117.field6649;
            int var6 = -class390.field5931 + var3 - -class326.field5117.field6613;
            if (!class472.field7240.method2727(6)) {
                if (class361.field5593) {
                    class497.method3038(91);
                    if (class477.field7309.field6696 != null) {
                        class491 var7 = new class491();
                        var7.field7430 = class477.field7309.field6696;
                        var7.field7426 = var6;
                        var7.field7422 = class309.field4834;
                        var7.field7423 = class477.field7309;
                        var7.field7424 = var5;
                        class420.method2673(var7);
                    }
                    if (class309.field4834 != null && client.method500(class477.field7309) != null) {
                        class188.method1178(class477.field7309, class309.field4834, -124);
                    }
                } else if ((~class247.field4006 == -2 || class385.method2483(-107)) && class501.field7514 > 2) {
                    class225.method1626(class38.field383 - -class319.field4974, class7.field87 + class169.field2478, 0);
                } else if (class327.method2185(true)) {
                    class225.method1626(class38.field383 + class319.field4974, class7.field87 + class169.field2478, 0);
                }
                class477.field7309 = null;
            } else {
                if (class477.field7309.field6650 < class479.field7322) {
                    int var8 = -class169.field2478 + var4;
                    int var9 = -class319.field4974 + var3;
                    if (~class477.field7309.field6655 > ~var8 || -class477.field7309.field6655 > var8 || ~class477.field7309.field6655 > ~var9 || ~var9 > ~(-class477.field7309.field6655)) {
                        class361.field5593 = true;
                    }
                }
                if (class477.field7309.field6653 != null && class361.field5593) {
                    class491 var10 = new class491();
                    var10.field7430 = class477.field7309.field6653;
                    var10.field7423 = class477.field7309;
                    var10.field7426 = var6;
                    var10.field7424 = var5;
                    class420.method2673(var10);
                }
            }
        } else {
            if (~class479.field7322 < -2) {
                class477.field7309 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZZ)V")
    public static final void method3034(boolean arg0, boolean arg1) {
        if (class338.field5281 != null) {
            class338.field5281.method1892(90);
            class338.field5281 = null;
        }
        ++field7465;
        class46.field606 = 0;
        class54.method410(20250);
        class148.method905();
        for (int var2 = 0; var2 < 4; ++var2) {
            class352.field5488[var2].method1907(120);
        }
        class94.method642(17795, false);
        System.gc();
        class78.method564((byte) 14, 2);
        class5.field55 = false;
        class236.field3874 = -1;
        class256.method1753((byte) 122, arg0);
        class95.field1386 = 0;
        class357.field5545 = 0;
        class149.field2001 = 0;
        class517.field7675 = 0;
        class453.field7018 = 0;
        class126.field1718 = 0;
        for (int var3 = 0; ~var3 > ~class323.field5076.length; ++var3) {
            class323.field5076[var3] = null;
        }
        class346.method2290((byte) -117);
        for (int var4 = 0; ~var4 > -2049; ++var4) {
            class264.field4276[var4] = null;
        }
        class378.field5815 = 0;
        class365.field5659.method1128(124);
        class78.field1176 = 0;
        class328.field5157.method1128(-75);
        class325.method2174(1);
        class159.field2168 = 0;
        class96.field1394.method1986((byte) 7);
        class319.method2138((byte) -126);
        class211.method1525(false);
        class34.field353 = null;
        class360.field5576 = 0L;
        if (!arg1) {
            class89.method610(2, (byte) -116);
            try {
                class200.method1370(-22, class339.field5294.field27, "loggedout");
            } catch (Throwable var5) {
            }
        } else {
            class89.method610(11, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field7467;
        if (arg0 != -1) {
            method3033((byte) 82);
        }
        int[][] var3 = super.field3081.method1050(arg1, arg0 + 65);
        if (super.field3081.field2432) {
            int var4 = class276.field4375;
            int var5 = class249.field4051;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field3081.method1048((byte) -53);
            this.method3032((byte) -22, var6);
            for (int var8 = 0; var8 < class249.field4051; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class276.field4375; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class272.method1842(4080, var15 << 4);
                    var12[var14] = class272.method1842(65280, var15) >> 4;
                    var11[var14] = class272.method1842(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field7464;
        int[] var3 = super.field3064.method2452((byte) 22, arg0);
        if (!arg1) {
            return null;
        } else {
            if (super.field3064.field5837) {
                this.method3032((byte) -22, super.field3064.method2450(0));
            }
            return var3;
        }
    }

    static {
        new class213("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
    }
}
