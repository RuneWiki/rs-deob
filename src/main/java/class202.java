import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class class202 extends class352 {

    @OriginalMember(owner = "client!so", name = "x", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "[[S")
    public static short[][] field3119 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!so", name = "y", descriptor = "I")
    public static int field3134 = 0;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "J")
    public static long field3124;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "Lfq;")
    public static class93 field3118;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V", line = 10)
    public static void method1418(boolean arg0) {
        if (!arg0) {
            field3118 = null;
            field3119 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V", line = 22)
    public final void method108(int arg0) {
        int var2 = 19 % ((48 - arg0) / 37);
        field3112++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lwl;I)V", line = 32)
    public static final void method1419(class521 arg0, int arg1) {
        field3122++;
        arg0.field7625 = 0;
        if (arg0.field7590 != -1) {
            class61 var2 = class393.field5735.method1538(-4031, arg0.field7590);
            if (var2 == null || var2.field976 == null) {
                arg0.field7596 = false;
                arg0.field7590 = -1;
            } else {
                label400: {
                    arg0.field7611++;
                    if (var2.field976.length > arg0.field7586 && var2.field962[arg0.field7586] < arg0.field7611) {
                        arg0.field7605++;
                        arg0.field7586++;
                        arg0.field7611 = 1;
                        class439.method2721(class116.field1781 == arg0, var2, arg0.field1275, arg0.field7586, (byte) 116, arg0.field1279, arg0.field1274);
                    }
                    if (var2.field976.length <= arg0.field7586) {
                        arg0.field7611 = 0;
                        arg0.field7586 = 0;
                        if (arg0.field7596) {
                            arg0.field7590 = arg0.method3101(-1).method2880(-99);
                            if (arg0.field7590 == -1) {
                                arg0.field7596 = false;
                                break label400;
                            }
                            var2 = class393.field5735.method1538(-4031, arg0.field7590);
                        }
                        class439.method2721(class116.field1781 == arg0, var2, arg0.field1275, arg0.field7586, (byte) 116, arg0.field1279, arg0.field1274);
                    }
                    arg0.field7605 = arg0.field7586 + 1;
                    if (var2.field976.length <= arg0.field7605) {
                        arg0.field7605 = 0;
                    }
                }
            }
        }
        if (arg0.field7561 != -1 && arg0.field7595 <= class446.field6625) {
            class434 var3 = class232.field3490.method2625((byte) 116, arg0.field7561);
            int var4 = var3.field6450;
            if (var4 == -1) {
                arg0.field7561 = -1;
            } else {
                label402: {
                    class61 var5 = class393.field5735.method1538(-4031, var4);
                    if (var3.field6446) {
                        if (var5.field975 == 3) {
                            if (arg0.field7652 > 0 && arg0.field7589 <= class446.field6625 && arg0.field7585 < class446.field6625) {
                                arg0.field7561 = -1;
                                break label402;
                            }
                        } else if (var5.field975 == 1 && arg0.field7652 > 0 && class446.field6625 >= arg0.field7589 && arg0.field7585 < class446.field6625) {
                            arg0.field7595 = class446.field6625 + 1;
                            break label402;
                        }
                    }
                    if (var5 == null || var5.field976 == null) {
                        arg0.field7561 = -1;
                    } else {
                        if (arg0.field7591 < 0) {
                            arg0.field7591 = 0;
                            class439.method2721(class116.field1781 == arg0, var5, arg0.field1275, 0, (byte) 116, arg0.field1279, arg0.field1274);
                        }
                        arg0.field7594++;
                        if (arg0.field7591 < var5.field976.length && var5.field962[arg0.field7591] < arg0.field7594) {
                            arg0.field7591++;
                            arg0.field7594 = 1;
                            class439.method2721(class116.field1781 == arg0, var5, arg0.field1275, arg0.field7591, (byte) 116, arg0.field1279, arg0.field1274);
                        }
                        if (arg0.field7591 >= var5.field976.length) {
                            if (var3.field6446) {
                                arg0.field7574++;
                                arg0.field7591 -= var5.field973;
                                if (arg0.field7574 >= var5.field966) {
                                    arg0.field7561 = -1;
                                } else if (arg0.field7591 >= 0 && arg0.field7591 < var5.field976.length) {
                                    class439.method2721(class116.field1781 == arg0, var5, arg0.field1275, arg0.field7591, (byte) 116, arg0.field1279, arg0.field1274);
                                } else {
                                    arg0.field7561 = -1;
                                }
                            } else {
                                arg0.field7561 = -1;
                            }
                        }
                        arg0.field7635 = arg0.field7591 + 1;
                        if (arg0.field7635 >= var5.field976.length) {
                            if (var3.field6446) {
                                arg0.field7635 -= var5.field973;
                                if (var5.field966 <= arg0.field7574 + 1) {
                                    arg0.field7635 = -1;
                                } else if (arg0.field7635 < 0 || arg0.field7635 >= var5.field976.length) {
                                    arg0.field7635 = -1;
                                }
                            } else {
                                arg0.field7635 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field7621 != -1 && class446.field6625 >= arg0.field7558) {
            class434 var6 = class232.field3490.method2625((byte) 116, arg0.field7621);
            int var7 = var6.field6450;
            if (var7 == -1) {
                arg0.field7621 = -1;
            } else {
                label405: {
                    class61 var8 = class393.field5735.method1538(-4031, var7);
                    if (var6.field6446) {
                        if (var8.field975 == 3) {
                            if (arg0.field7652 > 0 && class446.field6625 >= arg0.field7589 && arg0.field7585 < class446.field6625) {
                                arg0.field7621 = -1;
                                break label405;
                            }
                        } else if (var8.field975 == 1 && arg0.field7652 > 0 && class446.field6625 >= arg0.field7589 && arg0.field7585 < class446.field6625) {
                            arg0.field7558 = class446.field6625 + 1;
                            break label405;
                        }
                    }
                    if (var8 == null || var8.field976 == null) {
                        arg0.field7621 = -1;
                    } else {
                        if (arg0.field7559 < 0) {
                            arg0.field7559 = 0;
                            class439.method2721(class116.field1781 == arg0, var8, arg0.field1275, 0, (byte) 116, arg0.field1279, arg0.field1274);
                        }
                        arg0.field7645++;
                        if (var8.field976.length > arg0.field7559 && arg0.field7645 > var8.field962[arg0.field7559]) {
                            arg0.field7559++;
                            arg0.field7645 = 1;
                            class439.method2721(class116.field1781 == arg0, var8, arg0.field1275, arg0.field7559, (byte) 116, arg0.field1279, arg0.field1274);
                        }
                        if (var8.field976.length <= arg0.field7559) {
                            if (var6.field6446) {
                                arg0.field7629++;
                                arg0.field7559 -= var8.field973;
                                if (arg0.field7629 >= var8.field966) {
                                    arg0.field7621 = -1;
                                } else if (arg0.field7559 >= 0 && var8.field976.length > arg0.field7559) {
                                    class439.method2721(class116.field1781 == arg0, var8, arg0.field1275, arg0.field7559, (byte) 116, arg0.field1279, arg0.field1274);
                                } else {
                                    arg0.field7621 = -1;
                                }
                            } else {
                                arg0.field7621 = -1;
                            }
                        }
                        arg0.field7633 = arg0.field7559 + 1;
                        if (var8.field976.length <= arg0.field7633) {
                            if (var6.field6446) {
                                arg0.field7633 -= var8.field973;
                                if (var8.field966 <= arg0.field7629 + 1) {
                                    arg0.field7633 = -1;
                                } else if (arg0.field7633 < 0 || arg0.field7633 >= var8.field976.length) {
                                    arg0.field7633 = -1;
                                }
                            } else {
                                arg0.field7633 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field7644 != -1 && arg0.field7588 <= 1) {
            class61 var9 = class393.field5735.method1538(-4031, arg0.field7644);
            if (var9.field975 == 3) {
                if (arg0.field7652 > 0 && arg0.field7589 <= class446.field6625 && arg0.field7585 < class446.field6625) {
                    arg0.field7644 = -1;
                }
            } else if (var9.field975 == 1 && arg0.field7652 > 0 && arg0.field7589 <= class446.field6625 && arg0.field7585 < class446.field6625) {
                arg0.field7588 = 2;
            }
        }
        if (arg0.field7644 != -1 && arg0.field7588 == 0) {
            class61 var10 = class393.field5735.method1538(-4031, arg0.field7644);
            if (var10 == null || var10.field976 == null) {
                arg0.field7644 = -1;
            } else {
                arg0.field7584++;
                if (arg0.field7551 < var10.field976.length && var10.field962[arg0.field7551] < arg0.field7584) {
                    arg0.field7551++;
                    arg0.field7584 = 1;
                    class439.method2721(class116.field1781 == arg0, var10, arg0.field1275, arg0.field7551, (byte) 116, arg0.field1279, arg0.field1274);
                }
                if (var10.field976.length <= arg0.field7551) {
                    arg0.field7604++;
                    arg0.field7551 -= var10.field973;
                    if (arg0.field7604 >= var10.field966) {
                        arg0.field7644 = -1;
                    } else if (arg0.field7551 >= 0 && arg0.field7551 < var10.field976.length) {
                        class439.method2721(class116.field1781 == arg0, var10, arg0.field1275, arg0.field7551, (byte) 116, arg0.field1279, arg0.field1274);
                    } else {
                        arg0.field7644 = -1;
                    }
                }
                arg0.field7631 = arg0.field7551 + 1;
                if (arg0.field7631 >= var10.field976.length) {
                    arg0.field7631 -= var10.field973;
                    if (var10.field966 <= arg0.field7604 + 1) {
                        arg0.field7631 = -1;
                    } else if (arg0.field7631 < 0 || arg0.field7631 >= var10.field976.length) {
                        arg0.field7631 = -1;
                    }
                }
                arg0.field7625 = var10.field963;
            }
        }
        if (arg0.field7588 > 0) {
            arg0.field7588--;
        }
        for (int var11 = 0; var11 < arg0.field7606.length; var11++) {
            class390 var13 = arg0.field7606[var11];
            if (var13 != null) {
                if (var13.field5704 > 0) {
                    var13.field5704--;
                } else {
                    class61 var14 = class393.field5735.method1538(-4031, var13.field5716);
                    if (var14 == null || var14.field976 == null) {
                        arg0.field7606[var11] = null;
                    } else {
                        var13.field5710++;
                        if (var14.field976.length > var13.field5711 && var13.field5710 > var14.field962[var13.field5711]) {
                            var13.field5710 = 1;
                            var13.field5711++;
                            class439.method2721(class116.field1781 == arg0, var14, arg0.field1275, var13.field5711, (byte) 116, arg0.field1279, arg0.field1274);
                        }
                        if (var14.field976.length <= var13.field5711) {
                            var13.field5709++;
                            var13.field5711 -= var14.field973;
                            if (var13.field5709 >= var14.field966) {
                                arg0.field7606[var11] = null;
                            } else if (var13.field5711 >= 0 && var13.field5711 < var14.field976.length) {
                                class439.method2721(class116.field1781 == arg0, var14, arg0.field1275, var13.field5711, (byte) 116, arg0.field1279, arg0.field1274);
                            } else {
                                arg0.field7606[var11] = null;
                            }
                        }
                        var13.field5707 = var13.field5711 + 1;
                        if (var14.field976.length <= var13.field5707) {
                            var13.field5707 -= var14.field973;
                            if (var13.field5709 + 1 >= var14.field966) {
                                var13.field5707 = -1;
                            } else if (var13.field5707 < 0 || var13.field5707 >= var14.field976.length) {
                                var13.field5707 = -1;
                            }
                        }
                    }
                }
            }
        }
        int var12 = 83 % ((arg1 - 5) / 45);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIII)V", line = 459)
    public static final void method1420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class372.field5520 = arg4;
        if (arg3 != 0) {
            method1419(null, 100);
        }
        class407.field6016 = arg5;
        class337.field5071 = arg6;
        field3116++;
        class468.field6891 = arg0;
        class299.field4593 = arg1;
        client.field7546 = arg2;
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(B)Z", line = 477)
    public final boolean method107(byte arg0) {
        if (arg0 != -88) {
            this.field3121 = -69;
        }
        field3123++;
        return false;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IC)Z", line = 491)
    public static final boolean method1422(int arg0, char arg1) {
        field3130++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg0 < 122) {
            return false;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V", line = 512)
    public static final void method1423(int arg0, int arg1) {
        class287.field4472 = 100;
        class53.field810 = -1;
        if (arg0 != 27266) {
            field3117 = -5;
        }
        class237.field3569 = arg1;
        class178.field2722 = 3;
        field3129++;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/net/Socket;I)Lhg;", line = 529)
    public static final class372 method1424(int arg0, Socket arg1, int arg2) throws IOException {
        if (arg2 != -1) {
            method1423(-17, 38);
        }
        field3128++;
        return new class328(arg1, arg0);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(CI)Z", line = 540)
    public static final boolean method1425(char arg0, int arg1) {
        field3127++;
        int var2 = -77 % ((arg1 - 41) / 52);
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var3 = class348.field5198;
            for (int var4 = 0; var4 < var3.length; var4++) {
                char var5 = var3[var4];
                if (arg0 == var5) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lza;IIILps;IZ)V", line = 580)
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        if (arg3 != -750) {
            method1418(true);
        }
        field3115++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(IIIIIII)V", line = 591)
    public class202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3133 = arg1;
        this.field3114 = arg2;
        this.field3131 = arg4;
        this.field3126 = arg0;
        this.field3120 = arg5;
        this.field3121 = arg6;
        this.field3132 = arg3;
    }

    @OriginalMember(owner = "client!so", name = "d", descriptor = "(B)I")
    public abstract int method1421(byte arg0);
}
