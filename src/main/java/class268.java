import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class268 {

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field4304 = -1;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "Lpi;")
    public static class201 field4311 = new class201(64);

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "[I")
    public static int[] field4315 = new int[200];

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public int field4299;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public int field4306;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public int field4307;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "Llc;")
    public static class270 field4314;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "Ljava/awt/Frame;")
    public static Frame field4312;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILke;)V")
    public static final void method1846(int arg0, class248 arg1) {
        arg1.field3739 = false;
        field4296++;
        if (arg1.field3752 != -1) {
            class76 var2 = class232.method1609((byte) -32, arg1.field3752);
            if (var2 == null || var2.field1191 == null) {
                arg1.field3752 = -1;
            } else {
                arg1.field3732++;
                if (var2.field1191.length > arg1.field3685 && var2.field1194[arg1.field3685] < arg1.field3732) {
                    arg1.field3708++;
                    arg1.field3732 = 1;
                    arg1.field3685++;
                    class32.method208(arg1.field3660, arg1.field3685, true, class213.field3139 == arg1, arg1.field3753, var2);
                }
                if (var2.field1191.length <= arg1.field3685) {
                    arg1.field3732 = 0;
                    arg1.field3685 = 0;
                    class32.method208(arg1.field3660, arg1.field3685, true, class213.field3139 == arg1, arg1.field3753, var2);
                }
                arg1.field3708 = arg1.field3685 + 1;
                if (arg1.field3708 >= var2.field1191.length) {
                    arg1.field3708 = 0;
                }
            }
        }
        if (arg1.field3718 != -1 && arg1.field3706 <= class199.field2930) {
            class120 var3 = class152.method1126(arg1.field3718, (byte) -1);
            int var4 = var3.field1944;
            if (var4 == -1) {
                arg1.field3718 = -1;
            } else {
                label294: {
                    class76 var5 = class232.method1609((byte) -32, var4);
                    if (var3.field1947) {
                        if (var5.field1212 == 3) {
                            if (arg1.field3695 > 0 && class199.field2930 >= arg1.field3682 && class199.field2930 > arg1.field3658) {
                                arg1.field3718 = -1;
                                break label294;
                            }
                        } else if (var5.field1212 == 1 && arg1.field3695 > 0 && class199.field2930 >= arg1.field3682 && arg1.field3658 < class199.field2930) {
                            arg1.field3706 = class199.field2930 + 1;
                            break label294;
                        }
                    }
                    if (var5 == null || var5.field1191 == null) {
                        arg1.field3718 = -1;
                    } else {
                        if (arg1.field3672 < 0) {
                            arg1.field3672 = 0;
                            class32.method208(arg1.field3660, 0, true, class213.field3139 == arg1, arg1.field3753, var5);
                        }
                        arg1.field3689++;
                        if (var5.field1191.length > arg1.field3672 && var5.field1194[arg1.field3672] < arg1.field3689) {
                            arg1.field3672++;
                            arg1.field3689 = 1;
                            class32.method208(arg1.field3660, arg1.field3672, true, class213.field3139 == arg1, arg1.field3753, var5);
                        }
                        if (arg1.field3672 >= var5.field1191.length) {
                            if (var3.field1947) {
                                arg1.field3716++;
                                arg1.field3672 -= var5.field1186;
                                if (var5.field1198 <= arg1.field3716) {
                                    arg1.field3718 = -1;
                                } else if (arg1.field3672 >= 0 && arg1.field3672 < var5.field1191.length) {
                                    class32.method208(arg1.field3660, arg1.field3672, true, class213.field3139 == arg1, arg1.field3753, var5);
                                } else {
                                    arg1.field3718 = -1;
                                }
                            } else {
                                arg1.field3718 = -1;
                            }
                        }
                        arg1.field3688 = arg1.field3672 + 1;
                        if (var5.field1191.length <= arg1.field3688) {
                            if (var3.field1947) {
                                arg1.field3688 -= var5.field1186;
                                if (var5.field1198 <= (arg1.field3716 + 1)) {
                                    arg1.field3688 = -1;
                                } else if (arg1.field3688 < 0 || var5.field1191.length <= arg1.field3688) {
                                    arg1.field3688 = -1;
                                }
                            } else {
                                arg1.field3688 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field3741 != -1 && arg1.field3677 <= 1) {
            class76 var6 = class232.method1609((byte) -32, arg1.field3741);
            if (var6.field1212 == 3) {
                if (arg1.field3695 > 0 && arg1.field3682 <= class199.field2930 && class199.field2930 > arg1.field3658) {
                    arg1.field3741 = -1;
                }
            } else if (var6.field1212 == 1 && arg1.field3695 > 0 && arg1.field3682 <= class199.field2930 && class199.field2930 > arg1.field3658) {
                arg1.field3677 = 2;
            }
        }
        if (arg1.field3741 != -1 && arg1.field3677 == 0) {
            class76 var7 = class232.method1609((byte) -32, arg1.field3741);
            if (var7 == null || var7.field1191 == null) {
                arg1.field3741 = -1;
            } else {
                arg1.field3740++;
                if (arg1.field3747 < var7.field1191.length && var7.field1194[arg1.field3747] < arg1.field3740) {
                    arg1.field3747++;
                    arg1.field3740 = 1;
                    class32.method208(arg1.field3660, arg1.field3747, true, class213.field3139 == arg1, arg1.field3753, var7);
                }
                if (var7.field1191.length <= arg1.field3747) {
                    arg1.field3747 -= var7.field1186;
                    arg1.field3713++;
                    if (arg1.field3713 >= var7.field1198) {
                        arg1.field3741 = -1;
                    } else if (arg1.field3747 >= 0 && arg1.field3747 < var7.field1191.length) {
                        class32.method208(arg1.field3660, arg1.field3747, true, class213.field3139 == arg1, arg1.field3753, var7);
                    } else {
                        arg1.field3741 = -1;
                    }
                }
                arg1.field3692 = arg1.field3747 + 1;
                if (var7.field1191.length <= arg1.field3692) {
                    arg1.field3692 -= var7.field1186;
                    if (var7.field1198 <= (arg1.field3713 + 1)) {
                        arg1.field3692 = -1;
                    } else if (arg1.field3692 < 0 || var7.field1191.length <= arg1.field3692) {
                        arg1.field3692 = -1;
                    }
                }
                arg1.field3739 = var7.field1200;
            }
        }
        if (arg1.field3677 > 0) {
            arg1.field3677--;
        }
        int var8 = 0;
        if (arg0 != 3) {
            method1847((byte) -122);
        }
        while (var8 < arg1.field3678.length) {
            class152 var9 = arg1.field3678[var8];
            if (var9 != null) {
                if (var9.field2406 > 0) {
                    var9.field2406--;
                } else {
                    class76 var10 = class232.method1609((byte) -32, var9.field2404);
                    if (var10 == null || var10.field1191 == null) {
                        arg1.field3678[var8] = null;
                    } else {
                        var9.field2401++;
                        if (var10.field1191.length > var9.field2403 && var9.field2401 > var10.field1194[var9.field2403]) {
                            var9.field2403++;
                            var9.field2401 = 1;
                            class32.method208(arg1.field3660, var9.field2403, true, class213.field3139 == arg1, arg1.field3753, var10);
                        }
                        if (var10.field1191.length <= var9.field2403) {
                            var9.field2405++;
                            var9.field2403 -= var10.field1186;
                            if (var9.field2405 >= var10.field1198) {
                                arg1.field3678[var8] = null;
                            } else if (var9.field2403 >= 0 && var9.field2403 < var10.field1191.length) {
                                class32.method208(arg1.field3660, var9.field2403, true, class213.field3139 == arg1, arg1.field3753, var10);
                            } else {
                                arg1.field3678[var8] = null;
                            }
                        }
                        var9.field2400 = var9.field2403 + 1;
                        if (var9.field2400 >= var10.field1191.length) {
                            var9.field2400 -= var10.field1186;
                            if ((var9.field2405 + 1) >= var10.field1198) {
                                var9.field2400 = -1;
                            } else if (var9.field2400 < 0 || var9.field2400 >= var10.field1191.length) {
                                var9.field2400 = -1;
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method1847(byte arg0) {
        field4314 = null;
        field4315 = null;
        int var1 = -3 / ((-arg0 - 60) / 37);
        field4312 = null;
        field4311 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZILhc;)V")
    private final void method1848(boolean arg0, int arg1, class53 arg2) {
        if (arg1 == 1) {
            this.field4306 = arg2.method331(-22);
            this.field4299 = arg2.method366(-16505);
            this.field4307 = arg2.method366(-16505);
        }
        if (arg0) {
            field4303 = 124;
        }
        field4297++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V")
    public static final void method1849(byte arg0, int arg1) {
        class181.field2724.method1416(arg1, 0);
        if (arg0 > 24) {
            field4308++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    public static final void method1850(byte arg0) {
        field4298++;
        class92.field1488.method680(arg0 ^ 0xFFFFFFEC);
        int var1 = class92.field1488.method688((byte) 61, 8);
        if (class12.field135 > var1) {
            for (int var2 = var1; var2 < class12.field135; var2++) {
                class287.field4605[class106.field1815++] = class14.field159[var2];
            }
        }
        if (class12.field135 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class12.field135 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class14.field159[var3];
            class12 var5 = class255.field3856[var4];
            int var6 = class92.field1488.method688((byte) 65, 1);
            if (var6 == 0) {
                class14.field159[class12.field135++] = var4;
                var5.field3749 = class199.field2930;
            } else {
                int var7 = class92.field1488.method688((byte) 53, 2);
                if (var7 == 0) {
                    class14.field159[class12.field135++] = var4;
                    var5.field3749 = class199.field2930;
                    class48.field670[class284.field4574++] = var4;
                } else if (var7 == 1) {
                    class14.field159[class12.field135++] = var4;
                    var5.field3749 = class199.field2930;
                    int var8 = class92.field1488.method688((byte) -113, 3);
                    var5.method1711(var8, 15711, 1);
                    int var9 = class92.field1488.method688((byte) -126, 1);
                    if (var9 == 1) {
                        class48.field670[class284.field4574++] = var4;
                    }
                } else if (var7 == 2) {
                    class14.field159[class12.field135++] = var4;
                    var5.field3749 = class199.field2930;
                    if (class92.field1488.method688((byte) -126, 1) == 1) {
                        int var11 = class92.field1488.method688((byte) 117, 3);
                        var5.method1711(var11, 15711, 2);
                        int var12 = class92.field1488.method688((byte) 22, 3);
                        var5.method1711(var12, 15711, 2);
                    } else {
                        int var10 = class92.field1488.method688((byte) 82, 3);
                        var5.method1711(var10, 15711, 0);
                    }
                    int var13 = class92.field1488.method688((byte) -121, 1);
                    if (var13 == 1) {
                        class48.field670[class284.field4574++] = var4;
                    }
                } else if (var7 == 3) {
                    class287.field4605[class106.field1815++] = var4;
                }
            }
        }
        if (arg0 != -28) {
            field4304 = 106;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lhc;I)V")
    public final void method1851(class53 arg0, int arg1) {
        if (arg1 <= 61) {
            this.field4306 = -22;
        }
        while (true) {
            int var3 = arg0.method366(-16505);
            if (var3 == 0) {
                field4310++;
                return;
            }
            this.method1848(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIZLec;I)Z")
    public static final boolean method1852(int arg0, int arg1, int arg2, int arg3, boolean arg4, class93 arg5, int arg6) {
        class163 var7 = class149.method1111(arg5.field1550, 14924);
        field4300++;
        if (var7.field2522 == -1) {
            return true;
        }
        int var8;
        if (arg5.field1519) {
            int var9 = arg5.field1547 + arg0;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class176 var10 = var7.method1179(arg4, arg5.field1551, var8);
        if (var10 == null) {
            return false;
        }
        int var11 = arg5.field1544;
        int var12 = arg5.field1557;
        if ((var8 & 0x1) == 1) {
            var11 = arg5.field1557;
            var12 = arg5.field1544;
        }
        int var13 = var10.field2247;
        int var14 = var10.field2253;
        if (var7.field2529) {
            var14 = var11 * 4;
            var13 = var12 * 4;
        }
        if (var7.field2525 == 0) {
            var10.method1263((arg1 * 4) + 48, (104 - arg6 + -var12) * 4 + 48, var14, var13);
        } else {
            var10.method1253((arg1 * 4) + 48, (-arg6 - var12 + 104) * 4 + 48, var14, var13, var7.field2525);
        }
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBII)V")
    public static final void method1853(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 23) {
            field4304 = 52;
        }
        class279 var4 = class111.method844(arg2, 11, -1780180960);
        var4.method1928(false);
        var4.field4505 = arg3;
        field4309++;
        var4.field4489 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
    public static final void method1854(byte arg0) {
        field4305++;
        if (class171.field2581) {
            return;
        }
        class180.field2709 = true;
        if (class299.field4829) {
            class102.field1736 = (float) ((int) class102.field1736 + 191 & 0xFFFFFF80);
        } else {
            class280.field4521 += (24.0F - class280.field4521) / 2.0F;
        }
        class171.field2581 = true;
        if (arg0 != 78) {
            method1852(-51, -105, -71, -6, true, (class93) null, -70);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V")
    public static final void method1855(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4302++;
        class101 var5 = (class101) class142.field2308.method1073(-1, (long) arg4);
        if (var5 == null) {
            var5 = new class101();
            class142.field2308.method1074((byte) 39, var5, (long) arg4);
        }
        if (arg1 >= var5.field1717.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field1717.length; var8++) {
                var6[var8] = var5.field1717[var8];
                var7[var8] = var5.field1713[var8];
            }
            for (int var9 = var5.field1717.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1717 = var6;
            var5.field1713 = var7;
        }
        var5.field1717[arg1] = arg2;
        var5.field1713[arg1] = arg0;
        int var10 = 32 / ((arg3 - 47) / 62);
    }
}
