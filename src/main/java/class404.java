import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class404 extends class12 {

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field5616 = 0;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public int field5603;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public int field5611;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public int field5612;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public int field5617;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "J")
    public long field5607;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sh", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field5618;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "[I")
    public static int[] field5605;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2456(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZ)V", line = 5)
    public static final void method2452(boolean arg0, boolean arg1) {
        field5608++;
        if (arg1) {
            if (class312.field4004 != -1) {
                class295.method1736(class312.field4004, -1);
            }
            for (class14 var2 = (class14) class426.field5894.method1382(27901); var2 != null; var2 = (class14) class426.field5894.method1383(false)) {
                if (!var2.method3064(10343)) {
                    var2 = (class14) class426.field5894.method1382(27901);
                    if (var2 == null) {
                        break;
                    }
                }
                class197.method1325(var2, (byte) 102, false, true);
            }
            class312.field4004 = -1;
            class426.field5894 = new class209(8);
            class77.method471(true);
            class312.field4004 = class704.field9788;
            class636.method3700(false, 1);
            class330.method1918(7);
            class318.method1836(class312.field4004);
        }
        class392.field5460 = "";
        class552.field7816 = "";
        class457.field6283 = false;
        class500.method2990(-1);
        class565.field8033 = -1;
        class156.method987(arg0, class623.field8898);
        class473.field6483 = new class655();
        class473.field6483.field9490 = class514.field7179 * 512 / 2;
        class473.field6483.field8421[0] = class514.field7179 / 2;
        class473.field6483.field9489 = class456.field6281 * 512 / 2;
        class473.field6483.field8414[0] = class456.field6281 / 2;
        class235.field3250 = 0;
        class24.field266 = 0;
        if (class665.field9377 == 2) {
            class235.field3250 = class676.field9532 << 9;
            class24.field266 = class651.field9208 << 9;
        } else {
            class413.method2518(81);
        }
        class507.method3027(-1);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I", line = 66)
    public final int method63(int arg0) {
        if (arg0 == 5245) {
            field5614++;
            return this.field5611;
        } else {
            return 76;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I", line = 77)
    public final int method62(byte arg0) {
        if (arg0 >= -26) {
            field5605 = null;
        }
        field5613++;
        return this.field5612;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)I", line = 93)
    public final int method67(byte arg0) {
        field5610++;
        int var2 = 86 / ((arg0 - 21) / 43);
        return this.field5603;
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)J", line = 103)
    public final long method68(byte arg0) {
        if (arg0 != -47) {
            field5609 = -111;
        }
        field5615++;
        return this.field5607;
    }

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)V", line = 115)
    public static void method2453(int arg0) {
        field5605 = null;
        int var1 = 73 % ((arg0 + 59) / 47);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)I", line = 124)
    public final int method64(int arg0) {
        field5602++;
        if (arg0 != -1) {
            this.method63(30);
        }
        return this.field5617;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZIILha;IIII)V", line = 135)
    public static final void method2454(int arg0, boolean arg1, int arg2, int arg3, class545 arg4, int arg5, int arg6, int arg7, int arg8) {
        field5606++;
        if (!arg1) {
            method2452(true, true);
        }
        class649 var9 = (class649) class204.method1367(arg7, arg5, arg2);
        if (var9 != null) {
            class30 var10 = class264.field3604.method3188(var9.method275(24263), (byte) -57);
            int var11 = var9.method269(-17174) & 0x3;
            int var12 = var9.method276(-25963);
            if (var10.field404 == -1) {
                int var13 = arg6;
                if (var10.field467 > 0) {
                    var13 = arg0;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg4.method3260(-36, arg3, var13, 4, arg8);
                    } else if (var11 == 1) {
                        arg4.method3264(arg8, (byte) 79, var13, arg3, 4);
                    } else if (var11 == 2) {
                        arg4.method3260(-32, arg3 + 3, var13, 4, arg8);
                    } else if (var11 == 3) {
                        arg4.method3264(arg8 + 3, (byte) 81, var13, arg3, 4);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg4.method3255(1, 1, arg3, var13, (byte) -128, arg8);
                    } else if (var11 == 1) {
                        arg4.method3255(1, 1, arg3 + 3, var13, (byte) 122, arg8);
                    } else if (var11 == 2) {
                        arg4.method3255(1, 1, arg3 + 3, var13, (byte) 115, arg8 + 3);
                    } else if (var11 == 3) {
                        arg4.method3255(1, 1, arg3, var13, (byte) 114, arg8 + 3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg4.method3264(arg8, (byte) 80, var13, arg3, 4);
                    } else if (var11 == 1) {
                        arg4.method3260(-75, arg3 + 3, var13, 4, arg8);
                    } else if (var11 == 2) {
                        arg4.method3264(arg8 + 3, (byte) 80, var13, arg3, 4);
                    } else if (var11 == 3) {
                        arg4.method3260(-116, arg3, var13, 4, arg8);
                    }
                }
            } else {
                class19.method95(arg8, arg4, arg3, arg1, var10, var11);
            }
        }
        class649 var14 = (class649) class151.method970(arg7, arg5, arg2, field5618 == null ? (field5618 = method2456("vea")) : field5618);
        if (var14 != null) {
            class30 var15 = class264.field3604.method3188(var14.method275(24263), (byte) -57);
            int var16 = var14.method269(-17174) & 0x3;
            int var17 = var14.method276(-25963);
            if (var15.field404 != -1) {
                class19.method95(arg8, arg4, arg3, true, var15, var16);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field467 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg4.method3259(arg8 + 3, arg8, arg3, arg3 + 3, (byte) -91, var18);
                } else {
                    arg4.method3259(arg8, arg8 + 3, arg3, arg3 + 3, (byte) -91, var18);
                }
            }
        }
        class649 var19 = (class649) class340.method1963(arg7, arg5, arg2);
        if (var19 == null) {
            return;
        }
        class30 var20 = class264.field3604.method3188(var19.method275(24263), (byte) -57);
        int var21 = var19.method269(-17174) & 0x3;
        if (var20.field404 != -1) {
            class19.method95(arg8, arg4, arg3, true, var20, var21);
            return;
        }
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(B)V", line = 275)
    public static final void method2455(byte arg0) {
        if (arg0 <= 89) {
            field5605 = null;
        }
        field5604++;
        class336[] var1 = class704.field9787;
        synchronized (class704.field9787) {
            for (int var2 = 0; var2 < class704.field9787.length; var2++) {
                class704.field9787[var2] = new class336();
                class296.field3860[var2] = 0;
            }
        }
    }
}
