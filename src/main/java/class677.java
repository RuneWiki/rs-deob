import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class677 extends class331 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!hca", name = "v", descriptor = "Ltf;")
    private class524 field9486 = new class524();

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "Ltf;")
    private class524 field9496 = new class524();

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "[Z")
    private boolean[] field9497 = new boolean[112];

    @OriginalMember(owner = "client!hca", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field9499 = new String[] { method4858(method4857("\u0003pz\u0015,C")), method4858(method4857("\u0003pz\u0015 C")), method4858(method4857("\u0003pz\u0015$C")), method4858(method4857("\u0003pz\u0015!C")), method4858(method4857("\u0003pz\u0015)C")), method4858(method4857("\u0003pz\u0015%C")), method4858(method4857("\u001e\u007f")), method4858(method4857("\u001e~")), method4858(method4857("\u0010=5\u0015\u001a")), method4858(method4857("\u0005fwW")), method4858(method4857("\u0003pz\u0015\f\u000ejI^\u000b\u000erh^\u0003C")), method4858(method4857("\u0003pz\u0015\u0001\u0004pnH+\u0004`o\u0013")), method4858(method4857("\u0003pz\u0015+C")), method4858(method4857("\u0003pz\u0015-C")), method4858(method4857("\u0003pz\u0015*C")), method4858(method4857("\u0003pz\u0015\f\u000ejOB\u0017\u000ew3")), method4858(method4857("\u0003pz\u0015\u0001\u0004pnH \nzu^\u0003C")), method4858(method4857("\u0003pz\u0015/C")), method4858(method4857("\u0003pz\u0015.C")), method4858(method4857("\u0003pz\u0015#C")), method4858(method4857("\u0003pz\u0015[\u0002}rOYC")), method4858(method4857("\u0003pz\u0015&C")), method4858(method4857("\u0003pz\u0015\"C")), method4858(method4857("\u0003pz\u0015\f\u000ejKI\u0002\u0018`~_O")) };

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "[Lcj;")
    public static class527[] field9494 = new class527[1024];

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "Lsb;")
    public static class261 field9493 = new class261(110, 0);

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field9475;

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!hca", name = "x", descriptor = "I")
    public static int field9478;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public static int field9480;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public static int field9481;

    @OriginalMember(owner = "client!hca", name = "w", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!hca", name = "u", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!hca", name = "y", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!hca", name = "t", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
    public static int field9491;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
    public static int field9492;

    @OriginalMember(owner = "client!hca", name = "A", descriptor = "I")
    public static int field9495;

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field9498;

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "[Ls;")
    public static class751[] field9474;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
    public static final boolean method4847(int arg0, int arg1, int arg2) {
        try {
            int var3 = 114 / ((arg2 - 73) / 52);
            field9492++;
            if (arg1 == 11) {
                arg1 = 10;
            }
            class789 var4 = class101.field1359.method2832(122, arg0);
            if (arg1 >= 5 && arg1 <= 8) {
                arg1 = 4;
            }
            return var4.method5693(-81, arg1);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9499[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        try {
            field9478++;
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && class240.method1984(22, var2)) {
                this.method4856(var2, (byte) 119, -1, 3);
                arg0.consume();
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9499[15] + (arg0 == null ? field9499[9] : field9499[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)I")
    private final int method4848(int arg0) {
        try {
            field9485++;
            int var2 = 0;
            if (this.field9497[81]) {
                var2 |= 0x1;
            }
            if (this.field9497[82]) {
                var2 |= 0x4;
            }
            if (arg0 != 2) {
                this.field9496 = null;
            }
            if (this.field9497[86]) {
                var2 |= 0x2;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9499[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        try {
            field9483++;
            this.method4855(arg0, 0, 0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9499[23] + (arg0 == null ? field9499[9] : field9499[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        try {
            this.method4856('\u0000', (byte) 100, 0, -1);
            field9475++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9499[11] + (arg0 == null ? field9499[9] : field9499[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILqo;I)V")
    public static final void method4849(int arg0, class170 arg1, int arg2) {
        try {
            if (arg0 != 512) {
                field9493 = null;
            }
            field9482++;
            int var3 = -1;
            int var4 = 0;
            if (arg1.field2237 > class694.field9700) {
                class176.method1476(arg1, (byte) -122);
            } else if (arg1.field2246 >= class694.field9700) {
                class798.method5759(arg1, 94);
            } else {
                client.method4954((byte) 109, false, arg1);
                var4 = class71.field1036;
                var3 = class657.field9310;
            }
            if (arg1.field2969 < 512 || arg1.field2984 < 512 || arg1.field2969 >= class625.field8929 * 512 - 512 || ((class14.field187 - 1) * 512) <= arg1.field2984) {
                arg1.field2228.method840(-1, false);
                for (int var5 = 0; var5 < arg1.field2230.length; var5++) {
                    arg1.field2230[var5].field6627 = -1;
                    arg1.field2230[var5].field6631.method840(-1, false);
                }
                var3 = -1;
                arg1.field2194 = null;
                var4 = 0;
                arg1.field2246 = 0;
                arg1.field2237 = 0;
                arg1.field2969 = arg1.field2252[0] * 512 + (arg1.method1437((byte) -28) * 256);
                arg1.field2984 = arg1.field2256[0] * 512 + (arg1.method1437((byte) -28) * 256);
                arg1.method1438((byte) 113);
            }
            if (class203.field2988 == arg1 && (arg1.field2969 < 6144 || arg1.field2984 < 6144 || (class625.field8929 * 512 - 6144) <= arg1.field2969 || class14.field187 * 512 - 6144 <= arg1.field2984)) {
                arg1.field2228.method840(-1, false);
                for (int var6 = 0; var6 < arg1.field2230.length; var6++) {
                    arg1.field2230[var6].field6627 = -1;
                    arg1.field2230[var6].field6631.method840(-1, false);
                }
                var4 = 0;
                arg1.field2237 = 0;
                arg1.field2194 = null;
                var3 = -1;
                arg1.field2246 = 0;
                arg1.field2969 = arg1.field2252[0] * 512 + (arg1.method1437((byte) -28) * 256);
                arg1.field2984 = arg1.field2256[0] * 512 + (arg1.method1437((byte) -28) * 256);
                arg1.method1438((byte) 113);
            }
            int var7 = class619.method4554(arg1, false);
            class314.method2499(-127, arg1);
            class443.method3451(arg1, arg0 + 5632, var7, var3, var4);
            class558.method4176(arg1, var3, (byte) 1);
            class150.method1278(arg0 ^ 0xFFFFFDFE, arg1);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9499[18] + arg0 + ',' + (arg1 == null ? field9499[9] : field9499[8]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method4850(Component arg0, int arg1) {
        try {
            field9477++;
            this.method4852((byte) -84);
            this.field9498 = arg0;
            Method var3 = class188.field2480;
            if (var3 != null) {
                try {
                    var3.invoke(this.field9498, Boolean.FALSE);
                } catch (Throwable var5) {
                }
            }
            this.field9498.addKeyListener(this);
            if (arg1 != -12) {
                this.method4848(-61);
            }
            this.field9498.addFocusListener(this);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9499[17] + (arg0 == null ? field9499[9] : field9499[8]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Lm;")
    public final class781 method2605(int arg0) {
        try {
            field9479++;
            if (arg0 >= -65) {
                this.field9496 = null;
            }
            return (class781) this.field9486.method3980(-27119);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9499[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(III)Z")
    public static final boolean method4851(int arg0, int arg1, int arg2) {
        try {
            field9490++;
            if (arg0 != 256) {
                field9474 = null;
            }
            return (arg2 & 0x20) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9499[19] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)V")
    private final void method4852(byte arg0) {
        try {
            field9480++;
            if (this.field9498 != null) {
                this.field9498.removeKeyListener(this);
                this.field9498.removeFocusListener(this);
                this.field9498 = null;
                if (arg0 != -84) {
                    this.field9496 = null;
                }
                for (int var2 = 0; var2 < 112; var2++) {
                    this.field9497[var2] = false;
                }
                this.field9486.method3982(-119);
                this.field9496.method3982(-126);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9499[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)V")
    public final synchronized void method2602(boolean arg0) {
        try {
            this.field9486.method3982(-120);
            if (arg0) {
                field9487++;
                for (class450 var2 = (class450) this.field9496.method3980(-27119); var2 != null; var2 = (class450) this.field9496.method3980(-27119)) {
                    var2.field6594 = this.method4848(2);
                    if (var2.field6609 == 0) {
                        if (!this.field9497[var2.field6608]) {
                            class450 var3 = new class450();
                            var3.field6606 = '\u0000';
                            var3.field6593 = var2.field6593;
                            var3.field6609 = 0;
                            var3.field6594 = var2.field6594;
                            var3.field6608 = var2.field6608;
                            this.field9486.method3984(var3, 0);
                            this.field9497[var2.field6608] = true;
                        }
                        var2.field6609 = 2;
                        this.field9486.method3984(var2, 0);
                    } else if (var2.field6609 == 1) {
                        if (this.field9497[var2.field6608]) {
                            this.field9486.method3984(var2, 0);
                            this.field9497[var2.field6608] = false;
                        }
                    } else if (var2.field6609 == -1) {
                        for (int var4 = 0; var4 < 112; var4++) {
                            if (this.field9497[var4]) {
                                class450 var5 = new class450();
                                var5.field6606 = '\u0000';
                                var5.field6593 = var2.field6593;
                                var5.field6609 = 1;
                                var5.field6594 = var2.field6594;
                                var5.field6608 = var4;
                                this.field9486.method3984(var5, 0);
                                this.field9497[var4] = false;
                            }
                        }
                    } else if (var2.field6609 == 3) {
                        this.field9486.method3984(var2, 0);
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9499[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
    public static void method4853(int arg0) {
        try {
            if (arg0 != -5) {
                method4853(56);
            }
            field9494 = null;
            field9474 = null;
            field9493 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9499[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)V")
    public static final void method4854(int arg0) {
        try {
            field9488++;
            class751.field10694 = 0;
            class476 var1 = class60.field916.field11099;
            int var2 = var1.method5103((byte) 85);
            int var3 = var1.method5103((byte) 57);
            int var4 = var1.method5119(82);
            boolean var5 = var1.method5134(arg0 - 1236972588) == 1;
            class76.method772((byte) -111);
            class185.method1525(-8011, var4);
            int var6 = (class60.field916.field11105 - var1.field9945) / 16;
            class20.field255 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    class20.field255[var7][var8] = var1.method5113(18443);
                }
            }
            class796.field11577 = new byte[var6][];
            class136.field1754 = new int[var6];
            class385.field5630 = new byte[var6][];
            class250.field3572 = new int[var6];
            class125.field1576 = new byte[var6][];
            class259.field3688 = null;
            class359.field5217 = new int[var6];
            class693.field9685 = new int[var6];
            class686.field9614 = new byte[var6][];
            class521.field7608 = new int[var6];
            class753.field10768 = null;
            int var9 = 0;
            for (int var10 = (var3 - (class625.field8929 >> 4)) / 8; var10 <= ((class625.field8929 >> 4) + var3) / 8; var10++) {
                for (int var11 = (var2 - (class14.field187 >> 4)) / 8; var11 <= ((class14.field187 >> 4) + var2) / 8; var11++) {
                    class136.field1754[var9] = (var10 << 8) + var11;
                    class250.field3572[var9] = class203.field2987.method502("m" + var10 + "_" + var11, (byte) -124);
                    class521.field7608[var9] = class203.field2987.method502("l" + var10 + "_" + var11, (byte) -110);
                    class693.field9685[var9] = class203.field2987.method502(field9499[7] + var10 + "_" + var11, (byte) -103);
                    class359.field5217[var9] = class203.field2987.method502(field9499[6] + var10 + "_" + var11, (byte) -112);
                    var9++;
                }
            }
            if (arg0 != 1236953956) {
                field9474 = null;
            }
            class555.method4155(12, var5, var2, var3, arg0 ^ 0xB645949F);
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field9499[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        try {
            field9489++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9499[16] + (arg0 == null ? field9499[9] : field9499[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IZ)Z")
    public final boolean method2604(int arg0, boolean arg1) {
        try {
            if (!arg1) {
                method4854(-58);
            }
            field9481++;
            return arg0 >= 0 && arg0 < 112 ? this.field9497[arg0] : false;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9499[22] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
    private final void method4855(KeyEvent arg0, int arg1, int arg2) {
        try {
            field9476++;
            int var4 = arg0.getKeyCode();
            int var5;
            if (var4 == 0) {
                var5 = 0;
            } else if (var4 >= 0 && var4 < class432.field6268.length) {
                int var6 = class432.field6268[var4];
                if (arg1 == 0 && (var6 & 0x80) != 0) {
                    var5 = 0;
                } else {
                    var5 = var6 & 0xFFFFFF7F;
                }
            } else {
                var5 = 0;
            }
            if (arg2 != var5) {
                this.method4856('\u0000', (byte) 94, var5, arg1);
                arg0.consume();
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field9499[12] + (arg0 == null ? field9499[9] : field9499[8]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)V")
    public final void method2603(byte arg0) {
        try {
            field9484++;
            this.method4852((byte) -84);
            if (arg0 != -104) {
                this.field9498 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9499[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(CBII)V")
    private final void method4856(char arg0, byte arg1, int arg2, int arg3) {
        try {
            field9495++;
            class450 var5 = new class450();
            var5.field6608 = arg2;
            var5.field6609 = arg3;
            if (arg1 < 84) {
                method4853(-25);
            }
            var5.field6606 = arg0;
            var5.field6593 = class614.method4531(-48);
            this.field9496.method3984(var5, 0);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9499[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        try {
            field9491++;
            this.method4855(arg0, 1, 0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9499[10] + (arg0 == null ? field9499[9] : field9499[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class677(Component arg0) {
        try {
            class251.method2042(-96);
            this.method4850(arg0, -12);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9499[20] + (arg0 == null ? field9499[9] : field9499[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4857(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x67);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4858(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
