import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class365 extends class336 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Lld;")
    private class105 field5011 = new class105();

    @OriginalMember(owner = "client!k", name = "N", descriptor = "Lld;")
    private class105 field5035 = new class105();

    @OriginalMember(owner = "client!k", name = "O", descriptor = "Z")
    private boolean field5036;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field5024 = 0;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    private int field5008;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    private int field5019;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    private int field5030;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "I")
    private int field5032;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "I")
    private int field5033;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    private int field5034;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "Lr;")
    public static class110 field5028;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "Ljava/awt/Component;")
    private Component field5037;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V", line = 3)
    public final void method1924(int arg0) {
        this.method2232((byte) 117);
        field5005++;
        if (arg0 > -41) {
            this.method1923(-83);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V", line = 15)
    private final void method2225(int arg0, MouseEvent arg1) {
        this.field5033 = arg1.getX();
        field5012++;
        this.field5032 = arg1.getY();
        if (arg0 != -1) {
            this.field5011 = null;
        }
        if (this.field5036) {
            this.method2228(-1, -93, arg1.getX(), arg1.getY());
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BLmr;)V", line = 38)
    public static final void method2226(byte arg0, class86 arg1) {
        arg1.field1116 = false;
        field5016++;
        if (arg1.field1122 != -1) {
            class181 var2 = class395.field5477.method266(arg0 ^ 0xFFFFC13D, arg1.field1122);
            if (var2 == null || var2.field2468 == null) {
                arg1.field1111 = false;
                arg1.field1122 = -1;
            } else {
                label300: {
                    arg1.field1177++;
                    if (var2.field2468.length > arg1.field1172 && arg1.field1177 > var2.field2466[arg1.field1172]) {
                        arg1.field1172++;
                        arg1.field1133++;
                        arg1.field1177 = 1;
                        class402.method2437(var2, class233.field3103 == arg1, arg1.field6502, 66, arg1.field6501, arg1.field6507, arg1.field1172);
                    }
                    if (var2.field2468.length <= arg1.field1172) {
                        arg1.field1172 = 0;
                        arg1.field1177 = 0;
                        if (arg1.field1111) {
                            arg1.field1122 = arg1.method549(-126).method1585((byte) -43);
                            if (arg1.field1122 == -1) {
                                arg1.field1111 = false;
                                break label300;
                            }
                            var2 = class395.field5477.method266(16107, arg1.field1122);
                        }
                        class402.method2437(var2, class233.field3103 == arg1, arg1.field6502, 112, arg1.field6501, arg1.field6507, arg1.field1172);
                    }
                    arg1.field1133 = arg1.field1172 + 1;
                    if (var2.field2468.length <= arg1.field1133) {
                        arg1.field1133 = 0;
                    }
                }
            }
        }
        if (arg1.field1134 != -1 && arg1.field1135 <= class70.field968) {
            class248 var3 = class302.field4030.method1394(arg1.field1134, arg0 - 7248);
            int var4 = var3.field3310;
            if (var4 == -1) {
                arg1.field1134 = -1;
            } else {
                label302: {
                    class181 var5 = class395.field5477.method266(16107, var4);
                    if (var3.field3305) {
                        if (var5.field2476 == 3) {
                            if (arg1.field1202 > 0 && arg1.field1167 <= class70.field968 && arg1.field1120 < class70.field968) {
                                arg1.field1134 = -1;
                                break label302;
                            }
                        } else if (var5.field2476 == 1 && arg1.field1202 > 0 && class70.field968 >= arg1.field1167 && class70.field968 > arg1.field1120) {
                            arg1.field1135 = class70.field968 + 1;
                            break label302;
                        }
                    }
                    if (var5 == null || var5.field2468 == null) {
                        arg1.field1134 = -1;
                    } else {
                        if (arg1.field1118 < 0) {
                            arg1.field1118 = 0;
                            class402.method2437(var5, class233.field3103 == arg1, arg1.field6502, -107, arg1.field6501, arg1.field6507, 0);
                        }
                        arg1.field1165++;
                        if (arg1.field1118 < var5.field2468.length && var5.field2466[arg1.field1118] < arg1.field1165) {
                            arg1.field1165 = 1;
                            arg1.field1118++;
                            class402.method2437(var5, class233.field3103 == arg1, arg1.field6502, 109, arg1.field6501, arg1.field6507, arg1.field1118);
                        }
                        if (var5.field2468.length <= arg1.field1118) {
                            if (var3.field3305) {
                                arg1.field1118 -= var5.field2481;
                                arg1.field1144++;
                                if (arg1.field1144 >= var5.field2473) {
                                    arg1.field1134 = -1;
                                } else if (arg1.field1118 >= 0 && var5.field2468.length > arg1.field1118) {
                                    class402.method2437(var5, class233.field3103 == arg1, arg1.field6502, 9, arg1.field6501, arg1.field6507, arg1.field1118);
                                } else {
                                    arg1.field1134 = -1;
                                }
                            } else {
                                arg1.field1134 = -1;
                            }
                        }
                        arg1.field1155 = arg1.field1118 + 1;
                        if (arg1.field1155 >= var5.field2468.length) {
                            if (var3.field3305) {
                                arg1.field1155 -= var5.field2481;
                                if ((arg1.field1144 + 1) >= var5.field2473) {
                                    arg1.field1155 = -1;
                                } else if (arg1.field1155 < 0 || var5.field2468.length <= arg1.field1155) {
                                    arg1.field1155 = -1;
                                }
                            } else {
                                arg1.field1155 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field1137 != -1 && arg1.field1130 <= 1) {
            class181 var6 = class395.field5477.method266(16107, arg1.field1137);
            if (var6.field2476 == 3) {
                if (arg1.field1202 > 0 && arg1.field1167 <= class70.field968 && class70.field968 > arg1.field1120) {
                    arg1.field1137 = -1;
                }
            } else if (var6.field2476 == 1 && arg1.field1202 > 0 && arg1.field1167 <= class70.field968 && class70.field968 > arg1.field1120) {
                arg1.field1130 = 2;
            }
        }
        if (arg1.field1137 != -1 && arg1.field1130 == 0) {
            class181 var7 = class395.field5477.method266(16107, arg1.field1137);
            if (var7 == null || var7.field2468 == null) {
                arg1.field1137 = -1;
            } else {
                arg1.field1169++;
                if (var7.field2468.length > arg1.field1150 && var7.field2466[arg1.field1150] < arg1.field1169) {
                    arg1.field1169 = 1;
                    arg1.field1150++;
                    class402.method2437(var7, class233.field3103 == arg1, arg1.field6502, arg0 ^ 0xFFFFFFF7, arg1.field6501, arg1.field6507, arg1.field1150);
                }
                if (arg1.field1150 >= var7.field2468.length) {
                    arg1.field1138++;
                    arg1.field1150 -= var7.field2481;
                    if (arg1.field1138 >= var7.field2473) {
                        arg1.field1137 = -1;
                    } else if (arg1.field1150 >= 0 && var7.field2468.length > arg1.field1150) {
                        class402.method2437(var7, class233.field3103 == arg1, arg1.field6502, -109, arg1.field6501, arg1.field6507, arg1.field1150);
                    } else {
                        arg1.field1137 = -1;
                    }
                }
                arg1.field1132 = arg1.field1150 + 1;
                if (var7.field2468.length <= arg1.field1132) {
                    arg1.field1132 -= var7.field2481;
                    if ((arg1.field1138 + 1) >= var7.field2473) {
                        arg1.field1132 = -1;
                    } else if (arg1.field1132 < 0 || var7.field2468.length <= arg1.field1132) {
                        arg1.field1132 = -1;
                    }
                }
                arg1.field1116 = var7.field2482;
            }
        }
        if (arg1.field1130 > 0) {
            arg1.field1130--;
        }
        int var8 = 0;
        if (arg0 != -42) {
            field5028 = null;
        }
        while (var8 < arg1.field1127.length) {
            class298 var9 = arg1.field1127[var8];
            if (var9 != null) {
                if (var9.field3992 > 0) {
                    var9.field3992--;
                } else {
                    class181 var10 = class395.field5477.method266(arg0 + 16149, var9.field3987);
                    if (var10 == null || var10.field2468 == null) {
                        arg1.field1127[var8] = null;
                    } else {
                        var9.field3988++;
                        if (var9.field3991 < var10.field2468.length && var10.field2466[var9.field3991] < var9.field3988) {
                            var9.field3988 = 1;
                            var9.field3991++;
                            class402.method2437(var10, class233.field3103 == arg1, arg1.field6502, -117, arg1.field6501, arg1.field6507, var9.field3991);
                        }
                        if (var9.field3991 >= var10.field2468.length) {
                            var9.field3989++;
                            var9.field3991 -= var10.field2481;
                            if (var9.field3989 >= var10.field2473) {
                                arg1.field1127[var8] = null;
                            } else if (var9.field3991 >= 0 && var9.field3991 < var10.field2468.length) {
                                class402.method2437(var10, class233.field3103 == arg1, arg1.field6502, 84, arg1.field6501, arg1.field6507, var9.field3991);
                            } else {
                                arg1.field1127[var8] = null;
                            }
                        }
                        var9.field3990 = var9.field3991 + 1;
                        if (var9.field3990 >= var10.field2468.length) {
                            var9.field3990 -= var10.field2481;
                            if (var10.field2473 <= (var9.field3989 + 1)) {
                                var9.field3990 = -1;
                            } else if (var9.field3990 < 0 || var9.field3990 >= var10.field2468.length) {
                                var9.field3990 = -1;
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lhc;IIII)V", line = 355)
    public static final void method2227(class84 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class375.method2307(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class143.field2058) {
            class375.method2307(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class375.method2307(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class91.field1344) {
            class375.method2307(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class91.field1344) {
            class375.method2307(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class143.field2058 && arg4 <= class91.field1344) {
            class375.method2307(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class375.method2307(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class143.field2058 && arg4 > 0) {
            class375.method2307(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!k", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 407)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5010++;
        this.method2225(-1, arg0);
    }

    @OriginalMember(owner = "client!k", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 415)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field5022++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)V", line = 425)
    private final void method2228(int arg0, int arg1, int arg2, int arg3) {
        field5014++;
        class276 var5 = new class276();
        var5.field3655 = arg2;
        var5.field3647 = arg0;
        var5.field3650 = arg3;
        var5.field3646 = class440.method2583(25267);
        if (arg1 > -55) {
            method2233(-46, -25);
        }
        this.field5035.method641(var5, (byte) -93);
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V", line = 444)
    public static void method2229(byte arg0) {
        field5028 = null;
        if (arg0 != -64) {
            method2233(101, -3);
        }
    }

    @OriginalMember(owner = "client!k", name = "h", descriptor = "(I)I", line = 454)
    public final int method1925(int arg0) {
        field5021++;
        if (arg0 != 50) {
            this.field5030 = -28;
        }
        return this.field5008;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(B)Z", line = 466)
    public final boolean method1921(byte arg0) {
        field5018++;
        if (arg0 < 100) {
            this.field5011 = null;
        }
        return (this.field5019 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)I", line = 479)
    public final int method1916(byte arg0) {
        if (arg0 != -21) {
            field5028 = null;
        }
        field5031++;
        return this.field5030;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 492)
    private final void method2230(Component arg0, int arg1) {
        this.method2232((byte) 31);
        if (arg1 <= 34) {
            this.field5011 = null;
        }
        field5006++;
        this.field5037 = arg0;
        this.field5037.addMouseListener(this);
        this.field5037.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!k", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 506)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2225(-1, arg0);
        field5017++;
    }

    @OriginalMember(owner = "client!k", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 514)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field5009++;
        this.field5032 = -1;
        this.field5033 = -1;
    }

    @OriginalMember(owner = "client!k", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 529)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2225(-1, arg0);
        field5023++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 537)
    private final int method2231(MouseEvent arg0, int arg1) {
        field5015++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else {
            int var7 = 58 % ((24 - arg1) / 35);
            if (var5) {
                return 2;
            } else if (var6) {
                return 4;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 573)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5004++;
        int var2 = this.method2231(arg0, 121);
        if ((this.field5034 & var2) == 0) {
            var2 = this.field5034;
        }
        if ((var2 & 0x1) != 0) {
            this.method2228(3, -90, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method2228(5, -91, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method2228(4, -111, arg0.getX(), arg0.getY());
        }
        this.field5034 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(B)V", line = 600)
    private final void method2232(byte arg0) {
        field5025++;
        if (this.field5037 == null) {
            return;
        }
        this.field5037.removeMouseListener(this);
        if (arg0 < 7) {
            field5028 = null;
        }
        this.field5037.removeMouseMotionListener(this);
        this.field5035 = null;
        this.field5037 = null;
        this.field5030 = this.field5008 = this.field5019 = 0;
        this.field5011 = null;
        this.field5033 = this.field5032 = this.field5034 = 0;
    }

    @OriginalMember(owner = "client!k", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 626)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5007++;
        int var2 = this.method2231(arg0, -124);
        if (var2 == 1) {
            this.method2228(0, -78, arg0.getX(), arg0.getY());
        } else if (var2 == 4) {
            this.method2228(2, -71, arg0.getX(), arg0.getY());
        } else if (var2 == 2) {
            this.method2228(1, -117, arg0.getX(), arg0.getY());
        }
        this.field5034 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Z", line = 655)
    public final boolean method1915(int arg0) {
        field5029++;
        if (arg0 != -25217) {
            this.field5037 = null;
        }
        return (this.field5019 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 668)
    public final synchronized void method1919(int arg0) {
        if (arg0 != -31663) {
            this.method1921((byte) 39);
        }
        this.field5008 = this.field5032;
        field5027++;
        this.field5030 = this.field5033;
        this.field5019 = this.field5034;
        class105 var2 = this.field5011;
        this.field5011 = this.field5035;
        this.field5035 = var2;
        this.field5035.method645(0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V", line = 692)
    public static final void method2233(int arg0, int arg1) {
        if (arg0 != 5) {
            field5028 = null;
        }
        field5020++;
        class106 var2 = class250.method1400(8, 94, arg1);
        var2.method659(76);
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)Z", line = 709)
    public final boolean method1923(int arg0) {
        field5026++;
        if (arg0 == 100) {
            return (this.field5019 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)Llm;", line = 724)
    public final class317 method1920(int arg0) {
        field5013++;
        if (arg0 != 100) {
            this.field5008 = 19;
        }
        return (class317) this.field5011.method650((byte) -3);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 747)
    public class365(Component arg0, boolean arg1) {
        this.method2230(arg0, 112);
        this.field5036 = arg1;
    }
}
